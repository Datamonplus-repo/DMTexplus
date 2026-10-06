package app.aeat ;
import com.genexus.*;

public final  class StructSdtRegistroFacturacionAlta_Cabecera implements Cloneable, java.io.Serializable
{
   public StructSdtRegistroFacturacionAlta_Cabecera( )
   {
      this( -1, new ModelContext( StructSdtRegistroFacturacionAlta_Cabecera.class ));
   }

   public StructSdtRegistroFacturacionAlta_Cabecera( int remoteHandle ,
                                                     ModelContext context )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Version = "" ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio = "" ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N = (byte)(1) ;
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

   public String getVersion( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_Version ;
   }

   public void setVersion( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Version = value ;
   }

   public app.aeat.StructSdtRegistroFacturacionAlta_Cabecera_Emisor getEmisor( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor ;
   }

   public void setEmisor( app.aeat.StructSdtRegistroFacturacionAlta_Cabecera_Emisor value )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor = value;
   }

   public String getFechaenvio( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio ;
   }

   public void setFechaenvio( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio = value ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_Cabecera_N ;
   protected String gxTv_SdtRegistroFacturacionAlta_Cabecera_Version ;
   protected String gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio ;
   protected app.aeat.StructSdtRegistroFacturacionAlta_Cabecera_Emisor gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor=null ;
}

