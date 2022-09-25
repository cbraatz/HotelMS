
import Hiber1.Iva;
import Hiber1.NewHibernateUtil;
import Hiber1.Stockyserv;
import Hiber1.Unidadmedida;
import Soporte.clasesutiles;
import imp.CompraGest;
import imp.DescartesGest;
import imp.StockGest;
import imp.SubresxstoyservGest;
import imp.UtilizacionGest;
import imp.VariosGest;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class FrmStock extends javax.swing.JDialog {

    /** Creates new form FrmStock */
    public FrmStock(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Datos del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

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

        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setToolTipText("NOMBRE DEL PRODUCTO");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setText("0.0");
        jTextField3.setToolTipText("PRECIO DE COMPRA DEL PRODUCTO");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setText("0.0");
        jTextField4.setToolTipText("PRECIO DE VENTA DEL PRODUCTO");
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
        jTextField5.setToolTipText("EXISTENCIA EN STOCK DEL PRODUCTO");
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

        jTextField6.setText("0.0");
        jTextField6.setToolTipText("MÍNIMO DE EXISTENCIA DEL PRODUCTO REQUERIDA EN STOCK");
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
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

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 153));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Incluir al Stock para la venta");
        jCheckBox1.setToolTipText("SE DESEA INCLUIRLO A LA LISTA DE PRUDUCTOS EN VENTA");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        jComboBox1.setToolTipText("UNIDAD DE MEDIDA");

        jComboBox2.setToolTipText("UNIDAD DE MEDIDA");
        jComboBox2.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Producto:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Precio de:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Compra:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Venta:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Existencia:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Stock mín.:");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("% IVA:");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("U.M.:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, 0, 173, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBox1, 0, 173, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                .addGap(73, 73, 73))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jCheckBox1)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setName(""); // NOI18N

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar2.png"))); // NOI18N
        jButton8.setToolTipText("LIMPIAR");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo2.png"))); // NOI18N
        jButton5.setToolTipText("NUEVO");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        jButton6.setToolTipText("CONFIRMAR/GUARDAR");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar2.png"))); // NOI18N
        jButton7.setToolTipText("BORRAR");
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(jButton8)
                    .addComponent(jButton7)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        Session Sesion;
        VariosGest varges=new VariosGest();
        Stockyserv sto=new Stockyserv();
        StockGest stoges=new StockGest();  //instanciamos las clases necesarias a lo largo del programa
        boolean encontrado=false;   //guarda si se encontro o no
        SubresxstoyservGest suxstges=new SubresxstoyservGest();
        CompraGest comges=new CompraGest();
        UtilizacionGest utiges=new UtilizacionGest();
        DescartesGest desges=new DescartesGest();
        Unidadmedida um=new Unidadmedida();
        Iva iva=new Iva();
        clasesutiles cluti=new clasesutiles();
        Iva ivapredetermninado=new Iva();
        DefaultComboBoxModel modelocomboum= new DefaultComboBoxModel();   //el segundo modelo uso para guargar el codigo, y asi no mostrarlo en el combo
        DefaultComboBoxModel modelocomboum2= new DefaultComboBoxModel();
        DefaultComboBoxModel modelocomboiva= new DefaultComboBoxModel();   //el segundo modelo uso para guargar el codigo, y asi no mostrarlo en el combo
        DefaultComboBoxModel modelocomboiva2= new DefaultComboBoxModel();
        ///////////////para la busqueda interactiva pais///////////////////////////////
        int xxx=0;  //posicion actual en el modelo
        int lo=0;  //longitud del modelo
        int co=0;
        String de="";
        boolean z=false;
        boolean cambiobusqueda=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        DefaultTableModel mimodelo = new DefaultTableModel();
        /////////////////////////////////////////////////////////////////////////////////////
    public void LimpiarCampos(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("0.0");
        jTextField4.setText("0.0");
        jTextField5.setText("0.0");
        jTextField6.setText("0.0");
        this.ubicarComboIvaEnPosicion(this.ivapredetermninado.getIdiva());
        jCheckBox1.setSelected(true);
        jComboBox2.setEnabled(false);
        jTextField4.setEditable(true);
    }
    public void CERRARSesion(){
        if(Sesion.isOpen()){
            Sesion.flush();
            Sesion.clear();
            Sesion.close();
        }
   }
    public void cargarUm(){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            modelocomboum= new DefaultComboBoxModel();
            modelocomboum2= new DefaultComboBoxModel();
            Query q=Sesion.createQuery("from Unidadmedida order by descripum");
            List lis= q.list();
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    um=new Unidadmedida();
                    um=(Unidadmedida)lis.get(i);
                    modelocomboum.addElement(um.getDescripum());
                    modelocomboum2.addElement(um.getIdum());
                }
            }
            jComboBox1.setModel(modelocomboum);
            tx.commit();
       }
       catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }
     public void ubicarComboUmEnPosicion(int cum){
        int lon=this.modelocomboum.getSize();
        for(int i=0;i<lon;i++){
            int codi=Integer.parseInt(modelocomboum2.getElementAt(i).toString());  //busca el codigo del otro modelo que tiene los codigos
            if(codi==cum)
                this.jComboBox1.setSelectedIndex(i);  //ubica el combo en la posicion correcta
        }
   }

   public int obtenerCodigoActualDeComboUm(){
        int resu=Integer.parseInt(modelocomboum2.getElementAt(jComboBox1.getSelectedIndex()).toString());
        return resu;
   }
   public boolean obtenerObjetoUnidadMedidaDeCombo(){
       boolean resp=false;
       try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx=Sesion.beginTransaction();
            um=new Unidadmedida();
            um=(Unidadmedida)Sesion.get(Unidadmedida.class, obtenerCodigoActualDeComboUm());
            tx.commit();
            this.CERRARSesion();
            if(um!=null)
                resp= true;
            else
                resp= false;
       } catch (HibernateException e) {
           e.printStackTrace();
       }
       return resp;
   }

   public void cargarIva(){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            modelocomboiva= new DefaultComboBoxModel();
            modelocomboiva2= new DefaultComboBoxModel();
            Query q=Sesion.createQuery("from Iva");
            List lis= q.list();
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    iva=new Iva();
                    iva=(Iva)lis.get(i);
                    modelocomboiva.addElement(iva.getPorc());
                    modelocomboiva2.addElement(iva.getIdiva());
                }
            }
            jComboBox2.setModel(modelocomboiva);
            tx.commit();
       }
       catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }
     public void ubicarComboIvaEnPosicion(int ci){
        int lon=this.modelocomboiva.getSize();
        for(int i=0;i<lon;i++){
            int codi=Integer.parseInt(modelocomboiva2.getElementAt(i).toString());  //busca el codigo del otro modelo que tiene los codigos
            if(codi==ci)
                this.jComboBox2.setSelectedIndex(i);  //ubica el combo en la posicion correcta
        }
   }

   public int obtenerCodigoActualDeComboIva(){
        int resu=Integer.parseInt(modelocomboiva2.getElementAt(jComboBox2.getSelectedIndex()).toString());
        return resu;
   }
   public boolean obtenerObjetoIvaDeCombo(){
       boolean resp=false;
       try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx=Sesion.beginTransaction();
            iva=new Iva();
            iva=(Iva)Sesion.get(Iva.class, obtenerCodigoActualDeComboIva());
            tx.commit();
            this.CERRARSesion();
            if(iva!=null)
                resp= true;
            else
                resp= false;
       } catch (HibernateException e) {
           e.printStackTrace();
       }
       return resp;
   }
   public boolean camposValidos(){
        boolean respu=false;
            if(Float.parseFloat(jTextField3.getText())>0){
                if(this.jCheckBox1.isSelected()){
                    if(Float.parseFloat(jTextField4.getText())>=Float.parseFloat(jTextField3.getText()))
                        respu=true;
                    else
                        respu=false;
                }else
                    respu=true;
            }else
                respu=false;
        return respu;

   }
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        int c=0;  //almacena el sig codigo                            //BOTON NUEVO
        c=stoges.getsiguientecodigo();
        LimpiarCampos();
        if (c>0){
            jTextField1.setText(Integer.toString(c));
            jTextField2.requestFocus();
            this.jTextField5.setEditable(true);
        } else{
            LimpiarCampos();
            JOptionPane.showMessageDialog(null,"No se pudo obtener un Código nuevo","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
}//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
                                                                        //BOTON GUARDAR
        Stockyserv st=new Stockyserv();
        this.um=new Unidadmedida();
        this.iva=new Iva();
        boolean encontroum=obtenerObjetoUnidadMedidaDeCombo();
        boolean encontroiva=this.obtenerObjetoIvaDeCombo();
        if(camposValidos()){
            if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || encontroum==false || encontroiva==false){ //si el campo id o descripcion estan vacios
                JOptionPane.showMessageDialog(null,"Campos clave vacíos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                encontrado=false;
            } else{
                encontrado=stoges.ExisteIdEnTabla(Integer.parseInt(jTextField1.getText()));
                int r=0;
                boolean resu=false;
                if (encontrado){  //si se encontro y se desea EDITAR
                    r=JOptionPane.showConfirmDialog(null,"¿Desea EDITAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                    if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                        try {
                            //si se presiono SI
                            st=stoges.getObjStock();
                            st.setDescri(jTextField2.getText().toUpperCase());
                            st.setPreciocosto(Float.parseFloat(jTextField3.getText()));
                            st.setPrecioventa(Float.parseFloat(jTextField4.getText()));
                            //st.setExistencia(Float.parseFloat(jTextField5.getText()));  //no edita la existencia
                            st.setStockmin(Float.parseFloat(jTextField6.getText()));
                            st.setIva(iva);
                            st.setUnidadmedida(um);
                            //st.setEsservicio('0');  //no hace falta editar esto porque no va a cambiar
                            if(this.jCheckBox1.isSelected())
                                st.setParaventa('1');
                            else
                                st.setParaventa('0');
                            resu=stoges.editStock(st);
                            if (resu){  //SI SE EDITO CORRECTAMENTE
                                JOptionPane.showMessageDialog(null,"El registro fue EDITADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                LimpiarCampos();
                            } else{
                                JOptionPane.showMessageDialog(null,"No se pudo EDITAR correctamente el registro","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            }

                        }catch (Exception ex) {
                            JOptionPane.showMessageDialog(null,"Error al intentar EDITAR el registro","ERROR",JOptionPane.ERROR_MESSAGE);
                            LimpiarCampos();
                        }
                    }
                } else{
                    r=JOptionPane.showConfirmDialog(null,"¿Desea AGREGAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                    if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                        try {
                            st.setCodigo(Integer.parseInt(jTextField1.getText()));
                            st.setDescri(jTextField2.getText().toUpperCase());
                            st.setPreciocosto(Float.parseFloat(jTextField3.getText()));
                            st.setPrecioventa(Float.parseFloat(jTextField4.getText()));
                            st.setExistencia(Float.parseFloat(jTextField5.getText()));
                            st.setStockmin(Float.parseFloat(jTextField6.getText()));
                            st.setIva(iva);
                            st.setEsservicio('0');
                            st.setUnidadmedida(um);
                            if(this.jCheckBox1.isSelected())
                                st.setParaventa('1');
                            else
                                st.setParaventa('0');
                            resu=stoges.addStock(st);
                            if (resu){
                                JOptionPane.showMessageDialog(null,"El registro fue CARGADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                LimpiarCampos();
                            } else{
                                JOptionPane.showMessageDialog(null,"No se pudo CARGAR correctamente el registro","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null,"Error al intentar CARGAR el registro","ERROR",JOptionPane.ERROR_MESSAGE);
                            LimpiarCampos();
                        }
                    }
                }
            }
    }else
        JOptionPane.showMessageDialog(null,"El precio de compra/venta no son válidos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        int r=0;                                                     //BOTON BORRAR
        boolean resu=false;
        if(encontrado && jTextField1.getText().isEmpty()==false){
            r=JOptionPane.showConfirmDialog(null,"¿Desea BORRAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
            if(r==JOptionPane.YES_OPTION){ //si se presiono SI
                try{
                    if(comges.ExisteFKStockyserv(Integer.parseInt(jTextField1.getText()))==false && this.suxstges.ExisteFKStockyserv(Integer.parseInt(jTextField1.getText()))==false && this.desges.ExisteFKStockyServ(Integer.parseInt(jTextField1.getText()))==false && this.utiges.ExisteFKStockyserv(Integer.parseInt(jTextField1.getText()))==false){  //si no esta como FK en ninguna de las tablas
                        Stockyserv st=new Stockyserv();
                        st=stoges.getObjStock();
                        resu=stoges.delStock(st);
                        if (resu){  //SI SE EDITO CORRECTAMENTE
                            JOptionPane.showMessageDialog(null,"El registro fue BORRADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            LimpiarCampos();
                        }else{
                            JOptionPane.showMessageDialog(null,"No se pudo BORRAR correctamente el registro","AVISO",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"No se pudo BORRAR el registro porque está siendo utilizado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null,"Error al intentar BORRAR el registro","ERROR",JOptionPane.ERROR_MESSAGE);
                    //ya tira el error en bancogest
                    LimpiarCampos();
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Favor seleccionar un elemento a borrar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
}//GEN-LAST:event_jButton7MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
                                                                        //BOTON SALIR
        this.dispose();//sale
}//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        //BOTON LIMPIAR
        LimpiarCampos();
}//GEN-LAST:event_jButton8MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setResizable(false);                                    //AL CARGARSE EL FORMULARIO
        this.setLocationRelativeTo(null);  //centra el objeto en pantalla
       // setDefaultCloseOperation(0);
       // Sesion=NewHibernateUtil.getSessionFactory().getCurrentSession(); //esto no se necesita hacer aca, se puede hacer en el principal
        this.ivapredetermninado=varges.getIva();
        this.cargarUm();
        this.cargarIva();
    }//GEN-LAST:event_formWindowOpened

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if(jTextField2.getText().length()>=30)   //para la validacion
            evt.consume();
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
            encontrado=stoges.ExisteIdProductoEnTabla(Integer.parseInt(jTextField1.getText()));
            if(encontrado){
                sto=stoges.getObjStock();
                jTextField2.setText(sto.getDescri());
                jTextField3.setText(Float.toString(sto.getPreciocosto()));
                jTextField4.setText(Float.toString(sto.getPrecioventa()));
                jTextField5.setText(Float.toString(sto.getExistencia()));
                jTextField6.setText(Float.toString(sto.getStockmin()));
                this.jTextField5.setEditable(false);
                this.ubicarComboIvaEnPosicion(sto.getIva().getIdiva());
                this.ubicarComboUmEnPosicion(sto.getUnidadmedida().getIdum()); 
                if(sto.getParaventa()=='1'){
                    this.jCheckBox1.setSelected(true);
                    this.jComboBox2.setEnabled(false);
                    this.jTextField4.setEditable(true);
                }
                else{
                    this.jCheckBox1.setSelected(false);
                    this.jComboBox2.setEnabled(true);
                    this.jTextField4.setEditable(false);
                }
            } else {
                JOptionPane.showMessageDialog(null,"Código NO encontrado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                LimpiarCampos();
                sto=new Stockyserv();
                encontrado=false;
            }
        } else{
            LimpiarCampos();
            sto=new Stockyserv();
            encontrado=false;
        }
}//GEN-LAST:event_jTextField1FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        //campo precio
        jTextField3.selectAll();
}//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // Texto precio
        if(jTextField3.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField3.getText());
                if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField3.setText("0.0");
                    jTextField3.requestFocus();
                }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número decimal incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField3.setText("0.0");
                jTextField3.requestFocus();
            }
        } else
            jTextField3.setText("0.0");
}//GEN-LAST:event_jTextField3FocusLost

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased

        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField3.transferFocus();
}//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        if(jTextField3.getText().length()>=15)                      //validacion PRECIO
            evt.consume();
}//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        jTextField4.selectAll();
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // Texto precio
        if(jTextField4.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField4.getText());
                if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField4.setText("0.0");
                    jTextField4.requestFocus();
                }else
                   jTextField4.setText(Float.toString(cluti.redondearEnterosHastaLaCentena(Float.parseFloat(jTextField4.getText()))));
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número decimal incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField4.setText("0.0");
                jTextField4.requestFocus();
            }
        } else
            jTextField4.setText("0.0");
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField4.transferFocus();
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if(jTextField4.getText().length()>=15)                      //validacion PRECIO
            evt.consume();
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
       jTextField5.selectAll();
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
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
        } else
            jTextField5.setText("0.0");
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField5.transferFocus();
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        if(jTextField5.getText().length()>=15)                      //validacion existencia
            evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        jTextField6.selectAll();
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
         if(jTextField6.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField6.getText());
                if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField6.setText("0.0");
                    jTextField6.requestFocus();
                }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número decimal incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField6.setText("0.0");
                jTextField6.requestFocus();
            }
        } else
            jTextField6.setText("0.0");
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
       if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField6.transferFocus();
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        if(jTextField6.getText().length()>=15)                     
            evt.consume();
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
                                                                   
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
                                                                       //busq interactiva
        jTextField2.selectAll();
        xxx=0;
        lo=0;
        co=0;
        de="";
        z=false;
        cambiobusqueda=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        mimodelo = new DefaultTableModel();
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if(cambiobusqueda){                             //lost de la busqueda interactiva
            String cod="";
            Transaction tx=null;
            sto=new Stockyserv();
            if(mimodelo.getRowCount()>0){
                cod=mimodelo.getValueAt(xxx, 0).toString();
                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                tx=Sesion.beginTransaction();
                sto=(Stockyserv)Sesion.get(Stockyserv.class, Integer.parseInt(cod));
                if(sto!=null){                    //si se encontro el pais
                    jTextField1.setText(Integer.toString(sto.getCodigo()));
                    jTextField1.requestFocus();
                    jTextField1.transferFocus();
                }
                tx.commit();
                CERRARSesion();
            }
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        String texto=jTextField2.getText();                            //PARA BUSQUEDA INTERACTIVA
        Transaction tx2=null;
        cambiobusqueda=true;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        if(((int)evt.getKeyChar()) == 10){ //si se presiono enter
            jTextField2.transferFocus();
            ////mas codigo en el lostfocus

        } else{
            if(evt.getKeyCode()==evt.VK_UP && lo>0){   //pulso frecha arriba
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
                jTextField2.setText(de);
            } else{
                if(evt.getKeyCode()==evt.VK_DOWN && lo>0){  //pulso flecha abajo
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
                        jTextField2.setText(de);
                    }
                } else{
                    z=false;
                    try{
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tx2=Sesion.beginTransaction();
                        Query q13=Sesion.createQuery("from Stockyserv where (descri like'"+"%" +texto+"%"+ "') ");
                        mimodelo = new DefaultTableModel();
                        mimodelo.addColumn("Código");
                        mimodelo.addColumn("Descripción");
                        List milis= q13.list();
                        tx2.commit();
                        CERRARSesion();
                        for (int i=0;i<milis.size();i++){
                            Stockyserv ss=(Stockyserv)milis.get(i);
                            Object [] ffi = new Object[2]; // Hay dos columnas en la tabla
                            ffi[0] = ss.getCodigo();
                            ffi[1] = ss.getDescri();
                            mimodelo.addRow(ffi);// Se añade al modelo la fila completa.
                        }
                        lo=mimodelo.getRowCount();
                    } catch(HibernateException ex){
                        tx2.rollback();
                        ex.printStackTrace();
                    }
                }
            }

        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
         // checkbox
        if(this.jCheckBox1.isSelected()){
            this.ubicarComboIvaEnPosicion(this.ivapredetermninado.getIdiva());
            this.jComboBox2.setEnabled(false);
            this.jTextField4.setEditable(true);
        }else{
            this.jTextField4.setText("0.0");
            this.jComboBox2.setEnabled(true);
            this.jTextField4.setEditable(false);
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmStock dialog = new FrmStock(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
