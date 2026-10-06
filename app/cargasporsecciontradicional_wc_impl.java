package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cargasporsecciontradicional_wc_impl extends GXWebComponent
{
   public cargasporsecciontradicional_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cargasporsecciontradicional_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasporsecciontradicional_wc_impl.class ));
   }

   public cargasporsecciontradicional_wc_impl( int remoteHandle ,
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
      cmbBarFasEst = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV94MaqcodInout = httpContext.GetPar( "MaqcodInout") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94MaqcodInout", AV94MaqcodInout);
               AV93TipoControl = httpContext.GetPar( "TipoControl") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TipoControl", AV93TipoControl);
               AV95FasesToJson = httpContext.GetPar( "FasesToJson") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95FasesToJson", AV95FasesToJson);
               AV6Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
               AV7Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
               AV8Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Barcodpar", AV8Barcodpar);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV94MaqcodInout,AV93TipoControl,AV95FasesToJson,Integer.valueOf(AV6Barcod),Byte.valueOf(AV7Barcodreo),AV8Barcodpar});
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
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
      nRC_GXsfl_36 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_36"))) ;
      nGXsfl_36_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_36_idx"))) ;
      sGXsfl_36_idx = httpContext.GetPar( "sGXsfl_36_idx") ;
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV94MaqcodInout = httpContext.GetPar( "MaqcodInout") ;
      AV6Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV7Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV8Barcodpar = httpContext.GetPar( "Barcodpar") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV96FasesColeccion);
      AV29ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24ColumnsSelector);
      AV19FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV30TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV31TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV32TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV36TFPedidoCliente = httpContext.GetPar( "TFPedidoCliente") ;
      AV37TFPedidoCliente_Sel = httpContext.GetPar( "TFPedidoCliente_Sel") ;
      AV38TFBarFecFpr = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecFpr")) ;
      AV42TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV46TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV47TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV48TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV49TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV50TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV51TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV52TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV53TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV54TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV55TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV56TFBarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol"))) ;
      AV57TFBarTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCol_To"))) ;
      AV58TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV59TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV60TFMaqCodBis = httpContext.GetPar( "TFMaqCodBis") ;
      AV61TFMaqCodBis_Sel = httpContext.GetPar( "TFMaqCodBis_Sel") ;
      AV62TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV63TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV64TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV65TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV67TFBarFasEst_Sels);
      AV68TFBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr"), ".") ;
      AV69TFBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr_To"), ".") ;
      AV70TFBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm"), ".") ;
      AV71TFBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm_To"), ".") ;
      AV72TFBarPie = (int)(GXutil.lval( httpContext.GetPar( "TFBarPie"))) ;
      AV73TFBarPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarPie_To"))) ;
      AV74TFBarFasCod = httpContext.GetPar( "TFBarFasCod") ;
      AV75TFBarFasCod_Sel = httpContext.GetPar( "TFBarFasCod_Sel") ;
      AV76TFBarFecCum = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCum")) ;
      AV80TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV81TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV148Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV17OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV93TipoControl = httpContext.GetPar( "TipoControl") ;
      AV95FasesToJson = httpContext.GetPar( "FasesToJson") ;
      AV100FlagAnt = (short)(GXutil.lval( httpContext.GetPar( "FlagAnt"))) ;
      AV101Linea = (short)(GXutil.lval( httpContext.GetPar( "Linea"))) ;
      AV102EstS = (short)(GXutil.lval( httpContext.GetPar( "EstS"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV94MaqcodInout, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV96FasesColeccion, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFBarFecCli, AV36TFPedidoCliente, AV37TFPedidoCliente_Sel, AV38TFBarFecFpr, AV42TFBarFecGen, AV46TFBarNHdr, AV47TFBarNHdr_Sel, AV48TFBarSer, AV49TFBarSer_Sel, AV50TFBarSerDsc, AV51TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV54TFBarColNum, AV55TFBarColNum_To, AV56TFBarTipCol, AV57TFBarTipCol_To, AV58TFBarOrdLin, AV59TFBarOrdLin_To, AV60TFMaqCodBis, AV61TFMaqCodBis_Sel, AV62TFFasCod, AV63TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFBarFasEst_Sels, AV68TFBarMtr, AV69TFBarMtr_To, AV70TFBarKgm, AV71TFBarKgm_To, AV72TFBarPie, AV73TFBarPie_To, AV74TFBarFasCod, AV75TFBarFasCod_Sel, AV76TFBarFecCum, AV80TFBarSit, AV81TFBarSit_To, AV148Pgmname, AV16OrderedBy, AV17OrderedDsc, AV93TipoControl, AV95FasesToJson, AV100FlagAnt, AV101Linea, AV102EstS, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1FB2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Tabla BARFAS", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.cargasporsecciontradicional_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV94MaqcodInout)),GXutil.URLEncode(GXutil.rtrim(AV93TipoControl)),GXutil.URLEncode(GXutil.rtrim(AV95FasesToJson)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Barcodpar))}, new String[] {"Emprcod","MaqcodInout","TipoControl","FasesToJson","Barcod","Barcodreo","Barcodpar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV148Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100FlagAnt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLINEA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV101Linea), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vESTS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV102EstS), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_36, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV82DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV82DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV94MaqcodInout", GXutil.rtrim( wcpOAV94MaqcodInout));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV93TipoControl", GXutil.rtrim( wcpOAV93TipoControl));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV95FasesToJson", wcpOAV95FasesToJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV6Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV7Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Barcodpar", GXutil.rtrim( wcpOAV8Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV29ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV30TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV31TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCLI", localUtil.dtoc( AV32TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE", GXutil.rtrim( AV36TFPedidoCliente));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDIDOCLIENTE_SEL", GXutil.rtrim( AV37TFPedidoCliente_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECFPR", localUtil.dtoc( AV38TFBarFecFpr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECGEN", localUtil.dtoc( AV42TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV46TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV47TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV48TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV49TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV50TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV51TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV52TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV53TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV54TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV55TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL", GXutil.ltrim( localUtil.ntoc( AV56TFBarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV57TFBarTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV58TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV59TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS", GXutil.rtrim( AV60TFMaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCODBIS_SEL", GXutil.rtrim( AV61TFMaqCodBis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD", GXutil.rtrim( AV62TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD_SEL", GXutil.rtrim( AV63TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC", GXutil.rtrim( AV64TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC_SEL", GXutil.rtrim( AV65TFFasDsc_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFBARFASEST_SELS", AV67TFBarFasEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFBARFASEST_SELS", AV67TFBarFasEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV68TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV69TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV70TFBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV71TFBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIE", GXutil.ltrim( localUtil.ntoc( AV72TFBarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPIE_TO", GXutil.ltrim( localUtil.ntoc( AV73TFBarPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD", GXutil.rtrim( AV74TFBarFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD_SEL", GXutil.rtrim( AV75TFBarFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCUM", localUtil.dtoc( AV76TFBarFecCum, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV80TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV81TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV148Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV148Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV16OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV17OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINOUT", GXutil.rtrim( AV94MaqcodInout));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPOCONTROL", GXutil.rtrim( AV93TipoControl));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASESTOJSON", AV95FasesToJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV8Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGANT", GXutil.ltrim( localUtil.ntoc( AV100FlagAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100FlagAnt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLINEA", GXutil.ltrim( localUtil.ntoc( AV101Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLINEA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV101Linea), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vESTS", GXutil.ltrim( localUtil.ntoc( AV102EstS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vESTS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV102EstS), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV14GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASEST_SELSJSON", AV66TFBarFasEst_SelsJson);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFASESCOLECCION", AV96FasesColeccion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFASESCOLECCION", AV96FasesColeccion);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
   }

   public void renderHtmlCloseForm1FB2( )
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
      return "CargasporSeccionTradicional_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla BARFAS", "") ;
   }

   public void wb1FB0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.cargasporsecciontradicional_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnexportar_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CargasporSeccionTradicional_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CargasporSeccionTradicional_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_1FB2( true) ;
      }
      else
      {
         wb_table1_21_1FB2( false) ;
      }
      return  ;
   }

   public void wb_table1_21_1FB2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol36( ) ;
      }
      if ( wbEnd == 36 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_36 = (int)(nGXsfl_36_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV82DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV82DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV24ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV34DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV34DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,67);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccionTradicional_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccionTradicional_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecfprauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecfprauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecfprauxdate_Internalname, localUtil.format(AV40DDO_BarFecFprAuxDate, "99/99/99"), localUtil.format( AV40DDO_BarFecFprAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,69);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecfprauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccionTradicional_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecfprauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccionTradicional_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV44DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV44DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccionTradicional_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccionTradicional_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccumauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccumauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccumauxdate_Internalname, localUtil.format(AV78DDO_BarFecCumAuxDate, "99/99/99"), localUtil.format( AV78DDO_BarFecCumAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccumauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CargasporSeccionTradicional_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccumauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CargasporSeccionTradicional_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 36 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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

   public void start1FB2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla BARFAS", ""), (short)(0)) ;
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
            strup1FB0( ) ;
         }
      }
   }

   public void ws1FB2( )
   {
      start1FB2( ) ;
      evt1FB2( ) ;
   }

   public void evt1FB2( )
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
                              strup1FB0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111FB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121FB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131FB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportar' */
                                 e141FB2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FB0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FB0( ) ;
                           }
                           AV108Cargasporsecciontradicional_wcds_1_filterfulltext = AV19FilterFullText ;
                           AV109Cargasporsecciontradicional_wcds_2_tfclinom = AV30TFCliNom ;
                           AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV31TFCliNom_Sel ;
                           AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV32TFBarFecCli ;
                           AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV36TFPedidoCliente ;
                           AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV37TFPedidoCliente_Sel ;
                           AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV38TFBarFecFpr ;
                           AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV42TFBarFecGen ;
                           AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV46TFBarNHdr ;
                           AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV47TFBarNHdr_Sel ;
                           AV118Cargasporsecciontradicional_wcds_11_tfbarser = AV48TFBarSer ;
                           AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV49TFBarSer_Sel ;
                           AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV50TFBarSerDsc ;
                           AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
                           AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV52TFBarColNom ;
                           AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
                           AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV54TFBarColNum ;
                           AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV55TFBarColNum_To ;
                           AV126Cargasporsecciontradicional_wcds_19_tfbartipcol = AV56TFBarTipCol ;
                           AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV57TFBarTipCol_To ;
                           AV128Cargasporsecciontradicional_wcds_21_tfbarordlin = AV58TFBarOrdLin ;
                           AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV59TFBarOrdLin_To ;
                           AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV60TFMaqCodBis ;
                           AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV61TFMaqCodBis_Sel ;
                           AV132Cargasporsecciontradicional_wcds_25_tffascod = AV62TFFasCod ;
                           AV133Cargasporsecciontradicional_wcds_26_tffascod_sel = AV63TFFasCod_Sel ;
                           AV134Cargasporsecciontradicional_wcds_27_tffasdsc = AV64TFFasDsc ;
                           AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV65TFFasDsc_Sel ;
                           AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV67TFBarFasEst_Sels ;
                           AV137Cargasporsecciontradicional_wcds_30_tfbarmtr = AV68TFBarMtr ;
                           AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV69TFBarMtr_To ;
                           AV139Cargasporsecciontradicional_wcds_32_tfbarkgm = AV70TFBarKgm ;
                           AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV71TFBarKgm_To ;
                           AV141Cargasporsecciontradicional_wcds_34_tfbarpie = AV72TFBarPie ;
                           AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV73TFBarPie_To ;
                           AV143Cargasporsecciontradicional_wcds_36_tfbarfascod = AV74TFBarFasCod ;
                           AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV75TFBarFasCod_Sel ;
                           AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV76TFBarFecCum ;
                           AV146Cargasporsecciontradicional_wcds_39_tfbarsit = AV80TFBarSit ;
                           AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV81TFBarSit_To ;
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FB0( ) ;
                           }
                           nGXsfl_36_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_362( ) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
                           A158BarFecFpr = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecFpr_Internalname), 0)) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           cmbBarFasEst.setName( cmbBarFasEst.getInternalname() );
                           cmbBarFasEst.setValue( httpContext.cgiGet( cmbBarFasEst.getInternalname()) );
                           A153BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarFasEst.getInternalname()))) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
                           n151BarFasCod = false ;
                           A156BarFecCum = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCum_Internalname), 0)) ;
                           n156BarFecCum = false ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e151FB2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e161FB2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e171FB2 ();
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
                                    strup1FB0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
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

   public void we1FB2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1FB2( ) ;
         }
      }
   }

   public void pa1FB2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
      subsflControlProps_362( ) ;
      while ( nGXsfl_36_idx <= nRC_GXsfl_36 )
      {
         sendrow_362( ) ;
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 String AV94MaqcodInout ,
                                 int AV6Barcod ,
                                 byte AV7Barcodreo ,
                                 String AV8Barcodpar ,
                                 GXSimpleCollection<String> AV96FasesColeccion ,
                                 byte AV29ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ,
                                 String AV19FilterFullText ,
                                 String AV30TFCliNom ,
                                 String AV31TFCliNom_Sel ,
                                 java.util.Date AV32TFBarFecCli ,
                                 String AV36TFPedidoCliente ,
                                 String AV37TFPedidoCliente_Sel ,
                                 java.util.Date AV38TFBarFecFpr ,
                                 java.util.Date AV42TFBarFecGen ,
                                 String AV46TFBarNHdr ,
                                 String AV47TFBarNHdr_Sel ,
                                 String AV48TFBarSer ,
                                 String AV49TFBarSer_Sel ,
                                 String AV50TFBarSerDsc ,
                                 String AV51TFBarSerDsc_Sel ,
                                 String AV52TFBarColNom ,
                                 String AV53TFBarColNom_Sel ,
                                 int AV54TFBarColNum ,
                                 int AV55TFBarColNum_To ,
                                 byte AV56TFBarTipCol ,
                                 byte AV57TFBarTipCol_To ,
                                 short AV58TFBarOrdLin ,
                                 short AV59TFBarOrdLin_To ,
                                 String AV60TFMaqCodBis ,
                                 String AV61TFMaqCodBis_Sel ,
                                 String AV62TFFasCod ,
                                 String AV63TFFasCod_Sel ,
                                 String AV64TFFasDsc ,
                                 String AV65TFFasDsc_Sel ,
                                 GXSimpleCollection<Byte> AV67TFBarFasEst_Sels ,
                                 java.math.BigDecimal AV68TFBarMtr ,
                                 java.math.BigDecimal AV69TFBarMtr_To ,
                                 java.math.BigDecimal AV70TFBarKgm ,
                                 java.math.BigDecimal AV71TFBarKgm_To ,
                                 int AV72TFBarPie ,
                                 int AV73TFBarPie_To ,
                                 String AV74TFBarFasCod ,
                                 String AV75TFBarFasCod_Sel ,
                                 java.util.Date AV76TFBarFecCum ,
                                 byte AV80TFBarSit ,
                                 byte AV81TFBarSit_To ,
                                 String AV148Pgmname ,
                                 short AV16OrderedBy ,
                                 boolean AV17OrderedDsc ,
                                 String AV93TipoControl ,
                                 String AV95FasesToJson ,
                                 short AV100FlagAnt ,
                                 short AV101Linea ,
                                 short AV102EstS ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161FB2 ();
      GRID_nCurrentRecord = 0 ;
      rf1FB2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1FB2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV148Pgmname = "CargasporSeccionTradicional_WC" ;
      Gx_err = (short)(0) ;
   }

   public void rf1FB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(36) ;
      /* Execute user event: Refresh */
      e161FB2 ();
      nGXsfl_36_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_362( ) ;
      bGXsfl_36_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_362( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A457FasCod ,
                                              AV96FasesColeccion ,
                                              Byte.valueOf(A153BarFasEst) ,
                                              AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                              AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                              AV109Cargasporsecciontradicional_wcds_2_tfclinom ,
                                              AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                              AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                              AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                              AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                              AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                              AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                              AV118Cargasporsecciontradicional_wcds_11_tfbarser ,
                                              AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                              AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                              AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                              AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                              Integer.valueOf(AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum) ,
                                              Integer.valueOf(AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) ,
                                              Byte.valueOf(AV126Cargasporsecciontradicional_wcds_19_tfbartipcol) ,
                                              Byte.valueOf(AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to) ,
                                              Short.valueOf(AV128Cargasporsecciontradicional_wcds_21_tfbarordlin) ,
                                              Short.valueOf(AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to) ,
                                              AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                              AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                              AV133Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                              AV132Cargasporsecciontradicional_wcds_25_tffascod ,
                                              AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                              AV134Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                              Integer.valueOf(AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels.size()) ,
                                              AV137Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                              AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                              AV139Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                              AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                              Byte.valueOf(AV146Cargasporsecciontradicional_wcds_39_tfbarsit) ,
                                              Byte.valueOf(AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to) ,
                                              A279CliNom ,
                                              A155BarFecCli ,
                                              A158BarFecFpr ,
                                              A159BarFecGen ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              Byte.valueOf(A218BarTipCol) ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A603MaqCodBis ,
                                              A460FasDsc ,
                                              A184BarMtr ,
                                              A166BarKgm ,
                                              Byte.valueOf(A213BarSit) ,
                                              Short.valueOf(AV16OrderedBy) ,
                                              Boolean.valueOf(AV17OrderedDsc) ,
                                              AV108Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                              A13878PedidoClie ,
                                              A13696BarNHdr ,
                                              Integer.valueOf(A198BarPie) ,
                                              A151BarFasCod ,
                                              AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                              AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                              Integer.valueOf(AV141Cargasporsecciontradicional_wcds_34_tfbarpie) ,
                                              Integer.valueOf(AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to) ,
                                              AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                              AV143Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                              AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                              A156BarFecCum ,
                                              AV94MaqcodInout ,
                                              Integer.valueOf(AV96FasesColeccion.size()) ,
                                              Integer.valueOf(AV6Barcod) ,
                                              Byte.valueOf(AV7Barcodreo) ,
                                              AV8Barcodpar ,
                                              AV5Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV143Cargasporsecciontradicional_wcds_36_tfbarfascod = GXutil.padr( GXutil.rtrim( AV143Cargasporsecciontradicional_wcds_36_tfbarfascod), 8, "%") ;
         lV94MaqcodInout = GXutil.padr( GXutil.rtrim( AV94MaqcodInout), 6, "%") ;
         lV109Cargasporsecciontradicional_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV109Cargasporsecciontradicional_wcds_2_tfclinom), 30, "%") ;
         lV116Cargasporsecciontradicional_wcds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr), 11, "%") ;
         lV118Cargasporsecciontradicional_wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV118Cargasporsecciontradicional_wcds_11_tfbarser), 16, "%") ;
         lV120Cargasporsecciontradicional_wcds_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc), 26, "%") ;
         lV122Cargasporsecciontradicional_wcds_15_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom), 13, "%") ;
         lV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis), 6, "%") ;
         lV132Cargasporsecciontradicional_wcds_25_tffascod = GXutil.padr( GXutil.rtrim( AV132Cargasporsecciontradicional_wcds_25_tffascod), 8, "%") ;
         lV134Cargasporsecciontradicional_wcds_27_tffasdsc = GXutil.padr( GXutil.rtrim( AV134Cargasporsecciontradicional_wcds_27_tffasdsc), 28, "%") ;
         /* Using cursor H01FB9 */
         pr_default.execute(0, new Object[] {AV5Emprcod, AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV143Cargasporsecciontradicional_wcds_36_tfbarfascod, lV143Cargasporsecciontradicional_wcds_36_tfbarfascod, AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel, AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum, AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum, lV94MaqcodInout, Integer.valueOf(AV96FasesColeccion.size()), Integer.valueOf(AV6Barcod), Integer.valueOf(AV6Barcod), Byte.valueOf(AV7Barcodreo), Byte.valueOf(AV7Barcodreo), AV8Barcodpar, AV8Barcodpar, lV109Cargasporsecciontradicional_wcds_2_tfclinom, AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel, AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli, AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr, AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen, lV116Cargasporsecciontradicional_wcds_9_tfbarnhdr, AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel, lV118Cargasporsecciontradicional_wcds_11_tfbarser, AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel, lV120Cargasporsecciontradicional_wcds_13_tfbarserdsc, AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel, lV122Cargasporsecciontradicional_wcds_15_tfbarcolnom, AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel, Integer.valueOf(AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum), Integer.valueOf(AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to), Byte.valueOf(AV126Cargasporsecciontradicional_wcds_19_tfbartipcol), Byte.valueOf(AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to), Short.valueOf(AV128Cargasporsecciontradicional_wcds_21_tfbarordlin), Short.valueOf(AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to), lV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis, AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel, lV132Cargasporsecciontradicional_wcds_25_tffascod, AV133Cargasporsecciontradicional_wcds_26_tffascod_sel, lV134Cargasporsecciontradicional_wcds_27_tffasdsc, AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel, AV137Cargasporsecciontradicional_wcds_30_tfbarmtr, AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to, AV139Cargasporsecciontradicional_wcds_32_tfbarkgm, AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to, Byte.valueOf(AV146Cargasporsecciontradicional_wcds_39_tfbarsit), Byte.valueOf(AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to)});
         nGXsfl_36_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A252CliCod = H01FB9_A252CliCod[0] ;
            n252CliCod = H01FB9_n252CliCod[0] ;
            A213BarSit = H01FB9_A213BarSit[0] ;
            A153BarFasEst = H01FB9_A153BarFasEst[0] ;
            A460FasDsc = H01FB9_A460FasDsc[0] ;
            A457FasCod = H01FB9_A457FasCod[0] ;
            A603MaqCodBis = H01FB9_A603MaqCodBis[0] ;
            A194BarOrdLin = H01FB9_A194BarOrdLin[0] ;
            A218BarTipCol = H01FB9_A218BarTipCol[0] ;
            A136BarColNum = H01FB9_A136BarColNum[0] ;
            A135BarColNom = H01FB9_A135BarColNom[0] ;
            A1652BarSerDsc = H01FB9_A1652BarSerDsc[0] ;
            A212BarSer = H01FB9_A212BarSer[0] ;
            A13696BarNHdr = H01FB9_A13696BarNHdr[0] ;
            A159BarFecGen = H01FB9_A159BarFecGen[0] ;
            A158BarFecFpr = H01FB9_A158BarFecFpr[0] ;
            A155BarFecCli = H01FB9_A155BarFecCli[0] ;
            A279CliNom = H01FB9_A279CliNom[0] ;
            A156BarFecCum = H01FB9_A156BarFecCum[0] ;
            n156BarFecCum = H01FB9_n156BarFecCum[0] ;
            A151BarFasCod = H01FB9_A151BarFasCod[0] ;
            n151BarFasCod = H01FB9_n151BarFasCod[0] ;
            A166BarKgm = H01FB9_A166BarKgm[0] ;
            A184BarMtr = H01FB9_A184BarMtr[0] ;
            A129BarCod = H01FB9_A129BarCod[0] ;
            A132BarCodReo = H01FB9_A132BarCodReo[0] ;
            A130BarCodPar = H01FB9_A130BarCodPar[0] ;
            A143BarDisNum = H01FB9_A143BarDisNum[0] ;
            A4812BarEncCli = H01FB9_A4812BarEncCli[0] ;
            A396EmprCod = H01FB9_A396EmprCod[0] ;
            A199BarPie1 = H01FB9_A199BarPie1[0] ;
            A365DisDes = H01FB9_A365DisDes[0] ;
            A898BarPieNDes = H01FB9_A898BarPieNDes[0] ;
            A460FasDsc = H01FB9_A460FasDsc[0] ;
            A252CliCod = H01FB9_A252CliCod[0] ;
            n252CliCod = H01FB9_n252CliCod[0] ;
            A213BarSit = H01FB9_A213BarSit[0] ;
            A218BarTipCol = H01FB9_A218BarTipCol[0] ;
            A136BarColNum = H01FB9_A136BarColNum[0] ;
            A135BarColNom = H01FB9_A135BarColNom[0] ;
            A1652BarSerDsc = H01FB9_A1652BarSerDsc[0] ;
            A212BarSer = H01FB9_A212BarSer[0] ;
            A13696BarNHdr = H01FB9_A13696BarNHdr[0] ;
            A159BarFecGen = H01FB9_A159BarFecGen[0] ;
            A158BarFecFpr = H01FB9_A158BarFecFpr[0] ;
            A155BarFecCli = H01FB9_A155BarFecCli[0] ;
            A143BarDisNum = H01FB9_A143BarDisNum[0] ;
            A4812BarEncCli = H01FB9_A4812BarEncCli[0] ;
            A365DisDes = H01FB9_A365DisDes[0] ;
            A279CliNom = H01FB9_A279CliNom[0] ;
            A156BarFecCum = H01FB9_A156BarFecCum[0] ;
            n156BarFecCum = H01FB9_n156BarFecCum[0] ;
            A151BarFasCod = H01FB9_A151BarFasCod[0] ;
            n151BarFasCod = H01FB9_n151BarFasCod[0] ;
            A166BarKgm = H01FB9_A166BarKgm[0] ;
            A184BarMtr = H01FB9_A184BarMtr[0] ;
            A199BarPie1 = H01FB9_A199BarPie1[0] ;
            A898BarPieNDes = H01FB9_A898BarPieNDes[0] ;
            GXt_char1 = A13878PedidoClie ;
            GXv_char2[0] = A396EmprCod ;
            GXv_char3[0] = A4812BarEncCli ;
            GXv_char4[0] = A143BarDisNum ;
            GXv_char5[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
            cargasporsecciontradicional_wc_impl.this.A396EmprCod = GXv_char2[0] ;
            cargasporsecciontradicional_wc_impl.this.A4812BarEncCli = GXv_char3[0] ;
            cargasporsecciontradicional_wc_impl.this.A143BarDisNum = GXv_char4[0] ;
            cargasporsecciontradicional_wc_impl.this.GXt_char1 = GXv_char5[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel) == 0 ) ) )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                  {
                     A198BarPie = A898BarPieNDes ;
                  }
                  else
                  {
                     A198BarPie = A199BarPie1 ;
                  }
                  if ( (GXutil.strcmp("", AV108Cargasporsecciontradicional_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV108Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV108Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV108Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV108Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV108Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV108Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV108Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV108Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A194BarOrdLin, 4, 0) , GXutil.padr( "%" + AV108Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A603MaqCodBis) , GXutil.padr( "%" + GXutil.upper( AV108Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A457FasCod) , GXutil.padr( "%" + GXutil.upper( AV108Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A460FasDsc) , GXutil.padr( "%" + GXutil.upper( AV108Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A153BarFasEst, 1, 0) , GXutil.padr( "%" + AV108Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV108Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV108Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV108Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV108Cargasporsecciontradicional_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV108Cargasporsecciontradicional_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                  {
                     if ( (0==AV141Cargasporsecciontradicional_wcds_34_tfbarpie) || ( ( A198BarPie >= AV141Cargasporsecciontradicional_wcds_34_tfbarpie ) ) )
                     {
                        if ( (0==AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to) || ( ( A198BarPie <= AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to ) ) )
                        {
                           e171FB2 ();
                        }
                     }
                  }
               }
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(36) ;
         wb1FB0( ) ;
      }
      bGXsfl_36_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1FB2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV148Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV148Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGANT", GXutil.ltrim( localUtil.ntoc( AV100FlagAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100FlagAnt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLINEA", GXutil.ltrim( localUtil.ntoc( AV101Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLINEA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV101Linea), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vESTS", GXutil.ltrim( localUtil.ntoc( AV102EstS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vESTS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV102EstS), "ZZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(GRID_nFirstRecordOnPage+1) ;
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
      AV108Cargasporsecciontradicional_wcds_1_filterfulltext = AV19FilterFullText ;
      AV109Cargasporsecciontradicional_wcds_2_tfclinom = AV30TFCliNom ;
      AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV32TFBarFecCli ;
      AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV36TFPedidoCliente ;
      AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV37TFPedidoCliente_Sel ;
      AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV38TFBarFecFpr ;
      AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV42TFBarFecGen ;
      AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV46TFBarNHdr ;
      AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV47TFBarNHdr_Sel ;
      AV118Cargasporsecciontradicional_wcds_11_tfbarser = AV48TFBarSer ;
      AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV49TFBarSer_Sel ;
      AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV50TFBarSerDsc ;
      AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
      AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV52TFBarColNom ;
      AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV54TFBarColNum ;
      AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV55TFBarColNum_To ;
      AV126Cargasporsecciontradicional_wcds_19_tfbartipcol = AV56TFBarTipCol ;
      AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV57TFBarTipCol_To ;
      AV128Cargasporsecciontradicional_wcds_21_tfbarordlin = AV58TFBarOrdLin ;
      AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV59TFBarOrdLin_To ;
      AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV60TFMaqCodBis ;
      AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV61TFMaqCodBis_Sel ;
      AV132Cargasporsecciontradicional_wcds_25_tffascod = AV62TFFasCod ;
      AV133Cargasporsecciontradicional_wcds_26_tffascod_sel = AV63TFFasCod_Sel ;
      AV134Cargasporsecciontradicional_wcds_27_tffasdsc = AV64TFFasDsc ;
      AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV67TFBarFasEst_Sels ;
      AV137Cargasporsecciontradicional_wcds_30_tfbarmtr = AV68TFBarMtr ;
      AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV69TFBarMtr_To ;
      AV139Cargasporsecciontradicional_wcds_32_tfbarkgm = AV70TFBarKgm ;
      AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV71TFBarKgm_To ;
      AV141Cargasporsecciontradicional_wcds_34_tfbarpie = AV72TFBarPie ;
      AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV73TFBarPie_To ;
      AV143Cargasporsecciontradicional_wcds_36_tfbarfascod = AV74TFBarFasCod ;
      AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV75TFBarFasCod_Sel ;
      AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV76TFBarFecCum ;
      AV146Cargasporsecciontradicional_wcds_39_tfbarsit = AV80TFBarSit ;
      AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV81TFBarSit_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV94MaqcodInout, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV96FasesColeccion, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFBarFecCli, AV36TFPedidoCliente, AV37TFPedidoCliente_Sel, AV38TFBarFecFpr, AV42TFBarFecGen, AV46TFBarNHdr, AV47TFBarNHdr_Sel, AV48TFBarSer, AV49TFBarSer_Sel, AV50TFBarSerDsc, AV51TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV54TFBarColNum, AV55TFBarColNum_To, AV56TFBarTipCol, AV57TFBarTipCol_To, AV58TFBarOrdLin, AV59TFBarOrdLin_To, AV60TFMaqCodBis, AV61TFMaqCodBis_Sel, AV62TFFasCod, AV63TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFBarFasEst_Sels, AV68TFBarMtr, AV69TFBarMtr_To, AV70TFBarKgm, AV71TFBarKgm_To, AV72TFBarPie, AV73TFBarPie_To, AV74TFBarFasCod, AV75TFBarFasCod_Sel, AV76TFBarFecCum, AV80TFBarSit, AV81TFBarSit_To, AV148Pgmname, AV16OrderedBy, AV17OrderedDsc, AV93TipoControl, AV95FasesToJson, AV100FlagAnt, AV101Linea, AV102EstS, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV108Cargasporsecciontradicional_wcds_1_filterfulltext = AV19FilterFullText ;
      AV109Cargasporsecciontradicional_wcds_2_tfclinom = AV30TFCliNom ;
      AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV32TFBarFecCli ;
      AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV36TFPedidoCliente ;
      AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV37TFPedidoCliente_Sel ;
      AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV38TFBarFecFpr ;
      AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV42TFBarFecGen ;
      AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV46TFBarNHdr ;
      AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV47TFBarNHdr_Sel ;
      AV118Cargasporsecciontradicional_wcds_11_tfbarser = AV48TFBarSer ;
      AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV49TFBarSer_Sel ;
      AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV50TFBarSerDsc ;
      AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
      AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV52TFBarColNom ;
      AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV54TFBarColNum ;
      AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV55TFBarColNum_To ;
      AV126Cargasporsecciontradicional_wcds_19_tfbartipcol = AV56TFBarTipCol ;
      AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV57TFBarTipCol_To ;
      AV128Cargasporsecciontradicional_wcds_21_tfbarordlin = AV58TFBarOrdLin ;
      AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV59TFBarOrdLin_To ;
      AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV60TFMaqCodBis ;
      AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV61TFMaqCodBis_Sel ;
      AV132Cargasporsecciontradicional_wcds_25_tffascod = AV62TFFasCod ;
      AV133Cargasporsecciontradicional_wcds_26_tffascod_sel = AV63TFFasCod_Sel ;
      AV134Cargasporsecciontradicional_wcds_27_tffasdsc = AV64TFFasDsc ;
      AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV67TFBarFasEst_Sels ;
      AV137Cargasporsecciontradicional_wcds_30_tfbarmtr = AV68TFBarMtr ;
      AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV69TFBarMtr_To ;
      AV139Cargasporsecciontradicional_wcds_32_tfbarkgm = AV70TFBarKgm ;
      AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV71TFBarKgm_To ;
      AV141Cargasporsecciontradicional_wcds_34_tfbarpie = AV72TFBarPie ;
      AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV73TFBarPie_To ;
      AV143Cargasporsecciontradicional_wcds_36_tfbarfascod = AV74TFBarFasCod ;
      AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV75TFBarFasCod_Sel ;
      AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV76TFBarFecCum ;
      AV146Cargasporsecciontradicional_wcds_39_tfbarsit = AV80TFBarSit ;
      AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV81TFBarSit_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV94MaqcodInout, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV96FasesColeccion, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFBarFecCli, AV36TFPedidoCliente, AV37TFPedidoCliente_Sel, AV38TFBarFecFpr, AV42TFBarFecGen, AV46TFBarNHdr, AV47TFBarNHdr_Sel, AV48TFBarSer, AV49TFBarSer_Sel, AV50TFBarSerDsc, AV51TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV54TFBarColNum, AV55TFBarColNum_To, AV56TFBarTipCol, AV57TFBarTipCol_To, AV58TFBarOrdLin, AV59TFBarOrdLin_To, AV60TFMaqCodBis, AV61TFMaqCodBis_Sel, AV62TFFasCod, AV63TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFBarFasEst_Sels, AV68TFBarMtr, AV69TFBarMtr_To, AV70TFBarKgm, AV71TFBarKgm_To, AV72TFBarPie, AV73TFBarPie_To, AV74TFBarFasCod, AV75TFBarFasCod_Sel, AV76TFBarFecCum, AV80TFBarSit, AV81TFBarSit_To, AV148Pgmname, AV16OrderedBy, AV17OrderedDsc, AV93TipoControl, AV95FasesToJson, AV100FlagAnt, AV101Linea, AV102EstS, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV108Cargasporsecciontradicional_wcds_1_filterfulltext = AV19FilterFullText ;
      AV109Cargasporsecciontradicional_wcds_2_tfclinom = AV30TFCliNom ;
      AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV32TFBarFecCli ;
      AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV36TFPedidoCliente ;
      AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV37TFPedidoCliente_Sel ;
      AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV38TFBarFecFpr ;
      AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV42TFBarFecGen ;
      AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV46TFBarNHdr ;
      AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV47TFBarNHdr_Sel ;
      AV118Cargasporsecciontradicional_wcds_11_tfbarser = AV48TFBarSer ;
      AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV49TFBarSer_Sel ;
      AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV50TFBarSerDsc ;
      AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
      AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV52TFBarColNom ;
      AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV54TFBarColNum ;
      AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV55TFBarColNum_To ;
      AV126Cargasporsecciontradicional_wcds_19_tfbartipcol = AV56TFBarTipCol ;
      AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV57TFBarTipCol_To ;
      AV128Cargasporsecciontradicional_wcds_21_tfbarordlin = AV58TFBarOrdLin ;
      AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV59TFBarOrdLin_To ;
      AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV60TFMaqCodBis ;
      AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV61TFMaqCodBis_Sel ;
      AV132Cargasporsecciontradicional_wcds_25_tffascod = AV62TFFasCod ;
      AV133Cargasporsecciontradicional_wcds_26_tffascod_sel = AV63TFFasCod_Sel ;
      AV134Cargasporsecciontradicional_wcds_27_tffasdsc = AV64TFFasDsc ;
      AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV67TFBarFasEst_Sels ;
      AV137Cargasporsecciontradicional_wcds_30_tfbarmtr = AV68TFBarMtr ;
      AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV69TFBarMtr_To ;
      AV139Cargasporsecciontradicional_wcds_32_tfbarkgm = AV70TFBarKgm ;
      AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV71TFBarKgm_To ;
      AV141Cargasporsecciontradicional_wcds_34_tfbarpie = AV72TFBarPie ;
      AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV73TFBarPie_To ;
      AV143Cargasporsecciontradicional_wcds_36_tfbarfascod = AV74TFBarFasCod ;
      AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV75TFBarFasCod_Sel ;
      AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV76TFBarFecCum ;
      AV146Cargasporsecciontradicional_wcds_39_tfbarsit = AV80TFBarSit ;
      AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV81TFBarSit_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV94MaqcodInout, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV96FasesColeccion, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFBarFecCli, AV36TFPedidoCliente, AV37TFPedidoCliente_Sel, AV38TFBarFecFpr, AV42TFBarFecGen, AV46TFBarNHdr, AV47TFBarNHdr_Sel, AV48TFBarSer, AV49TFBarSer_Sel, AV50TFBarSerDsc, AV51TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV54TFBarColNum, AV55TFBarColNum_To, AV56TFBarTipCol, AV57TFBarTipCol_To, AV58TFBarOrdLin, AV59TFBarOrdLin_To, AV60TFMaqCodBis, AV61TFMaqCodBis_Sel, AV62TFFasCod, AV63TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFBarFasEst_Sels, AV68TFBarMtr, AV69TFBarMtr_To, AV70TFBarKgm, AV71TFBarKgm_To, AV72TFBarPie, AV73TFBarPie_To, AV74TFBarFasCod, AV75TFBarFasCod_Sel, AV76TFBarFecCum, AV80TFBarSit, AV81TFBarSit_To, AV148Pgmname, AV16OrderedBy, AV17OrderedDsc, AV93TipoControl, AV95FasesToJson, AV100FlagAnt, AV101Linea, AV102EstS, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV108Cargasporsecciontradicional_wcds_1_filterfulltext = AV19FilterFullText ;
      AV109Cargasporsecciontradicional_wcds_2_tfclinom = AV30TFCliNom ;
      AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV32TFBarFecCli ;
      AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV36TFPedidoCliente ;
      AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV37TFPedidoCliente_Sel ;
      AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV38TFBarFecFpr ;
      AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV42TFBarFecGen ;
      AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV46TFBarNHdr ;
      AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV47TFBarNHdr_Sel ;
      AV118Cargasporsecciontradicional_wcds_11_tfbarser = AV48TFBarSer ;
      AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV49TFBarSer_Sel ;
      AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV50TFBarSerDsc ;
      AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
      AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV52TFBarColNom ;
      AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV54TFBarColNum ;
      AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV55TFBarColNum_To ;
      AV126Cargasporsecciontradicional_wcds_19_tfbartipcol = AV56TFBarTipCol ;
      AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV57TFBarTipCol_To ;
      AV128Cargasporsecciontradicional_wcds_21_tfbarordlin = AV58TFBarOrdLin ;
      AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV59TFBarOrdLin_To ;
      AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV60TFMaqCodBis ;
      AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV61TFMaqCodBis_Sel ;
      AV132Cargasporsecciontradicional_wcds_25_tffascod = AV62TFFasCod ;
      AV133Cargasporsecciontradicional_wcds_26_tffascod_sel = AV63TFFasCod_Sel ;
      AV134Cargasporsecciontradicional_wcds_27_tffasdsc = AV64TFFasDsc ;
      AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV67TFBarFasEst_Sels ;
      AV137Cargasporsecciontradicional_wcds_30_tfbarmtr = AV68TFBarMtr ;
      AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV69TFBarMtr_To ;
      AV139Cargasporsecciontradicional_wcds_32_tfbarkgm = AV70TFBarKgm ;
      AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV71TFBarKgm_To ;
      AV141Cargasporsecciontradicional_wcds_34_tfbarpie = AV72TFBarPie ;
      AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV73TFBarPie_To ;
      AV143Cargasporsecciontradicional_wcds_36_tfbarfascod = AV74TFBarFasCod ;
      AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV75TFBarFasCod_Sel ;
      AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV76TFBarFecCum ;
      AV146Cargasporsecciontradicional_wcds_39_tfbarsit = AV80TFBarSit ;
      AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV81TFBarSit_To ;
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV94MaqcodInout, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV96FasesColeccion, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFBarFecCli, AV36TFPedidoCliente, AV37TFPedidoCliente_Sel, AV38TFBarFecFpr, AV42TFBarFecGen, AV46TFBarNHdr, AV47TFBarNHdr_Sel, AV48TFBarSer, AV49TFBarSer_Sel, AV50TFBarSerDsc, AV51TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV54TFBarColNum, AV55TFBarColNum_To, AV56TFBarTipCol, AV57TFBarTipCol_To, AV58TFBarOrdLin, AV59TFBarOrdLin_To, AV60TFMaqCodBis, AV61TFMaqCodBis_Sel, AV62TFFasCod, AV63TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFBarFasEst_Sels, AV68TFBarMtr, AV69TFBarMtr_To, AV70TFBarKgm, AV71TFBarKgm_To, AV72TFBarPie, AV73TFBarPie_To, AV74TFBarFasCod, AV75TFBarFasCod_Sel, AV76TFBarFecCum, AV80TFBarSit, AV81TFBarSit_To, AV148Pgmname, AV16OrderedBy, AV17OrderedDsc, AV93TipoControl, AV95FasesToJson, AV100FlagAnt, AV101Linea, AV102EstS, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV108Cargasporsecciontradicional_wcds_1_filterfulltext = AV19FilterFullText ;
      AV109Cargasporsecciontradicional_wcds_2_tfclinom = AV30TFCliNom ;
      AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV32TFBarFecCli ;
      AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV36TFPedidoCliente ;
      AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV37TFPedidoCliente_Sel ;
      AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV38TFBarFecFpr ;
      AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV42TFBarFecGen ;
      AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV46TFBarNHdr ;
      AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV47TFBarNHdr_Sel ;
      AV118Cargasporsecciontradicional_wcds_11_tfbarser = AV48TFBarSer ;
      AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV49TFBarSer_Sel ;
      AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV50TFBarSerDsc ;
      AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
      AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV52TFBarColNom ;
      AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV54TFBarColNum ;
      AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV55TFBarColNum_To ;
      AV126Cargasporsecciontradicional_wcds_19_tfbartipcol = AV56TFBarTipCol ;
      AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV57TFBarTipCol_To ;
      AV128Cargasporsecciontradicional_wcds_21_tfbarordlin = AV58TFBarOrdLin ;
      AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV59TFBarOrdLin_To ;
      AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV60TFMaqCodBis ;
      AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV61TFMaqCodBis_Sel ;
      AV132Cargasporsecciontradicional_wcds_25_tffascod = AV62TFFasCod ;
      AV133Cargasporsecciontradicional_wcds_26_tffascod_sel = AV63TFFasCod_Sel ;
      AV134Cargasporsecciontradicional_wcds_27_tffasdsc = AV64TFFasDsc ;
      AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV67TFBarFasEst_Sels ;
      AV137Cargasporsecciontradicional_wcds_30_tfbarmtr = AV68TFBarMtr ;
      AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV69TFBarMtr_To ;
      AV139Cargasporsecciontradicional_wcds_32_tfbarkgm = AV70TFBarKgm ;
      AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV71TFBarKgm_To ;
      AV141Cargasporsecciontradicional_wcds_34_tfbarpie = AV72TFBarPie ;
      AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV73TFBarPie_To ;
      AV143Cargasporsecciontradicional_wcds_36_tfbarfascod = AV74TFBarFasCod ;
      AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV75TFBarFasCod_Sel ;
      AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV76TFBarFecCum ;
      AV146Cargasporsecciontradicional_wcds_39_tfbarsit = AV80TFBarSit ;
      AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV81TFBarSit_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV94MaqcodInout, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV96FasesColeccion, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV19FilterFullText, AV30TFCliNom, AV31TFCliNom_Sel, AV32TFBarFecCli, AV36TFPedidoCliente, AV37TFPedidoCliente_Sel, AV38TFBarFecFpr, AV42TFBarFecGen, AV46TFBarNHdr, AV47TFBarNHdr_Sel, AV48TFBarSer, AV49TFBarSer_Sel, AV50TFBarSerDsc, AV51TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV54TFBarColNum, AV55TFBarColNum_To, AV56TFBarTipCol, AV57TFBarTipCol_To, AV58TFBarOrdLin, AV59TFBarOrdLin_To, AV60TFMaqCodBis, AV61TFMaqCodBis_Sel, AV62TFFasCod, AV63TFFasCod_Sel, AV64TFFasDsc, AV65TFFasDsc_Sel, AV67TFBarFasEst_Sels, AV68TFBarMtr, AV69TFBarMtr_To, AV70TFBarKgm, AV71TFBarKgm_To, AV72TFBarPie, AV73TFBarPie_To, AV74TFBarFasCod, AV75TFBarFasCod_Sel, AV76TFBarFecCum, AV80TFBarSit, AV81TFBarSit_To, AV148Pgmname, AV16OrderedBy, AV17OrderedDsc, AV93TipoControl, AV95FasesToJson, AV100FlagAnt, AV101Linea, AV102EstS, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV148Pgmname = "CargasporSeccionTradicional_WC" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1FB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151FB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV27ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV82DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV24ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV94MaqcodInout = httpContext.cgiGet( sPrefix+"wcpOAV94MaqcodInout") ;
         wcpOAV93TipoControl = httpContext.cgiGet( sPrefix+"wcpOAV93TipoControl") ;
         wcpOAV95FasesToJson = httpContext.cgiGet( sPrefix+"wcpOAV95FasesToJson") ;
         wcpOAV6Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV8Barcodpar") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         /* Read variables values. */
         AV19FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_barfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_BarFecCliAuxDate", localUtil.format(AV34DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_BarFecCliAuxDate", localUtil.format(AV34DDO_BarFecCliAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECFPRAUXDATE");
            GX_FocusControl = edtavDdo_barfecfprauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40DDO_BarFecFprAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_BarFecFprAuxDate", localUtil.format(AV40DDO_BarFecFprAuxDate, "99/99/99"));
         }
         else
         {
            AV40DDO_BarFecFprAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_BarFecFprAuxDate", localUtil.format(AV40DDO_BarFecFprAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATE");
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44DDO_BarFecGenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44DDO_BarFecGenAuxDate", localUtil.format(AV44DDO_BarFecGenAuxDate, "99/99/99"));
         }
         else
         {
            AV44DDO_BarFecGenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44DDO_BarFecGenAuxDate", localUtil.format(AV44DDO_BarFecGenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccumauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCUMAUXDATE");
            GX_FocusControl = edtavDdo_barfeccumauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV78DDO_BarFecCumAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78DDO_BarFecCumAuxDate", localUtil.format(AV78DDO_BarFecCumAuxDate, "99/99/99"));
         }
         else
         {
            AV78DDO_BarFecCumAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccumauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78DDO_BarFecCumAuxDate", localUtil.format(AV78DDO_BarFecCumAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e151FB2 ();
      if (returnInSub) return;
   }

   public void e151FB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV96FasesColeccion.fromJSonString(AV95FasesToJson, null);
      GXt_char1 = AV105Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV105Station = GXt_char1 ;
      GXv_char5[0] = AV5Emprcod ;
      GXv_char4[0] = AV106Emprnom ;
      GXv_char3[0] = AV107Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV105Station, GXv_char5, GXv_char4, GXv_char3) ;
      cargasporsecciontradicional_wc_impl.this.AV5Emprcod = GXv_char5[0] ;
      cargasporsecciontradicional_wc_impl.this.AV106Emprnom = GXv_char4[0] ;
      cargasporsecciontradicional_wc_impl.this.AV107Usurcod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV16OrderedBy < 1 )
      {
         AV16OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV82DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV82DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e161FB2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext8[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV10WWPContext = GXv_SdtWWPContext8[0] ;
      if ( AV29ManageFiltersExecutionStep == 1 )
      {
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV29ManageFiltersExecutionStep == 2 )
      {
         AV29ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV26Session.getValue("CargasporSeccionTradicional_WCColumnsSelector"), "") != 0 )
      {
         AV22ColumnsSelectorXML = AV26Session.getValue("CargasporSeccionTradicional_WCColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV22ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtPedidoClie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedidoClie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarFecFpr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecFpr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecFpr_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarFecGen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecGen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarTipCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarOrdLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtMaqCodBis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCodBis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtFasDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Visible), 5, 0), !bGXsfl_36_Refreshing);
      cmbBarFasEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarFasEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbBarFasEst.getVisible(), 5, 0), !bGXsfl_36_Refreshing);
      edtBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCod_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarFecCum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecCum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCum_Visible), 5, 0), !bGXsfl_36_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_36_Refreshing);
      AV108Cargasporsecciontradicional_wcds_1_filterfulltext = AV19FilterFullText ;
      AV109Cargasporsecciontradicional_wcds_2_tfclinom = AV30TFCliNom ;
      AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel = AV31TFCliNom_Sel ;
      AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli = AV32TFBarFecCli ;
      AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente = AV36TFPedidoCliente ;
      AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = AV37TFPedidoCliente_Sel ;
      AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr = AV38TFBarFecFpr ;
      AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen = AV42TFBarFecGen ;
      AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr = AV46TFBarNHdr ;
      AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = AV47TFBarNHdr_Sel ;
      AV118Cargasporsecciontradicional_wcds_11_tfbarser = AV48TFBarSer ;
      AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel = AV49TFBarSer_Sel ;
      AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc = AV50TFBarSerDsc ;
      AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
      AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom = AV52TFBarColNom ;
      AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum = AV54TFBarColNum ;
      AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to = AV55TFBarColNum_To ;
      AV126Cargasporsecciontradicional_wcds_19_tfbartipcol = AV56TFBarTipCol ;
      AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to = AV57TFBarTipCol_To ;
      AV128Cargasporsecciontradicional_wcds_21_tfbarordlin = AV58TFBarOrdLin ;
      AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to = AV59TFBarOrdLin_To ;
      AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis = AV60TFMaqCodBis ;
      AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = AV61TFMaqCodBis_Sel ;
      AV132Cargasporsecciontradicional_wcds_25_tffascod = AV62TFFasCod ;
      AV133Cargasporsecciontradicional_wcds_26_tffascod_sel = AV63TFFasCod_Sel ;
      AV134Cargasporsecciontradicional_wcds_27_tffasdsc = AV64TFFasDsc ;
      AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel = AV65TFFasDsc_Sel ;
      AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = AV67TFBarFasEst_Sels ;
      AV137Cargasporsecciontradicional_wcds_30_tfbarmtr = AV68TFBarMtr ;
      AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to = AV69TFBarMtr_To ;
      AV139Cargasporsecciontradicional_wcds_32_tfbarkgm = AV70TFBarKgm ;
      AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to = AV71TFBarKgm_To ;
      AV141Cargasporsecciontradicional_wcds_34_tfbarpie = AV72TFBarPie ;
      AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to = AV73TFBarPie_To ;
      AV143Cargasporsecciontradicional_wcds_36_tfbarfascod = AV74TFBarFasCod ;
      AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = AV75TFBarFasCod_Sel ;
      AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum = AV76TFBarFecCum ;
      AV146Cargasporsecciontradicional_wcds_39_tfbarsit = AV80TFBarSit ;
      AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to = AV81TFBarSit_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e121FB2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV16OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         AV17OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedDsc", AV17OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV30TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFCliNom", AV30TFCliNom);
            AV31TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliNom_Sel", AV31TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCli") == 0 )
         {
            AV32TFBarFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarFecCli", localUtil.format(AV32TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedidoCliente") == 0 )
         {
            AV36TFPedidoCliente = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPedidoCliente", AV36TFPedidoCliente);
            AV37TFPedidoCliente_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPedidoCliente_Sel", AV37TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecFpr") == 0 )
         {
            AV38TFBarFecFpr = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarFecFpr", localUtil.format(AV38TFBarFecFpr, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecGen") == 0 )
         {
            AV42TFBarFecGen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarFecGen", localUtil.format(AV42TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV46TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNHdr", AV46TFBarNHdr);
            AV47TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNHdr_Sel", AV47TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV48TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarSer", AV48TFBarSer);
            AV49TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSer_Sel", AV49TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV50TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc", AV50TFBarSerDsc);
            AV51TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarSerDsc_Sel", AV51TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV52TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom", AV52TFBarColNom);
            AV53TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNom_Sel", AV53TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV54TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum), 6, 0));
            AV55TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipCol") == 0 )
         {
            AV56TFBarTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarTipCol), 2, 0));
            AV57TFBarTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV58TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarOrdLin), 4, 0));
            AV59TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodBis") == 0 )
         {
            AV60TFMaqCodBis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMaqCodBis", AV60TFMaqCodBis);
            AV61TFMaqCodBis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFMaqCodBis_Sel", AV61TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV62TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFFasCod", AV62TFFasCod);
            AV63TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFFasCod_Sel", AV63TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV64TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFFasDsc", AV64TFFasDsc);
            AV65TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFFasDsc_Sel", AV65TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasEst") == 0 )
         {
            AV66TFBarFasEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarFasEst_SelsJson", AV66TFBarFasEst_SelsJson);
            AV67TFBarFasEst_Sels.fromJSonString(GXutil.strReplace( AV66TFBarFasEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtr") == 0 )
         {
            AV68TFBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarMtr", GXutil.ltrimstr( AV68TFBarMtr, 9, 2));
            AV69TFBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarMtr_To", GXutil.ltrimstr( AV69TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgm") == 0 )
         {
            AV70TFBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarKgm", GXutil.ltrimstr( AV70TFBarKgm, 9, 2));
            AV71TFBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarKgm_To", GXutil.ltrimstr( AV71TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPie") == 0 )
         {
            AV72TFBarPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBarPie), 6, 0));
            AV73TFBarPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFBarPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasCod") == 0 )
         {
            AV74TFBarFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFBarFasCod", AV74TFBarFasCod);
            AV75TFBarFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFBarFasCod_Sel", AV75TFBarFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCum") == 0 )
         {
            AV76TFBarFecCum = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFBarFecCum", localUtil.format(AV76TFBarFecCum, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV80TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFBarSit), 2, 0));
            AV81TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFBarSit_To), 2, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV67TFBarFasEst_Sels", AV67TFBarFasEst_Sels);
   }

   private void e171FB2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV99BarOrdAnt = (short)(A194BarOrdLin-100) ;
      if ( AV99BarOrdAnt > 0 )
      {
         if ( GXutil.strcmp(AV93TipoControl, httpContext.getMessage( "D", "")) == 0 )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int9[0] = A129BarCod ;
            GXv_int10[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int11[0] = AV99BarOrdAnt ;
            GXv_int12[0] = (byte)(AV100FlagAnt) ;
            GXv_int13[0] = AV101Linea ;
            new app.pfasanti(remoteHandle, context).execute( GXv_char5, GXv_int9, GXv_int10, GXv_char4, GXv_int11, GXv_int12, GXv_int13) ;
            cargasporsecciontradicional_wc_impl.this.A396EmprCod = GXv_char5[0] ;
            cargasporsecciontradicional_wc_impl.this.A129BarCod = GXv_int9[0] ;
            cargasporsecciontradicional_wc_impl.this.A132BarCodReo = GXv_int10[0] ;
            cargasporsecciontradicional_wc_impl.this.A130BarCodPar = GXv_char4[0] ;
            cargasporsecciontradicional_wc_impl.this.AV99BarOrdAnt = GXv_int11[0] ;
            cargasporsecciontradicional_wc_impl.this.AV100FlagAnt = GXv_int12[0] ;
            cargasporsecciontradicional_wc_impl.this.AV101Linea = GXv_int13[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100FlagAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100FlagAnt), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100FlagAnt), "ZZZ9")));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101Linea), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLINEA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV101Linea), "ZZZ9")));
         }
         else
         {
            AV100FlagAnt = (short)(2) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100FlagAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100FlagAnt), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100FlagAnt), "ZZZ9")));
         }
         GXv_char5[0] = A396EmprCod ;
         GXv_int9[0] = A129BarCod ;
         GXv_int12[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int13[0] = A194BarOrdLin ;
         GXv_int10[0] = (byte)(AV102EstS) ;
         new app.prestof(remoteHandle, context).execute( GXv_char5, GXv_int9, GXv_int12, GXv_char4, GXv_int13, GXv_int10) ;
         cargasporsecciontradicional_wc_impl.this.A396EmprCod = GXv_char5[0] ;
         cargasporsecciontradicional_wc_impl.this.A129BarCod = GXv_int9[0] ;
         cargasporsecciontradicional_wc_impl.this.A132BarCodReo = GXv_int12[0] ;
         cargasporsecciontradicional_wc_impl.this.A130BarCodPar = GXv_char4[0] ;
         cargasporsecciontradicional_wc_impl.this.A194BarOrdLin = GXv_int13[0] ;
         cargasporsecciontradicional_wc_impl.this.AV102EstS = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102EstS", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102EstS), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vESTS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV102EstS), "ZZZ9")));
         if ( AV102EstS > 0 )
         {
            AV100FlagAnt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100FlagAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100FlagAnt), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100FlagAnt), "ZZZ9")));
         }
      }
      else
      {
         AV100FlagAnt = (short)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100FlagAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100FlagAnt), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGANT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV100FlagAnt), "ZZZ9")));
      }
      if ( AV100FlagAnt == 2 )
      {
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(36) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_362( ) ;
            GRID_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
            }
         }
         if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
         {
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_36_Refreshing )
         {
            httpContext.doAjaxLoad(36, GridRow);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e131FB2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV22ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV24ColumnsSelector.fromJSonString(AV22ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "CargasporSeccionTradicional_WCColumnsSelector", ((GXutil.strcmp("", AV22ColumnsSelectorXML)==0) ? "" : AV24ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e111FB2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("CargasporSeccionTradicional_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV148Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("CargasporSeccionTradicional_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV28ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "CargasporSeccionTradicional_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         cargasporsecciontradicional_wc_impl.this.GXt_char1 = GXv_char5[0] ;
         AV28ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV28ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV148Pgmname+"GridState", AV28ManageFiltersXml) ;
            AV14GridState.fromxml(AV28ManageFiltersXml, null, null);
            AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
            AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedDsc", AV17OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV67TFBarFasEst_Sels", AV67TFBarFasEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e141FB2( )
   {
      /* 'DoExportar' Routine */
      returnInSub = false ;
      GXv_char5[0] = AV5Emprcod ;
      GXv_char4[0] = AV94MaqcodInout ;
      GXv_char3[0] = AV93TipoControl ;
      GXv_char2[0] = AV95FasesToJson ;
      GXv_char14[0] = AV20ExcelFilename ;
      GXv_char15[0] = AV21ErrorMessage ;
      new app.core.cargasporseccion_prc(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2, GXv_char14, GXv_char15) ;
      cargasporsecciontradicional_wc_impl.this.AV5Emprcod = GXv_char5[0] ;
      cargasporsecciontradicional_wc_impl.this.AV94MaqcodInout = GXv_char4[0] ;
      cargasporsecciontradicional_wc_impl.this.AV93TipoControl = GXv_char3[0] ;
      cargasporsecciontradicional_wc_impl.this.AV95FasesToJson = GXv_char2[0] ;
      cargasporsecciontradicional_wc_impl.this.AV20ExcelFilename = GXv_char14[0] ;
      cargasporsecciontradicional_wc_impl.this.AV21ErrorMessage = GXv_char15[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94MaqcodInout", AV94MaqcodInout);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TipoControl", AV93TipoControl);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95FasesToJson", AV95FasesToJson);
      if ( GXutil.strcmp(AV20ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV20ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV16OrderedBy, 4, 0))+":"+(AV17OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "CliNom", "", "Nombre Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarFecCli", "", "Fecha Disposicion Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarFecFpr", "", "Fecha Fin Previsto", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarFecGen", "", "Fecha Generacion Barcada", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarNHdr", "", "N Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarSer", "", "Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarColNom", "", "Nombre Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarColNum", "", "Numero del Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarTipCol", "", "TC", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarOrdLin", "", "Orden", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "MaqCodBis", "", "Maquina", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "FasCod", "", "Codigo Fase", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarFasEst", "", "Estado", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarMtr", "", "Metros", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarKgm", "", "Kilogramos", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarPie", "", "Piezas", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarFasCod", "", "Fase Ult", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarFecCum", "", "Fecha Ult", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXv_SdtWWPColumnsSelector16[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, "BarSit", "", "Situacion", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      GXt_char1 = AV23UserCustomValue ;
      GXv_char15[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CargasporSeccionTradicional_WCColumnsSelector", GXv_char15) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char1 = GXv_char15[0] ;
      AV23UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV23UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV23UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector16[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector17[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector16, GXv_SdtWWPColumnsSelector17) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector16[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = AV27ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "CargasporSeccionTradicional_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[0] ;
      AV27ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV19FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
      AV30TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFCliNom", AV30TFCliNom);
      AV31TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliNom_Sel", AV31TFCliNom_Sel);
      AV32TFBarFecCli = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarFecCli", localUtil.format(AV32TFBarFecCli, "99/99/99"));
      AV36TFPedidoCliente = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPedidoCliente", AV36TFPedidoCliente);
      AV37TFPedidoCliente_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPedidoCliente_Sel", AV37TFPedidoCliente_Sel);
      AV38TFBarFecFpr = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarFecFpr", localUtil.format(AV38TFBarFecFpr, "99/99/99"));
      AV42TFBarFecGen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarFecGen", localUtil.format(AV42TFBarFecGen, "99/99/99"));
      AV46TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNHdr", AV46TFBarNHdr);
      AV47TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNHdr_Sel", AV47TFBarNHdr_Sel);
      AV48TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarSer", AV48TFBarSer);
      AV49TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSer_Sel", AV49TFBarSer_Sel);
      AV50TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc", AV50TFBarSerDsc);
      AV51TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarSerDsc_Sel", AV51TFBarSerDsc_Sel);
      AV52TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom", AV52TFBarColNom);
      AV53TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNom_Sel", AV53TFBarColNom_Sel);
      AV54TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum), 6, 0));
      AV55TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarColNum_To), 6, 0));
      AV56TFBarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarTipCol), 2, 0));
      AV57TFBarTipCol_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarTipCol_To), 2, 0));
      AV58TFBarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarOrdLin), 4, 0));
      AV59TFBarOrdLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarOrdLin_To), 4, 0));
      AV60TFMaqCodBis = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMaqCodBis", AV60TFMaqCodBis);
      AV61TFMaqCodBis_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFMaqCodBis_Sel", AV61TFMaqCodBis_Sel);
      AV62TFFasCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFFasCod", AV62TFFasCod);
      AV63TFFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFFasCod_Sel", AV63TFFasCod_Sel);
      AV64TFFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFFasDsc", AV64TFFasDsc);
      AV65TFFasDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFFasDsc_Sel", AV65TFFasDsc_Sel);
      AV67TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV68TFBarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarMtr", GXutil.ltrimstr( AV68TFBarMtr, 9, 2));
      AV69TFBarMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarMtr_To", GXutil.ltrimstr( AV69TFBarMtr_To, 9, 2));
      AV70TFBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarKgm", GXutil.ltrimstr( AV70TFBarKgm, 9, 2));
      AV71TFBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarKgm_To", GXutil.ltrimstr( AV71TFBarKgm_To, 9, 2));
      AV72TFBarPie = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBarPie), 6, 0));
      AV73TFBarPie_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFBarPie_To), 6, 0));
      AV74TFBarFasCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFBarFasCod", AV74TFBarFasCod);
      AV75TFBarFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFBarFasCod_Sel", AV75TFBarFasCod_Sel);
      AV76TFBarFecCum = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFBarFecCum", localUtil.format(AV76TFBarFecCum, "99/99/99"));
      AV80TFBarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFBarSit), 2, 0));
      AV81TFBarSit_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFBarSit_To), 2, 0));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue(AV148Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV148Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV26Session.getValue(AV148Pgmname+"GridState"), null, null);
      }
      AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
      AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedDsc", AV17OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV149GXV1 = 1 ;
      while ( AV149GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV149GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV19FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV30TFCliNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFCliNom", AV30TFCliNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV31TFCliNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliNom_Sel", AV31TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV32TFBarFecCli = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFBarFecCli", localUtil.format(AV32TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV36TFPedidoCliente = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPedidoCliente", AV36TFPedidoCliente);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV37TFPedidoCliente_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPedidoCliente_Sel", AV37TFPedidoCliente_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV38TFBarFecFpr = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarFecFpr", localUtil.format(AV38TFBarFecFpr, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV42TFBarFecGen = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFBarFecGen", localUtil.format(AV42TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV46TFBarNHdr = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNHdr", AV46TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV47TFBarNHdr_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNHdr_Sel", AV47TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV48TFBarSer = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarSer", AV48TFBarSer);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV49TFBarSer_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSer_Sel", AV49TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV50TFBarSerDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc", AV50TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV51TFBarSerDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarSerDsc_Sel", AV51TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV52TFBarColNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom", AV52TFBarColNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV53TFBarColNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNom_Sel", AV53TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV54TFBarColNum = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFBarColNum), 6, 0));
            AV55TFBarColNum_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV56TFBarTipCol = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFBarTipCol), 2, 0));
            AV57TFBarTipCol_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV58TFBarOrdLin = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarOrdLin), 4, 0));
            AV59TFBarOrdLin_To = (short)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV60TFMaqCodBis = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMaqCodBis", AV60TFMaqCodBis);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV61TFMaqCodBis_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFMaqCodBis_Sel", AV61TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV62TFFasCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFFasCod", AV62TFFasCod);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV63TFFasCod_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFFasCod_Sel", AV63TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV64TFFasDsc = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFFasDsc", AV64TFFasDsc);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV65TFFasDsc_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFFasDsc_Sel", AV65TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV66TFBarFasEst_SelsJson = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarFasEst_SelsJson", AV66TFBarFasEst_SelsJson);
            AV67TFBarFasEst_Sels.fromJSonString(AV66TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV68TFBarMtr = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarMtr", GXutil.ltrimstr( AV68TFBarMtr, 9, 2));
            AV69TFBarMtr_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarMtr_To", GXutil.ltrimstr( AV69TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV70TFBarKgm = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarKgm", GXutil.ltrimstr( AV70TFBarKgm, 9, 2));
            AV71TFBarKgm_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarKgm_To", GXutil.ltrimstr( AV71TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV72TFBarPie = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFBarPie), 6, 0));
            AV73TFBarPie_To = (int)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFBarPie_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV74TFBarFasCod = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFBarFasCod", AV74TFBarFasCod);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV75TFBarFasCod_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFBarFasCod_Sel", AV75TFBarFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCUM") == 0 )
         {
            AV76TFBarFecCum = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFBarFecCum", localUtil.format(AV76TFBarFecCum, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV80TFBarSit = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFBarSit), 2, 0));
            AV81TFBarSit_To = (byte)(GXutil.lval( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TFBarSit_To), 2, 0));
         }
         AV149GXV1 = (int)(AV149GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char15[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFCliNom_Sel)==0), AV31TFCliNom_Sel, GXv_char15) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char1 = GXv_char15[0] ;
      GXt_char20 = "" ;
      GXv_char14[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFPedidoCliente_Sel)==0), AV37TFPedidoCliente_Sel, GXv_char14) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char20 = GXv_char14[0] ;
      GXt_char21 = "" ;
      GXv_char5[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFBarNHdr_Sel)==0), AV47TFBarNHdr_Sel, GXv_char5) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char21 = GXv_char5[0] ;
      GXt_char22 = "" ;
      GXv_char4[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFBarSer_Sel)==0), AV49TFBarSer_Sel, GXv_char4) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char22 = GXv_char4[0] ;
      GXt_char23 = "" ;
      GXv_char3[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFBarSerDsc_Sel)==0), AV51TFBarSerDsc_Sel, GXv_char3) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char23 = GXv_char3[0] ;
      GXt_char24 = "" ;
      GXv_char2[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFBarColNom_Sel)==0), AV53TFBarColNom_Sel, GXv_char2) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char24 = GXv_char2[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFMaqCodBis_Sel)==0), AV61TFMaqCodBis_Sel, GXv_char26) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFFasCod_Sel)==0), AV63TFFasCod_Sel, GXv_char28) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFFasDsc_Sel)==0), AV65TFFasDsc_Sel, GXv_char30) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFBarFasCod_Sel)==0), AV75TFBarFasCod_Sel, GXv_char32) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char31 = GXv_char32[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char20+"|||"+GXt_char21+"|"+GXt_char22+"|"+GXt_char23+"|"+GXt_char24+"||||"+GXt_char25+"|"+GXt_char27+"|"+GXt_char29+"|"+((AV67TFBarFasEst_Sels.size()==0) ? "" : AV66TFBarFasEst_SelsJson)+"||||"+GXt_char31+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFCliNom)==0), AV30TFCliNom, GXv_char32) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFPedidoCliente)==0), AV36TFPedidoCliente, GXv_char30) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFBarNHdr)==0), AV46TFBarNHdr, GXv_char28) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFBarSer)==0), AV48TFBarSer, GXv_char26) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char24 = "" ;
      GXv_char15[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFBarSerDsc)==0), AV50TFBarSerDsc, GXv_char15) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char24 = GXv_char15[0] ;
      GXt_char23 = "" ;
      GXv_char14[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFBarColNom)==0), AV52TFBarColNom, GXv_char14) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char23 = GXv_char14[0] ;
      GXt_char22 = "" ;
      GXv_char5[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFMaqCodBis)==0), AV60TFMaqCodBis, GXv_char5) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char22 = GXv_char5[0] ;
      GXt_char21 = "" ;
      GXv_char4[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFFasCod)==0), AV62TFFasCod, GXv_char4) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char21 = GXv_char4[0] ;
      GXt_char20 = "" ;
      GXv_char3[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFFasDsc)==0), AV64TFFasDsc, GXv_char3) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char20 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFBarFasCod)==0), AV74TFBarFasCod, GXv_char2) ;
      cargasporsecciontradicional_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char31+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFBarFecCli)) ? "" : localUtil.dtoc( AV32TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char29+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFBarFecFpr)) ? "" : localUtil.dtoc( AV38TFBarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecGen)) ? "" : localUtil.dtoc( AV42TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char27+"|"+GXt_char25+"|"+GXt_char24+"|"+GXt_char23+"|"+((0==AV54TFBarColNum) ? "" : GXutil.str( AV54TFBarColNum, 6, 0))+"|"+((0==AV56TFBarTipCol) ? "" : GXutil.str( AV56TFBarTipCol, 2, 0))+"|"+((0==AV58TFBarOrdLin) ? "" : GXutil.str( AV58TFBarOrdLin, 4, 0))+"|"+GXt_char22+"|"+GXt_char21+"|"+GXt_char20+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFBarMtr)==0) ? "" : GXutil.str( AV68TFBarMtr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm)==0) ? "" : GXutil.str( AV70TFBarKgm, 9, 2))+"|"+((0==AV72TFBarPie) ? "" : GXutil.str( AV72TFBarPie, 6, 0))+"|"+GXt_char1+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76TFBarFecCum)) ? "" : localUtil.dtoc( AV76TFBarFecCum, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV80TFBarSit) ? "" : GXutil.str( AV80TFBarSit, 2, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||||||"+((0==AV55TFBarColNum_To) ? "" : GXutil.str( AV55TFBarColNum_To, 6, 0))+"|"+((0==AV57TFBarTipCol_To) ? "" : GXutil.str( AV57TFBarTipCol_To, 2, 0))+"|"+((0==AV59TFBarOrdLin_To) ? "" : GXutil.str( AV59TFBarOrdLin_To, 4, 0))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarMtr_To)==0) ? "" : GXutil.str( AV69TFBarMtr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarKgm_To)==0) ? "" : GXutil.str( AV71TFBarKgm_To, 9, 2))+"|"+((0==AV73TFBarPie_To) ? "" : GXutil.str( AV73TFBarPie_To, 6, 0))+"|||"+((0==AV81TFBarSit_To) ? "" : GXutil.str( AV81TFBarSit_To, 2, 0)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV26Session.getValue(AV148Pgmname+"GridState"), null, null);
      AV14GridState.setgxTv_SdtWWPGridState_Orderedby( AV16OrderedBy );
      AV14GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV17OrderedDsc );
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV19FilterFullText)==0), (short)(0), AV19FilterFullText, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLINOM", "", !(GXutil.strcmp("", AV30TFCliNom)==0), (short)(0), AV30TFCliNom, "", !(GXutil.strcmp("", AV31TFCliNom_Sel)==0), AV31TFCliNom_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFBarFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV32TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFPEDIDOCLIENTE", "", !(GXutil.strcmp("", AV36TFPedidoCliente)==0), (short)(0), AV36TFPedidoCliente, "", !(GXutil.strcmp("", AV37TFPedidoCliente_Sel)==0), AV37TFPedidoCliente_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARFECFPR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFBarFecFpr)), (short)(0), GXutil.trim( localUtil.dtoc( AV38TFBarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARFECGEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFBarFecGen)), (short)(0), GXutil.trim( localUtil.dtoc( AV42TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARNHDR", "", !(GXutil.strcmp("", AV46TFBarNHdr)==0), (short)(0), AV46TFBarNHdr, "", !(GXutil.strcmp("", AV47TFBarNHdr_Sel)==0), AV47TFBarNHdr_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARSER", "", !(GXutil.strcmp("", AV48TFBarSer)==0), (short)(0), AV48TFBarSer, "", !(GXutil.strcmp("", AV49TFBarSer_Sel)==0), AV49TFBarSer_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARSERDSC", "", !(GXutil.strcmp("", AV50TFBarSerDsc)==0), (short)(0), AV50TFBarSerDsc, "", !(GXutil.strcmp("", AV51TFBarSerDsc_Sel)==0), AV51TFBarSerDsc_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV52TFBarColNom)==0), (short)(0), AV52TFBarColNom, "", !(GXutil.strcmp("", AV53TFBarColNom_Sel)==0), AV53TFBarColNom_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARCOLNUM", "", !((0==AV54TFBarColNum)&&(0==AV55TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV55TFBarColNum_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARTIPCOL", "", !((0==AV56TFBarTipCol)&&(0==AV57TFBarTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFBarTipCol, 2, 0)), GXutil.trim( GXutil.str( AV57TFBarTipCol_To, 2, 0))) ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARORDLIN", "", !((0==AV58TFBarOrdLin)&&(0==AV59TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV59TFBarOrdLin_To, 4, 0))) ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFMAQCODBIS", "", !(GXutil.strcmp("", AV60TFMaqCodBis)==0), (short)(0), AV60TFMaqCodBis, "", !(GXutil.strcmp("", AV61TFMaqCodBis_Sel)==0), AV61TFMaqCodBis_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFASCOD", "", !(GXutil.strcmp("", AV62TFFasCod)==0), (short)(0), AV62TFFasCod, "", !(GXutil.strcmp("", AV63TFFasCod_Sel)==0), AV63TFFasCod_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFASDSC", "", !(GXutil.strcmp("", AV64TFFasDsc)==0), (short)(0), AV64TFFasDsc, "", !(GXutil.strcmp("", AV65TFFasDsc_Sel)==0), AV65TFFasDsc_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARFASEST_SEL", "", !(AV67TFBarFasEst_Sels.size()==0), (short)(0), AV67TFBarFasEst_Sels.toJSonString(false), "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV68TFBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV69TFBarMtr_To, 9, 2))) ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV70TFBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV71TFBarKgm_To, 9, 2))) ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARPIE", "", !((0==AV72TFBarPie)&&(0==AV73TFBarPie_To)), (short)(0), GXutil.trim( GXutil.str( AV72TFBarPie, 6, 0)), GXutil.trim( GXutil.str( AV73TFBarPie_To, 6, 0))) ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARFASCOD", "", !(GXutil.strcmp("", AV74TFBarFasCod)==0), (short)(0), AV74TFBarFasCod, "", !(GXutil.strcmp("", AV75TFBarFasCod_Sel)==0), AV75TFBarFasCod_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARFECCUM", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76TFBarFecCum)), (short)(0), GXutil.trim( localUtil.dtoc( AV76TFBarFecCum, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFBARSIT", "", !((0==AV80TFBarSit)&&(0==AV81TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV80TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV81TFBarSit_To, 2, 0))) ;
      AV14GridState = GXv_SdtWWPGridState33[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV94MaqcodInout)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCODINOUT" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV94MaqcodInout );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV93TipoControl)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPOCONTROL" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV93TipoControl );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV95FasesToJson)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FASESTOJSON" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV95FasesToJson );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV6Barcod) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6Barcod, 8, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV7Barcodreo) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV7Barcodreo, 1, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8Barcodpar)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8Barcodpar );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV148Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV12TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV148Pgmname );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "BARFAS" );
      AV26Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_21_1FB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV27ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_26_1FB2( true) ;
      }
      else
      {
         wb_table2_26_1FB2( false) ;
      }
      return  ;
   }

   public void wb_table2_26_1FB2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_1FB2e( true) ;
      }
      else
      {
         wb_table1_21_1FB2e( false) ;
      }
   }

   public void wb_table2_26_1FB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV19FilterFullText, GXutil.rtrim( localUtil.format( AV19FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_CargasporSeccionTradicional_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_26_1FB2e( true) ;
      }
      else
      {
         wb_table2_26_1FB2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV94MaqcodInout = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94MaqcodInout", AV94MaqcodInout);
      AV93TipoControl = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TipoControl", AV93TipoControl);
      AV95FasesToJson = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95FasesToJson", AV95FasesToJson);
      AV6Barcod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
      AV7Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
      AV8Barcodpar = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Barcodpar", AV8Barcodpar);
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
      pa1FB2( ) ;
      ws1FB2( ) ;
      we1FB2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV94MaqcodInout = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV93TipoControl = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV95FasesToJson = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV6Barcod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV7Barcodreo = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV8Barcodpar = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1FB2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "cargasporsecciontradicional_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1FB2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV94MaqcodInout = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94MaqcodInout", AV94MaqcodInout);
         AV93TipoControl = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TipoControl", AV93TipoControl);
         AV95FasesToJson = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95FasesToJson", AV95FasesToJson);
         AV6Barcod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
         AV7Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
         AV8Barcodpar = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Barcodpar", AV8Barcodpar);
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV94MaqcodInout = httpContext.cgiGet( sPrefix+"wcpOAV94MaqcodInout") ;
      wcpOAV93TipoControl = httpContext.cgiGet( sPrefix+"wcpOAV93TipoControl") ;
      wcpOAV95FasesToJson = httpContext.cgiGet( sPrefix+"wcpOAV95FasesToJson") ;
      wcpOAV6Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV8Barcodpar") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV94MaqcodInout, wcpOAV94MaqcodInout) != 0 ) || ( GXutil.strcmp(AV93TipoControl, wcpOAV93TipoControl) != 0 ) || ( GXutil.strcmp(AV95FasesToJson, wcpOAV95FasesToJson) != 0 ) || ( AV6Barcod != wcpOAV6Barcod ) || ( AV7Barcodreo != wcpOAV7Barcodreo ) || ( GXutil.strcmp(AV8Barcodpar, wcpOAV8Barcodpar) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV94MaqcodInout = AV94MaqcodInout ;
      wcpOAV93TipoControl = AV93TipoControl ;
      wcpOAV95FasesToJson = AV95FasesToJson ;
      wcpOAV6Barcod = AV6Barcod ;
      wcpOAV7Barcodreo = AV7Barcodreo ;
      wcpOAV8Barcodpar = AV8Barcodpar ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV94MaqcodInout = httpContext.cgiGet( sPrefix+"AV94MaqcodInout_CTRL") ;
      if ( GXutil.len( sCtrlAV94MaqcodInout) > 0 )
      {
         AV94MaqcodInout = httpContext.cgiGet( sCtrlAV94MaqcodInout) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94MaqcodInout", AV94MaqcodInout);
      }
      else
      {
         AV94MaqcodInout = httpContext.cgiGet( sPrefix+"AV94MaqcodInout_PARM") ;
      }
      sCtrlAV93TipoControl = httpContext.cgiGet( sPrefix+"AV93TipoControl_CTRL") ;
      if ( GXutil.len( sCtrlAV93TipoControl) > 0 )
      {
         AV93TipoControl = httpContext.cgiGet( sCtrlAV93TipoControl) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TipoControl", AV93TipoControl);
      }
      else
      {
         AV93TipoControl = httpContext.cgiGet( sPrefix+"AV93TipoControl_PARM") ;
      }
      sCtrlAV95FasesToJson = httpContext.cgiGet( sPrefix+"AV95FasesToJson_CTRL") ;
      if ( GXutil.len( sCtrlAV95FasesToJson) > 0 )
      {
         AV95FasesToJson = httpContext.cgiGet( sCtrlAV95FasesToJson) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95FasesToJson", AV95FasesToJson);
      }
      else
      {
         AV95FasesToJson = httpContext.cgiGet( sPrefix+"AV95FasesToJson_PARM") ;
      }
      sCtrlAV6Barcod = httpContext.cgiGet( sPrefix+"AV6Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV6Barcod) > 0 )
      {
         AV6Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
      }
      else
      {
         AV6Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7Barcodreo = httpContext.cgiGet( sPrefix+"AV7Barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV7Barcodreo) > 0 )
      {
         AV7Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7Barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
      }
      else
      {
         AV7Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7Barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8Barcodpar = httpContext.cgiGet( sPrefix+"AV8Barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV8Barcodpar) > 0 )
      {
         AV8Barcodpar = httpContext.cgiGet( sCtrlAV8Barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Barcodpar", AV8Barcodpar);
      }
      else
      {
         AV8Barcodpar = httpContext.cgiGet( sPrefix+"AV8Barcodpar_PARM") ;
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
      pa1FB2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1FB2( ) ;
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
      ws1FB2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV94MaqcodInout_PARM", GXutil.rtrim( AV94MaqcodInout));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV94MaqcodInout)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV94MaqcodInout_CTRL", GXutil.rtrim( sCtrlAV94MaqcodInout));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV93TipoControl_PARM", GXutil.rtrim( AV93TipoControl));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV93TipoControl)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV93TipoControl_CTRL", GXutil.rtrim( sCtrlAV93TipoControl));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV95FasesToJson_PARM", AV95FasesToJson);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV95FasesToJson)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV95FasesToJson_CTRL", GXutil.rtrim( sCtrlAV95FasesToJson));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV6Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Barcod_CTRL", GXutil.rtrim( sCtrlAV6Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV7Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Barcodreo_CTRL", GXutil.rtrim( sCtrlAV7Barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Barcodpar_PARM", GXutil.rtrim( AV8Barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Barcodpar_CTRL", GXutil.rtrim( sCtrlAV8Barcodpar));
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
      we1FB2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211685756", true, true);
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
      httpContext.AddJavascriptSource("cargasporsecciontradicional_wc.js", "?20268211685757", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_362( )
   {
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_36_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_36_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_36_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_36_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_36_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_36_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_36_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_36_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_36_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_36_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_36_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_36_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_36_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_36_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_36_idx ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST_"+sGXsfl_36_idx );
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_36_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_36_idx ;
      edtBarPie_Internalname = sPrefix+"BARPIE_"+sGXsfl_36_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_36_idx ;
      edtBarFecCum_Internalname = sPrefix+"BARFECCUM_"+sGXsfl_36_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_36_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_36_idx ;
   }

   public void subsflControlProps_fel_362( )
   {
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_36_fel_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_36_fel_idx ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE_"+sGXsfl_36_fel_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_36_fel_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_36_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_36_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_36_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_36_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_36_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_36_fel_idx ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL_"+sGXsfl_36_fel_idx ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN_"+sGXsfl_36_fel_idx ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS_"+sGXsfl_36_fel_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_36_fel_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_36_fel_idx ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST_"+sGXsfl_36_fel_idx );
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_36_fel_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_36_fel_idx ;
      edtBarPie_Internalname = sPrefix+"BARPIE_"+sGXsfl_36_fel_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_36_fel_idx ;
      edtBarFecCum_Internalname = sPrefix+"BARFECCUM_"+sGXsfl_36_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_36_fel_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_36_fel_idx ;
   }

   public void sendrow_362( )
   {
      subsflControlProps_362( ) ;
      wb1FB0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_36_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_36_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_36_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedidoClie_Internalname,GXutil.rtrim( A13878PedidoClie),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedidoClie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPedidoClie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecFpr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecFpr_Internalname,localUtil.format(A158BarFecFpr, "99/99/99"),localUtil.format( A158BarFecFpr, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecFpr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFecFpr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFecGen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarTipCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarOrdLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCodBis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCodBis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFasDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbBarFasEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbBarFasEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "BARFASEST_" + sGXsfl_36_idx ;
            cmbBarFasEst.setName( GXCCtl );
            cmbBarFasEst.setWebtags( "" );
            cmbBarFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
            cmbBarFasEst.addItem("1", httpContext.getMessage( "En Proceso", ""), (short)(0));
            cmbBarFasEst.addItem("2", httpContext.getMessage( "Finalizada", ""), (short)(0));
            if ( cmbBarFasEst.getItemCount() > 0 )
            {
               A153BarFasEst = (byte)(GXutil.lval( cmbBarFasEst.getValidValue(GXutil.trim( GXutil.str( A153BarFasEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBarFasEst,cmbBarFasEst.getInternalname(),GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)),Integer.valueOf(1),cmbBarFasEst.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbBarFasEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbBarFasEst.setValue( GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbBarFasEst.getInternalname(), "Values", cmbBarFasEst.ToJavascriptSource(), !bGXsfl_36_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod_Internalname,GXutil.rtrim( A151BarFasCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCum_Internalname,localUtil.format(A156BarFecCum, "99/99/99"),localUtil.format( A156BarFecCum, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFecCum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1FB2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      /* End function sendrow_362 */
   }

   public void startgridcontrol36( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"36\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Disposicion Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedidoClie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecFpr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Fin Previsto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecGen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Generacion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero del Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipCol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCodBis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion de Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbBarFasEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilogramos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase Ult", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ult", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13878PedidoClie));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedidoClie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A158BarFecFpr, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecFpr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecGen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipCol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCodBis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbBarFasEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A151BarFasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A156BarFecCum, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
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
      bttBtnexportar_Internalname = sPrefix+"BTNEXPORTAR" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI" ;
      edtPedidoClie_Internalname = sPrefix+"PEDIDOCLIE" ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR" ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarTipCol_Internalname = sPrefix+"BARTIPCOL" ;
      edtBarOrdLin_Internalname = sPrefix+"BARORDLIN" ;
      edtMaqCodBis_Internalname = sPrefix+"MAQCODBIS" ;
      edtFasCod_Internalname = sPrefix+"FASCOD" ;
      edtFasDsc_Internalname = sPrefix+"FASDSC" ;
      cmbBarFasEst.setInternalname( sPrefix+"BARFASEST" );
      edtBarMtr_Internalname = sPrefix+"BARMTR" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtBarPie_Internalname = sPrefix+"BARPIE" ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD" ;
      edtBarFecCum_Internalname = sPrefix+"BARFECCUM" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfeccliauxdate_Internalname = sPrefix+"vDDO_BARFECCLIAUXDATE" ;
      divDdo_barfeccliauxdates_Internalname = sPrefix+"DDO_BARFECCLIAUXDATES" ;
      edtavDdo_barfecfprauxdate_Internalname = sPrefix+"vDDO_BARFECFPRAUXDATE" ;
      divDdo_barfecfprauxdates_Internalname = sPrefix+"DDO_BARFECFPRAUXDATES" ;
      edtavDdo_barfecgenauxdate_Internalname = sPrefix+"vDDO_BARFECGENAUXDATE" ;
      divDdo_barfecgenauxdates_Internalname = sPrefix+"DDO_BARFECGENAUXDATES" ;
      edtavDdo_barfeccumauxdate_Internalname = sPrefix+"vDDO_BARFECCUMAUXDATE" ;
      divDdo_barfeccumauxdates_Internalname = sPrefix+"DDO_BARFECCUMAUXDATES" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarFecCum_Jsonclick = "" ;
      edtBarFasCod_Jsonclick = "" ;
      edtBarPie_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarMtr_Jsonclick = "" ;
      cmbBarFasEst.setJsonclick( "" );
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtMaqCodBis_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarFecFpr_Jsonclick = "" ;
      edtPedidoClie_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtBarSit_Visible = -1 ;
      edtBarFecCum_Visible = -1 ;
      edtBarFasCod_Visible = -1 ;
      edtBarPie_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtBarMtr_Visible = -1 ;
      cmbBarFasEst.setVisible( -1 );
      edtFasDsc_Visible = -1 ;
      edtFasCod_Visible = -1 ;
      edtMaqCodBis_Visible = -1 ;
      edtBarOrdLin_Visible = -1 ;
      edtBarTipCol_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtBarFecGen_Visible = -1 ;
      edtBarFecFpr_Visible = -1 ;
      edtPedidoClie_Visible = -1 ;
      edtBarFecCli_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfeccumauxdate_Jsonclick = "" ;
      edtavDdo_barfecgenauxdate_Jsonclick = "" ;
      edtavDdo_barfecfprauxdate_Jsonclick = "" ;
      edtavDdo_barfeccliauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "CargasporSeccionTradicional_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||||0:Pendiente,1:En Proceso,2:Finalizada||||||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||||||T||||||" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic||||Dynamic|Dynamic|Dynamic|FixedValues||||Dynamic||" ;
      Ddo_grid_Includedatalist = "T||T|||T|T|T|T||||T|T|T|T||||T||" ;
      Ddo_grid_Filterisrange = "|||||||||T|T|T|||||T|T|T|||T" ;
      Ddo_grid_Filtertype = "Character|Date|Character|Date|Date|Character|Character|Character|Character|Numeric|Numeric|Numeric|Character|Character|Character||Numeric|Numeric|Numeric|Character|Date|Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T||T|T|T|T|T|T|T|T|T|T||||||T" ;
      Ddo_grid_Columnssortvalues = "4|5||6|7||8|9|10|11|12|13|3|14|15|2||||||16" ;
      Ddo_grid_Columnids = "0:CliNom|1:BarFecCli|2:PedidoCliente|3:BarFecFpr|4:BarFecGen|5:BarNHdr|6:BarSer|7:BarSerDsc|8:BarColNom|9:BarColNum|10:BarTipCol|11:BarOrdLin|12:MaqCodBis|13:FasCod|14:FasDsc|15:BarFasEst|16:BarMtr|17:BarKgm|18:BarPie|19:BarFasCod|20:BarFecCum|21:BarSit" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      subGrid_Rows = 50 ;
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
      GXCCtl = "BARFASEST_" + sGXsfl_36_idx ;
      cmbBarFasEst.setName( GXCCtl );
      cmbBarFasEst.setWebtags( "" );
      cmbBarFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbBarFasEst.addItem("1", httpContext.getMessage( "En Proceso", ""), (short)(0));
      cmbBarFasEst.addItem("2", httpContext.getMessage( "Finalizada", ""), (short)(0));
      if ( cmbBarFasEst.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96FasesColeccion',fld:'vFASESCOLECCION',pic:''},{av:'sPrefix'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV36TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV37TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV38TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV42TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV46TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV47TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV54TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV56TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV57TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV58TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV59TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV61TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV62TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV63TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV68TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV70TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV71TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV73TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV75TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV76TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV80TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV81TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94MaqcodInout',fld:'vMAQCODINOUT',pic:''},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'AV95FasesToJson',fld:'vFASESTOJSON',pic:''},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV100FlagAnt',fld:'vFLAGANT',pic:'ZZZ9',hsh:true},{av:'AV101Linea',fld:'vLINEA',pic:'ZZZ9',hsh:true},{av:'AV102EstS',fld:'vESTS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFecCum_Visible',ctrl:'BARFECCUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e121FB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94MaqcodInout',fld:'vMAQCODINOUT',pic:''},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV96FasesColeccion',fld:'vFASESCOLECCION',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV36TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV37TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV38TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV42TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV46TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV47TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV54TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV56TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV57TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV58TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV59TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV61TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV62TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV63TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV68TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV70TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV71TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV73TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV75TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV76TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV80TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV81TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'AV95FasesToJson',fld:'vFASESTOJSON',pic:''},{av:'AV100FlagAnt',fld:'vFLAGANT',pic:'ZZZ9',hsh:true},{av:'AV101Linea',fld:'vLINEA',pic:'ZZZ9',hsh:true},{av:'AV102EstS',fld:'vESTS',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV80TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV81TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV76TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV74TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV75TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV72TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV73TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV70TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV71TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarFasEst_SelsJson',fld:'vTFBARFASEST_SELSJSON',pic:''},{av:'AV67TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV62TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV63TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV60TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV61TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV58TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV59TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV56TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV57TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV54TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV50TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV48TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV46TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV47TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV42TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV38TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV36TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV37TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV32TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171FB2',iparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV100FlagAnt',fld:'vFLAGANT',pic:'ZZZ9',hsh:true},{av:'AV101Linea',fld:'vLINEA',pic:'ZZZ9',hsh:true},{av:'AV102EstS',fld:'vESTS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV101Linea',fld:'vLINEA',pic:'ZZZ9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV102EstS',fld:'vESTS',pic:'ZZZ9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV100FlagAnt',fld:'vFLAGANT',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e131FB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94MaqcodInout',fld:'vMAQCODINOUT',pic:''},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV96FasesColeccion',fld:'vFASESCOLECCION',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV36TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV37TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV38TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV42TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV46TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV47TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV54TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV56TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV57TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV58TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV59TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV61TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV62TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV63TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV68TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV70TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV71TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV73TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV75TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV76TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV80TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV81TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'AV95FasesToJson',fld:'vFASESTOJSON',pic:''},{av:'AV100FlagAnt',fld:'vFLAGANT',pic:'ZZZ9',hsh:true},{av:'AV101Linea',fld:'vLINEA',pic:'ZZZ9',hsh:true},{av:'AV102EstS',fld:'vESTS',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFecCum_Visible',ctrl:'BARFECCUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111FB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94MaqcodInout',fld:'vMAQCODINOUT',pic:''},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV96FasesColeccion',fld:'vFASESCOLECCION',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV36TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV37TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV38TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV42TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV46TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV47TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV54TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV56TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV57TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV58TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV59TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV61TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV62TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV63TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV68TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV70TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV71TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV73TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV75TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV76TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV80TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV81TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'AV95FasesToJson',fld:'vFASESTOJSON',pic:''},{av:'AV100FlagAnt',fld:'vFLAGANT',pic:'ZZZ9',hsh:true},{av:'AV101Linea',fld:'vLINEA',pic:'ZZZ9',hsh:true},{av:'AV102EstS',fld:'vESTS',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV66TFBarFasEst_SelsJson',fld:'vTFBARFASEST_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV36TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV37TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV38TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV42TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV46TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV47TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV54TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV56TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV57TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV58TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV59TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV61TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV62TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV63TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV68TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV70TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV71TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV73TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV75TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV76TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV80TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV81TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV66TFBarFasEst_SelsJson',fld:'vTFBARFASEST_SELSJSON',pic:''},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFecCum_Visible',ctrl:'BARFECCUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORTAR'","{handler:'e141FB2',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94MaqcodInout',fld:'vMAQCODINOUT',pic:''},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'AV95FasesToJson',fld:'vFASESTOJSON',pic:''}]");
      setEventMetadata("'DOEXPORTAR'",",oparms:[{av:'AV95FasesToJson',fld:'vFASESTOJSON',pic:''},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'AV94MaqcodInout',fld:'vMAQCODINOUT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96FasesColeccion',fld:'vFASESCOLECCION',pic:''},{av:'AV100FlagAnt',fld:'vFLAGANT',pic:'ZZZ9',hsh:true},{av:'AV101Linea',fld:'vLINEA',pic:'ZZZ9',hsh:true},{av:'AV102EstS',fld:'vESTS',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV36TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV37TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV38TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV42TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV46TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV47TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV54TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV56TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV57TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV58TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV59TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV61TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV62TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV63TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV68TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV70TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV71TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV73TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV75TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV76TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV80TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV81TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94MaqcodInout',fld:'vMAQCODINOUT',pic:''},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'AV95FasesToJson',fld:'vFASESTOJSON',pic:''},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFecCum_Visible',ctrl:'BARFECCUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96FasesColeccion',fld:'vFASESCOLECCION',pic:''},{av:'AV100FlagAnt',fld:'vFLAGANT',pic:'ZZZ9',hsh:true},{av:'AV101Linea',fld:'vLINEA',pic:'ZZZ9',hsh:true},{av:'AV102EstS',fld:'vESTS',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV36TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV37TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV38TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV42TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV46TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV47TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV54TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV56TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV57TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV58TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV59TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV61TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV62TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV63TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV68TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV70TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV71TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV73TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV75TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV76TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV80TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV81TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94MaqcodInout',fld:'vMAQCODINOUT',pic:''},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'AV95FasesToJson',fld:'vFASESTOJSON',pic:''},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFecCum_Visible',ctrl:'BARFECCUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96FasesColeccion',fld:'vFASESCOLECCION',pic:''},{av:'AV100FlagAnt',fld:'vFLAGANT',pic:'ZZZ9',hsh:true},{av:'AV101Linea',fld:'vLINEA',pic:'ZZZ9',hsh:true},{av:'AV102EstS',fld:'vESTS',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV36TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV37TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV38TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV42TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV46TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV47TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV54TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV56TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV57TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV58TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV59TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV61TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV62TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV63TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV68TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV70TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV71TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV73TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV75TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV76TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV80TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV81TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94MaqcodInout',fld:'vMAQCODINOUT',pic:''},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'AV95FasesToJson',fld:'vFASESTOJSON',pic:''},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFecCum_Visible',ctrl:'BARFECCUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV96FasesColeccion',fld:'vFASESCOLECCION',pic:''},{av:'AV100FlagAnt',fld:'vFLAGANT',pic:'ZZZ9',hsh:true},{av:'AV101Linea',fld:'vLINEA',pic:'ZZZ9',hsh:true},{av:'AV102EstS',fld:'vESTS',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV32TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV36TFPedidoCliente',fld:'vTFPEDIDOCLIENTE',pic:''},{av:'AV37TFPedidoCliente_Sel',fld:'vTFPEDIDOCLIENTE_SEL',pic:''},{av:'AV38TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV42TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV46TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV47TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV51TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV54TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV56TFBarTipCol',fld:'vTFBARTIPCOL',pic:'Z9'},{av:'AV57TFBarTipCol_To',fld:'vTFBARTIPCOL_TO',pic:'Z9'},{av:'AV58TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV59TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV61TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV62TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV63TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV64TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV65TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV67TFBarFasEst_Sels',fld:'vTFBARFASEST_SELS',pic:''},{av:'AV68TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV69TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV70TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV71TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV72TFBarPie',fld:'vTFBARPIE',pic:'ZZZZZ9'},{av:'AV73TFBarPie_To',fld:'vTFBARPIE_TO',pic:'ZZZZZ9'},{av:'AV74TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV75TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV76TFBarFecCum',fld:'vTFBARFECCUM',pic:''},{av:'AV80TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV81TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94MaqcodInout',fld:'vMAQCODINOUT',pic:''},{av:'AV93TipoControl',fld:'vTIPOCONTROL',pic:''},{av:'AV95FasesToJson',fld:'vFASESTOJSON',pic:''},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtPedidoClie_Visible',ctrl:'PEDIDOCLIE',prop:'Visible'},{av:'edtBarFecFpr_Visible',ctrl:'BARFECFPR',prop:'Visible'},{av:'edtBarFecGen_Visible',ctrl:'BARFECGEN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarTipCol_Visible',ctrl:'BARTIPCOL',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtMaqCodBis_Visible',ctrl:'MAQCODBIS',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'cmbBarFasEst'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarPie_Visible',ctrl:'BARPIE',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'edtBarFecCum_Visible',ctrl:'BARFECCUM',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_PEDIDOCLIE","{handler:'valid_Pedidoclie',iparms:[]");
      setEventMetadata("VALID_PEDIDOCLIE",",oparms:[]}");
      setEventMetadata("VALID_BARNHDR","{handler:'valid_Barnhdr',iparms:[]");
      setEventMetadata("VALID_BARNHDR",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARTIPCOL","{handler:'valid_Bartipcol',iparms:[]");
      setEventMetadata("VALID_BARTIPCOL",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_MAQCODBIS","{handler:'valid_Maqcodbis',iparms:[]");
      setEventMetadata("VALID_MAQCODBIS",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_FASDSC","{handler:'valid_Fasdsc',iparms:[]");
      setEventMetadata("VALID_FASDSC",",oparms:[]}");
      setEventMetadata("VALID_BARFASEST","{handler:'valid_Barfasest',iparms:[]");
      setEventMetadata("VALID_BARFASEST",",oparms:[]}");
      setEventMetadata("VALID_BARMTR","{handler:'valid_Barmtr',iparms:[]");
      setEventMetadata("VALID_BARMTR",",oparms:[]}");
      setEventMetadata("VALID_BARKGM","{handler:'valid_Barkgm',iparms:[]");
      setEventMetadata("VALID_BARKGM",",oparms:[]}");
      setEventMetadata("VALID_BARPIE","{handler:'valid_Barpie',iparms:[]");
      setEventMetadata("VALID_BARPIE",",oparms:[]}");
      setEventMetadata("VALID_BARFASCOD","{handler:'valid_Barfascod',iparms:[]");
      setEventMetadata("VALID_BARFASCOD",",oparms:[]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV94MaqcodInout = "" ;
      wcpOAV93TipoControl = "" ;
      wcpOAV95FasesToJson = "" ;
      wcpOAV8Barcodpar = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV94MaqcodInout = "" ;
      AV93TipoControl = "" ;
      AV95FasesToJson = "" ;
      AV8Barcodpar = "" ;
      AV96FasesColeccion = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV19FilterFullText = "" ;
      AV30TFCliNom = "" ;
      AV31TFCliNom_Sel = "" ;
      AV32TFBarFecCli = GXutil.nullDate() ;
      AV36TFPedidoCliente = "" ;
      AV37TFPedidoCliente_Sel = "" ;
      AV38TFBarFecFpr = GXutil.nullDate() ;
      AV42TFBarFecGen = GXutil.nullDate() ;
      AV46TFBarNHdr = "" ;
      AV47TFBarNHdr_Sel = "" ;
      AV48TFBarSer = "" ;
      AV49TFBarSer_Sel = "" ;
      AV50TFBarSerDsc = "" ;
      AV51TFBarSerDsc_Sel = "" ;
      AV52TFBarColNom = "" ;
      AV53TFBarColNom_Sel = "" ;
      AV60TFMaqCodBis = "" ;
      AV61TFMaqCodBis_Sel = "" ;
      AV62TFFasCod = "" ;
      AV63TFFasCod_Sel = "" ;
      AV64TFFasDsc = "" ;
      AV65TFFasDsc_Sel = "" ;
      AV67TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV68TFBarMtr = DecimalUtil.ZERO ;
      AV69TFBarMtr_To = DecimalUtil.ZERO ;
      AV70TFBarKgm = DecimalUtil.ZERO ;
      AV71TFBarKgm_To = DecimalUtil.ZERO ;
      AV74TFBarFasCod = "" ;
      AV75TFBarFasCod_Sel = "" ;
      AV76TFBarFecCum = GXutil.nullDate() ;
      AV148Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV27ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV82DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A130BarCodPar = "" ;
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV66TFBarFasEst_SelsJson = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A365DisDes = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexportar_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV34DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      AV40DDO_BarFecFprAuxDate = GXutil.nullDate() ;
      AV44DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV78DDO_BarFecCumAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV108Cargasporsecciontradicional_wcds_1_filterfulltext = "" ;
      AV109Cargasporsecciontradicional_wcds_2_tfclinom = "" ;
      AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel = "" ;
      AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli = GXutil.nullDate() ;
      AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente = "" ;
      AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel = "" ;
      AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr = GXutil.nullDate() ;
      AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen = GXutil.nullDate() ;
      AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr = "" ;
      AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel = "" ;
      AV118Cargasporsecciontradicional_wcds_11_tfbarser = "" ;
      AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel = "" ;
      AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc = "" ;
      AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel = "" ;
      AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom = "" ;
      AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel = "" ;
      AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis = "" ;
      AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel = "" ;
      AV132Cargasporsecciontradicional_wcds_25_tffascod = "" ;
      AV133Cargasporsecciontradicional_wcds_26_tffascod_sel = "" ;
      AV134Cargasporsecciontradicional_wcds_27_tffasdsc = "" ;
      AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel = "" ;
      AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV137Cargasporsecciontradicional_wcds_30_tfbarmtr = DecimalUtil.ZERO ;
      AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to = DecimalUtil.ZERO ;
      AV139Cargasporsecciontradicional_wcds_32_tfbarkgm = DecimalUtil.ZERO ;
      AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to = DecimalUtil.ZERO ;
      AV143Cargasporsecciontradicional_wcds_36_tfbarfascod = "" ;
      AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel = "" ;
      AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum = GXutil.nullDate() ;
      A279CliNom = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A13878PedidoClie = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A603MaqCodBis = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A156BarFecCum = GXutil.nullDate() ;
      A396EmprCod = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV108Cargasporsecciontradicional_wcds_1_filterfulltext = "" ;
      lV143Cargasporsecciontradicional_wcds_36_tfbarfascod = "" ;
      lV94MaqcodInout = "" ;
      lV109Cargasporsecciontradicional_wcds_2_tfclinom = "" ;
      lV116Cargasporsecciontradicional_wcds_9_tfbarnhdr = "" ;
      lV118Cargasporsecciontradicional_wcds_11_tfbarser = "" ;
      lV120Cargasporsecciontradicional_wcds_13_tfbarserdsc = "" ;
      lV122Cargasporsecciontradicional_wcds_15_tfbarcolnom = "" ;
      lV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis = "" ;
      lV132Cargasporsecciontradicional_wcds_25_tffascod = "" ;
      lV134Cargasporsecciontradicional_wcds_27_tffasdsc = "" ;
      H01FB9_A758ProCod = new String[] {""} ;
      H01FB9_A252CliCod = new int[1] ;
      H01FB9_n252CliCod = new boolean[] {false} ;
      H01FB9_A213BarSit = new byte[1] ;
      H01FB9_A153BarFasEst = new byte[1] ;
      H01FB9_A460FasDsc = new String[] {""} ;
      H01FB9_A457FasCod = new String[] {""} ;
      H01FB9_A603MaqCodBis = new String[] {""} ;
      H01FB9_A194BarOrdLin = new short[1] ;
      H01FB9_A218BarTipCol = new byte[1] ;
      H01FB9_A136BarColNum = new int[1] ;
      H01FB9_A135BarColNom = new String[] {""} ;
      H01FB9_A1652BarSerDsc = new String[] {""} ;
      H01FB9_A212BarSer = new String[] {""} ;
      H01FB9_A13696BarNHdr = new String[] {""} ;
      H01FB9_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01FB9_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H01FB9_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01FB9_A279CliNom = new String[] {""} ;
      H01FB9_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      H01FB9_n156BarFecCum = new boolean[] {false} ;
      H01FB9_A151BarFasCod = new String[] {""} ;
      H01FB9_n151BarFasCod = new boolean[] {false} ;
      H01FB9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FB9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FB9_A129BarCod = new int[1] ;
      H01FB9_A132BarCodReo = new byte[1] ;
      H01FB9_A130BarCodPar = new String[] {""} ;
      H01FB9_A143BarDisNum = new String[] {""} ;
      H01FB9_A4812BarEncCli = new String[] {""} ;
      H01FB9_A396EmprCod = new String[] {""} ;
      H01FB9_A199BarPie1 = new short[1] ;
      H01FB9_A365DisDes = new String[] {""} ;
      H01FB9_A898BarPieNDes = new int[1] ;
      AV105Station = "" ;
      AV106Emprnom = "" ;
      AV107Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26Session = httpContext.getWebSession();
      AV22ColumnsSelectorXML = "" ;
      GXv_int11 = new short[1] ;
      GXv_int9 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int13 = new short[1] ;
      GXv_int10 = new byte[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV28ManageFiltersXml = "" ;
      AV20ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV23UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector17 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19 = new GXBaseCollection[1] ;
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char31 = "" ;
      GXv_char32 = new String[1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState33 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV94MaqcodInout = "" ;
      sCtrlAV93TipoControl = "" ;
      sCtrlAV95FasesToJson = "" ;
      sCtrlAV6Barcod = "" ;
      sCtrlAV7Barcodreo = "" ;
      sCtrlAV8Barcodpar = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cargasporsecciontradicional_wc__default(),
         new Object[] {
             new Object[] {
            H01FB9_A758ProCod, H01FB9_A252CliCod, H01FB9_n252CliCod, H01FB9_A213BarSit, H01FB9_A153BarFasEst, H01FB9_A460FasDsc, H01FB9_A457FasCod, H01FB9_A603MaqCodBis, H01FB9_A194BarOrdLin, H01FB9_A218BarTipCol,
            H01FB9_A136BarColNum, H01FB9_A135BarColNom, H01FB9_A1652BarSerDsc, H01FB9_A212BarSer, H01FB9_A13696BarNHdr, H01FB9_A159BarFecGen, H01FB9_A158BarFecFpr, H01FB9_A155BarFecCli, H01FB9_A279CliNom, H01FB9_A156BarFecCum,
            H01FB9_n156BarFecCum, H01FB9_A151BarFasCod, H01FB9_n151BarFasCod, H01FB9_A166BarKgm, H01FB9_A184BarMtr, H01FB9_A129BarCod, H01FB9_A132BarCodReo, H01FB9_A130BarCodPar, H01FB9_A143BarDisNum, H01FB9_A4812BarEncCli,
            H01FB9_A396EmprCod, H01FB9_A199BarPie1, H01FB9_A365DisDes, H01FB9_A898BarPieNDes
            }
         }
      );
      AV148Pgmname = "CargasporSeccionTradicional_WC" ;
      /* GeneXus formulas. */
      AV148Pgmname = "CargasporSeccionTradicional_WC" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV7Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV7Barcodreo ;
   private byte AV29ManageFiltersExecutionStep ;
   private byte AV56TFBarTipCol ;
   private byte AV57TFBarTipCol_To ;
   private byte AV80TFBarSit ;
   private byte AV81TFBarSit_To ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV126Cargasporsecciontradicional_wcds_19_tfbartipcol ;
   private byte AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to ;
   private byte AV146Cargasporsecciontradicional_wcds_39_tfbarsit ;
   private byte AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to ;
   private byte A218BarTipCol ;
   private byte A153BarFasEst ;
   private byte A213BarSit ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int12[] ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV58TFBarOrdLin ;
   private short AV59TFBarOrdLin_To ;
   private short AV16OrderedBy ;
   private short AV100FlagAnt ;
   private short AV101Linea ;
   private short AV102EstS ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV128Cargasporsecciontradicional_wcds_21_tfbarordlin ;
   private short AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV99BarOrdAnt ;
   private short GXv_int11[] ;
   private short GXv_int13[] ;
   private int wcpOAV6Barcod ;
   private int nRC_GXsfl_36 ;
   private int AV6Barcod ;
   private int subGrid_Rows ;
   private int nGXsfl_36_idx=1 ;
   private int AV54TFBarColNum ;
   private int AV55TFBarColNum_To ;
   private int AV72TFBarPie ;
   private int AV73TFBarPie_To ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum ;
   private int AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ;
   private int AV141Cargasporsecciontradicional_wcds_34_tfbarpie ;
   private int AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int subGrid_Islastpage ;
   private int AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ;
   private int AV96FasesColeccion_size ;
   private int A252CliCod ;
   private int edtCliNom_Visible ;
   private int edtBarFecCli_Visible ;
   private int edtPedidoClie_Visible ;
   private int edtBarFecFpr_Visible ;
   private int edtBarFecGen_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarTipCol_Visible ;
   private int edtBarOrdLin_Visible ;
   private int edtMaqCodBis_Visible ;
   private int edtFasCod_Visible ;
   private int edtFasDsc_Visible ;
   private int edtBarMtr_Visible ;
   private int edtBarKgm_Visible ;
   private int edtBarPie_Visible ;
   private int edtBarFasCod_Visible ;
   private int edtBarFecCum_Visible ;
   private int edtBarSit_Visible ;
   private int GXv_int9[] ;
   private int AV149GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private java.math.BigDecimal AV68TFBarMtr ;
   private java.math.BigDecimal AV69TFBarMtr_To ;
   private java.math.BigDecimal AV70TFBarKgm ;
   private java.math.BigDecimal AV71TFBarKgm_To ;
   private java.math.BigDecimal AV137Cargasporsecciontradicional_wcds_30_tfbarmtr ;
   private java.math.BigDecimal AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to ;
   private java.math.BigDecimal AV139Cargasporsecciontradicional_wcds_32_tfbarkgm ;
   private java.math.BigDecimal AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV94MaqcodInout ;
   private String wcpOAV93TipoControl ;
   private String wcpOAV8Barcodpar ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV94MaqcodInout ;
   private String AV93TipoControl ;
   private String AV8Barcodpar ;
   private String sGXsfl_36_idx="0001" ;
   private String AV30TFCliNom ;
   private String AV31TFCliNom_Sel ;
   private String AV36TFPedidoCliente ;
   private String AV37TFPedidoCliente_Sel ;
   private String AV46TFBarNHdr ;
   private String AV47TFBarNHdr_Sel ;
   private String AV48TFBarSer ;
   private String AV49TFBarSer_Sel ;
   private String AV50TFBarSerDsc ;
   private String AV51TFBarSerDsc_Sel ;
   private String AV52TFBarColNom ;
   private String AV53TFBarColNom_Sel ;
   private String AV60TFMaqCodBis ;
   private String AV61TFMaqCodBis_Sel ;
   private String AV62TFFasCod ;
   private String AV63TFFasCod_Sel ;
   private String AV64TFFasDsc ;
   private String AV65TFFasDsc_Sel ;
   private String AV74TFBarFasCod ;
   private String AV75TFBarFasCod_Sel ;
   private String AV148Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A130BarCodPar ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A365DisDes ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexportar_Internalname ;
   private String bttBtnexportar_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfeccliauxdates_Internalname ;
   private String edtavDdo_barfeccliauxdate_Internalname ;
   private String edtavDdo_barfeccliauxdate_Jsonclick ;
   private String divDdo_barfecfprauxdates_Internalname ;
   private String edtavDdo_barfecfprauxdate_Internalname ;
   private String edtavDdo_barfecfprauxdate_Jsonclick ;
   private String divDdo_barfecgenauxdates_Internalname ;
   private String edtavDdo_barfecgenauxdate_Internalname ;
   private String edtavDdo_barfecgenauxdate_Jsonclick ;
   private String divDdo_barfeccumauxdates_Internalname ;
   private String edtavDdo_barfeccumauxdate_Internalname ;
   private String edtavDdo_barfeccumauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String AV109Cargasporsecciontradicional_wcds_2_tfclinom ;
   private String AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel ;
   private String AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente ;
   private String AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ;
   private String AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr ;
   private String AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ;
   private String AV118Cargasporsecciontradicional_wcds_11_tfbarser ;
   private String AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel ;
   private String AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc ;
   private String AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ;
   private String AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom ;
   private String AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ;
   private String AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis ;
   private String AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ;
   private String AV132Cargasporsecciontradicional_wcds_25_tffascod ;
   private String AV133Cargasporsecciontradicional_wcds_26_tffascod_sel ;
   private String AV134Cargasporsecciontradicional_wcds_27_tffasdsc ;
   private String AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel ;
   private String AV143Cargasporsecciontradicional_wcds_36_tfbarfascod ;
   private String AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Internalname ;
   private String edtBarFecFpr_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarTipCol_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String edtBarMtr_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarPie_Internalname ;
   private String A151BarFasCod ;
   private String edtBarFasCod_Internalname ;
   private String edtBarFecCum_Internalname ;
   private String edtBarSit_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV143Cargasporsecciontradicional_wcds_36_tfbarfascod ;
   private String lV94MaqcodInout ;
   private String lV109Cargasporsecciontradicional_wcds_2_tfclinom ;
   private String lV116Cargasporsecciontradicional_wcds_9_tfbarnhdr ;
   private String lV118Cargasporsecciontradicional_wcds_11_tfbarser ;
   private String lV120Cargasporsecciontradicional_wcds_13_tfbarserdsc ;
   private String lV122Cargasporsecciontradicional_wcds_15_tfbarcolnom ;
   private String lV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis ;
   private String lV132Cargasporsecciontradicional_wcds_25_tffascod ;
   private String lV134Cargasporsecciontradicional_wcds_27_tffasdsc ;
   private String AV105Station ;
   private String AV106Emprnom ;
   private String AV107Usurcod ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char24 ;
   private String GXv_char15[] ;
   private String GXt_char23 ;
   private String GXv_char14[] ;
   private String GXt_char22 ;
   private String GXv_char5[] ;
   private String GXt_char21 ;
   private String GXv_char4[] ;
   private String GXt_char20 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV94MaqcodInout ;
   private String sCtrlAV93TipoControl ;
   private String sCtrlAV95FasesToJson ;
   private String sCtrlAV6Barcod ;
   private String sCtrlAV7Barcodreo ;
   private String sCtrlAV8Barcodpar ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliNom_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarFecFpr_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarFasCod_Jsonclick ;
   private String edtBarFecCum_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV32TFBarFecCli ;
   private java.util.Date AV38TFBarFecFpr ;
   private java.util.Date AV42TFBarFecGen ;
   private java.util.Date AV76TFBarFecCum ;
   private java.util.Date AV34DDO_BarFecCliAuxDate ;
   private java.util.Date AV40DDO_BarFecFprAuxDate ;
   private java.util.Date AV44DDO_BarFecGenAuxDate ;
   private java.util.Date AV78DDO_BarFecCumAuxDate ;
   private java.util.Date AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli ;
   private java.util.Date AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr ;
   private java.util.Date AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen ;
   private java.util.Date AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A156BarFecCum ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV17OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n151BarFasCod ;
   private boolean n156BarFecCum ;
   private boolean bGXsfl_36_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV66TFBarFasEst_SelsJson ;
   private String AV22ColumnsSelectorXML ;
   private String AV28ManageFiltersXml ;
   private String AV23UserCustomValue ;
   private String wcpOAV95FasesToJson ;
   private String AV95FasesToJson ;
   private String AV19FilterFullText ;
   private String AV108Cargasporsecciontradicional_wcds_1_filterfulltext ;
   private String lV108Cargasporsecciontradicional_wcds_1_filterfulltext ;
   private String AV20ExcelFilename ;
   private String AV21ErrorMessage ;
   private GXSimpleCollection<Byte> AV67TFBarFasEst_Sels ;
   private GXSimpleCollection<Byte> AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbBarFasEst ;
   private IDataStoreProvider pr_default ;
   private String[] H01FB9_A758ProCod ;
   private int[] H01FB9_A252CliCod ;
   private boolean[] H01FB9_n252CliCod ;
   private byte[] H01FB9_A213BarSit ;
   private byte[] H01FB9_A153BarFasEst ;
   private String[] H01FB9_A460FasDsc ;
   private String[] H01FB9_A457FasCod ;
   private String[] H01FB9_A603MaqCodBis ;
   private short[] H01FB9_A194BarOrdLin ;
   private byte[] H01FB9_A218BarTipCol ;
   private int[] H01FB9_A136BarColNum ;
   private String[] H01FB9_A135BarColNom ;
   private String[] H01FB9_A1652BarSerDsc ;
   private String[] H01FB9_A212BarSer ;
   private String[] H01FB9_A13696BarNHdr ;
   private java.util.Date[] H01FB9_A159BarFecGen ;
   private java.util.Date[] H01FB9_A158BarFecFpr ;
   private java.util.Date[] H01FB9_A155BarFecCli ;
   private String[] H01FB9_A279CliNom ;
   private java.util.Date[] H01FB9_A156BarFecCum ;
   private boolean[] H01FB9_n156BarFecCum ;
   private String[] H01FB9_A151BarFasCod ;
   private boolean[] H01FB9_n151BarFasCod ;
   private java.math.BigDecimal[] H01FB9_A166BarKgm ;
   private java.math.BigDecimal[] H01FB9_A184BarMtr ;
   private int[] H01FB9_A129BarCod ;
   private byte[] H01FB9_A132BarCodReo ;
   private String[] H01FB9_A130BarCodPar ;
   private String[] H01FB9_A143BarDisNum ;
   private String[] H01FB9_A4812BarEncCli ;
   private String[] H01FB9_A396EmprCod ;
   private short[] H01FB9_A199BarPie1 ;
   private String[] H01FB9_A365DisDes ;
   private int[] H01FB9_A898BarPieNDes ;
   private GXSimpleCollection<String> AV96FasesColeccion ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV27ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item18 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item19[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV82DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState33[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
}

final  class cargasporsecciontradicional_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01FB9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A457FasCod ,
                                          GXSimpleCollection<String> AV96FasesColeccion ,
                                          byte A153BarFasEst ,
                                          GXSimpleCollection<Byte> AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels ,
                                          String AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel ,
                                          String AV109Cargasporsecciontradicional_wcds_2_tfclinom ,
                                          java.util.Date AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli ,
                                          java.util.Date AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr ,
                                          java.util.Date AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen ,
                                          String AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel ,
                                          String AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr ,
                                          String AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel ,
                                          String AV118Cargasporsecciontradicional_wcds_11_tfbarser ,
                                          String AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel ,
                                          String AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc ,
                                          String AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel ,
                                          String AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom ,
                                          int AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum ,
                                          int AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to ,
                                          byte AV126Cargasporsecciontradicional_wcds_19_tfbartipcol ,
                                          byte AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to ,
                                          short AV128Cargasporsecciontradicional_wcds_21_tfbarordlin ,
                                          short AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to ,
                                          String AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel ,
                                          String AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis ,
                                          String AV133Cargasporsecciontradicional_wcds_26_tffascod_sel ,
                                          String AV132Cargasporsecciontradicional_wcds_25_tffascod ,
                                          String AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel ,
                                          String AV134Cargasporsecciontradicional_wcds_27_tffasdsc ,
                                          int AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size ,
                                          java.math.BigDecimal AV137Cargasporsecciontradicional_wcds_30_tfbarmtr ,
                                          java.math.BigDecimal AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to ,
                                          java.math.BigDecimal AV139Cargasporsecciontradicional_wcds_32_tfbarkgm ,
                                          java.math.BigDecimal AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to ,
                                          byte AV146Cargasporsecciontradicional_wcds_39_tfbarsit ,
                                          byte AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to ,
                                          String A279CliNom ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A159BarFecGen ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          short A194BarOrdLin ,
                                          String A603MaqCodBis ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.math.BigDecimal A166BarKgm ,
                                          byte A213BarSit ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV108Cargasporsecciontradicional_wcds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String A151BarFasCod ,
                                          String AV113Cargasporsecciontradicional_wcds_6_tfpedidocliente_sel ,
                                          String AV112Cargasporsecciontradicional_wcds_5_tfpedidocliente ,
                                          int AV141Cargasporsecciontradicional_wcds_34_tfbarpie ,
                                          int AV142Cargasporsecciontradicional_wcds_35_tfbarpie_to ,
                                          String AV144Cargasporsecciontradicional_wcds_37_tfbarfascod_sel ,
                                          String AV143Cargasporsecciontradicional_wcds_36_tfbarfascod ,
                                          java.util.Date AV145Cargasporsecciontradicional_wcds_38_tfbarfeccum ,
                                          java.util.Date A156BarFecCum ,
                                          String AV94MaqcodInout ,
                                          int AV96FasesColeccion_size ,
                                          int AV6Barcod ,
                                          byte AV7Barcodreo ,
                                          String AV8Barcodpar ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[47];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.ProCod, T3.CliCod, T3.BarSit, T1.BarFasEst, T2.FasDsc, T1.FasCod, T1.MaqCodBis, T1.BarOrdLin, T3.BarTipCol, T3.BarColNum, T3.BarColNom," ;
      scmdbuf += " T3.BarSerDsc, T3.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90'), 2))) || T3.BarCodPar AS" ;
      scmdbuf += " BarNHdr, T3.BarFecGen, T3.BarFecFpr, T3.BarFecCli, T4.CliNom, COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T6.BarFasCod," ;
      scmdbuf += " ' ') AS BarFasCod, COALESCE( T7.BarKgm, 0) AS BarKgm, COALESCE( T7.BarMtr, 0) AS BarMtr, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T1.EmprCod," ;
      scmdbuf += " COALESCE( T7.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod," ;
      scmdbuf += " COALESCE( T10.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod," ;
      scmdbuf += " COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND" ;
      scmdbuf += " T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin," ;
      scmdbuf += " T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar" ;
      scmdbuf += " = T8.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod" ;
      scmdbuf += " = COALESCE( T9.BarProCod, '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS" ;
      scmdbuf += " WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND" ;
      scmdbuf += " T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T5.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "((T1.BarFasEst = 0))");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Cargasporsecciontradicional_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Cargasporsecciontradicional_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Cargasporsecciontradicional_wcds_4_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T3.BarFecCli >= ?)");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114Cargasporsecciontradicional_wcds_7_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T3.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Cargasporsecciontradicional_wcds_8_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV116Cargasporsecciontradicional_wcds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Cargasporsecciontradicional_wcds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV118Cargasporsecciontradicional_wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Cargasporsecciontradicional_wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV120Cargasporsecciontradicional_wcds_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Cargasporsecciontradicional_wcds_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV122Cargasporsecciontradicional_wcds_15_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Cargasporsecciontradicional_wcds_16_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( ! (0==AV124Cargasporsecciontradicional_wcds_17_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      if ( ! (0==AV125Cargasporsecciontradicional_wcds_18_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int34[30] = (byte)(1) ;
      }
      if ( ! (0==AV126Cargasporsecciontradicional_wcds_19_tfbartipcol) )
      {
         addWhere(sWhereString, "(T3.BarTipCol >= ?)");
      }
      else
      {
         GXv_int34[31] = (byte)(1) ;
      }
      if ( ! (0==AV127Cargasporsecciontradicional_wcds_20_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T3.BarTipCol <= ?)");
      }
      else
      {
         GXv_int34[32] = (byte)(1) ;
      }
      if ( ! (0==AV128Cargasporsecciontradicional_wcds_21_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int34[33] = (byte)(1) ;
      }
      if ( ! (0==AV129Cargasporsecciontradicional_wcds_22_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int34[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV130Cargasporsecciontradicional_wcds_23_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Cargasporsecciontradicional_wcds_24_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int34[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV132Cargasporsecciontradicional_wcds_25_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Cargasporsecciontradicional_wcds_26_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int34[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Cargasporsecciontradicional_wcds_27_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Cargasporsecciontradicional_wcds_28_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int34[40] = (byte)(1) ;
      }
      if ( AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Cargasporsecciontradicional_wcds_29_tfbarfasest_sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Cargasporsecciontradicional_wcds_30_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int34[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Cargasporsecciontradicional_wcds_31_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int34[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Cargasporsecciontradicional_wcds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int34[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Cargasporsecciontradicional_wcds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int34[44] = (byte)(1) ;
      }
      if ( ! (0==AV146Cargasporsecciontradicional_wcds_39_tfbarsit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int34[45] = (byte)(1) ;
      }
      if ( ! (0==AV147Cargasporsecciontradicional_wcds_40_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int34[46] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFasEst" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFasEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecCli" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecFpr" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecFpr DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecGen" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecGen DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarTipCol" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarTipCol DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSit" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSit DESC" ;
      }
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
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
                  return conditional_H01FB9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , ((Number) dynConstraints[48]).shortValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).shortValue() , ((Boolean) dynConstraints[55]).booleanValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , (java.util.Date)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).intValue() , ((Number) dynConstraints[72]).byteValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01FB9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getString(14, 11);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 30);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((int[]) buf[25])[0] = rslt.getInt(23);
               ((byte[]) buf[26])[0] = rslt.getByte(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 1);
               ((String[]) buf[28])[0] = rslt.getString(26, 8);
               ((String[]) buf[29])[0] = rslt.getString(27, 20);
               ((String[]) buf[30])[0] = rslt.getString(28, 3);
               ((short[]) buf[31])[0] = rslt.getShort(29);
               ((String[]) buf[32])[0] = rslt.getString(30, 1);
               ((int[]) buf[33])[0] = rslt.getInt(31);
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
                  stmt.setString(sIdx, (String)parms[47], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 8);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 28);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 28);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[92]).byteValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               return;
      }
   }

}

