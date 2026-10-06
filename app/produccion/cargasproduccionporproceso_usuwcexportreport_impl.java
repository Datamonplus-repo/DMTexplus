package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cargasproduccionporproceso_usuwcexportreport_impl extends GXWebReport
{
   public cargasproduccionporproceso_usuwcexportreport_impl( com.genexus.internet.HttpContext context )
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
         /* Execute user subroutine: 'CARGADATOSCABECERA' */
         S181 ();
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
         GXv_SdtWWPContext1[0] = AV9WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
         AV9WWPContext = GXv_SdtWWPContext1[0] ;
         /* Execute user subroutine: 'LOADGRIDSTATE' */
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
         AV65Title = httpContext.getMessage( "Lista de Cargas Produccion por Proceso", "") ;
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
         S171 ();
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
         S161 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hA040( true, 0) ;
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
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV80TFProFasEst_Sels.fromJSonString(AV78TFProFasEst_SelsJson, null);
      if ( ! ( AV80TFProFasEst_Sels.size() == 0 ) )
      {
         AV83i = 1 ;
         AV98GXV1 = 1 ;
         while ( AV98GXV1 <= AV80TFProFasEst_Sels.size() )
         {
            AV81TFProFasEst_Sel = ((Number) AV80TFProFasEst_Sels.elementAt(-1+AV98GXV1)).byteValue() ;
            if ( AV83i == 1 )
            {
               AV79TFProFasEst_SelDscs = "" ;
            }
            else
            {
               AV79TFProFasEst_SelDscs += ", " ;
            }
            AV82FilterTFProFasEst_SelValueDescription = "" ;
            if ( AV81TFProFasEst_Sel == 0 )
            {
               AV82FilterTFProFasEst_SelValueDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( AV81TFProFasEst_Sel == 1 )
            {
               AV82FilterTFProFasEst_SelValueDescription = httpContext.getMessage( "En Proceso (Fase Iniciada)", "") ;
            }
            else if ( AV81TFProFasEst_Sel == 2 )
            {
               AV82FilterTFProFasEst_SelValueDescription = httpContext.getMessage( "En Proceso (Fase Realizada)", "") ;
            }
            AV79TFProFasEst_SelDscs += AV82FilterTFProFasEst_SelValueDescription ;
            AV83i = (long)(AV83i+1) ;
            AV98GXV1 = (int)(AV98GXV1+1) ;
         }
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFProFasEst_SelDscs, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV19TFCliCod) && (0==AV20TFCliCod_To) ) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFCliCod), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFCliCod_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFCliCod_To), "ZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFCliNom_Sel)==0) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cli.Nombre", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFCliNom_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFCliNom)==0) )
         {
            hA040( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cli.Nombre", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFCliNom, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV23TFBarCod) && (0==AV24TFBarCod_To) ) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFBarCod), "ZZZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFBarCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Hdr", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFBarCod_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFBarCod_To), "ZZZZZZZ9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV25TFBarCodReo) && (0==AV26TFBarCodReo_To) ) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "R", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFBarCodReo), "9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV50TFBarCodReo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "R", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFBarCodReo_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFBarCodReo_To), "9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFBarCodPar_Sel)==0) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFBarCodPar_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFBarCodPar)==0) )
         {
            hA040( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFBarCodPar, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV29TFBarSit) && (0==AV30TFBarSit_To) ) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Sit.", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TFBarSit), "Z9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV51TFBarSit_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Sit.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFBarSit_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFBarSit_To), "Z9")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV32TFBarSer_Sel)==0) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFBarSer_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFBarSer)==0) )
         {
            hA040( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFBarSer, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV36TFBarColNom_Sel)==0) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFBarColNom_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV35TFBarColNom)==0) )
         {
            hA040( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFBarColNom, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV40TFBarNomCli_Sel)==0) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color Cli", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFBarNomCli_Sel, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV39TFBarNomCli)==0) )
         {
            hA040( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color Cli", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFBarNomCli, "")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarKgm_To)==0) ) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TFBarKgm, "ZZZZZ9.99")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV53TFBarKgm_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kgs", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFBarKgm_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42TFBarKgm_To, "ZZZZZ9.99")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarMtr_To)==0) ) )
      {
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Mts", ""), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43TFBarMtr, "ZZZZZ9.99")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV54TFBarMtr_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Mts", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA040( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFBarMtr_To_Description, "")), 25, Gx_line+0, 109, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44TFBarMtr_To, "ZZZZZ9.99")), 109, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA040( false, 35) ;
      getPrinter().GxDrawLine(25, Gx_line+18, 789, Gx_line+18, 2, 149, 0, 0, 0) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "PROCESO: ", ""), 217, Gx_line+0, 286, Gx_line+16, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Procod, "")), 316, Gx_line+0, 409, Gx_line+17, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90ProDsc, "")), 429, Gx_line+0, 638, Gx_line+17, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+35) ;
      hA040( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 30, Gx_line+10, 96, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cli.Nombre", ""), 104, Gx_line+10, 220, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Disp. Cliente", ""), 402, Gx_line+10, 448, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 226, Gx_line+10, 272, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "R", ""), 276, Gx_line+10, 322, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 326, Gx_line+10, 336, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Sit.", ""), 345, Gx_line+10, 392, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 460, Gx_line+10, 528, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 535, Gx_line+10, 602, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 682, Gx_line+10, 729, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Mts", ""), 734, Gx_line+10, 781, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue("Produccion.CargasProduccionporProceso_WCGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.CargasProduccionporProceso_WCGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("Produccion.CargasProduccionporProceso_WCGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV99GXV2 = 1 ;
      while ( AV99GXV2 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV99GXV2));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFASEST_SEL") == 0 )
         {
            AV78TFProFasEst_SelsJson = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV80TFProFasEst_Sels.fromJSonString(AV78TFProFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV19TFCliCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV20TFCliCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV21TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV22TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV23TFBarCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFBarCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV25TFBarCodReo = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV26TFBarCodReo_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV27TFBarCodPar = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV28TFBarCodPar_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV29TFBarSit = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV30TFBarSit_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV31TFBarSer = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV32TFBarSer_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV33TFBarSerDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV34TFBarSerDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV35TFBarColNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV36TFBarColNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV37TFBarColNum = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFBarColNum_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV39TFBarNomCli = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV40TFBarNomCli_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV41TFBarKgm = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFBarKgm_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV43TFBarMtr = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFBarMtr_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV45TFBarFasCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV46TFBarFasCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV99GXV2 = (int)(AV99GXV2+1) ;
      }
      AV84EmprCod = AV85WebSession.getValue("EmprCod") ;
      AV67Procod = AV85WebSession.getValue("ProCod") ;
      AV68CliCod = (int)(GXutil.lval( AV85WebSession.getValue("CliCod"))) ;
      AV69CliCod_to = (int)(GXutil.lval( AV85WebSession.getValue("CliCod_to"))) ;
      AV70BarFecGen = localUtil.ctod( AV85WebSession.getValue("BarFecGen"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV71BarFecGen_to = localUtil.ctod( AV85WebSession.getValue("BarFecGen_to"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV72BarSit = (byte)(GXutil.lval( AV85WebSession.getValue("BarSit"))) ;
      AV73BarSit_to = (byte)(GXutil.lval( AV85WebSession.getValue("BarSit_to"))) ;
      AV74ProFasEst = (byte)(GXutil.lval( AV85WebSession.getValue("ProFasEst"))) ;
      AV85WebSession.remove("EmprCod");
      AV85WebSession.remove("ProCod");
      AV85WebSession.remove("CliCod");
      AV85WebSession.remove("CliCod_to");
      AV85WebSession.remove("BarFecGen");
      AV85WebSession.remove("BarFecGen_to");
      AV85WebSession.remove("BarSit");
      AV85WebSession.remove("BarSit_to");
      AV85WebSession.remove("ProFasEst");
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'BEFOREPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'AFTERPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'PRINTFOOTER' Routine */
      returnInSub = false ;
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV91TotBarMtr = DecimalUtil.doubleToDec(0) ;
      AV92TotBarKgm = DecimalUtil.doubleToDec(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV80TFProFasEst_Sels ,
                                           Integer.valueOf(AV19TFCliCod) ,
                                           Integer.valueOf(AV20TFCliCod_To) ,
                                           AV22TFCliNom_Sel ,
                                           AV21TFCliNom ,
                                           Integer.valueOf(AV23TFBarCod) ,
                                           Integer.valueOf(AV24TFBarCod_To) ,
                                           Byte.valueOf(AV25TFBarCodReo) ,
                                           Byte.valueOf(AV26TFBarCodReo_To) ,
                                           AV28TFBarCodPar_Sel ,
                                           AV27TFBarCodPar ,
                                           Byte.valueOf(AV29TFBarSit) ,
                                           Byte.valueOf(AV30TFBarSit_To) ,
                                           AV32TFBarSer_Sel ,
                                           AV31TFBarSer ,
                                           AV34TFBarSerDsc_Sel ,
                                           AV33TFBarSerDsc ,
                                           AV36TFBarColNom_Sel ,
                                           AV35TFBarColNom ,
                                           Integer.valueOf(AV37TFBarColNum) ,
                                           Integer.valueOf(AV38TFBarColNum_To) ,
                                           AV40TFBarNomCli_Sel ,
                                           AV39TFBarNomCli ,
                                           AV41TFBarKgm ,
                                           AV42TFBarKgm_To ,
                                           AV43TFBarMtr ,
                                           AV44TFBarMtr_To ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV12FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV80TFProFasEst_Sels.size()) ,
                                           AV46TFBarFasCod_Sel ,
                                           AV45TFBarFasCod ,
                                           Integer.valueOf(AV68CliCod) ,
                                           Integer.valueOf(AV69CliCod_to) ,
                                           A159BarFecGen ,
                                           AV70BarFecGen ,
                                           AV71BarFecGen_to ,
                                           Byte.valueOf(AV72BarSit) ,
                                           Byte.valueOf(AV73BarSit_to) ,
                                           Byte.valueOf(AV74ProFasEst) ,
                                           AV84EmprCod ,
                                           AV67Procod ,
                                           A396EmprCod ,
                                           A758ProCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV45TFBarFasCod = GXutil.padr( GXutil.rtrim( AV45TFBarFasCod), 8, "%") ;
      lV21TFCliNom = GXutil.padr( GXutil.rtrim( AV21TFCliNom), 30, "%") ;
      lV27TFBarCodPar = GXutil.padr( GXutil.rtrim( AV27TFBarCodPar), 1, "%") ;
      lV31TFBarSer = GXutil.padr( GXutil.rtrim( AV31TFBarSer), 16, "%") ;
      lV33TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV33TFBarSerDsc), 26, "%") ;
      lV35TFBarColNom = GXutil.padr( GXutil.rtrim( AV35TFBarColNom), 13, "%") ;
      lV39TFBarNomCli = GXutil.padr( GXutil.rtrim( AV39TFBarNomCli), 13, "%") ;
      /* Using cursor P0A046 */
      pr_default.execute(0, new Object[] {AV84EmprCod, AV67Procod, AV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, Integer.valueOf(AV80TFProFasEst_Sels.size()), AV46TFBarFasCod_Sel, AV45TFBarFasCod, lV45TFBarFasCod, AV46TFBarFasCod_Sel, AV46TFBarFasCod_Sel, Integer.valueOf(AV68CliCod), Integer.valueOf(AV69CliCod_to), AV70BarFecGen, AV71BarFecGen_to, Byte.valueOf(AV72BarSit), Byte.valueOf(AV73BarSit_to), Byte.valueOf(AV74ProFasEst), Integer.valueOf(AV19TFCliCod), Integer.valueOf(AV20TFCliCod_To), lV21TFCliNom, AV22TFCliNom_Sel, Integer.valueOf(AV23TFBarCod), Integer.valueOf(AV24TFBarCod_To), Byte.valueOf(AV25TFBarCodReo), Byte.valueOf(AV26TFBarCodReo_To), lV27TFBarCodPar, AV28TFBarCodPar_Sel, Byte.valueOf(AV29TFBarSit), Byte.valueOf(AV30TFBarSit_To), lV31TFBarSer, AV32TFBarSer_Sel, lV33TFBarSerDsc, AV34TFBarSerDsc_Sel, lV35TFBarColNom, AV36TFBarColNom_Sel, Integer.valueOf(AV37TFBarColNum), Integer.valueOf(AV38TFBarColNum_To), lV39TFBarNomCli, AV40TFBarNomCli_Sel, AV41TFBarKgm, AV42TFBarKgm_To, AV43TFBarMtr, AV44TFBarMtr_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A159BarFecGen = P0A046_A159BarFecGen[0] ;
         A758ProCod = P0A046_A758ProCod[0] ;
         A396EmprCod = P0A046_A396EmprCod[0] ;
         A1234BarNomCli = P0A046_A1234BarNomCli[0] ;
         A136BarColNum = P0A046_A136BarColNum[0] ;
         A135BarColNom = P0A046_A135BarColNom[0] ;
         A1652BarSerDsc = P0A046_A1652BarSerDsc[0] ;
         A212BarSer = P0A046_A212BarSer[0] ;
         A213BarSit = P0A046_A213BarSit[0] ;
         A130BarCodPar = P0A046_A130BarCodPar[0] ;
         A132BarCodReo = P0A046_A132BarCodReo[0] ;
         A129BarCod = P0A046_A129BarCod[0] ;
         A279CliNom = P0A046_A279CliNom[0] ;
         A252CliCod = P0A046_A252CliCod[0] ;
         n252CliCod = P0A046_n252CliCod[0] ;
         A4812BarEncCli = P0A046_A4812BarEncCli[0] ;
         A143BarDisNum = P0A046_A143BarDisNum[0] ;
         A151BarFasCod = P0A046_A151BarFasCod[0] ;
         n151BarFasCod = P0A046_n151BarFasCod[0] ;
         A184BarMtr = P0A046_A184BarMtr[0] ;
         A166BarKgm = P0A046_A166BarKgm[0] ;
         A760ProFasEst = P0A046_A760ProFasEst[0] ;
         n760ProFasEst = P0A046_n760ProFasEst[0] ;
         A159BarFecGen = P0A046_A159BarFecGen[0] ;
         A1234BarNomCli = P0A046_A1234BarNomCli[0] ;
         A136BarColNum = P0A046_A136BarColNum[0] ;
         A135BarColNom = P0A046_A135BarColNom[0] ;
         A1652BarSerDsc = P0A046_A1652BarSerDsc[0] ;
         A212BarSer = P0A046_A212BarSer[0] ;
         A213BarSit = P0A046_A213BarSit[0] ;
         A252CliCod = P0A046_A252CliCod[0] ;
         n252CliCod = P0A046_n252CliCod[0] ;
         A4812BarEncCli = P0A046_A4812BarEncCli[0] ;
         A143BarDisNum = P0A046_A143BarDisNum[0] ;
         A279CliNom = P0A046_A279CliNom[0] ;
         A151BarFasCod = P0A046_A151BarFasCod[0] ;
         n151BarFasCod = P0A046_n151BarFasCod[0] ;
         A184BarMtr = P0A046_A184BarMtr[0] ;
         A166BarKgm = P0A046_A166BarKgm[0] ;
         A760ProFasEst = P0A046_A760ProFasEst[0] ;
         n760ProFasEst = P0A046_n760ProFasEst[0] ;
         AV77ProFasEstDescription = "" ;
         if ( A760ProFasEst == 0 )
         {
            AV77ProFasEstDescription = httpContext.getMessage( "Pendiente", "") ;
         }
         else if ( A760ProFasEst == 1 )
         {
            AV77ProFasEstDescription = httpContext.getMessage( "En Proceso (Fase Iniciada)", "") ;
         }
         else if ( A760ProFasEst == 2 )
         {
            AV77ProFasEstDescription = httpContext.getMessage( "En Proceso (Fase Realizada)", "") ;
         }
         if ( GXutil.strcmp(A4812BarEncCli, " ") != 0 )
         {
            AV86BarEncCli = A4812BarEncCli ;
         }
         else
         {
            AV86BarEncCli = A143BarDisNum ;
         }
         AV91TotBarMtr = AV91TotBarMtr.add(A184BarMtr) ;
         AV92TotBarKgm = AV92TotBarKgm.add(A166BarKgm) ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S141 ();
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
         hA040( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77ProFasEstDescription, "")), 30, Gx_line+10, 96, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 104, Gx_line+10, 220, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86BarEncCli, "")), 402, Gx_line+10, 448, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 226, Gx_line+10, 272, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 276, Gx_line+10, 322, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 326, Gx_line+10, 336, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")), 345, Gx_line+10, 392, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 460, Gx_line+10, 528, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 535, Gx_line+10, 602, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 609, Gx_line+10, 676, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 682, Gx_line+10, 729, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")), 734, Gx_line+10, 781, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S151 ();
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
      hA040( false, 27) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV92TotBarKgm, "ZZZZZ9.99")), 618, Gx_line+6, 685, Gx_line+21, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV91TotBarMtr, "ZZZZZ9.99")), 680, Gx_line+6, 747, Gx_line+21, 2+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+27) ;
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'CARGADATOSCABECERA' Routine */
      returnInSub = false ;
      GXt_char2 = AV87Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      cargasproduccionporproceso_usuwcexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
      AV87Station = GXt_char2 ;
      GXv_char3[0] = AV84EmprCod ;
      GXv_char4[0] = AV88EmprNom ;
      GXv_char5[0] = AV89UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV87Station, GXv_char3, GXv_char4, GXv_char5) ;
      cargasproduccionporproceso_usuwcexportreport_impl.this.AV84EmprCod = GXv_char3[0] ;
      cargasproduccionporproceso_usuwcexportreport_impl.this.AV88EmprNom = GXv_char4[0] ;
      cargasproduccionporproceso_usuwcexportreport_impl.this.AV89UsurCod = GXv_char5[0] ;
      AV67Procod = GXutil.upper( GXutil.trim( AV85WebSession.getValue("FiltroProduccionporProceso_ProCod"))) ;
      AV85WebSession.remove("FiltroProduccionporProceso_ProCod");
      GXt_char2 = AV90ProDsc ;
      GXv_char5[0] = AV84EmprCod ;
      GXv_char4[0] = AV67Procod ;
      GXv_char3[0] = GXt_char2 ;
      new app.pprodsc(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
      cargasproduccionporproceso_usuwcexportreport_impl.this.AV84EmprCod = GXv_char5[0] ;
      cargasproduccionporproceso_usuwcexportreport_impl.this.AV67Procod = GXv_char4[0] ;
      cargasproduccionporproceso_usuwcexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
      AV90ProDsc = GXt_char2 ;
   }

   public void hA040( boolean bFoot ,
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
               AV63PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV60DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV58AppName = AV88EmprNom ;
            AV65Title = AV95Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 12, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58AppName, "")), 30, Gx_line+20, 789, Gx_line+35, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 18, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      add_metrics1( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV65Title = "" ;
      AV12FilterFullText = "" ;
      AV80TFProFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV78TFProFasEst_SelsJson = "" ;
      AV79TFProFasEst_SelDscs = "" ;
      AV82FilterTFProFasEst_SelValueDescription = "" ;
      AV48TFCliCod_To_Description = "" ;
      AV22TFCliNom_Sel = "" ;
      AV21TFCliNom = "" ;
      AV49TFBarCod_To_Description = "" ;
      AV50TFBarCodReo_To_Description = "" ;
      AV28TFBarCodPar_Sel = "" ;
      AV27TFBarCodPar = "" ;
      AV51TFBarSit_To_Description = "" ;
      AV32TFBarSer_Sel = "" ;
      AV31TFBarSer = "" ;
      AV36TFBarColNom_Sel = "" ;
      AV35TFBarColNom = "" ;
      AV40TFBarNomCli_Sel = "" ;
      AV39TFBarNomCli = "" ;
      AV41TFBarKgm = DecimalUtil.ZERO ;
      AV42TFBarKgm_To = DecimalUtil.ZERO ;
      AV53TFBarKgm_To_Description = "" ;
      AV43TFBarMtr = DecimalUtil.ZERO ;
      AV44TFBarMtr_To = DecimalUtil.ZERO ;
      AV54TFBarMtr_To_Description = "" ;
      AV67Procod = "" ;
      AV90ProDsc = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV33TFBarSerDsc = "" ;
      AV34TFBarSerDsc_Sel = "" ;
      AV45TFBarFasCod = "" ;
      AV46TFBarFasCod_Sel = "" ;
      AV84EmprCod = "" ;
      AV85WebSession = httpContext.getWebSession();
      AV70BarFecGen = GXutil.nullDate() ;
      AV71BarFecGen_to = GXutil.nullDate() ;
      AV91TotBarMtr = DecimalUtil.ZERO ;
      AV92TotBarKgm = DecimalUtil.ZERO ;
      lV12FilterFullText = "" ;
      scmdbuf = "" ;
      lV45TFBarFasCod = "" ;
      lV21TFCliNom = "" ;
      lV27TFBarCodPar = "" ;
      lV31TFBarSer = "" ;
      lV33TFBarSerDsc = "" ;
      lV35TFBarColNom = "" ;
      lV39TFBarNomCli = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      P0A046_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0A046_A758ProCod = new String[] {""} ;
      P0A046_A396EmprCod = new String[] {""} ;
      P0A046_A1234BarNomCli = new String[] {""} ;
      P0A046_A136BarColNum = new int[1] ;
      P0A046_A135BarColNom = new String[] {""} ;
      P0A046_A1652BarSerDsc = new String[] {""} ;
      P0A046_A212BarSer = new String[] {""} ;
      P0A046_A213BarSit = new byte[1] ;
      P0A046_A130BarCodPar = new String[] {""} ;
      P0A046_A132BarCodReo = new byte[1] ;
      P0A046_A129BarCod = new int[1] ;
      P0A046_A279CliNom = new String[] {""} ;
      P0A046_A252CliCod = new int[1] ;
      P0A046_n252CliCod = new boolean[] {false} ;
      P0A046_A4812BarEncCli = new String[] {""} ;
      P0A046_A143BarDisNum = new String[] {""} ;
      P0A046_A151BarFasCod = new String[] {""} ;
      P0A046_n151BarFasCod = new boolean[] {false} ;
      P0A046_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A046_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A046_A760ProFasEst = new byte[1] ;
      P0A046_n760ProFasEst = new boolean[] {false} ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      AV77ProFasEstDescription = "" ;
      AV86BarEncCli = "" ;
      AV87Station = "" ;
      AV88EmprNom = "" ;
      AV89UsurCod = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV63PageInfo = "" ;
      AV60DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV58AppName = "" ;
      AV95Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.cargasproduccionporproceso_usuwcexportreport__default(),
         new Object[] {
             new Object[] {
            P0A046_A159BarFecGen, P0A046_A758ProCod, P0A046_A396EmprCod, P0A046_A1234BarNomCli, P0A046_A136BarColNum, P0A046_A135BarColNom, P0A046_A1652BarSerDsc, P0A046_A212BarSer, P0A046_A213BarSit, P0A046_A130BarCodPar,
            P0A046_A132BarCodReo, P0A046_A129BarCod, P0A046_A279CliNom, P0A046_A252CliCod, P0A046_n252CliCod, P0A046_A4812BarEncCli, P0A046_A143BarDisNum, P0A046_A151BarFasCod, P0A046_n151BarFasCod, P0A046_A184BarMtr,
            P0A046_A166BarKgm, P0A046_A760ProFasEst, P0A046_n760ProFasEst
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV95Pgmdesc = httpContext.getMessage( "Informe Producción por Proceso", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV95Pgmdesc = httpContext.getMessage( "Informe Producción por Proceso", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV81TFProFasEst_Sel ;
   private byte AV25TFBarCodReo ;
   private byte AV26TFBarCodReo_To ;
   private byte AV29TFBarSit ;
   private byte AV30TFBarSit_To ;
   private byte AV72BarSit ;
   private byte AV73BarSit_to ;
   private byte AV74ProFasEst ;
   private byte A760ProFasEst ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV98GXV1 ;
   private int AV19TFCliCod ;
   private int AV20TFCliCod_To ;
   private int AV23TFBarCod ;
   private int AV24TFBarCod_To ;
   private int AV99GXV2 ;
   private int AV37TFBarColNum ;
   private int AV38TFBarColNum_To ;
   private int AV68CliCod ;
   private int AV69CliCod_to ;
   private int AV80TFProFasEst_Sels_size ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private long AV83i ;
   private java.math.BigDecimal AV41TFBarKgm ;
   private java.math.BigDecimal AV42TFBarKgm_To ;
   private java.math.BigDecimal AV43TFBarMtr ;
   private java.math.BigDecimal AV44TFBarMtr_To ;
   private java.math.BigDecimal AV91TotBarMtr ;
   private java.math.BigDecimal AV92TotBarKgm ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV22TFCliNom_Sel ;
   private String AV21TFCliNom ;
   private String AV28TFBarCodPar_Sel ;
   private String AV27TFBarCodPar ;
   private String AV32TFBarSer_Sel ;
   private String AV31TFBarSer ;
   private String AV36TFBarColNom_Sel ;
   private String AV35TFBarColNom ;
   private String AV40TFBarNomCli_Sel ;
   private String AV39TFBarNomCli ;
   private String AV67Procod ;
   private String AV90ProDsc ;
   private String AV33TFBarSerDsc ;
   private String AV34TFBarSerDsc_Sel ;
   private String AV45TFBarFasCod ;
   private String AV46TFBarFasCod_Sel ;
   private String AV84EmprCod ;
   private String scmdbuf ;
   private String lV45TFBarFasCod ;
   private String lV21TFCliNom ;
   private String lV27TFBarCodPar ;
   private String lV31TFBarSer ;
   private String lV33TFBarSerDsc ;
   private String lV35TFBarColNom ;
   private String lV39TFBarNomCli ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A151BarFasCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String AV86BarEncCli ;
   private String AV87Station ;
   private String AV88EmprNom ;
   private String AV89UsurCod ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV95Pgmdesc ;
   private java.util.Date AV70BarFecGen ;
   private java.util.Date AV71BarFecGen_to ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n151BarFasCod ;
   private boolean n760ProFasEst ;
   private String AV78TFProFasEst_SelsJson ;
   private String AV65Title ;
   private String AV12FilterFullText ;
   private String AV79TFProFasEst_SelDscs ;
   private String AV82FilterTFProFasEst_SelValueDescription ;
   private String AV48TFCliCod_To_Description ;
   private String AV49TFBarCod_To_Description ;
   private String AV50TFBarCodReo_To_Description ;
   private String AV51TFBarSit_To_Description ;
   private String AV53TFBarKgm_To_Description ;
   private String AV54TFBarMtr_To_Description ;
   private String lV12FilterFullText ;
   private String AV77ProFasEstDescription ;
   private String AV63PageInfo ;
   private String AV60DateInfo ;
   private String AV58AppName ;
   private GXSimpleCollection<Byte> AV80TFProFasEst_Sels ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private com.genexus.webpanels.WebSession AV85WebSession ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0A046_A159BarFecGen ;
   private String[] P0A046_A758ProCod ;
   private String[] P0A046_A396EmprCod ;
   private String[] P0A046_A1234BarNomCli ;
   private int[] P0A046_A136BarColNum ;
   private String[] P0A046_A135BarColNom ;
   private String[] P0A046_A1652BarSerDsc ;
   private String[] P0A046_A212BarSer ;
   private byte[] P0A046_A213BarSit ;
   private String[] P0A046_A130BarCodPar ;
   private byte[] P0A046_A132BarCodReo ;
   private int[] P0A046_A129BarCod ;
   private String[] P0A046_A279CliNom ;
   private int[] P0A046_A252CliCod ;
   private boolean[] P0A046_n252CliCod ;
   private String[] P0A046_A4812BarEncCli ;
   private String[] P0A046_A143BarDisNum ;
   private String[] P0A046_A151BarFasCod ;
   private boolean[] P0A046_n151BarFasCod ;
   private java.math.BigDecimal[] P0A046_A184BarMtr ;
   private java.math.BigDecimal[] P0A046_A166BarKgm ;
   private byte[] P0A046_A760ProFasEst ;
   private boolean[] P0A046_n760ProFasEst ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class cargasproduccionporproceso_usuwcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A046( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A760ProFasEst ,
                                          GXSimpleCollection<Byte> AV80TFProFasEst_Sels ,
                                          int AV19TFCliCod ,
                                          int AV20TFCliCod_To ,
                                          String AV22TFCliNom_Sel ,
                                          String AV21TFCliNom ,
                                          int AV23TFBarCod ,
                                          int AV24TFBarCod_To ,
                                          byte AV25TFBarCodReo ,
                                          byte AV26TFBarCodReo_To ,
                                          String AV28TFBarCodPar_Sel ,
                                          String AV27TFBarCodPar ,
                                          byte AV29TFBarSit ,
                                          byte AV30TFBarSit_To ,
                                          String AV32TFBarSer_Sel ,
                                          String AV31TFBarSer ,
                                          String AV34TFBarSerDsc_Sel ,
                                          String AV33TFBarSerDsc ,
                                          String AV36TFBarColNom_Sel ,
                                          String AV35TFBarColNom ,
                                          int AV37TFBarColNum ,
                                          int AV38TFBarColNum_To ,
                                          String AV40TFBarNomCli_Sel ,
                                          String AV39TFBarNomCli ,
                                          java.math.BigDecimal AV41TFBarKgm ,
                                          java.math.BigDecimal AV42TFBarKgm_To ,
                                          java.math.BigDecimal AV43TFBarMtr ,
                                          java.math.BigDecimal AV44TFBarMtr_To ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV12FilterFullText ,
                                          String A151BarFasCod ,
                                          int AV80TFProFasEst_Sels_size ,
                                          String AV46TFBarFasCod_Sel ,
                                          String AV45TFBarFasCod ,
                                          int AV68CliCod ,
                                          int AV69CliCod_to ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date AV70BarFecGen ,
                                          java.util.Date AV71BarFecGen_to ,
                                          byte AV72BarSit ,
                                          byte AV73BarSit_to ,
                                          byte AV74ProFasEst ,
                                          String AV84EmprCod ,
                                          String AV67Procod ,
                                          String A396EmprCod ,
                                          String A758ProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[57];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.BarFecGen, T1.ProCod, T1.EmprCod, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T3.CliNom, T2.CliCod, T2.BarEncCli, T2.BarDisNum, COALESCE( T4.BarFasCod, ' ') AS BarFasCod, COALESCE( T5.BarMtr, 0) AS BarMtr, COALESCE( T5.BarKgm, 0) AS BarKgm," ;
      scmdbuf += " COALESCE( T6.ProFasEst, 0) AS ProFasEst FROM (((((TXPBARPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T7.FasCod) AS BarFasCod, T7.EmprCod," ;
      scmdbuf += " T7.BarCod, T7.BarCodReo, T7.BarCodPar FROM (TXPBARFAS T7 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T8 ON T8.EmprCod = T7.EmprCod AND T8.BarCod = T7.BarCod AND T8.BarCodReo = T7.BarCodReo AND T8.BarCodPar =" ;
      scmdbuf += " T7.BarCodPar) WHERE (T7.BarOrdLin = T8.GXC1) AND (T7.BarFasEst <> 0) GROUP BY T7.EmprCod, T7.BarCod, T7.BarCodReo, T7.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND" ;
      scmdbuf += " T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS" ;
      scmdbuf += " WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T1.BarCodPar AND T6.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T6.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV80TFProFasEst_Sels, "COALESCE( T6.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(COALESCE( T6.ProFasEst, 0) = ?)");
      if ( ! (0==AV19TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV20TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV22TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV21TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV23TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV25TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV26TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV28TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV27TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV29TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (0==AV30TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV32TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV31TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV32TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV34TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV33TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV36TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV37TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T2.CliCod, T2.BarSit" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
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
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0A046(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (java.util.Date)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A046", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(15, 20);
               ((String[]) buf[16])[0] = rslt.getString(16, 8);
               ((String[]) buf[17])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
      }
   }

}

