package app ;
import com.genexus.*;

public final  class StructSdtSalidasManualesSDT implements Cloneable, java.io.Serializable
{
   public StructSdtSalidasManualesSDT( )
   {
      this( -1, new ModelContext( StructSdtSalidasManualesSDT.class ));
   }

   public StructSdtSalidasManualesSDT( int remoteHandle ,
                                       ModelContext context )
   {
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(1) ;
      gxTv_SdtSalidasManualesSDT_Productos_N = (byte)(1) ;
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

   public app.StructSdtSalidasManualesSDT_Cabecera getCabecera( )
   {
      return gxTv_SdtSalidasManualesSDT_Cabecera ;
   }

   public void setCabecera( app.StructSdtSalidasManualesSDT_Cabecera value )
   {
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Cabecera = value;
   }

   public java.util.Vector<app.StructSdtSalidasManualesSDT_Producto> getProductos( )
   {
      return gxTv_SdtSalidasManualesSDT_Productos ;
   }

   public void setProductos( java.util.Vector<app.StructSdtSalidasManualesSDT_Producto> value )
   {
      gxTv_SdtSalidasManualesSDT_Productos_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Productos = value ;
   }

   protected byte gxTv_SdtSalidasManualesSDT_Cabecera_N ;
   protected byte gxTv_SdtSalidasManualesSDT_Productos_N ;
   protected byte gxTv_SdtSalidasManualesSDT_N ;
   protected app.StructSdtSalidasManualesSDT_Cabecera gxTv_SdtSalidasManualesSDT_Cabecera=null ;
   protected java.util.Vector<app.StructSdtSalidasManualesSDT_Producto> gxTv_SdtSalidasManualesSDT_Productos=null ;
}

