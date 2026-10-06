package app.aeat ;
import com.genexus.*;

public final  class StructSdtRegistroFacturacionAlta_RegistroItem implements Cloneable, java.io.Serializable
{
   public StructSdtRegistroFacturacionAlta_RegistroItem( )
   {
      this( -1, new ModelContext( StructSdtRegistroFacturacionAlta_RegistroItem.class ));
   }

   public StructSdtRegistroFacturacionAlta_RegistroItem( int remoteHandle ,
                                                         ModelContext context )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(1) ;
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

   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura getCabecerafactura( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura ;
   }

   public void setCabecerafactura( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura = value;
   }

   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura getDatosfactura( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura ;
   }

   public void setDatosfactura( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura = value;
   }

   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_Receptor getReceptor( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor ;
   }

   public void setReceptor( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_Receptor value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor = value;
   }

   public String getHuellafacturaanterior( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior ;
   }

   public void setHuellafacturaanterior( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior = value ;
   }

   public String getHuellafactura( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura ;
   }

   public void setHuellafactura( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura = value ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_N ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura ;
   protected app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura gxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura=null ;
   protected app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura gxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura=null ;
   protected app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_Receptor gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor=null ;
}

