package app.facturacion ;
import com.genexus.*;

public final  class StructSdtPrecioporColor_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtPrecioporColor_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtPrecioporColor_SDT_Item.class ));
   }

   public StructSdtPrecioporColor_SDT_Item( int remoteHandle ,
                                            ModelContext context )
   {
      gxTv_SdtPrecioporColor_SDT_Item_Clinom = "" ;
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

   public int getClicod( )
   {
      return gxTv_SdtPrecioporColor_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtPrecioporColor_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtPrecioporColor_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtPrecioporColor_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_SDT_Item_Clinom = value ;
   }

   public boolean getFormulacolor( )
   {
      return gxTv_SdtPrecioporColor_SDT_Item_Formulacolor ;
   }

   public void setFormulacolor( boolean value )
   {
      gxTv_SdtPrecioporColor_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_SDT_Item_Formulacolor = value ;
   }

   protected byte gxTv_SdtPrecioporColor_SDT_Item_N ;
   protected int gxTv_SdtPrecioporColor_SDT_Item_Clicod ;
   protected String gxTv_SdtPrecioporColor_SDT_Item_Clinom ;
   protected boolean gxTv_SdtPrecioporColor_SDT_Item_Formulacolor ;
}

