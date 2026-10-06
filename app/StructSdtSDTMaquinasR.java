package app ;
import com.genexus.*;

public final  class StructSdtSDTMaquinasR implements Cloneable, java.io.Serializable
{
   public StructSdtSDTMaquinasR( )
   {
      this( -1, new ModelContext( StructSdtSDTMaquinasR.class ));
   }

   public StructSdtSDTMaquinasR( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtSDTMaquinasR_Maqdsc = "" ;
      gxTv_SdtSDTMaquinasR_Kilosreoperados = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTMaquinasR_Metrosreoperados = new java.math.BigDecimal(0) ;
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
      return gxTv_SdtSDTMaquinasR_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTMaquinasR_N = (byte)(0) ;
      gxTv_SdtSDTMaquinasR_Maqdsc = value ;
   }

   public java.math.BigDecimal getKilosreoperados( )
   {
      return gxTv_SdtSDTMaquinasR_Kilosreoperados ;
   }

   public void setKilosreoperados( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMaquinasR_N = (byte)(0) ;
      gxTv_SdtSDTMaquinasR_Kilosreoperados = value ;
   }

   public java.math.BigDecimal getMetrosreoperados( )
   {
      return gxTv_SdtSDTMaquinasR_Metrosreoperados ;
   }

   public void setMetrosreoperados( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMaquinasR_N = (byte)(0) ;
      gxTv_SdtSDTMaquinasR_Metrosreoperados = value ;
   }

   protected byte gxTv_SdtSDTMaquinasR_N ;
   protected String gxTv_SdtSDTMaquinasR_Maqdsc ;
   protected java.math.BigDecimal gxTv_SdtSDTMaquinasR_Kilosreoperados ;
   protected java.math.BigDecimal gxTv_SdtSDTMaquinasR_Metrosreoperados ;
}

