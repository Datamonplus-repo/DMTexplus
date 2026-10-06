package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_fasesfullexportreport_impl extends GXWebReport
{
   public consultadeproduccion_fasesfullexportreport_impl( com.genexus.internet.HttpContext context )
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
         hA3Z0( true, 0) ;
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
         hA3Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFBarOrdLin), "ZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV45TFBarOrdLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Orden", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA3Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFBarOrdLin_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFBarOrdLin_To), "ZZZ9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFFasCod_Sel)==0) )
      {
         hA3Z0( false, 20) ;
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
            hA3Z0( false, 20) ;
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
         hA3Z0( false, 20) ;
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
            hA3Z0( false, 20) ;
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
         hA3Z0( false, 20) ;
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
            hA3Z0( false, 20) ;
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
         hA3Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV31TFBarFasDTI, "99/99/99 99:99:99"), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarTieRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarTieRea_To)==0) ) )
      {
         hA3Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "HhMm", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFBarTieRea, "Z9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFBarTieRea_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "HhMm", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA3Z0( false, 20) ;
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
         AV88GXV1 = 1 ;
         while ( AV88GXV1 <= AV39TFBarFasEst_Sels.size() )
         {
            AV40TFBarFasEst_Sel = ((Number) AV39TFBarFasEst_Sels.elementAt(-1+AV88GXV1)).byteValue() ;
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
            AV88GXV1 = (int)(AV88GXV1+1) ;
         }
         hA3Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFBarFasEst_SelDscs, "")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarFasKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarFasKgm_To)==0) ) )
      {
         hA3Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41TFBarFasKgm, "ZZZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV50TFBarFasKgm_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidades", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA3Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFBarFasKgm_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV42TFBarFasKgm_To, "ZZZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarFasMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarFasMtr_To)==0) ) )
      {
         hA3Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43TFBarFasMtr, "ZZZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV51TFBarFasMtr_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Metros", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA3Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFBarFasMtr_To_Description, "")), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44TFBarFasMtr_To, "ZZZZZ9.99")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV68TFBarFasPri) && (0==AV69TFBarFasPri_To) ) )
      {
         hA3Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "PP", ""), 25, Gx_line+0, 133, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV68TFBarFasPri), "Z9")), 133, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV70TFBarFasPri_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "PP", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA3Z0( false, 20) ;
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
      hA3Z0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA3Z0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 30, Gx_line+10, 90, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Fase", ""), 94, Gx_line+10, 154, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion de Fase", ""), 158, Gx_line+10, 278, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 282, Gx_line+10, 342, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 346, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 410, Gx_line+10, 470, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "HhMm", ""), 474, Gx_line+10, 534, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "E", ""), 538, Gx_line+10, 598, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 602, Gx_line+10, 662, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 666, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV90Consultadeproduccion_fasesfullds_1_emprcod = AV10EmprCod ;
         AV91Consultadeproduccion_fasesfullds_2_barcod = AV11BarCod ;
         AV92Consultadeproduccion_fasesfullds_3_barcodreo = AV12BarCodReo ;
         AV93Consultadeproduccion_fasesfullds_4_barcodpar = AV13BarCodPar ;
         AV94Consultadeproduccion_fasesfullds_5_tfbarordlin = AV23TFBarOrdLin ;
         AV95Consultadeproduccion_fasesfullds_6_tfbarordlin_to = AV24TFBarOrdLin_To ;
         AV96Consultadeproduccion_fasesfullds_7_tffascod = AV25TFFasCod ;
         AV97Consultadeproduccion_fasesfullds_8_tffascod_sel = AV26TFFasCod_Sel ;
         AV98Consultadeproduccion_fasesfullds_9_tffasdsc = AV27TFFasDsc ;
         AV99Consultadeproduccion_fasesfullds_10_tffasdsc_sel = AV28TFFasDsc_Sel ;
         AV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis = AV29TFMaqCodBis ;
         AV101Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = AV30TFMaqCodBis_Sel ;
         AV102Consultadeproduccion_fasesfullds_13_tfbarfasdti = AV31TFBarFasDTI ;
         AV103Consultadeproduccion_fasesfullds_14_tfbartierea = AV35TFBarTieRea ;
         AV104Consultadeproduccion_fasesfullds_15_tfbartierea_to = AV36TFBarTieRea_To ;
         AV105Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = AV39TFBarFasEst_Sels ;
         AV106Consultadeproduccion_fasesfullds_17_tfbarfaskgm = AV41TFBarFasKgm ;
         AV107Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = AV42TFBarFasKgm_To ;
         AV108Consultadeproduccion_fasesfullds_19_tfbarfasmtr = AV43TFBarFasMtr ;
         AV109Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = AV44TFBarFasMtr_To ;
         AV110Consultadeproduccion_fasesfullds_21_tfbarfaspri = AV68TFBarFasPri ;
         AV111Consultadeproduccion_fasesfullds_22_tfbarfaspri_to = AV69TFBarFasPri_To ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A153BarFasEst) ,
                                              AV105Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                              Short.valueOf(AV94Consultadeproduccion_fasesfullds_5_tfbarordlin) ,
                                              Short.valueOf(AV95Consultadeproduccion_fasesfullds_6_tfbarordlin_to) ,
                                              AV97Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                              AV96Consultadeproduccion_fasesfullds_7_tffascod ,
                                              AV99Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                              AV98Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                              AV101Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                              AV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                              AV102Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                              AV103Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                              AV104Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                              Integer.valueOf(AV105Consultadeproduccion_fasesfullds_16_tfbarfasest_sels.size()) ,
                                              AV106Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                              AV107Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                              AV108Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                              AV109Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                              Byte.valueOf(AV110Consultadeproduccion_fasesfullds_21_tfbarfaspri) ,
                                              Byte.valueOf(AV111Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) ,
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
                                              A396EmprCod ,
                                              AV10EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV11BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV12BarCodReo) ,
                                              A130BarCodPar ,
                                              AV13BarCodPar ,
                                              AV90Consultadeproduccion_fasesfullds_1_emprcod ,
                                              Integer.valueOf(AV91Consultadeproduccion_fasesfullds_2_barcod) ,
                                              Byte.valueOf(AV92Consultadeproduccion_fasesfullds_3_barcodreo) ,
                                              AV93Consultadeproduccion_fasesfullds_4_barcodpar } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV96Consultadeproduccion_fasesfullds_7_tffascod = GXutil.padr( GXutil.rtrim( AV96Consultadeproduccion_fasesfullds_7_tffascod), 8, "%") ;
         lV98Consultadeproduccion_fasesfullds_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV98Consultadeproduccion_fasesfullds_9_tffasdsc), 28, "%") ;
         lV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis), 6, "%") ;
         /* Using cursor P0A3Z2 */
         pr_default.execute(0, new Object[] {AV90Consultadeproduccion_fasesfullds_1_emprcod, Integer.valueOf(AV91Consultadeproduccion_fasesfullds_2_barcod), Byte.valueOf(AV92Consultadeproduccion_fasesfullds_3_barcodreo), AV93Consultadeproduccion_fasesfullds_4_barcodpar, AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Short.valueOf(AV94Consultadeproduccion_fasesfullds_5_tfbarordlin), Short.valueOf(AV95Consultadeproduccion_fasesfullds_6_tfbarordlin_to), lV96Consultadeproduccion_fasesfullds_7_tffascod, AV97Consultadeproduccion_fasesfullds_8_tffascod_sel, lV98Consultadeproduccion_fasesfullds_9_tffasdsc, AV99Consultadeproduccion_fasesfullds_10_tffasdsc_sel, lV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis, AV101Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel, AV102Consultadeproduccion_fasesfullds_13_tfbarfasdti, AV103Consultadeproduccion_fasesfullds_14_tfbartierea, AV104Consultadeproduccion_fasesfullds_15_tfbartierea_to, AV106Consultadeproduccion_fasesfullds_17_tfbarfaskgm, AV107Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to, AV108Consultadeproduccion_fasesfullds_19_tfbarfasmtr, AV109Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to, Byte.valueOf(AV110Consultadeproduccion_fasesfullds_21_tfbarfaspri), Byte.valueOf(AV111Consultadeproduccion_fasesfullds_22_tfbarfaspri_to)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P0A3Z2_A396EmprCod[0] ;
            A129BarCod = P0A3Z2_A129BarCod[0] ;
            n129BarCod = P0A3Z2_n129BarCod[0] ;
            A132BarCodReo = P0A3Z2_A132BarCodReo[0] ;
            n132BarCodReo = P0A3Z2_n132BarCodReo[0] ;
            A130BarCodPar = P0A3Z2_A130BarCodPar[0] ;
            n130BarCodPar = P0A3Z2_n130BarCodPar[0] ;
            A3836BarFasPri = P0A3Z2_A3836BarFasPri[0] ;
            A3838BarFasMtr = P0A3Z2_A3838BarFasMtr[0] ;
            n3838BarFasMtr = P0A3Z2_n3838BarFasMtr[0] ;
            A3837BarFasKgm = P0A3Z2_A3837BarFasKgm[0] ;
            n3837BarFasKgm = P0A3Z2_n3837BarFasKgm[0] ;
            A153BarFasEst = P0A3Z2_A153BarFasEst[0] ;
            A215BarTieRea = P0A3Z2_A215BarTieRea[0] ;
            A4442BarFasDTI = P0A3Z2_A4442BarFasDTI[0] ;
            n4442BarFasDTI = P0A3Z2_n4442BarFasDTI[0] ;
            A603MaqCodBis = P0A3Z2_A603MaqCodBis[0] ;
            A460FasDsc = P0A3Z2_A460FasDsc[0] ;
            A457FasCod = P0A3Z2_A457FasCod[0] ;
            A194BarOrdLin = P0A3Z2_A194BarOrdLin[0] ;
            A4443BarFasDTF = P0A3Z2_A4443BarFasDTF[0] ;
            n4443BarFasDTF = P0A3Z2_n4443BarFasDTF[0] ;
            A2265BarExt = P0A3Z2_A2265BarExt[0] ;
            n2265BarExt = P0A3Z2_n2265BarExt[0] ;
            A148BarEstReo = P0A3Z2_A148BarEstReo[0] ;
            A6173BarFasSec = P0A3Z2_A6173BarFasSec[0] ;
            n6173BarFasSec = P0A3Z2_n6173BarFasSec[0] ;
            A934BarReoCod = P0A3Z2_A934BarReoCod[0] ;
            A936BarReoReo = P0A3Z2_A936BarReoReo[0] ;
            A935BarReoPar = P0A3Z2_A935BarReoPar[0] ;
            A758ProCod = P0A3Z2_A758ProCod[0] ;
            A2265BarExt = P0A3Z2_A2265BarExt[0] ;
            n2265BarExt = P0A3Z2_n2265BarExt[0] ;
            A148BarEstReo = P0A3Z2_A148BarEstReo[0] ;
            A934BarReoCod = P0A3Z2_A934BarReoCod[0] ;
            A936BarReoReo = P0A3Z2_A936BarReoReo[0] ;
            A935BarReoPar = P0A3Z2_A935BarReoPar[0] ;
            A460FasDsc = P0A3Z2_A460FasDsc[0] ;
            AV78BarFasDTF = "" ;
            if ( ( ( A153BarFasEst > 0 ) ) || ( ! (0==A3836BarFasPri) ) )
            {
               if ( ! GXutil.dateCompare(GXutil.nullDate(), A4442BarFasDTI) )
               {
                  AV78BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
            }
            if ( ( ( A153BarFasEst >= 2 ) ) || ( ! (0==A3836BarFasPri) ) )
            {
               AV78BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( A2265BarExt != 0 )
            {
               AV82Lexmvh = (short)(0) ;
               /* Using cursor P0A3Z3 */
               pr_default.execute(1, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, AV80FasCod});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A396EmprCod = P0A3Z3_A396EmprCod[0] ;
                  A129BarCod = P0A3Z3_A129BarCod[0] ;
                  n129BarCod = P0A3Z3_n129BarCod[0] ;
                  A132BarCodReo = P0A3Z3_A132BarCodReo[0] ;
                  n132BarCodReo = P0A3Z3_n132BarCodReo[0] ;
                  A130BarCodPar = P0A3Z3_A130BarCodPar[0] ;
                  n130BarCodPar = P0A3Z3_n130BarCodPar[0] ;
                  A2689ExHdrFas = P0A3Z3_A2689ExHdrFas[0] ;
                  A2697ExHdrFeE = P0A3Z3_A2697ExHdrFeE[0] ;
                  n2697ExHdrFeE = P0A3Z3_n2697ExHdrFeE[0] ;
                  A2700ExHdrFeR = P0A3Z3_A2700ExHdrFeR[0] ;
                  n2700ExHdrFeR = P0A3Z3_n2700ExHdrFeR[0] ;
                  A2248ManCod = P0A3Z3_A2248ManCod[0] ;
                  A2692ExHdrLin = P0A3Z3_A2692ExHdrLin[0] ;
                  AV81ExHdrFeE = A2697ExHdrFeE ;
                  AV79ExHdrFeR = A2700ExHdrFeR ;
                  AV82Lexmvh = (short)(1) ;
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               AV78BarFasDTF = (!GXutil.dateCompare(GXutil.nullDate(), A4443BarFasDTF) ? localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.dtoc( AV79ExHdrFeR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
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
               GXv_char3[0] = A396EmprCod ;
               GXv_int4[0] = A934BarReoCod ;
               GXv_int5[0] = A936BarReoReo ;
               GXv_char6[0] = A935BarReoPar ;
               GXv_int7[0] = A194BarOrdLin ;
               GXv_char8[0] = GXt_char2 ;
               new app.pjln001(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char6, GXv_int7, GXv_char8) ;
               consultadeproduccion_fasesfullexportreport_impl.this.A396EmprCod = GXv_char3[0] ;
               consultadeproduccion_fasesfullexportreport_impl.this.A934BarReoCod = GXv_int4[0] ;
               consultadeproduccion_fasesfullexportreport_impl.this.A936BarReoReo = GXv_int5[0] ;
               consultadeproduccion_fasesfullexportreport_impl.this.A935BarReoPar = GXv_char6[0] ;
               consultadeproduccion_fasesfullexportreport_impl.this.A194BarOrdLin = GXv_int7[0] ;
               consultadeproduccion_fasesfullexportreport_impl.this.GXt_char2 = GXv_char8[0] ;
               AV18OpeNom = GXt_char2 ;
            }
            else
            {
               GXt_char2 = AV18OpeNom ;
               GXv_char8[0] = A396EmprCod ;
               GXv_int4[0] = A129BarCod ;
               GXv_int5[0] = A132BarCodReo ;
               GXv_char6[0] = A130BarCodPar ;
               GXv_int7[0] = A194BarOrdLin ;
               GXv_char3[0] = GXt_char2 ;
               new app.pjln001(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char6, GXv_int7, GXv_char3) ;
               consultadeproduccion_fasesfullexportreport_impl.this.A396EmprCod = GXv_char8[0] ;
               consultadeproduccion_fasesfullexportreport_impl.this.A129BarCod = GXv_int4[0] ;
               consultadeproduccion_fasesfullexportreport_impl.this.A132BarCodReo = GXv_int5[0] ;
               consultadeproduccion_fasesfullexportreport_impl.this.A130BarCodPar = GXv_char6[0] ;
               consultadeproduccion_fasesfullexportreport_impl.this.A194BarOrdLin = GXv_int7[0] ;
               consultadeproduccion_fasesfullexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
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
            hA3Z0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")), 30, Gx_line+10, 90, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 94, Gx_line+10, 154, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 158, Gx_line+10, 278, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), 282, Gx_line+10, 342, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"), 346, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78BarFasDTF, "")), 410, Gx_line+10, 470, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")), 474, Gx_line+10, 534, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17BarFasEstDescription, "")), 538, Gx_line+10, 598, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3837BarFasKgm, "ZZZZZ9.99")), 602, Gx_line+10, 662, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18OpeNom, "")), 666, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      AV114Consultadeproduccion_fasesds_23_emprcod = AV10EmprCod ;
      AV115Consultadeproduccion_fasesds_24_barcod = AV11BarCod ;
      AV116Consultadeproduccion_fasesds_25_barcodreo = AV12BarCodReo ;
      AV117Consultadeproduccion_fasesds_26_barcodpar = AV13BarCodPar ;
      AV118Consultadeproduccion_fasesds_27_tfbarordlin = AV23TFBarOrdLin ;
      AV119Consultadeproduccion_fasesds_28_tfbarordlin_to = AV24TFBarOrdLin_To ;
      AV120Consultadeproduccion_fasesds_29_tffascod = AV25TFFasCod ;
      AV121Consultadeproduccion_fasesds_30_tffascod_sel = AV26TFFasCod_Sel ;
      AV122Consultadeproduccion_fasesds_31_tffasdsc = AV27TFFasDsc ;
      AV123Consultadeproduccion_fasesds_32_tffasdsc_sel = AV28TFFasDsc_Sel ;
      AV124Consultadeproduccion_fasesds_33_tfmaqcodbis = AV29TFMaqCodBis ;
      AV125Consultadeproduccion_fasesds_34_tfmaqcodbis_sel = AV30TFMaqCodBis_Sel ;
      AV126Consultadeproduccion_fasesds_35_tfbarfasdti = AV31TFBarFasDTI ;
      AV127Consultadeproduccion_fasesds_36_tfbarfasdti_to = AV32TFBarFasDTI_To ;
      AV128Consultadeproduccion_fasesds_37_tfbartierea = AV35TFBarTieRea ;
      AV129Consultadeproduccion_fasesds_38_tfbartierea_to = AV36TFBarTieRea_To ;
      AV130Consultadeproduccion_fasesds_39_tfbarfasest_sels = AV39TFBarFasEst_Sels ;
      AV131Consultadeproduccion_fasesds_40_tfbarfaskgm = AV41TFBarFasKgm ;
      AV132Consultadeproduccion_fasesds_41_tfbarfaskgm_to = AV42TFBarFasKgm_To ;
      AV133Consultadeproduccion_fasesds_42_tfbarfasmtr = AV43TFBarFasMtr ;
      AV134Consultadeproduccion_fasesds_43_tfbarfasmtr_to = AV44TFBarFasMtr_To ;
      AV135Consultadeproduccion_fasesds_44_tfbarfaspri = AV68TFBarFasPri ;
      AV136Consultadeproduccion_fasesds_45_tfbarfaspri_to = AV69TFBarFasPri_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV130Consultadeproduccion_fasesds_39_tfbarfasest_sels ,
                                           Short.valueOf(AV118Consultadeproduccion_fasesds_27_tfbarordlin) ,
                                           Short.valueOf(AV119Consultadeproduccion_fasesds_28_tfbarordlin_to) ,
                                           AV121Consultadeproduccion_fasesds_30_tffascod_sel ,
                                           AV120Consultadeproduccion_fasesds_29_tffascod ,
                                           AV123Consultadeproduccion_fasesds_32_tffasdsc_sel ,
                                           AV122Consultadeproduccion_fasesds_31_tffasdsc ,
                                           AV125Consultadeproduccion_fasesds_34_tfmaqcodbis_sel ,
                                           AV124Consultadeproduccion_fasesds_33_tfmaqcodbis ,
                                           AV126Consultadeproduccion_fasesds_35_tfbarfasdti ,
                                           AV128Consultadeproduccion_fasesds_37_tfbartierea ,
                                           AV129Consultadeproduccion_fasesds_38_tfbartierea_to ,
                                           Integer.valueOf(AV130Consultadeproduccion_fasesds_39_tfbarfasest_sels.size()) ,
                                           AV131Consultadeproduccion_fasesds_40_tfbarfaskgm ,
                                           AV132Consultadeproduccion_fasesds_41_tfbarfaskgm_to ,
                                           AV133Consultadeproduccion_fasesds_42_tfbarfasmtr ,
                                           AV134Consultadeproduccion_fasesds_43_tfbarfasmtr_to ,
                                           Byte.valueOf(AV135Consultadeproduccion_fasesds_44_tfbarfaspri) ,
                                           Byte.valueOf(AV136Consultadeproduccion_fasesds_45_tfbarfaspri_to) ,
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
                                           A396EmprCod ,
                                           AV10EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV11BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV12BarCodReo) ,
                                           A130BarCodPar ,
                                           AV13BarCodPar ,
                                           AV114Consultadeproduccion_fasesds_23_emprcod ,
                                           Integer.valueOf(AV115Consultadeproduccion_fasesds_24_barcod) ,
                                           Byte.valueOf(AV116Consultadeproduccion_fasesds_25_barcodreo) ,
                                           AV117Consultadeproduccion_fasesds_26_barcodpar } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV120Consultadeproduccion_fasesds_29_tffascod = GXutil.padr( GXutil.rtrim( AV120Consultadeproduccion_fasesds_29_tffascod), 8, "%") ;
      lV122Consultadeproduccion_fasesds_31_tffasdsc = GXutil.padr( GXutil.rtrim( AV122Consultadeproduccion_fasesds_31_tffasdsc), 28, "%") ;
      lV124Consultadeproduccion_fasesds_33_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV124Consultadeproduccion_fasesds_33_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0A3Z4 */
      pr_default.execute(2, new Object[] {AV114Consultadeproduccion_fasesds_23_emprcod, Integer.valueOf(AV115Consultadeproduccion_fasesds_24_barcod), Byte.valueOf(AV116Consultadeproduccion_fasesds_25_barcodreo), AV117Consultadeproduccion_fasesds_26_barcodpar, AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, Short.valueOf(AV118Consultadeproduccion_fasesds_27_tfbarordlin), Short.valueOf(AV119Consultadeproduccion_fasesds_28_tfbarordlin_to), lV120Consultadeproduccion_fasesds_29_tffascod, AV121Consultadeproduccion_fasesds_30_tffascod_sel, lV122Consultadeproduccion_fasesds_31_tffasdsc, AV123Consultadeproduccion_fasesds_32_tffasdsc_sel, lV124Consultadeproduccion_fasesds_33_tfmaqcodbis, AV125Consultadeproduccion_fasesds_34_tfmaqcodbis_sel, AV126Consultadeproduccion_fasesds_35_tfbarfasdti, AV128Consultadeproduccion_fasesds_37_tfbartierea, AV129Consultadeproduccion_fasesds_38_tfbartierea_to, AV131Consultadeproduccion_fasesds_40_tfbarfaskgm, AV132Consultadeproduccion_fasesds_41_tfbarfaskgm_to, AV133Consultadeproduccion_fasesds_42_tfbarfasmtr, AV134Consultadeproduccion_fasesds_43_tfbarfasmtr_to, Byte.valueOf(AV135Consultadeproduccion_fasesds_44_tfbarfaspri), Byte.valueOf(AV136Consultadeproduccion_fasesds_45_tfbarfaspri_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P0A3Z4_A396EmprCod[0] ;
         A129BarCod = P0A3Z4_A129BarCod[0] ;
         n129BarCod = P0A3Z4_n129BarCod[0] ;
         A132BarCodReo = P0A3Z4_A132BarCodReo[0] ;
         n132BarCodReo = P0A3Z4_n132BarCodReo[0] ;
         A130BarCodPar = P0A3Z4_A130BarCodPar[0] ;
         n130BarCodPar = P0A3Z4_n130BarCodPar[0] ;
         A3836BarFasPri = P0A3Z4_A3836BarFasPri[0] ;
         A3838BarFasMtr = P0A3Z4_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0A3Z4_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0A3Z4_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0A3Z4_n3837BarFasKgm[0] ;
         A153BarFasEst = P0A3Z4_A153BarFasEst[0] ;
         A215BarTieRea = P0A3Z4_A215BarTieRea[0] ;
         A4442BarFasDTI = P0A3Z4_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0A3Z4_n4442BarFasDTI[0] ;
         A603MaqCodBis = P0A3Z4_A603MaqCodBis[0] ;
         A460FasDsc = P0A3Z4_A460FasDsc[0] ;
         A457FasCod = P0A3Z4_A457FasCod[0] ;
         A194BarOrdLin = P0A3Z4_A194BarOrdLin[0] ;
         A4443BarFasDTF = P0A3Z4_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0A3Z4_n4443BarFasDTF[0] ;
         A2265BarExt = P0A3Z4_A2265BarExt[0] ;
         n2265BarExt = P0A3Z4_n2265BarExt[0] ;
         A148BarEstReo = P0A3Z4_A148BarEstReo[0] ;
         A6173BarFasSec = P0A3Z4_A6173BarFasSec[0] ;
         n6173BarFasSec = P0A3Z4_n6173BarFasSec[0] ;
         A934BarReoCod = P0A3Z4_A934BarReoCod[0] ;
         A936BarReoReo = P0A3Z4_A936BarReoReo[0] ;
         A935BarReoPar = P0A3Z4_A935BarReoPar[0] ;
         A758ProCod = P0A3Z4_A758ProCod[0] ;
         A2265BarExt = P0A3Z4_A2265BarExt[0] ;
         n2265BarExt = P0A3Z4_n2265BarExt[0] ;
         A148BarEstReo = P0A3Z4_A148BarEstReo[0] ;
         A934BarReoCod = P0A3Z4_A934BarReoCod[0] ;
         A936BarReoReo = P0A3Z4_A936BarReoReo[0] ;
         A935BarReoPar = P0A3Z4_A935BarReoPar[0] ;
         A460FasDsc = P0A3Z4_A460FasDsc[0] ;
         GXt_char2 = AV16MaqDsc ;
         GXv_char8[0] = A396EmprCod ;
         GXv_char6[0] = A603MaqCodBis ;
         GXv_char3[0] = GXt_char2 ;
         new app.pmaqdsc(remoteHandle, context).execute( GXv_char8, GXv_char6, GXv_char3) ;
         consultadeproduccion_fasesfullexportreport_impl.this.A396EmprCod = GXv_char8[0] ;
         consultadeproduccion_fasesfullexportreport_impl.this.A603MaqCodBis = GXv_char6[0] ;
         consultadeproduccion_fasesfullexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
         AV16MaqDsc = GXt_char2 ;
         AV78BarFasDTF = "" ;
         if ( ( ( A153BarFasEst > 0 ) ) || ( ! (0==A3836BarFasPri) ) )
         {
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4442BarFasDTI) )
            {
               AV78BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
         }
         if ( ( ( A153BarFasEst >= 2 ) ) || ( ! (0==A3836BarFasPri) ) )
         {
            AV78BarFasDTF = localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( A2265BarExt != 0 )
         {
            AV82Lexmvh = (short)(0) ;
            /* Using cursor P0A3Z5 */
            pr_default.execute(3, new Object[] {AV10EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12BarCodReo), AV13BarCodPar, AV80FasCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A396EmprCod = P0A3Z5_A396EmprCod[0] ;
               A129BarCod = P0A3Z5_A129BarCod[0] ;
               n129BarCod = P0A3Z5_n129BarCod[0] ;
               A132BarCodReo = P0A3Z5_A132BarCodReo[0] ;
               n132BarCodReo = P0A3Z5_n132BarCodReo[0] ;
               A130BarCodPar = P0A3Z5_A130BarCodPar[0] ;
               n130BarCodPar = P0A3Z5_n130BarCodPar[0] ;
               A2689ExHdrFas = P0A3Z5_A2689ExHdrFas[0] ;
               A2697ExHdrFeE = P0A3Z5_A2697ExHdrFeE[0] ;
               n2697ExHdrFeE = P0A3Z5_n2697ExHdrFeE[0] ;
               A2700ExHdrFeR = P0A3Z5_A2700ExHdrFeR[0] ;
               n2700ExHdrFeR = P0A3Z5_n2700ExHdrFeR[0] ;
               A2248ManCod = P0A3Z5_A2248ManCod[0] ;
               A2692ExHdrLin = P0A3Z5_A2692ExHdrLin[0] ;
               AV81ExHdrFeE = A2697ExHdrFeE ;
               AV79ExHdrFeR = A2700ExHdrFeR ;
               AV82Lexmvh = (short)(1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV78BarFasDTF = (!GXutil.dateCompare(GXutil.nullDate(), A4443BarFasDTF) ? localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.dtoc( AV79ExHdrFeR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
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
            GXv_char8[0] = A396EmprCod ;
            GXv_int4[0] = A934BarReoCod ;
            GXv_int5[0] = A936BarReoReo ;
            GXv_char6[0] = A935BarReoPar ;
            GXv_int7[0] = A194BarOrdLin ;
            GXv_char3[0] = GXt_char2 ;
            new app.pjln001(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char6, GXv_int7, GXv_char3) ;
            consultadeproduccion_fasesfullexportreport_impl.this.A396EmprCod = GXv_char8[0] ;
            consultadeproduccion_fasesfullexportreport_impl.this.A934BarReoCod = GXv_int4[0] ;
            consultadeproduccion_fasesfullexportreport_impl.this.A936BarReoReo = GXv_int5[0] ;
            consultadeproduccion_fasesfullexportreport_impl.this.A935BarReoPar = GXv_char6[0] ;
            consultadeproduccion_fasesfullexportreport_impl.this.A194BarOrdLin = GXv_int7[0] ;
            consultadeproduccion_fasesfullexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
            AV18OpeNom = GXt_char2 ;
         }
         else
         {
            GXt_char2 = AV18OpeNom ;
            GXv_char8[0] = A396EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int5[0] = A132BarCodReo ;
            GXv_char6[0] = A130BarCodPar ;
            GXv_int7[0] = A194BarOrdLin ;
            GXv_char3[0] = GXt_char2 ;
            new app.pjln001(remoteHandle, context).execute( GXv_char8, GXv_int4, GXv_int5, GXv_char6, GXv_int7, GXv_char3) ;
            consultadeproduccion_fasesfullexportreport_impl.this.A396EmprCod = GXv_char8[0] ;
            consultadeproduccion_fasesfullexportreport_impl.this.A129BarCod = GXv_int4[0] ;
            consultadeproduccion_fasesfullexportreport_impl.this.A132BarCodReo = GXv_int5[0] ;
            consultadeproduccion_fasesfullexportreport_impl.this.A130BarCodPar = GXv_char6[0] ;
            consultadeproduccion_fasesfullexportreport_impl.this.A194BarOrdLin = GXv_int7[0] ;
            consultadeproduccion_fasesfullexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
            AV18OpeNom = GXt_char2 ;
         }
         AV76TotBarFasKgm = AV76TotBarFasKgm.add(A3837BarFasKgm) ;
         AV77TotBarFasMtr = AV77TotBarFasMtr.add(A3838BarFasMtr) ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         hA3Z0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")), 30, Gx_line+10, 90, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 94, Gx_line+10, 154, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 158, Gx_line+10, 278, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), 282, Gx_line+10, 342, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"), 346, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78BarFasDTF, "")), 410, Gx_line+10, 470, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")), 474, Gx_line+10, 534, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17BarFasEstDescription, "")), 538, Gx_line+10, 598, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3837BarFasKgm, "ZZZZZ9.99")), 602, Gx_line+10, 662, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18OpeNom, "")), 666, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ConsultadeProduccion_FasesFullGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultadeProduccion_FasesFullGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ConsultadeProduccion_FasesFullGridState"), null, null);
      }
      AV14OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV15OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV138GXV2 = 1 ;
      while ( AV138GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV138GXV2));
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
         AV138GXV2 = (int)(AV138GXV2+1) ;
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
      GXv_char8[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char8) ;
      consultadeproduccion_fasesfullexportreport_impl.this.GXt_char2 = GXv_char8[0] ;
      AV74Station = GXt_char2 ;
      GXv_char8[0] = AV10EmprCod ;
      GXv_char6[0] = AV73EmprNom ;
      GXv_char3[0] = AV75UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV74Station, GXv_char8, GXv_char6, GXv_char3) ;
      consultadeproduccion_fasesfullexportreport_impl.this.AV10EmprCod = GXv_char8[0] ;
      consultadeproduccion_fasesfullexportreport_impl.this.AV73EmprNom = GXv_char6[0] ;
      consultadeproduccion_fasesfullexportreport_impl.this.AV75UsurCod = GXv_char3[0] ;
   }

   public void hA3Z0( boolean bFoot ,
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
            AV63Title = AV85Pgmdesc ;
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
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A6173BarFasSec = "" ;
      A396EmprCod = "" ;
      A935BarReoPar = "" ;
      A130BarCodPar = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      AV90Consultadeproduccion_fasesfullds_1_emprcod = "" ;
      AV10EmprCod = "" ;
      AV93Consultadeproduccion_fasesfullds_4_barcodpar = "" ;
      AV13BarCodPar = "" ;
      AV96Consultadeproduccion_fasesfullds_7_tffascod = "" ;
      AV97Consultadeproduccion_fasesfullds_8_tffascod_sel = "" ;
      AV98Consultadeproduccion_fasesfullds_9_tffasdsc = "" ;
      AV99Consultadeproduccion_fasesfullds_10_tffasdsc_sel = "" ;
      AV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis = "" ;
      AV101Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel = "" ;
      AV102Consultadeproduccion_fasesfullds_13_tfbarfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV103Consultadeproduccion_fasesfullds_14_tfbartierea = DecimalUtil.ZERO ;
      AV104Consultadeproduccion_fasesfullds_15_tfbartierea_to = DecimalUtil.ZERO ;
      AV105Consultadeproduccion_fasesfullds_16_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV106Consultadeproduccion_fasesfullds_17_tfbarfaskgm = DecimalUtil.ZERO ;
      AV107Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV108Consultadeproduccion_fasesfullds_19_tfbarfasmtr = DecimalUtil.ZERO ;
      AV109Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV96Consultadeproduccion_fasesfullds_7_tffascod = "" ;
      lV98Consultadeproduccion_fasesfullds_9_tffasdsc = "" ;
      lV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis = "" ;
      P0A3Z2_A396EmprCod = new String[] {""} ;
      P0A3Z2_A129BarCod = new int[1] ;
      P0A3Z2_n129BarCod = new boolean[] {false} ;
      P0A3Z2_A132BarCodReo = new byte[1] ;
      P0A3Z2_n132BarCodReo = new boolean[] {false} ;
      P0A3Z2_A130BarCodPar = new String[] {""} ;
      P0A3Z2_n130BarCodPar = new boolean[] {false} ;
      P0A3Z2_A3836BarFasPri = new byte[1] ;
      P0A3Z2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Z2_n3838BarFasMtr = new boolean[] {false} ;
      P0A3Z2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Z2_n3837BarFasKgm = new boolean[] {false} ;
      P0A3Z2_A153BarFasEst = new byte[1] ;
      P0A3Z2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Z2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Z2_n4442BarFasDTI = new boolean[] {false} ;
      P0A3Z2_A603MaqCodBis = new String[] {""} ;
      P0A3Z2_A460FasDsc = new String[] {""} ;
      P0A3Z2_A457FasCod = new String[] {""} ;
      P0A3Z2_A194BarOrdLin = new short[1] ;
      P0A3Z2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Z2_n4443BarFasDTF = new boolean[] {false} ;
      P0A3Z2_A2265BarExt = new byte[1] ;
      P0A3Z2_n2265BarExt = new boolean[] {false} ;
      P0A3Z2_A148BarEstReo = new byte[1] ;
      P0A3Z2_A6173BarFasSec = new String[] {""} ;
      P0A3Z2_n6173BarFasSec = new boolean[] {false} ;
      P0A3Z2_A934BarReoCod = new int[1] ;
      P0A3Z2_A936BarReoReo = new byte[1] ;
      P0A3Z2_A935BarReoPar = new String[] {""} ;
      P0A3Z2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV78BarFasDTF = "" ;
      AV80FasCod = "" ;
      P0A3Z3_A396EmprCod = new String[] {""} ;
      P0A3Z3_A129BarCod = new int[1] ;
      P0A3Z3_n129BarCod = new boolean[] {false} ;
      P0A3Z3_A132BarCodReo = new byte[1] ;
      P0A3Z3_n132BarCodReo = new boolean[] {false} ;
      P0A3Z3_A130BarCodPar = new String[] {""} ;
      P0A3Z3_n130BarCodPar = new boolean[] {false} ;
      P0A3Z3_A2689ExHdrFas = new String[] {""} ;
      P0A3Z3_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Z3_n2697ExHdrFeE = new boolean[] {false} ;
      P0A3Z3_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Z3_n2700ExHdrFeR = new boolean[] {false} ;
      P0A3Z3_A2248ManCod = new short[1] ;
      P0A3Z3_A2692ExHdrLin = new int[1] ;
      A2689ExHdrFas = "" ;
      AV81ExHdrFeE = GXutil.nullDate() ;
      AV79ExHdrFeR = GXutil.nullDate() ;
      AV17BarFasEstDescription = "" ;
      AV18OpeNom = "" ;
      AV76TotBarFasKgm = DecimalUtil.ZERO ;
      AV77TotBarFasMtr = DecimalUtil.ZERO ;
      AV114Consultadeproduccion_fasesds_23_emprcod = "" ;
      AV117Consultadeproduccion_fasesds_26_barcodpar = "" ;
      AV120Consultadeproduccion_fasesds_29_tffascod = "" ;
      AV121Consultadeproduccion_fasesds_30_tffascod_sel = "" ;
      AV122Consultadeproduccion_fasesds_31_tffasdsc = "" ;
      AV123Consultadeproduccion_fasesds_32_tffasdsc_sel = "" ;
      AV124Consultadeproduccion_fasesds_33_tfmaqcodbis = "" ;
      AV125Consultadeproduccion_fasesds_34_tfmaqcodbis_sel = "" ;
      AV126Consultadeproduccion_fasesds_35_tfbarfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV127Consultadeproduccion_fasesds_36_tfbarfasdti_to = GXutil.resetTime( GXutil.nullDate() );
      AV32TFBarFasDTI_To = GXutil.resetTime( GXutil.nullDate() );
      AV128Consultadeproduccion_fasesds_37_tfbartierea = DecimalUtil.ZERO ;
      AV129Consultadeproduccion_fasesds_38_tfbartierea_to = DecimalUtil.ZERO ;
      AV130Consultadeproduccion_fasesds_39_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV131Consultadeproduccion_fasesds_40_tfbarfaskgm = DecimalUtil.ZERO ;
      AV132Consultadeproduccion_fasesds_41_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV133Consultadeproduccion_fasesds_42_tfbarfasmtr = DecimalUtil.ZERO ;
      AV134Consultadeproduccion_fasesds_43_tfbarfasmtr_to = DecimalUtil.ZERO ;
      lV120Consultadeproduccion_fasesds_29_tffascod = "" ;
      lV122Consultadeproduccion_fasesds_31_tffasdsc = "" ;
      lV124Consultadeproduccion_fasesds_33_tfmaqcodbis = "" ;
      P0A3Z4_A396EmprCod = new String[] {""} ;
      P0A3Z4_A129BarCod = new int[1] ;
      P0A3Z4_n129BarCod = new boolean[] {false} ;
      P0A3Z4_A132BarCodReo = new byte[1] ;
      P0A3Z4_n132BarCodReo = new boolean[] {false} ;
      P0A3Z4_A130BarCodPar = new String[] {""} ;
      P0A3Z4_n130BarCodPar = new boolean[] {false} ;
      P0A3Z4_A3836BarFasPri = new byte[1] ;
      P0A3Z4_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Z4_n3838BarFasMtr = new boolean[] {false} ;
      P0A3Z4_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Z4_n3837BarFasKgm = new boolean[] {false} ;
      P0A3Z4_A153BarFasEst = new byte[1] ;
      P0A3Z4_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A3Z4_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Z4_n4442BarFasDTI = new boolean[] {false} ;
      P0A3Z4_A603MaqCodBis = new String[] {""} ;
      P0A3Z4_A460FasDsc = new String[] {""} ;
      P0A3Z4_A457FasCod = new String[] {""} ;
      P0A3Z4_A194BarOrdLin = new short[1] ;
      P0A3Z4_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Z4_n4443BarFasDTF = new boolean[] {false} ;
      P0A3Z4_A2265BarExt = new byte[1] ;
      P0A3Z4_n2265BarExt = new boolean[] {false} ;
      P0A3Z4_A148BarEstReo = new byte[1] ;
      P0A3Z4_A6173BarFasSec = new String[] {""} ;
      P0A3Z4_n6173BarFasSec = new boolean[] {false} ;
      P0A3Z4_A934BarReoCod = new int[1] ;
      P0A3Z4_A936BarReoReo = new byte[1] ;
      P0A3Z4_A935BarReoPar = new String[] {""} ;
      P0A3Z4_A758ProCod = new String[] {""} ;
      AV16MaqDsc = "" ;
      P0A3Z5_A396EmprCod = new String[] {""} ;
      P0A3Z5_A129BarCod = new int[1] ;
      P0A3Z5_n129BarCod = new boolean[] {false} ;
      P0A3Z5_A132BarCodReo = new byte[1] ;
      P0A3Z5_n132BarCodReo = new boolean[] {false} ;
      P0A3Z5_A130BarCodPar = new String[] {""} ;
      P0A3Z5_n130BarCodPar = new boolean[] {false} ;
      P0A3Z5_A2689ExHdrFas = new String[] {""} ;
      P0A3Z5_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Z5_n2697ExHdrFeE = new boolean[] {false} ;
      P0A3Z5_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P0A3Z5_n2700ExHdrFeR = new boolean[] {false} ;
      P0A3Z5_A2248ManCod = new short[1] ;
      P0A3Z5_A2692ExHdrLin = new int[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int7 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV74Station = "" ;
      GXt_char2 = "" ;
      GXv_char8 = new String[1] ;
      AV73EmprNom = "" ;
      GXv_char6 = new String[1] ;
      AV75UsurCod = "" ;
      GXv_char3 = new String[1] ;
      AV61PageInfo = "" ;
      AV58DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV85Pgmdesc = "" ;
      AV56AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultadeproduccion_fasesfullexportreport__default(),
         new Object[] {
             new Object[] {
            P0A3Z2_A396EmprCod, P0A3Z2_A129BarCod, P0A3Z2_A132BarCodReo, P0A3Z2_A130BarCodPar, P0A3Z2_A3836BarFasPri, P0A3Z2_A3838BarFasMtr, P0A3Z2_n3838BarFasMtr, P0A3Z2_A3837BarFasKgm, P0A3Z2_n3837BarFasKgm, P0A3Z2_A153BarFasEst,
            P0A3Z2_A215BarTieRea, P0A3Z2_A4442BarFasDTI, P0A3Z2_n4442BarFasDTI, P0A3Z2_A603MaqCodBis, P0A3Z2_A460FasDsc, P0A3Z2_A457FasCod, P0A3Z2_A194BarOrdLin, P0A3Z2_A4443BarFasDTF, P0A3Z2_n4443BarFasDTF, P0A3Z2_A2265BarExt,
            P0A3Z2_n2265BarExt, P0A3Z2_A148BarEstReo, P0A3Z2_A6173BarFasSec, P0A3Z2_n6173BarFasSec, P0A3Z2_A934BarReoCod, P0A3Z2_A936BarReoReo, P0A3Z2_A935BarReoPar, P0A3Z2_A758ProCod
            }
            , new Object[] {
            P0A3Z3_A396EmprCod, P0A3Z3_A129BarCod, P0A3Z3_n129BarCod, P0A3Z3_A132BarCodReo, P0A3Z3_n132BarCodReo, P0A3Z3_A130BarCodPar, P0A3Z3_n130BarCodPar, P0A3Z3_A2689ExHdrFas, P0A3Z3_A2697ExHdrFeE, P0A3Z3_n2697ExHdrFeE,
            P0A3Z3_A2700ExHdrFeR, P0A3Z3_n2700ExHdrFeR, P0A3Z3_A2248ManCod, P0A3Z3_A2692ExHdrLin
            }
            , new Object[] {
            P0A3Z4_A396EmprCod, P0A3Z4_A129BarCod, P0A3Z4_A132BarCodReo, P0A3Z4_A130BarCodPar, P0A3Z4_A3836BarFasPri, P0A3Z4_A3838BarFasMtr, P0A3Z4_n3838BarFasMtr, P0A3Z4_A3837BarFasKgm, P0A3Z4_n3837BarFasKgm, P0A3Z4_A153BarFasEst,
            P0A3Z4_A215BarTieRea, P0A3Z4_A4442BarFasDTI, P0A3Z4_n4442BarFasDTI, P0A3Z4_A603MaqCodBis, P0A3Z4_A460FasDsc, P0A3Z4_A457FasCod, P0A3Z4_A194BarOrdLin, P0A3Z4_A4443BarFasDTF, P0A3Z4_n4443BarFasDTF, P0A3Z4_A2265BarExt,
            P0A3Z4_n2265BarExt, P0A3Z4_A148BarEstReo, P0A3Z4_A6173BarFasSec, P0A3Z4_n6173BarFasSec, P0A3Z4_A934BarReoCod, P0A3Z4_A936BarReoReo, P0A3Z4_A935BarReoPar, P0A3Z4_A758ProCod
            }
            , new Object[] {
            P0A3Z5_A396EmprCod, P0A3Z5_A129BarCod, P0A3Z5_n129BarCod, P0A3Z5_A132BarCodReo, P0A3Z5_n132BarCodReo, P0A3Z5_A130BarCodPar, P0A3Z5_n130BarCodPar, P0A3Z5_A2689ExHdrFas, P0A3Z5_A2697ExHdrFeE, P0A3Z5_n2697ExHdrFeE,
            P0A3Z5_A2700ExHdrFeR, P0A3Z5_n2700ExHdrFeR, P0A3Z5_A2248ManCod, P0A3Z5_A2692ExHdrLin
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV85Pgmdesc = httpContext.getMessage( "Consulta Producción por Cliente", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV85Pgmdesc = httpContext.getMessage( "Consulta Producción por Cliente", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV40TFBarFasEst_Sel ;
   private byte AV68TFBarFasPri ;
   private byte AV69TFBarFasPri_To ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte A2265BarExt ;
   private byte A148BarEstReo ;
   private byte A936BarReoReo ;
   private byte A132BarCodReo ;
   private byte AV92Consultadeproduccion_fasesfullds_3_barcodreo ;
   private byte AV12BarCodReo ;
   private byte AV110Consultadeproduccion_fasesfullds_21_tfbarfaspri ;
   private byte AV111Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ;
   private byte AV116Consultadeproduccion_fasesds_25_barcodreo ;
   private byte AV135Consultadeproduccion_fasesds_44_tfbarfaspri ;
   private byte AV136Consultadeproduccion_fasesds_45_tfbarfaspri_to ;
   private byte GXv_int5[] ;
   private short gxcookieaux ;
   private short AV23TFBarOrdLin ;
   private short AV24TFBarOrdLin_To ;
   private short A194BarOrdLin ;
   private short AV94Consultadeproduccion_fasesfullds_5_tfbarordlin ;
   private short AV95Consultadeproduccion_fasesfullds_6_tfbarordlin_to ;
   private short AV14OrderedBy ;
   private short AV82Lexmvh ;
   private short A2248ManCod ;
   private short AV118Consultadeproduccion_fasesds_27_tfbarordlin ;
   private short AV119Consultadeproduccion_fasesds_28_tfbarordlin_to ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV88GXV1 ;
   private int A934BarReoCod ;
   private int A129BarCod ;
   private int AV91Consultadeproduccion_fasesfullds_2_barcod ;
   private int AV11BarCod ;
   private int AV105Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ;
   private int A2692ExHdrLin ;
   private int AV115Consultadeproduccion_fasesds_24_barcod ;
   private int AV130Consultadeproduccion_fasesds_39_tfbarfasest_sels_size ;
   private int GXv_int4[] ;
   private int AV138GXV2 ;
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
   private java.math.BigDecimal AV103Consultadeproduccion_fasesfullds_14_tfbartierea ;
   private java.math.BigDecimal AV104Consultadeproduccion_fasesfullds_15_tfbartierea_to ;
   private java.math.BigDecimal AV106Consultadeproduccion_fasesfullds_17_tfbarfaskgm ;
   private java.math.BigDecimal AV107Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ;
   private java.math.BigDecimal AV108Consultadeproduccion_fasesfullds_19_tfbarfasmtr ;
   private java.math.BigDecimal AV109Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ;
   private java.math.BigDecimal AV76TotBarFasKgm ;
   private java.math.BigDecimal AV77TotBarFasMtr ;
   private java.math.BigDecimal AV128Consultadeproduccion_fasesds_37_tfbartierea ;
   private java.math.BigDecimal AV129Consultadeproduccion_fasesds_38_tfbartierea_to ;
   private java.math.BigDecimal AV131Consultadeproduccion_fasesds_40_tfbarfaskgm ;
   private java.math.BigDecimal AV132Consultadeproduccion_fasesds_41_tfbarfaskgm_to ;
   private java.math.BigDecimal AV133Consultadeproduccion_fasesds_42_tfbarfasmtr ;
   private java.math.BigDecimal AV134Consultadeproduccion_fasesds_43_tfbarfasmtr_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV26TFFasCod_Sel ;
   private String AV25TFFasCod ;
   private String AV28TFFasDsc_Sel ;
   private String AV27TFFasDsc ;
   private String AV30TFMaqCodBis_Sel ;
   private String AV29TFMaqCodBis ;
   private String A6173BarFasSec ;
   private String A396EmprCod ;
   private String A935BarReoPar ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String AV90Consultadeproduccion_fasesfullds_1_emprcod ;
   private String AV10EmprCod ;
   private String AV93Consultadeproduccion_fasesfullds_4_barcodpar ;
   private String AV13BarCodPar ;
   private String AV96Consultadeproduccion_fasesfullds_7_tffascod ;
   private String AV97Consultadeproduccion_fasesfullds_8_tffascod_sel ;
   private String AV98Consultadeproduccion_fasesfullds_9_tffasdsc ;
   private String AV99Consultadeproduccion_fasesfullds_10_tffasdsc_sel ;
   private String AV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis ;
   private String AV101Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ;
   private String scmdbuf ;
   private String lV96Consultadeproduccion_fasesfullds_7_tffascod ;
   private String lV98Consultadeproduccion_fasesfullds_9_tffasdsc ;
   private String lV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis ;
   private String A758ProCod ;
   private String AV78BarFasDTF ;
   private String AV80FasCod ;
   private String A2689ExHdrFas ;
   private String AV18OpeNom ;
   private String AV114Consultadeproduccion_fasesds_23_emprcod ;
   private String AV117Consultadeproduccion_fasesds_26_barcodpar ;
   private String AV120Consultadeproduccion_fasesds_29_tffascod ;
   private String AV121Consultadeproduccion_fasesds_30_tffascod_sel ;
   private String AV122Consultadeproduccion_fasesds_31_tffasdsc ;
   private String AV123Consultadeproduccion_fasesds_32_tffasdsc_sel ;
   private String AV124Consultadeproduccion_fasesds_33_tfmaqcodbis ;
   private String AV125Consultadeproduccion_fasesds_34_tfmaqcodbis_sel ;
   private String lV120Consultadeproduccion_fasesds_29_tffascod ;
   private String lV122Consultadeproduccion_fasesds_31_tffasdsc ;
   private String lV124Consultadeproduccion_fasesds_33_tfmaqcodbis ;
   private String AV16MaqDsc ;
   private String AV74Station ;
   private String GXt_char2 ;
   private String GXv_char8[] ;
   private String AV73EmprNom ;
   private String GXv_char6[] ;
   private String AV75UsurCod ;
   private String GXv_char3[] ;
   private String AV85Pgmdesc ;
   private java.util.Date AV31TFBarFasDTI ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV102Consultadeproduccion_fasesfullds_13_tfbarfasdti ;
   private java.util.Date AV126Consultadeproduccion_fasesds_35_tfbarfasdti ;
   private java.util.Date AV127Consultadeproduccion_fasesds_36_tfbarfasdti_to ;
   private java.util.Date AV32TFBarFasDTI_To ;
   private java.util.Date A2697ExHdrFeE ;
   private java.util.Date A2700ExHdrFeR ;
   private java.util.Date AV81ExHdrFeE ;
   private java.util.Date AV79ExHdrFeR ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV15OrderedDsc ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n2265BarExt ;
   private boolean n6173BarFasSec ;
   private boolean n2697ExHdrFeE ;
   private boolean n2700ExHdrFeR ;
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
   private GXSimpleCollection<Byte> AV105Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ;
   private GXSimpleCollection<Byte> AV130Consultadeproduccion_fasesds_39_tfbarfasest_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3Z2_A396EmprCod ;
   private int[] P0A3Z2_A129BarCod ;
   private boolean[] P0A3Z2_n129BarCod ;
   private byte[] P0A3Z2_A132BarCodReo ;
   private boolean[] P0A3Z2_n132BarCodReo ;
   private String[] P0A3Z2_A130BarCodPar ;
   private boolean[] P0A3Z2_n130BarCodPar ;
   private byte[] P0A3Z2_A3836BarFasPri ;
   private java.math.BigDecimal[] P0A3Z2_A3838BarFasMtr ;
   private boolean[] P0A3Z2_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0A3Z2_A3837BarFasKgm ;
   private boolean[] P0A3Z2_n3837BarFasKgm ;
   private byte[] P0A3Z2_A153BarFasEst ;
   private java.math.BigDecimal[] P0A3Z2_A215BarTieRea ;
   private java.util.Date[] P0A3Z2_A4442BarFasDTI ;
   private boolean[] P0A3Z2_n4442BarFasDTI ;
   private String[] P0A3Z2_A603MaqCodBis ;
   private String[] P0A3Z2_A460FasDsc ;
   private String[] P0A3Z2_A457FasCod ;
   private short[] P0A3Z2_A194BarOrdLin ;
   private java.util.Date[] P0A3Z2_A4443BarFasDTF ;
   private boolean[] P0A3Z2_n4443BarFasDTF ;
   private byte[] P0A3Z2_A2265BarExt ;
   private boolean[] P0A3Z2_n2265BarExt ;
   private byte[] P0A3Z2_A148BarEstReo ;
   private String[] P0A3Z2_A6173BarFasSec ;
   private boolean[] P0A3Z2_n6173BarFasSec ;
   private int[] P0A3Z2_A934BarReoCod ;
   private byte[] P0A3Z2_A936BarReoReo ;
   private String[] P0A3Z2_A935BarReoPar ;
   private String[] P0A3Z2_A758ProCod ;
   private String[] P0A3Z3_A396EmprCod ;
   private int[] P0A3Z3_A129BarCod ;
   private boolean[] P0A3Z3_n129BarCod ;
   private byte[] P0A3Z3_A132BarCodReo ;
   private boolean[] P0A3Z3_n132BarCodReo ;
   private String[] P0A3Z3_A130BarCodPar ;
   private boolean[] P0A3Z3_n130BarCodPar ;
   private String[] P0A3Z3_A2689ExHdrFas ;
   private java.util.Date[] P0A3Z3_A2697ExHdrFeE ;
   private boolean[] P0A3Z3_n2697ExHdrFeE ;
   private java.util.Date[] P0A3Z3_A2700ExHdrFeR ;
   private boolean[] P0A3Z3_n2700ExHdrFeR ;
   private short[] P0A3Z3_A2248ManCod ;
   private int[] P0A3Z3_A2692ExHdrLin ;
   private String[] P0A3Z4_A396EmprCod ;
   private int[] P0A3Z4_A129BarCod ;
   private boolean[] P0A3Z4_n129BarCod ;
   private byte[] P0A3Z4_A132BarCodReo ;
   private boolean[] P0A3Z4_n132BarCodReo ;
   private String[] P0A3Z4_A130BarCodPar ;
   private boolean[] P0A3Z4_n130BarCodPar ;
   private byte[] P0A3Z4_A3836BarFasPri ;
   private java.math.BigDecimal[] P0A3Z4_A3838BarFasMtr ;
   private boolean[] P0A3Z4_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0A3Z4_A3837BarFasKgm ;
   private boolean[] P0A3Z4_n3837BarFasKgm ;
   private byte[] P0A3Z4_A153BarFasEst ;
   private java.math.BigDecimal[] P0A3Z4_A215BarTieRea ;
   private java.util.Date[] P0A3Z4_A4442BarFasDTI ;
   private boolean[] P0A3Z4_n4442BarFasDTI ;
   private String[] P0A3Z4_A603MaqCodBis ;
   private String[] P0A3Z4_A460FasDsc ;
   private String[] P0A3Z4_A457FasCod ;
   private short[] P0A3Z4_A194BarOrdLin ;
   private java.util.Date[] P0A3Z4_A4443BarFasDTF ;
   private boolean[] P0A3Z4_n4443BarFasDTF ;
   private byte[] P0A3Z4_A2265BarExt ;
   private boolean[] P0A3Z4_n2265BarExt ;
   private byte[] P0A3Z4_A148BarEstReo ;
   private String[] P0A3Z4_A6173BarFasSec ;
   private boolean[] P0A3Z4_n6173BarFasSec ;
   private int[] P0A3Z4_A934BarReoCod ;
   private byte[] P0A3Z4_A936BarReoReo ;
   private String[] P0A3Z4_A935BarReoPar ;
   private String[] P0A3Z4_A758ProCod ;
   private String[] P0A3Z5_A396EmprCod ;
   private int[] P0A3Z5_A129BarCod ;
   private boolean[] P0A3Z5_n129BarCod ;
   private byte[] P0A3Z5_A132BarCodReo ;
   private boolean[] P0A3Z5_n132BarCodReo ;
   private String[] P0A3Z5_A130BarCodPar ;
   private boolean[] P0A3Z5_n130BarCodPar ;
   private String[] P0A3Z5_A2689ExHdrFas ;
   private java.util.Date[] P0A3Z5_A2697ExHdrFeE ;
   private boolean[] P0A3Z5_n2697ExHdrFeE ;
   private java.util.Date[] P0A3Z5_A2700ExHdrFeR ;
   private boolean[] P0A3Z5_n2700ExHdrFeR ;
   private short[] P0A3Z5_A2248ManCod ;
   private int[] P0A3Z5_A2692ExHdrLin ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class consultadeproduccion_fasesfullexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A3Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV105Consultadeproduccion_fasesfullds_16_tfbarfasest_sels ,
                                          short AV94Consultadeproduccion_fasesfullds_5_tfbarordlin ,
                                          short AV95Consultadeproduccion_fasesfullds_6_tfbarordlin_to ,
                                          String AV97Consultadeproduccion_fasesfullds_8_tffascod_sel ,
                                          String AV96Consultadeproduccion_fasesfullds_7_tffascod ,
                                          String AV99Consultadeproduccion_fasesfullds_10_tffasdsc_sel ,
                                          String AV98Consultadeproduccion_fasesfullds_9_tffasdsc ,
                                          String AV101Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel ,
                                          String AV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis ,
                                          java.util.Date AV102Consultadeproduccion_fasesfullds_13_tfbarfasdti ,
                                          java.math.BigDecimal AV103Consultadeproduccion_fasesfullds_14_tfbartierea ,
                                          java.math.BigDecimal AV104Consultadeproduccion_fasesfullds_15_tfbartierea_to ,
                                          int AV105Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV106Consultadeproduccion_fasesfullds_17_tfbarfaskgm ,
                                          java.math.BigDecimal AV107Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV108Consultadeproduccion_fasesfullds_19_tfbarfasmtr ,
                                          java.math.BigDecimal AV109Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to ,
                                          byte AV110Consultadeproduccion_fasesfullds_21_tfbarfaspri ,
                                          byte AV111Consultadeproduccion_fasesfullds_22_tfbarfaspri_to ,
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
                                          String A396EmprCod ,
                                          String AV10EmprCod ,
                                          int A129BarCod ,
                                          int AV11BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV12BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV13BarCodPar ,
                                          String AV90Consultadeproduccion_fasesfullds_1_emprcod ,
                                          int AV91Consultadeproduccion_fasesfullds_2_barcod ,
                                          byte AV92Consultadeproduccion_fasesfullds_3_barcodreo ,
                                          String AV93Consultadeproduccion_fasesfullds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[25];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis, T3.FasDsc," ;
      scmdbuf += " T1.FasCod, T1.BarOrdLin, T1.BarFasDTF, T2.BarExt, T2.BarEstReo, T1.BarFasSec, T2.BarReoCod, T2.BarReoReo, T2.BarReoPar, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN" ;
      scmdbuf += " TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV94Consultadeproduccion_fasesfullds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV95Consultadeproduccion_fasesfullds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV96Consultadeproduccion_fasesfullds_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Consultadeproduccion_fasesfullds_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV98Consultadeproduccion_fasesfullds_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Consultadeproduccion_fasesfullds_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV100Consultadeproduccion_fasesfullds_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Consultadeproduccion_fasesfullds_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Consultadeproduccion_fasesfullds_13_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Consultadeproduccion_fasesfullds_14_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Consultadeproduccion_fasesfullds_15_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( AV105Consultadeproduccion_fasesfullds_16_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV105Consultadeproduccion_fasesfullds_16_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Consultadeproduccion_fasesfullds_17_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Consultadeproduccion_fasesfullds_18_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Consultadeproduccion_fasesfullds_19_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Consultadeproduccion_fasesfullds_20_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV110Consultadeproduccion_fasesfullds_21_tfbarfaspri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV111Consultadeproduccion_fasesfullds_22_tfbarfaspri_to) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.FasDsc" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.FasDsc DESC" ;
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
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P0A3Z4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV130Consultadeproduccion_fasesds_39_tfbarfasest_sels ,
                                          short AV118Consultadeproduccion_fasesds_27_tfbarordlin ,
                                          short AV119Consultadeproduccion_fasesds_28_tfbarordlin_to ,
                                          String AV121Consultadeproduccion_fasesds_30_tffascod_sel ,
                                          String AV120Consultadeproduccion_fasesds_29_tffascod ,
                                          String AV123Consultadeproduccion_fasesds_32_tffasdsc_sel ,
                                          String AV122Consultadeproduccion_fasesds_31_tffasdsc ,
                                          String AV125Consultadeproduccion_fasesds_34_tfmaqcodbis_sel ,
                                          String AV124Consultadeproduccion_fasesds_33_tfmaqcodbis ,
                                          java.util.Date AV126Consultadeproduccion_fasesds_35_tfbarfasdti ,
                                          java.math.BigDecimal AV128Consultadeproduccion_fasesds_37_tfbartierea ,
                                          java.math.BigDecimal AV129Consultadeproduccion_fasesds_38_tfbartierea_to ,
                                          int AV130Consultadeproduccion_fasesds_39_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV131Consultadeproduccion_fasesds_40_tfbarfaskgm ,
                                          java.math.BigDecimal AV132Consultadeproduccion_fasesds_41_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV133Consultadeproduccion_fasesds_42_tfbarfasmtr ,
                                          java.math.BigDecimal AV134Consultadeproduccion_fasesds_43_tfbarfasmtr_to ,
                                          byte AV135Consultadeproduccion_fasesds_44_tfbarfaspri ,
                                          byte AV136Consultadeproduccion_fasesds_45_tfbarfaspri_to ,
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
                                          String A396EmprCod ,
                                          String AV10EmprCod ,
                                          int A129BarCod ,
                                          int AV11BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV12BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV13BarCodPar ,
                                          String AV114Consultadeproduccion_fasesds_23_emprcod ,
                                          int AV115Consultadeproduccion_fasesds_24_barcod ,
                                          byte AV116Consultadeproduccion_fasesds_25_barcodreo ,
                                          String AV117Consultadeproduccion_fasesds_26_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[25];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasPri, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasEst, T1.BarTieRea, T1.BarFasDTI, T1.MaqCodBis, T3.FasDsc," ;
      scmdbuf += " T1.FasCod, T1.BarOrdLin, T1.BarFasDTF, T2.BarExt, T2.BarEstReo, T1.BarFasSec, T2.BarReoCod, T2.BarReoReo, T2.BarReoPar, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN" ;
      scmdbuf += " TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV118Consultadeproduccion_fasesds_27_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV119Consultadeproduccion_fasesds_28_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Consultadeproduccion_fasesds_30_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV120Consultadeproduccion_fasesds_29_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Consultadeproduccion_fasesds_30_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Consultadeproduccion_fasesds_32_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV122Consultadeproduccion_fasesds_31_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Consultadeproduccion_fasesds_32_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Consultadeproduccion_fasesds_34_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV124Consultadeproduccion_fasesds_33_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Consultadeproduccion_fasesds_34_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV126Consultadeproduccion_fasesds_35_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Consultadeproduccion_fasesds_37_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Consultadeproduccion_fasesds_38_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( AV130Consultadeproduccion_fasesds_39_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Consultadeproduccion_fasesds_39_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Consultadeproduccion_fasesds_40_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Consultadeproduccion_fasesds_41_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Consultadeproduccion_fasesds_42_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Consultadeproduccion_fasesds_43_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV135Consultadeproduccion_fasesds_44_tfbarfaspri) )
      {
         addWhere(sWhereString, "(T1.BarFasPri >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV136Consultadeproduccion_fasesds_45_tfbarfaspri_to) )
      {
         addWhere(sWhereString, "(T1.BarFasPri <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.FasDsc" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.FasDsc DESC" ;
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

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0A3Z2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
            case 2 :
                  return conditional_P0A3Z4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3Z3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas, ExHdrFeE, ExHdrFeR, ManCod, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ExHdrFas = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3Z4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3Z5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas, ExHdrFeE, ExHdrFeR, ManCod, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ExHdrFas = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((String[]) buf[14])[0] = rslt.getString(12, 28);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(19);
               ((byte[]) buf[25])[0] = rslt.getByte(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 1);
               ((String[]) buf[27])[0] = rslt.getString(22, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((String[]) buf[14])[0] = rslt.getString(12, 28);
               ((String[]) buf[15])[0] = rslt.getString(13, 8);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(17);
               ((String[]) buf[22])[0] = rslt.getString(18, 2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(19);
               ((byte[]) buf[25])[0] = rslt.getByte(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 1);
               ((String[]) buf[27])[0] = rslt.getString(22, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
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
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
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
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

