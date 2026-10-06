package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cargasproduccionporfase_usuwcexportreport_impl extends GXWebReport
{
   public cargasproduccionporfase_usuwcexportreport_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "jsonBarCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV135jsonBarCod = gxfirstwebparm ;
      }
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
         AV134cBarCod.fromJSonString(AV135jsonBarCod, null);
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
         AV92Title = httpContext.getMessage( "Lista de Tabla BARFAS", "") ;
         AV11Fascod = GXutil.upper( GXutil.trim( AV127webSession.getValue("FiltroProduccionporFase_FasCod"))) ;
         AV127webSession.remove("FiltroProduccionporFase_FasCod");
         GXt_char2 = AV130FasDsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( AV10Emprcod, AV11Fascod, GXv_char3) ;
         cargasproduccionporfase_usuwcexportreport_impl.this.GXt_char2 = GXv_char3[0] ;
         AV130FasDsc = GXt_char2 ;
         /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
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
         /* Execute user subroutine: 'PRINTFOOTER' */
         S161 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hA030( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV23FilterFullText)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23FilterFullText, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV95TFMaqCodBis_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95TFMaqCodBis_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV94TFMaqCodBis)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94TFMaqCodBis, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV34TFBarFasEst_Sels.fromJSonString(AV32TFBarFasEst_SelsJson, null);
      if ( ! ( AV34TFBarFasEst_Sels.size() == 0 ) )
      {
         AV81i = 1 ;
         AV145GXV1 = 1 ;
         while ( AV145GXV1 <= AV34TFBarFasEst_Sels.size() )
         {
            AV35TFBarFasEst_Sel = ((Number) AV34TFBarFasEst_Sels.elementAt(-1+AV145GXV1)).byteValue() ;
            if ( AV81i == 1 )
            {
               AV33TFBarFasEst_SelDscs = "" ;
            }
            else
            {
               AV33TFBarFasEst_SelDscs += ", " ;
            }
            AV72FilterTFBarFasEst_SelValueDescription = "" ;
            if ( AV35TFBarFasEst_Sel == 0 )
            {
               AV72FilterTFBarFasEst_SelValueDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( AV35TFBarFasEst_Sel == 1 )
            {
               AV72FilterTFBarFasEst_SelValueDescription = httpContext.getMessage( "En Proceso (Fase Ini)", "") ;
            }
            else if ( AV35TFBarFasEst_Sel == 2 )
            {
               AV72FilterTFBarFasEst_SelValueDescription = httpContext.getMessage( "En Proceso  (Fase Fin)", "") ;
            }
            AV33TFBarFasEst_SelDscs += AV72FilterTFBarFasEst_SelValueDescription ;
            AV81i = (long)(AV81i+1) ;
            AV145GXV1 = (int)(AV145GXV1+1) ;
         }
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado Fase", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFBarFasEst_SelDscs, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV38TFCliCod) && (0==AV39TFCliCod_To) ) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38TFCliCod), "ZZZZZ9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV74TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFCliCod_To_Description, "")), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39TFCliCod_To), "ZZZZZ9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCliNom_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre.Cli", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFCliNom_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV40TFCliNom)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre.Cli", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFCliNom, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV43TFBarEncCli_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Disp.Cli", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFBarEncCli_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV42TFBarEncCli)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Disp.Cli", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFBarEncCli, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV45TFBarNHdr_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFBarNHdr_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV44TFBarNHdr)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFBarNHdr, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV46TFBarSit) && (0==AV47TFBarSit_To) ) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Sit.", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFBarSit), "Z9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV75TFBarSit_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Sit.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFBarSit_To_Description, "")), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47TFBarSit_To), "Z9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSer_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFBarSer_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV48TFBarSer)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFBarSer, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV51TFBarSerDsc_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFBarSerDsc_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV50TFBarSerDsc)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFBarSerDsc, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV53TFBarColNom_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFBarColNom_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV52TFBarColNom)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFBarColNom, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV54TFBarColNum) && (0==AV55TFBarColNum_To) ) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Número", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54TFBarColNum), "ZZZZZ9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV76TFBarColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Número", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TFBarColNum_To_Description, "")), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55TFBarColNum_To), "ZZZZZ9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV56TFBarTipCol) && (0==AV57TFBarTipCol_To) ) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV56TFBarTipCol), "Z9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV77TFBarTipCol_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "TC", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFBarTipCol_To_Description, "")), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV57TFBarTipCol_To), "Z9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarNomCli_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color.Cli", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFBarNomCli_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV58TFBarNomCli)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color.Cli", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFBarNomCli, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFBarKgm_To)==0) ) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kgs.", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60TFBarKgm, "ZZZZZ9.99")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV78TFBarKgm_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Kgs.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFBarKgm_To_Description, "")), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61TFBarKgm_To, "ZZZZZ9.99")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFBarMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFBarMtr_To)==0) ) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Mts.", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62TFBarMtr, "ZZZZZ9.99")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV79TFBarMtr_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Mts.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFBarMtr_To_Description, "")), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV63TFBarMtr_To, "ZZZZZ9.99")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV65TFBarFasCod_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("", 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFBarFasCod_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV64TFBarFasCod)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("", 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFBarFasCod, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV66TFBarFasLin) && (0==AV67TFBarFasLin_To) ) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "#Ult.Fase", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV66TFBarFasLin), "ZZZ9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV80TFBarFasLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "#Ult.Fase", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFBarFasLin_To_Description, "")), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67TFBarFasLin_To), "ZZZ9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV69TFBarFasSig_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("", 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFBarFasSig_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV68TFBarFasSig)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("", 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68TFBarFasSig, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV36TFBarOrdLin) && (0==AV37TFBarOrdLin_To) ) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "# Act", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV36TFBarOrdLin), "ZZZ9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV73TFBarOrdLin_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "# Act", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73TFBarOrdLin_To_Description, "")), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFBarOrdLin_To), "ZZZ9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV105TFBarDibCli_Sel)==0) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Dibujo", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV105TFBarDibCli_Sel, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV104TFBarDibCli)==0) )
         {
            hA030( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dibujo", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104TFBarDibCli, "")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV109TFBarAcaAnh) && (0==AV110TFBarAcaAnh_To) ) )
      {
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Caderno", ""), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV109TFBarAcaAnh), "ZZZ9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV111TFBarAcaAnh_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Caderno", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA030( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111TFBarAcaAnh_To_Description, "")), 25, Gx_line+0, 118, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV110TFBarAcaAnh_To), "ZZZ9")), 118, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA030( false, 35) ;
      getPrinter().GxDrawLine(25, Gx_line+23, 789, Gx_line+23, 2, 149, 0, 0, 0) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "FASE:", ""), 251, Gx_line+4, 283, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Fascod, "@!")), 326, Gx_line+3, 419, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130FasDsc, "")), 443, Gx_line+3, 590, Gx_line+18, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+35) ;
      if ( AV112IsAuthorizedBarMtr )
      {
         AV114BarMtrTitle = httpContext.getMessage( "Mts.", "") ;
      }
      hA030( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado Fase", ""), 30, Gx_line+10, 85, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre.Cli", ""), 89, Gx_line+10, 199, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Disp.Cli", ""), 203, Gx_line+10, 313, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 317, Gx_line+10, 372, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Sit.", ""), 376, Gx_line+10, 431, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Artículo", ""), 435, Gx_line+10, 547, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 551, Gx_line+10, 607, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color.Cli", ""), 611, Gx_line+10, 667, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Kgs.", ""), 671, Gx_line+10, 727, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114BarMtrTitle, "")), 731, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue("CargasProduccionporFase_WCGridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CargasProduccionporFase_WCGridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV28Session.getValue("CargasProduccionporFase_WCGridState"), null, null);
      }
      AV21OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV22OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV146GXV2 = 1 ;
      while ( AV146GXV2 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV146GXV2));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV23FilterFullText = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV94TFMaqCodBis = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV95TFMaqCodBis_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV32TFBarFasEst_SelsJson = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV34TFBarFasEst_Sels.fromJSonString(AV32TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV42TFBarEncCli = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV43TFBarEncCli_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV44TFBarNHdr = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV45TFBarNHdr_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV46TFBarSit = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFBarSit_To = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV48TFBarSer = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV49TFBarSer_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV50TFBarSerDsc = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV51TFBarSerDsc_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV52TFBarColNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV53TFBarColNom_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV54TFBarColNum = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFBarColNum_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV56TFBarTipCol = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarTipCol_To = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV58TFBarNomCli = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV59TFBarNomCli_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV60TFBarKgm = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFBarKgm_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV62TFBarMtr = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFBarMtr_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV64TFBarFasCod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV65TFBarFasCod_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASLIN") == 0 )
         {
            AV66TFBarFasLin = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFBarFasLin_To = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV68TFBarFasSig = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV69TFBarFasSig_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV36TFBarOrdLin = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFBarOrdLin_To = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDIBCLI") == 0 )
         {
            AV104TFBarDibCli = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDIBCLI_SEL") == 0 )
         {
            AV105TFBarDibCli_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAANH") == 0 )
         {
            AV109TFBarAcaAnh = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV110TFBarAcaAnh_To = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10Emprcod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASCOD") == 0 )
         {
            AV11Fascod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV12Clicod = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV13Clicod_to = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV14BarFecgen = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV15BarFecGen_to = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV16BarSIt = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV17Barsit_to = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFASEST") == 0 )
         {
            AV18BarfasEst = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFASEST_TO") == 0 )
         {
            AV19BarFasEst_to = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARACAANH") == 0 )
         {
            AV20BarAcaAnh = (short)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV146GXV2 = (int)(AV146GXV2+1) ;
      }
      AV10Emprcod = AV127webSession.getValue("EmprCod") ;
      AV11Fascod = AV127webSession.getValue("FasCod") ;
      AV12Clicod = (int)(GXutil.lval( AV127webSession.getValue("CliCod"))) ;
      AV13Clicod_to = (int)(GXutil.lval( AV127webSession.getValue("CliCod_to"))) ;
      AV14BarFecgen = localUtil.ctod( AV127webSession.getValue("BarFecGen"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV15BarFecGen_to = localUtil.ctod( AV127webSession.getValue("BarFecGen_to"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV16BarSIt = (byte)(GXutil.lval( AV127webSession.getValue("BarSit"))) ;
      AV17Barsit_to = (byte)(GXutil.lval( AV127webSession.getValue("BarSit_to"))) ;
      AV18BarfasEst = (byte)(GXutil.lval( AV127webSession.getValue("BarFasEst"))) ;
      AV19BarFasEst_to = (byte)(GXutil.lval( AV127webSession.getValue("BarFasEst_to"))) ;
      AV20BarAcaAnh = (short)(GXutil.lval( AV127webSession.getValue("BarAcaAnh"))) ;
      AV127webSession.remove("EmprCod");
      AV127webSession.remove("FasCod");
      AV127webSession.remove("CliCod");
      AV127webSession.remove("CliCod_to");
      AV127webSession.remove("BarFecGen");
      AV127webSession.remove("BarFecGen_to");
      AV127webSession.remove("BarSit");
      AV127webSession.remove("BarSit_to");
      AV127webSession.remove("BarFasEst");
      AV127webSession.remove("BarFasEst_to");
      AV127webSession.remove("BarAcaAnh");
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
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      AV112IsAuthorizedBarMtr = (boolean)(((AV133fio==0))) ;
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV131TotBarMtr = DecimalUtil.doubleToDec(0) ;
      AV132TotBarKgm = DecimalUtil.doubleToDec(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(A129BarCod) ,
                                           AV134cBarCod ,
                                           Integer.valueOf(AV134cBarCod.size()) ,
                                           Short.valueOf(AV21OrderedBy) ,
                                           Boolean.valueOf(AV22OrderedDsc) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV12Clicod) ,
                                           Integer.valueOf(AV13Clicod_to) ,
                                           A159BarFecGen ,
                                           AV14BarFecgen ,
                                           AV15BarFecGen_to ,
                                           Byte.valueOf(A213BarSit) ,
                                           Byte.valueOf(AV16BarSIt) ,
                                           Byte.valueOf(AV17Barsit_to) ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           Byte.valueOf(AV18BarfasEst) ,
                                           Byte.valueOf(AV19BarFasEst_to) ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           Short.valueOf(AV20BarAcaAnh) ,
                                           AV10Emprcod ,
                                           AV11Fascod ,
                                           A396EmprCod ,
                                           A457FasCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A033 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV11Fascod, Integer.valueOf(AV12Clicod), Integer.valueOf(AV13Clicod_to), AV14BarFecgen, AV15BarFecGen_to, Byte.valueOf(AV16BarSIt), Byte.valueOf(AV17Barsit_to), Byte.valueOf(AV18BarfasEst), Byte.valueOf(AV19BarFasEst_to), Short.valueOf(AV20BarAcaAnh), Short.valueOf(AV20BarAcaAnh)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4466BarAcaAnh = P0A033_A4466BarAcaAnh[0] ;
         A153BarFasEst = P0A033_A153BarFasEst[0] ;
         A213BarSit = P0A033_A213BarSit[0] ;
         A159BarFecGen = P0A033_A159BarFecGen[0] ;
         A252CliCod = P0A033_A252CliCod[0] ;
         n252CliCod = P0A033_n252CliCod[0] ;
         A457FasCod = P0A033_A457FasCod[0] ;
         A396EmprCod = P0A033_A396EmprCod[0] ;
         A1798BarDibCli = P0A033_A1798BarDibCli[0] ;
         A194BarOrdLin = P0A033_A194BarOrdLin[0] ;
         A1234BarNomCli = P0A033_A1234BarNomCli[0] ;
         A218BarTipCol = P0A033_A218BarTipCol[0] ;
         A136BarColNum = P0A033_A136BarColNum[0] ;
         A135BarColNom = P0A033_A135BarColNom[0] ;
         A1652BarSerDsc = P0A033_A1652BarSerDsc[0] ;
         A212BarSer = P0A033_A212BarSer[0] ;
         A4812BarEncCli = P0A033_A4812BarEncCli[0] ;
         A279CliNom = P0A033_A279CliNom[0] ;
         A603MaqCodBis = P0A033_A603MaqCodBis[0] ;
         A184BarMtr = P0A033_A184BarMtr[0] ;
         A166BarKgm = P0A033_A166BarKgm[0] ;
         A130BarCodPar = P0A033_A130BarCodPar[0] ;
         A132BarCodReo = P0A033_A132BarCodReo[0] ;
         A129BarCod = P0A033_A129BarCod[0] ;
         A758ProCod = P0A033_A758ProCod[0] ;
         A4466BarAcaAnh = P0A033_A4466BarAcaAnh[0] ;
         A213BarSit = P0A033_A213BarSit[0] ;
         A159BarFecGen = P0A033_A159BarFecGen[0] ;
         A252CliCod = P0A033_A252CliCod[0] ;
         n252CliCod = P0A033_n252CliCod[0] ;
         A1798BarDibCli = P0A033_A1798BarDibCli[0] ;
         A1234BarNomCli = P0A033_A1234BarNomCli[0] ;
         A218BarTipCol = P0A033_A218BarTipCol[0] ;
         A136BarColNum = P0A033_A136BarColNum[0] ;
         A135BarColNom = P0A033_A135BarColNom[0] ;
         A1652BarSerDsc = P0A033_A1652BarSerDsc[0] ;
         A212BarSer = P0A033_A212BarSer[0] ;
         A4812BarEncCli = P0A033_A4812BarEncCli[0] ;
         A279CliNom = P0A033_A279CliNom[0] ;
         A184BarMtr = P0A033_A184BarMtr[0] ;
         A166BarKgm = P0A033_A166BarKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV24BarFasEstDescription = "" ;
         if ( A153BarFasEst == 0 )
         {
            AV24BarFasEstDescription = httpContext.getMessage( "Pendiente", "") ;
         }
         else if ( A153BarFasEst == 1 )
         {
            AV24BarFasEstDescription = httpContext.getMessage( "En Proceso (Fase Ini)", "") ;
         }
         else if ( A153BarFasEst == 2 )
         {
            AV24BarFasEstDescription = httpContext.getMessage( "En Proceso  (Fase Fin)", "") ;
         }
         if ( AV112IsAuthorizedBarMtr )
         {
            AV113BarMtrData = GXutil.trim( localUtil.format( A184BarMtr, "ZZZZZ9.99")) ;
         }
         AV131TotBarMtr = AV131TotBarMtr.add(A184BarMtr) ;
         AV132TotBarKgm = AV132TotBarKgm.add(A166BarKgm) ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S141 ();
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
         hA030( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24BarFasEstDescription, "")), 30, Gx_line+10, 85, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 89, Gx_line+10, 199, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 203, Gx_line+10, 313, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), 317, Gx_line+10, 372, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")), 376, Gx_line+10, 431, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 435, Gx_line+10, 547, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 551, Gx_line+10, 607, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 611, Gx_line+10, 667, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")), 671, Gx_line+10, 727, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113BarMtrData, "")), 731, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      hA030( false, 30) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV131TotBarMtr, "ZZZZZ9.99")), 723, Gx_line+8, 790, Gx_line+23, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV132TotBarKgm, "ZZZZZ9.99")), 657, Gx_line+8, 724, Gx_line+23, 2+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+30) ;
   }

   public void hA030( boolean bFoot ,
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
               AV90PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV87DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV85AppName = AV126EmprNom ;
            AV92Title = AV142Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 12, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85AppName, "")), 30, Gx_line+19, 789, Gx_line+34, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 18, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV135jsonBarCod = "" ;
      AV134cBarCod = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV92Title = "" ;
      AV11Fascod = "" ;
      AV127webSession = httpContext.getWebSession();
      AV130FasDsc = "" ;
      GXt_char2 = "" ;
      AV10Emprcod = "" ;
      GXv_char3 = new String[1] ;
      AV23FilterFullText = "" ;
      AV95TFMaqCodBis_Sel = "" ;
      AV94TFMaqCodBis = "" ;
      AV34TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV32TFBarFasEst_SelsJson = "" ;
      AV33TFBarFasEst_SelDscs = "" ;
      AV72FilterTFBarFasEst_SelValueDescription = "" ;
      AV74TFCliCod_To_Description = "" ;
      AV41TFCliNom_Sel = "" ;
      AV40TFCliNom = "" ;
      AV43TFBarEncCli_Sel = "" ;
      AV42TFBarEncCli = "" ;
      AV45TFBarNHdr_Sel = "" ;
      AV44TFBarNHdr = "" ;
      AV75TFBarSit_To_Description = "" ;
      AV49TFBarSer_Sel = "" ;
      AV48TFBarSer = "" ;
      AV51TFBarSerDsc_Sel = "" ;
      AV50TFBarSerDsc = "" ;
      AV53TFBarColNom_Sel = "" ;
      AV52TFBarColNom = "" ;
      AV76TFBarColNum_To_Description = "" ;
      AV77TFBarTipCol_To_Description = "" ;
      AV59TFBarNomCli_Sel = "" ;
      AV58TFBarNomCli = "" ;
      AV60TFBarKgm = DecimalUtil.ZERO ;
      AV61TFBarKgm_To = DecimalUtil.ZERO ;
      AV78TFBarKgm_To_Description = "" ;
      AV62TFBarMtr = DecimalUtil.ZERO ;
      AV63TFBarMtr_To = DecimalUtil.ZERO ;
      AV79TFBarMtr_To_Description = "" ;
      AV65TFBarFasCod_Sel = "" ;
      AV64TFBarFasCod = "" ;
      AV80TFBarFasLin_To_Description = "" ;
      AV69TFBarFasSig_Sel = "" ;
      AV68TFBarFasSig = "" ;
      AV73TFBarOrdLin_To_Description = "" ;
      AV105TFBarDibCli_Sel = "" ;
      AV104TFBarDibCli = "" ;
      AV111TFBarAcaAnh_To_Description = "" ;
      AV114BarMtrTitle = "" ;
      AV28Session = httpContext.getWebSession();
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV14BarFecgen = GXutil.nullDate() ;
      AV15BarFecGen_to = GXutil.nullDate() ;
      AV131TotBarMtr = DecimalUtil.ZERO ;
      AV132TotBarKgm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      P0A033_A4466BarAcaAnh = new short[1] ;
      P0A033_A153BarFasEst = new byte[1] ;
      P0A033_A213BarSit = new byte[1] ;
      P0A033_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0A033_A252CliCod = new int[1] ;
      P0A033_n252CliCod = new boolean[] {false} ;
      P0A033_A457FasCod = new String[] {""} ;
      P0A033_A396EmprCod = new String[] {""} ;
      P0A033_A1798BarDibCli = new String[] {""} ;
      P0A033_A194BarOrdLin = new short[1] ;
      P0A033_A1234BarNomCli = new String[] {""} ;
      P0A033_A218BarTipCol = new byte[1] ;
      P0A033_A136BarColNum = new int[1] ;
      P0A033_A135BarColNom = new String[] {""} ;
      P0A033_A1652BarSerDsc = new String[] {""} ;
      P0A033_A212BarSer = new String[] {""} ;
      P0A033_A4812BarEncCli = new String[] {""} ;
      P0A033_A279CliNom = new String[] {""} ;
      P0A033_A603MaqCodBis = new String[] {""} ;
      P0A033_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A033_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A033_A130BarCodPar = new String[] {""} ;
      P0A033_A132BarCodReo = new byte[1] ;
      P0A033_A129BarCod = new int[1] ;
      P0A033_A758ProCod = new String[] {""} ;
      A1798BarDibCli = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A4812BarEncCli = "" ;
      A279CliNom = "" ;
      A603MaqCodBis = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A13696BarNHdr = "" ;
      AV24BarFasEstDescription = "" ;
      AV113BarMtrData = "" ;
      AV90PageInfo = "" ;
      AV87DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV85AppName = "" ;
      AV126EmprNom = "" ;
      AV142Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.cargasproduccionporfase_usuwcexportreport__default(),
         new Object[] {
             new Object[] {
            P0A033_A4466BarAcaAnh, P0A033_A153BarFasEst, P0A033_A213BarSit, P0A033_A159BarFecGen, P0A033_A252CliCod, P0A033_n252CliCod, P0A033_A457FasCod, P0A033_A396EmprCod, P0A033_A1798BarDibCli, P0A033_A194BarOrdLin,
            P0A033_A1234BarNomCli, P0A033_A218BarTipCol, P0A033_A136BarColNum, P0A033_A135BarColNom, P0A033_A1652BarSerDsc, P0A033_A212BarSer, P0A033_A4812BarEncCli, P0A033_A279CliNom, P0A033_A603MaqCodBis, P0A033_A184BarMtr,
            P0A033_A166BarKgm, P0A033_A130BarCodPar, P0A033_A132BarCodReo, P0A033_A129BarCod, P0A033_A758ProCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV142Pgmdesc = httpContext.getMessage( "Informe Producción por Fase", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV142Pgmdesc = httpContext.getMessage( "Informe Producción por Fase", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV35TFBarFasEst_Sel ;
   private byte AV46TFBarSit ;
   private byte AV47TFBarSit_To ;
   private byte AV56TFBarTipCol ;
   private byte AV57TFBarTipCol_To ;
   private byte AV16BarSIt ;
   private byte AV17Barsit_to ;
   private byte AV18BarfasEst ;
   private byte AV19BarFasEst_to ;
   private byte AV133fio ;
   private byte A213BarSit ;
   private byte A153BarFasEst ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV66TFBarFasLin ;
   private short AV67TFBarFasLin_To ;
   private short AV36TFBarOrdLin ;
   private short AV37TFBarOrdLin_To ;
   private short AV109TFBarAcaAnh ;
   private short AV110TFBarAcaAnh_To ;
   private short AV21OrderedBy ;
   private short AV20BarAcaAnh ;
   private short A4466BarAcaAnh ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV145GXV1 ;
   private int AV38TFCliCod ;
   private int AV39TFCliCod_To ;
   private int AV54TFBarColNum ;
   private int AV55TFBarColNum_To ;
   private int AV146GXV2 ;
   private int AV12Clicod ;
   private int AV13Clicod_to ;
   private int AV134cBarCod_size ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private long AV81i ;
   private java.math.BigDecimal AV60TFBarKgm ;
   private java.math.BigDecimal AV61TFBarKgm_To ;
   private java.math.BigDecimal AV62TFBarMtr ;
   private java.math.BigDecimal AV63TFBarMtr_To ;
   private java.math.BigDecimal AV131TotBarMtr ;
   private java.math.BigDecimal AV132TotBarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV11Fascod ;
   private String AV130FasDsc ;
   private String GXt_char2 ;
   private String AV10Emprcod ;
   private String GXv_char3[] ;
   private String AV95TFMaqCodBis_Sel ;
   private String AV94TFMaqCodBis ;
   private String AV41TFCliNom_Sel ;
   private String AV40TFCliNom ;
   private String AV43TFBarEncCli_Sel ;
   private String AV42TFBarEncCli ;
   private String AV45TFBarNHdr_Sel ;
   private String AV44TFBarNHdr ;
   private String AV49TFBarSer_Sel ;
   private String AV48TFBarSer ;
   private String AV51TFBarSerDsc_Sel ;
   private String AV50TFBarSerDsc ;
   private String AV53TFBarColNom_Sel ;
   private String AV52TFBarColNom ;
   private String AV59TFBarNomCli_Sel ;
   private String AV58TFBarNomCli ;
   private String AV65TFBarFasCod_Sel ;
   private String AV64TFBarFasCod ;
   private String AV69TFBarFasSig_Sel ;
   private String AV68TFBarFasSig ;
   private String AV105TFBarDibCli_Sel ;
   private String AV104TFBarDibCli ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A1798BarDibCli ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A4812BarEncCli ;
   private String A279CliNom ;
   private String A603MaqCodBis ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A13696BarNHdr ;
   private String AV126EmprNom ;
   private String AV142Pgmdesc ;
   private java.util.Date AV14BarFecgen ;
   private java.util.Date AV15BarFecGen_to ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV112IsAuthorizedBarMtr ;
   private boolean AV22OrderedDsc ;
   private boolean n252CliCod ;
   private String AV32TFBarFasEst_SelsJson ;
   private String AV135jsonBarCod ;
   private String AV92Title ;
   private String AV23FilterFullText ;
   private String AV33TFBarFasEst_SelDscs ;
   private String AV72FilterTFBarFasEst_SelValueDescription ;
   private String AV74TFCliCod_To_Description ;
   private String AV75TFBarSit_To_Description ;
   private String AV76TFBarColNum_To_Description ;
   private String AV77TFBarTipCol_To_Description ;
   private String AV78TFBarKgm_To_Description ;
   private String AV79TFBarMtr_To_Description ;
   private String AV80TFBarFasLin_To_Description ;
   private String AV73TFBarOrdLin_To_Description ;
   private String AV111TFBarAcaAnh_To_Description ;
   private String AV114BarMtrTitle ;
   private String AV24BarFasEstDescription ;
   private String AV113BarMtrData ;
   private String AV90PageInfo ;
   private String AV87DateInfo ;
   private String AV85AppName ;
   private GXSimpleCollection<Byte> AV34TFBarFasEst_Sels ;
   private GXSimpleCollection<Integer> AV134cBarCod ;
   private com.genexus.webpanels.WebSession AV127webSession ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private IDataStoreProvider pr_default ;
   private short[] P0A033_A4466BarAcaAnh ;
   private byte[] P0A033_A153BarFasEst ;
   private byte[] P0A033_A213BarSit ;
   private java.util.Date[] P0A033_A159BarFecGen ;
   private int[] P0A033_A252CliCod ;
   private boolean[] P0A033_n252CliCod ;
   private String[] P0A033_A457FasCod ;
   private String[] P0A033_A396EmprCod ;
   private String[] P0A033_A1798BarDibCli ;
   private short[] P0A033_A194BarOrdLin ;
   private String[] P0A033_A1234BarNomCli ;
   private byte[] P0A033_A218BarTipCol ;
   private int[] P0A033_A136BarColNum ;
   private String[] P0A033_A135BarColNom ;
   private String[] P0A033_A1652BarSerDsc ;
   private String[] P0A033_A212BarSer ;
   private String[] P0A033_A4812BarEncCli ;
   private String[] P0A033_A279CliNom ;
   private String[] P0A033_A603MaqCodBis ;
   private java.math.BigDecimal[] P0A033_A184BarMtr ;
   private java.math.BigDecimal[] P0A033_A166BarKgm ;
   private String[] P0A033_A130BarCodPar ;
   private byte[] P0A033_A132BarCodReo ;
   private int[] P0A033_A129BarCod ;
   private String[] P0A033_A758ProCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
}

final  class cargasproduccionporfase_usuwcexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A033( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int A129BarCod ,
                                          GXSimpleCollection<Integer> AV134cBarCod ,
                                          int AV134cBarCod_size ,
                                          short AV21OrderedBy ,
                                          boolean AV22OrderedDsc ,
                                          int A252CliCod ,
                                          int AV12Clicod ,
                                          int AV13Clicod_to ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date AV14BarFecgen ,
                                          java.util.Date AV15BarFecGen_to ,
                                          byte A213BarSit ,
                                          byte AV16BarSIt ,
                                          byte AV17Barsit_to ,
                                          byte A153BarFasEst ,
                                          byte AV18BarfasEst ,
                                          byte AV19BarFasEst_to ,
                                          short A4466BarAcaAnh ,
                                          short AV20BarAcaAnh ,
                                          String AV10Emprcod ,
                                          String AV11Fascod ,
                                          String A396EmprCod ,
                                          String A457FasCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.BarAcaAnh, T1.BarFasEst, T2.BarSit, T2.BarFecGen, T2.CliCod, T1.FasCod, T1.EmprCod, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum," ;
      scmdbuf += " T2.BarColNom, T2.BarSerDsc, T2.BarSer, T2.BarEncCli, T3.CliNom, T1.MaqCodBis, COALESCE( T4.BarMtr, 0) AS BarMtr, COALESCE( T4.BarKgm, 0) AS BarKgm, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.ProCod FROM (((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod" ;
      scmdbuf += " = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.FasCod = ?)");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      if ( ! ( AV134cBarCod_size <= 0 ) )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV134cBarCod, "T1.BarCod IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( AV21OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis" ;
      }
      else if ( ( AV21OrderedBy == 2 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis DESC" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFasEst" ;
      }
      else if ( ( AV21OrderedBy == 3 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFasEst DESC" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV21OrderedBy == 4 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV21OrderedBy == 5 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarEncCli" ;
      }
      else if ( ( AV21OrderedBy == 6 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarEncCli DESC" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV21OrderedBy == 7 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV21OrderedBy == 8 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV21OrderedBy == 9 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV21OrderedBy == 10 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV21OrderedBy == 10 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV21OrderedBy == 11 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV21OrderedBy == 11 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV21OrderedBy == 12 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV21OrderedBy == 12 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV21OrderedBy == 13 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV21OrderedBy == 13 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV21OrderedBy == 14 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV21OrderedBy == 14 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV21OrderedBy == 15 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarDibCli" ;
      }
      else if ( ( AV21OrderedBy == 15 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarDibCli DESC" ;
      }
      else if ( ( AV21OrderedBy == 16 ) && ! AV22OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarAcaAnh" ;
      }
      else if ( ( AV21OrderedBy == 16 ) && ( AV22OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarAcaAnh DESC" ;
      }
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P0A033(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (GXSimpleCollection<Integer>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).shortValue() , ((Boolean) dynConstraints[4]).booleanValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A033", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(22);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 8);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               return;
      }
   }

}

