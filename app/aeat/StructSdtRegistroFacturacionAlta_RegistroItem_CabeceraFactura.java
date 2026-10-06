package app.aeat ;
import com.genexus.*;

public final  class StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura implements Cloneable, java.io.Serializable
{
   public StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura( )
   {
      this( -1, new ModelContext( StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura.class ));
   }

   public StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura( int remoteHandle ,
                                                                         ModelContext context )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura = "" ;
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

   public String getNumeroseriefacturaemisor( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor ;
   }

   public void setNumeroseriefacturaemisor( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor = value ;
   }

   public String getFechaexpedicionfacturaemisor( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor ;
   }

   public void setFechaexpedicionfacturaemisor( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor = value ;
   }

   public String getTipofactura( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura ;
   }

   public void setTipofactura( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura = value ;
   }

   public String getClaveregimenfactura( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura ;
   }

   public void setClaveregimenfactura( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura = value ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_N ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura ;
}

