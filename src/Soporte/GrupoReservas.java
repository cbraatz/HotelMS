package Soporte;

import Hiber1.Subtipo;
import java.util.Date;

public class GrupoReservas{
    private Date _fechaIni;
    private Date _fechaFin;
    private int _idHabitacion;
    private Subtipo _subTipo;
    private int _idSubreserva;
    private boolean _esMediaReserva;
    public GrupoReservas(){  //constructor por defecto
    }
    public GrupoReservas(Date fechaIni, Date fechaFin, int idHabitacion, Subtipo subTipo, int idSubreserva, boolean esMediaReserva){
        this._fechaIni=fechaIni;
        this._fechaFin=fechaFin;
        this._idHabitacion=idHabitacion;
        this._subTipo=subTipo;
        this._idSubreserva=idSubreserva;
        this._esMediaReserva= esMediaReserva;
    }
    public boolean getEsMediaReserva(){
        return this._esMediaReserva;
    }
    public void setEsMediaReserva(boolean esMediaRes){
        this._esMediaReserva=esMediaRes;
    }
    public Subtipo getSubTipo(){
        return this._subTipo;
    }
    public void setSubTipo(Subtipo subTipo){
        this._subTipo=subTipo;
    }

    public Date getFechaInicio(){
        return this._fechaIni;
    }
    public Date getFechaFin(){
        return this._fechaFin;
    }
    public void setFechaInicio(Date fecIni){
        this._fechaIni=fecIni;
    }
    public void setFechaFin(Date fecFin){
        this._fechaFin=fecFin;
    }
    public void setIdHabitacion(int idHabitacion){
        this._idHabitacion=idHabitacion;
    }
    public int getIdHabitacion(){
        return this._idHabitacion;
    }
    public void setIdSubreserva(int idSubreserva){
        this._idSubreserva=idSubreserva;
    }
    public int getIdSubreserva(){
        return this._idSubreserva;
    }
}