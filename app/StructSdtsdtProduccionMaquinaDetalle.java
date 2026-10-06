package app ;
import com.genexus.*;

public final  class StructSdtsdtProduccionMaquinaDetalle implements Cloneable, java.io.Serializable
{
   public StructSdtsdtProduccionMaquinaDetalle( )
   {
      this( -1, new ModelContext( StructSdtsdtProduccionMaquinaDetalle.class ));
   }

   public StructSdtsdtProduccionMaquinaDetalle( int remoteHandle ,
                                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod = "" ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc = "" ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr = "" ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti = cal.getTime() ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf = cal.getTime() ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Kilos = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Metros = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N = (byte)(1) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N = (byte)(1) ;
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

   public String getMaqcod( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc = value ;
   }

   public String getBarhdr( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr ;
   }

   public void setBarhdr( String value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr = value ;
   }

   public java.util.Date getHisprodti( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti ;
   }

   public void setHisprodti( java.util.Date value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf = value ;
   }

   public java.math.BigDecimal getKilos( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Kilos ;
   }

   public void setKilos( java.math.BigDecimal value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Kilos = value ;
   }

   public java.math.BigDecimal getMetros( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Metros ;
   }

   public void setMetros( java.math.BigDecimal value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Metros = value ;
   }

   protected byte gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N ;
   protected byte gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N ;
   protected byte gxTv_SdtsdtProduccionMaquinaDetalle_N ;
   protected String gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod ;
   protected String gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc ;
   protected String gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr ;
   protected java.util.Date gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti ;
   protected java.util.Date gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtsdtProduccionMaquinaDetalle_Kilos ;
   protected java.math.BigDecimal gxTv_SdtsdtProduccionMaquinaDetalle_Metros ;
}

