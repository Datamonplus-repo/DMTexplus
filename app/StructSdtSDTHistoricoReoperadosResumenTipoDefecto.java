package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosResumenTipoDefecto implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosResumenTipoDefecto( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosResumenTipoDefecto.class ));
   }

   public StructSdtSDTHistoricoReoperadosResumenTipoDefecto( int remoteHandle ,
                                                             ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public short getTipdefcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod ;
   }

   public void setTipdefcod( short value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod = value ;
   }

   public String getTipdefdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc ;
   }

   public void setTipdefdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> getMaquinas( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas ;
   }

   public void setMaquinas( java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N ;
   protected short gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc ;
   protected java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas=null ;
}

