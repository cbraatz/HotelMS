
import Hiber1.Cliente;
import Hiber1.Empresa;
import Hiber1.NewHibernateUtil;
import Hiber1.Pais;
import Hiber1.Profesion;
import Hiber1.Tipodocumento;
import Hiber1.Varios;
import Soporte.clasesutiles;
import imp.ActividadXClienteGest;
import imp.ClienteGest;
import imp.CliexsubGest;
import imp.FacturaGest;
import imp.MovCajaGest;
import imp.PaisGest;
import imp.ReservacionGest;
import imp.UsuarioXPuntoGest;
import imp.VariosGest;
import java.awt.Frame;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FrmCliente extends javax.swing.JDialog {

    /** Creates new form FrmCliente */
    public FrmCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       // this.jButton1.setVisible(false);
    }
    public FrmCliente(Pais pai, int nrodoc,java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.pais=pai;
        this.paisencontrado=true;
        this.jTextField1.setText(pais.getDescrippais());
        this.jTextField2.requestFocus();
        this.jTextField2.setText(Integer.toString(nrodoc));
        //this.jTextField2.transferFocus();
       // this.jTextField3.requestFocus();
        //this.jButton1.setVisible(true);  //boton volver
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel5)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("PAÍS");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
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

        jTextField2.setBackground(new java.awt.Color(153, 153, 255));
        jTextField2.setToolTipText("NÚMERO DE DOCUMENTO");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
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

        jComboBox1.setToolTipText("TIPO DE DOCUMENTO");
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTextField3.setToolTipText("NOMBRE");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setToolTipText("APELLIDO");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jTextField6.setToolTipText("Nº TELÉFONO");
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jTextField7.setToolTipText("Nº CELULAR/MÓVIL");
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Cel.:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Tel.:");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setText("Nombre:");

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel21.setForeground(new java.awt.Color(0, 0, 204));
        jLabel21.setText("Apellido:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel3)
                    .addComponent(jLabel20)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField5.setToolTipText("RUC");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setToolTipText("FECHA DE NACIMIENTO");
        jFormattedTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusLost(evt);
            }
        });
        jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyReleased(evt);
            }
        });

        jComboBox2.setToolTipText("PROFESIÓN");
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jTextField8.setToolTipText("DIRECCIÓN");
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Fecha de Nacimiento:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Profesión:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Dirección:");

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel22.setForeground(new java.awt.Color(0, 0, 204));
        jLabel22.setText("RUC:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, 0, 157, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField9.setToolTipText("OBSERVACIONES");
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox1.setText("Es titular de alguna reservación");
        jCheckBox1.setToolTipText("ES O SERÁ TITULAR DE ALGUNA RESERVACIÓN");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("País:");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Nº Documento:");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Tipo Doc.:");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Observ.:");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Nro. Chapa:");

        jTextField10.setToolTipText("OBSERVACIONES");
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Empresa:");

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jCheckBox2.setText("Modificar");
        jCheckBox2.setEnabled(false);

        jTextField11.setBackground(new java.awt.Color(153, 153, 153));
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField11FocusLost(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Buscador:");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2))
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
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
                .addContainerGap(287, Short.MAX_VALUE)
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
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(jButton8)
                    .addComponent(jButton7)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    Session Sesion=null;
    Cliente clie=new Cliente();
    Pais pais=new Pais();
    PaisGest paiges=new PaisGest();
    Tipodocumento tipodoc=new Tipodocumento();
    Profesion prof=new Profesion();
    Empresa empre=new Empresa();
    boolean paisencontrado=false;
    boolean clieencontrado=false;
    clasesutiles cluti=new clasesutiles();
    String fechadehoy="";
    ClienteGest clieges = new ClienteGest();
    Varios varios=new Varios();
    VariosGest varges=new VariosGest();
    ActividadXClienteGest acycliges = new ActividadXClienteGest();
    int codigocliente=0;  //esta variable guarda el codigo del cliente
    boolean encontrado=false;   //guarda si se encontro o no
    DefaultComboBoxModel modelocomboprofesion= new DefaultComboBoxModel();
    DefaultComboBoxModel modelocombotipodoc= new DefaultComboBoxModel();
    DefaultComboBoxModel modelocomboprofesion2= new DefaultComboBoxModel();   //el segundo modelo uso para guargar el codigo, y asi no mostrarlo en el combo
    DefaultComboBoxModel modelocombotipodoc2= new DefaultComboBoxModel();
    DefaultComboBoxModel modelocomboempresa2= new DefaultComboBoxModel();   //el segundo modelo uso para guargar el codigo, y asi no mostrarlo en el combo
    DefaultComboBoxModel modelocomboempresa1= new DefaultComboBoxModel();
    FrmEmpresa frmempresa=null;
    UsuarioXPuntoGest usuxpunges=new UsuarioXPuntoGest();
    ///////////////para la busqueda interactiva pais///////////////////////////////
    int xxx=0;  //posicion actual en el modelo
    int lo=0;  //longitud del modelo
    int co=0;
    String de="";
    boolean z=false;
    boolean cambiobusqueda=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
    DefaultTableModel mimodelo = new DefaultTableModel();
    /////////////////////////////////////////////////////////////////////////////////////
   ///////////////para la busqueda interactiva cliente///////////////////////////////
    int xxx2=0;  //posicion actual en el modelo
    int lo2=0;  //longitud del modelo
    int co2=0;
    String de2="";
    boolean z2=false;
    boolean cambiobusqueda2=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
    DefaultTableModel mimodelo2 = new DefaultTableModel();
    /////////////////////////////////////////////////////////////////////////////////////
    public void CERRARSesion(){
        if(Sesion.isOpen()){
            Sesion.flush();
            Sesion.clear();
            Sesion.close();
        }
    }

    public void actualizarFechaDeHoy(){
        fechadehoy=cluti.Date_StringDMA(clasesutiles.Calender_Date(Calendar.getInstance()));
    }

    public void limpiarCampos(){

         //jTextField2.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jTextField5.setText("");
         jTextField6.setText("");
         jTextField7.setText("");
         jTextField8.setText("");
         jTextField9.setText("");
         jTextField10.setText("");
         jTextField11.setText("");
         jFormattedTextField1.setText("");
         jCheckBox1.setSelected(false);
         ubicarComboProfesionEnPosicion(0);
         ubicarComboEmpresaEnPosicion(0);
         ubicarComboTipodocEnPosicion(0);
         this.clieencontrado=false;
         this.clie=new Cliente();
         codigocliente=0;
         this.jCheckBox2.setSelected(false);
         this.jCheckBox2.setEnabled(false);
   }

    public void cargarComboProfesion(){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            modelocomboprofesion= new DefaultComboBoxModel();
            modelocomboprofesion2= new DefaultComboBoxModel();
            Query q=Sesion.createQuery("from Profesion order by descripprof");
            List lis= q.list();
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    prof=new Profesion();
                    prof=(Profesion)lis.get(i);
                    modelocomboprofesion.addElement(prof.getDescripprof());
                    modelocomboprofesion2.addElement(prof.getIdprof());
                }
            }
            jComboBox2.setModel(modelocomboprofesion);
            tx.commit();
       }
       catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }

    public void cargarComboEmpresa(){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            modelocomboempresa1= new DefaultComboBoxModel();
            modelocomboempresa2= new DefaultComboBoxModel();
            Query q=Sesion.createQuery("from Empresa");
            List lis= q.list();
            modelocomboempresa1.addElement("ninguna");
            modelocomboempresa2.addElement(Integer.parseInt("0"));
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    Empresa emp=new Empresa();
                    emp=(Empresa)lis.get(i);
                    modelocomboempresa1.addElement(emp.getDescri());
                    modelocomboempresa2.addElement(emp.getIdempresa());
                }
            }
            jComboBox3.setModel(modelocomboempresa1);
            tx.commit();
       }
       catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }

   public void ubicarComboEmpresaEnPosicion(int cem){
        int lon=this.modelocomboempresa1.getSize();
        for(int i=0;i<lon;i++){
            int codi=Integer.parseInt(modelocomboempresa2.getElementAt(i).toString());  //busca el codigo del otro modelo que tiene los codigos
            if(codi==cem)
                this.jComboBox3.setSelectedIndex(i);  //ubica el combo en la posicion correcta
        }
   }

   public int obtenerCodigoActualDeComboEmpresa(){
        int resu=Integer.parseInt(modelocomboempresa2.getElementAt(jComboBox3.getSelectedIndex()).toString());
        return resu;
   }

   public void ubicarComboProfesionEnPosicion(int cpro){
        int lon=this.modelocomboprofesion.getSize();
        for(int i=0;i<lon;i++){
            int codi=Integer.parseInt(modelocomboprofesion2.getElementAt(i).toString());  //busca el codigo del otro modelo que tiene los codigos
            if(codi==cpro)
                this.jComboBox2.setSelectedIndex(i);  //ubica el combo en la posicion correcta
        }
   }

   public int obtenerCodigoActualDeComboProfesion(){
        int resu=Integer.parseInt(modelocomboprofesion2.getElementAt(jComboBox2.getSelectedIndex()).toString());
        return resu;
   }
   public void cargarComboTipoDoc(){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            modelocombotipodoc= new DefaultComboBoxModel();
            modelocombotipodoc2= new DefaultComboBoxModel();
            Query q=Sesion.createQuery("from Tipodocumento order by descriptipodoc");
            List lis= q.list();
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    tipodoc=new Tipodocumento();
                    tipodoc=(Tipodocumento)lis.get(i);
                    modelocombotipodoc.addElement(tipodoc.getDescriptipodoc());
                    modelocombotipodoc2.addElement(tipodoc.getIdtipodoc());
                }
            }
            jComboBox1.setModel(modelocombotipodoc);
            tx.commit();
       }
       catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }
     public void ubicarComboTipodocEnPosicion(int ctido){
        int lon=this.modelocombotipodoc.getSize();
        for(int i=0;i<lon;i++){
            int codi=Integer.parseInt(modelocombotipodoc2.getElementAt(i).toString());  //busca el codigo del otro modelo que tiene los codigos
            if(codi==ctido)
                this.jComboBox1.setSelectedIndex(i);  //ubica el combo en la posicion correcta
        }
   }

   public int obtenerCodigoActualDeComboTipodoc(){
        int resu=Integer.parseInt(modelocombotipodoc2.getElementAt(this.jComboBox1.getSelectedIndex()).toString());
        return resu;
   }
    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
                                                                        //CAMPO DE TEXTO ID/CODIGO cliente
        if(!(this.jCheckBox2.isEnabled()&& this.jCheckBox2.isSelected())){ //sie esta activo y seleccionado no buscar
            Transaction tx1=null;
            if(jTextField2.getText().isEmpty()==false){
                if(paisencontrado==true){  //si no esta vacio
                    try{
                        Sesion=NewHibernateUtil.getSessionFactory().openSession();
                        tx1=Sesion.beginTransaction();
                        Query q11=Sesion.createQuery("from Cliente where doc  = "+jTextField2.getText()+"and idpais = "+pais.getIdpais());
                        if(q11.list().isEmpty()==false){ //si no esta vacio
                            List l11=q11.list();
                            clie=(Cliente) l11.get(0);
                            if(clie!=null){
                                clieencontrado=true;
                                codigocliente=clie.getIdcli();
                                jTextField3.setText(clie.getNombre());
                                jTextField4.setText(clie.getApellido());
                                jTextField5.setText(clie.getRuc());
                                jTextField6.setText(clie.getTelefono());
                                jTextField7.setText(clie.getCelular());
                                jTextField8.setText(clie.getDireccion());
                                jTextField9.setText(clie.getObs());
                                jTextField10.setText(clie.getNrochapa());
                                this.jFormattedTextField1.setText(cluti.ObtenerFechaSinGuion(cluti.Date_StringDMA(clie.getFechanac())));
                                if(clie.getEstitular()=='1')
                                    this.jCheckBox1.setSelected(true);
                                else
                                    this.jCheckBox1.setSelected(false);
                                if(clie.getProfesion()!=null)
                                    ubicarComboProfesionEnPosicion(clie.getProfesion().getIdprof());
                                if(clie.getTipodocumento()!=null)
                                    this.ubicarComboTipodocEnPosicion(clie.getTipodocumento().getIdtipodoc());
                                if(clie.getEmpresa()!=null)
                                    ubicarComboEmpresaEnPosicion(clie.getEmpresa().getIdempresa());
                                else
                                    ubicarComboEmpresaEnPosicion(0);  //ubica en "ninguna"
                                this.jCheckBox2.setEnabled(true);
                            }
                        }else{
                            this.jCheckBox2.setEnabled(false);
                            int r=JOptionPane.showConfirmDialog(null,"Cliente no encontrado, ¿Desea AGREGARLO?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                            clieencontrado=false;
                            if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                                limpiarCampos();
                                clie=new Cliente();
                                codigocliente=0;
                            }else{
                                limpiarCampos();
                                clie=new Cliente();

                                this.jTextField2.setText("");
                                this.clieencontrado=false;
                                clie=new Cliente();
                                codigocliente=0;
                                this.jTextField2.requestFocus();
                            }
                        }
                        tx1.commit();
                        CERRARSesion();
                    } catch(HibernateException e){
                        e.printStackTrace();
                        tx1.rollback();
                    }
                } else{
                    JOptionPane.showMessageDialog(null,"Favor realizar la búsqueda del país antes de continuar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField2.setText("");
                    clieencontrado=false;
                    clie=new Cliente();
                    codigocliente=0;
                }

            }
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        //nada
}//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
    boolean esint=Character.isDigit(evt.getKeyChar());   //tira true si el boton presionado es un digito                                                                    //para validar el CAMPO DE TEXTO ID/CODIGO cliente
        if(jTextField2.getText().length()<30 || esint==false){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField2.transferFocus();
        } else
            evt.consume();
}//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
                                                                 //para validar el CAMPO DE TEXTO nombre
        if(jTextField3.getText().length()<30){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField3.transferFocus();
        }
        else
            evt.consume();
}//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
                                          //para validar el CAMPO DE TEXTO APELLIDO
        if(jTextField4.getText().length()<30){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField4.transferFocus();
        }
        else
            evt.consume();
}//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
                                                                         //busq interactiva pais
        jTextField1.selectAll();
        xxx=0;
        lo=0;
        co=0;
        de="";
        z=false;
        cambiobusqueda=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        mimodelo = new DefaultTableModel();
}//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(cambiobusqueda){                                           //lost de la busqueda interactiva
            String codpai="";   
            Transaction tx=null;
            if(mimodelo.getRowCount()>0){
                codpai=mimodelo.getValueAt(xxx, 0).toString();
                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                tx=Sesion.beginTransaction();
                pais=(Pais)Sesion.get(Pais.class, Integer.parseInt(codpai));
                if(pais!=null){                    //si se encontro el pais
                    jTextField1.setText(pais.getDescrippais());
                    paisencontrado=true;
                    if(jTextField2.getText().isEmpty()==false){  //manda un enter al codigo
                        jTextField2.requestFocus();
                        jTextField2.transferFocus();
                    }
                } else{
                    paisencontrado=false;
                    pais=new Pais();
                }
                tx.commit();
                CERRARSesion();
            } else{
                paisencontrado=false;
                pais=new Pais();
            }
        }
}//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String texto=jTextField1.getText();                            //PARA BUSQUEDA INTERACTIVA de pais
        Transaction tx2=null;
        cambiobusqueda=true;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        if(((int)evt.getKeyChar()) == 10){ //si se presiono enter
            jTextField1.transferFocus();
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
                jTextField1.setText(de);
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
                        jTextField1.setText(de);
                    }
                } else{
                    z=false;
                    try{
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tx2=Sesion.beginTransaction();
                        Query q13=Sesion.createQuery("from Pais where (descrippais like'"+"%" +texto+"%"+ "') ");
                        mimodelo = new DefaultTableModel();
                        mimodelo.addColumn("Código");
                        mimodelo.addColumn("Descripción");
                        List milis= q13.list();
                        tx2.commit();
                        CERRARSesion();
                        for (int i=0;i<milis.size();i++){
                            Pais pp=(Pais)milis.get(i);
                            Object [] ffi = new Object[2]; // Hay dos columnas en la tabla
                            ffi[0] = pp.getIdpais();
                            ffi[1] = pp.getDescrippais();
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
}//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        //NADA
}//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
                                                                  //para validar el CAMPO DE TEXTO RUC
        if(jTextField5.getText().length()<30){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField5.transferFocus();
        }
        else
            evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
                                             //para validar el CAMPO DE TEXTO TELEFONO
        if(jTextField6.getText().length()<60){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField6.transferFocus();
        }
        else
            evt.consume();
}//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
                                             //para validar el CAMPO DE TEXTO CELULAR
        if(jTextField7.getText().length()<60){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField7.transferFocus();
        }
        else
            evt.consume();
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jFormattedTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusLost
        String texto=jFormattedTextField1.getText();                              //cuadro de fecha
        if(texto.equals("  /  /    ")==false){  //si no esta vacio
            if(cluti.FechaValidaDMA(texto)==false){  //si la fecha no es valida
                JOptionPane.showMessageDialog(null,"Fecha NO válida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jFormattedTextField1.setText("");
                jFormattedTextField1.requestFocus();
            }else{
                this.actualizarFechaDeHoy();
                if(cluti.obtenerDiferenciaDeFechasEnDias2(texto,fechadehoy)>0){  //si la fecha es > que la de hoy
                    JOptionPane.showMessageDialog(null,"Fecha superior a la de hoy","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jFormattedTextField1.requestFocus();
                    jFormattedTextField1.setText("");
                }
            }
        }
}//GEN-LAST:event_jFormattedTextField1FocusLost

    private void jFormattedTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyReleased
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField1.transferFocus();
}//GEN-LAST:event_jFormattedTextField1KeyReleased

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
                                            //para validar el CAMPO DE TEXTO DIRECCION
        if(jTextField8.getText().length()<60){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField8.transferFocus();
        }
        else
            evt.consume();
}//GEN-LAST:event_jTextField8KeyTyped

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
     //NADA
}//GEN-LAST:event_jComboBox2MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
  //NADA
}//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                                                                     // al iniciar
          Sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
          cargarComboTipoDoc();
          cargarComboProfesion();
          cargarComboEmpresa();
          this.setResizable(false);
          this.setLocationRelativeTo(null);  //centra el objeto en pantalla
         // setDefaultCloseOperation(0);
          varges.actualizarVarios();
          varios=varges.getVarios();
    }//GEN-LAST:event_formWindowOpened

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
                                             //para validar el CAMPO DE TEXTO OBS
        if(jTextField9.getText().length()<60){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField9.transferFocus();
        }
        else
            evt.consume();
}//GEN-LAST:event_jTextField9KeyTyped

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
                                                                    //BOTON NUEVO
        clieges = new ClienteGest();
        limpiarCampos();
        codigocliente=clieges.getsiguientecodigo();
        this.clie=new Cliente();
        clieencontrado=false;
        if (codigocliente==0)
            JOptionPane.showMessageDialog(null,"No se pudo obtener un Código nuevo","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

}//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
                                                                        //BOTON GUARDAR
        if(jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jFormattedTextField1.getText().equals("  /  /    ") || paisencontrado==false){ //si no estan vacios
            JOptionPane.showMessageDialog(null,"Favor completar los datos del cliente","PETICIÓN",JOptionPane.INFORMATION_MESSAGE);
            encontrado=false;
        }else{
            this.actualizarFechaDeHoy();
            if(this.jCheckBox2.isSelected()&&this.jCheckBox2.isEnabled()) //si esta seleccionado y activo se deduce que se busco anteriormente
                encontrado=true;
            else
                encontrado = clieges.existeCliente(jTextField2.getText(), pais.getIdpais());
            int r=0;
            if (encontrado){  //si se encontro y se desea EDITAR
                r=JOptionPane.showConfirmDialog(null,"¿Desea EDITAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                    try {
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        Transaction tx=Sesion.beginTransaction();
                        int cop=this.obtenerCodigoActualDeComboProfesion();
                        prof=new Profesion();
                        prof=(Profesion)Sesion.get(Profesion.class, cop);
                        tx.commit();
                        CERRARSesion();
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        Transaction tx1=Sesion.beginTransaction();
                        int cot=this.obtenerCodigoActualDeComboTipodoc();
                        tipodoc=new Tipodocumento();
                        tipodoc=(Tipodocumento)Sesion.get(Tipodocumento.class, cot);
                        tx1.commit();
                        CERRARSesion();
                        int cem=this.obtenerCodigoActualDeComboEmpresa();
                        if(cem>0){
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            Transaction tx22=Sesion.beginTransaction();
                            empre=new Empresa();
                            empre=(Empresa)Sesion.get(Empresa.class, cem);
                            tx22.commit();
                            CERRARSesion();
                        }else
                            empre=null;
                        if(prof != null && tipodoc != null){
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            Transaction tx2=Sesion.beginTransaction();
                            Cliente cc=new Cliente();
                            cc=(Cliente) Sesion.load(Cliente.class,codigocliente);
                            cc.setDoc(this.jTextField2.getText());
                            cc.setNombre(jTextField3.getText().toUpperCase());
                            cc.setApellido(jTextField4.getText().toUpperCase());
                            cc.setRuc(jTextField5.getText().toUpperCase());
                            cc.setTelefono(jTextField6.getText().toUpperCase());
                            cc.setCelular(jTextField7.getText().toUpperCase());
                            cc.setDireccion(jTextField8.getText().toUpperCase());
                            cc.setObs(jTextField9.getText().toUpperCase());
                            cc.setNrochapa(jTextField10.getText().toUpperCase());
                            cc.setFechanac(cluti.StrDMA_Date(jFormattedTextField1.getText()));
                            cc.setTipodocumento(tipodoc);
                            cc.setEmpresa(empre);
                            cc.setProfesion(prof);
                            if(this.jCheckBox1.isSelected())
                                cc.setEstitular('1');
                            else
                                cc.setEstitular('0');
                            tx2.commit();
                            CERRARSesion();
                            JOptionPane.showMessageDialog(null,"El registro fue EDITADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                        }else
                            JOptionPane.showMessageDialog(null,"El registro no pudo ser EDITADO correctamente","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        limpiarCampos();
                    } catch (HibernateException ex) {
                        JOptionPane.showMessageDialog(null,"Error al intentar EDITAR el registro","ERROR",JOptionPane.ERROR_MESSAGE);
                        limpiarCampos();
                    }catch (ParseException ex2) {
                        JOptionPane.showMessageDialog(null,"Error al intentar EDITAR el registro","ERROR",JOptionPane.ERROR_MESSAGE);
                        limpiarCampos();
                    }
                }
            } else{
                r=JOptionPane.showConfirmDialog(null,"¿Desea AGREGAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                    try {
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        Transaction tx=Sesion.beginTransaction();
                        int cop=this.obtenerCodigoActualDeComboProfesion();
                        prof=new Profesion();
                        prof=(Profesion)Sesion.get(Profesion.class, cop);
                        tx.commit();
                        CERRARSesion();
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        Transaction tx1=Sesion.beginTransaction();
                        int cot=this.obtenerCodigoActualDeComboTipodoc();
                        tipodoc=new Tipodocumento();
                        tipodoc=(Tipodocumento)Sesion.get(Tipodocumento.class, cot);
                        tx1.commit();
                        CERRARSesion();
                        int cem=this.obtenerCodigoActualDeComboEmpresa();
                        if(cem>0){
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            Transaction tx22=Sesion.beginTransaction();
                            empre=new Empresa();
                            empre=(Empresa)Sesion.get(Empresa.class, cem);
                            tx22.commit();
                            CERRARSesion();
                        }else
                            empre=null;
                        codigocliente=clieges.getsiguientecodigo();
                        if(prof != null && tipodoc != null && codigocliente>0){
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            Transaction tx2=Sesion.beginTransaction();
                            Cliente cc=new Cliente();
                            cc.setIdcli(codigocliente);
                            cc.setPais(pais);
                            cc.setDoc(jTextField2.getText().toUpperCase());
                            cc.setNombre(jTextField3.getText().toUpperCase());
                            cc.setApellido(jTextField4.getText().toUpperCase());
                            cc.setRuc(jTextField5.getText().toUpperCase());
                            cc.setTelefono(jTextField6.getText().toUpperCase());
                            cc.setCelular(jTextField7.getText().toUpperCase());
                            cc.setDireccion(jTextField8.getText().toUpperCase());
                            cc.setObs(jTextField9.getText().toUpperCase());
                            cc.setNrochapa(jTextField10.getText().toUpperCase());
                            cc.setEmpresa(empre);
                            cc.setFechanac(cluti.StrDMA_Date(jFormattedTextField1.getText()));
                            cc.setTipodocumento(tipodoc);
                            cc.setProfesion(prof);
                            if(this.jCheckBox1.isSelected())
                                cc.setEstitular('1');
                            else
                                cc.setEstitular('0');
                            Sesion.save(cc);
                            tx2.commit();
                            CERRARSesion();
                            JOptionPane.showMessageDialog(null,"El registro fue AGREGADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                        }else
                            JOptionPane.showMessageDialog(null,"El registro no pudo ser AGREGADO correctamente","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        limpiarCampos();
                    } catch (HibernateException ex) {
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar procesar el pedido","ERROR",JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();
                        limpiarCampos();
                    }catch (ParseException ex2) {
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar procesar el pedido","ERROR",JOptionPane.ERROR_MESSAGE);
                        ex2.printStackTrace();
                        limpiarCampos();
                    }
                    jTextField2.setText("");
                }
            }
           
        }
}//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        int r=0;                                                     //BOTON BORRAR
        if (codigocliente >0 && jTextField2.getText().isEmpty()==false && paisencontrado){
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx=Sesion.beginTransaction();
            Cliente cc=(Cliente) Sesion.get(Cliente.class, codigocliente);
            tx.commit();
            CERRARSesion();
            if(cc!=null){
                r=JOptionPane.showConfirmDialog(null,"¿Desea BORRAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                    try {
                        MovCajaGest mcajages=new MovCajaGest();
                        FacturaGest facges=new FacturaGest();
                        CliexsubGest clsg=new CliexsubGest();
                        ReservacionGest resges=new ReservacionGest();
                        if (mcajages.ExisteFKCliente(codigocliente)==false && facges.ExisteFKCliente(codigocliente)==false && clsg.ExisteFKCliente(codigocliente)==false && resges.ExisteFKCliente(codigocliente)==false && acycliges.ExisteFKCliente(codigocliente)==false){  //si no esta como FK en ninguna de las tablas
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            Transaction tx2=Sesion.beginTransaction();
                            Sesion.delete(cc);
                            tx2.commit();
                            CERRARSesion();
                            JOptionPane.showMessageDialog(null,"El registro fue BORRADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            limpiarCampos();
                        } else
                            JOptionPane.showMessageDialog(null,"No se pudo BORRAR el registro porque está siendo utilizado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                    } catch (HibernateException ex) {
                        ex.printStackTrace();
                        limpiarCampos();
                        JOptionPane.showMessageDialog(null,"Ha ocurrito un error al intentar Borrar el Registro","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }else
                JOptionPane.showMessageDialog(null,"Cliente no encontrado","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            jTextField2.setText("");
        } else
            JOptionPane.showMessageDialog(null,"Favor seleccionar un elemento a borrar","PETICIÓN",JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_jButton7MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        //BOTON SALIR
        this.dispose();//sale
}//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
                                                                        //BOTON LIMPIAR
        limpiarCampos();
        this.jTextField1.setText("");  //xq el limpiar no limpia el pais
        this.jTextField2.setText("");
        paisencontrado=false;
        pais=new Pais();
}//GEN-LAST:event_jButton8MouseClicked

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
                                          //para validar el CAMPO DE TEXTO nro chapa
        if(jTextField10.getText().length()<15){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField10.transferFocus();
        }
        else
            evt.consume();
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
         String texto=jTextField11.getText();                             //PARA BUSQUEDA INTERACTIVA de CLIENTE
        Transaction tx2=null;
        cambiobusqueda2=true;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        if(((int)evt.getKeyChar()) == 10){ //si se presiono enter
            jTextField11.transferFocus();
            ////mas codigo en el lostfocus

        } else{
            if(evt.getKeyCode()==evt.VK_UP && lo2>0){   //pulso frecha arriba
                if(z2==false){
                    xxx2=0;
                    z2=true;
                } else{
                    xxx2++;
                    if(xxx2==lo2)
                        xxx2=0;
                }
                co2=Integer.parseInt(mimodelo2.getValueAt(xxx2, 0).toString());
                de2=mimodelo2.getValueAt(xxx2, 1).toString();
                jTextField11.setText(de2);
            } else{
                if(evt.getKeyCode()==evt.VK_DOWN && lo2>0){  //pulso flecha abajo
                    if(lo2>0){
                        if(z2==false){
                            xxx2=0;
                            z2=true;
                        } else{
                            xxx2--;
                            if(xxx2<0)
                                xxx2=lo2-1;
                        }
                        co2=Integer.parseInt(mimodelo2.getValueAt(xxx2, 0).toString());
                        de2=mimodelo2.getValueAt(xxx2, 1).toString();
                        jTextField11.setText(de2);
                    }
                } else{
                    z2=false;
                    try{
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tx2=Sesion.beginTransaction();
                        Query q13=Sesion.createQuery("from Cliente where (concat(nombre,' ',apellido) like'"+"%" +texto+"%"+ "') ");
                        mimodelo2 = new DefaultTableModel();
                        mimodelo2.addColumn("Código");
                        mimodelo2.addColumn("Descripción");
                        List milis= q13.list();
                        tx2.commit();
                        CERRARSesion();
                        for (int i=0;i<milis.size();i++){
                            Cliente cc=(Cliente)milis.get(i);
                            Object [] ffi = new Object[2]; // Hay dos columnas en la tabla
                            ffi[0] = cc.getIdcli();
                            ffi[1] = cc.getNombre()+" "+cc.getApellido();
                            mimodelo2.addRow(ffi);// Se añade al modelo la fila completa.
                        }
                        lo2=mimodelo2.getRowCount();
                    } catch(HibernateException ex){
                        tx2.rollback();
                        ex.printStackTrace();
                    }
                }
            }

        }
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
                                                                       //busq interactiva clie
        jTextField11.selectAll();
        xxx2=0;
        lo2=0;
        co2=0;
        de2="";
        z2=false;
        cambiobusqueda2=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        mimodelo2 = new DefaultTableModel();
    }//GEN-LAST:event_jTextField11FocusGained

    private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
       if(cambiobusqueda2){                                           //lost de la busqueda interactiva clie
            String codcli="";
            Transaction tx=null;
            if(mimodelo2.getRowCount()>0){
                codcli=mimodelo2.getValueAt(xxx2, 0).toString();
                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                tx=Sesion.beginTransaction();
                Cliente cl=(Cliente)Sesion.get(Cliente.class, Integer.parseInt(codcli));
                if(cl!=null){                    //si se encontro el pais
                    this.limpiarCampos();
                    this.pais=cl.getPais();
                    this.paisencontrado=true;
                    this.jTextField1.setText(cl.getPais().getDescrippais());
                    jTextField1.setText(pais.getDescrippais());
                    paisencontrado=true;
                    this.jTextField2.setText(cl.getDoc());
                    this.jTextField2.requestFocus();
                    this.jTextField2.transferFocus();
                } else{
                    paisencontrado=false;
                    pais=new Pais();
                }
                tx.commit();
                CERRARSesion();
            } else{
                paisencontrado=false;
                pais=new Pais();
            }
        }
    }//GEN-LAST:event_jTextField11FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean existe=true;                                                //MENU empresas
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(36);
        if(permitido){
            try{
                 frmempresa.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmempresa.dispose();
            frmempresa=new FrmEmpresa((Frame)this.getParent(),true);
            frmempresa.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        this.cargarComboEmpresa();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCliente dialog = new FrmCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
