package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psend_email extends GXProcedure
{
   public psend_email( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psend_email.class ), "" );
   }

   public psend_email( int remoteHandle ,
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
                             GXBaseCollection<app.SdtFileUploadFiles_File> aP5 ,
                             long[] aP6 )
   {
      psend_email.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( GXSimpleCollection<com.genexus.internet.MailRecipient> aP0 ,
                        GXSimpleCollection<com.genexus.internet.MailRecipient> aP1 ,
                        GXSimpleCollection<com.genexus.internet.MailRecipient> aP2 ,
                        String aP3 ,
                        String aP4 ,
                        GXBaseCollection<app.SdtFileUploadFiles_File> aP5 ,
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
                             GXBaseCollection<app.SdtFileUploadFiles_File> aP5 ,
                             long[] aP6 ,
                             String[] aP7 )
   {
      psend_email.this.AV20CorreosDestino = aP0;
      psend_email.this.AV18CorreosCopia = aP1;
      psend_email.this.AV19CorreosCopiaOculta = aP2;
      psend_email.this.AV11Asunto = aP3;
      psend_email.this.AV29HTMLTexto = aP4;
      psend_email.this.AV47FileUploadFiles = aP5;
      psend_email.this.aP6 = aP6;
      psend_email.this.aP7 = aP7;
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
      psend_email.this.GXt_char1 = GXv_char2[0] ;
      AV25EmprCod = GXt_char1 ;
      GXt_char1 = AV27Host ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAISVR", GXv_char2) ;
      psend_email.this.GXt_char1 = GXv_char2[0] ;
      AV27Host = GXt_char1 ;
      GXt_int3 = AV28HostPort ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( AV25EmprCod, "MAISVR", GXv_int4) ;
      psend_email.this.GXt_int3 = GXv_int4[0] ;
      AV28HostPort = GXt_int3 ;
      AV28HostPort = ((0==AV28HostPort) ? 465 : AV28HostPort) ;
      GXt_char1 = AV37Remitente ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAIDE", GXv_char2) ;
      psend_email.this.GXt_char1 = GXv_char2[0] ;
      AV37Remitente = GXt_char1 ;
      GXt_char1 = AV38Remitentemail ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAIDEM", GXv_char2) ;
      psend_email.this.GXt_char1 = GXv_char2[0] ;
      AV38Remitentemail = GXt_char1 ;
      GXt_int3 = AV30MailLogin ;
      GXv_char2[0] = AV25EmprCod ;
      GXv_char5[0] = "MAIUSR" ;
      GXv_int4[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_int4) ;
      psend_email.this.AV25EmprCod = GXv_char2[0] ;
      psend_email.this.GXt_int3 = GXv_int4[0] ;
      AV30MailLogin = (byte)(GXt_int3) ;
      GXt_char1 = AV31MailType ;
      GXv_char5[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAITYP", GXv_char5) ;
      psend_email.this.GXt_char1 = GXv_char5[0] ;
      AV31MailType = GXt_char1 ;
      if ( GXutil.strcmp(AV31MailType, "SMTP") == 0 )
      {
         if ( AV30MailLogin == 1 )
         {
            GXt_char1 = AV44usuarioAutentificacion ;
            GXv_char5[0] = GXt_char1 ;
            new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAIUSR", GXv_char5) ;
            psend_email.this.GXt_char1 = GXv_char5[0] ;
            AV44usuarioAutentificacion = GXt_char1 ;
            GXt_char1 = AV36passwordAutentificacion ;
            GXv_char5[0] = GXt_char1 ;
            new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAIPSW", GXv_char5) ;
            psend_email.this.GXt_char1 = GXv_char5[0] ;
            AV36passwordAutentificacion = GXt_char1 ;
         }
         AV16CodigoErrorEnvio = 999999 ;
         AV21DescripcionErrorEnvio = "" ;
         AV12BandejaSalida.setHost( GXutil.trim( AV27Host) );
         AV12BandejaSalida.setPort( AV28HostPort );
         AV12BandejaSalida.setTimeout( (short)(300) );
         AV12BandejaSalida.setAuthentication( (short)(1) );
         AV12BandejaSalida.setSecure( (short)(1) );
         AV12BandejaSalida.setUserName( GXutil.trim( AV44usuarioAutentificacion) );
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
         /* User Code */
          try {
         AV54GXV1 = 1 ;
         while ( AV54GXV1 <= AV18CorreosCopia.size() )
         {
            AV22DireccionCorreoCopia = (com.genexus.internet.MailRecipient)AV18CorreosCopia.elementAt(-1+AV54GXV1);
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write("--------------------", httpContext.getMessage( "CorreosCopia", ""), (short)(10)) ;
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV22DireccionCorreoCopia.getAddress()+"-"+AV22DireccionCorreoCopia.getName(), httpContext.getMessage( "CorreosCopia", ""), (short)(10)) ;
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write("--------------------", httpContext.getMessage( "CorreosCopia", ""), (short)(10)) ;
            AV54GXV1 = (int)(AV54GXV1+1) ;
         }
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV18CorreosCopia.toJSonString(false), httpContext.getMessage( "CorreosCopia", ""), (short)(10)) ;
         /* User Code */
          } catch (Exception e) {
         /* User Code */
          System.out.println("psend_email -> Correo Copia");
         /* User Code */
          System.out.println(e.getMessage());
         /* User Code */
          }
         /* User Code */
          try {
         if ( AV19CorreosCopiaOculta.size() > 0 )
         {
            AV55GXV2 = 1 ;
            while ( AV55GXV2 <= AV19CorreosCopiaOculta.size() )
            {
               AV23DireccionCorreoCopiaOculta = (com.genexus.internet.MailRecipient)AV19CorreosCopiaOculta.elementAt(-1+AV55GXV2);
               if ( ! (GXutil.strcmp("", AV23DireccionCorreoCopiaOculta.getAddress())==0) )
               {
                  AV32MensajeCorreo.getBcc().addNew(AV23DireccionCorreoCopiaOculta.getName(), AV23DireccionCorreoCopiaOculta.getAddress()) ;
               }
               AV55GXV2 = (int)(AV55GXV2+1) ;
            }
         }
         /* User Code */
          } catch (Exception e) {
         /* User Code */
          System.out.println("psend_email -> Correo Copia Oculta");
         /* User Code */
          System.out.println(e.getMessage());
         /* User Code */
          }
         /* User Code */
          try {
         if ( AV47FileUploadFiles.size() > 0 )
         {
            AV56GXV3 = 1 ;
            while ( AV56GXV3 <= AV47FileUploadFiles.size() )
            {
               AV48FileUploadFile = (app.SdtFileUploadFiles_File)((app.SdtFileUploadFiles_File)AV47FileUploadFiles.elementAt(-1+AV56GXV3));
               AV32MensajeCorreo.getAttachments().add(AV48FileUploadFile.getgxTv_SdtFileUploadFiles_File_Path());
               AV56GXV3 = (int)(AV56GXV3+1) ;
            }
         }
         /* User Code */
          } catch (Exception e) {
         /* User Code */
          System.out.println("psend_email -> Correo Attached file ");
         /* User Code */
          System.out.println(e.getMessage());
         /* User Code */
          }
         AV32MensajeCorreo.getFrom().setName( AV37Remitente );
         AV32MensajeCorreo.getFrom().setAddress( AV38Remitentemail );
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
         AV21DescripcionErrorEnvio = AV57Pgmname + " No está diseñado para Mail tipo :  " + GXutil.trim( AV31MailType) + httpContext.getMessage( ", o no se encuentra definido. Contacte al Administrador.", "") ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'DETERMINAR DIRECCIONES DE CORREO A ENVIAR' Routine */
      returnInSub = false ;
      AV43TotalCargados = (short)(0) ;
      if ( AV20CorreosDestino.size() > 0 )
      {
         AV58GXV4 = 1 ;
         while ( AV58GXV4 <= AV20CorreosDestino.size() )
         {
            AV24DireccionCorreoDestino = (com.genexus.internet.MailRecipient)AV20CorreosDestino.elementAt(-1+AV58GXV4);
            if ( ! (GXutil.strcmp("", AV24DireccionCorreoDestino.getAddress())==0) )
            {
               if ( (GXutil.strcmp("", AV24DireccionCorreoDestino.getName())==0) )
               {
                  AV24DireccionCorreoDestino.setName( GXutil.trim( AV24DireccionCorreoDestino.getAddress()) );
               }
               else
               {
                  AV32MensajeCorreo.getTo().addNew(AV24DireccionCorreoDestino.getName(), AV24DireccionCorreoDestino.getAddress()) ;
                  AV43TotalCargados = (short)(AV43TotalCargados+1) ;
               }
            }
            AV58GXV4 = (int)(AV58GXV4+1) ;
         }
      }
      if ( (0==AV43TotalCargados) )
      {
         AV21DescripcionErrorEnvio = "Se requiere al menos una Dirección de Correo Destinatario" ;
      }
   }

   protected void cleanup( )
   {
      this.aP6[0] = psend_email.this.AV16CodigoErrorEnvio;
      this.aP7[0] = psend_email.this.AV21DescripcionErrorEnvio;
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
      AV44usuarioAutentificacion = "" ;
      AV36passwordAutentificacion = "" ;
      GXt_char1 = "" ;
      GXv_char5 = new String[1] ;
      AV12BandejaSalida = new com.genexus.internet.GXSMTPSession();
      AV22DireccionCorreoCopia = new com.genexus.internet.MailRecipient();
      AV23DireccionCorreoCopiaOculta = new com.genexus.internet.MailRecipient();
      AV32MensajeCorreo = new com.genexus.internet.GXMailMessage();
      AV48FileUploadFile = new app.SdtFileUploadFiles_File(remoteHandle, context);
      AV57Pgmname = "" ;
      AV24DireccionCorreoDestino = new com.genexus.internet.MailRecipient();
      AV57Pgmname = "psend_email" ;
      /* GeneXus formulas. */
      AV57Pgmname = "psend_email" ;
      Gx_err = (short)(0) ;
   }

   private byte AV30MailLogin ;
   private short AV43TotalCargados ;
   private short Gx_err ;
   private int AV28HostPort ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int AV54GXV1 ;
   private int AV55GXV2 ;
   private int AV56GXV3 ;
   private int AV58GXV4 ;
   private long AV16CodigoErrorEnvio ;
   private String AV25EmprCod ;
   private String AV27Host ;
   private String AV37Remitente ;
   private String AV38Remitentemail ;
   private String GXv_char2[] ;
   private String AV31MailType ;
   private String AV44usuarioAutentificacion ;
   private String AV36passwordAutentificacion ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String AV57Pgmname ;
   private boolean returnInSub ;
   private String AV29HTMLTexto ;
   private String AV11Asunto ;
   private String AV21DescripcionErrorEnvio ;
   private com.genexus.internet.GXMailMessage AV32MensajeCorreo ;
   private com.genexus.internet.GXSMTPSession AV12BandejaSalida ;
   private String[] aP7 ;
   private long[] aP6 ;
   private com.genexus.internet.MailRecipient AV22DireccionCorreoCopia ;
   private com.genexus.internet.MailRecipient AV23DireccionCorreoCopiaOculta ;
   private com.genexus.internet.MailRecipient AV24DireccionCorreoDestino ;
   private GXBaseCollection<app.SdtFileUploadFiles_File> AV47FileUploadFiles ;
   private GXSimpleCollection<com.genexus.internet.MailRecipient> AV20CorreosDestino ;
   private GXSimpleCollection<com.genexus.internet.MailRecipient> AV18CorreosCopia ;
   private GXSimpleCollection<com.genexus.internet.MailRecipient> AV19CorreosCopiaOculta ;
   private app.SdtFileUploadFiles_File AV48FileUploadFile ;
}

