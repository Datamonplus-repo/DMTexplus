package app ;
import com.genexus.*;

public final  class StructSdtSDTProduccionMaquinasFases_FasesItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProduccionMaquinasFases_FasesItem( )
   {
      this( -1, new ModelContext( StructSdtSDTProduccionMaquinasFases_FasesItem.class ));
   }

   public StructSdtSDTProduccionMaquinasFases_FasesItem( int remoteHandle ,
                                                         ModelContext context )
   {
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc = "" ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion = new java.math.BigDecimal(0) ;
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

   public String getFasdsc( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc = value ;
   }

   public short getTiempo( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo ;
   }

   public void setTiempo( short value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo = value ;
   }

   public java.math.BigDecimal getKilosproduccion( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion ;
   }

   public void setKilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getMetrosproduccion( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion ;
   }

   public void setMetrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion = value ;
   }

   protected byte gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N ;
   protected short gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo ;
   protected String gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion ;
}

