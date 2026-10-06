package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mtoformulastinte_procesoswwexportreport_impl extends GXWebReport
{
   public mtoformulastinte_procesoswwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV51Title = httpContext.getMessage( "Lista de Mto Formulas Tinte (Procesos)", "") ;
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
         h95F0( true, 0) ;
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
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFEmprCod_Sel)==0) )
      {
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFEmprCod_Sel, "@!")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFEmprCod)==0) )
         {
            h95F0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFEmprCod, "@!")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFEmprNom_Sel)==0) )
      {
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFEmprNom_Sel, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFEmprNom)==0) )
         {
            h95F0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFEmprNom, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV21TFCliCod) && (0==AV22TFCliCod_To) ) )
      {
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFCliCod), "ZZZZZ9")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV37TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFCliCod_To_Description, "")), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFCliCod_To), "ZZZZZ9")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV24TFCliNom_Sel)==0) )
      {
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFCliNom_Sel, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV23TFCliNom)==0) )
         {
            h95F0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFCliNom, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV26TFForSer_Sel)==0) )
      {
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Articulo", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFForSer_Sel, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFForSer)==0) )
         {
            h95F0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Articulo", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFForSer, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV28TFForSerDsc_Sel)==0) )
      {
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFForSerDsc_Sel, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFForSerDsc)==0) )
         {
            h95F0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFForSerDsc, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV30TFForColNom_Sel)==0) )
      {
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFForColNom_Sel, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFForColNom)==0) )
         {
            h95F0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFForColNom, "")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV31TFForColNum) && (0==AV32TFForColNum_To) ) )
      {
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31TFForColNum), "ZZZZZ9")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV38TFForColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFForColNum_To_Description, "")), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TFForColNum_To), "ZZZZZ9")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV33TFTipColCod) && (0==AV34TFTipColCod_To) ) )
      {
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33TFTipColCod), "Z9")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV39TFTipColCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFTipColCod_To_Description, "")), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34TFTipColCod_To), "Z9")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV35TFForUltLin) && (0==AV36TFForUltLin_To) ) )
      {
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ultima linea", ""), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TFForUltLin), "ZZZ9")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFForUltLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Ultima linea", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h95F0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFForUltLin_To_Description, "")), 25, Gx_line+0, 127, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TFForUltLin_To), "ZZZ9")), 127, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h95F0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h95F0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 30, Gx_line+10, 81, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 85, Gx_line+10, 187, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 191, Gx_line+10, 242, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 246, Gx_line+10, 348, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Articulo", ""), 352, Gx_line+10, 455, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 459, Gx_line+10, 563, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 567, Gx_line+10, 619, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 623, Gx_line+10, 675, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 679, Gx_line+10, 731, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ultima linea", ""), 735, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = AV12FilterFullText ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = AV17TFEmprCod ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = AV18TFEmprCod_Sel ;
      AV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = AV19TFEmprNom ;
      AV63Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = AV20TFEmprNom_Sel ;
      AV64Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod = AV21TFCliCod ;
      AV65Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to = AV22TFCliCod_To ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = AV23TFCliNom ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = AV24TFCliNom_Sel ;
      AV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = AV25TFForSer ;
      AV69Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = AV26TFForSer_Sel ;
      AV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = AV27TFForSerDsc ;
      AV71Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = AV28TFForSerDsc_Sel ;
      AV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = AV29TFForColNom ;
      AV73Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = AV30TFForColNom_Sel ;
      AV74Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum = AV31TFForColNum ;
      AV75Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to = AV32TFForColNum_To ;
      AV76Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod = AV33TFTipColCod ;
      AV77Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to = AV34TFTipColCod_To ;
      AV78Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin = AV35TFForUltLin ;
      AV79Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to = AV36TFForUltLin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                           AV61Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                           AV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                           AV63Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                           AV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                           Integer.valueOf(AV64Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) ,
                                           Integer.valueOf(AV65Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) ,
                                           AV67Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                           AV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                           AV69Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                           AV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                           AV71Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                           AV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                           AV73Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                           AV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                           Integer.valueOf(AV74Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) ,
                                           Integer.valueOf(AV75Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV76Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV77Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) ,
                                           Short.valueOf(AV78Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) ,
                                           Short.valueOf(AV79Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Short.valueOf(A1159ForUltLin) ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod), 3, "%") ;
      lV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom), 30, "%") ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom), 30, "%") ;
      lV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser), 16, "%") ;
      lV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc), 26, "%") ;
      lV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom), 13, "%") ;
      /* Using cursor P095F2 */
      pr_default.execute(0, new Object[] {lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext, lV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod, AV61Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel, lV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom, AV63Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel, Integer.valueOf(AV64Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod), Integer.valueOf(AV65Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to), lV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom, AV67Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel, lV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser, AV69Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel, lV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc, AV71Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel, lV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom, AV73Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel, Integer.valueOf(AV74Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum), Integer.valueOf(AV75Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to), Byte.valueOf(AV76Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod), Byte.valueOf(AV77Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to), Short.valueOf(AV78Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin), Short.valueOf(AV79Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1159ForUltLin = P095F2_A1159ForUltLin[0] ;
         n1159ForUltLin = P095F2_n1159ForUltLin[0] ;
         A831TipColCod = P095F2_A831TipColCod[0] ;
         A483ForColNum = P095F2_A483ForColNum[0] ;
         A482ForColNom = P095F2_A482ForColNom[0] ;
         A5742ForSerDsc = P095F2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095F2_n5742ForSerDsc[0] ;
         A494ForSer = P095F2_A494ForSer[0] ;
         A279CliNom = P095F2_A279CliNom[0] ;
         A252CliCod = P095F2_A252CliCod[0] ;
         A407EmprNom = P095F2_A407EmprNom[0] ;
         n407EmprNom = P095F2_n407EmprNom[0] ;
         A396EmprCod = P095F2_A396EmprCod[0] ;
         A407EmprNom = P095F2_A407EmprNom[0] ;
         n407EmprNom = P095F2_n407EmprNom[0] ;
         A279CliNom = P095F2_A279CliNom[0] ;
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
         h95F0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 30, Gx_line+10, 81, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 85, Gx_line+10, 187, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 191, Gx_line+10, 242, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 246, Gx_line+10, 348, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 352, Gx_line+10, 455, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), 459, Gx_line+10, 563, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 567, Gx_line+10, 619, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 623, Gx_line+10, 675, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 679, Gx_line+10, 731, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1159ForUltLin), "ZZZ9")), 735, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV13Session.getValue("FormulacionTinte.MtoFormulasTinte_ProcesosWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.MtoFormulasTinte_ProcesosWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("FormulacionTinte.MtoFormulasTinte_ProcesosWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV17TFEmprCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV18TFEmprCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV19TFEmprNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV20TFEmprNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV21TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV22TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV23TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV24TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV25TFForSer = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV26TFForSer_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV27TFForSerDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV28TFForSerDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV29TFForColNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV30TFForColNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV31TFForColNum = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV32TFForColNum_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV33TFTipColCod = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFTipColCod_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTLIN") == 0 )
         {
            AV35TFForUltLin = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFForUltLin_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
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

   public void h95F0( boolean bFoot ,
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
               AV49PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV46DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV51Title = AV55Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV51Title = "" ;
      AV12FilterFullText = "" ;
      AV18TFEmprCod_Sel = "" ;
      AV17TFEmprCod = "" ;
      AV20TFEmprNom_Sel = "" ;
      AV19TFEmprNom = "" ;
      AV37TFCliCod_To_Description = "" ;
      AV24TFCliNom_Sel = "" ;
      AV23TFCliNom = "" ;
      AV26TFForSer_Sel = "" ;
      AV25TFForSer = "" ;
      AV28TFForSerDsc_Sel = "" ;
      AV27TFForSerDsc = "" ;
      AV30TFForColNom_Sel = "" ;
      AV29TFForColNom = "" ;
      AV38TFForColNum_To_Description = "" ;
      AV39TFTipColCod_To_Description = "" ;
      AV40TFForUltLin_To_Description = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = "" ;
      AV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = "" ;
      AV61Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel = "" ;
      AV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = "" ;
      AV63Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel = "" ;
      AV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = "" ;
      AV67Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel = "" ;
      AV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = "" ;
      AV69Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel = "" ;
      AV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = "" ;
      AV71Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel = "" ;
      AV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = "" ;
      AV73Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel = "" ;
      scmdbuf = "" ;
      lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext = "" ;
      lV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod = "" ;
      lV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom = "" ;
      lV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom = "" ;
      lV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser = "" ;
      lV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc = "" ;
      lV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom = "" ;
      P095F2_A1159ForUltLin = new short[1] ;
      P095F2_n1159ForUltLin = new boolean[] {false} ;
      P095F2_A831TipColCod = new byte[1] ;
      P095F2_A483ForColNum = new int[1] ;
      P095F2_A482ForColNom = new String[] {""} ;
      P095F2_A5742ForSerDsc = new String[] {""} ;
      P095F2_n5742ForSerDsc = new boolean[] {false} ;
      P095F2_A494ForSer = new String[] {""} ;
      P095F2_A279CliNom = new String[] {""} ;
      P095F2_A252CliCod = new int[1] ;
      P095F2_A407EmprNom = new String[] {""} ;
      P095F2_n407EmprNom = new boolean[] {false} ;
      P095F2_A396EmprCod = new String[] {""} ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49PageInfo = "" ;
      AV46DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV55Pgmdesc = "" ;
      AV44AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastinte_procesoswwexportreport__default(),
         new Object[] {
             new Object[] {
            P095F2_A1159ForUltLin, P095F2_n1159ForUltLin, P095F2_A831TipColCod, P095F2_A483ForColNum, P095F2_A482ForColNom, P095F2_A5742ForSerDsc, P095F2_n5742ForSerDsc, P095F2_A494ForSer, P095F2_A279CliNom, P095F2_A252CliCod,
            P095F2_A407EmprNom, P095F2_n407EmprNom, P095F2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV55Pgmdesc = httpContext.getMessage( "Mto Formulas Tinte_Procesos WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV55Pgmdesc = httpContext.getMessage( "Mto Formulas Tinte_Procesos WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV33TFTipColCod ;
   private byte AV34TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV76Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ;
   private byte AV77Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ;
   private short gxcookieaux ;
   private short AV35TFForUltLin ;
   private short AV36TFForUltLin_To ;
   private short A1159ForUltLin ;
   private short AV78Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ;
   private short AV79Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV21TFCliCod ;
   private int AV22TFCliCod_To ;
   private int AV31TFForColNum ;
   private int AV32TFForColNum_To ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV64Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ;
   private int AV65Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ;
   private int AV74Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ;
   private int AV75Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ;
   private int AV80GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFEmprCod_Sel ;
   private String AV17TFEmprCod ;
   private String AV20TFEmprNom_Sel ;
   private String AV19TFEmprNom ;
   private String AV24TFCliNom_Sel ;
   private String AV23TFCliNom ;
   private String AV26TFForSer_Sel ;
   private String AV25TFForSer ;
   private String AV28TFForSerDsc_Sel ;
   private String AV27TFForSerDsc ;
   private String AV30TFForColNom_Sel ;
   private String AV29TFForColNom ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String AV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ;
   private String AV61Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ;
   private String AV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ;
   private String AV63Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ;
   private String AV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ;
   private String AV67Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ;
   private String AV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ;
   private String AV69Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ;
   private String AV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ;
   private String AV71Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ;
   private String AV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ;
   private String AV73Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ;
   private String scmdbuf ;
   private String lV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ;
   private String lV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ;
   private String lV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ;
   private String lV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ;
   private String lV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ;
   private String lV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ;
   private String AV55Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n1159ForUltLin ;
   private boolean n5742ForSerDsc ;
   private boolean n407EmprNom ;
   private String AV51Title ;
   private String AV12FilterFullText ;
   private String AV37TFCliCod_To_Description ;
   private String AV38TFForColNum_To_Description ;
   private String AV39TFTipColCod_To_Description ;
   private String AV40TFForUltLin_To_Description ;
   private String AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ;
   private String lV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ;
   private String AV49PageInfo ;
   private String AV46DateInfo ;
   private String AV44AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private short[] P095F2_A1159ForUltLin ;
   private boolean[] P095F2_n1159ForUltLin ;
   private byte[] P095F2_A831TipColCod ;
   private int[] P095F2_A483ForColNum ;
   private String[] P095F2_A482ForColNom ;
   private String[] P095F2_A5742ForSerDsc ;
   private boolean[] P095F2_n5742ForSerDsc ;
   private String[] P095F2_A494ForSer ;
   private String[] P095F2_A279CliNom ;
   private int[] P095F2_A252CliCod ;
   private String[] P095F2_A407EmprNom ;
   private boolean[] P095F2_n407EmprNom ;
   private String[] P095F2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class mtoformulastinte_procesoswwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext ,
                                          String AV61Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel ,
                                          String AV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod ,
                                          String AV63Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel ,
                                          String AV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom ,
                                          int AV64Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod ,
                                          int AV65Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to ,
                                          String AV67Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel ,
                                          String AV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom ,
                                          String AV69Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel ,
                                          String AV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser ,
                                          String AV71Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel ,
                                          String AV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc ,
                                          String AV73Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel ,
                                          String AV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom ,
                                          int AV74Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum ,
                                          int AV75Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to ,
                                          byte AV76Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod ,
                                          byte AV77Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to ,
                                          short AV78Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin ,
                                          short AV79Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          short A1159ForUltLin ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ForUltLin, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod, T2.EmprNom, T1.EmprCod FROM ((TXPCFORMU T1 INNER JOIN" ;
      scmdbuf += " TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_mtoformulastinte_procesoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForUltLin,'9990'), 2) like '%' || ?))");
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
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_mtoformulastinte_procesoswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_mtoformulastinte_procesoswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_mtoformulastinte_procesoswwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_mtoformulastinte_procesoswwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_mtoformulastinte_procesoswwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_mtoformulastinte_procesoswwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_mtoformulastinte_procesoswwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_mtoformulastinte_procesoswwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_mtoformulastinte_procesoswwds_10_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_mtoformulastinte_procesoswwds_11_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_mtoformulastinte_procesoswwds_12_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_mtoformulastinte_procesoswwds_13_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_mtoformulastinte_procesoswwds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_mtoformulastinte_procesoswwds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_mtoformulastinte_procesoswwds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_mtoformulastinte_procesoswwds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_mtoformulastinte_procesoswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_mtoformulastinte_procesoswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_mtoformulastinte_procesoswwds_20_tfforultlin) )
      {
         addWhere(sWhereString, "(T1.ForUltLin >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_mtoformulastinte_procesoswwds_21_tfforultlin_to) )
      {
         addWhere(sWhereString, "(T1.ForUltLin <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.EmprNom" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.EmprNom DESC" ;
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
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
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
         scmdbuf += " ORDER BY T1.ForUltLin" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltLin DESC" ;
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
                  return conditional_P095F2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               return;
      }
   }

}

