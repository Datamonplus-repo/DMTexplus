package app ;
import com.genexus.*;

public final  class StructSdtSDTTranspasarFasePrecio_Item implements Cloneable, java.io.Serializable
{
   public StructSdtSDTTranspasarFasePrecio_Item( )
   {
      this( -1, new ModelContext( StructSdtSDTTranspasarFasePrecio_Item.class ));
   }

   public StructSdtSDTTranspasarFasePrecio_Item( int remoteHandle ,
                                                 ModelContext context )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod = "" ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod = "" ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc = "" ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr = new java.math.BigDecimal(0) ;
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
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Selected ;
   }

   public void setSelected( boolean value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Selected = value ;
   }

   public String getEmprcod( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Clicod = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc = value ;
   }

   public java.math.BigDecimal getFasprekgm( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm ;
   }

   public void setFasprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm = value ;
   }

   public java.math.BigDecimal getFaspremtr( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr ;
   }

   public void setFaspremtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr = value ;
   }

   public byte getFaspreu( )
   {
      return gxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu ;
   }

   public void setFaspreu( byte value )
   {
      gxTv_SdtSDTTranspasarFasePrecio_Item_N = (byte)(0) ;
      gxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu = value ;
   }

   protected byte gxTv_SdtSDTTranspasarFasePrecio_Item_Faspreu ;
   protected byte gxTv_SdtSDTTranspasarFasePrecio_Item_N ;
   protected int gxTv_SdtSDTTranspasarFasePrecio_Item_Clicod ;
   protected String gxTv_SdtSDTTranspasarFasePrecio_Item_Emprcod ;
   protected String gxTv_SdtSDTTranspasarFasePrecio_Item_Fascod ;
   protected String gxTv_SdtSDTTranspasarFasePrecio_Item_Fasdsc ;
   protected boolean gxTv_SdtSDTTranspasarFasePrecio_Item_Selected ;
   protected java.math.BigDecimal gxTv_SdtSDTTranspasarFasePrecio_Item_Fasprekgm ;
   protected java.math.BigDecimal gxTv_SdtSDTTranspasarFasePrecio_Item_Faspremtr ;
}

