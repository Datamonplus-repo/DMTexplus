package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtControlCalidad_ValoresEstandars_CCsta_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtControlCalidad_ValoresEstandars_CCsta_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtControlCalidad_ValoresEstandars_CCsta_SDT_Item.class ));
   }

   public StructSdtControlCalidad_ValoresEstandars_CCsta_SDT_Item( int remoteHandle ,
                                                                   ModelContext context )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc = "" ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol = new java.math.BigDecimal(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin = "" ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax = "" ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc = "" ;
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

   public short getCctlin( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin ;
   }

   public void setCctlin( short value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin = value ;
   }

   public String getCctlindsc( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc ;
   }

   public void setCctlindsc( String value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc = value ;
   }

   public byte getCcsauto( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto ;
   }

   public void setCcsauto( byte value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto = value ;
   }

   public java.math.BigDecimal getCcsvtol( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol ;
   }

   public void setCcsvtol( java.math.BigDecimal value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol = value ;
   }

   public String getCcsmin( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin ;
   }

   public void setCcsmin( String value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin = value ;
   }

   public String getCcsmax( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax ;
   }

   public void setCcsmax( String value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax = value ;
   }

   public String getCcvdsc( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc ;
   }

   public void setCcvdsc( String value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc = value ;
   }

   protected byte gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto ;
   protected byte gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N ;
   protected short gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin ;
   protected String gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc ;
   protected String gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin ;
   protected String gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax ;
   protected String gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc ;
   protected java.math.BigDecimal gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol ;
}

