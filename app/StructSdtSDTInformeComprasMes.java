package app ;
import com.genexus.*;

public final  class StructSdtSDTInformeComprasMes implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeComprasMes( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeComprasMes.class ));
   }

   public StructSdtSDTInformeComprasMes( int remoteHandle ,
                                         ModelContext context )
   {
      gxTv_SdtSDTInformeComprasMes_Producto = "" ;
      gxTv_SdtSDTInformeComprasMes_Descripcion = "" ;
      gxTv_SdtSDTInformeComprasMes_Nombre = "" ;
      gxTv_SdtSDTInformeComprasMes_Meses_N = (byte)(1) ;
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
      return gxTv_SdtSDTInformeComprasMes_Producto ;
   }

   public void setProducto( String value )
   {
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_Producto = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtSDTInformeComprasMes_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_Descripcion = value ;
   }

   public int getProveedor( )
   {
      return gxTv_SdtSDTInformeComprasMes_Proveedor ;
   }

   public void setProveedor( int value )
   {
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_Proveedor = value ;
   }

   public String getNombre( )
   {
      return gxTv_SdtSDTInformeComprasMes_Nombre ;
   }

   public void setNombre( String value )
   {
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_Nombre = value ;
   }

   public java.util.Vector<app.StructSdtSDTInformeComprasMes_MesesItem> getMeses( )
   {
      return gxTv_SdtSDTInformeComprasMes_Meses ;
   }

   public void setMeses( java.util.Vector<app.StructSdtSDTInformeComprasMes_MesesItem> value )
   {
      gxTv_SdtSDTInformeComprasMes_Meses_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_Meses = value ;
   }

   protected byte gxTv_SdtSDTInformeComprasMes_Meses_N ;
   protected byte gxTv_SdtSDTInformeComprasMes_N ;
   protected int gxTv_SdtSDTInformeComprasMes_Proveedor ;
   protected String gxTv_SdtSDTInformeComprasMes_Producto ;
   protected String gxTv_SdtSDTInformeComprasMes_Descripcion ;
   protected String gxTv_SdtSDTInformeComprasMes_Nombre ;
   protected java.util.Vector<app.StructSdtSDTInformeComprasMes_MesesItem> gxTv_SdtSDTInformeComprasMes_Meses=null ;
}

