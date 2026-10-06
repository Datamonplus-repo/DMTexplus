package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeformulas_wcexportreport_impl extends GXWebReport
{
   public listadodeformulas_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV183Title = httpContext.getMessage( "Lista de Mantenimiento de Formulas", "") ;
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
         h9DI0( true, 0) ;
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
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV21TFCliCod) && (0==AV22TFCliCod_To) ) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFCliCod), "ZZZZZ9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV141TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV141TFCliCod_To_Description, "")), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCliCod_To), "ZZZZZ9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFCliNom_Sel)==0) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFCliNom_Sel, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFCliNom)==0) )
         {
            h9DI0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFCliNom, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV26TFForSer_Sel)==0) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFForSer_Sel, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFForSer)==0) )
         {
            h9DI0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFForSer, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV28TFForSerDsc_Sel)==0) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFForSerDsc_Sel, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFForSerDsc)==0) )
         {
            h9DI0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFForSerDsc, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV97TFForTipArt) && (0==AV98TFForTipArt_To) ) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo Articulo", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV97TFForTipArt), "ZZZ9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV160TFForTipArt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tipo Articulo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV160TFForTipArt_To_Description, "")), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV98TFForTipArt_To), "ZZZ9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV197TFForTipArtDsc_Sel)==0) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV197TFForTipArtDsc_Sel, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV196TFForTipArtDsc)==0) )
         {
            h9DI0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV196TFForTipArtDsc, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV30TFForColNom_Sel)==0) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFForColNom_Sel, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFForColNom)==0) )
         {
            h9DI0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFForColNom, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV31TFForColNum) && (0==AV32TFForColNum_To) ) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TFForColNum), "ZZZZZ9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV142TFForColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV142TFForColNum_To_Description, "")), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TFForColNum_To), "ZZZZZ9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV33TFTipColCod) && (0==AV34TFTipColCod_To) ) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33TFTipColCod), "Z9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV143TFTipColCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "TC", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV143TFTipColCod_To_Description, "")), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34TFTipColCod_To), "Z9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFTipColDsc_Sel)==0) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFTipColDsc_Sel, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV35TFTipColDsc)==0) )
         {
            h9DI0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFTipColDsc, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV37TFIntCod) && (0==AV38TFIntCod_To) ) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFIntCod), "Z9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV144TFIntCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Intensidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV144TFIntCod_To_Description, "")), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38TFIntCod_To), "Z9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFIntDsc_Sel)==0) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFIntDsc_Sel, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV39TFIntDsc)==0) )
         {
            h9DI0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFIntDsc, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV49TFIntCodF) && (0==AV50TFIntCodF_To) ) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod. Int. Fact.", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TFIntCodF), "Z9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV147TFIntCodF_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod. Int. Fact.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147TFIntCodF_To_Description, "")), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TFIntCodF_To), "Z9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFIntDscF_Sel)==0) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Intensidad Fact.", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFIntDscF_Sel, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV51TFIntDscF)==0) )
         {
            h9DI0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Intensidad Fact.", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFIntDscF, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV79TFForNumCol) && (0==AV80TFForNumCol_To) ) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Interno F.", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV79TFForNumCol), "ZZZZZZZ9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV153TFForNumCol_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Interno F.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV153TFForNumCol_To_Description, "")), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV80TFForNumCol_To), "ZZZZZZZ9")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV203TFForBlo_Sels.fromJSonString(AV201TFForBlo_SelsJson, null);
      if ( ! ( AV203TFForBlo_Sels.size() == 0 ) )
      {
         AV205i = 1 ;
         AV211GXV1 = 1 ;
         while ( AV211GXV1 <= AV203TFForBlo_Sels.size() )
         {
            AV78TFForBlo_Sel = (String)AV203TFForBlo_Sels.elementAt(-1+AV211GXV1) ;
            if ( AV205i == 1 )
            {
               AV202TFForBlo_SelDscs = "" ;
            }
            else
            {
               AV202TFForBlo_SelDscs += ", " ;
            }
            AV204FilterTFForBlo_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV78TFForBlo_Sel), "N") == 0 )
            {
               AV204FilterTFForBlo_SelValueDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV78TFForBlo_Sel), "S") == 0 )
            {
               AV204FilterTFForBlo_SelValueDescription = httpContext.getMessage( "S", "") ;
            }
            AV202TFForBlo_SelDscs += AV204FilterTFForBlo_SelValueDescription ;
            AV205i = (long)(AV205i+1) ;
            AV211GXV1 = (int)(AV211GXV1+1) ;
         }
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Bloqueo Color?", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV202TFForBlo_SelDscs, "")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123TFForCosForm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124TFForCosForm_To)==0) ) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Coste Formula", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123TFForCosForm, "ZZZZ9.99999")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV169TFForCosForm_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Coste Formula", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV169TFForCosForm_To_Description, "")), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV124TFForCosForm_To, "ZZZZ9.99999")), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81TFForFec)) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Formula", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV81TFForFec, "99/99/99"), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87TFForUltMod)) )
      {
         h9DI0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ultima Modificacion", ""), 25, Gx_line+0, 140, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV87TFForUltMod, "99/99/99"), 140, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9DI0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9DI0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 66, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 70, Gx_line+10, 106, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 110, Gx_line+10, 146, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 150, Gx_line+10, 186, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo Articulo", ""), 190, Gx_line+10, 226, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 230, Gx_line+10, 266, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 270, Gx_line+10, 306, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 310, Gx_line+10, 346, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 350, Gx_line+10, 386, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 390, Gx_line+10, 426, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Intensidad", ""), 430, Gx_line+10, 466, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 470, Gx_line+10, 506, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod. Int. Fact.", ""), 510, Gx_line+10, 546, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Intensidad Fact.", ""), 550, Gx_line+10, 586, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Interno F.", ""), 590, Gx_line+10, 626, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Bloqueo Color?", ""), 630, Gx_line+10, 666, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Coste Formula", ""), 670, Gx_line+10, 706, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Formula", ""), 710, Gx_line+10, 746, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ultima Modificacion", ""), 750, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV12FilterFullText ;
      AV214Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV21TFCliCod ;
      AV215Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV22TFCliCod_To ;
      AV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV23TFCliNom ;
      AV217Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV24TFCliNom_Sel ;
      AV218Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV25TFForSer ;
      AV219Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV26TFForSer_Sel ;
      AV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV27TFForSerDsc ;
      AV221Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV28TFForSerDsc_Sel ;
      AV222Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV97TFForTipArt ;
      AV223Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV98TFForTipArt_To ;
      AV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV196TFForTipArtDsc ;
      AV225Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV197TFForTipArtDsc_Sel ;
      AV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV29TFForColNom ;
      AV227Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV30TFForColNom_Sel ;
      AV228Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV31TFForColNum ;
      AV229Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV32TFForColNum_To ;
      AV230Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV33TFTipColCod ;
      AV231Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV34TFTipColCod_To ;
      AV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV35TFTipColDsc ;
      AV233Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV36TFTipColDsc_Sel ;
      AV234Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV37TFIntCod ;
      AV235Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV38TFIntCod_To ;
      AV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV39TFIntDsc ;
      AV237Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV40TFIntDsc_Sel ;
      AV238Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV49TFIntCodF ;
      AV239Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV50TFIntCodF_To ;
      AV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV51TFIntDscF ;
      AV241Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV52TFIntDscF_Sel ;
      AV242Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV79TFForNumCol ;
      AV243Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV80TFForNumCol_To ;
      AV244Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV203TFForBlo_Sels ;
      AV245Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV123TFForCosForm ;
      AV246Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV124TFForCosForm_To ;
      AV247Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV81TFForFec ;
      AV248Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV87TFForUltMod ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV244Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV214Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV215Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV217Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV219Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV218Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV221Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV222Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV223Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV227Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV228Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV229Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV230Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV231Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV233Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV234Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV235Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV237Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV238Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV239Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV241Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV242Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV243Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV244Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV245Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV246Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV247Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV248Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV186Clicod) ,
                                           Integer.valueOf(AV187Clicod_to) ,
                                           AV188Forser ,
                                           AV189Forser_to ,
                                           AV192Forcolnom ,
                                           AV193Forcolnom_to ,
                                           Integer.valueOf(AV190Forcolnum) ,
                                           Integer.valueOf(AV191Forcolnum_to) ,
                                           Byte.valueOf(AV194Tipcolcod) ,
                                           Short.valueOf(AV195Tipcolcod_to) ,
                                           Integer.valueOf(AV198ForNumColfrom) ,
                                           Integer.valueOf(AV199ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV225Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A10045CliAct ,
                                           AV185Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV218Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV218Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DI2 */
      pr_default.execute(0, new Object[] {AV185Emprcod, AV225Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV225Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV225Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, Integer.valueOf(AV214Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV215Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV217Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV218Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV219Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV221Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV222Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV223Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV227Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV228Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV229Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV230Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV231Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV233Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV234Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV235Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV237Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV238Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV239Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV241Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV242Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV243Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV245Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV246Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV247Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV248Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV186Clicod), Integer.valueOf(AV187Clicod_to), AV188Forser, AV189Forser_to, AV192Forcolnom, AV193Forcolnom_to, Integer.valueOf(AV190Forcolnum), Integer.valueOf(AV191Forcolnum_to), Byte.valueOf(AV194Tipcolcod), Short.valueOf(AV195Tipcolcod_to), Integer.valueOf(AV198ForNumColfrom), Integer.valueOf(AV199ForNumColto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = P09DI2_A10045CliAct[0] ;
         A396EmprCod = P09DI2_A396EmprCod[0] ;
         A495ForUltMod = P09DI2_A495ForUltMod[0] ;
         n495ForUltMod = P09DI2_n495ForUltMod[0] ;
         A485ForFec = P09DI2_A485ForFec[0] ;
         n485ForFec = P09DI2_n485ForFec[0] ;
         A4380ForCosForm = P09DI2_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DI2_n4380ForCosForm[0] ;
         A486ForNumCol = P09DI2_A486ForNumCol[0] ;
         A5363IntDscF = P09DI2_A5363IntDscF[0] ;
         n5363IntDscF = P09DI2_n5363IntDscF[0] ;
         A5362IntCodF = P09DI2_A5362IntCodF[0] ;
         n5362IntCodF = P09DI2_n5362IntCodF[0] ;
         A584IntDsc = P09DI2_A584IntDsc[0] ;
         n584IntDsc = P09DI2_n584IntDsc[0] ;
         A583IntCod = P09DI2_A583IntCod[0] ;
         A832TipColDsc = P09DI2_A832TipColDsc[0] ;
         n832TipColDsc = P09DI2_n832TipColDsc[0] ;
         A831TipColCod = P09DI2_A831TipColCod[0] ;
         A483ForColNum = P09DI2_A483ForColNum[0] ;
         A482ForColNom = P09DI2_A482ForColNom[0] ;
         A4384ForTipArt = P09DI2_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DI2_n4384ForTipArt[0] ;
         A5742ForSerDsc = P09DI2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DI2_n5742ForSerDsc[0] ;
         A494ForSer = P09DI2_A494ForSer[0] ;
         A279CliNom = P09DI2_A279CliNom[0] ;
         A252CliCod = P09DI2_A252CliCod[0] ;
         A7781ForBlo = P09DI2_A7781ForBlo[0] ;
         n7781ForBlo = P09DI2_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DI2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DI2_n13929ForTipArtD[0] ;
         A5363IntDscF = P09DI2_A5363IntDscF[0] ;
         n5363IntDscF = P09DI2_n5363IntDscF[0] ;
         A584IntDsc = P09DI2_A584IntDsc[0] ;
         n584IntDsc = P09DI2_n584IntDsc[0] ;
         A832TipColDsc = P09DI2_A832TipColDsc[0] ;
         n832TipColDsc = P09DI2_n832TipColDsc[0] ;
         A13929ForTipArtD = P09DI2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DI2_n13929ForTipArtD[0] ;
         A10045CliAct = P09DI2_A10045CliAct[0] ;
         A279CliNom = P09DI2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV200ForBloDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A7781ForBlo), "N") == 0 )
            {
               AV200ForBloDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A7781ForBlo), "S") == 0 )
            {
               AV200ForBloDescription = httpContext.getMessage( "S", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
            h9DI0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 66, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 70, Gx_line+10, 106, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 110, Gx_line+10, 146, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), 150, Gx_line+10, 186, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4384ForTipArt), "ZZZ9")), 190, Gx_line+10, 226, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13929ForTipArtD, "")), 230, Gx_line+10, 266, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 270, Gx_line+10, 306, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 310, Gx_line+10, 346, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 350, Gx_line+10, 386, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 390, Gx_line+10, 426, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 430, Gx_line+10, 466, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A584IntDsc, "")), 470, Gx_line+10, 506, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5362IntCodF), "Z9")), 510, Gx_line+10, 546, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5363IntDscF, "")), 550, Gx_line+10, 586, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9")), 590, Gx_line+10, 626, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV200ForBloDescription, "")), 630, Gx_line+10, 666, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4380ForCosForm, "ZZZZ9.99999")), 670, Gx_line+10, 706, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A485ForFec, "99/99/99"), 710, Gx_line+10, 746, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A495ForUltMod, "99/99/99"), 750, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+36) ;
            /* Execute user subroutine: 'AFTERPRINTLINE' */
            S161 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
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
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue("FormulacionTinte.ListadodeFormulas_WCGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ListadodeFormulas_WCGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("FormulacionTinte.ListadodeFormulas_WCGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV249GXV2 = 1 ;
      while ( AV249GXV2 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV249GXV2));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV21TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV22TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV23TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV24TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV25TFForSer = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV26TFForSer_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV27TFForSerDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV28TFForSerDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPART") == 0 )
         {
            AV97TFForTipArt = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV98TFForTipArt_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC") == 0 )
         {
            AV196TFForTipArtDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC_SEL") == 0 )
         {
            AV197TFForTipArtDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV29TFForColNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV30TFForColNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV31TFForColNum = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV32TFForColNum_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV33TFTipColCod = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFTipColCod_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV35TFTipColDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV36TFTipColDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV37TFIntCod = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFIntCod_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV39TFIntDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV40TFIntDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCODF") == 0 )
         {
            AV49TFIntCodF = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFIntCodF_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF") == 0 )
         {
            AV51TFIntDscF = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF_SEL") == 0 )
         {
            AV52TFIntDscF_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV79TFForNumCol = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV80TFForNumCol_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV201TFForBlo_SelsJson = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV203TFForBlo_Sels.fromJSonString(AV201TFForBlo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOSFORM") == 0 )
         {
            AV123TFForCosForm = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV124TFForCosForm_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV81TFForFec = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTMOD") == 0 )
         {
            AV87TFForUltMod = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV185Emprcod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV186Clicod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV187Clicod_to = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV188Forser = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV189Forser_to = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV190Forcolnum = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV191Forcolnum_to = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV192Forcolnom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV193Forcolnom_to = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV194Tipcolcod = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV195Tipcolcod_to = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOLFROM") == 0 )
         {
            AV198ForNumColfrom = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOLTO") == 0 )
         {
            AV199ForNumColto = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV249GXV2 = (int)(AV249GXV2+1) ;
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

   public void h9DI0( boolean bFoot ,
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
               AV181PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV178DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV181PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV183Title = AV208Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV176AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV183Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV183Title = "" ;
      AV12FilterFullText = "" ;
      AV141TFCliCod_To_Description = "" ;
      AV24TFCliNom_Sel = "" ;
      AV23TFCliNom = "" ;
      AV26TFForSer_Sel = "" ;
      AV25TFForSer = "" ;
      AV28TFForSerDsc_Sel = "" ;
      AV27TFForSerDsc = "" ;
      AV160TFForTipArt_To_Description = "" ;
      AV197TFForTipArtDsc_Sel = "" ;
      AV196TFForTipArtDsc = "" ;
      AV30TFForColNom_Sel = "" ;
      AV29TFForColNom = "" ;
      AV142TFForColNum_To_Description = "" ;
      AV143TFTipColCod_To_Description = "" ;
      AV36TFTipColDsc_Sel = "" ;
      AV35TFTipColDsc = "" ;
      AV144TFIntCod_To_Description = "" ;
      AV40TFIntDsc_Sel = "" ;
      AV39TFIntDsc = "" ;
      AV147TFIntCodF_To_Description = "" ;
      AV52TFIntDscF_Sel = "" ;
      AV51TFIntDscF = "" ;
      AV153TFForNumCol_To_Description = "" ;
      AV203TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV201TFForBlo_SelsJson = "" ;
      AV78TFForBlo_Sel = "" ;
      AV202TFForBlo_SelDscs = "" ;
      AV204FilterTFForBlo_SelValueDescription = "" ;
      AV123TFForCosForm = DecimalUtil.ZERO ;
      AV124TFForCosForm_To = DecimalUtil.ZERO ;
      AV169TFForCosForm_To_Description = "" ;
      AV81TFForFec = GXutil.nullDate() ;
      AV87TFForUltMod = GXutil.nullDate() ;
      A7781ForBlo = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A13929ForTipArtD = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A584IntDsc = "" ;
      A5363IntDscF = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A485ForFec = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = "" ;
      AV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom = "" ;
      AV217Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = "" ;
      AV218Formulaciontinte_listadodeformulas_wcds_6_tfforser = "" ;
      AV219Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = "" ;
      AV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = "" ;
      AV221Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = "" ;
      AV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = "" ;
      AV225Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = "" ;
      AV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = "" ;
      AV227Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = "" ;
      AV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = "" ;
      AV233Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = "" ;
      AV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = "" ;
      AV237Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = "" ;
      AV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = "" ;
      AV241Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = "" ;
      AV244Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV245Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = DecimalUtil.ZERO ;
      AV246Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = DecimalUtil.ZERO ;
      AV247Formulaciontinte_listadodeformulas_wcds_35_tfforfec = GXutil.nullDate() ;
      AV248Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = GXutil.nullDate() ;
      lV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = "" ;
      lV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom = "" ;
      lV218Formulaciontinte_listadodeformulas_wcds_6_tfforser = "" ;
      lV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = "" ;
      lV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = "" ;
      lV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = "" ;
      lV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = "" ;
      lV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = "" ;
      AV188Forser = "" ;
      AV189Forser_to = "" ;
      AV192Forcolnom = "" ;
      AV193Forcolnom_to = "" ;
      A10045CliAct = "" ;
      AV185Emprcod = "" ;
      A396EmprCod = "" ;
      P09DI2_A829TipArtCod = new short[1] ;
      P09DI2_A10045CliAct = new String[] {""} ;
      P09DI2_A396EmprCod = new String[] {""} ;
      P09DI2_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DI2_n495ForUltMod = new boolean[] {false} ;
      P09DI2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DI2_n485ForFec = new boolean[] {false} ;
      P09DI2_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DI2_n4380ForCosForm = new boolean[] {false} ;
      P09DI2_A486ForNumCol = new int[1] ;
      P09DI2_A5363IntDscF = new String[] {""} ;
      P09DI2_n5363IntDscF = new boolean[] {false} ;
      P09DI2_A5362IntCodF = new byte[1] ;
      P09DI2_n5362IntCodF = new boolean[] {false} ;
      P09DI2_A584IntDsc = new String[] {""} ;
      P09DI2_n584IntDsc = new boolean[] {false} ;
      P09DI2_A583IntCod = new byte[1] ;
      P09DI2_A832TipColDsc = new String[] {""} ;
      P09DI2_n832TipColDsc = new boolean[] {false} ;
      P09DI2_A831TipColCod = new byte[1] ;
      P09DI2_A483ForColNum = new int[1] ;
      P09DI2_A482ForColNom = new String[] {""} ;
      P09DI2_A4384ForTipArt = new short[1] ;
      P09DI2_n4384ForTipArt = new boolean[] {false} ;
      P09DI2_A5742ForSerDsc = new String[] {""} ;
      P09DI2_n5742ForSerDsc = new boolean[] {false} ;
      P09DI2_A494ForSer = new String[] {""} ;
      P09DI2_A279CliNom = new String[] {""} ;
      P09DI2_A252CliCod = new int[1] ;
      P09DI2_A7781ForBlo = new String[] {""} ;
      P09DI2_n7781ForBlo = new boolean[] {false} ;
      P09DI2_A13929ForTipArtD = new String[] {""} ;
      P09DI2_n13929ForTipArtD = new boolean[] {false} ;
      AV200ForBloDescription = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV181PageInfo = "" ;
      AV178DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV208Pgmdesc = "" ;
      AV176AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.listadodeformulas_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P09DI2_A829TipArtCod, P09DI2_A10045CliAct, P09DI2_A396EmprCod, P09DI2_A495ForUltMod, P09DI2_n495ForUltMod, P09DI2_A485ForFec, P09DI2_n485ForFec, P09DI2_A4380ForCosForm, P09DI2_n4380ForCosForm, P09DI2_A486ForNumCol,
            P09DI2_A5363IntDscF, P09DI2_n5363IntDscF, P09DI2_A5362IntCodF, P09DI2_n5362IntCodF, P09DI2_A584IntDsc, P09DI2_n584IntDsc, P09DI2_A583IntCod, P09DI2_A832TipColDsc, P09DI2_n832TipColDsc, P09DI2_A831TipColCod,
            P09DI2_A483ForColNum, P09DI2_A482ForColNom, P09DI2_A4384ForTipArt, P09DI2_n4384ForTipArt, P09DI2_A5742ForSerDsc, P09DI2_n5742ForSerDsc, P09DI2_A494ForSer, P09DI2_A279CliNom, P09DI2_A252CliCod, P09DI2_A7781ForBlo,
            P09DI2_n7781ForBlo, P09DI2_A13929ForTipArtD, P09DI2_n13929ForTipArtD
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV208Pgmdesc = httpContext.getMessage( "Listadode Formulas_WCExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV208Pgmdesc = httpContext.getMessage( "Listadode Formulas_WCExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV33TFTipColCod ;
   private byte AV34TFTipColCod_To ;
   private byte AV37TFIntCod ;
   private byte AV38TFIntCod_To ;
   private byte AV49TFIntCodF ;
   private byte AV50TFIntCodF_To ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A5362IntCodF ;
   private byte AV230Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ;
   private byte AV231Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ;
   private byte AV234Formulaciontinte_listadodeformulas_wcds_22_tfintcod ;
   private byte AV235Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ;
   private byte AV238Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ;
   private byte AV239Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ;
   private byte AV194Tipcolcod ;
   private short gxcookieaux ;
   private short AV97TFForTipArt ;
   private short AV98TFForTipArt_To ;
   private short A4384ForTipArt ;
   private short AV222Formulaciontinte_listadodeformulas_wcds_10_tffortipart ;
   private short AV223Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ;
   private short AV195Tipcolcod_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV21TFCliCod ;
   private int AV22TFCliCod_To ;
   private int AV31TFForColNum ;
   private int AV32TFForColNum_To ;
   private int AV79TFForNumCol ;
   private int AV80TFForNumCol_To ;
   private int AV211GXV1 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV214Formulaciontinte_listadodeformulas_wcds_2_tfclicod ;
   private int AV215Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ;
   private int AV228Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ;
   private int AV229Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ;
   private int AV242Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ;
   private int AV243Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ;
   private int AV244Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ;
   private int AV186Clicod ;
   private int AV187Clicod_to ;
   private int AV190Forcolnum ;
   private int AV191Forcolnum_to ;
   private int AV198ForNumColfrom ;
   private int AV199ForNumColto ;
   private int AV249GXV2 ;
   private long AV205i ;
   private java.math.BigDecimal AV123TFForCosForm ;
   private java.math.BigDecimal AV124TFForCosForm_To ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal AV245Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ;
   private java.math.BigDecimal AV246Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV24TFCliNom_Sel ;
   private String AV23TFCliNom ;
   private String AV26TFForSer_Sel ;
   private String AV25TFForSer ;
   private String AV28TFForSerDsc_Sel ;
   private String AV27TFForSerDsc ;
   private String AV197TFForTipArtDsc_Sel ;
   private String AV196TFForTipArtDsc ;
   private String AV30TFForColNom_Sel ;
   private String AV29TFForColNom ;
   private String AV36TFTipColDsc_Sel ;
   private String AV35TFTipColDsc ;
   private String AV40TFIntDsc_Sel ;
   private String AV39TFIntDsc ;
   private String AV52TFIntDscF_Sel ;
   private String AV51TFIntDscF ;
   private String AV78TFForBlo_Sel ;
   private String A7781ForBlo ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A13929ForTipArtD ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String A584IntDsc ;
   private String A5363IntDscF ;
   private String AV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom ;
   private String AV217Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ;
   private String AV218Formulaciontinte_listadodeformulas_wcds_6_tfforser ;
   private String AV219Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ;
   private String AV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ;
   private String AV221Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ;
   private String AV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ;
   private String AV225Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ;
   private String AV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ;
   private String AV227Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ;
   private String AV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ;
   private String AV233Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ;
   private String AV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ;
   private String AV237Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ;
   private String AV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ;
   private String AV241Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ;
   private String lV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ;
   private String scmdbuf ;
   private String lV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom ;
   private String lV218Formulaciontinte_listadodeformulas_wcds_6_tfforser ;
   private String lV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ;
   private String lV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ;
   private String lV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ;
   private String lV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ;
   private String lV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ;
   private String AV188Forser ;
   private String AV189Forser_to ;
   private String AV192Forcolnom ;
   private String AV193Forcolnom_to ;
   private String A10045CliAct ;
   private String AV185Emprcod ;
   private String A396EmprCod ;
   private String AV208Pgmdesc ;
   private java.util.Date AV81TFForFec ;
   private java.util.Date AV87TFForUltMod ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date AV247Formulaciontinte_listadodeformulas_wcds_35_tfforfec ;
   private java.util.Date AV248Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n495ForUltMod ;
   private boolean n485ForFec ;
   private boolean n4380ForCosForm ;
   private boolean n5363IntDscF ;
   private boolean n5362IntCodF ;
   private boolean n584IntDsc ;
   private boolean n832TipColDsc ;
   private boolean n4384ForTipArt ;
   private boolean n5742ForSerDsc ;
   private boolean n7781ForBlo ;
   private boolean n13929ForTipArtD ;
   private String AV201TFForBlo_SelsJson ;
   private String AV183Title ;
   private String AV12FilterFullText ;
   private String AV141TFCliCod_To_Description ;
   private String AV160TFForTipArt_To_Description ;
   private String AV142TFForColNum_To_Description ;
   private String AV143TFTipColCod_To_Description ;
   private String AV144TFIntCod_To_Description ;
   private String AV147TFIntCodF_To_Description ;
   private String AV153TFForNumCol_To_Description ;
   private String AV202TFForBlo_SelDscs ;
   private String AV204FilterTFForBlo_SelValueDescription ;
   private String AV169TFForCosForm_To_Description ;
   private String AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ;
   private String lV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ;
   private String AV200ForBloDescription ;
   private String AV181PageInfo ;
   private String AV178DateInfo ;
   private String AV176AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private short[] P09DI2_A829TipArtCod ;
   private String[] P09DI2_A10045CliAct ;
   private String[] P09DI2_A396EmprCod ;
   private java.util.Date[] P09DI2_A495ForUltMod ;
   private boolean[] P09DI2_n495ForUltMod ;
   private java.util.Date[] P09DI2_A485ForFec ;
   private boolean[] P09DI2_n485ForFec ;
   private java.math.BigDecimal[] P09DI2_A4380ForCosForm ;
   private boolean[] P09DI2_n4380ForCosForm ;
   private int[] P09DI2_A486ForNumCol ;
   private String[] P09DI2_A5363IntDscF ;
   private boolean[] P09DI2_n5363IntDscF ;
   private byte[] P09DI2_A5362IntCodF ;
   private boolean[] P09DI2_n5362IntCodF ;
   private String[] P09DI2_A584IntDsc ;
   private boolean[] P09DI2_n584IntDsc ;
   private byte[] P09DI2_A583IntCod ;
   private String[] P09DI2_A832TipColDsc ;
   private boolean[] P09DI2_n832TipColDsc ;
   private byte[] P09DI2_A831TipColCod ;
   private int[] P09DI2_A483ForColNum ;
   private String[] P09DI2_A482ForColNom ;
   private short[] P09DI2_A4384ForTipArt ;
   private boolean[] P09DI2_n4384ForTipArt ;
   private String[] P09DI2_A5742ForSerDsc ;
   private boolean[] P09DI2_n5742ForSerDsc ;
   private String[] P09DI2_A494ForSer ;
   private String[] P09DI2_A279CliNom ;
   private int[] P09DI2_A252CliCod ;
   private String[] P09DI2_A7781ForBlo ;
   private boolean[] P09DI2_n7781ForBlo ;
   private String[] P09DI2_A13929ForTipArtD ;
   private boolean[] P09DI2_n13929ForTipArtD ;
   private GXSimpleCollection<String> AV203TFForBlo_Sels ;
   private GXSimpleCollection<String> AV244Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodeformulas_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09DI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV244Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV214Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV215Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV217Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV219Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV218Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV221Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV222Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV223Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV227Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV228Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV229Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV230Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV231Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV233Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV234Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV235Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV237Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV238Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV239Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV241Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV242Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV243Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV244Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV245Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV246Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV247Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV248Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV186Clicod ,
                                          int AV187Clicod_to ,
                                          String AV188Forser ,
                                          String AV189Forser_to ,
                                          String AV192Forcolnom ,
                                          String AV193Forcolnom_to ,
                                          int AV190Forcolnum ,
                                          int AV191Forcolnum_to ,
                                          byte AV194Tipcolcod ,
                                          short AV195Tipcolcod_to ,
                                          int AV198ForNumColfrom ,
                                          int AV199ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV213Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV225Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV224Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String AV185Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[50];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T6.CliAct, T1.EmprCod, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T2.IntDscF, T1.IntCodF, T3.IntDsc, T1.IntCod, T4.TipColDsc, T1.TipColCod," ;
      scmdbuf += " T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T6.CliNom, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV214Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV215Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV217Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV216Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV217Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV219Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV218Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV219Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV221Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV220Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV221Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV222Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV223Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV227Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV226Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV227Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV228Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV229Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV230Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV231Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV233Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV232Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV233Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV234Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV235Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV237Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV236Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV237Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV238Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV239Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV241Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV240Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV241Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV242Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV243Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( AV244Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV244Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV245Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV246Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV247Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV248Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV186Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV187Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV189Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV193Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (0==AV190Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (0==AV191Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (0==AV194Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (0==AV195Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (0==AV198ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (0==AV199ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForTipArt" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForTipArt DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IntCod" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IntCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.IntDsc" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.IntDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IntCodF" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IntCodF DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IntDscF" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IntDscF DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForBlo DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForCosForm" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForCosForm DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltMod" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltMod DESC" ;
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
                  return conditional_P09DI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 13);
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 16);
               ((String[]) buf[27])[0] = rslt.getString(19, 30);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
      }
   }

}

