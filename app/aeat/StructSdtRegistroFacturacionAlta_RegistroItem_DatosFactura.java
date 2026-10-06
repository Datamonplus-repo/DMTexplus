package app.aeat ;
import com.genexus.*;

public final  class StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura implements Cloneable, java.io.Serializable
{
   public StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura( )
   {
      this( -1, new ModelContext( StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura.class ));
   }

   public StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura( int remoteHandle ,
                                                                      ModelContext context )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N = (byte)(1) ;
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

   public String getDescripcionoperacion( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion ;
   }

   public void setDescripcionoperacion( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion = value ;
   }

   public String getImportetotal( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal ;
   }

   public void setImportetotal( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal = value ;
   }

   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos getImpuestos( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos ;
   }

   public void setImpuestos( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos = value;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal ;
   protected app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos=null ;
}

