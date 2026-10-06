package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtControlCalidad_CCSTA_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtControlCalidad_CCSTA_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtControlCalidad_CCSTA_SDT_Item.class ));
   }

   public StructSdtControlCalidad_CCSTA_SDT_Item( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval = "" ;
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc = "" ;
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

   public byte getCctvallin( )
   {
      return gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin ;
   }

   public void setCctvallin( byte value )
   {
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin = value ;
   }

   public String getCctval( )
   {
      return gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval ;
   }

   public void setCctval( String value )
   {
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval = value ;
   }

   public String getCctvaldsc( )
   {
      return gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc ;
   }

   public void setCctvaldsc( String value )
   {
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc = value ;
   }

   protected byte gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin ;
   protected byte gxTv_SdtControlCalidad_CCSTA_SDT_Item_N ;
   protected String gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval ;
   protected String gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc ;
}

