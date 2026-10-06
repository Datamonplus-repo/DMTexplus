package app.facturacion ;
import com.genexus.*;

public final  class StructSdtTraspasarPrecioFases_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtTraspasarPrecioFases_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtTraspasarPrecioFases_SDT_Item.class ));
   }

   public StructSdtTraspasarPrecioFases_SDT_Item( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod = "" ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc = "" ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr = new java.math.BigDecimal(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva = "" ;
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

   public boolean getSelected( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Selected ;
   }

   public void setSelected( boolean value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Selected = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc = value ;
   }

   public java.math.BigDecimal getFasprekgm( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm ;
   }

   public void setFasprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm = value ;
   }

   public java.math.BigDecimal getFaspremtr( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr ;
   }

   public void setFaspremtr( java.math.BigDecimal value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr = value ;
   }

   public byte getFaspreu( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu ;
   }

   public void setFaspreu( byte value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu = value ;
   }

   public String getFasactiva( )
   {
      return gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva ;
   }

   public void setFasactiva( String value )
   {
      gxTv_SdtTraspasarPrecioFases_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva = value ;
   }

   protected byte gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu ;
   protected byte gxTv_SdtTraspasarPrecioFases_SDT_Item_N ;
   protected int gxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod ;
   protected String gxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod ;
   protected String gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc ;
   protected String gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva ;
   protected boolean gxTv_SdtTraspasarPrecioFases_SDT_Item_Selected ;
   protected java.math.BigDecimal gxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm ;
   protected java.math.BigDecimal gxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr ;
}

