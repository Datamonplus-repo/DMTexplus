package app ;
import com.genexus.*;

public final  class StructSdtSDTProductosConsumos implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProductosConsumos( )
   {
      this( -1, new ModelContext( StructSdtSDTProductosConsumos.class ));
   }

   public StructSdtSDTProductosConsumos( int remoteHandle ,
                                         ModelContext context )
   {
      gxTv_SdtSDTProductosConsumos_Producto = "" ;
      gxTv_SdtSDTProductosConsumos_Cantidad = new java.math.BigDecimal(0) ;
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

   public String getProducto( )
   {
      return gxTv_SdtSDTProductosConsumos_Producto ;
   }

   public void setProducto( String value )
   {
      gxTv_SdtSDTProductosConsumos_N = (byte)(0) ;
      gxTv_SdtSDTProductosConsumos_Producto = value ;
   }

   public java.math.BigDecimal getCantidad( )
   {
      return gxTv_SdtSDTProductosConsumos_Cantidad ;
   }

   public void setCantidad( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProductosConsumos_N = (byte)(0) ;
      gxTv_SdtSDTProductosConsumos_Cantidad = value ;
   }

   protected byte gxTv_SdtSDTProductosConsumos_N ;
   protected String gxTv_SdtSDTProductosConsumos_Producto ;
   protected java.math.BigDecimal gxTv_SdtSDTProductosConsumos_Cantidad ;
}

