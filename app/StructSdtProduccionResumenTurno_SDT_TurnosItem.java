package app ;
import com.genexus.*;

public final  class StructSdtProduccionResumenTurno_SDT_TurnosItem implements Cloneable, java.io.Serializable
{
   public StructSdtProduccionResumenTurno_SDT_TurnosItem( )
   {
      this( -1, new ModelContext( StructSdtProduccionResumenTurno_SDT_TurnosItem.class ));
   }

   public StructSdtProduccionResumenTurno_SDT_TurnosItem( int remoteHandle ,
                                                          ModelContext context )
   {
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno = new java.math.BigDecimal(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno = new java.math.BigDecimal(0) ;
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
      return gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno ;
   }

   public void setTurno( byte value )
   {
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno = value ;
   }

   public java.math.BigDecimal getKilosturno( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno ;
   }

   public void setKilosturno( java.math.BigDecimal value )
   {
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno = value ;
   }

   public java.math.BigDecimal getMetrosturno( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno ;
   }

   public void setMetrosturno( java.math.BigDecimal value )
   {
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno = value ;
   }

   protected byte gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno ;
   protected byte gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_N ;
   protected java.math.BigDecimal gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno ;
   protected java.math.BigDecimal gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno ;
}

