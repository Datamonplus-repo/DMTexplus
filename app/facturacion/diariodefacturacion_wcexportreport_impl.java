package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class diariodefacturacion_wcexportreport_impl extends GXWebReport
{
   public diariodefacturacion_wcexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV53DiariodeFacturacion_json_GET = AV52Websession.getValue(httpContext.getMessage( "DiariodeFacturacion_json", "")) ;
         AV11DiariodeFacturacion_SDT.fromJSonString(AV53DiariodeFacturacion_json_GET, null);
         AV52Websession.remove(httpContext.getMessage( "DiariodeFacturacion_json", ""));
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
         AV37Title = httpContext.getMessage( "Lista de Diario de Facturacion", "") ;
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
         hA6M0( true, 0) ;
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
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41TFDiariodeFacturacion_SDT__Facfch)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFDiariodeFacturacion_SDT__Facfch_To)) ) )
      {
         hA6M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV41TFDiariodeFacturacion_SDT__Facfch, "99/99/99"), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFDiariodeFacturacion_SDT__Facfch_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Fecha", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA6M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFDiariodeFacturacion_SDT__Facfch_To_Description, "")), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV42TFDiariodeFacturacion_SDT__Facfch_To, "99/99/99"), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV44TFDiariodeFacturacion_SDT__Faccod) && (0==AV45TFDiariodeFacturacion_SDT__Faccod_To) ) )
      {
         hA6M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Factura", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TFDiariodeFacturacion_SDT__Faccod), "ZZZZZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV48TFDiariodeFacturacion_SDT__Faccod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Factura", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA6M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFDiariodeFacturacion_SDT__Faccod_To_Description, "")), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFDiariodeFacturacion_SDT__Faccod_To), "ZZZZZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV46TFDiariodeFacturacion_SDT__Clicod) && (0==AV47TFDiariodeFacturacion_SDT__Clicod_To) ) )
      {
         hA6M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFDiariodeFacturacion_SDT__Clicod), "ZZZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFDiariodeFacturacion_SDT__Clicod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA6M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFDiariodeFacturacion_SDT__Clicod_To_Description, "")), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47TFDiariodeFacturacion_SDT__Clicod_To), "ZZZZZ9")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFDiariodeFacturacion_SDT__CliNom)==0) )
      {
         hA6M0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 124, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFDiariodeFacturacion_SDT__CliNom, "")), 124, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA6M0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      hA6M0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 30, Gx_line+10, 102, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Factura", ""), 106, Gx_line+10, 178, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 182, Gx_line+10, 254, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 258, Gx_line+10, 330, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Total Bruto", ""), 334, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Imp. Dto. Gral.", ""), 410, Gx_line+10, 482, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Imp. Dto. PP.", ""), 486, Gx_line+10, 558, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Base Imponible", ""), 562, Gx_line+10, 634, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Imp. IVA", ""), 638, Gx_line+10, 710, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 714, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV11DiariodeFacturacion_SDT.size() )
      {
         AV10DiariodeFacturacion_SDTItem = (app.facturacion.SdtDiariodeFacturacion_SDT_Item)((app.facturacion.SdtDiariodeFacturacion_SDT_Item)AV11DiariodeFacturacion_SDT.elementAt(-1+AV59GXV1));
         AV13DiariodeFacturacion_SDTItem_Facfch = AV10DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facfch() ;
         AV14DiariodeFacturacion_SDTItem_Faccod = AV10DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Faccod() ;
         AV15DiariodeFacturacion_SDTItem_Clicod = AV10DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Clicod() ;
         AV16DiariodeFacturacion_SDTItem_CliNom = AV10DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Clinom() ;
         AV17DiariodeFacturacion_SDTItem_FacImpTot = AV10DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot() ;
         AV18DiariodeFacturacion_SDTItem_FacImpGen = AV10DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen() ;
         AV19DiariodeFacturacion_SDTItem_FacImpPP = AV10DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp() ;
         AV20DiariodeFacturacion_SDTItem_FacBasImp = AV10DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp() ;
         AV21DiariodeFacturacion_SDTItem_FacIVAImp = AV10DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp() ;
         AV22DiariodeFacturacion_SDTItem_FacTot = AV10DiariodeFacturacion_SDTItem.getgxTv_SdtDiariodeFacturacion_SDT_Item_Factot() ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S141 ();
         if (returnInSub) return;
         hA6M0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV13DiariodeFacturacion_SDTItem_Facfch, "99/99/99"), 30, Gx_line+10, 102, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14DiariodeFacturacion_SDTItem_Faccod), "ZZZZZZZ9")), 106, Gx_line+10, 178, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15DiariodeFacturacion_SDTItem_Clicod), "ZZZZZ9")), 182, Gx_line+10, 254, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16DiariodeFacturacion_SDTItem_CliNom, "")), 258, Gx_line+10, 330, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17DiariodeFacturacion_SDTItem_FacImpTot, "ZZZZZZZZZ9.99")), 334, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18DiariodeFacturacion_SDTItem_FacImpGen, "ZZZZZZZ9.99")), 410, Gx_line+10, 482, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19DiariodeFacturacion_SDTItem_FacImpPP, "ZZZZZZZ9.99")), 486, Gx_line+10, 558, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20DiariodeFacturacion_SDTItem_FacBasImp, "ZZZZZZZZZ9.99")), 562, Gx_line+10, 634, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21DiariodeFacturacion_SDTItem_FacIVAImp, "ZZZZZZZ9.99")), 638, Gx_line+10, 710, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22DiariodeFacturacion_SDTItem_FacTot, "ZZZZZZZZZ9.99")), 714, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+36) ;
         /* Execute user subroutine: 'AFTERPRINTLINE' */
         S161 ();
         if (returnInSub) return;
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("Facturacion.DiariodeFacturacion_WCGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.DiariodeFacturacion_WCGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("Facturacion.DiariodeFacturacion_WCGridState"), null, null);
      }
      AV39OrderedBy = AV25GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV40OrderedDsc = AV25GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV60GXV2 = 1 ;
      while ( AV60GXV2 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV2));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIARIODEFACTURACION_SDT__FACFCH") == 0 )
         {
            AV41TFDiariodeFacturacion_SDT__Facfch = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV42TFDiariodeFacturacion_SDT__Facfch_To = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIARIODEFACTURACION_SDT__FACCOD") == 0 )
         {
            AV44TFDiariodeFacturacion_SDT__Faccod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFDiariodeFacturacion_SDT__Faccod_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIARIODEFACTURACION_SDT__CLICOD") == 0 )
         {
            AV46TFDiariodeFacturacion_SDT__Clicod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFDiariodeFacturacion_SDT__Clicod_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIARIODEFACTURACION_SDT__CLINOM") == 0 )
         {
            AV50TFDiariodeFacturacion_SDT__CliNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV60GXV2 = (int)(AV60GXV2+1) ;
      }
   }

   public void S141( ) throws ProcessInterruptedException
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

   public void hA6M0( boolean bFoot ,
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
               AV35PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV32DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV37Title = AV56Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV53DiariodeFacturacion_json_GET = "" ;
      AV52Websession = httpContext.getWebSession();
      AV11DiariodeFacturacion_SDT = new GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item>(app.facturacion.SdtDiariodeFacturacion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Title = "" ;
      AV41TFDiariodeFacturacion_SDT__Facfch = GXutil.nullDate() ;
      AV42TFDiariodeFacturacion_SDT__Facfch_To = GXutil.nullDate() ;
      AV43TFDiariodeFacturacion_SDT__Facfch_To_Description = "" ;
      AV48TFDiariodeFacturacion_SDT__Faccod_To_Description = "" ;
      AV49TFDiariodeFacturacion_SDT__Clicod_To_Description = "" ;
      AV50TFDiariodeFacturacion_SDT__CliNom = "" ;
      AV10DiariodeFacturacion_SDTItem = new app.facturacion.SdtDiariodeFacturacion_SDT_Item(remoteHandle, context);
      AV13DiariodeFacturacion_SDTItem_Facfch = GXutil.nullDate() ;
      AV16DiariodeFacturacion_SDTItem_CliNom = "" ;
      AV17DiariodeFacturacion_SDTItem_FacImpTot = DecimalUtil.ZERO ;
      AV18DiariodeFacturacion_SDTItem_FacImpGen = DecimalUtil.ZERO ;
      AV19DiariodeFacturacion_SDTItem_FacImpPP = DecimalUtil.ZERO ;
      AV20DiariodeFacturacion_SDTItem_FacBasImp = DecimalUtil.ZERO ;
      AV21DiariodeFacturacion_SDTItem_FacIVAImp = DecimalUtil.ZERO ;
      AV22DiariodeFacturacion_SDTItem_FacTot = DecimalUtil.ZERO ;
      AV23Session = httpContext.getWebSession();
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV35PageInfo = "" ;
      AV32DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV56Pgmdesc = "" ;
      AV30AppName = "" ;
      Gx_date = GXutil.today( ) ;
      AV56Pgmdesc = httpContext.getMessage( "Diario de Facturacion", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV56Pgmdesc = httpContext.getMessage( "Diario de Facturacion", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV39OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV44TFDiariodeFacturacion_SDT__Faccod ;
   private int AV45TFDiariodeFacturacion_SDT__Faccod_To ;
   private int AV46TFDiariodeFacturacion_SDT__Clicod ;
   private int AV47TFDiariodeFacturacion_SDT__Clicod_To ;
   private int AV59GXV1 ;
   private int AV14DiariodeFacturacion_SDTItem_Faccod ;
   private int AV15DiariodeFacturacion_SDTItem_Clicod ;
   private int AV60GXV2 ;
   private java.math.BigDecimal AV17DiariodeFacturacion_SDTItem_FacImpTot ;
   private java.math.BigDecimal AV18DiariodeFacturacion_SDTItem_FacImpGen ;
   private java.math.BigDecimal AV19DiariodeFacturacion_SDTItem_FacImpPP ;
   private java.math.BigDecimal AV20DiariodeFacturacion_SDTItem_FacBasImp ;
   private java.math.BigDecimal AV21DiariodeFacturacion_SDTItem_FacIVAImp ;
   private java.math.BigDecimal AV22DiariodeFacturacion_SDTItem_FacTot ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV50TFDiariodeFacturacion_SDT__CliNom ;
   private String AV16DiariodeFacturacion_SDTItem_CliNom ;
   private String AV56Pgmdesc ;
   private java.util.Date AV41TFDiariodeFacturacion_SDT__Facfch ;
   private java.util.Date AV42TFDiariodeFacturacion_SDT__Facfch_To ;
   private java.util.Date AV13DiariodeFacturacion_SDTItem_Facfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV40OrderedDsc ;
   private String AV53DiariodeFacturacion_json_GET ;
   private String AV37Title ;
   private String AV43TFDiariodeFacturacion_SDT__Facfch_To_Description ;
   private String AV48TFDiariodeFacturacion_SDT__Faccod_To_Description ;
   private String AV49TFDiariodeFacturacion_SDT__Clicod_To_Description ;
   private String AV35PageInfo ;
   private String AV32DateInfo ;
   private String AV30AppName ;
   private com.genexus.webpanels.WebSession AV52Websession ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item> AV11DiariodeFacturacion_SDT ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.facturacion.SdtDiariodeFacturacion_SDT_Item AV10DiariodeFacturacion_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

