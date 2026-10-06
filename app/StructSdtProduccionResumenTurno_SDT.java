package app ;
import com.genexus.*;

public final  class StructSdtProduccionResumenTurno_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtProduccionResumenTurno_SDT( )
   {
      this( -1, new ModelContext( StructSdtProduccionResumenTurno_SDT.class ));
   }

   public StructSdtProduccionResumenTurno_SDT( int remoteHandle ,
                                               ModelContext context )
   {
      gxTv_SdtProduccionResumenTurno_SDT_Maqdsc = "" ;
      gxTv_SdtProduccionResumenTurno_SDT_Turnos_N = (byte)(1) ;
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

   public String getMaqdsc( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtProduccionResumenTurno_SDT_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_Maqdsc = value ;
   }

   public java.util.Vector<app.StructSdtProduccionResumenTurno_SDT_TurnosItem> getTurnos( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_Turnos ;
   }

   public void setTurnos( java.util.Vector<app.StructSdtProduccionResumenTurno_SDT_TurnosItem> value )
   {
      gxTv_SdtProduccionResumenTurno_SDT_Turnos_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_Turnos = value ;
   }

   protected byte gxTv_SdtProduccionResumenTurno_SDT_Turnos_N ;
   protected byte gxTv_SdtProduccionResumenTurno_SDT_N ;
   protected String gxTv_SdtProduccionResumenTurno_SDT_Maqdsc ;
   protected java.util.Vector<app.StructSdtProduccionResumenTurno_SDT_TurnosItem> gxTv_SdtProduccionResumenTurno_SDT_Turnos=null ;
}

