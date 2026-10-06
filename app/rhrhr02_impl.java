package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rhrhr02_impl extends GXWebReport
{
   public rhrhr02_impl( com.genexus.internet.HttpContext context )
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
         rhrhr02_impl.this.GXt_char1 = GXv_char2[0] ;
         AV71Station = GXt_char1 ;
         GXv_char2[0] = AV10EmprCod ;
         GXv_char3[0] = AV74EmprNom ;
         GXv_char4[0] = AV72UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char2, GXv_char3, GXv_char4) ;
         rhrhr02_impl.this.AV10EmprCod = GXv_char2[0] ;
         rhrhr02_impl.this.AV74EmprNom = GXv_char3[0] ;
         rhrhr02_impl.this.AV72UsurCod = GXv_char4[0] ;
         GXt_int5 = AV94F_laundry ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "LAUNDR", ""), GXv_int6) ;
         rhrhr02_impl.this.GXt_int5 = GXv_int6[0] ;
         AV94F_laundry = GXt_int5 ;
         GXt_char1 = AV44Lit0 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( AV135Pgmname, (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV44Lit0 = GXt_char1 ;
         GXt_char1 = AV45Lit1 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV45Lit1 = GXt_char1 ;
         GXt_char1 = AV46Lit2 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV46Lit2 = GXt_char1 ;
         GXt_char1 = AV47Lit3 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV47Lit3 = GXt_char1 ;
         GXt_char1 = AV48Lit4 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV48Lit4 = GXt_char1 ;
         GXt_char1 = AV49Lit5 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN388_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV49Lit5 = GXt_char1 ;
         GXt_char1 = AV50Lit6 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV50Lit6 = GXt_char1 ;
         GXt_char1 = AV51Lit7 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2458_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV51Lit7 = GXt_char1 ;
         GXt_char1 = AV52Lit8 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1193_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV52Lit8 = GXt_char1 ;
         GXt_char1 = AV53Lit9 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1199_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV53Lit9 = GXt_char1 ;
         GXt_char1 = AV54Lit10 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1150_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV54Lit10 = GXt_char1 ;
         GXt_char1 = AV55Lit11 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV55Lit11 = GXt_char1 ;
         GXt_char1 = AV56Lit12 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV56Lit12 = GXt_char1 ;
         GXt_char1 = AV57Lit13 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3016_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV57Lit13 = GXt_char1 ;
         GXt_char1 = AV58Lit14 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV58Lit14 = GXt_char1 ;
         GXt_char1 = AV59Lit15 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3018_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV59Lit15 = GXt_char1 ;
         GXt_char1 = AV60Lit16 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3019_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV60Lit16 = GXt_char1 ;
         GXt_char1 = AV61Lit17 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3020_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV61Lit17 = GXt_char1 ;
         GXt_char1 = AV62Lit18 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3021_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV62Lit18 = GXt_char1 ;
         GXt_char1 = AV63Lit19 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV63Lit19 = GXt_char1 ;
         GXt_char1 = AV64Lit20 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1546_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV64Lit20 = GXt_char1 ;
         GXt_char1 = AV65Lit21 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3017_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV65Lit21 = GXt_char1 ;
         GXt_char1 = AV66Lit22 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3022_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV66Lit22 = GXt_char1 ;
         GXt_char1 = AV67Lit23 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV67Lit23 = GXt_char1 ;
         GXt_char1 = AV68Lit24 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3023_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV68Lit24 = GXt_char1 ;
         GXt_char1 = AV73Lit25 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN813_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV73Lit25 = GXt_char1 ;
         GXt_char1 = AV82Lit26 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV82Lit26 = GXt_char1 ;
         GXt_char1 = AV83Lit27 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV83Lit27 = GXt_char1 ;
         GXt_char1 = AV90Lit28 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN038", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV90Lit28 = GXt_char1 ;
         GXt_char1 = AV92Lit29 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1311_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV92Lit29 = GXt_char1 ;
         GXt_char1 = AV93Lit30 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV93Lit30 = GXt_char1 ;
         GXt_char1 = AV102Lit40 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN674_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV102Lit40 = GXt_char1 ;
         GXt_char1 = AV104Lit50 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV104Lit50 = GXt_char1 ;
         AV105Lit51 = httpContext.getMessage( "Inicial", "") ;
         AV106Lit52 = httpContext.getMessage( "Final", "") ;
         GXt_char1 = AV107Lit53 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV107Lit53 = GXt_char1 ;
         GXt_char1 = AV130lit54 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1127_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV130lit54 = GXt_char1 ;
         GXt_char1 = AV115Lit60 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN758_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV115Lit60 = GXt_char1 ;
         GXt_char1 = AV116Lit61 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN759_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV116Lit61 = GXt_char1 ;
         GXt_char1 = AV117Lit62 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN760_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV117Lit62 = GXt_char1 ;
         GXt_char1 = AV111Lit300 ;
         GXv_char4[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char4) ;
         rhrhr02_impl.this.GXt_char1 = GXv_char4[0] ;
         AV111Lit300 = GXt_char1 ;
         GXt_int5 = (byte)(DecimalUtil.decToDouble(AV110Intexco)) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
         rhrhr02_impl.this.GXt_int5 = GXv_int6[0] ;
         AV110Intexco = DecimalUtil.doubleToDec(GXt_int5) ;
         GXt_int5 = AV125costekgmt ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "KGMTCS", ""), GXv_int6) ;
         rhrhr02_impl.this.GXt_int5 = GXv_int6[0] ;
         AV125costekgmt = GXt_int5 ;
         GXt_int5 = AV129Divpor1000 ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV10EmprCod, "100000", GXv_int6) ;
         rhrhr02_impl.this.GXt_int5 = GXv_int6[0] ;
         AV129Divpor1000 = GXt_int5 ;
         /* Using cursor P06V02 */
         pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, AV110Intexco});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P06V02_A130BarCodPar[0] ;
            A132BarCodReo = P06V02_A132BarCodReo[0] ;
            A129BarCod = P06V02_A129BarCod[0] ;
            A396EmprCod = P06V02_A396EmprCod[0] ;
            A970ProceCod = P06V02_A970ProceCod[0] ;
            n970ProceCod = P06V02_n970ProceCod[0] ;
            A44AlbRecCod = P06V02_A44AlbRecCod[0] ;
            A971ProceNom = P06V02_A971ProceNom[0] ;
            n971ProceNom = P06V02_n971ProceNom[0] ;
            A200BarPieCod = P06V02_A200BarPieCod[0] ;
            A970ProceCod = P06V02_A970ProceCod[0] ;
            n970ProceCod = P06V02_n970ProceCod[0] ;
            A971ProceNom = P06V02_A971ProceNom[0] ;
            n971ProceNom = P06V02_n971ProceNom[0] ;
            AV109ProceNom = A971ProceNom ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GXt_int7 = AV126TotBanyos ;
         GXv_int8[0] = GXt_int7 ;
         new app.numerodebanyos(remoteHandle, context).execute( AV10EmprCod, AV11BarCod, AV12BarCodReo, AV13BarCodPar, AV99HreMaqCod, GXv_int8) ;
         rhrhr02_impl.this.GXt_int7 = GXv_int8[0] ;
         AV126TotBanyos = GXt_int7 ;
         /* Using cursor P06V03 */
         pr_default.execute(1, new Object[] {AV10EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P06V03_A396EmprCod[0] ;
            A407EmprNom = P06V03_A407EmprNom[0] ;
            n407EmprNom = P06V03_n407EmprNom[0] ;
            AV36NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV8Termin = context.getWorkstationId( remoteHandle) ;
         /* Using cursor P06V04 */
         pr_default.execute(2, new Object[] {AV8Termin});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A942TermCod = P06V04_A942TermCod[0] ;
            A1189TermUsu = P06V04_A1189TermUsu[0] ;
            n1189TermUsu = P06V04_n1189TermUsu[0] ;
            AV9TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         System.out.println( httpContext.getMessage( "&BarCod ,&BarCodReo ,&BarCodPar ,&HRENUMCIE", "")+localUtil.format( DecimalUtil.doubleToDec(AV11BarCod), "ZZZZZZZ9")+","+localUtil.format( DecimalUtil.doubleToDec(AV12BarCodReo), "9")+","+AV13BarCodPar+","+localUtil.format( DecimalUtil.doubleToDec(AV87HRENUMCIE), "Z9") );
         AV91LinMaq = (short)(0) ;
         AV112Costec = DecimalUtil.doubleToDec(0) ;
         AV113CosteD = DecimalUtil.doubleToDec(0) ;
         AV114CosteA = DecimalUtil.doubleToDec(0) ;
         GxHdr5 = true ;
         /* Using cursor P06V05 */
         pr_default.execute(3, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A4542HreTotKgm = P06V05_A4542HreTotKgm[0] ;
            n4542HreTotKgm = P06V05_n4542HreTotKgm[0] ;
            A4543HreTotMtr = P06V05_A4543HreTotMtr[0] ;
            n4543HreTotMtr = P06V05_n4543HreTotMtr[0] ;
            A4544HreTotPie = P06V05_A4544HreTotPie[0] ;
            n4544HreTotPie = P06V05_n4544HreTotPie[0] ;
            A4545HreLinMaq = P06V05_A4545HreLinMaq[0] ;
            A4495HreNumCie = P06V05_A4495HreNumCie[0] ;
            A4494HreBarPar = P06V05_A4494HreBarPar[0] ;
            A4493HreBarReo = P06V05_A4493HreBarReo[0] ;
            A4492HreBarCod = P06V05_A4492HreBarCod[0] ;
            A396EmprCod = P06V05_A396EmprCod[0] ;
            A9804HreAcab = P06V05_A9804HreAcab[0] ;
            n9804HreAcab = P06V05_n9804HreAcab[0] ;
            A13451HreComp2 = P06V05_A13451HreComp2[0] ;
            n13451HreComp2 = P06V05_n13451HreComp2[0] ;
            A13450HreComp1 = P06V05_A13450HreComp1[0] ;
            n13450HreComp1 = P06V05_n13450HreComp1[0] ;
            A4524HreColNumC = P06V05_A4524HreColNumC[0] ;
            n4524HreColNumC = P06V05_n4524HreColNumC[0] ;
            A4523HreColNomC = P06V05_A4523HreColNomC[0] ;
            n4523HreColNomC = P06V05_n4523HreColNomC[0] ;
            A1094HreNPrg = P06V05_A1094HreNPrg[0] ;
            n1094HreNPrg = P06V05_n1094HreNPrg[0] ;
            A8623HreHilasa = P06V05_A8623HreHilasa[0] ;
            n8623HreHilasa = P06V05_n8623HreHilasa[0] ;
            A8625HreOpa = P06V05_A8625HreOpa[0] ;
            n8625HreOpa = P06V05_n8625HreOpa[0] ;
            A8624HreEnsayo = P06V05_A8624HreEnsayo[0] ;
            n8624HreEnsayo = P06V05_n8624HreEnsayo[0] ;
            A4960HreFecAlt = P06V05_A4960HreFecAlt[0] ;
            n4960HreFecAlt = P06V05_n4960HreFecAlt[0] ;
            A4863HreUsrCod = P06V05_A4863HreUsrCod[0] ;
            n4863HreUsrCod = P06V05_n4863HreUsrCod[0] ;
            A4546HreMaqCod = P06V05_A4546HreMaqCod[0] ;
            n4546HreMaqCod = P06V05_n4546HreMaqCod[0] ;
            A4547HreVolPrd = P06V05_A4547HreVolPrd[0] ;
            n4547HreVolPrd = P06V05_n4547HreVolPrd[0] ;
            A4540HreIntDsc = P06V05_A4540HreIntDsc[0] ;
            n4540HreIntDsc = P06V05_n4540HreIntDsc[0] ;
            A4526HreTipColN = P06V05_A4526HreTipColN[0] ;
            n4526HreTipColN = P06V05_n4526HreTipColN[0] ;
            A4525HreTipCol = P06V05_A4525HreTipCol[0] ;
            n4525HreTipCol = P06V05_n4525HreTipCol[0] ;
            A4522HreColNum = P06V05_A4522HreColNum[0] ;
            n4522HreColNum = P06V05_n4522HreColNum[0] ;
            A4521HreColNom = P06V05_A4521HreColNom[0] ;
            n4521HreColNom = P06V05_n4521HreColNom[0] ;
            A4518HreBarDsc = P06V05_A4518HreBarDsc[0] ;
            n4518HreBarDsc = P06V05_n4518HreBarDsc[0] ;
            A4517HreBarSer = P06V05_A4517HreBarSer[0] ;
            n4517HreBarSer = P06V05_n4517HreBarSer[0] ;
            A279CliNom = P06V05_A279CliNom[0] ;
            A252CliCod = P06V05_A252CliCod[0] ;
            n252CliCod = P06V05_n252CliCod[0] ;
            A4542HreTotKgm = P06V05_A4542HreTotKgm[0] ;
            n4542HreTotKgm = P06V05_n4542HreTotKgm[0] ;
            A4543HreTotMtr = P06V05_A4543HreTotMtr[0] ;
            n4543HreTotMtr = P06V05_n4543HreTotMtr[0] ;
            A4544HreTotPie = P06V05_A4544HreTotPie[0] ;
            n4544HreTotPie = P06V05_n4544HreTotPie[0] ;
            A13451HreComp2 = P06V05_A13451HreComp2[0] ;
            n13451HreComp2 = P06V05_n13451HreComp2[0] ;
            A13450HreComp1 = P06V05_A13450HreComp1[0] ;
            n13450HreComp1 = P06V05_n13450HreComp1[0] ;
            A4524HreColNumC = P06V05_A4524HreColNumC[0] ;
            n4524HreColNumC = P06V05_n4524HreColNumC[0] ;
            A4523HreColNomC = P06V05_A4523HreColNomC[0] ;
            n4523HreColNomC = P06V05_n4523HreColNomC[0] ;
            A8623HreHilasa = P06V05_A8623HreHilasa[0] ;
            n8623HreHilasa = P06V05_n8623HreHilasa[0] ;
            A8625HreOpa = P06V05_A8625HreOpa[0] ;
            n8625HreOpa = P06V05_n8625HreOpa[0] ;
            A8624HreEnsayo = P06V05_A8624HreEnsayo[0] ;
            n8624HreEnsayo = P06V05_n8624HreEnsayo[0] ;
            A4540HreIntDsc = P06V05_A4540HreIntDsc[0] ;
            n4540HreIntDsc = P06V05_n4540HreIntDsc[0] ;
            A4526HreTipColN = P06V05_A4526HreTipColN[0] ;
            n4526HreTipColN = P06V05_n4526HreTipColN[0] ;
            A4525HreTipCol = P06V05_A4525HreTipCol[0] ;
            n4525HreTipCol = P06V05_n4525HreTipCol[0] ;
            A4522HreColNum = P06V05_A4522HreColNum[0] ;
            n4522HreColNum = P06V05_n4522HreColNum[0] ;
            A4521HreColNom = P06V05_A4521HreColNom[0] ;
            n4521HreColNom = P06V05_n4521HreColNom[0] ;
            A4518HreBarDsc = P06V05_A4518HreBarDsc[0] ;
            n4518HreBarDsc = P06V05_n4518HreBarDsc[0] ;
            A4517HreBarSer = P06V05_A4517HreBarSer[0] ;
            n4517HreBarSer = P06V05_n4517HreBarSer[0] ;
            A252CliCod = P06V05_A252CliCod[0] ;
            n252CliCod = P06V05_n252CliCod[0] ;
            A279CliNom = P06V05_A279CliNom[0] ;
            System.out.println( httpContext.getMessage( "Atributo.HRENUMCIE", "")+localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") );
            AV99HreMaqCod = A4546HreMaqCod ;
            /* Execute user subroutine: 'MAQUIN' */
            S151 ();
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
            /* Using cursor P06V06 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4550HreLinPro = P06V06_A4550HreLinPro[0] ;
               A4551HreProCod = P06V06_A4551HreProCod[0] ;
               A4966HreVolPro = P06V06_A4966HreVolPro[0] ;
               A4552HreProDsc = P06V06_A4552HreProDsc[0] ;
               if ( ( AV91LinMaq != A4545HreLinMaq ) && ( AV91LinMaq != 0 ) )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV91LinMaq = A4545HreLinMaq ;
               AV97HreProCod = A4551HreProCod ;
               /* Execute user subroutine: 'CPROFO' */
               S141 ();
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
               h6V00( false, 28) ;
               getPrinter().GxDrawRect(7, Gx_line+5, 771, Gx_line+25, 2, 192, 192, 192, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4551HreProCod, "")), 121, Gx_line+6, 166, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4552HreProDsc, "")), 171, Gx_line+6, 422, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Lit19, "")), 48, Gx_line+6, 116, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Lit29, "")), 435, Gx_line+6, 503, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9")), 508, Gx_line+6, 542, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4966HreVolPro), "ZZZZ9")), 675, Gx_line+6, 718, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Lit30, "")), 589, Gx_line+6, 673, Gx_line+24, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
               AV31Coste1 = DecimalUtil.doubleToDec(0) ;
               AV32Coste2 = DecimalUtil.doubleToDec(0) ;
               AV30CosteA1 = DecimalUtil.doubleToDec(0) ;
               AV29CosteP1 = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P06V07 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A4558HrePrdNum = P06V07_A4558HrePrdNum[0] ;
                  n4558HrePrdNum = P06V07_n4558HrePrdNum[0] ;
                  A719PrdNum = P06V07_A719PrdNum[0] ;
                  n719PrdNum = P06V07_n719PrdNum[0] ;
                  A4967HrePrePrd = P06V07_A4967HrePrePrd[0] ;
                  n4967HrePrePrd = P06V07_n4967HrePrePrd[0] ;
                  A4566HreForNro = P06V07_A4566HreForNro[0] ;
                  n4566HreForNro = P06V07_n4566HreForNro[0] ;
                  A4563HrePrdCant = P06V07_A4563HrePrdCant[0] ;
                  n4563HrePrdCant = P06V07_n4563HrePrdCant[0] ;
                  A4565HreCanAny = P06V07_A4565HreCanAny[0] ;
                  n4565HreCanAny = P06V07_n4565HreCanAny[0] ;
                  A4561HrePrdUDs = P06V07_A4561HrePrdUDs[0] ;
                  n4561HrePrdUDs = P06V07_n4561HrePrdUDs[0] ;
                  A4562HreFacCon = P06V07_A4562HreFacCon[0] ;
                  n4562HreFacCon = P06V07_n4562HreFacCon[0] ;
                  A4560HrePrdUMe = P06V07_A4560HrePrdUMe[0] ;
                  n4560HrePrdUMe = P06V07_n4560HrePrdUMe[0] ;
                  A5726HreLote = P06V07_A5726HreLote[0] ;
                  n5726HreLote = P06V07_n5726HreLote[0] ;
                  A4559HrePrdDsc = P06V07_A4559HrePrdDsc[0] ;
                  n4559HrePrdDsc = P06V07_n4559HrePrdDsc[0] ;
                  A4557HreRecLin = P06V07_A4557HreRecLin[0] ;
                  AV89PrdNum = A719PrdNum ;
                  /* Execute user subroutine: 'PRODUC' */
                  S131 ();
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
                  AV122hrelinmaq = A4545HreLinMaq ;
                  AV86PrdPreAct = A4967HrePrePrd ;
                  AV76PrdCFin = DecimalUtil.doubleToDec(0) ;
                  AV131HreForNro = A4566HreForNro ;
                  /* Execute user subroutine: 'HISREA' */
                  S161 ();
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
                  AV108Und = GXutil.substring( A4561HrePrdUDs, 1, 4) ;
                  AV39Unidades = A4561HrePrdUDs ;
                  AV37PrdCant = ((AV129Divpor1000==0) ? A4563HrePrdCant : A4563HrePrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  AV38PrdCanAny = ((A4565HreCanAny.doubleValue()>0) ? (A4563HrePrdCant.add(A4565HreCanAny).add(AV76PrdCFin)) : ((AV76PrdCFin.doubleValue()>0) ? (A4563HrePrdCant.add(AV76PrdCFin)) : A4563HrePrdCant)) ;
                  AV38PrdCanAny = ((AV129Divpor1000==0) ? AV38PrdCanAny : AV38PrdCanAny.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  AV103HREFACCON = A4562HreFacCon ;
                  if ( AV129Divpor1000 == 0 )
                  {
                     AV39Unidades = ((A4560HrePrdUMe==3) ? httpContext.getMessage( "g", "") : ((A4560HrePrdUMe==2) ? httpContext.getMessage( "cc", "") : httpContext.getMessage( "g", ""))) ;
                  }
                  else
                  {
                     AV39Unidades = ((A4560HrePrdUMe==1)||(A4560HrePrdUMe==3) ? httpContext.getMessage( "kg", "") : httpContext.getMessage( "lt", "")) ;
                  }
                  AV121Lote10 = GXutil.substring( A5726HreLote, 1, 20) ;
                  if ( ( GXutil.strcmp(A4559HrePrdDsc, httpContext.getMessage( "AGUA", "")) == 0 ) && ( AV94F_laundry == 1 ) )
                  {
                  }
                  else
                  {
                     if ( GXutil.strcmp(AV40CodPrd, " ") == 0 )
                     {
                        h6V00( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 11, Gx_line+0, 56, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 63, Gx_line+0, 254, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(AV40CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "0") == 0 ) )
                        {
                           h6V00( false, 18) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 13, Gx_line+0, 58, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 63, Gx_line+0, 254, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37PrdCant, "ZZZZ9.9999")), 361, Gx_line+0, 435, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31Coste1, "ZZZZZZ9.99")), 598, Gx_line+0, 672, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Coste2, "ZZZZZZ9.99")), 674, Gx_line+0, 748, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZZZ9.999")), 480, Gx_line+0, 561, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 442, Gx_line+0, 472, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 565, Gx_line+0, 595, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV103HREFACCON, "ZZ9.99999")), 255, Gx_line+0, 322, Gx_line+17, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108Und, "")), 326, Gx_line+1, 356, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Lote10, "")), 752, Gx_line+2, 831, Gx_line+15, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+18) ;
                        }
                        else
                        {
                           h6V00( false, 18) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), 63, Gx_line+0, 254, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37PrdCant, "ZZZZ9.9999")), 361, Gx_line+0, 435, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31Coste1, "ZZZZZZ9.99")), 598, Gx_line+0, 672, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Coste2, "ZZZZZZ9.99")), 674, Gx_line+0, 748, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZZZ9.999")), 480, Gx_line+0, 561, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 442, Gx_line+0, 472, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Unidades, "")), 565, Gx_line+0, 595, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), 11, Gx_line+0, 56, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV103HREFACCON, "ZZ9.99999")), 255, Gx_line+0, 322, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108Und, "")), 326, Gx_line+1, 356, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Lote10, "")), 752, Gx_line+2, 831, Gx_line+15, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+18) ;
                        }
                     }
                  }
                  AV29CosteP1 = AV29CosteP1.add(GXutil.roundDecimal( A4563HrePrdCant.multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                  AV30CosteA1 = AV30CosteA1.add(GXutil.roundDecimal( (A4563HrePrdCant.add(A4565HreCanAny).add(AV76PrdCFin)).multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                  if ( ( GXutil.strcmp(GXutil.substring( A4558HrePrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
                  {
                     AV112Costec = AV112Costec.add((GXutil.roundDecimal( A4563HrePrdCant.multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2))) ;
                     AV118CosteCA = AV118CosteCA.add((GXutil.roundDecimal( (A4563HrePrdCant.add(A4565HreCanAny).add(AV76PrdCFin)).multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2))) ;
                  }
                  if ( ( GXutil.strcmp(GXutil.substring( A4558HrePrdNum, 1, 1), "8") == 0 ) || ( GXutil.strcmp(GXutil.substring( A4558HrePrdNum, 1, 1), "0") == 0 ) )
                  {
                     AV114CosteA = AV114CosteA.add((GXutil.roundDecimal( A4563HrePrdCant.multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2))) ;
                     AV119CosteAA = AV119CosteAA.add((GXutil.roundDecimal( (A4563HrePrdCant.add(A4565HreCanAny).add(AV76PrdCFin)).multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2))) ;
                  }
                  if ( GXutil.strcmp(GXutil.substring( A4558HrePrdNum, 1, 1), "9") == 0 )
                  {
                     AV113CosteD = AV113CosteD.add((GXutil.roundDecimal( A4563HrePrdCant.multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2))) ;
                     AV120CosteDA = AV120CosteDA.add((GXutil.roundDecimal( (A4563HrePrdCant.add(A4565HreCanAny).add(AV76PrdCFin)).multiply(AV86PrdPreAct).multiply(AV88PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2))) ;
                  }
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               AV34CosteK1 = ((A4542HreTotKgm.doubleValue()>0) ? GXutil.roundDecimal( AV29CosteP1.divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
               AV35CosteK2 = ((A4542HreTotKgm.doubleValue()>0) ? GXutil.roundDecimal( AV30CosteA1.divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
               AV123CosteM1 = ((A4543HreTotMtr.doubleValue()>0) ? GXutil.roundDecimal( AV29CosteP1.divide(A4543HreTotMtr, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
               AV124CosteM2 = ((A4543HreTotMtr.doubleValue()>0) ? GXutil.roundDecimal( AV30CosteA1.divide(A4543HreTotMtr, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
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
               if ( AV125costekgmt == 0 )
               {
                  h6V00( false, 59) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30CosteA1, "ZZZZZZ9.99")), 674, Gx_line+9, 748, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29CosteP1, "ZZZZZZ9.99")), 598, Gx_line+9, 672, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34CosteK1, "ZZZZZZ9.99")), 598, Gx_line+30, 672, Gx_line+48, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35CosteK2, "ZZZZZZ9.99")), 674, Gx_line+30, 748, Gx_line+48, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(411, Gx_line+4, 770, Gx_line+54, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit20, "")), 429, Gx_line+9, 522, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit21, "")), 429, Gx_line+30, 547, Gx_line+48, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+59) ;
               }
               else
               {
                  h6V00( false, 78) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30CosteA1, "ZZZZZZ9.99")), 672, Gx_line+8, 746, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29CosteP1, "ZZZZZZ9.99")), 596, Gx_line+8, 670, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34CosteK1, "ZZZZZZ9.99")), 596, Gx_line+29, 670, Gx_line+47, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35CosteK2, "ZZZZZZ9.99")), 672, Gx_line+29, 746, Gx_line+47, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(411, Gx_line+3, 770, Gx_line+75, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit20, "")), 427, Gx_line+8, 520, Gx_line+26, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit21, "")), 427, Gx_line+29, 545, Gx_line+47, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123CosteM1, "ZZZZZZ9.99")), 596, Gx_line+51, 670, Gx_line+69, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV124CosteM2, "ZZZZZZ9.99")), 672, Gx_line+51, 746, Gx_line+69, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Costo Total/Mt", ""), 427, Gx_line+51, 545, Gx_line+68, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+78) ;
               }
               if ( AV94F_laundry == 1 )
               {
                  h6V00( false, 25) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95CostePz1, "ZZZZZZ9.99")), 598, Gx_line+4, 672, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV96CostePz2, "ZZZZZZ9.99")), 674, Gx_line+4, 748, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Coste p/Prenda", ""), 426, Gx_line+4, 544, Gx_line+21, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+25) ;
               }
               AV42CosteT1 = AV42CosteT1.add(AV29CosteP1) ;
               AV43CosteT2 = AV43CosteT2.add(AV30CosteA1) ;
               AV29CosteP1 = DecimalUtil.doubleToDec(0) ;
               AV30CosteA1 = DecimalUtil.doubleToDec(0) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV84Pesaje = (byte)(0) ;
            /* Using cursor P06V08 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A4508HreLinMAL = P06V08_A4508HreLinMAL[0] ;
               A719PrdNum = P06V08_A719PrdNum[0] ;
               n719PrdNum = P06V08_n719PrdNum[0] ;
               A4509HreNumAny = P06V08_A4509HreNumAny[0] ;
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
               h6V00( false, 20) ;
               getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Lit28, "")), 11, Gx_line+0, 194, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               /* Using cursor P06V09 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A4508HreLinMAL = P06V09_A4508HreLinMAL[0] ;
                  A719PrdNum = P06V09_A719PrdNum[0] ;
                  n719PrdNum = P06V09_n719PrdNum[0] ;
                  A724PrdPreAct = P06V09_A724PrdPreAct[0] ;
                  A707PrdFacCon = P06V09_A707PrdFacCon[0] ;
                  A4511HrePrdCFin = P06V09_A4511HrePrdCFin[0] ;
                  n4511HrePrdCFin = P06V09_n4511HrePrdCFin[0] ;
                  A718PrdNom = P06V09_A718PrdNom[0] ;
                  A4509HreNumAny = P06V09_A4509HreNumAny[0] ;
                  A724PrdPreAct = P06V09_A724PrdPreAct[0] ;
                  A707PrdFacCon = P06V09_A707PrdFacCon[0] ;
                  A718PrdNom = P06V09_A718PrdNom[0] ;
                  AV86PrdPreAct = A724PrdPreAct ;
                  AV31Coste1 = DecimalUtil.doubleToDec(0) ;
                  AV32Coste2 = GXutil.roundDecimal( A4511HrePrdCFin.multiply(AV86PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
                  AV40CodPrd = GXutil.substring( A719PrdNum, 1, 1) ;
                  AV37PrdCant = DecimalUtil.doubleToDec(0) ;
                  AV38PrdCanAny = A4511HrePrdCFin ;
                  AV40CodPrd = GXutil.substring( A719PrdNum, 1, 1) ;
                  if ( ( GXutil.strcmp(AV40CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV40CodPrd, "0") == 0 ) )
                  {
                     h6V00( false, 18) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 11, Gx_line+1, 56, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 63, Gx_line+1, 254, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZZZ9.999")), 475, Gx_line+1, 556, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Coste2, "ZZZZZZ9.99")), 674, Gx_line+1, 748, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     h6V00( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 63, Gx_line+0, 254, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 11, Gx_line+0, 56, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38PrdCanAny, "ZZZZZZ9.999")), 475, Gx_line+0, 556, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32Coste2, "ZZZZZZ9.99")), 674, Gx_line+0, 748, Gx_line+17, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  AV29CosteP1 = AV29CosteP1.add(DecimalUtil.doubleToDec(0)) ;
                  AV30CosteA1 = AV30CosteA1.add(GXutil.roundDecimal( A4511HrePrdCFin.multiply(AV86PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                  pr_default.readNext(7);
               }
               pr_default.close(7);
            }
            AV34CosteK1 = ((A4542HreTotKgm.doubleValue()>0) ? GXutil.roundDecimal( AV42CosteT1.divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
            AV35CosteK2 = ((A4542HreTotKgm.doubleValue()>0) ? GXutil.roundDecimal( AV43CosteT2.divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
            AV123CosteM1 = ((A4543HreTotMtr.doubleValue()>0) ? GXutil.roundDecimal( AV42CosteT1.divide(A4543HreTotMtr, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
            AV124CosteM2 = ((A4543HreTotMtr.doubleValue()>0) ? GXutil.roundDecimal( AV43CosteT2.divide(A4543HreTotMtr, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
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
            if ( AV125costekgmt == 0 )
            {
               h6V00( false, 131) ;
               getPrinter().GxDrawRect(411, Gx_line+8, 770, Gx_line+58, 1, 128, 128, 128, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43CosteT2, "ZZZZZZ9.99")), 674, Gx_line+14, 748, Gx_line+32, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42CosteT1, "ZZZZZZ9.99")), 598, Gx_line+14, 672, Gx_line+32, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34CosteK1, "ZZZZZZ9.99")), 598, Gx_line+34, 672, Gx_line+52, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35CosteK2, "ZZZZZZ9.99")), 674, Gx_line+34, 748, Gx_line+52, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit20, "")), 429, Gx_line+14, 522, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit21, "")), 429, Gx_line+34, 547, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115Lit60, "")), 55, Gx_line+11, 223, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116Lit61, "")), 55, Gx_line+51, 223, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117Lit62, "")), 55, Gx_line+90, 223, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV112Costec, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+11, 370, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV114CosteA, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+51, 370, Gx_line+68, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV113CosteD, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+90, 370, Gx_line+107, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(50, Gx_line+8, 373, Gx_line+129, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV118CosteCA, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+30, 370, Gx_line+48, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV119CosteAA, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+70, 370, Gx_line+88, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV120CosteDA, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+108, 370, Gx_line+126, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(50, Gx_line+48, 372, Gx_line+48, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(50, Gx_line+88, 372, Gx_line+88, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+131) ;
            }
            else
            {
               AV127CosteM11 = DecimalUtil.doubleToDec(AV126TotBanyos).multiply(AV123CosteM1) ;
               AV128CosteM22 = DecimalUtil.doubleToDec(AV126TotBanyos).multiply(AV124CosteM2) ;
               h6V00( false, 126) ;
               getPrinter().GxDrawRect(411, Gx_line+4, 770, Gx_line+114, 1, 128, 128, 128, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43CosteT2, "ZZZZZZ9.99")), 674, Gx_line+9, 748, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42CosteT1, "ZZZZZZ9.99")), 598, Gx_line+9, 672, Gx_line+27, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34CosteK1, "ZZZZZZ9.99")), 598, Gx_line+30, 672, Gx_line+48, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35CosteK2, "ZZZZZZ9.99")), 674, Gx_line+30, 748, Gx_line+48, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Lit20, "")), 429, Gx_line+9, 522, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit21, "")), 429, Gx_line+30, 547, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115Lit60, "")), 55, Gx_line+7, 223, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116Lit61, "")), 55, Gx_line+47, 223, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117Lit62, "")), 55, Gx_line+85, 223, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV112Costec, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+7, 370, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV114CosteA, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+47, 370, Gx_line+64, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV113CosteD, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+85, 370, Gx_line+102, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(50, Gx_line+4, 373, Gx_line+125, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV118CosteCA, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+26, 370, Gx_line+44, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV119CosteAA, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+66, 370, Gx_line+84, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV120CosteDA, "ZZ,ZZZ,ZZ9.99999")), 252, Gx_line+104, 370, Gx_line+122, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(50, Gx_line+44, 372, Gx_line+44, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(50, Gx_line+83, 372, Gx_line+83, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Costo Total/Mt", ""), 429, Gx_line+52, 547, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123CosteM1, "ZZZZZZ9.99")), 598, Gx_line+52, 672, Gx_line+70, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV124CosteM2, "ZZZZZZ9.99")), 674, Gx_line+52, 748, Gx_line+70, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Baños", ""), 432, Gx_line+77, 525, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV126TotBanyos), "ZZZ9")), 532, Gx_line+77, 562, Gx_line+94, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV127CosteM11, "ZZZZZZ9.99")), 598, Gx_line+77, 672, Gx_line+95, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV128CosteM22, "ZZZZZZ9.99")), 674, Gx_line+77, 748, Gx_line+95, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+126) ;
            }
            if ( AV94F_laundry == 1 )
            {
               h6V00( false, 73) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Coste p/Prenda", ""), 429, Gx_line+11, 547, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV95CostePz1, "ZZZZZZ9.99")), 609, Gx_line+11, 683, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV96CostePz2, "ZZZZZZ9.99")), 692, Gx_line+11, 766, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tiempo Formula", ""), 429, Gx_line+33, 547, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV98Tiempo_t), "ZZZ9")), 623, Gx_line+33, 653, Gx_line+50, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m.", ""), 660, Gx_line+33, 678, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Coste Maquina", ""), 429, Gx_line+54, 538, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV101CosteMaq, "ZZZZZZ9.99")), 599, Gx_line+54, 683, Gx_line+72, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+73) ;
            }
            AV81FlagAgr = (byte)(0) ;
            if ( GXutil.strcmp(A9804HreAcab, httpContext.getMessage( "S", "")) != 0 )
            {
               /* Execute user subroutine: 'AGRUPACIONTINTE' */
               S111 ();
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
            pr_default.readNext(3);
         }
         pr_default.close(3);
         GxHdr5 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6V00( true, 0) ;
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
      /* 'AGRUPACIONTINTE' Routine */
      returnInSub = false ;
      /* Using cursor P06V010 */
      pr_default.execute(8, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A4495HreNumCie = P06V010_A4495HreNumCie[0] ;
         A4494HreBarPar = P06V010_A4494HreBarPar[0] ;
         A4493HreBarReo = P06V010_A4493HreBarReo[0] ;
         A4492HreBarCod = P06V010_A4492HreBarCod[0] ;
         A396EmprCod = P06V010_A396EmprCod[0] ;
         A4501HreAgrMtr = P06V010_A4501HreAgrMtr[0] ;
         A4505HreAgrDsc = P06V010_A4505HreAgrDsc[0] ;
         A4502HreAgrPie = P06V010_A4502HreAgrPie[0] ;
         A4500HreAgrKgm = P06V010_A4500HreAgrKgm[0] ;
         A4504HreAgrSer = P06V010_A4504HreAgrSer[0] ;
         A4499HreAgrPar = P06V010_A4499HreAgrPar[0] ;
         A4498HreAgrReo = P06V010_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P06V010_A4497HreAgrCod[0] ;
         if ( AV81FlagAgr == 0 )
         {
            AV81FlagAgr = (byte)(1) ;
            h6V00( false, 41) ;
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
         h6V00( false, 16) ;
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

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'AGRUPACIONACABADOS' Routine */
      returnInSub = false ;
      /* Using cursor P06V011 */
      pr_default.execute(9, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A4495HreNumCie = P06V011_A4495HreNumCie[0] ;
         A4494HreBarPar = P06V011_A4494HreBarPar[0] ;
         A4493HreBarReo = P06V011_A4493HreBarReo[0] ;
         A4492HreBarCod = P06V011_A4492HreBarCod[0] ;
         A396EmprCod = P06V011_A396EmprCod[0] ;
         A9990HreAcPie = P06V011_A9990HreAcPie[0] ;
         n9990HreAcPie = P06V011_n9990HreAcPie[0] ;
         A9989HreAcMtr = P06V011_A9989HreAcMtr[0] ;
         n9989HreAcMtr = P06V011_n9989HreAcMtr[0] ;
         A9988HreAcKgm = P06V011_A9988HreAcKgm[0] ;
         n9988HreAcKgm = P06V011_n9988HreAcKgm[0] ;
         A9993HreAcDsc = P06V011_A9993HreAcDsc[0] ;
         n9993HreAcDsc = P06V011_n9993HreAcDsc[0] ;
         A9992HreAcSer = P06V011_A9992HreAcSer[0] ;
         n9992HreAcSer = P06V011_n9992HreAcSer[0] ;
         A9987HreAcPar = P06V011_A9987HreAcPar[0] ;
         A9986HreAcReo = P06V011_A9986HreAcReo[0] ;
         A9985HreAcCod = P06V011_A9985HreAcCod[0] ;
         if ( AV81FlagAgr == 0 )
         {
            AV81FlagAgr = (byte)(1) ;
            h6V00( false, 41) ;
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
         h6V00( false, 17) ;
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

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      AV88PrdFacCon = DecimalUtil.doubleToDec(1) ;
      /* Using cursor P06V012 */
      pr_default.execute(10, new Object[] {AV10EmprCod, AV89PrdNum});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A719PrdNum = P06V012_A719PrdNum[0] ;
         n719PrdNum = P06V012_n719PrdNum[0] ;
         A396EmprCod = P06V012_A396EmprCod[0] ;
         A707PrdFacCon = P06V012_A707PrdFacCon[0] ;
         AV88PrdFacCon = A707PrdFacCon ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'CPROFO' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P06V013 */
      pr_default.execute(11, new Object[] {AV10EmprCod, AV97HreProCod});
      c771ProForTie = P06V013_A771ProForTie[0] ;
      pr_default.close(11);
      AV98Tiempo_t = (short)(AV98Tiempo_t+c771ProForTie) ;
      /* End optimized group. */
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV100MAQCOSMIN = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P06V014 */
      pr_default.execute(12, new Object[] {AV10EmprCod, AV99HreMaqCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A602MaqCod = P06V014_A602MaqCod[0] ;
         A396EmprCod = P06V014_A396EmprCod[0] ;
         A605MaqCosMin = P06V014_A605MaqCosMin[0] ;
         n605MaqCosMin = P06V014_n605MaqCosMin[0] ;
         AV100MAQCOSMIN = A605MaqCosMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
      GXt_int7 = AV126TotBanyos ;
      GXv_int8[0] = GXt_int7 ;
      new app.numerodebanyos(remoteHandle, context).execute( AV10EmprCod, AV11BarCod, AV12BarCodReo, AV13BarCodPar, AV99HreMaqCod, GXv_int8) ;
      rhrhr02_impl.this.GXt_int7 = GXv_int8[0] ;
      AV126TotBanyos = GXt_int7 ;
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'HISREA' Routine */
      returnInSub = false ;
      AV76PrdCFin = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P06V015 */
      pr_default.execute(13, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Byte.valueOf(AV87HRENUMCIE), Short.valueOf(AV122hrelinmaq), AV89PrdNum});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A396EmprCod = P06V015_A396EmprCod[0] ;
         A4492HreBarCod = P06V015_A4492HreBarCod[0] ;
         A4493HreBarReo = P06V015_A4493HreBarReo[0] ;
         A4494HreBarPar = P06V015_A4494HreBarPar[0] ;
         A4495HreNumCie = P06V015_A4495HreNumCie[0] ;
         A4508HreLinMAL = P06V015_A4508HreLinMAL[0] ;
         A719PrdNum = P06V015_A719PrdNum[0] ;
         n719PrdNum = P06V015_n719PrdNum[0] ;
         A4514HreLanyNro = P06V015_A4514HreLanyNro[0] ;
         n4514HreLanyNro = P06V015_n4514HreLanyNro[0] ;
         A4511HrePrdCFin = P06V015_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = P06V015_n4511HrePrdCFin[0] ;
         A4509HreNumAny = P06V015_A4509HreNumAny[0] ;
         if ( A4514HreLanyNro == AV131HreForNro )
         {
            AV76PrdCFin = AV76PrdCFin.add(A4511HrePrdCFin) ;
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void h6V00( boolean bFoot ,
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
               getPrinter().GxDrawRect(536, Gx_line+74, 748, Gx_line+245, 2, 128, 128, 128, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9")), 138, Gx_line+79, 206, Gx_line+97, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), 229, Gx_line+79, 238, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9")), 214, Gx_line+79, 223, Gx_line+97, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 116, Gx_line+107, 161, Gx_line+124, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 177, Gx_line+107, 397, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4517HreBarSer, "")), 116, Gx_line+127, 234, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4518HreBarDsc, "")), 248, Gx_line+127, 439, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4521HreColNom, "")), 116, Gx_line+168, 212, Gx_line+185, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4522HreColNum), "ZZZZZ9")), 215, Gx_line+168, 260, Gx_line+185, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4525HreTipCol), "Z9")), 308, Gx_line+168, 324, Gx_line+185, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4526HreTipColN, "")), 328, Gx_line+168, 519, Gx_line+185, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4540HreIntDsc, "")), 116, Gx_line+206, 336, Gx_line+223, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+65, 771, Gx_line+65, 3, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 669, Gx_line+15, 728, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 669, Gx_line+39, 714, Gx_line+56, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19RelBany), "ZZZ9")), 705, Gx_line+198, 739, Gx_line+216, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9")), 697, Gx_line+175, 740, Gx_line+193, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4544HreTotPie), "ZZZ9")), 690, Gx_line+129, 741, Gx_line+147, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4542HreTotKgm, "ZZZZZ9.99")), 665, Gx_line+83, 741, Gx_line+101, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(11, Gx_line+73, 384, Gx_line+102, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36NomEmp, "")), 14, Gx_line+15, 328, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4546HreMaqCod, "")), 690, Gx_line+152, 741, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit0, "")), 14, Gx_line+39, 328, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit1, "")), 583, Gx_line+15, 634, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit2, "")), 583, Gx_line+39, 634, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit3, "")), 18, Gx_line+79, 127, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit4, "")), 11, Gx_line+106, 79, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit5, "")), 11, Gx_line+127, 62, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit6, "")), 11, Gx_line+168, 62, Gx_line+186, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit7, "")), 285, Gx_line+168, 303, Gx_line+186, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit8, "")), 11, Gx_line+205, 104, Gx_line+223, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit10, "")), 546, Gx_line+129, 597, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit11, "")), 546, Gx_line+152, 605, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit12, "")), 546, Gx_line+175, 605, Gx_line+193, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit13, "")), 546, Gx_line+198, 680, Gx_line+216, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit9, "")), 546, Gx_line+83, 572, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit14, "")), 13, Gx_line+301, 255, Gx_line+319, 0+256, 0, 0, 0) ;
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit26, "")), 546, Gx_line+106, 630, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4543HreTotMtr, "ZZZZZ9.99")), 665, Gx_line+106, 741, Gx_line+124, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(13, Gx_line+323, 254, Gx_line+323, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(358, Gx_line+323, 465, Gx_line+323, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(476, Gx_line+323, 596, Gx_line+323, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(598, Gx_line+323, 671, Gx_line+323, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(674, Gx_line+323, 747, Gx_line+323, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+276, 824, Gx_line+276, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9")), 348, Gx_line+79, 366, Gx_line+97, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº C.", ""), 300, Gx_line+79, 343, Gx_line+96, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4863HreUsrCod, "")), 116, Gx_line+230, 175, Gx_line+247, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A4960HreFecAlt, "99/99/99 99:99:99"), 182, Gx_line+230, 307, Gx_line+247, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Lit40, "")), 11, Gx_line+230, 95, Gx_line+248, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Lit50, "")), 439, Gx_line+281, 513, Gx_line+299, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105Lit51, "")), 378, Gx_line+301, 452, Gx_line+319, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106Lit52, "")), 500, Gx_line+301, 574, Gx_line+319, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Lit53, "")), 636, Gx_line+281, 710, Gx_line+299, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105Lit51, "")), 598, Gx_line+301, 672, Gx_line+319, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106Lit52, "")), 674, Gx_line+301, 748, Gx_line+319, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 292, Gx_line+302, 337, Gx_line+319, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(280, Gx_line+323, 346, Gx_line+323, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109ProceNom, "")), 311, Gx_line+230, 531, Gx_line+247, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Lit300, "")), 11, Gx_line+251, 95, Gx_line+269, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8624HreEnsayo), "ZZZZZZZ9")), 117, Gx_line+254, 176, Gx_line+271, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8625HreOpa, "@!")), 181, Gx_line+254, 189, Gx_line+271, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8623HreHilasa, "")), 202, Gx_line+254, 349, Gx_line+271, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1094HreNPrg, "")), 694, Gx_line+221, 739, Gx_line+238, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Programa", ""), 546, Gx_line+221, 630, Gx_line+238, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4523HreColNomC, "")), 116, Gx_line+185, 212, Gx_line+202, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4524HreColNumC), "ZZZZZ9")), 215, Gx_line+186, 260, Gx_line+203, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 752, Gx_line+301, 782, Gx_line+318, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(752, Gx_line+323, 825, Gx_line+323, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130lit54, "")), 11, Gx_line+148, 103, Gx_line+165, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13450HreComp1, "")), 116, Gx_line+148, 270, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13451HreComp2, "")), 278, Gx_line+148, 432, Gx_line+165, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+328) ;
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
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics5( )
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
      AV135Pgmname = "" ;
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
      AV130lit54 = "" ;
      AV115Lit60 = "" ;
      AV116Lit61 = "" ;
      AV117Lit62 = "" ;
      AV111Lit300 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV110Intexco = DecimalUtil.ZERO ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P06V02_A130BarCodPar = new String[] {""} ;
      P06V02_A132BarCodReo = new byte[1] ;
      P06V02_A129BarCod = new int[1] ;
      P06V02_A396EmprCod = new String[] {""} ;
      P06V02_A970ProceCod = new short[1] ;
      P06V02_n970ProceCod = new boolean[] {false} ;
      P06V02_A44AlbRecCod = new int[1] ;
      P06V02_A971ProceNom = new String[] {""} ;
      P06V02_n971ProceNom = new boolean[] {false} ;
      P06V02_A200BarPieCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A971ProceNom = "" ;
      A200BarPieCod = "" ;
      AV109ProceNom = "" ;
      AV99HreMaqCod = "" ;
      P06V03_A396EmprCod = new String[] {""} ;
      P06V03_A407EmprNom = new String[] {""} ;
      P06V03_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV36NomEmp = "" ;
      AV8Termin = "" ;
      P06V04_A942TermCod = new String[] {""} ;
      P06V04_A1189TermUsu = new String[] {""} ;
      P06V04_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV9TermUsu = "" ;
      AV112Costec = DecimalUtil.ZERO ;
      AV113CosteD = DecimalUtil.ZERO ;
      AV114CosteA = DecimalUtil.ZERO ;
      P06V05_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V05_n4542HreTotKgm = new boolean[] {false} ;
      P06V05_A4543HreTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V05_n4543HreTotMtr = new boolean[] {false} ;
      P06V05_A4544HreTotPie = new int[1] ;
      P06V05_n4544HreTotPie = new boolean[] {false} ;
      P06V05_A4545HreLinMaq = new short[1] ;
      P06V05_A4495HreNumCie = new byte[1] ;
      P06V05_A4494HreBarPar = new String[] {""} ;
      P06V05_A4493HreBarReo = new byte[1] ;
      P06V05_A4492HreBarCod = new int[1] ;
      P06V05_A396EmprCod = new String[] {""} ;
      P06V05_A9804HreAcab = new String[] {""} ;
      P06V05_n9804HreAcab = new boolean[] {false} ;
      P06V05_A13451HreComp2 = new String[] {""} ;
      P06V05_n13451HreComp2 = new boolean[] {false} ;
      P06V05_A13450HreComp1 = new String[] {""} ;
      P06V05_n13450HreComp1 = new boolean[] {false} ;
      P06V05_A4524HreColNumC = new int[1] ;
      P06V05_n4524HreColNumC = new boolean[] {false} ;
      P06V05_A4523HreColNomC = new String[] {""} ;
      P06V05_n4523HreColNomC = new boolean[] {false} ;
      P06V05_A1094HreNPrg = new String[] {""} ;
      P06V05_n1094HreNPrg = new boolean[] {false} ;
      P06V05_A8623HreHilasa = new String[] {""} ;
      P06V05_n8623HreHilasa = new boolean[] {false} ;
      P06V05_A8625HreOpa = new String[] {""} ;
      P06V05_n8625HreOpa = new boolean[] {false} ;
      P06V05_A8624HreEnsayo = new int[1] ;
      P06V05_n8624HreEnsayo = new boolean[] {false} ;
      P06V05_A4960HreFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P06V05_n4960HreFecAlt = new boolean[] {false} ;
      P06V05_A4863HreUsrCod = new String[] {""} ;
      P06V05_n4863HreUsrCod = new boolean[] {false} ;
      P06V05_A4546HreMaqCod = new String[] {""} ;
      P06V05_n4546HreMaqCod = new boolean[] {false} ;
      P06V05_A4547HreVolPrd = new int[1] ;
      P06V05_n4547HreVolPrd = new boolean[] {false} ;
      P06V05_A4540HreIntDsc = new String[] {""} ;
      P06V05_n4540HreIntDsc = new boolean[] {false} ;
      P06V05_A4526HreTipColN = new String[] {""} ;
      P06V05_n4526HreTipColN = new boolean[] {false} ;
      P06V05_A4525HreTipCol = new byte[1] ;
      P06V05_n4525HreTipCol = new boolean[] {false} ;
      P06V05_A4522HreColNum = new int[1] ;
      P06V05_n4522HreColNum = new boolean[] {false} ;
      P06V05_A4521HreColNom = new String[] {""} ;
      P06V05_n4521HreColNom = new boolean[] {false} ;
      P06V05_A4518HreBarDsc = new String[] {""} ;
      P06V05_n4518HreBarDsc = new boolean[] {false} ;
      P06V05_A4517HreBarSer = new String[] {""} ;
      P06V05_n4517HreBarSer = new boolean[] {false} ;
      P06V05_A279CliNom = new String[] {""} ;
      P06V05_A252CliCod = new int[1] ;
      P06V05_n252CliCod = new boolean[] {false} ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A4543HreTotMtr = DecimalUtil.ZERO ;
      A4494HreBarPar = "" ;
      A9804HreAcab = "" ;
      A13451HreComp2 = "" ;
      A13450HreComp1 = "" ;
      A4523HreColNomC = "" ;
      A1094HreNPrg = "" ;
      A8623HreHilasa = "" ;
      A8625HreOpa = "" ;
      A4960HreFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4863HreUsrCod = "" ;
      A4546HreMaqCod = "" ;
      A4540HreIntDsc = "" ;
      A4526HreTipColN = "" ;
      A4521HreColNom = "" ;
      A4518HreBarDsc = "" ;
      A4517HreBarSer = "" ;
      A279CliNom = "" ;
      AV42CosteT1 = DecimalUtil.ZERO ;
      AV43CosteT2 = DecimalUtil.ZERO ;
      P06V06_A396EmprCod = new String[] {""} ;
      P06V06_A4492HreBarCod = new int[1] ;
      P06V06_A4493HreBarReo = new byte[1] ;
      P06V06_A4494HreBarPar = new String[] {""} ;
      P06V06_A4495HreNumCie = new byte[1] ;
      P06V06_A4545HreLinMaq = new short[1] ;
      P06V06_A4550HreLinPro = new byte[1] ;
      P06V06_A4551HreProCod = new String[] {""} ;
      P06V06_A4966HreVolPro = new int[1] ;
      P06V06_A4552HreProDsc = new String[] {""} ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      AV97HreProCod = "" ;
      AV31Coste1 = DecimalUtil.ZERO ;
      AV32Coste2 = DecimalUtil.ZERO ;
      AV30CosteA1 = DecimalUtil.ZERO ;
      AV29CosteP1 = DecimalUtil.ZERO ;
      P06V07_A396EmprCod = new String[] {""} ;
      P06V07_A4492HreBarCod = new int[1] ;
      P06V07_A4493HreBarReo = new byte[1] ;
      P06V07_A4494HreBarPar = new String[] {""} ;
      P06V07_A4495HreNumCie = new byte[1] ;
      P06V07_A4545HreLinMaq = new short[1] ;
      P06V07_A4550HreLinPro = new byte[1] ;
      P06V07_A4558HrePrdNum = new String[] {""} ;
      P06V07_n4558HrePrdNum = new boolean[] {false} ;
      P06V07_A719PrdNum = new String[] {""} ;
      P06V07_n719PrdNum = new boolean[] {false} ;
      P06V07_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V07_n4967HrePrePrd = new boolean[] {false} ;
      P06V07_A4566HreForNro = new byte[1] ;
      P06V07_n4566HreForNro = new boolean[] {false} ;
      P06V07_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V07_n4563HrePrdCant = new boolean[] {false} ;
      P06V07_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V07_n4565HreCanAny = new boolean[] {false} ;
      P06V07_A4561HrePrdUDs = new String[] {""} ;
      P06V07_n4561HrePrdUDs = new boolean[] {false} ;
      P06V07_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V07_n4562HreFacCon = new boolean[] {false} ;
      P06V07_A4560HrePrdUMe = new byte[1] ;
      P06V07_n4560HrePrdUMe = new boolean[] {false} ;
      P06V07_A5726HreLote = new String[] {""} ;
      P06V07_n5726HreLote = new boolean[] {false} ;
      P06V07_A4559HrePrdDsc = new String[] {""} ;
      P06V07_n4559HrePrdDsc = new boolean[] {false} ;
      P06V07_A4557HreRecLin = new short[1] ;
      A4558HrePrdNum = "" ;
      A719PrdNum = "" ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
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
      AV121Lote10 = "" ;
      AV118CosteCA = DecimalUtil.ZERO ;
      AV119CosteAA = DecimalUtil.ZERO ;
      AV120CosteDA = DecimalUtil.ZERO ;
      AV34CosteK1 = DecimalUtil.ZERO ;
      AV35CosteK2 = DecimalUtil.ZERO ;
      AV123CosteM1 = DecimalUtil.ZERO ;
      AV124CosteM2 = DecimalUtil.ZERO ;
      AV95CostePz1 = DecimalUtil.ZERO ;
      AV96CostePz2 = DecimalUtil.ZERO ;
      P06V08_A396EmprCod = new String[] {""} ;
      P06V08_A4492HreBarCod = new int[1] ;
      P06V08_A4493HreBarReo = new byte[1] ;
      P06V08_A4494HreBarPar = new String[] {""} ;
      P06V08_A4495HreNumCie = new byte[1] ;
      P06V08_A4508HreLinMAL = new short[1] ;
      P06V08_A719PrdNum = new String[] {""} ;
      P06V08_n719PrdNum = new boolean[] {false} ;
      P06V08_A4509HreNumAny = new byte[1] ;
      P06V09_A396EmprCod = new String[] {""} ;
      P06V09_A4492HreBarCod = new int[1] ;
      P06V09_A4493HreBarReo = new byte[1] ;
      P06V09_A4494HreBarPar = new String[] {""} ;
      P06V09_A4495HreNumCie = new byte[1] ;
      P06V09_A4508HreLinMAL = new short[1] ;
      P06V09_A719PrdNum = new String[] {""} ;
      P06V09_n719PrdNum = new boolean[] {false} ;
      P06V09_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V09_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V09_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V09_n4511HrePrdCFin = new boolean[] {false} ;
      P06V09_A718PrdNom = new String[] {""} ;
      P06V09_A4509HreNumAny = new byte[1] ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV101CosteMaq = DecimalUtil.ZERO ;
      AV100MAQCOSMIN = DecimalUtil.ZERO ;
      AV127CosteM11 = DecimalUtil.ZERO ;
      AV128CosteM22 = DecimalUtil.ZERO ;
      P06V010_A4495HreNumCie = new byte[1] ;
      P06V010_A4494HreBarPar = new String[] {""} ;
      P06V010_A4493HreBarReo = new byte[1] ;
      P06V010_A4492HreBarCod = new int[1] ;
      P06V010_A396EmprCod = new String[] {""} ;
      P06V010_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V010_A4505HreAgrDsc = new String[] {""} ;
      P06V010_A4502HreAgrPie = new short[1] ;
      P06V010_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V010_A4504HreAgrSer = new String[] {""} ;
      P06V010_A4499HreAgrPar = new String[] {""} ;
      P06V010_A4498HreAgrReo = new byte[1] ;
      P06V010_A4497HreAgrCod = new int[1] ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      A4505HreAgrDsc = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      A4499HreAgrPar = "" ;
      P06V011_A4495HreNumCie = new byte[1] ;
      P06V011_A4494HreBarPar = new String[] {""} ;
      P06V011_A4493HreBarReo = new byte[1] ;
      P06V011_A4492HreBarCod = new int[1] ;
      P06V011_A396EmprCod = new String[] {""} ;
      P06V011_A9990HreAcPie = new int[1] ;
      P06V011_n9990HreAcPie = new boolean[] {false} ;
      P06V011_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V011_n9989HreAcMtr = new boolean[] {false} ;
      P06V011_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V011_n9988HreAcKgm = new boolean[] {false} ;
      P06V011_A9993HreAcDsc = new String[] {""} ;
      P06V011_n9993HreAcDsc = new boolean[] {false} ;
      P06V011_A9992HreAcSer = new String[] {""} ;
      P06V011_n9992HreAcSer = new boolean[] {false} ;
      P06V011_A9987HreAcPar = new String[] {""} ;
      P06V011_A9986HreAcReo = new byte[1] ;
      P06V011_A9985HreAcCod = new int[1] ;
      A9989HreAcMtr = DecimalUtil.ZERO ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9993HreAcDsc = "" ;
      A9992HreAcSer = "" ;
      A9987HreAcPar = "" ;
      P06V012_A719PrdNum = new String[] {""} ;
      P06V012_n719PrdNum = new boolean[] {false} ;
      P06V012_A396EmprCod = new String[] {""} ;
      P06V012_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V013_A771ProForTie = new short[1] ;
      P06V014_A602MaqCod = new String[] {""} ;
      P06V014_A396EmprCod = new String[] {""} ;
      P06V014_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V014_n605MaqCosMin = new boolean[] {false} ;
      A602MaqCod = "" ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      GXv_int8 = new short[1] ;
      P06V015_A396EmprCod = new String[] {""} ;
      P06V015_A4492HreBarCod = new int[1] ;
      P06V015_A4493HreBarReo = new byte[1] ;
      P06V015_A4494HreBarPar = new String[] {""} ;
      P06V015_A4495HreNumCie = new byte[1] ;
      P06V015_A4508HreLinMAL = new short[1] ;
      P06V015_A719PrdNum = new String[] {""} ;
      P06V015_n719PrdNum = new boolean[] {false} ;
      P06V015_A4514HreLanyNro = new byte[1] ;
      P06V015_n4514HreLanyNro = new boolean[] {false} ;
      P06V015_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06V015_n4511HrePrdCFin = new boolean[] {false} ;
      P06V015_A4509HreNumAny = new byte[1] ;
      AV70ContDsc = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rhrhr02__default(),
         new Object[] {
             new Object[] {
            P06V02_A130BarCodPar, P06V02_A132BarCodReo, P06V02_A129BarCod, P06V02_A396EmprCod, P06V02_A970ProceCod, P06V02_n970ProceCod, P06V02_A44AlbRecCod, P06V02_A971ProceNom, P06V02_n971ProceNom, P06V02_A200BarPieCod
            }
            , new Object[] {
            P06V03_A396EmprCod, P06V03_A407EmprNom, P06V03_n407EmprNom
            }
            , new Object[] {
            P06V04_A942TermCod, P06V04_A1189TermUsu, P06V04_n1189TermUsu
            }
            , new Object[] {
            P06V05_A4542HreTotKgm, P06V05_n4542HreTotKgm, P06V05_A4543HreTotMtr, P06V05_n4543HreTotMtr, P06V05_A4544HreTotPie, P06V05_n4544HreTotPie, P06V05_A4545HreLinMaq, P06V05_A4495HreNumCie, P06V05_A4494HreBarPar, P06V05_A4493HreBarReo,
            P06V05_A4492HreBarCod, P06V05_A396EmprCod, P06V05_A9804HreAcab, P06V05_n9804HreAcab, P06V05_A13451HreComp2, P06V05_n13451HreComp2, P06V05_A13450HreComp1, P06V05_n13450HreComp1, P06V05_A4524HreColNumC, P06V05_n4524HreColNumC,
            P06V05_A4523HreColNomC, P06V05_n4523HreColNomC, P06V05_A1094HreNPrg, P06V05_n1094HreNPrg, P06V05_A8623HreHilasa, P06V05_n8623HreHilasa, P06V05_A8625HreOpa, P06V05_n8625HreOpa, P06V05_A8624HreEnsayo, P06V05_n8624HreEnsayo,
            P06V05_A4960HreFecAlt, P06V05_n4960HreFecAlt, P06V05_A4863HreUsrCod, P06V05_n4863HreUsrCod, P06V05_A4546HreMaqCod, P06V05_n4546HreMaqCod, P06V05_A4547HreVolPrd, P06V05_n4547HreVolPrd, P06V05_A4540HreIntDsc, P06V05_n4540HreIntDsc,
            P06V05_A4526HreTipColN, P06V05_n4526HreTipColN, P06V05_A4525HreTipCol, P06V05_n4525HreTipCol, P06V05_A4522HreColNum, P06V05_n4522HreColNum, P06V05_A4521HreColNom, P06V05_n4521HreColNom, P06V05_A4518HreBarDsc, P06V05_n4518HreBarDsc,
            P06V05_A4517HreBarSer, P06V05_n4517HreBarSer, P06V05_A279CliNom, P06V05_A252CliCod, P06V05_n252CliCod
            }
            , new Object[] {
            P06V06_A396EmprCod, P06V06_A4492HreBarCod, P06V06_A4493HreBarReo, P06V06_A4494HreBarPar, P06V06_A4495HreNumCie, P06V06_A4545HreLinMaq, P06V06_A4550HreLinPro, P06V06_A4551HreProCod, P06V06_A4966HreVolPro, P06V06_A4552HreProDsc
            }
            , new Object[] {
            P06V07_A396EmprCod, P06V07_A4492HreBarCod, P06V07_A4493HreBarReo, P06V07_A4494HreBarPar, P06V07_A4495HreNumCie, P06V07_A4545HreLinMaq, P06V07_A4550HreLinPro, P06V07_A4558HrePrdNum, P06V07_n4558HrePrdNum, P06V07_A719PrdNum,
            P06V07_n719PrdNum, P06V07_A4967HrePrePrd, P06V07_n4967HrePrePrd, P06V07_A4566HreForNro, P06V07_n4566HreForNro, P06V07_A4563HrePrdCant, P06V07_n4563HrePrdCant, P06V07_A4565HreCanAny, P06V07_n4565HreCanAny, P06V07_A4561HrePrdUDs,
            P06V07_n4561HrePrdUDs, P06V07_A4562HreFacCon, P06V07_n4562HreFacCon, P06V07_A4560HrePrdUMe, P06V07_n4560HrePrdUMe, P06V07_A5726HreLote, P06V07_n5726HreLote, P06V07_A4559HrePrdDsc, P06V07_n4559HrePrdDsc, P06V07_A4557HreRecLin
            }
            , new Object[] {
            P06V08_A396EmprCod, P06V08_A4492HreBarCod, P06V08_A4493HreBarReo, P06V08_A4494HreBarPar, P06V08_A4495HreNumCie, P06V08_A4508HreLinMAL, P06V08_A719PrdNum, P06V08_A4509HreNumAny
            }
            , new Object[] {
            P06V09_A396EmprCod, P06V09_A4492HreBarCod, P06V09_A4493HreBarReo, P06V09_A4494HreBarPar, P06V09_A4495HreNumCie, P06V09_A4508HreLinMAL, P06V09_A719PrdNum, P06V09_A724PrdPreAct, P06V09_A707PrdFacCon, P06V09_A4511HrePrdCFin,
            P06V09_n4511HrePrdCFin, P06V09_A718PrdNom, P06V09_A4509HreNumAny
            }
            , new Object[] {
            P06V010_A4495HreNumCie, P06V010_A4494HreBarPar, P06V010_A4493HreBarReo, P06V010_A4492HreBarCod, P06V010_A396EmprCod, P06V010_A4501HreAgrMtr, P06V010_A4505HreAgrDsc, P06V010_A4502HreAgrPie, P06V010_A4500HreAgrKgm, P06V010_A4504HreAgrSer,
            P06V010_A4499HreAgrPar, P06V010_A4498HreAgrReo, P06V010_A4497HreAgrCod
            }
            , new Object[] {
            P06V011_A4495HreNumCie, P06V011_A4494HreBarPar, P06V011_A4493HreBarReo, P06V011_A4492HreBarCod, P06V011_A396EmprCod, P06V011_A9990HreAcPie, P06V011_n9990HreAcPie, P06V011_A9989HreAcMtr, P06V011_n9989HreAcMtr, P06V011_A9988HreAcKgm,
            P06V011_n9988HreAcKgm, P06V011_A9993HreAcDsc, P06V011_n9993HreAcDsc, P06V011_A9992HreAcSer, P06V011_n9992HreAcSer, P06V011_A9987HreAcPar, P06V011_A9986HreAcReo, P06V011_A9985HreAcCod
            }
            , new Object[] {
            P06V012_A719PrdNum, P06V012_A396EmprCod, P06V012_A707PrdFacCon
            }
            , new Object[] {
            P06V013_A771ProForTie
            }
            , new Object[] {
            P06V014_A602MaqCod, P06V014_A396EmprCod, P06V014_A605MaqCosMin, P06V014_n605MaqCosMin
            }
            , new Object[] {
            P06V015_A396EmprCod, P06V015_A4492HreBarCod, P06V015_A4493HreBarReo, P06V015_A4494HreBarPar, P06V015_A4495HreNumCie, P06V015_A4508HreLinMAL, P06V015_A719PrdNum, P06V015_A4514HreLanyNro, P06V015_n4514HreLanyNro, P06V015_A4511HrePrdCFin,
            P06V015_n4511HrePrdCFin, P06V015_A4509HreNumAny
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV135Pgmname = "RHRHR02" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV135Pgmname = "RHRHR02" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private byte AV87HRENUMCIE ;
   private byte AV94F_laundry ;
   private byte AV125costekgmt ;
   private byte AV129Divpor1000 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A132BarCodReo ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4525HreTipCol ;
   private byte A4550HreLinPro ;
   private byte A4566HreForNro ;
   private byte A4560HrePrdUMe ;
   private byte AV131HreForNro ;
   private byte AV84Pesaje ;
   private byte A4509HreNumAny ;
   private byte AV81FlagAgr ;
   private byte A4498HreAgrReo ;
   private byte A9986HreAcReo ;
   private byte A4514HreLanyNro ;
   private short gxcookieaux ;
   private short A970ProceCod ;
   private short AV126TotBanyos ;
   private short AV91LinMaq ;
   private short A4545HreLinMaq ;
   private short AV19RelBany ;
   private short AV98Tiempo_t ;
   private short A4557HreRecLin ;
   private short AV122hrelinmaq ;
   private short A4508HreLinMAL ;
   private short A4502HreAgrPie ;
   private short c771ProForTie ;
   private short GXt_int7 ;
   private short GXv_int8[] ;
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
   private int A4524HreColNumC ;
   private int A8624HreEnsayo ;
   private int A4547HreVolPrd ;
   private int A4522HreColNum ;
   private int A252CliCod ;
   private int A4966HreVolPro ;
   private int Gx_OldLine ;
   private int A4497HreAgrCod ;
   private int A9990HreAcPie ;
   private int A9985HreAcCod ;
   private java.math.BigDecimal AV110Intexco ;
   private java.math.BigDecimal AV112Costec ;
   private java.math.BigDecimal AV113CosteD ;
   private java.math.BigDecimal AV114CosteA ;
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
   private java.math.BigDecimal AV118CosteCA ;
   private java.math.BigDecimal AV119CosteAA ;
   private java.math.BigDecimal AV120CosteDA ;
   private java.math.BigDecimal AV34CosteK1 ;
   private java.math.BigDecimal AV35CosteK2 ;
   private java.math.BigDecimal AV123CosteM1 ;
   private java.math.BigDecimal AV124CosteM2 ;
   private java.math.BigDecimal AV95CostePz1 ;
   private java.math.BigDecimal AV96CostePz2 ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal AV101CosteMaq ;
   private java.math.BigDecimal AV100MAQCOSMIN ;
   private java.math.BigDecimal AV127CosteM11 ;
   private java.math.BigDecimal AV128CosteM22 ;
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
   private String AV135Pgmname ;
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
   private String AV130lit54 ;
   private String AV115Lit60 ;
   private String AV116Lit61 ;
   private String AV117Lit62 ;
   private String AV111Lit300 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A971ProceNom ;
   private String A200BarPieCod ;
   private String AV109ProceNom ;
   private String AV99HreMaqCod ;
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
   private String A4523HreColNomC ;
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
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String AV97HreProCod ;
   private String A4558HrePrdNum ;
   private String A719PrdNum ;
   private String A4561HrePrdUDs ;
   private String A5726HreLote ;
   private String A4559HrePrdDsc ;
   private String AV89PrdNum ;
   private String AV40CodPrd ;
   private String AV108Und ;
   private String AV39Unidades ;
   private String AV121Lote10 ;
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
   private boolean n4543HreTotMtr ;
   private boolean n4544HreTotPie ;
   private boolean n9804HreAcab ;
   private boolean n13451HreComp2 ;
   private boolean n13450HreComp1 ;
   private boolean n4524HreColNumC ;
   private boolean n4523HreColNomC ;
   private boolean n1094HreNPrg ;
   private boolean n8623HreHilasa ;
   private boolean n8625HreOpa ;
   private boolean n8624HreEnsayo ;
   private boolean n4960HreFecAlt ;
   private boolean n4863HreUsrCod ;
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
   private boolean n4558HrePrdNum ;
   private boolean n719PrdNum ;
   private boolean n4967HrePrePrd ;
   private boolean n4566HreForNro ;
   private boolean n4563HrePrdCant ;
   private boolean n4565HreCanAny ;
   private boolean n4561HrePrdUDs ;
   private boolean n4562HreFacCon ;
   private boolean n4560HrePrdUMe ;
   private boolean n5726HreLote ;
   private boolean n4559HrePrdDsc ;
   private boolean n4511HrePrdCFin ;
   private boolean n9990HreAcPie ;
   private boolean n9989HreAcMtr ;
   private boolean n9988HreAcKgm ;
   private boolean n9993HreAcDsc ;
   private boolean n9992HreAcSer ;
   private boolean n605MaqCosMin ;
   private boolean n4514HreLanyNro ;
   private IDataStoreProvider pr_default ;
   private String[] P06V02_A130BarCodPar ;
   private byte[] P06V02_A132BarCodReo ;
   private int[] P06V02_A129BarCod ;
   private String[] P06V02_A396EmprCod ;
   private short[] P06V02_A970ProceCod ;
   private boolean[] P06V02_n970ProceCod ;
   private int[] P06V02_A44AlbRecCod ;
   private String[] P06V02_A971ProceNom ;
   private boolean[] P06V02_n971ProceNom ;
   private String[] P06V02_A200BarPieCod ;
   private String[] P06V03_A396EmprCod ;
   private String[] P06V03_A407EmprNom ;
   private boolean[] P06V03_n407EmprNom ;
   private String[] P06V04_A942TermCod ;
   private String[] P06V04_A1189TermUsu ;
   private boolean[] P06V04_n1189TermUsu ;
   private java.math.BigDecimal[] P06V05_A4542HreTotKgm ;
   private boolean[] P06V05_n4542HreTotKgm ;
   private java.math.BigDecimal[] P06V05_A4543HreTotMtr ;
   private boolean[] P06V05_n4543HreTotMtr ;
   private int[] P06V05_A4544HreTotPie ;
   private boolean[] P06V05_n4544HreTotPie ;
   private short[] P06V05_A4545HreLinMaq ;
   private byte[] P06V05_A4495HreNumCie ;
   private String[] P06V05_A4494HreBarPar ;
   private byte[] P06V05_A4493HreBarReo ;
   private int[] P06V05_A4492HreBarCod ;
   private String[] P06V05_A396EmprCod ;
   private String[] P06V05_A9804HreAcab ;
   private boolean[] P06V05_n9804HreAcab ;
   private String[] P06V05_A13451HreComp2 ;
   private boolean[] P06V05_n13451HreComp2 ;
   private String[] P06V05_A13450HreComp1 ;
   private boolean[] P06V05_n13450HreComp1 ;
   private int[] P06V05_A4524HreColNumC ;
   private boolean[] P06V05_n4524HreColNumC ;
   private String[] P06V05_A4523HreColNomC ;
   private boolean[] P06V05_n4523HreColNomC ;
   private String[] P06V05_A1094HreNPrg ;
   private boolean[] P06V05_n1094HreNPrg ;
   private String[] P06V05_A8623HreHilasa ;
   private boolean[] P06V05_n8623HreHilasa ;
   private String[] P06V05_A8625HreOpa ;
   private boolean[] P06V05_n8625HreOpa ;
   private int[] P06V05_A8624HreEnsayo ;
   private boolean[] P06V05_n8624HreEnsayo ;
   private java.util.Date[] P06V05_A4960HreFecAlt ;
   private boolean[] P06V05_n4960HreFecAlt ;
   private String[] P06V05_A4863HreUsrCod ;
   private boolean[] P06V05_n4863HreUsrCod ;
   private String[] P06V05_A4546HreMaqCod ;
   private boolean[] P06V05_n4546HreMaqCod ;
   private int[] P06V05_A4547HreVolPrd ;
   private boolean[] P06V05_n4547HreVolPrd ;
   private String[] P06V05_A4540HreIntDsc ;
   private boolean[] P06V05_n4540HreIntDsc ;
   private String[] P06V05_A4526HreTipColN ;
   private boolean[] P06V05_n4526HreTipColN ;
   private byte[] P06V05_A4525HreTipCol ;
   private boolean[] P06V05_n4525HreTipCol ;
   private int[] P06V05_A4522HreColNum ;
   private boolean[] P06V05_n4522HreColNum ;
   private String[] P06V05_A4521HreColNom ;
   private boolean[] P06V05_n4521HreColNom ;
   private String[] P06V05_A4518HreBarDsc ;
   private boolean[] P06V05_n4518HreBarDsc ;
   private String[] P06V05_A4517HreBarSer ;
   private boolean[] P06V05_n4517HreBarSer ;
   private String[] P06V05_A279CliNom ;
   private int[] P06V05_A252CliCod ;
   private boolean[] P06V05_n252CliCod ;
   private String[] P06V06_A396EmprCod ;
   private int[] P06V06_A4492HreBarCod ;
   private byte[] P06V06_A4493HreBarReo ;
   private String[] P06V06_A4494HreBarPar ;
   private byte[] P06V06_A4495HreNumCie ;
   private short[] P06V06_A4545HreLinMaq ;
   private byte[] P06V06_A4550HreLinPro ;
   private String[] P06V06_A4551HreProCod ;
   private int[] P06V06_A4966HreVolPro ;
   private String[] P06V06_A4552HreProDsc ;
   private String[] P06V07_A396EmprCod ;
   private int[] P06V07_A4492HreBarCod ;
   private byte[] P06V07_A4493HreBarReo ;
   private String[] P06V07_A4494HreBarPar ;
   private byte[] P06V07_A4495HreNumCie ;
   private short[] P06V07_A4545HreLinMaq ;
   private byte[] P06V07_A4550HreLinPro ;
   private String[] P06V07_A4558HrePrdNum ;
   private boolean[] P06V07_n4558HrePrdNum ;
   private String[] P06V07_A719PrdNum ;
   private boolean[] P06V07_n719PrdNum ;
   private java.math.BigDecimal[] P06V07_A4967HrePrePrd ;
   private boolean[] P06V07_n4967HrePrePrd ;
   private byte[] P06V07_A4566HreForNro ;
   private boolean[] P06V07_n4566HreForNro ;
   private java.math.BigDecimal[] P06V07_A4563HrePrdCant ;
   private boolean[] P06V07_n4563HrePrdCant ;
   private java.math.BigDecimal[] P06V07_A4565HreCanAny ;
   private boolean[] P06V07_n4565HreCanAny ;
   private String[] P06V07_A4561HrePrdUDs ;
   private boolean[] P06V07_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P06V07_A4562HreFacCon ;
   private boolean[] P06V07_n4562HreFacCon ;
   private byte[] P06V07_A4560HrePrdUMe ;
   private boolean[] P06V07_n4560HrePrdUMe ;
   private String[] P06V07_A5726HreLote ;
   private boolean[] P06V07_n5726HreLote ;
   private String[] P06V07_A4559HrePrdDsc ;
   private boolean[] P06V07_n4559HrePrdDsc ;
   private short[] P06V07_A4557HreRecLin ;
   private String[] P06V08_A396EmprCod ;
   private int[] P06V08_A4492HreBarCod ;
   private byte[] P06V08_A4493HreBarReo ;
   private String[] P06V08_A4494HreBarPar ;
   private byte[] P06V08_A4495HreNumCie ;
   private short[] P06V08_A4508HreLinMAL ;
   private String[] P06V08_A719PrdNum ;
   private boolean[] P06V08_n719PrdNum ;
   private byte[] P06V08_A4509HreNumAny ;
   private String[] P06V09_A396EmprCod ;
   private int[] P06V09_A4492HreBarCod ;
   private byte[] P06V09_A4493HreBarReo ;
   private String[] P06V09_A4494HreBarPar ;
   private byte[] P06V09_A4495HreNumCie ;
   private short[] P06V09_A4508HreLinMAL ;
   private String[] P06V09_A719PrdNum ;
   private boolean[] P06V09_n719PrdNum ;
   private java.math.BigDecimal[] P06V09_A724PrdPreAct ;
   private java.math.BigDecimal[] P06V09_A707PrdFacCon ;
   private java.math.BigDecimal[] P06V09_A4511HrePrdCFin ;
   private boolean[] P06V09_n4511HrePrdCFin ;
   private String[] P06V09_A718PrdNom ;
   private byte[] P06V09_A4509HreNumAny ;
   private byte[] P06V010_A4495HreNumCie ;
   private String[] P06V010_A4494HreBarPar ;
   private byte[] P06V010_A4493HreBarReo ;
   private int[] P06V010_A4492HreBarCod ;
   private String[] P06V010_A396EmprCod ;
   private java.math.BigDecimal[] P06V010_A4501HreAgrMtr ;
   private String[] P06V010_A4505HreAgrDsc ;
   private short[] P06V010_A4502HreAgrPie ;
   private java.math.BigDecimal[] P06V010_A4500HreAgrKgm ;
   private String[] P06V010_A4504HreAgrSer ;
   private String[] P06V010_A4499HreAgrPar ;
   private byte[] P06V010_A4498HreAgrReo ;
   private int[] P06V010_A4497HreAgrCod ;
   private byte[] P06V011_A4495HreNumCie ;
   private String[] P06V011_A4494HreBarPar ;
   private byte[] P06V011_A4493HreBarReo ;
   private int[] P06V011_A4492HreBarCod ;
   private String[] P06V011_A396EmprCod ;
   private int[] P06V011_A9990HreAcPie ;
   private boolean[] P06V011_n9990HreAcPie ;
   private java.math.BigDecimal[] P06V011_A9989HreAcMtr ;
   private boolean[] P06V011_n9989HreAcMtr ;
   private java.math.BigDecimal[] P06V011_A9988HreAcKgm ;
   private boolean[] P06V011_n9988HreAcKgm ;
   private String[] P06V011_A9993HreAcDsc ;
   private boolean[] P06V011_n9993HreAcDsc ;
   private String[] P06V011_A9992HreAcSer ;
   private boolean[] P06V011_n9992HreAcSer ;
   private String[] P06V011_A9987HreAcPar ;
   private byte[] P06V011_A9986HreAcReo ;
   private int[] P06V011_A9985HreAcCod ;
   private String[] P06V012_A719PrdNum ;
   private boolean[] P06V012_n719PrdNum ;
   private String[] P06V012_A396EmprCod ;
   private java.math.BigDecimal[] P06V012_A707PrdFacCon ;
   private short[] P06V013_A771ProForTie ;
   private String[] P06V014_A602MaqCod ;
   private String[] P06V014_A396EmprCod ;
   private java.math.BigDecimal[] P06V014_A605MaqCosMin ;
   private boolean[] P06V014_n605MaqCosMin ;
   private String[] P06V015_A396EmprCod ;
   private int[] P06V015_A4492HreBarCod ;
   private byte[] P06V015_A4493HreBarReo ;
   private String[] P06V015_A4494HreBarPar ;
   private byte[] P06V015_A4495HreNumCie ;
   private short[] P06V015_A4508HreLinMAL ;
   private String[] P06V015_A719PrdNum ;
   private boolean[] P06V015_n719PrdNum ;
   private byte[] P06V015_A4514HreLanyNro ;
   private boolean[] P06V015_n4514HreLanyNro ;
   private java.math.BigDecimal[] P06V015_A4511HrePrdCFin ;
   private boolean[] P06V015_n4511HrePrdCFin ;
   private byte[] P06V015_A4509HreNumAny ;
}

final  class rhrhr02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06V02", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.ProceCod, T1.AlbRecCod, T3.ProceNom, T1.BarPieCod FROM ((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (? = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06V03", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06V04", "SELECT TermCod, TermUsu FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06V05", "SELECT T2.HreTotKgm, T2.HreTotMtr, T2.HreTotPie, T1.HreLinMaq, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T1.HreAcab, T2.HreComp2, T2.HreComp1, T2.HreColNumC, T2.HreColNomC, T1.HreNPrg, T2.HreHilasa, T2.HreOpa, T2.HreEnsayo, T1.HreFecAlt, T1.HreUsrCod, T1.HreMaqCod, T1.HreVolPrd, T2.HreIntDsc, T2.HreTipColN, T2.HreTipCol, T2.HreColNum, T2.HreColNom, T2.HreBarDsc, T2.HreBarSer, T3.CliNom, T2.CliCod FROM ((TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06V06", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreVolPro, HreProDsc FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06V07", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HrePrdNum, PrdNum, HrePrePrd, HreForNro, HrePrdCant, HreCanAny, HrePrdUDs, HreFacCon, HrePrdUMe, HreLote, HrePrdDsc, HreRecLin FROM TXPHISLRE WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ?) AND (Not (rtrim(HrePrdNum) IS NULL AND NOT(HrePrdNum IS NULL))) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06V08", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, PrdNum, HreNumAny FROM TXPHISREA WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ?) AND (Not (rtrim(PrdNum) IS NULL AND NOT(PrdNum IS NULL))) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06V09", "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMAL, T1.PrdNum, T2.PrdPreAct, T2.PrdFacCon, T1.HrePrdCFin, T2.PrdNom, T1.HreNumAny FROM (TXPHISREA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMAL = ?) AND (Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL))) ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMAL, T1.HreNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06V010", "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAgrMtr, HreAgrDsc, HreAgrPie, HreAgrKgm, HreAgrSer, HreAgrPar, HreAgrReo, HreAgrCod FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06V011", "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAcPie, HreAcMtr, HreAcKgm, HreAcDsc, HreAcSer, HreAcPar, HreAcReo, HreAcCod FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06V012", "SELECT PrdNum, EmprCod, PrdFacCon FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06V013", "SELECT SUM(ProForTie) FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06V014", "SELECT MaqCod, EmprCod, MaqCosMin FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06V015", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, PrdNum, HreLanyNro, HrePrdCFin, HreNumAny FROM TXPHISREA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ? and PrdNum = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 21);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 21);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(21, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(22);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(24, 26);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((byte[]) buf[42])[0] = rslt.getByte(25);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((int[]) buf[44])[0] = rslt.getInt(26);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(27, 13);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(28, 26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(29, 16);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(30, 30);
               ((int[]) buf[53])[0] = rslt.getInt(31);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
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
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(16);
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
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
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

