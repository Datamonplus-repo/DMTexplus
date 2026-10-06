package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pextdocumento_impl extends GXWebReport
{
   public pextdocumento_impl( com.genexus.internet.HttpContext context )
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
            A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
            AV29ImpCod = httpContext.GetPar( "ImpCod") ;
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
      M_bot = 16 ;
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
         P_lines = (int)(gxYPage-(lineHeight*16)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV30ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MOD000", ""), GXv_char1) ;
         pextdocumento_impl.this.AV30ContDsc = GXv_char1[0] ;
         GXt_char2 = AV28FirmaD ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         pextdocumento_impl.this.A396EmprCod = GXv_char1[0] ;
         pextdocumento_impl.this.GXt_char2 = GXv_char4[0] ;
         AV28FirmaD = GXt_char2 ;
         GXt_int5 = AV32existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         pextdocumento_impl.this.GXt_int5 = GXv_int6[0] ;
         AV32existefirmad = GXt_int5 ;
         /* Using cursor P05X72 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A588IvaPor = P05X72_A588IvaPor[0] ;
            n588IvaPor = P05X72_n588IvaPor[0] ;
            A953IvaCod = P05X72_A953IvaCod[0] ;
            AV21IvaPor = A588IvaPor ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P05X73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3554SalExtObs = P05X73_A3554SalExtObs[0] ;
            A840TrnCod = P05X73_A840TrnCod[0] ;
            n840TrnCod = P05X73_n840TrnCod[0] ;
            A781PrvCod = P05X73_A781PrvCod[0] ;
            n781PrvCod = P05X73_n781PrvCod[0] ;
            A2248ManCod = P05X73_A2248ManCod[0] ;
            A10743ManCp2 = P05X73_A10743ManCp2[0] ;
            n10743ManCp2 = P05X73_n10743ManCp2[0] ;
            A2252ManCpo = P05X73_A2252ManCpo[0] ;
            n2252ManCpo = P05X73_n2252ManCpo[0] ;
            A10077SalFmd = P05X73_A10077SalFmd[0] ;
            A10742SalCodeID = P05X73_A10742SalCodeID[0] ;
            A6397SalExtMat = P05X73_A6397SalExtMat[0] ;
            A6396SalExtHor = P05X73_A6396SalExtHor[0] ;
            A2258SalExtLis = P05X73_A2258SalExtLis[0] ;
            A787PrvDsc = P05X73_A787PrvDsc[0] ;
            n787PrvDsc = P05X73_n787PrvDsc[0] ;
            A2251ManPob = P05X73_A2251ManPob[0] ;
            n2251ManPob = P05X73_n2251ManPob[0] ;
            A2250ManDom = P05X73_A2250ManDom[0] ;
            n2250ManDom = P05X73_n2250ManDom[0] ;
            A2249ManNom = P05X73_A2249ManNom[0] ;
            n2249ManNom = P05X73_n2249ManNom[0] ;
            A2256SalExtFec = P05X73_A2256SalExtFec[0] ;
            A3302ManNif = P05X73_A3302ManNif[0] ;
            n3302ManNif = P05X73_n3302ManNif[0] ;
            A781PrvCod = P05X73_A781PrvCod[0] ;
            n781PrvCod = P05X73_n781PrvCod[0] ;
            A787PrvDsc = P05X73_A787PrvDsc[0] ;
            n787PrvDsc = P05X73_n787PrvDsc[0] ;
            A10743ManCp2 = P05X73_A10743ManCp2[0] ;
            n10743ManCp2 = P05X73_n10743ManCp2[0] ;
            A2252ManCpo = P05X73_A2252ManCpo[0] ;
            n2252ManCpo = P05X73_n2252ManCpo[0] ;
            A2251ManPob = P05X73_A2251ManPob[0] ;
            n2251ManPob = P05X73_n2251ManPob[0] ;
            A2250ManDom = P05X73_A2250ManDom[0] ;
            n2250ManDom = P05X73_n2250ManDom[0] ;
            A2249ManNom = P05X73_A2249ManNom[0] ;
            n2249ManNom = P05X73_n2249ManNom[0] ;
            A3302ManNif = P05X73_A3302ManNif[0] ;
            n3302ManNif = P05X73_n3302ManNif[0] ;
            AV11Cpostal = A2252ManCpo + ((GXutil.strcmp(A10743ManCp2, " ")!=0) ? "-"+A10743ManCp2 : "") ;
            AV13Texto_fd = " " ;
            if ( GXutil.strcmp(A10077SalFmd, " ") != 0 )
            {
               AV27Firma4dig = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
               AV13Texto_fd = AV27Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV28FirmaD) ;
            }
            else
            {
               AV13Texto_fd = httpContext.getMessage( "Processado por Computador", "") ;
            }
            if ( GXutil.strcmp(A10742SalCodeID, " ") > 0 )
            {
               AV12AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A10742SalCodeID, 1, 12)) ;
            }
            AV9VDoc = httpContext.getMessage( "Guia de Transporte", "") ;
            AV14TextoCopia = ((AV31copias==1) ? httpContext.getMessage( "DUPLICADO", "") : "") ;
            AV26SalExtObs = A3554SalExtObs ;
            AV24AlbMat = A6397SalExtMat ;
            AV23AlbHorSal = A6396SalExtHor ;
            /* Using cursor P05X74 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A6558FasCodn = P05X74_A6558FasCodn[0] ;
               A6249SalExObs = P05X74_A6249SalExObs[0] ;
               A212BarSer = P05X74_A212BarSer[0] ;
               A4812BarEncCli = P05X74_A4812BarEncCli[0] ;
               A1234BarNomCli = P05X74_A1234BarNomCli[0] ;
               A6256SalExKgE = P05X74_A6256SalExKgE[0] ;
               A130BarCodPar = P05X74_A130BarCodPar[0] ;
               A132BarCodReo = P05X74_A132BarCodReo[0] ;
               A129BarCod = P05X74_A129BarCod[0] ;
               A6248SalExNln = P05X74_A6248SalExNln[0] ;
               A212BarSer = P05X74_A212BarSer[0] ;
               A4812BarEncCli = P05X74_A4812BarEncCli[0] ;
               A1234BarNomCli = P05X74_A1234BarNomCli[0] ;
               GXt_char2 = AV16FasDsc ;
               GXv_char4[0] = GXt_char2 ;
               new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A6558FasCodn, GXv_char4) ;
               pextdocumento_impl.this.GXt_char2 = GXv_char4[0] ;
               AV16FasDsc = GXt_char2 ;
               AV17ObsHdr = A6249SalExObs ;
               AV33Hdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
               h5X70( false, 31) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16FasDsc, "")), 357, Gx_line+0, 562, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17ObsHdr, "")), 357, Gx_line+16, 540, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6256SalExKgE, "ZZZZZ9.99")), 685, Gx_line+0, 752, Gx_line+16, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 569, Gx_line+0, 665, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Hdr, "")), 255, Gx_line+0, 336, Gx_line+17, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 255, Gx_line+16, 335, Gx_line+32, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Talão:", ""), 211, Gx_line+16, 246, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 29, Gx_line+0, 147, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
               AV19Totkgs = AV19Totkgs.add(A6256SalExKgE) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h5X70( false, 47) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peças Totais:", ""), 44, Gx_line+16, 122, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18Totpzs), "ZZZZZ9")), 133, Gx_line+16, 178, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs Totais:", ""), 423, Gx_line+16, 488, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19Totkgs, "ZZZZZ9.99")), 514, Gx_line+16, 581, Gx_line+33, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+47) ;
            if ( ( AV32existefirmad == 1 ) && (GXutil.strcmp("", A10077SalFmd)==0) )
            {
               h5X70( false, 31) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 185, Gx_line+8, 604, Gx_line+31, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
            }
            A2258SalExtLis = (byte)(((A2258SalExtLis==0) ? 1 : A2258SalExtLis)) ;
            /* Using cursor P05X75 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A2258SalExtLis), A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5X70( true, 0) ;
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

   public void h5X70( boolean bFoot ,
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
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20FacImp, "ZZZZZZ9.99")), 18, Gx_line+48, 92, Gx_line+65, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21IvaPor), "Z9")), 121, Gx_line+48, 137, Gx_line+65, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22valorIva, "ZZZZZZ9.99")), 165, Gx_line+48, 239, Gx_line+65, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+47, 250, Gx_line+104, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Carga:", ""), 284, Gx_line+16, 324, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/MORADA", ""), 357, Gx_line+16, 423, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESTINATARIO", ""), 357, Gx_line+36, 446, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descarga:", ""), 284, Gx_line+36, 344, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Viatura:", ""), 284, Gx_line+56, 328, Gx_line+72, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 284, Gx_line+76, 316, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23AlbHorSal, "")), 357, Gx_line+76, 450, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24AlbMat, "")), 357, Gx_line+56, 462, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(663, Gx_line+16, 774, Gx_line+101, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20FacImp, "ZZZZZZ9.99")), 693, Gx_line+26, 767, Gx_line+43, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22valorIva, "ZZZZZZ9.99")), 693, Gx_line+56, 767, Gx_line+73, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25FacTot, "ZZZZZZ9.99")), 693, Gx_line+77, 767, Gx_line+94, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor Mercadoria:", ""), 504, Gx_line+26, 603, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor IVA:", ""), 504, Gx_line+56, 556, Gx_line+72, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Documento:", ""), 504, Gx_line+77, 605, Gx_line+93, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+109) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "EM TODAS AS MALHAS PARA TINTO EM PEÇA, SERA NECESSARIO UM TRATAMENTO PREVIO ANTES DE TINGIR", ""), 107, Gx_line+5, 756, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+0, 774, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OBS.:", ""), 29, Gx_line+0, 62, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(AV26SalExtObs, 73, Gx_line+0, 694, Gx_line+47, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+63) ;
               getPrinter().GxAttris("Arial Narrow", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Notas: 1 -A CARVITIN não aceita reclamações apos 8 dias da entrega da encomenda", ""), 15, Gx_line+0, 386, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "          2 -A CARVITIN não aceita reclamações de material ja cortado.", ""), 15, Gx_line+13, 316, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "          3 -A CARVITIN so se responsabiliza pelos resultados dos ensaios que são efectuados internamente.", ""), 15, Gx_line+25, 480, Gx_line+41, 0+256, 0, 0, 0) ;
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
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54048fec-42e9-4415-86de-5a947ab41957", "", context.getHttpContext().getTheme( )), 22, Gx_line+16, 248, Gx_line+76) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Soc. por quotas-Capital Social 200.000.00 Euros Reg na", ""), 22, Gx_line+83, 364, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "C.R.C. Braga Sob o nº 507975170 Parque Ind. Padim", ""), 22, Gx_line+102, 365, Gx_line+119, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "da Graça Lote 16 4700 - 670 PADIM DA GRAÇA (BRG)", ""), 22, Gx_line+120, 366, Gx_line+137, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tel. 253 300090 / Fax. 253 622428 IVA PT 50797510", ""), 22, Gx_line+138, 346, Gx_line+155, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exmos. Srs.", ""), 442, Gx_line+83, 519, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")), 672, Gx_line+29, 731, Gx_line+46, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9VDoc, "")), 577, Gx_line+29, 661, Gx_line+46, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2249ManNom, "")), 442, Gx_line+109, 631, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2250ManDom, "")), 442, Gx_line+125, 656, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2251ManPob, "")), 442, Gx_line+141, 631, Gx_line+159, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Cpostal, "")), 445, Gx_line+156, 521, Gx_line+174, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 525, Gx_line+156, 682, Gx_line+173, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+188) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12AtId, "")), 22, Gx_line+16, 211, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Texto_fd, "")), 339, Gx_line+42, 715, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14TextoCopia, "")), 22, Gx_line+42, 117, Gx_line+60, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+63) ;
               getPrinter().GxDrawRect(15, Gx_line+16, 774, Gx_line+58, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Nº Contribuinte", ""), 42, Gx_line+29, 151, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Dat do Documento", ""), 285, Gx_line+29, 399, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 624, Gx_line+29, 667, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3302ManNif, "@!")), 49, Gx_line+64, 154, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A2256SalExtFec, "99/99/99"), 322, Gx_line+65, 373, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 600, Gx_line+66, 645, Gx_line+83, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 660, Gx_line+66, 715, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 651, Gx_line+66, 655, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+56, 774, Gx_line+90, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+94) ;
               getPrinter().GxDrawRect(15, Gx_line+0, 774, Gx_line+28, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pçs", ""), 155, Gx_line+6, 178, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 283, Gx_line+6, 308, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 425, Gx_line+6, 484, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Qtd", ""), 708, Gx_line+6, 729, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 606, Gx_line+6, 628, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 204, Gx_line+6, 244, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 29, Gx_line+6, 62, Gx_line+22, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
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
      add_metrics4( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial Narrow", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "pextdocumento");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "pextdocumento");
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
      AV29ImpCod = "" ;
      AV14TextoCopia = "" ;
      AV30ContDsc = "" ;
      AV28FirmaD = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P05X72_A588IvaPor = new byte[1] ;
      P05X72_n588IvaPor = new boolean[] {false} ;
      P05X72_A953IvaCod = new String[] {""} ;
      A953IvaCod = "" ;
      P05X73_A3554SalExtObs = new String[] {""} ;
      P05X73_A840TrnCod = new short[1] ;
      P05X73_n840TrnCod = new boolean[] {false} ;
      P05X73_A781PrvCod = new short[1] ;
      P05X73_n781PrvCod = new boolean[] {false} ;
      P05X73_A2248ManCod = new short[1] ;
      P05X73_A396EmprCod = new String[] {""} ;
      P05X73_A2253SalExtAlb = new int[1] ;
      P05X73_A10743ManCp2 = new String[] {""} ;
      P05X73_n10743ManCp2 = new boolean[] {false} ;
      P05X73_A2252ManCpo = new String[] {""} ;
      P05X73_n2252ManCpo = new boolean[] {false} ;
      P05X73_A10077SalFmd = new String[] {""} ;
      P05X73_A10742SalCodeID = new String[] {""} ;
      P05X73_A6397SalExtMat = new String[] {""} ;
      P05X73_A6396SalExtHor = new String[] {""} ;
      P05X73_A2258SalExtLis = new byte[1] ;
      P05X73_A787PrvDsc = new String[] {""} ;
      P05X73_n787PrvDsc = new boolean[] {false} ;
      P05X73_A2251ManPob = new String[] {""} ;
      P05X73_n2251ManPob = new boolean[] {false} ;
      P05X73_A2250ManDom = new String[] {""} ;
      P05X73_n2250ManDom = new boolean[] {false} ;
      P05X73_A2249ManNom = new String[] {""} ;
      P05X73_n2249ManNom = new boolean[] {false} ;
      P05X73_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05X73_A3302ManNif = new String[] {""} ;
      P05X73_n3302ManNif = new boolean[] {false} ;
      A3554SalExtObs = "" ;
      A10743ManCp2 = "" ;
      A2252ManCpo = "" ;
      A10077SalFmd = "" ;
      A10742SalCodeID = "" ;
      A6397SalExtMat = "" ;
      A6396SalExtHor = "" ;
      A787PrvDsc = "" ;
      A2251ManPob = "" ;
      A2250ManDom = "" ;
      A2249ManNom = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A3302ManNif = "" ;
      AV11Cpostal = "" ;
      AV13Texto_fd = "" ;
      AV27Firma4dig = "" ;
      AV12AtId = "" ;
      AV9VDoc = "" ;
      AV26SalExtObs = "" ;
      AV24AlbMat = "" ;
      AV23AlbHorSal = "" ;
      P05X74_A396EmprCod = new String[] {""} ;
      P05X74_A2253SalExtAlb = new int[1] ;
      P05X74_A6558FasCodn = new String[] {""} ;
      P05X74_A6249SalExObs = new String[] {""} ;
      P05X74_A212BarSer = new String[] {""} ;
      P05X74_A4812BarEncCli = new String[] {""} ;
      P05X74_A1234BarNomCli = new String[] {""} ;
      P05X74_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05X74_A130BarCodPar = new String[] {""} ;
      P05X74_A132BarCodReo = new byte[1] ;
      P05X74_A129BarCod = new int[1] ;
      P05X74_A6248SalExNln = new short[1] ;
      A6558FasCodn = "" ;
      A6249SalExObs = "" ;
      A212BarSer = "" ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV16FasDsc = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV17ObsHdr = "" ;
      AV33Hdr = "" ;
      AV19Totkgs = DecimalUtil.ZERO ;
      AV20FacImp = DecimalUtil.ZERO ;
      AV22valorIva = DecimalUtil.ZERO ;
      AV25FacTot = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pextdocumento__default(),
         new Object[] {
             new Object[] {
            P05X72_A588IvaPor, P05X72_n588IvaPor, P05X72_A953IvaCod
            }
            , new Object[] {
            P05X73_A3554SalExtObs, P05X73_A840TrnCod, P05X73_n840TrnCod, P05X73_A781PrvCod, P05X73_n781PrvCod, P05X73_A2248ManCod, P05X73_A396EmprCod, P05X73_A2253SalExtAlb, P05X73_A10743ManCp2, P05X73_n10743ManCp2,
            P05X73_A2252ManCpo, P05X73_n2252ManCpo, P05X73_A10077SalFmd, P05X73_A10742SalCodeID, P05X73_A6397SalExtMat, P05X73_A6396SalExtHor, P05X73_A2258SalExtLis, P05X73_A787PrvDsc, P05X73_n787PrvDsc, P05X73_A2251ManPob,
            P05X73_n2251ManPob, P05X73_A2250ManDom, P05X73_n2250ManDom, P05X73_A2249ManNom, P05X73_n2249ManNom, P05X73_A2256SalExtFec, P05X73_A3302ManNif, P05X73_n3302ManNif
            }
            , new Object[] {
            P05X74_A396EmprCod, P05X74_A2253SalExtAlb, P05X74_A6558FasCodn, P05X74_A6249SalExObs, P05X74_A212BarSer, P05X74_A4812BarEncCli, P05X74_A1234BarNomCli, P05X74_A6256SalExKgE, P05X74_A130BarCodPar, P05X74_A132BarCodReo,
            P05X74_A129BarCod, P05X74_A6248SalExNln
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV32existefirmad ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A588IvaPor ;
   private byte AV21IvaPor ;
   private byte A2258SalExtLis ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A840TrnCod ;
   private short A781PrvCod ;
   private short A2248ManCod ;
   private short AV31copias ;
   private short A6248SalExNln ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int Gx_OldLine ;
   private int AV18Totpzs ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal AV19Totkgs ;
   private java.math.BigDecimal AV20FacImp ;
   private java.math.BigDecimal AV22valorIva ;
   private java.math.BigDecimal AV25FacTot ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV29ImpCod ;
   private String AV14TextoCopia ;
   private String AV30ContDsc ;
   private String AV28FirmaD ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A953IvaCod ;
   private String A10743ManCp2 ;
   private String A2252ManCpo ;
   private String A10077SalFmd ;
   private String A10742SalCodeID ;
   private String A6397SalExtMat ;
   private String A6396SalExtHor ;
   private String A787PrvDsc ;
   private String A2251ManPob ;
   private String A2250ManDom ;
   private String A2249ManNom ;
   private String A3302ManNif ;
   private String AV11Cpostal ;
   private String AV13Texto_fd ;
   private String AV27Firma4dig ;
   private String AV12AtId ;
   private String AV9VDoc ;
   private String AV24AlbMat ;
   private String AV23AlbHorSal ;
   private String A6558FasCodn ;
   private String A6249SalExObs ;
   private String A212BarSer ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A130BarCodPar ;
   private String AV16FasDsc ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV17ObsHdr ;
   private String AV33Hdr ;
   private java.util.Date A2256SalExtFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n588IvaPor ;
   private boolean GxHdr3 ;
   private boolean n840TrnCod ;
   private boolean n781PrvCod ;
   private boolean n10743ManCp2 ;
   private boolean n2252ManCpo ;
   private boolean n787PrvDsc ;
   private boolean n2251ManPob ;
   private boolean n2250ManDom ;
   private boolean n2249ManNom ;
   private boolean n3302ManNif ;
   private String A3554SalExtObs ;
   private String AV26SalExtObs ;
   private IDataStoreProvider pr_default ;
   private byte[] P05X72_A588IvaPor ;
   private boolean[] P05X72_n588IvaPor ;
   private String[] P05X72_A953IvaCod ;
   private String[] P05X73_A3554SalExtObs ;
   private short[] P05X73_A840TrnCod ;
   private boolean[] P05X73_n840TrnCod ;
   private short[] P05X73_A781PrvCod ;
   private boolean[] P05X73_n781PrvCod ;
   private short[] P05X73_A2248ManCod ;
   private String[] P05X73_A396EmprCod ;
   private int[] P05X73_A2253SalExtAlb ;
   private String[] P05X73_A10743ManCp2 ;
   private boolean[] P05X73_n10743ManCp2 ;
   private String[] P05X73_A2252ManCpo ;
   private boolean[] P05X73_n2252ManCpo ;
   private String[] P05X73_A10077SalFmd ;
   private String[] P05X73_A10742SalCodeID ;
   private String[] P05X73_A6397SalExtMat ;
   private String[] P05X73_A6396SalExtHor ;
   private byte[] P05X73_A2258SalExtLis ;
   private String[] P05X73_A787PrvDsc ;
   private boolean[] P05X73_n787PrvDsc ;
   private String[] P05X73_A2251ManPob ;
   private boolean[] P05X73_n2251ManPob ;
   private String[] P05X73_A2250ManDom ;
   private boolean[] P05X73_n2250ManDom ;
   private String[] P05X73_A2249ManNom ;
   private boolean[] P05X73_n2249ManNom ;
   private java.util.Date[] P05X73_A2256SalExtFec ;
   private String[] P05X73_A3302ManNif ;
   private boolean[] P05X73_n3302ManNif ;
   private String[] P05X74_A396EmprCod ;
   private int[] P05X74_A2253SalExtAlb ;
   private String[] P05X74_A6558FasCodn ;
   private String[] P05X74_A6249SalExObs ;
   private String[] P05X74_A212BarSer ;
   private String[] P05X74_A4812BarEncCli ;
   private String[] P05X74_A1234BarNomCli ;
   private java.math.BigDecimal[] P05X74_A6256SalExKgE ;
   private String[] P05X74_A130BarCodPar ;
   private byte[] P05X74_A132BarCodReo ;
   private int[] P05X74_A129BarCod ;
   private short[] P05X74_A6248SalExNln ;
}

final  class pextdocumento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05X72", "SELECT IvaPor, IvaCod FROM TXPTIPIVA ORDER BY IvaCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05X73", "SELECT T1.SalExtObs, T1.TrnCod, T2.PrvCod, T1.ManCod, T1.EmprCod, T1.SalExtAlb, T4.ManCp2, T4.ManCpo, T1.SalFmd, T1.SalCodeID, T1.SalExtMat, T1.SalExtHor, T1.SalExtLis, T3.PrvDsc, T4.ManPob, T4.ManDom, T4.ManNom, T1.SalExtFec, T4.ManNif FROM (((TXPCEXTSA T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) LEFT JOIN TXPPROVIN T3 ON T3.PrvCod = T2.PrvCod) INNER JOIN TXPMANUFA T4 ON T4.EmprCod = T1.EmprCod AND T4.ManCod = T1.ManCod) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05X74", "SELECT T1.EmprCod, T1.SalExtAlb, T1.FasCodn, T1.SalExObs, T2.BarSer, T2.BarEncCli, T2.BarNomCli, T1.SalExKgE, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05X75", "UPDATE TXPCEXTSA SET SalExtLis=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 200);
               ((String[]) buf[13])[0] = rslt.getString(10, 20);
               ((String[]) buf[14])[0] = rslt.getString(11, 20);
               ((String[]) buf[15])[0] = rslt.getString(12, 8);
               ((byte[]) buf[16])[0] = rslt.getByte(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 34);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(18);
               ((String[]) buf[26])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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
      }
   }

}

