
import Soporte.ClaseReporte;
import Soporte.clasesutiles;
import java.text.ParseException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class FrmInformeReserva extends javax.swing.JDialog {

    /** Creates new form FrmInformeReserva */
    public FrmInformeReserva(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jLabel5.setText("Informes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setName(""); // NOI18N

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
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Selección de informes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton1.setText("Estado de las habitaciones ocupadas entre fechas");
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton2.setText("Reservaciones concretadas entre fechas");
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton2StateChanged(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton3.setText("Huéspedes por habitación ocupada");
        jRadioButton3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton3StateChanged(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton5.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton5.setText("Actividades de los  huéspedes entre fechas");
        jRadioButton5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton5StateChanged(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton4.setText("Habitaciones ocupadas con Fecha de Entrada/Salida");
        jRadioButton4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton4StateChanged(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel22.setForeground(new java.awt.Color(0, 0, 204));
        jLabel22.setText("Evaluar resultados:");

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel23.setForeground(new java.awt.Color(0, 0, 204));
        jLabel23.setText("Inicio:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setToolTipText("FECHA DE INICIO DE LA BÚSQUEDA");
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
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

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel24.setForeground(new java.awt.Color(0, 0, 204));
        jLabel24.setText("Fin:");

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel25.setForeground(new java.awt.Color(0, 0, 204));
        jLabel25.setText("Entre fechas:");

        jButton1.setText("Evaluar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton6.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton6.setSelected(true);
        jRadioButton6.setText("Reservaciones por Cliente, con fecha de Inicio y fin");
        jRadioButton6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton6StateChanged(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel26.setForeground(new java.awt.Color(0, 0, 204));
        jLabel26.setText("Por habitación:");

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton7.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton7.setText("Consumiciones y servicios utilizados por una habitación");
        jRadioButton7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton7StateChanged(evt);
            }
        });

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton8.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton8.setText("Multas incurridas por los huéspedes de una habitación");
        jRadioButton8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton8StateChanged(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel27.setForeground(new java.awt.Color(0, 0, 204));
        jLabel27.setText("Nº de habitación:");

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel28.setForeground(new java.awt.Color(0, 0, 204));
        jLabel28.setText("Código de la reserva:");

        jTextField1.setToolTipText("CÓDIGO DE LA RESERVA BUSCADA");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setToolTipText("NÚMERO DE HABITACIÓN BUSCARA (campo vacío busca todas las habitaciones)");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel1.setText("* Obs.: El mensaje \"El documento no tiene páginas\" ");

        jLabel2.setText("indica que no se obtuvo ningún resultado.");

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton9.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton9.setText("Habitaciones libres entre fechas");
        jRadioButton9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton9StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton5)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel22))
                    .addComponent(jLabel1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton1))
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jRadioButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    clasesutiles cluti=new clasesutiles();
    ClaseReporte cr=new ClaseReporte();
    String fechadehoy="";
public void mostrarCampos1(){
    this.jFormattedTextField1.setVisible(true);
    this.jFormattedTextField2.setVisible(true);
    this.jLabel23.setVisible(true);
    this.jLabel24.setVisible(true);
    this.jLabel25.setVisible(true);
    this.jLabel26.setVisible(false);
    this.jLabel27.setVisible(false);
    this.jLabel28.setVisible(false);
    this.jTextField1.setVisible(false);
    this.jTextField2.setVisible(false);

}

public void mostrarCampos2(){
    this.jFormattedTextField1.setVisible(false);
    this.jFormattedTextField2.setVisible(false);
    this.jLabel23.setVisible(false);
    this.jLabel24.setVisible(false);
    this.jLabel25.setVisible(false);
    this.jLabel26.setVisible(true);
    this.jLabel27.setVisible(true);
    this.jLabel28.setVisible(true);
    this.jTextField1.setVisible(true);
    this.jTextField2.setVisible(true);

}
public void actualizarFechaDeHoy(){
        fechadehoy=cluti.Date_StringDMA(clasesutiles.Calender_Date(Calendar.getInstance()));
    }

public void ocultarTodo(){
    this.jFormattedTextField1.setVisible(false);
    this.jFormattedTextField2.setVisible(false);
    this.jLabel23.setVisible(false);
    this.jLabel24.setVisible(false);
    this.jLabel25.setVisible(false);
    this.jLabel26.setVisible(false);
    this.jLabel27.setVisible(false);
    this.jLabel28.setVisible(false);
    this.jTextField1.setVisible(false);
    this.jTextField2.setVisible(false);
}

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        //BOTON SALIR
        this.dispose();//sale
}//GEN-LAST:event_jButton9MouseClicked

    private void jFormattedTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusLost
        //cuadro de fecha1
        String texto1=jFormattedTextField1.getText();
        String texto2=jFormattedTextField2.getText();
        if(texto1.equals("  /  /    ")==false){  //si no esta vacio
            if(cluti.FechaValidaDMA(texto1)==false){  //si la fecha no es valida
                JOptionPane.showMessageDialog(null,"Fecha NO válida","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jFormattedTextField1.requestFocus();
                jFormattedTextField1.setText("");
            }else{
                if(cluti.obtenerDiferenciaDeFechasEnDias2(texto1, texto2)>=0 && texto2.equals("  /  /    ")==false){  //si la fecha no es valida
                    JOptionPane.showMessageDialog(null,"La fecha de Inicio debe ser menor a la de Fin","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jFormattedTextField1.requestFocus();
                    jFormattedTextField1.setText("");
                }
            }

        }
}//GEN-LAST:event_jFormattedTextField1FocusLost

    private void jFormattedTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyReleased
        // texto fecha1
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField1.transferFocus();
}//GEN-LAST:event_jFormattedTextField1KeyReleased

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
                if(cluti.obtenerDiferenciaDeFechasEnDias2(texto1, texto2)>=0 && texto1.equals("  /  /    ")==false){  //si la fecha no es valida
                    JOptionPane.showMessageDialog(null,"La fecha de Fin debe ser mayor a la de Inicio","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jFormattedTextField2.requestFocus();
                    jFormattedTextField2.setText("");
                }
            }
            
        }
}//GEN-LAST:event_jFormattedTextField2FocusLost

    private void jFormattedTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField2KeyReleased
        // texto fecha2
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jFormattedTextField2.transferFocus();
}//GEN-LAST:event_jFormattedTextField2KeyReleased

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.jRadioButton1.isSelected() && this.jFormattedTextField1.getText().equals("  /  /    ")==false && this.jFormattedTextField2.getText().equals("  /  /    ")==false){
            Map param = new HashMap();
            param.put("fecha1",cluti.FormatearFecha(this.jFormattedTextField1.getText()));
            param.put("fecha2",cluti.FormatearFecha(this.jFormattedTextField2.getText()));
            param.put("titulo","Habitaciones no libres entre "+this.jFormattedTextField1.getText()+" y "+this.jFormattedTextField2.getText());
            cr.MostrarReporte("repoReserva1", "Informe de las habitaciones no disponibles",param);
        }
        if(this.jRadioButton2.isSelected() && this.jFormattedTextField1.getText().equals("  /  /    ")==false && this.jFormattedTextField2.getText().equals("  /  /    ")==false){
            Map param = new HashMap();
            param.put("fecha1",cluti.FormatearFecha(this.jFormattedTextField1.getText()));
            param.put("fecha2",cluti.FormatearFecha(this.jFormattedTextField2.getText()));
            param.put("titulo","Reservaciones concretadas entre "+this.jFormattedTextField1.getText()+" y "+this.jFormattedTextField2.getText());
            cr.MostrarReporte("repoReserva2", "Informe de Reservaciones concretadas",param);
        }
        if(this.jRadioButton3.isSelected()){
            cr.MostrarReporte("repoReserva3", "Informe de Huéspedes por habitación ocupada");
        }
        if(this.jRadioButton4.isSelected()){
            cr.MostrarReporte("repoReserva4", "Informe de habitaciones ocupadas por fecha de entrada y salida");
        }
        if(this.jRadioButton5.isSelected() && this.jFormattedTextField1.getText().equals("  /  /    ")==false && this.jFormattedTextField2.getText().equals("  /  /    ")==false){
            Map param = new HashMap();
            param.put("fecha1",cluti.FormatearFecha(this.jFormattedTextField1.getText()));
            param.put("fecha2",cluti.FormatearFecha(this.jFormattedTextField2.getText()));
            param.put("titulo","Actividades de los huéspedes entre "+this.jFormattedTextField1.getText()+" y "+this.jFormattedTextField2.getText());
            cr.MostrarReporte("repoReserva5", "Informe de Actividades de los huéspedes",param);
        }
        if(this.jRadioButton6.isSelected() && this.jFormattedTextField1.getText().equals("  /  /    ")==false && this.jFormattedTextField2.getText().equals("  /  /    ")==false){
            Map param = new HashMap();
            param.put("fecha1",cluti.FormatearFecha(this.jFormattedTextField1.getText()));
            param.put("fecha2",cluti.FormatearFecha(this.jFormattedTextField2.getText()));
            param.put("titulo","Reservas por cliente cuya fecha de inicio está entre "+this.jFormattedTextField1.getText()+" y "+this.jFormattedTextField2.getText());
            cr.MostrarReporte("repoReserva6", "Informe de Reservas por cliente",param);
        }
        if(this.jRadioButton7.isSelected() && this.jTextField1.getText().isEmpty()==false && this.jTextField2.getText().isEmpty()==false){
            Map param = new HashMap();
            param.put("codres",this.jTextField1.getText());
            param.put("codhab",this.jTextField2.getText());
            param.put("titulo","Consumición y sevicios utilizados por la habitación Nº "+this.jTextField2.getText()+" de la reserva Nº "+this.jTextField1.getText());
            cr.MostrarReporte("repoReserva71", "Informe de Consumiciones y servicios utilizados",param);
        }else{
            if(this.jRadioButton7.isSelected() && this.jTextField1.getText().isEmpty()==false && this.jTextField2.getText().isEmpty()){
                Map param = new HashMap();
                param.put("codres",this.jTextField1.getText());
                //param.put("codhab",this.jTextField2.getText());
                param.put("titulo","Consumición y sevicios utilizados por todas las habitaciones de la reserva Nº "+this.jTextField1.getText());
                cr.MostrarReporte("repoReserva72", "Informe de Consumiciones y servicios utilizados",param);
            }
        }
        if(this.jRadioButton8.isSelected() && this.jTextField1.getText().isEmpty()==false && this.jTextField2.getText().isEmpty()==false){
            Map param = new HashMap();
            param.put("codres",this.jTextField1.getText());
            param.put("codhab",this.jTextField2.getText());
            param.put("titulo","Multas incurridas por los huéspedes de la habitación Nº "+this.jTextField2.getText()+" de la reserva Nº "+this.jTextField1.getText());
            cr.MostrarReporte("repoReserva81", "Informe de Multas",param);
        }else{
            if(this.jRadioButton8.isSelected() && this.jTextField1.getText().isEmpty()==false && this.jTextField2.getText().isEmpty()){
                Map param = new HashMap();
                param.put("codres",this.jTextField1.getText());
                //param.put("codhab",this.jTextField2.getText());
                param.put("titulo","Todas Multas incurridas por los huéspedes de las habitaciones de la reserva Nº "+this.jTextField1.getText());
                cr.MostrarReporte("repoReserva82", "Informe de Multas",param);
            }
        }
        if(this.jRadioButton9.isSelected() && this.jFormattedTextField1.getText().equals("  /  /    ")==false && this.jFormattedTextField2.getText().equals("  /  /    ")==false){
           //try {
                Map param = new HashMap();
                param.put("fecha1", cluti.FormatearFecha(this.jFormattedTextField1.getText()));
                param.put("fecha2", cluti.FormatearFecha(this.jFormattedTextField2.getText()));
                param.put("titulo", "Habitaciones disponibles entre " + this.jFormattedTextField1.getText() + " y " + this.jFormattedTextField2.getText());
                cr.MostrarReporte("repoReserva9", "Habitaciones disponibles", param);
           // } catch (ParseException ex) {
            //    Logger.getLogger(FrmInformeReserva.class.getName()).log(Level.SEVERE, null, ex);
            //}
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                                                                    //al iniciar el form
        this.setLocationRelativeTo(null);  //centra el objeto en pantalla
        this.setResizable(false);
      //  setDefaultCloseOperation(0);
        this.mostrarCampos1();
        this.actualizarFechaDeHoy();
        jFormattedTextField1.setText(cluti.ObtenerFechaSinGuion(fechadehoy));
        try {
            Calendar man = cluti.Date_Calender(cluti.StrDMA_Date(fechadehoy));
            man.add(Calendar.DATE, 1);
            String manhana=cluti.Date_StringDMA(clasesutiles.Calender_Date(man));
            jFormattedTextField2.setText(cluti.ObtenerFechaSinGuion(manhana));
        } catch (ParseException ex) {
           //Logger.getLogger(FrmReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
       if(this.jRadioButton1.isSelected())
           this.mostrarCampos1();
    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jRadioButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton2StateChanged
        if(this.jRadioButton2.isSelected())
           this.mostrarCampos1();
    }//GEN-LAST:event_jRadioButton2StateChanged

    private void jRadioButton3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton3StateChanged
        if(this.jRadioButton3.isSelected())
           this.ocultarTodo();
    }//GEN-LAST:event_jRadioButton3StateChanged

    private void jRadioButton4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton4StateChanged
        if(this.jRadioButton4.isSelected())
           this.ocultarTodo();
    }//GEN-LAST:event_jRadioButton4StateChanged

    private void jRadioButton5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton5StateChanged
        if(this.jRadioButton5.isSelected())
           this.mostrarCampos1();
    }//GEN-LAST:event_jRadioButton5StateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jRadioButton6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton6StateChanged
        if(this.jRadioButton6.isSelected())
           this.mostrarCampos1();
    }//GEN-LAST:event_jRadioButton6StateChanged

    private void jRadioButton7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton7StateChanged
        if(this.jRadioButton7.isSelected())
           this.mostrarCampos2();
    }//GEN-LAST:event_jRadioButton7StateChanged

    private void jRadioButton8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton8StateChanged
       if(this.jRadioButton8.isSelected())
           this.mostrarCampos2();
    }//GEN-LAST:event_jRadioButton8StateChanged

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
                                                                 //para validar el codigo reserva
        boolean esint=Character.isDigit(evt.getKeyChar());   //tira true si el boton presionado es un digito
        if(esint==false){      //si no se ingresa un digito
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField1.transferFocus();
            else
                evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
                                                                //para validar el NUMERO HAB
        boolean esint=Character.isDigit(evt.getKeyChar());   //tira true si el boton presionado es un digito
        if(esint==false){      //si no se ingresa un digito
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField2.transferFocus();
            else
                evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jRadioButton9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton9StateChanged
        if(this.jRadioButton9.isSelected())
           this.mostrarCampos1();
    }//GEN-LAST:event_jRadioButton9StateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmInformeReserva dialog = new FrmInformeReserva(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton9;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
