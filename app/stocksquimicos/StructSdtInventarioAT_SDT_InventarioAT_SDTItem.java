package app.stocksquimicos ;
import com.genexus.*;

public final  class StructSdtInventarioAT_SDT_InventarioAT_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtInventarioAT_SDT_InventarioAT_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtInventarioAT_SDT_InventarioAT_SDTItem.class ));
   }

   public StructSdtInventarioAT_SDT_InventarioAT_SDTItem( int remoteHandle ,
                                                          ModelContext context )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory = "" ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode = "" ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription = "" ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode = "" ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity = new java.math.BigDecimal(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure = "" ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue = new java.math.BigDecimal(0) ;
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

   public String getProductcategory( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory ;
   }

   public void setProductcategory( String value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory = value ;
   }

   public String getProductcode( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode ;
   }

   public void setProductcode( String value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode = value ;
   }

   public String getProductdescription( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription ;
   }

   public void setProductdescription( String value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription = value ;
   }

   public String getProductnumbercode( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode ;
   }

   public void setProductnumbercode( String value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode = value ;
   }

   public java.math.BigDecimal getClosingstockquantity( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity ;
   }

   public void setClosingstockquantity( java.math.BigDecimal value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity = value ;
   }

   public String getUnitofmeasure( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure ;
   }

   public void setUnitofmeasure( String value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure = value ;
   }

   public java.math.BigDecimal getClosingstockvalue( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue ;
   }

   public void setClosingstockvalue( java.math.BigDecimal value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue = value ;
   }

   protected byte gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N ;
   protected String gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory ;
   protected String gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode ;
   protected String gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription ;
   protected String gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode ;
   protected String gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure ;
   protected java.math.BigDecimal gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity ;
   protected java.math.BigDecimal gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue ;
}

