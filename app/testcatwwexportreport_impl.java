package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class testcatwwexportreport_impl extends GXWebReport
{
   public testcatwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV53Title = httpContext.getMessage( "Lista de Estad.Cliente/Serie/T.Articulo", "") ;
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
         hALA0( true, 0) ;
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
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFEmprCod_Sel)==0) )
      {
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFEmprCod_Sel, "@!")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFEmprCod)==0) )
         {
            hALA0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFEmprCod, "@!")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV19TFCliCod) && (0==AV20TFCliCod_To) ) )
      {
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFCliCod), "ZZZZZ9")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV37TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFCliCod_To_Description, "")), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFCliCod_To), "ZZZZZ9")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFArtCod_Sel)==0) )
      {
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Código Artículo", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFArtCod_Sel, "")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFArtCod)==0) )
         {
            hALA0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Código Artículo", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFArtCod, "")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV23TFEstCatAny) && (0==AV24TFEstCatAny_To) ) )
      {
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "EstCatAny", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFEstCatAny), "ZZZ9")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV38TFEstCatAny_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "EstCatAny", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFEstCatAny_To_Description, "")), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFEstCatAny_To), "ZZZ9")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFEstCatSer_Sel)==0) )
      {
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N.Serie Fac (Est.Cl/art/t.art)", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFEstCatSer_Sel, "")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFEstCatSer)==0) )
         {
            hALA0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.Serie Fac (Est.Cl/art/t.art)", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFEstCatSer, "")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV27TFEstCatTip) && (0==AV28TFEstCatTip_To) ) )
      {
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo Articulo (E.Cl./Art./T.A)", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFEstCatTip), "ZZZ9")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV39TFEstCatTip_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tipo Articulo (E.Cl./Art./T.A)", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFEstCatTip_To_Description, "")), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFEstCatTip_To), "ZZZ9")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV30TFEstCatDsc_Sel)==0) )
      {
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Desc.T.Art (E.Cl./Art./T.A)", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFEstCatDsc_Sel, "")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFEstCatDsc)==0) )
         {
            hALA0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Desc.T.Art (E.Cl./Art./T.A)", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFEstCatDsc, "")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFEstCatAIm0)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFEstCatAIm0_To)==0) ) )
      {
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Acum.Imp0 (Est.Cl/Ar/T.Art)", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TFEstCatAIm0, "ZZZZZZZZ9.99")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFEstCatAIm0_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Acum.Imp0 (Est.Cl/Ar/T.Art)", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFEstCatAIm0_To_Description, "")), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TFEstCatAIm0_To, "ZZZZZZZZ9.99")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFEstCatAIm1)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFEstCatAIm1_To)==0) ) )
      {
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Acum.Imp.1 (Est.Cl/Ar/T.Art)", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TFEstCatAIm1, "ZZZZZZZZ9.99")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFEstCatAIm1_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Acum.Imp.1 (Est.Cl/Ar/T.Art)", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFEstCatAIm1_To_Description, "")), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TFEstCatAIm1_To, "ZZZZZZZZ9.99")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFEstCatOrd0)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFEstCatOrd0_To)==0) ) )
      {
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Orden (Est.Cli/Art/T.Art)", ""), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFEstCatOrd0, "ZZZZZZZZ9.99")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV42TFEstCatOrd0_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Orden (Est.Cli/Art/T.Art)", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hALA0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFEstCatOrd0_To_Description, "")), 25, Gx_line+0, 211, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TFEstCatOrd0_To, "ZZZZZZZZ9.99")), 211, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hALA0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hALA0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Empresa", ""), 30, Gx_line+10, 90, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 94, Gx_line+10, 154, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Código Artículo", ""), 158, Gx_line+10, 278, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "EstCatAny", ""), 282, Gx_line+10, 342, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N.Serie Fac (Est.Cl/art/t.art)", ""), 346, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo Articulo (E.Cl./Art./T.A)", ""), 410, Gx_line+10, 470, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Desc.T.Art (E.Cl./Art./T.A)", ""), 474, Gx_line+10, 594, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Acum.Imp0 (Est.Cl/Ar/T.Art)", ""), 598, Gx_line+10, 658, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Acum.Imp.1 (Est.Cl/Ar/T.Art)", ""), 662, Gx_line+10, 722, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden (Est.Cli/Art/T.Art)", ""), 726, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV61Testcatwwds_1_filterfulltext = AV12FilterFullText ;
      AV62Testcatwwds_2_tfemprcod = AV17TFEmprCod ;
      AV63Testcatwwds_3_tfemprcod_sel = AV18TFEmprCod_Sel ;
      AV64Testcatwwds_4_tfclicod = AV19TFCliCod ;
      AV65Testcatwwds_5_tfclicod_to = AV20TFCliCod_To ;
      AV66Testcatwwds_6_tfartcod = AV21TFArtCod ;
      AV67Testcatwwds_7_tfartcod_sel = AV22TFArtCod_Sel ;
      AV68Testcatwwds_8_tfestcatany = AV23TFEstCatAny ;
      AV69Testcatwwds_9_tfestcatany_to = AV24TFEstCatAny_To ;
      AV70Testcatwwds_10_tfestcatser = AV25TFEstCatSer ;
      AV71Testcatwwds_11_tfestcatser_sel = AV26TFEstCatSer_Sel ;
      AV72Testcatwwds_12_tfestcattip = AV27TFEstCatTip ;
      AV73Testcatwwds_13_tfestcattip_to = AV28TFEstCatTip_To ;
      AV74Testcatwwds_14_tfestcatdsc = AV29TFEstCatDsc ;
      AV75Testcatwwds_15_tfestcatdsc_sel = AV30TFEstCatDsc_Sel ;
      AV76Testcatwwds_16_tfestcataim0 = AV31TFEstCatAIm0 ;
      AV77Testcatwwds_17_tfestcataim0_to = AV32TFEstCatAIm0_To ;
      AV78Testcatwwds_18_tfestcataim1 = AV33TFEstCatAIm1 ;
      AV79Testcatwwds_19_tfestcataim1_to = AV34TFEstCatAIm1_To ;
      AV80Testcatwwds_20_tfestcatord0 = AV35TFEstCatOrd0 ;
      AV81Testcatwwds_21_tfestcatord0_to = AV36TFEstCatOrd0_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Testcatwwds_1_filterfulltext ,
                                           AV63Testcatwwds_3_tfemprcod_sel ,
                                           AV62Testcatwwds_2_tfemprcod ,
                                           Integer.valueOf(AV64Testcatwwds_4_tfclicod) ,
                                           Integer.valueOf(AV65Testcatwwds_5_tfclicod_to) ,
                                           AV67Testcatwwds_7_tfartcod_sel ,
                                           AV66Testcatwwds_6_tfartcod ,
                                           Short.valueOf(AV68Testcatwwds_8_tfestcatany) ,
                                           Short.valueOf(AV69Testcatwwds_9_tfestcatany_to) ,
                                           AV71Testcatwwds_11_tfestcatser_sel ,
                                           AV70Testcatwwds_10_tfestcatser ,
                                           Short.valueOf(AV72Testcatwwds_12_tfestcattip) ,
                                           Short.valueOf(AV73Testcatwwds_13_tfestcattip_to) ,
                                           AV75Testcatwwds_15_tfestcatdsc_sel ,
                                           AV74Testcatwwds_14_tfestcatdsc ,
                                           AV76Testcatwwds_16_tfestcataim0 ,
                                           AV77Testcatwwds_17_tfestcataim0_to ,
                                           AV78Testcatwwds_18_tfestcataim1 ,
                                           AV79Testcatwwds_19_tfestcataim1_to ,
                                           AV80Testcatwwds_20_tfestcatord0 ,
                                           AV81Testcatwwds_21_tfestcatord0_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           Short.valueOf(A5382EstCatAny) ,
                                           A5383EstCatSer ,
                                           Short.valueOf(A5384EstCatTip) ,
                                           A5385EstCatDsc ,
                                           A5386EstCatAIm0 ,
                                           A5387EstCatAIm1 ,
                                           A5388EstCatOrd0 ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV61Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Testcatwwds_1_filterfulltext), "%", "") ;
      lV61Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Testcatwwds_1_filterfulltext), "%", "") ;
      lV61Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Testcatwwds_1_filterfulltext), "%", "") ;
      lV61Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Testcatwwds_1_filterfulltext), "%", "") ;
      lV61Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Testcatwwds_1_filterfulltext), "%", "") ;
      lV61Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Testcatwwds_1_filterfulltext), "%", "") ;
      lV61Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Testcatwwds_1_filterfulltext), "%", "") ;
      lV61Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Testcatwwds_1_filterfulltext), "%", "") ;
      lV61Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Testcatwwds_1_filterfulltext), "%", "") ;
      lV61Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Testcatwwds_1_filterfulltext), "%", "") ;
      lV62Testcatwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV62Testcatwwds_2_tfemprcod), 3, "%") ;
      lV66Testcatwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV66Testcatwwds_6_tfartcod), 16, "%") ;
      lV70Testcatwwds_10_tfestcatser = GXutil.padr( GXutil.rtrim( AV70Testcatwwds_10_tfestcatser), 3, "%") ;
      lV74Testcatwwds_14_tfestcatdsc = GXutil.padr( GXutil.rtrim( AV74Testcatwwds_14_tfestcatdsc), 30, "%") ;
      /* Using cursor P0ALA3 */
      pr_default.execute(0, new Object[] {lV61Testcatwwds_1_filterfulltext, lV61Testcatwwds_1_filterfulltext, lV61Testcatwwds_1_filterfulltext, lV61Testcatwwds_1_filterfulltext, lV61Testcatwwds_1_filterfulltext, lV61Testcatwwds_1_filterfulltext, lV61Testcatwwds_1_filterfulltext, lV61Testcatwwds_1_filterfulltext, lV61Testcatwwds_1_filterfulltext, lV61Testcatwwds_1_filterfulltext, lV62Testcatwwds_2_tfemprcod, AV63Testcatwwds_3_tfemprcod_sel, Integer.valueOf(AV64Testcatwwds_4_tfclicod), Integer.valueOf(AV65Testcatwwds_5_tfclicod_to), lV66Testcatwwds_6_tfartcod, AV67Testcatwwds_7_tfartcod_sel, Short.valueOf(AV68Testcatwwds_8_tfestcatany), Short.valueOf(AV69Testcatwwds_9_tfestcatany_to), lV70Testcatwwds_10_tfestcatser, AV71Testcatwwds_11_tfestcatser_sel, Short.valueOf(AV72Testcatwwds_12_tfestcattip), Short.valueOf(AV73Testcatwwds_13_tfestcattip_to), lV74Testcatwwds_14_tfestcatdsc, AV75Testcatwwds_15_tfestcatdsc_sel, AV76Testcatwwds_16_tfestcataim0, AV77Testcatwwds_17_tfestcataim0_to, AV78Testcatwwds_18_tfestcataim1, AV79Testcatwwds_19_tfestcataim1_to, AV80Testcatwwds_20_tfestcatord0, AV81Testcatwwds_21_tfestcatord0_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5388EstCatOrd0 = P0ALA3_A5388EstCatOrd0[0] ;
         n5388EstCatOrd0 = P0ALA3_n5388EstCatOrd0[0] ;
         A5385EstCatDsc = P0ALA3_A5385EstCatDsc[0] ;
         n5385EstCatDsc = P0ALA3_n5385EstCatDsc[0] ;
         A5384EstCatTip = P0ALA3_A5384EstCatTip[0] ;
         A5383EstCatSer = P0ALA3_A5383EstCatSer[0] ;
         A5382EstCatAny = P0ALA3_A5382EstCatAny[0] ;
         A65ArtCod = P0ALA3_A65ArtCod[0] ;
         A252CliCod = P0ALA3_A252CliCod[0] ;
         A396EmprCod = P0ALA3_A396EmprCod[0] ;
         A5387EstCatAIm1 = P0ALA3_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0ALA3_A5386EstCatAIm0[0] ;
         A5387EstCatAIm1 = P0ALA3_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0ALA3_A5386EstCatAIm0[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         hALA0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), 30, Gx_line+10, 90, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 94, Gx_line+10, 154, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 158, Gx_line+10, 278, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5382EstCatAny), "ZZZ9")), 282, Gx_line+10, 342, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5383EstCatSer, "")), 346, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5384EstCatTip), "ZZZ9")), 410, Gx_line+10, 470, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5385EstCatDsc, "")), 474, Gx_line+10, 594, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5386EstCatAIm0, "ZZZZZZZZ9.99")), 598, Gx_line+10, 658, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5387EstCatAIm1, "ZZZZZZZZ9.99")), 662, Gx_line+10, 722, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5388EstCatOrd0, "ZZZZZZZZ9.99")), 726, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
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
      if ( GXutil.strcmp(AV13Session.getValue("TESTCATWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TESTCATWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("TESTCATWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
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
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV19TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV20TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV21TFArtCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV22TFArtCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATANY") == 0 )
         {
            AV23TFEstCatAny = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFEstCatAny_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATSER") == 0 )
         {
            AV25TFEstCatSer = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATSER_SEL") == 0 )
         {
            AV26TFEstCatSer_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATTIP") == 0 )
         {
            AV27TFEstCatTip = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV28TFEstCatTip_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATDSC") == 0 )
         {
            AV29TFEstCatDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATDSC_SEL") == 0 )
         {
            AV30TFEstCatDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATAIM0") == 0 )
         {
            AV31TFEstCatAIm0 = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV32TFEstCatAIm0_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATAIM1") == 0 )
         {
            AV33TFEstCatAIm1 = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV34TFEstCatAIm1_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATORD0") == 0 )
         {
            AV35TFEstCatOrd0 = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV36TFEstCatOrd0_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
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

   public void hALA0( boolean bFoot ,
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
            AV53Title = AV57Pgmdesc ;
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
      AV18TFEmprCod_Sel = "" ;
      AV17TFEmprCod = "" ;
      AV37TFCliCod_To_Description = "" ;
      AV22TFArtCod_Sel = "" ;
      AV21TFArtCod = "" ;
      AV38TFEstCatAny_To_Description = "" ;
      AV26TFEstCatSer_Sel = "" ;
      AV25TFEstCatSer = "" ;
      AV39TFEstCatTip_To_Description = "" ;
      AV30TFEstCatDsc_Sel = "" ;
      AV29TFEstCatDsc = "" ;
      AV31TFEstCatAIm0 = DecimalUtil.ZERO ;
      AV32TFEstCatAIm0_To = DecimalUtil.ZERO ;
      AV40TFEstCatAIm0_To_Description = "" ;
      AV33TFEstCatAIm1 = DecimalUtil.ZERO ;
      AV34TFEstCatAIm1_To = DecimalUtil.ZERO ;
      AV41TFEstCatAIm1_To_Description = "" ;
      AV35TFEstCatOrd0 = DecimalUtil.ZERO ;
      AV36TFEstCatOrd0_To = DecimalUtil.ZERO ;
      AV42TFEstCatOrd0_To_Description = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A5383EstCatSer = "" ;
      A5385EstCatDsc = "" ;
      A5386EstCatAIm0 = DecimalUtil.ZERO ;
      A5387EstCatAIm1 = DecimalUtil.ZERO ;
      A5388EstCatOrd0 = DecimalUtil.ZERO ;
      AV61Testcatwwds_1_filterfulltext = "" ;
      AV62Testcatwwds_2_tfemprcod = "" ;
      AV63Testcatwwds_3_tfemprcod_sel = "" ;
      AV66Testcatwwds_6_tfartcod = "" ;
      AV67Testcatwwds_7_tfartcod_sel = "" ;
      AV70Testcatwwds_10_tfestcatser = "" ;
      AV71Testcatwwds_11_tfestcatser_sel = "" ;
      AV74Testcatwwds_14_tfestcatdsc = "" ;
      AV75Testcatwwds_15_tfestcatdsc_sel = "" ;
      AV76Testcatwwds_16_tfestcataim0 = DecimalUtil.ZERO ;
      AV77Testcatwwds_17_tfestcataim0_to = DecimalUtil.ZERO ;
      AV78Testcatwwds_18_tfestcataim1 = DecimalUtil.ZERO ;
      AV79Testcatwwds_19_tfestcataim1_to = DecimalUtil.ZERO ;
      AV80Testcatwwds_20_tfestcatord0 = DecimalUtil.ZERO ;
      AV81Testcatwwds_21_tfestcatord0_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV61Testcatwwds_1_filterfulltext = "" ;
      lV62Testcatwwds_2_tfemprcod = "" ;
      lV66Testcatwwds_6_tfartcod = "" ;
      lV70Testcatwwds_10_tfestcatser = "" ;
      lV74Testcatwwds_14_tfestcatdsc = "" ;
      P0ALA3_A5388EstCatOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALA3_n5388EstCatOrd0 = new boolean[] {false} ;
      P0ALA3_A5385EstCatDsc = new String[] {""} ;
      P0ALA3_n5385EstCatDsc = new boolean[] {false} ;
      P0ALA3_A5384EstCatTip = new short[1] ;
      P0ALA3_A5383EstCatSer = new String[] {""} ;
      P0ALA3_A5382EstCatAny = new short[1] ;
      P0ALA3_A65ArtCod = new String[] {""} ;
      P0ALA3_A252CliCod = new int[1] ;
      P0ALA3_A396EmprCod = new String[] {""} ;
      P0ALA3_A5387EstCatAIm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALA3_A5386EstCatAIm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV51PageInfo = "" ;
      AV48DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV57Pgmdesc = "" ;
      AV46AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testcatwwexportreport__default(),
         new Object[] {
             new Object[] {
            P0ALA3_A5388EstCatOrd0, P0ALA3_n5388EstCatOrd0, P0ALA3_A5385EstCatDsc, P0ALA3_n5385EstCatDsc, P0ALA3_A5384EstCatTip, P0ALA3_A5383EstCatSer, P0ALA3_A5382EstCatAny, P0ALA3_A65ArtCod, P0ALA3_A252CliCod, P0ALA3_A396EmprCod,
            P0ALA3_A5387EstCatAIm1, P0ALA3_A5386EstCatAIm0
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV57Pgmdesc = httpContext.getMessage( "TESTCATWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV57Pgmdesc = httpContext.getMessage( "TESTCATWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV23TFEstCatAny ;
   private short AV24TFEstCatAny_To ;
   private short AV27TFEstCatTip ;
   private short AV28TFEstCatTip_To ;
   private short A5382EstCatAny ;
   private short A5384EstCatTip ;
   private short AV68Testcatwwds_8_tfestcatany ;
   private short AV69Testcatwwds_9_tfestcatany_to ;
   private short AV72Testcatwwds_12_tfestcattip ;
   private short AV73Testcatwwds_13_tfestcattip_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV19TFCliCod ;
   private int AV20TFCliCod_To ;
   private int A252CliCod ;
   private int AV64Testcatwwds_4_tfclicod ;
   private int AV65Testcatwwds_5_tfclicod_to ;
   private int AV82GXV1 ;
   private java.math.BigDecimal AV31TFEstCatAIm0 ;
   private java.math.BigDecimal AV32TFEstCatAIm0_To ;
   private java.math.BigDecimal AV33TFEstCatAIm1 ;
   private java.math.BigDecimal AV34TFEstCatAIm1_To ;
   private java.math.BigDecimal AV35TFEstCatOrd0 ;
   private java.math.BigDecimal AV36TFEstCatOrd0_To ;
   private java.math.BigDecimal A5386EstCatAIm0 ;
   private java.math.BigDecimal A5387EstCatAIm1 ;
   private java.math.BigDecimal A5388EstCatOrd0 ;
   private java.math.BigDecimal AV76Testcatwwds_16_tfestcataim0 ;
   private java.math.BigDecimal AV77Testcatwwds_17_tfestcataim0_to ;
   private java.math.BigDecimal AV78Testcatwwds_18_tfestcataim1 ;
   private java.math.BigDecimal AV79Testcatwwds_19_tfestcataim1_to ;
   private java.math.BigDecimal AV80Testcatwwds_20_tfestcatord0 ;
   private java.math.BigDecimal AV81Testcatwwds_21_tfestcatord0_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFEmprCod_Sel ;
   private String AV17TFEmprCod ;
   private String AV22TFArtCod_Sel ;
   private String AV21TFArtCod ;
   private String AV26TFEstCatSer_Sel ;
   private String AV25TFEstCatSer ;
   private String AV30TFEstCatDsc_Sel ;
   private String AV29TFEstCatDsc ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A5383EstCatSer ;
   private String A5385EstCatDsc ;
   private String AV62Testcatwwds_2_tfemprcod ;
   private String AV63Testcatwwds_3_tfemprcod_sel ;
   private String AV66Testcatwwds_6_tfartcod ;
   private String AV67Testcatwwds_7_tfartcod_sel ;
   private String AV70Testcatwwds_10_tfestcatser ;
   private String AV71Testcatwwds_11_tfestcatser_sel ;
   private String AV74Testcatwwds_14_tfestcatdsc ;
   private String AV75Testcatwwds_15_tfestcatdsc_sel ;
   private String scmdbuf ;
   private String lV62Testcatwwds_2_tfemprcod ;
   private String lV66Testcatwwds_6_tfartcod ;
   private String lV70Testcatwwds_10_tfestcatser ;
   private String lV74Testcatwwds_14_tfestcatdsc ;
   private String AV57Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n5388EstCatOrd0 ;
   private boolean n5385EstCatDsc ;
   private String AV53Title ;
   private String AV12FilterFullText ;
   private String AV37TFCliCod_To_Description ;
   private String AV38TFEstCatAny_To_Description ;
   private String AV39TFEstCatTip_To_Description ;
   private String AV40TFEstCatAIm0_To_Description ;
   private String AV41TFEstCatAIm1_To_Description ;
   private String AV42TFEstCatOrd0_To_Description ;
   private String AV61Testcatwwds_1_filterfulltext ;
   private String lV61Testcatwwds_1_filterfulltext ;
   private String AV51PageInfo ;
   private String AV48DateInfo ;
   private String AV46AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0ALA3_A5388EstCatOrd0 ;
   private boolean[] P0ALA3_n5388EstCatOrd0 ;
   private String[] P0ALA3_A5385EstCatDsc ;
   private boolean[] P0ALA3_n5385EstCatDsc ;
   private short[] P0ALA3_A5384EstCatTip ;
   private String[] P0ALA3_A5383EstCatSer ;
   private short[] P0ALA3_A5382EstCatAny ;
   private String[] P0ALA3_A65ArtCod ;
   private int[] P0ALA3_A252CliCod ;
   private String[] P0ALA3_A396EmprCod ;
   private java.math.BigDecimal[] P0ALA3_A5387EstCatAIm1 ;
   private java.math.BigDecimal[] P0ALA3_A5386EstCatAIm0 ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class testcatwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ALA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Testcatwwds_1_filterfulltext ,
                                          String AV63Testcatwwds_3_tfemprcod_sel ,
                                          String AV62Testcatwwds_2_tfemprcod ,
                                          int AV64Testcatwwds_4_tfclicod ,
                                          int AV65Testcatwwds_5_tfclicod_to ,
                                          String AV67Testcatwwds_7_tfartcod_sel ,
                                          String AV66Testcatwwds_6_tfartcod ,
                                          short AV68Testcatwwds_8_tfestcatany ,
                                          short AV69Testcatwwds_9_tfestcatany_to ,
                                          String AV71Testcatwwds_11_tfestcatser_sel ,
                                          String AV70Testcatwwds_10_tfestcatser ,
                                          short AV72Testcatwwds_12_tfestcattip ,
                                          short AV73Testcatwwds_13_tfestcattip_to ,
                                          String AV75Testcatwwds_15_tfestcatdsc_sel ,
                                          String AV74Testcatwwds_14_tfestcatdsc ,
                                          java.math.BigDecimal AV76Testcatwwds_16_tfestcataim0 ,
                                          java.math.BigDecimal AV77Testcatwwds_17_tfestcataim0_to ,
                                          java.math.BigDecimal AV78Testcatwwds_18_tfestcataim1 ,
                                          java.math.BigDecimal AV79Testcatwwds_19_tfestcataim1_to ,
                                          java.math.BigDecimal AV80Testcatwwds_20_tfestcatord0 ,
                                          java.math.BigDecimal AV81Testcatwwds_21_tfestcatord0_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          short A5382EstCatAny ,
                                          String A5383EstCatSer ,
                                          short A5384EstCatTip ,
                                          String A5385EstCatDsc ,
                                          java.math.BigDecimal A5386EstCatAIm0 ,
                                          java.math.BigDecimal A5387EstCatAIm1 ,
                                          java.math.BigDecimal A5388EstCatOrd0 ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EstCatOrd0, T1.EstCatDsc, T1.EstCatTip, T1.EstCatSer, T1.EstCatAny, T1.ArtCod, T1.CliCod, T1.EmprCod, COALESCE( T2.EstCatAIm1, 0) AS EstCatAIm1, COALESCE(" ;
      scmdbuf += " T2.EstCatAIm0, 0) AS EstCatAIm0 FROM (TXPESTCAT T1 LEFT JOIN (SELECT SUM(EstCatImp1) AS EstCatAIm1, EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, SUM(EstCatImp0)" ;
      scmdbuf += " AS EstCatAIm0 FROM TXPESTCA1 GROUP BY EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod" ;
      scmdbuf += " = T1.ArtCod AND T2.EstCatAny = T1.EstCatAny AND T2.EstCatSer = T1.EstCatSer AND T2.EstCatTip = T1.EstCatTip)" ;
      if ( ! (GXutil.strcmp("", AV61Testcatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatAny,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatSer) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatTip,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm0, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm1, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EstCatOrd0,'999999990.99'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV63Testcatwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Testcatwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Testcatwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Testcatwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Testcatwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Testcatwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Testcatwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Testcatwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV68Testcatwwds_8_tfestcatany) )
      {
         addWhere(sWhereString, "(T1.EstCatAny >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV69Testcatwwds_9_tfestcatany_to) )
      {
         addWhere(sWhereString, "(T1.EstCatAny <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Testcatwwds_11_tfestcatser_sel)==0) && ( ! (GXutil.strcmp("", AV70Testcatwwds_10_tfestcatser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Testcatwwds_11_tfestcatser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatSer = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Testcatwwds_12_tfestcattip) )
      {
         addWhere(sWhereString, "(T1.EstCatTip >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Testcatwwds_13_tfestcattip_to) )
      {
         addWhere(sWhereString, "(T1.EstCatTip <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Testcatwwds_15_tfestcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Testcatwwds_14_tfestcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Testcatwwds_15_tfestcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Testcatwwds_16_tfestcataim0)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Testcatwwds_17_tfestcataim0_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Testcatwwds_18_tfestcataim1)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Testcatwwds_19_tfestcataim1_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Testcatwwds_20_tfestcatord0)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Testcatwwds_21_tfestcatord0_to)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatDsc DESC" ;
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
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatAny" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatAny DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatSer" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatSer DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatTip" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatTip DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstCatOrd0" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCatOrd0 DESC" ;
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
                  return conditional_P0ALA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
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
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               return;
      }
   }

}

