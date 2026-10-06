package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeproductos_wcexportreport_impl extends GXWebReport
{
   public listadodeproductos_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV113Title = httpContext.getMessage( "Lista de Mantenimiento de Productos Quimicos", "") ;
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
         h9UY0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV15FilterFullText)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFPrdNum_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFPrdNum_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFPrdNum)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFPrdNum, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFPrdNom_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFPrdNom_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFPrdNom)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFPrdNom, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFPrdExiAlm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFPrdExiAlm_To)==0) ) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Existencias Almacen", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TFPrdExiAlm, "ZZZZZZ9.9999")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV90TFPrdExiAlm_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Existencias Almacen", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90TFPrdExiAlm_To_Description, "")), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TFPrdExiAlm_To, "ZZZZZZ9.9999")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFPrdCanRes)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFPrdCanRes_To)==0) ) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Reservada", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TFPrdCanRes, "ZZZZZZ9.9999")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV91TFPrdCanRes_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad Reservada", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91TFPrdCanRes_To_Description, "")), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TFPrdCanRes_To, "ZZZZZZ9.9999")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFPrdDisponible)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFPrdDisponible_To)==0) ) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Disponible", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TFPrdDisponible, "ZZZZZZ9.9999")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV92TFPrdDisponible_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Disponible", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92TFPrdDisponible_To_Description, "")), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TFPrdDisponible_To, "ZZZZZZ9.9999")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFPrdCanPen)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFPrdCanPen_To)==0) ) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Pdte. Recibir", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TFPrdCanPen, "ZZZZZZ9.9999")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV93TFPrdCanPen_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Pdte. Recibir", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TFPrdCanPen_To_Description, "")), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFPrdCanPen_To, "ZZZZZZ9.9999")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFPrdPreAct)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdPreAct_To)==0) ) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TFPrdPreAct, "ZZZZZZZ9.999")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV94TFPrdPreAct_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio Actual", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94TFPrdPreAct_To_Description, "")), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37TFPrdPreAct_To, "ZZZZZZZ9.999")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFTipPrdDsc_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo Producto", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFTipPrdDsc_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38TFTipPrdDsc)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Producto", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFTipPrdDsc, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV41TFValDsc_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Validez", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFValDsc_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV40TFValDsc)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Validez", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFValDsc, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV43TFPrdRec_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "R?", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFPrdRec_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV42TFPrdRec)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "R?", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFPrdRec, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFPrdAox)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFPrdAox_To)==0) ) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "AOX", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44TFPrdAox, "ZZ9.99")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV95TFPrdAox_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "AOX", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95TFPrdAox_To_Description, "")), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45TFPrdAox_To, "ZZ9.99")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFPrdGots_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "GOTS", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFPrdGots_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFPrdGots)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "GOTS", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFPrdGots, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV49TFPrdReach_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "REACH", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFPrdReach_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV48TFPrdReach)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "REACH", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFPrdReach, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV52TFPrdOkotex_Sels.fromJSonString(AV50TFPrdOkotex_SelsJson, null);
      if ( ! ( AV52TFPrdOkotex_Sels.size() == 0 ) )
      {
         AV102i = 1 ;
         AV120GXV1 = 1 ;
         while ( AV120GXV1 <= AV52TFPrdOkotex_Sels.size() )
         {
            AV53TFPrdOkotex_Sel = (String)AV52TFPrdOkotex_Sels.elementAt(-1+AV120GXV1) ;
            if ( AV102i == 1 )
            {
               AV51TFPrdOkotex_SelDscs = "" ;
            }
            else
            {
               AV51TFPrdOkotex_SelDscs += ", " ;
            }
            AV96FilterTFPrdOkotex_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV53TFPrdOkotex_Sel), "N") == 0 )
            {
               AV96FilterTFPrdOkotex_SelValueDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV53TFPrdOkotex_Sel), "S") == 0 )
            {
               AV96FilterTFPrdOkotex_SelValueDescription = httpContext.getMessage( "S", "") ;
            }
            AV51TFPrdOkotex_SelDscs += AV96FilterTFPrdOkotex_SelValueDescription ;
            AV102i = (long)(AV102i+1) ;
            AV120GXV1 = (int)(AV120GXV1+1) ;
         }
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Oeko Tex", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFPrdOkotex_SelDscs, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFPrdHm_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "HM", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFPrdHm_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV54TFPrdHm)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "HM", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFPrdHm, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV58TFPrdZDHC_Sels.fromJSonString(AV56TFPrdZDHC_SelsJson, null);
      if ( ! ( AV58TFPrdZDHC_Sels.size() == 0 ) )
      {
         AV102i = 1 ;
         AV121GXV2 = 1 ;
         while ( AV121GXV2 <= AV58TFPrdZDHC_Sels.size() )
         {
            AV59TFPrdZDHC_Sel = (String)AV58TFPrdZDHC_Sels.elementAt(-1+AV121GXV2) ;
            if ( AV102i == 1 )
            {
               AV57TFPrdZDHC_SelDscs = "" ;
            }
            else
            {
               AV57TFPrdZDHC_SelDscs += ", " ;
            }
            AV97FilterTFPrdZDHC_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV59TFPrdZDHC_Sel), "N") == 0 )
            {
               AV97FilterTFPrdZDHC_SelValueDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV59TFPrdZDHC_Sel), "1") == 0 )
            {
               AV97FilterTFPrdZDHC_SelValueDescription = httpContext.getMessage( "Nivel 1", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV59TFPrdZDHC_Sel), "2") == 0 )
            {
               AV97FilterTFPrdZDHC_SelValueDescription = httpContext.getMessage( "Nivel 2", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV59TFPrdZDHC_Sel), "3") == 0 )
            {
               AV97FilterTFPrdZDHC_SelValueDescription = httpContext.getMessage( "Nivel 3", "") ;
            }
            AV57TFPrdZDHC_SelDscs += AV97FilterTFPrdZDHC_SelValueDescription ;
            AV102i = (long)(AV102i+1) ;
            AV121GXV2 = (int)(AV121GXV2+1) ;
         }
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ZDHC", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFPrdZDHC_SelDscs, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV62TFPrdList_Sels.fromJSonString(AV60TFPrdList_SelsJson, null);
      if ( ! ( AV62TFPrdList_Sels.size() == 0 ) )
      {
         AV102i = 1 ;
         AV122GXV3 = 1 ;
         while ( AV122GXV3 <= AV62TFPrdList_Sels.size() )
         {
            AV63TFPrdList_Sel = (String)AV62TFPrdList_Sels.elementAt(-1+AV122GXV3) ;
            if ( AV102i == 1 )
            {
               AV61TFPrdList_SelDscs = "" ;
            }
            else
            {
               AV61TFPrdList_SelDscs += ", " ;
            }
            AV98FilterTFPrdList_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV63TFPrdList_Sel), "S") == 0 )
            {
               AV98FilterTFPrdList_SelValueDescription = httpContext.getMessage( "S", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV63TFPrdList_Sel), "N") == 0 )
            {
               AV98FilterTFPrdList_SelValueDescription = httpContext.getMessage( "N", "") ;
            }
            AV61TFPrdList_SelDscs += AV98FilterTFPrdList_SelValueDescription ;
            AV102i = (long)(AV102i+1) ;
            AV122GXV3 = (int)(AV122GXV3+1) ;
         }
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "List by Inditex ", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFPrdList_SelDscs, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV65TFPrdTHELIST_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "THELIST", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFPrdTHELIST_Sel, "@!")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV64TFPrdTHELIST)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "THELIST", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFPrdTHELIST, "@!")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV68TFPrdGRS_Sels.fromJSonString(AV66TFPrdGRS_SelsJson, null);
      if ( ! ( AV68TFPrdGRS_Sels.size() == 0 ) )
      {
         AV102i = 1 ;
         AV123GXV4 = 1 ;
         while ( AV123GXV4 <= AV68TFPrdGRS_Sels.size() )
         {
            AV69TFPrdGRS_Sel = (String)AV68TFPrdGRS_Sels.elementAt(-1+AV123GXV4) ;
            if ( AV102i == 1 )
            {
               AV67TFPrdGRS_SelDscs = "" ;
            }
            else
            {
               AV67TFPrdGRS_SelDscs += ", " ;
            }
            AV99FilterTFPrdGRS_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV69TFPrdGRS_Sel), "N") == 0 )
            {
               AV99FilterTFPrdGRS_SelValueDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV69TFPrdGRS_Sel), "S") == 0 )
            {
               AV99FilterTFPrdGRS_SelValueDescription = httpContext.getMessage( "S", "") ;
            }
            AV67TFPrdGRS_SelDscs += AV99FilterTFPrdGRS_SelValueDescription ;
            AV102i = (long)(AV102i+1) ;
            AV123GXV4 = (int)(AV123GXV4+1) ;
         }
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "GRS", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67TFPrdGRS_SelDscs, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV71TFPrdHS_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hoja?", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFPrdHS_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV70TFPrdHS)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hoja?", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFPrdHS, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72TFPrdFHS)) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV72TFPrdFHS, "99/99/99"), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV75TFPrdNum2_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFPrdNum2_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV74TFPrdNum2)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFPrdNum2, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV77TFPrdNom2_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "NOmbre", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFPrdNom2_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV76TFPrdNom2)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "NOmbre", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TFPrdNom2, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV79TFPrdRefPrv_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Referencia Proveedor", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFPrdRefPrv_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV78TFPrdRefPrv)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Referencia Proveedor", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFPrdRefPrv, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV81TFPrdFuncion_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Funcion", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81TFPrdFuncion_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV80TFPrdFuncion)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Funcion", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFPrdFuncion, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV83TFPrdEINECS_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N EINECS", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83TFPrdEINECS_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV82TFPrdEINECS)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N EINECS", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82TFPrdEINECS, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV85TFPrdNCAS_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº CAS", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85TFPrdNCAS_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV84TFPrdNCAS)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº CAS", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84TFPrdNCAS, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV86TFPrvNum) && (0==AV87TFPrvNum_To) ) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV86TFPrvNum), "ZZZZZ9")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV101TFPrvNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Proveedor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101TFPrvNum_To_Description, "")), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV87TFPrvNum_To), "ZZZZZ9")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV89TFPrvNom_Sel)==0) )
      {
         h9UY0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89TFPrvNom_Sel, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV88TFPrvNom)==0) )
         {
            h9UY0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 172, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88TFPrvNom, "")), 172, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9UY0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9UY0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 30, Gx_line+10, 52, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 56, Gx_line+10, 78, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Existencias Almacen", ""), 82, Gx_line+10, 104, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Reservada", ""), 108, Gx_line+10, 130, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Disponible", ""), 134, Gx_line+10, 156, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Pdte. Recibir", ""), 160, Gx_line+10, 182, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio Actual", ""), 186, Gx_line+10, 208, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo Producto", ""), 212, Gx_line+10, 234, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Validez", ""), 238, Gx_line+10, 260, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "R?", ""), 264, Gx_line+10, 286, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "AOX", ""), 290, Gx_line+10, 312, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "GOTS", ""), 316, Gx_line+10, 338, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "REACH", ""), 342, Gx_line+10, 364, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Oeko Tex", ""), 368, Gx_line+10, 390, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "HM", ""), 394, Gx_line+10, 416, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ZDHC", ""), 420, Gx_line+10, 442, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "List by Inditex ", ""), 446, Gx_line+10, 468, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "THELIST", ""), 472, Gx_line+10, 494, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "GRS", ""), 498, Gx_line+10, 520, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hoja?", ""), 524, Gx_line+10, 546, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 550, Gx_line+10, 572, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 576, Gx_line+10, 598, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "NOmbre", ""), 602, Gx_line+10, 624, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Referencia Proveedor", ""), 628, Gx_line+10, 650, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Funcion", ""), 654, Gx_line+10, 676, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N EINECS", ""), 680, Gx_line+10, 704, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº CAS", ""), 708, Gx_line+10, 732, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 736, Gx_line+10, 759, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 763, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = AV15FilterFullText ;
      AV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = AV24TFPrdNum ;
      AV127Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = AV25TFPrdNum_Sel ;
      AV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = AV26TFPrdNom ;
      AV129Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = AV27TFPrdNom_Sel ;
      AV130Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = AV28TFPrdExiAlm ;
      AV131Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = AV29TFPrdExiAlm_To ;
      AV132Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = AV30TFPrdCanRes ;
      AV133Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = AV31TFPrdCanRes_To ;
      AV134Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = AV32TFPrdDisponible ;
      AV135Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = AV33TFPrdDisponible_To ;
      AV136Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = AV34TFPrdCanPen ;
      AV137Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = AV35TFPrdCanPen_To ;
      AV138Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = AV36TFPrdPreAct ;
      AV139Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = AV37TFPrdPreAct_To ;
      AV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = AV38TFTipPrdDsc ;
      AV141Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = AV39TFTipPrdDsc_Sel ;
      AV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = AV40TFValDsc ;
      AV143Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = AV41TFValDsc_Sel ;
      AV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = AV42TFPrdRec ;
      AV145Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = AV43TFPrdRec_Sel ;
      AV146Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = AV44TFPrdAox ;
      AV147Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = AV45TFPrdAox_To ;
      AV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = AV46TFPrdGots ;
      AV149Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = AV47TFPrdGots_Sel ;
      AV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = AV48TFPrdReach ;
      AV151Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = AV49TFPrdReach_Sel ;
      AV152Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = AV52TFPrdOkotex_Sels ;
      AV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = AV54TFPrdHm ;
      AV154Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = AV55TFPrdHm_Sel ;
      AV155Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = AV58TFPrdZDHC_Sels ;
      AV156Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = AV62TFPrdList_Sels ;
      AV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = AV64TFPrdTHELIST ;
      AV158Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = AV65TFPrdTHELIST_Sel ;
      AV159Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = AV68TFPrdGRS_Sels ;
      AV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = AV70TFPrdHS ;
      AV161Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = AV71TFPrdHS_Sel ;
      AV162Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = AV72TFPrdFHS ;
      AV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = AV74TFPrdNum2 ;
      AV164Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = AV75TFPrdNum2_Sel ;
      AV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = AV76TFPrdNom2 ;
      AV166Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = AV77TFPrdNom2_Sel ;
      AV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = AV78TFPrdRefPrv ;
      AV168Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = AV79TFPrdRefPrv_Sel ;
      AV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = AV80TFPrdFuncion ;
      AV170Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = AV81TFPrdFuncion_Sel ;
      AV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = AV82TFPrdEINECS ;
      AV172Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = AV83TFPrdEINECS_Sel ;
      AV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = AV84TFPrdNCAS ;
      AV174Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = AV85TFPrdNCAS_Sel ;
      AV175Stocksquimicos_listadodeproductos_wcds_51_tfprvnum = AV86TFPrvNum ;
      AV176Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to = AV87TFPrvNum_To ;
      AV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = AV88TFPrvNom ;
      AV178Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = AV89TFPrvNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV152Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV155Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV156Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ,
                                           A13974PrdGRS ,
                                           AV159Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ,
                                           AV127Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ,
                                           AV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ,
                                           AV129Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ,
                                           AV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ,
                                           AV130Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ,
                                           AV131Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ,
                                           AV132Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ,
                                           AV133Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ,
                                           AV134Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ,
                                           AV135Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ,
                                           AV136Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ,
                                           AV137Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ,
                                           AV138Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ,
                                           AV139Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ,
                                           AV141Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ,
                                           AV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ,
                                           AV143Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ,
                                           AV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ,
                                           AV145Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ,
                                           AV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ,
                                           AV146Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ,
                                           AV147Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ,
                                           AV149Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ,
                                           AV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ,
                                           AV151Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ,
                                           AV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ,
                                           Integer.valueOf(AV152Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels.size()) ,
                                           AV154Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ,
                                           AV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ,
                                           Integer.valueOf(AV155Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV156Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels.size()) ,
                                           AV158Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ,
                                           AV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ,
                                           Integer.valueOf(AV159Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels.size()) ,
                                           AV161Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ,
                                           AV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ,
                                           AV162Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ,
                                           AV164Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ,
                                           AV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ,
                                           AV166Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ,
                                           AV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ,
                                           AV168Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ,
                                           AV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ,
                                           AV170Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ,
                                           AV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ,
                                           AV172Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ,
                                           AV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ,
                                           AV174Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ,
                                           AV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ,
                                           Integer.valueOf(AV175Stocksquimicos_listadodeproductos_wcds_51_tfprvnum) ,
                                           Integer.valueOf(AV176Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to) ,
                                           AV178Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ,
                                           AV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ,
                                           AV11PrdNumfrom ,
                                           AV12PrdnumTo ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A6302TipPrdDsc ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 ,
                                           A4692PrdNom2 ,
                                           A728PrdRefPrv ,
                                           A11615PrdFuncion ,
                                           A11614PrdEINECS ,
                                           A9734PrdNCAS ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ,
                                           A13831PrdDisponi ,
                                           AV10emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum), 6, "%") ;
      lV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom), 26, "%") ;
      lV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = GXutil.padr( GXutil.rtrim( AV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc), 40, "%") ;
      lV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = GXutil.padr( GXutil.rtrim( AV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc), 16, "%") ;
      lV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = GXutil.padr( GXutil.rtrim( AV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec), 1, "%") ;
      lV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = GXutil.padr( GXutil.rtrim( AV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots), 1, "%") ;
      lV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = GXutil.padr( GXutil.rtrim( AV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach), 1, "%") ;
      lV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = GXutil.padr( GXutil.rtrim( AV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm), 1, "%") ;
      lV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = GXutil.padr( GXutil.rtrim( AV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist), 4, "%") ;
      lV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = GXutil.padr( GXutil.rtrim( AV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs), 1, "%") ;
      lV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2), 16, "%") ;
      lV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = GXutil.padr( GXutil.rtrim( AV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2), 40, "%") ;
      lV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv), 30, "%") ;
      lV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = GXutil.padr( GXutil.rtrim( AV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion), 50, "%") ;
      lV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = GXutil.padr( GXutil.rtrim( AV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs), 40, "%") ;
      lV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = GXutil.padr( GXutil.rtrim( AV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas), 30, "%") ;
      lV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = GXutil.padr( GXutil.rtrim( AV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom), 30, "%") ;
      /* Using cursor P09UY2 */
      pr_default.execute(0, new Object[] {AV10emprcod, lV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum, AV127Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel, lV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom, AV129Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel, AV130Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm, AV131Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to, AV132Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres, AV133Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to, AV134Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible, AV135Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to, AV136Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen, AV137Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to, AV138Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact, AV139Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to, lV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc, AV141Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel, lV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc, AV143Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel, lV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec, AV145Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel, AV146Stocksquimicos_listadodeproductos_wcds_22_tfprdaox, AV147Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to, lV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots, AV149Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel, lV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach, AV151Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel, lV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm, AV154Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel, lV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist, AV158Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel, lV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs, AV161Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel, AV162Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs, lV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2, AV164Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel, lV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2, AV166Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel, lV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv, AV168Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel, lV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion, AV170Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel, lV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs, AV172Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel, lV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas, AV174Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel, Integer.valueOf(AV175Stocksquimicos_listadodeproductos_wcds_51_tfprvnum), Integer.valueOf(AV176Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to), lV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom, AV178Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel, AV11PrdNumfrom, AV12PrdnumTo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09UY2_A856ValCod[0] ;
         A6301TipPrdCod = P09UY2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P09UY2_n6301TipPrdCod[0] ;
         A396EmprCod = P09UY2_A396EmprCod[0] ;
         A794PrvNom = P09UY2_A794PrvNom[0] ;
         n794PrvNom = P09UY2_n794PrvNom[0] ;
         A795PrvNum = P09UY2_A795PrvNum[0] ;
         A9734PrdNCAS = P09UY2_A9734PrdNCAS[0] ;
         A11614PrdEINECS = P09UY2_A11614PrdEINECS[0] ;
         A11615PrdFuncion = P09UY2_A11615PrdFuncion[0] ;
         A728PrdRefPrv = P09UY2_A728PrdRefPrv[0] ;
         A4692PrdNom2 = P09UY2_A4692PrdNom2[0] ;
         A4693PrdNum2 = P09UY2_A4693PrdNum2[0] ;
         A9742PrdFHS = P09UY2_A9742PrdFHS[0] ;
         A9741PrdHS = P09UY2_A9741PrdHS[0] ;
         A13302PrdTHELIST = P09UY2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P09UY2_n13302PrdTHELIST[0] ;
         A11364PrdHm = P09UY2_A11364PrdHm[0] ;
         A5887PrdReach = P09UY2_A5887PrdReach[0] ;
         A11363PrdGots = P09UY2_A11363PrdGots[0] ;
         A9733PrdAox = P09UY2_A9733PrdAox[0] ;
         A727PrdRec = P09UY2_A727PrdRec[0] ;
         A857ValDsc = P09UY2_A857ValDsc[0] ;
         n857ValDsc = P09UY2_n857ValDsc[0] ;
         A6302TipPrdDsc = P09UY2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09UY2_n6302TipPrdDsc[0] ;
         A724PrdPreAct = P09UY2_A724PrdPreAct[0] ;
         A684PrdCanPen = P09UY2_A684PrdCanPen[0] ;
         A13831PrdDisponi = P09UY2_A13831PrdDisponi[0] ;
         A718PrdNom = P09UY2_A718PrdNom[0] ;
         A719PrdNum = P09UY2_A719PrdNum[0] ;
         A13974PrdGRS = P09UY2_A13974PrdGRS[0] ;
         n13974PrdGRS = P09UY2_n13974PrdGRS[0] ;
         A11687PrdList = P09UY2_A11687PrdList[0] ;
         A13301PrdZDHC = P09UY2_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P09UY2_A5888PrdOkotex[0] ;
         A704PrdExiAlm = P09UY2_A704PrdExiAlm[0] ;
         A685PrdCanRes = P09UY2_A685PrdCanRes[0] ;
         A857ValDsc = P09UY2_A857ValDsc[0] ;
         n857ValDsc = P09UY2_n857ValDsc[0] ;
         A6302TipPrdDsc = P09UY2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09UY2_n6302TipPrdDsc[0] ;
         A794PrvNom = P09UY2_A794PrvNom[0] ;
         n794PrvNom = P09UY2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13831PrdDisponi, 12, 4) , GXutil.padr( "%" + AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A684PrdCanPen, 12, 4) , GXutil.padr( "%" + AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A727PrdRec) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4692PrdNom2) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9734PrdNCAS) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV16PrdOkotexDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "N") == 0 )
            {
               AV16PrdOkotexDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "S") == 0 )
            {
               AV16PrdOkotexDescription = httpContext.getMessage( "S", "") ;
            }
            AV17PrdZDHCDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "N") == 0 )
            {
               AV17PrdZDHCDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "1") == 0 )
            {
               AV17PrdZDHCDescription = httpContext.getMessage( "Nivel 1", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "2") == 0 )
            {
               AV17PrdZDHCDescription = httpContext.getMessage( "Nivel 2", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "3") == 0 )
            {
               AV17PrdZDHCDescription = httpContext.getMessage( "Nivel 3", "") ;
            }
            AV18PrdListDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "S") == 0 )
            {
               AV18PrdListDescription = httpContext.getMessage( "S", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "N") == 0 )
            {
               AV18PrdListDescription = httpContext.getMessage( "N", "") ;
            }
            AV19PrdGRSDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A13974PrdGRS), "N") == 0 )
            {
               AV19PrdGRSDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13974PrdGRS), "S") == 0 )
            {
               AV19PrdGRSDescription = httpContext.getMessage( "S", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
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
            h9UY0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 30, Gx_line+10, 52, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 56, Gx_line+10, 78, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")), 82, Gx_line+10, 104, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")), 108, Gx_line+10, 130, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13831PrdDisponi, "ZZZZZZ9.9999")), 134, Gx_line+10, 156, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999")), 160, Gx_line+10, 182, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")), 186, Gx_line+10, 208, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6302TipPrdDsc, "")), 212, Gx_line+10, 234, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A857ValDsc, "")), 238, Gx_line+10, 260, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A727PrdRec, "")), 264, Gx_line+10, 286, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9733PrdAox, "ZZ9.99")), 290, Gx_line+10, 312, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11363PrdGots, "")), 316, Gx_line+10, 338, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5887PrdReach, "")), 342, Gx_line+10, 364, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16PrdOkotexDescription, "")), 368, Gx_line+10, 390, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11364PrdHm, "")), 394, Gx_line+10, 416, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17PrdZDHCDescription, "")), 420, Gx_line+10, 442, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18PrdListDescription, "")), 446, Gx_line+10, 468, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!")), 472, Gx_line+10, 494, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19PrdGRSDescription, "")), 498, Gx_line+10, 520, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9741PrdHS, "")), 524, Gx_line+10, 546, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9742PrdFHS, "99/99/99"), 550, Gx_line+10, 572, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4693PrdNum2, "")), 576, Gx_line+10, 598, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4692PrdNom2, "")), 602, Gx_line+10, 624, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A728PrdRefPrv, "")), 628, Gx_line+10, 650, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11615PrdFuncion, "")), 654, Gx_line+10, 676, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11614PrdEINECS, "")), 680, Gx_line+10, 704, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9734PrdNCAS, "")), 708, Gx_line+10, 732, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 736, Gx_line+10, 759, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 763, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV20Session.getValue("StocksQuimicos.ListadodeProductos_WCGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.ListadodeProductos_WCGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("StocksQuimicos.ListadodeProductos_WCGridState"), null, null);
      }
      AV13OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV14OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV179GXV5 = 1 ;
      while ( AV179GXV5 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV179GXV5));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV24TFPrdNum = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV25TFPrdNum_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV26TFPrdNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV27TFPrdNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV28TFPrdExiAlm = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFPrdExiAlm_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV30TFPrdCanRes = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFPrdCanRes_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV32TFPrdDisponible = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFPrdDisponible_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV34TFPrdCanPen = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFPrdCanPen_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV36TFPrdPreAct = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFPrdPreAct_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV38TFTipPrdDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV39TFTipPrdDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV40TFValDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV41TFValDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV42TFPrdRec = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV43TFPrdRec_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV44TFPrdAox = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFPrdAox_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV46TFPrdGots = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV47TFPrdGots_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV48TFPrdReach = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV49TFPrdReach_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV50TFPrdOkotex_SelsJson = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV52TFPrdOkotex_Sels.fromJSonString(AV50TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV54TFPrdHm = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV55TFPrdHm_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV56TFPrdZDHC_SelsJson = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV58TFPrdZDHC_Sels.fromJSonString(AV56TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV60TFPrdList_SelsJson = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV62TFPrdList_Sels.fromJSonString(AV60TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV64TFPrdTHELIST = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV65TFPrdTHELIST_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGRS_SEL") == 0 )
         {
            AV66TFPrdGRS_SelsJson = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV68TFPrdGRS_Sels.fromJSonString(AV66TFPrdGRS_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV70TFPrdHS = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV71TFPrdHS_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV72TFPrdFHS = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2") == 0 )
         {
            AV74TFPrdNum2 = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2_SEL") == 0 )
         {
            AV75TFPrdNum2_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM2") == 0 )
         {
            AV76TFPrdNom2 = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM2_SEL") == 0 )
         {
            AV77TFPrdNom2_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV78TFPrdRefPrv = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV79TFPrdRefPrv_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFUNCION") == 0 )
         {
            AV80TFPrdFuncion = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFUNCION_SEL") == 0 )
         {
            AV81TFPrdFuncion_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEINECS") == 0 )
         {
            AV82TFPrdEINECS = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEINECS_SEL") == 0 )
         {
            AV83TFPrdEINECS_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCAS") == 0 )
         {
            AV84TFPrdNCAS = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCAS_SEL") == 0 )
         {
            AV85TFPrdNCAS_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV86TFPrvNum = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV87TFPrvNum_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV88TFPrvNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV89TFPrvNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10emprcod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMFROM") == 0 )
         {
            AV11PrdNumfrom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMTO") == 0 )
         {
            AV12PrdnumTo = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV179GXV5 = (int)(AV179GXV5+1) ;
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

   public void h9UY0( boolean bFoot ,
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
               AV111PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV108DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV113Title = AV117Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV113Title = "" ;
      AV15FilterFullText = "" ;
      AV25TFPrdNum_Sel = "" ;
      AV24TFPrdNum = "" ;
      AV27TFPrdNom_Sel = "" ;
      AV26TFPrdNom = "" ;
      AV28TFPrdExiAlm = DecimalUtil.ZERO ;
      AV29TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV90TFPrdExiAlm_To_Description = "" ;
      AV30TFPrdCanRes = DecimalUtil.ZERO ;
      AV31TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV91TFPrdCanRes_To_Description = "" ;
      AV32TFPrdDisponible = DecimalUtil.ZERO ;
      AV33TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV92TFPrdDisponible_To_Description = "" ;
      AV34TFPrdCanPen = DecimalUtil.ZERO ;
      AV35TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV93TFPrdCanPen_To_Description = "" ;
      AV36TFPrdPreAct = DecimalUtil.ZERO ;
      AV37TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV94TFPrdPreAct_To_Description = "" ;
      AV39TFTipPrdDsc_Sel = "" ;
      AV38TFTipPrdDsc = "" ;
      AV41TFValDsc_Sel = "" ;
      AV40TFValDsc = "" ;
      AV43TFPrdRec_Sel = "" ;
      AV42TFPrdRec = "" ;
      AV44TFPrdAox = DecimalUtil.ZERO ;
      AV45TFPrdAox_To = DecimalUtil.ZERO ;
      AV95TFPrdAox_To_Description = "" ;
      AV47TFPrdGots_Sel = "" ;
      AV46TFPrdGots = "" ;
      AV49TFPrdReach_Sel = "" ;
      AV48TFPrdReach = "" ;
      AV52TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50TFPrdOkotex_SelsJson = "" ;
      AV53TFPrdOkotex_Sel = "" ;
      AV51TFPrdOkotex_SelDscs = "" ;
      AV96FilterTFPrdOkotex_SelValueDescription = "" ;
      AV55TFPrdHm_Sel = "" ;
      AV54TFPrdHm = "" ;
      AV58TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV56TFPrdZDHC_SelsJson = "" ;
      AV59TFPrdZDHC_Sel = "" ;
      AV57TFPrdZDHC_SelDscs = "" ;
      AV97FilterTFPrdZDHC_SelValueDescription = "" ;
      AV62TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60TFPrdList_SelsJson = "" ;
      AV63TFPrdList_Sel = "" ;
      AV61TFPrdList_SelDscs = "" ;
      AV98FilterTFPrdList_SelValueDescription = "" ;
      AV65TFPrdTHELIST_Sel = "" ;
      AV64TFPrdTHELIST = "" ;
      AV68TFPrdGRS_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66TFPrdGRS_SelsJson = "" ;
      AV69TFPrdGRS_Sel = "" ;
      AV67TFPrdGRS_SelDscs = "" ;
      AV99FilterTFPrdGRS_SelValueDescription = "" ;
      AV71TFPrdHS_Sel = "" ;
      AV70TFPrdHS = "" ;
      AV72TFPrdFHS = GXutil.nullDate() ;
      AV75TFPrdNum2_Sel = "" ;
      AV74TFPrdNum2 = "" ;
      AV77TFPrdNom2_Sel = "" ;
      AV76TFPrdNom2 = "" ;
      AV79TFPrdRefPrv_Sel = "" ;
      AV78TFPrdRefPrv = "" ;
      AV81TFPrdFuncion_Sel = "" ;
      AV80TFPrdFuncion = "" ;
      AV83TFPrdEINECS_Sel = "" ;
      AV82TFPrdEINECS = "" ;
      AV85TFPrdNCAS_Sel = "" ;
      AV84TFPrdNCAS = "" ;
      AV101TFPrvNum_To_Description = "" ;
      AV89TFPrvNom_Sel = "" ;
      AV88TFPrvNom = "" ;
      A5888PrdOkotex = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A13974PrdGRS = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A6302TipPrdDsc = "" ;
      A857ValDsc = "" ;
      A727PrdRec = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A11364PrdHm = "" ;
      A13302PrdTHELIST = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A4693PrdNum2 = "" ;
      A4692PrdNom2 = "" ;
      A728PrdRefPrv = "" ;
      A11615PrdFuncion = "" ;
      A11614PrdEINECS = "" ;
      A9734PrdNCAS = "" ;
      A794PrvNom = "" ;
      AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = "" ;
      AV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = "" ;
      AV127Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = "" ;
      AV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = "" ;
      AV129Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = "" ;
      AV130Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = DecimalUtil.ZERO ;
      AV131Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = DecimalUtil.ZERO ;
      AV132Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = DecimalUtil.ZERO ;
      AV133Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = DecimalUtil.ZERO ;
      AV134Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = DecimalUtil.ZERO ;
      AV135Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = DecimalUtil.ZERO ;
      AV136Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = DecimalUtil.ZERO ;
      AV137Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV138Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = DecimalUtil.ZERO ;
      AV139Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = DecimalUtil.ZERO ;
      AV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = "" ;
      AV141Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = "" ;
      AV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = "" ;
      AV143Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = "" ;
      AV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = "" ;
      AV145Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = "" ;
      AV146Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = DecimalUtil.ZERO ;
      AV147Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = DecimalUtil.ZERO ;
      AV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = "" ;
      AV149Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = "" ;
      AV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = "" ;
      AV151Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = "" ;
      AV152Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = "" ;
      AV154Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = "" ;
      AV155Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV156Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = "" ;
      AV158Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = "" ;
      AV159Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = "" ;
      AV161Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = "" ;
      AV162Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = GXutil.nullDate() ;
      AV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = "" ;
      AV164Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = "" ;
      AV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = "" ;
      AV166Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = "" ;
      AV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = "" ;
      AV168Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = "" ;
      AV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = "" ;
      AV170Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = "" ;
      AV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = "" ;
      AV172Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = "" ;
      AV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = "" ;
      AV174Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = "" ;
      AV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = "" ;
      AV178Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = "" ;
      lV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = "" ;
      lV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = "" ;
      lV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = "" ;
      lV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = "" ;
      lV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = "" ;
      lV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = "" ;
      lV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = "" ;
      lV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = "" ;
      lV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = "" ;
      lV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = "" ;
      lV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = "" ;
      lV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = "" ;
      lV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = "" ;
      lV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = "" ;
      lV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = "" ;
      lV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = "" ;
      lV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = "" ;
      AV11PrdNumfrom = "" ;
      AV12PrdnumTo = "" ;
      AV10emprcod = "" ;
      A396EmprCod = "" ;
      P09UY2_A856ValCod = new byte[1] ;
      P09UY2_A6301TipPrdCod = new short[1] ;
      P09UY2_n6301TipPrdCod = new boolean[] {false} ;
      P09UY2_A396EmprCod = new String[] {""} ;
      P09UY2_A794PrvNom = new String[] {""} ;
      P09UY2_n794PrvNom = new boolean[] {false} ;
      P09UY2_A795PrvNum = new int[1] ;
      P09UY2_A9734PrdNCAS = new String[] {""} ;
      P09UY2_A11614PrdEINECS = new String[] {""} ;
      P09UY2_A11615PrdFuncion = new String[] {""} ;
      P09UY2_A728PrdRefPrv = new String[] {""} ;
      P09UY2_A4692PrdNom2 = new String[] {""} ;
      P09UY2_A4693PrdNum2 = new String[] {""} ;
      P09UY2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P09UY2_A9741PrdHS = new String[] {""} ;
      P09UY2_A13302PrdTHELIST = new String[] {""} ;
      P09UY2_n13302PrdTHELIST = new boolean[] {false} ;
      P09UY2_A11364PrdHm = new String[] {""} ;
      P09UY2_A5887PrdReach = new String[] {""} ;
      P09UY2_A11363PrdGots = new String[] {""} ;
      P09UY2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UY2_A727PrdRec = new String[] {""} ;
      P09UY2_A857ValDsc = new String[] {""} ;
      P09UY2_n857ValDsc = new boolean[] {false} ;
      P09UY2_A6302TipPrdDsc = new String[] {""} ;
      P09UY2_n6302TipPrdDsc = new boolean[] {false} ;
      P09UY2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UY2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UY2_A13831PrdDisponi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UY2_A718PrdNom = new String[] {""} ;
      P09UY2_A719PrdNum = new String[] {""} ;
      P09UY2_A13974PrdGRS = new String[] {""} ;
      P09UY2_n13974PrdGRS = new boolean[] {false} ;
      P09UY2_A11687PrdList = new String[] {""} ;
      P09UY2_A13301PrdZDHC = new String[] {""} ;
      P09UY2_A5888PrdOkotex = new String[] {""} ;
      P09UY2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UY2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV16PrdOkotexDescription = "" ;
      AV17PrdZDHCDescription = "" ;
      AV18PrdListDescription = "" ;
      AV19PrdGRSDescription = "" ;
      AV20Session = httpContext.getWebSession();
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV111PageInfo = "" ;
      AV108DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV117Pgmdesc = "" ;
      AV106AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodeproductos_wcexportreport__default(),
         new Object[] {
             new Object[] {
            P09UY2_A856ValCod, P09UY2_A6301TipPrdCod, P09UY2_n6301TipPrdCod, P09UY2_A396EmprCod, P09UY2_A794PrvNom, P09UY2_n794PrvNom, P09UY2_A795PrvNum, P09UY2_A9734PrdNCAS, P09UY2_A11614PrdEINECS, P09UY2_A11615PrdFuncion,
            P09UY2_A728PrdRefPrv, P09UY2_A4692PrdNom2, P09UY2_A4693PrdNum2, P09UY2_A9742PrdFHS, P09UY2_A9741PrdHS, P09UY2_A13302PrdTHELIST, P09UY2_n13302PrdTHELIST, P09UY2_A11364PrdHm, P09UY2_A5887PrdReach, P09UY2_A11363PrdGots,
            P09UY2_A9733PrdAox, P09UY2_A727PrdRec, P09UY2_A857ValDsc, P09UY2_n857ValDsc, P09UY2_A6302TipPrdDsc, P09UY2_n6302TipPrdDsc, P09UY2_A724PrdPreAct, P09UY2_A684PrdCanPen, P09UY2_A13831PrdDisponi, P09UY2_A718PrdNom,
            P09UY2_A719PrdNum, P09UY2_A13974PrdGRS, P09UY2_n13974PrdGRS, P09UY2_A11687PrdList, P09UY2_A13301PrdZDHC, P09UY2_A5888PrdOkotex, P09UY2_A704PrdExiAlm, P09UY2_A685PrdCanRes
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV117Pgmdesc = httpContext.getMessage( "Listado de Productos", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV117Pgmdesc = httpContext.getMessage( "Listado de Productos", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short gxcookieaux ;
   private short AV13OrderedBy ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV120GXV1 ;
   private int AV121GXV2 ;
   private int AV122GXV3 ;
   private int AV123GXV4 ;
   private int AV86TFPrvNum ;
   private int AV87TFPrvNum_To ;
   private int A795PrvNum ;
   private int AV175Stocksquimicos_listadodeproductos_wcds_51_tfprvnum ;
   private int AV176Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to ;
   private int AV152Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size ;
   private int AV155Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size ;
   private int AV156Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size ;
   private int AV159Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size ;
   private int AV179GXV5 ;
   private long AV102i ;
   private java.math.BigDecimal AV28TFPrdExiAlm ;
   private java.math.BigDecimal AV29TFPrdExiAlm_To ;
   private java.math.BigDecimal AV30TFPrdCanRes ;
   private java.math.BigDecimal AV31TFPrdCanRes_To ;
   private java.math.BigDecimal AV32TFPrdDisponible ;
   private java.math.BigDecimal AV33TFPrdDisponible_To ;
   private java.math.BigDecimal AV34TFPrdCanPen ;
   private java.math.BigDecimal AV35TFPrdCanPen_To ;
   private java.math.BigDecimal AV36TFPrdPreAct ;
   private java.math.BigDecimal AV37TFPrdPreAct_To ;
   private java.math.BigDecimal AV44TFPrdAox ;
   private java.math.BigDecimal AV45TFPrdAox_To ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV130Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ;
   private java.math.BigDecimal AV131Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ;
   private java.math.BigDecimal AV132Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ;
   private java.math.BigDecimal AV133Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ;
   private java.math.BigDecimal AV134Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ;
   private java.math.BigDecimal AV135Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ;
   private java.math.BigDecimal AV136Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ;
   private java.math.BigDecimal AV137Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ;
   private java.math.BigDecimal AV138Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ;
   private java.math.BigDecimal AV139Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ;
   private java.math.BigDecimal AV146Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ;
   private java.math.BigDecimal AV147Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV25TFPrdNum_Sel ;
   private String AV24TFPrdNum ;
   private String AV27TFPrdNom_Sel ;
   private String AV26TFPrdNom ;
   private String AV39TFTipPrdDsc_Sel ;
   private String AV38TFTipPrdDsc ;
   private String AV41TFValDsc_Sel ;
   private String AV40TFValDsc ;
   private String AV43TFPrdRec_Sel ;
   private String AV42TFPrdRec ;
   private String AV47TFPrdGots_Sel ;
   private String AV46TFPrdGots ;
   private String AV49TFPrdReach_Sel ;
   private String AV48TFPrdReach ;
   private String AV53TFPrdOkotex_Sel ;
   private String AV55TFPrdHm_Sel ;
   private String AV54TFPrdHm ;
   private String AV59TFPrdZDHC_Sel ;
   private String AV63TFPrdList_Sel ;
   private String AV65TFPrdTHELIST_Sel ;
   private String AV64TFPrdTHELIST ;
   private String AV69TFPrdGRS_Sel ;
   private String AV71TFPrdHS_Sel ;
   private String AV70TFPrdHS ;
   private String AV75TFPrdNum2_Sel ;
   private String AV74TFPrdNum2 ;
   private String AV77TFPrdNom2_Sel ;
   private String AV76TFPrdNom2 ;
   private String AV79TFPrdRefPrv_Sel ;
   private String AV78TFPrdRefPrv ;
   private String AV81TFPrdFuncion_Sel ;
   private String AV80TFPrdFuncion ;
   private String AV83TFPrdEINECS_Sel ;
   private String AV82TFPrdEINECS ;
   private String AV85TFPrdNCAS_Sel ;
   private String AV84TFPrdNCAS ;
   private String AV89TFPrvNom_Sel ;
   private String AV88TFPrvNom ;
   private String A5888PrdOkotex ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A13974PrdGRS ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A6302TipPrdDsc ;
   private String A857ValDsc ;
   private String A727PrdRec ;
   private String A11363PrdGots ;
   private String A5887PrdReach ;
   private String A11364PrdHm ;
   private String A13302PrdTHELIST ;
   private String A9741PrdHS ;
   private String A4693PrdNum2 ;
   private String A4692PrdNom2 ;
   private String A728PrdRefPrv ;
   private String A11615PrdFuncion ;
   private String A11614PrdEINECS ;
   private String A9734PrdNCAS ;
   private String A794PrvNom ;
   private String AV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ;
   private String AV127Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ;
   private String AV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ;
   private String AV129Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ;
   private String AV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ;
   private String AV141Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ;
   private String AV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ;
   private String AV143Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ;
   private String AV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ;
   private String AV145Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ;
   private String AV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ;
   private String AV149Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ;
   private String AV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ;
   private String AV151Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ;
   private String AV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ;
   private String AV154Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ;
   private String AV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ;
   private String AV158Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ;
   private String AV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ;
   private String AV161Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ;
   private String AV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ;
   private String AV164Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ;
   private String AV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ;
   private String AV166Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ;
   private String AV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ;
   private String AV168Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ;
   private String AV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ;
   private String AV170Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ;
   private String AV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ;
   private String AV172Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ;
   private String AV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ;
   private String AV174Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ;
   private String AV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ;
   private String AV178Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ;
   private String lV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ;
   private String lV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ;
   private String lV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ;
   private String lV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ;
   private String lV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ;
   private String lV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ;
   private String lV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ;
   private String lV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ;
   private String lV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ;
   private String lV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ;
   private String lV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ;
   private String lV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ;
   private String lV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ;
   private String lV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ;
   private String lV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ;
   private String lV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ;
   private String AV11PrdNumfrom ;
   private String AV12PrdnumTo ;
   private String AV10emprcod ;
   private String A396EmprCod ;
   private String AV117Pgmdesc ;
   private java.util.Date AV72TFPrdFHS ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV162Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV14OrderedDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n794PrvNom ;
   private boolean n13302PrdTHELIST ;
   private boolean n857ValDsc ;
   private boolean n6302TipPrdDsc ;
   private boolean n13974PrdGRS ;
   private String AV50TFPrdOkotex_SelsJson ;
   private String AV56TFPrdZDHC_SelsJson ;
   private String AV60TFPrdList_SelsJson ;
   private String AV66TFPrdGRS_SelsJson ;
   private String AV113Title ;
   private String AV15FilterFullText ;
   private String AV90TFPrdExiAlm_To_Description ;
   private String AV91TFPrdCanRes_To_Description ;
   private String AV92TFPrdDisponible_To_Description ;
   private String AV93TFPrdCanPen_To_Description ;
   private String AV94TFPrdPreAct_To_Description ;
   private String AV95TFPrdAox_To_Description ;
   private String AV51TFPrdOkotex_SelDscs ;
   private String AV96FilterTFPrdOkotex_SelValueDescription ;
   private String AV57TFPrdZDHC_SelDscs ;
   private String AV97FilterTFPrdZDHC_SelValueDescription ;
   private String AV61TFPrdList_SelDscs ;
   private String AV98FilterTFPrdList_SelValueDescription ;
   private String AV67TFPrdGRS_SelDscs ;
   private String AV99FilterTFPrdGRS_SelValueDescription ;
   private String AV101TFPrvNum_To_Description ;
   private String AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ;
   private String lV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ;
   private String AV16PrdOkotexDescription ;
   private String AV17PrdZDHCDescription ;
   private String AV18PrdListDescription ;
   private String AV19PrdGRSDescription ;
   private String AV111PageInfo ;
   private String AV108DateInfo ;
   private String AV106AppName ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private IDataStoreProvider pr_default ;
   private byte[] P09UY2_A856ValCod ;
   private short[] P09UY2_A6301TipPrdCod ;
   private boolean[] P09UY2_n6301TipPrdCod ;
   private String[] P09UY2_A396EmprCod ;
   private String[] P09UY2_A794PrvNom ;
   private boolean[] P09UY2_n794PrvNom ;
   private int[] P09UY2_A795PrvNum ;
   private String[] P09UY2_A9734PrdNCAS ;
   private String[] P09UY2_A11614PrdEINECS ;
   private String[] P09UY2_A11615PrdFuncion ;
   private String[] P09UY2_A728PrdRefPrv ;
   private String[] P09UY2_A4692PrdNom2 ;
   private String[] P09UY2_A4693PrdNum2 ;
   private java.util.Date[] P09UY2_A9742PrdFHS ;
   private String[] P09UY2_A9741PrdHS ;
   private String[] P09UY2_A13302PrdTHELIST ;
   private boolean[] P09UY2_n13302PrdTHELIST ;
   private String[] P09UY2_A11364PrdHm ;
   private String[] P09UY2_A5887PrdReach ;
   private String[] P09UY2_A11363PrdGots ;
   private java.math.BigDecimal[] P09UY2_A9733PrdAox ;
   private String[] P09UY2_A727PrdRec ;
   private String[] P09UY2_A857ValDsc ;
   private boolean[] P09UY2_n857ValDsc ;
   private String[] P09UY2_A6302TipPrdDsc ;
   private boolean[] P09UY2_n6302TipPrdDsc ;
   private java.math.BigDecimal[] P09UY2_A724PrdPreAct ;
   private java.math.BigDecimal[] P09UY2_A684PrdCanPen ;
   private java.math.BigDecimal[] P09UY2_A13831PrdDisponi ;
   private String[] P09UY2_A718PrdNom ;
   private String[] P09UY2_A719PrdNum ;
   private String[] P09UY2_A13974PrdGRS ;
   private boolean[] P09UY2_n13974PrdGRS ;
   private String[] P09UY2_A11687PrdList ;
   private String[] P09UY2_A13301PrdZDHC ;
   private String[] P09UY2_A5888PrdOkotex ;
   private java.math.BigDecimal[] P09UY2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09UY2_A685PrdCanRes ;
   private GXSimpleCollection<String> AV52TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV58TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV62TFPrdList_Sels ;
   private GXSimpleCollection<String> AV68TFPrdGRS_Sels ;
   private GXSimpleCollection<String> AV152Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV155Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV156Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ;
   private GXSimpleCollection<String> AV159Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
}

final  class listadodeproductos_wcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV152Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV155Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV156Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ,
                                          String A13974PrdGRS ,
                                          GXSimpleCollection<String> AV159Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ,
                                          String AV127Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ,
                                          String AV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ,
                                          String AV129Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ,
                                          String AV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV130Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ,
                                          java.math.BigDecimal AV131Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV132Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ,
                                          java.math.BigDecimal AV133Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV134Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ,
                                          java.math.BigDecimal AV135Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ,
                                          java.math.BigDecimal AV136Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ,
                                          java.math.BigDecimal AV137Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ,
                                          java.math.BigDecimal AV138Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ,
                                          java.math.BigDecimal AV139Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ,
                                          String AV141Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ,
                                          String AV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ,
                                          String AV143Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ,
                                          String AV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ,
                                          String AV145Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ,
                                          String AV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ,
                                          java.math.BigDecimal AV146Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ,
                                          java.math.BigDecimal AV147Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ,
                                          String AV149Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ,
                                          String AV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ,
                                          String AV151Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ,
                                          String AV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ,
                                          int AV152Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size ,
                                          String AV154Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ,
                                          String AV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ,
                                          int AV155Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size ,
                                          int AV156Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size ,
                                          String AV158Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ,
                                          String AV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ,
                                          int AV159Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size ,
                                          String AV161Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ,
                                          String AV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ,
                                          java.util.Date AV162Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ,
                                          String AV164Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ,
                                          String AV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ,
                                          String AV166Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ,
                                          String AV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ,
                                          String AV168Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ,
                                          String AV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ,
                                          String AV170Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ,
                                          String AV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ,
                                          String AV172Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ,
                                          String AV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ,
                                          String AV174Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ,
                                          String AV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ,
                                          int AV175Stocksquimicos_listadodeproductos_wcds_51_tfprvnum ,
                                          int AV176Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to ,
                                          String AV178Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ,
                                          String AV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ,
                                          String AV11PrdNumfrom ,
                                          String AV12PrdnumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A6302TipPrdDsc ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 ,
                                          String A4692PrdNom2 ,
                                          String A728PrdRefPrv ,
                                          String A11615PrdFuncion ,
                                          String A11614PrdEINECS ,
                                          String A9734PrdNCAS ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV125Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A13831PrdDisponi ,
                                          String AV10emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[52];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.TipPrdCod, T1.EmprCod, T4.PrvNom, T1.PrvNum, T1.PrdNCAS, T1.PrdEINECS, T1.PrdFuncion, T1.PrdRefPrv, T1.PrdNom2, T1.PrdNum2, T1.PrdFHS, T1.PrdHS," ;
      scmdbuf += " T1.PrdTHELIST, T1.PrdHm, T1.PrdReach, T1.PrdGots, T1.PrdAox, T1.PrdRec, T2.ValDsc, T3.TipPrdDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdExiAlm - T1.PrdCanRes AS PrdDisponi," ;
      scmdbuf += " T1.PrdNom, T1.PrdNum, T1.PrdGRS, T1.PrdList, T1.PrdZDHC, T1.PrdOkotex, T1.PrdExiAlm, T1.PrdCanRes FROM (((TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV127Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV126Stocksquimicos_listadodeproductos_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV128Stocksquimicos_listadodeproductos_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV140Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV142Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV144Stocksquimicos_listadodeproductos_wcds_20_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Stocksquimicos_listadodeproductos_wcds_22_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV148Stocksquimicos_listadodeproductos_wcds_24_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV150Stocksquimicos_listadodeproductos_wcds_26_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( AV152Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV152Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV154Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV153Stocksquimicos_listadodeproductos_wcds_29_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( AV155Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV155Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV156Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV156Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV158Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV157Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( AV159Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV159Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels, "T1.PrdGRS IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV161Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV160Stocksquimicos_listadodeproductos_wcds_36_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV164Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV163Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel)==0) && ( ! (GXutil.strcmp("", AV165Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom2 = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV167Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel)==0) && ( ! (GXutil.strcmp("", AV169Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdFuncion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdFuncion = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel)==0) && ( ! (GXutil.strcmp("", AV171Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdEINECS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdEINECS = ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel)==0) && ( ! (GXutil.strcmp("", AV173Stocksquimicos_listadodeproductos_wcds_49_tfprdncas)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNCAS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNCAS = ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (0==AV175Stocksquimicos_listadodeproductos_wcds_51_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (0==AV176Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV177Stocksquimicos_listadodeproductos_wcds_53_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11PrdNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12PrdnumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipPrdDsc" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipPrdDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ValDsc" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ValDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRec" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRec DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGRS" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGRS DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom2" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom2 DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS DESC" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PrvNom DESC" ;
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
                  return conditional_P09UY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , ((Number) dynConstraints[85]).intValue() , (String)dynConstraints[86] , ((Number) dynConstraints[87]).shortValue() , ((Boolean) dynConstraints[88]).booleanValue() , (String)dynConstraints[89] , (java.math.BigDecimal)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((String[]) buf[8])[0] = rslt.getString(7, 40);
               ((String[]) buf[9])[0] = rslt.getString(8, 50);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 40);
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((String[]) buf[18])[0] = rslt.getString(16, 1);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(24,4);
               ((String[]) buf[29])[0] = rslt.getString(25, 26);
               ((String[]) buf[30])[0] = rslt.getString(26, 6);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(28, 1);
               ((String[]) buf[34])[0] = rslt.getString(29, 1);
               ((String[]) buf[35])[0] = rslt.getString(30, 1);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(31,4);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(32,4);
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
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[85]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 50);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 40);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 30);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               return;
      }
   }

}

