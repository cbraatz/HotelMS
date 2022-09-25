
import Hiber1.Apeyciecaja;
import Hiber1.Arqueo;
import Hiber1.Caja;
import Hiber1.Documentos;
import Hiber1.Formapago;
import Hiber1.Moneda;
import Hiber1.Movcaja;
import Hiber1.NewHibernateUtil;
import Hiber1.Tipomov;
import Hiber1.Varios;
import Soporte.ConversionCientifica;
import Soporte.FunctionException;
import Soporte.MiDefaultTableModel;
import Soporte.clasesutiles;
import imp.ApeyciecajaGest;
import imp.ArqueoGest;
import imp.CajaGest;
import imp.MovCajaGest;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class FrmCajayArqueo extends javax.swing.JDialog {

    /** Creates new form FrmCajayArqueo */
    public FrmCajayArqueo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Apertura y Cierre de Caja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel5)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Valores en Caja", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

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
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir2.png"))); // NOI18N
        jButton9.setToolTipText("SALIR");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrarcaja2.png"))); // NOI18N
        jButton2.setToolTipText("CERRAR CAJA");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abrircaja2.png"))); // NOI18N
        jButton1.setToolTipText("ABRIR CAJA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, 0, 0, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    MiDefaultTableModel modelocaja = new MiDefaultTableModel(3);   //la columna 3 es editable
    MiDefaultTableModel modelocajacodigos = new MiDefaultTableModel();
    ArqueoGest arges=new ArqueoGest();
    ApeyciecajaGest ayccajages=new ApeyciecajaGest();
    clasesutiles cluti=new clasesutiles();
    Arqueo arque=new Arqueo();
    ConversionCientifica conv=new ConversionCientifica();
    public void CERRARSesion(){
        if(Sesion.isOpen()){
            Sesion.flush();
            Sesion.clear();
            Sesion.close();
        }
   }

public Formapago buscarFormaPago(int id){
     //////////////busca la forma de pago/////////////////////////
     Formapago formap=new Formapago();
//     Sesion=NewHibernateUtil.getSessionFactory().openSession();
//     Transaction tx1=Sesion.beginTransaction();
     formap=(Formapago)Sesion.get(Formapago.class, id);
//     tx1.commit();
//     CERRARSesion();
     return formap;
}

public Moneda buscarMoneda(int id){
     //////////////busca la  moneda/////////////////////////
     Moneda moneda=new Moneda();
 //    Sesion=NewHibernateUtil.getSessionFactory().openSession();
 //    Transaction tx2=Sesion.beginTransaction();
     moneda=(Moneda)Sesion.get(Moneda.class, id);
 //    tx2.commit();
 //    CERRARSesion();
     return moneda;
}

public void cargarTablaCajaApertura(){
    
    this.modelocaja = new MiDefaultTableModel();
    modelocaja.addColumn("Forma Caja   ");
    modelocaja.addColumn("Moneda        ");
    modelocaja.addColumn("Saldo Apertura");
    modelocaja.addColumn("Saldo Cierre");
    modelocaja.addColumn("Saldo Real");
    Sesion=NewHibernateUtil.getSessionFactory().openSession();
    Transaction tx=null;
    tx=Sesion.beginTransaction();
    Query q=Sesion.createQuery("from Caja");
    List li=q.list();
    int cont=li.size();
    for(int i=0;i<cont;i++){   //recorre el resultado y lo carga en un array de objeto
        Caja caja=new Caja();
        caja=(Caja)li.get(i);
        Object[] obj=new Object[5];
        obj[0]=caja.getFormapago().getDescripformapa();
        obj[1]=caja.getMoneda().getMoneda();
        obj[2]=this.conv.conversion2(caja.getMonto());
        obj[3]="";
        obj[4]="";
        modelocaja.addRow(obj);
    }
    tx.commit();
    CERRARSesion();
    this.jTable1.setModel(modelocaja);
}
    public void borrarCaja() throws Exception{ 
           if (arges.CajaVacia()==false){
                //////////////limpia las copias/////////////////////////
                Query q = Sesion.createQuery("from Caja");
                List lica=q.list();
                if(lica.size()>0){
                    for(int i=0;i<lica.size();i++){
                        Caja caja=new Caja();
                        caja=(Caja)lica.get(i);
                        Sesion.delete(caja);
                    }
                }
            }
    }
public void cargarTablaCajaCierre(int idapee){
    this.modelocaja = new MiDefaultTableModel(3); //la col 3 es editable
    this.modelocajacodigos = new MiDefaultTableModel();
    modelocajacodigos=arges.calcularSaldosCierre(idapee);//obtiene un modelo con los codigos de forma, moneda y el monto de ape y cierre
    modelocaja.addColumn("Forma Caja   ");
    modelocaja.addColumn("Moneda        ");
    modelocaja.addColumn("Saldo Apertura");
    modelocaja.addColumn("Saldo Cierre");
    modelocaja.addColumn("Saldo Real");
    for(int i=0;i<modelocajacodigos.getRowCount();i++){
        int codf=Integer.parseInt(modelocajacodigos.getValueAt(i, 0).toString());
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx=Sesion.beginTransaction();
        Formapago formapa=new Formapago();
        formapa=(Formapago)Sesion.get(Formapago.class, codf);
        tx.commit();
        CERRARSesion();
        int codm=Integer.parseInt(modelocajacodigos.getValueAt(i, 1).toString());
        Sesion=NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1=Sesion.beginTransaction();
        Moneda mone=new Moneda();
        mone=(Moneda)Sesion.get(Moneda.class, codm);
        tx1.commit();
        CERRARSesion();
        if(formapa!=null && mone!=null){
            Object[] obj=new Object[5];
            obj[0]= formapa.getDescripformapa();         //forma de caja
            obj[1]= mone.getMoneda();                      //moneda
            obj[2]= this.conv.conversion2(Float.parseFloat(modelocajacodigos.getValueAt(i, 2).toString()));  //monto apertura
            obj[3]= this.conv.conversion2(Float.parseFloat(modelocajacodigos.getValueAt(i, 3).toString()));
            obj[4]= this.conv.conversion2(Float.parseFloat(modelocajacodigos.getValueAt(i, 3).toString()));  //monto sistema
            modelocaja.addRow(obj);
        }
    }
    this.jTable1.setModel(modelocaja);
}

public void cargarAbrir(){
    cargarTablaCajaApertura();
    jButton1.setEnabled(true);
    jButton2.setEnabled(false);
}

public void cargarCerrar(){
    Apeyciecaja ape=new Apeyciecaja();
    ape=ayccajages.getmiapeyciecaja();
    cargarTablaCajaCierre(ape.getIdayccaja());
    jButton1.setEnabled(false);
    jButton2.setEnabled(true);
}
public void cerrarCaja() throws FunctionException{
     if(jButton2.isEnabled()){
           jTable1.editCellAt(0, 0);
           boolean valido=true;
           boolean valido2=true;
           boolean valido3=true;
           float sumatoria=0;
           Date fec=new Date();
           if(this.ayccajages.estaAbierta()){
               float monto=0;
               Apeyciecaja ape=new Apeyciecaja();
               ape=ayccajages.getmiapeyciecaja();
               int longi=modelocaja.getRowCount();
               for(int i=0;i<longi;i++){
                   System.out.println("longitud de la caja="+longi);
                    String strmonto=modelocaja.getValueAt(i,3).toString();
                    try{
                        monto=Float.parseFloat(strmonto);  //valida el monto, ya que tira error si no es valido
                        float montosis=Float.parseFloat(modelocaja.getValueAt(i,4).toString());  //saca el monto del sistema
                        int codf=Integer.parseInt(modelocajacodigos.getValueAt(i,0).toString());
                        sumatoria+=monto;
                        if(codf>1 && monto!=montosis)  //si no es efectivo no se debe permitir ingresar otro monto digerente al generado por el sistema
                            valido3=false;
                    }catch(NumberFormatException e){
                        e.printStackTrace();
                        valido=false;
                        break;
                    }
               }
               if(sumatoria==0 && valido){
                   int x=JOptionPane.showConfirmDialog(null,"Saldo de cierre es CERO ¿Desea continuar de todas formas?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                   if(x!=0)
                        valido2=false;
               }
               if(valido){
                   if(valido2){  //si se esta seguro que se desea cerrar
                       if(valido3){  //si no se cambio el saldo de un documento
                          Sesion=NewHibernateUtil.getSessionFactory().openSession();
                          Transaction tx=Sesion.beginTransaction();
                          try{
                              this.borrarCaja();
                              float diferencia=Float.parseFloat("0.0");
                              CajaGest cages=new CajaGest();
                              int codcaj=cages.getsiguientecodigo();
                              int codarq=arges.getsiguientecodigo();
                              for(int i=0;i<longi;i++){   //vuelvo a recorrer
                                 int idf=Integer.parseInt(modelocajacodigos.getValueAt(i, 0).toString());
                                 int idm=Integer.parseInt(modelocajacodigos.getValueAt(i, 1).toString());
                                 //////////////busca la forma de pago/////////////////////////
                                 Formapago forma=new Formapago();
                                 forma=this.buscarFormaPago(idf);
                                 //////////////busca la  moneda/////////////////////////
                                 Moneda moneda=new Moneda();
                                 moneda=buscarMoneda(idm);
                                 ///////////guarda arqueo///////////////
                                 if(this.arges.existeRegistroConFormaMonedaYApe(idf, idm, ape.getIdayccaja())){  //existe ese movimiento, sera verdadero si posee saldo de apertura, sino no
                                    arque=new Arqueo();
                                    arque=arges.getmiarqueo();
            //                        Sesion=NewHibernateUtil.getSessionFactory().openSession();
              //                      Transaction tx=Sesion.beginTransaction();
                                    monto=Float.parseFloat(modelocaja.getValueAt(i,3).toString());  //monto cierre
                                    arque.setMontoact(monto);
                                    monto=Float.parseFloat(modelocaja.getValueAt(i,4).toString());  //monto generado por el sistema
                                    arque.setMontoensis(monto);
                                    arque.setCotizacion(moneda.getVenta());
                                    diferencia=diferencia +((arque.getMontoensis()-arque.getMontoact())*moneda.getVenta());
                                    Sesion.saveOrUpdate(arque);
             //                       tx.commit();
             //                       CERRARSesion();
                                 }else{  //si no existe en arqueo debe crearse un nuevo registro en el mismo
                                     if(forma!=null && moneda!=null && moneda.getVenta()!=null){
                                         arque=new Arqueo();
                                         arque.setIdarq(codarq+i);
                                         arque.setFormapago(forma);
                                         arque.setMoneda(moneda);
                                         arque.setMontoant(Float.parseFloat("0.0"));
                                         arque.setApeyciecaja(ape);
                                         monto=Float.parseFloat(modelocaja.getValueAt(i,4).toString());  //monto generado por el sistema
                                         arque.setMontoensis(monto);
                                         monto=Float.parseFloat(modelocaja.getValueAt(i,3).toString());  //monto cierre
                                         arque.setMontoact(monto);
                                         arque.setCotizacion(moneda.getVenta());
                                         diferencia=diferencia +((arque.getMontoensis()-arque.getMontoact())*moneda.getVenta());
               //                          Sesion=NewHibernateUtil.getSessionFactory().openSession();
              //                           Transaction tx3=Sesion.beginTransaction();
                                         Sesion.save(arque);
               //                          tx3.commit();
               //                          CERRARSesion();
                                     }else{
                                          throw new FunctionException("Valor nulo encontrado");
                                     }
                                 }
                                 if(forma!=null && moneda!=null){  //guarda en caja
                                     if(monto>0 && codcaj>0){  //si el monto de cierre es mayor a 0 se guarda
                                        Caja caja=new Caja();
                                        caja.setIdcaja(codcaj+i);
                                        caja.setFormapago(forma);
                                        caja.setMoneda(moneda);
                                        caja.setMonto(monto);
                //                        Sesion=NewHibernateUtil.getSessionFactory().openSession();
                //                        Transaction tx4=Sesion.beginTransaction();
                                        Sesion.save(caja);
               //                         tx4.commit();
               //                         CERRARSesion();
                                     }
                                 }
                              }
                              MovCajaGest movcajages=new MovCajaGest();
                              //////////////busca la forma de pago/////////////////////////
                              Tipomov tipom=new Tipomov();
              //              Sesion=NewHibernateUtil.getSessionFactory().openSession();
               //               Transaction tx=Sesion.beginTransaction();
                              tipom=(Tipomov)Sesion.get(Tipomov.class, 3); //busca el tipo que corresponde a extraccion de caja que resta o saca ese saldo de caja para que quede vacia al cerrar
                    //          tx.commit();
                   //           CERRARSesion();

                              int codmov=movcajages.getsiguientecodigo();
                              for(int i=0;i<longi;i++){  //recorro otra vez para guardar  los movimientos en efectivo de caja por los saldos en caja, para volver a restaurarlos al abrir
                                int cf=Integer.parseInt(modelocajacodigos.getValueAt(i, 0).toString());
                                int cm=Integer.parseInt(modelocajacodigos.getValueAt(i, 1).toString());
                                float mon=Float.parseFloat(modelocaja.getValueAt(i, 3).toString());
                                if(cf==1){
                                    if(mon>0){
                                         Formapago forma=new Formapago();//////////////busca la forma de pago/////////////////////////
                                         forma=this.buscarFormaPago(cf);
                                         Moneda moneda=new Moneda();
                                         moneda=buscarMoneda(cm);//////////////busca la  moneda/////////////////////////
                                         if(forma!=null && moneda!=null && tipom!=null/* && codmov>0*/){
                                            Movcaja moca=new Movcaja();
                                            codmov++;
                                            float montogs=cluti.redondear(mon*moneda.getVenta());
                                            moca.setIdmov(codmov);
                                            moca.setMontomov(mon);
                                            moca.setFormapago(forma);
                                            moca.setMoneda(moneda);
                                            moca.setMontogs(montogs);
                                            moca.setFeyhomov(fec);
                                            moca.setTipomov(tipom);
                                            moca.setMontogscondesc(montogs);
                                            moca.setApeyciecaja(ape);
                                            moca.setObs("");
                                            moca.setNumcompro("");
                             //               Sesion=NewHibernateUtil.getSessionFactory().openSession();  //abro y cierro aca xq si hago afuera del form me tira session is close
                            //                Transaction tx2=Sesion.beginTransaction();
                                            Sesion.save(moca);
                              //              tx2.commit();
                             //               CERRARSesion();
                                        }
                                    }
                                 }
                              }

             //                Sesion=NewHibernateUtil.getSessionFactory().openSession();
              //               Transaction tx22=Sesion.beginTransaction();
                             Query q=Sesion.createQuery("from Documentos where encaja='1'");
                             List lis=q.list();
                             int lo=lis.size();
             //                int codmov=movcajages.getsiguientecodigo();
              //               if(codmov>0){
                             for(int i=0;i<lo;i++){
                                Documentos doc=new Documentos();
                                doc=(Documentos) lis.get(i);
                                Movcaja moca=new Movcaja();
                                codmov++;
                                float montogs=doc.getMonto()*doc.getMoneda().getVenta();
                                moca.setIdmov(codmov);  //xq sigue del de arriba
                                moca.setMontomov(doc.getMonto());
                                moca.setFormapago(doc.getFormapago());
                                moca.setMoneda(doc.getMoneda());
                                moca.setFeyhomov(fec);
                                moca.setMontogs(montogs);
                                moca.setTipomov(tipom);
                                moca.setDocumentos(doc);
                                moca.setMontogscondesc(montogs);
                                moca.setApeyciecaja(ape);
                                moca.setObs("");
                                moca.setNumcompro("");
                                //Sesion=NewHibernateUtil.getSessionFactory().openSession();
                                //Transaction tx1=Sesion.beginTransaction();
                                Sesion.save(moca);
                                //tx1.commit();
                                //CERRARSesion();
                              }
                   //           }
                //              tx22.commit();
                //              CERRARSesion();
                              ////////////actualiza varios////////////////
                              Varios varios=new Varios();
                //              Sesion=NewHibernateUtil.getSessionFactory().openSession();
                //              Transaction tx4=Sesion.beginTransaction();
                              varios=(Varios)Sesion.load(Varios.class, 1);
                              varios.setCajaabierta('0');
                //              tx4.commit();
                //              CERRARSesion();
                              ////////////actualiza apeyciecaja////////////////
                              Apeyciecaja ape2=new Apeyciecaja();
                   //           Sesion=NewHibernateUtil.getSessionFactory().openSession();
                   //           Transaction tx1=Sesion.beginTransaction();
                              ape2=ape;
                              ape2.setFeyhocie(fec);
                              ape2.setResult(diferencia*(-1));  //es *-1 para que sea negativo cuando falta
                              Sesion.saveOrUpdate(ape2);
                    //          tx1.commit();
                   //           CERRARSesion();
                              tx.commit();
                              JOptionPane.showMessageDialog(null,"Caja cerrada correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                              this.dispose(); //sale

                       }catch(Exception e){
                            tx.rollback();
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al cerrar la caja","ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                            e.printStackTrace();
                       }
                   }else
                    JOptionPane.showMessageDialog(null,"No está permitido cambiar el saldo de un valor de caja distinto al efectivo","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
               }
             }else
                 JOptionPane.showMessageDialog(null,"Al menos un Saldo de Cierre posee un formato numérico incorrecto","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
          }else
               JOptionPane.showMessageDialog(null,"Caja ya está cerrada","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
}
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // al iniciar
        this.setLocationRelativeTo(null);  //centra el objeto en pantalla
        this.setResizable(false);
     //   setDefaultCloseOperation(0);
        Sesion=NewHibernateUtil.getSessionFactory().getCurrentSession();
       // CERRARSesion();
        if(ayccajages.estaAbierta()==false)
            cargarAbrir();
        else
            cargarCerrar();
        
}//GEN-LAST:event_formWindowOpened

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
                                                                            // boton abrir caja
        if(jButton1.isEnabled() && ayccajages.estaAbierta()==false){
            if(this.arges.CajaVacia()){
                int x=JOptionPane.showConfirmDialog(null,"¿Desea abrir la caja con saldo CERO?","CONSULTA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if(x==0){
                        arges.abrirCaja();
                        JOptionPane.showMessageDialog(null,"Caja Abierta correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null,"Se recomienda generar movimientos de depósito en caja para contar con un saldo mayor a CERO en la misma","RECOMENDACIÓN",JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();//sale
                     }
            }else
                if(arges.abrirCaja())
                    JOptionPane.showMessageDialog(null,"Caja Abierta correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();//sale
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            // BOTON CERRAR CAJA
            cerrarCaja();
        } catch (FunctionException ex) {
            JOptionPane.showMessageDialog(null,"Valor nulo encontrado","ERROR",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyTyped

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
       /* if(jTextField1.getText().length()<60){
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                jTextField1.transferFocus();
        }    */    // TODO add your handling code here:
        //char cha=(char)10;
       /* java.awt.event.KeyEvent evento=null;
        evento.setKeyCode(10);
        jTable1KeyTyped(evento);*/
    }//GEN-LAST:event_jTable1FocusLost

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        //BOTON SALIR
        this.dispose();//sale
}//GEN-LAST:event_jButton9MouseClicked
    
   



    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCajayArqueo dialog = new FrmCajayArqueo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
