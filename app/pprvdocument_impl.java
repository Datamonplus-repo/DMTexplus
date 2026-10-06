package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pprvdocument_impl extends GXWebReport
{
   public pprvdocument_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
            AV23ImpCod = httpContext.GetPar( "ImpCod") ;
            AV14TextoCopia = httpContext.GetPar( "TextoCopia") ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 15 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*15)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV41ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRMCAR", ""), GXv_char1) ;
         pprvdocument_impl.this.AV41ContDsc = GXv_char1[0] ;
         GXt_char2 = AV45FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pprvdocument_impl.this.A396EmprCod = GXv_char1[0] ;
         pprvdocument_impl.this.GXt_char2 = GXv_char4[0] ;
         AV45FirmaD = GXt_char2 ;
         GXt_int5 = AV43existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         pprvdocument_impl.this.GXt_int5 = GXv_int6[0] ;
         AV43existefirmad = GXt_int5 ;
         /* Using cursor P062J2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A588IvaPor = P062J2_A588IvaPor[0] ;
            n588IvaPor = P062J2_n588IvaPor[0] ;
            A953IvaCod = P062J2_A953IvaCod[0] ;
            AV17IvaPor = A588IvaPor ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P062J3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13417AlbProTipo = P062J3_A13417AlbProTipo[0] ;
            A13425AlbProCliC = P062J3_A13425AlbProCliC[0] ;
            A13427AlbProDomE = P062J3_A13427AlbProDomE[0] ;
            A13419AlbProPrvI = P062J3_A13419AlbProPrvI[0] ;
            A13433AlbProHh = P062J3_A13433AlbProHh[0] ;
            A13436AlbProIDAT = P062J3_A13436AlbProIDAT[0] ;
            A13439AlbProObs = P062J3_A13439AlbProObs[0] ;
            A13424AlbProMatr = P062J3_A13424AlbProMatr[0] ;
            A13437AlbProSta = P062J3_A13437AlbProSta[0] ;
            A13430AlbProDate = P062J3_A13430AlbProDate[0] ;
            if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 )
            {
               AV31CliCod = A13425AlbProCliC ;
               /* Execute user subroutine: 'CLIENTE' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV25CliEnvDom = A13427AlbProDomE ;
            }
            else
            {
               AV49PrvNum = A13419AlbProPrvI ;
               /* Execute user subroutine: 'PRVGEN' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV52Cp_1_2 = GXutil.trim( AV32Clicp) ;
            AV13Texto_fd = " " ;
            if ( GXutil.strcmp(A13433AlbProHh, " ") != 0 )
            {
               AV44Firma4dig = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
               AV13Texto_fd = AV44Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV45FirmaD) ;
            }
            else
            {
               AV13Texto_fd = httpContext.getMessage( "**Processado por Computador**", "") ;
            }
            AV12AtId = " " ;
            if ( GXutil.strcmp(A13436AlbProIDAT, " ") != 0 )
            {
               AV12AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A13436AlbProIDAT, 1, 12)) ;
            }
            AV9VDoc = httpContext.getMessage( "Guia de Transporte Nº", "") ;
            AV48vCopia = ((AV42Copias==1) ? httpContext.getMessage( "DUPLICADO", "") : "") ;
            AV57Nlin = (short)(GXutil.gxmlines( A13439AlbProObs, (short)(50))) ;
            AV46i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 2 )
            {
               AV22vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            while ( AV46i <= AV57Nlin )
            {
               if ( AV46i > 2 )
               {
                  if (true) break;
               }
               AV22vObs[AV46i-1] = GXutil.gxgetmli( A13439AlbProObs, AV46i, (short)(50)) ;
               AV46i = (byte)(AV46i+1) ;
            }
            AV20AlbMat = A13424AlbProMatr ;
            AV54AlbProFch = A13430AlbProDate ;
            AV28Num_lineas = (short)(0) ;
            AV18valorIva = DecimalUtil.doubleToDec(0) ;
            AV16FacImp = DecimalUtil.doubleToDec(0) ;
            AV21FacTot = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P062J4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A13444AlbProUnd = P062J4_A13444AlbProUnd[0] ;
               n13444AlbProUnd = P062J4_n13444AlbProUnd[0] ;
               A13443AlbProCnt = P062J4_A13443AlbProCnt[0] ;
               n13443AlbProCnt = P062J4_n13443AlbProCnt[0] ;
               A13448AlbProDsc = P062J4_A13448AlbProDsc[0] ;
               n13448AlbProDsc = P062J4_n13448AlbProDsc[0] ;
               A13447AlbProObsL = P062J4_A13447AlbProObsL[0] ;
               n13447AlbProObsL = P062J4_n13447AlbProObsL[0] ;
               A13442AlbProLine = P062J4_A13442AlbProLine[0] ;
               if ( AV28Num_lineas >= 21 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV28Num_lineas = (short)(1) ;
               }
               AV50Und = A13444AlbProUnd ;
               h62J0( false, 16) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13448AlbProDsc, "")), 49, Gx_line+0, 488, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13443AlbProCnt, "ZZZZZ9.99")), 648, Gx_line+0, 715, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Und, "")), 720, Gx_line+1, 743, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
               AV28Num_lineas = (short)(AV28Num_lineas+1) ;
               if ( GXutil.strcmp(A13447AlbProObsL, "") != 0 )
               {
                  h62J0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13447AlbProObsL, "")), 49, Gx_line+0, 488, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV28Num_lineas = (short)(AV28Num_lineas+1) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( ( AV43existefirmad == 1 ) && (GXutil.strcmp("", A13433AlbProHh)==0) )
            {
               h62J0( false, 31) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 185, Gx_line+0, 604, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
            }
            A13437AlbProSta = (byte)(((A13437AlbProSta==0) ? 1 : A13437AlbProSta)) ;
            /* Using cursor P062J5 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A13437AlbProSta), A396EmprCod, Integer.valueOf(A13418AlbProID)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h62J0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV38CliNom = "" ;
      AV33CliDom = "" ;
      AV32Clicp = "" ;
      AV40CliPob = "" ;
      AV15CliNif = "" ;
      AV36CliENom = "" ;
      AV35CliEDom = "" ;
      AV34CliEcp = "" ;
      AV37CliEPob = "" ;
      /* Using cursor P062J6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV31CliCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A781PrvCod = P062J6_A781PrvCod[0] ;
         A252CliCod = P062J6_A252CliCod[0] ;
         A279CliNom = P062J6_A279CliNom[0] ;
         A3644CliNom1 = P062J6_A3644CliNom1[0] ;
         A260CliDom = P062J6_A260CliDom[0] ;
         A4828CliCp2 = P062J6_A4828CliCp2[0] ;
         A256CliCp = P062J6_A256CliCp[0] ;
         A295CliPob = P062J6_A295CliPob[0] ;
         A278CliNif = P062J6_A278CliNif[0] ;
         A787PrvDsc = P062J6_A787PrvDsc[0] ;
         n787PrvDsc = P062J6_n787PrvDsc[0] ;
         A787PrvDsc = P062J6_A787PrvDsc[0] ;
         n787PrvDsc = P062J6_n787PrvDsc[0] ;
         AV38CliNom = A279CliNom ;
         AV51CliNom12 = GXutil.trim( A279CliNom) + " " + GXutil.trim( A3644CliNom1) ;
         AV33CliDom = A260CliDom ;
         AV32Clicp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( GXutil.substring( A4828CliCp2, 1, 4)) ;
         AV40CliPob = A295CliPob ;
         AV15CliNif = A278CliNif ;
         AV36CliENom = A279CliNom ;
         AV35CliEDom = A260CliDom ;
         AV34CliEcp = GXutil.trim( A256CliCp) + "-" + GXutil.trim( GXutil.substring( A4828CliCp2, 1, 4)) ;
         AV37CliEPob = A295CliPob ;
         AV53Prvdsc1 = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      /* Execute user subroutine: 'ENVIO' */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P062J7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV31CliCod), Byte.valueOf(AV25CliEnvDom)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A266CliEnvLin = P062J7_A266CliEnvLin[0] ;
         A252CliCod = P062J7_A252CliCod[0] ;
         A267CliEnvNom = P062J7_A267CliEnvNom[0] ;
         A265CliEnvDom = P062J7_A265CliEnvDom[0] ;
         A10775CliEnvCp2 = P062J7_A10775CliEnvCp2[0] ;
         A264CliEnvCp = P062J7_A264CliEnvCp[0] ;
         A268CliEnvPob = P062J7_A268CliEnvPob[0] ;
         A270CliEnvPrv = P062J7_A270CliEnvPrv[0] ;
         AV36CliENom = A267CliEnvNom ;
         AV35CliEDom = A265CliEnvDom ;
         AV34CliEcp = GXutil.trim( A264CliEnvCp) + "-" + GXutil.trim( GXutil.substring( A10775CliEnvCp2, 1, 4)) ;
         AV37CliEPob = A268CliEnvPob ;
         AV55CodPrv = A270CliEnvPrv ;
         /* Execute user subroutine: 'PROVIN' */
         S138 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S138( ) throws ProcessInterruptedException
   {
      /* 'PROVIN' Routine */
      returnInSub = false ;
      /* Using cursor P062J8 */
      pr_default.execute(6, new Object[] {Short.valueOf(AV55CodPrv)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A781PrvCod = P062J8_A781PrvCod[0] ;
         A787PrvDsc = P062J8_A787PrvDsc[0] ;
         n787PrvDsc = P062J8_n787PrvDsc[0] ;
         AV56PrvDsc = A787PrvDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      AV38CliNom = "" ;
      AV33CliDom = "" ;
      AV32Clicp = "" ;
      AV40CliPob = "" ;
      AV15CliNif = "" ;
      AV36CliENom = "" ;
      AV35CliEDom = "" ;
      AV34CliEcp = "" ;
      AV37CliEPob = "" ;
      AV56PrvDsc = "" ;
      AV53Prvdsc1 = "" ;
      /* Using cursor P062J9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV49PrvNum)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A795PrvNum = P062J9_A795PrvNum[0] ;
         A794PrvNom = P062J9_A794PrvNom[0] ;
         n794PrvNom = P062J9_n794PrvNom[0] ;
         A6570PrvNom2 = P062J9_A6570PrvNom2[0] ;
         n6570PrvNom2 = P062J9_n6570PrvNom2[0] ;
         A786PrvDir = P062J9_A786PrvDir[0] ;
         n786PrvDir = P062J9_n786PrvDir[0] ;
         A6075PrvCp2 = P062J9_A6075PrvCp2[0] ;
         n6075PrvCp2 = P062J9_n6075PrvCp2[0] ;
         A782PrvCpo = P062J9_A782PrvCpo[0] ;
         n782PrvCpo = P062J9_n782PrvCpo[0] ;
         A799PrvPob = P062J9_A799PrvPob[0] ;
         n799PrvPob = P062J9_n799PrvPob[0] ;
         A793PrvNif = P062J9_A793PrvNif[0] ;
         n793PrvNif = P062J9_n793PrvNif[0] ;
         AV38CliNom = A794PrvNom ;
         AV51CliNom12 = GXutil.trim( A794PrvNom) + " " + GXutil.trim( A6570PrvNom2) ;
         AV33CliDom = A786PrvDir ;
         AV32Clicp = GXutil.trim( A782PrvCpo) + "-" + GXutil.trim( A6075PrvCp2) ;
         AV40CliPob = A799PrvPob ;
         AV15CliNif = A793PrvNif ;
         AV36CliENom = A794PrvNom ;
         AV35CliEDom = A786PrvDir ;
         AV34CliEcp = GXutil.trim( A782PrvCpo) + "-" + GXutil.trim( A6075PrvCp2) ;
         AV37CliEPob = A799PrvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void h62J0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxDrawRect(498, Gx_line+16, 666, Gx_line+101, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+16, 250, Gx_line+47, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Incidencia", ""), 25, Gx_line+24, 84, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Taxa", ""), 115, Gx_line+24, 142, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 186, Gx_line+24, 215, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16FacImp, "ZZZZZZ9.99")), 18, Gx_line+48, 92, Gx_line+65, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17IvaPor), "Z9")), 121, Gx_line+48, 137, Gx_line+65, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18valorIva, "ZZZZZZ9.99")), 165, Gx_line+48, 239, Gx_line+65, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+47, 250, Gx_line+104, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Carga:", ""), 284, Gx_line+16, 324, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/MORADA", ""), 357, Gx_line+16, 423, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESTINATARIO", ""), 357, Gx_line+36, 446, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descarga:", ""), 284, Gx_line+36, 344, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Viatura:", ""), 284, Gx_line+56, 328, Gx_line+72, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 284, Gx_line+76, 316, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19AlbHorSal, "")), 357, Gx_line+76, 450, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20AlbMat, "")), 357, Gx_line+56, 462, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(663, Gx_line+16, 774, Gx_line+101, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16FacImp, "ZZZZZZ9.99")), 693, Gx_line+26, 767, Gx_line+43, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18valorIva, "ZZZZZZ9.99")), 693, Gx_line+56, 767, Gx_line+73, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21FacTot, "ZZZZZZ9.99")), 693, Gx_line+77, 767, Gx_line+94, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor Mercadoria:", ""), 504, Gx_line+26, 603, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor IVA:", ""), 504, Gx_line+56, 556, Gx_line+72, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Documento:", ""), 504, Gx_line+77, 605, Gx_line+93, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+109) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EM TODAS AS MALHAS PARA TINTO EM PEÇA, SERA NECESSARIO UM TRATAMENTO PREVIO ANTES DE TINGIR", ""), 71, Gx_line+5, 720, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+0, 774, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OBS.:", ""), 22, Gx_line+0, 55, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22vObs[1-1], "")), 65, Gx_line+2, 431, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22vObs[2-1], "")), 65, Gx_line+21, 431, Gx_line+38, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+47) ;
               getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Notas:  1 -A CARVITIN não aceita reclamações apos 8 dias da entrega da encomenda", ""), 22, Gx_line+0, 396, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "           2 -A CARVITIN não aceita reclamações de material ja cortado.", ""), 22, Gx_line+13, 326, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "           3 -A CARVITIN so se responsabiliza pelos resultados dos ensaios que são efectuados internamente.", ""), 22, Gx_line+25, 490, Gx_line+41, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+47) ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if ( GxHdr3 )
            {
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54048fec-42e9-4415-86de-5a947ab41957", "", context.getHttpContext().getTheme( )), 15, Gx_line+16, 241, Gx_line+76) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Soc. por quotas-Capital Social 200.000.00 Euros Reg na", ""), 15, Gx_line+83, 357, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "C.R.C. Braga Sob o nº 507975170 Parque Ind. Padim", ""), 15, Gx_line+102, 358, Gx_line+119, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "da Graça Lote 16 4700 - 670 PADIM DA GRAÇA (BRG)", ""), 15, Gx_line+120, 359, Gx_line+137, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tel. 253 300090 / Fax. 253 622428 IVA PT 50797510", ""), 15, Gx_line+138, 339, Gx_line+155, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exmos. Srs.", ""), 427, Gx_line+83, 504, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9")), 657, Gx_line+29, 716, Gx_line+46, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9VDoc, "")), 541, Gx_line+29, 625, Gx_line+46, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51CliNom12, "")), 426, Gx_line+106, 802, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33CliDom, "")), 426, Gx_line+125, 640, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40CliPob, "")), 426, Gx_line+145, 615, Gx_line+163, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Cp_1_2, "")), 426, Gx_line+165, 484, Gx_line+182, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Prvdsc1, "@!")), 490, Gx_line+166, 647, Gx_line+183, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+203) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12AtId, "")), 15, Gx_line+16, 204, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Texto_fd, "")), 331, Gx_line+42, 707, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14TextoCopia, "")), 15, Gx_line+42, 141, Gx_line+60, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+78) ;
               getPrinter().GxDrawRect(15, Gx_line+0, 774, Gx_line+42, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Nº Contribuinte", ""), 42, Gx_line+14, 151, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data do Documento", ""), 285, Gx_line+14, 406, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 624, Gx_line+14, 667, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15CliNif, "@!")), 49, Gx_line+48, 154, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A13430AlbProDate, "99/99/99"), 322, Gx_line+49, 373, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 600, Gx_line+50, 645, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 660, Gx_line+50, 715, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 651, Gx_line+50, 655, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+41, 774, Gx_line+75, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+78) ;
               getPrinter().GxDrawRect(15, Gx_line+16, 774, Gx_line+44, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 49, Gx_line+22, 108, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Qtd", ""), 694, Gx_line+22, 715, Gx_line+38, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+47) ;
            }
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial Narrow", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pprvdocument");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "pprvdocument");
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      A396EmprCod = "" ;
      AV23ImpCod = "" ;
      AV14TextoCopia = "" ;
      AV41ContDsc = "" ;
      AV45FirmaD = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P062J2_A588IvaPor = new byte[1] ;
      P062J2_n588IvaPor = new boolean[] {false} ;
      P062J2_A953IvaCod = new String[] {""} ;
      A953IvaCod = "" ;
      P062J3_A396EmprCod = new String[] {""} ;
      P062J3_A13418AlbProID = new int[1] ;
      P062J3_A13417AlbProTipo = new String[] {""} ;
      P062J3_A13425AlbProCliC = new int[1] ;
      P062J3_A13427AlbProDomE = new byte[1] ;
      P062J3_A13419AlbProPrvI = new int[1] ;
      P062J3_A13433AlbProHh = new String[] {""} ;
      P062J3_A13436AlbProIDAT = new String[] {""} ;
      P062J3_A13439AlbProObs = new String[] {""} ;
      P062J3_A13424AlbProMatr = new String[] {""} ;
      P062J3_A13437AlbProSta = new byte[1] ;
      P062J3_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      A13417AlbProTipo = "" ;
      A13433AlbProHh = "" ;
      A13436AlbProIDAT = "" ;
      A13439AlbProObs = "" ;
      A13424AlbProMatr = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      AV52Cp_1_2 = "" ;
      AV32Clicp = "" ;
      AV13Texto_fd = "" ;
      AV44Firma4dig = "" ;
      AV12AtId = "" ;
      AV9VDoc = "" ;
      AV48vCopia = "" ;
      AV22vObs = new String[2] ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV22vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV20AlbMat = "" ;
      AV54AlbProFch = GXutil.nullDate() ;
      AV18valorIva = DecimalUtil.ZERO ;
      AV16FacImp = DecimalUtil.ZERO ;
      AV21FacTot = DecimalUtil.ZERO ;
      P062J4_A396EmprCod = new String[] {""} ;
      P062J4_A13418AlbProID = new int[1] ;
      P062J4_A13444AlbProUnd = new String[] {""} ;
      P062J4_n13444AlbProUnd = new boolean[] {false} ;
      P062J4_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P062J4_n13443AlbProCnt = new boolean[] {false} ;
      P062J4_A13448AlbProDsc = new String[] {""} ;
      P062J4_n13448AlbProDsc = new boolean[] {false} ;
      P062J4_A13447AlbProObsL = new String[] {""} ;
      P062J4_n13447AlbProObsL = new boolean[] {false} ;
      P062J4_A13442AlbProLine = new short[1] ;
      A13444AlbProUnd = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A13448AlbProDsc = "" ;
      A13447AlbProObsL = "" ;
      AV50Und = "" ;
      AV38CliNom = "" ;
      AV33CliDom = "" ;
      AV40CliPob = "" ;
      AV15CliNif = "" ;
      AV36CliENom = "" ;
      AV35CliEDom = "" ;
      AV34CliEcp = "" ;
      AV37CliEPob = "" ;
      P062J6_A781PrvCod = new short[1] ;
      P062J6_A396EmprCod = new String[] {""} ;
      P062J6_A252CliCod = new int[1] ;
      P062J6_A279CliNom = new String[] {""} ;
      P062J6_A3644CliNom1 = new String[] {""} ;
      P062J6_A260CliDom = new String[] {""} ;
      P062J6_A4828CliCp2 = new String[] {""} ;
      P062J6_A256CliCp = new String[] {""} ;
      P062J6_A295CliPob = new String[] {""} ;
      P062J6_A278CliNif = new String[] {""} ;
      P062J6_A787PrvDsc = new String[] {""} ;
      P062J6_n787PrvDsc = new boolean[] {false} ;
      A279CliNom = "" ;
      A3644CliNom1 = "" ;
      A260CliDom = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A295CliPob = "" ;
      A278CliNif = "" ;
      A787PrvDsc = "" ;
      AV51CliNom12 = "" ;
      AV53Prvdsc1 = "" ;
      P062J7_A396EmprCod = new String[] {""} ;
      P062J7_A266CliEnvLin = new byte[1] ;
      P062J7_A252CliCod = new int[1] ;
      P062J7_A267CliEnvNom = new String[] {""} ;
      P062J7_A265CliEnvDom = new String[] {""} ;
      P062J7_A10775CliEnvCp2 = new String[] {""} ;
      P062J7_A264CliEnvCp = new String[] {""} ;
      P062J7_A268CliEnvPob = new String[] {""} ;
      P062J7_A270CliEnvPrv = new short[1] ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A10775CliEnvCp2 = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      P062J8_A781PrvCod = new short[1] ;
      P062J8_A787PrvDsc = new String[] {""} ;
      P062J8_n787PrvDsc = new boolean[] {false} ;
      AV56PrvDsc = "" ;
      P062J9_A396EmprCod = new String[] {""} ;
      P062J9_A795PrvNum = new int[1] ;
      P062J9_A794PrvNom = new String[] {""} ;
      P062J9_n794PrvNom = new boolean[] {false} ;
      P062J9_A6570PrvNom2 = new String[] {""} ;
      P062J9_n6570PrvNom2 = new boolean[] {false} ;
      P062J9_A786PrvDir = new String[] {""} ;
      P062J9_n786PrvDir = new boolean[] {false} ;
      P062J9_A6075PrvCp2 = new String[] {""} ;
      P062J9_n6075PrvCp2 = new boolean[] {false} ;
      P062J9_A782PrvCpo = new String[] {""} ;
      P062J9_n782PrvCpo = new boolean[] {false} ;
      P062J9_A799PrvPob = new String[] {""} ;
      P062J9_n799PrvPob = new boolean[] {false} ;
      P062J9_A793PrvNif = new String[] {""} ;
      P062J9_n793PrvNif = new boolean[] {false} ;
      A794PrvNom = "" ;
      A6570PrvNom2 = "" ;
      A786PrvDir = "" ;
      A6075PrvCp2 = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      AV19AlbHorSal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprvdocument__default(),
         new Object[] {
             new Object[] {
            P062J2_A588IvaPor, P062J2_n588IvaPor, P062J2_A953IvaCod
            }
            , new Object[] {
            P062J3_A396EmprCod, P062J3_A13418AlbProID, P062J3_A13417AlbProTipo, P062J3_A13425AlbProCliC, P062J3_A13427AlbProDomE, P062J3_A13419AlbProPrvI, P062J3_A13433AlbProHh, P062J3_A13436AlbProIDAT, P062J3_A13439AlbProObs, P062J3_A13424AlbProMatr,
            P062J3_A13437AlbProSta, P062J3_A13430AlbProDate
            }
            , new Object[] {
            P062J4_A396EmprCod, P062J4_A13418AlbProID, P062J4_A13444AlbProUnd, P062J4_n13444AlbProUnd, P062J4_A13443AlbProCnt, P062J4_n13443AlbProCnt, P062J4_A13448AlbProDsc, P062J4_n13448AlbProDsc, P062J4_A13447AlbProObsL, P062J4_n13447AlbProObsL,
            P062J4_A13442AlbProLine
            }
            , new Object[] {
            }
            , new Object[] {
            P062J6_A781PrvCod, P062J6_A396EmprCod, P062J6_A252CliCod, P062J6_A279CliNom, P062J6_A3644CliNom1, P062J6_A260CliDom, P062J6_A4828CliCp2, P062J6_A256CliCp, P062J6_A295CliPob, P062J6_A278CliNif,
            P062J6_A787PrvDsc, P062J6_n787PrvDsc
            }
            , new Object[] {
            P062J7_A396EmprCod, P062J7_A266CliEnvLin, P062J7_A252CliCod, P062J7_A267CliEnvNom, P062J7_A265CliEnvDom, P062J7_A10775CliEnvCp2, P062J7_A264CliEnvCp, P062J7_A268CliEnvPob, P062J7_A270CliEnvPrv
            }
            , new Object[] {
            P062J8_A781PrvCod, P062J8_A787PrvDsc, P062J8_n787PrvDsc
            }
            , new Object[] {
            P062J9_A396EmprCod, P062J9_A795PrvNum, P062J9_A794PrvNom, P062J9_n794PrvNom, P062J9_A6570PrvNom2, P062J9_n6570PrvNom2, P062J9_A786PrvDir, P062J9_n786PrvDir, P062J9_A6075PrvCp2, P062J9_n6075PrvCp2,
            P062J9_A782PrvCpo, P062J9_n782PrvCpo, P062J9_A799PrvPob, P062J9_n799PrvPob, P062J9_A793PrvNif, P062J9_n793PrvNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV43existefirmad ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A588IvaPor ;
   private byte AV17IvaPor ;
   private byte A13427AlbProDomE ;
   private byte A13437AlbProSta ;
   private byte AV25CliEnvDom ;
   private byte AV42Copias ;
   private byte AV46i ;
   private byte A266CliEnvLin ;
   private short gxcookieaux ;
   private short AV57Nlin ;
   private short AV28Num_lineas ;
   private short A13442AlbProLine ;
   private short A781PrvCod ;
   private short A270CliEnvPrv ;
   private short AV55CodPrv ;
   private short Gx_err ;
   private int A13418AlbProID ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A13425AlbProCliC ;
   private int A13419AlbProPrvI ;
   private int AV31CliCod ;
   private int AV49PrvNum ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int A252CliCod ;
   private int A795PrvNum ;
   private java.math.BigDecimal AV18valorIva ;
   private java.math.BigDecimal AV16FacImp ;
   private java.math.BigDecimal AV21FacTot ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV23ImpCod ;
   private String AV14TextoCopia ;
   private String AV41ContDsc ;
   private String AV45FirmaD ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A953IvaCod ;
   private String A13417AlbProTipo ;
   private String A13436AlbProIDAT ;
   private String A13424AlbProMatr ;
   private String AV52Cp_1_2 ;
   private String AV32Clicp ;
   private String AV13Texto_fd ;
   private String AV44Firma4dig ;
   private String AV12AtId ;
   private String AV9VDoc ;
   private String AV48vCopia ;
   private String AV22vObs[] ;
   private String AV20AlbMat ;
   private String A13444AlbProUnd ;
   private String A13448AlbProDsc ;
   private String A13447AlbProObsL ;
   private String AV50Und ;
   private String AV38CliNom ;
   private String AV33CliDom ;
   private String AV40CliPob ;
   private String AV15CliNif ;
   private String AV36CliENom ;
   private String AV35CliEDom ;
   private String AV34CliEcp ;
   private String AV37CliEPob ;
   private String A279CliNom ;
   private String A3644CliNom1 ;
   private String A260CliDom ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A295CliPob ;
   private String A278CliNif ;
   private String A787PrvDsc ;
   private String AV51CliNom12 ;
   private String AV53Prvdsc1 ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A10775CliEnvCp2 ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private String AV56PrvDsc ;
   private String A794PrvNom ;
   private String A6570PrvNom2 ;
   private String A786PrvDir ;
   private String A6075PrvCp2 ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A793PrvNif ;
   private String AV19AlbHorSal ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date AV54AlbProFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n588IvaPor ;
   private boolean GxHdr3 ;
   private boolean returnInSub ;
   private boolean n13444AlbProUnd ;
   private boolean n13443AlbProCnt ;
   private boolean n13448AlbProDsc ;
   private boolean n13447AlbProObsL ;
   private boolean n787PrvDsc ;
   private boolean n794PrvNom ;
   private boolean n6570PrvNom2 ;
   private boolean n786PrvDir ;
   private boolean n6075PrvCp2 ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n793PrvNif ;
   private String A13433AlbProHh ;
   private String A13439AlbProObs ;
   private IDataStoreProvider pr_default ;
   private byte[] P062J2_A588IvaPor ;
   private boolean[] P062J2_n588IvaPor ;
   private String[] P062J2_A953IvaCod ;
   private String[] P062J3_A396EmprCod ;
   private int[] P062J3_A13418AlbProID ;
   private String[] P062J3_A13417AlbProTipo ;
   private int[] P062J3_A13425AlbProCliC ;
   private byte[] P062J3_A13427AlbProDomE ;
   private int[] P062J3_A13419AlbProPrvI ;
   private String[] P062J3_A13433AlbProHh ;
   private String[] P062J3_A13436AlbProIDAT ;
   private String[] P062J3_A13439AlbProObs ;
   private String[] P062J3_A13424AlbProMatr ;
   private byte[] P062J3_A13437AlbProSta ;
   private java.util.Date[] P062J3_A13430AlbProDate ;
   private String[] P062J4_A396EmprCod ;
   private int[] P062J4_A13418AlbProID ;
   private String[] P062J4_A13444AlbProUnd ;
   private boolean[] P062J4_n13444AlbProUnd ;
   private java.math.BigDecimal[] P062J4_A13443AlbProCnt ;
   private boolean[] P062J4_n13443AlbProCnt ;
   private String[] P062J4_A13448AlbProDsc ;
   private boolean[] P062J4_n13448AlbProDsc ;
   private String[] P062J4_A13447AlbProObsL ;
   private boolean[] P062J4_n13447AlbProObsL ;
   private short[] P062J4_A13442AlbProLine ;
   private short[] P062J6_A781PrvCod ;
   private String[] P062J6_A396EmprCod ;
   private int[] P062J6_A252CliCod ;
   private String[] P062J6_A279CliNom ;
   private String[] P062J6_A3644CliNom1 ;
   private String[] P062J6_A260CliDom ;
   private String[] P062J6_A4828CliCp2 ;
   private String[] P062J6_A256CliCp ;
   private String[] P062J6_A295CliPob ;
   private String[] P062J6_A278CliNif ;
   private String[] P062J6_A787PrvDsc ;
   private boolean[] P062J6_n787PrvDsc ;
   private String[] P062J7_A396EmprCod ;
   private byte[] P062J7_A266CliEnvLin ;
   private int[] P062J7_A252CliCod ;
   private String[] P062J7_A267CliEnvNom ;
   private String[] P062J7_A265CliEnvDom ;
   private String[] P062J7_A10775CliEnvCp2 ;
   private String[] P062J7_A264CliEnvCp ;
   private String[] P062J7_A268CliEnvPob ;
   private short[] P062J7_A270CliEnvPrv ;
   private short[] P062J8_A781PrvCod ;
   private String[] P062J8_A787PrvDsc ;
   private boolean[] P062J8_n787PrvDsc ;
   private String[] P062J9_A396EmprCod ;
   private int[] P062J9_A795PrvNum ;
   private String[] P062J9_A794PrvNom ;
   private boolean[] P062J9_n794PrvNom ;
   private String[] P062J9_A6570PrvNom2 ;
   private boolean[] P062J9_n6570PrvNom2 ;
   private String[] P062J9_A786PrvDir ;
   private boolean[] P062J9_n786PrvDir ;
   private String[] P062J9_A6075PrvCp2 ;
   private boolean[] P062J9_n6075PrvCp2 ;
   private String[] P062J9_A782PrvCpo ;
   private boolean[] P062J9_n782PrvCpo ;
   private String[] P062J9_A799PrvPob ;
   private boolean[] P062J9_n799PrvPob ;
   private String[] P062J9_A793PrvNif ;
   private boolean[] P062J9_n793PrvNif ;
}

final  class pprvdocument__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P062J2", "SELECT IvaPor, IvaCod FROM TXPTIPIVA ORDER BY IvaCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P062J3", "SELECT EmprCod, AlbProID, AlbProTipo, AlbProCliC, AlbProDomE, AlbProPrvI, AlbProHh, AlbProIDAT, AlbProObs, AlbProMatr, AlbProSta, AlbProDate FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P062J4", "SELECT EmprCod, AlbProID, AlbProUnd, AlbProCnt, AlbProDsc, AlbProObsL, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID, AlbProLine ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P062J5", "UPDATE TXPCALPRO SET AlbProSta=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
         ,new ForEachCursor("P062J6", "SELECT T1.PrvCod, T1.EmprCod, T1.CliCod, T1.CliNom, T1.CliNom1, T1.CliDom, T1.CliCp2, T1.CliCp, T1.CliPob, T1.CliNif, T2.PrvDsc FROM (TXPCLIENT T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P062J7", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp2, CliEnvCp, CliEnvPob, CliEnvPrv FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P062J8", "SELECT PrvCod, PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ORDER BY PrvCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P062J9", "SELECT EmprCod, PrvNum, PrvNom, PrvNom2, PrvDir, PrvCp2, PrvCpo, PrvPob, PrvNif FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

