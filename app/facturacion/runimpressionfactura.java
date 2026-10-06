package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class runimpressionfactura extends GXProcedure
{
   public runimpressionfactura( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( runimpressionfactura.class ), "" );
   }

   public runimpressionfactura( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String[] aP1 ,
                             long aP2 ,
                             java.util.UUID aP3 ,
                             long aP4 ,
                             String aP5 ,
                             String aP6 ,
                             short aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             String aP12 ,
                             app.asyncbatch.SdtJobParameterData aP13 ,
                             boolean[] aP14 )
   {
      runimpressionfactura.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        long aP2 ,
                        java.util.UUID aP3 ,
                        long aP4 ,
                        String aP5 ,
                        String aP6 ,
                        short aP7 ,
                        String aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String aP11 ,
                        String aP12 ,
                        app.asyncbatch.SdtJobParameterData aP13 ,
                        boolean[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             long aP2 ,
                             java.util.UUID aP3 ,
                             long aP4 ,
                             String aP5 ,
                             String aP6 ,
                             short aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             String aP12 ,
                             app.asyncbatch.SdtJobParameterData aP13 ,
                             boolean[] aP14 ,
                             String[] aP15 )
   {
      runimpressionfactura.this.AV50EmprCod = aP0;
      runimpressionfactura.this.AV139UsurCod = aP1[0];
      this.aP1 = aP1;
      runimpressionfactura.this.AV8ITMID = aP2;
      runimpressionfactura.this.AV10JOBID = aP3;
      runimpressionfactura.this.AV11DOCID = aP4;
      runimpressionfactura.this.AV12DOCLBL = aP5;
      runimpressionfactura.this.AV13ITMSTS = aP6;
      runimpressionfactura.this.AV9RETRYQT = aP7;
      runimpressionfactura.this.AV149BASEPATH = aP8;
      runimpressionfactura.this.AV75OUTPATH = aP9;
      runimpressionfactura.this.AV14OUTFILE = aP10;
      runimpressionfactura.this.AV15OUTURL = aP11;
      runimpressionfactura.this.AV16FILENM = aP12;
      runimpressionfactura.this.AV183JobData = aP13;
      runimpressionfactura.this.aP14 = aP14;
      runimpressionfactura.this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV172Ret = GXutil.sleep( 1) ;
      AV24Copias = (short)(1) ;
      AV54FacCod = (int)(AV11DOCID) ;
      /* Execute user subroutine: 'JOBPARMETERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P0AOR2 */
      pr_default.execute(0, new Object[] {AV50EmprCod, Integer.valueOf(AV54FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P0AOR2_A252CliCod[0] ;
         A430FacCod = P0AOR2_A430FacCod[0] ;
         A396EmprCod = P0AOR2_A396EmprCod[0] ;
         A10050Cliemf = P0AOR2_A10050Cliemf[0] ;
         A279CliNom = P0AOR2_A279CliNom[0] ;
         A9606FacHor = P0AOR2_A9606FacHor[0] ;
         A10050Cliemf = P0AOR2_A10050Cliemf[0] ;
         A279CliNom = P0AOR2_A279CliNom[0] ;
         AV94Cliemf = A10050Cliemf ;
         AV98CliNom = A279CliNom ;
         AV179fachor = A9606FacHor ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P0AOR3 */
      pr_default.execute(1, new Object[] {AV139UsurCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A850UsurCod = P0AOR3_A850UsurCod[0] ;
         A10513UsuMail = P0AOR3_A10513UsuMail[0] ;
         A14371UsurGuid = P0AOR3_A14371UsurGuid[0] ;
         n14371UsurGuid = P0AOR3_n14371UsurGuid[0] ;
         A14487UsurSockt = P0AOR3_A14487UsurSockt[0] ;
         n14487UsurSockt = P0AOR3_n14487UsurSockt[0] ;
         AV138Usumail = A10513UsuMail ;
         AV144USURGUID = A14371UsurGuid.toString() ;
         AV177UsurSockt = A14487UsurSockt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV19OkItemRun = false ;
      AV69Var_OutPut = "PRN" ;
      AV148Copia[1-1] = "Original" ;
      AV148Copia[2-1] = "Duplicado" ;
      AV148Copia[3-1] = "Triplicado" ;
      AV148Copia[4-1] = "Quadriplicado" ;
      AV191GXLvl32 = (byte)(0) ;
      /* Using cursor P0AOR4 */
      pr_default.execute(2, new Object[] {AV50EmprCod, Integer.valueOf(AV54FacCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A430FacCod = P0AOR4_A430FacCod[0] ;
         A396EmprCod = P0AOR4_A396EmprCod[0] ;
         A252CliCod = P0AOR4_A252CliCod[0] ;
         A436FacFch = P0AOR4_A436FacFch[0] ;
         AV191GXLvl32 = (byte)(1) ;
         AV48CliCod = A252CliCod ;
         AV51FacFch = A436FacFch ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV191GXLvl32 == 0 )
      {
         AV19OkItemRun = false ;
         AV178ErrorMsg = "Fatura não encontrada: " + GXutil.str( AV54FacCod, 8, 0) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV58File.setSource( AV14OUTFILE );
      if ( AV58File.exists() )
      {
         AV58File.delete();
      }
      AV150Sdt_MergePDF.clear();
      if ( (0==AV24Copias) || ( AV24Copias == 0 ) )
      {
         AV24Copias = (short)(1) ;
      }
      AV74TotalCopia = AV24Copias ;
      AV66x = (short)(1) ;
      AV67i = (short)(1) ;
      while ( AV24Copias > 0 )
      {
         if ( AV67i > 5 )
         {
            AV67i = (short)(5) ;
         }
         AV64TextoCopia = ((AV67i==1) ? "Original" : ((AV67i==2) ? "Duplicado" : ((AV67i==3) ? "Triplicado" : "Quadriplicado"))) ;
         AV64TextoCopia = AV148Copia[AV67i-1] ;
         AV60PathFile = GXutil.format( "%1%2_%3", AV75OUTPATH, GXutil.trim( GXutil.str( AV67i, 4, 0)), AV16FILENM, "", "", "", "", "", "") ;
         new app.pwfacm21(remoteHandle, context).execute( AV60PathFile, AV50EmprCod, AV54FacCod, AV71impCod, DecimalUtil.doubleToDec(0), AV64TextoCopia, AV69Var_OutPut, AV26F_header, (byte)(AV35Agr_Fases), AV25VerSumLin) ;
         GXv_char1[0] = AV50EmprCod ;
         GXv_int2[0] = AV54FacCod ;
         GXv_dtime3[0] = AV179fachor ;
         new app.pfiritems(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_dtime3) ;
         runimpressionfactura.this.AV50EmprCod = GXv_char1[0] ;
         runimpressionfactura.this.AV54FacCod = GXv_int2[0] ;
         runimpressionfactura.this.AV179fachor = GXv_dtime3[0] ;
         AV65ItemPDF = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
         AV65ItemPDF.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV60PathFile );
         AV65ItemPDF.setgxTv_SdtSdt_MergePDF_PDF_Textocopia( AV64TextoCopia );
         AV150Sdt_MergePDF.add(AV65ItemPDF, 0);
         AV66x = (short)(AV66x+1) ;
         AV67i = (short)(AV67i+1) ;
         AV24Copias = (short)(AV24Copias-1) ;
      }
      AV70ListPdfJson = AV150Sdt_MergePDF.toJSonString(false) ;
      AV73PathPDFFull = AV145AppTool.merge(AV70ListPdfJson, AV14OUTFILE, false) ;
      AV74TotalCopia = (short)(0) ;
      AV58File.setSource( AV73PathPDFFull );
      if ( ! AV58File.exists() )
      {
         AV19OkItemRun = false ;
         AV178ErrorMsg = "Merge não gerou arquivo: " + AV73PathPDFFull ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         AV19OkItemRun = true ;
         if ( GXutil.strcmp(AV36Mail, "S") == 0 )
         {
            /* Execute user subroutine: 'EMAILASYNC' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Execute user subroutine: 'NOTIFICATION' */
         S151 ();
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
      /* 'EMAILASYNC' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'DATOSCORREO' */
      S121 ();
      if (returnInSub) return;
      GXv_int4[0] = AV99CodigoErrorEnvio ;
      GXv_char1[0] = AV101DescripcionErrorEnvio ;
      new app.submitserviceattachmentmail(remoteHandle, context).execute( AV50EmprCod, AV136TextoSeparador, AV116ListaCorreosDestino.toJSonString(false), AV114ListaCorreosCopia.toJSonString(false), AV115ListaCorreosCopiaOculta.toJSonString(false), AV89Asunto, AV135TextoCorreo, AV121NombresAdjuntos.toJSonString(false), AV120MostrarMail, AV54FacCod, "FRA", GXv_int4, GXv_char1) ;
      runimpressionfactura.this.AV99CodigoErrorEnvio = (short)((short)(GXv_int4[0])) ;
      runimpressionfactura.this.AV101DescripcionErrorEnvio = GXv_char1[0] ;
      AV178ErrorMsg = GXutil.format( "%1-%2", localUtil.format( DecimalUtil.doubleToDec(AV99CodigoErrorEnvio), "ZZZ9"), AV101DescripcionErrorEnvio, "", "", "", "", "", "", "") ;
      if ( AV99CodigoErrorEnvio != 200 )
      {
         AV19OkItemRun = false ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV178ErrorMsg, AV192Pgmname) ;
      }
   }

   public void S121( )
   {
      /* 'DATOSCORREO' Routine */
      returnInSub = false ;
      AV193GXV1 = 1 ;
      while ( AV193GXV1 <= AV150Sdt_MergePDF.size() )
      {
         AV180Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)((app.SdtSdt_MergePDF_PDF)AV150Sdt_MergePDF.elementAt(-1+AV193GXV1));
         if ( GXutil.strcmp(AV180Sdt_MergePDF_Item.getgxTv_SdtSdt_MergePDF_PDF_Textocopia(), "Original") == 0 )
         {
            AV14OUTFILE = AV180Sdt_MergePDF_Item.getgxTv_SdtSdt_MergePDF_PDF_Realpath() ;
         }
         AV193GXV1 = (int)(AV193GXV1+1) ;
      }
      AV121NombresAdjuntos.add(AV14OUTFILE, 0);
      AV136TextoSeparador = "|#@|" ;
      AV90CadenaRegistrar = GXutil.trim( AV94Cliemf) ;
      AV90CadenaRegistrar += AV136TextoSeparador + GXutil.trim( AV98CliNom) ;
      AV116ListaCorreosDestino.clear();
      AV116ListaCorreosDestino.add(AV90CadenaRegistrar, 0);
      AV114ListaCorreosCopia.clear();
      AV90CadenaRegistrar = GXutil.trim( AV138Usumail) ;
      AV90CadenaRegistrar += AV136TextoSeparador + AV105EmprNom ;
      AV114ListaCorreosCopia.add(AV90CadenaRegistrar, 0);
      AV115ListaCorreosCopiaOculta.clear();
      AV115ListaCorreosCopiaOculta.add(AV90CadenaRegistrar, 0);
      AV135TextoCorreo = httpContext.getMessage( "Envio FATURA por e-mail", "") + "<br>" ;
      AV89Asunto = httpContext.getMessage( "Envio de FATURA", "") ;
      AV135TextoCorreo += httpContext.getMessage( "<p>Arquivos anexados</p>", "") ;
      AV135TextoCorreo += httpContext.getMessage( "<p>#ADJUNTO#</p><br>", "") ;
      AV135TextoCorreo += httpContext.getMessage( "Atenciosamente,", "") + "<br>" ;
      AV135TextoCorreo += AV105EmprNom + "<br>" ;
      AV135TextoCorreo += "<br>" + "<br>" ;
   }

   public void S131( )
   {
      /* 'JOBPARMETERS' Routine */
      returnInSub = false ;
      if ( AV183JobData.getgxTv_SdtJobParameterData_Jobparsdt().size() > 0 )
      {
         AV194GXV2 = 1 ;
         while ( AV194GXV2 <= AV183JobData.getgxTv_SdtJobParameterData_Jobparsdt().size() )
         {
            AV184JobDataItem = (app.asyncbatch.SdtJobParameterData_JobParSdtItem)((app.asyncbatch.SdtJobParameterData_JobParSdtItem)AV183JobData.getgxTv_SdtJobParameterData_Jobparsdt().elementAt(-1+AV194GXV2));
            AV185JobParKey = AV184JobDataItem.getgxTv_SdtJobParameterData_JobParSdtItem_Parkey() ;
            AV186JobParVal = AV184JobDataItem.getgxTv_SdtJobParameterData_JobParSdtItem_Parval() ;
            /* Execute user subroutine: 'APPLYJOBPARAMETER' */
            S141 ();
            if (returnInSub) return;
            AV194GXV2 = (int)(AV194GXV2+1) ;
         }
      }
      else
      {
         /* Using cursor P0AOR5 */
         pr_default.execute(3, new Object[] {AV10JOBID});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A14423JobId = P0AOR5_A14423JobId[0] ;
            A14478ParKey = P0AOR5_A14478ParKey[0] ;
            A14479ParVal = P0AOR5_A14479ParVal[0] ;
            n14479ParVal = P0AOR5_n14479ParVal[0] ;
            AV185JobParKey = A14478ParKey ;
            AV186JobParVal = A14479ParVal ;
            /* Execute user subroutine: 'APPLYJOBPARAMETER' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
   }

   public void S141( )
   {
      /* 'APPLYJOBPARAMETER' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV185JobParKey, "FACFCHFROM") == 0 )
      {
         AV151FromFacFch = localUtil.ctod( AV186JobParVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "FACFCHTO") == 0 )
      {
         AV152ToFacFch = localUtil.ctod( AV186JobParVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "FACCODFROM") == 0 )
      {
         AV153FromFacCod = (int)(GXutil.lval( AV186JobParVal)) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "FACCODTO") == 0 )
      {
         AV154ToFacCod = (int)(GXutil.lval( AV186JobParVal)) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "COPIAS2") == 0 )
      {
         AV24Copias = (short)(GXutil.lval( AV186JobParVal)) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "VERSUMLIN") == 0 )
      {
         AV25VerSumLin = (byte)(GXutil.lval( AV186JobParVal)) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "F_HEADER") == 0 )
      {
         AV26F_header = (byte)(GXutil.lval( AV186JobParVal)) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "AGR_FASES") == 0 )
      {
         AV35Agr_Fases = (short)(GXutil.lval( AV186JobParVal)) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "MAIL") == 0 )
      {
         AV36Mail = GXutil.trim( AV186JobParVal) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "VERMAIL") == 0 )
      {
         AV166VerMail = (short)(GXutil.lval( AV186JobParVal)) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "MANAUT") == 0 )
      {
         AV167ManAut = AV186JobParVal ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "OPI") == 0 )
      {
         AV165Opi = AV186JobParVal ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "CLICODFROM") == 0 )
      {
         AV164CliCodfrom = (short)(GXutil.lval( AV186JobParVal)) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "CLICODTO") == 0 )
      {
         AV163CliCodto = (short)(GXutil.lval( AV186JobParVal)) ;
      }
      else if ( GXutil.strcmp(AV185JobParKey, "LISTPRINTER") == 0 )
      {
         AV156Printer = AV186JobParVal ;
      }
   }

   public void S151( )
   {
      /* 'NOTIFICATION' Routine */
      returnInSub = false ;
      AV173NotificationInfo.setgxTv_SdtNotificationInfo_Id( AV10JOBID.toString() );
      AV173NotificationInfo.setgxTv_SdtNotificationInfo_Message( "PROGRESS" );
      AV173NotificationInfo.setgxTv_SdtNotificationInfo_Object( "Facturacion.GenerarJobFactura" );
      AV175Resp = AV174Notification.notifyclient(AV177UsurSockt, AV173NotificationInfo) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = runimpressionfactura.this.AV139UsurCod;
      this.aP14[0] = runimpressionfactura.this.AV19OkItemRun;
      this.aP15[0] = runimpressionfactura.this.AV178ErrorMsg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV178ErrorMsg = "" ;
      scmdbuf = "" ;
      P0AOR2_A252CliCod = new int[1] ;
      P0AOR2_A430FacCod = new int[1] ;
      P0AOR2_A396EmprCod = new String[] {""} ;
      P0AOR2_A10050Cliemf = new String[] {""} ;
      P0AOR2_A279CliNom = new String[] {""} ;
      P0AOR2_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A10050Cliemf = "" ;
      A279CliNom = "" ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      AV94Cliemf = "" ;
      AV98CliNom = "" ;
      AV179fachor = GXutil.resetTime( GXutil.nullDate() );
      P0AOR3_A850UsurCod = new String[] {""} ;
      P0AOR3_A10513UsuMail = new String[] {""} ;
      P0AOR3_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOR3_n14371UsurGuid = new boolean[] {false} ;
      P0AOR3_A14487UsurSockt = new String[] {""} ;
      P0AOR3_n14487UsurSockt = new boolean[] {false} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      A14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14487UsurSockt = "" ;
      AV138Usumail = "" ;
      AV144USURGUID = "" ;
      AV177UsurSockt = "" ;
      AV69Var_OutPut = "" ;
      AV148Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV148Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0AOR4_A430FacCod = new int[1] ;
      P0AOR4_A396EmprCod = new String[] {""} ;
      P0AOR4_A252CliCod = new int[1] ;
      P0AOR4_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      A436FacFch = GXutil.nullDate() ;
      AV51FacFch = GXutil.nullDate() ;
      AV58File = new com.genexus.util.GXFile();
      AV150Sdt_MergePDF = new GXBaseCollection<app.SdtSdt_MergePDF_PDF>(app.SdtSdt_MergePDF_PDF.class, "PDF", "TexplusNET", remoteHandle);
      AV64TextoCopia = "" ;
      AV60PathFile = "" ;
      AV71impCod = "" ;
      GXv_int2 = new int[1] ;
      GXv_dtime3 = new java.util.Date[1] ;
      AV65ItemPDF = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV70ListPdfJson = "" ;
      AV73PathPDFFull = "" ;
      AV145AppTool = new app.SdtAppTool(remoteHandle, context);
      AV36Mail = "" ;
      AV136TextoSeparador = "" ;
      AV116ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV114ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV115ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV89Asunto = "" ;
      AV135TextoCorreo = "" ;
      AV121NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_int4 = new long[1] ;
      AV101DescripcionErrorEnvio = "" ;
      GXv_char1 = new String[1] ;
      AV192Pgmname = "" ;
      AV180Sdt_MergePDF_Item = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV90CadenaRegistrar = "" ;
      AV105EmprNom = "" ;
      AV184JobDataItem = new app.asyncbatch.SdtJobParameterData_JobParSdtItem(remoteHandle, context);
      AV185JobParKey = "" ;
      AV186JobParVal = "" ;
      P0AOR5_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AOR5_A14478ParKey = new String[] {""} ;
      P0AOR5_A14479ParVal = new String[] {""} ;
      P0AOR5_n14479ParVal = new boolean[] {false} ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14478ParKey = "" ;
      A14479ParVal = "" ;
      AV151FromFacFch = GXutil.nullDate() ;
      AV152ToFacFch = GXutil.nullDate() ;
      AV167ManAut = "" ;
      AV165Opi = "" ;
      AV156Printer = "" ;
      AV173NotificationInfo = new com.genexuscore.genexus.server.SdtNotificationInfo(remoteHandle, context);
      AV174Notification = new com.genexuscore.genexus.server.SdtSocket(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.runimpressionfactura__default(),
         new Object[] {
             new Object[] {
            P0AOR2_A252CliCod, P0AOR2_A430FacCod, P0AOR2_A396EmprCod, P0AOR2_A10050Cliemf, P0AOR2_A279CliNom, P0AOR2_A9606FacHor
            }
            , new Object[] {
            P0AOR3_A850UsurCod, P0AOR3_A10513UsuMail, P0AOR3_A14371UsurGuid, P0AOR3_n14371UsurGuid, P0AOR3_A14487UsurSockt, P0AOR3_n14487UsurSockt
            }
            , new Object[] {
            P0AOR4_A430FacCod, P0AOR4_A396EmprCod, P0AOR4_A252CliCod, P0AOR4_A436FacFch
            }
            , new Object[] {
            P0AOR5_A14423JobId, P0AOR5_A14478ParKey, P0AOR5_A14479ParVal, P0AOR5_n14479ParVal
            }
         }
      );
      AV192Pgmname = "Facturacion.RunImpressionFactura" ;
      /* GeneXus formulas. */
      AV192Pgmname = "Facturacion.RunImpressionFactura" ;
      Gx_err = (short)(0) ;
   }

   private byte AV191GXLvl32 ;
   private byte AV26F_header ;
   private byte AV25VerSumLin ;
   private short AV9RETRYQT ;
   private short AV172Ret ;
   private short AV24Copias ;
   private short AV74TotalCopia ;
   private short AV66x ;
   private short AV67i ;
   private short AV35Agr_Fases ;
   private short AV99CodigoErrorEnvio ;
   private short AV166VerMail ;
   private short AV164CliCodfrom ;
   private short AV163CliCodto ;
   private short AV175Resp ;
   private short Gx_err ;
   private int AV54FacCod ;
   private int A252CliCod ;
   private int A430FacCod ;
   private int AV48CliCod ;
   private int GXv_int2[] ;
   private int AV193GXV1 ;
   private int AV194GXV2 ;
   private int AV153FromFacCod ;
   private int AV154ToFacCod ;
   private int GX_I ;
   private long AV8ITMID ;
   private long AV11DOCID ;
   private long GXv_int4[] ;
   private String AV50EmprCod ;
   private String AV139UsurCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A10050Cliemf ;
   private String A279CliNom ;
   private String AV94Cliemf ;
   private String AV98CliNom ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
   private String AV138Usumail ;
   private String AV69Var_OutPut ;
   private String AV148Copia[] ;
   private String AV64TextoCopia ;
   private String AV71impCod ;
   private String GXv_char1[] ;
   private String AV192Pgmname ;
   private String AV105EmprNom ;
   private java.util.Date A9606FacHor ;
   private java.util.Date AV179fachor ;
   private java.util.Date GXv_dtime3[] ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV51FacFch ;
   private java.util.Date AV151FromFacFch ;
   private java.util.Date AV152ToFacFch ;
   private boolean AV19OkItemRun ;
   private boolean returnInSub ;
   private boolean n14371UsurGuid ;
   private boolean n14487UsurSockt ;
   private boolean AV120MostrarMail ;
   private boolean n14479ParVal ;
   private String AV15OUTURL ;
   private String AV70ListPdfJson ;
   private String AV12DOCLBL ;
   private String AV13ITMSTS ;
   private String AV149BASEPATH ;
   private String AV75OUTPATH ;
   private String AV14OUTFILE ;
   private String AV16FILENM ;
   private String AV178ErrorMsg ;
   private String A14487UsurSockt ;
   private String AV144USURGUID ;
   private String AV177UsurSockt ;
   private String AV60PathFile ;
   private String AV73PathPDFFull ;
   private String AV36Mail ;
   private String AV136TextoSeparador ;
   private String AV89Asunto ;
   private String AV135TextoCorreo ;
   private String AV101DescripcionErrorEnvio ;
   private String AV90CadenaRegistrar ;
   private String AV185JobParKey ;
   private String AV186JobParVal ;
   private String A14478ParKey ;
   private String A14479ParVal ;
   private String AV167ManAut ;
   private String AV165Opi ;
   private String AV156Printer ;
   private java.util.UUID AV10JOBID ;
   private java.util.UUID A14371UsurGuid ;
   private java.util.UUID A14423JobId ;
   private com.genexus.util.GXFile AV58File ;
   private GXSimpleCollection<String> AV116ListaCorreosDestino ;
   private GXSimpleCollection<String> AV114ListaCorreosCopia ;
   private GXSimpleCollection<String> AV115ListaCorreosCopiaOculta ;
   private GXSimpleCollection<String> AV121NombresAdjuntos ;
   private app.SdtAppTool AV145AppTool ;
   private com.genexuscore.genexus.server.SdtNotificationInfo AV173NotificationInfo ;
   private com.genexuscore.genexus.server.SdtSocket AV174Notification ;
   private String[] aP15 ;
   private String[] aP1 ;
   private boolean[] aP14 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AOR2_A252CliCod ;
   private int[] P0AOR2_A430FacCod ;
   private String[] P0AOR2_A396EmprCod ;
   private String[] P0AOR2_A10050Cliemf ;
   private String[] P0AOR2_A279CliNom ;
   private java.util.Date[] P0AOR2_A9606FacHor ;
   private String[] P0AOR3_A850UsurCod ;
   private String[] P0AOR3_A10513UsuMail ;
   private java.util.UUID[] P0AOR3_A14371UsurGuid ;
   private boolean[] P0AOR3_n14371UsurGuid ;
   private String[] P0AOR3_A14487UsurSockt ;
   private boolean[] P0AOR3_n14487UsurSockt ;
   private int[] P0AOR4_A430FacCod ;
   private String[] P0AOR4_A396EmprCod ;
   private int[] P0AOR4_A252CliCod ;
   private java.util.Date[] P0AOR4_A436FacFch ;
   private java.util.UUID[] P0AOR5_A14423JobId ;
   private String[] P0AOR5_A14478ParKey ;
   private String[] P0AOR5_A14479ParVal ;
   private boolean[] P0AOR5_n14479ParVal ;
   private GXBaseCollection<app.SdtSdt_MergePDF_PDF> AV150Sdt_MergePDF ;
   private app.SdtSdt_MergePDF_PDF AV65ItemPDF ;
   private app.SdtSdt_MergePDF_PDF AV180Sdt_MergePDF_Item ;
   private app.asyncbatch.SdtJobParameterData AV183JobData ;
   private app.asyncbatch.SdtJobParameterData_JobParSdtItem AV184JobDataItem ;
}

final  class runimpressionfactura__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOR2", "SELECT T1.CliCod, T1.FacCod, T1.EmprCod, T2.Cliemf, T2.CliNom, T1.FacHor FROM (TXPCFAVEN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AOR3", "SELECT UsurCod, UsuMail, UsurGuid, UsurSockt FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AOR4", "SELECT FacCod, EmprCod, CliCod, FacFch FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AOR5", "SELECT JobId, ParKey, ParVal FROM TXPJOBPAR WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((java.util.UUID[]) buf[2])[0] = rslt.getGUID(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 3 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

