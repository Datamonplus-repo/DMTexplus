package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class testmenu_impl extends GXDataArea
{
   public testmenu_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public testmenu_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( testmenu_impl.class ));
   }

   public testmenu_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      chkavIsauthorized = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_12 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_12"))) ;
      nGXsfl_12_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_12_idx"))) ;
      sGXsfl_12_idx = httpContext.GetPar( "sGXsfl_12_idx") ;
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
      AV58EditableGrid_Mode = httpContext.GetPar( "EditableGrid_Mode") ;
      AV39TFMnuId = httpContext.GetPar( "TFMnuId") ;
      AV40TFMnuId_Sel = httpContext.GetPar( "TFMnuId_Sel") ;
      AV41TFMnuOp = (byte)(GXutil.lval( httpContext.GetPar( "TFMnuOp"))) ;
      AV42TFMnuOp_To = (byte)(GXutil.lval( httpContext.GetPar( "TFMnuOp_To"))) ;
      AV45TFMnuPgmTpo = httpContext.GetPar( "TFMnuPgmTpo") ;
      AV46TFMnuPgmTpo_Sel = httpContext.GetPar( "TFMnuPgmTpo_Sel") ;
      AV51TFMnuTxt = httpContext.GetPar( "TFMnuTxt") ;
      AV52TFMnuTxt_Sel = httpContext.GetPar( "TFMnuTxt_Sel") ;
      AV47TFMnuPgmTxt = httpContext.GetPar( "TFMnuPgmTxt") ;
      AV48TFMnuPgmTxt_Sel = httpContext.GetPar( "TFMnuPgmTxt_Sel") ;
      AV43TFMnuPgm = httpContext.GetPar( "TFMnuPgm") ;
      AV44TFMnuPgm_Sel = httpContext.GetPar( "TFMnuPgm_Sel") ;
      AV49TFMnuPgmWeb = httpContext.GetPar( "TFMnuPgmWeb") ;
      AV50TFMnuPgmWeb_Sel = httpContext.GetPar( "TFMnuPgmWeb_Sel") ;
      AV91Pgmname = httpContext.GetPar( "Pgmname") ;
      AV34OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV36OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV63MnuId_SelectedLine = httpContext.GetPar( "MnuId_SelectedLine") ;
      AV64MnuOp_SelectedLine = (byte)(GXutil.lval( httpContext.GetPar( "MnuOp_SelectedLine"))) ;
      AV24IsAuthorized = GXutil.strtobool( httpContext.GetPar( "IsAuthorized")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV58EditableGrid_Mode, AV39TFMnuId, AV40TFMnuId_Sel, AV41TFMnuOp, AV42TFMnuOp_To, AV45TFMnuPgmTpo, AV46TFMnuPgmTpo_Sel, AV51TFMnuTxt, AV52TFMnuTxt_Sel, AV47TFMnuPgmTxt, AV48TFMnuPgmTxt_Sel, AV43TFMnuPgm, AV44TFMnuPgm_Sel, AV49TFMnuPgmWeb, AV50TFMnuPgmWeb_Sel, AV91Pgmname, AV34OrderedBy, AV36OrderedDsc, AV63MnuId_SelectedLine, AV64MnuOp_SelectedLine, AV24IsAuthorized) ;
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
      pa25Q2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start25Q2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.testmenu", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV91Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_12", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_12, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV19GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV20GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV11DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV11DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEDITABLEGRID_MODE", AV58EditableGrid_Mode);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUID", GXutil.rtrim( AV39TFMnuId));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUID_SEL", GXutil.rtrim( AV40TFMnuId_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUOP", GXutil.ltrim( localUtil.ntoc( AV41TFMnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUOP_TO", GXutil.ltrim( localUtil.ntoc( AV42TFMnuOp_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUPGMTPO", GXutil.rtrim( AV45TFMnuPgmTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUPGMTPO_SEL", GXutil.rtrim( AV46TFMnuPgmTpo_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUTXT", GXutil.rtrim( AV51TFMnuTxt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUTXT_SEL", GXutil.rtrim( AV52TFMnuTxt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUPGMTXT", GXutil.rtrim( AV47TFMnuPgmTxt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUPGMTXT_SEL", GXutil.rtrim( AV48TFMnuPgmTxt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUPGM", GXutil.rtrim( AV43TFMnuPgm));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUPGM_SEL", GXutil.rtrim( AV44TFMnuPgm_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUPGMWEB", AV49TFMnuPgmWeb);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMNUPGMWEB_SEL", AV50TFMnuPgmWeb_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV91Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV91Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV34OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV36OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vMNUID_SELECTEDLINE", GXutil.rtrim( AV63MnuId_SelectedLine));
      app.GxWebStd.gx_hidden_field( httpContext, "vMNUOP_SELECTEDLINE", GXutil.ltrim( localUtil.ntoc( AV64MnuOp_SelectedLine, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMESSAGES", AV60Messages);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMESSAGES", AV60Messages);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELEVALUAR_Width", GXutil.rtrim( Dvpanel_panelevaluar_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELEVALUAR_Autowidth", GXutil.booltostr( Dvpanel_panelevaluar_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELEVALUAR_Autoheight", GXutil.booltostr( Dvpanel_panelevaluar_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELEVALUAR_Cls", GXutil.rtrim( Dvpanel_panelevaluar_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELEVALUAR_Title", GXutil.rtrim( Dvpanel_panelevaluar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELEVALUAR_Collapsible", GXutil.booltostr( Dvpanel_panelevaluar_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELEVALUAR_Collapsed", GXutil.booltostr( Dvpanel_panelevaluar_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELEVALUAR_Showcollapseicon", GXutil.booltostr( Dvpanel_panelevaluar_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELEVALUAR_Iconposition", GXutil.rtrim( Dvpanel_panelevaluar_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELEVALUAR_Autoscroll", GXutil.booltostr( Dvpanel_panelevaluar_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we25Q2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt25Q2( ) ;
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
      return formatLink("app.testmenu", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TestMenu" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " TMENUNIVEL1", "") ;
   }

   public void wb25Q0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol12( ) ;
      }
      if ( wbEnd == 12 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_12 = (int)(nGXsfl_12_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV19GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV20GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelevaluar.setProperty("Width", Dvpanel_panelevaluar_Width);
         ucDvpanel_panelevaluar.setProperty("AutoWidth", Dvpanel_panelevaluar_Autowidth);
         ucDvpanel_panelevaluar.setProperty("AutoHeight", Dvpanel_panelevaluar_Autoheight);
         ucDvpanel_panelevaluar.setProperty("Cls", Dvpanel_panelevaluar_Cls);
         ucDvpanel_panelevaluar.setProperty("Title", Dvpanel_panelevaluar_Title);
         ucDvpanel_panelevaluar.setProperty("Collapsible", Dvpanel_panelevaluar_Collapsible);
         ucDvpanel_panelevaluar.setProperty("Collapsed", Dvpanel_panelevaluar_Collapsed);
         ucDvpanel_panelevaluar.setProperty("ShowCollapseIcon", Dvpanel_panelevaluar_Showcollapseicon);
         ucDvpanel_panelevaluar.setProperty("IconPosition", Dvpanel_panelevaluar_Iconposition);
         ucDvpanel_panelevaluar.setProperty("AutoScroll", Dvpanel_panelevaluar_Autoscroll);
         ucDvpanel_panelevaluar.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelevaluar_Internalname, "DVPANEL_PANELEVALUARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELEVALUARContainer"+"PanelEvaluar"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelevaluar_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEva_mnuid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEva_mnuid_Internalname, httpContext.getMessage( "Id", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_12_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEva_mnuid_Internalname, GXutil.rtrim( AV12Eva_MnuId), GXutil.rtrim( localUtil.format( AV12Eva_MnuId, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEva_mnuid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEva_mnuid_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TestMenu.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEva_mnuop_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEva_mnuop_Internalname, httpContext.getMessage( "Opción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_12_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEva_mnuop_Internalname, GXutil.ltrim( localUtil.ntoc( AV13Eva_MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavEva_mnuop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13Eva_MnuOp), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV13Eva_MnuOp), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEva_mnuop_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEva_mnuop_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TestMenu.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEva_mnupgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEva_mnupgm_Internalname, httpContext.getMessage( "Objeto Win", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_12_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEva_mnupgm_Internalname, GXutil.rtrim( AV14Eva_MnuPgm), GXutil.rtrim( localUtil.format( AV14Eva_MnuPgm, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEva_mnupgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEva_mnupgm_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TestMenu.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEva_mnupgmweb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEva_mnupgmweb_Internalname, httpContext.getMessage( "Objeto Web", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_12_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEva_mnupgmweb_Internalname, AV16Eva_MnuPgmWeb, GXutil.rtrim( localUtil.format( AV16Eva_MnuPgmWeb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEva_mnupgmweb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEva_mnupgmweb_Enabled, 0, "text", "", 100, "%", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TestMenu.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnevaluarpermiso_Internalname, "gx.evt.setGridEvt("+GXutil.str( 12, 2, 0)+","+"null"+");", httpContext.getMessage( "Evaluar permiso", ""), bttBtnevaluarpermiso_Jsonclick, 5, httpContext.getMessage( "Evaluar permiso", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEVALUARPERMISO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TestMenu.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEva_usurcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEva_usurcod_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_12_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEva_usurcod_Internalname, GXutil.rtrim( AV17Eva_UsurCod), GXutil.rtrim( localUtil.format( AV17Eva_UsurCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEva_usurcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEva_usurcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TestMenu.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEva_mnupgmtxt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEva_mnupgmtxt_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_12_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEva_mnupgmtxt_Internalname, GXutil.rtrim( AV15Eva_MnuPgmTxt), GXutil.rtrim( localUtil.format( AV15Eva_MnuPgmTxt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEva_mnupgmtxt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEva_mnupgmtxt_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TestMenu.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOk_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOk_Internalname, httpContext.getMessage( "Permiso en Win", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_12_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOk_Internalname, GXutil.rtrim( AV33Ok), GXutil.rtrim( localUtil.format( AV33Ok, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOk_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOk_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TestMenu.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavIsauthorized.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavIsauthorized.getInternalname(), httpContext.getMessage( "Permiso en Web", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_12_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavIsauthorized.getInternalname(), GXutil.booltostr( AV24IsAuthorized), "", httpContext.getMessage( "Permiso en Web", ""), 1, chkavIsauthorized.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(79, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,79);\"");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV11DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 12 )
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

   public void start25Q2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " TMENUNIVEL1", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup25Q0( ) ;
   }

   public void ws25Q2( )
   {
      start25Q2( ) ;
      evt25Q2( ) ;
   }

   public void evt25Q2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1125Q2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1225Q2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1325Q2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEVALUARPERMISO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEvaluarPermiso' */
                           e1425Q2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VUPDATE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 21), "'EDITABLEGRIDCONFIRM'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "'EDITABLEGRIDCANCEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "GRID.ONLINEACTIVATE") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "'EDITABLEGRIDCANCEL'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VUPDATE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 21), "'EDITABLEGRIDCONFIRM'") == 0 ) )
                        {
                           nGXsfl_12_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_122( ) ;
                           AV69EditableGridCancel = httpContext.cgiGet( edtavEditablegridcancel_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavEditablegridcancel_Internalname, "Bitmap", ((GXutil.strcmp("", AV69EditableGridCancel)==0) ? AV88Editablegridcancel_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV69EditableGridCancel))), !bGXsfl_12_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavEditablegridcancel_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV69EditableGridCancel), true);
                           A945MnuId = GXutil.upper( httpContext.cgiGet( edtMnuId_Internalname)) ;
                           A946MnuOp = (byte)(localUtil.ctol( httpContext.cgiGet( edtMnuOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV65MnuPgmTpo_Editable = GXutil.upper( httpContext.cgiGet( edtavMnupgmtpo_editable_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMnupgmtpo_editable_Internalname, AV65MnuPgmTpo_Editable);
                           A948MnuPgmTpo = GXutil.upper( httpContext.cgiGet( edtMnuPgmTpo_Internalname)) ;
                           A951MnuTxt = httpContext.cgiGet( edtMnuTxt_Internalname) ;
                           n951MnuTxt = false ;
                           AV66MnuPgmTxt_Editable = httpContext.cgiGet( edtavMnupgmtxt_editable_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMnupgmtxt_editable_Internalname, AV66MnuPgmTxt_Editable);
                           A949MnuPgmTxt = httpContext.cgiGet( edtMnuPgmTxt_Internalname) ;
                           AV67MnuPgm_Editable = GXutil.upper( httpContext.cgiGet( edtavMnupgm_editable_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMnupgm_editable_Internalname, AV67MnuPgm_Editable);
                           A947MnuPgm = GXutil.upper( httpContext.cgiGet( edtMnuPgm_Internalname)) ;
                           AV68MnuPgmWeb_Editable = httpContext.cgiGet( edtavMnupgmweb_editable_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMnupgmweb_editable_Internalname, AV68MnuPgmWeb_Editable);
                           A14286MnuPgmWeb = httpContext.cgiGet( edtMnuPgmWeb_Internalname) ;
                           AV70Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavUpdate_Internalname, AV70Update);
                           AV71EditableGridConfirm = httpContext.cgiGet( edtavEditablegridconfirm_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavEditablegridconfirm_Internalname, "Bitmap", ((GXutil.strcmp("", AV71EditableGridConfirm)==0) ? AV89Editablegridconfirm_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV71EditableGridConfirm))), !bGXsfl_12_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavEditablegridconfirm_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV71EditableGridConfirm), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1525Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1625Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1725Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VUPDATE.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1825Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'EDITABLEGRIDCONFIRM'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'EditableGridConfirm' */
                                 e1925Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'EDITABLEGRIDCANCEL'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'EditableGridCancel' */
                                 e2025Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.ONLINEACTIVATE") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2125Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
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

   public void we25Q2( )
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

   public void pa25Q2( )
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
            GX_FocusControl = edtavEva_mnuid_Internalname ;
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
      subsflControlProps_122( ) ;
      while ( nGXsfl_12_idx <= nRC_GXsfl_12 )
      {
         sendrow_122( ) ;
         nGXsfl_12_idx = ((subGrid_Islastpage==1)&&(nGXsfl_12_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_12_idx+1) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_122( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV58EditableGrid_Mode ,
                                 String AV39TFMnuId ,
                                 String AV40TFMnuId_Sel ,
                                 byte AV41TFMnuOp ,
                                 byte AV42TFMnuOp_To ,
                                 String AV45TFMnuPgmTpo ,
                                 String AV46TFMnuPgmTpo_Sel ,
                                 String AV51TFMnuTxt ,
                                 String AV52TFMnuTxt_Sel ,
                                 String AV47TFMnuPgmTxt ,
                                 String AV48TFMnuPgmTxt_Sel ,
                                 String AV43TFMnuPgm ,
                                 String AV44TFMnuPgm_Sel ,
                                 String AV49TFMnuPgmWeb ,
                                 String AV50TFMnuPgmWeb_Sel ,
                                 String AV91Pgmname ,
                                 short AV34OrderedBy ,
                                 boolean AV36OrderedDsc ,
                                 String AV63MnuId_SelectedLine ,
                                 byte AV64MnuOp_SelectedLine ,
                                 boolean AV24IsAuthorized )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1625Q2 ();
      GRID_nCurrentRecord = 0 ;
      rf25Q2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MNUID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A945MnuId, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUID", GXutil.rtrim( A945MnuId));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MNUOP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A946MnuOp), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUOP", GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MNUPGM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A947MnuPgm, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPGM", GXutil.rtrim( A947MnuPgm));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MNUPGMWEB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14286MnuPgmWeb, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPGMWEB", A14286MnuPgmWeb);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MNUPGMTXT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A949MnuPgmTxt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPGMTXT", GXutil.rtrim( A949MnuPgmTxt));
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
      AV24IsAuthorized = GXutil.strtobool( GXutil.booltostr( AV24IsAuthorized)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24IsAuthorized", AV24IsAuthorized);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf25Q2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV91Pgmname = "TestMenu" ;
      Gx_err = (short)(0) ;
      edtavMnupgmtpo_editable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMnupgmtpo_editable_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMnupgmtpo_editable_Enabled), 5, 0), !bGXsfl_12_Refreshing);
      edtavMnupgmtxt_editable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMnupgmtxt_editable_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMnupgmtxt_editable_Enabled), 5, 0), !bGXsfl_12_Refreshing);
      edtavMnupgm_editable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMnupgm_editable_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMnupgm_editable_Enabled), 5, 0), !bGXsfl_12_Refreshing);
      edtavMnupgmweb_editable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMnupgmweb_editable_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMnupgmweb_editable_Enabled), 5, 0), !bGXsfl_12_Refreshing);
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Enabled), 5, 0), !bGXsfl_12_Refreshing);
      edtavEva_mnupgmtxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEva_mnupgmtxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEva_mnupgmtxt_Enabled), 5, 0), true);
      edtavOk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOk_Enabled), 5, 0), true);
      chkavIsauthorized.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavIsauthorized.getInternalname(), "Enabled", GXutil.ltrimstr( chkavIsauthorized.getEnabled(), 5, 0), true);
   }

   public void rf25Q2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(12) ;
      /* Execute user event: Refresh */
      e1625Q2 ();
      nGXsfl_12_idx = 1 ;
      sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_122( ) ;
      bGXsfl_12_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_122( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV75Testmenuds_2_tfmnuid_sel ,
                                              AV74Testmenuds_1_tfmnuid ,
                                              Byte.valueOf(AV76Testmenuds_3_tfmnuop) ,
                                              Byte.valueOf(AV77Testmenuds_4_tfmnuop_to) ,
                                              AV79Testmenuds_6_tfmnupgmtpo_sel ,
                                              AV78Testmenuds_5_tfmnupgmtpo ,
                                              AV81Testmenuds_8_tfmnutxt_sel ,
                                              AV80Testmenuds_7_tfmnutxt ,
                                              AV83Testmenuds_10_tfmnupgmtxt_sel ,
                                              AV82Testmenuds_9_tfmnupgmtxt ,
                                              AV85Testmenuds_12_tfmnupgm_sel ,
                                              AV84Testmenuds_11_tfmnupgm ,
                                              AV87Testmenuds_14_tfmnupgmweb_sel ,
                                              AV86Testmenuds_13_tfmnupgmweb ,
                                              A945MnuId ,
                                              Byte.valueOf(A946MnuOp) ,
                                              A948MnuPgmTpo ,
                                              A951MnuTxt ,
                                              A949MnuPgmTxt ,
                                              A947MnuPgm ,
                                              A14286MnuPgmWeb ,
                                              Short.valueOf(AV34OrderedBy) ,
                                              Boolean.valueOf(AV36OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV74Testmenuds_1_tfmnuid = GXutil.padr( GXutil.rtrim( AV74Testmenuds_1_tfmnuid), 8, "%") ;
         lV78Testmenuds_5_tfmnupgmtpo = GXutil.padr( GXutil.rtrim( AV78Testmenuds_5_tfmnupgmtpo), 1, "%") ;
         lV80Testmenuds_7_tfmnutxt = GXutil.padr( GXutil.rtrim( AV80Testmenuds_7_tfmnutxt), 30, "%") ;
         lV82Testmenuds_9_tfmnupgmtxt = GXutil.padr( GXutil.rtrim( AV82Testmenuds_9_tfmnupgmtxt), 30, "%") ;
         lV84Testmenuds_11_tfmnupgm = GXutil.padr( GXutil.rtrim( AV84Testmenuds_11_tfmnupgm), 8, "%") ;
         lV86Testmenuds_13_tfmnupgmweb = GXutil.concat( GXutil.rtrim( AV86Testmenuds_13_tfmnupgmweb), "%", "") ;
         /* Using cursor H025Q2 */
         pr_default.execute(0, new Object[] {lV74Testmenuds_1_tfmnuid, AV75Testmenuds_2_tfmnuid_sel, Byte.valueOf(AV76Testmenuds_3_tfmnuop), Byte.valueOf(AV77Testmenuds_4_tfmnuop_to), lV78Testmenuds_5_tfmnupgmtpo, AV79Testmenuds_6_tfmnupgmtpo_sel, lV80Testmenuds_7_tfmnutxt, AV81Testmenuds_8_tfmnutxt_sel, lV82Testmenuds_9_tfmnupgmtxt, AV83Testmenuds_10_tfmnupgmtxt_sel, lV84Testmenuds_11_tfmnupgm, AV85Testmenuds_12_tfmnupgm_sel, lV86Testmenuds_13_tfmnupgmweb, AV87Testmenuds_14_tfmnupgmweb_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_12_idx = 1 ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_122( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14286MnuPgmWeb = H025Q2_A14286MnuPgmWeb[0] ;
            A947MnuPgm = H025Q2_A947MnuPgm[0] ;
            A949MnuPgmTxt = H025Q2_A949MnuPgmTxt[0] ;
            A951MnuTxt = H025Q2_A951MnuTxt[0] ;
            n951MnuTxt = H025Q2_n951MnuTxt[0] ;
            A948MnuPgmTpo = H025Q2_A948MnuPgmTpo[0] ;
            A946MnuOp = H025Q2_A946MnuOp[0] ;
            A945MnuId = H025Q2_A945MnuId[0] ;
            A951MnuTxt = H025Q2_A951MnuTxt[0] ;
            n951MnuTxt = H025Q2_n951MnuTxt[0] ;
            e1725Q2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(12) ;
         wb25Q0( ) ;
      }
      bGXsfl_12_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes25Q2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV91Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV91Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MNUID"+"_"+sGXsfl_12_idx, getSecureSignedToken( sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A945MnuId, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MNUOP"+"_"+sGXsfl_12_idx, getSecureSignedToken( sGXsfl_12_idx, localUtil.format( DecimalUtil.doubleToDec(A946MnuOp), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MNUPGM"+"_"+sGXsfl_12_idx, getSecureSignedToken( sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A947MnuPgm, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MNUPGMWEB"+"_"+sGXsfl_12_idx, getSecureSignedToken( sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A14286MnuPgmWeb, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MNUPGMTXT"+"_"+sGXsfl_12_idx, getSecureSignedToken( sGXsfl_12_idx, GXutil.rtrim( localUtil.format( A949MnuPgmTxt, ""))));
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
      AV74Testmenuds_1_tfmnuid = AV39TFMnuId ;
      AV75Testmenuds_2_tfmnuid_sel = AV40TFMnuId_Sel ;
      AV76Testmenuds_3_tfmnuop = AV41TFMnuOp ;
      AV77Testmenuds_4_tfmnuop_to = AV42TFMnuOp_To ;
      AV78Testmenuds_5_tfmnupgmtpo = AV45TFMnuPgmTpo ;
      AV79Testmenuds_6_tfmnupgmtpo_sel = AV46TFMnuPgmTpo_Sel ;
      AV80Testmenuds_7_tfmnutxt = AV51TFMnuTxt ;
      AV81Testmenuds_8_tfmnutxt_sel = AV52TFMnuTxt_Sel ;
      AV82Testmenuds_9_tfmnupgmtxt = AV47TFMnuPgmTxt ;
      AV83Testmenuds_10_tfmnupgmtxt_sel = AV48TFMnuPgmTxt_Sel ;
      AV84Testmenuds_11_tfmnupgm = AV43TFMnuPgm ;
      AV85Testmenuds_12_tfmnupgm_sel = AV44TFMnuPgm_Sel ;
      AV86Testmenuds_13_tfmnupgmweb = AV49TFMnuPgmWeb ;
      AV87Testmenuds_14_tfmnupgmweb_sel = AV50TFMnuPgmWeb_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV75Testmenuds_2_tfmnuid_sel ,
                                           AV74Testmenuds_1_tfmnuid ,
                                           Byte.valueOf(AV76Testmenuds_3_tfmnuop) ,
                                           Byte.valueOf(AV77Testmenuds_4_tfmnuop_to) ,
                                           AV79Testmenuds_6_tfmnupgmtpo_sel ,
                                           AV78Testmenuds_5_tfmnupgmtpo ,
                                           AV81Testmenuds_8_tfmnutxt_sel ,
                                           AV80Testmenuds_7_tfmnutxt ,
                                           AV83Testmenuds_10_tfmnupgmtxt_sel ,
                                           AV82Testmenuds_9_tfmnupgmtxt ,
                                           AV85Testmenuds_12_tfmnupgm_sel ,
                                           AV84Testmenuds_11_tfmnupgm ,
                                           AV87Testmenuds_14_tfmnupgmweb_sel ,
                                           AV86Testmenuds_13_tfmnupgmweb ,
                                           A945MnuId ,
                                           Byte.valueOf(A946MnuOp) ,
                                           A948MnuPgmTpo ,
                                           A951MnuTxt ,
                                           A949MnuPgmTxt ,
                                           A947MnuPgm ,
                                           A14286MnuPgmWeb ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV36OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV74Testmenuds_1_tfmnuid = GXutil.padr( GXutil.rtrim( AV74Testmenuds_1_tfmnuid), 8, "%") ;
      lV78Testmenuds_5_tfmnupgmtpo = GXutil.padr( GXutil.rtrim( AV78Testmenuds_5_tfmnupgmtpo), 1, "%") ;
      lV80Testmenuds_7_tfmnutxt = GXutil.padr( GXutil.rtrim( AV80Testmenuds_7_tfmnutxt), 30, "%") ;
      lV82Testmenuds_9_tfmnupgmtxt = GXutil.padr( GXutil.rtrim( AV82Testmenuds_9_tfmnupgmtxt), 30, "%") ;
      lV84Testmenuds_11_tfmnupgm = GXutil.padr( GXutil.rtrim( AV84Testmenuds_11_tfmnupgm), 8, "%") ;
      lV86Testmenuds_13_tfmnupgmweb = GXutil.concat( GXutil.rtrim( AV86Testmenuds_13_tfmnupgmweb), "%", "") ;
      /* Using cursor H025Q3 */
      pr_default.execute(1, new Object[] {lV74Testmenuds_1_tfmnuid, AV75Testmenuds_2_tfmnuid_sel, Byte.valueOf(AV76Testmenuds_3_tfmnuop), Byte.valueOf(AV77Testmenuds_4_tfmnuop_to), lV78Testmenuds_5_tfmnupgmtpo, AV79Testmenuds_6_tfmnupgmtpo_sel, lV80Testmenuds_7_tfmnutxt, AV81Testmenuds_8_tfmnutxt_sel, lV82Testmenuds_9_tfmnupgmtxt, AV83Testmenuds_10_tfmnupgmtxt_sel, lV84Testmenuds_11_tfmnupgm, AV85Testmenuds_12_tfmnupgm_sel, lV86Testmenuds_13_tfmnupgmweb, AV87Testmenuds_14_tfmnupgmweb_sel});
      GRID_nRecordCount = H025Q3_AGRID_nRecordCount[0] ;
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
      AV74Testmenuds_1_tfmnuid = AV39TFMnuId ;
      AV75Testmenuds_2_tfmnuid_sel = AV40TFMnuId_Sel ;
      AV76Testmenuds_3_tfmnuop = AV41TFMnuOp ;
      AV77Testmenuds_4_tfmnuop_to = AV42TFMnuOp_To ;
      AV78Testmenuds_5_tfmnupgmtpo = AV45TFMnuPgmTpo ;
      AV79Testmenuds_6_tfmnupgmtpo_sel = AV46TFMnuPgmTpo_Sel ;
      AV80Testmenuds_7_tfmnutxt = AV51TFMnuTxt ;
      AV81Testmenuds_8_tfmnutxt_sel = AV52TFMnuTxt_Sel ;
      AV82Testmenuds_9_tfmnupgmtxt = AV47TFMnuPgmTxt ;
      AV83Testmenuds_10_tfmnupgmtxt_sel = AV48TFMnuPgmTxt_Sel ;
      AV84Testmenuds_11_tfmnupgm = AV43TFMnuPgm ;
      AV85Testmenuds_12_tfmnupgm_sel = AV44TFMnuPgm_Sel ;
      AV86Testmenuds_13_tfmnupgmweb = AV49TFMnuPgmWeb ;
      AV87Testmenuds_14_tfmnupgmweb_sel = AV50TFMnuPgmWeb_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV58EditableGrid_Mode, AV39TFMnuId, AV40TFMnuId_Sel, AV41TFMnuOp, AV42TFMnuOp_To, AV45TFMnuPgmTpo, AV46TFMnuPgmTpo_Sel, AV51TFMnuTxt, AV52TFMnuTxt_Sel, AV47TFMnuPgmTxt, AV48TFMnuPgmTxt_Sel, AV43TFMnuPgm, AV44TFMnuPgm_Sel, AV49TFMnuPgmWeb, AV50TFMnuPgmWeb_Sel, AV91Pgmname, AV34OrderedBy, AV36OrderedDsc, AV63MnuId_SelectedLine, AV64MnuOp_SelectedLine, AV24IsAuthorized) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV74Testmenuds_1_tfmnuid = AV39TFMnuId ;
      AV75Testmenuds_2_tfmnuid_sel = AV40TFMnuId_Sel ;
      AV76Testmenuds_3_tfmnuop = AV41TFMnuOp ;
      AV77Testmenuds_4_tfmnuop_to = AV42TFMnuOp_To ;
      AV78Testmenuds_5_tfmnupgmtpo = AV45TFMnuPgmTpo ;
      AV79Testmenuds_6_tfmnupgmtpo_sel = AV46TFMnuPgmTpo_Sel ;
      AV80Testmenuds_7_tfmnutxt = AV51TFMnuTxt ;
      AV81Testmenuds_8_tfmnutxt_sel = AV52TFMnuTxt_Sel ;
      AV82Testmenuds_9_tfmnupgmtxt = AV47TFMnuPgmTxt ;
      AV83Testmenuds_10_tfmnupgmtxt_sel = AV48TFMnuPgmTxt_Sel ;
      AV84Testmenuds_11_tfmnupgm = AV43TFMnuPgm ;
      AV85Testmenuds_12_tfmnupgm_sel = AV44TFMnuPgm_Sel ;
      AV86Testmenuds_13_tfmnupgmweb = AV49TFMnuPgmWeb ;
      AV87Testmenuds_14_tfmnupgmweb_sel = AV50TFMnuPgmWeb_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58EditableGrid_Mode, AV39TFMnuId, AV40TFMnuId_Sel, AV41TFMnuOp, AV42TFMnuOp_To, AV45TFMnuPgmTpo, AV46TFMnuPgmTpo_Sel, AV51TFMnuTxt, AV52TFMnuTxt_Sel, AV47TFMnuPgmTxt, AV48TFMnuPgmTxt_Sel, AV43TFMnuPgm, AV44TFMnuPgm_Sel, AV49TFMnuPgmWeb, AV50TFMnuPgmWeb_Sel, AV91Pgmname, AV34OrderedBy, AV36OrderedDsc, AV63MnuId_SelectedLine, AV64MnuOp_SelectedLine, AV24IsAuthorized) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV74Testmenuds_1_tfmnuid = AV39TFMnuId ;
      AV75Testmenuds_2_tfmnuid_sel = AV40TFMnuId_Sel ;
      AV76Testmenuds_3_tfmnuop = AV41TFMnuOp ;
      AV77Testmenuds_4_tfmnuop_to = AV42TFMnuOp_To ;
      AV78Testmenuds_5_tfmnupgmtpo = AV45TFMnuPgmTpo ;
      AV79Testmenuds_6_tfmnupgmtpo_sel = AV46TFMnuPgmTpo_Sel ;
      AV80Testmenuds_7_tfmnutxt = AV51TFMnuTxt ;
      AV81Testmenuds_8_tfmnutxt_sel = AV52TFMnuTxt_Sel ;
      AV82Testmenuds_9_tfmnupgmtxt = AV47TFMnuPgmTxt ;
      AV83Testmenuds_10_tfmnupgmtxt_sel = AV48TFMnuPgmTxt_Sel ;
      AV84Testmenuds_11_tfmnupgm = AV43TFMnuPgm ;
      AV85Testmenuds_12_tfmnupgm_sel = AV44TFMnuPgm_Sel ;
      AV86Testmenuds_13_tfmnupgmweb = AV49TFMnuPgmWeb ;
      AV87Testmenuds_14_tfmnupgmweb_sel = AV50TFMnuPgmWeb_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58EditableGrid_Mode, AV39TFMnuId, AV40TFMnuId_Sel, AV41TFMnuOp, AV42TFMnuOp_To, AV45TFMnuPgmTpo, AV46TFMnuPgmTpo_Sel, AV51TFMnuTxt, AV52TFMnuTxt_Sel, AV47TFMnuPgmTxt, AV48TFMnuPgmTxt_Sel, AV43TFMnuPgm, AV44TFMnuPgm_Sel, AV49TFMnuPgmWeb, AV50TFMnuPgmWeb_Sel, AV91Pgmname, AV34OrderedBy, AV36OrderedDsc, AV63MnuId_SelectedLine, AV64MnuOp_SelectedLine, AV24IsAuthorized) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV74Testmenuds_1_tfmnuid = AV39TFMnuId ;
      AV75Testmenuds_2_tfmnuid_sel = AV40TFMnuId_Sel ;
      AV76Testmenuds_3_tfmnuop = AV41TFMnuOp ;
      AV77Testmenuds_4_tfmnuop_to = AV42TFMnuOp_To ;
      AV78Testmenuds_5_tfmnupgmtpo = AV45TFMnuPgmTpo ;
      AV79Testmenuds_6_tfmnupgmtpo_sel = AV46TFMnuPgmTpo_Sel ;
      AV80Testmenuds_7_tfmnutxt = AV51TFMnuTxt ;
      AV81Testmenuds_8_tfmnutxt_sel = AV52TFMnuTxt_Sel ;
      AV82Testmenuds_9_tfmnupgmtxt = AV47TFMnuPgmTxt ;
      AV83Testmenuds_10_tfmnupgmtxt_sel = AV48TFMnuPgmTxt_Sel ;
      AV84Testmenuds_11_tfmnupgm = AV43TFMnuPgm ;
      AV85Testmenuds_12_tfmnupgm_sel = AV44TFMnuPgm_Sel ;
      AV86Testmenuds_13_tfmnupgmweb = AV49TFMnuPgmWeb ;
      AV87Testmenuds_14_tfmnupgmweb_sel = AV50TFMnuPgmWeb_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58EditableGrid_Mode, AV39TFMnuId, AV40TFMnuId_Sel, AV41TFMnuOp, AV42TFMnuOp_To, AV45TFMnuPgmTpo, AV46TFMnuPgmTpo_Sel, AV51TFMnuTxt, AV52TFMnuTxt_Sel, AV47TFMnuPgmTxt, AV48TFMnuPgmTxt_Sel, AV43TFMnuPgm, AV44TFMnuPgm_Sel, AV49TFMnuPgmWeb, AV50TFMnuPgmWeb_Sel, AV91Pgmname, AV34OrderedBy, AV36OrderedDsc, AV63MnuId_SelectedLine, AV64MnuOp_SelectedLine, AV24IsAuthorized) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV74Testmenuds_1_tfmnuid = AV39TFMnuId ;
      AV75Testmenuds_2_tfmnuid_sel = AV40TFMnuId_Sel ;
      AV76Testmenuds_3_tfmnuop = AV41TFMnuOp ;
      AV77Testmenuds_4_tfmnuop_to = AV42TFMnuOp_To ;
      AV78Testmenuds_5_tfmnupgmtpo = AV45TFMnuPgmTpo ;
      AV79Testmenuds_6_tfmnupgmtpo_sel = AV46TFMnuPgmTpo_Sel ;
      AV80Testmenuds_7_tfmnutxt = AV51TFMnuTxt ;
      AV81Testmenuds_8_tfmnutxt_sel = AV52TFMnuTxt_Sel ;
      AV82Testmenuds_9_tfmnupgmtxt = AV47TFMnuPgmTxt ;
      AV83Testmenuds_10_tfmnupgmtxt_sel = AV48TFMnuPgmTxt_Sel ;
      AV84Testmenuds_11_tfmnupgm = AV43TFMnuPgm ;
      AV85Testmenuds_12_tfmnupgm_sel = AV44TFMnuPgm_Sel ;
      AV86Testmenuds_13_tfmnupgmweb = AV49TFMnuPgmWeb ;
      AV87Testmenuds_14_tfmnupgmweb_sel = AV50TFMnuPgmWeb_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV58EditableGrid_Mode, AV39TFMnuId, AV40TFMnuId_Sel, AV41TFMnuOp, AV42TFMnuOp_To, AV45TFMnuPgmTpo, AV46TFMnuPgmTpo_Sel, AV51TFMnuTxt, AV52TFMnuTxt_Sel, AV47TFMnuPgmTxt, AV48TFMnuPgmTxt_Sel, AV43TFMnuPgm, AV44TFMnuPgm_Sel, AV49TFMnuPgmWeb, AV50TFMnuPgmWeb_Sel, AV91Pgmname, AV34OrderedBy, AV36OrderedDsc, AV63MnuId_SelectedLine, AV64MnuOp_SelectedLine, AV24IsAuthorized) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV91Pgmname = "TestMenu" ;
      Gx_err = (short)(0) ;
      edtavMnupgmtpo_editable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMnupgmtpo_editable_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMnupgmtpo_editable_Enabled), 5, 0), !bGXsfl_12_Refreshing);
      edtavMnupgmtxt_editable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMnupgmtxt_editable_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMnupgmtxt_editable_Enabled), 5, 0), !bGXsfl_12_Refreshing);
      edtavMnupgm_editable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMnupgm_editable_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMnupgm_editable_Enabled), 5, 0), !bGXsfl_12_Refreshing);
      edtavMnupgmweb_editable_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMnupgmweb_editable_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMnupgmweb_editable_Enabled), 5, 0), !bGXsfl_12_Refreshing);
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Enabled), 5, 0), !bGXsfl_12_Refreshing);
      edtavEva_mnupgmtxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEva_mnupgmtxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEva_mnupgmtxt_Enabled), 5, 0), true);
      edtavOk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOk_Enabled), 5, 0), true);
      chkavIsauthorized.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavIsauthorized.getInternalname(), "Enabled", GXutil.ltrimstr( chkavIsauthorized.getEnabled(), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup25Q0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1525Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV11DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_12 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_12"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV20GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvpanel_panelevaluar_Width = httpContext.cgiGet( "DVPANEL_PANELEVALUAR_Width") ;
         Dvpanel_panelevaluar_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELEVALUAR_Autowidth")) ;
         Dvpanel_panelevaluar_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELEVALUAR_Autoheight")) ;
         Dvpanel_panelevaluar_Cls = httpContext.cgiGet( "DVPANEL_PANELEVALUAR_Cls") ;
         Dvpanel_panelevaluar_Title = httpContext.cgiGet( "DVPANEL_PANELEVALUAR_Title") ;
         Dvpanel_panelevaluar_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELEVALUAR_Collapsible")) ;
         Dvpanel_panelevaluar_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELEVALUAR_Collapsed")) ;
         Dvpanel_panelevaluar_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELEVALUAR_Showcollapseicon")) ;
         Dvpanel_panelevaluar_Iconposition = httpContext.cgiGet( "DVPANEL_PANELEVALUAR_Iconposition") ;
         Dvpanel_panelevaluar_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELEVALUAR_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         AV12Eva_MnuId = GXutil.upper( httpContext.cgiGet( edtavEva_mnuid_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Eva_MnuId", AV12Eva_MnuId);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavEva_mnuop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavEva_mnuop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEVA_MNUOP");
            GX_FocusControl = edtavEva_mnuop_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Eva_MnuOp = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Eva_MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Eva_MnuOp), 2, 0));
         }
         else
         {
            AV13Eva_MnuOp = (byte)(localUtil.ctol( httpContext.cgiGet( edtavEva_mnuop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Eva_MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Eva_MnuOp), 2, 0));
         }
         AV14Eva_MnuPgm = GXutil.upper( httpContext.cgiGet( edtavEva_mnupgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Eva_MnuPgm", AV14Eva_MnuPgm);
         AV16Eva_MnuPgmWeb = httpContext.cgiGet( edtavEva_mnupgmweb_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Eva_MnuPgmWeb", AV16Eva_MnuPgmWeb);
         AV17Eva_UsurCod = GXutil.upper( httpContext.cgiGet( edtavEva_usurcod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Eva_UsurCod", AV17Eva_UsurCod);
         AV15Eva_MnuPgmTxt = httpContext.cgiGet( edtavEva_mnupgmtxt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Eva_MnuPgmTxt", AV15Eva_MnuPgmTxt);
         AV33Ok = httpContext.cgiGet( edtavOk_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Ok", AV33Ok);
         AV24IsAuthorized = GXutil.strtobool( httpContext.cgiGet( chkavIsauthorized.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24IsAuthorized", AV24IsAuthorized);
         /* Read subfile selected row values. */
         nGXsfl_12_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_122( ) ;
         if ( nGXsfl_12_idx > 0 )
         {
            AV69EditableGridCancel = httpContext.cgiGet( edtavEditablegridcancel_Internalname) ;
            A945MnuId = GXutil.upper( httpContext.cgiGet( edtMnuId_Internalname)) ;
            A946MnuOp = (byte)(localUtil.ctol( httpContext.cgiGet( edtMnuOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV65MnuPgmTpo_Editable = GXutil.upper( httpContext.cgiGet( edtavMnupgmtpo_editable_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMnupgmtpo_editable_Internalname, AV65MnuPgmTpo_Editable);
            A948MnuPgmTpo = GXutil.upper( httpContext.cgiGet( edtMnuPgmTpo_Internalname)) ;
            A951MnuTxt = httpContext.cgiGet( edtMnuTxt_Internalname) ;
            n951MnuTxt = false ;
            AV66MnuPgmTxt_Editable = httpContext.cgiGet( edtavMnupgmtxt_editable_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMnupgmtxt_editable_Internalname, AV66MnuPgmTxt_Editable);
            A949MnuPgmTxt = httpContext.cgiGet( edtMnuPgmTxt_Internalname) ;
            AV67MnuPgm_Editable = GXutil.upper( httpContext.cgiGet( edtavMnupgm_editable_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMnupgm_editable_Internalname, AV67MnuPgm_Editable);
            A947MnuPgm = GXutil.upper( httpContext.cgiGet( edtMnuPgm_Internalname)) ;
            AV68MnuPgmWeb_Editable = httpContext.cgiGet( edtavMnupgmweb_editable_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMnupgmweb_editable_Internalname, AV68MnuPgmWeb_Editable);
            A14286MnuPgmWeb = httpContext.cgiGet( edtMnuPgmWeb_Internalname) ;
            AV70Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavUpdate_Internalname, AV70Update);
            AV71EditableGridConfirm = httpContext.cgiGet( edtavEditablegridconfirm_Internalname) ;
         }
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
      e1525Q2 ();
      if (returnInSub) return;
   }

   public void e1525Q2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      testmenu_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      testmenu_impl.this.AV5EmprCod = GXv_char2[0] ;
      testmenu_impl.this.AV6EmprNom = GXv_char3[0] ;
      testmenu_impl.this.AV56UsurCod = GXv_char4[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " TMENUNIVEL1", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV34OrderedBy < 1 )
      {
         AV34OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV11DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV11DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      subGrid_Rows = 5 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void e1625Q2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV57WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV57WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV58EditableGrid_Mode)==0) )
      {
         AV58EditableGrid_Mode = "TrnMode.Display" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58EditableGrid_Mode", AV58EditableGrid_Mode);
      }
      AV19GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
      AV20GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridPageCount), 10, 0));
      edtavUpdate_Visible = (((GXutil.strcmp(AV58EditableGrid_Mode, "TrnMode.Display")==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Visible), 5, 0), !bGXsfl_12_Refreshing);
      edtavEditablegridcancel_Visible = (((GXutil.strcmp(AV58EditableGrid_Mode, "TrnMode.Display")!=0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEditablegridcancel_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEditablegridcancel_Visible), 5, 0), !bGXsfl_12_Refreshing);
      edtavEditablegridconfirm_Visible = (((GXutil.strcmp(AV58EditableGrid_Mode, "TrnMode.Display")!=0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEditablegridconfirm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEditablegridconfirm_Visible), 5, 0), !bGXsfl_12_Refreshing);
      AV74Testmenuds_1_tfmnuid = AV39TFMnuId ;
      AV75Testmenuds_2_tfmnuid_sel = AV40TFMnuId_Sel ;
      AV76Testmenuds_3_tfmnuop = AV41TFMnuOp ;
      AV77Testmenuds_4_tfmnuop_to = AV42TFMnuOp_To ;
      AV78Testmenuds_5_tfmnupgmtpo = AV45TFMnuPgmTpo ;
      AV79Testmenuds_6_tfmnupgmtpo_sel = AV46TFMnuPgmTpo_Sel ;
      AV80Testmenuds_7_tfmnutxt = AV51TFMnuTxt ;
      AV81Testmenuds_8_tfmnutxt_sel = AV52TFMnuTxt_Sel ;
      AV82Testmenuds_9_tfmnupgmtxt = AV47TFMnuPgmTxt ;
      AV83Testmenuds_10_tfmnupgmtxt_sel = AV48TFMnuPgmTxt_Sel ;
      AV84Testmenuds_11_tfmnupgm = AV43TFMnuPgm ;
      AV85Testmenuds_12_tfmnupgm_sel = AV44TFMnuPgm_Sel ;
      AV86Testmenuds_13_tfmnupgmweb = AV49TFMnuPgmWeb ;
      AV87Testmenuds_14_tfmnupgmweb_sel = AV50TFMnuPgmWeb_Sel ;
      /*  Sending Event outputs  */
   }

   public void e1125Q2( )
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
         AV37PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV37PageToGo) ;
      }
   }

   public void e1225Q2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1325Q2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV34OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         AV36OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36OrderedDsc", AV36OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MnuId") == 0 )
         {
            AV39TFMnuId = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFMnuId", AV39TFMnuId);
            AV40TFMnuId_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFMnuId_Sel", AV40TFMnuId_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MnuOp") == 0 )
         {
            AV41TFMnuOp = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFMnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMnuOp), 2, 0));
            AV42TFMnuOp_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMnuOp_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMnuOp_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MnuPgmTpo") == 0 )
         {
            AV45TFMnuPgmTpo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFMnuPgmTpo", AV45TFMnuPgmTpo);
            AV46TFMnuPgmTpo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFMnuPgmTpo_Sel", AV46TFMnuPgmTpo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MnuTxt") == 0 )
         {
            AV51TFMnuTxt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFMnuTxt", AV51TFMnuTxt);
            AV52TFMnuTxt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFMnuTxt_Sel", AV52TFMnuTxt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MnuPgmTxt") == 0 )
         {
            AV47TFMnuPgmTxt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFMnuPgmTxt", AV47TFMnuPgmTxt);
            AV48TFMnuPgmTxt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFMnuPgmTxt_Sel", AV48TFMnuPgmTxt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MnuPgm") == 0 )
         {
            AV43TFMnuPgm = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMnuPgm", AV43TFMnuPgm);
            AV44TFMnuPgm_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFMnuPgm_Sel", AV44TFMnuPgm_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MnuPgmWeb") == 0 )
         {
            AV49TFMnuPgmWeb = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMnuPgmWeb", AV49TFMnuPgmWeb);
            AV50TFMnuPgmWeb_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFMnuPgmWeb_Sel", AV50TFMnuPgmWeb_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1725Q2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      edtavEditablegridcancel_gximage = "ActionCancel" ;
      AV69EditableGridCancel = context.getHttpContext().getImagePath( "f454b006-8fb2-471d-b379-a84a77f89118", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavEditablegridcancel_Internalname, AV69EditableGridCancel);
      AV88Editablegridcancel_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f454b006-8fb2-471d-b379-a84a77f89118", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      edtavEditablegridcancel_Tooltiptext = httpContext.getMessage( "GX_BtnCancel", "") ;
      AV70Update = "<i class=\"fa fa-pen\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavUpdate_Internalname, AV70Update);
      edtavEditablegridconfirm_gximage = "SelectRow" ;
      AV71EditableGridConfirm = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavEditablegridconfirm_Internalname, AV71EditableGridConfirm);
      AV89Editablegridconfirm_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      edtavEditablegridconfirm_Tooltiptext = httpContext.getMessage( "GX_BtnEnter", "") ;
      AV65MnuPgmTpo_Editable = A948MnuPgmTpo ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMnupgmtpo_editable_Internalname, AV65MnuPgmTpo_Editable);
      AV66MnuPgmTxt_Editable = A949MnuPgmTxt ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMnupgmtxt_editable_Internalname, AV66MnuPgmTxt_Editable);
      AV67MnuPgm_Editable = A947MnuPgm ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMnupgm_editable_Internalname, AV67MnuPgm_Editable);
      AV68MnuPgmWeb_Editable = A14286MnuPgmWeb ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMnupgmweb_editable_Internalname, AV68MnuPgmWeb_Editable);
      if ( GXutil.strcmp(AV58EditableGrid_Mode, "TrnMode.Display") != 0 )
      {
         AV61IsCurrentRecordSelected = false ;
         if ( ( GXutil.strcmp(AV58EditableGrid_Mode, "TrnMode.Insert") != 0 ) && ( GXutil.strcmp(AV63MnuId_SelectedLine, A945MnuId) == 0 ) && ( AV64MnuOp_SelectedLine == A946MnuOp ) )
         {
            AV61IsCurrentRecordSelected = true ;
         }
         edtavMnupgmtpo_editable_Enabled = (AV61IsCurrentRecordSelected ? 1 : 0) ;
         edtavMnupgmtxt_editable_Enabled = (AV61IsCurrentRecordSelected ? 1 : 0) ;
         edtavMnupgm_editable_Enabled = (AV61IsCurrentRecordSelected ? 1 : 0) ;
         edtavMnupgmweb_editable_Enabled = (AV61IsCurrentRecordSelected ? 1 : 0) ;
         edtavEditablegridcancel_Class = (AV61IsCurrentRecordSelected ? "DeleteAttribute ActionBaseColorAttribute" : "Invisible") ;
         edtavEditablegridconfirm_Class = (AV61IsCurrentRecordSelected ? "SelectAttribute ActionBaseColorAttribute" : "Invisible") ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(12) ;
      }
      sendrow_122( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_12_Refreshing )
      {
         httpContext.doAjaxLoad(12, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1825Q2( )
   {
      /* Update_Click Routine */
      returnInSub = false ;
      AV63MnuId_SelectedLine = A945MnuId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63MnuId_SelectedLine", AV63MnuId_SelectedLine);
      AV64MnuOp_SelectedLine = A946MnuOp ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64MnuOp_SelectedLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64MnuOp_SelectedLine), 2, 0));
      AV58EditableGrid_Mode = "TrnMode.Update" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58EditableGrid_Mode", AV58EditableGrid_Mode);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e1925Q2( )
   {
      /* 'EditableGridConfirm' Routine */
      returnInSub = false ;
      AV62TMENUNIVEL1EditableGrid.Load(A945MnuId, A946MnuOp);
      AV60Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle) ;
      if ( AV62TMENUNIVEL1EditableGrid.Success() )
      {
         if ( GXutil.strcmp(AV58EditableGrid_Mode, "TrnMode.Delete") != 0 )
         {
            AV62TMENUNIVEL1EditableGrid.setgxTv_SdtTMENUNIVEL1_Mnupgmtpo( AV65MnuPgmTpo_Editable );
            AV62TMENUNIVEL1EditableGrid.setgxTv_SdtTMENUNIVEL1_Mnupgmtxt( AV66MnuPgmTxt_Editable );
            AV62TMENUNIVEL1EditableGrid.setgxTv_SdtTMENUNIVEL1_Mnupgm( AV67MnuPgm_Editable );
            AV62TMENUNIVEL1EditableGrid.setgxTv_SdtTMENUNIVEL1_Mnupgmweb( AV68MnuPgmWeb_Editable );
            AV62TMENUNIVEL1EditableGrid.Save();
         }
         if ( AV62TMENUNIVEL1EditableGrid.Success() )
         {
            AV58EditableGrid_Mode = "TrnMode.Display" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58EditableGrid_Mode", AV58EditableGrid_Mode);
            AV63MnuId_SelectedLine = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63MnuId_SelectedLine", AV63MnuId_SelectedLine);
            AV64MnuOp_SelectedLine = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64MnuOp_SelectedLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64MnuOp_SelectedLine), 2, 0));
            Application.commitDataStores(context, remoteHandle, pr_default, "testmenu");
            httpContext.doAjaxRefresh();
         }
         else
         {
            AV60Messages = AV62TMENUNIVEL1EditableGrid.GetMessages() ;
         }
      }
      else
      {
         AV60Messages = AV62TMENUNIVEL1EditableGrid.GetMessages() ;
      }
      if ( AV60Messages.size() > 0 )
      {
         AV63MnuId_SelectedLine = A945MnuId ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MnuId_SelectedLine", AV63MnuId_SelectedLine);
         AV64MnuOp_SelectedLine = A946MnuOp ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64MnuOp_SelectedLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64MnuOp_SelectedLine), 2, 0));
         /* Execute user subroutine: 'SHOW MESSAGES' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60Messages", AV60Messages);
   }

   public void e2025Q2( )
   {
      /* 'EditableGridCancel' Routine */
      returnInSub = false ;
      AV63MnuId_SelectedLine = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63MnuId_SelectedLine", AV63MnuId_SelectedLine);
      AV64MnuOp_SelectedLine = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64MnuOp_SelectedLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64MnuOp_SelectedLine), 2, 0));
      AV58EditableGrid_Mode = "TrnMode.Display" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58EditableGrid_Mode", AV58EditableGrid_Mode);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e1425Q2( )
   {
      /* 'DoEvaluarPermiso' Routine */
      returnInSub = false ;
      GXt_char1 = AV33Ok ;
      GXv_char4[0] = AV12Eva_MnuId ;
      GXv_int8[0] = AV13Eva_MnuOp ;
      GXv_char3[0] = AV17Eva_UsurCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppermisos(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      testmenu_impl.this.AV12Eva_MnuId = GXv_char4[0] ;
      testmenu_impl.this.AV13Eva_MnuOp = GXv_int8[0] ;
      testmenu_impl.this.AV17Eva_UsurCod = GXv_char3[0] ;
      testmenu_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Eva_MnuId", AV12Eva_MnuId);
      httpContext.ajax_rsp_assign_attri("", false, "AV13Eva_MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Eva_MnuOp), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Eva_UsurCod", AV17Eva_UsurCod);
      AV33Ok = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Ok", AV33Ok);
      GXt_boolean9 = AV24IsAuthorized ;
      GXv_boolean10[0] = GXt_boolean9 ;
      new app.permisos_texplus_web(remoteHandle, context).execute( AV16Eva_MnuPgmWeb, AV17Eva_UsurCod, GXv_boolean10) ;
      testmenu_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
      AV24IsAuthorized = GXt_boolean9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24IsAuthorized", AV24IsAuthorized);
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV34OrderedBy, 4, 0))+":"+(AV36OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'SHOW MESSAGES' Routine */
      returnInSub = false ;
      AV90GXV1 = 1 ;
      while ( AV90GXV1 <= AV60Messages.size() )
      {
         AV59Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV60Messages.elementAt(-1+AV90GXV1));
         httpContext.GX_msglist.addItem(AV59Message.getgxTv_SdtMessages_Message_Description());
         AV90GXV1 = (int)(AV90GXV1+1) ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV38Session.getValue(AV91Pgmname+"GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV91Pgmname+"GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV38Session.getValue(AV91Pgmname+"GridState"), null, null);
      }
      AV34OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
      AV36OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OrderedDsc", AV36OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV92GXV2 = 1 ;
      while ( AV92GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUID") == 0 )
         {
            AV39TFMnuId = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFMnuId", AV39TFMnuId);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUID_SEL") == 0 )
         {
            AV40TFMnuId_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFMnuId_Sel", AV40TFMnuId_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUOP") == 0 )
         {
            AV41TFMnuOp = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFMnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMnuOp), 2, 0));
            AV42TFMnuOp_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMnuOp_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMnuOp_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMTPO") == 0 )
         {
            AV45TFMnuPgmTpo = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFMnuPgmTpo", AV45TFMnuPgmTpo);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMTPO_SEL") == 0 )
         {
            AV46TFMnuPgmTpo_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFMnuPgmTpo_Sel", AV46TFMnuPgmTpo_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUTXT") == 0 )
         {
            AV51TFMnuTxt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFMnuTxt", AV51TFMnuTxt);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUTXT_SEL") == 0 )
         {
            AV52TFMnuTxt_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFMnuTxt_Sel", AV52TFMnuTxt_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMTXT") == 0 )
         {
            AV47TFMnuPgmTxt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFMnuPgmTxt", AV47TFMnuPgmTxt);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMTXT_SEL") == 0 )
         {
            AV48TFMnuPgmTxt_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFMnuPgmTxt_Sel", AV48TFMnuPgmTxt_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGM") == 0 )
         {
            AV43TFMnuPgm = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMnuPgm", AV43TFMnuPgm);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGM_SEL") == 0 )
         {
            AV44TFMnuPgm_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFMnuPgm_Sel", AV44TFMnuPgm_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMWEB") == 0 )
         {
            AV49TFMnuPgmWeb = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMnuPgmWeb", AV49TFMnuPgmWeb);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMNUPGMWEB_SEL") == 0 )
         {
            AV50TFMnuPgmWeb_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFMnuPgmWeb_Sel", AV50TFMnuPgmWeb_Sel);
         }
         AV92GXV2 = (int)(AV92GXV2+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFMnuId_Sel)==0), AV40TFMnuId_Sel, GXv_char4) ;
      testmenu_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char11 = "" ;
      GXv_char3[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFMnuPgmTpo_Sel)==0), AV46TFMnuPgmTpo_Sel, GXv_char3) ;
      testmenu_impl.this.GXt_char11 = GXv_char3[0] ;
      GXt_char12 = "" ;
      GXv_char2[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFMnuTxt_Sel)==0), AV52TFMnuTxt_Sel, GXv_char2) ;
      testmenu_impl.this.GXt_char12 = GXv_char2[0] ;
      GXt_char13 = "" ;
      GXv_char14[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFMnuPgmTxt_Sel)==0), AV48TFMnuPgmTxt_Sel, GXv_char14) ;
      testmenu_impl.this.GXt_char13 = GXv_char14[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFMnuPgm_Sel)==0), AV44TFMnuPgm_Sel, GXv_char16) ;
      testmenu_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFMnuPgmWeb_Sel)==0), AV50TFMnuPgmWeb_Sel, GXv_char18) ;
      testmenu_impl.this.GXt_char17 = GXv_char18[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char11+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char15+"|"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFMnuId)==0), AV39TFMnuId, GXv_char18) ;
      testmenu_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFMnuPgmTpo)==0), AV45TFMnuPgmTpo, GXv_char16) ;
      testmenu_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char13 = "" ;
      GXv_char14[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFMnuTxt)==0), AV51TFMnuTxt, GXv_char14) ;
      testmenu_impl.this.GXt_char13 = GXv_char14[0] ;
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFMnuPgmTxt)==0), AV47TFMnuPgmTxt, GXv_char4) ;
      testmenu_impl.this.GXt_char12 = GXv_char4[0] ;
      GXt_char11 = "" ;
      GXv_char3[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFMnuPgm)==0), AV43TFMnuPgm, GXv_char3) ;
      testmenu_impl.this.GXt_char11 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFMnuPgmWeb)==0), AV49TFMnuPgmWeb, GXv_char2) ;
      testmenu_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char17+"|"+((0==AV41TFMnuOp) ? "" : GXutil.str( AV41TFMnuOp, 2, 0))+"|"+GXt_char15+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char11+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV42TFMnuOp_To) ? "" : GXutil.str( AV42TFMnuOp_To, 2, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV21GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV21GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV21GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV21GridState.fromxml(AV38Session.getValue(AV91Pgmname+"GridState"), null, null);
      AV21GridState.setgxTv_SdtWWPGridState_Orderedby( AV34OrderedBy );
      AV21GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV36OrderedDsc );
      AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState19[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMNUID", "", !(GXutil.strcmp("", AV39TFMnuId)==0), (short)(0), AV39TFMnuId, "", !(GXutil.strcmp("", AV40TFMnuId_Sel)==0), AV40TFMnuId_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMNUOP", "", !((0==AV41TFMnuOp)&&(0==AV42TFMnuOp_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFMnuOp, 2, 0)), GXutil.trim( GXutil.str( AV42TFMnuOp_To, 2, 0))) ;
      AV21GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMNUPGMTPO", "", !(GXutil.strcmp("", AV45TFMnuPgmTpo)==0), (short)(0), AV45TFMnuPgmTpo, "", !(GXutil.strcmp("", AV46TFMnuPgmTpo_Sel)==0), AV46TFMnuPgmTpo_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMNUTXT", "", !(GXutil.strcmp("", AV51TFMnuTxt)==0), (short)(0), AV51TFMnuTxt, "", !(GXutil.strcmp("", AV52TFMnuTxt_Sel)==0), AV52TFMnuTxt_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMNUPGMTXT", "", !(GXutil.strcmp("", AV47TFMnuPgmTxt)==0), (short)(0), AV47TFMnuPgmTxt, "", !(GXutil.strcmp("", AV48TFMnuPgmTxt_Sel)==0), AV48TFMnuPgmTxt_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMNUPGM", "", !(GXutil.strcmp("", AV43TFMnuPgm)==0), (short)(0), AV43TFMnuPgm, "", !(GXutil.strcmp("", AV44TFMnuPgm_Sel)==0), AV44TFMnuPgm_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMNUPGMWEB", "", !(GXutil.strcmp("", AV49TFMnuPgmWeb)==0), (short)(0), AV49TFMnuPgmWeb, "", !(GXutil.strcmp("", AV50TFMnuPgmWeb_Sel)==0), AV50TFMnuPgmWeb_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState19[0] ;
      AV21GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV21GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV91Pgmname+"GridState", AV21GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV53TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV53TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV91Pgmname );
      AV53TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV53TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV23HTTPRequest.getScriptName()+"?"+AV23HTTPRequest.getQuerystring() );
      AV53TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMENUNIVEL1" );
      AV38Session.setValue("TrnContext", AV53TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e2125Q2( )
   {
      /* Grid_Onlineactivate Routine */
      returnInSub = false ;
      AV12Eva_MnuId = A945MnuId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Eva_MnuId", AV12Eva_MnuId);
      AV13Eva_MnuOp = A946MnuOp ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Eva_MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Eva_MnuOp), 2, 0));
      AV14Eva_MnuPgm = A947MnuPgm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Eva_MnuPgm", AV14Eva_MnuPgm);
      AV16Eva_MnuPgmWeb = A14286MnuPgmWeb ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Eva_MnuPgmWeb", AV16Eva_MnuPgmWeb);
      AV15Eva_MnuPgmTxt = A949MnuPgmTxt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Eva_MnuPgmTxt", AV15Eva_MnuPgmTxt);
      GXt_char17 = AV33Ok ;
      GXv_char18[0] = AV12Eva_MnuId ;
      GXv_int8[0] = AV13Eva_MnuOp ;
      GXv_char16[0] = AV17Eva_UsurCod ;
      GXv_char14[0] = GXt_char17 ;
      new app.ppermisos(remoteHandle, context).execute( GXv_char18, GXv_int8, GXv_char16, GXv_char14) ;
      testmenu_impl.this.AV12Eva_MnuId = GXv_char18[0] ;
      testmenu_impl.this.AV13Eva_MnuOp = GXv_int8[0] ;
      testmenu_impl.this.AV17Eva_UsurCod = GXv_char16[0] ;
      testmenu_impl.this.GXt_char17 = GXv_char14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Eva_MnuId", AV12Eva_MnuId);
      httpContext.ajax_rsp_assign_attri("", false, "AV13Eva_MnuOp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Eva_MnuOp), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Eva_UsurCod", AV17Eva_UsurCod);
      AV33Ok = GXt_char17 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Ok", AV33Ok);
      GXt_boolean9 = AV24IsAuthorized ;
      GXv_boolean10[0] = GXt_boolean9 ;
      new app.permisos_texplus_web(remoteHandle, context).execute( AV16Eva_MnuPgmWeb, AV17Eva_UsurCod, GXv_boolean10) ;
      testmenu_impl.this.GXt_boolean9 = GXv_boolean10[0] ;
      AV24IsAuthorized = GXt_boolean9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24IsAuthorized", AV24IsAuthorized);
      /*  Sending Event outputs  */
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
      pa25Q2( ) ;
      ws25Q2( ) ;
      we25Q2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116144899", true, true);
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
      httpContext.AddJavascriptSource("testmenu.js", "?202682116144899", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_122( )
   {
      edtavEditablegridcancel_Internalname = "vEDITABLEGRIDCANCEL_"+sGXsfl_12_idx ;
      edtMnuId_Internalname = "MNUID_"+sGXsfl_12_idx ;
      edtMnuOp_Internalname = "MNUOP_"+sGXsfl_12_idx ;
      edtavMnupgmtpo_editable_Internalname = "vMNUPGMTPO_EDITABLE_"+sGXsfl_12_idx ;
      edtMnuPgmTpo_Internalname = "MNUPGMTPO_"+sGXsfl_12_idx ;
      edtMnuTxt_Internalname = "MNUTXT_"+sGXsfl_12_idx ;
      edtavMnupgmtxt_editable_Internalname = "vMNUPGMTXT_EDITABLE_"+sGXsfl_12_idx ;
      edtMnuPgmTxt_Internalname = "MNUPGMTXT_"+sGXsfl_12_idx ;
      edtavMnupgm_editable_Internalname = "vMNUPGM_EDITABLE_"+sGXsfl_12_idx ;
      edtMnuPgm_Internalname = "MNUPGM_"+sGXsfl_12_idx ;
      edtavMnupgmweb_editable_Internalname = "vMNUPGMWEB_EDITABLE_"+sGXsfl_12_idx ;
      edtMnuPgmWeb_Internalname = "MNUPGMWEB_"+sGXsfl_12_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_12_idx ;
      edtavEditablegridconfirm_Internalname = "vEDITABLEGRIDCONFIRM_"+sGXsfl_12_idx ;
   }

   public void subsflControlProps_fel_122( )
   {
      edtavEditablegridcancel_Internalname = "vEDITABLEGRIDCANCEL_"+sGXsfl_12_fel_idx ;
      edtMnuId_Internalname = "MNUID_"+sGXsfl_12_fel_idx ;
      edtMnuOp_Internalname = "MNUOP_"+sGXsfl_12_fel_idx ;
      edtavMnupgmtpo_editable_Internalname = "vMNUPGMTPO_EDITABLE_"+sGXsfl_12_fel_idx ;
      edtMnuPgmTpo_Internalname = "MNUPGMTPO_"+sGXsfl_12_fel_idx ;
      edtMnuTxt_Internalname = "MNUTXT_"+sGXsfl_12_fel_idx ;
      edtavMnupgmtxt_editable_Internalname = "vMNUPGMTXT_EDITABLE_"+sGXsfl_12_fel_idx ;
      edtMnuPgmTxt_Internalname = "MNUPGMTXT_"+sGXsfl_12_fel_idx ;
      edtavMnupgm_editable_Internalname = "vMNUPGM_EDITABLE_"+sGXsfl_12_fel_idx ;
      edtMnuPgm_Internalname = "MNUPGM_"+sGXsfl_12_fel_idx ;
      edtavMnupgmweb_editable_Internalname = "vMNUPGMWEB_EDITABLE_"+sGXsfl_12_fel_idx ;
      edtMnuPgmWeb_Internalname = "MNUPGMWEB_"+sGXsfl_12_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_12_fel_idx ;
      edtavEditablegridconfirm_Internalname = "vEDITABLEGRIDCONFIRM_"+sGXsfl_12_fel_idx ;
   }

   public void sendrow_122( )
   {
      subsflControlProps_122( ) ;
      wb25Q0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_12_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_12_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_12_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((edtavEditablegridcancel_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavEditablegridcancel_Enabled!=0)&&(edtavEditablegridcancel_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 13,'',false,'',12)\"" : " ") ;
         ClassString = edtavEditablegridcancel_Class + " " + ((GXutil.strcmp(edtavEditablegridcancel_gximage, "")==0) ? "" : "GX_Image_"+edtavEditablegridcancel_gximage+"_Class") ;
         StyleString = "" ;
         AV69EditableGridCancel_IsBlob = (boolean)(((GXutil.strcmp("", AV69EditableGridCancel)==0)&&(GXutil.strcmp("", AV88Editablegridcancel_GXI)==0))||!(GXutil.strcmp("", AV69EditableGridCancel)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV69EditableGridCancel)==0) ? AV88Editablegridcancel_GXI : httpContext.getResourceRelative(AV69EditableGridCancel)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEditablegridcancel_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavEditablegridcancel_Visible),Integer.valueOf(1),"",edtavEditablegridcancel_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavEditablegridcancel_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'EDITABLEGRIDCANCEL\\'."+sGXsfl_12_idx+"'",StyleString,ClassString,"WWActionColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV69EditableGridCancel_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuId_Internalname,GXutil.rtrim( A945MnuId),GXutil.rtrim( localUtil.format( A945MnuId, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuOp_Internalname,GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A946MnuOp), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuOp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMnupgmtpo_editable_Enabled!=0)&&(edtavMnupgmtpo_editable_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 16,'',false,'"+sGXsfl_12_idx+"',12)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMnupgmtpo_editable_Internalname,GXutil.rtrim( AV65MnuPgmTpo_Editable),GXutil.rtrim( localUtil.format( AV65MnuPgmTpo_Editable, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavMnupgmtpo_editable_Enabled!=0)&&(edtavMnupgmtpo_editable_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,16);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMnupgmtpo_editable_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(edtavMnupgmtpo_editable_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgmTpo_Internalname,GXutil.rtrim( A948MnuPgmTpo),GXutil.rtrim( localUtil.format( A948MnuPgmTpo, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgmTpo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuTxt_Internalname,GXutil.rtrim( A951MnuTxt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMnupgmtxt_editable_Enabled!=0)&&(edtavMnupgmtxt_editable_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 19,'',false,'"+sGXsfl_12_idx+"',12)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMnupgmtxt_editable_Internalname,GXutil.rtrim( AV66MnuPgmTxt_Editable),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMnupgmtxt_editable_Enabled!=0)&&(edtavMnupgmtxt_editable_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,19);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMnupgmtxt_editable_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(edtavMnupgmtxt_editable_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgmTxt_Internalname,GXutil.rtrim( A949MnuPgmTxt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgmTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMnupgm_editable_Enabled!=0)&&(edtavMnupgm_editable_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 21,'',false,'"+sGXsfl_12_idx+"',12)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMnupgm_editable_Internalname,GXutil.rtrim( AV67MnuPgm_Editable),GXutil.rtrim( localUtil.format( AV67MnuPgm_Editable, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavMnupgm_editable_Enabled!=0)&&(edtavMnupgm_editable_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,21);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMnupgm_editable_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMnupgm_editable_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgm_Internalname,GXutil.rtrim( A947MnuPgm),GXutil.rtrim( localUtil.format( A947MnuPgm, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMnupgmweb_editable_Enabled!=0)&&(edtavMnupgmweb_editable_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 23,'',false,'"+sGXsfl_12_idx+"',12)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMnupgmweb_editable_Internalname,AV68MnuPgmWeb_Editable,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMnupgmweb_editable_Enabled!=0)&&(edtavMnupgmweb_editable_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,23);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMnupgmweb_editable_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(edtavMnupgmweb_editable_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgmWeb_Internalname,A14286MnuPgmWeb,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgmWeb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavUpdate_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavUpdate_Enabled!=0)&&(edtavUpdate_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 25,'',false,'"+sGXsfl_12_idx+"',12)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,GXutil.rtrim( AV70Update),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavUpdate_Enabled!=0)&&(edtavUpdate_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,25);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVUPDATE.CLICK."+sGXsfl_12_idx+"'","","",httpContext.getMessage( "GXM_update", ""),"",edtavUpdate_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(edtavUpdate_Visible),Integer.valueOf(edtavUpdate_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((edtavEditablegridconfirm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavEditablegridconfirm_Enabled!=0)&&(edtavEditablegridconfirm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 26,'',false,'',12)\"" : " ") ;
         ClassString = edtavEditablegridconfirm_Class + " " + ((GXutil.strcmp(edtavEditablegridconfirm_gximage, "")==0) ? "" : "GX_Image_"+edtavEditablegridconfirm_gximage+"_Class") ;
         StyleString = "" ;
         AV71EditableGridConfirm_IsBlob = (boolean)(((GXutil.strcmp("", AV71EditableGridConfirm)==0)&&(GXutil.strcmp("", AV89Editablegridconfirm_GXI)==0))||!(GXutil.strcmp("", AV71EditableGridConfirm)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV71EditableGridConfirm)==0) ? AV89Editablegridconfirm_GXI : httpContext.getResourceRelative(AV71EditableGridConfirm)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEditablegridconfirm_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavEditablegridconfirm_Visible),Integer.valueOf(1),"",edtavEditablegridconfirm_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavEditablegridconfirm_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'EDITABLEGRIDCONFIRM\\'."+sGXsfl_12_idx+"'",StyleString,ClassString,"WWActionColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV71EditableGridConfirm_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         send_integrity_lvl_hashes25Q2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_12_idx = ((subGrid_Islastpage==1)&&(nGXsfl_12_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_12_idx+1) ;
         sGXsfl_12_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_12_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_122( ) ;
      }
      /* End function sendrow_122 */
   }

   public void startgridcontrol12( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"12\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavEditablegridcancel_Class+" "+((GXutil.strcmp(edtavEditablegridcancel_gximage, "")==0) ? "" : "GX_Image_"+edtavEditablegridcancel_gximage+"_Class")+"\" "+" style=\""+((edtavEditablegridcancel_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Id", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Parámetro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ind. de Requiere parámetro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Texto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción del Programa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Objeto Win", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Programa a llamar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Objeto Web", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Link", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavUpdate_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavEditablegridconfirm_Class+" "+((GXutil.strcmp(edtavEditablegridconfirm_gximage, "")==0) ? "" : "GX_Image_"+edtavEditablegridconfirm_gximage+"_Class")+"\" "+" style=\""+((edtavEditablegridconfirm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV69EditableGridCancel));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavEditablegridcancel_Class));
         GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavEditablegridcancel_Tooltiptext));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEditablegridcancel_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A945MnuId));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV65MnuPgmTpo_Editable));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMnupgmtpo_editable_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A948MnuPgmTpo));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A951MnuTxt));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV66MnuPgmTxt_Editable));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMnupgmtxt_editable_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A949MnuPgmTxt));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV67MnuPgm_Editable));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMnupgm_editable_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A947MnuPgm));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV68MnuPgmWeb_Editable);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMnupgmweb_editable_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A14286MnuPgmWeb);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV70Update));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUpdate_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavUpdate_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV71EditableGridConfirm));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavEditablegridconfirm_Class));
         GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavEditablegridconfirm_Tooltiptext));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEditablegridconfirm_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavEditablegridcancel_Internalname = "vEDITABLEGRIDCANCEL" ;
      edtMnuId_Internalname = "MNUID" ;
      edtMnuOp_Internalname = "MNUOP" ;
      edtavMnupgmtpo_editable_Internalname = "vMNUPGMTPO_EDITABLE" ;
      edtMnuPgmTpo_Internalname = "MNUPGMTPO" ;
      edtMnuTxt_Internalname = "MNUTXT" ;
      edtavMnupgmtxt_editable_Internalname = "vMNUPGMTXT_EDITABLE" ;
      edtMnuPgmTxt_Internalname = "MNUPGMTXT" ;
      edtavMnupgm_editable_Internalname = "vMNUPGM_EDITABLE" ;
      edtMnuPgm_Internalname = "MNUPGM" ;
      edtavMnupgmweb_editable_Internalname = "vMNUPGMWEB_EDITABLE" ;
      edtMnuPgmWeb_Internalname = "MNUPGMWEB" ;
      edtavUpdate_Internalname = "vUPDATE" ;
      edtavEditablegridconfirm_Internalname = "vEDITABLEGRIDCONFIRM" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavEva_mnuid_Internalname = "vEVA_MNUID" ;
      edtavEva_mnuop_Internalname = "vEVA_MNUOP" ;
      edtavEva_mnupgm_Internalname = "vEVA_MNUPGM" ;
      edtavEva_mnupgmweb_Internalname = "vEVA_MNUPGMWEB" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      bttBtnevaluarpermiso_Internalname = "BTNEVALUARPERMISO" ;
      edtavEva_usurcod_Internalname = "vEVA_USURCOD" ;
      edtavEva_mnupgmtxt_Internalname = "vEVA_MNUPGMTXT" ;
      edtavOk_Internalname = "vOK" ;
      chkavIsauthorized.setInternalname( "vISAUTHORIZED" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divPanelevaluar_Internalname = "PANELEVALUAR" ;
      Dvpanel_panelevaluar_Internalname = "DVPANEL_PANELEVALUAR" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavEditablegridconfirm_Jsonclick = "" ;
      edtavEditablegridconfirm_gximage = "" ;
      edtavEditablegridconfirm_Class = "SelectAttribute ActionBaseColorAttribute" ;
      edtavEditablegridconfirm_Enabled = 1 ;
      edtavEditablegridconfirm_Tooltiptext = httpContext.getMessage( "GX_BtnEnter", "") ;
      edtavUpdate_Jsonclick = "" ;
      edtavUpdate_Enabled = 1 ;
      edtMnuPgmWeb_Jsonclick = "" ;
      edtavMnupgmweb_editable_Jsonclick = "" ;
      edtavMnupgmweb_editable_Visible = -1 ;
      edtavMnupgmweb_editable_Enabled = 1 ;
      edtMnuPgm_Jsonclick = "" ;
      edtavMnupgm_editable_Jsonclick = "" ;
      edtavMnupgm_editable_Visible = -1 ;
      edtavMnupgm_editable_Enabled = 1 ;
      edtMnuPgmTxt_Jsonclick = "" ;
      edtavMnupgmtxt_editable_Jsonclick = "" ;
      edtavMnupgmtxt_editable_Visible = -1 ;
      edtavMnupgmtxt_editable_Enabled = 1 ;
      edtMnuTxt_Jsonclick = "" ;
      edtMnuPgmTpo_Jsonclick = "" ;
      edtavMnupgmtpo_editable_Jsonclick = "" ;
      edtavMnupgmtpo_editable_Visible = -1 ;
      edtavMnupgmtpo_editable_Enabled = 1 ;
      edtMnuOp_Jsonclick = "" ;
      edtMnuId_Jsonclick = "" ;
      edtavEditablegridcancel_Jsonclick = "" ;
      edtavEditablegridcancel_gximage = "" ;
      edtavEditablegridcancel_Class = "DeleteAttribute ActionBaseColorAttribute" ;
      edtavEditablegridcancel_Enabled = 1 ;
      edtavEditablegridcancel_Tooltiptext = httpContext.getMessage( "GX_BtnCancel", "") ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavEditablegridconfirm_Visible = -1 ;
      edtavEditablegridcancel_Visible = -1 ;
      edtavUpdate_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      chkavIsauthorized.setEnabled( 1 );
      edtavOk_Jsonclick = "" ;
      edtavOk_Enabled = 1 ;
      edtavEva_mnupgmtxt_Jsonclick = "" ;
      edtavEva_mnupgmtxt_Enabled = 1 ;
      edtavEva_usurcod_Jsonclick = "" ;
      edtavEva_usurcod_Enabled = 1 ;
      edtavEva_mnupgmweb_Jsonclick = "" ;
      edtavEva_mnupgmweb_Enabled = 1 ;
      edtavEva_mnupgm_Jsonclick = "" ;
      edtavEva_mnupgm_Enabled = 1 ;
      edtavEva_mnuop_Jsonclick = "" ;
      edtavEva_mnuop_Enabled = 1 ;
      edtavEva_mnuid_Jsonclick = "" ;
      edtavEva_mnuid_Enabled = 1 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "TestMenuGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T||T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "|T|||||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "1:MnuId|2:MnuOp|3:MnuPgmTpo|5:MnuTxt|6:MnuPgmTxt|8:MnuPgm|10:MnuPgmWeb" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_panelevaluar_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelevaluar_Iconposition = "Right" ;
      Dvpanel_panelevaluar_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelevaluar_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelevaluar_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelevaluar_Title = httpContext.getMessage( "Evaluar permisos", "") ;
      Dvpanel_panelevaluar_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelevaluar_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelevaluar_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelevaluar_Width = "100%" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " TMENUNIVEL1", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavIsauthorized.setName( "vISAUTHORIZED" );
      chkavIsauthorized.setWebtags( "" );
      chkavIsauthorized.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavIsauthorized.getInternalname(), "TitleCaption", chkavIsauthorized.getCaption(), true);
      chkavIsauthorized.setCheckedValue( "false" );
      AV24IsAuthorized = GXutil.strtobool( GXutil.booltostr( AV24IsAuthorized)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24IsAuthorized", AV24IsAuthorized);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39TFMnuId',fld:'vTFMNUID',pic:'@!'},{av:'AV40TFMnuId_Sel',fld:'vTFMNUID_SEL',pic:'@!'},{av:'AV41TFMnuOp',fld:'vTFMNUOP',pic:'Z9'},{av:'AV42TFMnuOp_To',fld:'vTFMNUOP_TO',pic:'Z9'},{av:'AV45TFMnuPgmTpo',fld:'vTFMNUPGMTPO',pic:'@!'},{av:'AV46TFMnuPgmTpo_Sel',fld:'vTFMNUPGMTPO_SEL',pic:'@!'},{av:'AV51TFMnuTxt',fld:'vTFMNUTXT',pic:''},{av:'AV52TFMnuTxt_Sel',fld:'vTFMNUTXT_SEL',pic:''},{av:'AV47TFMnuPgmTxt',fld:'vTFMNUPGMTXT',pic:''},{av:'AV48TFMnuPgmTxt_Sel',fld:'vTFMNUPGMTXT_SEL',pic:''},{av:'AV43TFMnuPgm',fld:'vTFMNUPGM',pic:'@!'},{av:'AV44TFMnuPgm_Sel',fld:'vTFMNUPGM_SEL',pic:'@!'},{av:'AV49TFMnuPgmWeb',fld:'vTFMNUPGMWEB',pic:''},{av:'AV50TFMnuPgmWeb_Sel',fld:'vTFMNUPGMWEB_SEL',pic:''},{av:'AV91Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV24IsAuthorized',fld:'vISAUTHORIZED',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavUpdate_Visible',ctrl:'vUPDATE',prop:'Visible'},{av:'edtavEditablegridcancel_Visible',ctrl:'vEDITABLEGRIDCANCEL',prop:'Visible'},{av:'edtavEditablegridconfirm_Visible',ctrl:'vEDITABLEGRIDCONFIRM',prop:'Visible'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1125Q2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV39TFMnuId',fld:'vTFMNUID',pic:'@!'},{av:'AV40TFMnuId_Sel',fld:'vTFMNUID_SEL',pic:'@!'},{av:'AV41TFMnuOp',fld:'vTFMNUOP',pic:'Z9'},{av:'AV42TFMnuOp_To',fld:'vTFMNUOP_TO',pic:'Z9'},{av:'AV45TFMnuPgmTpo',fld:'vTFMNUPGMTPO',pic:'@!'},{av:'AV46TFMnuPgmTpo_Sel',fld:'vTFMNUPGMTPO_SEL',pic:'@!'},{av:'AV51TFMnuTxt',fld:'vTFMNUTXT',pic:''},{av:'AV52TFMnuTxt_Sel',fld:'vTFMNUTXT_SEL',pic:''},{av:'AV47TFMnuPgmTxt',fld:'vTFMNUPGMTXT',pic:''},{av:'AV48TFMnuPgmTxt_Sel',fld:'vTFMNUPGMTXT_SEL',pic:''},{av:'AV43TFMnuPgm',fld:'vTFMNUPGM',pic:'@!'},{av:'AV44TFMnuPgm_Sel',fld:'vTFMNUPGM_SEL',pic:'@!'},{av:'AV49TFMnuPgmWeb',fld:'vTFMNUPGMWEB',pic:''},{av:'AV50TFMnuPgmWeb_Sel',fld:'vTFMNUPGMWEB_SEL',pic:''},{av:'AV91Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'AV24IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1225Q2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV39TFMnuId',fld:'vTFMNUID',pic:'@!'},{av:'AV40TFMnuId_Sel',fld:'vTFMNUID_SEL',pic:'@!'},{av:'AV41TFMnuOp',fld:'vTFMNUOP',pic:'Z9'},{av:'AV42TFMnuOp_To',fld:'vTFMNUOP_TO',pic:'Z9'},{av:'AV45TFMnuPgmTpo',fld:'vTFMNUPGMTPO',pic:'@!'},{av:'AV46TFMnuPgmTpo_Sel',fld:'vTFMNUPGMTPO_SEL',pic:'@!'},{av:'AV51TFMnuTxt',fld:'vTFMNUTXT',pic:''},{av:'AV52TFMnuTxt_Sel',fld:'vTFMNUTXT_SEL',pic:''},{av:'AV47TFMnuPgmTxt',fld:'vTFMNUPGMTXT',pic:''},{av:'AV48TFMnuPgmTxt_Sel',fld:'vTFMNUPGMTXT_SEL',pic:''},{av:'AV43TFMnuPgm',fld:'vTFMNUPGM',pic:'@!'},{av:'AV44TFMnuPgm_Sel',fld:'vTFMNUPGM_SEL',pic:'@!'},{av:'AV49TFMnuPgmWeb',fld:'vTFMNUPGMWEB',pic:''},{av:'AV50TFMnuPgmWeb_Sel',fld:'vTFMNUPGMWEB_SEL',pic:''},{av:'AV91Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'AV24IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1325Q2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV39TFMnuId',fld:'vTFMNUID',pic:'@!'},{av:'AV40TFMnuId_Sel',fld:'vTFMNUID_SEL',pic:'@!'},{av:'AV41TFMnuOp',fld:'vTFMNUOP',pic:'Z9'},{av:'AV42TFMnuOp_To',fld:'vTFMNUOP_TO',pic:'Z9'},{av:'AV45TFMnuPgmTpo',fld:'vTFMNUPGMTPO',pic:'@!'},{av:'AV46TFMnuPgmTpo_Sel',fld:'vTFMNUPGMTPO_SEL',pic:'@!'},{av:'AV51TFMnuTxt',fld:'vTFMNUTXT',pic:''},{av:'AV52TFMnuTxt_Sel',fld:'vTFMNUTXT_SEL',pic:''},{av:'AV47TFMnuPgmTxt',fld:'vTFMNUPGMTXT',pic:''},{av:'AV48TFMnuPgmTxt_Sel',fld:'vTFMNUPGMTXT_SEL',pic:''},{av:'AV43TFMnuPgm',fld:'vTFMNUPGM',pic:'@!'},{av:'AV44TFMnuPgm_Sel',fld:'vTFMNUPGM_SEL',pic:'@!'},{av:'AV49TFMnuPgmWeb',fld:'vTFMNUPGMWEB',pic:''},{av:'AV50TFMnuPgmWeb_Sel',fld:'vTFMNUPGMWEB_SEL',pic:''},{av:'AV91Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'AV24IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV49TFMnuPgmWeb',fld:'vTFMNUPGMWEB',pic:''},{av:'AV50TFMnuPgmWeb_Sel',fld:'vTFMNUPGMWEB_SEL',pic:''},{av:'AV43TFMnuPgm',fld:'vTFMNUPGM',pic:'@!'},{av:'AV44TFMnuPgm_Sel',fld:'vTFMNUPGM_SEL',pic:'@!'},{av:'AV47TFMnuPgmTxt',fld:'vTFMNUPGMTXT',pic:''},{av:'AV48TFMnuPgmTxt_Sel',fld:'vTFMNUPGMTXT_SEL',pic:''},{av:'AV51TFMnuTxt',fld:'vTFMNUTXT',pic:''},{av:'AV52TFMnuTxt_Sel',fld:'vTFMNUTXT_SEL',pic:''},{av:'AV45TFMnuPgmTpo',fld:'vTFMNUPGMTPO',pic:'@!'},{av:'AV46TFMnuPgmTpo_Sel',fld:'vTFMNUPGMTPO_SEL',pic:'@!'},{av:'AV41TFMnuOp',fld:'vTFMNUOP',pic:'Z9'},{av:'AV42TFMnuOp_To',fld:'vTFMNUOP_TO',pic:'Z9'},{av:'AV39TFMnuId',fld:'vTFMNUID',pic:'@!'},{av:'AV40TFMnuId_Sel',fld:'vTFMNUID_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1725Q2',iparms:[{av:'A948MnuPgmTpo',fld:'MNUPGMTPO',pic:'@!'},{av:'A949MnuPgmTxt',fld:'MNUPGMTXT',pic:'',hsh:true},{av:'A947MnuPgm',fld:'MNUPGM',pic:'@!',hsh:true},{av:'A14286MnuPgmWeb',fld:'MNUPGMWEB',pic:'',hsh:true},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'A945MnuId',fld:'MNUID',pic:'@!',hsh:true},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'A946MnuOp',fld:'MNUOP',pic:'Z9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV69EditableGridCancel',fld:'vEDITABLEGRIDCANCEL',pic:''},{av:'edtavEditablegridcancel_Tooltiptext',ctrl:'vEDITABLEGRIDCANCEL',prop:'Tooltiptext'},{av:'AV70Update',fld:'vUPDATE',pic:''},{av:'AV71EditableGridConfirm',fld:'vEDITABLEGRIDCONFIRM',pic:''},{av:'edtavEditablegridconfirm_Tooltiptext',ctrl:'vEDITABLEGRIDCONFIRM',prop:'Tooltiptext'},{av:'AV65MnuPgmTpo_Editable',fld:'vMNUPGMTPO_EDITABLE',pic:'@!'},{av:'AV66MnuPgmTxt_Editable',fld:'vMNUPGMTXT_EDITABLE',pic:''},{av:'AV67MnuPgm_Editable',fld:'vMNUPGM_EDITABLE',pic:'@!'},{av:'AV68MnuPgmWeb_Editable',fld:'vMNUPGMWEB_EDITABLE',pic:''},{av:'edtavMnupgmtpo_editable_Enabled',ctrl:'vMNUPGMTPO_EDITABLE',prop:'Enabled'},{av:'edtavMnupgmtxt_editable_Enabled',ctrl:'vMNUPGMTXT_EDITABLE',prop:'Enabled'},{av:'edtavMnupgm_editable_Enabled',ctrl:'vMNUPGM_EDITABLE',prop:'Enabled'},{av:'edtavMnupgmweb_editable_Enabled',ctrl:'vMNUPGMWEB_EDITABLE',prop:'Enabled'},{av:'edtavEditablegridcancel_Class',ctrl:'vEDITABLEGRIDCANCEL',prop:'Class'},{av:'edtavEditablegridconfirm_Class',ctrl:'vEDITABLEGRIDCONFIRM',prop:'Class'}]}");
      setEventMetadata("VUPDATE.CLICK","{handler:'e1825Q2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV39TFMnuId',fld:'vTFMNUID',pic:'@!'},{av:'AV40TFMnuId_Sel',fld:'vTFMNUID_SEL',pic:'@!'},{av:'AV41TFMnuOp',fld:'vTFMNUOP',pic:'Z9'},{av:'AV42TFMnuOp_To',fld:'vTFMNUOP_TO',pic:'Z9'},{av:'AV45TFMnuPgmTpo',fld:'vTFMNUPGMTPO',pic:'@!'},{av:'AV46TFMnuPgmTpo_Sel',fld:'vTFMNUPGMTPO_SEL',pic:'@!'},{av:'AV51TFMnuTxt',fld:'vTFMNUTXT',pic:''},{av:'AV52TFMnuTxt_Sel',fld:'vTFMNUTXT_SEL',pic:''},{av:'AV47TFMnuPgmTxt',fld:'vTFMNUPGMTXT',pic:''},{av:'AV48TFMnuPgmTxt_Sel',fld:'vTFMNUPGMTXT_SEL',pic:''},{av:'AV43TFMnuPgm',fld:'vTFMNUPGM',pic:'@!'},{av:'AV44TFMnuPgm_Sel',fld:'vTFMNUPGM_SEL',pic:'@!'},{av:'AV49TFMnuPgmWeb',fld:'vTFMNUPGMWEB',pic:''},{av:'AV50TFMnuPgmWeb_Sel',fld:'vTFMNUPGMWEB_SEL',pic:''},{av:'AV91Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'AV24IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'A945MnuId',fld:'MNUID',pic:'@!',hsh:true},{av:'A946MnuOp',fld:'MNUOP',pic:'Z9',hsh:true}]");
      setEventMetadata("VUPDATE.CLICK",",oparms:[{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavUpdate_Visible',ctrl:'vUPDATE',prop:'Visible'},{av:'edtavEditablegridcancel_Visible',ctrl:'vEDITABLEGRIDCANCEL',prop:'Visible'},{av:'edtavEditablegridconfirm_Visible',ctrl:'vEDITABLEGRIDCONFIRM',prop:'Visible'}]}");
      setEventMetadata("'EDITABLEGRIDCONFIRM'","{handler:'e1925Q2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV39TFMnuId',fld:'vTFMNUID',pic:'@!'},{av:'AV40TFMnuId_Sel',fld:'vTFMNUID_SEL',pic:'@!'},{av:'AV41TFMnuOp',fld:'vTFMNUOP',pic:'Z9'},{av:'AV42TFMnuOp_To',fld:'vTFMNUOP_TO',pic:'Z9'},{av:'AV45TFMnuPgmTpo',fld:'vTFMNUPGMTPO',pic:'@!'},{av:'AV46TFMnuPgmTpo_Sel',fld:'vTFMNUPGMTPO_SEL',pic:'@!'},{av:'AV51TFMnuTxt',fld:'vTFMNUTXT',pic:''},{av:'AV52TFMnuTxt_Sel',fld:'vTFMNUTXT_SEL',pic:''},{av:'AV47TFMnuPgmTxt',fld:'vTFMNUPGMTXT',pic:''},{av:'AV48TFMnuPgmTxt_Sel',fld:'vTFMNUPGMTXT_SEL',pic:''},{av:'AV43TFMnuPgm',fld:'vTFMNUPGM',pic:'@!'},{av:'AV44TFMnuPgm_Sel',fld:'vTFMNUPGM_SEL',pic:'@!'},{av:'AV49TFMnuPgmWeb',fld:'vTFMNUPGMWEB',pic:''},{av:'AV50TFMnuPgmWeb_Sel',fld:'vTFMNUPGMWEB_SEL',pic:''},{av:'AV91Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'AV24IsAuthorized',fld:'vISAUTHORIZED',pic:''},{av:'A945MnuId',fld:'MNUID',pic:'@!',hsh:true},{av:'A946MnuOp',fld:'MNUOP',pic:'Z9',hsh:true},{av:'AV65MnuPgmTpo_Editable',fld:'vMNUPGMTPO_EDITABLE',pic:'@!'},{av:'AV66MnuPgmTxt_Editable',fld:'vMNUPGMTXT_EDITABLE',pic:''},{av:'AV67MnuPgm_Editable',fld:'vMNUPGM_EDITABLE',pic:'@!'},{av:'AV68MnuPgmWeb_Editable',fld:'vMNUPGMWEB_EDITABLE',pic:''},{av:'AV60Messages',fld:'vMESSAGES',pic:''}]");
      setEventMetadata("'EDITABLEGRIDCONFIRM'",",oparms:[{av:'AV60Messages',fld:'vMESSAGES',pic:''},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavUpdate_Visible',ctrl:'vUPDATE',prop:'Visible'},{av:'edtavEditablegridcancel_Visible',ctrl:'vEDITABLEGRIDCANCEL',prop:'Visible'},{av:'edtavEditablegridconfirm_Visible',ctrl:'vEDITABLEGRIDCONFIRM',prop:'Visible'}]}");
      setEventMetadata("'EDITABLEGRIDCANCEL'","{handler:'e2025Q2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV39TFMnuId',fld:'vTFMNUID',pic:'@!'},{av:'AV40TFMnuId_Sel',fld:'vTFMNUID_SEL',pic:'@!'},{av:'AV41TFMnuOp',fld:'vTFMNUOP',pic:'Z9'},{av:'AV42TFMnuOp_To',fld:'vTFMNUOP_TO',pic:'Z9'},{av:'AV45TFMnuPgmTpo',fld:'vTFMNUPGMTPO',pic:'@!'},{av:'AV46TFMnuPgmTpo_Sel',fld:'vTFMNUPGMTPO_SEL',pic:'@!'},{av:'AV51TFMnuTxt',fld:'vTFMNUTXT',pic:''},{av:'AV52TFMnuTxt_Sel',fld:'vTFMNUTXT_SEL',pic:''},{av:'AV47TFMnuPgmTxt',fld:'vTFMNUPGMTXT',pic:''},{av:'AV48TFMnuPgmTxt_Sel',fld:'vTFMNUPGMTXT_SEL',pic:''},{av:'AV43TFMnuPgm',fld:'vTFMNUPGM',pic:'@!'},{av:'AV44TFMnuPgm_Sel',fld:'vTFMNUPGM_SEL',pic:'@!'},{av:'AV49TFMnuPgmWeb',fld:'vTFMNUPGMWEB',pic:''},{av:'AV50TFMnuPgmWeb_Sel',fld:'vTFMNUPGMWEB_SEL',pic:''},{av:'AV91Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'AV24IsAuthorized',fld:'vISAUTHORIZED',pic:''}]");
      setEventMetadata("'EDITABLEGRIDCANCEL'",",oparms:[{av:'AV63MnuId_SelectedLine',fld:'vMNUID_SELECTEDLINE',pic:'@!'},{av:'AV64MnuOp_SelectedLine',fld:'vMNUOP_SELECTEDLINE',pic:'Z9'},{av:'AV58EditableGrid_Mode',fld:'vEDITABLEGRID_MODE',pic:''},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavUpdate_Visible',ctrl:'vUPDATE',prop:'Visible'},{av:'edtavEditablegridcancel_Visible',ctrl:'vEDITABLEGRIDCANCEL',prop:'Visible'},{av:'edtavEditablegridconfirm_Visible',ctrl:'vEDITABLEGRIDCONFIRM',prop:'Visible'}]}");
      setEventMetadata("'DOEVALUARPERMISO'","{handler:'e1425Q2',iparms:[{av:'AV12Eva_MnuId',fld:'vEVA_MNUID',pic:'@!'},{av:'AV13Eva_MnuOp',fld:'vEVA_MNUOP',pic:'Z9'},{av:'AV17Eva_UsurCod',fld:'vEVA_USURCOD',pic:'@!'},{av:'AV16Eva_MnuPgmWeb',fld:'vEVA_MNUPGMWEB',pic:''}]");
      setEventMetadata("'DOEVALUARPERMISO'",",oparms:[{av:'AV33Ok',fld:'vOK',pic:''},{av:'AV17Eva_UsurCod',fld:'vEVA_USURCOD',pic:'@!'},{av:'AV13Eva_MnuOp',fld:'vEVA_MNUOP',pic:'Z9'},{av:'AV12Eva_MnuId',fld:'vEVA_MNUID',pic:'@!'},{av:'AV24IsAuthorized',fld:'vISAUTHORIZED',pic:''}]}");
      setEventMetadata("GRID.ONLINEACTIVATE","{handler:'e2125Q2',iparms:[{av:'A945MnuId',fld:'MNUID',pic:'@!',hsh:true},{av:'A946MnuOp',fld:'MNUOP',pic:'Z9',hsh:true},{av:'A947MnuPgm',fld:'MNUPGM',pic:'@!',hsh:true},{av:'A14286MnuPgmWeb',fld:'MNUPGMWEB',pic:'',hsh:true},{av:'A949MnuPgmTxt',fld:'MNUPGMTXT',pic:'',hsh:true},{av:'AV17Eva_UsurCod',fld:'vEVA_USURCOD',pic:'@!'}]");
      setEventMetadata("GRID.ONLINEACTIVATE",",oparms:[{av:'AV12Eva_MnuId',fld:'vEVA_MNUID',pic:'@!'},{av:'AV13Eva_MnuOp',fld:'vEVA_MNUOP',pic:'Z9'},{av:'AV14Eva_MnuPgm',fld:'vEVA_MNUPGM',pic:'@!'},{av:'AV16Eva_MnuPgmWeb',fld:'vEVA_MNUPGMWEB',pic:''},{av:'AV15Eva_MnuPgmTxt',fld:'vEVA_MNUPGMTXT',pic:''},{av:'AV33Ok',fld:'vOK',pic:''},{av:'AV17Eva_UsurCod',fld:'vEVA_USURCOD',pic:'@!'},{av:'AV24IsAuthorized',fld:'vISAUTHORIZED',pic:''}]}");
      setEventMetadata("VALID_MNUID","{handler:'valid_Mnuid',iparms:[]");
      setEventMetadata("VALID_MNUID",",oparms:[]}");
      setEventMetadata("VALIDV_MNUPGMTPO_EDITABLE","{handler:'validv_Mnupgmtpo_editable',iparms:[]");
      setEventMetadata("VALIDV_MNUPGMTPO_EDITABLE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Editablegridconfirm',iparms:[]");
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
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV58EditableGrid_Mode = "" ;
      AV39TFMnuId = "" ;
      AV40TFMnuId_Sel = "" ;
      AV45TFMnuPgmTpo = "" ;
      AV46TFMnuPgmTpo_Sel = "" ;
      AV51TFMnuTxt = "" ;
      AV52TFMnuTxt_Sel = "" ;
      AV47TFMnuPgmTxt = "" ;
      AV48TFMnuPgmTxt_Sel = "" ;
      AV43TFMnuPgm = "" ;
      AV44TFMnuPgm_Sel = "" ;
      AV49TFMnuPgmWeb = "" ;
      AV50TFMnuPgmWeb_Sel = "" ;
      AV91Pgmname = "" ;
      AV63MnuId_SelectedLine = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV11DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV60Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panelevaluar = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV12Eva_MnuId = "" ;
      AV14Eva_MnuPgm = "" ;
      AV16Eva_MnuPgmWeb = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnevaluarpermiso_Jsonclick = "" ;
      AV17Eva_UsurCod = "" ;
      AV15Eva_MnuPgmTxt = "" ;
      AV33Ok = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV69EditableGridCancel = "" ;
      AV88Editablegridcancel_GXI = "" ;
      A945MnuId = "" ;
      AV65MnuPgmTpo_Editable = "" ;
      A948MnuPgmTpo = "" ;
      A951MnuTxt = "" ;
      AV66MnuPgmTxt_Editable = "" ;
      A949MnuPgmTxt = "" ;
      AV67MnuPgm_Editable = "" ;
      A947MnuPgm = "" ;
      AV68MnuPgmWeb_Editable = "" ;
      A14286MnuPgmWeb = "" ;
      AV70Update = "" ;
      AV71EditableGridConfirm = "" ;
      AV89Editablegridconfirm_GXI = "" ;
      scmdbuf = "" ;
      lV74Testmenuds_1_tfmnuid = "" ;
      lV78Testmenuds_5_tfmnupgmtpo = "" ;
      lV80Testmenuds_7_tfmnutxt = "" ;
      lV82Testmenuds_9_tfmnupgmtxt = "" ;
      lV84Testmenuds_11_tfmnupgm = "" ;
      lV86Testmenuds_13_tfmnupgmweb = "" ;
      AV75Testmenuds_2_tfmnuid_sel = "" ;
      AV74Testmenuds_1_tfmnuid = "" ;
      AV79Testmenuds_6_tfmnupgmtpo_sel = "" ;
      AV78Testmenuds_5_tfmnupgmtpo = "" ;
      AV81Testmenuds_8_tfmnutxt_sel = "" ;
      AV80Testmenuds_7_tfmnutxt = "" ;
      AV83Testmenuds_10_tfmnupgmtxt_sel = "" ;
      AV82Testmenuds_9_tfmnupgmtxt = "" ;
      AV85Testmenuds_12_tfmnupgm_sel = "" ;
      AV84Testmenuds_11_tfmnupgm = "" ;
      AV87Testmenuds_14_tfmnupgmweb_sel = "" ;
      AV86Testmenuds_13_tfmnupgmweb = "" ;
      H025Q2_A14286MnuPgmWeb = new String[] {""} ;
      H025Q2_A947MnuPgm = new String[] {""} ;
      H025Q2_A949MnuPgmTxt = new String[] {""} ;
      H025Q2_A951MnuTxt = new String[] {""} ;
      H025Q2_n951MnuTxt = new boolean[] {false} ;
      H025Q2_A948MnuPgmTpo = new String[] {""} ;
      H025Q2_A946MnuOp = new byte[1] ;
      H025Q2_A945MnuId = new String[] {""} ;
      H025Q3_AGRID_nRecordCount = new long[1] ;
      AV7Station = "" ;
      AV5EmprCod = "" ;
      AV6EmprNom = "" ;
      AV56UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV57WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV62TMENUNIVEL1EditableGrid = new app.SdtTMENUNIVEL1(remoteHandle);
      AV59Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV38Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char15 = "" ;
      GXt_char13 = "" ;
      GXt_char12 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState19 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV53TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV23HTTPRequest = httpContext.getHttpRequest();
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char16 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_boolean10 = new boolean[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.testmenu__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.testmenu__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.testmenu__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.testmenu__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testmenu__default(),
         new Object[] {
             new Object[] {
            H025Q2_A14286MnuPgmWeb, H025Q2_A947MnuPgm, H025Q2_A949MnuPgmTxt, H025Q2_A951MnuTxt, H025Q2_n951MnuTxt, H025Q2_A948MnuPgmTpo, H025Q2_A946MnuOp, H025Q2_A945MnuId
            }
            , new Object[] {
            H025Q3_AGRID_nRecordCount
            }
         }
      );
      AV91Pgmname = "TestMenu" ;
      /* GeneXus formulas. */
      AV91Pgmname = "TestMenu" ;
      Gx_err = (short)(0) ;
      edtavMnupgmtpo_editable_Enabled = 0 ;
      edtavMnupgmtxt_editable_Enabled = 0 ;
      edtavMnupgm_editable_Enabled = 0 ;
      edtavMnupgmweb_editable_Enabled = 0 ;
      edtavUpdate_Enabled = 0 ;
      edtavEva_mnupgmtxt_Enabled = 0 ;
      edtavOk_Enabled = 0 ;
      chkavIsauthorized.setEnabled( 0 );
   }

   private byte nGotPars ;
   private byte GRID_nEOF ;
   private byte GxWebError ;
   private byte AV41TFMnuOp ;
   private byte AV42TFMnuOp_To ;
   private byte AV64MnuOp_SelectedLine ;
   private byte gxajaxcallmode ;
   private byte AV13Eva_MnuOp ;
   private byte A946MnuOp ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV76Testmenuds_3_tfmnuop ;
   private byte AV77Testmenuds_4_tfmnuop_to ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV34OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_12 ;
   private int nGXsfl_12_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavEva_mnuid_Enabled ;
   private int edtavEva_mnuop_Enabled ;
   private int edtavEva_mnupgm_Enabled ;
   private int edtavEva_mnupgmweb_Enabled ;
   private int edtavEva_usurcod_Enabled ;
   private int edtavEva_mnupgmtxt_Enabled ;
   private int edtavOk_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavMnupgmtpo_editable_Enabled ;
   private int edtavMnupgmtxt_editable_Enabled ;
   private int edtavMnupgm_editable_Enabled ;
   private int edtavMnupgmweb_editable_Enabled ;
   private int edtavUpdate_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtavUpdate_Visible ;
   private int edtavEditablegridcancel_Visible ;
   private int edtavEditablegridconfirm_Visible ;
   private int AV37PageToGo ;
   private int AV90GXV1 ;
   private int AV92GXV2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavEditablegridcancel_Enabled ;
   private int edtavMnupgmtpo_editable_Visible ;
   private int edtavMnupgmtxt_editable_Visible ;
   private int edtavMnupgm_editable_Visible ;
   private int edtavMnupgmweb_editable_Visible ;
   private int edtavEditablegridconfirm_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV19GridCurrentPage ;
   private long AV20GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_12_idx="0001" ;
   private String AV39TFMnuId ;
   private String AV40TFMnuId_Sel ;
   private String AV45TFMnuPgmTpo ;
   private String AV46TFMnuPgmTpo_Sel ;
   private String AV51TFMnuTxt ;
   private String AV52TFMnuTxt_Sel ;
   private String AV47TFMnuPgmTxt ;
   private String AV48TFMnuPgmTxt_Sel ;
   private String AV43TFMnuPgm ;
   private String AV44TFMnuPgm_Sel ;
   private String AV91Pgmname ;
   private String AV63MnuId_SelectedLine ;
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
   private String Dvpanel_panelevaluar_Width ;
   private String Dvpanel_panelevaluar_Cls ;
   private String Dvpanel_panelevaluar_Title ;
   private String Dvpanel_panelevaluar_Iconposition ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String Dvpanel_panelevaluar_Internalname ;
   private String divPanelevaluar_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavEva_mnuid_Internalname ;
   private String TempTags ;
   private String AV12Eva_MnuId ;
   private String edtavEva_mnuid_Jsonclick ;
   private String edtavEva_mnuop_Internalname ;
   private String edtavEva_mnuop_Jsonclick ;
   private String edtavEva_mnupgm_Internalname ;
   private String AV14Eva_MnuPgm ;
   private String edtavEva_mnupgm_Jsonclick ;
   private String edtavEva_mnupgmweb_Internalname ;
   private String edtavEva_mnupgmweb_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnevaluarpermiso_Internalname ;
   private String bttBtnevaluarpermiso_Jsonclick ;
   private String edtavEva_usurcod_Internalname ;
   private String AV17Eva_UsurCod ;
   private String edtavEva_usurcod_Jsonclick ;
   private String edtavEva_mnupgmtxt_Internalname ;
   private String AV15Eva_MnuPgmTxt ;
   private String edtavEva_mnupgmtxt_Jsonclick ;
   private String edtavOk_Internalname ;
   private String AV33Ok ;
   private String edtavOk_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavEditablegridcancel_Internalname ;
   private String A945MnuId ;
   private String edtMnuId_Internalname ;
   private String edtMnuOp_Internalname ;
   private String AV65MnuPgmTpo_Editable ;
   private String edtavMnupgmtpo_editable_Internalname ;
   private String A948MnuPgmTpo ;
   private String edtMnuPgmTpo_Internalname ;
   private String A951MnuTxt ;
   private String edtMnuTxt_Internalname ;
   private String AV66MnuPgmTxt_Editable ;
   private String edtavMnupgmtxt_editable_Internalname ;
   private String A949MnuPgmTxt ;
   private String edtMnuPgmTxt_Internalname ;
   private String AV67MnuPgm_Editable ;
   private String edtavMnupgm_editable_Internalname ;
   private String A947MnuPgm ;
   private String edtMnuPgm_Internalname ;
   private String edtavMnupgmweb_editable_Internalname ;
   private String edtMnuPgmWeb_Internalname ;
   private String AV70Update ;
   private String edtavUpdate_Internalname ;
   private String edtavEditablegridconfirm_Internalname ;
   private String scmdbuf ;
   private String lV74Testmenuds_1_tfmnuid ;
   private String lV78Testmenuds_5_tfmnupgmtpo ;
   private String lV80Testmenuds_7_tfmnutxt ;
   private String lV82Testmenuds_9_tfmnupgmtxt ;
   private String lV84Testmenuds_11_tfmnupgm ;
   private String AV75Testmenuds_2_tfmnuid_sel ;
   private String AV74Testmenuds_1_tfmnuid ;
   private String AV79Testmenuds_6_tfmnupgmtpo_sel ;
   private String AV78Testmenuds_5_tfmnupgmtpo ;
   private String AV81Testmenuds_8_tfmnutxt_sel ;
   private String AV80Testmenuds_7_tfmnutxt ;
   private String AV83Testmenuds_10_tfmnupgmtxt_sel ;
   private String AV82Testmenuds_9_tfmnupgmtxt ;
   private String AV85Testmenuds_12_tfmnupgm_sel ;
   private String AV84Testmenuds_11_tfmnupgm ;
   private String AV7Station ;
   private String AV5EmprCod ;
   private String AV6EmprNom ;
   private String AV56UsurCod ;
   private String edtavEditablegridcancel_gximage ;
   private String edtavEditablegridcancel_Tooltiptext ;
   private String edtavEditablegridconfirm_gximage ;
   private String edtavEditablegridconfirm_Tooltiptext ;
   private String edtavEditablegridcancel_Class ;
   private String edtavEditablegridconfirm_Class ;
   private String GXt_char15 ;
   private String GXt_char13 ;
   private String GXt_char12 ;
   private String GXv_char4[] ;
   private String GXt_char11 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXv_char16[] ;
   private String GXv_char14[] ;
   private String sGXsfl_12_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String sImgUrl ;
   private String edtavEditablegridcancel_Jsonclick ;
   private String ROClassString ;
   private String edtMnuId_Jsonclick ;
   private String edtMnuOp_Jsonclick ;
   private String edtavMnupgmtpo_editable_Jsonclick ;
   private String edtMnuPgmTpo_Jsonclick ;
   private String edtMnuTxt_Jsonclick ;
   private String edtavMnupgmtxt_editable_Jsonclick ;
   private String edtMnuPgmTxt_Jsonclick ;
   private String edtavMnupgm_editable_Jsonclick ;
   private String edtMnuPgm_Jsonclick ;
   private String edtavMnupgmweb_editable_Jsonclick ;
   private String edtMnuPgmWeb_Jsonclick ;
   private String edtavUpdate_Jsonclick ;
   private String edtavEditablegridconfirm_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV36OrderedDsc ;
   private boolean AV24IsAuthorized ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panelevaluar_Autowidth ;
   private boolean Dvpanel_panelevaluar_Autoheight ;
   private boolean Dvpanel_panelevaluar_Collapsible ;
   private boolean Dvpanel_panelevaluar_Collapsed ;
   private boolean Dvpanel_panelevaluar_Showcollapseicon ;
   private boolean Dvpanel_panelevaluar_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_12_Refreshing=false ;
   private boolean n951MnuTxt ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV61IsCurrentRecordSelected ;
   private boolean GXt_boolean9 ;
   private boolean GXv_boolean10[] ;
   private boolean AV69EditableGridCancel_IsBlob ;
   private boolean AV71EditableGridConfirm_IsBlob ;
   private String AV58EditableGrid_Mode ;
   private String AV49TFMnuPgmWeb ;
   private String AV50TFMnuPgmWeb_Sel ;
   private String AV16Eva_MnuPgmWeb ;
   private String AV88Editablegridcancel_GXI ;
   private String AV68MnuPgmWeb_Editable ;
   private String A14286MnuPgmWeb ;
   private String AV89Editablegridconfirm_GXI ;
   private String lV86Testmenuds_13_tfmnupgmweb ;
   private String AV87Testmenuds_14_tfmnupgmweb_sel ;
   private String AV86Testmenuds_13_tfmnupgmweb ;
   private String AV69EditableGridCancel ;
   private String AV71EditableGridConfirm ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV23HTTPRequest ;
   private com.genexus.webpanels.WebSession AV38Session ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelevaluar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private ICheckbox chkavIsauthorized ;
   private IDataStoreProvider pr_default ;
   private String[] H025Q2_A14286MnuPgmWeb ;
   private String[] H025Q2_A947MnuPgm ;
   private String[] H025Q2_A949MnuPgmTxt ;
   private String[] H025Q2_A951MnuTxt ;
   private boolean[] H025Q2_n951MnuTxt ;
   private String[] H025Q2_A948MnuPgmTpo ;
   private byte[] H025Q2_A946MnuOp ;
   private String[] H025Q2_A945MnuId ;
   private long[] H025Q3_AGRID_nRecordCount ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV60Messages ;
   private com.genexus.SdtMessages_Message AV59Message ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV11DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState19[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV53TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV57WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.SdtTMENUNIVEL1 AV62TMENUNIVEL1EditableGrid ;
}

final  class testmenu__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class testmenu__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class testmenu__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class testmenu__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class testmenu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H025Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Testmenuds_2_tfmnuid_sel ,
                                          String AV74Testmenuds_1_tfmnuid ,
                                          byte AV76Testmenuds_3_tfmnuop ,
                                          byte AV77Testmenuds_4_tfmnuop_to ,
                                          String AV79Testmenuds_6_tfmnupgmtpo_sel ,
                                          String AV78Testmenuds_5_tfmnupgmtpo ,
                                          String AV81Testmenuds_8_tfmnutxt_sel ,
                                          String AV80Testmenuds_7_tfmnutxt ,
                                          String AV83Testmenuds_10_tfmnupgmtxt_sel ,
                                          String AV82Testmenuds_9_tfmnupgmtxt ,
                                          String AV85Testmenuds_12_tfmnupgm_sel ,
                                          String AV84Testmenuds_11_tfmnupgm ,
                                          String AV87Testmenuds_14_tfmnupgmweb_sel ,
                                          String AV86Testmenuds_13_tfmnupgmweb ,
                                          String A945MnuId ,
                                          byte A946MnuOp ,
                                          String A948MnuPgmTpo ,
                                          String A951MnuTxt ,
                                          String A949MnuPgmTxt ,
                                          String A947MnuPgm ,
                                          String A14286MnuPgmWeb ,
                                          short AV34OrderedBy ,
                                          boolean AV36OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[19];
      Object[] GXv_Object21 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.MnuPgmWeb, T1.MnuPgm, T1.MnuPgmTxt, T2.MnuTxt, T1.MnuPgmTpo, T1.MnuOp, T1.MnuId" ;
      sFromString = " FROM (TXPMNUOP T1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = T1.MnuId)" ;
      sOrderString = "" ;
      if ( (GXutil.strcmp("", AV75Testmenuds_2_tfmnuid_sel)==0) && ( ! (GXutil.strcmp("", AV74Testmenuds_1_tfmnuid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Testmenuds_2_tfmnuid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuId = ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( ! (0==AV76Testmenuds_3_tfmnuop) )
      {
         addWhere(sWhereString, "(T1.MnuOp >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (0==AV77Testmenuds_4_tfmnuop_to) )
      {
         addWhere(sWhereString, "(T1.MnuOp <= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Testmenuds_6_tfmnupgmtpo_sel)==0) && ( ! (GXutil.strcmp("", AV78Testmenuds_5_tfmnupgmtpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Testmenuds_6_tfmnupgmtpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTpo = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Testmenuds_8_tfmnutxt_sel)==0) && ( ! (GXutil.strcmp("", AV80Testmenuds_7_tfmnutxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MnuTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Testmenuds_8_tfmnutxt_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MnuTxt = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Testmenuds_10_tfmnupgmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV82Testmenuds_9_tfmnupgmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Testmenuds_10_tfmnupgmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTxt = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Testmenuds_12_tfmnupgm_sel)==0) && ( ! (GXutil.strcmp("", AV84Testmenuds_11_tfmnupgm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Testmenuds_12_tfmnupgm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgm = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Testmenuds_14_tfmnupgmweb_sel)==0) && ( ! (GXutil.strcmp("", AV86Testmenuds_13_tfmnupgmweb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmWeb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Testmenuds_14_tfmnupgmweb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmWeb = ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ( AV34OrderedBy == 1 ) && ! AV36OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MnuId" ;
      }
      else if ( ( AV34OrderedBy == 1 ) && ( AV36OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MnuId DESC" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV36OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MnuOp" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV36OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MnuOp DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV36OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MnuPgmTpo" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV36OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MnuPgmTpo DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV36OrderedDsc )
      {
         sOrderString += " ORDER BY T2.MnuTxt" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV36OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.MnuTxt DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV36OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MnuPgmTxt" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV36OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MnuPgmTxt DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV36OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MnuPgm" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV36OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MnuPgm DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV36OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MnuPgmWeb" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV36OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MnuPgmWeb DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.MnuId, T1.MnuOp" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_H025Q3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Testmenuds_2_tfmnuid_sel ,
                                          String AV74Testmenuds_1_tfmnuid ,
                                          byte AV76Testmenuds_3_tfmnuop ,
                                          byte AV77Testmenuds_4_tfmnuop_to ,
                                          String AV79Testmenuds_6_tfmnupgmtpo_sel ,
                                          String AV78Testmenuds_5_tfmnupgmtpo ,
                                          String AV81Testmenuds_8_tfmnutxt_sel ,
                                          String AV80Testmenuds_7_tfmnutxt ,
                                          String AV83Testmenuds_10_tfmnupgmtxt_sel ,
                                          String AV82Testmenuds_9_tfmnupgmtxt ,
                                          String AV85Testmenuds_12_tfmnupgm_sel ,
                                          String AV84Testmenuds_11_tfmnupgm ,
                                          String AV87Testmenuds_14_tfmnupgmweb_sel ,
                                          String AV86Testmenuds_13_tfmnupgmweb ,
                                          String A945MnuId ,
                                          byte A946MnuOp ,
                                          String A948MnuPgmTpo ,
                                          String A951MnuTxt ,
                                          String A949MnuPgmTxt ,
                                          String A947MnuPgm ,
                                          String A14286MnuPgmWeb ,
                                          short AV34OrderedBy ,
                                          boolean AV36OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[14];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPMNUOP T1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = T1.MnuId)" ;
      if ( (GXutil.strcmp("", AV75Testmenuds_2_tfmnuid_sel)==0) && ( ! (GXutil.strcmp("", AV74Testmenuds_1_tfmnuid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Testmenuds_2_tfmnuid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuId = ?)");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
      }
      if ( ! (0==AV76Testmenuds_3_tfmnuop) )
      {
         addWhere(sWhereString, "(T1.MnuOp >= ?)");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( ! (0==AV77Testmenuds_4_tfmnuop_to) )
      {
         addWhere(sWhereString, "(T1.MnuOp <= ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Testmenuds_6_tfmnupgmtpo_sel)==0) && ( ! (GXutil.strcmp("", AV78Testmenuds_5_tfmnupgmtpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Testmenuds_6_tfmnupgmtpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTpo = ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Testmenuds_8_tfmnutxt_sel)==0) && ( ! (GXutil.strcmp("", AV80Testmenuds_7_tfmnutxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MnuTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Testmenuds_8_tfmnutxt_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MnuTxt = ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Testmenuds_10_tfmnupgmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV82Testmenuds_9_tfmnupgmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Testmenuds_10_tfmnupgmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmTxt = ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Testmenuds_12_tfmnupgm_sel)==0) && ( ! (GXutil.strcmp("", AV84Testmenuds_11_tfmnupgm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Testmenuds_12_tfmnupgm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgm = ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Testmenuds_14_tfmnupgmweb_sel)==0) && ( ! (GXutil.strcmp("", AV86Testmenuds_13_tfmnupgmweb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MnuPgmWeb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Testmenuds_14_tfmnupgmweb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MnuPgmWeb = ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV34OrderedBy == 1 ) && ! AV36OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 1 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV36OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV36OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV36OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV36OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV36OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV36OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_H025Q2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() );
            case 1 :
                  return conditional_H025Q3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H025Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025Q3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
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
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 200);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 200);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 200);
               }
               return;
      }
   }

}

