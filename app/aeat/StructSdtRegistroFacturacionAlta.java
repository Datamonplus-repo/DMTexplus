package app.aeat ;
import com.genexus.*;

public final  class StructSdtRegistroFacturacionAlta implements Cloneable, java.io.Serializable
{
   public StructSdtRegistroFacturacionAlta( )
   {
      this( -1, new ModelContext( StructSdtRegistroFacturacionAlta.class ));
   }

   public StructSdtRegistroFacturacionAlta( int remoteHandle ,
                                            ModelContext context )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_Registro_N = (byte)(1) ;
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

   public app.aeat.StructSdtRegistroFacturacionAlta_Cabecera getCabecera( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera ;
   }

   public void setCabecera( app.aeat.StructSdtRegistroFacturacionAlta_Cabecera value )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera = value;
   }

   public java.util.Vector<app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem> getRegistro( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Registro ;
   }

   public void setRegistro( java.util.Vector<app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem> value )
   {
      gxTv_SdtRegistroFacturacionAlta_Registro_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Registro = value ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_Cabecera_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_Registro_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_N ;
   protected app.aeat.StructSdtRegistroFacturacionAlta_Cabecera gxTv_SdtRegistroFacturacionAlta_Cabecera=null ;
   protected java.util.Vector<app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem> gxTv_SdtRegistroFacturacionAlta_Registro=null ;
}

