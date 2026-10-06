package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class weboperarios_impl extends GXDataArea
{
   public weboperarios_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public weboperarios_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( weboperarios_impl.class ));
   }

   public weboperarios_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavDynamicfiltersselector1 = new HTMLChoice();
      cmbavDynamicfiltersoperator1 = new HTMLChoice();
      cmbavDynamicfiltersselector2 = new HTMLChoice();
      cmbavDynamicfiltersoperator2 = new HTMLChoice();
      cmbavDynamicfiltersselector3 = new HTMLChoice();
      cmbavDynamicfiltersoperator3 = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      chkavSeleccion = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_110 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_110"))) ;
      nGXsfl_110_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_110_idx"))) ;
      sGXsfl_110_idx = httpContext.GetPar( "sGXsfl_110_idx") ;
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
      AV57FilterFullText = httpContext.GetPar( "FilterFullText") ;
      cmbavDynamicfiltersselector1.fromJSonString( httpContext.GetNextPar( ));
      AV16DynamicFiltersSelector1 = httpContext.GetPar( "DynamicFiltersSelector1") ;
      cmbavDynamicfiltersoperator1.fromJSonString( httpContext.GetNextPar( ));
      AV17DynamicFiltersOperator1 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator1"))) ;
      AV18OpeNom1 = httpContext.GetPar( "OpeNom1") ;
      cmbavDynamicfiltersselector2.fromJSonString( httpContext.GetNextPar( ));
      AV20DynamicFiltersSelector2 = httpContext.GetPar( "DynamicFiltersSelector2") ;
      cmbavDynamicfiltersoperator2.fromJSonString( httpContext.GetNextPar( ));
      AV21DynamicFiltersOperator2 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator2"))) ;
      AV22OpeNom2 = httpContext.GetPar( "OpeNom2") ;
      cmbavDynamicfiltersselector3.fromJSonString( httpContext.GetNextPar( ));
      AV24DynamicFiltersSelector3 = httpContext.GetPar( "DynamicFiltersSelector3") ;
      cmbavDynamicfiltersoperator3.fromJSonString( httpContext.GetNextPar( ));
      AV25DynamicFiltersOperator3 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator3"))) ;
      AV26OpeNom3 = httpContext.GetPar( "OpeNom3") ;
      AV38ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV33ColumnsSelector);
      AV19DynamicFiltersEnabled2 = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersEnabled2")) ;
      AV23DynamicFiltersEnabled3 = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersEnabled3")) ;
      AV40TFOpeCod = (int)(GXutil.lval( httpContext.GetPar( "TFOpeCod"))) ;
      AV41TFOpeCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFOpeCod_To"))) ;
      AV43TFOpeNom = httpContext.GetPar( "TFOpeNom") ;
      AV44TFOpeNom_Sel = httpContext.GetPar( "TFOpeNom_Sel") ;
      AV46TFOpeNom2 = httpContext.GetPar( "TFOpeNom2") ;
      AV47TFOpeNom2_Sel = httpContext.GetPar( "TFOpeNom2_Sel") ;
      AV49TFOpeAct = httpContext.GetPar( "TFOpeAct") ;
      AV50TFOpeAct_Sel = httpContext.GetPar( "TFOpeAct_Sel") ;
      AV87Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV10GridState);
      AV28DynamicFiltersIgnoreFirst = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersIgnoreFirst")) ;
      AV27DynamicFiltersRemoving = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersRemoving")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV57FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18OpeNom1, AV20DynamicFiltersSelector2, AV21DynamicFiltersOperator2, AV22OpeNom2, AV24DynamicFiltersSelector3, AV25DynamicFiltersOperator3, AV26OpeNom3, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV19DynamicFiltersEnabled2, AV23DynamicFiltersEnabled3, AV40TFOpeCod, AV41TFOpeCod_To, AV43TFOpeNom, AV44TFOpeNom_Sel, AV46TFOpeNom2, AV47TFOpeNom2_Sel, AV49TFOpeAct, AV50TFOpeAct_Sel, AV87Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV28DynamicFiltersIgnoreFirst, AV27DynamicFiltersRemoving, A396EmprCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      paHH2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startHH2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.weboperarios", new String[] {}, new String[] {}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV87Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV57FilterFullText);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR1", AV16DynamicFiltersSelector1);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR1", GXutil.ltrim( localUtil.ntoc( AV17DynamicFiltersOperator1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vOPENOM1", GXutil.rtrim( AV18OpeNom1));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR2", AV20DynamicFiltersSelector2);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR2", GXutil.ltrim( localUtil.ntoc( AV21DynamicFiltersOperator2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vOPENOM2", GXutil.rtrim( AV22OpeNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR3", AV24DynamicFiltersSelector3);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR3", GXutil.ltrim( localUtil.ntoc( AV25DynamicFiltersOperator3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vOPENOM3", GXutil.rtrim( AV26OpeNom3));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_110", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_110, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV54GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV55GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV38ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSENABLED2", AV19DynamicFiltersEnabled2);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSENABLED3", AV23DynamicFiltersEnabled3);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOPECOD", GXutil.ltrim( localUtil.ntoc( AV40TFOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV41TFOpeCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOPENOM", GXutil.rtrim( AV43TFOpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOPENOM_SEL", GXutil.rtrim( AV44TFOpeNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOPENOM2", GXutil.rtrim( AV46TFOpeNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOPENOM2_SEL", GXutil.rtrim( AV47TFOpeNom2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOPEACT", GXutil.rtrim( AV49TFOpeAct));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOPEACT_SEL", GXutil.rtrim( AV50TFOpeAct_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV87Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV87Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSIGNOREFIRST", AV28DynamicFiltersIgnoreFirst);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSREMOVING", AV27DynamicFiltersRemoving);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         weHH2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtHH2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.weboperarios", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebOperarios" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " MANTENIMIENTO DE OPERARIOS", "") ;
   }

   public void wbHH0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 110, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 110, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 110, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 110, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_HH2( true) ;
      }
      else
      {
         wb_table1_25_HH2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_HH2e( boolean wbgen )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         startgridcontrol110( ) ;
      }
      if ( wbEnd == 110 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_110 = (int)(nGXsfl_110_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV54GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV55GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblJsdynamicfilters_Internalname, lblJsdynamicfilters_Caption, "", "", lblJsdynamicfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "", 0, "", 1, 1, 0, (short)(1), "HLP_WebOperarios.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV33ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 110 )
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
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startHH2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( " MANTENIMIENTO DE OPERARIOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupHH0( ) ;
   }

   public void wsHH2( )
   {
      startHH2( ) ;
      evtHH2( ) ;
   }

   public void evtHH2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters1' */
                           e16HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters2' */
                           e17HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS3'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters3' */
                           e18HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e19HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e20HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e21HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ADDDYNAMICFILTERS1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AddDynamicFilters1' */
                           e22HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR1.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e23HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ADDDYNAMICFILTERS2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AddDynamicFilters2' */
                           e24HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR2.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e25HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR3.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e26HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_110_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1102( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV60GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridActions), 4, 0));
                           AV56Seleccion = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccion.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSeleccion.getInternalname(), AV56Seleccion);
                           A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A653OpeNom = httpContext.cgiGet( edtOpeNom_Internalname) ;
                           n653OpeNom = false ;
                           A6869OpeNom2 = httpContext.cgiGet( edtOpeNom2_Internalname) ;
                           n6869OpeNom2 = false ;
                           A8482OpeAct = GXutil.upper( httpContext.cgiGet( edtOpeAct_Internalname)) ;
                           n8482OpeAct = false ;
                           A13748OpeCNom = httpContext.cgiGet( edtOpeCNom_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e27HH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e28HH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e29HH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV57FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR1"), AV16DynamicFiltersSelector1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator1 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV17DynamicFiltersOperator1 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Openom1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vOPENOM1"), AV18OpeNom1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR2"), AV20DynamicFiltersSelector2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator2 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV21DynamicFiltersOperator2 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Openom2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vOPENOM2"), AV22OpeNom2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR3"), AV24DynamicFiltersSelector3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator3 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV25DynamicFiltersOperator3 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Openom3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vOPENOM3"), AV26OpeNom3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
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

   public void weHH2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void paHH2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_1102( ) ;
      while ( nGXsfl_110_idx <= nRC_GXsfl_110 )
      {
         sendrow_1102( ) ;
         nGXsfl_110_idx = ((subGrid_Islastpage==1)&&(nGXsfl_110_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_110_idx+1) ;
         sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1102( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV57FilterFullText ,
                                 String AV16DynamicFiltersSelector1 ,
                                 short AV17DynamicFiltersOperator1 ,
                                 String AV18OpeNom1 ,
                                 String AV20DynamicFiltersSelector2 ,
                                 short AV21DynamicFiltersOperator2 ,
                                 String AV22OpeNom2 ,
                                 String AV24DynamicFiltersSelector3 ,
                                 short AV25DynamicFiltersOperator3 ,
                                 String AV26OpeNom3 ,
                                 byte AV38ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ,
                                 boolean AV19DynamicFiltersEnabled2 ,
                                 boolean AV23DynamicFiltersEnabled3 ,
                                 int AV40TFOpeCod ,
                                 int AV41TFOpeCod_To ,
                                 String AV43TFOpeNom ,
                                 String AV44TFOpeNom_Sel ,
                                 String AV46TFOpeNom2 ,
                                 String AV47TFOpeNom2_Sel ,
                                 String AV49TFOpeAct ,
                                 String AV50TFOpeAct_Sel ,
                                 String AV87Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 app.wwpbaseobjects.SdtWWPGridState AV10GridState ,
                                 boolean AV28DynamicFiltersIgnoreFirst ,
                                 boolean AV27DynamicFiltersRemoving ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e28HH2 ();
      GRID_nCurrentRecord = 0 ;
      rfHH2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_OPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECOD", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
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
      if ( cmbavDynamicfiltersselector1.getItemCount() > 0 )
      {
         AV16DynamicFiltersSelector1 = cmbavDynamicfiltersselector1.getValidValue(AV16DynamicFiltersSelector1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator1.getItemCount() > 0 )
      {
         AV17DynamicFiltersOperator1 = (short)(GXutil.lval( cmbavDynamicfiltersoperator1.getValidValue(GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersselector2.getItemCount() > 0 )
      {
         AV20DynamicFiltersSelector2 = cmbavDynamicfiltersselector2.getValidValue(AV20DynamicFiltersSelector2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersSelector2", AV20DynamicFiltersSelector2);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV20DynamicFiltersSelector2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator2.getItemCount() > 0 )
      {
         AV21DynamicFiltersOperator2 = (short)(GXutil.lval( cmbavDynamicfiltersoperator2.getValidValue(GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21DynamicFiltersOperator2), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersselector3.getItemCount() > 0 )
      {
         AV24DynamicFiltersSelector3 = cmbavDynamicfiltersselector3.getValidValue(AV24DynamicFiltersSelector3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24DynamicFiltersSelector3", AV24DynamicFiltersSelector3);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV24DynamicFiltersSelector3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator3.getItemCount() > 0 )
      {
         AV25DynamicFiltersOperator3 = (short)(GXutil.lval( cmbavDynamicfiltersoperator3.getValidValue(GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DynamicFiltersOperator3), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfHH2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV87Pgmname = "WebOperarios" ;
      Gx_err = (short)(0) ;
      chkavSeleccion.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccion.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSeleccion.getEnabled(), 5, 0), !bGXsfl_110_Refreshing);
   }

   public void rfHH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(110) ;
      /* Execute user event: Refresh */
      e28HH2 ();
      nGXsfl_110_idx = 1 ;
      sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1102( ) ;
      bGXsfl_110_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_1102( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV67Weboperariosds_1_filterfulltext ,
                                              AV68Weboperariosds_2_dynamicfiltersselector1 ,
                                              Short.valueOf(AV69Weboperariosds_3_dynamicfiltersoperator1) ,
                                              AV70Weboperariosds_4_openom1 ,
                                              Boolean.valueOf(AV71Weboperariosds_5_dynamicfiltersenabled2) ,
                                              AV72Weboperariosds_6_dynamicfiltersselector2 ,
                                              Short.valueOf(AV73Weboperariosds_7_dynamicfiltersoperator2) ,
                                              AV74Weboperariosds_8_openom2 ,
                                              Boolean.valueOf(AV75Weboperariosds_9_dynamicfiltersenabled3) ,
                                              AV76Weboperariosds_10_dynamicfiltersselector3 ,
                                              Short.valueOf(AV77Weboperariosds_11_dynamicfiltersoperator3) ,
                                              AV78Weboperariosds_12_openom3 ,
                                              Integer.valueOf(AV79Weboperariosds_13_tfopecod) ,
                                              Integer.valueOf(AV80Weboperariosds_14_tfopecod_to) ,
                                              AV82Weboperariosds_16_tfopenom_sel ,
                                              AV81Weboperariosds_15_tfopenom ,
                                              AV84Weboperariosds_18_tfopenom2_sel ,
                                              AV83Weboperariosds_17_tfopenom2 ,
                                              AV86Weboperariosds_20_tfopeact_sel ,
                                              AV85Weboperariosds_19_tfopeact ,
                                              Integer.valueOf(A652OpeCod) ,
                                              A653OpeNom ,
                                              A6869OpeNom2 ,
                                              A8482OpeAct ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV67Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Weboperariosds_1_filterfulltext), "%", "") ;
         lV67Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Weboperariosds_1_filterfulltext), "%", "") ;
         lV67Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Weboperariosds_1_filterfulltext), "%", "") ;
         lV67Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Weboperariosds_1_filterfulltext), "%", "") ;
         lV70Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV70Weboperariosds_4_openom1), 30, "%") ;
         lV70Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV70Weboperariosds_4_openom1), 30, "%") ;
         lV74Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV74Weboperariosds_8_openom2), 30, "%") ;
         lV74Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV74Weboperariosds_8_openom2), 30, "%") ;
         lV78Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV78Weboperariosds_12_openom3), 30, "%") ;
         lV78Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV78Weboperariosds_12_openom3), 30, "%") ;
         lV81Weboperariosds_15_tfopenom = GXutil.padr( GXutil.rtrim( AV81Weboperariosds_15_tfopenom), 30, "%") ;
         lV83Weboperariosds_17_tfopenom2 = GXutil.padr( GXutil.rtrim( AV83Weboperariosds_17_tfopenom2), 30, "%") ;
         lV85Weboperariosds_19_tfopeact = GXutil.padr( GXutil.rtrim( AV85Weboperariosds_19_tfopeact), 1, "%") ;
         /* Using cursor H00HH2 */
         pr_default.execute(0, new Object[] {lV67Weboperariosds_1_filterfulltext, lV67Weboperariosds_1_filterfulltext, lV67Weboperariosds_1_filterfulltext, lV67Weboperariosds_1_filterfulltext, lV70Weboperariosds_4_openom1, lV70Weboperariosds_4_openom1, lV74Weboperariosds_8_openom2, lV74Weboperariosds_8_openom2, lV78Weboperariosds_12_openom3, lV78Weboperariosds_12_openom3, Integer.valueOf(AV79Weboperariosds_13_tfopecod), Integer.valueOf(AV80Weboperariosds_14_tfopecod_to), lV81Weboperariosds_15_tfopenom, AV82Weboperariosds_16_tfopenom_sel, lV83Weboperariosds_17_tfopenom2, AV84Weboperariosds_18_tfopenom2_sel, lV85Weboperariosds_19_tfopeact, AV86Weboperariosds_20_tfopeact_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_110_idx = 1 ;
         sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1102( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00HH2_A396EmprCod[0] ;
            A8482OpeAct = H00HH2_A8482OpeAct[0] ;
            n8482OpeAct = H00HH2_n8482OpeAct[0] ;
            A6869OpeNom2 = H00HH2_A6869OpeNom2[0] ;
            n6869OpeNom2 = H00HH2_n6869OpeNom2[0] ;
            A653OpeNom = H00HH2_A653OpeNom[0] ;
            n653OpeNom = H00HH2_n653OpeNom[0] ;
            A652OpeCod = H00HH2_A652OpeCod[0] ;
            A13748OpeCNom = GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) + " - " + GXutil.trim( A653OpeNom) ;
            e29HH2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(110) ;
         wbHH0( ) ;
      }
      bGXsfl_110_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesHH2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV87Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV87Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_OPECOD"+"_"+sGXsfl_110_idx, getSecureSignedToken( sGXsfl_110_idx, localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9")));
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
      AV67Weboperariosds_1_filterfulltext = AV57FilterFullText ;
      AV68Weboperariosds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV69Weboperariosds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV70Weboperariosds_4_openom1 = AV18OpeNom1 ;
      AV71Weboperariosds_5_dynamicfiltersenabled2 = AV19DynamicFiltersEnabled2 ;
      AV72Weboperariosds_6_dynamicfiltersselector2 = AV20DynamicFiltersSelector2 ;
      AV73Weboperariosds_7_dynamicfiltersoperator2 = AV21DynamicFiltersOperator2 ;
      AV74Weboperariosds_8_openom2 = AV22OpeNom2 ;
      AV75Weboperariosds_9_dynamicfiltersenabled3 = AV23DynamicFiltersEnabled3 ;
      AV76Weboperariosds_10_dynamicfiltersselector3 = AV24DynamicFiltersSelector3 ;
      AV77Weboperariosds_11_dynamicfiltersoperator3 = AV25DynamicFiltersOperator3 ;
      AV78Weboperariosds_12_openom3 = AV26OpeNom3 ;
      AV79Weboperariosds_13_tfopecod = AV40TFOpeCod ;
      AV80Weboperariosds_14_tfopecod_to = AV41TFOpeCod_To ;
      AV81Weboperariosds_15_tfopenom = AV43TFOpeNom ;
      AV82Weboperariosds_16_tfopenom_sel = AV44TFOpeNom_Sel ;
      AV83Weboperariosds_17_tfopenom2 = AV46TFOpeNom2 ;
      AV84Weboperariosds_18_tfopenom2_sel = AV47TFOpeNom2_Sel ;
      AV85Weboperariosds_19_tfopeact = AV49TFOpeAct ;
      AV86Weboperariosds_20_tfopeact_sel = AV50TFOpeAct_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV67Weboperariosds_1_filterfulltext ,
                                           AV68Weboperariosds_2_dynamicfiltersselector1 ,
                                           Short.valueOf(AV69Weboperariosds_3_dynamicfiltersoperator1) ,
                                           AV70Weboperariosds_4_openom1 ,
                                           Boolean.valueOf(AV71Weboperariosds_5_dynamicfiltersenabled2) ,
                                           AV72Weboperariosds_6_dynamicfiltersselector2 ,
                                           Short.valueOf(AV73Weboperariosds_7_dynamicfiltersoperator2) ,
                                           AV74Weboperariosds_8_openom2 ,
                                           Boolean.valueOf(AV75Weboperariosds_9_dynamicfiltersenabled3) ,
                                           AV76Weboperariosds_10_dynamicfiltersselector3 ,
                                           Short.valueOf(AV77Weboperariosds_11_dynamicfiltersoperator3) ,
                                           AV78Weboperariosds_12_openom3 ,
                                           Integer.valueOf(AV79Weboperariosds_13_tfopecod) ,
                                           Integer.valueOf(AV80Weboperariosds_14_tfopecod_to) ,
                                           AV82Weboperariosds_16_tfopenom_sel ,
                                           AV81Weboperariosds_15_tfopenom ,
                                           AV84Weboperariosds_18_tfopenom2_sel ,
                                           AV83Weboperariosds_17_tfopenom2 ,
                                           AV86Weboperariosds_20_tfopeact_sel ,
                                           AV85Weboperariosds_19_tfopeact ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           A8482OpeAct ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV67Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Weboperariosds_1_filterfulltext), "%", "") ;
      lV67Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Weboperariosds_1_filterfulltext), "%", "") ;
      lV67Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Weboperariosds_1_filterfulltext), "%", "") ;
      lV67Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Weboperariosds_1_filterfulltext), "%", "") ;
      lV70Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV70Weboperariosds_4_openom1), 30, "%") ;
      lV70Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV70Weboperariosds_4_openom1), 30, "%") ;
      lV74Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV74Weboperariosds_8_openom2), 30, "%") ;
      lV74Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV74Weboperariosds_8_openom2), 30, "%") ;
      lV78Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV78Weboperariosds_12_openom3), 30, "%") ;
      lV78Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV78Weboperariosds_12_openom3), 30, "%") ;
      lV81Weboperariosds_15_tfopenom = GXutil.padr( GXutil.rtrim( AV81Weboperariosds_15_tfopenom), 30, "%") ;
      lV83Weboperariosds_17_tfopenom2 = GXutil.padr( GXutil.rtrim( AV83Weboperariosds_17_tfopenom2), 30, "%") ;
      lV85Weboperariosds_19_tfopeact = GXutil.padr( GXutil.rtrim( AV85Weboperariosds_19_tfopeact), 1, "%") ;
      /* Using cursor H00HH3 */
      pr_default.execute(1, new Object[] {lV67Weboperariosds_1_filterfulltext, lV67Weboperariosds_1_filterfulltext, lV67Weboperariosds_1_filterfulltext, lV67Weboperariosds_1_filterfulltext, lV70Weboperariosds_4_openom1, lV70Weboperariosds_4_openom1, lV74Weboperariosds_8_openom2, lV74Weboperariosds_8_openom2, lV78Weboperariosds_12_openom3, lV78Weboperariosds_12_openom3, Integer.valueOf(AV79Weboperariosds_13_tfopecod), Integer.valueOf(AV80Weboperariosds_14_tfopecod_to), lV81Weboperariosds_15_tfopenom, AV82Weboperariosds_16_tfopenom_sel, lV83Weboperariosds_17_tfopenom2, AV84Weboperariosds_18_tfopenom2_sel, lV85Weboperariosds_19_tfopeact, AV86Weboperariosds_20_tfopeact_sel});
      GRID_nRecordCount = H00HH3_AGRID_nRecordCount[0] ;
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
      AV67Weboperariosds_1_filterfulltext = AV57FilterFullText ;
      AV68Weboperariosds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV69Weboperariosds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV70Weboperariosds_4_openom1 = AV18OpeNom1 ;
      AV71Weboperariosds_5_dynamicfiltersenabled2 = AV19DynamicFiltersEnabled2 ;
      AV72Weboperariosds_6_dynamicfiltersselector2 = AV20DynamicFiltersSelector2 ;
      AV73Weboperariosds_7_dynamicfiltersoperator2 = AV21DynamicFiltersOperator2 ;
      AV74Weboperariosds_8_openom2 = AV22OpeNom2 ;
      AV75Weboperariosds_9_dynamicfiltersenabled3 = AV23DynamicFiltersEnabled3 ;
      AV76Weboperariosds_10_dynamicfiltersselector3 = AV24DynamicFiltersSelector3 ;
      AV77Weboperariosds_11_dynamicfiltersoperator3 = AV25DynamicFiltersOperator3 ;
      AV78Weboperariosds_12_openom3 = AV26OpeNom3 ;
      AV79Weboperariosds_13_tfopecod = AV40TFOpeCod ;
      AV80Weboperariosds_14_tfopecod_to = AV41TFOpeCod_To ;
      AV81Weboperariosds_15_tfopenom = AV43TFOpeNom ;
      AV82Weboperariosds_16_tfopenom_sel = AV44TFOpeNom_Sel ;
      AV83Weboperariosds_17_tfopenom2 = AV46TFOpeNom2 ;
      AV84Weboperariosds_18_tfopenom2_sel = AV47TFOpeNom2_Sel ;
      AV85Weboperariosds_19_tfopeact = AV49TFOpeAct ;
      AV86Weboperariosds_20_tfopeact_sel = AV50TFOpeAct_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV57FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18OpeNom1, AV20DynamicFiltersSelector2, AV21DynamicFiltersOperator2, AV22OpeNom2, AV24DynamicFiltersSelector3, AV25DynamicFiltersOperator3, AV26OpeNom3, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV19DynamicFiltersEnabled2, AV23DynamicFiltersEnabled3, AV40TFOpeCod, AV41TFOpeCod_To, AV43TFOpeNom, AV44TFOpeNom_Sel, AV46TFOpeNom2, AV47TFOpeNom2_Sel, AV49TFOpeAct, AV50TFOpeAct_Sel, AV87Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV28DynamicFiltersIgnoreFirst, AV27DynamicFiltersRemoving, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV67Weboperariosds_1_filterfulltext = AV57FilterFullText ;
      AV68Weboperariosds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV69Weboperariosds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV70Weboperariosds_4_openom1 = AV18OpeNom1 ;
      AV71Weboperariosds_5_dynamicfiltersenabled2 = AV19DynamicFiltersEnabled2 ;
      AV72Weboperariosds_6_dynamicfiltersselector2 = AV20DynamicFiltersSelector2 ;
      AV73Weboperariosds_7_dynamicfiltersoperator2 = AV21DynamicFiltersOperator2 ;
      AV74Weboperariosds_8_openom2 = AV22OpeNom2 ;
      AV75Weboperariosds_9_dynamicfiltersenabled3 = AV23DynamicFiltersEnabled3 ;
      AV76Weboperariosds_10_dynamicfiltersselector3 = AV24DynamicFiltersSelector3 ;
      AV77Weboperariosds_11_dynamicfiltersoperator3 = AV25DynamicFiltersOperator3 ;
      AV78Weboperariosds_12_openom3 = AV26OpeNom3 ;
      AV79Weboperariosds_13_tfopecod = AV40TFOpeCod ;
      AV80Weboperariosds_14_tfopecod_to = AV41TFOpeCod_To ;
      AV81Weboperariosds_15_tfopenom = AV43TFOpeNom ;
      AV82Weboperariosds_16_tfopenom_sel = AV44TFOpeNom_Sel ;
      AV83Weboperariosds_17_tfopenom2 = AV46TFOpeNom2 ;
      AV84Weboperariosds_18_tfopenom2_sel = AV47TFOpeNom2_Sel ;
      AV85Weboperariosds_19_tfopeact = AV49TFOpeAct ;
      AV86Weboperariosds_20_tfopeact_sel = AV50TFOpeAct_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV57FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18OpeNom1, AV20DynamicFiltersSelector2, AV21DynamicFiltersOperator2, AV22OpeNom2, AV24DynamicFiltersSelector3, AV25DynamicFiltersOperator3, AV26OpeNom3, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV19DynamicFiltersEnabled2, AV23DynamicFiltersEnabled3, AV40TFOpeCod, AV41TFOpeCod_To, AV43TFOpeNom, AV44TFOpeNom_Sel, AV46TFOpeNom2, AV47TFOpeNom2_Sel, AV49TFOpeAct, AV50TFOpeAct_Sel, AV87Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV28DynamicFiltersIgnoreFirst, AV27DynamicFiltersRemoving, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV67Weboperariosds_1_filterfulltext = AV57FilterFullText ;
      AV68Weboperariosds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV69Weboperariosds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV70Weboperariosds_4_openom1 = AV18OpeNom1 ;
      AV71Weboperariosds_5_dynamicfiltersenabled2 = AV19DynamicFiltersEnabled2 ;
      AV72Weboperariosds_6_dynamicfiltersselector2 = AV20DynamicFiltersSelector2 ;
      AV73Weboperariosds_7_dynamicfiltersoperator2 = AV21DynamicFiltersOperator2 ;
      AV74Weboperariosds_8_openom2 = AV22OpeNom2 ;
      AV75Weboperariosds_9_dynamicfiltersenabled3 = AV23DynamicFiltersEnabled3 ;
      AV76Weboperariosds_10_dynamicfiltersselector3 = AV24DynamicFiltersSelector3 ;
      AV77Weboperariosds_11_dynamicfiltersoperator3 = AV25DynamicFiltersOperator3 ;
      AV78Weboperariosds_12_openom3 = AV26OpeNom3 ;
      AV79Weboperariosds_13_tfopecod = AV40TFOpeCod ;
      AV80Weboperariosds_14_tfopecod_to = AV41TFOpeCod_To ;
      AV81Weboperariosds_15_tfopenom = AV43TFOpeNom ;
      AV82Weboperariosds_16_tfopenom_sel = AV44TFOpeNom_Sel ;
      AV83Weboperariosds_17_tfopenom2 = AV46TFOpeNom2 ;
      AV84Weboperariosds_18_tfopenom2_sel = AV47TFOpeNom2_Sel ;
      AV85Weboperariosds_19_tfopeact = AV49TFOpeAct ;
      AV86Weboperariosds_20_tfopeact_sel = AV50TFOpeAct_Sel ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV57FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18OpeNom1, AV20DynamicFiltersSelector2, AV21DynamicFiltersOperator2, AV22OpeNom2, AV24DynamicFiltersSelector3, AV25DynamicFiltersOperator3, AV26OpeNom3, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV19DynamicFiltersEnabled2, AV23DynamicFiltersEnabled3, AV40TFOpeCod, AV41TFOpeCod_To, AV43TFOpeNom, AV44TFOpeNom_Sel, AV46TFOpeNom2, AV47TFOpeNom2_Sel, AV49TFOpeAct, AV50TFOpeAct_Sel, AV87Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV28DynamicFiltersIgnoreFirst, AV27DynamicFiltersRemoving, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV67Weboperariosds_1_filterfulltext = AV57FilterFullText ;
      AV68Weboperariosds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV69Weboperariosds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV70Weboperariosds_4_openom1 = AV18OpeNom1 ;
      AV71Weboperariosds_5_dynamicfiltersenabled2 = AV19DynamicFiltersEnabled2 ;
      AV72Weboperariosds_6_dynamicfiltersselector2 = AV20DynamicFiltersSelector2 ;
      AV73Weboperariosds_7_dynamicfiltersoperator2 = AV21DynamicFiltersOperator2 ;
      AV74Weboperariosds_8_openom2 = AV22OpeNom2 ;
      AV75Weboperariosds_9_dynamicfiltersenabled3 = AV23DynamicFiltersEnabled3 ;
      AV76Weboperariosds_10_dynamicfiltersselector3 = AV24DynamicFiltersSelector3 ;
      AV77Weboperariosds_11_dynamicfiltersoperator3 = AV25DynamicFiltersOperator3 ;
      AV78Weboperariosds_12_openom3 = AV26OpeNom3 ;
      AV79Weboperariosds_13_tfopecod = AV40TFOpeCod ;
      AV80Weboperariosds_14_tfopecod_to = AV41TFOpeCod_To ;
      AV81Weboperariosds_15_tfopenom = AV43TFOpeNom ;
      AV82Weboperariosds_16_tfopenom_sel = AV44TFOpeNom_Sel ;
      AV83Weboperariosds_17_tfopenom2 = AV46TFOpeNom2 ;
      AV84Weboperariosds_18_tfopenom2_sel = AV47TFOpeNom2_Sel ;
      AV85Weboperariosds_19_tfopeact = AV49TFOpeAct ;
      AV86Weboperariosds_20_tfopeact_sel = AV50TFOpeAct_Sel ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV57FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18OpeNom1, AV20DynamicFiltersSelector2, AV21DynamicFiltersOperator2, AV22OpeNom2, AV24DynamicFiltersSelector3, AV25DynamicFiltersOperator3, AV26OpeNom3, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV19DynamicFiltersEnabled2, AV23DynamicFiltersEnabled3, AV40TFOpeCod, AV41TFOpeCod_To, AV43TFOpeNom, AV44TFOpeNom_Sel, AV46TFOpeNom2, AV47TFOpeNom2_Sel, AV49TFOpeAct, AV50TFOpeAct_Sel, AV87Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV28DynamicFiltersIgnoreFirst, AV27DynamicFiltersRemoving, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV67Weboperariosds_1_filterfulltext = AV57FilterFullText ;
      AV68Weboperariosds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV69Weboperariosds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV70Weboperariosds_4_openom1 = AV18OpeNom1 ;
      AV71Weboperariosds_5_dynamicfiltersenabled2 = AV19DynamicFiltersEnabled2 ;
      AV72Weboperariosds_6_dynamicfiltersselector2 = AV20DynamicFiltersSelector2 ;
      AV73Weboperariosds_7_dynamicfiltersoperator2 = AV21DynamicFiltersOperator2 ;
      AV74Weboperariosds_8_openom2 = AV22OpeNom2 ;
      AV75Weboperariosds_9_dynamicfiltersenabled3 = AV23DynamicFiltersEnabled3 ;
      AV76Weboperariosds_10_dynamicfiltersselector3 = AV24DynamicFiltersSelector3 ;
      AV77Weboperariosds_11_dynamicfiltersoperator3 = AV25DynamicFiltersOperator3 ;
      AV78Weboperariosds_12_openom3 = AV26OpeNom3 ;
      AV79Weboperariosds_13_tfopecod = AV40TFOpeCod ;
      AV80Weboperariosds_14_tfopecod_to = AV41TFOpeCod_To ;
      AV81Weboperariosds_15_tfopenom = AV43TFOpeNom ;
      AV82Weboperariosds_16_tfopenom_sel = AV44TFOpeNom_Sel ;
      AV83Weboperariosds_17_tfopenom2 = AV46TFOpeNom2 ;
      AV84Weboperariosds_18_tfopenom2_sel = AV47TFOpeNom2_Sel ;
      AV85Weboperariosds_19_tfopeact = AV49TFOpeAct ;
      AV86Weboperariosds_20_tfopeact_sel = AV50TFOpeAct_Sel ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV57FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18OpeNom1, AV20DynamicFiltersSelector2, AV21DynamicFiltersOperator2, AV22OpeNom2, AV24DynamicFiltersSelector3, AV25DynamicFiltersOperator3, AV26OpeNom3, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV19DynamicFiltersEnabled2, AV23DynamicFiltersEnabled3, AV40TFOpeCod, AV41TFOpeCod_To, AV43TFOpeNom, AV44TFOpeNom_Sel, AV46TFOpeNom2, AV47TFOpeNom2_Sel, AV49TFOpeAct, AV50TFOpeAct_Sel, AV87Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV28DynamicFiltersIgnoreFirst, AV27DynamicFiltersRemoving, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV87Pgmname = "WebOperarios" ;
      Gx_err = (short)(0) ;
      chkavSeleccion.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccion.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSeleccion.getEnabled(), 5, 0), !bGXsfl_110_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupHH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e27HH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV36ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV33ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_110 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_110"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV55GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( "DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( "DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( "INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( "INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( "INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV57FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57FilterFullText", AV57FilterFullText);
         cmbavDynamicfiltersselector1.setName( cmbavDynamicfiltersselector1.getInternalname() );
         cmbavDynamicfiltersselector1.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector1.getInternalname()) );
         AV16DynamicFiltersSelector1 = httpContext.cgiGet( cmbavDynamicfiltersselector1.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
         cmbavDynamicfiltersoperator1.setName( cmbavDynamicfiltersoperator1.getInternalname() );
         cmbavDynamicfiltersoperator1.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator1.getInternalname()) );
         AV17DynamicFiltersOperator1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator1.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
         AV18OpeNom1 = httpContext.cgiGet( edtavOpenom1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18OpeNom1", AV18OpeNom1);
         cmbavDynamicfiltersselector2.setName( cmbavDynamicfiltersselector2.getInternalname() );
         cmbavDynamicfiltersselector2.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector2.getInternalname()) );
         AV20DynamicFiltersSelector2 = httpContext.cgiGet( cmbavDynamicfiltersselector2.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersSelector2", AV20DynamicFiltersSelector2);
         cmbavDynamicfiltersoperator2.setName( cmbavDynamicfiltersoperator2.getInternalname() );
         cmbavDynamicfiltersoperator2.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator2.getInternalname()) );
         AV21DynamicFiltersOperator2 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator2.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21DynamicFiltersOperator2), 4, 0));
         AV22OpeNom2 = httpContext.cgiGet( edtavOpenom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22OpeNom2", AV22OpeNom2);
         cmbavDynamicfiltersselector3.setName( cmbavDynamicfiltersselector3.getInternalname() );
         cmbavDynamicfiltersselector3.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector3.getInternalname()) );
         AV24DynamicFiltersSelector3 = httpContext.cgiGet( cmbavDynamicfiltersselector3.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24DynamicFiltersSelector3", AV24DynamicFiltersSelector3);
         cmbavDynamicfiltersoperator3.setName( cmbavDynamicfiltersoperator3.getInternalname() );
         cmbavDynamicfiltersoperator3.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator3.getInternalname()) );
         AV25DynamicFiltersOperator3 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator3.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DynamicFiltersOperator3), 4, 0));
         AV26OpeNom3 = httpContext.cgiGet( edtavOpenom3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26OpeNom3", AV26OpeNom3);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV57FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR1"), AV16DynamicFiltersSelector1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV17DynamicFiltersOperator1 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vOPENOM1"), AV18OpeNom1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR2"), AV20DynamicFiltersSelector2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV21DynamicFiltersOperator2 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vOPENOM2"), AV22OpeNom2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR3"), AV24DynamicFiltersSelector3) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV25DynamicFiltersOperator3 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vOPENOM3"), AV26OpeNom3) != 0 )
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
      e27HH2 ();
      if (returnInSub) return;
   }

   public void e27HH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV63Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      weboperarios_impl.this.GXt_char1 = GXv_char2[0] ;
      AV63Station = GXt_char1 ;
      GXv_char2[0] = AV64Emprcod ;
      GXv_char3[0] = AV65Emprnom ;
      GXv_char4[0] = AV66Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV63Station, GXv_char2, GXv_char3, GXv_char4) ;
      weboperarios_impl.this.AV64Emprcod = GXv_char2[0] ;
      weboperarios_impl.this.AV65Emprnom = GXv_char3[0] ;
      weboperarios_impl.this.AV66Usurcod = GXv_char4[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      lblJsdynamicfilters_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
      AV16DynamicFiltersSelector1 = "OPENOM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S122 ();
      if (returnInSub) return;
      AV20DynamicFiltersSelector2 = "OPENOM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersSelector2", AV20DynamicFiltersSelector2);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S132 ();
      if (returnInSub) return;
      AV24DynamicFiltersSelector3 = "OPENOM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24DynamicFiltersSelector3", AV24DynamicFiltersSelector3);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S142 ();
      if (returnInSub) return;
      imgAdddynamicfilters1_Jsonclick = GXutil.format( "WWPDynFilterShow_AL('%1', 2, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Jsonclick", imgAdddynamicfilters1_Jsonclick, true);
      imgRemovedynamicfilters1_Jsonclick = GXutil.format( "WWPDynFilterHideLast_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Jsonclick", imgRemovedynamicfilters1_Jsonclick, true);
      imgAdddynamicfilters2_Jsonclick = GXutil.format( "WWPDynFilterShow_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Jsonclick", imgAdddynamicfilters2_Jsonclick, true);
      imgRemovedynamicfilters2_Jsonclick = GXutil.format( "WWPDynFilterHideLast_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Jsonclick", imgRemovedynamicfilters2_Jsonclick, true);
      imgRemovedynamicfilters3_Jsonclick = GXutil.format( "WWPDynFilterHideLast_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters3_Internalname, "Jsonclick", imgRemovedynamicfilters3_Jsonclick, true);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " MANTENIMIENTO DE OPERARIOS", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( AV13OrderedBy < 1 )
      {
         AV13OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S172 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV52DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV52DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e28HH2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV38ManageFiltersExecutionStep == 1 )
      {
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV38ManageFiltersExecutionStep == 2 )
      {
         AV38ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV35Session.getValue("WebOperariosColumnsSelector"), "") != 0 )
      {
         AV31ColumnsSelectorXML = AV35Session.getValue("WebOperariosColumnsSelector") ;
         AV33ColumnsSelector.fromxml(AV31ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S192 ();
         if (returnInSub) return;
      }
      chkavSeleccion.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccion.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccion.getVisible(), 5, 0), !bGXsfl_110_Refreshing);
      edtOpeCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Visible), 5, 0), !bGXsfl_110_Refreshing);
      edtOpeNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Visible), 5, 0), !bGXsfl_110_Refreshing);
      edtOpeNom2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom2_Visible), 5, 0), !bGXsfl_110_Refreshing);
      edtOpeAct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeAct_Visible), 5, 0), !bGXsfl_110_Refreshing);
      AV54GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridCurrentPage), 10, 0));
      AV55GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridPageCount), 10, 0));
      AV67Weboperariosds_1_filterfulltext = AV57FilterFullText ;
      AV68Weboperariosds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV69Weboperariosds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV70Weboperariosds_4_openom1 = AV18OpeNom1 ;
      AV71Weboperariosds_5_dynamicfiltersenabled2 = AV19DynamicFiltersEnabled2 ;
      AV72Weboperariosds_6_dynamicfiltersselector2 = AV20DynamicFiltersSelector2 ;
      AV73Weboperariosds_7_dynamicfiltersoperator2 = AV21DynamicFiltersOperator2 ;
      AV74Weboperariosds_8_openom2 = AV22OpeNom2 ;
      AV75Weboperariosds_9_dynamicfiltersenabled3 = AV23DynamicFiltersEnabled3 ;
      AV76Weboperariosds_10_dynamicfiltersselector3 = AV24DynamicFiltersSelector3 ;
      AV77Weboperariosds_11_dynamicfiltersoperator3 = AV25DynamicFiltersOperator3 ;
      AV78Weboperariosds_12_openom3 = AV26OpeNom3 ;
      AV79Weboperariosds_13_tfopecod = AV40TFOpeCod ;
      AV80Weboperariosds_14_tfopecod_to = AV41TFOpeCod_To ;
      AV81Weboperariosds_15_tfopenom = AV43TFOpeNom ;
      AV82Weboperariosds_16_tfopenom_sel = AV44TFOpeNom_Sel ;
      AV83Weboperariosds_17_tfopenom2 = AV46TFOpeNom2 ;
      AV84Weboperariosds_18_tfopenom2_sel = AV47TFOpeNom2_Sel ;
      AV85Weboperariosds_19_tfopeact = AV49TFOpeAct ;
      AV86Weboperariosds_20_tfopeact_sel = AV50TFOpeAct_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12HH2( )
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
         AV53PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV53PageToGo) ;
      }
   }

   public void e13HH2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14HH2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV13OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         AV14OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OpeCod") == 0 )
         {
            AV40TFOpeCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFOpeCod), 6, 0));
            AV41TFOpeCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OpeNom") == 0 )
         {
            AV43TFOpeNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFOpeNom", AV43TFOpeNom);
            AV44TFOpeNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFOpeNom_Sel", AV44TFOpeNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OpeNom2") == 0 )
         {
            AV46TFOpeNom2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFOpeNom2", AV46TFOpeNom2);
            AV47TFOpeNom2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFOpeNom2_Sel", AV47TFOpeNom2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OpeAct") == 0 )
         {
            AV49TFOpeAct = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFOpeAct", AV49TFOpeAct);
            AV50TFOpeAct_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFOpeAct_Sel", AV50TFOpeAct_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e29HH2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      edtOpeNom_Link = formatLink("app.toperarview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A652OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","OpeCod","TabCode"})  ;
      AV56Seleccion = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccion.getInternalname(), AV56Seleccion);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(110) ;
      }
      sendrow_1102( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_110_Refreshing )
      {
         httpContext.doAjaxLoad(110, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV60GridActions, 4, 0)) );
   }

   public void e15HH2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV31ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV33ColumnsSelector.fromJSonString(AV31ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebOperariosColumnsSelector", ((GXutil.strcmp("", AV31ColumnsSelectorXML)==0) ? "" : AV33ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e22HH2( )
   {
      /* 'AddDynamicFilters1' Routine */
      returnInSub = false ;
      AV19DynamicFiltersEnabled2 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19DynamicFiltersEnabled2", AV19DynamicFiltersEnabled2);
      imgAdddynamicfilters1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
      imgRemovedynamicfilters1_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
      /*  Sending Event outputs  */
   }

   public void e16HH2( )
   {
      /* 'RemoveDynamicFilters1' Routine */
      returnInSub = false ;
      AV27DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersRemoving", AV27DynamicFiltersRemoving);
      AV28DynamicFiltersIgnoreFirst = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28DynamicFiltersIgnoreFirst", AV28DynamicFiltersIgnoreFirst);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      AV27DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersRemoving", AV27DynamicFiltersRemoving);
      AV28DynamicFiltersIgnoreFirst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28DynamicFiltersIgnoreFirst", AV28DynamicFiltersIgnoreFirst);
      gxgrgrid_refresh( subGrid_Rows, AV57FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18OpeNom1, AV20DynamicFiltersSelector2, AV21DynamicFiltersOperator2, AV22OpeNom2, AV24DynamicFiltersSelector3, AV25DynamicFiltersOperator3, AV26OpeNom3, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV19DynamicFiltersEnabled2, AV23DynamicFiltersEnabled3, AV40TFOpeCod, AV41TFOpeCod_To, AV43TFOpeNom, AV44TFOpeNom_Sel, AV46TFOpeNom2, AV47TFOpeNom2_Sel, AV49TFOpeAct, AV50TFOpeAct_Sel, AV87Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV28DynamicFiltersIgnoreFirst, AV27DynamicFiltersRemoving, A396EmprCod) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV20DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV24DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
   }

   public void e23HH2( )
   {
      /* Dynamicfiltersselector1_Click Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e24HH2( )
   {
      /* 'AddDynamicFilters2' Routine */
      returnInSub = false ;
      AV23DynamicFiltersEnabled3 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23DynamicFiltersEnabled3", AV23DynamicFiltersEnabled3);
      imgAdddynamicfilters2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
      imgRemovedynamicfilters2_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
      /*  Sending Event outputs  */
   }

   public void e17HH2( )
   {
      /* 'RemoveDynamicFilters2' Routine */
      returnInSub = false ;
      AV27DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersRemoving", AV27DynamicFiltersRemoving);
      AV19DynamicFiltersEnabled2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19DynamicFiltersEnabled2", AV19DynamicFiltersEnabled2);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      AV27DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersRemoving", AV27DynamicFiltersRemoving);
      gxgrgrid_refresh( subGrid_Rows, AV57FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18OpeNom1, AV20DynamicFiltersSelector2, AV21DynamicFiltersOperator2, AV22OpeNom2, AV24DynamicFiltersSelector3, AV25DynamicFiltersOperator3, AV26OpeNom3, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV19DynamicFiltersEnabled2, AV23DynamicFiltersEnabled3, AV40TFOpeCod, AV41TFOpeCod_To, AV43TFOpeNom, AV44TFOpeNom_Sel, AV46TFOpeNom2, AV47TFOpeNom2_Sel, AV49TFOpeAct, AV50TFOpeAct_Sel, AV87Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV28DynamicFiltersIgnoreFirst, AV27DynamicFiltersRemoving, A396EmprCod) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV20DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV24DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
   }

   public void e25HH2( )
   {
      /* Dynamicfiltersselector2_Click Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e18HH2( )
   {
      /* 'RemoveDynamicFilters3' Routine */
      returnInSub = false ;
      AV27DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersRemoving", AV27DynamicFiltersRemoving);
      AV23DynamicFiltersEnabled3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23DynamicFiltersEnabled3", AV23DynamicFiltersEnabled3);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      AV27DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersRemoving", AV27DynamicFiltersRemoving);
      gxgrgrid_refresh( subGrid_Rows, AV57FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18OpeNom1, AV20DynamicFiltersSelector2, AV21DynamicFiltersOperator2, AV22OpeNom2, AV24DynamicFiltersSelector3, AV25DynamicFiltersOperator3, AV26OpeNom3, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV19DynamicFiltersEnabled2, AV23DynamicFiltersEnabled3, AV40TFOpeCod, AV41TFOpeCod_To, AV43TFOpeNom, AV44TFOpeNom_Sel, AV46TFOpeNom2, AV47TFOpeNom2_Sel, AV49TFOpeAct, AV50TFOpeAct_Sel, AV87Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV28DynamicFiltersIgnoreFirst, AV27DynamicFiltersRemoving, A396EmprCod) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV20DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV24DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
   }

   public void e26HH2( )
   {
      /* Dynamicfiltersselector3_Click Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S142 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e11HH2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S232 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S182 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebOperariosFilters")),GXutil.URLEncode(GXutil.rtrim(AV87Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebOperariosFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV37ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebOperariosFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         weboperarios_impl.this.GXt_char1 = GXv_char4[0] ;
         AV37ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV37ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S232 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV87Pgmname+"GridState", AV37ManageFiltersXml) ;
            AV10GridState.fromxml(AV37ManageFiltersXml, null, null);
            AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
            AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S172 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S242 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
            S222 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV20DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV24DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
   }

   public void e19HH2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      GXv_char4[0] = AV29ExcelFilename ;
      GXv_char3[0] = AV30ErrorMessage ;
      new app.weboperariosexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      weboperarios_impl.this.AV29ExcelFilename = GXv_char4[0] ;
      weboperarios_impl.this.AV30ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV29ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV29ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV30ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV20DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV24DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void e20HH2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.weboperariosexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV20DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV24DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void e21HH2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.weboperariosexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV20DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV24DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void S172( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S192( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV33ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Seleccion", "", "", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "OpeCod", "", "Operario", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "OpeNom", "", "Nombre", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "OpeNom2", "", "Nombre II", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "OpeAct", "", "A/I", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV32UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebOperariosColumnsSelector", GXv_char4) ;
      weboperarios_impl.this.GXt_char1 = GXv_char4[0] ;
      AV32UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV32UserCustomValue)==0) ) )
      {
         AV34ColumnsSelectorAux.fromxml(AV32UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV33ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV34ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV33ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S122( )
   {
      /* 'ENABLEDYNAMICFILTERS1' Routine */
      returnInSub = false ;
      edtavOpenom1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom1_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator1.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "OPENOM") == 0 )
      {
         edtavOpenom1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavOpenom1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom1_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator1.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      }
   }

   public void S132( )
   {
      /* 'ENABLEDYNAMICFILTERS2' Routine */
      returnInSub = false ;
      edtavOpenom2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom2_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator2.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV20DynamicFiltersSelector2, "OPENOM") == 0 )
      {
         edtavOpenom2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavOpenom2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom2_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator2.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      }
   }

   public void S142( )
   {
      /* 'ENABLEDYNAMICFILTERS3' Routine */
      returnInSub = false ;
      edtavOpenom3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpenom3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom3_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator3.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV24DynamicFiltersSelector3, "OPENOM") == 0 )
      {
         edtavOpenom3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavOpenom3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom3_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator3.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      }
   }

   public void S212( )
   {
      /* 'RESETDYNFILTERS' Routine */
      returnInSub = false ;
      AV19DynamicFiltersEnabled2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19DynamicFiltersEnabled2", AV19DynamicFiltersEnabled2);
      AV20DynamicFiltersSelector2 = "OPENOM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersSelector2", AV20DynamicFiltersSelector2);
      AV21DynamicFiltersOperator2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21DynamicFiltersOperator2), 4, 0));
      AV22OpeNom2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22OpeNom2", AV22OpeNom2);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S132 ();
      if (returnInSub) return;
      AV23DynamicFiltersEnabled3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23DynamicFiltersEnabled3", AV23DynamicFiltersEnabled3);
      AV24DynamicFiltersSelector3 = "OPENOM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24DynamicFiltersSelector3", AV24DynamicFiltersSelector3);
      AV25DynamicFiltersOperator3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DynamicFiltersOperator3), 4, 0));
      AV26OpeNom3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26OpeNom3", AV26OpeNom3);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S142 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV36ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebOperariosFilters", "WWPDynFilterHideAll_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV36ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S232( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV57FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57FilterFullText", AV57FilterFullText);
      AV40TFOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFOpeCod), 6, 0));
      AV41TFOpeCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFOpeCod_To), 6, 0));
      AV43TFOpeNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFOpeNom", AV43TFOpeNom);
      AV44TFOpeNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFOpeNom_Sel", AV44TFOpeNom_Sel);
      AV46TFOpeNom2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFOpeNom2", AV46TFOpeNom2);
      AV47TFOpeNom2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFOpeNom2_Sel", AV47TFOpeNom2_Sel);
      AV49TFOpeAct = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFOpeAct", AV49TFOpeAct);
      AV50TFOpeAct_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFOpeAct_Sel", AV50TFOpeAct_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      AV16DynamicFiltersSelector1 = "OPENOM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      AV17DynamicFiltersOperator1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
      AV18OpeNom1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18OpeNom1", AV18OpeNom1);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if (returnInSub) return;
      AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().clear();
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
   }

   public void S252( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.toperar", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A652OpeCod,6,0))}, new String[] {"Mode","EmprCod","OpeCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S262( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.toperar", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A652OpeCod,6,0))}, new String[] {"Mode","EmprCod","OpeCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S162( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue(AV87Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV87Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV35Session.getValue(AV87Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S242 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S242( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV88GXV1 = 1 ;
      while ( AV88GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV88GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV57FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57FilterFullText", AV57FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPECOD") == 0 )
         {
            AV40TFOpeCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFOpeCod), 6, 0));
            AV41TFOpeCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM") == 0 )
         {
            AV43TFOpeNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFOpeNom", AV43TFOpeNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM_SEL") == 0 )
         {
            AV44TFOpeNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFOpeNom_Sel", AV44TFOpeNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2") == 0 )
         {
            AV46TFOpeNom2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFOpeNom2", AV46TFOpeNom2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2_SEL") == 0 )
         {
            AV47TFOpeNom2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFOpeNom2_Sel", AV47TFOpeNom2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT") == 0 )
         {
            AV49TFOpeAct = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFOpeAct", AV49TFOpeAct);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT_SEL") == 0 )
         {
            AV50TFOpeAct_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFOpeAct_Sel", AV50TFOpeAct_Sel);
         }
         AV88GXV1 = (int)(AV88GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFOpeNom_Sel)==0), AV44TFOpeNom_Sel, GXv_char4) ;
      weboperarios_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFOpeNom2_Sel)==0), AV47TFOpeNom2_Sel, GXv_char3) ;
      weboperarios_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFOpeAct_Sel)==0), AV50TFOpeAct_Sel, GXv_char2) ;
      weboperarios_impl.this.GXt_char13 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFOpeNom)==0), AV43TFOpeNom, GXv_char4) ;
      weboperarios_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFOpeNom2)==0), AV46TFOpeNom2, GXv_char3) ;
      weboperarios_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFOpeAct)==0), AV49TFOpeAct, GXv_char2) ;
      weboperarios_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV40TFOpeCod) ? "" : GXutil.str( AV40TFOpeCod, 6, 0))+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV41TFOpeCod_To) ? "" : GXutil.str( AV41TFOpeCod_To, 6, 0))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S222( )
   {
      /* 'LOADDYNFILTERSSTATE' Routine */
      returnInSub = false ;
      imgAdddynamicfilters1_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
      imgRemovedynamicfilters1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
      imgAdddynamicfilters2_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
      imgRemovedynamicfilters2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
      if ( AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV16DynamicFiltersSelector1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
         if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "OPENOM") == 0 )
         {
            AV17DynamicFiltersOperator1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
            AV18OpeNom1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18OpeNom1", AV18OpeNom1);
         }
         /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
         S122 ();
         if (returnInSub) return;
         if ( AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            lblJsdynamicfilters_Caption = "<script type=\"text/javascript\">$(document).ready(function() {" ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
            lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+GXutil.format( "WWPDynFilterShow_AL('%1', 2, 0);", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
            imgAdddynamicfilters1_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
            imgRemovedynamicfilters1_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
            AV19DynamicFiltersEnabled2 = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19DynamicFiltersEnabled2", AV19DynamicFiltersEnabled2);
            AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV20DynamicFiltersSelector2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersSelector2", AV20DynamicFiltersSelector2);
            if ( GXutil.strcmp(AV20DynamicFiltersSelector2, "OPENOM") == 0 )
            {
               AV21DynamicFiltersOperator2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21DynamicFiltersOperator2), 4, 0));
               AV22OpeNom2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22OpeNom2", AV22OpeNom2);
            }
            /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
            S132 ();
            if (returnInSub) return;
            if ( AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+GXutil.format( "WWPDynFilterShow_AL('%1', 3, 0);", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
               imgAdddynamicfilters2_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
               imgRemovedynamicfilters2_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
               AV23DynamicFiltersEnabled3 = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23DynamicFiltersEnabled3", AV23DynamicFiltersEnabled3);
               AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV24DynamicFiltersSelector3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24DynamicFiltersSelector3", AV24DynamicFiltersSelector3);
               if ( GXutil.strcmp(AV24DynamicFiltersSelector3, "OPENOM") == 0 )
               {
                  AV25DynamicFiltersOperator3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DynamicFiltersOperator3), 4, 0));
                  AV26OpeNom3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26OpeNom3", AV26OpeNom3);
               }
               /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
               S142 ();
               if (returnInSub) return;
            }
            lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+"});</script>" ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
         }
      }
      if ( AV27DynamicFiltersRemoving )
      {
         lblJsdynamicfilters_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
      }
   }

   public void S182( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV35Session.getValue(AV87Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV57FilterFullText)==0), (short)(0), AV57FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFOPECOD", "", !((0==AV40TFOpeCod)&&(0==AV41TFOpeCod_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFOpeCod, 6, 0)), GXutil.trim( GXutil.str( AV41TFOpeCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFOPENOM", "", !(GXutil.strcmp("", AV43TFOpeNom)==0), (short)(0), AV43TFOpeNom, "", !(GXutil.strcmp("", AV44TFOpeNom_Sel)==0), AV44TFOpeNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFOPENOM2", "", !(GXutil.strcmp("", AV46TFOpeNom2)==0), (short)(0), AV46TFOpeNom2, "", !(GXutil.strcmp("", AV47TFOpeNom2_Sel)==0), AV47TFOpeNom2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFOPEACT", "", !(GXutil.strcmp("", AV49TFOpeAct)==0), (short)(0), AV49TFOpeAct, "", !(GXutil.strcmp("", AV50TFOpeAct_Sel)==0), AV50TFOpeAct_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV87Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S202( )
   {
      /* 'SAVEDYNFILTERSSTATE' Routine */
      returnInSub = false ;
      AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().clear();
      if ( ! AV28DynamicFiltersIgnoreFirst )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV16DynamicFiltersSelector1 );
         if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "OPENOM") == 0 ) && ! (GXutil.strcmp("", AV18OpeNom1)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV18OpeNom1 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV17DynamicFiltersOperator1 );
         }
         if ( AV27DynamicFiltersRemoving || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) )
         {
            AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV12GridStateDynamicFilter, 0);
         }
      }
      if ( AV19DynamicFiltersEnabled2 )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV20DynamicFiltersSelector2 );
         if ( ( GXutil.strcmp(AV20DynamicFiltersSelector2, "OPENOM") == 0 ) && ! (GXutil.strcmp("", AV22OpeNom2)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV22OpeNom2 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV21DynamicFiltersOperator2 );
         }
         if ( AV27DynamicFiltersRemoving || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) )
         {
            AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV12GridStateDynamicFilter, 0);
         }
      }
      if ( AV23DynamicFiltersEnabled3 )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV24DynamicFiltersSelector3 );
         if ( ( GXutil.strcmp(AV24DynamicFiltersSelector3, "OPENOM") == 0 ) && ! (GXutil.strcmp("", AV26OpeNom3)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV26OpeNom3 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV25DynamicFiltersOperator3 );
         }
         if ( AV27DynamicFiltersRemoving || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) )
         {
            AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV12GridStateDynamicFilter, 0);
         }
      }
   }

   public void S152( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV87Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TOPERAR" );
      AV35Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_HH2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV36ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_HH2( true) ;
      }
      else
      {
         wb_table2_30_HH2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_HH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_HH2e( true) ;
      }
      else
      {
         wb_table1_25_HH2e( false) ;
      }
   }

   public void wb_table2_30_HH2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_110_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV57FilterFullText, GXutil.rtrim( localUtil.format( AV57FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfilters_Internalname, 1, 0, "px", 0, "px", "TableDynamicFilters", "left", "top", " "+"data-gx-flex"+" ", "flex-direction:column;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DynRowVisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfiltersrow1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix1_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector1.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_110_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector1, cmbavDynamicfiltersselector1.getInternalname(), GXutil.rtrim( AV16DynamicFiltersSelector1), 1, cmbavDynamicfiltersselector1.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR1.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector1.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "", true, (byte)(0), "HLP_WebOperarios.htm");
         cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle1_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         wb_table3_48_HH2( true) ;
      }
      else
      {
         wb_table3_48_HH2( false) ;
      }
      return  ;
   }

   public void wb_table3_48_HH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfiltersrow2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix2_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector2.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_110_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector2, cmbavDynamicfiltersselector2.getInternalname(), GXutil.rtrim( AV20DynamicFiltersSelector2), 1, cmbavDynamicfiltersselector2.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR2.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector2.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "", true, (byte)(0), "HLP_WebOperarios.htm");
         cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV20DynamicFiltersSelector2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle2_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         wb_table4_70_HH2( true) ;
      }
      else
      {
         wb_table4_70_HH2( false) ;
      }
      return  ;
   }

   public void wb_table4_70_HH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfiltersrow3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix3_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector3.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_110_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector3, cmbavDynamicfiltersselector3.getInternalname(), GXutil.rtrim( AV24DynamicFiltersSelector3), 1, cmbavDynamicfiltersselector3.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR3.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector3.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "", true, (byte)(0), "HLP_WebOperarios.htm");
         cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV24DynamicFiltersSelector3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle3_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         wb_table5_92_HH2( true) ;
      }
      else
      {
         wb_table5_92_HH2( false) ;
      }
      return  ;
   }

   public void wb_table5_92_HH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_HH2e( true) ;
      }
      else
      {
         wb_table2_30_HH2e( false) ;
      }
   }

   public void wb_table5_92_HH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddynamicfilters3_Internalname, tblTablemergeddynamicfilters3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersoperator3.getInternalname(), httpContext.getMessage( "Dynamic Filters Operator3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_110_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator3, cmbavDynamicfiltersoperator3.getInternalname(), GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0)), 1, cmbavDynamicfiltersoperator3.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator3.getVisible(), cmbavDynamicfiltersoperator3.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "", true, (byte)(0), "HLP_WebOperarios.htm");
         cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_openom3_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOpenom3_Internalname, httpContext.getMessage( "Ope Nom3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_110_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpenom3_Internalname, GXutil.rtrim( AV26OpeNom3), GXutil.rtrim( localUtil.format( AV26OpeNom3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpenom3_Jsonclick, 0, "Attribute", "", "", "", "", edtavOpenom3_Visible, edtavOpenom3_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter3_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters3_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters3_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters3_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters3_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS3\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebOperarios.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_92_HH2e( true) ;
      }
      else
      {
         wb_table5_92_HH2e( false) ;
      }
   }

   public void wb_table4_70_HH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddynamicfilters2_Internalname, tblTablemergeddynamicfilters2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersoperator2.getInternalname(), httpContext.getMessage( "Dynamic Filters Operator2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_110_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator2, cmbavDynamicfiltersoperator2.getInternalname(), GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0)), 1, cmbavDynamicfiltersoperator2.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator2.getVisible(), cmbavDynamicfiltersoperator2.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "", true, (byte)(0), "HLP_WebOperarios.htm");
         cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_openom2_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOpenom2_Internalname, httpContext.getMessage( "Ope Nom2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_110_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpenom2_Internalname, GXutil.rtrim( AV22OpeNom2), GXutil.rtrim( localUtil.format( AV22OpeNom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpenom2_Jsonclick, 0, "Attribute", "", "", "", "", edtavOpenom2_Visible, edtavOpenom2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_addfilter2_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgAdddynamicfilters2_gximage, "")==0) ? "GX_Image_ActionNewDynamicFilter_Class" : "GX_Image_"+imgAdddynamicfilters2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "27283ea5-332f-423b-b880-64b762622df3", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgAdddynamicfilters2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgAdddynamicfilters2_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterAddTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgAdddynamicfilters2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ADDDYNAMICFILTERS2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebOperarios.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter2_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters2_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgRemovedynamicfilters2_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebOperarios.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_70_HH2e( true) ;
      }
      else
      {
         wb_table4_70_HH2e( false) ;
      }
   }

   public void wb_table3_48_HH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddynamicfilters1_Internalname, tblTablemergeddynamicfilters1_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersoperator1.getInternalname(), httpContext.getMessage( "Dynamic Filters Operator1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_110_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator1, cmbavDynamicfiltersoperator1.getInternalname(), GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)), 1, cmbavDynamicfiltersoperator1.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator1.getVisible(), cmbavDynamicfiltersoperator1.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "", true, (byte)(0), "HLP_WebOperarios.htm");
         cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_openom1_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOpenom1_Internalname, httpContext.getMessage( "Ope Nom1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_110_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpenom1_Internalname, GXutil.rtrim( AV18OpeNom1), GXutil.rtrim( localUtil.format( AV18OpeNom1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpenom1_Jsonclick, 0, "Attribute", "", "", "", "", edtavOpenom1_Visible, edtavOpenom1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebOperarios.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_addfilter1_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgAdddynamicfilters1_gximage, "")==0) ? "GX_Image_ActionNewDynamicFilter_Class" : "GX_Image_"+imgAdddynamicfilters1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "27283ea5-332f-423b-b880-64b762622df3", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgAdddynamicfilters1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgAdddynamicfilters1_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterAddTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgAdddynamicfilters1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ADDDYNAMICFILTERS1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebOperarios.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter1_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters1_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgRemovedynamicfilters1_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebOperarios.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_48_HH2e( true) ;
      }
      else
      {
         wb_table3_48_HH2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      paHH2( ) ;
      wsHH2( ) ;
      weHH2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211612122", true, true);
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
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("weboperarios.js", "?20268211612122", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1102( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_110_idx );
      chkavSeleccion.setInternalname( "vSELECCION_"+sGXsfl_110_idx );
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_110_idx ;
      edtOpeNom_Internalname = "OPENOM_"+sGXsfl_110_idx ;
      edtOpeNom2_Internalname = "OPENOM2_"+sGXsfl_110_idx ;
      edtOpeAct_Internalname = "OPEACT_"+sGXsfl_110_idx ;
      edtOpeCNom_Internalname = "OPECNOM_"+sGXsfl_110_idx ;
   }

   public void subsflControlProps_fel_1102( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_110_fel_idx );
      chkavSeleccion.setInternalname( "vSELECCION_"+sGXsfl_110_fel_idx );
      edtOpeCod_Internalname = "OPECOD_"+sGXsfl_110_fel_idx ;
      edtOpeNom_Internalname = "OPENOM_"+sGXsfl_110_fel_idx ;
      edtOpeNom2_Internalname = "OPENOM2_"+sGXsfl_110_fel_idx ;
      edtOpeAct_Internalname = "OPEACT_"+sGXsfl_110_fel_idx ;
      edtOpeCNom_Internalname = "OPECNOM_"+sGXsfl_110_fel_idx ;
   }

   public void sendrow_1102( )
   {
      subsflControlProps_1102( ) ;
      wbHH0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_110_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_110_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_110_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'',false,'"+sGXsfl_110_idx+"',110)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_110_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV60GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV60GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV60GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e30hh2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,111);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV60GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_110_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccion.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccion.getEnabled()!=0)&&(chkavSeleccion.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'',false,'"+sGXsfl_110_idx+"',110)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCION_" + sGXsfl_110_idx ;
         chkavSeleccion.setName( GXCCtl );
         chkavSeleccion.setWebtags( "" );
         chkavSeleccion.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccion.getInternalname(), "TitleCaption", chkavSeleccion.getCaption(), !bGXsfl_110_Refreshing);
         chkavSeleccion.setCheckedValue( "N" );
         AV56Seleccion = ((GXutil.strcmp(GXutil.rtrim( AV56Seleccion), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccion.getInternalname(), AV56Seleccion);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccion.getInternalname(),AV56Seleccion,"","",Integer.valueOf(chkavSeleccion.getVisible()),Integer.valueOf(chkavSeleccion.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(112, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccion.getEnabled()!=0)&&(chkavSeleccion.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,112);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtOpeCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOpeCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOpeNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeNom_Internalname,GXutil.rtrim( A653OpeNom),"","","'"+""+"'"+",false,"+"'"+""+"'",edtOpeNom_Link,"","","",edtOpeNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtOpeNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOpeNom2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeNom2_Internalname,GXutil.rtrim( A6869OpeNom2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOpeNom2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOpeNom2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOpeAct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeAct_Internalname,GXutil.rtrim( A8482OpeAct),GXutil.rtrim( localUtil.format( A8482OpeAct, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOpeAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOpeAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOpeCNom_Internalname,A13748OpeCNom,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOpeCNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(110),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesHH2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_110_idx = ((subGrid_Islastpage==1)&&(nGXsfl_110_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_110_idx+1) ;
         sGXsfl_110_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_110_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1102( ) ;
      }
      /* End function sendrow_1102 */
   }

   public void startgridcontrol110( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"110\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccion.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOpeCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOpeNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOpeNom2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre II", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOpeAct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A/I", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV60GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV56Seleccion));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSeleccion.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccion.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOpeCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A653OpeNom));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtOpeNom_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOpeNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6869OpeNom2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOpeNom2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8482OpeAct));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOpeAct_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13748OpeCNom);
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportreport_Internalname = "BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      lblDynamicfiltersprefix1_Internalname = "DYNAMICFILTERSPREFIX1" ;
      cmbavDynamicfiltersselector1.setInternalname( "vDYNAMICFILTERSSELECTOR1" );
      lblDynamicfiltersmiddle1_Internalname = "DYNAMICFILTERSMIDDLE1" ;
      cmbavDynamicfiltersoperator1.setInternalname( "vDYNAMICFILTERSOPERATOR1" );
      edtavOpenom1_Internalname = "vOPENOM1" ;
      cellFilter_openom1_cell_Internalname = "FILTER_OPENOM1_CELL" ;
      imgAdddynamicfilters1_Internalname = "ADDDYNAMICFILTERS1" ;
      cellDynamicfilters_addfilter1_cell_Internalname = "DYNAMICFILTERS_ADDFILTER1_CELL" ;
      imgRemovedynamicfilters1_Internalname = "REMOVEDYNAMICFILTERS1" ;
      cellDynamicfilters_removefilter1_cell_Internalname = "DYNAMICFILTERS_REMOVEFILTER1_CELL" ;
      tblTablemergeddynamicfilters1_Internalname = "TABLEMERGEDDYNAMICFILTERS1" ;
      divTabledynamicfiltersrow1_Internalname = "TABLEDYNAMICFILTERSROW1" ;
      lblDynamicfiltersprefix2_Internalname = "DYNAMICFILTERSPREFIX2" ;
      cmbavDynamicfiltersselector2.setInternalname( "vDYNAMICFILTERSSELECTOR2" );
      lblDynamicfiltersmiddle2_Internalname = "DYNAMICFILTERSMIDDLE2" ;
      cmbavDynamicfiltersoperator2.setInternalname( "vDYNAMICFILTERSOPERATOR2" );
      edtavOpenom2_Internalname = "vOPENOM2" ;
      cellFilter_openom2_cell_Internalname = "FILTER_OPENOM2_CELL" ;
      imgAdddynamicfilters2_Internalname = "ADDDYNAMICFILTERS2" ;
      cellDynamicfilters_addfilter2_cell_Internalname = "DYNAMICFILTERS_ADDFILTER2_CELL" ;
      imgRemovedynamicfilters2_Internalname = "REMOVEDYNAMICFILTERS2" ;
      cellDynamicfilters_removefilter2_cell_Internalname = "DYNAMICFILTERS_REMOVEFILTER2_CELL" ;
      tblTablemergeddynamicfilters2_Internalname = "TABLEMERGEDDYNAMICFILTERS2" ;
      divTabledynamicfiltersrow2_Internalname = "TABLEDYNAMICFILTERSROW2" ;
      lblDynamicfiltersprefix3_Internalname = "DYNAMICFILTERSPREFIX3" ;
      cmbavDynamicfiltersselector3.setInternalname( "vDYNAMICFILTERSSELECTOR3" );
      lblDynamicfiltersmiddle3_Internalname = "DYNAMICFILTERSMIDDLE3" ;
      cmbavDynamicfiltersoperator3.setInternalname( "vDYNAMICFILTERSOPERATOR3" );
      edtavOpenom3_Internalname = "vOPENOM3" ;
      cellFilter_openom3_cell_Internalname = "FILTER_OPENOM3_CELL" ;
      imgRemovedynamicfilters3_Internalname = "REMOVEDYNAMICFILTERS3" ;
      cellDynamicfilters_removefilter3_cell_Internalname = "DYNAMICFILTERS_REMOVEFILTER3_CELL" ;
      tblTablemergeddynamicfilters3_Internalname = "TABLEMERGEDDYNAMICFILTERS3" ;
      divTabledynamicfiltersrow3_Internalname = "TABLEDYNAMICFILTERSROW3" ;
      divTabledynamicfilters_Internalname = "TABLEDYNAMICFILTERS" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      chkavSeleccion.setInternalname( "vSELECCION" );
      edtOpeCod_Internalname = "OPECOD" ;
      edtOpeNom_Internalname = "OPENOM" ;
      edtOpeNom2_Internalname = "OPENOM2" ;
      edtOpeAct_Internalname = "OPEACT" ;
      edtOpeCNom_Internalname = "OPECNOM" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      lblJsdynamicfilters_Internalname = "JSDYNAMICFILTERS" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtOpeCNom_Jsonclick = "" ;
      edtOpeAct_Jsonclick = "" ;
      edtOpeNom2_Jsonclick = "" ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Link = "" ;
      edtOpeCod_Jsonclick = "" ;
      chkavSeleccion.setCaption( "" );
      chkavSeleccion.setEnabled( 1 );
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      imgRemovedynamicfilters1_Visible = 1 ;
      imgAdddynamicfilters1_Visible = 1 ;
      edtavOpenom1_Jsonclick = "" ;
      edtavOpenom1_Enabled = 1 ;
      cmbavDynamicfiltersoperator1.setJsonclick( "" );
      cmbavDynamicfiltersoperator1.setEnabled( 1 );
      imgRemovedynamicfilters2_Visible = 1 ;
      imgAdddynamicfilters2_Visible = 1 ;
      edtavOpenom2_Jsonclick = "" ;
      edtavOpenom2_Enabled = 1 ;
      cmbavDynamicfiltersoperator2.setJsonclick( "" );
      cmbavDynamicfiltersoperator2.setEnabled( 1 );
      edtavOpenom3_Jsonclick = "" ;
      edtavOpenom3_Enabled = 1 ;
      cmbavDynamicfiltersoperator3.setJsonclick( "" );
      cmbavDynamicfiltersoperator3.setEnabled( 1 );
      cmbavDynamicfiltersselector3.setJsonclick( "" );
      cmbavDynamicfiltersselector3.setEnabled( 1 );
      cmbavDynamicfiltersselector2.setJsonclick( "" );
      cmbavDynamicfiltersselector2.setEnabled( 1 );
      cmbavDynamicfiltersselector1.setJsonclick( "" );
      cmbavDynamicfiltersselector1.setEnabled( 1 );
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbavDynamicfiltersoperator3.setVisible( 1 );
      edtavOpenom3_Visible = 1 ;
      cmbavDynamicfiltersoperator2.setVisible( 1 );
      edtavOpenom2_Visible = 1 ;
      cmbavDynamicfiltersoperator1.setVisible( 1 );
      edtavOpenom1_Visible = 1 ;
      edtOpeAct_Visible = -1 ;
      edtOpeNom2_Visible = -1 ;
      edtOpeNom_Visible = -1 ;
      edtOpeCod_Visible = -1 ;
      chkavSeleccion.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      lblJsdynamicfilters_Caption = httpContext.getMessage( "JSDynamicFilters", "") ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "WebOperariosGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "||T|T|T" ;
      Ddo_grid_Filterisrange = "|T|||" ;
      Ddo_grid_Filtertype = "|Numeric|Character|Character|Character" ;
      Ddo_grid_Includefilter = "|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|2|1|3|4" ;
      Ddo_grid_Columnids = "1:Seleccion|2:OpeCod|3:OpeNom|4:OpeNom2|5:OpeAct" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " MANTENIMIENTO DE OPERARIOS", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavDynamicfiltersselector1.setName( "vDYNAMICFILTERSSELECTOR1" );
      cmbavDynamicfiltersselector1.setWebtags( "" );
      cmbavDynamicfiltersselector1.addItem("OPENOM", httpContext.getMessage( "Nombre", ""), (short)(0));
      if ( cmbavDynamicfiltersselector1.getItemCount() > 0 )
      {
         AV16DynamicFiltersSelector1 = cmbavDynamicfiltersselector1.getValidValue(AV16DynamicFiltersSelector1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      }
      cmbavDynamicfiltersoperator1.setName( "vDYNAMICFILTERSOPERATOR1" );
      cmbavDynamicfiltersoperator1.setWebtags( "" );
      cmbavDynamicfiltersoperator1.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      cmbavDynamicfiltersoperator1.addItem("1", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
      if ( cmbavDynamicfiltersoperator1.getItemCount() > 0 )
      {
         AV17DynamicFiltersOperator1 = (short)(GXutil.lval( cmbavDynamicfiltersoperator1.getValidValue(GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
      }
      cmbavDynamicfiltersselector2.setName( "vDYNAMICFILTERSSELECTOR2" );
      cmbavDynamicfiltersselector2.setWebtags( "" );
      cmbavDynamicfiltersselector2.addItem("OPENOM", httpContext.getMessage( "Nombre", ""), (short)(0));
      if ( cmbavDynamicfiltersselector2.getItemCount() > 0 )
      {
         AV20DynamicFiltersSelector2 = cmbavDynamicfiltersselector2.getValidValue(AV20DynamicFiltersSelector2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersSelector2", AV20DynamicFiltersSelector2);
      }
      cmbavDynamicfiltersoperator2.setName( "vDYNAMICFILTERSOPERATOR2" );
      cmbavDynamicfiltersoperator2.setWebtags( "" );
      cmbavDynamicfiltersoperator2.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      cmbavDynamicfiltersoperator2.addItem("1", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
      if ( cmbavDynamicfiltersoperator2.getItemCount() > 0 )
      {
         AV21DynamicFiltersOperator2 = (short)(GXutil.lval( cmbavDynamicfiltersoperator2.getValidValue(GXutil.trim( GXutil.str( AV21DynamicFiltersOperator2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21DynamicFiltersOperator2), 4, 0));
      }
      cmbavDynamicfiltersselector3.setName( "vDYNAMICFILTERSSELECTOR3" );
      cmbavDynamicfiltersselector3.setWebtags( "" );
      cmbavDynamicfiltersselector3.addItem("OPENOM", httpContext.getMessage( "Nombre", ""), (short)(0));
      if ( cmbavDynamicfiltersselector3.getItemCount() > 0 )
      {
         AV24DynamicFiltersSelector3 = cmbavDynamicfiltersselector3.getValidValue(AV24DynamicFiltersSelector3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24DynamicFiltersSelector3", AV24DynamicFiltersSelector3);
      }
      cmbavDynamicfiltersoperator3.setName( "vDYNAMICFILTERSOPERATOR3" );
      cmbavDynamicfiltersoperator3.setWebtags( "" );
      cmbavDynamicfiltersoperator3.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      cmbavDynamicfiltersoperator3.addItem("1", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
      if ( cmbavDynamicfiltersoperator3.getItemCount() > 0 )
      {
         AV25DynamicFiltersOperator3 = (short)(GXutil.lval( cmbavDynamicfiltersoperator3.getValidValue(GXutil.trim( GXutil.str( AV25DynamicFiltersOperator3, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DynamicFiltersOperator3), 4, 0));
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_110_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV60GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV60GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GridActions), 4, 0));
      }
      GXCCtl = "vSELECCION_" + sGXsfl_110_idx ;
      chkavSeleccion.setName( GXCCtl );
      chkavSeleccion.setWebtags( "" );
      chkavSeleccion.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccion.getInternalname(), "TitleCaption", chkavSeleccion.getCaption(), !bGXsfl_110_Refreshing);
      chkavSeleccion.setCheckedValue( "N" );
      AV56Seleccion = ((GXutil.strcmp(GXutil.rtrim( AV56Seleccion), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccion.getInternalname(), AV56Seleccion);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccion.getVisible()',ctrl:'vSELECCION',prop:'Visible'},{av:'edtOpeCod_Visible',ctrl:'OPECOD',prop:'Visible'},{av:'edtOpeNom_Visible',ctrl:'OPENOM',prop:'Visible'},{av:'edtOpeNom2_Visible',ctrl:'OPENOM2',prop:'Visible'},{av:'edtOpeAct_Visible',ctrl:'OPEACT',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12HH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13HH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14HH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e29HH2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV60GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtOpeNom_Link',ctrl:'OPENOM',prop:'Link'},{av:'AV56Seleccion',fld:'vSELECCION',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15HH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccion.getVisible()',ctrl:'vSELECCION',prop:'Visible'},{av:'edtOpeCod_Visible',ctrl:'OPECOD',prop:'Visible'},{av:'edtOpeNom_Visible',ctrl:'OPENOM',prop:'Visible'},{av:'edtOpeNom2_Visible',ctrl:'OPENOM2',prop:'Visible'},{av:'edtOpeAct_Visible',ctrl:'OPEACT',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'ADDDYNAMICFILTERS1'","{handler:'e22HH2',iparms:[]");
      setEventMetadata("'ADDDYNAMICFILTERS1'",",oparms:[{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS1'","{handler:'e16HH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS1'",",oparms:[{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'edtavOpenom2_Visible',ctrl:'vOPENOM2',prop:'Visible'},{av:'edtavOpenom3_Visible',ctrl:'vOPENOM3',prop:'Visible'},{av:'edtavOpenom1_Visible',ctrl:'vOPENOM1',prop:'Visible'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccion.getVisible()',ctrl:'vSELECCION',prop:'Visible'},{av:'edtOpeCod_Visible',ctrl:'OPECOD',prop:'Visible'},{av:'edtOpeNom_Visible',ctrl:'OPENOM',prop:'Visible'},{av:'edtOpeNom2_Visible',ctrl:'OPENOM2',prop:'Visible'},{av:'edtOpeAct_Visible',ctrl:'OPEACT',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR1.CLICK","{handler:'e23HH2',iparms:[{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR1.CLICK",",oparms:[{av:'edtavOpenom1_Visible',ctrl:'vOPENOM1',prop:'Visible'},{av:'cmbavDynamicfiltersoperator1'}]}");
      setEventMetadata("'ADDDYNAMICFILTERS2'","{handler:'e24HH2',iparms:[]");
      setEventMetadata("'ADDDYNAMICFILTERS2'",",oparms:[{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS2'","{handler:'e17HH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS2'",",oparms:[{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'edtavOpenom2_Visible',ctrl:'vOPENOM2',prop:'Visible'},{av:'edtavOpenom3_Visible',ctrl:'vOPENOM3',prop:'Visible'},{av:'edtavOpenom1_Visible',ctrl:'vOPENOM1',prop:'Visible'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccion.getVisible()',ctrl:'vSELECCION',prop:'Visible'},{av:'edtOpeCod_Visible',ctrl:'OPECOD',prop:'Visible'},{av:'edtOpeNom_Visible',ctrl:'OPENOM',prop:'Visible'},{av:'edtOpeNom2_Visible',ctrl:'OPENOM2',prop:'Visible'},{av:'edtOpeAct_Visible',ctrl:'OPEACT',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR2.CLICK","{handler:'e25HH2',iparms:[{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR2.CLICK",",oparms:[{av:'edtavOpenom2_Visible',ctrl:'vOPENOM2',prop:'Visible'},{av:'cmbavDynamicfiltersoperator2'}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS3'","{handler:'e18HH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS3'",",oparms:[{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'edtavOpenom2_Visible',ctrl:'vOPENOM2',prop:'Visible'},{av:'edtavOpenom3_Visible',ctrl:'vOPENOM3',prop:'Visible'},{av:'edtavOpenom1_Visible',ctrl:'vOPENOM1',prop:'Visible'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccion.getVisible()',ctrl:'vSELECCION',prop:'Visible'},{av:'edtOpeCod_Visible',ctrl:'OPECOD',prop:'Visible'},{av:'edtOpeNom_Visible',ctrl:'OPENOM',prop:'Visible'},{av:'edtOpeNom2_Visible',ctrl:'OPENOM2',prop:'Visible'},{av:'edtOpeAct_Visible',ctrl:'OPEACT',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR3.CLICK","{handler:'e26HH2',iparms:[{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR3.CLICK",",oparms:[{av:'edtavOpenom3_Visible',ctrl:'vOPENOM3',prop:'Visible'},{av:'cmbavDynamicfiltersoperator3'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11HH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'edtavOpenom1_Visible',ctrl:'vOPENOM1',prop:'Visible'},{av:'edtavOpenom2_Visible',ctrl:'vOPENOM2',prop:'Visible'},{av:'edtavOpenom3_Visible',ctrl:'vOPENOM3',prop:'Visible'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccion.getVisible()',ctrl:'vSELECCION',prop:'Visible'},{av:'edtOpeCod_Visible',ctrl:'OPECOD',prop:'Visible'},{av:'edtOpeNom_Visible',ctrl:'OPENOM',prop:'Visible'},{av:'edtOpeNom2_Visible',ctrl:'OPENOM2',prop:'Visible'},{av:'edtOpeAct_Visible',ctrl:'OPEACT',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e30HH2',iparms:[{av:'cmbavGridactions'},{av:'AV60GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV60GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e19HH2',iparms:[{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'edtavOpenom1_Visible',ctrl:'vOPENOM1',prop:'Visible'},{av:'edtavOpenom2_Visible',ctrl:'vOPENOM2',prop:'Visible'},{av:'edtavOpenom3_Visible',ctrl:'vOPENOM3',prop:'Visible'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e20HH2',iparms:[{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'edtavOpenom1_Visible',ctrl:'vOPENOM1',prop:'Visible'},{av:'edtavOpenom2_Visible',ctrl:'vOPENOM2',prop:'Visible'},{av:'edtavOpenom3_Visible',ctrl:'vOPENOM3',prop:'Visible'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e21HH2',iparms:[{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV57FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18OpeNom1',fld:'vOPENOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV20DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV21DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV22OpeNom2',fld:'vOPENOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV24DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV25DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV26OpeNom3',fld:'vOPENOM3',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV23DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV40TFOpeCod',fld:'vTFOPECOD',pic:'ZZZZZ9'},{av:'AV41TFOpeCod_To',fld:'vTFOPECOD_TO',pic:'ZZZZZ9'},{av:'AV43TFOpeNom',fld:'vTFOPENOM',pic:''},{av:'AV44TFOpeNom_Sel',fld:'vTFOPENOM_SEL',pic:''},{av:'AV46TFOpeNom2',fld:'vTFOPENOM2',pic:''},{av:'AV47TFOpeNom2_Sel',fld:'vTFOPENOM2_SEL',pic:''},{av:'AV49TFOpeAct',fld:'vTFOPEACT',pic:'@!'},{av:'AV50TFOpeAct_Sel',fld:'vTFOPEACT_SEL',pic:'@!'},{av:'AV87Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV28DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV27DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'edtavOpenom1_Visible',ctrl:'vOPENOM1',prop:'Visible'},{av:'edtavOpenom2_Visible',ctrl:'vOPENOM2',prop:'Visible'},{av:'edtavOpenom3_Visible',ctrl:'vOPENOM3',prop:'Visible'}]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[]");
      setEventMetadata("VALID_OPECOD",",oparms:[]}");
      setEventMetadata("VALID_OPENOM","{handler:'valid_Openom',iparms:[]");
      setEventMetadata("VALID_OPENOM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Opecnom',iparms:[]");
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
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV57FilterFullText = "" ;
      AV16DynamicFiltersSelector1 = "" ;
      AV18OpeNom1 = "" ;
      AV20DynamicFiltersSelector2 = "" ;
      AV22OpeNom2 = "" ;
      AV24DynamicFiltersSelector3 = "" ;
      AV26OpeNom3 = "" ;
      AV33ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV43TFOpeNom = "" ;
      AV44TFOpeNom_Sel = "" ;
      AV46TFOpeNom2 = "" ;
      AV47TFOpeNom2_Sel = "" ;
      AV49TFOpeAct = "" ;
      AV50TFOpeAct_Sel = "" ;
      AV87Pgmname = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV36ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV52DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      lblJsdynamicfilters_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV56Seleccion = "" ;
      A653OpeNom = "" ;
      A6869OpeNom2 = "" ;
      A8482OpeAct = "" ;
      A13748OpeCNom = "" ;
      scmdbuf = "" ;
      lV67Weboperariosds_1_filterfulltext = "" ;
      lV70Weboperariosds_4_openom1 = "" ;
      lV74Weboperariosds_8_openom2 = "" ;
      lV78Weboperariosds_12_openom3 = "" ;
      lV81Weboperariosds_15_tfopenom = "" ;
      lV83Weboperariosds_17_tfopenom2 = "" ;
      lV85Weboperariosds_19_tfopeact = "" ;
      AV67Weboperariosds_1_filterfulltext = "" ;
      AV68Weboperariosds_2_dynamicfiltersselector1 = "" ;
      AV70Weboperariosds_4_openom1 = "" ;
      AV72Weboperariosds_6_dynamicfiltersselector2 = "" ;
      AV74Weboperariosds_8_openom2 = "" ;
      AV76Weboperariosds_10_dynamicfiltersselector3 = "" ;
      AV78Weboperariosds_12_openom3 = "" ;
      AV82Weboperariosds_16_tfopenom_sel = "" ;
      AV81Weboperariosds_15_tfopenom = "" ;
      AV84Weboperariosds_18_tfopenom2_sel = "" ;
      AV83Weboperariosds_17_tfopenom2 = "" ;
      AV86Weboperariosds_20_tfopeact_sel = "" ;
      AV85Weboperariosds_19_tfopeact = "" ;
      H00HH2_A396EmprCod = new String[] {""} ;
      H00HH2_A8482OpeAct = new String[] {""} ;
      H00HH2_n8482OpeAct = new boolean[] {false} ;
      H00HH2_A6869OpeNom2 = new String[] {""} ;
      H00HH2_n6869OpeNom2 = new boolean[] {false} ;
      H00HH2_A653OpeNom = new String[] {""} ;
      H00HH2_n653OpeNom = new boolean[] {false} ;
      H00HH2_A652OpeCod = new int[1] ;
      H00HH3_AGRID_nRecordCount = new long[1] ;
      AV63Station = "" ;
      AV64Emprcod = "" ;
      AV65Emprnom = "" ;
      AV66Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      imgAdddynamicfilters1_Jsonclick = "" ;
      imgRemovedynamicfilters1_Jsonclick = "" ;
      imgAdddynamicfilters2_Jsonclick = "" ;
      imgRemovedynamicfilters2_Jsonclick = "" ;
      imgRemovedynamicfilters3_Jsonclick = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV31ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV37ManageFiltersXml = "" ;
      AV29ExcelFilename = "" ;
      AV30ErrorMessage = "" ;
      AV32UserCustomValue = "" ;
      AV34ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV12GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      lblDynamicfiltersprefix1_Jsonclick = "" ;
      lblDynamicfiltersmiddle1_Jsonclick = "" ;
      lblDynamicfiltersprefix2_Jsonclick = "" ;
      lblDynamicfiltersmiddle2_Jsonclick = "" ;
      lblDynamicfiltersprefix3_Jsonclick = "" ;
      lblDynamicfiltersmiddle3_Jsonclick = "" ;
      imgRemovedynamicfilters3_gximage = "" ;
      sImgUrl = "" ;
      imgAdddynamicfilters2_gximage = "" ;
      imgRemovedynamicfilters2_gximage = "" ;
      imgAdddynamicfilters1_gximage = "" ;
      imgRemovedynamicfilters1_gximage = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.weboperarios__default(),
         new Object[] {
             new Object[] {
            H00HH2_A396EmprCod, H00HH2_A8482OpeAct, H00HH2_n8482OpeAct, H00HH2_A6869OpeNom2, H00HH2_n6869OpeNom2, H00HH2_A653OpeNom, H00HH2_n653OpeNom, H00HH2_A652OpeCod
            }
            , new Object[] {
            H00HH3_AGRID_nRecordCount
            }
         }
      );
      AV87Pgmname = "WebOperarios" ;
      /* GeneXus formulas. */
      AV87Pgmname = "WebOperarios" ;
      Gx_err = (short)(0) ;
      chkavSeleccion.setEnabled( 0 );
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV38ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV17DynamicFiltersOperator1 ;
   private short AV21DynamicFiltersOperator2 ;
   private short AV25DynamicFiltersOperator3 ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV60GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV69Weboperariosds_3_dynamicfiltersoperator1 ;
   private short AV73Weboperariosds_7_dynamicfiltersoperator2 ;
   private short AV77Weboperariosds_11_dynamicfiltersoperator3 ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_110 ;
   private int nGXsfl_110_idx=1 ;
   private int AV40TFOpeCod ;
   private int AV41TFOpeCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A652OpeCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV79Weboperariosds_13_tfopecod ;
   private int AV80Weboperariosds_14_tfopecod_to ;
   private int edtOpeCod_Visible ;
   private int edtOpeNom_Visible ;
   private int edtOpeNom2_Visible ;
   private int edtOpeAct_Visible ;
   private int AV53PageToGo ;
   private int imgAdddynamicfilters1_Visible ;
   private int imgRemovedynamicfilters1_Visible ;
   private int imgAdddynamicfilters2_Visible ;
   private int imgRemovedynamicfilters2_Visible ;
   private int edtavOpenom1_Visible ;
   private int edtavOpenom2_Visible ;
   private int edtavOpenom3_Visible ;
   private int AV88GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int edtavOpenom3_Enabled ;
   private int edtavOpenom2_Enabled ;
   private int edtavOpenom1_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV54GridCurrentPage ;
   private long AV55GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_110_idx="0001" ;
   private String AV18OpeNom1 ;
   private String AV22OpeNom2 ;
   private String AV26OpeNom3 ;
   private String AV43TFOpeNom ;
   private String AV44TFOpeNom_Sel ;
   private String AV46TFOpeNom2 ;
   private String AV47TFOpeNom2_Sel ;
   private String AV49TFOpeAct ;
   private String AV50TFOpeAct_Sel ;
   private String AV87Pgmname ;
   private String A396EmprCod ;
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
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
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
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String lblJsdynamicfilters_Internalname ;
   private String lblJsdynamicfilters_Caption ;
   private String lblJsdynamicfilters_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV56Seleccion ;
   private String edtOpeCod_Internalname ;
   private String A653OpeNom ;
   private String edtOpeNom_Internalname ;
   private String A6869OpeNom2 ;
   private String edtOpeNom2_Internalname ;
   private String A8482OpeAct ;
   private String edtOpeAct_Internalname ;
   private String edtOpeCNom_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV70Weboperariosds_4_openom1 ;
   private String lV74Weboperariosds_8_openom2 ;
   private String lV78Weboperariosds_12_openom3 ;
   private String lV81Weboperariosds_15_tfopenom ;
   private String lV83Weboperariosds_17_tfopenom2 ;
   private String lV85Weboperariosds_19_tfopeact ;
   private String AV70Weboperariosds_4_openom1 ;
   private String AV74Weboperariosds_8_openom2 ;
   private String AV78Weboperariosds_12_openom3 ;
   private String AV82Weboperariosds_16_tfopenom_sel ;
   private String AV81Weboperariosds_15_tfopenom ;
   private String AV84Weboperariosds_18_tfopenom2_sel ;
   private String AV83Weboperariosds_17_tfopenom2 ;
   private String AV86Weboperariosds_20_tfopeact_sel ;
   private String AV85Weboperariosds_19_tfopeact ;
   private String edtavOpenom1_Internalname ;
   private String edtavOpenom2_Internalname ;
   private String edtavOpenom3_Internalname ;
   private String AV63Station ;
   private String AV64Emprcod ;
   private String AV65Emprnom ;
   private String AV66Usurcod ;
   private String imgAdddynamicfilters1_Jsonclick ;
   private String divTabledynamicfilters_Internalname ;
   private String imgAdddynamicfilters1_Internalname ;
   private String imgRemovedynamicfilters1_Jsonclick ;
   private String imgRemovedynamicfilters1_Internalname ;
   private String imgAdddynamicfilters2_Jsonclick ;
   private String imgAdddynamicfilters2_Internalname ;
   private String imgRemovedynamicfilters2_Jsonclick ;
   private String imgRemovedynamicfilters2_Internalname ;
   private String imgRemovedynamicfilters3_Jsonclick ;
   private String imgRemovedynamicfilters3_Internalname ;
   private String edtOpeNom_Link ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String divTabledynamicfiltersrow1_Internalname ;
   private String lblDynamicfiltersprefix1_Internalname ;
   private String lblDynamicfiltersprefix1_Jsonclick ;
   private String lblDynamicfiltersmiddle1_Internalname ;
   private String lblDynamicfiltersmiddle1_Jsonclick ;
   private String divTabledynamicfiltersrow2_Internalname ;
   private String lblDynamicfiltersprefix2_Internalname ;
   private String lblDynamicfiltersprefix2_Jsonclick ;
   private String lblDynamicfiltersmiddle2_Internalname ;
   private String lblDynamicfiltersmiddle2_Jsonclick ;
   private String divTabledynamicfiltersrow3_Internalname ;
   private String lblDynamicfiltersprefix3_Internalname ;
   private String lblDynamicfiltersprefix3_Jsonclick ;
   private String lblDynamicfiltersmiddle3_Internalname ;
   private String lblDynamicfiltersmiddle3_Jsonclick ;
   private String tblTablemergeddynamicfilters3_Internalname ;
   private String cellFilter_openom3_cell_Internalname ;
   private String edtavOpenom3_Jsonclick ;
   private String cellDynamicfilters_removefilter3_cell_Internalname ;
   private String imgRemovedynamicfilters3_gximage ;
   private String sImgUrl ;
   private String tblTablemergeddynamicfilters2_Internalname ;
   private String cellFilter_openom2_cell_Internalname ;
   private String edtavOpenom2_Jsonclick ;
   private String cellDynamicfilters_addfilter2_cell_Internalname ;
   private String imgAdddynamicfilters2_gximage ;
   private String cellDynamicfilters_removefilter2_cell_Internalname ;
   private String imgRemovedynamicfilters2_gximage ;
   private String tblTablemergeddynamicfilters1_Internalname ;
   private String cellFilter_openom1_cell_Internalname ;
   private String edtavOpenom1_Jsonclick ;
   private String cellDynamicfilters_addfilter1_cell_Internalname ;
   private String imgAdddynamicfilters1_gximage ;
   private String cellDynamicfilters_removefilter1_cell_Internalname ;
   private String imgRemovedynamicfilters1_gximage ;
   private String sGXsfl_110_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtOpeCod_Jsonclick ;
   private String edtOpeNom_Jsonclick ;
   private String edtOpeNom2_Jsonclick ;
   private String edtOpeAct_Jsonclick ;
   private String edtOpeCNom_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV19DynamicFiltersEnabled2 ;
   private boolean AV23DynamicFiltersEnabled3 ;
   private boolean AV14OrderedDsc ;
   private boolean AV28DynamicFiltersIgnoreFirst ;
   private boolean AV27DynamicFiltersRemoving ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n653OpeNom ;
   private boolean n6869OpeNom2 ;
   private boolean n8482OpeAct ;
   private boolean bGXsfl_110_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean AV71Weboperariosds_5_dynamicfiltersenabled2 ;
   private boolean AV75Weboperariosds_9_dynamicfiltersenabled3 ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV31ColumnsSelectorXML ;
   private String AV37ManageFiltersXml ;
   private String AV32UserCustomValue ;
   private String AV57FilterFullText ;
   private String AV16DynamicFiltersSelector1 ;
   private String AV20DynamicFiltersSelector2 ;
   private String AV24DynamicFiltersSelector3 ;
   private String A13748OpeCNom ;
   private String lV67Weboperariosds_1_filterfulltext ;
   private String AV67Weboperariosds_1_filterfulltext ;
   private String AV68Weboperariosds_2_dynamicfiltersselector1 ;
   private String AV72Weboperariosds_6_dynamicfiltersselector2 ;
   private String AV76Weboperariosds_10_dynamicfiltersselector3 ;
   private String AV29ExcelFilename ;
   private String AV30ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavDynamicfiltersselector1 ;
   private HTMLChoice cmbavDynamicfiltersoperator1 ;
   private HTMLChoice cmbavDynamicfiltersselector2 ;
   private HTMLChoice cmbavDynamicfiltersoperator2 ;
   private HTMLChoice cmbavDynamicfiltersselector3 ;
   private HTMLChoice cmbavDynamicfiltersoperator3 ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkavSeleccion ;
   private IDataStoreProvider pr_default ;
   private String[] H00HH2_A396EmprCod ;
   private String[] H00HH2_A8482OpeAct ;
   private boolean[] H00HH2_n8482OpeAct ;
   private String[] H00HH2_A6869OpeNom2 ;
   private boolean[] H00HH2_n6869OpeNom2 ;
   private String[] H00HH2_A653OpeNom ;
   private boolean[] H00HH2_n653OpeNom ;
   private int[] H00HH2_A652OpeCod ;
   private long[] H00HH3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV36ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV12GridStateDynamicFilter ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class weboperarios__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00HH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Weboperariosds_1_filterfulltext ,
                                          String AV68Weboperariosds_2_dynamicfiltersselector1 ,
                                          short AV69Weboperariosds_3_dynamicfiltersoperator1 ,
                                          String AV70Weboperariosds_4_openom1 ,
                                          boolean AV71Weboperariosds_5_dynamicfiltersenabled2 ,
                                          String AV72Weboperariosds_6_dynamicfiltersselector2 ,
                                          short AV73Weboperariosds_7_dynamicfiltersoperator2 ,
                                          String AV74Weboperariosds_8_openom2 ,
                                          boolean AV75Weboperariosds_9_dynamicfiltersenabled3 ,
                                          String AV76Weboperariosds_10_dynamicfiltersselector3 ,
                                          short AV77Weboperariosds_11_dynamicfiltersoperator3 ,
                                          String AV78Weboperariosds_12_openom3 ,
                                          int AV79Weboperariosds_13_tfopecod ,
                                          int AV80Weboperariosds_14_tfopecod_to ,
                                          String AV82Weboperariosds_16_tfopenom_sel ,
                                          String AV81Weboperariosds_15_tfopenom ,
                                          String AV84Weboperariosds_18_tfopenom2_sel ,
                                          String AV83Weboperariosds_17_tfopenom2 ,
                                          String AV86Weboperariosds_20_tfopeact_sel ,
                                          String AV85Weboperariosds_19_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[23];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, OpeAct, OpeNom2, OpeNom, OpeCod" ;
      sFromString = " FROM TXPOPERAR" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV67Weboperariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int15[0] = (byte)(1) ;
         GXv_int15[1] = (byte)(1) ;
         GXv_int15[2] = (byte)(1) ;
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV68Weboperariosds_2_dynamicfiltersselector1, "OPENOM") == 0 ) && ( AV69Weboperariosds_3_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV70Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV68Weboperariosds_2_dynamicfiltersselector1, "OPENOM") == 0 ) && ( AV69Weboperariosds_3_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV70Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( AV71Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV72Weboperariosds_6_dynamicfiltersselector2, "OPENOM") == 0 ) && ( AV73Weboperariosds_7_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV74Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( AV71Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV72Weboperariosds_6_dynamicfiltersselector2, "OPENOM") == 0 ) && ( AV73Weboperariosds_7_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV74Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( AV75Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV76Weboperariosds_10_dynamicfiltersselector3, "OPENOM") == 0 ) && ( AV77Weboperariosds_11_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV78Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( AV75Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV76Weboperariosds_10_dynamicfiltersselector3, "OPENOM") == 0 ) && ( AV77Weboperariosds_11_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV78Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (0==AV79Weboperariosds_13_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (0==AV80Weboperariosds_14_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Weboperariosds_16_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Weboperariosds_15_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Weboperariosds_16_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Weboperariosds_18_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV83Weboperariosds_17_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Weboperariosds_18_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Weboperariosds_20_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV85Weboperariosds_19_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Weboperariosds_20_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY OpeNom" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY OpeNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY OpeCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY OpeCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY OpeNom2" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY OpeNom2 DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY OpeAct" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY OpeAct DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, OpeCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H00HH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Weboperariosds_1_filterfulltext ,
                                          String AV68Weboperariosds_2_dynamicfiltersselector1 ,
                                          short AV69Weboperariosds_3_dynamicfiltersoperator1 ,
                                          String AV70Weboperariosds_4_openom1 ,
                                          boolean AV71Weboperariosds_5_dynamicfiltersenabled2 ,
                                          String AV72Weboperariosds_6_dynamicfiltersselector2 ,
                                          short AV73Weboperariosds_7_dynamicfiltersoperator2 ,
                                          String AV74Weboperariosds_8_openom2 ,
                                          boolean AV75Weboperariosds_9_dynamicfiltersenabled3 ,
                                          String AV76Weboperariosds_10_dynamicfiltersselector3 ,
                                          short AV77Weboperariosds_11_dynamicfiltersoperator3 ,
                                          String AV78Weboperariosds_12_openom3 ,
                                          int AV79Weboperariosds_13_tfopecod ,
                                          int AV80Weboperariosds_14_tfopecod_to ,
                                          String AV82Weboperariosds_16_tfopenom_sel ,
                                          String AV81Weboperariosds_15_tfopenom ,
                                          String AV84Weboperariosds_18_tfopenom2_sel ,
                                          String AV83Weboperariosds_17_tfopenom2 ,
                                          String AV86Weboperariosds_20_tfopeact_sel ,
                                          String AV85Weboperariosds_19_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[18];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV67Weboperariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
         GXv_int17[1] = (byte)(1) ;
         GXv_int17[2] = (byte)(1) ;
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV68Weboperariosds_2_dynamicfiltersselector1, "OPENOM") == 0 ) && ( AV69Weboperariosds_3_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV70Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV68Weboperariosds_2_dynamicfiltersselector1, "OPENOM") == 0 ) && ( AV69Weboperariosds_3_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV70Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( AV71Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV72Weboperariosds_6_dynamicfiltersselector2, "OPENOM") == 0 ) && ( AV73Weboperariosds_7_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV74Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( AV71Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV72Weboperariosds_6_dynamicfiltersselector2, "OPENOM") == 0 ) && ( AV73Weboperariosds_7_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV74Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( AV75Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV76Weboperariosds_10_dynamicfiltersselector3, "OPENOM") == 0 ) && ( AV77Weboperariosds_11_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV78Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( AV75Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV76Weboperariosds_10_dynamicfiltersselector3, "OPENOM") == 0 ) && ( AV77Weboperariosds_11_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV78Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (0==AV79Weboperariosds_13_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV80Weboperariosds_14_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Weboperariosds_16_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Weboperariosds_15_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Weboperariosds_16_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Weboperariosds_18_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV83Weboperariosds_17_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Weboperariosds_18_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Weboperariosds_20_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV85Weboperariosds_19_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Weboperariosds_20_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_H00HH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() );
            case 1 :
                  return conditional_H00HH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00HH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00HH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
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
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

