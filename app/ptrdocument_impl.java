package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ptrdocument_impl extends GXWebReport
{
   public ptrdocument_impl( com.genexus.internet.HttpContext context )
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
            A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
            AV23ImpCod = httpContext.GetPar( "ImpCod") ;
            AV24Tex_Copia = httpContext.GetPar( "Tex_Copia") ;
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
      M_bot = 17 ;
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
         P_lines = (int)(gxYPage-(lineHeight*17)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV41ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRCOMT", ""), GXv_char1) ;
         ptrdocument_impl.this.AV41ContDsc = GXv_char1[0] ;
         GXt_char2 = AV45FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         ptrdocument_impl.this.A396EmprCod = GXv_char1[0] ;
         ptrdocument_impl.this.GXt_char2 = GXv_char4[0] ;
         AV45FirmaD = GXt_char2 ;
         GXt_int5 = AV43existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         ptrdocument_impl.this.GXt_int5 = GXv_int6[0] ;
         AV43existefirmad = GXt_int5 ;
         /* Using cursor P05X62 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A588IvaPor = P05X62_A588IvaPor[0] ;
            n588IvaPor = P05X62_n588IvaPor[0] ;
            A953IvaCod = P05X62_A953IvaCod[0] ;
            AV17IvaPor = A588IvaPor ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P05X63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A781PrvCod = P05X63_A781PrvCod[0] ;
            A252CliCod = P05X63_A252CliCod[0] ;
            A10014AlbComFd = P05X63_A10014AlbComFd[0] ;
            A10740AlbComID = P05X63_A10740AlbComID[0] ;
            A4830AlbComMat = P05X63_A4830AlbComMat[0] ;
            A4829AlbComHor = P05X63_A4829AlbComHor[0] ;
            A16AlbComEst = P05X63_A16AlbComEst[0] ;
            A1783AlbComEso = P05X63_A1783AlbComEso[0] ;
            A787PrvDsc = P05X63_A787PrvDsc[0] ;
            n787PrvDsc = P05X63_n787PrvDsc[0] ;
            A295CliPob = P05X63_A295CliPob[0] ;
            A260CliDom = P05X63_A260CliDom[0] ;
            A17AlbComFch = P05X63_A17AlbComFch[0] ;
            A278CliNif = P05X63_A278CliNif[0] ;
            A781PrvCod = P05X63_A781PrvCod[0] ;
            A295CliPob = P05X63_A295CliPob[0] ;
            A260CliDom = P05X63_A260CliDom[0] ;
            A278CliNif = P05X63_A278CliNif[0] ;
            A787PrvDsc = P05X63_A787PrvDsc[0] ;
            n787PrvDsc = P05X63_n787PrvDsc[0] ;
            AV31CliCod = A252CliCod ;
            /* Execute user subroutine: 'CLIENTE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV13Texto_fd = " " ;
            if ( GXutil.strcmp(A10014AlbComFd, " ") != 0 )
            {
               AV44Firma4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
               AV13Texto_fd = AV44Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV45FirmaD) ;
            }
            else
            {
               AV13Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            AV12AtId = "" ;
            if ( GXutil.strcmp(A10740AlbComID, " ") != 0 )
            {
               AV12AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A10740AlbComID, 1, 12)) ;
            }
            AV9VDoc = httpContext.getMessage( "Guia de Transporte Nº", "") ;
            AV48vCopia = ((AV42Copias==1) ? httpContext.getMessage( "DUPLICADO", "") : "") ;
            AV46i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 2 )
            {
               AV22vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P05X64 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2384AlbCObs = P05X64_A2384AlbCObs[0] ;
               n2384AlbCObs = P05X64_n2384AlbCObs[0] ;
               A2386AlbCObsLin = P05X64_A2386AlbCObsLin[0] ;
               if ( AV46i > 2 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV22vObs[AV46i-1] = A2384AlbCObs ;
               AV46i = (byte)(AV46i+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV20AlbMat = A4830AlbComMat ;
            AV19AlbHorSal = localUtil.ttoc( A4829AlbComHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV28Num_lineas = (short)(0) ;
            AV18valorIva = DecimalUtil.doubleToDec(0) ;
            AV16FacImp = DecimalUtil.doubleToDec(0) ;
            AV21FacTot = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P05X65 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A13315AlbComNRef = P05X65_A13315AlbComNRef[0] ;
               A13316AlbComVDoc = P05X65_A13316AlbComVDoc[0] ;
               A13319AlbComKgs = P05X65_A13319AlbComKgs[0] ;
               A13317AlbComPzas = P05X65_A13317AlbComPzas[0] ;
               A13322AlbComCol = P05X65_A13322AlbComCol[0] ;
               A13321AlbComArtD = P05X65_A13321AlbComArtD[0] ;
               A13318AlbComMts = P05X65_A13318AlbComMts[0] ;
               A15AlbComDsc = P05X65_A15AlbComDsc[0] ;
               A20AlbComLin = P05X65_A20AlbComLin[0] ;
               AV26VarRef = GXutil.trim( GXutil.substring( A13315AlbComNRef, 1, 10)) ;
               AV27VarDoc = GXutil.trim( GXutil.substring( A13316AlbComVDoc, 1, 10)) ;
               AV29Totkgs = AV29Totkgs.add(A13319AlbComKgs) ;
               AV30Totpzs = (int)(AV30Totpzs+A13317AlbComPzas) ;
               if ( AV28Num_lineas >= 21 )
               {
                  h5X60( false, 31) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peças Totais:", ""), 101, Gx_line+6, 179, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30Totpzs), "ZZZZZ9")), 190, Gx_line+6, 235, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kgs Totais:", ""), 422, Gx_line+6, 487, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29Totkgs, "ZZZZZ9.99")), 532, Gx_line+6, 599, Gx_line+23, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+31) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV28Num_lineas = (short)(1) ;
                  AV29Totkgs = DecimalUtil.doubleToDec(0) ;
                  AV30Totpzs = 0 ;
               }
               h5X60( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26VarRef, "")), 29, Gx_line+0, 103, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27VarDoc, "")), 109, Gx_line+0, 183, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13317AlbComPzas), "ZZZZZ9")), 190, Gx_line+0, 235, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13318AlbComMts, "ZZZZZZ9.99")), 241, Gx_line+0, 315, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13321AlbComArtD, "")), 321, Gx_line+0, 512, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13319AlbComKgs, "ZZZZZZ9.99")), 668, Gx_line+0, 742, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13322AlbComCol, "")), 514, Gx_line+0, 661, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV28Num_lineas = (short)(AV28Num_lineas+1) ;
               if ( GXutil.strcmp(A15AlbComDsc, "") != 0 )
               {
                  h5X60( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A15AlbComDsc, "")), 321, Gx_line+0, 614, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV28Num_lineas = (short)(AV28Num_lineas+1) ;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            h5X60( false, 31) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peças Totais:", ""), 101, Gx_line+6, 179, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30Totpzs), "ZZZZZ9")), 190, Gx_line+6, 235, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs Totais:", ""), 422, Gx_line+6, 487, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29Totkgs, "ZZZZZ9.99")), 532, Gx_line+6, 599, Gx_line+23, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+31) ;
            if ( ( AV43existefirmad == 1 ) && (GXutil.strcmp("", A10014AlbComFd)==0) )
            {
               h5X60( false, 31) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 185, Gx_line+0, 604, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
            }
            A16AlbComEst = (byte)(((A16AlbComEst==0) ? 1 : A16AlbComEst)) ;
            A1783AlbComEso = (byte)(((A16AlbComEst==0) ? 1 : A1783AlbComEso)) ;
            /* Using cursor P05X66 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A16AlbComEst), Byte.valueOf(A1783AlbComEso), A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5X60( true, 0) ;
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
      /* Using cursor P05X67 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV31CliCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A252CliCod = P05X67_A252CliCod[0] ;
         A279CliNom = P05X67_A279CliNom[0] ;
         A3644CliNom1 = P05X67_A3644CliNom1[0] ;
         A260CliDom = P05X67_A260CliDom[0] ;
         A256CliCp = P05X67_A256CliCp[0] ;
         A295CliPob = P05X67_A295CliPob[0] ;
         A278CliNif = P05X67_A278CliNif[0] ;
         AV38CliNom = A279CliNom ;
         AV39CliNom1 = A3644CliNom1 ;
         AV10CliNom3 = GXutil.trim( A279CliNom) + GXutil.trim( AV39CliNom1) ;
         AV33CliDom = A260CliDom ;
         AV32Clicp = A256CliCp ;
         AV40CliPob = A295CliPob ;
         AV15CliNif = A278CliNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      /* Execute user subroutine: 'ENVIO' */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ENVIO' Routine */
      returnInSub = false ;
      /* Using cursor P05X68 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV31CliCod), Byte.valueOf(AV25CliEnvDom)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A266CliEnvLin = P05X68_A266CliEnvLin[0] ;
         A252CliCod = P05X68_A252CliCod[0] ;
         A267CliEnvNom = P05X68_A267CliEnvNom[0] ;
         A265CliEnvDom = P05X68_A265CliEnvDom[0] ;
         A264CliEnvCp = P05X68_A264CliEnvCp[0] ;
         A268CliEnvPob = P05X68_A268CliEnvPob[0] ;
         AV36CliENom = A267CliEnvNom ;
         AV35CliEDom = A265CliEnvDom ;
         AV34CliEcp = A264CliEnvCp ;
         AV37CliEPob = A268CliEnvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void h5X60( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), 657, Gx_line+29, 716, Gx_line+46, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Dsc_pais, "")), 426, Gx_line+182, 635, Gx_line+199, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9VDoc, "")), 541, Gx_line+29, 625, Gx_line+46, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10CliNom3, "")), 426, Gx_line+106, 740, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 426, Gx_line+125, 640, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 426, Gx_line+145, 615, Gx_line+163, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Cpostal, "")), 426, Gx_line+165, 490, Gx_line+182, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 490, Gx_line+166, 647, Gx_line+183, 0+256, 0, 0, 0) ;
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 49, Gx_line+48, 154, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A17AlbComFch, "99/99/99"), 322, Gx_line+49, 373, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 600, Gx_line+50, 645, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 660, Gx_line+50, 715, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 651, Gx_line+50, 655, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+41, 774, Gx_line+75, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+78) ;
               getPrinter().GxDrawRect(15, Gx_line+16, 774, Gx_line+44, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/Ref.", ""), 48, Gx_line+22, 84, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/Doc.", ""), 127, Gx_line+22, 164, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pçs", ""), 200, Gx_line+22, 223, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 257, Gx_line+22, 297, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 386, Gx_line+22, 445, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Qtd", ""), 694, Gx_line+22, 715, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 576, Gx_line+22, 598, Gx_line+38, 0+256, 0, 0, 0) ;
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
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "ptrdocument");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "ptrdocument");
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
      AV24Tex_Copia = "" ;
      AV41ContDsc = "" ;
      AV45FirmaD = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P05X62_A588IvaPor = new byte[1] ;
      P05X62_n588IvaPor = new boolean[] {false} ;
      P05X62_A953IvaCod = new String[] {""} ;
      A953IvaCod = "" ;
      P05X63_A781PrvCod = new short[1] ;
      P05X63_A396EmprCod = new String[] {""} ;
      P05X63_A14AlbComCod = new int[1] ;
      P05X63_A252CliCod = new int[1] ;
      P05X63_A10014AlbComFd = new String[] {""} ;
      P05X63_A10740AlbComID = new String[] {""} ;
      P05X63_A4830AlbComMat = new String[] {""} ;
      P05X63_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      P05X63_A16AlbComEst = new byte[1] ;
      P05X63_A1783AlbComEso = new byte[1] ;
      P05X63_A787PrvDsc = new String[] {""} ;
      P05X63_n787PrvDsc = new boolean[] {false} ;
      P05X63_A295CliPob = new String[] {""} ;
      P05X63_A260CliDom = new String[] {""} ;
      P05X63_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P05X63_A278CliNif = new String[] {""} ;
      A10014AlbComFd = "" ;
      A10740AlbComID = "" ;
      A4830AlbComMat = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A787PrvDsc = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A278CliNif = "" ;
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
      P05X64_A396EmprCod = new String[] {""} ;
      P05X64_A14AlbComCod = new int[1] ;
      P05X64_A2384AlbCObs = new String[] {""} ;
      P05X64_n2384AlbCObs = new boolean[] {false} ;
      P05X64_A2386AlbCObsLin = new byte[1] ;
      A2384AlbCObs = "" ;
      AV20AlbMat = "" ;
      AV19AlbHorSal = "" ;
      AV18valorIva = DecimalUtil.ZERO ;
      AV16FacImp = DecimalUtil.ZERO ;
      AV21FacTot = DecimalUtil.ZERO ;
      P05X65_A396EmprCod = new String[] {""} ;
      P05X65_A14AlbComCod = new int[1] ;
      P05X65_A13315AlbComNRef = new String[] {""} ;
      P05X65_A13316AlbComVDoc = new String[] {""} ;
      P05X65_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05X65_A13317AlbComPzas = new int[1] ;
      P05X65_A13322AlbComCol = new String[] {""} ;
      P05X65_A13321AlbComArtD = new String[] {""} ;
      P05X65_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05X65_A15AlbComDsc = new String[] {""} ;
      P05X65_A20AlbComLin = new short[1] ;
      A13315AlbComNRef = "" ;
      A13316AlbComVDoc = "" ;
      A13319AlbComKgs = DecimalUtil.ZERO ;
      A13322AlbComCol = "" ;
      A13321AlbComArtD = "" ;
      A13318AlbComMts = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      AV26VarRef = "" ;
      AV27VarDoc = "" ;
      AV29Totkgs = DecimalUtil.ZERO ;
      AV38CliNom = "" ;
      AV33CliDom = "" ;
      AV32Clicp = "" ;
      AV40CliPob = "" ;
      AV15CliNif = "" ;
      AV36CliENom = "" ;
      AV35CliEDom = "" ;
      AV34CliEcp = "" ;
      AV37CliEPob = "" ;
      P05X67_A396EmprCod = new String[] {""} ;
      P05X67_A252CliCod = new int[1] ;
      P05X67_A279CliNom = new String[] {""} ;
      P05X67_A3644CliNom1 = new String[] {""} ;
      P05X67_A260CliDom = new String[] {""} ;
      P05X67_A256CliCp = new String[] {""} ;
      P05X67_A295CliPob = new String[] {""} ;
      P05X67_A278CliNif = new String[] {""} ;
      A279CliNom = "" ;
      A3644CliNom1 = "" ;
      A256CliCp = "" ;
      AV39CliNom1 = "" ;
      AV10CliNom3 = "" ;
      P05X68_A396EmprCod = new String[] {""} ;
      P05X68_A266CliEnvLin = new byte[1] ;
      P05X68_A252CliCod = new int[1] ;
      P05X68_A267CliEnvNom = new String[] {""} ;
      P05X68_A265CliEnvDom = new String[] {""} ;
      P05X68_A264CliEnvCp = new String[] {""} ;
      P05X68_A268CliEnvPob = new String[] {""} ;
      A267CliEnvNom = "" ;
      A265CliEnvDom = "" ;
      A264CliEnvCp = "" ;
      A268CliEnvPob = "" ;
      AV8Dsc_pais = "" ;
      AV11Cpostal = "" ;
      AV14TextoCopia = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptrdocument__default(),
         new Object[] {
             new Object[] {
            P05X62_A588IvaPor, P05X62_n588IvaPor, P05X62_A953IvaCod
            }
            , new Object[] {
            P05X63_A781PrvCod, P05X63_A396EmprCod, P05X63_A14AlbComCod, P05X63_A252CliCod, P05X63_A10014AlbComFd, P05X63_A10740AlbComID, P05X63_A4830AlbComMat, P05X63_A4829AlbComHor, P05X63_A16AlbComEst, P05X63_A1783AlbComEso,
            P05X63_A787PrvDsc, P05X63_n787PrvDsc, P05X63_A295CliPob, P05X63_A260CliDom, P05X63_A17AlbComFch, P05X63_A278CliNif
            }
            , new Object[] {
            P05X64_A396EmprCod, P05X64_A14AlbComCod, P05X64_A2384AlbCObs, P05X64_n2384AlbCObs, P05X64_A2386AlbCObsLin
            }
            , new Object[] {
            P05X65_A396EmprCod, P05X65_A14AlbComCod, P05X65_A13315AlbComNRef, P05X65_A13316AlbComVDoc, P05X65_A13319AlbComKgs, P05X65_A13317AlbComPzas, P05X65_A13322AlbComCol, P05X65_A13321AlbComArtD, P05X65_A13318AlbComMts, P05X65_A15AlbComDsc,
            P05X65_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            P05X67_A396EmprCod, P05X67_A252CliCod, P05X67_A279CliNom, P05X67_A3644CliNom1, P05X67_A260CliDom, P05X67_A256CliCp, P05X67_A295CliPob, P05X67_A278CliNif
            }
            , new Object[] {
            P05X68_A396EmprCod, P05X68_A266CliEnvLin, P05X68_A252CliCod, P05X68_A267CliEnvNom, P05X68_A265CliEnvDom, P05X68_A264CliEnvCp, P05X68_A268CliEnvPob
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
   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte AV42Copias ;
   private byte AV46i ;
   private byte A2386AlbCObsLin ;
   private byte AV25CliEnvDom ;
   private byte A266CliEnvLin ;
   private short gxcookieaux ;
   private short A781PrvCod ;
   private short AV28Num_lineas ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int A14AlbComCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV31CliCod ;
   private int GX_I ;
   private int A13317AlbComPzas ;
   private int AV30Totpzs ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV18valorIva ;
   private java.math.BigDecimal AV16FacImp ;
   private java.math.BigDecimal AV21FacTot ;
   private java.math.BigDecimal A13319AlbComKgs ;
   private java.math.BigDecimal A13318AlbComMts ;
   private java.math.BigDecimal AV29Totkgs ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV23ImpCod ;
   private String AV24Tex_Copia ;
   private String AV41ContDsc ;
   private String AV45FirmaD ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A953IvaCod ;
   private String A10014AlbComFd ;
   private String A10740AlbComID ;
   private String A4830AlbComMat ;
   private String A787PrvDsc ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A278CliNif ;
   private String AV13Texto_fd ;
   private String AV44Firma4dig ;
   private String AV12AtId ;
   private String AV9VDoc ;
   private String AV48vCopia ;
   private String AV22vObs[] ;
   private String A2384AlbCObs ;
   private String AV20AlbMat ;
   private String AV19AlbHorSal ;
   private String A13315AlbComNRef ;
   private String A13316AlbComVDoc ;
   private String A13322AlbComCol ;
   private String A13321AlbComArtD ;
   private String A15AlbComDsc ;
   private String AV26VarRef ;
   private String AV27VarDoc ;
   private String AV38CliNom ;
   private String AV33CliDom ;
   private String AV32Clicp ;
   private String AV40CliPob ;
   private String AV15CliNif ;
   private String AV36CliENom ;
   private String AV35CliEDom ;
   private String AV34CliEcp ;
   private String AV37CliEPob ;
   private String A279CliNom ;
   private String A3644CliNom1 ;
   private String A256CliCp ;
   private String AV39CliNom1 ;
   private String AV10CliNom3 ;
   private String A267CliEnvNom ;
   private String A265CliEnvDom ;
   private String A264CliEnvCp ;
   private String A268CliEnvPob ;
   private String AV8Dsc_pais ;
   private String AV11Cpostal ;
   private String AV14TextoCopia ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A17AlbComFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n588IvaPor ;
   private boolean GxHdr3 ;
   private boolean n787PrvDsc ;
   private boolean returnInSub ;
   private boolean n2384AlbCObs ;
   private IDataStoreProvider pr_default ;
   private byte[] P05X62_A588IvaPor ;
   private boolean[] P05X62_n588IvaPor ;
   private String[] P05X62_A953IvaCod ;
   private short[] P05X63_A781PrvCod ;
   private String[] P05X63_A396EmprCod ;
   private int[] P05X63_A14AlbComCod ;
   private int[] P05X63_A252CliCod ;
   private String[] P05X63_A10014AlbComFd ;
   private String[] P05X63_A10740AlbComID ;
   private String[] P05X63_A4830AlbComMat ;
   private java.util.Date[] P05X63_A4829AlbComHor ;
   private byte[] P05X63_A16AlbComEst ;
   private byte[] P05X63_A1783AlbComEso ;
   private String[] P05X63_A787PrvDsc ;
   private boolean[] P05X63_n787PrvDsc ;
   private String[] P05X63_A295CliPob ;
   private String[] P05X63_A260CliDom ;
   private java.util.Date[] P05X63_A17AlbComFch ;
   private String[] P05X63_A278CliNif ;
   private String[] P05X64_A396EmprCod ;
   private int[] P05X64_A14AlbComCod ;
   private String[] P05X64_A2384AlbCObs ;
   private boolean[] P05X64_n2384AlbCObs ;
   private byte[] P05X64_A2386AlbCObsLin ;
   private String[] P05X65_A396EmprCod ;
   private int[] P05X65_A14AlbComCod ;
   private String[] P05X65_A13315AlbComNRef ;
   private String[] P05X65_A13316AlbComVDoc ;
   private java.math.BigDecimal[] P05X65_A13319AlbComKgs ;
   private int[] P05X65_A13317AlbComPzas ;
   private String[] P05X65_A13322AlbComCol ;
   private String[] P05X65_A13321AlbComArtD ;
   private java.math.BigDecimal[] P05X65_A13318AlbComMts ;
   private String[] P05X65_A15AlbComDsc ;
   private short[] P05X65_A20AlbComLin ;
   private String[] P05X67_A396EmprCod ;
   private int[] P05X67_A252CliCod ;
   private String[] P05X67_A279CliNom ;
   private String[] P05X67_A3644CliNom1 ;
   private String[] P05X67_A260CliDom ;
   private String[] P05X67_A256CliCp ;
   private String[] P05X67_A295CliPob ;
   private String[] P05X67_A278CliNif ;
   private String[] P05X68_A396EmprCod ;
   private byte[] P05X68_A266CliEnvLin ;
   private int[] P05X68_A252CliCod ;
   private String[] P05X68_A267CliEnvNom ;
   private String[] P05X68_A265CliEnvDom ;
   private String[] P05X68_A264CliEnvCp ;
   private String[] P05X68_A268CliEnvPob ;
}

final  class ptrdocument__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05X62", "SELECT IvaPor, IvaCod FROM TXPTIPIVA ORDER BY IvaCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05X63", "SELECT T2.PrvCod, T1.EmprCod, T1.AlbComCod, T1.CliCod, T1.AlbComFd, T1.AlbComID, T1.AlbComMat, T1.AlbComHor, T1.AlbComEst, T1.AlbComEso, T3.PrvDsc, T2.CliPob, T2.CliDom, T1.AlbComFch, T2.CliNif FROM ((TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPPROVIN T3 ON T3.PrvCod = T2.PrvCod) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05X64", "SELECT EmprCod, AlbComCod, AlbCObs, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05X65", "SELECT EmprCod, AlbComCod, AlbComNRef, AlbComVDoc, AlbComKgs, AlbComPzas, AlbComCol, AlbComArtD, AlbComMts, AlbComDsc, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05X66", "UPDATE TXPCALCOM SET AlbComEst=?, AlbComEso=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P05X67", "SELECT EmprCod, CliCod, CliNom, CliNom1, CliDom, CliCp, CliPob, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05X68", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom, CliEnvDom, CliEnvCp, CliEnvPob FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((String[]) buf[13])[0] = rslt.getString(13, 34);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

