package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rhrhr02sc_impl extends GXWebReport
{
   public rhrhr02sc_impl( com.genexus.internet.HttpContext context )
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
            AV136HreLinmaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinmaq"))) ;
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
         rhrhr02sc_impl.this.GXt_char1 = GXv_char2[0] ;
         AV71Station = GXt_char1 ;
         GXv_char2[0] = AV10EmprCod ;
         GXv_char3[0] = AV74EmprNom ;
         GXv_char4[0] = AV72UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char2, GXv_char3, GXv_char4) ;
         rhrhr02sc_impl.this.AV10EmprCod = GXv_char2[0] ;
         rhrhr02sc_impl.this.AV74EmprNom = GXv_char3[0] ;
         rhrhr02sc_impl.this.AV72UsurCod = GXv_char4[0] ;
         GXt_int5 = AV94F_laundry ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "LAUNDR", ""), GXv_int6) ;
         rhrhr02sc_impl.this.GXt_int5 = GXv_int6[0] ;
         AV94F_laundry = GXt_int5 ;
         GXt_int5 = AV112jPF ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "JPF", ""), GXv_int6) ;
         rhrhr02sc_impl.this.GXt_int5 = GXv_int6[0] ;
         AV112jPF = GXt_int5 ;
         GXt_int5 = AV127Carvema ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
         rhrhr02sc_impl.this.GXt_int5 = GXv_int6[0] ;
         AV127Carvema = GXt_int5 ;
         GXt_char1 = AV44Lit0 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV209Pgmname, (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV44Lit0 = GXt_char1 ;
         GXt_char1 = AV45Lit1 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV45Lit1 = GXt_char1 ;
         GXt_char1 = AV46Lit2 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV46Lit2 = GXt_char1 ;
         GXt_char1 = AV47Lit3 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV47Lit3 = GXt_char1 ;
         GXt_char1 = AV48Lit4 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV48Lit4 = GXt_char1 ;
         GXt_char1 = AV49Lit5 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV49Lit5 = GXt_char1 ;
         GXt_char1 = AV50Lit6 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV50Lit6 = GXt_char1 ;
         GXt_char1 = AV51Lit7 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2458_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV51Lit7 = GXt_char1 ;
         GXt_char1 = AV52Lit8 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV52Lit8 = GXt_char1 ;
         GXt_char1 = AV53Lit9 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1199_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV53Lit9 = GXt_char1 ;
         GXt_char1 = AV54Lit10 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1150_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV54Lit10 = GXt_char1 ;
         GXt_char1 = AV55Lit11 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV55Lit11 = GXt_char1 ;
         GXt_char1 = AV56Lit12 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV56Lit12 = GXt_char1 ;
         GXt_char1 = AV57Lit13 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3016_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV57Lit13 = GXt_char1 ;
         GXt_char1 = AV58Lit14 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV58Lit14 = GXt_char1 ;
         GXt_char1 = AV59Lit15 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3018_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV59Lit15 = GXt_char1 ;
         GXt_char1 = AV60Lit16 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3019_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV60Lit16 = GXt_char1 ;
         GXt_char1 = AV61Lit17 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3020_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV61Lit17 = GXt_char1 ;
         GXt_char1 = AV62Lit18 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3021_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV62Lit18 = GXt_char1 ;
         GXt_char1 = AV63Lit19 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV63Lit19 = GXt_char1 ;
         GXt_char1 = AV64Lit20 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1546_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV64Lit20 = GXt_char1 ;
         GXt_char1 = AV65Lit21 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3017_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV65Lit21 = GXt_char1 ;
         GXt_char1 = AV66Lit22 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3022_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV66Lit22 = GXt_char1 ;
         GXt_char1 = AV67Lit23 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV67Lit23 = GXt_char1 ;
         GXt_char1 = AV68Lit24 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3023_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV68Lit24 = GXt_char1 ;
         GXt_char1 = AV73Lit25 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN813_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV73Lit25 = GXt_char1 ;
         GXt_char1 = AV82Lit26 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV82Lit26 = GXt_char1 ;
         GXt_char1 = AV83Lit27 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV83Lit27 = GXt_char1 ;
         GXt_char1 = AV90Lit28 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN038", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV90Lit28 = ((AV112jPF==1) ? httpContext.getMessage( "Produtos manuais.", "") : GXt_char1) ;
         GXt_char1 = AV92Lit29 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1311_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV92Lit29 = GXt_char1 ;
         GXt_char1 = AV93Lit30 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV93Lit30 = GXt_char1 ;
         GXt_char1 = AV102Lit40 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN674_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV102Lit40 = GXt_char1 ;
         GXt_char1 = AV104Lit50 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV104Lit50 = GXt_char1 ;
         AV105Lit51 = httpContext.getMessage( "Inicial", "") ;
         AV106Lit52 = httpContext.getMessage( "Final", "") ;
         GXt_char1 = AV107Lit53 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV107Lit53 = GXt_char1 ;
         GXt_int5 = (byte)(DecimalUtil.decToDouble(AV110Intexco)) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
         rhrhr02sc_impl.this.GXt_int5 = GXv_int6[0] ;
         AV110Intexco = DecimalUtil.doubleToDec(GXt_int5) ;
         AV113Lit900 = httpContext.getMessage( "Lote Fiaçao", "") ;
         if ( AV112jPF == 0 )
         {
            AV113Lit900 = " " ;
         }
         AV170Lit200 = httpContext.getMessage( "AS", "") ;
         AV171Lit201 = httpContext.getMessage( "Largura em cru", "") ;
         AV172Lit202 = httpContext.getMessage( "Gramagem em cru", "") ;
         AV173Lit203 = httpContext.getMessage( "Largura Final", "") ;
         AV174Lit204 = httpContext.getMessage( "Gramagem final", "") ;
         AV175Lit301 = httpContext.getMessage( "AI", "") ;
         AV176Lit302 = httpContext.getMessage( "EXT", "") ;
         AV177Lit303 = httpContext.getMessage( "VTS", "") ;
         AV201Lit503 = httpContext.getMessage( "VTI", "") ;
         AV178Lit304 = httpContext.getMessage( "VM", "") ;
         AV179Lit400 = httpContext.getMessage( "AS", "") ;
         AV180Lit401 = httpContext.getMessage( "AI", "") ;
         AV181Lit402 = httpContext.getMessage( "TR", "") ;
         AV182Lit403 = httpContext.getMessage( "VM", "") ;
         AV183Lit404 = httpContext.getMessage( "EXT", "") ;
         AV184Lit405 = httpContext.getMessage( "VTS", "") ;
         AV185Lit406 = httpContext.getMessage( "VTI", "") ;
         AV186Lit407 = httpContext.getMessage( "Medida", "") ;
         AV187Lit408 = httpContext.getMessage( "Gramagem", "") ;
         AV188Lit409 = httpContext.getMessage( "Enc. Largura", "") ;
         AV189Lit500 = httpContext.getMessage( "Enc. Comprimento", "") ;
         AV190Lit501 = httpContext.getMessage( "Torçao", "") ;
         GXt_char1 = AV199LitPedCli ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1098_", ""), (byte)(99), GXv_char4) ;
         rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV199LitPedCli = GXt_char1 ;
         /* Using cursor P07HB2 */
         pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, AV110Intexco});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P07HB2_A130BarCodPar[0] ;
            A132BarCodReo = P07HB2_A132BarCodReo[0] ;
            A129BarCod = P07HB2_A129BarCod[0] ;
            A396EmprCod = P07HB2_A396EmprCod[0] ;
            A970ProceCod = P07HB2_A970ProceCod[0] ;
            n970ProceCod = P07HB2_n970ProceCod[0] ;
            A44AlbRecCod = P07HB2_A44AlbRecCod[0] ;
            A971ProceNom = P07HB2_A971ProceNom[0] ;
            n971ProceNom = P07HB2_n971ProceNom[0] ;
            A200BarPieCod = P07HB2_A200BarPieCod[0] ;
            A970ProceCod = P07HB2_A970ProceCod[0] ;
            n970ProceCod = P07HB2_n970ProceCod[0] ;
            A971ProceNom = P07HB2_A971ProceNom[0] ;
            n971ProceNom = P07HB2_n971ProceNom[0] ;
            AV109ProceNom = A971ProceNom ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P07HB3 */
         pr_default.execute(1, new Object[] {AV10EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P07HB3_A396EmprCod[0] ;
            A407EmprNom = P07HB3_A407EmprNom[0] ;
            n407EmprNom = P07HB3_n407EmprNom[0] ;
            AV36NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV8Termin = context.getWorkstationId( remoteHandle) ;
         /* Using cursor P07HB4 */
         pr_default.execute(2, new Object[] {AV8Termin});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A942TermCod = P07HB4_A942TermCod[0] ;
            A1189TermUsu = P07HB4_A1189TermUsu[0] ;
            n1189TermUsu = P07HB4_n1189TermUsu[0] ;
            AV9TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV91LinMaq = (short)(0) ;
         GxHdr5 = true ;
         /* Using cursor P07HB5 */
         pr_default.execute(3, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE), Short.valueOf(AV136HreLinmaq)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A4542HreTotKgm = P07HB5_A4542HreTotKgm[0] ;
            n4542HreTotKgm = P07HB5_n4542HreTotKgm[0] ;
            A4544HreTotPie = P07HB5_A4544HreTotPie[0] ;
            n4544HreTotPie = P07HB5_n4544HreTotPie[0] ;
            A4545HreLinMaq = P07HB5_A4545HreLinMaq[0] ;
            A4495HreNumCie = P07HB5_A4495HreNumCie[0] ;
            A4494HreBarPar = P07HB5_A4494HreBarPar[0] ;
            A4493HreBarReo = P07HB5_A4493HreBarReo[0] ;
            A4492HreBarCod = P07HB5_A4492HreBarCod[0] ;
            A396EmprCod = P07HB5_A396EmprCod[0] ;
            A697HreLotF = P07HB5_A697HreLotF[0] ;
            n697HreLotF = P07HB5_n697HreLotF[0] ;
            A4516HreDisCli = P07HB5_A4516HreDisCli[0] ;
            n4516HreDisCli = P07HB5_n4516HreDisCli[0] ;
            A11318HreDispCli = P07HB5_A11318HreDispCli[0] ;
            n11318HreDispCli = P07HB5_n11318HreDispCli[0] ;
            A4548HreFacAbs = P07HB5_A4548HreFacAbs[0] ;
            n4548HreFacAbs = P07HB5_n4548HreFacAbs[0] ;
            A10099HreLtsRc = P07HB5_A10099HreLtsRc[0] ;
            n10099HreLtsRc = P07HB5_n10099HreLtsRc[0] ;
            A10100HreHdrLts = P07HB5_A10100HreHdrLts[0] ;
            n10100HreHdrLts = P07HB5_n10100HreHdrLts[0] ;
            A10101HreFabs = P07HB5_A10101HreFabs[0] ;
            n10101HreFabs = P07HB5_n10101HreFabs[0] ;
            A9805HreLtsSR = P07HB5_A9805HreLtsSR[0] ;
            n9805HreLtsSR = P07HB5_n9805HreLtsSR[0] ;
            A9810HreAbs = P07HB5_A9810HreAbs[0] ;
            n9810HreAbs = P07HB5_n9810HreAbs[0] ;
            A10383HreVel = P07HB5_A10383HreVel[0] ;
            n10383HreVel = P07HB5_n10383HreVel[0] ;
            A10381HreAnc = P07HB5_A10381HreAnc[0] ;
            n10381HreAnc = P07HB5_n10381HreAnc[0] ;
            A10382HreGrm = P07HB5_A10382HreGrm[0] ;
            n10382HreGrm = P07HB5_n10382HreGrm[0] ;
            A10384HreObs = P07HB5_A10384HreObs[0] ;
            n10384HreObs = P07HB5_n10384HreObs[0] ;
            A11508HreAva = P07HB5_A11508HreAva[0] ;
            n11508HreAva = P07HB5_n11508HreAva[0] ;
            A12127HreAi = P07HB5_A12127HreAi[0] ;
            n12127HreAi = P07HB5_n12127HreAi[0] ;
            A12126HreAs = P07HB5_A12126HreAs[0] ;
            n12126HreAs = P07HB5_n12126HreAs[0] ;
            A9804HreAcab = P07HB5_A9804HreAcab[0] ;
            n9804HreAcab = P07HB5_n9804HreAcab[0] ;
            A10104HreDtf = P07HB5_A10104HreDtf[0] ;
            n10104HreDtf = P07HB5_n10104HreDtf[0] ;
            A10103HreDti = P07HB5_A10103HreDti[0] ;
            n10103HreDti = P07HB5_n10103HreDti[0] ;
            A10102HreNumInt = P07HB5_A10102HreNumInt[0] ;
            n10102HreNumInt = P07HB5_n10102HreNumInt[0] ;
            A4533HreBarMtr = P07HB5_A4533HreBarMtr[0] ;
            n4533HreBarMtr = P07HB5_n4533HreBarMtr[0] ;
            A4532HreBarKgm = P07HB5_A4532HreBarKgm[0] ;
            n4532HreBarKgm = P07HB5_n4532HreBarKgm[0] ;
            A1094HreNPrg = P07HB5_A1094HreNPrg[0] ;
            n1094HreNPrg = P07HB5_n1094HreNPrg[0] ;
            A8623HreHilasa = P07HB5_A8623HreHilasa[0] ;
            n8623HreHilasa = P07HB5_n8623HreHilasa[0] ;
            A8625HreOpa = P07HB5_A8625HreOpa[0] ;
            n8625HreOpa = P07HB5_n8625HreOpa[0] ;
            A8624HreEnsayo = P07HB5_A8624HreEnsayo[0] ;
            n8624HreEnsayo = P07HB5_n8624HreEnsayo[0] ;
            A4960HreFecAlt = P07HB5_A4960HreFecAlt[0] ;
            n4960HreFecAlt = P07HB5_n4960HreFecAlt[0] ;
            A4863HreUsrCod = P07HB5_A4863HreUsrCod[0] ;
            n4863HreUsrCod = P07HB5_n4863HreUsrCod[0] ;
            A4543HreTotMtr = P07HB5_A4543HreTotMtr[0] ;
            n4543HreTotMtr = P07HB5_n4543HreTotMtr[0] ;
            A4546HreMaqCod = P07HB5_A4546HreMaqCod[0] ;
            n4546HreMaqCod = P07HB5_n4546HreMaqCod[0] ;
            A4547HreVolPrd = P07HB5_A4547HreVolPrd[0] ;
            n4547HreVolPrd = P07HB5_n4547HreVolPrd[0] ;
            A4540HreIntDsc = P07HB5_A4540HreIntDsc[0] ;
            n4540HreIntDsc = P07HB5_n4540HreIntDsc[0] ;
            A4526HreTipColN = P07HB5_A4526HreTipColN[0] ;
            n4526HreTipColN = P07HB5_n4526HreTipColN[0] ;
            A4525HreTipCol = P07HB5_A4525HreTipCol[0] ;
            n4525HreTipCol = P07HB5_n4525HreTipCol[0] ;
            A4522HreColNum = P07HB5_A4522HreColNum[0] ;
            n4522HreColNum = P07HB5_n4522HreColNum[0] ;
            A4521HreColNom = P07HB5_A4521HreColNom[0] ;
            n4521HreColNom = P07HB5_n4521HreColNom[0] ;
            A4518HreBarDsc = P07HB5_A4518HreBarDsc[0] ;
            n4518HreBarDsc = P07HB5_n4518HreBarDsc[0] ;
            A4517HreBarSer = P07HB5_A4517HreBarSer[0] ;
            n4517HreBarSer = P07HB5_n4517HreBarSer[0] ;
            A279CliNom = P07HB5_A279CliNom[0] ;
            A252CliCod = P07HB5_A252CliCod[0] ;
            n252CliCod = P07HB5_n252CliCod[0] ;
            A9808HreRacab = P07HB5_A9808HreRacab[0] ;
            n9808HreRacab = P07HB5_n9808HreRacab[0] ;
            A4542HreTotKgm = P07HB5_A4542HreTotKgm[0] ;
            n4542HreTotKgm = P07HB5_n4542HreTotKgm[0] ;
            A4544HreTotPie = P07HB5_A4544HreTotPie[0] ;
            n4544HreTotPie = P07HB5_n4544HreTotPie[0] ;
            A4516HreDisCli = P07HB5_A4516HreDisCli[0] ;
            n4516HreDisCli = P07HB5_n4516HreDisCli[0] ;
            A11318HreDispCli = P07HB5_A11318HreDispCli[0] ;
            n11318HreDispCli = P07HB5_n11318HreDispCli[0] ;
            A10099HreLtsRc = P07HB5_A10099HreLtsRc[0] ;
            n10099HreLtsRc = P07HB5_n10099HreLtsRc[0] ;
            A10100HreHdrLts = P07HB5_A10100HreHdrLts[0] ;
            n10100HreHdrLts = P07HB5_n10100HreHdrLts[0] ;
            A10101HreFabs = P07HB5_A10101HreFabs[0] ;
            n10101HreFabs = P07HB5_n10101HreFabs[0] ;
            A9805HreLtsSR = P07HB5_A9805HreLtsSR[0] ;
            n9805HreLtsSR = P07HB5_n9805HreLtsSR[0] ;
            A9810HreAbs = P07HB5_A9810HreAbs[0] ;
            n9810HreAbs = P07HB5_n9810HreAbs[0] ;
            A4533HreBarMtr = P07HB5_A4533HreBarMtr[0] ;
            n4533HreBarMtr = P07HB5_n4533HreBarMtr[0] ;
            A4532HreBarKgm = P07HB5_A4532HreBarKgm[0] ;
            n4532HreBarKgm = P07HB5_n4532HreBarKgm[0] ;
            A8623HreHilasa = P07HB5_A8623HreHilasa[0] ;
            n8623HreHilasa = P07HB5_n8623HreHilasa[0] ;
            A8625HreOpa = P07HB5_A8625HreOpa[0] ;
            n8625HreOpa = P07HB5_n8625HreOpa[0] ;
            A8624HreEnsayo = P07HB5_A8624HreEnsayo[0] ;
            n8624HreEnsayo = P07HB5_n8624HreEnsayo[0] ;
            A4543HreTotMtr = P07HB5_A4543HreTotMtr[0] ;
            n4543HreTotMtr = P07HB5_n4543HreTotMtr[0] ;
            A4540HreIntDsc = P07HB5_A4540HreIntDsc[0] ;
            n4540HreIntDsc = P07HB5_n4540HreIntDsc[0] ;
            A4526HreTipColN = P07HB5_A4526HreTipColN[0] ;
            n4526HreTipColN = P07HB5_n4526HreTipColN[0] ;
            A4525HreTipCol = P07HB5_A4525HreTipCol[0] ;
            n4525HreTipCol = P07HB5_n4525HreTipCol[0] ;
            A4522HreColNum = P07HB5_A4522HreColNum[0] ;
            n4522HreColNum = P07HB5_n4522HreColNum[0] ;
            A4521HreColNom = P07HB5_A4521HreColNom[0] ;
            n4521HreColNom = P07HB5_n4521HreColNom[0] ;
            A4518HreBarDsc = P07HB5_A4518HreBarDsc[0] ;
            n4518HreBarDsc = P07HB5_n4518HreBarDsc[0] ;
            A4517HreBarSer = P07HB5_A4517HreBarSer[0] ;
            n4517HreBarSer = P07HB5_n4517HreBarSer[0] ;
            A252CliCod = P07HB5_A252CliCod[0] ;
            n252CliCod = P07HB5_n252CliCod[0] ;
            A9808HreRacab = P07HB5_A9808HreRacab[0] ;
            n9808HreRacab = P07HB5_n9808HreRacab[0] ;
            A279CliNom = P07HB5_A279CliNom[0] ;
            AV99HreMaqCod = A4546HreMaqCod ;
            AV114Hrelotf = A697HreLotF ;
            if ( AV112jPF == 0 )
            {
               AV114Hrelotf = " " ;
            }
            AV200Hredispcli = ((GXutil.strcmp(A11318HreDispCli, "")!=0) ? A11318HreDispCli : A4516HreDisCli) ;
            AV115HreFacAbs = A4548HreFacAbs ;
            AV116HreLtsRc = A10099HreLtsRc ;
            AV118HreHdrLts = GXutil.substring( A10100HreHdrLts, 1, 8) + "-" + GXutil.substring( A10100HreHdrLts, 9, 1) + GXutil.substring( A10100HreHdrLts, 10, 1) ;
            AV119HreFabs = A10101HreFabs ;
            AV117HreLtsSr = A9805HreLtsSR ;
            AV120Hreabs = A9810HreAbs ;
            AV130Recabsfac = A10383HreVel ;
            AV128RecAnc = A10381HreAnc ;
            AV129Recgrm = A10382HreGrm ;
            AV134recobsq = A10384HreObs ;
            AV195Hreava = A11508HreAva ;
            AV197RecAi = A12127HreAi ;
            AV196RecAs = A12126HreAs ;
            /* Execute user subroutine: 'MAQUIN' */
            S161 ();
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
            AV19RelBany = GXutil.roundDecimal( (DecimalUtil.doubleToDec(A4547HreVolPrd).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)), 1) ;
            GXt_char1 = AV111Lit300 ;
            GXv_char4[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char4) ;
            rhrhr02sc_impl.this.GXt_char1 = GXv_char4[0] ;
            AV111Lit300 = GXt_char1 ;
            AV42CosteT1 = DecimalUtil.doubleToDec(0) ;
            AV43CosteT2 = DecimalUtil.doubleToDec(0) ;
            AV98Tiempo_t = (short)(0) ;
            /* Using cursor P07HB6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4550HreLinPro = P07HB6_A4550HreLinPro[0] ;
               A4551HreProCod = P07HB6_A4551HreProCod[0] ;
               A4553HreProTie = P07HB6_A4553HreProTie[0] ;
               A4555HreNumPro = P07HB6_A4555HreNumPro[0] ;
               A4966HreVolPro = P07HB6_A4966HreVolPro[0] ;
               A4552HreProDsc = P07HB6_A4552HreProDsc[0] ;
               if ( ( AV91LinMaq != A4545HreLinMaq ) && ( AV91LinMaq != 0 ) )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV91LinMaq = A4545HreLinMaq ;
               AV97HreProCod = A4551HreProCod ;
               /* Execute user subroutine: 'CPROFO' */
               S151 ();
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
               h7HB0( false, 28) ;
               getPrinter().GxDrawRect(7, Gx_line+5, 771, Gx_line+25, 2, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4551HreProCod, "")), 92, Gx_line+6, 137, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4552HreProDsc, "")), 142, Gx_line+6, 393, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit19, "")), 19, Gx_line+6, 87, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Lit29, "")), 532, Gx_line+6, 600, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9")), 605, Gx_line+6, 639, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4966HreVolPro), "ZZZZ9")), 719, Gx_line+6, 762, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Lit30, "")), 647, Gx_line+6, 731, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4555HreNumPro), "ZZZZ9")), 396, Gx_line+6, 433, Gx_line+23, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Prog", ""), 334, Gx_line+6, 385, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tmp", ""), 436, Gx_line+6, 462, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4553HreProTie), "ZZZ9")), 471, Gx_line+6, 501, Gx_line+23, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
               AV31Coste1 = DecimalUtil.doubleToDec(0) ;
               AV32Coste2 = DecimalUtil.doubleToDec(0) ;
               AV30CosteA1 = DecimalUtil.doubleToDec(0) ;
               AV29CosteP1 = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P07HB7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A5726HreLote = P07HB7_A5726HreLote[0] ;
                  n5726HreLote = P07HB7_n5726HreLote[0] ;
                  A719PrdNum = P07HB7_A719PrdNum[0] ;
                  n719PrdNum = P07HB7_n719PrdNum[0] ;
                  A4967HrePrePrd = P07HB7_A4967HrePrePrd[0] ;
                  n4967HrePrePrd = P07HB7_n4967HrePrePrd[0] ;
                  A4563HrePrdCant = P07HB7_A4563HrePrdCant[0] ;
                  n4563HrePrdCant = P07HB7_n4563HrePrdCant[0] ;
                  A4565HreCanAny = P07HB7_A4565HreCanAny[0] ;
                  n4565HreCanAny = P07HB7_n4565HreCanAny[0] ;
                  A4558HrePrdNum = P07HB7_A4558HrePrdNum[0] ;
                  n4558HrePrdNum = P07HB7_n4558HrePrdNum[0] ;
                  A4561HrePrdUDs = P07HB7_A4561HrePrdUDs[0] ;
                  n4561HrePrdUDs = P07HB7_n4561HrePrdUDs[0] ;
                  A4562HreFacCon = P07HB7_A4562HreFacCon[0] ;
                  n4562HreFacCon = P07HB7_n4562HreFacCon[0] ;
                  A4560HrePrdUMe = P07HB7_A4560HrePrdUMe[0] ;
                  n4560HrePrdUMe = P07HB7_n4560HrePrdUMe[0] ;
                  A743PrdUniCon = P07HB7_A743PrdUniCon[0] ;
                  A4559HrePrdDsc = P07HB7_A4559HrePrdDsc[0] ;
                  n4559HrePrdDsc = P07HB7_n4559HrePrdDsc[0] ;
                  A12642HrePrdDc2 = P07HB7_A12642HrePrdDc2[0] ;
                  n12642HrePrdDc2 = P07HB7_n12642HrePrdDc2[0] ;
                  A4557HreRecLin = P07HB7_A4557HreRecLin[0] ;
                  A743PrdUniCon = P07HB7_A743PrdUniCon[0] ;
                  AV198Lote = A5726HreLote ;
                  AV89PrdNum = A719PrdNum ;
                  /* Execute user subroutine: 'PRODUC' */
                  S141 ();
                  if ( returnInSub )
                  {
                     pr_default.close(5);
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
                  if ( AV112jPF == 0 )
                  {
                     /* Execute user subroutine: 'HISREA' */
                     S181 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
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
                  }
                  AV31Coste1 = GXutil.roundDecimal( A4563HrePrdCant.multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV32Coste2 = GXutil.roundDecimal( (A4563HrePrdCant.add((A4565HreCanAny.add(AV76PrdCFin)))).multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV33CantFinal = A4563HrePrdCant.add(A4565HreCanAny).add(AV76PrdCFin) ;
                  AV40CodPrd = GXutil.substring( A4558HrePrdNum, 1, 1) ;
                  AV108Und = GXutil.substring( A4561HrePrdUDs, 1, 4) ;
                  AV39Unidades = A4561HrePrdUDs ;
                  AV37PrdCant = A4563HrePrdCant ;
                  AV38PrdCanAny = (A4563HrePrdCant.add((A4565HreCanAny.add(AV76PrdCFin)))) ;
                  AV103HREFACCON = A4562HreFacCon ;
                  if ( A4560HrePrdUMe == 2 )
                  {
                     AV39Unidades = httpContext.getMessage( "Cc", "") ;
                  }
                  else
                  {
                     if ( A4560HrePrdUMe == 3 )
                     {
                        if ( A743PrdUniCon == 3 )
                        {
                           AV39Unidades = httpContext.getMessage( "Cc", "") ;
                        }
                        else
                        {
                           AV39Unidades = httpContext.getMessage( "Gr", "") ;
                        }
                     }
                     else
                     {
                        AV39Unidades = httpContext.getMessage( "Gr", "") ;
                        if ( A743PrdUniCon == 3 )
                        {
                           AV39Unidades = httpContext.getMessage( "Cc", "") ;
                        }
                     }
                  }
                  if ( ( GXutil.strcmp(A4559HrePrdDsc, httpContext.getMessage( "AGUA", "")) == 0 ) && ( AV94F_laundry == 1 ) )
                  {
                  }
                  else
                  {
                     if ( GXutil.strcmp(AV40CodPrd, " ") == 0 )
                     {
                        if ( AV127Carvema == 0 )
                        {
                           h7HB0( false, 17) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 13, Gx_line+0, 58, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 64, Gx_line+0, 255, Gx_line+17, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                        else
                        {
                           AV205Linea2 = A4559HrePrdDsc + A12642HrePrdDc2 ;
                           h7HB0( false, 17) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 13, Gx_line+0, 58, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV205Linea2, "")), 64, Gx_line+0, 619, Gx_line+17, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(AV40CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "0") == 0 ) )
                        {
                           h7HB0( false, 18) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 13, Gx_line+0, 58, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 64, Gx_line+0, 255, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37PrdCant, "ZZZZ9.999")), 373, Gx_line+0, 447, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZZZ9.999")), 495, Gx_line+0, 576, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 451, Gx_line+0, 481, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 581, Gx_line+0, 611, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV103HREFACCON, "ZZ9.99999")), 263, Gx_line+1, 330, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108Und, "")), 335, Gx_line+1, 365, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198Lote, "")), 629, Gx_line+0, 776, Gx_line+17, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+18) ;
                        }
                        else
                        {
                           if ( GXutil.strcmp(GXutil.substring( AV40CodPrd, 1, 1), httpContext.getMessage( "C", "")) == 0 )
                           {
                              if ( AV127Carvema == 0 )
                              {
                                 h7HB0( false, 17) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 13, Gx_line+0, 58, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 64, Gx_line+0, 255, Gx_line+17, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                              else
                              {
                                 AV205Linea2 = A4559HrePrdDsc + A12642HrePrdDc2 ;
                                 h7HB0( false, 17) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 13, Gx_line+0, 58, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV205Linea2, "")), 64, Gx_line+0, 619, Gx_line+17, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                           }
                           else
                           {
                              h7HB0( false, 18) ;
                              getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 64, Gx_line+0, 255, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37PrdCant, "ZZZZ9.999")), 373, Gx_line+0, 447, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZZZ9.999")), 495, Gx_line+0, 576, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 451, Gx_line+0, 481, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 581, Gx_line+0, 611, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 13, Gx_line+0, 58, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV103HREFACCON, "ZZ9.99999")), 263, Gx_line+0, 330, Gx_line+18, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108Und, "")), 335, Gx_line+1, 365, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198Lote, "")), 629, Gx_line+0, 776, Gx_line+17, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+18) ;
                           }
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
               AV42CosteT1 = AV42CosteT1.add(AV29CosteP1) ;
               AV43CosteT2 = AV43CosteT2.add(AV30CosteA1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV84Pesaje = (byte)(0) ;
            /* Using cursor P07HB8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A4508HreLinMAL = P07HB8_A4508HreLinMAL[0] ;
               A719PrdNum = P07HB8_A719PrdNum[0] ;
               n719PrdNum = P07HB8_n719PrdNum[0] ;
               A4509HreNumAny = P07HB8_A4509HreNumAny[0] ;
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
               h7HB0( false, 20) ;
               getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Lit28, "")), 11, Gx_line+0, 194, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               /* Using cursor P07HB9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A4508HreLinMAL = P07HB9_A4508HreLinMAL[0] ;
                  A719PrdNum = P07HB9_A719PrdNum[0] ;
                  n719PrdNum = P07HB9_n719PrdNum[0] ;
                  A724PrdPreAct = P07HB9_A724PrdPreAct[0] ;
                  A707PrdFacCon = P07HB9_A707PrdFacCon[0] ;
                  A4511HrePrdCFin = P07HB9_A4511HrePrdCFin[0] ;
                  n4511HrePrdCFin = P07HB9_n4511HrePrdCFin[0] ;
                  A5808HreLanyLot = P07HB9_A5808HreLanyLot[0] ;
                  n5808HreLanyLot = P07HB9_n5808HreLanyLot[0] ;
                  A718PrdNom = P07HB9_A718PrdNom[0] ;
                  A4509HreNumAny = P07HB9_A4509HreNumAny[0] ;
                  A724PrdPreAct = P07HB9_A724PrdPreAct[0] ;
                  A707PrdFacCon = P07HB9_A707PrdFacCon[0] ;
                  A718PrdNom = P07HB9_A718PrdNom[0] ;
                  AV86PrdPreAct = A724PrdPreAct ;
                  AV31Coste1 = DecimalUtil.doubleToDec(0) ;
                  AV32Coste2 = GXutil.roundDecimal( A4511HrePrdCFin.multiply(AV86PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV40CodPrd = GXutil.substring( A719PrdNum, 1, 1) ;
                  AV37PrdCant = DecimalUtil.doubleToDec(0) ;
                  AV38PrdCanAny = A4511HrePrdCFin ;
                  AV40CodPrd = GXutil.substring( A719PrdNum, 1, 1) ;
                  AV198Lote = A5808HreLanyLot ;
                  if ( ( GXutil.strcmp(AV40CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "0") == 0 ) )
                  {
                     h7HB0( false, 18) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 11, Gx_line+1, 56, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 63, Gx_line+1, 254, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZZZ9.999")), 475, Gx_line+1, 556, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198Lote, "")), 629, Gx_line+0, 776, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     h7HB0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 63, Gx_line+0, 254, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 11, Gx_line+0, 56, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZZZ9.999")), 475, Gx_line+0, 556, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198Lote, "")), 629, Gx_line+0, 776, Gx_line+17, 0+256, 0, 0, 0) ;
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
            AV81FlagAgr = (byte)(0) ;
            if ( GXutil.strcmp(A9804HreAcab, httpContext.getMessage( "S", "")) != 0 )
            {
               /* Execute user subroutine: 'AGRUPACIONTINTE' */
               S121 ();
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
            }
            else
            {
               /* Execute user subroutine: 'AGRUPACIONACABADOS' */
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
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         GxHdr5 = false ;
         if ( AV127Carvema == 1 )
         {
            /* Execute user subroutine: 'DATOSC' */
            S171 ();
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
            h7HB0( false, 328) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "g/m2", ""), 623, Gx_line+248, 654, Gx_line+262, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 623, Gx_line+298, 633, Gx_line+312, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 623, Gx_line+273, 633, Gx_line+287, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "cm", ""), 623, Gx_line+223, 641, Gx_line+237, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV153Eta_am), "ZZZ9")), 572, Gx_line+222, 602, Gx_line+239, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV154Eta_ag), "ZZZ9")), 572, Gx_line+247, 602, Gx_line+264, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV155Eta_acp), "ZZZ9")), 572, Gx_line+297, 602, Gx_line+314, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV156Eta_acl), "ZZZ9")), 572, Gx_line+272, 602, Gx_line+289, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV189Lit500, "")), 416, Gx_line+297, 563, Gx_line+315, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV188Lit409, "")), 416, Gx_line+272, 563, Gx_line+290, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV187Lit408, "")), 416, Gx_line+247, 563, Gx_line+265, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV186Lit407, "")), 416, Gx_line+222, 563, Gx_line+240, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV185Lit406, "")), 219, Gx_line+272, 293, Gx_line+290, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV184Lit405, "")), 219, Gx_line+247, 293, Gx_line+265, 0+256, 0, 1, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 183, Gx_line+273, 193, Gx_line+287, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 183, Gx_line+248, 193, Gx_line+262, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 372, Gx_line+223, 382, Gx_line+237, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 183, Gx_line+223, 193, Gx_line+237, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV183Lit404, "")), 219, Gx_line+222, 293, Gx_line+240, 0+256, 0, 1, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV150Eta_avt), "ZZZZZZZZZZZZZ9")), 299, Gx_line+247, 402, Gx_line+264, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV151Eta_aext), "ZZZ9")), 321, Gx_line+222, 351, Gx_line+239, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV152Eta_aar), "ZZZZZZZZZZZZZ9")), 299, Gx_line+272, 402, Gx_line+289, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ACABAR", ""), 22, Gx_line+203, 87, Gx_line+221, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV182Lit403, "")), 22, Gx_line+297, 96, Gx_line+315, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV181Lit402, "")), 22, Gx_line+272, 96, Gx_line+290, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV180Lit401, "")), 22, Gx_line+247, 96, Gx_line+265, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV179Lit400, "")), 22, Gx_line+222, 96, Gx_line+240, 0+256, 0, 1, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV146Eta_avm), "ZZZ9")), 140, Gx_line+297, 170, Gx_line+314, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV147Eta_atr), "ZZZ9")), 140, Gx_line+272, 170, Gx_line+289, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV148Eta_aai, "ZZZ9.99")), 118, Gx_line+247, 170, Gx_line+264, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV149Eta_aas, "ZZZ9.99")), 118, Gx_line+222, 170, Gx_line+239, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(6, Gx_line+203, 771, Gx_line+323, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV157Eta_at), "ZZZ9")), 719, Gx_line+297, 749, Gx_line+314, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV190Lit501, "")), 643, Gx_line+297, 717, Gx_line+315, 0+256, 0, 1, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 752, Gx_line+298, 762, Gx_line+312, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TERMOFIXADO", ""), 21, Gx_line+3, 135, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV170Lit200, "")), 21, Gx_line+31, 168, Gx_line+49, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV171Lit201, "")), 518, Gx_line+31, 665, Gx_line+49, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV172Lit202, "")), 518, Gx_line+56, 665, Gx_line+74, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV173Lit203, "")), 518, Gx_line+81, 665, Gx_line+99, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV174Lit204, "")), 518, Gx_line+106, 665, Gx_line+124, 0+256, 0, 1, 0) ;
            getPrinter().GxDrawRect(6, Gx_line+0, 771, Gx_line+189, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV137As), "ZZZZZ9")), 255, Gx_line+31, 300, Gx_line+48, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV142LC), "ZZZZZ9")), 674, Gx_line+31, 719, Gx_line+48, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV143GRC), "ZZZ9")), 689, Gx_line+56, 719, Gx_line+73, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV144LF), "ZZZ9")), 689, Gx_line+81, 719, Gx_line+98, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV145GRF), "ZZZ9")), 689, Gx_line+106, 719, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 306, Gx_line+32, 316, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "cm", ""), 740, Gx_line+32, 758, Gx_line+46, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "g/m2", ""), 733, Gx_line+57, 764, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "cm", ""), 740, Gx_line+82, 758, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "g/m2", ""), 733, Gx_line+107, 764, Gx_line+121, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175Lit301, "")), 21, Gx_line+56, 168, Gx_line+74, 0+256, 0, 1, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV138Eta_tai, "ZZZ9.99")), 248, Gx_line+56, 300, Gx_line+73, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV139Eta_text), "ZZZ9")), 270, Gx_line+81, 300, Gx_line+98, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV140Eta_tvm), "ZZZ9")), 270, Gx_line+156, 300, Gx_line+173, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 306, Gx_line+57, 316, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV176Lit302, "")), 21, Gx_line+81, 168, Gx_line+99, 0+256, 0, 1, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 306, Gx_line+82, 316, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV177Lit303, "")), 21, Gx_line+106, 168, Gx_line+124, 0+256, 0, 1, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV141Eta_tvt), "ZZZZZZZZZZZZZ9")), 197, Gx_line+106, 300, Gx_line+123, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 306, Gx_line+109, 316, Gx_line+123, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178Lit304, "")), 21, Gx_line+156, 168, Gx_line+174, 0+256, 0, 1, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "m/min", ""), 306, Gx_line+157, 342, Gx_line+171, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "m/min", ""), 183, Gx_line+298, 219, Gx_line+312, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV201Lit503, "")), 21, Gx_line+131, 167, Gx_line+148, 0, 0, 1, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV202Eta_tvtf), "ZZZZZZZZZZZZZ9")), 197, Gx_line+131, 300, Gx_line+148, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 306, Gx_line+132, 316, Gx_line+146, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+328) ;
            AV132Nlin = (short)(GXutil.gxmlines( AV203lb_obsin, (short)(80))) ;
            AV135i = (byte)(1) ;
            while ( AV135i <= AV132Nlin )
            {
               AV204Obs = GXutil.gxgetmli( AV203lb_obsin, AV135i, (short)(80)) ;
               h7HB0( false, 25) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Obs, "")), 22, Gx_line+4, 461, Gx_line+21, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+25) ;
               AV135i = (byte)(AV135i+1) ;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7HB0( true, 0) ;
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

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'AGRUPACIONTINTE' Routine */
      returnInSub = false ;
      /* Using cursor P07HB10 */
      pr_default.execute(8, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A4495HreNumCie = P07HB10_A4495HreNumCie[0] ;
         A4494HreBarPar = P07HB10_A4494HreBarPar[0] ;
         A4493HreBarReo = P07HB10_A4493HreBarReo[0] ;
         A4492HreBarCod = P07HB10_A4492HreBarCod[0] ;
         A396EmprCod = P07HB10_A396EmprCod[0] ;
         A4501HreAgrMtr = P07HB10_A4501HreAgrMtr[0] ;
         A4505HreAgrDsc = P07HB10_A4505HreAgrDsc[0] ;
         A4502HreAgrPie = P07HB10_A4502HreAgrPie[0] ;
         A4500HreAgrKgm = P07HB10_A4500HreAgrKgm[0] ;
         A4504HreAgrSer = P07HB10_A4504HreAgrSer[0] ;
         A4499HreAgrPar = P07HB10_A4499HreAgrPar[0] ;
         A4498HreAgrReo = P07HB10_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P07HB10_A4497HreAgrCod[0] ;
         if ( AV81FlagAgr == 0 )
         {
            AV81FlagAgr = (byte)(1) ;
            h7HB0( false, 41) ;
            getPrinter().GxDrawLine(6, Gx_line+19, 771, Gx_line+19, 2, 0, 0, 0, 0) ;
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
         h7HB0( false, 16) ;
         getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4497HreAgrCod), "ZZZZZZZ9")), 14, Gx_line+1, 73, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4498HreAgrReo), "9")), 75, Gx_line+1, 83, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4499HreAgrPar, "")), 86, Gx_line+1, 94, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4504HreAgrSer, "")), 108, Gx_line+1, 226, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4500HreAgrKgm, "ZZZZZ9.99")), 501, Gx_line+0, 568, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4502HreAgrPie), "ZZZ9")), 702, Gx_line+1, 732, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4505HreAgrDsc, "")), 238, Gx_line+0, 429, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4501HreAgrMtr, "ZZZZZ9.99")), 593, Gx_line+0, 660, Gx_line+16, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+16) ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'AGRUPACIONACABADOS' Routine */
      returnInSub = false ;
      /* Using cursor P07HB11 */
      pr_default.execute(9, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A4495HreNumCie = P07HB11_A4495HreNumCie[0] ;
         A4494HreBarPar = P07HB11_A4494HreBarPar[0] ;
         A4493HreBarReo = P07HB11_A4493HreBarReo[0] ;
         A4492HreBarCod = P07HB11_A4492HreBarCod[0] ;
         A396EmprCod = P07HB11_A396EmprCod[0] ;
         A9990HreAcPie = P07HB11_A9990HreAcPie[0] ;
         n9990HreAcPie = P07HB11_n9990HreAcPie[0] ;
         A9989HreAcMtr = P07HB11_A9989HreAcMtr[0] ;
         n9989HreAcMtr = P07HB11_n9989HreAcMtr[0] ;
         A9988HreAcKgm = P07HB11_A9988HreAcKgm[0] ;
         n9988HreAcKgm = P07HB11_n9988HreAcKgm[0] ;
         A9993HreAcDsc = P07HB11_A9993HreAcDsc[0] ;
         n9993HreAcDsc = P07HB11_n9993HreAcDsc[0] ;
         A9992HreAcSer = P07HB11_A9992HreAcSer[0] ;
         n9992HreAcSer = P07HB11_n9992HreAcSer[0] ;
         A9987HreAcPar = P07HB11_A9987HreAcPar[0] ;
         A9986HreAcReo = P07HB11_A9986HreAcReo[0] ;
         A9985HreAcCod = P07HB11_A9985HreAcCod[0] ;
         if ( AV81FlagAgr == 0 )
         {
            AV81FlagAgr = (byte)(1) ;
            h7HB0( false, 41) ;
            getPrinter().GxDrawLine(6, Gx_line+19, 771, Gx_line+19, 2, 0, 0, 0, 0) ;
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
         h7HB0( false, 17) ;
         getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9985HreAcCod), "ZZZZZZZ9")), 14, Gx_line+0, 73, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9986HreAcReo), "9")), 75, Gx_line+0, 83, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9987HreAcPar, "")), 86, Gx_line+0, 94, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9992HreAcSer, "")), 108, Gx_line+1, 226, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9993HreAcDsc, "")), 238, Gx_line+0, 429, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9988HreAcKgm, "ZZZZZ9.99")), 501, Gx_line+0, 568, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9989HreAcMtr, "ZZZZZ9.99")), 593, Gx_line+0, 660, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9990HreAcPie), "ZZZZZ9")), 688, Gx_line+1, 733, Gx_line+17, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      AV88PrdFacCon = DecimalUtil.doubleToDec(1) ;
      /* Using cursor P07HB12 */
      pr_default.execute(10, new Object[] {AV10EmprCod, AV89PrdNum});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A719PrdNum = P07HB12_A719PrdNum[0] ;
         n719PrdNum = P07HB12_n719PrdNum[0] ;
         A396EmprCod = P07HB12_A396EmprCod[0] ;
         A707PrdFacCon = P07HB12_A707PrdFacCon[0] ;
         AV88PrdFacCon = A707PrdFacCon ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'CPROFO' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P07HB13 */
      pr_default.execute(11, new Object[] {AV10EmprCod, AV97HreProCod});
      c771ProForTie = P07HB13_A771ProForTie[0] ;
      pr_default.close(11);
      AV98Tiempo_t = (short)(AV98Tiempo_t+c771ProForTie) ;
      /* End optimized group. */
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV100MAQCOSMIN = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P07HB14 */
      pr_default.execute(12, new Object[] {AV10EmprCod, AV99HreMaqCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A602MaqCod = P07HB14_A602MaqCod[0] ;
         A396EmprCod = P07HB14_A396EmprCod[0] ;
         A605MaqCosMin = P07HB14_A605MaqCosMin[0] ;
         n605MaqCosMin = P07HB14_n605MaqCosMin[0] ;
         AV100MAQCOSMIN = A605MaqCosMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S116( ) throws ProcessInterruptedException
   {
      /* 'PARJPF' Routine */
      returnInSub = false ;
      /* Using cursor P07HB15 */
      pr_default.execute(13, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A130BarCodPar = P07HB15_A130BarCodPar[0] ;
         A132BarCodReo = P07HB15_A132BarCodReo[0] ;
         A129BarCod = P07HB15_A129BarCod[0] ;
         A396EmprCod = P07HB15_A396EmprCod[0] ;
         A9737BarValPar = P07HB15_A9737BarValPar[0] ;
         A3295BarParVal = P07HB15_A3295BarParVal[0] ;
         A12671BarParVl2 = P07HB15_A12671BarParVl2[0] ;
         A1664ParFasCod = P07HB15_A1664ParFasCod[0] ;
         A194BarOrdLin = P07HB15_A194BarOrdLin[0] ;
         A758ProCod = P07HB15_A758ProCod[0] ;
         if ( A1664ParFasCod == 50 )
         {
            AV121Varp1 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
         }
         if ( A1664ParFasCod == 4 )
         {
            AV122Varp2 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
         }
         if ( A1664ParFasCod == 40 )
         {
            AV123Varpar3 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
         }
         if ( A1664ParFasCod == 100 )
         {
            AV124VarP4 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
         }
         if ( A1664ParFasCod == 101 )
         {
            AV125VarP5 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
         }
         if ( ( A1664ParFasCod == 200 ) || ( A1664ParFasCod == 201 ) )
         {
            AV126varP6 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'DATOSC' Routine */
      returnInSub = false ;
      /* Using cursor P07HB16 */
      pr_default.execute(14, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A130BarCodPar = P07HB16_A130BarCodPar[0] ;
         A132BarCodReo = P07HB16_A132BarCodReo[0] ;
         A129BarCod = P07HB16_A129BarCod[0] ;
         A396EmprCod = P07HB16_A396EmprCod[0] ;
         A4834BarAudOpe = P07HB16_A4834BarAudOpe[0] ;
         n4834BarAudOpe = P07HB16_n4834BarAudOpe[0] ;
         A4836BarAudSup = P07HB16_A4836BarAudSup[0] ;
         A4838BarAudNPz = P07HB16_A4838BarAudNPz[0] ;
         n4838BarAudNPz = P07HB16_n4838BarAudNPz[0] ;
         A4844BarAudULin = P07HB16_A4844BarAudULin[0] ;
         n4844BarAudULin = P07HB16_n4844BarAudULin[0] ;
         A4460BarLotPza = P07HB16_A4460BarLotPza[0] ;
         n4460BarLotPza = P07HB16_n4460BarLotPza[0] ;
         AV137As = A4834BarAudOpe ;
         AV142LC = A4836BarAudSup ;
         AV143GRC = A4838BarAudNPz ;
         AV144LF = A4844BarAudULin ;
         AV145GRF = A4460BarLotPza ;
         /* Using cursor P07HB17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A11213Eta_hdr = P07HB17_A11213Eta_hdr[0] ;
            A11214Eta_hdrr = P07HB17_A11214Eta_hdrr[0] ;
            A11215Eta_hdrp = P07HB17_A11215Eta_hdrp[0] ;
            A11227Eta_tai = P07HB17_A11227Eta_tai[0] ;
            n11227Eta_tai = P07HB17_n11227Eta_tai[0] ;
            A11228Eta_text = P07HB17_A11228Eta_text[0] ;
            n11228Eta_text = P07HB17_n11228Eta_text[0] ;
            A11230Eta_tvm = P07HB17_A11230Eta_tvm[0] ;
            n11230Eta_tvm = P07HB17_n11230Eta_tvm[0] ;
            A11229Eta_tvt = P07HB17_A11229Eta_tvt[0] ;
            n11229Eta_tvt = P07HB17_n11229Eta_tvt[0] ;
            A11232Eta_aai = P07HB17_A11232Eta_aai[0] ;
            n11232Eta_aai = P07HB17_n11232Eta_aai[0] ;
            A11237Eta_aar = P07HB17_A11237Eta_aar[0] ;
            n11237Eta_aar = P07HB17_n11237Eta_aar[0] ;
            A11231Eta_aas = P07HB17_A11231Eta_aas[0] ;
            n11231Eta_aas = P07HB17_n11231Eta_aas[0] ;
            A11241Eta_acl = P07HB17_A11241Eta_acl[0] ;
            n11241Eta_acl = P07HB17_n11241Eta_acl[0] ;
            A11240Eta_acp = P07HB17_A11240Eta_acp[0] ;
            n11240Eta_acp = P07HB17_n11240Eta_acp[0] ;
            A11235Eta_aext = P07HB17_A11235Eta_aext[0] ;
            n11235Eta_aext = P07HB17_n11235Eta_aext[0] ;
            A11239Eta_ag = P07HB17_A11239Eta_ag[0] ;
            n11239Eta_ag = P07HB17_n11239Eta_ag[0] ;
            A11238Eta_am = P07HB17_A11238Eta_am[0] ;
            n11238Eta_am = P07HB17_n11238Eta_am[0] ;
            A11242Eta_at = P07HB17_A11242Eta_at[0] ;
            n11242Eta_at = P07HB17_n11242Eta_at[0] ;
            A11233Eta_atr = P07HB17_A11233Eta_atr[0] ;
            n11233Eta_atr = P07HB17_n11233Eta_atr[0] ;
            A11234Eta_avm = P07HB17_A11234Eta_avm[0] ;
            n11234Eta_avm = P07HB17_n11234Eta_avm[0] ;
            A11236Eta_avt = P07HB17_A11236Eta_avt[0] ;
            n11236Eta_avt = P07HB17_n11236Eta_avt[0] ;
            AV138Eta_tai = A11227Eta_tai ;
            AV139Eta_text = A11228Eta_text ;
            AV140Eta_tvm = A11230Eta_tvm ;
            AV141Eta_tvt = A11229Eta_tvt ;
            AV141Eta_tvt = A11229Eta_tvt ;
            AV148Eta_aai = A11232Eta_aai ;
            AV152Eta_aar = A11237Eta_aar ;
            AV149Eta_aas = A11231Eta_aas ;
            AV156Eta_acl = A11241Eta_acl ;
            AV155Eta_acp = A11240Eta_acp ;
            AV151Eta_aext = A11235Eta_aext ;
            AV154Eta_ag = A11239Eta_ag ;
            AV153Eta_am = A11238Eta_am ;
            AV157Eta_at = A11242Eta_at ;
            AV147Eta_atr = A11233Eta_atr ;
            AV146Eta_avm = A11234Eta_avm ;
            AV150Eta_avt = A11236Eta_avt ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
      AV203lb_obsin = "" ;
      /* Using cursor P07HB18 */
      pr_default.execute(16, new Object[] {Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A9613Lb_Hdrp = P07HB18_A9613Lb_Hdrp[0] ;
         A9612Lb_Hdrr = P07HB18_A9612Lb_Hdrr[0] ;
         A9611Lb_Hdr = P07HB18_A9611Lb_Hdr[0] ;
         A9721Lb_obsprb = P07HB18_A9721Lb_obsprb[0] ;
         n9721Lb_obsprb = P07HB18_n9721Lb_obsprb[0] ;
         A396EmprCod = P07HB18_A396EmprCod[0] ;
         AV203lb_obsin = A9721Lb_obsprb ;
         pr_default.readNext(16);
      }
      pr_default.close(16);
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'HISREA' Routine */
      returnInSub = false ;
      AV76PrdCFin = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P07HB19 */
      pr_default.execute(17, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE), Short.valueOf(AV136HreLinmaq), AV89PrdNum});
      c4511HrePrdCFin = P07HB19_A4511HrePrdCFin[0] ;
      n4511HrePrdCFin = P07HB19_n4511HrePrdCFin[0] ;
      pr_default.close(17);
      AV76PrdCFin = AV76PrdCFin.add(c4511HrePrdCFin) ;
      /* End optimized group. */
   }

   public void h7HB0( boolean bFoot ,
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
               getPrinter().GxDrawLine(6, Gx_line+3, 771, Gx_line+3, 1, 0, 0, 0, 0) ;
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
               getPrinter().GxDrawRect(536, Gx_line+70, 773, Gx_line+262, 2, 128, 128, 128, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9")), 138, Gx_line+79, 206, Gx_line+97, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), 229, Gx_line+79, 238, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9")), 214, Gx_line+79, 223, Gx_line+97, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 116, Gx_line+107, 161, Gx_line+124, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 177, Gx_line+107, 397, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4517HreBarSer, "")), 116, Gx_line+130, 234, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4518HreBarDsc, "")), 248, Gx_line+130, 439, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4521HreColNom, "")), 116, Gx_line+154, 212, Gx_line+171, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4522HreColNum), "ZZZZZ9")), 215, Gx_line+154, 260, Gx_line+171, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4525HreTipCol), "Z9")), 308, Gx_line+154, 324, Gx_line+171, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4526HreTipColN, "")), 328, Gx_line+154, 519, Gx_line+171, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4540HreIntDsc, "")), 116, Gx_line+177, 336, Gx_line+194, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+65, 771, Gx_line+65, 3, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 669, Gx_line+15, 728, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 669, Gx_line+39, 714, Gx_line+56, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19RelBany, "ZZ9.99")), 716, Gx_line+218, 767, Gx_line+236, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9")), 724, Gx_line+195, 767, Gx_line+213, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4544HreTotPie), "ZZZ9")), 716, Gx_line+152, 767, Gx_line+170, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4542HreTotKgm, "ZZZZZ9.99")), 691, Gx_line+95, 767, Gx_line+113, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(11, Gx_line+73, 384, Gx_line+102, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36NomEmp, "")), 14, Gx_line+15, 328, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4546HreMaqCod, "")), 716, Gx_line+173, 767, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit0, "")), 14, Gx_line+39, 328, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit1, "")), 583, Gx_line+15, 634, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit2, "")), 583, Gx_line+39, 634, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit3, "")), 18, Gx_line+79, 127, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit4, "")), 11, Gx_line+106, 79, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit5, "")), 11, Gx_line+129, 62, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit6, "")), 11, Gx_line+154, 62, Gx_line+172, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit7, "")), 285, Gx_line+154, 303, Gx_line+172, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit8, "")), 11, Gx_line+177, 104, Gx_line+195, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit10, "")), 548, Gx_line+152, 599, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit11, "")), 548, Gx_line+173, 607, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit12, "")), 548, Gx_line+195, 607, Gx_line+213, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit13, "")), 548, Gx_line+218, 682, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit9, "")), 546, Gx_line+76, 572, Gx_line+94, 0+256, 0, 0, 0) ;
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit26, "")), 548, Gx_line+115, 632, Gx_line+133, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4543HreTotMtr, "ZZZZZ9.99")), 691, Gx_line+132, 767, Gx_line+150, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+300, 772, Gx_line+300, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9")), 304, Gx_line+78, 322, Gx_line+96, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº C.", ""), 256, Gx_line+78, 299, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4863HreUsrCod, "")), 116, Gx_line+201, 175, Gx_line+218, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A4960HreFecAlt, "99/99/99 99:99:99"), 182, Gx_line+201, 307, Gx_line+218, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Lit40, "")), 11, Gx_line+201, 95, Gx_line+219, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109ProceNom, "")), 311, Gx_line+201, 531, Gx_line+218, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8624HreEnsayo), "ZZZZZZZ9")), 116, Gx_line+224, 175, Gx_line+241, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8625HreOpa, "@!")), 180, Gx_line+224, 188, Gx_line+241, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8623HreHilasa, "")), 201, Gx_line+224, 348, Gx_line+241, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Lit300, "")), 11, Gx_line+224, 94, Gx_line+241, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1094HreNPrg, "")), 722, Gx_line+240, 767, Gx_line+257, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Programa", ""), 548, Gx_line+240, 632, Gx_line+257, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Lit900, "")), 11, Gx_line+244, 94, Gx_line+261, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Hrelotf, "")), 116, Gx_line+244, 263, Gx_line+261, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4532HreBarKgm, "ZZZZZ9.99")), 691, Gx_line+75, 767, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4533HreBarMtr, "ZZZZZ9.99")), 700, Gx_line+115, 767, Gx_line+132, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10102HreNumInt), "ZZZZZZZ9")), 474, Gx_line+79, 533, Gx_line+96, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A10103HreDti, "99/99/99 99:99:99"), 508, Gx_line+283, 633, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A10104HreDtf, "99/99/99 99:99:99"), 653, Gx_line+283, 778, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Inicio  / Fin  Fase Tinte", ""), 508, Gx_line+265, 717, Gx_line+282, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Interno", ""), 388, Gx_line+79, 472, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV199LitPedCli, "")), 11, Gx_line+266, 95, Gx_line+284, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV200Hredispcli, "")), 116, Gx_line+266, 263, Gx_line+283, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+303) ;
               if ( GXutil.strcmp(A9808HreRacab, httpContext.getMessage( "S", "")) == 0 )
               {
                  if ( AV112jPF == 1 )
                  {
                     /* Execute user subroutine: 'PARJPF' */
                     S116 ();
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
                     getPrinter().GxDrawRect(100, Gx_line+14, 658, Gx_line+181, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "RAMOLA", ""), 231, Gx_line+48, 290, Gx_line+66, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Sobrealiment.:", ""), 109, Gx_line+74, 227, Gx_line+91, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Varp1, "")), 240, Gx_line+74, 299, Gx_line+91, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("%", 308, Gx_line+74, 325, Gx_line+92, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Velocidade", ""), 231, Gx_line+98, 292, Gx_line+116, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Automatico", ""), 109, Gx_line+125, 193, Gx_line+142, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122Varp2, "")), 203, Gx_line+125, 262, Gx_line+142, 1+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Manual", ""), 268, Gx_line+125, 319, Gx_line+142, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123Varpar3, "")), 321, Gx_line+125, 380, Gx_line+142, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "m/ min", ""), 384, Gx_line+125, 425, Gx_line+143, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "SANFOR", ""), 508, Gx_line+98, 563, Gx_line+116, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Compataçao:", ""), 439, Gx_line+125, 532, Gx_line+142, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124VarP4, "")), 547, Gx_line+125, 606, Gx_line+142, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "mm", ""), 610, Gx_line+125, 632, Gx_line+143, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Velocidade:", ""), 438, Gx_line+156, 531, Gx_line+173, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV125VarP5, "")), 547, Gx_line+156, 606, Gx_line+173, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "m/ min", ""), 610, Gx_line+156, 651, Gx_line+174, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "CALANDRA", ""), 498, Gx_line+48, 573, Gx_line+66, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Pressao:", ""), 443, Gx_line+74, 511, Gx_line+91, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV126varP6, "")), 514, Gx_line+74, 573, Gx_line+91, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "ton.", ""), 579, Gx_line+74, 601, Gx_line+92, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Parametros do Artigo", ""), 318, Gx_line+20, 441, Gx_line+38, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(431, Gx_line+43, 431, Gx_line+181, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(100, Gx_line+43, 432, Gx_line+151, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(100, Gx_line+66, 432, Gx_line+66, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(100, Gx_line+96, 658, Gx_line+96, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(100, Gx_line+116, 658, Gx_line+116, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(263, Gx_line+116, 263, Gx_line+151, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(540, Gx_line+116, 540, Gx_line+181, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(431, Gx_line+43, 658, Gx_line+67, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(432, Gx_line+150, 658, Gx_line+150, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+188) ;
                  }
                  else
                  {
                     if ( AV127Carvema == 1 )
                     {
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV128RecAnc), "ZZ9")), 136, Gx_line+14, 159, Gx_line+32, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV129Recgrm), "ZZZ9")), 284, Gx_line+14, 314, Gx_line+32, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "LARG. FINAL (cm)", ""), 19, Gx_line+14, 128, Gx_line+32, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "GR. FINAL(gr/m2)", ""), 172, Gx_line+14, 280, Gx_line+32, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV130Recabsfac, "ZZ9.99")), 557, Gx_line+14, 602, Gx_line+32, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "AVANÇO(%)", ""), 325, Gx_line+14, 403, Gx_line+32, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV195Hreava, "")), 413, Gx_line+14, 443, Gx_line+32, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 192, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV196RecAs, "")), 664, Gx_line+14, 687, Gx_line+32, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV197RecAi, "")), 740, Gx_line+14, 763, Gx_line+32, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "V.M. (mts/min)", ""), 465, Gx_line+14, 549, Gx_line+32, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "AS(%)", ""), 618, Gx_line+14, 661, Gx_line+32, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "AI(%)", ""), 696, Gx_line+14, 735, Gx_line+32, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+32) ;
                        AV132Nlin = (short)(GXutil.gxmlines( AV134recobsq, (short)(80))) ;
                        if ( AV132Nlin > 10 )
                        {
                           AV132Nlin = (short)(10) ;
                        }
                        AV133j = (byte)(1) ;
                        while ( AV135i <= AV132Nlin )
                        {
                           AV131Obs_l = GXutil.gxgetmli( AV134recobsq, AV133j, (short)(80)) ;
                           if ( GXutil.strcmp(AV131Obs_l, GXutil.space( (short)(80))) == 0 )
                           {
                              if (true) break;
                           }
                           if ( AV133j == 1 )
                           {
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131Obs_l, "")), 132, Gx_line+1, 716, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(httpContext.getMessage( "OBSERVAÇÕES:", ""), 19, Gx_line+1, 121, Gx_line+19, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+21) ;
                           }
                           else
                           {
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131Obs_l, "")), 132, Gx_line+0, 716, Gx_line+17, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                           AV133j = (byte)(AV133j+1) ;
                        }
                     }
                     else
                     {
                        getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV115HreFacAbs, "ZZ9.99")), 716, Gx_line+16, 766, Gx_line+32, 2, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV116HreLtsRc), "ZZZZ9")), 728, Gx_line+57, 764, Gx_line+73, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118HreHdrLts, "")), 677, Gx_line+78, 765, Gx_line+94, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV119HreFabs, "ZZ9.99")), 721, Gx_line+99, 765, Gx_line+115, 2, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV117HreLtsSr), "ZZZZ9")), 728, Gx_line+120, 765, Gx_line+137, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "F Abs", ""), 548, Gx_line+16, 591, Gx_line+33, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Lts Recuperados", ""), 547, Gx_line+57, 673, Gx_line+74, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Hdr Ultimo Baño", ""), 547, Gx_line+78, 673, Gx_line+95, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "F Abs", ""), 547, Gx_line+99, 590, Gx_line+116, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Lts Sobrantes", ""), 547, Gx_line+120, 656, Gx_line+137, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawRect(444, Gx_line+10, 773, Gx_line+143, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "F Abs Calculado", ""), 548, Gx_line+36, 674, Gx_line+53, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV120Hreabs, "ZZ9.99")), 722, Gx_line+36, 766, Gx_line+52, 2, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+151) ;
                     }
                  }
               }
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit14, "")), 14, Gx_line+32, 256, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+54, 255, Gx_line+54, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(374, Gx_line+54, 481, Gx_line+54, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(492, Gx_line+54, 612, Gx_line+54, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+8, 772, Gx_line+8, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Lit50, "")), 454, Gx_line+13, 528, Gx_line+31, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105Lit51, "")), 394, Gx_line+32, 468, Gx_line+50, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106Lit52, "")), 516, Gx_line+32, 590, Gx_line+50, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 293, Gx_line+33, 338, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(270, Gx_line+54, 366, Gx_line+54, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 629, Gx_line+32, 656, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(629, Gx_line+53, 775, Gx_line+53, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+65) ;
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
      add_metrics5( ) ;
      add_metrics6( ) ;
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
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Courier New", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Times New Roman", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV209Pgmname = "" ;
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
      AV107Lit53 = "" ;
      AV110Intexco = DecimalUtil.ZERO ;
      GXv_int6 = new byte[1] ;
      AV113Lit900 = "" ;
      AV170Lit200 = "" ;
      AV171Lit201 = "" ;
      AV172Lit202 = "" ;
      AV173Lit203 = "" ;
      AV174Lit204 = "" ;
      AV175Lit301 = "" ;
      AV176Lit302 = "" ;
      AV177Lit303 = "" ;
      AV201Lit503 = "" ;
      AV178Lit304 = "" ;
      AV179Lit400 = "" ;
      AV180Lit401 = "" ;
      AV181Lit402 = "" ;
      AV182Lit403 = "" ;
      AV183Lit404 = "" ;
      AV184Lit405 = "" ;
      AV185Lit406 = "" ;
      AV186Lit407 = "" ;
      AV187Lit408 = "" ;
      AV188Lit409 = "" ;
      AV189Lit500 = "" ;
      AV190Lit501 = "" ;
      AV199LitPedCli = "" ;
      scmdbuf = "" ;
      P07HB2_A130BarCodPar = new String[] {""} ;
      P07HB2_A132BarCodReo = new byte[1] ;
      P07HB2_A129BarCod = new int[1] ;
      P07HB2_A396EmprCod = new String[] {""} ;
      P07HB2_A970ProceCod = new short[1] ;
      P07HB2_n970ProceCod = new boolean[] {false} ;
      P07HB2_A44AlbRecCod = new int[1] ;
      P07HB2_A971ProceNom = new String[] {""} ;
      P07HB2_n971ProceNom = new boolean[] {false} ;
      P07HB2_A200BarPieCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A971ProceNom = "" ;
      A200BarPieCod = "" ;
      AV109ProceNom = "" ;
      P07HB3_A396EmprCod = new String[] {""} ;
      P07HB3_A407EmprNom = new String[] {""} ;
      P07HB3_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV36NomEmp = "" ;
      AV8Termin = "" ;
      P07HB4_A942TermCod = new String[] {""} ;
      P07HB4_A1189TermUsu = new String[] {""} ;
      P07HB4_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV9TermUsu = "" ;
      P07HB5_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB5_n4542HreTotKgm = new boolean[] {false} ;
      P07HB5_A4544HreTotPie = new int[1] ;
      P07HB5_n4544HreTotPie = new boolean[] {false} ;
      P07HB5_A4545HreLinMaq = new short[1] ;
      P07HB5_A4495HreNumCie = new byte[1] ;
      P07HB5_A4494HreBarPar = new String[] {""} ;
      P07HB5_A4493HreBarReo = new byte[1] ;
      P07HB5_A4492HreBarCod = new int[1] ;
      P07HB5_A396EmprCod = new String[] {""} ;
      P07HB5_A697HreLotF = new String[] {""} ;
      P07HB5_n697HreLotF = new boolean[] {false} ;
      P07HB5_A4516HreDisCli = new String[] {""} ;
      P07HB5_n4516HreDisCli = new boolean[] {false} ;
      P07HB5_A11318HreDispCli = new String[] {""} ;
      P07HB5_n11318HreDispCli = new boolean[] {false} ;
      P07HB5_A4548HreFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB5_n4548HreFacAbs = new boolean[] {false} ;
      P07HB5_A10099HreLtsRc = new int[1] ;
      P07HB5_n10099HreLtsRc = new boolean[] {false} ;
      P07HB5_A10100HreHdrLts = new String[] {""} ;
      P07HB5_n10100HreHdrLts = new boolean[] {false} ;
      P07HB5_A10101HreFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB5_n10101HreFabs = new boolean[] {false} ;
      P07HB5_A9805HreLtsSR = new int[1] ;
      P07HB5_n9805HreLtsSR = new boolean[] {false} ;
      P07HB5_A9810HreAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB5_n9810HreAbs = new boolean[] {false} ;
      P07HB5_A10383HreVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB5_n10383HreVel = new boolean[] {false} ;
      P07HB5_A10381HreAnc = new short[1] ;
      P07HB5_n10381HreAnc = new boolean[] {false} ;
      P07HB5_A10382HreGrm = new short[1] ;
      P07HB5_n10382HreGrm = new boolean[] {false} ;
      P07HB5_A10384HreObs = new String[] {""} ;
      P07HB5_n10384HreObs = new boolean[] {false} ;
      P07HB5_A11508HreAva = new String[] {""} ;
      P07HB5_n11508HreAva = new boolean[] {false} ;
      P07HB5_A12127HreAi = new String[] {""} ;
      P07HB5_n12127HreAi = new boolean[] {false} ;
      P07HB5_A12126HreAs = new String[] {""} ;
      P07HB5_n12126HreAs = new boolean[] {false} ;
      P07HB5_A9804HreAcab = new String[] {""} ;
      P07HB5_n9804HreAcab = new boolean[] {false} ;
      P07HB5_A10104HreDtf = new java.util.Date[] {GXutil.nullDate()} ;
      P07HB5_n10104HreDtf = new boolean[] {false} ;
      P07HB5_A10103HreDti = new java.util.Date[] {GXutil.nullDate()} ;
      P07HB5_n10103HreDti = new boolean[] {false} ;
      P07HB5_A10102HreNumInt = new int[1] ;
      P07HB5_n10102HreNumInt = new boolean[] {false} ;
      P07HB5_A4533HreBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB5_n4533HreBarMtr = new boolean[] {false} ;
      P07HB5_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB5_n4532HreBarKgm = new boolean[] {false} ;
      P07HB5_A1094HreNPrg = new String[] {""} ;
      P07HB5_n1094HreNPrg = new boolean[] {false} ;
      P07HB5_A8623HreHilasa = new String[] {""} ;
      P07HB5_n8623HreHilasa = new boolean[] {false} ;
      P07HB5_A8625HreOpa = new String[] {""} ;
      P07HB5_n8625HreOpa = new boolean[] {false} ;
      P07HB5_A8624HreEnsayo = new int[1] ;
      P07HB5_n8624HreEnsayo = new boolean[] {false} ;
      P07HB5_A4960HreFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P07HB5_n4960HreFecAlt = new boolean[] {false} ;
      P07HB5_A4863HreUsrCod = new String[] {""} ;
      P07HB5_n4863HreUsrCod = new boolean[] {false} ;
      P07HB5_A4543HreTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB5_n4543HreTotMtr = new boolean[] {false} ;
      P07HB5_A4546HreMaqCod = new String[] {""} ;
      P07HB5_n4546HreMaqCod = new boolean[] {false} ;
      P07HB5_A4547HreVolPrd = new int[1] ;
      P07HB5_n4547HreVolPrd = new boolean[] {false} ;
      P07HB5_A4540HreIntDsc = new String[] {""} ;
      P07HB5_n4540HreIntDsc = new boolean[] {false} ;
      P07HB5_A4526HreTipColN = new String[] {""} ;
      P07HB5_n4526HreTipColN = new boolean[] {false} ;
      P07HB5_A4525HreTipCol = new byte[1] ;
      P07HB5_n4525HreTipCol = new boolean[] {false} ;
      P07HB5_A4522HreColNum = new int[1] ;
      P07HB5_n4522HreColNum = new boolean[] {false} ;
      P07HB5_A4521HreColNom = new String[] {""} ;
      P07HB5_n4521HreColNom = new boolean[] {false} ;
      P07HB5_A4518HreBarDsc = new String[] {""} ;
      P07HB5_n4518HreBarDsc = new boolean[] {false} ;
      P07HB5_A4517HreBarSer = new String[] {""} ;
      P07HB5_n4517HreBarSer = new boolean[] {false} ;
      P07HB5_A279CliNom = new String[] {""} ;
      P07HB5_A252CliCod = new int[1] ;
      P07HB5_n252CliCod = new boolean[] {false} ;
      P07HB5_A9808HreRacab = new String[] {""} ;
      P07HB5_n9808HreRacab = new boolean[] {false} ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A4494HreBarPar = "" ;
      A697HreLotF = "" ;
      A4516HreDisCli = "" ;
      A11318HreDispCli = "" ;
      A4548HreFacAbs = DecimalUtil.ZERO ;
      A10100HreHdrLts = "" ;
      A10101HreFabs = DecimalUtil.ZERO ;
      A9810HreAbs = DecimalUtil.ZERO ;
      A10383HreVel = DecimalUtil.ZERO ;
      A10384HreObs = "" ;
      A11508HreAva = "" ;
      A12127HreAi = "" ;
      A12126HreAs = "" ;
      A9804HreAcab = "" ;
      A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      A4533HreBarMtr = DecimalUtil.ZERO ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      A1094HreNPrg = "" ;
      A8623HreHilasa = "" ;
      A8625HreOpa = "" ;
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
      A9808HreRacab = "" ;
      AV99HreMaqCod = "" ;
      AV114Hrelotf = "" ;
      AV200Hredispcli = "" ;
      AV115HreFacAbs = DecimalUtil.ZERO ;
      AV118HreHdrLts = "" ;
      AV119HreFabs = DecimalUtil.ZERO ;
      AV120Hreabs = DecimalUtil.ZERO ;
      AV130Recabsfac = DecimalUtil.ZERO ;
      AV134recobsq = "" ;
      AV195Hreava = "" ;
      AV197RecAi = "" ;
      AV196RecAs = "" ;
      AV19RelBany = DecimalUtil.ZERO ;
      AV111Lit300 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV42CosteT1 = DecimalUtil.ZERO ;
      AV43CosteT2 = DecimalUtil.ZERO ;
      P07HB6_A396EmprCod = new String[] {""} ;
      P07HB6_A4492HreBarCod = new int[1] ;
      P07HB6_A4493HreBarReo = new byte[1] ;
      P07HB6_A4494HreBarPar = new String[] {""} ;
      P07HB6_A4495HreNumCie = new byte[1] ;
      P07HB6_A4545HreLinMaq = new short[1] ;
      P07HB6_A4550HreLinPro = new byte[1] ;
      P07HB6_A4551HreProCod = new String[] {""} ;
      P07HB6_A4553HreProTie = new short[1] ;
      P07HB6_A4555HreNumPro = new int[1] ;
      P07HB6_A4966HreVolPro = new int[1] ;
      P07HB6_A4552HreProDsc = new String[] {""} ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      AV97HreProCod = "" ;
      AV31Coste1 = DecimalUtil.ZERO ;
      AV32Coste2 = DecimalUtil.ZERO ;
      AV30CosteA1 = DecimalUtil.ZERO ;
      AV29CosteP1 = DecimalUtil.ZERO ;
      P07HB7_A396EmprCod = new String[] {""} ;
      P07HB7_A4492HreBarCod = new int[1] ;
      P07HB7_A4493HreBarReo = new byte[1] ;
      P07HB7_A4494HreBarPar = new String[] {""} ;
      P07HB7_A4495HreNumCie = new byte[1] ;
      P07HB7_A4545HreLinMaq = new short[1] ;
      P07HB7_A4550HreLinPro = new byte[1] ;
      P07HB7_A5726HreLote = new String[] {""} ;
      P07HB7_n5726HreLote = new boolean[] {false} ;
      P07HB7_A719PrdNum = new String[] {""} ;
      P07HB7_n719PrdNum = new boolean[] {false} ;
      P07HB7_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB7_n4967HrePrePrd = new boolean[] {false} ;
      P07HB7_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB7_n4563HrePrdCant = new boolean[] {false} ;
      P07HB7_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB7_n4565HreCanAny = new boolean[] {false} ;
      P07HB7_A4558HrePrdNum = new String[] {""} ;
      P07HB7_n4558HrePrdNum = new boolean[] {false} ;
      P07HB7_A4561HrePrdUDs = new String[] {""} ;
      P07HB7_n4561HrePrdUDs = new boolean[] {false} ;
      P07HB7_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB7_n4562HreFacCon = new boolean[] {false} ;
      P07HB7_A4560HrePrdUMe = new byte[1] ;
      P07HB7_n4560HrePrdUMe = new boolean[] {false} ;
      P07HB7_A743PrdUniCon = new byte[1] ;
      P07HB7_A4559HrePrdDsc = new String[] {""} ;
      P07HB7_n4559HrePrdDsc = new boolean[] {false} ;
      P07HB7_A12642HrePrdDc2 = new String[] {""} ;
      P07HB7_n12642HrePrdDc2 = new boolean[] {false} ;
      P07HB7_A4557HreRecLin = new short[1] ;
      A5726HreLote = "" ;
      A719PrdNum = "" ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4558HrePrdNum = "" ;
      A4561HrePrdUDs = "" ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      A4559HrePrdDsc = "" ;
      A12642HrePrdDc2 = "" ;
      AV198Lote = "" ;
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
      AV205Linea2 = "" ;
      AV34CosteK1 = DecimalUtil.ZERO ;
      AV35CosteK2 = DecimalUtil.ZERO ;
      AV95CostePz1 = DecimalUtil.ZERO ;
      AV96CostePz2 = DecimalUtil.ZERO ;
      P07HB8_A396EmprCod = new String[] {""} ;
      P07HB8_A4492HreBarCod = new int[1] ;
      P07HB8_A4493HreBarReo = new byte[1] ;
      P07HB8_A4494HreBarPar = new String[] {""} ;
      P07HB8_A4495HreNumCie = new byte[1] ;
      P07HB8_A4508HreLinMAL = new short[1] ;
      P07HB8_A719PrdNum = new String[] {""} ;
      P07HB8_n719PrdNum = new boolean[] {false} ;
      P07HB8_A4509HreNumAny = new byte[1] ;
      P07HB9_A396EmprCod = new String[] {""} ;
      P07HB9_A4492HreBarCod = new int[1] ;
      P07HB9_A4493HreBarReo = new byte[1] ;
      P07HB9_A4494HreBarPar = new String[] {""} ;
      P07HB9_A4495HreNumCie = new byte[1] ;
      P07HB9_A4508HreLinMAL = new short[1] ;
      P07HB9_A719PrdNum = new String[] {""} ;
      P07HB9_n719PrdNum = new boolean[] {false} ;
      P07HB9_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB9_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB9_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB9_n4511HrePrdCFin = new boolean[] {false} ;
      P07HB9_A5808HreLanyLot = new String[] {""} ;
      P07HB9_n5808HreLanyLot = new boolean[] {false} ;
      P07HB9_A718PrdNom = new String[] {""} ;
      P07HB9_A4509HreNumAny = new byte[1] ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A5808HreLanyLot = "" ;
      A718PrdNom = "" ;
      AV148Eta_aai = DecimalUtil.ZERO ;
      AV149Eta_aas = DecimalUtil.ZERO ;
      AV138Eta_tai = DecimalUtil.ZERO ;
      AV203lb_obsin = "" ;
      AV204Obs = "" ;
      P07HB10_A4495HreNumCie = new byte[1] ;
      P07HB10_A4494HreBarPar = new String[] {""} ;
      P07HB10_A4493HreBarReo = new byte[1] ;
      P07HB10_A4492HreBarCod = new int[1] ;
      P07HB10_A396EmprCod = new String[] {""} ;
      P07HB10_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB10_A4505HreAgrDsc = new String[] {""} ;
      P07HB10_A4502HreAgrPie = new short[1] ;
      P07HB10_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB10_A4504HreAgrSer = new String[] {""} ;
      P07HB10_A4499HreAgrPar = new String[] {""} ;
      P07HB10_A4498HreAgrReo = new byte[1] ;
      P07HB10_A4497HreAgrCod = new int[1] ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      A4505HreAgrDsc = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      A4499HreAgrPar = "" ;
      P07HB11_A4495HreNumCie = new byte[1] ;
      P07HB11_A4494HreBarPar = new String[] {""} ;
      P07HB11_A4493HreBarReo = new byte[1] ;
      P07HB11_A4492HreBarCod = new int[1] ;
      P07HB11_A396EmprCod = new String[] {""} ;
      P07HB11_A9990HreAcPie = new int[1] ;
      P07HB11_n9990HreAcPie = new boolean[] {false} ;
      P07HB11_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB11_n9989HreAcMtr = new boolean[] {false} ;
      P07HB11_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB11_n9988HreAcKgm = new boolean[] {false} ;
      P07HB11_A9993HreAcDsc = new String[] {""} ;
      P07HB11_n9993HreAcDsc = new boolean[] {false} ;
      P07HB11_A9992HreAcSer = new String[] {""} ;
      P07HB11_n9992HreAcSer = new boolean[] {false} ;
      P07HB11_A9987HreAcPar = new String[] {""} ;
      P07HB11_A9986HreAcReo = new byte[1] ;
      P07HB11_A9985HreAcCod = new int[1] ;
      A9989HreAcMtr = DecimalUtil.ZERO ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9993HreAcDsc = "" ;
      A9992HreAcSer = "" ;
      A9987HreAcPar = "" ;
      P07HB12_A719PrdNum = new String[] {""} ;
      P07HB12_n719PrdNum = new boolean[] {false} ;
      P07HB12_A396EmprCod = new String[] {""} ;
      P07HB12_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB13_A771ProForTie = new short[1] ;
      AV100MAQCOSMIN = DecimalUtil.ZERO ;
      P07HB14_A602MaqCod = new String[] {""} ;
      P07HB14_A396EmprCod = new String[] {""} ;
      P07HB14_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB14_n605MaqCosMin = new boolean[] {false} ;
      A602MaqCod = "" ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      P07HB15_A130BarCodPar = new String[] {""} ;
      P07HB15_A132BarCodReo = new byte[1] ;
      P07HB15_A129BarCod = new int[1] ;
      P07HB15_A396EmprCod = new String[] {""} ;
      P07HB15_A9737BarValPar = new String[] {""} ;
      P07HB15_A3295BarParVal = new String[] {""} ;
      P07HB15_A12671BarParVl2 = new String[] {""} ;
      P07HB15_A1664ParFasCod = new short[1] ;
      P07HB15_A194BarOrdLin = new short[1] ;
      P07HB15_A758ProCod = new String[] {""} ;
      A9737BarValPar = "" ;
      A3295BarParVal = "" ;
      A12671BarParVl2 = "" ;
      A758ProCod = "" ;
      AV121Varp1 = "" ;
      AV122Varp2 = "" ;
      AV123Varpar3 = "" ;
      AV124VarP4 = "" ;
      AV125VarP5 = "" ;
      AV126varP6 = "" ;
      P07HB16_A130BarCodPar = new String[] {""} ;
      P07HB16_A132BarCodReo = new byte[1] ;
      P07HB16_A129BarCod = new int[1] ;
      P07HB16_A396EmprCod = new String[] {""} ;
      P07HB16_A4834BarAudOpe = new int[1] ;
      P07HB16_n4834BarAudOpe = new boolean[] {false} ;
      P07HB16_A4836BarAudSup = new int[1] ;
      P07HB16_A4838BarAudNPz = new short[1] ;
      P07HB16_n4838BarAudNPz = new boolean[] {false} ;
      P07HB16_A4844BarAudULin = new short[1] ;
      P07HB16_n4844BarAudULin = new boolean[] {false} ;
      P07HB16_A4460BarLotPza = new short[1] ;
      P07HB16_n4460BarLotPza = new boolean[] {false} ;
      P07HB17_A396EmprCod = new String[] {""} ;
      P07HB17_A11213Eta_hdr = new int[1] ;
      P07HB17_A11214Eta_hdrr = new byte[1] ;
      P07HB17_A11215Eta_hdrp = new String[] {""} ;
      P07HB17_A11227Eta_tai = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB17_n11227Eta_tai = new boolean[] {false} ;
      P07HB17_A11228Eta_text = new short[1] ;
      P07HB17_n11228Eta_text = new boolean[] {false} ;
      P07HB17_A11230Eta_tvm = new short[1] ;
      P07HB17_n11230Eta_tvm = new boolean[] {false} ;
      P07HB17_A11229Eta_tvt = new long[1] ;
      P07HB17_n11229Eta_tvt = new boolean[] {false} ;
      P07HB17_A11232Eta_aai = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB17_n11232Eta_aai = new boolean[] {false} ;
      P07HB17_A11237Eta_aar = new long[1] ;
      P07HB17_n11237Eta_aar = new boolean[] {false} ;
      P07HB17_A11231Eta_aas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB17_n11231Eta_aas = new boolean[] {false} ;
      P07HB17_A11241Eta_acl = new short[1] ;
      P07HB17_n11241Eta_acl = new boolean[] {false} ;
      P07HB17_A11240Eta_acp = new short[1] ;
      P07HB17_n11240Eta_acp = new boolean[] {false} ;
      P07HB17_A11235Eta_aext = new short[1] ;
      P07HB17_n11235Eta_aext = new boolean[] {false} ;
      P07HB17_A11239Eta_ag = new short[1] ;
      P07HB17_n11239Eta_ag = new boolean[] {false} ;
      P07HB17_A11238Eta_am = new short[1] ;
      P07HB17_n11238Eta_am = new boolean[] {false} ;
      P07HB17_A11242Eta_at = new short[1] ;
      P07HB17_n11242Eta_at = new boolean[] {false} ;
      P07HB17_A11233Eta_atr = new short[1] ;
      P07HB17_n11233Eta_atr = new boolean[] {false} ;
      P07HB17_A11234Eta_avm = new short[1] ;
      P07HB17_n11234Eta_avm = new boolean[] {false} ;
      P07HB17_A11236Eta_avt = new long[1] ;
      P07HB17_n11236Eta_avt = new boolean[] {false} ;
      A11215Eta_hdrp = "" ;
      A11227Eta_tai = DecimalUtil.ZERO ;
      A11232Eta_aai = DecimalUtil.ZERO ;
      A11231Eta_aas = DecimalUtil.ZERO ;
      P07HB18_A9613Lb_Hdrp = new String[] {""} ;
      P07HB18_A9612Lb_Hdrr = new byte[1] ;
      P07HB18_A9611Lb_Hdr = new int[1] ;
      P07HB18_A9721Lb_obsprb = new String[] {""} ;
      P07HB18_n9721Lb_obsprb = new boolean[] {false} ;
      P07HB18_A396EmprCod = new String[] {""} ;
      A9613Lb_Hdrp = "" ;
      A9721Lb_obsprb = "" ;
      c4511HrePrdCFin = DecimalUtil.ZERO ;
      P07HB19_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07HB19_n4511HrePrdCFin = new boolean[] {false} ;
      AV70ContDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      AV131Obs_l = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhrhr02sc__default(),
         new Object[] {
             new Object[] {
            P07HB2_A130BarCodPar, P07HB2_A132BarCodReo, P07HB2_A129BarCod, P07HB2_A396EmprCod, P07HB2_A970ProceCod, P07HB2_n970ProceCod, P07HB2_A44AlbRecCod, P07HB2_A971ProceNom, P07HB2_n971ProceNom, P07HB2_A200BarPieCod
            }
            , new Object[] {
            P07HB3_A396EmprCod, P07HB3_A407EmprNom, P07HB3_n407EmprNom
            }
            , new Object[] {
            P07HB4_A942TermCod, P07HB4_A1189TermUsu, P07HB4_n1189TermUsu
            }
            , new Object[] {
            P07HB5_A4542HreTotKgm, P07HB5_n4542HreTotKgm, P07HB5_A4544HreTotPie, P07HB5_n4544HreTotPie, P07HB5_A4545HreLinMaq, P07HB5_A4495HreNumCie, P07HB5_A4494HreBarPar, P07HB5_A4493HreBarReo, P07HB5_A4492HreBarCod, P07HB5_A396EmprCod,
            P07HB5_A697HreLotF, P07HB5_n697HreLotF, P07HB5_A4516HreDisCli, P07HB5_n4516HreDisCli, P07HB5_A11318HreDispCli, P07HB5_n11318HreDispCli, P07HB5_A4548HreFacAbs, P07HB5_n4548HreFacAbs, P07HB5_A10099HreLtsRc, P07HB5_n10099HreLtsRc,
            P07HB5_A10100HreHdrLts, P07HB5_n10100HreHdrLts, P07HB5_A10101HreFabs, P07HB5_n10101HreFabs, P07HB5_A9805HreLtsSR, P07HB5_n9805HreLtsSR, P07HB5_A9810HreAbs, P07HB5_n9810HreAbs, P07HB5_A10383HreVel, P07HB5_n10383HreVel,
            P07HB5_A10381HreAnc, P07HB5_n10381HreAnc, P07HB5_A10382HreGrm, P07HB5_n10382HreGrm, P07HB5_A10384HreObs, P07HB5_n10384HreObs, P07HB5_A11508HreAva, P07HB5_n11508HreAva, P07HB5_A12127HreAi, P07HB5_n12127HreAi,
            P07HB5_A12126HreAs, P07HB5_n12126HreAs, P07HB5_A9804HreAcab, P07HB5_n9804HreAcab, P07HB5_A10104HreDtf, P07HB5_n10104HreDtf, P07HB5_A10103HreDti, P07HB5_n10103HreDti, P07HB5_A10102HreNumInt, P07HB5_n10102HreNumInt,
            P07HB5_A4533HreBarMtr, P07HB5_n4533HreBarMtr, P07HB5_A4532HreBarKgm, P07HB5_n4532HreBarKgm, P07HB5_A1094HreNPrg, P07HB5_n1094HreNPrg, P07HB5_A8623HreHilasa, P07HB5_n8623HreHilasa, P07HB5_A8625HreOpa, P07HB5_n8625HreOpa,
            P07HB5_A8624HreEnsayo, P07HB5_n8624HreEnsayo, P07HB5_A4960HreFecAlt, P07HB5_n4960HreFecAlt, P07HB5_A4863HreUsrCod, P07HB5_n4863HreUsrCod, P07HB5_A4543HreTotMtr, P07HB5_n4543HreTotMtr, P07HB5_A4546HreMaqCod, P07HB5_n4546HreMaqCod,
            P07HB5_A4547HreVolPrd, P07HB5_n4547HreVolPrd, P07HB5_A4540HreIntDsc, P07HB5_n4540HreIntDsc, P07HB5_A4526HreTipColN, P07HB5_n4526HreTipColN, P07HB5_A4525HreTipCol, P07HB5_n4525HreTipCol, P07HB5_A4522HreColNum, P07HB5_n4522HreColNum,
            P07HB5_A4521HreColNom, P07HB5_n4521HreColNom, P07HB5_A4518HreBarDsc, P07HB5_n4518HreBarDsc, P07HB5_A4517HreBarSer, P07HB5_n4517HreBarSer, P07HB5_A279CliNom, P07HB5_A252CliCod, P07HB5_n252CliCod, P07HB5_A9808HreRacab,
            P07HB5_n9808HreRacab
            }
            , new Object[] {
            P07HB6_A396EmprCod, P07HB6_A4492HreBarCod, P07HB6_A4493HreBarReo, P07HB6_A4494HreBarPar, P07HB6_A4495HreNumCie, P07HB6_A4545HreLinMaq, P07HB6_A4550HreLinPro, P07HB6_A4551HreProCod, P07HB6_A4553HreProTie, P07HB6_A4555HreNumPro,
            P07HB6_A4966HreVolPro, P07HB6_A4552HreProDsc
            }
            , new Object[] {
            P07HB7_A396EmprCod, P07HB7_A4492HreBarCod, P07HB7_A4493HreBarReo, P07HB7_A4494HreBarPar, P07HB7_A4495HreNumCie, P07HB7_A4545HreLinMaq, P07HB7_A4550HreLinPro, P07HB7_A5726HreLote, P07HB7_n5726HreLote, P07HB7_A719PrdNum,
            P07HB7_n719PrdNum, P07HB7_A4967HrePrePrd, P07HB7_n4967HrePrePrd, P07HB7_A4563HrePrdCant, P07HB7_n4563HrePrdCant, P07HB7_A4565HreCanAny, P07HB7_n4565HreCanAny, P07HB7_A4558HrePrdNum, P07HB7_n4558HrePrdNum, P07HB7_A4561HrePrdUDs,
            P07HB7_n4561HrePrdUDs, P07HB7_A4562HreFacCon, P07HB7_n4562HreFacCon, P07HB7_A4560HrePrdUMe, P07HB7_n4560HrePrdUMe, P07HB7_A743PrdUniCon, P07HB7_A4559HrePrdDsc, P07HB7_n4559HrePrdDsc, P07HB7_A12642HrePrdDc2, P07HB7_n12642HrePrdDc2,
            P07HB7_A4557HreRecLin
            }
            , new Object[] {
            P07HB8_A396EmprCod, P07HB8_A4492HreBarCod, P07HB8_A4493HreBarReo, P07HB8_A4494HreBarPar, P07HB8_A4495HreNumCie, P07HB8_A4508HreLinMAL, P07HB8_A719PrdNum, P07HB8_A4509HreNumAny
            }
            , new Object[] {
            P07HB9_A396EmprCod, P07HB9_A4492HreBarCod, P07HB9_A4493HreBarReo, P07HB9_A4494HreBarPar, P07HB9_A4495HreNumCie, P07HB9_A4508HreLinMAL, P07HB9_A719PrdNum, P07HB9_A724PrdPreAct, P07HB9_A707PrdFacCon, P07HB9_A4511HrePrdCFin,
            P07HB9_n4511HrePrdCFin, P07HB9_A5808HreLanyLot, P07HB9_n5808HreLanyLot, P07HB9_A718PrdNom, P07HB9_A4509HreNumAny
            }
            , new Object[] {
            P07HB10_A4495HreNumCie, P07HB10_A4494HreBarPar, P07HB10_A4493HreBarReo, P07HB10_A4492HreBarCod, P07HB10_A396EmprCod, P07HB10_A4501HreAgrMtr, P07HB10_A4505HreAgrDsc, P07HB10_A4502HreAgrPie, P07HB10_A4500HreAgrKgm, P07HB10_A4504HreAgrSer,
            P07HB10_A4499HreAgrPar, P07HB10_A4498HreAgrReo, P07HB10_A4497HreAgrCod
            }
            , new Object[] {
            P07HB11_A4495HreNumCie, P07HB11_A4494HreBarPar, P07HB11_A4493HreBarReo, P07HB11_A4492HreBarCod, P07HB11_A396EmprCod, P07HB11_A9990HreAcPie, P07HB11_n9990HreAcPie, P07HB11_A9989HreAcMtr, P07HB11_n9989HreAcMtr, P07HB11_A9988HreAcKgm,
            P07HB11_n9988HreAcKgm, P07HB11_A9993HreAcDsc, P07HB11_n9993HreAcDsc, P07HB11_A9992HreAcSer, P07HB11_n9992HreAcSer, P07HB11_A9987HreAcPar, P07HB11_A9986HreAcReo, P07HB11_A9985HreAcCod
            }
            , new Object[] {
            P07HB12_A719PrdNum, P07HB12_A396EmprCod, P07HB12_A707PrdFacCon
            }
            , new Object[] {
            P07HB13_A771ProForTie
            }
            , new Object[] {
            P07HB14_A602MaqCod, P07HB14_A396EmprCod, P07HB14_A605MaqCosMin, P07HB14_n605MaqCosMin
            }
            , new Object[] {
            P07HB15_A130BarCodPar, P07HB15_A132BarCodReo, P07HB15_A129BarCod, P07HB15_A396EmprCod, P07HB15_A9737BarValPar, P07HB15_A3295BarParVal, P07HB15_A12671BarParVl2, P07HB15_A1664ParFasCod, P07HB15_A194BarOrdLin, P07HB15_A758ProCod
            }
            , new Object[] {
            P07HB16_A130BarCodPar, P07HB16_A132BarCodReo, P07HB16_A129BarCod, P07HB16_A396EmprCod, P07HB16_A4834BarAudOpe, P07HB16_n4834BarAudOpe, P07HB16_A4836BarAudSup, P07HB16_A4838BarAudNPz, P07HB16_n4838BarAudNPz, P07HB16_A4844BarAudULin,
            P07HB16_n4844BarAudULin, P07HB16_A4460BarLotPza, P07HB16_n4460BarLotPza
            }
            , new Object[] {
            P07HB17_A396EmprCod, P07HB17_A11213Eta_hdr, P07HB17_A11214Eta_hdrr, P07HB17_A11215Eta_hdrp, P07HB17_A11227Eta_tai, P07HB17_n11227Eta_tai, P07HB17_A11228Eta_text, P07HB17_n11228Eta_text, P07HB17_A11230Eta_tvm, P07HB17_n11230Eta_tvm,
            P07HB17_A11229Eta_tvt, P07HB17_n11229Eta_tvt, P07HB17_A11232Eta_aai, P07HB17_n11232Eta_aai, P07HB17_A11237Eta_aar, P07HB17_n11237Eta_aar, P07HB17_A11231Eta_aas, P07HB17_n11231Eta_aas, P07HB17_A11241Eta_acl, P07HB17_n11241Eta_acl,
            P07HB17_A11240Eta_acp, P07HB17_n11240Eta_acp, P07HB17_A11235Eta_aext, P07HB17_n11235Eta_aext, P07HB17_A11239Eta_ag, P07HB17_n11239Eta_ag, P07HB17_A11238Eta_am, P07HB17_n11238Eta_am, P07HB17_A11242Eta_at, P07HB17_n11242Eta_at,
            P07HB17_A11233Eta_atr, P07HB17_n11233Eta_atr, P07HB17_A11234Eta_avm, P07HB17_n11234Eta_avm, P07HB17_A11236Eta_avt, P07HB17_n11236Eta_avt
            }
            , new Object[] {
            P07HB18_A9613Lb_Hdrp, P07HB18_A9612Lb_Hdrr, P07HB18_A9611Lb_Hdr, P07HB18_A9721Lb_obsprb, P07HB18_n9721Lb_obsprb, P07HB18_A396EmprCod
            }
            , new Object[] {
            P07HB19_A4511HrePrdCFin, P07HB19_n4511HrePrdCFin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV209Pgmname = "RHRHR02sc" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV209Pgmname = "RHRHR02sc" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte AV87HRENUMCIE ;
   private byte AV94F_laundry ;
   private byte AV112jPF ;
   private byte AV127Carvema ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A132BarCodReo ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4525HreTipCol ;
   private byte A4550HreLinPro ;
   private byte A4560HrePrdUMe ;
   private byte A743PrdUniCon ;
   private byte AV84Pesaje ;
   private byte A4509HreNumAny ;
   private byte AV81FlagAgr ;
   private byte AV135i ;
   private byte A4498HreAgrReo ;
   private byte A9986HreAcReo ;
   private byte A11214Eta_hdrr ;
   private byte A9612Lb_Hdrr ;
   private byte AV133j ;
   private short gxcookieaux ;
   private short AV136HreLinmaq ;
   private short A970ProceCod ;
   private short AV91LinMaq ;
   private short A4545HreLinMaq ;
   private short A10381HreAnc ;
   private short A10382HreGrm ;
   private short AV128RecAnc ;
   private short AV129Recgrm ;
   private short AV98Tiempo_t ;
   private short A4553HreProTie ;
   private short A4557HreRecLin ;
   private short A4508HreLinMAL ;
   private short AV153Eta_am ;
   private short AV154Eta_ag ;
   private short AV155Eta_acp ;
   private short AV156Eta_acl ;
   private short AV151Eta_aext ;
   private short AV146Eta_avm ;
   private short AV147Eta_atr ;
   private short AV157Eta_at ;
   private short AV143GRC ;
   private short AV144LF ;
   private short AV145GRF ;
   private short AV139Eta_text ;
   private short AV140Eta_tvm ;
   private short AV132Nlin ;
   private short A4502HreAgrPie ;
   private short c771ProForTie ;
   private short A1664ParFasCod ;
   private short A194BarOrdLin ;
   private short A4838BarAudNPz ;
   private short A4844BarAudULin ;
   private short A4460BarLotPza ;
   private short A11228Eta_text ;
   private short A11230Eta_tvm ;
   private short A11241Eta_acl ;
   private short A11240Eta_acp ;
   private short A11235Eta_aext ;
   private short A11239Eta_ag ;
   private short A11238Eta_am ;
   private short A11242Eta_at ;
   private short A11233Eta_atr ;
   private short A11234Eta_avm ;
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
   private int A10099HreLtsRc ;
   private int A9805HreLtsSR ;
   private int A10102HreNumInt ;
   private int A8624HreEnsayo ;
   private int A4547HreVolPrd ;
   private int A4522HreColNum ;
   private int A252CliCod ;
   private int AV116HreLtsRc ;
   private int AV117HreLtsSr ;
   private int A4555HreNumPro ;
   private int A4966HreVolPro ;
   private int Gx_OldLine ;
   private int AV137As ;
   private int AV142LC ;
   private int A4497HreAgrCod ;
   private int A9990HreAcPie ;
   private int A9985HreAcCod ;
   private int A4834BarAudOpe ;
   private int A4836BarAudSup ;
   private int A11213Eta_hdr ;
   private int A9611Lb_Hdr ;
   private long AV150Eta_avt ;
   private long AV152Eta_aar ;
   private long AV141Eta_tvt ;
   private long AV202Eta_tvtf ;
   private long A11229Eta_tvt ;
   private long A11237Eta_aar ;
   private long A11236Eta_avt ;
   private java.math.BigDecimal AV110Intexco ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A4548HreFacAbs ;
   private java.math.BigDecimal A10101HreFabs ;
   private java.math.BigDecimal A9810HreAbs ;
   private java.math.BigDecimal A10383HreVel ;
   private java.math.BigDecimal A4533HreBarMtr ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4543HreTotMtr ;
   private java.math.BigDecimal AV115HreFacAbs ;
   private java.math.BigDecimal AV119HreFabs ;
   private java.math.BigDecimal AV120Hreabs ;
   private java.math.BigDecimal AV130Recabsfac ;
   private java.math.BigDecimal AV19RelBany ;
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
   private java.math.BigDecimal AV148Eta_aai ;
   private java.math.BigDecimal AV149Eta_aas ;
   private java.math.BigDecimal AV138Eta_tai ;
   private java.math.BigDecimal A4501HreAgrMtr ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A9989HreAcMtr ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal AV100MAQCOSMIN ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A11227Eta_tai ;
   private java.math.BigDecimal A11232Eta_aai ;
   private java.math.BigDecimal A11231Eta_aas ;
   private java.math.BigDecimal c4511HrePrdCFin ;
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
   private String AV209Pgmname ;
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
   private String AV107Lit53 ;
   private String AV113Lit900 ;
   private String AV170Lit200 ;
   private String AV171Lit201 ;
   private String AV172Lit202 ;
   private String AV173Lit203 ;
   private String AV174Lit204 ;
   private String AV175Lit301 ;
   private String AV176Lit302 ;
   private String AV177Lit303 ;
   private String AV201Lit503 ;
   private String AV178Lit304 ;
   private String AV179Lit400 ;
   private String AV180Lit401 ;
   private String AV181Lit402 ;
   private String AV182Lit403 ;
   private String AV183Lit404 ;
   private String AV184Lit405 ;
   private String AV185Lit406 ;
   private String AV186Lit407 ;
   private String AV187Lit408 ;
   private String AV188Lit409 ;
   private String AV189Lit500 ;
   private String AV190Lit501 ;
   private String AV199LitPedCli ;
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
   private String A697HreLotF ;
   private String A4516HreDisCli ;
   private String A11318HreDispCli ;
   private String A10100HreHdrLts ;
   private String A11508HreAva ;
   private String A12127HreAi ;
   private String A12126HreAs ;
   private String A9804HreAcab ;
   private String A1094HreNPrg ;
   private String A8623HreHilasa ;
   private String A8625HreOpa ;
   private String A4863HreUsrCod ;
   private String A4546HreMaqCod ;
   private String A4540HreIntDsc ;
   private String A4526HreTipColN ;
   private String A4521HreColNom ;
   private String A4518HreBarDsc ;
   private String A4517HreBarSer ;
   private String A279CliNom ;
   private String A9808HreRacab ;
   private String AV99HreMaqCod ;
   private String AV114Hrelotf ;
   private String AV200Hredispcli ;
   private String AV118HreHdrLts ;
   private String AV195Hreava ;
   private String AV197RecAi ;
   private String AV196RecAs ;
   private String AV111Lit300 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String AV97HreProCod ;
   private String A5726HreLote ;
   private String A719PrdNum ;
   private String A4558HrePrdNum ;
   private String A4561HrePrdUDs ;
   private String A4559HrePrdDsc ;
   private String A12642HrePrdDc2 ;
   private String AV198Lote ;
   private String AV89PrdNum ;
   private String AV40CodPrd ;
   private String AV108Und ;
   private String AV39Unidades ;
   private String AV205Linea2 ;
   private String A5808HreLanyLot ;
   private String A718PrdNom ;
   private String AV204Obs ;
   private String A4505HreAgrDsc ;
   private String A4504HreAgrSer ;
   private String A4499HreAgrPar ;
   private String A9993HreAcDsc ;
   private String A9992HreAcSer ;
   private String A9987HreAcPar ;
   private String A602MaqCod ;
   private String A9737BarValPar ;
   private String A3295BarParVal ;
   private String A12671BarParVl2 ;
   private String A758ProCod ;
   private String AV121Varp1 ;
   private String AV122Varp2 ;
   private String AV123Varpar3 ;
   private String AV124VarP4 ;
   private String AV125VarP5 ;
   private String AV126varP6 ;
   private String A11215Eta_hdrp ;
   private String A9613Lb_Hdrp ;
   private String AV70ContDsc ;
   private String AV131Obs_l ;
   private java.util.Date A10104HreDtf ;
   private java.util.Date A10103HreDti ;
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
   private boolean n697HreLotF ;
   private boolean n4516HreDisCli ;
   private boolean n11318HreDispCli ;
   private boolean n4548HreFacAbs ;
   private boolean n10099HreLtsRc ;
   private boolean n10100HreHdrLts ;
   private boolean n10101HreFabs ;
   private boolean n9805HreLtsSR ;
   private boolean n9810HreAbs ;
   private boolean n10383HreVel ;
   private boolean n10381HreAnc ;
   private boolean n10382HreGrm ;
   private boolean n10384HreObs ;
   private boolean n11508HreAva ;
   private boolean n12127HreAi ;
   private boolean n12126HreAs ;
   private boolean n9804HreAcab ;
   private boolean n10104HreDtf ;
   private boolean n10103HreDti ;
   private boolean n10102HreNumInt ;
   private boolean n4533HreBarMtr ;
   private boolean n4532HreBarKgm ;
   private boolean n1094HreNPrg ;
   private boolean n8623HreHilasa ;
   private boolean n8625HreOpa ;
   private boolean n8624HreEnsayo ;
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
   private boolean n9808HreRacab ;
   private boolean returnInSub ;
   private boolean n5726HreLote ;
   private boolean n719PrdNum ;
   private boolean n4967HrePrePrd ;
   private boolean n4563HrePrdCant ;
   private boolean n4565HreCanAny ;
   private boolean n4558HrePrdNum ;
   private boolean n4561HrePrdUDs ;
   private boolean n4562HreFacCon ;
   private boolean n4560HrePrdUMe ;
   private boolean n4559HrePrdDsc ;
   private boolean n12642HrePrdDc2 ;
   private boolean n4511HrePrdCFin ;
   private boolean n5808HreLanyLot ;
   private boolean n9990HreAcPie ;
   private boolean n9989HreAcMtr ;
   private boolean n9988HreAcKgm ;
   private boolean n9993HreAcDsc ;
   private boolean n9992HreAcSer ;
   private boolean n605MaqCosMin ;
   private boolean n4834BarAudOpe ;
   private boolean n4838BarAudNPz ;
   private boolean n4844BarAudULin ;
   private boolean n4460BarLotPza ;
   private boolean n11227Eta_tai ;
   private boolean n11228Eta_text ;
   private boolean n11230Eta_tvm ;
   private boolean n11229Eta_tvt ;
   private boolean n11232Eta_aai ;
   private boolean n11237Eta_aar ;
   private boolean n11231Eta_aas ;
   private boolean n11241Eta_acl ;
   private boolean n11240Eta_acp ;
   private boolean n11235Eta_aext ;
   private boolean n11239Eta_ag ;
   private boolean n11238Eta_am ;
   private boolean n11242Eta_at ;
   private boolean n11233Eta_atr ;
   private boolean n11234Eta_avm ;
   private boolean n11236Eta_avt ;
   private boolean n9721Lb_obsprb ;
   private String A10384HreObs ;
   private String AV134recobsq ;
   private String AV203lb_obsin ;
   private String A9721Lb_obsprb ;
   private IDataStoreProvider pr_default ;
   private String[] P07HB2_A130BarCodPar ;
   private byte[] P07HB2_A132BarCodReo ;
   private int[] P07HB2_A129BarCod ;
   private String[] P07HB2_A396EmprCod ;
   private short[] P07HB2_A970ProceCod ;
   private boolean[] P07HB2_n970ProceCod ;
   private int[] P07HB2_A44AlbRecCod ;
   private String[] P07HB2_A971ProceNom ;
   private boolean[] P07HB2_n971ProceNom ;
   private String[] P07HB2_A200BarPieCod ;
   private String[] P07HB3_A396EmprCod ;
   private String[] P07HB3_A407EmprNom ;
   private boolean[] P07HB3_n407EmprNom ;
   private String[] P07HB4_A942TermCod ;
   private String[] P07HB4_A1189TermUsu ;
   private boolean[] P07HB4_n1189TermUsu ;
   private java.math.BigDecimal[] P07HB5_A4542HreTotKgm ;
   private boolean[] P07HB5_n4542HreTotKgm ;
   private int[] P07HB5_A4544HreTotPie ;
   private boolean[] P07HB5_n4544HreTotPie ;
   private short[] P07HB5_A4545HreLinMaq ;
   private byte[] P07HB5_A4495HreNumCie ;
   private String[] P07HB5_A4494HreBarPar ;
   private byte[] P07HB5_A4493HreBarReo ;
   private int[] P07HB5_A4492HreBarCod ;
   private String[] P07HB5_A396EmprCod ;
   private String[] P07HB5_A697HreLotF ;
   private boolean[] P07HB5_n697HreLotF ;
   private String[] P07HB5_A4516HreDisCli ;
   private boolean[] P07HB5_n4516HreDisCli ;
   private String[] P07HB5_A11318HreDispCli ;
   private boolean[] P07HB5_n11318HreDispCli ;
   private java.math.BigDecimal[] P07HB5_A4548HreFacAbs ;
   private boolean[] P07HB5_n4548HreFacAbs ;
   private int[] P07HB5_A10099HreLtsRc ;
   private boolean[] P07HB5_n10099HreLtsRc ;
   private String[] P07HB5_A10100HreHdrLts ;
   private boolean[] P07HB5_n10100HreHdrLts ;
   private java.math.BigDecimal[] P07HB5_A10101HreFabs ;
   private boolean[] P07HB5_n10101HreFabs ;
   private int[] P07HB5_A9805HreLtsSR ;
   private boolean[] P07HB5_n9805HreLtsSR ;
   private java.math.BigDecimal[] P07HB5_A9810HreAbs ;
   private boolean[] P07HB5_n9810HreAbs ;
   private java.math.BigDecimal[] P07HB5_A10383HreVel ;
   private boolean[] P07HB5_n10383HreVel ;
   private short[] P07HB5_A10381HreAnc ;
   private boolean[] P07HB5_n10381HreAnc ;
   private short[] P07HB5_A10382HreGrm ;
   private boolean[] P07HB5_n10382HreGrm ;
   private String[] P07HB5_A10384HreObs ;
   private boolean[] P07HB5_n10384HreObs ;
   private String[] P07HB5_A11508HreAva ;
   private boolean[] P07HB5_n11508HreAva ;
   private String[] P07HB5_A12127HreAi ;
   private boolean[] P07HB5_n12127HreAi ;
   private String[] P07HB5_A12126HreAs ;
   private boolean[] P07HB5_n12126HreAs ;
   private String[] P07HB5_A9804HreAcab ;
   private boolean[] P07HB5_n9804HreAcab ;
   private java.util.Date[] P07HB5_A10104HreDtf ;
   private boolean[] P07HB5_n10104HreDtf ;
   private java.util.Date[] P07HB5_A10103HreDti ;
   private boolean[] P07HB5_n10103HreDti ;
   private int[] P07HB5_A10102HreNumInt ;
   private boolean[] P07HB5_n10102HreNumInt ;
   private java.math.BigDecimal[] P07HB5_A4533HreBarMtr ;
   private boolean[] P07HB5_n4533HreBarMtr ;
   private java.math.BigDecimal[] P07HB5_A4532HreBarKgm ;
   private boolean[] P07HB5_n4532HreBarKgm ;
   private String[] P07HB5_A1094HreNPrg ;
   private boolean[] P07HB5_n1094HreNPrg ;
   private String[] P07HB5_A8623HreHilasa ;
   private boolean[] P07HB5_n8623HreHilasa ;
   private String[] P07HB5_A8625HreOpa ;
   private boolean[] P07HB5_n8625HreOpa ;
   private int[] P07HB5_A8624HreEnsayo ;
   private boolean[] P07HB5_n8624HreEnsayo ;
   private java.util.Date[] P07HB5_A4960HreFecAlt ;
   private boolean[] P07HB5_n4960HreFecAlt ;
   private String[] P07HB5_A4863HreUsrCod ;
   private boolean[] P07HB5_n4863HreUsrCod ;
   private java.math.BigDecimal[] P07HB5_A4543HreTotMtr ;
   private boolean[] P07HB5_n4543HreTotMtr ;
   private String[] P07HB5_A4546HreMaqCod ;
   private boolean[] P07HB5_n4546HreMaqCod ;
   private int[] P07HB5_A4547HreVolPrd ;
   private boolean[] P07HB5_n4547HreVolPrd ;
   private String[] P07HB5_A4540HreIntDsc ;
   private boolean[] P07HB5_n4540HreIntDsc ;
   private String[] P07HB5_A4526HreTipColN ;
   private boolean[] P07HB5_n4526HreTipColN ;
   private byte[] P07HB5_A4525HreTipCol ;
   private boolean[] P07HB5_n4525HreTipCol ;
   private int[] P07HB5_A4522HreColNum ;
   private boolean[] P07HB5_n4522HreColNum ;
   private String[] P07HB5_A4521HreColNom ;
   private boolean[] P07HB5_n4521HreColNom ;
   private String[] P07HB5_A4518HreBarDsc ;
   private boolean[] P07HB5_n4518HreBarDsc ;
   private String[] P07HB5_A4517HreBarSer ;
   private boolean[] P07HB5_n4517HreBarSer ;
   private String[] P07HB5_A279CliNom ;
   private int[] P07HB5_A252CliCod ;
   private boolean[] P07HB5_n252CliCod ;
   private String[] P07HB5_A9808HreRacab ;
   private boolean[] P07HB5_n9808HreRacab ;
   private String[] P07HB6_A396EmprCod ;
   private int[] P07HB6_A4492HreBarCod ;
   private byte[] P07HB6_A4493HreBarReo ;
   private String[] P07HB6_A4494HreBarPar ;
   private byte[] P07HB6_A4495HreNumCie ;
   private short[] P07HB6_A4545HreLinMaq ;
   private byte[] P07HB6_A4550HreLinPro ;
   private String[] P07HB6_A4551HreProCod ;
   private short[] P07HB6_A4553HreProTie ;
   private int[] P07HB6_A4555HreNumPro ;
   private int[] P07HB6_A4966HreVolPro ;
   private String[] P07HB6_A4552HreProDsc ;
   private String[] P07HB7_A396EmprCod ;
   private int[] P07HB7_A4492HreBarCod ;
   private byte[] P07HB7_A4493HreBarReo ;
   private String[] P07HB7_A4494HreBarPar ;
   private byte[] P07HB7_A4495HreNumCie ;
   private short[] P07HB7_A4545HreLinMaq ;
   private byte[] P07HB7_A4550HreLinPro ;
   private String[] P07HB7_A5726HreLote ;
   private boolean[] P07HB7_n5726HreLote ;
   private String[] P07HB7_A719PrdNum ;
   private boolean[] P07HB7_n719PrdNum ;
   private java.math.BigDecimal[] P07HB7_A4967HrePrePrd ;
   private boolean[] P07HB7_n4967HrePrePrd ;
   private java.math.BigDecimal[] P07HB7_A4563HrePrdCant ;
   private boolean[] P07HB7_n4563HrePrdCant ;
   private java.math.BigDecimal[] P07HB7_A4565HreCanAny ;
   private boolean[] P07HB7_n4565HreCanAny ;
   private String[] P07HB7_A4558HrePrdNum ;
   private boolean[] P07HB7_n4558HrePrdNum ;
   private String[] P07HB7_A4561HrePrdUDs ;
   private boolean[] P07HB7_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P07HB7_A4562HreFacCon ;
   private boolean[] P07HB7_n4562HreFacCon ;
   private byte[] P07HB7_A4560HrePrdUMe ;
   private boolean[] P07HB7_n4560HrePrdUMe ;
   private byte[] P07HB7_A743PrdUniCon ;
   private String[] P07HB7_A4559HrePrdDsc ;
   private boolean[] P07HB7_n4559HrePrdDsc ;
   private String[] P07HB7_A12642HrePrdDc2 ;
   private boolean[] P07HB7_n12642HrePrdDc2 ;
   private short[] P07HB7_A4557HreRecLin ;
   private String[] P07HB8_A396EmprCod ;
   private int[] P07HB8_A4492HreBarCod ;
   private byte[] P07HB8_A4493HreBarReo ;
   private String[] P07HB8_A4494HreBarPar ;
   private byte[] P07HB8_A4495HreNumCie ;
   private short[] P07HB8_A4508HreLinMAL ;
   private String[] P07HB8_A719PrdNum ;
   private boolean[] P07HB8_n719PrdNum ;
   private byte[] P07HB8_A4509HreNumAny ;
   private String[] P07HB9_A396EmprCod ;
   private int[] P07HB9_A4492HreBarCod ;
   private byte[] P07HB9_A4493HreBarReo ;
   private String[] P07HB9_A4494HreBarPar ;
   private byte[] P07HB9_A4495HreNumCie ;
   private short[] P07HB9_A4508HreLinMAL ;
   private String[] P07HB9_A719PrdNum ;
   private boolean[] P07HB9_n719PrdNum ;
   private java.math.BigDecimal[] P07HB9_A724PrdPreAct ;
   private java.math.BigDecimal[] P07HB9_A707PrdFacCon ;
   private java.math.BigDecimal[] P07HB9_A4511HrePrdCFin ;
   private boolean[] P07HB9_n4511HrePrdCFin ;
   private String[] P07HB9_A5808HreLanyLot ;
   private boolean[] P07HB9_n5808HreLanyLot ;
   private String[] P07HB9_A718PrdNom ;
   private byte[] P07HB9_A4509HreNumAny ;
   private byte[] P07HB10_A4495HreNumCie ;
   private String[] P07HB10_A4494HreBarPar ;
   private byte[] P07HB10_A4493HreBarReo ;
   private int[] P07HB10_A4492HreBarCod ;
   private String[] P07HB10_A396EmprCod ;
   private java.math.BigDecimal[] P07HB10_A4501HreAgrMtr ;
   private String[] P07HB10_A4505HreAgrDsc ;
   private short[] P07HB10_A4502HreAgrPie ;
   private java.math.BigDecimal[] P07HB10_A4500HreAgrKgm ;
   private String[] P07HB10_A4504HreAgrSer ;
   private String[] P07HB10_A4499HreAgrPar ;
   private byte[] P07HB10_A4498HreAgrReo ;
   private int[] P07HB10_A4497HreAgrCod ;
   private byte[] P07HB11_A4495HreNumCie ;
   private String[] P07HB11_A4494HreBarPar ;
   private byte[] P07HB11_A4493HreBarReo ;
   private int[] P07HB11_A4492HreBarCod ;
   private String[] P07HB11_A396EmprCod ;
   private int[] P07HB11_A9990HreAcPie ;
   private boolean[] P07HB11_n9990HreAcPie ;
   private java.math.BigDecimal[] P07HB11_A9989HreAcMtr ;
   private boolean[] P07HB11_n9989HreAcMtr ;
   private java.math.BigDecimal[] P07HB11_A9988HreAcKgm ;
   private boolean[] P07HB11_n9988HreAcKgm ;
   private String[] P07HB11_A9993HreAcDsc ;
   private boolean[] P07HB11_n9993HreAcDsc ;
   private String[] P07HB11_A9992HreAcSer ;
   private boolean[] P07HB11_n9992HreAcSer ;
   private String[] P07HB11_A9987HreAcPar ;
   private byte[] P07HB11_A9986HreAcReo ;
   private int[] P07HB11_A9985HreAcCod ;
   private String[] P07HB12_A719PrdNum ;
   private boolean[] P07HB12_n719PrdNum ;
   private String[] P07HB12_A396EmprCod ;
   private java.math.BigDecimal[] P07HB12_A707PrdFacCon ;
   private short[] P07HB13_A771ProForTie ;
   private String[] P07HB14_A602MaqCod ;
   private String[] P07HB14_A396EmprCod ;
   private java.math.BigDecimal[] P07HB14_A605MaqCosMin ;
   private boolean[] P07HB14_n605MaqCosMin ;
   private String[] P07HB15_A130BarCodPar ;
   private byte[] P07HB15_A132BarCodReo ;
   private int[] P07HB15_A129BarCod ;
   private String[] P07HB15_A396EmprCod ;
   private String[] P07HB15_A9737BarValPar ;
   private String[] P07HB15_A3295BarParVal ;
   private String[] P07HB15_A12671BarParVl2 ;
   private short[] P07HB15_A1664ParFasCod ;
   private short[] P07HB15_A194BarOrdLin ;
   private String[] P07HB15_A758ProCod ;
   private String[] P07HB16_A130BarCodPar ;
   private byte[] P07HB16_A132BarCodReo ;
   private int[] P07HB16_A129BarCod ;
   private String[] P07HB16_A396EmprCod ;
   private int[] P07HB16_A4834BarAudOpe ;
   private boolean[] P07HB16_n4834BarAudOpe ;
   private int[] P07HB16_A4836BarAudSup ;
   private short[] P07HB16_A4838BarAudNPz ;
   private boolean[] P07HB16_n4838BarAudNPz ;
   private short[] P07HB16_A4844BarAudULin ;
   private boolean[] P07HB16_n4844BarAudULin ;
   private short[] P07HB16_A4460BarLotPza ;
   private boolean[] P07HB16_n4460BarLotPza ;
   private String[] P07HB17_A396EmprCod ;
   private int[] P07HB17_A11213Eta_hdr ;
   private byte[] P07HB17_A11214Eta_hdrr ;
   private String[] P07HB17_A11215Eta_hdrp ;
   private java.math.BigDecimal[] P07HB17_A11227Eta_tai ;
   private boolean[] P07HB17_n11227Eta_tai ;
   private short[] P07HB17_A11228Eta_text ;
   private boolean[] P07HB17_n11228Eta_text ;
   private short[] P07HB17_A11230Eta_tvm ;
   private boolean[] P07HB17_n11230Eta_tvm ;
   private long[] P07HB17_A11229Eta_tvt ;
   private boolean[] P07HB17_n11229Eta_tvt ;
   private java.math.BigDecimal[] P07HB17_A11232Eta_aai ;
   private boolean[] P07HB17_n11232Eta_aai ;
   private long[] P07HB17_A11237Eta_aar ;
   private boolean[] P07HB17_n11237Eta_aar ;
   private java.math.BigDecimal[] P07HB17_A11231Eta_aas ;
   private boolean[] P07HB17_n11231Eta_aas ;
   private short[] P07HB17_A11241Eta_acl ;
   private boolean[] P07HB17_n11241Eta_acl ;
   private short[] P07HB17_A11240Eta_acp ;
   private boolean[] P07HB17_n11240Eta_acp ;
   private short[] P07HB17_A11235Eta_aext ;
   private boolean[] P07HB17_n11235Eta_aext ;
   private short[] P07HB17_A11239Eta_ag ;
   private boolean[] P07HB17_n11239Eta_ag ;
   private short[] P07HB17_A11238Eta_am ;
   private boolean[] P07HB17_n11238Eta_am ;
   private short[] P07HB17_A11242Eta_at ;
   private boolean[] P07HB17_n11242Eta_at ;
   private short[] P07HB17_A11233Eta_atr ;
   private boolean[] P07HB17_n11233Eta_atr ;
   private short[] P07HB17_A11234Eta_avm ;
   private boolean[] P07HB17_n11234Eta_avm ;
   private long[] P07HB17_A11236Eta_avt ;
   private boolean[] P07HB17_n11236Eta_avt ;
   private String[] P07HB18_A9613Lb_Hdrp ;
   private byte[] P07HB18_A9612Lb_Hdrr ;
   private int[] P07HB18_A9611Lb_Hdr ;
   private String[] P07HB18_A9721Lb_obsprb ;
   private boolean[] P07HB18_n9721Lb_obsprb ;
   private String[] P07HB18_A396EmprCod ;
   private java.math.BigDecimal[] P07HB19_A4511HrePrdCFin ;
   private boolean[] P07HB19_n4511HrePrdCFin ;
}

final  class rhrhr02sc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07HB2", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.ProceCod, T1.AlbRecCod, T3.ProceNom, T1.BarPieCod FROM ((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (? = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07HB3", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07HB4", "SELECT TermCod, TermUsu FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07HB5", "SELECT T2.HreTotKgm, T2.HreTotPie, T1.HreLinMaq, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T1.HreLotF, T2.HreDisCli, T2.HreDispCli, T1.HreFacAbs, T2.HreLtsRc, T2.HreHdrLts, T2.HreFabs, T2.HreLtsSR, T2.HreAbs, T1.HreVel, T1.HreAnc, T1.HreGrm, T1.HreObs, T1.HreAva, T1.HreAi, T1.HreAs, T1.HreAcab, T1.HreDtf, T1.HreDti, T1.HreNumInt, T2.HreBarMtr, T2.HreBarKgm, T1.HreNPrg, T2.HreHilasa, T2.HreOpa, T2.HreEnsayo, T1.HreFecAlt, T1.HreUsrCod, T2.HreTotMtr, T1.HreMaqCod, T1.HreVolPrd, T2.HreIntDsc, T2.HreTipColN, T2.HreTipCol, T2.HreColNum, T2.HreColNom, T2.HreBarDsc, T2.HreBarSer, T3.CliNom, T2.CliCod, T2.HreRacab FROM ((TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMaq = ? ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07HB6", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreProTie, HreNumPro, HreVolPro, HreProDsc FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07HB7", "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HreLinPro, T1.HreLote, T1.PrdNum, T1.HrePrePrd, T1.HrePrdCant, T1.HreCanAny, T1.HrePrdNum, T1.HrePrdUDs, T1.HreFacCon, T1.HrePrdUMe, T2.PrdUniCon, T1.HrePrdDsc, T1.HrePrdDc2, T1.HreRecLin FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMaq = ? and T1.HreLinPro = ? ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HreLinPro, T1.HreRecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07HB8", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, PrdNum, HreNumAny FROM TXPHISREA WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ?) AND (Not (rtrim(PrdNum) IS NULL AND NOT(PrdNum IS NULL))) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07HB9", "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMAL, T1.PrdNum, T2.PrdPreAct, T2.PrdFacCon, T1.HrePrdCFin, T1.HreLanyLot, T2.PrdNom, T1.HreNumAny FROM (TXPHISREA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMAL, T1.HreNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07HB10", "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAgrMtr, HreAgrDsc, HreAgrPie, HreAgrKgm, HreAgrSer, HreAgrPar, HreAgrReo, HreAgrCod FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07HB11", "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAcPie, HreAcMtr, HreAcKgm, HreAcDsc, HreAcSer, HreAcPar, HreAcReo, HreAcCod FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07HB12", "SELECT PrdNum, EmprCod, PrdFacCon FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07HB13", "SELECT SUM(ProForTie) FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07HB14", "SELECT MaqCod, EmprCod, MaqCosMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07HB15", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarValPar, BarParVal, BarParVl2, ParFasCod, BarOrdLin, ProCod FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07HB16", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAudOpe, BarAudSup, BarAudNPz, BarAudULin, BarLotPza FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07HB17", "SELECT EmprCod, Eta_hdr, Eta_hdrr, Eta_hdrp, Eta_tai, Eta_text, Eta_tvm, Eta_tvt, Eta_aai, Eta_aar, Eta_aas, Eta_acl, Eta_acp, Eta_aext, Eta_ag, Eta_am, Eta_at, Eta_atr, Eta_avm, Eta_avt FROM TXPETTFAC WHERE EmprCod = ? and Eta_hdr = ? and Eta_hdrr = ? and Eta_hdrp = ? ORDER BY EmprCod, Eta_hdr, Eta_hdrr, Eta_hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07HB18", "SELECT Lb_Hdrp, Lb_Hdrr, Lb_Hdr, Lb_obsprb, EmprCod FROM TXPHDRINO WHERE (Lb_Hdr = ?) AND (Lb_Hdrr = ?) AND (Lb_Hdrp = ?) ORDER BY EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07HB19", "SELECT SUM(HrePrdCFin) FROM TXPHISREA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[10])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(22, 4);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(24, 3);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((int[]) buf[48])[0] = rslt.getInt(28);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(34);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDateTime(35);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(36, 8);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(38, 6);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(39);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(40, 30);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(41, 26);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((byte[]) buf[76])[0] = rslt.getByte(42);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((int[]) buf[78])[0] = rslt.getInt(43);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(44, 13);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(45, 26);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(46, 16);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(47, 30);
               ((int[]) buf[87])[0] = rslt.getInt(48);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
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
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((String[]) buf[26])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 40);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(20);
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
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((long[]) buf[34])[0] = rslt.getLong(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 17 :
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

