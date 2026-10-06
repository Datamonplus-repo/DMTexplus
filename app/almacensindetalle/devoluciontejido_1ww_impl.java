package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class devoluciontejido_1ww_impl extends GXDataArea
{
   public devoluciontejido_1ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public devoluciontejido_1ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_1ww_impl.class ));
   }

   public devoluciontejido_1ww_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavDevcrustt = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbDevCruEst = new HTMLChoice();
      cmbDevCruStt = new HTMLChoice();
      cmbDevCruEnvA = new HTMLChoice();
      cmbDevCruAT = new HTMLChoice();
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
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
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
      AV100DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
      cmbavDevcrustt.fromJSonString( httpContext.GetNextPar( ));
      AV102DevCruStt = httpContext.GetPar( "DevCruStt") ;
      AV101Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV103DevCruFecfrom = localUtil.parseDateParm( httpContext.GetPar( "DevCruFecfrom")) ;
      AV104DevCruFecto = localUtil.parseDateParm( httpContext.GetPar( "DevCruFecto")) ;
      AV93EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV106TFDevCruEst_Sels);
      AV36TFDevCruSal = localUtil.parseDTimeParm( httpContext.GetPar( "TFDevCruSal")) ;
      AV66TFDevCruAtId = httpContext.GetPar( "TFDevCruAtId") ;
      AV67TFDevCruAtId_Sel = httpContext.GetPar( "TFDevCruAtId_Sel") ;
      AV72TFDevCruATCUD = httpContext.GetPar( "TFDevCruATCUD") ;
      AV73TFDevCruATCUD_Sel = httpContext.GetPar( "TFDevCruATCUD_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV95TFDevCruEnvAT_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV108TFDevCruAT_Sels);
      AV56TFDevCruDtSys = localUtil.parseDTimeParm( httpContext.GetPar( "TFDevCruDtSys")) ;
      AV96TFDevFirma4dig = httpContext.GetPar( "TFDevFirma4dig") ;
      AV97TFDevFirma4dig_Sel = httpContext.GetPar( "TFDevFirma4dig_Sel") ;
      AV117Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV100DevCruId, AV102DevCruStt, AV101Clicod, AV103DevCruFecfrom, AV104DevCruFecto, AV93EmprCod, AV106TFDevCruEst_Sels, AV36TFDevCruSal, AV66TFDevCruAtId, AV67TFDevCruAtId_Sel, AV72TFDevCruATCUD, AV73TFDevCruATCUD_Sel, AV95TFDevCruEnvAT_Sels, AV108TFDevCruAT_Sels, AV56TFDevCruDtSys, AV96TFDevFirma4dig, AV97TFDevFirma4dig_Sel, AV117Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date) ;
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
      pa1WG2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WG2( ) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.devoluciontejido_1ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_1WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV117Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\devoluciontejido_1ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV100DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDEVCRUSTT", GXutil.rtrim( AV102DevCruStt));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICOD", GXutil.ltrim( localUtil.ntoc( AV101Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDEVCRUFECFROM", localUtil.format(AV103DevCruFecfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDEVCRUFECTO", localUtil.format(AV104DevCruFecto, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_52", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV80GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV81GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV78DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV78DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFDEVCRUEST_SELS", AV106TFDevCruEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFDEVCRUEST_SELS", AV106TFDevCruEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUSAL", localUtil.ttoc( AV36TFDevCruSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUATID", GXutil.rtrim( AV66TFDevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUATID_SEL", GXutil.rtrim( AV67TFDevCruAtId_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUATCUD", GXutil.rtrim( AV72TFDevCruATCUD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUATCUD_SEL", GXutil.rtrim( AV73TFDevCruATCUD_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFDEVCRUENVAT_SELS", AV95TFDevCruEnvAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFDEVCRUENVAT_SELS", AV95TFDevCruEnvAT_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFDEVCRUAT_SELS", AV108TFDevCruAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFDEVCRUAT_SELS", AV108TFDevCruAT_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUDTSYS", localUtil.ttoc( AV56TFDevCruDtSys, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVFIRMA4DIG", GXutil.rtrim( AV96TFDevFirma4dig));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVFIRMA4DIG_SEL", GXutil.rtrim( AV97TFDevFirma4dig_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV93EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV87Hash);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERDEVOLUCIONTEJIDO_1", AV113FilterDevolucionTejido_1);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERDEVOLUCIONTEJIDO_1", AV113FilterDevolucionTejido_1);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
         we1WG2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WG2( ) ;
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
      return formatLink("app.almacensindetalle.devoluciontejido_1ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenSinDetalle.DevolucionTejido_1WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Devolucion Tejido", "") ;
   }

   public void wb1WG0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcruid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcruid_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcruid_Internalname, GXutil.ltrim( localUtil.ntoc( AV100DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevcruid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV100DevCruId), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV100DevCruId), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcruid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcruid_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavDevcrustt.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDevcrustt.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDevcrustt, cmbavDevcrustt.getInternalname(), GXutil.rtrim( AV102DevCruStt), 1, cmbavDevcrustt.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavDevcrustt.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         cmbavDevcrustt.setValue( GXutil.rtrim( AV102DevCruStt) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDevcrustt.getInternalname(), "Values", cmbavDevcrustt.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV101Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV101Clicod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV101Clicod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrufecfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrufecfrom_Internalname, httpContext.getMessage( "Data Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDevcrufecfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrufecfrom_Internalname, localUtil.format(AV103DevCruFecfrom, "99/99/99"), localUtil.format( AV103DevCruFecfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrufecfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrufecfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDevcrufecfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDevcrufecfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrufecto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrufecto_Internalname, httpContext.getMessage( "Data Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDevcrufecto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrufecto_Internalname, localUtil.format(AV104DevCruFecto, "99/99/99"), localUtil.format( AV104DevCruFecto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrufecto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrufecto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDevcrufecto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDevcrufecto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_41_1WG2( true) ;
      }
      else
      {
         wb_table1_41_1WG2( false) ;
      }
      return  ;
   }

   public void wb_table1_41_1WG2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         startgridcontrol52( ) ;
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_52 = (int)(nGXsfl_52_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV80GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV81GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV117Pgmname), GXutil.rtrim( localUtil.format( AV117Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV78DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_90_1WG2( true) ;
      }
      else
      {
         wb_table2_90_1WG2( false) ;
      }
      return  ;
   }

   public void wb_table2_90_1WG2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_devcrusalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_devcrusalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_devcrusalauxdate_Internalname, localUtil.format(AV38DDO_DevCruSalAuxDate, "99/99/99"), localUtil.format( AV38DDO_DevCruSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_devcrusalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_devcrusalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_devcrudtsysauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_devcrudtsysauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_devcrudtsysauxdate_Internalname, localUtil.format(AV58DDO_DevCruDtSysAuxDate, "99/99/99"), localUtil.format( AV58DDO_DevCruDtSysAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_devcrudtsysauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_devcrudtsysauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 52 )
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

   public void start1WG2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Devolucion Tejido", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WG0( ) ;
   }

   public void ws1WG2( )
   {
      start1WG2( ) ;
      evt1WG2( ) ;
   }

   public void evt1WG2( )
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
                           e111WG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121WG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131WG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141WG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e151WG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161WG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDEVCRUID.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171WG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDEVCRUFECFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181WG2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDEVCRUFECTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e191WG2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_52_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_522( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV82GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           cmbDevCruEst.setName( cmbDevCruEst.getInternalname() );
                           cmbDevCruEst.setValue( httpContext.cgiGet( cmbDevCruEst.getInternalname()) );
                           A11671DevCruEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbDevCruEst.getInternalname()))) ;
                           cmbDevCruStt.setName( cmbDevCruStt.getInternalname() );
                           cmbDevCruStt.setValue( httpContext.cgiGet( cmbDevCruStt.getInternalname()) );
                           A11678DevCruStt = httpContext.cgiGet( cmbDevCruStt.getInternalname()) ;
                           A11670DevCruFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDevCruFec_Internalname), 0)) ;
                           A11673DevCruSal = localUtil.ctot( httpContext.cgiGet( edtDevCruSal_Internalname), 0) ;
                           A11680DevCruAtId = httpContext.cgiGet( edtDevCruAtId_Internalname) ;
                           A13983DevCruATCU = httpContext.cgiGet( edtDevCruATCU_Internalname) ;
                           cmbDevCruEnvA.setName( cmbDevCruEnvA.getInternalname() );
                           cmbDevCruEnvA.setValue( httpContext.cgiGet( cmbDevCruEnvA.getInternalname()) );
                           A11679DevCruEnvA = (byte)(GXutil.lval( httpContext.cgiGet( cmbDevCruEnvA.getInternalname()))) ;
                           cmbDevCruAT.setName( cmbDevCruAT.getInternalname() );
                           cmbDevCruAT.setValue( httpContext.cgiGet( cmbDevCruAT.getInternalname()) );
                           A11681DevCruAT = httpContext.cgiGet( cmbDevCruAT.getInternalname()) ;
                           A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( edtDevCruDtSy_Internalname), 0) ;
                           A14375DevFirma4d = httpContext.cgiGet( edtDevFirma4d_Internalname) ;
                           A11674DevCruHash = httpContext.cgiGet( edtDevCruHash_Internalname) ;
                           A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( edtDevCruGros_Internalname)) ;
                           A11682DevCruObs = httpContext.cgiGet( edtDevCruObs_Internalname) ;
                           A11675DevCruDesc = httpContext.cgiGet( edtDevCruDesc_Internalname) ;
                           A278CliNif = GXutil.upper( httpContext.cgiGet( edtCliNif_Internalname)) ;
                           A14395DevCruLine = (short)(localUtil.ctol( httpContext.cgiGet( edtDevCruLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13984DevCruSerA = httpContext.cgiGet( edtDevCruSerA_Internalname) ;
                           A13985DevCruTipA = httpContext.cgiGet( edtDevCruTipA_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e201WG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e211WG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221WG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e231WG2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Devcruid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDEVCRUID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV100DevCruId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Devcrustt Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDEVCRUSTT"), AV102DevCruStt) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV101Clicod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Devcrufecfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vDEVCRUFECFROM"), 0), AV103DevCruFecfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Devcrufecto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vDEVCRUFECTO"), 0), AV104DevCruFecto) ) )
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

   public void we1WG2( )
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

   public void pa1WG2( )
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
            GX_FocusControl = edtavDevcruid_Internalname ;
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
      subsflControlProps_522( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         sendrow_522( ) ;
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV100DevCruId ,
                                 String AV102DevCruStt ,
                                 int AV101Clicod ,
                                 java.util.Date AV103DevCruFecfrom ,
                                 java.util.Date AV104DevCruFecto ,
                                 String AV93EmprCod ,
                                 GXSimpleCollection<Byte> AV106TFDevCruEst_Sels ,
                                 java.util.Date AV36TFDevCruSal ,
                                 String AV66TFDevCruAtId ,
                                 String AV67TFDevCruAtId_Sel ,
                                 String AV72TFDevCruATCUD ,
                                 String AV73TFDevCruATCUD_Sel ,
                                 GXSimpleCollection<Byte> AV95TFDevCruEnvAT_Sels ,
                                 GXSimpleCollection<String> AV108TFDevCruAT_Sels ,
                                 java.util.Date AV56TFDevCruDtSys ,
                                 String AV96TFDevFirma4dig ,
                                 String AV97TFDevFirma4dig_Sel ,
                                 String AV117Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.util.Date Gx_date )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211WG2 ();
      GRID_nCurrentRecord = 0 ;
      rf1WG2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_1WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV117Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\devoluciontejido_1ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUSTT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A11678DevCruStt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUSTT", GXutil.rtrim( A11678DevCruStt));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUATID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A11680DevCruAtId, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUATID", GXutil.rtrim( A11680DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUENVA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUENVA", GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUSAL", getSecureSignedToken( "", localUtil.format( A11673DevCruSal, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUSAL", localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRULINE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A14395DevCruLine), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRULINE", GXutil.ltrim( localUtil.ntoc( A14395DevCruLine, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
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
      if ( cmbavDevcrustt.getItemCount() > 0 )
      {
         AV102DevCruStt = cmbavDevcrustt.getValidValue(AV102DevCruStt) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102DevCruStt", AV102DevCruStt);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDevcrustt.setValue( GXutil.rtrim( AV102DevCruStt) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDevcrustt.getInternalname(), "Values", cmbavDevcrustt.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1WG2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV117Pgmname = "AlmacenSinDetalle.DevolucionTejido_1WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117Pgmname", AV117Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WG2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(52) ;
      /* Execute user event: Refresh */
      e211WG2 ();
      nGXsfl_52_idx = 1 ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_522( ) ;
      bGXsfl_52_Refreshing = true ;
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
         subsflControlProps_522( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A11671DevCruEst) ,
                                              AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ,
                                              Byte.valueOf(A11679DevCruEnvA) ,
                                              AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ,
                                              A11681DevCruAT ,
                                              AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ,
                                              Integer.valueOf(AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels.size()) ,
                                              AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ,
                                              AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ,
                                              AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ,
                                              AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ,
                                              AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ,
                                              Integer.valueOf(AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels.size()) ,
                                              Integer.valueOf(AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels.size()) ,
                                              AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ,
                                              AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ,
                                              AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ,
                                              Integer.valueOf(AV100DevCruId) ,
                                              Integer.valueOf(AV101Clicod) ,
                                              AV103DevCruFecfrom ,
                                              AV104DevCruFecto ,
                                              A11673DevCruSal ,
                                              A11680DevCruAtId ,
                                              A13983DevCruATCU ,
                                              A11676DevCruDtSy ,
                                              A11674DevCruHash ,
                                              Integer.valueOf(A11669DevCruId) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A11670DevCruFec ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A11678DevCruStt ,
                                              AV102DevCruStt ,
                                              AV93EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid), 20, "%") ;
         lV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = GXutil.padr( GXutil.rtrim( AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud), 20, "%") ;
         lV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = GXutil.padr( GXutil.rtrim( AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig), 4, "%") ;
         /* Using cursor H01WG2 */
         pr_default.execute(0, new Object[] {AV93EmprCod, AV102DevCruStt, AV102DevCruStt, AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal, lV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid, AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel, lV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud, AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel, AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys, lV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig, AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel, Integer.valueOf(AV100DevCruId), Integer.valueOf(AV101Clicod), AV103DevCruFecfrom, AV104DevCruFecto, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_52_idx = 1 ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13985DevCruTipA = H01WG2_A13985DevCruTipA[0] ;
            A13984DevCruSerA = H01WG2_A13984DevCruSerA[0] ;
            A278CliNif = H01WG2_A278CliNif[0] ;
            A11675DevCruDesc = H01WG2_A11675DevCruDesc[0] ;
            A11682DevCruObs = H01WG2_A11682DevCruObs[0] ;
            A11677DevCruGros = H01WG2_A11677DevCruGros[0] ;
            A11676DevCruDtSy = H01WG2_A11676DevCruDtSy[0] ;
            A11681DevCruAT = H01WG2_A11681DevCruAT[0] ;
            A11679DevCruEnvA = H01WG2_A11679DevCruEnvA[0] ;
            A13983DevCruATCU = H01WG2_A13983DevCruATCU[0] ;
            A11680DevCruAtId = H01WG2_A11680DevCruAtId[0] ;
            A11673DevCruSal = H01WG2_A11673DevCruSal[0] ;
            A11670DevCruFec = H01WG2_A11670DevCruFec[0] ;
            A11678DevCruStt = H01WG2_A11678DevCruStt[0] ;
            A11671DevCruEst = H01WG2_A11671DevCruEst[0] ;
            A279CliNom = H01WG2_A279CliNom[0] ;
            A252CliCod = H01WG2_A252CliCod[0] ;
            A11674DevCruHash = H01WG2_A11674DevCruHash[0] ;
            A11669DevCruId = H01WG2_A11669DevCruId[0] ;
            A396EmprCod = H01WG2_A396EmprCod[0] ;
            A278CliNif = H01WG2_A278CliNif[0] ;
            A279CliNom = H01WG2_A279CliNom[0] ;
            GXt_int1 = A14395DevCruLine ;
            GXv_int2[0] = GXt_int1 ;
            new app.almacensindetalle.devoluciontejido_lineas(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_int2) ;
            devoluciontejido_1ww_impl.this.GXt_int1 = GXv_int2[0] ;
            A14395DevCruLine = GXt_int1 ;
            A14375DevFirma4d = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
            e221WG2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(52) ;
         wb1WG0( ) ;
      }
      bGXsfl_52_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1WG2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUSTT"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, GXutil.rtrim( localUtil.format( A11678DevCruStt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUATID"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, GXutil.rtrim( localUtil.format( A11680DevCruAtId, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUENVA"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUSAL"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( A11673DevCruSal, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRULINE"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(A14395DevCruLine), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV93EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
      AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = AV106TFDevCruEst_Sels ;
      AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = AV36TFDevCruSal ;
      AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = AV66TFDevCruAtId ;
      AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = AV67TFDevCruAtId_Sel ;
      AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = AV72TFDevCruATCUD ;
      AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = AV73TFDevCruATCUD_Sel ;
      AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = AV95TFDevCruEnvAT_Sels ;
      AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = AV108TFDevCruAT_Sels ;
      AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = AV56TFDevCruDtSys ;
      AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = AV96TFDevFirma4dig ;
      AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = AV97TFDevFirma4dig_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A11671DevCruEst) ,
                                           AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ,
                                           Byte.valueOf(A11679DevCruEnvA) ,
                                           AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ,
                                           A11681DevCruAT ,
                                           AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ,
                                           Integer.valueOf(AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels.size()) ,
                                           AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ,
                                           AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ,
                                           AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ,
                                           AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ,
                                           AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ,
                                           Integer.valueOf(AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels.size()) ,
                                           Integer.valueOf(AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels.size()) ,
                                           AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ,
                                           AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ,
                                           AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ,
                                           Integer.valueOf(AV100DevCruId) ,
                                           Integer.valueOf(AV101Clicod) ,
                                           AV103DevCruFecfrom ,
                                           AV104DevCruFecto ,
                                           A11673DevCruSal ,
                                           A11680DevCruAtId ,
                                           A13983DevCruATCU ,
                                           A11676DevCruDtSy ,
                                           A11674DevCruHash ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A11670DevCruFec ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A11678DevCruStt ,
                                           AV102DevCruStt ,
                                           AV93EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid), 20, "%") ;
      lV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = GXutil.padr( GXutil.rtrim( AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud), 20, "%") ;
      lV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = GXutil.padr( GXutil.rtrim( AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig), 4, "%") ;
      /* Using cursor H01WG3 */
      pr_default.execute(1, new Object[] {AV93EmprCod, AV102DevCruStt, AV102DevCruStt, AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal, lV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid, AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel, lV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud, AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel, AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys, lV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig, AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel, Integer.valueOf(AV100DevCruId), Integer.valueOf(AV101Clicod), AV103DevCruFecfrom, AV104DevCruFecto});
      GRID_nRecordCount = H01WG3_AGRID_nRecordCount[0] ;
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
      AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = AV106TFDevCruEst_Sels ;
      AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = AV36TFDevCruSal ;
      AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = AV66TFDevCruAtId ;
      AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = AV67TFDevCruAtId_Sel ;
      AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = AV72TFDevCruATCUD ;
      AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = AV73TFDevCruATCUD_Sel ;
      AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = AV95TFDevCruEnvAT_Sels ;
      AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = AV108TFDevCruAT_Sels ;
      AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = AV56TFDevCruDtSys ;
      AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = AV96TFDevFirma4dig ;
      AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = AV97TFDevFirma4dig_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV100DevCruId, AV102DevCruStt, AV101Clicod, AV103DevCruFecfrom, AV104DevCruFecto, AV93EmprCod, AV106TFDevCruEst_Sels, AV36TFDevCruSal, AV66TFDevCruAtId, AV67TFDevCruAtId_Sel, AV72TFDevCruATCUD, AV73TFDevCruATCUD_Sel, AV95TFDevCruEnvAT_Sels, AV108TFDevCruAT_Sels, AV56TFDevCruDtSys, AV96TFDevFirma4dig, AV97TFDevFirma4dig_Sel, AV117Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = AV106TFDevCruEst_Sels ;
      AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = AV36TFDevCruSal ;
      AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = AV66TFDevCruAtId ;
      AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = AV67TFDevCruAtId_Sel ;
      AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = AV72TFDevCruATCUD ;
      AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = AV73TFDevCruATCUD_Sel ;
      AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = AV95TFDevCruEnvAT_Sels ;
      AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = AV108TFDevCruAT_Sels ;
      AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = AV56TFDevCruDtSys ;
      AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = AV96TFDevFirma4dig ;
      AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = AV97TFDevFirma4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV100DevCruId, AV102DevCruStt, AV101Clicod, AV103DevCruFecfrom, AV104DevCruFecto, AV93EmprCod, AV106TFDevCruEst_Sels, AV36TFDevCruSal, AV66TFDevCruAtId, AV67TFDevCruAtId_Sel, AV72TFDevCruATCUD, AV73TFDevCruATCUD_Sel, AV95TFDevCruEnvAT_Sels, AV108TFDevCruAT_Sels, AV56TFDevCruDtSys, AV96TFDevFirma4dig, AV97TFDevFirma4dig_Sel, AV117Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = AV106TFDevCruEst_Sels ;
      AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = AV36TFDevCruSal ;
      AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = AV66TFDevCruAtId ;
      AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = AV67TFDevCruAtId_Sel ;
      AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = AV72TFDevCruATCUD ;
      AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = AV73TFDevCruATCUD_Sel ;
      AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = AV95TFDevCruEnvAT_Sels ;
      AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = AV108TFDevCruAT_Sels ;
      AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = AV56TFDevCruDtSys ;
      AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = AV96TFDevFirma4dig ;
      AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = AV97TFDevFirma4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV100DevCruId, AV102DevCruStt, AV101Clicod, AV103DevCruFecfrom, AV104DevCruFecto, AV93EmprCod, AV106TFDevCruEst_Sels, AV36TFDevCruSal, AV66TFDevCruAtId, AV67TFDevCruAtId_Sel, AV72TFDevCruATCUD, AV73TFDevCruATCUD_Sel, AV95TFDevCruEnvAT_Sels, AV108TFDevCruAT_Sels, AV56TFDevCruDtSys, AV96TFDevFirma4dig, AV97TFDevFirma4dig_Sel, AV117Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = AV106TFDevCruEst_Sels ;
      AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = AV36TFDevCruSal ;
      AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = AV66TFDevCruAtId ;
      AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = AV67TFDevCruAtId_Sel ;
      AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = AV72TFDevCruATCUD ;
      AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = AV73TFDevCruATCUD_Sel ;
      AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = AV95TFDevCruEnvAT_Sels ;
      AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = AV108TFDevCruAT_Sels ;
      AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = AV56TFDevCruDtSys ;
      AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = AV96TFDevFirma4dig ;
      AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = AV97TFDevFirma4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV100DevCruId, AV102DevCruStt, AV101Clicod, AV103DevCruFecfrom, AV104DevCruFecto, AV93EmprCod, AV106TFDevCruEst_Sels, AV36TFDevCruSal, AV66TFDevCruAtId, AV67TFDevCruAtId_Sel, AV72TFDevCruATCUD, AV73TFDevCruATCUD_Sel, AV95TFDevCruEnvAT_Sels, AV108TFDevCruAT_Sels, AV56TFDevCruDtSys, AV96TFDevFirma4dig, AV97TFDevFirma4dig_Sel, AV117Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = AV106TFDevCruEst_Sels ;
      AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = AV36TFDevCruSal ;
      AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = AV66TFDevCruAtId ;
      AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = AV67TFDevCruAtId_Sel ;
      AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = AV72TFDevCruATCUD ;
      AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = AV73TFDevCruATCUD_Sel ;
      AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = AV95TFDevCruEnvAT_Sels ;
      AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = AV108TFDevCruAT_Sels ;
      AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = AV56TFDevCruDtSys ;
      AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = AV96TFDevFirma4dig ;
      AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = AV97TFDevFirma4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV100DevCruId, AV102DevCruStt, AV101Clicod, AV103DevCruFecfrom, AV104DevCruFecto, AV93EmprCod, AV106TFDevCruEst_Sels, AV36TFDevCruSal, AV66TFDevCruAtId, AV67TFDevCruAtId_Sel, AV72TFDevCruATCUD, AV73TFDevCruATCUD_Sel, AV95TFDevCruEnvAT_Sels, AV108TFDevCruAT_Sels, AV56TFDevCruDtSys, AV96TFDevFirma4dig, AV97TFDevFirma4dig_Sel, AV117Pgmname, AV12OrderedBy, AV13OrderedDsc, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV117Pgmname = "AlmacenSinDetalle.DevolucionTejido_1WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117Pgmname", AV117Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WG0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201WG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV78DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV80GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV81GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDevcruid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDevcruid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDEVCRUID");
            GX_FocusControl = edtavDevcruid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV100DevCruId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100DevCruId), 8, 0));
         }
         else
         {
            AV100DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtavDevcruid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100DevCruId), 8, 0));
         }
         cmbavDevcrustt.setName( cmbavDevcrustt.getInternalname() );
         cmbavDevcrustt.setValue( httpContext.cgiGet( cmbavDevcrustt.getInternalname()) );
         AV102DevCruStt = httpContext.cgiGet( cmbavDevcrustt.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102DevCruStt", AV102DevCruStt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV101Clicod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101Clicod), 6, 0));
         }
         else
         {
            AV101Clicod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101Clicod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDevcrufecfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDEVCRUFECFROM");
            GX_FocusControl = edtavDevcrufecfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV103DevCruFecfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103DevCruFecfrom", localUtil.format(AV103DevCruFecfrom, "99/99/99"));
         }
         else
         {
            AV103DevCruFecfrom = localUtil.ctod( httpContext.cgiGet( edtavDevcrufecfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103DevCruFecfrom", localUtil.format(AV103DevCruFecfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDevcrufecto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDEVCRUFECTO");
            GX_FocusControl = edtavDevcrufecto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV104DevCruFecto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104DevCruFecto", localUtil.format(AV104DevCruFecto, "99/99/99"));
         }
         else
         {
            AV104DevCruFecto = localUtil.ctod( httpContext.cgiGet( edtavDevcrufecto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104DevCruFecto", localUtil.format(AV104DevCruFecto, "99/99/99"));
         }
         AV117Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV117Pgmname", AV117Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_devcrusalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DEVCRUSALAUXDATE");
            GX_FocusControl = edtavDdo_devcrusalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38DDO_DevCruSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_DevCruSalAuxDate", localUtil.format(AV38DDO_DevCruSalAuxDate, "99/99/99"));
         }
         else
         {
            AV38DDO_DevCruSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_devcrusalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_DevCruSalAuxDate", localUtil.format(AV38DDO_DevCruSalAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_devcrudtsysauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DEVCRUDTSYSAUXDATE");
            GX_FocusControl = edtavDdo_devcrudtsysauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58DDO_DevCruDtSysAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58DDO_DevCruDtSysAuxDate", localUtil.format(AV58DDO_DevCruDtSysAuxDate, "99/99/99"));
         }
         else
         {
            AV58DDO_DevCruDtSysAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_devcrudtsysauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58DDO_DevCruDtSysAuxDate", localUtil.format(AV58DDO_DevCruDtSysAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_52_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
         if ( nGXsfl_52_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV82GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActions), 4, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            cmbDevCruEst.setName( cmbDevCruEst.getInternalname() );
            cmbDevCruEst.setValue( httpContext.cgiGet( cmbDevCruEst.getInternalname()) );
            A11671DevCruEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbDevCruEst.getInternalname()))) ;
            cmbDevCruStt.setName( cmbDevCruStt.getInternalname() );
            cmbDevCruStt.setValue( httpContext.cgiGet( cmbDevCruStt.getInternalname()) );
            A11678DevCruStt = httpContext.cgiGet( cmbDevCruStt.getInternalname()) ;
            A11670DevCruFec = localUtil.ctod( httpContext.cgiGet( edtDevCruFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A11673DevCruSal = localUtil.ctot( httpContext.cgiGet( edtDevCruSal_Internalname)) ;
            A11680DevCruAtId = httpContext.cgiGet( edtDevCruAtId_Internalname) ;
            A13983DevCruATCU = httpContext.cgiGet( edtDevCruATCU_Internalname) ;
            cmbDevCruEnvA.setName( cmbDevCruEnvA.getInternalname() );
            cmbDevCruEnvA.setValue( httpContext.cgiGet( cmbDevCruEnvA.getInternalname()) );
            A11679DevCruEnvA = (byte)(GXutil.lval( httpContext.cgiGet( cmbDevCruEnvA.getInternalname()))) ;
            cmbDevCruAT.setName( cmbDevCruAT.getInternalname() );
            cmbDevCruAT.setValue( httpContext.cgiGet( cmbDevCruAT.getInternalname()) );
            A11681DevCruAT = httpContext.cgiGet( cmbDevCruAT.getInternalname()) ;
            A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( edtDevCruDtSy_Internalname)) ;
            A14375DevFirma4d = httpContext.cgiGet( edtDevFirma4d_Internalname) ;
            A11674DevCruHash = httpContext.cgiGet( edtDevCruHash_Internalname) ;
            A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( edtDevCruGros_Internalname)) ;
            A11682DevCruObs = httpContext.cgiGet( edtDevCruObs_Internalname) ;
            A11675DevCruDesc = httpContext.cgiGet( edtDevCruDesc_Internalname) ;
            A278CliNif = GXutil.upper( httpContext.cgiGet( edtCliNif_Internalname)) ;
            A14395DevCruLine = (short)(localUtil.ctol( httpContext.cgiGet( edtDevCruLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13984DevCruSerA = httpContext.cgiGet( edtDevCruSerA_Internalname) ;
            A13985DevCruTipA = httpContext.cgiGet( edtDevCruTipA_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_1WW");
         AV117Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV117Pgmname", AV117Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV117Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("almacensindetalle\\devoluciontejido_1ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDEVCRUID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV100DevCruId )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDEVCRUSTT"), AV102DevCruStt) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV101Clicod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vDEVCRUFECFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV103DevCruFecfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vDEVCRUFECTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV104DevCruFecto)) ) )
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
      e201WG2 ();
      if (returnInSub) return;
   }

   public void e201WG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV102DevCruStt = "T" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102DevCruStt", AV102DevCruStt);
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Devcrustt())==0) )
      {
         AV102DevCruStt = "T" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102DevCruStt", AV102DevCruStt);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Devcrufecto())) )
      {
         AV103DevCruFecfrom = AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103DevCruFecfrom", localUtil.format(AV103DevCruFecfrom, "99/99/99"));
         AV104DevCruFecto = AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Devcrufecto() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104DevCruFecto", localUtil.format(AV104DevCruFecto, "99/99/99"));
      }
      else
      {
         if ( (0==AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Devcruid()) )
         {
            AV103DevCruFecfrom = GXutil.dadd(Gx_date,-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103DevCruFecfrom", localUtil.format(AV103DevCruFecfrom, "99/99/99"));
            AV104DevCruFecto = Gx_date ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104DevCruFecto", localUtil.format(AV104DevCruFecto, "99/99/99"));
         }
      }
      GXt_char3 = AV90Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      devoluciontejido_1ww_impl.this.GXt_char3 = GXv_char4[0] ;
      AV90Station = GXt_char3 ;
      GXv_char4[0] = AV93EmprCod ;
      GXv_char5[0] = AV98EmprNom ;
      GXv_char6[0] = AV89Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV90Station, GXv_char4, GXv_char5, GXv_char6) ;
      devoluciontejido_1ww_impl.this.AV93EmprCod = GXv_char4[0] ;
      devoluciontejido_1ww_impl.this.AV98EmprNom = GXv_char5[0] ;
      devoluciontejido_1ww_impl.this.AV89Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93EmprCod", AV93EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Devolucion Tejido", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV78DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV78DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int9 = (byte)(AV112FirmaD) ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV93EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int10) ;
      devoluciontejido_1ww_impl.this.GXt_int9 = GXv_int10[0] ;
      AV112FirmaD = GXt_int9 ;
      GXt_char3 = AV88Path ;
      GXv_char6[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV93EmprCod, httpContext.getMessage( "CPRPEM", ""), GXv_char6) ;
      devoluciontejido_1ww_impl.this.GXt_char3 = GXv_char6[0] ;
      AV88Path = GXt_char3 ;
   }

   public void e211WG2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV80GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridCurrentPage), 10, 0));
      AV81GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      edtDevCruId_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Columnheaderclass", edtDevCruId_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtCliCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Columnheaderclass", edtCliCod_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtCliNom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Columnheaderclass", edtCliNom_Columnheaderclass, !bGXsfl_52_Refreshing);
      cmbDevCruEst.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruEst.getInternalname(), "Columnheaderclass", cmbDevCruEst.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      cmbDevCruStt.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruStt.getInternalname(), "Columnheaderclass", cmbDevCruStt.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      edtDevCruFec_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruFec_Internalname, "Columnheaderclass", edtDevCruFec_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtDevCruSal_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruSal_Internalname, "Columnheaderclass", edtDevCruSal_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtDevCruAtId_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAtId_Internalname, "Columnheaderclass", edtDevCruAtId_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtDevCruATCU_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruATCU_Internalname, "Columnheaderclass", edtDevCruATCU_Columnheaderclass, !bGXsfl_52_Refreshing);
      cmbDevCruEnvA.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruEnvA.getInternalname(), "Columnheaderclass", cmbDevCruEnvA.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      cmbDevCruAT.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruAT.getInternalname(), "Columnheaderclass", cmbDevCruAT.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      edtDevCruDtSy_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDtSy_Internalname, "Columnheaderclass", edtDevCruDtSy_Columnheaderclass, !bGXsfl_52_Refreshing);
      edtDevFirma4d_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFirma4d_Internalname, "Columnheaderclass", edtDevFirma4d_Columnheaderclass, !bGXsfl_52_Refreshing);
      AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = AV106TFDevCruEst_Sels ;
      AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = AV36TFDevCruSal ;
      AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = AV66TFDevCruAtId ;
      AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = AV67TFDevCruAtId_Sel ;
      AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = AV72TFDevCruATCUD ;
      AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = AV73TFDevCruATCUD_Sel ;
      AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = AV95TFDevCruEnvAT_Sels ;
      AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = AV108TFDevCruAT_Sels ;
      AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = AV56TFDevCruDtSys ;
      AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = AV96TFDevFirma4dig ;
      AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = AV97TFDevFirma4dig_Sel ;
      /*  Sending Event outputs  */
   }

   public void e111WG2( )
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
         AV79PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV79PageToGo) ;
      }
   }

   public void e121WG2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131WG2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruEst") == 0 )
         {
            AV105TFDevCruEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFDevCruEst_SelsJson", AV105TFDevCruEst_SelsJson);
            AV106TFDevCruEst_Sels.fromJSonString(GXutil.strReplace( AV105TFDevCruEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruSal") == 0 )
         {
            AV36TFDevCruSal = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFDevCruSal", localUtil.ttoc( AV36TFDevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruAtId") == 0 )
         {
            AV66TFDevCruAtId = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFDevCruAtId", AV66TFDevCruAtId);
            AV67TFDevCruAtId_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFDevCruAtId_Sel", AV67TFDevCruAtId_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruATCUD") == 0 )
         {
            AV72TFDevCruATCUD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFDevCruATCUD", AV72TFDevCruATCUD);
            AV73TFDevCruATCUD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFDevCruATCUD_Sel", AV73TFDevCruATCUD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruEnvAT") == 0 )
         {
            AV94TFDevCruEnvAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFDevCruEnvAT_SelsJson", AV94TFDevCruEnvAT_SelsJson);
            AV95TFDevCruEnvAT_Sels.fromJSonString(GXutil.strReplace( AV94TFDevCruEnvAT_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruAT") == 0 )
         {
            AV107TFDevCruAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFDevCruAT_SelsJson", AV107TFDevCruAT_SelsJson);
            AV108TFDevCruAT_Sels.fromJSonString(AV107TFDevCruAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruDtSys") == 0 )
         {
            AV56TFDevCruDtSys = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFDevCruDtSys", localUtil.ttoc( AV56TFDevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevFirma4dig") == 0 )
         {
            AV96TFDevFirma4dig = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFDevFirma4dig", AV96TFDevFirma4dig);
            AV97TFDevFirma4dig_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFDevFirma4dig_Sel", AV97TFDevFirma4dig_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV108TFDevCruAT_Sels", AV108TFDevCruAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV95TFDevCruEnvAT_Sels", AV95TFDevCruEnvAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV106TFDevCruEst_Sels", AV106TFDevCruEst_Sels);
   }

   private void e221WG2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Anular GUIA", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      if ( 1 == 2 )
      {
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar Lineas Documento", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Lineas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      if ( 1 == 2 )
      {
         cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Crear Hash", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Envio AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Entrada Manual Codigo de AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.setColumnClass( ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWActionGroupColumn") );
      edtDevCruId_Columnclass = ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtCliCod_Columnclass = ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtCliNom_Columnclass = ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      cmbDevCruEst.setColumnClass( ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      cmbDevCruStt.setColumnClass( ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      edtDevCruFec_Columnclass = ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtDevCruSal_Columnclass = ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtDevCruAtId_Columnclass = ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtDevCruATCU_Columnclass = ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      cmbDevCruEnvA.setColumnClass( ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      cmbDevCruAT.setColumnClass( ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      edtDevCruDtSy_Columnclass = ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtDevFirma4d_Columnclass = ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(52) ;
      }
      sendrow_522( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_52_Refreshing )
      {
         httpContext.doAjaxLoad(52, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV82GridActions, 4, 0)) );
   }

   public void e231WG2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV82GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV82GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV82GridActions == 3 )
      {
         /* Execute user subroutine: 'DO ANULARGUIA' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV82GridActions == 4 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV82GridActions == 5 )
      {
         /* Execute user subroutine: 'DO LINEASV02' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV82GridActions == 6 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV82GridActions == 7 )
      {
         /* Execute user subroutine: 'DO CREARHASH' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV82GridActions == 8 )
      {
         /* Execute user subroutine: 'DO ENVIOAT' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV82GridActions == 9 )
      {
         /* Execute user subroutine: 'DO MANUALCODIGOAT' */
         S242 ();
         if (returnInSub) return;
      }
      AV82GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV82GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e141WG2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S252 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e151WG2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.almacensindetalle.devoluciontejido_1", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","DevCruId"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.almacensindetalle.devoluciontejido_1", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0))}, new String[] {"Mode","EmprCod","DevCruId"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11678DevCruStt, httpContext.getMessage( "A", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia ANULADA", ""));
      }
      else
      {
         if ( ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) || ( A11679DevCruEnvA == 3 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""));
         }
         else
         {
            callWebObject(formatLink("app.almacensindetalle.devoluciontejido_1", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0))}, new String[] {"Mode","EmprCod","DevCruId"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
   }

   public void S182( )
   {
      /* 'DO ANULARGUIA' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11678DevCruStt, "A") == 0 )
      {
         Gx_msg = httpContext.getMessage( "Este Guia foi ANULADA", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( (GXutil.strcmp("", A11680DevCruAtId)==0) )
         {
            Gx_msg = httpContext.getMessage( "Este guia não tem código AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( A11679DevCruEnvA == 0 )
            {
               Gx_msg = httpContext.getMessage( "Este guia não foi enviado para a AT", "") ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               httpContext.popup(formatLink("app.almacensindetalle.devoluciontejido_anulacion", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A11676DevCruDtSy)),GXutil.URLEncode(GXutil.formatDateTimeParm(A11673DevCruSal)),GXutil.URLEncode(GXutil.formatDateParm(A11670DevCruFec)),GXutil.URLEncode(GXutil.rtrim(A11680DevCruAtId))}, new String[] {"EmprCod","DevCruId","DevCruDtSys","DevCruSal","DevCruFec","DevCruAtId"}) , new Object[] {});
            }
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( A14395DevCruLine == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta GUIA, NO tiene Lineas", ""));
      }
      else
      {
         if ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A11680DevCruAtId ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( A11679DevCruEnvA == 3 )
            {
               Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               AV131Emprcod_selected = A396EmprCod ;
               AV132Devcruid_selected = A11669DevCruId ;
               this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
            }
         }
      }
   }

   public void S252( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.pdeldevcru(remoteHandle, context).execute( A396EmprCod, A11669DevCruId) ;
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO LINEASV02' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.almacensindetalle.devoluciontejido_8", new String[] {GXutil.URLEncode(GXutil.rtrim(AV93EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateParm(A11670DevCruFec)),GXutil.URLEncode(GXutil.ltrimstr(A11679DevCruEnvA,1,0)),GXutil.URLEncode(GXutil.rtrim(A11680DevCruAtId)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A11676DevCruDtSy))}, new String[] {"EmprCod","DevCruId","DevCruFec","DevCruEnvA","DevCruAtId","CliCod","DevCruDtSys"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.almacensindetalle.imprimirdevolucion", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0))}, new String[] {"Emprcod","DevCruId"}) , new Object[] {"A396EmprCod","A11669DevCruId"});
      httpContext.doAjaxRefresh();
   }

   public void S222( )
   {
      /* 'DO CREARHASH' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV111msg_control ;
      new app.devoluciontejido_ctrlhashanterior_2(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_char6) ;
      devoluciontejido_1ww_impl.this.AV111msg_control = GXv_char6[0] ;
      if ( ! (GXutil.strcmp("", AV111msg_control)==0) )
      {
         httpContext.GX_msglist.addItem(AV111msg_control);
      }
      else
      {
         if ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A11680DevCruAtId ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( A11679DevCruEnvA == 3 )
            {
               Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               if ( GXutil.dateCompare(GXutil.nullDate(), A11673DevCruSal) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fecha-Hora Salida", ""));
               }
               else
               {
                  if ( GXutil.dateCompare(GXutil.nullDate(), A11676DevCruDtSy) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fecha-Hora System", ""));
                  }
                  else
                  {
                     if ( A11673DevCruSal.before( A11676DevCruDtSy ) )
                     {
                        Gx_msg = httpContext.getMessage( "Erro. Dia-Hora ", "") + localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a ", "") + localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                        httpContext.GX_msglist.addItem(Gx_msg);
                     }
                     else
                     {
                        GXv_char6[0] = A396EmprCod ;
                        GXv_int12[0] = A11669DevCruId ;
                        GXv_date13[0] = A11670DevCruFec ;
                        GXv_dtime14[0] = A11676DevCruDtSy ;
                        GXv_int10[0] = (byte)(3) ;
                        GXv_int15[0] = (byte)(1) ;
                        GXv_char5[0] = AV86Cadena ;
                        new app.almacensindetalle.obtengocadenaparahashdevolucionalmacen(remoteHandle, context).execute( GXv_char6, GXv_int12, GXv_date13, GXv_dtime14, GXv_int10, GXv_int15, GXv_char5) ;
                        devoluciontejido_1ww_impl.this.A396EmprCod = GXv_char6[0] ;
                        devoluciontejido_1ww_impl.this.A11669DevCruId = GXv_int12[0] ;
                        devoluciontejido_1ww_impl.this.A11670DevCruFec = GXv_date13[0] ;
                        devoluciontejido_1ww_impl.this.A11676DevCruDtSy = GXv_dtime14[0] ;
                        devoluciontejido_1ww_impl.this.AV86Cadena = GXv_char5[0] ;
                        GXv_char6[0] = AV87Hash ;
                        GXv_objcol_SdtMessages_Message16[0] = AV91Messages ;
                        GXv_boolean17[0] = AV92OK ;
                        new app.hash_obtener(remoteHandle, context).execute( AV86Cadena, GXv_char6, GXv_objcol_SdtMessages_Message16, GXv_boolean17) ;
                        devoluciontejido_1ww_impl.this.AV87Hash = GXv_char6[0] ;
                        AV91Messages = GXv_objcol_SdtMessages_Message16[0] ;
                        devoluciontejido_1ww_impl.this.AV92OK = GXv_boolean17[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV87Hash", AV87Hash);
                        if ( ! AV92OK )
                        {
                           AV133GXV1 = 1 ;
                           while ( AV133GXV1 <= AV91Messages.size() )
                           {
                              AV99Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV91Messages.elementAt(-1+AV133GXV1));
                              httpContext.GX_msglist.addItem(AV99Message.getgxTv_SdtMessages_Message_Description());
                              AV133GXV1 = (int)(AV133GXV1+1) ;
                           }
                        }
                        else
                        {
                           httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
                           GXv_char6[0] = A396EmprCod ;
                           GXv_int12[0] = A11669DevCruId ;
                           GXv_char5[0] = AV86Cadena ;
                           GXv_char4[0] = AV87Hash ;
                           new app.almacensindetalle.actualizohashdevolucionalmacen(remoteHandle, context).execute( GXv_char6, GXv_int12, GXv_char5, GXv_char4) ;
                           devoluciontejido_1ww_impl.this.A396EmprCod = GXv_char6[0] ;
                           devoluciontejido_1ww_impl.this.A11669DevCruId = GXv_int12[0] ;
                           devoluciontejido_1ww_impl.this.AV86Cadena = GXv_char5[0] ;
                           devoluciontejido_1ww_impl.this.AV87Hash = GXv_char4[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV87Hash", AV87Hash);
                           httpContext.doAjaxRefresh();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void S232( )
   {
      /* 'DO ENVIOAT' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A11680DevCruAtId ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( A11679DevCruEnvA == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.almacensindetalle.devoluciontejido_fechahorasalida_xml_envio_at", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A11676DevCruDtSy)),GXutil.URLEncode(GXutil.rtrim(AV87Hash))}, new String[] {"EmprCod","DevCruId","DevCruDtSys","Hash"}) , new Object[] {});
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO MANUALCODIGOAT' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A11680DevCruAtId ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( A11679DevCruEnvA == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.almacensindetalle.devoluciontejido_4", new String[] {GXutil.URLEncode(GXutil.rtrim(AV93EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A11673DevCruSal)),GXutil.URLEncode(GXutil.formatDateTimeParm(A11676DevCruDtSy)),GXutil.URLEncode(GXutil.rtrim(A278CliNif))}, new String[] {"Emprcod","DevCruId","DevCruSal","DevCruDtSys","CliNif"}) , new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV117Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV117Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV117Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV134GXV2 = 1 ;
      while ( AV134GXV2 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV134GXV2));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUEST_SEL") == 0 )
         {
            AV105TFDevCruEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFDevCruEst_SelsJson", AV105TFDevCruEst_SelsJson);
            AV106TFDevCruEst_Sels.fromJSonString(AV105TFDevCruEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSAL") == 0 )
         {
            AV36TFDevCruSal = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFDevCruSal", localUtil.ttoc( AV36TFDevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV38DDO_DevCruSalAuxDate = GXutil.resetTime(AV36TFDevCruSal) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_DevCruSalAuxDate", localUtil.format(AV38DDO_DevCruSalAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID") == 0 )
         {
            AV66TFDevCruAtId = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFDevCruAtId", AV66TFDevCruAtId);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID_SEL") == 0 )
         {
            AV67TFDevCruAtId_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFDevCruAtId_Sel", AV67TFDevCruAtId_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATCUD") == 0 )
         {
            AV72TFDevCruATCUD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFDevCruATCUD", AV72TFDevCruATCUD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATCUD_SEL") == 0 )
         {
            AV73TFDevCruATCUD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFDevCruATCUD_Sel", AV73TFDevCruATCUD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUENVAT_SEL") == 0 )
         {
            AV94TFDevCruEnvAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFDevCruEnvAT_SelsJson", AV94TFDevCruEnvAT_SelsJson);
            AV95TFDevCruEnvAT_Sels.fromJSonString(AV94TFDevCruEnvAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUAT_SEL") == 0 )
         {
            AV107TFDevCruAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFDevCruAT_SelsJson", AV107TFDevCruAT_SelsJson);
            AV108TFDevCruAT_Sels.fromJSonString(AV107TFDevCruAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDTSYS") == 0 )
         {
            AV56TFDevCruDtSys = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFDevCruDtSys", localUtil.ttoc( AV56TFDevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV58DDO_DevCruDtSysAuxDate = GXutil.resetTime(AV56TFDevCruDtSys) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58DDO_DevCruDtSysAuxDate", localUtil.format(AV58DDO_DevCruDtSysAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVFIRMA4DIG") == 0 )
         {
            AV96TFDevFirma4dig = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFDevFirma4dig", AV96TFDevFirma4dig);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVFIRMA4DIG_SEL") == 0 )
         {
            AV97TFDevFirma4dig_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFDevFirma4dig_Sel", AV97TFDevFirma4dig_Sel);
         }
         AV134GXV2 = (int)(AV134GXV2+1) ;
      }
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFDevCruAtId_Sel)==0), AV67TFDevCruAtId_Sel, GXv_char6) ;
      devoluciontejido_1ww_impl.this.GXt_char3 = GXv_char6[0] ;
      GXt_char18 = "" ;
      GXv_char5[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFDevCruATCUD_Sel)==0), AV73TFDevCruATCUD_Sel, GXv_char5) ;
      devoluciontejido_1ww_impl.this.GXt_char18 = GXv_char5[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV108TFDevCruAT_Sels.size()==0), AV107TFDevCruAT_SelsJson, GXv_char4) ;
      devoluciontejido_1ww_impl.this.GXt_char19 = GXv_char4[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV97TFDevFirma4dig_Sel)==0), AV97TFDevFirma4dig_Sel, GXv_char21) ;
      devoluciontejido_1ww_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+((AV106TFDevCruEst_Sels.size()==0) ? "" : AV105TFDevCruEst_SelsJson)+"||||"+GXt_char3+"|"+GXt_char18+"|"+((AV95TFDevCruEnvAT_Sels.size()==0) ? "" : AV94TFDevCruEnvAT_SelsJson)+"|"+GXt_char19+"||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFDevCruAtId)==0), AV66TFDevCruAtId, GXv_char21) ;
      devoluciontejido_1ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char19 = "" ;
      GXv_char6[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFDevCruATCUD)==0), AV72TFDevCruATCUD, GXv_char6) ;
      devoluciontejido_1ww_impl.this.GXt_char19 = GXv_char6[0] ;
      GXt_char18 = "" ;
      GXv_char5[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV96TFDevFirma4dig)==0), AV96TFDevFirma4dig, GXv_char5) ;
      devoluciontejido_1ww_impl.this.GXt_char18 = GXv_char5[0] ;
      Ddo_grid_Filteredtext_set = "||||||"+(GXutil.dateCompare(GXutil.nullDate(), AV36TFDevCruSal) ? "" : localUtil.dtoc( AV38DDO_DevCruSalAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char20+"|"+GXt_char19+"|||"+(GXutil.dateCompare(GXutil.nullDate(), AV56TFDevCruDtSys) ? "" : localUtil.dtoc( AV58DDO_DevCruDtSysAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char18 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV117Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFDEVCRUEST_SEL", "", !(AV106TFDevCruEst_Sels.size()==0), (short)(0), AV106TFDevCruEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFDEVCRUSAL", "", !GXutil.dateCompare(GXutil.nullDate(), AV36TFDevCruSal), (short)(0), GXutil.trim( localUtil.ttoc( AV36TFDevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFDEVCRUATID", "", !(GXutil.strcmp("", AV66TFDevCruAtId)==0), (short)(0), AV66TFDevCruAtId, "", !(GXutil.strcmp("", AV67TFDevCruAtId_Sel)==0), AV67TFDevCruAtId_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFDEVCRUATCUD", "", !(GXutil.strcmp("", AV72TFDevCruATCUD)==0), (short)(0), AV72TFDevCruATCUD, "", !(GXutil.strcmp("", AV73TFDevCruATCUD_Sel)==0), AV73TFDevCruATCUD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFDEVCRUENVAT_SEL", "", !(AV95TFDevCruEnvAT_Sels.size()==0), (short)(0), AV95TFDevCruEnvAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFDEVCRUAT_SEL", "", !(AV108TFDevCruAT_Sels.size()==0), (short)(0), AV108TFDevCruAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFDEVCRUDTSYS", "", !GXutil.dateCompare(GXutil.nullDate(), AV56TFDevCruDtSys), (short)(0), GXutil.trim( localUtil.ttoc( AV56TFDevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFDEVFIRMA4DIG", "", !(GXutil.strcmp("", AV96TFDevFirma4dig)==0), (short)(0), AV96TFDevFirma4dig, "", !(GXutil.strcmp("", AV97TFDevFirma4dig_Sel)==0), AV97TFDevFirma4dig_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV117Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV117Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "AlmacenSinDetalle.DevolucionTejido_1" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e161WG2( )
   {
      /* Clicod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113FilterDevolucionTejido_1", AV113FilterDevolucionTejido_1);
   }

   public void e171WG2( )
   {
      /* Devcruid_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV100DevCruId) )
      {
         AV103DevCruFecfrom = GXutil.dadd(Gx_date,-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103DevCruFecfrom", localUtil.format(AV103DevCruFecfrom, "99/99/99"));
         AV104DevCruFecto = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104DevCruFecto", localUtil.format(AV104DevCruFecto, "99/99/99"));
         AV101Clicod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101Clicod), 6, 0));
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S262 ();
         if (returnInSub) return;
      }
      else
      {
         AV103DevCruFecfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103DevCruFecfrom", localUtil.format(AV103DevCruFecfrom, "99/99/99"));
         AV104DevCruFecto = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104DevCruFecto", localUtil.format(AV104DevCruFecto, "99/99/99"));
         AV101Clicod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101Clicod), 6, 0));
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S262 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113FilterDevolucionTejido_1", AV113FilterDevolucionTejido_1);
   }

   public void e181WG2( )
   {
      /* Devcrufecfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113FilterDevolucionTejido_1", AV113FilterDevolucionTejido_1);
   }

   public void e191WG2( )
   {
      /* Devcrufecto_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV113FilterDevolucionTejido_1", AV113FilterDevolucionTejido_1);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV113FilterDevolucionTejido_1.fromJSonString(AV114WebSession.getValue(httpContext.getMessage( "FilterDevolucionTejido_1", "")), null);
      AV100DevCruId = AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Devcruid() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100DevCruId), 8, 0));
      AV102DevCruStt = AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Devcrustt() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102DevCruStt", AV102DevCruStt);
      AV101Clicod = AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Clicod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101Clicod), 6, 0));
      AV103DevCruFecfrom = AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103DevCruFecfrom", localUtil.format(AV103DevCruFecfrom, "99/99/99"));
      AV104DevCruFecto = AV113FilterDevolucionTejido_1.getgxTv_SdtFilterDevolucionTejido_1_Devcrufecto() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104DevCruFecto", localUtil.format(AV104DevCruFecto, "99/99/99"));
   }

   public void S262( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV113FilterDevolucionTejido_1.setgxTv_SdtFilterDevolucionTejido_1_Clicod( AV101Clicod );
      AV113FilterDevolucionTejido_1.setgxTv_SdtFilterDevolucionTejido_1_Devcruid( AV100DevCruId );
      AV113FilterDevolucionTejido_1.setgxTv_SdtFilterDevolucionTejido_1_Devcrustt( AV102DevCruStt );
      AV113FilterDevolucionTejido_1.setgxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom( AV103DevCruFecfrom );
      AV113FilterDevolucionTejido_1.setgxTv_SdtFilterDevolucionTejido_1_Devcrufecto( AV104DevCruFecto );
      AV114WebSession.setValue(httpContext.getMessage( "FilterDevolucionTejido_1", ""), AV113FilterDevolucionTejido_1.toJSonString(false, true));
   }

   public void wb_table2_90_1WG2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_90_1WG2e( true) ;
      }
      else
      {
         wb_table2_90_1WG2e( false) ;
      }
   }

   public void wb_table1_41_1WG2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_41_1WG2e( true) ;
      }
      else
      {
         wb_table1_41_1WG2e( false) ;
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
      pa1WG2( ) ;
      ws1WG2( ) ;
      we1WG2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614186", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/devoluciontejido_1ww.js", "?20268211614187", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_522( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_52_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_52_idx ;
      edtDevCruId_Internalname = "DEVCRUID_"+sGXsfl_52_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_52_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_52_idx ;
      cmbDevCruEst.setInternalname( "DEVCRUEST_"+sGXsfl_52_idx );
      cmbDevCruStt.setInternalname( "DEVCRUSTT_"+sGXsfl_52_idx );
      edtDevCruFec_Internalname = "DEVCRUFEC_"+sGXsfl_52_idx ;
      edtDevCruSal_Internalname = "DEVCRUSAL_"+sGXsfl_52_idx ;
      edtDevCruAtId_Internalname = "DEVCRUATID_"+sGXsfl_52_idx ;
      edtDevCruATCU_Internalname = "DEVCRUATCU_"+sGXsfl_52_idx ;
      cmbDevCruEnvA.setInternalname( "DEVCRUENVA_"+sGXsfl_52_idx );
      cmbDevCruAT.setInternalname( "DEVCRUAT_"+sGXsfl_52_idx );
      edtDevCruDtSy_Internalname = "DEVCRUDTSY_"+sGXsfl_52_idx ;
      edtDevFirma4d_Internalname = "DEVFIRMA4D_"+sGXsfl_52_idx ;
      edtDevCruHash_Internalname = "DEVCRUHASH_"+sGXsfl_52_idx ;
      edtDevCruGros_Internalname = "DEVCRUGROS_"+sGXsfl_52_idx ;
      edtDevCruObs_Internalname = "DEVCRUOBS_"+sGXsfl_52_idx ;
      edtDevCruDesc_Internalname = "DEVCRUDESC_"+sGXsfl_52_idx ;
      edtCliNif_Internalname = "CLINIF_"+sGXsfl_52_idx ;
      edtDevCruLine_Internalname = "DEVCRULINE_"+sGXsfl_52_idx ;
      edtDevCruSerA_Internalname = "DEVCRUSERA_"+sGXsfl_52_idx ;
      edtDevCruTipA_Internalname = "DEVCRUTIPA_"+sGXsfl_52_idx ;
   }

   public void subsflControlProps_fel_522( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_52_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_52_fel_idx ;
      edtDevCruId_Internalname = "DEVCRUID_"+sGXsfl_52_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_52_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_52_fel_idx ;
      cmbDevCruEst.setInternalname( "DEVCRUEST_"+sGXsfl_52_fel_idx );
      cmbDevCruStt.setInternalname( "DEVCRUSTT_"+sGXsfl_52_fel_idx );
      edtDevCruFec_Internalname = "DEVCRUFEC_"+sGXsfl_52_fel_idx ;
      edtDevCruSal_Internalname = "DEVCRUSAL_"+sGXsfl_52_fel_idx ;
      edtDevCruAtId_Internalname = "DEVCRUATID_"+sGXsfl_52_fel_idx ;
      edtDevCruATCU_Internalname = "DEVCRUATCU_"+sGXsfl_52_fel_idx ;
      cmbDevCruEnvA.setInternalname( "DEVCRUENVA_"+sGXsfl_52_fel_idx );
      cmbDevCruAT.setInternalname( "DEVCRUAT_"+sGXsfl_52_fel_idx );
      edtDevCruDtSy_Internalname = "DEVCRUDTSY_"+sGXsfl_52_fel_idx ;
      edtDevFirma4d_Internalname = "DEVFIRMA4D_"+sGXsfl_52_fel_idx ;
      edtDevCruHash_Internalname = "DEVCRUHASH_"+sGXsfl_52_fel_idx ;
      edtDevCruGros_Internalname = "DEVCRUGROS_"+sGXsfl_52_fel_idx ;
      edtDevCruObs_Internalname = "DEVCRUOBS_"+sGXsfl_52_fel_idx ;
      edtDevCruDesc_Internalname = "DEVCRUDESC_"+sGXsfl_52_fel_idx ;
      edtCliNif_Internalname = "CLINIF_"+sGXsfl_52_fel_idx ;
      edtDevCruLine_Internalname = "DEVCRULINE_"+sGXsfl_52_fel_idx ;
      edtDevCruSerA_Internalname = "DEVCRUSERA_"+sGXsfl_52_fel_idx ;
      edtDevCruTipA_Internalname = "DEVCRUTIPA_"+sGXsfl_52_fel_idx ;
   }

   public void sendrow_522( )
   {
      subsflControlProps_522( ) ;
      wb1WG0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_52_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_52_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_52_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV82GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV82GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV82GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_52_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,53);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV82GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruId_Internalname,GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtDevCruId_Columnclass,edtDevCruId_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCod_Columnclass,edtCliCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliNom_Columnclass,edtCliNom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbDevCruEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DEVCRUEST_" + sGXsfl_52_idx ;
            cmbDevCruEst.setName( GXCCtl );
            cmbDevCruEst.setWebtags( "" );
            cmbDevCruEst.addItem("0", httpContext.getMessage( "Pdte. Imprimir", ""), (short)(0));
            cmbDevCruEst.addItem("1", httpContext.getMessage( "Imprimido", ""), (short)(0));
            if ( cmbDevCruEst.getItemCount() > 0 )
            {
               A11671DevCruEst = (byte)(GXutil.lval( cmbDevCruEst.getValidValue(GXutil.trim( GXutil.str( A11671DevCruEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDevCruEst,cmbDevCruEst.getInternalname(),GXutil.trim( GXutil.str( A11671DevCruEst, 1, 0)),Integer.valueOf(1),cmbDevCruEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbDevCruEst.getColumnClass(),cmbDevCruEst.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbDevCruEst.setValue( GXutil.trim( GXutil.str( A11671DevCruEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDevCruEst.getInternalname(), "Values", cmbDevCruEst.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbDevCruStt.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DEVCRUSTT_" + sGXsfl_52_idx ;
            cmbDevCruStt.setName( GXCCtl );
            cmbDevCruStt.setWebtags( "" );
            cmbDevCruStt.addItem("", httpContext.getMessage( "Em preparação ", ""), (short)(0));
            cmbDevCruStt.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
            cmbDevCruStt.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
            if ( cmbDevCruStt.getItemCount() > 0 )
            {
               A11678DevCruStt = cmbDevCruStt.getValidValue(A11678DevCruStt) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDevCruStt,cmbDevCruStt.getInternalname(),GXutil.rtrim( A11678DevCruStt),Integer.valueOf(1),cmbDevCruStt.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbDevCruStt.getColumnClass(),cmbDevCruStt.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbDevCruStt.setValue( GXutil.rtrim( A11678DevCruStt) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDevCruStt.getInternalname(), "Values", cmbDevCruStt.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruFec_Internalname,localUtil.format(A11670DevCruFec, "99/99/99"),localUtil.format( A11670DevCruFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtDevCruFec_Columnclass,edtDevCruFec_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruSal_Internalname,localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11673DevCruSal, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtDevCruSal_Columnclass,edtDevCruSal_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruAtId_Internalname,GXutil.rtrim( A11680DevCruAtId),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruAtId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtDevCruAtId_Columnclass,edtDevCruAtId_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruATCU_Internalname,GXutil.rtrim( A13983DevCruATCU),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruATCU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtDevCruATCU_Columnclass,edtDevCruATCU_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbDevCruEnvA.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DEVCRUENVA_" + sGXsfl_52_idx ;
            cmbDevCruEnvA.setName( GXCCtl );
            cmbDevCruEnvA.setWebtags( "" );
            cmbDevCruEnvA.addItem("0", httpContext.getMessage( "Pdte. Envio AT", ""), (short)(0));
            cmbDevCruEnvA.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
            if ( cmbDevCruEnvA.getItemCount() > 0 )
            {
               A11679DevCruEnvA = (byte)(GXutil.lval( cmbDevCruEnvA.getValidValue(GXutil.trim( GXutil.str( A11679DevCruEnvA, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDevCruEnvA,cmbDevCruEnvA.getInternalname(),GXutil.trim( GXutil.str( A11679DevCruEnvA, 1, 0)),Integer.valueOf(1),cmbDevCruEnvA.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbDevCruEnvA.getColumnClass(),cmbDevCruEnvA.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbDevCruEnvA.setValue( GXutil.trim( GXutil.str( A11679DevCruEnvA, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDevCruEnvA.getInternalname(), "Values", cmbDevCruEnvA.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbDevCruAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DEVCRUAT_" + sGXsfl_52_idx ;
            cmbDevCruAT.setName( GXCCtl );
            cmbDevCruAT.setWebtags( "" );
            cmbDevCruAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
            cmbDevCruAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
            if ( cmbDevCruAT.getItemCount() > 0 )
            {
               A11681DevCruAT = cmbDevCruAT.getValidValue(A11681DevCruAT) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDevCruAT,cmbDevCruAT.getInternalname(),GXutil.rtrim( A11681DevCruAT),Integer.valueOf(1),cmbDevCruAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbDevCruAT.getColumnClass(),cmbDevCruAT.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbDevCruAT.setValue( GXutil.rtrim( A11681DevCruAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDevCruAT.getInternalname(), "Values", cmbDevCruAT.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruDtSy_Internalname,localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruDtSy_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtDevCruDtSy_Columnclass,edtDevCruDtSy_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevFirma4d_Internalname,GXutil.rtrim( A14375DevFirma4d),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevFirma4d_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtDevFirma4d_Columnclass,edtDevFirma4d_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruHash_Internalname,GXutil.rtrim( A11674DevCruHash),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruHash_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruGros_Internalname,GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruGros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruObs_Internalname,A11682DevCruObs,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruDesc_Internalname,GXutil.rtrim( A11675DevCruDesc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruDesc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNif_Internalname,GXutil.rtrim( A278CliNif),GXutil.rtrim( localUtil.format( A278CliNif, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruLine_Internalname,GXutil.ltrim( localUtil.ntoc( A14395DevCruLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14395DevCruLine), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruLine_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruSerA_Internalname,GXutil.rtrim( A13984DevCruSerA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruSerA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruTipA_Internalname,GXutil.rtrim( A13985DevCruTipA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruTipA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1WG2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      /* End function sendrow_522 */
   }

   public void startgridcontrol52( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"52\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo AT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ATCUD", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A/M", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gross Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lineas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "AT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Documento AT", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV82GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtDevCruId_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtDevCruId_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliNom_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbDevCruEst.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbDevCruEst.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11678DevCruStt));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbDevCruStt.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbDevCruStt.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A11670DevCruFec, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtDevCruFec_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtDevCruFec_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtDevCruSal_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtDevCruSal_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11680DevCruAtId));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtDevCruAtId_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtDevCruAtId_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13983DevCruATCU));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtDevCruATCU_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtDevCruATCU_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbDevCruEnvA.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbDevCruEnvA.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11681DevCruAT));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbDevCruAT.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbDevCruAT.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtDevCruDtSy_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtDevCruDtSy_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14375DevFirma4d));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtDevFirma4d_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtDevFirma4d_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11674DevCruHash));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A11682DevCruObs);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11675DevCruDesc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A278CliNif));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14395DevCruLine, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13984DevCruSerA));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13985DevCruTipA));
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
      bttBtninsert_Internalname = "BTNINSERT" ;
      edtavDevcruid_Internalname = "vDEVCRUID" ;
      cmbavDevcrustt.setInternalname( "vDEVCRUSTT" );
      edtavClicod_Internalname = "vCLICOD" ;
      edtavDevcrufecfrom_Internalname = "vDEVCRUFECFROM" ;
      edtavDevcrufecto_Internalname = "vDEVCRUFECTO" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtDevCruId_Internalname = "DEVCRUID" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      cmbDevCruEst.setInternalname( "DEVCRUEST" );
      cmbDevCruStt.setInternalname( "DEVCRUSTT" );
      edtDevCruFec_Internalname = "DEVCRUFEC" ;
      edtDevCruSal_Internalname = "DEVCRUSAL" ;
      edtDevCruAtId_Internalname = "DEVCRUATID" ;
      edtDevCruATCU_Internalname = "DEVCRUATCU" ;
      cmbDevCruEnvA.setInternalname( "DEVCRUENVA" );
      cmbDevCruAT.setInternalname( "DEVCRUAT" );
      edtDevCruDtSy_Internalname = "DEVCRUDTSY" ;
      edtDevFirma4d_Internalname = "DEVFIRMA4D" ;
      edtDevCruHash_Internalname = "DEVCRUHASH" ;
      edtDevCruGros_Internalname = "DEVCRUGROS" ;
      edtDevCruObs_Internalname = "DEVCRUOBS" ;
      edtDevCruDesc_Internalname = "DEVCRUDESC" ;
      edtCliNif_Internalname = "CLINIF" ;
      edtDevCruLine_Internalname = "DEVCRULINE" ;
      edtDevCruSerA_Internalname = "DEVCRUSERA" ;
      edtDevCruTipA_Internalname = "DEVCRUTIPA" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_devcrusalauxdate_Internalname = "vDDO_DEVCRUSALAUXDATE" ;
      divDdo_devcrusalauxdates_Internalname = "DDO_DEVCRUSALAUXDATES" ;
      edtavDdo_devcrudtsysauxdate_Internalname = "vDDO_DEVCRUDTSYSAUXDATE" ;
      divDdo_devcrudtsysauxdates_Internalname = "DDO_DEVCRUDTSYSAUXDATES" ;
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
      edtDevCruTipA_Jsonclick = "" ;
      edtDevCruSerA_Jsonclick = "" ;
      edtDevCruLine_Jsonclick = "" ;
      edtCliNif_Jsonclick = "" ;
      edtDevCruDesc_Jsonclick = "" ;
      edtDevCruObs_Jsonclick = "" ;
      edtDevCruGros_Jsonclick = "" ;
      edtDevCruHash_Jsonclick = "" ;
      edtDevFirma4d_Jsonclick = "" ;
      edtDevFirma4d_Columnclass = "WWColumn hidden-xs" ;
      edtDevCruDtSy_Jsonclick = "" ;
      edtDevCruDtSy_Columnclass = "WWColumn hidden-xs" ;
      cmbDevCruAT.setJsonclick( "" );
      cmbDevCruAT.setColumnClass( "WWColumn hidden-xs" );
      cmbDevCruEnvA.setJsonclick( "" );
      cmbDevCruEnvA.setColumnClass( "WWColumn hidden-xs" );
      edtDevCruATCU_Jsonclick = "" ;
      edtDevCruATCU_Columnclass = "WWColumn hidden-xs" ;
      edtDevCruAtId_Jsonclick = "" ;
      edtDevCruAtId_Columnclass = "WWColumn hidden-xs" ;
      edtDevCruSal_Jsonclick = "" ;
      edtDevCruSal_Columnclass = "WWColumn hidden-xs" ;
      edtDevCruFec_Jsonclick = "" ;
      edtDevCruFec_Columnclass = "WWColumn" ;
      cmbDevCruStt.setJsonclick( "" );
      cmbDevCruStt.setColumnClass( "WWColumn" );
      cmbDevCruEst.setJsonclick( "" );
      cmbDevCruEst.setColumnClass( "WWColumn hidden-xs" );
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Columnclass = "WWColumn" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Columnclass = "WWColumn" ;
      edtDevCruId_Jsonclick = "" ;
      edtDevCruId_Columnclass = "WWColumn hidden-xs" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtDevFirma4d_Columnheaderclass = "" ;
      edtDevCruDtSy_Columnheaderclass = "" ;
      cmbDevCruAT.setColumnHeaderClass( "" );
      cmbDevCruEnvA.setColumnHeaderClass( "" );
      edtDevCruATCU_Columnheaderclass = "" ;
      edtDevCruAtId_Columnheaderclass = "" ;
      edtDevCruSal_Columnheaderclass = "" ;
      edtDevCruFec_Columnheaderclass = "" ;
      cmbDevCruStt.setColumnHeaderClass( "" );
      cmbDevCruEst.setColumnHeaderClass( "" );
      edtCliNom_Columnheaderclass = "" ;
      edtCliCod_Columnheaderclass = "" ;
      edtDevCruId_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_devcrudtsysauxdate_Jsonclick = "" ;
      edtavDdo_devcrusalauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavDevcrufecto_Jsonclick = "" ;
      edtavDevcrufecto_Enabled = 1 ;
      edtavDevcrufecfrom_Jsonclick = "" ;
      edtavDevcrufecfrom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      cmbavDevcrustt.setJsonclick( "" );
      cmbavDevcrustt.setEnabled( 1 );
      edtavDevcruid_Jsonclick = "" ;
      edtavDevcruid_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;Salida;AT;AT;AT;AT;AT;;AT;AT;AT;AT;;;;" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Deseas eliminar el registro seleccionado?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "AlmacenSinDetalle.DevolucionTejido_1WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||0:Pdte. Imprimir,1:Imprimido||||||0:Pdte. Envio AT,3:Enviada AT|A:Automatico,M:Manual||" ;
      Ddo_grid_Allowmultipleselection = "|||T||||||T|T||" ;
      Ddo_grid_Datalisttype = "|||FixedValues||||Dynamic|Dynamic|FixedValues|FixedValues||Dynamic" ;
      Ddo_grid_Includedatalist = "|||T||||T|T|T|T||T" ;
      Ddo_grid_Filtertype = "||||||Date|Character|Character|||Date|Character" ;
      Ddo_grid_Includefilter = "||||||T|T|T|||T|T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|" ;
      Ddo_grid_Columnids = "2:DevCruId|3:CliCod|4:CliNom|5:DevCruEst|6:DevCruStt|7:DevCruFec|8:DevCruSal|9:DevCruAtId|10:DevCruATCUD|11:DevCruEnvAT|12:DevCruAT|13:DevCruDtSys|14:DevFirma4dig" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Devolucion Tejido", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavDevcrustt.setName( "vDEVCRUSTT" );
      cmbavDevcrustt.setWebtags( "" );
      cmbavDevcrustt.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavDevcrustt.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbavDevcrustt.addItem("", httpContext.getMessage( "Em preparação ", ""), (short)(0));
      cmbavDevcrustt.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbavDevcrustt.getItemCount() > 0 )
      {
         AV102DevCruStt = cmbavDevcrustt.getValidValue(AV102DevCruStt) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102DevCruStt", AV102DevCruStt);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_52_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV82GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV82GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActions), 4, 0));
      }
      GXCCtl = "DEVCRUEST_" + sGXsfl_52_idx ;
      cmbDevCruEst.setName( GXCCtl );
      cmbDevCruEst.setWebtags( "" );
      cmbDevCruEst.addItem("0", httpContext.getMessage( "Pdte. Imprimir", ""), (short)(0));
      cmbDevCruEst.addItem("1", httpContext.getMessage( "Imprimido", ""), (short)(0));
      if ( cmbDevCruEst.getItemCount() > 0 )
      {
         A11671DevCruEst = (byte)(GXutil.lval( cmbDevCruEst.getValidValue(GXutil.trim( GXutil.str( A11671DevCruEst, 1, 0))))) ;
      }
      GXCCtl = "DEVCRUSTT_" + sGXsfl_52_idx ;
      cmbDevCruStt.setName( GXCCtl );
      cmbDevCruStt.setWebtags( "" );
      cmbDevCruStt.addItem("", httpContext.getMessage( "Em preparação ", ""), (short)(0));
      cmbDevCruStt.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbDevCruStt.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbDevCruStt.getItemCount() > 0 )
      {
         A11678DevCruStt = cmbDevCruStt.getValidValue(A11678DevCruStt) ;
      }
      GXCCtl = "DEVCRUENVA_" + sGXsfl_52_idx ;
      cmbDevCruEnvA.setName( GXCCtl );
      cmbDevCruEnvA.setWebtags( "" );
      cmbDevCruEnvA.addItem("0", httpContext.getMessage( "Pdte. Envio AT", ""), (short)(0));
      cmbDevCruEnvA.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
      if ( cmbDevCruEnvA.getItemCount() > 0 )
      {
         A11679DevCruEnvA = (byte)(GXutil.lval( cmbDevCruEnvA.getValidValue(GXutil.trim( GXutil.str( A11679DevCruEnvA, 1, 0))))) ;
      }
      GXCCtl = "DEVCRUAT_" + sGXsfl_52_idx ;
      cmbDevCruAT.setName( GXCCtl );
      cmbDevCruAT.setWebtags( "" );
      cmbDevCruAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
      cmbDevCruAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      if ( cmbDevCruAT.getItemCount() > 0 )
      {
         A11681DevCruAT = cmbDevCruAT.getValidValue(A11681DevCruAT) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV100DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbavDevcrustt'},{av:'AV102DevCruStt',fld:'vDEVCRUSTT',pic:''},{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV106TFDevCruEst_Sels',fld:'vTFDEVCRUEST_SELS',pic:''},{av:'AV36TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV66TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV67TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV72TFDevCruATCUD',fld:'vTFDEVCRUATCUD',pic:''},{av:'AV73TFDevCruATCUD_Sel',fld:'vTFDEVCRUATCUD_SEL',pic:''},{av:'AV95TFDevCruEnvAT_Sels',fld:'vTFDEVCRUENVAT_SELS',pic:''},{av:'AV108TFDevCruAT_Sels',fld:'vTFDEVCRUAT_SELS',pic:''},{av:'AV56TFDevCruDtSys',fld:'vTFDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV96TFDevFirma4dig',fld:'vTFDEVFIRMA4DIG',pic:''},{av:'AV97TFDevFirma4dig_Sel',fld:'vTFDEVFIRMA4DIG_SEL',pic:''},{av:'AV117Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtDevCruId_Columnheaderclass',ctrl:'DEVCRUID',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'cmbDevCruEst'},{av:'cmbDevCruStt'},{av:'edtDevCruFec_Columnheaderclass',ctrl:'DEVCRUFEC',prop:'Columnheaderclass'},{av:'edtDevCruSal_Columnheaderclass',ctrl:'DEVCRUSAL',prop:'Columnheaderclass'},{av:'edtDevCruAtId_Columnheaderclass',ctrl:'DEVCRUATID',prop:'Columnheaderclass'},{av:'edtDevCruATCU_Columnheaderclass',ctrl:'DEVCRUATCU',prop:'Columnheaderclass'},{av:'cmbDevCruEnvA'},{av:'cmbDevCruAT'},{av:'edtDevCruDtSy_Columnheaderclass',ctrl:'DEVCRUDTSY',prop:'Columnheaderclass'},{av:'edtDevFirma4d_Columnheaderclass',ctrl:'DEVFIRMA4D',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111WG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV100DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbavDevcrustt'},{av:'AV102DevCruStt',fld:'vDEVCRUSTT',pic:''},{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV106TFDevCruEst_Sels',fld:'vTFDEVCRUEST_SELS',pic:''},{av:'AV36TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV66TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV67TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV72TFDevCruATCUD',fld:'vTFDEVCRUATCUD',pic:''},{av:'AV73TFDevCruATCUD_Sel',fld:'vTFDEVCRUATCUD_SEL',pic:''},{av:'AV95TFDevCruEnvAT_Sels',fld:'vTFDEVCRUENVAT_SELS',pic:''},{av:'AV108TFDevCruAT_Sels',fld:'vTFDEVCRUAT_SELS',pic:''},{av:'AV56TFDevCruDtSys',fld:'vTFDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV96TFDevFirma4dig',fld:'vTFDEVFIRMA4DIG',pic:''},{av:'AV97TFDevFirma4dig_Sel',fld:'vTFDEVFIRMA4DIG_SEL',pic:''},{av:'AV117Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121WG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV100DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbavDevcrustt'},{av:'AV102DevCruStt',fld:'vDEVCRUSTT',pic:''},{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV106TFDevCruEst_Sels',fld:'vTFDEVCRUEST_SELS',pic:''},{av:'AV36TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV66TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV67TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV72TFDevCruATCUD',fld:'vTFDEVCRUATCUD',pic:''},{av:'AV73TFDevCruATCUD_Sel',fld:'vTFDEVCRUATCUD_SEL',pic:''},{av:'AV95TFDevCruEnvAT_Sels',fld:'vTFDEVCRUENVAT_SELS',pic:''},{av:'AV108TFDevCruAT_Sels',fld:'vTFDEVCRUAT_SELS',pic:''},{av:'AV56TFDevCruDtSys',fld:'vTFDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV96TFDevFirma4dig',fld:'vTFDEVFIRMA4DIG',pic:''},{av:'AV97TFDevFirma4dig_Sel',fld:'vTFDEVFIRMA4DIG_SEL',pic:''},{av:'AV117Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131WG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV100DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbavDevcrustt'},{av:'AV102DevCruStt',fld:'vDEVCRUSTT',pic:''},{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV106TFDevCruEst_Sels',fld:'vTFDEVCRUEST_SELS',pic:''},{av:'AV36TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV66TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV67TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV72TFDevCruATCUD',fld:'vTFDEVCRUATCUD',pic:''},{av:'AV73TFDevCruATCUD_Sel',fld:'vTFDEVCRUATCUD_SEL',pic:''},{av:'AV95TFDevCruEnvAT_Sels',fld:'vTFDEVCRUENVAT_SELS',pic:''},{av:'AV108TFDevCruAT_Sels',fld:'vTFDEVCRUAT_SELS',pic:''},{av:'AV56TFDevCruDtSys',fld:'vTFDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV96TFDevFirma4dig',fld:'vTFDEVFIRMA4DIG',pic:''},{av:'AV97TFDevFirma4dig_Sel',fld:'vTFDEVFIRMA4DIG_SEL',pic:''},{av:'AV117Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96TFDevFirma4dig',fld:'vTFDEVFIRMA4DIG',pic:''},{av:'AV97TFDevFirma4dig_Sel',fld:'vTFDEVFIRMA4DIG_SEL',pic:''},{av:'AV56TFDevCruDtSys',fld:'vTFDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV107TFDevCruAT_SelsJson',fld:'vTFDEVCRUAT_SELSJSON',pic:''},{av:'AV108TFDevCruAT_Sels',fld:'vTFDEVCRUAT_SELS',pic:''},{av:'AV94TFDevCruEnvAT_SelsJson',fld:'vTFDEVCRUENVAT_SELSJSON',pic:''},{av:'AV95TFDevCruEnvAT_Sels',fld:'vTFDEVCRUENVAT_SELS',pic:''},{av:'AV72TFDevCruATCUD',fld:'vTFDEVCRUATCUD',pic:''},{av:'AV73TFDevCruATCUD_Sel',fld:'vTFDEVCRUATCUD_SEL',pic:''},{av:'AV66TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV67TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV36TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV105TFDevCruEst_SelsJson',fld:'vTFDEVCRUEST_SELSJSON',pic:''},{av:'AV106TFDevCruEst_Sels',fld:'vTFDEVCRUEST_SELS',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221WG2',iparms:[{av:'cmbDevCruStt'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV82GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtDevCruId_Columnclass',ctrl:'DEVCRUID',prop:'Columnclass'},{av:'edtCliCod_Columnclass',ctrl:'CLICOD',prop:'Columnclass'},{av:'edtCliNom_Columnclass',ctrl:'CLINOM',prop:'Columnclass'},{av:'cmbDevCruEst'},{av:'cmbDevCruStt'},{av:'edtDevCruFec_Columnclass',ctrl:'DEVCRUFEC',prop:'Columnclass'},{av:'edtDevCruSal_Columnclass',ctrl:'DEVCRUSAL',prop:'Columnclass'},{av:'edtDevCruAtId_Columnclass',ctrl:'DEVCRUATID',prop:'Columnclass'},{av:'edtDevCruATCU_Columnclass',ctrl:'DEVCRUATCU',prop:'Columnclass'},{av:'cmbDevCruEnvA'},{av:'cmbDevCruAT'},{av:'edtDevCruDtSy_Columnclass',ctrl:'DEVCRUDTSY',prop:'Columnclass'},{av:'edtDevFirma4d_Columnclass',ctrl:'DEVFIRMA4D',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e231WG2',iparms:[{av:'cmbavGridactions'},{av:'AV82GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV100DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbavDevcrustt'},{av:'AV102DevCruStt',fld:'vDEVCRUSTT',pic:''},{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV106TFDevCruEst_Sels',fld:'vTFDEVCRUEST_SELS',pic:''},{av:'AV36TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV66TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV67TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV72TFDevCruATCUD',fld:'vTFDEVCRUATCUD',pic:''},{av:'AV73TFDevCruATCUD_Sel',fld:'vTFDEVCRUATCUD_SEL',pic:''},{av:'AV95TFDevCruEnvAT_Sels',fld:'vTFDEVCRUENVAT_SELS',pic:''},{av:'AV108TFDevCruAT_Sels',fld:'vTFDEVCRUAT_SELS',pic:''},{av:'AV56TFDevCruDtSys',fld:'vTFDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV96TFDevFirma4dig',fld:'vTFDEVFIRMA4DIG',pic:''},{av:'AV97TFDevFirma4dig_Sel',fld:'vTFDEVFIRMA4DIG_SEL',pic:''},{av:'AV117Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbDevCruStt'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:'',hsh:true},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:'',hsh:true},{av:'cmbDevCruEnvA'},{av:'A11679DevCruEnvA',fld:'DEVCRUENVA',pic:'9',hsh:true},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99',hsh:true},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A14395DevCruLine',fld:'DEVCRULINE',pic:'ZZZ9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV87Hash',fld:'vHASH',pic:''},{av:'A278CliNif',fld:'CLINIF',pic:'@!'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV82GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'AV87Hash',fld:'vHASH',pic:''},{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtDevCruId_Columnheaderclass',ctrl:'DEVCRUID',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'cmbDevCruEst'},{av:'cmbDevCruStt'},{av:'edtDevCruFec_Columnheaderclass',ctrl:'DEVCRUFEC',prop:'Columnheaderclass'},{av:'edtDevCruSal_Columnheaderclass',ctrl:'DEVCRUSAL',prop:'Columnheaderclass'},{av:'edtDevCruAtId_Columnheaderclass',ctrl:'DEVCRUATID',prop:'Columnheaderclass'},{av:'edtDevCruATCU_Columnheaderclass',ctrl:'DEVCRUATCU',prop:'Columnheaderclass'},{av:'cmbDevCruEnvA'},{av:'cmbDevCruAT'},{av:'edtDevCruDtSy_Columnheaderclass',ctrl:'DEVCRUDTSY',prop:'Columnheaderclass'},{av:'edtDevFirma4d_Columnheaderclass',ctrl:'DEVFIRMA4D',prop:'Columnheaderclass'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e141WG2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV100DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbavDevcrustt'},{av:'AV102DevCruStt',fld:'vDEVCRUSTT',pic:''},{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV106TFDevCruEst_Sels',fld:'vTFDEVCRUEST_SELS',pic:''},{av:'AV36TFDevCruSal',fld:'vTFDEVCRUSAL',pic:'99/99/99 99:99'},{av:'AV66TFDevCruAtId',fld:'vTFDEVCRUATID',pic:''},{av:'AV67TFDevCruAtId_Sel',fld:'vTFDEVCRUATID_SEL',pic:''},{av:'AV72TFDevCruATCUD',fld:'vTFDEVCRUATCUD',pic:''},{av:'AV73TFDevCruATCUD_Sel',fld:'vTFDEVCRUATCUD_SEL',pic:''},{av:'AV95TFDevCruEnvAT_Sels',fld:'vTFDEVCRUENVAT_SELS',pic:''},{av:'AV108TFDevCruAT_Sels',fld:'vTFDEVCRUAT_SELS',pic:''},{av:'AV56TFDevCruDtSys',fld:'vTFDEVCRUDTSYS',pic:'99/99/99 99:99'},{av:'AV96TFDevFirma4dig',fld:'vTFDEVFIRMA4DIG',pic:''},{av:'AV97TFDevFirma4dig_Sel',fld:'vTFDEVFIRMA4DIG_SEL',pic:''},{av:'AV117Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtDevCruId_Columnheaderclass',ctrl:'DEVCRUID',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'cmbDevCruEst'},{av:'cmbDevCruStt'},{av:'edtDevCruFec_Columnheaderclass',ctrl:'DEVCRUFEC',prop:'Columnheaderclass'},{av:'edtDevCruSal_Columnheaderclass',ctrl:'DEVCRUSAL',prop:'Columnheaderclass'},{av:'edtDevCruAtId_Columnheaderclass',ctrl:'DEVCRUATID',prop:'Columnheaderclass'},{av:'edtDevCruATCU_Columnheaderclass',ctrl:'DEVCRUATCU',prop:'Columnheaderclass'},{av:'cmbDevCruEnvA'},{av:'cmbDevCruAT'},{av:'edtDevCruDtSy_Columnheaderclass',ctrl:'DEVCRUDTSY',prop:'Columnheaderclass'},{av:'edtDevFirma4d_Columnheaderclass',ctrl:'DEVFIRMA4D',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e151WG2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED","{handler:'e161WG2',iparms:[{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV113FilterDevolucionTejido_1',fld:'vFILTERDEVOLUCIONTEJIDO_1',pic:''},{av:'AV100DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbavDevcrustt'},{av:'AV102DevCruStt',fld:'vDEVCRUSTT',pic:''},{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''}]");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED",",oparms:[{av:'AV113FilterDevolucionTejido_1',fld:'vFILTERDEVOLUCIONTEJIDO_1',pic:''}]}");
      setEventMetadata("VDEVCRUID.CONTROLVALUECHANGED","{handler:'e171WG2',iparms:[{av:'AV100DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV113FilterDevolucionTejido_1',fld:'vFILTERDEVOLUCIONTEJIDO_1',pic:''},{av:'cmbavDevcrustt'},{av:'AV102DevCruStt',fld:'vDEVCRUSTT',pic:''},{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''}]");
      setEventMetadata("VDEVCRUID.CONTROLVALUECHANGED",",oparms:[{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''},{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV113FilterDevolucionTejido_1',fld:'vFILTERDEVOLUCIONTEJIDO_1',pic:''}]}");
      setEventMetadata("VDEVCRUFECFROM.CONTROLVALUECHANGED","{handler:'e181WG2',iparms:[{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV113FilterDevolucionTejido_1',fld:'vFILTERDEVOLUCIONTEJIDO_1',pic:''},{av:'AV100DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbavDevcrustt'},{av:'AV102DevCruStt',fld:'vDEVCRUSTT',pic:''},{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''}]");
      setEventMetadata("VDEVCRUFECFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV113FilterDevolucionTejido_1',fld:'vFILTERDEVOLUCIONTEJIDO_1',pic:''}]}");
      setEventMetadata("VDEVCRUFECTO.CONTROLVALUECHANGED","{handler:'e191WG2',iparms:[{av:'AV101Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV113FilterDevolucionTejido_1',fld:'vFILTERDEVOLUCIONTEJIDO_1',pic:''},{av:'AV100DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'cmbavDevcrustt'},{av:'AV102DevCruStt',fld:'vDEVCRUSTT',pic:''},{av:'AV103DevCruFecfrom',fld:'vDEVCRUFECFROM',pic:''},{av:'AV104DevCruFecto',fld:'vDEVCRUFECTO',pic:''}]");
      setEventMetadata("VDEVCRUFECTO.CONTROLVALUECHANGED",",oparms:[{av:'AV113FilterDevolucionTejido_1',fld:'vFILTERDEVOLUCIONTEJIDO_1',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUID","{handler:'valid_Devcruid',iparms:[]");
      setEventMetadata("VALID_DEVCRUID",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUHASH","{handler:'valid_Devcruhash',iparms:[]");
      setEventMetadata("VALID_DEVCRUHASH",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Devcrutipa',iparms:[]");
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
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV102DevCruStt = "" ;
      AV103DevCruFecfrom = GXutil.nullDate() ;
      AV104DevCruFecto = GXutil.nullDate() ;
      AV93EmprCod = "" ;
      AV106TFDevCruEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV36TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV66TFDevCruAtId = "" ;
      AV67TFDevCruAtId_Sel = "" ;
      AV72TFDevCruATCUD = "" ;
      AV73TFDevCruATCUD_Sel = "" ;
      AV95TFDevCruEnvAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV108TFDevCruAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV56TFDevCruDtSys = GXutil.resetTime( GXutil.nullDate() );
      AV96TFDevFirma4dig = "" ;
      AV97TFDevFirma4dig_Sel = "" ;
      AV117Pgmname = "" ;
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV78DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV87Hash = "" ;
      AV113FilterDevolucionTejido_1 = new app.almacensindetalle.SdtFilterDevolucionTejido_1(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV38DDO_DevCruSalAuxDate = GXutil.nullDate() ;
      AV58DDO_DevCruDtSysAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A11678DevCruStt = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11680DevCruAtId = "" ;
      A13983DevCruATCU = "" ;
      A11681DevCruAT = "" ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A14375DevFirma4d = "" ;
      A11674DevCruHash = "" ;
      A11677DevCruGros = DecimalUtil.ZERO ;
      A11682DevCruObs = "" ;
      A11675DevCruDesc = "" ;
      A278CliNif = "" ;
      A13984DevCruSerA = "" ;
      A13985DevCruTipA = "" ;
      AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = "" ;
      lV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = "" ;
      lV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = "" ;
      AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel = "" ;
      AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid = "" ;
      AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel = "" ;
      AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud = "" ;
      AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys = GXutil.resetTime( GXutil.nullDate() );
      AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel = "" ;
      AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig = "" ;
      H01WG2_A13985DevCruTipA = new String[] {""} ;
      H01WG2_A13984DevCruSerA = new String[] {""} ;
      H01WG2_A278CliNif = new String[] {""} ;
      H01WG2_A11675DevCruDesc = new String[] {""} ;
      H01WG2_A11682DevCruObs = new String[] {""} ;
      H01WG2_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01WG2_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      H01WG2_A11681DevCruAT = new String[] {""} ;
      H01WG2_A11679DevCruEnvA = new byte[1] ;
      H01WG2_A13983DevCruATCU = new String[] {""} ;
      H01WG2_A11680DevCruAtId = new String[] {""} ;
      H01WG2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      H01WG2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01WG2_A11678DevCruStt = new String[] {""} ;
      H01WG2_A11671DevCruEst = new byte[1] ;
      H01WG2_A279CliNom = new String[] {""} ;
      H01WG2_A252CliCod = new int[1] ;
      H01WG2_A11674DevCruHash = new String[] {""} ;
      H01WG2_A11669DevCruId = new int[1] ;
      H01WG2_A396EmprCod = new String[] {""} ;
      GXv_int2 = new short[1] ;
      H01WG3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV90Station = "" ;
      AV98EmprNom = "" ;
      AV89Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV88Path = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV105TFDevCruEst_SelsJson = "" ;
      AV94TFDevCruEnvAT_SelsJson = "" ;
      AV107TFDevCruAT_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      Gx_msg = "" ;
      AV131Emprcod_selected = "" ;
      AV111msg_control = "" ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_dtime14 = new java.util.Date[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int15 = new byte[1] ;
      AV86Cadena = "" ;
      AV91Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message16 = new GXBaseCollection[1] ;
      GXv_boolean17 = new boolean[1] ;
      AV99Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXv_int12 = new int[1] ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char5 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV114WebSession = httpContext.getWebSession();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_1ww__default(),
         new Object[] {
             new Object[] {
            H01WG2_A13985DevCruTipA, H01WG2_A13984DevCruSerA, H01WG2_A278CliNif, H01WG2_A11675DevCruDesc, H01WG2_A11682DevCruObs, H01WG2_A11677DevCruGros, H01WG2_A11676DevCruDtSy, H01WG2_A11681DevCruAT, H01WG2_A11679DevCruEnvA, H01WG2_A13983DevCruATCU,
            H01WG2_A11680DevCruAtId, H01WG2_A11673DevCruSal, H01WG2_A11670DevCruFec, H01WG2_A11678DevCruStt, H01WG2_A11671DevCruEst, H01WG2_A279CliNom, H01WG2_A252CliCod, H01WG2_A11674DevCruHash, H01WG2_A11669DevCruId, H01WG2_A396EmprCod
            }
            , new Object[] {
            H01WG3_AGRID_nRecordCount
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV117Pgmname = "AlmacenSinDetalle.DevolucionTejido_1WW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV117Pgmname = "AlmacenSinDetalle.DevolucionTejido_1WW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A11671DevCruEst ;
   private byte A11679DevCruEnvA ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
   private byte GXv_int15[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV82GridActions ;
   private short A14395DevCruLine ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXt_int1 ;
   private short GXv_int2[] ;
   private short AV112FirmaD ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_52 ;
   private int nGXsfl_52_idx=1 ;
   private int AV100DevCruId ;
   private int AV101Clicod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavDevcruid_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavDevcrufecfrom_Enabled ;
   private int edtavDevcrufecto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size ;
   private int AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size ;
   private int AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size ;
   private int AV79PageToGo ;
   private int AV132Devcruid_selected ;
   private int AV133GXV1 ;
   private int GXv_int12[] ;
   private int AV134GXV2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV80GridCurrentPage ;
   private long AV81GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A11677DevCruGros ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_52_idx="0001" ;
   private String AV102DevCruStt ;
   private String AV93EmprCod ;
   private String AV66TFDevCruAtId ;
   private String AV67TFDevCruAtId_Sel ;
   private String AV72TFDevCruATCUD ;
   private String AV73TFDevCruATCUD_Sel ;
   private String AV96TFDevFirma4dig ;
   private String AV97TFDevFirma4dig_Sel ;
   private String AV117Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String edtavDevcruid_Internalname ;
   private String edtavDevcruid_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavDevcrufecfrom_Internalname ;
   private String edtavDevcrufecfrom_Jsonclick ;
   private String edtavDevcrufecto_Internalname ;
   private String edtavDevcrufecto_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_devcrusalauxdates_Internalname ;
   private String edtavDdo_devcrusalauxdate_Internalname ;
   private String edtavDdo_devcrusalauxdate_Jsonclick ;
   private String divDdo_devcrudtsysauxdates_Internalname ;
   private String edtavDdo_devcrudtsysauxdate_Internalname ;
   private String edtavDdo_devcrudtsysauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtDevCruId_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A11678DevCruStt ;
   private String edtDevCruFec_Internalname ;
   private String edtDevCruSal_Internalname ;
   private String A11680DevCruAtId ;
   private String edtDevCruAtId_Internalname ;
   private String A13983DevCruATCU ;
   private String edtDevCruATCU_Internalname ;
   private String A11681DevCruAT ;
   private String edtDevCruDtSy_Internalname ;
   private String A14375DevFirma4d ;
   private String edtDevFirma4d_Internalname ;
   private String A11674DevCruHash ;
   private String edtDevCruHash_Internalname ;
   private String edtDevCruGros_Internalname ;
   private String edtDevCruObs_Internalname ;
   private String A11675DevCruDesc ;
   private String edtDevCruDesc_Internalname ;
   private String A278CliNif ;
   private String edtCliNif_Internalname ;
   private String edtDevCruLine_Internalname ;
   private String A13984DevCruSerA ;
   private String edtDevCruSerA_Internalname ;
   private String A13985DevCruTipA ;
   private String edtDevCruTipA_Internalname ;
   private String scmdbuf ;
   private String lV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ;
   private String lV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ;
   private String lV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ;
   private String AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ;
   private String AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ;
   private String AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ;
   private String AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ;
   private String AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ;
   private String AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ;
   private String hsh ;
   private String AV90Station ;
   private String AV98EmprNom ;
   private String AV89Usurcod ;
   private String AV88Path ;
   private String edtDevCruId_Columnheaderclass ;
   private String edtCliCod_Columnheaderclass ;
   private String edtCliNom_Columnheaderclass ;
   private String edtDevCruFec_Columnheaderclass ;
   private String edtDevCruSal_Columnheaderclass ;
   private String edtDevCruAtId_Columnheaderclass ;
   private String edtDevCruATCU_Columnheaderclass ;
   private String edtDevCruDtSy_Columnheaderclass ;
   private String edtDevFirma4d_Columnheaderclass ;
   private String edtDevCruId_Columnclass ;
   private String edtCliCod_Columnclass ;
   private String edtCliNom_Columnclass ;
   private String edtDevCruFec_Columnclass ;
   private String edtDevCruSal_Columnclass ;
   private String edtDevCruAtId_Columnclass ;
   private String edtDevCruATCU_Columnclass ;
   private String edtDevCruDtSy_Columnclass ;
   private String edtDevFirma4d_Columnclass ;
   private String Gx_msg ;
   private String AV131Emprcod_selected ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char19 ;
   private String GXv_char6[] ;
   private String GXt_char18 ;
   private String GXv_char5[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtDevCruId_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtDevCruFec_Jsonclick ;
   private String edtDevCruSal_Jsonclick ;
   private String edtDevCruAtId_Jsonclick ;
   private String edtDevCruATCU_Jsonclick ;
   private String edtDevCruDtSy_Jsonclick ;
   private String edtDevFirma4d_Jsonclick ;
   private String edtDevCruHash_Jsonclick ;
   private String edtDevCruGros_Jsonclick ;
   private String edtDevCruObs_Jsonclick ;
   private String edtDevCruDesc_Jsonclick ;
   private String edtCliNif_Jsonclick ;
   private String edtDevCruLine_Jsonclick ;
   private String edtDevCruSerA_Jsonclick ;
   private String edtDevCruTipA_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV36TFDevCruSal ;
   private java.util.Date AV56TFDevCruDtSys ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ;
   private java.util.Date AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ;
   private java.util.Date GXv_dtime14[] ;
   private java.util.Date AV103DevCruFecfrom ;
   private java.util.Date AV104DevCruFecto ;
   private java.util.Date Gx_date ;
   private java.util.Date AV38DDO_DevCruSalAuxDate ;
   private java.util.Date AV58DDO_DevCruDtSysAuxDate ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date GXv_date13[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV92OK ;
   private boolean GXv_boolean17[] ;
   private String AV105TFDevCruEst_SelsJson ;
   private String AV94TFDevCruEnvAT_SelsJson ;
   private String AV107TFDevCruAT_SelsJson ;
   private String AV87Hash ;
   private String A11682DevCruObs ;
   private String AV111msg_control ;
   private String AV86Cadena ;
   private GXSimpleCollection<Byte> AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ;
   private GXSimpleCollection<Byte> AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ;
   private GXSimpleCollection<Byte> AV106TFDevCruEst_Sels ;
   private GXSimpleCollection<Byte> AV95TFDevCruEnvAT_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.WebSession AV114WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ;
   private HTMLChoice cmbavDevcrustt ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbDevCruEst ;
   private HTMLChoice cmbDevCruStt ;
   private HTMLChoice cmbDevCruEnvA ;
   private HTMLChoice cmbDevCruAT ;
   private IDataStoreProvider pr_default ;
   private String[] H01WG2_A13985DevCruTipA ;
   private String[] H01WG2_A13984DevCruSerA ;
   private String[] H01WG2_A278CliNif ;
   private String[] H01WG2_A11675DevCruDesc ;
   private String[] H01WG2_A11682DevCruObs ;
   private java.math.BigDecimal[] H01WG2_A11677DevCruGros ;
   private java.util.Date[] H01WG2_A11676DevCruDtSy ;
   private String[] H01WG2_A11681DevCruAT ;
   private byte[] H01WG2_A11679DevCruEnvA ;
   private String[] H01WG2_A13983DevCruATCU ;
   private String[] H01WG2_A11680DevCruAtId ;
   private java.util.Date[] H01WG2_A11673DevCruSal ;
   private java.util.Date[] H01WG2_A11670DevCruFec ;
   private String[] H01WG2_A11678DevCruStt ;
   private byte[] H01WG2_A11671DevCruEst ;
   private String[] H01WG2_A279CliNom ;
   private int[] H01WG2_A252CliCod ;
   private String[] H01WG2_A11674DevCruHash ;
   private int[] H01WG2_A11669DevCruId ;
   private String[] H01WG2_A396EmprCod ;
   private long[] H01WG3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV108TFDevCruAT_Sels ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV91Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message16[] ;
   private com.genexus.SdtMessages_Message AV99Message ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV78DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.almacensindetalle.SdtFilterDevolucionTejido_1 AV113FilterDevolucionTejido_1 ;
}

final  class devoluciontejido_1ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01WG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A11671DevCruEst ,
                                          GXSimpleCollection<Byte> AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ,
                                          byte A11679DevCruEnvA ,
                                          GXSimpleCollection<Byte> AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ,
                                          String A11681DevCruAT ,
                                          GXSimpleCollection<String> AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ,
                                          int AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size ,
                                          java.util.Date AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ,
                                          String AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ,
                                          String AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ,
                                          String AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ,
                                          String AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ,
                                          int AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size ,
                                          int AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size ,
                                          java.util.Date AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ,
                                          String AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ,
                                          String AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ,
                                          int AV100DevCruId ,
                                          int AV101Clicod ,
                                          java.util.Date AV103DevCruFecfrom ,
                                          java.util.Date AV104DevCruFecto ,
                                          java.util.Date A11673DevCruSal ,
                                          String A11680DevCruAtId ,
                                          String A13983DevCruATCU ,
                                          java.util.Date A11676DevCruDtSy ,
                                          String A11674DevCruHash ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          java.util.Date A11670DevCruFec ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A11678DevCruStt ,
                                          String AV102DevCruStt ,
                                          String AV93EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[20];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.DevCruTipA, T1.DevCruSerA, T2.CliNif, T1.DevCruDesc, T1.DevCruObs, T1.DevCruGros, T1.DevCruDtSy, T1.DevCruAT, T1.DevCruEnvA, T1.DevCruATCU, T1.DevCruAtId, T1.DevCruSal," ;
      sSelectString += " T1.DevCruFec, T1.DevCruStt, T1.DevCruEst, T2.CliNom, T1.CliCod, T1.DevCruHash, T1.DevCruId, T1.EmprCod" ;
      sFromString = " FROM (TXPDEVCRU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DevCruStt = ? or ? = 'T')");
      if ( AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels, "T1.DevCruEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel)==0) && ( ! (GXutil.strcmp("", AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruATCU = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels, "T1.DevCruEnvA IN (", ")")+")");
      }
      if ( AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels, "T1.DevCruAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys) )
      {
         addWhere(sWhereString, "(T1.DevCruDtSy >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.DevCruHash, 1, 1) || SUBSTR(T1.DevCruHash, 11, 1) || SUBSTR(T1.DevCruHash, 21, 1) || SUBSTR(T1.DevCruHash, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.DevCruHash, 1, 1) || SUBSTR(T1.DevCruHash, 11, 1) || SUBSTR(T1.DevCruHash, 21, 1) || SUBSTR(T1.DevCruHash, 31, 1) = ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (0==AV100DevCruId) )
      {
         addWhere(sWhereString, "(T1.DevCruId = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (0==AV101Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103DevCruFecfrom)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104DevCruFecto)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec <= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.DevCruId DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruId" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruId DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruEst" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruStt" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruStt DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruFec" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruSal" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruAtId" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruAtId DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruATCU" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruATCU DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruEnvA" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruEnvA DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruAT" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruDtSy" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruDtSy DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DevCruId" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H01WG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A11671DevCruEst ,
                                          GXSimpleCollection<Byte> AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels ,
                                          byte A11679DevCruEnvA ,
                                          GXSimpleCollection<Byte> AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels ,
                                          String A11681DevCruAT ,
                                          GXSimpleCollection<String> AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels ,
                                          int AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size ,
                                          java.util.Date AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal ,
                                          String AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel ,
                                          String AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid ,
                                          String AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel ,
                                          String AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud ,
                                          int AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size ,
                                          int AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size ,
                                          java.util.Date AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys ,
                                          String AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel ,
                                          String AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig ,
                                          int AV100DevCruId ,
                                          int AV101Clicod ,
                                          java.util.Date AV103DevCruFecfrom ,
                                          java.util.Date AV104DevCruFecto ,
                                          java.util.Date A11673DevCruSal ,
                                          String A11680DevCruAtId ,
                                          String A13983DevCruATCU ,
                                          java.util.Date A11676DevCruDtSy ,
                                          String A11674DevCruHash ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          java.util.Date A11670DevCruFec ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A11678DevCruStt ,
                                          String AV102DevCruStt ,
                                          String AV93EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[15];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPDEVCRU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.DevCruStt = ? or ? = 'T')");
      if ( AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Almacensindetalle_devoluciontejido_1wwds_1_tfdevcruest_sels, "T1.DevCruEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV120Almacensindetalle_devoluciontejido_1wwds_2_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV121Almacensindetalle_devoluciontejido_1wwds_3_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Almacensindetalle_devoluciontejido_1wwds_4_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel)==0) && ( ! (GXutil.strcmp("", AV123Almacensindetalle_devoluciontejido_1wwds_5_tfdevcruatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Almacensindetalle_devoluciontejido_1wwds_6_tfdevcruatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruATCU = ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Almacensindetalle_devoluciontejido_1wwds_7_tfdevcruenvat_sels, "T1.DevCruEnvA IN (", ")")+")");
      }
      if ( AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV126Almacensindetalle_devoluciontejido_1wwds_8_tfdevcruat_sels, "T1.DevCruAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV127Almacensindetalle_devoluciontejido_1wwds_9_tfdevcrudtsys) )
      {
         addWhere(sWhereString, "(T1.DevCruDtSy >= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV128Almacensindetalle_devoluciontejido_1wwds_10_tfdevfirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.DevCruHash, 1, 1) || SUBSTR(T1.DevCruHash, 11, 1) || SUBSTR(T1.DevCruHash, 21, 1) || SUBSTR(T1.DevCruHash, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Almacensindetalle_devoluciontejido_1wwds_11_tfdevfirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.DevCruHash, 1, 1) || SUBSTR(T1.DevCruHash, 11, 1) || SUBSTR(T1.DevCruHash, 21, 1) || SUBSTR(T1.DevCruHash, 31, 1) = ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (0==AV100DevCruId) )
      {
         addWhere(sWhereString, "(T1.DevCruId = ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (0==AV101Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103DevCruFecfrom)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104DevCruFecto)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec <= ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
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
                  return conditional_H01WG2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_H01WG3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 300);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 200);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               return;
      }
   }

}

