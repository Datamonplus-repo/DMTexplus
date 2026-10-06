package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtControlCalidad_CC1_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtControlCalidad_CC1_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtControlCalidad_CC1_SDT_Item.class ));
   }

   public StructSdtControlCalidad_CC1_SDT_Item( int remoteHandle ,
                                                ModelContext context )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc = "" ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2 = "" ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo = "" ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2 = "" ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval = "" ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc = "" ;
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
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin ;
   }

   public void setCctlin( short value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin = value ;
   }

   public String getCctlindsc( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc ;
   }

   public void setCctlindsc( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc = value ;
   }

   public String getCctlindc2( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2 ;
   }

   public void setCctlindc2( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2 = value ;
   }

   public String getCcmetodo( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo ;
   }

   public void setCcmetodo( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo = value ;
   }

   public String getCcespecif2( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2 ;
   }

   public void setCcespecif2( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2 = value ;
   }

   public String getCcval( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval ;
   }

   public void setCcval( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval = value ;
   }

   public String getCctvaldsc( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc ;
   }

   public void setCctvaldsc( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc = value ;
   }

   protected byte gxTv_SdtControlCalidad_CC1_SDT_Item_N ;
   protected short gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2 ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2 ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc ;
}

