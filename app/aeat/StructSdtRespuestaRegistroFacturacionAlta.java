package app.aeat ;
import com.genexus.*;

public final  class StructSdtRespuestaRegistroFacturacionAlta implements Cloneable, java.io.Serializable
{
   public StructSdtRespuestaRegistroFacturacionAlta( )
   {
      this( -1, new ModelContext( StructSdtRespuestaRegistroFacturacionAlta.class ));
   }

   public StructSdtRespuestaRegistroFacturacionAlta( int remoteHandle ,
                                                     ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro = "" ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Csv = "" ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion = cal.getTime() ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N = (byte)(1) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_N = (byte)(1) ;
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

   public String getEstadoregistro( )
   {
      return gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro ;
   }

   public void setEstadoregistro( String value )
   {
      gxTv_SdtRespuestaRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro = value ;
   }

   public String getCsv( )
   {
      return gxTv_SdtRespuestaRegistroFacturacionAlta_Csv ;
   }

   public void setCsv( String value )
   {
      gxTv_SdtRespuestaRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Csv = value ;
   }

   public java.util.Date getFecharecepcion( )
   {
      return gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion ;
   }

   public void setFecharecepcion( java.util.Date value )
   {
      gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion = value ;
   }

   public java.util.Vector<app.aeat.StructSdtErrorType> getErrores( )
   {
      return gxTv_SdtRespuestaRegistroFacturacionAlta_Errores ;
   }

   public void setErrores( java.util.Vector<app.aeat.StructSdtErrorType> value )
   {
      gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRespuestaRegistroFacturacionAlta_Errores = value ;
   }

   protected byte gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion_N ;
   protected byte gxTv_SdtRespuestaRegistroFacturacionAlta_Errores_N ;
   protected byte gxTv_SdtRespuestaRegistroFacturacionAlta_N ;
   protected String gxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro ;
   protected String gxTv_SdtRespuestaRegistroFacturacionAlta_Csv ;
   protected java.util.Date gxTv_SdtRespuestaRegistroFacturacionAlta_Fecharecepcion ;
   protected java.util.Vector<app.aeat.StructSdtErrorType> gxTv_SdtRespuestaRegistroFacturacionAlta_Errores=null ;
}

