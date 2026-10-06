package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rprdt10_impl extends GXWebReport
{
   public rprdt10_impl( com.genexus.internet.HttpContext context )
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
            AV72PMaqCod = httpContext.GetPar( "PMaqCod") ;
            AV81UMaqCod = httpContext.GetPar( "UMaqCod") ;
            AV33hISPRODTI = localUtil.parseDTimeParm( httpContext.GetPar( "hISPRODTI")) ;
            AV32hISPRODTF = localUtil.parseDTimeParm( httpContext.GetPar( "hISPRODTF")) ;
            AV76TipMaqCod = httpContext.GetPar( "TipMaqCod") ;
            AV9Artcodi = httpContext.GetPar( "Artcodi") ;
            AV8Artcodf = httpContext.GetPar( "Artcodf") ;
            AV17Barcolnomi = httpContext.GetPar( "Barcolnomi") ;
            AV16Barcolnomf = httpContext.GetPar( "Barcolnomf") ;
            AV19Barcolnumi = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumi"))) ;
            AV18Barcolnumf = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumf"))) ;
            AV21Diahorafin = (byte)(GXutil.lval( httpContext.GetPar( "Diahorafin"))) ;
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
      M_bot = 1 ;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV46Lit01 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT561_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit01 = GXt_char1 ;
         GXt_char1 = AV47Lit02 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2469_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit02 = GXt_char1 ;
         AV45Lit0 = AV46Lit01 + "/" + AV47Lit02 ;
         GXt_char1 = AV48Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit1 = GXt_char1 ;
         GXt_char1 = AV58Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit2 = GXt_char1 ;
         GXt_char1 = AV59Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV59Lit3 = GXt_char1 ;
         GXt_char1 = AV60Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2097_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV60Lit4 = GXt_char1 ;
         GXt_char1 = AV61Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2187_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV61Lit5 = GXt_char1 ;
         GXt_char1 = AV62Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2186_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV62Lit6 = GXt_char1 ;
         GXt_char1 = AV63Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV63Lit7 = GXt_char1 ;
         GXt_char1 = AV64Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV64Lit8 = GXt_char1 ;
         GXt_char1 = AV65Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV65Lit9 = GXt_char1 ;
         GXt_char1 = AV49Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit10 = GXt_char1 ;
         GXt_char1 = AV50Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2465_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit11 = GXt_char1 ;
         GXt_char1 = AV51Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit12 = GXt_char1 ;
         GXt_char1 = AV52Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2465_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit13 = GXt_char1 ;
         GXt_char1 = AV53Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2469_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit14 = GXt_char1 ;
         GXt_char1 = AV54Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT516_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit15 = GXt_char1 ;
         GXt_char1 = AV55Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2465_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit16 = GXt_char1 ;
         GXt_char1 = AV56Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT399_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit17 = GXt_char1 ;
         GXt_char1 = AV57Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char2) ;
         rprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit18 = GXt_char1 ;
         GXv_int3[0] = AV27FlagTiReal ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int3) ;
         rprdt10_impl.this.AV27FlagTiReal = GXv_int3[0] ;
         GXt_int4 = AV42ideas ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IDEAS", ""), GXv_int3) ;
         rprdt10_impl.this.GXt_int4 = GXv_int3[0] ;
         AV42ideas = GXt_int4 ;
         /* Using cursor P07FK2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07FK2_A407EmprNom[0] ;
            n407EmprNom = P07FK2_n407EmprNom[0] ;
            AV22EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV21Diahorafin == 0 )
         {
            /* Execute user subroutine: 'CASO1' */
            S111 ();
            if ( returnInSub )
            {
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            /* Execute user subroutine: 'CASO2' */
            S131 ();
            if ( returnInSub )
            {
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7FK0( true, 0) ;
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
      /* 'CASO1' Routine */
      returnInSub = false ;
      /* Using cursor P07FK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV72PMaqCod, AV33hISPRODTI, AV32hISPRODTF, AV33hISPRODTI, AV32hISPRODTF, AV9Artcodi, AV8Artcodf, AV17Barcolnomi, AV16Barcolnomf, Integer.valueOf(AV19Barcolnumi), Integer.valueOf(AV18Barcolnumf), AV76TipMaqCod, AV76TipMaqCod, AV81UMaqCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk7FK4 = false ;
         A1011TipMaqCod = P07FK3_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P07FK3_n1011TipMaqCod[0] ;
         A136BarColNum = P07FK3_A136BarColNum[0] ;
         A135BarColNom = P07FK3_A135BarColNom[0] ;
         A212BarSer = P07FK3_A212BarSer[0] ;
         A602MaqCod = P07FK3_A602MaqCod[0] ;
         A556HisProEst = P07FK3_A556HisProEst[0] ;
         A129BarCod = P07FK3_A129BarCod[0] ;
         A132BarCodReo = P07FK3_A132BarCodReo[0] ;
         A130BarCodPar = P07FK3_A130BarCodPar[0] ;
         A461Fase = P07FK3_A461Fase[0] ;
         A1525HisProKgr = P07FK3_A1525HisProKgr[0] ;
         A867ParCodNom = P07FK3_A867ParCodNom[0] ;
         n867ParCodNom = P07FK3_n867ParCodNom[0] ;
         A656ParCod = P07FK3_A656ParCod[0] ;
         n656ParCod = P07FK3_n656ParCod[0] ;
         A503GruOpeCod = P07FK3_A503GruOpeCod[0] ;
         A3610HisProLot = P07FK3_A3610HisProLot[0] ;
         A606MaqDsc = P07FK3_A606MaqDsc[0] ;
         n606MaqDsc = P07FK3_n606MaqDsc[0] ;
         A4440HisProDTI = P07FK3_A4440HisProDTI[0] ;
         n4440HisProDTI = P07FK3_n4440HisProDTI[0] ;
         A4441HisProDTF = P07FK3_A4441HisProDTF[0] ;
         n4441HisProDTF = P07FK3_n4441HisProDTF[0] ;
         A563HisProMin = P07FK3_A563HisProMin[0] ;
         A560HisProHin = P07FK3_A560HisProHin[0] ;
         A562HisProMfi = P07FK3_A562HisProMfi[0] ;
         A559HisProHfi = P07FK3_A559HisProHfi[0] ;
         A558HisProFec = P07FK3_A558HisProFec[0] ;
         A561HisProLin = P07FK3_A561HisProLin[0] ;
         A1011TipMaqCod = P07FK3_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P07FK3_n1011TipMaqCod[0] ;
         A606MaqDsc = P07FK3_A606MaqDsc[0] ;
         n606MaqDsc = P07FK3_n606MaqDsc[0] ;
         A136BarColNum = P07FK3_A136BarColNum[0] ;
         A135BarColNom = P07FK3_A135BarColNom[0] ;
         A212BarSer = P07FK3_A212BarSer[0] ;
         A867ParCodNom = P07FK3_A867ParCodNom[0] ;
         n867ParCodNom = P07FK3_n867ParCodNom[0] ;
         if ( A560HisProHin <= A559HisProHfi )
         {
            A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         else
         {
            A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         h7FK0( false, 33) ;
         getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 88, Gx_line+10, 133, Gx_line+28, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 158, Gx_line+10, 276, Gx_line+28, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+33) ;
         AV77TotKgs = DecimalUtil.doubleToDec(0) ;
         AV78TotMinT = 0 ;
         AV69NTin = 0 ;
         AV34HisProLot = "" ;
         AV31Gruopecod = 0 ;
         AV79TotMinTp = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P07FK3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P07FK3_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk7FK4 = false ;
            A1011TipMaqCod = P07FK3_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07FK3_n1011TipMaqCod[0] ;
            A136BarColNum = P07FK3_A136BarColNum[0] ;
            A135BarColNom = P07FK3_A135BarColNom[0] ;
            A212BarSer = P07FK3_A212BarSer[0] ;
            A556HisProEst = P07FK3_A556HisProEst[0] ;
            A129BarCod = P07FK3_A129BarCod[0] ;
            A132BarCodReo = P07FK3_A132BarCodReo[0] ;
            A130BarCodPar = P07FK3_A130BarCodPar[0] ;
            A461Fase = P07FK3_A461Fase[0] ;
            A1525HisProKgr = P07FK3_A1525HisProKgr[0] ;
            A867ParCodNom = P07FK3_A867ParCodNom[0] ;
            n867ParCodNom = P07FK3_n867ParCodNom[0] ;
            A656ParCod = P07FK3_A656ParCod[0] ;
            n656ParCod = P07FK3_n656ParCod[0] ;
            A503GruOpeCod = P07FK3_A503GruOpeCod[0] ;
            A3610HisProLot = P07FK3_A3610HisProLot[0] ;
            A4440HisProDTI = P07FK3_A4440HisProDTI[0] ;
            n4440HisProDTI = P07FK3_n4440HisProDTI[0] ;
            A4441HisProDTF = P07FK3_A4441HisProDTF[0] ;
            n4441HisProDTF = P07FK3_n4441HisProDTF[0] ;
            A563HisProMin = P07FK3_A563HisProMin[0] ;
            A560HisProHin = P07FK3_A560HisProHin[0] ;
            A562HisProMfi = P07FK3_A562HisProMfi[0] ;
            A559HisProHfi = P07FK3_A559HisProHfi[0] ;
            A558HisProFec = P07FK3_A558HisProFec[0] ;
            A561HisProLin = P07FK3_A561HisProLin[0] ;
            A1011TipMaqCod = P07FK3_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07FK3_n1011TipMaqCod[0] ;
            A136BarColNum = P07FK3_A136BarColNum[0] ;
            A135BarColNom = P07FK3_A135BarColNom[0] ;
            A212BarSer = P07FK3_A212BarSer[0] ;
            A867ParCodNom = P07FK3_A867ParCodNom[0] ;
            n867ParCodNom = P07FK3_n867ParCodNom[0] ;
            if ( ( GXutil.strcmp(A602MaqCod, AV72PMaqCod) >= 0 ) && ( GXutil.strcmp(A602MaqCod, AV81UMaqCod) <= 0 ) )
            {
               if ( ( GXutil.strcmp(A212BarSer, AV9Artcodi) >= 0 ) && ( GXutil.strcmp(A212BarSer, AV8Artcodf) <= 0 ) )
               {
                  if ( ( GXutil.strcmp(A135BarColNom, AV17Barcolnomi) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV16Barcolnomf) <= 0 ) )
                  {
                     if ( ( A136BarColNum >= AV19Barcolnumi ) && ( A136BarColNum <= AV18Barcolnumf ) )
                     {
                        if ( ( GXutil.strcmp(A1011TipMaqCod, AV76TipMaqCod) == 0 ) || (GXutil.strcmp("", AV76TipMaqCod)==0) )
                        {
                           if ( (( A4440HisProDTI.after( AV33hISPRODTI ) ) || ( GXutil.dateCompare(A4440HisProDTI, AV33hISPRODTI) )) && (( A4441HisProDTF.before( AV32hISPRODTF ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV32hISPRODTF) )) )
                           {
                              if ( (( A4441HisProDTF.after( AV33hISPRODTI ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV33hISPRODTI) )) )
                              {
                                 if ( (( A4440HisProDTI.before( AV32hISPRODTF ) ) || ( GXutil.dateCompare(A4440HisProDTI, AV32hISPRODTF) )) )
                                 {
                                    if ( A560HisProHin <= A559HisProHfi )
                                    {
                                       A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                                    }
                                    else
                                    {
                                       A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                                    }
                                    if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                    {
                                       A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                                    }
                                    else
                                    {
                                       A5605HisProTr2 = (short)(0) ;
                                    }
                                    AV35HisProTre = (short)(0) ;
                                    if ( A556HisProEst != 0 )
                                    {
                                       if ( AV27FlagTiReal == 0 )
                                       {
                                          AV35HisProTre = A564HisProTre ;
                                       }
                                       else
                                       {
                                          AV35HisProTre = A5605HisProTr2 ;
                                       }
                                    }
                                    AV10BarCod = A129BarCod ;
                                    AV14BarCodReo = A132BarCodReo ;
                                    AV12BarCodPar = A130BarCodPar ;
                                    AV26FlagMarca = (byte)(0) ;
                                    GXv_char2[0] = A396EmprCod ;
                                    GXv_char5[0] = A461Fase ;
                                    GXv_char6[0] = AV23FasActTin ;
                                    new app.pfasest(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_char6) ;
                                    rprdt10_impl.this.A396EmprCod = GXv_char2[0] ;
                                    rprdt10_impl.this.A461Fase = GXv_char5[0] ;
                                    rprdt10_impl.this.AV23FasActTin = GXv_char6[0] ;
                                    /* Execute user subroutine: 'LEOHDR' */
                                    S125 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(1);
                                       pr_default.close(1);
                                       pr_default.close(1);
                                       pr_default.close(1);
                                       getPrinter().GxEndPage() ;
                                       /* Close printer file */
                                       getPrinter().GxEndDocument() ;
                                       endPrinter();
                                       returnInSub = true;
                                       if (true) return;
                                    }
                                    if ( ( GXutil.strcmp(AV23FasActTin, httpContext.getMessage( "N", "")) == 0 ) && (0==A656ParCod) )
                                    {
                                       AV26FlagMarca = (byte)(1) ;
                                    }
                                    AV40HorRea = (short)(GXutil.Int( AV35HisProTre/ (double) (60))) ;
                                    AV41HorReaint = (short)(GXutil.Int( AV40HorRea)) ;
                                    AV67MinRea = (byte)(AV35HisProTre-(AV41HorReaint*60)) ;
                                    AV68MinRea2 = DecimalUtil.doubleToDec(AV67MinRea/ (double) (100)) ;
                                    AV37HmP = DecimalUtil.doubleToDec(AV41HorReaint).add(AV68MinRea2) ;
                                    AV40HorRea = (short)(GXutil.Int( AV73TiempoF/ (double) (60))) ;
                                    AV41HorReaint = (short)(GXutil.Int( AV40HorRea)) ;
                                    AV67MinRea = (byte)(AV73TiempoF-(AV41HorReaint*60)) ;
                                    AV68MinRea2 = DecimalUtil.doubleToDec(AV67MinRea/ (double) (100)) ;
                                    AV36HmF = DecimalUtil.doubleToDec(AV41HorReaint).add(AV68MinRea2) ;
                                    AV77TotKgs = AV77TotKgs.add(A1525HisProKgr) ;
                                    if ( GXutil.strcmp(AV34HisProLot, A3610HisProLot) != 0 )
                                    {
                                       AV69NTin = (int)(AV69NTin+1) ;
                                       AV78TotMinT = (int)(AV78TotMinT+AV35HisProTre) ;
                                       AV79TotMinTp = (int)(AV79TotMinTp+AV35HisProTre) ;
                                    }
                                    if ( ( GXutil.strcmp(AV34HisProLot, A3610HisProLot) == 0 ) && ( AV31Gruopecod != A503GruOpeCod ) )
                                    {
                                       AV78TotMinT = (int)(AV78TotMinT+AV35HisProTre) ;
                                       AV79TotMinTp = (int)(AV79TotMinTp+AV35HisProTre) ;
                                    }
                                    if ( (0==A656ParCod) )
                                    {
                                       h7FK0( false, 16) ;
                                       getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 13, Gx_line+0, 72, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 91, Gx_line+0, 99, Gx_line+16, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 78, Gx_line+0, 86, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35HisProTre), "ZZZ9")), 585, Gx_line+0, 615, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28ForColNom, "")), 234, Gx_line+0, 330, Gx_line+16, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29ForColNum), "ZZZZZ9")), 336, Gx_line+0, 381, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30ForSer, "")), 110, Gx_line+0, 228, Gx_line+16, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV75TipColCod), "Z9")), 386, Gx_line+0, 402, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73TiempoF), "ZZZ9")), 689, Gx_line+0, 719, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")), 506, Gx_line+0, 573, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37HmP, "ZZZ9.99")), 622, Gx_line+0, 674, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36HmF, "ZZZ9.99")), 727, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3610HisProLot, "")), 909, Gx_line+0, 983, Gx_line+16, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9")), 860, Gx_line+0, 905, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44IntDsc, "")), 408, Gx_line+0, 482, Gx_line+16, 0+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+16) ;
                                    }
                                    else
                                    {
                                       h7FK0( false, 17) ;
                                       getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35HisProTre), "ZZZ9")), 586, Gx_line+0, 616, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73TiempoF), "ZZZ9")), 690, Gx_line+0, 720, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37HmP, "ZZZ9.99")), 623, Gx_line+0, 675, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36HmF, "ZZZ9.99")), 728, Gx_line+0, 780, Gx_line+16, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A867ParCodNom, "")), 791, Gx_line+0, 1011, Gx_line+16, 0+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+17) ;
                                    }
                                    AV34HisProLot = A3610HisProLot ;
                                    AV31Gruopecod = A503GruOpeCod ;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            brk7FK4 = true ;
            pr_default.readNext(1);
         }
         AV40HorRea = (short)(GXutil.Int( AV78TotMinT/ (double) (60))) ;
         AV41HorReaint = (short)(GXutil.Int( AV40HorRea)) ;
         AV67MinRea = (byte)(AV78TotMinT-(AV41HorReaint*60)) ;
         AV68MinRea2 = DecimalUtil.doubleToDec(AV67MinRea/ (double) (100)) ;
         AV37HmP = DecimalUtil.doubleToDec(AV41HorReaint).add(AV68MinRea2) ;
         AV74TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV69NTin) )
         {
            AV74TiempoNP = AV37HmP.divide(DecimalUtil.doubleToDec(AV69NTin), 18, java.math.RoundingMode.DOWN) ;
         }
         h7FK0( false, 76) ;
         getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77TotKgs, "ZZZZZ9.99")), 497, Gx_line+6, 564, Gx_line+22, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV78TotMinT), "ZZZZZ9")), 572, Gx_line+6, 617, Gx_line+22, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37HmP, "ZZZ9.99")), 623, Gx_line+6, 675, Gx_line+22, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(483, Gx_line+1, 841, Gx_line+74, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV69NTin), "ZZZZZ9")), 584, Gx_line+32, 629, Gx_line+48, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV74TiempoNP, "ZZZ9.99")), 648, Gx_line+51, 700, Gx_line+68, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit15, "")), 497, Gx_line+32, 571, Gx_line+48, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit16, "")), 497, Gx_line+51, 542, Gx_line+67, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit17, "")), 544, Gx_line+51, 581, Gx_line+67, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit18, "")), 584, Gx_line+51, 636, Gx_line+67, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+76) ;
         if ( ! brk7FK4 )
         {
            brk7FK4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'CASO2' Routine */
      returnInSub = false ;
      /* Using cursor P07FK4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV72PMaqCod, AV33hISPRODTI, AV32hISPRODTF, AV9Artcodi, AV8Artcodf, AV17Barcolnomi, AV16Barcolnomf, Integer.valueOf(AV19Barcolnumi), Integer.valueOf(AV18Barcolnumf), AV76TipMaqCod, AV76TipMaqCod, AV81UMaqCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk7FK6 = false ;
         A1011TipMaqCod = P07FK4_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P07FK4_n1011TipMaqCod[0] ;
         A136BarColNum = P07FK4_A136BarColNum[0] ;
         A135BarColNom = P07FK4_A135BarColNom[0] ;
         A212BarSer = P07FK4_A212BarSer[0] ;
         A602MaqCod = P07FK4_A602MaqCod[0] ;
         A556HisProEst = P07FK4_A556HisProEst[0] ;
         A129BarCod = P07FK4_A129BarCod[0] ;
         A132BarCodReo = P07FK4_A132BarCodReo[0] ;
         A130BarCodPar = P07FK4_A130BarCodPar[0] ;
         A461Fase = P07FK4_A461Fase[0] ;
         A1525HisProKgr = P07FK4_A1525HisProKgr[0] ;
         A867ParCodNom = P07FK4_A867ParCodNom[0] ;
         n867ParCodNom = P07FK4_n867ParCodNom[0] ;
         A656ParCod = P07FK4_A656ParCod[0] ;
         n656ParCod = P07FK4_n656ParCod[0] ;
         A503GruOpeCod = P07FK4_A503GruOpeCod[0] ;
         A3610HisProLot = P07FK4_A3610HisProLot[0] ;
         A606MaqDsc = P07FK4_A606MaqDsc[0] ;
         n606MaqDsc = P07FK4_n606MaqDsc[0] ;
         A4440HisProDTI = P07FK4_A4440HisProDTI[0] ;
         n4440HisProDTI = P07FK4_n4440HisProDTI[0] ;
         A4441HisProDTF = P07FK4_A4441HisProDTF[0] ;
         n4441HisProDTF = P07FK4_n4441HisProDTF[0] ;
         A563HisProMin = P07FK4_A563HisProMin[0] ;
         A560HisProHin = P07FK4_A560HisProHin[0] ;
         A562HisProMfi = P07FK4_A562HisProMfi[0] ;
         A559HisProHfi = P07FK4_A559HisProHfi[0] ;
         A558HisProFec = P07FK4_A558HisProFec[0] ;
         A561HisProLin = P07FK4_A561HisProLin[0] ;
         A1011TipMaqCod = P07FK4_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P07FK4_n1011TipMaqCod[0] ;
         A606MaqDsc = P07FK4_A606MaqDsc[0] ;
         n606MaqDsc = P07FK4_n606MaqDsc[0] ;
         A136BarColNum = P07FK4_A136BarColNum[0] ;
         A135BarColNom = P07FK4_A135BarColNom[0] ;
         A212BarSer = P07FK4_A212BarSer[0] ;
         A867ParCodNom = P07FK4_A867ParCodNom[0] ;
         n867ParCodNom = P07FK4_n867ParCodNom[0] ;
         if ( A560HisProHin <= A559HisProHfi )
         {
            A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         else
         {
            A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         h7FK0( false, 33) ;
         getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 88, Gx_line+10, 133, Gx_line+28, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 158, Gx_line+10, 276, Gx_line+28, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+33) ;
         AV77TotKgs = DecimalUtil.doubleToDec(0) ;
         AV78TotMinT = 0 ;
         AV69NTin = 0 ;
         AV34HisProLot = "" ;
         AV31Gruopecod = 0 ;
         AV79TotMinTp = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P07FK4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P07FK4_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk7FK6 = false ;
            A1011TipMaqCod = P07FK4_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07FK4_n1011TipMaqCod[0] ;
            A136BarColNum = P07FK4_A136BarColNum[0] ;
            A135BarColNom = P07FK4_A135BarColNom[0] ;
            A212BarSer = P07FK4_A212BarSer[0] ;
            A556HisProEst = P07FK4_A556HisProEst[0] ;
            A129BarCod = P07FK4_A129BarCod[0] ;
            A132BarCodReo = P07FK4_A132BarCodReo[0] ;
            A130BarCodPar = P07FK4_A130BarCodPar[0] ;
            A461Fase = P07FK4_A461Fase[0] ;
            A1525HisProKgr = P07FK4_A1525HisProKgr[0] ;
            A867ParCodNom = P07FK4_A867ParCodNom[0] ;
            n867ParCodNom = P07FK4_n867ParCodNom[0] ;
            A656ParCod = P07FK4_A656ParCod[0] ;
            n656ParCod = P07FK4_n656ParCod[0] ;
            A503GruOpeCod = P07FK4_A503GruOpeCod[0] ;
            A3610HisProLot = P07FK4_A3610HisProLot[0] ;
            A4440HisProDTI = P07FK4_A4440HisProDTI[0] ;
            n4440HisProDTI = P07FK4_n4440HisProDTI[0] ;
            A4441HisProDTF = P07FK4_A4441HisProDTF[0] ;
            n4441HisProDTF = P07FK4_n4441HisProDTF[0] ;
            A563HisProMin = P07FK4_A563HisProMin[0] ;
            A560HisProHin = P07FK4_A560HisProHin[0] ;
            A562HisProMfi = P07FK4_A562HisProMfi[0] ;
            A559HisProHfi = P07FK4_A559HisProHfi[0] ;
            A558HisProFec = P07FK4_A558HisProFec[0] ;
            A561HisProLin = P07FK4_A561HisProLin[0] ;
            A1011TipMaqCod = P07FK4_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P07FK4_n1011TipMaqCod[0] ;
            A136BarColNum = P07FK4_A136BarColNum[0] ;
            A135BarColNom = P07FK4_A135BarColNom[0] ;
            A212BarSer = P07FK4_A212BarSer[0] ;
            A867ParCodNom = P07FK4_A867ParCodNom[0] ;
            n867ParCodNom = P07FK4_n867ParCodNom[0] ;
            if ( ( GXutil.strcmp(A602MaqCod, AV72PMaqCod) >= 0 ) && ( GXutil.strcmp(A602MaqCod, AV81UMaqCod) <= 0 ) )
            {
               if ( ( GXutil.strcmp(A212BarSer, AV9Artcodi) >= 0 ) && ( GXutil.strcmp(A212BarSer, AV8Artcodf) <= 0 ) )
               {
                  if ( ( GXutil.strcmp(A135BarColNom, AV17Barcolnomi) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV16Barcolnomf) <= 0 ) )
                  {
                     if ( ( A136BarColNum >= AV19Barcolnumi ) && ( A136BarColNum <= AV18Barcolnumf ) )
                     {
                        if ( ( GXutil.strcmp(A1011TipMaqCod, AV76TipMaqCod) == 0 ) || (GXutil.strcmp("", AV76TipMaqCod)==0) )
                        {
                           if ( (( A4441HisProDTF.after( AV33hISPRODTI ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV33hISPRODTI) )) )
                           {
                              if ( (( A4441HisProDTF.before( AV32hISPRODTF ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV32hISPRODTF) )) )
                              {
                                 if ( A560HisProHin <= A559HisProHfi )
                                 {
                                    A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                                 }
                                 else
                                 {
                                    A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
                                 }
                                 if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                 {
                                    A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                                 }
                                 else
                                 {
                                    A5605HisProTr2 = (short)(0) ;
                                 }
                                 AV35HisProTre = (short)(0) ;
                                 if ( A556HisProEst != 0 )
                                 {
                                    if ( AV27FlagTiReal == 0 )
                                    {
                                       AV35HisProTre = A564HisProTre ;
                                    }
                                    else
                                    {
                                       AV35HisProTre = A5605HisProTr2 ;
                                    }
                                 }
                                 AV10BarCod = A129BarCod ;
                                 AV14BarCodReo = A132BarCodReo ;
                                 AV12BarCodPar = A130BarCodPar ;
                                 AV26FlagMarca = (byte)(0) ;
                                 GXv_char6[0] = A396EmprCod ;
                                 GXv_char5[0] = A461Fase ;
                                 GXv_char2[0] = AV23FasActTin ;
                                 new app.pfasest(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char2) ;
                                 rprdt10_impl.this.A396EmprCod = GXv_char6[0] ;
                                 rprdt10_impl.this.A461Fase = GXv_char5[0] ;
                                 rprdt10_impl.this.AV23FasActTin = GXv_char2[0] ;
                                 /* Execute user subroutine: 'LEOHDR' */
                                 S125 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(2);
                                    pr_default.close(2);
                                    pr_default.close(2);
                                    pr_default.close(2);
                                    getPrinter().GxEndPage() ;
                                    /* Close printer file */
                                    getPrinter().GxEndDocument() ;
                                    endPrinter();
                                    returnInSub = true;
                                    if (true) return;
                                 }
                                 if ( ( GXutil.strcmp(AV23FasActTin, httpContext.getMessage( "N", "")) == 0 ) && (0==A656ParCod) )
                                 {
                                    AV26FlagMarca = (byte)(1) ;
                                 }
                                 AV40HorRea = (short)(GXutil.Int( AV35HisProTre/ (double) (60))) ;
                                 AV41HorReaint = (short)(GXutil.Int( AV40HorRea)) ;
                                 AV67MinRea = (byte)(AV35HisProTre-(AV41HorReaint*60)) ;
                                 AV68MinRea2 = DecimalUtil.doubleToDec(AV67MinRea/ (double) (100)) ;
                                 AV37HmP = DecimalUtil.doubleToDec(AV41HorReaint).add(AV68MinRea2) ;
                                 AV40HorRea = (short)(GXutil.Int( AV73TiempoF/ (double) (60))) ;
                                 AV41HorReaint = (short)(GXutil.Int( AV40HorRea)) ;
                                 AV67MinRea = (byte)(AV73TiempoF-(AV41HorReaint*60)) ;
                                 AV68MinRea2 = DecimalUtil.doubleToDec(AV67MinRea/ (double) (100)) ;
                                 AV36HmF = DecimalUtil.doubleToDec(AV41HorReaint).add(AV68MinRea2) ;
                                 AV77TotKgs = AV77TotKgs.add(A1525HisProKgr) ;
                                 if ( GXutil.strcmp(AV34HisProLot, A3610HisProLot) != 0 )
                                 {
                                    AV69NTin = (int)(AV69NTin+1) ;
                                    AV78TotMinT = (int)(AV78TotMinT+AV35HisProTre) ;
                                    AV79TotMinTp = (int)(AV79TotMinTp+AV35HisProTre) ;
                                 }
                                 if ( ( GXutil.strcmp(AV34HisProLot, A3610HisProLot) == 0 ) && ( AV31Gruopecod != A503GruOpeCod ) )
                                 {
                                    AV78TotMinT = (int)(AV78TotMinT+AV35HisProTre) ;
                                    AV79TotMinTp = (int)(AV79TotMinTp+AV35HisProTre) ;
                                 }
                                 if ( (0==A656ParCod) )
                                 {
                                    h7FK0( false, 16) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 13, Gx_line+0, 72, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 91, Gx_line+0, 99, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 78, Gx_line+0, 86, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35HisProTre), "ZZZ9")), 585, Gx_line+0, 615, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28ForColNom, "")), 234, Gx_line+0, 330, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29ForColNum), "ZZZZZ9")), 336, Gx_line+0, 381, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30ForSer, "")), 110, Gx_line+0, 228, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV75TipColCod), "Z9")), 386, Gx_line+0, 402, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73TiempoF), "ZZZ9")), 689, Gx_line+0, 719, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")), 506, Gx_line+0, 573, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37HmP, "ZZZ9.99")), 622, Gx_line+0, 674, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36HmF, "ZZZ9.99")), 727, Gx_line+0, 779, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3610HisProLot, "")), 909, Gx_line+0, 983, Gx_line+16, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9")), 860, Gx_line+0, 905, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44IntDsc, "")), 408, Gx_line+0, 482, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+16) ;
                                 }
                                 else
                                 {
                                    h7FK0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35HisProTre), "ZZZ9")), 586, Gx_line+0, 616, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV73TiempoF), "ZZZ9")), 690, Gx_line+0, 720, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37HmP, "ZZZ9.99")), 623, Gx_line+0, 675, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36HmF, "ZZZ9.99")), 728, Gx_line+0, 780, Gx_line+16, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A867ParCodNom, "")), 791, Gx_line+0, 1011, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                                 AV34HisProLot = A3610HisProLot ;
                                 AV31Gruopecod = A503GruOpeCod ;
                              }
                           }
                        }
                     }
                  }
               }
            }
            brk7FK6 = true ;
            pr_default.readNext(2);
         }
         AV40HorRea = (short)(GXutil.Int( AV78TotMinT/ (double) (60))) ;
         AV41HorReaint = (short)(GXutil.Int( AV40HorRea)) ;
         AV67MinRea = (byte)(AV78TotMinT-(AV41HorReaint*60)) ;
         AV68MinRea2 = DecimalUtil.doubleToDec(AV67MinRea/ (double) (100)) ;
         AV37HmP = DecimalUtil.doubleToDec(AV41HorReaint).add(AV68MinRea2) ;
         AV74TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV69NTin) )
         {
            AV74TiempoNP = AV37HmP.divide(DecimalUtil.doubleToDec(AV69NTin), 18, java.math.RoundingMode.DOWN) ;
         }
         h7FK0( false, 76) ;
         getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV77TotKgs, "ZZZZZ9.99")), 497, Gx_line+6, 564, Gx_line+22, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV78TotMinT), "ZZZZZ9")), 572, Gx_line+6, 617, Gx_line+22, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37HmP, "ZZZ9.99")), 623, Gx_line+6, 675, Gx_line+22, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(483, Gx_line+1, 841, Gx_line+74, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV69NTin), "ZZZZZ9")), 584, Gx_line+32, 629, Gx_line+48, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV74TiempoNP, "ZZZ9.99")), 648, Gx_line+51, 700, Gx_line+68, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit15, "")), 497, Gx_line+32, 571, Gx_line+48, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit16, "")), 497, Gx_line+51, 542, Gx_line+67, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit17, "")), 544, Gx_line+51, 581, Gx_line+67, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit18, "")), 584, Gx_line+51, 636, Gx_line+67, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+76) ;
         if ( ! brk7FK6 )
         {
            brk7FK6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S125( ) throws ProcessInterruptedException
   {
      /* 'LEOHDR' Routine */
      returnInSub = false ;
      AV20CliCod = 999999 ;
      AV30ForSer = "XXXXXXXXXXXXXXXX" ;
      AV28ForColNom = "XXXXXXXXXXXXX" ;
      AV29ForColNum = 999999 ;
      AV75TipColCod = (byte)(99) ;
      AV24FlagBarcad = (byte)(0) ;
      AV25FlagBH = "X" ;
      /* Using cursor P07FK5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV14BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P07FK5_A130BarCodPar[0] ;
         A132BarCodReo = P07FK5_A132BarCodReo[0] ;
         A129BarCod = P07FK5_A129BarCod[0] ;
         A252CliCod = P07FK5_A252CliCod[0] ;
         n252CliCod = P07FK5_n252CliCod[0] ;
         A212BarSer = P07FK5_A212BarSer[0] ;
         A135BarColNom = P07FK5_A135BarColNom[0] ;
         A136BarColNum = P07FK5_A136BarColNum[0] ;
         A218BarTipCol = P07FK5_A218BarTipCol[0] ;
         AV24FlagBarcad = (byte)(1) ;
         AV25FlagBH = httpContext.getMessage( "B", "") ;
         AV20CliCod = A252CliCod ;
         AV30ForSer = A212BarSer ;
         AV28ForColNom = A135BarColNom ;
         AV29ForColNum = A136BarColNum ;
         AV75TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'LEOFORMU' */
         S148 ();
         if ( returnInSub )
         {
            pr_default.close(3);
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
      pr_default.close(3);
      if ( AV24FlagBarcad == 0 )
      {
         /* Using cursor P07FK6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV14BarCodReo), AV12BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A507HbaBarPar = P07FK6_A507HbaBarPar[0] ;
            A508HbaBarReo = P07FK6_A508HbaBarReo[0] ;
            A506HbaBarCod = P07FK6_A506HbaBarCod[0] ;
            A252CliCod = P07FK6_A252CliCod[0] ;
            n252CliCod = P07FK6_n252CliCod[0] ;
            A535HbaSer = P07FK6_A535HbaSer[0] ;
            n535HbaSer = P07FK6_n535HbaSer[0] ;
            A509HbaColNom = P07FK6_A509HbaColNom[0] ;
            n509HbaColNom = P07FK6_n509HbaColNom[0] ;
            A510HbaColNum = P07FK6_A510HbaColNum[0] ;
            n510HbaColNum = P07FK6_n510HbaColNum[0] ;
            A537HbaTipCol = P07FK6_A537HbaTipCol[0] ;
            n537HbaTipCol = P07FK6_n537HbaTipCol[0] ;
            AV25FlagBH = httpContext.getMessage( "H", "") ;
            AV20CliCod = A252CliCod ;
            AV30ForSer = A535HbaSer ;
            AV28ForColNom = A509HbaColNom ;
            AV29ForColNum = A510HbaColNum ;
            AV75TipColCod = A537HbaTipCol ;
            /* Execute user subroutine: 'LEOFORMU' */
            S148 ();
            if ( returnInSub )
            {
               pr_default.close(4);
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
         pr_default.close(4);
      }
   }

   public void S148( ) throws ProcessInterruptedException
   {
      /* 'LEOFORMU' Routine */
      returnInSub = false ;
      AV73TiempoF = (short)(0) ;
      /* Using cursor P07FK7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV20CliCod), AV30ForSer, AV28ForColNom, Integer.valueOf(AV29ForColNum), Byte.valueOf(AV75TipColCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A764ProForCod = P07FK7_A764ProForCod[0] ;
         A831TipColCod = P07FK7_A831TipColCod[0] ;
         A483ForColNum = P07FK7_A483ForColNum[0] ;
         A482ForColNom = P07FK7_A482ForColNom[0] ;
         A494ForSer = P07FK7_A494ForSer[0] ;
         A252CliCod = P07FK7_A252CliCod[0] ;
         n252CliCod = P07FK7_n252CliCod[0] ;
         A771ProForTie = P07FK7_A771ProForTie[0] ;
         A583IntCod = P07FK7_A583IntCod[0] ;
         A584IntDsc = P07FK7_A584IntDsc[0] ;
         n584IntDsc = P07FK7_n584IntDsc[0] ;
         A1160ProForL = P07FK7_A1160ProForL[0] ;
         A771ProForTie = P07FK7_A771ProForTie[0] ;
         A583IntCod = P07FK7_A583IntCod[0] ;
         A584IntDsc = P07FK7_A584IntDsc[0] ;
         n584IntDsc = P07FK7_n584IntDsc[0] ;
         AV73TiempoF = (short)(AV73TiempoF+A771ProForTie) ;
         AV43Intcod = A583IntCod ;
         AV44IntDsc = A584IntDsc ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void h7FK0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 389, Gx_line+129, 405, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Minutos", ""), 576, Gx_line+129, 628, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Horas", ""), 639, Gx_line+129, 676, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Minutos", ""), 691, Gx_line+129, 743, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Horas", ""), 744, Gx_line+129, 781, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22EmprNom, "")), 8, Gx_line+11, 259, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 786, Gx_line+14, 837, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 894, Gx_line+14, 987, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 935, Gx_line+45, 980, Gx_line+62, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV33hISPRODTI, "99/99/99 99:99:99"), 54, Gx_line+79, 179, Gx_line+95, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV32hISPRODTF, "99/99/99 99:99:99"), 269, Gx_line+79, 394, Gx_line+95, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+4, 994, Gx_line+4, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+70, 994, Gx_line+70, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit0, "")), 8, Gx_line+45, 518, Gx_line+62, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit1, "")), 743, Gx_line+14, 773, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit2, "")), 857, Gx_line+14, 887, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Lit3, "")), 880, Gx_line+45, 925, Gx_line+63, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Lit4, "")), 11, Gx_line+79, 48, Gx_line+95, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit5, "")), 226, Gx_line+79, 263, Gx_line+95, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit6, "")), 13, Gx_line+129, 109, Gx_line+145, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit7, "")), 110, Gx_line+130, 155, Gx_line+146, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit8, "")), 234, Gx_line+130, 271, Gx_line+146, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit9, "")), 336, Gx_line+130, 381, Gx_line+146, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit10, "")), 506, Gx_line+130, 551, Gx_line+146, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit11, "")), 576, Gx_line+109, 621, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit12, "")), 622, Gx_line+109, 681, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit13, "")), 691, Gx_line+109, 736, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit14, "")), 740, Gx_line+109, 785, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Paro", ""), 790, Gx_line+129, 820, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 931, Gx_line+129, 961, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 846, Gx_line+129, 905, Gx_line+144, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 408, Gx_line+129, 482, Gx_line+144, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+155) ;
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
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      CloseOpenCursors();
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
      AV72PMaqCod = "" ;
      AV81UMaqCod = "" ;
      AV33hISPRODTI = GXutil.resetTime( GXutil.nullDate() );
      AV32hISPRODTF = GXutil.resetTime( GXutil.nullDate() );
      AV76TipMaqCod = "" ;
      AV9Artcodi = "" ;
      AV8Artcodf = "" ;
      AV17Barcolnomi = "" ;
      AV16Barcolnomf = "" ;
      AV46Lit01 = "" ;
      AV47Lit02 = "" ;
      AV45Lit0 = "" ;
      AV48Lit1 = "" ;
      AV58Lit2 = "" ;
      AV59Lit3 = "" ;
      AV60Lit4 = "" ;
      AV61Lit5 = "" ;
      AV62Lit6 = "" ;
      AV63Lit7 = "" ;
      AV64Lit8 = "" ;
      AV65Lit9 = "" ;
      AV49Lit10 = "" ;
      AV50Lit11 = "" ;
      AV51Lit12 = "" ;
      AV52Lit13 = "" ;
      AV53Lit14 = "" ;
      AV54Lit15 = "" ;
      AV55Lit16 = "" ;
      AV56Lit17 = "" ;
      AV57Lit18 = "" ;
      GXt_char1 = "" ;
      GXv_int3 = new byte[1] ;
      scmdbuf = "" ;
      P07FK2_A396EmprCod = new String[] {""} ;
      P07FK2_A407EmprNom = new String[] {""} ;
      P07FK2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV22EmprNom = "" ;
      P07FK3_A396EmprCod = new String[] {""} ;
      P07FK3_A1011TipMaqCod = new String[] {""} ;
      P07FK3_n1011TipMaqCod = new boolean[] {false} ;
      P07FK3_A136BarColNum = new int[1] ;
      P07FK3_A135BarColNom = new String[] {""} ;
      P07FK3_A212BarSer = new String[] {""} ;
      P07FK3_A602MaqCod = new String[] {""} ;
      P07FK3_A556HisProEst = new byte[1] ;
      P07FK3_A129BarCod = new int[1] ;
      P07FK3_A132BarCodReo = new byte[1] ;
      P07FK3_A130BarCodPar = new String[] {""} ;
      P07FK3_A461Fase = new String[] {""} ;
      P07FK3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FK3_A867ParCodNom = new String[] {""} ;
      P07FK3_n867ParCodNom = new boolean[] {false} ;
      P07FK3_A656ParCod = new short[1] ;
      P07FK3_n656ParCod = new boolean[] {false} ;
      P07FK3_A503GruOpeCod = new int[1] ;
      P07FK3_A3610HisProLot = new String[] {""} ;
      P07FK3_A606MaqDsc = new String[] {""} ;
      P07FK3_n606MaqDsc = new boolean[] {false} ;
      P07FK3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P07FK3_n4440HisProDTI = new boolean[] {false} ;
      P07FK3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P07FK3_n4441HisProDTF = new boolean[] {false} ;
      P07FK3_A563HisProMin = new byte[1] ;
      P07FK3_A560HisProHin = new byte[1] ;
      P07FK3_A562HisProMfi = new byte[1] ;
      P07FK3_A559HisProHfi = new byte[1] ;
      P07FK3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07FK3_A561HisProLin = new int[1] ;
      A1011TipMaqCod = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A602MaqCod = "" ;
      A130BarCodPar = "" ;
      A461Fase = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A3610HisProLot = "" ;
      A606MaqDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      AV77TotKgs = DecimalUtil.ZERO ;
      AV34HisProLot = "" ;
      AV12BarCodPar = "" ;
      AV23FasActTin = "" ;
      AV68MinRea2 = DecimalUtil.ZERO ;
      AV37HmP = DecimalUtil.ZERO ;
      AV36HmF = DecimalUtil.ZERO ;
      AV28ForColNom = "" ;
      AV30ForSer = "" ;
      AV44IntDsc = "" ;
      AV74TiempoNP = DecimalUtil.ZERO ;
      P07FK4_A396EmprCod = new String[] {""} ;
      P07FK4_A1011TipMaqCod = new String[] {""} ;
      P07FK4_n1011TipMaqCod = new boolean[] {false} ;
      P07FK4_A136BarColNum = new int[1] ;
      P07FK4_A135BarColNom = new String[] {""} ;
      P07FK4_A212BarSer = new String[] {""} ;
      P07FK4_A602MaqCod = new String[] {""} ;
      P07FK4_A556HisProEst = new byte[1] ;
      P07FK4_A129BarCod = new int[1] ;
      P07FK4_A132BarCodReo = new byte[1] ;
      P07FK4_A130BarCodPar = new String[] {""} ;
      P07FK4_A461Fase = new String[] {""} ;
      P07FK4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07FK4_A867ParCodNom = new String[] {""} ;
      P07FK4_n867ParCodNom = new boolean[] {false} ;
      P07FK4_A656ParCod = new short[1] ;
      P07FK4_n656ParCod = new boolean[] {false} ;
      P07FK4_A503GruOpeCod = new int[1] ;
      P07FK4_A3610HisProLot = new String[] {""} ;
      P07FK4_A606MaqDsc = new String[] {""} ;
      P07FK4_n606MaqDsc = new boolean[] {false} ;
      P07FK4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P07FK4_n4440HisProDTI = new boolean[] {false} ;
      P07FK4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P07FK4_n4441HisProDTF = new boolean[] {false} ;
      P07FK4_A563HisProMin = new byte[1] ;
      P07FK4_A560HisProHin = new byte[1] ;
      P07FK4_A562HisProMfi = new byte[1] ;
      P07FK4_A559HisProHfi = new byte[1] ;
      P07FK4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07FK4_A561HisProLin = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV25FlagBH = "" ;
      P07FK5_A396EmprCod = new String[] {""} ;
      P07FK5_A130BarCodPar = new String[] {""} ;
      P07FK5_A132BarCodReo = new byte[1] ;
      P07FK5_A129BarCod = new int[1] ;
      P07FK5_A252CliCod = new int[1] ;
      P07FK5_n252CliCod = new boolean[] {false} ;
      P07FK5_A212BarSer = new String[] {""} ;
      P07FK5_A135BarColNom = new String[] {""} ;
      P07FK5_A136BarColNum = new int[1] ;
      P07FK5_A218BarTipCol = new byte[1] ;
      P07FK6_A396EmprCod = new String[] {""} ;
      P07FK6_A507HbaBarPar = new String[] {""} ;
      P07FK6_A508HbaBarReo = new byte[1] ;
      P07FK6_A506HbaBarCod = new int[1] ;
      P07FK6_A252CliCod = new int[1] ;
      P07FK6_n252CliCod = new boolean[] {false} ;
      P07FK6_A535HbaSer = new String[] {""} ;
      P07FK6_n535HbaSer = new boolean[] {false} ;
      P07FK6_A509HbaColNom = new String[] {""} ;
      P07FK6_n509HbaColNom = new boolean[] {false} ;
      P07FK6_A510HbaColNum = new int[1] ;
      P07FK6_n510HbaColNum = new boolean[] {false} ;
      P07FK6_A537HbaTipCol = new byte[1] ;
      P07FK6_n537HbaTipCol = new boolean[] {false} ;
      A507HbaBarPar = "" ;
      A535HbaSer = "" ;
      A509HbaColNom = "" ;
      P07FK7_A764ProForCod = new String[] {""} ;
      P07FK7_A396EmprCod = new String[] {""} ;
      P07FK7_A831TipColCod = new byte[1] ;
      P07FK7_A483ForColNum = new int[1] ;
      P07FK7_A482ForColNom = new String[] {""} ;
      P07FK7_A494ForSer = new String[] {""} ;
      P07FK7_A252CliCod = new int[1] ;
      P07FK7_n252CliCod = new boolean[] {false} ;
      P07FK7_A771ProForTie = new short[1] ;
      P07FK7_A583IntCod = new byte[1] ;
      P07FK7_A584IntDsc = new String[] {""} ;
      P07FK7_n584IntDsc = new boolean[] {false} ;
      P07FK7_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A584IntDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rprdt10__default(),
         new Object[] {
             new Object[] {
            P07FK2_A396EmprCod, P07FK2_A407EmprNom, P07FK2_n407EmprNom
            }
            , new Object[] {
            P07FK3_A396EmprCod, P07FK3_A1011TipMaqCod, P07FK3_n1011TipMaqCod, P07FK3_A136BarColNum, P07FK3_A135BarColNom, P07FK3_A212BarSer, P07FK3_A602MaqCod, P07FK3_A556HisProEst, P07FK3_A129BarCod, P07FK3_A132BarCodReo,
            P07FK3_A130BarCodPar, P07FK3_A461Fase, P07FK3_A1525HisProKgr, P07FK3_A867ParCodNom, P07FK3_n867ParCodNom, P07FK3_A656ParCod, P07FK3_n656ParCod, P07FK3_A503GruOpeCod, P07FK3_A3610HisProLot, P07FK3_A606MaqDsc,
            P07FK3_n606MaqDsc, P07FK3_A4440HisProDTI, P07FK3_n4440HisProDTI, P07FK3_A4441HisProDTF, P07FK3_n4441HisProDTF, P07FK3_A563HisProMin, P07FK3_A560HisProHin, P07FK3_A562HisProMfi, P07FK3_A559HisProHfi, P07FK3_A558HisProFec,
            P07FK3_A561HisProLin
            }
            , new Object[] {
            P07FK4_A396EmprCod, P07FK4_A1011TipMaqCod, P07FK4_n1011TipMaqCod, P07FK4_A136BarColNum, P07FK4_A135BarColNom, P07FK4_A212BarSer, P07FK4_A602MaqCod, P07FK4_A556HisProEst, P07FK4_A129BarCod, P07FK4_A132BarCodReo,
            P07FK4_A130BarCodPar, P07FK4_A461Fase, P07FK4_A1525HisProKgr, P07FK4_A867ParCodNom, P07FK4_n867ParCodNom, P07FK4_A656ParCod, P07FK4_n656ParCod, P07FK4_A503GruOpeCod, P07FK4_A3610HisProLot, P07FK4_A606MaqDsc,
            P07FK4_n606MaqDsc, P07FK4_A4440HisProDTI, P07FK4_n4440HisProDTI, P07FK4_A4441HisProDTF, P07FK4_n4441HisProDTF, P07FK4_A563HisProMin, P07FK4_A560HisProHin, P07FK4_A562HisProMfi, P07FK4_A559HisProHfi, P07FK4_A558HisProFec,
            P07FK4_A561HisProLin
            }
            , new Object[] {
            P07FK5_A396EmprCod, P07FK5_A130BarCodPar, P07FK5_A132BarCodReo, P07FK5_A129BarCod, P07FK5_A252CliCod, P07FK5_n252CliCod, P07FK5_A212BarSer, P07FK5_A135BarColNom, P07FK5_A136BarColNum, P07FK5_A218BarTipCol
            }
            , new Object[] {
            P07FK6_A396EmprCod, P07FK6_A507HbaBarPar, P07FK6_A508HbaBarReo, P07FK6_A506HbaBarCod, P07FK6_A252CliCod, P07FK6_n252CliCod, P07FK6_A535HbaSer, P07FK6_n535HbaSer, P07FK6_A509HbaColNom, P07FK6_n509HbaColNom,
            P07FK6_A510HbaColNum, P07FK6_n510HbaColNum, P07FK6_A537HbaTipCol, P07FK6_n537HbaTipCol
            }
            , new Object[] {
            P07FK7_A764ProForCod, P07FK7_A396EmprCod, P07FK7_A831TipColCod, P07FK7_A483ForColNum, P07FK7_A482ForColNom, P07FK7_A494ForSer, P07FK7_A252CliCod, P07FK7_A771ProForTie, P07FK7_A583IntCod, P07FK7_A584IntDsc,
            P07FK7_n584IntDsc, P07FK7_A1160ProForL
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV21Diahorafin ;
   private byte AV27FlagTiReal ;
   private byte AV42ideas ;
   private byte GXt_int4 ;
   private byte GXv_int3[] ;
   private byte A556HisProEst ;
   private byte A132BarCodReo ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte AV14BarCodReo ;
   private byte AV26FlagMarca ;
   private byte AV67MinRea ;
   private byte AV75TipColCod ;
   private byte AV24FlagBarcad ;
   private byte A218BarTipCol ;
   private byte A508HbaBarReo ;
   private byte A537HbaTipCol ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV43Intcod ;
   private short gxcookieaux ;
   private short A656ParCod ;
   private short A564HisProTre ;
   private short A5605HisProTr2 ;
   private short AV35HisProTre ;
   private short AV40HorRea ;
   private short AV41HorReaint ;
   private short AV73TiempoF ;
   private short A771ProForTie ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV19Barcolnumi ;
   private int AV18Barcolnumf ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private int Gx_OldLine ;
   private int AV78TotMinT ;
   private int AV69NTin ;
   private int AV31Gruopecod ;
   private int AV79TotMinTp ;
   private int AV10BarCod ;
   private int AV29ForColNum ;
   private int AV20CliCod ;
   private int A252CliCod ;
   private int A506HbaBarCod ;
   private int A510HbaColNum ;
   private int A483ForColNum ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV77TotKgs ;
   private java.math.BigDecimal AV68MinRea2 ;
   private java.math.BigDecimal AV37HmP ;
   private java.math.BigDecimal AV36HmF ;
   private java.math.BigDecimal AV74TiempoNP ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV72PMaqCod ;
   private String AV81UMaqCod ;
   private String AV76TipMaqCod ;
   private String AV9Artcodi ;
   private String AV8Artcodf ;
   private String AV17Barcolnomi ;
   private String AV16Barcolnomf ;
   private String AV46Lit01 ;
   private String AV47Lit02 ;
   private String AV45Lit0 ;
   private String AV48Lit1 ;
   private String AV58Lit2 ;
   private String AV59Lit3 ;
   private String AV60Lit4 ;
   private String AV61Lit5 ;
   private String AV62Lit6 ;
   private String AV63Lit7 ;
   private String AV64Lit8 ;
   private String AV65Lit9 ;
   private String AV49Lit10 ;
   private String AV50Lit11 ;
   private String AV51Lit12 ;
   private String AV52Lit13 ;
   private String AV53Lit14 ;
   private String AV54Lit15 ;
   private String AV55Lit16 ;
   private String AV56Lit17 ;
   private String AV57Lit18 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV22EmprNom ;
   private String A1011TipMaqCod ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private String A461Fase ;
   private String A867ParCodNom ;
   private String A3610HisProLot ;
   private String A606MaqDsc ;
   private String AV34HisProLot ;
   private String AV12BarCodPar ;
   private String AV23FasActTin ;
   private String AV28ForColNom ;
   private String AV30ForSer ;
   private String AV44IntDsc ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String AV25FlagBH ;
   private String A507HbaBarPar ;
   private String A535HbaSer ;
   private String A509HbaColNom ;
   private String A764ProForCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A584IntDsc ;
   private String Gx_time ;
   private java.util.Date AV33hISPRODTI ;
   private java.util.Date AV32hISPRODTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean brk7FK4 ;
   private boolean n1011TipMaqCod ;
   private boolean n867ParCodNom ;
   private boolean n656ParCod ;
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean brk7FK6 ;
   private boolean n252CliCod ;
   private boolean n535HbaSer ;
   private boolean n509HbaColNom ;
   private boolean n510HbaColNum ;
   private boolean n537HbaTipCol ;
   private boolean n584IntDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P07FK2_A396EmprCod ;
   private String[] P07FK2_A407EmprNom ;
   private boolean[] P07FK2_n407EmprNom ;
   private String[] P07FK3_A396EmprCod ;
   private String[] P07FK3_A1011TipMaqCod ;
   private boolean[] P07FK3_n1011TipMaqCod ;
   private int[] P07FK3_A136BarColNum ;
   private String[] P07FK3_A135BarColNom ;
   private String[] P07FK3_A212BarSer ;
   private String[] P07FK3_A602MaqCod ;
   private byte[] P07FK3_A556HisProEst ;
   private int[] P07FK3_A129BarCod ;
   private byte[] P07FK3_A132BarCodReo ;
   private String[] P07FK3_A130BarCodPar ;
   private String[] P07FK3_A461Fase ;
   private java.math.BigDecimal[] P07FK3_A1525HisProKgr ;
   private String[] P07FK3_A867ParCodNom ;
   private boolean[] P07FK3_n867ParCodNom ;
   private short[] P07FK3_A656ParCod ;
   private boolean[] P07FK3_n656ParCod ;
   private int[] P07FK3_A503GruOpeCod ;
   private String[] P07FK3_A3610HisProLot ;
   private String[] P07FK3_A606MaqDsc ;
   private boolean[] P07FK3_n606MaqDsc ;
   private java.util.Date[] P07FK3_A4440HisProDTI ;
   private boolean[] P07FK3_n4440HisProDTI ;
   private java.util.Date[] P07FK3_A4441HisProDTF ;
   private boolean[] P07FK3_n4441HisProDTF ;
   private byte[] P07FK3_A563HisProMin ;
   private byte[] P07FK3_A560HisProHin ;
   private byte[] P07FK3_A562HisProMfi ;
   private byte[] P07FK3_A559HisProHfi ;
   private java.util.Date[] P07FK3_A558HisProFec ;
   private int[] P07FK3_A561HisProLin ;
   private String[] P07FK4_A396EmprCod ;
   private String[] P07FK4_A1011TipMaqCod ;
   private boolean[] P07FK4_n1011TipMaqCod ;
   private int[] P07FK4_A136BarColNum ;
   private String[] P07FK4_A135BarColNom ;
   private String[] P07FK4_A212BarSer ;
   private String[] P07FK4_A602MaqCod ;
   private byte[] P07FK4_A556HisProEst ;
   private int[] P07FK4_A129BarCod ;
   private byte[] P07FK4_A132BarCodReo ;
   private String[] P07FK4_A130BarCodPar ;
   private String[] P07FK4_A461Fase ;
   private java.math.BigDecimal[] P07FK4_A1525HisProKgr ;
   private String[] P07FK4_A867ParCodNom ;
   private boolean[] P07FK4_n867ParCodNom ;
   private short[] P07FK4_A656ParCod ;
   private boolean[] P07FK4_n656ParCod ;
   private int[] P07FK4_A503GruOpeCod ;
   private String[] P07FK4_A3610HisProLot ;
   private String[] P07FK4_A606MaqDsc ;
   private boolean[] P07FK4_n606MaqDsc ;
   private java.util.Date[] P07FK4_A4440HisProDTI ;
   private boolean[] P07FK4_n4440HisProDTI ;
   private java.util.Date[] P07FK4_A4441HisProDTF ;
   private boolean[] P07FK4_n4441HisProDTF ;
   private byte[] P07FK4_A563HisProMin ;
   private byte[] P07FK4_A560HisProHin ;
   private byte[] P07FK4_A562HisProMfi ;
   private byte[] P07FK4_A559HisProHfi ;
   private java.util.Date[] P07FK4_A558HisProFec ;
   private int[] P07FK4_A561HisProLin ;
   private String[] P07FK5_A396EmprCod ;
   private String[] P07FK5_A130BarCodPar ;
   private byte[] P07FK5_A132BarCodReo ;
   private int[] P07FK5_A129BarCod ;
   private int[] P07FK5_A252CliCod ;
   private boolean[] P07FK5_n252CliCod ;
   private String[] P07FK5_A212BarSer ;
   private String[] P07FK5_A135BarColNom ;
   private int[] P07FK5_A136BarColNum ;
   private byte[] P07FK5_A218BarTipCol ;
   private String[] P07FK6_A396EmprCod ;
   private String[] P07FK6_A507HbaBarPar ;
   private byte[] P07FK6_A508HbaBarReo ;
   private int[] P07FK6_A506HbaBarCod ;
   private int[] P07FK6_A252CliCod ;
   private boolean[] P07FK6_n252CliCod ;
   private String[] P07FK6_A535HbaSer ;
   private boolean[] P07FK6_n535HbaSer ;
   private String[] P07FK6_A509HbaColNom ;
   private boolean[] P07FK6_n509HbaColNom ;
   private int[] P07FK6_A510HbaColNum ;
   private boolean[] P07FK6_n510HbaColNum ;
   private byte[] P07FK6_A537HbaTipCol ;
   private boolean[] P07FK6_n537HbaTipCol ;
   private String[] P07FK7_A764ProForCod ;
   private String[] P07FK7_A396EmprCod ;
   private byte[] P07FK7_A831TipColCod ;
   private int[] P07FK7_A483ForColNum ;
   private String[] P07FK7_A482ForColNom ;
   private String[] P07FK7_A494ForSer ;
   private int[] P07FK7_A252CliCod ;
   private boolean[] P07FK7_n252CliCod ;
   private short[] P07FK7_A771ProForTie ;
   private byte[] P07FK7_A583IntCod ;
   private String[] P07FK7_A584IntDsc ;
   private boolean[] P07FK7_n584IntDsc ;
   private short[] P07FK7_A1160ProForL ;
}

final  class rprdt10__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07FK2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07FK3", "SELECT T1.EmprCod, T2.TipMaqCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T1.MaqCod, T1.HisProEst, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.Fase, T1.HisProKgr, T4.ParCodNom, T1.ParCod, T1.GruOpeCod, T1.HisProLot, T2.MaqDsc, T1.HisProDTI, T1.HisProDTF, T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTI >= ? and T1.HisProDTF <= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTI <= ?) AND (T3.BarSer >= ? and T3.BarSer <= ?) AND (T3.BarColNom >= ? and T3.BarColNom <= ?) AND (T3.BarColNum >= ? and T3.BarColNum <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProLot, T1.GruOpeCod, T1.ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07FK4", "SELECT T1.EmprCod, T2.TipMaqCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T1.MaqCod, T1.HisProEst, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.Fase, T1.HisProKgr, T4.ParCodNom, T1.ParCod, T1.GruOpeCod, T1.HisProLot, T2.MaqDsc, T1.HisProDTI, T1.HisProDTF, T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = T1.EmprCod AND T4.ParCod = T1.ParCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T3.BarSer >= ? and T3.BarSer <= ?) AND (T3.BarColNom >= ? and T3.BarColNom <= ?) AND (T3.BarColNum >= ? and T3.BarColNum <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProLot, T1.GruOpeCod, T1.ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07FK5", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07FK6", "SELECT EmprCod, HbaBarPar, HbaBarReo, HbaBarCod, CliCod, HbaSer, HbaColNom, HbaColNum, HbaTipCol FROM TXPHISBAR WHERE EmprCod = ? and HbaBarCod = ? and HbaBarReo = ? and HbaBarPar = ? ORDER BY EmprCod, HbaBarCod, HbaBarReo, HbaBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07FK7", "SELECT T1.ProForCod, T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T2.ProForTie, T3.IntCod, T4.IntDsc, T1.ProForL FROM (((TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPINTENS T4 ON T4.EmprCod = T1.EmprCod AND T4.IntCod = T3.IntCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 10);
               ((String[]) buf[19])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(20);
               ((byte[]) buf[26])[0] = rslt.getByte(21);
               ((byte[]) buf[27])[0] = rslt.getByte(22);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(24);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 10);
               ((String[]) buf[19])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(20);
               ((byte[]) buf[26])[0] = rslt.getByte(21);
               ((byte[]) buf[27])[0] = rslt.getByte(22);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(24);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 4);
               stmt.setString(14, (String)parms[13], 4);
               stmt.setString(15, (String)parms[14], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 4);
               stmt.setString(12, (String)parms[11], 4);
               stmt.setString(13, (String)parms[12], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

