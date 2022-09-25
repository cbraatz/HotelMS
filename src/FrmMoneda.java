
import Hiber1.Moneda;
import Hiber1.NewHibernateUtil;
import Hiber1.Pais;
import Soporte.MiDefaultTableModel;
import imp.ArqueoGest;
import imp.CajaGest;
import imp.DocumentoGest;
import imp.MonedaGest;
import imp.MovCajaGest;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class FrmMoneda extends javax.swing.JDialog {

    public FrmMoneda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
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

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Tabla de cotizaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

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
        jTable1.setToolTipText("TABLA DE COTIZACIONES");
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setName(""); // NOI18N

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

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar2.png"))); // NOI18N
        jButton8.setToolTipText("LIMPIAR");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Datos de la Moneda/Cotización", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Moneda:");

        jTextField1.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("CÓDIGO DE LA MONEDA");
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

        jTextField2.setToolTipText("DESCRIPCIÓN DE LA MONEDA");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setText("0.0");
        jTextField3.setToolTipText("PRECIO COMPRA");
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
        jTextField4.setToolTipText("PRECIO VENTA");
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

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Compra:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Venta:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Gs.");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Gs.");

        jComboBox1.setToolTipText("PAIS");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("País:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addComponent(jComboBox1, 0, 219, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setToolTipText("TIPO DE MOVIMIENTOS QUE PUEDEN DARSE EN CAJA");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Moneda/Cotización");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
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
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    MiDefaultTableModel modelo1 = new MiDefaultTableModel();  //contiene la moneda, compra y venta
    MiDefaultTableModel modelo2 = new MiDefaultTableModel();  //contiene el codigo de la moneda y el codigo del pais
    DefaultComboBoxModel modelocombopais1=new DefaultComboBoxModel();  //guarda la descripcion del pais
    DefaultComboBoxModel modelocombopais2=new DefaultComboBoxModel(); //guarda el codigo del pais
    Session sesion=null;
    Moneda moneda=new Moneda();
    MonedaGest monges=new MonedaGest();
    MovCajaGest mcajages=new MovCajaGest();
    DocumentoGest docges=new DocumentoGest();
    CajaGest cajages=new CajaGest();
    ArqueoGest arges=new ArqueoGest();
    Pais pais=new Pais();
    boolean encontrado=false;

    public void CERRARSesion(){
       if(this.sesion.isOpen()){
          sesion.clear();
          sesion.close();
       }
    }

    public void ubicarComboPaisPorCodigo(int cod){
        int lon=this.modelocombopais2.getSize();
        for(int i=0;i<lon;i++){
            int codi=Integer.parseInt(modelocombopais2.getElementAt(i).toString());
            if(codi==cod){
                this.jComboBox1.setSelectedIndex(i);  //ubica el combo en la posicion correcta
                break;
            }
        }
   }

    public void ubicarComboPaisPorPosicion(int posi){
        this.jComboBox1.setSelectedIndex(posi-1);  //porque empieza de CERO
   }

    public void cargarComboPais(){
        Transaction tx=null;
        sesion=NewHibernateUtil.getSessionFactory().openSession();
        try{
            tx=sesion.beginTransaction();
            modelocombopais1= new DefaultComboBoxModel();
            modelocombopais2= new DefaultComboBoxModel();
            Query q=sesion.createQuery("from Pais order by descrippais");
            List lis= q.list();
            if(q.list().size()>0){
                for (int i=0;i<lis.size();i++){
                    pais=new Pais();
                    pais=(Pais)lis.get(i);
                    modelocombopais1.addElement(pais.getDescrippais());
                    modelocombopais2.addElement(pais.getIdpais());
                }
            }
            jComboBox1.setModel(modelocombopais1);
            tx.commit();
            this.obtenerObjetoPaisDeCombo();
            CERRARSesion();
       }catch(HibernateException e){
           tx.rollback();
            e.printStackTrace();
       }
        CERRARSesion();
   }
    public int obtenerCodigoActualDeComboPais(){
        int resu=0;
        resu=Integer.parseInt(modelocombopais2.getElementAt(this.jComboBox1.getSelectedIndex()).toString());
        return resu;
   }

   public boolean obtenerObjetoPaisDeCombo(){
       boolean resp=false;
       try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx=sesion.beginTransaction();
            pais=new Pais();
            pais=(Pais)sesion.get(Pais.class, obtenerCodigoActualDeComboPais());
            tx.commit();
            this.CERRARSesion();
            if(pais!=null)
                resp= true;
            else
                resp= false;
       } catch (HibernateException e) {
           e.printStackTrace();
       }
       return resp;
   }

    public void cargarTablaMoneda(){
        modelo1 = new MiDefaultTableModel();
        modelo2 = new MiDefaultTableModel(); //limpia los modelos
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Moneda where idmoneda >1 order by moneda");
        modelo1.addColumn("Moneda");
        modelo1.addColumn("Compra Gs.");
        modelo1.addColumn("Venta Gs.");
        modelo2.addColumn("idMoneda");
        modelo2.addColumn("idPais");
        for(int i=0;i<q.list().size();i++){
            moneda=new Moneda();
            moneda=(Moneda)q.list().get(i);
            Object[] obj1=new Object[3];
            Object[] obj2=new Object[2];
            obj1[0]=moneda.getMoneda();
            obj1[1]=moneda.getCompra();
            obj1[2]=moneda.getVenta();
            obj2[0]=moneda.getIdmoneda();
            obj2[1]=moneda.getPais().getIdpais();
            modelo1.addRow(obj1);
            modelo2.addRow(obj2);
        }
        sesion.getTransaction().commit();
        CERRARSesion();
        this.jTable1.setModel(modelo1);
        this.jTable1.getColumn("Compra Gs.").setMaxWidth(150);
        this.jTable1.getColumn("Venta Gs.").setMaxWidth(150);
        ubicarComboPaisPorPosicion(1);
    }
    public void LimpiarCampos(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("0.0");
        jTextField4.setText("0.0");
        ubicarComboPaisPorPosicion(1);  //ubica el combo en el primer elemento
        cargarTablaMoneda();

    }

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
                                                                    //CAMPO DE TEXTO ID/CODIGO
        if(jTextField1.getText().isEmpty()==false){
            encontrado=monges.ExisteIdEnTabla(Integer.parseInt(jTextField1.getText()));
            if(encontrado){
                moneda=new Moneda();
                moneda=monges.getObjMoneda();
               // jTextField1.setText(Integer.toString(moneda.getIdmoneda()));
                jTextField2.setText(moneda.getMoneda());
                this.ubicarComboPaisPorCodigo(moneda.getPais().getIdpais());
                jTextField3.setText(Float.toString(moneda.getCompra()));
                jTextField4.setText(Float.toString(moneda.getVenta()));
            } else {
                JOptionPane.showMessageDialog(null,"Código NO encontrado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                LimpiarCampos();
                moneda=new Moneda();
                encontrado=false;
            }
        } else{
            LimpiarCampos();
            moneda=new Moneda();
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
                //evt.setKeyChar((char)119);
                jTextField1.transferFocus();
            else
                evt.consume();
        }
}//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if(jTextField2.getText().length()>=30)   //para la validacion
            evt.consume();
}//GEN-LAST:event_jTextField2KeyTyped

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        int c=0;  //almacena el sig codigo                            //BOTON NUEVO
        c=monges.getsiguientecodigo();
        LimpiarCampos();
        if (c>0){
            jTextField1.setText(Integer.toString(c));
            jTextField2.requestFocus();
        } else{
            jTextField1.setText("");
            JOptionPane.showMessageDialog(null,"No se pudo obtener un Código nuevo","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
}//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
                                                                        //BOTON GUARDAR
        moneda=new Moneda();
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()){ //si el campo id o descripcion estan vacios
           JOptionPane.showMessageDialog(null,"Campos clave vacíos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            encontrado=false;
        } else{
            if(Integer.parseInt(this.jTextField1.getText())>1){
                if(Float.parseFloat(jTextField3.getText())*Float.parseFloat(jTextField4.getText())>0){  //si ninguno de los 2 es 0
                    encontrado=monges.ExisteIdEnTabla(Integer.parseInt(jTextField1.getText()));
                    int r=0;
                    boolean resu=false;
                    boolean paisencontrado=this.obtenerObjetoPaisDeCombo();
                    if(paisencontrado){
                        if (encontrado){  //si se encontro y se desea EDITAR
                            r=JOptionPane.showConfirmDialog(null,"¿Desea EDITAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                            if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                                //si se presiono SI
                                if(obtenerObjetoPaisDeCombo()){
                                    moneda=monges.getObjMoneda();
                                    moneda.setMoneda(jTextField2.getText().toUpperCase());
                                    moneda.setCompra(Float.parseFloat(jTextField3.getText()));
                                    moneda.setVenta(Float.parseFloat(jTextField4.getText()));
                                    moneda.setPais(pais);
                                    resu=monges.editMoneda(moneda);
                                    if (resu){  //SI SE EDITO CORRECTAMENTE
                                        JOptionPane.showMessageDialog(null,"El registro fue EDITADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                        LimpiarCampos();
                                    } else{
                                        JOptionPane.showMessageDialog(null,"No se pudo EDITAR correctamente el registro","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }else
                                    System.out.println("no se encontro pais");
                            }
                        } else{  //agrega
                            r=JOptionPane.showConfirmDialog(null,"¿Desea AGREGAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                            if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                                if(this.monges.ExisteMonedaCargadaConPais(pais.getIdpais())==false){
                                    int idmon=monges.getsiguientecodigo();
                                    if(obtenerObjetoPaisDeCombo() && idmon>0){
                                        moneda.setIdmoneda(idmon);
                                        moneda.setMoneda(jTextField2.getText().toUpperCase());
                                        moneda.setCompra(Float.parseFloat(jTextField3.getText()));
                                        moneda.setVenta(Float.parseFloat(jTextField4.getText()));
                                        moneda.setPais(pais);
                                        resu=monges.addMoneda(moneda);
                                        if (resu){
                                            JOptionPane.showMessageDialog(null,"El registro fue CARGADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                            LimpiarCampos();
                                        } else{
                                            JOptionPane.showMessageDialog(null,"No se pudo CARGAR correctamente el registro","AVISO",JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                } else{
                                     JOptionPane.showMessageDialog(null,"No se permite cargar más de una moneda por país, si desea, puede editarla","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                                     //System.out.println(pais.getIdpais());
                                }
                            }
                        }
                    }else
                        JOptionPane.showMessageDialog(null,"El país no pudo ser encontrado","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    this.cargarTablaMoneda();
                }else
                    JOptionPane.showMessageDialog(null,"El valor de compra y venta deben ser mayores a 0 (CERO)","AVISO",JOptionPane.INFORMATION_MESSAGE);
            } else
                JOptionPane.showMessageDialog(null,"No está permitido modificar este registro","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
}//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        int r=0;                                                     //BOTON BORRAR
        boolean resu=false;
        encontrado=monges.ExisteIdEnTabla(Integer.parseInt(jTextField1.getText()));
        if (encontrado && jTextField1.getText().isEmpty()==false){
            if(Integer.parseInt(this.jTextField1.getText())>1){
                r=JOptionPane.showConfirmDialog(null,"¿Desea BORRAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                    int cod=Integer.parseInt(jTextField1.getText());
                    if (mcajages.ExisteFKMoneda(cod)==false && docges.ExisteFKMoneda(cod)==false && cajages.ExisteFKMoneda(cod)==false && arges.ExisteFKMoneda(cod)==false){  //si no esta como FK en movimiento de caja
                        moneda=new Moneda();
                        moneda=monges.getObjMoneda();
                        resu=monges.delMoneda(moneda);
                        if (resu){  //SI SE borro CORRECTAMENTE
                            JOptionPane.showMessageDialog(null,"El registro fue BORRADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            LimpiarCampos();
                        } else
                            JOptionPane.showMessageDialog(null,"No se pudo BORRAR correctamente el registro","AVISO",JOptionPane.INFORMATION_MESSAGE);
                    } else
                        JOptionPane.showMessageDialog(null,"No se pudo BORRAR el registro porque está siendo utilizado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                }
           }else
                JOptionPane.showMessageDialog(null,"No está permitido borrar este registro","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null,"Favor seleccionar un elemento a borrar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);

        this.cargarTablaMoneda();
}//GEN-LAST:event_jButton7MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
                                                                    //BOTON SALIR
        this.dispose();//sale
}//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
                                                                        //BOTON LIMPIAR
        LimpiarCampos();
}//GEN-LAST:event_jButton8MouseClicked

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained

        jTextField3.selectAll();
}//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost

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
        if(jTextField3.getText().length()>=15)
            evt.consume();
}//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
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
        if(((int)evt.getKeyChar()) == 10) //si se presiono enter
            jTextField4.transferFocus();
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if(jTextField4.getText().length()>=15)
            evt.consume();
    }//GEN-LAST:event_jTextField4KeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                                                                    //AL INICIARSE EL FORM
        this.setResizable(false);
        this.setLocationRelativeTo(null);  //centra el objeto en pantalla
      //  setDefaultCloseOperation(0);
        sesion=NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.cargarComboPais();
        this.cargarTablaMoneda();
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
                                                                    // CLICK EN LA GRILLA
        int fila=jTable1.rowAtPoint(evt.getPoint());
        String codigo=modelo2.getValueAt(fila, 0)+""; //extrae el contenido de la tabla
        jTextField1.setText(codigo);   //completa los cuadros de texto
        jTextField1.requestFocus();
        jTextField1.transferFocus();
    }//GEN-LAST:event_jTable1MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmMoneda dialog = new FrmMoneda(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
