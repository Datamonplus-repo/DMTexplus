package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta__fases_wc_impl extends GXWebComponent
{
   public hojaderuta__fases_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public hojaderuta__fases_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta__fases_wc_impl.class ));
   }

   public hojaderuta__fases_wc_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbavAccionesfases = new HTMLChoice();
      cmbFaseExteri = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            gxfirstwebparm_bkp = gxfirstwebparm ;
            gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
            toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
            if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
            {
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               dyncall( httpContext.GetNextPar( )) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               AV51EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EmprCod", AV51EmprCod);
               AV52BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarCod), 8, 0));
               AV53BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodReo", GXutil.str( AV53BarCodReo, 1, 0));
               AV54BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarCodPar", AV54BarCodPar);
               AV55ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55ProCod", AV55ProCod);
               AV56Prodsc = httpContext.GetPar( "Prodsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Prodsc", AV56Prodsc);
               AV57BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarExt", GXutil.str( AV57BarExt, 1, 0));
               AV58Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Discod), 8, 0));
               AV59BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarSit), 2, 0));
               AV60Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Clicod), 6, 0));
               AV61Barunimed = httpContext.GetPar( "Barunimed") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Barunimed", AV61Barunimed);
               AV62Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Barpes), 4, 0));
               AV72barser = httpContext.GetPar( "barser") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72barser", AV72barser);
               AV71PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PedidoCliente", AV71PedidoCliente);
               AV70barcolnom = httpContext.GetPar( "barcolnom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70barcolnom", AV70barcolnom);
               AV69barcolnum = (int)(GXutil.lval( httpContext.GetPar( "barcolnum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69barcolnum), 6, 0));
               AV68Barpie = (int)(GXutil.lval( httpContext.GetPar( "Barpie"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Barpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Barpie), 6, 0));
               AV67BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67BarKgm", GXutil.ltrimstr( AV67BarKgm, 9, 2));
               AV66Barmtr = CommonUtil.decimalVal( httpContext.GetPar( "Barmtr"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barmtr", GXutil.ltrimstr( AV66Barmtr, 9, 2));
               AV65CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65CliNom", AV65CliNom);
               AV64BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarSerDsc", AV64BarSerDsc);
               AV63BarAgrest = httpContext.GetPar( "BarAgrest") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarAgrest", AV63BarAgrest);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV51EmprCod,Integer.valueOf(AV52BarCod),Byte.valueOf(AV53BarCodReo),AV54BarCodPar,AV55ProCod,AV56Prodsc,Byte.valueOf(AV57BarExt),Integer.valueOf(AV58Discod),Byte.valueOf(AV59BarSit),Integer.valueOf(AV60Clicod),AV61Barunimed,Short.valueOf(AV62Barpes),AV72barser,AV71PedidoCliente,AV70barcolnom,Integer.valueOf(AV69barcolnum),Integer.valueOf(AV68Barpie),AV67BarKgm,AV66Barmtr,AV65CliNom,AV64BarSerDsc,AV63BarAgrest});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
            {
               gxnrgrid_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
            {
               gxgrgrid_refresh_invoke( ) ;
               return  ;
            }
            else
            {
               if ( ! httpContext.IsValidAjaxCall( false) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = gxfirstwebparm_bkp ;
            }
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_15 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_15"))) ;
      nGXsfl_15_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_15_idx"))) ;
      sGXsfl_15_idx = httpContext.GetPar( "sGXsfl_15_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV51EmprCod = httpContext.GetPar( "EmprCod") ;
      AV52BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV53BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV54BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV55ProCod = httpContext.GetPar( "ProCod") ;
      AV56Prodsc = httpContext.GetPar( "Prodsc") ;
      AV15TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV16TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV17TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV18TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV19TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV20TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV21TFMaqCodBis = httpContext.GetPar( "TFMaqCodBis") ;
      AV22TFMaqCodBis_Sel = httpContext.GetPar( "TFMaqCodBis_Sel") ;
      AV23TFBarFasCon = httpContext.GetPar( "TFBarFasCon") ;
      AV24TFBarFasCon_Sel = httpContext.GetPar( "TFBarFasCon_Sel") ;
      AV25TFBarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "TFBarFasEst"))) ;
      AV26TFBarFasEst_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarFasEst_To"))) ;
      AV27TFBarFacTin = httpContext.GetPar( "TFBarFacTin") ;
      AV28TFBarFacTin_Sel = httpContext.GetPar( "TFBarFacTin_Sel") ;
      AV29TFBarFasAcab = httpContext.GetPar( "TFBarFasAcab") ;
      AV30TFBarFasAcab_Sel = httpContext.GetPar( "TFBarFasAcab_Sel") ;
      AV31TFBarFasFor = httpContext.GetPar( "TFBarFasFor") ;
      AV32TFBarFasFor_Sel = httpContext.GetPar( "TFBarFasFor_Sel") ;
      AV33TFBarTieTeo = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieTeo"), ".") ;
      AV34TFBarTieTeo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieTeo_To"), ".") ;
      AV35TFBarTieRea = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieRea"), ".") ;
      AV36TFBarTieRea_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieRea_To"), ".") ;
      AV37TFBarFasDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFBarFasDTI")) ;
      AV39TFBarFasDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFBarFasDTF")) ;
      AV41TFBarFasKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasKgm"), ".") ;
      AV42TFBarFasKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasKgm_To"), ".") ;
      AV43TFBarFasMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasMtr"), ".") ;
      AV44TFBarFasMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasMtr_To"), ".") ;
      AV81Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV57BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
      AV58Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
      AV59BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      AV60Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV61Barunimed = httpContext.GetPar( "Barunimed") ;
      AV62Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
      AV72barser = httpContext.GetPar( "barser") ;
      AV71PedidoCliente = httpContext.GetPar( "PedidoCliente") ;
      AV70barcolnom = httpContext.GetPar( "barcolnom") ;
      AV69barcolnum = (int)(GXutil.lval( httpContext.GetPar( "barcolnum"))) ;
      AV68Barpie = (int)(GXutil.lval( httpContext.GetPar( "Barpie"))) ;
      AV67BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      AV66Barmtr = CommonUtil.decimalVal( httpContext.GetPar( "Barmtr"), ".") ;
      AV65CliNom = httpContext.GetPar( "CliNom") ;
      AV64BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      AV63BarAgrest = httpContext.GetPar( "BarAgrest") ;
      AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = httpContext.GetPar( "Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod") ;
      AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod"))) ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo"))) ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = httpContext.GetPar( "Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar") ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = httpContext.GetPar( "Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod") ;
      AV76UsurCod = httpContext.GetPar( "UsurCod") ;
      AV77Station = httpContext.GetPar( "Station") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV51EmprCod, AV52BarCod, AV53BarCodReo, AV54BarCodPar, AV55ProCod, AV56Prodsc, AV15TFBarOrdLin, AV16TFBarOrdLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCodBis, AV22TFMaqCodBis_Sel, AV23TFBarFasCon, AV24TFBarFasCon_Sel, AV25TFBarFasEst, AV26TFBarFasEst_To, AV27TFBarFacTin, AV28TFBarFacTin_Sel, AV29TFBarFasAcab, AV30TFBarFasAcab_Sel, AV31TFBarFasFor, AV32TFBarFasFor_Sel, AV33TFBarTieTeo, AV34TFBarTieTeo_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFasDTI, AV39TFBarFasDTF, AV41TFBarFasKgm, AV42TFBarFasKgm_To, AV43TFBarFasMtr, AV44TFBarFasMtr_To, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57BarExt, AV58Discod, AV59BarSit, AV60Clicod, AV61Barunimed, AV62Barpes, AV72barser, AV71PedidoCliente, AV70barcolnom, AV69barcolnum, AV68Barpie, AV67BarKgm, AV66Barmtr, AV65CliNom, AV64BarSerDsc, AV63BarAgrest, AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod, AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo, AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV76UsurCod, AV77Station, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa29B2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( " Fases de Produccion HDR", "")) ;
         httpContext.writeTextNL( "</title>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         if ( GXutil.len( sDynURL) > 0 )
         {
            httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
         }
         define_styles( ) ;
      }
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.hojaderuta__fases_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV51EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV52BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV54BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV55ProCod)),GXutil.URLEncode(GXutil.rtrim(AV56Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(AV57BarExt,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV58Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV59BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV60Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV61Barunimed)),GXutil.URLEncode(GXutil.ltrimstr(AV62Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV72barser)),GXutil.URLEncode(GXutil.rtrim(AV71PedidoCliente)),GXutil.URLEncode(GXutil.rtrim(AV70barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV69barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV68Barpie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV67BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV66Barmtr)),GXutil.URLEncode(GXutil.rtrim(AV65CliNom)),GXutil.URLEncode(GXutil.rtrim(AV64BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV63BarAgrest))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc","BarExt","Discod","BarSit","Clicod","Barunimed","Barpes","barser","PedidoCliente","barcolnom","barcolnum","Barpie","BarKgm","Barmtr","CliNom","BarSerDsc","BarAgrest"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"HojadeRuta__Fases_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
      forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta__fases_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_15", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_15, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV49GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV50GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV47DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV47DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51EmprCod", GXutil.rtrim( wcpOAV51EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV52BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV52BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV53BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54BarCodPar", GXutil.rtrim( wcpOAV54BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55ProCod", GXutil.rtrim( wcpOAV55ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56Prodsc", GXutil.rtrim( wcpOAV56Prodsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57BarExt", GXutil.ltrim( localUtil.ntoc( wcpOAV57BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58Discod", GXutil.ltrim( localUtil.ntoc( wcpOAV58Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59BarSit", GXutil.ltrim( localUtil.ntoc( wcpOAV59BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV60Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61Barunimed", GXutil.rtrim( wcpOAV61Barunimed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62Barpes", GXutil.ltrim( localUtil.ntoc( wcpOAV62Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV72barser", GXutil.rtrim( wcpOAV72barser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71PedidoCliente", GXutil.rtrim( wcpOAV71PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70barcolnom", GXutil.rtrim( wcpOAV70barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69barcolnum", GXutil.ltrim( localUtil.ntoc( wcpOAV69barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68Barpie", GXutil.ltrim( localUtil.ntoc( wcpOAV68Barpie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67BarKgm", GXutil.ltrim( localUtil.ntoc( wcpOAV67BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66Barmtr", GXutil.ltrim( localUtil.ntoc( wcpOAV66Barmtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65CliNom", GXutil.rtrim( wcpOAV65CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64BarSerDsc", GXutil.rtrim( wcpOAV64BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63BarAgrest", GXutil.rtrim( wcpOAV63BarAgrest));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV51EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV52BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV53BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV54BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROCOD", GXutil.rtrim( AV55ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODSC", GXutil.rtrim( AV56Prodsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV15TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV16TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD", GXutil.rtrim( AV17TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD_SEL", GXutil.rtrim( AV18TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC", GXutil.rtrim( AV19TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC_SEL", GXutil.rtrim( AV20TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS", GXutil.rtrim( AV21TFMaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS_SEL", GXutil.rtrim( AV22TFMaqCodBis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCON", GXutil.rtrim( AV23TFBarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCON_SEL", GXutil.rtrim( AV24TFBarFasCon_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASEST", GXutil.ltrim( localUtil.ntoc( AV25TFBarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASEST_TO", GXutil.ltrim( localUtil.ntoc( AV26TFBarFasEst_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFACTIN", GXutil.rtrim( AV27TFBarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFACTIN_SEL", GXutil.rtrim( AV28TFBarFacTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASACAB", GXutil.rtrim( AV29TFBarFasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASACAB_SEL", GXutil.rtrim( AV30TFBarFasAcab_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASFOR", GXutil.rtrim( AV31TFBarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASFOR_SEL", GXutil.rtrim( AV32TFBarFasFor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIETEO", GXutil.ltrim( localUtil.ntoc( AV33TFBarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIETEO_TO", GXutil.ltrim( localUtil.ntoc( AV34TFBarTieTeo_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIEREA", GXutil.ltrim( localUtil.ntoc( AV35TFBarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIEREA_TO", GXutil.ltrim( localUtil.ntoc( AV36TFBarTieRea_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASDTI", localUtil.ttoc( AV37TFBarFasDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASDTF", localUtil.ttoc( AV39TFBarFasDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASKGM", GXutil.ltrim( localUtil.ntoc( AV41TFBarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASKGM_TO", GXutil.ltrim( localUtil.ntoc( AV42TFBarFasKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASMTR", GXutil.ltrim( localUtil.ntoc( AV43TFBarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASMTR_TO", GXutil.ltrim( localUtil.ntoc( AV44TFBarFasMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBAREXT", GXutil.ltrim( localUtil.ntoc( AV57BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISCOD", GXutil.ltrim( localUtil.ntoc( AV58Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSIT", GXutil.ltrim( localUtil.ntoc( AV59BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV60Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARUNIMED", GXutil.rtrim( AV61Barunimed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARPES", GXutil.ltrim( localUtil.ntoc( AV62Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV72barser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDIDOCLIENTE", GXutil.rtrim( AV71PedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM", GXutil.rtrim( AV70barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV69barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARPIE", GXutil.ltrim( localUtil.ntoc( AV68Barpie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARKGM", GXutil.ltrim( localUtil.ntoc( AV67BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARMTR", GXutil.ltrim( localUtil.ntoc( AV66Barmtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLINOM", GXutil.rtrim( AV65CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERDSC", GXutil.rtrim( AV64BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARAGREST", GXutil.rtrim( AV63BarAgrest));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV76UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV77Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSI_RGTO", GXutil.ltrim( localUtil.ntoc( AV74Si_rgto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_1_EMPRCOD", GXutil.rtrim( AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_4_BARCODPAR", GXutil.rtrim( AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_5_PROCOD", GXutil.rtrim( AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Title", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Title", GXutil.rtrim( Dvelop_confirmpanel_abrir_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_abrir_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_abrir_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_abrir_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_abrir_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_abrir_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_abrir_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Result", GXutil.rtrim( Dvelop_confirmpanel_abrir_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_duplicar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Result", GXutil.rtrim( Dvelop_confirmpanel_abrir_Result));
   }

   public void renderHtmlCloseForm29B2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
         httpContext.SendComponentObjects();
         httpContext.SendServerCommands();
         httpContext.SendState();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         httpContext.writeTextNL( "</form>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         include_jscripts( ) ;
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.HojadeRuta__Fases_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Fases de Produccion HDR", "") ;
   }

   public void wb29B0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.pedidosclientesindetalle.hojaderuta__fases_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol15( ) ;
      }
      if ( wbEnd == 15 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_15 = (int)(nGXsfl_15_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV49GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV50GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV81Pgmname), GXutil.rtrim( localUtil.format( AV81Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV47DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases_WC.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases_WC.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, 0, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases_WC.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases_WC.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtProDsc_Visible, 0, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases_WC.htm");
         wb_table1_53_29B2( true) ;
      }
      else
      {
         wb_table1_53_29B2( false) ;
      }
      return  ;
   }

   public void wb_table1_53_29B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_58_29B2( true) ;
      }
      else
      {
         wb_table2_58_29B2( false) ;
      }
      return  ;
   }

   public void wb_table2_58_29B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_63_29B2( true) ;
      }
      else
      {
         wb_table3_63_29B2( false) ;
      }
      return  ;
   }

   public void wb_table3_63_29B2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfasdtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_15_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfasdtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfasdtiauxdate_Internalname, localUtil.format(AV38DDO_BarFasDTIAuxDate, "99/99/99"), localUtil.format( AV38DDO_BarFasDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfasdtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfasdtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfasdtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'" + sPrefix + "',false,'" + sGXsfl_15_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfasdtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfasdtfauxdate_Internalname, localUtil.format(AV40DDO_BarFasDTFAuxDate, "99/99/99"), localUtil.format( AV40DDO_BarFasDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfasdtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfasdtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\HojadeRuta__Fases_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 15 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start29B2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( " Fases de Produccion HDR", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup29B0( ) ;
         }
      }
   }

   public void ws29B2( )
   {
      start29B2( ) ;
      evt29B2( ) ;
   }

   public void evt29B2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1129B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1229B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1329B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1429B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DUPLICAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1529B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ABRIR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1629B2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29B0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavAccionesfases.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VACCIONESFASES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VACCIONESFASES.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup29B0( ) ;
                           }
                           nGXsfl_15_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_152( ) ;
                           cmbavAccionesfases.setName( cmbavAccionesfases.getInternalname() );
                           cmbavAccionesfases.setValue( httpContext.cgiGet( cmbavAccionesfases.getInternalname()) );
                           AV73AccionesFases = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesfases.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AccionesFases), 4, 0));
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
                           A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
                           A4905BarFasAcab = GXutil.upper( httpContext.cgiGet( edtBarFasAcab_Internalname)) ;
                           A4287BarFasFor = GXutil.upper( httpContext.cgiGet( edtBarFasFor_Internalname)) ;
                           A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
                           A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
                           A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname), 0) ;
                           n4442BarFasDTI = false ;
                           A4443BarFasDTF = localUtil.ctot( httpContext.cgiGet( edtBarFasDTF_Internalname), 0) ;
                           n4443BarFasDTF = false ;
                           A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
                           n3837BarFasKgm = false ;
                           A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
                           n3838BarFasMtr = false ;
                           cmbFaseExteri.setName( cmbFaseExteri.getInternalname() );
                           cmbFaseExteri.setValue( httpContext.cgiGet( cmbFaseExteri.getInternalname()) );
                           A14262FaseExteri = (byte)(GXutil.lval( httpContext.cgiGet( cmbFaseExteri.getInternalname()))) ;
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAccionesfases.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1729B2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAccionesfases.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1829B2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAccionesfases.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1929B2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VACCIONESFASES.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAccionesfases.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2029B2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup29B0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAccionesfases.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we29B2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm29B2( ) ;
         }
      }
   }

   public void pa29B2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavDdo_barfasdtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_152( ) ;
      while ( nGXsfl_15_idx <= nRC_GXsfl_15 )
      {
         sendrow_152( ) ;
         nGXsfl_15_idx = ((subGrid_Islastpage==1)&&(nGXsfl_15_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV51EmprCod ,
                                 int AV52BarCod ,
                                 byte AV53BarCodReo ,
                                 String AV54BarCodPar ,
                                 String AV55ProCod ,
                                 String AV56Prodsc ,
                                 short AV15TFBarOrdLin ,
                                 short AV16TFBarOrdLin_To ,
                                 String AV17TFFasCod ,
                                 String AV18TFFasCod_Sel ,
                                 String AV19TFFasDsc ,
                                 String AV20TFFasDsc_Sel ,
                                 String AV21TFMaqCodBis ,
                                 String AV22TFMaqCodBis_Sel ,
                                 String AV23TFBarFasCon ,
                                 String AV24TFBarFasCon_Sel ,
                                 byte AV25TFBarFasEst ,
                                 byte AV26TFBarFasEst_To ,
                                 String AV27TFBarFacTin ,
                                 String AV28TFBarFacTin_Sel ,
                                 String AV29TFBarFasAcab ,
                                 String AV30TFBarFasAcab_Sel ,
                                 String AV31TFBarFasFor ,
                                 String AV32TFBarFasFor_Sel ,
                                 java.math.BigDecimal AV33TFBarTieTeo ,
                                 java.math.BigDecimal AV34TFBarTieTeo_To ,
                                 java.math.BigDecimal AV35TFBarTieRea ,
                                 java.math.BigDecimal AV36TFBarTieRea_To ,
                                 java.util.Date AV37TFBarFasDTI ,
                                 java.util.Date AV39TFBarFasDTF ,
                                 java.math.BigDecimal AV41TFBarFasKgm ,
                                 java.math.BigDecimal AV42TFBarFasKgm_To ,
                                 java.math.BigDecimal AV43TFBarFasMtr ,
                                 java.math.BigDecimal AV44TFBarFasMtr_To ,
                                 String AV81Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 byte AV57BarExt ,
                                 int AV58Discod ,
                                 byte AV59BarSit ,
                                 int AV60Clicod ,
                                 String AV61Barunimed ,
                                 short AV62Barpes ,
                                 String AV72barser ,
                                 String AV71PedidoCliente ,
                                 String AV70barcolnom ,
                                 int AV69barcolnum ,
                                 int AV68Barpie ,
                                 java.math.BigDecimal AV67BarKgm ,
                                 java.math.BigDecimal AV66Barmtr ,
                                 String AV65CliNom ,
                                 String AV64BarSerDsc ,
                                 String AV63BarAgrest ,
                                 String AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                 int AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ,
                                 byte AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ,
                                 String AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                 String AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ,
                                 String AV76UsurCod ,
                                 String AV77Station ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1829B2 ();
      GRID_nCurrentRecord = 0 ;
      rf29B2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"HojadeRuta__Fases_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
      forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\hojaderuta__fases_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARFASEST", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARFASFOR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASFOR", GXutil.rtrim( A4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARFASACAB", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASACAB", GXutil.rtrim( A4905BarFasAcab));
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf29B2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV81Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Fases_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29B2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(15) ;
      /* Execute user event: Refresh */
      e1829B2 ();
      nGXsfl_15_idx = 1 ;
      sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_152( ) ;
      bGXsfl_15_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_152( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) ,
                                              Short.valueOf(AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) ,
                                              AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                              AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                              AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                              AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                              AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                              AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                              AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                              AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                              Byte.valueOf(AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) ,
                                              Byte.valueOf(AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) ,
                                              AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                              AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                              AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                              AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                              AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                              AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                              AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                              AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                              AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                              AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                              AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                              AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                              AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                              AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                              AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                              AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A603MaqCodBis ,
                                              A152BarFasCon ,
                                              Byte.valueOf(A153BarFasEst) ,
                                              A150BarFacTin ,
                                              A4905BarFasAcab ,
                                              A4287BarFasFor ,
                                              A216BarTieTeo ,
                                              A215BarTieRea ,
                                              A4442BarFasDTI ,
                                              A4443BarFasDTF ,
                                              A3837BarFasKgm ,
                                              A3838BarFasMtr ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A759ProDsc ,
                                              AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                              A396EmprCod ,
                                              AV51EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV52BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV53BarCodReo) ,
                                              A130BarCodPar ,
                                              AV54BarCodPar ,
                                              A758ProCod ,
                                              AV55ProCod ,
                                              AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                              Integer.valueOf(AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod) ,
                                              Byte.valueOf(AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo) ,
                                              AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                              AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE,
                                              TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = GXutil.padr( GXutil.rtrim( AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod), 8, "%") ;
         lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc), 28, "%") ;
         lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis), 6, "%") ;
         lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = GXutil.padr( GXutil.rtrim( AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon), 1, "%") ;
         lV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = GXutil.padr( GXutil.rtrim( AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin), 1, "%") ;
         lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = GXutil.padr( GXutil.rtrim( AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab), 1, "%") ;
         lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = GXutil.padr( GXutil.rtrim( AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor), 1, "%") ;
         /* Using cursor H029B2 */
         pr_default.execute(0, new Object[] {AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, Integer.valueOf(AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod), Byte.valueOf(AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo), AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc, AV51EmprCod, Integer.valueOf(AV52BarCod), Byte.valueOf(AV53BarCodReo), AV54BarCodPar, AV55ProCod, Short.valueOf(AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin), Short.valueOf(AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to), lV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod, AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel, lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc, AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel, lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis, AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel, lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon, AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel, Byte.valueOf(AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest), Byte.valueOf(AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to), lV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin, AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel, lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab, AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel, lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor, AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel, AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_15_idx = 1 ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A759ProDsc = H029B2_A759ProDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A759ProDsc", A759ProDsc);
            A758ProCod = H029B2_A758ProCod[0] ;
            A3838BarFasMtr = H029B2_A3838BarFasMtr[0] ;
            n3838BarFasMtr = H029B2_n3838BarFasMtr[0] ;
            A3837BarFasKgm = H029B2_A3837BarFasKgm[0] ;
            n3837BarFasKgm = H029B2_n3837BarFasKgm[0] ;
            A4443BarFasDTF = H029B2_A4443BarFasDTF[0] ;
            n4443BarFasDTF = H029B2_n4443BarFasDTF[0] ;
            A4442BarFasDTI = H029B2_A4442BarFasDTI[0] ;
            n4442BarFasDTI = H029B2_n4442BarFasDTI[0] ;
            A215BarTieRea = H029B2_A215BarTieRea[0] ;
            A216BarTieTeo = H029B2_A216BarTieTeo[0] ;
            A4287BarFasFor = H029B2_A4287BarFasFor[0] ;
            A4905BarFasAcab = H029B2_A4905BarFasAcab[0] ;
            A150BarFacTin = H029B2_A150BarFacTin[0] ;
            A153BarFasEst = H029B2_A153BarFasEst[0] ;
            A152BarFasCon = H029B2_A152BarFasCon[0] ;
            A603MaqCodBis = H029B2_A603MaqCodBis[0] ;
            A460FasDsc = H029B2_A460FasDsc[0] ;
            A194BarOrdLin = H029B2_A194BarOrdLin[0] ;
            A457FasCod = H029B2_A457FasCod[0] ;
            A130BarCodPar = H029B2_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
            A132BarCodReo = H029B2_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A129BarCod = H029B2_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A396EmprCod = H029B2_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A460FasDsc = H029B2_A460FasDsc[0] ;
            A759ProDsc = H029B2_A759ProDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A759ProDsc", A759ProDsc);
            GXt_int1 = A14262FaseExteri ;
            GXv_int2[0] = GXt_int1 ;
            new app.lectoroptico.faseenexterior(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A457FasCod, GXv_int2) ;
            hojaderuta__fases_wc_impl.this.GXt_int1 = GXv_int2[0] ;
            A14262FaseExteri = (byte)(GXt_int1) ;
            e1929B2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(15) ;
         wb29B0( ) ;
      }
      bGXsfl_15_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes29B2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARFASEST"+"_"+sGXsfl_15_idx, getSecureSignedToken( sPrefix+sGXsfl_15_idx, localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARFASFOR"+"_"+sGXsfl_15_idx, getSecureSignedToken( sPrefix+sGXsfl_15_idx, GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARFASACAB"+"_"+sGXsfl_15_idx, getSecureSignedToken( sPrefix+sGXsfl_15_idx, GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV76UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV77Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77Station, ""))));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV51EmprCod ;
      AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV52BarCod ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV53BarCodReo ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV54BarCodPar ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV55ProCod ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV56Prodsc ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV15TFBarOrdLin ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV16TFBarOrdLin_To ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV17TFFasCod ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV18TFFasCod_Sel ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV19TFFasDsc ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV21TFMaqCodBis ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV22TFMaqCodBis_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV23TFBarFasCon ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV24TFBarFasCon_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV25TFBarFasEst ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV26TFBarFasEst_To ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV27TFBarFacTin ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV28TFBarFacTin_Sel ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV29TFBarFasAcab ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV30TFBarFasAcab_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV31TFBarFasFor ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV32TFBarFasFor_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV33TFBarTieTeo ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV34TFBarTieTeo_To ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV35TFBarTieRea ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV36TFBarTieRea_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV37TFBarFasDTI ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV39TFBarFasDTF ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV41TFBarFasKgm ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV42TFBarFasKgm_To ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV43TFBarFasMtr ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV44TFBarFasMtr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) ,
                                           AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                           AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                           AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                           AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                           AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                           AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                           AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                           AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                           Byte.valueOf(AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) ,
                                           Byte.valueOf(AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) ,
                                           AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                           AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                           AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                           AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                           AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                           AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                           AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                           AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                           AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                           AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                           AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                           AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                           AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                           AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                           AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                           AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A152BarFasCon ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A150BarFacTin ,
                                           A4905BarFasAcab ,
                                           A4287BarFasFor ,
                                           A216BarTieTeo ,
                                           A215BarTieRea ,
                                           A4442BarFasDTI ,
                                           A4443BarFasDTF ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A759ProDsc ,
                                           AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                           A396EmprCod ,
                                           AV51EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV52BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV53BarCodReo) ,
                                           A130BarCodPar ,
                                           AV54BarCodPar ,
                                           A758ProCod ,
                                           AV55ProCod ,
                                           AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                           Integer.valueOf(AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod) ,
                                           Byte.valueOf(AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo) ,
                                           AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                           AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = GXutil.padr( GXutil.rtrim( AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod), 8, "%") ;
      lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc), 28, "%") ;
      lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis), 6, "%") ;
      lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = GXutil.padr( GXutil.rtrim( AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon), 1, "%") ;
      lV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = GXutil.padr( GXutil.rtrim( AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin), 1, "%") ;
      lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = GXutil.padr( GXutil.rtrim( AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab), 1, "%") ;
      lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = GXutil.padr( GXutil.rtrim( AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor), 1, "%") ;
      /* Using cursor H029B3 */
      pr_default.execute(1, new Object[] {AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, Integer.valueOf(AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod), Byte.valueOf(AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo), AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc, AV51EmprCod, Integer.valueOf(AV52BarCod), Byte.valueOf(AV53BarCodReo), AV54BarCodPar, AV55ProCod, Short.valueOf(AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin), Short.valueOf(AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to), lV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod, AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel, lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc, AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel, lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis, AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel, lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon, AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel, Byte.valueOf(AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest), Byte.valueOf(AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to), lV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin, AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel, lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab, AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel, lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor, AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel, AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to, AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti, AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to});
      GRID_nRecordCount = H029B3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV51EmprCod ;
      AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV52BarCod ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV53BarCodReo ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV54BarCodPar ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV55ProCod ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV56Prodsc ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV15TFBarOrdLin ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV16TFBarOrdLin_To ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV17TFFasCod ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV18TFFasCod_Sel ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV19TFFasDsc ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV21TFMaqCodBis ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV22TFMaqCodBis_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV23TFBarFasCon ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV24TFBarFasCon_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV25TFBarFasEst ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV26TFBarFasEst_To ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV27TFBarFacTin ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV28TFBarFacTin_Sel ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV29TFBarFasAcab ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV30TFBarFasAcab_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV31TFBarFasFor ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV32TFBarFasFor_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV33TFBarTieTeo ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV34TFBarTieTeo_To ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV35TFBarTieRea ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV36TFBarTieRea_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV37TFBarFasDTI ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV39TFBarFasDTF ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV41TFBarFasKgm ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV42TFBarFasKgm_To ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV43TFBarFasMtr ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV44TFBarFasMtr_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV51EmprCod, AV52BarCod, AV53BarCodReo, AV54BarCodPar, AV55ProCod, AV56Prodsc, AV15TFBarOrdLin, AV16TFBarOrdLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCodBis, AV22TFMaqCodBis_Sel, AV23TFBarFasCon, AV24TFBarFasCon_Sel, AV25TFBarFasEst, AV26TFBarFasEst_To, AV27TFBarFacTin, AV28TFBarFacTin_Sel, AV29TFBarFasAcab, AV30TFBarFasAcab_Sel, AV31TFBarFasFor, AV32TFBarFasFor_Sel, AV33TFBarTieTeo, AV34TFBarTieTeo_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFasDTI, AV39TFBarFasDTF, AV41TFBarFasKgm, AV42TFBarFasKgm_To, AV43TFBarFasMtr, AV44TFBarFasMtr_To, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57BarExt, AV58Discod, AV59BarSit, AV60Clicod, AV61Barunimed, AV62Barpes, AV72barser, AV71PedidoCliente, AV70barcolnom, AV69barcolnum, AV68Barpie, AV67BarKgm, AV66Barmtr, AV65CliNom, AV64BarSerDsc, AV63BarAgrest, AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod, AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo, AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV76UsurCod, AV77Station, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV51EmprCod ;
      AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV52BarCod ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV53BarCodReo ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV54BarCodPar ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV55ProCod ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV56Prodsc ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV15TFBarOrdLin ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV16TFBarOrdLin_To ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV17TFFasCod ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV18TFFasCod_Sel ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV19TFFasDsc ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV21TFMaqCodBis ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV22TFMaqCodBis_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV23TFBarFasCon ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV24TFBarFasCon_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV25TFBarFasEst ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV26TFBarFasEst_To ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV27TFBarFacTin ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV28TFBarFacTin_Sel ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV29TFBarFasAcab ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV30TFBarFasAcab_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV31TFBarFasFor ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV32TFBarFasFor_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV33TFBarTieTeo ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV34TFBarTieTeo_To ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV35TFBarTieRea ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV36TFBarTieRea_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV37TFBarFasDTI ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV39TFBarFasDTF ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV41TFBarFasKgm ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV42TFBarFasKgm_To ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV43TFBarFasMtr ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV44TFBarFasMtr_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV51EmprCod, AV52BarCod, AV53BarCodReo, AV54BarCodPar, AV55ProCod, AV56Prodsc, AV15TFBarOrdLin, AV16TFBarOrdLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCodBis, AV22TFMaqCodBis_Sel, AV23TFBarFasCon, AV24TFBarFasCon_Sel, AV25TFBarFasEst, AV26TFBarFasEst_To, AV27TFBarFacTin, AV28TFBarFacTin_Sel, AV29TFBarFasAcab, AV30TFBarFasAcab_Sel, AV31TFBarFasFor, AV32TFBarFasFor_Sel, AV33TFBarTieTeo, AV34TFBarTieTeo_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFasDTI, AV39TFBarFasDTF, AV41TFBarFasKgm, AV42TFBarFasKgm_To, AV43TFBarFasMtr, AV44TFBarFasMtr_To, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57BarExt, AV58Discod, AV59BarSit, AV60Clicod, AV61Barunimed, AV62Barpes, AV72barser, AV71PedidoCliente, AV70barcolnom, AV69barcolnum, AV68Barpie, AV67BarKgm, AV66Barmtr, AV65CliNom, AV64BarSerDsc, AV63BarAgrest, AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod, AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo, AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV76UsurCod, AV77Station, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV51EmprCod ;
      AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV52BarCod ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV53BarCodReo ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV54BarCodPar ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV55ProCod ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV56Prodsc ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV15TFBarOrdLin ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV16TFBarOrdLin_To ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV17TFFasCod ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV18TFFasCod_Sel ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV19TFFasDsc ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV21TFMaqCodBis ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV22TFMaqCodBis_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV23TFBarFasCon ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV24TFBarFasCon_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV25TFBarFasEst ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV26TFBarFasEst_To ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV27TFBarFacTin ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV28TFBarFacTin_Sel ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV29TFBarFasAcab ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV30TFBarFasAcab_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV31TFBarFasFor ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV32TFBarFasFor_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV33TFBarTieTeo ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV34TFBarTieTeo_To ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV35TFBarTieRea ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV36TFBarTieRea_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV37TFBarFasDTI ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV39TFBarFasDTF ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV41TFBarFasKgm ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV42TFBarFasKgm_To ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV43TFBarFasMtr ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV44TFBarFasMtr_To ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV51EmprCod, AV52BarCod, AV53BarCodReo, AV54BarCodPar, AV55ProCod, AV56Prodsc, AV15TFBarOrdLin, AV16TFBarOrdLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCodBis, AV22TFMaqCodBis_Sel, AV23TFBarFasCon, AV24TFBarFasCon_Sel, AV25TFBarFasEst, AV26TFBarFasEst_To, AV27TFBarFacTin, AV28TFBarFacTin_Sel, AV29TFBarFasAcab, AV30TFBarFasAcab_Sel, AV31TFBarFasFor, AV32TFBarFasFor_Sel, AV33TFBarTieTeo, AV34TFBarTieTeo_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFasDTI, AV39TFBarFasDTF, AV41TFBarFasKgm, AV42TFBarFasKgm_To, AV43TFBarFasMtr, AV44TFBarFasMtr_To, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57BarExt, AV58Discod, AV59BarSit, AV60Clicod, AV61Barunimed, AV62Barpes, AV72barser, AV71PedidoCliente, AV70barcolnom, AV69barcolnum, AV68Barpie, AV67BarKgm, AV66Barmtr, AV65CliNom, AV64BarSerDsc, AV63BarAgrest, AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod, AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo, AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV76UsurCod, AV77Station, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV51EmprCod ;
      AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV52BarCod ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV53BarCodReo ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV54BarCodPar ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV55ProCod ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV56Prodsc ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV15TFBarOrdLin ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV16TFBarOrdLin_To ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV17TFFasCod ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV18TFFasCod_Sel ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV19TFFasDsc ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV21TFMaqCodBis ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV22TFMaqCodBis_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV23TFBarFasCon ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV24TFBarFasCon_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV25TFBarFasEst ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV26TFBarFasEst_To ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV27TFBarFacTin ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV28TFBarFacTin_Sel ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV29TFBarFasAcab ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV30TFBarFasAcab_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV31TFBarFasFor ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV32TFBarFasFor_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV33TFBarTieTeo ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV34TFBarTieTeo_To ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV35TFBarTieRea ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV36TFBarTieRea_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV37TFBarFasDTI ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV39TFBarFasDTF ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV41TFBarFasKgm ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV42TFBarFasKgm_To ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV43TFBarFasMtr ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV44TFBarFasMtr_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV51EmprCod, AV52BarCod, AV53BarCodReo, AV54BarCodPar, AV55ProCod, AV56Prodsc, AV15TFBarOrdLin, AV16TFBarOrdLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCodBis, AV22TFMaqCodBis_Sel, AV23TFBarFasCon, AV24TFBarFasCon_Sel, AV25TFBarFasEst, AV26TFBarFasEst_To, AV27TFBarFacTin, AV28TFBarFacTin_Sel, AV29TFBarFasAcab, AV30TFBarFasAcab_Sel, AV31TFBarFasFor, AV32TFBarFasFor_Sel, AV33TFBarTieTeo, AV34TFBarTieTeo_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFasDTI, AV39TFBarFasDTF, AV41TFBarFasKgm, AV42TFBarFasKgm_To, AV43TFBarFasMtr, AV44TFBarFasMtr_To, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57BarExt, AV58Discod, AV59BarSit, AV60Clicod, AV61Barunimed, AV62Barpes, AV72barser, AV71PedidoCliente, AV70barcolnom, AV69barcolnum, AV68Barpie, AV67BarKgm, AV66Barmtr, AV65CliNom, AV64BarSerDsc, AV63BarAgrest, AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod, AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo, AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV76UsurCod, AV77Station, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV51EmprCod ;
      AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV52BarCod ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV53BarCodReo ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV54BarCodPar ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV55ProCod ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV56Prodsc ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV15TFBarOrdLin ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV16TFBarOrdLin_To ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV17TFFasCod ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV18TFFasCod_Sel ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV19TFFasDsc ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV21TFMaqCodBis ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV22TFMaqCodBis_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV23TFBarFasCon ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV24TFBarFasCon_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV25TFBarFasEst ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV26TFBarFasEst_To ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV27TFBarFacTin ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV28TFBarFacTin_Sel ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV29TFBarFasAcab ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV30TFBarFasAcab_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV31TFBarFasFor ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV32TFBarFasFor_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV33TFBarTieTeo ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV34TFBarTieTeo_To ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV35TFBarTieRea ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV36TFBarTieRea_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV37TFBarFasDTI ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV39TFBarFasDTF ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV41TFBarFasKgm ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV42TFBarFasKgm_To ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV43TFBarFasMtr ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV44TFBarFasMtr_To ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV51EmprCod, AV52BarCod, AV53BarCodReo, AV54BarCodPar, AV55ProCod, AV56Prodsc, AV15TFBarOrdLin, AV16TFBarOrdLin_To, AV17TFFasCod, AV18TFFasCod_Sel, AV19TFFasDsc, AV20TFFasDsc_Sel, AV21TFMaqCodBis, AV22TFMaqCodBis_Sel, AV23TFBarFasCon, AV24TFBarFasCon_Sel, AV25TFBarFasEst, AV26TFBarFasEst_To, AV27TFBarFacTin, AV28TFBarFacTin_Sel, AV29TFBarFasAcab, AV30TFBarFasAcab_Sel, AV31TFBarFasFor, AV32TFBarFasFor_Sel, AV33TFBarTieTeo, AV34TFBarTieTeo_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFasDTI, AV39TFBarFasDTF, AV41TFBarFasKgm, AV42TFBarFasKgm_To, AV43TFBarFasMtr, AV44TFBarFasMtr_To, AV81Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57BarExt, AV58Discod, AV59BarSit, AV60Clicod, AV61Barunimed, AV62Barpes, AV72barser, AV71PedidoCliente, AV70barcolnom, AV69barcolnum, AV68Barpie, AV67BarKgm, AV66Barmtr, AV65CliNom, AV64BarSerDsc, AV63BarAgrest, AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod, AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod, AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo, AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar, AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod, AV76UsurCod, AV77Station, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV81Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Fases_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29B0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1729B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV47DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_15 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_15"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV49GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV50GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV51EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV51EmprCod") ;
         wcpOAV52BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV52BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV53BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV54BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV54BarCodPar") ;
         wcpOAV55ProCod = httpContext.cgiGet( sPrefix+"wcpOAV55ProCod") ;
         wcpOAV56Prodsc = httpContext.cgiGet( sPrefix+"wcpOAV56Prodsc") ;
         wcpOAV57BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57BarExt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV58Discod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58Discod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV59BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV59BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV60Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV60Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV61Barunimed = httpContext.cgiGet( sPrefix+"wcpOAV61Barunimed") ;
         wcpOAV62Barpes = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62Barpes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV72barser = httpContext.cgiGet( sPrefix+"wcpOAV72barser") ;
         wcpOAV71PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV71PedidoCliente") ;
         wcpOAV70barcolnom = httpContext.cgiGet( sPrefix+"wcpOAV70barcolnom") ;
         wcpOAV69barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69barcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV68Barpie = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV68Barpie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV67BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV67BarKgm")) ;
         wcpOAV66Barmtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV66Barmtr")) ;
         wcpOAV65CliNom = httpContext.cgiGet( sPrefix+"wcpOAV65CliNom") ;
         wcpOAV64BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV64BarSerDsc") ;
         wcpOAV63BarAgrest = httpContext.cgiGet( sPrefix+"wcpOAV63BarAgrest") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminarlinea_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype") ;
         Dvelop_confirmpanel_duplicar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Title") ;
         Dvelop_confirmpanel_duplicar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Confirmationtext") ;
         Dvelop_confirmpanel_duplicar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_duplicar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_duplicar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_duplicar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_duplicar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Confirmtype") ;
         Dvelop_confirmpanel_abrir_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Title") ;
         Dvelop_confirmpanel_abrir_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Confirmationtext") ;
         Dvelop_confirmpanel_abrir_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_abrir_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Nobuttoncaption") ;
         Dvelop_confirmpanel_abrir_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_abrir_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Yesbuttonposition") ;
         Dvelop_confirmpanel_abrir_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminarlinea_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result") ;
         Dvelop_confirmpanel_duplicar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR_Result") ;
         Dvelop_confirmpanel_abrir_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ABRIR_Result") ;
         /* Read variables values. */
         AV81Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A759ProDsc", A759ProDsc);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfasdtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFASDTIAUXDATE");
            GX_FocusControl = edtavDdo_barfasdtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38DDO_BarFasDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38DDO_BarFasDTIAuxDate", localUtil.format(AV38DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV38DDO_BarFasDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfasdtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38DDO_BarFasDTIAuxDate", localUtil.format(AV38DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfasdtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFASDTFAUXDATE");
            GX_FocusControl = edtavDdo_barfasdtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40DDO_BarFasDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_BarFasDTFAuxDate", localUtil.format(AV40DDO_BarFasDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV40DDO_BarFasDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfasdtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_BarFasDTFAuxDate", localUtil.format(AV40DDO_BarFasDTFAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_15_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
         if ( nGXsfl_15_idx > 0 )
         {
            cmbavAccionesfases.setName( cmbavAccionesfases.getInternalname() );
            cmbavAccionesfases.setValue( httpContext.cgiGet( cmbavAccionesfases.getInternalname()) );
            AV73AccionesFases = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesfases.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AccionesFases), 4, 0));
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
            A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
            A4905BarFasAcab = GXutil.upper( httpContext.cgiGet( edtBarFasAcab_Internalname)) ;
            A4287BarFasFor = GXutil.upper( httpContext.cgiGet( edtBarFasFor_Internalname)) ;
            A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
            A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname)) ;
            n4442BarFasDTI = false ;
            A4443BarFasDTF = localUtil.ctot( httpContext.cgiGet( edtBarFasDTF_Internalname)) ;
            n4443BarFasDTF = false ;
            A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
            n3838BarFasMtr = false ;
            cmbFaseExteri.setName( cmbFaseExteri.getInternalname() );
            cmbFaseExteri.setValue( httpContext.cgiGet( cmbFaseExteri.getInternalname()) );
            A14262FaseExteri = (byte)(GXutil.lval( httpContext.cgiGet( cmbFaseExteri.getInternalname()))) ;
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"HojadeRuta__Fases_WC");
         AV81Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
         A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\hojaderuta__fases_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e1729B2 ();
      if (returnInSub) return;
   }

   public void e1729B2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char3 = AV77Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      hojaderuta__fases_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      AV77Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77Station", AV77Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77Station, ""))));
      GXv_char4[0] = AV51EmprCod ;
      GXv_char5[0] = AV75EmprNom ;
      GXv_char6[0] = AV76UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV77Station, GXv_char4, GXv_char5, GXv_char6) ;
      hojaderuta__fases_wc_impl.this.AV51EmprCod = GXv_char4[0] ;
      hojaderuta__fases_wc_impl.this.AV75EmprNom = GXv_char5[0] ;
      hojaderuta__fases_wc_impl.this.AV76UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EmprCod", AV51EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76UsurCod", AV76UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vUSURCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76UsurCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
      edtProDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Visible), 5, 0), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV47DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV47DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1829B2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV49GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridCurrentPage), 10, 0));
      AV50GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridPageCount), 10, 0));
      edtFasCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCod_Internalname, "Columnheaderclass", edtFasCod_Columnheaderclass, !bGXsfl_15_Refreshing);
      edtFasDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDsc_Internalname, "Columnheaderclass", edtFasDsc_Columnheaderclass, !bGXsfl_15_Refreshing);
      cmbFaseExteri.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFaseExteri.getInternalname(), "Columnheaderclass", cmbFaseExteri.getColumnHeaderClass(), !bGXsfl_15_Refreshing);
      AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = AV51EmprCod ;
      AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod = AV52BarCod ;
      AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo = AV53BarCodReo ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = AV54BarCodPar ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = AV55ProCod ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = AV56Prodsc ;
      AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin = AV15TFBarOrdLin ;
      AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to = AV16TFBarOrdLin_To ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = AV17TFFasCod ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = AV18TFFasCod_Sel ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = AV19TFFasDsc ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = AV20TFFasDsc_Sel ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = AV21TFMaqCodBis ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = AV22TFMaqCodBis_Sel ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = AV23TFBarFasCon ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = AV24TFBarFasCon_Sel ;
      AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest = AV25TFBarFasEst ;
      AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to = AV26TFBarFasEst_To ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = AV27TFBarFacTin ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = AV28TFBarFacTin_Sel ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = AV29TFBarFasAcab ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = AV30TFBarFasAcab_Sel ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = AV31TFBarFasFor ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = AV32TFBarFasFor_Sel ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = AV33TFBarTieTeo ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = AV34TFBarTieTeo_To ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = AV35TFBarTieRea ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = AV36TFBarTieRea_To ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = AV37TFBarFasDTI ;
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = AV39TFBarFasDTF ;
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = AV41TFBarFasKgm ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = AV42TFBarFasKgm_To ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = AV43TFBarFasMtr ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = AV44TFBarFasMtr_To ;
      /*  Sending Event outputs  */
   }

   public void e1129B2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV48PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV48PageToGo) ;
      }
   }

   public void e1229B2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1329B2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV15TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFBarOrdLin), 4, 0));
            AV16TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV17TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFFasCod", AV17TFFasCod);
            AV18TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFFasCod_Sel", AV18TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV19TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFFasDsc", AV19TFFasDsc);
            AV20TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFFasDsc_Sel", AV20TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodBis") == 0 )
         {
            AV21TFMaqCodBis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFMaqCodBis", AV21TFMaqCodBis);
            AV22TFMaqCodBis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFMaqCodBis_Sel", AV22TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasCon") == 0 )
         {
            AV23TFBarFasCon = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFBarFasCon", AV23TFBarFasCon);
            AV24TFBarFasCon_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFBarFasCon_Sel", AV24TFBarFasCon_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasEst") == 0 )
         {
            AV25TFBarFasEst = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFBarFasEst", GXutil.str( AV25TFBarFasEst, 1, 0));
            AV26TFBarFasEst_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarFasEst_To", GXutil.str( AV26TFBarFasEst_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFacTin") == 0 )
         {
            AV27TFBarFacTin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarFacTin", AV27TFBarFacTin);
            AV28TFBarFacTin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarFacTin_Sel", AV28TFBarFacTin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasAcab") == 0 )
         {
            AV29TFBarFasAcab = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarFasAcab", AV29TFBarFasAcab);
            AV30TFBarFasAcab_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarFasAcab_Sel", AV30TFBarFasAcab_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasFor") == 0 )
         {
            AV31TFBarFasFor = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarFasFor", AV31TFBarFasFor);
            AV32TFBarFasFor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarFasFor_Sel", AV32TFBarFasFor_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTieTeo") == 0 )
         {
            AV33TFBarTieTeo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarTieTeo", GXutil.ltrimstr( AV33TFBarTieTeo, 5, 2));
            AV34TFBarTieTeo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarTieTeo_To", GXutil.ltrimstr( AV34TFBarTieTeo_To, 5, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTieRea") == 0 )
         {
            AV35TFBarTieRea = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarTieRea", GXutil.ltrimstr( AV35TFBarTieRea, 5, 2));
            AV36TFBarTieRea_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarTieRea_To", GXutil.ltrimstr( AV36TFBarTieRea_To, 5, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasDTI") == 0 )
         {
            AV37TFBarFasDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarFasDTI", localUtil.ttoc( AV37TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasDTF") == 0 )
         {
            AV39TFBarFasDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarFasDTF", localUtil.ttoc( AV39TFBarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasKgm") == 0 )
         {
            AV41TFBarFasKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarFasKgm", GXutil.ltrimstr( AV41TFBarFasKgm, 9, 2));
            AV42TFBarFasKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarFasKgm_To", GXutil.ltrimstr( AV42TFBarFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasMtr") == 0 )
         {
            AV43TFBarFasMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarFasMtr", GXutil.ltrimstr( AV43TFBarFasMtr, 9, 2));
            AV44TFBarFasMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarFasMtr_To", GXutil.ltrimstr( AV44TFBarFasMtr_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1929B2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavAccionesfases.removeAllItems();
      cmbavAccionesfases.addItem("0", ";fa fa-bars", (short)(0));
      if ( A153BarFasEst == 0 )
      {
         cmbavAccionesfases.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavAccionesfases.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavAccionesfases.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Parametros", ""), "fa fa-shapes", "", "", "", "", "", "", ""), (short)(0));
      if ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 )
      {
         cmbavAccionesfases.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Tratamiento Quimico", ""), "menu-icon fas fa-microscope", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavAccionesfases.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Duplicar", ""), "fa fa-folder-open", "", "", "", "", "", "", ""), (short)(0));
      cmbavAccionesfases.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Abrir", ""), "fa fa-folder-open fa fa-folder-open", "", "", "", "", "", "", ""), (short)(0));
      if ( ( AV57BarExt == 1 ) && ( A14262FaseExteri == 1 ) )
      {
         edtFasCod_Columnclass = "WWColumn WWColumnTag WWColumnTagWarning WWColumnTagWarningSingleCell" ;
      }
      else if ( ( AV57BarExt == 2 ) && ( A14262FaseExteri == 2 ) )
      {
         edtFasCod_Columnclass = "WWColumn WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" ;
      }
      else
      {
         edtFasCod_Columnclass = httpContext.getMessage( "WWColumn", "") ;
      }
      if ( ( AV57BarExt == 1 ) && ( A14262FaseExteri == 1 ) )
      {
         edtFasDsc_Columnclass = "WWColumn WWColumnTag WWColumnTagWarning WWColumnTagWarningSingleCell" ;
      }
      else if ( ( AV57BarExt == 2 ) && ( A14262FaseExteri == 2 ) )
      {
         edtFasDsc_Columnclass = "WWColumn WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" ;
      }
      else
      {
         edtFasDsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
      }
      if ( ( AV57BarExt == 1 ) && ( A14262FaseExteri == 1 ) )
      {
         cmbFaseExteri.setColumnClass( "WWColumn WWColumnTag WWColumnTagWarning WWColumnTagWarningSingleCell" );
      }
      else if ( ( AV57BarExt == 2 ) && ( A14262FaseExteri == 2 ) )
      {
         cmbFaseExteri.setColumnClass( "WWColumn WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" );
      }
      else
      {
         cmbFaseExteri.setColumnClass( httpContext.getMessage( "WWColumn", "") );
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(15) ;
      }
      sendrow_152( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_15_Refreshing )
      {
         httpContext.doAjaxLoad(15, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavAccionesfases.setValue( GXutil.trim( GXutil.str( AV73AccionesFases, 4, 0)) );
   }

   public void e2029B2( )
   {
      /* Accionesfases_Click Routine */
      returnInSub = false ;
      if ( AV73AccionesFases == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINARLINEA' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV73AccionesFases == 2 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV73AccionesFases == 3 )
      {
         /* Execute user subroutine: 'DO PARAMETROS' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV73AccionesFases == 4 )
      {
         /* Execute user subroutine: 'DO TRATAMIENTOQUIMICO' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV73AccionesFases == 5 )
      {
         /* Execute user subroutine: 'DO DUPLICAR' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV73AccionesFases == 6 )
      {
         /* Execute user subroutine: 'DO ABRIR' */
         S202 ();
         if (returnInSub) return;
      }
      AV73AccionesFases = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AccionesFases), 4, 0));
      /*  Sending Event outputs  */
      cmbavAccionesfases.setValue( GXutil.trim( GXutil.str( AV73AccionesFases, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesfases.getInternalname(), "Values", cmbavAccionesfases.ToJavascriptSource(), true);
   }

   public void e1429B2( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEA' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1529B2( )
   {
      /* Dvelop_confirmpanel_duplicar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_duplicar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DUPLICAR' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1629B2( )
   {
      /* Dvelop_confirmpanel_abrir_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_abrir_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ABRIR' */
         S232 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ELIMINARLINEA' Routine */
      returnInSub = false ;
      if ( A153BarFasEst != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta fase esta en Produccion", ""));
      }
      else
      {
         Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.getMessage( "¿Desea eliminar la linea ", "")+GXutil.trim( GXutil.str( A194BarOrdLin, 4, 0))+" "+GXutil.trim( A457FasCod)+" "+GXutil.trim( A460FasDsc) ;
         ucDvelop_confirmpanel_eliminarlinea.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_eliminarlinea_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminarlinea_Confirmationtext);
         AV116Emprcod_selected = A396EmprCod ;
         AV117Barcod_selected = A129BarCod ;
         AV118Barcodreo_selected = A132BarCodReo ;
         AV119Barcodpar_selected = A130BarCodPar ;
         this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S212( )
   {
      /* 'DO ACTION ELIMINARLINEA' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV51EmprCod ;
      GXv_int10[0] = AV52BarCod ;
      GXv_int11[0] = AV53BarCodReo ;
      GXv_char5[0] = AV54BarCodPar ;
      GXv_char4[0] = AV55ProCod ;
      GXv_int2[0] = A194BarOrdLin ;
      new app.pprofs03(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_int11, GXv_char5, GXv_char4, GXv_int2) ;
      hojaderuta__fases_wc_impl.this.AV51EmprCod = GXv_char6[0] ;
      hojaderuta__fases_wc_impl.this.AV52BarCod = GXv_int10[0] ;
      hojaderuta__fases_wc_impl.this.AV53BarCodReo = GXv_int11[0] ;
      hojaderuta__fases_wc_impl.this.AV54BarCodPar = GXv_char5[0] ;
      hojaderuta__fases_wc_impl.this.AV55ProCod = GXv_char4[0] ;
      hojaderuta__fases_wc_impl.this.A194BarOrdLin = GXv_int2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EmprCod", AV51EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodReo", GXutil.str( AV53BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarCodPar", AV54BarCodPar);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55ProCod", AV55ProCod);
      new app.pcommit(remoteHandle, context).execute( ) ;
      AV78Inc_obs = httpContext.getMessage( "Fase= ", "") + A457FasCod + httpContext.getMessage( " Linea= ", "") + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( " Eliminada", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV51EmprCod, GXutil.substring( AV81Pgmname, 1, 10), GXutil.substring( AV76UsurCod, 1, 8), AV77Station, AV78Inc_obs, AV52BarCod, AV53BarCodReo, AV54BarCodPar) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S162( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tbarfso", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV51EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV52BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV54BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV55ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A460FasDsc)),GXutil.URLEncode(GXutil.rtrim(AV56Prodsc))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","FasCod","FasDsc","ProDsc"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S172( )
   {
      /* 'DO PARAMETROS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tfaspar", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV51EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV52BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV54BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV55ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S182( )
   {
      /* 'DO TRATAMIENTOQUIMICO' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {}) , new Object[] {});
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      if ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char6[0] = AV51EmprCod ;
         GXv_int10[0] = AV52BarCod ;
         GXv_int11[0] = AV53BarCodReo ;
         GXv_char5[0] = AV54BarCodPar ;
         GXv_char4[0] = AV55ProCod ;
         GXv_int2[0] = A194BarOrdLin ;
         new app.phdfpq(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_int11, GXv_char5, GXv_char4, GXv_int2) ;
         hojaderuta__fases_wc_impl.this.AV51EmprCod = GXv_char6[0] ;
         hojaderuta__fases_wc_impl.this.AV52BarCod = GXv_int10[0] ;
         hojaderuta__fases_wc_impl.this.AV53BarCodReo = GXv_int11[0] ;
         hojaderuta__fases_wc_impl.this.AV54BarCodPar = GXv_char5[0] ;
         hojaderuta__fases_wc_impl.this.AV55ProCod = GXv_char4[0] ;
         hojaderuta__fases_wc_impl.this.A194BarOrdLin = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EmprCod", AV51EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodReo", GXutil.str( AV53BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarCodPar", AV54BarCodPar);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55ProCod", AV55ProCod);
         httpContext.popup(formatLink("app.thdfpq", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV51EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV52BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV54BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV55ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) , new Object[] {});
         if ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char6[0] = AV51EmprCod ;
            GXv_int10[0] = AV52BarCod ;
            GXv_int11[0] = AV53BarCodReo ;
            GXv_char5[0] = AV54BarCodPar ;
            GXv_char4[0] = AV55ProCod ;
            new app.pacbquh(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_int11, GXv_char5, GXv_char4) ;
            hojaderuta__fases_wc_impl.this.AV51EmprCod = GXv_char6[0] ;
            hojaderuta__fases_wc_impl.this.AV52BarCod = GXv_int10[0] ;
            hojaderuta__fases_wc_impl.this.AV53BarCodReo = GXv_int11[0] ;
            hojaderuta__fases_wc_impl.this.AV54BarCodPar = GXv_char5[0] ;
            hojaderuta__fases_wc_impl.this.AV55ProCod = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EmprCod", AV51EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodReo", GXutil.str( AV53BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarCodPar", AV54BarCodPar);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55ProCod", AV55ProCod);
         }
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La fase debe tener item Formula=S", ""));
      }
   }

   public void S192( )
   {
      /* 'DO DUPLICAR' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_duplicar_Confirmationtext = httpContext.getMessage( "Duplicar. Lo que hace el programa, es crear una nueva linea (orden), tomando la fase donde estas posicionado como origen.", "")+GXutil.newLine( ) ;
      ucDvelop_confirmpanel_duplicar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_duplicar_Internalname, "ConfirmationText", Dvelop_confirmpanel_duplicar_Confirmationtext);
      Dvelop_confirmpanel_duplicar_Confirmationtext = Dvelop_confirmpanel_duplicar_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
      ucDvelop_confirmpanel_duplicar.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_duplicar_Internalname, "ConfirmationText", Dvelop_confirmpanel_duplicar_Confirmationtext);
      AV116Emprcod_selected = A396EmprCod ;
      AV117Barcod_selected = A129BarCod ;
      AV118Barcodreo_selected = A132BarCodReo ;
      AV119Barcodpar_selected = A130BarCodPar ;
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_DUPLICARContainer", "Confirm", "", new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S222( )
   {
      /* 'DO ACTION DUPLICAR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta_fases_abrir", new String[] {GXutil.URLEncode(GXutil.rtrim(AV51EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV52BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV54BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV55ProCod)),GXutil.URLEncode(GXutil.rtrim(AV56Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A460FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV74Si_rgto,1,0))}, new String[] {"EmprCod","Barcod","BarCodReo","BarCodPar","Procod","Prodsc","Barordlin","FasCod","FasDsc","Si_rgto"}) , new Object[] {"AV51EmprCod","AV52BarCod","AV53BarCodReo","AV54BarCodPar","AV55ProCod","AV56Prodsc","A194BarOrdLin","A457FasCod","A460FasDsc","AV74Si_rgto"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S202( )
   {
      /* 'DO ABRIR' Routine */
      returnInSub = false ;
      if ( A153BarFasEst == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Esta Fase NO ha sido leida", ""));
      }
      else
      {
         Dvelop_confirmpanel_abrir_Confirmationtext = httpContext.getMessage( "Abrir. Este evento, lo que hace es inicializar la linea (orden) que has seleccionado.", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_abrir.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_abrir_Internalname, "ConfirmationText", Dvelop_confirmpanel_abrir_Confirmationtext);
         Dvelop_confirmpanel_abrir_Confirmationtext = Dvelop_confirmpanel_abrir_Confirmationtext+httpContext.getMessage( "Y tambien , elimina los registros que haya tenido en las lecturas del programa LECTOR.", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_abrir.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_abrir_Internalname, "ConfirmationText", Dvelop_confirmpanel_abrir_Confirmationtext);
         Dvelop_confirmpanel_abrir_Confirmationtext = Dvelop_confirmpanel_abrir_Confirmationtext+httpContext.getMessage( "Desea continuar?", "") ;
         ucDvelop_confirmpanel_abrir.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_abrir_Internalname, "ConfirmationText", Dvelop_confirmpanel_abrir_Confirmationtext);
         AV116Emprcod_selected = A396EmprCod ;
         AV117Barcod_selected = A129BarCod ;
         AV118Barcodreo_selected = A132BarCodReo ;
         AV119Barcodpar_selected = A130BarCodPar ;
         this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ABRIRContainer", "Confirm", "", new Object[] {});
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S232( )
   {
      /* 'DO ACTION ABRIR' Routine */
      returnInSub = false ;
      new app.pedidosclientesindetalle.abrirfase(remoteHandle, context).execute( AV51EmprCod, AV52BarCod, AV53BarCodReo, AV54BarCodPar, AV55ProCod, A194BarOrdLin, AV76UsurCod, AV77Station) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV81Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV81Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV81Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV120GXV1 = 1 ;
      while ( AV120GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV120GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV15TFBarOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFBarOrdLin), 4, 0));
            AV16TFBarOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV17TFFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFFasCod", AV17TFFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV18TFFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFFasCod_Sel", AV18TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV19TFFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFFasDsc", AV19TFFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV20TFFasDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFFasDsc_Sel", AV20TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV21TFMaqCodBis = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFMaqCodBis", AV21TFMaqCodBis);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV22TFMaqCodBis_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFMaqCodBis_Sel", AV22TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCON") == 0 )
         {
            AV23TFBarFasCon = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFBarFasCon", AV23TFBarFasCon);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCON_SEL") == 0 )
         {
            AV24TFBarFasCon_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFBarFasCon_Sel", AV24TFBarFasCon_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST") == 0 )
         {
            AV25TFBarFasEst = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFBarFasEst", GXutil.str( AV25TFBarFasEst, 1, 0));
            AV26TFBarFasEst_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarFasEst_To", GXutil.str( AV26TFBarFasEst_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFACTIN") == 0 )
         {
            AV27TFBarFacTin = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarFacTin", AV27TFBarFacTin);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFACTIN_SEL") == 0 )
         {
            AV28TFBarFacTin_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarFacTin_Sel", AV28TFBarFacTin_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASACAB") == 0 )
         {
            AV29TFBarFasAcab = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarFasAcab", AV29TFBarFasAcab);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASACAB_SEL") == 0 )
         {
            AV30TFBarFasAcab_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarFasAcab_Sel", AV30TFBarFasAcab_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASFOR") == 0 )
         {
            AV31TFBarFasFor = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarFasFor", AV31TFBarFasFor);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASFOR_SEL") == 0 )
         {
            AV32TFBarFasFor_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarFasFor_Sel", AV32TFBarFasFor_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIETEO") == 0 )
         {
            AV33TFBarTieTeo = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFBarTieTeo", GXutil.ltrimstr( AV33TFBarTieTeo, 5, 2));
            AV34TFBarTieTeo_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarTieTeo_To", GXutil.ltrimstr( AV34TFBarTieTeo_To, 5, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV35TFBarTieRea = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarTieRea", GXutil.ltrimstr( AV35TFBarTieRea, 5, 2));
            AV36TFBarTieRea_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFBarTieRea_To", GXutil.ltrimstr( AV36TFBarTieRea_To, 5, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTI") == 0 )
         {
            AV37TFBarFasDTI = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarFasDTI", localUtil.ttoc( AV37TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV38DDO_BarFasDTIAuxDate = GXutil.resetTime(AV37TFBarFasDTI) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38DDO_BarFasDTIAuxDate", localUtil.format(AV38DDO_BarFasDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDTF") == 0 )
         {
            AV39TFBarFasDTF = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFBarFasDTF", localUtil.ttoc( AV39TFBarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV40DDO_BarFasDTFAuxDate = GXutil.resetTime(AV39TFBarFasDTF) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_BarFasDTFAuxDate", localUtil.format(AV40DDO_BarFasDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV41TFBarFasKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarFasKgm", GXutil.ltrimstr( AV41TFBarFasKgm, 9, 2));
            AV42TFBarFasKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarFasKgm_To", GXutil.ltrimstr( AV42TFBarFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV43TFBarFasMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarFasMtr", GXutil.ltrimstr( AV43TFBarFasMtr, 9, 2));
            AV44TFBarFasMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarFasMtr_To", GXutil.ltrimstr( AV44TFBarFasMtr_To, 9, 2));
         }
         AV120GXV1 = (int)(AV120GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFFasCod_Sel)==0), AV18TFFasCod_Sel, GXv_char6) ;
      hojaderuta__fases_wc_impl.this.GXt_char3 = GXv_char6[0] ;
      GXt_char12 = "" ;
      GXv_char5[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFFasDsc_Sel)==0), AV20TFFasDsc_Sel, GXv_char5) ;
      hojaderuta__fases_wc_impl.this.GXt_char12 = GXv_char5[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFMaqCodBis_Sel)==0), AV22TFMaqCodBis_Sel, GXv_char4) ;
      hojaderuta__fases_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV24TFBarFasCon_Sel)==0), AV24TFBarFasCon_Sel, GXv_char15) ;
      hojaderuta__fases_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFBarFacTin_Sel)==0), AV28TFBarFacTin_Sel, GXv_char17) ;
      hojaderuta__fases_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFBarFasAcab_Sel)==0), AV30TFBarFasAcab_Sel, GXv_char19) ;
      hojaderuta__fases_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarFasFor_Sel)==0), AV32TFBarFasFor_Sel, GXv_char21) ;
      hojaderuta__fases_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char3+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"||"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV17TFFasCod)==0), AV17TFFasCod, GXv_char21) ;
      hojaderuta__fases_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFFasDsc)==0), AV19TFFasDsc, GXv_char19) ;
      hojaderuta__fases_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFMaqCodBis)==0), AV21TFMaqCodBis, GXv_char17) ;
      hojaderuta__fases_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFBarFasCon)==0), AV23TFBarFasCon, GXv_char15) ;
      hojaderuta__fases_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char6[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFBarFacTin)==0), AV27TFBarFacTin, GXv_char6) ;
      hojaderuta__fases_wc_impl.this.GXt_char13 = GXv_char6[0] ;
      GXt_char12 = "" ;
      GXv_char5[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFBarFasAcab)==0), AV29TFBarFasAcab, GXv_char5) ;
      hojaderuta__fases_wc_impl.this.GXt_char12 = GXv_char5[0] ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFBarFasFor)==0), AV31TFBarFasFor, GXv_char4) ;
      hojaderuta__fases_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFBarOrdLin) ? "" : GXutil.str( AV15TFBarOrdLin, 4, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+((0==AV25TFBarFasEst) ? "" : GXutil.str( AV25TFBarFasEst, 1, 0))+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char3+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarTieTeo)==0) ? "" : GXutil.str( AV33TFBarTieTeo, 5, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarTieRea)==0) ? "" : GXutil.str( AV35TFBarTieRea, 5, 2))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV37TFBarFasDTI) ? "" : localUtil.dtoc( AV38DDO_BarFasDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV39TFBarFasDTF) ? "" : localUtil.dtoc( AV40DDO_BarFasDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarFasKgm)==0) ? "" : GXutil.str( AV41TFBarFasKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarFasMtr)==0) ? "" : GXutil.str( AV43TFBarFasMtr, 9, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFBarOrdLin_To) ? "" : GXutil.str( AV16TFBarOrdLin_To, 4, 0))+"|||||"+((0==AV26TFBarFasEst_To) ? "" : GXutil.str( AV26TFBarFasEst_To, 1, 0))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarTieTeo_To)==0) ? "" : GXutil.str( AV34TFBarTieTeo_To, 5, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarTieRea_To)==0) ? "" : GXutil.str( AV36TFBarTieRea_To, 5, 2))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarFasKgm_To)==0) ? "" : GXutil.str( AV42TFBarFasKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarFasMtr_To)==0) ? "" : GXutil.str( AV44TFBarFasMtr_To, 9, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV81Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARORDLIN", "", !((0==AV15TFBarOrdLin)&&(0==AV16TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV16TFBarOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASCOD", "", !(GXutil.strcmp("", AV17TFFasCod)==0), (short)(0), AV17TFFasCod, "", !(GXutil.strcmp("", AV18TFFasCod_Sel)==0), AV18TFFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASDSC", "", !(GXutil.strcmp("", AV19TFFasDsc)==0), (short)(0), AV19TFFasDsc, "", !(GXutil.strcmp("", AV20TFFasDsc_Sel)==0), AV20TFFasDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFMAQCODBIS", "", !(GXutil.strcmp("", AV21TFMaqCodBis)==0), (short)(0), AV21TFMaqCodBis, "", !(GXutil.strcmp("", AV22TFMaqCodBis_Sel)==0), AV22TFMaqCodBis_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARFASCON", "", !(GXutil.strcmp("", AV23TFBarFasCon)==0), (short)(0), AV23TFBarFasCon, "", !(GXutil.strcmp("", AV24TFBarFasCon_Sel)==0), AV24TFBarFasCon_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARFASEST", "", !((0==AV25TFBarFasEst)&&(0==AV26TFBarFasEst_To)), (short)(0), GXutil.trim( GXutil.str( AV25TFBarFasEst, 1, 0)), GXutil.trim( GXutil.str( AV26TFBarFasEst_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARFACTIN", "", !(GXutil.strcmp("", AV27TFBarFacTin)==0), (short)(0), AV27TFBarFacTin, "", !(GXutil.strcmp("", AV28TFBarFacTin_Sel)==0), AV28TFBarFacTin_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARFASACAB", "", !(GXutil.strcmp("", AV29TFBarFasAcab)==0), (short)(0), AV29TFBarFasAcab, "", !(GXutil.strcmp("", AV30TFBarFasAcab_Sel)==0), AV30TFBarFasAcab_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARFASFOR", "", !(GXutil.strcmp("", AV31TFBarFasFor)==0), (short)(0), AV31TFBarFasFor, "", !(GXutil.strcmp("", AV32TFBarFasFor_Sel)==0), AV32TFBarFasFor_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARTIETEO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarTieTeo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarTieTeo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV33TFBarTieTeo, 5, 2)), GXutil.trim( GXutil.str( AV34TFBarTieTeo_To, 5, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARTIEREA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarTieRea)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarTieRea_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV35TFBarTieRea, 5, 2)), GXutil.trim( GXutil.str( AV36TFBarTieRea_To, 5, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARFASDTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV37TFBarFasDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV37TFBarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARFASDTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV39TFBarFasDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV39TFBarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARFASKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFBarFasKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFBarFasKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV41TFBarFasKgm, 9, 2)), GXutil.trim( GXutil.str( AV42TFBarFasKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARFASMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFBarFasMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFBarFasMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV43TFBarFasMtr, 9, 2)), GXutil.trim( GXutil.str( AV44TFBarFasMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV51EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV51EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV52BarCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV52BarCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV53BarCodReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV53BarCodReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV54BarCodPar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV54BarCodPar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV55ProCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV55ProCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV56Prodsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRODSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV56Prodsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV57BarExt) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BAREXT" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV57BarExt, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV58Discod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DISCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV58Discod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV59BarSit) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSIT" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV59BarSit, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV60Clicod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV60Clicod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV61Barunimed)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARUNIMED" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV61Barunimed );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV62Barpes) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARPES" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV62Barpes, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV72barser)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV72barser );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV71PedidoCliente)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PEDIDOCLIENTE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV71PedidoCliente );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV70barcolnom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV70barcolnom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV69barcolnum) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV69barcolnum, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV68Barpie) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARPIE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV68Barpie, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67BarKgm)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARKGM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV67BarKgm, 9, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Barmtr)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARMTR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV66Barmtr, 9, 2) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV65CliNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLINOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV65CliNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV64BarSerDsc)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERDSC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV64BarSerDsc );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV63BarAgrest)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARAGREST" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV63BarAgrest );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV81Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TBARFAS" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV51EmprCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV52BarCod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodReo" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV53BarCodReo, 1, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodPar" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV54BarCodPar );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "ProCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV55ProCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "ProDsc" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV56Prodsc );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table3_63_29B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_abrir_Internalname, tblTabledvelop_confirmpanel_abrir_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_abrir.setProperty("Title", Dvelop_confirmpanel_abrir_Title);
         ucDvelop_confirmpanel_abrir.setProperty("ConfirmationText", Dvelop_confirmpanel_abrir_Confirmationtext);
         ucDvelop_confirmpanel_abrir.setProperty("YesButtonCaption", Dvelop_confirmpanel_abrir_Yesbuttoncaption);
         ucDvelop_confirmpanel_abrir.setProperty("NoButtonCaption", Dvelop_confirmpanel_abrir_Nobuttoncaption);
         ucDvelop_confirmpanel_abrir.setProperty("CancelButtonCaption", Dvelop_confirmpanel_abrir_Cancelbuttoncaption);
         ucDvelop_confirmpanel_abrir.setProperty("YesButtonPosition", Dvelop_confirmpanel_abrir_Yesbuttonposition);
         ucDvelop_confirmpanel_abrir.setProperty("ConfirmType", Dvelop_confirmpanel_abrir_Confirmtype);
         ucDvelop_confirmpanel_abrir.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_abrir_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ABRIRContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ABRIRContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_63_29B2e( true) ;
      }
      else
      {
         wb_table3_63_29B2e( false) ;
      }
   }

   public void wb_table2_58_29B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_duplicar_Internalname, tblTabledvelop_confirmpanel_duplicar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_duplicar.setProperty("Title", Dvelop_confirmpanel_duplicar_Title);
         ucDvelop_confirmpanel_duplicar.setProperty("ConfirmationText", Dvelop_confirmpanel_duplicar_Confirmationtext);
         ucDvelop_confirmpanel_duplicar.setProperty("YesButtonCaption", Dvelop_confirmpanel_duplicar_Yesbuttoncaption);
         ucDvelop_confirmpanel_duplicar.setProperty("NoButtonCaption", Dvelop_confirmpanel_duplicar_Nobuttoncaption);
         ucDvelop_confirmpanel_duplicar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_duplicar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_duplicar.setProperty("YesButtonPosition", Dvelop_confirmpanel_duplicar_Yesbuttonposition);
         ucDvelop_confirmpanel_duplicar.setProperty("ConfirmType", Dvelop_confirmpanel_duplicar_Confirmtype);
         ucDvelop_confirmpanel_duplicar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_duplicar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_DUPLICARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_DUPLICARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_58_29B2e( true) ;
      }
      else
      {
         wb_table2_58_29B2e( false) ;
      }
   }

   public void wb_table1_53_29B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarlinea.setProperty("Title", Dvelop_confirmpanel_eliminarlinea_Title);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarlinea_Confirmationtext);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarlinea_Confirmtype);
         ucDvelop_confirmpanel_eliminarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarlinea_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_53_29B2e( true) ;
      }
      else
      {
         wb_table1_53_29B2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV51EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EmprCod", AV51EmprCod);
      AV52BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarCod), 8, 0));
      AV53BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodReo", GXutil.str( AV53BarCodReo, 1, 0));
      AV54BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarCodPar", AV54BarCodPar);
      AV55ProCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55ProCod", AV55ProCod);
      AV56Prodsc = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Prodsc", AV56Prodsc);
      AV57BarExt = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarExt", GXutil.str( AV57BarExt, 1, 0));
      AV58Discod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Discod), 8, 0));
      AV59BarSit = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarSit), 2, 0));
      AV60Clicod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Clicod), 6, 0));
      AV61Barunimed = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Barunimed", AV61Barunimed);
      AV62Barpes = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Barpes), 4, 0));
      AV72barser = (String)getParm(obj,12,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72barser", AV72barser);
      AV71PedidoCliente = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PedidoCliente", AV71PedidoCliente);
      AV70barcolnom = (String)getParm(obj,14,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70barcolnom", AV70barcolnom);
      AV69barcolnum = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69barcolnum), 6, 0));
      AV68Barpie = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Barpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Barpie), 6, 0));
      AV67BarKgm = (java.math.BigDecimal)getParm(obj,17,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67BarKgm", GXutil.ltrimstr( AV67BarKgm, 9, 2));
      AV66Barmtr = (java.math.BigDecimal)getParm(obj,18,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barmtr", GXutil.ltrimstr( AV66Barmtr, 9, 2));
      AV65CliNom = (String)getParm(obj,19,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65CliNom", AV65CliNom);
      AV64BarSerDsc = (String)getParm(obj,20,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarSerDsc", AV64BarSerDsc);
      AV63BarAgrest = (String)getParm(obj,21,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarAgrest", AV63BarAgrest);
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa29B2( ) ;
      ws29B2( ) ;
      we29B2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV51EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV52BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV53BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV54BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV55ProCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV56Prodsc = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV57BarExt = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV58Discod = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV59BarSit = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV60Clicod = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV61Barunimed = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV62Barpes = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV72barser = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV71PedidoCliente = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV70barcolnom = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV69barcolnum = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV68Barpie = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV67BarKgm = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV66Barmtr = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV65CliNom = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV64BarSerDsc = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV63BarAgrest = (String)getParm(obj,21,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa29B2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "pedidosclientesindetalle\\hojaderuta__fases_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa29B2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV51EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EmprCod", AV51EmprCod);
         AV52BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarCod), 8, 0));
         AV53BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodReo", GXutil.str( AV53BarCodReo, 1, 0));
         AV54BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarCodPar", AV54BarCodPar);
         AV55ProCod = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55ProCod", AV55ProCod);
         AV56Prodsc = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Prodsc", AV56Prodsc);
         AV57BarExt = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarExt", GXutil.str( AV57BarExt, 1, 0));
         AV58Discod = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Discod), 8, 0));
         AV59BarSit = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarSit), 2, 0));
         AV60Clicod = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Clicod), 6, 0));
         AV61Barunimed = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Barunimed", AV61Barunimed);
         AV62Barpes = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Barpes), 4, 0));
         AV72barser = (String)getParm(obj,14,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72barser", AV72barser);
         AV71PedidoCliente = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PedidoCliente", AV71PedidoCliente);
         AV70barcolnom = (String)getParm(obj,16,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70barcolnom", AV70barcolnom);
         AV69barcolnum = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69barcolnum), 6, 0));
         AV68Barpie = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Barpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Barpie), 6, 0));
         AV67BarKgm = (java.math.BigDecimal)getParm(obj,19,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67BarKgm", GXutil.ltrimstr( AV67BarKgm, 9, 2));
         AV66Barmtr = (java.math.BigDecimal)getParm(obj,20,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barmtr", GXutil.ltrimstr( AV66Barmtr, 9, 2));
         AV65CliNom = (String)getParm(obj,21,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65CliNom", AV65CliNom);
         AV64BarSerDsc = (String)getParm(obj,22,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarSerDsc", AV64BarSerDsc);
         AV63BarAgrest = (String)getParm(obj,23,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarAgrest", AV63BarAgrest);
      }
      wcpOAV51EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV51EmprCod") ;
      wcpOAV52BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV52BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV53BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV53BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV54BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV54BarCodPar") ;
      wcpOAV55ProCod = httpContext.cgiGet( sPrefix+"wcpOAV55ProCod") ;
      wcpOAV56Prodsc = httpContext.cgiGet( sPrefix+"wcpOAV56Prodsc") ;
      wcpOAV57BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57BarExt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV58Discod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58Discod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV59BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV59BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV60Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV60Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV61Barunimed = httpContext.cgiGet( sPrefix+"wcpOAV61Barunimed") ;
      wcpOAV62Barpes = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV62Barpes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV72barser = httpContext.cgiGet( sPrefix+"wcpOAV72barser") ;
      wcpOAV71PedidoCliente = httpContext.cgiGet( sPrefix+"wcpOAV71PedidoCliente") ;
      wcpOAV70barcolnom = httpContext.cgiGet( sPrefix+"wcpOAV70barcolnom") ;
      wcpOAV69barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69barcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV68Barpie = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV68Barpie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV67BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV67BarKgm")) ;
      wcpOAV66Barmtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV66Barmtr")) ;
      wcpOAV65CliNom = httpContext.cgiGet( sPrefix+"wcpOAV65CliNom") ;
      wcpOAV64BarSerDsc = httpContext.cgiGet( sPrefix+"wcpOAV64BarSerDsc") ;
      wcpOAV63BarAgrest = httpContext.cgiGet( sPrefix+"wcpOAV63BarAgrest") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV51EmprCod, wcpOAV51EmprCod) != 0 ) || ( AV52BarCod != wcpOAV52BarCod ) || ( AV53BarCodReo != wcpOAV53BarCodReo ) || ( GXutil.strcmp(AV54BarCodPar, wcpOAV54BarCodPar) != 0 ) || ( GXutil.strcmp(AV55ProCod, wcpOAV55ProCod) != 0 ) || ( GXutil.strcmp(AV56Prodsc, wcpOAV56Prodsc) != 0 ) || ( AV57BarExt != wcpOAV57BarExt ) || ( AV58Discod != wcpOAV58Discod ) || ( AV59BarSit != wcpOAV59BarSit ) || ( AV60Clicod != wcpOAV60Clicod ) || ( GXutil.strcmp(AV61Barunimed, wcpOAV61Barunimed) != 0 ) || ( AV62Barpes != wcpOAV62Barpes ) || ( GXutil.strcmp(AV72barser, wcpOAV72barser) != 0 ) || ( GXutil.strcmp(AV71PedidoCliente, wcpOAV71PedidoCliente) != 0 ) || ( GXutil.strcmp(AV70barcolnom, wcpOAV70barcolnom) != 0 ) || ( AV69barcolnum != wcpOAV69barcolnum ) || ( AV68Barpie != wcpOAV68Barpie ) || ( DecimalUtil.compareTo(AV67BarKgm, wcpOAV67BarKgm) != 0 ) || ( DecimalUtil.compareTo(AV66Barmtr, wcpOAV66Barmtr) != 0 ) || ( GXutil.strcmp(AV65CliNom, wcpOAV65CliNom) != 0 ) || ( GXutil.strcmp(AV64BarSerDsc, wcpOAV64BarSerDsc) != 0 ) || ( GXutil.strcmp(AV63BarAgrest, wcpOAV63BarAgrest) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV51EmprCod = AV51EmprCod ;
      wcpOAV52BarCod = AV52BarCod ;
      wcpOAV53BarCodReo = AV53BarCodReo ;
      wcpOAV54BarCodPar = AV54BarCodPar ;
      wcpOAV55ProCod = AV55ProCod ;
      wcpOAV56Prodsc = AV56Prodsc ;
      wcpOAV57BarExt = AV57BarExt ;
      wcpOAV58Discod = AV58Discod ;
      wcpOAV59BarSit = AV59BarSit ;
      wcpOAV60Clicod = AV60Clicod ;
      wcpOAV61Barunimed = AV61Barunimed ;
      wcpOAV62Barpes = AV62Barpes ;
      wcpOAV72barser = AV72barser ;
      wcpOAV71PedidoCliente = AV71PedidoCliente ;
      wcpOAV70barcolnom = AV70barcolnom ;
      wcpOAV69barcolnum = AV69barcolnum ;
      wcpOAV68Barpie = AV68Barpie ;
      wcpOAV67BarKgm = AV67BarKgm ;
      wcpOAV66Barmtr = AV66Barmtr ;
      wcpOAV65CliNom = AV65CliNom ;
      wcpOAV64BarSerDsc = AV64BarSerDsc ;
      wcpOAV63BarAgrest = AV63BarAgrest ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV51EmprCod = httpContext.cgiGet( sPrefix+"AV51EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV51EmprCod) > 0 )
      {
         AV51EmprCod = httpContext.cgiGet( sCtrlAV51EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51EmprCod", AV51EmprCod);
      }
      else
      {
         AV51EmprCod = httpContext.cgiGet( sPrefix+"AV51EmprCod_PARM") ;
      }
      sCtrlAV52BarCod = httpContext.cgiGet( sPrefix+"AV52BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV52BarCod) > 0 )
      {
         AV52BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV52BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52BarCod), 8, 0));
      }
      else
      {
         AV52BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV52BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV53BarCodReo = httpContext.cgiGet( sPrefix+"AV53BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV53BarCodReo) > 0 )
      {
         AV53BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV53BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53BarCodReo", GXutil.str( AV53BarCodReo, 1, 0));
      }
      else
      {
         AV53BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV53BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV54BarCodPar = httpContext.cgiGet( sPrefix+"AV54BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV54BarCodPar) > 0 )
      {
         AV54BarCodPar = httpContext.cgiGet( sCtrlAV54BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54BarCodPar", AV54BarCodPar);
      }
      else
      {
         AV54BarCodPar = httpContext.cgiGet( sPrefix+"AV54BarCodPar_PARM") ;
      }
      sCtrlAV55ProCod = httpContext.cgiGet( sPrefix+"AV55ProCod_CTRL") ;
      if ( GXutil.len( sCtrlAV55ProCod) > 0 )
      {
         AV55ProCod = httpContext.cgiGet( sCtrlAV55ProCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55ProCod", AV55ProCod);
      }
      else
      {
         AV55ProCod = httpContext.cgiGet( sPrefix+"AV55ProCod_PARM") ;
      }
      sCtrlAV56Prodsc = httpContext.cgiGet( sPrefix+"AV56Prodsc_CTRL") ;
      if ( GXutil.len( sCtrlAV56Prodsc) > 0 )
      {
         AV56Prodsc = httpContext.cgiGet( sCtrlAV56Prodsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56Prodsc", AV56Prodsc);
      }
      else
      {
         AV56Prodsc = httpContext.cgiGet( sPrefix+"AV56Prodsc_PARM") ;
      }
      sCtrlAV57BarExt = httpContext.cgiGet( sPrefix+"AV57BarExt_CTRL") ;
      if ( GXutil.len( sCtrlAV57BarExt) > 0 )
      {
         AV57BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV57BarExt), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarExt", GXutil.str( AV57BarExt, 1, 0));
      }
      else
      {
         AV57BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV57BarExt_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV58Discod = httpContext.cgiGet( sPrefix+"AV58Discod_CTRL") ;
      if ( GXutil.len( sCtrlAV58Discod) > 0 )
      {
         AV58Discod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV58Discod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Discod), 8, 0));
      }
      else
      {
         AV58Discod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV58Discod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV59BarSit = httpContext.cgiGet( sPrefix+"AV59BarSit_CTRL") ;
      if ( GXutil.len( sCtrlAV59BarSit) > 0 )
      {
         AV59BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV59BarSit), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59BarSit), 2, 0));
      }
      else
      {
         AV59BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV59BarSit_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV60Clicod = httpContext.cgiGet( sPrefix+"AV60Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV60Clicod) > 0 )
      {
         AV60Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV60Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Clicod), 6, 0));
      }
      else
      {
         AV60Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV60Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV61Barunimed = httpContext.cgiGet( sPrefix+"AV61Barunimed_CTRL") ;
      if ( GXutil.len( sCtrlAV61Barunimed) > 0 )
      {
         AV61Barunimed = httpContext.cgiGet( sCtrlAV61Barunimed) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Barunimed", AV61Barunimed);
      }
      else
      {
         AV61Barunimed = httpContext.cgiGet( sPrefix+"AV61Barunimed_PARM") ;
      }
      sCtrlAV62Barpes = httpContext.cgiGet( sPrefix+"AV62Barpes_CTRL") ;
      if ( GXutil.len( sCtrlAV62Barpes) > 0 )
      {
         AV62Barpes = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV62Barpes), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Barpes), 4, 0));
      }
      else
      {
         AV62Barpes = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV62Barpes_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV72barser = httpContext.cgiGet( sPrefix+"AV72barser_CTRL") ;
      if ( GXutil.len( sCtrlAV72barser) > 0 )
      {
         AV72barser = httpContext.cgiGet( sCtrlAV72barser) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72barser", AV72barser);
      }
      else
      {
         AV72barser = httpContext.cgiGet( sPrefix+"AV72barser_PARM") ;
      }
      sCtrlAV71PedidoCliente = httpContext.cgiGet( sPrefix+"AV71PedidoCliente_CTRL") ;
      if ( GXutil.len( sCtrlAV71PedidoCliente) > 0 )
      {
         AV71PedidoCliente = httpContext.cgiGet( sCtrlAV71PedidoCliente) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71PedidoCliente", AV71PedidoCliente);
      }
      else
      {
         AV71PedidoCliente = httpContext.cgiGet( sPrefix+"AV71PedidoCliente_PARM") ;
      }
      sCtrlAV70barcolnom = httpContext.cgiGet( sPrefix+"AV70barcolnom_CTRL") ;
      if ( GXutil.len( sCtrlAV70barcolnom) > 0 )
      {
         AV70barcolnom = httpContext.cgiGet( sCtrlAV70barcolnom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70barcolnom", AV70barcolnom);
      }
      else
      {
         AV70barcolnom = httpContext.cgiGet( sPrefix+"AV70barcolnom_PARM") ;
      }
      sCtrlAV69barcolnum = httpContext.cgiGet( sPrefix+"AV69barcolnum_CTRL") ;
      if ( GXutil.len( sCtrlAV69barcolnum) > 0 )
      {
         AV69barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV69barcolnum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69barcolnum), 6, 0));
      }
      else
      {
         AV69barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV69barcolnum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV68Barpie = httpContext.cgiGet( sPrefix+"AV68Barpie_CTRL") ;
      if ( GXutil.len( sCtrlAV68Barpie) > 0 )
      {
         AV68Barpie = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV68Barpie), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Barpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Barpie), 6, 0));
      }
      else
      {
         AV68Barpie = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV68Barpie_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV67BarKgm = httpContext.cgiGet( sPrefix+"AV67BarKgm_CTRL") ;
      if ( GXutil.len( sCtrlAV67BarKgm) > 0 )
      {
         AV67BarKgm = localUtil.ctond( httpContext.cgiGet( sCtrlAV67BarKgm)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67BarKgm", GXutil.ltrimstr( AV67BarKgm, 9, 2));
      }
      else
      {
         AV67BarKgm = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV67BarKgm_PARM")) ;
      }
      sCtrlAV66Barmtr = httpContext.cgiGet( sPrefix+"AV66Barmtr_CTRL") ;
      if ( GXutil.len( sCtrlAV66Barmtr) > 0 )
      {
         AV66Barmtr = localUtil.ctond( httpContext.cgiGet( sCtrlAV66Barmtr)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Barmtr", GXutil.ltrimstr( AV66Barmtr, 9, 2));
      }
      else
      {
         AV66Barmtr = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV66Barmtr_PARM")) ;
      }
      sCtrlAV65CliNom = httpContext.cgiGet( sPrefix+"AV65CliNom_CTRL") ;
      if ( GXutil.len( sCtrlAV65CliNom) > 0 )
      {
         AV65CliNom = httpContext.cgiGet( sCtrlAV65CliNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65CliNom", AV65CliNom);
      }
      else
      {
         AV65CliNom = httpContext.cgiGet( sPrefix+"AV65CliNom_PARM") ;
      }
      sCtrlAV64BarSerDsc = httpContext.cgiGet( sPrefix+"AV64BarSerDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV64BarSerDsc) > 0 )
      {
         AV64BarSerDsc = httpContext.cgiGet( sCtrlAV64BarSerDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64BarSerDsc", AV64BarSerDsc);
      }
      else
      {
         AV64BarSerDsc = httpContext.cgiGet( sPrefix+"AV64BarSerDsc_PARM") ;
      }
      sCtrlAV63BarAgrest = httpContext.cgiGet( sPrefix+"AV63BarAgrest_CTRL") ;
      if ( GXutil.len( sCtrlAV63BarAgrest) > 0 )
      {
         AV63BarAgrest = httpContext.cgiGet( sCtrlAV63BarAgrest) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63BarAgrest", AV63BarAgrest);
      }
      else
      {
         AV63BarAgrest = httpContext.cgiGet( sPrefix+"AV63BarAgrest_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa29B2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws29B2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws29B2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51EmprCod_PARM", GXutil.rtrim( AV51EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51EmprCod_CTRL", GXutil.rtrim( sCtrlAV51EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV52BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV52BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV52BarCod_CTRL", GXutil.rtrim( sCtrlAV52BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV53BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53BarCodReo_CTRL", GXutil.rtrim( sCtrlAV53BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54BarCodPar_PARM", GXutil.rtrim( AV54BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54BarCodPar_CTRL", GXutil.rtrim( sCtrlAV54BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55ProCod_PARM", GXutil.rtrim( AV55ProCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55ProCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55ProCod_CTRL", GXutil.rtrim( sCtrlAV55ProCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56Prodsc_PARM", GXutil.rtrim( AV56Prodsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56Prodsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56Prodsc_CTRL", GXutil.rtrim( sCtrlAV56Prodsc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57BarExt_PARM", GXutil.ltrim( localUtil.ntoc( AV57BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57BarExt)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57BarExt_CTRL", GXutil.rtrim( sCtrlAV57BarExt));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Discod_PARM", GXutil.ltrim( localUtil.ntoc( AV58Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58Discod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58Discod_CTRL", GXutil.rtrim( sCtrlAV58Discod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59BarSit_PARM", GXutil.ltrim( localUtil.ntoc( AV59BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59BarSit)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59BarSit_CTRL", GXutil.rtrim( sCtrlAV59BarSit));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV60Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60Clicod_CTRL", GXutil.rtrim( sCtrlAV60Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Barunimed_PARM", GXutil.rtrim( AV61Barunimed));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61Barunimed)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61Barunimed_CTRL", GXutil.rtrim( sCtrlAV61Barunimed));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Barpes_PARM", GXutil.ltrim( localUtil.ntoc( AV62Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62Barpes)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Barpes_CTRL", GXutil.rtrim( sCtrlAV62Barpes));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72barser_PARM", GXutil.rtrim( AV72barser));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV72barser)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV72barser_CTRL", GXutil.rtrim( sCtrlAV72barser));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71PedidoCliente_PARM", GXutil.rtrim( AV71PedidoCliente));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71PedidoCliente)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71PedidoCliente_CTRL", GXutil.rtrim( sCtrlAV71PedidoCliente));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70barcolnom_PARM", GXutil.rtrim( AV70barcolnom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70barcolnom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70barcolnom_CTRL", GXutil.rtrim( sCtrlAV70barcolnom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69barcolnum_PARM", GXutil.ltrim( localUtil.ntoc( AV69barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69barcolnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69barcolnum_CTRL", GXutil.rtrim( sCtrlAV69barcolnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Barpie_PARM", GXutil.ltrim( localUtil.ntoc( AV68Barpie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68Barpie)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68Barpie_CTRL", GXutil.rtrim( sCtrlAV68Barpie));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67BarKgm_PARM", GXutil.ltrim( localUtil.ntoc( AV67BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67BarKgm)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67BarKgm_CTRL", GXutil.rtrim( sCtrlAV67BarKgm));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Barmtr_PARM", GXutil.ltrim( localUtil.ntoc( AV66Barmtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66Barmtr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Barmtr_CTRL", GXutil.rtrim( sCtrlAV66Barmtr));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65CliNom_PARM", GXutil.rtrim( AV65CliNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65CliNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65CliNom_CTRL", GXutil.rtrim( sCtrlAV65CliNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarSerDsc_PARM", GXutil.rtrim( AV64BarSerDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64BarSerDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64BarSerDsc_CTRL", GXutil.rtrim( sCtrlAV64BarSerDsc));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarAgrest_PARM", GXutil.rtrim( AV63BarAgrest));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63BarAgrest)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63BarAgrest_CTRL", GXutil.rtrim( sCtrlAV63BarAgrest));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we29B2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211661785", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("pedidosclientesindetalle/hojaderuta__fases_wc.js", "?20268211661785", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_152( )
   {
      cmbavAccionesfases.setInternalname( sPrefix+"vACCIONESFASES_"+sGXsfl_15_idx );
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_15_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_15_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_15_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_15_idx ;
      edtBarFasCon_Internalname = sPrefix+"BARFASCON_"+sGXsfl_15_idx ;
      edtBarFasEst_Internalname = sPrefix+"BARFASEST_"+sGXsfl_15_idx ;
      edtBarFacTin_Internalname = sPrefix+"BARFACTIN_"+sGXsfl_15_idx ;
      edtBarFasAcab_Internalname = sPrefix+"BARFASACAB_"+sGXsfl_15_idx ;
      edtBarFasFor_Internalname = sPrefix+"BARFASFOR_"+sGXsfl_15_idx ;
      edtBarTieTeo_Internalname = sPrefix+"BARTIETEO_"+sGXsfl_15_idx ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA_"+sGXsfl_15_idx ;
      edtBarFasDTI_Internalname = sPrefix+"BARFASDTI_"+sGXsfl_15_idx ;
      edtBarFasDTF_Internalname = sPrefix+"BARFASDTF_"+sGXsfl_15_idx ;
      edtBarFasKgm_Internalname = sPrefix+"BARFASKGM_"+sGXsfl_15_idx ;
      edtBarFasMtr_Internalname = sPrefix+"BARFASMTR_"+sGXsfl_15_idx ;
      cmbFaseExteri.setInternalname( sPrefix+"FASEEXTERI_"+sGXsfl_15_idx );
      edtProCod_Internalname = sPrefix+"PROCOD_"+sGXsfl_15_idx ;
   }

   public void subsflControlProps_fel_152( )
   {
      cmbavAccionesfases.setInternalname( sPrefix+"vACCIONESFASES_"+sGXsfl_15_fel_idx );
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_15_fel_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_15_fel_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_15_fel_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_15_fel_idx ;
      edtBarFasCon_Internalname = sPrefix+"BARFASCON_"+sGXsfl_15_fel_idx ;
      edtBarFasEst_Internalname = sPrefix+"BARFASEST_"+sGXsfl_15_fel_idx ;
      edtBarFacTin_Internalname = sPrefix+"BARFACTIN_"+sGXsfl_15_fel_idx ;
      edtBarFasAcab_Internalname = sPrefix+"BARFASACAB_"+sGXsfl_15_fel_idx ;
      edtBarFasFor_Internalname = sPrefix+"BARFASFOR_"+sGXsfl_15_fel_idx ;
      edtBarTieTeo_Internalname = sPrefix+"BARTIETEO_"+sGXsfl_15_fel_idx ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA_"+sGXsfl_15_fel_idx ;
      edtBarFasDTI_Internalname = sPrefix+"BARFASDTI_"+sGXsfl_15_fel_idx ;
      edtBarFasDTF_Internalname = sPrefix+"BARFASDTF_"+sGXsfl_15_fel_idx ;
      edtBarFasKgm_Internalname = sPrefix+"BARFASKGM_"+sGXsfl_15_fel_idx ;
      edtBarFasMtr_Internalname = sPrefix+"BARFASMTR_"+sGXsfl_15_fel_idx ;
      cmbFaseExteri.setInternalname( sPrefix+"FASEEXTERI_"+sGXsfl_15_fel_idx );
      edtProCod_Internalname = sPrefix+"PROCOD_"+sGXsfl_15_fel_idx ;
   }

   public void sendrow_152( )
   {
      subsflControlProps_152( ) ;
      wb29B0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_15_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_15_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_15_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavAccionesfases.getEnabled()!=0)&&(cmbavAccionesfases.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 16,'"+sPrefix+"',false,'"+sGXsfl_15_idx+"',15)\"" : " ") ;
         if ( ( cmbavAccionesfases.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vACCIONESFASES_" + sGXsfl_15_idx ;
            cmbavAccionesfases.setName( GXCCtl );
            cmbavAccionesfases.setWebtags( "" );
            if ( cmbavAccionesfases.getItemCount() > 0 )
            {
               AV73AccionesFases = (short)(GXutil.lval( cmbavAccionesfases.getValidValue(GXutil.trim( GXutil.str( AV73AccionesFases, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AccionesFases), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAccionesfases,cmbavAccionesfases.getInternalname(),GXutil.trim( GXutil.str( AV73AccionesFases, 4, 0)),Integer.valueOf(1),cmbavAccionesfases.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVACCIONESFASES.CLICK."+sGXsfl_15_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAccionesfases.getEnabled()!=0)&&(cmbavAccionesfases.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,16);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAccionesfases.setValue( GXutil.trim( GXutil.str( AV73AccionesFases, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesfases.getInternalname(), "Values", cmbavAccionesfases.ToJavascriptSource(), !bGXsfl_15_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFasCod_Columnclass,edtFasCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,edtFasDsc_Columnclass,edtFasDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCon_Internalname,GXutil.rtrim( A152BarFasCon),GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCon_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasEst_Internalname,GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasEst_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFacTin_Internalname,GXutil.rtrim( A150BarFacTin),GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFacTin_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasAcab_Internalname,GXutil.rtrim( A4905BarFasAcab),GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasAcab_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasFor_Internalname,GXutil.rtrim( A4287BarFasFor),GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasFor_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A216BarTieTeo, "Z9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTieTeo_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieRea_Internalname,GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTieRea_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTI_Internalname,localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTI_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTF_Internalname,localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4443BarFasDTF, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTF_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3837BarFasKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasKgm_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3838BarFasMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasMtr_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "FASEEXTERI_" + sGXsfl_15_idx ;
         cmbFaseExteri.setName( GXCCtl );
         cmbFaseExteri.setWebtags( "" );
         cmbFaseExteri.addItem("1", httpContext.getMessage( "Enviada", ""), (short)(0));
         cmbFaseExteri.addItem("2", httpContext.getMessage( "Recepcionada", ""), (short)(0));
         cmbFaseExteri.addItem("0", httpContext.getMessage( "No", ""), (short)(0));
         if ( cmbFaseExteri.getItemCount() > 0 )
         {
            A14262FaseExteri = (byte)(GXutil.lval( cmbFaseExteri.getValidValue(GXutil.trim( GXutil.str( A14262FaseExteri, 1, 0))))) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbFaseExteri,cmbFaseExteri.getInternalname(),GXutil.trim( GXutil.str( A14262FaseExteri, 1, 0)),Integer.valueOf(1),cmbFaseExteri.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbFaseExteri.getColumnClass(),cmbFaseExteri.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbFaseExteri.setValue( GXutil.trim( GXutil.str( A14262FaseExteri, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFaseExteri.getInternalname(), "Values", cmbFaseExteri.ToJavascriptSource(), !bGXsfl_15_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes29B2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_15_idx = ((subGrid_Islastpage==1)&&(nGXsfl_15_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_15_idx+1) ;
         sGXsfl_15_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_15_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_152( ) ;
      }
      /* End function sendrow_152 */
   }

   public void startgridcontrol15( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"15\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teorico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase Exterior", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód. Proc.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV73AccionesFases, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFasDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFasDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A152BarFasCon));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A150BarFacTin));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4905BarFasAcab));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4287BarFasFor));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14262FaseExteri, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbFaseExteri.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbFaseExteri.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      cmbavAccionesfases.setInternalname( sPrefix+"vACCIONESFASES" );
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtFasCod_Internalname = sPrefix+"FASCOD" ;
      edtFasDsc_Internalname = sPrefix+"FASDSC" ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS" ;
      edtBarFasCon_Internalname = sPrefix+"BARFASCON" ;
      edtBarFasEst_Internalname = sPrefix+"BARFASEST" ;
      edtBarFacTin_Internalname = sPrefix+"BARFACTIN" ;
      edtBarFasAcab_Internalname = sPrefix+"BARFASACAB" ;
      edtBarFasFor_Internalname = sPrefix+"BARFASFOR" ;
      edtBarTieTeo_Internalname = sPrefix+"BARTIETEO" ;
      edtBarTieRea_Internalname = sPrefix+"BARTIEREA" ;
      edtBarFasDTI_Internalname = sPrefix+"BARFASDTI" ;
      edtBarFasDTF_Internalname = sPrefix+"BARFASDTF" ;
      edtBarFasKgm_Internalname = sPrefix+"BARFASKGM" ;
      edtBarFasMtr_Internalname = sPrefix+"BARFASMTR" ;
      cmbFaseExteri.setInternalname( sPrefix+"FASEEXTERI" );
      edtProCod_Internalname = sPrefix+"PROCOD" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtProDsc_Internalname = sPrefix+"PRODSC" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      Dvelop_confirmpanel_duplicar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_DUPLICAR" ;
      tblTabledvelop_confirmpanel_duplicar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_DUPLICAR" ;
      Dvelop_confirmpanel_abrir_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ABRIR" ;
      tblTabledvelop_confirmpanel_abrir_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ABRIR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfasdtiauxdate_Internalname = sPrefix+"vDDO_BARFASDTIAUXDATE" ;
      divDdo_barfasdtiauxdates_Internalname = sPrefix+"DDO_BARFASDTIAUXDATES" ;
      edtavDdo_barfasdtfauxdate_Internalname = sPrefix+"vDDO_BARFASDTFAUXDATE" ;
      divDdo_barfasdtfauxdates_Internalname = sPrefix+"DDO_BARFASDTFAUXDATES" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtProCod_Jsonclick = "" ;
      cmbFaseExteri.setJsonclick( "" );
      cmbFaseExteri.setColumnClass( "WWColumn" );
      edtBarFasMtr_Jsonclick = "" ;
      edtBarFasKgm_Jsonclick = "" ;
      edtBarFasDTF_Jsonclick = "" ;
      edtBarFasDTI_Jsonclick = "" ;
      edtBarTieRea_Jsonclick = "" ;
      edtBarTieTeo_Jsonclick = "" ;
      edtBarFasFor_Jsonclick = "" ;
      edtBarFasAcab_Jsonclick = "" ;
      edtBarFacTin_Jsonclick = "" ;
      edtBarFasEst_Jsonclick = "" ;
      edtBarFasCon_Jsonclick = "" ;
      edtMaqCodBis_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Columnclass = "WWColumn" ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Columnclass = "WWColumn" ;
      edtBarOrdLin_Jsonclick = "" ;
      cmbavAccionesfases.setJsonclick( "" );
      cmbavAccionesfases.setVisible( -1 );
      cmbavAccionesfases.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      cmbFaseExteri.setColumnHeaderClass( "" );
      edtFasDsc_Columnheaderclass = "" ;
      edtFasCod_Columnheaderclass = "" ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfasdtfauxdate_Jsonclick = "" ;
      edtavDdo_barfasdtiauxdate_Jsonclick = "" ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;Tiempo;Tiempo;Fecha;Fecha;;;;" ;
      Dvelop_confirmpanel_abrir_Confirmtype = "1" ;
      Dvelop_confirmpanel_abrir_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_abrir_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_abrir_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_abrir_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_abrir_Confirmationtext = "¿Confirmar?" ;
      Dvelop_confirmpanel_abrir_Title = "" ;
      Dvelop_confirmpanel_duplicar_Confirmtype = "1" ;
      Dvelop_confirmpanel_duplicar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_duplicar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_duplicar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_duplicar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_duplicar_Confirmationtext = "¿Desea Duplicar esta fase?" ;
      Dvelop_confirmpanel_duplicar_Title = "" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
      Ddo_grid_Datalistproc = "PedidosClienteSinDetalle.HojadeRuta__Fases_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|Dynamic|Dynamic||||||" ;
      Ddo_grid_Includedatalist = "|T|T|T|T||T|T|T||||||" ;
      Ddo_grid_Filterisrange = "T|||||T||||T|T|||T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Numeric|Character|Character|Character|Numeric|Numeric|Date|Date|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|13|14|15" ;
      Ddo_grid_Columnids = "1:BarOrdLin|2:FasCod|3:FasDsc|4:MaqCodBis|5:BarFasCon|6:BarFasEst|7:BarFacTin|8:BarFasAcab|9:BarFasFor|10:BarTieTeo|11:BarTieRea|12:BarFasDTI|13:BarFasDTF|14:BarFasKgm|15:BarFasMtr" ;
      Ddo_grid_Gridinternalname = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vACCIONESFASES_" + sGXsfl_15_idx ;
      cmbavAccionesfases.setName( GXCCtl );
      cmbavAccionesfases.setWebtags( "" );
      if ( cmbavAccionesfases.getItemCount() > 0 )
      {
      }
      GXCCtl = "FASEEXTERI_" + sGXsfl_15_idx ;
      cmbFaseExteri.setName( GXCCtl );
      cmbFaseExteri.setWebtags( "" );
      cmbFaseExteri.addItem("1", httpContext.getMessage( "Enviada", ""), (short)(0));
      cmbFaseExteri.addItem("2", httpContext.getMessage( "Recepcionada", ""), (short)(0));
      cmbFaseExteri.addItem("0", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbFaseExteri.getItemCount() > 0 )
      {
      }
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public String ajaxOnSessionTimeout( )
   {
      httpContext.setAjaxOnSessionTimeout("Warn");
      return "Warn" ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_3_BARCODREO',pic:'9'},{av:'AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_4_BARCODPAR',pic:''},{av:'AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_5_PROCOD',pic:''},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV56Prodsc',fld:'vPRODSC',pic:''},{av:'AV15TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV16TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV22TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV23TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV24TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV25TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV26TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV27TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV28TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV29TFBarFasAcab',fld:'vTFBARFASACAB',pic:'@!'},{av:'AV30TFBarFasAcab_Sel',fld:'vTFBARFASACAB_SEL',pic:'@!'},{av:'AV31TFBarFasFor',fld:'vTFBARFASFOR',pic:'@!'},{av:'AV32TFBarFasFor_Sel',fld:'vTFBARFASFOR_SEL',pic:'@!'},{av:'AV33TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV34TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV39TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV41TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV42TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV43TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV44TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57BarExt',fld:'vBAREXT',pic:'9'},{av:'AV58Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV60Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV62Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV72barser',fld:'vBARSER',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV70barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV69barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV68Barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV67BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV66Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV65CliNom',fld:'vCLINOM',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV63BarAgrest',fld:'vBARAGREST',pic:'@!'},{av:'AV76UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV77Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV49GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV50GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'cmbFaseExteri'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1129B2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV56Prodsc',fld:'vPRODSC',pic:''},{av:'AV15TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV16TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV22TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV23TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV24TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV25TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV26TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV27TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV28TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV29TFBarFasAcab',fld:'vTFBARFASACAB',pic:'@!'},{av:'AV30TFBarFasAcab_Sel',fld:'vTFBARFASACAB_SEL',pic:'@!'},{av:'AV31TFBarFasFor',fld:'vTFBARFASFOR',pic:'@!'},{av:'AV32TFBarFasFor_Sel',fld:'vTFBARFASFOR_SEL',pic:'@!'},{av:'AV33TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV34TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV39TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV41TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV42TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV43TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV44TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57BarExt',fld:'vBAREXT',pic:'9'},{av:'AV58Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV60Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV62Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV72barser',fld:'vBARSER',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV70barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV69barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV68Barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV67BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV66Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV65CliNom',fld:'vCLINOM',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV63BarAgrest',fld:'vBARAGREST',pic:'@!'},{av:'AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_3_BARCODREO',pic:'9'},{av:'AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_4_BARCODPAR',pic:''},{av:'AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_5_PROCOD',pic:''},{av:'AV76UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV77Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1229B2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV56Prodsc',fld:'vPRODSC',pic:''},{av:'AV15TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV16TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV22TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV23TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV24TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV25TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV26TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV27TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV28TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV29TFBarFasAcab',fld:'vTFBARFASACAB',pic:'@!'},{av:'AV30TFBarFasAcab_Sel',fld:'vTFBARFASACAB_SEL',pic:'@!'},{av:'AV31TFBarFasFor',fld:'vTFBARFASFOR',pic:'@!'},{av:'AV32TFBarFasFor_Sel',fld:'vTFBARFASFOR_SEL',pic:'@!'},{av:'AV33TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV34TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV39TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV41TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV42TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV43TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV44TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57BarExt',fld:'vBAREXT',pic:'9'},{av:'AV58Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV60Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV62Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV72barser',fld:'vBARSER',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV70barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV69barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV68Barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV67BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV66Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV65CliNom',fld:'vCLINOM',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV63BarAgrest',fld:'vBARAGREST',pic:'@!'},{av:'AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_3_BARCODREO',pic:'9'},{av:'AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_4_BARCODPAR',pic:''},{av:'AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_5_PROCOD',pic:''},{av:'AV76UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV77Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1329B2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV56Prodsc',fld:'vPRODSC',pic:''},{av:'AV15TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV16TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV22TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV23TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV24TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV25TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV26TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV27TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV28TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV29TFBarFasAcab',fld:'vTFBARFASACAB',pic:'@!'},{av:'AV30TFBarFasAcab_Sel',fld:'vTFBARFASACAB_SEL',pic:'@!'},{av:'AV31TFBarFasFor',fld:'vTFBARFASFOR',pic:'@!'},{av:'AV32TFBarFasFor_Sel',fld:'vTFBARFASFOR_SEL',pic:'@!'},{av:'AV33TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV34TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV39TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV41TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV42TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV43TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV44TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57BarExt',fld:'vBAREXT',pic:'9'},{av:'AV58Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV60Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV62Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV72barser',fld:'vBARSER',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV70barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV69barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV68Barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV67BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV66Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV65CliNom',fld:'vCLINOM',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV63BarAgrest',fld:'vBARAGREST',pic:'@!'},{av:'AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_3_BARCODREO',pic:'9'},{av:'AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_4_BARCODPAR',pic:''},{av:'AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_5_PROCOD',pic:''},{av:'AV76UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV77Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV43TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV44TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV41TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV42TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV39TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV33TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV34TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV31TFBarFasFor',fld:'vTFBARFASFOR',pic:'@!'},{av:'AV32TFBarFasFor_Sel',fld:'vTFBARFASFOR_SEL',pic:'@!'},{av:'AV29TFBarFasAcab',fld:'vTFBARFASACAB',pic:'@!'},{av:'AV30TFBarFasAcab_Sel',fld:'vTFBARFASACAB_SEL',pic:'@!'},{av:'AV27TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV28TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV25TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV26TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV23TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV24TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV21TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV22TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV15TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV16TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1929B2',iparms:[{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!',hsh:true},{av:'AV57BarExt',fld:'vBAREXT',pic:'9'},{av:'cmbFaseExteri'},{av:'A14262FaseExteri',fld:'FASEEXTERI',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavAccionesfases'},{av:'AV73AccionesFases',fld:'vACCIONESFASES',pic:'ZZZ9'},{av:'edtFasCod_Columnclass',ctrl:'FASCOD',prop:'Columnclass'},{av:'edtFasDsc_Columnclass',ctrl:'FASDSC',prop:'Columnclass'},{av:'cmbFaseExteri'}]}");
      setEventMetadata("VACCIONESFASES.CLICK","{handler:'e2029B2',iparms:[{av:'cmbavAccionesfases'},{av:'AV73AccionesFases',fld:'vACCIONESFASES',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV56Prodsc',fld:'vPRODSC',pic:''},{av:'AV15TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV16TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV22TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV23TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV24TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV25TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV26TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV27TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV28TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV29TFBarFasAcab',fld:'vTFBARFASACAB',pic:'@!'},{av:'AV30TFBarFasAcab_Sel',fld:'vTFBARFASACAB_SEL',pic:'@!'},{av:'AV31TFBarFasFor',fld:'vTFBARFASFOR',pic:'@!'},{av:'AV32TFBarFasFor_Sel',fld:'vTFBARFASFOR_SEL',pic:'@!'},{av:'AV33TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV34TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV39TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV41TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV42TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV43TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV44TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57BarExt',fld:'vBAREXT',pic:'9'},{av:'AV58Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV60Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV62Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV72barser',fld:'vBARSER',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV70barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV69barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV68Barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV67BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV66Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV65CliNom',fld:'vCLINOM',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV63BarAgrest',fld:'vBARAGREST',pic:'@!'},{av:'AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_3_BARCODREO',pic:'9'},{av:'AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_4_BARCODPAR',pic:''},{av:'AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_5_PROCOD',pic:''},{av:'AV76UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV77Station',fld:'vSTATION',pic:'',hsh:true},{av:'sPrefix'},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!',hsh:true},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!',hsh:true}]");
      setEventMetadata("VACCIONESFASES.CLICK",",oparms:[{av:'cmbavAccionesfases'},{av:'AV73AccionesFases',fld:'vACCIONESFASES',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_eliminarlinea_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'ConfirmationText'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_duplicar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_DUPLICAR',prop:'ConfirmationText'},{av:'Dvelop_confirmpanel_abrir_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ABRIR',prop:'ConfirmationText'},{av:'AV49GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV50GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'cmbFaseExteri'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e1429B2',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV56Prodsc',fld:'vPRODSC',pic:''},{av:'AV15TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV16TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV22TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV23TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV24TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV25TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV26TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV27TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV28TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV29TFBarFasAcab',fld:'vTFBARFASACAB',pic:'@!'},{av:'AV30TFBarFasAcab_Sel',fld:'vTFBARFASACAB_SEL',pic:'@!'},{av:'AV31TFBarFasFor',fld:'vTFBARFASFOR',pic:'@!'},{av:'AV32TFBarFasFor_Sel',fld:'vTFBARFASFOR_SEL',pic:'@!'},{av:'AV33TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV34TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV39TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV41TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV42TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV43TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV44TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57BarExt',fld:'vBAREXT',pic:'9'},{av:'AV58Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV60Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV62Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV72barser',fld:'vBARSER',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV70barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV69barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV68Barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV67BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV66Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV65CliNom',fld:'vCLINOM',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV63BarAgrest',fld:'vBARAGREST',pic:'@!'},{av:'AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_3_BARCODREO',pic:'9'},{av:'AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_4_BARCODPAR',pic:''},{av:'AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_5_PROCOD',pic:''},{av:'AV76UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV77Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV50GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'cmbFaseExteri'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DUPLICAR.CLOSE","{handler:'e1529B2',iparms:[{av:'Dvelop_confirmpanel_duplicar_Result',ctrl:'DVELOP_CONFIRMPANEL_DUPLICAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV56Prodsc',fld:'vPRODSC',pic:''},{av:'AV15TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV16TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV22TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV23TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV24TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV25TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV26TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV27TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV28TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV29TFBarFasAcab',fld:'vTFBARFASACAB',pic:'@!'},{av:'AV30TFBarFasAcab_Sel',fld:'vTFBARFASACAB_SEL',pic:'@!'},{av:'AV31TFBarFasFor',fld:'vTFBARFASFOR',pic:'@!'},{av:'AV32TFBarFasFor_Sel',fld:'vTFBARFASFOR_SEL',pic:'@!'},{av:'AV33TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV34TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV39TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV41TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV42TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV43TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV44TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57BarExt',fld:'vBAREXT',pic:'9'},{av:'AV58Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV60Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV62Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV72barser',fld:'vBARSER',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV70barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV69barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV68Barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV67BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV66Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV65CliNom',fld:'vCLINOM',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV63BarAgrest',fld:'vBARAGREST',pic:'@!'},{av:'AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_3_BARCODREO',pic:'9'},{av:'AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_4_BARCODPAR',pic:''},{av:'AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_5_PROCOD',pic:''},{av:'AV76UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV77Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV74Si_rgto',fld:'vSI_RGTO',pic:'9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DUPLICAR.CLOSE",",oparms:[{av:'AV74Si_rgto',fld:'vSI_RGTO',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV56Prodsc',fld:'vPRODSC',pic:''},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV50GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'cmbFaseExteri'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ABRIR.CLOSE","{handler:'e1629B2',iparms:[{av:'Dvelop_confirmpanel_abrir_Result',ctrl:'DVELOP_CONFIRMPANEL_ABRIR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV53BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV54BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV55ProCod',fld:'vPROCOD',pic:''},{av:'AV56Prodsc',fld:'vPRODSC',pic:''},{av:'AV15TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV16TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV17TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV18TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV19TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV20TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV21TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV22TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV23TFBarFasCon',fld:'vTFBARFASCON',pic:'@!'},{av:'AV24TFBarFasCon_Sel',fld:'vTFBARFASCON_SEL',pic:'@!'},{av:'AV25TFBarFasEst',fld:'vTFBARFASEST',pic:'9'},{av:'AV26TFBarFasEst_To',fld:'vTFBARFASEST_TO',pic:'9'},{av:'AV27TFBarFacTin',fld:'vTFBARFACTIN',pic:'@!'},{av:'AV28TFBarFacTin_Sel',fld:'vTFBARFACTIN_SEL',pic:'@!'},{av:'AV29TFBarFasAcab',fld:'vTFBARFASACAB',pic:'@!'},{av:'AV30TFBarFasAcab_Sel',fld:'vTFBARFASACAB_SEL',pic:'@!'},{av:'AV31TFBarFasFor',fld:'vTFBARFASFOR',pic:'@!'},{av:'AV32TFBarFasFor_Sel',fld:'vTFBARFASFOR_SEL',pic:'@!'},{av:'AV33TFBarTieTeo',fld:'vTFBARTIETEO',pic:'Z9.99'},{av:'AV34TFBarTieTeo_To',fld:'vTFBARTIETEO_TO',pic:'Z9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFasDTI',fld:'vTFBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV39TFBarFasDTF',fld:'vTFBARFASDTF',pic:'99/99/99 99:99:99'},{av:'AV41TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV42TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV43TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV44TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57BarExt',fld:'vBAREXT',pic:'9'},{av:'AV58Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV59BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV60Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV61Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV62Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV72barser',fld:'vBARSER',pic:''},{av:'AV71PedidoCliente',fld:'vPEDIDOCLIENTE',pic:''},{av:'AV70barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV69barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV68Barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV67BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV66Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV65CliNom',fld:'vCLINOM',pic:''},{av:'AV64BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV63BarAgrest',fld:'vBARAGREST',pic:'@!'},{av:'AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_3_BARCODREO',pic:'9'},{av:'AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_4_BARCODPAR',pic:''},{av:'AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod',fld:'vPEDIDOSCLIENTESINDETALLE_HOJADERUTA__FASES_WCDS_5_PROCOD',pic:''},{av:'AV76UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV77Station',fld:'vSTATION',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ABRIR.CLOSE",",oparms:[{av:'AV49GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV50GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtFasCod_Columnheaderclass',ctrl:'FASCOD',prop:'Columnheaderclass'},{av:'edtFasDsc_Columnheaderclass',ctrl:'FASDSC',prop:'Columnheaderclass'},{av:'cmbFaseExteri'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
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
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV51EmprCod = "" ;
      wcpOAV54BarCodPar = "" ;
      wcpOAV55ProCod = "" ;
      wcpOAV56Prodsc = "" ;
      wcpOAV61Barunimed = "" ;
      wcpOAV72barser = "" ;
      wcpOAV71PedidoCliente = "" ;
      wcpOAV70barcolnom = "" ;
      wcpOAV67BarKgm = DecimalUtil.ZERO ;
      wcpOAV66Barmtr = DecimalUtil.ZERO ;
      wcpOAV65CliNom = "" ;
      wcpOAV64BarSerDsc = "" ;
      wcpOAV63BarAgrest = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
      Dvelop_confirmpanel_duplicar_Result = "" ;
      Dvelop_confirmpanel_abrir_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV51EmprCod = "" ;
      AV54BarCodPar = "" ;
      AV55ProCod = "" ;
      AV56Prodsc = "" ;
      AV61Barunimed = "" ;
      AV72barser = "" ;
      AV71PedidoCliente = "" ;
      AV70barcolnom = "" ;
      AV67BarKgm = DecimalUtil.ZERO ;
      AV66Barmtr = DecimalUtil.ZERO ;
      AV65CliNom = "" ;
      AV64BarSerDsc = "" ;
      AV63BarAgrest = "" ;
      AV17TFFasCod = "" ;
      AV18TFFasCod_Sel = "" ;
      AV19TFFasDsc = "" ;
      AV20TFFasDsc_Sel = "" ;
      AV21TFMaqCodBis = "" ;
      AV22TFMaqCodBis_Sel = "" ;
      AV23TFBarFasCon = "" ;
      AV24TFBarFasCon_Sel = "" ;
      AV27TFBarFacTin = "" ;
      AV28TFBarFacTin_Sel = "" ;
      AV29TFBarFasAcab = "" ;
      AV30TFBarFasAcab_Sel = "" ;
      AV31TFBarFasFor = "" ;
      AV32TFBarFasFor_Sel = "" ;
      AV33TFBarTieTeo = DecimalUtil.ZERO ;
      AV34TFBarTieTeo_To = DecimalUtil.ZERO ;
      AV35TFBarTieRea = DecimalUtil.ZERO ;
      AV36TFBarTieRea_To = DecimalUtil.ZERO ;
      AV37TFBarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV39TFBarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      AV41TFBarFasKgm = DecimalUtil.ZERO ;
      AV42TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV43TFBarFasMtr = DecimalUtil.ZERO ;
      AV44TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV81Pgmname = "" ;
      AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod = "" ;
      AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar = "" ;
      AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod = "" ;
      AV76UsurCod = "" ;
      AV77Station = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV47DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      A759ProDsc = "" ;
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV38DDO_BarFasDTIAuxDate = GXutil.nullDate() ;
      AV40DDO_BarFasDTFAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      scmdbuf = "" ;
      lV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = "" ;
      lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = "" ;
      lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = "" ;
      lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = "" ;
      lV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = "" ;
      lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = "" ;
      lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = "" ;
      AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel = "" ;
      AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod = "" ;
      AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel = "" ;
      AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc = "" ;
      AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel = "" ;
      AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis = "" ;
      AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel = "" ;
      AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon = "" ;
      AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel = "" ;
      AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin = "" ;
      AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel = "" ;
      AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab = "" ;
      AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel = "" ;
      AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor = "" ;
      AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo = DecimalUtil.ZERO ;
      AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to = DecimalUtil.ZERO ;
      AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea = DecimalUtil.ZERO ;
      AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to = DecimalUtil.ZERO ;
      AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf = GXutil.resetTime( GXutil.nullDate() );
      AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm = DecimalUtil.ZERO ;
      AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr = DecimalUtil.ZERO ;
      AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to = DecimalUtil.ZERO ;
      AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc = "" ;
      H029B2_A759ProDsc = new String[] {""} ;
      H029B2_A758ProCod = new String[] {""} ;
      H029B2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029B2_n3838BarFasMtr = new boolean[] {false} ;
      H029B2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029B2_n3837BarFasKgm = new boolean[] {false} ;
      H029B2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H029B2_n4443BarFasDTF = new boolean[] {false} ;
      H029B2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H029B2_n4442BarFasDTI = new boolean[] {false} ;
      H029B2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029B2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029B2_A4287BarFasFor = new String[] {""} ;
      H029B2_A4905BarFasAcab = new String[] {""} ;
      H029B2_A150BarFacTin = new String[] {""} ;
      H029B2_A153BarFasEst = new byte[1] ;
      H029B2_A152BarFasCon = new String[] {""} ;
      H029B2_A603MaqCodBis = new String[] {""} ;
      H029B2_A460FasDsc = new String[] {""} ;
      H029B2_A194BarOrdLin = new short[1] ;
      H029B2_A457FasCod = new String[] {""} ;
      H029B2_A130BarCodPar = new String[] {""} ;
      H029B2_A132BarCodReo = new byte[1] ;
      H029B2_A129BarCod = new int[1] ;
      H029B2_A396EmprCod = new String[] {""} ;
      H029B3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV75EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      AV116Emprcod_selected = "" ;
      AV119Barcodpar_selected = "" ;
      AV78Inc_obs = "" ;
      GXv_int2 = new short[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      ucDvelop_confirmpanel_duplicar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_abrir = new com.genexus.webpanels.GXUserControl();
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV51EmprCod = "" ;
      sCtrlAV52BarCod = "" ;
      sCtrlAV53BarCodReo = "" ;
      sCtrlAV54BarCodPar = "" ;
      sCtrlAV55ProCod = "" ;
      sCtrlAV56Prodsc = "" ;
      sCtrlAV57BarExt = "" ;
      sCtrlAV58Discod = "" ;
      sCtrlAV59BarSit = "" ;
      sCtrlAV60Clicod = "" ;
      sCtrlAV61Barunimed = "" ;
      sCtrlAV62Barpes = "" ;
      sCtrlAV72barser = "" ;
      sCtrlAV71PedidoCliente = "" ;
      sCtrlAV70barcolnom = "" ;
      sCtrlAV69barcolnum = "" ;
      sCtrlAV68Barpie = "" ;
      sCtrlAV67BarKgm = "" ;
      sCtrlAV66Barmtr = "" ;
      sCtrlAV65CliNom = "" ;
      sCtrlAV64BarSerDsc = "" ;
      sCtrlAV63BarAgrest = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta__fases_wc__default(),
         new Object[] {
             new Object[] {
            H029B2_A759ProDsc, H029B2_A758ProCod, H029B2_A3838BarFasMtr, H029B2_n3838BarFasMtr, H029B2_A3837BarFasKgm, H029B2_n3837BarFasKgm, H029B2_A4443BarFasDTF, H029B2_n4443BarFasDTF, H029B2_A4442BarFasDTI, H029B2_n4442BarFasDTI,
            H029B2_A215BarTieRea, H029B2_A216BarTieTeo, H029B2_A4287BarFasFor, H029B2_A4905BarFasAcab, H029B2_A150BarFacTin, H029B2_A153BarFasEst, H029B2_A152BarFasCon, H029B2_A603MaqCodBis, H029B2_A460FasDsc, H029B2_A194BarOrdLin,
            H029B2_A457FasCod, H029B2_A130BarCodPar, H029B2_A132BarCodReo, H029B2_A129BarCod, H029B2_A396EmprCod
            }
            , new Object[] {
            H029B3_AGRID_nRecordCount
            }
         }
      );
      AV81Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Fases_WC" ;
      /* GeneXus formulas. */
      AV81Pgmname = "PedidosClienteSinDetalle.HojadeRuta__Fases_WC" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV53BarCodReo ;
   private byte wcpOAV57BarExt ;
   private byte wcpOAV59BarSit ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV53BarCodReo ;
   private byte AV57BarExt ;
   private byte AV59BarSit ;
   private byte AV25TFBarFasEst ;
   private byte AV26TFBarFasEst_To ;
   private byte AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ;
   private byte A132BarCodReo ;
   private byte AV74Si_rgto ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A153BarFasEst ;
   private byte A14262FaseExteri ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ;
   private byte AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ;
   private byte AV118Barcodreo_selected ;
   private byte GXv_int11[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV62Barpes ;
   private short AV62Barpes ;
   private short AV15TFBarOrdLin ;
   private short AV16TFBarOrdLin_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV73AccionesFases ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ;
   private short AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ;
   private short GXt_int1 ;
   private short GXv_int2[] ;
   private int wcpOAV52BarCod ;
   private int wcpOAV58Discod ;
   private int wcpOAV60Clicod ;
   private int wcpOAV69barcolnum ;
   private int wcpOAV68Barpie ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_15 ;
   private int AV52BarCod ;
   private int AV58Discod ;
   private int AV60Clicod ;
   private int AV69barcolnum ;
   private int AV68Barpie ;
   private int nGXsfl_15_idx=1 ;
   private int AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int edtProDsc_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV48PageToGo ;
   private int AV117Barcod_selected ;
   private int GXv_int10[] ;
   private int AV120GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV49GridCurrentPage ;
   private long AV50GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV67BarKgm ;
   private java.math.BigDecimal wcpOAV66Barmtr ;
   private java.math.BigDecimal AV67BarKgm ;
   private java.math.BigDecimal AV66Barmtr ;
   private java.math.BigDecimal AV33TFBarTieTeo ;
   private java.math.BigDecimal AV34TFBarTieTeo_To ;
   private java.math.BigDecimal AV35TFBarTieRea ;
   private java.math.BigDecimal AV36TFBarTieRea_To ;
   private java.math.BigDecimal AV41TFBarFasKgm ;
   private java.math.BigDecimal AV42TFBarFasKgm_To ;
   private java.math.BigDecimal AV43TFBarFasMtr ;
   private java.math.BigDecimal AV44TFBarFasMtr_To ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ;
   private java.math.BigDecimal AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ;
   private java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ;
   private java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ;
   private java.math.BigDecimal AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ;
   private java.math.BigDecimal AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ;
   private java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ;
   private java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ;
   private String wcpOAV51EmprCod ;
   private String wcpOAV54BarCodPar ;
   private String wcpOAV55ProCod ;
   private String wcpOAV56Prodsc ;
   private String wcpOAV61Barunimed ;
   private String wcpOAV72barser ;
   private String wcpOAV71PedidoCliente ;
   private String wcpOAV70barcolnom ;
   private String wcpOAV65CliNom ;
   private String wcpOAV64BarSerDsc ;
   private String wcpOAV63BarAgrest ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String Dvelop_confirmpanel_duplicar_Result ;
   private String Dvelop_confirmpanel_abrir_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV51EmprCod ;
   private String AV54BarCodPar ;
   private String AV55ProCod ;
   private String AV56Prodsc ;
   private String AV61Barunimed ;
   private String AV72barser ;
   private String AV71PedidoCliente ;
   private String AV70barcolnom ;
   private String AV65CliNom ;
   private String AV64BarSerDsc ;
   private String AV63BarAgrest ;
   private String sGXsfl_15_idx="0001" ;
   private String AV17TFFasCod ;
   private String AV18TFFasCod_Sel ;
   private String AV19TFFasDsc ;
   private String AV20TFFasDsc_Sel ;
   private String AV21TFMaqCodBis ;
   private String AV22TFMaqCodBis_Sel ;
   private String AV23TFBarFasCon ;
   private String AV24TFBarFasCon_Sel ;
   private String AV27TFBarFacTin ;
   private String AV28TFBarFacTin_Sel ;
   private String AV29TFBarFasAcab ;
   private String AV30TFBarFasAcab_Sel ;
   private String AV31TFBarFasFor ;
   private String AV32TFBarFasFor_Sel ;
   private String AV81Pgmname ;
   private String AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ;
   private String AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ;
   private String AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod ;
   private String AV76UsurCod ;
   private String AV77Station ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_eliminarlinea_Title ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmtype ;
   private String Dvelop_confirmpanel_duplicar_Title ;
   private String Dvelop_confirmpanel_duplicar_Confirmationtext ;
   private String Dvelop_confirmpanel_duplicar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_duplicar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_duplicar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_duplicar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_duplicar_Confirmtype ;
   private String Dvelop_confirmpanel_abrir_Title ;
   private String Dvelop_confirmpanel_abrir_Confirmationtext ;
   private String Dvelop_confirmpanel_abrir_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_abrir_Nobuttoncaption ;
   private String Dvelop_confirmpanel_abrir_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_abrir_Yesbuttonposition ;
   private String Dvelop_confirmpanel_abrir_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfasdtiauxdates_Internalname ;
   private String TempTags ;
   private String edtavDdo_barfasdtiauxdate_Internalname ;
   private String edtavDdo_barfasdtiauxdate_Jsonclick ;
   private String divDdo_barfasdtfauxdates_Internalname ;
   private String edtavDdo_barfasdtfauxdate_Internalname ;
   private String edtavDdo_barfasdtfauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtBarOrdLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Internalname ;
   private String A152BarFasCon ;
   private String edtBarFasCon_Internalname ;
   private String edtBarFasEst_Internalname ;
   private String A150BarFacTin ;
   private String edtBarFacTin_Internalname ;
   private String A4905BarFasAcab ;
   private String edtBarFasAcab_Internalname ;
   private String A4287BarFasFor ;
   private String edtBarFasFor_Internalname ;
   private String edtBarTieTeo_Internalname ;
   private String edtBarTieRea_Internalname ;
   private String edtBarFasDTI_Internalname ;
   private String edtBarFasDTF_Internalname ;
   private String edtBarFasKgm_Internalname ;
   private String edtBarFasMtr_Internalname ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String scmdbuf ;
   private String lV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ;
   private String lV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ;
   private String lV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ;
   private String lV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ;
   private String lV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ;
   private String lV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ;
   private String lV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ;
   private String AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ;
   private String AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ;
   private String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ;
   private String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ;
   private String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ;
   private String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ;
   private String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ;
   private String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ;
   private String AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ;
   private String AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ;
   private String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ;
   private String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ;
   private String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ;
   private String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ;
   private String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ;
   private String hsh ;
   private String AV75EmprNom ;
   private String edtFasCod_Columnheaderclass ;
   private String edtFasDsc_Columnheaderclass ;
   private String edtFasCod_Columnclass ;
   private String edtFasDsc_Columnclass ;
   private String Dvelop_confirmpanel_eliminarlinea_Internalname ;
   private String AV116Emprcod_selected ;
   private String AV119Barcodpar_selected ;
   private String Dvelop_confirmpanel_duplicar_Internalname ;
   private String Dvelop_confirmpanel_abrir_Internalname ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char6[] ;
   private String GXt_char12 ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_abrir_Internalname ;
   private String tblTabledvelop_confirmpanel_duplicar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminarlinea_Internalname ;
   private String sCtrlAV51EmprCod ;
   private String sCtrlAV52BarCod ;
   private String sCtrlAV53BarCodReo ;
   private String sCtrlAV54BarCodPar ;
   private String sCtrlAV55ProCod ;
   private String sCtrlAV56Prodsc ;
   private String sCtrlAV57BarExt ;
   private String sCtrlAV58Discod ;
   private String sCtrlAV59BarSit ;
   private String sCtrlAV60Clicod ;
   private String sCtrlAV61Barunimed ;
   private String sCtrlAV62Barpes ;
   private String sCtrlAV72barser ;
   private String sCtrlAV71PedidoCliente ;
   private String sCtrlAV70barcolnom ;
   private String sCtrlAV69barcolnum ;
   private String sCtrlAV68Barpie ;
   private String sCtrlAV67BarKgm ;
   private String sCtrlAV66Barmtr ;
   private String sCtrlAV65CliNom ;
   private String sCtrlAV64BarSerDsc ;
   private String sCtrlAV63BarAgrest ;
   private String sGXsfl_15_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtBarFasCon_Jsonclick ;
   private String edtBarFasEst_Jsonclick ;
   private String edtBarFacTin_Jsonclick ;
   private String edtBarFasAcab_Jsonclick ;
   private String edtBarFasFor_Jsonclick ;
   private String edtBarTieTeo_Jsonclick ;
   private String edtBarTieRea_Jsonclick ;
   private String edtBarFasDTI_Jsonclick ;
   private String edtBarFasDTF_Jsonclick ;
   private String edtBarFasKgm_Jsonclick ;
   private String edtBarFasMtr_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV37TFBarFasDTI ;
   private java.util.Date AV39TFBarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ;
   private java.util.Date AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ;
   private java.util.Date AV38DDO_BarFasDTIAuxDate ;
   private java.util.Date AV40DDO_BarFasDTFAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean bGXsfl_15_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV78Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_duplicar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_abrir ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAccionesfases ;
   private HTMLChoice cmbFaseExteri ;
   private IDataStoreProvider pr_default ;
   private String[] H029B2_A759ProDsc ;
   private String[] H029B2_A758ProCod ;
   private java.math.BigDecimal[] H029B2_A3838BarFasMtr ;
   private boolean[] H029B2_n3838BarFasMtr ;
   private java.math.BigDecimal[] H029B2_A3837BarFasKgm ;
   private boolean[] H029B2_n3837BarFasKgm ;
   private java.util.Date[] H029B2_A4443BarFasDTF ;
   private boolean[] H029B2_n4443BarFasDTF ;
   private java.util.Date[] H029B2_A4442BarFasDTI ;
   private boolean[] H029B2_n4442BarFasDTI ;
   private java.math.BigDecimal[] H029B2_A215BarTieRea ;
   private java.math.BigDecimal[] H029B2_A216BarTieTeo ;
   private String[] H029B2_A4287BarFasFor ;
   private String[] H029B2_A4905BarFasAcab ;
   private String[] H029B2_A150BarFacTin ;
   private byte[] H029B2_A153BarFasEst ;
   private String[] H029B2_A152BarFasCon ;
   private String[] H029B2_A603MaqCodBis ;
   private String[] H029B2_A460FasDsc ;
   private short[] H029B2_A194BarOrdLin ;
   private String[] H029B2_A457FasCod ;
   private String[] H029B2_A130BarCodPar ;
   private byte[] H029B2_A132BarCodReo ;
   private int[] H029B2_A129BarCod ;
   private String[] H029B2_A396EmprCod ;
   private long[] H029B3_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV47DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class hojaderuta__fases_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H029B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ,
                                          short AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ,
                                          String AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                          String AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                          String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                          String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                          String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                          String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                          String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                          String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                          byte AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ,
                                          byte AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ,
                                          String AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                          String AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                          String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                          String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                          String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                          String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                          java.math.BigDecimal AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                          java.math.BigDecimal AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                          java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                          java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                          java.util.Date AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                          java.util.Date AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                          java.math.BigDecimal AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                          java.math.BigDecimal AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                          java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          String A4905BarFasAcab ,
                                          String A4287BarFasFor ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A759ProDsc ,
                                          String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                          String A396EmprCod ,
                                          String AV51EmprCod ,
                                          int A129BarCod ,
                                          int AV52BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV53BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV54BarCodPar ,
                                          String A758ProCod ,
                                          String AV55ProCod ,
                                          String AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                          int AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ,
                                          byte AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ,
                                          String AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                          String AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[44];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T3.ProDsc, T1.ProCod, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasDTF, T1.BarFasDTI, T1.BarTieRea, T1.BarTieTeo, T1.BarFasFor, T1.BarFasAcab, T1.BarFacTin, T1.BarFasEst," ;
      sSelectString += " T1.BarFasCon, T1.MaqCodBis, T2.FasDsc, T1.BarOrdLin, T1.FasCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod" ;
      sFromString = " FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod" ;
      sFromString += " = T1.ProCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ?)");
      addWhere(sWhereString, "(T3.ProDsc = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (0==AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (0==AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasAcab = ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasFor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasFor = ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarOrdLin" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.FasCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T2.FasDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T2.FasDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.MaqCodBis" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarFasCon" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarFasCon DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarFasEst" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarFasEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarFacTin" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarFacTin DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarFasAcab" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarFasAcab DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarFasFor" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarFasFor DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarTieTeo" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarTieTeo DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarTieRea" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarFasDTI" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarFasDTI DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarFasDTF" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarFasDTF DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarFasKgm" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarFasKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T3.ProDsc, T1.BarFasMtr" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ProCod DESC, T3.ProDsc DESC, T1.BarFasMtr DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H029B3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin ,
                                          short AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to ,
                                          String AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel ,
                                          String AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod ,
                                          String AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel ,
                                          String AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc ,
                                          String AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel ,
                                          String AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis ,
                                          String AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel ,
                                          String AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon ,
                                          byte AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest ,
                                          byte AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to ,
                                          String AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel ,
                                          String AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin ,
                                          String AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel ,
                                          String AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab ,
                                          String AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel ,
                                          String AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor ,
                                          java.math.BigDecimal AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo ,
                                          java.math.BigDecimal AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to ,
                                          java.math.BigDecimal AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea ,
                                          java.math.BigDecimal AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to ,
                                          java.util.Date AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti ,
                                          java.util.Date AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf ,
                                          java.math.BigDecimal AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm ,
                                          java.math.BigDecimal AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr ,
                                          java.math.BigDecimal AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A152BarFasCon ,
                                          byte A153BarFasEst ,
                                          String A150BarFacTin ,
                                          String A4905BarFasAcab ,
                                          String A4287BarFasFor ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A4442BarFasDTI ,
                                          java.util.Date A4443BarFasDTF ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A759ProDsc ,
                                          String AV87Pedidosclientesindetalle_hojaderuta__fases_wcds_6_prodsc ,
                                          String A396EmprCod ,
                                          String AV51EmprCod ,
                                          int A129BarCod ,
                                          int AV52BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV53BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV54BarCodPar ,
                                          String A758ProCod ,
                                          String AV55ProCod ,
                                          String AV82Pedidosclientesindetalle_hojaderuta__fases_wcds_1_emprcod ,
                                          int AV83Pedidosclientesindetalle_hojaderuta__fases_wcds_2_barcod ,
                                          byte AV84Pedidosclientesindetalle_hojaderuta__fases_wcds_3_barcodreo ,
                                          String AV85Pedidosclientesindetalle_hojaderuta__fases_wcds_4_barcodpar ,
                                          String AV86Pedidosclientesindetalle_hojaderuta__fases_wcds_5_procod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[39];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ?)");
      addWhere(sWhereString, "(T3.ProDsc = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV88Pedidosclientesindetalle_hojaderuta__fases_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV89Pedidosclientesindetalle_hojaderuta__fases_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV90Pedidosclientesindetalle_hojaderuta__fases_wcds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Pedidosclientesindetalle_hojaderuta__fases_wcds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidosclientesindetalle_hojaderuta__fases_wcds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidosclientesindetalle_hojaderuta__fases_wcds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidosclientesindetalle_hojaderuta__fases_wcds_13_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidosclientesindetalle_hojaderuta__fases_wcds_14_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) && ( ! (GXutil.strcmp("", AV96Pedidosclientesindetalle_hojaderuta__fases_wcds_15_tfbarfascon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Pedidosclientesindetalle_hojaderuta__fases_wcds_16_tfbarfascon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasCon = ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (0==AV98Pedidosclientesindetalle_hojaderuta__fases_wcds_17_tfbarfasest) )
      {
         addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (0==AV99Pedidosclientesindetalle_hojaderuta__fases_wcds_18_tfbarfasest_to) )
      {
         addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidosclientesindetalle_hojaderuta__fases_wcds_19_tfbarfactin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFacTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidosclientesindetalle_hojaderuta__fases_wcds_20_tfbarfactin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFacTin = ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidosclientesindetalle_hojaderuta__fases_wcds_21_tfbarfasacab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasAcab) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidosclientesindetalle_hojaderuta__fases_wcds_22_tfbarfasacab_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasAcab = ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidosclientesindetalle_hojaderuta__fases_wcds_23_tfbarfasfor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarFasFor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_hojaderuta__fases_wcds_24_tfbarfasfor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasFor = ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Pedidosclientesindetalle_hojaderuta__fases_wcds_25_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Pedidosclientesindetalle_hojaderuta__fases_wcds_26_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Pedidosclientesindetalle_hojaderuta__fases_wcds_27_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Pedidosclientesindetalle_hojaderuta__fases_wcds_28_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV110Pedidosclientesindetalle_hojaderuta__fases_wcds_29_tfbarfasdti) )
      {
         addWhere(sWhereString, "(T1.BarFasDTI >= ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV111Pedidosclientesindetalle_hojaderuta__fases_wcds_30_tfbarfasdtf) )
      {
         addWhere(sWhereString, "(T1.BarFasDTF >= ?)");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidosclientesindetalle_hojaderuta__fases_wcds_31_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidosclientesindetalle_hojaderuta__fases_wcds_32_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidosclientesindetalle_hojaderuta__fases_wcds_33_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Pedidosclientesindetalle_hojaderuta__fases_wcds_34_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_H029B2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).byteValue() , (String)dynConstraints[60] , (String)dynConstraints[61] );
            case 1 :
                  return conditional_H029B3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).byteValue() , (String)dynConstraints[60] , (String)dynConstraints[61] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029B3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((String[]) buf[13])[0] = rslt.getString(10, 1);
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 1);
               ((String[]) buf[17])[0] = rslt.getString(14, 6);
               ((String[]) buf[18])[0] = rslt.getString(15, 28);
               ((short[]) buf[19])[0] = rslt.getShort(16);
               ((String[]) buf[20])[0] = rslt.getString(17, 8);
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(19);
               ((int[]) buf[23])[0] = rslt.getInt(20);
               ((String[]) buf[24])[0] = rslt.getString(21, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[77], false);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[78], false);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[72], false);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[73], false);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               return;
      }
   }

}

