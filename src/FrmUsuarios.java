import Hiber1.Empleado;
import Hiber1.Habitacion;
import Hiber1.NewHibernateUtil;
import Hiber1.Puntosmenu;
import Hiber1.Usuarios;
import Hiber1.Usuarioxpunto;
import Soporte.codigo;
import imp.EmpleadoGest;
import imp.PuntosMenugest;
import imp.UsuarioGest;
import imp.UsuarioXPuntoGest;
import imp.VariosGest;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class FrmUsuarios extends javax.swing.JDialog {

    /** Creates new form FrmUsuarios */
    public FrmUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox80 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jCheckBox81 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Selección del Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsqueda Iteractiva del Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel2.setText("Nombre:");

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("BÚSQUEDA DEL EMPLEADO POR NOMBRE");
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Nº Documento:");

        jTextField2.setBackground(new java.awt.Color(153, 153, 255));
        jTextField2.setToolTipText("NÚMERO DE DOCUMENTO");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel12.setText(" ");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Nombre y Apellido:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Datos del usuario asignado al Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Usuario:");

        jTextField3.setBackground(new java.awt.Color(153, 153, 153));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setToolTipText("BÚSQUEDA DEL EMPLEADO POR NOMBRE");
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

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Verificar contraseña:");

        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });

        jButton4.setText("Cambiar Contraseña");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(12, 12, 12))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Puntos de menú disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox80.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox80.setFont(new java.awt.Font("Tahoma", 1, 12));
        jCheckBox80.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox80.setText("Puntos de usuario a nivel de Administrador");
        jCheckBox80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox80MouseClicked(evt);
            }
        });
        jCheckBox80.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox80ItemStateChanged(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox1.setText("ABM de Productos/Refrigerios");

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox2.setText("ABM de Servicios");

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox3.setText("ABM de Formas de Pago/Caja");

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox4.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox4.setText("ABM de Tipo de Movimiento de caja");

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox5.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox5.setText("ABM de Habitaciones");

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox6.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox6.setText("ABM de Tipos de Habitación");

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox7.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox7.setText("ABM de Grupos/Sectores/Ubicación de habitaciones");

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox8.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox8.setText("ABM de  Estados de las Habitaciones");

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox9.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox9.setText("ABM de  Empleados");

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox10.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox10.setText("ABM de  Cargos/Especialidades de los Empleados");

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox11.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox11.setText("ABM de Multas");

        jCheckBox12.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox12.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox12.setText("ABM de Usuarios y Puntos de menú accesibles");

        jCheckBox35.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox35.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox35.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox35.setText("ABM de IVA");

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox13.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox13.setText("Registro de Descartes");

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox14.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox14.setText("Registro de Rutinas de limpieza");

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox15.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox15.setText("Acceso a Informes");
        jCheckBox15.setActionCommand("Acceso a informes");

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox16.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox16.setText("Modificar Opciones de configuración");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox80)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox35)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox15))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jCheckBox80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox16)
                .addGap(34, 34, 34))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox81.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox81.setFont(new java.awt.Font("Tahoma", 1, 12));
        jCheckBox81.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox81.setText("Puntos de usuario a nivel de Recepcionista");
        jCheckBox81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox81MouseClicked(evt);
            }
        });
        jCheckBox81.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox81ItemStateChanged(evt);
            }
        });

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox17.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox17.setText("ABM de Monedas y Cotizaciones");

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox18.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox18.setText("ABM de Bancos");

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox19.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox19.setText("ABM de Unidades de Medida");

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox20.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox20.setText("ABM de Motivos de descarte");

        jCheckBox21.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox21.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox21.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox21.setText("ABM de Motivos de ajuste de stock");

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox22.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox22.setText("ABM de Profesiones");

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox23.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox23.setText("ABM de Tipos de Documento");

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox24.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox24.setText("ABM de  Países");

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox25.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox25.setText("ABM de  Proveedores");

        jCheckBox26.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox26.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox26.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox26.setText("ABM de  Clientes");

        jCheckBox27.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox27.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox27.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox27.setText("Registro de Compras");

        jCheckBox28.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox28.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox28.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox28.setText("Registro de Trabajos realizados en el hotel");

        jCheckBox29.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox29.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox29.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox29.setText("Registro de Actividades de los huéspedes");

        jCheckBox30.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox30.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox30.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox30.setText("Registro de Ajustes de Stock");

        jCheckBox31.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox31.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox31.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox31.setText("Registro de Movimientos de caja");
        jCheckBox31.setActionCommand("Asignación de Productos, Servicios y multas a los Huéspedes");

        jCheckBox32.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox32.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox32.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox32.setText("Asignación de Productos, Servicios y Multas a los huéspedes");

        jCheckBox33.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox33.setFont(new java.awt.Font("Tahoma", 0, 12));
        jCheckBox33.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox33.setText("Administración de las Reservaciones");

        jCheckBox34.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox34.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox34.setText("Apertura y Cierre de caja");

        jCheckBox36.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox36.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox36.setText("ABM de Empresas");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBox81)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox22)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox24)
                    .addComponent(jCheckBox25)
                    .addComponent(jCheckBox26)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox27)
                    .addComponent(jCheckBox28)
                    .addComponent(jCheckBox29)
                    .addComponent(jCheckBox30)
                    .addComponent(jCheckBox31)
                    .addComponent(jCheckBox32)
                    .addComponent(jCheckBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jCheckBox81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox34))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36));
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Usuarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1)
                .addContainerGap(336, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setName(""); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar2.png"))); // NOI18N
        jButton1.setToolTipText("LIMPIAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        jButton3.setToolTipText("CONFIRMAR/GUARDAR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar2.png"))); // NOI18N
        jButton10.setToolTipText("BORRAR");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir2.png"))); // NOI18N
        jButton5.setToolTipText("SALIR");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(616, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton10)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Session Sesion=null;
    Empleado emp=new Empleado();
    Usuarios usu=new Usuarios();
    boolean usuarioencontrado=false;
    boolean empencontrado=false;
    boolean rutencontrada=false;
    EmpleadoGest empges=new EmpleadoGest();
    UsuarioGest usuges= new UsuarioGest();
    int codigoempleado=0;
    boolean cambiarcont=false;
    boolean contvalida=false;
    UsuarioXPuntoGest uxpges=new UsuarioXPuntoGest();
    PuntosMenugest pumeges=new PuntosMenugest();
    VariosGest varges=new VariosGest();
    boolean nobuscarusuario=false;//uso en el lost de numdoc para que al salir de ahi no ejecute lo que hay en el los de la busq int de usuario
    ///////////////para la busqueda interactiva empleado///////////////////////////////
    int xxx=0;  //posicion actual en el modelo
    int lo=0;  //longitud del modelo
    int co=0;
    String de="";
    boolean z=false;
    boolean cambiobusqueda=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
    DefaultTableModel mimodelo = new DefaultTableModel();
    /////////////////////////////////////////////////////////////////////////////////////

    ///////////////para la busqueda interactiva usuario///////////////////////////////
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

    public void limpiarCampos(){
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         cambiarcont=false;
         contvalida=false;  //es true si se intenta cambiar la contraseña y se ingreso una correcta antes de ingresar las 2 nuevas
         this.jPasswordField1.setText("");
         this.jPasswordField2.setText("");
         this.jLabel12.setText(" ");
         this.empencontrado=false;
         this.usuarioencontrado=false;
         this.emp=new Empleado();
         codigoempleado=0;
         jTextField2.requestFocus();
         this.jCheckBox1.setSelected(false);
         this.jCheckBox2.setSelected(false);
         this.jCheckBox3.setSelected(false);
         this.jCheckBox4.setSelected(false);
         this.jCheckBox5.setSelected(false);
         this.jCheckBox6.setSelected(false);
         this.jCheckBox7.setSelected(false);
         this.jCheckBox8.setSelected(false);
         this.jCheckBox9.setSelected(false);
         this.jCheckBox10.setSelected(false);
         this.jCheckBox11.setSelected(false);
         this.jCheckBox12.setSelected(false);
         this.jCheckBox13.setSelected(false);
         this.jCheckBox14.setSelected(false);
         this.jCheckBox15.setSelected(false);
         this.jCheckBox16.setSelected(false);
         this.jCheckBox17.setSelected(false);
         this.jCheckBox18.setSelected(false);
         this.jCheckBox19.setSelected(false);
         this.jCheckBox20.setSelected(false);
         this.jCheckBox21.setSelected(false);
         this.jCheckBox22.setSelected(false);
         this.jCheckBox23.setSelected(false);
         this.jCheckBox24.setSelected(false);
         this.jCheckBox25.setSelected(false);
         this.jCheckBox26.setSelected(false);
         this.jCheckBox27.setSelected(false);
         this.jCheckBox28.setSelected(false);
         this.jCheckBox29.setSelected(false);
         this.jCheckBox30.setSelected(false);
         this.jCheckBox31.setSelected(false);
         this.jCheckBox32.setSelected(false);
         this.jCheckBox33.setSelected(false);
         this.jCheckBox34.setSelected(false);
         this.jCheckBox35.setSelected(false);
         this.jCheckBox36.setSelected(false);
         this.jCheckBox80.setSelected(false);
         this.jCheckBox81.setSelected(false);
   }
    public void deshabilitarPass2(){
        this.jPasswordField2.setText("");
        this.jPasswordField2.setEditable(false);
    
    }
    public void habilitarBotonesUsuEncontrado(){
        this.jPasswordField1.setEditable(false);
        this.jPasswordField2.setEditable(false);
        this.jButton4.setEnabled(true);
    }
    public void habilitarBotonesUsuNoEncontrado(){
        this.jPasswordField1.setEditable(true);
        this.jPasswordField2.setEditable(true);
        this.jButton4.setEnabled(false);
    }
   public boolean buscarEmpleadoPorId(int idem){
        boolean respu=false;
        emp=new Empleado();
        boolean encontrado=empges.ExisteIdEnTabla(idem);
        if(encontrado){
            emp=empges.GetObjEmpleado();
            empencontrado=true;
            codigoempleado=emp.getIdempleado();
           // jTextField1.setText(emp.getNombre());
            jTextField2.setText(emp.getNumdoc());
            this.jLabel12.setText(emp.getNombre()+" "+emp.getApellido());
            respu=true;
            buscarUsuarioDelEmpleado();
        }else{
            empencontrado=false;
            this.emp=new Empleado();
            usuarioencontrado=false;
            usu=new Usuarios();
        }
        cambiarcont=false;
        contvalida=false;
        return respu;
   }
 /*  private static boolean esCorrectoElPass(char[] pas1,char[] pas2) {
    boolean correcto = true;
    System.out.println(pas1.toString());
    System.out.println(pas2.toString());
    if (pas1.length != pas2.length) {
        correcto = false;
    } else {
        correcto = Arrays.equals (pas1, pas2);
    }
    ///////pone en 0 las variables
    Arrays.fill(pas2,'0');
    Arrays.fill(pas1,'0');
    return correcto;
    }*/
   public void completarCajasDeChequeo(Usuarios usuario){
    Transaction tx=null;
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    try{
        tx=Sesion.beginTransaction();
        Query q=Sesion.createQuery("from Usuarioxpunto where idusuario = "+usuario.getIdusuario());
        List li= q.list();
        if(li.size()>0){
            boolean arr[]=new boolean[pumeges.getLongitudArray()];
            boolean existe=false;
            for(int i=1;i<pumeges.getLongitudArray();i++){//recorre cada elemento de puntos de menu y su codigo coincide con su posicion, entonces coincide tambien con i
                existe=false;
                for(int j=0;j<li.size();j++){
                    Usuarioxpunto us=new Usuarioxpunto();
                    us=(Usuarioxpunto)li.get(j);
                    if(i==us.getPuntosmenu().getIdpunto()){
                        existe=true;
                        break;
                    }
                }
                if(existe)//completa el array boolean de acuerdo si existe o no en puntos de menu de ese usuario
                    arr[i]=true;
                else
                    arr[i]=false;
            }
            if(arr[1])
                this.jCheckBox1.setSelected(true);
            else
                this.jCheckBox1.setSelected(false);

            if(arr[2])
                this.jCheckBox2.setSelected(true);
            else
                this.jCheckBox2.setSelected(false);

            if(arr[3])
                this.jCheckBox3.setSelected(true);
            else
                this.jCheckBox3.setSelected(false);

            if(arr[4])
                this.jCheckBox4.setSelected(true);
            else
                this.jCheckBox4.setSelected(false);

            if(arr[5])
                this.jCheckBox5.setSelected(true);
            else
                this.jCheckBox5.setSelected(false);

            if(arr[6])
                this.jCheckBox6.setSelected(true);
            else
                this.jCheckBox6.setSelected(false);

            if(arr[7])
                this.jCheckBox7.setSelected(true);
            else
                this.jCheckBox7.setSelected(false);

            if(arr[8])
                this.jCheckBox8.setSelected(true);
            else
                this.jCheckBox8.setSelected(false);

            if(arr[9])
                this.jCheckBox9.setSelected(true);
            else
                this.jCheckBox9.setSelected(false);

            if(arr[10])
                this.jCheckBox10.setSelected(true);
            else
                this.jCheckBox10.setSelected(false);

            if(arr[11])
                this.jCheckBox11.setSelected(true);
            else
                this.jCheckBox11.setSelected(false);

            if(arr[12])
                this.jCheckBox12.setSelected(true);
            else
                this.jCheckBox12.setSelected(false);

            if(arr[13])
                this.jCheckBox13.setSelected(true);
            else
                this.jCheckBox13.setSelected(false);

            if(arr[14])
                this.jCheckBox14.setSelected(true);
            else
                this.jCheckBox14.setSelected(false);

            if(arr[15])
                this.jCheckBox15.setSelected(true);
            else
                this.jCheckBox15.setSelected(false);

            if(arr[16])
                this.jCheckBox16.setSelected(true);
            else
                this.jCheckBox16.setSelected(false);

            if(arr[17])
                this.jCheckBox17.setSelected(true);
            else
                this.jCheckBox17.setSelected(false);

            if(arr[18])
                this.jCheckBox18.setSelected(true);
            else
                this.jCheckBox18.setSelected(false);

            if(arr[19])
                this.jCheckBox19.setSelected(true);
            else
                this.jCheckBox19.setSelected(false);

            if(arr[20])
                this.jCheckBox20.setSelected(true);
            else
                this.jCheckBox20.setSelected(false);

            if(arr[21])
                this.jCheckBox21.setSelected(true);
            else
                this.jCheckBox21.setSelected(false);

            if(arr[22])
                this.jCheckBox22.setSelected(true);
            else
                this.jCheckBox22.setSelected(false);

            if(arr[23])
                this.jCheckBox23.setSelected(true);
            else
                this.jCheckBox23.setSelected(false);

            if(arr[24])
                this.jCheckBox24.setSelected(true);
            else
                this.jCheckBox24.setSelected(false);

            if(arr[25])
                this.jCheckBox25.setSelected(true);
            else
                this.jCheckBox25.setSelected(false);

            if(arr[26])
                this.jCheckBox26.setSelected(true);
            else
                this.jCheckBox26.setSelected(false);

            if(arr[27])
                this.jCheckBox27.setSelected(true);
            else
                this.jCheckBox27.setSelected(false);

            if(arr[28])
                this.jCheckBox28.setSelected(true);
            else
                this.jCheckBox28.setSelected(false);

            if(arr[29])
                this.jCheckBox29.setSelected(true);
            else
                this.jCheckBox29.setSelected(false);

            if(arr[30])
                this.jCheckBox30.setSelected(true);
            else
                this.jCheckBox30.setSelected(false);

            if(arr[31])
                this.jCheckBox31.setSelected(true);
            else
                this.jCheckBox31.setSelected(false);

            if(arr[32])
                this.jCheckBox32.setSelected(true);
            else
                this.jCheckBox32.setSelected(false);

            if(arr[33])
                this.jCheckBox33.setSelected(true);
            else
                this.jCheckBox33.setSelected(false);

            if(arr[34])
                this.jCheckBox34.setSelected(true);
            else
                this.jCheckBox34.setSelected(false);
            if(arr[35])
                this.jCheckBox35.setSelected(true);
            else
                this.jCheckBox35.setSelected(false);
            if(arr[36])
                this.jCheckBox36.setSelected(true);
            else
                this.jCheckBox36.setSelected(false);
        }
    }catch(HibernateException ex){
        tx.rollback();
        ex.printStackTrace();
        CERRARSesion();
     }



   }
   public boolean actualizarUsuarioXPunto(Usuarios usuario){
    Transaction tx=null;
    Sesion = NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx2=null;
    try{
        tx=Sesion.beginTransaction();
        Query q=Sesion.createQuery("from Usuarioxpunto where idusuario = "+usuario.getIdusuario());
        List li= q.list();
        if(li.size()>0){
           // int contborr=0;
            for(int i=0;i<li.size();i++){
                Usuarioxpunto us=new Usuarioxpunto();
                us=(Usuarioxpunto)li.get(i);
                Sesion.delete(us);
              //  contborr++;
            }
        }
        tx.commit();
        //this.CERRARSesion();
        //Sesion = NewHibernateUtil.getSessionFactory().openSession();
        tx2=Sesion.beginTransaction();
        boolean[] respuestas=new boolean[pumeges.getLongitudArray()];
        if(this.jCheckBox1.isSelected())
            respuestas[1]=true;
        if(this.jCheckBox2.isSelected())
            respuestas[2]=true;
        if(this.jCheckBox3.isSelected())
            respuestas[3]=true;
        if(this.jCheckBox4.isSelected())
            respuestas[4]=true;
        if(this.jCheckBox5.isSelected())
            respuestas[5]=true;
        if(this.jCheckBox6.isSelected())
            respuestas[6]=true;
        if(this.jCheckBox7.isSelected())
            respuestas[7]=true;
        if(this.jCheckBox8.isSelected())
            respuestas[8]=true;
        if(this.jCheckBox9.isSelected())
            respuestas[9]=true;
        if(this.jCheckBox10.isSelected())
            respuestas[10]=true;
        if(this.jCheckBox11.isSelected())
            respuestas[11]=true;
        if(this.jCheckBox12.isSelected())
            respuestas[12]=true;
        if(this.jCheckBox13.isSelected())
            respuestas[13]=true;
        if(this.jCheckBox14.isSelected())
            respuestas[14]=true;
        if(this.jCheckBox15.isSelected())
            respuestas[15]=true;
        if(this.jCheckBox16.isSelected())
            respuestas[16]=true;
        if(this.jCheckBox17.isSelected())
            respuestas[17]=true;
        if(this.jCheckBox18.isSelected())
            respuestas[18]=true;
        if(this.jCheckBox19.isSelected())
            respuestas[19]=true;
        if(this.jCheckBox20.isSelected())
            respuestas[20]=true;
        if(this.jCheckBox21.isSelected())
            respuestas[21]=true;
        if(this.jCheckBox22.isSelected())
            respuestas[22]=true;
        if(this.jCheckBox23.isSelected())
            respuestas[23]=true;
        if(this.jCheckBox24.isSelected())
            respuestas[24]=true;
        if(this.jCheckBox25.isSelected())
            respuestas[25]=true;
        if(this.jCheckBox26.isSelected())
            respuestas[26]=true;
        if(this.jCheckBox27.isSelected())
            respuestas[27]=true;
        if(this.jCheckBox28.isSelected())
            respuestas[28]=true;
        if(this.jCheckBox29.isSelected())
            respuestas[29]=true;
        if(this.jCheckBox30.isSelected())
            respuestas[30]=true;
        if(this.jCheckBox31.isSelected())
            respuestas[31]=true;
        if(this.jCheckBox32.isSelected())
            respuestas[32]=true;
        if(this.jCheckBox33.isSelected())
            respuestas[33]=true;
        if(this.jCheckBox34.isSelected())
            respuestas[34]=true;
        if(this.jCheckBox35.isSelected())
            respuestas[35]=true;
        if(this.jCheckBox36.isSelected())
            respuestas[36]=true;
        int contguard=1;
        int cod=uxpges.getsiguientecodigo();
        int cont=0;
        for(int i=1;i<respuestas.length;i++){
            if(respuestas[i]){
                if(cod>0 && cod<2147483600){
                    Puntosmenu pume=new Puntosmenu();
                    pume=(Puntosmenu) Sesion.get(Puntosmenu.class, i);
                    if(pume!=null){
                        Usuarioxpunto us=new Usuarioxpunto();
                        us.setIdusuarioxpunto(cod+cont-1);
                        cont++;
                        us.setUsuarios(usuario);
                        us.setPuntosmenu(pume);
                        Sesion.saveOrUpdate(us);
                        contguard++;
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo generar un nuevo código", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }else
                contguard++;

        }
        if(contguard==respuestas.length){
            tx2.commit();
            CERRARSesion();
            return true;
        } else{
            tx2.rollback();
            CERRARSesion();
            return false;
        }
    }catch(HibernateException ex){
        tx2.rollback();
        ex.printStackTrace();
        CERRARSesion();
        return false;
     }
   }
   public boolean buscarUsuarioDelEmpleado(){
        int codem=0;
        codem=emp.getIdempleado();
        boolean respu=false;
        usuarioencontrado=false;
        if(codem>0 && empencontrado){
            usu=new Usuarios();
            Transaction tx=null;
            try{
                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                tx=Sesion.beginTransaction();String consulta="";
                consulta="from Usuarios where idempleado = "+codem;
                Query q=Sesion.createQuery(consulta);
                List li= q.list();
                if(li.size()>0){
                    usuarioencontrado=true;
                    usu=(Usuarios)li.get(0);
                    this.jTextField3.setText(usu.getUsuario());
                    this.jPasswordField1.setText("");
                    habilitarBotonesUsuEncontrado();
                }else{
                    JOptionPane.showMessageDialog(null,"Este Usuario aún no tiene un usuario asignado. Si desea puede crearlo","AVISO",JOptionPane.INFORMATION_MESSAGE);
                    usuarioencontrado=false;
                    usu=new Usuarios();
                    habilitarBotonesUsuNoEncontrado();
                }
                tx.commit();
                CERRARSesion();
            } catch(HibernateException ex){
                tx.rollback();
                ex.printStackTrace();
            }
            if(usuarioencontrado)
                completarCajasDeChequeo(usu); //hago aca xq esto tiene otra sesion y si hago arriba va a dar error x las sesiones anidadas
       }else{
            JOptionPane.showMessageDialog(null,"Empleado no encontrado. Favor hacer la búsqueda del mismo antes de continuar","PETICIÓN",JOptionPane.INFORMATION_MESSAGE);
            usuarioencontrado=false;
            usu=new Usuarios();
            habilitarBotonesUsuNoEncontrado();
        }
        cambiarcont=false;
        contvalida=false;
        return usuarioencontrado;
        
   }
   public boolean buscarUsuarioPorId(int idu){
       usuarioencontrado=false; 
       //if(empencontrado){
            usu=new Usuarios();
                if(usuges.existeUsuarioConId(idu)){
                    usuarioencontrado=true;
                    usu=usuges.getMiUsuario();
                    completarCajasDeChequeo(usu);
                    this.buscarEmpleadoPorId(usuges.getCodigoEmpleado());
                    this.jTextField3.setText(usu.getUsuario());
                    this.jPasswordField1.setText("");
                    habilitarBotonesUsuEncontrado();
                }else{
                    JOptionPane.showMessageDialog(null,"Usuario no encontrado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                    usuarioencontrado=false;
                    usu=new Usuarios();
                    habilitarBotonesUsuNoEncontrado();
                }
       //}else{
            //JOptionPane.showMessageDialog(null,"Empleado no encontrado. Favor hacer la búsqueda del mismo antes de continuar","PETICIÓN",JOptionPane.INFORMATION_MESSAGE);
          //  usuarioencontrado=false;
           // usu=new Usuarios();
           // habilitarBotonesUsuNoEncontrado();
      //  }
        cambiarcont=false;
        contvalida=false;
        return usuarioencontrado;
        
   }
   public boolean buscarEmpleadoPorNumDoc(String ndoc){
        boolean respu=false;
        emp=new Empleado();
        boolean encontrado=empges.ExisteEmpleadoConNumDoc(ndoc);
        if(encontrado){
            emp=empges.GetObjEmpleado();
            empencontrado=true;
            codigoempleado=emp.getIdempleado();
            jTextField2.setText(emp.getNumdoc());
            this.jLabel12.setText(emp.getNombre()+" "+emp.getApellido());
            respu=true;
            buscarUsuarioDelEmpleado();
        }else{
            empencontrado=false;
            this.emp=new Empleado();
            usuarioencontrado=false;
            usu=new Usuarios();
        }
        cambiarcont=false;
        contvalida=false;
        return respu;
   }
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if(jTextField2.getText().isEmpty()==false){                    //lost del campo numdoc
            if(!(jTextField1.getText().isEmpty()==false && empencontrado)){  //para que no busque 2 veces al salir del cuadro de arriba
                if(buscarEmpleadoPorNumDoc(jTextField2.getText())==false){
                    empencontrado=false;
                    emp=new Empleado();
                    this.limpiarCampos();
                    JOptionPane.showMessageDialog(null,"Empleado no encontrado", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
                    this.jTextField1.requestFocus();
                }else
                    nobuscarusuario=true;//para que no ejecute lo que hay en lost de la busq int del usuario, xq sino no encuentra
            }
        }
}//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped

        if(jTextField2.getText().length()<30){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField2.transferFocus();
        } else
            evt.consume();
}//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        //busq interactiva empleado
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
        if(cambiobusqueda && this.jTextField1.getText().isEmpty()==false){   //lost de la busqueda interactiva
            int code=0;
            if(mimodelo.getRowCount()>0){
                code =Integer.parseInt(mimodelo.getValueAt(xxx, 0).toString());
                if(buscarEmpleadoPorId(code)==false){
                    empencontrado=false;
                    emp=new Empleado();
                    this.limpiarCampos();
                    JOptionPane.showMessageDialog(null,"Empleado no encontrado", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
                    this.jTextField1.requestFocus();
                }
            } else{
                empencontrado=false;
                emp=new Empleado();
            }
        }
}//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String texto=jTextField1.getText();                            //PARA BUSQUEDA INTERACTIVA
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
                        tx2=Sesion.beginTransaction();String consulta="";
                        consulta="from Empleado where (concat(nombre,' ',apellido) like'"+"%" +texto+"%"+ "') ";
                        Query q13=Sesion.createQuery(consulta);
                        mimodelo = new DefaultTableModel();
                        mimodelo.addColumn("Código");
                        mimodelo.addColumn("Descripción");
                        List milis= q13.list();
                        tx2.commit();
                        CERRARSesion();
                        for (int i=0;i<milis.size();i++){
                            Empleado ee=(Empleado)milis.get(i);
                            Object [] ffi = new Object[2]; // Hay dos columnas en la tabla
                            ffi[0] = ee.getIdempleado();
                            ffi[1] = ee.getNombre()+" "+ee.getApellido();
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

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
                                                                        //BOTON GUARDAR
        if(empencontrado){
            if(usuarioencontrado){ //si se desea EDITAR
                boolean error=false;
                int r=JOptionPane.showConfirmDialog(null,"¿Desea EDITAR este usuario?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                     Transaction tx=null;
                     Sesion = NewHibernateUtil.getSessionFactory().openSession();
                     try {
                        tx=Sesion.beginTransaction();
                        if(contvalida && this.jTextField3.getText().isEmpty()==false && this.jPasswordField1.getText().isEmpty()==false && this.jPasswordField1.getText().equals(this.jPasswordField2.getText())){  //la contrasenha es valida solo cuando se quiere cambiarla y se ingesa correctamente la cont vieja
                            Usuarios uu=(Usuarios)Sesion.load(Usuarios.class, usu.getIdusuario());
                            uu.setPass(codigo.MD5(this.jPasswordField1.getText()));
                            tx.commit();
                        }
                    } catch (HibernateException ex) {
                        tx.rollback();
                        error=true;
                        JOptionPane.showMessageDialog(null,"Error al intentar EDITAR el usuario","ERROR",JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();
                    }catch (NoSuchAlgorithmException ex2) {
                        tx.rollback();
                        error=true;
                        JOptionPane.showMessageDialog(null,"Error al intentar EDITAR el usuario","ERROR",JOptionPane.ERROR_MESSAGE);
                        ex2.printStackTrace();
                    }catch (UnsupportedEncodingException ex3) {
                        tx.rollback();
                        error=true;
                        JOptionPane.showMessageDialog(null,"Error al intentar EDITAR el usuario","ERROR",JOptionPane.ERROR_MESSAGE);
                        ex3.printStackTrace();
                    }
                    CERRARSesion();
                    if(actualizarUsuarioXPunto(usu)&&error==false){ //guarda los puntos  utilizando la misma sesion y transaccion
                        limpiarCampos();
                        JOptionPane.showMessageDialog(null,"Usuario EDITADO correctamente. Favor reiniciar al sistema para aplicar los cambios realizados","AVISO",JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null,"No se pudo EDITAR este usuario", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
                     }
                }
            }else{ //si se desea AGREGAR             
                Transaction tx=null;
                    if(this.jTextField3.getText().isEmpty()==false && this.jPasswordField1.getText().isEmpty()==false && this.jPasswordField1.getText().equals(this.jPasswordField2.getText())){
                        int r=JOptionPane.showConfirmDialog(null,"¿Desea AGREGAR este usuario?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                        if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                            int cod=usuges.getsiguientecodigo();
                            if(cod>0){
                                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                boolean error=false;
                                try{
                                    tx=Sesion.beginTransaction();
                                    usu=new Usuarios();
                                    usu.setIdusuario(cod);
                                    usu.setEmpleado(emp);
                                    usu.setUsuario(this.jTextField3.getText());
                                    usu.setPass(codigo.MD5(this.jPasswordField1.getText()));
                                    Sesion.saveOrUpdate(usu);
                                    tx.commit();
                                }catch (HibernateException ex) {
                                    error=true;
                                    tx.rollback();
                                    ex.printStackTrace();
                                    JOptionPane.showMessageDialog(null,"Error al intentar EDITAR el usuario","ERROR",JOptionPane.ERROR_MESSAGE);
                                }catch (NoSuchAlgorithmException ex2) {
                                    tx.rollback();
                                    error=true;
                                    JOptionPane.showMessageDialog(null,"Error al intentar EDITAR el usuario","ERROR",JOptionPane.ERROR_MESSAGE);
                                    ex2.printStackTrace();
                                }catch (UnsupportedEncodingException ex3) {
                                    tx.rollback();
                                    error=true;
                                    JOptionPane.showMessageDialog(null,"Error al intentar EDITAR el usuario","ERROR",JOptionPane.ERROR_MESSAGE);
                                    ex3.printStackTrace();
                                }
                                CERRARSesion();
                                if(this.actualizarUsuarioXPunto(usu)&&error==false){  //guarda los puntos  utilizando la misma sesion y transaccion
                                    //tx.commit();
                                    JOptionPane.showMessageDialog(null,"Usuario AGREGADO correctamente. Favor reiniciar al sistema para aplicar los cambios realizados","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                    limpiarCampos();
                                }else{
                                   // tx.rollback();
                                    /*JOptionPane.showMessageDialog(null,"El Usuario no pudo ser AGREGADO","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                                    Sesion.beginTransaction();
                                    Usuarios u=usu;
                                    Sesion.delete(u);
                                    Sesion.getTransaction().commit();*/
                                }
                            }else{
                                tx.rollback();
                                JOptionPane.showMessageDialog(null,"No se pudo obtener nuevo código para almacenar este usuario", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                
            }
        }
}//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        //BOTON SALIR
        this.dispose();//sale
}//GEN-LAST:event_jButton5MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //BOTON LIMPIAR
        limpiarCampos();
}//GEN-LAST:event_jButton1MouseClicked

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
                                                                    //busq interactiva usuario
        jTextField3.selectAll();
        xxx2=0;
        lo2=0;
        co2=0;
        de2="";
        z2=false;
        cambiobusqueda2=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        mimodelo2 = new DefaultTableModel();
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if(cambiobusqueda2 && this.jTextField3.getText().isEmpty()==false && this.nobuscarusuario==false){   //lost de la busqueda interactiva
            int code=0;                                                     //nobuscarusuario es para que no busque si recien sale del texto de numdoc
            if(mimodelo2.getRowCount()>0){
                code =Integer.parseInt(mimodelo2.getValueAt(xxx2, 0).toString());
                if(buscarUsuarioPorId(code)==false){
                   // this.limpiarCampos();
                    JOptionPane.showMessageDialog(null,"Usuario no encontrado", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
                    this.jTextField3.requestFocus();
                }
            } else{
                usuarioencontrado=false;
                usu=new Usuarios();
            }
        }
        nobuscarusuario=false;
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
       String texto=jTextField3.getText();                            //PARA BUSQUEDA INTERACTIVA
        Transaction tx2=null;
        cambiobusqueda2=true;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        if(((int)evt.getKeyChar()) == 10){ //si se presiono enter
            jTextField3.transferFocus();
            ////mas codigo en el lostfocus
        } else{
            if(evt.getKeyCode()==KeyEvent.VK_UP && lo2>0){   //pulso frecha arriba
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
                jTextField3.setText(de2);
            } else{
                if(evt.getKeyCode()==KeyEvent.VK_DOWN && lo2>0){  //pulso flecha abajo
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
                        jTextField3.setText(de2);
                    }
                } else{
                    z2=false;
                    try{
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tx2=Sesion.beginTransaction();String consulta="";
                        consulta="from Usuarios where (usuario like'"+"%" +texto+"%"+ "') ";
                        Query q13=Sesion.createQuery(consulta);
                        mimodelo2 = new DefaultTableModel();
                        mimodelo2.addColumn("Código");
                        mimodelo2.addColumn("Descripción");
                        List milis= q13.list();
                        tx2.commit();
                        CERRARSesion();
                        for (int i=0;i<milis.size();i++){
                            Usuarios uu=(Usuarios)milis.get(i);
                            Object [] ffi = new Object[2]; // Hay dos columnas en la tabla
                            ffi[0] = uu.getIdusuario();
                            ffi[1] = uu.getUsuario();
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
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
                                                                     // boton cambiar contrasenha
        if(this.jButton4.isEnabled()){
            if(empencontrado){
                if(this.usuarioencontrado){
                    int r=JOptionPane.showConfirmDialog(null,"¿Desea Cambiar la contraseña de este usuario?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                        if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                            JOptionPane.showMessageDialog(null,"Favor ingresar la contraseña actual", "PETICIÓN", JOptionPane.INFORMATION_MESSAGE);
                            cambiarcont=true;
                            this.jPasswordField1.setEditable(true);
                            this.jPasswordField2.setEditable(false);
                            this.jPasswordField1.requestFocus();
                        }else{
                            cambiarcont=false;
                            this.jPasswordField2.setEditable(true);
                            this.jPasswordField1.setEditable(false);
                        }
                }else
                     JOptionPane.showMessageDialog(null,"Usuario no encontrado", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            }else
                 JOptionPane.showMessageDialog(null,"Empleado no encontrado", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
                                                                        //texto pass1
        try{
            if(this.jPasswordField1.getText().isEmpty()==false){
                if(cambiarcont && usuarioencontrado&&empencontrado){
                    if(codigo.MD5(this.jPasswordField1.getText()).equals(usu.getPass())){
                        contvalida=true;
                        cambiarcont=false; //cambio a false xq uso el mismo texto tara ingresar las 2 veces la con y si no lo hago, al hacer lost del 1ero, me va a mostrar todo esto de nuevo
                        this.jPasswordField2.setEditable(true);
                        this.jPasswordField1.setText("");
                        this.jPasswordField1.setEditable(true);
                        this.jButton4.setEnabled(false);
                        JOptionPane.showMessageDialog(null,"Contraseña Válida, favor ingresar la nueva contraseña y volver a verificarla más abajo", "PETICIÓN", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        contvalida=false;
                        this.jPasswordField2.setEditable(false);
                        JOptionPane.showMessageDialog(null,"Contraseña Inálida, favor intentarlo nuevamente", "PETICIÓN", JOptionPane.INFORMATION_MESSAGE);
                        this.jPasswordField1.setText("");
                    }
                    this.jPasswordField1.requestFocus();
                }
            }
        }catch (NoSuchAlgorithmException ex2) {
            JOptionPane.showMessageDialog(null,"Error al verificar la contraseña","ERROR",JOptionPane.ERROR_MESSAGE);
            ex2.printStackTrace();
        }catch (UnsupportedEncodingException ex3) {
            JOptionPane.showMessageDialog(null,"Error al verificar la contraseña","ERROR",JOptionPane.ERROR_MESSAGE);
            ex3.printStackTrace();
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
       if(this.jPasswordField2.getText().isEmpty()==false){
            if(contvalida && usuarioencontrado && empencontrado){
                if(this.jPasswordField1.getText().equals(this.jPasswordField2.getText())==false)
                    JOptionPane.showMessageDialog(null,"Ambas contraseñas no verifican", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            }
       }
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setResizable(false);                                    //AL CARGARSE EL FORMULARIO
        this.setLocationRelativeTo(null);  //centra el objeto en pantalla
       // setDefaultCloseOperation(0);
        Sesion=NewHibernateUtil.getSessionFactory().getCurrentSession(); //esto no se necesita hacer aca, se puede hacer en el principal
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox80MouseClicked
       
    }//GEN-LAST:event_jCheckBox80MouseClicked

    private void jCheckBox81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox81MouseClicked
       
    }//GEN-LAST:event_jCheckBox81MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        int r=0;                                                     //BOTON BORRAR
        boolean resu=false;
        if (usuarioencontrado && jTextField3.getText().isEmpty()==false){
            if(varges.ExisteFKUsuario(usu.getIdusuario())==false){
                Transaction tx=null;
                Transaction tx2=null;
                Usuarios usua=new Usuarios();
                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                r=JOptionPane.showConfirmDialog(null,"¿Desea BORRAR este usuario?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                    try{
                        tx=Sesion.beginTransaction();
                        usua=(Usuarios) Sesion.get(Usuarios.class, usu.getIdusuario());
                        if(usua!=null){
                            Query q=Sesion.createQuery("from Usuarioxpunto where idusuario = "+usu.getIdusuario());
                            List li= q.list();
                            if(li.size()>0){
                               // int contborr=0;
                                for(int i=0;i<li.size();i++){
                                    Usuarioxpunto us=new Usuarioxpunto();
                                    us=(Usuarioxpunto)li.get(i);
                                    Sesion.delete(us);
                                  //  contborr++;
                                }
                            }
                            tx.commit();
                            this.CERRARSesion();
                            if (this.uxpges.ExisteFKUsuario(usua.getIdusuario())==false){  //si no esta como FK en usuarioxpunto
                                resu=usuges.delUsuario(usua);
                                if (resu){  //SI SE EDITO CORRECTAMENTE
                                    JOptionPane.showMessageDialog(null,"El Usuario fue BORRADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                    this.limpiarCampos();
                                } else{
                                    JOptionPane.showMessageDialog(null,"No se pudo BORRAR correctamente el Usuario","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                }
                            } else{
                                JOptionPane.showMessageDialog(null,"No se pudo BORRAR el Usuario porque está siendo utilizado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    } catch (HibernateException ex) {
                        ex.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else
            JOptionPane.showMessageDialog(null,"No se pudo BORRAR el Usuario porque está siendo utilizado","AVISO",JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null,"Favor seleccionar un Usuario a borrar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
}//GEN-LAST:event_jButton10MouseClicked

    private void jCheckBox80ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox80ItemStateChanged
       if(this.jCheckBox80.isSelected()){
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);
            jCheckBox4.setSelected(true);
            jCheckBox5.setSelected(true);
            jCheckBox6.setSelected(true);
            jCheckBox7.setSelected(true);
            jCheckBox8.setSelected(true);
            jCheckBox9.setSelected(true);
            jCheckBox10.setSelected(true);
            jCheckBox11.setSelected(true);
            jCheckBox12.setSelected(true);
            jCheckBox13.setSelected(true);
            jCheckBox14.setSelected(true);
            jCheckBox15.setSelected(true);
            jCheckBox16.setSelected(true);
            jCheckBox35.setSelected(true);
       }else{
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
            jCheckBox7.setSelected(false);
            jCheckBox8.setSelected(false);
            jCheckBox9.setSelected(false);
            jCheckBox10.setSelected(false);
            jCheckBox11.setSelected(false);
            jCheckBox12.setSelected(false);
            jCheckBox13.setSelected(false);
            jCheckBox14.setSelected(false);
            jCheckBox15.setSelected(false);
            jCheckBox16.setSelected(false);
            jCheckBox35.setSelected(false);
       }
    }//GEN-LAST:event_jCheckBox80ItemStateChanged

    private void jCheckBox81ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox81ItemStateChanged
        if(this.jCheckBox81.isSelected()){
            jCheckBox17.setSelected(true);
            jCheckBox18.setSelected(true);
            jCheckBox19.setSelected(true);
            jCheckBox20.setSelected(true);
            jCheckBox21.setSelected(true);
            jCheckBox22.setSelected(true);
            jCheckBox23.setSelected(true);
            jCheckBox24.setSelected(true);
            jCheckBox25.setSelected(true);
            jCheckBox26.setSelected(true);
            jCheckBox27.setSelected(true);
            jCheckBox28.setSelected(true);
            jCheckBox29.setSelected(true);
            jCheckBox30.setSelected(true);
            jCheckBox31.setSelected(true);
            jCheckBox32.setSelected(true);
            jCheckBox33.setSelected(true);
            jCheckBox34.setSelected(true);
            jCheckBox36.setSelected(true);
       }else{
            jCheckBox17.setSelected(false);
            jCheckBox18.setSelected(false);
            jCheckBox19.setSelected(false);
            jCheckBox20.setSelected(false);
            jCheckBox21.setSelected(false);
            jCheckBox22.setSelected(false);
            jCheckBox23.setSelected(false);
            jCheckBox24.setSelected(false);
            jCheckBox25.setSelected(false);
            jCheckBox26.setSelected(false);
            jCheckBox27.setSelected(false);
            jCheckBox28.setSelected(false);
            jCheckBox29.setSelected(false);
            jCheckBox30.setSelected(false);
            jCheckBox31.setSelected(false);
            jCheckBox32.setSelected(false);
            jCheckBox33.setSelected(false);
            jCheckBox34.setSelected(false);
            jCheckBox36.setSelected(false);
       }
    }//GEN-LAST:event_jCheckBox81ItemStateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmUsuarios dialog = new FrmUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
