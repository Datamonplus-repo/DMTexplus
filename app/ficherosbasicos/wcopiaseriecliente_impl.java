package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcopiaseriecliente_impl extends GXDataArea
{
   public wcopiaseriecliente_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcopiaseriecliente_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcopiaseriecliente_impl.class ));
   }

   public wcopiaseriecliente_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSelected = UIFactory.getCheckbox(this);
      chkavSelectall = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_46 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_46"))) ;
      nGXsfl_46_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_46_idx"))) ;
      sGXsfl_46_idx = httpContext.GetPar( "sGXsfl_46_idx") ;
      chkavSelected.setTitleFormat( (short)(GXutil.lval( httpContext.GetNextPar( ))) );
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
      AV6CliCod_org = (int)(GXutil.lval( httpContext.GetPar( "CliCod_org"))) ;
      AV7EmprCod = httpContext.GetPar( "EmprCod") ;
      AV60EmprCodJson = httpContext.GetPar( "EmprCodJson") ;
      AV64CliCodJson = httpContext.GetPar( "CliCodJson") ;
      AV68ArtCodJson = httpContext.GetPar( "ArtCodJson") ;
      AV38TFArtCod = httpContext.GetPar( "TFArtCod") ;
      AV39TFArtCod_Sel = httpContext.GetPar( "TFArtCod_Sel") ;
      AV40TFArtDsc = httpContext.GetPar( "TFArtDsc") ;
      AV41TFArtDsc_Sel = httpContext.GetPar( "TFArtDsc_Sel") ;
      AV78Pgmname = httpContext.GetPar( "Pgmname") ;
      AV34OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV35OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      chkavSelected.setTitleFormat( (short)(GXutil.lval( httpContext.GetNextPar( ))) );
      AV58i = GXutil.lval( httpContext.GetPar( "i")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV59EmprCodCol);
      AV62EmprCodToFind = httpContext.GetPar( "EmprCodToFind") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV63CliCodCol);
      AV66CliCodToFind = (int)(GXutil.lval( httpContext.GetPar( "CliCodToFind"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV67ArtCodCol);
      AV70ArtCodToFind = httpContext.GetPar( "ArtCodToFind") ;
      AV71SelectAll = GXutil.strtobool( httpContext.GetPar( "SelectAll")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV6CliCod_org, AV7EmprCod, AV60EmprCodJson, AV64CliCodJson, AV68ArtCodJson, AV38TFArtCod, AV39TFArtCod_Sel, AV40TFArtDsc, AV41TFArtDsc_Sel, AV78Pgmname, AV34OrderedBy, AV35OrderedDsc, AV58i, AV59EmprCodCol, AV62EmprCodToFind, AV63CliCodCol, AV66CliCodToFind, AV67ArtCodCol, AV70ArtCodToFind, AV71SelectAll) ;
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
      pa20P2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start20P2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.wcopiaseriecliente", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"wCopiaSerieCliente");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\wcopiaseriecliente:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICOD_ORG", GXutil.ltrim( localUtil.ntoc( AV6CliCod_org, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_46", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_46, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_ORG_DATA", AV74CliCod_org_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_ORG_DATA", AV74CliCod_org_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODDES_DATA", AV73CliCodDes_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODDES_DATA", AV73CliCodDes_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV51GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV52GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCODJSON", AV60EmprCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODJSON", AV64CliCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCODJSON", AV68ArtCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOD", GXutil.rtrim( AV38TFArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOD_SEL", GXutil.rtrim( AV39TFArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTDSC", GXutil.rtrim( AV40TFArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTDSC_SEL", GXutil.rtrim( AV41TFArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV34OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV35OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV58i, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vEMPRCODCOL", AV59EmprCodCol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vEMPRCODCOL", AV59EmprCodCol);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCODTOFIND", GXutil.rtrim( AV62EmprCodToFind));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODCOL", AV63CliCodCol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODCOL", AV63CliCodCol);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODTOFIND", GXutil.ltrim( localUtil.ntoc( AV66CliCodToFind, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vARTCODCOL", AV67ArtCodCol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vARTCODCOL", AV67ArtCodCol);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCODTOFIND", GXutil.rtrim( AV70ArtCodToFind));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSELECTEDROWS", AV56SelectedRows);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSELECTEDROWS", AV56SelectedRows);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_ORG_Cls", GXutil.rtrim( Combo_clicod_org_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_ORG_Selectedvalue_set", GXutil.rtrim( Combo_clicod_org_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_ORG_Emptyitem", GXutil.booltostr( Combo_clicod_org_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Cls", GXutil.rtrim( Combo_clicoddes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Selectedvalue_set", GXutil.rtrim( Combo_clicoddes_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Emptyitem", GXutil.booltostr( Combo_clicoddes_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Title", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Result", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Selectedvalue_get", GXutil.rtrim( Combo_clicoddes_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_ORG_Selectedvalue_get", GXutil.rtrim( Combo_clicod_org_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "vSELECTED_Titleformat", GXutil.ltrim( localUtil.ntoc( chkavSelected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Result", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_ORG_Selectedvalue_get", GXutil.rtrim( Combo_clicod_org_Selectedvalue_get));
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
         we20P2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt20P2( ) ;
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
      return formatLink("app.ficherosbasicos.wcopiaseriecliente", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.wCopiaSerieCliente" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Ficha Tecnica (Articulo)", "") ;
   }

   public void wb20P0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", divLayoutmaintable_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablerightheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefilters_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_org_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_org_Internalname, httpContext.getMessage( "Cliente Origen", ""), "", "", lblTextblockcombo_clicod_org_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\wCopiaSerieCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod_org.setProperty("Caption", Combo_clicod_org_Caption);
         ucCombo_clicod_org.setProperty("Cls", Combo_clicod_org_Cls);
         ucCombo_clicod_org.setProperty("EmptyItem", Combo_clicod_org_Emptyitem);
         ucCombo_clicod_org.setProperty("DropDownOptionsData", AV74CliCod_org_Data);
         ucCombo_clicod_org.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_org_Internalname, "COMBO_CLICOD_ORGContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicoddes_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicoddes_Internalname, httpContext.getMessage( "Cliente Destino", ""), "", "", lblTextblockcombo_clicoddes_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\wCopiaSerieCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicoddes.setProperty("Caption", Combo_clicoddes_Caption);
         ucCombo_clicoddes.setProperty("Cls", Combo_clicoddes_Cls);
         ucCombo_clicoddes.setProperty("EmptyItem", Combo_clicoddes_Emptyitem);
         ucCombo_clicoddes.setProperty("DropDownOptionsData", AV73CliCodDes_Data);
         ucCombo_clicoddes.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicoddes_Internalname, "COMBO_CLICODDESContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTableaction_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial WWPBtnNeedMultiRowSelection" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnuseraction1_Jsonclick, 7, httpContext.getMessage( "Clique aqui para confirmar.", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1120p1_client"+"'", TempTags, "", 2, "HLP_FicherosBasicos\\wCopiaSerieCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol46( ) ;
      }
      if ( wbEnd == 46 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_46 = (int)(nGXsfl_46_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV51GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV52GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV78Pgmname), GXutil.rtrim( localUtil.format( AV78Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\wCopiaSerieCliente.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_org_Internalname, GXutil.ltrim( localUtil.ntoc( AV6CliCod_org, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6CliCod_org), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_org_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_org_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\wCopiaSerieCliente.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicoddes_Internalname, GXutil.ltrim( localUtil.ntoc( AV72CliCodDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV72CliCodDes), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicoddes_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicoddes_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\wCopiaSerieCliente.htm");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavSelectall.getInternalname(), GXutil.booltostr( AV71SelectAll), "", "", chkavSelectall.getVisible(), 1, "true", "", StyleString, ClassString, "", "", TempTags+" onblur=\""+""+";gx.evt.onblur(this,71);\"");
         wb_table1_72_20P2( true) ;
      }
      else
      {
         wb_table1_72_20P2( false) ;
      }
      return  ;
   }

   public void wb_table1_72_20P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 46 )
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

   public void start20P2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Ficha Tecnica (Articulo)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup20P0( ) ;
   }

   public void ws20P2( )
   {
      start20P2( ) ;
      evt20P2( ) ;
   }

   public void evt20P2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICOD_ORG.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1220P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1320P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1420P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1520P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNUSERACTION1.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1620P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSELECTALL.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1720P2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VSELECTED.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VSELECTED.CLICK") == 0 ) )
                        {
                           nGXsfl_46_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_462( ) ;
                           AV55Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV55Selected);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
                           A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
                           n69ArtDsc = false ;
                           A5335ArtCodExt = httpContext.cgiGet( edtArtCodExt_Internalname) ;
                           n5335ArtCodExt = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1820P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1920P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2020P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VSELECTED.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2120P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Clicod_org Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD_ORG"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV6CliCod_org )
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

   public void we20P2( )
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

   public void pa20P2( )
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
            GX_FocusControl = edtavClicod_org_Internalname ;
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
      subsflControlProps_462( ) ;
      while ( nGXsfl_46_idx <= nRC_GXsfl_46 )
      {
         sendrow_462( ) ;
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV6CliCod_org ,
                                 String AV7EmprCod ,
                                 String AV60EmprCodJson ,
                                 String AV64CliCodJson ,
                                 String AV68ArtCodJson ,
                                 String AV38TFArtCod ,
                                 String AV39TFArtCod_Sel ,
                                 String AV40TFArtDsc ,
                                 String AV41TFArtDsc_Sel ,
                                 String AV78Pgmname ,
                                 short AV34OrderedBy ,
                                 boolean AV35OrderedDsc ,
                                 long AV58i ,
                                 GXSimpleCollection<String> AV59EmprCodCol ,
                                 String AV62EmprCodToFind ,
                                 GXSimpleCollection<Integer> AV63CliCodCol ,
                                 int AV66CliCodToFind ,
                                 GXSimpleCollection<String> AV67ArtCodCol ,
                                 String AV70ArtCodToFind ,
                                 boolean AV71SelectAll )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1920P2 ();
      GRID_nCurrentRecord = 0 ;
      rf20P2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"wCopiaSerieCliente");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\wcopiaseriecliente:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      AV71SelectAll = GXutil.strtobool( GXutil.booltostr( AV71SelectAll)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71SelectAll", AV71SelectAll);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf20P2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV78Pgmname = "FicherosBasicos.wCopiaSerieCliente" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78Pgmname", AV78Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf20P2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(46) ;
      /* Execute user event: Refresh */
      e1920P2 ();
      nGXsfl_46_idx = 1 ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_462( ) ;
      bGXsfl_46_Refreshing = true ;
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
         subsflControlProps_462( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ,
                                              AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ,
                                              AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ,
                                              AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ,
                                              Integer.valueOf(AV6CliCod_org) ,
                                              A65ArtCod ,
                                              A69ArtDsc ,
                                              Integer.valueOf(A252CliCod) ,
                                              Short.valueOf(AV34OrderedBy) ,
                                              Boolean.valueOf(AV35OrderedDsc) ,
                                              AV7EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = GXutil.padr( GXutil.rtrim( AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod), 16, "%") ;
         lV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc), 26, "%") ;
         /* Using cursor H020P2 */
         pr_default.execute(0, new Object[] {AV7EmprCod, lV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod, AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel, lV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc, AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel, Integer.valueOf(AV6CliCod_org), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_46_idx = 1 ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5335ArtCodExt = H020P2_A5335ArtCodExt[0] ;
            n5335ArtCodExt = H020P2_n5335ArtCodExt[0] ;
            A69ArtDsc = H020P2_A69ArtDsc[0] ;
            n69ArtDsc = H020P2_n69ArtDsc[0] ;
            A65ArtCod = H020P2_A65ArtCod[0] ;
            A279CliNom = H020P2_A279CliNom[0] ;
            A252CliCod = H020P2_A252CliCod[0] ;
            A407EmprNom = H020P2_A407EmprNom[0] ;
            n407EmprNom = H020P2_n407EmprNom[0] ;
            A396EmprCod = H020P2_A396EmprCod[0] ;
            A407EmprNom = H020P2_A407EmprNom[0] ;
            n407EmprNom = H020P2_n407EmprNom[0] ;
            A279CliNom = H020P2_A279CliNom[0] ;
            e2020P2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(46) ;
         wb20P0( ) ;
      }
      bGXsfl_46_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes20P2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
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
      AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = AV38TFArtCod ;
      AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = AV39TFArtCod_Sel ;
      AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = AV40TFArtDsc ;
      AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = AV41TFArtDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ,
                                           AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ,
                                           AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ,
                                           AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ,
                                           Integer.valueOf(AV6CliCod_org) ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV35OrderedDsc) ,
                                           AV7EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = GXutil.padr( GXutil.rtrim( AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod), 16, "%") ;
      lV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc), 26, "%") ;
      /* Using cursor H020P3 */
      pr_default.execute(1, new Object[] {AV7EmprCod, lV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod, AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel, lV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc, AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel, Integer.valueOf(AV6CliCod_org)});
      GRID_nRecordCount = H020P3_AGRID_nRecordCount[0] ;
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
      AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = AV38TFArtCod ;
      AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = AV39TFArtCod_Sel ;
      AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = AV40TFArtDsc ;
      AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = AV41TFArtDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6CliCod_org, AV7EmprCod, AV60EmprCodJson, AV64CliCodJson, AV68ArtCodJson, AV38TFArtCod, AV39TFArtCod_Sel, AV40TFArtDsc, AV41TFArtDsc_Sel, AV78Pgmname, AV34OrderedBy, AV35OrderedDsc, AV58i, AV59EmprCodCol, AV62EmprCodToFind, AV63CliCodCol, AV66CliCodToFind, AV67ArtCodCol, AV70ArtCodToFind, AV71SelectAll) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = AV38TFArtCod ;
      AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = AV39TFArtCod_Sel ;
      AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = AV40TFArtDsc ;
      AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = AV41TFArtDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6CliCod_org, AV7EmprCod, AV60EmprCodJson, AV64CliCodJson, AV68ArtCodJson, AV38TFArtCod, AV39TFArtCod_Sel, AV40TFArtDsc, AV41TFArtDsc_Sel, AV78Pgmname, AV34OrderedBy, AV35OrderedDsc, AV58i, AV59EmprCodCol, AV62EmprCodToFind, AV63CliCodCol, AV66CliCodToFind, AV67ArtCodCol, AV70ArtCodToFind, AV71SelectAll) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = AV38TFArtCod ;
      AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = AV39TFArtCod_Sel ;
      AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = AV40TFArtDsc ;
      AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = AV41TFArtDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6CliCod_org, AV7EmprCod, AV60EmprCodJson, AV64CliCodJson, AV68ArtCodJson, AV38TFArtCod, AV39TFArtCod_Sel, AV40TFArtDsc, AV41TFArtDsc_Sel, AV78Pgmname, AV34OrderedBy, AV35OrderedDsc, AV58i, AV59EmprCodCol, AV62EmprCodToFind, AV63CliCodCol, AV66CliCodToFind, AV67ArtCodCol, AV70ArtCodToFind, AV71SelectAll) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = AV38TFArtCod ;
      AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = AV39TFArtCod_Sel ;
      AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = AV40TFArtDsc ;
      AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = AV41TFArtDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6CliCod_org, AV7EmprCod, AV60EmprCodJson, AV64CliCodJson, AV68ArtCodJson, AV38TFArtCod, AV39TFArtCod_Sel, AV40TFArtDsc, AV41TFArtDsc_Sel, AV78Pgmname, AV34OrderedBy, AV35OrderedDsc, AV58i, AV59EmprCodCol, AV62EmprCodToFind, AV63CliCodCol, AV66CliCodToFind, AV67ArtCodCol, AV70ArtCodToFind, AV71SelectAll) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = AV38TFArtCod ;
      AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = AV39TFArtCod_Sel ;
      AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = AV40TFArtDsc ;
      AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = AV41TFArtDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6CliCod_org, AV7EmprCod, AV60EmprCodJson, AV64CliCodJson, AV68ArtCodJson, AV38TFArtCod, AV39TFArtCod_Sel, AV40TFArtDsc, AV41TFArtDsc_Sel, AV78Pgmname, AV34OrderedBy, AV35OrderedDsc, AV58i, AV59EmprCodCol, AV62EmprCodToFind, AV63CliCodCol, AV66CliCodToFind, AV67ArtCodCol, AV70ArtCodToFind, AV71SelectAll) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV78Pgmname = "FicherosBasicos.wCopiaSerieCliente" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78Pgmname", AV78Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup20P0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1820P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_ORG_DATA"), AV74CliCod_org_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODDES_DATA"), AV73CliCodDes_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_46 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_46"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV51GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV52GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_clicod_org_Cls = httpContext.cgiGet( "COMBO_CLICOD_ORG_Cls") ;
         Combo_clicod_org_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_ORG_Selectedvalue_set") ;
         Combo_clicod_org_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_ORG_Emptyitem")) ;
         Combo_clicoddes_Cls = httpContext.cgiGet( "COMBO_CLICODDES_Cls") ;
         Combo_clicoddes_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODDES_Selectedvalue_set") ;
         Combo_clicoddes_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICODDES_Emptyitem")) ;
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
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_btnuseraction1_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Title") ;
         Dvelop_confirmpanel_btnuseraction1_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmationtext") ;
         Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnuseraction1_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Dvelop_confirmpanel_btnuseraction1_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Result") ;
         Combo_clicod_org_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICOD_ORG_Selectedvalue_get") ;
         /* Read variables values. */
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Pgmname", AV78Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_org_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_org_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD_ORG");
            GX_FocusControl = edtavClicod_org_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6CliCod_org = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod_org", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod_org), 6, 0));
         }
         else
         {
            AV6CliCod_org = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_org_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod_org", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod_org), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicoddes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicoddes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODDES");
            GX_FocusControl = edtavClicoddes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72CliCodDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72CliCodDes), 6, 0));
         }
         else
         {
            AV72CliCodDes = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicoddes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72CliCodDes), 6, 0));
         }
         AV71SelectAll = GXutil.strtobool( httpContext.cgiGet( chkavSelectall.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71SelectAll", AV71SelectAll);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"wCopiaSerieCliente");
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Pgmname", AV78Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ficherosbasicos\\wcopiaseriecliente:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD_ORG"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV6CliCod_org )
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
      e1820P2 ();
      if (returnInSub) return;
   }

   public void e1820P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcopiaseriecliente_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcopiaseriecliente_impl.this.AV7EmprCod = GXv_char2[0] ;
      wcopiaseriecliente_impl.this.AV8EmprNom = GXv_char3[0] ;
      wcopiaseriecliente_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      edtavClicoddes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicoddes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicoddes_Visible), 5, 0), true);
      edtavClicod_org_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_org_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_org_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD_ORG' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICODDES' */
      S122 ();
      if (returnInSub) return;
      chkavSelectall.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelectall.getInternalname(), "Visible", GXutil.ltrimstr( chkavSelectall.getVisible(), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Ficha Tecnica (Articulo)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV34OrderedBy < 1 )
      {
         AV34OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      chkavSelected.setTitleFormat( (short)(1) );
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV16Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wcopiaseriecliente_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16Station = GXt_char1 ;
      GXv_char4[0] = AV75AuxEmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char4, GXv_char3, GXv_char2) ;
      wcopiaseriecliente_impl.this.AV75AuxEmprCod = GXv_char4[0] ;
      wcopiaseriecliente_impl.this.AV8EmprNom = GXv_char3[0] ;
      wcopiaseriecliente_impl.this.AV17UsurCod = GXv_char2[0] ;
   }

   public void e1920P2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV29WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV29WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      chkavSelected.setTitle( GXutil.format( "<input name=\"selectAllCheckbox\" type=\"checkbox\" value=\"Select All\" onchange=\"$(%1).click();\" class=\"AttributeCheckBox\" >", "'#"+chkavSelectall.getInternalname()+"'", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "Title", chkavSelected.getTitle(), !bGXsfl_46_Refreshing);
      AV71SelectAll = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71SelectAll", AV71SelectAll);
      AV51GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridCurrentPage), 10, 0));
      AV52GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridPageCount), 10, 0));
      AV59EmprCodCol.fromJSonString(AV60EmprCodJson, null);
      AV63CliCodCol.fromJSonString(AV64CliCodJson, null);
      AV67ArtCodCol.fromJSonString(AV68ArtCodJson, null);
      AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = AV38TFArtCod ;
      AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = AV39TFArtCod_Sel ;
      AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = AV40TFArtDsc ;
      AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = AV41TFArtDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59EmprCodCol", AV59EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63CliCodCol", AV63CliCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67ArtCodCol", AV67ArtCodCol);
   }

   public void e1320P2( )
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
         AV25PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV25PageToGo) ;
      }
   }

   public void e1420P2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1520P2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV34OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         AV35OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OrderedDsc", AV35OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtCod") == 0 )
         {
            AV38TFArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFArtCod", AV38TFArtCod);
            AV39TFArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFArtCod_Sel", AV39TFArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtDsc") == 0 )
         {
            AV40TFArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFArtDsc", AV40TFArtDsc);
            AV41TFArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFArtDsc_Sel", AV41TFArtDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2020P2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV55Selected = false ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV55Selected);
      AV62EmprCodToFind = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCodToFind", AV62EmprCodToFind);
      AV66CliCodToFind = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66CliCodToFind", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66CliCodToFind), 6, 0));
      AV70ArtCodToFind = A65ArtCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70ArtCodToFind", AV70ArtCodToFind);
      /* Execute user subroutine: 'GETINDEXOFSELECTEDROW' */
      S172 ();
      if (returnInSub) return;
      if ( AV58i > 0 )
      {
         AV55Selected = true ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV55Selected);
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(46) ;
      }
      sendrow_462( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_46_Refreshing )
      {
         httpContext.doAjaxLoad(46, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e2120P2( )
   {
      /* Selected_Click Routine */
      returnInSub = false ;
      if ( AV55Selected )
      {
         AV59EmprCodCol.add(A396EmprCod, 0);
         AV63CliCodCol.add((int)(A252CliCod), 0);
         AV67ArtCodCol.add(A65ArtCod, 0);
      }
      else
      {
         AV62EmprCodToFind = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCodToFind", AV62EmprCodToFind);
         AV66CliCodToFind = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66CliCodToFind", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66CliCodToFind), 6, 0));
         AV70ArtCodToFind = A65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70ArtCodToFind", AV70ArtCodToFind);
         /* Execute user subroutine: 'GETINDEXOFSELECTEDROW' */
         S172 ();
         if (returnInSub) return;
         AV59EmprCodCol.removeItem((int)(AV58i));
         AV63CliCodCol.removeItem((int)(AV58i));
         AV67ArtCodCol.removeItem((int)(AV58i));
      }
      AV60EmprCodJson = AV59EmprCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60EmprCodJson", AV60EmprCodJson);
      AV64CliCodJson = AV63CliCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64CliCodJson", AV64CliCodJson);
      AV68ArtCodJson = AV67ArtCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68ArtCodJson", AV68ArtCodJson);
      divLayoutmaintable_Class = "Table TableWithSelectableGrid"+((AV59EmprCodCol.size()>0) ? " WWPMultiRowSelected" : "") ;
      httpContext.ajax_rsp_assign_prop("", false, divLayoutmaintable_Internalname, "Class", divLayoutmaintable_Class, true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59EmprCodCol", AV59EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63CliCodCol", AV63CliCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67ArtCodCol", AV67ArtCodCol);
   }

   public void e1620P2( )
   {
      /* Dvelop_confirmpanel_btnuseraction1_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnuseraction1_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'LOADSELECTEDROWS' */
         S182 ();
         if (returnInSub) return;
         if ( AV56SelectedRows.size() > 0 )
         {
            new app.ficherosbasicos.pset_copiaseriescliente(remoteHandle, context).execute( AV56SelectedRows, AV7EmprCod, AV6CliCod_org, AV72CliCodDes) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_NoRecordSelected", ""));
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56SelectedRows", AV56SelectedRows);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59EmprCodCol", AV59EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63CliCodCol", AV63CliCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67ArtCodCol", AV67ArtCodCol);
   }

   public void e1720P2( )
   {
      /* Selectall_Click Routine */
      returnInSub = false ;
      AV59EmprCodCol = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV63CliCodCol = new GXSimpleCollection<Integer>(Integer.class, "internal", "") ;
      AV67ArtCodCol = new GXSimpleCollection<String>(String.class, "internal", "") ;
      if ( AV71SelectAll )
      {
         /* Execute user subroutine: 'ADD ALL RECORDS' */
         S192 ();
         if (returnInSub) return;
      }
      /* Start For Each Line */
      nRC_GXsfl_46 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_46"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_46_fel_idx = 0 ;
      while ( nGXsfl_46_fel_idx < nRC_GXsfl_46 )
      {
         nGXsfl_46_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_fel_idx+1) ;
         sGXsfl_46_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_462( ) ;
         AV55Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
         A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
         n69ArtDsc = false ;
         A5335ArtCodExt = httpContext.cgiGet( edtArtCodExt_Internalname) ;
         n5335ArtCodExt = false ;
         AV55Selected = AV71SelectAll ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV55Selected);
         /* End For Each Line */
      }
      if ( nGXsfl_46_fel_idx == 0 )
      {
         nGXsfl_46_idx = 1 ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      nGXsfl_46_fel_idx = 1 ;
      AV60EmprCodJson = AV59EmprCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60EmprCodJson", AV60EmprCodJson);
      AV64CliCodJson = AV63CliCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64CliCodJson", AV64CliCodJson);
      AV68ArtCodJson = AV67ArtCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68ArtCodJson", AV68ArtCodJson);
      divLayoutmaintable_Class = "Table TableWithSelectableGrid"+((AV59EmprCodCol.size()>0) ? " WWPMultiRowSelected" : "") ;
      httpContext.ajax_rsp_assign_prop("", false, divLayoutmaintable_Internalname, "Class", divLayoutmaintable_Class, true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59EmprCodCol", AV59EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63CliCodCol", AV63CliCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67ArtCodCol", AV67ArtCodCol);
   }

   public void e1220P2( )
   {
      /* Combo_clicod_org_Onoptionclicked Routine */
      returnInSub = false ;
      AV6CliCod_org = (int)(GXutil.lval( Combo_clicod_org_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod_org", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod_org), 6, 0));
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV34OrderedBy, 4, 0))+":"+(AV35OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'GETINDEXOFSELECTEDROW' Routine */
      returnInSub = false ;
      AV58i = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58i), 10, 0));
      AV84GXV1 = 1 ;
      while ( AV84GXV1 <= AV59EmprCodCol.size() )
      {
         AV61EmprCodColItem = (String)AV59EmprCodCol.elementAt(-1+AV84GXV1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61EmprCodColItem", AV61EmprCodColItem);
         if ( ( GXutil.strcmp(AV61EmprCodColItem, AV62EmprCodToFind) == 0 ) && ( ((Number) AV63CliCodCol.elementAt(-1+(int)(AV58i))).intValue() == AV66CliCodToFind ) && ( GXutil.strcmp((String)AV67ArtCodCol.elementAt(-1+(int)(AV58i)), AV70ArtCodToFind) == 0 ) )
         {
            if (true) break;
         }
         AV58i = (long)(AV58i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58i), 10, 0));
         AV84GXV1 = (int)(AV84GXV1+1) ;
      }
      if ( AV58i > AV59EmprCodCol.size() )
      {
         AV58i = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58i), 10, 0));
      }
   }

   public void S182( )
   {
      /* 'LOADSELECTEDROWS' Routine */
      returnInSub = false ;
      AV56SelectedRows = new GXBaseCollection<app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem>(app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem.class, "wCopiaSerieClienteSDTItem", "TexplusNET", remoteHandle) ;
      AV59EmprCodCol.fromJSonString(AV60EmprCodJson, null);
      AV63CliCodCol.fromJSonString(AV64CliCodJson, null);
      AV67ArtCodCol.fromJSonString(AV68ArtCodJson, null);
      AV58i = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58i), 10, 0));
      AV85GXV2 = 1 ;
      while ( AV85GXV2 <= AV59EmprCodCol.size() )
      {
         AV61EmprCodColItem = (String)AV59EmprCodCol.elementAt(-1+AV85GXV2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61EmprCodColItem", AV61EmprCodColItem);
         AV57SelectedRow = (app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem)new app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem(remoteHandle, context);
         AV65CliCodColItem = ((Number) AV63CliCodCol.elementAt(-1+(int)(AV58i))).intValue() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65CliCodColItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65CliCodColItem), 6, 0));
         AV69ArtCodColItem = (String)AV67ArtCodCol.elementAt(-1+(int)(AV58i)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69ArtCodColItem", AV69ArtCodColItem);
         /* Using cursor H020P4 */
         pr_default.execute(2, new Object[] {AV61EmprCodColItem, Integer.valueOf(AV65CliCodColItem), AV69ArtCodColItem});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A65ArtCod = H020P4_A65ArtCod[0] ;
            A252CliCod = H020P4_A252CliCod[0] ;
            A396EmprCod = H020P4_A396EmprCod[0] ;
            A407EmprNom = H020P4_A407EmprNom[0] ;
            n407EmprNom = H020P4_n407EmprNom[0] ;
            A279CliNom = H020P4_A279CliNom[0] ;
            A69ArtDsc = H020P4_A69ArtDsc[0] ;
            n69ArtDsc = H020P4_n69ArtDsc[0] ;
            A5335ArtCodExt = H020P4_A5335ArtCodExt[0] ;
            n5335ArtCodExt = H020P4_n5335ArtCodExt[0] ;
            A407EmprNom = H020P4_A407EmprNom[0] ;
            n407EmprNom = H020P4_n407EmprNom[0] ;
            A279CliNom = H020P4_A279CliNom[0] ;
            AV57SelectedRow.setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod( A396EmprCod );
            AV57SelectedRow.setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom( A407EmprNom );
            AV57SelectedRow.setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod( A252CliCod );
            AV57SelectedRow.setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom( A279CliNom );
            AV57SelectedRow.setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod( A65ArtCod );
            AV57SelectedRow.setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc( A69ArtDsc );
            AV57SelectedRow.setgxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext( A5335ArtCodExt );
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV56SelectedRows.add(AV57SelectedRow, 0);
         AV58i = (long)(AV58i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58i), 10, 0));
         AV85GXV2 = (int)(AV85GXV2+1) ;
      }
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue(AV78Pgmname+"GridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV78Pgmname+"GridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV37Session.getValue(AV78Pgmname+"GridState"), null, null);
      }
      AV34OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
      AV35OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OrderedDsc", AV35OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      AV87GXV3 = 1 ;
      while ( AV87GXV3 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV87GXV3));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV38TFArtCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFArtCod", AV38TFArtCod);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV39TFArtCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFArtCod_Sel", AV39TFArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV40TFArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFArtDsc", AV40TFArtDsc);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV41TFArtDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFArtDsc_Sel", AV41TFArtDsc_Sel);
         }
         AV87GXV3 = (int)(AV87GXV3+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFArtCod_Sel)==0), AV39TFArtCod_Sel, GXv_char4) ;
      wcopiaseriecliente_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFArtDsc_Sel)==0), AV41TFArtDsc_Sel, GXv_char3) ;
      wcopiaseriecliente_impl.this.GXt_char8 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char8 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char8 = "" ;
      GXv_char4[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFArtCod)==0), AV38TFArtCod, GXv_char4) ;
      wcopiaseriecliente_impl.this.GXt_char8 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFArtDsc)==0), AV40TFArtDsc, GXv_char3) ;
      wcopiaseriecliente_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char8+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV32GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV32GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV32GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV32GridState.fromxml(AV37Session.getValue(AV78Pgmname+"GridState"), null, null);
      AV32GridState.setgxTv_SdtWWPGridState_Orderedby( AV34OrderedBy );
      AV32GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV35OrderedDsc );
      AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState9[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFARTCOD", "", !(GXutil.strcmp("", AV38TFArtCod)==0), (short)(0), AV38TFArtCod, "", !(GXutil.strcmp("", AV39TFArtCod_Sel)==0), AV39TFArtCod_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState9[0] ;
      GXv_SdtWWPGridState9[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFARTDSC", "", !(GXutil.strcmp("", AV40TFArtDsc)==0), (short)(0), AV40TFArtDsc, "", !(GXutil.strcmp("", AV41TFArtDsc_Sel)==0), AV41TFArtDsc_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState9[0] ;
      AV32GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV32GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV32GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV30TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV30TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV78Pgmname );
      AV30TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV30TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV24HTTPRequest.getScriptName()+"?"+AV24HTTPRequest.getQuerystring() );
      AV30TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TARTICU" );
      AV37Session.setValue("TrnContext", AV30TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S192( )
   {
      /* 'ADD ALL RECORDS' Routine */
      returnInSub = false ;
      AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = AV38TFArtCod ;
      AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = AV39TFArtCod_Sel ;
      AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = AV40TFArtDsc ;
      AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = AV41TFArtDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ,
                                           AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ,
                                           AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ,
                                           AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ,
                                           Integer.valueOf(AV6CliCod_org) ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           AV7EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = GXutil.padr( GXutil.rtrim( AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod), 16, "%") ;
      lV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = GXutil.padr( GXutil.rtrim( AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc), 26, "%") ;
      /* Using cursor H020P5 */
      pr_default.execute(3, new Object[] {AV7EmprCod, lV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod, AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel, lV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc, AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel, Integer.valueOf(AV6CliCod_org)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = H020P5_A252CliCod[0] ;
         A396EmprCod = H020P5_A396EmprCod[0] ;
         A69ArtDsc = H020P5_A69ArtDsc[0] ;
         n69ArtDsc = H020P5_n69ArtDsc[0] ;
         A65ArtCod = H020P5_A65ArtCod[0] ;
         AV59EmprCodCol.add(A396EmprCod, 0);
         AV63CliCodCol.add((int)(A252CliCod), 0);
         AV67ArtCodCol.add(A65ArtCod, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODDES' Routine */
      returnInSub = false ;
      /* Using cursor H020P6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A10045CliAct = H020P6_A10045CliAct[0] ;
         A396EmprCod = H020P6_A396EmprCod[0] ;
         A13735CliCNom = H020P6_A13735CliCNom[0] ;
         A252CliCod = H020P6_A252CliCod[0] ;
         A279CliNom = H020P6_A279CliNom[0] ;
         AV54Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV54Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV54Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV73CliCodDes_Data.add(AV54Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_clicoddes_Selectedvalue_set = ((0==AV72CliCodDes) ? "" : GXutil.trim( GXutil.str( AV72CliCodDes, 6, 0))) ;
      ucCombo_clicoddes.sendProperty(context, "", false, Combo_clicoddes_Internalname, "SelectedValue_set", Combo_clicoddes_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD_ORG' Routine */
      returnInSub = false ;
      /* Using cursor H020P7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A10045CliAct = H020P7_A10045CliAct[0] ;
         A396EmprCod = H020P7_A396EmprCod[0] ;
         A13735CliCNom = H020P7_A13735CliCNom[0] ;
         A252CliCod = H020P7_A252CliCod[0] ;
         A279CliNom = H020P7_A279CliNom[0] ;
         AV54Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV54Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV54Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV74CliCod_org_Data.add(AV54Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_clicod_org_Selectedvalue_set = ((0==AV6CliCod_org) ? "" : GXutil.trim( GXutil.str( AV6CliCod_org, 6, 0))) ;
      ucCombo_clicod_org.sendProperty(context, "", false, Combo_clicod_org_Internalname, "SelectedValue_set", Combo_clicod_org_Selectedvalue_set);
   }

   public void wb_table1_72_20P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnuseraction1_Internalname, tblTabledvelop_confirmpanel_btnuseraction1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnuseraction1.setProperty("Title", Dvelop_confirmpanel_btnuseraction1_Title);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("ConfirmationText", Dvelop_confirmpanel_btnuseraction1_Confirmationtext);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition);
         ucDvelop_confirmpanel_btnuseraction1.setProperty("ConfirmType", Dvelop_confirmpanel_btnuseraction1_Confirmtype);
         ucDvelop_confirmpanel_btnuseraction1.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnuseraction1_Internalname, "DVELOP_CONFIRMPANEL_BTNUSERACTION1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNUSERACTION1Container"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_72_20P2e( true) ;
      }
      else
      {
         wb_table1_72_20P2e( false) ;
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
      pa20P2( ) ;
      ws20P2( ) ;
      we20P2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116143622", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/wcopiaseriecliente.js", "?202682116143622", false, true);
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_462( )
   {
      chkavSelected.setInternalname( "vSELECTED_"+sGXsfl_46_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_46_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_46_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_46_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_46_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_46_idx ;
      edtArtDsc_Internalname = "ARTDSC_"+sGXsfl_46_idx ;
      edtArtCodExt_Internalname = "ARTCODEXT_"+sGXsfl_46_idx ;
   }

   public void subsflControlProps_fel_462( )
   {
      chkavSelected.setInternalname( "vSELECTED_"+sGXsfl_46_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_46_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_46_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_46_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_46_fel_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_46_fel_idx ;
      edtArtDsc_Internalname = "ARTDSC_"+sGXsfl_46_fel_idx ;
      edtArtCodExt_Internalname = "ARTCODEXT_"+sGXsfl_46_fel_idx ;
   }

   public void sendrow_462( )
   {
      subsflControlProps_462( ) ;
      wb20P0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_46_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_46_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_46_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_46_idx+"',46)\"" : " ") ;
         ClassString = "AttributeCheckBox" ;
         StyleString = "" ;
         GXCCtl = "vSELECTED_" + sGXsfl_46_idx ;
         chkavSelected.setName( GXCCtl );
         chkavSelected.setWebtags( "" );
         chkavSelected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "TitleCaption", chkavSelected.getCaption(), !bGXsfl_46_Refreshing);
         chkavSelected.setCheckedValue( "false" );
         AV55Selected = GXutil.strtobool( GXutil.booltostr( AV55Selected)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV55Selected);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSelected.getInternalname(),GXutil.booltostr( AV55Selected),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"","",TempTags+((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtCod_Internalname,GXutil.rtrim( A65ArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtDsc_Internalname,GXutil.rtrim( A69ArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtCodExt_Internalname,GXutil.rtrim( A5335ArtCodExt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtCodExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes20P2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      /* End function sendrow_462 */
   }

   public void startgridcontrol46( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"46\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeCheckBox"+"\" "+" style=\""+""+""+"\" "+">") ;
         if ( chkavSelected.getTitleFormat() == 0 )
         {
            httpContext.writeValue( chkavSelected.getTitle()) ;
         }
         else
         {
            httpContext.writeText( chkavSelected.getTitle()) ;
         }
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod Externo", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV55Selected));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( chkavSelected.getTitle()));
         GridColumn.AddObjectProperty("Titleformat", GXutil.ltrim( localUtil.ntoc( chkavSelected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A65ArtCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A69ArtDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5335ArtCodExt));
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
      lblTextblockcombo_clicod_org_Internalname = "TEXTBLOCKCOMBO_CLICOD_ORG" ;
      Combo_clicod_org_Internalname = "COMBO_CLICOD_ORG" ;
      divTablesplittedclicod_org_Internalname = "TABLESPLITTEDCLICOD_ORG" ;
      lblTextblockcombo_clicoddes_Internalname = "TEXTBLOCKCOMBO_CLICODDES" ;
      Combo_clicoddes_Internalname = "COMBO_CLICODDES" ;
      divTablesplittedclicoddes_Internalname = "TABLESPLITTEDCLICODDES" ;
      divTablefilters_Internalname = "TABLEFILTERS" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      divTableaction_Internalname = "TABLEACTION" ;
      divTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      chkavSelected.setInternalname( "vSELECTED" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      edtArtCodExt_Internalname = "ARTCODEXT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicod_org_Internalname = "vCLICOD_ORG" ;
      edtavClicoddes_Internalname = "vCLICODDES" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      chkavSelectall.setInternalname( "vSELECTALL" );
      Dvelop_confirmpanel_btnuseraction1_Internalname = "DVELOP_CONFIRMPANEL_BTNUSERACTION1" ;
      tblTabledvelop_confirmpanel_btnuseraction1_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNUSERACTION1" ;
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
      edtArtCodExt_Jsonclick = "" ;
      edtArtDsc_Jsonclick = "" ;
      edtArtCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      chkavSelected.setCaption( "" );
      chkavSelected.setVisible( -1 );
      chkavSelected.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      chkavSelected.setTitle( "" );
      subGrid_Sortable = (byte)(0) ;
      chkavSelectall.setVisible( 1 );
      edtavClicoddes_Jsonclick = "" ;
      edtavClicoddes_Visible = 1 ;
      edtavClicod_org_Jsonclick = "" ;
      edtavClicod_org_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divLayoutmaintable_Class = "Table TableWithSelectableGrid" ;
      chkavSelected.setTitleFormat( (short)(0) );
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_btnuseraction1_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnuseraction1_Confirmationtext = "Desea realmente hacer la copiar ?" ;
      Dvelop_confirmpanel_btnuseraction1_Title = httpContext.getMessage( "Aviso", "") ;
      Ddo_grid_Datalistproc = "FicherosBasicos.wCopiaSerieClienteGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T" ;
      Ddo_grid_Filtertype = "Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2" ;
      Ddo_grid_Columnids = "5:ArtCod|6:ArtDsc" ;
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
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "COPIAR SERIES A TODOS CLIENTES", "") ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Combo_clicoddes_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicoddes_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_org_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicod_org_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Ficha Tecnica (Articulo)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vSELECTED_" + sGXsfl_46_idx ;
      chkavSelected.setName( GXCCtl );
      chkavSelected.setWebtags( "" );
      chkavSelected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "TitleCaption", chkavSelected.getCaption(), !bGXsfl_46_Refreshing);
      chkavSelected.setCheckedValue( "false" );
      AV55Selected = GXutil.strtobool( GXutil.booltostr( AV55Selected)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV55Selected);
      chkavSelectall.setName( "vSELECTALL" );
      chkavSelectall.setWebtags( "" );
      chkavSelectall.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelectall.getInternalname(), "TitleCaption", chkavSelectall.getCaption(), true);
      chkavSelectall.setCheckedValue( "false" );
      AV71SelectAll = GXutil.strtobool( GXutil.booltostr( AV71SelectAll)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71SelectAll", AV71SelectAll);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV6CliCod_org',fld:'vCLICOD_ORG',pic:'ZZZZZ9'},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV58i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV62EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'AV66CliCodToFind',fld:'vCLICODTOFIND',pic:'ZZZZZ9'},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''},{av:'AV70ArtCodToFind',fld:'vARTCODTOFIND',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV64CliCodJson',fld:'vCLICODJSON',pic:''},{av:'AV68ArtCodJson',fld:'vARTCODJSON',pic:''},{av:'AV38TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV39TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV40TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV41TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV71SelectAll',fld:'vSELECTALL',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'chkavSelected.getTitle()',ctrl:'vSELECTED',prop:'Title'},{av:'AV71SelectAll',fld:'vSELECTALL',pic:''},{av:'AV51GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV52GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1320P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6CliCod_org',fld:'vCLICOD_ORG',pic:'ZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV64CliCodJson',fld:'vCLICODJSON',pic:''},{av:'AV68ArtCodJson',fld:'vARTCODJSON',pic:''},{av:'AV38TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV39TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV40TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV41TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV58i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV62EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'AV66CliCodToFind',fld:'vCLICODTOFIND',pic:'ZZZZZ9'},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''},{av:'AV70ArtCodToFind',fld:'vARTCODTOFIND',pic:''},{av:'AV71SelectAll',fld:'vSELECTALL',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1420P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6CliCod_org',fld:'vCLICOD_ORG',pic:'ZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV64CliCodJson',fld:'vCLICODJSON',pic:''},{av:'AV68ArtCodJson',fld:'vARTCODJSON',pic:''},{av:'AV38TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV39TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV40TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV41TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV58i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV62EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'AV66CliCodToFind',fld:'vCLICODTOFIND',pic:'ZZZZZ9'},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''},{av:'AV70ArtCodToFind',fld:'vARTCODTOFIND',pic:''},{av:'AV71SelectAll',fld:'vSELECTALL',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1520P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6CliCod_org',fld:'vCLICOD_ORG',pic:'ZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV64CliCodJson',fld:'vCLICODJSON',pic:''},{av:'AV68ArtCodJson',fld:'vARTCODJSON',pic:''},{av:'AV38TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV39TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV40TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV41TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV58i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV62EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'AV66CliCodToFind',fld:'vCLICODTOFIND',pic:'ZZZZZ9'},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''},{av:'AV70ArtCodToFind',fld:'vARTCODTOFIND',pic:''},{av:'AV71SelectAll',fld:'vSELECTALL',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV39TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV40TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV41TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2020P2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'AV58i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV62EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'AV66CliCodToFind',fld:'vCLICODTOFIND',pic:'ZZZZZ9'},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''},{av:'AV70ArtCodToFind',fld:'vARTCODTOFIND',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV55Selected',fld:'vSELECTED',pic:''},{av:'AV62EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV66CliCodToFind',fld:'vCLICODTOFIND',pic:'ZZZZZ9'},{av:'AV70ArtCodToFind',fld:'vARTCODTOFIND',pic:''},{av:'AV58i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV61EmprCodColItem',fld:'vEMPRCODCOLITEM',pic:'@!'}]}");
      setEventMetadata("VSELECTED.CLICK","{handler:'e2120P2',iparms:[{av:'AV55Selected',fld:'vSELECTED',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''},{av:'AV58i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV62EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV66CliCodToFind',fld:'vCLICODTOFIND',pic:'ZZZZZ9'},{av:'AV70ArtCodToFind',fld:'vARTCODTOFIND',pic:''}]");
      setEventMetadata("VSELECTED.CLICK",",oparms:[{av:'AV62EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV66CliCodToFind',fld:'vCLICODTOFIND',pic:'ZZZZZ9'},{av:'AV70ArtCodToFind',fld:'vARTCODTOFIND',pic:''},{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''},{av:'AV60EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV64CliCodJson',fld:'vCLICODJSON',pic:''},{av:'AV68ArtCodJson',fld:'vARTCODJSON',pic:''},{av:'divLayoutmaintable_Class',ctrl:'LAYOUTMAINTABLE',prop:'Class'},{av:'AV58i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV61EmprCodColItem',fld:'vEMPRCODCOLITEM',pic:'@!'}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e1120P1',iparms:[]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNUSERACTION1.CLOSE","{handler:'e1620P2',iparms:[{av:'Dvelop_confirmpanel_btnuseraction1_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNUSERACTION1',prop:'Result'},{av:'AV56SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6CliCod_org',fld:'vCLICOD_ORG',pic:'ZZZZZ9'},{av:'AV72CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'AV60EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV64CliCodJson',fld:'vCLICODJSON',pic:''},{av:'AV68ArtCodJson',fld:'vARTCODJSON',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A5335ArtCodExt',fld:'ARTCODEXT',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNUSERACTION1.CLOSE",",oparms:[{av:'AV56SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''},{av:'AV58i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV61EmprCodColItem',fld:'vEMPRCODCOLITEM',pic:'@!'},{av:'AV65CliCodColItem',fld:'vCLICODCOLITEM',pic:'ZZZZZ9'},{av:'AV69ArtCodColItem',fld:'vARTCODCOLITEM',pic:''}]}");
      setEventMetadata("VSELECTALL.CLICK","{handler:'e1720P2',iparms:[{av:'AV71SelectAll',fld:'vSELECTALL',pic:''},{av:'AV41TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV40TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV39TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV38TFArtCod',fld:'vTFARTCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',grid:46,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_46',ctrl:'GRID',grid:46,prop:'GridRC',grid:46},{av:'A396EmprCod',fld:'EMPRCOD',grid:46,pic:'@!'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',grid:46,pic:'ZZZZZ9'},{av:'AV6CliCod_org',fld:'vCLICOD_ORG',pic:'ZZZZZ9'},{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''}]");
      setEventMetadata("VSELECTALL.CLICK",",oparms:[{av:'AV59EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV63CliCodCol',fld:'vCLICODCOL',pic:''},{av:'AV67ArtCodCol',fld:'vARTCODCOL',pic:''},{av:'AV55Selected',fld:'vSELECTED',pic:''},{av:'AV60EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV64CliCodJson',fld:'vCLICODJSON',pic:''},{av:'AV68ArtCodJson',fld:'vARTCODJSON',pic:''},{av:'divLayoutmaintable_Class',ctrl:'LAYOUTMAINTABLE',prop:'Class'}]}");
      setEventMetadata("COMBO_CLICOD_ORG.ONOPTIONCLICKED","{handler:'e1220P2',iparms:[{av:'Combo_clicod_org_Selectedvalue_get',ctrl:'COMBO_CLICOD_ORG',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICOD_ORG.ONOPTIONCLICKED",",oparms:[{av:'AV6CliCod_org',fld:'vCLICOD_ORG',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Artcodext',iparms:[]");
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
      Dvelop_confirmpanel_btnuseraction1_Result = "" ;
      Combo_clicoddes_Selectedvalue_get = "" ;
      Combo_clicod_org_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      AV60EmprCodJson = "" ;
      AV64CliCodJson = "" ;
      AV68ArtCodJson = "" ;
      AV38TFArtCod = "" ;
      AV39TFArtCod_Sel = "" ;
      AV40TFArtDsc = "" ;
      AV41TFArtDsc_Sel = "" ;
      AV78Pgmname = "" ;
      AV59EmprCodCol = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62EmprCodToFind = "" ;
      AV63CliCodCol = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV67ArtCodCol = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70ArtCodToFind = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV74CliCod_org_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV73CliCodDes_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV56SelectedRows = new GXBaseCollection<app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem>(app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem.class, "wCopiaSerieClienteSDTItem", "TexplusNET", remoteHandle);
      Combo_clicod_org_Selectedvalue_set = "" ;
      Combo_clicoddes_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicod_org_Jsonclick = "" ;
      ucCombo_clicod_org = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_org_Caption = "" ;
      lblTextblockcombo_clicoddes_Jsonclick = "" ;
      ucCombo_clicoddes = new com.genexus.webpanels.GXUserControl();
      Combo_clicoddes_Caption = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A5335ArtCodExt = "" ;
      scmdbuf = "" ;
      lV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = "" ;
      lV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = "" ;
      AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = "" ;
      AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = "" ;
      AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = "" ;
      AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = "" ;
      H020P2_A5335ArtCodExt = new String[] {""} ;
      H020P2_n5335ArtCodExt = new boolean[] {false} ;
      H020P2_A69ArtDsc = new String[] {""} ;
      H020P2_n69ArtDsc = new boolean[] {false} ;
      H020P2_A65ArtCod = new String[] {""} ;
      H020P2_A279CliNom = new String[] {""} ;
      H020P2_A252CliCod = new int[1] ;
      H020P2_A407EmprNom = new String[] {""} ;
      H020P2_n407EmprNom = new boolean[] {false} ;
      H020P2_A396EmprCod = new String[] {""} ;
      H020P3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV16Station = "" ;
      AV8EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV75AuxEmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV29WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV61EmprCodColItem = "" ;
      AV57SelectedRow = new app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem(remoteHandle, context);
      AV69ArtCodColItem = "" ;
      H020P4_A65ArtCod = new String[] {""} ;
      H020P4_A252CliCod = new int[1] ;
      H020P4_A396EmprCod = new String[] {""} ;
      H020P4_A407EmprNom = new String[] {""} ;
      H020P4_n407EmprNom = new boolean[] {false} ;
      H020P4_A279CliNom = new String[] {""} ;
      H020P4_A69ArtDsc = new String[] {""} ;
      H020P4_n69ArtDsc = new boolean[] {false} ;
      H020P4_A5335ArtCodExt = new String[] {""} ;
      H020P4_n5335ArtCodExt = new boolean[] {false} ;
      AV37Session = httpContext.getWebSession();
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char8 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState9 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV30TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV24HTTPRequest = httpContext.getHttpRequest();
      H020P5_A252CliCod = new int[1] ;
      H020P5_A396EmprCod = new String[] {""} ;
      H020P5_A69ArtDsc = new String[] {""} ;
      H020P5_n69ArtDsc = new boolean[] {false} ;
      H020P5_A65ArtCod = new String[] {""} ;
      H020P6_A10045CliAct = new String[] {""} ;
      H020P6_A396EmprCod = new String[] {""} ;
      H020P6_A13735CliCNom = new String[] {""} ;
      H020P6_A252CliCod = new int[1] ;
      H020P6_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      AV54Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H020P7_A10045CliAct = new String[] {""} ;
      H020P7_A396EmprCod = new String[] {""} ;
      H020P7_A13735CliCNom = new String[] {""} ;
      H020P7_A252CliCod = new int[1] ;
      H020P7_A279CliNom = new String[] {""} ;
      ucDvelop_confirmpanel_btnuseraction1 = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.wcopiaseriecliente__default(),
         new Object[] {
             new Object[] {
            H020P2_A5335ArtCodExt, H020P2_n5335ArtCodExt, H020P2_A69ArtDsc, H020P2_n69ArtDsc, H020P2_A65ArtCod, H020P2_A279CliNom, H020P2_A252CliCod, H020P2_A407EmprNom, H020P2_n407EmprNom, H020P2_A396EmprCod
            }
            , new Object[] {
            H020P3_AGRID_nRecordCount
            }
            , new Object[] {
            H020P4_A65ArtCod, H020P4_A252CliCod, H020P4_A396EmprCod, H020P4_A407EmprNom, H020P4_n407EmprNom, H020P4_A279CliNom, H020P4_A69ArtDsc, H020P4_n69ArtDsc, H020P4_A5335ArtCodExt, H020P4_n5335ArtCodExt
            }
            , new Object[] {
            H020P5_A252CliCod, H020P5_A396EmprCod, H020P5_A69ArtDsc, H020P5_n69ArtDsc, H020P5_A65ArtCod
            }
            , new Object[] {
            H020P6_A10045CliAct, H020P6_A396EmprCod, H020P6_A13735CliCNom, H020P6_A252CliCod, H020P6_A279CliNom
            }
            , new Object[] {
            H020P7_A10045CliAct, H020P7_A396EmprCod, H020P7_A13735CliCNom, H020P7_A252CliCod, H020P7_A279CliNom
            }
         }
      );
      AV78Pgmname = "FicherosBasicos.wCopiaSerieCliente" ;
      /* GeneXus formulas. */
      AV78Pgmname = "FicherosBasicos.wCopiaSerieCliente" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
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
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV34OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_46 ;
   private int nGXsfl_46_idx=1 ;
   private int AV6CliCod_org ;
   private int AV66CliCodToFind ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int edtavClicod_org_Visible ;
   private int AV72CliCodDes ;
   private int edtavClicoddes_Visible ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV25PageToGo ;
   private int nGXsfl_46_fel_idx=1 ;
   private int AV84GXV1 ;
   private int AV85GXV2 ;
   private int AV65CliCodColItem ;
   private int AV87GXV3 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV58i ;
   private long AV51GridCurrentPage ;
   private long AV52GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Dvelop_confirmpanel_btnuseraction1_Result ;
   private String Combo_clicoddes_Selectedvalue_get ;
   private String Combo_clicod_org_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_46_idx="0001" ;
   private String AV7EmprCod ;
   private String AV38TFArtCod ;
   private String AV39TFArtCod_Sel ;
   private String AV40TFArtDsc ;
   private String AV41TFArtDsc_Sel ;
   private String AV78Pgmname ;
   private String AV62EmprCodToFind ;
   private String AV70ArtCodToFind ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Combo_clicod_org_Cls ;
   private String Combo_clicod_org_Selectedvalue_set ;
   private String Combo_clicoddes_Cls ;
   private String Combo_clicoddes_Selectedvalue_set ;
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
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_btnuseraction1_Title ;
   private String Dvelop_confirmpanel_btnuseraction1_Confirmationtext ;
   private String Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnuseraction1_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divLayoutmaintable_Class ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTablerightheader_Internalname ;
   private String divTablefilters_Internalname ;
   private String divTablesplittedclicod_org_Internalname ;
   private String lblTextblockcombo_clicod_org_Internalname ;
   private String lblTextblockcombo_clicod_org_Jsonclick ;
   private String Combo_clicod_org_Caption ;
   private String Combo_clicod_org_Internalname ;
   private String divTablesplittedclicoddes_Internalname ;
   private String lblTextblockcombo_clicoddes_Internalname ;
   private String lblTextblockcombo_clicoddes_Jsonclick ;
   private String Combo_clicoddes_Caption ;
   private String Combo_clicoddes_Internalname ;
   private String divTableaction_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicod_org_Internalname ;
   private String edtavClicod_org_Jsonclick ;
   private String edtavClicoddes_Internalname ;
   private String edtavClicoddes_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A65ArtCod ;
   private String edtArtCod_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Internalname ;
   private String A5335ArtCodExt ;
   private String edtArtCodExt_Internalname ;
   private String scmdbuf ;
   private String lV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ;
   private String lV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ;
   private String AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ;
   private String AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ;
   private String AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ;
   private String AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ;
   private String hsh ;
   private String AV16Station ;
   private String AV8EmprNom ;
   private String AV17UsurCod ;
   private String AV75AuxEmprCod ;
   private String GXv_char2[] ;
   private String sGXsfl_46_fel_idx="0001" ;
   private String AV61EmprCodColItem ;
   private String AV69ArtCodColItem ;
   private String GXt_char8 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String A10045CliAct ;
   private String tblTabledvelop_confirmpanel_btnuseraction1_Internalname ;
   private String Dvelop_confirmpanel_btnuseraction1_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Jsonclick ;
   private String edtArtCodExt_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV35OrderedDsc ;
   private boolean AV71SelectAll ;
   private boolean Combo_clicod_org_Emptyitem ;
   private boolean Combo_clicoddes_Emptyitem ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV55Selected ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n5335ArtCodExt ;
   private boolean bGXsfl_46_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV60EmprCodJson ;
   private String AV64CliCodJson ;
   private String AV68ArtCodJson ;
   private String A13735CliCNom ;
   private GXSimpleCollection<Integer> AV63CliCodCol ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV24HTTPRequest ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod_org ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicoddes ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnuseraction1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSelected ;
   private ICheckbox chkavSelectall ;
   private IDataStoreProvider pr_default ;
   private String[] H020P2_A5335ArtCodExt ;
   private boolean[] H020P2_n5335ArtCodExt ;
   private String[] H020P2_A69ArtDsc ;
   private boolean[] H020P2_n69ArtDsc ;
   private String[] H020P2_A65ArtCod ;
   private String[] H020P2_A279CliNom ;
   private int[] H020P2_A252CliCod ;
   private String[] H020P2_A407EmprNom ;
   private boolean[] H020P2_n407EmprNom ;
   private String[] H020P2_A396EmprCod ;
   private long[] H020P3_AGRID_nRecordCount ;
   private String[] H020P4_A65ArtCod ;
   private int[] H020P4_A252CliCod ;
   private String[] H020P4_A396EmprCod ;
   private String[] H020P4_A407EmprNom ;
   private boolean[] H020P4_n407EmprNom ;
   private String[] H020P4_A279CliNom ;
   private String[] H020P4_A69ArtDsc ;
   private boolean[] H020P4_n69ArtDsc ;
   private String[] H020P4_A5335ArtCodExt ;
   private boolean[] H020P4_n5335ArtCodExt ;
   private int[] H020P5_A252CliCod ;
   private String[] H020P5_A396EmprCod ;
   private String[] H020P5_A69ArtDsc ;
   private boolean[] H020P5_n69ArtDsc ;
   private String[] H020P5_A65ArtCod ;
   private String[] H020P6_A10045CliAct ;
   private String[] H020P6_A396EmprCod ;
   private String[] H020P6_A13735CliCNom ;
   private int[] H020P6_A252CliCod ;
   private String[] H020P6_A279CliNom ;
   private String[] H020P7_A10045CliAct ;
   private String[] H020P7_A396EmprCod ;
   private String[] H020P7_A13735CliCNom ;
   private int[] H020P7_A252CliCod ;
   private String[] H020P7_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV59EmprCodCol ;
   private GXSimpleCollection<String> AV67ArtCodCol ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV74CliCod_org_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV73CliCodDes_Data ;
   private GXBaseCollection<app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem> AV56SelectedRows ;
   private app.wwpbaseobjects.SdtWWPContext AV29WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV30TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState9[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV54Combo_DataItem ;
   private app.ficherosbasicos.SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem AV57SelectedRow ;
}

final  class wcopiaseriecliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H020P2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ,
                                          String AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ,
                                          String AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ,
                                          String AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ,
                                          int AV6CliCod_org ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          int A252CliCod ,
                                          short AV34OrderedBy ,
                                          boolean AV35OrderedDsc ,
                                          String AV7EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[11];
      Object[] GXv_Object11 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.ArtCodExt, T1.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod, T2.EmprNom, T1.EmprCod" ;
      sFromString = " FROM ((TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod <> '')");
      if ( (GXutil.strcmp("", AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV6CliCod_org) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ( AV34OrderedBy == 1 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV34OrderedBy == 1 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtDsc" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_H020P3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ,
                                          String AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ,
                                          String AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ,
                                          String AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ,
                                          int AV6CliCod_org ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          int A252CliCod ,
                                          short AV34OrderedBy ,
                                          boolean AV35OrderedDsc ,
                                          String AV7EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[6];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPARTICU T1 INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod <> '')");
      if ( (GXutil.strcmp("", AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV6CliCod_org) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV34OrderedBy == 1 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 1 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_H020P5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ,
                                          String AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ,
                                          String AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ,
                                          String AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ,
                                          int AV6CliCod_org ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          int A252CliCod ,
                                          String AV7EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[6];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT CliCod, EmprCod, ArtDsc, ArtCod FROM TXPARTICU" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ArtCod <> '')");
      if ( (GXutil.strcmp("", AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Ficherosbasicos_wcopiaserieclienteds_1_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(ArtCod = ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(ArtDsc = ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV6CliCod_org) )
      {
         addWhere(sWhereString, "(CliCod = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_H020P2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , ((Boolean) dynConstraints[9]).booleanValue() , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 1 :
                  return conditional_H020P3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , ((Boolean) dynConstraints[9]).booleanValue() , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 3 :
                  return conditional_H020P5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H020P2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H020P3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H020P4", "SELECT T1.ArtCod, T1.CliCod, T1.EmprCod, T2.EmprNom, T3.CliNom, T1.ArtDsc, T1.ArtCodExt FROM ((TXPARTICU T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H020P5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H020P6", "SELECT CliAct, EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H020P7", "SELECT CliAct, EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 16);
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

