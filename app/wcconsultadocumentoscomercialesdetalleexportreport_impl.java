package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcconsultadocumentoscomercialesdetalleexportreport_impl extends GXWebReport
{
   public wcconsultadocumentoscomercialesdetalleexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV53Title = httpContext.getMessage( "Lista de Documento Comercial (v01)", "") ;
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
         h90T0( true, 0) ;
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
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV57TFAlbComLin) && (0==AV58TFAlbComLin_To) ) )
      {
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57TFAlbComLin), "ZZ9")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV77TFAlbComLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Linea", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFAlbComLin_To_Description, "")), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58TFAlbComLin_To), "ZZ9")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFAlbComNRef_Sel)==0) )
      {
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N/Ref", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFAlbComNRef_Sel, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV59TFAlbComNRef)==0) )
         {
            h90T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N/Ref", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFAlbComNRef, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV62TFAlbComVDoc_Sel)==0) )
      {
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "V/Doc", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFAlbComVDoc_Sel, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV61TFAlbComVDoc)==0) )
         {
            h90T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "V/Doc", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFAlbComVDoc, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV63TFAlbComPzas) && (0==AV64TFAlbComPzas_To) ) )
      {
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV63TFAlbComPzas), "ZZZZZ9")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV78TFAlbComPzas_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Piezas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFAlbComPzas_To_Description, "")), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64TFAlbComPzas_To), "ZZZZZ9")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFAlbComMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbComMts_To)==0) ) )
      {
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65TFAlbComMts, "ZZZZZZ9.99")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV79TFAlbComMts_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Metros", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFAlbComMts_To_Description, "")), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV66TFAlbComMts_To, "ZZZZZZ9.99")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV68TFAlbComArt_Sel)==0) )
      {
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Articulo", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68TFAlbComArt_Sel, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV67TFAlbComArt)==0) )
         {
            h90T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Articulo", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67TFAlbComArt, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV70TFAlbComArtD_Sel)==0) )
      {
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFAlbComArtD_Sel, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV69TFAlbComArtD)==0) )
         {
            h90T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFAlbComArtD, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV72TFAlbComCol_Sel)==0) )
      {
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFAlbComCol_Sel, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV71TFAlbComCol)==0) )
         {
            h90T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFAlbComCol, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFAlbComKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFAlbComKgs_To)==0) ) )
      {
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV73TFAlbComKgs, "ZZZZZZ9.99")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV80TFAlbComKgs_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kilos", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFAlbComKgs_To_Description, "")), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV74TFAlbComKgs_To, "ZZZZZZ9.99")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV76TFAlbComDsc_Sel)==0) )
      {
         h90T0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TFAlbComDsc_Sel, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV75TFAlbComDsc)==0) )
         {
            h90T0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 106, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFAlbComDsc, "")), 106, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h90T0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h90T0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 30, Gx_line+10, 102, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N/Ref", ""), 106, Gx_line+10, 178, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "V/Doc", ""), 182, Gx_line+10, 254, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 258, Gx_line+10, 330, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 334, Gx_line+10, 406, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Articulo", ""), 410, Gx_line+10, 482, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 486, Gx_line+10, 558, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 562, Gx_line+10, 634, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 638, Gx_line+10, 710, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 714, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV12FilterFullText ;
      AV88Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV57TFAlbComLin ;
      AV89Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV58TFAlbComLin_To ;
      AV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV59TFAlbComNRef ;
      AV91Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV60TFAlbComNRef_Sel ;
      AV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV61TFAlbComVDoc ;
      AV93Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV62TFAlbComVDoc_Sel ;
      AV94Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV63TFAlbComPzas ;
      AV95Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV64TFAlbComPzas_To ;
      AV96Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV65TFAlbComMts ;
      AV97Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV66TFAlbComMts_To ;
      AV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV67TFAlbComArt ;
      AV99Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV68TFAlbComArt_Sel ;
      AV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV69TFAlbComArtD ;
      AV101Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV70TFAlbComArtD_Sel ;
      AV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV71TFAlbComCol ;
      AV103Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV72TFAlbComCol_Sel ;
      AV104Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV73TFAlbComKgs ;
      AV105Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV74TFAlbComKgs_To ;
      AV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV75TFAlbComDsc ;
      AV107Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV76TFAlbComDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV88Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV89Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV94Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV95Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV96Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV97Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV99Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV101Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV103Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV104Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV105Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV107Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56AlbComCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A14AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor P090T2 */
      pr_default.execute(0, new Object[] {AV55Emprcod, Integer.valueOf(AV56AlbComCod), lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV88Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV89Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV91Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV93Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV94Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV95Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV96Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV97Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV99Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV101Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV103Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV104Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV105Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV107Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14AlbComCod = P090T2_A14AlbComCod[0] ;
         A396EmprCod = P090T2_A396EmprCod[0] ;
         A15AlbComDsc = P090T2_A15AlbComDsc[0] ;
         A13319AlbComKgs = P090T2_A13319AlbComKgs[0] ;
         A13322AlbComCol = P090T2_A13322AlbComCol[0] ;
         A13321AlbComArtD = P090T2_A13321AlbComArtD[0] ;
         A13320AlbComArt = P090T2_A13320AlbComArt[0] ;
         A13318AlbComMts = P090T2_A13318AlbComMts[0] ;
         A13317AlbComPzas = P090T2_A13317AlbComPzas[0] ;
         A13316AlbComVDoc = P090T2_A13316AlbComVDoc[0] ;
         A13315AlbComNRef = P090T2_A13315AlbComNRef[0] ;
         A20AlbComLin = P090T2_A20AlbComLin[0] ;
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
         h90T0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A20AlbComLin), "ZZ9")), 30, Gx_line+10, 102, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13315AlbComNRef, "")), 106, Gx_line+10, 178, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13316AlbComVDoc, "")), 182, Gx_line+10, 254, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13317AlbComPzas), "ZZZZZ9")), 258, Gx_line+10, 330, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13318AlbComMts, "ZZZZZZ9.99")), 334, Gx_line+10, 406, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13320AlbComArt, "")), 410, Gx_line+10, 482, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13321AlbComArtD, "")), 486, Gx_line+10, 558, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13322AlbComCol, "")), 562, Gx_line+10, 634, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13319AlbComKgs, "ZZZZZZ9.99")), 638, Gx_line+10, 710, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A15AlbComDsc, "")), 714, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("WCConsultaDocumentosComercialesDetalleGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDocumentosComercialesDetalleGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("WCConsultaDocumentosComercialesDetalleGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV108GXV1 = 1 ;
      while ( AV108GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV108GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMLIN") == 0 )
         {
            AV57TFAlbComLin = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFAlbComLin_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMNREF") == 0 )
         {
            AV59TFAlbComNRef = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMNREF_SEL") == 0 )
         {
            AV60TFAlbComNRef_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMVDOC") == 0 )
         {
            AV61TFAlbComVDoc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMVDOC_SEL") == 0 )
         {
            AV62TFAlbComVDoc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPZAS") == 0 )
         {
            AV63TFAlbComPzas = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFAlbComPzas_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMMTS") == 0 )
         {
            AV65TFAlbComMts = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFAlbComMts_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMART") == 0 )
         {
            AV67TFAlbComArt = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMART_SEL") == 0 )
         {
            AV68TFAlbComArt_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMARTD") == 0 )
         {
            AV69TFAlbComArtD = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMARTD_SEL") == 0 )
         {
            AV70TFAlbComArtD_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOL") == 0 )
         {
            AV71TFAlbComCol = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOL_SEL") == 0 )
         {
            AV72TFAlbComCol_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMKGS") == 0 )
         {
            AV73TFAlbComKgs = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV74TFAlbComKgs_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC") == 0 )
         {
            AV75TFAlbComDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC_SEL") == 0 )
         {
            AV76TFAlbComDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55Emprcod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMCOD") == 0 )
         {
            AV56AlbComCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV108GXV1 = (int)(AV108GXV1+1) ;
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

   public void h90T0( boolean bFoot ,
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
               AV51PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV48DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV53Title = AV83Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV53Title = "" ;
      AV12FilterFullText = "" ;
      AV77TFAlbComLin_To_Description = "" ;
      AV60TFAlbComNRef_Sel = "" ;
      AV59TFAlbComNRef = "" ;
      AV62TFAlbComVDoc_Sel = "" ;
      AV61TFAlbComVDoc = "" ;
      AV78TFAlbComPzas_To_Description = "" ;
      AV65TFAlbComMts = DecimalUtil.ZERO ;
      AV66TFAlbComMts_To = DecimalUtil.ZERO ;
      AV79TFAlbComMts_To_Description = "" ;
      AV68TFAlbComArt_Sel = "" ;
      AV67TFAlbComArt = "" ;
      AV70TFAlbComArtD_Sel = "" ;
      AV69TFAlbComArtD = "" ;
      AV72TFAlbComCol_Sel = "" ;
      AV71TFAlbComCol = "" ;
      AV73TFAlbComKgs = DecimalUtil.ZERO ;
      AV74TFAlbComKgs_To = DecimalUtil.ZERO ;
      AV80TFAlbComKgs_To_Description = "" ;
      AV76TFAlbComDsc_Sel = "" ;
      AV75TFAlbComDsc = "" ;
      A13315AlbComNRef = "" ;
      A13316AlbComVDoc = "" ;
      A13318AlbComMts = DecimalUtil.ZERO ;
      A13320AlbComArt = "" ;
      A13321AlbComArtD = "" ;
      A13322AlbComCol = "" ;
      A13319AlbComKgs = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = "" ;
      AV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = "" ;
      AV91Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = "" ;
      AV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = "" ;
      AV93Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = "" ;
      AV96Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = DecimalUtil.ZERO ;
      AV97Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = DecimalUtil.ZERO ;
      AV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = "" ;
      AV99Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = "" ;
      AV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = "" ;
      AV101Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = "" ;
      AV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = "" ;
      AV103Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = "" ;
      AV104Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = DecimalUtil.ZERO ;
      AV105Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = DecimalUtil.ZERO ;
      AV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = "" ;
      AV107Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = "" ;
      scmdbuf = "" ;
      lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = "" ;
      lV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = "" ;
      lV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = "" ;
      lV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = "" ;
      lV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = "" ;
      lV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = "" ;
      lV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = "" ;
      AV55Emprcod = "" ;
      A396EmprCod = "" ;
      P090T2_A14AlbComCod = new int[1] ;
      P090T2_A396EmprCod = new String[] {""} ;
      P090T2_A15AlbComDsc = new String[] {""} ;
      P090T2_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090T2_A13322AlbComCol = new String[] {""} ;
      P090T2_A13321AlbComArtD = new String[] {""} ;
      P090T2_A13320AlbComArt = new String[] {""} ;
      P090T2_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090T2_A13317AlbComPzas = new int[1] ;
      P090T2_A13316AlbComVDoc = new String[] {""} ;
      P090T2_A13315AlbComNRef = new String[] {""} ;
      P090T2_A20AlbComLin = new short[1] ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV51PageInfo = "" ;
      AV48DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV83Pgmdesc = "" ;
      AV46AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadocumentoscomercialesdetalleexportreport__default(),
         new Object[] {
             new Object[] {
            P090T2_A14AlbComCod, P090T2_A396EmprCod, P090T2_A15AlbComDsc, P090T2_A13319AlbComKgs, P090T2_A13322AlbComCol, P090T2_A13321AlbComArtD, P090T2_A13320AlbComArt, P090T2_A13318AlbComMts, P090T2_A13317AlbComPzas, P090T2_A13316AlbComVDoc,
            P090T2_A13315AlbComNRef, P090T2_A20AlbComLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV83Pgmdesc = httpContext.getMessage( "Lista Documentos Comerciales - Detalle", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV83Pgmdesc = httpContext.getMessage( "Lista Documentos Comerciales - Detalle", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV57TFAlbComLin ;
   private short AV58TFAlbComLin_To ;
   private short A20AlbComLin ;
   private short AV88Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ;
   private short AV89Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV63TFAlbComPzas ;
   private int AV64TFAlbComPzas_To ;
   private int A13317AlbComPzas ;
   private int AV94Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ;
   private int AV95Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ;
   private int AV56AlbComCod ;
   private int A14AlbComCod ;
   private int AV108GXV1 ;
   private java.math.BigDecimal AV65TFAlbComMts ;
   private java.math.BigDecimal AV66TFAlbComMts_To ;
   private java.math.BigDecimal AV73TFAlbComKgs ;
   private java.math.BigDecimal AV74TFAlbComKgs_To ;
   private java.math.BigDecimal A13318AlbComMts ;
   private java.math.BigDecimal A13319AlbComKgs ;
   private java.math.BigDecimal AV96Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ;
   private java.math.BigDecimal AV97Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ;
   private java.math.BigDecimal AV104Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ;
   private java.math.BigDecimal AV105Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV60TFAlbComNRef_Sel ;
   private String AV59TFAlbComNRef ;
   private String AV62TFAlbComVDoc_Sel ;
   private String AV61TFAlbComVDoc ;
   private String AV68TFAlbComArt_Sel ;
   private String AV67TFAlbComArt ;
   private String AV70TFAlbComArtD_Sel ;
   private String AV69TFAlbComArtD ;
   private String AV72TFAlbComCol_Sel ;
   private String AV71TFAlbComCol ;
   private String AV76TFAlbComDsc_Sel ;
   private String AV75TFAlbComDsc ;
   private String A13315AlbComNRef ;
   private String A13316AlbComVDoc ;
   private String A13320AlbComArt ;
   private String A13321AlbComArtD ;
   private String A13322AlbComCol ;
   private String A15AlbComDsc ;
   private String AV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ;
   private String AV91Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ;
   private String AV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ;
   private String AV93Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ;
   private String AV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ;
   private String AV99Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ;
   private String AV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ;
   private String AV101Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ;
   private String AV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ;
   private String AV103Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ;
   private String AV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ;
   private String AV107Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ;
   private String scmdbuf ;
   private String lV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ;
   private String lV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ;
   private String lV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ;
   private String lV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ;
   private String lV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ;
   private String lV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ;
   private String AV55Emprcod ;
   private String A396EmprCod ;
   private String AV83Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private String AV53Title ;
   private String AV12FilterFullText ;
   private String AV77TFAlbComLin_To_Description ;
   private String AV78TFAlbComPzas_To_Description ;
   private String AV79TFAlbComMts_To_Description ;
   private String AV80TFAlbComKgs_To_Description ;
   private String AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ;
   private String lV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ;
   private String AV51PageInfo ;
   private String AV48DateInfo ;
   private String AV46AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private int[] P090T2_A14AlbComCod ;
   private String[] P090T2_A396EmprCod ;
   private String[] P090T2_A15AlbComDsc ;
   private java.math.BigDecimal[] P090T2_A13319AlbComKgs ;
   private String[] P090T2_A13322AlbComCol ;
   private String[] P090T2_A13321AlbComArtD ;
   private String[] P090T2_A13320AlbComArt ;
   private java.math.BigDecimal[] P090T2_A13318AlbComMts ;
   private int[] P090T2_A13317AlbComPzas ;
   private String[] P090T2_A13316AlbComVDoc ;
   private String[] P090T2_A13315AlbComNRef ;
   private short[] P090T2_A20AlbComLin ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class wcconsultadocumentoscomercialesdetalleexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV88Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV89Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV93Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV94Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV95Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV96Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV97Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV99Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV101Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV103Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV104Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV105Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV107Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV55Emprcod ,
                                          int AV56AlbComCod ,
                                          String A396EmprCod ,
                                          int A14AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[32];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT AlbComCod, EmprCod, AlbComDsc, AlbComKgs, AlbComCol, AlbComArtD, AlbComArt, AlbComMts, AlbComPzas, AlbComVDoc, AlbComNRef, AlbComLin FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV88Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV89Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV90Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV92Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV94Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV95Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV98Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV100Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV102Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComLin" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComLin DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComNRef" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComNRef DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComVDoc" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComVDoc DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComPzas" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComPzas DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComMts" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComMts DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComArt" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComArt DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComArtD" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComArtD DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComCol" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComCol DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComKgs" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComKgs DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY AlbComDsc" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY AlbComDsc DESC" ;
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
                  return conditional_P090T2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
      }
   }

}

