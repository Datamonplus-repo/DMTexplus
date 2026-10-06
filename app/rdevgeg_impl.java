package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rdevgeg_impl extends GXWebReport
{
   public rdevgeg_impl( com.genexus.internet.HttpContext context )
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
            A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         GXt_char1 = AV17Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2322_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit0 = GXt_char1 ;
         GXt_char1 = AV18Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit1 = GXt_char1 ;
         GXt_char1 = AV19Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit2 = GXt_char1 ;
         GXt_char1 = AV20Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit3 = GXt_char1 ;
         GXt_char1 = AV21Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN358_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit4 = GXt_char1 ;
         GXt_char1 = AV22Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN838_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit5 = GXt_char1 ;
         GXt_char1 = AV23Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN435_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit6 = GXt_char1 ;
         GXt_char1 = AV24Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1288_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit7 = GXt_char1 ;
         GXt_char1 = AV25Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2102_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit8 = GXt_char1 ;
         GXt_char1 = AV26Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2103_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit9 = GXt_char1 ;
         GXt_char1 = AV27Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit10 = GXt_char1 ;
         GXt_char1 = AV28Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit11 = GXt_char1 ;
         GXt_char1 = AV34Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT514_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit12 = GXt_char1 ;
         GXt_char1 = AV36Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1411_", ""), (byte)(99), GXv_char2) ;
         rdevgeg_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit13 = GXt_char1 ;
         /* Using cursor P06KN2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A840TrnCod = P06KN2_A840TrnCod[0] ;
            n840TrnCod = P06KN2_n840TrnCod[0] ;
            A781PrvCod = P06KN2_A781PrvCod[0] ;
            n781PrvCod = P06KN2_n781PrvCod[0] ;
            A329DevTrnNom = P06KN2_A329DevTrnNom[0] ;
            n329DevTrnNom = P06KN2_n329DevTrnNom[0] ;
            A327DevGenTrn = P06KN2_A327DevGenTrn[0] ;
            n327DevGenTrn = P06KN2_n327DevGenTrn[0] ;
            A325DevGenFec = P06KN2_A325DevGenFec[0] ;
            n325DevGenFec = P06KN2_n325DevGenFec[0] ;
            A787PrvDsc = P06KN2_A787PrvDsc[0] ;
            n787PrvDsc = P06KN2_n787PrvDsc[0] ;
            A295CliPob = P06KN2_A295CliPob[0] ;
            A256CliCp = P06KN2_A256CliCp[0] ;
            A260CliDom = P06KN2_A260CliDom[0] ;
            A279CliNom = P06KN2_A279CliNom[0] ;
            A409EmprTel = P06KN2_A409EmprTel[0] ;
            n409EmprTel = P06KN2_n409EmprTel[0] ;
            A405EmprFax = P06KN2_A405EmprFax[0] ;
            n405EmprFax = P06KN2_n405EmprFax[0] ;
            A408EmprPob = P06KN2_A408EmprPob[0] ;
            n408EmprPob = P06KN2_n408EmprPob[0] ;
            A403EmprCpo = P06KN2_A403EmprCpo[0] ;
            n403EmprCpo = P06KN2_n403EmprCpo[0] ;
            A404EmprDir = P06KN2_A404EmprDir[0] ;
            n404EmprDir = P06KN2_n404EmprDir[0] ;
            A407EmprNom = P06KN2_A407EmprNom[0] ;
            n407EmprNom = P06KN2_n407EmprNom[0] ;
            A252CliCod = P06KN2_A252CliCod[0] ;
            n252CliCod = P06KN2_n252CliCod[0] ;
            A44AlbRecCod = P06KN2_A44AlbRecCod[0] ;
            n44AlbRecCod = P06KN2_n44AlbRecCod[0] ;
            A326DevGenPie = P06KN2_A326DevGenPie[0] ;
            n326DevGenPie = P06KN2_n326DevGenPie[0] ;
            A328DevGenUni = P06KN2_A328DevGenUni[0] ;
            n328DevGenUni = P06KN2_n328DevGenUni[0] ;
            A56AlbRUni = P06KN2_A56AlbRUni[0] ;
            A49AlbRFen = P06KN2_A49AlbRFen[0] ;
            A46AlbREnt = P06KN2_A46AlbREnt[0] ;
            A45AlbRef = P06KN2_A45AlbRef[0] ;
            A409EmprTel = P06KN2_A409EmprTel[0] ;
            n409EmprTel = P06KN2_n409EmprTel[0] ;
            A405EmprFax = P06KN2_A405EmprFax[0] ;
            n405EmprFax = P06KN2_n405EmprFax[0] ;
            A408EmprPob = P06KN2_A408EmprPob[0] ;
            n408EmprPob = P06KN2_n408EmprPob[0] ;
            A403EmprCpo = P06KN2_A403EmprCpo[0] ;
            n403EmprCpo = P06KN2_n403EmprCpo[0] ;
            A404EmprDir = P06KN2_A404EmprDir[0] ;
            n404EmprDir = P06KN2_n404EmprDir[0] ;
            A407EmprNom = P06KN2_A407EmprNom[0] ;
            n407EmprNom = P06KN2_n407EmprNom[0] ;
            A840TrnCod = P06KN2_A840TrnCod[0] ;
            n840TrnCod = P06KN2_n840TrnCod[0] ;
            A56AlbRUni = P06KN2_A56AlbRUni[0] ;
            A49AlbRFen = P06KN2_A49AlbRFen[0] ;
            A46AlbREnt = P06KN2_A46AlbREnt[0] ;
            A45AlbRef = P06KN2_A45AlbRef[0] ;
            A781PrvCod = P06KN2_A781PrvCod[0] ;
            n781PrvCod = P06KN2_n781PrvCod[0] ;
            A787PrvDsc = P06KN2_A787PrvDsc[0] ;
            n787PrvDsc = P06KN2_n787PrvDsc[0] ;
            A295CliPob = P06KN2_A295CliPob[0] ;
            A256CliCp = P06KN2_A256CliCp[0] ;
            A260CliDom = P06KN2_A260CliDom[0] ;
            A279CliNom = P06KN2_A279CliNom[0] ;
            A329DevTrnNom = P06KN2_A329DevTrnNom[0] ;
            n329DevTrnNom = P06KN2_n329DevTrnNom[0] ;
            h6KN0( false, 421) ;
            getPrinter().GxDrawRect(16, Gx_line+35, 436, Gx_line+152, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 149, Gx_line+288, 200, Gx_line+306, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 29, Gx_line+52, 311, Gx_line+71, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A404EmprDir, "")), 29, Gx_line+73, 358, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A403EmprCpo, "")), 29, Gx_line+119, 88, Gx_line+137, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A408EmprPob, "")), 92, Gx_line+119, 420, Gx_line+136, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A405EmprFax, "")), 271, Gx_line+95, 413, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A409EmprTel, "")), 72, Gx_line+95, 214, Gx_line+114, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tel.", ""), 29, Gx_line+95, 68, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fax.", ""), 228, Gx_line+95, 267, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 429, Gx_line+233, 680, Gx_line+251, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 429, Gx_line+255, 713, Gx_line+273, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A256CliCp, "")), 429, Gx_line+276, 480, Gx_line+294, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 489, Gx_line+276, 740, Gx_line+294, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 429, Gx_line+297, 680, Gx_line+315, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9")), 149, Gx_line+246, 217, Gx_line+264, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A325DevGenFec, "99/99/99"), 149, Gx_line+267, 217, Gx_line+285, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit1, "")), 45, Gx_line+246, 121, Gx_line+264, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit2, "")), 45, Gx_line+267, 88, Gx_line+285, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit3, "")), 45, Gx_line+288, 104, Gx_line+306, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 129, Gx_line+246, 137, Gx_line+263, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 129, Gx_line+267, 137, Gx_line+284, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 129, Gx_line+288, 137, Gx_line+305, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(536, Gx_line+101, 774, Gx_line+152, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Lit0, "")), 569, Gx_line+116, 742, Gx_line+140, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(29, Gx_line+231, 254, Gx_line+320, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(385, Gx_line+304, 385, Gx_line+320, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(758, Gx_line+304, 758, Gx_line+320, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(758, Gx_line+219, 758, Gx_line+235, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(385, Gx_line+219, 402, Gx_line+219, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(385, Gx_line+219, 385, Gx_line+235, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(743, Gx_line+219, 760, Gx_line+219, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(385, Gx_line+319, 402, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(745, Gx_line+321, 762, Gx_line+321, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A327DevGenTrn), "ZZZ9")), 190, Gx_line+375, 224, Gx_line+393, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit13, "")), 52, Gx_line+375, 170, Gx_line+393, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 174, Gx_line+375, 182, Gx_line+392, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(29, Gx_line+360, 759, Gx_line+405, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A329DevTrnNom, "")), 245, Gx_line+375, 496, Gx_line+393, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+421) ;
            h6KN0( false, 152) ;
            getPrinter().GxDrawLine(19, Gx_line+39, 770, Gx_line+39, 3, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(480, Gx_line+119, 770, Gx_line+119, 3, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 25, Gx_line+50, 159, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 332, Gx_line+50, 400, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit4, "")), 25, Gx_line+17, 93, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit5, "")), 178, Gx_line+17, 296, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit12, "")), 332, Gx_line+17, 458, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 495, Gx_line+50, 563, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit2, "")), 495, Gx_line+15, 538, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit9, "")), 489, Gx_line+97, 565, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit10, "")), 589, Gx_line+97, 657, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit11, "")), 698, Gx_line+97, 749, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 285, Gx_line+108, 294, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A328DevGenUni, "ZZZZZ9.99")), 194, Gx_line+108, 270, Gx_line+126, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9")), 328, Gx_line+108, 362, Gx_line+126, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(", 277, Gx_line+108, 285, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(")", 303, Gx_line+108, 311, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 178, Gx_line+50, 246, Gx_line+68, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(572, Gx_line+123, 767, Gx_line+152, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A328DevGenUni, "ZZZZZ9.99")), 580, Gx_line+130, 656, Gx_line+148, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9")), 715, Gx_line+130, 749, Gx_line+148, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 671, Gx_line+130, 680, Gx_line+148, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("(", 665, Gx_line+130, 673, Gx_line+147, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(")", 688, Gx_line+130, 696, Gx_line+147, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+152) ;
            h6KN0( false, 31) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 25, Gx_line+4, 134, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(19, Gx_line+26, 770, Gx_line+26, 3, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+31) ;
            /* Using cursor P06KN3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1303DevObs = P06KN3_A1303DevObs[0] ;
               A1302DevLin = P06KN3_A1302DevLin[0] ;
               h6KN0( false, 20) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1303DevObs, "")), 246, Gx_line+0, 747, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6KN0( true, 0) ;
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

   public void h6KN0( boolean bFoot ,
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
      AV17Lit0 = "" ;
      AV18Lit1 = "" ;
      AV19Lit2 = "" ;
      AV20Lit3 = "" ;
      AV21Lit4 = "" ;
      AV22Lit5 = "" ;
      AV23Lit6 = "" ;
      AV24Lit7 = "" ;
      AV25Lit8 = "" ;
      AV26Lit9 = "" ;
      AV27Lit10 = "" ;
      AV28Lit11 = "" ;
      AV34Lit12 = "" ;
      AV36Lit13 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06KN2_A840TrnCod = new short[1] ;
      P06KN2_n840TrnCod = new boolean[] {false} ;
      P06KN2_A781PrvCod = new short[1] ;
      P06KN2_n781PrvCod = new boolean[] {false} ;
      P06KN2_A396EmprCod = new String[] {""} ;
      P06KN2_A323DevGenCod = new int[1] ;
      P06KN2_A329DevTrnNom = new String[] {""} ;
      P06KN2_n329DevTrnNom = new boolean[] {false} ;
      P06KN2_A327DevGenTrn = new short[1] ;
      P06KN2_n327DevGenTrn = new boolean[] {false} ;
      P06KN2_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06KN2_n325DevGenFec = new boolean[] {false} ;
      P06KN2_A787PrvDsc = new String[] {""} ;
      P06KN2_n787PrvDsc = new boolean[] {false} ;
      P06KN2_A295CliPob = new String[] {""} ;
      P06KN2_A256CliCp = new String[] {""} ;
      P06KN2_A260CliDom = new String[] {""} ;
      P06KN2_A279CliNom = new String[] {""} ;
      P06KN2_A409EmprTel = new String[] {""} ;
      P06KN2_n409EmprTel = new boolean[] {false} ;
      P06KN2_A405EmprFax = new String[] {""} ;
      P06KN2_n405EmprFax = new boolean[] {false} ;
      P06KN2_A408EmprPob = new String[] {""} ;
      P06KN2_n408EmprPob = new boolean[] {false} ;
      P06KN2_A403EmprCpo = new String[] {""} ;
      P06KN2_n403EmprCpo = new boolean[] {false} ;
      P06KN2_A404EmprDir = new String[] {""} ;
      P06KN2_n404EmprDir = new boolean[] {false} ;
      P06KN2_A407EmprNom = new String[] {""} ;
      P06KN2_n407EmprNom = new boolean[] {false} ;
      P06KN2_A252CliCod = new int[1] ;
      P06KN2_n252CliCod = new boolean[] {false} ;
      P06KN2_A44AlbRecCod = new int[1] ;
      P06KN2_n44AlbRecCod = new boolean[] {false} ;
      P06KN2_A326DevGenPie = new short[1] ;
      P06KN2_n326DevGenPie = new boolean[] {false} ;
      P06KN2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06KN2_n328DevGenUni = new boolean[] {false} ;
      P06KN2_A56AlbRUni = new String[] {""} ;
      P06KN2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06KN2_A46AlbREnt = new String[] {""} ;
      P06KN2_A45AlbRef = new String[] {""} ;
      A329DevTrnNom = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      A787PrvDsc = "" ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A408EmprPob = "" ;
      A403EmprCpo = "" ;
      A404EmprDir = "" ;
      A407EmprNom = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      P06KN3_A396EmprCod = new String[] {""} ;
      P06KN3_A323DevGenCod = new int[1] ;
      P06KN3_A1303DevObs = new String[] {""} ;
      P06KN3_A1302DevLin = new byte[1] ;
      A1303DevObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevgeg__default(),
         new Object[] {
             new Object[] {
            P06KN2_A840TrnCod, P06KN2_n840TrnCod, P06KN2_A781PrvCod, P06KN2_n781PrvCod, P06KN2_A396EmprCod, P06KN2_A323DevGenCod, P06KN2_A329DevTrnNom, P06KN2_n329DevTrnNom, P06KN2_A327DevGenTrn, P06KN2_n327DevGenTrn,
            P06KN2_A325DevGenFec, P06KN2_n325DevGenFec, P06KN2_A787PrvDsc, P06KN2_n787PrvDsc, P06KN2_A295CliPob, P06KN2_A256CliCp, P06KN2_A260CliDom, P06KN2_A279CliNom, P06KN2_A409EmprTel, P06KN2_n409EmprTel,
            P06KN2_A405EmprFax, P06KN2_n405EmprFax, P06KN2_A408EmprPob, P06KN2_n408EmprPob, P06KN2_A403EmprCpo, P06KN2_n403EmprCpo, P06KN2_A404EmprDir, P06KN2_n404EmprDir, P06KN2_A407EmprNom, P06KN2_n407EmprNom,
            P06KN2_A252CliCod, P06KN2_n252CliCod, P06KN2_A44AlbRecCod, P06KN2_n44AlbRecCod, P06KN2_A326DevGenPie, P06KN2_n326DevGenPie, P06KN2_A328DevGenUni, P06KN2_n328DevGenUni, P06KN2_A56AlbRUni, P06KN2_A49AlbRFen,
            P06KN2_A46AlbREnt, P06KN2_A45AlbRef
            }
            , new Object[] {
            P06KN3_A396EmprCod, P06KN3_A323DevGenCod, P06KN3_A1303DevObs, P06KN3_A1302DevLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A1302DevLin ;
   private short gxcookieaux ;
   private short A840TrnCod ;
   private short A781PrvCod ;
   private short A327DevGenTrn ;
   private short A326DevGenPie ;
   private short Gx_err ;
   private int A323DevGenCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A328DevGenUni ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV17Lit0 ;
   private String AV18Lit1 ;
   private String AV19Lit2 ;
   private String AV20Lit3 ;
   private String AV21Lit4 ;
   private String AV22Lit5 ;
   private String AV23Lit6 ;
   private String AV24Lit7 ;
   private String AV25Lit8 ;
   private String AV26Lit9 ;
   private String AV27Lit10 ;
   private String AV28Lit11 ;
   private String AV34Lit12 ;
   private String AV36Lit13 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A329DevTrnNom ;
   private String A787PrvDsc ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A408EmprPob ;
   private String A403EmprCpo ;
   private String A404EmprDir ;
   private String A407EmprNom ;
   private String A56AlbRUni ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A1303DevObs ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date A49AlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean n781PrvCod ;
   private boolean n329DevTrnNom ;
   private boolean n327DevGenTrn ;
   private boolean n325DevGenFec ;
   private boolean n787PrvDsc ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n408EmprPob ;
   private boolean n403EmprCpo ;
   private boolean n404EmprDir ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean n44AlbRecCod ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private IDataStoreProvider pr_default ;
   private short[] P06KN2_A840TrnCod ;
   private boolean[] P06KN2_n840TrnCod ;
   private short[] P06KN2_A781PrvCod ;
   private boolean[] P06KN2_n781PrvCod ;
   private String[] P06KN2_A396EmprCod ;
   private int[] P06KN2_A323DevGenCod ;
   private String[] P06KN2_A329DevTrnNom ;
   private boolean[] P06KN2_n329DevTrnNom ;
   private short[] P06KN2_A327DevGenTrn ;
   private boolean[] P06KN2_n327DevGenTrn ;
   private java.util.Date[] P06KN2_A325DevGenFec ;
   private boolean[] P06KN2_n325DevGenFec ;
   private String[] P06KN2_A787PrvDsc ;
   private boolean[] P06KN2_n787PrvDsc ;
   private String[] P06KN2_A295CliPob ;
   private String[] P06KN2_A256CliCp ;
   private String[] P06KN2_A260CliDom ;
   private String[] P06KN2_A279CliNom ;
   private String[] P06KN2_A409EmprTel ;
   private boolean[] P06KN2_n409EmprTel ;
   private String[] P06KN2_A405EmprFax ;
   private boolean[] P06KN2_n405EmprFax ;
   private String[] P06KN2_A408EmprPob ;
   private boolean[] P06KN2_n408EmprPob ;
   private String[] P06KN2_A403EmprCpo ;
   private boolean[] P06KN2_n403EmprCpo ;
   private String[] P06KN2_A404EmprDir ;
   private boolean[] P06KN2_n404EmprDir ;
   private String[] P06KN2_A407EmprNom ;
   private boolean[] P06KN2_n407EmprNom ;
   private int[] P06KN2_A252CliCod ;
   private boolean[] P06KN2_n252CliCod ;
   private int[] P06KN2_A44AlbRecCod ;
   private boolean[] P06KN2_n44AlbRecCod ;
   private short[] P06KN2_A326DevGenPie ;
   private boolean[] P06KN2_n326DevGenPie ;
   private java.math.BigDecimal[] P06KN2_A328DevGenUni ;
   private boolean[] P06KN2_n328DevGenUni ;
   private String[] P06KN2_A56AlbRUni ;
   private java.util.Date[] P06KN2_A49AlbRFen ;
   private String[] P06KN2_A46AlbREnt ;
   private String[] P06KN2_A45AlbRef ;
   private String[] P06KN3_A396EmprCod ;
   private int[] P06KN3_A323DevGenCod ;
   private String[] P06KN3_A1303DevObs ;
   private byte[] P06KN3_A1302DevLin ;
}

final  class rdevgeg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06KN2", "SELECT T3.TrnCod, T4.PrvCod, T1.EmprCod, T1.DevGenCod, T7.TrnNom AS DevTrnNom, T1.DevGenTrn AS DevGenTrn, T1.DevGenFec, T5.PrvDsc, T6.CliPob, T6.CliCp, T6.CliDom, T6.CliNom, T2.EmprTel, T2.EmprFax, T2.EmprPob, T2.EmprCpo, T2.EmprDir, T2.EmprNom, T1.CliCod, T1.AlbRecCod, T1.DevGenPie, T1.DevGenUni, T3.AlbRUni, T3.AlbRFen, T3.AlbREnt, T3.AlbRef FROM ((((((TXPDEVGEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPALBREC T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T3.TrnCod) LEFT JOIN TXPPROVIN T5 ON T5.PrvCod = T4.PrvCod) LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T7 ON T7.EmprCod = T1.EmprCod AND T7.TrnCod = T1.DevGenTrn) WHERE T1.EmprCod = ? and T1.DevGenCod = ? ORDER BY T1.EmprCod, T1.DevGenCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06KN3", "SELECT EmprCod, DevGenCod, DevObs, DevLin FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? ORDER BY EmprCod, DevGenCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((String[]) buf[15])[0] = rslt.getString(10, 6);
               ((String[]) buf[16])[0] = rslt.getString(11, 34);
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((String[]) buf[18])[0] = rslt.getString(13, 15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 35);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 7);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 35);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(21);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(23, 1);
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDate(24);
               ((String[]) buf[40])[0] = rslt.getString(25, 8);
               ((String[]) buf[41])[0] = rslt.getString(26, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

