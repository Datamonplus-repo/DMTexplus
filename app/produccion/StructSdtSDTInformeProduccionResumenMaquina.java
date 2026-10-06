package app.produccion ;
import com.genexus.*;

public final  class StructSdtSDTInformeProduccionResumenMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeProduccionResumenMaquina( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeProduccionResumenMaquina.class ));
   }

   public StructSdtSDTInformeProduccionResumenMaquina( int remoteHandle ,
                                                       ModelContext context )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_N = (byte)(1) ;
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

   public java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem> getMaquina( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina ;
   }

   public void setMaquina( java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem> value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina = value ;
   }

   public java.math.BigDecimal getTotalmt( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt ;
   }

   public void setTotalmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt = value ;
   }

   public java.math.BigDecimal getTotalkg( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg ;
   }

   public void setTotalkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg = value ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenMaquina_N ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg ;
   protected java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem> gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina=null ;
}

