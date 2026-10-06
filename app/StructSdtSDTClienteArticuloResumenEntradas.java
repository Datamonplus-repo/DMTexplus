package app ;
import com.genexus.*;

public final  class StructSdtSDTClienteArticuloResumenEntradas implements Cloneable, java.io.Serializable
{
   public StructSdtSDTClienteArticuloResumenEntradas( )
   {
      this( -1, new ModelContext( StructSdtSDTClienteArticuloResumenEntradas.class ));
   }

   public StructSdtSDTClienteArticuloResumenEntradas( int remoteHandle ,
                                                      ModelContext context )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom = "" ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_N = (byte)(1) ;
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
      return gxTv_SdtSDTClienteArticuloResumenEntradas_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem> getArticulos( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos ;
   }

   public void setArticulos( java.util.Vector<app.StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem> value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos = value ;
   }

   protected byte gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_N ;
   protected byte gxTv_SdtSDTClienteArticuloResumenEntradas_N ;
   protected int gxTv_SdtSDTClienteArticuloResumenEntradas_Clicod ;
   protected String gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom ;
   protected java.util.Vector<app.StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem> gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos=null ;
}

