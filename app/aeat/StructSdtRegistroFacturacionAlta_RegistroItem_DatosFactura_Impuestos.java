package app.aeat ;
import com.genexus.*;

public final  class StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos implements Cloneable, java.io.Serializable
{
   public StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( )
   {
      this( -1, new ModelContext( StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos.class ));
   }

   public StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( int remoteHandle ,
                                                                                ModelContext context )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_N = (byte)(1) ;
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

   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA getIva( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva ;
   }

   public void setIva( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva = value;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N ;
   protected app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva=null ;
}

