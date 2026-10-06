package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwnwdp02exportreport_impl extends GXWebReport
{
   public webwnwdp02exportreport_impl( com.genexus.internet.HttpContext context )
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
         AV56Title = httpContext.getMessage( "Lista de Entrada Pedido Cliente", "") ;
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
         h8EQ0( true, 0) ;
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
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV21TFDisCod) && (0==AV22TFDisCod_To) ) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Disposicion", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFDisCod), "ZZZZZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV42TFDisCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Disposicion", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFDisCod_To_Description, "")), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFDisCod_To), "ZZZZZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV23TFCliCod) && (0==AV24TFCliCod_To) ) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFCliCod), "ZZZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFCliCod_To_Description, "")), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFCliCod_To), "ZZZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25TFDisFec)) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Pedido", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV25TFDisFec, "99/99/99"), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFDisArtCod_Sel)==0) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Artículo", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFDisArtCod_Sel, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFDisArtCod)==0) )
         {
            h8EQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Artículo", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFDisArtCod, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV30TFDisArtDsc_Sel)==0) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFDisArtDsc_Sel, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFDisArtDsc)==0) )
         {
            h8EQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFDisArtDsc, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV32TFDisColNom_Sel)==0) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFDisColNom_Sel, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFDisColNom)==0) )
         {
            h8EQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFDisColNom, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV34TFDisNomCli_Sel)==0) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color Cliente", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFDisNomCli_Sel, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV33TFDisNomCli)==0) )
         {
            h8EQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color Cliente", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFDisNomCli, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV35TFDisColNum) && (0==AV36TFDisColNum_To) ) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero Color", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TFDisColNum), "ZZZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV45TFDisColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero Color", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFDisColNum_To_Description, "")), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TFDisColNum_To), "ZZZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV38TFDibCli_Sel)==0) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dibujo del Cliente", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFDibCli_Sel, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV37TFDibCli)==0) )
         {
            h8EQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dibujo del Cliente", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFDibCli, "")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV39TFDibInt) && (0==AV40TFDibInt_To) ) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dibujo Interno", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39TFDibInt), "ZZZZZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV46TFDibInt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Dibujo Interno", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFDibInt_To_Description, "")), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TFDibInt_To), "ZZZZZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV79TFDisMaxObsLin) && (0==AV80TFDisMaxObsLin_To) ) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Máxima Observación", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV79TFDisMaxObsLin), "ZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV83TFDisMaxObsLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Máxima Observación", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83TFDisMaxObsLin_To_Description, "")), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV80TFDisMaxObsLin_To), "ZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV81TFDisCanRec) && (0==AV82TFDisCanRec_To) ) )
      {
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reclamaciones", ""), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81TFDisCanRec), "ZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV84TFDisCanRec_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Reclamaciones", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8EQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84TFDisCanRec_To_Description, "")), 25, Gx_line+0, 174, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV82TFDisCanRec_To), "ZZZ9")), 174, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8EQ0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8EQ0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Disposicion", ""), 30, Gx_line+10, 89, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 93, Gx_line+10, 152, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Pedido", ""), 156, Gx_line+10, 215, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Artículo", ""), 219, Gx_line+10, 278, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 282, Gx_line+10, 341, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 345, Gx_line+10, 404, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color Cliente", ""), 408, Gx_line+10, 467, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero Color", ""), 471, Gx_line+10, 530, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dibujo del Cliente", ""), 534, Gx_line+10, 595, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dibujo Interno", ""), 599, Gx_line+10, 659, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Máxima Observación", ""), 663, Gx_line+10, 723, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Reclamaciones", ""), 727, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV91Webwnwdp02ds_1_filterfulltext = AV12FilterFullText ;
      AV92Webwnwdp02ds_2_tfdiscod = AV21TFDisCod ;
      AV93Webwnwdp02ds_3_tfdiscod_to = AV22TFDisCod_To ;
      AV94Webwnwdp02ds_4_tfclicod = AV23TFCliCod ;
      AV95Webwnwdp02ds_5_tfclicod_to = AV24TFCliCod_To ;
      AV96Webwnwdp02ds_6_tfdisfec = AV25TFDisFec ;
      AV97Webwnwdp02ds_7_tfdisartcod = AV27TFDisArtCod ;
      AV98Webwnwdp02ds_8_tfdisartcod_sel = AV28TFDisArtCod_Sel ;
      AV99Webwnwdp02ds_9_tfdisartdsc = AV29TFDisArtDsc ;
      AV100Webwnwdp02ds_10_tfdisartdsc_sel = AV30TFDisArtDsc_Sel ;
      AV101Webwnwdp02ds_11_tfdiscolnom = AV31TFDisColNom ;
      AV102Webwnwdp02ds_12_tfdiscolnom_sel = AV32TFDisColNom_Sel ;
      AV103Webwnwdp02ds_13_tfdisnomcli = AV33TFDisNomCli ;
      AV104Webwnwdp02ds_14_tfdisnomcli_sel = AV34TFDisNomCli_Sel ;
      AV105Webwnwdp02ds_15_tfdiscolnum = AV35TFDisColNum ;
      AV106Webwnwdp02ds_16_tfdiscolnum_to = AV36TFDisColNum_To ;
      AV107Webwnwdp02ds_17_tfdibcli = AV37TFDibCli ;
      AV108Webwnwdp02ds_18_tfdibcli_sel = AV38TFDibCli_Sel ;
      AV109Webwnwdp02ds_19_tfdibint = AV39TFDibInt ;
      AV110Webwnwdp02ds_20_tfdibint_to = AV40TFDibInt_To ;
      AV111Webwnwdp02ds_21_tfdismaxobslin = AV79TFDisMaxObsLin ;
      AV112Webwnwdp02ds_22_tfdismaxobslin_to = AV80TFDisMaxObsLin_To ;
      AV113Webwnwdp02ds_23_tfdiscanrec = AV81TFDisCanRec ;
      AV114Webwnwdp02ds_24_tfdiscanrec_to = AV82TFDisCanRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV92Webwnwdp02ds_2_tfdiscod) ,
                                           Integer.valueOf(AV93Webwnwdp02ds_3_tfdiscod_to) ,
                                           Integer.valueOf(AV94Webwnwdp02ds_4_tfclicod) ,
                                           Integer.valueOf(AV95Webwnwdp02ds_5_tfclicod_to) ,
                                           AV96Webwnwdp02ds_6_tfdisfec ,
                                           AV98Webwnwdp02ds_8_tfdisartcod_sel ,
                                           AV97Webwnwdp02ds_7_tfdisartcod ,
                                           AV100Webwnwdp02ds_10_tfdisartdsc_sel ,
                                           AV99Webwnwdp02ds_9_tfdisartdsc ,
                                           AV102Webwnwdp02ds_12_tfdiscolnom_sel ,
                                           AV101Webwnwdp02ds_11_tfdiscolnom ,
                                           AV104Webwnwdp02ds_14_tfdisnomcli_sel ,
                                           AV103Webwnwdp02ds_13_tfdisnomcli ,
                                           Integer.valueOf(AV105Webwnwdp02ds_15_tfdiscolnum) ,
                                           Integer.valueOf(AV106Webwnwdp02ds_16_tfdiscolnum_to) ,
                                           AV108Webwnwdp02ds_18_tfdibcli_sel ,
                                           AV107Webwnwdp02ds_17_tfdibcli ,
                                           Integer.valueOf(AV109Webwnwdp02ds_19_tfdibint) ,
                                           Integer.valueOf(AV110Webwnwdp02ds_20_tfdibint_to) ,
                                           Integer.valueOf(AV70Discodp) ,
                                           Integer.valueOf(AV71CliCod) ,
                                           AV72DisCliNum ,
                                           AV73DisArtCod ,
                                           AV74Disartdsc ,
                                           AV75DisColNom ,
                                           AV76Disnomcli ,
                                           AV77DisUsrcod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A369DisFec ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A363DisColNum) ,
                                           A1013DibCli ,
                                           Integer.valueOf(A1014DibInt) ,
                                           A360DisCliNum ,
                                           A4348DisUsrCod ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV91Webwnwdp02ds_1_filterfulltext ,
                                           Short.valueOf(A13737DisMaxObsL) ,
                                           Short.valueOf(A13732DisCanRec) ,
                                           Short.valueOf(AV111Webwnwdp02ds_21_tfdismaxobslin) ,
                                           Short.valueOf(AV112Webwnwdp02ds_22_tfdismaxobslin_to) ,
                                           Short.valueOf(AV113Webwnwdp02ds_23_tfdiscanrec) ,
                                           Short.valueOf(AV114Webwnwdp02ds_24_tfdiscanrec_to) ,
                                           A757PriCod ,
                                           AV69pricod ,
                                           AV68Disfec ,
                                           AV67EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV91Webwnwdp02ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webwnwdp02ds_1_filterfulltext), "%", "") ;
      lV97Webwnwdp02ds_7_tfdisartcod = GXutil.padr( GXutil.rtrim( AV97Webwnwdp02ds_7_tfdisartcod), 16, "%") ;
      lV99Webwnwdp02ds_9_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV99Webwnwdp02ds_9_tfdisartdsc), 26, "%") ;
      lV101Webwnwdp02ds_11_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV101Webwnwdp02ds_11_tfdiscolnom), 13, "%") ;
      lV103Webwnwdp02ds_13_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV103Webwnwdp02ds_13_tfdisnomcli), 13, "%") ;
      lV107Webwnwdp02ds_17_tfdibcli = GXutil.padr( GXutil.rtrim( AV107Webwnwdp02ds_17_tfdibcli), 16, "%") ;
      lV72DisCliNum = GXutil.padr( GXutil.rtrim( AV72DisCliNum), 8, "%") ;
      lV73DisArtCod = GXutil.padr( GXutil.rtrim( AV73DisArtCod), 16, "%") ;
      lV74Disartdsc = GXutil.padr( GXutil.rtrim( AV74Disartdsc), 26, "%") ;
      lV75DisColNom = GXutil.padr( GXutil.rtrim( AV75DisColNom), 13, "%") ;
      lV76Disnomcli = GXutil.padr( GXutil.rtrim( AV76Disnomcli), 13, "%") ;
      /* Using cursor P08EQ4 */
      pr_default.execute(0, new Object[] {AV67EmprCod, AV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, lV91Webwnwdp02ds_1_filterfulltext, Short.valueOf(AV111Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV111Webwnwdp02ds_21_tfdismaxobslin), Short.valueOf(AV112Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV112Webwnwdp02ds_22_tfdismaxobslin_to), Short.valueOf(AV113Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV113Webwnwdp02ds_23_tfdiscanrec), Short.valueOf(AV114Webwnwdp02ds_24_tfdiscanrec_to), Short.valueOf(AV114Webwnwdp02ds_24_tfdiscanrec_to), AV69pricod, AV69pricod, AV68Disfec, Integer.valueOf(AV92Webwnwdp02ds_2_tfdiscod), Integer.valueOf(AV93Webwnwdp02ds_3_tfdiscod_to), Integer.valueOf(AV94Webwnwdp02ds_4_tfclicod), Integer.valueOf(AV95Webwnwdp02ds_5_tfclicod_to), AV96Webwnwdp02ds_6_tfdisfec, lV97Webwnwdp02ds_7_tfdisartcod, AV98Webwnwdp02ds_8_tfdisartcod_sel, lV99Webwnwdp02ds_9_tfdisartdsc, AV100Webwnwdp02ds_10_tfdisartdsc_sel, lV101Webwnwdp02ds_11_tfdiscolnom, AV102Webwnwdp02ds_12_tfdiscolnom_sel, lV103Webwnwdp02ds_13_tfdisnomcli, AV104Webwnwdp02ds_14_tfdisnomcli_sel, Integer.valueOf(AV105Webwnwdp02ds_15_tfdiscolnum), Integer.valueOf(AV106Webwnwdp02ds_16_tfdiscolnum_to), lV107Webwnwdp02ds_17_tfdibcli, AV108Webwnwdp02ds_18_tfdibcli_sel, Integer.valueOf(AV109Webwnwdp02ds_19_tfdibint), Integer.valueOf(AV110Webwnwdp02ds_20_tfdibint_to), Integer.valueOf(AV70Discodp), Integer.valueOf(AV71CliCod), lV72DisCliNum, lV73DisArtCod, lV74Disartdsc, lV75DisColNom, lV76Disnomcli, AV77DisUsrcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4348DisUsrCod = P08EQ4_A4348DisUsrCod[0] ;
         A360DisCliNum = P08EQ4_A360DisCliNum[0] ;
         A757PriCod = P08EQ4_A757PriCod[0] ;
         A396EmprCod = P08EQ4_A396EmprCod[0] ;
         A1014DibInt = P08EQ4_A1014DibInt[0] ;
         n1014DibInt = P08EQ4_n1014DibInt[0] ;
         A1013DibCli = P08EQ4_A1013DibCli[0] ;
         n1013DibCli = P08EQ4_n1013DibCli[0] ;
         A363DisColNum = P08EQ4_A363DisColNum[0] ;
         n363DisColNum = P08EQ4_n363DisColNum[0] ;
         A1195DisNomCli = P08EQ4_A1195DisNomCli[0] ;
         A362DisColNom = P08EQ4_A362DisColNom[0] ;
         n362DisColNom = P08EQ4_n362DisColNom[0] ;
         A337DisArtDsc = P08EQ4_A337DisArtDsc[0] ;
         A335DisArtCod = P08EQ4_A335DisArtCod[0] ;
         A369DisFec = P08EQ4_A369DisFec[0] ;
         A252CliCod = P08EQ4_A252CliCod[0] ;
         A361DisCod = P08EQ4_A361DisCod[0] ;
         A367DisEst = P08EQ4_A367DisEst[0] ;
         A13732DisCanRec = P08EQ4_A13732DisCanRec[0] ;
         n13732DisCanRec = P08EQ4_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08EQ4_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08EQ4_n13737DisMaxObsL[0] ;
         A13732DisCanRec = P08EQ4_A13732DisCanRec[0] ;
         n13732DisCanRec = P08EQ4_n13732DisCanRec[0] ;
         A13737DisMaxObsL = P08EQ4_A13737DisMaxObsL[0] ;
         n13737DisMaxObsL = P08EQ4_n13737DisMaxObsL[0] ;
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
         h8EQ0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 30, Gx_line+10, 89, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 93, Gx_line+10, 152, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A369DisFec, "99/99/99"), 156, Gx_line+10, 215, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A335DisArtCod, "")), 219, Gx_line+10, 278, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), 282, Gx_line+10, 341, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A362DisColNom, "")), 345, Gx_line+10, 404, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1195DisNomCli, "")), 408, Gx_line+10, 467, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9")), 471, Gx_line+10, 530, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1013DibCli, "")), 534, Gx_line+10, 595, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9")), 599, Gx_line+10, 659, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13737DisMaxObsL), "ZZZ9")), 663, Gx_line+10, 723, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13732DisCanRec), "ZZZ9")), 727, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("WebWNwDP02GridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWNwDP02GridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("WebWNwDP02GridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV115GXV1 = 1 ;
      while ( AV115GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV115GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV21TFDisCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV22TFDisCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV23TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV25TFDisFec = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV27TFDisArtCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV28TFDisArtCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV29TFDisArtDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV30TFDisArtDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV31TFDisColNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV32TFDisColNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV33TFDisNomCli = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV34TFDisNomCli_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV35TFDisColNum = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFDisColNum_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBCLI") == 0 )
         {
            AV37TFDibCli = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBCLI_SEL") == 0 )
         {
            AV38TFDibCli_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIBINT") == 0 )
         {
            AV39TFDibInt = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFDibInt_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISMAXOBSLIN") == 0 )
         {
            AV79TFDisMaxObsLin = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV80TFDisMaxObsLin_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCANREC") == 0 )
         {
            AV81TFDisCanRec = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV82TFDisCanRec_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV115GXV1 = (int)(AV115GXV1+1) ;
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

   public void h8EQ0( boolean bFoot ,
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
               AV53PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV49DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV56Title = AV87Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV56Title = "" ;
      AV12FilterFullText = "" ;
      AV42TFDisCod_To_Description = "" ;
      AV43TFCliCod_To_Description = "" ;
      AV25TFDisFec = GXutil.nullDate() ;
      AV28TFDisArtCod_Sel = "" ;
      AV27TFDisArtCod = "" ;
      AV30TFDisArtDsc_Sel = "" ;
      AV29TFDisArtDsc = "" ;
      AV32TFDisColNom_Sel = "" ;
      AV31TFDisColNom = "" ;
      AV34TFDisNomCli_Sel = "" ;
      AV33TFDisNomCli = "" ;
      AV45TFDisColNum_To_Description = "" ;
      AV38TFDibCli_Sel = "" ;
      AV37TFDibCli = "" ;
      AV46TFDibInt_To_Description = "" ;
      AV83TFDisMaxObsLin_To_Description = "" ;
      AV84TFDisCanRec_To_Description = "" ;
      A369DisFec = GXutil.nullDate() ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1013DibCli = "" ;
      AV91Webwnwdp02ds_1_filterfulltext = "" ;
      AV96Webwnwdp02ds_6_tfdisfec = GXutil.nullDate() ;
      AV97Webwnwdp02ds_7_tfdisartcod = "" ;
      AV98Webwnwdp02ds_8_tfdisartcod_sel = "" ;
      AV99Webwnwdp02ds_9_tfdisartdsc = "" ;
      AV100Webwnwdp02ds_10_tfdisartdsc_sel = "" ;
      AV101Webwnwdp02ds_11_tfdiscolnom = "" ;
      AV102Webwnwdp02ds_12_tfdiscolnom_sel = "" ;
      AV103Webwnwdp02ds_13_tfdisnomcli = "" ;
      AV104Webwnwdp02ds_14_tfdisnomcli_sel = "" ;
      AV107Webwnwdp02ds_17_tfdibcli = "" ;
      AV108Webwnwdp02ds_18_tfdibcli_sel = "" ;
      lV91Webwnwdp02ds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV97Webwnwdp02ds_7_tfdisartcod = "" ;
      lV99Webwnwdp02ds_9_tfdisartdsc = "" ;
      lV101Webwnwdp02ds_11_tfdiscolnom = "" ;
      lV103Webwnwdp02ds_13_tfdisnomcli = "" ;
      lV107Webwnwdp02ds_17_tfdibcli = "" ;
      lV72DisCliNum = "" ;
      lV73DisArtCod = "" ;
      lV74Disartdsc = "" ;
      lV75DisColNom = "" ;
      lV76Disnomcli = "" ;
      AV72DisCliNum = "" ;
      AV73DisArtCod = "" ;
      AV74Disartdsc = "" ;
      AV75DisColNom = "" ;
      AV76Disnomcli = "" ;
      AV77DisUsrcod = "" ;
      A360DisCliNum = "" ;
      A4348DisUsrCod = "" ;
      A757PriCod = "" ;
      AV69pricod = "" ;
      AV68Disfec = GXutil.nullDate() ;
      AV67EmprCod = "" ;
      A396EmprCod = "" ;
      P08EQ4_A4348DisUsrCod = new String[] {""} ;
      P08EQ4_A360DisCliNum = new String[] {""} ;
      P08EQ4_A757PriCod = new String[] {""} ;
      P08EQ4_A396EmprCod = new String[] {""} ;
      P08EQ4_A1014DibInt = new int[1] ;
      P08EQ4_n1014DibInt = new boolean[] {false} ;
      P08EQ4_A1013DibCli = new String[] {""} ;
      P08EQ4_n1013DibCli = new boolean[] {false} ;
      P08EQ4_A363DisColNum = new int[1] ;
      P08EQ4_n363DisColNum = new boolean[] {false} ;
      P08EQ4_A1195DisNomCli = new String[] {""} ;
      P08EQ4_A362DisColNom = new String[] {""} ;
      P08EQ4_n362DisColNom = new boolean[] {false} ;
      P08EQ4_A337DisArtDsc = new String[] {""} ;
      P08EQ4_A335DisArtCod = new String[] {""} ;
      P08EQ4_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08EQ4_A252CliCod = new int[1] ;
      P08EQ4_A361DisCod = new int[1] ;
      P08EQ4_A367DisEst = new byte[1] ;
      P08EQ4_A13732DisCanRec = new short[1] ;
      P08EQ4_n13732DisCanRec = new boolean[] {false} ;
      P08EQ4_A13737DisMaxObsL = new short[1] ;
      P08EQ4_n13737DisMaxObsL = new boolean[] {false} ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV53PageInfo = "" ;
      AV49DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV87Pgmdesc = "" ;
      AV63AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwnwdp02exportreport__default(),
         new Object[] {
             new Object[] {
            P08EQ4_A4348DisUsrCod, P08EQ4_A360DisCliNum, P08EQ4_A757PriCod, P08EQ4_A396EmprCod, P08EQ4_A1014DibInt, P08EQ4_n1014DibInt, P08EQ4_A1013DibCli, P08EQ4_n1013DibCli, P08EQ4_A363DisColNum, P08EQ4_n363DisColNum,
            P08EQ4_A1195DisNomCli, P08EQ4_A362DisColNom, P08EQ4_n362DisColNom, P08EQ4_A337DisArtDsc, P08EQ4_A335DisArtCod, P08EQ4_A369DisFec, P08EQ4_A252CliCod, P08EQ4_A361DisCod, P08EQ4_A367DisEst, P08EQ4_A13732DisCanRec,
            P08EQ4_n13732DisCanRec, P08EQ4_A13737DisMaxObsL, P08EQ4_n13737DisMaxObsL
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV87Pgmdesc = httpContext.getMessage( "Web WNw DP02 Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV87Pgmdesc = httpContext.getMessage( "Web WNw DP02 Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A367DisEst ;
   private short gxcookieaux ;
   private short AV79TFDisMaxObsLin ;
   private short AV80TFDisMaxObsLin_To ;
   private short AV81TFDisCanRec ;
   private short AV82TFDisCanRec_To ;
   private short A13737DisMaxObsL ;
   private short A13732DisCanRec ;
   private short AV111Webwnwdp02ds_21_tfdismaxobslin ;
   private short AV112Webwnwdp02ds_22_tfdismaxobslin_to ;
   private short AV113Webwnwdp02ds_23_tfdiscanrec ;
   private short AV114Webwnwdp02ds_24_tfdiscanrec_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV21TFDisCod ;
   private int AV22TFDisCod_To ;
   private int AV23TFCliCod ;
   private int AV24TFCliCod_To ;
   private int AV35TFDisColNum ;
   private int AV36TFDisColNum_To ;
   private int AV39TFDibInt ;
   private int AV40TFDibInt_To ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1014DibInt ;
   private int AV92Webwnwdp02ds_2_tfdiscod ;
   private int AV93Webwnwdp02ds_3_tfdiscod_to ;
   private int AV94Webwnwdp02ds_4_tfclicod ;
   private int AV95Webwnwdp02ds_5_tfclicod_to ;
   private int AV105Webwnwdp02ds_15_tfdiscolnum ;
   private int AV106Webwnwdp02ds_16_tfdiscolnum_to ;
   private int AV109Webwnwdp02ds_19_tfdibint ;
   private int AV110Webwnwdp02ds_20_tfdibint_to ;
   private int AV70Discodp ;
   private int AV71CliCod ;
   private int AV115GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV28TFDisArtCod_Sel ;
   private String AV27TFDisArtCod ;
   private String AV30TFDisArtDsc_Sel ;
   private String AV29TFDisArtDsc ;
   private String AV32TFDisColNom_Sel ;
   private String AV31TFDisColNom ;
   private String AV34TFDisNomCli_Sel ;
   private String AV33TFDisNomCli ;
   private String AV38TFDibCli_Sel ;
   private String AV37TFDibCli ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A1013DibCli ;
   private String AV97Webwnwdp02ds_7_tfdisartcod ;
   private String AV98Webwnwdp02ds_8_tfdisartcod_sel ;
   private String AV99Webwnwdp02ds_9_tfdisartdsc ;
   private String AV100Webwnwdp02ds_10_tfdisartdsc_sel ;
   private String AV101Webwnwdp02ds_11_tfdiscolnom ;
   private String AV102Webwnwdp02ds_12_tfdiscolnom_sel ;
   private String AV103Webwnwdp02ds_13_tfdisnomcli ;
   private String AV104Webwnwdp02ds_14_tfdisnomcli_sel ;
   private String AV107Webwnwdp02ds_17_tfdibcli ;
   private String AV108Webwnwdp02ds_18_tfdibcli_sel ;
   private String scmdbuf ;
   private String lV97Webwnwdp02ds_7_tfdisartcod ;
   private String lV99Webwnwdp02ds_9_tfdisartdsc ;
   private String lV101Webwnwdp02ds_11_tfdiscolnom ;
   private String lV103Webwnwdp02ds_13_tfdisnomcli ;
   private String lV107Webwnwdp02ds_17_tfdibcli ;
   private String lV72DisCliNum ;
   private String lV73DisArtCod ;
   private String lV74Disartdsc ;
   private String lV75DisColNom ;
   private String lV76Disnomcli ;
   private String AV72DisCliNum ;
   private String AV73DisArtCod ;
   private String AV74Disartdsc ;
   private String AV75DisColNom ;
   private String AV76Disnomcli ;
   private String AV77DisUsrcod ;
   private String A360DisCliNum ;
   private String A4348DisUsrCod ;
   private String A757PriCod ;
   private String AV69pricod ;
   private String AV67EmprCod ;
   private String A396EmprCod ;
   private String AV87Pgmdesc ;
   private java.util.Date AV25TFDisFec ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV96Webwnwdp02ds_6_tfdisfec ;
   private java.util.Date AV68Disfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n13732DisCanRec ;
   private boolean n13737DisMaxObsL ;
   private String AV56Title ;
   private String AV12FilterFullText ;
   private String AV42TFDisCod_To_Description ;
   private String AV43TFCliCod_To_Description ;
   private String AV45TFDisColNum_To_Description ;
   private String AV46TFDibInt_To_Description ;
   private String AV83TFDisMaxObsLin_To_Description ;
   private String AV84TFDisCanRec_To_Description ;
   private String AV91Webwnwdp02ds_1_filterfulltext ;
   private String lV91Webwnwdp02ds_1_filterfulltext ;
   private String AV53PageInfo ;
   private String AV49DateInfo ;
   private String AV63AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08EQ4_A4348DisUsrCod ;
   private String[] P08EQ4_A360DisCliNum ;
   private String[] P08EQ4_A757PriCod ;
   private String[] P08EQ4_A396EmprCod ;
   private int[] P08EQ4_A1014DibInt ;
   private boolean[] P08EQ4_n1014DibInt ;
   private String[] P08EQ4_A1013DibCli ;
   private boolean[] P08EQ4_n1013DibCli ;
   private int[] P08EQ4_A363DisColNum ;
   private boolean[] P08EQ4_n363DisColNum ;
   private String[] P08EQ4_A1195DisNomCli ;
   private String[] P08EQ4_A362DisColNom ;
   private boolean[] P08EQ4_n362DisColNom ;
   private String[] P08EQ4_A337DisArtDsc ;
   private String[] P08EQ4_A335DisArtCod ;
   private java.util.Date[] P08EQ4_A369DisFec ;
   private int[] P08EQ4_A252CliCod ;
   private int[] P08EQ4_A361DisCod ;
   private byte[] P08EQ4_A367DisEst ;
   private short[] P08EQ4_A13732DisCanRec ;
   private boolean[] P08EQ4_n13732DisCanRec ;
   private short[] P08EQ4_A13737DisMaxObsL ;
   private boolean[] P08EQ4_n13737DisMaxObsL ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class webwnwdp02exportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EQ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV92Webwnwdp02ds_2_tfdiscod ,
                                          int AV93Webwnwdp02ds_3_tfdiscod_to ,
                                          int AV94Webwnwdp02ds_4_tfclicod ,
                                          int AV95Webwnwdp02ds_5_tfclicod_to ,
                                          java.util.Date AV96Webwnwdp02ds_6_tfdisfec ,
                                          String AV98Webwnwdp02ds_8_tfdisartcod_sel ,
                                          String AV97Webwnwdp02ds_7_tfdisartcod ,
                                          String AV100Webwnwdp02ds_10_tfdisartdsc_sel ,
                                          String AV99Webwnwdp02ds_9_tfdisartdsc ,
                                          String AV102Webwnwdp02ds_12_tfdiscolnom_sel ,
                                          String AV101Webwnwdp02ds_11_tfdiscolnom ,
                                          String AV104Webwnwdp02ds_14_tfdisnomcli_sel ,
                                          String AV103Webwnwdp02ds_13_tfdisnomcli ,
                                          int AV105Webwnwdp02ds_15_tfdiscolnum ,
                                          int AV106Webwnwdp02ds_16_tfdiscolnum_to ,
                                          String AV108Webwnwdp02ds_18_tfdibcli_sel ,
                                          String AV107Webwnwdp02ds_17_tfdibcli ,
                                          int AV109Webwnwdp02ds_19_tfdibint ,
                                          int AV110Webwnwdp02ds_20_tfdibint_to ,
                                          int AV70Discodp ,
                                          int AV71CliCod ,
                                          String AV72DisCliNum ,
                                          String AV73DisArtCod ,
                                          String AV74Disartdsc ,
                                          String AV75DisColNom ,
                                          String AV76Disnomcli ,
                                          String AV77DisUsrcod ,
                                          int A361DisCod ,
                                          int A252CliCod ,
                                          java.util.Date A369DisFec ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          String A1195DisNomCli ,
                                          int A363DisColNum ,
                                          String A1013DibCli ,
                                          int A1014DibInt ,
                                          String A360DisCliNum ,
                                          String A4348DisUsrCod ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV91Webwnwdp02ds_1_filterfulltext ,
                                          short A13737DisMaxObsL ,
                                          short A13732DisCanRec ,
                                          short AV111Webwnwdp02ds_21_tfdismaxobslin ,
                                          short AV112Webwnwdp02ds_22_tfdismaxobslin_to ,
                                          short AV113Webwnwdp02ds_23_tfdiscanrec ,
                                          short AV114Webwnwdp02ds_24_tfdiscanrec_to ,
                                          String A757PriCod ,
                                          String AV69pricod ,
                                          java.util.Date AV68Disfec ,
                                          String AV67EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[51];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.DisUsrCod, T1.DisCliNum, T1.PriCod, T1.EmprCod, T1.DibInt, T1.DibCli, T1.DisColNum, T1.DisNomCli, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod, T1.DisFec," ;
      scmdbuf += " T1.CliCod, T1.DisCod, T1.DisEst, COALESCE( T2.DisCanRec, 0) AS DisCanRec, COALESCE( T3.DisMaxObsL, 0) AS DisMaxObsL FROM ((TXPDISPOS T1 LEFT JOIN (SELECT COUNT(*)" ;
      scmdbuf += " AS DisCanRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI'" ;
      scmdbuf += " GROUP BY T4.EmprCod, T4.DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT MAX(DisObsLin) AS DisMaxObsL, EmprCod, DisCod FROM TXPOBSERV" ;
      scmdbuf += " GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.DisCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.DisArtCod) like '%' || UPPER(?)) or ( UPPER(T1.DisArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.DisColNom) like '%' || UPPER(?)) or ( UPPER(T1.DisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DisColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.DibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DibInt,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.DisMaxObsL, 0),'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.DisCanRec, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.DisMaxObsL, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.DisCanRec, 0) <= ?))");
      addWhere(sWhereString, "(T1.PriCod = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.DisFec = ?)");
      if ( ! (0==AV92Webwnwdp02ds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Webwnwdp02ds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Webwnwdp02ds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Webwnwdp02ds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Webwnwdp02ds_6_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Webwnwdp02ds_8_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV97Webwnwdp02ds_7_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webwnwdp02ds_8_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Webwnwdp02ds_10_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV99Webwnwdp02ds_9_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Webwnwdp02ds_10_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Webwnwdp02ds_12_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Webwnwdp02ds_11_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Webwnwdp02ds_12_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Webwnwdp02ds_14_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV103Webwnwdp02ds_13_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Webwnwdp02ds_14_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV105Webwnwdp02ds_15_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV106Webwnwdp02ds_16_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Webwnwdp02ds_18_tfdibcli_sel)==0) && ( ! (GXutil.strcmp("", AV107Webwnwdp02ds_17_tfdibcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Webwnwdp02ds_18_tfdibcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DibCli = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV109Webwnwdp02ds_19_tfdibint) )
      {
         addWhere(sWhereString, "(T1.DibInt >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (0==AV110Webwnwdp02ds_20_tfdibint_to) )
      {
         addWhere(sWhereString, "(T1.DibInt <= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (0==AV70Discodp) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (0==AV71CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72DisCliNum)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum like ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73DisArtCod)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod like ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Disartdsc)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc like ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75DisColNom)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom like ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Disnomcli)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli like ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77DisUsrcod)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibCli" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibCli DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibInt" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibInt DESC" ;
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
                  return conditional_P08EQ4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EQ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 13);
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((short[]) buf[19])[0] = rslt.getShort(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(17);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               return;
      }
   }

}

