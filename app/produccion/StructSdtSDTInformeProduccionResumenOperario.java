package app.produccion ;
import com.genexus.*;

public final  class StructSdtSDTInformeProduccionResumenOperario implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeProduccionResumenOperario( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeProduccionResumenOperario.class ));
   }

   public StructSdtSDTInformeProduccionResumenOperario( int remoteHandle ,
                                                        ModelContext context )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Operario_N = (byte)(1) ;
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

   public java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenOperario_OperarioItem> getOperario( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_Operario ;
   }

   public void setOperario( java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenOperario_OperarioItem> value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_Operario_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Operario = value ;
   }

   public java.math.BigDecimal getTotalkg( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg ;
   }

   public void setTotalkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg = value ;
   }

   public java.math.BigDecimal getTotalmt( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt ;
   }

   public void setTotalmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt = value ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenOperario_Operario_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenOperario_N ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt ;
   protected java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenOperario_OperarioItem> gxTv_SdtSDTInformeProduccionResumenOperario_Operario=null ;
}

