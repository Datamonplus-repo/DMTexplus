package app ;
import com.genexus.*;

public final  class StructSdtSalidasManualesSDT_Producto implements Cloneable, java.io.Serializable
{
   public StructSdtSalidasManualesSDT_Producto( )
   {
      this( -1, new ModelContext( StructSdtSalidasManualesSDT_Producto.class ));
   }

   public StructSdtSalidasManualesSDT_Producto( int remoteHandle ,
                                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSalidasManualesSDT_Producto_Prdnum = "" ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdexialm = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdcanres = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Cumconcant = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Cumconlot = "" ;
      gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs = cal.getTime() ;
      gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N = (byte)(1) ;
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

   public String getPrdnum( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdnum = value ;
   }

   public java.math.BigDecimal getPrdfaccon( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon ;
   }

   public void setPrdfaccon( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon = value ;
   }

   public java.math.BigDecimal getPrdexialm( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Prdexialm ;
   }

   public void setPrdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdexialm = value ;
   }

   public java.math.BigDecimal getPrdcanres( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Prdcanres ;
   }

   public void setPrdcanres( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdcanres = value ;
   }

   public java.math.BigDecimal getCumconcant( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Cumconcant ;
   }

   public void setCumconcant( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Cumconcant = value ;
   }

   public byte getCumunidad( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Cumunidad ;
   }

   public void setCumunidad( byte value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Cumunidad = value ;
   }

   public String getCumconlot( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Cumconlot ;
   }

   public void setCumconlot( String value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Cumconlot = value ;
   }

   public java.util.Date getUltfecccs( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs ;
   }

   public void setUltfecccs( java.util.Date value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs = value ;
   }

   protected byte gxTv_SdtSalidasManualesSDT_Producto_Cumunidad ;
   protected byte gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N ;
   protected byte gxTv_SdtSalidasManualesSDT_Producto_N ;
   protected String gxTv_SdtSalidasManualesSDT_Producto_Prdnum ;
   protected String gxTv_SdtSalidasManualesSDT_Producto_Cumconlot ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesSDT_Producto_Prdexialm ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesSDT_Producto_Prdcanres ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesSDT_Producto_Cumconcant ;
   protected java.util.Date gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs ;
}

