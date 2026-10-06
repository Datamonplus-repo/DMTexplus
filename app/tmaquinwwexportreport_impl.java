package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaquinwwexportreport_impl extends GXWebReport
{
   public tmaquinwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV61Title = httpContext.getMessage( "Lista de MANTENIMIENTO DE MAQUINAS", "") ;
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
         hA7X0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV12FilterFullText)==0) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFMaqCod_Sel)==0) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("", 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFMaqCod_Sel, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFMaqCod)==0) )
         {
            hA7X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("", 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFMaqCod, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFMaqDsc_Sel)==0) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("", 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFMaqDsc_Sel, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFMaqDsc)==0) )
         {
            hA7X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("", 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFMaqDsc, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV22TFMaqTinTip_Sel)==0) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo Maquina", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFMaqTinTip_Sel, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFMaqTinTip)==0) )
         {
            hA7X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Maquina", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFMaqTinTip, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV23TFMaqVolMax) && (0==AV24TFMaqVolMax_To) ) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Volumen Maximo", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFMaqVolMax), "ZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFMaqVolMax_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Volumen Maximo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFMaqVolMax_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFMaqVolMax_To), "ZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV25TFMaqVolMin) && (0==AV26TFMaqVolMin_To) ) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Volumen Minimo", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFMaqVolMin), "ZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV44TFMaqVolMin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Volumen Minimo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFMaqVolMin_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFMaqVolMin_To), "ZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV27TFMaqVolMed) && (0==AV28TFMaqVolMed_To) ) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Volumen Medio", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFMaqVolMed), "ZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV45TFMaqVolMed_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Volumen Medio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFMaqVolMed_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFMaqVolMed_To), "ZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV29TFMaqVolTop) && (0==AV30TFMaqVolTop_To) ) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Volumen Baño", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TFMaqVolTop), "ZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV46TFMaqVolTop_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Volumen Baño", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFMaqVolTop_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFMaqVolTop_To), "ZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV31TFMaqVolRes) && (0==AV32TFMaqVolRes_To) ) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Volumen Residual", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TFMaqVolRes), "ZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV47TFMaqVolRes_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Volumen Residual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFMaqVolRes_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TFMaqVolRes_To), "ZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFMaqKgsMax)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFMaqKgsMax_To)==0) ) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kilos Maximos", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TFMaqKgsMax, "ZZZZZ9.99")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFMaqKgsMax_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kilos Maximos", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFMaqKgsMax_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TFMaqKgsMax_To, "ZZZZZ9.99")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFMaqKgsMed)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFMaqKgsMed_To)==0) ) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kilos Medios", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFMaqKgsMed, "ZZZZZ9.99")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFMaqKgsMed_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kilos Medios", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFMaqKgsMed_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TFMaqKgsMed_To, "ZZZZZ9.99")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFMaqKgsMin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFMaqKgsMin_To)==0) ) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kilos Minimos", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37TFMaqKgsMin, "ZZZZZ9.99")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV50TFMaqKgsMin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kilos Minimos", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFMaqKgsMin_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TFMaqKgsMin_To, "ZZZZZ9.99")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFTipMaqCod_Sel)==0) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Máquina", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFTipMaqCod_Sel, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV39TFTipMaqCod)==0) )
         {
            hA7X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Máquina", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFTipMaqCod, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV42TFTipMaqDsc_Sel)==0) )
      {
         hA7X0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFTipMaqDsc_Sel, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV41TFTipMaqDsc)==0) )
         {
            hA7X0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFTipMaqDsc, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA7X0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA7X0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("", 30, Gx_line+10, 84, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText("", 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo Maquina", ""), 146, Gx_line+10, 200, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Volumen Maximo", ""), 204, Gx_line+10, 258, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Volumen Minimo", ""), 262, Gx_line+10, 316, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Volumen Medio", ""), 320, Gx_line+10, 374, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Volumen Baño", ""), 378, Gx_line+10, 432, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Volumen Residual", ""), 436, Gx_line+10, 491, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos Maximos", ""), 495, Gx_line+10, 550, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos Medios", ""), 554, Gx_line+10, 609, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos Minimos", ""), 613, Gx_line+10, 668, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo de Máquina", ""), 672, Gx_line+10, 727, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 731, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV69Tmaquinwwds_1_filterfulltext = AV12FilterFullText ;
      AV70Tmaquinwwds_2_tfmaqcod = AV17TFMaqCod ;
      AV71Tmaquinwwds_3_tfmaqcod_sel = AV18TFMaqCod_Sel ;
      AV72Tmaquinwwds_4_tfmaqdsc = AV19TFMaqDsc ;
      AV73Tmaquinwwds_5_tfmaqdsc_sel = AV20TFMaqDsc_Sel ;
      AV74Tmaquinwwds_6_tfmaqtintip = AV21TFMaqTinTip ;
      AV75Tmaquinwwds_7_tfmaqtintip_sel = AV22TFMaqTinTip_Sel ;
      AV76Tmaquinwwds_8_tfmaqvolmax = AV23TFMaqVolMax ;
      AV77Tmaquinwwds_9_tfmaqvolmax_to = AV24TFMaqVolMax_To ;
      AV78Tmaquinwwds_10_tfmaqvolmin = AV25TFMaqVolMin ;
      AV79Tmaquinwwds_11_tfmaqvolmin_to = AV26TFMaqVolMin_To ;
      AV80Tmaquinwwds_12_tfmaqvolmed = AV27TFMaqVolMed ;
      AV81Tmaquinwwds_13_tfmaqvolmed_to = AV28TFMaqVolMed_To ;
      AV82Tmaquinwwds_14_tfmaqvoltop = AV29TFMaqVolTop ;
      AV83Tmaquinwwds_15_tfmaqvoltop_to = AV30TFMaqVolTop_To ;
      AV84Tmaquinwwds_16_tfmaqvolres = AV31TFMaqVolRes ;
      AV85Tmaquinwwds_17_tfmaqvolres_to = AV32TFMaqVolRes_To ;
      AV86Tmaquinwwds_18_tfmaqkgsmax = AV33TFMaqKgsMax ;
      AV87Tmaquinwwds_19_tfmaqkgsmax_to = AV34TFMaqKgsMax_To ;
      AV88Tmaquinwwds_20_tfmaqkgsmed = AV35TFMaqKgsMed ;
      AV89Tmaquinwwds_21_tfmaqkgsmed_to = AV36TFMaqKgsMed_To ;
      AV90Tmaquinwwds_22_tfmaqkgsmin = AV37TFMaqKgsMin ;
      AV91Tmaquinwwds_23_tfmaqkgsmin_to = AV38TFMaqKgsMin_To ;
      AV92Tmaquinwwds_24_tftipmaqcod = AV39TFTipMaqCod ;
      AV93Tmaquinwwds_25_tftipmaqcod_sel = AV40TFTipMaqCod_Sel ;
      AV94Tmaquinwwds_26_tftipmaqdsc = AV41TFTipMaqDsc ;
      AV95Tmaquinwwds_27_tftipmaqdsc_sel = AV42TFTipMaqDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Tmaquinwwds_1_filterfulltext ,
                                           AV71Tmaquinwwds_3_tfmaqcod_sel ,
                                           AV70Tmaquinwwds_2_tfmaqcod ,
                                           AV73Tmaquinwwds_5_tfmaqdsc_sel ,
                                           AV72Tmaquinwwds_4_tfmaqdsc ,
                                           AV75Tmaquinwwds_7_tfmaqtintip_sel ,
                                           AV74Tmaquinwwds_6_tfmaqtintip ,
                                           Integer.valueOf(AV76Tmaquinwwds_8_tfmaqvolmax) ,
                                           Integer.valueOf(AV77Tmaquinwwds_9_tfmaqvolmax_to) ,
                                           Integer.valueOf(AV78Tmaquinwwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV79Tmaquinwwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV80Tmaquinwwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV81Tmaquinwwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV82Tmaquinwwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV83Tmaquinwwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV84Tmaquinwwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV85Tmaquinwwds_17_tfmaqvolres_to) ,
                                           AV86Tmaquinwwds_18_tfmaqkgsmax ,
                                           AV87Tmaquinwwds_19_tfmaqkgsmax_to ,
                                           AV88Tmaquinwwds_20_tfmaqkgsmed ,
                                           AV89Tmaquinwwds_21_tfmaqkgsmed_to ,
                                           AV90Tmaquinwwds_22_tfmaqkgsmin ,
                                           AV91Tmaquinwwds_23_tfmaqkgsmin_to ,
                                           AV93Tmaquinwwds_25_tftipmaqcod_sel ,
                                           AV92Tmaquinwwds_24_tftipmaqcod ,
                                           AV95Tmaquinwwds_27_tftipmaqdsc_sel ,
                                           AV94Tmaquinwwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A623MaqVolMax) ,
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
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV69Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV70Tmaquinwwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV70Tmaquinwwds_2_tfmaqcod), 6, "%") ;
      lV72Tmaquinwwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV72Tmaquinwwds_4_tfmaqdsc), 16, "%") ;
      lV74Tmaquinwwds_6_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV74Tmaquinwwds_6_tfmaqtintip), 2, "%") ;
      lV92Tmaquinwwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV92Tmaquinwwds_24_tftipmaqcod), 4, "%") ;
      lV94Tmaquinwwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV94Tmaquinwwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor P0A7X2 */
      pr_default.execute(0, new Object[] {lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV69Tmaquinwwds_1_filterfulltext, lV70Tmaquinwwds_2_tfmaqcod, AV71Tmaquinwwds_3_tfmaqcod_sel, lV72Tmaquinwwds_4_tfmaqdsc, AV73Tmaquinwwds_5_tfmaqdsc_sel, lV74Tmaquinwwds_6_tfmaqtintip, AV75Tmaquinwwds_7_tfmaqtintip_sel, Integer.valueOf(AV76Tmaquinwwds_8_tfmaqvolmax), Integer.valueOf(AV77Tmaquinwwds_9_tfmaqvolmax_to), Integer.valueOf(AV78Tmaquinwwds_10_tfmaqvolmin), Integer.valueOf(AV79Tmaquinwwds_11_tfmaqvolmin_to), Integer.valueOf(AV80Tmaquinwwds_12_tfmaqvolmed), Integer.valueOf(AV81Tmaquinwwds_13_tfmaqvolmed_to), Integer.valueOf(AV82Tmaquinwwds_14_tfmaqvoltop), Integer.valueOf(AV83Tmaquinwwds_15_tfmaqvoltop_to), Integer.valueOf(AV84Tmaquinwwds_16_tfmaqvolres), Integer.valueOf(AV85Tmaquinwwds_17_tfmaqvolres_to), AV86Tmaquinwwds_18_tfmaqkgsmax, AV87Tmaquinwwds_19_tfmaqkgsmax_to, AV88Tmaquinwwds_20_tfmaqkgsmed, AV89Tmaquinwwds_21_tfmaqkgsmed_to, AV90Tmaquinwwds_22_tfmaqkgsmin, AV91Tmaquinwwds_23_tfmaqkgsmin_to, lV92Tmaquinwwds_24_tftipmaqcod, AV93Tmaquinwwds_25_tftipmaqcod_sel, lV94Tmaquinwwds_26_tftipmaqdsc, AV95Tmaquinwwds_27_tftipmaqdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A7X2_A396EmprCod[0] ;
         A1012TipMaqDsc = P0A7X2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7X2_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P0A7X2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0A7X2_n1011TipMaqCod[0] ;
         A4283MaqKgsMin = P0A7X2_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = P0A7X2_n4283MaqKgsMin[0] ;
         A4284MaqKgsMed = P0A7X2_A4284MaqKgsMed[0] ;
         n4284MaqKgsMed = P0A7X2_n4284MaqKgsMed[0] ;
         A4285MaqKgsMax = P0A7X2_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = P0A7X2_n4285MaqKgsMax[0] ;
         A2801MaqVolRes = P0A7X2_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P0A7X2_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P0A7X2_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P0A7X2_n2802MaqVolTop[0] ;
         A624MaqVolMed = P0A7X2_A624MaqVolMed[0] ;
         n624MaqVolMed = P0A7X2_n624MaqVolMed[0] ;
         A625MaqVolMin = P0A7X2_A625MaqVolMin[0] ;
         n625MaqVolMin = P0A7X2_n625MaqVolMin[0] ;
         A623MaqVolMax = P0A7X2_A623MaqVolMax[0] ;
         n623MaqVolMax = P0A7X2_n623MaqVolMax[0] ;
         A619MaqTinTip = P0A7X2_A619MaqTinTip[0] ;
         n619MaqTinTip = P0A7X2_n619MaqTinTip[0] ;
         A606MaqDsc = P0A7X2_A606MaqDsc[0] ;
         n606MaqDsc = P0A7X2_n606MaqDsc[0] ;
         A602MaqCod = P0A7X2_A602MaqCod[0] ;
         A1012TipMaqDsc = P0A7X2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A7X2_n1012TipMaqDsc[0] ;
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
         hA7X0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 30, Gx_line+10, 84, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A606MaqDsc, "")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A619MaqTinTip, "")), 146, Gx_line+10, 200, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A623MaqVolMax), "ZZZZ9")), 204, Gx_line+10, 258, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("TMAQUINWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMAQUINWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("TMAQUINWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV96GXV1 = 1 ;
      while ( AV96GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV96GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV17TFMaqCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV18TFMaqCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV19TFMaqDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV20TFMaqDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP") == 0 )
         {
            AV21TFMaqTinTip = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP_SEL") == 0 )
         {
            AV22TFMaqTinTip_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMAX") == 0 )
         {
            AV23TFMaqVolMax = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFMaqVolMax_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMIN") == 0 )
         {
            AV25TFMaqVolMin = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV26TFMaqVolMin_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMED") == 0 )
         {
            AV27TFMaqVolMed = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV28TFMaqVolMed_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLTOP") == 0 )
         {
            AV29TFMaqVolTop = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV30TFMaqVolTop_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLRES") == 0 )
         {
            AV31TFMaqVolRes = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV32TFMaqVolRes_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMAX") == 0 )
         {
            AV33TFMaqKgsMax = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV34TFMaqKgsMax_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMED") == 0 )
         {
            AV35TFMaqKgsMed = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV36TFMaqKgsMed_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMIN") == 0 )
         {
            AV37TFMaqKgsMin = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV38TFMaqKgsMin_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV39TFTipMaqCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV40TFTipMaqCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV41TFTipMaqDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV42TFTipMaqDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV96GXV1 = (int)(AV96GXV1+1) ;
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

   public void hA7X0( boolean bFoot ,
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
               AV59PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV56DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV61Title = AV65Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV61Title = "" ;
      AV12FilterFullText = "" ;
      AV18TFMaqCod_Sel = "" ;
      AV17TFMaqCod = "" ;
      AV20TFMaqDsc_Sel = "" ;
      AV19TFMaqDsc = "" ;
      AV22TFMaqTinTip_Sel = "" ;
      AV21TFMaqTinTip = "" ;
      AV43TFMaqVolMax_To_Description = "" ;
      AV44TFMaqVolMin_To_Description = "" ;
      AV45TFMaqVolMed_To_Description = "" ;
      AV46TFMaqVolTop_To_Description = "" ;
      AV47TFMaqVolRes_To_Description = "" ;
      AV33TFMaqKgsMax = DecimalUtil.ZERO ;
      AV34TFMaqKgsMax_To = DecimalUtil.ZERO ;
      AV48TFMaqKgsMax_To_Description = "" ;
      AV35TFMaqKgsMed = DecimalUtil.ZERO ;
      AV36TFMaqKgsMed_To = DecimalUtil.ZERO ;
      AV49TFMaqKgsMed_To_Description = "" ;
      AV37TFMaqKgsMin = DecimalUtil.ZERO ;
      AV38TFMaqKgsMin_To = DecimalUtil.ZERO ;
      AV50TFMaqKgsMin_To_Description = "" ;
      AV40TFTipMaqCod_Sel = "" ;
      AV39TFTipMaqCod = "" ;
      AV42TFTipMaqDsc_Sel = "" ;
      AV41TFTipMaqDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A619MaqTinTip = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      AV69Tmaquinwwds_1_filterfulltext = "" ;
      AV70Tmaquinwwds_2_tfmaqcod = "" ;
      AV71Tmaquinwwds_3_tfmaqcod_sel = "" ;
      AV72Tmaquinwwds_4_tfmaqdsc = "" ;
      AV73Tmaquinwwds_5_tfmaqdsc_sel = "" ;
      AV74Tmaquinwwds_6_tfmaqtintip = "" ;
      AV75Tmaquinwwds_7_tfmaqtintip_sel = "" ;
      AV86Tmaquinwwds_18_tfmaqkgsmax = DecimalUtil.ZERO ;
      AV87Tmaquinwwds_19_tfmaqkgsmax_to = DecimalUtil.ZERO ;
      AV88Tmaquinwwds_20_tfmaqkgsmed = DecimalUtil.ZERO ;
      AV89Tmaquinwwds_21_tfmaqkgsmed_to = DecimalUtil.ZERO ;
      AV90Tmaquinwwds_22_tfmaqkgsmin = DecimalUtil.ZERO ;
      AV91Tmaquinwwds_23_tfmaqkgsmin_to = DecimalUtil.ZERO ;
      AV92Tmaquinwwds_24_tftipmaqcod = "" ;
      AV93Tmaquinwwds_25_tftipmaqcod_sel = "" ;
      AV94Tmaquinwwds_26_tftipmaqdsc = "" ;
      AV95Tmaquinwwds_27_tftipmaqdsc_sel = "" ;
      scmdbuf = "" ;
      lV69Tmaquinwwds_1_filterfulltext = "" ;
      lV70Tmaquinwwds_2_tfmaqcod = "" ;
      lV72Tmaquinwwds_4_tfmaqdsc = "" ;
      lV74Tmaquinwwds_6_tfmaqtintip = "" ;
      lV92Tmaquinwwds_24_tftipmaqcod = "" ;
      lV94Tmaquinwwds_26_tftipmaqdsc = "" ;
      P0A7X2_A396EmprCod = new String[] {""} ;
      P0A7X2_A1012TipMaqDsc = new String[] {""} ;
      P0A7X2_n1012TipMaqDsc = new boolean[] {false} ;
      P0A7X2_A1011TipMaqCod = new String[] {""} ;
      P0A7X2_n1011TipMaqCod = new boolean[] {false} ;
      P0A7X2_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7X2_n4283MaqKgsMin = new boolean[] {false} ;
      P0A7X2_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7X2_n4284MaqKgsMed = new boolean[] {false} ;
      P0A7X2_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7X2_n4285MaqKgsMax = new boolean[] {false} ;
      P0A7X2_A2801MaqVolRes = new int[1] ;
      P0A7X2_n2801MaqVolRes = new boolean[] {false} ;
      P0A7X2_A2802MaqVolTop = new int[1] ;
      P0A7X2_n2802MaqVolTop = new boolean[] {false} ;
      P0A7X2_A624MaqVolMed = new int[1] ;
      P0A7X2_n624MaqVolMed = new boolean[] {false} ;
      P0A7X2_A625MaqVolMin = new int[1] ;
      P0A7X2_n625MaqVolMin = new boolean[] {false} ;
      P0A7X2_A623MaqVolMax = new int[1] ;
      P0A7X2_n623MaqVolMax = new boolean[] {false} ;
      P0A7X2_A619MaqTinTip = new String[] {""} ;
      P0A7X2_n619MaqTinTip = new boolean[] {false} ;
      P0A7X2_A606MaqDsc = new String[] {""} ;
      P0A7X2_n606MaqDsc = new boolean[] {false} ;
      P0A7X2_A602MaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV59PageInfo = "" ;
      AV56DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV65Pgmdesc = "" ;
      AV54AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaquinwwexportreport__default(),
         new Object[] {
             new Object[] {
            P0A7X2_A396EmprCod, P0A7X2_A1012TipMaqDsc, P0A7X2_n1012TipMaqDsc, P0A7X2_A1011TipMaqCod, P0A7X2_n1011TipMaqCod, P0A7X2_A4283MaqKgsMin, P0A7X2_n4283MaqKgsMin, P0A7X2_A4284MaqKgsMed, P0A7X2_n4284MaqKgsMed, P0A7X2_A4285MaqKgsMax,
            P0A7X2_n4285MaqKgsMax, P0A7X2_A2801MaqVolRes, P0A7X2_n2801MaqVolRes, P0A7X2_A2802MaqVolTop, P0A7X2_n2802MaqVolTop, P0A7X2_A624MaqVolMed, P0A7X2_n624MaqVolMed, P0A7X2_A625MaqVolMin, P0A7X2_n625MaqVolMin, P0A7X2_A623MaqVolMax,
            P0A7X2_n623MaqVolMax, P0A7X2_A619MaqTinTip, P0A7X2_n619MaqTinTip, P0A7X2_A606MaqDsc, P0A7X2_n606MaqDsc, P0A7X2_A602MaqCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV65Pgmdesc = httpContext.getMessage( "TMAQUINWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV65Pgmdesc = httpContext.getMessage( "TMAQUINWWExport Report", "") ;
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
   private int AV23TFMaqVolMax ;
   private int AV24TFMaqVolMax_To ;
   private int AV25TFMaqVolMin ;
   private int AV26TFMaqVolMin_To ;
   private int AV27TFMaqVolMed ;
   private int AV28TFMaqVolMed_To ;
   private int AV29TFMaqVolTop ;
   private int AV30TFMaqVolTop_To ;
   private int AV31TFMaqVolRes ;
   private int AV32TFMaqVolRes_To ;
   private int A623MaqVolMax ;
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int A2802MaqVolTop ;
   private int A2801MaqVolRes ;
   private int AV76Tmaquinwwds_8_tfmaqvolmax ;
   private int AV77Tmaquinwwds_9_tfmaqvolmax_to ;
   private int AV78Tmaquinwwds_10_tfmaqvolmin ;
   private int AV79Tmaquinwwds_11_tfmaqvolmin_to ;
   private int AV80Tmaquinwwds_12_tfmaqvolmed ;
   private int AV81Tmaquinwwds_13_tfmaqvolmed_to ;
   private int AV82Tmaquinwwds_14_tfmaqvoltop ;
   private int AV83Tmaquinwwds_15_tfmaqvoltop_to ;
   private int AV84Tmaquinwwds_16_tfmaqvolres ;
   private int AV85Tmaquinwwds_17_tfmaqvolres_to ;
   private int AV96GXV1 ;
   private java.math.BigDecimal AV33TFMaqKgsMax ;
   private java.math.BigDecimal AV34TFMaqKgsMax_To ;
   private java.math.BigDecimal AV35TFMaqKgsMed ;
   private java.math.BigDecimal AV36TFMaqKgsMed_To ;
   private java.math.BigDecimal AV37TFMaqKgsMin ;
   private java.math.BigDecimal AV38TFMaqKgsMin_To ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal AV86Tmaquinwwds_18_tfmaqkgsmax ;
   private java.math.BigDecimal AV87Tmaquinwwds_19_tfmaqkgsmax_to ;
   private java.math.BigDecimal AV88Tmaquinwwds_20_tfmaqkgsmed ;
   private java.math.BigDecimal AV89Tmaquinwwds_21_tfmaqkgsmed_to ;
   private java.math.BigDecimal AV90Tmaquinwwds_22_tfmaqkgsmin ;
   private java.math.BigDecimal AV91Tmaquinwwds_23_tfmaqkgsmin_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFMaqCod_Sel ;
   private String AV17TFMaqCod ;
   private String AV20TFMaqDsc_Sel ;
   private String AV19TFMaqDsc ;
   private String AV22TFMaqTinTip_Sel ;
   private String AV21TFMaqTinTip ;
   private String AV40TFTipMaqCod_Sel ;
   private String AV39TFTipMaqCod ;
   private String AV42TFTipMaqDsc_Sel ;
   private String AV41TFTipMaqDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A619MaqTinTip ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String AV70Tmaquinwwds_2_tfmaqcod ;
   private String AV71Tmaquinwwds_3_tfmaqcod_sel ;
   private String AV72Tmaquinwwds_4_tfmaqdsc ;
   private String AV73Tmaquinwwds_5_tfmaqdsc_sel ;
   private String AV74Tmaquinwwds_6_tfmaqtintip ;
   private String AV75Tmaquinwwds_7_tfmaqtintip_sel ;
   private String AV92Tmaquinwwds_24_tftipmaqcod ;
   private String AV93Tmaquinwwds_25_tftipmaqcod_sel ;
   private String AV94Tmaquinwwds_26_tftipmaqdsc ;
   private String AV95Tmaquinwwds_27_tftipmaqdsc_sel ;
   private String scmdbuf ;
   private String lV70Tmaquinwwds_2_tfmaqcod ;
   private String lV72Tmaquinwwds_4_tfmaqdsc ;
   private String lV74Tmaquinwwds_6_tfmaqtintip ;
   private String lV92Tmaquinwwds_24_tftipmaqcod ;
   private String lV94Tmaquinwwds_26_tftipmaqdsc ;
   private String A396EmprCod ;
   private String AV65Pgmdesc ;
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
   private boolean n623MaqVolMax ;
   private boolean n619MaqTinTip ;
   private boolean n606MaqDsc ;
   private String AV61Title ;
   private String AV12FilterFullText ;
   private String AV43TFMaqVolMax_To_Description ;
   private String AV44TFMaqVolMin_To_Description ;
   private String AV45TFMaqVolMed_To_Description ;
   private String AV46TFMaqVolTop_To_Description ;
   private String AV47TFMaqVolRes_To_Description ;
   private String AV48TFMaqKgsMax_To_Description ;
   private String AV49TFMaqKgsMed_To_Description ;
   private String AV50TFMaqKgsMin_To_Description ;
   private String AV69Tmaquinwwds_1_filterfulltext ;
   private String lV69Tmaquinwwds_1_filterfulltext ;
   private String AV59PageInfo ;
   private String AV56DateInfo ;
   private String AV54AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P0A7X2_A396EmprCod ;
   private String[] P0A7X2_A1012TipMaqDsc ;
   private boolean[] P0A7X2_n1012TipMaqDsc ;
   private String[] P0A7X2_A1011TipMaqCod ;
   private boolean[] P0A7X2_n1011TipMaqCod ;
   private java.math.BigDecimal[] P0A7X2_A4283MaqKgsMin ;
   private boolean[] P0A7X2_n4283MaqKgsMin ;
   private java.math.BigDecimal[] P0A7X2_A4284MaqKgsMed ;
   private boolean[] P0A7X2_n4284MaqKgsMed ;
   private java.math.BigDecimal[] P0A7X2_A4285MaqKgsMax ;
   private boolean[] P0A7X2_n4285MaqKgsMax ;
   private int[] P0A7X2_A2801MaqVolRes ;
   private boolean[] P0A7X2_n2801MaqVolRes ;
   private int[] P0A7X2_A2802MaqVolTop ;
   private boolean[] P0A7X2_n2802MaqVolTop ;
   private int[] P0A7X2_A624MaqVolMed ;
   private boolean[] P0A7X2_n624MaqVolMed ;
   private int[] P0A7X2_A625MaqVolMin ;
   private boolean[] P0A7X2_n625MaqVolMin ;
   private int[] P0A7X2_A623MaqVolMax ;
   private boolean[] P0A7X2_n623MaqVolMax ;
   private String[] P0A7X2_A619MaqTinTip ;
   private boolean[] P0A7X2_n619MaqTinTip ;
   private String[] P0A7X2_A606MaqDsc ;
   private boolean[] P0A7X2_n606MaqDsc ;
   private String[] P0A7X2_A602MaqCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class tmaquinwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A7X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Tmaquinwwds_1_filterfulltext ,
                                          String AV71Tmaquinwwds_3_tfmaqcod_sel ,
                                          String AV70Tmaquinwwds_2_tfmaqcod ,
                                          String AV73Tmaquinwwds_5_tfmaqdsc_sel ,
                                          String AV72Tmaquinwwds_4_tfmaqdsc ,
                                          String AV75Tmaquinwwds_7_tfmaqtintip_sel ,
                                          String AV74Tmaquinwwds_6_tfmaqtintip ,
                                          int AV76Tmaquinwwds_8_tfmaqvolmax ,
                                          int AV77Tmaquinwwds_9_tfmaqvolmax_to ,
                                          int AV78Tmaquinwwds_10_tfmaqvolmin ,
                                          int AV79Tmaquinwwds_11_tfmaqvolmin_to ,
                                          int AV80Tmaquinwwds_12_tfmaqvolmed ,
                                          int AV81Tmaquinwwds_13_tfmaqvolmed_to ,
                                          int AV82Tmaquinwwds_14_tfmaqvoltop ,
                                          int AV83Tmaquinwwds_15_tfmaqvoltop_to ,
                                          int AV84Tmaquinwwds_16_tfmaqvolres ,
                                          int AV85Tmaquinwwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV86Tmaquinwwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV87Tmaquinwwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV88Tmaquinwwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV89Tmaquinwwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV90Tmaquinwwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV91Tmaquinwwds_23_tfmaqkgsmin_to ,
                                          String AV93Tmaquinwwds_25_tftipmaqcod_sel ,
                                          String AV92Tmaquinwwds_24_tftipmaqcod ,
                                          String AV95Tmaquinwwds_27_tftipmaqdsc_sel ,
                                          String AV94Tmaquinwwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A619MaqTinTip ,
                                          int A623MaqVolMax ,
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
      scmdbuf = "SELECT T1.EmprCod, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqVolMax, T1.MaqTinTip," ;
      scmdbuf += " T1.MaqDsc, T1.MaqCod FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV69Tmaquinwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMax,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV71Tmaquinwwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV70Tmaquinwwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tmaquinwwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Tmaquinwwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Tmaquinwwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Tmaquinwwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Tmaquinwwds_7_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV74Tmaquinwwds_6_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Tmaquinwwds_7_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV76Tmaquinwwds_8_tfmaqvolmax) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmaquinwwds_9_tfmaqvolmax_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV78Tmaquinwwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV79Tmaquinwwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV80Tmaquinwwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV81Tmaquinwwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV82Tmaquinwwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV83Tmaquinwwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV84Tmaquinwwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV85Tmaquinwwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tmaquinwwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Tmaquinwwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Tmaquinwwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Tmaquinwwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Tmaquinwwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Tmaquinwwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Tmaquinwwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV92Tmaquinwwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Tmaquinwwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tmaquinwwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Tmaquinwwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tmaquinwwds_27_tftipmaqdsc_sel)==0) )
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
         scmdbuf += " ORDER BY T1.MaqTinTip" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqTinTip DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqVolMax" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqVolMax DESC" ;
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
                  return conditional_P0A7X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A7X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 2);
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
                  stmt.setString(sIdx, (String)parms[56], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
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

