package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consumoscolorservice_wc_impl extends GXWebComponent
{
   public consumoscolorservice_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consumoscolorservice_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consumoscolorservice_wc_impl.class ));
   }

   public consumoscolorservice_wc_impl( int remoteHandle ,
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
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "WP_Batchcode") ;
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
               AV65WP_Batchcode = httpContext.GetPar( "WP_Batchcode") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65WP_Batchcode", AV65WP_Batchcode);
               AV64EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64EmprCod", AV64EmprCod);
               AV66barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66barcod), 8, 0));
               AV67barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67barcodreo", GXutil.str( AV67barcodreo, 1, 0));
               AV68barcodpar = httpContext.GetPar( "barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68barcodpar", AV68barcodpar);
               AV69reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "reclinmaq"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69reclinmaq), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV65WP_Batchcode,AV64EmprCod,Integer.valueOf(AV66barcod),Byte.valueOf(AV67barcodreo),AV68barcodpar,Short.valueOf(AV69reclinmaq)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "WP_Batchcode") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "WP_Batchcode") ;
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
      nRC_GXsfl_38 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_38"))) ;
      nGXsfl_38_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_38_idx"))) ;
      sGXsfl_38_idx = httpContext.GetPar( "sGXsfl_38_idx") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV63colorserviceID = (int)(GXutil.lval( httpContext.GetPar( "colorserviceID"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV65WP_Batchcode = httpContext.GetPar( "WP_Batchcode") ;
      AV26TFWP_ID = GXutil.lval( httpContext.GetPar( "TFWP_ID")) ;
      AV27TFWP_ID_To = GXutil.lval( httpContext.GetPar( "TFWP_ID_To")) ;
      AV28TFWP_Start = localUtil.parseDTimeParm( httpContext.GetPar( "TFWP_Start")) ;
      AV32TFWP_Date = localUtil.parseDTimeParm( httpContext.GetPar( "TFWP_Date")) ;
      AV36TFWP_BatchCode = httpContext.GetPar( "TFWP_BatchCode") ;
      AV37TFWP_BatchCode_Sel = httpContext.GetPar( "TFWP_BatchCode_Sel") ;
      AV38TFWP_CallOffCSv = (int)(GXutil.lval( httpContext.GetPar( "TFWP_CallOffCSv"))) ;
      AV39TFWP_CallOffCSv_To = (int)(GXutil.lval( httpContext.GetPar( "TFWP_CallOffCSv_To"))) ;
      AV40TFWP_ReDyeCSv = (int)(GXutil.lval( httpContext.GetPar( "TFWP_ReDyeCSv"))) ;
      AV41TFWP_ReDyeCSv_To = (int)(GXutil.lval( httpContext.GetPar( "TFWP_ReDyeCSv_To"))) ;
      AV42TFWP_MachineCode = httpContext.GetPar( "TFWP_MachineCode") ;
      AV43TFWP_MachineCode_Sel = httpContext.GetPar( "TFWP_MachineCode_Sel") ;
      AV44TFWP_TankCode = (int)(GXutil.lval( httpContext.GetPar( "TFWP_TankCode"))) ;
      AV45TFWP_TankCode_To = (int)(GXutil.lval( httpContext.GetPar( "TFWP_TankCode_To"))) ;
      AV46TFWP_ProductCSv = httpContext.GetPar( "TFWP_ProductCSv") ;
      AV47TFWP_ProductCSv_Sel = httpContext.GetPar( "TFWP_ProductCSv_Sel") ;
      AV48TFWP_ToDose = CommonUtil.decimalVal( httpContext.GetPar( "TFWP_ToDose"), ".") ;
      AV49TFWP_ToDose_To = CommonUtil.decimalVal( httpContext.GetPar( "TFWP_ToDose_To"), ".") ;
      AV50TFWP_Dosed = CommonUtil.decimalVal( httpContext.GetPar( "TFWP_Dosed"), ".") ;
      AV51TFWP_Dosed_To = CommonUtil.decimalVal( httpContext.GetPar( "TFWP_Dosed_To"), ".") ;
      AV52TFWP_ProdBatchCode = httpContext.GetPar( "TFWP_ProdBatchCode") ;
      AV53TFWP_ProdBatchCode_Sel = httpContext.GetPar( "TFWP_ProdBatchCode_Sel") ;
      AV54TFWP_DosingOrigin = (int)(GXutil.lval( httpContext.GetPar( "TFWP_DosingOrigin"))) ;
      AV55TFWP_DosingOrigin_To = (int)(GXutil.lval( httpContext.GetPar( "TFWP_DosingOrigin_To"))) ;
      AV56TFWP_StatusCSv = (int)(GXutil.lval( httpContext.GetPar( "TFWP_StatusCSv"))) ;
      AV57TFWP_StatusCSv_To = (int)(GXutil.lval( httpContext.GetPar( "TFWP_StatusCSv_To"))) ;
      AV108Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV64EmprCod = httpContext.GetPar( "EmprCod") ;
      AV66barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
      AV67barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
      AV68barcodpar = httpContext.GetPar( "barcodpar") ;
      AV69reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "reclinmaq"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
      A1273RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
      A811RecLin = (short)(GXutil.lval( httpContext.GetPar( "RecLin"))) ;
      A2394RecForNro = (byte)(GXutil.lval( httpContext.GetPar( "RecForNro"))) ;
      A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV63colorserviceID, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV65WP_Batchcode, AV26TFWP_ID, AV27TFWP_ID_To, AV28TFWP_Start, AV32TFWP_Date, AV36TFWP_BatchCode, AV37TFWP_BatchCode_Sel, AV38TFWP_CallOffCSv, AV39TFWP_CallOffCSv_To, AV40TFWP_ReDyeCSv, AV41TFWP_ReDyeCSv_To, AV42TFWP_MachineCode, AV43TFWP_MachineCode_Sel, AV44TFWP_TankCode, AV45TFWP_TankCode_To, AV46TFWP_ProductCSv, AV47TFWP_ProductCSv_Sel, AV48TFWP_ToDose, AV49TFWP_ToDose_To, AV50TFWP_Dosed, AV51TFWP_Dosed_To, AV52TFWP_ProdBatchCode, AV53TFWP_ProdBatchCode_Sel, AV54TFWP_DosingOrigin, AV55TFWP_DosingOrigin_To, AV56TFWP_StatusCSv, AV57TFWP_StatusCSv_To, AV108Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64EmprCod, AV66barcod, AV67barcodreo, AV68barcodpar, AV69reclinmaq, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro, A811RecLin, A2394RecForNro, A872RecPrdNum, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1LL2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " tabla TWeightProduct", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.consumoscolorservice_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV65WP_Batchcode)),GXutil.URLEncode(GXutil.rtrim(AV64EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV66barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV67barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV68barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV69reclinmaq,4,0))}, new String[] {"WP_Batchcode","EmprCod","barcod","barcodreo","barcodpar","reclinmaq"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV108Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_38", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_38, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65WP_Batchcode", wcpOAV65WP_Batchcode);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64EmprCod", GXutil.rtrim( wcpOAV64EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV66barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV67barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV67barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV68barcodpar", GXutil.rtrim( wcpOAV68barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV69reclinmaq", GXutil.ltrim( localUtil.ntoc( wcpOAV69reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWP_BATCHCODE", AV65WP_Batchcode);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_ID", GXutil.ltrim( localUtil.ntoc( AV26TFWP_ID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_ID_TO", GXutil.ltrim( localUtil.ntoc( AV27TFWP_ID_To, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_START", localUtil.ttoc( AV28TFWP_Start, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_DATE", localUtil.ttoc( AV32TFWP_Date, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_BATCHCODE", AV36TFWP_BatchCode);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_BATCHCODE_SEL", AV37TFWP_BatchCode_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_CALLOFFCSV", GXutil.ltrim( localUtil.ntoc( AV38TFWP_CallOffCSv, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_CALLOFFCSV_TO", GXutil.ltrim( localUtil.ntoc( AV39TFWP_CallOffCSv_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_REDYECSV", GXutil.ltrim( localUtil.ntoc( AV40TFWP_ReDyeCSv, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_REDYECSV_TO", GXutil.ltrim( localUtil.ntoc( AV41TFWP_ReDyeCSv_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_MACHINECODE", AV42TFWP_MachineCode);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_MACHINECODE_SEL", AV43TFWP_MachineCode_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_TANKCODE", GXutil.ltrim( localUtil.ntoc( AV44TFWP_TankCode, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_TANKCODE_TO", GXutil.ltrim( localUtil.ntoc( AV45TFWP_TankCode_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_PRODUCTCSV", AV46TFWP_ProductCSv);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_PRODUCTCSV_SEL", AV47TFWP_ProductCSv_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_TODOSE", GXutil.ltrim( localUtil.ntoc( AV48TFWP_ToDose, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_TODOSE_TO", GXutil.ltrim( localUtil.ntoc( AV49TFWP_ToDose_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_DOSED", GXutil.ltrim( localUtil.ntoc( AV50TFWP_Dosed, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_DOSED_TO", GXutil.ltrim( localUtil.ntoc( AV51TFWP_Dosed_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_PRODBATCHCODE", AV52TFWP_ProdBatchCode);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_PRODBATCHCODE_SEL", AV53TFWP_ProdBatchCode_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_DOSINGORIGIN", GXutil.ltrim( localUtil.ntoc( AV54TFWP_DosingOrigin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_DOSINGORIGIN_TO", GXutil.ltrim( localUtil.ntoc( AV55TFWP_DosingOrigin_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_STATUSCSV", GXutil.ltrim( localUtil.ntoc( AV56TFWP_StatusCSv, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFWP_STATUSCSV_TO", GXutil.ltrim( localUtil.ntoc( AV57TFWP_StatusCSv_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV108Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV108Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV64EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV66barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV67barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV68barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV69reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLINMAQ", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLINPRO", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLIN", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECFORNRO", GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECPRDNUM", GXutil.rtrim( A872RecPrdNum));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLORSERVICEID", GXutil.ltrim( localUtil.ntoc( AV63colorserviceID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlCloseForm1LL2( )
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
      return "FormulacionTinte.ConsumosColorService_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " tabla TWeightProduct", "") ;
   }

   public void wb1LL0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.consumoscolorservice_wc");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ConsumosColorService_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ConsumosColorService_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 38, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ConsumosColorService_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1LL2( true) ;
      }
      else
      {
         wb_table1_23_1LL2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1LL2e( boolean wbgen )
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
         startgridcontrol38( ) ;
      }
      if ( wbEnd == 38 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_38 = (int)(nGXsfl_38_idx-1) ;
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_wp_startauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'" + sGXsfl_38_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_wp_startauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_wp_startauxdate_Internalname, localUtil.format(AV30DDO_WP_StartAuxDate, "99/99/99"), localUtil.format( AV30DDO_WP_StartAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,62);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_wp_startauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsumosColorService_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_wp_startauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\ConsumosColorService_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_wp_dateauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'" + sGXsfl_38_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_wp_dateauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_wp_dateauxdate_Internalname, localUtil.format(AV34DDO_WP_DateAuxDate, "99/99/99"), localUtil.format( AV34DDO_WP_DateAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,64);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_wp_dateauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsumosColorService_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_wp_dateauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\ConsumosColorService_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 38 )
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

   public void start1LL2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " tabla TWeightProduct", ""), (short)(0)) ;
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
            strup1LL0( ) ;
         }
      }
   }

   public void ws1LL2( )
   {
      start1LL2( ) ;
      evt1LL2( ) ;
   }

   public void evt1LL2( )
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
                              strup1LL0( ) ;
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
                              strup1LL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111LL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121LL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131LL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e141LL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LL0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e151LL2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1LL0( ) ;
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
                              strup1LL0( ) ;
                           }
                           AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV65WP_Batchcode ;
                           AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV15FilterFullText ;
                           AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV26TFWP_ID ;
                           AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV27TFWP_ID_To ;
                           AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV28TFWP_Start ;
                           AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV32TFWP_Date ;
                           AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV36TFWP_BatchCode ;
                           AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV37TFWP_BatchCode_Sel ;
                           AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV38TFWP_CallOffCSv ;
                           AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV39TFWP_CallOffCSv_To ;
                           AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV40TFWP_ReDyeCSv ;
                           AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV41TFWP_ReDyeCSv_To ;
                           AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV42TFWP_MachineCode ;
                           AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV43TFWP_MachineCode_Sel ;
                           AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV44TFWP_TankCode ;
                           AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV45TFWP_TankCode_To ;
                           AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV46TFWP_ProductCSv ;
                           AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV47TFWP_ProductCSv_Sel ;
                           AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV48TFWP_ToDose ;
                           AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV49TFWP_ToDose_To ;
                           AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV50TFWP_Dosed ;
                           AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV51TFWP_Dosed_To ;
                           AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV52TFWP_ProdBatchCode ;
                           AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV53TFWP_ProdBatchCode_Sel ;
                           AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV54TFWP_DosingOrigin ;
                           AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV55TFWP_DosingOrigin_To ;
                           AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV56TFWP_StatusCSv ;
                           AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV57TFWP_StatusCSv_To ;
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
                              strup1LL0( ) ;
                           }
                           nGXsfl_38_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_382( ) ;
                           A13948WP_ID = localUtil.ctol( httpContext.cgiGet( edtWP_ID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A13949WP_Start = localUtil.ctot( httpContext.cgiGet( edtWP_Start_Internalname), 0) ;
                           A13950WP_Date = localUtil.ctot( httpContext.cgiGet( edtWP_Date_Internalname), 0) ;
                           A13951WP_BatchCo = httpContext.cgiGet( edtWP_BatchCo_Internalname) ;
                           A13952WP_CallOff = (int)(localUtil.ctol( httpContext.cgiGet( edtWP_CallOff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13953WP_ReDyeCS = (int)(localUtil.ctol( httpContext.cgiGet( edtWP_ReDyeCS_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13954WP_Machine = httpContext.cgiGet( edtWP_Machine_Internalname) ;
                           A13955WP_TankCod = (int)(localUtil.ctol( httpContext.cgiGet( edtWP_TankCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13956WP_Product = httpContext.cgiGet( edtWP_Product_Internalname) ;
                           A13957WP_ToDose = localUtil.ctond( httpContext.cgiGet( edtWP_ToDose_Internalname)) ;
                           A13958WP_Dosed = localUtil.ctond( httpContext.cgiGet( edtWP_Dosed_Internalname)) ;
                           A13959WP_ProdBat = httpContext.cgiGet( edtWP_ProdBat_Internalname) ;
                           A13960WP_DosingO = (int)(localUtil.ctol( httpContext.cgiGet( edtWP_DosingO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV70comentario = httpContext.cgiGet( edtavComentario_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavComentario_Internalname, AV70comentario);
                           A13961WP_StatusC = (int)(localUtil.ctol( httpContext.cgiGet( edtWP_StatusC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV71RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavReclin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71RecLin), 4, 0));
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
                                       e161LL2 ();
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
                                       e171LL2 ();
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
                                       e181LL2 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strup1LL0( ) ;
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

   public void we1LL2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1LL2( ) ;
         }
      }
   }

   public void pa1LL2( )
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
      subsflControlProps_382( ) ;
      while ( nGXsfl_38_idx <= nRC_GXsfl_38 )
      {
         sendrow_382( ) ;
         nGXsfl_38_idx = ((subGrid_Islastpage==1)&&(nGXsfl_38_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_38_idx+1) ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 int AV63colorserviceID ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV65WP_Batchcode ,
                                 long AV26TFWP_ID ,
                                 long AV27TFWP_ID_To ,
                                 java.util.Date AV28TFWP_Start ,
                                 java.util.Date AV32TFWP_Date ,
                                 String AV36TFWP_BatchCode ,
                                 String AV37TFWP_BatchCode_Sel ,
                                 int AV38TFWP_CallOffCSv ,
                                 int AV39TFWP_CallOffCSv_To ,
                                 int AV40TFWP_ReDyeCSv ,
                                 int AV41TFWP_ReDyeCSv_To ,
                                 String AV42TFWP_MachineCode ,
                                 String AV43TFWP_MachineCode_Sel ,
                                 int AV44TFWP_TankCode ,
                                 int AV45TFWP_TankCode_To ,
                                 String AV46TFWP_ProductCSv ,
                                 String AV47TFWP_ProductCSv_Sel ,
                                 java.math.BigDecimal AV48TFWP_ToDose ,
                                 java.math.BigDecimal AV49TFWP_ToDose_To ,
                                 java.math.BigDecimal AV50TFWP_Dosed ,
                                 java.math.BigDecimal AV51TFWP_Dosed_To ,
                                 String AV52TFWP_ProdBatchCode ,
                                 String AV53TFWP_ProdBatchCode_Sel ,
                                 int AV54TFWP_DosingOrigin ,
                                 int AV55TFWP_DosingOrigin_To ,
                                 int AV56TFWP_StatusCSv ,
                                 int AV57TFWP_StatusCSv_To ,
                                 String AV108Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV64EmprCod ,
                                 int AV66barcod ,
                                 byte AV67barcodreo ,
                                 String AV68barcodpar ,
                                 short AV69reclinmaq ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 short A2804RecLinMaq ,
                                 byte A1273RecLinPro ,
                                 short A811RecLin ,
                                 byte A2394RecForNro ,
                                 String A872RecPrdNum ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171LL2 ();
      GRID_nCurrentRecord = 0 ;
      rf1LL2( ) ;
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_38_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1LL2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV108Pgmname = "FormulacionTinte.ConsumosColorService_WC" ;
      Gx_err = (short)(0) ;
      edtavComentario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavComentario_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComentario_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavReclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavReclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclin_Enabled), 5, 0), !bGXsfl_38_Refreshing);
   }

   public void rf1LL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(38) ;
      /* Execute user event: Refresh */
      e171LL2 ();
      nGXsfl_38_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_382( ) ;
      bGXsfl_38_Refreshing = true ;
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
         subsflControlProps_382( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_fnc_recordsperpage( )+1) ;
         pr_colorservice.dynParam(0, new Object[]{ new Object[]{
                                              AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                              Long.valueOf(AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) ,
                                              Long.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) ,
                                              AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                              AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                              AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                              AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                              Integer.valueOf(AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) ,
                                              Integer.valueOf(AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) ,
                                              Integer.valueOf(AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) ,
                                              Integer.valueOf(AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) ,
                                              AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                              AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                              Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) ,
                                              Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) ,
                                              AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                              AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                              AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                              AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                              AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                              AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                              AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                              AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                              Integer.valueOf(AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) ,
                                              Integer.valueOf(AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) ,
                                              Integer.valueOf(AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) ,
                                              Integer.valueOf(AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) ,
                                              Long.valueOf(A13948WP_ID) ,
                                              A13951WP_BatchCo ,
                                              Integer.valueOf(A13952WP_CallOff) ,
                                              Integer.valueOf(A13953WP_ReDyeCS) ,
                                              A13954WP_Machine ,
                                              Integer.valueOf(A13955WP_TankCod) ,
                                              A13956WP_Product ,
                                              A13957WP_ToDose ,
                                              A13958WP_Dosed ,
                                              A13959WP_ProdBat ,
                                              Integer.valueOf(A13960WP_DosingO) ,
                                              Integer.valueOf(A13961WP_StatusC) ,
                                              A13949WP_Start ,
                                              A13950WP_Date ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ,
                                              Integer.valueOf(AV63colorserviceID) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
         lV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = GXutil.concat( GXutil.rtrim( AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode), "%", "") ;
         lV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = GXutil.concat( GXutil.rtrim( AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode), "%", "") ;
         lV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv), "%", "") ;
         lV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = GXutil.concat( GXutil.rtrim( AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode), "%", "") ;
         /* Using cursor H01LL2 */
         pr_colorservice.execute(0, new Object[] {Integer.valueOf(AV63colorserviceID), AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, Long.valueOf(AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id), Long.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to), AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start, AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date, lV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode, AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel, Integer.valueOf(AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv), Integer.valueOf(AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to), Integer.valueOf(AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv), Integer.valueOf(AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to), lV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode, AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel, Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode), Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to), lV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv, AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel, AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose, AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to, AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed, AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to, lV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode, AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel, Integer.valueOf(AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin), Integer.valueOf(AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to), Integer.valueOf(AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv), Integer.valueOf(AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_38_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
         while ( ( (pr_colorservice.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13961WP_StatusC = H01LL2_A13961WP_StatusC[0] ;
            A13960WP_DosingO = H01LL2_A13960WP_DosingO[0] ;
            A13959WP_ProdBat = H01LL2_A13959WP_ProdBat[0] ;
            A13958WP_Dosed = H01LL2_A13958WP_Dosed[0] ;
            A13957WP_ToDose = H01LL2_A13957WP_ToDose[0] ;
            A13956WP_Product = H01LL2_A13956WP_Product[0] ;
            A13955WP_TankCod = H01LL2_A13955WP_TankCod[0] ;
            A13954WP_Machine = H01LL2_A13954WP_Machine[0] ;
            A13953WP_ReDyeCS = H01LL2_A13953WP_ReDyeCS[0] ;
            A13952WP_CallOff = H01LL2_A13952WP_CallOff[0] ;
            A13951WP_BatchCo = H01LL2_A13951WP_BatchCo[0] ;
            A13950WP_Date = H01LL2_A13950WP_Date[0] ;
            A13949WP_Start = H01LL2_A13949WP_Start[0] ;
            A13948WP_ID = H01LL2_A13948WP_ID[0] ;
            e181LL2 ();
            pr_colorservice.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_colorservice.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_colorservice.close(0);
         wbEnd = (short)(38) ;
         wb1LL0( ) ;
      }
      bGXsfl_38_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1LL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV108Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV108Pgmname, ""))));
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
      AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV65WP_Batchcode ;
      AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV15FilterFullText ;
      AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV26TFWP_ID ;
      AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV27TFWP_ID_To ;
      AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV28TFWP_Start ;
      AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV32TFWP_Date ;
      AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV36TFWP_BatchCode ;
      AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV37TFWP_BatchCode_Sel ;
      AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV38TFWP_CallOffCSv ;
      AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV39TFWP_CallOffCSv_To ;
      AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV40TFWP_ReDyeCSv ;
      AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV41TFWP_ReDyeCSv_To ;
      AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV42TFWP_MachineCode ;
      AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV43TFWP_MachineCode_Sel ;
      AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV44TFWP_TankCode ;
      AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV45TFWP_TankCode_To ;
      AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV46TFWP_ProductCSv ;
      AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV47TFWP_ProductCSv_Sel ;
      AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV48TFWP_ToDose ;
      AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV49TFWP_ToDose_To ;
      AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV50TFWP_Dosed ;
      AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV51TFWP_Dosed_To ;
      AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV52TFWP_ProdBatchCode ;
      AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV53TFWP_ProdBatchCode_Sel ;
      AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV54TFWP_DosingOrigin ;
      AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV55TFWP_DosingOrigin_To ;
      AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV56TFWP_StatusCSv ;
      AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV57TFWP_StatusCSv_To ;
      pr_colorservice.dynParam(1, new Object[]{ new Object[]{
                                           AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                           Long.valueOf(AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) ,
                                           Long.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) ,
                                           AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                           AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                           AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                           AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                           Integer.valueOf(AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) ,
                                           Integer.valueOf(AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) ,
                                           Integer.valueOf(AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) ,
                                           Integer.valueOf(AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) ,
                                           AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                           AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                           Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) ,
                                           Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) ,
                                           AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                           AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                           AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                           AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                           AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                           AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                           AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                           AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                           Integer.valueOf(AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) ,
                                           Integer.valueOf(AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) ,
                                           Integer.valueOf(AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) ,
                                           Integer.valueOf(AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) ,
                                           Long.valueOf(A13948WP_ID) ,
                                           A13951WP_BatchCo ,
                                           Integer.valueOf(A13952WP_CallOff) ,
                                           Integer.valueOf(A13953WP_ReDyeCS) ,
                                           A13954WP_Machine ,
                                           Integer.valueOf(A13955WP_TankCod) ,
                                           A13956WP_Product ,
                                           A13957WP_ToDose ,
                                           A13958WP_Dosed ,
                                           A13959WP_ProdBat ,
                                           Integer.valueOf(A13960WP_DosingO) ,
                                           Integer.valueOf(A13961WP_StatusC) ,
                                           A13949WP_Start ,
                                           A13950WP_Date ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ,
                                           Integer.valueOf(AV63colorserviceID) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext), "%", "") ;
      lV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = GXutil.concat( GXutil.rtrim( AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode), "%", "") ;
      lV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = GXutil.concat( GXutil.rtrim( AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode), "%", "") ;
      lV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = GXutil.concat( GXutil.rtrim( AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv), "%", "") ;
      lV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = GXutil.concat( GXutil.rtrim( AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode), "%", "") ;
      /* Using cursor H01LL3 */
      pr_colorservice.execute(1, new Object[] {Integer.valueOf(AV63colorserviceID), AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext, Long.valueOf(AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id), Long.valueOf(AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to), AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start, AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date, lV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode, AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel, Integer.valueOf(AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv), Integer.valueOf(AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to), Integer.valueOf(AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv), Integer.valueOf(AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to), lV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode, AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel, Integer.valueOf(AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode), Integer.valueOf(AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to), lV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv, AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel, AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose, AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to, AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed, AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to, lV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode, AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel, Integer.valueOf(AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin), Integer.valueOf(AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to), Integer.valueOf(AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv), Integer.valueOf(AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to)});
      GRID_nRecordCount = H01LL3_AGRID_nRecordCount[0] ;
      pr_colorservice.close(1);
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
      AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV65WP_Batchcode ;
      AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV15FilterFullText ;
      AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV26TFWP_ID ;
      AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV27TFWP_ID_To ;
      AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV28TFWP_Start ;
      AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV32TFWP_Date ;
      AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV36TFWP_BatchCode ;
      AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV37TFWP_BatchCode_Sel ;
      AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV38TFWP_CallOffCSv ;
      AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV39TFWP_CallOffCSv_To ;
      AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV40TFWP_ReDyeCSv ;
      AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV41TFWP_ReDyeCSv_To ;
      AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV42TFWP_MachineCode ;
      AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV43TFWP_MachineCode_Sel ;
      AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV44TFWP_TankCode ;
      AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV45TFWP_TankCode_To ;
      AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV46TFWP_ProductCSv ;
      AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV47TFWP_ProductCSv_Sel ;
      AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV48TFWP_ToDose ;
      AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV49TFWP_ToDose_To ;
      AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV50TFWP_Dosed ;
      AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV51TFWP_Dosed_To ;
      AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV52TFWP_ProdBatchCode ;
      AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV53TFWP_ProdBatchCode_Sel ;
      AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV54TFWP_DosingOrigin ;
      AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV55TFWP_DosingOrigin_To ;
      AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV56TFWP_StatusCSv ;
      AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV57TFWP_StatusCSv_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV63colorserviceID, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV65WP_Batchcode, AV26TFWP_ID, AV27TFWP_ID_To, AV28TFWP_Start, AV32TFWP_Date, AV36TFWP_BatchCode, AV37TFWP_BatchCode_Sel, AV38TFWP_CallOffCSv, AV39TFWP_CallOffCSv_To, AV40TFWP_ReDyeCSv, AV41TFWP_ReDyeCSv_To, AV42TFWP_MachineCode, AV43TFWP_MachineCode_Sel, AV44TFWP_TankCode, AV45TFWP_TankCode_To, AV46TFWP_ProductCSv, AV47TFWP_ProductCSv_Sel, AV48TFWP_ToDose, AV49TFWP_ToDose_To, AV50TFWP_Dosed, AV51TFWP_Dosed_To, AV52TFWP_ProdBatchCode, AV53TFWP_ProdBatchCode_Sel, AV54TFWP_DosingOrigin, AV55TFWP_DosingOrigin_To, AV56TFWP_StatusCSv, AV57TFWP_StatusCSv_To, AV108Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64EmprCod, AV66barcod, AV67barcodreo, AV68barcodpar, AV69reclinmaq, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro, A811RecLin, A2394RecForNro, A872RecPrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV65WP_Batchcode ;
      AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV15FilterFullText ;
      AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV26TFWP_ID ;
      AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV27TFWP_ID_To ;
      AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV28TFWP_Start ;
      AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV32TFWP_Date ;
      AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV36TFWP_BatchCode ;
      AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV37TFWP_BatchCode_Sel ;
      AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV38TFWP_CallOffCSv ;
      AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV39TFWP_CallOffCSv_To ;
      AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV40TFWP_ReDyeCSv ;
      AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV41TFWP_ReDyeCSv_To ;
      AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV42TFWP_MachineCode ;
      AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV43TFWP_MachineCode_Sel ;
      AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV44TFWP_TankCode ;
      AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV45TFWP_TankCode_To ;
      AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV46TFWP_ProductCSv ;
      AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV47TFWP_ProductCSv_Sel ;
      AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV48TFWP_ToDose ;
      AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV49TFWP_ToDose_To ;
      AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV50TFWP_Dosed ;
      AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV51TFWP_Dosed_To ;
      AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV52TFWP_ProdBatchCode ;
      AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV53TFWP_ProdBatchCode_Sel ;
      AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV54TFWP_DosingOrigin ;
      AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV55TFWP_DosingOrigin_To ;
      AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV56TFWP_StatusCSv ;
      AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV57TFWP_StatusCSv_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV63colorserviceID, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV65WP_Batchcode, AV26TFWP_ID, AV27TFWP_ID_To, AV28TFWP_Start, AV32TFWP_Date, AV36TFWP_BatchCode, AV37TFWP_BatchCode_Sel, AV38TFWP_CallOffCSv, AV39TFWP_CallOffCSv_To, AV40TFWP_ReDyeCSv, AV41TFWP_ReDyeCSv_To, AV42TFWP_MachineCode, AV43TFWP_MachineCode_Sel, AV44TFWP_TankCode, AV45TFWP_TankCode_To, AV46TFWP_ProductCSv, AV47TFWP_ProductCSv_Sel, AV48TFWP_ToDose, AV49TFWP_ToDose_To, AV50TFWP_Dosed, AV51TFWP_Dosed_To, AV52TFWP_ProdBatchCode, AV53TFWP_ProdBatchCode_Sel, AV54TFWP_DosingOrigin, AV55TFWP_DosingOrigin_To, AV56TFWP_StatusCSv, AV57TFWP_StatusCSv_To, AV108Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64EmprCod, AV66barcod, AV67barcodreo, AV68barcodpar, AV69reclinmaq, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro, A811RecLin, A2394RecForNro, A872RecPrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV65WP_Batchcode ;
      AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV15FilterFullText ;
      AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV26TFWP_ID ;
      AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV27TFWP_ID_To ;
      AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV28TFWP_Start ;
      AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV32TFWP_Date ;
      AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV36TFWP_BatchCode ;
      AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV37TFWP_BatchCode_Sel ;
      AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV38TFWP_CallOffCSv ;
      AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV39TFWP_CallOffCSv_To ;
      AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV40TFWP_ReDyeCSv ;
      AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV41TFWP_ReDyeCSv_To ;
      AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV42TFWP_MachineCode ;
      AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV43TFWP_MachineCode_Sel ;
      AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV44TFWP_TankCode ;
      AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV45TFWP_TankCode_To ;
      AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV46TFWP_ProductCSv ;
      AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV47TFWP_ProductCSv_Sel ;
      AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV48TFWP_ToDose ;
      AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV49TFWP_ToDose_To ;
      AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV50TFWP_Dosed ;
      AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV51TFWP_Dosed_To ;
      AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV52TFWP_ProdBatchCode ;
      AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV53TFWP_ProdBatchCode_Sel ;
      AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV54TFWP_DosingOrigin ;
      AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV55TFWP_DosingOrigin_To ;
      AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV56TFWP_StatusCSv ;
      AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV57TFWP_StatusCSv_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV63colorserviceID, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV65WP_Batchcode, AV26TFWP_ID, AV27TFWP_ID_To, AV28TFWP_Start, AV32TFWP_Date, AV36TFWP_BatchCode, AV37TFWP_BatchCode_Sel, AV38TFWP_CallOffCSv, AV39TFWP_CallOffCSv_To, AV40TFWP_ReDyeCSv, AV41TFWP_ReDyeCSv_To, AV42TFWP_MachineCode, AV43TFWP_MachineCode_Sel, AV44TFWP_TankCode, AV45TFWP_TankCode_To, AV46TFWP_ProductCSv, AV47TFWP_ProductCSv_Sel, AV48TFWP_ToDose, AV49TFWP_ToDose_To, AV50TFWP_Dosed, AV51TFWP_Dosed_To, AV52TFWP_ProdBatchCode, AV53TFWP_ProdBatchCode_Sel, AV54TFWP_DosingOrigin, AV55TFWP_DosingOrigin_To, AV56TFWP_StatusCSv, AV57TFWP_StatusCSv_To, AV108Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64EmprCod, AV66barcod, AV67barcodreo, AV68barcodpar, AV69reclinmaq, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro, A811RecLin, A2394RecForNro, A872RecPrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV65WP_Batchcode ;
      AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV15FilterFullText ;
      AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV26TFWP_ID ;
      AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV27TFWP_ID_To ;
      AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV28TFWP_Start ;
      AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV32TFWP_Date ;
      AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV36TFWP_BatchCode ;
      AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV37TFWP_BatchCode_Sel ;
      AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV38TFWP_CallOffCSv ;
      AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV39TFWP_CallOffCSv_To ;
      AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV40TFWP_ReDyeCSv ;
      AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV41TFWP_ReDyeCSv_To ;
      AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV42TFWP_MachineCode ;
      AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV43TFWP_MachineCode_Sel ;
      AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV44TFWP_TankCode ;
      AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV45TFWP_TankCode_To ;
      AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV46TFWP_ProductCSv ;
      AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV47TFWP_ProductCSv_Sel ;
      AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV48TFWP_ToDose ;
      AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV49TFWP_ToDose_To ;
      AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV50TFWP_Dosed ;
      AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV51TFWP_Dosed_To ;
      AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV52TFWP_ProdBatchCode ;
      AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV53TFWP_ProdBatchCode_Sel ;
      AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV54TFWP_DosingOrigin ;
      AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV55TFWP_DosingOrigin_To ;
      AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV56TFWP_StatusCSv ;
      AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV57TFWP_StatusCSv_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV63colorserviceID, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV65WP_Batchcode, AV26TFWP_ID, AV27TFWP_ID_To, AV28TFWP_Start, AV32TFWP_Date, AV36TFWP_BatchCode, AV37TFWP_BatchCode_Sel, AV38TFWP_CallOffCSv, AV39TFWP_CallOffCSv_To, AV40TFWP_ReDyeCSv, AV41TFWP_ReDyeCSv_To, AV42TFWP_MachineCode, AV43TFWP_MachineCode_Sel, AV44TFWP_TankCode, AV45TFWP_TankCode_To, AV46TFWP_ProductCSv, AV47TFWP_ProductCSv_Sel, AV48TFWP_ToDose, AV49TFWP_ToDose_To, AV50TFWP_Dosed, AV51TFWP_Dosed_To, AV52TFWP_ProdBatchCode, AV53TFWP_ProdBatchCode_Sel, AV54TFWP_DosingOrigin, AV55TFWP_DosingOrigin_To, AV56TFWP_StatusCSv, AV57TFWP_StatusCSv_To, AV108Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64EmprCod, AV66barcod, AV67barcodreo, AV68barcodpar, AV69reclinmaq, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro, A811RecLin, A2394RecForNro, A872RecPrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV65WP_Batchcode ;
      AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV15FilterFullText ;
      AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV26TFWP_ID ;
      AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV27TFWP_ID_To ;
      AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV28TFWP_Start ;
      AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV32TFWP_Date ;
      AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV36TFWP_BatchCode ;
      AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV37TFWP_BatchCode_Sel ;
      AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV38TFWP_CallOffCSv ;
      AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV39TFWP_CallOffCSv_To ;
      AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV40TFWP_ReDyeCSv ;
      AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV41TFWP_ReDyeCSv_To ;
      AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV42TFWP_MachineCode ;
      AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV43TFWP_MachineCode_Sel ;
      AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV44TFWP_TankCode ;
      AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV45TFWP_TankCode_To ;
      AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV46TFWP_ProductCSv ;
      AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV47TFWP_ProductCSv_Sel ;
      AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV48TFWP_ToDose ;
      AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV49TFWP_ToDose_To ;
      AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV50TFWP_Dosed ;
      AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV51TFWP_Dosed_To ;
      AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV52TFWP_ProdBatchCode ;
      AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV53TFWP_ProdBatchCode_Sel ;
      AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV54TFWP_DosingOrigin ;
      AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV55TFWP_DosingOrigin_To ;
      AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV56TFWP_StatusCSv ;
      AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV57TFWP_StatusCSv_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV63colorserviceID, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV65WP_Batchcode, AV26TFWP_ID, AV27TFWP_ID_To, AV28TFWP_Start, AV32TFWP_Date, AV36TFWP_BatchCode, AV37TFWP_BatchCode_Sel, AV38TFWP_CallOffCSv, AV39TFWP_CallOffCSv_To, AV40TFWP_ReDyeCSv, AV41TFWP_ReDyeCSv_To, AV42TFWP_MachineCode, AV43TFWP_MachineCode_Sel, AV44TFWP_TankCode, AV45TFWP_TankCode_To, AV46TFWP_ProductCSv, AV47TFWP_ProductCSv_Sel, AV48TFWP_ToDose, AV49TFWP_ToDose_To, AV50TFWP_Dosed, AV51TFWP_Dosed_To, AV52TFWP_ProdBatchCode, AV53TFWP_ProdBatchCode_Sel, AV54TFWP_DosingOrigin, AV55TFWP_DosingOrigin_To, AV56TFWP_StatusCSv, AV57TFWP_StatusCSv_To, AV108Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64EmprCod, AV66barcod, AV67barcodreo, AV68barcodpar, AV69reclinmaq, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro, A811RecLin, A2394RecForNro, A872RecPrdNum, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV108Pgmname = "FormulacionTinte.ConsumosColorService_WC" ;
      Gx_err = (short)(0) ;
      edtavComentario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavComentario_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComentario_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      edtavReclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavReclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclin_Enabled), 5, 0), !bGXsfl_38_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1LL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161LL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV58DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_38 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_38"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV65WP_Batchcode = httpContext.cgiGet( sPrefix+"wcpOAV65WP_Batchcode") ;
         wcpOAV64EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV64EmprCod") ;
         wcpOAV66barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV66barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV67barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV67barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV68barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV68barcodpar") ;
         wcpOAV69reclinmaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69reclinmaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_wp_startauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_WP_STARTAUXDATE");
            GX_FocusControl = edtavDdo_wp_startauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30DDO_WP_StartAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30DDO_WP_StartAuxDate", localUtil.format(AV30DDO_WP_StartAuxDate, "99/99/99"));
         }
         else
         {
            AV30DDO_WP_StartAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_wp_startauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30DDO_WP_StartAuxDate", localUtil.format(AV30DDO_WP_StartAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_wp_dateauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_WP_DATEAUXDATE");
            GX_FocusControl = edtavDdo_wp_dateauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_WP_DateAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_WP_DateAuxDate", localUtil.format(AV34DDO_WP_DateAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_WP_DateAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_wp_dateauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_WP_DateAuxDate", localUtil.format(AV34DDO_WP_DateAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e161LL2 ();
      if (returnInSub) return;
   }

   public void e161LL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = AV63colorserviceID ;
      GXv_char2[0] = AV64EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CSTXP", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      consumoscolorservice_wc_impl.this.AV64EmprCod = GXv_char2[0] ;
      consumoscolorservice_wc_impl.this.GXt_int1 = GXv_int4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64EmprCod", AV64EmprCod);
      AV63colorserviceID = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63colorserviceID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63colorserviceID), 8, 0));
      GXt_char5 = AV76Station ;
      GXv_char3[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      consumoscolorservice_wc_impl.this.GXt_char5 = GXv_char3[0] ;
      AV76Station = GXt_char5 ;
      GXv_char3[0] = AV64EmprCod ;
      GXv_char2[0] = AV77Emprnom ;
      GXv_char6[0] = AV78Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV76Station, GXv_char3, GXv_char2, GXv_char6) ;
      consumoscolorservice_wc_impl.this.AV64EmprCod = GXv_char3[0] ;
      consumoscolorservice_wc_impl.this.AV77Emprnom = GXv_char2[0] ;
      consumoscolorservice_wc_impl.this.AV78Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64EmprCod", AV64EmprCod);
      subGrid_Rows = 10 ;
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV58DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV58DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e171LL2( )
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
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("FormulacionTinte.ConsumosColorService_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("FormulacionTinte.ConsumosColorService_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtWP_ID_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_ID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_ID_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_Start_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_Start_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_Start_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_Date_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_Date_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_Date_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_BatchCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_BatchCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_BatchCo_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_CallOff_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_CallOff_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_CallOff_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_ReDyeCS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_ReDyeCS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_ReDyeCS_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_Machine_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_Machine_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_Machine_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_TankCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_TankCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_TankCod_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_Product_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_Product_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_Product_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_ToDose_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_ToDose_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_ToDose_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_Dosed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_Dosed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_Dosed_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_ProdBat_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_ProdBat_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_ProdBat_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_DosingO_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_DosingO_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_DosingO_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtavComentario_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavComentario_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComentario_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_StatusC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_StatusC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWP_StatusC_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtavReclin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavReclin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclin_Visible), 5, 0), !bGXsfl_38_Refreshing);
      edtWP_ToDose_Columnheaderclass = "WWColumn TagColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtWP_ToDose_Internalname, "Columnheaderclass", edtWP_ToDose_Columnheaderclass, !bGXsfl_38_Refreshing);
      AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = AV65WP_Batchcode ;
      AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = AV15FilterFullText ;
      AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id = AV26TFWP_ID ;
      AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to = AV27TFWP_ID_To ;
      AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = AV28TFWP_Start ;
      AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = AV32TFWP_Date ;
      AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = AV36TFWP_BatchCode ;
      AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = AV37TFWP_BatchCode_Sel ;
      AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv = AV38TFWP_CallOffCSv ;
      AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to = AV39TFWP_CallOffCSv_To ;
      AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv = AV40TFWP_ReDyeCSv ;
      AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to = AV41TFWP_ReDyeCSv_To ;
      AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = AV42TFWP_MachineCode ;
      AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = AV43TFWP_MachineCode_Sel ;
      AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode = AV44TFWP_TankCode ;
      AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to = AV45TFWP_TankCode_To ;
      AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = AV46TFWP_ProductCSv ;
      AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = AV47TFWP_ProductCSv_Sel ;
      AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = AV48TFWP_ToDose ;
      AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = AV49TFWP_ToDose_To ;
      AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = AV50TFWP_Dosed ;
      AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = AV51TFWP_Dosed_To ;
      AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = AV52TFWP_ProdBatchCode ;
      AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = AV53TFWP_ProdBatchCode_Sel ;
      AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin = AV54TFWP_DosingOrigin ;
      AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to = AV55TFWP_DosingOrigin_To ;
      AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv = AV56TFWP_StatusCSv ;
      AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to = AV57TFWP_StatusCSv_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121LL2( )
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
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_ID") == 0 )
         {
            AV26TFWP_ID = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFWP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFWP_ID), 12, 0));
            AV27TFWP_ID_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFWP_ID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFWP_ID_To), 12, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_Start") == 0 )
         {
            AV28TFWP_Start = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFWP_Start", localUtil.ttoc( AV28TFWP_Start, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_Date") == 0 )
         {
            AV32TFWP_Date = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFWP_Date", localUtil.ttoc( AV32TFWP_Date, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_BatchCode") == 0 )
         {
            AV36TFWP_BatchCode = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFWP_BatchCode", AV36TFWP_BatchCode);
            AV37TFWP_BatchCode_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFWP_BatchCode_Sel", AV37TFWP_BatchCode_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_CallOffCSv") == 0 )
         {
            AV38TFWP_CallOffCSv = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFWP_CallOffCSv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFWP_CallOffCSv), 5, 0));
            AV39TFWP_CallOffCSv_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFWP_CallOffCSv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFWP_CallOffCSv_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_ReDyeCSv") == 0 )
         {
            AV40TFWP_ReDyeCSv = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFWP_ReDyeCSv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFWP_ReDyeCSv), 5, 0));
            AV41TFWP_ReDyeCSv_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFWP_ReDyeCSv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFWP_ReDyeCSv_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_MachineCode") == 0 )
         {
            AV42TFWP_MachineCode = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFWP_MachineCode", AV42TFWP_MachineCode);
            AV43TFWP_MachineCode_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFWP_MachineCode_Sel", AV43TFWP_MachineCode_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_TankCode") == 0 )
         {
            AV44TFWP_TankCode = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFWP_TankCode", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFWP_TankCode), 5, 0));
            AV45TFWP_TankCode_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFWP_TankCode_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFWP_TankCode_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_ProductCSv") == 0 )
         {
            AV46TFWP_ProductCSv = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFWP_ProductCSv", AV46TFWP_ProductCSv);
            AV47TFWP_ProductCSv_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFWP_ProductCSv_Sel", AV47TFWP_ProductCSv_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_ToDose") == 0 )
         {
            AV48TFWP_ToDose = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFWP_ToDose", GXutil.ltrimstr( AV48TFWP_ToDose, 10, 2));
            AV49TFWP_ToDose_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFWP_ToDose_To", GXutil.ltrimstr( AV49TFWP_ToDose_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_Dosed") == 0 )
         {
            AV50TFWP_Dosed = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFWP_Dosed", GXutil.ltrimstr( AV50TFWP_Dosed, 10, 2));
            AV51TFWP_Dosed_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFWP_Dosed_To", GXutil.ltrimstr( AV51TFWP_Dosed_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_ProdBatchCode") == 0 )
         {
            AV52TFWP_ProdBatchCode = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFWP_ProdBatchCode", AV52TFWP_ProdBatchCode);
            AV53TFWP_ProdBatchCode_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFWP_ProdBatchCode_Sel", AV53TFWP_ProdBatchCode_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_DosingOrigin") == 0 )
         {
            AV54TFWP_DosingOrigin = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFWP_DosingOrigin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFWP_DosingOrigin), 5, 0));
            AV55TFWP_DosingOrigin_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFWP_DosingOrigin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFWP_DosingOrigin_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "WP_StatusCSv") == 0 )
         {
            AV56TFWP_StatusCSv = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFWP_StatusCSv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFWP_StatusCSv), 5, 0));
            AV57TFWP_StatusCSv_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFWP_StatusCSv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFWP_StatusCSv_To), 5, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e181LL2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV70comentario = ((0==A13960WP_DosingO) ? httpContext.getMessage( "Acerto", "") : "") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavComentario_Internalname, AV70comentario);
      AV72RecForNro = (byte)(A13952WP_CallOff) ;
      AV73ProductCode = A13956WP_Product ;
      AV71RecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71RecLin), 4, 0));
      /* Using cursor H01LL4 */
      pr_default.execute(0, new Object[] {AV64EmprCod, Integer.valueOf(AV66barcod), Byte.valueOf(AV67barcodreo), AV68barcodpar, Short.valueOf(AV69reclinmaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = H01LL4_A2804RecLinMaq[0] ;
         A130BarCodPar = H01LL4_A130BarCodPar[0] ;
         A132BarCodReo = H01LL4_A132BarCodReo[0] ;
         A129BarCod = H01LL4_A129BarCod[0] ;
         A396EmprCod = H01LL4_A396EmprCod[0] ;
         A872RecPrdNum = H01LL4_A872RecPrdNum[0] ;
         A2394RecForNro = H01LL4_A2394RecForNro[0] ;
         A811RecLin = H01LL4_A811RecLin[0] ;
         A1273RecLinPro = H01LL4_A1273RecLinPro[0] ;
         if ( ( AV72RecForNro == A2394RecForNro ) && ( GXutil.strcmp(A872RecPrdNum, GXutil.trim( AV73ProductCode)) == 0 ) )
         {
            AV71RecLin = A811RecLin ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71RecLin), 4, 0));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      edtWP_ToDose_Columnclass = ((A13957WP_ToDose.doubleValue()>0) ? "WWColumn TagColumn hidden-xs WWColumnSuccess WWColumnSuccessSingleCell" : "WWColumn TagColumn hidden-xs") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(38) ;
      }
      sendrow_382( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_38_Refreshing )
      {
         httpContext.doAjaxLoad(38, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e131LL2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ConsumosColorService_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111LL2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.ConsumosColorService_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV108Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.ConsumosColorService_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char5 = AV24ManageFiltersXml ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.ConsumosColorService_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char6) ;
         consumoscolorservice_wc_impl.this.GXt_char5 = GXv_char6[0] ;
         AV24ManageFiltersXml = GXt_char5 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV108Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e141LL2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.formulaciontinte.consumoscolorservice_wcexport(remoteHandle, context).execute( GXv_char6, GXv_char3) ;
      consumoscolorservice_wc_impl.this.AV16ExcelFilename = GXv_char6[0] ;
      consumoscolorservice_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e151LL2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.consumoscolorservice_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_ID", "", "ID", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_Start", "", "Date Time Start", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_Date", "", "Date Time", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_BatchCode", "", "Batch Code", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_CallOffCSv", "", "Call Off", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_ReDyeCSv", "", "Re Dye", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_MachineCode", "", "Machine", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_TankCode", "", "Tank", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_ProductCSv", "", "Product", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_ToDose", "", "To Dose", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_Dosed", "", "Dosed", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_ProdBatchCode", "", "Batch", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_DosingOrigin", "", "Dosing Origin", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&comentario", "", "", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "WP_StatusCSv", "", "Status", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&RecLin", "", "Txp", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char5 = AV19UserCustomValue ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ConsumosColorService_WCColumnsSelector", GXv_char6) ;
      consumoscolorservice_wc_impl.this.GXt_char5 = GXv_char6[0] ;
      AV19UserCustomValue = GXt_char5 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.ConsumosColorService_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFWP_ID = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFWP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFWP_ID), 12, 0));
      AV27TFWP_ID_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFWP_ID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFWP_ID_To), 12, 0));
      AV28TFWP_Start = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFWP_Start", localUtil.ttoc( AV28TFWP_Start, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV32TFWP_Date = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFWP_Date", localUtil.ttoc( AV32TFWP_Date, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV36TFWP_BatchCode = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFWP_BatchCode", AV36TFWP_BatchCode);
      AV37TFWP_BatchCode_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFWP_BatchCode_Sel", AV37TFWP_BatchCode_Sel);
      AV38TFWP_CallOffCSv = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFWP_CallOffCSv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFWP_CallOffCSv), 5, 0));
      AV39TFWP_CallOffCSv_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFWP_CallOffCSv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFWP_CallOffCSv_To), 5, 0));
      AV40TFWP_ReDyeCSv = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFWP_ReDyeCSv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFWP_ReDyeCSv), 5, 0));
      AV41TFWP_ReDyeCSv_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFWP_ReDyeCSv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFWP_ReDyeCSv_To), 5, 0));
      AV42TFWP_MachineCode = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFWP_MachineCode", AV42TFWP_MachineCode);
      AV43TFWP_MachineCode_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFWP_MachineCode_Sel", AV43TFWP_MachineCode_Sel);
      AV44TFWP_TankCode = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFWP_TankCode", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFWP_TankCode), 5, 0));
      AV45TFWP_TankCode_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFWP_TankCode_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFWP_TankCode_To), 5, 0));
      AV46TFWP_ProductCSv = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFWP_ProductCSv", AV46TFWP_ProductCSv);
      AV47TFWP_ProductCSv_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFWP_ProductCSv_Sel", AV47TFWP_ProductCSv_Sel);
      AV48TFWP_ToDose = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFWP_ToDose", GXutil.ltrimstr( AV48TFWP_ToDose, 10, 2));
      AV49TFWP_ToDose_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFWP_ToDose_To", GXutil.ltrimstr( AV49TFWP_ToDose_To, 10, 2));
      AV50TFWP_Dosed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFWP_Dosed", GXutil.ltrimstr( AV50TFWP_Dosed, 10, 2));
      AV51TFWP_Dosed_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFWP_Dosed_To", GXutil.ltrimstr( AV51TFWP_Dosed_To, 10, 2));
      AV52TFWP_ProdBatchCode = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFWP_ProdBatchCode", AV52TFWP_ProdBatchCode);
      AV53TFWP_ProdBatchCode_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFWP_ProdBatchCode_Sel", AV53TFWP_ProdBatchCode_Sel);
      AV54TFWP_DosingOrigin = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFWP_DosingOrigin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFWP_DosingOrigin), 5, 0));
      AV55TFWP_DosingOrigin_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFWP_DosingOrigin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFWP_DosingOrigin_To), 5, 0));
      AV56TFWP_StatusCSv = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFWP_StatusCSv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFWP_StatusCSv), 5, 0));
      AV57TFWP_StatusCSv_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFWP_StatusCSv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFWP_StatusCSv_To), 5, 0));
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
      if ( GXutil.strcmp(AV22Session.getValue(AV108Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV108Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV108Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
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
      AV109GXV1 = 1 ;
      while ( AV109GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV109GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_ID") == 0 )
         {
            AV26TFWP_ID = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFWP_ID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFWP_ID), 12, 0));
            AV27TFWP_ID_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFWP_ID_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFWP_ID_To), 12, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_START") == 0 )
         {
            AV28TFWP_Start = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFWP_Start", localUtil.ttoc( AV28TFWP_Start, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV30DDO_WP_StartAuxDate = GXutil.resetTime(AV28TFWP_Start) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30DDO_WP_StartAuxDate", localUtil.format(AV30DDO_WP_StartAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DATE") == 0 )
         {
            AV32TFWP_Date = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFWP_Date", localUtil.ttoc( AV32TFWP_Date, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV34DDO_WP_DateAuxDate = GXutil.resetTime(AV32TFWP_Date) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34DDO_WP_DateAuxDate", localUtil.format(AV34DDO_WP_DateAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_BATCHCODE") == 0 )
         {
            AV36TFWP_BatchCode = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFWP_BatchCode", AV36TFWP_BatchCode);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_BATCHCODE_SEL") == 0 )
         {
            AV37TFWP_BatchCode_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFWP_BatchCode_Sel", AV37TFWP_BatchCode_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_CALLOFFCSV") == 0 )
         {
            AV38TFWP_CallOffCSv = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFWP_CallOffCSv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFWP_CallOffCSv), 5, 0));
            AV39TFWP_CallOffCSv_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFWP_CallOffCSv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFWP_CallOffCSv_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_REDYECSV") == 0 )
         {
            AV40TFWP_ReDyeCSv = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFWP_ReDyeCSv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFWP_ReDyeCSv), 5, 0));
            AV41TFWP_ReDyeCSv_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFWP_ReDyeCSv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFWP_ReDyeCSv_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_MACHINECODE") == 0 )
         {
            AV42TFWP_MachineCode = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFWP_MachineCode", AV42TFWP_MachineCode);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_MACHINECODE_SEL") == 0 )
         {
            AV43TFWP_MachineCode_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFWP_MachineCode_Sel", AV43TFWP_MachineCode_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_TANKCODE") == 0 )
         {
            AV44TFWP_TankCode = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFWP_TankCode", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFWP_TankCode), 5, 0));
            AV45TFWP_TankCode_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFWP_TankCode_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFWP_TankCode_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODUCTCSV") == 0 )
         {
            AV46TFWP_ProductCSv = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFWP_ProductCSv", AV46TFWP_ProductCSv);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODUCTCSV_SEL") == 0 )
         {
            AV47TFWP_ProductCSv_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFWP_ProductCSv_Sel", AV47TFWP_ProductCSv_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_TODOSE") == 0 )
         {
            AV48TFWP_ToDose = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFWP_ToDose", GXutil.ltrimstr( AV48TFWP_ToDose, 10, 2));
            AV49TFWP_ToDose_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFWP_ToDose_To", GXutil.ltrimstr( AV49TFWP_ToDose_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DOSED") == 0 )
         {
            AV50TFWP_Dosed = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFWP_Dosed", GXutil.ltrimstr( AV50TFWP_Dosed, 10, 2));
            AV51TFWP_Dosed_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFWP_Dosed_To", GXutil.ltrimstr( AV51TFWP_Dosed_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODBATCHCODE") == 0 )
         {
            AV52TFWP_ProdBatchCode = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFWP_ProdBatchCode", AV52TFWP_ProdBatchCode);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_PRODBATCHCODE_SEL") == 0 )
         {
            AV53TFWP_ProdBatchCode_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFWP_ProdBatchCode_Sel", AV53TFWP_ProdBatchCode_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_DOSINGORIGIN") == 0 )
         {
            AV54TFWP_DosingOrigin = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFWP_DosingOrigin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFWP_DosingOrigin), 5, 0));
            AV55TFWP_DosingOrigin_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFWP_DosingOrigin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFWP_DosingOrigin_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFWP_STATUSCSV") == 0 )
         {
            AV56TFWP_StatusCSv = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFWP_StatusCSv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFWP_StatusCSv), 5, 0));
            AV57TFWP_StatusCSv_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFWP_StatusCSv_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFWP_StatusCSv_To), 5, 0));
         }
         AV109GXV1 = (int)(AV109GXV1+1) ;
      }
      GXt_char5 = "" ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFWP_BatchCode_Sel)==0), AV37TFWP_BatchCode_Sel, GXv_char6) ;
      consumoscolorservice_wc_impl.this.GXt_char5 = GXv_char6[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFWP_MachineCode_Sel)==0), AV43TFWP_MachineCode_Sel, GXv_char3) ;
      consumoscolorservice_wc_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFWP_ProductCSv_Sel)==0), AV47TFWP_ProductCSv_Sel, GXv_char2) ;
      consumoscolorservice_wc_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFWP_ProdBatchCode_Sel)==0), AV53TFWP_ProdBatchCode_Sel, GXv_char17) ;
      consumoscolorservice_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char5+"|||"+GXt_char14+"||"+GXt_char15+"|||"+GXt_char16+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFWP_BatchCode)==0), AV36TFWP_BatchCode, GXv_char17) ;
      consumoscolorservice_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char6[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFWP_MachineCode)==0), AV42TFWP_MachineCode, GXv_char6) ;
      consumoscolorservice_wc_impl.this.GXt_char15 = GXv_char6[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFWP_ProductCSv)==0), AV46TFWP_ProductCSv, GXv_char3) ;
      consumoscolorservice_wc_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char5 = "" ;
      GXv_char2[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFWP_ProdBatchCode)==0), AV52TFWP_ProdBatchCode, GXv_char2) ;
      consumoscolorservice_wc_impl.this.GXt_char5 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFWP_ID) ? "" : GXutil.str( AV26TFWP_ID, 12, 0))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV28TFWP_Start) ? "" : localUtil.dtoc( AV30DDO_WP_StartAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV32TFWP_Date) ? "" : localUtil.dtoc( AV34DDO_WP_DateAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char16+"|"+((0==AV38TFWP_CallOffCSv) ? "" : GXutil.str( AV38TFWP_CallOffCSv, 5, 0))+"|"+((0==AV40TFWP_ReDyeCSv) ? "" : GXutil.str( AV40TFWP_ReDyeCSv, 5, 0))+"|"+GXt_char15+"|"+((0==AV44TFWP_TankCode) ? "" : GXutil.str( AV44TFWP_TankCode, 5, 0))+"|"+GXt_char14+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFWP_ToDose)==0) ? "" : GXutil.str( AV48TFWP_ToDose, 10, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFWP_Dosed)==0) ? "" : GXutil.str( AV50TFWP_Dosed, 10, 2))+"|"+GXt_char5+"|"+((0==AV54TFWP_DosingOrigin) ? "" : GXutil.str( AV54TFWP_DosingOrigin, 5, 0))+"||"+((0==AV56TFWP_StatusCSv) ? "" : GXutil.str( AV56TFWP_StatusCSv, 5, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFWP_ID_To) ? "" : GXutil.str( AV27TFWP_ID_To, 12, 0))+"||||"+((0==AV39TFWP_CallOffCSv_To) ? "" : GXutil.str( AV39TFWP_CallOffCSv_To, 5, 0))+"|"+((0==AV41TFWP_ReDyeCSv_To) ? "" : GXutil.str( AV41TFWP_ReDyeCSv_To, 5, 0))+"||"+((0==AV45TFWP_TankCode_To) ? "" : GXutil.str( AV45TFWP_TankCode_To, 5, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFWP_ToDose_To)==0) ? "" : GXutil.str( AV49TFWP_ToDose_To, 10, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFWP_Dosed_To)==0) ? "" : GXutil.str( AV51TFWP_Dosed_To, 10, 2))+"||"+((0==AV55TFWP_DosingOrigin_To) ? "" : GXutil.str( AV55TFWP_DosingOrigin_To, 5, 0))+"||"+((0==AV57TFWP_StatusCSv_To) ? "" : GXutil.str( AV57TFWP_StatusCSv_To, 5, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV108Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_ID", "", !((0==AV26TFWP_ID)&&(0==AV27TFWP_ID_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFWP_ID, 12, 0)), GXutil.trim( GXutil.str( AV27TFWP_ID_To, 12, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_START", "", !GXutil.dateCompare(GXutil.nullDate(), AV28TFWP_Start), (short)(0), GXutil.trim( localUtil.ttoc( AV28TFWP_Start, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_DATE", "", !GXutil.dateCompare(GXutil.nullDate(), AV32TFWP_Date), (short)(0), GXutil.trim( localUtil.ttoc( AV32TFWP_Date, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_BATCHCODE", "", !(GXutil.strcmp("", AV36TFWP_BatchCode)==0), (short)(0), AV36TFWP_BatchCode, "", !(GXutil.strcmp("", AV37TFWP_BatchCode_Sel)==0), AV37TFWP_BatchCode_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_CALLOFFCSV", "", !((0==AV38TFWP_CallOffCSv)&&(0==AV39TFWP_CallOffCSv_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFWP_CallOffCSv, 5, 0)), GXutil.trim( GXutil.str( AV39TFWP_CallOffCSv_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_REDYECSV", "", !((0==AV40TFWP_ReDyeCSv)&&(0==AV41TFWP_ReDyeCSv_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFWP_ReDyeCSv, 5, 0)), GXutil.trim( GXutil.str( AV41TFWP_ReDyeCSv_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_MACHINECODE", "", !(GXutil.strcmp("", AV42TFWP_MachineCode)==0), (short)(0), AV42TFWP_MachineCode, "", !(GXutil.strcmp("", AV43TFWP_MachineCode_Sel)==0), AV43TFWP_MachineCode_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_TANKCODE", "", !((0==AV44TFWP_TankCode)&&(0==AV45TFWP_TankCode_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFWP_TankCode, 5, 0)), GXutil.trim( GXutil.str( AV45TFWP_TankCode_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_PRODUCTCSV", "", !(GXutil.strcmp("", AV46TFWP_ProductCSv)==0), (short)(0), AV46TFWP_ProductCSv, "", !(GXutil.strcmp("", AV47TFWP_ProductCSv_Sel)==0), AV47TFWP_ProductCSv_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_TODOSE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFWP_ToDose)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFWP_ToDose_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV48TFWP_ToDose, 10, 2)), GXutil.trim( GXutil.str( AV49TFWP_ToDose_To, 10, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_DOSED", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFWP_Dosed)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFWP_Dosed_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFWP_Dosed, 10, 2)), GXutil.trim( GXutil.str( AV51TFWP_Dosed_To, 10, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_PRODBATCHCODE", "", !(GXutil.strcmp("", AV52TFWP_ProdBatchCode)==0), (short)(0), AV52TFWP_ProdBatchCode, "", !(GXutil.strcmp("", AV53TFWP_ProdBatchCode_Sel)==0), AV53TFWP_ProdBatchCode_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_DOSINGORIGIN", "", !((0==AV54TFWP_DosingOrigin)&&(0==AV55TFWP_DosingOrigin_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFWP_DosingOrigin, 5, 0)), GXutil.trim( GXutil.str( AV55TFWP_DosingOrigin_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFWP_STATUSCSV", "", !((0==AV56TFWP_StatusCSv)&&(0==AV57TFWP_StatusCSv_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFWP_StatusCSv, 5, 0)), GXutil.trim( GXutil.str( AV57TFWP_StatusCSv_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV65WP_Batchcode)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&WP_BATCHCODE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV65WP_Batchcode );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV64EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV64EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV66barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV66barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV67barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV67barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV68barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV68barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV69reclinmaq) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECLINMAQ" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV69reclinmaq, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV108Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV108Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FormulacionTinte.TWeightProduct" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "WP_Batchcode" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV65WP_Batchcode );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1LL2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_1LL2( true) ;
      }
      else
      {
         wb_table2_28_1LL2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_1LL2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1LL2e( true) ;
      }
      else
      {
         wb_table1_23_1LL2e( false) ;
      }
   }

   public void wb_table2_28_1LL2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_38_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\ConsumosColorService_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_1LL2e( true) ;
      }
      else
      {
         wb_table2_28_1LL2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV65WP_Batchcode = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65WP_Batchcode", AV65WP_Batchcode);
      AV64EmprCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64EmprCod", AV64EmprCod);
      AV66barcod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66barcod), 8, 0));
      AV67barcodreo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67barcodreo", GXutil.str( AV67barcodreo, 1, 0));
      AV68barcodpar = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68barcodpar", AV68barcodpar);
      AV69reclinmaq = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69reclinmaq), 4, 0));
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
      pa1LL2( ) ;
      ws1LL2( ) ;
      we1LL2( ) ;
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
      sCtrlAV65WP_Batchcode = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV64EmprCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV66barcod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV67barcodreo = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV68barcodpar = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV69reclinmaq = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1LL2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\consumoscolorservice_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1LL2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV65WP_Batchcode = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65WP_Batchcode", AV65WP_Batchcode);
         AV64EmprCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64EmprCod", AV64EmprCod);
         AV66barcod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66barcod), 8, 0));
         AV67barcodreo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67barcodreo", GXutil.str( AV67barcodreo, 1, 0));
         AV68barcodpar = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68barcodpar", AV68barcodpar);
         AV69reclinmaq = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69reclinmaq), 4, 0));
      }
      wcpOAV65WP_Batchcode = httpContext.cgiGet( sPrefix+"wcpOAV65WP_Batchcode") ;
      wcpOAV64EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV64EmprCod") ;
      wcpOAV66barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV66barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV67barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV67barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV68barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV68barcodpar") ;
      wcpOAV69reclinmaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV69reclinmaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV65WP_Batchcode, wcpOAV65WP_Batchcode) != 0 ) || ( GXutil.strcmp(AV64EmprCod, wcpOAV64EmprCod) != 0 ) || ( AV66barcod != wcpOAV66barcod ) || ( AV67barcodreo != wcpOAV67barcodreo ) || ( GXutil.strcmp(AV68barcodpar, wcpOAV68barcodpar) != 0 ) || ( AV69reclinmaq != wcpOAV69reclinmaq ) ) )
      {
         setjustcreated();
      }
      wcpOAV65WP_Batchcode = AV65WP_Batchcode ;
      wcpOAV64EmprCod = AV64EmprCod ;
      wcpOAV66barcod = AV66barcod ;
      wcpOAV67barcodreo = AV67barcodreo ;
      wcpOAV68barcodpar = AV68barcodpar ;
      wcpOAV69reclinmaq = AV69reclinmaq ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV65WP_Batchcode = httpContext.cgiGet( sPrefix+"AV65WP_Batchcode_CTRL") ;
      if ( GXutil.len( sCtrlAV65WP_Batchcode) > 0 )
      {
         AV65WP_Batchcode = httpContext.cgiGet( sCtrlAV65WP_Batchcode) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65WP_Batchcode", AV65WP_Batchcode);
      }
      else
      {
         AV65WP_Batchcode = httpContext.cgiGet( sPrefix+"AV65WP_Batchcode_PARM") ;
      }
      sCtrlAV64EmprCod = httpContext.cgiGet( sPrefix+"AV64EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV64EmprCod) > 0 )
      {
         AV64EmprCod = httpContext.cgiGet( sCtrlAV64EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64EmprCod", AV64EmprCod);
      }
      else
      {
         AV64EmprCod = httpContext.cgiGet( sPrefix+"AV64EmprCod_PARM") ;
      }
      sCtrlAV66barcod = httpContext.cgiGet( sPrefix+"AV66barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV66barcod) > 0 )
      {
         AV66barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV66barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66barcod), 8, 0));
      }
      else
      {
         AV66barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV66barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV67barcodreo = httpContext.cgiGet( sPrefix+"AV67barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV67barcodreo) > 0 )
      {
         AV67barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV67barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67barcodreo", GXutil.str( AV67barcodreo, 1, 0));
      }
      else
      {
         AV67barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV67barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV68barcodpar = httpContext.cgiGet( sPrefix+"AV68barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV68barcodpar) > 0 )
      {
         AV68barcodpar = httpContext.cgiGet( sCtrlAV68barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68barcodpar", AV68barcodpar);
      }
      else
      {
         AV68barcodpar = httpContext.cgiGet( sPrefix+"AV68barcodpar_PARM") ;
      }
      sCtrlAV69reclinmaq = httpContext.cgiGet( sPrefix+"AV69reclinmaq_CTRL") ;
      if ( GXutil.len( sCtrlAV69reclinmaq) > 0 )
      {
         AV69reclinmaq = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV69reclinmaq), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69reclinmaq), 4, 0));
      }
      else
      {
         AV69reclinmaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV69reclinmaq_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1LL2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1LL2( ) ;
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
      ws1LL2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65WP_Batchcode_PARM", AV65WP_Batchcode);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65WP_Batchcode)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65WP_Batchcode_CTRL", GXutil.rtrim( sCtrlAV65WP_Batchcode));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64EmprCod_PARM", GXutil.rtrim( AV64EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64EmprCod_CTRL", GXutil.rtrim( sCtrlAV64EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV66barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66barcod_CTRL", GXutil.rtrim( sCtrlAV66barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV67barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV67barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV67barcodreo_CTRL", GXutil.rtrim( sCtrlAV67barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68barcodpar_PARM", GXutil.rtrim( AV68barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV68barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV68barcodpar_CTRL", GXutil.rtrim( sCtrlAV68barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69reclinmaq_PARM", GXutil.ltrim( localUtil.ntoc( AV69reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV69reclinmaq)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV69reclinmaq_CTRL", GXutil.rtrim( sCtrlAV69reclinmaq));
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
      we1LL2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115561343", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/consumoscolorservice_wc.js", "?202682115561343", false, true);
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

   public void subsflControlProps_382( )
   {
      edtWP_ID_Internalname = sPrefix+"WP_ID_"+sGXsfl_38_idx ;
      edtWP_Start_Internalname = sPrefix+"WP_START_"+sGXsfl_38_idx ;
      edtWP_Date_Internalname = sPrefix+"WP_DATE_"+sGXsfl_38_idx ;
      edtWP_BatchCo_Internalname = sPrefix+"WP_BATCHCO_"+sGXsfl_38_idx ;
      edtWP_CallOff_Internalname = sPrefix+"WP_CALLOFF_"+sGXsfl_38_idx ;
      edtWP_ReDyeCS_Internalname = sPrefix+"WP_REDYECS_"+sGXsfl_38_idx ;
      edtWP_Machine_Internalname = sPrefix+"WP_MACHINE_"+sGXsfl_38_idx ;
      edtWP_TankCod_Internalname = sPrefix+"WP_TANKCOD_"+sGXsfl_38_idx ;
      edtWP_Product_Internalname = sPrefix+"WP_PRODUCT_"+sGXsfl_38_idx ;
      edtWP_ToDose_Internalname = sPrefix+"WP_TODOSE_"+sGXsfl_38_idx ;
      edtWP_Dosed_Internalname = sPrefix+"WP_DOSED_"+sGXsfl_38_idx ;
      edtWP_ProdBat_Internalname = sPrefix+"WP_PRODBAT_"+sGXsfl_38_idx ;
      edtWP_DosingO_Internalname = sPrefix+"WP_DOSINGO_"+sGXsfl_38_idx ;
      edtavComentario_Internalname = sPrefix+"vCOMENTARIO_"+sGXsfl_38_idx ;
      edtWP_StatusC_Internalname = sPrefix+"WP_STATUSC_"+sGXsfl_38_idx ;
      edtavReclin_Internalname = sPrefix+"vRECLIN_"+sGXsfl_38_idx ;
   }

   public void subsflControlProps_fel_382( )
   {
      edtWP_ID_Internalname = sPrefix+"WP_ID_"+sGXsfl_38_fel_idx ;
      edtWP_Start_Internalname = sPrefix+"WP_START_"+sGXsfl_38_fel_idx ;
      edtWP_Date_Internalname = sPrefix+"WP_DATE_"+sGXsfl_38_fel_idx ;
      edtWP_BatchCo_Internalname = sPrefix+"WP_BATCHCO_"+sGXsfl_38_fel_idx ;
      edtWP_CallOff_Internalname = sPrefix+"WP_CALLOFF_"+sGXsfl_38_fel_idx ;
      edtWP_ReDyeCS_Internalname = sPrefix+"WP_REDYECS_"+sGXsfl_38_fel_idx ;
      edtWP_Machine_Internalname = sPrefix+"WP_MACHINE_"+sGXsfl_38_fel_idx ;
      edtWP_TankCod_Internalname = sPrefix+"WP_TANKCOD_"+sGXsfl_38_fel_idx ;
      edtWP_Product_Internalname = sPrefix+"WP_PRODUCT_"+sGXsfl_38_fel_idx ;
      edtWP_ToDose_Internalname = sPrefix+"WP_TODOSE_"+sGXsfl_38_fel_idx ;
      edtWP_Dosed_Internalname = sPrefix+"WP_DOSED_"+sGXsfl_38_fel_idx ;
      edtWP_ProdBat_Internalname = sPrefix+"WP_PRODBAT_"+sGXsfl_38_fel_idx ;
      edtWP_DosingO_Internalname = sPrefix+"WP_DOSINGO_"+sGXsfl_38_fel_idx ;
      edtavComentario_Internalname = sPrefix+"vCOMENTARIO_"+sGXsfl_38_fel_idx ;
      edtWP_StatusC_Internalname = sPrefix+"WP_STATUSC_"+sGXsfl_38_fel_idx ;
      edtavReclin_Internalname = sPrefix+"vRECLIN_"+sGXsfl_38_fel_idx ;
   }

   public void sendrow_382( )
   {
      subsflControlProps_382( ) ;
      wb1LL0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_38_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_38_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_38_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtWP_ID_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A13948WP_ID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13948WP_ID), "ZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_ID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtWP_ID_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtWP_Start_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_Start_Internalname,localUtil.ttoc( A13949WP_Start, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13949WP_Start, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_Start_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtWP_Start_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtWP_Date_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_Date_Internalname,localUtil.ttoc( A13950WP_Date, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13950WP_Date, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_Date_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtWP_Date_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtWP_BatchCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_BatchCo_Internalname,A13951WP_BatchCo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_BatchCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtWP_BatchCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtWP_CallOff_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_CallOff_Internalname,GXutil.ltrim( localUtil.ntoc( A13952WP_CallOff, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13952WP_CallOff), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_CallOff_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtWP_CallOff_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtWP_ReDyeCS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_ReDyeCS_Internalname,GXutil.ltrim( localUtil.ntoc( A13953WP_ReDyeCS, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13953WP_ReDyeCS), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_ReDyeCS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtWP_ReDyeCS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtWP_Machine_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_Machine_Internalname,A13954WP_Machine,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_Machine_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtWP_Machine_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtWP_TankCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_TankCod_Internalname,GXutil.ltrim( localUtil.ntoc( A13955WP_TankCod, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13955WP_TankCod), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_TankCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtWP_TankCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtWP_Product_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_Product_Internalname,A13956WP_Product,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_Product_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtWP_Product_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtWP_ToDose_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_ToDose_Internalname,GXutil.ltrim( localUtil.ntoc( A13957WP_ToDose, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13957WP_ToDose, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_ToDose_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtWP_ToDose_Columnclass,edtWP_ToDose_Columnheaderclass,Integer.valueOf(edtWP_ToDose_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtWP_Dosed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_Dosed_Internalname,GXutil.ltrim( localUtil.ntoc( A13958WP_Dosed, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13958WP_Dosed, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_Dosed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtWP_Dosed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtWP_ProdBat_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_ProdBat_Internalname,A13959WP_ProdBat,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_ProdBat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtWP_ProdBat_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtWP_DosingO_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_DosingO_Internalname,GXutil.ltrim( localUtil.ntoc( A13960WP_DosingO, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13960WP_DosingO), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_DosingO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtWP_DosingO_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavComentario_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavComentario_Internalname,GXutil.rtrim( AV70comentario),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavComentario_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(edtavComentario_Visible),Integer.valueOf(edtavComentario_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtWP_StatusC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtWP_StatusC_Internalname,GXutil.ltrim( localUtil.ntoc( A13961WP_StatusC, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13961WP_StatusC), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtWP_StatusC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtWP_StatusC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavReclin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavReclin_Internalname,GXutil.ltrim( localUtil.ntoc( AV71RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavReclin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV71RecLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV71RecLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavReclin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(edtavReclin_Visible),Integer.valueOf(edtavReclin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(38),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1LL2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_38_idx = ((subGrid_Islastpage==1)&&(nGXsfl_38_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_38_idx+1) ;
         sGXsfl_38_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_38_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_382( ) ;
      }
      /* End function sendrow_382 */
   }

   public void startgridcontrol38( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"38\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_ID_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_Start_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Date Time Start", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_Date_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Date Time", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_BatchCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Batch Code", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_CallOff_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Call Off", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_ReDyeCS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Re Dye", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_Machine_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Machine", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_TankCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tank", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_Product_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Product", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_ToDose_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "To Dose", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_Dosed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dosed", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_ProdBat_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Batch", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_DosingO_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dosing Origin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavComentario_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtWP_StatusC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Status", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavReclin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Txp", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13948WP_ID, (byte)(12), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_ID_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A13949WP_Start, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_Start_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A13950WP_Date, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_Date_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13951WP_BatchCo);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_BatchCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13952WP_CallOff, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_CallOff_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13953WP_ReDyeCS, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_ReDyeCS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13954WP_Machine);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_Machine_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13955WP_TankCod, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_TankCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13956WP_Product);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_Product_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13957WP_ToDose, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtWP_ToDose_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtWP_ToDose_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_ToDose_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13958WP_Dosed, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_Dosed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13959WP_ProdBat);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_ProdBat_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13960WP_DosingO, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_DosingO_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV70comentario));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavComentario_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavComentario_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13961WP_StatusC, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtWP_StatusC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV71RecLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavReclin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavReclin_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtWP_ID_Internalname = sPrefix+"WP_ID" ;
      edtWP_Start_Internalname = sPrefix+"WP_START" ;
      edtWP_Date_Internalname = sPrefix+"WP_DATE" ;
      edtWP_BatchCo_Internalname = sPrefix+"WP_BATCHCO" ;
      edtWP_CallOff_Internalname = sPrefix+"WP_CALLOFF" ;
      edtWP_ReDyeCS_Internalname = sPrefix+"WP_REDYECS" ;
      edtWP_Machine_Internalname = sPrefix+"WP_MACHINE" ;
      edtWP_TankCod_Internalname = sPrefix+"WP_TANKCOD" ;
      edtWP_Product_Internalname = sPrefix+"WP_PRODUCT" ;
      edtWP_ToDose_Internalname = sPrefix+"WP_TODOSE" ;
      edtWP_Dosed_Internalname = sPrefix+"WP_DOSED" ;
      edtWP_ProdBat_Internalname = sPrefix+"WP_PRODBAT" ;
      edtWP_DosingO_Internalname = sPrefix+"WP_DOSINGO" ;
      edtavComentario_Internalname = sPrefix+"vCOMENTARIO" ;
      edtWP_StatusC_Internalname = sPrefix+"WP_STATUSC" ;
      edtavReclin_Internalname = sPrefix+"vRECLIN" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_wp_startauxdate_Internalname = sPrefix+"vDDO_WP_STARTAUXDATE" ;
      divDdo_wp_startauxdates_Internalname = sPrefix+"DDO_WP_STARTAUXDATES" ;
      edtavDdo_wp_dateauxdate_Internalname = sPrefix+"vDDO_WP_DATEAUXDATE" ;
      divDdo_wp_dateauxdates_Internalname = sPrefix+"DDO_WP_DATEAUXDATES" ;
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
      edtavReclin_Jsonclick = "" ;
      edtavReclin_Enabled = 0 ;
      edtWP_StatusC_Jsonclick = "" ;
      edtavComentario_Jsonclick = "" ;
      edtavComentario_Enabled = 0 ;
      edtWP_DosingO_Jsonclick = "" ;
      edtWP_ProdBat_Jsonclick = "" ;
      edtWP_Dosed_Jsonclick = "" ;
      edtWP_ToDose_Jsonclick = "" ;
      edtWP_ToDose_Columnclass = "WWColumn TagColumn hidden-xs" ;
      edtWP_Product_Jsonclick = "" ;
      edtWP_TankCod_Jsonclick = "" ;
      edtWP_Machine_Jsonclick = "" ;
      edtWP_ReDyeCS_Jsonclick = "" ;
      edtWP_CallOff_Jsonclick = "" ;
      edtWP_BatchCo_Jsonclick = "" ;
      edtWP_Date_Jsonclick = "" ;
      edtWP_Start_Jsonclick = "" ;
      edtWP_ID_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtWP_ToDose_Columnheaderclass = "" ;
      edtavReclin_Visible = -1 ;
      edtWP_StatusC_Visible = -1 ;
      edtavComentario_Visible = -1 ;
      edtWP_DosingO_Visible = -1 ;
      edtWP_ProdBat_Visible = -1 ;
      edtWP_Dosed_Visible = -1 ;
      edtWP_ToDose_Visible = -1 ;
      edtWP_Product_Visible = -1 ;
      edtWP_TankCod_Visible = -1 ;
      edtWP_Machine_Visible = -1 ;
      edtWP_ReDyeCS_Visible = -1 ;
      edtWP_CallOff_Visible = -1 ;
      edtWP_BatchCo_Visible = -1 ;
      edtWP_Date_Visible = -1 ;
      edtWP_Start_Visible = -1 ;
      edtWP_ID_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_wp_dateauxdate_Jsonclick = "" ;
      edtavDdo_wp_startauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "FormulacionTinte.ConsumosColorService_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic|||Dynamic||Dynamic|||Dynamic||||" ;
      Ddo_grid_Includedatalist = "|||T|||T||T|||T||||" ;
      Ddo_grid_Filterisrange = "T||||T|T||T||T|T||T||T|" ;
      Ddo_grid_Filtertype = "Numeric|Date|Date|Character|Numeric|Numeric|Character|Numeric|Character|Numeric|Numeric|Character|Numeric||Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T||T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|T||T|" ;
      Ddo_grid_Columnssortvalues = "3|4|5|1|2|6|7|8|9|10|11|12|13||14|" ;
      Ddo_grid_Columnids = "0:WP_ID|1:WP_Start|2:WP_Date|3:WP_BatchCode|4:WP_CallOffCSv|5:WP_ReDyeCSv|6:WP_MachineCode|7:WP_TankCode|8:WP_ProductCSv|9:WP_ToDose|10:WP_Dosed|11:WP_ProdBatchCode|12:WP_DosingOrigin|13:comentario|14:WP_StatusCSv|15:RecLin" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A2394RecForNro',fld:'RECFORNRO',pic:'Z9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV65WP_Batchcode',fld:'vWP_BATCHCODE',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFWP_ID',fld:'vTFWP_ID',pic:'ZZZZZZZZZZZ9'},{av:'AV27TFWP_ID_To',fld:'vTFWP_ID_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV28TFWP_Start',fld:'vTFWP_START',pic:'99/99/99 99:99'},{av:'AV32TFWP_Date',fld:'vTFWP_DATE',pic:'99/99/99 99:99'},{av:'AV36TFWP_BatchCode',fld:'vTFWP_BATCHCODE',pic:''},{av:'AV37TFWP_BatchCode_Sel',fld:'vTFWP_BATCHCODE_SEL',pic:''},{av:'AV38TFWP_CallOffCSv',fld:'vTFWP_CALLOFFCSV',pic:'ZZZZ9'},{av:'AV39TFWP_CallOffCSv_To',fld:'vTFWP_CALLOFFCSV_TO',pic:'ZZZZ9'},{av:'AV40TFWP_ReDyeCSv',fld:'vTFWP_REDYECSV',pic:'ZZZZ9'},{av:'AV41TFWP_ReDyeCSv_To',fld:'vTFWP_REDYECSV_TO',pic:'ZZZZ9'},{av:'AV42TFWP_MachineCode',fld:'vTFWP_MACHINECODE',pic:''},{av:'AV43TFWP_MachineCode_Sel',fld:'vTFWP_MACHINECODE_SEL',pic:''},{av:'AV44TFWP_TankCode',fld:'vTFWP_TANKCODE',pic:'ZZZZ9'},{av:'AV45TFWP_TankCode_To',fld:'vTFWP_TANKCODE_TO',pic:'ZZZZ9'},{av:'AV46TFWP_ProductCSv',fld:'vTFWP_PRODUCTCSV',pic:''},{av:'AV47TFWP_ProductCSv_Sel',fld:'vTFWP_PRODUCTCSV_SEL',pic:''},{av:'AV48TFWP_ToDose',fld:'vTFWP_TODOSE',pic:'ZZZZZZ9.99'},{av:'AV49TFWP_ToDose_To',fld:'vTFWP_TODOSE_TO',pic:'ZZZZZZ9.99'},{av:'AV50TFWP_Dosed',fld:'vTFWP_DOSED',pic:'ZZZZZZ9.99'},{av:'AV51TFWP_Dosed_To',fld:'vTFWP_DOSED_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFWP_ProdBatchCode',fld:'vTFWP_PRODBATCHCODE',pic:''},{av:'AV53TFWP_ProdBatchCode_Sel',fld:'vTFWP_PRODBATCHCODE_SEL',pic:''},{av:'AV54TFWP_DosingOrigin',fld:'vTFWP_DOSINGORIGIN',pic:'ZZZZ9'},{av:'AV55TFWP_DosingOrigin_To',fld:'vTFWP_DOSINGORIGIN_TO',pic:'ZZZZ9'},{av:'AV56TFWP_StatusCSv',fld:'vTFWP_STATUSCSV',pic:'ZZZZ9'},{av:'AV57TFWP_StatusCSv_To',fld:'vTFWP_STATUSCSV_TO',pic:'ZZZZ9'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV67barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV68barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV108Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtWP_ID_Visible',ctrl:'WP_ID',prop:'Visible'},{av:'edtWP_Start_Visible',ctrl:'WP_START',prop:'Visible'},{av:'edtWP_Date_Visible',ctrl:'WP_DATE',prop:'Visible'},{av:'edtWP_BatchCo_Visible',ctrl:'WP_BATCHCO',prop:'Visible'},{av:'edtWP_CallOff_Visible',ctrl:'WP_CALLOFF',prop:'Visible'},{av:'edtWP_ReDyeCS_Visible',ctrl:'WP_REDYECS',prop:'Visible'},{av:'edtWP_Machine_Visible',ctrl:'WP_MACHINE',prop:'Visible'},{av:'edtWP_TankCod_Visible',ctrl:'WP_TANKCOD',prop:'Visible'},{av:'edtWP_Product_Visible',ctrl:'WP_PRODUCT',prop:'Visible'},{av:'edtWP_ToDose_Visible',ctrl:'WP_TODOSE',prop:'Visible'},{av:'edtWP_Dosed_Visible',ctrl:'WP_DOSED',prop:'Visible'},{av:'edtWP_ProdBat_Visible',ctrl:'WP_PRODBAT',prop:'Visible'},{av:'edtWP_DosingO_Visible',ctrl:'WP_DOSINGO',prop:'Visible'},{av:'edtavComentario_Visible',ctrl:'vCOMENTARIO',prop:'Visible'},{av:'edtWP_StatusC_Visible',ctrl:'WP_STATUSC',prop:'Visible'},{av:'edtavReclin_Visible',ctrl:'vRECLIN',prop:'Visible'},{av:'edtWP_ToDose_Columnheaderclass',ctrl:'WP_TODOSE',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e121LL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV65WP_Batchcode',fld:'vWP_BATCHCODE',pic:''},{av:'AV26TFWP_ID',fld:'vTFWP_ID',pic:'ZZZZZZZZZZZ9'},{av:'AV27TFWP_ID_To',fld:'vTFWP_ID_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV28TFWP_Start',fld:'vTFWP_START',pic:'99/99/99 99:99'},{av:'AV32TFWP_Date',fld:'vTFWP_DATE',pic:'99/99/99 99:99'},{av:'AV36TFWP_BatchCode',fld:'vTFWP_BATCHCODE',pic:''},{av:'AV37TFWP_BatchCode_Sel',fld:'vTFWP_BATCHCODE_SEL',pic:''},{av:'AV38TFWP_CallOffCSv',fld:'vTFWP_CALLOFFCSV',pic:'ZZZZ9'},{av:'AV39TFWP_CallOffCSv_To',fld:'vTFWP_CALLOFFCSV_TO',pic:'ZZZZ9'},{av:'AV40TFWP_ReDyeCSv',fld:'vTFWP_REDYECSV',pic:'ZZZZ9'},{av:'AV41TFWP_ReDyeCSv_To',fld:'vTFWP_REDYECSV_TO',pic:'ZZZZ9'},{av:'AV42TFWP_MachineCode',fld:'vTFWP_MACHINECODE',pic:''},{av:'AV43TFWP_MachineCode_Sel',fld:'vTFWP_MACHINECODE_SEL',pic:''},{av:'AV44TFWP_TankCode',fld:'vTFWP_TANKCODE',pic:'ZZZZ9'},{av:'AV45TFWP_TankCode_To',fld:'vTFWP_TANKCODE_TO',pic:'ZZZZ9'},{av:'AV46TFWP_ProductCSv',fld:'vTFWP_PRODUCTCSV',pic:''},{av:'AV47TFWP_ProductCSv_Sel',fld:'vTFWP_PRODUCTCSV_SEL',pic:''},{av:'AV48TFWP_ToDose',fld:'vTFWP_TODOSE',pic:'ZZZZZZ9.99'},{av:'AV49TFWP_ToDose_To',fld:'vTFWP_TODOSE_TO',pic:'ZZZZZZ9.99'},{av:'AV50TFWP_Dosed',fld:'vTFWP_DOSED',pic:'ZZZZZZ9.99'},{av:'AV51TFWP_Dosed_To',fld:'vTFWP_DOSED_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFWP_ProdBatchCode',fld:'vTFWP_PRODBATCHCODE',pic:''},{av:'AV53TFWP_ProdBatchCode_Sel',fld:'vTFWP_PRODBATCHCODE_SEL',pic:''},{av:'AV54TFWP_DosingOrigin',fld:'vTFWP_DOSINGORIGIN',pic:'ZZZZ9'},{av:'AV55TFWP_DosingOrigin_To',fld:'vTFWP_DOSINGORIGIN_TO',pic:'ZZZZ9'},{av:'AV56TFWP_StatusCSv',fld:'vTFWP_STATUSCSV',pic:'ZZZZ9'},{av:'AV57TFWP_StatusCSv_To',fld:'vTFWP_STATUSCSV_TO',pic:'ZZZZ9'},{av:'AV108Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV67barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV68barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A2394RecForNro',fld:'RECFORNRO',pic:'Z9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFWP_StatusCSv',fld:'vTFWP_STATUSCSV',pic:'ZZZZ9'},{av:'AV57TFWP_StatusCSv_To',fld:'vTFWP_STATUSCSV_TO',pic:'ZZZZ9'},{av:'AV54TFWP_DosingOrigin',fld:'vTFWP_DOSINGORIGIN',pic:'ZZZZ9'},{av:'AV55TFWP_DosingOrigin_To',fld:'vTFWP_DOSINGORIGIN_TO',pic:'ZZZZ9'},{av:'AV52TFWP_ProdBatchCode',fld:'vTFWP_PRODBATCHCODE',pic:''},{av:'AV53TFWP_ProdBatchCode_Sel',fld:'vTFWP_PRODBATCHCODE_SEL',pic:''},{av:'AV50TFWP_Dosed',fld:'vTFWP_DOSED',pic:'ZZZZZZ9.99'},{av:'AV51TFWP_Dosed_To',fld:'vTFWP_DOSED_TO',pic:'ZZZZZZ9.99'},{av:'AV48TFWP_ToDose',fld:'vTFWP_TODOSE',pic:'ZZZZZZ9.99'},{av:'AV49TFWP_ToDose_To',fld:'vTFWP_TODOSE_TO',pic:'ZZZZZZ9.99'},{av:'AV46TFWP_ProductCSv',fld:'vTFWP_PRODUCTCSV',pic:''},{av:'AV47TFWP_ProductCSv_Sel',fld:'vTFWP_PRODUCTCSV_SEL',pic:''},{av:'AV44TFWP_TankCode',fld:'vTFWP_TANKCODE',pic:'ZZZZ9'},{av:'AV45TFWP_TankCode_To',fld:'vTFWP_TANKCODE_TO',pic:'ZZZZ9'},{av:'AV42TFWP_MachineCode',fld:'vTFWP_MACHINECODE',pic:''},{av:'AV43TFWP_MachineCode_Sel',fld:'vTFWP_MACHINECODE_SEL',pic:''},{av:'AV40TFWP_ReDyeCSv',fld:'vTFWP_REDYECSV',pic:'ZZZZ9'},{av:'AV41TFWP_ReDyeCSv_To',fld:'vTFWP_REDYECSV_TO',pic:'ZZZZ9'},{av:'AV38TFWP_CallOffCSv',fld:'vTFWP_CALLOFFCSV',pic:'ZZZZ9'},{av:'AV39TFWP_CallOffCSv_To',fld:'vTFWP_CALLOFFCSV_TO',pic:'ZZZZ9'},{av:'AV36TFWP_BatchCode',fld:'vTFWP_BATCHCODE',pic:''},{av:'AV37TFWP_BatchCode_Sel',fld:'vTFWP_BATCHCODE_SEL',pic:''},{av:'AV32TFWP_Date',fld:'vTFWP_DATE',pic:'99/99/99 99:99'},{av:'AV28TFWP_Start',fld:'vTFWP_START',pic:'99/99/99 99:99'},{av:'AV26TFWP_ID',fld:'vTFWP_ID',pic:'ZZZZZZZZZZZ9'},{av:'AV27TFWP_ID_To',fld:'vTFWP_ID_TO',pic:'ZZZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181LL2',iparms:[{av:'A13960WP_DosingO',fld:'WP_DOSINGO',pic:'ZZZZ9'},{av:'A13952WP_CallOff',fld:'WP_CALLOFF',pic:'ZZZZ9'},{av:'A13956WP_Product',fld:'WP_PRODUCT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV67barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV68barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'A2394RecForNro',fld:'RECFORNRO',pic:'Z9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A13957WP_ToDose',fld:'WP_TODOSE',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV70comentario',fld:'vCOMENTARIO',pic:''},{av:'AV71RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'edtWP_ToDose_Columnclass',ctrl:'WP_TODOSE',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e131LL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV65WP_Batchcode',fld:'vWP_BATCHCODE',pic:''},{av:'AV26TFWP_ID',fld:'vTFWP_ID',pic:'ZZZZZZZZZZZ9'},{av:'AV27TFWP_ID_To',fld:'vTFWP_ID_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV28TFWP_Start',fld:'vTFWP_START',pic:'99/99/99 99:99'},{av:'AV32TFWP_Date',fld:'vTFWP_DATE',pic:'99/99/99 99:99'},{av:'AV36TFWP_BatchCode',fld:'vTFWP_BATCHCODE',pic:''},{av:'AV37TFWP_BatchCode_Sel',fld:'vTFWP_BATCHCODE_SEL',pic:''},{av:'AV38TFWP_CallOffCSv',fld:'vTFWP_CALLOFFCSV',pic:'ZZZZ9'},{av:'AV39TFWP_CallOffCSv_To',fld:'vTFWP_CALLOFFCSV_TO',pic:'ZZZZ9'},{av:'AV40TFWP_ReDyeCSv',fld:'vTFWP_REDYECSV',pic:'ZZZZ9'},{av:'AV41TFWP_ReDyeCSv_To',fld:'vTFWP_REDYECSV_TO',pic:'ZZZZ9'},{av:'AV42TFWP_MachineCode',fld:'vTFWP_MACHINECODE',pic:''},{av:'AV43TFWP_MachineCode_Sel',fld:'vTFWP_MACHINECODE_SEL',pic:''},{av:'AV44TFWP_TankCode',fld:'vTFWP_TANKCODE',pic:'ZZZZ9'},{av:'AV45TFWP_TankCode_To',fld:'vTFWP_TANKCODE_TO',pic:'ZZZZ9'},{av:'AV46TFWP_ProductCSv',fld:'vTFWP_PRODUCTCSV',pic:''},{av:'AV47TFWP_ProductCSv_Sel',fld:'vTFWP_PRODUCTCSV_SEL',pic:''},{av:'AV48TFWP_ToDose',fld:'vTFWP_TODOSE',pic:'ZZZZZZ9.99'},{av:'AV49TFWP_ToDose_To',fld:'vTFWP_TODOSE_TO',pic:'ZZZZZZ9.99'},{av:'AV50TFWP_Dosed',fld:'vTFWP_DOSED',pic:'ZZZZZZ9.99'},{av:'AV51TFWP_Dosed_To',fld:'vTFWP_DOSED_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFWP_ProdBatchCode',fld:'vTFWP_PRODBATCHCODE',pic:''},{av:'AV53TFWP_ProdBatchCode_Sel',fld:'vTFWP_PRODBATCHCODE_SEL',pic:''},{av:'AV54TFWP_DosingOrigin',fld:'vTFWP_DOSINGORIGIN',pic:'ZZZZ9'},{av:'AV55TFWP_DosingOrigin_To',fld:'vTFWP_DOSINGORIGIN_TO',pic:'ZZZZ9'},{av:'AV56TFWP_StatusCSv',fld:'vTFWP_STATUSCSV',pic:'ZZZZ9'},{av:'AV57TFWP_StatusCSv_To',fld:'vTFWP_STATUSCSV_TO',pic:'ZZZZ9'},{av:'AV108Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV67barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV68barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A2394RecForNro',fld:'RECFORNRO',pic:'Z9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtWP_ID_Visible',ctrl:'WP_ID',prop:'Visible'},{av:'edtWP_Start_Visible',ctrl:'WP_START',prop:'Visible'},{av:'edtWP_Date_Visible',ctrl:'WP_DATE',prop:'Visible'},{av:'edtWP_BatchCo_Visible',ctrl:'WP_BATCHCO',prop:'Visible'},{av:'edtWP_CallOff_Visible',ctrl:'WP_CALLOFF',prop:'Visible'},{av:'edtWP_ReDyeCS_Visible',ctrl:'WP_REDYECS',prop:'Visible'},{av:'edtWP_Machine_Visible',ctrl:'WP_MACHINE',prop:'Visible'},{av:'edtWP_TankCod_Visible',ctrl:'WP_TANKCOD',prop:'Visible'},{av:'edtWP_Product_Visible',ctrl:'WP_PRODUCT',prop:'Visible'},{av:'edtWP_ToDose_Visible',ctrl:'WP_TODOSE',prop:'Visible'},{av:'edtWP_Dosed_Visible',ctrl:'WP_DOSED',prop:'Visible'},{av:'edtWP_ProdBat_Visible',ctrl:'WP_PRODBAT',prop:'Visible'},{av:'edtWP_DosingO_Visible',ctrl:'WP_DOSINGO',prop:'Visible'},{av:'edtavComentario_Visible',ctrl:'vCOMENTARIO',prop:'Visible'},{av:'edtWP_StatusC_Visible',ctrl:'WP_STATUSC',prop:'Visible'},{av:'edtavReclin_Visible',ctrl:'vRECLIN',prop:'Visible'},{av:'edtWP_ToDose_Columnheaderclass',ctrl:'WP_TODOSE',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111LL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV65WP_Batchcode',fld:'vWP_BATCHCODE',pic:''},{av:'AV26TFWP_ID',fld:'vTFWP_ID',pic:'ZZZZZZZZZZZ9'},{av:'AV27TFWP_ID_To',fld:'vTFWP_ID_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV28TFWP_Start',fld:'vTFWP_START',pic:'99/99/99 99:99'},{av:'AV32TFWP_Date',fld:'vTFWP_DATE',pic:'99/99/99 99:99'},{av:'AV36TFWP_BatchCode',fld:'vTFWP_BATCHCODE',pic:''},{av:'AV37TFWP_BatchCode_Sel',fld:'vTFWP_BATCHCODE_SEL',pic:''},{av:'AV38TFWP_CallOffCSv',fld:'vTFWP_CALLOFFCSV',pic:'ZZZZ9'},{av:'AV39TFWP_CallOffCSv_To',fld:'vTFWP_CALLOFFCSV_TO',pic:'ZZZZ9'},{av:'AV40TFWP_ReDyeCSv',fld:'vTFWP_REDYECSV',pic:'ZZZZ9'},{av:'AV41TFWP_ReDyeCSv_To',fld:'vTFWP_REDYECSV_TO',pic:'ZZZZ9'},{av:'AV42TFWP_MachineCode',fld:'vTFWP_MACHINECODE',pic:''},{av:'AV43TFWP_MachineCode_Sel',fld:'vTFWP_MACHINECODE_SEL',pic:''},{av:'AV44TFWP_TankCode',fld:'vTFWP_TANKCODE',pic:'ZZZZ9'},{av:'AV45TFWP_TankCode_To',fld:'vTFWP_TANKCODE_TO',pic:'ZZZZ9'},{av:'AV46TFWP_ProductCSv',fld:'vTFWP_PRODUCTCSV',pic:''},{av:'AV47TFWP_ProductCSv_Sel',fld:'vTFWP_PRODUCTCSV_SEL',pic:''},{av:'AV48TFWP_ToDose',fld:'vTFWP_TODOSE',pic:'ZZZZZZ9.99'},{av:'AV49TFWP_ToDose_To',fld:'vTFWP_TODOSE_TO',pic:'ZZZZZZ9.99'},{av:'AV50TFWP_Dosed',fld:'vTFWP_DOSED',pic:'ZZZZZZ9.99'},{av:'AV51TFWP_Dosed_To',fld:'vTFWP_DOSED_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFWP_ProdBatchCode',fld:'vTFWP_PRODBATCHCODE',pic:''},{av:'AV53TFWP_ProdBatchCode_Sel',fld:'vTFWP_PRODBATCHCODE_SEL',pic:''},{av:'AV54TFWP_DosingOrigin',fld:'vTFWP_DOSINGORIGIN',pic:'ZZZZ9'},{av:'AV55TFWP_DosingOrigin_To',fld:'vTFWP_DOSINGORIGIN_TO',pic:'ZZZZ9'},{av:'AV56TFWP_StatusCSv',fld:'vTFWP_STATUSCSV',pic:'ZZZZ9'},{av:'AV57TFWP_StatusCSv_To',fld:'vTFWP_STATUSCSV_TO',pic:'ZZZZ9'},{av:'AV108Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV67barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV68barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A2394RecForNro',fld:'RECFORNRO',pic:'Z9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV30DDO_WP_StartAuxDate',fld:'vDDO_WP_STARTAUXDATE',pic:''},{av:'AV34DDO_WP_DateAuxDate',fld:'vDDO_WP_DATEAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFWP_ID',fld:'vTFWP_ID',pic:'ZZZZZZZZZZZ9'},{av:'AV27TFWP_ID_To',fld:'vTFWP_ID_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV28TFWP_Start',fld:'vTFWP_START',pic:'99/99/99 99:99'},{av:'AV32TFWP_Date',fld:'vTFWP_DATE',pic:'99/99/99 99:99'},{av:'AV36TFWP_BatchCode',fld:'vTFWP_BATCHCODE',pic:''},{av:'AV37TFWP_BatchCode_Sel',fld:'vTFWP_BATCHCODE_SEL',pic:''},{av:'AV38TFWP_CallOffCSv',fld:'vTFWP_CALLOFFCSV',pic:'ZZZZ9'},{av:'AV39TFWP_CallOffCSv_To',fld:'vTFWP_CALLOFFCSV_TO',pic:'ZZZZ9'},{av:'AV40TFWP_ReDyeCSv',fld:'vTFWP_REDYECSV',pic:'ZZZZ9'},{av:'AV41TFWP_ReDyeCSv_To',fld:'vTFWP_REDYECSV_TO',pic:'ZZZZ9'},{av:'AV42TFWP_MachineCode',fld:'vTFWP_MACHINECODE',pic:''},{av:'AV43TFWP_MachineCode_Sel',fld:'vTFWP_MACHINECODE_SEL',pic:''},{av:'AV44TFWP_TankCode',fld:'vTFWP_TANKCODE',pic:'ZZZZ9'},{av:'AV45TFWP_TankCode_To',fld:'vTFWP_TANKCODE_TO',pic:'ZZZZ9'},{av:'AV46TFWP_ProductCSv',fld:'vTFWP_PRODUCTCSV',pic:''},{av:'AV47TFWP_ProductCSv_Sel',fld:'vTFWP_PRODUCTCSV_SEL',pic:''},{av:'AV48TFWP_ToDose',fld:'vTFWP_TODOSE',pic:'ZZZZZZ9.99'},{av:'AV49TFWP_ToDose_To',fld:'vTFWP_TODOSE_TO',pic:'ZZZZZZ9.99'},{av:'AV50TFWP_Dosed',fld:'vTFWP_DOSED',pic:'ZZZZZZ9.99'},{av:'AV51TFWP_Dosed_To',fld:'vTFWP_DOSED_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFWP_ProdBatchCode',fld:'vTFWP_PRODBATCHCODE',pic:''},{av:'AV53TFWP_ProdBatchCode_Sel',fld:'vTFWP_PRODBATCHCODE_SEL',pic:''},{av:'AV54TFWP_DosingOrigin',fld:'vTFWP_DOSINGORIGIN',pic:'ZZZZ9'},{av:'AV55TFWP_DosingOrigin_To',fld:'vTFWP_DOSINGORIGIN_TO',pic:'ZZZZ9'},{av:'AV56TFWP_StatusCSv',fld:'vTFWP_STATUSCSV',pic:'ZZZZ9'},{av:'AV57TFWP_StatusCSv_To',fld:'vTFWP_STATUSCSV_TO',pic:'ZZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV34DDO_WP_DateAuxDate',fld:'vDDO_WP_DATEAUXDATE',pic:''},{av:'AV30DDO_WP_StartAuxDate',fld:'vDDO_WP_STARTAUXDATE',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtWP_ID_Visible',ctrl:'WP_ID',prop:'Visible'},{av:'edtWP_Start_Visible',ctrl:'WP_START',prop:'Visible'},{av:'edtWP_Date_Visible',ctrl:'WP_DATE',prop:'Visible'},{av:'edtWP_BatchCo_Visible',ctrl:'WP_BATCHCO',prop:'Visible'},{av:'edtWP_CallOff_Visible',ctrl:'WP_CALLOFF',prop:'Visible'},{av:'edtWP_ReDyeCS_Visible',ctrl:'WP_REDYECS',prop:'Visible'},{av:'edtWP_Machine_Visible',ctrl:'WP_MACHINE',prop:'Visible'},{av:'edtWP_TankCod_Visible',ctrl:'WP_TANKCOD',prop:'Visible'},{av:'edtWP_Product_Visible',ctrl:'WP_PRODUCT',prop:'Visible'},{av:'edtWP_ToDose_Visible',ctrl:'WP_TODOSE',prop:'Visible'},{av:'edtWP_Dosed_Visible',ctrl:'WP_DOSED',prop:'Visible'},{av:'edtWP_ProdBat_Visible',ctrl:'WP_PRODBAT',prop:'Visible'},{av:'edtWP_DosingO_Visible',ctrl:'WP_DOSINGO',prop:'Visible'},{av:'edtavComentario_Visible',ctrl:'vCOMENTARIO',prop:'Visible'},{av:'edtWP_StatusC_Visible',ctrl:'WP_STATUSC',prop:'Visible'},{av:'edtavReclin_Visible',ctrl:'vRECLIN',prop:'Visible'},{av:'edtWP_ToDose_Columnheaderclass',ctrl:'WP_TODOSE',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e141LL2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e151LL2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A2394RecForNro',fld:'RECFORNRO',pic:'Z9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV65WP_Batchcode',fld:'vWP_BATCHCODE',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFWP_ID',fld:'vTFWP_ID',pic:'ZZZZZZZZZZZ9'},{av:'AV27TFWP_ID_To',fld:'vTFWP_ID_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV28TFWP_Start',fld:'vTFWP_START',pic:'99/99/99 99:99'},{av:'AV32TFWP_Date',fld:'vTFWP_DATE',pic:'99/99/99 99:99'},{av:'AV36TFWP_BatchCode',fld:'vTFWP_BATCHCODE',pic:''},{av:'AV37TFWP_BatchCode_Sel',fld:'vTFWP_BATCHCODE_SEL',pic:''},{av:'AV38TFWP_CallOffCSv',fld:'vTFWP_CALLOFFCSV',pic:'ZZZZ9'},{av:'AV39TFWP_CallOffCSv_To',fld:'vTFWP_CALLOFFCSV_TO',pic:'ZZZZ9'},{av:'AV40TFWP_ReDyeCSv',fld:'vTFWP_REDYECSV',pic:'ZZZZ9'},{av:'AV41TFWP_ReDyeCSv_To',fld:'vTFWP_REDYECSV_TO',pic:'ZZZZ9'},{av:'AV42TFWP_MachineCode',fld:'vTFWP_MACHINECODE',pic:''},{av:'AV43TFWP_MachineCode_Sel',fld:'vTFWP_MACHINECODE_SEL',pic:''},{av:'AV44TFWP_TankCode',fld:'vTFWP_TANKCODE',pic:'ZZZZ9'},{av:'AV45TFWP_TankCode_To',fld:'vTFWP_TANKCODE_TO',pic:'ZZZZ9'},{av:'AV46TFWP_ProductCSv',fld:'vTFWP_PRODUCTCSV',pic:''},{av:'AV47TFWP_ProductCSv_Sel',fld:'vTFWP_PRODUCTCSV_SEL',pic:''},{av:'AV48TFWP_ToDose',fld:'vTFWP_TODOSE',pic:'ZZZZZZ9.99'},{av:'AV49TFWP_ToDose_To',fld:'vTFWP_TODOSE_TO',pic:'ZZZZZZ9.99'},{av:'AV50TFWP_Dosed',fld:'vTFWP_DOSED',pic:'ZZZZZZ9.99'},{av:'AV51TFWP_Dosed_To',fld:'vTFWP_DOSED_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFWP_ProdBatchCode',fld:'vTFWP_PRODBATCHCODE',pic:''},{av:'AV53TFWP_ProdBatchCode_Sel',fld:'vTFWP_PRODBATCHCODE_SEL',pic:''},{av:'AV54TFWP_DosingOrigin',fld:'vTFWP_DOSINGORIGIN',pic:'ZZZZ9'},{av:'AV55TFWP_DosingOrigin_To',fld:'vTFWP_DOSINGORIGIN_TO',pic:'ZZZZ9'},{av:'AV56TFWP_StatusCSv',fld:'vTFWP_STATUSCSV',pic:'ZZZZ9'},{av:'AV57TFWP_StatusCSv_To',fld:'vTFWP_STATUSCSV_TO',pic:'ZZZZ9'},{av:'AV108Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV67barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV68barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtWP_ID_Visible',ctrl:'WP_ID',prop:'Visible'},{av:'edtWP_Start_Visible',ctrl:'WP_START',prop:'Visible'},{av:'edtWP_Date_Visible',ctrl:'WP_DATE',prop:'Visible'},{av:'edtWP_BatchCo_Visible',ctrl:'WP_BATCHCO',prop:'Visible'},{av:'edtWP_CallOff_Visible',ctrl:'WP_CALLOFF',prop:'Visible'},{av:'edtWP_ReDyeCS_Visible',ctrl:'WP_REDYECS',prop:'Visible'},{av:'edtWP_Machine_Visible',ctrl:'WP_MACHINE',prop:'Visible'},{av:'edtWP_TankCod_Visible',ctrl:'WP_TANKCOD',prop:'Visible'},{av:'edtWP_Product_Visible',ctrl:'WP_PRODUCT',prop:'Visible'},{av:'edtWP_ToDose_Visible',ctrl:'WP_TODOSE',prop:'Visible'},{av:'edtWP_Dosed_Visible',ctrl:'WP_DOSED',prop:'Visible'},{av:'edtWP_ProdBat_Visible',ctrl:'WP_PRODBAT',prop:'Visible'},{av:'edtWP_DosingO_Visible',ctrl:'WP_DOSINGO',prop:'Visible'},{av:'edtavComentario_Visible',ctrl:'vCOMENTARIO',prop:'Visible'},{av:'edtWP_StatusC_Visible',ctrl:'WP_STATUSC',prop:'Visible'},{av:'edtavReclin_Visible',ctrl:'vRECLIN',prop:'Visible'},{av:'edtWP_ToDose_Columnheaderclass',ctrl:'WP_TODOSE',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A2394RecForNro',fld:'RECFORNRO',pic:'Z9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV65WP_Batchcode',fld:'vWP_BATCHCODE',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFWP_ID',fld:'vTFWP_ID',pic:'ZZZZZZZZZZZ9'},{av:'AV27TFWP_ID_To',fld:'vTFWP_ID_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV28TFWP_Start',fld:'vTFWP_START',pic:'99/99/99 99:99'},{av:'AV32TFWP_Date',fld:'vTFWP_DATE',pic:'99/99/99 99:99'},{av:'AV36TFWP_BatchCode',fld:'vTFWP_BATCHCODE',pic:''},{av:'AV37TFWP_BatchCode_Sel',fld:'vTFWP_BATCHCODE_SEL',pic:''},{av:'AV38TFWP_CallOffCSv',fld:'vTFWP_CALLOFFCSV',pic:'ZZZZ9'},{av:'AV39TFWP_CallOffCSv_To',fld:'vTFWP_CALLOFFCSV_TO',pic:'ZZZZ9'},{av:'AV40TFWP_ReDyeCSv',fld:'vTFWP_REDYECSV',pic:'ZZZZ9'},{av:'AV41TFWP_ReDyeCSv_To',fld:'vTFWP_REDYECSV_TO',pic:'ZZZZ9'},{av:'AV42TFWP_MachineCode',fld:'vTFWP_MACHINECODE',pic:''},{av:'AV43TFWP_MachineCode_Sel',fld:'vTFWP_MACHINECODE_SEL',pic:''},{av:'AV44TFWP_TankCode',fld:'vTFWP_TANKCODE',pic:'ZZZZ9'},{av:'AV45TFWP_TankCode_To',fld:'vTFWP_TANKCODE_TO',pic:'ZZZZ9'},{av:'AV46TFWP_ProductCSv',fld:'vTFWP_PRODUCTCSV',pic:''},{av:'AV47TFWP_ProductCSv_Sel',fld:'vTFWP_PRODUCTCSV_SEL',pic:''},{av:'AV48TFWP_ToDose',fld:'vTFWP_TODOSE',pic:'ZZZZZZ9.99'},{av:'AV49TFWP_ToDose_To',fld:'vTFWP_TODOSE_TO',pic:'ZZZZZZ9.99'},{av:'AV50TFWP_Dosed',fld:'vTFWP_DOSED',pic:'ZZZZZZ9.99'},{av:'AV51TFWP_Dosed_To',fld:'vTFWP_DOSED_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFWP_ProdBatchCode',fld:'vTFWP_PRODBATCHCODE',pic:''},{av:'AV53TFWP_ProdBatchCode_Sel',fld:'vTFWP_PRODBATCHCODE_SEL',pic:''},{av:'AV54TFWP_DosingOrigin',fld:'vTFWP_DOSINGORIGIN',pic:'ZZZZ9'},{av:'AV55TFWP_DosingOrigin_To',fld:'vTFWP_DOSINGORIGIN_TO',pic:'ZZZZ9'},{av:'AV56TFWP_StatusCSv',fld:'vTFWP_STATUSCSV',pic:'ZZZZ9'},{av:'AV57TFWP_StatusCSv_To',fld:'vTFWP_STATUSCSV_TO',pic:'ZZZZ9'},{av:'AV108Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV67barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV68barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtWP_ID_Visible',ctrl:'WP_ID',prop:'Visible'},{av:'edtWP_Start_Visible',ctrl:'WP_START',prop:'Visible'},{av:'edtWP_Date_Visible',ctrl:'WP_DATE',prop:'Visible'},{av:'edtWP_BatchCo_Visible',ctrl:'WP_BATCHCO',prop:'Visible'},{av:'edtWP_CallOff_Visible',ctrl:'WP_CALLOFF',prop:'Visible'},{av:'edtWP_ReDyeCS_Visible',ctrl:'WP_REDYECS',prop:'Visible'},{av:'edtWP_Machine_Visible',ctrl:'WP_MACHINE',prop:'Visible'},{av:'edtWP_TankCod_Visible',ctrl:'WP_TANKCOD',prop:'Visible'},{av:'edtWP_Product_Visible',ctrl:'WP_PRODUCT',prop:'Visible'},{av:'edtWP_ToDose_Visible',ctrl:'WP_TODOSE',prop:'Visible'},{av:'edtWP_Dosed_Visible',ctrl:'WP_DOSED',prop:'Visible'},{av:'edtWP_ProdBat_Visible',ctrl:'WP_PRODBAT',prop:'Visible'},{av:'edtWP_DosingO_Visible',ctrl:'WP_DOSINGO',prop:'Visible'},{av:'edtavComentario_Visible',ctrl:'vCOMENTARIO',prop:'Visible'},{av:'edtWP_StatusC_Visible',ctrl:'WP_STATUSC',prop:'Visible'},{av:'edtavReclin_Visible',ctrl:'vRECLIN',prop:'Visible'},{av:'edtWP_ToDose_Columnheaderclass',ctrl:'WP_TODOSE',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A2394RecForNro',fld:'RECFORNRO',pic:'Z9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV65WP_Batchcode',fld:'vWP_BATCHCODE',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFWP_ID',fld:'vTFWP_ID',pic:'ZZZZZZZZZZZ9'},{av:'AV27TFWP_ID_To',fld:'vTFWP_ID_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV28TFWP_Start',fld:'vTFWP_START',pic:'99/99/99 99:99'},{av:'AV32TFWP_Date',fld:'vTFWP_DATE',pic:'99/99/99 99:99'},{av:'AV36TFWP_BatchCode',fld:'vTFWP_BATCHCODE',pic:''},{av:'AV37TFWP_BatchCode_Sel',fld:'vTFWP_BATCHCODE_SEL',pic:''},{av:'AV38TFWP_CallOffCSv',fld:'vTFWP_CALLOFFCSV',pic:'ZZZZ9'},{av:'AV39TFWP_CallOffCSv_To',fld:'vTFWP_CALLOFFCSV_TO',pic:'ZZZZ9'},{av:'AV40TFWP_ReDyeCSv',fld:'vTFWP_REDYECSV',pic:'ZZZZ9'},{av:'AV41TFWP_ReDyeCSv_To',fld:'vTFWP_REDYECSV_TO',pic:'ZZZZ9'},{av:'AV42TFWP_MachineCode',fld:'vTFWP_MACHINECODE',pic:''},{av:'AV43TFWP_MachineCode_Sel',fld:'vTFWP_MACHINECODE_SEL',pic:''},{av:'AV44TFWP_TankCode',fld:'vTFWP_TANKCODE',pic:'ZZZZ9'},{av:'AV45TFWP_TankCode_To',fld:'vTFWP_TANKCODE_TO',pic:'ZZZZ9'},{av:'AV46TFWP_ProductCSv',fld:'vTFWP_PRODUCTCSV',pic:''},{av:'AV47TFWP_ProductCSv_Sel',fld:'vTFWP_PRODUCTCSV_SEL',pic:''},{av:'AV48TFWP_ToDose',fld:'vTFWP_TODOSE',pic:'ZZZZZZ9.99'},{av:'AV49TFWP_ToDose_To',fld:'vTFWP_TODOSE_TO',pic:'ZZZZZZ9.99'},{av:'AV50TFWP_Dosed',fld:'vTFWP_DOSED',pic:'ZZZZZZ9.99'},{av:'AV51TFWP_Dosed_To',fld:'vTFWP_DOSED_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFWP_ProdBatchCode',fld:'vTFWP_PRODBATCHCODE',pic:''},{av:'AV53TFWP_ProdBatchCode_Sel',fld:'vTFWP_PRODBATCHCODE_SEL',pic:''},{av:'AV54TFWP_DosingOrigin',fld:'vTFWP_DOSINGORIGIN',pic:'ZZZZ9'},{av:'AV55TFWP_DosingOrigin_To',fld:'vTFWP_DOSINGORIGIN_TO',pic:'ZZZZ9'},{av:'AV56TFWP_StatusCSv',fld:'vTFWP_STATUSCSV',pic:'ZZZZ9'},{av:'AV57TFWP_StatusCSv_To',fld:'vTFWP_STATUSCSV_TO',pic:'ZZZZ9'},{av:'AV108Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV67barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV68barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtWP_ID_Visible',ctrl:'WP_ID',prop:'Visible'},{av:'edtWP_Start_Visible',ctrl:'WP_START',prop:'Visible'},{av:'edtWP_Date_Visible',ctrl:'WP_DATE',prop:'Visible'},{av:'edtWP_BatchCo_Visible',ctrl:'WP_BATCHCO',prop:'Visible'},{av:'edtWP_CallOff_Visible',ctrl:'WP_CALLOFF',prop:'Visible'},{av:'edtWP_ReDyeCS_Visible',ctrl:'WP_REDYECS',prop:'Visible'},{av:'edtWP_Machine_Visible',ctrl:'WP_MACHINE',prop:'Visible'},{av:'edtWP_TankCod_Visible',ctrl:'WP_TANKCOD',prop:'Visible'},{av:'edtWP_Product_Visible',ctrl:'WP_PRODUCT',prop:'Visible'},{av:'edtWP_ToDose_Visible',ctrl:'WP_TODOSE',prop:'Visible'},{av:'edtWP_Dosed_Visible',ctrl:'WP_DOSED',prop:'Visible'},{av:'edtWP_ProdBat_Visible',ctrl:'WP_PRODBAT',prop:'Visible'},{av:'edtWP_DosingO_Visible',ctrl:'WP_DOSINGO',prop:'Visible'},{av:'edtavComentario_Visible',ctrl:'vCOMENTARIO',prop:'Visible'},{av:'edtWP_StatusC_Visible',ctrl:'WP_STATUSC',prop:'Visible'},{av:'edtavReclin_Visible',ctrl:'vRECLIN',prop:'Visible'},{av:'edtWP_ToDose_Columnheaderclass',ctrl:'WP_TODOSE',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63colorserviceID',fld:'vCOLORSERVICEID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A2394RecForNro',fld:'RECFORNRO',pic:'Z9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV65WP_Batchcode',fld:'vWP_BATCHCODE',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFWP_ID',fld:'vTFWP_ID',pic:'ZZZZZZZZZZZ9'},{av:'AV27TFWP_ID_To',fld:'vTFWP_ID_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV28TFWP_Start',fld:'vTFWP_START',pic:'99/99/99 99:99'},{av:'AV32TFWP_Date',fld:'vTFWP_DATE',pic:'99/99/99 99:99'},{av:'AV36TFWP_BatchCode',fld:'vTFWP_BATCHCODE',pic:''},{av:'AV37TFWP_BatchCode_Sel',fld:'vTFWP_BATCHCODE_SEL',pic:''},{av:'AV38TFWP_CallOffCSv',fld:'vTFWP_CALLOFFCSV',pic:'ZZZZ9'},{av:'AV39TFWP_CallOffCSv_To',fld:'vTFWP_CALLOFFCSV_TO',pic:'ZZZZ9'},{av:'AV40TFWP_ReDyeCSv',fld:'vTFWP_REDYECSV',pic:'ZZZZ9'},{av:'AV41TFWP_ReDyeCSv_To',fld:'vTFWP_REDYECSV_TO',pic:'ZZZZ9'},{av:'AV42TFWP_MachineCode',fld:'vTFWP_MACHINECODE',pic:''},{av:'AV43TFWP_MachineCode_Sel',fld:'vTFWP_MACHINECODE_SEL',pic:''},{av:'AV44TFWP_TankCode',fld:'vTFWP_TANKCODE',pic:'ZZZZ9'},{av:'AV45TFWP_TankCode_To',fld:'vTFWP_TANKCODE_TO',pic:'ZZZZ9'},{av:'AV46TFWP_ProductCSv',fld:'vTFWP_PRODUCTCSV',pic:''},{av:'AV47TFWP_ProductCSv_Sel',fld:'vTFWP_PRODUCTCSV_SEL',pic:''},{av:'AV48TFWP_ToDose',fld:'vTFWP_TODOSE',pic:'ZZZZZZ9.99'},{av:'AV49TFWP_ToDose_To',fld:'vTFWP_TODOSE_TO',pic:'ZZZZZZ9.99'},{av:'AV50TFWP_Dosed',fld:'vTFWP_DOSED',pic:'ZZZZZZ9.99'},{av:'AV51TFWP_Dosed_To',fld:'vTFWP_DOSED_TO',pic:'ZZZZZZ9.99'},{av:'AV52TFWP_ProdBatchCode',fld:'vTFWP_PRODBATCHCODE',pic:''},{av:'AV53TFWP_ProdBatchCode_Sel',fld:'vTFWP_PRODBATCHCODE_SEL',pic:''},{av:'AV54TFWP_DosingOrigin',fld:'vTFWP_DOSINGORIGIN',pic:'ZZZZ9'},{av:'AV55TFWP_DosingOrigin_To',fld:'vTFWP_DOSINGORIGIN_TO',pic:'ZZZZ9'},{av:'AV56TFWP_StatusCSv',fld:'vTFWP_STATUSCSV',pic:'ZZZZ9'},{av:'AV57TFWP_StatusCSv_To',fld:'vTFWP_STATUSCSV_TO',pic:'ZZZZ9'},{av:'AV108Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV66barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV67barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV68barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtWP_ID_Visible',ctrl:'WP_ID',prop:'Visible'},{av:'edtWP_Start_Visible',ctrl:'WP_START',prop:'Visible'},{av:'edtWP_Date_Visible',ctrl:'WP_DATE',prop:'Visible'},{av:'edtWP_BatchCo_Visible',ctrl:'WP_BATCHCO',prop:'Visible'},{av:'edtWP_CallOff_Visible',ctrl:'WP_CALLOFF',prop:'Visible'},{av:'edtWP_ReDyeCS_Visible',ctrl:'WP_REDYECS',prop:'Visible'},{av:'edtWP_Machine_Visible',ctrl:'WP_MACHINE',prop:'Visible'},{av:'edtWP_TankCod_Visible',ctrl:'WP_TANKCOD',prop:'Visible'},{av:'edtWP_Product_Visible',ctrl:'WP_PRODUCT',prop:'Visible'},{av:'edtWP_ToDose_Visible',ctrl:'WP_TODOSE',prop:'Visible'},{av:'edtWP_Dosed_Visible',ctrl:'WP_DOSED',prop:'Visible'},{av:'edtWP_ProdBat_Visible',ctrl:'WP_PRODBAT',prop:'Visible'},{av:'edtWP_DosingO_Visible',ctrl:'WP_DOSINGO',prop:'Visible'},{av:'edtavComentario_Visible',ctrl:'vCOMENTARIO',prop:'Visible'},{av:'edtWP_StatusC_Visible',ctrl:'WP_STATUSC',prop:'Visible'},{av:'edtavReclin_Visible',ctrl:'vRECLIN',prop:'Visible'},{av:'edtWP_ToDose_Columnheaderclass',ctrl:'WP_TODOSE',prop:'Columnheaderclass'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALIDV_DDO_WP_STARTAUXDATE","{handler:'validv_Ddo_wp_startauxdate',iparms:[]");
      setEventMetadata("VALIDV_DDO_WP_STARTAUXDATE",",oparms:[]}");
      setEventMetadata("VALIDV_DDO_WP_DATEAUXDATE","{handler:'validv_Ddo_wp_dateauxdate',iparms:[]");
      setEventMetadata("VALIDV_DDO_WP_DATEAUXDATE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Reclin',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      wcpOAV65WP_Batchcode = "" ;
      wcpOAV64EmprCod = "" ;
      wcpOAV68barcodpar = "" ;
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
      AV65WP_Batchcode = "" ;
      AV64EmprCod = "" ;
      AV68barcodpar = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFWP_Start = GXutil.resetTime( GXutil.nullDate() );
      AV32TFWP_Date = GXutil.resetTime( GXutil.nullDate() );
      AV36TFWP_BatchCode = "" ;
      AV37TFWP_BatchCode_Sel = "" ;
      AV42TFWP_MachineCode = "" ;
      AV43TFWP_MachineCode_Sel = "" ;
      AV46TFWP_ProductCSv = "" ;
      AV47TFWP_ProductCSv_Sel = "" ;
      AV48TFWP_ToDose = DecimalUtil.ZERO ;
      AV49TFWP_ToDose_To = DecimalUtil.ZERO ;
      AV50TFWP_Dosed = DecimalUtil.ZERO ;
      AV51TFWP_Dosed_To = DecimalUtil.ZERO ;
      AV52TFWP_ProdBatchCode = "" ;
      AV53TFWP_ProdBatchCode_Sel = "" ;
      AV108Pgmname = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A872RecPrdNum = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV58DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV30DDO_WP_StartAuxDate = GXutil.nullDate() ;
      AV34DDO_WP_DateAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode = "" ;
      AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = "" ;
      AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start = GXutil.resetTime( GXutil.nullDate() );
      AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date = GXutil.resetTime( GXutil.nullDate() );
      AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = "" ;
      AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel = "" ;
      AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = "" ;
      AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel = "" ;
      AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = "" ;
      AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel = "" ;
      AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose = DecimalUtil.ZERO ;
      AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to = DecimalUtil.ZERO ;
      AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed = DecimalUtil.ZERO ;
      AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to = DecimalUtil.ZERO ;
      AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = "" ;
      AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel = "" ;
      A13949WP_Start = GXutil.resetTime( GXutil.nullDate() );
      A13950WP_Date = GXutil.resetTime( GXutil.nullDate() );
      A13951WP_BatchCo = "" ;
      A13954WP_Machine = "" ;
      A13956WP_Product = "" ;
      A13957WP_ToDose = DecimalUtil.ZERO ;
      A13958WP_Dosed = DecimalUtil.ZERO ;
      A13959WP_ProdBat = "" ;
      AV70comentario = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext = "" ;
      lV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode = "" ;
      lV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode = "" ;
      lV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv = "" ;
      lV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode = "" ;
      H01LL2_A13961WP_StatusC = new int[1] ;
      H01LL2_A13960WP_DosingO = new int[1] ;
      H01LL2_A13959WP_ProdBat = new String[] {""} ;
      H01LL2_A13958WP_Dosed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LL2_A13957WP_ToDose = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01LL2_A13956WP_Product = new String[] {""} ;
      H01LL2_A13955WP_TankCod = new int[1] ;
      H01LL2_A13954WP_Machine = new String[] {""} ;
      H01LL2_A13953WP_ReDyeCS = new int[1] ;
      H01LL2_A13952WP_CallOff = new int[1] ;
      H01LL2_A13951WP_BatchCo = new String[] {""} ;
      H01LL2_A13950WP_Date = new java.util.Date[] {GXutil.nullDate()} ;
      H01LL2_A13949WP_Start = new java.util.Date[] {GXutil.nullDate()} ;
      H01LL2_A13948WP_ID = new long[1] ;
      H01LL3_AGRID_nRecordCount = new long[1] ;
      GXv_int4 = new int[1] ;
      AV76Station = "" ;
      AV77Emprnom = "" ;
      AV78Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV73ProductCode = "" ;
      H01LL4_A2804RecLinMaq = new short[1] ;
      H01LL4_A130BarCodPar = new String[] {""} ;
      H01LL4_A132BarCodReo = new byte[1] ;
      H01LL4_A129BarCod = new int[1] ;
      H01LL4_A396EmprCod = new String[] {""} ;
      H01LL4_A872RecPrdNum = new String[] {""} ;
      H01LL4_A2394RecForNro = new byte[1] ;
      H01LL4_A811RecLin = new short[1] ;
      H01LL4_A1273RecLinPro = new byte[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char5 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV65WP_Batchcode = "" ;
      sCtrlAV64EmprCod = "" ;
      sCtrlAV66barcod = "" ;
      sCtrlAV67barcodreo = "" ;
      sCtrlAV68barcodpar = "" ;
      sCtrlAV69reclinmaq = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consumoscolorservice_wc__default(),
         new Object[] {
             new Object[] {
            H01LL4_A2804RecLinMaq, H01LL4_A130BarCodPar, H01LL4_A132BarCodReo, H01LL4_A129BarCod, H01LL4_A396EmprCod, H01LL4_A872RecPrdNum, H01LL4_A2394RecForNro, H01LL4_A811RecLin, H01LL4_A1273RecLinPro
            }
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consumoscolorservice_wc__colorservice(),
         new Object[] {
             new Object[] {
            H01LL2_A13961WP_StatusC, H01LL2_A13960WP_DosingO, H01LL2_A13959WP_ProdBat, H01LL2_A13958WP_Dosed, H01LL2_A13957WP_ToDose, H01LL2_A13956WP_Product, H01LL2_A13955WP_TankCod, H01LL2_A13954WP_Machine, H01LL2_A13953WP_ReDyeCS, H01LL2_A13952WP_CallOff,
            H01LL2_A13951WP_BatchCo, H01LL2_A13950WP_Date, H01LL2_A13949WP_Start, H01LL2_A13948WP_ID
            }
            , new Object[] {
            H01LL3_AGRID_nRecordCount
            }
         }
      );
      AV108Pgmname = "FormulacionTinte.ConsumosColorService_WC" ;
      /* GeneXus formulas. */
      AV108Pgmname = "FormulacionTinte.ConsumosColorService_WC" ;
      Gx_err = (short)(0) ;
      edtavComentario_Enabled = 0 ;
      edtavReclin_Enabled = 0 ;
   }

   private byte wcpOAV67barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV67barcodreo ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A2394RecForNro ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV72RecForNro ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV69reclinmaq ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV69reclinmaq ;
   private short AV12OrderedBy ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV71RecLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV66barcod ;
   private int nRC_GXsfl_38 ;
   private int AV66barcod ;
   private int subGrid_Rows ;
   private int nGXsfl_38_idx=1 ;
   private int AV63colorserviceID ;
   private int AV38TFWP_CallOffCSv ;
   private int AV39TFWP_CallOffCSv_To ;
   private int AV40TFWP_ReDyeCSv ;
   private int AV41TFWP_ReDyeCSv_To ;
   private int AV44TFWP_TankCode ;
   private int AV45TFWP_TankCode_To ;
   private int AV54TFWP_DosingOrigin ;
   private int AV55TFWP_DosingOrigin_To ;
   private int AV56TFWP_StatusCSv ;
   private int AV57TFWP_StatusCSv_To ;
   private int A129BarCod ;
   private int AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ;
   private int AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ;
   private int AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ;
   private int AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ;
   private int AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ;
   private int AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ;
   private int AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ;
   private int AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ;
   private int AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ;
   private int AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ;
   private int A13952WP_CallOff ;
   private int A13953WP_ReDyeCS ;
   private int A13955WP_TankCod ;
   private int A13960WP_DosingO ;
   private int A13961WP_StatusC ;
   private int subGrid_Islastpage ;
   private int edtavComentario_Enabled ;
   private int edtavReclin_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private int edtWP_ID_Visible ;
   private int edtWP_Start_Visible ;
   private int edtWP_Date_Visible ;
   private int edtWP_BatchCo_Visible ;
   private int edtWP_CallOff_Visible ;
   private int edtWP_ReDyeCS_Visible ;
   private int edtWP_Machine_Visible ;
   private int edtWP_TankCod_Visible ;
   private int edtWP_Product_Visible ;
   private int edtWP_ToDose_Visible ;
   private int edtWP_Dosed_Visible ;
   private int edtWP_ProdBat_Visible ;
   private int edtWP_DosingO_Visible ;
   private int edtavComentario_Visible ;
   private int edtWP_StatusC_Visible ;
   private int edtavReclin_Visible ;
   private int AV109GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26TFWP_ID ;
   private long AV27TFWP_ID_To ;
   private long AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ;
   private long AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ;
   private long A13948WP_ID ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV48TFWP_ToDose ;
   private java.math.BigDecimal AV49TFWP_ToDose_To ;
   private java.math.BigDecimal AV50TFWP_Dosed ;
   private java.math.BigDecimal AV51TFWP_Dosed_To ;
   private java.math.BigDecimal AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ;
   private java.math.BigDecimal AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ;
   private java.math.BigDecimal AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ;
   private java.math.BigDecimal AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ;
   private java.math.BigDecimal A13957WP_ToDose ;
   private java.math.BigDecimal A13958WP_Dosed ;
   private String wcpOAV64EmprCod ;
   private String wcpOAV68barcodpar ;
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
   private String AV64EmprCod ;
   private String AV68barcodpar ;
   private String sGXsfl_38_idx="0001" ;
   private String AV108Pgmname ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A872RecPrdNum ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_wp_startauxdates_Internalname ;
   private String edtavDdo_wp_startauxdate_Internalname ;
   private String edtavDdo_wp_startauxdate_Jsonclick ;
   private String divDdo_wp_dateauxdates_Internalname ;
   private String edtavDdo_wp_dateauxdate_Internalname ;
   private String edtavDdo_wp_dateauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtWP_ID_Internalname ;
   private String edtWP_Start_Internalname ;
   private String edtWP_Date_Internalname ;
   private String edtWP_BatchCo_Internalname ;
   private String edtWP_CallOff_Internalname ;
   private String edtWP_ReDyeCS_Internalname ;
   private String edtWP_Machine_Internalname ;
   private String edtWP_TankCod_Internalname ;
   private String edtWP_Product_Internalname ;
   private String edtWP_ToDose_Internalname ;
   private String edtWP_Dosed_Internalname ;
   private String edtWP_ProdBat_Internalname ;
   private String edtWP_DosingO_Internalname ;
   private String AV70comentario ;
   private String edtavComentario_Internalname ;
   private String edtWP_StatusC_Internalname ;
   private String edtavReclin_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV76Station ;
   private String AV77Emprnom ;
   private String AV78Usurcod ;
   private String edtWP_ToDose_Columnheaderclass ;
   private String edtWP_ToDose_Columnclass ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char15 ;
   private String GXv_char6[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String GXt_char5 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV65WP_Batchcode ;
   private String sCtrlAV64EmprCod ;
   private String sCtrlAV66barcod ;
   private String sCtrlAV67barcodreo ;
   private String sCtrlAV68barcodpar ;
   private String sCtrlAV69reclinmaq ;
   private String sGXsfl_38_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtWP_ID_Jsonclick ;
   private String edtWP_Start_Jsonclick ;
   private String edtWP_Date_Jsonclick ;
   private String edtWP_BatchCo_Jsonclick ;
   private String edtWP_CallOff_Jsonclick ;
   private String edtWP_ReDyeCS_Jsonclick ;
   private String edtWP_Machine_Jsonclick ;
   private String edtWP_TankCod_Jsonclick ;
   private String edtWP_Product_Jsonclick ;
   private String edtWP_ToDose_Jsonclick ;
   private String edtWP_Dosed_Jsonclick ;
   private String edtWP_ProdBat_Jsonclick ;
   private String edtWP_DosingO_Jsonclick ;
   private String edtavComentario_Jsonclick ;
   private String edtWP_StatusC_Jsonclick ;
   private String edtavReclin_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV28TFWP_Start ;
   private java.util.Date AV32TFWP_Date ;
   private java.util.Date AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ;
   private java.util.Date AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ;
   private java.util.Date A13949WP_Start ;
   private java.util.Date A13950WP_Date ;
   private java.util.Date AV30DDO_WP_StartAuxDate ;
   private java.util.Date AV34DDO_WP_DateAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private boolean bGXsfl_38_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String wcpOAV65WP_Batchcode ;
   private String AV65WP_Batchcode ;
   private String AV15FilterFullText ;
   private String AV36TFWP_BatchCode ;
   private String AV37TFWP_BatchCode_Sel ;
   private String AV42TFWP_MachineCode ;
   private String AV43TFWP_MachineCode_Sel ;
   private String AV46TFWP_ProductCSv ;
   private String AV47TFWP_ProductCSv_Sel ;
   private String AV52TFWP_ProdBatchCode ;
   private String AV53TFWP_ProdBatchCode_Sel ;
   private String AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ;
   private String AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ;
   private String AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ;
   private String AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ;
   private String AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ;
   private String AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ;
   private String AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ;
   private String AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ;
   private String AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ;
   private String AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ;
   private String A13951WP_BatchCo ;
   private String A13954WP_Machine ;
   private String A13956WP_Product ;
   private String A13959WP_ProdBat ;
   private String lV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ;
   private String lV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ;
   private String lV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ;
   private String lV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ;
   private String lV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ;
   private String AV73ProductCode ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_colorservice ;
   private int[] H01LL2_A13961WP_StatusC ;
   private int[] H01LL2_A13960WP_DosingO ;
   private String[] H01LL2_A13959WP_ProdBat ;
   private java.math.BigDecimal[] H01LL2_A13958WP_Dosed ;
   private java.math.BigDecimal[] H01LL2_A13957WP_ToDose ;
   private String[] H01LL2_A13956WP_Product ;
   private int[] H01LL2_A13955WP_TankCod ;
   private String[] H01LL2_A13954WP_Machine ;
   private int[] H01LL2_A13953WP_ReDyeCS ;
   private int[] H01LL2_A13952WP_CallOff ;
   private String[] H01LL2_A13951WP_BatchCo ;
   private java.util.Date[] H01LL2_A13950WP_Date ;
   private java.util.Date[] H01LL2_A13949WP_Start ;
   private long[] H01LL2_A13948WP_ID ;
   private long[] H01LL3_AGRID_nRecordCount ;
   private IDataStoreProvider pr_default ;
   private short[] H01LL4_A2804RecLinMaq ;
   private String[] H01LL4_A130BarCodPar ;
   private byte[] H01LL4_A132BarCodReo ;
   private int[] H01LL4_A129BarCod ;
   private String[] H01LL4_A396EmprCod ;
   private String[] H01LL4_A872RecPrdNum ;
   private byte[] H01LL4_A2394RecForNro ;
   private short[] H01LL4_A811RecLin ;
   private byte[] H01LL4_A1273RecLinPro ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV58DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class consumoscolorservice_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01LL4", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecPrdNum, RecForNro, RecLin, RecLinPro FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

final  class consumoscolorservice_wc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01LL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                          long AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ,
                                          long AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ,
                                          java.util.Date AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                          java.util.Date AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                          String AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                          String AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                          int AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ,
                                          int AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ,
                                          int AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ,
                                          int AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ,
                                          String AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                          String AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                          int AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ,
                                          int AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ,
                                          String AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                          String AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                          java.math.BigDecimal AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                          java.math.BigDecimal AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                          java.math.BigDecimal AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                          java.math.BigDecimal AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                          String AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                          String AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                          int AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ,
                                          int AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ,
                                          int AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ,
                                          int AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ,
                                          long A13948WP_ID ,
                                          String A13951WP_BatchCo ,
                                          int A13952WP_CallOff ,
                                          int A13953WP_ReDyeCS ,
                                          String A13954WP_Machine ,
                                          int A13955WP_TankCod ,
                                          String A13956WP_Product ,
                                          java.math.BigDecimal A13957WP_ToDose ,
                                          java.math.BigDecimal A13958WP_Dosed ,
                                          String A13959WP_ProdBat ,
                                          int A13960WP_DosingO ,
                                          int A13961WP_StatusC ,
                                          java.util.Date A13949WP_Start ,
                                          java.util.Date A13950WP_Date ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ,
                                          int AV63colorserviceID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[43];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " [Status], [DosingOrigin], [ProductBatchCode], [Dosed], [ToDose], [ProductCode], [TankCode], [MachineCode], [ReDye], [CallOff], [BatchCode], [DateTime], [DateTimeStart]," ;
      sSelectString += " [id]" ;
      sFromString = " FROM [TXPWeightProduct] WITH (NOLOCK)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "([id] > ?)");
      addWhere(sWhereString, "([BatchCode] = ?)");
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( CONVERT( char(12), CAST([id] AS decimal(12,0))) like '%' + ?) or ( UPPER([BatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([CallOff] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([ReDye] AS decimal(5,0))) like '%' + ?) or ( UPPER([MachineCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([TankCode] AS decimal(5,0))) like '%' + ?) or ( UPPER([ProductCode]) like '%' + UPPER(?)) or ( CONVERT( char(10), CAST([ToDose] AS decimal(10,2))) like '%' + ?) or ( CONVERT( char(10), CAST([Dosed] AS decimal(10,2))) like '%' + ?) or ( UPPER([ProductBatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([DosingOrigin] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([Status] AS decimal(5,0))) like '%' + ?))");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
         GXv_int19[3] = (byte)(1) ;
         GXv_int19[4] = (byte)(1) ;
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
         GXv_int19[9] = (byte)(1) ;
         GXv_int19[10] = (byte)(1) ;
         GXv_int19[11] = (byte)(1) ;
         GXv_int19[12] = (byte)(1) ;
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) )
      {
         addWhere(sWhereString, "([id] >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) )
      {
         addWhere(sWhereString, "([id] <= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start) )
      {
         addWhere(sWhereString, "([DateTimeStart] >= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date) )
      {
         addWhere(sWhereString, "([DateTime] >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([BatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) )
      {
         addWhere(sWhereString, "([BatchCode] = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) )
      {
         addWhere(sWhereString, "([CallOff] >= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) )
      {
         addWhere(sWhereString, "([CallOff] <= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) )
      {
         addWhere(sWhereString, "([ReDye] >= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) )
      {
         addWhere(sWhereString, "([ReDye] <= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([MachineCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) )
      {
         addWhere(sWhereString, "([MachineCode] = ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) )
      {
         addWhere(sWhereString, "([TankCode] >= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) )
      {
         addWhere(sWhereString, "([TankCode] <= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) && ( ! (GXutil.strcmp("", AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) )
      {
         addWhere(sWhereString, "([ProductCode] = ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose)==0) )
      {
         addWhere(sWhereString, "([ToDose] >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to)==0) )
      {
         addWhere(sWhereString, "([ToDose] <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed)==0) )
      {
         addWhere(sWhereString, "([Dosed] >= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to)==0) )
      {
         addWhere(sWhereString, "([Dosed] <= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) && ( ! (GXutil.strcmp("", AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductBatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) )
      {
         addWhere(sWhereString, "([ProductBatchCode] = ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) )
      {
         addWhere(sWhereString, "([DosingOrigin] >= ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) )
      {
         addWhere(sWhereString, "([DosingOrigin] <= ?)");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      if ( ! (0==AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) )
      {
         addWhere(sWhereString, "([Status] >= ?)");
      }
      else
      {
         GXv_int19[38] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) )
      {
         addWhere(sWhereString, "([Status] <= ?)");
      }
      else
      {
         GXv_int19[39] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode]" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [CallOff]" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [CallOff] DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [id]" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [id] DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [DateTimeStart]" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [DateTimeStart] DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [DateTime]" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [DateTime] DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [ReDye]" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [ReDye] DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [MachineCode]" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [MachineCode] DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [TankCode]" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [TankCode] DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [ProductCode]" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [ProductCode] DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [ToDose]" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [ToDose] DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [Dosed]" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [Dosed] DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [ProductBatchCode]" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [ProductBatchCode] DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [DosingOrigin]" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [DosingOrigin] DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY [BatchCode], [Status]" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY [BatchCode] DESC, [Status] DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY [id]" ;
      }
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + " OFFSET " + "?" + " ROWS FETCH NEXT CAST((SELECT CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) AS INTEGER) ROWS ONLY" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H01LL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext ,
                                          long AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id ,
                                          long AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to ,
                                          java.util.Date AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start ,
                                          java.util.Date AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date ,
                                          String AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel ,
                                          String AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode ,
                                          int AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv ,
                                          int AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to ,
                                          int AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv ,
                                          int AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to ,
                                          String AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel ,
                                          String AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode ,
                                          int AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode ,
                                          int AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to ,
                                          String AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel ,
                                          String AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv ,
                                          java.math.BigDecimal AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose ,
                                          java.math.BigDecimal AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to ,
                                          java.math.BigDecimal AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed ,
                                          java.math.BigDecimal AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to ,
                                          String AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel ,
                                          String AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode ,
                                          int AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin ,
                                          int AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to ,
                                          int AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv ,
                                          int AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to ,
                                          long A13948WP_ID ,
                                          String A13951WP_BatchCo ,
                                          int A13952WP_CallOff ,
                                          int A13953WP_ReDyeCS ,
                                          String A13954WP_Machine ,
                                          int A13955WP_TankCod ,
                                          String A13956WP_Product ,
                                          java.math.BigDecimal A13957WP_ToDose ,
                                          java.math.BigDecimal A13958WP_Dosed ,
                                          String A13959WP_ProdBat ,
                                          int A13960WP_DosingO ,
                                          int A13961WP_StatusC ,
                                          java.util.Date A13949WP_Start ,
                                          java.util.Date A13950WP_Date ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV79Formulaciontinte_consumoscolorservice_wcds_1_wp_batchcode ,
                                          int AV63colorserviceID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[40];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM [TXPWeightProduct] WITH (NOLOCK)" ;
      addWhere(sWhereString, "([id] > ?)");
      addWhere(sWhereString, "([BatchCode] = ?)");
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_consumoscolorservice_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( CONVERT( char(12), CAST([id] AS decimal(12,0))) like '%' + ?) or ( UPPER([BatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([CallOff] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([ReDye] AS decimal(5,0))) like '%' + ?) or ( UPPER([MachineCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([TankCode] AS decimal(5,0))) like '%' + ?) or ( UPPER([ProductCode]) like '%' + UPPER(?)) or ( CONVERT( char(10), CAST([ToDose] AS decimal(10,2))) like '%' + ?) or ( CONVERT( char(10), CAST([Dosed] AS decimal(10,2))) like '%' + ?) or ( UPPER([ProductBatchCode]) like '%' + UPPER(?)) or ( CONVERT( char(5), CAST([DosingOrigin] AS decimal(5,0))) like '%' + ?) or ( CONVERT( char(5), CAST([Status] AS decimal(5,0))) like '%' + ?))");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
         GXv_int21[3] = (byte)(1) ;
         GXv_int21[4] = (byte)(1) ;
         GXv_int21[5] = (byte)(1) ;
         GXv_int21[6] = (byte)(1) ;
         GXv_int21[7] = (byte)(1) ;
         GXv_int21[8] = (byte)(1) ;
         GXv_int21[9] = (byte)(1) ;
         GXv_int21[10] = (byte)(1) ;
         GXv_int21[11] = (byte)(1) ;
         GXv_int21[12] = (byte)(1) ;
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_consumoscolorservice_wcds_3_tfwp_id) )
      {
         addWhere(sWhereString, "([id] >= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_consumoscolorservice_wcds_4_tfwp_id_to) )
      {
         addWhere(sWhereString, "([id] <= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV83Formulaciontinte_consumoscolorservice_wcds_5_tfwp_start) )
      {
         addWhere(sWhereString, "([DateTimeStart] >= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Formulaciontinte_consumoscolorservice_wcds_6_tfwp_date) )
      {
         addWhere(sWhereString, "([DateTime] >= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_consumoscolorservice_wcds_7_tfwp_batchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([BatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_consumoscolorservice_wcds_8_tfwp_batchcode_sel)==0) )
      {
         addWhere(sWhereString, "([BatchCode] = ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_consumoscolorservice_wcds_9_tfwp_calloffcsv) )
      {
         addWhere(sWhereString, "([CallOff] >= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_consumoscolorservice_wcds_10_tfwp_calloffcsv_to) )
      {
         addWhere(sWhereString, "([CallOff] <= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_consumoscolorservice_wcds_11_tfwp_redyecsv) )
      {
         addWhere(sWhereString, "([ReDye] >= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_consumoscolorservice_wcds_12_tfwp_redyecsv_to) )
      {
         addWhere(sWhereString, "([ReDye] <= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_consumoscolorservice_wcds_13_tfwp_machinecode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([MachineCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_consumoscolorservice_wcds_14_tfwp_machinecode_sel)==0) )
      {
         addWhere(sWhereString, "([MachineCode] = ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_consumoscolorservice_wcds_15_tfwp_tankcode) )
      {
         addWhere(sWhereString, "([TankCode] >= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (0==AV94Formulaciontinte_consumoscolorservice_wcds_16_tfwp_tankcode_to) )
      {
         addWhere(sWhereString, "([TankCode] <= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) && ( ! (GXutil.strcmp("", AV95Formulaciontinte_consumoscolorservice_wcds_17_tfwp_productcsv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Formulaciontinte_consumoscolorservice_wcds_18_tfwp_productcsv_sel)==0) )
      {
         addWhere(sWhereString, "([ProductCode] = ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Formulaciontinte_consumoscolorservice_wcds_19_tfwp_todose)==0) )
      {
         addWhere(sWhereString, "([ToDose] >= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Formulaciontinte_consumoscolorservice_wcds_20_tfwp_todose_to)==0) )
      {
         addWhere(sWhereString, "([ToDose] <= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Formulaciontinte_consumoscolorservice_wcds_21_tfwp_dosed)==0) )
      {
         addWhere(sWhereString, "([Dosed] >= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Formulaciontinte_consumoscolorservice_wcds_22_tfwp_dosed_to)==0) )
      {
         addWhere(sWhereString, "([Dosed] <= ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) && ( ! (GXutil.strcmp("", AV101Formulaciontinte_consumoscolorservice_wcds_23_tfwp_prodbatchcode)==0) ) )
      {
         addWhere(sWhereString, "(UPPER([ProductBatchCode]) like '%' + UPPER(?))");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Formulaciontinte_consumoscolorservice_wcds_24_tfwp_prodbatchcode_sel)==0) )
      {
         addWhere(sWhereString, "([ProductBatchCode] = ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_consumoscolorservice_wcds_25_tfwp_dosingorigin) )
      {
         addWhere(sWhereString, "([DosingOrigin] >= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_consumoscolorservice_wcds_26_tfwp_dosingorigin_to) )
      {
         addWhere(sWhereString, "([DosingOrigin] <= ?)");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( ! (0==AV105Formulaciontinte_consumoscolorservice_wcds_27_tfwp_statuscsv) )
      {
         addWhere(sWhereString, "([Status] >= ?)");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_consumoscolorservice_wcds_28_tfwp_statuscsv_to) )
      {
         addWhere(sWhereString, "([Status] <= ?)");
      }
      else
      {
         GXv_int21[39] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H01LL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
            case 1 :
                  return conditional_H01LL3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01LL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01LL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
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
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[57]).longValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[58]).longValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[60], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[54]).longValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[55]).longValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

