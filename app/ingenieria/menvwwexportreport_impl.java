package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class menvwwexportreport_impl extends GXWebReport
{
   public menvwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV54Title = httpContext.getMessage( "Lista de Envíos de parámetros de máquinas", "") ;
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
         hAUS0( true, 0) ;
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
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV20TFBarCod) && (0==AV21TFBarCod_To) ) )
      {
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "OS", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFBarCod), "ZZZZZZZ9")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV34TFBarCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "OS", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFBarCod_To_Description, "")), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFBarCod_To), "ZZZZZZZ9")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV22TFBarCodReo) && (0==AV23TFBarCodReo_To) ) )
      {
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "R", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFBarCodReo), "9")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV35TFBarCodReo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "R", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFBarCodReo_To_Description, "")), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFBarCodReo_To), "9")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFBarCodPar_Sel)==0) )
      {
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFBarCodPar_Sel, "")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFBarCodPar)==0) )
         {
            hAUS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFBarCodPar, "")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV66TFMEnvOrd) && (0==AV67TFMEnvOrd_To) ) )
      {
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV66TFMEnvOrd), "ZZZ9")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV80TFMEnvOrd_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Orden", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFMEnvOrd_To_Description, "")), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67TFMEnvOrd_To), "ZZZ9")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV69TFFasCod_Sel)==0) )
      {
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Fase", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFFasCod_Sel, "@!")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV68TFFasCod)==0) )
         {
            hAUS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Fase", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68TFFasCod, "@!")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV70TFMEnvIni) )
      {
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV70TFMEnvIni, "99/99/99 99:99:99.999"), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72TFMEnvFin) )
      {
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV72TFMEnvFin, "99/99/99 99:99"), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV76TFMEnvEst_Sels.fromJSonString(AV74TFMEnvEst_SelsJson, null);
      if ( ! ( AV76TFMEnvEst_Sels.size() == 0 ) )
      {
         AV43i = 1 ;
         AV90GXV1 = 1 ;
         while ( AV90GXV1 <= AV76TFMEnvEst_Sels.size() )
         {
            AV77TFMEnvEst_Sel = ((Number) AV76TFMEnvEst_Sels.elementAt(-1+AV90GXV1)).byteValue() ;
            if ( AV43i == 1 )
            {
               AV75TFMEnvEst_SelDscs = "" ;
            }
            else
            {
               AV75TFMEnvEst_SelDscs += ", " ;
            }
            AV83FilterTFMEnvEst_SelValueDescription = httpContext.getMessage( app.ingenieria.gxdomainestadosenvioparametros.getDescription(httpContext,(byte)AV77TFMEnvEst_Sel), "") ;
            AV75TFMEnvEst_SelDscs += AV83FilterTFMEnvEst_SelValueDescription ;
            AV43i = (long)(AV43i+1) ;
            AV90GXV1 = (int)(AV90GXV1+1) ;
         }
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFMEnvEst_SelDscs, "")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFMEnvInt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFMEnvInt_To)==0) ) )
      {
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Seg.", ""), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV78TFMEnvInt, "ZZZZZZ9.99")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV84TFMEnvInt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Seg.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hAUS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84TFMEnvInt_To_Description, "")), 25, Gx_line+0, 101, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV79TFMEnvInt_To, "ZZZZZZ9.99")), 101, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hAUS0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hAUS0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "OS", ""), 30, Gx_line+10, 102, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "R", ""), 106, Gx_line+10, 178, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 182, Gx_line+10, 254, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 258, Gx_line+10, 330, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Fase", ""), 334, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 410, Gx_line+10, 483, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 487, Gx_line+10, 560, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 564, Gx_line+10, 710, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Seg.", ""), 714, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV92Ingenieria_menvwwds_1_filterfulltext = AV12FilterFullText ;
      AV93Ingenieria_menvwwds_2_tfbarcod = AV20TFBarCod ;
      AV94Ingenieria_menvwwds_3_tfbarcod_to = AV21TFBarCod_To ;
      AV95Ingenieria_menvwwds_4_tfbarcodreo = AV22TFBarCodReo ;
      AV96Ingenieria_menvwwds_5_tfbarcodreo_to = AV23TFBarCodReo_To ;
      AV97Ingenieria_menvwwds_6_tfbarcodpar = AV24TFBarCodPar ;
      AV98Ingenieria_menvwwds_7_tfbarcodpar_sel = AV25TFBarCodPar_Sel ;
      AV99Ingenieria_menvwwds_8_tfmenvord = AV66TFMEnvOrd ;
      AV100Ingenieria_menvwwds_9_tfmenvord_to = AV67TFMEnvOrd_To ;
      AV101Ingenieria_menvwwds_10_tffascod = AV68TFFasCod ;
      AV102Ingenieria_menvwwds_11_tffascod_sel = AV69TFFasCod_Sel ;
      AV103Ingenieria_menvwwds_12_tfmenvini = AV70TFMEnvIni ;
      AV104Ingenieria_menvwwds_13_tfmenvfin = AV72TFMEnvFin ;
      AV105Ingenieria_menvwwds_14_tfmenvest_sels = AV76TFMEnvEst_Sels ;
      AV106Ingenieria_menvwwds_15_tfmenvint = AV78TFMEnvInt ;
      AV107Ingenieria_menvwwds_16_tfmenvint_to = AV79TFMEnvInt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A14156MEnvEst) ,
                                           AV105Ingenieria_menvwwds_14_tfmenvest_sels ,
                                           Integer.valueOf(AV93Ingenieria_menvwwds_2_tfbarcod) ,
                                           Integer.valueOf(AV94Ingenieria_menvwwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV95Ingenieria_menvwwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV96Ingenieria_menvwwds_5_tfbarcodreo_to) ,
                                           AV98Ingenieria_menvwwds_7_tfbarcodpar_sel ,
                                           AV97Ingenieria_menvwwds_6_tfbarcodpar ,
                                           Short.valueOf(AV99Ingenieria_menvwwds_8_tfmenvord) ,
                                           Short.valueOf(AV100Ingenieria_menvwwds_9_tfmenvord_to) ,
                                           AV102Ingenieria_menvwwds_11_tffascod_sel ,
                                           AV101Ingenieria_menvwwds_10_tffascod ,
                                           AV103Ingenieria_menvwwds_12_tfmenvini ,
                                           AV104Ingenieria_menvwwds_13_tfmenvfin ,
                                           AV106Ingenieria_menvwwds_15_tfmenvint ,
                                           AV107Ingenieria_menvwwds_16_tfmenvint_to ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A14152MEnvOrd) ,
                                           A457FasCod ,
                                           A14158MEnvIni ,
                                           A14157MEnvFin ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV92Ingenieria_menvwwds_1_filterfulltext ,
                                           A14162MEnvInt ,
                                           Integer.valueOf(AV105Ingenieria_menvwwds_14_tfmenvest_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV97Ingenieria_menvwwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV97Ingenieria_menvwwds_6_tfbarcodpar), 1, "%") ;
      lV101Ingenieria_menvwwds_10_tffascod = GXutil.padr( GXutil.rtrim( AV101Ingenieria_menvwwds_10_tffascod), 8, "%") ;
      /* Using cursor P0AUS2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV105Ingenieria_menvwwds_14_tfmenvest_sels.size()), Integer.valueOf(AV93Ingenieria_menvwwds_2_tfbarcod), Integer.valueOf(AV94Ingenieria_menvwwds_3_tfbarcod_to), Byte.valueOf(AV95Ingenieria_menvwwds_4_tfbarcodreo), Byte.valueOf(AV96Ingenieria_menvwwds_5_tfbarcodreo_to), lV97Ingenieria_menvwwds_6_tfbarcodpar, AV98Ingenieria_menvwwds_7_tfbarcodpar_sel, Short.valueOf(AV99Ingenieria_menvwwds_8_tfmenvord), Short.valueOf(AV100Ingenieria_menvwwds_9_tfmenvord_to), lV101Ingenieria_menvwwds_10_tffascod, AV102Ingenieria_menvwwds_11_tffascod_sel, AV103Ingenieria_menvwwds_12_tfmenvini, AV104Ingenieria_menvwwds_13_tfmenvfin, AV106Ingenieria_menvwwds_15_tfmenvint, AV107Ingenieria_menvwwds_16_tfmenvint_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14162MEnvInt = P0AUS2_A14162MEnvInt[0] ;
         A457FasCod = P0AUS2_A457FasCod[0] ;
         A14152MEnvOrd = P0AUS2_A14152MEnvOrd[0] ;
         A130BarCodPar = P0AUS2_A130BarCodPar[0] ;
         A132BarCodReo = P0AUS2_A132BarCodReo[0] ;
         A129BarCod = P0AUS2_A129BarCod[0] ;
         A14156MEnvEst = P0AUS2_A14156MEnvEst[0] ;
         A14157MEnvFin = P0AUS2_A14157MEnvFin[0] ;
         A14158MEnvIni = P0AUS2_A14158MEnvIni[0] ;
         A396EmprCod = P0AUS2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV92Ingenieria_menvwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV92Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV92Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV92Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14152MEnvOrd, 4, 0) , GXutil.padr( "%" + AV92Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV92Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a procesar", ""), "") , GXutil.padr( "%" + GXutil.lower( AV92Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A14156MEnvEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "procesado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV92Ingenieria_menvwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A14156MEnvEst == 2 ) ) || ( GXutil.like( GXutil.str( A14162MEnvInt, 10, 2) , GXutil.padr( "%" + AV92Ingenieria_menvwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV65MEnvEstDescription = httpContext.getMessage( app.ingenieria.gxdomainestadosenvioparametros.getDescription(httpContext,(byte)A14156MEnvEst), "") ;
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
            hAUS0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 30, Gx_line+10, 102, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 106, Gx_line+10, 178, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 182, Gx_line+10, 254, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9")), 258, Gx_line+10, 330, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 334, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A14158MEnvIni, "99/99/99 99:99:99.999"), 410, Gx_line+10, 483, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A14157MEnvFin, "99/99/99 99:99"), 487, Gx_line+10, 560, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65MEnvEstDescription, "")), 564, Gx_line+10, 710, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A14162MEnvInt, "ZZZZZZ9.99")), 714, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue("Ingenieria.MEnvWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.MEnvWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("Ingenieria.MEnvWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV108GXV2 = 1 ;
      while ( AV108GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV108GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV20TFBarCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFBarCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV22TFBarCodReo = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFBarCodReo_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV24TFBarCodPar = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV25TFBarCodPar_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVORD") == 0 )
         {
            AV66TFMEnvOrd = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFMEnvOrd_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV68TFFasCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV69TFFasCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVINI") == 0 )
         {
            AV70TFMEnvIni = localUtil.ctot( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVFIN") == 0 )
         {
            AV72TFMEnvFin = localUtil.ctot( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVEST_SEL") == 0 )
         {
            AV74TFMEnvEst_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV76TFMEnvEst_Sels.fromJSonString(AV74TFMEnvEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMENVINT") == 0 )
         {
            AV78TFMEnvInt = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV79TFMEnvInt_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV108GXV2 = (int)(AV108GXV2+1) ;
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

   public void hAUS0( boolean bFoot ,
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
               AV52PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV49DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV54Title = AV87Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV54Title = "" ;
      AV12FilterFullText = "" ;
      AV34TFBarCod_To_Description = "" ;
      AV35TFBarCodReo_To_Description = "" ;
      AV25TFBarCodPar_Sel = "" ;
      AV24TFBarCodPar = "" ;
      AV80TFMEnvOrd_To_Description = "" ;
      AV69TFFasCod_Sel = "" ;
      AV68TFFasCod = "" ;
      AV70TFMEnvIni = GXutil.resetTime( GXutil.nullDate() );
      AV72TFMEnvFin = GXutil.resetTime( GXutil.nullDate() );
      AV76TFMEnvEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV74TFMEnvEst_SelsJson = "" ;
      AV75TFMEnvEst_SelDscs = "" ;
      AV83FilterTFMEnvEst_SelValueDescription = "" ;
      AV78TFMEnvInt = DecimalUtil.ZERO ;
      AV79TFMEnvInt_To = DecimalUtil.ZERO ;
      AV84TFMEnvInt_To_Description = "" ;
      A130BarCodPar = "" ;
      A457FasCod = "" ;
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      A14162MEnvInt = DecimalUtil.ZERO ;
      AV92Ingenieria_menvwwds_1_filterfulltext = "" ;
      AV97Ingenieria_menvwwds_6_tfbarcodpar = "" ;
      AV98Ingenieria_menvwwds_7_tfbarcodpar_sel = "" ;
      AV101Ingenieria_menvwwds_10_tffascod = "" ;
      AV102Ingenieria_menvwwds_11_tffascod_sel = "" ;
      AV103Ingenieria_menvwwds_12_tfmenvini = GXutil.resetTime( GXutil.nullDate() );
      AV104Ingenieria_menvwwds_13_tfmenvfin = GXutil.resetTime( GXutil.nullDate() );
      AV105Ingenieria_menvwwds_14_tfmenvest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV106Ingenieria_menvwwds_15_tfmenvint = DecimalUtil.ZERO ;
      AV107Ingenieria_menvwwds_16_tfmenvint_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV92Ingenieria_menvwwds_1_filterfulltext = "" ;
      lV97Ingenieria_menvwwds_6_tfbarcodpar = "" ;
      lV101Ingenieria_menvwwds_10_tffascod = "" ;
      P0AUS2_A14162MEnvInt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUS2_A457FasCod = new String[] {""} ;
      P0AUS2_A14152MEnvOrd = new short[1] ;
      P0AUS2_A130BarCodPar = new String[] {""} ;
      P0AUS2_A132BarCodReo = new byte[1] ;
      P0AUS2_A129BarCod = new int[1] ;
      P0AUS2_A14156MEnvEst = new byte[1] ;
      P0AUS2_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUS2_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUS2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV65MEnvEstDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52PageInfo = "" ;
      AV49DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV87Pgmdesc = "" ;
      AV47AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.menvwwexportreport__default(),
         new Object[] {
             new Object[] {
            P0AUS2_A14162MEnvInt, P0AUS2_A457FasCod, P0AUS2_A14152MEnvOrd, P0AUS2_A130BarCodPar, P0AUS2_A132BarCodReo, P0AUS2_A129BarCod, P0AUS2_A14156MEnvEst, P0AUS2_A14157MEnvFin, P0AUS2_A14158MEnvIni, P0AUS2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV87Pgmdesc = httpContext.getMessage( "MEnv WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV87Pgmdesc = httpContext.getMessage( "MEnv WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV22TFBarCodReo ;
   private byte AV23TFBarCodReo_To ;
   private byte AV77TFMEnvEst_Sel ;
   private byte A14156MEnvEst ;
   private byte A132BarCodReo ;
   private byte AV95Ingenieria_menvwwds_4_tfbarcodreo ;
   private byte AV96Ingenieria_menvwwds_5_tfbarcodreo_to ;
   private short gxcookieaux ;
   private short AV66TFMEnvOrd ;
   private short AV67TFMEnvOrd_To ;
   private short A14152MEnvOrd ;
   private short AV99Ingenieria_menvwwds_8_tfmenvord ;
   private short AV100Ingenieria_menvwwds_9_tfmenvord_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV20TFBarCod ;
   private int AV21TFBarCod_To ;
   private int AV90GXV1 ;
   private int A129BarCod ;
   private int AV93Ingenieria_menvwwds_2_tfbarcod ;
   private int AV94Ingenieria_menvwwds_3_tfbarcod_to ;
   private int AV105Ingenieria_menvwwds_14_tfmenvest_sels_size ;
   private int AV108GXV2 ;
   private long AV43i ;
   private java.math.BigDecimal AV78TFMEnvInt ;
   private java.math.BigDecimal AV79TFMEnvInt_To ;
   private java.math.BigDecimal A14162MEnvInt ;
   private java.math.BigDecimal AV106Ingenieria_menvwwds_15_tfmenvint ;
   private java.math.BigDecimal AV107Ingenieria_menvwwds_16_tfmenvint_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV25TFBarCodPar_Sel ;
   private String AV24TFBarCodPar ;
   private String AV69TFFasCod_Sel ;
   private String AV68TFFasCod ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String AV97Ingenieria_menvwwds_6_tfbarcodpar ;
   private String AV98Ingenieria_menvwwds_7_tfbarcodpar_sel ;
   private String AV101Ingenieria_menvwwds_10_tffascod ;
   private String AV102Ingenieria_menvwwds_11_tffascod_sel ;
   private String scmdbuf ;
   private String lV97Ingenieria_menvwwds_6_tfbarcodpar ;
   private String lV101Ingenieria_menvwwds_10_tffascod ;
   private String A396EmprCod ;
   private String AV87Pgmdesc ;
   private java.util.Date AV70TFMEnvIni ;
   private java.util.Date AV72TFMEnvFin ;
   private java.util.Date A14158MEnvIni ;
   private java.util.Date A14157MEnvFin ;
   private java.util.Date AV103Ingenieria_menvwwds_12_tfmenvini ;
   private java.util.Date AV104Ingenieria_menvwwds_13_tfmenvfin ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private String AV74TFMEnvEst_SelsJson ;
   private String AV54Title ;
   private String AV12FilterFullText ;
   private String AV34TFBarCod_To_Description ;
   private String AV35TFBarCodReo_To_Description ;
   private String AV80TFMEnvOrd_To_Description ;
   private String AV75TFMEnvEst_SelDscs ;
   private String AV83FilterTFMEnvEst_SelValueDescription ;
   private String AV84TFMEnvInt_To_Description ;
   private String AV92Ingenieria_menvwwds_1_filterfulltext ;
   private String lV92Ingenieria_menvwwds_1_filterfulltext ;
   private String AV65MEnvEstDescription ;
   private String AV52PageInfo ;
   private String AV49DateInfo ;
   private String AV47AppName ;
   private GXSimpleCollection<Byte> AV76TFMEnvEst_Sels ;
   private GXSimpleCollection<Byte> AV105Ingenieria_menvwwds_14_tfmenvest_sels ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0AUS2_A14162MEnvInt ;
   private String[] P0AUS2_A457FasCod ;
   private short[] P0AUS2_A14152MEnvOrd ;
   private String[] P0AUS2_A130BarCodPar ;
   private byte[] P0AUS2_A132BarCodReo ;
   private int[] P0AUS2_A129BarCod ;
   private byte[] P0AUS2_A14156MEnvEst ;
   private java.util.Date[] P0AUS2_A14157MEnvFin ;
   private java.util.Date[] P0AUS2_A14158MEnvIni ;
   private String[] P0AUS2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class menvwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AUS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A14156MEnvEst ,
                                          GXSimpleCollection<Byte> AV105Ingenieria_menvwwds_14_tfmenvest_sels ,
                                          int AV93Ingenieria_menvwwds_2_tfbarcod ,
                                          int AV94Ingenieria_menvwwds_3_tfbarcod_to ,
                                          byte AV95Ingenieria_menvwwds_4_tfbarcodreo ,
                                          byte AV96Ingenieria_menvwwds_5_tfbarcodreo_to ,
                                          String AV98Ingenieria_menvwwds_7_tfbarcodpar_sel ,
                                          String AV97Ingenieria_menvwwds_6_tfbarcodpar ,
                                          short AV99Ingenieria_menvwwds_8_tfmenvord ,
                                          short AV100Ingenieria_menvwwds_9_tfmenvord_to ,
                                          String AV102Ingenieria_menvwwds_11_tffascod_sel ,
                                          String AV101Ingenieria_menvwwds_10_tffascod ,
                                          java.util.Date AV103Ingenieria_menvwwds_12_tfmenvini ,
                                          java.util.Date AV104Ingenieria_menvwwds_13_tfmenvfin ,
                                          java.math.BigDecimal AV106Ingenieria_menvwwds_15_tfmenvint ,
                                          java.math.BigDecimal AV107Ingenieria_menvwwds_16_tfmenvint_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A14152MEnvOrd ,
                                          String A457FasCod ,
                                          java.util.Date A14158MEnvIni ,
                                          java.util.Date A14157MEnvFin ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV92Ingenieria_menvwwds_1_filterfulltext ,
                                          java.math.BigDecimal A14162MEnvInt ,
                                          int AV105Ingenieria_menvwwds_14_tfmenvest_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END AS MEnvInt, FasCod, MEnvOrd," ;
      scmdbuf += " BarCodPar, BarCodReo, BarCod, CASE  WHEN (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN 1 ELSE 2 END AS MEnvEst, MEnvFin, MEnvIni, EmprCod FROM TXPMEnv" ;
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV105Ingenieria_menvwwds_14_tfmenvest_sels, "CASE  WHEN (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN 1 ELSE 2 END IN (", ")")+"))");
      if ( ! (0==AV93Ingenieria_menvwwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV94Ingenieria_menvwwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV95Ingenieria_menvwwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV96Ingenieria_menvwwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Ingenieria_menvwwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV97Ingenieria_menvwwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ingenieria_menvwwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV99Ingenieria_menvwwds_8_tfmenvord) )
      {
         addWhere(sWhereString, "(MEnvOrd >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV100Ingenieria_menvwwds_9_tfmenvord_to) )
      {
         addWhere(sWhereString, "(MEnvOrd <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Ingenieria_menvwwds_11_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV101Ingenieria_menvwwds_10_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ingenieria_menvwwds_11_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(FasCod = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV103Ingenieria_menvwwds_12_tfmenvini) )
      {
         addWhere(sWhereString, "(MEnvIni >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV104Ingenieria_menvwwds_13_tfmenvfin) )
      {
         addWhere(sWhereString, "(MEnvFin >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Ingenieria_menvwwds_15_tfmenvint)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Ingenieria_menvwwds_16_tfmenvint_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (MEnvFin = TO_DATE('0001-01-01', 'YYYY-MM-DD')) THEN FLOOR((MEnvFin - CAST(MEnvIni AS DATE)) * 86400) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCodReo" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCodReo DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY BarCodPar" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarCodPar DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MEnvOrd" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MEnvOrd DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY FasCod" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY FasCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MEnvIni" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MEnvIni DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MEnvFin" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MEnvFin DESC" ;
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
                  return conditional_P0AUS2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9, true);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[26], false, true);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               return;
      }
   }

}

