package app ;
import com.genexus.*;

public final  class StructSdtSDTProduccionMaquinasTurnos_TurnosItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProduccionMaquinasTurnos_TurnosItem( )
   {
      this( -1, new ModelContext( StructSdtSDTProduccionMaquinasTurnos_TurnosItem.class ));
   }

   public StructSdtSDTProduccionMaquinasTurnos_TurnosItem( int remoteHandle ,
                                                           ModelContext context )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno = new java.math.BigDecimal(0) ;
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

   public byte getTurno( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno ;
   }

   public void setTurno( byte value )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno = value ;
   }

   public java.math.BigDecimal getKilosturno( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno ;
   }

   public void setKilosturno( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno = value ;
   }

   public java.math.BigDecimal getMetrosturno( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno ;
   }

   public void setMetrosturno( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno = value ;
   }

   protected byte gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno ;
   protected byte gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_N ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno ;
}

