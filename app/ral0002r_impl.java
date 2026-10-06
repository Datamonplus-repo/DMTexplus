package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ral0002r_impl extends GXWebReport
{
   public ral0002r_impl( com.genexus.internet.HttpContext context )
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
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV16PTipArt = (short)(GXutil.lval( httpContext.GetPar( "PTipArt"))) ;
            AV17UTipArt = (short)(GXutil.lval( httpContext.GetPar( "UTipArt"))) ;
            AV18PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV19UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV20PSerCod = httpContext.GetPar( "PSerCod") ;
            AV21USerCod = httpContext.GetPar( "USerCod") ;
            AV22PColor = httpContext.GetPar( "PColor") ;
            AV23UColor = httpContext.GetPar( "UColor") ;
            AV24PColNum = (int)(GXutil.lval( httpContext.GetPar( "PColNum"))) ;
            AV25UColNum = (int)(GXutil.lval( httpContext.GetPar( "UColNum"))) ;
            AV26PDisCli = httpContext.GetPar( "PDisCli") ;
            AV27UDisCli = httpContext.GetPar( "UDisCli") ;
            AV28PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV29UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
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
      M_bot = 0 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV38Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN069_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit0 = GXt_char1 ;
         GXt_char1 = AV39Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit1 = GXt_char1 ;
         GXt_char1 = AV40Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit2 = GXt_char1 ;
         GXt_char1 = AV41Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit3 = GXt_char1 ;
         GXt_char1 = AV42Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN428_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit4 = GXt_char1 ;
         GXt_char1 = AV43Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN506_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit5 = GXt_char1 ;
         GXt_char1 = AV44Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN438_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit6 = GXt_char1 ;
         GXt_char1 = AV45Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit7 = GXt_char1 ;
         GXt_char1 = AV46Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN323_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit8 = GXt_char1 ;
         GXt_char1 = AV47Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit9 = GXt_char1 ;
         GXt_char1 = AV48Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit10 = GXt_char1 ;
         GXt_char1 = AV49Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit11 = GXt_char1 ;
         GXt_char1 = AV50Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit12 = GXt_char1 ;
         GXt_char1 = AV51Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2130_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit13 = GXt_char1 ;
         GXt_char1 = AV52Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2423_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit14 = GXt_char1 ;
         GXt_char1 = AV53Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN403_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit15 = GXt_char1 ;
         GXt_char1 = AV54Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2130_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit16 = GXt_char1 ;
         GXt_char1 = AV55Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2423_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit17 = GXt_char1 ;
         GXt_char1 = AV56Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN403_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit18 = GXt_char1 ;
         GXt_char1 = AV57Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit19 = GXt_char1 ;
         GXt_char1 = AV58Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit20 = GXt_char1 ;
         GXt_char1 = AV59Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2447_", ""), (byte)(99), GXv_char2) ;
         ral0002r_impl.this.GXt_char1 = GXv_char2[0] ;
         AV59Lit21 = GXt_char1 ;
         AV69FlagLamina = (byte)(0) ;
         GXv_int3[0] = AV69FlagLamina ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAMINA", ""), GXv_int3) ;
         ral0002r_impl.this.AV69FlagLamina = GXv_int3[0] ;
         GXv_int3[0] = AV71NCorte ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCORTE", ""), GXv_int3) ;
         ral0002r_impl.this.AV71NCorte = GXv_int3[0] ;
         GXt_int4 = AV85Moda21 ;
         GXv_int3[0] = GXt_int4 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
         ral0002r_impl.this.GXt_int4 = GXv_int3[0] ;
         AV85Moda21 = GXt_int4 ;
         /* Using cursor P07EW2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07EW2_A407EmprNom[0] ;
            n407EmprNom = P07EW2_n407EmprNom[0] ;
            AV67NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV32TotKgsEnt = DecimalUtil.doubleToDec(0) ;
         AV33TotKgsSal = DecimalUtil.doubleToDec(0) ;
         AV35TotMtsEnt = DecimalUtil.doubleToDec(0) ;
         AV34TotMtsSal = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P07EW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18PCliCod), Integer.valueOf(AV19UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P07EW3_A252CliCod[0] ;
            n252CliCod = P07EW3_n252CliCod[0] ;
            A279CliNom = P07EW3_A279CliNom[0] ;
            AV79Clicodi = A252CliCod ;
            AV80CliNom = A279CliNom ;
            /* Execute user subroutine: 'BARCAD' */
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
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV64TotKDif = AV82KgsSalF.subtract(AV81KgsEntF) ;
         AV61PorKgs = DecimalUtil.doubleToDec(0) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81KgsEntF)==0) && ( AV82KgsSalF.doubleValue() > 0 ) )
         {
            AV61PorKgs = ((AV64TotKDif.divide(AV81KgsEntF, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         AV65TotMDif = AV84MtsSalF.subtract(AV83MtsEntF) ;
         AV63PorMts = DecimalUtil.doubleToDec(0) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83MtsEntF)==0) && ( AV84MtsSalF.doubleValue() > 0 ) )
         {
            AV63PorMts = ((AV65TotMDif.divide(AV83MtsEntF, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         if ( ( AV83MtsEntF.doubleValue() == 0 ) && ( AV81KgsEntF.doubleValue() == 0 ) )
         {
         }
         else
         {
            h7EW0( false, 18) ;
            getPrinter().GxDrawLine(0, Gx_line+9, 1060, Gx_line+9, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            h7EW0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV81KgsEntF, "ZZZ,ZZZ,ZZ9.99")), 284, Gx_line+1, 387, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV82KgsSalF, "ZZZ,ZZZ,ZZ9.99")), 391, Gx_line+1, 494, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TotKDif, "Z,ZZZ,ZZ9.99")), 503, Gx_line+1, 592, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61PorKgs, "ZZ9.99")), 599, Gx_line+2, 644, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV83MtsEntF, "ZZZ,ZZZ,ZZ9.99")), 682, Gx_line+1, 785, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84MtsSalF, "ZZZ,ZZZ,ZZ9.99")), 792, Gx_line+1, 895, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65TotMDif, "Z,ZZZ,ZZ9.99")), 900, Gx_line+1, 989, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63PorMts, "ZZ9.99")), 997, Gx_line+1, 1042, Gx_line+18, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7EW0( true, 0) ;
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
      /* 'BARCAD' Routine */
      returnInSub = false ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV16PTipArt) ,
                                           Short.valueOf(AV17UTipArt) ,
                                           AV20PSerCod ,
                                           AV21USerCod ,
                                           AV22PColor ,
                                           AV23UColor ,
                                           Integer.valueOf(AV24PColNum) ,
                                           Integer.valueOf(AV25UColNum) ,
                                           AV26PDisCli ,
                                           AV27UDisCli ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A143BarDisNum ,
                                           A161BarFecSal ,
                                           AV28PFecha ,
                                           AV29UFecha ,
                                           Byte.valueOf(A213BarSit) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV79Clicodi) ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P07EW5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV79Clicodi), AV28PFecha, AV29UFecha, Short.valueOf(AV16PTipArt), Short.valueOf(AV17UTipArt), AV20PSerCod, AV21USerCod, AV22PColor, AV23UColor, Integer.valueOf(AV24PColNum), Integer.valueOf(AV25UColNum), AV26PDisCli, AV27UDisCli});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P07EW5_A130BarCodPar[0] ;
         A132BarCodReo = P07EW5_A132BarCodReo[0] ;
         A129BarCod = P07EW5_A129BarCod[0] ;
         A213BarSit = P07EW5_A213BarSit[0] ;
         A161BarFecSal = P07EW5_A161BarFecSal[0] ;
         A143BarDisNum = P07EW5_A143BarDisNum[0] ;
         A136BarColNum = P07EW5_A136BarColNum[0] ;
         A135BarColNom = P07EW5_A135BarColNom[0] ;
         A212BarSer = P07EW5_A212BarSer[0] ;
         A217BarTipArt = P07EW5_A217BarTipArt[0] ;
         n217BarTipArt = P07EW5_n217BarTipArt[0] ;
         A252CliCod = P07EW5_A252CliCod[0] ;
         n252CliCod = P07EW5_n252CliCod[0] ;
         A2827BarKgsLot = P07EW5_A2827BarKgsLot[0] ;
         A166BarKgm = P07EW5_A166BarKgm[0] ;
         A184BarMtr = P07EW5_A184BarMtr[0] ;
         A166BarKgm = P07EW5_A166BarKgm[0] ;
         A184BarMtr = P07EW5_A184BarMtr[0] ;
         AV76Mts_s = DecimalUtil.doubleToDec(0) ;
         AV77Kgs_s = DecimalUtil.doubleToDec(0) ;
         AV78Albbar = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P07EW6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1261BarAlbKgmE = P07EW6_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P07EW6_A1263BarAlbMtrE[0] ;
            A2243BarKgsCli = P07EW6_A2243BarKgsCli[0] ;
            n2243BarKgsCli = P07EW6_n2243BarKgsCli[0] ;
            A1461BarAlbPN = P07EW6_A1461BarAlbPN[0] ;
            A30AlbProCod = P07EW6_A30AlbProCod[0] ;
            AV86BarAlbKgmE = A1261BarAlbKgmE ;
            AV87BarAlbMtrE = A1263BarAlbMtrE ;
            if ( AV85Moda21 == 1 )
            {
               if ( A2243BarKgsCli.doubleValue() != 0 )
               {
                  AV86BarAlbKgmE = A2243BarKgsCli ;
               }
               if ( A1461BarAlbPN.doubleValue() != 0 )
               {
                  AV87BarAlbMtrE = A1461BarAlbPN ;
               }
            }
            AV76Mts_s = AV76Mts_s.add(AV87BarAlbMtrE) ;
            AV77Kgs_s = AV77Kgs_s.add(AV86BarAlbKgmE) ;
            AV78Albbar = DecimalUtil.doubleToDec(1) ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( AV78Albbar.doubleValue() == 0 )
         {
            /* Optimized group. */
            /* Using cursor P07EW7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            c183BarMetLan = P07EW7_A183BarMetLan[0] ;
            c170BarKilLan = P07EW7_A170BarKilLan[0] ;
            pr_default.close(4);
            AV76Mts_s = AV76Mts_s.add(c183BarMetLan) ;
            AV77Kgs_s = AV77Kgs_s.add(c170BarKilLan) ;
            /* End optimized group. */
         }
         AV70BarKgm = A166BarKgm ;
         if ( ( A2827BarKgsLot.doubleValue() != 0 ) && ( AV69FlagLamina == 1 ) )
         {
            AV70BarKgm = A2827BarKgsLot ;
         }
         if ( AV71NCorte == 1 )
         {
            AV73CliCod = A252CliCod ;
            AV74ArtCod = A212BarSer ;
            /* Execute user subroutine: 'BUSCA_CORTES' */
            S125 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            AV75BarMtrLan = AV76Mts_s.divide(DecimalUtil.doubleToDec((AV72ArtNumCor+1)), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV75BarMtrLan = AV76Mts_s ;
         }
         AV32TotKgsEnt = AV32TotKgsEnt.add(AV70BarKgm) ;
         AV33TotKgsSal = AV33TotKgsSal.add(AV77Kgs_s) ;
         AV35TotMtsEnt = AV35TotMtsEnt.add(A184BarMtr) ;
         AV34TotMtsSal = AV34TotMtsSal.add(AV75BarMtrLan) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV61PorKgs = DecimalUtil.doubleToDec(0) ;
      if ( ( AV32TotKgsEnt.doubleValue() == 0 ) && ( AV35TotMtsEnt.doubleValue() == 0 ) )
      {
      }
      else
      {
         AV64TotKDif = AV33TotKgsSal.subtract(AV32TotKgsEnt) ;
         AV61PorKgs = DecimalUtil.doubleToDec(0) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TotKgsEnt)==0) && ( AV33TotKgsSal.doubleValue() > 0 ) )
         {
            AV61PorKgs = ((AV64TotKDif.divide(AV32TotKgsEnt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         AV63PorMts = DecimalUtil.doubleToDec(0) ;
         AV65TotMDif = AV34TotMtsSal.subtract(AV35TotMtsEnt) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TotMtsEnt)==0) && ( AV34TotMtsSal.doubleValue() > 0 ) )
         {
            AV63PorMts = ((AV65TotMDif.divide(AV35TotMtsEnt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         h7EW0( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV79Clicodi), "ZZZZZ9")), 15, Gx_line+0, 60, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80CliNom, "")), 66, Gx_line+0, 286, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TotKgsEnt, "Z,ZZZ,ZZ9.99")), 299, Gx_line+0, 388, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TotKgsSal, "Z,ZZZ,ZZ9.99")), 405, Gx_line+0, 494, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TotKDif, "Z,ZZZ,ZZ9.99")), 503, Gx_line+0, 592, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61PorKgs, "ZZ9.99")), 599, Gx_line+1, 644, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TotMtsEnt, "Z,ZZZ,ZZ9.99")), 697, Gx_line+0, 786, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TotMtsSal, "Z,ZZZ,ZZ9.99")), 801, Gx_line+0, 890, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65TotMDif, "Z,ZZZ,ZZ9.99")), 895, Gx_line+0, 984, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63PorMts, "ZZ9.99")), 992, Gx_line+0, 1037, Gx_line+17, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV81KgsEntF = AV81KgsEntF.add(AV32TotKgsEnt) ;
         AV82KgsSalF = AV82KgsSalF.add(AV33TotKgsSal) ;
         AV83MtsEntF = AV83MtsEntF.add(AV35TotMtsEnt) ;
         AV84MtsSalF = AV84MtsSalF.add(AV34TotMtsSal) ;
         AV64TotKDif = DecimalUtil.doubleToDec(0) ;
         AV36TotKDifN = DecimalUtil.doubleToDec(0) ;
         AV32TotKgsEnt = DecimalUtil.doubleToDec(0) ;
         AV33TotKgsSal = DecimalUtil.doubleToDec(0) ;
         AV65TotMDif = DecimalUtil.doubleToDec(0) ;
         AV37TotMDifN = DecimalUtil.doubleToDec(0) ;
         AV35TotMtsEnt = DecimalUtil.doubleToDec(0) ;
         AV34TotMtsSal = DecimalUtil.doubleToDec(0) ;
      }
   }

   public void S125( ) throws ProcessInterruptedException
   {
      /* 'BUSCA_CORTES' Routine */
      returnInSub = false ;
      AV72ArtNumCor = (short)(0) ;
      /* Using cursor P07EW8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV73CliCod), AV74ArtCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A65ArtCod = P07EW8_A65ArtCod[0] ;
         A252CliCod = P07EW8_A252CliCod[0] ;
         n252CliCod = P07EW8_n252CliCod[0] ;
         A3121ArtNumCor = P07EW8_A3121ArtNumCor[0] ;
         n3121ArtNumCor = P07EW8_n3121ArtNumCor[0] ;
         AV72ArtNumCor = A3121ArtNumCor ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void h7EW0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit1, "")), 807, Gx_line+7, 844, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 858, Gx_line+7, 917, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit2, "")), 939, Gx_line+7, 969, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 990, Gx_line+7, 1049, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit0, "")), 7, Gx_line+33, 132, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit3, "")), 939, Gx_line+32, 984, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1004, Gx_line+32, 1049, Gx_line+49, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit19, "")), 454, Gx_line+67, 491, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit20, "")), 851, Gx_line+67, 896, Gx_line+84, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 617, Gx_line+83, 625, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 1009, Gx_line+83, 1017, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit13, "")), 335, Gx_line+83, 387, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit14, "")), 422, Gx_line+83, 474, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit15, "")), 554, Gx_line+83, 591, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit16, "")), 733, Gx_line+83, 785, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit17, "")), 843, Gx_line+83, 895, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit18, "")), 946, Gx_line+83, 983, Gx_line+100, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(1, Gx_line+56, 1057, Gx_line+56, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67NomEmp, "")), 7, Gx_line+7, 227, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+102, 1060, Gx_line+102, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(554, Gx_line+74, 643, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(284, Gx_line+74, 376, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(682, Gx_line+74, 774, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(951, Gx_line+74, 1035, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94Pgmname, "")), 807, Gx_line+32, 1027, Gx_line+49, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+106) ;
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
      AV15ImpCod = "" ;
      AV20PSerCod = "" ;
      AV21USerCod = "" ;
      AV22PColor = "" ;
      AV23UColor = "" ;
      AV26PDisCli = "" ;
      AV27UDisCli = "" ;
      AV28PFecha = GXutil.nullDate() ;
      AV29UFecha = GXutil.nullDate() ;
      AV38Lit0 = "" ;
      AV39Lit1 = "" ;
      AV40Lit2 = "" ;
      AV41Lit3 = "" ;
      AV42Lit4 = "" ;
      AV43Lit5 = "" ;
      AV44Lit6 = "" ;
      AV45Lit7 = "" ;
      AV46Lit8 = "" ;
      AV47Lit9 = "" ;
      AV48Lit10 = "" ;
      AV49Lit11 = "" ;
      AV50Lit12 = "" ;
      AV51Lit13 = "" ;
      AV52Lit14 = "" ;
      AV53Lit15 = "" ;
      AV54Lit16 = "" ;
      AV55Lit17 = "" ;
      AV56Lit18 = "" ;
      AV57Lit19 = "" ;
      AV58Lit20 = "" ;
      AV59Lit21 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      scmdbuf = "" ;
      P07EW2_A396EmprCod = new String[] {""} ;
      P07EW2_A407EmprNom = new String[] {""} ;
      P07EW2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV67NomEmp = "" ;
      AV32TotKgsEnt = DecimalUtil.ZERO ;
      AV33TotKgsSal = DecimalUtil.ZERO ;
      AV35TotMtsEnt = DecimalUtil.ZERO ;
      AV34TotMtsSal = DecimalUtil.ZERO ;
      P07EW3_A396EmprCod = new String[] {""} ;
      P07EW3_A252CliCod = new int[1] ;
      P07EW3_n252CliCod = new boolean[] {false} ;
      P07EW3_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      AV80CliNom = "" ;
      AV64TotKDif = DecimalUtil.ZERO ;
      AV82KgsSalF = DecimalUtil.ZERO ;
      AV81KgsEntF = DecimalUtil.ZERO ;
      AV61PorKgs = DecimalUtil.ZERO ;
      AV65TotMDif = DecimalUtil.ZERO ;
      AV84MtsSalF = DecimalUtil.ZERO ;
      AV83MtsEntF = DecimalUtil.ZERO ;
      AV63PorMts = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      P07EW5_A396EmprCod = new String[] {""} ;
      P07EW5_A130BarCodPar = new String[] {""} ;
      P07EW5_A132BarCodReo = new byte[1] ;
      P07EW5_A129BarCod = new int[1] ;
      P07EW5_A213BarSit = new byte[1] ;
      P07EW5_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P07EW5_A143BarDisNum = new String[] {""} ;
      P07EW5_A136BarColNum = new int[1] ;
      P07EW5_A135BarColNom = new String[] {""} ;
      P07EW5_A212BarSer = new String[] {""} ;
      P07EW5_A217BarTipArt = new short[1] ;
      P07EW5_n217BarTipArt = new boolean[] {false} ;
      P07EW5_A252CliCod = new int[1] ;
      P07EW5_n252CliCod = new boolean[] {false} ;
      P07EW5_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EW5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EW5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV76Mts_s = DecimalUtil.ZERO ;
      AV77Kgs_s = DecimalUtil.ZERO ;
      AV78Albbar = DecimalUtil.ZERO ;
      P07EW6_A396EmprCod = new String[] {""} ;
      P07EW6_A129BarCod = new int[1] ;
      P07EW6_A132BarCodReo = new byte[1] ;
      P07EW6_A130BarCodPar = new String[] {""} ;
      P07EW6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EW6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EW6_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EW6_n2243BarKgsCli = new boolean[] {false} ;
      P07EW6_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EW6_A30AlbProCod = new long[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      AV86BarAlbKgmE = DecimalUtil.ZERO ;
      AV87BarAlbMtrE = DecimalUtil.ZERO ;
      c183BarMetLan = DecimalUtil.ZERO ;
      c170BarKilLan = DecimalUtil.ZERO ;
      P07EW7_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EW7_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV70BarKgm = DecimalUtil.ZERO ;
      AV74ArtCod = "" ;
      AV75BarMtrLan = DecimalUtil.ZERO ;
      AV36TotKDifN = DecimalUtil.ZERO ;
      AV37TotMDifN = DecimalUtil.ZERO ;
      P07EW8_A396EmprCod = new String[] {""} ;
      P07EW8_A65ArtCod = new String[] {""} ;
      P07EW8_A252CliCod = new int[1] ;
      P07EW8_n252CliCod = new boolean[] {false} ;
      P07EW8_A3121ArtNumCor = new short[1] ;
      P07EW8_n3121ArtNumCor = new boolean[] {false} ;
      A65ArtCod = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV94Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ral0002r__default(),
         new Object[] {
             new Object[] {
            P07EW2_A396EmprCod, P07EW2_A407EmprNom, P07EW2_n407EmprNom
            }
            , new Object[] {
            P07EW3_A396EmprCod, P07EW3_A252CliCod, P07EW3_A279CliNom
            }
            , new Object[] {
            P07EW5_A396EmprCod, P07EW5_A130BarCodPar, P07EW5_A132BarCodReo, P07EW5_A129BarCod, P07EW5_A213BarSit, P07EW5_A161BarFecSal, P07EW5_A143BarDisNum, P07EW5_A136BarColNum, P07EW5_A135BarColNom, P07EW5_A212BarSer,
            P07EW5_A217BarTipArt, P07EW5_n217BarTipArt, P07EW5_A252CliCod, P07EW5_n252CliCod, P07EW5_A2827BarKgsLot, P07EW5_A166BarKgm, P07EW5_A184BarMtr
            }
            , new Object[] {
            P07EW6_A396EmprCod, P07EW6_A129BarCod, P07EW6_A132BarCodReo, P07EW6_A130BarCodPar, P07EW6_A1261BarAlbKgmE, P07EW6_A1263BarAlbMtrE, P07EW6_A2243BarKgsCli, P07EW6_n2243BarKgsCli, P07EW6_A1461BarAlbPN, P07EW6_A30AlbProCod
            }
            , new Object[] {
            P07EW7_A183BarMetLan, P07EW7_A170BarKilLan
            }
            , new Object[] {
            P07EW8_A396EmprCod, P07EW8_A65ArtCod, P07EW8_A252CliCod, P07EW8_A3121ArtNumCor, P07EW8_n3121ArtNumCor
            }
         }
      );
      AV94Pgmname = "RAL0002r" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV94Pgmname = "RAL0002r" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV69FlagLamina ;
   private byte AV71NCorte ;
   private byte AV85Moda21 ;
   private byte GXt_int4 ;
   private byte GXv_int3[] ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV16PTipArt ;
   private short AV17UTipArt ;
   private short A217BarTipArt ;
   private short AV72ArtNumCor ;
   private short A3121ArtNumCor ;
   private short Gx_err ;
   private int AV18PCliCod ;
   private int AV19UCliCod ;
   private int AV24PColNum ;
   private int AV25UColNum ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV79Clicodi ;
   private int Gx_OldLine ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int AV73CliCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV32TotKgsEnt ;
   private java.math.BigDecimal AV33TotKgsSal ;
   private java.math.BigDecimal AV35TotMtsEnt ;
   private java.math.BigDecimal AV34TotMtsSal ;
   private java.math.BigDecimal AV64TotKDif ;
   private java.math.BigDecimal AV82KgsSalF ;
   private java.math.BigDecimal AV81KgsEntF ;
   private java.math.BigDecimal AV61PorKgs ;
   private java.math.BigDecimal AV65TotMDif ;
   private java.math.BigDecimal AV84MtsSalF ;
   private java.math.BigDecimal AV83MtsEntF ;
   private java.math.BigDecimal AV63PorMts ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV76Mts_s ;
   private java.math.BigDecimal AV77Kgs_s ;
   private java.math.BigDecimal AV78Albbar ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal AV86BarAlbKgmE ;
   private java.math.BigDecimal AV87BarAlbMtrE ;
   private java.math.BigDecimal c183BarMetLan ;
   private java.math.BigDecimal c170BarKilLan ;
   private java.math.BigDecimal AV70BarKgm ;
   private java.math.BigDecimal AV75BarMtrLan ;
   private java.math.BigDecimal AV36TotKDifN ;
   private java.math.BigDecimal AV37TotMDifN ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV20PSerCod ;
   private String AV21USerCod ;
   private String AV22PColor ;
   private String AV23UColor ;
   private String AV26PDisCli ;
   private String AV27UDisCli ;
   private String AV38Lit0 ;
   private String AV39Lit1 ;
   private String AV40Lit2 ;
   private String AV41Lit3 ;
   private String AV42Lit4 ;
   private String AV43Lit5 ;
   private String AV44Lit6 ;
   private String AV45Lit7 ;
   private String AV46Lit8 ;
   private String AV47Lit9 ;
   private String AV48Lit10 ;
   private String AV49Lit11 ;
   private String AV50Lit12 ;
   private String AV51Lit13 ;
   private String AV52Lit14 ;
   private String AV53Lit15 ;
   private String AV54Lit16 ;
   private String AV55Lit17 ;
   private String AV56Lit18 ;
   private String AV57Lit19 ;
   private String AV58Lit20 ;
   private String AV59Lit21 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV67NomEmp ;
   private String A279CliNom ;
   private String AV80CliNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String A130BarCodPar ;
   private String AV74ArtCod ;
   private String A65ArtCod ;
   private String Gx_time ;
   private String AV94Pgmname ;
   private java.util.Date AV28PFecha ;
   private java.util.Date AV29UFecha ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n2243BarKgsCli ;
   private boolean n3121ArtNumCor ;
   private IDataStoreProvider pr_default ;
   private String[] P07EW2_A396EmprCod ;
   private String[] P07EW2_A407EmprNom ;
   private boolean[] P07EW2_n407EmprNom ;
   private String[] P07EW3_A396EmprCod ;
   private int[] P07EW3_A252CliCod ;
   private boolean[] P07EW3_n252CliCod ;
   private String[] P07EW3_A279CliNom ;
   private String[] P07EW5_A396EmprCod ;
   private String[] P07EW5_A130BarCodPar ;
   private byte[] P07EW5_A132BarCodReo ;
   private int[] P07EW5_A129BarCod ;
   private byte[] P07EW5_A213BarSit ;
   private java.util.Date[] P07EW5_A161BarFecSal ;
   private String[] P07EW5_A143BarDisNum ;
   private int[] P07EW5_A136BarColNum ;
   private String[] P07EW5_A135BarColNom ;
   private String[] P07EW5_A212BarSer ;
   private short[] P07EW5_A217BarTipArt ;
   private boolean[] P07EW5_n217BarTipArt ;
   private int[] P07EW5_A252CliCod ;
   private boolean[] P07EW5_n252CliCod ;
   private java.math.BigDecimal[] P07EW5_A2827BarKgsLot ;
   private java.math.BigDecimal[] P07EW5_A166BarKgm ;
   private java.math.BigDecimal[] P07EW5_A184BarMtr ;
   private String[] P07EW6_A396EmprCod ;
   private int[] P07EW6_A129BarCod ;
   private byte[] P07EW6_A132BarCodReo ;
   private String[] P07EW6_A130BarCodPar ;
   private java.math.BigDecimal[] P07EW6_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P07EW6_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P07EW6_A2243BarKgsCli ;
   private boolean[] P07EW6_n2243BarKgsCli ;
   private java.math.BigDecimal[] P07EW6_A1461BarAlbPN ;
   private long[] P07EW6_A30AlbProCod ;
   private java.math.BigDecimal[] P07EW7_A183BarMetLan ;
   private java.math.BigDecimal[] P07EW7_A170BarKilLan ;
   private String[] P07EW8_A396EmprCod ;
   private String[] P07EW8_A65ArtCod ;
   private int[] P07EW8_A252CliCod ;
   private boolean[] P07EW8_n252CliCod ;
   private short[] P07EW8_A3121ArtNumCor ;
   private boolean[] P07EW8_n3121ArtNumCor ;
}

final  class ral0002r__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07EW5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV16PTipArt ,
                                          short AV17UTipArt ,
                                          String AV20PSerCod ,
                                          String AV21USerCod ,
                                          String AV22PColor ,
                                          String AV23UColor ,
                                          int AV24PColNum ,
                                          int AV25UColNum ,
                                          String AV26PDisCli ,
                                          String AV27UDisCli ,
                                          short A217BarTipArt ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A143BarDisNum ,
                                          java.util.Date A161BarFecSal ,
                                          java.util.Date AV28PFecha ,
                                          java.util.Date AV29UFecha ,
                                          byte A213BarSit ,
                                          String A396EmprCod ,
                                          int AV79Clicodi ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[14];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSit, T1.BarFecSal, T1.BarDisNum, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarTipArt, T1.CliCod," ;
      scmdbuf += " T1.BarKgsLot, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.BarFecSal >= ? and T1.BarFecSal <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      if ( ! (0==AV16PTipArt) && ! (0==AV17UTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ? and T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV20PSerCod)==0) && ! (GXutil.strcmp("", AV21USerCod)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ? and T1.BarSer <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22PColor)==0) && ! (GXutil.strcmp("", AV23UColor)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ? and T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (0==AV24PColNum) && ! (0==AV25UColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ? and T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26PDisCli)==0) && ! (GXutil.strcmp("", AV27UDisCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ? and T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
         GXv_int5[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 2 :
                  return conditional_P07EW5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07EW2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07EW3", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ? and CliCod >= ?) AND (CliCod <= ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EW5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EW6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE, BarAlbMtrE, BarKgsCli, BarAlbPN, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EW7", "SELECT SUM(BarMetLan), SUM(BarKilLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EW8", "SELECT EmprCod, ArtCod, CliCod, ArtNumCor FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((long[]) buf[9])[0] = rslt.getLong(9);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
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
               return;
      }
   }

}

