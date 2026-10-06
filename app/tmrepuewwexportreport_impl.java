package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmrepuewwexportreport_impl extends GXWebReport
{
   public tmrepuewwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV59Title = httpContext.getMessage( "Lista de Respuestos", "") ;
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
         h8BU0( true, 0) ;
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
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV20TFMRNom_Sel)==0) )
      {
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Repuesto", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFMRNom_Sel, "")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFMRNom)==0) )
         {
            h8BU0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Repuesto", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFMRNom, "")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV17TFMRCod) && (0==AV18TFMRCod_To) ) )
      {
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cód", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFMRCod), "ZZZZZZZ9")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFMRCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cód", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFMRCod_To_Description, "")), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFMRCod_To), "ZZZZZZZ9")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFMRCodExt_Sel)==0) )
      {
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Externo", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFMRCodExt_Sel, "")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFMRCodExt)==0) )
         {
            h8BU0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Externo", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFMRCodExt, "")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFMRStkPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFMRStkPre_To)==0) ) )
      {
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TFMRStkPre, "ZZZZZZ9.999")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV46TFMRStkPre_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFMRStkPre_To_Description, "")), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TFMRStkPre_To, "ZZZZZZ9.999")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFMRStkAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFMRStkAct_To)==0) ) )
      {
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Stock Actual", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TFMRStkAct, "Z,ZZZ,ZZZ9.999")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV42TFMRStkAct_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Stock Actual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFMRStkAct_To_Description, "")), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TFMRStkAct_To, "Z,ZZZ,ZZZ9.999")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFMRStkRes)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFMRStkRes_To)==0) ) )
      {
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Stock Reservado", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27TFMRStkRes, "Z,ZZZ,ZZZ9.999")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFMRStkRes_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Stock Reservado", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFMRStkRes_To_Description, "")), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TFMRStkRes_To, "Z,ZZZ,ZZZ9.999")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFMRStkMin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFMRStkMin_To)==0) ) )
      {
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Stock Mínimo", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TFMRStkMin, "Z,ZZZ,ZZZ9.999")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV44TFMRStkMin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Stock Mínimo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFMRStkMin_To_Description, "")), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TFMRStkMin_To, "Z,ZZZ,ZZZ9.999")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFMRStkCri)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFMRStkCri_To)==0) ) )
      {
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Stock Crítico", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TFMRStkCri, "Z,ZZZ,ZZZ9.999")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV45TFMRStkCri_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Stock Crítico", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFMRStkCri_To_Description, "")), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TFMRStkCri_To, "Z,ZZZ,ZZZ9.999")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFMRCodPrv_Sel)==0) )
      {
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Proveedor", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFMRCodPrv_Sel, "")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFMRCodPrv)==0) )
         {
            h8BU0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Proveedor", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFMRCodPrv, "")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV40TFMRActivo_Sel)==0) )
      {
         h8BU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Activo S/N", ""), 25, Gx_line+0, 157, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFMRActivo_Sel, "")), 157, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8BU0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8BU0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Repuesto", ""), 30, Gx_line+10, 140, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cód", ""), 144, Gx_line+10, 199, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Externo", ""), 203, Gx_line+10, 313, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 317, Gx_line+10, 372, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Actual", ""), 376, Gx_line+10, 431, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Reservado", ""), 435, Gx_line+10, 491, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Mínimo", ""), 495, Gx_line+10, 551, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Stock Crítico", ""), 555, Gx_line+10, 611, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Proveedor", ""), 615, Gx_line+10, 727, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Activo S/N", ""), 731, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV90Tmrepuewwds_1_filterfulltext = AV12FilterFullText ;
      AV91Tmrepuewwds_2_tfmrnom = AV19TFMRNom ;
      AV92Tmrepuewwds_3_tfmrnom_sel = AV20TFMRNom_Sel ;
      AV93Tmrepuewwds_4_tfmrcod = AV17TFMRCod ;
      AV94Tmrepuewwds_5_tfmrcod_to = AV18TFMRCod_To ;
      AV95Tmrepuewwds_6_tfmrcodext = AV21TFMRCodExt ;
      AV96Tmrepuewwds_7_tfmrcodext_sel = AV22TFMRCodExt_Sel ;
      AV97Tmrepuewwds_8_tfmrstkpre = AV33TFMRStkPre ;
      AV98Tmrepuewwds_9_tfmrstkpre_to = AV34TFMRStkPre_To ;
      AV99Tmrepuewwds_10_tfmrstkact = AV25TFMRStkAct ;
      AV100Tmrepuewwds_11_tfmrstkact_to = AV26TFMRStkAct_To ;
      AV101Tmrepuewwds_12_tfmrstkres = AV27TFMRStkRes ;
      AV102Tmrepuewwds_13_tfmrstkres_to = AV28TFMRStkRes_To ;
      AV103Tmrepuewwds_14_tfmrstkmin = AV29TFMRStkMin ;
      AV104Tmrepuewwds_15_tfmrstkmin_to = AV30TFMRStkMin_To ;
      AV105Tmrepuewwds_16_tfmrstkcri = AV31TFMRStkCri ;
      AV106Tmrepuewwds_17_tfmrstkcri_to = AV32TFMRStkCri_To ;
      AV107Tmrepuewwds_18_tfmrcodprv = AV23TFMRCodPrv ;
      AV108Tmrepuewwds_19_tfmrcodprv_sel = AV24TFMRCodPrv_Sel ;
      AV109Tmrepuewwds_20_tfmractivo_sel = AV40TFMRActivo_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV90Tmrepuewwds_1_filterfulltext ,
                                           AV92Tmrepuewwds_3_tfmrnom_sel ,
                                           AV91Tmrepuewwds_2_tfmrnom ,
                                           Integer.valueOf(AV93Tmrepuewwds_4_tfmrcod) ,
                                           Integer.valueOf(AV94Tmrepuewwds_5_tfmrcod_to) ,
                                           AV96Tmrepuewwds_7_tfmrcodext_sel ,
                                           AV95Tmrepuewwds_6_tfmrcodext ,
                                           AV97Tmrepuewwds_8_tfmrstkpre ,
                                           AV98Tmrepuewwds_9_tfmrstkpre_to ,
                                           AV99Tmrepuewwds_10_tfmrstkact ,
                                           AV100Tmrepuewwds_11_tfmrstkact_to ,
                                           AV101Tmrepuewwds_12_tfmrstkres ,
                                           AV102Tmrepuewwds_13_tfmrstkres_to ,
                                           AV103Tmrepuewwds_14_tfmrstkmin ,
                                           AV104Tmrepuewwds_15_tfmrstkmin_to ,
                                           AV105Tmrepuewwds_16_tfmrstkcri ,
                                           AV106Tmrepuewwds_17_tfmrstkcri_to ,
                                           AV108Tmrepuewwds_19_tfmrcodprv_sel ,
                                           AV107Tmrepuewwds_18_tfmrcodprv ,
                                           AV109Tmrepuewwds_20_tfmractivo_sel ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A9494MRCodExt ,
                                           A9499MRStkPre ,
                                           A9495MRStkAct ,
                                           A9496MRStkRes ,
                                           A9497MRStkMin ,
                                           A9498MRStkCri ,
                                           A11458MRCodPrv ,
                                           A12850MRActivo ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV90Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV90Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV90Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV90Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV90Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV90Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV90Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV90Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV90Tmrepuewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Tmrepuewwds_1_filterfulltext), "%", "") ;
      lV91Tmrepuewwds_2_tfmrnom = GXutil.padr( GXutil.rtrim( AV91Tmrepuewwds_2_tfmrnom), 30, "%") ;
      lV95Tmrepuewwds_6_tfmrcodext = GXutil.padr( GXutil.rtrim( AV95Tmrepuewwds_6_tfmrcodext), 20, "%") ;
      lV107Tmrepuewwds_18_tfmrcodprv = GXutil.padr( GXutil.rtrim( AV107Tmrepuewwds_18_tfmrcodprv), 20, "%") ;
      /* Using cursor P08BU2 */
      pr_default.execute(0, new Object[] {lV90Tmrepuewwds_1_filterfulltext, lV90Tmrepuewwds_1_filterfulltext, lV90Tmrepuewwds_1_filterfulltext, lV90Tmrepuewwds_1_filterfulltext, lV90Tmrepuewwds_1_filterfulltext, lV90Tmrepuewwds_1_filterfulltext, lV90Tmrepuewwds_1_filterfulltext, lV90Tmrepuewwds_1_filterfulltext, lV90Tmrepuewwds_1_filterfulltext, lV91Tmrepuewwds_2_tfmrnom, AV92Tmrepuewwds_3_tfmrnom_sel, Integer.valueOf(AV93Tmrepuewwds_4_tfmrcod), Integer.valueOf(AV94Tmrepuewwds_5_tfmrcod_to), lV95Tmrepuewwds_6_tfmrcodext, AV96Tmrepuewwds_7_tfmrcodext_sel, AV97Tmrepuewwds_8_tfmrstkpre, AV98Tmrepuewwds_9_tfmrstkpre_to, AV99Tmrepuewwds_10_tfmrstkact, AV100Tmrepuewwds_11_tfmrstkact_to, AV101Tmrepuewwds_12_tfmrstkres, AV102Tmrepuewwds_13_tfmrstkres_to, AV103Tmrepuewwds_14_tfmrstkmin, AV104Tmrepuewwds_15_tfmrstkmin_to, AV105Tmrepuewwds_16_tfmrstkcri, AV106Tmrepuewwds_17_tfmrstkcri_to, lV107Tmrepuewwds_18_tfmrcodprv, AV108Tmrepuewwds_19_tfmrcodprv_sel, AV109Tmrepuewwds_20_tfmractivo_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12850MRActivo = P08BU2_A12850MRActivo[0] ;
         n12850MRActivo = P08BU2_n12850MRActivo[0] ;
         A11458MRCodPrv = P08BU2_A11458MRCodPrv[0] ;
         n11458MRCodPrv = P08BU2_n11458MRCodPrv[0] ;
         A9498MRStkCri = P08BU2_A9498MRStkCri[0] ;
         n9498MRStkCri = P08BU2_n9498MRStkCri[0] ;
         A9497MRStkMin = P08BU2_A9497MRStkMin[0] ;
         n9497MRStkMin = P08BU2_n9497MRStkMin[0] ;
         A9496MRStkRes = P08BU2_A9496MRStkRes[0] ;
         n9496MRStkRes = P08BU2_n9496MRStkRes[0] ;
         A9495MRStkAct = P08BU2_A9495MRStkAct[0] ;
         n9495MRStkAct = P08BU2_n9495MRStkAct[0] ;
         A9499MRStkPre = P08BU2_A9499MRStkPre[0] ;
         n9499MRStkPre = P08BU2_n9499MRStkPre[0] ;
         A9494MRCodExt = P08BU2_A9494MRCodExt[0] ;
         n9494MRCodExt = P08BU2_n9494MRCodExt[0] ;
         A9492MRCod = P08BU2_A9492MRCod[0] ;
         A9493MRNom = P08BU2_A9493MRNom[0] ;
         n9493MRNom = P08BU2_n9493MRNom[0] ;
         A396EmprCod = P08BU2_A396EmprCod[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h8BU0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9493MRNom, "")), 30, Gx_line+10, 140, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9")), 144, Gx_line+10, 199, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9494MRCodExt, "")), 203, Gx_line+10, 313, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9499MRStkPre, "ZZZZZZ9.999")), 317, Gx_line+10, 372, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9495MRStkAct, "Z,ZZZ,ZZZ9.999")), 376, Gx_line+10, 431, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9496MRStkRes, "Z,ZZZ,ZZZ9.999")), 435, Gx_line+10, 491, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9497MRStkMin, "Z,ZZZ,ZZZ9.999")), 495, Gx_line+10, 551, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9498MRStkCri, "Z,ZZZ,ZZZ9.999")), 555, Gx_line+10, 611, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11458MRCodPrv, "")), 615, Gx_line+10, 727, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12850MRActivo, "")), 731, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
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
      if ( GXutil.strcmp(AV13Session.getValue("TMRepueWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMRepueWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("TMRepueWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV110GXV1 = 1 ;
      while ( AV110GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV110GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM") == 0 )
         {
            AV19TFMRNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM_SEL") == 0 )
         {
            AV20TFMRNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOD") == 0 )
         {
            AV17TFMRCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV18TFMRCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODEXT") == 0 )
         {
            AV21TFMRCodExt = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODEXT_SEL") == 0 )
         {
            AV22TFMRCodExt_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKPRE") == 0 )
         {
            AV33TFMRStkPre = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV34TFMRStkPre_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKACT") == 0 )
         {
            AV25TFMRStkAct = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV26TFMRStkAct_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKRES") == 0 )
         {
            AV27TFMRStkRes = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV28TFMRStkRes_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKMIN") == 0 )
         {
            AV29TFMRStkMin = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV30TFMRStkMin_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRSTKCRI") == 0 )
         {
            AV31TFMRStkCri = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV32TFMRStkCri_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODPRV") == 0 )
         {
            AV23TFMRCodPrv = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCODPRV_SEL") == 0 )
         {
            AV24TFMRCodPrv_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRACTIVO_SEL") == 0 )
         {
            AV40TFMRActivo_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV110GXV1 = (int)(AV110GXV1+1) ;
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

   public void h8BU0( boolean bFoot ,
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
               AV57PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV54DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV59Title = AV86Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV59Title = "" ;
      AV12FilterFullText = "" ;
      AV20TFMRNom_Sel = "" ;
      AV19TFMRNom = "" ;
      AV41TFMRCod_To_Description = "" ;
      AV22TFMRCodExt_Sel = "" ;
      AV21TFMRCodExt = "" ;
      AV33TFMRStkPre = DecimalUtil.ZERO ;
      AV34TFMRStkPre_To = DecimalUtil.ZERO ;
      AV46TFMRStkPre_To_Description = "" ;
      AV25TFMRStkAct = DecimalUtil.ZERO ;
      AV26TFMRStkAct_To = DecimalUtil.ZERO ;
      AV42TFMRStkAct_To_Description = "" ;
      AV27TFMRStkRes = DecimalUtil.ZERO ;
      AV28TFMRStkRes_To = DecimalUtil.ZERO ;
      AV43TFMRStkRes_To_Description = "" ;
      AV29TFMRStkMin = DecimalUtil.ZERO ;
      AV30TFMRStkMin_To = DecimalUtil.ZERO ;
      AV44TFMRStkMin_To_Description = "" ;
      AV31TFMRStkCri = DecimalUtil.ZERO ;
      AV32TFMRStkCri_To = DecimalUtil.ZERO ;
      AV45TFMRStkCri_To_Description = "" ;
      AV24TFMRCodPrv_Sel = "" ;
      AV23TFMRCodPrv = "" ;
      AV40TFMRActivo_Sel = "" ;
      A9493MRNom = "" ;
      A9494MRCodExt = "" ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      A9496MRStkRes = DecimalUtil.ZERO ;
      A9497MRStkMin = DecimalUtil.ZERO ;
      A9498MRStkCri = DecimalUtil.ZERO ;
      A11458MRCodPrv = "" ;
      A12850MRActivo = "" ;
      AV90Tmrepuewwds_1_filterfulltext = "" ;
      AV91Tmrepuewwds_2_tfmrnom = "" ;
      AV92Tmrepuewwds_3_tfmrnom_sel = "" ;
      AV95Tmrepuewwds_6_tfmrcodext = "" ;
      AV96Tmrepuewwds_7_tfmrcodext_sel = "" ;
      AV97Tmrepuewwds_8_tfmrstkpre = DecimalUtil.ZERO ;
      AV98Tmrepuewwds_9_tfmrstkpre_to = DecimalUtil.ZERO ;
      AV99Tmrepuewwds_10_tfmrstkact = DecimalUtil.ZERO ;
      AV100Tmrepuewwds_11_tfmrstkact_to = DecimalUtil.ZERO ;
      AV101Tmrepuewwds_12_tfmrstkres = DecimalUtil.ZERO ;
      AV102Tmrepuewwds_13_tfmrstkres_to = DecimalUtil.ZERO ;
      AV103Tmrepuewwds_14_tfmrstkmin = DecimalUtil.ZERO ;
      AV104Tmrepuewwds_15_tfmrstkmin_to = DecimalUtil.ZERO ;
      AV105Tmrepuewwds_16_tfmrstkcri = DecimalUtil.ZERO ;
      AV106Tmrepuewwds_17_tfmrstkcri_to = DecimalUtil.ZERO ;
      AV107Tmrepuewwds_18_tfmrcodprv = "" ;
      AV108Tmrepuewwds_19_tfmrcodprv_sel = "" ;
      AV109Tmrepuewwds_20_tfmractivo_sel = "" ;
      scmdbuf = "" ;
      lV90Tmrepuewwds_1_filterfulltext = "" ;
      lV91Tmrepuewwds_2_tfmrnom = "" ;
      lV95Tmrepuewwds_6_tfmrcodext = "" ;
      lV107Tmrepuewwds_18_tfmrcodprv = "" ;
      P08BU2_A12850MRActivo = new String[] {""} ;
      P08BU2_n12850MRActivo = new boolean[] {false} ;
      P08BU2_A11458MRCodPrv = new String[] {""} ;
      P08BU2_n11458MRCodPrv = new boolean[] {false} ;
      P08BU2_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BU2_n9498MRStkCri = new boolean[] {false} ;
      P08BU2_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BU2_n9497MRStkMin = new boolean[] {false} ;
      P08BU2_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BU2_n9496MRStkRes = new boolean[] {false} ;
      P08BU2_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BU2_n9495MRStkAct = new boolean[] {false} ;
      P08BU2_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BU2_n9499MRStkPre = new boolean[] {false} ;
      P08BU2_A9494MRCodExt = new String[] {""} ;
      P08BU2_n9494MRCodExt = new boolean[] {false} ;
      P08BU2_A9492MRCod = new int[1] ;
      P08BU2_A9493MRNom = new String[] {""} ;
      P08BU2_n9493MRNom = new boolean[] {false} ;
      P08BU2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV57PageInfo = "" ;
      AV54DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV86Pgmdesc = "" ;
      AV52AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmrepuewwexportreport__default(),
         new Object[] {
             new Object[] {
            P08BU2_A12850MRActivo, P08BU2_n12850MRActivo, P08BU2_A11458MRCodPrv, P08BU2_n11458MRCodPrv, P08BU2_A9498MRStkCri, P08BU2_n9498MRStkCri, P08BU2_A9497MRStkMin, P08BU2_n9497MRStkMin, P08BU2_A9496MRStkRes, P08BU2_n9496MRStkRes,
            P08BU2_A9495MRStkAct, P08BU2_n9495MRStkAct, P08BU2_A9499MRStkPre, P08BU2_n9499MRStkPre, P08BU2_A9494MRCodExt, P08BU2_n9494MRCodExt, P08BU2_A9492MRCod, P08BU2_A9493MRNom, P08BU2_n9493MRNom, P08BU2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV86Pgmdesc = httpContext.getMessage( "Lista de Respuestos", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV86Pgmdesc = httpContext.getMessage( "Lista de Respuestos", "") ;
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
   private int AV17TFMRCod ;
   private int AV18TFMRCod_To ;
   private int A9492MRCod ;
   private int AV93Tmrepuewwds_4_tfmrcod ;
   private int AV94Tmrepuewwds_5_tfmrcod_to ;
   private int AV110GXV1 ;
   private java.math.BigDecimal AV33TFMRStkPre ;
   private java.math.BigDecimal AV34TFMRStkPre_To ;
   private java.math.BigDecimal AV25TFMRStkAct ;
   private java.math.BigDecimal AV26TFMRStkAct_To ;
   private java.math.BigDecimal AV27TFMRStkRes ;
   private java.math.BigDecimal AV28TFMRStkRes_To ;
   private java.math.BigDecimal AV29TFMRStkMin ;
   private java.math.BigDecimal AV30TFMRStkMin_To ;
   private java.math.BigDecimal AV31TFMRStkCri ;
   private java.math.BigDecimal AV32TFMRStkCri_To ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal A9496MRStkRes ;
   private java.math.BigDecimal A9497MRStkMin ;
   private java.math.BigDecimal A9498MRStkCri ;
   private java.math.BigDecimal AV97Tmrepuewwds_8_tfmrstkpre ;
   private java.math.BigDecimal AV98Tmrepuewwds_9_tfmrstkpre_to ;
   private java.math.BigDecimal AV99Tmrepuewwds_10_tfmrstkact ;
   private java.math.BigDecimal AV100Tmrepuewwds_11_tfmrstkact_to ;
   private java.math.BigDecimal AV101Tmrepuewwds_12_tfmrstkres ;
   private java.math.BigDecimal AV102Tmrepuewwds_13_tfmrstkres_to ;
   private java.math.BigDecimal AV103Tmrepuewwds_14_tfmrstkmin ;
   private java.math.BigDecimal AV104Tmrepuewwds_15_tfmrstkmin_to ;
   private java.math.BigDecimal AV105Tmrepuewwds_16_tfmrstkcri ;
   private java.math.BigDecimal AV106Tmrepuewwds_17_tfmrstkcri_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV20TFMRNom_Sel ;
   private String AV19TFMRNom ;
   private String AV22TFMRCodExt_Sel ;
   private String AV21TFMRCodExt ;
   private String AV24TFMRCodPrv_Sel ;
   private String AV23TFMRCodPrv ;
   private String AV40TFMRActivo_Sel ;
   private String A9493MRNom ;
   private String A9494MRCodExt ;
   private String A11458MRCodPrv ;
   private String A12850MRActivo ;
   private String AV91Tmrepuewwds_2_tfmrnom ;
   private String AV92Tmrepuewwds_3_tfmrnom_sel ;
   private String AV95Tmrepuewwds_6_tfmrcodext ;
   private String AV96Tmrepuewwds_7_tfmrcodext_sel ;
   private String AV107Tmrepuewwds_18_tfmrcodprv ;
   private String AV108Tmrepuewwds_19_tfmrcodprv_sel ;
   private String AV109Tmrepuewwds_20_tfmractivo_sel ;
   private String scmdbuf ;
   private String lV91Tmrepuewwds_2_tfmrnom ;
   private String lV95Tmrepuewwds_6_tfmrcodext ;
   private String lV107Tmrepuewwds_18_tfmrcodprv ;
   private String A396EmprCod ;
   private String AV86Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n12850MRActivo ;
   private boolean n11458MRCodPrv ;
   private boolean n9498MRStkCri ;
   private boolean n9497MRStkMin ;
   private boolean n9496MRStkRes ;
   private boolean n9495MRStkAct ;
   private boolean n9499MRStkPre ;
   private boolean n9494MRCodExt ;
   private boolean n9493MRNom ;
   private String AV59Title ;
   private String AV12FilterFullText ;
   private String AV41TFMRCod_To_Description ;
   private String AV46TFMRStkPre_To_Description ;
   private String AV42TFMRStkAct_To_Description ;
   private String AV43TFMRStkRes_To_Description ;
   private String AV44TFMRStkMin_To_Description ;
   private String AV45TFMRStkCri_To_Description ;
   private String AV90Tmrepuewwds_1_filterfulltext ;
   private String lV90Tmrepuewwds_1_filterfulltext ;
   private String AV57PageInfo ;
   private String AV54DateInfo ;
   private String AV52AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08BU2_A12850MRActivo ;
   private boolean[] P08BU2_n12850MRActivo ;
   private String[] P08BU2_A11458MRCodPrv ;
   private boolean[] P08BU2_n11458MRCodPrv ;
   private java.math.BigDecimal[] P08BU2_A9498MRStkCri ;
   private boolean[] P08BU2_n9498MRStkCri ;
   private java.math.BigDecimal[] P08BU2_A9497MRStkMin ;
   private boolean[] P08BU2_n9497MRStkMin ;
   private java.math.BigDecimal[] P08BU2_A9496MRStkRes ;
   private boolean[] P08BU2_n9496MRStkRes ;
   private java.math.BigDecimal[] P08BU2_A9495MRStkAct ;
   private boolean[] P08BU2_n9495MRStkAct ;
   private java.math.BigDecimal[] P08BU2_A9499MRStkPre ;
   private boolean[] P08BU2_n9499MRStkPre ;
   private String[] P08BU2_A9494MRCodExt ;
   private boolean[] P08BU2_n9494MRCodExt ;
   private int[] P08BU2_A9492MRCod ;
   private String[] P08BU2_A9493MRNom ;
   private boolean[] P08BU2_n9493MRNom ;
   private String[] P08BU2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class tmrepuewwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV90Tmrepuewwds_1_filterfulltext ,
                                          String AV92Tmrepuewwds_3_tfmrnom_sel ,
                                          String AV91Tmrepuewwds_2_tfmrnom ,
                                          int AV93Tmrepuewwds_4_tfmrcod ,
                                          int AV94Tmrepuewwds_5_tfmrcod_to ,
                                          String AV96Tmrepuewwds_7_tfmrcodext_sel ,
                                          String AV95Tmrepuewwds_6_tfmrcodext ,
                                          java.math.BigDecimal AV97Tmrepuewwds_8_tfmrstkpre ,
                                          java.math.BigDecimal AV98Tmrepuewwds_9_tfmrstkpre_to ,
                                          java.math.BigDecimal AV99Tmrepuewwds_10_tfmrstkact ,
                                          java.math.BigDecimal AV100Tmrepuewwds_11_tfmrstkact_to ,
                                          java.math.BigDecimal AV101Tmrepuewwds_12_tfmrstkres ,
                                          java.math.BigDecimal AV102Tmrepuewwds_13_tfmrstkres_to ,
                                          java.math.BigDecimal AV103Tmrepuewwds_14_tfmrstkmin ,
                                          java.math.BigDecimal AV104Tmrepuewwds_15_tfmrstkmin_to ,
                                          java.math.BigDecimal AV105Tmrepuewwds_16_tfmrstkcri ,
                                          java.math.BigDecimal AV106Tmrepuewwds_17_tfmrstkcri_to ,
                                          String AV108Tmrepuewwds_19_tfmrcodprv_sel ,
                                          String AV107Tmrepuewwds_18_tfmrcodprv ,
                                          String AV109Tmrepuewwds_20_tfmractivo_sel ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          String A9494MRCodExt ,
                                          java.math.BigDecimal A9499MRStkPre ,
                                          java.math.BigDecimal A9495MRStkAct ,
                                          java.math.BigDecimal A9496MRStkRes ,
                                          java.math.BigDecimal A9497MRStkMin ,
                                          java.math.BigDecimal A9498MRStkCri ,
                                          String A11458MRCodPrv ,
                                          String A12850MRActivo ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[28];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MRActivo, MRCodPrv, MRStkCri, MRStkMin, MRStkRes, MRStkAct, MRStkPre, MRCodExt, MRCod, MRNom, EmprCod FROM TXPMREPUE" ;
      if ( ! (GXutil.strcmp("", AV90Tmrepuewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRCod,'99999990'), 2) like '%' || ?) or ( UPPER(MRCodExt) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRStkPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkAct,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkRes,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkMin,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRStkCri,'99999990.999'), 2) like '%' || ?) or ( UPPER(MRCodPrv) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV92Tmrepuewwds_3_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Tmrepuewwds_2_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tmrepuewwds_3_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(MRNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV93Tmrepuewwds_4_tfmrcod) )
      {
         addWhere(sWhereString, "(MRCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV94Tmrepuewwds_5_tfmrcod_to) )
      {
         addWhere(sWhereString, "(MRCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tmrepuewwds_7_tfmrcodext_sel)==0) && ( ! (GXutil.strcmp("", AV95Tmrepuewwds_6_tfmrcodext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tmrepuewwds_7_tfmrcodext_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodExt = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Tmrepuewwds_8_tfmrstkpre)==0) )
      {
         addWhere(sWhereString, "(MRStkPre >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tmrepuewwds_9_tfmrstkpre_to)==0) )
      {
         addWhere(sWhereString, "(MRStkPre <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Tmrepuewwds_10_tfmrstkact)==0) )
      {
         addWhere(sWhereString, "(MRStkAct >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Tmrepuewwds_11_tfmrstkact_to)==0) )
      {
         addWhere(sWhereString, "(MRStkAct <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Tmrepuewwds_12_tfmrstkres)==0) )
      {
         addWhere(sWhereString, "(MRStkRes >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tmrepuewwds_13_tfmrstkres_to)==0) )
      {
         addWhere(sWhereString, "(MRStkRes <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Tmrepuewwds_14_tfmrstkmin)==0) )
      {
         addWhere(sWhereString, "(MRStkMin >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tmrepuewwds_15_tfmrstkmin_to)==0) )
      {
         addWhere(sWhereString, "(MRStkMin <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tmrepuewwds_16_tfmrstkcri)==0) )
      {
         addWhere(sWhereString, "(MRStkCri >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tmrepuewwds_17_tfmrstkcri_to)==0) )
      {
         addWhere(sWhereString, "(MRStkCri <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tmrepuewwds_19_tfmrcodprv_sel)==0) && ( ! (GXutil.strcmp("", AV107Tmrepuewwds_18_tfmrcodprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRCodPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tmrepuewwds_19_tfmrcodprv_sel)==0) )
      {
         addWhere(sWhereString, "(MRCodPrv = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tmrepuewwds_20_tfmractivo_sel)==0) )
      {
         addWhere(sWhereString, "(MRActivo = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MRCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MRNom" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MRCodExt" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRCodExt DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkPre" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkPre DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkAct" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkAct DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkRes" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkRes DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkMin" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkMin DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MRStkCri" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRStkCri DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MRCodPrv" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRCodPrv DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MRActivo" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MRActivo DESC" ;
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
                  return conditional_P08BU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               return;
      }
   }

}

