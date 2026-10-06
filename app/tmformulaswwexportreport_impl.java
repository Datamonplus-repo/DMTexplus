package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmformulaswwexportreport_impl extends GXWebReport
{
   public tmformulaswwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV131Title = httpContext.getMessage( "Lista de Mantenimiento de Formulas", "") ;
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
         h8JQ0( true, 0) ;
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
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV140ForFec)) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV140ForFec, "99/99/99"), 25, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV141ForFec_To)) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV141ForFec_To, "99/99/99"), 25, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV159FilterFullText)==0) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159FilterFullText, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV65TFCliCod) && (0==AV66TFCliCod_To) ) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV65TFCliCod), "ZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV111TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111TFCliCod_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV66TFCliCod_To), "ZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV68TFCliNom_Sel)==0) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68TFCliNom_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV67TFCliNom)==0) )
         {
            h8JQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67TFCliNom, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV70TFForSer_Sel)==0) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFForSer_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV69TFForSer)==0) )
         {
            h8JQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFForSer, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV72TFForSerDsc_Sel)==0) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFForSerDsc_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV71TFForSerDsc)==0) )
         {
            h8JQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFForSerDsc, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV74TFForColNom_Sel)==0) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFForColNom_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV73TFForColNom)==0) )
         {
            h8JQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73TFForColNom, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV75TFForColNum) && (0==AV76TFForColNum_To) ) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV75TFForColNum), "ZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV112TFForColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112TFForColNum_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV76TFForColNum_To), "ZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV106TFForNomCli_Sel)==0) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106TFForNomCli_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV105TFForNomCli)==0) )
         {
            h8JQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105TFForNomCli, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV77TFTipColCod) && (0==AV78TFTipColCod_To) ) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV77TFTipColCod), "Z9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV113TFTipColCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tc", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113TFTipColCod_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV78TFTipColCod_To), "Z9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV80TFTipColDsc_Sel)==0) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFTipColDsc_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV79TFTipColDsc)==0) )
         {
            h8JQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFTipColDsc, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143TFForFec)) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Formula", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV143TFForFec, "99/99/99"), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146TFForUltUti)) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Ult Uti", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV146TFForUltUti, "99/99/99"), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV148TFForNumCol) && (0==AV149TFForNumCol_To) ) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Interno F.", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV148TFForNumCol), "ZZZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV151TFForNumCol_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Interno F.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151TFForNumCol_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV149TFForNumCol_To), "ZZZZZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV154TFForRelBan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155TFForRelBan_To)==0) ) )
      {
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV154TFForRelBan, "ZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV156TFForRelBan_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Rb", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8JQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV156TFForRelBan_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV155TFForRelBan_To, "ZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8JQ0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8JQ0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 84, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 146, Gx_line+10, 200, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 204, Gx_line+10, 258, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 262, Gx_line+10, 316, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 320, Gx_line+10, 374, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 378, Gx_line+10, 432, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 436, Gx_line+10, 491, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 495, Gx_line+10, 551, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Formula", ""), 555, Gx_line+10, 610, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Ult Uti", ""), 614, Gx_line+10, 669, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Interno F.", ""), 673, Gx_line+10, 728, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 732, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV171Tmformulaswwds_1_forfec = AV140ForFec ;
      AV172Tmformulaswwds_2_forfec_to = AV141ForFec_To ;
      AV173Tmformulaswwds_3_filterfulltext = AV159FilterFullText ;
      AV174Tmformulaswwds_4_tfclicod = AV65TFCliCod ;
      AV175Tmformulaswwds_5_tfclicod_to = AV66TFCliCod_To ;
      AV176Tmformulaswwds_6_tfclinom = AV67TFCliNom ;
      AV177Tmformulaswwds_7_tfclinom_sel = AV68TFCliNom_Sel ;
      AV178Tmformulaswwds_8_tfforser = AV69TFForSer ;
      AV179Tmformulaswwds_9_tfforser_sel = AV70TFForSer_Sel ;
      AV180Tmformulaswwds_10_tfforserdsc = AV71TFForSerDsc ;
      AV181Tmformulaswwds_11_tfforserdsc_sel = AV72TFForSerDsc_Sel ;
      AV182Tmformulaswwds_12_tfforcolnom = AV73TFForColNom ;
      AV183Tmformulaswwds_13_tfforcolnom_sel = AV74TFForColNom_Sel ;
      AV184Tmformulaswwds_14_tfforcolnum = AV75TFForColNum ;
      AV185Tmformulaswwds_15_tfforcolnum_to = AV76TFForColNum_To ;
      AV186Tmformulaswwds_16_tffornomcli = AV105TFForNomCli ;
      AV187Tmformulaswwds_17_tffornomcli_sel = AV106TFForNomCli_Sel ;
      AV188Tmformulaswwds_18_tftipcolcod = AV77TFTipColCod ;
      AV189Tmformulaswwds_19_tftipcolcod_to = AV78TFTipColCod_To ;
      AV190Tmformulaswwds_20_tftipcoldsc = AV79TFTipColDsc ;
      AV191Tmformulaswwds_21_tftipcoldsc_sel = AV80TFTipColDsc_Sel ;
      AV192Tmformulaswwds_22_tfforfec = AV143TFForFec ;
      AV193Tmformulaswwds_23_tfforultuti = AV146TFForUltUti ;
      AV194Tmformulaswwds_24_tffornumcol = AV148TFForNumCol ;
      AV195Tmformulaswwds_25_tffornumcol_to = AV149TFForNumCol_To ;
      AV196Tmformulaswwds_26_tfforrelban = AV154TFForRelBan ;
      AV197Tmformulaswwds_27_tfforrelban_to = AV155TFForRelBan_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV171Tmformulaswwds_1_forfec ,
                                           AV172Tmformulaswwds_2_forfec_to ,
                                           AV173Tmformulaswwds_3_filterfulltext ,
                                           Integer.valueOf(AV174Tmformulaswwds_4_tfclicod) ,
                                           Integer.valueOf(AV175Tmformulaswwds_5_tfclicod_to) ,
                                           AV177Tmformulaswwds_7_tfclinom_sel ,
                                           AV176Tmformulaswwds_6_tfclinom ,
                                           AV179Tmformulaswwds_9_tfforser_sel ,
                                           AV178Tmformulaswwds_8_tfforser ,
                                           AV181Tmformulaswwds_11_tfforserdsc_sel ,
                                           AV180Tmformulaswwds_10_tfforserdsc ,
                                           AV183Tmformulaswwds_13_tfforcolnom_sel ,
                                           AV182Tmformulaswwds_12_tfforcolnom ,
                                           Integer.valueOf(AV184Tmformulaswwds_14_tfforcolnum) ,
                                           Integer.valueOf(AV185Tmformulaswwds_15_tfforcolnum_to) ,
                                           AV187Tmformulaswwds_17_tffornomcli_sel ,
                                           AV186Tmformulaswwds_16_tffornomcli ,
                                           Byte.valueOf(AV188Tmformulaswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV189Tmformulaswwds_19_tftipcolcod_to) ,
                                           AV191Tmformulaswwds_21_tftipcoldsc_sel ,
                                           AV190Tmformulaswwds_20_tftipcoldsc ,
                                           AV192Tmformulaswwds_22_tfforfec ,
                                           AV193Tmformulaswwds_23_tfforultuti ,
                                           Integer.valueOf(AV194Tmformulaswwds_24_tffornumcol) ,
                                           Integer.valueOf(AV195Tmformulaswwds_25_tffornumcol_to) ,
                                           AV196Tmformulaswwds_26_tfforrelban ,
                                           AV197Tmformulaswwds_27_tfforrelban_to ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A2838ForRelBan ,
                                           A496ForUltUti ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV173Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV173Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV176Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV176Tmformulaswwds_6_tfclinom), 30, "%") ;
      lV178Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV178Tmformulaswwds_8_tfforser), 16, "%") ;
      lV180Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV180Tmformulaswwds_10_tfforserdsc), 26, "%") ;
      lV182Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV182Tmformulaswwds_12_tfforcolnom), 13, "%") ;
      lV186Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV186Tmformulaswwds_16_tffornomcli), 13, "%") ;
      lV190Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV190Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
      /* Using cursor P08JQ2 */
      pr_default.execute(0, new Object[] {AV171Tmformulaswwds_1_forfec, AV172Tmformulaswwds_2_forfec_to, lV173Tmformulaswwds_3_filterfulltext, lV173Tmformulaswwds_3_filterfulltext, lV173Tmformulaswwds_3_filterfulltext, lV173Tmformulaswwds_3_filterfulltext, lV173Tmformulaswwds_3_filterfulltext, lV173Tmformulaswwds_3_filterfulltext, lV173Tmformulaswwds_3_filterfulltext, lV173Tmformulaswwds_3_filterfulltext, lV173Tmformulaswwds_3_filterfulltext, lV173Tmformulaswwds_3_filterfulltext, lV173Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV174Tmformulaswwds_4_tfclicod), Integer.valueOf(AV175Tmformulaswwds_5_tfclicod_to), lV176Tmformulaswwds_6_tfclinom, AV177Tmformulaswwds_7_tfclinom_sel, lV178Tmformulaswwds_8_tfforser, AV179Tmformulaswwds_9_tfforser_sel, lV180Tmformulaswwds_10_tfforserdsc, AV181Tmformulaswwds_11_tfforserdsc_sel, lV182Tmformulaswwds_12_tfforcolnom, AV183Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV184Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV185Tmformulaswwds_15_tfforcolnum_to), lV186Tmformulaswwds_16_tffornomcli, AV187Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV188Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV189Tmformulaswwds_19_tftipcolcod_to), lV190Tmformulaswwds_20_tftipcoldsc, AV191Tmformulaswwds_21_tftipcoldsc_sel, AV192Tmformulaswwds_22_tfforfec, AV193Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV194Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV195Tmformulaswwds_25_tffornumcol_to), AV196Tmformulaswwds_26_tfforrelban, AV197Tmformulaswwds_27_tfforrelban_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08JQ2_A396EmprCod[0] ;
         A2838ForRelBan = P08JQ2_A2838ForRelBan[0] ;
         n2838ForRelBan = P08JQ2_n2838ForRelBan[0] ;
         A486ForNumCol = P08JQ2_A486ForNumCol[0] ;
         A496ForUltUti = P08JQ2_A496ForUltUti[0] ;
         n496ForUltUti = P08JQ2_n496ForUltUti[0] ;
         A832TipColDsc = P08JQ2_A832TipColDsc[0] ;
         n832TipColDsc = P08JQ2_n832TipColDsc[0] ;
         A831TipColCod = P08JQ2_A831TipColCod[0] ;
         A1191ForNomCli = P08JQ2_A1191ForNomCli[0] ;
         n1191ForNomCli = P08JQ2_n1191ForNomCli[0] ;
         A483ForColNum = P08JQ2_A483ForColNum[0] ;
         A482ForColNom = P08JQ2_A482ForColNom[0] ;
         A5742ForSerDsc = P08JQ2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08JQ2_n5742ForSerDsc[0] ;
         A494ForSer = P08JQ2_A494ForSer[0] ;
         A279CliNom = P08JQ2_A279CliNom[0] ;
         A252CliCod = P08JQ2_A252CliCod[0] ;
         A485ForFec = P08JQ2_A485ForFec[0] ;
         n485ForFec = P08JQ2_n485ForFec[0] ;
         A832TipColDsc = P08JQ2_A832TipColDsc[0] ;
         n832TipColDsc = P08JQ2_n832TipColDsc[0] ;
         A279CliNom = P08JQ2_A279CliNom[0] ;
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
         h8JQ0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 84, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 146, Gx_line+10, 200, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), 204, Gx_line+10, 258, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 262, Gx_line+10, 316, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 320, Gx_line+10, 374, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1191ForNomCli, "")), 378, Gx_line+10, 432, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 436, Gx_line+10, 491, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 495, Gx_line+10, 551, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A485ForFec, "99/99/99"), 555, Gx_line+10, 610, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A496ForUltUti, "99/99/99"), 614, Gx_line+10, 669, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9")), 673, Gx_line+10, 728, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2838ForRelBan, "ZZZ9.99")), 732, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV61Session.getValue("TMFormulasWWGridState"), "") == 0 )
      {
         AV63GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMFormulasWWGridState"), null, null);
      }
      else
      {
         AV63GridState.fromxml(AV61Session.getValue("TMFormulasWWGridState"), null, null);
      }
      AV10OrderedBy = AV63GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV63GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV198GXV1 = 1 ;
      while ( AV198GXV1 <= AV63GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV64GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV63GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV198GXV1));
         if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FORFEC") == 0 )
         {
            AV140ForFec = localUtil.ctod( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV141ForFec_To = localUtil.ctod( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV159FilterFullText = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV65TFCliCod = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFCliCod_To = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV67TFCliNom = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV68TFCliNom_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV69TFForSer = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV70TFForSer_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV71TFForSerDsc = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV72TFForSerDsc_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV73TFForColNom = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV74TFForColNom_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV75TFForColNum = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV76TFForColNum_To = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV105TFForNomCli = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV106TFForNomCli_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV77TFTipColCod = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV78TFTipColCod_To = (byte)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV79TFTipColDsc = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV80TFTipColDsc_Sel = AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV143TFForFec = localUtil.ctod( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV146TFForUltUti = localUtil.ctod( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV148TFForNumCol = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV149TFForNumCol_To = (int)(GXutil.lval( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORRELBAN") == 0 )
         {
            AV154TFForRelBan = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV155TFForRelBan_To = CommonUtil.decimalVal( AV64GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV198GXV1 = (int)(AV198GXV1+1) ;
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

   public void h8JQ0( boolean bFoot ,
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
               AV128PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV124DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV131Title = AV167Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV161AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV131Title = "" ;
      AV140ForFec = GXutil.nullDate() ;
      AV141ForFec_To = GXutil.nullDate() ;
      AV159FilterFullText = "" ;
      AV111TFCliCod_To_Description = "" ;
      AV68TFCliNom_Sel = "" ;
      AV67TFCliNom = "" ;
      AV70TFForSer_Sel = "" ;
      AV69TFForSer = "" ;
      AV72TFForSerDsc_Sel = "" ;
      AV71TFForSerDsc = "" ;
      AV74TFForColNom_Sel = "" ;
      AV73TFForColNom = "" ;
      AV112TFForColNum_To_Description = "" ;
      AV106TFForNomCli_Sel = "" ;
      AV105TFForNomCli = "" ;
      AV113TFTipColCod_To_Description = "" ;
      AV80TFTipColDsc_Sel = "" ;
      AV79TFTipColDsc = "" ;
      AV143TFForFec = GXutil.nullDate() ;
      AV146TFForUltUti = GXutil.nullDate() ;
      AV151TFForNumCol_To_Description = "" ;
      AV154TFForRelBan = DecimalUtil.ZERO ;
      AV155TFForRelBan_To = DecimalUtil.ZERO ;
      AV156TFForRelBan_To_Description = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A832TipColDsc = "" ;
      A485ForFec = GXutil.nullDate() ;
      A496ForUltUti = GXutil.nullDate() ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      AV171Tmformulaswwds_1_forfec = GXutil.nullDate() ;
      AV172Tmformulaswwds_2_forfec_to = GXutil.nullDate() ;
      AV173Tmformulaswwds_3_filterfulltext = "" ;
      AV176Tmformulaswwds_6_tfclinom = "" ;
      AV177Tmformulaswwds_7_tfclinom_sel = "" ;
      AV178Tmformulaswwds_8_tfforser = "" ;
      AV179Tmformulaswwds_9_tfforser_sel = "" ;
      AV180Tmformulaswwds_10_tfforserdsc = "" ;
      AV181Tmformulaswwds_11_tfforserdsc_sel = "" ;
      AV182Tmformulaswwds_12_tfforcolnom = "" ;
      AV183Tmformulaswwds_13_tfforcolnom_sel = "" ;
      AV186Tmformulaswwds_16_tffornomcli = "" ;
      AV187Tmformulaswwds_17_tffornomcli_sel = "" ;
      AV190Tmformulaswwds_20_tftipcoldsc = "" ;
      AV191Tmformulaswwds_21_tftipcoldsc_sel = "" ;
      AV192Tmformulaswwds_22_tfforfec = GXutil.nullDate() ;
      AV193Tmformulaswwds_23_tfforultuti = GXutil.nullDate() ;
      AV196Tmformulaswwds_26_tfforrelban = DecimalUtil.ZERO ;
      AV197Tmformulaswwds_27_tfforrelban_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV173Tmformulaswwds_3_filterfulltext = "" ;
      lV176Tmformulaswwds_6_tfclinom = "" ;
      lV178Tmformulaswwds_8_tfforser = "" ;
      lV180Tmformulaswwds_10_tfforserdsc = "" ;
      lV182Tmformulaswwds_12_tfforcolnom = "" ;
      lV186Tmformulaswwds_16_tffornomcli = "" ;
      lV190Tmformulaswwds_20_tftipcoldsc = "" ;
      P08JQ2_A396EmprCod = new String[] {""} ;
      P08JQ2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JQ2_n2838ForRelBan = new boolean[] {false} ;
      P08JQ2_A486ForNumCol = new int[1] ;
      P08JQ2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08JQ2_n496ForUltUti = new boolean[] {false} ;
      P08JQ2_A832TipColDsc = new String[] {""} ;
      P08JQ2_n832TipColDsc = new boolean[] {false} ;
      P08JQ2_A831TipColCod = new byte[1] ;
      P08JQ2_A1191ForNomCli = new String[] {""} ;
      P08JQ2_n1191ForNomCli = new boolean[] {false} ;
      P08JQ2_A483ForColNum = new int[1] ;
      P08JQ2_A482ForColNom = new String[] {""} ;
      P08JQ2_A5742ForSerDsc = new String[] {""} ;
      P08JQ2_n5742ForSerDsc = new boolean[] {false} ;
      P08JQ2_A494ForSer = new String[] {""} ;
      P08JQ2_A279CliNom = new String[] {""} ;
      P08JQ2_A252CliCod = new int[1] ;
      P08JQ2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08JQ2_n485ForFec = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV61Session = httpContext.getWebSession();
      AV63GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV64GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV128PageInfo = "" ;
      AV124DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV167Pgmdesc = "" ;
      AV161AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmformulaswwexportreport__default(),
         new Object[] {
             new Object[] {
            P08JQ2_A396EmprCod, P08JQ2_A2838ForRelBan, P08JQ2_n2838ForRelBan, P08JQ2_A486ForNumCol, P08JQ2_A496ForUltUti, P08JQ2_n496ForUltUti, P08JQ2_A832TipColDsc, P08JQ2_n832TipColDsc, P08JQ2_A831TipColCod, P08JQ2_A1191ForNomCli,
            P08JQ2_n1191ForNomCli, P08JQ2_A483ForColNum, P08JQ2_A482ForColNom, P08JQ2_A5742ForSerDsc, P08JQ2_n5742ForSerDsc, P08JQ2_A494ForSer, P08JQ2_A279CliNom, P08JQ2_A252CliCod, P08JQ2_A485ForFec, P08JQ2_n485ForFec
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV167Pgmdesc = httpContext.getMessage( "TMFormulas WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV167Pgmdesc = httpContext.getMessage( "TMFormulas WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV77TFTipColCod ;
   private byte AV78TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV188Tmformulaswwds_18_tftipcolcod ;
   private byte AV189Tmformulaswwds_19_tftipcolcod_to ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV65TFCliCod ;
   private int AV66TFCliCod_To ;
   private int AV75TFForColNum ;
   private int AV76TFForColNum_To ;
   private int AV148TFForNumCol ;
   private int AV149TFForNumCol_To ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV174Tmformulaswwds_4_tfclicod ;
   private int AV175Tmformulaswwds_5_tfclicod_to ;
   private int AV184Tmformulaswwds_14_tfforcolnum ;
   private int AV185Tmformulaswwds_15_tfforcolnum_to ;
   private int AV194Tmformulaswwds_24_tffornumcol ;
   private int AV195Tmformulaswwds_25_tffornumcol_to ;
   private int AV198GXV1 ;
   private java.math.BigDecimal AV154TFForRelBan ;
   private java.math.BigDecimal AV155TFForRelBan_To ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV196Tmformulaswwds_26_tfforrelban ;
   private java.math.BigDecimal AV197Tmformulaswwds_27_tfforrelban_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV68TFCliNom_Sel ;
   private String AV67TFCliNom ;
   private String AV70TFForSer_Sel ;
   private String AV69TFForSer ;
   private String AV72TFForSerDsc_Sel ;
   private String AV71TFForSerDsc ;
   private String AV74TFForColNom_Sel ;
   private String AV73TFForColNom ;
   private String AV106TFForNomCli_Sel ;
   private String AV105TFForNomCli ;
   private String AV80TFTipColDsc_Sel ;
   private String AV79TFTipColDsc ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A832TipColDsc ;
   private String AV176Tmformulaswwds_6_tfclinom ;
   private String AV177Tmformulaswwds_7_tfclinom_sel ;
   private String AV178Tmformulaswwds_8_tfforser ;
   private String AV179Tmformulaswwds_9_tfforser_sel ;
   private String AV180Tmformulaswwds_10_tfforserdsc ;
   private String AV181Tmformulaswwds_11_tfforserdsc_sel ;
   private String AV182Tmformulaswwds_12_tfforcolnom ;
   private String AV183Tmformulaswwds_13_tfforcolnom_sel ;
   private String AV186Tmformulaswwds_16_tffornomcli ;
   private String AV187Tmformulaswwds_17_tffornomcli_sel ;
   private String AV190Tmformulaswwds_20_tftipcoldsc ;
   private String AV191Tmformulaswwds_21_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV176Tmformulaswwds_6_tfclinom ;
   private String lV178Tmformulaswwds_8_tfforser ;
   private String lV180Tmformulaswwds_10_tfforserdsc ;
   private String lV182Tmformulaswwds_12_tfforcolnom ;
   private String lV186Tmformulaswwds_16_tffornomcli ;
   private String lV190Tmformulaswwds_20_tftipcoldsc ;
   private String A396EmprCod ;
   private String AV167Pgmdesc ;
   private java.util.Date AV140ForFec ;
   private java.util.Date AV141ForFec_To ;
   private java.util.Date AV143TFForFec ;
   private java.util.Date AV146TFForUltUti ;
   private java.util.Date A485ForFec ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date AV171Tmformulaswwds_1_forfec ;
   private java.util.Date AV172Tmformulaswwds_2_forfec_to ;
   private java.util.Date AV192Tmformulaswwds_22_tfforfec ;
   private java.util.Date AV193Tmformulaswwds_23_tfforultuti ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n2838ForRelBan ;
   private boolean n496ForUltUti ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n5742ForSerDsc ;
   private boolean n485ForFec ;
   private String AV131Title ;
   private String AV159FilterFullText ;
   private String AV111TFCliCod_To_Description ;
   private String AV112TFForColNum_To_Description ;
   private String AV113TFTipColCod_To_Description ;
   private String AV151TFForNumCol_To_Description ;
   private String AV156TFForRelBan_To_Description ;
   private String AV173Tmformulaswwds_3_filterfulltext ;
   private String lV173Tmformulaswwds_3_filterfulltext ;
   private String AV128PageInfo ;
   private String AV124DateInfo ;
   private String AV161AppName ;
   private com.genexus.webpanels.WebSession AV61Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08JQ2_A396EmprCod ;
   private java.math.BigDecimal[] P08JQ2_A2838ForRelBan ;
   private boolean[] P08JQ2_n2838ForRelBan ;
   private int[] P08JQ2_A486ForNumCol ;
   private java.util.Date[] P08JQ2_A496ForUltUti ;
   private boolean[] P08JQ2_n496ForUltUti ;
   private String[] P08JQ2_A832TipColDsc ;
   private boolean[] P08JQ2_n832TipColDsc ;
   private byte[] P08JQ2_A831TipColCod ;
   private String[] P08JQ2_A1191ForNomCli ;
   private boolean[] P08JQ2_n1191ForNomCli ;
   private int[] P08JQ2_A483ForColNum ;
   private String[] P08JQ2_A482ForColNom ;
   private String[] P08JQ2_A5742ForSerDsc ;
   private boolean[] P08JQ2_n5742ForSerDsc ;
   private String[] P08JQ2_A494ForSer ;
   private String[] P08JQ2_A279CliNom ;
   private int[] P08JQ2_A252CliCod ;
   private java.util.Date[] P08JQ2_A485ForFec ;
   private boolean[] P08JQ2_n485ForFec ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV63GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV64GridStateFilterValue ;
}

final  class tmformulaswwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08JQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV171Tmformulaswwds_1_forfec ,
                                          java.util.Date AV172Tmformulaswwds_2_forfec_to ,
                                          String AV173Tmformulaswwds_3_filterfulltext ,
                                          int AV174Tmformulaswwds_4_tfclicod ,
                                          int AV175Tmformulaswwds_5_tfclicod_to ,
                                          String AV177Tmformulaswwds_7_tfclinom_sel ,
                                          String AV176Tmformulaswwds_6_tfclinom ,
                                          String AV179Tmformulaswwds_9_tfforser_sel ,
                                          String AV178Tmformulaswwds_8_tfforser ,
                                          String AV181Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV180Tmformulaswwds_10_tfforserdsc ,
                                          String AV183Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV182Tmformulaswwds_12_tfforcolnom ,
                                          int AV184Tmformulaswwds_14_tfforcolnum ,
                                          int AV185Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV187Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV186Tmformulaswwds_16_tffornomcli ,
                                          byte AV188Tmformulaswwds_18_tftipcolcod ,
                                          byte AV189Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV191Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV190Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV192Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV193Tmformulaswwds_23_tfforultuti ,
                                          int AV194Tmformulaswwds_24_tffornumcol ,
                                          int AV195Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV196Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV197Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[37];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForRelBan, T1.ForNumCol, T1.ForUltUti, T2.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom," ;
      scmdbuf += " T1.CliCod, T1.ForFec FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV171Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV172Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV173Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
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
      if ( ! (0==AV174Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV175Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV177Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV176Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV177Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV179Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV178Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV179Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV181Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV180Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV181Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV183Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV182Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV183Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV184Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV185Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV186Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV188Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV189Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV191Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV190Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV191Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV192Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV193Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV194Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV195Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV196Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV197Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
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
         scmdbuf += " ORDER BY T1.ForNomCli" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNomCli DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipColDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltUti DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForRelBan" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForRelBan DESC" ;
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
                  return conditional_P08JQ2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08JQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               return;
      }
   }

}

