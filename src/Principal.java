
import Hiber1.Habitacion;
import Hiber1.NewHibernateUtil;
import Hiber1.Usuarios;
import Hiber1.Varios;
import Soporte.*;
import imp.ApeyciecajaGest;
import imp.HabitacionGest;
import imp.UsuarioGest;
import imp.UsuarioXPuntoGest;
import imp.VariosGest;
import java.awt.Frame;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Principal extends javax.swing.JFrame {
public Principal() {
     initComponents();
}
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HotSys v1.0");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/IMGrecepcion2.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true), "Informacion de Sesión", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 8), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel1.setText("Sesión NO Iniciada");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel2.setText("Iniciar");
        jLabel2.setToolTipText("INICIAR SESIÓN");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        jLabel4.setText("Usuario:");

        jTextField1.setText("Usuario");
        jTextField1.setToolTipText("USUARIO");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jPasswordField1.setText("Contraseña");
        jPasswordField1.setToolTipText("CONSTRASEÑA");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        jLabel6.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel3.setText("Cerrar");
        jLabel3.setToolTipText("CERRAR SESIÓN");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPasswordField1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Lista de Reservaciones Pendientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Lista de Reservaciones En Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jTextField6.setBackground(new java.awt.Color(153, 153, 153));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Habitaciones Libres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jScrollPane1.setViewportView(jList3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jButton1.setText("Huéspedes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setBorder(null);
        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenuItem1ItemStateChanged(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem40.setText("Opciones");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem40);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setText("Atención al Cliente");
        jMenu2.setToolTipText("Atención al cliente");

        jMenuItem2.setText("Reservas");
        jMenuItem2.setToolTipText("Gestionar las reservaciones y ocupaciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Asignaciones");
        jMenuItem3.setToolTipText("Asignación de refrigerios, servicios y multas a los huéspedes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Actividades");
        jMenuItem4.setToolTipText("Registro de las actividades de los huéspedes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(null);
        jMenu3.setText("Módulos");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Compras");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed1(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Apertura y Cierre de Caja");
        jMenuItem6.setToolTipText("Apertura y Cierre de Caja");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Movimientos de Caja");
        jMenuItem7.setToolTipText("Registro de movimientos de caja");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Descartes");
        jMenuItem8.setToolTipText("Registro de descartes de productos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Ajuste de Stock");
        jMenuItem9.setToolTipText("Registro de utilización de productos o artículos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Trabajos realizados");
        jMenuItem10.setToolTipText("Registro de trabajos realizados en las habitaciones");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Rutinas de limpieza");
        jMenuItem11.setToolTipText("registro de las rutinas diarias de limpieza");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(null);
        jMenu4.setText("Maestros ");
        jMenu4.setToolTipText("Altas, Bajas y Modificaciones de registros maestros");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem12.setText("Productos/Refrigerios");
        jMenuItem12.setToolTipText("ABM de productos y Refrigerios");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Servicios");
        jMenuItem13.setToolTipText("ABM de Servicios");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Habitaciones");
        jMenuItem14.setToolTipText("ABM de Habitaciones");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("Clientes");
        jMenuItem15.setToolTipText("ABM de Clientes");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Empleados");
        jMenuItem16.setToolTipText("ABM de Empleados");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem17.setText("Monedas y Cotizaciones");
        jMenuItem17.setToolTipText("ABM de Monedas y Cotizaciones");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Usuarios y Puntos de Menú");
        jMenuItem18.setToolTipText("ABM de los Usuarios y sus respectivos puntos de menú a los que tienen acceso");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(null);
        jMenu5.setText("Registros");
        jMenu5.setToolTipText("Altas, Bajas y Modificaciones de registros simples");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem19.setText("Formas de Pago/Caja");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem20.setText("Tipos de Movimiento de Caja");
        jMenuItem20.setToolTipText("ABM de Tipos de Movimiento de Caja");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuItem21.setText("Tipos de Documento");
        jMenuItem21.setToolTipText("ABM de Tipo de Documento");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuItem22.setText("Tipos de Habitaciones");
        jMenuItem22.setToolTipText("ABM de los Tipos de Habitaciones");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem22);

        jMenuItem23.setText("Estado de las Habitaciones");
        jMenuItem23.setToolTipText("ABM de los Estados por los que pueden pasar las habitaciones");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem23);

        jMenuItem24.setText("Sectores o Grupos de Habitaciones");
        jMenuItem24.setToolTipText("ABM de Sectores, Grupos o Ubicación de las habitaciones");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem24);

        jMenuItem25.setText("Multas");
        jMenuItem25.setToolTipText("ABM de Multas");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem25);

        jMenuItem26.setText("Bancos");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed1(evt);
            }
        });
        jMenu5.add(jMenuItem26);

        jMenuItem27.setText("Unidades de Medida");
        jMenuItem27.setToolTipText("ABM de Unidades de Medida");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem27);

        jMenuItem28.setText("Motivos de Descarte");
        jMenuItem28.setToolTipText("Motivos por los que se podrían descartar una mercadería");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem28);

        jMenuItem29.setText("Motivos de Ajuste de Stock");
        jMenuItem29.setToolTipText("Motivos por los que se utilizan los productos o artículos en el hotel");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem29);

        jMenuItem30.setText("Cargos de los Empleados");
        jMenuItem30.setToolTipText("ABM de Cargos que se le pueden asignar a los empleados");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem30);

        jMenuItem31.setText("Países");
        jMenuItem31.setToolTipText("ABM Países");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed1(evt);
            }
        });
        jMenu5.add(jMenuItem31);

        jMenuItem32.setText("Proveedores");
        jMenuItem32.setToolTipText("ABM de Proveedores");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem32);

        jMenuItem33.setText("Profesiones");
        jMenuItem33.setToolTipText("ABM de Profesiones");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem33);

        jMenuItem34.setText("IVA");
        jMenuItem34.setToolTipText("ABM del Impuesto al Valor Agregado");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem34);

        jMenuItem41.setText("Empresas");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem41);

        jMenuItem42.setText("Subtipo");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem42);

        jMenuBar1.add(jMenu5);

        jMenu6.setBorder(null);
        jMenu6.setText("Informes");

        jMenuItem36.setText("Informes Administrativos");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem36);

        jMenuItem37.setText("Informes de Reservas");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem37);

        jMenuItem38.setText("Informes de Ingresos y egresos");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem38);

        jMenuItem39.setText("Informes de Auditoría");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem39);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))))
        );

        getAccessibleContext().setAccessibleName("Kegler");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultListModel mimodelolista =null;
    DefaultListModel mimodelolistacodigos =null; //tiene los codigos asociados a mimodelolista
    DefaultListModel mimodelolista2 =null;
    DefaultListModel mimodelolista2codigos =null; //tiene los codigos asociados a mimodelolista
    DefaultListModel mimodelolistaHabLibres =null;
    boolean usuarioconectado=false;
    Usuarios Usuario=new Usuarios();
    String fechadehoy="";
    clasesutiles cluti=new clasesutiles();
    Session sesion=null;
    VariosGest vages=new VariosGest();
    HabitacionGest habges=new HabitacionGest();
    ApeyciecajaGest apeges=new ApeyciecajaGest();
    FrmReserva frmreserva=null;
    FrmCompra frmcompra=null;
    FrmMovCaja frmmovcaja=null;
    FrmAsignacion frmasignacion=null;
    FrmActividad frmactividades=null;
    FrmCajayArqueo frmcajayarqueo=null;
    FrmDescartes frmdescartes=null;
    FrmAjusteStock frmajuste=null;
    FrmTrabajo frmtrabajo=null;
    FrmRutina frmrutina=null;
    FrmStock frmstock=null;
    FrmServicios frmservicios=null;
    FrmHabitacion frmhabitacion=null;
    FrmEmpleado frmempleado=null;
    FrmUsuarios frmusuarios=null;
    FrmMoneda frmmoneda=null;
    FrmCliente frmcliente=null;
    FrmFormaPago frmformapago=null;
    FrmTipomov frmtipomov=null;
    FrmTipoHab frmtipohab=null;
    FrmGrupo frmgrupo=null;
    FrmEstado frmestado=null;
    FrmCargos frmcargos=null;
    FrmMulta frmmulta=null;
    FrmBanco frmbanco=null;
    FrmUnidadMedida frmunidadmedida=null;
    FrmMotivoDescarte frmmotivodesc=null;
    FrmMotivoUti frmmotivouti=null;
    FrmProfesion frmprofesion=null;
    FrmTipoDocumento frmtipodocumento=null;
    FrmPais frmpais=null;
    FrmProveedor frmproveedor=null;
    FrmIva frmiva=null;
    UsuarioXPuntoGest usuxpunges=new UsuarioXPuntoGest();
    FrmOpciones frmopciones=null;
    FrmInformesAdministrativos frminfoadmin=null;
    FrmInformeAuditoria frminfoaudi=null;
    FrmInformeReserva frminfores=null;
    FrmInformeIngresosEgresos2 frminfoingegr=null;
    FrmEmpresa frmempresa=null;
    FrmSubTipoHab frmsubtipo=null;
    int ordenarpor=0;

   /* public void cargarTabla(){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx=sesion.beginTransaction();
        String consulta="";
        if(ordenarpor==0)
            consulta="from Habitacion";
        else
            consulta="from Habitacion order by tipohab";
        Query q=sesion.createQuery(consulta);
        List li=q.list();
        MiDefaultTableModel mod=new MiDefaultTableModel();
        mod.addColumn("Nº");
        mod.addColumn("Tipo");
        mod.addColumn("Fecha/Estado");
        Habitacion ha=new Habitacion();
        this.actualizarFechaDeHoy();
        for(int i=0;i<li.size();i++){
            ha=(Habitacion)li.get(i);
            Object[] obj=new Object[3];
            obj[0]=ha.getIdhabit();
            obj[1]=ha.getTipohab().getDescripth();
            //String estado=habges.estadoDeEstaHabitacionEnFechaEnSubreserva(ha.getIdhabit(),this.fechadehoy);
            /*if(estado.equals("LIBRE"))
                estado=habges.estadoDeEstaHabitacionEnFecha(ha.getIdhabit(),this.fechadehoy);*/
          /*  obj[2]=habges.estadoDeEstaHabitacionEnFechaEnSubreserva(ha.getIdhabit(),this.fechadehoy);
            mod.addRow(obj);
        }
        tx.commit();
        this.CERRARSesion();
        this.jTable1.setModel(mod);
        jTable1.getColumn("Nº").setMaxWidth(30);
        jTable1.getColumn("Fecha/Estado").setMinWidth(100);
        jTable1.getColumn("Fecha/Estado").setMaxWidth(100);

    }
    public void actualizarFechaDeHoy(){
        fechadehoy=cluti.Date_StringDMA(clasesutiles.Calender_Date(Calendar.getInstance()));
    }*/
    public void ActualizarPanelSesion(){
       // this.ActualizarUsuario();
        if(usuarioconectado){
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx=sesion.beginTransaction();
            Varios vari=new Varios();
            vari=(Varios)sesion.get(Varios.class, 1);
            if(vari!=null){
                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 3, true), "Informacion de Sesión", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 8), new java.awt.Color(0, 0, 153)));
                this.jLabel1.setText("Bienvenido "+vari.getUsuarios().getUsuario());
                this.jTextField1.setText("");
                this.jPasswordField1.setText("");
            }
            tx.commit();
            this.CERRARSesion();
        }
        else{
           jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true), "Informacion de Sesión", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 8), new java.awt.Color(255, 0, 0)));
           this.jLabel1.setText("Sesión NO Iniciada");
        }
    }



    public void ActualizarUsuario(){  //carga la conexion de login a la de este formulario
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx=sesion.beginTransaction();
        Varios vari=new Varios();
        vari=(Varios)sesion.get(Varios.class, 1);
        if(vari!=null){
            if(vari.getConectado()=='1'){
                Usuario=vari.getUsuarios();
                this.usuarioconectado=true;
            }else{
                Usuario=new Usuarios();
                this.usuarioconectado=false;
            }
        }
        tx.commit();
        CERRARSesion();
    }
    public void  CERRARSesion(){
        if(sesion.isOpen()){
            sesion.flush();
            sesion.clear();
            sesion.close();
        }
    }
    public void abrir(){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1=sesion.beginTransaction();
        Varios var=new Varios();
        var=(Varios)sesion.get(Varios.class, 1);
        tx1.commit();
        CERRARSesion();
        if(var!=null){
            if(var.getConectado()=='0'){
                if(jTextField1.getText().equals("")==false && jPasswordField1.getText().equals("")==false){
                    try{
                        String usr=jTextField1.getText();
                        String pass=codigo.MD5(jPasswordField1.getText());
                        UsuarioGest usuges=new UsuarioGest();
                        Character conectado='0';
                        this.Usuario=new Usuarios();
                        if (usuges.existeUsuario(usr, pass)==false){
                            this.usuarioconectado=false;
                            this.Usuario=null;
                            JOptionPane.showMessageDialog(null,"Usuario No válido","NO CONECTADO",JOptionPane.INFORMATION_MESSAGE);

                        } else{
                            this.usuarioconectado=true;
                            this.Usuario=usuges.getMiUsuario();
                            conectado='1';
                            JOptionPane.showMessageDialog(null,"Usuario Válido","CONECTADO",JOptionPane.INFORMATION_MESSAGE);
                            this.jTextField1.setText("");
                            this.jPasswordField1.setText("");
                        }
                        
                        sesion = NewHibernateUtil.getSessionFactory().openSession();
                        Transaction tx=sesion.beginTransaction();
                        Varios vari=new Varios();
                        vari=(Varios)sesion.load(Varios.class, 1);
                        vari.setUsuarios(Usuario);
                        vari.setConectado(conectado);
                        tx.commit();
                        CERRARSesion();
                        this.ActualizarPanelSesion();
                        }catch(HibernateException e){JOptionPane.showMessageDialog(null,"Error al iniciar sesión de usuario","ERROR",JOptionPane.ERROR_MESSAGE);}
                        catch (NoSuchAlgorithmException ex2) {
                           JOptionPane.showMessageDialog(null,"Error al iniciar sesión de usuario","ERROR",JOptionPane.ERROR_MESSAGE);
                        }catch (UnsupportedEncodingException ex3) {
                           JOptionPane.showMessageDialog(null,"Error al iniciar sesión de usuario","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    } else{
                         JOptionPane.showMessageDialog(null,"Favor completar los campos requeridos","NO SE PUDO INICIAR SESIÓN",JOptionPane.INFORMATION_MESSAGE);
                    }
            }else
                JOptionPane.showMessageDialog(null,"Ya hay un usuario conectado. Favor cerrar la sesión antes de continuar","AVISO",JOptionPane.INFORMATION_MESSAGE);
        }else
           JOptionPane.showMessageDialog(null,"No se pudo iniciar la sesión","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }
    public boolean cerrar(){
        boolean respu=false;
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1=sesion.beginTransaction();
        Varios var=new Varios();
        var=(Varios)sesion.get(Varios.class, 1);
        tx1.commit();
        CERRARSesion();
        if(var!=null){
            if(var.getConectado()=='1'){
                int x=JOptionPane.showConfirmDialog(null,"¿Seguto que desea cerrar la sesióm de usuario?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(x==0){
                    if(vages.estaConectadoAlgunUsuario()==true){
                        sesion = NewHibernateUtil.getSessionFactory().openSession();
                        Transaction tx=sesion.beginTransaction();
                        Varios vari=new Varios();
                        vari=(Varios)sesion.load(Varios.class, 1);
                        vari.setUsuarios(null);
                        vari.setConectado('0');
                        tx.commit();
                        CERRARSesion();
                        this.usuarioconectado=false;
                        this.Usuario=null;
                        this.ActualizarPanelSesion();
                        JOptionPane.showMessageDialog(null,"Sesión de usuario cerrada exitosamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                        respu=true;
                        if(apeges.estaAbierta()){
                            x=JOptionPane.showConfirmDialog(null,"¿También desea cerrar caja?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                            if(x==0){
                               FrmCajayArqueo cajyarq=null;
                               int existe=1;  //se empieza suponiendo que existe
                               try{
                                   cajyarq.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
                               }                    //para cerrarla antes de crear una nueva...tira error si no existe
                               catch(NullPointerException ex){
                                 existe=0;  //si no existe una clase previa
                               }
                               if (existe==1)
                                   cajyarq.dispose();

                               cajyarq=new FrmCajayArqueo(this,true);
                               cajyarq.show();
                               ActualizarPanelSesion();
                               this.repaint();
                            }
                        }
                    }else
                        JOptionPane.showMessageDialog(null,"La sesión de usuario ya está cerrada","AVISO",JOptionPane.INFORMATION_MESSAGE);
                }
            }else
                JOptionPane.showMessageDialog(null,"La sesión ya está cerrada","AVISO",JOptionPane.INFORMATION_MESSAGE);
        }else
           JOptionPane.showMessageDialog(null,"No se pudo cerrar la sesión","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        return respu;
    }
    public void actualizarFechaDeHoy(){
        fechadehoy=cluti.Date_StringDMA(clasesutiles.Calender_Date(Calendar.getInstance()));
    }
    public void CargarLista(){//  reservaciones pendientes
        this.actualizarFechaDeHoy();
        Transaction tx=null;
        try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=sesion.beginTransaction();
            Query qq=sesion.createQuery("select c.idcli, r.idres, c.nombre, c.apellido, r.fechainicio from Cliente as c, Reservacion as r where c.idcli  = r.cliente and activa = '1' and r.fechafin >= '"+cluti.FormatearFecha(fechadehoy)+"' and checkin = '0' and checkout = '0'");  //and r.checkin = 0  esta condicion la saque
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

    public void CargarLista2(){//  reservaciones pendientes
        this.actualizarFechaDeHoy();
        Transaction tx=null;
        try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=sesion.beginTransaction();
            Query qq=sesion.createQuery("select c.idcli, r.idres, c.nombre, c.apellido, r.fechainicio from Cliente as c, Reservacion as r where c.idcli  = r.cliente and r.checkout = '0' and r.checkin = '1' and activa = 1");  //and r.checkin = 0  esta condicion la saque
            List l1=qq.list();
            mimodelolista2 = new DefaultListModel();
            mimodelolista2codigos = new DefaultListModel();
            int longi=l1.size();
            if(longi>0){
                for(int i=0;i<longi;i++){
                    Object[] objeto = (Object[]) l1.get(i);
                    String codcl = objeto[0].toString();
                    String codre = objeto[1].toString();
                    String nom=objeto[2].toString();
                    String ape=objeto[3].toString();
                    String fein=objeto[4].toString();
                    mimodelolista2.add(i,nom+"_"+ape+" // "+fein);
                    mimodelolista2codigos.add(i,codcl+"-"+codre);
               }
            }
            jList2.setModel(mimodelolista2);
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
    public void CargarLista3(){//  habitaciones libres
        this.actualizarFechaDeHoy();
        Transaction tx=null;
        mimodelolistaHabLibres=new DefaultListModel();
        this.actualizarFechaDeHoy();
        String manhana="";
        try {
            Calendar man = cluti.Date_Calender(cluti.StrDMA_Date(fechadehoy));
            man.add(Calendar.DATE, 1);
            manhana=cluti.Date_StringDMA(clasesutiles.Calender_Date(man));
        } catch (ParseException ex) {
           //Logger.getLogger(FrmReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx= sesion.beginTransaction();
          //  SQLQuery qu= sesion.createSQLQuery("select idhabit, sum(idestado)as suma from Ocupaciones where fecha >= '"+f1+"' and fecha <  '"+f2+"' group by idhabit");
            SQLQuery qu= sesion.createSQLQuery("select distinct h.idhabit, t.descripth from habitacion as h, tipohab as t where h.idhabit not in (select distinct idhabit from Ocupaciones where fecha >= '"+fechadehoy+"' and fecha <  '"+manhana+"' order by idhabit) and t.idtipoh=h.idtipoh order by t.idtipoh, h.idhabit");
            List ll=qu.list();
             Object[] obj=null;
            for(int i=0;i<ll.size();i++){
                obj=new Object[2];
                obj=(Object[])ll.get(i);
                this.mimodelolistaHabLibres.addElement(obj[0].toString()+" - "+obj[1].toString());
            }
            this.jList3.setModel(mimodelolistaHabLibres);
            tx.commit();
            this.CERRARSesion();
        }
        catch(HibernateException e){
            e.printStackTrace();
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                                                                // al iniciar el principal
       // String urlIcono=System.getProperty("user.dir")+"/src/iconos/f5logo2.jpg";
        //this.setIconImage (new ImageIcon(urlIcono).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);  //centra el objeto en pantalla
        setDefaultCloseOperation(0);
        this.sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.ActualizarUsuario();
        this.ActualizarPanelSesion();
        this.sesion = NewHibernateUtil.getSessionFactory().openSession();
        Varios va=new Varios();
        va=(Varios)sesion.get(Varios.class, 1);
        //volver a descomentar al pillar como se genera el codigo
 /*       if(va==null)
            System.exit(0);
        else{
            try {
                if (!(va.getSerial().equals(codigo.Codificar()))) {
                    boolean existe = true; //MENU OPCIONES
                    try {
                        frmopciones.dispose(); //se encierra en un catch para ver si ya existe una instancia del jdialog
                    } //para cerrarla antes de crear una nueva...tira error si no existe
                    catch (NullPointerException ex) {
                        existe = false; //si no existe una clase previa
                    }
                    if (existe) {
                        frmopciones.dispose();
                    }
                    JOptionPane.showMessageDialog(null,"Debe validar el producto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    frmopciones = new FrmOpciones(this, true);
                    frmopciones.setVisible(true);
                    
                }
                va=new Varios();
                va=(Varios)sesion.get(Varios.class, 1);
                if(va==null)
                    System.exit(0);
                else{
                     if (!(va.getSerial().equals(codigo.Codificar())))
                         System.exit(0);
                }
            } catch (NoSuchAlgorithmException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error","ERROR 1",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            } catch (UnsupportedEncodingException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error","ERROR 2",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }

        }*/

    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
       //nada
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenuItem1ItemStateChanged
       //nada
    }//GEN-LAST:event_jMenuItem1ItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1=sesion.beginTransaction();
        Varios var=new Varios();
        var=(Varios)sesion.get(Varios.class, 1);
        tx1.commit();
        CERRARSesion();
        boolean salir=false;
        if(var!=null){
            if(var.getConectado()=='1'){
                int x=JOptionPane.showConfirmDialog(null,"La Sesión de usuario está iniciada.¿Desea cerrarla antes de salir?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(x==0){
                    if(this.cerrar())
                        salir=true;
                }else
                    salir=true;
            }else
                salir=true;
            if(salir){
                int x=JOptionPane.showConfirmDialog(null,"¿Desea salir?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(x==0)
                    System.exit(0);
            }
       }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        boolean existe=true;                                                //MENU RESERVAS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(33);
        if(permitido){
            try{
                 frmreserva.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmreserva.dispose();
            frmreserva=new FrmReserva(this,false);
            frmreserva.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        boolean existe=true;                                                //MENU ASIGNACION
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(32);
        if(permitido){
            try{
                 frmasignacion.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmasignacion.dispose();
            frmasignacion=new FrmAsignacion((Frame)this,true);
            frmasignacion.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        boolean existe=true;                                              //MENU ACTIVIDADES
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(29);
        if(permitido){
            try{
                 frmactividades.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmactividades.dispose();
            frmactividades=new FrmActividad((Frame)this,false);
            frmactividades.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        boolean existe=true;                                              //MENU COMPRAS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(27);
        if(permitido){
            try{
                 frmcompra.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmcompra.dispose();
            frmcompra=new FrmCompra((Frame)this,false);
            frmcompra.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        //nada
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        boolean existe=true;                                              //MENU MOV CAJA
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(31);
        if(permitido){
            try{
                 frmmovcaja.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmmovcaja.dispose();
            frmmovcaja=new FrmMovCaja((Frame)this,false);
            frmmovcaja.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        boolean existe=true;                                              //MENU DESCARTES
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(13);
        if(permitido){
            try{
                 frmdescartes.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmdescartes.dispose();
            frmdescartes=new FrmDescartes((Frame)this,false);
            frmdescartes.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        boolean existe=true;                                              //MENU ajuste stock
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(30);
        if(permitido){
            try{
                 frmajuste.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmajuste.dispose();
            frmajuste=new FrmAjusteStock((Frame)this,false);
            frmajuste.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        boolean existe=true;                                              //MENU TRABAJOS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(28);
        if(permitido){
            try{
                 frmtrabajo.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmtrabajo.dispose();
            frmtrabajo=new FrmTrabajo((Frame)this,false);
            frmtrabajo.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       boolean existe=true;                                              //MENU RUTINAS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(14);
        if(permitido){
            try{
                 frmrutina.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmrutina.dispose();
            frmrutina=new FrmRutina((Frame)this,false);
            frmrutina.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        //nada
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        boolean existe=true;                                              //MENU SERVICIOS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(2);
        if(permitido){
            try{
                 frmservicios.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmservicios.dispose();
            frmservicios=new FrmServicios((Frame)this,false);
            frmservicios.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        boolean existe=true;                                              //MENU HABITACIONES
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(5);
        if(permitido){
            try{
                 frmhabitacion.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmhabitacion.dispose();
            frmhabitacion=new FrmHabitacion((Frame)this,false);
            frmhabitacion.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        boolean existe=true;                                              //MENU CLIENTES
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(26);
        if(permitido){
            try{
                 frmcliente.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmcliente.dispose();
            frmcliente=new FrmCliente((Frame)this,false);
            frmcliente.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        boolean existe=true;                                              //MENU EMPLEADOS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(9);
        if(permitido){
            try{
                 frmempleado.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmempleado.dispose();
            frmempleado=new FrmEmpleado((Frame)this,false);
            frmempleado.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        boolean existe=true;                                              //MENU MONEDA Y COTIZACION
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(17);
        if(permitido){
            try{
                 frmmoneda.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmmoneda.dispose();
            frmmoneda=new FrmMoneda((Frame)this,false);
            frmmoneda.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        boolean existe=true;                                              //MENU USUARIOS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(12);
        if(permitido){
            try{
                 frmusuarios.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmusuarios.dispose();
            frmusuarios=new FrmUsuarios((Frame)this,false);
            frmusuarios.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
       boolean existe=true;                                              //MENU FORMA DE PAGO / CAJA
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(3);
        if(permitido){
            try{
                 frmformapago.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmformapago.dispose();
            frmformapago=new FrmFormaPago((Frame)this,false);
            frmformapago.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        boolean existe=true;                                              //MENU TIPO DE MOVIMIENTO DE CAJA
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(4);
        if(permitido){
            try{
                 frmtipomov.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmtipomov.dispose();
            frmtipomov=new FrmTipomov((Frame)this,false);
            frmtipomov.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
       boolean existe=true;                                              //MENU TIPO DE DOCUMENTO
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(23);
        if(permitido){
            try{
                 frmtipodocumento.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmtipodocumento.dispose();
            frmtipodocumento=new FrmTipoDocumento((Frame)this,false);
            frmtipodocumento.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed

            boolean existe=true;                                              //MENU TIPO DE HABITACION
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(6);
        if(permitido){
            try{
                 frmtipohab.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmtipohab.dispose();
            frmtipohab=new FrmTipoHab((Frame)this,false);
            frmtipohab.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        boolean existe=true;                                              //MENU ESTADO HABITACIONES
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(8);
        if(permitido){
            try{
                 frmestado.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmestado.dispose();
            frmestado=new FrmEstado((Frame)this,false);
            frmestado.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        boolean existe=true;                                              //MENU GRUPO HABITACIONES
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(7);
        if(permitido){
            try{
                 frmgrupo.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmgrupo.dispose();
            frmgrupo=new FrmGrupo((Frame)this,false);
            frmgrupo.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        boolean existe=true;                                              //MENU MULTAS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(11);
        if(permitido){
            try{
                 frmmulta.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmmulta.dispose();
            frmmulta=new FrmMulta((Frame)this,false);
            frmmulta.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
       boolean existe=true;                                              //MENU UNIDAD DE MEDIDA
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(19);
        if(permitido){
            try{
                 frmunidadmedida.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmunidadmedida.dispose();
            frmunidadmedida=new FrmUnidadMedida((Frame)this,false);
            frmunidadmedida.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        boolean existe=true;                                              //MENU MOTIVO DESCARTE
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(20);
        if(permitido){
            try{
                 frmmotivodesc.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmmotivodesc.dispose();
            frmmotivodesc=new FrmMotivoDescarte((Frame)this,false);
            frmmotivodesc.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        boolean existe=true;                                              //MENU MOTIVO ajuste stock
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(21);
        if(permitido){
            try{
                 frmmotivouti.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmmotivouti.dispose();
            frmmotivouti=new FrmMotivoUti((Frame)this,false);
            frmmotivouti.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        boolean existe=true;                                              //MENU CARGOS DE LOS EMPLEADOS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(10);
        if(permitido){
            try{
                 frmcargos.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmcargos.dispose();
            frmcargos=new FrmCargos((Frame)this,false);
            frmcargos.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        boolean existe=true;                                              //MENU PROVEEDORES
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(25);
        if(permitido){
            try{
                 frmproveedor.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmproveedor.dispose();
            frmproveedor=new FrmProveedor((Frame)this,false);
            frmproveedor.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
       //nada
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        boolean existe=true;                                              //MENU IVA
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(35);
        if(permitido){
            try{
                 frmiva.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmiva.dispose();
            frmiva=new FrmIva((Frame)this,false);
            frmiva.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        //boolean existe=true;                                              //MENU PRODUCTOS Y REFRIGERIOS ***STOCK
       /* boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(1);
        if(permitido){
            FrmStock frmstock=new FrmStock((Frame)this,true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
*/
        boolean existe=true;                                              //MENU PRODUCTOS Y REFRIGERIOS ***STOCK
        usuxpunges=new UsuarioXPuntoGest();
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(1);
        if(permitido){
            try{
                 frmstock.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmstock.dispose();
            frmstock=new FrmStock((Frame)this,false);
            frmstock.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
       boolean existe=true;                                              //MENU PROFESIONES
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(22);
        if(permitido){
            try{
                 frmprofesion.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmprofesion.dispose();
            frmprofesion=new FrmProfesion((Frame)this,false);
            frmprofesion.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        boolean existe=true;                                                //MENU APERTURA Y CIERRE DE CAJA
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(34);
        if(permitido){
            try{
                 frmcajayarqueo.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmcajayarqueo.dispose();
            frmcajayarqueo=new FrmCajayArqueo((Frame)this,false);
            frmcajayarqueo.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem31ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed1
         boolean existe=true;                                              //MENU PAISES
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(24);
        if(permitido){
            try{
                 frmpais.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmpais.dispose();
            frmpais=new FrmPais((Frame)this,false);
            frmpais.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem31ActionPerformed1

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          this.CargarLista();
          this.CargarLista2();
          this.CargarLista3();
    }//GEN-LAST:event_formWindowActivated

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //CERRAR
        this.cerrar();
}//GEN-LAST:event_jLabel3MouseClicked

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        if(jPasswordField1.getText().length()<60){             //validacion pass
            if(((int)evt.getKeyChar()) == 10){ //si se presiono enter
                jPasswordField1.transferFocus();
                if(this.jPasswordField1.getText().isEmpty()==false && this.jTextField1.getText().isEmpty()==false)
                    abrir();
            }
        } else
            evt.consume();
}//GEN-LAST:event_jPasswordField1KeyTyped

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        jPasswordField1.selectAll();
}//GEN-LAST:event_jPasswordField1FocusGained

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if(jTextField1.getText().length()<30){             //validacion usuario
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField1.transferFocus();
        } else
            evt.consume();
}//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.selectAll();
}//GEN-LAST:event_jTextField1FocusGained

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        abrir();
}//GEN-LAST:event_jLabel2MouseClicked

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        boolean existe=true;                                              //MENU INFORMES ADMINISTRATIVOS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(15);
        if(permitido){
            try{
                 frminfoadmin.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frminfoadmin.dispose();
            frminfoadmin=new FrmInformesAdministrativos((Frame)this,false);
            frminfoadmin.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        boolean existe=true;                                              //MENU INFORMES RESERVAS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(15);
        if(permitido){
            try{
                 frminfores.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frminfores.dispose();
            frminfores=new FrmInformeReserva((Frame)this,false);
            frminfores.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
       boolean existe=true;                                              //MENU INFORMES INGRESOS Y EGRESOS
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(15);
        if(permitido){
            try{
                 frminfoingegr.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frminfoingegr.dispose();
            frminfoingegr=new FrmInformeIngresosEgresos2((Frame)this,false);
            frminfoingegr.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
 
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        boolean existe=true;                                              //MENU INFORMES AUDITORIA
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(15);
        if(permitido){
            try{
                 frminfoaudi.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frminfoaudi.dispose();
            frminfoaudi=new FrmInformeAuditoria((Frame)this,false);
            frminfoaudi.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem26ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed1
       boolean existe=true;                                              //MENU BANCO
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(18);
        if(permitido){
            try{
                 frmbanco.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmbanco.dispose();
            frmbanco=new FrmBanco((Frame)this,false);
            frmbanco.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem26ActionPerformed1

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
       boolean existe=true;                                                //MENU OPCIONES
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(16);
        if(permitido){
            try{
                 frmopciones.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmopciones.dispose();
            frmopciones=new FrmOpciones(this,false);
            frmopciones.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem5ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed1
        boolean existe=true;                                                //MENU compras
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(16);
        if(permitido){
            try{
                 frmcompra.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmcompra.dispose();
            frmcompra=new FrmCompra(this,false);
            frmcompra.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed1

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
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
            frmempresa=new FrmEmpresa(this,false);
            frmempresa.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        //nada
}//GEN-LAST:event_jTextField5FocusLost

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        //nada
}//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        Transaction tx=null;                                          //PARA BUSQUEDA INTERACTIVA  en la lista
        this.actualizarFechaDeHoy();
        String texto=jTextField5.getText();
        texto=texto.toUpperCase();             //pasa a mayusculas
        try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=sesion.beginTransaction();
            Query qq=sesion.createQuery("select c.idcli, r.idres, c.nombre, c.apellido, r.fechainicio from Cliente as c, Reservacion as r where c.idcli  = r.cliente and activa = 1 and (c.nombre like'"+"%" +texto+"%"+ "') and r.fechafin >= '"+cluti.FormatearFecha(fechadehoy)+"' and checkin = '0' and checkout = '0' order by c.nombre, c.apellido");
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

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        boolean existe=true;                                                //MENU empresas
        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(6);  //igual que el de tipo
        if(permitido){
            try{
                 frmsubtipo.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
            }                    //para cerrarla antes de crear una nueva...tira error si no existe
            catch(NullPointerException ex){
                 existe=false;  //si no existe una clase previa
            }
            if (existe)
                frmsubtipo.dispose();
            frmsubtipo=new FrmSubTipoHab(this,true);
            frmsubtipo.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        int x=JOptionPane.showConfirmDialog(null,"¿Abrir esta reserva?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(x==0){
            int posicion = jList1.locationToIndex(evt.getPoint());
            if(posicion >=0){
                String txt=mimodelolistacodigos.get(posicion).toString();  //modelo con los codigos
                StringTokenizer tok=new StringTokenizer(txt,"-");
                int codcli=Integer.parseInt(tok.nextToken());
                int codres=Integer.parseInt(tok.nextToken());
                boolean existe=true;                                                //MENU RESERVAS
                boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(33);
                if(permitido){
                    try{
                        frmreserva.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
                    }                    //para cerrarla antes de crear una nueva...tira error si no existe
                    catch(NullPointerException ex){
                        existe=false;  //si no existe una clase previa
                    }
                    if (existe)
                        frmreserva.dispose();
                    frmreserva=new FrmReserva(this,false,codcli,codres);
                    frmreserva.setVisible(true);
                }else
                    JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            }
        }
}//GEN-LAST:event_jList1MouseClicked

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
         Transaction tx=null;                                          //PARA BUSQUEDA INTERACTIVA  en la lista
        String texto=jTextField6.getText();
        texto=texto.toUpperCase();             //pasa a mayusculas
        try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=sesion.beginTransaction();
            Query qq=sesion.createQuery("select c.idcli, r.idres, c.nombre, c.apellido, r.fechainicio from Cliente as c, Reservacion as r where c.idcli  = r.cliente and activa = 1 and (c.nombre like'"+"%" +texto+"%"+ "')  and r.checkout = '0' and r.checkin = '1' and activa = '1' order by c.nombre, c.apellido");
            List l1=qq.list();
            mimodelolista2 = new DefaultListModel();
            mimodelolista2codigos = new DefaultListModel();
            if(l1.size()>0){
                for(int i=0;i<l1.size();i++){
                    Object[] objeto = (Object[]) l1.get(i);
                    String codcl = objeto[0].toString();
                    String codre = objeto[1].toString();
                    String nom=objeto[2].toString();
                    String ape=objeto[3].toString();
                    String fein=objeto[4].toString();
                    mimodelolista2.add(i,nom+"_"+ape+" // "+fein);
                    mimodelolista2codigos.add(i,codcl+"-"+codre);
                }
            }
            jList2.setModel(mimodelolista2);  //carga el modelo a la lista, si no se encontro coincidencia, esta esta vacia
            tx.commit();
            this.CERRARSesion();
        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
      int x=JOptionPane.showConfirmDialog(null,"¿Abrir esta reserva?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(x==0){
            int posicion = jList2.locationToIndex(evt.getPoint());
            if(posicion >=0){
                String txt=mimodelolista2codigos.get(posicion).toString();  //modelo con los codigos
                StringTokenizer tok=new StringTokenizer(txt,"-");
                int codcli=Integer.parseInt(tok.nextToken());
                int codres=Integer.parseInt(tok.nextToken());
                boolean existe=true;                                                //MENU RESERVAS
                boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(33);
                if(permitido){
                    try{
                        frmreserva.dispose();  //se encierra en un catch para ver si ya existe una instancia del jdialog
                    }                    //para cerrarla antes de crear una nueva...tira error si no existe
                    catch(NullPointerException ex){
                        existe=false;  //si no existe una clase previa
                    }
                    if (existe)
                        frmreserva.dispose();
                    frmreserva=new FrmReserva(this,false,codcli,codres);
                    frmreserva.setVisible(true);
                }else
                    JOptionPane.showMessageDialog(null,"No está autorizado a acceder a esta información","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jList2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        boolean permitido=usuxpunges.EstaHabilitadoElUsuarioEnEstePunto(15);
        if(permitido){
            ClaseReporte cr=new ClaseReporte();
            cr.MostrarReporte("repoReserva3", "Informe de Huéspedes por habitación ocupada");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
    ///////////////////////////////////////////////////////////////////
    public static void main(String args[]) {
 /*       try {
           new SplashScreen();
        } catch (InterruptedException ex) {
           // Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VariosGest varges=new VariosGest();
                if(varges.EstaVariosCargado()==false){  //si es la primera vez que se inicia
                    if(varges.inicializarTodo())
                        new Principal().setVisible(true);
                    else
                        JOptionPane.showMessageDialog(null,"Datos de inicio no fueron cargados correctamente y la aplicación no podrá ser iniciada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                }else
                    new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
