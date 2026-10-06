package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webverhdrsexportreport_impl extends GXWebReport
{
   public webverhdrsexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV68Title = httpContext.getMessage( "Lista de Table LHIPRO", "") ;
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
         h9790( true, 0) ;
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
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV16HisProDTF) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV16HisProDTF, "99/99/99 99:99:99"), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV17HisProDTF_To) )
      {
         AV18HisProDTF_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Fin", ""), httpContext.getMessage( "WWP_MiddleText", ""), "", "", "", "", "", "", "") ;
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18HisProDTF_To_Description, "")), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV17HisProDTF_To, "99/99/99 99:99:99"), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV19MaqCod)==0) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Máquina", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19MaqCod, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV24TFBarCod) && (0==AV25TFBarCod_To) ) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Barcada", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFBarCod), "ZZZZZZZ9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV52TFBarCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Barcada", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFBarCod_To_Description, "")), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFBarCod_To), "ZZZZZZZ9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV26TFBarCodReo) && (0==AV27TFBarCodReo_To) ) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Reoperado Barcada", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFBarCodReo), "9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV53TFBarCodReo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Reoperado Barcada", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFBarCodReo_To_Description, "")), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFBarCodReo_To), "9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV29TFBarCodPar_Sel)==0) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Particion Barcada", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFBarCodPar_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV28TFBarCodPar)==0) )
         {
            h9790( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Particion Barcada", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFBarCodPar, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV30TFCliCod) && (0==AV31TFCliCod_To) ) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFCliCod), "ZZZZZ9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV54TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFCliCod_To_Description, "")), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TFCliCod_To), "ZZZZZ9")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFCliNom_Sel)==0) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFCliNom_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFCliNom)==0) )
         {
            h9790( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFCliNom, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV35TFBarSer_Sel)==0) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFBarSer_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV34TFBarSer)==0) )
         {
            h9790( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFBarSer, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV37TFBarSerDsc_Sel)==0) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción Serie", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFBarSerDsc_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFBarSerDsc)==0) )
         {
            h9790( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción Serie", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFBarSerDsc, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFHisProKgr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHisProKgr_To)==0) ) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "HisProKgr", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TFHisProKgr, "ZZZZZ9.99")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV55TFHisProKgr_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "HisProKgr", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFHisProKgr_To_Description, "")), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39TFHisProKgr_To, "ZZZZZ9.99")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHisProMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHisProMtr_To)==0) ) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "HisProMtr", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TFHisProMtr, "ZZZZZ9.99")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV56TFHisProMtr_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "HisProMtr", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFHisProMtr_To_Description, "")), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TFHisProMtr_To, "ZZZZZ9.99")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42TFHisProDTF) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV42TFHisProDTF, "99/99/99 99:99:99"), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFBarColNom_Sel)==0) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFBarColNom_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV44TFBarColNom)==0) )
         {
            h9790( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFBarColNom, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV47TFHisProCod_Sel)==0) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proceso", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFHisProCod_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFHisProCod)==0) )
         {
            h9790( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proceso", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFHisProCod, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV49TFMaqCod_Sel)==0) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Máquina", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFMaqCod_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV48TFMaqCod)==0) )
         {
            h9790( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Máquina", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFMaqCod, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV51TFMaqCDsc_Sel)==0) )
      {
         h9790( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo+Descripcion", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFMaqCDsc_Sel, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV50TFMaqCDsc)==0) )
         {
            h9790( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo+Descripcion", ""), 25, Gx_line+0, 208, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFMaqCDsc, "")), 208, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9790( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9790( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Barcada", ""), 30, Gx_line+10, 80, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Reoperado Barcada", ""), 84, Gx_line+10, 134, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Particion Barcada", ""), 138, Gx_line+10, 188, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 192, Gx_line+10, 242, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 246, Gx_line+10, 296, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 300, Gx_line+10, 350, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción Serie", ""), 354, Gx_line+10, 404, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "HisProKgr", ""), 408, Gx_line+10, 458, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "HisProMtr", ""), 462, Gx_line+10, 512, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 516, Gx_line+10, 566, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 570, Gx_line+10, 621, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proceso", ""), 625, Gx_line+10, 676, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Máquina", ""), 680, Gx_line+10, 731, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo+Descripcion", ""), 735, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV15FilterFullText ;
      AV77Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV16HisProDTF ;
      AV78Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV17HisProDTF_To ;
      AV79Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV19MaqCod ;
      AV80Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV24TFBarCod ;
      AV81Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV25TFBarCod_To ;
      AV82Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV26TFBarCodReo ;
      AV83Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV27TFBarCodReo_To ;
      AV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV28TFBarCodPar ;
      AV85Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV29TFBarCodPar_Sel ;
      AV86Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV30TFCliCod ;
      AV87Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV31TFCliCod_To ;
      AV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV32TFCliNom ;
      AV89Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV33TFCliNom_Sel ;
      AV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV34TFBarSer ;
      AV91Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV35TFBarSer_Sel ;
      AV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV36TFBarSerDsc ;
      AV93Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV37TFBarSerDsc_Sel ;
      AV94Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV38TFHisProKgr ;
      AV95Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV39TFHisProKgr_To ;
      AV96Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV40TFHisProMtr ;
      AV97Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV41TFHisProMtr_To ;
      AV98Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV42TFHisProDTF ;
      AV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV44TFBarColNom ;
      AV100Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV45TFBarColNom_Sel ;
      AV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV46TFHisProCod ;
      AV102Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV47TFHisProCod_Sel ;
      AV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV48TFMaqCod ;
      AV104Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV49TFMaqCod_Sel ;
      AV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV50TFMaqCDsc ;
      AV106Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV51TFMaqCDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV77Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV78Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV79Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV80Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV81Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV82Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV83Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV85Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV86Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV87Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV89Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV91Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV93Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV94Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV95Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV96Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV97Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV98Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV100Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV102Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV104Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV106Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV10EmprCod ,
                                           AV11Maqcod1 ,
                                           A396EmprCod ,
                                           AV12Maqcod2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV79Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV79Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor P09792 */
      pr_default.execute(0, new Object[] {AV10EmprCod, AV11Maqcod1, AV12Maqcod2, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV77Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV78Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV79Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV80Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV81Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV82Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV83Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV85Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV86Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV87Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV89Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV91Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV93Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV94Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV95Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV96Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV97Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV98Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV100Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV102Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV104Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV106Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09792_A396EmprCod[0] ;
         A2504HisProCod = P09792_A2504HisProCod[0] ;
         A135BarColNom = P09792_A135BarColNom[0] ;
         A1526HisProMtr = P09792_A1526HisProMtr[0] ;
         A1525HisProKgr = P09792_A1525HisProKgr[0] ;
         A1652BarSerDsc = P09792_A1652BarSerDsc[0] ;
         A212BarSer = P09792_A212BarSer[0] ;
         A279CliNom = P09792_A279CliNom[0] ;
         A252CliCod = P09792_A252CliCod[0] ;
         n252CliCod = P09792_n252CliCod[0] ;
         A130BarCodPar = P09792_A130BarCodPar[0] ;
         A132BarCodReo = P09792_A132BarCodReo[0] ;
         A129BarCod = P09792_A129BarCod[0] ;
         A4441HisProDTF = P09792_A4441HisProDTF[0] ;
         n4441HisProDTF = P09792_n4441HisProDTF[0] ;
         A606MaqDsc = P09792_A606MaqDsc[0] ;
         n606MaqDsc = P09792_n606MaqDsc[0] ;
         A602MaqCod = P09792_A602MaqCod[0] ;
         A558HisProFec = P09792_A558HisProFec[0] ;
         A561HisProLin = P09792_A561HisProLin[0] ;
         A135BarColNom = P09792_A135BarColNom[0] ;
         A1652BarSerDsc = P09792_A1652BarSerDsc[0] ;
         A212BarSer = P09792_A212BarSer[0] ;
         A252CliCod = P09792_A252CliCod[0] ;
         n252CliCod = P09792_n252CliCod[0] ;
         A279CliNom = P09792_A279CliNom[0] ;
         A606MaqDsc = P09792_A606MaqDsc[0] ;
         n606MaqDsc = P09792_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
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
         h9790( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 30, Gx_line+10, 80, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 84, Gx_line+10, 134, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 138, Gx_line+10, 188, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 192, Gx_line+10, 242, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 246, Gx_line+10, 296, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 300, Gx_line+10, 350, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 354, Gx_line+10, 404, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")), 408, Gx_line+10, 458, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")), 462, Gx_line+10, 512, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A4441HisProDTF, "99/99/99 99:99:99"), 516, Gx_line+10, 566, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 570, Gx_line+10, 621, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2504HisProCod, "")), 625, Gx_line+10, 676, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A602MaqCod, "")), 680, Gx_line+10, 731, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13734MaqCDsc, "")), 735, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebVerhdrsGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsGridState"), null, null);
      }
      AV13OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV14OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV107GXV1 = 1 ;
      while ( AV107GXV1 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV1));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "HISPRODTF") == 0 )
         {
            AV16HisProDTF = localUtil.ctot( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV17HisProDTF_To = localUtil.ctot( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "MAQCOD") == 0 )
         {
            AV19MaqCod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV24TFBarCod = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFBarCod_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV26TFBarCodReo = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFBarCodReo_To = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV28TFBarCodPar = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV29TFBarCodPar_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV30TFCliCod = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFCliCod_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV32TFCliNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV33TFCliNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV34TFBarSer = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV35TFBarSer_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV36TFBarSerDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV37TFBarSerDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV38TFHisProKgr = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFHisProKgr_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV40TFHisProMtr = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFHisProMtr_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV42TFHisProDTF = localUtil.ctot( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV44TFBarColNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV45TFBarColNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROCOD") == 0 )
         {
            AV46TFHisProCod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROCOD_SEL") == 0 )
         {
            AV47TFHisProCod_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV48TFMaqCod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV49TFMaqCod_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCDSC") == 0 )
         {
            AV50TFMaqCDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCDSC_SEL") == 0 )
         {
            AV51TFMaqCDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10EmprCod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD1") == 0 )
         {
            AV11Maqcod1 = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD2") == 0 )
         {
            AV12Maqcod2 = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV107GXV1 = (int)(AV107GXV1+1) ;
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

   public void h9790( boolean bFoot ,
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
               AV66PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV63DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV68Title = AV72Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV68Title = "" ;
      AV15FilterFullText = "" ;
      AV16HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV17HisProDTF_To = GXutil.resetTime( GXutil.nullDate() );
      AV18HisProDTF_To_Description = "" ;
      AV19MaqCod = "" ;
      AV52TFBarCod_To_Description = "" ;
      AV53TFBarCodReo_To_Description = "" ;
      AV29TFBarCodPar_Sel = "" ;
      AV28TFBarCodPar = "" ;
      AV54TFCliCod_To_Description = "" ;
      AV33TFCliNom_Sel = "" ;
      AV32TFCliNom = "" ;
      AV35TFBarSer_Sel = "" ;
      AV34TFBarSer = "" ;
      AV37TFBarSerDsc_Sel = "" ;
      AV36TFBarSerDsc = "" ;
      AV38TFHisProKgr = DecimalUtil.ZERO ;
      AV39TFHisProKgr_To = DecimalUtil.ZERO ;
      AV55TFHisProKgr_To_Description = "" ;
      AV40TFHisProMtr = DecimalUtil.ZERO ;
      AV41TFHisProMtr_To = DecimalUtil.ZERO ;
      AV56TFHisProMtr_To_Description = "" ;
      AV42TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV45TFBarColNom_Sel = "" ;
      AV44TFBarColNom = "" ;
      AV47TFHisProCod_Sel = "" ;
      AV46TFHisProCod = "" ;
      AV49TFMaqCod_Sel = "" ;
      AV48TFMaqCod = "" ;
      AV51TFMaqCDsc_Sel = "" ;
      AV50TFMaqCDsc = "" ;
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A135BarColNom = "" ;
      A2504HisProCod = "" ;
      A602MaqCod = "" ;
      A13734MaqCDsc = "" ;
      AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = "" ;
      AV77Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV78Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = GXutil.resetTime( GXutil.nullDate() );
      AV79Expedicionesautomatizadas_webverhdrsds_4_maqcod = "" ;
      AV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = "" ;
      AV85Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = "" ;
      AV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom = "" ;
      AV89Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = "" ;
      AV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser = "" ;
      AV91Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = "" ;
      AV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = "" ;
      AV93Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = "" ;
      AV94Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV95Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV96Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV97Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV98Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = "" ;
      AV100Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = "" ;
      AV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = "" ;
      AV102Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = "" ;
      AV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = "" ;
      AV104Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = "" ;
      AV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = "" ;
      AV106Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = "" ;
      scmdbuf = "" ;
      lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = "" ;
      lV79Expedicionesautomatizadas_webverhdrsds_4_maqcod = "" ;
      lV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = "" ;
      lV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom = "" ;
      lV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser = "" ;
      lV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = "" ;
      lV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = "" ;
      lV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = "" ;
      lV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = "" ;
      lV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = "" ;
      A606MaqDsc = "" ;
      AV10EmprCod = "" ;
      AV11Maqcod1 = "" ;
      A396EmprCod = "" ;
      AV12Maqcod2 = "" ;
      P09792_A396EmprCod = new String[] {""} ;
      P09792_A2504HisProCod = new String[] {""} ;
      P09792_A135BarColNom = new String[] {""} ;
      P09792_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09792_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09792_A1652BarSerDsc = new String[] {""} ;
      P09792_A212BarSer = new String[] {""} ;
      P09792_A279CliNom = new String[] {""} ;
      P09792_A252CliCod = new int[1] ;
      P09792_n252CliCod = new boolean[] {false} ;
      P09792_A130BarCodPar = new String[] {""} ;
      P09792_A132BarCodReo = new byte[1] ;
      P09792_A129BarCod = new int[1] ;
      P09792_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09792_n4441HisProDTF = new boolean[] {false} ;
      P09792_A606MaqDsc = new String[] {""} ;
      P09792_n606MaqDsc = new boolean[] {false} ;
      P09792_A602MaqCod = new String[] {""} ;
      P09792_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09792_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      AV20Session = httpContext.getWebSession();
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV66PageInfo = "" ;
      AV63DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV72Pgmdesc = "" ;
      AV61AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webverhdrsexportreport__default(),
         new Object[] {
             new Object[] {
            P09792_A396EmprCod, P09792_A2504HisProCod, P09792_A135BarColNom, P09792_A1526HisProMtr, P09792_A1525HisProKgr, P09792_A1652BarSerDsc, P09792_A212BarSer, P09792_A279CliNom, P09792_A252CliCod, P09792_n252CliCod,
            P09792_A130BarCodPar, P09792_A132BarCodReo, P09792_A129BarCod, P09792_A4441HisProDTF, P09792_n4441HisProDTF, P09792_A606MaqDsc, P09792_n606MaqDsc, P09792_A602MaqCod, P09792_A558HisProFec, P09792_A561HisProLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV72Pgmdesc = httpContext.getMessage( "Web Verhdrs Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV72Pgmdesc = httpContext.getMessage( "Web Verhdrs Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV26TFBarCodReo ;
   private byte AV27TFBarCodReo_To ;
   private byte A132BarCodReo ;
   private byte AV82Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ;
   private byte AV83Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ;
   private short gxcookieaux ;
   private short AV13OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV24TFBarCod ;
   private int AV25TFBarCod_To ;
   private int AV30TFCliCod ;
   private int AV31TFCliCod_To ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV80Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ;
   private int AV81Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ;
   private int AV86Expedicionesautomatizadas_webverhdrsds_11_tfclicod ;
   private int AV87Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ;
   private int A561HisProLin ;
   private int AV107GXV1 ;
   private java.math.BigDecimal AV38TFHisProKgr ;
   private java.math.BigDecimal AV39TFHisProKgr_To ;
   private java.math.BigDecimal AV40TFHisProMtr ;
   private java.math.BigDecimal AV41TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV94Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ;
   private java.math.BigDecimal AV95Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV96Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ;
   private java.math.BigDecimal AV97Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV19MaqCod ;
   private String AV29TFBarCodPar_Sel ;
   private String AV28TFBarCodPar ;
   private String AV33TFCliNom_Sel ;
   private String AV32TFCliNom ;
   private String AV35TFBarSer_Sel ;
   private String AV34TFBarSer ;
   private String AV37TFBarSerDsc_Sel ;
   private String AV36TFBarSerDsc ;
   private String AV45TFBarColNom_Sel ;
   private String AV44TFBarColNom ;
   private String AV47TFHisProCod_Sel ;
   private String AV46TFHisProCod ;
   private String AV49TFMaqCod_Sel ;
   private String AV48TFMaqCod ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A2504HisProCod ;
   private String A602MaqCod ;
   private String AV79Expedicionesautomatizadas_webverhdrsds_4_maqcod ;
   private String AV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ;
   private String AV85Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ;
   private String AV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom ;
   private String AV89Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ;
   private String AV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser ;
   private String AV91Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ;
   private String AV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ;
   private String AV93Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ;
   private String AV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ;
   private String AV100Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ;
   private String AV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ;
   private String AV102Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ;
   private String AV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ;
   private String AV104Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV79Expedicionesautomatizadas_webverhdrsds_4_maqcod ;
   private String lV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ;
   private String lV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom ;
   private String lV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser ;
   private String lV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ;
   private String lV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ;
   private String lV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ;
   private String lV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ;
   private String A606MaqDsc ;
   private String AV10EmprCod ;
   private String AV11Maqcod1 ;
   private String A396EmprCod ;
   private String AV12Maqcod2 ;
   private String AV72Pgmdesc ;
   private java.util.Date AV16HisProDTF ;
   private java.util.Date AV17HisProDTF_To ;
   private java.util.Date AV42TFHisProDTF ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV77Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ;
   private java.util.Date AV78Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ;
   private java.util.Date AV98Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ;
   private java.util.Date A558HisProFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV14OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n4441HisProDTF ;
   private boolean n606MaqDsc ;
   private String AV68Title ;
   private String AV15FilterFullText ;
   private String AV18HisProDTF_To_Description ;
   private String AV52TFBarCod_To_Description ;
   private String AV53TFBarCodReo_To_Description ;
   private String AV54TFCliCod_To_Description ;
   private String AV55TFHisProKgr_To_Description ;
   private String AV56TFHisProMtr_To_Description ;
   private String AV51TFMaqCDsc_Sel ;
   private String AV50TFMaqCDsc ;
   private String A13734MaqCDsc ;
   private String AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ;
   private String AV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ;
   private String AV106Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ;
   private String lV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ;
   private String lV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ;
   private String AV66PageInfo ;
   private String AV63DateInfo ;
   private String AV61AppName ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09792_A396EmprCod ;
   private String[] P09792_A2504HisProCod ;
   private String[] P09792_A135BarColNom ;
   private java.math.BigDecimal[] P09792_A1526HisProMtr ;
   private java.math.BigDecimal[] P09792_A1525HisProKgr ;
   private String[] P09792_A1652BarSerDsc ;
   private String[] P09792_A212BarSer ;
   private String[] P09792_A279CliNom ;
   private int[] P09792_A252CliCod ;
   private boolean[] P09792_n252CliCod ;
   private String[] P09792_A130BarCodPar ;
   private byte[] P09792_A132BarCodReo ;
   private int[] P09792_A129BarCod ;
   private java.util.Date[] P09792_A4441HisProDTF ;
   private boolean[] P09792_n4441HisProDTF ;
   private String[] P09792_A606MaqDsc ;
   private boolean[] P09792_n606MaqDsc ;
   private String[] P09792_A602MaqCod ;
   private java.util.Date[] P09792_A558HisProFec ;
   private int[] P09792_A561HisProLin ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
}

final  class webverhdrsexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09792( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV77Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV78Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV79Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV80Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV81Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV82Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV83Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV85Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV86Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV87Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV89Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV91Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV93Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV94Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV95Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV96Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV97Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV98Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV100Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV102Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV104Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV106Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV10EmprCod ,
                                          String AV11Maqcod1 ,
                                          String A396EmprCod ,
                                          String AV12Maqcod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[46];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.HisProDTF, T4.MaqDsc, T1.MaqCod, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (GXutil.strcmp("", AV76Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
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
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV78Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV80Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV81Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV82Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV83Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV84Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV86Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV87Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV88Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV90Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV92Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV98Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV99Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV101Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProCod" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
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
                  return conditional_P09792(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09792", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 6);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(16);
               ((int[]) buf[19])[0] = rslt.getInt(17);
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
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
      }
   }

}

