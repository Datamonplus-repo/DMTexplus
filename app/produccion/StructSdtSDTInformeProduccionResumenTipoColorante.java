package app.produccion ;
import com.genexus.*;

public final  class StructSdtSDTInformeProduccionResumenTipoColorante implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeProduccionResumenTipoColorante( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeProduccionResumenTipoColorante.class ));
   }

   public StructSdtSDTInformeProduccionResumenTipoColorante( int remoteHandle ,
                                                             ModelContext context )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_N = (byte)(1) ;
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

   public java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante_Item> getTipocorante( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante ;
   }

   public void setTipocorante( java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante_Item> value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante = value ;
   }

   public java.math.BigDecimal getTotalmt( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt ;
   }

   public void setTotalmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt = value ;
   }

   public java.math.BigDecimal getTotalkg( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg ;
   }

   public void setTotalkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg = value ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoColorante_N ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg ;
   protected java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante_Item> gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante=null ;
}

