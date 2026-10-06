package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientofacturawwexportreport_impl extends GXWebReport
{
   public mantenimientofacturawwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV40Title = httpContext.getMessage( "Lista de Mantenimiento Factura", "") ;
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
         h9YU0( true, 0) ;
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
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV17TFFacCod) && (0==AV18TFFacCod_To) ) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Factura", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFFacCod), "ZZZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV27TFFacCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Factura", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFFacCod_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFFacCod_To), "ZZZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19TFFacFch)) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV19TFFacFch, "99/99/99"), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV23TFCliCod) && (0==AV24TFCliCod_To) ) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFCliCod), "ZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV29TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFCliCod_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFCliCod_To), "ZZZZZ9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFCliNom_Sel)==0) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFCliNom_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFCliNom)==0) )
         {
            h9YU0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFCliNom, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV22TFFacPri_Sel)==0) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFFacPri_Sel, "9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFFacPri)==0) )
         {
            h9YU0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFFacPri, "9")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFFacImpTot)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFFacImpTot_To)==0) ) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Bruto", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42TFFacImpTot, "ZZZZZZZZZ9.99")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV52TFFacImpTot_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Total Bruto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFFacImpTot_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43TFFacImpTot_To, "ZZZZZZZZZ9.99")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFFacImpPP)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFFacImpPP_To)==0) ) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Imp. Dto. P.P.", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44TFFacImpPP, "ZZZZZZZ9.99")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV53TFFacImpPP_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Imp. Dto. P.P.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFFacImpPP_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45TFFacImpPP_To, "ZZZZZZZ9.99")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFFacBasImp)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFFacBasImp_To)==0) ) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Base Imp.", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV46TFFacBasImp, "ZZZZZZZZZ9.99")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV54TFFacBasImp_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Base Imp.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFFacBasImp_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV47TFFacBasImp_To, "ZZZZZZZZZ9.99")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFFacIVAImp)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFFacIVAImp_To)==0) ) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Imp. IVA", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48TFFacIVAImp, "ZZZZZZZ9.99")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV55TFFacIVAImp_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Imp. IVA", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFFacIVAImp_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49TFFacIVAImp_To, "ZZZZZZZ9.99")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFFacTot)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFFacTot_To)==0) ) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV50TFFacTot, "ZZZZZZZZZ9.99")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV56TFFacTot_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Total", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFFacTot_To_Description, "")), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV51TFFacTot_To, "ZZZZZZZZZ9.99")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV60TFFacEst_Sels.fromJSonString(AV58TFFacEst_SelsJson, null);
      if ( ! ( AV60TFFacEst_Sels.size() == 0 ) )
      {
         AV65i = 1 ;
         AV71GXV1 = 1 ;
         while ( AV71GXV1 <= AV60TFFacEst_Sels.size() )
         {
            AV61TFFacEst_Sel = ((Number) AV60TFFacEst_Sels.elementAt(-1+AV71GXV1)).byteValue() ;
            if ( AV65i == 1 )
            {
               AV59TFFacEst_SelDscs = "" ;
            }
            else
            {
               AV59TFFacEst_SelDscs += ", " ;
            }
            AV64FilterTFFacEst_SelValueDescription = "" ;
            if ( AV61TFFacEst_Sel == 0 )
            {
               AV64FilterTFFacEst_SelValueDescription = httpContext.getMessage( "Pdte. Imp.", "") ;
            }
            else if ( AV61TFFacEst_Sel == 1 )
            {
               AV64FilterTFFacEst_SelValueDescription = httpContext.getMessage( "Imp.", "") ;
            }
            else if ( AV61TFFacEst_Sel == 2 )
            {
               AV64FilterTFFacEst_SelValueDescription = httpContext.getMessage( "Act.", "") ;
            }
            AV59TFFacEst_SelDscs += AV64FilterTFFacEst_SelValueDescription ;
            AV65i = (long)(AV65i+1) ;
            AV71GXV1 = (int)(AV71GXV1+1) ;
         }
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFFacEst_SelDscs, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV63TFFacCob_Sel)==0) )
      {
         h9YU0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ctb", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFFacCob_Sel, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV62TFFacCob)==0) )
         {
            h9YU0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ctb", ""), 25, Gx_line+0, 139, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFFacCob, "")), 139, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9YU0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9YU0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Factura", ""), 30, Gx_line+10, 84, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 146, Gx_line+10, 201, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 205, Gx_line+10, 315, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 319, Gx_line+10, 374, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Total Bruto", ""), 378, Gx_line+10, 433, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Imp. Dto. P.P.", ""), 437, Gx_line+10, 492, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Base Imp.", ""), 496, Gx_line+10, 551, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Imp. IVA", ""), 555, Gx_line+10, 610, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 614, Gx_line+10, 669, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 673, Gx_line+10, 728, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ctb", ""), 732, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV73Facturacion_mantenimientofacturawwds_1_filterfulltext = AV12FilterFullText ;
      AV74Facturacion_mantenimientofacturawwds_2_tffaccod = AV17TFFacCod ;
      AV75Facturacion_mantenimientofacturawwds_3_tffaccod_to = AV18TFFacCod_To ;
      AV76Facturacion_mantenimientofacturawwds_4_tffacfch = AV19TFFacFch ;
      AV77Facturacion_mantenimientofacturawwds_5_tfclicod = AV23TFCliCod ;
      AV78Facturacion_mantenimientofacturawwds_6_tfclicod_to = AV24TFCliCod_To ;
      AV79Facturacion_mantenimientofacturawwds_7_tfclinom = AV25TFCliNom ;
      AV80Facturacion_mantenimientofacturawwds_8_tfclinom_sel = AV26TFCliNom_Sel ;
      AV81Facturacion_mantenimientofacturawwds_9_tffacpri = AV21TFFacPri ;
      AV82Facturacion_mantenimientofacturawwds_10_tffacpri_sel = AV22TFFacPri_Sel ;
      AV83Facturacion_mantenimientofacturawwds_11_tffacimptot = AV42TFFacImpTot ;
      AV84Facturacion_mantenimientofacturawwds_12_tffacimptot_to = AV43TFFacImpTot_To ;
      AV85Facturacion_mantenimientofacturawwds_13_tffacimppp = AV44TFFacImpPP ;
      AV86Facturacion_mantenimientofacturawwds_14_tffacimppp_to = AV45TFFacImpPP_To ;
      AV87Facturacion_mantenimientofacturawwds_15_tffacbasimp = AV46TFFacBasImp ;
      AV88Facturacion_mantenimientofacturawwds_16_tffacbasimp_to = AV47TFFacBasImp_To ;
      AV89Facturacion_mantenimientofacturawwds_17_tffacivaimp = AV48TFFacIVAImp ;
      AV90Facturacion_mantenimientofacturawwds_18_tffacivaimp_to = AV49TFFacIVAImp_To ;
      AV91Facturacion_mantenimientofacturawwds_19_tffactot = AV50TFFacTot ;
      AV92Facturacion_mantenimientofacturawwds_20_tffactot_to = AV51TFFacTot_To ;
      AV93Facturacion_mantenimientofacturawwds_21_tffacest_sels = AV60TFFacEst_Sels ;
      AV94Facturacion_mantenimientofacturawwds_22_tffaccob = AV62TFFacCob ;
      AV95Facturacion_mantenimientofacturawwds_23_tffaccob_sel = AV63TFFacCob_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A435FacEst) ,
                                           AV93Facturacion_mantenimientofacturawwds_21_tffacest_sels ,
                                           Integer.valueOf(AV74Facturacion_mantenimientofacturawwds_2_tffaccod) ,
                                           Integer.valueOf(AV75Facturacion_mantenimientofacturawwds_3_tffaccod_to) ,
                                           AV76Facturacion_mantenimientofacturawwds_4_tffacfch ,
                                           Integer.valueOf(AV77Facturacion_mantenimientofacturawwds_5_tfclicod) ,
                                           Integer.valueOf(AV78Facturacion_mantenimientofacturawwds_6_tfclicod_to) ,
                                           AV80Facturacion_mantenimientofacturawwds_8_tfclinom_sel ,
                                           AV79Facturacion_mantenimientofacturawwds_7_tfclinom ,
                                           AV82Facturacion_mantenimientofacturawwds_10_tffacpri_sel ,
                                           AV81Facturacion_mantenimientofacturawwds_9_tffacpri ,
                                           Integer.valueOf(AV93Facturacion_mantenimientofacturawwds_21_tffacest_sels.size()) ,
                                           AV95Facturacion_mantenimientofacturawwds_23_tffaccob_sel ,
                                           AV94Facturacion_mantenimientofacturawwds_22_tffaccob ,
                                           AV19TFFacFch ,
                                           AV20TFFacFch_To ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A450FacPri ,
                                           A965FacCob ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV73Facturacion_mantenimientofacturawwds_1_filterfulltext ,
                                           A441FacImpTot ,
                                           A440FacImpPP ,
                                           A429FacBasImp ,
                                           A442FacIVAImp ,
                                           A455FacTot ,
                                           AV83Facturacion_mantenimientofacturawwds_11_tffacimptot ,
                                           AV84Facturacion_mantenimientofacturawwds_12_tffacimptot_to ,
                                           AV85Facturacion_mantenimientofacturawwds_13_tffacimppp ,
                                           AV86Facturacion_mantenimientofacturawwds_14_tffacimppp_to ,
                                           AV87Facturacion_mantenimientofacturawwds_15_tffacbasimp ,
                                           AV88Facturacion_mantenimientofacturawwds_16_tffacbasimp_to ,
                                           AV89Facturacion_mantenimientofacturawwds_17_tffacivaimp ,
                                           AV90Facturacion_mantenimientofacturawwds_18_tffacivaimp_to ,
                                           AV91Facturacion_mantenimientofacturawwds_19_tffactot ,
                                           AV92Facturacion_mantenimientofacturawwds_20_tffactot_to ,
                                           Byte.valueOf(A1153FacTipFac) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE
                                           }
      });
      lV79Facturacion_mantenimientofacturawwds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV79Facturacion_mantenimientofacturawwds_7_tfclinom), 30, "%") ;
      lV81Facturacion_mantenimientofacturawwds_9_tffacpri = GXutil.padr( GXutil.rtrim( AV81Facturacion_mantenimientofacturawwds_9_tffacpri), 1, "%") ;
      lV94Facturacion_mantenimientofacturawwds_22_tffaccob = GXutil.padr( GXutil.rtrim( AV94Facturacion_mantenimientofacturawwds_22_tffaccob), 1, "%") ;
      /* Using cursor P09YU7 */
      pr_default.execute(0, new Object[] {AV83Facturacion_mantenimientofacturawwds_11_tffacimptot, AV83Facturacion_mantenimientofacturawwds_11_tffacimptot, AV84Facturacion_mantenimientofacturawwds_12_tffacimptot_to, AV84Facturacion_mantenimientofacturawwds_12_tffacimptot_to, AV85Facturacion_mantenimientofacturawwds_13_tffacimppp, AV85Facturacion_mantenimientofacturawwds_13_tffacimppp, AV86Facturacion_mantenimientofacturawwds_14_tffacimppp_to, AV86Facturacion_mantenimientofacturawwds_14_tffacimppp_to, Integer.valueOf(AV74Facturacion_mantenimientofacturawwds_2_tffaccod), Integer.valueOf(AV75Facturacion_mantenimientofacturawwds_3_tffaccod_to), AV76Facturacion_mantenimientofacturawwds_4_tffacfch, Integer.valueOf(AV77Facturacion_mantenimientofacturawwds_5_tfclicod), Integer.valueOf(AV78Facturacion_mantenimientofacturawwds_6_tfclicod_to), lV79Facturacion_mantenimientofacturawwds_7_tfclinom, AV80Facturacion_mantenimientofacturawwds_8_tfclinom_sel, lV81Facturacion_mantenimientofacturawwds_9_tffacpri, AV82Facturacion_mantenimientofacturawwds_10_tffacpri_sel, lV94Facturacion_mantenimientofacturawwds_22_tffaccob, AV95Facturacion_mantenimientofacturawwds_23_tffaccob_sel, AV19TFFacFch, AV20TFFacFch_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1153FacTipFac = P09YU7_A1153FacTipFac[0] ;
         A965FacCob = P09YU7_A965FacCob[0] ;
         A435FacEst = P09YU7_A435FacEst[0] ;
         A450FacPri = P09YU7_A450FacPri[0] ;
         A279CliNom = P09YU7_A279CliNom[0] ;
         A252CliCod = P09YU7_A252CliCod[0] ;
         A436FacFch = P09YU7_A436FacFch[0] ;
         A430FacCod = P09YU7_A430FacCod[0] ;
         A396EmprCod = P09YU7_A396EmprCod[0] ;
         A11513FacRecIca = P09YU7_A11513FacRecIca[0] ;
         A8346FacRecI = P09YU7_A8346FacRecI[0] ;
         n8346FacRecI = P09YU7_n8346FacRecI[0] ;
         A7212FacRect = P09YU7_A7212FacRect[0] ;
         A453FacRECPor = P09YU7_A453FacRECPor[0] ;
         A443FacIVAPor = P09YU7_A443FacIVAPor[0] ;
         A14224FacCostFac = P09YU7_A14224FacCostFac[0] ;
         A14223FacCostKgs = P09YU7_A14223FacCostKgs[0] ;
         A14222FacCostMts = P09YU7_A14222FacCostMts[0] ;
         A433FacDtoGen = P09YU7_A433FacDtoGen[0] ;
         A3918FacImpTot1 = P09YU7_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = P09YU7_n3918FacImpTot1[0] ;
         A7209Colombia = P09YU7_A7209Colombia[0] ;
         n7209Colombia = P09YU7_n7209Colombia[0] ;
         A440FacImpPP = P09YU7_A440FacImpPP[0] ;
         n440FacImpPP = P09YU7_n440FacImpPP[0] ;
         A441FacImpTot = P09YU7_A441FacImpTot[0] ;
         n441FacImpTot = P09YU7_n441FacImpTot[0] ;
         A7209Colombia = P09YU7_A7209Colombia[0] ;
         n7209Colombia = P09YU7_n7209Colombia[0] ;
         A279CliNom = P09YU7_A279CliNom[0] ;
         A441FacImpTot = P09YU7_A441FacImpTot[0] ;
         n441FacImpTot = P09YU7_n441FacImpTot[0] ;
         A3918FacImpTot1 = P09YU7_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = P09YU7_n3918FacImpTot1[0] ;
         A440FacImpPP = P09YU7_A440FacImpPP[0] ;
         n440FacImpPP = P09YU7_n440FacImpPP[0] ;
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Facturacion_mantenimientofacturawwds_15_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV87Facturacion_mantenimientofacturawwds_15_tffacbasimp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Facturacion_mantenimientofacturawwds_16_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV88Facturacion_mantenimientofacturawwds_16_tffacbasimp_to) <= 0 ) ) )
            {
               A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
               A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                  }
                  else
                  {
                     A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                  }
               }
               A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                  }
                  else
                  {
                     A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               if ( A7209Colombia == 0 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                  }
                  else
                  {
                     A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Facturacion_mantenimientofacturawwds_17_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV89Facturacion_mantenimientofacturawwds_17_tffacivaimp) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Facturacion_mantenimientofacturawwds_18_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV90Facturacion_mantenimientofacturawwds_18_tffacivaimp_to) <= 0 ) ) )
                  {
                     A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     if ( A7209Colombia == 0 )
                     {
                        A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                     }
                     else
                     {
                        if ( A7209Colombia == 1 )
                        {
                           A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                        }
                        else
                        {
                           A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                        }
                     }
                     A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                     if ( (GXutil.strcmp("", AV73Facturacion_mantenimientofacturawwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A430FacCod, 8, 0) , GXutil.padr( "%" + AV73Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV73Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV73Facturacion_mantenimientofacturawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A450FacPri) , GXutil.padr( "%" + GXutil.upper( AV73Facturacion_mantenimientofacturawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A441FacImpTot, 13, 2) , GXutil.padr( "%" + AV73Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A440FacImpPP, 11, 2) , GXutil.padr( "%" + AV73Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A429FacBasImp, 13, 2) , GXutil.padr( "%" + AV73Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A442FacIVAImp, 11, 2) , GXutil.padr( "%" + AV73Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A455FacTot, 13, 2) , GXutil.padr( "%" + AV73Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A435FacEst, 1, 0) , GXutil.padr( "%" + AV73Facturacion_mantenimientofacturawwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A965FacCob) , GXutil.padr( "%" + GXutil.upper( AV73Facturacion_mantenimientofacturawwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Facturacion_mantenimientofacturawwds_19_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV91Facturacion_mantenimientofacturawwds_19_tffactot) >= 0 ) ) )
                        {
                           if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Facturacion_mantenimientofacturawwds_20_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV92Facturacion_mantenimientofacturawwds_20_tffactot_to) <= 0 ) ) )
                           {
                              AV57FacEstDescription = "" ;
                              if ( A435FacEst == 0 )
                              {
                                 AV57FacEstDescription = httpContext.getMessage( "Pdte. Imp.", "") ;
                              }
                              else if ( A435FacEst == 1 )
                              {
                                 AV57FacEstDescription = httpContext.getMessage( "Imp.", "") ;
                              }
                              else if ( A435FacEst == 2 )
                              {
                                 AV57FacEstDescription = httpContext.getMessage( "Act.", "") ;
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
                              h9YU0( false, 36) ;
                              getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 30, Gx_line+10, 84, Gx_line+25, 2, 0, 0, 0) ;
                              getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 146, Gx_line+10, 201, Gx_line+25, 2, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 205, Gx_line+10, 315, Gx_line+25, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A450FacPri, "9")), 319, Gx_line+10, 374, Gx_line+25, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99")), 378, Gx_line+10, 433, Gx_line+25, 2, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A440FacImpPP, "ZZZZZZZ9.99")), 437, Gx_line+10, 492, Gx_line+25, 2, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99")), 496, Gx_line+10, 551, Gx_line+25, 2, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A442FacIVAImp, "ZZZZZZZ9.99")), 555, Gx_line+10, 610, Gx_line+25, 2, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A455FacTot, "ZZZZZZZZZ9.99")), 614, Gx_line+10, 669, Gx_line+25, 2, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57FacEstDescription, "")), 673, Gx_line+10, 728, Gx_line+25, 2, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A965FacCob, "")), 732, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
                        }
                     }
                  }
               }
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
      if ( GXutil.strcmp(AV13Session.getValue("Facturacion.MantenimientoFacturaWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.MantenimientoFacturaWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("Facturacion.MantenimientoFacturaWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV96GXV2 = 1 ;
      while ( AV96GXV2 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV96GXV2));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOD") == 0 )
         {
            AV17TFFacCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV18TFFacCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACFCH") == 0 )
         {
            AV19TFFacFch = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV23TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV25TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV26TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACPRI") == 0 )
         {
            AV21TFFacPri = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACPRI_SEL") == 0 )
         {
            AV22TFFacPri_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIMPTOT") == 0 )
         {
            AV42TFFacImpTot = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFFacImpTot_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIMPPP") == 0 )
         {
            AV44TFFacImpPP = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFFacImpPP_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBASIMP") == 0 )
         {
            AV46TFFacBasImp = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFFacBasImp_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIVAIMP") == 0 )
         {
            AV48TFFacIVAImp = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFFacIVAImp_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACTOT") == 0 )
         {
            AV50TFFacTot = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFFacTot_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACEST_SEL") == 0 )
         {
            AV58TFFacEst_SelsJson = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV60TFFacEst_Sels.fromJSonString(AV58TFFacEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOB") == 0 )
         {
            AV62TFFacCob = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOB_SEL") == 0 )
         {
            AV63TFFacCob_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV96GXV2 = (int)(AV96GXV2+1) ;
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

   public void h9YU0( boolean bFoot ,
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
               AV38PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV35DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV40Title = AV68Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV40Title = "" ;
      AV12FilterFullText = "" ;
      AV27TFFacCod_To_Description = "" ;
      AV19TFFacFch = GXutil.nullDate() ;
      AV29TFCliCod_To_Description = "" ;
      AV26TFCliNom_Sel = "" ;
      AV25TFCliNom = "" ;
      AV22TFFacPri_Sel = "" ;
      AV21TFFacPri = "" ;
      AV42TFFacImpTot = DecimalUtil.ZERO ;
      AV43TFFacImpTot_To = DecimalUtil.ZERO ;
      AV52TFFacImpTot_To_Description = "" ;
      AV44TFFacImpPP = DecimalUtil.ZERO ;
      AV45TFFacImpPP_To = DecimalUtil.ZERO ;
      AV53TFFacImpPP_To_Description = "" ;
      AV46TFFacBasImp = DecimalUtil.ZERO ;
      AV47TFFacBasImp_To = DecimalUtil.ZERO ;
      AV54TFFacBasImp_To_Description = "" ;
      AV48TFFacIVAImp = DecimalUtil.ZERO ;
      AV49TFFacIVAImp_To = DecimalUtil.ZERO ;
      AV55TFFacIVAImp_To_Description = "" ;
      AV50TFFacTot = DecimalUtil.ZERO ;
      AV51TFFacTot_To = DecimalUtil.ZERO ;
      AV56TFFacTot_To_Description = "" ;
      AV60TFFacEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV58TFFacEst_SelsJson = "" ;
      AV59TFFacEst_SelDscs = "" ;
      AV64FilterTFFacEst_SelValueDescription = "" ;
      AV63TFFacCob_Sel = "" ;
      AV62TFFacCob = "" ;
      A436FacFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A450FacPri = "" ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      A965FacCob = "" ;
      AV73Facturacion_mantenimientofacturawwds_1_filterfulltext = "" ;
      AV76Facturacion_mantenimientofacturawwds_4_tffacfch = GXutil.nullDate() ;
      AV79Facturacion_mantenimientofacturawwds_7_tfclinom = "" ;
      AV80Facturacion_mantenimientofacturawwds_8_tfclinom_sel = "" ;
      AV81Facturacion_mantenimientofacturawwds_9_tffacpri = "" ;
      AV82Facturacion_mantenimientofacturawwds_10_tffacpri_sel = "" ;
      AV83Facturacion_mantenimientofacturawwds_11_tffacimptot = DecimalUtil.ZERO ;
      AV84Facturacion_mantenimientofacturawwds_12_tffacimptot_to = DecimalUtil.ZERO ;
      AV85Facturacion_mantenimientofacturawwds_13_tffacimppp = DecimalUtil.ZERO ;
      AV86Facturacion_mantenimientofacturawwds_14_tffacimppp_to = DecimalUtil.ZERO ;
      AV87Facturacion_mantenimientofacturawwds_15_tffacbasimp = DecimalUtil.ZERO ;
      AV88Facturacion_mantenimientofacturawwds_16_tffacbasimp_to = DecimalUtil.ZERO ;
      AV89Facturacion_mantenimientofacturawwds_17_tffacivaimp = DecimalUtil.ZERO ;
      AV90Facturacion_mantenimientofacturawwds_18_tffacivaimp_to = DecimalUtil.ZERO ;
      AV91Facturacion_mantenimientofacturawwds_19_tffactot = DecimalUtil.ZERO ;
      AV92Facturacion_mantenimientofacturawwds_20_tffactot_to = DecimalUtil.ZERO ;
      AV93Facturacion_mantenimientofacturawwds_21_tffacest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV94Facturacion_mantenimientofacturawwds_22_tffaccob = "" ;
      AV95Facturacion_mantenimientofacturawwds_23_tffaccob_sel = "" ;
      lV73Facturacion_mantenimientofacturawwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV79Facturacion_mantenimientofacturawwds_7_tfclinom = "" ;
      lV81Facturacion_mantenimientofacturawwds_9_tffacpri = "" ;
      lV94Facturacion_mantenimientofacturawwds_22_tffaccob = "" ;
      AV20TFFacFch_To = GXutil.nullDate() ;
      P09YU7_A1153FacTipFac = new byte[1] ;
      P09YU7_A965FacCob = new String[] {""} ;
      P09YU7_A435FacEst = new byte[1] ;
      P09YU7_A450FacPri = new String[] {""} ;
      P09YU7_A279CliNom = new String[] {""} ;
      P09YU7_A252CliCod = new int[1] ;
      P09YU7_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09YU7_A430FacCod = new int[1] ;
      P09YU7_A396EmprCod = new String[] {""} ;
      P09YU7_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_n8346FacRecI = new boolean[] {false} ;
      P09YU7_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_A443FacIVAPor = new byte[1] ;
      P09YU7_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_n3918FacImpTot1 = new boolean[] {false} ;
      P09YU7_A7209Colombia = new byte[1] ;
      P09YU7_n7209Colombia = new boolean[] {false} ;
      P09YU7_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_n440FacImpPP = new boolean[] {false} ;
      P09YU7_A441FacImpTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YU7_n441FacImpTot = new boolean[] {false} ;
      A396EmprCod = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      AV57FacEstDescription = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38PageInfo = "" ;
      AV35DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV68Pgmdesc = "" ;
      AV33AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofacturawwexportreport__default(),
         new Object[] {
             new Object[] {
            P09YU7_A1153FacTipFac, P09YU7_A965FacCob, P09YU7_A435FacEst, P09YU7_A450FacPri, P09YU7_A279CliNom, P09YU7_A252CliCod, P09YU7_A436FacFch, P09YU7_A430FacCod, P09YU7_A396EmprCod, P09YU7_A11513FacRecIca,
            P09YU7_A8346FacRecI, P09YU7_n8346FacRecI, P09YU7_A7212FacRect, P09YU7_A453FacRECPor, P09YU7_A443FacIVAPor, P09YU7_A14224FacCostFac, P09YU7_A14223FacCostKgs, P09YU7_A14222FacCostMts, P09YU7_A433FacDtoGen, P09YU7_A3918FacImpTot1,
            P09YU7_n3918FacImpTot1, P09YU7_A7209Colombia, P09YU7_n7209Colombia, P09YU7_A440FacImpPP, P09YU7_n440FacImpPP, P09YU7_A441FacImpTot, P09YU7_n441FacImpTot
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV68Pgmdesc = httpContext.getMessage( "Mantenimiento Factura WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV68Pgmdesc = httpContext.getMessage( "Mantenimiento Factura WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV61TFFacEst_Sel ;
   private byte A435FacEst ;
   private byte A1153FacTipFac ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV17TFFacCod ;
   private int AV18TFFacCod_To ;
   private int AV23TFCliCod ;
   private int AV24TFCliCod_To ;
   private int AV71GXV1 ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV74Facturacion_mantenimientofacturawwds_2_tffaccod ;
   private int AV75Facturacion_mantenimientofacturawwds_3_tffaccod_to ;
   private int AV77Facturacion_mantenimientofacturawwds_5_tfclicod ;
   private int AV78Facturacion_mantenimientofacturawwds_6_tfclicod_to ;
   private int AV93Facturacion_mantenimientofacturawwds_21_tffacest_sels_size ;
   private int AV96GXV2 ;
   private long AV65i ;
   private java.math.BigDecimal AV42TFFacImpTot ;
   private java.math.BigDecimal AV43TFFacImpTot_To ;
   private java.math.BigDecimal AV44TFFacImpPP ;
   private java.math.BigDecimal AV45TFFacImpPP_To ;
   private java.math.BigDecimal AV46TFFacBasImp ;
   private java.math.BigDecimal AV47TFFacBasImp_To ;
   private java.math.BigDecimal AV48TFFacIVAImp ;
   private java.math.BigDecimal AV49TFFacIVAImp_To ;
   private java.math.BigDecimal AV50TFFacTot ;
   private java.math.BigDecimal AV51TFFacTot_To ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV83Facturacion_mantenimientofacturawwds_11_tffacimptot ;
   private java.math.BigDecimal AV84Facturacion_mantenimientofacturawwds_12_tffacimptot_to ;
   private java.math.BigDecimal AV85Facturacion_mantenimientofacturawwds_13_tffacimppp ;
   private java.math.BigDecimal AV86Facturacion_mantenimientofacturawwds_14_tffacimppp_to ;
   private java.math.BigDecimal AV87Facturacion_mantenimientofacturawwds_15_tffacbasimp ;
   private java.math.BigDecimal AV88Facturacion_mantenimientofacturawwds_16_tffacbasimp_to ;
   private java.math.BigDecimal AV89Facturacion_mantenimientofacturawwds_17_tffacivaimp ;
   private java.math.BigDecimal AV90Facturacion_mantenimientofacturawwds_18_tffacivaimp_to ;
   private java.math.BigDecimal AV91Facturacion_mantenimientofacturawwds_19_tffactot ;
   private java.math.BigDecimal AV92Facturacion_mantenimientofacturawwds_20_tffactot_to ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV26TFCliNom_Sel ;
   private String AV25TFCliNom ;
   private String AV22TFFacPri_Sel ;
   private String AV21TFFacPri ;
   private String AV63TFFacCob_Sel ;
   private String AV62TFFacCob ;
   private String A279CliNom ;
   private String A450FacPri ;
   private String A965FacCob ;
   private String AV79Facturacion_mantenimientofacturawwds_7_tfclinom ;
   private String AV80Facturacion_mantenimientofacturawwds_8_tfclinom_sel ;
   private String AV81Facturacion_mantenimientofacturawwds_9_tffacpri ;
   private String AV82Facturacion_mantenimientofacturawwds_10_tffacpri_sel ;
   private String AV94Facturacion_mantenimientofacturawwds_22_tffaccob ;
   private String AV95Facturacion_mantenimientofacturawwds_23_tffaccob_sel ;
   private String scmdbuf ;
   private String lV79Facturacion_mantenimientofacturawwds_7_tfclinom ;
   private String lV81Facturacion_mantenimientofacturawwds_9_tffacpri ;
   private String lV94Facturacion_mantenimientofacturawwds_22_tffaccob ;
   private String A396EmprCod ;
   private String AV68Pgmdesc ;
   private java.util.Date AV19TFFacFch ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV76Facturacion_mantenimientofacturawwds_4_tffacfch ;
   private java.util.Date AV20TFFacFch_To ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n8346FacRecI ;
   private boolean n3918FacImpTot1 ;
   private boolean n7209Colombia ;
   private boolean n440FacImpPP ;
   private boolean n441FacImpTot ;
   private String AV58TFFacEst_SelsJson ;
   private String AV40Title ;
   private String AV12FilterFullText ;
   private String AV27TFFacCod_To_Description ;
   private String AV29TFCliCod_To_Description ;
   private String AV52TFFacImpTot_To_Description ;
   private String AV53TFFacImpPP_To_Description ;
   private String AV54TFFacBasImp_To_Description ;
   private String AV55TFFacIVAImp_To_Description ;
   private String AV56TFFacTot_To_Description ;
   private String AV59TFFacEst_SelDscs ;
   private String AV64FilterTFFacEst_SelValueDescription ;
   private String AV73Facturacion_mantenimientofacturawwds_1_filterfulltext ;
   private String lV73Facturacion_mantenimientofacturawwds_1_filterfulltext ;
   private String AV57FacEstDescription ;
   private String AV38PageInfo ;
   private String AV35DateInfo ;
   private String AV33AppName ;
   private GXSimpleCollection<Byte> AV60TFFacEst_Sels ;
   private GXSimpleCollection<Byte> AV93Facturacion_mantenimientofacturawwds_21_tffacest_sels ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private byte[] P09YU7_A1153FacTipFac ;
   private String[] P09YU7_A965FacCob ;
   private byte[] P09YU7_A435FacEst ;
   private String[] P09YU7_A450FacPri ;
   private String[] P09YU7_A279CliNom ;
   private int[] P09YU7_A252CliCod ;
   private java.util.Date[] P09YU7_A436FacFch ;
   private int[] P09YU7_A430FacCod ;
   private String[] P09YU7_A396EmprCod ;
   private java.math.BigDecimal[] P09YU7_A11513FacRecIca ;
   private java.math.BigDecimal[] P09YU7_A8346FacRecI ;
   private boolean[] P09YU7_n8346FacRecI ;
   private java.math.BigDecimal[] P09YU7_A7212FacRect ;
   private java.math.BigDecimal[] P09YU7_A453FacRECPor ;
   private byte[] P09YU7_A443FacIVAPor ;
   private java.math.BigDecimal[] P09YU7_A14224FacCostFac ;
   private java.math.BigDecimal[] P09YU7_A14223FacCostKgs ;
   private java.math.BigDecimal[] P09YU7_A14222FacCostMts ;
   private java.math.BigDecimal[] P09YU7_A433FacDtoGen ;
   private java.math.BigDecimal[] P09YU7_A3918FacImpTot1 ;
   private boolean[] P09YU7_n3918FacImpTot1 ;
   private byte[] P09YU7_A7209Colombia ;
   private boolean[] P09YU7_n7209Colombia ;
   private java.math.BigDecimal[] P09YU7_A440FacImpPP ;
   private boolean[] P09YU7_n440FacImpPP ;
   private java.math.BigDecimal[] P09YU7_A441FacImpTot ;
   private boolean[] P09YU7_n441FacImpTot ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class mantenimientofacturawwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09YU7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A435FacEst ,
                                          GXSimpleCollection<Byte> AV93Facturacion_mantenimientofacturawwds_21_tffacest_sels ,
                                          int AV74Facturacion_mantenimientofacturawwds_2_tffaccod ,
                                          int AV75Facturacion_mantenimientofacturawwds_3_tffaccod_to ,
                                          java.util.Date AV76Facturacion_mantenimientofacturawwds_4_tffacfch ,
                                          int AV77Facturacion_mantenimientofacturawwds_5_tfclicod ,
                                          int AV78Facturacion_mantenimientofacturawwds_6_tfclicod_to ,
                                          String AV80Facturacion_mantenimientofacturawwds_8_tfclinom_sel ,
                                          String AV79Facturacion_mantenimientofacturawwds_7_tfclinom ,
                                          String AV82Facturacion_mantenimientofacturawwds_10_tffacpri_sel ,
                                          String AV81Facturacion_mantenimientofacturawwds_9_tffacpri ,
                                          int AV93Facturacion_mantenimientofacturawwds_21_tffacest_sels_size ,
                                          String AV95Facturacion_mantenimientofacturawwds_23_tffaccob_sel ,
                                          String AV94Facturacion_mantenimientofacturawwds_22_tffaccob ,
                                          java.util.Date AV19TFFacFch ,
                                          java.util.Date AV20TFFacFch_To ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A450FacPri ,
                                          String A965FacCob ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV73Facturacion_mantenimientofacturawwds_1_filterfulltext ,
                                          java.math.BigDecimal A441FacImpTot ,
                                          java.math.BigDecimal A440FacImpPP ,
                                          java.math.BigDecimal A429FacBasImp ,
                                          java.math.BigDecimal A442FacIVAImp ,
                                          java.math.BigDecimal A455FacTot ,
                                          java.math.BigDecimal AV83Facturacion_mantenimientofacturawwds_11_tffacimptot ,
                                          java.math.BigDecimal AV84Facturacion_mantenimientofacturawwds_12_tffacimptot_to ,
                                          java.math.BigDecimal AV85Facturacion_mantenimientofacturawwds_13_tffacimppp ,
                                          java.math.BigDecimal AV86Facturacion_mantenimientofacturawwds_14_tffacimppp_to ,
                                          java.math.BigDecimal AV87Facturacion_mantenimientofacturawwds_15_tffacbasimp ,
                                          java.math.BigDecimal AV88Facturacion_mantenimientofacturawwds_16_tffacbasimp_to ,
                                          java.math.BigDecimal AV89Facturacion_mantenimientofacturawwds_17_tffacivaimp ,
                                          java.math.BigDecimal AV90Facturacion_mantenimientofacturawwds_18_tffacivaimp_to ,
                                          java.math.BigDecimal AV91Facturacion_mantenimientofacturawwds_19_tffactot ,
                                          java.math.BigDecimal AV92Facturacion_mantenimientofacturawwds_20_tffactot_to ,
                                          byte A1153FacTipFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[21];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.FacTipFac, T1.FacCob, T1.FacEst, T1.FacPri, T3.CliNom, T1.CliCod, T1.FacFch, T1.FacCod, T1.EmprCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor," ;
      scmdbuf += " T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, COALESCE( T5.FacImpTot1, 0) AS FacImpTot1, T2.Colombia, COALESCE( T6.FacImpPP, 0) AS FacImpPP," ;
      scmdbuf += " COALESCE( T4.FacImpTot, 0) AS FacImpTot FROM (((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod) INNER JOIN (SELECT ROUND(COALESCE( T8.FacImpTot1, 0), 2) + ROUND(CAST(( COALESCE( T8.FacImpTot1, 0) * CAST(T7.FacEnergia AS NUMERIC(23,10)))" ;
      scmdbuf += " / 100 AS NUMERIC(27,10)), 2) AS FacImpTot, T7.EmprCod, T7.FacCod FROM (TXPCFAVEN T7 LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10))))" ;
      scmdbuf += " < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts" ;
      scmdbuf += " = 0) and (FacPreMts = 0) and (FacImpMan = 0) THEN 0 WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan ELSE ( ( FacPreKgs * CAST(FacKgs" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10))))" ;
      scmdbuf += " END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T8 ON T8.EmprCod = T7.EmprCod AND T8.FacCod = T7.FacCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod" ;
      scmdbuf += " = T1.FacCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0)" ;
      scmdbuf += " and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) THEN 0 WHEN" ;
      scmdbuf += " (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod = T1.FacCod) LEFT JOIN (SELECT CASE  WHEN COALESCE( T8.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE(" ;
      scmdbuf += " T9.FacImpTot1, 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 2) WHEN COALESCE( T8.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T9.FacImpTot1," ;
      scmdbuf += " 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 0) END AS FacImpPP, T7.EmprCod, T7.FacCod FROM ((TXPCFAVEN T7 INNER JOIN TXPEMPRES T8 ON T8.EmprCod" ;
      scmdbuf += " = T7.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0)" ;
      scmdbuf += " and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) THEN 0 WHEN" ;
      scmdbuf += " (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T9 ON T9.EmprCod = T7.EmprCod AND T9.FacCod = T7.FacCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.FacTipFac = 0)");
      if ( ! (0==AV74Facturacion_mantenimientofacturawwds_2_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV75Facturacion_mantenimientofacturawwds_3_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76Facturacion_mantenimientofacturawwds_4_tffacfch)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV77Facturacion_mantenimientofacturawwds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV78Facturacion_mantenimientofacturawwds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Facturacion_mantenimientofacturawwds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV79Facturacion_mantenimientofacturawwds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Facturacion_mantenimientofacturawwds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Facturacion_mantenimientofacturawwds_10_tffacpri_sel)==0) && ( ! (GXutil.strcmp("", AV81Facturacion_mantenimientofacturawwds_9_tffacpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Facturacion_mantenimientofacturawwds_10_tffacpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacPri = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( AV93Facturacion_mantenimientofacturawwds_21_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Facturacion_mantenimientofacturawwds_21_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV95Facturacion_mantenimientofacturawwds_23_tffaccob_sel)==0) && ( ! (GXutil.strcmp("", AV94Facturacion_mantenimientofacturawwds_22_tffaccob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FacCob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Facturacion_mantenimientofacturawwds_23_tffaccob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FacCob = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19TFFacFch)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20TFFacFch_To)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.FacFch DESC, T1.FacCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacFch" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacFch DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacPri" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacPri DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacEst" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacEst DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCob" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCob DESC" ;
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
                  return conditional_P09YU7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YU7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,3);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               return;
      }
   }

}

