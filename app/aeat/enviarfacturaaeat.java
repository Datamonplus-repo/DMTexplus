package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class enviarfacturaaeat extends GXProcedure
{
   public enviarfacturaaeat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( enviarfacturaaeat.class ), "" );
   }

   public enviarfacturaaeat( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      enviarfacturaaeat.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( int aP0 ,
                        long[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( int aP0 ,
                             long[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      enviarfacturaaeat.this.AV8FacCod = aP0;
      enviarfacturaaeat.this.aP1 = aP1;
      enviarfacturaaeat.this.aP2 = aP2;
      enviarfacturaaeat.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV9EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      enviarfacturaaeat.this.GXt_char1 = GXv_char2[0] ;
      AV9EmprCod = GXt_char1 ;
      AV21ResultadoEnviarFacturaAEAT = "" ;
      GXv_boolean3[0] = AV12IsPending ;
      GXv_char2[0] = AV14MessagePending ;
      new app.aeat.aeat_validar_faccod(remoteHandle, context).execute( AV8FacCod, GXv_boolean3, GXv_char2) ;
      enviarfacturaaeat.this.AV12IsPending = GXv_boolean3[0] ;
      enviarfacturaaeat.this.AV14MessagePending = GXv_char2[0] ;
      /* Execute user subroutine: 'LECTURA PARÁMETROS AETPFX Y AETKEY' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( (0==AV8FacCod) )
      {
         AV21ResultadoEnviarFacturaAEAT = httpContext.getMessage( "?? Se requiere Codigo Factura", "") ;
      }
      else if ( ! AV12IsPending )
      {
         AV21ResultadoEnviarFacturaAEAT = "??" + AV14MessagePending ;
      }
      else if ( (GXutil.strcmp("", AV27pfxPath)==0) )
      {
         AV21ResultadoEnviarFacturaAEAT = httpContext.getMessage( "?? Se requiere Ruta del PFX para gestionar el envío. Revisar parámetro AETPFX", "") ;
      }
      else if ( ! ( GXutil.fileExists( AV27pfxPath) == 1 ) )
      {
         AV21ResultadoEnviarFacturaAEAT = httpContext.getMessage( "?? Ajustar parámetro AETPFX o revisar directorio o permisos para archivo pfx en ", "") + GXutil.trim( AV27pfxPath) ;
      }
      else if ( (GXutil.strcmp("", AV26ContDsc2)==0) )
      {
         AV21ResultadoEnviarFacturaAEAT = httpContext.getMessage( "?? Se requiere key del PFX para gestionar el envío. Revisar parámetro AETKEY", "") ;
      }
      else if ( (GXutil.strcmp("", AV28pfxPassword)==0) )
      {
         AV21ResultadoEnviarFacturaAEAT = httpContext.getMessage( "?? No se logra recuperar key del PFX para gestionar el envío. Revisar parámetro AETKEY", "") ;
      }
      else
      {
         /* Execute user subroutine: 'DOXMLFACTURA' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXt_char1 = AV24xmlRespuesta ;
         GXv_char2[0] = GXt_char1 ;
         new app.aeat.run_altafactura(remoteHandle, context).execute( AV27pfxPath, AV28pfxPassword, AV18RegistroFacturacionAltaXML, GXv_char2) ;
         enviarfacturaaeat.this.GXt_char1 = GXv_char2[0] ;
         AV24xmlRespuesta = GXt_char1 ;
         AV19RespuestaRegistroFacturacionAlta.fromxml(AV24xmlRespuesta, null, null);
         AV21ResultadoEnviarFacturaAEAT = GXutil.trim( AV24xmlRespuesta) ;
         AV10exito = (boolean)((((GXutil.strSearch( AV24xmlRespuesta, "Correcto", 1)>0) ? 200 : -1)==0)?false:true) ;
         AV13IsSuccess = false ;
         if ( AV10exito )
         {
            if ( GXutil.strcmp(AV19RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro(), httpContext.getMessage( "Correcto", "")) == 0 )
            {
               AV13IsSuccess = true ;
               AV21ResultadoEnviarFacturaAEAT = httpContext.getMessage( "Envío aceptado. CSV: ", "") + AV19RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Csv() ;
            }
            else
            {
               AV35GXV1 = 1 ;
               while ( AV35GXV1 <= AV19RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Errores().size() )
               {
                  AV20RespuestaRegistroFacturacionAltaErrores = (app.aeat.SdtErrorType)((app.aeat.SdtErrorType)AV19RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Errores().elementAt(-1+AV35GXV1));
                  AV21ResultadoEnviarFacturaAEAT = httpContext.getMessage( "? Error: ", "") + AV20RespuestaRegistroFacturacionAltaErrores.getgxTv_SdtErrorType_Codigoerror() + " - " + AV20RespuestaRegistroFacturacionAltaErrores.getgxTv_SdtErrorType_Descripcionerror() + GXutil.newLine( ) ;
                  AV35GXV1 = (int)(AV35GXV1+1) ;
               }
            }
         }
         else
         {
            AV21ResultadoEnviarFacturaAEAT = (!(GXutil.strcmp("", AV24xmlRespuesta)==0) ? GXutil.trim( AV24xmlRespuesta) : httpContext.getMessage( "?? Fallo técnico en la conexión o estructura del XML.", "")) ;
         }
         GXv_boolean3[0] = AV13IsSuccess ;
         GXv_char2[0] = AV14MessagePending ;
         new app.aeat.registraraeathistoricocfaven(remoteHandle, context).execute( AV18RegistroFacturacionAltaXML, AV24xmlRespuesta, GXv_boolean3, GXv_char2) ;
         enviarfacturaaeat.this.AV13IsSuccess = GXv_boolean3[0] ;
         enviarfacturaaeat.this.AV14MessagePending = GXv_char2[0] ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "RegistrarAEATHistoricoCFAVEN ", "")+AV14MessagePending);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'DOXMLFACTURA' Routine */
      returnInSub = false ;
      GXt_SdtRegistroFacturacionAlta4 = AV15RegistroFacturacionAlta;
      GXv_SdtRegistroFacturacionAlta5[0] = GXt_SdtRegistroFacturacionAlta4;
      new app.aeat.cfaven_alta_aeat_json(remoteHandle, context).execute( AV9EmprCod, AV8FacCod, GXv_SdtRegistroFacturacionAlta5) ;
      GXt_SdtRegistroFacturacionAlta4 = GXv_SdtRegistroFacturacionAlta5[0] ;
      AV15RegistroFacturacionAlta = GXt_SdtRegistroFacturacionAlta4;
      AV18RegistroFacturacionAltaXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + GXutil.newLine( ) ;
      AV18RegistroFacturacionAltaXML += AV15RegistroFacturacionAlta.toxml(false, true, "RegistroFacturacionAlta", "https://www.agenciatributaria.gob.es/sif/verifactu") ;
   }

   public void S121( )
   {
      /* 'LECTURA PARÁMETROS AETPFX Y AETKEY' Routine */
      returnInSub = false ;
      AV25ContCod = "AETPFX" ;
      GXt_char1 = AV27pfxPath ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV9EmprCod, AV25ContCod, GXv_char2) ;
      enviarfacturaaeat.this.GXt_char1 = GXv_char2[0] ;
      AV27pfxPath = GXt_char1 ;
      AV25ContCod = "AETKEY" ;
      AV28pfxPassword = "" ;
      GXt_char1 = AV26ContDsc2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV9EmprCod, AV25ContCod, GXv_char2) ;
      enviarfacturaaeat.this.GXt_char1 = GXv_char2[0] ;
      AV26ContDsc2 = GXt_char1 ;
      AV26ContDsc2 = GXutil.trim( AV26ContDsc2) ;
      AV29Separador = "|" ;
      AV30Posicion = GXutil.strSearch( GXutil.trim( AV26ContDsc2), AV29Separador, 1) ;
      if ( AV30Posicion <= 1 )
      {
         AV28pfxPassword = GXutil.trim( AV26ContDsc2) ;
      }
      else
      {
         AV32Largo = (int)(AV30Posicion-1) ;
         AV36Decryptkey = GXutil.substring( GXutil.trim( AV26ContDsc2), 1, AV32Largo) ;
         AV30Posicion = (int)(AV30Posicion+1) ;
         AV32Largo = GXutil.len( GXutil.trim( AV26ContDsc2)) ;
         AV31DecryptData = GXutil.substring( GXutil.trim( AV26ContDsc2), AV30Posicion, AV32Largo) ;
         AV28pfxPassword = httpContext.decrypt64( AV31DecryptData, AV36Decryptkey) ;
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = enviarfacturaaeat.this.AV22StatusCode;
      this.aP2[0] = enviarfacturaaeat.this.AV24xmlRespuesta;
      this.aP3[0] = enviarfacturaaeat.this.AV14MessagePending;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24xmlRespuesta = "" ;
      AV14MessagePending = "" ;
      AV9EmprCod = "" ;
      AV21ResultadoEnviarFacturaAEAT = "" ;
      AV27pfxPath = "" ;
      AV26ContDsc2 = "" ;
      AV28pfxPassword = "" ;
      AV18RegistroFacturacionAltaXML = "" ;
      AV19RespuestaRegistroFacturacionAlta = new app.aeat.SdtRespuestaRegistroFacturacionAlta(remoteHandle, context);
      AV20RespuestaRegistroFacturacionAltaErrores = new app.aeat.SdtErrorType(remoteHandle, context);
      GXv_boolean3 = new boolean[1] ;
      AV15RegistroFacturacionAlta = new app.aeat.SdtRegistroFacturacionAlta(remoteHandle, context);
      GXt_SdtRegistroFacturacionAlta4 = new app.aeat.SdtRegistroFacturacionAlta(remoteHandle, context);
      GXv_SdtRegistroFacturacionAlta5 = new app.aeat.SdtRegistroFacturacionAlta[1] ;
      AV25ContCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV29Separador = "" ;
      AV36Decryptkey = "" ;
      AV31DecryptData = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8FacCod ;
   private int AV35GXV1 ;
   private int AV30Posicion ;
   private int AV32Largo ;
   private long AV22StatusCode ;
   private String AV9EmprCod ;
   private String AV26ContDsc2 ;
   private String AV25ContCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV36Decryptkey ;
   private boolean AV12IsPending ;
   private boolean returnInSub ;
   private boolean AV10exito ;
   private boolean AV13IsSuccess ;
   private boolean GXv_boolean3[] ;
   private String AV24xmlRespuesta ;
   private String AV21ResultadoEnviarFacturaAEAT ;
   private String AV14MessagePending ;
   private String AV27pfxPath ;
   private String AV28pfxPassword ;
   private String AV18RegistroFacturacionAltaXML ;
   private String AV29Separador ;
   private String AV31DecryptData ;
   private String[] aP3 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private app.aeat.SdtRegistroFacturacionAlta AV15RegistroFacturacionAlta ;
   private app.aeat.SdtRegistroFacturacionAlta GXt_SdtRegistroFacturacionAlta4 ;
   private app.aeat.SdtRegistroFacturacionAlta GXv_SdtRegistroFacturacionAlta5[] ;
   private app.aeat.SdtRespuestaRegistroFacturacionAlta AV19RespuestaRegistroFacturacionAlta ;
   private app.aeat.SdtErrorType AV20RespuestaRegistroFacturacionAltaErrores ;
}

