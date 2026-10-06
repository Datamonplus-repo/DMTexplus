package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdoctrnwwexportreport_impl extends GXWebReport
{
   public tdoctrnwwexportreport_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
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
      M_bot = 6 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_SdtWWPContext1[0] = AV9WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
         AV9WWPContext = GXv_SdtWWPContext1[0] ;
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S151 ();
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
         AV105Title = httpContext.getMessage( "Lista de Albaranes Comerciales v 02", "") ;
         /* Execute user subroutine: 'PRINTFILTERS' */
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
         /* Execute user subroutine: 'PRINTCOLUMNTITLES' */
         S121 ();
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
         /* Execute user subroutine: 'PRINTDATA' */
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
         /* Execute user subroutine: 'PRINTFOOTER' */
         S171 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h8G20( true, 0) ;
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
      /* 'PRINTFILTERS' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV124AlbComPri)==0) )
      {
         AV127FilterAlbComPriValueDescription = "" ;
         if ( GXutil.strcmp(GXutil.trim( AV124AlbComPri), "1") == 0 )
         {
            AV127FilterAlbComPriValueDescription = httpContext.getMessage( "GR", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( AV124AlbComPri), "0") == 0 )
         {
            AV127FilterAlbComPriValueDescription = httpContext.getMessage( "GT", "") ;
         }
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127FilterAlbComPriValueDescription, "")), 25, Gx_line+0, 814, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20AlbComFch)) )
      {
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV20AlbComFch, "99/99/99"), 25, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125AlbComFch_To)) )
      {
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV125AlbComFch_To, "99/99/99"), 25, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV128FilterFullText)==0) )
      {
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128FilterFullText, "")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV41TFAlbComCod) && (0==AV42TFAlbComCod_To) ) )
      {
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Documento", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFAlbComCod), "ZZZZZZZ9")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV85TFAlbComCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "N Documento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85TFAlbComCod_To_Description, "")), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TFAlbComCod_To), "ZZZZZZZ9")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV114TFAlbComPri_Sels.fromJSonString(AV112TFAlbComPri_SelsJson, null);
      if ( ! ( AV114TFAlbComPri_Sels.size() == 0 ) )
      {
         AV95i = 1 ;
         AV142GXV1 = 1 ;
         while ( AV142GXV1 <= AV114TFAlbComPri_Sels.size() )
         {
            AV46TFAlbComPri_Sel = (String)AV114TFAlbComPri_Sels.elementAt(-1+AV142GXV1) ;
            if ( AV95i == 1 )
            {
               AV113TFAlbComPri_SelDscs = "" ;
            }
            else
            {
               AV113TFAlbComPri_SelDscs += ", " ;
            }
            AV117FilterTFAlbComPri_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV46TFAlbComPri_Sel), "1") == 0 )
            {
               AV117FilterTFAlbComPri_SelValueDescription = httpContext.getMessage( "GR", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV46TFAlbComPri_Sel), "0") == 0 )
            {
               AV117FilterTFAlbComPri_SelValueDescription = httpContext.getMessage( "GT", "") ;
            }
            AV113TFAlbComPri_SelDscs += AV117FilterTFAlbComPri_SelValueDescription ;
            AV95i = (long)(AV95i+1) ;
            AV142GXV1 = (int)(AV142GXV1+1) ;
         }
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113TFAlbComPri_SelDscs, "")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV121TFAlbComEst_Sels.fromJSonString(AV119TFAlbComEst_SelsJson, null);
      if ( ! ( AV121TFAlbComEst_Sels.size() == 0 ) )
      {
         AV95i = 1 ;
         AV143GXV2 = 1 ;
         while ( AV143GXV2 <= AV121TFAlbComEst_Sels.size() )
         {
            AV122TFAlbComEst_Sel = ((Number) AV121TFAlbComEst_Sels.elementAt(-1+AV143GXV2)).byteValue() ;
            if ( AV95i == 1 )
            {
               AV120TFAlbComEst_SelDscs = "" ;
            }
            else
            {
               AV120TFAlbComEst_SelDscs += ", " ;
            }
            AV123FilterTFAlbComEst_SelValueDescription = "" ;
            if ( AV122TFAlbComEst_Sel == 0 )
            {
               AV123FilterTFAlbComEst_SelValueDescription = httpContext.getMessage( "Generado", "") ;
            }
            else if ( AV122TFAlbComEst_Sel == 1 )
            {
               AV123FilterTFAlbComEst_SelValueDescription = httpContext.getMessage( "Impreso", "") ;
            }
            else if ( AV122TFAlbComEst_Sel == 2 )
            {
               AV123FilterTFAlbComEst_SelValueDescription = httpContext.getMessage( "Facturado", "") ;
            }
            AV120TFAlbComEst_SelDscs += AV123FilterTFAlbComEst_SelValueDescription ;
            AV95i = (long)(AV95i+1) ;
            AV143GXV2 = (int)(AV143GXV2+1) ;
         }
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("", 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120TFAlbComEst_SelDscs, "")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFAlbComFch)) )
      {
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV43TFAlbComFch, "99/99/99"), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV49TFCliCod) && (0==AV50TFCliCod_To) ) )
      {
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TFCliCod), "ZZZZZ9")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV88TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88TFCliCod_To_Description, "")), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TFCliCod_To), "ZZZZZ9")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFCliNom_Sel)==0) )
      {
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFCliNom_Sel, "")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV51TFCliNom)==0) )
         {
            h8G20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFCliNom, "")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV78TFAlbComFd_Sel)==0) )
      {
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hash", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFAlbComFd_Sel, "")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV77TFAlbComFd)==0) )
         {
            h8G20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hash", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFAlbComFd, "")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV116TFAlbComFdD_Sel)==0) )
      {
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hash Ctrl", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116TFAlbComFdD_Sel, "")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV115TFAlbComFdD)==0) )
         {
            h8G20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hash Ctrl", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115TFAlbComFdD, "")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV129TFfindDomEnv) && (0==AV130TFfindDomEnv_To) ) )
      {
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Domicilio envio", ""), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV129TFfindDomEnv), "9")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV131TFfindDomEnv_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Domicilio envio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8G20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131TFfindDomEnv_To_Description, "")), 25, Gx_line+0, 145, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV130TFfindDomEnv_To), "9")), 145, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8G20( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8G20( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Documento", ""), 30, Gx_line+10, 90, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 94, Gx_line+10, 154, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText("", 158, Gx_line+10, 218, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 222, Gx_line+10, 282, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 286, Gx_line+10, 346, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 350, Gx_line+10, 470, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hash", ""), 474, Gx_line+10, 596, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hash Ctrl", ""), 600, Gx_line+10, 722, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Domicilio envio", ""), 726, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV145Tdoctrnwwds_1_albcompri = AV124AlbComPri ;
      AV146Tdoctrnwwds_2_albcomfch = AV20AlbComFch ;
      AV147Tdoctrnwwds_3_albcomfch_to = AV125AlbComFch_To ;
      AV148Tdoctrnwwds_4_filterfulltext = AV128FilterFullText ;
      AV149Tdoctrnwwds_5_tfalbcomcod = AV41TFAlbComCod ;
      AV150Tdoctrnwwds_6_tfalbcomcod_to = AV42TFAlbComCod_To ;
      AV151Tdoctrnwwds_7_tfalbcompri_sels = AV114TFAlbComPri_Sels ;
      AV152Tdoctrnwwds_8_tfalbcomest_sels = AV121TFAlbComEst_Sels ;
      AV153Tdoctrnwwds_9_tfalbcomfch = AV43TFAlbComFch ;
      AV154Tdoctrnwwds_10_tfclicod = AV49TFCliCod ;
      AV155Tdoctrnwwds_11_tfclicod_to = AV50TFCliCod_To ;
      AV156Tdoctrnwwds_12_tfclinom = AV51TFCliNom ;
      AV157Tdoctrnwwds_13_tfclinom_sel = AV52TFCliNom_Sel ;
      AV158Tdoctrnwwds_14_tfalbcomfd = AV77TFAlbComFd ;
      AV159Tdoctrnwwds_15_tfalbcomfd_sel = AV78TFAlbComFd_Sel ;
      AV160Tdoctrnwwds_16_tfalbcomfdd = AV115TFAlbComFdD ;
      AV161Tdoctrnwwds_17_tfalbcomfdd_sel = AV116TFAlbComFdD_Sel ;
      AV162Tdoctrnwwds_18_tffinddomenv = AV129TFfindDomEnv ;
      AV163Tdoctrnwwds_19_tffinddomenv_to = AV130TFfindDomEnv_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A22AlbComPri ,
                                           AV151Tdoctrnwwds_7_tfalbcompri_sels ,
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV152Tdoctrnwwds_8_tfalbcomest_sels ,
                                           AV146Tdoctrnwwds_2_albcomfch ,
                                           AV147Tdoctrnwwds_3_albcomfch_to ,
                                           Integer.valueOf(AV149Tdoctrnwwds_5_tfalbcomcod) ,
                                           Integer.valueOf(AV150Tdoctrnwwds_6_tfalbcomcod_to) ,
                                           Integer.valueOf(AV151Tdoctrnwwds_7_tfalbcompri_sels.size()) ,
                                           Integer.valueOf(AV152Tdoctrnwwds_8_tfalbcomest_sels.size()) ,
                                           AV153Tdoctrnwwds_9_tfalbcomfch ,
                                           Integer.valueOf(AV154Tdoctrnwwds_10_tfclicod) ,
                                           Integer.valueOf(AV155Tdoctrnwwds_11_tfclicod_to) ,
                                           AV157Tdoctrnwwds_13_tfclinom_sel ,
                                           AV156Tdoctrnwwds_12_tfclinom ,
                                           AV159Tdoctrnwwds_15_tfalbcomfd_sel ,
                                           AV158Tdoctrnwwds_14_tfalbcomfd ,
                                           AV161Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                           AV160Tdoctrnwwds_16_tfalbcomfdd ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10014AlbComFd ,
                                           A10015AlbComFdD ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV148Tdoctrnwwds_4_filterfulltext ,
                                           Byte.valueOf(A13739findDomEnv) ,
                                           Byte.valueOf(AV162Tdoctrnwwds_18_tffinddomenv) ,
                                           Byte.valueOf(AV163Tdoctrnwwds_19_tffinddomenv_to) ,
                                           AV145Tdoctrnwwds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING
                                           }
      });
      lV148Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV148Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV148Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV148Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV148Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV148Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV148Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV148Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV148Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV148Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV148Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV148Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV148Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV148Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV148Tdoctrnwwds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV148Tdoctrnwwds_4_filterfulltext), "%", "") ;
      lV156Tdoctrnwwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV156Tdoctrnwwds_12_tfclinom), 30, "%") ;
      lV158Tdoctrnwwds_14_tfalbcomfd = GXutil.padr( GXutil.rtrim( AV158Tdoctrnwwds_14_tfalbcomfd), 200, "%") ;
      lV160Tdoctrnwwds_16_tfalbcomfdd = GXutil.padr( GXutil.rtrim( AV160Tdoctrnwwds_16_tfalbcomfdd), 200, "%") ;
      /* Using cursor P08G22 */
      pr_default.execute(0, new Object[] {AV148Tdoctrnwwds_4_filterfulltext, lV148Tdoctrnwwds_4_filterfulltext, lV148Tdoctrnwwds_4_filterfulltext, lV148Tdoctrnwwds_4_filterfulltext, lV148Tdoctrnwwds_4_filterfulltext, lV148Tdoctrnwwds_4_filterfulltext, lV148Tdoctrnwwds_4_filterfulltext, lV148Tdoctrnwwds_4_filterfulltext, lV148Tdoctrnwwds_4_filterfulltext, Byte.valueOf(AV162Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV162Tdoctrnwwds_18_tffinddomenv), Byte.valueOf(AV163Tdoctrnwwds_19_tffinddomenv_to), Byte.valueOf(AV163Tdoctrnwwds_19_tffinddomenv_to), AV145Tdoctrnwwds_1_albcompri, AV146Tdoctrnwwds_2_albcomfch, AV147Tdoctrnwwds_3_albcomfch_to, Integer.valueOf(AV149Tdoctrnwwds_5_tfalbcomcod), Integer.valueOf(AV150Tdoctrnwwds_6_tfalbcomcod_to), AV153Tdoctrnwwds_9_tfalbcomfch, Integer.valueOf(AV154Tdoctrnwwds_10_tfclicod), Integer.valueOf(AV155Tdoctrnwwds_11_tfclicod_to), lV156Tdoctrnwwds_12_tfclinom, AV157Tdoctrnwwds_13_tfclinom_sel, lV158Tdoctrnwwds_14_tfalbcomfd, AV159Tdoctrnwwds_15_tfalbcomfd_sel, lV160Tdoctrnwwds_16_tfalbcomfdd, AV161Tdoctrnwwds_17_tfalbcomfdd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08G22_A396EmprCod[0] ;
         A5142AlcDomEnv = P08G22_A5142AlcDomEnv[0] ;
         A10015AlbComFdD = P08G22_A10015AlbComFdD[0] ;
         A10014AlbComFd = P08G22_A10014AlbComFd[0] ;
         A279CliNom = P08G22_A279CliNom[0] ;
         A252CliCod = P08G22_A252CliCod[0] ;
         A16AlbComEst = P08G22_A16AlbComEst[0] ;
         A14AlbComCod = P08G22_A14AlbComCod[0] ;
         A17AlbComFch = P08G22_A17AlbComFch[0] ;
         A22AlbComPri = P08G22_A22AlbComPri[0] ;
         A13739findDomEnv = P08G22_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G22_n13739findDomEnv[0] ;
         A279CliNom = P08G22_A279CliNom[0] ;
         A13739findDomEnv = P08G22_A13739findDomEnv[0] ;
         n13739findDomEnv = P08G22_n13739findDomEnv[0] ;
         AV111AlbComPriDescription = "" ;
         if ( GXutil.strcmp(GXutil.trim( A22AlbComPri), "1") == 0 )
         {
            AV111AlbComPriDescription = httpContext.getMessage( "GR", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( A22AlbComPri), "0") == 0 )
         {
            AV111AlbComPriDescription = httpContext.getMessage( "GT", "") ;
         }
         AV118AlbComEstDescription = "" ;
         if ( A16AlbComEst == 0 )
         {
            AV118AlbComEstDescription = httpContext.getMessage( "Generado", "") ;
         }
         else if ( A16AlbComEst == 1 )
         {
            AV118AlbComEstDescription = httpContext.getMessage( "Impreso", "") ;
         }
         else if ( A16AlbComEst == 2 )
         {
            AV118AlbComEstDescription = httpContext.getMessage( "Facturado", "") ;
         }
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h8G20( false, 66) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), 30, Gx_line+10, 90, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111AlbComPriDescription, "")), 94, Gx_line+10, 154, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118AlbComEstDescription, "")), 158, Gx_line+10, 218, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A17AlbComFch, "99/99/99"), 222, Gx_line+10, 282, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 286, Gx_line+10, 346, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 350, Gx_line+10, 470, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10014AlbComFd, "")), 474, Gx_line+10, 596, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10015AlbComFdD, "")), 600, Gx_line+10, 722, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13739findDomEnv), "9")), 726, Gx_line+10, 787, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+65, 789, Gx_line+65, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+66) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("TDOCTRNWWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDOCTRNWWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("TDOCTRNWWGridState"), null, null);
      }
      AV10OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV164GXV3 = 1 ;
      while ( AV164GXV3 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV164GXV3));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMPRI") == 0 )
         {
            AV124AlbComPri = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMFCH") == 0 )
         {
            AV20AlbComFch = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV125AlbComFch_To = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV128FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV41TFAlbComCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFAlbComCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPRI_SEL") == 0 )
         {
            AV112TFAlbComPri_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV114TFAlbComPri_Sels.fromJSonString(AV112TFAlbComPri_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEST_SEL") == 0 )
         {
            AV119TFAlbComEst_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV121TFAlbComEst_Sels.fromJSonString(AV119TFAlbComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV43TFAlbComFch = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV49TFCliCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFCliCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV51TFCliNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV52TFCliNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD") == 0 )
         {
            AV77TFAlbComFd = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFD_SEL") == 0 )
         {
            AV78TFAlbComFd_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD") == 0 )
         {
            AV115TFAlbComFdD = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFDD_SEL") == 0 )
         {
            AV116TFAlbComFdD_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFINDDOMENV") == 0 )
         {
            AV129TFfindDomEnv = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV130TFfindDomEnv_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV164GXV3 = (int)(AV164GXV3+1) ;
      }
   }

   public void S144( ) throws ProcessInterruptedException
   {
      /* 'BEFOREPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'AFTERPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'PRINTFOOTER' Routine */
      returnInSub = false ;
   }

   public void h8G20( boolean bFoot ,
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
               AV102PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV98DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+40) ;
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
            AV105Title = AV139Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+128) ;
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
   }

   public void add_metrics0( )
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV105Title = "" ;
      AV124AlbComPri = "" ;
      AV127FilterAlbComPriValueDescription = "" ;
      AV20AlbComFch = GXutil.nullDate() ;
      AV125AlbComFch_To = GXutil.nullDate() ;
      AV128FilterFullText = "" ;
      AV85TFAlbComCod_To_Description = "" ;
      AV114TFAlbComPri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV112TFAlbComPri_SelsJson = "" ;
      AV46TFAlbComPri_Sel = "" ;
      AV113TFAlbComPri_SelDscs = "" ;
      AV117FilterTFAlbComPri_SelValueDescription = "" ;
      AV121TFAlbComEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV119TFAlbComEst_SelsJson = "" ;
      AV120TFAlbComEst_SelDscs = "" ;
      AV123FilterTFAlbComEst_SelValueDescription = "" ;
      AV43TFAlbComFch = GXutil.nullDate() ;
      AV88TFCliCod_To_Description = "" ;
      AV52TFCliNom_Sel = "" ;
      AV51TFCliNom = "" ;
      AV78TFAlbComFd_Sel = "" ;
      AV77TFAlbComFd = "" ;
      AV116TFAlbComFdD_Sel = "" ;
      AV115TFAlbComFdD = "" ;
      AV131TFfindDomEnv_To_Description = "" ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      AV145Tdoctrnwwds_1_albcompri = "" ;
      AV146Tdoctrnwwds_2_albcomfch = GXutil.nullDate() ;
      AV147Tdoctrnwwds_3_albcomfch_to = GXutil.nullDate() ;
      AV148Tdoctrnwwds_4_filterfulltext = "" ;
      AV151Tdoctrnwwds_7_tfalbcompri_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV152Tdoctrnwwds_8_tfalbcomest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV153Tdoctrnwwds_9_tfalbcomfch = GXutil.nullDate() ;
      AV156Tdoctrnwwds_12_tfclinom = "" ;
      AV157Tdoctrnwwds_13_tfclinom_sel = "" ;
      AV158Tdoctrnwwds_14_tfalbcomfd = "" ;
      AV159Tdoctrnwwds_15_tfalbcomfd_sel = "" ;
      AV160Tdoctrnwwds_16_tfalbcomfdd = "" ;
      AV161Tdoctrnwwds_17_tfalbcomfdd_sel = "" ;
      lV148Tdoctrnwwds_4_filterfulltext = "" ;
      scmdbuf = "" ;
      lV156Tdoctrnwwds_12_tfclinom = "" ;
      lV158Tdoctrnwwds_14_tfalbcomfd = "" ;
      lV160Tdoctrnwwds_16_tfalbcomfdd = "" ;
      P08G22_A266CliEnvLin = new byte[1] ;
      P08G22_A396EmprCod = new String[] {""} ;
      P08G22_A5142AlcDomEnv = new byte[1] ;
      P08G22_A10015AlbComFdD = new String[] {""} ;
      P08G22_A10014AlbComFd = new String[] {""} ;
      P08G22_A279CliNom = new String[] {""} ;
      P08G22_A252CliCod = new int[1] ;
      P08G22_A16AlbComEst = new byte[1] ;
      P08G22_A14AlbComCod = new int[1] ;
      P08G22_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08G22_A22AlbComPri = new String[] {""} ;
      P08G22_A13739findDomEnv = new byte[1] ;
      P08G22_n13739findDomEnv = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV111AlbComPriDescription = "" ;
      AV118AlbComEstDescription = "" ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV102PageInfo = "" ;
      AV98DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV139Pgmdesc = "" ;
      AV133AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdoctrnwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08G22_A266CliEnvLin, P08G22_A396EmprCod, P08G22_A5142AlcDomEnv, P08G22_A10015AlbComFdD, P08G22_A10014AlbComFd, P08G22_A279CliNom, P08G22_A252CliCod, P08G22_A16AlbComEst, P08G22_A14AlbComCod, P08G22_A17AlbComFch,
            P08G22_A22AlbComPri, P08G22_A13739findDomEnv, P08G22_n13739findDomEnv
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV139Pgmdesc = httpContext.getMessage( "TDOCTRNWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV139Pgmdesc = httpContext.getMessage( "TDOCTRNWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV122TFAlbComEst_Sel ;
   private byte AV129TFfindDomEnv ;
   private byte AV130TFfindDomEnv_To ;
   private byte A16AlbComEst ;
   private byte A13739findDomEnv ;
   private byte AV162Tdoctrnwwds_18_tffinddomenv ;
   private byte AV163Tdoctrnwwds_19_tffinddomenv_to ;
   private byte A5142AlcDomEnv ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV41TFAlbComCod ;
   private int AV42TFAlbComCod_To ;
   private int AV142GXV1 ;
   private int AV143GXV2 ;
   private int AV49TFCliCod ;
   private int AV50TFCliCod_To ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV149Tdoctrnwwds_5_tfalbcomcod ;
   private int AV150Tdoctrnwwds_6_tfalbcomcod_to ;
   private int AV154Tdoctrnwwds_10_tfclicod ;
   private int AV155Tdoctrnwwds_11_tfclicod_to ;
   private int AV151Tdoctrnwwds_7_tfalbcompri_sels_size ;
   private int AV152Tdoctrnwwds_8_tfalbcomest_sels_size ;
   private int AV164GXV3 ;
   private long AV95i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV124AlbComPri ;
   private String AV46TFAlbComPri_Sel ;
   private String AV52TFCliNom_Sel ;
   private String AV51TFCliNom ;
   private String AV78TFAlbComFd_Sel ;
   private String AV77TFAlbComFd ;
   private String AV116TFAlbComFdD_Sel ;
   private String AV115TFAlbComFdD ;
   private String A22AlbComPri ;
   private String A279CliNom ;
   private String A10014AlbComFd ;
   private String A10015AlbComFdD ;
   private String AV145Tdoctrnwwds_1_albcompri ;
   private String AV156Tdoctrnwwds_12_tfclinom ;
   private String AV157Tdoctrnwwds_13_tfclinom_sel ;
   private String AV158Tdoctrnwwds_14_tfalbcomfd ;
   private String AV159Tdoctrnwwds_15_tfalbcomfd_sel ;
   private String AV160Tdoctrnwwds_16_tfalbcomfdd ;
   private String AV161Tdoctrnwwds_17_tfalbcomfdd_sel ;
   private String scmdbuf ;
   private String lV156Tdoctrnwwds_12_tfclinom ;
   private String lV158Tdoctrnwwds_14_tfalbcomfd ;
   private String lV160Tdoctrnwwds_16_tfalbcomfdd ;
   private String A396EmprCod ;
   private String AV139Pgmdesc ;
   private java.util.Date AV20AlbComFch ;
   private java.util.Date AV125AlbComFch_To ;
   private java.util.Date AV43TFAlbComFch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV146Tdoctrnwwds_2_albcomfch ;
   private java.util.Date AV147Tdoctrnwwds_3_albcomfch_to ;
   private java.util.Date AV153Tdoctrnwwds_9_tfalbcomfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n13739findDomEnv ;
   private String AV112TFAlbComPri_SelsJson ;
   private String AV119TFAlbComEst_SelsJson ;
   private String AV105Title ;
   private String AV127FilterAlbComPriValueDescription ;
   private String AV128FilterFullText ;
   private String AV85TFAlbComCod_To_Description ;
   private String AV113TFAlbComPri_SelDscs ;
   private String AV117FilterTFAlbComPri_SelValueDescription ;
   private String AV120TFAlbComEst_SelDscs ;
   private String AV123FilterTFAlbComEst_SelValueDescription ;
   private String AV88TFCliCod_To_Description ;
   private String AV131TFfindDomEnv_To_Description ;
   private String AV148Tdoctrnwwds_4_filterfulltext ;
   private String lV148Tdoctrnwwds_4_filterfulltext ;
   private String AV111AlbComPriDescription ;
   private String AV118AlbComEstDescription ;
   private String AV102PageInfo ;
   private String AV98DateInfo ;
   private String AV133AppName ;
   private GXSimpleCollection<Byte> AV121TFAlbComEst_Sels ;
   private GXSimpleCollection<Byte> AV152Tdoctrnwwds_8_tfalbcomest_sels ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private IDataStoreProvider pr_default ;
   private byte[] P08G22_A266CliEnvLin ;
   private String[] P08G22_A396EmprCod ;
   private byte[] P08G22_A5142AlcDomEnv ;
   private String[] P08G22_A10015AlbComFdD ;
   private String[] P08G22_A10014AlbComFd ;
   private String[] P08G22_A279CliNom ;
   private int[] P08G22_A252CliCod ;
   private byte[] P08G22_A16AlbComEst ;
   private int[] P08G22_A14AlbComCod ;
   private java.util.Date[] P08G22_A17AlbComFch ;
   private String[] P08G22_A22AlbComPri ;
   private byte[] P08G22_A13739findDomEnv ;
   private boolean[] P08G22_n13739findDomEnv ;
   private GXSimpleCollection<String> AV114TFAlbComPri_Sels ;
   private GXSimpleCollection<String> AV151Tdoctrnwwds_7_tfalbcompri_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class tdoctrnwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08G22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A22AlbComPri ,
                                          GXSimpleCollection<String> AV151Tdoctrnwwds_7_tfalbcompri_sels ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV152Tdoctrnwwds_8_tfalbcomest_sels ,
                                          java.util.Date AV146Tdoctrnwwds_2_albcomfch ,
                                          java.util.Date AV147Tdoctrnwwds_3_albcomfch_to ,
                                          int AV149Tdoctrnwwds_5_tfalbcomcod ,
                                          int AV150Tdoctrnwwds_6_tfalbcomcod_to ,
                                          int AV151Tdoctrnwwds_7_tfalbcompri_sels_size ,
                                          int AV152Tdoctrnwwds_8_tfalbcomest_sels_size ,
                                          java.util.Date AV153Tdoctrnwwds_9_tfalbcomfch ,
                                          int AV154Tdoctrnwwds_10_tfclicod ,
                                          int AV155Tdoctrnwwds_11_tfclicod_to ,
                                          String AV157Tdoctrnwwds_13_tfclinom_sel ,
                                          String AV156Tdoctrnwwds_12_tfclinom ,
                                          String AV159Tdoctrnwwds_15_tfalbcomfd_sel ,
                                          String AV158Tdoctrnwwds_14_tfalbcomfd ,
                                          String AV161Tdoctrnwwds_17_tfalbcomfdd_sel ,
                                          String AV160Tdoctrnwwds_16_tfalbcomfdd ,
                                          java.util.Date A17AlbComFch ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10014AlbComFd ,
                                          String A10015AlbComFdD ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV148Tdoctrnwwds_4_filterfulltext ,
                                          byte A13739findDomEnv ,
                                          byte AV162Tdoctrnwwds_18_tffinddomenv ,
                                          byte AV163Tdoctrnwwds_19_tffinddomenv_to ,
                                          String AV145Tdoctrnwwds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T3.CliEnvLin, T1.EmprCod, T1.AlcDomEnv, T1.AlbComFdD, T1.AlbComFd, T2.CliNom, T1.CliCod, T1.AlbComEst, T1.AlbComCod, T1.AlbComFch, T1.AlbComPri, COALESCE(" ;
      scmdbuf += " T3.CliEnvLin, 0) AS findDomEnv FROM ((TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCLIENV T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.CliEnvLin = T1.AlcDomEnv)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.AlbComPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbComEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFd) like '%' || UPPER(?)) or ( UPPER(T1.AlbComFdD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliEnvLin, 0),'90'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliEnvLin, 0) <= ?))");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146Tdoctrnwwds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV147Tdoctrnwwds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV149Tdoctrnwwds_5_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV150Tdoctrnwwds_6_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( AV151Tdoctrnwwds_7_tfalbcompri_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV151Tdoctrnwwds_7_tfalbcompri_sels, "T1.AlbComPri IN (", ")")+")");
      }
      if ( AV152Tdoctrnwwds_8_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV152Tdoctrnwwds_8_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV153Tdoctrnwwds_9_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV154Tdoctrnwwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV155Tdoctrnwwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Tdoctrnwwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV156Tdoctrnwwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Tdoctrnwwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Tdoctrnwwds_15_tfalbcomfd_sel)==0) && ( ! (GXutil.strcmp("", AV158Tdoctrnwwds_14_tfalbcomfd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFd) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Tdoctrnwwds_15_tfalbcomfd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFd = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Tdoctrnwwds_17_tfalbcomfdd_sel)==0) && ( ! (GXutil.strcmp("", AV160Tdoctrnwwds_16_tfalbcomfdd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComFdD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Tdoctrnwwds_17_tfalbcomfdd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComFdD = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFch" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFch DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComPri" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComPri DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComEst" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComEst DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFd" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFd DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbComFdD" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbComFdD DESC" ;
      }
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P08G22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08G22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 200);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 200);
               }
               return;
      }
   }

}

