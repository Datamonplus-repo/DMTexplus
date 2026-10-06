package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rdevpig_impl extends GXWebReport
{
   public rdevpig_impl( com.genexus.internet.HttpContext context )
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
         Gx_out = "PRN" ;
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
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit0 = GXt_char1 ;
         GXt_char1 = AV18Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2301_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit1 = GXt_char1 ;
         GXt_char1 = AV19Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit2 = GXt_char1 ;
         GXt_char1 = AV20Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit3 = GXt_char1 ;
         GXt_char1 = AV21Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN358_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit4 = GXt_char1 ;
         GXt_char1 = AV22Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "Wgen2301_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit5 = GXt_char1 ;
         GXt_char1 = AV23Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN435_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit6 = GXt_char1 ;
         GXt_char1 = AV24Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1288_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit7 = GXt_char1 ;
         GXt_char1 = AV25Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2102_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit8 = GXt_char1 ;
         GXt_char1 = AV26Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2103_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit9 = GXt_char1 ;
         GXt_char1 = AV27Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit10 = GXt_char1 ;
         GXt_char1 = AV28Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit11 = GXt_char1 ;
         GXt_char1 = AV29Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN838_", ""), (byte)(99), GXv_char2) ;
         rdevpig_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit12 = GXt_char1 ;
         AV33Lit13 = " " ;
         GXt_int3 = AV34Refer ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZAREF", ""), GXv_int4) ;
         rdevpig_impl.this.GXt_int3 = GXv_int4[0] ;
         AV34Refer = GXt_int3 ;
         if ( AV34Refer == 1 )
         {
            AV33Lit13 = httpContext.getMessage( "Referencia", "") ;
         }
         GxHdr2 = true ;
         /* Using cursor P06RV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A326DevGenPie = P06RV2_A326DevGenPie[0] ;
            n326DevGenPie = P06RV2_n326DevGenPie[0] ;
            A328DevGenUni = P06RV2_A328DevGenUni[0] ;
            n328DevGenUni = P06RV2_n328DevGenUni[0] ;
            A56AlbRUni = P06RV2_A56AlbRUni[0] ;
            A407EmprNom = P06RV2_A407EmprNom[0] ;
            n407EmprNom = P06RV2_n407EmprNom[0] ;
            A409EmprTel = P06RV2_A409EmprTel[0] ;
            n409EmprTel = P06RV2_n409EmprTel[0] ;
            A408EmprPob = P06RV2_A408EmprPob[0] ;
            n408EmprPob = P06RV2_n408EmprPob[0] ;
            A405EmprFax = P06RV2_A405EmprFax[0] ;
            n405EmprFax = P06RV2_n405EmprFax[0] ;
            A404EmprDir = P06RV2_A404EmprDir[0] ;
            n404EmprDir = P06RV2_n404EmprDir[0] ;
            A403EmprCpo = P06RV2_A403EmprCpo[0] ;
            n403EmprCpo = P06RV2_n403EmprCpo[0] ;
            A46AlbREnt = P06RV2_A46AlbREnt[0] ;
            A45AlbRef = P06RV2_A45AlbRef[0] ;
            A279CliNom = P06RV2_A279CliNom[0] ;
            A252CliCod = P06RV2_A252CliCod[0] ;
            n252CliCod = P06RV2_n252CliCod[0] ;
            A325DevGenFec = P06RV2_A325DevGenFec[0] ;
            n325DevGenFec = P06RV2_n325DevGenFec[0] ;
            A44AlbRecCod = P06RV2_A44AlbRecCod[0] ;
            n44AlbRecCod = P06RV2_n44AlbRecCod[0] ;
            A407EmprNom = P06RV2_A407EmprNom[0] ;
            n407EmprNom = P06RV2_n407EmprNom[0] ;
            A409EmprTel = P06RV2_A409EmprTel[0] ;
            n409EmprTel = P06RV2_n409EmprTel[0] ;
            A408EmprPob = P06RV2_A408EmprPob[0] ;
            n408EmprPob = P06RV2_n408EmprPob[0] ;
            A405EmprFax = P06RV2_A405EmprFax[0] ;
            n405EmprFax = P06RV2_n405EmprFax[0] ;
            A404EmprDir = P06RV2_A404EmprDir[0] ;
            n404EmprDir = P06RV2_n404EmprDir[0] ;
            A403EmprCpo = P06RV2_A403EmprCpo[0] ;
            n403EmprCpo = P06RV2_n403EmprCpo[0] ;
            A56AlbRUni = P06RV2_A56AlbRUni[0] ;
            A46AlbREnt = P06RV2_A46AlbREnt[0] ;
            A45AlbRef = P06RV2_A45AlbRef[0] ;
            A279CliNom = P06RV2_A279CliNom[0] ;
            AV31FlagImp = (byte)(0) ;
            /* Using cursor P06RV3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A44AlbRecCod = P06RV3_A44AlbRecCod[0] ;
               n44AlbRecCod = P06RV3_n44AlbRecCod[0] ;
               A3067DevPieUni = P06RV3_A3067DevPieUni[0] ;
               A3731AlbRecIdPz = P06RV3_A3731AlbRecIdPz[0] ;
               A2159AlbRecPie = P06RV3_A2159AlbRecPie[0] ;
               A44AlbRecCod = P06RV3_A44AlbRecCod[0] ;
               n44AlbRecCod = P06RV3_n44AlbRecCod[0] ;
               A3731AlbRecIdPz = P06RV3_A3731AlbRecIdPz[0] ;
               if ( (0==AV34Refer) )
               {
                  h6RV0( false, 18) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3067DevPieUni, "ZZZZZ9.99")), 503, Gx_line+1, 570, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2159AlbRecPie, "")), 405, Gx_line+1, 480, Gx_line+18, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               else
               {
                  h6RV0( false, 17) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3067DevPieUni, "ZZZZZ9.99")), 503, Gx_line+0, 570, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3731AlbRecIdPz, "")), 623, Gx_line+0, 718, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2159AlbRecPie, "")), 405, Gx_line+0, 480, Gx_line+17, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               AV31FlagImp = (byte)(1) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( ! (0==AV31FlagImp) )
            {
               h6RV0( false, 10) ;
               getPrinter().GxDrawLine(405, Gx_line+5, 480, Gx_line+5, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(503, Gx_line+5, 569, Gx_line+5, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+10) ;
            }
            h6RV0( false, 67) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit7, "")), 7, Gx_line+33, 89, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A328DevGenUni, "ZZZZZ9.99")), 503, Gx_line+4, 570, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9")), 451, Gx_line+4, 481, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(4, Gx_line+56, 781, Gx_line+56, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+67) ;
            /* Using cursor P06RV4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1303DevObs = P06RV4_A1303DevObs[0] ;
               A1302DevLin = P06RV4_A1302DevLin[0] ;
               h6RV0( false, 17) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1303DevObs, "")), 131, Gx_line+0, 507, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6RV0( true, 0) ;
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

   public void h6RV0( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Lit0, "")), 583, Gx_line+69, 709, Gx_line+90, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 125, Gx_line+123, 130, Gx_line+140, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit1, "")), 15, Gx_line+123, 118, Gx_line+139, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 161, Gx_line+267, 220, Gx_line+285, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 125, Gx_line+144, 130, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit2, "")), 15, Gx_line+144, 118, Gx_line+160, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A325DevGenFec, "99/99/99"), 140, Gx_line+144, 193, Gx_line+162, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 125, Gx_line+167, 130, Gx_line+184, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit3, "")), 15, Gx_line+167, 118, Gx_line+183, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 140, Gx_line+167, 185, Gx_line+185, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 188, Gx_line+167, 377, Gx_line+185, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit4, "")), 7, Gx_line+233, 108, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit5, "")), 248, Gx_line+233, 362, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 7, Gx_line+267, 108, Gx_line+285, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9")), 140, Gx_line+123, 199, Gx_line+141, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 248, Gx_line+267, 357, Gx_line+285, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A403EmprCpo, "")), 5, Gx_line+67, 94, Gx_line+84, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A404EmprDir, "")), 5, Gx_line+26, 225, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A405EmprFax, "")), 179, Gx_line+48, 274, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A408EmprPob, "")), 64, Gx_line+68, 284, Gx_line+85, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A409EmprTel, "")), 39, Gx_line+48, 134, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 5, Gx_line+6, 194, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Telf.", ""), 5, Gx_line+48, 34, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fax.", ""), 143, Gx_line+48, 173, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit12, "")), 139, Gx_line+233, 221, Gx_line+250, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit9, "")), 454, Gx_line+215, 520, Gx_line+232, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit10, "")), 510, Gx_line+233, 568, Gx_line+250, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit11, "")), 405, Gx_line+233, 481, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(4, Gx_line+256, 781, Gx_line+256, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(405, Gx_line+210, 569, Gx_line+210, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 583, Gx_line+268, 597, Gx_line+285, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit13, "")), 623, Gx_line+234, 699, Gx_line+252, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+283) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV29Lit12 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV33Lit13 = "" ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P06RV2_A396EmprCod = new String[] {""} ;
      P06RV2_A323DevGenCod = new int[1] ;
      P06RV2_A326DevGenPie = new short[1] ;
      P06RV2_n326DevGenPie = new boolean[] {false} ;
      P06RV2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RV2_n328DevGenUni = new boolean[] {false} ;
      P06RV2_A56AlbRUni = new String[] {""} ;
      P06RV2_A407EmprNom = new String[] {""} ;
      P06RV2_n407EmprNom = new boolean[] {false} ;
      P06RV2_A409EmprTel = new String[] {""} ;
      P06RV2_n409EmprTel = new boolean[] {false} ;
      P06RV2_A408EmprPob = new String[] {""} ;
      P06RV2_n408EmprPob = new boolean[] {false} ;
      P06RV2_A405EmprFax = new String[] {""} ;
      P06RV2_n405EmprFax = new boolean[] {false} ;
      P06RV2_A404EmprDir = new String[] {""} ;
      P06RV2_n404EmprDir = new boolean[] {false} ;
      P06RV2_A403EmprCpo = new String[] {""} ;
      P06RV2_n403EmprCpo = new boolean[] {false} ;
      P06RV2_A46AlbREnt = new String[] {""} ;
      P06RV2_A45AlbRef = new String[] {""} ;
      P06RV2_A279CliNom = new String[] {""} ;
      P06RV2_A252CliCod = new int[1] ;
      P06RV2_n252CliCod = new boolean[] {false} ;
      P06RV2_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06RV2_n325DevGenFec = new boolean[] {false} ;
      P06RV2_A44AlbRecCod = new int[1] ;
      P06RV2_n44AlbRecCod = new boolean[] {false} ;
      A328DevGenUni = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A407EmprNom = "" ;
      A409EmprTel = "" ;
      A408EmprPob = "" ;
      A405EmprFax = "" ;
      A404EmprDir = "" ;
      A403EmprCpo = "" ;
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      A279CliNom = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      P06RV3_A44AlbRecCod = new int[1] ;
      P06RV3_n44AlbRecCod = new boolean[] {false} ;
      P06RV3_A396EmprCod = new String[] {""} ;
      P06RV3_A323DevGenCod = new int[1] ;
      P06RV3_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06RV3_A3731AlbRecIdPz = new String[] {""} ;
      P06RV3_A2159AlbRecPie = new String[] {""} ;
      A3067DevPieUni = DecimalUtil.ZERO ;
      A3731AlbRecIdPz = "" ;
      A2159AlbRecPie = "" ;
      P06RV4_A396EmprCod = new String[] {""} ;
      P06RV4_A323DevGenCod = new int[1] ;
      P06RV4_A1303DevObs = new String[] {""} ;
      P06RV4_A1302DevLin = new byte[1] ;
      A1303DevObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevpig__default(),
         new Object[] {
             new Object[] {
            P06RV2_A396EmprCod, P06RV2_A323DevGenCod, P06RV2_A326DevGenPie, P06RV2_n326DevGenPie, P06RV2_A328DevGenUni, P06RV2_n328DevGenUni, P06RV2_A56AlbRUni, P06RV2_A407EmprNom, P06RV2_n407EmprNom, P06RV2_A409EmprTel,
            P06RV2_n409EmprTel, P06RV2_A408EmprPob, P06RV2_n408EmprPob, P06RV2_A405EmprFax, P06RV2_n405EmprFax, P06RV2_A404EmprDir, P06RV2_n404EmprDir, P06RV2_A403EmprCpo, P06RV2_n403EmprCpo, P06RV2_A46AlbREnt,
            P06RV2_A45AlbRef, P06RV2_A279CliNom, P06RV2_A252CliCod, P06RV2_n252CliCod, P06RV2_A325DevGenFec, P06RV2_n325DevGenFec, P06RV2_A44AlbRecCod, P06RV2_n44AlbRecCod
            }
            , new Object[] {
            P06RV3_A44AlbRecCod, P06RV3_n44AlbRecCod, P06RV3_A396EmprCod, P06RV3_A323DevGenCod, P06RV3_A3067DevPieUni, P06RV3_A3731AlbRecIdPz, P06RV3_A2159AlbRecPie
            }
            , new Object[] {
            P06RV4_A396EmprCod, P06RV4_A323DevGenCod, P06RV4_A1303DevObs, P06RV4_A1302DevLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV34Refer ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte AV31FlagImp ;
   private byte A1302DevLin ;
   private short gxcookieaux ;
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
   private java.math.BigDecimal A3067DevPieUni ;
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
   private String AV29Lit12 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV33Lit13 ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String A407EmprNom ;
   private String A409EmprTel ;
   private String A408EmprPob ;
   private String A405EmprFax ;
   private String A404EmprDir ;
   private String A403EmprCpo ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A279CliNom ;
   private String A3731AlbRecIdPz ;
   private String A2159AlbRecPie ;
   private String A1303DevObs ;
   private java.util.Date A325DevGenFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr2 ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean n407EmprNom ;
   private boolean n409EmprTel ;
   private boolean n408EmprPob ;
   private boolean n405EmprFax ;
   private boolean n404EmprDir ;
   private boolean n403EmprCpo ;
   private boolean n252CliCod ;
   private boolean n325DevGenFec ;
   private boolean n44AlbRecCod ;
   private IDataStoreProvider pr_default ;
   private String[] P06RV2_A396EmprCod ;
   private int[] P06RV2_A323DevGenCod ;
   private short[] P06RV2_A326DevGenPie ;
   private boolean[] P06RV2_n326DevGenPie ;
   private java.math.BigDecimal[] P06RV2_A328DevGenUni ;
   private boolean[] P06RV2_n328DevGenUni ;
   private String[] P06RV2_A56AlbRUni ;
   private String[] P06RV2_A407EmprNom ;
   private boolean[] P06RV2_n407EmprNom ;
   private String[] P06RV2_A409EmprTel ;
   private boolean[] P06RV2_n409EmprTel ;
   private String[] P06RV2_A408EmprPob ;
   private boolean[] P06RV2_n408EmprPob ;
   private String[] P06RV2_A405EmprFax ;
   private boolean[] P06RV2_n405EmprFax ;
   private String[] P06RV2_A404EmprDir ;
   private boolean[] P06RV2_n404EmprDir ;
   private String[] P06RV2_A403EmprCpo ;
   private boolean[] P06RV2_n403EmprCpo ;
   private String[] P06RV2_A46AlbREnt ;
   private String[] P06RV2_A45AlbRef ;
   private String[] P06RV2_A279CliNom ;
   private int[] P06RV2_A252CliCod ;
   private boolean[] P06RV2_n252CliCod ;
   private java.util.Date[] P06RV2_A325DevGenFec ;
   private boolean[] P06RV2_n325DevGenFec ;
   private int[] P06RV2_A44AlbRecCod ;
   private boolean[] P06RV2_n44AlbRecCod ;
   private int[] P06RV3_A44AlbRecCod ;
   private boolean[] P06RV3_n44AlbRecCod ;
   private String[] P06RV3_A396EmprCod ;
   private int[] P06RV3_A323DevGenCod ;
   private java.math.BigDecimal[] P06RV3_A3067DevPieUni ;
   private String[] P06RV3_A3731AlbRecIdPz ;
   private String[] P06RV3_A2159AlbRecPie ;
   private String[] P06RV4_A396EmprCod ;
   private int[] P06RV4_A323DevGenCod ;
   private String[] P06RV4_A1303DevObs ;
   private byte[] P06RV4_A1302DevLin ;
}

final  class rdevpig__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06RV2", "SELECT T1.EmprCod, T1.DevGenCod, T1.DevGenPie, T1.DevGenUni, T3.AlbRUni, T2.EmprNom, T2.EmprTel, T2.EmprPob, T2.EmprFax, T2.EmprDir, T2.EmprCpo, T3.AlbREnt, T3.AlbRef, T4.CliNom, T1.CliCod, T1.DevGenFec, T1.AlbRecCod FROM (((TXPDEVGEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPALBREC T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.DevGenCod = ? ORDER BY T1.EmprCod, T1.DevGenCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06RV3", "SELECT T2.AlbRecCod, T1.EmprCod, T1.DevGenCod, T1.DevPieUni, T3.AlbRecIdPz, T1.AlbRecPie FROM ((TXPDevPie T1 INNER JOIN TXPDEVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.DevGenCod = T1.DevGenCod) LEFT JOIN TXPALBDET T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbRecCod = T2.AlbRecCod AND T3.AlbRecPie = T1.AlbRecPie) WHERE T1.EmprCod = ? and T1.DevGenCod = ? ORDER BY T1.EmprCod, T1.DevGenCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06RV4", "SELECT EmprCod, DevGenCod, DevObs, DevLin FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? ORDER BY EmprCod, DevGenCod, DevLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 35);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 15);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 35);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 7);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 8);
               ((String[]) buf[20])[0] = rslt.getString(13, 16);
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((int[]) buf[22])[0] = rslt.getInt(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getString(5, 15);
               ((String[]) buf[6])[0] = rslt.getString(6, 9);
               return;
            case 2 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

