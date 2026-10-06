package app.aeat ;
import com.genexus.*;

public final  class StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA implements Cloneable, java.io.Serializable
{
   public StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA( )
   {
      this( -1, new ModelContext( StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA.class ));
   }

   public StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA( int remoteHandle ,
                                                                                    ModelContext context )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota = "" ;
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

   public String getTipo( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo ;
   }

   public void setTipo( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo = value ;
   }

   public String getBaseimponible( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible ;
   }

   public void setBaseimponible( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible = value ;
   }

   public String getCuota( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota ;
   }

   public void setCuota( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota = value ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_N ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota ;
}

