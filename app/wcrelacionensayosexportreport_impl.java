package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcrelacionensayosexportreport_impl extends GXWebReport
{
   public wcrelacionensayosexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV47Title = httpContext.getMessage( "Lista de ENTRADA DE ENSAYOS", "") ;
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
         h8HQ0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV56FilterFullText)==0) )
      {
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56FilterFullText, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV16TFLb_numero) && (0==AV17TFLb_numero_To) ) )
      {
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Ensayo", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16TFLb_numero), "ZZZZZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV34TFLb_numero_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Ensayo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFLb_numero_To_Description, "")), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFLb_numero_To), "ZZZZZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV18TFCliCod) && (0==AV19TFCliCod_To) ) )
      {
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFCliCod), "ZZZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFCliCod_To_Description, "")), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFCliCod_To), "ZZZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliNom_Sel)==0) )
      {
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFCliNom_Sel, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFCliNom)==0) )
         {
            h8HQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFCliNom, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV23TFLb_ArtCod_Sel)==0) )
      {
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFLb_ArtCod_Sel, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFLb_ArtCod)==0) )
         {
            h8HQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFLb_ArtCod, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV25TFLb_ArtDsc_Sel)==0) )
      {
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFLb_ArtDsc_Sel, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFLb_ArtDsc)==0) )
         {
            h8HQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFLb_ArtDsc, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFLb_ColNom_Sel)==0) )
      {
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFLb_ColNom_Sel, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFLb_ColNom)==0) )
         {
            h8HQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFLb_ColNom, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV28TFLb_ColNum) && (0==AV29TFLb_ColNum_To) ) )
      {
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFLb_ColNum), "ZZZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFLb_ColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFLb_ColNum_To_Description, "")), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TFLb_ColNum_To), "ZZZZZ9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV30TFTipColCod) && (0==AV31TFTipColCod_To) ) )
      {
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFTipColCod), "Z9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV37TFTipColCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tc", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFTipColCod_To_Description, "")), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TFTipColCod_To), "Z9")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFTipColDsc_Sel)==0) )
      {
         h8HQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFTipColDsc_Sel, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFTipColDsc)==0) )
         {
            h8HQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 123, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFTipColDsc, "")), 123, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8HQ0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8HQ0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Ensayo", ""), 30, Gx_line+10, 85, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 89, Gx_line+10, 144, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 148, Gx_line+10, 259, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 263, Gx_line+10, 375, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 379, Gx_line+10, 491, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 495, Gx_line+10, 551, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 555, Gx_line+10, 611, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 615, Gx_line+10, 671, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 675, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV68Wcrelacionensayosds_1_filterfulltext = AV56FilterFullText ;
      AV69Wcrelacionensayosds_2_tflb_numero = AV16TFLb_numero ;
      AV70Wcrelacionensayosds_3_tflb_numero_to = AV17TFLb_numero_To ;
      AV71Wcrelacionensayosds_4_tfclicod = AV18TFCliCod ;
      AV72Wcrelacionensayosds_5_tfclicod_to = AV19TFCliCod_To ;
      AV73Wcrelacionensayosds_6_tfclinom = AV20TFCliNom ;
      AV74Wcrelacionensayosds_7_tfclinom_sel = AV21TFCliNom_Sel ;
      AV75Wcrelacionensayosds_8_tflb_artcod = AV22TFLb_ArtCod ;
      AV76Wcrelacionensayosds_9_tflb_artcod_sel = AV23TFLb_ArtCod_Sel ;
      AV77Wcrelacionensayosds_10_tflb_artdsc = AV24TFLb_ArtDsc ;
      AV78Wcrelacionensayosds_11_tflb_artdsc_sel = AV25TFLb_ArtDsc_Sel ;
      AV79Wcrelacionensayosds_12_tflb_colnom = AV26TFLb_ColNom ;
      AV80Wcrelacionensayosds_13_tflb_colnom_sel = AV27TFLb_ColNom_Sel ;
      AV81Wcrelacionensayosds_14_tflb_colnum = AV28TFLb_ColNum ;
      AV82Wcrelacionensayosds_15_tflb_colnum_to = AV29TFLb_ColNum_To ;
      AV83Wcrelacionensayosds_16_tftipcolcod = AV30TFTipColCod ;
      AV84Wcrelacionensayosds_17_tftipcolcod_to = AV31TFTipColCod_To ;
      AV85Wcrelacionensayosds_18_tftipcoldsc = AV32TFTipColDsc ;
      AV86Wcrelacionensayosds_19_tftipcoldsc_sel = AV33TFTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV68Wcrelacionensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV69Wcrelacionensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV70Wcrelacionensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV71Wcrelacionensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV72Wcrelacionensayosds_5_tfclicod_to) ,
                                           AV74Wcrelacionensayosds_7_tfclinom_sel ,
                                           AV73Wcrelacionensayosds_6_tfclinom ,
                                           AV76Wcrelacionensayosds_9_tflb_artcod_sel ,
                                           AV75Wcrelacionensayosds_8_tflb_artcod ,
                                           AV78Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                           AV77Wcrelacionensayosds_10_tflb_artdsc ,
                                           AV80Wcrelacionensayosds_13_tflb_colnom_sel ,
                                           AV79Wcrelacionensayosds_12_tflb_colnom ,
                                           Integer.valueOf(AV81Wcrelacionensayosds_14_tflb_colnum) ,
                                           Integer.valueOf(AV82Wcrelacionensayosds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV83Wcrelacionensayosds_16_tftipcolcod) ,
                                           Byte.valueOf(AV84Wcrelacionensayosds_17_tftipcolcod_to) ,
                                           AV86Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                           AV85Wcrelacionensayosds_18_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV53Emprcod ,
                                           AV54MacProCod ,
                                           A396EmprCod ,
                                           A1514MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV68Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV68Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV68Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV68Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV68Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV68Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV68Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV68Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV68Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV73Wcrelacionensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV73Wcrelacionensayosds_6_tfclinom), 30, "%") ;
      lV75Wcrelacionensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV75Wcrelacionensayosds_8_tflb_artcod), 16, "%") ;
      lV77Wcrelacionensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV77Wcrelacionensayosds_10_tflb_artdsc), 26, "%") ;
      lV79Wcrelacionensayosds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV79Wcrelacionensayosds_12_tflb_colnom), 13, "%") ;
      lV85Wcrelacionensayosds_18_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV85Wcrelacionensayosds_18_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HQ2 */
      pr_default.execute(0, new Object[] {AV53Emprcod, AV54MacProCod, lV68Wcrelacionensayosds_1_filterfulltext, lV68Wcrelacionensayosds_1_filterfulltext, lV68Wcrelacionensayosds_1_filterfulltext, lV68Wcrelacionensayosds_1_filterfulltext, lV68Wcrelacionensayosds_1_filterfulltext, lV68Wcrelacionensayosds_1_filterfulltext, lV68Wcrelacionensayosds_1_filterfulltext, lV68Wcrelacionensayosds_1_filterfulltext, lV68Wcrelacionensayosds_1_filterfulltext, Integer.valueOf(AV69Wcrelacionensayosds_2_tflb_numero), Integer.valueOf(AV70Wcrelacionensayosds_3_tflb_numero_to), Integer.valueOf(AV71Wcrelacionensayosds_4_tfclicod), Integer.valueOf(AV72Wcrelacionensayosds_5_tfclicod_to), lV73Wcrelacionensayosds_6_tfclinom, AV74Wcrelacionensayosds_7_tfclinom_sel, lV75Wcrelacionensayosds_8_tflb_artcod, AV76Wcrelacionensayosds_9_tflb_artcod_sel, lV77Wcrelacionensayosds_10_tflb_artdsc, AV78Wcrelacionensayosds_11_tflb_artdsc_sel, lV79Wcrelacionensayosds_12_tflb_colnom, AV80Wcrelacionensayosds_13_tflb_colnom_sel, Integer.valueOf(AV81Wcrelacionensayosds_14_tflb_colnum), Integer.valueOf(AV82Wcrelacionensayosds_15_tflb_colnum_to), Byte.valueOf(AV83Wcrelacionensayosds_16_tftipcolcod), Byte.valueOf(AV84Wcrelacionensayosds_17_tftipcolcod_to), lV85Wcrelacionensayosds_18_tftipcoldsc, AV86Wcrelacionensayosds_19_tftipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1514MacProCod = P08HQ2_A1514MacProCod[0] ;
         n1514MacProCod = P08HQ2_n1514MacProCod[0] ;
         A396EmprCod = P08HQ2_A396EmprCod[0] ;
         A832TipColDsc = P08HQ2_A832TipColDsc[0] ;
         n832TipColDsc = P08HQ2_n832TipColDsc[0] ;
         A831TipColCod = P08HQ2_A831TipColCod[0] ;
         n831TipColCod = P08HQ2_n831TipColCod[0] ;
         A5537Lb_ColNum = P08HQ2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P08HQ2_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P08HQ2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P08HQ2_A5533Lb_ArtCod[0] ;
         A279CliNom = P08HQ2_A279CliNom[0] ;
         A252CliCod = P08HQ2_A252CliCod[0] ;
         A5532Lb_numero = P08HQ2_A5532Lb_numero[0] ;
         A832TipColDsc = P08HQ2_A832TipColDsc[0] ;
         n832TipColDsc = P08HQ2_n832TipColDsc[0] ;
         A279CliNom = P08HQ2_A279CliNom[0] ;
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
         h8HQ0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 30, Gx_line+10, 85, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 89, Gx_line+10, 144, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 148, Gx_line+10, 259, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 263, Gx_line+10, 375, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), 379, Gx_line+10, 491, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 495, Gx_line+10, 551, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 555, Gx_line+10, 611, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 615, Gx_line+10, 671, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 675, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV12Session.getValue("WCRelacionEnsayosGridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRelacionEnsayosGridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV12Session.getValue("WCRelacionEnsayosGridState"), null, null);
      }
      AV10OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV87GXV1 = 1 ;
      while ( AV87GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV56FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV16TFLb_numero = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFLb_numero_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV18TFCliCod = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCliCod_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV20TFCliNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV21TFCliNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV22TFLb_ArtCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV23TFLb_ArtCod_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV24TFLb_ArtDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV25TFLb_ArtDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV26TFLb_ColNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV27TFLb_ColNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV28TFLb_ColNum = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFLb_ColNum_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV30TFTipColCod = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFTipColCod_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV32TFTipColDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV33TFTipColDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV53Emprcod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MACPROCOD") == 0 )
         {
            AV54MacProCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MACPRODSC") == 0 )
         {
            AV55MacProDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV87GXV1 = (int)(AV87GXV1+1) ;
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

   public void h8HQ0( boolean bFoot ,
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
               AV44PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV40DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV47Title = AV64Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV47Title = "" ;
      AV56FilterFullText = "" ;
      AV34TFLb_numero_To_Description = "" ;
      AV35TFCliCod_To_Description = "" ;
      AV21TFCliNom_Sel = "" ;
      AV20TFCliNom = "" ;
      AV23TFLb_ArtCod_Sel = "" ;
      AV22TFLb_ArtCod = "" ;
      AV25TFLb_ArtDsc_Sel = "" ;
      AV24TFLb_ArtDsc = "" ;
      AV27TFLb_ColNom_Sel = "" ;
      AV26TFLb_ColNom = "" ;
      AV36TFLb_ColNum_To_Description = "" ;
      AV37TFTipColCod_To_Description = "" ;
      AV33TFTipColDsc_Sel = "" ;
      AV32TFTipColDsc = "" ;
      A279CliNom = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5536Lb_ColNom = "" ;
      A832TipColDsc = "" ;
      AV68Wcrelacionensayosds_1_filterfulltext = "" ;
      AV73Wcrelacionensayosds_6_tfclinom = "" ;
      AV74Wcrelacionensayosds_7_tfclinom_sel = "" ;
      AV75Wcrelacionensayosds_8_tflb_artcod = "" ;
      AV76Wcrelacionensayosds_9_tflb_artcod_sel = "" ;
      AV77Wcrelacionensayosds_10_tflb_artdsc = "" ;
      AV78Wcrelacionensayosds_11_tflb_artdsc_sel = "" ;
      AV79Wcrelacionensayosds_12_tflb_colnom = "" ;
      AV80Wcrelacionensayosds_13_tflb_colnom_sel = "" ;
      AV85Wcrelacionensayosds_18_tftipcoldsc = "" ;
      AV86Wcrelacionensayosds_19_tftipcoldsc_sel = "" ;
      scmdbuf = "" ;
      lV68Wcrelacionensayosds_1_filterfulltext = "" ;
      lV73Wcrelacionensayosds_6_tfclinom = "" ;
      lV75Wcrelacionensayosds_8_tflb_artcod = "" ;
      lV77Wcrelacionensayosds_10_tflb_artdsc = "" ;
      lV79Wcrelacionensayosds_12_tflb_colnom = "" ;
      lV85Wcrelacionensayosds_18_tftipcoldsc = "" ;
      AV53Emprcod = "" ;
      AV54MacProCod = "" ;
      A396EmprCod = "" ;
      A1514MacProCod = "" ;
      P08HQ2_A1514MacProCod = new String[] {""} ;
      P08HQ2_n1514MacProCod = new boolean[] {false} ;
      P08HQ2_A396EmprCod = new String[] {""} ;
      P08HQ2_A832TipColDsc = new String[] {""} ;
      P08HQ2_n832TipColDsc = new boolean[] {false} ;
      P08HQ2_A831TipColCod = new byte[1] ;
      P08HQ2_n831TipColCod = new boolean[] {false} ;
      P08HQ2_A5537Lb_ColNum = new int[1] ;
      P08HQ2_A5536Lb_ColNom = new String[] {""} ;
      P08HQ2_A5534Lb_ArtDsc = new String[] {""} ;
      P08HQ2_A5533Lb_ArtCod = new String[] {""} ;
      P08HQ2_A279CliNom = new String[] {""} ;
      P08HQ2_A252CliCod = new int[1] ;
      P08HQ2_A5532Lb_numero = new int[1] ;
      AV12Session = httpContext.getWebSession();
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV55MacProDsc = "" ;
      AV44PageInfo = "" ;
      AV40DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV64Pgmdesc = "" ;
      AV58AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrelacionensayosexportreport__default(),
         new Object[] {
             new Object[] {
            P08HQ2_A1514MacProCod, P08HQ2_n1514MacProCod, P08HQ2_A396EmprCod, P08HQ2_A832TipColDsc, P08HQ2_n832TipColDsc, P08HQ2_A831TipColCod, P08HQ2_n831TipColCod, P08HQ2_A5537Lb_ColNum, P08HQ2_A5536Lb_ColNom, P08HQ2_A5534Lb_ArtDsc,
            P08HQ2_A5533Lb_ArtCod, P08HQ2_A279CliNom, P08HQ2_A252CliCod, P08HQ2_A5532Lb_numero
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV64Pgmdesc = httpContext.getMessage( "WCRelacion Ensayos Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV64Pgmdesc = httpContext.getMessage( "WCRelacion Ensayos Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV30TFTipColCod ;
   private byte AV31TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV83Wcrelacionensayosds_16_tftipcolcod ;
   private byte AV84Wcrelacionensayosds_17_tftipcolcod_to ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV16TFLb_numero ;
   private int AV17TFLb_numero_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV28TFLb_ColNum ;
   private int AV29TFLb_ColNum_To ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV69Wcrelacionensayosds_2_tflb_numero ;
   private int AV70Wcrelacionensayosds_3_tflb_numero_to ;
   private int AV71Wcrelacionensayosds_4_tfclicod ;
   private int AV72Wcrelacionensayosds_5_tfclicod_to ;
   private int AV81Wcrelacionensayosds_14_tflb_colnum ;
   private int AV82Wcrelacionensayosds_15_tflb_colnum_to ;
   private int AV87GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFCliNom_Sel ;
   private String AV20TFCliNom ;
   private String AV23TFLb_ArtCod_Sel ;
   private String AV22TFLb_ArtCod ;
   private String AV25TFLb_ArtDsc_Sel ;
   private String AV24TFLb_ArtDsc ;
   private String AV27TFLb_ColNom_Sel ;
   private String AV26TFLb_ColNom ;
   private String AV33TFTipColDsc_Sel ;
   private String AV32TFTipColDsc ;
   private String A279CliNom ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5536Lb_ColNom ;
   private String A832TipColDsc ;
   private String AV73Wcrelacionensayosds_6_tfclinom ;
   private String AV74Wcrelacionensayosds_7_tfclinom_sel ;
   private String AV75Wcrelacionensayosds_8_tflb_artcod ;
   private String AV76Wcrelacionensayosds_9_tflb_artcod_sel ;
   private String AV77Wcrelacionensayosds_10_tflb_artdsc ;
   private String AV78Wcrelacionensayosds_11_tflb_artdsc_sel ;
   private String AV79Wcrelacionensayosds_12_tflb_colnom ;
   private String AV80Wcrelacionensayosds_13_tflb_colnom_sel ;
   private String AV85Wcrelacionensayosds_18_tftipcoldsc ;
   private String AV86Wcrelacionensayosds_19_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV73Wcrelacionensayosds_6_tfclinom ;
   private String lV75Wcrelacionensayosds_8_tflb_artcod ;
   private String lV77Wcrelacionensayosds_10_tflb_artdsc ;
   private String lV79Wcrelacionensayosds_12_tflb_colnom ;
   private String lV85Wcrelacionensayosds_18_tftipcoldsc ;
   private String AV53Emprcod ;
   private String AV54MacProCod ;
   private String A396EmprCod ;
   private String A1514MacProCod ;
   private String AV55MacProDsc ;
   private String AV64Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n1514MacProCod ;
   private boolean n832TipColDsc ;
   private boolean n831TipColCod ;
   private String AV47Title ;
   private String AV56FilterFullText ;
   private String AV34TFLb_numero_To_Description ;
   private String AV35TFCliCod_To_Description ;
   private String AV36TFLb_ColNum_To_Description ;
   private String AV37TFTipColCod_To_Description ;
   private String AV68Wcrelacionensayosds_1_filterfulltext ;
   private String lV68Wcrelacionensayosds_1_filterfulltext ;
   private String AV44PageInfo ;
   private String AV40DateInfo ;
   private String AV58AppName ;
   private com.genexus.webpanels.WebSession AV12Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08HQ2_A1514MacProCod ;
   private boolean[] P08HQ2_n1514MacProCod ;
   private String[] P08HQ2_A396EmprCod ;
   private String[] P08HQ2_A832TipColDsc ;
   private boolean[] P08HQ2_n832TipColDsc ;
   private byte[] P08HQ2_A831TipColCod ;
   private boolean[] P08HQ2_n831TipColCod ;
   private int[] P08HQ2_A5537Lb_ColNum ;
   private String[] P08HQ2_A5536Lb_ColNom ;
   private String[] P08HQ2_A5534Lb_ArtDsc ;
   private String[] P08HQ2_A5533Lb_ArtCod ;
   private String[] P08HQ2_A279CliNom ;
   private int[] P08HQ2_A252CliCod ;
   private int[] P08HQ2_A5532Lb_numero ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
}

final  class wcrelacionensayosexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08HQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Wcrelacionensayosds_1_filterfulltext ,
                                          int AV69Wcrelacionensayosds_2_tflb_numero ,
                                          int AV70Wcrelacionensayosds_3_tflb_numero_to ,
                                          int AV71Wcrelacionensayosds_4_tfclicod ,
                                          int AV72Wcrelacionensayosds_5_tfclicod_to ,
                                          String AV74Wcrelacionensayosds_7_tfclinom_sel ,
                                          String AV73Wcrelacionensayosds_6_tfclinom ,
                                          String AV76Wcrelacionensayosds_9_tflb_artcod_sel ,
                                          String AV75Wcrelacionensayosds_8_tflb_artcod ,
                                          String AV78Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                          String AV77Wcrelacionensayosds_10_tflb_artdsc ,
                                          String AV80Wcrelacionensayosds_13_tflb_colnom_sel ,
                                          String AV79Wcrelacionensayosds_12_tflb_colnom ,
                                          int AV81Wcrelacionensayosds_14_tflb_colnum ,
                                          int AV82Wcrelacionensayosds_15_tflb_colnum_to ,
                                          byte AV83Wcrelacionensayosds_16_tftipcolcod ,
                                          byte AV84Wcrelacionensayosds_17_tftipcolcod_to ,
                                          String AV86Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                          String AV85Wcrelacionensayosds_18_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV53Emprcod ,
                                          String AV54MacProCod ,
                                          String A396EmprCod ,
                                          String A1514MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MacProCod, T1.EmprCod, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T3.CliNom, T1.CliCod, T1.Lb_numero FROM ((TXPENS001" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV68Wcrelacionensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV69Wcrelacionensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcrelacionensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcrelacionensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV72Wcrelacionensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Wcrelacionensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Wcrelacionensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Wcrelacionensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Wcrelacionensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV75Wcrelacionensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Wcrelacionensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Wcrelacionensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Wcrelacionensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Wcrelacionensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Wcrelacionensayosds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Wcrelacionensayosds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Wcrelacionensayosds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Wcrelacionensayosds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcrelacionensayosds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcrelacionensayosds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Wcrelacionensayosds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Wcrelacionensayosds_19_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV85Wcrelacionensayosds_18_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Wcrelacionensayosds_19_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
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
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
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
         scmdbuf += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipColDsc DESC" ;
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
                  return conditional_P08HQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Boolean) dynConstraints[29]).booleanValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08HQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((String[]) buf[9])[0] = rslt.getString(7, 26);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               return;
      }
   }

}

