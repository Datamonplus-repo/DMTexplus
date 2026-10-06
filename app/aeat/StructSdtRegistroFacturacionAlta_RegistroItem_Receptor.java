package app.aeat ;
import com.genexus.*;

public final  class StructSdtRegistroFacturacionAlta_RegistroItem_Receptor implements Cloneable, java.io.Serializable
{
   public StructSdtRegistroFacturacionAlta_RegistroItem_Receptor( )
   {
      this( -1, new ModelContext( StructSdtRegistroFacturacionAlta_RegistroItem_Receptor.class ));
   }

   public StructSdtRegistroFacturacionAlta_RegistroItem_Receptor( int remoteHandle ,
                                                                  ModelContext context )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon = "" ;
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
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif ;
   }

   public void setNif( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif = value ;
   }

   public String getNombrerazon( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon ;
   }

   public void setNombrerazon( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon = value ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_N ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon ;
}

