package app ;
import com.genexus.*;

public final  class StructSdtSDTProduccionMaquinasTurnos implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProduccionMaquinasTurnos( )
   {
      this( -1, new ModelContext( StructSdtSDTProduccionMaquinasTurnos.class ));
   }

   public StructSdtSDTProduccionMaquinasTurnos( int remoteHandle ,
                                                ModelContext context )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc = "" ;
      gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_N = (byte)(1) ;
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
      return gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTProduccionMaquinasTurnos_TurnosItem> getTurnos( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_Turnos ;
   }

   public void setTurnos( java.util.Vector<app.StructSdtSDTProduccionMaquinasTurnos_TurnosItem> value )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_Turnos = value ;
   }

   protected byte gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_N ;
   protected byte gxTv_SdtSDTProduccionMaquinasTurnos_N ;
   protected String gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc ;
   protected java.util.Vector<app.StructSdtSDTProduccionMaquinasTurnos_TurnosItem> gxTv_SdtSDTProduccionMaquinasTurnos_Turnos=null ;
}

