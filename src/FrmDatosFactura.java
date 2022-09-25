
import Hiber1.Empresa;
import Hiber1.NewHibernateUtil;
import Soporte.ConversionCientifica;
import Soporte.clasesutiles;
import imp.FacturaGest;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FrmDatosFactura extends javax.swing.JDialog {

    /** Creates new form FrmDatosFactura */
    public FrmDatosFactura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public FrmDatosFactura(java.awt.Frame parent, boolean modal, String NumFac, String NomYApe, String Ruc, String Direc, String Telef,float hos, float con, float desc, boolean PrimeraFac) {
        super(parent, modal);
        initComponents();
        this.descuento=desc;
        this.numfac=NumFac;
        this.nomyape=NomYApe;
        this.ruc=Ruc;
        this.direc=Direc;
        this.telef=Telef;
        this.valitem1=hos;
        this.valitem2=con;
        this.primerafac=PrimeraFac;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Datos a Imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Datos de la Factura a Imprimir", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Nro. Factura:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Nombre:");

        jTextField2.setToolTipText("DESCRIPCIÓN DEL RUBRO AL QUE ES APLICADO EL IMPUESTO");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Ruc:");

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Dirección:");

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Teléfono:");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Fecha Emisión:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTextField6.setText("Hospedaje");

        jTextField7.setText("0.0");
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });

        jTextField8.setText("Consumicion");

        jTextField9.setText("0.0");
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));

        jCheckBox1.setBackground(new java.awt.Color(204, 204, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("Imprimir en 2 facturas");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));

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

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Empresa:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCheckBox1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField9))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField7)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addComponent(jTextField5)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setName(""); // NOI18N

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    FacturaGest facges=new FacturaGest();
    clasesutiles cluti=new clasesutiles();
    String fechadehoy="";
    boolean aceptodatos=false;
    Session Sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
    //////////campos/////////////
    String numfac="";
    String nomyape="";
    String ruc="";
    String direc="";
    String telef="";
    float valitem1;
    float valitem2;
    float descuento;
    private final int NOMBRE_MAX_LEN=40;
    boolean ImprEn2Facturas=false;
    boolean primerafac=false;  // si es la primera factura muestra el checkbox que da la opcion de imprimir en 2 facturas
    String item1="Hospedaje";
    String item2="Consumicion";
    ///////////////para la busqueda interactiva empresa///////////////////////////////
    int xxx=0;  //posicion actual en el modelo
    int lo=0;  //longitud del modelo
    int co=0;
    String de="";
    boolean z=false;
    boolean cambiobusqueda=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
    DefaultTableModel mimodelo = new DefaultTableModel();
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
    public boolean getAceptodatos(){
        return this.aceptodatos;
    }
    public String getNumFac(){
        return this.numfac;
    }
    public String getNombre(){
        return this.nomyape;
    }
    public String getRuc(){
        return this.ruc;
    }
    public String getDireccion(){
        return this.direc;
    }
    public String getTelefono(){
        return this.telef;
    }
    public String getFechaEmision(){
        return this.jFormattedTextField1.getText();
    }
    public String getItem1(){
        return this.item1;
    }
    public String getItem2(){
        return this.item2;
    }
    public float getvalorItem1(){
        return this.valitem1;
    }
    public float getvalorItem2(){
        return this.valitem2;
    }
    /*public boolean getImprDatosDistintos(){
        return this.ImpDatosDistintos;
    }*/
    public boolean getImprEn2Facturas(){
        return this.ImprEn2Facturas;
    }

    public boolean montoValido(){
        if(this.jCheckBox1.isEnabled()&& this.jCheckBox1.isSelected()){ //si es la primera vez y se quiere imprimir 2 facturas solo controla que en la 1ra fac no se imprima todo el monto, sino que se deje algo para la 2da
            if((Float.parseFloat(this.jTextField7.getText())+Float.parseFloat(this.jTextField9.getText()))==(valitem1+valitem2-descuento)){ //si no se deja monto para la segunda factura
               int x=JOptionPane.showConfirmDialog(null,"¿El monto total ha sido asignado a la primera factura. Desea imprimir una sola factura?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
               if(x==0){
                    this.jCheckBox1.setSelected(false);
                    return true;
               }else{
                   JOptionPane.showMessageDialog(null,"Debe especificar un monto inferior al total","AVISO",JOptionPane.INFORMATION_MESSAGE);
                   return false;
                }
            }else{
                if((Float.parseFloat(this.jTextField7.getText())+Float.parseFloat(this.jTextField9.getText()))<(valitem1+valitem2-descuento))
                    return true;  //si el monto ingresado es menor al total
                else
                    return false; //si el monto ingresado es mayor al total
            }
        }else{
            if((Float.parseFloat(this.jTextField7.getText())+Float.parseFloat(this.jTextField9.getText()))==(valitem1+valitem2-descuento)){  //si la sumatoria de los 2 campos es igual al monto de hosp y cons iniciales y si el primero es mayor a 0
                return true;
            }else
                return false;
        }
    }
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        //BOTON GUARDAR

}//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(Float.parseFloat(this.jTextField7.getText())>0){  //si el primer monto es mayor a 0
           if(montoValido()){
               int x=JOptionPane.showConfirmDialog(null,"¿Imprimir estos datos?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
               if(x==0){
                    this.numfac=this.jTextField1.getText();
                    this.nomyape=this.jTextField2.getText();
                    this.ruc=this.jTextField3.getText();
                    this.direc=this.jTextField4.getText();
                    this.telef=this.jTextField5.getText();
                    this.fechadehoy=this.jFormattedTextField1.getText();
                    this.item1=this.jTextField6.getText();
                    this.item2=this.jTextField8.getText();
                    this.valitem1=Float.parseFloat(this.jTextField7.getText());
                    this.valitem2=Float.parseFloat(this.jTextField9.getText());
                    if(this.jCheckBox1.isSelected() && this.jCheckBox1.isEnabled())
                        this.ImprEn2Facturas=true;
                 /* if(this.jCheckBox2.isSelected())
                        this.ImpDatosDistintos=true;*/
                    this.aceptodatos=true;
                    this.dispose();
                }
            }else
              JOptionPane.showMessageDialog(null,"Los montos ingresados no coinciden con el total","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }else
             JOptionPane.showMessageDialog(null,"El primer monto debe ser mayor a CERO","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        //BOTON SALIR
        this.dispose();//sale
}//GEN-LAST:event_jButton9MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setResizable(false);                                    //AL CARGARSE EL FORMULARIO
        this.setLocationRelativeTo(null);  //centra el objeto en pantalla
       // setDefaultCloseOperation(0);
        this.actualizarFechaDeHoy();
        ConversionCientifica conv=new  ConversionCientifica();
        this.jLabel8.setText("Total: "+conv.conversion(valitem1+valitem2));
        this.jLabel9.setText("Descuento: -"+conv.conversion(descuento));
        this.jTextField1.setText(this.numfac);
        if(this.nomyape.length()>NOMBRE_MAX_LEN){
            this.nomyape=nomyape.substring(NOMBRE_MAX_LEN-1);
        }
        this.jTextField2.setText(this.nomyape);
        this.jTextField3.setText(this.ruc);
        this.jTextField4.setText(this.direc);
        this.jTextField5.setText(this.telef);
        this.jTextField7.setText(valitem1+"");
        this.jTextField9.setText(valitem2+"");
        this.jFormattedTextField1.setText(cluti.ObtenerFechaSinGuion(this.fechadehoy));
        this.jCheckBox1.setEnabled(this.primerafac);
    }//GEN-LAST:event_formWindowOpened

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged

    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        if(jTextField9.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField9.getText());
                if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField9.setText("0.0");
                    jTextField9.requestFocus();
                }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número decimal incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField9.setText("0.0");
                jTextField9.requestFocus();
            }
        }
        else
        jTextField9.setText("0.0");
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        if(jTextField7.getText().isEmpty()==false){   //si no esta vacio
            try{
                float fl=Float.parseFloat(jTextField7.getText());
                if(fl<0){
                    JOptionPane.showMessageDialog(null,"No se admiten números negativos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    jTextField7.setText("0.0");
                    jTextField7.requestFocus();
                }
            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Número decimal incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                jTextField7.setText("0.0");
                jTextField7.requestFocus();
            }
        }
        else
        jTextField4.setText("0.0");
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        if(jTextField3.getText().length()<=18){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField3.transferFocus();
        }
        else
        evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        //para validar el CAMPO DE TEXTO dirección
        if(jTextField4.getText().length()<=45){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField4.transferFocus();
        }
        else
        evt.consume();
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped

        if(jTextField3.getText().length()<=10){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField3.transferFocus();
        }
        else
        evt.consume();
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(this.jTextField1.getText().isEmpty()==false){
            if(this.facges.esValidoNumFact(this.jTextField1.getText())==false){
                JOptionPane.showMessageDialog(null,"Número de factura incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                this.jTextField1.requestFocus();
            }
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        //para validar el CAMPO DE TEXTO dirección
        if(jTextField2.getText().length()<=NOMBRE_MAX_LEN){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField2.transferFocus();
        }
        else
        evt.consume();
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
        //busq interactiva clie
        jTextField11.selectAll();
        xxx=0;
        lo=0;
        co=0;
        de="";
        z=false;
        cambiobusqueda=false;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        mimodelo = new DefaultTableModel();
    }//GEN-LAST:event_jTextField11FocusGained

    private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
        if(cambiobusqueda){                                           //lost de la busqueda interactiva clie
            String codemp="";
            Transaction tx=null;
            if(mimodelo.getRowCount()>0){
                codemp=mimodelo.getValueAt(xxx, 0).toString();
                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                tx=Sesion.beginTransaction();
                Empresa empresa=(Empresa)Sesion.get(Empresa.class, Integer.parseInt(codemp));
                if(empresa!=null){                    //si se encontro el pais
                    jTextField2.setText(empresa.getDescri());
                    jTextField3.setText(empresa.getRuc());
                } 
                CERRARSesion();
            } 
        }
    }//GEN-LAST:event_jTextField11FocusLost

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        String texto=jTextField11.getText();                             //PARA BUSQUEDA INTERACTIVA de empresa
        Transaction tx2=null;
        cambiobusqueda=true;//detecta si se hizo una busqueda o si solo se entro a la caja de texto
        if(((int)evt.getKeyChar()) == 10){ //si se presiono enter
            jTextField11.transferFocus();
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
                jTextField11.setText(de);
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
                        jTextField11.setText(de);
                    }
                } else{
                    z=false;
                    try{
                        Sesion = NewHibernateUtil.getSessionFactory().openSession();
                        tx2=Sesion.beginTransaction();
                        Query q13=Sesion.createQuery("from Empresa where (descri like'"+"%" +texto+"%"+ "') ");
                        mimodelo = new DefaultTableModel();
                        mimodelo.addColumn("Código");
                        mimodelo.addColumn("Descripción");
                        List milis= q13.list();
                        tx2.commit();
                        CERRARSesion();
                        for (int i=0;i<milis.size();i++){
                            Empresa cc=(Empresa)milis.get(i);
                            Object [] ffi = new Object[2]; // Hay dos columnas en la tabla
                            ffi[0] = cc.getIdempresa();
                            ffi[1] = cc.getDescri();
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
    }//GEN-LAST:event_jTextField11KeyReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDatosFactura dialog = new FrmDatosFactura(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
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
