package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webhdsto5exportreport_impl extends GXWebReport
{
   public webhdsto5exportreport_impl( com.genexus.internet.HttpContext context )
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
         AV63Title = httpContext.getMessage( "Lista de Tabla HDSTO1", "") ;
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
         h94Y0( true, 0) ;
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
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV27TFStp_Lin) && (0==AV28TFStp_Lin_To) ) )
      {
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("#", 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFStp_Lin), "ZZZ9")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFStp_Lin_To_Description = GXutil.format( "%1 (%2)", "#", httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFStp_Lin_To_Description, "")), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFStp_Lin_To), "ZZZ9")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV29TFStp_Dia) )
      {
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dia", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV29TFStp_Dia, "99/99/99 99:99"), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV32TFStp_Mot_Sel)==0) )
      {
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Motivo", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFStp_Mot_Sel, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFStp_Mot)==0) )
         {
            h94Y0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Motivo", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFStp_Mot, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV66TFStpHdr_Sel)==0) )
      {
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66TFStpHdr_Sel, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV65TFStpHdr)==0) )
         {
            h94Y0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFStpHdr, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV67TFStpClicod) && (0==AV68TFStpClicod_To) ) )
      {
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67TFStpClicod), "ZZZZZ9")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV77TFStpClicod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFStpClicod_To_Description, "")), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV68TFStpClicod_To), "ZZZZZ9")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV70TFStpCliNom_Sel)==0) )
      {
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFStpCliNom_Sel, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV69TFStpCliNom)==0) )
         {
            h94Y0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFStpCliNom, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV72TFStpBarser_Sel)==0) )
      {
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFStpBarser_Sel, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV71TFStpBarser)==0) )
         {
            h94Y0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFStpBarser, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV74TFStpBarserDsc_Sel)==0) )
      {
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFStpBarserDsc_Sel, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV73TFStpBarserDsc)==0) )
         {
            h94Y0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73TFStpBarserDsc, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV76TFStpColor_Sel)==0) )
      {
         h94Y0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TFStpColor_Sel, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV75TFStpColor)==0) )
         {
            h94Y0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 104, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFStpColor, "")), 104, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h94Y0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h94Y0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("#", 30, Gx_line+10, 85, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Dia", ""), 89, Gx_line+10, 144, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Motivo", ""), 148, Gx_line+10, 259, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 263, Gx_line+10, 319, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 323, Gx_line+10, 379, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 383, Gx_line+10, 495, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 499, Gx_line+10, 611, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 615, Gx_line+10, 727, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 731, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV84Webhdsto5ds_1_filterfulltext = AV12FilterFullText ;
      AV85Webhdsto5ds_2_tfstp_lin = AV27TFStp_Lin ;
      AV86Webhdsto5ds_3_tfstp_lin_to = AV28TFStp_Lin_To ;
      AV87Webhdsto5ds_4_tfstp_dia = AV29TFStp_Dia ;
      AV88Webhdsto5ds_5_tfstp_mot = AV31TFStp_Mot ;
      AV89Webhdsto5ds_6_tfstp_mot_sel = AV32TFStp_Mot_Sel ;
      AV90Webhdsto5ds_7_tfstphdr = AV65TFStpHdr ;
      AV91Webhdsto5ds_8_tfstphdr_sel = AV66TFStpHdr_Sel ;
      AV92Webhdsto5ds_9_tfstpclicod = AV67TFStpClicod ;
      AV93Webhdsto5ds_10_tfstpclicod_to = AV68TFStpClicod_To ;
      AV94Webhdsto5ds_11_tfstpclinom = AV69TFStpCliNom ;
      AV95Webhdsto5ds_12_tfstpclinom_sel = AV70TFStpCliNom_Sel ;
      AV96Webhdsto5ds_13_tfstpbarser = AV71TFStpBarser ;
      AV97Webhdsto5ds_14_tfstpbarser_sel = AV72TFStpBarser_Sel ;
      AV98Webhdsto5ds_15_tfstpbarserdsc = AV73TFStpBarserDsc ;
      AV99Webhdsto5ds_16_tfstpbarserdsc_sel = AV74TFStpBarserDsc_Sel ;
      AV100Webhdsto5ds_17_tfstpcolor = AV75TFStpColor ;
      AV101Webhdsto5ds_18_tfstpcolor_sel = AV76TFStpColor_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV85Webhdsto5ds_2_tfstp_lin) ,
                                           Short.valueOf(AV86Webhdsto5ds_3_tfstp_lin_to) ,
                                           AV87Webhdsto5ds_4_tfstp_dia ,
                                           AV89Webhdsto5ds_6_tfstp_mot_sel ,
                                           AV88Webhdsto5ds_5_tfstp_mot ,
                                           AV91Webhdsto5ds_8_tfstphdr_sel ,
                                           AV90Webhdsto5ds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV84Webhdsto5ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV92Webhdsto5ds_9_tfstpclicod) ,
                                           Integer.valueOf(AV93Webhdsto5ds_10_tfstpclicod_to) ,
                                           AV95Webhdsto5ds_12_tfstpclinom_sel ,
                                           AV94Webhdsto5ds_11_tfstpclinom ,
                                           AV97Webhdsto5ds_14_tfstpbarser_sel ,
                                           AV96Webhdsto5ds_13_tfstpbarser ,
                                           AV99Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                           AV98Webhdsto5ds_15_tfstpbarserdsc ,
                                           AV101Webhdsto5ds_18_tfstpcolor_sel ,
                                           AV100Webhdsto5ds_17_tfstpcolor ,
                                           Byte.valueOf(A10755Stp_Est) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV84Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV84Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV84Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV94Webhdsto5ds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV94Webhdsto5ds_11_tfstpclinom), 30, "%") ;
      lV96Webhdsto5ds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV96Webhdsto5ds_13_tfstpbarser), 16, "%") ;
      lV98Webhdsto5ds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV98Webhdsto5ds_15_tfstpbarserdsc), 26, "%") ;
      lV100Webhdsto5ds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV100Webhdsto5ds_17_tfstpcolor), 13, "%") ;
      lV88Webhdsto5ds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV88Webhdsto5ds_5_tfstp_mot), "%", "") ;
      lV90Webhdsto5ds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV90Webhdsto5ds_7_tfstphdr), 11, "%") ;
      /* Using cursor P094Y3 */
      pr_default.execute(0, new Object[] {AV84Webhdsto5ds_1_filterfulltext, lV84Webhdsto5ds_1_filterfulltext, lV84Webhdsto5ds_1_filterfulltext, lV84Webhdsto5ds_1_filterfulltext, lV84Webhdsto5ds_1_filterfulltext, lV84Webhdsto5ds_1_filterfulltext, lV84Webhdsto5ds_1_filterfulltext, lV84Webhdsto5ds_1_filterfulltext, lV84Webhdsto5ds_1_filterfulltext, Integer.valueOf(AV92Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV92Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV93Webhdsto5ds_10_tfstpclicod_to), Integer.valueOf(AV93Webhdsto5ds_10_tfstpclicod_to), AV95Webhdsto5ds_12_tfstpclinom_sel, AV94Webhdsto5ds_11_tfstpclinom, lV94Webhdsto5ds_11_tfstpclinom, AV95Webhdsto5ds_12_tfstpclinom_sel, AV95Webhdsto5ds_12_tfstpclinom_sel, AV97Webhdsto5ds_14_tfstpbarser_sel, AV96Webhdsto5ds_13_tfstpbarser, lV96Webhdsto5ds_13_tfstpbarser, AV97Webhdsto5ds_14_tfstpbarser_sel, AV97Webhdsto5ds_14_tfstpbarser_sel, AV99Webhdsto5ds_16_tfstpbarserdsc_sel, AV98Webhdsto5ds_15_tfstpbarserdsc, lV98Webhdsto5ds_15_tfstpbarserdsc, AV99Webhdsto5ds_16_tfstpbarserdsc_sel, AV99Webhdsto5ds_16_tfstpbarserdsc_sel, AV101Webhdsto5ds_18_tfstpcolor_sel, AV100Webhdsto5ds_17_tfstpcolor, lV100Webhdsto5ds_17_tfstpcolor, AV101Webhdsto5ds_18_tfstpcolor_sel, AV101Webhdsto5ds_18_tfstpcolor_sel, Short.valueOf(AV85Webhdsto5ds_2_tfstp_lin), Short.valueOf(AV86Webhdsto5ds_3_tfstp_lin_to), AV87Webhdsto5ds_4_tfstp_dia, lV88Webhdsto5ds_5_tfstp_mot, AV89Webhdsto5ds_6_tfstp_mot_sel, lV90Webhdsto5ds_7_tfstphdr, AV91Webhdsto5ds_8_tfstphdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P094Y3_A396EmprCod[0] ;
         A10755Stp_Est = P094Y3_A10755Stp_Est[0] ;
         A13723StpHdr = P094Y3_A13723StpHdr[0] ;
         A10752Stp_Mot = P094Y3_A10752Stp_Mot[0] ;
         A10751Stp_Dia = P094Y3_A10751Stp_Dia[0] ;
         A10750Stp_Lin = P094Y3_A10750Stp_Lin[0] ;
         A13728StpColor = P094Y3_A13728StpColor[0] ;
         n13728StpColor = P094Y3_n13728StpColor[0] ;
         A13725StpBarserD = P094Y3_A13725StpBarserD[0] ;
         n13725StpBarserD = P094Y3_n13725StpBarserD[0] ;
         A13724StpBarser = P094Y3_A13724StpBarser[0] ;
         n13724StpBarser = P094Y3_n13724StpBarser[0] ;
         A13727StpCliNom = P094Y3_A13727StpCliNom[0] ;
         n13727StpCliNom = P094Y3_n13727StpCliNom[0] ;
         A13726StpClicod = P094Y3_A13726StpClicod[0] ;
         n13726StpClicod = P094Y3_n13726StpClicod[0] ;
         A10746Stp_hdr = P094Y3_A10746Stp_hdr[0] ;
         A10747Stp_r = P094Y3_A10747Stp_r[0] ;
         A10748Stp_p = P094Y3_A10748Stp_p[0] ;
         A13723StpHdr = P094Y3_A13723StpHdr[0] ;
         A13728StpColor = P094Y3_A13728StpColor[0] ;
         n13728StpColor = P094Y3_n13728StpColor[0] ;
         A13725StpBarserD = P094Y3_A13725StpBarserD[0] ;
         n13725StpBarserD = P094Y3_n13725StpBarserD[0] ;
         A13724StpBarser = P094Y3_A13724StpBarser[0] ;
         n13724StpBarser = P094Y3_n13724StpBarser[0] ;
         A13726StpClicod = P094Y3_A13726StpClicod[0] ;
         n13726StpClicod = P094Y3_n13726StpClicod[0] ;
         A13727StpCliNom = P094Y3_A13727StpCliNom[0] ;
         n13727StpCliNom = P094Y3_n13727StpCliNom[0] ;
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
         h94Y0( false, 66) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10750Stp_Lin), "ZZZ9")), 30, Gx_line+10, 85, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A10751Stp_Dia, "99/99/99 99:99"), 89, Gx_line+10, 144, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10752Stp_Mot, "")), 148, Gx_line+10, 259, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13723StpHdr, "")), 263, Gx_line+10, 319, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13726StpClicod), "ZZZZZ9")), 323, Gx_line+10, 379, Gx_line+55, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13727StpCliNom, "")), 383, Gx_line+10, 495, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13724StpBarser, "")), 499, Gx_line+10, 611, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13725StpBarserD, "")), 615, Gx_line+10, 727, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13728StpColor, "")), 731, Gx_line+10, 787, Gx_line+55, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+65, 789, Gx_line+65, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+66) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("WebHDSTO5GridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebHDSTO5GridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("WebHDSTO5GridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV102GXV1 = 1 ;
      while ( AV102GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV102GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_LIN") == 0 )
         {
            AV27TFStp_Lin = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV28TFStp_Lin_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV29TFStp_Dia = localUtil.ctot( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV31TFStp_Mot = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV32TFStp_Mot_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV65TFStpHdr = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV66TFStpHdr_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV67TFStpClicod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFStpClicod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV69TFStpCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV70TFStpCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV71TFStpBarser = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV72TFStpBarser_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV73TFStpBarserDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV74TFStpBarserDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV75TFStpColor = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV76TFStpColor_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV102GXV1 = (int)(AV102GXV1+1) ;
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

   public void h94Y0( boolean bFoot ,
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
               AV61PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV58DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV63Title = AV80Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV63Title = "" ;
      AV12FilterFullText = "" ;
      AV49TFStp_Lin_To_Description = "" ;
      AV29TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV32TFStp_Mot_Sel = "" ;
      AV31TFStp_Mot = "" ;
      AV66TFStpHdr_Sel = "" ;
      AV65TFStpHdr = "" ;
      AV77TFStpClicod_To_Description = "" ;
      AV70TFStpCliNom_Sel = "" ;
      AV69TFStpCliNom = "" ;
      AV72TFStpBarser_Sel = "" ;
      AV71TFStpBarser = "" ;
      AV74TFStpBarserDsc_Sel = "" ;
      AV73TFStpBarserDsc = "" ;
      AV76TFStpColor_Sel = "" ;
      AV75TFStpColor = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      AV84Webhdsto5ds_1_filterfulltext = "" ;
      AV87Webhdsto5ds_4_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV88Webhdsto5ds_5_tfstp_mot = "" ;
      AV89Webhdsto5ds_6_tfstp_mot_sel = "" ;
      AV90Webhdsto5ds_7_tfstphdr = "" ;
      AV91Webhdsto5ds_8_tfstphdr_sel = "" ;
      AV94Webhdsto5ds_11_tfstpclinom = "" ;
      AV95Webhdsto5ds_12_tfstpclinom_sel = "" ;
      AV96Webhdsto5ds_13_tfstpbarser = "" ;
      AV97Webhdsto5ds_14_tfstpbarser_sel = "" ;
      AV98Webhdsto5ds_15_tfstpbarserdsc = "" ;
      AV99Webhdsto5ds_16_tfstpbarserdsc_sel = "" ;
      AV100Webhdsto5ds_17_tfstpcolor = "" ;
      AV101Webhdsto5ds_18_tfstpcolor_sel = "" ;
      lV84Webhdsto5ds_1_filterfulltext = "" ;
      lV94Webhdsto5ds_11_tfstpclinom = "" ;
      lV96Webhdsto5ds_13_tfstpbarser = "" ;
      lV98Webhdsto5ds_15_tfstpbarserdsc = "" ;
      lV100Webhdsto5ds_17_tfstpcolor = "" ;
      scmdbuf = "" ;
      lV88Webhdsto5ds_5_tfstp_mot = "" ;
      lV90Webhdsto5ds_7_tfstphdr = "" ;
      A10748Stp_p = "" ;
      P094Y3_A129BarCod = new int[1] ;
      P094Y3_A132BarCodReo = new byte[1] ;
      P094Y3_A130BarCodPar = new String[] {""} ;
      P094Y3_A396EmprCod = new String[] {""} ;
      P094Y3_A10755Stp_Est = new byte[1] ;
      P094Y3_A13723StpHdr = new String[] {""} ;
      P094Y3_A10752Stp_Mot = new String[] {""} ;
      P094Y3_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P094Y3_A10750Stp_Lin = new short[1] ;
      P094Y3_A13728StpColor = new String[] {""} ;
      P094Y3_n13728StpColor = new boolean[] {false} ;
      P094Y3_A13725StpBarserD = new String[] {""} ;
      P094Y3_n13725StpBarserD = new boolean[] {false} ;
      P094Y3_A13724StpBarser = new String[] {""} ;
      P094Y3_n13724StpBarser = new boolean[] {false} ;
      P094Y3_A13727StpCliNom = new String[] {""} ;
      P094Y3_n13727StpCliNom = new boolean[] {false} ;
      P094Y3_A13726StpClicod = new int[1] ;
      P094Y3_n13726StpClicod = new boolean[] {false} ;
      P094Y3_A10746Stp_hdr = new int[1] ;
      P094Y3_A10747Stp_r = new byte[1] ;
      P094Y3_A10748Stp_p = new String[] {""} ;
      A396EmprCod = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV61PageInfo = "" ;
      AV58DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV80Pgmdesc = "" ;
      AV56AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webhdsto5exportreport__default(),
         new Object[] {
             new Object[] {
            P094Y3_A129BarCod, P094Y3_A132BarCodReo, P094Y3_A130BarCodPar, P094Y3_A396EmprCod, P094Y3_A10755Stp_Est, P094Y3_A13723StpHdr, P094Y3_A10752Stp_Mot, P094Y3_A10751Stp_Dia, P094Y3_A10750Stp_Lin, P094Y3_A13728StpColor,
            P094Y3_n13728StpColor, P094Y3_A13725StpBarserD, P094Y3_n13725StpBarserD, P094Y3_A13724StpBarser, P094Y3_n13724StpBarser, P094Y3_A13727StpCliNom, P094Y3_n13727StpCliNom, P094Y3_A13726StpClicod, P094Y3_n13726StpClicod, P094Y3_A10746Stp_hdr,
            P094Y3_A10747Stp_r, P094Y3_A10748Stp_p
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV80Pgmdesc = httpContext.getMessage( "Web HDSTO5 Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV80Pgmdesc = httpContext.getMessage( "Web HDSTO5 Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A10747Stp_r ;
   private byte A10755Stp_Est ;
   private short gxcookieaux ;
   private short AV27TFStp_Lin ;
   private short AV28TFStp_Lin_To ;
   private short A10750Stp_Lin ;
   private short AV85Webhdsto5ds_2_tfstp_lin ;
   private short AV86Webhdsto5ds_3_tfstp_lin_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV67TFStpClicod ;
   private int AV68TFStpClicod_To ;
   private int A13726StpClicod ;
   private int AV92Webhdsto5ds_9_tfstpclicod ;
   private int AV93Webhdsto5ds_10_tfstpclicod_to ;
   private int A10746Stp_hdr ;
   private int AV102GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV66TFStpHdr_Sel ;
   private String AV65TFStpHdr ;
   private String AV70TFStpCliNom_Sel ;
   private String AV69TFStpCliNom ;
   private String AV72TFStpBarser_Sel ;
   private String AV71TFStpBarser ;
   private String AV74TFStpBarserDsc_Sel ;
   private String AV73TFStpBarserDsc ;
   private String AV76TFStpColor_Sel ;
   private String AV75TFStpColor ;
   private String A13723StpHdr ;
   private String A13727StpCliNom ;
   private String A13724StpBarser ;
   private String A13725StpBarserD ;
   private String A13728StpColor ;
   private String AV90Webhdsto5ds_7_tfstphdr ;
   private String AV91Webhdsto5ds_8_tfstphdr_sel ;
   private String AV94Webhdsto5ds_11_tfstpclinom ;
   private String AV95Webhdsto5ds_12_tfstpclinom_sel ;
   private String AV96Webhdsto5ds_13_tfstpbarser ;
   private String AV97Webhdsto5ds_14_tfstpbarser_sel ;
   private String AV98Webhdsto5ds_15_tfstpbarserdsc ;
   private String AV99Webhdsto5ds_16_tfstpbarserdsc_sel ;
   private String AV100Webhdsto5ds_17_tfstpcolor ;
   private String AV101Webhdsto5ds_18_tfstpcolor_sel ;
   private String lV94Webhdsto5ds_11_tfstpclinom ;
   private String lV96Webhdsto5ds_13_tfstpbarser ;
   private String lV98Webhdsto5ds_15_tfstpbarserdsc ;
   private String lV100Webhdsto5ds_17_tfstpcolor ;
   private String scmdbuf ;
   private String lV90Webhdsto5ds_7_tfstphdr ;
   private String A10748Stp_p ;
   private String A396EmprCod ;
   private String AV80Pgmdesc ;
   private java.util.Date AV29TFStp_Dia ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date AV87Webhdsto5ds_4_tfstp_dia ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n13728StpColor ;
   private boolean n13725StpBarserD ;
   private boolean n13724StpBarser ;
   private boolean n13727StpCliNom ;
   private boolean n13726StpClicod ;
   private String AV63Title ;
   private String AV12FilterFullText ;
   private String AV49TFStp_Lin_To_Description ;
   private String AV32TFStp_Mot_Sel ;
   private String AV31TFStp_Mot ;
   private String AV77TFStpClicod_To_Description ;
   private String A10752Stp_Mot ;
   private String AV84Webhdsto5ds_1_filterfulltext ;
   private String AV88Webhdsto5ds_5_tfstp_mot ;
   private String AV89Webhdsto5ds_6_tfstp_mot_sel ;
   private String lV84Webhdsto5ds_1_filterfulltext ;
   private String lV88Webhdsto5ds_5_tfstp_mot ;
   private String AV61PageInfo ;
   private String AV58DateInfo ;
   private String AV56AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private int[] P094Y3_A129BarCod ;
   private byte[] P094Y3_A132BarCodReo ;
   private String[] P094Y3_A130BarCodPar ;
   private String[] P094Y3_A396EmprCod ;
   private byte[] P094Y3_A10755Stp_Est ;
   private String[] P094Y3_A13723StpHdr ;
   private String[] P094Y3_A10752Stp_Mot ;
   private java.util.Date[] P094Y3_A10751Stp_Dia ;
   private short[] P094Y3_A10750Stp_Lin ;
   private String[] P094Y3_A13728StpColor ;
   private boolean[] P094Y3_n13728StpColor ;
   private String[] P094Y3_A13725StpBarserD ;
   private boolean[] P094Y3_n13725StpBarserD ;
   private String[] P094Y3_A13724StpBarser ;
   private boolean[] P094Y3_n13724StpBarser ;
   private String[] P094Y3_A13727StpCliNom ;
   private boolean[] P094Y3_n13727StpCliNom ;
   private int[] P094Y3_A13726StpClicod ;
   private boolean[] P094Y3_n13726StpClicod ;
   private int[] P094Y3_A10746Stp_hdr ;
   private byte[] P094Y3_A10747Stp_r ;
   private String[] P094Y3_A10748Stp_p ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class webhdsto5exportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094Y3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV85Webhdsto5ds_2_tfstp_lin ,
                                          short AV86Webhdsto5ds_3_tfstp_lin_to ,
                                          java.util.Date AV87Webhdsto5ds_4_tfstp_dia ,
                                          String AV89Webhdsto5ds_6_tfstp_mot_sel ,
                                          String AV88Webhdsto5ds_5_tfstp_mot ,
                                          String AV91Webhdsto5ds_8_tfstphdr_sel ,
                                          String AV90Webhdsto5ds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV84Webhdsto5ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV92Webhdsto5ds_9_tfstpclicod ,
                                          int AV93Webhdsto5ds_10_tfstpclicod_to ,
                                          String AV95Webhdsto5ds_12_tfstpclinom_sel ,
                                          String AV94Webhdsto5ds_11_tfstpclinom ,
                                          String AV97Webhdsto5ds_14_tfstpbarser_sel ,
                                          String AV96Webhdsto5ds_13_tfstpbarser ,
                                          String AV99Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                          String AV98Webhdsto5ds_15_tfstpbarserdsc ,
                                          String AV101Webhdsto5ds_18_tfstpcolor_sel ,
                                          String AV100Webhdsto5ds_17_tfstpcolor ,
                                          byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[40];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      scmdbuf += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      scmdbuf += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p FROM (((TXPHDSTO1 T1 INNER JOIN" ;
      scmdbuf += " TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr," ;
      scmdbuf += " T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP" ;
      scmdbuf += " T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr" ;
      scmdbuf += " = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.Stp_Lin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Stp_Mot) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90'), 2) || T2.Stp_p) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.CliCod, 0),'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.CliCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.StpCliNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.StpCliNom, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSer, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSer, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarSerDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarSerDsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.BarColNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.BarColNom, ' ') = ?))");
      addWhere(sWhereString, "(T1.Stp_Est = 1)");
      if ( ! (0==AV85Webhdsto5ds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV86Webhdsto5ds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Webhdsto5ds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webhdsto5ds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV88Webhdsto5ds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webhdsto5ds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Webhdsto5ds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV90Webhdsto5ds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Webhdsto5ds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Dia DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Lin" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Lin DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Stp_Mot DESC" ;
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
                  return conditional_P094Y3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094Y3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 11);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((byte[]) buf[20])[0] = rslt.getByte(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[75], false);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 11);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               return;
      }
   }

}

