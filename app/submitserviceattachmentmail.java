package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class submitserviceattachmentmail extends GXProcedure
{
   public submitserviceattachmentmail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( submitserviceattachmentmail.class ), "" );
   }

   public submitserviceattachmentmail( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             boolean aP8 ,
                             long aP9 ,
                             String aP10 ,
                             long[] aP11 )
   {
      submitserviceattachmentmail.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        boolean aP8 ,
                        long aP9 ,
                        String aP10 ,
                        long[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             boolean aP8 ,
                             long aP9 ,
                             String aP10 ,
                             long[] aP11 ,
                             String[] aP12 )
   {
      submitserviceattachmentmail.this.AV33EmprCod = aP0;
      submitserviceattachmentmail.this.AV71TextoSeparador = aP1;
      submitserviceattachmentmail.this.AV60parametroCorreosDestinoJson = aP2;
      submitserviceattachmentmail.this.AV58parametroCorreosCopiaJson = aP3;
      submitserviceattachmentmail.this.AV59parametroCorreosCopiaOcultaJson = aP4;
      submitserviceattachmentmail.this.AV57parametroAsunto = aP5;
      submitserviceattachmentmail.this.AV61parametroTextoCorreo = aP6;
      submitserviceattachmentmail.this.AV54NombresAdjuntosJson = aP7;
      submitserviceattachmentmail.this.AV50MostrarMail = aP8;
      submitserviceattachmentmail.this.AV78Numero_documento = aP9;
      submitserviceattachmentmail.this.AV77Tipo_documento = aP10;
      submitserviceattachmentmail.this.aP11 = aP11;
      submitserviceattachmentmail.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV63PathTomcat = AV10AppTool.servletinfo() ;
      AV9AppName = AV44HTTPRequest.getRemoteAddress() ;
      /* Execute user subroutine: 'CARGAR DATOS PARAMÉTRICOS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LISTAADJUNTO' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_int1[0] = AV19CodigoErrorEnvio ;
      GXv_char2[0] = AV27DescripcionErrorEnvio ;
      new app.psend_email2(remoteHandle, context).execute( AV30Emails, AV40FileUploadFiles, GXv_int1, GXv_char2) ;
      submitserviceattachmentmail.this.AV19CodigoErrorEnvio = GXv_int1[0] ;
      submitserviceattachmentmail.this.AV27DescripcionErrorEnvio = GXv_char2[0] ;
      if ( AV19CodigoErrorEnvio == 200 )
      {
         /* Execute user subroutine: 'HISTORICOENVIOEMAIL' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CARGAR DATOS PARAMÉTRICOS' Routine */
      returnInSub = false ;
      GXt_SdtEmails3 = AV30Emails;
      GXv_SdtEmails4[0] = GXt_SdtEmails3;
      new app.dpemail(remoteHandle, context).execute( AV33EmprCod, GXv_SdtEmails4) ;
      GXt_SdtEmails3 = GXv_SdtEmails4[0] ;
      AV30Emails = GXt_SdtEmails3;
      if ( AV49ListaCorreosDestino.fromJSonString(AV60parametroCorreosDestinoJson, AV79Messages) )
      {
      }
      else
      {
         AV85GXV1 = 1 ;
         while ( AV85GXV1 <= AV79Messages.size() )
         {
            AV80Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV79Messages.elementAt(-1+AV85GXV1));
            System.out.println( GXutil.format( "%1 - %2", AV80Message.getgxTv_SdtMessages_Message_Id(), AV80Message.getgxTv_SdtMessages_Message_Description(), "", "", "", "", "", "", "") );
            AV85GXV1 = (int)(AV85GXV1+1) ;
         }
      }
      AV86GXV2 = 1 ;
      while ( AV86GXV2 <= AV49ListaCorreosDestino.size() )
      {
         AV16CadenaRegistrar = (String)AV49ListaCorreosDestino.elementAt(-1+AV86GXV2) ;
         AV64PosicionSeparador = (short)(GXutil.strSearch( AV16CadenaRegistrar, AV71TextoSeparador, 1)) ;
         AV56ParaEmail = GXutil.trim( GXutil.substring( AV16CadenaRegistrar, 1, (AV64PosicionSeparador-1))) ;
         AV64PosicionSeparador = (short)(AV64PosicionSeparador+(GXutil.len( AV71TextoSeparador))) ;
         AV62ParaNombre = GXutil.trim( GXutil.substring( AV16CadenaRegistrar, AV64PosicionSeparador, GXutil.len( AV16CadenaRegistrar))) ;
         AV8Cantidad = AV8Cantidad.add(DecimalUtil.doubleToDec(1)) ;
         AV81Emails_TO = (app.SdtEmails_TOItem)new app.SdtEmails_TOItem(remoteHandle, context);
         AV81Emails_TO.setgxTv_SdtEmails_TOItem_Name( AV62ParaNombre );
         AV81Emails_TO.setgxTv_SdtEmails_TOItem_Email( AV56ParaEmail );
         AV30Emails.getgxTv_SdtEmails_To().add(AV81Emails_TO, 0);
         AV86GXV2 = (int)(AV86GXV2+1) ;
      }
      if ( ! (GXutil.strcmp("", AV58parametroCorreosCopiaJson)==0) )
      {
         AV47ListaCorreosCopia.fromJSonString(AV58parametroCorreosCopiaJson, null);
         AV87GXV3 = 1 ;
         while ( AV87GXV3 <= AV47ListaCorreosCopia.size() )
         {
            AV16CadenaRegistrar = (String)AV47ListaCorreosCopia.elementAt(-1+AV87GXV3) ;
            AV64PosicionSeparador = (short)(GXutil.strSearch( AV16CadenaRegistrar, AV71TextoSeparador, 1)) ;
            AV20CopiaEmail = GXutil.trim( GXutil.substring( AV16CadenaRegistrar, 1, (AV64PosicionSeparador-1))) + ";" ;
            AV31Emails_CC = (app.SdtEmails_CCitem)new app.SdtEmails_CCitem(remoteHandle, context);
            AV31Emails_CC.setgxTv_SdtEmails_CCitem_Email( GXutil.trim( GXutil.substring( AV16CadenaRegistrar, 1, (AV64PosicionSeparador-1))) );
            AV31Emails_CC.setgxTv_SdtEmails_CCitem_Name( GXutil.trim( GXutil.strReplace( GXutil.substring( AV16CadenaRegistrar, AV64PosicionSeparador, GXutil.len( AV16CadenaRegistrar)), AV71TextoSeparador, "")) );
            AV21CopiaNombre = GXutil.trim( GXutil.strReplace( GXutil.substring( AV16CadenaRegistrar, AV64PosicionSeparador, GXutil.len( AV16CadenaRegistrar)), AV71TextoSeparador, "")) ;
            AV30Emails.getgxTv_SdtEmails_Cc().add(AV31Emails_CC, 0);
            AV87GXV3 = (int)(AV87GXV3+1) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV59parametroCorreosCopiaOcultaJson)==0) )
      {
         AV48ListaCorreosCopiaOculta.fromJSonString(AV59parametroCorreosCopiaOcultaJson, null);
         AV88GXV4 = 1 ;
         while ( AV88GXV4 <= AV48ListaCorreosCopiaOculta.size() )
         {
            AV16CadenaRegistrar = (String)AV48ListaCorreosCopiaOculta.elementAt(-1+AV88GXV4) ;
            AV64PosicionSeparador = (short)(GXutil.strSearch( AV16CadenaRegistrar, AV71TextoSeparador, 1)) ;
            AV32Emails_CCO = (app.SdtEmails_CCOItem)new app.SdtEmails_CCOItem(remoteHandle, context);
            AV32Emails_CCO.setgxTv_SdtEmails_CCOItem_Email( GXutil.trim( GXutil.substring( AV16CadenaRegistrar, 1, (AV64PosicionSeparador-1))) );
            AV32Emails_CCO.setgxTv_SdtEmails_CCOItem_Name( GXutil.strReplace( GXutil.substring( AV16CadenaRegistrar, AV64PosicionSeparador, GXutil.len( AV16CadenaRegistrar)), AV71TextoSeparador, "") );
            AV30Emails.getgxTv_SdtEmails_Cco().add(AV32Emails_CCO, 0);
            AV88GXV4 = (int)(AV88GXV4+1) ;
         }
      }
      AV12Asunto = AV57parametroAsunto ;
      AV68Texto = AV61parametroTextoCorreo ;
      AV69TextoCorreo = GXutil.strReplace( AV61parametroTextoCorreo, "<br>", GXutil.newLine( )) ;
      AV8Cantidad = DecimalUtil.ZERO ;
      AV30Emails.setgxTv_SdtEmails_Title( AV12Asunto );
      AV30Emails.setgxTv_SdtEmails_Subject( AV12Asunto );
      AV30Emails.setgxTv_SdtEmails_Htmltext( AV69TextoCorreo );
      AV53NombresAdjuntos.fromJSonString(AV54NombresAdjuntosJson, null);
      if ( AV53NombresAdjuntos.size() > 0 )
      {
         AV89GXV5 = 1 ;
         while ( AV89GXV5 <= AV53NombresAdjuntos.size() )
         {
            AV65RutaAdjunto = (String)AV53NombresAdjuntos.elementAt(-1+AV89GXV5) ;
            AV17CantidadArchivos = (short)(AV17CantidadArchivos+1) ;
            if ( AV17CantidadArchivos == 1 )
            {
               AV51NombreArchivo = AV65RutaAdjunto ;
            }
            else
            {
               AV51NombreArchivo += GXutil.newLine( ) + AV65RutaAdjunto ;
            }
            if ( GxRegex.IsMatch(AV65RutaAdjunto,httpContext.getMessage( "pdf", "")) )
            {
               AV14Blob = AV65RutaAdjunto ;
               AV37File = (com.genexus.util.GXFile)new com.genexus.util.GXFile();
               AV37File.setSource( AV14Blob );
               AV15BlobFile = AV37File.getURI() ;
               AV90Blobfile_GXI = GXDbFile.pathToUrl( AV37File.getURI(), context.getHttpContext()) ;
               AV35Extension = "PDF" ;
            }
            else
            {
               AV37File = (com.genexus.util.GXFile)new com.genexus.util.GXFile();
               AV37File.setSource( AV65RutaAdjunto );
               AV15BlobFile = AV37File.getURI() ;
               AV90Blobfile_GXI = GXDbFile.pathToUrl( AV37File.getURI(), context.getHttpContext()) ;
            }
            if ( AV37File.exists() )
            {
               AV41FileUploadFiles_File = (app.SdtFileUploadFiles_File)new app.SdtFileUploadFiles_File(remoteHandle, context);
               AV41FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_File( AV15BlobFile );
               AV41FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Extension( AV35Extension );
               AV41FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Fullname( GXDbFile.getFileName( AV90Blobfile_GXI) );
               AV41FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Name( AV37File.getName() );
               AV41FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Size( AV37File.getLength() );
               AV41FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Path( AV65RutaAdjunto );
               AV40FileUploadFiles.add(AV41FileUploadFiles_File, 0);
               AV35Extension = "" ;
            }
            AV89GXV5 = (int)(AV89GXV5+1) ;
         }
      }
      /* Execute user subroutine: 'LISTAADJUNTO' */
      S121 ();
      if (returnInSub) return;
      AV30Emails.setgxTv_SdtEmails_Htmltext( AV68Texto );
      if ( AV8Cantidad.doubleValue() > 0 )
      {
         GXv_int1[0] = AV19CodigoErrorEnvio ;
         GXv_char2[0] = AV27DescripcionErrorEnvio ;
         new app.psend_email2(remoteHandle, context).execute( AV30Emails, AV40FileUploadFiles, GXv_int1, GXv_char2) ;
         submitserviceattachmentmail.this.AV19CodigoErrorEnvio = GXv_int1[0] ;
         submitserviceattachmentmail.this.AV27DescripcionErrorEnvio = GXv_char2[0] ;
         AV82TextLog = GXutil.format( "%1%2", GXutil.str( AV19CodigoErrorEnvio, 18, 0), AV27DescripcionErrorEnvio, "", "", "", "", "", "", "") ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV82TextLog, AV91Pgmname) ;
         if ( GxRegex.IsMatch(AV27DescripcionErrorEnvio,httpContext.getMessage( "sucesso", "")) )
         {
            /* Execute user subroutine: 'HISTORICOENVIOEMAIL' */
            S131 ();
            if (returnInSub) return;
         }
      }
   }

   public void S121( )
   {
      /* 'LISTAADJUNTO' Routine */
      returnInSub = false ;
      AV68Texto = AV61parametroTextoCorreo ;
      AV46ListaAnexo = httpContext.getMessage( "<ul>", "") ;
      AV92GXV6 = 1 ;
      while ( AV92GXV6 <= AV40FileUploadFiles.size() )
      {
         AV41FileUploadFiles_File = (app.SdtFileUploadFiles_File)((app.SdtFileUploadFiles_File)AV40FileUploadFiles.elementAt(-1+AV92GXV6));
         AV46ListaAnexo += httpContext.getMessage( "<li>", "") + GXutil.trim( AV41FileUploadFiles_File.getgxTv_SdtFileUploadFiles_File_Fullname()) + httpContext.getMessage( "</li>", "") ;
         AV92GXV6 = (int)(AV92GXV6+1) ;
      }
      AV46ListaAnexo += httpContext.getMessage( "</ul>", "") ;
      AV68Texto = GXutil.strReplace( AV68Texto, httpContext.getMessage( "#ADJUNTO#", ""), AV46ListaAnexo) ;
   }

   public void S131( )
   {
      /* 'HISTORICOENVIOEMAIL' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV77Tipo_documento, "FRA") == 0 )
      {
         new app.facturacion.psetfraenvmail(remoteHandle, context).execute( (int)(AV78Numero_documento), AV33EmprCod) ;
      }
      else if ( GXutil.strcmp(AV77Tipo_documento, "GUIA") == 0 )
      {
         new app.albaranes.psetalbenvmail(remoteHandle, context).execute( AV78Numero_documento) ;
      }
   }

   protected void cleanup( )
   {
      this.aP11[0] = submitserviceattachmentmail.this.AV19CodigoErrorEnvio;
      this.aP12[0] = submitserviceattachmentmail.this.AV27DescripcionErrorEnvio;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27DescripcionErrorEnvio = "" ;
      AV63PathTomcat = "" ;
      AV10AppTool = new app.SdtAppTool(remoteHandle, context);
      AV9AppName = "" ;
      AV44HTTPRequest = httpContext.getHttpRequest();
      AV30Emails = new app.SdtEmails(remoteHandle, context);
      AV40FileUploadFiles = new GXBaseCollection<app.SdtFileUploadFiles_File>(app.SdtFileUploadFiles_File.class, "File", "TexplusNET", remoteHandle);
      GXt_SdtEmails3 = new app.SdtEmails(remoteHandle, context);
      GXv_SdtEmails4 = new app.SdtEmails[1] ;
      AV79Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV49ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV80Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV16CadenaRegistrar = "" ;
      AV56ParaEmail = "" ;
      AV62ParaNombre = "" ;
      AV8Cantidad = DecimalUtil.ZERO ;
      AV81Emails_TO = new app.SdtEmails_TOItem(remoteHandle, context);
      AV47ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20CopiaEmail = "" ;
      AV31Emails_CC = new app.SdtEmails_CCitem(remoteHandle, context);
      AV21CopiaNombre = "" ;
      AV48ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32Emails_CCO = new app.SdtEmails_CCOItem(remoteHandle, context);
      AV12Asunto = "" ;
      AV68Texto = "" ;
      AV69TextoCorreo = "" ;
      AV53NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      AV65RutaAdjunto = "" ;
      AV51NombreArchivo = "" ;
      AV14Blob = "" ;
      AV37File = new com.genexus.util.GXFile();
      AV15BlobFile = "" ;
      AV90Blobfile_GXI = "" ;
      AV35Extension = "" ;
      AV41FileUploadFiles_File = new app.SdtFileUploadFiles_File(remoteHandle, context);
      GXv_int1 = new long[1] ;
      GXv_char2 = new String[1] ;
      AV82TextLog = "" ;
      AV91Pgmname = "" ;
      AV46ListaAnexo = "" ;
      AV91Pgmname = "SubmitServiceAttachmentMail" ;
      /* GeneXus formulas. */
      AV91Pgmname = "SubmitServiceAttachmentMail" ;
      Gx_err = (short)(0) ;
   }

   private short AV64PosicionSeparador ;
   private short AV17CantidadArchivos ;
   private short Gx_err ;
   private int AV85GXV1 ;
   private int AV86GXV2 ;
   private int AV87GXV3 ;
   private int AV88GXV4 ;
   private int AV89GXV5 ;
   private int AV92GXV6 ;
   private long AV78Numero_documento ;
   private long AV19CodigoErrorEnvio ;
   private long GXv_int1[] ;
   private java.math.BigDecimal AV8Cantidad ;
   private String AV33EmprCod ;
   private String GXv_char2[] ;
   private String AV91Pgmname ;
   private boolean AV50MostrarMail ;
   private boolean returnInSub ;
   private String AV61parametroTextoCorreo ;
   private String AV68Texto ;
   private String AV82TextLog ;
   private String AV14Blob ;
   private String AV71TextoSeparador ;
   private String AV60parametroCorreosDestinoJson ;
   private String AV58parametroCorreosCopiaJson ;
   private String AV59parametroCorreosCopiaOcultaJson ;
   private String AV57parametroAsunto ;
   private String AV54NombresAdjuntosJson ;
   private String AV77Tipo_documento ;
   private String AV27DescripcionErrorEnvio ;
   private String AV63PathTomcat ;
   private String AV9AppName ;
   private String AV16CadenaRegistrar ;
   private String AV56ParaEmail ;
   private String AV62ParaNombre ;
   private String AV20CopiaEmail ;
   private String AV21CopiaNombre ;
   private String AV12Asunto ;
   private String AV69TextoCorreo ;
   private String AV65RutaAdjunto ;
   private String AV51NombreArchivo ;
   private String AV90Blobfile_GXI ;
   private String AV35Extension ;
   private String AV46ListaAnexo ;
   private String AV15BlobFile ;
   private com.genexus.internet.HttpRequest AV44HTTPRequest ;
   private GXSimpleCollection<String> AV49ListaCorreosDestino ;
   private app.SdtAppTool AV10AppTool ;
   private String[] aP12 ;
   private long[] aP11 ;
   private com.genexus.util.GXFile AV37File ;
   private GXSimpleCollection<String> AV47ListaCorreosCopia ;
   private GXSimpleCollection<String> AV48ListaCorreosCopiaOculta ;
   private GXSimpleCollection<String> AV53NombresAdjuntos ;
   private GXBaseCollection<app.SdtFileUploadFiles_File> AV40FileUploadFiles ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV79Messages ;
   private com.genexus.SdtMessages_Message AV80Message ;
   private app.SdtEmails AV30Emails ;
   private app.SdtEmails GXt_SdtEmails3 ;
   private app.SdtEmails GXv_SdtEmails4[] ;
   private app.SdtEmails_TOItem AV81Emails_TO ;
   private app.SdtEmails_CCitem AV31Emails_CC ;
   private app.SdtEmails_CCOItem AV32Emails_CCO ;
   private app.SdtFileUploadFiles_File AV41FileUploadFiles_File ;
}

