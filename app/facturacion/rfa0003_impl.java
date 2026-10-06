package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa0003_impl extends GXWebReport
{
   public rfa0003_impl( com.genexus.internet.HttpContext context )
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
            AV8Pfecha = localUtil.parseDateParm( httpContext.GetPar( "Pfecha")) ;
            AV9Ufecha = localUtil.parseDateParm( httpContext.GetPar( "Ufecha")) ;
            AV33PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV34UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV44FasCodi = httpContext.GetPar( "FasCodi") ;
            AV45FasCod_f = httpContext.GetPar( "FasCod_f") ;
            AV50barpri = httpContext.GetPar( "barpri") ;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 256, 11909, 13176, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV13Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV53Pgmname, (byte)(99), GXv_char2) ;
         rfa0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit0 = GXt_char1 ;
         GXt_char1 = AV11Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfa0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV11Lit1 = GXt_char1 ;
         GXt_char1 = AV12Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfa0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV12Lit2 = GXt_char1 ;
         GXt_char1 = AV14Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfa0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV14Lit3 = GXt_char1 ;
         GXt_char1 = AV16Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2334_", ""), (byte)(99), GXv_char2) ;
         rfa0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV16Lit4 = GXt_char1 ;
         GXt_char1 = AV28Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT263_", ""), (byte)(99), GXv_char2) ;
         rfa0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit5 = GXt_char1 ;
         GXt_char1 = AV17Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rfa0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit11 = GXt_char1 ;
         GXt_char1 = AV31Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char2) ;
         rfa0003_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit6 = GXt_char1 ;
         if ( GXutil.strcmp(AV13Lit0, httpContext.getMessage( "RFA0003", "")) == 0 )
         {
            AV13Lit0 = AV54Pgmdesc ;
         }
         GXv_int3[0] = AV29FlagIdioma ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100001", GXv_int3) ;
         rfa0003_impl.this.AV29FlagIdioma = GXv_int3[0] ;
         AV30vMoneda = httpContext.getMessage( "Pesetas", "") ;
         if ( AV29FlagIdioma == 1 )
         {
            AV30vMoneda = httpContext.getMessage( "Escudos", "") ;
         }
         /* Using cursor P06KZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06KZ2_A407EmprNom[0] ;
            n407EmprNom = P06KZ2_n407EmprNom[0] ;
            A3915EmpNumDec = P06KZ2_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06KZ2_n3915EmpNumDec[0] ;
            AV10EmprNom = A407EmprNom ;
            if ( A3915EmpNumDec > 0 )
            {
               AV30vMoneda = httpContext.getMessage( "Euros", "") ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         h6KZ0( false, 131) ;
         getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 13, Gx_line+6, 264, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit1, "")), 511, Gx_line+6, 548, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 563, Gx_line+6, 622, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Lit2, "")), 643, Gx_line+6, 673, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 708, Gx_line+6, 767, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit0, "")), 13, Gx_line+40, 347, Gx_line+58, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit3, "")), 650, Gx_line+40, 695, Gx_line+58, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 723, Gx_line+40, 768, Gx_line+57, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(5, Gx_line+64, 776, Gx_line+64, 2, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "De:", ""), 11, Gx_line+70, 34, Gx_line+87, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV8Pfecha, "99/99/99"), 48, Gx_line+70, 107, Gx_line+87, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "a", ""), 121, Gx_line+70, 129, Gx_line+87, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV9Ufecha, "99/99/99"), 143, Gx_line+70, 202, Gx_line+87, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Lit4, "")), 13, Gx_line+108, 123, Gx_line+126, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(5, Gx_line+127, 776, Gx_line+127, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30vMoneda, "")), 260, Gx_line+108, 334, Gx_line+126, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit6, "")), 399, Gx_line+108, 473, Gx_line+126, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Clientes:", ""), 229, Gx_line+70, 296, Gx_line+87, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33PCliCod), "ZZZZZ9")), 302, Gx_line+70, 347, Gx_line+87, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34UCliCod), "ZZZZZ9")), 360, Gx_line+70, 405, Gx_line+87, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 564, Gx_line+108, 609, Gx_line+125, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Pgmname, "")), 367, Gx_line+40, 587, Gx_line+57, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+131) ;
         AV22TotTotal = DecimalUtil.doubleToDec(0) ;
         AV27TotKgsT = DecimalUtil.doubleToDec(0) ;
         AV38TotMtsT = DecimalUtil.doubleToDec(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV8Pfecha ,
                                              AV9Ufecha ,
                                              Integer.valueOf(AV33PCliCod) ,
                                              Integer.valueOf(AV34UCliCod) ,
                                              AV44FasCodi ,
                                              AV45FasCod_f ,
                                              A436FacFch ,
                                              Integer.valueOf(A252CliCod) ,
                                              A3397FacFasCod ,
                                              Byte.valueOf(A1153FacTipFac) ,
                                              A450FacPri ,
                                              AV50barpri ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P06KZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV50barpri, AV8Pfecha, AV9Ufecha, Integer.valueOf(AV33PCliCod), Integer.valueOf(AV34UCliCod), AV44FasCodi, AV45FasCod_f});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6KZ3 = false ;
            A1153FacTipFac = P06KZ3_A1153FacTipFac[0] ;
            A450FacPri = P06KZ3_A450FacPri[0] ;
            A252CliCod = P06KZ3_A252CliCod[0] ;
            A436FacFch = P06KZ3_A436FacFch[0] ;
            A447FacMts = P06KZ3_A447FacMts[0] ;
            A449FacPreMts = P06KZ3_A449FacPreMts[0] ;
            A444FacKgs = P06KZ3_A444FacKgs[0] ;
            A448FacPreKgs = P06KZ3_A448FacPreKgs[0] ;
            A3397FacFasCod = P06KZ3_A3397FacFasCod[0] ;
            A1296FacBarPar = P06KZ3_A1296FacBarPar[0] ;
            A1295FacBarReo = P06KZ3_A1295FacBarReo[0] ;
            A1294FacBarCod = P06KZ3_A1294FacBarCod[0] ;
            A427FacAlbCod = P06KZ3_A427FacAlbCod[0] ;
            A430FacCod = P06KZ3_A430FacCod[0] ;
            A446FacLin = P06KZ3_A446FacLin[0] ;
            A1153FacTipFac = P06KZ3_A1153FacTipFac[0] ;
            A450FacPri = P06KZ3_A450FacPri[0] ;
            A252CliCod = P06KZ3_A252CliCod[0] ;
            A436FacFch = P06KZ3_A436FacFch[0] ;
            AV15TotFase = DecimalUtil.doubleToDec(0) ;
            AV26TotKgs = DecimalUtil.doubleToDec(0) ;
            AV37TotMts = DecimalUtil.doubleToDec(0) ;
            AV39Kgs_Fra = DecimalUtil.doubleToDec(0) ;
            AV40FacKgs = DecimalUtil.doubleToDec(0) ;
            AV43Fac_Hdr = "" ;
            AV41LastFacHdr = "" ;
            AV46FasCod = A3397FacFasCod ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06KZ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P06KZ3_A3397FacFasCod[0], A3397FacFasCod) == 0 ) )
            {
               brk6KZ3 = false ;
               A1153FacTipFac = P06KZ3_A1153FacTipFac[0] ;
               A450FacPri = P06KZ3_A450FacPri[0] ;
               A252CliCod = P06KZ3_A252CliCod[0] ;
               A436FacFch = P06KZ3_A436FacFch[0] ;
               A447FacMts = P06KZ3_A447FacMts[0] ;
               A449FacPreMts = P06KZ3_A449FacPreMts[0] ;
               A444FacKgs = P06KZ3_A444FacKgs[0] ;
               A448FacPreKgs = P06KZ3_A448FacPreKgs[0] ;
               A1296FacBarPar = P06KZ3_A1296FacBarPar[0] ;
               A1295FacBarReo = P06KZ3_A1295FacBarReo[0] ;
               A1294FacBarCod = P06KZ3_A1294FacBarCod[0] ;
               A427FacAlbCod = P06KZ3_A427FacAlbCod[0] ;
               A430FacCod = P06KZ3_A430FacCod[0] ;
               A446FacLin = P06KZ3_A446FacLin[0] ;
               A1153FacTipFac = P06KZ3_A1153FacTipFac[0] ;
               A450FacPri = P06KZ3_A450FacPri[0] ;
               A252CliCod = P06KZ3_A252CliCod[0] ;
               A436FacFch = P06KZ3_A436FacFch[0] ;
               if ( A1153FacTipFac == 0 )
               {
                  if ( GXutil.strcmp(A450FacPri, AV50barpri) == 0 )
                  {
                     if ( ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) ) || ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) ) )
                     {
                        AV15TotFase = AV15TotFase.add((GXutil.roundDecimal( A444FacKgs.multiply(A448FacPreKgs), 2).add(GXutil.roundDecimal( A447FacMts.multiply(A449FacPreMts), 2)))) ;
                        AV43Fac_Hdr = GXutil.str( A430FacCod, 8, 0) + GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                        AV47FacPreKgs = A448FacPreKgs ;
                        AV48FacPreMts = A449FacPreMts ;
                        if ( GXutil.strcmp(AV43Fac_Hdr, AV41LastFacHdr) != 0 )
                        {
                           if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) )
                           {
                              AV26TotKgs = AV26TotKgs.add(A444FacKgs) ;
                           }
                           if ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) )
                           {
                              AV37TotMts = AV37TotMts.add(A447FacMts) ;
                           }
                        }
                        AV41LastFacHdr = GXutil.str( A430FacCod, 8, 0) + GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
                     }
                  }
               }
               brk6KZ3 = true ;
               pr_default.readNext(1);
            }
            /* Execute user subroutine: 'FASPRO' */
            S111 ();
            if ( returnInSub )
            {
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
            h6KZ0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21FasDsc, "")), 13, Gx_line+0, 218, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV15TotFase, "ZZ,ZZZ,ZZ9.99")), 239, Gx_line+1, 335, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TotKgs, "ZZZ,ZZZ,ZZ9.99")), 370, Gx_line+1, 473, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3397FacFasCod, "")), 718, Gx_line+1, 777, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37TotMts, "ZZZ,ZZZ,ZZ9.99")), 505, Gx_line+1, 608, Gx_line+18, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV22TotTotal = AV22TotTotal.add(AV15TotFase) ;
            AV27TotKgsT = AV27TotKgsT.add(AV26TotKgs) ;
            AV38TotMtsT = AV38TotMtsT.add(AV37TotMts) ;
            if ( ! brk6KZ3 )
            {
               brk6KZ3 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         h6KZ0( false, 21) ;
         getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotTotal, "ZZ,ZZZ,ZZ9.99")), 239, Gx_line+3, 335, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27TotKgsT, "ZZZ,ZZZ,ZZ9.99")), 370, Gx_line+3, 473, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TotMtsT, "ZZZ,ZZZ,ZZ9.99")), 505, Gx_line+3, 608, Gx_line+21, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+21) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6KZ0( true, 0) ;
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
      /* 'FASPRO' Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", AV46FasCod)==0) )
      {
         AV21FasDsc = httpContext.getMessage( "Tinturaria", "") ;
      }
      else
      {
         AV21FasDsc = httpContext.getMessage( "Inexistente", "") ;
         /* Using cursor P06KZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV46FasCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A457FasCod = P06KZ4_A457FasCod[0] ;
            A460FasDsc = P06KZ4_A460FasDsc[0] ;
            AV21FasDsc = A460FasDsc ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   public void h6KZ0( boolean bFoot ,
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV8Pfecha = GXutil.nullDate() ;
      AV9Ufecha = GXutil.nullDate() ;
      AV44FasCodi = "" ;
      AV45FasCod_f = "" ;
      AV50barpri = "" ;
      AV13Lit0 = "" ;
      AV53Pgmname = "" ;
      AV11Lit1 = "" ;
      AV12Lit2 = "" ;
      AV14Lit3 = "" ;
      AV16Lit4 = "" ;
      AV28Lit5 = "" ;
      AV17Lit11 = "" ;
      AV31Lit6 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV54Pgmdesc = "" ;
      GXv_int3 = new byte[1] ;
      AV30vMoneda = "" ;
      scmdbuf = "" ;
      P06KZ2_A396EmprCod = new String[] {""} ;
      P06KZ2_A407EmprNom = new String[] {""} ;
      P06KZ2_n407EmprNom = new boolean[] {false} ;
      P06KZ2_A3915EmpNumDec = new byte[1] ;
      P06KZ2_n3915EmpNumDec = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV22TotTotal = DecimalUtil.ZERO ;
      AV27TotKgsT = DecimalUtil.ZERO ;
      AV38TotMtsT = DecimalUtil.ZERO ;
      A436FacFch = GXutil.nullDate() ;
      A3397FacFasCod = "" ;
      A450FacPri = "" ;
      P06KZ3_A396EmprCod = new String[] {""} ;
      P06KZ3_A1153FacTipFac = new byte[1] ;
      P06KZ3_A450FacPri = new String[] {""} ;
      P06KZ3_A252CliCod = new int[1] ;
      P06KZ3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P06KZ3_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KZ3_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KZ3_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KZ3_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KZ3_A3397FacFasCod = new String[] {""} ;
      P06KZ3_A1296FacBarPar = new String[] {""} ;
      P06KZ3_A1295FacBarReo = new byte[1] ;
      P06KZ3_A1294FacBarCod = new int[1] ;
      P06KZ3_A427FacAlbCod = new long[1] ;
      P06KZ3_A430FacCod = new int[1] ;
      P06KZ3_A446FacLin = new int[1] ;
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A1296FacBarPar = "" ;
      AV15TotFase = DecimalUtil.ZERO ;
      AV26TotKgs = DecimalUtil.ZERO ;
      AV37TotMts = DecimalUtil.ZERO ;
      AV39Kgs_Fra = DecimalUtil.ZERO ;
      AV40FacKgs = DecimalUtil.ZERO ;
      AV43Fac_Hdr = "" ;
      AV41LastFacHdr = "" ;
      AV46FasCod = "" ;
      AV47FacPreKgs = DecimalUtil.ZERO ;
      AV48FacPreMts = DecimalUtil.ZERO ;
      AV21FasDsc = "" ;
      P06KZ4_A396EmprCod = new String[] {""} ;
      P06KZ4_A457FasCod = new String[] {""} ;
      P06KZ4_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rfa0003__default(),
         new Object[] {
             new Object[] {
            P06KZ2_A396EmprCod, P06KZ2_A407EmprNom, P06KZ2_n407EmprNom, P06KZ2_A3915EmpNumDec, P06KZ2_n3915EmpNumDec
            }
            , new Object[] {
            P06KZ3_A396EmprCod, P06KZ3_A1153FacTipFac, P06KZ3_A450FacPri, P06KZ3_A252CliCod, P06KZ3_A436FacFch, P06KZ3_A447FacMts, P06KZ3_A449FacPreMts, P06KZ3_A444FacKgs, P06KZ3_A448FacPreKgs, P06KZ3_A3397FacFasCod,
            P06KZ3_A1296FacBarPar, P06KZ3_A1295FacBarReo, P06KZ3_A1294FacBarCod, P06KZ3_A427FacAlbCod, P06KZ3_A430FacCod, P06KZ3_A446FacLin
            }
            , new Object[] {
            P06KZ4_A396EmprCod, P06KZ4_A457FasCod, P06KZ4_A460FasDsc
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV54Pgmdesc = httpContext.getMessage( "Facturacion por Fases", "") ;
      AV53Pgmname = "Facturacion.RFA0003" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV54Pgmdesc = httpContext.getMessage( "Facturacion por Fases", "") ;
      AV53Pgmname = "Facturacion.RFA0003" ;
      Gx_err = (short)(0) ;
   }

   private byte AV29FlagIdioma ;
   private byte GXv_int3[] ;
   private byte A3915EmpNumDec ;
   private byte A1153FacTipFac ;
   private byte A1295FacBarReo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV33PCliCod ;
   private int AV34UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A252CliCod ;
   private int A1294FacBarCod ;
   private int A430FacCod ;
   private int A446FacLin ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal AV22TotTotal ;
   private java.math.BigDecimal AV27TotKgsT ;
   private java.math.BigDecimal AV38TotMtsT ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal AV15TotFase ;
   private java.math.BigDecimal AV26TotKgs ;
   private java.math.BigDecimal AV37TotMts ;
   private java.math.BigDecimal AV39Kgs_Fra ;
   private java.math.BigDecimal AV40FacKgs ;
   private java.math.BigDecimal AV47FacPreKgs ;
   private java.math.BigDecimal AV48FacPreMts ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV44FasCodi ;
   private String AV45FasCod_f ;
   private String AV50barpri ;
   private String AV13Lit0 ;
   private String AV53Pgmname ;
   private String AV11Lit1 ;
   private String AV12Lit2 ;
   private String AV14Lit3 ;
   private String AV16Lit4 ;
   private String AV28Lit5 ;
   private String AV17Lit11 ;
   private String AV31Lit6 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV54Pgmdesc ;
   private String AV30vMoneda ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String Gx_time ;
   private String A3397FacFasCod ;
   private String A450FacPri ;
   private String A1296FacBarPar ;
   private String AV43Fac_Hdr ;
   private String AV41LastFacHdr ;
   private String AV46FasCod ;
   private String AV21FasDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private java.util.Date AV8Pfecha ;
   private java.util.Date AV9Ufecha ;
   private java.util.Date Gx_date ;
   private java.util.Date A436FacFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean brk6KZ3 ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P06KZ2_A396EmprCod ;
   private String[] P06KZ2_A407EmprNom ;
   private boolean[] P06KZ2_n407EmprNom ;
   private byte[] P06KZ2_A3915EmpNumDec ;
   private boolean[] P06KZ2_n3915EmpNumDec ;
   private String[] P06KZ3_A396EmprCod ;
   private byte[] P06KZ3_A1153FacTipFac ;
   private String[] P06KZ3_A450FacPri ;
   private int[] P06KZ3_A252CliCod ;
   private java.util.Date[] P06KZ3_A436FacFch ;
   private java.math.BigDecimal[] P06KZ3_A447FacMts ;
   private java.math.BigDecimal[] P06KZ3_A449FacPreMts ;
   private java.math.BigDecimal[] P06KZ3_A444FacKgs ;
   private java.math.BigDecimal[] P06KZ3_A448FacPreKgs ;
   private String[] P06KZ3_A3397FacFasCod ;
   private String[] P06KZ3_A1296FacBarPar ;
   private byte[] P06KZ3_A1295FacBarReo ;
   private int[] P06KZ3_A1294FacBarCod ;
   private long[] P06KZ3_A427FacAlbCod ;
   private int[] P06KZ3_A430FacCod ;
   private int[] P06KZ3_A446FacLin ;
   private String[] P06KZ4_A396EmprCod ;
   private String[] P06KZ4_A457FasCod ;
   private String[] P06KZ4_A460FasDsc ;
}

final  class rfa0003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06KZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV8Pfecha ,
                                          java.util.Date AV9Ufecha ,
                                          int AV33PCliCod ,
                                          int AV34UCliCod ,
                                          String AV44FasCodi ,
                                          String AV45FasCod_f ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A3397FacFasCod ,
                                          byte A1153FacTipFac ,
                                          String A450FacPri ,
                                          String AV50barpri ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[8];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.FacTipFac, T2.FacPri, T2.CliCod, T2.FacFch, T1.FacMts, T1.FacPreMts, T1.FacKgs, T1.FacPreKgs, T1.FacFasCod, T1.FacBarPar, T1.FacBarReo, T1.FacBarCod," ;
      scmdbuf += " T1.FacAlbCod, T1.FacCod, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.FacTipFac = 0)");
      addWhere(sWhereString, "(T2.FacPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8Pfecha)) )
      {
         addWhere(sWhereString, "(T2.FacFch >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9Ufecha)) )
      {
         addWhere(sWhereString, "(T2.FacFch <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV33PCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV34UCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44FasCodi)==0) )
      {
         addWhere(sWhereString, "(T1.FacFasCod >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45FasCod_f)==0) )
      {
         addWhere(sWhereString, "(T1.FacFasCod <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FacFasCod, T1.FacCod, T1.FacAlbCod, T1.FacBarCod, T1.FacBarReo, T1.FacBarPar" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P06KZ3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06KZ2", "SELECT EmprCod, EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06KZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06KZ4", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

