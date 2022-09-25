
import Hiber1.Multa;
import Hiber1.NewHibernateUtil;
import Hiber1.Stockyserv;
import Hiber1.Stockyservxsubre;
import Hiber1.Subreserva;
import Hiber1.Subresxmul;
import Soporte.MiDefaultTableModel;
import imp.MultaGest;
import imp.StockGest;
import imp.SubresxmulGest;
import imp.SubresxstoyservGest;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.WindowConstants;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FrmAsignacion extends javax.swing.JDialog {

    /** Creates new form FrmAsignacion */
    public FrmAsignacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Asignación de Refrigerios, Servicios y Multas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Datos del Refrigerio/Servicio/Multa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Código:");

        jTextField1.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("CÓDIGO");
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
        jTextField2.setToolTipText("NOMBRE");
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

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Descripción:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Precio:");

        jTextField3.setEditable(false);
        jTextField3.setText("0.0");
        jTextField3.setToolTipText("PRECIO");
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
        jTextField4.setToolTipText("CANTIDAD");
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

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Valor a asignar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Refrigerio");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Servicio");
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

        jRadioButton3.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Multa");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, 0, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stop.gif"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/build.gif"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText(" ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4))
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.setName(""); // NOI18N

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar2.png"))); // NOI18N
        jButton11.setToolTipText("LIMPIAR");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        jButton8.setToolTipText("CONFIRMAR/GUARDAR");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir2.png"))); // NOI18N
        jButton10.setToolTipText("SALIR");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addComponent(jButton8)
                    .addComponent(jButton10))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Session Sesion=null;
    MiDefaultTableModel modelo11 = new MiDefaultTableModel();
    DefaultListModel modelo12 = new DefaultListModel();  //es list xq tiene una sola columna
    MiDefaultTableModel modelo21 = new MiDefaultTableModel();
    MiDefaultTableModel modelo22 = new MiDefaultTableModel();
    DefaultComboBoxModel modelocombo = new DefaultComboBoxModel();  //lista de habitacviones que actualmente estan ocupadas y por ende son las unicas que pueden recibir una asignacion
    DefaultComboBoxModel modelocombo2 = new DefaultComboBoxModel();  //contiene el codigo de la subreserva
    StockGest stoges=new StockGest();
    Stockyserv sto=new Stockyserv();
    Multa multa=new Multa();
    MultaGest mulges=new MultaGest();
    Subreserva subr=new Subreserva();
    boolean cambio=false;
    boolean encontrado=false;
 //   boolean edicion2=false; //es true si se hizo click en la grilla2
    boolean subresencontrada=false;
    int fila=0;
    public void CERRARSesion(){
        if(Sesion.isOpen()){
            Sesion.flush();
            Sesion.clear();
            Sesion.close();
        }
   }
    public void LimpiarCampos(){
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("0.0");
        this.jTextField4.setText("0.0");
        this.jLabel4.setText(" ");
        if(this.jRadioButton3.isSelected())
            cargarTabla1ConMultas();
        else{
            if(this.jRadioButton2.isSelected())
                cargarTabla1ConServicios();
            else
                cargarTabla1ConRefrigerios();
        }
    }
    public void LimpiarTabla2(){
       modelo21 = new MiDefaultTableModel();
       modelo22 = new MiDefaultTableModel();
    }
    public void habilitarBotones(boolean SiNo){
        this.jButton1.setEnabled(SiNo);
        this.jButton2.setEnabled(SiNo);
    }

    public void cargarTabla1ConRefrigerios(){  //carga todos los refrigerios a la venta a la tabla, se usa cuando el radiob1 esta seleccionado
        Transaction tx=null;                                          
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            Query qq=Sesion.createQuery("from Stockyserv where paraventa='1' and esservicio = '0'order by descri");
            List l1=qq.list();
            tx.commit();
            this.CERRARSesion();
            modelo11 = new MiDefaultTableModel();
            modelo12 = new DefaultListModel();
            modelo11.addColumn("Descripción");
            modelo11.addColumn("Precio");
            if(l1.size()>0){
                for(int i=0;i<l1.size();i++){
                    Stockyserv st=(Stockyserv)l1.get(i);
                    Object[] objeto1=new Object[2];
                    objeto1[0]=st.getDescri();
                    objeto1[1]=st.getPrecioventa();
                    modelo11.addRow(objeto1);
                    modelo12.addElement(st.getCodigo());  //es un modelo de lista xq tiene una sola columna
                }
            }
            this.jTable1.setModel(modelo11);
            this.jTable1.getColumn("Precio").setMaxWidth(150);

        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
    }
    public void cargarComboHab(){  //carga todos los refrigerios a la venta a la tabla, se usa cuando el radiob1 esta seleccionado
        Transaction tx=null;
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            SQLQuery qq=Sesion.createSQLQuery("select s.idhabit, s.idsubres from subreserva as s, reservacion as r where r.idres=s.idres and s.feyhocheckin is not null and s.feyhocheckout is null and r.activa = '1' and idsubres in (select idsubres from cliexsub) order by idhabit");
            List l1=qq.list();                      //selecciona todas has habitaciones activas y q tienen huespedes alojados
            tx.commit();
            this.CERRARSesion();
            String str="Vacío";
            String str2="0";
            modelocombo = new DefaultComboBoxModel();
            if(l1.size()>0){
                for(int i=0;i<l1.size();i++){
                    Object[] obje=new Object[2];
                    obje=(Object[])l1.get(i);
                    str=obje[0].toString();
                    str2=obje[1].toString();
                    modelocombo.addElement(str);
                    modelocombo2.addElement(str2);
                }
            }else{
                modelocombo.addElement(str);
                modelocombo2.addElement(str2);
                JOptionPane.showMessageDialog(null,"Todas las habitaciones están libres y por lo tanto ninguna asignación puede ser resalizada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                habilitarBotones(false);
            }
            this.jComboBox1.setModel(modelocombo);
        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
    }
   /* public int obtenerCodigoHabitacionDeCombo(){
        int resu=Integer.parseInt(modelocombo.getElementAt(jComboBox1.getSelectedIndex()).toString());
        return resu;
   }*/
    public int obtenerCodigoSubreservaDeCombo(){
        int resu=0;
        if(modelocombo2.getSize()>0){
            resu=Integer.parseInt(modelocombo2.getElementAt(jComboBox1.getSelectedIndex()).toString());
        }
        return resu;
   }
   public boolean obtenerObjetoSubreservaDeCombo(){
       boolean resp=false;
       int coo=obtenerCodigoSubreservaDeCombo();
       if(coo>0){
           try{
                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                Transaction tx=Sesion.beginTransaction();
                subr=new Subreserva();
                subr=(Subreserva)Sesion.get(Subreserva.class, coo);
                tx.commit();
                this.CERRARSesion();
                if(subr!=null){
                    resp= true;
                    subresencontrada=true;
               }
                else{
                    resp= false;
                    subr=new Subreserva();
                    subresencontrada=false;
               }
           } catch (HibernateException e) {
               e.printStackTrace();
           }
       }else{
            resp= false;
            subr=new Subreserva();
            subresencontrada=false;
       }

       return resp;
   }
    public void cargarAsignacionesDeHabitacionSeleccionada(){
        if(obtenerObjetoSubreservaDeCombo()){
            modelo21 = new MiDefaultTableModel();
            modelo22 = new MiDefaultTableModel();
            this.modelo21.addColumn("Descripción");
            this.modelo21.addColumn("Cantidad");
            this.modelo21.addColumn("Precio");
            this.modelo22.addColumn("cod asig");
            this.modelo22.addColumn("esmul");
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx=Sesion.beginTransaction();
            Query q1=Sesion.createQuery("from Stockyservxsubre where idsubres = "+subr.getIdsubres());
            List l1=q1.list();
            for(int i=0;i<l1.size();i++){
                Stockyservxsubre sys=new Stockyservxsubre();
                sys=(Stockyservxsubre) l1.get(i);
                Object[] obj1=new Object[3];
                obj1[0]=sys.getStockyserv().getDescri();
                obj1[1]=sys.getCantidad();
                obj1[2]=sys.getStockyserv().getPrecioventa();
                Object[] obj2=new Object[2];
                obj2[0]=sys.getStockyserv().getCodigo();
                obj2[1]=0;
                modelo21.addRow(obj1);
                modelo22.addRow(obj2);
            }
            Query q2=Sesion.createQuery("from Subresxmul where idsubres = "+subr.getIdsubres());
            List l2=q2.list();
            for(int i=0;i<l2.size();i++){
                Subresxmul sym=new Subresxmul();
                sym=(Subresxmul) l2.get(i);
                Object[] obj1=new Object[3];
                obj1[0]=sym.getMulta().getDescripmul();
                obj1[1]=sym.getCantidad();
                obj1[2]=sym.getMulta().getPrecio();
                Object[] obj2=new Object[2];
                obj2[0]=sym.getMulta().getIdmulta();
                obj2[1]=1;
                modelo21.addRow(obj1);
                modelo22.addRow(obj2);
            }
            tx.commit();
            this.CERRARSesion();
            this.jTable2.setModel(modelo21);
            this.jTable2.getColumn("Cantidad").setMaxWidth(150);
            this.jTable2.getColumn("Precio").setMaxWidth(150);
        }
    }

    public void cargarTabla1ConServicios(){  //carga todos los servicios a la venta a la tabla, se usa cuando el radiob1 esta seleccionado
        Transaction tx=null;
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            Query qq=Sesion.createQuery("from Stockyserv where esservicio = '1' order by descri");
            List l1=qq.list();
            tx.commit();
            this.CERRARSesion();
            modelo11 = new MiDefaultTableModel();
            modelo12 = new DefaultListModel();
            modelo11.addColumn("Descripción");
            modelo11.addColumn("Precio");
            if(l1.size()>0){
                for(int i=0;i<l1.size();i++){
                    Stockyserv st=(Stockyserv)l1.get(i);
                    Object[] objeto1=new Object[2];
                    objeto1[0]=st.getDescri();
                    objeto1[1]=st.getPrecioventa();
                    modelo11.addRow(objeto1);
                    modelo12.addElement(st.getCodigo());  //es un modelo de lista xq tiene una sola columna
                }
            }
            this.jTable1.setModel(modelo11);
            this.jTable1.getColumn("Precio").setMaxWidth(150);

        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
    }
    public void cargarTabla1ConMultas(){  //carga todos las multas a la venta a la tabla, se usa cuando el radiob1 esta seleccionado
        Transaction tx=null;
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();
            Query qq=Sesion.createQuery("from Multa order by descripmul");
            List l1=qq.list();
            tx.commit();
            this.CERRARSesion();
            modelo11 = new MiDefaultTableModel();
            modelo12 = new DefaultListModel();
            modelo11.addColumn("Descripción");
            modelo11.addColumn("Precio");
            if(l1.size()>0){
                for(int i=0;i<l1.size();i++){
                    Multa mul=(Multa)l1.get(i);
                    Object[] objeto1=new Object[2];
                    objeto1[0]=mul.getDescripmul();
                    objeto1[1]=mul.getPrecio();
                    modelo11.addRow(objeto1);
                    modelo12.addElement(mul.getIdmulta());  //es un modelo de lista xq tiene una sola columna
                }
            }
            this.jTable1.setModel(modelo11);
            this.jTable1.getColumn("Precio").setMaxWidth(150);

        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
    }

    public void CargarTabla2(int cod, String des, float can, float pre, int esmulta){  //esmulta indica si se guarda en la tabla de subresxmul o en la de stockyservxsubre
        Object [] filaa = new Object[3]; // Hay 3 columnas en la tabla
        filaa[0] = des;     //descripcion
        filaa[1] = can;     //cantidad
        filaa[2] = pre;     //precio
        Object [] filaa2 = new Object[2]; // Hay 2 columnas en la tabla
        filaa2[0] = cod; //codigo
        filaa2[1] = esmulta;  //i es multa    0 es stockyserv
        modelo21.addRow(filaa);// Se añade al modelo la fila completa.
        modelo22.addRow(filaa2);// Se añade al modelo la fila completa.
        this.jTable2.setModel(modelo21);
   }

   public void EditarTabla2(int fii, float can, float pre){
        float can2=Float.parseFloat(modelo21.getValueAt(fii, 1).toString());//obtiene la cantidad en la tabla
        can=can+can2;
        modelo21.setValueAt(can, fii, 1);
        modelo21.setValueAt(pre, fii, 2);
        this.jTable2.setModel(modelo21);
   }

   public void guardarTodo(){
       if(subresencontrada){
            int longi = modelo22.getRowCount();
         //   if(modelo22.getRowCount()>0){
                SubresxmulGest suymuges=new SubresxmulGest();
                SubresxstoyservGest suystges=new SubresxstoyservGest();
                Subresxmul suxmu=new Subresxmul();
                Stockyservxsubre stxsu=new Stockyservxsubre();
                Transaction tx=null;
                int conterr=0;
                try{
                    Sesion = NewHibernateUtil.getSessionFactory().openSession();
                    tx=Sesion.beginTransaction();
                    int codst=suystges.getsiguientecodigo();
                    int codmul=suymuges.getsiguientecodigo();
                    int consto=0; //cuenta la cantidad de elementos del stock se guardaron
                    int conmul=0; //cuenta la cantidad de multas se guardaron
                    for(int i=0;i<longi;i++){  //recorre la grilla
                        int cgri=Integer.parseInt(modelo22.getValueAt(i, 0).toString());  //codigo del sto o multa
                        float can1=Float.parseFloat(modelo21.getValueAt(i, 1).toString());
                        int x=Integer.parseInt(modelo22.getValueAt(i, 1).toString());  //0 si es sto y 1 si es multa
                        if(x==1){  //si es una multa
                            Multa mult=new Multa();
                            mult=(Multa) Sesion.get(Multa.class,cgri);
                            if(mult!=null){
                                suxmu=new Subresxmul();
                                if(suymuges.existeMultaEnSubreserva(cgri, subr.getIdsubres())){
                                    suxmu=suymuges.getMiSubresxmul();
                                    float can2=suxmu.getCantidad();
                                    suxmu.setCantidad(can1);
                                    Sesion.saveOrUpdate(suxmu);
                                }else{
                                    if(codmul>0){
                                        suxmu.setId2(codmul+conmul);
                                        conmul++;
                                        suxmu.setCantidad(can1);
                                        suxmu.setMulta(mult);
                                        suxmu.setSubreserva(subr);
                                        suxmu.setPrecio(mult.getPrecio());
                                        Sesion.save(suxmu);
                                    }else
                                        conterr++;
                                }
                            }else
                                conterr++;
                        }else{  //si es un stockyserv
                            Stockyserv st=new Stockyserv();
                            st=(Stockyserv) Sesion.get(Stockyserv.class,cgri);
                            if(st!=null){
                                stxsu=new Stockyservxsubre();
                                float can2=Float.parseFloat("0.0");
                                if(suystges.existeStockEnSubreserva(cgri, subr.getIdsubres())){
                                    stxsu=suystges.getObjStockyservxsubre();
                                    can2=stxsu.getCantidad();
                                    stxsu.setCantidad(can1);
                                    Sesion.saveOrUpdate(stxsu);
                                }else{
                                    
                                    if(codst>0){
                                        stxsu.setId1(codst+consto);
                                        consto++;
                                        stxsu.setCantidad(can1);
                                        stxsu.setStockyserv(st);
                                        stxsu.setSubreserva(subr);
                                        stxsu.setPrecio(st.getPrecioventa());
                                        Sesion.save(stxsu);
                                    }else
                                        conterr++;
                                }
                               if(st.getEsservicio()=='0'){ //si es un producto que hay que descontar del stock
                                    Stockyserv st2=new Stockyserv();
                                    st2=(Stockyserv) Sesion.load(Stockyserv.class, st.getCodigo());
                                    float exi=st.getExistencia();
                                    st2.setExistencia(exi+can2-can1);
                               }
                            }else
                                conterr++;
                        }
                    }

                    //se controla si se borro entonces hay que borrar/////////
                    Query q=Sesion.createQuery("from Subresxmul where idsubres = "+this.subr.getIdsubres());
                    int lo=q.list().size();
                    List li=q.list();
                    for(int i=0;i<lo;i++){
                        Subresxmul xx=new Subresxmul();
                        xx=(Subresxmul) li.get(i);
                        int c1=xx.getMulta().getIdmulta();
                        boolean enc=false;
                        for(int j=0;j<modelo22.getRowCount();j++){
                            int c2=Integer.parseInt(modelo22.getValueAt(j, 0).toString());
                            enc=false;
                            if(c1==c2){
                                enc=true;
                                break;
                            }
                        }
                        if(enc==false){
                            Sesion.delete(xx);
                            //System.out.println("borrado");

                        }
                    }
                    Query qq=Sesion.createQuery("from Stockyservxsubre where idsubres = "+this.subr.getIdsubres());
                    int longitud=qq.list().size();
                    List lis=qq.list();
                    for(int i=0;i<longitud;i++){ //recorre el stock d esa subres
                        Stockyservxsubre xx=new Stockyservxsubre();
                        xx=(Stockyservxsubre) lis.get(i);
                        int c1=xx.getStockyserv().getCodigo();
                        boolean enc=false;
                        
                        for(int j=0;j<modelo22.getRowCount();j++){
                            int c2=Integer.parseInt(modelo22.getValueAt(j, 0).toString());
                            enc=false;
                            if(c1==c2){
                                enc=true;
                                break;
                            }
                        }
                        if(enc==false){
                            if(xx.getStockyserv().getEsservicio()=='0'){//si no es servicio hay q actualizar stock
                                Stockyserv stt=new Stockyserv();
                                stt=(Stockyserv) Sesion.load(Stockyserv.class,xx.getStockyserv().getCodigo());
                                float can=xx.getCantidad();
                                float canenst=stt.getExistencia();
                                stt.setExistencia(canenst+can);
                            }
                            Sesion.delete(xx);
                            //System.out.println("borrado");
                        }
                    }
                    
                    if (conterr==0){
                        tx.commit();
                        JOptionPane.showMessageDialog(null,"Registro completado correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                        cambio=false;
                     //   this.jComboBox1.setEnabled(true);
                        LimpiarTabla2();
                        this.LimpiarCampos();
                    }
                    else
                        tx.rollback();
                    this.CERRARSesion();
                } catch(HibernateException e){
                    tx.rollback();
                    e.printStackTrace();
                }
 //           }
       }else
            JOptionPane.showMessageDialog(null,"Ninguna habitación seleccionada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
    }
    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
                                                                      //CAMPO DE TEXTO ID/CODIGO
        if(jTextField1.getText().isEmpty()==false){
            if(this.jRadioButton3.isSelected()){  //si es multa
                encontrado=mulges.ExisteIdEnTabla(Integer.parseInt(jTextField1.getText()));
                if(encontrado){
                    sto=new Stockyserv();
                    multa=new Multa();
                    multa=mulges.GetObjMulta();
                    jTextField2.setText(multa.getDescripmul());
                    jTextField3.setText(Float.toString(multa.getPrecio()));
                    this.jLabel4.setText(" ");
                } else {
                    JOptionPane.showMessageDialog(null,"Código NO encontrado","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    LimpiarCampos();
                    sto=new Stockyserv();
                    multa=new Multa();
                    encontrado=false;
                }
            } else{//si es un producto a la venta
                sto=new Stockyserv();
                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                Sesion.beginTransaction();
                sto=(Stockyserv) Sesion.get(Stockyserv.class, Integer.parseInt(jTextField1.getText()));  //busco de nuevo xq al obtener la unidad de medida mas abajo me tira error de lazy inicialization...
                if(this.jRadioButton2.isSelected()){ //si es servicio
                    encontrado=stoges.ExisteIdServicioEnTabla(Integer.parseInt(jTextField1.getText()));
                    if(encontrado && sto !=null){
                        multa=new Multa();
                        jTextField2.setText(sto.getDescri());
                        jTextField3.setText(Float.toString(sto.getPrecioventa()));
                        this.jLabel4.setText(" ");
                    } else {
                        JOptionPane.showMessageDialog(null,"Código NO encontrado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                        LimpiarCampos();
                        sto=new Stockyserv();
                        multa=new Multa();
                        encontrado=false;
                    }
                 }else{  //si es refrigerio/producto
                        encontrado=stoges.ExisteIdProductoEnTabla(Integer.parseInt(jTextField1.getText()));
                        if(encontrado && sto!=null){
                            multa=new Multa();
                            jTextField2.setText(sto.getDescri());
                            jTextField3.setText(Float.toString(sto.getPrecioventa()));
                            this.jLabel4.setText(sto.getUnidadmedida().getDescripum());
                        }else {
                            JOptionPane.showMessageDialog(null,"Código NO encontrado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            LimpiarCampos();
                            sto=new Stockyserv();
                            multa=new Multa();
                            encontrado=false;
                        }
                 }
                this.CERRARSesion();
            }
  //          edicion2=false;//es true si se hizo click en la grilla2 y si se llama a este metodo desde la grilla2, esto lo pone en false y la grilla2
                    //lo vuelve a poner en true
        }else {
            LimpiarCampos();
            multa=new Multa();
            sto=new Stockyserv();
            encontrado=false;
        }
}//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

}//GEN-LAST:event_jTextField1KeyReleased

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

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained

}//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost

}//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        Transaction tx=null;                                          //PARA BUSQUEDA INTERACTIVA  en la lista
        String texto=jTextField2.getText();
        String consulta="";
        texto=texto.toUpperCase();             //pasa a mayusculas
        if(this.jRadioButton1.isSelected())
            consulta="from Stockyserv where paraventa='1' and esservicio = '0' and (descri like'"+"%" +texto+"%"+ "') order by descri";
        else{
            if(this.jRadioButton2.isSelected())
                consulta="from Stockyserv where esservicio = '1' and (descri like'"+"%" +texto+"%"+ "') order by descri";
            else
                consulta="from Multa where (descripmul like'"+"%" +texto+"%"+ "') order by descripmul";
        }
        try{
            Sesion = NewHibernateUtil.getSessionFactory().openSession();
            tx=Sesion.beginTransaction();

            Query qq=Sesion.createQuery(consulta);
            List l1=qq.list();
            tx.commit();
            this.CERRARSesion();
            modelo11 = new MiDefaultTableModel();
            modelo12 = new DefaultListModel();
            modelo11.addColumn("Descripción");
            modelo11.addColumn("Precio");
            if(l1.size()>0){
                if(this.jRadioButton3.isSelected()){  //si es una multa
                    for(int i=0;i<l1.size();i++){
                        Multa mul=(Multa)l1.get(i);
                        Object[] objeto1=new Object[2];
                        objeto1[0]=mul.getDescripmul();
                        objeto1[1]=mul.getPrecio();
                        modelo11.addRow(objeto1);
                        modelo12.addElement(mul.getIdmulta());  //es un modelo de lista xq tiene una sola columna
                    }
                }else{
                    for(int i=0;i<l1.size();i++){
                        Stockyserv st=(Stockyserv)l1.get(i);
                        Object[] objeto1=new Object[2];
                        objeto1[0]=st.getDescri();
                        objeto1[1]=st.getPrecioventa();
                        modelo11.addRow(objeto1);
                        modelo12.addElement(st.getCodigo());  //es un modelo de lista xq tiene una sola columna
                    }

                }
                this.jTable1.setModel(modelo11);
                this.jTable1.getColumn("Precio").setMaxWidth(150);
            }
           
        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
}//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if(jTextField2.getText().length()>=30)   //para la validacion
            evt.consume();
}//GEN-LAST:event_jTextField2KeyTyped

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                                                                //al cargarse el form
        this.setLocationRelativeTo(null);  //centra el objeto en pantalla
        this.setResizable(false);
      //  setDefaultCloseOperation(0);
        //this.setDefaultCloseOperation(jDialog.);
       // setUndecorated(true);
        //getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        Sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        cargarTabla1ConRefrigerios();
        this.cargarComboHab();
        cargarAsignacionesDeHabitacionSeleccionada();
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
                                                                     
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
                                                                       
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
                                                                        
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int c=modelo21.getRowCount();              // BOTON BORRAR ELEMENTO DE LA GRILLA2
        if(c>0){
            String dee=modelo21.getValueAt(fila, 0).toString();
            int x=JOptionPane.showConfirmDialog(null,"¿Desea quitar "+dee+"?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(x==0){
                modelo21.removeRow(fila);
                modelo22.removeRow(fila);
                cambio=true;
               // this.jComboBox1.setEnabled(false);
                fila=0;
            }
  //          this.edicion2=false;  //es true si se hizo click en la grilla2
        }
}//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(jTextField1.getText().isEmpty()==false && jButton1.isEnabled()==true && this.modelocombo.getSize()>0){//BOTON AGREGAR
            if(Float.parseFloat(jTextField3.getText())>0 && Float.parseFloat(jTextField4.getText())>0){
                Stockyserv st=new Stockyserv();
                if(stoges.ExisteIdEnTabla(Integer.parseInt(this.jTextField1.getText()))){
                    st=stoges.getObjStock();
                    boolean valido=false;
                    if(st.getEsservicio()=='1')
                        valido=true;
                    else{
                        if(st.getExistencia()>=Float.parseFloat(this.jTextField4.getText()))
                            valido=true;
                    }
                    if(valido){
                        boolean edicion=false;
                        int codi=0;
                        int codi2=Integer.parseInt(jTextField1.getText());
                        int celem=modelo21.getRowCount();
                        int multa1=0;  //guarda si el item a cargar es una multa
                        if(this.jRadioButton3.isSelected())
                            multa1=1;
                        for(int k=0;k<celem;k++){   //se recorre la tabla para ver si existe el codigo de producto
                            codi=Integer.parseInt(modelo22.getValueAt(k, 0).toString()); //extrae el codigo de la tabla
                            int multa2=Integer.parseInt(modelo22.getValueAt(k, 1).toString()); //extrae si es multa de la tabla
                            if(codi == codi2 && multa1==multa2){
                                edicion=true;  //entra a modo edicion si el codigo de producto ya existe en la grilla
                                fila=k;
                                break;
                            }
                        }
                        if(edicion==false){
                            this.CargarTabla2(Integer.parseInt(jTextField1.getText()),jTextField2.getText(),Float.parseFloat(jTextField4.getText()),
                                    Float.parseFloat(jTextField3.getText()),multa1);  //esto carga la tabla
                        } else{
                            this.EditarTabla2(fila, Float.parseFloat(jTextField4.getText()),Float.parseFloat(jTextField3.getText()));  //esto edita la tabla

                        }
                        edicion=false;
                        cambio=true;
                     //   this.jComboBox1.setEnabled(false);
                        LimpiarCampos();
                        //       this.edicion2=false;//es true si se hizo click en la grilla2
                    }else
                        JOptionPane.showMessageDialog(null,"Cantidad de este producto no disponible en stock","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                }
            } else
                JOptionPane.showMessageDialog(null,"Favor completar los campos Cantidad y Precio antes de continuar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
}//GEN-LAST:event_jButton1MouseClicked

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        //campo cantidad
        jTextField4.selectAll();
}//GEN-LAST:event_jTextField4FocusGained

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
        } else
            jTextField4.setText("0.0");
}//GEN-LAST:event_jTextField4FocusLost

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // campo cantidad
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField4.transferFocus();
}//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if(jTextField4.getText().length()>=15)                      //validacion cantidad
            evt.consume();
}//GEN-LAST:event_jTextField4KeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       if(modelo11.getRowCount()>0) {
            try{                                                             // GRILLA 2
                int filaa=jTable1.rowAtPoint(evt.getPoint());
                String codigo=modelo12.getElementAt(filaa).toString(); //extrae el contenido de la tabla
                jTextField1.setText(codigo);   //completa los cuadros de texto
                jTextField1.requestFocus();    //pide el foco para salir de nuevo y ejecutar lo que hay en el lost
                jTextField1.transferFocus();
            } catch(ArrayIndexOutOfBoundsException ee){
            }
         //   this.edicion2=false;
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        fila=jTable2.rowAtPoint(evt.getPoint());                 //grilla2
            //no hacer la busqueda cuando se hace click, xq entonces puede no coincidir en la tabla de busqueda(stock o multa) con los radiob
    }//GEN-LAST:event_jTable2MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
                                                                        // al seleccionar una habitacion
        cargarAsignacionesDeHabitacionSeleccionada();

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked

          if(cambio){                                                                  //BOTON GUARDAR
              int r=JOptionPane.showConfirmDialog(null,"¿Desea Guardar cambios?", "CONSULTA", JOptionPane.YES_NO_OPTION);
              if (r==JOptionPane.YES_OPTION) //si se presiono SI
                this.guardarTodo();
              else{
                 // this.jComboBox1.setEnabled(true);
                  cambio=false;
                  this.cargarAsignacionesDeHabitacionSeleccionada();
              }
          }else
              JOptionPane.showMessageDialog(null,"No se ha hecho ningún cambio y por lo tanto no es necesario guardar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

}//GEN-LAST:event_jButton8MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
                                                                                        //BOTON SALIR
        if(cambio){                                                                  //BOTON GUARDAR
              int r=JOptionPane.showConfirmDialog(null,"Se han realizado cambios en esta habitación. ¿Desea Guardarlos?", "CONSULTA", JOptionPane.YES_NO_OPTION);
              if (r==JOptionPane.YES_OPTION) //si se presiono SI
                this.guardarTodo();
                if(cambio==false)
                    this.dispose();
              else{
                  this.dispose();
              }
          }else
              this.dispose();
        
}//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        //BOTON LIMPIAR
        LimpiarCampos();
}//GEN-LAST:event_jButton11MouseClicked

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1FocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged

    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        //al seleccionar servicios
        if(this.jRadioButton2.isSelected())
            this.LimpiarCampos();  //en el limpiar carga la tabla
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
           //al seleccionar refrigerios
        if(this.jRadioButton1.isSelected())
            this.LimpiarCampos();  //en el limpiar carga la tabla
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
          //al seleccionar multa
        if(this.jRadioButton3.isSelected())
            this.LimpiarCampos();  //en el limpiar carga la tabla
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmAsignacion dialog = new FrmAsignacion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        JOptionPane.showMessageDialog(null,"Los cambios que pudiera haber hecho sin guardarlos, serán descartados","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
