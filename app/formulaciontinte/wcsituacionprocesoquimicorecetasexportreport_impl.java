package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcsituacionprocesoquimicorecetasexportreport_impl extends GXWebReport
{
   public wcsituacionprocesoquimicorecetasexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV48Title = httpContext.getMessage( "Lista de TRATAMIENTO DE RECETAS", "") ;
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
         h8IQ0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV61FilterFullText)==0) )
      {
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61FilterFullText, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV18TFCliCod) && (0==AV19TFCliCod_To) ) )
      {
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFCliCod), "ZZZZZ9")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFCliCod_To_Description, "")), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFCliCod_To), "ZZZZZ9")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFCliNom_Sel)==0) )
      {
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFCliNom_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20TFCliNom)==0) )
         {
            h8IQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFCliNom, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV23TFBarSer_Sel)==0) )
      {
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23TFBarSer_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22TFBarSer)==0) )
         {
            h8IQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFBarSer, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV25TFBarSerDsc_Sel)==0) )
      {
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción Serie", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFBarSerDsc_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFBarSerDsc)==0) )
         {
            h8IQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción Serie", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFBarSerDsc, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFBarColNom_Sel)==0) )
      {
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFBarColNom_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFBarColNom)==0) )
         {
            h8IQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFBarColNom, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV28TFBarColNum) && (0==AV29TFBarColNum_To) ) )
      {
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero del Color", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFBarColNum), "ZZZZZ9")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV37TFBarColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero del Color", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFBarColNum_To_Description, "")), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TFBarColNum_To), "ZZZZZ9")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFBarNomCli_Sel)==0) )
      {
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color Cliente", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFBarNomCli_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFBarNomCli)==0) )
         {
            h8IQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color Cliente", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFBarNomCli, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV33TFBarNHdr_Sel)==0) )
      {
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Hdr", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFBarNHdr_Sel, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFBarNHdr)==0) )
         {
            h8IQ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Hdr", ""), 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFBarNHdr, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV57TFRecAcab_Sels.fromJSonString(AV55TFRecAcab_SelsJson, null);
      if ( ! ( AV57TFRecAcab_Sels.size() == 0 ) )
      {
         AV60i = 1 ;
         AV72GXV1 = 1 ;
         while ( AV72GXV1 <= AV57TFRecAcab_Sels.size() )
         {
            AV58TFRecAcab_Sel = (String)AV57TFRecAcab_Sels.elementAt(-1+AV72GXV1) ;
            if ( AV60i == 1 )
            {
               AV56TFRecAcab_SelDscs = "" ;
            }
            else
            {
               AV56TFRecAcab_SelDscs += ", " ;
            }
            AV59FilterTFRecAcab_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV58TFRecAcab_Sel), "N") == 0 )
            {
               AV59FilterTFRecAcab_SelValueDescription = httpContext.getMessage( "Receta Tinte", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV58TFRecAcab_Sel), "S") == 0 )
            {
               AV59FilterTFRecAcab_SelValueDescription = httpContext.getMessage( "Receta acabado", "") ;
            }
            AV56TFRecAcab_SelDscs += AV59FilterTFRecAcab_SelValueDescription ;
            AV60i = (long)(AV60i+1) ;
            AV72GXV1 = (int)(AV72GXV1+1) ;
         }
         h8IQ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("", 25, Gx_line+0, 155, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFRecAcab_SelDscs, "")), 155, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8IQ0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8IQ0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 30, Gx_line+10, 90, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 94, Gx_line+10, 214, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Serie", ""), 218, Gx_line+10, 338, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción Serie", ""), 342, Gx_line+10, 462, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color", ""), 466, Gx_line+10, 527, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero del Color", ""), 531, Gx_line+10, 592, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Color Cliente", ""), 596, Gx_line+10, 657, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Hdr", ""), 661, Gx_line+10, 722, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText("", 726, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV61FilterFullText ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV18TFCliCod ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV19TFCliCod_To ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV20TFCliNom ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV21TFCliNom_Sel ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV22TFBarSer ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV23TFBarSer_Sel ;
      AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV24TFBarSerDsc ;
      AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV26TFBarColNom ;
      AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV27TFBarColNom_Sel ;
      AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV28TFBarColNum ;
      AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV29TFBarColNum_To ;
      AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV30TFBarNomCli ;
      AV88Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV32TFBarNHdr ;
      AV90Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV33TFBarNHdr_Sel ;
      AV91Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV57TFRecAcab_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV91Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                           AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                           Integer.valueOf(AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                           Integer.valueOf(AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                           AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                           AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                           AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                           AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                           AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                           AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                           AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                           AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                           Integer.valueOf(AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                           AV88Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                           AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                           AV90Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                           AV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                           Integer.valueOf(AV91Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV11Proforcod ,
                                           AV10Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
      lV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
      lV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
      lV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
      lV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
      lV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
      /* Using cursor P08IQ2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, Integer.valueOf(AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV88Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV90Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08IQ2_A396EmprCod[0] ;
         A1234BarNomCli = P08IQ2_A1234BarNomCli[0] ;
         A136BarColNum = P08IQ2_A136BarColNum[0] ;
         A135BarColNom = P08IQ2_A135BarColNom[0] ;
         A1652BarSerDsc = P08IQ2_A1652BarSerDsc[0] ;
         A212BarSer = P08IQ2_A212BarSer[0] ;
         A279CliNom = P08IQ2_A279CliNom[0] ;
         A252CliCod = P08IQ2_A252CliCod[0] ;
         n252CliCod = P08IQ2_n252CliCod[0] ;
         A130BarCodPar = P08IQ2_A130BarCodPar[0] ;
         A132BarCodReo = P08IQ2_A132BarCodReo[0] ;
         A129BarCod = P08IQ2_A129BarCod[0] ;
         A279CliNom = P08IQ2_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV54RecAcabDescription = "" ;
         if ( GXutil.strcmp(GXutil.trim( A6039RecAcab), "N") == 0 )
         {
            AV54RecAcabDescription = httpContext.getMessage( "Receta Tinte", "") ;
         }
         else if ( GXutil.strcmp(GXutil.trim( A6039RecAcab), "S") == 0 )
         {
            AV54RecAcabDescription = httpContext.getMessage( "Receta acabado", "") ;
         }
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
         h8IQ0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 30, Gx_line+10, 90, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 94, Gx_line+10, 214, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 218, Gx_line+10, 338, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 342, Gx_line+10, 462, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 466, Gx_line+10, 527, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 531, Gx_line+10, 592, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 596, Gx_line+10, 657, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), 661, Gx_line+10, 722, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54RecAcabDescription, "")), 726, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), null, null);
      }
      AV12OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV13OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV92GXV2 = 1 ;
      while ( AV92GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV61FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV18TFCliCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCliCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV20TFCliNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV21TFCliNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV22TFBarSer = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV23TFBarSer_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV24TFBarSerDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV25TFBarSerDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV26TFBarColNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV27TFBarColNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV28TFBarColNum = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFBarColNum_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV30TFBarNomCli = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV31TFBarNomCli_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV32TFBarNHdr = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV33TFBarNHdr_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECACAB_SEL") == 0 )
         {
            AV55TFRecAcab_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV57TFRecAcab_Sels.fromJSonString(AV55TFRecAcab_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10Emprcod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV11Proforcod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV92GXV2 = (int)(AV92GXV2+1) ;
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

   public void h8IQ0( boolean bFoot ,
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
               AV45PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV41DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV48Title = AV69Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV48Title = "" ;
      AV61FilterFullText = "" ;
      AV36TFCliCod_To_Description = "" ;
      AV21TFCliNom_Sel = "" ;
      AV20TFCliNom = "" ;
      AV23TFBarSer_Sel = "" ;
      AV22TFBarSer = "" ;
      AV25TFBarSerDsc_Sel = "" ;
      AV24TFBarSerDsc = "" ;
      AV27TFBarColNom_Sel = "" ;
      AV26TFBarColNom = "" ;
      AV37TFBarColNum_To_Description = "" ;
      AV31TFBarNomCli_Sel = "" ;
      AV30TFBarNomCli = "" ;
      AV33TFBarNHdr_Sel = "" ;
      AV32TFBarNHdr = "" ;
      AV57TFRecAcab_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV55TFRecAcab_SelsJson = "" ;
      AV58TFRecAcab_Sel = "" ;
      AV56TFRecAcab_SelDscs = "" ;
      AV59FilterTFRecAcab_SelValueDescription = "" ;
      A6039RecAcab = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A13696BarNHdr = "" ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = "" ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = "" ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = "" ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = "" ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = "" ;
      AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = "" ;
      AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = "" ;
      AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = "" ;
      AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = "" ;
      AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = "" ;
      AV88Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = "" ;
      AV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = "" ;
      AV90Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = "" ;
      AV91Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = "" ;
      lV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = "" ;
      lV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = "" ;
      lV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = "" ;
      lV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = "" ;
      lV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = "" ;
      A130BarCodPar = "" ;
      AV11Proforcod = "" ;
      AV10Emprcod = "" ;
      A396EmprCod = "" ;
      P08IQ2_A396EmprCod = new String[] {""} ;
      P08IQ2_A1234BarNomCli = new String[] {""} ;
      P08IQ2_A136BarColNum = new int[1] ;
      P08IQ2_A135BarColNom = new String[] {""} ;
      P08IQ2_A1652BarSerDsc = new String[] {""} ;
      P08IQ2_A212BarSer = new String[] {""} ;
      P08IQ2_A279CliNom = new String[] {""} ;
      P08IQ2_A252CliCod = new int[1] ;
      P08IQ2_n252CliCod = new boolean[] {false} ;
      P08IQ2_A130BarCodPar = new String[] {""} ;
      P08IQ2_A132BarCodReo = new byte[1] ;
      P08IQ2_A129BarCod = new int[1] ;
      AV54RecAcabDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV45PageInfo = "" ;
      AV41DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV69Pgmdesc = "" ;
      AV63AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsituacionprocesoquimicorecetasexportreport__default(),
         new Object[] {
             new Object[] {
            P08IQ2_A396EmprCod, P08IQ2_A1234BarNomCli, P08IQ2_A136BarColNum, P08IQ2_A135BarColNom, P08IQ2_A1652BarSerDsc, P08IQ2_A212BarSer, P08IQ2_A279CliNom, P08IQ2_A252CliCod, P08IQ2_n252CliCod, P08IQ2_A130BarCodPar,
            P08IQ2_A132BarCodReo, P08IQ2_A129BarCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV69Pgmdesc = httpContext.getMessage( "WCSituacion Proceso Quimico Recetas Export Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV69Pgmdesc = httpContext.getMessage( "WCSituacion Proceso Quimico Recetas Export Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV12OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV28TFBarColNum ;
   private int AV29TFBarColNum_To ;
   private int AV72GXV1 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ;
   private int AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ;
   private int AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ;
   private int AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ;
   private int AV91Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ;
   private int A129BarCod ;
   private int AV92GXV2 ;
   private long AV60i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV21TFCliNom_Sel ;
   private String AV20TFCliNom ;
   private String AV23TFBarSer_Sel ;
   private String AV22TFBarSer ;
   private String AV25TFBarSerDsc_Sel ;
   private String AV24TFBarSerDsc ;
   private String AV27TFBarColNom_Sel ;
   private String AV26TFBarColNom ;
   private String AV31TFBarNomCli_Sel ;
   private String AV30TFBarNomCli ;
   private String AV33TFBarNHdr_Sel ;
   private String AV32TFBarNHdr ;
   private String AV58TFRecAcab_Sel ;
   private String A6039RecAcab ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A13696BarNHdr ;
   private String AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ;
   private String AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ;
   private String AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ;
   private String AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ;
   private String AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ;
   private String AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ;
   private String AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ;
   private String AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ;
   private String AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ;
   private String AV88Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ;
   private String AV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ;
   private String AV90Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ;
   private String scmdbuf ;
   private String lV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ;
   private String lV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ;
   private String lV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ;
   private String lV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ;
   private String lV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ;
   private String lV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ;
   private String A130BarCodPar ;
   private String AV11Proforcod ;
   private String AV10Emprcod ;
   private String A396EmprCod ;
   private String AV69Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV13OrderedDsc ;
   private boolean n252CliCod ;
   private String AV55TFRecAcab_SelsJson ;
   private String AV48Title ;
   private String AV61FilterFullText ;
   private String AV36TFCliCod_To_Description ;
   private String AV37TFBarColNum_To_Description ;
   private String AV56TFRecAcab_SelDscs ;
   private String AV59FilterTFRecAcab_SelValueDescription ;
   private String AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ;
   private String AV54RecAcabDescription ;
   private String AV45PageInfo ;
   private String AV41DateInfo ;
   private String AV63AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08IQ2_A396EmprCod ;
   private String[] P08IQ2_A1234BarNomCli ;
   private int[] P08IQ2_A136BarColNum ;
   private String[] P08IQ2_A135BarColNom ;
   private String[] P08IQ2_A1652BarSerDsc ;
   private String[] P08IQ2_A212BarSer ;
   private String[] P08IQ2_A279CliNom ;
   private int[] P08IQ2_A252CliCod ;
   private boolean[] P08IQ2_n252CliCod ;
   private String[] P08IQ2_A130BarCodPar ;
   private byte[] P08IQ2_A132BarCodReo ;
   private int[] P08IQ2_A129BarCod ;
   private GXSimpleCollection<String> AV57TFRecAcab_Sels ;
   private GXSimpleCollection<String> AV91Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class wcsituacionprocesoquimicorecetasexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08IQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV91Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV88Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV90Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV91Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV11Proforcod ,
                                          String AV10Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV89Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
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
                  return conditional_P08IQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08IQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               return;
      }
   }

}

