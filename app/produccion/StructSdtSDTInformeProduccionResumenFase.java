package app.produccion ;
import com.genexus.*;

public final  class StructSdtSDTInformeProduccionResumenFase implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeProduccionResumenFase( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeProduccionResumenFase.class ));
   }

   public StructSdtSDTInformeProduccionResumenFase( int remoteHandle ,
                                                    ModelContext context )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_Totalkg = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_Totalmt = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_Fase_N = (byte)(1) ;
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

   public java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenFase_FaseItem> getFase( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_Fase ;
   }

   public void setFase( java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenFase_FaseItem> value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_Fase_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_Fase = value ;
   }

   public java.math.BigDecimal getTotalkg( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_Totalkg ;
   }

   public void setTotalkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_Totalkg = value ;
   }

   public java.math.BigDecimal getTotalmt( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_Totalmt ;
   }

   public void setTotalmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_Totalmt = value ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenFase_Fase_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenFase_N ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_Totalkg ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_Totalmt ;
   protected java.util.Vector<app.produccion.StructSdtSDTInformeProduccionResumenFase_FaseItem> gxTv_SdtSDTInformeProduccionResumenFase_Fase=null ;
}

