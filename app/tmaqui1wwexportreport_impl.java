package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqui1wwexportreport_impl extends GXWebReport
{
   public tmaqui1wwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV100Title = httpContext.getMessage( "Lista de MANTENIMIENTO MAQUINAS Basico", "") ;
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
         h8320( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV108FilterFullText)==0) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108FilterFullText, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFMaqCod_Sel)==0) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod.", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFMaqCod_Sel, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV35TFMaqCod)==0) )
         {
            h8320( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cod.", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFMaqCod, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV38TFMaqDsc_Sel)==0) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFMaqDsc_Sel, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV37TFMaqDsc)==0) )
         {
            h8320( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFMaqDsc, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV50TFMaqEst_Sel)==0) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFMaqEst_Sel, "@!")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV49TFMaqEst)==0) )
         {
            h8320( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFMaqEst, "@!")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV116TFMaqTinTip_Sel)==0) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116TFMaqTinTip_Sel, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV115TFMaqTinTip)==0) )
         {
            h8320( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115TFMaqTinTip, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV117TFMaqVolMin) && (0==AV118TFMaqVolMin_To) ) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Vol Min", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV117TFMaqVolMin), "ZZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV125TFMaqVolMin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Vol Min", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV125TFMaqVolMin_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV118TFMaqVolMin_To), "ZZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV119TFMaqVolMed) && (0==AV120TFMaqVolMed_To) ) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Vol Med", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV119TFMaqVolMed), "ZZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV126TFMaqVolMed_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Vol Med", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV126TFMaqVolMed_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV120TFMaqVolMed_To), "ZZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV121TFMaqVolTop) && (0==AV122TFMaqVolTop_To) ) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Vol Tope ( CO )", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV121TFMaqVolTop), "ZZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV127TFMaqVolTop_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Vol Tope ( CO )", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127TFMaqVolTop_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV122TFMaqVolTop_To), "ZZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV123TFMaqVolRes) && (0==AV124TFMaqVolRes_To) ) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Vol Residual", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV123TFMaqVolRes), "ZZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV128TFMaqVolRes_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Vol Residual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128TFMaqVolRes_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV124TFMaqVolRes_To), "ZZZZ9")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFMaqKgsMax)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFMaqKgsMax_To)==0) ) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kgs Max", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV67TFMaqKgsMax, "ZZZZZ9.99")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV86TFMaqKgsMax_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kgs Max", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86TFMaqKgsMax_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68TFMaqKgsMax_To, "ZZZZZ9.99")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFMaqKgsMed)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFMaqKgsMed_To)==0) ) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kgs Med", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65TFMaqKgsMed, "ZZZZZ9.99")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV85TFMaqKgsMed_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kgs Med", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85TFMaqKgsMed_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66TFMaqKgsMed_To, "ZZZZZ9.99")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFMaqKgsMin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFMaqKgsMin_To)==0) ) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kgs Min", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63TFMaqKgsMin, "ZZZZZ9.99")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV84TFMaqKgsMin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kgs Min", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84TFMaqKgsMin_To_Description, "")), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TFMaqKgsMin_To, "ZZZZZ9.99")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV58TFTipMaqCod_Sel)==0) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo MQ", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFTipMaqCod_Sel, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV57TFTipMaqCod)==0) )
         {
            h8320( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo MQ", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFTipMaqCod, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV60TFTipMaqDsc_Sel)==0) )
      {
         h8320( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFTipMaqDsc_Sel, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV59TFTipMaqDsc)==0) )
         {
            h8320( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 147, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFTipMaqDsc, "")), 147, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8320( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8320( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod.", ""), 30, Gx_line+10, 84, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 146, Gx_line+10, 200, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 204, Gx_line+10, 258, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Vol Min", ""), 262, Gx_line+10, 316, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Vol Med", ""), 320, Gx_line+10, 374, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Vol Tope ( CO )", ""), 378, Gx_line+10, 432, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Vol Residual", ""), 436, Gx_line+10, 491, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kgs Max", ""), 495, Gx_line+10, 550, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kgs Med", ""), 554, Gx_line+10, 609, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kgs Min", ""), 613, Gx_line+10, 668, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo MQ", ""), 672, Gx_line+10, 727, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 731, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV135Tmaqui1wwds_1_filterfulltext = AV108FilterFullText ;
      AV136Tmaqui1wwds_2_tfmaqcod = AV35TFMaqCod ;
      AV137Tmaqui1wwds_3_tfmaqcod_sel = AV36TFMaqCod_Sel ;
      AV138Tmaqui1wwds_4_tfmaqdsc = AV37TFMaqDsc ;
      AV139Tmaqui1wwds_5_tfmaqdsc_sel = AV38TFMaqDsc_Sel ;
      AV140Tmaqui1wwds_6_tfmaqest = AV49TFMaqEst ;
      AV141Tmaqui1wwds_7_tfmaqest_sel = AV50TFMaqEst_Sel ;
      AV142Tmaqui1wwds_8_tfmaqtintip = AV115TFMaqTinTip ;
      AV143Tmaqui1wwds_9_tfmaqtintip_sel = AV116TFMaqTinTip_Sel ;
      AV144Tmaqui1wwds_10_tfmaqvolmin = AV117TFMaqVolMin ;
      AV145Tmaqui1wwds_11_tfmaqvolmin_to = AV118TFMaqVolMin_To ;
      AV146Tmaqui1wwds_12_tfmaqvolmed = AV119TFMaqVolMed ;
      AV147Tmaqui1wwds_13_tfmaqvolmed_to = AV120TFMaqVolMed_To ;
      AV148Tmaqui1wwds_14_tfmaqvoltop = AV121TFMaqVolTop ;
      AV149Tmaqui1wwds_15_tfmaqvoltop_to = AV122TFMaqVolTop_To ;
      AV150Tmaqui1wwds_16_tfmaqvolres = AV123TFMaqVolRes ;
      AV151Tmaqui1wwds_17_tfmaqvolres_to = AV124TFMaqVolRes_To ;
      AV152Tmaqui1wwds_18_tfmaqkgsmax = AV67TFMaqKgsMax ;
      AV153Tmaqui1wwds_19_tfmaqkgsmax_to = AV68TFMaqKgsMax_To ;
      AV154Tmaqui1wwds_20_tfmaqkgsmed = AV65TFMaqKgsMed ;
      AV155Tmaqui1wwds_21_tfmaqkgsmed_to = AV66TFMaqKgsMed_To ;
      AV156Tmaqui1wwds_22_tfmaqkgsmin = AV63TFMaqKgsMin ;
      AV157Tmaqui1wwds_23_tfmaqkgsmin_to = AV64TFMaqKgsMin_To ;
      AV158Tmaqui1wwds_24_tftipmaqcod = AV57TFTipMaqCod ;
      AV159Tmaqui1wwds_25_tftipmaqcod_sel = AV58TFTipMaqCod_Sel ;
      AV160Tmaqui1wwds_26_tftipmaqdsc = AV59TFTipMaqDsc ;
      AV161Tmaqui1wwds_27_tftipmaqdsc_sel = AV60TFTipMaqDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV135Tmaqui1wwds_1_filterfulltext ,
                                           AV137Tmaqui1wwds_3_tfmaqcod_sel ,
                                           AV136Tmaqui1wwds_2_tfmaqcod ,
                                           AV139Tmaqui1wwds_5_tfmaqdsc_sel ,
                                           AV138Tmaqui1wwds_4_tfmaqdsc ,
                                           AV141Tmaqui1wwds_7_tfmaqest_sel ,
                                           AV140Tmaqui1wwds_6_tfmaqest ,
                                           AV143Tmaqui1wwds_9_tfmaqtintip_sel ,
                                           AV142Tmaqui1wwds_8_tfmaqtintip ,
                                           Integer.valueOf(AV144Tmaqui1wwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV145Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV146Tmaqui1wwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV147Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV148Tmaqui1wwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV149Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV150Tmaqui1wwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV151Tmaqui1wwds_17_tfmaqvolres_to) ,
                                           AV152Tmaqui1wwds_18_tfmaqkgsmax ,
                                           AV153Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                           AV154Tmaqui1wwds_20_tfmaqkgsmed ,
                                           AV155Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                           AV156Tmaqui1wwds_22_tfmaqkgsmin ,
                                           AV157Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                           AV159Tmaqui1wwds_25_tftipmaqcod_sel ,
                                           AV158Tmaqui1wwds_24_tftipmaqcod ,
                                           AV161Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                           AV160Tmaqui1wwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A607MaqEst ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV135Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV136Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV136Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
      lV138Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV138Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
      lV140Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV140Tmaqui1wwds_6_tfmaqest), 1, "%") ;
      lV142Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV142Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
      lV158Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV158Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
      lV160Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV160Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P08322 */
      pr_default.execute(0, new Object[] {lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_1_filterfulltext, lV136Tmaqui1wwds_2_tfmaqcod, AV137Tmaqui1wwds_3_tfmaqcod_sel, lV138Tmaqui1wwds_4_tfmaqdsc, AV139Tmaqui1wwds_5_tfmaqdsc_sel, lV140Tmaqui1wwds_6_tfmaqest, AV141Tmaqui1wwds_7_tfmaqest_sel, lV142Tmaqui1wwds_8_tfmaqtintip, AV143Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV144Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV145Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV146Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV147Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV148Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV149Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV150Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV151Tmaqui1wwds_17_tfmaqvolres_to), AV152Tmaqui1wwds_18_tfmaqkgsmax, AV153Tmaqui1wwds_19_tfmaqkgsmax_to, AV154Tmaqui1wwds_20_tfmaqkgsmed, AV155Tmaqui1wwds_21_tfmaqkgsmed_to, AV156Tmaqui1wwds_22_tfmaqkgsmin, AV157Tmaqui1wwds_23_tfmaqkgsmin_to, lV158Tmaqui1wwds_24_tftipmaqcod, AV159Tmaqui1wwds_25_tftipmaqcod_sel, lV160Tmaqui1wwds_26_tftipmaqdsc, AV161Tmaqui1wwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08322_A396EmprCod[0] ;
         A1012TipMaqDsc = P08322_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08322_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P08322_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08322_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P08322_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P08322_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P08322_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P08322_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P08322_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P08322_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P08322_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P08322_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P08322_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P08322_n2802MaqVolTop[0] ;
         A624MaqVolMed = P08322_A624MaqVolMed[0] ;
         n624MaqVolMed = P08322_n624MaqVolMed[0] ;
         A625MaqVolMin = P08322_A625MaqVolMin[0] ;
         n625MaqVolMin = P08322_n625MaqVolMin[0] ;
         A619MaqTinTip = P08322_A619MaqTinTip[0] ;
         n619MaqTinTip = P08322_n619MaqTinTip[0] ;
         A607MaqEst = P08322_A607MaqEst[0] ;
         n607MaqEst = P08322_n607MaqEst[0] ;
         A606MaqDsc = P08322_A606MaqDsc[0] ;
         n606MaqDsc = P08322_n606MaqDsc[0] ;
         A602MaqCod = P08322_A602MaqCod[0] ;
         A1012TipMaqDsc = P08322_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P08322_n1012TipMaqDsc[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h8320( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 30, Gx_line+10, 84, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A607MaqEst, "@!")), 146, Gx_line+10, 200, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A619MaqTinTip, "")), 204, Gx_line+10, 258, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A625MaqVolMin), "ZZZZ9")), 262, Gx_line+10, 316, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A624MaqVolMed), "ZZZZ9")), 320, Gx_line+10, 374, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2802MaqVolTop), "ZZZZ9")), 378, Gx_line+10, 432, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2801MaqVolRes), "ZZZZ9")), 436, Gx_line+10, 491, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99")), 495, Gx_line+10, 550, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4284MaqKgsMed, "ZZZZZ9.99")), 554, Gx_line+10, 609, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99")), 613, Gx_line+10, 668, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1011TipMaqCod, "")), 672, Gx_line+10, 727, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1012TipMaqDsc, "")), 731, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
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
      if ( GXutil.strcmp(AV31Session.getValue("TMAQUI1WWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMAQUI1WWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("TMAQUI1WWGridState"), null, null);
      }
      AV10OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV162GXV1 = 1 ;
      while ( AV162GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV162GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV108FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV35TFMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV36TFMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV37TFMaqDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV38TFMaqDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST") == 0 )
         {
            AV49TFMaqEst = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST_SEL") == 0 )
         {
            AV50TFMaqEst_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP") == 0 )
         {
            AV115TFMaqTinTip = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP_SEL") == 0 )
         {
            AV116TFMaqTinTip_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMIN") == 0 )
         {
            AV117TFMaqVolMin = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV118TFMaqVolMin_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMED") == 0 )
         {
            AV119TFMaqVolMed = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV120TFMaqVolMed_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLTOP") == 0 )
         {
            AV121TFMaqVolTop = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV122TFMaqVolTop_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLRES") == 0 )
         {
            AV123TFMaqVolRes = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV124TFMaqVolRes_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMAX") == 0 )
         {
            AV67TFMaqKgsMax = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV68TFMaqKgsMax_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMED") == 0 )
         {
            AV65TFMaqKgsMed = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFMaqKgsMed_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMIN") == 0 )
         {
            AV63TFMaqKgsMin = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFMaqKgsMin_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV57TFTipMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV58TFTipMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV59TFTipMaqDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV60TFTipMaqDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV162GXV1 = (int)(AV162GXV1+1) ;
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

   public void h8320( boolean bFoot ,
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
               AV97PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV93DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV100Title = AV131Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV100Title = "" ;
      AV108FilterFullText = "" ;
      AV36TFMaqCod_Sel = "" ;
      AV35TFMaqCod = "" ;
      AV38TFMaqDsc_Sel = "" ;
      AV37TFMaqDsc = "" ;
      AV50TFMaqEst_Sel = "" ;
      AV49TFMaqEst = "" ;
      AV116TFMaqTinTip_Sel = "" ;
      AV115TFMaqTinTip = "" ;
      AV125TFMaqVolMin_To_Description = "" ;
      AV126TFMaqVolMed_To_Description = "" ;
      AV127TFMaqVolTop_To_Description = "" ;
      AV128TFMaqVolRes_To_Description = "" ;
      AV67TFMaqKgsMax = DecimalUtil.ZERO ;
      AV68TFMaqKgsMax_To = DecimalUtil.ZERO ;
      AV86TFMaqKgsMax_To_Description = "" ;
      AV65TFMaqKgsMed = DecimalUtil.ZERO ;
      AV66TFMaqKgsMed_To = DecimalUtil.ZERO ;
      AV85TFMaqKgsMed_To_Description = "" ;
      AV63TFMaqKgsMin = DecimalUtil.ZERO ;
      AV64TFMaqKgsMin_To = DecimalUtil.ZERO ;
      AV84TFMaqKgsMin_To_Description = "" ;
      AV58TFTipMaqCod_Sel = "" ;
      AV57TFTipMaqCod = "" ;
      AV60TFTipMaqDsc_Sel = "" ;
      AV59TFTipMaqDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A607MaqEst = "" ;
      A619MaqTinTip = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      AV135Tmaqui1wwds_1_filterfulltext = "" ;
      AV136Tmaqui1wwds_2_tfmaqcod = "" ;
      AV137Tmaqui1wwds_3_tfmaqcod_sel = "" ;
      AV138Tmaqui1wwds_4_tfmaqdsc = "" ;
      AV139Tmaqui1wwds_5_tfmaqdsc_sel = "" ;
      AV140Tmaqui1wwds_6_tfmaqest = "" ;
      AV141Tmaqui1wwds_7_tfmaqest_sel = "" ;
      AV142Tmaqui1wwds_8_tfmaqtintip = "" ;
      AV143Tmaqui1wwds_9_tfmaqtintip_sel = "" ;
      AV152Tmaqui1wwds_18_tfmaqkgsmax = DecimalUtil.ZERO ;
      AV153Tmaqui1wwds_19_tfmaqkgsmax_to = DecimalUtil.ZERO ;
      AV154Tmaqui1wwds_20_tfmaqkgsmed = DecimalUtil.ZERO ;
      AV155Tmaqui1wwds_21_tfmaqkgsmed_to = DecimalUtil.ZERO ;
      AV156Tmaqui1wwds_22_tfmaqkgsmin = DecimalUtil.ZERO ;
      AV157Tmaqui1wwds_23_tfmaqkgsmin_to = DecimalUtil.ZERO ;
      AV158Tmaqui1wwds_24_tftipmaqcod = "" ;
      AV159Tmaqui1wwds_25_tftipmaqcod_sel = "" ;
      AV160Tmaqui1wwds_26_tftipmaqdsc = "" ;
      AV161Tmaqui1wwds_27_tftipmaqdsc_sel = "" ;
      scmdbuf = "" ;
      lV135Tmaqui1wwds_1_filterfulltext = "" ;
      lV136Tmaqui1wwds_2_tfmaqcod = "" ;
      lV138Tmaqui1wwds_4_tfmaqdsc = "" ;
      lV140Tmaqui1wwds_6_tfmaqest = "" ;
      lV142Tmaqui1wwds_8_tfmaqtintip = "" ;
      lV158Tmaqui1wwds_24_tftipmaqcod = "" ;
      lV160Tmaqui1wwds_26_tftipmaqdsc = "" ;
      P08322_A396EmprCod = new String[] {""} ;
      P08322_A1012TipMaqDsc = new String[] {""} ;
      P08322_n1012TipMaqDsc = new boolean[] {false} ;
      P08322_A1011TipMaqCod = new String[] {""} ;
      P08322_n1011TipMaqCod = new boolean[] {false} ;
      P08322_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08322_n4283MaqKgsMin = new boolean[] {false} ;
      P08322_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08322_n4284MaqKgsMed = new boolean[] {false} ;
      P08322_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08322_n4285MaqKgsMax = new boolean[] {false} ;
      P08322_A2801MaqVolRes = new int[1] ;
      P08322_n2801MaqVolRes = new boolean[] {false} ;
      P08322_A2802MaqVolTop = new int[1] ;
      P08322_n2802MaqVolTop = new boolean[] {false} ;
      P08322_A624MaqVolMed = new int[1] ;
      P08322_n624MaqVolMed = new boolean[] {false} ;
      P08322_A625MaqVolMin = new int[1] ;
      P08322_n625MaqVolMin = new boolean[] {false} ;
      P08322_A619MaqTinTip = new String[] {""} ;
      P08322_n619MaqTinTip = new boolean[] {false} ;
      P08322_A607MaqEst = new String[] {""} ;
      P08322_n607MaqEst = new boolean[] {false} ;
      P08322_A606MaqDsc = new String[] {""} ;
      P08322_n606MaqDsc = new boolean[] {false} ;
      P08322_A602MaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV97PageInfo = "" ;
      AV93DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV131Pgmdesc = "" ;
      AV110AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqui1wwexportreport__default(),
         new Object[] {
             new Object[] {
            P08322_A396EmprCod, P08322_A1012TipMaqDsc, P08322_n1012TipMaqDsc, P08322_A1011TipMaqCod, P08322_n1011TipMaqCod, P08322_A4283MaqKgsMin, P08322_n4283MaqKgsMin, P08322_A4284MaqKgsMed, P08322_n4284MaqKgsMed, P08322_A4285MaqKgsMax,
            P08322_n4285MaqKgsMax, P08322_A2801MaqVolRes, P08322_n2801MaqVolRes, P08322_A2802MaqVolTop, P08322_n2802MaqVolTop, P08322_A624MaqVolMed, P08322_n624MaqVolMed, P08322_A625MaqVolMin, P08322_n625MaqVolMin, P08322_A619MaqTinTip,
            P08322_n619MaqTinTip, P08322_A607MaqEst, P08322_n607MaqEst, P08322_A606MaqDsc, P08322_n606MaqDsc, P08322_A602MaqCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV131Pgmdesc = httpContext.getMessage( "TMAQUI1 WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV131Pgmdesc = httpContext.getMessage( "TMAQUI1 WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV117TFMaqVolMin ;
   private int AV118TFMaqVolMin_To ;
   private int AV119TFMaqVolMed ;
   private int AV120TFMaqVolMed_To ;
   private int AV121TFMaqVolTop ;
   private int AV122TFMaqVolTop_To ;
   private int AV123TFMaqVolRes ;
   private int AV124TFMaqVolRes_To ;
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int A2802MaqVolTop ;
   private int A2801MaqVolRes ;
   private int AV144Tmaqui1wwds_10_tfmaqvolmin ;
   private int AV145Tmaqui1wwds_11_tfmaqvolmin_to ;
   private int AV146Tmaqui1wwds_12_tfmaqvolmed ;
   private int AV147Tmaqui1wwds_13_tfmaqvolmed_to ;
   private int AV148Tmaqui1wwds_14_tfmaqvoltop ;
   private int AV149Tmaqui1wwds_15_tfmaqvoltop_to ;
   private int AV150Tmaqui1wwds_16_tfmaqvolres ;
   private int AV151Tmaqui1wwds_17_tfmaqvolres_to ;
   private int AV162GXV1 ;
   private java.math.BigDecimal AV67TFMaqKgsMax ;
   private java.math.BigDecimal AV68TFMaqKgsMax_To ;
   private java.math.BigDecimal AV65TFMaqKgsMed ;
   private java.math.BigDecimal AV66TFMaqKgsMed_To ;
   private java.math.BigDecimal AV63TFMaqKgsMin ;
   private java.math.BigDecimal AV64TFMaqKgsMin_To ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal AV152Tmaqui1wwds_18_tfmaqkgsmax ;
   private java.math.BigDecimal AV153Tmaqui1wwds_19_tfmaqkgsmax_to ;
   private java.math.BigDecimal AV154Tmaqui1wwds_20_tfmaqkgsmed ;
   private java.math.BigDecimal AV155Tmaqui1wwds_21_tfmaqkgsmed_to ;
   private java.math.BigDecimal AV156Tmaqui1wwds_22_tfmaqkgsmin ;
   private java.math.BigDecimal AV157Tmaqui1wwds_23_tfmaqkgsmin_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV36TFMaqCod_Sel ;
   private String AV35TFMaqCod ;
   private String AV38TFMaqDsc_Sel ;
   private String AV37TFMaqDsc ;
   private String AV50TFMaqEst_Sel ;
   private String AV49TFMaqEst ;
   private String AV116TFMaqTinTip_Sel ;
   private String AV115TFMaqTinTip ;
   private String AV58TFTipMaqCod_Sel ;
   private String AV57TFTipMaqCod ;
   private String AV60TFTipMaqDsc_Sel ;
   private String AV59TFTipMaqDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A607MaqEst ;
   private String A619MaqTinTip ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String AV136Tmaqui1wwds_2_tfmaqcod ;
   private String AV137Tmaqui1wwds_3_tfmaqcod_sel ;
   private String AV138Tmaqui1wwds_4_tfmaqdsc ;
   private String AV139Tmaqui1wwds_5_tfmaqdsc_sel ;
   private String AV140Tmaqui1wwds_6_tfmaqest ;
   private String AV141Tmaqui1wwds_7_tfmaqest_sel ;
   private String AV142Tmaqui1wwds_8_tfmaqtintip ;
   private String AV143Tmaqui1wwds_9_tfmaqtintip_sel ;
   private String AV158Tmaqui1wwds_24_tftipmaqcod ;
   private String AV159Tmaqui1wwds_25_tftipmaqcod_sel ;
   private String AV160Tmaqui1wwds_26_tftipmaqdsc ;
   private String AV161Tmaqui1wwds_27_tftipmaqdsc_sel ;
   private String scmdbuf ;
   private String lV136Tmaqui1wwds_2_tfmaqcod ;
   private String lV138Tmaqui1wwds_4_tfmaqdsc ;
   private String lV140Tmaqui1wwds_6_tfmaqest ;
   private String lV142Tmaqui1wwds_8_tfmaqtintip ;
   private String lV158Tmaqui1wwds_24_tftipmaqcod ;
   private String lV160Tmaqui1wwds_26_tftipmaqdsc ;
   private String A396EmprCod ;
   private String AV131Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n1012TipMaqDsc ;
   private boolean n1011TipMaqCod ;
   private boolean n4283MaqKgsMin ;
   private boolean n4284MaqKgsMed ;
   private boolean n4285MaqKgsMax ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private boolean n624MaqVolMed ;
   private boolean n625MaqVolMin ;
   private boolean n619MaqTinTip ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private String AV100Title ;
   private String AV108FilterFullText ;
   private String AV125TFMaqVolMin_To_Description ;
   private String AV126TFMaqVolMed_To_Description ;
   private String AV127TFMaqVolTop_To_Description ;
   private String AV128TFMaqVolRes_To_Description ;
   private String AV86TFMaqKgsMax_To_Description ;
   private String AV85TFMaqKgsMed_To_Description ;
   private String AV84TFMaqKgsMin_To_Description ;
   private String AV135Tmaqui1wwds_1_filterfulltext ;
   private String lV135Tmaqui1wwds_1_filterfulltext ;
   private String AV97PageInfo ;
   private String AV93DateInfo ;
   private String AV110AppName ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08322_A396EmprCod ;
   private String[] P08322_A1012TipMaqDsc ;
   private boolean[] P08322_n1012TipMaqDsc ;
   private String[] P08322_A1011TipMaqCod ;
   private boolean[] P08322_n1011TipMaqCod ;
   private java.math.BigDecimal[] P08322_A4283MaqKgsMin ;
   private boolean[] P08322_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P08322_A4284MaqKgsMed ;
   private boolean[] P08322_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P08322_A4285MaqKgsMax ;
   private boolean[] P08322_n4285MaqKgsMax ;
   private int[] P08322_A2801MaqVolRes ;
   private boolean[] P08322_n2801MaqVolRes ;
   private int[] P08322_A2802MaqVolTop ;
   private boolean[] P08322_n2802MaqVolTop ;
   private int[] P08322_A624MaqVolMed ;
   private boolean[] P08322_n624MaqVolMed ;
   private int[] P08322_A625MaqVolMin ;
   private boolean[] P08322_n625MaqVolMin ;
   private String[] P08322_A619MaqTinTip ;
   private boolean[] P08322_n619MaqTinTip ;
   private String[] P08322_A607MaqEst ;
   private boolean[] P08322_n607MaqEst ;
   private String[] P08322_A606MaqDsc ;
   private boolean[] P08322_n606MaqDsc ;
   private String[] P08322_A602MaqCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tmaqui1wwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08322( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV135Tmaqui1wwds_1_filterfulltext ,
                                          String AV137Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV136Tmaqui1wwds_2_tfmaqcod ,
                                          String AV139Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV138Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV141Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV140Tmaqui1wwds_6_tfmaqest ,
                                          String AV143Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV142Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV144Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV145Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV146Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV147Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV148Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV149Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV150Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV151Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV152Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV153Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV154Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV155Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV156Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV157Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV159Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV158Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV161Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV160Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[39];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqTinTip, T1.MaqEst," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV135Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV138Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV140Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV142Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV144Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV145Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV146Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV147Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV148Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV149Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV150Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV151Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV154Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV158Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV160Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqEst" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqEst DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqTinTip" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqTinTip DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolMin" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolMin DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolMed" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolMed DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolTop" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolTop DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolRes" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolRes DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMax" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMax DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMed" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMed DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMin" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqKgsMin DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipMaqCod" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipMaqCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipMaqDsc" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipMaqDsc DESC" ;
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
                  return conditional_P08322(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08322", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               return;
      }
   }

}

