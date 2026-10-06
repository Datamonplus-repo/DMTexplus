package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rens023_impl extends GXWebReport
{
   public rens023_impl( com.genexus.internet.HttpContext context )
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
            AV29CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            AV8Lb_cartaz = httpContext.GetPar( "Lb_cartaz") ;
            AV9Lb_fechaen = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaen")) ;
            AV13Lb_rb = CommonUtil.decimalVal( httpContext.GetPar( "Lb_rb"), ".") ;
            AV27Json_EnvioEnsayo = httpContext.GetPar( "Json_EnvioEnsayo") ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         GXv_char1[0] = AV11Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS016", ""), GXv_char1) ;
         rens023_impl.this.AV11Contdsc = GXv_char1[0] ;
         GXt_char2 = AV14Station ;
         GXv_char1[0] = GXt_char2 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
         rens023_impl.this.GXt_char2 = GXv_char1[0] ;
         AV14Station = GXt_char2 ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = AV15EmprNOm ;
         GXv_char4[0] = AV16UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char1, GXv_char3, GXv_char4) ;
         rens023_impl.this.A396EmprCod = GXv_char1[0] ;
         rens023_impl.this.AV15EmprNOm = GXv_char3[0] ;
         rens023_impl.this.AV16UsurCod = GXv_char4[0] ;
         AV20i = (short)(1) ;
         AV25Col_EnvioEnsayo.fromJSonString(AV27Json_EnvioEnsayo, null);
         AV32GXV1 = 1 ;
         while ( AV32GXV1 <= AV25Col_EnvioEnsayo.size() )
         {
            AV26Item_EnvioEnsayo = (app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)((app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)AV25Col_EnvioEnsayo.elementAt(-1+AV32GXV1));
            AV18Tab_ensayo[AV20i-1] = AV26Item_EnvioEnsayo.getgxTv_SdtEnviodeEnsayo_SDT_Lb_numero() ;
            AV23Tab_carta[AV20i-1] = AV26Item_EnvioEnsayo.getgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz() ;
            AV21Tab_opcion[AV20i-1] = AV26Item_EnvioEnsayo.getgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion() ;
            AV20i = (short)(AV20i+1) ;
            AV32GXV1 = (int)(AV32GXV1+1) ;
         }
         AV20i = (short)(1) ;
         while ( ! (0==AV18Tab_ensayo[AV20i-1]) )
         {
            AV19Lb_numero = AV18Tab_ensayo[AV20i-1] ;
            AV22Lb_opcion = AV21Tab_opcion[AV20i-1] ;
            AV8Lb_cartaz = AV23Tab_carta[AV20i-1] ;
            GxHdr2 = true ;
            /* Using cursor P06XF2 */
            pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV19Lb_numero), AV8Lb_cartaz});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A5538Lb_ColNomC = P06XF2_A5538Lb_ColNomC[0] ;
               A5532Lb_numero = P06XF2_A5532Lb_numero[0] ;
               A5540Lb_Cartaz = P06XF2_A5540Lb_Cartaz[0] ;
               A5533Lb_ArtCod = P06XF2_A5533Lb_ArtCod[0] ;
               A279CliNom = P06XF2_A279CliNom[0] ;
               A5534Lb_ArtDsc = P06XF2_A5534Lb_ArtDsc[0] ;
               A5552Lb_TipArtD = P06XF2_A5552Lb_TipArtD[0] ;
               A6546Lb_Pantone = P06XF2_A6546Lb_Pantone[0] ;
               A252CliCod = P06XF2_A252CliCod[0] ;
               A279CliNom = P06XF2_A279CliNom[0] ;
               AV28CliNom = A279CliNom ;
               AV10Lb_artcod = GXutil.trim( GXutil.substring( A5534Lb_ArtDsc, 1, 10)) ;
               AV12Tipartdsc = GXutil.trim( GXutil.substring( A5552Lb_TipArtD, 1, 15)) ;
               AV24lb_pantone = A6546Lb_Pantone ;
               /* Using cursor P06XF3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV22Lb_opcion});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A5555Lb_opcion = P06XF3_A5555Lb_opcion[0] ;
                  GXv_char4[0] = A396EmprCod ;
                  GXv_int5[0] = A5532Lb_numero ;
                  GXv_char3[0] = A5555Lb_opcion ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(1) ;
                  GXv_int7[0] = (int)(DecimalUtil.decToDouble(AV13Lb_rb)) ;
                  GXv_char1[0] = " " ;
                  GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
                  new app.gestionlaboratorio.pens003(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_decimal6, GXv_int7, GXv_char1, GXv_decimal8) ;
                  rens023_impl.this.A396EmprCod = GXv_char4[0] ;
                  rens023_impl.this.A5532Lb_numero = GXv_int5[0] ;
                  rens023_impl.this.A5555Lb_opcion = GXv_char3[0] ;
                  rens023_impl.this.AV13Lb_rb = DecimalUtil.doubleToDec(GXv_int7[0]) ;
                  GXv_char4[0] = A396EmprCod ;
                  GXv_char3[0] = AV14Station ;
                  GXv_int7[0] = AV19Lb_numero ;
                  GXv_decimal8[0] = AV17Coste_cor ;
                  new app.gestionlaboratorio.pcoscort(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_decimal8) ;
                  rens023_impl.this.A396EmprCod = GXv_char4[0] ;
                  rens023_impl.this.AV14Station = GXv_char3[0] ;
                  rens023_impl.this.AV19Lb_numero = GXv_int7[0] ;
                  rens023_impl.this.AV17Coste_cor = GXv_decimal8[0] ;
                  h6XF0( false, 150) ;
                  getPrinter().GxDrawRect(399, Gx_line+5, 741, Gx_line+147, 1, 128, 128, 128, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor/Coulor:", ""), 56, Gx_line+20, 125, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5538Lb_ColNomC, "")), 144, Gx_line+19, 240, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Versão/Version:", ""), 56, Gx_line+41, 152, Gx_line+55, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")), 155, Gx_line+41, 163, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 115, Gx_line+63, 174, Gx_line+80, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº Lab.:", ""), 56, Gx_line+63, 106, Gx_line+77, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Custo:", ""), 56, Gx_line+84, 95, Gx_line+98, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Coste_cor, "ZZZZ9.99999")), 108, Gx_line+84, 189, Gx_line+101, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pantone:", ""), 56, Gx_line+105, 110, Gx_line+119, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24lb_pantone, "")), 115, Gx_line+104, 335, Gx_line+121, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+150) ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(1);
               pr_default.readNext(0);
            }
            pr_default.close(0);
            GxHdr2 = false ;
            AV20i = (short)(AV20i+1) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6XF0( true, 0) ;
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

   public void h6XF0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Contdsc, "")), 55, Gx_line+0, 139, Gx_line+11, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
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
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "3c99144a-8aa9-43d5-8fce-801099ee2ac5", "", context.getHttpContext().getTheme( )), 55, Gx_line+3, 441, Gx_line+174) ;
               getPrinter().GxAttris("Arial", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lab Dips para Aprovação", ""), 452, Gx_line+44, 720, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lab Dips Approval", ""), 497, Gx_line+71, 675, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(55, Gx_line+186, 740, Gx_line+186, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+192) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente/Cust:", ""), 56, Gx_line+9, 134, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28CliNom, "")), 142, Gx_line+9, 362, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ref.:", ""), 56, Gx_line+33, 86, Gx_line+47, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Lb_cartaz, "")), 149, Gx_line+33, 296, Gx_line+50, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo/Article:", ""), 461, Gx_line+9, 544, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lb_artcod, "")), 668, Gx_line+8, 742, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tipartdsc, "")), 552, Gx_line+8, 662, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data/Date:", ""), 461, Gx_line+32, 529, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV9Lb_fechaen, "99/99/99"), 552, Gx_line+32, 611, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(55, Gx_line+54, 740, Gx_line+54, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+60) ;
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
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
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
      AV8Lb_cartaz = "" ;
      AV9Lb_fechaen = GXutil.nullDate() ;
      AV13Lb_rb = DecimalUtil.ZERO ;
      AV27Json_EnvioEnsayo = "" ;
      AV11Contdsc = "" ;
      AV14Station = "" ;
      GXt_char2 = "" ;
      AV15EmprNOm = "" ;
      AV16UsurCod = "" ;
      AV25Col_EnvioEnsayo = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT>(app.gestionlaboratorio.SdtEnviodeEnsayo_SDT.class, "EnviodeEnsayo_SDT", "TexplusNET", remoteHandle);
      AV26Item_EnvioEnsayo = new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
      AV18Tab_ensayo = new int[100] ;
      AV23Tab_carta = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV23Tab_carta[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV21Tab_opcion = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV21Tab_opcion[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV22Lb_opcion = "" ;
      scmdbuf = "" ;
      P06XF2_A396EmprCod = new String[] {""} ;
      P06XF2_A5538Lb_ColNomC = new String[] {""} ;
      P06XF2_A5532Lb_numero = new int[1] ;
      P06XF2_A5540Lb_Cartaz = new String[] {""} ;
      P06XF2_A5533Lb_ArtCod = new String[] {""} ;
      P06XF2_A279CliNom = new String[] {""} ;
      P06XF2_A5534Lb_ArtDsc = new String[] {""} ;
      P06XF2_A5552Lb_TipArtD = new String[] {""} ;
      P06XF2_A6546Lb_Pantone = new String[] {""} ;
      P06XF2_A252CliCod = new int[1] ;
      A5538Lb_ColNomC = "" ;
      A5540Lb_Cartaz = "" ;
      A5533Lb_ArtCod = "" ;
      A279CliNom = "" ;
      A5534Lb_ArtDsc = "" ;
      A5552Lb_TipArtD = "" ;
      A6546Lb_Pantone = "" ;
      AV28CliNom = "" ;
      AV10Lb_artcod = "" ;
      AV12Tipartdsc = "" ;
      AV24lb_pantone = "" ;
      P06XF3_A396EmprCod = new String[] {""} ;
      P06XF3_A5532Lb_numero = new int[1] ;
      P06XF3_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      GXv_int5 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new int[1] ;
      AV17Coste_cor = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.rens023__default(),
         new Object[] {
             new Object[] {
            P06XF2_A396EmprCod, P06XF2_A5538Lb_ColNomC, P06XF2_A5532Lb_numero, P06XF2_A5540Lb_Cartaz, P06XF2_A5533Lb_ArtCod, P06XF2_A279CliNom, P06XF2_A5534Lb_ArtDsc, P06XF2_A5552Lb_TipArtD, P06XF2_A6546Lb_Pantone, P06XF2_A252CliCod
            }
            , new Object[] {
            P06XF3_A396EmprCod, P06XF3_A5532Lb_numero, P06XF3_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV20i ;
   private short Gx_err ;
   private int AV29CliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV32GXV1 ;
   private int AV18Tab_ensayo[] ;
   private int AV19Lb_numero ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int GXv_int5[] ;
   private int GXv_int7[] ;
   private int Gx_OldLine ;
   private int GX_I ;
   private java.math.BigDecimal AV13Lb_rb ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV17Coste_cor ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV8Lb_cartaz ;
   private String AV11Contdsc ;
   private String AV14Station ;
   private String GXt_char2 ;
   private String AV15EmprNOm ;
   private String AV16UsurCod ;
   private String AV23Tab_carta[] ;
   private String AV21Tab_opcion[] ;
   private String AV22Lb_opcion ;
   private String scmdbuf ;
   private String A5538Lb_ColNomC ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A279CliNom ;
   private String A5534Lb_ArtDsc ;
   private String A5552Lb_TipArtD ;
   private String A6546Lb_Pantone ;
   private String AV28CliNom ;
   private String AV10Lb_artcod ;
   private String AV12Tipartdsc ;
   private String AV24lb_pantone ;
   private String A5555Lb_opcion ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV9Lb_fechaen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr2 ;
   private String AV27Json_EnvioEnsayo ;
   private IDataStoreProvider pr_default ;
   private String[] P06XF2_A396EmprCod ;
   private String[] P06XF2_A5538Lb_ColNomC ;
   private int[] P06XF2_A5532Lb_numero ;
   private String[] P06XF2_A5540Lb_Cartaz ;
   private String[] P06XF2_A5533Lb_ArtCod ;
   private String[] P06XF2_A279CliNom ;
   private String[] P06XF2_A5534Lb_ArtDsc ;
   private String[] P06XF2_A5552Lb_TipArtD ;
   private String[] P06XF2_A6546Lb_Pantone ;
   private int[] P06XF2_A252CliCod ;
   private String[] P06XF3_A396EmprCod ;
   private int[] P06XF3_A5532Lb_numero ;
   private String[] P06XF3_A5555Lb_opcion ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT> AV25Col_EnvioEnsayo ;
   private app.gestionlaboratorio.SdtEnviodeEnsayo_SDT AV26Item_EnvioEnsayo ;
}

final  class rens023__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06XF2", "SELECT T1.EmprCod, T1.Lb_ColNomC, T1.Lb_numero, T1.Lb_Cartaz, T1.Lb_ArtCod, T2.CliNom, T1.Lb_ArtDsc, T1.Lb_TipArtD, T1.Lb_Pantone, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ?) AND (T1.Lb_numero = ?) AND (T1.Lb_Cartaz = ?) ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06XF3", "SELECT EmprCod, Lb_numero, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 100);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

