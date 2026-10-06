package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpie2wwexportreport_impl extends GXWebReport
{
   public tdevpie2wwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV92Title = httpContext.getMessage( "Lista de Devolucion de Piezas (Detail)", "") ;
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
         h86P0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV98FilterFullText)==0) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98FilterFullText, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV45TFDevGenCod) && (0==AV46TFDevGenCod_To) ) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Devolucion ID", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFDevGenCod), "ZZZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV73TFDevGenCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "N Devolucion ID", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73TFDevGenCod_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFDevGenCod_To), "ZZZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47TFDevGenFec)) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Devolucion", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV47TFDevGenFec, "99/99/99"), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV49TFAlbRecCod) && (0==AV50TFAlbRecCod_To) ) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Recepcion", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TFAlbRecCod), "ZZZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV75TFAlbRecCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "N Recepcion", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFAlbRecCod_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TFAlbRecCod_To), "ZZZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV51TFDevGenDom) && (0==AV52TFDevGenDom_To) ) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Domicilio Envio", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51TFDevGenDom), "9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV76TFDevGenDom_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Domicilio Envio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TFDevGenDom_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52TFDevGenDom_To), "9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV53TFCliCod) && (0==AV54TFCliCod_To) ) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53TFCliCod), "ZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV77TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFCliCod_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54TFCliCod_To), "ZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV56TFCliNom_Sel)==0) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFCliNom_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV55TFCliNom)==0) )
         {
            h86P0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFCliNom, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV58TFAlbRef_Sel)==0) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cdg.Ref.", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFAlbRef_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV57TFAlbRef)==0) )
         {
            h86P0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cdg.Ref.", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFAlbRef, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV59TFDevGenTrn) && (0==AV60TFDevGenTrn_To) ) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV59TFDevGenTrn), "ZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV78TFDevGenTrn_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Transportista", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFDevGenTrn_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV60TFDevGenTrn_To), "ZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFDevTrnNom_Sel)==0) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFDevTrnNom_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV61TFDevTrnNom)==0) )
         {
            h86P0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFDevTrnNom, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFAlbRUniDis)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFAlbRUniDis_To)==0) ) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Und.Disp.", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63TFAlbRUniDis, "ZZZZZ9.99")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV79TFAlbRUniDis_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Und.Disp.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFAlbRUniDis_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TFAlbRUniDis_To, "ZZZZZ9.99")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV65TFAlbRPieDis) && (0==AV66TFAlbRPieDis_To) ) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Piezas Disponibles", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV65TFAlbRPieDis), "ZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV80TFAlbRPieDis_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Piezas Disponibles", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFAlbRPieDis_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV66TFAlbRPieDis_To), "ZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV102TFAlbRUni_Sels.fromJSonString(AV100TFAlbRUni_SelsJson, null);
      if ( ! ( AV102TFAlbRUni_Sels.size() == 0 ) )
      {
         AV104i = 1 ;
         AV115GXV1 = 1 ;
         while ( AV115GXV1 <= AV102TFAlbRUni_Sels.size() )
         {
            AV68TFAlbRUni_Sel = (String)AV102TFAlbRUni_Sels.elementAt(-1+AV115GXV1) ;
            if ( AV104i == 1 )
            {
               AV101TFAlbRUni_SelDscs = "" ;
            }
            else
            {
               AV101TFAlbRUni_SelDscs += ", " ;
            }
            AV103FilterTFAlbRUni_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV68TFAlbRUni_Sel), "K") == 0 )
            {
               AV103FilterTFAlbRUni_SelValueDescription = httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV68TFAlbRUni_Sel), "M") == 0 )
            {
               AV103FilterTFAlbRUni_SelValueDescription = httpContext.getMessage( "M", "") ;
            }
            AV101TFAlbRUni_SelDscs += AV103FilterTFAlbRUni_SelValueDescription ;
            AV104i = (long)(AV104i+1) ;
            AV115GXV1 = (int)(AV115GXV1+1) ;
         }
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101TFAlbRUni_SelDscs, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFDevGenUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFDevGenUni_To)==0) ) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades Dev", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TFDevGenUni, "ZZZZZ9.99")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV81TFDevGenUni_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidades Dev", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81TFDevGenUni_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV70TFDevGenUni_To, "ZZZZZ9.99")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV71TFDevGenPie) && (0==AV72TFDevGenPie_To) ) )
      {
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Piezas Dev", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV71TFDevGenPie), "ZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV82TFDevGenPie_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Piezas Dev", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h86P0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82TFDevGenPie_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV72TFDevGenPie_To), "ZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h86P0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h86P0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Devolucion ID", ""), 30, Gx_line+10, 80, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Devolucion", ""), 84, Gx_line+10, 134, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Recepcion", ""), 138, Gx_line+10, 188, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Domicilio Envio", ""), 192, Gx_line+10, 242, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 246, Gx_line+10, 296, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 300, Gx_line+10, 350, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cdg.Ref.", ""), 354, Gx_line+10, 404, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 408, Gx_line+10, 458, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 462, Gx_line+10, 512, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Und.Disp.", ""), 516, Gx_line+10, 566, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas Disponibles", ""), 570, Gx_line+10, 621, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 625, Gx_line+10, 677, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades Dev", ""), 681, Gx_line+10, 732, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas Dev", ""), 736, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV117Tdevpie2wwds_1_filterfulltext = AV98FilterFullText ;
      AV118Tdevpie2wwds_2_tfdevgencod = AV45TFDevGenCod ;
      AV119Tdevpie2wwds_3_tfdevgencod_to = AV46TFDevGenCod_To ;
      AV120Tdevpie2wwds_4_tfdevgenfec = AV47TFDevGenFec ;
      AV121Tdevpie2wwds_5_tfalbreccod = AV49TFAlbRecCod ;
      AV122Tdevpie2wwds_6_tfalbreccod_to = AV50TFAlbRecCod_To ;
      AV123Tdevpie2wwds_7_tfdevgendom = AV51TFDevGenDom ;
      AV124Tdevpie2wwds_8_tfdevgendom_to = AV52TFDevGenDom_To ;
      AV125Tdevpie2wwds_9_tfclicod = AV53TFCliCod ;
      AV126Tdevpie2wwds_10_tfclicod_to = AV54TFCliCod_To ;
      AV127Tdevpie2wwds_11_tfclinom = AV55TFCliNom ;
      AV128Tdevpie2wwds_12_tfclinom_sel = AV56TFCliNom_Sel ;
      AV129Tdevpie2wwds_13_tfalbref = AV57TFAlbRef ;
      AV130Tdevpie2wwds_14_tfalbref_sel = AV58TFAlbRef_Sel ;
      AV131Tdevpie2wwds_15_tfdevgentrn = AV59TFDevGenTrn ;
      AV132Tdevpie2wwds_16_tfdevgentrn_to = AV60TFDevGenTrn_To ;
      AV133Tdevpie2wwds_17_tfdevtrnnom = AV61TFDevTrnNom ;
      AV134Tdevpie2wwds_18_tfdevtrnnom_sel = AV62TFDevTrnNom_Sel ;
      AV135Tdevpie2wwds_19_tfalbrunidis = AV63TFAlbRUniDis ;
      AV136Tdevpie2wwds_20_tfalbrunidis_to = AV64TFAlbRUniDis_To ;
      AV137Tdevpie2wwds_21_tfalbrpiedis = AV65TFAlbRPieDis ;
      AV138Tdevpie2wwds_22_tfalbrpiedis_to = AV66TFAlbRPieDis_To ;
      AV139Tdevpie2wwds_23_tfalbruni_sels = AV102TFAlbRUni_Sels ;
      AV140Tdevpie2wwds_24_tfdevgenuni = AV69TFDevGenUni ;
      AV141Tdevpie2wwds_25_tfdevgenuni_to = AV70TFDevGenUni_To ;
      AV142Tdevpie2wwds_26_tfdevgenpie = AV71TFDevGenPie ;
      AV143Tdevpie2wwds_27_tfdevgenpie_to = AV72TFDevGenPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV139Tdevpie2wwds_23_tfalbruni_sels ,
                                           Integer.valueOf(AV118Tdevpie2wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV119Tdevpie2wwds_3_tfdevgencod_to) ,
                                           AV120Tdevpie2wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV121Tdevpie2wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV122Tdevpie2wwds_6_tfalbreccod_to) ,
                                           Byte.valueOf(AV123Tdevpie2wwds_7_tfdevgendom) ,
                                           Byte.valueOf(AV124Tdevpie2wwds_8_tfdevgendom_to) ,
                                           Integer.valueOf(AV125Tdevpie2wwds_9_tfclicod) ,
                                           Integer.valueOf(AV126Tdevpie2wwds_10_tfclicod_to) ,
                                           AV128Tdevpie2wwds_12_tfclinom_sel ,
                                           AV127Tdevpie2wwds_11_tfclinom ,
                                           AV130Tdevpie2wwds_14_tfalbref_sel ,
                                           AV129Tdevpie2wwds_13_tfalbref ,
                                           Short.valueOf(AV131Tdevpie2wwds_15_tfdevgentrn) ,
                                           Short.valueOf(AV132Tdevpie2wwds_16_tfdevgentrn_to) ,
                                           AV134Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                           AV133Tdevpie2wwds_17_tfdevtrnnom ,
                                           AV135Tdevpie2wwds_19_tfalbrunidis ,
                                           AV136Tdevpie2wwds_20_tfalbrunidis_to ,
                                           Integer.valueOf(AV137Tdevpie2wwds_21_tfalbrpiedis) ,
                                           Integer.valueOf(AV138Tdevpie2wwds_22_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV139Tdevpie2wwds_23_tfalbruni_sels.size()) ,
                                           AV140Tdevpie2wwds_24_tfdevgenuni ,
                                           AV141Tdevpie2wwds_25_tfdevgenuni_to ,
                                           Short.valueOf(AV142Tdevpie2wwds_26_tfdevgenpie) ,
                                           Short.valueOf(AV143Tdevpie2wwds_27_tfdevgenpie_to) ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Byte.valueOf(A6288DevGenDom) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Short.valueOf(A327DevGenTrn) ,
                                           A329DevTrnNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV117Tdevpie2wwds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV127Tdevpie2wwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV127Tdevpie2wwds_11_tfclinom), 30, "%") ;
      lV129Tdevpie2wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV129Tdevpie2wwds_13_tfalbref), 16, "%") ;
      lV133Tdevpie2wwds_17_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV133Tdevpie2wwds_17_tfdevtrnnom), 30, "%") ;
      /* Using cursor P086P2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV118Tdevpie2wwds_2_tfdevgencod), Integer.valueOf(AV119Tdevpie2wwds_3_tfdevgencod_to), AV120Tdevpie2wwds_4_tfdevgenfec, Integer.valueOf(AV121Tdevpie2wwds_5_tfalbreccod), Integer.valueOf(AV122Tdevpie2wwds_6_tfalbreccod_to), Byte.valueOf(AV123Tdevpie2wwds_7_tfdevgendom), Byte.valueOf(AV124Tdevpie2wwds_8_tfdevgendom_to), Integer.valueOf(AV125Tdevpie2wwds_9_tfclicod), Integer.valueOf(AV126Tdevpie2wwds_10_tfclicod_to), lV127Tdevpie2wwds_11_tfclinom, AV128Tdevpie2wwds_12_tfclinom_sel, lV129Tdevpie2wwds_13_tfalbref, AV130Tdevpie2wwds_14_tfalbref_sel, Short.valueOf(AV131Tdevpie2wwds_15_tfdevgentrn), Short.valueOf(AV132Tdevpie2wwds_16_tfdevgentrn_to), lV133Tdevpie2wwds_17_tfdevtrnnom, AV134Tdevpie2wwds_18_tfdevtrnnom_sel, AV135Tdevpie2wwds_19_tfalbrunidis, AV136Tdevpie2wwds_20_tfalbrunidis_to, Integer.valueOf(AV137Tdevpie2wwds_21_tfalbrpiedis), Integer.valueOf(AV138Tdevpie2wwds_22_tfalbrpiedis_to), AV140Tdevpie2wwds_24_tfdevgenuni, AV141Tdevpie2wwds_25_tfdevgenuni_to, Short.valueOf(AV142Tdevpie2wwds_26_tfdevgenpie), Short.valueOf(AV143Tdevpie2wwds_27_tfdevgenpie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P086P2_A396EmprCod[0] ;
         A326DevGenPie = P086P2_A326DevGenPie[0] ;
         n326DevGenPie = P086P2_n326DevGenPie[0] ;
         A328DevGenUni = P086P2_A328DevGenUni[0] ;
         n328DevGenUni = P086P2_n328DevGenUni[0] ;
         A51AlbRPieDis = P086P2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086P2_A57AlbRUniDis[0] ;
         A329DevTrnNom = P086P2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086P2_n329DevTrnNom[0] ;
         A327DevGenTrn = P086P2_A327DevGenTrn[0] ;
         n327DevGenTrn = P086P2_n327DevGenTrn[0] ;
         A45AlbRef = P086P2_A45AlbRef[0] ;
         A279CliNom = P086P2_A279CliNom[0] ;
         A252CliCod = P086P2_A252CliCod[0] ;
         n252CliCod = P086P2_n252CliCod[0] ;
         A6288DevGenDom = P086P2_A6288DevGenDom[0] ;
         n6288DevGenDom = P086P2_n6288DevGenDom[0] ;
         A44AlbRecCod = P086P2_A44AlbRecCod[0] ;
         n44AlbRecCod = P086P2_n44AlbRecCod[0] ;
         A325DevGenFec = P086P2_A325DevGenFec[0] ;
         n325DevGenFec = P086P2_n325DevGenFec[0] ;
         A323DevGenCod = P086P2_A323DevGenCod[0] ;
         A56AlbRUni = P086P2_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086P2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086P2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086P2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086P2_A60AlbRUniUti[0] ;
         A329DevTrnNom = P086P2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086P2_n329DevTrnNom[0] ;
         A279CliNom = P086P2_A279CliNom[0] ;
         A51AlbRPieDis = P086P2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086P2_A57AlbRUniDis[0] ;
         A45AlbRef = P086P2_A45AlbRef[0] ;
         A56AlbRUni = P086P2_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086P2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086P2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086P2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086P2_A60AlbRUniUti[0] ;
         if ( (GXutil.strcmp("", AV117Tdevpie2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV117Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV117Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6288DevGenDom, 1, 0) , GXutil.padr( "%" + AV117Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV117Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV117Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV117Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A327DevGenTrn, 4, 0) , GXutil.padr( "%" + AV117Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV117Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV117Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV117Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV117Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV117Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV117Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV117Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV99AlbRUniDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "K") == 0 )
            {
               AV99AlbRUniDescription = httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "M") == 0 )
            {
               AV99AlbRUniDescription = httpContext.getMessage( "M", "") ;
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
            h86P0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9")), 30, Gx_line+10, 80, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A325DevGenFec, "99/99/99"), 84, Gx_line+10, 134, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 138, Gx_line+10, 188, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9")), 192, Gx_line+10, 242, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 246, Gx_line+10, 296, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 300, Gx_line+10, 350, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 354, Gx_line+10, 404, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A327DevGenTrn), "ZZZ9")), 408, Gx_line+10, 458, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A329DevTrnNom, "")), 462, Gx_line+10, 512, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")), 516, Gx_line+10, 566, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")), 570, Gx_line+10, 621, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99AlbRUniDescription, "")), 625, Gx_line+10, 677, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A328DevGenUni, "ZZZZZ9.99")), 681, Gx_line+10, 732, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9")), 736, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV41Session.getValue("TDevPie2WWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDevPie2WWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("TDevPie2WWGridState"), null, null);
      }
      AV10OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV144GXV2 = 1 ;
      while ( AV144GXV2 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV144GXV2));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV98FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENCOD") == 0 )
         {
            AV45TFDevGenCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFDevGenCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENFEC") == 0 )
         {
            AV47TFDevGenFec = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV49TFAlbRecCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFAlbRecCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENDOM") == 0 )
         {
            AV51TFDevGenDom = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFDevGenDom_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV53TFCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFCliCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV55TFCliNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV56TFCliNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV57TFAlbRef = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV58TFAlbRef_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENTRN") == 0 )
         {
            AV59TFDevGenTrn = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFDevGenTrn_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM") == 0 )
         {
            AV61TFDevTrnNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM_SEL") == 0 )
         {
            AV62TFDevTrnNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV63TFAlbRUniDis = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFAlbRUniDis_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV65TFAlbRPieDis = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFAlbRPieDis_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV100TFAlbRUni_SelsJson = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV102TFAlbRUni_Sels.fromJSonString(AV100TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENUNI") == 0 )
         {
            AV69TFDevGenUni = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV70TFDevGenUni_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENPIE") == 0 )
         {
            AV71TFDevGenPie = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFDevGenPie_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV144GXV2 = (int)(AV144GXV2+1) ;
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

   public void h86P0( boolean bFoot ,
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
               AV89PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV85DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV92Title = AV112Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV106AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV92Title = "" ;
      AV98FilterFullText = "" ;
      AV73TFDevGenCod_To_Description = "" ;
      AV47TFDevGenFec = GXutil.nullDate() ;
      AV75TFAlbRecCod_To_Description = "" ;
      AV76TFDevGenDom_To_Description = "" ;
      AV77TFCliCod_To_Description = "" ;
      AV56TFCliNom_Sel = "" ;
      AV55TFCliNom = "" ;
      AV58TFAlbRef_Sel = "" ;
      AV57TFAlbRef = "" ;
      AV78TFDevGenTrn_To_Description = "" ;
      AV62TFDevTrnNom_Sel = "" ;
      AV61TFDevTrnNom = "" ;
      AV63TFAlbRUniDis = DecimalUtil.ZERO ;
      AV64TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV79TFAlbRUniDis_To_Description = "" ;
      AV80TFAlbRPieDis_To_Description = "" ;
      AV102TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV100TFAlbRUni_SelsJson = "" ;
      AV68TFAlbRUni_Sel = "" ;
      AV101TFAlbRUni_SelDscs = "" ;
      AV103FilterTFAlbRUni_SelValueDescription = "" ;
      AV69TFDevGenUni = DecimalUtil.ZERO ;
      AV70TFDevGenUni_To = DecimalUtil.ZERO ;
      AV81TFDevGenUni_To_Description = "" ;
      AV82TFDevGenPie_To_Description = "" ;
      A56AlbRUni = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A329DevTrnNom = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A328DevGenUni = DecimalUtil.ZERO ;
      AV117Tdevpie2wwds_1_filterfulltext = "" ;
      AV120Tdevpie2wwds_4_tfdevgenfec = GXutil.nullDate() ;
      AV127Tdevpie2wwds_11_tfclinom = "" ;
      AV128Tdevpie2wwds_12_tfclinom_sel = "" ;
      AV129Tdevpie2wwds_13_tfalbref = "" ;
      AV130Tdevpie2wwds_14_tfalbref_sel = "" ;
      AV133Tdevpie2wwds_17_tfdevtrnnom = "" ;
      AV134Tdevpie2wwds_18_tfdevtrnnom_sel = "" ;
      AV135Tdevpie2wwds_19_tfalbrunidis = DecimalUtil.ZERO ;
      AV136Tdevpie2wwds_20_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV139Tdevpie2wwds_23_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV140Tdevpie2wwds_24_tfdevgenuni = DecimalUtil.ZERO ;
      AV141Tdevpie2wwds_25_tfdevgenuni_to = DecimalUtil.ZERO ;
      lV117Tdevpie2wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV127Tdevpie2wwds_11_tfclinom = "" ;
      lV129Tdevpie2wwds_13_tfalbref = "" ;
      lV133Tdevpie2wwds_17_tfdevtrnnom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      P086P2_A396EmprCod = new String[] {""} ;
      P086P2_A326DevGenPie = new short[1] ;
      P086P2_n326DevGenPie = new boolean[] {false} ;
      P086P2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086P2_n328DevGenUni = new boolean[] {false} ;
      P086P2_A51AlbRPieDis = new int[1] ;
      P086P2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086P2_A329DevTrnNom = new String[] {""} ;
      P086P2_n329DevTrnNom = new boolean[] {false} ;
      P086P2_A327DevGenTrn = new short[1] ;
      P086P2_n327DevGenTrn = new boolean[] {false} ;
      P086P2_A45AlbRef = new String[] {""} ;
      P086P2_A279CliNom = new String[] {""} ;
      P086P2_A252CliCod = new int[1] ;
      P086P2_n252CliCod = new boolean[] {false} ;
      P086P2_A6288DevGenDom = new byte[1] ;
      P086P2_n6288DevGenDom = new boolean[] {false} ;
      P086P2_A44AlbRecCod = new int[1] ;
      P086P2_n44AlbRecCod = new boolean[] {false} ;
      P086P2_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086P2_n325DevGenFec = new boolean[] {false} ;
      P086P2_A323DevGenCod = new int[1] ;
      P086P2_A56AlbRUni = new String[] {""} ;
      P086P2_A52AlbRPieEnt = new int[1] ;
      P086P2_A54AlbRPieUti = new int[1] ;
      P086P2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086P2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      AV99AlbRUniDescription = "" ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV89PageInfo = "" ;
      AV85DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV112Pgmdesc = "" ;
      AV106AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie2wwexportreport__default(),
         new Object[] {
             new Object[] {
            P086P2_A396EmprCod, P086P2_A326DevGenPie, P086P2_n326DevGenPie, P086P2_A328DevGenUni, P086P2_n328DevGenUni, P086P2_A51AlbRPieDis, P086P2_A57AlbRUniDis, P086P2_A329DevTrnNom, P086P2_n329DevTrnNom, P086P2_A327DevGenTrn,
            P086P2_n327DevGenTrn, P086P2_A45AlbRef, P086P2_A279CliNom, P086P2_A252CliCod, P086P2_n252CliCod, P086P2_A6288DevGenDom, P086P2_n6288DevGenDom, P086P2_A44AlbRecCod, P086P2_n44AlbRecCod, P086P2_A325DevGenFec,
            P086P2_n325DevGenFec, P086P2_A323DevGenCod, P086P2_A56AlbRUni, P086P2_A52AlbRPieEnt, P086P2_A54AlbRPieUti, P086P2_A58AlbRUniEnt, P086P2_A60AlbRUniUti
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV112Pgmdesc = httpContext.getMessage( "TDev Pie2 WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV112Pgmdesc = httpContext.getMessage( "TDev Pie2 WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV51TFDevGenDom ;
   private byte AV52TFDevGenDom_To ;
   private byte A6288DevGenDom ;
   private byte AV123Tdevpie2wwds_7_tfdevgendom ;
   private byte AV124Tdevpie2wwds_8_tfdevgendom_to ;
   private short gxcookieaux ;
   private short AV59TFDevGenTrn ;
   private short AV60TFDevGenTrn_To ;
   private short AV71TFDevGenPie ;
   private short AV72TFDevGenPie_To ;
   private short A327DevGenTrn ;
   private short A326DevGenPie ;
   private short AV131Tdevpie2wwds_15_tfdevgentrn ;
   private short AV132Tdevpie2wwds_16_tfdevgentrn_to ;
   private short AV142Tdevpie2wwds_26_tfdevgenpie ;
   private short AV143Tdevpie2wwds_27_tfdevgenpie_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV45TFDevGenCod ;
   private int AV46TFDevGenCod_To ;
   private int AV49TFAlbRecCod ;
   private int AV50TFAlbRecCod_To ;
   private int AV53TFCliCod ;
   private int AV54TFCliCod_To ;
   private int AV65TFAlbRPieDis ;
   private int AV66TFAlbRPieDis_To ;
   private int AV115GXV1 ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A51AlbRPieDis ;
   private int AV118Tdevpie2wwds_2_tfdevgencod ;
   private int AV119Tdevpie2wwds_3_tfdevgencod_to ;
   private int AV121Tdevpie2wwds_5_tfalbreccod ;
   private int AV122Tdevpie2wwds_6_tfalbreccod_to ;
   private int AV125Tdevpie2wwds_9_tfclicod ;
   private int AV126Tdevpie2wwds_10_tfclicod_to ;
   private int AV137Tdevpie2wwds_21_tfalbrpiedis ;
   private int AV138Tdevpie2wwds_22_tfalbrpiedis_to ;
   private int AV139Tdevpie2wwds_23_tfalbruni_sels_size ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int AV144GXV2 ;
   private long AV104i ;
   private java.math.BigDecimal AV63TFAlbRUniDis ;
   private java.math.BigDecimal AV64TFAlbRUniDis_To ;
   private java.math.BigDecimal AV69TFDevGenUni ;
   private java.math.BigDecimal AV70TFDevGenUni_To ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal AV135Tdevpie2wwds_19_tfalbrunidis ;
   private java.math.BigDecimal AV136Tdevpie2wwds_20_tfalbrunidis_to ;
   private java.math.BigDecimal AV140Tdevpie2wwds_24_tfdevgenuni ;
   private java.math.BigDecimal AV141Tdevpie2wwds_25_tfdevgenuni_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV56TFCliNom_Sel ;
   private String AV55TFCliNom ;
   private String AV58TFAlbRef_Sel ;
   private String AV57TFAlbRef ;
   private String AV62TFDevTrnNom_Sel ;
   private String AV61TFDevTrnNom ;
   private String AV68TFAlbRUni_Sel ;
   private String A56AlbRUni ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A329DevTrnNom ;
   private String AV127Tdevpie2wwds_11_tfclinom ;
   private String AV128Tdevpie2wwds_12_tfclinom_sel ;
   private String AV129Tdevpie2wwds_13_tfalbref ;
   private String AV130Tdevpie2wwds_14_tfalbref_sel ;
   private String AV133Tdevpie2wwds_17_tfdevtrnnom ;
   private String AV134Tdevpie2wwds_18_tfdevtrnnom_sel ;
   private String scmdbuf ;
   private String lV127Tdevpie2wwds_11_tfclinom ;
   private String lV129Tdevpie2wwds_13_tfalbref ;
   private String lV133Tdevpie2wwds_17_tfdevtrnnom ;
   private String A396EmprCod ;
   private String AV112Pgmdesc ;
   private java.util.Date AV47TFDevGenFec ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date AV120Tdevpie2wwds_4_tfdevgenfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean n329DevTrnNom ;
   private boolean n327DevGenTrn ;
   private boolean n252CliCod ;
   private boolean n6288DevGenDom ;
   private boolean n44AlbRecCod ;
   private boolean n325DevGenFec ;
   private String AV100TFAlbRUni_SelsJson ;
   private String AV92Title ;
   private String AV98FilterFullText ;
   private String AV73TFDevGenCod_To_Description ;
   private String AV75TFAlbRecCod_To_Description ;
   private String AV76TFDevGenDom_To_Description ;
   private String AV77TFCliCod_To_Description ;
   private String AV78TFDevGenTrn_To_Description ;
   private String AV79TFAlbRUniDis_To_Description ;
   private String AV80TFAlbRPieDis_To_Description ;
   private String AV101TFAlbRUni_SelDscs ;
   private String AV103FilterTFAlbRUni_SelValueDescription ;
   private String AV81TFDevGenUni_To_Description ;
   private String AV82TFDevGenPie_To_Description ;
   private String AV117Tdevpie2wwds_1_filterfulltext ;
   private String lV117Tdevpie2wwds_1_filterfulltext ;
   private String AV99AlbRUniDescription ;
   private String AV89PageInfo ;
   private String AV85DateInfo ;
   private String AV106AppName ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private IDataStoreProvider pr_default ;
   private String[] P086P2_A396EmprCod ;
   private short[] P086P2_A326DevGenPie ;
   private boolean[] P086P2_n326DevGenPie ;
   private java.math.BigDecimal[] P086P2_A328DevGenUni ;
   private boolean[] P086P2_n328DevGenUni ;
   private int[] P086P2_A51AlbRPieDis ;
   private java.math.BigDecimal[] P086P2_A57AlbRUniDis ;
   private String[] P086P2_A329DevTrnNom ;
   private boolean[] P086P2_n329DevTrnNom ;
   private short[] P086P2_A327DevGenTrn ;
   private boolean[] P086P2_n327DevGenTrn ;
   private String[] P086P2_A45AlbRef ;
   private String[] P086P2_A279CliNom ;
   private int[] P086P2_A252CliCod ;
   private boolean[] P086P2_n252CliCod ;
   private byte[] P086P2_A6288DevGenDom ;
   private boolean[] P086P2_n6288DevGenDom ;
   private int[] P086P2_A44AlbRecCod ;
   private boolean[] P086P2_n44AlbRecCod ;
   private java.util.Date[] P086P2_A325DevGenFec ;
   private boolean[] P086P2_n325DevGenFec ;
   private int[] P086P2_A323DevGenCod ;
   private String[] P086P2_A56AlbRUni ;
   private int[] P086P2_A52AlbRPieEnt ;
   private int[] P086P2_A54AlbRPieUti ;
   private java.math.BigDecimal[] P086P2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P086P2_A60AlbRUniUti ;
   private GXSimpleCollection<String> AV102TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV139Tdevpie2wwds_23_tfalbruni_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class tdevpie2wwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086P2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV139Tdevpie2wwds_23_tfalbruni_sels ,
                                          int AV118Tdevpie2wwds_2_tfdevgencod ,
                                          int AV119Tdevpie2wwds_3_tfdevgencod_to ,
                                          java.util.Date AV120Tdevpie2wwds_4_tfdevgenfec ,
                                          int AV121Tdevpie2wwds_5_tfalbreccod ,
                                          int AV122Tdevpie2wwds_6_tfalbreccod_to ,
                                          byte AV123Tdevpie2wwds_7_tfdevgendom ,
                                          byte AV124Tdevpie2wwds_8_tfdevgendom_to ,
                                          int AV125Tdevpie2wwds_9_tfclicod ,
                                          int AV126Tdevpie2wwds_10_tfclicod_to ,
                                          String AV128Tdevpie2wwds_12_tfclinom_sel ,
                                          String AV127Tdevpie2wwds_11_tfclinom ,
                                          String AV130Tdevpie2wwds_14_tfalbref_sel ,
                                          String AV129Tdevpie2wwds_13_tfalbref ,
                                          short AV131Tdevpie2wwds_15_tfdevgentrn ,
                                          short AV132Tdevpie2wwds_16_tfdevgentrn_to ,
                                          String AV134Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                          String AV133Tdevpie2wwds_17_tfdevtrnnom ,
                                          java.math.BigDecimal AV135Tdevpie2wwds_19_tfalbrunidis ,
                                          java.math.BigDecimal AV136Tdevpie2wwds_20_tfalbrunidis_to ,
                                          int AV137Tdevpie2wwds_21_tfalbrpiedis ,
                                          int AV138Tdevpie2wwds_22_tfalbrpiedis_to ,
                                          int AV139Tdevpie2wwds_23_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV140Tdevpie2wwds_24_tfdevgenuni ,
                                          java.math.BigDecimal AV141Tdevpie2wwds_25_tfdevgenuni_to ,
                                          short AV142Tdevpie2wwds_26_tfdevgenpie ,
                                          short AV143Tdevpie2wwds_27_tfdevgenpie_to ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          byte A6288DevGenDom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          short A327DevGenTrn ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV117Tdevpie2wwds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[25];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevGenPie, T1.DevGenUni, COALESCE( T4.AlbRPieEnt, 0) - COALESCE( T4.AlbRPieUti, 0) AS AlbRPieDis, CASE  WHEN ( COALESCE( T4.AlbRUniEnt, 0)" ;
      scmdbuf += " - COALESCE( T4.AlbRUniUti, 0)) >= 0 THEN COALESCE( T4.AlbRUniEnt, 0) - COALESCE( T4.AlbRUniUti, 0) WHEN ( COALESCE( T4.AlbRUniEnt, 0) - COALESCE( T4.AlbRUniUti," ;
      scmdbuf += " 0)) < 0 THEN 0 END AS AlbRUniDis, T2.TrnNom AS DevTrnNom, T1.DevGenTrn AS DevGenTrn, T4.AlbRef, T3.CliNom, T1.CliCod, T1.DevGenDom, T1.AlbRecCod, T1.DevGenFec," ;
      scmdbuf += " T1.DevGenCod, T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRPieUti, T4.AlbRUniEnt, T4.AlbRUniUti FROM (((TXPDEVGEN T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TrnCod = T1.DevGenTrn) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      if ( ! (0==AV118Tdevpie2wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV119Tdevpie2wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Tdevpie2wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV121Tdevpie2wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV122Tdevpie2wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV123Tdevpie2wwds_7_tfdevgendom) )
      {
         addWhere(sWhereString, "(T1.DevGenDom >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV124Tdevpie2wwds_8_tfdevgendom_to) )
      {
         addWhere(sWhereString, "(T1.DevGenDom <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV125Tdevpie2wwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV126Tdevpie2wwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Tdevpie2wwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV127Tdevpie2wwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Tdevpie2wwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tdevpie2wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV129Tdevpie2wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tdevpie2wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV131Tdevpie2wwds_15_tfdevgentrn) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV132Tdevpie2wwds_16_tfdevgentrn_to) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Tdevpie2wwds_18_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Tdevpie2wwds_17_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Tdevpie2wwds_18_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Tdevpie2wwds_19_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) >= 0 THEN T4.AlbRUniEnt - T4.AlbRUniUti WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Tdevpie2wwds_20_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) >= 0 THEN T4.AlbRUniEnt - T4.AlbRUniUti WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV137Tdevpie2wwds_21_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T4.AlbRPieEnt - T4.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV138Tdevpie2wwds_22_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T4.AlbRPieEnt - T4.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( AV139Tdevpie2wwds_23_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV139Tdevpie2wwds_23_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Tdevpie2wwds_24_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV141Tdevpie2wwds_25_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV142Tdevpie2wwds_26_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV143Tdevpie2wwds_27_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenFec" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenDom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenDom DESC" ;
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
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRef" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRef DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenTrn" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenTrn DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRUni" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRUni DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenUni" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenUni DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenPie" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenPie DESC" ;
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
                  return conditional_P086P2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086P2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               ((int[]) buf[24])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,2);
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
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               return;
      }
   }

}

