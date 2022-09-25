
import Hiber1.Apeyciecaja;
import Hiber1.Banco;
import Hiber1.Caja;
import Hiber1.Cliente;
import Hiber1.Cliexsub;
import Hiber1.Documentos;
import Hiber1.Estado;
import Hiber1.Factura;
import Hiber1.Formapago;
import Hiber1.Grupo;
import Hiber1.Habitacion;
import Hiber1.Moneda;
import Hiber1.Movcaja;
import Hiber1.NewHibernateUtil;
import Hiber1.Ocupaciones;
import Hiber1.Pais;
import Hiber1.Reservacion;
import Hiber1.Subreserva;
import Hiber1.Subtipo;
import Hiber1.Tipodocumento;
import Hiber1.Tipohab;
import Hiber1.Tipomov;
import Hiber1.Varios;
import Soporte.ClaseReporte;
import Soporte.ConversionCientifica;
import Soporte.ConvertidorDeNumerosALetras;
import Soporte.GrupoReservas;
import Soporte.clasesutiles;
import Soporte.MiDefaultTableModel;
import imp.ApeyciecajaGest;
import imp.CajaGest;
import imp.ClienteGest;
import imp.CliexsubGest;
import imp.DocumentoGest;
import imp.FacturaGest;
import imp.HabitacionGest;
import imp.MovCajaGest;
import imp.OcupacionesGest;
import imp.ReservacionGest;
import imp.SubReservaGest;
import imp.SubresxmulGest;
import imp.SubresxstoyservGest;
import imp.VariosGest;
import java.awt.Frame;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class FrmReserva extends javax.swing.JDialog {
    /** Creates new form FrmReserva */
    public FrmReserva(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
     public FrmReserva(java.awt.Frame parent, boolean modal, int ccli, int cre) {
        super(parent, modal);
        initComponents();
        this.ccl=ccli;
        this.cr=cre;
        this.entroXConstructor2=true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jButton14 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jTextField23 = new javax.swing.JTextField();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jTextField24 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jTextField27 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Reservación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel5)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("País:");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Nº Documento:");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setText("Nombre:");

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 204));
        jLabel21.setText("Apellido:");

        jButton11.setText("Ir a Clientes");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField10.setBackground(new java.awt.Color(153, 153, 153));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField10.setToolTipText("APELLIDO");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Pendientes");
        jRadioButton1.setToolTipText("RESERVACIONES PENDIENTES");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButton2.setText("En curso");
        jRadioButton2.setToolTipText("RESERVACIONES EN CURSO");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel37.setText("Reservaciones");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButton3.setText("Confirmadas");
        jRadioButton3.setToolTipText("TODAS LAS RESERVACIONES, INCLUYENDO LAS INACTIVAS");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButton7.setText("Concretadas");
        jRadioButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton7MouseClicked(evt);
            }
        });
        jRadioButton7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton7ItemStateChanged(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButton8.setText("Todas");
        jRadioButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton8MouseClicked(evt);
            }
        });
        jRadioButton8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton8ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton8)
                    .addComponent(jLabel37)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Habitaciones disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

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
        jTable1.setToolTipText("HABITACIONES DISPONIBLES");
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setToolTipText("FECHA DE INICIO DE LA BÚSQUEDA");
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

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setToolTipText("FECHA DE FINALIZACIÓN DE LA BÚSQUEDA");
        jFormattedTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField2FocusLost(evt);
            }
        });
        jFormattedTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField2KeyReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 204));
        jLabel23.setText("F. Inicio:");

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 204));
        jLabel24.setText("F.Fin:");

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 204));
        jLabel25.setText("Tipo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setToolTipText("TIPO DE HABITACIÓN A BUSCAR");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/BUSCAR4.png"))); // NOI18N
        jButton2.setToolTipText("BUSCAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, 0, 0, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Selección de habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 204));
        jLabel35.setText("Entrada:");

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 204));
        jLabel33.setText("Salida:");

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField4.setToolTipText("FECHA DE SALIDA");
        jFormattedTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField4FocusLost(evt);
            }
        });
        jFormattedTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField4KeyReleased(evt);
            }
        });

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setToolTipText("FECHA DE ENTRADA");
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });
        jFormattedTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField3FocusLost(evt);
            }
        });
        jFormattedTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField3KeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 204));
        jLabel26.setText("Fecha de:");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBox1.setText("Reservar esta habitación por medio dia más de lo previsto");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });

        jComboBox7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox7ItemStateChanged(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 204));
        jLabel27.setText("Utilizar como:");

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField9.setToolTipText("CANTIDAD DE NIÑOS POR HABITACIÓN");

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField7.setToolTipText("PRECIO POR NOCHE");

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 204));
        jLabel32.setText("Niños:");

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 204));
        jLabel34.setText("Adultos:");

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField8.setToolTipText("CANTIDAD DE ADULTOS POR HABITACIÓN");

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 204));
        jLabel30.setText("Precio/ Noche:");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 204));
        jLabel31.setText("Capacidad para:");

        jTextField6.setBackground(new java.awt.Color(153, 153, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField6.setToolTipText("NÚMEOR DE HABITACIÓN");
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 204));
        jLabel29.setText("Habitación Nº:");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stop.gif"))); // NOI18N
        jButton4.setToolTipText("EXTRAER HABITACIÓN");
        jButton4.setEnabled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/build.gif"))); // NOI18N
        jButton3.setToolTipText("AGREGAR HABITACIÓN");
        jButton3.setEnabled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Estado de la Reserva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("TOTAL PARCIAL: 0");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        jButton6.setToolTipText("GUARDAR RESERVACIÓN");
        jButton6.setEnabled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir2.png"))); // NOI18N
        jButton8.setToolTipText("SALIR");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo2.png"))); // NOI18N
        jButton7.setToolTipText("NUEVA RESERVACIÓN");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar2.png"))); // NOI18N
        jButton9.setToolTipText("LIMPIAR TODO");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar2.png"))); // NOI18N
        jButton10.setToolTipText("BORRAR RESERVACIÓN");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(204, 204, 255));
        jCheckBox2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox2.setText("Marcar esta Reservación como confirmada.");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        jPanel32.setBackground(new java.awt.Color(204, 204, 255));

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
        jTable2.setToolTipText("HABITACIONES ASIGNADAS A LA RESERVACIÓN");
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.setToolTipText("HABITACIONES SELECCIONADAS ORDENADAS AGRUPADAS POR TIPO");
        jScrollPane5.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );

        jButton12.setText("Ver Grilla");
        jButton12.setEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Lista de Reservaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTextField5.setBackground(new java.awt.Color(153, 153, 153));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reservación", jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 51, 255));

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Check - In");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(247, 247, 247))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Datos de los Huéspedes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTextField14.setBackground(new java.awt.Color(153, 153, 153));
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setToolTipText("PAÍS");
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

        jTextField11.setBackground(new java.awt.Color(153, 153, 255));
        jTextField11.setToolTipText("NÚMERO DE DOCUMENTO");
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField11FocusLost(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField5FocusLost(evt);
            }
        });
        jFormattedTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField5KeyReleased(evt);
            }
        });

        jTextField12.setToolTipText("NOMBRE");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });

        jTextField13.setToolTipText("APELLIDO");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jTextField15.setToolTipText("MONTO ENTREGADO");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15KeyTyped(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/build.gif"))); // NOI18N
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton15MouseEntered(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stop.gif"))); // NOI18N
        jButton20.setToolTipText("EXTRAER");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/checkin.png"))); // NOI18N
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir2.png"))); // NOI18N
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("País:");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Nº Documento:");

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 204));
        jLabel28.setText("Nombre:");

        jLabel38.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 204));
        jLabel38.setText("Apellido:");

        jLabel39.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 204));
        jLabel39.setText("Celular:");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Fecha de Nacimiento:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Tipo Doc.");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, 0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel28)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel38)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel39)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField11)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Huéspedes por habitación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jScrollPane1.setViewportView(jList2);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel16.setBackground(new java.awt.Color(204, 204, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Estado de Habitaciones Reservadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable6.setToolTipText("HABITACIONES DISPONIBLES");
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Check-In", jPanel5);

        jPanel15.setBackground(new java.awt.Color(51, 51, 255));

        jPanel24.setBackground(new java.awt.Color(0, 0, 0));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel23.setBackground(new java.awt.Color(153, 153, 255));
        jPanel23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel23.setName(""); // NOI18N

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Check - Out");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Rendición de cuentas por Habitación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTextField16.setEditable(false);
        jTextField16.setToolTipText("NÚMERO DE HABITACIÓN");

        jPanel21.setBackground(new java.awt.Color(204, 204, 255));

        jTextField17.setEditable(false);
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField17.setText("0.0");
        jTextField17.setToolTipText("SUBTOTAL SERVICIOS UTILIZADOS");

        jTextField18.setEditable(false);
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField18.setText("0.0");
        jTextField18.setToolTipText("SUBTOTAL CONSUMISIÓN");

        jTextField28.setEditable(false);
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField28.setText("0.0");
        jTextField28.setToolTipText("SUBTOTAL MULTAS INCURRIDAS");

        jTextField19.setEditable(false);
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField19.setText("0.0");
        jTextField19.setToolTipText("SUBTOTAL HOSPEDAJE");

        jTextField25.setEditable(false);
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField25.setText("0.0");
        jTextField25.setToolTipText("SUBTOTAL");
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jTextField26.setEditable(false);
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField26.setText("0.0");
        jTextField26.setToolTipText("MONTO ABONADO");

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField20.setText("0.0");
        jTextField20.setToolTipText("TOTAL");

        jRadioButton4.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Sumar al Total General");
        jRadioButton4.setToolTipText("SUMA EL MONTO TOTAL AL MONTO GENERAL DE LA RESERVACIÓN");
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Pagar");
        jRadioButton5.setToolTipText("PAGAR EL MONTO TOTAL");
        jRadioButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton5MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("Servicios:");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setText("Consumición:");

        jLabel41.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 204));
        jLabel41.setText("TOTAL:");

        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 204));
        jLabel40.setText("Hospedaje:");

        jLabel54.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 204));
        jLabel54.setText("Subtotal:");

        jLabel55.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 204));
        jLabel55.setText("Abonado:");

        jLabel56.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 204));
        jLabel56.setText("Subtotales de:");

        jLabel58.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 204));
        jLabel58.setText("Multas:");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jLabel41)
                        .addComponent(jLabel55)
                        .addComponent(jLabel54))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField28, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField20, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextField25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jTextField26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addContainerGap())
        );

        try {
            jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField6.setToolTipText("FECHA DE SALIDA");
        jFormattedTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField6FocusLost(evt);
            }
        });
        jFormattedTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField6KeyReleased(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/checkout.png"))); // NOI18N
        jButton14.setToolTipText("REGISTRAR CHECK'OUT DE ESTA HABITACIÓN");
        jButton14.setEnabled(false);
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("Habitación Nº:");

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 204));
        jLabel42.setText("Fecha de salida:");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42)
                        .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Cobros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTextField21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField21.setText("0.0");
        jTextField21.setToolTipText("TOTAL A PAGAR");
        jTextField21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField21FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField21FocusLost(evt);
            }
        });
        jTextField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField21KeyReleased(evt);
            }
        });

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField22.setText("0.0");
        jTextField22.setToolTipText("VALOR PAGADO");
        jTextField22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField22FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField22FocusLost(evt);
            }
        });
        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField22KeyReleased(evt);
            }
        });

        jComboBox3.setToolTipText("MONEDA PAGADA");
        jComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox3MouseClicked(evt);
            }
        });
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jComboBox4.setToolTipText("FORMA DE PAGO");

        jComboBox5.setToolTipText("BANCO");

        jTextField23.setBackground(new java.awt.Color(153, 153, 255));
        jTextField23.setToolTipText("NÚMERO DEL DOCUMENTO (si no es efectivo)");
        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField23KeyTyped(evt);
            }
        });

        try {
            jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField7.setToolTipText("FECHA DE VENCIMIENTO DEL DOCUMENTO (si no es efectivo)");
        jFormattedTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField7FocusLost(evt);
            }
        });
        jFormattedTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField7KeyReleased(evt);
            }
        });

        jTextField24.setToolTipText("OBSERVACIONES (si no es efectivo)");
        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField24KeyTyped(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(204, 204, 255));

        jLabel47.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 204));
        jLabel47.setText("Cambio:");

        jLabel48.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 0, 0));
        jLabel48.setText(" ");
        jLabel48.setToolTipText("CAMBIO");

        jLabel53.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 204));
        jLabel53.setText("Moneda de cambio:");

        jComboBox6.setToolTipText("MONEDA DEL CAMBIO");
        jComboBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox6MouseClicked(evt);
            }
        });
        jComboBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox6ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel53)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel43.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 204));
        jLabel43.setText("Total a cobrar:");

        jLabel45.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 204));
        jLabel45.setText("Valor pagado:");

        jLabel44.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 204));
        jLabel44.setText("Moneda:");

        jLabel46.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 204));
        jLabel46.setText("Forma de pago:");

        jLabel49.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 204));
        jLabel49.setText("Documento Nº:");

        jLabel50.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 204));
        jLabel50.setText("Fecha de vencimiento:");

        jLabel51.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 204));
        jLabel51.setText("Observaciones:");

        jLabel52.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 204));
        jLabel52.setText("Banco:");

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        jButton16.setToolTipText("REGISTRAR PAGO");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                            .addComponent(jLabel50)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel46)
                                .addComponent(jLabel44)
                                .addComponent(jLabel45)
                                .addComponent(jLabel43)
                                .addComponent(jLabel49)
                                .addComponent(jLabel52))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField23)
                                .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField22)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addGap(5, 5, 5)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 1, true), "Habitaciones aún ocupadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable5.setToolTipText("HABITACIONES AÚN OCUPADAS BAJO ESTA RESERVACIÓN");
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable5MouseEntered(evt);
            }
        });
        jScrollPane7.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 1, true), "Cotización", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable7.setToolTipText("COTIZACIONES");
        jScrollPane9.setViewportView(jTable7);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(153, 153, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Rendición de la reservación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jButton5.setText("Agregar al descuento");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/money2.png"))); // NOI18N
        jButton1.setToolTipText("LIQUIDAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/print2.png"))); // NOI18N
        jButton17.setToolTipText("IMPRIMIR FACTURA");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir2.png"))); // NOI18N
        jButton19.setToolTipText("SALIR");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });

        jTextField27.setEditable(false);
        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField27.setForeground(java.awt.Color.red);
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField27.setText("0.0");

        jLabel57.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 204));
        jLabel57.setText("TOTAL:");

        jLabel59.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 204));
        jLabel59.setText("Abonado:");

        jLabel60.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 204));
        jLabel60.setText("Subtotal:");

        jTextField29.setEditable(false);
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField29.setText("0.0");
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jTextField30.setEditable(false);
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField30.setText("0.0");
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 204));
        jLabel61.setText("Descuento:");

        jTextField31.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField31.setText("0.0");
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        jTextField31.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField31FocusLost(evt);
            }
        });
        jTextField31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField31KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField31KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel59)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField31, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField30, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jTextField29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Check-Out", jPanel15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    MiDefaultTableModel modelores1 = new MiDefaultTableModel();   //de reservas
    MiDefaultTableModel modelores11 = new MiDefaultTableModel();   //contiene el id subtipo y precio corto de la habitacion equivalente en modelores1
    MiDefaultTableModel modelores2 = new MiDefaultTableModel();   //de reservas
    MiDefaultTableModel modelocheck1 = new MiDefaultTableModel();   //de check-in
    MiDefaultTableModel modelocheckout= new MiDefaultTableModel();   //de checkout
    MiDefaultTableModel modelohabdispo = new MiDefaultTableModel();  //de reservas
    MiDefaultTableModel modeloclie1= new MiDefaultTableModel();      //de check-in
    MiDefaultTableModel modelocotizacion= new MiDefaultTableModel();   //coticaciones
    DefaultTableModel modelopais = new DefaultTableModel();
    private boolean clieencontrado=false;
    private boolean clie2encontrado=false;
    private boolean paisencontrado=false;
    private boolean pais2encontrado=false;
    private boolean reservacionencontrada=false;
    private boolean cargaronelementoscheckout=false;
    private int EDADLIMITEDENINHO=11; //edad limite de categoria ninho
    private int DIASRETRASOFECHAENTRADAYSALIDA=7;//los dias de retraso disponibles para cargar la fecha de entrada de una reservacion,
              // ej hoy es el 17, y la fecha de inicio debe ser mayor al 10, esto se permite en el caso de que no haya corriente electrica por un tiempo;
    //private List<Subreserva> listaSubreservas=null;
    int ccl=0;
    int cr=0;  //los 2 se usan cuando se entra x el constructor 2
    boolean entroXConstructor2=false;   //si entro x el constructor2
    String fechadehoy="";
    String manhana="";
    float subto=0;
    int filalista=0;
    int ctipo=0;
    clasesutiles cluti=new clasesutiles();
    ConversionCientifica conv = new ConversionCientifica();
    String fini="";
    String ffin="";
    int fila=0;
    int fila2=0;
    int filaSeleccionadaAEditar=-1;
    boolean cambios1=false; //guarda si se hizo algun cambio en la pestanha 1
    boolean cambios2=false; //guarda si se hizo algun cambio en la pestanha 2
    boolean resnueva=false;  //si se crea una nueva reservacion;
    boolean imprimio1=false; //guarda si la factura se imprimio ya una vez
    boolean impresa=false;  //SI SE IMPRIMIO CORRECTAMENTE LA FACTURA, SE USA AL IMPRIMIR 2 FAC PARA VER SI SE IMP CORRECTAMENTE LA 1RA
    float diferencia=0;
    float TotalGeneral=0;
    float totalHospedaje=0;
    float totalConsumision=0;
    String sgtenumfactura="";
    //boolean ediciondereserva=false;
    FrmCliente frmcliente=null;
    Calendar calhoy=null;//guarda la fecha de hoy en formato calendar
    DefaultListModel mimodelolista =null;
    DefaultListModel mimodelolistacodigos =null; //tiene los codigos asociados a mimodelolista
    DefaultListModel mimodelolista2 =null;
    DefaultComboBoxModel mimodelocombo=null;
    DefaultComboBoxModel mimodelocombo2=null;
    DefaultComboBoxModel modelocombomoneda1=null;
    DefaultComboBoxModel modelocombomoneda11=null;  //guarda el codigo
    DefaultComboBoxModel modelocombomoneda2=null;
    DefaultComboBoxModel modelocombomoneda22=null;  //guarda el codigo
    DefaultComboBoxModel modelocomboformapago=null;
    DefaultComboBoxModel modelocomboformapago2=null;  //guarda el codigo
    DefaultComboBoxModel modelocombobanco=null;
    DefaultComboBoxModel modelocombobanco2=null;   //guarda el codigo
    DefaultComboBoxModel modelocombosubtipo=null;
    DefaultComboBoxModel modelocombosubtipo2=null;   //guarda el codigo

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
    boolean cambiobusqueda3=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
    DefaultTableModel mimodelo3 = new DefaultTableModel();
    /////////////////////////////////////////////////////////////////////////////////////
    ///////////////para la busqueda interactiva pais///////////////////////////////
    DefaultTableModel mimodelo2 = new DefaultTableModel();
    boolean cambiobusqueda2=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
    /////////////////////////////////////////////////////////////////////////////////////
    Session Sesion=null;
    Cliente clie=new Cliente();
    Cliente clie2=new Cliente();
    Habitacion hab=new Habitacion();
    Pais pais=new Pais();
    Pais pais2=new Pais();
    Reservacion res=new Reservacion();
   // Cliente cli=new Cliente();
    Subreserva subres=new Subreserva();
    SubReservaGest subresgest= new SubReservaGest();
    Ocupaciones ocup=new Ocupaciones();
    Tipohab tipo=new Tipohab();
    Grupo grupo=new Grupo();
    ReservacionGest resges=new ReservacionGest();
    VariosGest varges=new VariosGest();
    Varios varios=new Varios();
    ClienteGest cligest=new ClienteGest();
    DocumentoGest docges=new DocumentoGest();
    FacturaGest facges=new FacturaGest();
    OcupacionesGest ocuges=new OcupacionesGest();
    HabitacionGest habges=new HabitacionGest();
    Subtipo subti=new Subtipo();

   /* class MiDefaultTableModel extends DefaultTableModel {   //esta clase hace que ninguna columna de jtable sea editable
        public MiDefaultTableModel() {
            super();
        }
        public boolean isCellEditable(int row, int col) {
            return false;
        }
   }*/

    public void actualizarFechaDeHoy(){
        fechadehoy=cluti.Date_StringDMA(clasesutiles.Calender_Date(Calendar.getInstance()));
    }

    public boolean permitidoBorrarSubres(int idsu){
        SubresxmulGest suxmulges=new SubresxmulGest();
        SubresxstoyservGest suxstoges=new SubresxstoyservGest();
        CliexsubGest clixsubges=new CliexsubGest();
        if(suxstoges.ExisteFKSubreserva(idsu)==false && suxmulges.ExisteFKSubreserva(idsu)==false && clixsubges.ExisteFKSubreserva(idsu)==false)
           return true;
        else
           return false;
    }

    public void actualizarCambio(){
     try{
         Transaction tx=null;
         Transaction tx1=null;
         ///////////////OBTIENE MONEDA2 DEL CAMBIO////////////////////////////////
             Moneda mone2=new Moneda();
             Sesion = NewHibernateUtil.getSessionFactory().openSession();
             tx1=Sesion.beginTransaction();
             int codm2=obtenerCodigoActualDeComboMoneda2();
             mone2=(Moneda)Sesion.get(Moneda.class, codm2);
             tx1.commit();
             CERRARSesion();
         //////////////////obtiene moneda 1///////////////////////////////////
         Sesion = NewHibernateUtil.getSessionFactory().openSession();
         Moneda moneda=new Moneda();
         tx=Sesion.beginTransaction();
         int codmo=obtenerCodigoActualDeComboMoneda();
         moneda=(Moneda)Sesion.get(Moneda.class, codmo);
         tx.commit();
         CERRARSesion();
         //////////////////////////////////////////////////////////////////////
         float montomoneda=Float.parseFloat(jTextField22.getText());
         float montoapagar=Float.parseFloat(jTextField21.getText());
         float montogs=0;
         float diferenciaguaranies=0;
     
         if(mone2!=null && moneda!=null){
             
             montogs=montomoneda*moneda.getVenta();
             diferenciaguaranies=(montogs-montoapagar);
             diferencia=cluti.redondear(diferenciaguaranies/mone2.getVenta());
             if(diferencia>=0)
                 jLabel48.setText(diferencia+"");
             else{
                 jLabel48.setText("Insuficiente");
                 //JOptionPane.showMessageDialog(null,"Monto pagado inferior al que se desea pagar","AVISO",JOptionPane.INFORMATION_MESSAGE);
                // this.jTextField22.requestFocus();
                // this.jTextField22.setText("0.0");
           }
        }
     }
     catch(HibernateException e){
        e.printStackTrace();
        //tx.rollback();
     }
    }

    public float actualizarMontoAPagar(){  //utilizo en el caso de que se quiera pagar en otra moneda y aun no se ha definido el monto pagado, entonces
     Transaction tx=null;
     float resu=0;
     Moneda mone=new Moneda();
     Sesion = NewHibernateUtil.getSessionFactory().openSession();
     try{
         tx=Sesion.beginTransaction();
         int codm=obtenerCodigoActualDeComboMoneda();
         mone=(Moneda)Sesion.get(Moneda.class, codm);
         tx.commit();
         CERRARSesion();
         if(mone!=null)
             resu=Float.parseFloat(jTextField21.getText())/mone.getVenta();
     }catch (HibernateException e) {
        e.printStackTrace();
     }
     return resu;
    }


   public void CERRARSesion(){
        if(Sesion.isOpen()){
            Sesion.flush();
            Sesion.clear();
            Sesion.close();
            System.out.println("cierra sesion");
        }
   }
   public void LimpiarCamposclie(){
     jTextField1.setText("");
     jTextField2.setText("");
     jTextField3.setText("");
     jTextField4.setText("");
    }

   public void LimpiarCamposclie2(){   //no limpia el pais
     jTextField2.setText("");
     jTextField3.setText("");
     jTextField4.setText("");
     //jFormattedTextField2.setText("");
     clieencontrado=false;
    }

   public void LimpiarCamposhab1(){   //no limpia el pais
     jTextField6.setText("");
     jTextField7.setText("");
     jTextField8.setText("0");
     jTextField9.setText("0");
     jFormattedTextField3.setText("");
     jFormattedTextField4.setText("");
    }


   public void LimpiarTodo1(){
        LimpiarCamposhab1();
        LimpiarCamposclie();
        modelores1= new MiDefaultTableModel();
        modelores11= new MiDefaultTableModel();
        modelores2= new MiDefaultTableModel();
        modelohabdispo = new MiDefaultTableModel();
        modelohabdispo.addColumn("Número");
        modelohabdispo.addColumn("Ubicación");
        jTable1.setModel(modelohabdispo);
        modelores1.addColumn("Número");
        modelores1.addColumn("Sub-Tipo");
        modelores1.addColumn("F.Entrada");
        modelores1.addColumn("F.Salida");
        modelores1.addColumn("precio");
        modelores1.addColumn("Media");
        modelores11.addColumn("idsubtipo");
        modelores11.addColumn("preciomediodia");
        modelores11.addColumn("idsubres");
        jTable2.setModel(modelores1);
        modelores2.addColumn("Código");
        modelores2.addColumn("Tipo");
        modelores2.addColumn("Cantidad");
        jTable3.setModel(modelores2);
        jFormattedTextField1.setText(cluti.ObtenerFechaSinGuion(fechadehoy));
        jFormattedTextField3.setText("");
        jFormattedTextField2.setText(cluti.ObtenerFechaSinGuion(manhana));
        jFormattedTextField4.setText("");
        clieencontrado=false;
        paisencontrado=false;
        reservacionencontrada=false;
   }
   public void limpiarHabDispo(){
        modelohabdispo = new MiDefaultTableModel();
        modelohabdispo.addColumn("Número");
        modelohabdispo.addColumn("Ubicación");
        jTable1.setModel(modelohabdispo);
   }
   public void LimpiarCampos2(){   //no limpia el pais
     jTextField11.setText("");
     jTextField12.setText("");
     jTextField13.setText("");
     jTextField15.setText("");
     jFormattedTextField5.setText("");
     clie2encontrado=false;
    }
   public void LimpiarCamposclie22(){
       // jTextField14.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField15.setText("");
        jFormattedTextField5.setText("");
   }

   public void refrescarlista(){
   if(jRadioButton1.isSelected()==true)
            CargarLista1();
        else{
            if(jRadioButton2.isSelected()==true)
                CargarLista2();
            else{
                if(jRadioButton3.isSelected()==true)
                    CargarLista4();
                else{
                    if(jRadioButton7.isSelected()==true)
                    CargarLista3();
                    else{
                        if(jRadioButton8.isSelected()==true)
                            CargarLista5();
                    }
                }
            }
        }
   }
   public void LimpiarCamposPago(){
     jTextField21.setText("0.0");
     jTextField22.setText("0.0");
     jTextField23.setText("");
     jTextField24.setText("");
     jFormattedTextField7.setText("");
     jComboBox3.setSelectedIndex(0);
     jComboBox4.setSelectedIndex(0);
     jComboBox5.setSelectedIndex(0);
     jComboBox6.setSelectedIndex(0);
    }
   public void LimpiarCamposCheckOut(){
     jTextField16.setText("");
     jTextField17.setText("0.0");
     jTextField18.setText("0.0");
     jTextField19.setText("0.0");
     jTextField20.setText("0.0");
     jTextField25.setText("0.0");
     jTextField26.setText("0.0");
     jTextField28.setText("0.0");
     //jFormattedTextField6.setText("");
    }

   public void deshabilitarbotones(){
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton6.setEnabled(false);
   }

   public void deshabilitarbotones2(){
        jButton13.setEnabled(false);
        jButton15.setEnabled(false);
        jButton20.setEnabled(false);
   }

   public void habilitarbotones(){
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton6.setEnabled(true);
   }
    public void habilitarbotones2(){
        jButton13.setEnabled(true);
        jButton15.setEnabled(true);
        jButton20.setEnabled(true);
   }
   public boolean estanCompletosLosCamposPago(Formapago form1, Banco ban, String nudo, String fec){
    int resul=0;
    if(form1.getTienebanco()=='1'){
        if(ban!=null){
            if (ban.getIdbanco()==0)
                resul++;
        }else
            resul++;
    }
    if(form1.getTienefecha()=='1'){
        if(cluti.FechaValidaDMA(fec)==false)
            resul++;
    }
    if(form1.getTienenumero()=='1'){
        if(nudo.isEmpty())
            resul++;
    }
    if (resul==0)
        return true;
    else
        return false;
  }

   public void nuevo(){
        boolean nocambiar=false;
        actualizarFechaDeHoy();
        if(cambios1){
            int x=JOptionPane.showConfirmDialog(null,"¿Descartar los cambios hechos en la actual reservación?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(x!=0)
                nocambiar=true;
        }
        if(nocambiar==false){
            int idr=resges.getsiguientecodigo();                          //boton nuevo
            reservacionencontrada=false;  //siemrpe va a ser false al darle nuevo xq no esta bien cargada aun
            if(idr>0){
                this.LimpiarTodo1();
                res=new Reservacion();
                res.setIdres(idr);
                res.setActiva('1');
                res.setCheckin('0');
                res.setCheckout('0');
                habilitarbotones();
                this.jTabbedPane1.setEnabledAt(1, false);
                this.jTabbedPane1.setEnabledAt(2, false);
                resnueva=true;
                this.subto=0;
                jLabel1.setText("TOTAL PARCIAL: "+this.conv.conversion(subto));
            }
            else{
                deshabilitarbotones();
                res=new Reservacion();
            }
        }
   }
   public void borrar(){   //borra una reservacion
            int x=JOptionPane.showConfirmDialog(null,"¿Desea BORRAR esta reservación?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(x==0){
                if(Integer.parseInt(Character.toString(res.getCheckin()))==0){  //si no se ha hecho aun check-in
                    Transaction tx=null;
                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                    try{
                        tx=Sesion.beginTransaction();
                        Reservacion re=new Reservacion();
                        re=(Reservacion) Sesion.load(Reservacion.class, res.getIdres());
                        re.setActiva('0');
                        //Sesion.update(res);
                        tx.commit();
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tx.begin();
                        SQLQuery q=Sesion.createSQLQuery("Select o.idocup from Reservacion as r, Ocupaciones as o where o.idres = r.idres and r.idres = "+res.getIdres());
                        List li=q.list();
                        tx.commit();
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tx.begin();
                        for(int i=0; i<li.size();i++){
                            Object ob=new Object();
                            ob=(Object) li.get(i);
                            
                            Ocupaciones oc=new Ocupaciones();
                            oc=(Ocupaciones)Sesion.get(Ocupaciones.class, Integer.parseInt(ob.toString()));
                            if(oc!=null){
                                ocuges.delOcupaciones(oc);
                            }
                        }
                        tx.commit();
                        JOptionPane.showMessageDialog(null,"Borrado Correcto","AVISO",JOptionPane.INFORMATION_MESSAGE);
                        refrescarlista();
                        LimpiarTodo1();
                        cambios1=false;
                        this.deshabilitarbotones();
                    }
                    catch(HibernateException e){
                        e.printStackTrace();
                        tx.rollback();
                    }
                    this.CERRARSesion();
                }
                else
                    JOptionPane.showMessageDialog(null,"No esta permitido borrar una reseva una vez hecho el Check-in de la misma","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
           }
   }
   public boolean buscarPais(String co){
       Sesion=NewHibernateUtil.getSessionFactory().openSession();
       Transaction tx=null;
       try{
            tx=Sesion.beginTransaction();
            Query q=Sesion.createQuery("from Pais where idpais = "+co);
            List li=q.list();
            if(li.size()>0){
                pais=(Pais)li.get(0);
                paisencontrado=true;
                jTextField1.setText(pais.getDescrippais());
           }
           else{
                paisencontrado=false;
                pais=new Pais();
           }
                tx.commit();
            this.CERRARSesion();
        }
        catch(ObjectNotFoundException e){
            paisencontrado=false;
            pais=new Pais();
        }
        this.CERRARSesion();
        return paisencontrado;
   }
   
   public boolean buscarPais2(String co){
       Sesion=NewHibernateUtil.getSessionFactory().openSession();
       Transaction tx=null;
       try{
            tx=Sesion.beginTransaction();
            Query q=Sesion.createQuery("from Pais where idpais = "+co);
            List li=q.list();
            if(li.size()>0){
                pais2=(Pais)li.get(0);
                pais2encontrado=true;
                jTextField14.setText(pais.getDescrippais());
           }
           else{
                pais2encontrado=false;
                pais2=new Pais();
           }
                tx.commit();
            this.CERRARSesion();
        }
        catch(ObjectNotFoundException e){
            pais2encontrado=false;
            pais2=new Pais();
        }
       
        this.CERRARSesion();
        return pais2encontrado;
   }

   public boolean existeClieEnReservacion(int cod, Reservacion re){  //para comprobar que el cliente no ha sido cargado a la reservacion
        boolean existe=false;
        Transaction tx=null;
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            SQLQuery q=Sesion.createSQLQuery("Select c.idcli from cliexsub as c, subreserva as s where s.idsubres = c.idsubres and s.idres = "+re.getIdres()+" and c.idcli = "+cod);
            if(q.list().size()>0){
                existe=true;
            }
            else
                existe=false;
            tx.commit();
            this.CERRARSesion();
        } catch(HibernateException ex){
            tx.rollback();
            ex.printStackTrace();
       }
       return existe;
   }

   public boolean existeClieEnGrilla(int codcl){
       boolean existe=false;
       int tam=modeloclie1.getRowCount();
       if(tam>0){
            for(int i=0;i<tam;i++){
                int cod=Integer.parseInt(modeloclie1.getValueAt(i, 0).toString());
                if(codcl==cod){
                    existe=true;
                    break;
                }
            }
       }
        else
            existe=false;
       return existe;
   }
   public void cargarcombo(){
   Transaction txx1=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            txx1=Sesion.beginTransaction();
            mimodelocombo= new DefaultComboBoxModel();
            Query qq=Sesion.createQuery("from Tipohab");
            List liis= qq.list();
            if(qq.list().size()>0){
                for (int i=0;i<liis.size();i++){
                    tipo=(Tipohab)liis.get(i);
                    mimodelocombo.addElement(tipo.getIdtipoh()+"- "+tipo.getDescripth());
                }
            }
            jComboBox1.setModel(mimodelocombo);
            txx1.commit();
       }
       catch(HibernateException e){
           txx1.rollback();
            e.printStackTrace();
       }
        this.CERRARSesion();
   }
  public void cargarcombosubtipo(){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            modelocombosubtipo= new DefaultComboBoxModel();
            modelocombosubtipo2= new DefaultComboBoxModel();
            Query q=Sesion.createQuery("from Subtipo");
            List lis= q.list();
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    Subtipo suti=new Subtipo();
                    suti=(Subtipo)lis.get(i);
                    modelocombosubtipo.addElement(suti.getDescsubtipo());
                    modelocombosubtipo2.addElement(suti.getIdsubtipo());
                }
            }
            jComboBox7.setModel(modelocombosubtipo);
            tx.commit();
       }
       catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }

   public void ubicarComboSubTipoEnPosicion(int cod){
        int lon=this.modelocombosubtipo2.getSize();
        for(int i=0;i<lon;i++){
            int codi=Integer.parseInt(modelocombosubtipo2.getElementAt(i).toString());  //busca el codigo del otro modelo que tiene los codigos
            if(codi==cod)
                this.jComboBox7.setSelectedIndex(i);  //ubica el combo en la posicion correcta
        }
   }

   public int obtenerCodigoActualDeComboSubTipo(){
        int resu=Integer.parseInt(modelocombosubtipo2.getElementAt(jComboBox7.getSelectedIndex()).toString());
        return resu;
   }

   public boolean obtenerObjetoSubTipoDeCombo(){
       boolean resp=false;
       try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx=Sesion.beginTransaction();
            this.subti=new Subtipo();
            subti=(Subtipo)Sesion.get(Subtipo.class, this.obtenerCodigoActualDeComboSubTipo());
            tx.commit();
            this.CERRARSesion();
            if(subti!=null)
                resp= true;
            else
                resp= false;
       } catch (HibernateException e) {
           e.printStackTrace();
       }
       return resp;
   }

   public void cargarComboMoneda(){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            modelocombomoneda1= new DefaultComboBoxModel();
            modelocombomoneda11= new DefaultComboBoxModel();
            Query q=Sesion.createQuery("from Moneda"); 
            List lis= q.list();
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    Moneda mon=new Moneda();
                    mon=(Moneda)lis.get(i);
                    modelocombomoneda1.addElement(mon.getMoneda());
                    modelocombomoneda11.addElement(mon.getIdmoneda());
                }
            }
            jComboBox3.setModel(modelocombomoneda1);
            tx.commit();
       }
       catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }

   public void cargarComboMoneda2(){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            modelocombomoneda2= new DefaultComboBoxModel();
            modelocombomoneda22= new DefaultComboBoxModel();
            Query q=Sesion.createQuery("from Moneda");
            List lis= q.list();
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    Moneda mon=new Moneda();
                    mon=(Moneda)lis.get(i);
                    modelocombomoneda2.addElement(mon.getIdmoneda()+"- "+mon.getMoneda());
                    modelocombomoneda22.addElement(mon.getIdmoneda());
                }
            }
            jComboBox6.setModel(modelocombomoneda2);
            tx.commit();
       }
       catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }

   public void cargarComboBanco(){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            modelocombobanco= new DefaultComboBoxModel();
            modelocombobanco2= new DefaultComboBoxModel();
            Query q=Sesion.createQuery("from Banco order by nombrebanco");
            List lis= q.list();
            modelocombobanco.addElement("ninguno");
            modelocombobanco2.addElement(0);
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    Banco ban=new Banco();
                    ban=(Banco)lis.get(i);
                    modelocombobanco.addElement(ban.getNombrebanco());
                    modelocombobanco2.addElement(ban.getIdbanco());
                }
            }
            jComboBox5.setModel(modelocombobanco);
            tx.commit();
       }
       catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }

    public void cargarComboFormaPago(){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            modelocomboformapago= new DefaultComboBoxModel();
            modelocomboformapago2= new DefaultComboBoxModel();
            Query q=Sesion.createQuery("from Formapago");  //solo funciona con idres, no con reservacion
            List lis= q.list();
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    Formapago forma=new Formapago();
                    forma=(Formapago)lis.get(i);
                    modelocomboformapago.addElement(forma.getDescripformapa());
                    modelocomboformapago2.addElement(forma.getIdforma());
                }
            }
            jComboBox4.setModel(modelocomboformapago);
            tx.commit();
       }
       catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }

      public void cargarcombo2(){
   Transaction txx1=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            txx1=Sesion.beginTransaction();
            Tipodocumento tipodoc=new Tipodocumento();
            mimodelocombo2= new DefaultComboBoxModel();
            Query qq=Sesion.createQuery("from Tipodocumento");  //solo funciona con idres, no con reservacion
            List liis= qq.list();
            if(qq.list().size()>0){
                for (int i=0;i<liis.size();i++){
                    tipodoc=(Tipodocumento)liis.get(i);
                    mimodelocombo2.addElement(tipodoc.getIdtipodoc()+"- "+tipodoc.getDescriptipodoc());
                }
            }
            jComboBox2.setModel(mimodelocombo2);
            txx1.commit();
       }
       catch(HibernateException e){
           txx1.rollback();
            e.printStackTrace();
       }
        this.CERRARSesion();
   }

   public void cargarTablaReserva1(int idre){
       Transaction txx=null;
       modelores1=new MiDefaultTableModel();
       modelores1.addColumn("Número");                                                                         
       modelores1.addColumn("Sub-Tipo");                                                                               //hay forma de saber si es media reserva o no
       modelores1.addColumn("F.Entrada");
       modelores1.addColumn("F.Salida");
       modelores1.addColumn("precio");
       modelores1.addColumn("Media");
       modelores11=new MiDefaultTableModel();
       modelores11.addColumn("idsubtipo");
       modelores11.addColumn("preciomediodia");
       modelores11.addColumn("idsubres");
       try{
            Sesion=NewHibernateUtil.getSessionFactory().openSession();
            txx=Sesion.beginTransaction();
            //modelores1=new MiDefaultTableModel();
            Query qu=Sesion.createQuery("select distinct o from Ocupaciones o where o.reservacion = "+idre+" and o.estado > 0 and o.estado < 3 ");
            List liis= qu.list();
            if(liis.size()>0){  //el codigo comentado por el if era en el caso de que fuere una reserva web para poder confirmarla
                /*for (int i=0;i<liis.size();i++){
                    ocup=(Ocupaciones)liis.get(i);
                    int idha=ocup.getHabitacion().getIdhabit();
                    boolean existe=false;
                    for(int j=0;j<modelores1.getRowCount();j++){  //para que no existe 2 veces la misma hab en el modelo
                        if(Integer.parseInt(modelores1.getValueAt(j, 0).toString())==idha){
                            existe=true;
                            break;
                        }
                    }
                    if(existe==false){
                        String fecini=obtenerMenorFechaDeList(idre, idha);  //fechas de inicio y fin de cada habitacion;
                        String fecfin=obtenerMayorFechaDeList(idre, idha);
                        Object [] fil = new Object[6]; // Hay cinco columnas en la tabla
                        fil[0] = idha;
                        fil[1] = ocup.getSubtipo().getDescsubtipo();
                        fil[2] = cluti.Remplazar('-', '/', fecini);
                        fil[3] = cluti.Remplazar('-', '/', fecfin);
                        fil[4] = ocup.getSubtipo().getPrecioxnoche();
                        fil[5] = "NO";
                        modelores1.addRow(fil);// Se añade al modelo la fila completa.
                        Object obj2=new Object();
                        obj2=Float.toString(ocup.getSubtipo().getPreciocorto());
                        subto=subto+ocup.getSubtipo().getPrecioxnoche();
                    }
                }
                jTable2.setModel(modelores1);
                jLabel1.setText("TOTAL PARCIAL: "+subto);*/
           }else{  //si no existe en ocupaciones con estado >0 y <3, debe existir en subreservas
            /////////////////////////busca si ya se confirmo la reservacion en el hotel, es decir si existe subreserva creada////////////////////////////
                Query q=Sesion.createQuery("from Subreserva where idres = "+idre); //selecciono desde subreserva porque ya existe en subreserva y de esta forma puede existir una res corta,                                                                            //lo que no se puede saber buscando de ocupaciones
               List<Subreserva> listaSubres= q.list();         //una vez hecho la reservacion en el hotel, se carga desde subreservas xq desde ocupaciones no
                if(listaSubres.size()>0){            //si se reservo por web se confirma, y se carga la grilla desde ocupaciones o si se borraron las ocupaciones viejas
                    for (int i=0;i<listaSubres.size();i++){
                        subres=listaSubres.get(i);
                        int idha=subres.getHabitacion().getIdhabit();
                        Object [] fil = new Object[6]; // Hay cinco columnas en la tabla
                        fil[0] = idha;
                        fil[1] = subres.getSubtipo().getDescsubtipo();
                        fil[2] = cluti.Remplazar('-', '/',cluti.Date_StringDMA(subres.getFechaocup()));
                        fil[3] = cluti.Remplazar('-', '/',cluti.Date_StringDMA(subres.getFechadesoc()));
                        fil[4] = subres.getSubtipo().getPrecioxnoche();
                        String re="SI";
                        if(Integer.parseInt(Character.toString(subres.getEscorta()))==0)
                            re="NO";
                        fil[5] = re;
                        modelores1.addRow(fil);// Se añade al modelo la fila completa.
                        Object[] obj2=new Object[3];
                        obj2[0]=Integer.toString(subres.getSubtipo().getIdsubtipo());
                        obj2[1]=Float.toString(subres.getSubtipo().getPreciocorto());
                        obj2[2]=subres.getIdsubres();
                        modelores11.addRow(obj2);  //agrega a la tabla 2 el codigo del subtipo y el precio corto
                        subto=res.getTotalres();
                    }                                                                                                   //solamente el costo de las habitaciones
                    jTable2.setModel(modelores1);
                    jLabel1.setText("TOTAL PARCIAL: "+this.conv.conversion(subto));
                }else{  //si no tiene hab cargadas limpia, esto no deberia ejecutarse
                    modelores1 = new MiDefaultTableModel();
                    modelores1.addColumn("Número");
                    modelores1.addColumn("Sub-Tipo");  //subtipo
                    modelores1.addColumn("F.Entrada");
                    modelores1.addColumn("F.Salida");
                    modelores1.addColumn("precio");
                    modelores1.addColumn("Media");

                    jTable2.setModel(modelores1);
                }
               // txx.commit();
                //this.CERRARSesion();
            }
            txx.commit();
            this.CERRARSesion();
        }
        catch(HibernateException e){
            txx.rollback();
            e.printStackTrace();
        }
       
    }
    public void cargarTablaReserva1DespuesDeVolerDeSeleccionDeHabitacionesDesdeLaGrilla(List<GrupoReservas> gruposReservas){
       modelores1=new MiDefaultTableModel();
       modelores1.addColumn("Número");
       modelores1.addColumn("Sub-Tipo");                                                                               //hay forma de saber si es media reserva o no
       modelores1.addColumn("F.Entrada");
       modelores1.addColumn("F.Salida");
       modelores1.addColumn("precio");
       modelores1.addColumn("Media");
       modelores11=new MiDefaultTableModel();
       modelores11.addColumn("idsubtipo");
       modelores11.addColumn("preciomediodia");
       modelores11.addColumn("idsubres");
       try{
            Sesion=NewHibernateUtil.getSessionFactory().openSession();
            Sesion.getTransaction().begin();
            if(gruposReservas.size()>0){
                Calendar cal=new GregorianCalendar();
                for (GrupoReservas gr:gruposReservas){
                    Object [] fil = new Object[6]; // Hay cinco columnas en la tabla
                    fil[0] = gr.getIdHabitacion();
                    fil[1] = gr.getSubTipo().getDescsubtipo();
                    fil[2] = cluti.Remplazar('-', '/',cluti.Date_StringDMA(gr.getFechaInicio()));
                    cal.setTime(gr.getFechaFin());
                    cal=cluti.addXDays(cal, 1);
                    fil[3] = cluti.Remplazar('-', '/',cluti.Date_StringDMA(cal.getTime()));
                    fil[4] = gr.getSubTipo().getPrecioxnoche();
                    String re="SI";
                    if(gr.getEsMediaReserva()==false){
                        re="NO";
                    }
                    fil[5] = re;
                    modelores1.addRow(fil);// Se añade al modelo la fila completa.
                    fil=new Object[3];
                    fil[0]=Integer.toString(gr.getSubTipo().getIdsubtipo());
                    fil[1]=Float.toString(gr.getSubTipo().getPreciocorto());
                    fil[2]=gr.getIdSubreserva();
                    modelores11.addRow(fil);  //agrega a la tabla 2 el codigo del subtipo y el precio corto
                    //subto=res.getTotalres();
                }
                jTable2.setModel(modelores1);
             //   jLabel1.setText("TOTAL PARCIAL: "+this.conv.conversion(subto));

            }
        }
        catch(HibernateException e){
            e.printStackTrace();
        }

    }
    public void cargarTablacheck1(){   //carga toda la tabla de checkin
        modelocheck1 = new MiDefaultTableModel();
        modelocheck1.addColumn("Nº Habitación");
        modelocheck1.addColumn("Tipo");
        modelocheck1.addColumn("Adultos ocupantes");
        modelocheck1.addColumn("Niños ocupantes");
        modelocheck1.addColumn("Fecha Entrada");
        modelocheck1.addColumn("Fecha Salida");
        modelocheck1.addColumn("Id Sub");
        Transaction tx=null;
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            SQLQuery q=Sesion.createSQLQuery("Select s.idsubres, c.idcli, c.fechanac, CURDATE(), (YEAR(CURDATE())-YEAR(fechanac))- (RIGHT(CURDATE(),5)<RIGHT(fechanac,5)) as edad from cliente as c, subreserva as s, cliexsub as cs where c.idcli=cs.idcli and cs.idsubres=s.idsubres and s.idres ="+res.getIdres()+" order by idhabit");
            List li=q.list();
            tx.commit();
            this.CERRARSesion();
            if(li.size()>0){
                Object[] objeto=new Object[5];
                int[][] arreglo=new int[li.size()][3];  //guarda el id de la habit y la cant de adultos y ninhos que tiene esa habit;
                int idsub=0;
                int idsub2=0;
                int contadu=0;
                int contnin=0;
                int conthab=0; //cuenta la cantidad de habitaciones para pasarle al arreglo;
                int edad=0;
                String tipohab="";
                objeto=(Object[])li.get(0);
                idsub=Integer.parseInt(objeto[0].toString());
                for(int i=0;i<li.size();i++){
                    objeto=(Object[])li.get(i);
                    idsub2=Integer.parseInt(objeto[0].toString());
                    edad=Integer.parseInt(objeto[4].toString());
                    if(idsub==idsub2){
                        if(edad>EDADLIMITEDENINHO)  //si es adulto
                            contadu++;
                        else
                            contnin++;
                    }
                    else{
                        arreglo[conthab][0]=idsub;
                        arreglo[conthab][1]=contadu;
                        arreglo[conthab][2]=contnin;
                        if(edad>EDADLIMITEDENINHO){  //si es adulto
                            contadu=1;
                            contnin=0;
                        }
                        else{  //si es ninho
                            contadu=0;
                            contnin=1;
                        }
                        conthab++;
                        idsub=idsub2;  //iguala los id al cambiar de subreserva
                    }
                }
                arreglo[conthab][0]=idsub;   //cuando sale debe guardar los datos de la ultima habitacion
                arreglo[conthab][1]=contadu;
                arreglo[conthab][2]=contnin;
                for(int j=0;j<=conthab;j++){
                    Transaction tx1=null;
                    Transaction tx2=null;
                    int codSub=arreglo[j][0];
                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                    tx1=Sesion.beginTransaction();
                    Subreserva su=(Subreserva) Sesion.get(Subreserva.class, codSub);
                    tipohab=su.getHabitacion().getTipohab().getDescripth();
                    Object[] fiila=new Object[7];
                    fiila[0]=su.getHabitacion().getIdhabit();
                    fiila[1]=tipohab;
                    fiila[2]=arreglo[j][1];
                    fiila[3]=arreglo[j][2];
                    fiila[4]=cluti.Remplazar('-','/',cluti.Date_StringDMA(su.getFechaocup()));
                    fiila[5]=cluti.Remplazar('-','/',cluti.Date_StringDMA(su.getFechadesoc()));
                    fiila[6]=su.getIdsubres();
                    modelocheck1.addRow(fiila);
                    tx1.commit();
                    CERRARSesion();
                }

            }
            Transaction tx1=null;
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx1=Sesion.beginTransaction();
            SQLQuery qqq=Sesion.createSQLQuery("Select h.idhabit, t.descripth, s.fechaocup, s.fechadesoc, s.idsubres from habitacion as h, tipohab as t, subreserva as s where h.idtipoh=t.idtipoh and s.idhabit=h.idhabit and s.idres= "+res.getIdres()+" and s.idsubres not in(Select idsubres from cliexsub)");  //todas las habitaciones en subreservas que aun no fueron cargadas
            List liss=qqq.list();
            tx1.commit();
            CERRARSesion();
            for(int i=0;i<liss.size();i++){
                Object[] obje1=new Object[5];
                Object[] obje2=new Object[7];
                obje1=(Object[]) liss.get(i);
                obje2[0]=obje1[0].toString();
                obje2[1]=obje1[1].toString();
                obje2[2]="0";
                obje2[3]="0";
                obje2[4]=cluti.FormatearFecha(cluti.Remplazar('-','/',obje1[2].toString()));
                obje2[5]=cluti.FormatearFecha(cluti.Remplazar('-','/',obje1[3].toString()));
                obje2[6]=obje1[4];
                modelocheck1.addRow(obje2);
            }
       }
       catch(HibernateException ex){
            tx.rollback();
            ex.printStackTrace();
       }
       jTable6.setModel(modelocheck1);
   }
  /* public void cargarTablacheck1(){   //carga toda la tabla de checkin
        modelocheck1 = new MiDefaultTableModel();
        modelocheck1.addColumn("Nº Habitación");
        modelocheck1.addColumn("Tipo");
        modelocheck1.addColumn("Adultos ocupantes");
        modelocheck1.addColumn("Niños ocupantes");
        modelocheck1.addColumn("Fecha Entrada");
        modelocheck1.addColumn("Fecha Salida");

        Transaction tx=null;
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            SQLQuery q=Sesion.createSQLQuery("Select s.idhabit, c.idcli, c.fechanac, CURDATE(), (YEAR(CURDATE())-YEAR(fechanac))- (RIGHT(CURDATE(),5)<RIGHT(fechanac,5)) as edad from cliente as c, subreserva as s, cliexsub as cs where c.idcli=cs.idcli and cs.idsubres=s.idsubres and s.idres ="+res.getIdres()+" order by idhabit");
            List li=q.list();
            tx.commit();
            this.CERRARSesion();
            if(li.size()>0){
                Object[] objeto=new Object[5];
                int[][] arreglo=new int[li.size()][3];  //guarda el id de la habit y la cant de adultos y ninhos que tiene esa habit;
                int idha=0;
                int idha2=0;
                int contadu=0;
                int contnin=0;
                int conthab=0; //cuenta la cantidad de habitaciones para pasarle al arreglo;
                int edad=0;
                String tipohab="";
                objeto=(Object[])li.get(0);
                idha=Integer.parseInt(objeto[0].toString());
                for(int i=0;i<li.size();i++){
                    objeto=(Object[])li.get(i);
                    idha2=Integer.parseInt(objeto[0].toString());
                    edad=Integer.parseInt(objeto[4].toString());
                    if(idha==idha2){
                        if(edad>EDADLIMITEDENINHO)  //si es adulto
                            contadu++;
                        else
                            contnin++;
                    }
                    else{
                        arreglo[conthab][0]=idha;
                        arreglo[conthab][1]=contadu;
                        arreglo[conthab][2]=contnin;
                        if(edad>EDADLIMITEDENINHO){  //si es adulto
                            contadu=1;
                            contnin=0;
                        }
                        else{  //si es ninho
                            contadu=0;
                            contnin=1;
                        }
                        conthab++;
                        idha=idha2;  //iguala los id al cambiar de habitacion
                    }
                }
                arreglo[conthab][0]=idha;   //cuando sale debe guardar los datos de la ultima habitacion
                arreglo[conthab][1]=contadu;
                arreglo[conthab][2]=contnin;
                for(int j=0;j<=conthab;j++){
                    Transaction tx1=null;
                    Transaction tx2=null;
                    int cod=arreglo[j][0];
                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                    tx1=Sesion.beginTransaction();
                    Habitacion ha=(Habitacion) Sesion.get(Habitacion.class, cod);
                    tipohab=ha.getTipohab().getDescripth();
                    tx1.commit();
                    CERRARSesion();
                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                    tx2=Sesion.beginTransaction();
                    Query qqq=Sesion.createQuery("from Subreserva where idhabit ="+cod+" and idres = "+this.res.getIdres());
                    Subreserva sure=null;
                    if(qqq.list().size()>0){
                        sure=(Subreserva) qqq.list().get(0);
                        Object[] fiila=new Object[6];
                        fiila[0]=cod;
                        fiila[1]=tipohab;
                        fiila[2]=arreglo[j][1];
                        fiila[3]=arreglo[j][2];
                        fiila[4]=cluti.Remplazar('-','/',cluti.Date_StringDMA(sure.getFechaocup()));
                        fiila[5]=cluti.Remplazar('-','/',cluti.Date_StringDMA(sure.getFechadesoc()));
                        modelocheck1.addRow(fiila);
                    }
                    tx2.commit();
                    this.CERRARSesion();
                }
     
            }
            Transaction tx1=null;
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx1=Sesion.beginTransaction();
            SQLQuery qqq=Sesion.createSQLQuery("Select h.idhabit, t.descripth, s.fechaocup, s.fechadesoc from habitacion as h, tipohab as t, subreserva as s where h.idtipoh=t.idtipoh and s.idhabit=h.idhabit and s.idres= "+res.getIdres()+" and s.idsubres not in(Select idsubres from cliexsub)");  //todas las habitaciones en subreservas que aun no fueron cargadas
            List liss=qqq.list();
            tx1.commit();
            CERRARSesion();
            for(int i=0;i<liss.size();i++){
                Object[] obje1=new Object[4];
                Object[] obje2=new Object[6];
                obje1=(Object[]) liss.get(i);
                obje2[0]=obje1[0].toString();
                obje2[1]=obje1[1].toString();
                obje2[2]="0";
                obje2[3]="0";
                obje2[4]=cluti.FormatearFecha(cluti.Remplazar('-','/',obje1[2].toString()));
                obje2[5]=cluti.FormatearFecha(cluti.Remplazar('-','/',obje1[3].toString()));
                modelocheck1.addRow(obje2);
            }
       }
       catch(HibernateException ex){
            tx.rollback();
            ex.printStackTrace();
       }
       jTable6.setModel(modelocheck1);
   }*/
   public void cargarTablaCheckout(){
        Transaction tx=null;
        modelocheckout= new MiDefaultTableModel();
        modelocheckout.addColumn("Nº Habitación");
        modelocheckout.addColumn("Fecha Check-In");
        modelocheckout.addColumn("Subtotal");
        modelocheckout.addColumn("Total Abonado");
        modelocheckout.addColumn("Total");
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            Query q=Sesion.createQuery("from Subreserva where feyhocheckout is null and idres = "+res.getIdres());//and feyhocheckin is not null  se hace la likidacion de todas, hecho o no el checkin
            List milisr= q.list();
            tx.commit();
            CERRARSesion();
            for (int i=0;i<milisr.size();i++){
                Subreserva sr=(Subreserva) milisr.get(i);
                float total=this.calcularTotalConsumisionSubres(sr.getIdsubres())+this.calcularTotalHospedajeSubres(sr.getIdsubres())+this.calcularTotalServiciosSubres(sr.getIdsubres())+calcularTotalMultasSubres(sr.getIdsubres());
                Object [] ffi = new Object[5]; // Hay cinco columnas en la tabla
                ffi[0] = sr.getHabitacion().getIdhabit();
                if(sr.getFeyhocheckin()!=null)
                    ffi[1] = cluti.Date_StringDMA(sr.getFeyhocheckin());
                else
                    ffi[1] = "Sin Checkin";
                ffi[2] = total;
                ffi[3] = sr.getMontoabonado();
                ffi[4] = total-sr.getMontoabonado();
                modelocheckout.addRow(ffi);// Se añade al modelo la fila completa.
             }
             LimpiarCamposCheckOut();
             jTable5.setModel(modelocheckout);
          } catch(HibernateException ex){
              ex.printStackTrace();
        }
   }

   public void cargarTablaCotizacion(){
        Transaction tx=null;
        modelocotizacion= new MiDefaultTableModel();
        modelocotizacion.addColumn("Moneda");
        modelocotizacion.addColumn("Cotización");
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            Query q=Sesion.createQuery("from Moneda");
            List milicot= q.list();
            int lo=milicot.size();
            tx.commit();
            CERRARSesion();
            if(lo>1){//porque guaranies es el 1ero y ese no se muestra
            for (int i=1;i<lo;i++){
                Moneda mo=(Moneda) milicot.get(i);
                Object [] f = new Object[2];
                f[0] = mo.getMoneda();
                f[1] = mo.getVenta();
                modelocotizacion.addRow(f);// Se añade al modelo la fila completa.
             }
             
            }
          } catch(HibernateException ex){
              ex.printStackTrace();
        }
        jTable7.setModel(modelocotizacion);
   }

   public void actualizarListacheckin1DesdeLaGrilla(){
           mimodelolista2=new DefaultListModel();
           Transaction tx=null;
        try{
            int tama=modelocheck1.getRowCount();
            int cont=0;
            for(int i=0;i<tama;i++){
                String codhab=modelocheck1.getValueAt(i, 0).toString();
                String codsub=modelocheck1.getValueAt(i, 6).toString();
                mimodelolista2.add(cont,"Habitación Nº: "+codhab+" = "+modelocheck1.getValueAt(i, 1).toString());
                cont++;
                if((Integer.parseInt(modelocheck1.getValueAt(i, 2).toString())+Integer.parseInt(modelocheck1.getValueAt(i, 3).toString()))>0){  //si hay huespedes asignados a esta habitacion
                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                    tx=Sesion.beginTransaction();
                    SQLQuery q=Sesion.createSQLQuery("Select c.nombre, c.apellido from cliente as c, subreserva as s, cliexsub as cs, habitacion as h where s.idhabit=h.idhabit and c.idcli=cs.idcli and cs.idsubres=s.idsubres and s.idsubres ="+codsub+" order by s.idsubres");
                    List li=q.list();
                    tx.commit();
                    this.CERRARSesion();
                    if(li.size()>0){
                        for(int j=0;j<li.size();j++){
                            Object[] objeto=new Object[2];
                            objeto=(Object[])li.get(j);
                            String nomcli = objeto[0].toString();
                            String apcli = objeto[1].toString();
                            mimodelolista2.add(cont,"      -"+nomcli+" "+apcli);
                            cont++;
                        }
                    }
                }else{
                    mimodelolista2.add(cont,"-HABITACIÓN VACÍA");
                    cont++;
                }

            }
            jList2.setModel(mimodelolista2);
        }
        catch(HibernateException ex){
             tx.rollback();
             ex.printStackTrace();
        }
        jList2.setModel(mimodelolista2);
     }
   private int obtenerIndiceTablaHabReservadasQueCoincidaConNroHabitacionYFechaActual(int NroHabit){ //primero busca si hay mas de 1 subreserva por habitacion
                                                                                                //si no hay subres con ese num hab retorna -1
                                                                                            //luego verifica si la fecha actual se encuentra entre alguna de ellas
                                                                                            //si no retorna la posision de la primera
       int cont=0;
       for(int i=0;i<this.modelocheck1.getRowCount();i++){  //busca cuantas hab repetidas hay
            int newNumHab=Integer.parseInt(this.modelocheck1.getValueAt(i, 0).toString());
            if(NroHabit == newNumHab){
                cont++;
            }
       }
       String strFechaHoy=cluti.Date_StringDMA(new Date());
       int resu=-1;
       if(cont>0){
           for(int i=0;i<this.modelocheck1.getRowCount();i++){ //busca si la fecha actual esta entre las fechas reservadas de esa habit

                String strFechaEntrada=this.modelocheck1.getValueAt(i, 4).toString();
                String strFechaSalida=this.modelocheck1.getValueAt(i, 5).toString();
                int newNumHab=Integer.parseInt(this.modelocheck1.getValueAt(i, 0).toString());
                System.out.println("recorre hab="+newNumHab);
                if(NroHabit == newNumHab && !(cluti.esFecha1MenorALaFecha2(strFechaHoy, strFechaEntrada) || cluti.esFecha1MayorALaFecha2(strFechaHoy, strFechaSalida))){
                    resu=i;
                    System.out.println("hab valida="+newNumHab);
                    break;
                }
           }
           if(resu<0){  //si no esta en el intervalo elije cualquiera (la primera)
                for(int i=0;i<this.modelocheck1.getRowCount();i++){
                     int newNumHab=Integer.parseInt(this.modelocheck1.getValueAt(i, 0).toString());
                    if(NroHabit == newNumHab){
                        resu=i;
                        break;
                    }
                }
           }
       }
        System.out.println("nro fila coincidente="+resu);
        return resu;
   }
   public boolean EstaDisponible(String f1, String f2, int idh){
        f1=cluti.FormatearFecha(f1);
        f2=cluti.FormatearFecha(f2);
        boolean ress=false;
        
        try {
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx= Sesion.beginTransaction();
            SQLQuery qu= Sesion.createSQLQuery("select idhabit, sum(idestado)as suma from Ocupaciones where idhabit = "+idh+" and idres <> "+this.res.getIdres()+" and fecha >= '"+f1+"' and fecha <  '"+f2+"' group by idhabit");  //marca como libre aunque la habitacion este ocupada por la misma reservacion para asi poder ampliar
            List ll=qu.list();
            if(ll.size()>0){
                Object[] obj=new Object[2];
                obj=(Object[]) ll.get(0);
                if(Integer.parseInt(obj[1].toString())==0)  //si la sumatoria es = 0 quiere decir que esta libre
                    ress=true;
                else
                    ress=false;
            }
            else
                ress=true;  //si la lista esta en cero quiere decir que no existe la habitacion en la fecha, o sea que esta libre
            tx.commit();
            this.CERRARSesion();
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx1=Sesion.beginTransaction();
            Query q=Sesion.createQuery("from Habitacion where idhabit = "+idh);
            if(q.list().size()>0){
                Habitacion habi=new Habitacion();
                habi=(Habitacion) q.list().get(0);
                if(habi.getEstado().getIdestado()>0) //si la habitacion tiene un estado permanenete distinto a libre
                    ress=false;
            }
            tx1.commit();
            this.CERRARSesion();
        }
        catch(HibernateException e){
            JOptionPane.showMessageDialog(null,"Error al calcular la disponibilidad de la habitación","ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
        return ress;
        
   }

   public void cargarAlModeloHabDispoLaHabitacion(int chab){
        Transaction tx6=null;
        Sesion = NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx6=Sesion.beginTransaction();
            Habitacion ha=new Habitacion();
            ha=(Habitacion) Sesion.get(Habitacion.class, chab);
            Object [] fill = new Object[2]; // Hay dos columnas en la tabla
            fill[0] = ha.getIdhabit();
            fill[1] = ha.getGrupo().getDescripgru();
            modelohabdispo.addRow(fill);// Se añade al modelo la fila completa.
            jTable1.setModel(modelohabdispo);
            tx6.commit();
        }
        catch(HibernateException e){
            e.printStackTrace();
            tx6.rollback();
        }
        this.CERRARSesion();
   }
   /*public String obtenerMayorFechaDeList(int idr, int idh){
        String str="";
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        tx=Sesion.beginTransaction();
        Query q=Sesion.createQuery("from Ocupaciones where idres = "+idr+" and idhabit = "+idh);
        List mili=q.list();
        tx.commit();
        this.CERRARSesion();
        int longi=mili.size();
        Ocupaciones ocu=new Ocupaciones();
        if(longi>0){
            ocu=(Ocupaciones) mili.get(0);
            Date mayfec=ocu.getFecha();
            Calendar c1=cluti.Date_Calender(mayfec);
            for(int i=0;i<longi;i++){
                ocu=(Ocupaciones) mili.get(i);
                Date fec=ocu.getFecha();
                Calendar c2=cluti.Date_Calender(fec);
                if(c2.compareTo(c1)>0)
                     c1=c2;

            }
            c1.add(Calendar.DATE,1);  //aumenta en 1 la cantidad de dias
            str=cluti.Date_StringDMA(clasesutiles.Calender_Date(c1));
        }
        return str;
   }

    public String obtenerMenorFechaDeList(int idr, int idh){
        String str="";
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        tx=Sesion.beginTransaction();
        Query q=Sesion.createQuery("from Ocupaciones where idres = "+idr+" and idhabit = "+idh);
        List mili=q.list();
        tx.commit();
        this.CERRARSesion();
        int longi=mili.size();
        Ocupaciones ocu=new Ocupaciones();
        if(longi>0){
            ocu=(Ocupaciones) mili.get(0);
            Date mayfec=ocu.getFecha();
            Calendar c1=cluti.Date_Calender(mayfec);
            for(int i=0;i<longi;i++){
                ocu=(Ocupaciones) mili.get(i);
                Date fec=ocu.getFecha();
                Calendar c2=cluti.Date_Calender(fec);

                if(c2.compareTo(c1)<0)
                    c1=c2;

            }

            str=cluti.Date_StringDMA(clasesutiles.Calender_Date(c1));
        }
        return str;
   }*/
    public String obtenerFechaInicio(int idr){
        String str="";
        int longi=modelores1.getRowCount();
        Calendar c1=null;
        if(longi>0){
             try {
                Date mayfec=cluti.StrDMA_Date(modelores1.getValueAt(0, 2).toString());
                c1=cluti.Date_Calender(mayfec);
                for(int i=0;i<longi;i++){
                    Date fec = cluti.StrDMA_Date(modelores1.getValueAt(i, 2).toString());
                    Calendar c2 = cluti.Date_Calender(fec);
                    if (c2.compareTo(c1) < 0)
                        c1 = c2;
                }
            }
            catch (ParseException ex) {
                   // Logger.getLogger(FrmReserva.class.getName()).log(Level.SEVERE, null, ex);
            }
        str=cluti.Date_StringDMA(clasesutiles.Calender_Date(c1));
        }else
            str=null;
        return str;
   }
   public String obtenerFechaFin(int idr){
        String str="";
        int longi=modelores1.getRowCount();
        Calendar c1=null;
        if(longi>0){
             try {
                Date mayfec=cluti.StrDMA_Date(modelores1.getValueAt(0, 3).toString());
                c1=cluti.Date_Calender(mayfec);
                for(int i=0;i<longi;i++){
                    Date fec = cluti.StrDMA_Date(modelores1.getValueAt(i, 3).toString());
                    Calendar c2 = cluti.Date_Calender(fec);
                    if (c2.compareTo(c1) > 0)
                        c1 = c2;
                }
            }
            catch (ParseException ex) {
                // Logger.getLogger(FrmReserva.class.getName()).log(Level.SEVERE, null, ex);
            }
        str=cluti.Date_StringDMA(clasesutiles.Calender_Date(c1));
        }else
            str=null;
        return str;
   }

   /*public Float obtenerSubtotalReservacion(int idr){
        Transaction tx=null;
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        tx=Sesion.beginTransaction();
        SQLQuery q=Sesion.createSQLQuery("select x.idtipoh,x.precioxnoche, sum(x.idhabit) from (select t.idtipoh, t.precioxnoche,o.idhabit from ocupaciones as o, tipohab as t, habitacion as h where o.idhabit = h.idhabit and h.idtipoh = t.idtipoh)as x group by idhabit");
        List mili=q.list();
        tx.commit();
        if(Sesion.isOpen()){
            Sesion.clear();
            Sesion.close();
        }
        int longi=mili.size();
        float suma=0;
        if(longi>0){
            for(int i=0;i<longi;i++){
            Object[] objeto=(Object[]) mili.get(i);
            float precio=Float.parseFloat(objeto[1].toString());
            int cant=Integer.parseInt(objeto[2].toString());
            suma=suma+(precio*cant);
            }
       }
        else
            suma=0;

        return suma;
   }*/
   public void actualizarTotales(){
        float totres=calcularTotalReservacion(res.getIdres());
        jTextField29.setText(this.conv.conversion2(totres));
        float totabo=this.calcularTotalAbonado(res.getIdres());
        jTextField30.setText(this.conv.conversion2(totabo)); //lo cubierto registrado en la res y lo q pago cada sub
        float xx=totres-totabo-Float.parseFloat(jTextField31.getText());
        TotalGeneral=xx;
        jTextField27.setText(this.conv.conversion2(TotalGeneral));
        if(this.TotalGeneral==0){
            jButton1.setEnabled(false);
            if(/*res.getCheckout()=='0' &&*/hicieronCheckOutTodasLasHabitaciones())
                jButton17.setEnabled(true);
            else
                jButton17.setEnabled(false);
        }else{  //si todavio no se pago todo
            jButton1.setEnabled(true);
            jButton17.setEnabled(false);
        }
        if(hicieronCheckOutTodasLasHabitaciones())
            jButton14.setEnabled(false);
        else{
            jButton14.setEnabled(true);
            jButton1.setEnabled(false);
        }
   }

   public boolean GuardarTodo1(){  //guarda todo lo que corresponde a la reserva de habitaciones(1ra pestaña)
        int resu=0;
        Subtipo suti=new Subtipo();
        String fechaini="";
        String fechafin="";
        int codhab=0;
        int s=modelores1.getRowCount();
          Sesion = NewHibernateUtil.getSessionFactory().openSession();
            try {
                    int tam=0;
                    boolean libre=true;
                    tam=modelores1.getRowCount();
                    for(int i=0;i<tam;i++){    //comprueba si las habitaciones siguen libres
                       fechaini=modelores1.getValueAt(i, 2).toString();
                       fechafin=modelores1.getValueAt(i, 3).toString();
                       if(modelores1.getValueAt(i, 5).toString().equals("SI")){  //si es subreserva media
                           try {
                                Calendar fechaf = cluti.Date_Calender(cluti.StrDMA_Date(fechafin));
                                fechaf.add(Calendar.DATE, 1);
                                fechafin=cluti.Date_StringDMA(clasesutiles.Calender_Date(fechaf));
                            } catch (ParseException ex) {/*Logger.getLogger(FrmReserva.class.getName()).log(Level.SEVERE, null, ex);*/}
                       }
                       codhab=Integer.parseInt(modelores1.getValueAt(i, 0).toString());
                       if(EstaDisponible(fechaini,fechafin, codhab)==false){
                         libre=false;
                         break;
                       }
                    }
                    if(libre){
                        //********libera ocupaciones*****///
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        Transaction tx4=Sesion.beginTransaction();
                        Query que= Sesion.createQuery("from Ocupaciones where idres = "+res.getIdres());  //deberia ser reservacion en lugar de idres, pero tira error
                        List listaocup=que.list();
                        tx4.commit();
                        this.CERRARSesion();
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tam=listaocup.size();
                        for(int i=(tam-1);i>=0;i--){    //libera todas las habitaciones reservadas en esta reservacion de atras hacia adelante
                            Ocupaciones oc=(Ocupaciones)listaocup.get(i);
                            Transaction tx6=Sesion.beginTransaction();
                            Sesion.delete(oc);
                            tx6.commit();
                        }
                        this.CERRARSesion();
                        
                        //*****guarda todo de nuevo///
                        if(res.getCheckin()=='0'){  //si aun no se hizo el checkin
                             System.out.println("entro SIN checkin");
                            //********libera subreserva*****///
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            Transaction tx9=Sesion.beginTransaction();
                            Query qq= Sesion.createQuery("from Subreserva where idres = "+res.getIdres());  //deberia ser reservacion en lugar de idres, pero tira error
                            List listasubr=qq.list();
                            tx9.commit();
                            this.CERRARSesion();
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            tam=listasubr.size();
                            for(int i=(tam-1);i>=0;i--){    //libera todas las habitaciones reservadas en esta reservacion de atras hacia adelante
                                Subreserva sr=(Subreserva)listasubr.get(i);
                                Transaction tx10=Sesion.beginTransaction();
                                Sesion.delete(sr);
                                tx10.commit();
                            }
                            this.CERRARSesion();
                            Transaction tx3=null;
                            res.setCliente(clie);
                            if(this.jCheckBox2.isSelected())
                                res.setConfentrega('1');
                            else
                                res.setConfentrega('0');
                            res.setFechainicio(cluti.StrDMA_Date(obtenerFechaInicio(res.getIdres())));
                            res.setFechafin(cluti.StrDMA_Date(obtenerFechaFin(res.getIdres())));
                            res.setTotalres(this.subto);
                            res.setFechareserva(cluti.StrDMA_Date(fechadehoy));
                            res.setTotalcubierto(calcularTotalAbonado(res.getIdres()));
                            res.setDescuento(Float.parseFloat("0.0"));
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            tx3=Sesion.beginTransaction();
                            Sesion.saveOrUpdate(res);
                            tx3.commit();
                            this.CERRARSesion();
                            Estado es=new Estado();
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            tx3=Sesion.beginTransaction();
                            es=(Estado)Sesion.get(Estado.class, 3);
                            tx3.commit();
                            OcupacionesGest og=null;
                            for(int i=0;i<s;i++){  //recorre la grilla
                                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                Transaction tx6=Sesion.beginTransaction();
                                int codi=Integer.parseInt(modelores1.getValueAt(i, 0).toString());   //saca el codigo de habitacion de la grilla
                                hab=(Habitacion) Sesion.get(Habitacion.class, codi);  //obtiene el objeto habitacion de la tabla
                                suti=(Subtipo) Sesion.get(Subtipo.class, Integer.parseInt(modelores11.getValueAt(i, 0).toString()));
                                tx6.commit();
                                this.CERRARSesion();
                                String fen=modelores1.getValueAt(i, 2).toString();
                                String fsa=modelores1.getValueAt(i, 3).toString();
                                Calendar cfe=null;
                                Calendar cfs=null;
                                if(modelores1.getValueAt(i, 5).toString().equals("SI")){  //si es subreserva media
                                    try {
                                        cfs = cluti.Date_Calender(cluti.StrDMA_Date(fsa));
                                        cfs.add(Calendar.DATE, 1);                                        //suma 1 a la fecha de salida
                                        fsa=cluti.Date_StringDMA(clasesutiles.Calender_Date(cfs));
                                        cfe=cluti.Date_Calender(cluti.StrDMA_Date(fen));
                                    } catch (ParseException ex){
                                        ex.printStackTrace();
                                    }
                                }
                                else{
                                    cfe=cluti.Date_Calender(cluti.StrDMA_Date(fen));
                                    cfs=cluti.Date_Calender(cluti.StrDMA_Date(fsa));
                                }
                                for(Calendar c=cfe;c.compareTo(cfs)!=0;c.add(Calendar.DATE,1)){  //va cargando de nuevo las ocupaciones entre las fechas de la grilla
                                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                    Transaction tx7=Sesion.beginTransaction();
                                    Ocupaciones oc=new Ocupaciones();
                                    og=new OcupacionesGest();
                                    int codoc=og.getsiguientecodigo();
                                    if(codoc>0){
                                        oc.setIdocup(codoc);
                                        oc.setFecha(clasesutiles.Calender_Date(c));
                                        oc.setEstado(es);
                                        oc.setHabitacion(hab);
                                        oc.setReservacion(res);
                                        oc.setSubtipo(suti);
                                        Sesion.save(oc);
                                    }
                                    tx7.commit();
                                    this.CERRARSesion();
                            
                                }
                                /////////guarda subreservas//////////
                                int codisub=subresgest.getsiguientecodigo();
                                if(codisub>0){
                                    subres=new Subreserva();
                                    subres.setIdsubres(codisub);
                                    if(modelores1.getValueAt(i, 5).toString().equals("SI"))
                                        subres.setEscorta('1');
                                    else
                                        subres.setEscorta('0');
                                    subres.setFechaocup(cluti.StrDMA_Date(modelores1.getValueAt(i, 2).toString()));
                                    subres.setFechadesoc(cluti.StrDMA_Date(modelores1.getValueAt(i, 3).toString()));
                                    subres.setFeyhocheckin(null);
                                    subres.setFeyhocheckout(null);
                                    subres.setHabitacion(hab);
                                    subres.setSubtipo(suti);
                                    subres.setMontoabonado(Float.parseFloat("0"));
                                    subres.setReservacion(res);
                                    subres.setSubtotalhosp(calcularTotalHospedajeSubres(subres.getIdsubres()));
                                    subres.setSubtotconsum(Float.parseFloat("0"));
                                
                                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                    Transaction tx11=Sesion.beginTransaction();
                                    Sesion.save(subres);
                                    tx11.commit();
                                    this.CERRARSesion();
                                }
                            } //fin recorrido grilla
                        }
                        else{ //si ya se hizo el checkin se debe actualizar
                            System.out.println("entro CON checkin");
                            Transaction tx3=null;
                            res.setCliente(clie);
                            if(this.jCheckBox2.isSelected())
                                res.setConfentrega('1');
                            else
                                res.setConfentrega('0');
                            res.setFechainicio(cluti.StrDMA_Date(obtenerFechaInicio(res.getIdres())));
                            res.setFechafin(cluti.StrDMA_Date(obtenerFechaFin(res.getIdres())));
                            res.setTotalres(calcularTotalReservacion(resu));
                            res.setFechareserva(cluti.StrDMA_Date(fechadehoy));
                            res.setTotalcubierto(calcularTotalAbonado(res.getIdres()));
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            Sesion.flush();
                            Sesion.clear();
                            tx3=Sesion.beginTransaction();
                            Sesion.update(res);
                            tx3.commit();
                            this.CERRARSesion();
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            Transaction tt=Sesion.beginTransaction();
                            Estado es=new Estado();
                            es=(Estado) Sesion.get(Estado.class, 5);       ///////////////////////////////////////////////////////////////////////////////////////////////////////////ver
                            tt.commit();
                            this.CERRARSesion();
                            OcupacionesGest og= new OcupacionesGest();
                            System.out.println("ROWCOUNT = "+s);
                            for(int i=0;i<s;i++){  //recorre la grilla
                                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                Sesion.flush();
                                Sesion.clear();
                                Transaction tx6=Sesion.beginTransaction();
                                int coo=Integer.parseInt(modelores1.getValueAt(i, 0).toString());   //saca el codigo de la grilla
                                hab=(Habitacion) Sesion.get(Habitacion.class, coo);  //obtiene el objeto habitacion de la tabla
                                suti=(Subtipo) Sesion.get(Subtipo.class, Integer.parseInt(modelores11.getValueAt(i, 0).toString()));
                                tx6.commit();
                                this.CERRARSesion();
                                String fen=modelores1.getValueAt(i, 2).toString();
                                String fsa=modelores1.getValueAt(i, 3).toString();
                                Calendar cfe=null;
                                Calendar cfs=null;
                                if(modelores1.getValueAt(i, 5).toString().equals("SI")){  //si es subreserva media
                                    try {
                                        cfs = cluti.Date_Calender(cluti.StrDMA_Date(fsa));
                                        cfs.add(Calendar.DATE, 1);                                        //suma 1 a la fecha de salida
                                        fsa=cluti.Date_StringDMA(clasesutiles.Calender_Date(cfs));
                                        cfe=cluti.Date_Calender(cluti.StrDMA_Date(fen));
                                    }catch (ParseException ex) {
                                        ex.printStackTrace();
                                    }
                                }
                                else{
                                    cfe=cluti.Date_Calender(cluti.StrDMA_Date(fen));
                                    cfs=cluti.Date_Calender(cluti.StrDMA_Date(fsa));
                                }
                                for(Calendar c=cfe;c.compareTo(cfs)!=0;c.add(Calendar.DATE,1)){  //va cargando de nuevo las ocupaciones entre las fechas de la grilla
                                    System.out.println("recorre"+cluti.Date_StringDMA(c.getTime()));
                                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                    Transaction tx7=Sesion.beginTransaction();
                                    Sesion.flush();
                                    Sesion.clear();
                                    Ocupaciones oc=new Ocupaciones();
                                    og=new OcupacionesGest();
                                    int codoc=og.getsiguientecodigo();
                                    if(codoc>0){
                                        oc.setIdocup(codoc);
                                        oc.setFecha(clasesutiles.Calender_Date(c));
                                        oc.setEstado(es);
                                        oc.setSubtipo(suti);
                                        oc.setHabitacion(hab);
                                        oc.setReservacion(res);

                                        Sesion.save(oc);
                                    }
                                    tx7.commit();
                                    this.CERRARSesion();

                                }
                                /////////guarda subreservas//////////
                              /*  Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                Transaction tx12=Sesion.beginTransaction();
                                Sesion.flush();
                                Sesion.clear();
                                Query q= Sesion.createQuery("from Subreserva where idres = "+res.getIdres()+" and idhabit = "+coo);  //deberia ser reservacion en lugar de idres, pero tira error
                                List listasubres=q.list();
                                tx12.commit();
                                this.CERRARSesion();
                                if(listasubres.size()>0){  //si ya existe la subreserva se actualiza*/
                                int codSubEnModelo=Integer.parseInt(this.modelores11.getValueAt(i, 2).toString());//es 0 si es nuevo
                                if(codSubEnModelo>0){  //si existe la subreserva
                                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                    Transaction t=Sesion.beginTransaction();
                                    t.begin();
                                    subres=(Subreserva)Sesion.load(Subreserva.class, codSubEnModelo);
                                    if(modelores1.getValueAt(i, 5).toString().equals("SI"))
                                        subres.setEscorta('1');
                                    else
                                        subres.setEscorta('0');
                                    subres.setFechaocup(cluti.StrDMA_Date(modelores1.getValueAt(i, 2).toString()));
                                    subres.setFechadesoc(cluti.StrDMA_Date(modelores1.getValueAt(i, 3).toString()));
                                    // subres.setFeyhocheckin(null);
                                    // subres.setFeyhocheckout(null);
                                    subres.setHabitacion(hab);
                                    //subres.setMontoabonado(Float.parseFloat("0"));
                                    subres.setReservacion(res);
                                    subres.setSubtipo(suti);
                                    subres.setSubtotalhosp(calcularTotalHospedajeDesdeGrilla(hab.getIdhabit()));
                                    subres.setSubtotconsum(calcularTotalConsumisionSubres(subres.getIdsubres()));
                                    t.commit();     //guarda los cambios, es igual que update, pero eso aca no funciona no se xq
                                    this.CERRARSesion();///////////////////////////////////////////////////////////////////////////////////////////////controlar agregado despues
                                }
                                else{ //si todavia no existe la subreserva
                                    int codisub=subresgest.getsiguientecodigo();
                                    if(codisub>0){
                                        subres=new Subreserva();
                                        subres.setIdsubres(codisub);
                                        if(modelores1.getValueAt(i, 5).toString().equals("SI"))
                                            subres.setEscorta('1');
                                        else
                                            subres.setEscorta('0');
                                        subres.setFechaocup(cluti.StrDMA_Date(modelores1.getValueAt(i, 2).toString()));
                                        subres.setFechadesoc(cluti.StrDMA_Date(modelores1.getValueAt(i, 3).toString()));
                                        subres.setFeyhocheckin(null);
                                        subres.setFeyhocheckout(null);
                                        subres.setSubtipo(suti);
                                        subres.setHabitacion(hab);
                                        subres.setMontoabonado(Float.parseFloat("0"));
                                        subres.setReservacion(res);
                                        subres.setSubtotalhosp(calcularTotalHospedajeSubres(subres.getIdsubres()));
                                        subres.setSubtotconsum(Float.parseFloat("0"));

                                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                        Transaction tx13=Sesion.beginTransaction();
                                        Sesion.save(subres);
                                        tx13.commit();
                                        this.CERRARSesion();
                                    }
                                }
                            } //fin recorrido grilla
                        }
                    } 
                    else{
                        //*********************************************FALTA PROBAR SI FUNCIONA
                        JOptionPane.showMessageDialog(null,"La habitación Nº "+codhab+" ya no está disponible","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        this.CERRARSesion();
                        resu++;
                    }
                //tx2.commit();
            }catch(HibernateException he1){
                he1.printStackTrace();
                //tx2.rollback();
                resu++;
            }
            catch(ParseException he2){
                he2.printStackTrace();
                //tx2.rollback();
                resu++;
            }
     /*  }
        else
            resu++;*/

        if(resu==0)
            return true;
        else
            return false;
   }

   public void ubicarCombo2EnPosicion(int ctido){
        int lon=this.mimodelocombo2.getSize();
        for(int i=0;i<lon;i++){
            StringTokenizer tok = new StringTokenizer(mimodelocombo2.getElementAt(i).toString(),"-");
            int codi=Integer.parseInt(tok.nextToken());
            if(codi==ctido)
                this.jComboBox2.setSelectedIndex(i);  //ubica el combo en la posicion correcta
        }
   }

   public int obtenerCodigoActualDeCombo2(){
        int resu=0;
        StringTokenizer tok1 = new StringTokenizer(mimodelocombo2.getElementAt(this.jComboBox2.getSelectedIndex()).toString(),"-");
        resu=Integer.parseInt(tok1.nextToken());
        return resu;
   }
    public int obtenerCodigoActualDeComboMoneda(){
        int resu=0;
        resu=Integer.parseInt(modelocombomoneda11.getElementAt(this.jComboBox3.getSelectedIndex()).toString());
        return resu;
   }
    public int obtenerCodigoActualDeComboMoneda2(){
        int resu=0;
        resu=Integer.parseInt(modelocombomoneda22.getElementAt(this.jComboBox6.getSelectedIndex()).toString());
        return resu;
   }

    public int obtenerCodigoActualDeComboFormaPago(){
        int resu=0;
        resu=Integer.parseInt(modelocomboformapago2.getElementAt(this.jComboBox4.getSelectedIndex()).toString());
        return resu;
   }

    public int obtenerCodigoActualDeComboBanco(){
        int resu=0;
        try{
            resu=Integer.parseInt(modelocombobanco2.getElementAt(this.jComboBox5.getSelectedIndex()).toString());
        }catch(NumberFormatException e){}
        return resu;
   }

   public void AgregarTablares1(Habitacion habi, String fent, String fsal){
        Object [] filaa = new Object[6]; // Hay siete columnas en la tabla
        this.obtenerObjetoSubTipoDeCombo();
        filaa[0] = habi.getIdhabit();    //codigo
        filaa[1] = subti.getDescsubtipo();     //descripcion del subtipo
        filaa[2] = fent;   //fecha entrada
        filaa[3] = fsal;   //fecha salida
        filaa[4] = subti.getPrecioxnoche();   //fecha salida
        if(this.jCheckBox1.isSelected()==true)
            filaa[5] = "SI";
        else
            filaa[5] = "NO";
        Object[] obj2=new Object[3];
        obj2[0]=subti.getIdsubtipo();
        obj2[1]=Float.toString(subti.getPreciocorto());
        obj2[2]="0";
        modelores1.addRow(filaa);// Se añade al modelo la fila completa.
        modelores11.addRow(obj2);// Se añade al modelo la fila completa.
        this.jTable2.setModel(modelores1);
   }

   public void AgregarTablares2(int ctip,String dtip){
        Object [] filaa = new Object[3]; // Hay tres columnas en la tabla
        filaa[0] = ctip;
        filaa[1] = dtip;
        filaa[2] = 1;
        modelores2.addRow(filaa);// Se añade al modelo la fila completa.
        this.jTable3.setModel(modelores2);
   }

   public void autoAgregarTablares2(){
       int c=modelores1.getRowCount();
       if(c>0){
            modelores2 = new MiDefaultTableModel();
            modelores2.addColumn("Código");
            modelores2.addColumn("Tipo");  //descripcion del tipo de habitacion
            modelores2.addColumn("Cantidad");
            jTable3.setModel(modelores2);
            for(int i=0;i<c;i++){
                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                int cohab=Integer.parseInt(modelores1.getValueAt(i, 0).toString());  //codigo habitacion
                Habitacion ha=(Habitacion) Sesion.get(Habitacion.class, cohab);
                int coti=ha.getTipohab().getIdtipoh();  //codigo tipo
                String desti=ha.getTipohab().getDescripth();
                this.CERRARSesion();
                boolean encon=false;  //guarda si se encontro el tipo en la tabla 2
                for(int j=0;j<modelores2.getRowCount();j++){
                    int coti2=Integer.parseInt(modelores2.getValueAt(j, 0).toString());
                    if(coti==coti2){
                        int can=Integer.parseInt(modelores2.getValueAt(j, 2).toString());
                        modelores2.setValueAt((can+1), j, 2);
                        encon=true;
                        break;
                    }
                }
                if(encon==false){   //si no existe en tabla, crea un registro
                    Object [] filaa = new Object[3]; // Hay tres columnas en la tabla
                    filaa[0] = coti;
                    filaa[1] = desti;
                    filaa[2] = 1;
                    modelores2.addRow(filaa);// Se añade al modelo la fila completa.
                }
       }
        this.jTable3.setModel(modelores2);
       }
   }

   public void EditarTablares1(int fii, String fent, String fsal){
        this.obtenerObjetoSubTipoDeCombo();
        modelores1.setValueAt(fent, fii, 2);
        modelores1.setValueAt(fsal, fii, 3);
        modelores1.setValueAt(this.subti.getDescsubtipo(), fii, 1);
        modelores1.setValueAt(this.subti.getPrecioxnoche(), fii, 4);
        modelores11.setValueAt(this.subti.getIdsubtipo(), fii, 0);
        modelores11.setValueAt(this.subti.getPreciocorto(), fii, 1);
        if(this.jCheckBox1.isSelected()==true)
            modelores1.setValueAt("SI", fii, 5);
        else
            modelores1.setValueAt("NO", fii, 5);
        this.jTable2.setModel(modelores1);
   }

public void CargarLista1(){//  reservaciones pendientes
    Transaction tx=null;
    try{
        Sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx=Sesion.beginTransaction();
        Query qq=Sesion.createQuery("select c.idcli, r.idres, c.nombre, c.apellido, r.fechainicio from Cliente as c, Reservacion as r where c.idcli  = r.cliente and activa = '1' and r.fechafin >= '"+cluti.FormatearFecha(fechadehoy)+"' and checkin = '0' and checkout = '0'");  //and r.checkin = 0  esta condicion la saque
        List l1=qq.list();
        mimodelolista = new DefaultListModel();
        mimodelolistacodigos = new DefaultListModel();
        int longi=l1.size();
        if(longi>0){
            for(int i=0;i<longi;i++){
                Object[] objeto = (Object[]) l1.get(i);
                String codcl = objeto[0].toString();
                String codre = objeto[1].toString();
                String nom=objeto[2].toString();
                String ape=objeto[3].toString();
                String fein=objeto[4].toString();
                mimodelolista.add(i,nom+"_"+ape+" // "+fein);
                mimodelolistacodigos.add(i,codcl+"-"+codre);
           }
        }
        jList1.setModel(mimodelolista);
        tx.commit();
        this.CERRARSesion();
    }
    catch(HibernateException ee){
        ee.printStackTrace();
        tx.rollback();
    }
    catch(NullPointerException ee2){
        ee2.printStackTrace();
        tx.rollback();
    }
}

public void CargarLista2(){//  reservaciones en curso
    Transaction tx=null;
    try{
        this.actualizarFechaDeHoy();
        Sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx=Sesion.beginTransaction();
        Query qq=Sesion.createQuery("select c.idcli, r.idres, c.nombre, c.apellido, r.fechainicio from Cliente as c, Reservacion as r where c.idcli  = r.cliente and r.checkout = '0' and r.checkin = '1' and activa = 1");
        List l1=qq.list();
        mimodelolista = new DefaultListModel();
        mimodelolistacodigos= new DefaultListModel();
        int longi=l1.size();
        if(longi>0){
            for(int i=0;i<longi;i++){
                Object[] objeto = (Object[]) l1.get(i);
                String codcl = objeto[0].toString();
                String codre = objeto[1].toString();
                String nom=objeto[2].toString();
                String ape=objeto[3].toString();
                String fein=objeto[4].toString();
                mimodelolista.add(i,nom+"_"+ape+" // "+fein);
                mimodelolistacodigos.add(i,codcl+"-"+codre);
           }
        }
        jList1.setModel(mimodelolista);
        tx.commit();
        this.CERRARSesion();
    }
    catch(HibernateException ee){
        ee.printStackTrace();
        tx.rollback();
    }
    catch(NullPointerException ee2){
        ee2.printStackTrace();
        tx.rollback();
    }
}

public void CargarLista3(){ // todas las reservaciones concretadas
    Transaction tx=null;
    try{
        Sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx=Sesion.beginTransaction();
        Query qq=Sesion.createQuery("select c.idcli, r.idres, c.nombre, c.apellido, r.fechainicio from Cliente as c, Reservacion as r where c.idcli  = r.cliente and activa = '1' and checkin = '1' and checkout = '1'");
        List l1=qq.list();
        mimodelolista = new DefaultListModel();
        mimodelolistacodigos= new DefaultListModel();
        int longi=l1.size();
        if(longi>0){
            for(int i=0;i<longi;i++){
                Object[] objeto = (Object[]) l1.get(i);
                String codcl = objeto[0].toString();
                String codre = objeto[1].toString();
                String nom=objeto[2].toString();
                String ape=objeto[3].toString();
                String fein=objeto[4].toString();
                mimodelolista.add(i,nom+"_"+ape+" // "+fein);
                mimodelolistacodigos.add(i,codcl+"-"+codre);
           }
        }
        jList1.setModel(mimodelolista);
        tx.commit();
        this.CERRARSesion();
    }
    catch(HibernateException ee){
        ee.printStackTrace();
        tx.rollback();
    }
    catch(NullPointerException ee2){
        ee2.printStackTrace();
        tx.rollback();
    }
}

public void CargarLista5(){ // todas las reservaciones
    Transaction tx=null;
    try{
        Sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx=Sesion.beginTransaction();
        Query qq=Sesion.createQuery("select c.idcli, r.idres, c.nombre, c.apellido, r.fechainicio from Cliente as c, Reservacion as r where c.idcli  = r.cliente");
        List l1=qq.list();
        mimodelolista = new DefaultListModel();
        mimodelolistacodigos= new DefaultListModel();
        int longi=l1.size();
        if(longi>0){
            for(int i=0;i<longi;i++){
                Object[] objeto = (Object[]) l1.get(i);
                String codcl = objeto[0].toString();
                String codre = objeto[1].toString();
                String nom=objeto[2].toString();
                String ape=objeto[3].toString();
                String fein=objeto[4].toString();
                mimodelolista.add(i,nom+"_"+ape+" // "+fein);
                mimodelolistacodigos.add(i,codcl+"-"+codre);
           }
        }
        jList1.setModel(mimodelolista);
        tx.commit();
        this.CERRARSesion();
    }
    catch(HibernateException ee){
        ee.printStackTrace();
        tx.rollback();
    }
    catch(NullPointerException ee2){
        ee2.printStackTrace();
        tx.rollback();
    }
}

public void CargarLista4(){ // todas las reservaciones activas y confirmadas
    Transaction tx=null;
    try{
        Sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx=Sesion.beginTransaction();
        Query qq=Sesion.createQuery("select c.idcli, r.idres, c.nombre, c.apellido, r.fechainicio from Cliente as c, Reservacion as r where c.idcli  = r.cliente and r.activa = '1' and r.confentrega = '1'  and r.checkin = '0' and r.checkout = '0' and r.fechafin >= '"+cluti.FormatearFecha(fechadehoy)+"'");
        List l1=qq.list();
        mimodelolista = new DefaultListModel();
        mimodelolistacodigos= new DefaultListModel();
        int longi=l1.size();
        if(longi>0){
            for(int i=0;i<longi;i++){
                Object[] objeto = (Object[]) l1.get(i);
                String codcl = objeto[0].toString();
                String codre = objeto[1].toString();
                String nom=objeto[2].toString();
                String ape=objeto[3].toString();
                String fein=objeto[4].toString();
                mimodelolista.add(i,nom+"_"+ape+" // "+fein);
                mimodelolistacodigos.add(i,codcl+"-"+codre);
           }
        }
        jList1.setModel(mimodelolista);
        tx.commit();
        this.CERRARSesion();
    }
    catch(HibernateException ee){
        ee.printStackTrace();
        tx.rollback();
    }
    catch(NullPointerException ee2){
        ee2.printStackTrace();
        tx.rollback();
    }
}
public float calcularTotalHospedajeSubres(int csub){
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    Transaction tx2=null;
    float resu=0;
    try {
        tx=Sesion.beginTransaction();
        Query q= Sesion.createQuery("from Subreserva where idsubres = "+csub);
        List listasub=q.list();
        tx.commit();
        this.CERRARSesion();
        if(listasub.size()>0){
            subres=(Subreserva) listasub.get(0);
            String fen=cluti.Date_StringDMA(subres.getFechaocup());
            String fsa=cluti.Date_StringDMA(subres.getFechadesoc());
            Calendar cfe=cluti.Date_Calender(cluti.StrDMA_Date(fen));
            Calendar cfs=cluti.Date_Calender(cluti.StrDMA_Date(fsa));
            int dias=0;
            int medio=Integer.parseInt(Character.toString(subres.getEscorta()));
            for(Calendar c=cfe;c.compareTo(cfs)!=0;c.add(Calendar.DATE,1)){  //hace tantas veces como dias se reservo
                dias++;
            }
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx2=Sesion.beginTransaction();
            SQLQuery q2= Sesion.createSQLQuery("select t.precioxnoche, t.preciocorto from Subtipo as t, Subreserva as s where t.idsubtipo = s.idsubtipo and s.idsubres = "+csub);
            List listahab=q2.list();
            tx2.commit();
            this.CERRARSesion();
            Object[] obj=new Object[2];
            obj=(Object[]) listahab.get(0);
            float largo=Float.parseFloat(obj[0].toString());
            float corto=Float.parseFloat(obj[1].toString());
           // float serv=calcularTotalServiciosSubres(csub);
            resu=(largo*dias)+(corto*medio);  //medio o es 0 o es 1
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    catch(ParseException ex2){
        ex2.printStackTrace();
    }
    return resu;
}
public float calcularTotalMultasSubres(int idsubre){
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    float resu=0;
    try {
        tx=Sesion.beginTransaction();
        SQLQuery q= Sesion.createSQLQuery("select sum(x.subto) from (select (s.cantidad * s.precio)as subto from subresxmul as s, subreserva as sr where sr.idsubres = s.idsubres and sr.idsubres = "+idsubre+") as x");
        List listamul=q.list();
        tx.commit();
        Object obj=new Object();
        if(listamul.size()>0){
            obj=(Object)listamul.get(0);
            if(obj!=null)
                resu=Float.parseFloat(obj.toString());
            else
                resu=0;
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    CERRARSesion();
    return resu;
}

public float calcularTotalHospedajeDesdeGrilla(int idhabi){   //utilizo al editar la subreserva
    int nu=modelores1.getRowCount();
    float resu=0;
    for(int i=0;i<nu;i++){
        int c=Integer.parseInt(modelores1.getValueAt(i,0).toString());
        if(c==idhabi){
            String fen=modelores1.getValueAt(i, 2).toString();
            String fsa=modelores1.getValueAt(i, 3).toString();
            Float precio=Float.parseFloat(modelores1.getValueAt(i, 4).toString());
            if(modelores1.getValueAt(i, 5).toString().equals("SI")){  //si es subreserva media
                resu=Float.parseFloat(modelores11.getValueAt(i, 1).toString());
            }
            try {
                Calendar cfe = cluti.Date_Calender(cluti.StrDMA_Date(fen));
                Calendar cfs=cluti.Date_Calender(cluti.StrDMA_Date(fsa));
                for(Calendar cc=cfe;cc.compareTo(cfs)!=0;cc.add(Calendar.DATE,1)){
                    resu=resu+precio;
                }
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
        break;
    }
    return resu;
}

public float calcularTotalReservacion(int cress){   //calcula lo que saldra la reservacion con todo menos lo abonado
    float r=this.calcularTotalConsumisionReservacion(cress);
    float rr=this.calcularTotalHospedajeServiciosMultasReservacion(cress);
    return r+rr;
}
    public float calcularTotalHospedajeServiciosMultasReservacion(int cress){
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    float resu=0;
    try {
        tx=Sesion.beginTransaction();
        Query q= Sesion.createQuery("from Subreserva where idres = "+cress);
        List listasub=q.list();
        tx.commit();
        if(listasub.size()>0){
            for(int i=0;i<listasub.size();i++){
                subres=(Subreserva)listasub.get(i);
                resu=resu+calcularTotalHospedajeSubres(subres.getIdsubres())+this.calcularTotalServiciosSubres(subres.getIdsubres())+this.calcularTotalMultasSubres(subres.getIdsubres());
            }
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    CERRARSesion();
    return resu;

}

public float calcularTotalConsumisionReservacion(int cress){
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    float resu=0;
    try {
        tx=Sesion.beginTransaction();
        Query q= Sesion.createQuery("from Subreserva where idres = "+cress);
        List listasub=q.list();
        tx.commit();
        if(listasub.size()>0){
            for(int i=0;i<listasub.size();i++){
                subres=(Subreserva)listasub.get(i);
                resu=resu+this.calcularTotalConsumisionSubres(subres.getIdsubres());
            }
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    CERRARSesion();
    return resu;

}
public float calcularTotalHospedajeReservacion(int cress){
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    float resu=0; 
    try {
        tx=Sesion.beginTransaction();
        Query q= Sesion.createQuery("from Subreserva where idres = "+cress);
        List listasub=q.list();
        tx.commit();
        if(listasub.size()>0){
            for(int i=0;i<listasub.size();i++){
                subres=(Subreserva)listasub.get(i);
                resu=resu+this.calcularTotalHospedajeSubres(subres.getIdsubres());
            }
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    CERRARSesion();
    return resu;

}
 public float calcularTotalMultasReservacion(int cress){
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    float resu=0;
    try {
        tx=Sesion.beginTransaction();
        Query q= Sesion.createQuery("from Subreserva where idres = "+cress);
        List listasub=q.list();
        tx.commit();
        if(listasub.size()>0){
            for(int i=0;i<listasub.size();i++){
                subres=(Subreserva)listasub.get(i);
                resu=resu+this.calcularTotalMultasSubres(subres.getIdsubres());
            }
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    CERRARSesion();
    return resu;

}
  public float calcularTotalServiciosReservacion(int cress){
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    float resu=0;
    try {
        tx=Sesion.beginTransaction();
        Query q= Sesion.createQuery("from Subreserva where idres = "+cress);
        List listasub=q.list();
        tx.commit();
        if(listasub.size()>0){
            for(int i=0;i<listasub.size();i++){
                subres=(Subreserva)listasub.get(i);
                resu=resu+this.calcularTotalServiciosSubres(subres.getIdsubres());
            }
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    CERRARSesion();
    return resu;

}

public float calcularTotalServiciosSubres(int csubress){   //calcula los servicios utilizados que sera sumado a hospedaje
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    float resu=0;
    try {
        tx=Sesion.beginTransaction();
        SQLQuery q= Sesion.createSQLQuery("select (x.cantidad * x.precio)as subto from stockyservxsubre as x, stockyserv as s where s.esservicio = 1 and s.codigo = x.codigo and x.idsubres = "+csubress);
        List listaserv=q.list();
        tx.commit();
        Object obj=new Object();
        if(listaserv.size()>0){
            for(int i=0;i<listaserv.size();i++){
                obj=(Object)listaserv.get(i);
                resu=resu+Float.parseFloat(obj.toString());
            }
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    this.CERRARSesion();
    return resu;
}

public float calcularTotalConsumisionSubres(int csubress){   //calcula los servicios utilizados
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    float resu=0;
    try {
        tx=Sesion.beginTransaction();
        SQLQuery q= Sesion.createSQLQuery("select (x.cantidad * x.precio)as subto from stockyservxsubre as x, stockyserv as s where s.esservicio = 0 and s.codigo = x.codigo and x.idsubres = "+csubress);
        List listaserv=q.list();
        tx.commit();
        Object obj=new Object();
        if(listaserv.size()>0){
            for(int i=0;i<listaserv.size();i++){
                obj=(Object)listaserv.get(i);
                resu=resu+Float.parseFloat(obj.toString());
            }
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    this.CERRARSesion();
    return resu;
}

/*public float calcularTotalAbonado(int cres){   //calcula el total abonado
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    float resu=0;
    try {
        tx=Sesion.beginTransaction();
        //SQLQuery q= Sesion.createSQLQuery("Select t.credito, m.montogs, mo.venta from tipomov as t, movcaja as m, reservacion as r, moneda as mo where m.idmoneda = mo.idmoneda and r.idres = m.idres and t.idtipomov = m.idtipomov and r.idres = "+cres);  //busca los movimientos de la reservacion
        SQLQuery q= Sesion.createSQLQuery("Select t.credito, m.montogs from tipomov as t, movcaja as m, reservacion as r where r.idres = m.idres and t.idtipomov = m.idtipomov and r.idres = "+cres);  //busca los movimientos de la reservacion
        List listamov=q.list();
        tx.commit();
        Object[] obj=new Object[3];
        if(listamov.size()>0){
            for(int i=0;i<listamov.size();i++){
                obj=(Object[])listamov.get(i);
                //int credi=Integer.parseInt(obj[0].toString());
                //float mogs=Float.parseFloat(obj[1].toString());
                //float momo=Float.parseFloat(obj[2].toString());
                float monto=(float) Math.floor(Float.parseFloat(obj[1].toString()))/**Float.parseFloat(obj[2].toString())*/;  //obtiene el monto abonado y lo redondea para arriba
               /* if(Integer.parseInt(obj[0].toString())==0) //si es devito suma, sino resta
                    resu=resu+monto;
                else
                    resu=resu-monto;
            }
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    this.CERRARSesion();
    return resu;
}*/
  public float calcularTotalAbonado(int cres){   //calcula el total abonado
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    float resu=0;
    try {
        tx=Sesion.beginTransaction();
        Reservacion ree=new Reservacion();
        ree=(Reservacion) Sesion.get(Reservacion.class, cres);
        if(ree!=null){
            if((ree.getTotalcubierto()+ree.getDescuento())<ree.getTotalres()){  // si lo que pago mas el descuento son menores al valor a pagar
                Query q= Sesion.createQuery("from Subreserva where idres = "+cres);
                List lista=q.list();

                Subreserva su=new Subreserva();
                if(lista.size()>0){
                    for(int i=0;i<lista.size();i++){
                        su=new Subreserva();
                        su=(Subreserva) lista.get(i);
                        resu=resu+su.getMontoabonado();
                    }
                }
                resu=resu+ree.getTotalcubierto();
            }else
                resu=ree.getTotalcubierto();

            tx.commit();
        }
    }
    catch(HibernateException ex){
        ex.printStackTrace();
    }
    this.CERRARSesion();
    return resu;
}

  public void actualizarSubtotalDesdeModelores1(){
    float re=0;
    Sesion=NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=Sesion.beginTransaction();
    int n=modelores1.getRowCount();
    try{
         for(int i=0;i<n;i++){
            String fi=modelores1.getValueAt(i, 2).toString();
            String ff=modelores1.getValueAt(i, 3).toString();
            Calendar cfi=cluti.Date_Calender(cluti.StrDMA_Date(fi));
            Calendar cff=cluti.Date_Calender(cluti.StrDMA_Date(ff));
            int dias=0;
            for(Calendar c=cfi;c.compareTo(cff)<=0;c.add(Calendar.DATE,1)){  //hace tantas veces como dias se reservo
                dias++;
            }
            dias--; //xq termina con un dia de mas
            re=re+(dias*Float.parseFloat(modelores1.getValueAt(i, 4).toString()));
            if(modelores1.getValueAt(i, 5).toString().equals("SI"))
                re=re+(Float.parseFloat(modelores11.getValueAt(i, 1).toString()));  //obtiene el precio corto de esa fila
         }
         tx.commit();
      }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error al actualizar la tabla de reservas","ERROR",JOptionPane.ERROR_MESSAGE);
           tx.rollback();
           re=0;
           e.printStackTrace();
       }
       this.CERRARSesion();
       subto=re;
   }
    public boolean esValidoElGrupoParaLaHabitacion(int idhabitacion){  //si el grupo de personas cargadas en la grilla de checkin puede ser ubicado en la habitacion
       Transaction tx=null;
       boolean re=false;
       Sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            hab=(Habitacion)Sesion.get(Habitacion.class, idhabitacion);
            tx.commit();
            int adlibres=hab.getTipohab().getCantadultos();
            int nilibres=hab.getTipohab().getCantninos();
            CERRARSesion();
            int c=modelocheck1.getRowCount();
            for(int i=0;i<c;i++){  //recorre la tabla de checkin para ver cuantos adultos y ninhos ya estan alojados en cada habitacion
                int hcod=Integer.parseInt(modelocheck1.getValueAt(i, 0).toString());
                if(idhabitacion==hcod){
                    adlibres=adlibres-Integer.parseInt(modelocheck1.getValueAt(i,2).toString());  //resta la cantidad de adultos libres con los que ya hay
                    nilibres=nilibres-Integer.parseInt(modelocheck1.getValueAt(i,3).toString());  //resta la cantidad de ninhos libres con los que ya hay
                    break;
                }
            }
            int cad=0;
            int cni=0;
            c=modeloclie1.getRowCount();
            for(int i=0;i<c;i++){
                if(Integer.parseInt(modeloclie1.getValueAt(i, 3).toString())>EDADLIMITEDENINHO)
                    cad++;
                else
                    cni++;
            }
            if(adlibres>=cad && nilibres>=cni)
                re=true;
            else{
                if(nilibres<cni){
                    if(adlibres>=(cad+(cni-nilibres)))///////////////////////////////////////////////////////////ver
                        re=true;
                    else
                        re=false;
                }else
                    re=false;
            }
        }
        catch(HibernateException ex){
            ex.printStackTrace();
            re=false;
        }
        return re;
    }
  public String obtenerNumFactura(){  //retorna el numero de factura almacenado en la tabla varios, si no es valido retorna null
    //   Transaction tx=null;
       String resul="";
    //   Sesion=NewHibernateUtil.getSessionFactory().openSession();
     //  tx=Sesion.beginTransaction();
       Varios vari=new Varios();
       vari=(Varios) Sesion.get(Varios.class, 1); //es 1 porque solo tiene 1 registro y su codigo es 1
    //   tx.commit();
       if(vari!=null)
           resul=vari.getProxnumfac();
       else
           resul=null;

       if(resul.isEmpty())
           resul=null;
    //   CERRARSesion();
       return resul;
 }
  /*public int obtenerPorcIvaDeTablaVarios(){  //retorna el numero de factura almacenado en la tabla varios, si no es valido retorna null
       Transaction tx=null;
       int resul=0;
       Sesion=NewHibernateUtil.getSessionFactory().openSession();
       tx=Sesion.beginTransaction();
       Varios vari=new Varios();
       vari=(Varios) Sesion.get(Varios.class, 1); //es 1 porque solo tiene 1 registro y su codigo es 1
       tx.commit();
       if(vari!=null)
           resul=vari.getPorciva();
       else
           resul=0;
       CERRARSesion();
       return resul;
 }*/

 public void guardarNumFactura(String numfac){
     //  Transaction tx=null;
     //  Sesion=NewHibernateUtil.getSessionFactory().openSession();
    //   tx=Sesion.beginTransaction();
       Varios vari=new Varios();
       vari=(Varios) Sesion.load(Varios.class, 1); //es 1 porque solo tiene 1 registro y su codigo es 1
       vari.setProxnumfac(numfac);
     //  tx.commit();
     //  CERRARSesion();
 }

 

 public int obtenerNumeroDeGuionesEnNumFac(String str){
   Transaction tx=null;
   StringTokenizer tok = new StringTokenizer(str,"-");
   int cont=0;
   for(int i=0;i<str.length();i++){   //por si no termina le pongo limite, pero podria ser un for vacio
       try{
            String r1=tok.nextToken();
            cont++;
       }catch(NoSuchElementException e){break;}

   }
       return cont;
 }

public String aumentarNumeroFactura(String numfac){  //toms un num de fac y le suma 1
  // Transaction tx=null;
   StringTokenizer tok = new StringTokenizer(numfac,"-");
   String resp="";
   try{
        String st="";
        int numguiones=obtenerNumeroDeGuionesEnNumFac(numfac);
        for(int i=1;i<=numguiones;i++){
            st=tok.nextToken();
            if(i!=numguiones)
                resp=resp+st+"-";
        }
        int i=0;  //cuenta la cantidad de 0
        int num=0;  //guarda el ultimo numero
        String strnum="";
        String anteultimo="";
        for(i=0;i<st.length();i++){
            num=Integer.parseInt(st.substring(i, i+1));
            if(i<st.length()-2)  //si no es el ultimo numero ni el anteultimo
                strnum=strnum+num;
            else{
                if(i==st.length()-2)
                   anteultimo=num+"";
            }
        }
        if(num==9){
           anteultimo="1";
           num=0;
       }else
           num++;
        resp=resp+strnum+anteultimo+num;
   }catch(NoSuchElementException e){
     e.printStackTrace();
   }
   catch(NumberFormatException e1){
     e1.printStackTrace();
   }

  return resp;
 }

public String ventanaCargarNumFactura(){ //RETORNA EL NUM DE FACTURA INGRESADO EN EL CUADRO DE DIALOGO, SI OCURRIO UN ERROR O SE CANCELO RETORNA VACIO
    boolean valido=false;
    String resul="";
    do{//hace mientras no sea valido
        String str = JOptionPane.showInputDialog(null, "Favor ingresar el Nuevo Nº de Factura:","SOLICITUD", JOptionPane.QUESTION_MESSAGE);
        if(str != null && str.length()>0){
           valido=facges.esValidoNumFact(str);
           resul=str;
        }else{
            valido=true;
            resul="";
        }
    }while(!valido);
    return resul;
}


 public boolean imprimirFactura(float totcons, float tothosp, String NumFac, String NomYApe, String Ruc, String Direc, String Telef, String fecEmi, String it1, String it2, int idfac) throws FileNotFoundException, Exception{
    sgtenumfactura=NumFac;
//  Transaction tx=null;l
    boolean valido=true;
    impresa=false;
    if(sgtenumfactura!=null){
       while(!(/*!fg.existeNumFactEnTablaFactura(sgtenumfactura)&&*/ facges.esValidoNumFact(sgtenumfactura))){  //hace hasta que el numero de factura sea valido y unico en la tabla o se cancele la carga de nuevo num de fact
           int x=JOptionPane.showConfirmDialog(null,"Nº de Factura no es válido ¿Desea modificarlo?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           if(x==0){
               sgtenumfactura=ventanaCargarNumFactura();
               if(sgtenumfactura.isEmpty()==false && facges.esValidoNumFact(sgtenumfactura))
                    guardarNumFactura(sgtenumfactura);
               else
                    valido=false;
           }else{
               valido=false;
               break;
           }
       }
       if(valido){
            Factura fac=new Factura();
            if(idfac>0){
                try{
                    //float tot=calcularTotalHospedajeReservacion(res.getIdres());
  //                  float totcons=this.calcularTotalConsumisionReservacion(res.getIdres());
 //                   float tothosp=this.calcularTotalHospedajeReservacion(res.getIdres());
                   /* float totconsred=Math.round(totcons);
                    float tothospred=Math.round(tothosp);
                    float totred= totconsred+tothospred;*/
                    float tot=totcons+tothosp;
                    Varios va=new Varios();
                    va=(Varios)Sesion.get(Varios.class, 1);
                    if(va!=null /*&& contborr==tam*/){
                        float xiva=va.getIva().getPorc();
                      //  tx1.commit();
                       // CERRARSesion();
                        float iva=Math.round((tot*xiva)/(100+xiva));
                        fac.setIdfac(idfac);
                        fac.setCliente(res.getCliente());
                        fac.setDescuento(Float.parseFloat(jTextField31.getText()));
                        fac.setFeyho(cluti.StrDMA_Date(fecEmi));
                        fac.setMonto(tot);
                        fac.setTotaliva(iva);
                        fac.setNumfac(sgtenumfactura);
                        fac.setReservacion(res);
                        ////////////////////////muestra la factura//////////////////////////////////////////////////////
                        ClaseReporte crep=new ClaseReporte();
                        String nya=clie.getNombre()+" "+clie.getApellido();
                        crep.MostrarFactura(sgtenumfactura,ConvertidorDeNumerosALetras.convertNumberToLetter(conv.conversion2(tot)), tot, iva, tothosp, totcons, NomYApe, Ruc, Direc, Telef, cluti.fechaStrDMAaFechaFormatoLargo(fecEmi), it1, it2);
                        boolean guardarfac=false;
                        int r = JOptionPane.showConfirmDialog(null, "¿Se pudo imprimir correctamente la factura?", "CONSULTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if(r==0){//si si
                            fac.setEmitida('1');
                            impresa=true;
                            guardarfac=true;
                            sgtenumfactura=aumentarNumeroFactura(sgtenumfactura);   //aumenta el num factura
                        }
                        else{
                            fac.setEmitida('0');
                            impresa=false;
                            r = JOptionPane.showConfirmDialog(null, "¿Es posible volver a utilizar el papel de la factura no impresa para una impresión posterior?", "CONSULTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if(r==JOptionPane.NO_OPTION){  //si arrugo el papel o lo destruyo, pero no se pudo imprimir
                               sgtenumfactura=aumentarNumeroFactura(sgtenumfactura);   //aumenta el num factura
                               guardarfac=true;
                            }//else guardarfac=false...no es necesario
                        }
                        if(guardarfac){  //solo se guarda si se imprimio correctamente o si se arruino el papel
    //                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
    //                        Transaction tx1=Sesion.beginTransaction();
                            Sesion.save(fac);
    //                        tx1.commit();
    //                        CERRARSesion();
                            guardarNumFactura(sgtenumfactura);
                        }
                    }else{
   //                     CERRARSesion();
                        JOptionPane.showMessageDialog(null,"No se pudo imprimir la factura","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    }

                }catch(HibernateException ex){
           //         tx.rollback();

                    ex.printStackTrace();
                    throw ex;
                }catch(java.lang.Exception e){
           //         tx.rollback();
                    e.printStackTrace();
                    throw e;
                }
           }
       }
    }
    return impresa;
 }
 public boolean anularTodasLasFacturasDeReserva(Reservacion reser){
    try{
        Query q=Sesion.createQuery("from Factura as f where f.emitida = '1' and f.reservacion = "+reser.getIdres());
        List lista=q.list();
        for(int i=0;i<lista.size();i++){
            Factura fa=new Factura();
            fa=(Factura)lista.get(i);
            fa.setEmitida('0');
            Sesion.saveOrUpdate(fa);
         }
         JOptionPane.showMessageDialog(null,"Factura/s anulada/s correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
         return true;
     }catch(HibernateException e){
         JOptionPane.showMessageDialog(null,"Ha ocurrido un ERROR al intentar anular la/s factura/s","ERROR",JOptionPane.ERROR_MESSAGE);
         return false;}
// return false;
 }
 public boolean hicieronCheckOutTodasLasHabitaciones(){  //uso para habilitar el boton finalizar
   Transaction tx2=null;
   Sesion=NewHibernateUtil.getSessionFactory().openSession();
   tx2=Sesion.beginTransaction();
   Query q=Sesion.createQuery("from Subreserva where idres = "+res.getIdres());
   boolean ree=false;
   boolean resu=false;
   tx2.commit();
   List listasub=q.list();
   CERRARSesion();
   subres=new Subreserva();
   for(int i=0;i<listasub.size();i++){
      subres=(Subreserva)listasub.get(i);
      if(subres.getFeyhocheckout()==null){//quiere decir que hay todavia alguna habitacion por hacer checkout
           ree=true;
           break;
     }
   }
   if(ree==false) //hago asi porque de otro modo resu tendria que iniciarse con true y si da algun error retorna true y no false
       resu=true;

   return resu;
 }


   public int obtenerCodigoDeHabitacionMasAdecuadaParaElGrupo(){
        int cad=0;
        int cni=0;
        for(int i=0;i<modeloclie1.getRowCount();i++){
            if(modeloclie1.getValueAt(i, 4).toString().equals("ADULTO"))
                cad++;
            else
                cni++;
        }
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx=Sesion.beginTransaction();
        SQLQuery q=Sesion.createSQLQuery("select idsubres from subreserva where idres = "+res.getIdres()+" and idsubres not in (select distinct c.idsubres from cliexsub as c, (select idsubres, idhabit from subreserva where idres = "+res.getIdres()+")as x where c.idsubres = x.idsubres)");
        boolean encontrado=false;
        List li=q.list();
        Subreserva subr=null;
        for(int i=0;i<li.size();i++){  //recorro todas las subreservas vacias de esta reservacion
            Object ob=new Object();
            ob=(Object) li.get(i);
            subr=new Subreserva();
            subr=(Subreserva) Sesion.get(Subreserva.class, Integer.parseInt(ob.toString()));
            int cad2=subr.getHabitacion().getTipohab().getCantadultos();
            int cni2=subr.getHabitacion().getTipohab().getCantninos();
            if(cad==cad2 && cni==cni2){   //si coinciden ambas cantidades retorna
                encontrado=true;
                break;
            }
        }
        if(encontrado)
            return subr.getHabitacion().getIdhabit();
        else{
            int[][] arr=new int[li.size()][2];  //creo un array donde guardo el num de habit y la cantidad de espacios se desperdiciaria si se ocupa esta habitacion con este grupo
            for(int i=0;i<li.size();i++){  //recorro todas las subreservas vacias de esta reservacion
                Object ob=new Object();
                ob=(Object) li.get(i);
                subr=new Subreserva();
                subr=(Subreserva) Sesion.get(Subreserva.class, Integer.parseInt(ob.toString()));
                int cad2=subr.getHabitacion().getTipohab().getCantadultos();
                int cni2=subr.getHabitacion().getTipohab().getCantninos();
                if(cad<=cad2 && cni<=cni2){  // si la hab tiene capacidad para mas habitaciones, devuelve la
                    arr[i][0]=subr.getHabitacion().getIdhabit();  //guardo en num de habitacion
                    arr[i][1]=(cad2-cad)+(cni2-cni);  //guarda los espacios que se desperdiciarian
                }else{
                    arr[i][0]=subr.getHabitacion().getIdhabit();  //guardo en num de habitacion
                    arr[i][1]=-1;  //guarda -1 para indicar que la hab no tiene capacidad para este grupo
                }
            }
            int mejoropcion=-1;  //para ver si devuelve alguna habitacion
            for(int i=0;i<arr.length;i++){
                if(arr[i][1]>0){
                    if(mejoropcion<0)
                        mejoropcion=arr[i][0];  //si es el primer valor valido, lo guarda directamente sin comparar con nada
                    else{
                        if(mejoropcion>arr[i][1])  //si con la hab evaluada se pierden menos lugares que con la mejor opcion
                            mejoropcion=arr[i][0];
                    }
                }
            }
            if(mejoropcion<0){
                
                for(int i=0;i<li.size();i++){  //recorro todas las subreservas vacias de esta reservacion
                    Sesion=NewHibernateUtil.getSessionFactory().openSession();
                    Sesion.beginTransaction();
                    Object ob=new Object();
                    ob=(Object) li.get(i);
                    subr=new Subreserva();
                    subr=(Subreserva) Sesion.get(Subreserva.class, Integer.parseInt(ob.toString()));
                    if(this.esValidoElGrupoParaLaHabitacion(subr.getHabitacion().getIdhabit())){
                        mejoropcion=subr.getHabitacion().getIdhabit();
                        break;
                    }
                }
              //  Sesion.getTransaction().commit();
                this.CERRARSesion();
            }
            return mejoropcion;
        }
   }

   public void cargarDatosAlHacerClickEnLaLista(int codcli, int codres){
        Transaction tx=null;                                        // CLICK EN LA LISTA
        actualizarFechaDeHoy();
        Transaction tx1=null;


            try{
                resnueva=false;
                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                tx=Sesion.beginTransaction();

                ///////////////////CARGA LOS DATOS DEL CLIENTE////////////////////////////////
                Query qq=Sesion.createQuery("from Cliente where idcli = "+codcli);
                List liscli=qq.list();
                tx.commit();
                this.CERRARSesion();
                if(liscli.size()>0){
                    clie = (Cliente) liscli.get(0);
                    //pais=clie.getPais();
                    //paisencontrado=true;
                    buscarPais(Integer.toString(clie.getPais().getIdpais()));
                    clieencontrado= true;
                    jTextField2.setText(clie.getDoc());
                    jTextField2.requestFocus();
                    jTextField2.transferFocus();
                }
                else{
                    paisencontrado=false;
                    clieencontrado=false;
                    jTextField2.setText("");
                }

                //////////////////////////CARGA LOS DATOS DE LA RESERVA//////////////////////////
                this.CERRARSesion();
                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                tx1=Sesion.beginTransaction();
                Query q=Sesion.createQuery("from Reservacion where idres = "+codres);
                List li=q.list();
                tx1.commit();
                this.CERRARSesion();
                if(li.size()>0){
                    res=(Reservacion)li.get(0);
 /*                   if(res.getCheckout()=='1')
                        jButton17.setEnabled(false);  //si se carga la res y ya se hico checkout, impide imprimir de nuevo la factura
  */
                    reservacionencontrada=true;
                    if(res.getConfentrega()=='1')
                        this.jCheckBox2.setSelected(true);
                    else
                        this.jCheckBox2.setSelected(false);
                    if(cargaronelementoscheckout){  //si se cargaron correctamente los elementos checkout(3era pestanha)
                        this.jTabbedPane1.setEnabledAt(1, true);
                        this.jTabbedPane1.setEnabledAt(2, true);
                    }else{  //si no, intenta cargar de nuevo
                        cargarComboMoneda();
                        cargarComboFormaPago();
                        cargarComboBanco();
                        cargarComboMoneda2();
                        cargarTablaCotizacion();
                      /*  int ban=this.modelocombobanco.getSize();
                        int mon1=this.modelocombomoneda1.getSize();
                        int mon2=this.modelocombomoneda2.getSize();
                        int fop=this.modelocomboformapago.getSize();
                        int cot=this.modelocotizacion.getRowCount();*/
                        if(this.modelocombobanco.getSize()>0 && this.modelocombomoneda1.getSize()>0 && this.modelocombomoneda2.getSize()>0 /*&& this.modelocotizacion.getRowCount()>0*/ && this.modelocomboformapago.getSize()>0)  //si se cargaron correctamente los elementos de checkout, por si no se cargan, cosa que ya paso
                            cargaronelementoscheckout=true;
                        else
                            JOptionPane.showMessageDialog(null,"Debe cargar al menos un elemento en Moneda, Forma de Caja y Banco","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    }
                    habilitarbotones();
                    cargarTablaReserva1(codres);
                    actualizarSubtotalDesdeModelores1();
                    jLabel1.setText("TOTAL PARCIAL: "+this.conv.conversion(subto));
                    jFormattedTextField3.setText("");
                    jFormattedTextField4.setText("");
                    autoAgregarTablares2();
                }

            }catch (NoSuchElementException e1){
                e1.printStackTrace();
            }catch (NumberFormatException e2){
                e2.printStackTrace();
            }catch (HibernateException e3){
                e3.printStackTrace();
            }

   }
    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
                                                                    //CAMPO DE TEXTO ID/CODIGO cliente
    Transaction tx1=null;
    if(jTextField2.getText().isEmpty()==false){
        if(paisencontrado==true){  //si no esta vacio
            try{
                int existe=1;
                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                tx1=Sesion.beginTransaction();
                Query q11=Sesion.createQuery("from Cliente where doc  = '"+jTextField2.getText()+"' and idpais = "+pais.getIdpais());
                if(q11.list().isEmpty()==false){ //si no esta vacio
                    List l11=q11.list();
                    clieencontrado=true;
                    clie=(Cliente) l11.get(0);
                    if(Integer.parseInt(Character.toString(clie.getEstitular()))==1){
                        jTextField3.setText(clie.getNombre());
                        jTextField4.setText(clie.getApellido());
                    }
                    else{
                        int r=JOptionPane.showConfirmDialog(null,"Este cliente no es titular o posee datos personales insuficientes, ¿Desea MODIFICARLO?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                        if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                            try{
                                 frmcliente.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
                            }                    //para cerrarla antes de crear una nueva...tira error si no existe
                            catch(NullPointerException ex){
                                 existe=0;  //si no existe una clase previa
                            }
                            if (existe==1)
                                frmcliente.dispose();
                            frmcliente=new FrmCliente(pais,Integer.parseInt(jTextField2.getText()),(Frame)this.getParent(),true);
                            frmcliente.show();
                            if(frmcliente.isShowing()==false){  //carga los datos del nuevo cliente
                                this.jTextField2.requestFocus();
                                this.jTextField2.transferFocus();
                            }

                        }
                        else{
                            LimpiarCamposclie2();
                            clie=new Cliente();
                            clieencontrado=false;
                        }

                    }
                }else{
                    int r=JOptionPane.showConfirmDialog(null,"Cliente no encontrado, ¿Desea AGREGARLO?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                        if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                            try{
                                frmcliente.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
                            }                    //para cerrarla antes de crear una nueva...tira error si no existe
                            catch(NullPointerException ex){
                                existe=0;  //si no existe una clase previa
                            }
                            if (existe==1)
                                frmcliente.dispose();

                            frmcliente=new FrmCliente(pais,Integer.parseInt(jTextField2.getText()),(Frame)this.getParent(),true);
                            frmcliente.show();
                            if(frmcliente.isShowing()==false){ //carga los datos del nuevo cliente
                                this.jTextField2.requestFocus();
                                this.jTextField2.transferFocus();
                            }
                        }
                        else{
                            LimpiarCamposclie2();
                            clie=new Cliente();
                            clieencontrado=false;
                        }
                }
                tx1.commit();
                this.CERRARSesion();
            }
            catch(HibernateException e){
                e.printStackTrace();
                tx1.rollback();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Favor realizar la búsqueda del país antes de continuar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            jTextField2.setText("");
            clieencontrado=false;
            clie=new Cliente();
        }

    }
}//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
  //nada
}//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
                                                                //para validar el CAMPO DE TEXTO ID/CODIGO cliente
        boolean esint=Character.isDigit(evt.getKeyChar());   //tira true si el boton presionado es un digito
        if(jTextField2.getText().length()<30 || esint==false){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField2.transferFocus();
        }
        else
            evt.consume();
}//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
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
    if(cambiobusqueda){
        String codpai="";                                           //lost de la busqueda interactiva
        if(mimodelo.getRowCount()>0){
                codpai=mimodelo.getValueAt(xxx, 0).toString();
                if(this.buscarPais(codpai)){                    //si se encontro el pais
                    jTextField1.setText(pais.getDescrippais());
                    paisencontrado=true;
                    if(jTextField2.getText().isEmpty()==false){  //manda un enter al codigo
                        jTextField2.requestFocus();
                        jTextField2.transferFocus();
                    }
                }
                else{
                    paisencontrado=false;
                    pais=new Pais();
                }
            }
            else{
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
                        this.CERRARSesion();
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
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        //nada
}//GEN-LAST:event_jTextField5FocusLost

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        //nada
}//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        Transaction tx=null;                                          //PARA BUSQUEDA INTERACTIVA  en la lista
        String texto=jTextField5.getText();
        texto=texto.toUpperCase();             //pasa a mayusculas
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            Query qq=Sesion.createQuery("select c.idcli, r.idres, c.nombre, c.apellido, r.fechainicio from Cliente as c, Reservacion as r where c.idcli  = r.cliente and activa = 1 and (c.nombre like'"+"%" +texto+"%"+ "') order by c.nombre, c.apellido");
            List l1=qq.list();
            mimodelolista = new DefaultListModel();
            mimodelolistacodigos = new DefaultListModel();
            if(l1.size()>0){
                for(int i=0;i<l1.size();i++){
                    Object[] objeto = (Object[]) l1.get(i);
                    String codcl = objeto[0].toString();
                    String codre = objeto[1].toString();
                    String nom=objeto[2].toString();
                    String ape=objeto[3].toString();
                    String fein=objeto[4].toString();
                    mimodelolista.add(i,nom+"_"+ape+" // "+fein);
                    mimodelolistacodigos.add(i,codcl+"-"+codre);
                }
            }
            jList1.setModel(mimodelolista);  //carga el modelo a la lista, si no se encontro coincidencia, esta esta vacia
            tx.commit();
            this.CERRARSesion();
        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
}//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        //nada
}//GEN-LAST:event_jTextField5KeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                                                                    // AL ABRIRSE LA VENTANA
       this.setLocationRelativeTo(null);  //centra el objeto en pantalla
       this.setResizable(false);
      // setDefaultCloseOperation(0);
       actualizarFechaDeHoy();
       varges.actualizarVarios();
       varios=varges.getVarios();  //carga el registro de varios
       this.EDADLIMITEDENINHO=varios.getEdadnino();
       this.DIASRETRASOFECHAENTRADAYSALIDA=varios.getDiasretraso();
       jFormattedTextField1.setText(cluti.ObtenerFechaSinGuion(fechadehoy));
       //jFormattedTextField3.setText(this.ObtenerFechaSinGuion(fechadehoy));
       jFormattedTextField6.setText(cluti.ObtenerFechaSinGuion(fechadehoy));
        try {
            Calendar man = cluti.Date_Calender(cluti.StrDMA_Date(fechadehoy));
            man.add(Calendar.DATE, 1);
            manhana=cluti.Date_StringDMA(clasesutiles.Calender_Date(man));
            calhoy= cluti.Date_Calender(cluti.StrDMA_Date(fechadehoy)); //convierte la fecha de hoy a calendar
            jFormattedTextField2.setText(cluti.ObtenerFechaSinGuion(manhana));
            //jFormattedTextField4.setText(this.ObtenerFechaSinGuion(manhana));
        } catch (ParseException ex) {
            //Logger.getLogger(FrmReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        CargarLista1();
        cargarcombo();  //carga el combo con los tipos de habitacion
        cargarcombo2();  //carga el combo con los tipos de documento
        cargarcombosubtipo();
            modelohabdispo = new MiDefaultTableModel();
            modelohabdispo.addColumn("Número");
            modelohabdispo.addColumn("Ubicación");
            jTable1.setModel(modelohabdispo);
            modelores11.addColumn("idsubtipo");
            modelores11.addColumn("preciomediodia");
            modelores11.addColumn("idsubres");
            modelores1.addColumn("Número");
            modelores1.addColumn("Sub-Tipo");
            modelores1.addColumn("F.Entrada");
            modelores1.addColumn("F.Salida");
            modelores1.addColumn("precio");
            modelores1.addColumn("Media");
            jTable2.setModel(modelores1);
            modelores2.addColumn("Código");
            modelores2.addColumn("Tipo");
            modelores2.addColumn("Cantidad");
            jTable3.setModel(modelores2);
            modeloclie1.addColumn("Código");
            modeloclie1.addColumn("Nombre");
            modeloclie1.addColumn("Apellido");
            modeloclie1.addColumn("Edad");
            modeloclie1.addColumn("Categoría");
            jTable4.setModel(modeloclie1);
            modelocheck1.addColumn("Nº Habitación");
            modelocheck1.addColumn("Tipo");
            modelocheck1.addColumn("Adultos ocupantes");
            modelocheck1.addColumn("Niños ocupantes");
            modelocheck1.addColumn("Fecha Entrada");
            modelocheck1.addColumn("Fecha Salida");
            modelocheck1.addColumn("Id Sub");
            jTable6.setModel(modelocheck1);
            deshabilitarbotones();
            nuevo();//crea una nueva reservacion al abrir, lo puse aca xq si esta en el tx, tira error
            /////////////////////////carga de elementos de checkout/////////////////
            cargarComboMoneda();
            cargarComboFormaPago();
            cargarComboBanco();
            cargarComboMoneda2();
            cargarTablaCotizacion();
            if(this.modelocombobanco.getSize()>0 && this.modelocombomoneda1.getSize()>0 && this.modelocombomoneda2.getSize()>0/* && this.modelocotizacion.getRowCount()>0 */&& this.modelocomboformapago.getSize()>0)  //si se cargaron correctamente los elementos de checkout, por si no se cargan, cosa que ya paso
                cargaronelementoscheckout=true;
            if(this.entroXConstructor2) //si entro x el constructor 2
                this.cargarDatosAlHacerClickEnLaLista(this.ccl, this.cr);
    }//GEN-LAST:event_formWindowOpened

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        int posicion = jList1.locationToIndex(evt.getPoint());
        if(posicion >=0){
            String txt=mimodelolistacodigos.get(posicion).toString();  //modelo con los codigos
            StringTokenizer tok=new StringTokenizer(txt,"-");
            int codcli=Integer.parseInt(tok.nextToken());
            int codres=Integer.parseInt(tok.nextToken());
            this.cargarDatosAlHacerClickEnLaLista(codcli,codres);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Transaction t=null;                                            //boton buscar
        try{
            modelohabdispo = new MiDefaultTableModel();
            modelohabdispo.addColumn("Número");
            modelohabdispo.addColumn("Ubicación");
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            t=Sesion.beginTransaction();
            String tex=mimodelocombo.getSelectedItem().toString();
            StringTokenizer toke=new StringTokenizer(tex,"-");
            ctipo=Integer.parseInt(toke.nextToken());
            fini=jFormattedTextField1.getText();
            ffin=jFormattedTextField2.getText();
            Query q=Sesion.createQuery("from Habitacion where tipohab = "+ctipo);
            List li=q.list();
            if(li.size()>0){
                int contdenoencontrados=0;
                for(int k=0;k<q.list().size();k++){
                    hab=(Habitacion)li.get(k);
                    if(this.EstaDisponible(fini, ffin, hab.getIdhabit()))  //si esta libre
                            cargarAlModeloHabDispoLaHabitacion(hab.getIdhabit());
                    else
                        contdenoencontrados++;
                 }
                if(contdenoencontrados==li.size())
                    this.limpiarHabDispo();
            }
            t.commit();
            this.CERRARSesion();
        }catch (NoSuchElementException e1) {
            e1.printStackTrace();
            t.rollback();
        }catch(NumberFormatException e2){
            e2.printStackTrace();
            t.rollback();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jFormattedTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyReleased
                                                                              // texto fecha1
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField1.transferFocus();
    }//GEN-LAST:event_jFormattedTextField1KeyReleased

    private void jFormattedTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField2KeyReleased
                                                                                // texto fecha2
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField2.transferFocus();
    }//GEN-LAST:event_jFormattedTextField2KeyReleased

    private void jFormattedTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusLost
        String texto=jFormattedTextField1.getText();                              //cuadro de fecha1
        if(texto.equals("  /  /    ")==false){  //si no esta vacio
            if(cluti.FechaValidaDMA(texto)==false){  //si la fecha no es valida
                JOptionPane.showMessageDialog(null,"Fecha NO válida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jFormattedTextField1.requestFocus();
                jFormattedTextField1.setText("");
            }
        }
    }//GEN-LAST:event_jFormattedTextField1FocusLost

    private void jFormattedTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField2FocusLost
                                                                      //cuadro de fecha2
            String texto1=jFormattedTextField1.getText();
            String texto2=jFormattedTextField2.getText();
            if(texto2.equals("  /  /    ")==false){  //si no esta vacio
                if(cluti.FechaValidaDMA(texto2)==false){  //si la fecha no es valida
                    JOptionPane.showMessageDialog(null,"Fecha NO válida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jFormattedTextField2.requestFocus();
                    jFormattedTextField2.setText("");
                }else{
                    if(texto1.equals("  /  /    ")==false){
                        if(cluti.esFecha1MayorALaFecha2(texto2, texto1)==false){
                            JOptionPane.showMessageDialog(null,"No está permitido que para la búsqueda la fecha de inicio sea menor o igual a la fecha de fin","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                            jFormattedTextField2.requestFocus();
                            jFormattedTextField2.setText("");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Favor cargar la fecha de inicio antes de la fecha de fin","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        jFormattedTextField2.requestFocus();
                        jFormattedTextField2.setText("");
                        jFormattedTextField1.requestFocus();
                    }
                }
            }
    }//GEN-LAST:event_jFormattedTextField2FocusLost

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
                                                                    //CAMPO DE TEXTO ID/CODIGO HABITACION
        Transaction tx=null;
        if(jTextField6.getText().isEmpty()==false){
            try{
                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                tx=Sesion.beginTransaction();
                Query q=Sesion.createQuery("from Habitacion where idhabit  = "+jTextField6.getText());
                if(q.list().isEmpty()==false){ //si no esta vacio
                    List l=q.list();
                    hab=(Habitacion) l.get(0);
                  
                    jTextField8.setText(hab.getTipohab().getCantadultos()+"");
                    jTextField9.setText(hab.getTipohab().getCantninos()+"");
                    if(this.obtenerObjetoSubTipoDeCombo())
                       jTextField7.setText(subti.getPrecioxnoche()+"");
                    else
                       jTextField7.setText("");
                    this.jButton3.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Habitación no encontrada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    LimpiarCamposhab1();
                    hab=null;
                }
                tx.commit();
                this.CERRARSesion();
            }
            catch(HibernateException e){
                e.printStackTrace();
                tx.rollback();
            }
        }
        else{
            this.LimpiarCamposhab1();
            hab=new Habitacion();
        }

    }//GEN-LAST:event_jTextField6FocusLost

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
    if(jButton3.isEnabled()){
        if(jTextField6.getText().isEmpty()==false){//BOTON AGREGAR
            if(res.getCheckout()=='0'){
                if(jFormattedTextField3.getText().equals("  /  /    ")==false && jFormattedTextField4.getText().equals("  /  /    ")==false){
                    if(cluti.esFecha1MayorALaFecha2(this.jFormattedTextField4.getText(), this.jFormattedTextField3.getText())){
                    try {
                        String fechaini=jFormattedTextField3.getText();
                        String fechafin=jFormattedTextField4.getText();
                        if(!(jCheckBox1.isSelected()==false && fechaini.equals(fechafin)==true)){ //si no se hace una res corta, la fecha de ini y de fin no deben ser iguales)
                            if(this.jCheckBox1.isSelected()==true){
                                Calendar fechaf = cluti.Date_Calender(cluti.StrDMA_Date(jFormattedTextField4.getText()));
                                fechaf.add(Calendar.DATE, 1);
                                fechafin=cluti.Date_StringDMA(clasesutiles.Calender_Date(fechaf));
                            }
                            if(this.EstaDisponible(fechaini,fechafin, Integer.parseInt(jTextField6.getText()))){
                                boolean edicionValida=true;
                                boolean edicion=false;
                                int codi=0;
                                int fil=0;
                                int codi2=Integer.parseInt(jTextField6.getText());
                                int celem=modelores1.getRowCount();
                                String fecEntradaNueva=this.jFormattedTextField3.getText();
                                String fecSalidaNueva=this.jFormattedTextField4.getText();
                                for(int k=0;k<celem;k++){   //se recorre la tabla1 para ver si existe el codigo de habit
                                    codi=Integer.parseInt(modelores1.getValueAt(k, 0).toString()); //extrae el codigo de la tabla
                                    if(codi == codi2){
                                        fil=k;
                                        String fecEntradaEnTabla=modelores1.getValueAt(fil, 2).toString();
                                        String fecSalidaEnTabla=modelores1.getValueAt(fil, 3).toString();
                                        if(!(cluti.esFecha1MayorALaFecha2(fecEntradaNueva, fecSalidaEnTabla) || cluti.esFecha1MayorALaFecha2(fecEntradaEnTabla,fecSalidaNueva))){
                                            if(edicion==false){
                                                 edicion=true;  //entra a modo edicion si el codigo de habitacion ya existe en la grilla
                                            }else{
                                                 edicionValida=false;  //la segunda vez ya da error xq no se permite que las fechas se superpongan
                                            }
                                        }
                                    }
                                }
                                if(edicionValida==true){
                                    if(edicion==true){
                                        if(this.filaSeleccionadaAEditar>=0){
                                          if(codi2==Integer.parseInt(this.modelores1.getValueAt(this.filaSeleccionadaAEditar, 0).toString())) //si la habitacion a editar es la misma que la que se selecciono en la grilla
                                          EditarTablares1(this.filaSeleccionadaAEditar/*fil*/,fechaini,jFormattedTextField4.getText());  //esto edita la tabla
                                        }else{
                                            JOptionPane.showMessageDialog(null,"Favor seleccionar una habitación reservada a editar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }else {
                                        AgregarTablares1(hab,fechaini,jFormattedTextField4.getText());  //esto carga la tabla
                                        celem=modelores2.getRowCount();
                                        codi2=hab.getTipohab().getIdtipoh();
                                        for(int k=0;k<celem;k++){   //se recorre la tabla2 para ver si existe el codigo de producto
                                            codi=Integer.parseInt(modelores2.getValueAt(k, 0).toString()); //extrae el codigo del tipo de hab de la tabla2
                                            if(codi == codi2){
                                                edicion=true;  //entra a modo edicion si el codigo de tipo ya existe en la grilla2
                                                int num=Integer.parseInt(modelores2.getValueAt(k, 2).toString()); //obtiene la cantidad de habitaciones que ya se cargaron del mismo tipo
                                                modelores2.setValueAt((num+1), k, 2);
                                                this.jTable3.setModel(modelores2);
                                                k=celem;//para parar el bucle
                                            }
                                        }
                                        if(edicion==false){
                                            AgregarTablares2(codi2,hab.getTipohab().getDescripth());  //esto carga la tabla
                                        }
                                        LimpiarCamposhab1();
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Dos fechas por habitacion están superpuestas, favor editarlas manualmente, o crear una sola a partir de ellas","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                                }
                                cambios1=true;
                                actualizarSubtotalDesdeModelores1();
                                jLabel1.setText("TOTAL PARCIAL: "+conv.conversion(subto));
                            }else
                                JOptionPane.showMessageDialog(null,"Habitación NO disponible en esta fecha","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                            JOptionPane.showMessageDialog(null,"No está permitido que en una reservación completa, la entrada y la salida sean el mismo día","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null,"Error 1","ERROR",JOptionPane.ERROR_MESSAGE);
                                ex.printStackTrace();
                            }
                    }else
                        JOptionPane.showMessageDialog(null,"La fecha de entrada debe ser inferior a la de salida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                }else
                    JOptionPane.showMessageDialog(null,"Favor completar los campos requeridos antes de continuar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
           }else
                JOptionPane.showMessageDialog(null,"La reservación ya fue cerrada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

        }else
            JOptionPane.showMessageDialog(null,"Favor seleccionar una habitación disponible antes de continuar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }
}//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        int c=modelores1.getRowCount();              // BOTON BORRAR ELEMENTO DE LA GRILLA2
        this.actualizarFechaDeHoy();
        if(jButton4.isEnabled()){
            if(!(this.jFormattedTextField3.getText().equals("  /  /    ")||this.jFormattedTextField4.getText().equals("  /  /    "))){
            if(c>0){
                String idh=modelores1.getValueAt(fila, 0).toString();
                int x=JOptionPane.showConfirmDialog(null,"¿Desea quitar la habitación "+idh+" de la reservación?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(x==0){
                    cambios1=true;
                    int cthab=0;
                    if(Integer.parseInt(Character.toString(res.getCheckin()))==0){
                       // if(cluti.esFecha1MayorALaFecha2(jFormattedTextField3.getText(), this.fechadehoy)==false){
                            float precio=Float.parseFloat(modelores1.getValueAt(fila, 4).toString());
                            Transaction tx=null;
                            try{
                                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                tx=Sesion.beginTransaction();
                                hab=(Habitacion)Sesion.get(Habitacion.class,idh);
                                if(hab!=null){ //si no esta vacio
                                    cthab=hab.getTipohab().getIdtipoh();//obtiene el codigo del tipo borrado en la primera tabla para descontarlo de la 2da
                                }
                                tx.commit();
                                this.CERRARSesion();
                            }
                            catch(HibernateException e){
                                tx.rollback();
                            }
                            if(hab!=null){
                              //  if(this.subresgest.existeSubreserva(hab.getIdhabit(), res.getIdres())){  //xq en una hab nueva no existe en subreserva
                                    subres=subresgest.getMiSubreserva();
                                    if(this.permitidoBorrarSubres(subres.getIdsubres())){ 
                                        for(int j=0;j<modelores2.getRowCount();j++){  //recorre la tabla de reservas 2
                                            int cthab2=Integer.parseInt(modelores2.getValueAt(j, 0).toString());
                                            if(cthab==cthab2){
                                                int can=Integer.parseInt(modelores2.getValueAt(j, 2).toString());
                                                if((can-1)==0){
                                                    modelores2.removeRow(j);
                                                }
                                                else{
                                                    modelores2.setValueAt((can-1), j, 2);
                                                }
                                                break;  //sale del for
                                            }
                                        }
                                        modelores1.removeRow(fila);  //borra la fila de la tabla 1
                                        modelores11.removeRow(fila);
                                        subto=subto-precio;
                                        jLabel1.setText("TOTAL PARCIAL: "+this.conv.conversion(subto));
                                        LimpiarCamposhab1();
                                    }else
                                        JOptionPane.showMessageDialog(null,"No es permitido borrar una habitación que ha tenido actividad en el hotel","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                               // }else
                                 //  JOptionPane.showMessageDialog(null,"No existe esta habitación","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                            }else
                                JOptionPane.showMessageDialog(null,"Habitación es nula","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                       /* }else
                            JOptionPane.showMessageDialog(null,"No es permitido borrar una habitación pasada la fecha de inicio de la reservación ","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);*/
                    }else
                        JOptionPane.showMessageDialog(null,"No es permitido borrar una habitación una vez hecho el Check-In de alguna habitación","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                }
            }else
                  JOptionPane.showMessageDialog(null,"No se encontraron habitaciones cargadas","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null,"Campo fecha vacío","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
       }
}//GEN-LAST:event_jButton4MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        nuevo();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        fila=jTable2.rowAtPoint(evt.getPoint());                 //grilla2
        this.filaSeleccionadaAEditar=fila;
        String codigo=modelores1.getValueAt(fila, 0)+""; //extrae el contenido de la tabla
        String feini=modelores1.getValueAt(fila, 2)+"";
        String fefin=modelores1.getValueAt(fila, 3)+"";
        jTextField6.setText(codigo);   //completa los cuadros de texto
        jTextField6.requestFocus();
        jTextField6.transferFocus();
        jFormattedTextField3.setText(cluti.ObtenerFechaSinBarra(feini));
        jFormattedTextField4.setText(cluti.ObtenerFechaSinBarra(fefin));
        if(modelores1.getValueAt(fila,5).toString().equals("SI")){
            jCheckBox1.setSelected(true);
        }else{
            jCheckBox1.setSelected(false);
        }
        if(this.modelores11.getRowCount()>0){
            this.ubicarComboSubTipoEnPosicion(Integer.parseInt(modelores11.getValueAt(fila, 0).toString()));
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if(cambios1){
            int x=JOptionPane.showConfirmDialog(null,"¿Seguto que desea salir sin guardar los cambios?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(x==0)
                this.dispose();//sale

        }
        else
            this.dispose();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
                                                                    // BOTON GUARDAR
        if(cambios1) {  //si se realizo algun cambio o se desea confirmar una reserva web
            int x=JOptionPane.showConfirmDialog(null,"¿Desea guardar los cambios?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(x==0){
                if(jTextField2.getText().isEmpty()==false && res!=null){
                    if(Integer.parseInt(Character.toString(res.getCheckout()))==0){ //si todavia no se hizo checkout
                       ////////////////esto se hace solo para verificar si el monto total no es menor al pagado
                        boolean val=false;
                        if(this.resges.ExisteIdReservaEnTabla(res.getIdres())){
                            float tres=this.calcularTotalReservacion(res.getIdres());
                            //float tabo=this.calcularTotalHospedajeReservacion(res.getIdres());
                            float tabo=res.getTotalcubierto();
                            if((tres-this.calcularTotalHospedajeReservacion(res.getIdres())+this.subto)>=res.getTotalcubierto() || tres<tabo)  //si se borra una hab o se reduce la cantidad de dias y el monto total queda inferior al abonado
                                val=true;                                                                                                       // no permite guardar, pero si en caso de que por otro motivo el monto total es inferior al abonado
                            ///else val=false
                        }else
                            val=true;
                        if(val){
                            if(modelores1.getRowCount()>0){
                               // if(res.getCheckin()=='0'){  //TRATAR DE EVITAR
                                    if(GuardarTodo1()){
                                        JOptionPane.showMessageDialog(null,"Guardado Correcto","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                        cambios1=false;
                                        paisencontrado=false;
                                        reservacionencontrada=false;
                                        LimpiarTodo1();
                                        nuevo();
                                        refrescarlista();
                                        this.deshabilitarbotones();
                                    } else
                                        JOptionPane.showMessageDialog(null,"No se pudo guardar correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                               /* }else
                                    JOptionPane.showMessageDialog(null,"No es posible editar la reserva una vez hecho el check-in, favor crear una nueva reservación","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                            */}else{
                                JOptionPane.showMessageDialog(null,"Reservación sin habitaciones asignadas...","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                borrar();
                               }
                        }else
                            JOptionPane.showMessageDialog(null,"No se permite guardar una reservación con un subtotal inferior al monto abonado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                    }else
                        JOptionPane.showMessageDialog(null,"No está permitido modificar reservaciones concretadas","AVISO",JOptionPane.INFORMATION_MESSAGE);
                }else
                    JOptionPane.showMessageDialog(null,"Favor buscar una reservación activa o crear una nueva","AVISO",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
                                                                   //para validar el CAMPO DE TEXTO ID/CODIGO habitacion
        boolean esint=Character.isDigit(evt.getKeyChar());   //tira true si el boton presionado es un digito
        if(esint==false){      //si no se ingresa un digito
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                //evt.setKeyChar((char)119);
                jTextField6.transferFocus();
            else
                evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        fila=jTable1.rowAtPoint(evt.getPoint());                 //grillabusqueda
        String codigo=modelohabdispo.getValueAt(fila, 0)+""; //extrae el contenido de la tabla
        jTextField6.setText(codigo);   //completa los cuadros de texto
        jTextField6.requestFocus();
        jTextField6.transferFocus();
        jFormattedTextField3.setText(cluti.ObtenerFechaSinBarra(jFormattedTextField1.getText()));  //copia lo de fecha 1 al 3
        jFormattedTextField4.setText(cluti.ObtenerFechaSinBarra(jFormattedTextField2.getText()));  //copia lo de fecha 2 al 4
        Transaction tx=null;
        try{
            Sesion=NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            Query q=Sesion.createQuery("from Subreserva where habitacion  = "+codigo+" and reservacion = "+res.getIdres());
            if(q.list().isEmpty()==false){//si no esta vacio
            subres=(Subreserva)q.list().get(0);
                if(subres.getFechaocup()!=null){
                    jButton4.setEnabled(false); //porque no se puede borrar una vez hecho el checkin en la habitacion
                }
                else
                    jButton4.setEnabled(true);
            }
            tx.commit();
            this.CERRARSesion();
        }catch(HibernateException ee){
            tx.rollback();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
       this.LimpiarTodo1();                                              //boton limpiar
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
                                                                      // boton borrar que no borra sino que deshabilita nada mas   
       borrar();

    }//GEN-LAST:event_jButton10MouseClicked

    private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
                                                                        //CAMPO DE TEXTO ID/CODIGO cliente2
        Transaction tx1=null;
        if(jTextField11.getText().isEmpty()==false){
            if(pais2encontrado==true){  //si no esta vacio
                try{
                  //  int existe=0;
                    Sesion=NewHibernateUtil.getSessionFactory().openSession();
                    tx1=Sesion.beginTransaction();
                    Query q11=Sesion.createQuery("from Cliente where doc  = "+jTextField11.getText()+"and idpais = "+pais2.getIdpais());
                    if(q11.list().isEmpty()==false){ //si no esta vacio
                        List l11=q11.list();
                        clie2encontrado=true;
                        clie2=(Cliente) l11.get(0);
                        jTextField12.setText(clie2.getNombre());
                        jTextField13.setText(clie2.getApellido());
                        jTextField15.setText(clie2.getCelular());
                        ubicarCombo2EnPosicion(clie2.getTipodocumento().getIdtipodoc());
                        jFormattedTextField5.setText(cluti.ObtenerFechaSinGuion(cluti.Date_StringDMA(clie2.getFechanac())));
                    }else{
                        int r=JOptionPane.showConfirmDialog(null,"Cliente no encontrado, ¿Desea AGREGARLO?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                        if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                            String ndoc=jTextField11.getText();
                            String nompais=jTextField14.getText();
                            LimpiarCamposclie22();
                            jTextField14.setText(nompais);
                            jTextField11.setText(ndoc);
                            jTextField12.requestFocus();
                        }
                        else{
                            LimpiarCamposclie22();
                            jTextField14.setText("");
                            clie=new Cliente();
                            clieencontrado=false;
                        }

                    }
                    tx1.commit();
                    this.CERRARSesion();
                }
                catch(HibernateException e){
                    e.printStackTrace();
                    tx1.rollback();
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Favor realizar la búsqueda del país antes de continuar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField2.setText("");
                clieencontrado=false;
                clie=new Cliente();
            }

        }
    }//GEN-LAST:event_jTextField11FocusLost

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
                                                                 //para validar el CAMPO DE TEXTO documento cliente2
        if(jTextField11.getText().length()<30){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField11.transferFocus();
        }
        else
            evt.consume();
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped
                                                                 //para validar el CAMPO DE TEXTO nombre
        if(jTextField12.getText().length()<30){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField12.transferFocus();
        }
        else
            evt.consume();
    }//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
                                                                 //para validar el CAMPO DE TEXTO apellido
        if(jTextField13.getText().length()<30){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField13.transferFocus();
        }
        else
            evt.consume();
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyTyped
                                                               //para validar el CAMPO DE TEXTO celular
        if(jTextField15.getText().length()<60){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField15.transferFocus();
        }
        else
            evt.consume();
    }//GEN-LAST:event_jTextField15KeyTyped

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField14KeyTyped

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased
        String texto=jTextField14.getText();                            //PARA BUSQUEDA INTERACTIVA de pais
        Transaction tx2=null;
        cambiobusqueda2=true;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        if(((int)evt.getKeyChar()) == 10){ //si se presiono enter
            jTextField14.transferFocus();
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
                co=Integer.parseInt(mimodelo2.getValueAt(xxx, 0).toString());
                de=mimodelo2.getValueAt(xxx, 1).toString();
                jTextField14.setText(de);
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
                        co=Integer.parseInt(mimodelo2.getValueAt(xxx, 0).toString());
                        de=mimodelo2.getValueAt(xxx, 1).toString();
                        jTextField14.setText(de);
                    }
                } else{
                    z=false;
                    try{
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tx2=Sesion.beginTransaction();
                        Query q13=Sesion.createQuery("from Pais where (descrippais like'"+"%" +texto+"%"+ "') ");
                        mimodelo2 = new DefaultTableModel();
                        mimodelo2.addColumn("Código");
                        mimodelo2.addColumn("Descripción");
                        List milis= q13.list();
                        tx2.commit();
                        this.CERRARSesion();
                        for (int i=0;i<milis.size();i++){
                            Pais pp=(Pais)milis.get(i);
                            Object [] ffi = new Object[2]; // Hay dos columnas en la tabla
                            ffi[0] = pp.getIdpais();
                            ffi[1] = pp.getDescrippais();
                            mimodelo2.addRow(ffi);// Se añade al modelo la fila completa.
                        }
                        lo=mimodelo2.getRowCount();
                    } catch(HibernateException ex){
                        tx2.rollback();
                        ex.printStackTrace();
                    }
                }
            }

        }
}//GEN-LAST:event_jTextField14KeyReleased

    private void jTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusLost
       String codpai="";                                           //lost de la busqueda interactiva pais2
    if(cambiobusqueda2){ //si se busco algo
       if(mimodelo2.getRowCount()>0){
                codpai=mimodelo2.getValueAt(xxx, 0).toString();
                if(this.buscarPais2(codpai)){                    //si se encontro el pais
                    jTextField14.setText(pais2.getDescrippais());
                    pais2encontrado=true;
                    if(jTextField14.getText().isEmpty()==false){  //manda un enter al codigo
                        jTextField14.requestFocus();
                        jTextField14.transferFocus();
                    }
                }
                else{
                    pais2encontrado=false;
                    pais2=new Pais();
                }
            }
            else{
                pais2encontrado=false;
                pais2=new Pais();
        }
    }
}//GEN-LAST:event_jTextField14FocusLost

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
                                                //busq interactiva pais2
        jTextField14.selectAll();
        xxx=0;
        lo=0;
        co=0;
        de="";
        z=false;
        cambiobusqueda2=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        mimodelo2 = new DefaultTableModel();
}//GEN-LAST:event_jTextField14FocusGained

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
    // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
   //nada
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
                                                                        //BOTON AGREGAR2
    if(jButton15.isEnabled()){
        if(jTextField11.getText().isEmpty()==false && jTextField12.getText().isEmpty()==false && jFormattedTextField5.getText().equals("  /  /    ")==false && jTextField13.getText().isEmpty()==false && pais2encontrado){
            if(cligest.existeCliente(jTextField11.getText(), pais2.getIdpais())==true){
                clie2= new Cliente();
                clie2=cligest.getCliente();
                clie2encontrado=true;
            }else{
                int coo=cligest.getsiguientecodigo();
                if(coo>0){
                    Transaction tx3=null;
                    Transaction tx2=null;
                    try{
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        clie2=new Cliente();
                        clie2.setIdcli(coo);
                        clie2.setDoc(this.jTextField11.getText());
                        clie2.setNombre(jTextField12.getText().toUpperCase());
                        clie2.setApellido(jTextField13.getText().toUpperCase());
                        clie2.setCelular(jTextField15.getText());
                        clie2.setFechanac(cluti.StrDMA_Date(jFormattedTextField5.getText()));
                        clie2.setPais(pais2);
                        clie2.setEstitular('0');
                        clie2.setTelefono("");
                        clie2.setRuc("");
                        clie2.setTelefono("");
                        clie2.setDireccion("");
                        clie2.setNrochapa("");       //se completan con "" para que no quede null
                        tx2=Sesion.beginTransaction();
                        Tipodocumento td=(Tipodocumento)Sesion.get(Tipodocumento.class, obtenerCodigoActualDeCombo2());
                        tx2.commit();
                        CERRARSesion();
                        if(td!=null)
                            clie2.setTipodocumento(td);
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            tx3=Sesion.beginTransaction();
                            Sesion.saveOrUpdate(clie2);
                            JOptionPane.showMessageDialog(null,"Huésped cargado correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            tx3.commit();
                            CERRARSesion();
                            clie2encontrado=true;
                            LimpiarCamposclie22();
                            this.jTextField11.requestFocus();
                    }
                    catch(HibernateException e){
                        e.printStackTrace();
                    }
                    catch(ParseException e1){
                        e1.printStackTrace();
                    }
                }else
                    clie2encontrado=false;
            }
            if(clie2encontrado){
                if(!existeClieEnReservacion(clie2.getIdcli(),res)){  //si todavia no esta cargado
                    if(!existeClieEnGrilla(clie2.getIdcli())){
                        Transaction tx=null;
                        try{
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            tx=Sesion.beginTransaction();
                            SQLQuery q=Sesion.createSQLQuery("Select idcli, nombre, apellido, fechanac, CURDATE(), (YEAR(CURDATE())-YEAR(fechanac))- (RIGHT(CURDATE(),5)<RIGHT(fechanac,5)) as edad from cliente where idcli = "+clie2.getIdcli());
                            List liss=q.list();
                            String categoria="";
                            if(liss.size()>0){
                                Object[] objeto1=new Object[6];
                                objeto1=(Object[])liss.get(0);
                                int edad=Integer.parseInt(objeto1[5].toString());  //saca la edad del query
                                if (edad > EDADLIMITEDENINHO)
                                    categoria="ADULTO";
                                else
                                    categoria="NIÑO";
                                Object[] objeto=new Object[5];
                                objeto[0]=objeto1[0];
                                objeto[1]=objeto1[1];
                                objeto[2]=objeto1[2];
                                objeto[3]=objeto1[5];
                                objeto[4]=categoria;
                                modeloclie1.addRow(objeto);
                                jTable4.setModel(modeloclie1);
                            }
                            //else
                                // existe=false;
                            tx.commit();
                            this.CERRARSesion();
                        }catch(HibernateException ex){
                            tx.rollback();
                                ex.printStackTrace();
                        }

                    }else
                          JOptionPane.showMessageDialog(null,"El huésped ya fue cargado a la grilla","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                 }else
                    JOptionPane.showMessageDialog(null,"El huésped ya fue cargado a la reservación","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            }else
                JOptionPane.showMessageDialog(null,"El Huésped no pudo ser cargado","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null,"Favor completar los datos personales del huésped","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
     }
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
      int c=modeloclie1.getRowCount();              // BOTON BORRAR ELEMENTO DE LA GRILLA de clientes

        if(jButton20.isEnabled() && c>0 && fila>=0){
            if(c>0){
                String nom=modeloclie1.getValueAt(fila, 1).toString();
                String ape=modeloclie1.getValueAt(fila, 2).toString();
                int x=JOptionPane.showConfirmDialog(null,"¿Desea quitar a "+nom+" "+ape+" de este grupo?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(x==0){
                    modeloclie1.removeRow(fila);
                    fila=0;
                    this.cambios2=true;
                }
            }
       }
    }//GEN-LAST:event_jButton20MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
                                                                // click en la grilla checkin
    if(modelocheck1.getRowCount()>0)
        fila2=jTable6.rowAtPoint(evt.getPoint());
        if(Integer.parseInt(modelocheck1.getValueAt(fila2, 2).toString())+Integer.parseInt(modelocheck1.getValueAt(fila2, 3).toString())>0){
            int codigoh=Integer.parseInt(modelocheck1.getValueAt(fila2,0).toString());
            int x=JOptionPane.showConfirmDialog(null,"¿Desea Extraer y Modificar los ocupantes de la habitación Nº: "+codigoh+" ?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(x==0){
                Transaction tx=null;
                        try{
                            int cSub=Integer.parseInt(modelocheck1.getValueAt(fila2, 6).toString());
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            tx=Sesion.beginTransaction();
                            SQLQuery q=Sesion.createSQLQuery("Select idcli, nombre, apellido, fechanac, CURDATE(), (YEAR(CURDATE())-YEAR(fechanac))- (RIGHT(CURDATE(),5)<RIGHT(fechanac,5)) as edad from cliente where idcli in (Select idcli from cliexsub as c, subreserva as s where c.idsubres = s.idsubres and s.idsubres = "+cSub+")");
                            List liss=q.list(); //tiene todos los clientes alojados en la habitacion especificada de esta reservacion
                            tx.commit();
                            this.CERRARSesion();
                            String categoria="";
                            if(liss.size()>0){
                                int c=0; //contador de borrados
                                for(int i=0;i<liss.size();i++){  //recorre la primera vez para borrar los cliente de la habitacion ocupada
                                    Object[] obje=new Object[6];
                                    CliexsubGest cxsg=new CliexsubGest();
                                    obje=(Object[])liss.get(i);
                                    int codigoc=Integer.parseInt(obje[0].toString());
                                    if(subresgest.existeSubreserva(codigoh, res.getIdres())==true){
                                        subres=new Subreserva();
                                        subres=subresgest.getMiSubreserva();
                                        if(cxsg.existeClienteEnSubreserva(codigoc, subres.getIdsubres())){
                                            Transaction tx1=null;
                                            try{   
                                                Cliexsub cxs=cxsg.getMiClieXSub();
                                                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                                tx1=Sesion.beginTransaction();
                                                Sesion.delete(cxs);
                                                tx1.commit();
                                                c++;
                                            }catch(HibernateException e){
                                                tx1.rollback();
                                                e.printStackTrace();
                                            }

                                        }

                                    }
                                }
                                if(c==liss.size()){
                                    for(int i=0;i<liss.size();i++){//recorre la 2da vez para cargar la grilla de clientes
                                        Object[] objeto1=new Object[6];
                                        objeto1=(Object[])liss.get(i);
                                        int edad=Integer.parseInt(objeto1[5].toString());  //saca la edad del query
                                        if (edad > EDADLIMITEDENINHO)
                                            categoria="ADULTO";
                                        else
                                            categoria="NIÑO";
                                        Object[] objeto=new Object[5];
                                        objeto[0]=objeto1[0];
                                        objeto[1]=objeto1[1];
                                        objeto[2]=objeto1[2];
                                        objeto[3]=objeto1[5];
                                        objeto[4]=categoria;
                                        modeloclie1.addRow(objeto);
                                        jTable4.setModel(modeloclie1);
                                    }
                                }else
                                    JOptionPane.showMessageDialog(null,"Operación fallida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                                cargarTablacheck1();              //actualiza las tablas
                                actualizarListacheckin1DesdeLaGrilla();
                            }
                            //else
                                // existe=false;

                        }catch(HibernateException ex){
                            tx.rollback();
                                ex.printStackTrace();
                        }

            }
        }
    else
        fila2=-1; //es -1 cuando no es valido
}//GEN-LAST:event_jTable6MouseClicked

    private void jFormattedTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField4KeyReleased
        // texto fecha 4
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField4.transferFocus();
}//GEN-LAST:event_jFormattedTextField4KeyReleased

    private void jFormattedTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField4FocusLost
                                                                           //cuadro de fecha
            String texto1=jFormattedTextField3.getText();
            String texto2=jFormattedTextField4.getText();
            if(texto2.equals("  /  /    ")==false){  //si no esta vacio
                if(cluti.FechaValidaDMA(texto2)==false){  //si la fecha no es valida
                    JOptionPane.showMessageDialog(null,"Fecha NO válida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jFormattedTextField4.requestFocus();
                    jFormattedTextField4.setText("");
                }else{
                    if(texto1.equals("  /  /    ")==false){
                        if(cluti.esFecha1MenorALaFecha2(texto2, texto1)){
                            JOptionPane.showMessageDialog(null,"No está permitido que la fecha de salida sea menor a la fecha de entrada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                            jFormattedTextField4.requestFocus();
                            jFormattedTextField4.setText("");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Favor cargar la fecha de entrada antes de la fecha de salida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        jFormattedTextField4.requestFocus();
                        jFormattedTextField4.setText("");
                        jFormattedTextField3.requestFocus();
                    }
                }
            }
}//GEN-LAST:event_jFormattedTextField4FocusLost

    private void jFormattedTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField3KeyReleased
        // texto fecha 3
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField3.transferFocus();
}//GEN-LAST:event_jFormattedTextField3KeyReleased

    private void jFormattedTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField3FocusLost
        String texto=jFormattedTextField3.getText();                              //cuadro de fecha
        if(texto.equals("  /  /    ")==false){  //si no esta vacio
            if(cluti.FechaValidaDMA(texto)==false){  //si la fecha no es valida
                JOptionPane.showMessageDialog(null,"Fecha NO válida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jFormattedTextField3.requestFocus();
                jFormattedTextField3.setText("");
            }else{
                this.actualizarFechaDeHoy();
                if(cluti.obtenerDiferenciaDeFechasEnDias2(fechadehoy,jFormattedTextField3.getText())>this.DIASRETRASOFECHAENTRADAYSALIDA){  //si la fecha es inferior al limite
                    JOptionPane.showMessageDialog(null,"Fecha es inferior al limite de retraso admitido por el sistema","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jFormattedTextField3.requestFocus();
                    jFormattedTextField3.setText("");
                }

            }
        }
}//GEN-LAST:event_jFormattedTextField3FocusLost

    private void jButton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15MouseEntered

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        if(jCheckBox1.isSelected()==true){
            int x=JOptionPane.showConfirmDialog(null,"Esta acción reservará la habitación durante un día entero al final de la fecha a cargarse más abajo,\nquedando sin la posibilidad de que la otra mitad del día pueda ser ocupada a partir de la mañana \n¿De todas formas, desea continuar?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(x!=0)
                    jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
      int valido=2;
      int codhab=obtenerCodigoDeHabitacionMasAdecuadaParaElGrupo();
      if(this.jButton13.isEnabled()){
          if(codhab>=0){
              if(this.modeloclie1.getRowCount()>0 && jButton13.isEnabled()==true){
                 // if(fila2>=0){
                  //codhab=Integer.parseInt(modelocheck1.getValueAt(fila2,0).toString()); //con la deteccion automatica de la mejor habitacion esto quedo en desuso
                  int r=JOptionPane.showConfirmDialog(null,"¿Desea ocupar la habitación Nº "+codhab+"?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                  if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                        if(esValidoElGrupoParaLaHabitacion(codhab))
                            valido=1;
                        else
                            valido=0;
                  }
                  else{
                     String str = JOptionPane.showInputDialog(null, "Ingresar el Nº de habitación a ocupar : ","SOLICITUD", JOptionPane.QUESTION_MESSAGE);
                     boolean habvali=true;
                     int codint=0;
                     try{
                       codint =Integer.parseInt(str);  //prueva si se puede parsear a int
                     }catch(NumberFormatException e){
                         habvali=false;
                     }
                     if(str != null && str.isEmpty()==false){
                         if(habvali){
                            resges=new ReservacionGest();
                            if(resges.ExisteLaHabitacionDisponibleEnReservacion(codint, res.getIdres())){
                                try{
                                    codhab=Integer.parseInt(str);
                                    if(esValidoElGrupoParaLaHabitacion(codhab))
                                        valido=1;
                                    else
                                        valido=0;
                                }catch(NumberFormatException e){}
                           }else
                               JOptionPane.showMessageDialog(null,"Número de habitación no existe o no está disponible","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                         }else
                            JOptionPane.showMessageDialog(null,"Número de habitación no es válido","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                     }
                  }
                if(valido==1){
                    if(obtenerIndiceTablaHabReservadasQueCoincidaConNroHabitacionYFechaActual(codhab)>=0){
                        Sesion=NewHibernateUtil.getSessionFactory().openSession();
                        Sesion.getTransaction().begin();
                        Estado est=new Estado();
                        est=(Estado)Sesion.get(Estado.class, 5);  //ocupado
                        CliexsubGest cxsg=new CliexsubGest();
                        int checkinn=2;  //INICIA CON 2 PARA VER SI CAMBIO
                        hab=(Habitacion)Sesion.get(Habitacion.class, codhab);
                        Habitacion h=hab;
                        h.setLlave('0');
                        Sesion.update(h);
                        Sesion.getTransaction().commit();
                        CERRARSesion();
                        if(subresgest.existeSubreserva(codhab, res.getIdres()) && hab!=null && est!=null){ //CUANDO TODO ESTA BIEN EMPIEZA A GUARDAR
                            subres=new Subreserva();
                            subres=subresgest.getMiSubreserva();
                            if(this.habges.estaOcupadaLaHabitacion(codhab)==false){
                               String fechaini=cluti.Date_StringDMA(subres.getFechaocup());
                               boolean oo=cluti.esFecha1MenorALaFecha2(fechadehoy, fechaini);
                               if(oo==false){
                                    Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                    Transaction txx=Sesion.beginTransaction();
                                    Query q1=Sesion.createQuery("from Cliexsub where idsubres = "+subres.getIdsubres());
                                    List li1=q1.list();//obtiene todas las personas ocupantes de esta hab
                                    txx.commit();
                                    CERRARSesion();
                                    if(li1.isEmpty()){  //si no hay ocupantes ya cargados
                                        int contadordeeditadosenocu=0;
                                        Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                        Transaction tx7=Sesion.beginTransaction();
                                        Query q=Sesion.createQuery("from Ocupaciones where idestado <> 5 and idres = "+res.getIdres()+" and idhabit = "+hab.getIdhabit());
                                        List li=q.list();//obtiene todas las ocupaciones de esta habitacion cuando todavia no tenga estado ocupado
                                        tx7.commit();
                                        CERRARSesion();
                                        Ocupaciones oc=new Ocupaciones();
                                        for(int i=0;i<li.size();i++){  //actualiza el estado de las ocupaciones a ocupado
                                            oc=new Ocupaciones();
                                            oc=(Ocupaciones) li.get(i);
                                            Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                            Transaction tx2=Sesion.beginTransaction();
                                            Ocupaciones oc2=(Ocupaciones) Sesion.load(Ocupaciones.class, oc.getIdocup());
                                            oc2.setEstado(est);
                                            tx2.commit();
                                            CERRARSesion();
                                            contadordeeditadosenocu++;
                                        }
                                        int contadordeguardados=0;
                                        for(int i=0;i<modeloclie1.getRowCount();i++){
                                            int codcl=Integer.parseInt(modeloclie1.getValueAt(i,0).toString());
                                            Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                            Transaction tx2=Sesion.beginTransaction();
                                            Cliente cl=(Cliente)Sesion.get(Cliente.class, codcl);
                                            tx2.commit();
                                            CERRARSesion();
                                            if(cl!=null){
                                                int cod=cxsg.getsiguientecodigo();
                                                if(cod>0){
                                                    Cliexsub clxsu=new Cliexsub();
                                                    clxsu.setIdcliexsub(cod);
                                                    clxsu.setCliente(cl);
                                                    clxsu.setSubreserva(subres);
                                                    Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                                    Transaction tx3=Sesion.beginTransaction();
                                                    Sesion.save(clxsu);
                                                    tx3.commit();
                                                    CERRARSesion();
                                                    contadordeguardados++;
                                                }
                                            }
                                        }
                                        if(contadordeguardados==modeloclie1.getRowCount()&&contadordeeditadosenocu==li.size()){
                                            try{
                                                subres.getFeyhocheckin().toString();
                                                checkinn=1;
                                            }
                                            catch(NullPointerException e){
                                                checkinn=0;   //tira error si la fecha de checkin es null
                                            }
                                            boolean error=false;
                                            try{
                                                if(checkinn==0){
                                                    Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                                    Transaction tx5=Sesion.beginTransaction();
                                                    Date fec=new Date();
                                                    subres.setFeyhocheckin(fec);
                                                    Sesion.update(subres);
                                                    tx5.commit();
                                                    CERRARSesion();
                                                    if(res.getCheckin()=='0'){
                                                        Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                                        Transaction tx6=Sesion.beginTransaction();
                                                        Reservacion re=new Reservacion();
                                                        re=(Reservacion) Sesion.load(Reservacion.class, res.getIdres());
                                                        re.setCheckin('1');
                                                        tx6.commit();
                                                        this.res.setCheckin('1');   //actualiza res para que cuando se vuelva a la primera pestaña figure como que ya hizo el checkin
                                                        CERRARSesion();
                                                    }
                                                }
                                            }catch(HibernateException e){
                                                error=true;
                                                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar registrar el check-in","ERROR",JOptionPane.ERROR_MESSAGE);
                                                e.printStackTrace();
                                            }
                                            if(error==false){  //si no dio error manda el mensaje y actualiza las grillas
                                                cargarTablacheck1();
                                                actualizarListacheckin1DesdeLaGrilla();
                                                modeloclie1 = new MiDefaultTableModel();
                                                modeloclie1.addColumn("Código");
                                                modeloclie1.addColumn("Nombre");
                                                modeloclie1.addColumn("Apellido");
                                                modeloclie1.addColumn("Edad");
                                                modeloclie1.addColumn("Categoría");
                                                jTable4.setModel(modeloclie1);
                                                JOptionPane.showMessageDialog(null,"Guardado correcto","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        }else
                                            JOptionPane.showMessageDialog(null,"Guardado incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                                    }else
                                        JOptionPane.showMessageDialog(null,"Esta habitacion ya está ocupada, si desea modificar sus ocupantes, favor desocuparla haciendo click en la grilla de abajo","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                                }else
                                    JOptionPane.showMessageDialog(null,"La fecha de inicio de la reserva de esta habitación es mayor a la fecha actual","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                           }else
                                JOptionPane.showMessageDialog(null,"Esta habitacion aun está ocupada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        }else
                           JOptionPane.showMessageDialog(null,"Esta habitación no ha sido reservada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    }else
                        JOptionPane.showMessageDialog(null,"Esta habitación no ha sido tomada en esta reservación","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                }else{
                   if(valido==0)
                        JOptionPane.showMessageDialog(null,"La habitación no puede ser ocupada por esta/s persona/s. Si desea agregar huéspedes a una habitación ya ocupada,\nfavor seleccionarla de la grilla de abajo","AVISO",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }else
           JOptionPane.showMessageDialog(null,"Ninguna habitación puede contener a este grupo","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
     }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
                                                                    // click en la grilla cliente
    if(modelocheck1.getRowCount()>0)
        fila=jTable4.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTable4MouseClicked

    private void jFormattedTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField5FocusLost
        String texto=jFormattedTextField5.getText();                              //cuadro de fecha
        if(texto.equals("  /  /    ")==false){  //si no esta vacio
            if(cluti.FechaValidaDMA(texto)==false){  //si la fecha no es valida
                JOptionPane.showMessageDialog(null,"Fecha NO válida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jFormattedTextField5.setText("");
                jFormattedTextField5.requestFocus();
            }else{
                this.actualizarFechaDeHoy();
                if(cluti.obtenerDiferenciaDeFechasEnDias2(texto,fechadehoy)>0){  //si la fecha es > que la de hoy
                    JOptionPane.showMessageDialog(null,"Fecha superior a la actual","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jFormattedTextField5.requestFocus();
                    jFormattedTextField5.setText("");
                }
            }
        }
    }//GEN-LAST:event_jFormattedTextField5FocusLost

    private void jFormattedTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField5KeyReleased
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField5.transferFocus();
    }//GEN-LAST:event_jFormattedTextField5KeyReleased

    private void jComboBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseClicked

    }//GEN-LAST:event_jComboBox3MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
      Transaction tx=null;
      Banco banco=new Banco();
      float montoapagar=Float.parseFloat(jTextField21.getText());
      float montopagadomoneda=Float.parseFloat(jTextField22.getText());
      float montopagadogs=0;
      if(montoapagar<=this.TotalGeneral){
          ApeyciecajaGest apeges=new ApeyciecajaGest();
          if(apeges.estaAbierta()){
              Apeyciecaja ape=new Apeyciecaja();
              ape=apeges.getmiapeyciecaja();
              int x=JOptionPane.showConfirmDialog(null,"¿Desea registrar este cobro?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
              if(x==0){
                 try{///////////////OBTIENE MONEDA 1 DEL PAGO////////////////////////////////
                     Moneda moneda1=new Moneda();
                     Sesion = NewHibernateUtil.getSessionFactory().openSession();
                     tx=Sesion.beginTransaction();
                     int codmo=obtenerCodigoActualDeComboMoneda();
                     moneda1=(Moneda)Sesion.get(Moneda.class, codmo);
   //                  CERRARSesion();
                     ///////////////OBTIENE MONEDA 2 DEL CAMBIO////////////////////////////////
                     Moneda moneda2=new Moneda();
                     codmo=obtenerCodigoActualDeComboMoneda2();
                     moneda2=(Moneda)Sesion.get(Moneda.class, codmo);
                     ///////////////OBTIENE TIPO MOVIMIENTO DEL PAGO////////////////////////////////
                     Tipomov tipomov1=new Tipomov();
                     tipomov1=(Tipomov)Sesion.get(Tipomov.class, 1);  //pago
                     ///////////////OBTIENE TIPO MOVIMIENTO DEL CAMBIO////////////////////////////////
                     Tipomov tipomov2=new Tipomov();
                     tipomov2=(Tipomov)Sesion.get(Tipomov.class, 2);  //cambio
                     ///////////////OBTIENE LA FORMA DE PAGO DEL PAGO////////////////////////////////
                     Formapago formapago1=new Formapago();
                     int codfp=obtenerCodigoActualDeComboFormaPago();
                     formapago1=(Formapago)Sesion.get(Formapago.class, codfp);
                     ///////////////OBTIENE LA FORMA DE PAGO DEL CAMBIO////////////////////////////////
                     Formapago formapago2=new Formapago();
                     formapago2=(Formapago)Sesion.get(Formapago.class, 1);  //efectivo
                     ///////////////OBTIENE banco////////////////////////////////
                     int codban=obtenerCodigoActualDeComboBanco();
                     if(codban>0){  //es -1 si no se selecciono ningun banco
                         banco=(Banco)Sesion.get(Banco.class, codban);
                     }
                     if(moneda1!=null && moneda2!=null && tipomov1!=null && tipomov2!=null && formapago1!=null && formapago2!=null){
                         if(estanCompletosLosCamposPago(formapago1, banco, jTextField23.getText(), jFormattedTextField7.getText())==true){
                             montopagadogs=montopagadomoneda*moneda1.getVenta();
                             //diferencia=(montopagadogs-montoapagar)/moneda2.getVenta();  //esto ya hace en actualizarcambio
                             if((montopagadomoneda*montoapagar)!=0){
                                  if(montopagadogs>=montoapagar){
                                       if(!(formapago1.getIdforma()>1 && jTextField23.getText().isEmpty())){//si no es efectivo y si el num de doc esta vacio
                                             Caja caja1=new Caja();
                                             Movcaja mcaja1=new Movcaja();  //pago
                                             MovCajaGest mcajages=new MovCajaGest();
                                             Date fe=new Date();
                                             Caja caja2=new Caja();
                                             Movcaja mcaja2=new Movcaja();   //cambio
                                             ///////////////////////////////movimiento de caja por la diferencia//////////////////////////////////////
                                             CajaGest cajages =new CajaGest();
                                             float montoencaja2=cajages.existenciaFormaMoneda(1, moneda2.getIdmoneda());  //es 1 xq es efectivo, se obtiene para ver si existe el cambio
                                             boolean valido2=true;
                                             // int codmcaja=mcajagest.getsiguientecodigo();
                                             int codm=mcajages.getsiguientecodigo(); //esto no deberia hacerlo, pero tengo que xq sino me duplica el codigo al obtener automaticamente el id del mov;
                                             if(diferencia>0){ //si hay que dar cambio
                                                 if(montoencaja2 < diferencia){
                                                    JOptionPane.showMessageDialog(null,"No hay suficiente efectivo de esta moneda en caja","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                                    valido2=false;
                                                 }else {
                                                    caja2=new Caja();
                                                    if(montoencaja2>0){ //si existe efectivo y esa moneda
                                                        caja2=cajages.getMiCaja();
                                                        caja2.setMonto(montoencaja2-diferencia);
                                                        Sesion.update(caja2);
                                                     //   if(codmcaja>0){
                                                       //   mcaja2.setIdmov(codmcaja+1);   //es +1 xq el mcaja 1 va a tener este codigo, hice asi xq no puedo pedir un nuevo codigo para el otro sin hacer el commit antes...
                                                            float montogs=cluti.redondear(diferencia*moneda2.getVenta());
                                                            mcaja2.setTipomov(tipomov2);
                                                            mcaja2.setFeyhomov(fe);
                                                            mcaja2.setMontomov(cluti.redondear(diferencia));
                                                            mcaja2.setMontogs(montogs);
                                                            mcaja2.setMontogscondesc(montogs);
                                                            mcaja2.setCliente(res.getCliente());
                                                            mcaja2.setFormapago(formapago2);
                                                            mcaja2.setReservacion(res);
                                                            mcaja2.setApeyciecaja(ape);
                                                            mcaja2.setMoneda(moneda2);
                                                            mcaja2.setObs("");
                                                            mcaja2.setNumcompro("");
                                                            codm++;  //para que el siguiente codigo sea el de mcaja2 + 1
                                                            cajages.getsiguientecodigo(); //esto no deberia hacerlo, pero tengo que xq
                                                          //mcaja2.setEsgasto('0');
                 //                                           Sesion = NewHibernateUtil.getSessionFactory().openSession();
                 //                                           tx7=Sesion.beginTransaction();
                                                            Sesion.save(mcaja2);
                                                            mcajages=new MovCajaGest();  //por si no actualiza el codigo de arriba
                                                   //     }
                                                     }
                                                 }
                                             }
                                             if(valido2){
                                                float montoencaja1=cajages.existenciaFormaMoneda(formapago1.getIdforma(), moneda1.getIdmoneda());  //para ver si existe esta forma de paco y moneda
                                                if(montoencaja1 < 0){  //no exite esta forma y moneda, entonces hay q crear
                                                    int codforma=cajages.getsiguientecodigo();
                                                    if(codforma>0){
                                                        caja1=new Caja();
                                                        caja1.setIdcaja(codforma);
                                                        caja1.setFormapago(formapago1);
                                                        caja1.setMoneda(moneda1);
                                                        caja1.setMonto(cluti.redondear(montopagadomoneda));
                                                        Sesion.save(caja1);
                                                    }
                                                 }else{  //si se encontro la forma y la moneda hay que sumarle
                                                    caja1=new Caja();
                                                   // caja1=cajages.getMiCaja();
                                                    caja1=(Caja) Sesion.load(Caja.class, cajages.getMiCaja().getIdcaja());
                                                    caja1.setMonto(cluti.redondear(montoencaja1+Float.parseFloat(jTextField21.getText())));
                                                 }
                                            //     int codmcaja1=mcajagest.getsiguientecodigo();
                                                 int coddoc=docges.getsiguientecodigo();
                                                 Documentos doc=new Documentos();

                                             //    if(codmcaja1>0){
                                                    if(formapago1.getIdforma()>1){  //si no es efectivo guarda en documentos
                                                        if(coddoc >0){
                                                            doc.setIddoc(coddoc);
                                                            doc.setMonto(cluti.redondear(montopagadomoneda));
                                                            doc.setEncaja('1');
                                                            doc.setObsdoc(jTextField24.getText());
                                                            if(formapago1.getTienebanco()=='1')
                                                                doc.setBanco(banco);
                                                            if(formapago1.getTienenumero()=='1')
                                                                doc.setNumerodoc(jTextField23.getText());
                                                            if(formapago1.getTienefecha()=='1')
                                                                doc.setFechavenc(cluti.StrDMA_Date(jFormattedTextField7.getText()));
                                                            doc.setFormapago(formapago1);
                                                            doc.setMoneda(moneda1);
                                                            Sesion.save(doc);
                                                            float montogs=cluti.redondear(montopagadogs);
                                                            mcaja1=new Movcaja();
                                                            mcaja1.setIdmov(codm);
                                                            mcaja1.setTipomov(tipomov1);
                                                            mcaja1.setFeyhomov(fe);
                                                            mcaja1.setMontomov(montopagadomoneda);
                                                            mcaja1.setCliente(res.getCliente());
                                                            mcaja1.setFormapago(formapago1);
                                                            mcaja1.setReservacion(res);
                                                            mcaja1.setMoneda(moneda1);
                                                            mcaja1.setDocumentos(doc);
                                                            mcaja1.setObs("");
                                                            mcaja1.setNumcompro("");
                                                            mcaja1.setMontogs(montogs);
                                                            float montocondesc=montogs-(montogs*formapago1.getPordesc()/100);
                                                            mcaja1.setMontogscondesc(cluti.redondear(montocondesc));
                                                            mcaja1.setApeyciecaja(ape);
                                                            Sesion.save(mcaja1);
                                                        }
                                                    }else{ 
                                                        mcaja1=new Movcaja();
                                                        mcaja1.setIdmov(codm);
                                                        mcaja1.setTipomov(tipomov1);
                                                        mcaja1.setFeyhomov(fe);
                                                        mcaja1.setMontomov(cluti.redondear(montopagadomoneda));
                                                        mcaja1.setCliente(res.getCliente());
                                                        mcaja1.setFormapago(formapago1);
                                                        mcaja1.setReservacion(res);
                                                        mcaja1.setMoneda(moneda1);
                                                        mcaja1.setObs("");
                                                        mcaja1.setNumcompro("");
                                                       // mcaja1.setEsgasto('0');
                                                        mcaja1.setMontogs(cluti.redondear(montopagadogs));
                                                        mcaja1.setMontogscondesc(cluti.redondear(montopagadogs));
                                                        mcaja1.setApeyciecaja(ape);
                                                        Sesion.save(mcaja1);
              //                                          tx10.commit();
              //                                          CERRARSesion();
                                                    }
                                                    

                                                    if(jRadioButton5.isSelected()==true && jTextField16.getText().isEmpty()==false){ 
                                                        subres=new Subreserva();
           //                                             Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                                        if(subresgest.existeSubreserva(Integer.parseInt(jTextField16.getText()),res.getIdres())){
                                                            subres=subresgest.getMiSubreserva();
          //                                                  tx12=Sesion.beginTransaction();
                                                            float sub=subres.getMontoabonado();
                                                            subres.setMontoabonado(cluti.redondear(sub+montoapagar));
                                                            Sesion.update(subres);
                                                            this.jTextField26.setText(Float.toString(sub+montoapagar));
                                                            this.jTextField26.setText(Float.toString(Float.parseFloat(this.jTextField25.getText())-Float.parseFloat(this.jTextField26.getText())));
         //                                                   tx12.commit();
         //                                                   CERRARSesion();
                                                        }
                                                    }else{            ///////////////////////////////////controlar
           //                                             Sesion = NewHibernateUtil.getSessionFactory().openSession();
           //                                             Transaction tx14=Sesion.beginTransaction();
                                                        Reservacion re=new Reservacion();
                                                        re=(Reservacion)Sesion.load(Reservacion.class, res.getIdres());
                                                        re.setTotalcubierto(cluti.redondear(re.getTotalcubierto()+montoapagar));
                                                        re.setDescuento(Float.parseFloat(this.jTextField31.getText()));
          //                                              tx14.commit();
          //                                             CERRARSesion();
                                                     }
                                           //     }
                                                tx.commit();
                                                LimpiarCamposPago();
                                                this.cargarTablaCheckout();         //este si usa una sesion apaste, pero se hace el commit antes ya
                                                actualizarTotales();
                                                this.jLabel48.setText("");
                                                JOptionPane.showMessageDialog(null,"Cobro registrado correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                             }
                                       }else
                                          JOptionPane.showMessageDialog(null,"Campo Número de documento vacío","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                                 }else
                                    JOptionPane.showMessageDialog(null,"El monto pagado es inferior al que se desea pagar","AVISO",JOptionPane.INFORMATION_MESSAGE);
                             }else
                                 JOptionPane.showMessageDialog(null,"Favor ingresar monto a pagar y monto pagado antes de continuar","PETICIÓN",JOptionPane.INFORMATION_MESSAGE);
                         }else
                             JOptionPane.showMessageDialog(null,"Favor completar los campos requeridos por esta forma de pago antes de continuar","PETICIÓN",JOptionPane.INFORMATION_MESSAGE);
                     }
                 }
                 catch(HibernateException e){
                    tx.rollback();
                    e.printStackTrace();
                 }
                 catch(ParseException e1){
                    tx.rollback();
                    e1.printStackTrace();
                 }
              }
              this.actualizarTotales();
            }else
               JOptionPane.showMessageDialog(null,"Debe abrir caja antes de realizar un movimiento sobre la misma","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null,"Monto a pagar superior al monto restante","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            
    }//GEN-LAST:event_jButton16MouseClicked

    private void jComboBox6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox6MouseClicked
      //nada
    }//GEN-LAST:event_jComboBox6MouseClicked

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
                                                                                //click en el combo moneda 1
        if((Float.parseFloat(jTextField21.getText())*Float.parseFloat(jTextField22.getText()))>0)  //si nunguno de los 2 es 0
              actualizarCambio();
        else{
            if(Float.parseFloat(jTextField21.getText())>0 && Float.parseFloat(jTextField22.getText())==0)
                jTextField22.setText(conv.conversion2(actualizarMontoAPagar()));
                this.actualizarCambio();
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged
                                 //click en el combo moneda 2
        if((Float.parseFloat(jTextField21.getText())*Float.parseFloat(jTextField22.getText()))>0)  //si nunguno de los 2 es 0
              actualizarCambio();
    }//GEN-LAST:event_jComboBox6ItemStateChanged

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
       
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton5MouseClicked
                                                                        //  radiobutton pagar
        if(jTextField16.getText().isEmpty()==false && jRadioButton5.isSelected()){
            jTextField21.setText(jTextField20.getText());
            jTextField21.transferFocus();
        }else
            JOptionPane.showMessageDialog(null,"Favor seleccionar una habiración a la que desea asignar el pago","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jRadioButton5MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
                                                        // click en la grilla ckechout
     if(jFormattedTextField6.getText().equals("  /  /    ")==false){
        int fila3=jTable5.rowAtPoint(evt.getPoint());
            if(fila3<modelocheckout.getRowCount()){
                int cod=Integer.parseInt(modelocheckout.getValueAt(fila3, 0)+""); //extrae el codigo de habitacion de la tabla
                Transaction tx=null;
                try{
                    subresgest=new SubReservaGest();
                    if(subresgest.existeSubreserva(cod, res.getIdres())){
                        subres=new Subreserva();
                        subres=subresgest.getMiSubreserva();
                        boolean vali=false;
                        if(cluti.esFecha1MayorALaFecha2(jFormattedTextField6.getText(),cluti.Remplazar('-', '/',cluti.Date_StringDMA(subres.getFechadesoc())))==true){ //si la fecha de salida guardada en la reservacion es igual a la cagada en la caja de formato
                             int xx = JOptionPane.showConfirmDialog(null, "Fecha de salida mayor a la reservada,¿Desea que ésta sea la fecha de salida real?", "CONSULTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                             if(xx==JOptionPane.YES_OPTION){
                                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                tx=Sesion.beginTransaction();
                                Subreserva subr=subres;
                                subr.setFechadesoc(cluti.StrDMA_Date(jFormattedTextField6.getText()));
                                Sesion.update(subr);
                                tx.commit();
                                CERRARSesion();
                                subres=subr;
                                vali=true;
                                //update subreserva set feyhocheckout = null where idsubres=2;
                             }else{
                                 vali=false;
                             }
                         }else
                             vali=true;

                        if(vali){
                            float serv=calcularTotalServiciosSubres(subres.getIdsubres());
                            float cons=calcularTotalConsumisionSubres(subres.getIdsubres());
                            float hosp=calcularTotalHospedajeSubres(subres.getIdsubres());
                            float mul=calcularTotalMultasSubres(subres.getIdsubres());
                            float subtot=serv+cons+hosp+mul;
                            jTextField16.setText(Integer.toString(cod));
                            jTextField17.setText(this.conv.conversion2(serv));
                            jTextField18.setText(this.conv.conversion2(cons));
                            jTextField19.setText(this.conv.conversion2(hosp));
                            jTextField25.setText(this.conv.conversion2(subtot));
                            jTextField26.setText(this.conv.conversion2(subres.getMontoabonado()));
                            jTextField28.setText(this.conv.conversion2(mul));
                            jTextField20.setText(this.conv.conversion2(subtot-subres.getMontoabonado()));
                            jRadioButton4.setSelected(true);
                            jButton14.setEnabled(true);
                        }
                    }


                }catch(HibernateException ee){
                    ee.printStackTrace();
                }
                catch(ParseException e1){
                    e1.printStackTrace();
                }
            }
        }else
            JOptionPane.showMessageDialog(null,"Campo fecha de salida vacío","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
    if(jFormattedTextField6.getText().equals("  /  /    ")==false){
       if(jTextField16.getText().isEmpty()==false && jButton14.isEnabled()){//boton checkout
         int x=JOptionPane.showConfirmDialog(null,"¿Confirmar CHECK - OUT?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
         if(x==0){
             Transaction tx=null;
             Transaction tx2=null;
             Transaction tx3=null;
             Transaction tx4=null;
             try{               
                 if(subresgest.existeSubreserva(Integer.parseInt(jTextField16.getText()), res.getIdres())){
                     subres=new Subreserva();
                     subres=subresgest.getMiSubreserva();
                     Sesion=NewHibernateUtil.getSessionFactory().openSession();
                     Transaction txx=Sesion.beginTransaction();
                     SQLQuery q1=Sesion.createSQLQuery("select o.idocup from Ocupaciones as o,  Habitacion as h, Subreserva as s where o.idhabit= h.idhabit and h.idhabit = s.idhabit and s.idsubres = "+subres.getIdsubres());
                     List li1=q1.list();//obtiene todas las ocuopaciones de esta subreserva para eliminarlas
                     for(int i=0;i<li1.size();i++){  //borra todas las ocupaciones de esta habitacion durante todo el tiempo por las que fue reservada
                         Object ob=new Object();
                         ob=(Object)li1.get(i);
                         Ocupaciones oc=new Ocupaciones();
                         oc=(Ocupaciones) Sesion.get(Ocupaciones.class, Integer.parseInt(ob.toString()));
                         if(oc!=null)
                            Sesion.delete(oc);
                     }
                     txx.commit();
                     CERRARSesion();
                     boolean vali=false;  //guarda true si la fecha de salida es = a la ya guardada o si se modifico
                     if(subres.getFeyhocheckout()==null){  //si todavia no se hizo el checkout
                         if(cluti.esFecha1MayorALaFecha2(jFormattedTextField6.getText(),cluti.Remplazar('-', '/',cluti.Date_StringDMA(subres.getFechadesoc())))==true){ //si la fecha de salida guardada en la reservacion es igual a la cagada en la caja de formato
                             int xx = JOptionPane.showConfirmDialog(null, "Fecha de salida mayor a la reservada,¿Desea que ésta sea la fecha de salida real?", "CONSULTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                             if(xx==JOptionPane.YES_OPTION){
                                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                tx4=Sesion.beginTransaction();
                                Subreserva subr=subres;
                                subr.setFechadesoc(cluti.StrDMA_Date(jFormattedTextField6.getText()));
                                Sesion.update(subr);
                                tx4.commit();
                                CERRARSesion();
                                subres=subr;
                                vali=true;
                                //update subreserva set feyhocheckout = null where idsubres=2;
                             }else{
                                 vali=false;
                             }
                         }else
                             vali=true;
                         if(vali){
                             Sesion=NewHibernateUtil.getSessionFactory().openSession();
                             tx=Sesion.beginTransaction();
                             Date fe=new Date();
                             Subreserva su=new Subreserva();
                             su=(Subreserva) Sesion.load(Subreserva.class, subres.getIdsubres());
                             su.setFeyhocheckout(fe);
                             su.setSubtotalhosp(this.calcularTotalHospedajeSubres(subres.getIdsubres()));
                             su.setSubtotconsum(this.calcularTotalConsumisionSubres(subres.getIdsubres()));
                             Sesion=NewHibernateUtil.getSessionFactory().openSession();
                             Habitacion h=(Habitacion)Sesion.load(Habitacion.class, subres.getHabitacion().getIdhabit());
                             h.setLlave('1');
                             tx.commit();
                             CERRARSesion();
                             LimpiarCamposCheckOut();
                             //this.cargarTablaCheckout();
                             JOptionPane.showMessageDialog(null,"El Check-Out de esta habitación finalizó correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                             //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                             //////////////////controla si todas las habitaciones ya realizaronn checkout//////////////////////

                             if(hicieronCheckOutTodasLasHabitaciones()){  //si todas ya tienen checkout
                                 JOptionPane.showMessageDialog(null,"El Check-Out de todas las habitaciones de esta reservación finalizó correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                 jButton14.setEnabled(false);
                                 if(diferencia>0)
                                     jButton1.setEnabled(true);
                                 else
                                     jButton1.setEnabled(false);
                             }
                        }
                     }else
                         JOptionPane.showMessageDialog(null,"El Check-Out de esta habitación ya fue resalizado","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                     actualizarTotales();
                 }
             }catch (HibernateException e) {
                e.printStackTrace();
                //tx.rollback();
             }
             catch (ParseException e1) {
                e1.printStackTrace();
               // tx.rollback();
             }
             cargarTablaCheckout();
         }
     }
  }else
     JOptionPane.showMessageDialog(null,"Fecha de salida vacía","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton14MouseClicked

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    if(jButton1.isEnabled()){                                                                   // BOTON LIQUIDAR
        if(Float.parseFloat(jTextField27.getText())>0){
            jTextField21.setText(jTextField27.getText());
            jTextField21.transferFocus();
          //  reservacionliquidada=false;
        }else
            JOptionPane.showMessageDialog(null,"El monto total de la resevación ya ha sido liquidado","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
      if(jButton17.isEnabled() && this.TotalGeneral==0 && this.hicieronCheckOutTodasLasHabitaciones()){      // BOTON imprimir factura
        FacturaGest fges=new FacturaGest();
        float totabo=this.calcularTotalAbonado(res.getIdres());
        float totres=this.calcularTotalReservacion(res.getIdres());
        totalHospedaje=this.calcularTotalHospedajeServiciosMultasReservacion(res.getIdres());
        totalConsumision=this.calcularTotalConsumisionReservacion(res.getIdres());
        float totconsred=cluti.redondearEnterosHastaLaCentena(totalConsumision);
        float tothospred=cluti.redondearEnterosHastaLaCentena(totalHospedaje);

        Sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = Sesion.beginTransaction();
        int ban=0;  //bandera para que si no desea culminar la reserva no siga adelante
        try {
            if(res.getCheckout()=='0'){
                int xy = JOptionPane.showConfirmDialog(null, "¿Desea dar por concluida esta reservación?", "CONSULTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(xy==0){
                    Reservacion res2 = new Reservacion();
                    res2 =(Reservacion) Sesion.load(Reservacion.class, res.getIdres());
                    res2.setTotalres(totres);
                    res2.setTotalcubierto(totabo);
                    res2.setDescuento(Float.parseFloat(jTextField31.getText()));
                    res2.setCheckout('1');
                    res2.setCheckin('1');    //por si sale sin ni siquiera entrar...
                    res.setCheckout('1');   //para actualizar tambien res
                    res.setCheckin('1');

                }else
                    ban=1;
            }
            if(ban==0){
                String nu=obtenerNumFactura();
                boolean imprimir1=true;//es false si se presiona en no en el sgte mensaje
                String numerosActivos=fges.existeFacturaImpresaEnTablaFactura(res.getIdres());  //devuelve los numeros de fac activos de la res, si no tiene devuelve vacio
                if(numerosActivos.isEmpty()==false){  //si existe factura activa
                   int xx = JOptionPane.showConfirmDialog(null, "¿Desea anular la factura Nro.: "+numerosActivos+"?", "CONSULTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                   if(xx==0){  //si no se cargo correctamente
                        this.anularTodasLasFacturasDeReserva(res);
                   }else
                       imprimir1=false;
                }
                if(imprimir1){
                    boolean impr=false;

                    /////////////////////muestra la ventana con los datos de la factura///////////////////////////////
                    boolean existe=true;
                    FrmDatosFactura frmdatosfac=null;
                    try{
                         frmdatosfac.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
                    }                    //para cerrarla antes de crear una nueva...tira error si no existe
                    catch(NullPointerException ex){
                         existe=false;  //si no existe una clase previa
                    }
                    if (existe)
                        frmdatosfac.dispose();
                    frmdatosfac=new FrmDatosFactura((Frame)this.getParent(),true,nu,clie.getNombre()+" "+clie.getApellido(),clie.getRuc(),clie.getDireccion(),clie.getTelefono(),tothospred,totconsred,res.getDescuento(),true);
                    frmdatosfac.setVisible(true);
                    /////////////////////////////////////////////////////////////////////////////////////////////
                    int codfac=facges.getsiguientecodigo();  //obtiene el codigo de la factura a imprimir y le pasa a imprimirfactura xq si se obtiene dentro de este metodo tira error la 2da vez que se lo llama xq esta en la misma sesion
                    if(frmdatosfac.getAceptodatos()){
                        if(frmdatosfac.getImprEn2Facturas()==false){
                            nu=frmdatosfac.getNumFac();
                            int x1 = JOptionPane.showConfirmDialog(null, "¿La Factura a imprimir es la Nº "+nu+"?", "CONSULTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if(x1==0)
                                impr=imprimirFactura(frmdatosfac.getvalorItem2(), frmdatosfac.getvalorItem1(), nu, frmdatosfac.getNombre(), frmdatosfac.getRuc(), frmdatosfac.direc, frmdatosfac.getTelefono(), frmdatosfac.getFechaEmision(), frmdatosfac.getItem1(), frmdatosfac.getItem2(),codfac);
                            else{
                                anularTodasLasFacturasDeReserva(res);
                                JOptionPane.showMessageDialog(null,"Impresión cancelada","AVISO",JOptionPane.INFORMATION_MESSAGE);
                               /* nu=this.ventanaCargarNumFactura();
                                if(nu.isEmpty()==false && facges.esValidoNumFact(nu)){
                                    guardarNumFactura(nu);
                                    impr=imprimirFactura(frmdatosfac.getvalorItem2(), frmdatosfac.getvalorItem1(), nu, frmdatosfac.getNombre(), frmdatosfac.getRuc(), frmdatosfac.direc, frmdatosfac.getTelefono(), frmdatosfac.getFechaEmision(), frmdatosfac.getItem1(), frmdatosfac.getItem2());
                                }*/
                            }
                        }else{  //SI SE DESEAN IMPRIMIR EN 2 FACTURAS
                            nu=frmdatosfac.getNumFac();
                            float difHosp=tothospred-frmdatosfac.getvalorItem1();
                            float difCons=totconsred-frmdatosfac.getvalorItem2();
                            int x1 = JOptionPane.showConfirmDialog(null, "¿La Factura a imprimir es la Nº "+nu+"?", "CONSULTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if(x1==0){  ////////////IMPRIME LA primera FACTURA
                                impr=imprimirFactura(frmdatosfac.getvalorItem2(), frmdatosfac.getvalorItem1(), nu, frmdatosfac.getNombre(), frmdatosfac.getRuc(), frmdatosfac.direc, frmdatosfac.getTelefono(), frmdatosfac.getFechaEmision(), frmdatosfac.getItem1(), frmdatosfac.getItem2(),codfac);
                                if(impresa){
                                    nu=this.aumentarNumeroFactura(nu);
                                    codfac++;
                                    FrmDatosFactura frmdatosfac2=null;
                                    /////////////////////muestra la segunda ventana con los datos de la factura///////////////////////////////
                                    existe=true;
                                    try{
                                         frmdatosfac2.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
                                    }                    //para cerrarla antes de crear una nueva...tira error si no existe
                                    catch(NullPointerException ex){
                                         existe=false;  //si no existe una clase previa
                                    }
                                    if (existe)
                                         frmdatosfac2.dispose();
                                    frmdatosfac2=new FrmDatosFactura((Frame)this.getParent(),true,nu,frmdatosfac.getNombre(),frmdatosfac.getRuc(),frmdatosfac.getDireccion(),frmdatosfac.getTelefono(),difHosp+difCons,Float.parseFloat("0.0"),Float.parseFloat("0.0"),false); //el descuento en la 2da factura es 0
                                    frmdatosfac2.setVisible(true);
                                    /////////////////////////////////////////////////////////////////////////////////////////////
                                    
                                    if(frmdatosfac2.getAceptodatos()){
                                        nu=frmdatosfac2.getNumFac();
                                        int x2 = JOptionPane.showConfirmDialog(null, "¿La Factura a imprimir es la Nº "+nu+"?", "CONSULTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                                        if(x2==0)
                                            impr=imprimirFactura(frmdatosfac2.getvalorItem2(), frmdatosfac2.getvalorItem1(), nu, frmdatosfac2.getNombre(), frmdatosfac2.getRuc(), frmdatosfac2.direc, frmdatosfac2.getTelefono(), frmdatosfac2.getFechaEmision(), frmdatosfac2.getItem1(), frmdatosfac2.getItem2(),codfac);
                                        //       imprimirFactura(float totcons, float tothosp, String NumFac, String NomYApe, String Ruc, String Direc, String Telef, String fecEmi, String it1, String it2, int idfac)
                                        else{
                                            anularTodasLasFacturasDeReserva(res);
                                            JOptionPane.showMessageDialog(null,"Impresión cancelada","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        if((frmdatosfac2.getvalorItem2()+frmdatosfac2.getvalorItem1()+frmdatosfac.getvalorItem2()+frmdatosfac.getvalorItem1())!=(tothospred+totconsred)){
                                            anularTodasLasFacturasDeReserva(res);
                                            JOptionPane.showMessageDialog(null,"Facturas anuladas porque los montos de ambas facturas no coincide con el total","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }else{
                                        anularTodasLasFacturasDeReserva(res);
                                        JOptionPane.showMessageDialog(null,"Impresión cancelada","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                            } else{
                                anularTodasLasFacturasDeReserva(res);
                                JOptionPane.showMessageDialog(null,"Impresión cancelada","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            }



                        }
                    }
                    tx.commit();
                    CERRARSesion();
                 }
            }
          }catch (HibernateException ex){
               tx.rollback();
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null,"Ha ocurrido un error al imprimir la factura","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
          }catch(java.lang.Exception e){
               tx.rollback();
               e.printStackTrace();
               JOptionPane.showMessageDialog(null,"Ha ocurrido un error al imprimir la factura","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
          }
      }
    
    }//GEN-LAST:event_jButton17MouseClicked

    private void jFormattedTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField7KeyReleased
       if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField7.transferFocus();
    }//GEN-LAST:event_jFormattedTextField7KeyReleased

    private void jFormattedTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField6KeyReleased
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField6.transferFocus();
    }//GEN-LAST:event_jFormattedTextField6KeyReleased

    private void jFormattedTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField7FocusLost
        String texto=jFormattedTextField7.getText();                            //cuadro de fecha
        this.actualizarFechaDeHoy();
        if(texto.equals("  /  /    ")==false){  //si no esta vacio
            if(cluti.FechaValidaDMA(texto)==false){  //si la fecha no es valida
                JOptionPane.showMessageDialog(null,"Fecha NO válida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jFormattedTextField7.requestFocus();
                jFormattedTextField7.setText("");
            }
            if(cluti.esFecha1MenorALaFecha2(jFormattedTextField7.getText(),fechadehoy) || cluti.esFecha1IgualALaFecha2(jFormattedTextField7.getText(),fechadehoy)){  //si la fecha es <= a la actual
                JOptionPane.showMessageDialog(null,"Fecha Menor o igual a la actual","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jFormattedTextField7.requestFocus();
                jFormattedTextField7.setText("");
            }
        }
    }//GEN-LAST:event_jFormattedTextField7FocusLost

    private void jFormattedTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField6FocusLost
        String texto=jFormattedTextField6.getText();                              //cuadro de fecha
        this.actualizarFechaDeHoy();
        if(texto.equals("  /  /    ")==false){  //si no esta vacio
            if(cluti.FechaValidaDMA(texto)==false){  //si la fecha no es valida
                JOptionPane.showMessageDialog(null,"Fecha NO válida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jFormattedTextField6.requestFocus();
                jFormattedTextField6.setText("");
            }else{
                if(cluti.esFecha1MayorALaFecha2(texto,fechadehoy)){  //si la fecha es > a la actual
                    JOptionPane.showMessageDialog(null,"Fecha Mayor a la actual","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jFormattedTextField6.requestFocus();
                    jFormattedTextField6.setText("");
                }else{
                    this.actualizarFechaDeHoy();
                    if(cluti.obtenerDiferenciaDeFechasEnDias2(fechadehoy,texto)>this.DIASRETRASOFECHAENTRADAYSALIDA){  //si la fecha es inferior al limite
                        JOptionPane.showMessageDialog(null,"Fecha es inferior al limite de retraso admitido por el sistema","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        jFormattedTextField6.requestFocus();
                        jFormattedTextField6.setText("");
                    }

                }
            }
        }
    }//GEN-LAST:event_jFormattedTextField6FocusLost

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
         if(jRadioButton4.isSelected()){
             this.LimpiarCamposPago();
         }
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
      this.dispose();//sale                                           // salir 3
    }//GEN-LAST:event_jButton19MouseClicked

    private void jTextField23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyTyped
                                                         //para validar el CAMPO DE TEXTO documento
        if(jTextField23.getText().length()<30){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField23.transferFocus();
        }
        else
            evt.consume();
    }//GEN-LAST:event_jTextField23KeyTyped

    private void jTextField24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField24KeyTyped
                                                                 //para validar el CAMPO DE TEXTO observaciones
        if(jTextField24.getText().length()<60){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField24.transferFocus();
        }
        else
            evt.consume();
    }//GEN-LAST:event_jTextField24KeyTyped

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        // boton salir
        this.dispose();//sale
    }//GEN-LAST:event_jButton21MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
       fila=-1;                                                                // click en una pestanha
       //Transaction tx=null;
       actualizarFechaDeHoy();
       if(jTabbedPane1.getSelectedIndex()==1){
           if(reservacionencontrada){  //checkin
                if(this.clieencontrado){  //para pasar los datos del cliente1 al cliente2
                   //pais2=pais;
                   //clie2encontrado=true;
                    this.buscarPais2(Integer.toString(pais.getIdpais()));
                    clie2=clie;
                    pais2encontrado=true;
                    mimodelo2=mimodelo;
                    jTextField14.setText(pais2.getDescrippais());
                    jTextField11.setText(clie2.getDoc());
                    jTextField11.requestFocus();
                    jTextField11.transferFocus();
                    jButton15.setEnabled(true);
                }
                cargarTablacheck1();
                actualizarListacheckin1DesdeLaGrilla();
            }
        }else{
            if(jTabbedPane1.getSelectedIndex()==2){  //checkout
               // jFormattedTextField6.setText(this.ObtenerFechaSinGuion(fechadehoy));
                cargarTablaCheckout();
                jTextField31.setText(this.conv.conversion2(res.getDescuento()));
                actualizarTotales();
            }
        }

        if(this.modelocheck1.getRowCount()<=0 || res.getCheckout()=='1')
            this.deshabilitarbotones2();
        else
            this.habilitarbotones2();
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jRadioButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton7MouseClicked
        
    }//GEN-LAST:event_jRadioButton7MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(this.TotalGeneral>0){
            this.jTextField31.setText(conv.conversion2(Float.parseFloat(this.jTextField31.getText())+this.TotalGeneral));
            this.jTextField31.requestFocus();
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int existe=1;
        if (this.pais!=null && jTextField1.getText().isEmpty()==false&& jTextField2.getText().isEmpty()==false){ //si se busco al cliente
            try{
                frmcliente.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                existe=0;  //si no existe una clase previa
            }
            if (existe==1)
                frmcliente.dispose();

            frmcliente=new FrmCliente(pais,Integer.parseInt(jTextField2.getText()),(Frame)this.getParent(),true);
            frmcliente.show();
            if(frmcliente.isShowing()==false){ //carga los datos del nuevo cliente
                this.jTextField2.requestFocus();
                this.jTextField2.transferFocus();
            }
        }else{ //si no se busco al cliente
            try{
                frmcliente.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                existe=0;  //si no existe una clase previa
            }
            if (existe==1)
                frmcliente.dispose();

            frmcliente=new FrmCliente((Frame)this.getParent(),true);
            frmcliente.show();
            if(frmcliente.isShowing()==false){ //carga los datos del nuevo cliente
                this.jTextField2.requestFocus();
                this.jTextField2.transferFocus();
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
       if(jRadioButton3.isSelected()==true)
            CargarLista4();
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
    if(jRadioButton1.isSelected()==true)
            CargarLista1();
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if(jRadioButton2.isSelected()==true)
            CargarLista2();
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton7ItemStateChanged
       if(jRadioButton7.isSelected()==true)
            CargarLista3();
    }//GEN-LAST:event_jRadioButton7ItemStateChanged

    private void jTable5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable5MouseEntered

    private void jComboBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox7ItemStateChanged
            if(this.obtenerObjetoSubTipoDeCombo())       //al seleccionar un subtipo nuevo
                jTextField7.setText(subti.getPrecioxnoche()+"");
            else
                jTextField7.setText("");
    }//GEN-LAST:event_jComboBox7ItemStateChanged

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        String texto=jTextField10.getText();                            //PARA BUSQUEDA INTERACTIVA de pais
        Transaction tx2=null;
        cambiobusqueda3=true;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        if(((int)evt.getKeyChar()) == 10){ //si se presiono enter
            jTextField10.transferFocus();
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
                co=Integer.parseInt(mimodelo3.getValueAt(xxx, 0).toString());
                de=mimodelo3.getValueAt(xxx, 1).toString();
                jTextField10.setText(de);
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
                        co=Integer.parseInt(mimodelo3.getValueAt(xxx, 0).toString());
                        de=mimodelo3.getValueAt(xxx, 1).toString();
                        jTextField10.setText(de);
                    }
                } else{
                    z=false;
                    try{
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tx2=Sesion.beginTransaction();
                        Query q13=Sesion.createQuery("from Cliente where (concat(nombre,' ',apellido) like'"+"%" +texto+"%"+ "') ");
                        mimodelo3 = new DefaultTableModel();
                        mimodelo3.addColumn("Código");
                        mimodelo3.addColumn("Descripción");
                        List milis= q13.list();
                        tx2.commit();
                        CERRARSesion();
                        for (int i=0;i<milis.size();i++){
                            Cliente cc=(Cliente)milis.get(i);
                            Object [] ffi = new Object[2]; // Hay dos columnas en la tabla
                            ffi[0] = cc.getIdcli();
                            ffi[1] = cc.getNombre()+" "+cc.getApellido();
                            mimodelo3.addRow(ffi);// Se añade al modelo la fila completa.
                        }
                        lo=mimodelo3.getRowCount();
                    } catch(HibernateException ex){
                        tx2.rollback();
                        ex.printStackTrace();
                    }
                }
            }

        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
                                                                   //busq interactiva cli
        jTextField10.selectAll();
        xxx=0;
        lo=0;
        co=0;
        de="";
        z=false;
        cambiobusqueda3=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        mimodelo3 = new DefaultTableModel();
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
       if(cambiobusqueda3){                                           //lost de la busqueda interactiva clie
            String codcli="";
            Transaction tx=null;
            if(mimodelo3.getRowCount()>0){
                codcli=mimodelo3.getValueAt(xxx, 0).toString();
                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                tx=Sesion.beginTransaction();
                Cliente cl=(Cliente)Sesion.get(Cliente.class, Integer.parseInt(codcli));
                if(cl!=null){                    //si se encontro el pais
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
    }//GEN-LAST:event_jTextField10FocusLost

    private void jRadioButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8MouseClicked

    private void jRadioButton8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton8ItemStateChanged
        if(jRadioButton8.isSelected()==true)
            CargarLista5();
    }//GEN-LAST:event_jRadioButton8ItemStateChanged

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField30ActionPerformed

    private void jTextField21KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField21KeyReleased
        if(((int)evt.getKeyChar()) == 10)   //si se presiono enter en monto a pagar
            jTextField21.transferFocus();
}//GEN-LAST:event_jTextField21KeyReleased

    private void jTextField21FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField21FocusLost
        // Texto monto a pagar
        if(jTextField21.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField21.getText());
                if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField21.setText("0.0");
                    jTextField21.requestFocus();
                }else{
                    if(Float.parseFloat(jTextField22.getText())>0)
                        actualizarCambio();
                    else{
                        if(Float.parseFloat(jTextField21.getText())>0 && Float.parseFloat(jTextField22.getText())==0){
                            jTextField22.setText(conv.conversion2(actualizarMontoAPagar()));
                            actualizarCambio();
                        }
                    }
                    this.jTextField22.requestFocus();
                }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número decimal incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField21.setText("0.0");
                jTextField21.requestFocus();
            }
        } else
            jTextField21.setText("0.0");
}//GEN-LAST:event_jTextField21FocusLost

    private void jTextField21FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField21FocusGained
        jTextField21.selectAll();
}//GEN-LAST:event_jTextField21FocusGained

    private void jTextField22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField22KeyReleased
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter en valor pagado
            jTextField22.transferFocus();
}//GEN-LAST:event_jTextField22KeyReleased

    private void jTextField22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField22FocusLost
        // Texto valor a pagar
        if(jTextField22.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField22.getText());
                if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField22.setText("0.0");
                    jTextField22.requestFocus();
                }else
                    if(Float.parseFloat(jTextField21.getText())>0)
                        actualizarCambio();
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número decimal incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField22.setText("0.0");
                jTextField22.requestFocus();
            }
        } else
            jTextField22.setText("0.0");
}//GEN-LAST:event_jTextField22FocusLost

    private void jTextField22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField22FocusGained
        jTextField22.selectAll();
}//GEN-LAST:event_jTextField22FocusGained

    private void jTextField31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField31KeyTyped
        if(jTextField31.getText().length()>=15)                      //validacion descuento
            evt.consume();
}//GEN-LAST:event_jTextField31KeyTyped

    private void jTextField31KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField31KeyReleased

        if(((int)evt.getKeyChar()) == 10)
            jTextField31.transferFocus();
}//GEN-LAST:event_jTextField31KeyReleased

    private void jTextField31FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField31FocusLost
        if(jTextField31.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField31.getText());   //para comprobar si es float
               /*if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField31.setText("0.0");
                    jTextField31.requestFocus();
                }else{*/
                if(Float.parseFloat(jTextField31.getText())<=(Float.parseFloat(jTextField29.getText())-Float.parseFloat(jTextField30.getText()))){
                    if(Float.parseFloat(jTextField31.getText())!=0 || (Float.parseFloat(jTextField31.getText())==0 && res.getDescuento()>0)){
                        int x=JOptionPane.showConfirmDialog(null,"¿Desea Confirmar el descuento?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if(x==JOptionPane.YES_OPTION){
                            Sesion = NewHibernateUtil.getSessionFactory().openSession();
                            Transaction tx=Sesion.beginTransaction();
                            Reservacion re=new Reservacion();
                            int codr=res.getIdres();
                            re=(Reservacion)Sesion.load(Reservacion.class, codr);
                            re.setDescuento(Float.parseFloat(this.jTextField31.getText()));
                            tx.commit();
                            tx.begin();
                            res=new Reservacion();        /////////////////////////////////////////////////////////////////////si falla res controlar esto
                            res=(Reservacion)Sesion.get(Reservacion.class, codr);
                            tx.commit();
                            actualizarTotales();
                        }else
                            this.jTextField31.setText("0.0");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"Descuento demasiado alto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField31.setText("0.0");
                    jTextField31.requestFocus();
                }
                //  }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField31.setText("0.0");
                // jTextField31.requestFocus();
            }
        } else
            jTextField31.setText("0.0");
}//GEN-LAST:event_jTextField31FocusLost

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField31ActionPerformed

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        cambios1=true;
}//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        List<GrupoReservas> _gruposReservas = new ArrayList<GrupoReservas>();
        int size = modelores1.getRowCount();
        try {
            Calendar cal = new GregorianCalendar();
            Subtipo subtipo = new Subtipo();

            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            Sesion.getTransaction().begin();
            this.subti = new Subtipo();
            for (int i = 0; i < size; i++) {
                Date feini = cluti.StrDMA_Date(modelores1.getValueAt(i, 2).toString());
                cal = cluti.Date_Calender(cluti.StrDMA_Date(modelores1.getValueAt(i, 3).toString()));
                cal = cluti.addXDays(cal, -1);
                Date fefin = cal.getTime();
                boolean esMedia = true;
                if (modelores1.getValueAt(i, 5).toString().equals("NO")) {
                    esMedia = false;
                }
                subtipo = (Subtipo) Sesion.get(Subtipo.class, Integer.parseInt(modelores11.getValueAt(i, 0).toString()));
                GrupoReservas gruu = new GrupoReservas(feini, fefin, Integer.parseInt(modelores1.getValueAt(i, 0).toString()), subtipo, Integer.parseInt(this.modelores11.getValueAt(i, 2).toString()), esMedia);
                _gruposReservas.add(gruu);
            }
            FrmSeleccionHabitaciones FrmSele = new FrmSeleccionHabitaciones((Frame) this.getParent(), true, _gruposReservas);
            FrmSele.setVisible(true);
            this.cargarTablaReserva1DespuesDeVolerDeSeleccionDeHabitacionesDesdeLaGrilla(_gruposReservas);
            cambios1 = true;
            actualizarSubtotalDesdeModelores1();
            jLabel1.setText("TOTAL PARCIAL: " + conv.conversion(subto));
            autoAgregarTablares2();
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(FrmReserva.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton12ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmReserva dialog = new FrmReserva(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                HabitacionGest habges=new HabitacionGest();
                if(habges.ExisteHabitacionCargada())
                    dialog.setVisible(true);
                else
                    JOptionPane.showMessageDialog(null,"Para realizar una reservación debe estar cargada al menos una Habitación","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
