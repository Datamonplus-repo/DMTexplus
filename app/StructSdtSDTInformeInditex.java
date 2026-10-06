package app ;
import com.genexus.*;

public final  class StructSdtSDTInformeInditex implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeInditex( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeInditex.class ));
   }

   public StructSdtSDTInformeInditex( int remoteHandle ,
                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInformeInditex_Producto = "" ;
      gxTv_SdtSDTInformeInditex_Descripcion = "" ;
      gxTv_SdtSDTInformeInditex_Cantc = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeInditex_Cantcm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeInditex_Lote = "" ;
      gxTv_SdtSDTInformeInditex_Fabricante = "" ;
      gxTv_SdtSDTInformeInditex_Proveedor = "" ;
      gxTv_SdtSDTInformeInditex_Stockinicial = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeInditex_Stockfinal = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeInditex_Categoria = "" ;
      gxTv_SdtSDTInformeInditex_Prdfuncion = "" ;
      gxTv_SdtSDTInformeInditex_Prdnrocas = "" ;
      gxTv_SdtSDTInformeInditex_Prdeinecs = "" ;
      gxTv_SdtSDTInformeInditex_Prdnmqu = "" ;
      gxTv_SdtSDTInformeInditex_Prdzdhc = "" ;
      gxTv_SdtSDTInformeInditex_Prdfhs = cal.getTime() ;
      gxTv_SdtSDTInformeInditex_Locutidc = "" ;
      gxTv_SdtSDTInformeInditex_Prdfhs_N = (byte)(1) ;
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
      return gxTv_SdtSDTInformeInditex_Producto ;
   }

   public void setProducto( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Producto = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtSDTInformeInditex_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Descripcion = value ;
   }

   public java.math.BigDecimal getCantc( )
   {
      return gxTv_SdtSDTInformeInditex_Cantc ;
   }

   public void setCantc( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Cantc = value ;
   }

   public java.math.BigDecimal getCantcm( )
   {
      return gxTv_SdtSDTInformeInditex_Cantcm ;
   }

   public void setCantcm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Cantcm = value ;
   }

   public String getLote( )
   {
      return gxTv_SdtSDTInformeInditex_Lote ;
   }

   public void setLote( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Lote = value ;
   }

   public String getFabricante( )
   {
      return gxTv_SdtSDTInformeInditex_Fabricante ;
   }

   public void setFabricante( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Fabricante = value ;
   }

   public String getProveedor( )
   {
      return gxTv_SdtSDTInformeInditex_Proveedor ;
   }

   public void setProveedor( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Proveedor = value ;
   }

   public java.math.BigDecimal getStockinicial( )
   {
      return gxTv_SdtSDTInformeInditex_Stockinicial ;
   }

   public void setStockinicial( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Stockinicial = value ;
   }

   public java.math.BigDecimal getStockfinal( )
   {
      return gxTv_SdtSDTInformeInditex_Stockfinal ;
   }

   public void setStockfinal( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Stockfinal = value ;
   }

   public String getCategoria( )
   {
      return gxTv_SdtSDTInformeInditex_Categoria ;
   }

   public void setCategoria( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Categoria = value ;
   }

   public String getPrdfuncion( )
   {
      return gxTv_SdtSDTInformeInditex_Prdfuncion ;
   }

   public void setPrdfuncion( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdfuncion = value ;
   }

   public String getPrdnrocas( )
   {
      return gxTv_SdtSDTInformeInditex_Prdnrocas ;
   }

   public void setPrdnrocas( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdnrocas = value ;
   }

   public String getPrdeinecs( )
   {
      return gxTv_SdtSDTInformeInditex_Prdeinecs ;
   }

   public void setPrdeinecs( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdeinecs = value ;
   }

   public String getPrdnmqu( )
   {
      return gxTv_SdtSDTInformeInditex_Prdnmqu ;
   }

   public void setPrdnmqu( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdnmqu = value ;
   }

   public String getPrdzdhc( )
   {
      return gxTv_SdtSDTInformeInditex_Prdzdhc ;
   }

   public void setPrdzdhc( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdzdhc = value ;
   }

   public java.util.Date getPrdfhs( )
   {
      return gxTv_SdtSDTInformeInditex_Prdfhs ;
   }

   public void setPrdfhs( java.util.Date value )
   {
      gxTv_SdtSDTInformeInditex_Prdfhs_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Prdfhs = value ;
   }

   public String getLocutidc( )
   {
      return gxTv_SdtSDTInformeInditex_Locutidc ;
   }

   public void setLocutidc( String value )
   {
      gxTv_SdtSDTInformeInditex_N = (byte)(0) ;
      gxTv_SdtSDTInformeInditex_Locutidc = value ;
   }

   protected byte gxTv_SdtSDTInformeInditex_Prdfhs_N ;
   protected byte gxTv_SdtSDTInformeInditex_N ;
   protected String gxTv_SdtSDTInformeInditex_Producto ;
   protected String gxTv_SdtSDTInformeInditex_Descripcion ;
   protected String gxTv_SdtSDTInformeInditex_Lote ;
   protected String gxTv_SdtSDTInformeInditex_Fabricante ;
   protected String gxTv_SdtSDTInformeInditex_Proveedor ;
   protected String gxTv_SdtSDTInformeInditex_Categoria ;
   protected String gxTv_SdtSDTInformeInditex_Prdfuncion ;
   protected String gxTv_SdtSDTInformeInditex_Prdnrocas ;
   protected String gxTv_SdtSDTInformeInditex_Prdeinecs ;
   protected String gxTv_SdtSDTInformeInditex_Prdzdhc ;
   protected String gxTv_SdtSDTInformeInditex_Locutidc ;
   protected String gxTv_SdtSDTInformeInditex_Prdnmqu ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeInditex_Cantc ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeInditex_Cantcm ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeInditex_Stockinicial ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeInditex_Stockfinal ;
   protected java.util.Date gxTv_SdtSDTInformeInditex_Prdfhs ;
}

