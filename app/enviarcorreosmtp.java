package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class enviarcorreosmtp extends GXProcedure
{
   public enviarcorreosmtp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( enviarcorreosmtp.class ), "" );
   }

   public enviarcorreosmtp( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( GXSimpleCollection<com.genexus.internet.MailRecipient> aP0 ,
                             GXSimpleCollection<com.genexus.internet.MailRecipient> aP1 ,
                             GXSimpleCollection<com.genexus.internet.MailRecipient> aP2 ,
                             String aP3 ,
                             String aP4 ,
                             GXSimpleCollection<String> aP5 ,
                             long[] aP6 )
   {
      enviarcorreosmtp.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( GXSimpleCollection<com.genexus.internet.MailRecipient> aP0 ,
                        GXSimpleCollection<com.genexus.internet.MailRecipient> aP1 ,
                        GXSimpleCollection<com.genexus.internet.MailRecipient> aP2 ,
                        String aP3 ,
                        String aP4 ,
                        GXSimpleCollection<String> aP5 ,
                        long[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( GXSimpleCollection<com.genexus.internet.MailRecipient> aP0 ,
                             GXSimpleCollection<com.genexus.internet.MailRecipient> aP1 ,
                             GXSimpleCollection<com.genexus.internet.MailRecipient> aP2 ,
                             String aP3 ,
                             String aP4 ,
                             GXSimpleCollection<String> aP5 ,
                             long[] aP6 ,
                             String[] aP7 )
   {
      enviarcorreosmtp.this.AV20CorreosDestino = aP0;
      enviarcorreosmtp.this.AV18CorreosCopia = aP1;
      enviarcorreosmtp.this.AV19CorreosCopiaOculta = aP2;
      enviarcorreosmtp.this.AV11Asunto = aP3;
      enviarcorreosmtp.this.AV29HTMLTexto = aP4;
      enviarcorreosmtp.this.AV33NombresAdjuntos = aP5;
      enviarcorreosmtp.this.aP6 = aP6;
      enviarcorreosmtp.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV25EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      enviarcorreosmtp.this.GXt_char1 = GXv_char2[0] ;
      AV25EmprCod = GXt_char1 ;
      GXt_char1 = AV27Host ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAISVR", GXv_char2) ;
      enviarcorreosmtp.this.GXt_char1 = GXv_char2[0] ;
      AV27Host = GXt_char1 ;
      GXt_int3 = AV28HostPort ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( AV25EmprCod, "MAISVR", GXv_int4) ;
      enviarcorreosmtp.this.GXt_int3 = GXv_int4[0] ;
      AV28HostPort = GXt_int3 ;
      AV28HostPort = ((0==AV28HostPort) ? 465 : AV28HostPort) ;
      GXt_char1 = AV37Remitente ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAIDE", GXv_char2) ;
      enviarcorreosmtp.this.GXt_char1 = GXv_char2[0] ;
      AV37Remitente = GXt_char1 ;
      GXt_char1 = AV38Remitentemail ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAIDEM", GXv_char2) ;
      enviarcorreosmtp.this.GXt_char1 = GXv_char2[0] ;
      AV38Remitentemail = GXt_char1 ;
      GXt_int3 = AV30MailLogin ;
      GXv_char2[0] = AV25EmprCod ;
      GXv_char5[0] = "MAIUSR" ;
      GXv_int4[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_int4) ;
      enviarcorreosmtp.this.AV25EmprCod = GXv_char2[0] ;
      enviarcorreosmtp.this.GXt_int3 = GXv_int4[0] ;
      AV30MailLogin = (byte)(GXt_int3) ;
      GXt_char1 = AV31MailType ;
      GXv_char5[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAITYP", GXv_char5) ;
      enviarcorreosmtp.this.GXt_char1 = GXv_char5[0] ;
      AV31MailType = GXt_char1 ;
      if ( GXutil.strcmp(AV31MailType, "SMTP") == 0 )
      {
         if ( AV30MailLogin == 1 )
         {
            GXt_char1 = AV43usuarioAutentificacion ;
            GXv_char5[0] = GXt_char1 ;
            new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAIUSR", GXv_char5) ;
            enviarcorreosmtp.this.GXt_char1 = GXv_char5[0] ;
            AV43usuarioAutentificacion = GXt_char1 ;
            GXt_char1 = AV36passwordAutentificacion ;
            GXv_char5[0] = GXt_char1 ;
            new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAIPSW", GXv_char5) ;
            enviarcorreosmtp.this.GXt_char1 = GXv_char5[0] ;
            AV36passwordAutentificacion = GXt_char1 ;
         }
         AV16CodigoErrorEnvio = 999999 ;
         AV21DescripcionErrorEnvio = "" ;
         AV12BandejaSalida.setHost( GXutil.trim( AV27Host) );
         AV12BandejaSalida.setPort( AV28HostPort );
         AV12BandejaSalida.setTimeout( (short)(300) );
         AV12BandejaSalida.setAuthentication( (short)(1) );
         AV12BandejaSalida.setSecure( (short)(1) );
         AV12BandejaSalida.setUserName( GXutil.trim( AV43usuarioAutentificacion) );
         AV12BandejaSalida.setPassword( GXutil.trim( AV36passwordAutentificacion) );
         AV12BandejaSalida.getSender().setName( GXutil.trim( AV37Remitente) );
         AV12BandejaSalida.getSender().setAddress( GXutil.trim( AV38Remitentemail) );
         /* Execute user subroutine: 'DETERMINAR DIRECCIONES DE CORREO A ENVIAR' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ! (GXutil.strcmp("", AV21DescripcionErrorEnvio)==0) )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV18CorreosCopia.size() > 0 )
         {
         }
         if ( AV19CorreosCopiaOculta.size() > 0 )
         {
         }
         if ( AV33NombresAdjuntos.size() > 0 )
         {
            AV50GXV1 = 1 ;
            while ( AV50GXV1 <= AV33NombresAdjuntos.size() )
            {
               AV8Adjunto = (String)AV33NombresAdjuntos.elementAt(-1+AV50GXV1) ;
               AV9AdjuntoFile.setSource( AV8Adjunto );
               if ( AV9AdjuntoFile.exists() )
               {
                  AV32MensajeCorreo.getAttachments().add(AV8Adjunto);
               }
               AV50GXV1 = (int)(AV50GXV1+1) ;
            }
         }
         AV32MensajeCorreo.getFrom().setName( GXutil.trim( AV37Remitente) );
         AV32MensajeCorreo.getFrom().setAddress( GXutil.trim( AV38Remitentemail) );
         AV32MensajeCorreo.setSubject( AV11Asunto );
         AV32MensajeCorreo.setHtmltext( AV29HTMLTexto );
         AV12BandejaSalida.login();
         if ( (0==AV12BandejaSalida.getErrCode()) )
         {
            AV12BandejaSalida.send(AV32MensajeCorreo);
            AV16CodigoErrorEnvio = AV12BandejaSalida.getErrCode() ;
            AV21DescripcionErrorEnvio = AV12BandejaSalida.getErrDescription() ;
            if ( (0==AV16CodigoErrorEnvio) )
            {
               AV21DescripcionErrorEnvio = "Mail enviado ... " ;
            }
            AV12BandejaSalida.logout();
         }
         else
         {
            AV16CodigoErrorEnvio = AV12BandejaSalida.getErrCode() ;
            AV21DescripcionErrorEnvio = AV12BandejaSalida.getErrDescription() ;
         }
      }
      else
      {
         AV21DescripcionErrorEnvio = AV51Pgmname + " No está diseñado para Mail tipo :  " + GXutil.trim( AV31MailType) + httpContext.getMessage( ", o no se encuentra definido. Contacte al Administrador.", "") ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'DETERMINAR DIRECCIONES DE CORREO A ENVIAR' Routine */
      returnInSub = false ;
      AV45TotalCargados = (short)(0) ;
      System.out.println( "-----------------------------" );
      System.out.println( AV20CorreosDestino.toJSonString(false) );
      System.out.println( "-----------------------------" );
      if ( AV20CorreosDestino.size() > 0 )
      {
         AV52GXV2 = 1 ;
         while ( AV52GXV2 <= AV20CorreosDestino.size() )
         {
            AV24DireccionCorreoDestino = (com.genexus.internet.MailRecipient)AV20CorreosDestino.elementAt(-1+AV52GXV2);
            if ( ! (GXutil.strcmp("", AV24DireccionCorreoDestino.getAddress())==0) )
            {
               if ( (GXutil.strcmp("", AV24DireccionCorreoDestino.getName())==0) )
               {
                  AV24DireccionCorreoDestino.setName( GXutil.trim( AV24DireccionCorreoDestino.getAddress()) );
               }
               AV32MensajeCorreo.getTo().add(AV24DireccionCorreoDestino);
               AV45TotalCargados = (short)(AV45TotalCargados+1) ;
            }
            AV52GXV2 = (int)(AV52GXV2+1) ;
         }
      }
      if ( (0==AV45TotalCargados) )
      {
         AV21DescripcionErrorEnvio = "Se requiere al menos una Dirección de Correo Destinatario" ;
      }
   }

   protected void cleanup( )
   {
      this.aP6[0] = enviarcorreosmtp.this.AV16CodigoErrorEnvio;
      this.aP7[0] = enviarcorreosmtp.this.AV21DescripcionErrorEnvio;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21DescripcionErrorEnvio = "" ;
      AV25EmprCod = "" ;
      AV27Host = "" ;
      AV37Remitente = "" ;
      AV38Remitentemail = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new int[1] ;
      AV31MailType = "" ;
      AV43usuarioAutentificacion = "" ;
      AV36passwordAutentificacion = "" ;
      GXt_char1 = "" ;
      GXv_char5 = new String[1] ;
      AV12BandejaSalida = new com.genexus.internet.GXSMTPSession();
      AV8Adjunto = "" ;
      AV9AdjuntoFile = new com.genexus.util.GXFile();
      AV32MensajeCorreo = new com.genexus.internet.GXMailMessage();
      AV51Pgmname = "" ;
      AV24DireccionCorreoDestino = new com.genexus.internet.MailRecipient();
      AV51Pgmname = "EnviarCorreoSMTP" ;
      /* GeneXus formulas. */
      AV51Pgmname = "EnviarCorreoSMTP" ;
      Gx_err = (short)(0) ;
   }

   private byte AV30MailLogin ;
   private short AV45TotalCargados ;
   private short Gx_err ;
   private int AV28HostPort ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int AV50GXV1 ;
   private int AV52GXV2 ;
   private long AV16CodigoErrorEnvio ;
   private String AV25EmprCod ;
   private String AV27Host ;
   private String AV37Remitente ;
   private String AV38Remitentemail ;
   private String GXv_char2[] ;
   private String AV31MailType ;
   private String AV43usuarioAutentificacion ;
   private String AV36passwordAutentificacion ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String AV51Pgmname ;
   private boolean returnInSub ;
   private String AV29HTMLTexto ;
   private String AV11Asunto ;
   private String AV21DescripcionErrorEnvio ;
   private String AV8Adjunto ;
   private com.genexus.internet.GXSMTPSession AV12BandejaSalida ;
   private com.genexus.util.GXFile AV9AdjuntoFile ;
   private String[] aP7 ;
   private long[] aP6 ;
   private com.genexus.internet.MailRecipient AV24DireccionCorreoDestino ;
   private com.genexus.internet.GXMailMessage AV32MensajeCorreo ;
   private GXSimpleCollection<String> AV33NombresAdjuntos ;
   private GXSimpleCollection<com.genexus.internet.MailRecipient> AV20CorreosDestino ;
   private GXSimpleCollection<com.genexus.internet.MailRecipient> AV18CorreosCopia ;
   private GXSimpleCollection<com.genexus.internet.MailRecipient> AV19CorreosCopiaOculta ;
}

