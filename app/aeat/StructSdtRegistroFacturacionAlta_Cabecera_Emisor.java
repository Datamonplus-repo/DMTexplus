package app.aeat ;
import com.genexus.*;

public final  class StructSdtRegistroFacturacionAlta_Cabecera_Emisor implements Cloneable, java.io.Serializable
{
   public StructSdtRegistroFacturacionAlta_Cabecera_Emisor( )
   {
      this( -1, new ModelContext( StructSdtRegistroFacturacionAlta_Cabecera_Emisor.class ));
   }

   public StructSdtRegistroFacturacionAlta_Cabecera_Emisor( int remoteHandle ,
                                                            ModelContext context )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nif = "" ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nombrerazon = "" ;
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

   public String getNif( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nif ;
   }

   public void setNif( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nif = value ;
   }

   public String getNombrerazon( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nombrerazon ;
   }

   public void setNombrerazon( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nombrerazon = value ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N ;
   protected String gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nif ;
   protected String gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nombrerazon ;
}

