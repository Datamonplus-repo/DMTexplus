package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_fasesexportreport_impl extends GXWebReport
{
   public consultadeproduccion_fasesexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV63Title = httpContext.getMessage( "Lista de Tabla BARFAS", "") ;
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
         h9ZB0( true, 0) ;
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
      if ( ! ( (0==AV23TFBarOrdLin) && (0==AV24TFBarOrdLin_To) ) )
      {
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFBarOrdLin), "ZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV45TFBarOrdLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Orden", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFBarOrdLin_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFBarOrdLin_To), "ZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFFasCod_Sel)==0) )
      {
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Fase", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFFasCod_Sel, "@!")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFFasCod)==0) )
         {
            h9ZB0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Fase", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFFasCod, "@!")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV28TFFasDsc_Sel)==0) )
      {
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion de Fase", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFFasDsc_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFFasDsc)==0) )
         {
            h9ZB0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion de Fase", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFFasDsc, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV30TFMaqCodBis_Sel)==0) )
      {
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFMaqCodBis_Sel, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFMaqCodBis)==0) )
         {
            h9ZB0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFMaqCodBis, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV31TFBarFasDTI) )
      {
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV31TFBarFasDTI, "99/99/99 99:99:99"), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarTieRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarTieRea_To)==0) ) )
      {
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "HhMm", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFBarTieRea, "Z9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFBarTieRea_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "HhMm", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFBarTieRea_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TFBarTieRea_To, "Z9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV39TFBarFasEst_Sels.fromJSonString(AV37TFBarFasEst_SelsJson, null);
      if ( ! ( AV39TFBarFasEst_Sels.size() == 0 ) )
      {
         AV52i = 1 ;
         AV95GXV1 = 1 ;
         while ( AV95GXV1 <= AV39TFBarFasEst_Sels.size() )
         {
            AV40TFBarFasEst_Sel = ((Number) AV39TFBarFasEst_Sels.elementAt(-1+AV95GXV1)).byteValue() ;
            if ( AV52i == 1 )
            {
               AV38TFBarFasEst_SelDscs = "" ;
            }
            else
            {
               AV38TFBarFasEst_SelDscs += ", " ;
            }
            AV49FilterTFBarFasEst_SelValueDescription = "" ;
            if ( AV40TFBarFasEst_Sel == 0 )
            {
               AV49FilterTFBarFasEst_SelValueDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( AV40TFBarFasEst_Sel == 1 )
            {
               AV49FilterTFBarFasEst_SelValueDescription = httpContext.getMessage( "En Proceso", "") ;
            }
            else if ( AV40TFBarFasEst_Sel == 2 )
            {
               AV49FilterTFBarFasEst_SelValueDescription = httpContext.getMessage( "Finalizada", "") ;
            }
            AV38TFBarFasEst_SelDscs += AV49FilterTFBarFasEst_SelValueDescription ;
            AV52i = (long)(AV52i+1) ;
            AV95GXV1 = (int)(AV95GXV1+1) ;
         }
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFBarFasEst_SelDscs, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarFasKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarFasKgm_To)==0) ) )
      {
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TFBarFasKgm, "ZZZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV50TFBarFasKgm_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kilos", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFBarFasKgm_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42TFBarFasKgm_To, "ZZZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarFasMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarFasMtr_To)==0) ) )
      {
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43TFBarFasMtr, "ZZZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV51TFBarFasMtr_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Metros", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFBarFasMtr_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44TFBarFasMtr_To, "ZZZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV68TFBarFasPri) && (0==AV69TFBarFasPri_To) ) )
      {
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "PP", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV68TFBarFasPri), "Z9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV70TFBarFasPri_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "PP", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9ZB0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFBarFasPri_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV69TFBarFasPri_To), "Z9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9ZB0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9ZB0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 30, Gx_line+10, 84, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Fase", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion de Fase", ""), 146, Gx_line+10, 200, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 204, Gx_line+10, 258, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion ", ""), 262, Gx_line+10, 316, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 320, Gx_line+10, 374, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 378, Gx_line+10, 432, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "HhMm", ""), 436, Gx_line+10, 491, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 495, Gx_line+10, 550, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 554, Gx_line+10, 609, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 613, Gx_line+10, 668, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 672, Gx_line+10, 728, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "PP", ""), 732, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A153BarFasEst) ,
                                              AV39TFBarFasEst_Sels ,
                                              Short.valueOf(AV23TFBarOrdLin) ,
                                              Short.valueOf(AV24TFBarOrdLin_To) ,
                                              AV26TFFasCod_Sel ,
                                              AV25TFFasCod ,
                                              AV28TFFasDsc_Sel ,
                                              AV27TFFasDsc ,
                                              AV30TFMaqCodBis_Sel ,
                                              AV29TFMaqCodBis ,
                                              AV31TFBarFasDTI ,
                                              AV35TFBarTieRea ,
                                              AV36TFBarTieRea_To ,
                                              Integer.valueOf(AV39TFBarFasEst_Sels.size()) ,
                                              AV41TFBarFasKgm ,
                                              AV42TFBarFasKgm_To ,
                                              AV43TFBarFasMtr ,
                                              AV44TFBarFasMtr_To ,
                                              Byte.valueOf(AV68TFBarFasPri) ,
                                              Byte.valueOf(AV69TFBarFasPri_To) ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A603MaqCodBis ,
                                              A4442BarFasDTI ,
                                              A215BarTieRea ,
                                              A3837BarFasKgm ,
                                              A3838BarFasMtr ,
                                              Byte.valueOf(A3836BarFasPri) ,
                                              Short.valueOf(AV14OrderedBy) ,
                                              Boolean.valueOf(AV15OrderedDsc) ,
                                              AV10EmprCod ,
                                              Integer.valueOf(AV11BarCod) ,
                                              Byte.valueOf(AV12BarCodReo) ,
                                              AV13BarCodPar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING
                                              }
         });
         lV25TFFasCod = GXutil.padr( GXutil.rtrim( AV25TFFasCod), 8, "%") ;
         lV27TFFasDsc = GXutil.padr( GXutil.rtrim( AV27TFFasDsc), 28, "%") ;
         lV29TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV29TFMaqCodBis), 6, "%") ;
         /* Using cursor P09ZB2 */
         pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Short.valueOf(AV23TFBarOrdLin), Short.valueOf(AV24TFBarOrdLin_To), lV25TFFasCod, AV26TFFasCod_Sel, lV27TFFasDsc, AV28TFFasDsc_Sel, lV29TFMaqCodBis, AV30TFMaqCodBis_Sel, AV31TFBarFasDTI, AV35TFBarTieRea, AV36TFBarTieRea_To, AV41TFBarFasKgm, AV42TFBarFasKgm_To, AV43TFBarFasMtr, AV44TFBarFasMtr_To, Byte.valueOf(AV68TFBarFasPri), Byte.valueOf(AV69TFBarFasPri_To)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A3836BarFasPri = P09ZB2_A3836BarFasPri[0] ;
            A3838BarFasMtr = P09ZB2_A3838BarFasMtr[0] ;
            n3838BarFasMtr = P09ZB2_n3838BarFasMtr[0] ;
            A3837BarFasKgm = P09ZB2_A3837BarFasKgm[0] ;
            n3837BarFasKgm = P09ZB2_n3837BarFasKgm[0] ;
            A153BarFasEst = P09ZB2_A153BarFasEst[0] ;
            A215BarTieRea = P09ZB2_A215BarTieRea[0] ;
            A4442BarFasDTI = P09ZB2_A4442BarFasDTI[0] ;
            n4442BarFasDTI = P09ZB2_n4442BarFasDTI[0] ;
            A603MaqCodBis = P09ZB2_A603MaqCodBis[0] ;
            A460FasDsc = P09ZB2_A460FasDsc[0] ;
            A457FasCod = P09ZB2_A457FasCod[0] ;
            A194BarOrdLin = P09ZB2_A194BarOrdLin[0] ;
            A130BarCodPar = P09ZB2_A130BarCodPar[0] ;
            A132BarCodReo = P09ZB2_A132BarCodReo[0] ;
            A129BarCod = P09ZB2_A129BarCod[0] ;
            A396EmprCod = P09ZB2_A396EmprCod[0] ;
            A4443BarFasDTF = P09ZB2_A4443BarFasDTF[0] ;
            n4443BarFasDTF = P09ZB2_n4443BarFasDTF[0] ;
            A148BarEstReo = P09ZB2_A148BarEstReo[0] ;
            A6173BarFasSec = P09ZB2_A6173BarFasSec[0] ;
            n6173BarFasSec = P09ZB2_n6173BarFasSec[0] ;
            A934BarReoCod = P09ZB2_A934BarReoCod[0] ;
            A936BarReoReo = P09ZB2_A936BarReoReo[0] ;
            A935BarReoPar = P09ZB2_A935BarReoPar[0] ;
            A758ProCod = P09ZB2_A758ProCod[0] ;
            A460FasDsc = P09ZB2_A460FasDsc[0] ;
            A148BarEstReo = P09ZB2_A148BarEstReo[0] ;
            A934BarReoCod = P09ZB2_A934BarReoCod[0] ;
            A936BarReoReo = P09ZB2_A936BarReoReo[0] ;
            A935BarReoPar = P09ZB2_A935BarReoPar[0] ;
            GXt_char2 = AV16MaqDsc ;
            GXv_char3[0] = A396EmprCod ;
            GXv_char4[0] = A603MaqCodBis ;
            GXv_char5[0] = GXt_char2 ;
            new app.pmaqdsc(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
            consultadeproduccion_fasesexportreport_impl.this.A396EmprCod = GXv_char3[0] ;
            consultadeproduccion_fasesexportreport_impl.this.A603MaqCodBis = GXv_char4[0] ;
            consultadeproduccion_fasesexportreport_impl.this.GXt_char2 = GXv_char5[0] ;
            AV16MaqDsc = GXt_char2 ;
            AV79BarFasDtF = "" ;
            if ( ( ( A153BarFasEst > 0 ) ) || ( ! (0==A3836BarFasPri) ) )
            {
               if ( ! GXutil.dateCompare(GXutil.nullDate(), A4442BarFasDTI) )
               {
                  AV79BarFasDtF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
            }
            if ( ( ( A153BarFasEst >= 2 ) ) || ( ! (0==A3836BarFasPri) ) )
            {
               AV79BarFasDtF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            GXt_int6 = AV78Lexmvh ;
            GXv_date7[0] = AV87ExHdrFeE ;
            GXv_date8[0] = AV88ExhdrFeR ;
            GXv_int9[0] = GXt_int6 ;
            new app.fasetrabajoexterior(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A457FasCod, GXv_date7, GXv_date8, GXv_int9) ;
            consultadeproduccion_fasesexportreport_impl.this.AV87ExHdrFeE = GXv_date7[0] ;
            consultadeproduccion_fasesexportreport_impl.this.AV88ExhdrFeR = GXv_date8[0] ;
            consultadeproduccion_fasesexportreport_impl.this.GXt_int6 = GXv_int9[0] ;
            AV78Lexmvh = GXt_int6 ;
            if ( AV89BarExt != 0 )
            {
               AV79BarFasDtF = (!GXutil.dateCompare(GXutil.nullDate(), A4443BarFasDTF) ? localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.dtoc( AV88ExhdrFeR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
            }
            AV17BarFasEstDescription = "" ;
            if ( A153BarFasEst == 0 )
            {
               AV17BarFasEstDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( A153BarFasEst == 1 )
            {
               AV17BarFasEstDescription = httpContext.getMessage( "En Proceso", "") ;
            }
            else if ( A153BarFasEst == 2 )
            {
               AV17BarFasEstDescription = httpContext.getMessage( "Finalizada", "") ;
            }
            if ( ( GXutil.strcmp(A6173BarFasSec, httpContext.getMessage( "OR", "")) == 0 ) && ( A148BarEstReo == 1 ) )
            {
               GXt_char2 = AV18OpeNom ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int10[0] = A934BarReoCod ;
               GXv_int11[0] = A936BarReoReo ;
               GXv_char4[0] = A935BarReoPar ;
               GXv_int9[0] = A194BarOrdLin ;
               GXv_char3[0] = GXt_char2 ;
               new app.pjln001(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int11, GXv_char4, GXv_int9, GXv_char3) ;
               consultadeproduccion_fasesexportreport_impl.this.A396EmprCod = GXv_char5[0] ;
               consultadeproduccion_fasesexportreport_impl.this.A934BarReoCod = GXv_int10[0] ;
               consultadeproduccion_fasesexportreport_impl.this.A936BarReoReo = GXv_int11[0] ;
               consultadeproduccion_fasesexportreport_impl.this.A935BarReoPar = GXv_char4[0] ;
               consultadeproduccion_fasesexportreport_impl.this.A194BarOrdLin = GXv_int9[0] ;
               consultadeproduccion_fasesexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
               AV18OpeNom = GXt_char2 ;
            }
            else
            {
               GXt_char2 = AV18OpeNom ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int10[0] = A129BarCod ;
               GXv_int11[0] = A132BarCodReo ;
               GXv_char4[0] = A130BarCodPar ;
               GXv_int9[0] = A194BarOrdLin ;
               GXv_char3[0] = GXt_char2 ;
               new app.pjln001(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int11, GXv_char4, GXv_int9, GXv_char3) ;
               consultadeproduccion_fasesexportreport_impl.this.A396EmprCod = GXv_char5[0] ;
               consultadeproduccion_fasesexportreport_impl.this.A129BarCod = GXv_int10[0] ;
               consultadeproduccion_fasesexportreport_impl.this.A132BarCodReo = GXv_int11[0] ;
               consultadeproduccion_fasesexportreport_impl.this.A130BarCodPar = GXv_char4[0] ;
               consultadeproduccion_fasesexportreport_impl.this.A194BarOrdLin = GXv_int9[0] ;
               consultadeproduccion_fasesexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
               AV18OpeNom = GXt_char2 ;
            }
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
            h9ZB0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")), 30, Gx_line+10, 84, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 146, Gx_line+10, 200, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), 204, Gx_line+10, 258, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16MaqDsc, "")), 262, Gx_line+10, 316, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"), 320, Gx_line+10, 374, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79BarFasDtF, "")), 378, Gx_line+10, 432, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")), 436, Gx_line+10, 491, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17BarFasEstDescription, "")), 495, Gx_line+10, 550, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3837BarFasKgm, "ZZZZZ9.99")), 554, Gx_line+10, 609, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3838BarFasMtr, "ZZZZZ9.99")), 613, Gx_line+10, 668, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18OpeNom, "")), 672, Gx_line+10, 728, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3836BarFasPri), "Z9")), 732, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      AV76TotBarFasKgm = DecimalUtil.doubleToDec(0) ;
      AV77TotBarFasMtr = DecimalUtil.doubleToDec(0) ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV39TFBarFasEst_Sels ,
                                           Short.valueOf(AV23TFBarOrdLin) ,
                                           Short.valueOf(AV24TFBarOrdLin_To) ,
                                           AV26TFFasCod_Sel ,
                                           AV25TFFasCod ,
                                           AV28TFFasDsc_Sel ,
                                           AV27TFFasDsc ,
                                           AV30TFMaqCodBis_Sel ,
                                           AV29TFMaqCodBis ,
                                           AV31TFBarFasDTI ,
                                           AV35TFBarTieRea ,
                                           AV36TFBarTieRea_To ,
                                           Integer.valueOf(AV39TFBarFasEst_Sels.size()) ,
                                           AV41TFBarFasKgm ,
                                           AV42TFBarFasKgm_To ,
                                           AV43TFBarFasMtr ,
                                           AV44TFBarFasMtr_To ,
                                           Byte.valueOf(AV68TFBarFasPri) ,
                                           Byte.valueOf(AV69TFBarFasPri_To) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A4442BarFasDTI ,
                                           A215BarTieRea ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Byte.valueOf(A3836BarFasPri) ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           AV10EmprCod ,
                                           Integer.valueOf(AV11BarCod) ,
                                           Byte.valueOf(AV12BarCodReo) ,
                                           AV13BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING
                                           }
      });
      lV25TFFasCod = GXutil.padr( GXutil.rtrim( AV25TFFasCod), 8, "%") ;
      lV27TFFasDsc = GXutil.padr( GXutil.rtrim( AV27TFFasDsc), 28, "%") ;
      lV29TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV29TFMaqCodBis), 6, "%") ;
      /* Using cursor P09ZB3 */
      pr_default.execute(1, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Short.valueOf(AV23TFBarOrdLin), Short.valueOf(AV24TFBarOrdLin_To), lV25TFFasCod, AV26TFFasCod_Sel, lV27TFFasDsc, AV28TFFasDsc_Sel, lV29TFMaqCodBis, AV30TFMaqCodBis_Sel, AV31TFBarFasDTI, AV35TFBarTieRea, AV36TFBarTieRea_To, AV41TFBarFasKgm, AV42TFBarFasKgm_To, AV43TFBarFasMtr, AV44TFBarFasMtr_To, Byte.valueOf(AV68TFBarFasPri), Byte.valueOf(AV69TFBarFasPri_To)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3836BarFasPri = P09ZB3_A3836BarFasPri[0] ;
         A3838BarFasMtr = P09ZB3_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P09ZB3_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P09ZB3_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P09ZB3_n3837BarFasKgm[0] ;
         A153BarFasEst = P09ZB3_A153BarFasEst[0] ;
         A215BarTieRea = P09ZB3_A215BarTieRea[0] ;
         A4442BarFasDTI = P09ZB3_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P09ZB3_n4442BarFasDTI[0] ;
         A603MaqCodBis = P09ZB3_A603MaqCodBis[0] ;
         A460FasDsc = P09ZB3_A460FasDsc[0] ;
         A457FasCod = P09ZB3_A457FasCod[0] ;
         A194BarOrdLin = P09ZB3_A194BarOrdLin[0] ;
         A130BarCodPar = P09ZB3_A130BarCodPar[0] ;
         A132BarCodReo = P09ZB3_A132BarCodReo[0] ;
         A129BarCod = P09ZB3_A129BarCod[0] ;
         A396EmprCod = P09ZB3_A396EmprCod[0] ;
         A148BarEstReo = P09ZB3_A148BarEstReo[0] ;
         A6173BarFasSec = P09ZB3_A6173BarFasSec[0] ;
         n6173BarFasSec = P09ZB3_n6173BarFasSec[0] ;
         A934BarReoCod = P09ZB3_A934BarReoCod[0] ;
         A936BarReoReo = P09ZB3_A936BarReoReo[0] ;
         A935BarReoPar = P09ZB3_A935BarReoPar[0] ;
         A758ProCod = P09ZB3_A758ProCod[0] ;
         A460FasDsc = P09ZB3_A460FasDsc[0] ;
         A148BarEstReo = P09ZB3_A148BarEstReo[0] ;
         A934BarReoCod = P09ZB3_A934BarReoCod[0] ;
         A936BarReoReo = P09ZB3_A936BarReoReo[0] ;
         A935BarReoPar = P09ZB3_A935BarReoPar[0] ;
         GXt_char2 = AV16MaqDsc ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A603MaqCodBis ;
         GXv_char3[0] = GXt_char2 ;
         new app.pmaqdsc(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         consultadeproduccion_fasesexportreport_impl.this.A396EmprCod = GXv_char5[0] ;
         consultadeproduccion_fasesexportreport_impl.this.A603MaqCodBis = GXv_char4[0] ;
         consultadeproduccion_fasesexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
         AV16MaqDsc = GXt_char2 ;
         AV17BarFasEstDescription = "" ;
         if ( A153BarFasEst == 0 )
         {
            AV17BarFasEstDescription = httpContext.getMessage( "Pendiente", "") ;
         }
         else if ( A153BarFasEst == 1 )
         {
            AV17BarFasEstDescription = httpContext.getMessage( "En Proceso", "") ;
         }
         else if ( A153BarFasEst == 2 )
         {
            AV17BarFasEstDescription = httpContext.getMessage( "Finalizada", "") ;
         }
         if ( ( GXutil.strcmp(A6173BarFasSec, httpContext.getMessage( "OR", "")) == 0 ) && ( A148BarEstReo == 1 ) )
         {
            GXt_char2 = AV18OpeNom ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int10[0] = A934BarReoCod ;
            GXv_int11[0] = A936BarReoReo ;
            GXv_char4[0] = A935BarReoPar ;
            GXv_int9[0] = A194BarOrdLin ;
            GXv_char3[0] = GXt_char2 ;
            new app.pjln001(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int11, GXv_char4, GXv_int9, GXv_char3) ;
            consultadeproduccion_fasesexportreport_impl.this.A396EmprCod = GXv_char5[0] ;
            consultadeproduccion_fasesexportreport_impl.this.A934BarReoCod = GXv_int10[0] ;
            consultadeproduccion_fasesexportreport_impl.this.A936BarReoReo = GXv_int11[0] ;
            consultadeproduccion_fasesexportreport_impl.this.A935BarReoPar = GXv_char4[0] ;
            consultadeproduccion_fasesexportreport_impl.this.A194BarOrdLin = GXv_int9[0] ;
            consultadeproduccion_fasesexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
            AV18OpeNom = GXt_char2 ;
         }
         else
         {
            GXt_char2 = AV18OpeNom ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int10[0] = A129BarCod ;
            GXv_int11[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int9[0] = A194BarOrdLin ;
            GXv_char3[0] = GXt_char2 ;
            new app.pjln001(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int11, GXv_char4, GXv_int9, GXv_char3) ;
            consultadeproduccion_fasesexportreport_impl.this.A396EmprCod = GXv_char5[0] ;
            consultadeproduccion_fasesexportreport_impl.this.A129BarCod = GXv_int10[0] ;
            consultadeproduccion_fasesexportreport_impl.this.A132BarCodReo = GXv_int11[0] ;
            consultadeproduccion_fasesexportreport_impl.this.A130BarCodPar = GXv_char4[0] ;
            consultadeproduccion_fasesexportreport_impl.this.A194BarOrdLin = GXv_int9[0] ;
            consultadeproduccion_fasesexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
            AV18OpeNom = GXt_char2 ;
         }
         AV76TotBarFasKgm = AV76TotBarFasKgm.add(A3837BarFasKgm) ;
         AV77TotBarFasMtr = AV77TotBarFasMtr.add(A3838BarFasMtr) ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         h9ZB0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")), 30, Gx_line+10, 84, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 146, Gx_line+10, 200, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), 204, Gx_line+10, 258, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16MaqDsc, "")), 262, Gx_line+10, 316, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"), 320, Gx_line+10, 374, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79BarFasDtF, "")), 378, Gx_line+10, 432, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")), 436, Gx_line+10, 491, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17BarFasEstDescription, "")), 495, Gx_line+10, 550, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3837BarFasKgm, "ZZZZZ9.99")), 554, Gx_line+10, 609, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3838BarFasMtr, "ZZZZZ9.99")), 613, Gx_line+10, 668, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18OpeNom, "")), 672, Gx_line+10, 728, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3836BarFasPri), "Z9")), 732, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ConsultadeProduccion_FasesGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultadeProduccion_FasesGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ConsultadeProduccion_FasesGridState"), null, null);
      }
      AV14OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV15OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV98GXV2 = 1 ;
      while ( AV98GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV23TFBarOrdLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFBarOrdLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV25TFFasCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV26TFFasCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV27TFFasDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV28TFFasDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV29TFMaqCodBis = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV30TFMaqCodBis_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV31TFBarFasDTI = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV35TFBarTieRea = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV36TFBarTieRea_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV37TFBarFasEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV39TFBarFasEst_Sels.fromJSonString(AV37TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV41TFBarFasKgm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFBarFasKgm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV43TFBarFasMtr = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFBarFasMtr_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASPRI") == 0 )
         {
            AV68TFBarFasPri = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFBarFasPri_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10EmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV11BarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV12BarCodReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV13BarCodPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV80Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV81CliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV82PedidoCliente = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV83Barser = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV84BarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV85Barcolnom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV86Barcolnum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV98GXV2 = (int)(AV98GXV2+1) ;
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

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'CARGADATOSCABECERA' Routine */
      returnInSub = false ;
      GXt_char2 = AV74Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      consultadeproduccion_fasesexportreport_impl.this.GXt_char2 = GXv_char5[0] ;
      AV74Station = GXt_char2 ;
      GXv_char5[0] = AV10EmprCod ;
      GXv_char4[0] = AV73EmprNom ;
      GXv_char3[0] = AV75UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV74Station, GXv_char5, GXv_char4, GXv_char3) ;
      consultadeproduccion_fasesexportreport_impl.this.AV10EmprCod = GXv_char5[0] ;
      consultadeproduccion_fasesexportreport_impl.this.AV73EmprNom = GXv_char4[0] ;
      consultadeproduccion_fasesexportreport_impl.this.AV75UsurCod = GXv_char3[0] ;
   }

   public void h9ZB0( boolean bFoot ,
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
            AV63Title = AV92Pgmdesc ;
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
      AV45TFBarOrdLin_To_Description = "" ;
      AV26TFFasCod_Sel = "" ;
      AV25TFFasCod = "" ;
      AV28TFFasDsc_Sel = "" ;
      AV27TFFasDsc = "" ;
      AV30TFMaqCodBis_Sel = "" ;
      AV29TFMaqCodBis = "" ;
      AV31TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV35TFBarTieRea = DecimalUtil.ZERO ;
      AV36TFBarTieRea_To = DecimalUtil.ZERO ;
      AV48TFBarTieRea_To_Description = "" ;
      AV39TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV37TFBarFasEst_SelsJson = "" ;
      AV38TFBarFasEst_SelDscs = "" ;
      AV49FilterTFBarFasEst_SelValueDescription = "" ;
      AV41TFBarFasKgm = DecimalUtil.ZERO ;
      AV42TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV50TFBarFasKgm_To_Description = "" ;
      AV43TFBarFasMtr = DecimalUtil.ZERO ;
      AV44TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV51TFBarFasMtr_To_Description = "" ;
      AV70TFBarFasPri_To_Description = "" ;
      scmdbuf = "" ;
      lV25TFFasCod = "" ;
      lV27TFFasDsc = "" ;
      lV29TFMaqCodBis = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      AV10EmprCod = "" ;
      AV13BarCodPar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09ZB2_A3836BarFasPri = new byte[1] ;
      P09ZB2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZB2_n3838BarFasMtr = new boolean[] {false} ;
      P09ZB2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZB2_n3837BarFasKgm = new boolean[] {false} ;
      P09ZB2_A153BarFasEst = new byte[1] ;
      P09ZB2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZB2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZB2_n4442BarFasDTI = new boolean[] {false} ;
      P09ZB2_A603MaqCodBis = new String[] {""} ;
      P09ZB2_A460FasDsc = new String[] {""} ;
      P09ZB2_A457FasCod = new String[] {""} ;
      P09ZB2_A194BarOrdLin = new short[1] ;
      P09ZB2_A130BarCodPar = new String[] {""} ;
      P09ZB2_A132BarCodReo = new byte[1] ;
      P09ZB2_A129BarCod = new int[1] ;
      P09ZB2_A396EmprCod = new String[] {""} ;
      P09ZB2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZB2_n4443BarFasDTF = new boolean[] {false} ;
      P09ZB2_A148BarEstReo = new byte[1] ;
      P09ZB2_A6173BarFasSec = new String[] {""} ;
      P09ZB2_n6173BarFasSec = new boolean[] {false} ;
      P09ZB2_A934BarReoCod = new int[1] ;
      P09ZB2_A936BarReoReo = new byte[1] ;
      P09ZB2_A935BarReoPar = new String[] {""} ;
      P09ZB2_A758ProCod = new String[] {""} ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A6173BarFasSec = "" ;
      A935BarReoPar = "" ;
      A758ProCod = "" ;
      AV16MaqDsc = "" ;
      AV79BarFasDtF = "" ;
      AV87ExHdrFeE = GXutil.nullDate() ;
      GXv_date7 = new java.util.Date[1] ;
      AV88ExhdrFeR = GXutil.nullDate() ;
      GXv_date8 = new java.util.Date[1] ;
      AV17BarFasEstDescription = "" ;
      AV18OpeNom = "" ;
      AV76TotBarFasKgm = DecimalUtil.ZERO ;
      AV77TotBarFasMtr = DecimalUtil.ZERO ;
      P09ZB3_A3836BarFasPri = new byte[1] ;
      P09ZB3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZB3_n3838BarFasMtr = new boolean[] {false} ;
      P09ZB3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZB3_n3837BarFasKgm = new boolean[] {false} ;
      P09ZB3_A153BarFasEst = new byte[1] ;
      P09ZB3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZB3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZB3_n4442BarFasDTI = new boolean[] {false} ;
      P09ZB3_A603MaqCodBis = new String[] {""} ;
      P09ZB3_A460FasDsc = new String[] {""} ;
      P09ZB3_A457FasCod = new String[] {""} ;
      P09ZB3_A194BarOrdLin = new short[1] ;
      P09ZB3_A130BarCodPar = new String[] {""} ;
      P09ZB3_A132BarCodReo = new byte[1] ;
      P09ZB3_A129BarCod = new int[1] ;
      P09ZB3_A396EmprCod = new String[] {""} ;
      P09ZB3_A148BarEstReo = new byte[1] ;
      P09ZB3_A6173BarFasSec = new String[] {""} ;
      P09ZB3_n6173BarFasSec = new boolean[] {false} ;
      P09ZB3_A934BarReoCod = new int[1] ;
      P09ZB3_A936BarReoReo = new byte[1] ;
      P09ZB3_A935BarReoPar = new String[] {""} ;
      P09ZB3_A758ProCod = new String[] {""} ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int9 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV81CliNom = "" ;
      AV82PedidoCliente = "" ;
      AV83Barser = "" ;
      AV84BarSerDsc = "" ;
      AV85Barcolnom = "" ;
      AV74Station = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV73EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV75UsurCod = "" ;
      GXv_char3 = new String[1] ;
      AV61PageInfo = "" ;
      AV58DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV92Pgmdesc = "" ;
      AV56AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_fasesexportreport__default(),
         new Object[] {
             new Object[] {
            P09ZB2_A3836BarFasPri, P09ZB2_A3838BarFasMtr, P09ZB2_n3838BarFasMtr, P09ZB2_A3837BarFasKgm, P09ZB2_n3837BarFasKgm, P09ZB2_A153BarFasEst, P09ZB2_A215BarTieRea, P09ZB2_A4442BarFasDTI, P09ZB2_n4442BarFasDTI, P09ZB2_A603MaqCodBis,
            P09ZB2_A460FasDsc, P09ZB2_A457FasCod, P09ZB2_A194BarOrdLin, P09ZB2_A130BarCodPar, P09ZB2_A132BarCodReo, P09ZB2_A129BarCod, P09ZB2_A396EmprCod, P09ZB2_A4443BarFasDTF, P09ZB2_n4443BarFasDTF, P09ZB2_A148BarEstReo,
            P09ZB2_A6173BarFasSec, P09ZB2_n6173BarFasSec, P09ZB2_A934BarReoCod, P09ZB2_A936BarReoReo, P09ZB2_A935BarReoPar, P09ZB2_A758ProCod
            }
            , new Object[] {
            P09ZB3_A3836BarFasPri, P09ZB3_A3838BarFasMtr, P09ZB3_n3838BarFasMtr, P09ZB3_A3837BarFasKgm, P09ZB3_n3837BarFasKgm, P09ZB3_A153BarFasEst, P09ZB3_A215BarTieRea, P09ZB3_A4442BarFasDTI, P09ZB3_n4442BarFasDTI, P09ZB3_A603MaqCodBis,
            P09ZB3_A460FasDsc, P09ZB3_A457FasCod, P09ZB3_A194BarOrdLin, P09ZB3_A130BarCodPar, P09ZB3_A132BarCodReo, P09ZB3_A129BarCod, P09ZB3_A396EmprCod, P09ZB3_A148BarEstReo, P09ZB3_A6173BarFasSec, P09ZB3_n6173BarFasSec,
            P09ZB3_A934BarReoCod, P09ZB3_A936BarReoReo, P09ZB3_A935BarReoPar, P09ZB3_A758ProCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV92Pgmdesc = httpContext.getMessage( "Informe de Consulta Producción por Fase", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV92Pgmdesc = httpContext.getMessage( "Informe de Consulta Producción por Fase", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV40TFBarFasEst_Sel ;
   private byte AV68TFBarFasPri ;
   private byte AV69TFBarFasPri_To ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte AV12BarCodReo ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A936BarReoReo ;
   private byte AV89BarExt ;
   private byte GXv_int11[] ;
   private short gxcookieaux ;
   private short AV23TFBarOrdLin ;
   private short AV24TFBarOrdLin_To ;
   private short A194BarOrdLin ;
   private short AV14OrderedBy ;
   private short AV78Lexmvh ;
   private short GXt_int6 ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV95GXV1 ;
   private int AV39TFBarFasEst_Sels_size ;
   private int AV11BarCod ;
   private int A129BarCod ;
   private int A934BarReoCod ;
   private int GXv_int10[] ;
   private int AV98GXV2 ;
   private int AV80Clicod ;
   private int AV86Barcolnum ;
   private long AV52i ;
   private java.math.BigDecimal AV35TFBarTieRea ;
   private java.math.BigDecimal AV36TFBarTieRea_To ;
   private java.math.BigDecimal AV41TFBarFasKgm ;
   private java.math.BigDecimal AV42TFBarFasKgm_To ;
   private java.math.BigDecimal AV43TFBarFasMtr ;
   private java.math.BigDecimal AV44TFBarFasMtr_To ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV76TotBarFasKgm ;
   private java.math.BigDecimal AV77TotBarFasMtr ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV26TFFasCod_Sel ;
   private String AV25TFFasCod ;
   private String AV28TFFasDsc_Sel ;
   private String AV27TFFasDsc ;
   private String AV30TFMaqCodBis_Sel ;
   private String AV29TFMaqCodBis ;
   private String scmdbuf ;
   private String lV25TFFasCod ;
   private String lV27TFFasDsc ;
   private String lV29TFMaqCodBis ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String AV10EmprCod ;
   private String AV13BarCodPar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A6173BarFasSec ;
   private String A935BarReoPar ;
   private String A758ProCod ;
   private String AV16MaqDsc ;
   private String AV79BarFasDtF ;
   private String AV18OpeNom ;
   private String AV81CliNom ;
   private String AV82PedidoCliente ;
   private String AV83Barser ;
   private String AV84BarSerDsc ;
   private String AV85Barcolnom ;
   private String AV74Station ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String AV73EmprNom ;
   private String GXv_char4[] ;
   private String AV75UsurCod ;
   private String GXv_char3[] ;
   private String AV92Pgmdesc ;
   private java.util.Date AV31TFBarFasDTI ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV87ExHdrFeE ;
   private java.util.Date GXv_date7[] ;
   private java.util.Date AV88ExhdrFeR ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV15OrderedDsc ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n6173BarFasSec ;
   private String AV37TFBarFasEst_SelsJson ;
   private String AV63Title ;
   private String AV45TFBarOrdLin_To_Description ;
   private String AV48TFBarTieRea_To_Description ;
   private String AV38TFBarFasEst_SelDscs ;
   private String AV49FilterTFBarFasEst_SelValueDescription ;
   private String AV50TFBarFasKgm_To_Description ;
   private String AV51TFBarFasMtr_To_Description ;
   private String AV70TFBarFasPri_To_Description ;
   private String AV17BarFasEstDescription ;
   private String AV61PageInfo ;
   private String AV58DateInfo ;
   private String AV56AppName ;
   private GXSimpleCollection<Byte> AV39TFBarFasEst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private IDataStoreProvider pr_default ;
   private byte[] P09ZB2_A3836BarFasPri ;
   private java.math.BigDecimal[] P09ZB2_A3838BarFasMtr ;
   private boolean[] P09ZB2_n3838BarFasMtr ;
   private java.math.BigDecimal[] P09ZB2_A3837BarFasKgm ;
   private boolean[] P09ZB2_n3837BarFasKgm ;
   private byte[] P09ZB2_A153BarFasEst ;
   private java.math.BigDecimal[] P09ZB2_A215BarTieRea ;
   private java.util.Date[] P09ZB2_A4442BarFasDTI ;
   private boolean[] P09ZB2_n4442BarFasDTI ;
   private String[] P09ZB2_A603MaqCodBis ;
   private String[] P09ZB2_A460FasDsc ;
   private String[] P09ZB2_A457FasCod ;
   private short[] P09ZB2_A194BarOrdLin ;
   private String[] P09ZB2_A130BarCodPar ;
   private byte[] P09ZB2_A132BarCodReo ;
   private int[] P09ZB2_A129BarCod ;
   private String[] P09ZB2_A396EmprCod ;
   private java.util.Date[] P09ZB2_A4443BarFasDTF ;
   private boolean[] P09ZB2_n4443BarFasDTF ;
   private byte[] P09ZB2_A148BarEstReo ;
   private String[] P09ZB2_A6173BarFasSec ;
   private boolean[] P09ZB2_n6173BarFasSec ;
   private int[] P09ZB2_A934BarReoCod ;
   private byte[] P09ZB2_A936BarReoReo ;
   private String[] P09ZB2_A935BarReoPar ;
   private String[] P09ZB2_A758ProCod ;
   private byte[] P09ZB3_A3836BarFasPri ;
   private java.math.BigDecimal[] P09ZB3_A3838BarFasMtr ;
   private boolean[] P09ZB3_n3838BarFasMtr ;
   private java.math.BigDecimal[] P09ZB3_A3837BarFasKgm ;
   private boolean[] P09ZB3_n3837BarFasKgm ;
   private byte[] P09ZB3_A153BarFasEst ;
   private java.math.BigDecimal[] P09ZB3_A215BarTieRea ;
   private java.util.Date[] P09ZB3_A4442BarFasDTI ;
   private boolean[] P09ZB3_n4442BarFasDTI ;
   private String[] P09ZB3_A603MaqCodBis ;
   private String[] P09ZB3_A460FasDsc ;
   private String[] P09ZB3_A457FasCod ;
   private short[] P09ZB3_A194BarOrdLin ;
   private String[] P09ZB3_A130BarCodPar ;
   private byte[] P09ZB3_A132BarCodReo ;
   private int[] P09ZB3_A129BarCod ;
   private String[] P09ZB3_A396EmprCod ;
   private byte[] P09ZB3_A148BarEstReo ;
   private String[] P09ZB3_A6173BarFasSec ;
   private boolean[] P09ZB3_n6173BarFasSec ;
   private int[] P09ZB3_A934BarReoCod ;
   private byte[] P09ZB3_A936BarReoReo ;
   private String[] P09ZB3_A935BarReoPar ;
   private String[] P09ZB3_A758ProCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class consultadeproduccion_fasesexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09ZB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV39TFBarFasEst_Sels ,
                                          short AV23TFBarOrdLin ,
                                          short AV24TFBarOrdLin_To ,
                                          String AV26TFFasCod_Sel ,
                                          String AV25TFFasCod ,
                                          String AV28TFFasDsc_Sel ,
                                          String AV27TFFasDsc ,
                                          String AV30TFMaqCodBis_Sel ,
                                          String AV29TFMaqCodBis ,
                                          java.util.Date AV31TFBarFasDTI ,
                                          java.math.BigDecimal AV35TFBarTieRea ,
                                          java.math.BigDecimal AV36TFBarTieRea_To ,
                                          int AV39TFBarFasEst_Sels_size ,
                                          java.math.BigDecimal AV41TFBarFasKgm ,
                                          java.math.BigDecimal AV42TFBarFasKgm_To ,
                                          java.math.BigDecimal AV43TFBarFasMtr ,
                                          java.math.BigDecimal AV44TFBarFasMtr_To ,
                                          byte AV68TFBarFasPri ,
                                          byte AV69TFBarFasPri_To ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV10EmprCod ,
                                          int AV11BarCod ,
                                          byte AV12BarCodReo ,
                                          String AV13BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[21];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T1.BarFasDTF, T3.BarEstReo, T1.BarFasSec, T3.BarReoCod, T3.BarReoReo, T3.BarReoPar, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV23TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV26TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV25TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV28TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV27TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV30TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV29TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV31TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarTieRea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarTieRea_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( AV39TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV39TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarFasKgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarFasKgm_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarFasMtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarFasMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (0==AV68TFBarFasPri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV69TFBarFasPri_To) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.FasDsc DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasDTI" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasDTI DESC" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieRea" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasEst DESC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasKgm" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasKgm DESC" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasMtr" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasMtr DESC" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasPri DESC" ;
      }
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09ZB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV39TFBarFasEst_Sels ,
                                          short AV23TFBarOrdLin ,
                                          short AV24TFBarOrdLin_To ,
                                          String AV26TFFasCod_Sel ,
                                          String AV25TFFasCod ,
                                          String AV28TFFasDsc_Sel ,
                                          String AV27TFFasDsc ,
                                          String AV30TFMaqCodBis_Sel ,
                                          String AV29TFMaqCodBis ,
                                          java.util.Date AV31TFBarFasDTI ,
                                          java.math.BigDecimal AV35TFBarTieRea ,
                                          java.math.BigDecimal AV36TFBarTieRea_To ,
                                          int AV39TFBarFasEst_Sels_size ,
                                          java.math.BigDecimal AV41TFBarFasKgm ,
                                          java.math.BigDecimal AV42TFBarFasKgm_To ,
                                          java.math.BigDecimal AV43TFBarFasMtr ,
                                          java.math.BigDecimal AV44TFBarFasMtr_To ,
                                          byte AV68TFBarFasPri ,
                                          byte AV69TFBarFasPri_To ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          byte A3836BarFasPri ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV10EmprCod ,
                                          int AV11BarCod ,
                                          byte AV12BarCodReo ,
                                          String AV13BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[21];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod, T3.BarEstReo, T1.BarFasSec, T3.BarReoCod, T3.BarReoReo, T3.BarReoPar, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV23TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV26TFFasCod_Sel)==0) && ( ! (GXutil.strcmp("", AV25TFFasCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFFasCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV28TFFasDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV27TFFasDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV28TFFasDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV30TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV29TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV31TFBarFasDTI) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarTieRea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarTieRea_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( AV39TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV39TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarFasKgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarFasKgm_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarFasMtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarFasMtr_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (0==AV68TFBarFasPri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (0==AV69TFBarFasPri_To) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.FasDsc DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasDTI" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasDTI DESC" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieRea" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasEst DESC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasKgm" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasKgm DESC" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasMtr" ;
      }
      else if ( ( AV14OrderedBy == 9 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasMtr DESC" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri" ;
      }
      else if ( ( AV14OrderedBy == 10 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarFasPri DESC" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
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
                  return conditional_P09ZB2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] );
            case 1 :
                  return conditional_P09ZB3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ZB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               ((String[]) buf[10])[0] = rslt.getString(8, 28);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 3);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((String[]) buf[20])[0] = rslt.getString(17, 2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((String[]) buf[24])[0] = rslt.getString(20, 1);
               ((String[]) buf[25])[0] = rslt.getString(21, 8);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               ((String[]) buf[10])[0] = rslt.getString(8, 28);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 3);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((byte[]) buf[21])[0] = rslt.getByte(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 1);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
      }
   }

}

