package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rhrhr021_impl extends GXWebReport
{
   public rhrhr021_impl( com.genexus.internet.HttpContext context )
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
         AV10EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV11BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            AV12BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            AV13BarCodPar = httpContext.GetPar( "BarCodPar") ;
            AV87HRENUMCIE = (byte)(GXutil.lval( httpContext.GetPar( "HRENUMCIE"))) ;
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
      M_bot = 2 ;
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
         P_lines = (int)(gxYPage-(lineHeight*2)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV71Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char2[0] ;
         AV71Station = GXt_char1 ;
         GXv_char2[0] = AV10EmprCod ;
         GXv_char3[0] = AV74EmprNom ;
         GXv_char4[0] = AV72UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char2, GXv_char3, GXv_char4) ;
         rhrhr021_impl.this.AV10EmprCod = GXv_char2[0] ;
         rhrhr021_impl.this.AV74EmprNom = GXv_char3[0] ;
         rhrhr021_impl.this.AV72UsurCod = GXv_char4[0] ;
         GXt_int5 = AV94F_laundry ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "LAUNDR", ""), GXv_int6) ;
         rhrhr021_impl.this.GXt_int5 = GXv_int6[0] ;
         AV94F_laundry = GXt_int5 ;
         GXt_char1 = AV44Lit0 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV120Pgmname, (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV44Lit0 = GXt_char1 ;
         GXt_char1 = AV45Lit1 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV45Lit1 = GXt_char1 ;
         GXt_char1 = AV46Lit2 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV46Lit2 = GXt_char1 ;
         GXt_char1 = AV47Lit3 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV47Lit3 = GXt_char1 ;
         GXt_char1 = AV48Lit4 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV48Lit4 = GXt_char1 ;
         GXt_char1 = AV49Lit5 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV49Lit5 = GXt_char1 ;
         GXt_char1 = AV50Lit6 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV50Lit6 = GXt_char1 ;
         GXt_char1 = AV51Lit7 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2458_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV51Lit7 = GXt_char1 ;
         GXt_char1 = AV52Lit8 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV52Lit8 = GXt_char1 ;
         GXt_char1 = AV53Lit9 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1199_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV53Lit9 = GXt_char1 ;
         GXt_char1 = AV54Lit10 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1150_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV54Lit10 = GXt_char1 ;
         GXt_char1 = AV55Lit11 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV55Lit11 = GXt_char1 ;
         GXt_char1 = AV56Lit12 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV56Lit12 = GXt_char1 ;
         GXt_char1 = AV57Lit13 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3016_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV57Lit13 = GXt_char1 ;
         GXt_char1 = AV58Lit14 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV58Lit14 = GXt_char1 ;
         GXt_char1 = AV59Lit15 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3018_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV59Lit15 = GXt_char1 ;
         GXt_char1 = AV60Lit16 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3019_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV60Lit16 = GXt_char1 ;
         GXt_char1 = AV61Lit17 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3020_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV61Lit17 = GXt_char1 ;
         GXt_char1 = AV62Lit18 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3021_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV62Lit18 = GXt_char1 ;
         GXt_char1 = AV63Lit19 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV63Lit19 = GXt_char1 ;
         GXt_char1 = AV64Lit20 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1546_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV64Lit20 = GXt_char1 ;
         GXt_char1 = AV65Lit21 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3017_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV65Lit21 = GXt_char1 ;
         GXt_char1 = AV66Lit22 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3022_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV66Lit22 = GXt_char1 ;
         GXt_char1 = AV67Lit23 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV67Lit23 = GXt_char1 ;
         GXt_char1 = AV68Lit24 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3023_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV68Lit24 = GXt_char1 ;
         GXt_char1 = AV73Lit25 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN813_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV73Lit25 = GXt_char1 ;
         GXt_char1 = AV82Lit26 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV82Lit26 = GXt_char1 ;
         GXt_char1 = AV83Lit27 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV83Lit27 = GXt_char1 ;
         GXt_char1 = AV90Lit28 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN038", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV90Lit28 = GXt_char1 ;
         GXt_char1 = AV92Lit29 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1311_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV92Lit29 = GXt_char1 ;
         GXt_char1 = AV93Lit30 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV93Lit30 = GXt_char1 ;
         GXt_char1 = AV102Lit40 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN674_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV102Lit40 = GXt_char1 ;
         GXt_char1 = AV104Lit50 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV104Lit50 = GXt_char1 ;
         AV105Lit51 = httpContext.getMessage( "Inicial", "") ;
         AV106Lit52 = httpContext.getMessage( "Final", "") ;
         GXt_char1 = AV115lit54 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1127_", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV115lit54 = GXt_char1 ;
         GXt_char1 = AV107Lit53 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char4) ;
         rhrhr021_impl.this.GXt_char1 = GXv_char4[0] ;
         AV107Lit53 = GXt_char1 ;
         GXt_int5 = (byte)(DecimalUtil.decToDouble(AV110Intexco)) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
         rhrhr021_impl.this.GXt_int5 = GXv_int6[0] ;
         AV110Intexco = DecimalUtil.doubleToDec(GXt_int5) ;
         GXt_int5 = AV114Divpor1000 ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, "100000", GXv_int6) ;
         rhrhr021_impl.this.GXt_int5 = GXv_int6[0] ;
         AV114Divpor1000 = GXt_int5 ;
         /* Using cursor P07EK2 */
         pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, AV110Intexco});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P07EK2_A130BarCodPar[0] ;
            A132BarCodReo = P07EK2_A132BarCodReo[0] ;
            A129BarCod = P07EK2_A129BarCod[0] ;
            A396EmprCod = P07EK2_A396EmprCod[0] ;
            A970ProceCod = P07EK2_A970ProceCod[0] ;
            n970ProceCod = P07EK2_n970ProceCod[0] ;
            A44AlbRecCod = P07EK2_A44AlbRecCod[0] ;
            A971ProceNom = P07EK2_A971ProceNom[0] ;
            n971ProceNom = P07EK2_n971ProceNom[0] ;
            A200BarPieCod = P07EK2_A200BarPieCod[0] ;
            A970ProceCod = P07EK2_A970ProceCod[0] ;
            n970ProceCod = P07EK2_n970ProceCod[0] ;
            A971ProceNom = P07EK2_A971ProceNom[0] ;
            n971ProceNom = P07EK2_n971ProceNom[0] ;
            AV109ProceNom = A971ProceNom ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P07EK3 */
         pr_default.execute(1, new Object[] {AV10EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P07EK3_A396EmprCod[0] ;
            A407EmprNom = P07EK3_A407EmprNom[0] ;
            n407EmprNom = P07EK3_n407EmprNom[0] ;
            AV36NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV8Termin = context.getWorkstationId( remoteHandle) ;
         /* Using cursor P07EK4 */
         pr_default.execute(2, new Object[] {AV8Termin});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A942TermCod = P07EK4_A942TermCod[0] ;
            A1189TermUsu = P07EK4_A1189TermUsu[0] ;
            n1189TermUsu = P07EK4_n1189TermUsu[0] ;
            AV9TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV91LinMaq = (short)(0) ;
         GxHdr5 = true ;
         /* Using cursor P07EK5 */
         pr_default.execute(3, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A4542HreTotKgm = P07EK5_A4542HreTotKgm[0] ;
            n4542HreTotKgm = P07EK5_n4542HreTotKgm[0] ;
            A4544HreTotPie = P07EK5_A4544HreTotPie[0] ;
            n4544HreTotPie = P07EK5_n4544HreTotPie[0] ;
            A4545HreLinMaq = P07EK5_A4545HreLinMaq[0] ;
            A4495HreNumCie = P07EK5_A4495HreNumCie[0] ;
            A4494HreBarPar = P07EK5_A4494HreBarPar[0] ;
            A4493HreBarReo = P07EK5_A4493HreBarReo[0] ;
            A4492HreBarCod = P07EK5_A4492HreBarCod[0] ;
            A396EmprCod = P07EK5_A396EmprCod[0] ;
            A9804HreAcab = P07EK5_A9804HreAcab[0] ;
            n9804HreAcab = P07EK5_n9804HreAcab[0] ;
            A13451HreComp2 = P07EK5_A13451HreComp2[0] ;
            n13451HreComp2 = P07EK5_n13451HreComp2[0] ;
            A13450HreComp1 = P07EK5_A13450HreComp1[0] ;
            n13450HreComp1 = P07EK5_n13450HreComp1[0] ;
            A1094HreNPrg = P07EK5_A1094HreNPrg[0] ;
            n1094HreNPrg = P07EK5_n1094HreNPrg[0] ;
            A4960HreFecAlt = P07EK5_A4960HreFecAlt[0] ;
            n4960HreFecAlt = P07EK5_n4960HreFecAlt[0] ;
            A4863HreUsrCod = P07EK5_A4863HreUsrCod[0] ;
            n4863HreUsrCod = P07EK5_n4863HreUsrCod[0] ;
            A4543HreTotMtr = P07EK5_A4543HreTotMtr[0] ;
            n4543HreTotMtr = P07EK5_n4543HreTotMtr[0] ;
            A4546HreMaqCod = P07EK5_A4546HreMaqCod[0] ;
            n4546HreMaqCod = P07EK5_n4546HreMaqCod[0] ;
            A4547HreVolPrd = P07EK5_A4547HreVolPrd[0] ;
            n4547HreVolPrd = P07EK5_n4547HreVolPrd[0] ;
            A4540HreIntDsc = P07EK5_A4540HreIntDsc[0] ;
            n4540HreIntDsc = P07EK5_n4540HreIntDsc[0] ;
            A4526HreTipColN = P07EK5_A4526HreTipColN[0] ;
            n4526HreTipColN = P07EK5_n4526HreTipColN[0] ;
            A4525HreTipCol = P07EK5_A4525HreTipCol[0] ;
            n4525HreTipCol = P07EK5_n4525HreTipCol[0] ;
            A4522HreColNum = P07EK5_A4522HreColNum[0] ;
            n4522HreColNum = P07EK5_n4522HreColNum[0] ;
            A4521HreColNom = P07EK5_A4521HreColNom[0] ;
            n4521HreColNom = P07EK5_n4521HreColNom[0] ;
            A4518HreBarDsc = P07EK5_A4518HreBarDsc[0] ;
            n4518HreBarDsc = P07EK5_n4518HreBarDsc[0] ;
            A4517HreBarSer = P07EK5_A4517HreBarSer[0] ;
            n4517HreBarSer = P07EK5_n4517HreBarSer[0] ;
            A279CliNom = P07EK5_A279CliNom[0] ;
            A252CliCod = P07EK5_A252CliCod[0] ;
            n252CliCod = P07EK5_n252CliCod[0] ;
            A4542HreTotKgm = P07EK5_A4542HreTotKgm[0] ;
            n4542HreTotKgm = P07EK5_n4542HreTotKgm[0] ;
            A4544HreTotPie = P07EK5_A4544HreTotPie[0] ;
            n4544HreTotPie = P07EK5_n4544HreTotPie[0] ;
            A13451HreComp2 = P07EK5_A13451HreComp2[0] ;
            n13451HreComp2 = P07EK5_n13451HreComp2[0] ;
            A13450HreComp1 = P07EK5_A13450HreComp1[0] ;
            n13450HreComp1 = P07EK5_n13450HreComp1[0] ;
            A4543HreTotMtr = P07EK5_A4543HreTotMtr[0] ;
            n4543HreTotMtr = P07EK5_n4543HreTotMtr[0] ;
            A4540HreIntDsc = P07EK5_A4540HreIntDsc[0] ;
            n4540HreIntDsc = P07EK5_n4540HreIntDsc[0] ;
            A4526HreTipColN = P07EK5_A4526HreTipColN[0] ;
            n4526HreTipColN = P07EK5_n4526HreTipColN[0] ;
            A4525HreTipCol = P07EK5_A4525HreTipCol[0] ;
            n4525HreTipCol = P07EK5_n4525HreTipCol[0] ;
            A4522HreColNum = P07EK5_A4522HreColNum[0] ;
            n4522HreColNum = P07EK5_n4522HreColNum[0] ;
            A4521HreColNom = P07EK5_A4521HreColNom[0] ;
            n4521HreColNom = P07EK5_n4521HreColNom[0] ;
            A4518HreBarDsc = P07EK5_A4518HreBarDsc[0] ;
            n4518HreBarDsc = P07EK5_n4518HreBarDsc[0] ;
            A4517HreBarSer = P07EK5_A4517HreBarSer[0] ;
            n4517HreBarSer = P07EK5_n4517HreBarSer[0] ;
            A252CliCod = P07EK5_A252CliCod[0] ;
            n252CliCod = P07EK5_n252CliCod[0] ;
            A279CliNom = P07EK5_A279CliNom[0] ;
            AV99HreMaqCod = A4546HreMaqCod ;
            /* Execute user subroutine: 'MAQUIN' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(3);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV19RelBany = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(A4547HreVolPrd).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)), 0))) ;
            AV42CosteT1 = DecimalUtil.doubleToDec(0) ;
            AV43CosteT2 = DecimalUtil.doubleToDec(0) ;
            AV98Tiempo_t = (short)(0) ;
            /* Using cursor P07EK6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4550HreLinPro = P07EK6_A4550HreLinPro[0] ;
               A4551HreProCod = P07EK6_A4551HreProCod[0] ;
               A4966HreVolPro = P07EK6_A4966HreVolPro[0] ;
               A4552HreProDsc = P07EK6_A4552HreProDsc[0] ;
               if ( ( AV91LinMaq != A4545HreLinMaq ) && ( AV91LinMaq != 0 ) )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV91LinMaq = A4545HreLinMaq ;
               AV97HreProCod = A4551HreProCod ;
               /* Execute user subroutine: 'CPROFO' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               h7EK0( false, 28) ;
               getPrinter().GxDrawRect(7, Gx_line+5, 731, Gx_line+25, 2, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4551HreProCod, "")), 121, Gx_line+6, 166, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4552HreProDsc, "")), 171, Gx_line+6, 422, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit19, "")), 48, Gx_line+6, 116, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Lit29, "")), 422, Gx_line+6, 490, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9")), 495, Gx_line+6, 529, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4966HreVolPro), "ZZZZ9")), 661, Gx_line+6, 704, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Lit30, "")), 575, Gx_line+6, 659, Gx_line+24, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
               AV31Coste1 = DecimalUtil.doubleToDec(0) ;
               AV32Coste2 = DecimalUtil.doubleToDec(0) ;
               AV30CosteA1 = DecimalUtil.doubleToDec(0) ;
               AV29CosteP1 = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P07EK7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A719PrdNum = P07EK7_A719PrdNum[0] ;
                  n719PrdNum = P07EK7_n719PrdNum[0] ;
                  A4967HrePrePrd = P07EK7_A4967HrePrePrd[0] ;
                  n4967HrePrePrd = P07EK7_n4967HrePrePrd[0] ;
                  A4566HreForNro = P07EK7_A4566HreForNro[0] ;
                  n4566HreForNro = P07EK7_n4566HreForNro[0] ;
                  A4563HrePrdCant = P07EK7_A4563HrePrdCant[0] ;
                  n4563HrePrdCant = P07EK7_n4563HrePrdCant[0] ;
                  A4565HreCanAny = P07EK7_A4565HreCanAny[0] ;
                  n4565HreCanAny = P07EK7_n4565HreCanAny[0] ;
                  A4558HrePrdNum = P07EK7_A4558HrePrdNum[0] ;
                  n4558HrePrdNum = P07EK7_n4558HrePrdNum[0] ;
                  A4561HrePrdUDs = P07EK7_A4561HrePrdUDs[0] ;
                  n4561HrePrdUDs = P07EK7_n4561HrePrdUDs[0] ;
                  A4560HrePrdUMe = P07EK7_A4560HrePrdUMe[0] ;
                  n4560HrePrdUMe = P07EK7_n4560HrePrdUMe[0] ;
                  A4562HreFacCon = P07EK7_A4562HreFacCon[0] ;
                  n4562HreFacCon = P07EK7_n4562HreFacCon[0] ;
                  A5726HreLote = P07EK7_A5726HreLote[0] ;
                  n5726HreLote = P07EK7_n5726HreLote[0] ;
                  A4559HrePrdDsc = P07EK7_A4559HrePrdDsc[0] ;
                  n4559HrePrdDsc = P07EK7_n4559HrePrdDsc[0] ;
                  A4557HreRecLin = P07EK7_A4557HreRecLin[0] ;
                  AV89PrdNum = A719PrdNum ;
                  /* Execute user subroutine: 'PRODUC' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(5);
                     pr_default.close(4);
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(3);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV86PrdPreAct = A4967HrePrePrd ;
                  AV76PrdCFin = DecimalUtil.doubleToDec(0) ;
                  AV112hrelinmaq = A4545HreLinMaq ;
                  AV116HreForNro = A4566HreForNro ;
                  /* Execute user subroutine: 'HISREA' */
                  S141 ();
                  if ( returnInSub )
                  {
                     pr_default.close(5);
                     pr_default.close(4);
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(3);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV31Coste1 = GXutil.roundDecimal( A4563HrePrdCant.multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV32Coste2 = GXutil.roundDecimal( (A4563HrePrdCant.add((A4565HreCanAny.add(AV76PrdCFin)))).multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV33CantFinal = A4563HrePrdCant.add(A4565HreCanAny).add(AV76PrdCFin) ;
                  AV40CodPrd = GXutil.substring( A4558HrePrdNum, 1, 1) ;
                  AV108Und = GXutil.substring( A4561HrePrdUDs, 1, 3) ;
                  AV39Unidades = A4561HrePrdUDs ;
                  if ( AV114Divpor1000 == 0 )
                  {
                     AV39Unidades = ((A4560HrePrdUMe==3) ? httpContext.getMessage( "g", "") : ((A4560HrePrdUMe==2) ? httpContext.getMessage( "cc", "") : httpContext.getMessage( "g", ""))) ;
                  }
                  else
                  {
                     AV39Unidades = ((A4560HrePrdUMe==1)||(A4560HrePrdUMe==3) ? httpContext.getMessage( "kg", "") : httpContext.getMessage( "lt", "")) ;
                  }
                  AV37PrdCant = ((AV114Divpor1000==0) ? A4563HrePrdCant : A4563HrePrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  AV38PrdCanAny = ((A4565HreCanAny.doubleValue()>0) ? (A4563HrePrdCant.add(A4565HreCanAny).add(AV76PrdCFin)) : ((AV76PrdCFin.doubleValue()>0) ? (A4563HrePrdCant.add(AV76PrdCFin)) : A4563HrePrdCant)) ;
                  AV38PrdCanAny = ((AV114Divpor1000==0) ? AV38PrdCanAny : AV38PrdCanAny.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  AV103HREFACCON = A4562HreFacCon ;
                  AV40CodPrd = GXutil.substring( A4558HrePrdNum, 1, 1) ;
                  AV111Lote10 = GXutil.substring( A5726HreLote, 1, 10) ;
                  if ( ( GXutil.strcmp(A4559HrePrdDsc, httpContext.getMessage( "AGUA", "")) == 0 ) && ( AV94F_laundry == 1 ) )
                  {
                  }
                  else
                  {
                     if ( GXutil.strcmp(AV40CodPrd, " ") == 0 )
                     {
                        h7EK0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 11, Gx_line+0, 56, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 63, Gx_line+0, 254, Gx_line+16, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(AV40CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "0") == 0 ) )
                        {
                           h7EK0( false, 16) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 11, Gx_line+0, 56, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 63, Gx_line+0, 254, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37PrdCant, "ZZZZ9.9999")), 348, Gx_line+0, 422, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31Coste1, "ZZZZZZ9.99")), 586, Gx_line+0, 660, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Coste2, "ZZZZZZ9.99")), 664, Gx_line+0, 738, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZ9.9999")), 467, Gx_line+0, 541, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 429, Gx_line+0, 459, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 554, Gx_line+0, 584, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV103HREFACCON, "ZZ9.99999")), 255, Gx_line+0, 322, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108Und, "")), 324, Gx_line+1, 347, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Calibri", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Lote10, "")), 744, Gx_line+0, 808, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+16) ;
                        }
                        else
                        {
                           h7EK0( false, 16) ;
                           getPrinter().GxAttris("Courier New", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 63, Gx_line+0, 254, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37PrdCant, "ZZZZ9.9999")), 348, Gx_line+0, 422, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31Coste1, "ZZZZZZ9.99")), 586, Gx_line+0, 660, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Coste2, "ZZZZZZ9.99")), 664, Gx_line+0, 738, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZ9.9999")), 467, Gx_line+0, 541, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 429, Gx_line+0, 459, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 554, Gx_line+0, 584, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 11, Gx_line+0, 56, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV103HREFACCON, "ZZ9.99999")), 255, Gx_line+0, 322, Gx_line+16, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108Und, "")), 324, Gx_line+1, 347, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Calibri", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Lote10, "")), 744, Gx_line+0, 808, Gx_line+16, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+16) ;
                        }
                     }
                  }
                  AV29CosteP1 = AV29CosteP1.add(GXutil.roundDecimal( A4563HrePrdCant.multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                  AV30CosteA1 = AV30CosteA1.add(GXutil.roundDecimal( (A4563HrePrdCant.add(A4565HreCanAny).add(AV76PrdCFin)).multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               AV34CosteK1 = GXutil.roundDecimal( AV29CosteP1.divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
               AV35CosteK2 = GXutil.roundDecimal( AV30CosteA1.divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
               if ( AV94F_laundry == 1 )
               {
                  AV95CostePz1 = DecimalUtil.doubleToDec(0) ;
                  AV96CostePz2 = DecimalUtil.doubleToDec(0) ;
                  if ( A4544HreTotPie > 0 )
                  {
                     AV95CostePz1 = GXutil.roundDecimal( AV29CosteP1.divide(DecimalUtil.doubleToDec(A4544HreTotPie), 18, java.math.RoundingMode.DOWN), 2) ;
                     AV96CostePz2 = GXutil.roundDecimal( AV30CosteA1.divide(DecimalUtil.doubleToDec(A4544HreTotPie), 18, java.math.RoundingMode.DOWN), 2) ;
                  }
               }
               h7EK0( false, 59) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30CosteA1, "ZZZZZZ9.99")), 664, Gx_line+9, 738, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29CosteP1, "ZZZZZZ9.99")), 586, Gx_line+9, 660, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34CosteK1, "ZZZZZZ9.99")), 586, Gx_line+30, 660, Gx_line+48, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35CosteK2, "ZZZZZZ9.99")), 664, Gx_line+30, 738, Gx_line+48, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(400, Gx_line+4, 759, Gx_line+54, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit20, "")), 416, Gx_line+9, 509, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit21, "")), 416, Gx_line+30, 534, Gx_line+48, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+59) ;
               if ( AV94F_laundry == 1 )
               {
                  h7EK0( false, 25) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95CostePz1, "ZZZZZZ9.99")), 586, Gx_line+4, 660, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV96CostePz2, "ZZZZZZ9.99")), 664, Gx_line+4, 738, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Coste p/Prenda", ""), 418, Gx_line+4, 536, Gx_line+21, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+25) ;
               }
               AV42CosteT1 = AV42CosteT1.add(AV29CosteP1) ;
               AV43CosteT2 = AV43CosteT2.add(AV30CosteA1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV84Pesaje = (byte)(0) ;
            /* Using cursor P07EK8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A4508HreLinMAL = P07EK8_A4508HreLinMAL[0] ;
               A719PrdNum = P07EK8_A719PrdNum[0] ;
               n719PrdNum = P07EK8_n719PrdNum[0] ;
               A4509HreNumAny = P07EK8_A4509HreNumAny[0] ;
               AV84Pesaje = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            if ( AV84Pesaje == 1 )
            {
               AV32Coste2 = DecimalUtil.doubleToDec(0) ;
               AV30CosteA1 = DecimalUtil.doubleToDec(0) ;
               h7EK0( false, 20) ;
               getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Lit28, "")), 11, Gx_line+0, 194, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               /* Using cursor P07EK9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A4508HreLinMAL = P07EK9_A4508HreLinMAL[0] ;
                  A724PrdPreAct = P07EK9_A724PrdPreAct[0] ;
                  A707PrdFacCon = P07EK9_A707PrdFacCon[0] ;
                  A4511HrePrdCFin = P07EK9_A4511HrePrdCFin[0] ;
                  n4511HrePrdCFin = P07EK9_n4511HrePrdCFin[0] ;
                  A5808HreLanyLot = P07EK9_A5808HreLanyLot[0] ;
                  n5808HreLanyLot = P07EK9_n5808HreLanyLot[0] ;
                  A718PrdNom = P07EK9_A718PrdNom[0] ;
                  A719PrdNum = P07EK9_A719PrdNum[0] ;
                  n719PrdNum = P07EK9_n719PrdNum[0] ;
                  A4509HreNumAny = P07EK9_A4509HreNumAny[0] ;
                  A724PrdPreAct = P07EK9_A724PrdPreAct[0] ;
                  A707PrdFacCon = P07EK9_A707PrdFacCon[0] ;
                  A718PrdNom = P07EK9_A718PrdNom[0] ;
                  AV86PrdPreAct = A724PrdPreAct ;
                  AV31Coste1 = DecimalUtil.doubleToDec(0) ;
                  AV32Coste2 = GXutil.roundDecimal( A4511HrePrdCFin.multiply(AV86PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV40CodPrd = GXutil.substring( A719PrdNum, 1, 1) ;
                  AV37PrdCant = DecimalUtil.doubleToDec(0) ;
                  AV38PrdCanAny = A4511HrePrdCFin ;
                  AV40CodPrd = GXutil.substring( A719PrdNum, 1, 1) ;
                  AV111Lote10 = GXutil.substring( A5808HreLanyLot, 1, 10) ;
                  if ( ( GXutil.strcmp(AV40CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "0") == 0 ) )
                  {
                     h7EK0( false, 18) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 11, Gx_line+1, 56, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 63, Gx_line+1, 254, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZ9.9999")), 467, Gx_line+1, 541, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Coste2, "ZZZZZZ9.99")), 664, Gx_line+1, 738, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Calibri", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Lote10, "")), 744, Gx_line+0, 808, Gx_line+16, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     h7EK0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 63, Gx_line+0, 254, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 11, Gx_line+0, 56, Gx_line+16, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZ9.9999")), 467, Gx_line+0, 541, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Coste2, "ZZZZZZ9.99")), 664, Gx_line+0, 738, Gx_line+16, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Calibri", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Lote10, "")), 744, Gx_line+0, 808, Gx_line+16, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  AV29CosteP1 = AV29CosteP1.add(DecimalUtil.doubleToDec(0)) ;
                  AV30CosteA1 = AV30CosteA1.add(GXutil.roundDecimal( A4511HrePrdCFin.multiply(AV86PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               AV43CosteT2 = AV43CosteT2.add(AV30CosteA1) ;
            }
            AV34CosteK1 = GXutil.roundDecimal( AV42CosteT1.divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
            AV35CosteK2 = GXutil.roundDecimal( AV43CosteT2.divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
            if ( AV94F_laundry == 1 )
            {
               AV95CostePz1 = DecimalUtil.doubleToDec(0) ;
               AV96CostePz2 = DecimalUtil.doubleToDec(0) ;
               if ( A4544HreTotPie > 0 )
               {
                  AV95CostePz1 = GXutil.roundDecimal( AV42CosteT1.divide(DecimalUtil.doubleToDec(A4544HreTotPie), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV96CostePz2 = GXutil.roundDecimal( AV42CosteT1.divide(DecimalUtil.doubleToDec(A4544HreTotPie), 18, java.math.RoundingMode.DOWN), 2) ;
               }
               AV101CosteMaq = GXutil.roundDecimal( AV100MAQCOSMIN.multiply(DecimalUtil.doubleToDec(AV98Tiempo_t)), 2) ;
            }
            h7EK0( false, 63) ;
            getPrinter().GxDrawRect(400, Gx_line+8, 759, Gx_line+58, 1, 128, 128, 128, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43CosteT2, "ZZZZZZ9.99")), 664, Gx_line+14, 738, Gx_line+32, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42CosteT1, "ZZZZZZ9.99")), 586, Gx_line+14, 660, Gx_line+32, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34CosteK1, "ZZZZZZ9.99")), 586, Gx_line+34, 660, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35CosteK2, "ZZZZZZ9.99")), 664, Gx_line+34, 738, Gx_line+52, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit20, "")), 416, Gx_line+14, 509, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit21, "")), 416, Gx_line+34, 534, Gx_line+52, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+63) ;
            if ( AV94F_laundry == 1 )
            {
               h7EK0( false, 73) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Coste p/Prenda", ""), 416, Gx_line+11, 534, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95CostePz1, "ZZZZZZ9.99")), 586, Gx_line+11, 660, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV96CostePz2, "ZZZZZZ9.99")), 664, Gx_line+11, 738, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tiempo Formula", ""), 416, Gx_line+33, 534, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV98Tiempo_t), "ZZZ9")), 615, Gx_line+33, 645, Gx_line+49, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m.", ""), 652, Gx_line+33, 670, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Coste Maquina", ""), 416, Gx_line+54, 525, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV101CosteMaq, "ZZZZZZ9.99")), 576, Gx_line+54, 660, Gx_line+72, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+73) ;
            }
            AV81FlagAgr = (byte)(0) ;
            if ( GXutil.strcmp(A9804HreAcab, httpContext.getMessage( "S", "")) != 0 )
            {
               /* Using cursor P07EK10 */
               pr_default.execute(8, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A4495HreNumCie = P07EK10_A4495HreNumCie[0] ;
                  A4494HreBarPar = P07EK10_A4494HreBarPar[0] ;
                  A4493HreBarReo = P07EK10_A4493HreBarReo[0] ;
                  A4492HreBarCod = P07EK10_A4492HreBarCod[0] ;
                  A396EmprCod = P07EK10_A396EmprCod[0] ;
                  A4501HreAgrMtr = P07EK10_A4501HreAgrMtr[0] ;
                  A4505HreAgrDsc = P07EK10_A4505HreAgrDsc[0] ;
                  A4502HreAgrPie = P07EK10_A4502HreAgrPie[0] ;
                  A4500HreAgrKgm = P07EK10_A4500HreAgrKgm[0] ;
                  A4504HreAgrSer = P07EK10_A4504HreAgrSer[0] ;
                  A4499HreAgrPar = P07EK10_A4499HreAgrPar[0] ;
                  A4498HreAgrReo = P07EK10_A4498HreAgrReo[0] ;
                  A4497HreAgrCod = P07EK10_A4497HreAgrCod[0] ;
                  if ( AV81FlagAgr == 0 )
                  {
                     AV81FlagAgr = (byte)(1) ;
                     h7EK0( false, 41) ;
                     getPrinter().GxDrawLine(6, Gx_line+19, 746, Gx_line+19, 2, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit10, "")), 688, Gx_line+21, 733, Gx_line+37, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit9, "")), 535, Gx_line+21, 566, Gx_line+36, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit22, "")), 14, Gx_line+21, 95, Gx_line+37, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit23, "")), 238, Gx_line+21, 295, Gx_line+36, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit24, "")), 8, Gx_line+2, 104, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit5, "")), 108, Gx_line+21, 171, Gx_line+36, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Lit27, "")), 585, Gx_line+21, 659, Gx_line+37, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(14, Gx_line+38, 94, Gx_line+38, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(108, Gx_line+38, 225, Gx_line+38, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(238, Gx_line+38, 428, Gx_line+38, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(501, Gx_line+38, 567, Gx_line+38, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(585, Gx_line+38, 658, Gx_line+38, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(688, Gx_line+38, 732, Gx_line+38, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+41) ;
                  }
                  h7EK0( false, 16) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4497HreAgrCod), "ZZZZZZZ9")), 14, Gx_line+1, 73, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4498HreAgrReo), "9")), 75, Gx_line+1, 83, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4499HreAgrPar, "")), 86, Gx_line+1, 94, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4504HreAgrSer, "")), 108, Gx_line+1, 226, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4500HreAgrKgm, "ZZZZZ9.99")), 501, Gx_line+0, 568, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4502HreAgrPie), "ZZZ9")), 706, Gx_line+1, 736, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4505HreAgrDsc, "")), 238, Gx_line+0, 429, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4501HreAgrMtr, "ZZZZZ9.99")), 593, Gx_line+0, 660, Gx_line+16, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
                  pr_default.readNext(8);
               }
               pr_default.close(8);
            }
            else
            {
               /* Using cursor P07EK11 */
               pr_default.execute(9, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE)});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A4495HreNumCie = P07EK11_A4495HreNumCie[0] ;
                  A4494HreBarPar = P07EK11_A4494HreBarPar[0] ;
                  A4493HreBarReo = P07EK11_A4493HreBarReo[0] ;
                  A4492HreBarCod = P07EK11_A4492HreBarCod[0] ;
                  A396EmprCod = P07EK11_A396EmprCod[0] ;
                  A9990HreAcPie = P07EK11_A9990HreAcPie[0] ;
                  n9990HreAcPie = P07EK11_n9990HreAcPie[0] ;
                  A9989HreAcMtr = P07EK11_A9989HreAcMtr[0] ;
                  n9989HreAcMtr = P07EK11_n9989HreAcMtr[0] ;
                  A9988HreAcKgm = P07EK11_A9988HreAcKgm[0] ;
                  n9988HreAcKgm = P07EK11_n9988HreAcKgm[0] ;
                  A9993HreAcDsc = P07EK11_A9993HreAcDsc[0] ;
                  n9993HreAcDsc = P07EK11_n9993HreAcDsc[0] ;
                  A9992HreAcSer = P07EK11_A9992HreAcSer[0] ;
                  n9992HreAcSer = P07EK11_n9992HreAcSer[0] ;
                  A9987HreAcPar = P07EK11_A9987HreAcPar[0] ;
                  A9986HreAcReo = P07EK11_A9986HreAcReo[0] ;
                  A9985HreAcCod = P07EK11_A9985HreAcCod[0] ;
                  if ( AV81FlagAgr == 0 )
                  {
                     AV81FlagAgr = (byte)(1) ;
                     h7EK0( false, 41) ;
                     getPrinter().GxDrawLine(6, Gx_line+19, 746, Gx_line+19, 2, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit10, "")), 688, Gx_line+21, 733, Gx_line+37, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit9, "")), 535, Gx_line+21, 566, Gx_line+36, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit22, "")), 14, Gx_line+21, 95, Gx_line+37, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit23, "")), 238, Gx_line+21, 295, Gx_line+36, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit24, "")), 8, Gx_line+2, 104, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit5, "")), 108, Gx_line+21, 171, Gx_line+36, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Lit27, "")), 585, Gx_line+21, 659, Gx_line+37, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(14, Gx_line+38, 94, Gx_line+38, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(108, Gx_line+38, 225, Gx_line+38, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(238, Gx_line+38, 428, Gx_line+38, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(501, Gx_line+38, 567, Gx_line+38, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(585, Gx_line+38, 658, Gx_line+38, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(688, Gx_line+38, 732, Gx_line+38, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+41) ;
                  }
                  h7EK0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9985HreAcCod), "ZZZZZZZ9")), 14, Gx_line+0, 73, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9986HreAcReo), "9")), 75, Gx_line+0, 83, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9987HreAcPar, "")), 86, Gx_line+0, 94, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9992HreAcSer, "")), 108, Gx_line+1, 226, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9993HreAcDsc, "")), 238, Gx_line+0, 429, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9988HreAcKgm, "ZZZZZ9.99")), 501, Gx_line+0, 568, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9989HreAcMtr, "ZZZZZ9.99")), 593, Gx_line+0, 660, Gx_line+16, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9990HreAcPie), "ZZZZZ9")), 706, Gx_line+1, 751, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  pr_default.readNext(9);
               }
               pr_default.close(9);
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         GxHdr5 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7EK0( true, 0) ;
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
      /* 'PRODUC' Routine */
      returnInSub = false ;
      AV88PrdFacCon = DecimalUtil.doubleToDec(1) ;
      /* Using cursor P07EK12 */
      pr_default.execute(10, new Object[] {AV10EmprCod, AV89PrdNum});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A719PrdNum = P07EK12_A719PrdNum[0] ;
         n719PrdNum = P07EK12_n719PrdNum[0] ;
         A396EmprCod = P07EK12_A396EmprCod[0] ;
         A707PrdFacCon = P07EK12_A707PrdFacCon[0] ;
         AV88PrdFacCon = A707PrdFacCon ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CPROFO' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P07EK13 */
      pr_default.execute(11, new Object[] {AV10EmprCod, AV97HreProCod});
      c771ProForTie = P07EK13_A771ProForTie[0] ;
      pr_default.close(11);
      AV98Tiempo_t = (short)(AV98Tiempo_t+c771ProForTie) ;
      /* End optimized group. */
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV100MAQCOSMIN = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P07EK14 */
      pr_default.execute(12, new Object[] {AV10EmprCod, AV99HreMaqCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A602MaqCod = P07EK14_A602MaqCod[0] ;
         A396EmprCod = P07EK14_A396EmprCod[0] ;
         A605MaqCosMin = P07EK14_A605MaqCosMin[0] ;
         n605MaqCosMin = P07EK14_n605MaqCosMin[0] ;
         AV100MAQCOSMIN = A605MaqCosMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'HISREA' Routine */
      returnInSub = false ;
      AV76PrdCFin = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P07EK15 */
      pr_default.execute(13, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE), Short.valueOf(AV112hrelinmaq), AV89PrdNum});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A396EmprCod = P07EK15_A396EmprCod[0] ;
         A4492HreBarCod = P07EK15_A4492HreBarCod[0] ;
         A4493HreBarReo = P07EK15_A4493HreBarReo[0] ;
         A4494HreBarPar = P07EK15_A4494HreBarPar[0] ;
         A4495HreNumCie = P07EK15_A4495HreNumCie[0] ;
         A4508HreLinMAL = P07EK15_A4508HreLinMAL[0] ;
         A719PrdNum = P07EK15_A719PrdNum[0] ;
         n719PrdNum = P07EK15_n719PrdNum[0] ;
         A4514HreLanyNro = P07EK15_A4514HreLanyNro[0] ;
         n4514HreLanyNro = P07EK15_n4514HreLanyNro[0] ;
         A4511HrePrdCFin = P07EK15_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = P07EK15_n4511HrePrdCFin[0] ;
         A4509HreNumAny = P07EK15_A4509HreNumAny[0] ;
         if ( A4514HreLanyNro == AV116HreForNro )
         {
            AV76PrdCFin = AV76PrdCFin.add(A4511HrePrdCFin) ;
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void h7EK0( boolean bFoot ,
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
               getPrinter().GxDrawLine(9, Gx_line+3, 749, Gx_line+3, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70ContDsc, "")), 9, Gx_line+5, 88, Gx_line+21, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
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
            if ( GxHdr5 )
            {
               getPrinter().GxDrawRect(536, Gx_line+74, 748, Gx_line+236, 2, 128, 128, 128, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9")), 138, Gx_line+79, 206, Gx_line+97, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), 229, Gx_line+79, 238, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9")), 214, Gx_line+79, 223, Gx_line+97, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 116, Gx_line+107, 161, Gx_line+123, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 177, Gx_line+107, 397, Gx_line+123, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4517HreBarSer, "")), 116, Gx_line+130, 234, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4518HreBarDsc, "")), 248, Gx_line+130, 439, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4521HreColNom, "")), 116, Gx_line+168, 212, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4522HreColNum), "ZZZZZ9")), 215, Gx_line+168, 260, Gx_line+184, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4525HreTipCol), "Z9")), 308, Gx_line+168, 324, Gx_line+184, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4526HreTipColN, "")), 328, Gx_line+168, 519, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4540HreIntDsc, "")), 116, Gx_line+193, 336, Gx_line+209, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+65, 749, Gx_line+65, 3, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 669, Gx_line+15, 728, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 669, Gx_line+39, 714, Gx_line+55, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19RelBany), "ZZZ9")), 706, Gx_line+195, 740, Gx_line+213, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9")), 698, Gx_line+172, 741, Gx_line+190, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4544HreTotPie), "ZZZ9")), 690, Gx_line+127, 741, Gx_line+145, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4542HreTotKgm, "ZZZZZ9.99")), 665, Gx_line+83, 741, Gx_line+101, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(11, Gx_line+73, 384, Gx_line+102, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36NomEmp, "")), 14, Gx_line+15, 328, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4546HreMaqCod, "")), 690, Gx_line+150, 741, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit0, "")), 14, Gx_line+39, 328, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit1, "")), 583, Gx_line+15, 634, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit2, "")), 583, Gx_line+39, 634, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit3, "")), 18, Gx_line+79, 127, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit4, "")), 11, Gx_line+106, 79, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit5, "")), 11, Gx_line+129, 62, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit6, "")), 11, Gx_line+168, 62, Gx_line+186, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit7, "")), 285, Gx_line+168, 303, Gx_line+186, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit8, "")), 11, Gx_line+192, 104, Gx_line+210, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit10, "")), 546, Gx_line+127, 597, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit11, "")), 546, Gx_line+150, 605, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit12, "")), 546, Gx_line+172, 605, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit13, "")), 546, Gx_line+195, 680, Gx_line+213, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit9, "")), 546, Gx_line+83, 572, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit14, "")), 11, Gx_line+261, 253, Gx_line+279, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70ContDsc, "")), 432, Gx_line+2, 511, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit25, "")), 348, Gx_line+39, 432, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72UsurCod, "")), 449, Gx_line+39, 533, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 726, Gx_line+39, 744, Gx_line+53, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 717, Gx_line+39, 722, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit26, "")), 546, Gx_line+105, 630, Gx_line+123, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4543HreTotMtr, "ZZZZZ9.99")), 665, Gx_line+105, 741, Gx_line+123, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(11, Gx_line+283, 252, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(351, Gx_line+283, 458, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(464, Gx_line+283, 584, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(586, Gx_line+283, 659, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(664, Gx_line+283, 737, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+238, 817, Gx_line+238, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9")), 348, Gx_line+79, 366, Gx_line+97, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº C.", ""), 300, Gx_line+79, 343, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4863HreUsrCod, "")), 116, Gx_line+217, 175, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A4960HreFecAlt, "99/99/99 99:99:99"), 182, Gx_line+217, 307, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Lit40, "")), 11, Gx_line+217, 95, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Lit50, "")), 426, Gx_line+242, 500, Gx_line+260, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105Lit51, "")), 366, Gx_line+261, 440, Gx_line+279, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106Lit52, "")), 488, Gx_line+261, 562, Gx_line+279, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Lit53, "")), 625, Gx_line+242, 699, Gx_line+260, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105Lit51, "")), 586, Gx_line+261, 660, Gx_line+279, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106Lit52, "")), 664, Gx_line+261, 738, Gx_line+279, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 302, Gx_line+263, 347, Gx_line+280, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(280, Gx_line+283, 346, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109ProceNom, "")), 311, Gx_line+217, 531, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1094HreNPrg, "")), 696, Gx_line+217, 741, Gx_line+233, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Programa", ""), 546, Gx_line+217, 630, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 744, Gx_line+261, 774, Gx_line+278, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(744, Gx_line+283, 817, Gx_line+283, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115lit54, "")), 11, Gx_line+148, 103, Gx_line+165, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13450HreComp1, "")), 116, Gx_line+149, 270, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13451HreComp2, "")), 274, Gx_line+149, 428, Gx_line+165, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+294) ;
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
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV10EmprCod = "" ;
      AV13BarCodPar = "" ;
      AV71Station = "" ;
      GXv_char2 = new String[1] ;
      AV74EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV72UsurCod = "" ;
      AV44Lit0 = "" ;
      AV120Pgmname = "" ;
      AV45Lit1 = "" ;
      AV46Lit2 = "" ;
      AV47Lit3 = "" ;
      AV48Lit4 = "" ;
      AV49Lit5 = "" ;
      AV50Lit6 = "" ;
      AV51Lit7 = "" ;
      AV52Lit8 = "" ;
      AV53Lit9 = "" ;
      AV54Lit10 = "" ;
      AV55Lit11 = "" ;
      AV56Lit12 = "" ;
      AV57Lit13 = "" ;
      AV58Lit14 = "" ;
      AV59Lit15 = "" ;
      AV60Lit16 = "" ;
      AV61Lit17 = "" ;
      AV62Lit18 = "" ;
      AV63Lit19 = "" ;
      AV64Lit20 = "" ;
      AV65Lit21 = "" ;
      AV66Lit22 = "" ;
      AV67Lit23 = "" ;
      AV68Lit24 = "" ;
      AV73Lit25 = "" ;
      AV82Lit26 = "" ;
      AV83Lit27 = "" ;
      AV90Lit28 = "" ;
      AV92Lit29 = "" ;
      AV93Lit30 = "" ;
      AV102Lit40 = "" ;
      AV104Lit50 = "" ;
      AV105Lit51 = "" ;
      AV106Lit52 = "" ;
      AV115lit54 = "" ;
      AV107Lit53 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV110Intexco = DecimalUtil.ZERO ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P07EK2_A130BarCodPar = new String[] {""} ;
      P07EK2_A132BarCodReo = new byte[1] ;
      P07EK2_A129BarCod = new int[1] ;
      P07EK2_A396EmprCod = new String[] {""} ;
      P07EK2_A970ProceCod = new short[1] ;
      P07EK2_n970ProceCod = new boolean[] {false} ;
      P07EK2_A44AlbRecCod = new int[1] ;
      P07EK2_A971ProceNom = new String[] {""} ;
      P07EK2_n971ProceNom = new boolean[] {false} ;
      P07EK2_A200BarPieCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A971ProceNom = "" ;
      A200BarPieCod = "" ;
      AV109ProceNom = "" ;
      P07EK3_A396EmprCod = new String[] {""} ;
      P07EK3_A407EmprNom = new String[] {""} ;
      P07EK3_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV36NomEmp = "" ;
      AV8Termin = "" ;
      P07EK4_A942TermCod = new String[] {""} ;
      P07EK4_A1189TermUsu = new String[] {""} ;
      P07EK4_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV9TermUsu = "" ;
      P07EK5_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK5_n4542HreTotKgm = new boolean[] {false} ;
      P07EK5_A4544HreTotPie = new int[1] ;
      P07EK5_n4544HreTotPie = new boolean[] {false} ;
      P07EK5_A4545HreLinMaq = new short[1] ;
      P07EK5_A4495HreNumCie = new byte[1] ;
      P07EK5_A4494HreBarPar = new String[] {""} ;
      P07EK5_A4493HreBarReo = new byte[1] ;
      P07EK5_A4492HreBarCod = new int[1] ;
      P07EK5_A396EmprCod = new String[] {""} ;
      P07EK5_A9804HreAcab = new String[] {""} ;
      P07EK5_n9804HreAcab = new boolean[] {false} ;
      P07EK5_A13451HreComp2 = new String[] {""} ;
      P07EK5_n13451HreComp2 = new boolean[] {false} ;
      P07EK5_A13450HreComp1 = new String[] {""} ;
      P07EK5_n13450HreComp1 = new boolean[] {false} ;
      P07EK5_A1094HreNPrg = new String[] {""} ;
      P07EK5_n1094HreNPrg = new boolean[] {false} ;
      P07EK5_A4960HreFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P07EK5_n4960HreFecAlt = new boolean[] {false} ;
      P07EK5_A4863HreUsrCod = new String[] {""} ;
      P07EK5_n4863HreUsrCod = new boolean[] {false} ;
      P07EK5_A4543HreTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK5_n4543HreTotMtr = new boolean[] {false} ;
      P07EK5_A4546HreMaqCod = new String[] {""} ;
      P07EK5_n4546HreMaqCod = new boolean[] {false} ;
      P07EK5_A4547HreVolPrd = new int[1] ;
      P07EK5_n4547HreVolPrd = new boolean[] {false} ;
      P07EK5_A4540HreIntDsc = new String[] {""} ;
      P07EK5_n4540HreIntDsc = new boolean[] {false} ;
      P07EK5_A4526HreTipColN = new String[] {""} ;
      P07EK5_n4526HreTipColN = new boolean[] {false} ;
      P07EK5_A4525HreTipCol = new byte[1] ;
      P07EK5_n4525HreTipCol = new boolean[] {false} ;
      P07EK5_A4522HreColNum = new int[1] ;
      P07EK5_n4522HreColNum = new boolean[] {false} ;
      P07EK5_A4521HreColNom = new String[] {""} ;
      P07EK5_n4521HreColNom = new boolean[] {false} ;
      P07EK5_A4518HreBarDsc = new String[] {""} ;
      P07EK5_n4518HreBarDsc = new boolean[] {false} ;
      P07EK5_A4517HreBarSer = new String[] {""} ;
      P07EK5_n4517HreBarSer = new boolean[] {false} ;
      P07EK5_A279CliNom = new String[] {""} ;
      P07EK5_A252CliCod = new int[1] ;
      P07EK5_n252CliCod = new boolean[] {false} ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A4494HreBarPar = "" ;
      A9804HreAcab = "" ;
      A13451HreComp2 = "" ;
      A13450HreComp1 = "" ;
      A1094HreNPrg = "" ;
      A4960HreFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4863HreUsrCod = "" ;
      A4543HreTotMtr = DecimalUtil.ZERO ;
      A4546HreMaqCod = "" ;
      A4540HreIntDsc = "" ;
      A4526HreTipColN = "" ;
      A4521HreColNom = "" ;
      A4518HreBarDsc = "" ;
      A4517HreBarSer = "" ;
      A279CliNom = "" ;
      AV99HreMaqCod = "" ;
      AV42CosteT1 = DecimalUtil.ZERO ;
      AV43CosteT2 = DecimalUtil.ZERO ;
      P07EK6_A396EmprCod = new String[] {""} ;
      P07EK6_A4492HreBarCod = new int[1] ;
      P07EK6_A4493HreBarReo = new byte[1] ;
      P07EK6_A4494HreBarPar = new String[] {""} ;
      P07EK6_A4495HreNumCie = new byte[1] ;
      P07EK6_A4545HreLinMaq = new short[1] ;
      P07EK6_A4550HreLinPro = new byte[1] ;
      P07EK6_A4551HreProCod = new String[] {""} ;
      P07EK6_A4966HreVolPro = new int[1] ;
      P07EK6_A4552HreProDsc = new String[] {""} ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      AV97HreProCod = "" ;
      AV31Coste1 = DecimalUtil.ZERO ;
      AV32Coste2 = DecimalUtil.ZERO ;
      AV30CosteA1 = DecimalUtil.ZERO ;
      AV29CosteP1 = DecimalUtil.ZERO ;
      P07EK7_A396EmprCod = new String[] {""} ;
      P07EK7_A4492HreBarCod = new int[1] ;
      P07EK7_A4493HreBarReo = new byte[1] ;
      P07EK7_A4494HreBarPar = new String[] {""} ;
      P07EK7_A4495HreNumCie = new byte[1] ;
      P07EK7_A4545HreLinMaq = new short[1] ;
      P07EK7_A4550HreLinPro = new byte[1] ;
      P07EK7_A719PrdNum = new String[] {""} ;
      P07EK7_n719PrdNum = new boolean[] {false} ;
      P07EK7_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK7_n4967HrePrePrd = new boolean[] {false} ;
      P07EK7_A4566HreForNro = new byte[1] ;
      P07EK7_n4566HreForNro = new boolean[] {false} ;
      P07EK7_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK7_n4563HrePrdCant = new boolean[] {false} ;
      P07EK7_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK7_n4565HreCanAny = new boolean[] {false} ;
      P07EK7_A4558HrePrdNum = new String[] {""} ;
      P07EK7_n4558HrePrdNum = new boolean[] {false} ;
      P07EK7_A4561HrePrdUDs = new String[] {""} ;
      P07EK7_n4561HrePrdUDs = new boolean[] {false} ;
      P07EK7_A4560HrePrdUMe = new byte[1] ;
      P07EK7_n4560HrePrdUMe = new boolean[] {false} ;
      P07EK7_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK7_n4562HreFacCon = new boolean[] {false} ;
      P07EK7_A5726HreLote = new String[] {""} ;
      P07EK7_n5726HreLote = new boolean[] {false} ;
      P07EK7_A4559HrePrdDsc = new String[] {""} ;
      P07EK7_n4559HrePrdDsc = new boolean[] {false} ;
      P07EK7_A4557HreRecLin = new short[1] ;
      A719PrdNum = "" ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4558HrePrdNum = "" ;
      A4561HrePrdUDs = "" ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      A5726HreLote = "" ;
      A4559HrePrdDsc = "" ;
      AV89PrdNum = "" ;
      AV86PrdPreAct = DecimalUtil.ZERO ;
      AV76PrdCFin = DecimalUtil.ZERO ;
      AV88PrdFacCon = DecimalUtil.ZERO ;
      AV33CantFinal = DecimalUtil.ZERO ;
      AV40CodPrd = "" ;
      AV108Und = "" ;
      AV39Unidades = "" ;
      AV37PrdCant = DecimalUtil.ZERO ;
      AV38PrdCanAny = DecimalUtil.ZERO ;
      AV103HREFACCON = DecimalUtil.ZERO ;
      AV111Lote10 = "" ;
      AV34CosteK1 = DecimalUtil.ZERO ;
      AV35CosteK2 = DecimalUtil.ZERO ;
      AV95CostePz1 = DecimalUtil.ZERO ;
      AV96CostePz2 = DecimalUtil.ZERO ;
      P07EK8_A396EmprCod = new String[] {""} ;
      P07EK8_A4492HreBarCod = new int[1] ;
      P07EK8_A4493HreBarReo = new byte[1] ;
      P07EK8_A4494HreBarPar = new String[] {""} ;
      P07EK8_A4495HreNumCie = new byte[1] ;
      P07EK8_A4508HreLinMAL = new short[1] ;
      P07EK8_A719PrdNum = new String[] {""} ;
      P07EK8_n719PrdNum = new boolean[] {false} ;
      P07EK8_A4509HreNumAny = new byte[1] ;
      P07EK9_A396EmprCod = new String[] {""} ;
      P07EK9_A4492HreBarCod = new int[1] ;
      P07EK9_A4493HreBarReo = new byte[1] ;
      P07EK9_A4494HreBarPar = new String[] {""} ;
      P07EK9_A4495HreNumCie = new byte[1] ;
      P07EK9_A4508HreLinMAL = new short[1] ;
      P07EK9_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK9_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK9_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK9_n4511HrePrdCFin = new boolean[] {false} ;
      P07EK9_A5808HreLanyLot = new String[] {""} ;
      P07EK9_n5808HreLanyLot = new boolean[] {false} ;
      P07EK9_A718PrdNom = new String[] {""} ;
      P07EK9_A719PrdNum = new String[] {""} ;
      P07EK9_n719PrdNum = new boolean[] {false} ;
      P07EK9_A4509HreNumAny = new byte[1] ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A5808HreLanyLot = "" ;
      A718PrdNom = "" ;
      AV101CosteMaq = DecimalUtil.ZERO ;
      AV100MAQCOSMIN = DecimalUtil.ZERO ;
      P07EK10_A4495HreNumCie = new byte[1] ;
      P07EK10_A4494HreBarPar = new String[] {""} ;
      P07EK10_A4493HreBarReo = new byte[1] ;
      P07EK10_A4492HreBarCod = new int[1] ;
      P07EK10_A396EmprCod = new String[] {""} ;
      P07EK10_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK10_A4505HreAgrDsc = new String[] {""} ;
      P07EK10_A4502HreAgrPie = new short[1] ;
      P07EK10_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK10_A4504HreAgrSer = new String[] {""} ;
      P07EK10_A4499HreAgrPar = new String[] {""} ;
      P07EK10_A4498HreAgrReo = new byte[1] ;
      P07EK10_A4497HreAgrCod = new int[1] ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      A4505HreAgrDsc = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      A4499HreAgrPar = "" ;
      P07EK11_A4495HreNumCie = new byte[1] ;
      P07EK11_A4494HreBarPar = new String[] {""} ;
      P07EK11_A4493HreBarReo = new byte[1] ;
      P07EK11_A4492HreBarCod = new int[1] ;
      P07EK11_A396EmprCod = new String[] {""} ;
      P07EK11_A9990HreAcPie = new int[1] ;
      P07EK11_n9990HreAcPie = new boolean[] {false} ;
      P07EK11_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK11_n9989HreAcMtr = new boolean[] {false} ;
      P07EK11_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK11_n9988HreAcKgm = new boolean[] {false} ;
      P07EK11_A9993HreAcDsc = new String[] {""} ;
      P07EK11_n9993HreAcDsc = new boolean[] {false} ;
      P07EK11_A9992HreAcSer = new String[] {""} ;
      P07EK11_n9992HreAcSer = new boolean[] {false} ;
      P07EK11_A9987HreAcPar = new String[] {""} ;
      P07EK11_A9986HreAcReo = new byte[1] ;
      P07EK11_A9985HreAcCod = new int[1] ;
      A9989HreAcMtr = DecimalUtil.ZERO ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9993HreAcDsc = "" ;
      A9992HreAcSer = "" ;
      A9987HreAcPar = "" ;
      P07EK12_A719PrdNum = new String[] {""} ;
      P07EK12_n719PrdNum = new boolean[] {false} ;
      P07EK12_A396EmprCod = new String[] {""} ;
      P07EK12_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK13_A771ProForTie = new short[1] ;
      P07EK14_A602MaqCod = new String[] {""} ;
      P07EK14_A396EmprCod = new String[] {""} ;
      P07EK14_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK14_n605MaqCosMin = new boolean[] {false} ;
      A602MaqCod = "" ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      P07EK15_A396EmprCod = new String[] {""} ;
      P07EK15_A4492HreBarCod = new int[1] ;
      P07EK15_A4493HreBarReo = new byte[1] ;
      P07EK15_A4494HreBarPar = new String[] {""} ;
      P07EK15_A4495HreNumCie = new byte[1] ;
      P07EK15_A4508HreLinMAL = new short[1] ;
      P07EK15_A719PrdNum = new String[] {""} ;
      P07EK15_n719PrdNum = new boolean[] {false} ;
      P07EK15_A4514HreLanyNro = new byte[1] ;
      P07EK15_n4514HreLanyNro = new boolean[] {false} ;
      P07EK15_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EK15_n4511HrePrdCFin = new boolean[] {false} ;
      P07EK15_A4509HreNumAny = new byte[1] ;
      AV70ContDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhrhr021__default(),
         new Object[] {
             new Object[] {
            P07EK2_A130BarCodPar, P07EK2_A132BarCodReo, P07EK2_A129BarCod, P07EK2_A396EmprCod, P07EK2_A970ProceCod, P07EK2_n970ProceCod, P07EK2_A44AlbRecCod, P07EK2_A971ProceNom, P07EK2_n971ProceNom, P07EK2_A200BarPieCod
            }
            , new Object[] {
            P07EK3_A396EmprCod, P07EK3_A407EmprNom, P07EK3_n407EmprNom
            }
            , new Object[] {
            P07EK4_A942TermCod, P07EK4_A1189TermUsu, P07EK4_n1189TermUsu
            }
            , new Object[] {
            P07EK5_A4542HreTotKgm, P07EK5_n4542HreTotKgm, P07EK5_A4544HreTotPie, P07EK5_n4544HreTotPie, P07EK5_A4545HreLinMaq, P07EK5_A4495HreNumCie, P07EK5_A4494HreBarPar, P07EK5_A4493HreBarReo, P07EK5_A4492HreBarCod, P07EK5_A396EmprCod,
            P07EK5_A9804HreAcab, P07EK5_n9804HreAcab, P07EK5_A13451HreComp2, P07EK5_n13451HreComp2, P07EK5_A13450HreComp1, P07EK5_n13450HreComp1, P07EK5_A1094HreNPrg, P07EK5_n1094HreNPrg, P07EK5_A4960HreFecAlt, P07EK5_n4960HreFecAlt,
            P07EK5_A4863HreUsrCod, P07EK5_n4863HreUsrCod, P07EK5_A4543HreTotMtr, P07EK5_n4543HreTotMtr, P07EK5_A4546HreMaqCod, P07EK5_n4546HreMaqCod, P07EK5_A4547HreVolPrd, P07EK5_n4547HreVolPrd, P07EK5_A4540HreIntDsc, P07EK5_n4540HreIntDsc,
            P07EK5_A4526HreTipColN, P07EK5_n4526HreTipColN, P07EK5_A4525HreTipCol, P07EK5_n4525HreTipCol, P07EK5_A4522HreColNum, P07EK5_n4522HreColNum, P07EK5_A4521HreColNom, P07EK5_n4521HreColNom, P07EK5_A4518HreBarDsc, P07EK5_n4518HreBarDsc,
            P07EK5_A4517HreBarSer, P07EK5_n4517HreBarSer, P07EK5_A279CliNom, P07EK5_A252CliCod, P07EK5_n252CliCod
            }
            , new Object[] {
            P07EK6_A396EmprCod, P07EK6_A4492HreBarCod, P07EK6_A4493HreBarReo, P07EK6_A4494HreBarPar, P07EK6_A4495HreNumCie, P07EK6_A4545HreLinMaq, P07EK6_A4550HreLinPro, P07EK6_A4551HreProCod, P07EK6_A4966HreVolPro, P07EK6_A4552HreProDsc
            }
            , new Object[] {
            P07EK7_A396EmprCod, P07EK7_A4492HreBarCod, P07EK7_A4493HreBarReo, P07EK7_A4494HreBarPar, P07EK7_A4495HreNumCie, P07EK7_A4545HreLinMaq, P07EK7_A4550HreLinPro, P07EK7_A719PrdNum, P07EK7_n719PrdNum, P07EK7_A4967HrePrePrd,
            P07EK7_n4967HrePrePrd, P07EK7_A4566HreForNro, P07EK7_n4566HreForNro, P07EK7_A4563HrePrdCant, P07EK7_n4563HrePrdCant, P07EK7_A4565HreCanAny, P07EK7_n4565HreCanAny, P07EK7_A4558HrePrdNum, P07EK7_n4558HrePrdNum, P07EK7_A4561HrePrdUDs,
            P07EK7_n4561HrePrdUDs, P07EK7_A4560HrePrdUMe, P07EK7_n4560HrePrdUMe, P07EK7_A4562HreFacCon, P07EK7_n4562HreFacCon, P07EK7_A5726HreLote, P07EK7_n5726HreLote, P07EK7_A4559HrePrdDsc, P07EK7_n4559HrePrdDsc, P07EK7_A4557HreRecLin
            }
            , new Object[] {
            P07EK8_A396EmprCod, P07EK8_A4492HreBarCod, P07EK8_A4493HreBarReo, P07EK8_A4494HreBarPar, P07EK8_A4495HreNumCie, P07EK8_A4508HreLinMAL, P07EK8_A719PrdNum, P07EK8_A4509HreNumAny
            }
            , new Object[] {
            P07EK9_A396EmprCod, P07EK9_A4492HreBarCod, P07EK9_A4493HreBarReo, P07EK9_A4494HreBarPar, P07EK9_A4495HreNumCie, P07EK9_A4508HreLinMAL, P07EK9_A724PrdPreAct, P07EK9_A707PrdFacCon, P07EK9_A4511HrePrdCFin, P07EK9_n4511HrePrdCFin,
            P07EK9_A5808HreLanyLot, P07EK9_n5808HreLanyLot, P07EK9_A718PrdNom, P07EK9_A719PrdNum, P07EK9_A4509HreNumAny
            }
            , new Object[] {
            P07EK10_A4495HreNumCie, P07EK10_A4494HreBarPar, P07EK10_A4493HreBarReo, P07EK10_A4492HreBarCod, P07EK10_A396EmprCod, P07EK10_A4501HreAgrMtr, P07EK10_A4505HreAgrDsc, P07EK10_A4502HreAgrPie, P07EK10_A4500HreAgrKgm, P07EK10_A4504HreAgrSer,
            P07EK10_A4499HreAgrPar, P07EK10_A4498HreAgrReo, P07EK10_A4497HreAgrCod
            }
            , new Object[] {
            P07EK11_A4495HreNumCie, P07EK11_A4494HreBarPar, P07EK11_A4493HreBarReo, P07EK11_A4492HreBarCod, P07EK11_A396EmprCod, P07EK11_A9990HreAcPie, P07EK11_n9990HreAcPie, P07EK11_A9989HreAcMtr, P07EK11_n9989HreAcMtr, P07EK11_A9988HreAcKgm,
            P07EK11_n9988HreAcKgm, P07EK11_A9993HreAcDsc, P07EK11_n9993HreAcDsc, P07EK11_A9992HreAcSer, P07EK11_n9992HreAcSer, P07EK11_A9987HreAcPar, P07EK11_A9986HreAcReo, P07EK11_A9985HreAcCod
            }
            , new Object[] {
            P07EK12_A719PrdNum, P07EK12_A396EmprCod, P07EK12_A707PrdFacCon
            }
            , new Object[] {
            P07EK13_A771ProForTie
            }
            , new Object[] {
            P07EK14_A602MaqCod, P07EK14_A396EmprCod, P07EK14_A605MaqCosMin, P07EK14_n605MaqCosMin
            }
            , new Object[] {
            P07EK15_A396EmprCod, P07EK15_A4492HreBarCod, P07EK15_A4493HreBarReo, P07EK15_A4494HreBarPar, P07EK15_A4495HreNumCie, P07EK15_A4508HreLinMAL, P07EK15_A719PrdNum, P07EK15_A4514HreLanyNro, P07EK15_n4514HreLanyNro, P07EK15_A4511HrePrdCFin,
            P07EK15_n4511HrePrdCFin, P07EK15_A4509HreNumAny
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV120Pgmname = "RHRHR021" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV120Pgmname = "RHRHR021" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte AV87HRENUMCIE ;
   private byte AV94F_laundry ;
   private byte AV114Divpor1000 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A132BarCodReo ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4525HreTipCol ;
   private byte A4550HreLinPro ;
   private byte A4566HreForNro ;
   private byte A4560HrePrdUMe ;
   private byte AV116HreForNro ;
   private byte AV84Pesaje ;
   private byte A4509HreNumAny ;
   private byte AV81FlagAgr ;
   private byte A4498HreAgrReo ;
   private byte A9986HreAcReo ;
   private byte A4514HreLanyNro ;
   private short gxcookieaux ;
   private short A970ProceCod ;
   private short AV91LinMaq ;
   private short A4545HreLinMaq ;
   private short AV19RelBany ;
   private short AV98Tiempo_t ;
   private short A4557HreRecLin ;
   private short AV112hrelinmaq ;
   private short A4508HreLinMAL ;
   private short A4502HreAgrPie ;
   private short c771ProForTie ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int A4544HreTotPie ;
   private int A4492HreBarCod ;
   private int A4547HreVolPrd ;
   private int A4522HreColNum ;
   private int A252CliCod ;
   private int A4966HreVolPro ;
   private int Gx_OldLine ;
   private int A4497HreAgrCod ;
   private int A9990HreAcPie ;
   private int A9985HreAcCod ;
   private java.math.BigDecimal AV110Intexco ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A4543HreTotMtr ;
   private java.math.BigDecimal AV42CosteT1 ;
   private java.math.BigDecimal AV43CosteT2 ;
   private java.math.BigDecimal AV31Coste1 ;
   private java.math.BigDecimal AV32Coste2 ;
   private java.math.BigDecimal AV30CosteA1 ;
   private java.math.BigDecimal AV29CosteP1 ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A4562HreFacCon ;
   private java.math.BigDecimal AV86PrdPreAct ;
   private java.math.BigDecimal AV76PrdCFin ;
   private java.math.BigDecimal AV88PrdFacCon ;
   private java.math.BigDecimal AV33CantFinal ;
   private java.math.BigDecimal AV37PrdCant ;
   private java.math.BigDecimal AV38PrdCanAny ;
   private java.math.BigDecimal AV103HREFACCON ;
   private java.math.BigDecimal AV34CosteK1 ;
   private java.math.BigDecimal AV35CosteK2 ;
   private java.math.BigDecimal AV95CostePz1 ;
   private java.math.BigDecimal AV96CostePz2 ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal AV101CosteMaq ;
   private java.math.BigDecimal AV100MAQCOSMIN ;
   private java.math.BigDecimal A4501HreAgrMtr ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A9989HreAcMtr ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal A605MaqCosMin ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV10EmprCod ;
   private String AV13BarCodPar ;
   private String AV71Station ;
   private String GXv_char2[] ;
   private String AV74EmprNom ;
   private String GXv_char3[] ;
   private String AV72UsurCod ;
   private String AV44Lit0 ;
   private String AV120Pgmname ;
   private String AV45Lit1 ;
   private String AV46Lit2 ;
   private String AV47Lit3 ;
   private String AV48Lit4 ;
   private String AV49Lit5 ;
   private String AV50Lit6 ;
   private String AV51Lit7 ;
   private String AV52Lit8 ;
   private String AV53Lit9 ;
   private String AV54Lit10 ;
   private String AV55Lit11 ;
   private String AV56Lit12 ;
   private String AV57Lit13 ;
   private String AV58Lit14 ;
   private String AV59Lit15 ;
   private String AV60Lit16 ;
   private String AV61Lit17 ;
   private String AV62Lit18 ;
   private String AV63Lit19 ;
   private String AV64Lit20 ;
   private String AV65Lit21 ;
   private String AV66Lit22 ;
   private String AV67Lit23 ;
   private String AV68Lit24 ;
   private String AV73Lit25 ;
   private String AV82Lit26 ;
   private String AV83Lit27 ;
   private String AV90Lit28 ;
   private String AV92Lit29 ;
   private String AV93Lit30 ;
   private String AV102Lit40 ;
   private String AV104Lit50 ;
   private String AV105Lit51 ;
   private String AV106Lit52 ;
   private String AV115lit54 ;
   private String AV107Lit53 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A971ProceNom ;
   private String A200BarPieCod ;
   private String AV109ProceNom ;
   private String A407EmprNom ;
   private String AV36NomEmp ;
   private String AV8Termin ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV9TermUsu ;
   private String A4494HreBarPar ;
   private String A9804HreAcab ;
   private String A13451HreComp2 ;
   private String A13450HreComp1 ;
   private String A1094HreNPrg ;
   private String A4863HreUsrCod ;
   private String A4546HreMaqCod ;
   private String A4540HreIntDsc ;
   private String A4526HreTipColN ;
   private String A4521HreColNom ;
   private String A4518HreBarDsc ;
   private String A4517HreBarSer ;
   private String A279CliNom ;
   private String AV99HreMaqCod ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String AV97HreProCod ;
   private String A719PrdNum ;
   private String A4558HrePrdNum ;
   private String A4561HrePrdUDs ;
   private String A5726HreLote ;
   private String A4559HrePrdDsc ;
   private String AV89PrdNum ;
   private String AV40CodPrd ;
   private String AV108Und ;
   private String AV39Unidades ;
   private String AV111Lote10 ;
   private String A5808HreLanyLot ;
   private String A718PrdNom ;
   private String A4505HreAgrDsc ;
   private String A4504HreAgrSer ;
   private String A4499HreAgrPar ;
   private String A9993HreAcDsc ;
   private String A9992HreAcSer ;
   private String A9987HreAcPar ;
   private String A602MaqCod ;
   private String AV70ContDsc ;
   private java.util.Date A4960HreFecAlt ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n407EmprNom ;
   private boolean n1189TermUsu ;
   private boolean GxHdr5 ;
   private boolean n4542HreTotKgm ;
   private boolean n4544HreTotPie ;
   private boolean n9804HreAcab ;
   private boolean n13451HreComp2 ;
   private boolean n13450HreComp1 ;
   private boolean n1094HreNPrg ;
   private boolean n4960HreFecAlt ;
   private boolean n4863HreUsrCod ;
   private boolean n4543HreTotMtr ;
   private boolean n4546HreMaqCod ;
   private boolean n4547HreVolPrd ;
   private boolean n4540HreIntDsc ;
   private boolean n4526HreTipColN ;
   private boolean n4525HreTipCol ;
   private boolean n4522HreColNum ;
   private boolean n4521HreColNom ;
   private boolean n4518HreBarDsc ;
   private boolean n4517HreBarSer ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n719PrdNum ;
   private boolean n4967HrePrePrd ;
   private boolean n4566HreForNro ;
   private boolean n4563HrePrdCant ;
   private boolean n4565HreCanAny ;
   private boolean n4558HrePrdNum ;
   private boolean n4561HrePrdUDs ;
   private boolean n4560HrePrdUMe ;
   private boolean n4562HreFacCon ;
   private boolean n5726HreLote ;
   private boolean n4559HrePrdDsc ;
   private boolean n4511HrePrdCFin ;
   private boolean n5808HreLanyLot ;
   private boolean n9990HreAcPie ;
   private boolean n9989HreAcMtr ;
   private boolean n9988HreAcKgm ;
   private boolean n9993HreAcDsc ;
   private boolean n9992HreAcSer ;
   private boolean n605MaqCosMin ;
   private boolean n4514HreLanyNro ;
   private IDataStoreProvider pr_default ;
   private String[] P07EK2_A130BarCodPar ;
   private byte[] P07EK2_A132BarCodReo ;
   private int[] P07EK2_A129BarCod ;
   private String[] P07EK2_A396EmprCod ;
   private short[] P07EK2_A970ProceCod ;
   private boolean[] P07EK2_n970ProceCod ;
   private int[] P07EK2_A44AlbRecCod ;
   private String[] P07EK2_A971ProceNom ;
   private boolean[] P07EK2_n971ProceNom ;
   private String[] P07EK2_A200BarPieCod ;
   private String[] P07EK3_A396EmprCod ;
   private String[] P07EK3_A407EmprNom ;
   private boolean[] P07EK3_n407EmprNom ;
   private String[] P07EK4_A942TermCod ;
   private String[] P07EK4_A1189TermUsu ;
   private boolean[] P07EK4_n1189TermUsu ;
   private java.math.BigDecimal[] P07EK5_A4542HreTotKgm ;
   private boolean[] P07EK5_n4542HreTotKgm ;
   private int[] P07EK5_A4544HreTotPie ;
   private boolean[] P07EK5_n4544HreTotPie ;
   private short[] P07EK5_A4545HreLinMaq ;
   private byte[] P07EK5_A4495HreNumCie ;
   private String[] P07EK5_A4494HreBarPar ;
   private byte[] P07EK5_A4493HreBarReo ;
   private int[] P07EK5_A4492HreBarCod ;
   private String[] P07EK5_A396EmprCod ;
   private String[] P07EK5_A9804HreAcab ;
   private boolean[] P07EK5_n9804HreAcab ;
   private String[] P07EK5_A13451HreComp2 ;
   private boolean[] P07EK5_n13451HreComp2 ;
   private String[] P07EK5_A13450HreComp1 ;
   private boolean[] P07EK5_n13450HreComp1 ;
   private String[] P07EK5_A1094HreNPrg ;
   private boolean[] P07EK5_n1094HreNPrg ;
   private java.util.Date[] P07EK5_A4960HreFecAlt ;
   private boolean[] P07EK5_n4960HreFecAlt ;
   private String[] P07EK5_A4863HreUsrCod ;
   private boolean[] P07EK5_n4863HreUsrCod ;
   private java.math.BigDecimal[] P07EK5_A4543HreTotMtr ;
   private boolean[] P07EK5_n4543HreTotMtr ;
   private String[] P07EK5_A4546HreMaqCod ;
   private boolean[] P07EK5_n4546HreMaqCod ;
   private int[] P07EK5_A4547HreVolPrd ;
   private boolean[] P07EK5_n4547HreVolPrd ;
   private String[] P07EK5_A4540HreIntDsc ;
   private boolean[] P07EK5_n4540HreIntDsc ;
   private String[] P07EK5_A4526HreTipColN ;
   private boolean[] P07EK5_n4526HreTipColN ;
   private byte[] P07EK5_A4525HreTipCol ;
   private boolean[] P07EK5_n4525HreTipCol ;
   private int[] P07EK5_A4522HreColNum ;
   private boolean[] P07EK5_n4522HreColNum ;
   private String[] P07EK5_A4521HreColNom ;
   private boolean[] P07EK5_n4521HreColNom ;
   private String[] P07EK5_A4518HreBarDsc ;
   private boolean[] P07EK5_n4518HreBarDsc ;
   private String[] P07EK5_A4517HreBarSer ;
   private boolean[] P07EK5_n4517HreBarSer ;
   private String[] P07EK5_A279CliNom ;
   private int[] P07EK5_A252CliCod ;
   private boolean[] P07EK5_n252CliCod ;
   private String[] P07EK6_A396EmprCod ;
   private int[] P07EK6_A4492HreBarCod ;
   private byte[] P07EK6_A4493HreBarReo ;
   private String[] P07EK6_A4494HreBarPar ;
   private byte[] P07EK6_A4495HreNumCie ;
   private short[] P07EK6_A4545HreLinMaq ;
   private byte[] P07EK6_A4550HreLinPro ;
   private String[] P07EK6_A4551HreProCod ;
   private int[] P07EK6_A4966HreVolPro ;
   private String[] P07EK6_A4552HreProDsc ;
   private String[] P07EK7_A396EmprCod ;
   private int[] P07EK7_A4492HreBarCod ;
   private byte[] P07EK7_A4493HreBarReo ;
   private String[] P07EK7_A4494HreBarPar ;
   private byte[] P07EK7_A4495HreNumCie ;
   private short[] P07EK7_A4545HreLinMaq ;
   private byte[] P07EK7_A4550HreLinPro ;
   private String[] P07EK7_A719PrdNum ;
   private boolean[] P07EK7_n719PrdNum ;
   private java.math.BigDecimal[] P07EK7_A4967HrePrePrd ;
   private boolean[] P07EK7_n4967HrePrePrd ;
   private byte[] P07EK7_A4566HreForNro ;
   private boolean[] P07EK7_n4566HreForNro ;
   private java.math.BigDecimal[] P07EK7_A4563HrePrdCant ;
   private boolean[] P07EK7_n4563HrePrdCant ;
   private java.math.BigDecimal[] P07EK7_A4565HreCanAny ;
   private boolean[] P07EK7_n4565HreCanAny ;
   private String[] P07EK7_A4558HrePrdNum ;
   private boolean[] P07EK7_n4558HrePrdNum ;
   private String[] P07EK7_A4561HrePrdUDs ;
   private boolean[] P07EK7_n4561HrePrdUDs ;
   private byte[] P07EK7_A4560HrePrdUMe ;
   private boolean[] P07EK7_n4560HrePrdUMe ;
   private java.math.BigDecimal[] P07EK7_A4562HreFacCon ;
   private boolean[] P07EK7_n4562HreFacCon ;
   private String[] P07EK7_A5726HreLote ;
   private boolean[] P07EK7_n5726HreLote ;
   private String[] P07EK7_A4559HrePrdDsc ;
   private boolean[] P07EK7_n4559HrePrdDsc ;
   private short[] P07EK7_A4557HreRecLin ;
   private String[] P07EK8_A396EmprCod ;
   private int[] P07EK8_A4492HreBarCod ;
   private byte[] P07EK8_A4493HreBarReo ;
   private String[] P07EK8_A4494HreBarPar ;
   private byte[] P07EK8_A4495HreNumCie ;
   private short[] P07EK8_A4508HreLinMAL ;
   private String[] P07EK8_A719PrdNum ;
   private boolean[] P07EK8_n719PrdNum ;
   private byte[] P07EK8_A4509HreNumAny ;
   private String[] P07EK9_A396EmprCod ;
   private int[] P07EK9_A4492HreBarCod ;
   private byte[] P07EK9_A4493HreBarReo ;
   private String[] P07EK9_A4494HreBarPar ;
   private byte[] P07EK9_A4495HreNumCie ;
   private short[] P07EK9_A4508HreLinMAL ;
   private java.math.BigDecimal[] P07EK9_A724PrdPreAct ;
   private java.math.BigDecimal[] P07EK9_A707PrdFacCon ;
   private java.math.BigDecimal[] P07EK9_A4511HrePrdCFin ;
   private boolean[] P07EK9_n4511HrePrdCFin ;
   private String[] P07EK9_A5808HreLanyLot ;
   private boolean[] P07EK9_n5808HreLanyLot ;
   private String[] P07EK9_A718PrdNom ;
   private String[] P07EK9_A719PrdNum ;
   private boolean[] P07EK9_n719PrdNum ;
   private byte[] P07EK9_A4509HreNumAny ;
   private byte[] P07EK10_A4495HreNumCie ;
   private String[] P07EK10_A4494HreBarPar ;
   private byte[] P07EK10_A4493HreBarReo ;
   private int[] P07EK10_A4492HreBarCod ;
   private String[] P07EK10_A396EmprCod ;
   private java.math.BigDecimal[] P07EK10_A4501HreAgrMtr ;
   private String[] P07EK10_A4505HreAgrDsc ;
   private short[] P07EK10_A4502HreAgrPie ;
   private java.math.BigDecimal[] P07EK10_A4500HreAgrKgm ;
   private String[] P07EK10_A4504HreAgrSer ;
   private String[] P07EK10_A4499HreAgrPar ;
   private byte[] P07EK10_A4498HreAgrReo ;
   private int[] P07EK10_A4497HreAgrCod ;
   private byte[] P07EK11_A4495HreNumCie ;
   private String[] P07EK11_A4494HreBarPar ;
   private byte[] P07EK11_A4493HreBarReo ;
   private int[] P07EK11_A4492HreBarCod ;
   private String[] P07EK11_A396EmprCod ;
   private int[] P07EK11_A9990HreAcPie ;
   private boolean[] P07EK11_n9990HreAcPie ;
   private java.math.BigDecimal[] P07EK11_A9989HreAcMtr ;
   private boolean[] P07EK11_n9989HreAcMtr ;
   private java.math.BigDecimal[] P07EK11_A9988HreAcKgm ;
   private boolean[] P07EK11_n9988HreAcKgm ;
   private String[] P07EK11_A9993HreAcDsc ;
   private boolean[] P07EK11_n9993HreAcDsc ;
   private String[] P07EK11_A9992HreAcSer ;
   private boolean[] P07EK11_n9992HreAcSer ;
   private String[] P07EK11_A9987HreAcPar ;
   private byte[] P07EK11_A9986HreAcReo ;
   private int[] P07EK11_A9985HreAcCod ;
   private String[] P07EK12_A719PrdNum ;
   private boolean[] P07EK12_n719PrdNum ;
   private String[] P07EK12_A396EmprCod ;
   private java.math.BigDecimal[] P07EK12_A707PrdFacCon ;
   private short[] P07EK13_A771ProForTie ;
   private String[] P07EK14_A602MaqCod ;
   private String[] P07EK14_A396EmprCod ;
   private java.math.BigDecimal[] P07EK14_A605MaqCosMin ;
   private boolean[] P07EK14_n605MaqCosMin ;
   private String[] P07EK15_A396EmprCod ;
   private int[] P07EK15_A4492HreBarCod ;
   private byte[] P07EK15_A4493HreBarReo ;
   private String[] P07EK15_A4494HreBarPar ;
   private byte[] P07EK15_A4495HreNumCie ;
   private short[] P07EK15_A4508HreLinMAL ;
   private String[] P07EK15_A719PrdNum ;
   private boolean[] P07EK15_n719PrdNum ;
   private byte[] P07EK15_A4514HreLanyNro ;
   private boolean[] P07EK15_n4514HreLanyNro ;
   private java.math.BigDecimal[] P07EK15_A4511HrePrdCFin ;
   private boolean[] P07EK15_n4511HrePrdCFin ;
   private byte[] P07EK15_A4509HreNumAny ;
}

final  class rhrhr021__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07EK2", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.ProceCod, T1.AlbRecCod, T3.ProceNom, T1.BarPieCod FROM ((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (? = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EK3", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07EK4", "SELECT TermCod, TermUsu FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07EK5", "SELECT T2.HreTotKgm, T2.HreTotPie, T1.HreLinMaq, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T1.HreAcab, T2.HreComp2, T2.HreComp1, T1.HreNPrg, T1.HreFecAlt, T1.HreUsrCod, T2.HreTotMtr, T1.HreMaqCod, T1.HreVolPrd, T2.HreIntDsc, T2.HreTipColN, T2.HreTipCol, T2.HreColNum, T2.HreColNom, T2.HreBarDsc, T2.HreBarSer, T3.CliNom, T2.CliCod FROM ((TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EK6", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreVolPro, HreProDsc FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EK7", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, PrdNum, HrePrePrd, HreForNro, HrePrdCant, HreCanAny, HrePrdNum, HrePrdUDs, HrePrdUMe, HreFacCon, HreLote, HrePrdDsc, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EK8", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, PrdNum, HreNumAny FROM TXPHISREA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07EK9", "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMAL, T2.PrdPreAct, T2.PrdFacCon, T1.HrePrdCFin, T1.HreLanyLot, T2.PrdNom, T1.PrdNum, T1.HreNumAny FROM (TXPHISREA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMAL = ? ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMAL, T1.HreNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EK10", "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAgrMtr, HreAgrDsc, HreAgrPie, HreAgrKgm, HreAgrSer, HreAgrPar, HreAgrReo, HreAgrCod FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EK11", "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAcPie, HreAcMtr, HreAcKgm, HreAcDsc, HreAcSer, HreAcPar, HreAcReo, HreAcCod FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EK12", "SELECT PrdNum, EmprCod, PrdFacCon FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07EK13", "SELECT SUM(ProForTie) FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EK14", "SELECT MaqCod, EmprCod, MaqCosMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07EK15", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, PrdNum, HreLanyNro, HrePrdCFin, HreNumAny FROM TXPHISREA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ? and PrdNum = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 21);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 21);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(21);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(23, 26);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(24, 16);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(25, 30);
               ((int[]) buf[43])[0] = rslt.getInt(26);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(19);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((String[]) buf[13])[0] = rslt.getString(12, 6);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
      }
   }

}

