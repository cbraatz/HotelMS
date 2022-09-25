
import Hiber1.Cabcompra;
import Hiber1.Detcompra;
import Hiber1.NewHibernateUtil;
import Hiber1.Proveedor;
import Hiber1.Stockyserv;
import Hiber1.Varios;
import Soporte.ConversionCientifica;
import Soporte.clasesutiles;
import imp.CompraGest;
import imp.ProvGest;
import imp.StockGest;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FrmCompra extends javax.swing.JDialog {
    CompraGest comges=new CompraGest();
    StockGest stoges=new StockGest();
    ProvGest proges=new ProvGest();
    Cabcompra cabcom=new Cabcompra();
    Detcompra detcom=new Detcompra();
    Proveedor prov=new Proveedor();
    Stockyserv sto=new Stockyserv();
    Session Sesion=null;
    ConversionCientifica conv=new ConversionCientifica();
   // Session Sesion2=null;
   // Session Sesion3=null;
    MiDefaultTableModel modelo1 = new MiDefaultTableModel();
    MiDefaultTableModel modelo3 = new MiDefaultTableModel();  //para la grilla 1 cuando el campo busqueda esta vacio, para mostrar todos los elem de stock
    MiDefaultTableModel modelo2 = new MiDefaultTableModel();   //para la grilla
    //float xiva;
    boolean edicion=false;         //si se encuentra en modo de edicion de la grilla2
    boolean cabencontrada2=false; //guarda si se encontro la cabecera en caso de que se modifique el numero de factura, para que se sepa si el anterior fue encontrado
    int fila=0;         //guarda la posicion del elemento que se selecciona en grilla2
    String fechadehoy="";
    boolean prodencontrado=false;
    boolean cabencontrada=false;
    boolean detencontrado=false;
    boolean provencontrado=false;
    Varios varios=new Varios();
    boolean editar=false;  //si se selecciono que se desea editar el numero de factura y/o el proveedor
    int lon2=0;  //en el metodo actualizarstock guarda la cantidad de detalles que corresponden a la cabecera, se usa luego para saber si hay que borrar en detalle para cuargar nuevos
    clasesutiles cluti=new clasesutiles();   //instancio clasesutiles que contiene funciones para conversion de fechas y demas
    int codigocabcompra=0;   //esto guarda el id de la cabecera, que no es lo mismo que el numero de factura
    ///////////////para la busqueda interactiva proveedor///////////////////////////////
    int xxx=0;
    int lo=0;
    int co=0;
    String de="";
    boolean z=false;
    boolean cambiobusqueda=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
    DefaultTableModel mimodelo = new DefaultTableModel();
    /////////////////////////////////////////////////////////////////////////////////////
    public FrmCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Datos del Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Iteractiva del Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel13.setText("Descripción:");

        jTextField12.setBackground(new java.awt.Color(153, 153, 153));
        jTextField12.setToolTipText("BÚSQUEDA INTERACTIVA DEL PROVEEDOR");
        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField12FocusLost(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel13))
        );

        jTextField7.setBackground(new java.awt.Color(153, 153, 255));
        jTextField7.setToolTipText("CODIGO DEL PROVEEDOR");
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(240, 240, 240));
        jTextField8.setToolTipText("NOMBRE DEL PROVEEDOR");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Nombre:");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Código:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Datos de la Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTextField6.setBackground(new java.awt.Color(153, 153, 255));
        jTextField6.setToolTipText("NÚMERO DE FACTURA DE COMPRA");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setToolTipText("FECHA DE LA COMPRA");
        jFormattedTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusLost(evt);
            }
        });
        jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyReleased(evt);
            }
        });

        jTextField10.setText("0.0");
        jTextField10.setToolTipText("DESCUENTO APLICADO SOBRE EL TOTAL DE LA FACTURA (si es negativo se considera como aumento)");
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField10FocusLost(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("NºFactura:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Fecha:");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Descuento:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Datos del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Iteractiva del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel6.setText("Descripción:");

        jTextField9.setBackground(new java.awt.Color(153, 153, 153));
        jTextField9.setToolTipText("BÚSQUEDA INTERACTIVA DEL PRODUCTO");
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6))
        );

        jTextField1.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("CÓDIGO DEL PRODUCTO");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField4.setText("0.0");
        jTextField4.setToolTipText("CANTIDAD COMPRADA");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField5.setText("0.0");
        jTextField5.setToolTipText("PRECIO DE COMPRA");
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/build.gif"))); // NOI18N
        jButton1.setToolTipText("AGREGAR AL DETALLE DE COMPRA");
        jButton1.setEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Cantidad:");

        jTextField2.setBackground(new java.awt.Color(240, 240, 240));
        jTextField2.setToolTipText("DESCRIPCIÓN DEL PRODUCTO");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Precio:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stop.gif"))); // NOI18N
        jButton2.setToolTipText("ELIMINAR DEL DETALLE DE COMPRA");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton4.setText("Registrar Productos");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(16, 16, 16))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        jTextField11.setToolTipText("OBSERVACIONES DE LA COMPRA");
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        jButton3.setToolTipText("GUARDAR COMPRA (ésto aumentará el stock de estos productos automáticamente)");
        jButton3.setEnabled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar2.png"))); // NOI18N
        jButton7.setToolTipText("BORRAR COMPRA (ésto vuelve a descontar del stock los productos comprados)");
        jButton7.setEnabled(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir2.png"))); // NOI18N
        jButton9.setToolTipText("SALIR");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Obs.:");

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField13.setForeground(new java.awt.Color(255, 0, 0));
        jTextField13.setText("0.0");
        jTextField13.setToolTipText("DESCUENTO APLICADO SOBRE EL TOTAL DE LA FACTURA (si es negativo se considera como aumento)");
        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField13FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField13FocusLost(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Subtotal IVA:");

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField14.setForeground(new java.awt.Color(255, 0, 0));
        jTextField14.setText("0.0");
        jTextField14.setToolTipText("DESCUENTO APLICADO SOBRE EL TOTAL DE LA FACTURA (si es negativo se considera como aumento)");
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField14FocusLost(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("Subtotal Gral.:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11)))
                .addGap(117, 117, 117)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9)
                    .addComponent(jButton7)
                    .addComponent(jButton3)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setToolTipText("");
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 153));
        jCheckBox1.setText("Pago al contado");
        jCheckBox1.setToolTipText("SI EL PAGO DE LA COMPRA SE REALIZÓ AL CONTADO. Esto no permite ser editado, en caso de haber cargado erróneamente, favor borrar la compra y cargar una nueva");

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 153));
        jCheckBox2.setText("Modificar el precio de los productos en stock automáticamente");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jCheckBox2)
                .addGap(29, 29, 29))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Compra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel5)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void actualizarFechaDeHoy(){
        fechadehoy=cluti.Date_StringDMA(clasesutiles.Calender_Date(Calendar.getInstance()));
    }
    public void LimpiarCampos(){
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField4.setText("0.0");
       jTextField5.setText("0.0");
       jTextField9.setText("");
       modelo1=modelo3;
       this.jTable1.setModel(modelo1);
    }
    public void LimpiarCampos2(){
       jTextField7.setText("");
       jTextField8.setText("");
       jTextField12.setText("");
       jButton1.setEnabled(false);
       jButton3.setEnabled(false);
    }

    public void LimpiarCampos3(){
       jTextField6.setText("");
       jFormattedTextField1.setText("");
       jTextField10.setText("0.0");
       jButton1.setEnabled(false);
       jButton3.setEnabled(false);
    }
   /* public void CERRARSesion(){
        if(Sesion.isOpen()){
            Sesion.flush();
            Sesion.clear();
            Sesion.close();
        }
    }*/
    class MiDefaultTableModel extends DefaultTableModel {   //esta clase hace que ninguna columna de jtable sea editable
        public MiDefaultTableModel() {
            super();
        }
        public boolean isCellEditable(int row, int col) {
            return false;
        }
   }

   public void LimpiarModelo2(){
      int tam=modelo2.getRowCount();
      if (tam>0){
          for(int f=(tam-1);f>=0;f--){
              modelo2.removeRow(f);
          }
          jTable2.setModel(modelo2);
          actualizarTotales();
      }
   }

   public String ObtenerFechaSinGuion(String ff){  //saca el guion a la fecha, se usa para cargar el jformatedtextfield
        String strres="";
        try{
            StringTokenizer tok = new StringTokenizer(ff,"-");
            String s1 = tok.nextToken();
            String s2 = tok.nextToken();
            String s3 = tok.nextToken();
            strres=s3+s2+s1;

        }
        catch(NoSuchElementException e2){
            strres= "";
        }
        finally{
            return strres;
        }
   }

   public void CargarTabla2(int cod, String des, float can, float pre, float xiv){
        Object [] filaa = new Object[7]; // Hay siete columnas en la tabla
        filaa[0] = cod;    //codigo
        filaa[1] = des;     //descripcion
        filaa[2] = can;     //cantidad
        filaa[3] = pre;     //precio
        filaa[4] = xiv;     //% iva
        filaa[5] = (pre*can);     //subtotal
        filaa[6] = (pre*can*xiv)/(100+xiv);     //subtotal iva
        modelo2.addRow(filaa);// Se añade al modelo la fila completa.
        this.jTable2.setModel(modelo2);
   }

   public void EditarTabla2(int fii, float can, float pre, float xiv){

        modelo2.setValueAt(can, fii, 2);
        modelo2.setValueAt(pre, fii, 3);
        modelo2.setValueAt(pre*can, fii, 5);
        modelo2.setValueAt((pre*can*xiv)/(100+xiv), fii, 6);
        this.jTable2.setModel(modelo2);
   }
   public boolean ActualizarStock(){
        int resu=0;
        try {
            this.varios=(Varios) Sesion.get(Varios.class, 1);
            if(varios!=null){
                Query q= Sesion.createQuery("from Stockyserv as s where s.esservicio = 0");
                if(Sesion.isOpen()==false)
                    System.out.println("cerrado1");
                List l=q.list();
                int s=l.size();
                int cod1=0;
                boolean enc=false;
                float can1tot=0;
                int lon=0;
                float can2=0;
                int cod2=0;
                int cod3=0;
                Stockyserv st=null;
                float can3=0;
                float pre2=0;
                //tx2.commit();
                for(int i=0;i<s;i++){  //recorre stock
                    st=new Stockyserv();
                    st=(Stockyserv) l.get(i);  //obtiene el objeto stock de la tabla
                    enc=false; //si existe el prod o en la grilla o en detalle o en ambos
                    cod1=st.getCodigo();
                    can1tot=st.getExistencia();  //va guardando la sumatoria de cantidades
                    lon=modelo2.getRowCount();
                    can2=0;
                    for(int k=0;k<lon;k++){  //recorre la grilla2
                        cod2=Integer.parseInt(modelo2.getValueAt(k, 0).toString());
                        if(cod1==cod2){
                            can2=Float.parseFloat(modelo2.getValueAt(k, 2).toString());
                            pre2=Float.parseFloat(modelo2.getValueAt(k, 3).toString());
                            enc=true;
                            can1tot=can1tot+can2;
                            k=lon;  //para que no siga recorriendo
                        }
                    }
                    Query qq2= Sesion.createQuery("from Detcompra as d where d.cabcompra = "+cabcom.getIdfacturacompra());
                    if(Sesion.isOpen()==false)
                    System.out.println("cerrado2");
                    List li2=qq2.list();
                    lon2=li2.size();
                    for(int h=0;h<lon2;h++){  //recorre detalle
                        Detcompra dc=(Detcompra)li2.get(h);
                        cod3=dc.getStockyserv().getCodigo();
                        if(cod1==cod3){
                            enc=true;
                            can1tot=can1tot-can3;
                            h=lon2;  //para que no siga recorriendo
                        }
                    }//fin detalle
                    if(enc){ //si este producto esta cargado en la grilla2 o en detalle hay que actualizarlo en stock
                        float preco=this.calcularPrecio(st.getExistencia(), can2, st.getPreciocosto(), pre2);
                        st.setPreciocosto(preco);
                        if(this.jCheckBox2.isSelected())
                            st.setPrecioventa((float)cluti.redondearEnterosHastaLaCentena(preco*((varios.getPoruti()/100)+1)));
                        st.setExistencia(can1tot);
                        Sesion.saveOrUpdate(st);
                        if(Sesion.isOpen()==false)
                            System.out.println("cerrado3");
                    }
                }//fin recorrido stock
            }else
                resu++;
        }catch(HibernateException he1){
            he1.printStackTrace();
              resu++;
        }
        finally{
            if (resu>0){
/*                tx2.rollback();*/
                return false;
            }
            else{
  /*               tx2.commit();*/
                return true;
            }
        }
   }

   public float calcularPrecio(float canexi, float cannue, float preexi, float prenue){
        return Math.round((canexi*preexi)+(cannue*prenue))/(cannue+canexi);
   }

   public boolean esUnFloat(String ss){  //para validar lo que se ingresa en la ventana donde se ingresa el total
        try{
            Float fl=Float.parseFloat(ss);
            return true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"El número ingresado no es un decimal","ERROR",JOptionPane.ERROR_MESSAGE);
            return false;
        }
   }
   public boolean cargarCompras(float totiva, float tot, float desc, Date feccom){
       int rr=0;  //aumenta si se da algun error
       int lon=modelo2.getRowCount();  //guarda la cantidad de filas de la grilla2
       //Date feccom=new Date();
       if(modelo2.getRowCount()>0 && jButton3.isEnabled()==true){
           try {
 /*               Sesion=NewHibernateUtil.getSessionFactory().openSession();*/
              //  tx = Sesion.beginTransaction();
                ///////////////////////ACTUALIZA STOCK/////////////////////////////////
                if(this.ActualizarStock()==false){  //ejecuta
                    rr++;
                }
               /* if(lon2>0){  //hay detalles asociados a esta cabecera que hay que borrar  //estp era para editar pero no hace falta esta funcion
                    if(comges.delTodosDetDeCabCom(cabcom.getIdfacturacompra())==false){
                        rr++;
                        System.out.println("ERROR2");
                    }
                    else
                        System.out.println("Dettalle borrado correctamente");
                }*/
               /* if(comges.ExisteIdEnCabecera(cabcom.getIdfacturacompra())){  //borra la cabecera si existe
                    System.out.println("EXISTE LA CABECERA");
                    //if(comges.delCabCom(cabcom)==false){
                       // rr++;
                      //  System.out.println("ERROR3");
                    //}
                    //else
                    //System.out.println("NO SE PUDO BORRAR LA CABECERA");
                    Sesion=NewHibernateUtil.getSessionFactory().openSession();
                    Sesion.delete(cabcom);  //borro aca la cabecera xq en el metodo no funciona
                }
                else*/

                ///////////////////////////CABECERA///////////////////////////////////////////
                this.cabcom.setDescuento(desc);
                this.cabcom.setFechacom(feccom);
                this.cabcom.setObscom(jTextField11.getText());
                this.cabcom.setTotal(tot);
                this.cabcom.setTotaliva(totiva);
                if(this.jCheckBox1.isSelected())
                    cabcom.setContado('1');
                else
                    cabcom.setContado('0');
                if(comges.addCabCom(cabcom)==false){
                    rr++;
                }
                else{///////////////////////////DETALLE//////////////////////////////
                    int sigcod=comges.getsiguientecodigoDet();
                    for(int k=0;k<lon;k++){  //recorre la grilla2
                        if(sigcod==0){  //error
                            rr++;
                        }
                        else{
                            int cod2=Integer.parseInt(modelo2.getValueAt(k, 0).toString());  //codigo del producto
                            if(stoges.ExisteIdEnTabla(cod2)){
                                sto=stoges.getObjStock();   //obtiene el objeto stock a partir del codigo en grilla
                                float can2=Float.parseFloat(modelo2.getValueAt(k, 2).toString());  //saca los calores de la grilla2
                                float pre2=Float.parseFloat(modelo2.getValueAt(k, 3).toString());
 /*                               Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                Transaction tx=Sesion.beginTransaction();*/
                                Stockyserv st=new Stockyserv();
                                st=(Stockyserv)Sesion.get(Stockyserv.class, sto.getCodigo());
                                if(Sesion.isOpen()==false)
                                    System.out.println("cerrado4");
/*                                tx.commit();*/
                                if(st!=null){
                                    float por2=st.getIva().getPorc();
                                    if(comges.ExisteIdEnCabecera(cabcom.getIdfacturacompra())){
                                        cabcom=comges.getobjCabecera();
                                        detcom=new Detcompra();
                                        detcom.setIddetcom(sigcod+k);
                                        detcom.setCabcompra(cabcom);
                                        detcom.setCantidad(can2);
                                        detcom.setPrecio(pre2);
                                        detcom.setStockyserv(sto);
                                        detcom.setXiva(por2); //agrego aparte por si se cambia el porciva en stock y que esto se mantenga inalterado
                                        if(this.comges.addDetCom(detcom)==false){  //cada vuelta guarda en detalle lo de la grilla2
                                            rr++;
                                            k=lon;  //que no siga dando vueltas sin sentido
                                        }
                                       // Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                       // Sesion.save(detcom);
                                    }
                                }
                            }
                        }
                    }
                }
            } /*catch (ParseException ex1) {
                ex1.printStackTrace();
                rr++;
            }*/ catch (Exception ex2) {
                ex2.printStackTrace();
                rr++;
            }
       }else
           return false;
        if(rr>0){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al procesar el pedido","ERROR",JOptionPane.ERROR_MESSAGE);
            return false;
       }
        else
            return true;
   }

   public void actualizarTotales(){
       float tot=Float.parseFloat("0.0");
       float totiva=Float.parseFloat("0.0");
         for(int i=0; i<modelo2.getRowCount();i++){
            tot=tot+(Float.parseFloat(modelo2.getValueAt(i, 5).toString()));
            totiva=totiva+(Float.parseFloat(modelo2.getValueAt(i, 6).toString()));
         }
       this.jTextField13.setText(this.conv.conversion2(totiva));
       this.jTextField14.setText(this.conv.conversion2(tot));
   }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Transaction txx=null;
        try{                                                        //AL CARGARSE EL FORMULARIO
           //Sesion2=NewHibernateUtil.getSessionFactory().getCurrentSession();
            Sesion=NewHibernateUtil.getSessionFactory().getCurrentSession();
            this.setResizable(false);
            this.setLocationRelativeTo(null);  //centra el objeto en pantalla
          //  setDefaultCloseOperation(0);
            txx=Sesion.beginTransaction();
            Query a=Sesion.createQuery("from Stockyserv as s where s.esservicio = 0");  //busca todos los productos que no sean servicios de stock
            List l= a.list();
            // Bucle para cada resultado en la consulta
            modelo3.addColumn("Código");
            modelo3.addColumn("Descripción");
            LimpiarCampos3();
            for (int i=0;i<l.size();i++){
                Stockyserv st=(Stockyserv)l.get(i);
                // Se crea un array que será una de las filas de la tabla.
                Object [] fil = new Object[2]; // Hay dos columnas en la tabla
                fil[0] = st.getCodigo();
                fil[1] = st.getDescri();
                modelo3.addRow(fil);// Se añade al modelo la fila completa.
            }
            modelo1=modelo3;
            this.jTable1.setModel(modelo1);
            modelo2.addColumn("Código");
            modelo2.addColumn("Descripción");
            modelo2.addColumn("Cantidad");
            modelo2.addColumn("Precio");
            modelo2.addColumn("Porc. IVA");
            modelo2.addColumn("Subtotal");
            modelo2.addColumn("Subtotal IVA");
            this.jTable2.setModel(modelo2);
            jTextField2.setEditable(false);
            jTextField8.setEditable(false);
            this.setResizable(false);
            this.setLocationRelativeTo(null);  //centra el objeto en pantalla
            txx.commit();
        }catch(HibernateException e){txx.rollback();}
    }//GEN-LAST:event_formWindowOpened

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        //BOTON SALIR
        this.dispose();//sale
}//GEN-LAST:event_jButton9MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        int r=0;                                                        //BOTON BORRAR
        int rr=0;
        int can=0;
        int cont=0;
        Transaction tx4=null;
        Transaction tx44=null;
        Transaction tx444=null;
        if (cabencontrada && jTextField6.getText().isEmpty()==false && jButton7.isEnabled()==true){
            r=JOptionPane.showConfirmDialog(null,"¿Desea BORRAR toda la factura?", "CONSULTA", JOptionPane.YES_NO_OPTION);
            if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                try {
                    
                    Query q2=Sesion.createQuery("from Detcompra where cabcompra = "+cabcom.getIdfacturacompra());
                    if(q2.list().isEmpty()==false){  //si se encontro el codigo en detalle
                        int cc=q2.list().size();
                        List l2=q2.list();
                        can=modelo2.getRowCount();
                        for(int i=0;i<can;i++){  //recorre la grilla y controla si se puede borrar
                            int cod=Integer.parseInt(modelo2.getValueAt(i, 0).toString());
                            float cag=Float.parseFloat(modelo2.getValueAt(i, 2).toString());
                            Query q1=Sesion.createQuery("from Stockyserv where codigo = "+Integer.toString(cod));
                            if(q1.list().isEmpty()==false){  //si se encontro el codigo en la tabla stock
                                sto=(Stockyserv) q1.list().get(0);
                                float cat=sto.getExistencia();
                                if(cag>cat)  //si la cantidad en grilla es mayor a la de la tabla de stock, no permitir borrado
                                    cont++;
                            }
                        }
                        if (cont==0){   //si se puede borrar la factura
                            for(int i=0;i<can;i++){  //actualiza stock
                                int cod=Integer.parseInt(modelo2.getValueAt(i, 0).toString());
                                float cag=Float.parseFloat(modelo2.getValueAt(i, 2).toString());
                                Query q=Sesion.createQuery("from Stockyserv where codigo = "+Integer.toString(cod));
                                tx444=Sesion.beginTransaction();
                                if(q.list().isEmpty()==false){  //si se encontro el codigo en la tabla stock
                                    sto=(Stockyserv)q.list().get(0);
                                    float cat=sto.getExistencia();
                                    sto.setExistencia(cat-cag);   //resta lo que hay en tabla de lo de la grilla
                                    Sesion.update(sto);
                                }
                                tx444.commit();

                            }
                            tx4=Sesion.beginTransaction();
                            for(int g=0;g<cc;g++){
                                detcom=(Detcompra) l2.get(g);
                                Sesion.delete(detcom);
                            }
                            tx4.commit();
                        }
                        else
                            JOptionPane.showMessageDialog(null,"No está permitido borrar esta factura","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

                    }                                                   
                    Query qq=Sesion.createQuery("from Cabcompra where idfacturacompra = "+Integer.toString(cabcom.getIdfacturacompra()));
                    if(qq.list().isEmpty()==false){  //si se encontro el codigo en la tabla stock
                      cabcom=(Cabcompra)qq.list().get(0);
                      tx44=Sesion.beginTransaction();
                      Sesion.delete(cabcom);
                      tx44.commit();
                    }
                    else
                       rr++;
                    
                }//frin try
                 catch (HibernateException ex2) {
                     ex2.printStackTrace();
                    rr++;
                }
                finally{
                    if(rr==0){
                        JOptionPane.showMessageDialog(null,"Factura de compra BORRADA correctamente","BORRADO EXITOSO",JOptionPane.INFORMATION_MESSAGE);
                        LimpiarCampos2();
                        LimpiarCampos3();
                        LimpiarModelo2();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar BORRAR la factura de compra","ERROR",JOptionPane.ERROR_MESSAGE);
                       // tx44.rollback();
                        tx4.rollback();
                    }
                }
            }
        }
}//GEN-LAST:event_jButton7MouseClicked

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
                                                                        //TEXTO OBSERVACION - validacion
        if(jTextField2.getText().length()>=60)   //para la validacion
            evt.consume();
}//GEN-LAST:event_jTextField11KeyReleased

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx=Sesion.beginTransaction();
        if(modelo2.getRowCount()>0 && jButton3.isEnabled()==true){
        int rr=0;  //aumenta si se da algun error
        int lon=modelo2.getRowCount();  //guarda la cantidad de filas de la grilla2
        float tot=0;
        float totiva=0;
        float desc=0;
        boolean termino=true;  //si no se cancelo el guardado
        Date feccom=new Date();
            try {
                feccom = cluti.StrDMA_Date(jFormattedTextField1.getText());
            } catch (ParseException ex) {
                ex.printStackTrace();
                termino=false;
                rr++;
                //Logger.getLogger(FrmCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(cabencontrada){
            int xx=JOptionPane.showConfirmDialog(null,"¿Desea editar la fecha de la factura ya cargada?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (xx==0){ //si es si
                this.cabcom.setFechacom(feccom);
                try {
                    comges.editCabCom(cabcom);
                } catch (Exception ex) {
                    ex.printStackTrace();
                   rr++;
                }
            }else
                termino=false;
        }else{
            if(editar==false){
                desc=Float.parseFloat(jTextField10.getText());
                if(lon>0 && this.codigocabcompra>0){ //si se cargo algo a la grilla2 y si se genero un id valido
                    for(int i=0;i<lon;i++){
                        tot=tot+Float.parseFloat(modelo2.getValueAt(i, 5).toString()); //extrae el subtotal de la tabla y le suma a tot
                        totiva=totiva+Float.parseFloat(modelo2.getValueAt(i, 6).toString()); //extrae el subtotal iva de la tabla y le suma a totiva
                    }

                    if(Float.parseFloat(jTextField10.getText())>tot)
                        JOptionPane.showMessageDialog(null,"Descuento no admitido","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    else{
                        tot=java.lang.Math.round(tot-desc);   //le saca el descuento
                        totiva=java.lang.Math.round(totiva);
                        int x=JOptionPane.showConfirmDialog(null,"¿Coinciden los siguientes datos con los de la factura?\nTotal pagado: "+tot+"\nDescuento: "+this.jTextField10.getText()+"\nTotal IVA: "+totiva,"CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if (x==0){ //si es si
                            termino=cargarCompras(totiva,tot,desc, feccom);
                        }else{
                            boolean valido=false;
                            String resul="";
                            do{//hace mientras no sea valido
                                String str = JOptionPane.showInputDialog(null, "Favor ingresar el monto total de la factura:","SOLICITUD", JOptionPane.QUESTION_MESSAGE);
                                if(str != null && str.length()>0){
                                   valido=this.esUnFloat(str);
                                   resul=str;
                                }else{
                                    valido=true;
                                    resul="";
                                }
                            }while(!valido);
                            if(valido && resul.length()>0){
                                float resfl=Float.parseFloat(resul);
                                float des=Float.parseFloat(this.jTextField10.getText());
                                if(resfl>tot)
                                    des=des-(resfl-tot);
                                else
                                    des=des+(tot-resfl);
                                this.jTextField10.setText(des+"");
                                JOptionPane.showMessageDialog(null,"El descuento/aumento fue redefinido, favor intente registrar la compra nuevamente","PETICIÓN",JOptionPane.INFORMATION_MESSAGE);
                            }
                            termino=false;
                        }
                    }
                }
            }else{
                 editar=false;
                 try {
 /*                    Sesion=NewHibernateUtil.getSessionFactory().getCurrentSession();
                     Transaction tx=Sesion.beginTransaction();*/
                     Cabcompra ca=new Cabcompra();
                     ca=(Cabcompra)Sesion.load(Cabcompra.class, codigocabcompra);
                     if(Sesion.isOpen()==false)
                        System.out.println("cerrado5");
                     ca.setProveedor(prov);
                     ca.setFechacom(feccom);
                     ca.setNumfaccom(this.jTextField6.getText());
 /*                    tx.commit();*/
                } catch (HibernateException ex) {
                    ex.printStackTrace();
                   rr++;
                }

            }
        }
        if(rr>0){  //si se dio algun error o se cancelo
            tx.rollback();
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al procesar el pedido","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(termino){
                tx.commit();
                JOptionPane.showMessageDialog(null,"Operación exitosa","AVISO",JOptionPane.INFORMATION_MESSAGE);
                LimpiarCampos2();
                LimpiarCampos3();
                jTextField11.setText("");  //limpia obs
                LimpiarModelo2();
                this.cabencontrada=false;
                this.detcom=null;
                this.cabcom=null;
                this.sto=null;
                this.detencontrado=false;
            }else
                 tx.rollback();
        }
    }
}//GEN-LAST:event_jButton3MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        fila=jTable2.rowAtPoint(evt.getPoint());                 //grilla2
        String codigo=modelo2.getValueAt(fila, 0)+""; //extrae el contenido de la tabla
        String cantidad=modelo2.getValueAt(fila, 2)+"";
        String precio=modelo2.getValueAt(fila, 3)+"";
        jTextField1.setText(codigo);   //completa los cuadros de texto
        jTextField1.requestFocus();
        jTextField1.transferFocus();
        jTextField4.setText(cantidad);
        jTextField5.setText(precio);
}//GEN-LAST:event_jTable2MouseClicked

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
       if(jTextField10.getText().length()>=15)                      //validacion DESCUENTO
            evt.consume();
}//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        // CAMPO DESCUENTO
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField10.transferFocus();
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
        //texto descuento
        if(jTextField10.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField10.getText());
               /* if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField10.setText("0.0");
                    jTextField10.requestFocus();
                }*/
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número decimal incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField10.setText("0.0");
                jTextField10.requestFocus();
            }
        }
        else
            jTextField10.setText("0.0");
}//GEN-LAST:event_jTextField10FocusLost

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        //CAMPO DESCUENTO
        jTextField10.selectAll();
}//GEN-LAST:event_jTextField10FocusGained

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        //nada
}//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // validacion del campo NUMERO FACTURA
        if(jTextField6.getText().length()>=30)
            evt.consume();
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField6.transferFocus();
}//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        Transaction tx5=null;
        int err=0;
        if(jTextField6.getText().isEmpty()==false){ //si no esta vacio    //CAMPO DE TEXTO NUMERO FACTURA
            if(this.provencontrado && jTextField7.getText().isEmpty()==false){
                int c=0;  //almacena el sig codigo
                    cabencontrada=comges.ExisteNumFacEIdProvEnCabecera(jTextField6.getText(), this.prov.getIdprov());
                    if(cabencontrada){  //si existe la cabecera
                        LimpiarModelo2();  //limpia el contenido del modelo2
                        cabencontrada2=true;
                        jButton1.setEnabled(false);
                        jButton3.setEnabled(true);
                        jButton7.setEnabled(true);
                        this.cabcom=comges.getobjCabecera();
                        codigocabcompra=comges.getobjCabecera().getIdfacturacompra();  //carga el id de esta tabla, xq se busco por idprov y el num de fac,
                                                                                        //que no es lo mismo que el id
                        ///////cargar la grilla2/////////////
                        jTextField10.setText(cabcom.getDescuento().toString());
                        if(cabcom.getContado()=='1')
                            this.jCheckBox1.setSelected(true);
                        else
                            this.jCheckBox1.setSelected(false);
                        jFormattedTextField1.setText(ObtenerFechaSinGuion(cabcom.getFechacom().toString()));
                        try{
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            tx5=Sesion.beginTransaction();
                            Query qq=Sesion.createQuery("from Detcompra where cabcompra = "+this.codigocabcompra);
                            List li= qq.list();
                            // Bucle para cada resultado en la consulta
                            for (int i=0;i<li.size();i++){
                                Detcompra d=(Detcompra)li.get(i);
                                float xi=d.getXiva();
                                float ca=d.getCantidad();
                                float pr=d.getPrecio();
                                Object [] fil = new Object[7]; // Se crea un array que será una de las filas de la tabla con siete columnas en la tabla
                                fil[0] = d.getStockyserv().getCodigo();
                                fil[1] = d.getStockyserv().getDescri();
                                fil[2] = ca;
                                fil[3] = pr;
                                fil[4] = xi;
                                fil[5] = ca*pr;
                                fil[6] = (ca*pr*xi)/(100+xi);
                                modelo2.addRow(fil);// Se añade al modelo la fila completa
                            }
                            this.jTable2.setModel(modelo2);
                            tx5.commit();
                            this.actualizarTotales();
                        }
                        catch(HibernateException e){
                            tx5.rollback();
                            e.printStackTrace();
                            err++;
                        }
                       
                    } else{
                        if(cabencontrada2){ //si se encontro y se modifico el numero de doc o el proveedor, para poder editar
                           int x=JOptionPane.showConfirmDialog(null,"¿Desea Cambiar el Número de Factura y/o el Proveedor?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                           if (x==0) //si es si
                               editar=true;
                           else
                               editar=false;
                        }else
                            editar = false;

                        if(editar==false){
                            LimpiarModelo2();  //limpia el contenido del modelo2
                            cabencontrada=false;
                            cabencontrada2=false;
                            jButton3.setEnabled(true);
                            jButton1.setEnabled(true);
                            jButton7.setEnabled(false);
                            this.jTable2.setModel(modelo2);
                            c=this.comges.getsiguientecodigoCab();
                            LimpiarCampos();
                            jFormattedTextField1.setText("");
                            jTextField10.setText("0");
                            if (c>0){
                                cabcom=new Cabcompra();
                                this.codigocabcompra=c;
                                jButton3.setEnabled(true);
                                jButton1.setEnabled(true);
                                this.cabcom.setIdfacturacompra(c);
                                this.cabcom.setNumfaccom(jTextField6.getText());
                                this.cabcom.setProveedor(prov);
                            } else{
                                jTextField6.setText("");
                                this.codigocabcompra=0;
                                jButton3.setEnabled(false);
                                jButton1.setEnabled(false);
                                this.cabcom=null;
                                JOptionPane.showMessageDialog(null,"No se pudo obtener nuevo código para crear una nueva cabecera","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                
            } else
                JOptionPane.showMessageDialog(null,"Favor realizar la búsqueda de Proveedor antes de continuar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            jButton1.setEnabled(false);
            jButton3.setEnabled(false);
        }

}//GEN-LAST:event_jTextField6FocusLost

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int c=modelo2.getRowCount();              // BOTON BORRAR ELEMENTO DE LA GRILLA2
        if(c>0){
            String dee=modelo2.getValueAt(fila, 1).toString();
            int x=JOptionPane.showConfirmDialog(null,"¿Desea quitar "+dee+" de la factura de compra?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(x==0){
                modelo2.removeRow(fila);
            }
        }
        actualizarTotales();
}//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(jTextField1.getText().isEmpty()==false && jButton1.isEnabled()==true){//BOTON AGREGAR
            if(Float.parseFloat(jTextField4.getText())>0 && Float.parseFloat(jTextField5.getText())>0){
                edicion=false;
                int codi=0;
                int codi2=Integer.parseInt(jTextField1.getText());
                int celem=modelo2.getRowCount();
                for(int k=0;k<celem;k++){   //se recorre la tabla para ver si existe el codigo de producto
                    codi=Integer.parseInt(modelo2.getValueAt(k, 0).toString()); //extrae el codigo de la tabla
                    if(codi == codi2){
                        edicion=true;  //entra a modo edicion si el codigo de producto ya existe en la grilla
                        fila=k;
                        k=celem;//para parar el bucle
                    }
                }
                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                Transaction tx=Sesion.beginTransaction();
                Stockyserv st=new Stockyserv();
                st=(Stockyserv)Sesion.get(Stockyserv.class, sto.getCodigo());
                tx.commit();
                if(st!=null){
                    float por=st.getIva().getPorc();
                    if(this.edicion==false){
                        this.CargarTabla2(Integer.parseInt(jTextField1.getText()),jTextField2.getText(),Float.parseFloat(jTextField4.getText()),
                                Float.parseFloat(jTextField5.getText()),por);  //esto carga la tabla
                    } else{
                        this.EditarTabla2(fila,Float.parseFloat(jTextField4.getText()),
                                Float.parseFloat(jTextField5.getText()),por);  //esto edita la tabla

                    }
                }
           //     this.CERRARSesion();
                edicion=false;
                LimpiarCampos();
            } else
                JOptionPane.showMessageDialog(null,"Favor completar los campos Cantidad y Precio antes de continuar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            actualizarTotales();
        } 
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // campo precio
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField5.transferFocus();
}//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        // Texto precio
        if(jTextField5.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField5.getText());
                if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField5.setText("0.0");
                    jTextField5.requestFocus();
                }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número decimal incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField5.setText("0.0");
                jTextField5.requestFocus();
            }
        }
        else
            jTextField5.setText("0.0");
}//GEN-LAST:event_jTextField5FocusLost

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        //campo precio
        jTextField5.selectAll();
}//GEN-LAST:event_jTextField5FocusGained

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{                                                             // GRILLA 1
            int filaa=jTable1.rowAtPoint(evt.getPoint());
            String codigo=modelo1.getValueAt(filaa, 0)+""; //extrae el contenido de la tabla
            jTextField1.setText(codigo);   //completa los cuadros de texto
            jTextField9.requestFocus();    //pide el foco para limpiar
            jTextField9.setText("");
            jTextField9.transferFocus();
            jTextField1.requestFocus();    //pide el foco para salir de nuevo y ejecutar lo que hay en el lost
            jTextField1.transferFocus();
        } catch(ArrayIndexOutOfBoundsException ee){
        }
}//GEN-LAST:event_jTable1MouseClicked

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        //nada
}//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        String texto=jTextField9.getText();    //PARA BUSQUEDA INTERACTIVA
        Transaction tx6=null;
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField9.transferFocus();
        else{
            try{
                texto=texto.toUpperCase();
                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                tx6=Sesion.beginTransaction();
                Query q=Sesion.createQuery("from Stockyserv where esservicio = 0 and (descri like'"+"%" +texto+"%"+ "') ");
                MiDefaultTableModel modelo = new MiDefaultTableModel();
                this.modelo1=modelo;
                modelo.addColumn("Código");
                modelo.addColumn("Descripción");
                List lis= q.list();
                // Bucle para cada resultado en la consulta
                for (int i=0;i<lis.size();i++){
                    Stockyserv s=(Stockyserv)lis.get(i);
                    // Se crea un array que será una de las filas de la tabla.
                    Object [] filaa = new Object[2]; // Hay dos columnas en la tabla
                    filaa[0] = s.getCodigo();
                    filaa[1] = s.getDescri();
                    modelo.addRow(filaa);// Se añade al modelo la fila completa.
                }
                this.jTable1.setModel(modelo1);
                }
            catch(HibernateException ex){tx6.rollback();}
        }
        if(texto.isEmpty())          //si esta vacio, carga todos los elementos de stock a la grilla1
            modelo1=modelo3;
}//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        // BUSQUEDA INTERACTIVA
        if(jTextField9.getText().isEmpty())          //si esta vacio, carga todos los elementos de stock a la grilla1
            modelo1=modelo3;
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        //busq interactiva producto
        jTextField9.selectAll();
}//GEN-LAST:event_jTextField9FocusGained

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
    if(jTextField4.getText().length()>=15)                      //validacion cantidad
            evt.consume();
}//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // campo cantidad
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField4.transferFocus();
}//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if(jTextField4.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField4.getText());
                if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField4.setText("0.0");
                    jTextField4.requestFocus();
                }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número decimal incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField4.setText("0.0");
                jTextField4.requestFocus();
            }
        }
        else
            jTextField4.setText("0.0");
}//GEN-LAST:event_jTextField4FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        //campo cantidad
        jTextField4.selectAll();
}//GEN-LAST:event_jTextField4FocusGained

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        //nada
}//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
//para validar el CAMPO DE TEXTO ID/CODIGO
        boolean esint=Character.isDigit(evt.getKeyChar());   //tira true si el boton presionado es un digito
        if(esint==false){      //si no se ingresa un digito
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField1.transferFocus();
            else
                evt.consume();
        }
}//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
}//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        //CAMPO DE TEXTO ID/CODIGO
        if(jTextField1.getText().isEmpty()==false){
            prodencontrado=stoges.ExisteIdEnTabla(Integer.parseInt(jTextField1.getText()));
            if(prodencontrado){
                jTextField2.setText(stoges.getObjStock().getDescri().toString());
                //xiva=stoges.getObjStock().getPorciva();
                this.sto=stoges.getObjStock();
            } else {
                JOptionPane.showMessageDialog(null,"Código NO encontrado","",JOptionPane.INFORMATION_MESSAGE);
                LimpiarCampos();
                this.sto=null;
            }
            jTextField4.setText("0.0");
            jTextField5.setText("0.0");
        } else{
            LimpiarCampos();
            this.sto=null;
        }
}//GEN-LAST:event_jTextField1FocusLost

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
        String texto=jTextField12.getText();                            //PARA BUSQUEDA INTERACTIVA de proveedor
        cambiobusqueda=true;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        Transaction tx7=null;
        if(((int)evt.getKeyChar()) == 10  && cambiobusqueda==true){ //si se presiono enter
            jTextField12.setText("");
            jTextField7.setText(Integer.toString(co));
            jTextField7.requestFocus();
            jTextField7.transferFocus();
        } else{
            if(evt.getKeyCode()==KeyEvent.VK_UP && lo>0){   //pulso frecha arriba
                if(z==false){
                    xxx=0;
                    z=true;
                } else{
                    xxx++;
                    if(xxx==lo)
                        xxx=0;
                }
                co=Integer.parseInt(mimodelo.getValueAt(xxx, 0).toString());
                de=mimodelo.getValueAt(xxx, 1).toString();
                jTextField12.setText(de);
            } else{
                if(evt.getKeyCode()==KeyEvent.VK_DOWN && lo>0){  //pulso flecha abajo
                    if(lo>0){
                        if(z==false){
                            xxx=0;
                            z=true;
                        } else{
                            xxx--;
                            if(xxx<0)
                                xxx=lo-1;
                        }
                        co=Integer.parseInt(mimodelo.getValueAt(xxx, 0).toString());
                        de=mimodelo.getValueAt(xxx, 1).toString();
                        jTextField12.setText(de);
                    }
                } else{
                    z=false;
                    try{
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tx7=Sesion.beginTransaction();
                        Query qu=Sesion.createQuery("from Proveedor where (nombre like'"+"%" +texto+"%"+ "') ");
                        mimodelo = new DefaultTableModel();
                        mimodelo.addColumn("Código");                                  //AL CARGARSE EL FORMULARIO
                        mimodelo.addColumn("Descripción");
                        List milis= qu.list();
                        Sesion.getTransaction().commit();
                        for (int i=0;i<milis.size();i++){
                            Proveedor pp=(Proveedor)milis.get(i);
                            Object [] ffi = new Object[2]; // Hay dos columnas en la tabla
                            ffi[0] = pp.getIdprov();
                            ffi[1] = pp.getNombre();
                            mimodelo.addRow(ffi);// Se añade al modelo la fila completa.
                        }
                        lo=mimodelo.getRowCount();
                    }
                    catch(HibernateException ex){tx7.rollback();}
                }
            }

        }
}//GEN-LAST:event_jTextField12KeyReleased

    private void jTextField12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusGained
        //busq interactiva proveedor
        jTextField4.selectAll();
        xxx=0;
        lo=0;
        co=0;
        de="";
        z=false;
        cambiobusqueda=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        mimodelo = new DefaultTableModel();
}//GEN-LAST:event_jTextField12FocusGained

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
                                                                    //para validar el CAMPO DE TEXTO ID/CODIGO proveedor
        boolean esint=Character.isDigit(evt.getKeyChar());   //tira true si el boton presionado es un digito
        if(esint==false){      //si no se ingresa un digito
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                //evt.setKeyChar((char)119);
                jTextField7.transferFocus();
            else
                evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased

}//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        //CAMPO DE TEXTO ID/CODIGO PROVEEDOR
        if(jTextField7.getText().isEmpty()==false){  //si no esta vacio
            provencontrado=proges.ExisteIdEnTabla(Integer.parseInt(jTextField7.getText()));
            if(provencontrado){
                jTextField8.setText(proges.getObjProveedor().getNombre());
                this.prov=proges.getObjProveedor();
            } else {
                JOptionPane.showMessageDialog(null,"Código NO encontrado","",JOptionPane.INFORMATION_MESSAGE);
                LimpiarCampos2();
                this.prov=null;
            }
            if(jTextField6.getText().isEmpty()==false){  //si el campo nro factura no esta vacio
                jTextField6.requestFocus();
                jTextField6.transferFocus();                 //hace de nuevo la busqueda de factura
            }
        } else{
            LimpiarCampos();
            this.prov=null;
        }
}//GEN-LAST:event_jTextField7FocusLost

    private void jTextField12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusLost
            jTextField12.setText("");
    }//GEN-LAST:event_jTextField12FocusLost

    private void jFormattedTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusGained

}//GEN-LAST:event_jFormattedTextField1FocusGained

    private void jFormattedTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusLost
        String texto=jFormattedTextField1.getText();                              //cuadro de fecha
        if(texto.equals("  /  /    ")==false){  //si no esta vacio
            if(cluti.FechaValidaDMA(texto)==false){  //si la fecha no es valida
                JOptionPane.showMessageDialog(null,"Fecha NO válida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jFormattedTextField1.setText("");
                jFormattedTextField1.requestFocus();
            }else{
                this.actualizarFechaDeHoy();
                if(cluti.esFecha1MayorALaFecha2(this.jFormattedTextField1.getText(), this.fechadehoy)){  //si la fecha de compra es mayor a la de hoy
                JOptionPane.showMessageDialog(null,"Fecha de compra superior a la actual","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jFormattedTextField1.setText("");
                jFormattedTextField1.requestFocus();
            }

            }
        }
}//GEN-LAST:event_jFormattedTextField1FocusLost

    private void jFormattedTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyReleased
                                                                                // texto fecha
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField1.transferFocus();
}//GEN-LAST:event_jFormattedTextField1KeyReleased

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
       if(jTextField5.getText().length()>=15)                      //validacion PRECIO
            evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        boolean existe=true;
        FrmStock frmstock=null;
        try{
                 frmstock.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmstock.dispose();
            frmstock=new FrmStock((Frame)this.getParent(),true);
            frmstock.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14FocusGained

    private void jTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14FocusLost

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14KeyReleased

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField13KeyReleased

    private void jTextField13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField13FocusLost

    private void jTextField13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusGained
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField13FocusGained

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCompra dialog = new FrmCompra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
