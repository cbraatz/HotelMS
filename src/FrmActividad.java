
import Hiber1.Actividad;
import Hiber1.Cliente;
import Hiber1.Cliexsub;
import Hiber1.Habitacion;
import Hiber1.NewHibernateUtil;
import Hiber1.Subreserva;
import Soporte.MiDefaultTableModel;
import imp.ActividadXClienteGest;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class FrmActividad extends javax.swing.JDialog {

    /** Creates new form FrmActividad */
    public FrmActividad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
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
        jLabel5.setText("Actividades de los huéspedes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Selección de características de la actividad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("¿Qué desea registrar?");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Actividad de un huésped");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton2.setText("Actividad de todos los huéspedes de una habitación");
        jRadioButton2.setActionCommand("Actividad de los huéspedes de una habitación");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Este huésped/grupo:");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Entra al hotel");

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton4.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton4.setText("Sale del hotel");
        jRadioButton4.setActionCommand("Actividad de los huéspedes de una habitación");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)))
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 204));
        jCheckBox1.setText("Entrega/retira las llaves");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jCheckBox1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Selección de huéspedes/grupo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Habitación a la que pertenece el huésped/grupo:");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel13.setText(" ");

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Tabla de huéspedes por habitación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

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

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Observaciones:");

        jTextField1.setToolTipText("OBSERVACIONES DEL CONJUNTO DE PRODUCTOS UTILIZADOS");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 76, Short.MAX_VALUE))
                    .addComponent(jLabel13))
                .addContainerGap())
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel14.setName(""); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        jButton2.setToolTipText("CONFIRMAR/GUARDAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir2.png"))); // NOI18N
        jButton3.setToolTipText("SALIR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar2.png"))); // NOI18N
        jButton1.setToolTipText("LIMPIAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Session Sesion=null;
    DefaultComboBoxModel modelocombo = new DefaultComboBoxModel();
    DefaultComboBoxModel modelocombo2 = new DefaultComboBoxModel();
    DefaultListModel modeloli = new DefaultListModel();
    MiDefaultTableModel modelotabla = new MiDefaultTableModel();
    boolean habencontrada=false;
    boolean cliencontrado=false;
    boolean subencontrada=false;
    Cliente cli=new Cliente();
    Habitacion hab=new Habitacion();
    Subreserva sub=new Subreserva();
    ActividadXClienteGest actiges=new ActividadXClienteGest();
    public void CERRARSesion(){
        if(Sesion.isOpen()){
            Sesion.flush();
            Sesion.clear();
            Sesion.close();
        }
   }

    public void habilitarBotones(boolean SiNo){
        this.jButton1.setEnabled(SiNo);
        this.jButton2.setEnabled(SiNo);
    }
    public boolean datosValidos(){
        boolean respu=false;
        if(this.jRadioButton1.isSelected()){
            if(cliencontrado)
                respu=true;  //sino false pero no hace falta especificar xq ya es false
        }else{
            if(habencontrada)
                respu=true; //sino false pero no hace falta especificar xq ya es false
        }
        return respu;
    }
    /*public boolean llaveValida(Habitacion ha){
        boolean respu=false;
        if(this.jCheckBox1.isSelected()){
            if(this.jRadioButton3.isSelected()){
                if(ha.getLlave()=='0')
                    respu=true;
                else
                    JOptionPane.showMessageDialog(null,"Las llaves ya se encuentran en recepción","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            }else{
                if(ha.getLlave()=='1')
                    respu=true;
                else
                    JOptionPane.showMessageDialog(null,"Las llaves ya fueron retiradas de recepción","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            }
        }else
            respu=true;
        return respu;
    }*/

    public void cargarComboHab(){  //carga todos los refrigerios a la venta a la tabla, se usa cuando el radiob1 esta seleccionado
        Transaction tx=null;
         Sesion = NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            SQLQuery qq=Sesion.createSQLQuery("select s.idhabit, s.idsubres from subreserva as s, reservacion as r where r.idres=s.idres and s.feyhocheckin is not null and s.feyhocheckout is null and r.activa = '1' and idsubres in (select idsubres from cliexsub) order by idhabit");
            List l1=qq.list();                      //selecciona todas has habitaciones activas y q tienen huespedes alojados
            
            String str="Vacío";
            String str2=" ";
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
                JOptionPane.showMessageDialog(null,"Todas las habitaciones están libres y por lo tanto ninguna actividad puede ser registrada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                habilitarBotones(false);
            }
            this.jComboBox1.setModel(modelocombo);
            tx.commit();
        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
        this.CERRARSesion();
    }

    public int obtenerCodigoHabitacionDeCombo(){
        int resu=0;
        if(modelocombo.getElementAt(jComboBox1.getSelectedIndex()).toString().equals("Vacío")==false)
            resu=Integer.parseInt(modelocombo.getElementAt(jComboBox1.getSelectedIndex()).toString());
        return resu;
   }
    public int obtenerCodigoSubreservaDeCombo(){
        int resu=0;
        if(modelocombo2.getElementAt(jComboBox1.getSelectedIndex()).toString().equals(" ")==false)
            resu=Integer.parseInt(modelocombo2.getElementAt(jComboBox1.getSelectedIndex()).toString());
        return resu;
   }
    public boolean obtenerObjetoHabitacionySubreservaDeCombo(){
       boolean resp=false;
       int coo=obtenerCodigoHabitacionDeCombo();
       int coo2=obtenerCodigoSubreservaDeCombo();
       if(coo>0){
           try{
                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                Transaction tx=Sesion.beginTransaction();
                hab=new Habitacion();
                hab=(Habitacion)Sesion.get(Habitacion.class, coo);
                sub=new Subreserva();
                sub=(Subreserva)Sesion.get(Subreserva.class, coo2);
                tx.commit();
                this.CERRARSesion();
                if(hab!=null && sub!=null){
                    resp= true;
                    habencontrada=true;
                    subencontrada=true;
               }
                else{
                    resp= false;
                    hab=new Habitacion();
                    sub=new Subreserva();
                    habencontrada=false;
                    subencontrada=false;
               }
           } catch (HibernateException e) {
               e.printStackTrace();
           }
       }else{
            resp= false;
            hab=new Habitacion();
            sub=new Subreserva();
            habencontrada=false;
            subencontrada=false;
       }

       return resp;
   }

    public void cargarTodoEnTabla(){  //carga todos los refrigerios a la venta a la tabla, se usa cuando el radiob1 esta seleccionado
        Transaction tx=null;
         Sesion = NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            SQLQuery qq=Sesion.createSQLQuery("select x.idhabit, p.idcli from Cliexsub as p,(select s.idhabit, s.idsubres from subreserva as s, reservacion as r where r.idres=s.idres and s.feyhocheckin is not null and s.feyhocheckout is null and r.activa = '1' and idsubres in (select idsubres from cliexsub) order by idhabit) as x where x.idsubres = p.idsubres");
            List l1=qq.list();                       //selecciona todas las habitacione con los huespedes alojados en ellas
            
            modeloli = new DefaultListModel();
            if(l1.size()>0){
                modelotabla = new MiDefaultTableModel();
                modelotabla.addColumn("Habitación");
                modelotabla.addColumn("Huésped");
                for(int i=0;i<l1.size();i++){
                    Cliente cl=new Cliente();
                    Object[] obje=new Object[2];  //este objeto solo se usa para rescatar los valores de la consulta
                    obje=(Object[])l1.get(i);
                    int codcl=Integer.parseInt(obje[1].toString());
                    cl=(Cliente) Sesion.get(Cliente.class, codcl);
                    Object[] obje2=new Object[2]; //ete objeto es el que se usa para guardar en la tabla
                    obje2[0]=obje[0];
                    obje2[1]=cl.getNombre()+" "+cl.getApellido();
                    modelotabla.addRow(obje2);
                    modeloli.addElement(obje[1].toString());
                }
            }else{
                //JOptionPane.showMessageDialog(null,"Todas las habitaciones están libres y por lo tanto ninguna actividad puede ser registrada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                habilitarBotones(false);
            }
            this.jTable1.setModel(modelotabla);
            this.jTable1.getColumn("Habitación").setMaxWidth(150);
            tx.commit();
        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
         this.CERRARSesion();
    }

    public void cargarTablaPorHabit(int idh){  //carga todos los refrigerios a la venta a la tabla, se usa cuando el radiob1 esta seleccionado
        Transaction tx=null;
        Sesion = NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            SQLQuery qq=Sesion.createSQLQuery("select x.idhabit, p.idcli from Cliexsub as p,(select s.idhabit, s.idsubres from subreserva as s, reservacion as r where r.idres=s.idres and s.feyhocheckin is not null and s.feyhocheckout is null and r.activa = '1' and idsubres in (select idsubres from cliexsub) order by idhabit) as x where x.idsubres = p.idsubres and x.idhabit ="+idh);
            List l1=qq.list();                     //selecciona la habitacion especificada con los huespedes alojados en ella
            modeloli = new DefaultListModel();
            if(l1.size()>0){
                modelotabla = new MiDefaultTableModel();
                modelotabla.addColumn("Habitación");
                modelotabla.addColumn("Huésped");
                for(int i=0;i<l1.size();i++){
                    Cliente cl=new Cliente();
                    Object[] obje=new Object[2];  //este objeto solo se usa para rescatar los valores de la consulta
                    obje=(Object[])l1.get(i);
                    int codcl=Integer.parseInt(obje[1].toString());
                    cl=(Cliente) Sesion.get(Cliente.class, codcl);
                    Object[] obje2=new Object[2]; //ete objeto es el que se usa para guardar en la tabla
                    obje2[0]=obje[0];
                    obje2[1]=cl.getNombre()+" "+cl.getApellido();
                    modelotabla.addRow(obje2);
                    modeloli.addElement(obje[1].toString());
                }
            }else{
                JOptionPane.showMessageDialog(null,"Todas las habitaciones están libres y por lo tanto ninguna actividad puede ser registrada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                habilitarBotones(false);
            }
            this.jTable1.setModel(modelotabla);
            this.jTable1.getColumn("Habitación").setMaxWidth(150);
            tx.commit();
        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
        this.CERRARSesion();
    }
    public void actualizarLabel(){ //actualiza a partir de las variables las variables de cliente y habitacion el label
        if(this.jRadioButton1.isSelected()){
            if(cliencontrado)
                this.jLabel13.setText(cli.getNombre()+" "+cli.getApellido());
            else
                this.jLabel13.setText(" ");
        }else{
            if(habencontrada)
                this.jLabel13.setText("Todos los huéspedes de la Habitación Nº: "+hab.getIdhabit());
            else
                this.jLabel13.setText(" ");
        }

    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                                                                   // al abrirse el form
        this.setLocationRelativeTo(null);  //centra el objeto en pantalla
        this.setResizable(false);
        modelotabla = new MiDefaultTableModel();
        modelotabla.addColumn("Habitación");
        modelotabla.addColumn("Huésped");
        this.cargarComboHab();
        this.cargarTodoEnTabla();
        this.obtenerObjetoHabitacionySubreservaDeCombo();
    }//GEN-LAST:event_formWindowOpened

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
                                                                     //BOTON GUARDAR
        int r=JOptionPane.showConfirmDialog(null,"¿Desea guardar esta actividad?", "CONSULTA", JOptionPane.YES_NO_OPTION);
        if (r==JOptionPane.YES_OPTION){ //si se presiono SI
        Date fe=new Date();
        boolean guardado=false;
        if(this.datosValidos()&&habencontrada&&subencontrada){   //si los datos suministrados son validos y suficientes
            //if(this.llaveValida(hab)){
                Transaction tx=null;
                Sesion = NewHibernateUtil.getSessionFactory().openSession();
                try{
                    tx=Sesion.beginTransaction();
                    if(this.jRadioButton1.isSelected()==false){
                        Query qq=Sesion.createQuery("from Cliexsub where idsubres = "+sub.getIdsubres());
                        List l1=qq.list();                      //selecciona todas has habitaciones activas y q tienen huespedes alojados
                        Cliexsub cxs=new Cliexsub();
                        Actividad act=new Actividad();
                        int contguardados=0;
                        int codac=actiges.getsiguientecodigo();
                        for(int i=0;i<l1.size();i++){
                            cxs=new Cliexsub();
                            act=new Actividad();
                            cxs=(Cliexsub)l1.get(i);
                            if(codac>0){
                                act.setIdact(codac+i);
                                act.setCliente(cxs.getCliente());
                                act.setObs(this.jTextField1.getText());
                                act.setFechayhora(fe);
                                if(this.jRadioButton3.isSelected())
                                    act.setEntra('1');
                                else
                                    act.setEntra('0');
                                if(this.jCheckBox1.isSelected())
                                    act.setLlave('1');
                                else
                                    act.setLlave('0');
                                Sesion.saveOrUpdate(act);
                                contguardados++;
                            }
                        }
                        if(contguardados==l1.size())
                            guardado=true;
                    }else{
                        Actividad act=new Actividad();
                        int codac=actiges.getsiguientecodigo();
                        if(codac>0){
                            act.setIdact(codac);
                            act.setCliente(cli);
                            act.setObs(this.jTextField1.getText());
                            act.setFechayhora(fe);
                            if(this.jRadioButton3.isSelected())
                                act.setEntra('1');
                            else
                                act.setEntra('0');
                            if(this.jCheckBox1.isSelected())
                                act.setLlave('1');
                            else
                                act.setLlave('0');
                            Sesion.saveOrUpdate(act);
                            guardado=true;
                        }
                    }
                    if(guardado){
                        if(this.jCheckBox1.isSelected()){
                            Habitacion hh=new Habitacion();
                            hh=(Habitacion)Sesion.load(Habitacion.class, hab.getIdhabit());
                            if(this.jRadioButton3.isSelected()){ //si entra
                                if(this.jCheckBox1.isSelected())
                                    hh.setLlave('0');
                                else
                                    hh.setLlave('1');
                            }
                            else{
                               if(this.jCheckBox1.isSelected())
                                    hh.setLlave('1');
                               else
                                    hh.setLlave('0');
                            }
                        }
                        tx.commit();
                        JOptionPane.showMessageDialog(null,"Actividad registrada correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        tx.rollback();
                        JOptionPane.showMessageDialog(null,"No se pudo registrar esta actividad","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch(HibernateException e){
                    tx.rollback();
                    e.printStackTrace();
                }
                this.CERRARSesion();
          //  }
                
        }else
            JOptionPane.showMessageDialog(null,"Favor seleccionar una habitación o huésped","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //BOTON SALIR
       /* if(cambio){                                                               
            int r=JOptionPane.showConfirmDialog(null,"Se han realizado cambios en esta habitación. ¿Desea Guardarlos?", "CONSULTA", JOptionPane.YES_NO_OPTION);
            if (r==JOptionPane.YES_OPTION) //si se presiono SI
                this.guardarTodo();
            if(cambio==false)
                this.dispose();
            else{
                this.dispose();
            }
        }else*/
            this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //BOTON LIMPIAR
       // LimpiarCampos();
}//GEN-LAST:event_jButton1MouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        if(this.jRadioButton1.isSelected()){
            this.cliencontrado=false;
            this.habencontrada=false;
            this.actualizarLabel();
        }
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        if(this.jRadioButton2.isSelected()){
            this.cliencontrado=false;
            this.obtenerObjetoHabitacionySubreservaDeCombo();//ya actualiza habencontrada y subencontrada
            this.actualizarLabel();
        }
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila=jTable1.rowAtPoint(evt.getPoint());                 //grilla
        int idh=Integer.parseInt(this.modelotabla.getValueAt(fila, 0).toString());
        int codigo=Integer.parseInt(modeloli.get(fila).toString());
        Transaction tx=null;
        Sesion = NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=Sesion.beginTransaction();
            this.hab=(Habitacion) Sesion.get(Habitacion.class, idh);
            this.cli=(Cliente)Sesion.get(Cliente.class, codigo);
            if(cli!=null && hab!=null){
                cliencontrado=true;
                habencontrada=true;
            }
            else{
                cliencontrado=false;
                habencontrada=false;
            }
            this.actualizarLabel();
            tx.commit();
        } catch(HibernateException e){
            tx.rollback();
            e.printStackTrace();
        }
        this.CERRARSesion();

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if(jTextField1.getText().length()<60){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField1.transferFocus();
        } else
            evt.consume();
}//GEN-LAST:event_jTextField1KeyTyped

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(this.jRadioButton2.isSelected()){
            this.cliencontrado=false;
            this.obtenerObjetoHabitacionySubreservaDeCombo();//ya actualiza habencontrada y subencontrada
            this.actualizarLabel();
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmActividad dialog = new FrmActividad(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
