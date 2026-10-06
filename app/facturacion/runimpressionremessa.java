package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class runimpressionremessa extends GXProcedure
{
   public runimpressionremessa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( runimpressionremessa.class ), "" );
   }

   public runimpressionremessa( int remoteHandle ,
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
      runimpressionremessa.this.aP15 = new String[] {""};
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
      runimpressionremessa.this.AV21EmprCod = aP0;
      runimpressionremessa.this.AV53UsurCod = aP1[0];
      this.aP1 = aP1;
      runimpressionremessa.this.AV31ITMID = aP2;
      runimpressionremessa.this.AV33JOBID = aP3;
      runimpressionremessa.this.AV19DOCID = aP4;
      runimpressionremessa.this.AV20DOCLBL = aP5;
      runimpressionremessa.this.AV32ITMSTS = aP6;
      runimpressionremessa.this.AV47RETRYQT = aP7;
      runimpressionremessa.this.AV58BASEPATH = aP8;
      runimpressionremessa.this.AV43OUTPATH = aP9;
      runimpressionremessa.this.AV42OUTFILE = aP10;
      runimpressionremessa.this.AV44OUTURL = aP11;
      runimpressionremessa.this.AV27FILENM = aP12;
      runimpressionremessa.this.AV99JobData = aP13;
      runimpressionremessa.this.aP14 = aP14;
      runimpressionremessa.this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV70Ret = GXutil.sleep( 1) ;
      AV17Copias = (short)(1) ;
      AV80AlbProCod = AV19DOCID ;
      /* Execute user subroutine: 'JOBPARMETERS' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P0AU82 */
      pr_default.execute(0, new Object[] {AV21EmprCod, Long.valueOf(AV80AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P0AU82_A129BarCod[0] ;
         A132BarCodReo = P0AU82_A132BarCodReo[0] ;
         A130BarCodPar = P0AU82_A130BarCodPar[0] ;
         A252CliCod = P0AU82_A252CliCod[0] ;
         n252CliCod = P0AU82_n252CliCod[0] ;
         A1253EmprGuiRem = P0AU82_A1253EmprGuiRem[0] ;
         A30AlbProCod = P0AU82_A30AlbProCod[0] ;
         A396EmprCod = P0AU82_A396EmprCod[0] ;
         A1243GuiRemCli = P0AU82_A1243GuiRemCli[0] ;
         A1244GuiRemCln = P0AU82_A1244GuiRemCln[0] ;
         A14561GuiRemmf = P0AU82_A14561GuiRemmf[0] ;
         A11620CliMailGr = P0AU82_A11620CliMailGr[0] ;
         A11621CliMailPk = P0AU82_A11621CliMailPk[0] ;
         A11622CliMailGrE = P0AU82_A11622CliMailGrE[0] ;
         A11623CliMailPkE = P0AU82_A11623CliMailPkE[0] ;
         A1902CliValA = P0AU82_A1902CliValA[0] ;
         A39AlbProPri = P0AU82_A39AlbProPri[0] ;
         A2242AlbSec = P0AU82_A2242AlbSec[0] ;
         A5291BarTipCor = P0AU82_A5291BarTipCor[0] ;
         A10301Cod_pais = P0AU82_A10301Cod_pais[0] ;
         n10301Cod_pais = P0AU82_n10301Cod_pais[0] ;
         A252CliCod = P0AU82_A252CliCod[0] ;
         n252CliCod = P0AU82_n252CliCod[0] ;
         A5291BarTipCor = P0AU82_A5291BarTipCor[0] ;
         A1253EmprGuiRem = P0AU82_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = P0AU82_A1243GuiRemCli[0] ;
         A39AlbProPri = P0AU82_A39AlbProPri[0] ;
         A2242AlbSec = P0AU82_A2242AlbSec[0] ;
         A1244GuiRemCln = P0AU82_A1244GuiRemCln[0] ;
         A14561GuiRemmf = P0AU82_A14561GuiRemmf[0] ;
         A11620CliMailGr = P0AU82_A11620CliMailGr[0] ;
         A11621CliMailPk = P0AU82_A11621CliMailPk[0] ;
         A11622CliMailGrE = P0AU82_A11622CliMailGrE[0] ;
         A11623CliMailPkE = P0AU82_A11623CliMailPkE[0] ;
         A1902CliValA = P0AU82_A1902CliValA[0] ;
         A10301Cod_pais = P0AU82_A10301Cod_pais[0] ;
         n10301Cod_pais = P0AU82_n10301Cod_pais[0] ;
         AV81GuiRemCli = A1243GuiRemCli ;
         AV82GuiRemCln = A1244GuiRemCln ;
         AV83GuiRemmf = A14561GuiRemmf ;
         AV81GuiRemCli = A1243GuiRemCli ;
         AV91CliMailgr = A11620CliMailGr ;
         AV90CliMailpk = A11621CliMailPk ;
         AV89CliMailGrE = A11622CliMailGrE ;
         AV88CliMailPkE = A11623CliMailPkE ;
         AV93CliValA = A1902CliValA ;
         AV85ALbProPri = A39AlbProPri ;
         AV92AlbSec = A2242AlbSec ;
         AV87BarTipCor = A5291BarTipCor ;
         AV86Cod_pais = A10301Cod_pais ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P0AU83 */
      pr_default.execute(1, new Object[] {AV53UsurCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A850UsurCod = P0AU83_A850UsurCod[0] ;
         A10513UsuMail = P0AU83_A10513UsuMail[0] ;
         A14371UsurGuid = P0AU83_A14371UsurGuid[0] ;
         n14371UsurGuid = P0AU83_n14371UsurGuid[0] ;
         A14487UsurSockt = P0AU83_A14487UsurSockt[0] ;
         n14487UsurSockt = P0AU83_n14487UsurSockt[0] ;
         AV52Usumail = A10513UsuMail ;
         AV54USURGUID = A14371UsurGuid.toString() ;
         AV74UsurSockt = A14487UsurSockt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV41OkItemRun = false ;
      AV55Var_OutPut = "PRN" ;
      AV16Copia[1-1] = "Original" ;
      AV16Copia[2-1] = "Duplicado" ;
      AV16Copia[3-1] = "Triplicado" ;
      AV16Copia[4-1] = "Quadriplicado" ;
      AV104GXLvl46 = (byte)(0) ;
      /* Using cursor P0AU84 */
      pr_default.execute(2, new Object[] {AV21EmprCod, Long.valueOf(AV80AlbProCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A30AlbProCod = P0AU84_A30AlbProCod[0] ;
         A396EmprCod = P0AU84_A396EmprCod[0] ;
         A34AlbProfch = P0AU84_A34AlbProfch[0] ;
         AV104GXLvl46 = (byte)(1) ;
         AV12CliCod = A252CliCod ;
         AV84AlbProfch = A34AlbProfch ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV104GXLvl46 == 0 )
      {
         AV41OkItemRun = false ;
         AV75ErrorMsg = "Fatura não encontrada: " + GXutil.str( AV80AlbProCod, 10, 0) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV26File.setSource( AV42OUTFILE );
      if ( AV26File.exists() )
      {
         AV26File.delete();
      }
      AV59Sdt_MergePDF.clear();
      if ( (0==AV17Copias) || ( AV17Copias == 0 ) )
      {
         AV17Copias = (short)(1) ;
      }
      AV51TotalCopia = AV17Copias ;
      AV57x = (short)(1) ;
      AV28i = (short)(1) ;
      while ( AV17Copias > 0 )
      {
         if ( AV28i > 5 )
         {
            AV28i = (short)(5) ;
         }
         AV48TextoCopia = ((AV28i==1) ? "Original" : ((AV28i==2) ? "Duplicado" : ((AV28i==3) ? "Triplicado" : "Quadriplicado"))) ;
         AV48TextoCopia = AV16Copia[AV28i-1] ;
         AV45PathFile = GXutil.format( "%1%2_%3", AV43OUTPATH, GXutil.trim( GXutil.str( AV28i, 4, 0)), AV27FILENM, "", "", "", "", "", "") ;
         new app.paguagrmodacopy1(remoteHandle, context).execute( AV45PathFile, AV21EmprCod, AV80AlbProCod, "", AV48TextoCopia) ;
         AV30ItemPDF = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
         AV30ItemPDF.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV45PathFile );
         AV30ItemPDF.setgxTv_SdtSdt_MergePDF_PDF_Textocopia( AV48TextoCopia );
         AV59Sdt_MergePDF.add(AV30ItemPDF, 0);
         AV57x = (short)(AV57x+1) ;
         AV28i = (short)(AV28i+1) ;
         AV17Copias = (short)(AV17Copias-1) ;
      }
      AV37ListPdfJson = AV59Sdt_MergePDF.toJSonString(false) ;
      AV46PathPDFFull = AV9AppTool.merge(AV37ListPdfJson, AV42OUTFILE, false) ;
      AV51TotalCopia = (short)(0) ;
      AV26File.setSource( AV46PathPDFFull );
      if ( ! AV26File.exists() )
      {
         AV41OkItemRun = false ;
         AV75ErrorMsg = "Merge não gerou arquivo: " + AV46PathPDFFull ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         AV41OkItemRun = true ;
         if ( GXutil.strcmp(AV38Mail, "S") == 0 )
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
         S141 ();
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
      GXv_int1[0] = AV15CodigoErrorEnvio ;
      GXv_char2[0] = AV18DescripcionErrorEnvio ;
      new app.submitserviceattachmentmail(remoteHandle, context).execute( AV21EmprCod, AV50TextoSeparador, AV36ListaCorreosDestino.toJSonString(false), AV34ListaCorreosCopia.toJSonString(false), AV35ListaCorreosCopiaOculta.toJSonString(false), AV10Asunto, AV49TextoCorreo, AV40NombresAdjuntos.toJSonString(false), AV39MostrarMail, AV24FacCod, "FRA", GXv_int1, GXv_char2) ;
      runimpressionremessa.this.AV15CodigoErrorEnvio = (short)((short)(GXv_int1[0])) ;
      runimpressionremessa.this.AV18DescripcionErrorEnvio = GXv_char2[0] ;
      AV75ErrorMsg = GXutil.format( "%1-%2", localUtil.format( DecimalUtil.doubleToDec(AV15CodigoErrorEnvio), "ZZZ9"), AV18DescripcionErrorEnvio, "", "", "", "", "", "", "") ;
      if ( AV15CodigoErrorEnvio != 200 )
      {
         AV41OkItemRun = false ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV75ErrorMsg, AV105Pgmname) ;
      }
   }

   public void S121( )
   {
      /* 'DATOSCORREO' Routine */
      returnInSub = false ;
      AV106GXV1 = 1 ;
      while ( AV106GXV1 <= AV59Sdt_MergePDF.size() )
      {
         AV77Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)((app.SdtSdt_MergePDF_PDF)AV59Sdt_MergePDF.elementAt(-1+AV106GXV1));
         if ( GXutil.strcmp(AV77Sdt_MergePDF_Item.getgxTv_SdtSdt_MergePDF_PDF_Textocopia(), "Original") == 0 )
         {
            AV42OUTFILE = AV77Sdt_MergePDF_Item.getgxTv_SdtSdt_MergePDF_PDF_Realpath() ;
         }
         AV106GXV1 = (int)(AV106GXV1+1) ;
      }
      AV40NombresAdjuntos.add(AV42OUTFILE, 0);
      AV50TextoSeparador = "|#@|" ;
      AV11CadenaRegistrar = GXutil.trim( AV13Cliemf) ;
      AV11CadenaRegistrar += AV50TextoSeparador + GXutil.trim( AV14CliNom) ;
      AV36ListaCorreosDestino.clear();
      AV36ListaCorreosDestino.add(AV11CadenaRegistrar, 0);
      AV34ListaCorreosCopia.clear();
      AV11CadenaRegistrar = GXutil.trim( AV52Usumail) ;
      AV11CadenaRegistrar += AV50TextoSeparador + AV22EmprNom ;
      AV34ListaCorreosCopia.add(AV11CadenaRegistrar, 0);
      AV35ListaCorreosCopiaOculta.clear();
      AV35ListaCorreosCopiaOculta.add(AV11CadenaRegistrar, 0);
      AV49TextoCorreo = httpContext.getMessage( "Envio GUIA DE REMESSA por e-mail", "") + "<br>" ;
      AV10Asunto = httpContext.getMessage( "Envio de REMESSA", "") ;
      AV49TextoCorreo += httpContext.getMessage( "<p>Arquivos anexados</p>", "") ;
      AV49TextoCorreo += httpContext.getMessage( "<p>#ADJUNTO#</p><br>", "") ;
      AV49TextoCorreo += httpContext.getMessage( "Atenciosamente,", "") + "<br>" ;
      AV49TextoCorreo += AV22EmprNom + "<br>" ;
      AV49TextoCorreo += "<br>" + "<br>" ;
   }

   public void S131( )
   {
      /* 'JOBPARMETERS' Routine */
      returnInSub = false ;
      /* Using cursor P0AU85 */
      pr_default.execute(3, new Object[] {AV33JOBID});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14423JobId = P0AU85_A14423JobId[0] ;
         A14478ParKey = P0AU85_A14478ParKey[0] ;
         A14479ParVal = P0AU85_A14479ParVal[0] ;
         n14479ParVal = P0AU85_n14479ParVal[0] ;
         if ( GXutil.strcmp(A14478ParKey, "ALBPROCODFROM") == 0 )
         {
            AV94FromAlbProCod = GXutil.lval( A14479ParVal) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "ALBPROCODTO") == 0 )
         {
            AV95ToAlbProCod = GXutil.lval( A14479ParVal) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "COPIAS2") == 0 )
         {
            AV17Copias = (short)(GXutil.lval( A14479ParVal)) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "VERSUMLIN") == 0 )
         {
            AV56VerSumLin = (byte)(GXutil.lval( A14479ParVal)) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "F_HEADER") == 0 )
         {
            AV23F_header = (byte)(GXutil.lval( A14479ParVal)) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "AGR_FASES") == 0 )
         {
            AV8Agr_Fases = (short)(GXutil.lval( A14479ParVal)) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "PRIO") == 0 )
         {
            AV96PriCod = A14479ParVal ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "MAIL") == 0 )
         {
            AV38Mail = GXutil.trim( A14479ParVal) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "MANAUT") == 0 )
         {
            AV69ManAut = A14479ParVal ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "OPI") == 0 )
         {
            AV67Opi = A14479ParVal ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "CLICODFROM") == 0 )
         {
            AV66CliCodfrom = (short)(GXutil.lval( A14479ParVal)) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "CLICODTO") == 0 )
         {
            AV65CliCodto = (short)(GXutil.lval( A14479ParVal)) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "LISTPRINTER") == 0 )
         {
            AV64Printer = A14479ParVal ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "VERMAIL") == 0 )
         {
            AV68VerMail = (short)(GXutil.lval( A14479ParVal)) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "ALBPROFCHFROM") == 0 )
         {
            AV97FromAlbProfch = localUtil.ctod( A14479ParVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(A14478ParKey, "ALBPROFCHTO") == 0 )
         {
            AV98ToAlbProfch = localUtil.ctod( A14479ParVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S141( )
   {
      /* 'NOTIFICATION' Routine */
      returnInSub = false ;
      AV71NotificationInfo.setgxTv_SdtNotificationInfo_Id( AV33JOBID.toString() );
      AV71NotificationInfo.setgxTv_SdtNotificationInfo_Message( "PROGRESS" );
      AV71NotificationInfo.setgxTv_SdtNotificationInfo_Object( "Facturacion.GenerarJobRemessa" );
      AV73Resp = AV72Notification.notifyclient(AV74UsurSockt, AV71NotificationInfo) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = runimpressionremessa.this.AV53UsurCod;
      this.aP14[0] = runimpressionremessa.this.AV41OkItemRun;
      this.aP15[0] = runimpressionremessa.this.AV75ErrorMsg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV75ErrorMsg = "" ;
      scmdbuf = "" ;
      P0AU82_A129BarCod = new int[1] ;
      P0AU82_A132BarCodReo = new byte[1] ;
      P0AU82_A130BarCodPar = new String[] {""} ;
      P0AU82_A252CliCod = new int[1] ;
      P0AU82_n252CliCod = new boolean[] {false} ;
      P0AU82_A1253EmprGuiRem = new String[] {""} ;
      P0AU82_A30AlbProCod = new long[1] ;
      P0AU82_A396EmprCod = new String[] {""} ;
      P0AU82_A1243GuiRemCli = new int[1] ;
      P0AU82_A1244GuiRemCln = new String[] {""} ;
      P0AU82_A14561GuiRemmf = new String[] {""} ;
      P0AU82_A11620CliMailGr = new String[] {""} ;
      P0AU82_A11621CliMailPk = new String[] {""} ;
      P0AU82_A11622CliMailGrE = new String[] {""} ;
      P0AU82_A11623CliMailPkE = new String[] {""} ;
      P0AU82_A1902CliValA = new String[] {""} ;
      P0AU82_A39AlbProPri = new String[] {""} ;
      P0AU82_A2242AlbSec = new String[] {""} ;
      P0AU82_A5291BarTipCor = new String[] {""} ;
      P0AU82_A10301Cod_pais = new short[1] ;
      P0AU82_n10301Cod_pais = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A1253EmprGuiRem = "" ;
      A396EmprCod = "" ;
      A1244GuiRemCln = "" ;
      A14561GuiRemmf = "" ;
      A11620CliMailGr = "" ;
      A11621CliMailPk = "" ;
      A11622CliMailGrE = "" ;
      A11623CliMailPkE = "" ;
      A1902CliValA = "" ;
      A39AlbProPri = "" ;
      A2242AlbSec = "" ;
      A5291BarTipCor = "" ;
      AV82GuiRemCln = "" ;
      AV83GuiRemmf = "" ;
      AV91CliMailgr = "" ;
      AV90CliMailpk = "" ;
      AV89CliMailGrE = "" ;
      AV88CliMailPkE = "" ;
      AV93CliValA = "" ;
      AV85ALbProPri = "" ;
      AV92AlbSec = "" ;
      AV87BarTipCor = "" ;
      P0AU83_A850UsurCod = new String[] {""} ;
      P0AU83_A10513UsuMail = new String[] {""} ;
      P0AU83_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AU83_n14371UsurGuid = new boolean[] {false} ;
      P0AU83_A14487UsurSockt = new String[] {""} ;
      P0AU83_n14487UsurSockt = new boolean[] {false} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      A14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14487UsurSockt = "" ;
      AV52Usumail = "" ;
      AV54USURGUID = "" ;
      AV74UsurSockt = "" ;
      AV55Var_OutPut = "" ;
      AV16Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV16Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P0AU84_A30AlbProCod = new long[1] ;
      P0AU84_A396EmprCod = new String[] {""} ;
      P0AU84_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      AV84AlbProfch = GXutil.nullDate() ;
      AV26File = new com.genexus.util.GXFile();
      AV59Sdt_MergePDF = new GXBaseCollection<app.SdtSdt_MergePDF_PDF>(app.SdtSdt_MergePDF_PDF.class, "PDF", "TexplusNET", remoteHandle);
      AV48TextoCopia = "" ;
      AV45PathFile = "" ;
      AV30ItemPDF = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV37ListPdfJson = "" ;
      AV46PathPDFFull = "" ;
      AV9AppTool = new app.SdtAppTool(remoteHandle, context);
      AV38Mail = "" ;
      AV50TextoSeparador = "" ;
      AV36ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV35ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV10Asunto = "" ;
      AV49TextoCorreo = "" ;
      AV40NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_int1 = new long[1] ;
      AV18DescripcionErrorEnvio = "" ;
      GXv_char2 = new String[1] ;
      AV105Pgmname = "" ;
      AV77Sdt_MergePDF_Item = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV11CadenaRegistrar = "" ;
      AV13Cliemf = "" ;
      AV14CliNom = "" ;
      AV22EmprNom = "" ;
      P0AU85_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      P0AU85_A14478ParKey = new String[] {""} ;
      P0AU85_A14479ParVal = new String[] {""} ;
      P0AU85_n14479ParVal = new boolean[] {false} ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14478ParKey = "" ;
      A14479ParVal = "" ;
      AV96PriCod = "" ;
      AV69ManAut = "" ;
      AV67Opi = "" ;
      AV64Printer = "" ;
      AV97FromAlbProfch = GXutil.nullDate() ;
      AV98ToAlbProfch = GXutil.nullDate() ;
      AV71NotificationInfo = new com.genexuscore.genexus.server.SdtNotificationInfo(remoteHandle, context);
      AV72Notification = new com.genexuscore.genexus.server.SdtSocket(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.runimpressionremessa__default(),
         new Object[] {
             new Object[] {
            P0AU82_A129BarCod, P0AU82_A132BarCodReo, P0AU82_A130BarCodPar, P0AU82_A252CliCod, P0AU82_n252CliCod, P0AU82_A1253EmprGuiRem, P0AU82_A30AlbProCod, P0AU82_A396EmprCod, P0AU82_A1243GuiRemCli, P0AU82_A1244GuiRemCln,
            P0AU82_A14561GuiRemmf, P0AU82_A11620CliMailGr, P0AU82_A11621CliMailPk, P0AU82_A11622CliMailGrE, P0AU82_A11623CliMailPkE, P0AU82_A1902CliValA, P0AU82_A39AlbProPri, P0AU82_A2242AlbSec, P0AU82_A5291BarTipCor, P0AU82_A10301Cod_pais,
            P0AU82_n10301Cod_pais
            }
            , new Object[] {
            P0AU83_A850UsurCod, P0AU83_A10513UsuMail, P0AU83_A14371UsurGuid, P0AU83_n14371UsurGuid, P0AU83_A14487UsurSockt, P0AU83_n14487UsurSockt
            }
            , new Object[] {
            P0AU84_A30AlbProCod, P0AU84_A396EmprCod, P0AU84_A34AlbProfch
            }
            , new Object[] {
            P0AU85_A14423JobId, P0AU85_A14478ParKey, P0AU85_A14479ParVal, P0AU85_n14479ParVal
            }
         }
      );
      AV105Pgmname = "Facturacion.RunImpressionRemessa" ;
      /* GeneXus formulas. */
      AV105Pgmname = "Facturacion.RunImpressionRemessa" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV104GXLvl46 ;
   private byte AV56VerSumLin ;
   private byte AV23F_header ;
   private short AV47RETRYQT ;
   private short AV70Ret ;
   private short AV17Copias ;
   private short A10301Cod_pais ;
   private short AV86Cod_pais ;
   private short AV51TotalCopia ;
   private short AV57x ;
   private short AV28i ;
   private short AV15CodigoErrorEnvio ;
   private short AV8Agr_Fases ;
   private short AV66CliCodfrom ;
   private short AV65CliCodto ;
   private short AV68VerMail ;
   private short AV73Resp ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A1243GuiRemCli ;
   private int AV81GuiRemCli ;
   private int AV12CliCod ;
   private int AV24FacCod ;
   private int AV106GXV1 ;
   private int GX_I ;
   private long AV31ITMID ;
   private long AV19DOCID ;
   private long AV80AlbProCod ;
   private long A30AlbProCod ;
   private long GXv_int1[] ;
   private long AV94FromAlbProCod ;
   private long AV95ToAlbProCod ;
   private String AV21EmprCod ;
   private String AV53UsurCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A1253EmprGuiRem ;
   private String A396EmprCod ;
   private String A1244GuiRemCln ;
   private String A14561GuiRemmf ;
   private String A11620CliMailGr ;
   private String A11621CliMailPk ;
   private String A11622CliMailGrE ;
   private String A11623CliMailPkE ;
   private String A1902CliValA ;
   private String A39AlbProPri ;
   private String A2242AlbSec ;
   private String A5291BarTipCor ;
   private String AV82GuiRemCln ;
   private String AV83GuiRemmf ;
   private String AV91CliMailgr ;
   private String AV90CliMailpk ;
   private String AV89CliMailGrE ;
   private String AV88CliMailPkE ;
   private String AV93CliValA ;
   private String AV85ALbProPri ;
   private String AV92AlbSec ;
   private String AV87BarTipCor ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
   private String AV52Usumail ;
   private String AV55Var_OutPut ;
   private String AV16Copia[] ;
   private String AV48TextoCopia ;
   private String GXv_char2[] ;
   private String AV105Pgmname ;
   private String AV13Cliemf ;
   private String AV14CliNom ;
   private String AV22EmprNom ;
   private String AV96PriCod ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV84AlbProfch ;
   private java.util.Date AV97FromAlbProfch ;
   private java.util.Date AV98ToAlbProfch ;
   private boolean AV41OkItemRun ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n10301Cod_pais ;
   private boolean n14371UsurGuid ;
   private boolean n14487UsurSockt ;
   private boolean AV39MostrarMail ;
   private boolean n14479ParVal ;
   private String AV44OUTURL ;
   private String AV37ListPdfJson ;
   private String AV20DOCLBL ;
   private String AV32ITMSTS ;
   private String AV58BASEPATH ;
   private String AV43OUTPATH ;
   private String AV42OUTFILE ;
   private String AV27FILENM ;
   private String AV75ErrorMsg ;
   private String A14487UsurSockt ;
   private String AV54USURGUID ;
   private String AV74UsurSockt ;
   private String AV45PathFile ;
   private String AV46PathPDFFull ;
   private String AV38Mail ;
   private String AV50TextoSeparador ;
   private String AV10Asunto ;
   private String AV49TextoCorreo ;
   private String AV18DescripcionErrorEnvio ;
   private String AV11CadenaRegistrar ;
   private String A14478ParKey ;
   private String A14479ParVal ;
   private String AV69ManAut ;
   private String AV67Opi ;
   private String AV64Printer ;
   private java.util.UUID AV33JOBID ;
   private java.util.UUID A14371UsurGuid ;
   private java.util.UUID A14423JobId ;
   private com.genexus.util.GXFile AV26File ;
   private GXSimpleCollection<String> AV36ListaCorreosDestino ;
   private GXSimpleCollection<String> AV34ListaCorreosCopia ;
   private GXSimpleCollection<String> AV35ListaCorreosCopiaOculta ;
   private GXSimpleCollection<String> AV40NombresAdjuntos ;
   private app.SdtAppTool AV9AppTool ;
   private com.genexuscore.genexus.server.SdtNotificationInfo AV71NotificationInfo ;
   private com.genexuscore.genexus.server.SdtSocket AV72Notification ;
   private String[] aP15 ;
   private String[] aP1 ;
   private boolean[] aP14 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AU82_A129BarCod ;
   private byte[] P0AU82_A132BarCodReo ;
   private String[] P0AU82_A130BarCodPar ;
   private int[] P0AU82_A252CliCod ;
   private boolean[] P0AU82_n252CliCod ;
   private String[] P0AU82_A1253EmprGuiRem ;
   private long[] P0AU82_A30AlbProCod ;
   private String[] P0AU82_A396EmprCod ;
   private int[] P0AU82_A1243GuiRemCli ;
   private String[] P0AU82_A1244GuiRemCln ;
   private String[] P0AU82_A14561GuiRemmf ;
   private String[] P0AU82_A11620CliMailGr ;
   private String[] P0AU82_A11621CliMailPk ;
   private String[] P0AU82_A11622CliMailGrE ;
   private String[] P0AU82_A11623CliMailPkE ;
   private String[] P0AU82_A1902CliValA ;
   private String[] P0AU82_A39AlbProPri ;
   private String[] P0AU82_A2242AlbSec ;
   private String[] P0AU82_A5291BarTipCor ;
   private short[] P0AU82_A10301Cod_pais ;
   private boolean[] P0AU82_n10301Cod_pais ;
   private String[] P0AU83_A850UsurCod ;
   private String[] P0AU83_A10513UsuMail ;
   private java.util.UUID[] P0AU83_A14371UsurGuid ;
   private boolean[] P0AU83_n14371UsurGuid ;
   private String[] P0AU83_A14487UsurSockt ;
   private boolean[] P0AU83_n14487UsurSockt ;
   private long[] P0AU84_A30AlbProCod ;
   private String[] P0AU84_A396EmprCod ;
   private java.util.Date[] P0AU84_A34AlbProfch ;
   private java.util.UUID[] P0AU85_A14423JobId ;
   private String[] P0AU85_A14478ParKey ;
   private String[] P0AU85_A14479ParVal ;
   private boolean[] P0AU85_n14479ParVal ;
   private GXBaseCollection<app.SdtSdt_MergePDF_PDF> AV59Sdt_MergePDF ;
   private app.SdtSdt_MergePDF_PDF AV30ItemPDF ;
   private app.SdtSdt_MergePDF_PDF AV77Sdt_MergePDF_Item ;
   private app.asyncbatch.SdtJobParameterData AV99JobData ;
}

final  class runimpressionremessa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AU82", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliCod, T3.EmprGuiRem AS EmprGuiRem, T1.AlbProCod, T1.EmprCod, T3.GuiRemCli AS GuiRemCli, T4.CliNom AS GuiRemCln, T4.Cliemf AS GuiRemmf, T5.CliMailGr, T5.CliMailPk, T5.CliMailGrE, T5.CliMailPkE, T5.CliValA, T3.AlbProPri, T3.AlbSec, T2.BarTipCor, T5.Cod_pais FROM ((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T2.CliCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AU83", "SELECT UsurCod, UsuMail, UsurGuid, UsurSockt FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AU84", "SELECT AlbProCod, EmprCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AU85", "SELECT JobId, ParKey, ParVal FROM TXPJOBPAR WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((long[]) buf[6])[0] = rslt.getLong(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 40);
               ((String[]) buf[11])[0] = rslt.getString(11, 100);
               ((String[]) buf[12])[0] = rslt.getString(12, 100);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 2);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

