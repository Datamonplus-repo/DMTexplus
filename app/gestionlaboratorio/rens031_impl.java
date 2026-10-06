package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rens031_impl extends GXWebReport
{
   public rens031_impl( com.genexus.internet.HttpContext context )
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
            AV26Pfechae = localUtil.parseDateParm( httpContext.GetPar( "Pfechae")) ;
            AV27Ufechae = localUtil.parseDateParm( httpContext.GetPar( "Ufechae")) ;
            AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
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
         GXt_char1 = AV16Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV16Lit1 = GXt_char1 ;
         GXt_char1 = AV17Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV17Lit2 = GXt_char1 ;
         AV14Lit3 = GXutil.trim( AV16Lit1) + " - " + GXutil.trim( AV17Lit2) ;
         GXt_char1 = AV13Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "RENS031", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit4 = GXt_char1 ;
         GXt_char1 = AV15Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV15Lit5 = GXt_char1 ;
         GXt_char1 = AV18Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV18Lit6 = GXt_char1 ;
         GXt_char1 = AV19Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL120_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit7 = GXt_char1 ;
         if ( GXutil.strcmp(AV19Lit7, httpContext.getMessage( "WCFL120_", "")) == 0 )
         {
            GXt_char1 = AV19Lit7 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char2) ;
            rens031_impl.this.GXt_char1 = GXv_char2[0] ;
            AV19Lit7 = GXt_char1 ;
         }
         GXt_char1 = AV20Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT40_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit8 = GXt_char1 ;
         GXt_char1 = AV21Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit9 = GXt_char1 ;
         GXt_char1 = AV22Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit10 = GXt_char1 ;
         GXt_char1 = AV23Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT558_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit11 = GXt_char1 ;
         GXt_char1 = AV24Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1607_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit12 = GXt_char1 ;
         GXt_char1 = AV25Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT603_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit13 = GXt_char1 ;
         GXt_char1 = AV32Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1356_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit14 = GXt_char1 ;
         GXt_char1 = AV33Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT24_", ""), (byte)(99), GXv_char2) ;
         rens031_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit15 = GXt_char1 ;
         /* Using cursor P06ZB2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06ZB2_A407EmprNom[0] ;
            n407EmprNom = P06ZB2_n407EmprNom[0] ;
            AV10EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_int3 = AV31Carvema ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int4) ;
         rens031_impl.this.GXt_int3 = GXv_int4[0] ;
         AV31Carvema = GXt_int3 ;
         GXt_int3 = AV34Tinamar ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int4) ;
         rens031_impl.this.GXt_int3 = GXv_int4[0] ;
         AV34Tinamar = GXt_int3 ;
         /* Using cursor P06ZB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV26Pfechae, Integer.valueOf(AV8CliCod), Integer.valueOf(AV8CliCod), AV27Ufechae});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5569Lb_EstEns = P06ZB3_A5569Lb_EstEns[0] ;
            A5532Lb_numero = P06ZB3_A5532Lb_numero[0] ;
            A5541Lb_FechaE = P06ZB3_A5541Lb_FechaE[0] ;
            A252CliCod = P06ZB3_A252CliCod[0] ;
            A5538Lb_ColNomC = P06ZB3_A5538Lb_ColNomC[0] ;
            A5536Lb_ColNom = P06ZB3_A5536Lb_ColNom[0] ;
            A5534Lb_ArtDsc = P06ZB3_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = P06ZB3_A5533Lb_ArtCod[0] ;
            A279CliNom = P06ZB3_A279CliNom[0] ;
            A5570Lb_Tipo = P06ZB3_A5570Lb_Tipo[0] ;
            A5594Lb_cartazf = P06ZB3_A5594Lb_cartazf[0] ;
            A5537Lb_ColNum = P06ZB3_A5537Lb_ColNum[0] ;
            A5540Lb_Cartaz = P06ZB3_A5540Lb_Cartaz[0] ;
            A279CliNom = P06ZB3_A279CliNom[0] ;
            AV28F_envio = (byte)(1) ;
            AV30Ens002 = (byte)(0) ;
            /* Using cursor P06ZB4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A6461Lb_FecNoa1 = P06ZB4_A6461Lb_FecNoa1[0] ;
               A5567Lb_FechaEn = P06ZB4_A5567Lb_FechaEn[0] ;
               A5555Lb_opcion = P06ZB4_A5555Lb_opcion[0] ;
               AV30Ens002 = (byte)(1) ;
               if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
               {
                  AV28F_envio = (byte)(1) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               else
               {
                  AV28F_envio = (byte)(0) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( ( AV30Ens002 == 0 ) && ( AV28F_envio == 1 ) )
            {
               AV28F_envio = (byte)(0) ;
            }
            if ( AV28F_envio == 0 )
            {
               AV29Lb_ColNomC = A5538Lb_ColNomC ;
               if ( (GXutil.strcmp("", AV29Lb_ColNomC)==0) )
               {
                  AV29Lb_ColNomC = A5536Lb_ColNom ;
               }
               if ( AV31Carvema == 1 )
               {
                  AV29Lb_ColNomC = A5536Lb_ColNom ;
               }
               if ( AV34Tinamar == 0 )
               {
                  h6ZB0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 293, Gx_line+0, 440, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lb_ColNomC, "")), 752, Gx_line+0, 848, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 866, Gx_line+0, 911, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A5594Lb_cartazf, "99/99/99"), 995, Gx_line+0, 1054, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 1057, Gx_line+0, 1116, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5570Lb_Tipo, "")), 1124, Gx_line+0, 1132, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 20, Gx_line+0, 65, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 68, Gx_line+0, 288, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 921, Gx_line+1, 980, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 441, Gx_line+1, 559, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), 559, Gx_line+0, 750, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               else
               {
                  h6ZB0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 293, Gx_line+0, 440, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lb_ColNomC, "")), 567, Gx_line+0, 663, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 680, Gx_line+0, 725, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A5594Lb_cartazf, "99/99/99"), 809, Gx_line+0, 868, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 872, Gx_line+0, 931, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5570Lb_Tipo, "")), 936, Gx_line+0, 944, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 20, Gx_line+0, 65, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 68, Gx_line+0, 288, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 736, Gx_line+1, 795, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 441, Gx_line+1, 559, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6ZB0( true, 0) ;
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

   public void h6ZB0( boolean bFoot ,
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
            if ( AV34Tinamar == 0 )
            {
               getPrinter().GxDrawLine(20, Gx_line+107, 285, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(293, Gx_line+107, 439, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Acatex", ""), 852, Gx_line+92, 910, Gx_line+108, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(752, Gx_line+107, 847, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(852, Gx_line+107, 912, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(921, Gx_line+107, 980, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(995, Gx_line+107, 1053, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1057, Gx_line+107, 1115, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "T", ""), 1122, Gx_line+94, 1130, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1122, Gx_line+107, 1131, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(16, Gx_line+65, 1126, Gx_line+65, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 20, Gx_line+7, 334, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 823, Gx_line+8, 882, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 901, Gx_line+8, 960, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("-", 891, Gx_line+8, 897, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 918, Gx_line+43, 963, Gx_line+60, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit4, "")), 20, Gx_line+38, 354, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit3, "")), 725, Gx_line+8, 819, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit5, "")), 834, Gx_line+43, 898, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit6, "")), 20, Gx_line+92, 84, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit7, "")), 293, Gx_line+92, 394, Gx_line+108, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit8, "")), 752, Gx_line+92, 847, Gx_line+106, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit9, "")), 921, Gx_line+92, 980, Gx_line+106, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit10, "")), 995, Gx_line+75, 1053, Gx_line+89, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit10, "")), 1057, Gx_line+75, 1115, Gx_line+89, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit7, "")), 995, Gx_line+92, 1053, Gx_line+106, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit11, "")), 1057, Gx_line+92, 1115, Gx_line+106, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit14, "")), 441, Gx_line+90, 505, Gx_line+107, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(441, Gx_line+107, 558, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit15, "")), 559, Gx_line+90, 623, Gx_line+107, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(559, Gx_line+107, 749, Gx_line+107, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Pgmname, "")), 408, Gx_line+38, 628, Gx_line+55, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+113) ;
            }
            else
            {
               getPrinter().GxDrawLine(24, Gx_line+108, 289, Gx_line+108, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(293, Gx_line+108, 439, Gx_line+108, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Acatex", ""), 667, Gx_line+93, 725, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(567, Gx_line+108, 662, Gx_line+108, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(667, Gx_line+108, 727, Gx_line+108, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(735, Gx_line+108, 794, Gx_line+108, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(809, Gx_line+108, 867, Gx_line+108, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(872, Gx_line+108, 930, Gx_line+108, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "T", ""), 936, Gx_line+93, 944, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(936, Gx_line+108, 945, Gx_line+108, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(20, Gx_line+66, 968, Gx_line+66, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprNom, "")), 20, Gx_line+8, 334, Gx_line+28, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 827, Gx_line+9, 886, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 905, Gx_line+9, 964, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("-", 895, Gx_line+9, 901, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 922, Gx_line+44, 967, Gx_line+61, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit4, "")), 20, Gx_line+39, 354, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14Lit3, "")), 729, Gx_line+9, 823, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Lit5, "")), 839, Gx_line+44, 903, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Lit6, "")), 20, Gx_line+93, 84, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit7, "")), 293, Gx_line+93, 394, Gx_line+109, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit8, "")), 567, Gx_line+93, 662, Gx_line+107, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit9, "")), 735, Gx_line+93, 794, Gx_line+107, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit10, "")), 809, Gx_line+77, 867, Gx_line+91, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit10, "")), 872, Gx_line+77, 930, Gx_line+91, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Lit7, "")), 809, Gx_line+93, 867, Gx_line+107, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit11, "")), 872, Gx_line+93, 930, Gx_line+107, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Pgmname, "")), 729, Gx_line+45, 886, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit14, "")), 441, Gx_line+93, 505, Gx_line+110, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(441, Gx_line+108, 558, Gx_line+108, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+113) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV26Pfechae = GXutil.nullDate() ;
      AV27Ufechae = GXutil.nullDate() ;
      AV16Lit1 = "" ;
      AV17Lit2 = "" ;
      AV14Lit3 = "" ;
      AV13Lit4 = "" ;
      AV15Lit5 = "" ;
      AV18Lit6 = "" ;
      AV19Lit7 = "" ;
      AV20Lit8 = "" ;
      AV21Lit9 = "" ;
      AV22Lit10 = "" ;
      AV23Lit11 = "" ;
      AV24Lit12 = "" ;
      AV25Lit13 = "" ;
      AV32Lit14 = "" ;
      AV33Lit15 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P06ZB2_A396EmprCod = new String[] {""} ;
      P06ZB2_A407EmprNom = new String[] {""} ;
      P06ZB2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV10EmprNom = "" ;
      GXv_int4 = new byte[1] ;
      P06ZB3_A396EmprCod = new String[] {""} ;
      P06ZB3_A5569Lb_EstEns = new byte[1] ;
      P06ZB3_A5532Lb_numero = new int[1] ;
      P06ZB3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P06ZB3_A252CliCod = new int[1] ;
      P06ZB3_A5538Lb_ColNomC = new String[] {""} ;
      P06ZB3_A5536Lb_ColNom = new String[] {""} ;
      P06ZB3_A5534Lb_ArtDsc = new String[] {""} ;
      P06ZB3_A5533Lb_ArtCod = new String[] {""} ;
      P06ZB3_A279CliNom = new String[] {""} ;
      P06ZB3_A5570Lb_Tipo = new String[] {""} ;
      P06ZB3_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P06ZB3_A5537Lb_ColNum = new int[1] ;
      P06ZB3_A5540Lb_Cartaz = new String[] {""} ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5534Lb_ArtDsc = "" ;
      A5533Lb_ArtCod = "" ;
      A279CliNom = "" ;
      A5570Lb_Tipo = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5540Lb_Cartaz = "" ;
      P06ZB4_A396EmprCod = new String[] {""} ;
      P06ZB4_A5532Lb_numero = new int[1] ;
      P06ZB4_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P06ZB4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P06ZB4_A5555Lb_opcion = new String[] {""} ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      AV29Lb_ColNomC = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV41Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.rens031__default(),
         new Object[] {
             new Object[] {
            P06ZB2_A396EmprCod, P06ZB2_A407EmprNom, P06ZB2_n407EmprNom
            }
            , new Object[] {
            P06ZB3_A396EmprCod, P06ZB3_A5569Lb_EstEns, P06ZB3_A5532Lb_numero, P06ZB3_A5541Lb_FechaE, P06ZB3_A252CliCod, P06ZB3_A5538Lb_ColNomC, P06ZB3_A5536Lb_ColNom, P06ZB3_A5534Lb_ArtDsc, P06ZB3_A5533Lb_ArtCod, P06ZB3_A279CliNom,
            P06ZB3_A5570Lb_Tipo, P06ZB3_A5594Lb_cartazf, P06ZB3_A5537Lb_ColNum, P06ZB3_A5540Lb_Cartaz
            }
            , new Object[] {
            P06ZB4_A396EmprCod, P06ZB4_A5532Lb_numero, P06ZB4_A6461Lb_FecNoa1, P06ZB4_A5567Lb_FechaEn, P06ZB4_A5555Lb_opcion
            }
         }
      );
      AV41Pgmname = "GestionLaboratorio.RENS031" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV41Pgmname = "GestionLaboratorio.RENS031" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV31Carvema ;
   private byte AV34Tinamar ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A5569Lb_EstEns ;
   private byte AV28F_envio ;
   private byte AV30Ens002 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int Gx_OldLine ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV16Lit1 ;
   private String AV17Lit2 ;
   private String AV14Lit3 ;
   private String AV13Lit4 ;
   private String AV15Lit5 ;
   private String AV18Lit6 ;
   private String AV19Lit7 ;
   private String AV20Lit8 ;
   private String AV21Lit9 ;
   private String AV22Lit10 ;
   private String AV23Lit11 ;
   private String AV24Lit12 ;
   private String AV25Lit13 ;
   private String AV32Lit14 ;
   private String AV33Lit15 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV10EmprNom ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A5534Lb_ArtDsc ;
   private String A5533Lb_ArtCod ;
   private String A279CliNom ;
   private String A5570Lb_Tipo ;
   private String A5540Lb_Cartaz ;
   private String A5555Lb_opcion ;
   private String AV29Lb_ColNomC ;
   private String Gx_time ;
   private String AV41Pgmname ;
   private java.util.Date AV26Pfechae ;
   private java.util.Date AV27Ufechae ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private IDataStoreProvider pr_default ;
   private String[] P06ZB2_A396EmprCod ;
   private String[] P06ZB2_A407EmprNom ;
   private boolean[] P06ZB2_n407EmprNom ;
   private String[] P06ZB3_A396EmprCod ;
   private byte[] P06ZB3_A5569Lb_EstEns ;
   private int[] P06ZB3_A5532Lb_numero ;
   private java.util.Date[] P06ZB3_A5541Lb_FechaE ;
   private int[] P06ZB3_A252CliCod ;
   private String[] P06ZB3_A5538Lb_ColNomC ;
   private String[] P06ZB3_A5536Lb_ColNom ;
   private String[] P06ZB3_A5534Lb_ArtDsc ;
   private String[] P06ZB3_A5533Lb_ArtCod ;
   private String[] P06ZB3_A279CliNom ;
   private String[] P06ZB3_A5570Lb_Tipo ;
   private java.util.Date[] P06ZB3_A5594Lb_cartazf ;
   private int[] P06ZB3_A5537Lb_ColNum ;
   private String[] P06ZB3_A5540Lb_Cartaz ;
   private String[] P06ZB4_A396EmprCod ;
   private int[] P06ZB4_A5532Lb_numero ;
   private java.util.Date[] P06ZB4_A6461Lb_FecNoa1 ;
   private java.util.Date[] P06ZB4_A5567Lb_FechaEn ;
   private String[] P06ZB4_A5555Lb_opcion ;
}

final  class rens031__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06ZB2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06ZB3", "SELECT T1.EmprCod, T1.Lb_EstEns, T1.Lb_numero, T1.Lb_FechaE, T1.CliCod, T1.Lb_ColNomC, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.Lb_Tipo, T1.Lb_cartazf, T1.Lb_ColNum, T1.Lb_Cartaz FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.Lb_FechaE >= ?) AND (T1.CliCod = ? or (? = 0)) AND (T1.Lb_EstEns = 0) AND (T1.Lb_FechaE <= ?) ORDER BY T1.EmprCod, T1.Lb_FechaE, T1.CliCod, T1.Lb_Cartaz ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06ZB4", "SELECT EmprCod, Lb_numero, Lb_FecNoa1, Lb_FechaEn, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

