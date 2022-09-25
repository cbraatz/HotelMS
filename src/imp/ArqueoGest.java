package imp;
  
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
import Soporte.MiDefaultTableModel;
import Soporte.clasesutiles;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ArqueoGest {

    public void ArqueoGest() {
        this.sesion=NewHibernateUtil.getSessionFactory().getCurrentSession();
    }

    Session sesion = null;
    Arqueo miarqueo=new Arqueo();
    Date fechaultimaapertura=null;
    clasesutiles cluti=new clasesutiles();
   public Date getfechaultimaapertura(){
        return this.fechaultimaapertura;
   }
   public void CERRARSesion(){
        if(sesion.isOpen()){
            sesion.flush();
            sesion.clear();
            sesion.close();
        }
   }
   
   public Arqueo getmiarqueo(){
        return this.miarqueo;
   }

   public boolean ExisteFKFormapago(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Arqueo where idforma = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }
    public boolean ExisteFKMoneda(int id){
        sesion = NewHibernateUtil.getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        Query q=sesion.createQuery("from Arqueo where idmoneda = "+Integer.toString(id));
        if(q.list().isEmpty()==false)
            return true;
        else
            return false;
    }
   public boolean CajaVacia(){  //devuelve verdadero si caja esta vacia
       sesion=NewHibernateUtil.getSessionFactory().openSession();
       Transaction tx=null;
       tx=sesion.beginTransaction();
       Query q=sesion.createQuery("from Caja");
       int cont=q.list().size();
       tx.commit();
       CERRARSesion();
       if (cont>0)
           return false;
       else
           return true;
  }
   public boolean ArqueoVacio(){  //devuelve verdadero si arqueo esta vacio
       sesion=NewHibernateUtil.getSessionFactory().openSession();
       Transaction tx=null;
       tx=sesion.beginTransaction();
       Query q=sesion.createQuery("from Arqueo");
       int cont=q.list().size();
       tx.commit();
       CERRARSesion();
       if (cont>0)
           return false;
       else
           return true;
  }

 public boolean abrirCaja(){
           boolean respu=false;
           sesion=NewHibernateUtil.getSessionFactory().openSession();
           Transaction tx=sesion.beginTransaction();
           try{
                ApeyciecajaGest ayccajages=new ApeyciecajaGest();
                int codap=ayccajages.getsiguientecodigo();
                if(codap>0){
                    Date fec=new Date();
                    Apeyciecaja apeycie=new Apeyciecaja();
                    apeycie.setIdayccaja(codap);
                    apeycie.setFeyhoape(fec);
                    sesion.save(apeycie);
//                    tx.commit();
//                    CERRARSesion();
//                    sesion=NewHibernateUtil.getSessionFactory().openSession();
//                    Transaction tx1=sesion.beginTransaction();
                    Query q=sesion.createQuery("from Caja");  //selecciona de caja cuando no sea copia
                    List listacaja=q.list();
//                    tx1.commit();
//                    CERRARSesion();
                    if(listacaja.size()>0){   //atender que si no queda nada en caja despues del cierre, el arqueo queda vacio por ese cierre de caja
                        for(int i=0;i<listacaja.size();i++){
                            Caja caja=new Caja();
                            caja=(Caja)listacaja.get(i);
                            //////////////busca la forma de pago/////////////////////////
                            Formapago forma=caja.getFormapago();
                            //////////////busca la forma de moneda/////////////////////////
                            Moneda moneda=caja.getMoneda();
                            int codarq=this.getsiguientecodigo2();
                            if(forma!=null && moneda!=null/* && codarq>0*/){
                                Arqueo arque=new Arqueo();
                                arque.setIdarq(codarq);
                                arque.setFormapago(forma);
                                arque.setMoneda(moneda);
                                arque.setMontoant(caja.getMonto());
                                arque.setMontoact(Float.parseFloat("0.0"));    //cero para que no quede null
                                arque.setMontoensis(Float.parseFloat("0.0"));  //cero para que no quede null
                                arque.setApeyciecaja(apeycie);
 //                               sesion=NewHibernateUtil.getSessionFactory().openSession();
 //                               Transaction tx2=sesion.beginTransaction();
                                sesion.save(arque);
  //                              tx2.commit();
   //                             CERRARSesion();
                             }
                          }
                          MovCajaGest movcajages=new MovCajaGest();
                          //////////////busca la forma de pago/////////////////////////
                          Tipomov tipom=new Tipomov();
//                          sesion=NewHibernateUtil.getSessionFactory().openSession();
//                          Transaction tx5=sesion.beginTransaction();
                          tipom=(Tipomov)sesion.get(Tipomov.class, 4); //busca el tipo que corresponde a extraccion de caja que resta o saca ese saldo de caja para que quede vacia al cerrar
//                          tx5.commit();
 //                         CERRARSesion();
 //                         sesion=NewHibernateUtil.getSessionFactory().openSession();
  //                        Transaction tx6=sesion.beginTransaction();
                       //   Query qq=sesion.createQuery("from Caja");
                        //  List lis=qq.list();
                          int codmov=movcajages.getsiguientecodigo();
                          int longi=listacaja.size();
                          for(int i=0;i<longi;i++){  //recorro otra vez para guardar  los movimientos en efectivo de caja por los saldos en caja, para volver a restaurarlos al abrir
                            Caja caja=new Caja();
                            caja=(Caja)listacaja.get(i);
                            int cf=caja.getFormapago().getIdforma();
                            //int cm=caja.getMoneda().getIdmoneda();
                            float mon=caja.getMonto();
                            if(cf==1){  //si es efectivo
                                 if(tipom!=null/* && codmov>0*/){
                                    Movcaja moca=new Movcaja();
                                    codmov++;
                                    float gs=cluti.redondear(mon*caja.getMoneda().getVenta());
                                    moca.setIdmov(codmov);
                                    moca.setMontomov(mon);
                                    moca.setMontogs(gs);
                                    moca.setMontogscondesc(gs);
                                    moca.setFormapago(caja.getFormapago());
                                    moca.setMoneda(caja.getMoneda());
                                    moca.setFeyhomov(fec);
                                    moca.setTipomov(tipom);
                                    moca.setApeyciecaja(apeycie);
                                    moca.setObs("");
                                    moca.setNumcompro("");
                                    //sesion=NewHibernateUtil.getSessionFactory().openSession();
                                    //Transaction tx2=sesion.beginTransaction();
                                    sesion.save(moca);
                                   // tx2.commit();
                                   // CERRARSesion();
                                }
                             }
                          }
 //                         tx6.commit();
  //                        CERRARSesion();
  //                       sesion=NewHibernateUtil.getSessionFactory().openSession();
  //                       Transaction tx2=sesion.beginTransaction();
                         Query q1=sesion.createQuery("from Documentos where encaja='1'");
                         List lis2=q1.list();
                        
                         int lo=lis2.size();
                  //       codmov=movcajages.getsiguientecodigo();
            //             if(codmov>0){   //si se agrega nuevo
                         for(int i=0;i<lo;i++){
                            Documentos doc=new Documentos();
                            doc=(Documentos) lis2.get(i);
                            Movcaja moca=new Movcaja();
                            codmov++;
                            moca.setIdmov(codmov);  // sigue del de arriba
                            moca.setMontomov(doc.getMonto());
                            moca.setFormapago(doc.getFormapago());
                            moca.setMoneda(doc.getMoneda());
                            float gs=cluti.redondear(doc.getMonto()*doc.getMoneda().getVenta());
                            moca.setMontogs(gs);
                            moca.setMontogscondesc(gs);
                            moca.setFeyhomov(fec);
                            moca.setTipomov(tipom);
                            moca.setDocumentos(doc);
                            moca.setApeyciecaja(apeycie);
                            moca.setObs("");
                            moca.setNumcompro("");
                           // sesion=NewHibernateUtil.getSessionFactory().openSession();
                           // Transaction tx3=sesion.beginTransaction();
                            sesion.save(moca);
                            //tx3.commit();
                            //CERRARSesion();
                        }
              //            }
 //                       tx2.commit();
  //                      CERRARSesion();
  //                      sesion=NewHibernateUtil.getSessionFactory().openSession();
  //                      Transaction tx4=sesion.beginTransaction();
                        Varios varios=new Varios();
                        varios=(Varios)sesion.get(Varios.class, 1);
                        varios.setCajaabierta('1');
                        sesion.update(varios);
  //                      tx4.commit();
 //                       CERRARSesion();
                        respu = true;   
                        //JOptionPane.showMessageDialog(null,"Éxito al abrir Caja","AVISO",JOptionPane.INFORMATION_MESSAGE);
                    }
                    tx.commit();
                }
       }catch(HibernateException e){
           tx.rollback();
           e.printStackTrace();
           respu=false;
       }
       return respu;
  }

public Object[][] calcularSaldosEnCaja(int codap){  //calcula el saldo en caja, lo hago para poder abrir la caja, lo mas sencillo seria utilizar Caja en vez del objeto, pero si es la primera vez utilizo un objeto para esto y entonces debo crear el objeto para utilizarlo despues
       sesion=NewHibernateUtil.getSessionFactory().openSession();
       Transaction tx=null;
       tx=sesion.beginTransaction();
       //SQLQuery q=sesion.createSQLQuery("select x2.idforma, x2.idmoneda,sum(monto)as suma from(select x.idforma, x.idmoneda, if(x.credito=0,x.montomov,x.montomov*-1) as monto from(select m.idforma, m.idmoneda, m.montomov, t.credito from Movcaja as m, Tipomov as t where m.idayccaja= "+codap+" and m.idtipomov = t.idtipomov order by m.idforma, m.idmoneda)as x)as x2 group by x2.idforma,x2.idmoneda");  //le agregue otro if porque tomaba el monto que se ingresaba a caja como tipo 4(apertura de caja) como un movimiento mas de caja, cosa que no es asi
       SQLQuery q=sesion.createSQLQuery("select x2.idforma, x2.idmoneda,sum(monto)as suma from(select x.idforma, x.idmoneda, if(x.credito=0,if(x.idtipomov = 4, 0.0,x.montomov),x.montomov*-1) as monto from(select m.idforma, m.idmoneda, m.montomov, t.credito, t.idtipomov from Movcaja as m, Tipomov as t where m.idayccaja= "+codap+" and m.idtipomov = t.idtipomov order by m.idforma, m.idmoneda)as x)as x2 group by x2.idforma,x2.idmoneda");
       int cont=q.list().size();
       List li=q.list();
       tx.commit();
       CERRARSesion();
       Object[][]obj=new Object[cont][3];
       for(int i=0;i<cont;i++){   //recorre el resultado y lo carga en un array de objeto
           Object[]objeto=new Object[3];
           objeto=(Object[])li.get(i);
           obj[i][0]=objeto[0];
           obj[i][1]=objeto[1];
           obj[i][2]=objeto[2];
       }
       return obj;
}
public MiDefaultTableModel calcularSaldosCierre(int codape){  //calcula el saldo en movcaja
       MiDefaultTableModel mod=new MiDefaultTableModel();
       mod.addColumn("idforma");
       mod.addColumn("idmoneda");
       mod.addColumn("saldo apertura");
       mod.addColumn("saldo real");
       sesion=NewHibernateUtil.getSessionFactory().openSession();
       Transaction tx=null;
       tx=sesion.beginTransaction();
       SQLQuery q=sesion.createSQLQuery("select a.idforma, a.idmoneda, a.montoant from Arqueo as a, Apeyciecaja as p where p.idayccaja=a.idayccaja and p.idayccaja = "+codape);  //busca de arqueo, es decir los que figuran en la apertura de caja
                                                                          //busca los registros de arqueo de la sesion de caja abierta
       List li=q.list();
       tx.commit();
       CERRARSesion();
       for(int i=0;i<li.size();i++){  //carga al modelo
            Object[] objq=new Object[3];  //guarda el resultado del query
            Object[] objm=new Object[4];  //guarda lo que se agrega al modelo
            objq=(Object[])li.get(i);
            objm[0]=objq[0];
            objm[1]=objq[1];
            objm[2]=objq[2];
            objm[3]="0.0";
            mod.addRow(objm);
       }
       Object[][] objr=this.calcularSaldosEnCaja(codape);
       if(objr.length>0 && mod.getRowCount()>0){
           for(int i=0;i<objr.length;i++){  //recorro objeto resultado
               int cfr=Integer.parseInt(objr[i][0].toString());  //codigo forma en obj resultado
               int cmr=Integer.parseInt(objr[i][1].toString());  //codigo moneda en obj resultado
               float monr=Float.parseFloat(objr[i][2].toString());  //codigo forma en obj resultado
               boolean exi=false;
               for(int j=0;j<mod.getRowCount();j++){
                    int cfm=Integer.parseInt(mod.getValueAt(j, 0).toString());  //codigo forma en modelo
                    int cmm=Integer.parseInt(mod.getValueAt(j, 1).toString());  //codigo moneda en modelo
                    float monm=Float.parseFloat(mod.getValueAt(j, 2).toString());  //monto de apertura
                    if(cfr==cfm && cmr==cmm){  // si existe esa forma y moneda en el resultado y en el modelo
                        exi=true;

                        mod.setValueAt(monm+monr, i, 3);  //suma el monto de apertura con el de cierre del sistema, que puede ser negativo, entonces resta
                        break;
                    }
               }
               if(exi==false){  //si existe en el resultado y no en el modelo
                    Object[] objm=new Object[4];
                    objm[0]=cfr;
                    objm[1]=cmr;
                    objm[2]="0.0";
                    objm[3]=monr;
                    mod.addRow(objm);
               }
           }
       }else{
            if(objr.length>0){
                for(int i=0;i<objr.length;i++){  //recorro objeto resultado
                   int cfr=Integer.parseInt(objr[i][0].toString());  //codigo forma en obj resultado
                   int cmr=Integer.parseInt(objr[i][1].toString());  //codigo moneda en obj resultado
                   float monr=Float.parseFloat(objr[i][2].toString());  //codigo forma en obj resultado
                   Object[] objm=new Object[4];
                   objm[0]=cfr;
                   objm[1]=cmr;
                   objm[2]="0.0";
                   objm[3]=monr;
                   mod.addRow(objm);

               }
           }
       }
       return mod;
  }

public int getsiguientecodigo(){ //para frmcajayarqueo
        Transaction txx4=null;
        int siguientecodigo=0;
        try{
            this.sesion = NewHibernateUtil.getSessionFactory().openSession();
            txx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idarq) from Arqueo");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(idarq)from Arqueo");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                    siguientecodigo=siguientecodigo+1;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Número máximo de registros alcanzado","NO SE PUEDEN CARGAR MÁS REGISTROS",JOptionPane.INFORMATION_MESSAGE);
                    siguientecodigo=0;
                }
            }
          //  txx4.commit();  //guarda los cambios hechos en la transaccion, en este caso no seria necesario
            if(sesion.isOpen()){
               sesion.clear();
               sesion.close();
            }
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
   //         txx4.rollback();  //vuelve al estado anterior en caso de que de error

        }finally{
            //this.sesionst.close();
            return siguientecodigo;
        }
   }
public int getsiguientecodigo2(){ //para abrir caja
       // Transaction txx4=null;
        int siguientecodigo=0;
        try{
         //   this.sesion = NewHibernateUtil.getSessionFactory().openSession();
          //  txx4=sesion.beginTransaction();
            Query q= sesion.createQuery("select count(idarq) from Arqueo");
            if(Integer.parseInt(q.list().get(0).toString())==0)
                siguientecodigo=1;
            else{
                Query qq= sesion.createQuery("select max(idarq)from Arqueo");
                siguientecodigo=Integer.parseInt(qq.list().get(0).toString());
                if (siguientecodigo < 2147483647){  //si no exede el rango de un entero
                    siguientecodigo=siguientecodigo+1;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Número máximo de registros alcanzado","NO SE PUEDEN CARGAR MÁS REGISTROS",JOptionPane.INFORMATION_MESSAGE);
                    siguientecodigo=0;
                }
            }
          //  txx4.commit();  //guarda los cambios hechos en la transaccion, en este caso no seria necesario
        /*    if(sesion.isOpen()){
               sesion.clear();
               sesion.close();
            }*/
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al intentar obtener un nuevo código","ERROR",JOptionPane.ERROR_MESSAGE);
            siguientecodigo =0;
   //         txx4.rollback();  //vuelve al estado anterior en caso de que de error

        }finally{
            //this.sesionst.close();
            return siguientecodigo;
        }
   }
   public boolean existeRegistroConFormaMonedaYApe(int idfor, int idmon, int idape){
        sesion = NewHibernateUtil.getSessionFactory().openSession();
        boolean encontrado=false;
        Transaction tx2=null;
        try{
           tx2=sesion.beginTransaction();
           Query qq=sesion.createQuery("from Arqueo where idforma = "+idfor+" and idmoneda = "+idmon+" and idayccaja = "+idape);
           if(qq.list().size()>0){ //si no se encontro
                encontrado=true;
                this.miarqueo=(Arqueo) qq.list().get(0);
           }else{
                encontrado=false;
                this.miarqueo=new Arqueo();
           }
           tx2.commit();
        }
        catch(HibernateException e){
            e.printStackTrace();
        }
        if(sesion.isOpen()){
            sesion.flush();
            sesion.clear();
            sesion.close();
        }
        return encontrado;
    }
}
