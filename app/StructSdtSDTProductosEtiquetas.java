package app ;
import com.genexus.*;

public final  class StructSdtSDTProductosEtiquetas implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProductosEtiquetas( )
   {
      this( -1, new ModelContext( StructSdtSDTProductosEtiquetas.class ));
   }

   public StructSdtSDTProductosEtiquetas( int remoteHandle ,
                                          ModelContext context )
   {
      gxTv_SdtSDTProductosEtiquetas_Producto = "" ;
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
      return gxTv_SdtSDTProductosEtiquetas_Producto ;
   }

   public void setProducto( String value )
   {
      gxTv_SdtSDTProductosEtiquetas_N = (byte)(0) ;
      gxTv_SdtSDTProductosEtiquetas_Producto = value ;
   }

   public short getNetiquetas( )
   {
      return gxTv_SdtSDTProductosEtiquetas_Netiquetas ;
   }

   public void setNetiquetas( short value )
   {
      gxTv_SdtSDTProductosEtiquetas_N = (byte)(0) ;
      gxTv_SdtSDTProductosEtiquetas_Netiquetas = value ;
   }

   public short getLinent( )
   {
      return gxTv_SdtSDTProductosEtiquetas_Linent ;
   }

   public void setLinent( short value )
   {
      gxTv_SdtSDTProductosEtiquetas_N = (byte)(0) ;
      gxTv_SdtSDTProductosEtiquetas_Linent = value ;
   }

   protected byte gxTv_SdtSDTProductosEtiquetas_N ;
   protected short gxTv_SdtSDTProductosEtiquetas_Netiquetas ;
   protected short gxTv_SdtSDTProductosEtiquetas_Linent ;
   protected String gxTv_SdtSDTProductosEtiquetas_Producto ;
}

