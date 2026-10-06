package app.produccion ;
import com.genexus.*;

public final  class StructSdtSDTInformeProduccionResumenTipoArticulo implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeProduccionResumenTipoArticulo( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeProduccionResumenTipoArticulo.class ));
   }

   public StructSdtSDTInformeProduccionResumenTipoArticulo( int remoteHandle ,
                                                            ModelContext context )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_N = (byte)(1) ;
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

   public java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> getArticulo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo ;
   }

   public void setArticulo( java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo = value ;
   }

   public java.math.BigDecimal getTotalmt( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt ;
   }

   public void setTotalmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt = value ;
   }

   public java.math.BigDecimal getTotalkg( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg ;
   }

   public void setTotalkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg = value ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg ;
   protected java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo=null ;
}

