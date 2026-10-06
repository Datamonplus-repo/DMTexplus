package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class nwdpprocesosview_impl extends GXDataArea
{
   public nwdpprocesosview_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public nwdpprocesosview_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpprocesosview_impl.class ));
   }

   public nwdpprocesosview_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
         else
         {
            if ( ! httpContext.IsValidAjaxCall( false) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = gxfirstwebparm_bkp ;
         }
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV9EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DisCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10DisCod), "ZZZZZZZ9")));
               AV7TabCode = httpContext.GetPar( "TabCode") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7TabCode", AV7TabCode);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
            }
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
      paKY2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startKY2( ) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.nwdpprocesosview", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV7TabCode))}, new String[] {"EmprCod","DisCod","TabCode"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADALLTABS", AV11LoadAllTabs);
      app.GxWebStd.gx_hidden_field( httpContext, "vSELECTEDTABCODE", GXutil.rtrim( AV12SelectedTabCode));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV10DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTABCODE", GXutil.rtrim( AV7TabCode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "TABS_Activepagecontrolname", GXutil.rtrim( Tabs_Activepagecontrolname));
      app.GxWebStd.gx_hidden_field( httpContext, "TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TABS_Class", GXutil.rtrim( Tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "TABS_Historymanagement", GXutil.booltostr( Tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "TABS_Activepagecontrolname", GXutil.rtrim( Tabs_Activepagecontrolname));
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
      if ( ! ( WebComp_Generalwc == null ) )
      {
         WebComp_Generalwc.componentjscripts();
      }
      if ( ! ( WebComp_Tdisaldwc == null ) )
      {
         WebComp_Tdisaldwc.componentjscripts();
      }
      if ( ! ( WebComp_Tdisalnwc == null ) )
      {
         WebComp_Tdisalnwc.componentjscripts();
      }
      if ( ! ( WebComp_Tdisdefwc == null ) )
      {
         WebComp_Tdisdefwc.componentjscripts();
      }
      if ( ! ( WebComp_Tdisfaswc == null ) )
      {
         WebComp_Tdisfaswc.componentjscripts();
      }
      if ( ! ( WebComp_Tdisobswc == null ) )
      {
         WebComp_Tdisobswc.componentjscripts();
      }
      if ( ! ( WebComp_Tdisposwc == null ) )
      {
         WebComp_Tdisposwc.componentjscripts();
      }
      if ( ! ( WebComp_Tdisprowc == null ) )
      {
         WebComp_Tdisprowc.componentjscripts();
      }
      if ( ! ( WebComp_Tdispohwc == null ) )
      {
         WebComp_Tdispohwc.componentjscripts();
      }
      if ( ! ( WebComp_Tdisprhwc == null ) )
      {
         WebComp_Tdisprhwc.componentjscripts();
      }
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
         weKY2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtKY2( ) ;
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
      return formatLink("app.nwdpprocesosview", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV7TabCode))}, new String[] {"EmprCod","DisCod","TabCode"})  ;
   }

   public String getPgmname( )
   {
      return "NwDPProcesosView" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Nw DPProcesos View", "") ;
   }

   public void wbKY0( )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellWWLink", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableviewrightitems_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "justify-content:flex-end;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "ViewCellRightItem", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblWorkwithlink_Internalname, httpContext.getMessage( "Ir a Nw DPProcesos", ""), lblWorkwithlink_Link, "", lblWorkwithlink_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockLink", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellViewTabsPosition", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableviewcontainer_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellViewTab", "left", "top", "", "", "div");
         /* User Defined Control */
         ucTabs.setProperty("PageCount", Tabs_Pagecount);
         ucTabs.setProperty("Class", Tabs_Class);
         ucTabs.setProperty("HistoryManagement", Tabs_Historymanagement);
         ucTabs.render(context, "tab", Tabs_Internalname, "TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblGeneral_title_Internalname, httpContext.getMessage( "General", ""), "", "", lblGeneral_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "General") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablegeneral_Internalname, 1, 0, "px", 0, "px", "TableViewTab", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0025"+"", GXutil.rtrim( WebComp_Generalwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0025"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldGeneralwc), GXutil.lower( WebComp_Generalwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0025"+"");
               }
               WebComp_Generalwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldGeneralwc), GXutil.lower( WebComp_Generalwc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTdisald_title_Internalname, httpContext.getMessage( "DISPOSICION,EMPESA-DETALLE PZ", ""), "", "", lblTdisald_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TDISALD") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletdisald_Internalname, 1, 0, "px", 0, "px", "TableViewTab", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0033"+"", GXutil.rtrim( WebComp_Tdisaldwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0033"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Tdisaldwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldTdisaldwc), GXutil.lower( WebComp_Tdisaldwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0033"+"");
               }
               WebComp_Tdisaldwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldTdisaldwc), GXutil.lower( WebComp_Tdisaldwc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTdisaln_title_Internalname, httpContext.getMessage( "DISPOSICION,EMPESA-SIN DETALLE", ""), "", "", lblTdisaln_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TDISALN") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletdisaln_Internalname, 1, 0, "px", 0, "px", "TableViewTab", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0041"+"", GXutil.rtrim( WebComp_Tdisalnwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0041"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Tdisalnwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldTdisalnwc), GXutil.lower( WebComp_Tdisalnwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0041"+"");
               }
               WebComp_Tdisalnwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldTdisalnwc), GXutil.lower( WebComp_Tdisalnwc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"title4"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTdisdef_title_Internalname, httpContext.getMessage( "DEFECTOS DISPOSICION", ""), "", "", lblTdisdef_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TDISDEF") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletdisdef_Internalname, 1, 0, "px", 0, "px", "TableViewTab", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0049"+"", GXutil.rtrim( WebComp_Tdisdefwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0049"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Tdisdefwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldTdisdefwc), GXutil.lower( WebComp_Tdisdefwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0049"+"");
               }
               WebComp_Tdisdefwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldTdisdefwc), GXutil.lower( WebComp_Tdisdefwc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"title5"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTdisfas_title_Internalname, httpContext.getMessage( "FASES", ""), "", "", lblTdisfas_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TDISFAS") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"panel5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletdisfas_Internalname, 1, 0, "px", 0, "px", "TableViewTab", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0057"+"", GXutil.rtrim( WebComp_Tdisfaswc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0057"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Tdisfaswc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldTdisfaswc), GXutil.lower( WebComp_Tdisfaswc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0057"+"");
               }
               WebComp_Tdisfaswc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldTdisfaswc), GXutil.lower( WebComp_Tdisfaswc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"title6"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTdisobs_title_Internalname, httpContext.getMessage( "OBSERVACIONES", ""), "", "", lblTdisobs_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TDISOBS") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"panel6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletdisobs_Internalname, 1, 0, "px", 0, "px", "TableViewTab", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0065"+"", GXutil.rtrim( WebComp_Tdisobswc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0065"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Tdisobswc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldTdisobswc), GXutil.lower( WebComp_Tdisobswc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0065"+"");
               }
               WebComp_Tdisobswc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldTdisobswc), GXutil.lower( WebComp_Tdisobswc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"title7"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTdispos_title_Internalname, httpContext.getMessage( "ENTRADA DE DISPOSICIONES", ""), "", "", lblTdispos_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TDISPOS") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"panel7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletdispos_Internalname, 1, 0, "px", 0, "px", "TableViewTab", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0073"+"", GXutil.rtrim( WebComp_Tdisposwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0073"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Tdisposwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldTdisposwc), GXutil.lower( WebComp_Tdisposwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0073"+"");
               }
               WebComp_Tdisposwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldTdisposwc), GXutil.lower( WebComp_Tdisposwc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"title8"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTdispro_title_Internalname, httpContext.getMessage( "PROCESOS", ""), "", "", lblTdispro_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TDISPRO") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"panel8"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletdispro_Internalname, 1, 0, "px", 0, "px", "TableViewTab", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0081"+"", GXutil.rtrim( WebComp_Tdisprowc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0081"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Tdisprowc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldTdisprowc), GXutil.lower( WebComp_Tdisprowc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0081"+"");
               }
               WebComp_Tdisprowc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldTdisprowc), GXutil.lower( WebComp_Tdisprowc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"title9"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTdispoh_title_Internalname, httpContext.getMessage( "ENTRADA DE DISPOSICIONES", ""), "", "", lblTdispoh_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TDISPOH") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"panel9"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletdispoh_Internalname, 1, 0, "px", 0, "px", "TableViewTab", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0089"+"", GXutil.rtrim( WebComp_Tdispohwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0089"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Tdispohwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldTdispohwc), GXutil.lower( WebComp_Tdispohwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0089"+"");
               }
               WebComp_Tdispohwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldTdispohwc), GXutil.lower( WebComp_Tdispohwc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"title10"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTdisprh_title_Internalname, httpContext.getMessage( "PROCESOS", ""), "", "", lblTdisprh_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_NwDPProcesosView.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TDISPRH") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"TABSContainer"+"panel10"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletdisprh_Internalname, 1, 0, "px", 0, "px", "TableViewTab", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0097"+"", GXutil.rtrim( WebComp_Tdisprhwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0097"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Tdisprhwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldTdisprhwc), GXutil.lower( WebComp_Tdisprhwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0097"+"");
               }
               WebComp_Tdisprhwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldTdisprhwc), GXutil.lower( WebComp_Tdisprhwc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startKY2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Nw DPProcesos View", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupKY0( ) ;
   }

   public void wsKY2( )
   {
      startKY2( ) ;
      evtKY2( ) ;
   }

   public void evtKY2( )
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e11KY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e12KY2 ();
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
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 25 )
                     {
                        OldGeneralwc = httpContext.cgiGet( "W0025") ;
                        if ( ( GXutil.len( OldGeneralwc) == 0 ) || ( GXutil.strcmp(OldGeneralwc, WebComp_Generalwc_Component) != 0 ) )
                        {
                           WebComp_Generalwc = WebUtils.getWebComponent(getClass(), "app." + OldGeneralwc + "_impl", remoteHandle, context);
                           WebComp_Generalwc_Component = OldGeneralwc ;
                        }
                        if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
                        {
                           WebComp_Generalwc.componentprocess("W0025", "", sEvt);
                        }
                        WebComp_Generalwc_Component = OldGeneralwc ;
                     }
                     else if ( nCmpId == 33 )
                     {
                        OldTdisaldwc = httpContext.cgiGet( "W0033") ;
                        if ( ( GXutil.len( OldTdisaldwc) == 0 ) || ( GXutil.strcmp(OldTdisaldwc, WebComp_Tdisaldwc_Component) != 0 ) )
                        {
                           WebComp_Tdisaldwc = WebUtils.getWebComponent(getClass(), "app." + OldTdisaldwc + "_impl", remoteHandle, context);
                           WebComp_Tdisaldwc_Component = OldTdisaldwc ;
                        }
                        if ( GXutil.len( WebComp_Tdisaldwc_Component) != 0 )
                        {
                           WebComp_Tdisaldwc.componentprocess("W0033", "", sEvt);
                        }
                        WebComp_Tdisaldwc_Component = OldTdisaldwc ;
                     }
                     else if ( nCmpId == 41 )
                     {
                        OldTdisalnwc = httpContext.cgiGet( "W0041") ;
                        if ( ( GXutil.len( OldTdisalnwc) == 0 ) || ( GXutil.strcmp(OldTdisalnwc, WebComp_Tdisalnwc_Component) != 0 ) )
                        {
                           WebComp_Tdisalnwc = WebUtils.getWebComponent(getClass(), "app." + OldTdisalnwc + "_impl", remoteHandle, context);
                           WebComp_Tdisalnwc_Component = OldTdisalnwc ;
                        }
                        if ( GXutil.len( WebComp_Tdisalnwc_Component) != 0 )
                        {
                           WebComp_Tdisalnwc.componentprocess("W0041", "", sEvt);
                        }
                        WebComp_Tdisalnwc_Component = OldTdisalnwc ;
                     }
                     else if ( nCmpId == 49 )
                     {
                        OldTdisdefwc = httpContext.cgiGet( "W0049") ;
                        if ( ( GXutil.len( OldTdisdefwc) == 0 ) || ( GXutil.strcmp(OldTdisdefwc, WebComp_Tdisdefwc_Component) != 0 ) )
                        {
                           WebComp_Tdisdefwc = WebUtils.getWebComponent(getClass(), "app." + OldTdisdefwc + "_impl", remoteHandle, context);
                           WebComp_Tdisdefwc_Component = OldTdisdefwc ;
                        }
                        if ( GXutil.len( WebComp_Tdisdefwc_Component) != 0 )
                        {
                           WebComp_Tdisdefwc.componentprocess("W0049", "", sEvt);
                        }
                        WebComp_Tdisdefwc_Component = OldTdisdefwc ;
                     }
                     else if ( nCmpId == 57 )
                     {
                        OldTdisfaswc = httpContext.cgiGet( "W0057") ;
                        if ( ( GXutil.len( OldTdisfaswc) == 0 ) || ( GXutil.strcmp(OldTdisfaswc, WebComp_Tdisfaswc_Component) != 0 ) )
                        {
                           WebComp_Tdisfaswc = WebUtils.getWebComponent(getClass(), "app." + OldTdisfaswc + "_impl", remoteHandle, context);
                           WebComp_Tdisfaswc_Component = OldTdisfaswc ;
                        }
                        if ( GXutil.len( WebComp_Tdisfaswc_Component) != 0 )
                        {
                           WebComp_Tdisfaswc.componentprocess("W0057", "", sEvt);
                        }
                        WebComp_Tdisfaswc_Component = OldTdisfaswc ;
                     }
                     else if ( nCmpId == 65 )
                     {
                        OldTdisobswc = httpContext.cgiGet( "W0065") ;
                        if ( ( GXutil.len( OldTdisobswc) == 0 ) || ( GXutil.strcmp(OldTdisobswc, WebComp_Tdisobswc_Component) != 0 ) )
                        {
                           WebComp_Tdisobswc = WebUtils.getWebComponent(getClass(), "app." + OldTdisobswc + "_impl", remoteHandle, context);
                           WebComp_Tdisobswc_Component = OldTdisobswc ;
                        }
                        if ( GXutil.len( WebComp_Tdisobswc_Component) != 0 )
                        {
                           WebComp_Tdisobswc.componentprocess("W0065", "", sEvt);
                        }
                        WebComp_Tdisobswc_Component = OldTdisobswc ;
                     }
                     else if ( nCmpId == 73 )
                     {
                        OldTdisposwc = httpContext.cgiGet( "W0073") ;
                        if ( ( GXutil.len( OldTdisposwc) == 0 ) || ( GXutil.strcmp(OldTdisposwc, WebComp_Tdisposwc_Component) != 0 ) )
                        {
                           WebComp_Tdisposwc = WebUtils.getWebComponent(getClass(), "app." + OldTdisposwc + "_impl", remoteHandle, context);
                           WebComp_Tdisposwc_Component = OldTdisposwc ;
                        }
                        if ( GXutil.len( WebComp_Tdisposwc_Component) != 0 )
                        {
                           WebComp_Tdisposwc.componentprocess("W0073", "", sEvt);
                        }
                        WebComp_Tdisposwc_Component = OldTdisposwc ;
                     }
                     else if ( nCmpId == 81 )
                     {
                        OldTdisprowc = httpContext.cgiGet( "W0081") ;
                        if ( ( GXutil.len( OldTdisprowc) == 0 ) || ( GXutil.strcmp(OldTdisprowc, WebComp_Tdisprowc_Component) != 0 ) )
                        {
                           WebComp_Tdisprowc = WebUtils.getWebComponent(getClass(), "app." + OldTdisprowc + "_impl", remoteHandle, context);
                           WebComp_Tdisprowc_Component = OldTdisprowc ;
                        }
                        if ( GXutil.len( WebComp_Tdisprowc_Component) != 0 )
                        {
                           WebComp_Tdisprowc.componentprocess("W0081", "", sEvt);
                        }
                        WebComp_Tdisprowc_Component = OldTdisprowc ;
                     }
                     else if ( nCmpId == 89 )
                     {
                        OldTdispohwc = httpContext.cgiGet( "W0089") ;
                        if ( ( GXutil.len( OldTdispohwc) == 0 ) || ( GXutil.strcmp(OldTdispohwc, WebComp_Tdispohwc_Component) != 0 ) )
                        {
                           WebComp_Tdispohwc = WebUtils.getWebComponent(getClass(), "app." + OldTdispohwc + "_impl", remoteHandle, context);
                           WebComp_Tdispohwc_Component = OldTdispohwc ;
                        }
                        if ( GXutil.len( WebComp_Tdispohwc_Component) != 0 )
                        {
                           WebComp_Tdispohwc.componentprocess("W0089", "", sEvt);
                        }
                        WebComp_Tdispohwc_Component = OldTdispohwc ;
                     }
                     else if ( nCmpId == 97 )
                     {
                        OldTdisprhwc = httpContext.cgiGet( "W0097") ;
                        if ( ( GXutil.len( OldTdisprhwc) == 0 ) || ( GXutil.strcmp(OldTdisprhwc, WebComp_Tdisprhwc_Component) != 0 ) )
                        {
                           WebComp_Tdisprhwc = WebUtils.getWebComponent(getClass(), "app." + OldTdisprhwc + "_impl", remoteHandle, context);
                           WebComp_Tdisprhwc_Component = OldTdisprhwc ;
                        }
                        if ( GXutil.len( WebComp_Tdisprhwc_Component) != 0 )
                        {
                           WebComp_Tdisprhwc.componentprocess("W0097", "", sEvt);
                        }
                        WebComp_Tdisprhwc_Component = OldTdisprhwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weKY2( )
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

   public void paKY2( )
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
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
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
      send_integrity_hashes( ) ;
      rfKY2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rfKY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
            {
               WebComp_Generalwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Tdisaldwc_Component) != 0 )
            {
               WebComp_Tdisaldwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Tdisalnwc_Component) != 0 )
            {
               WebComp_Tdisalnwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Tdisdefwc_Component) != 0 )
            {
               WebComp_Tdisdefwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Tdisfaswc_Component) != 0 )
            {
               WebComp_Tdisfaswc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Tdisobswc_Component) != 0 )
            {
               WebComp_Tdisobswc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Tdisposwc_Component) != 0 )
            {
               WebComp_Tdisposwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Tdisprowc_Component) != 0 )
            {
               WebComp_Tdisprowc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Tdispohwc_Component) != 0 )
            {
               WebComp_Tdispohwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Tdisprhwc_Component) != 0 )
            {
               WebComp_Tdisprhwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e12KY2 ();
         wbKY0( ) ;
      }
   }

   public void send_integrity_lvl_hashesKY2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupKY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11KY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV9EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         AV10DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV11LoadAllTabs = GXutil.strtobool( httpContext.cgiGet( "vLOADALLTABS")) ;
         AV12SelectedTabCode = httpContext.cgiGet( "vSELECTEDTABCODE") ;
         Tabs_Activepagecontrolname = httpContext.cgiGet( "TABS_Activepagecontrolname") ;
         Tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Tabs_Class = httpContext.cgiGet( "TABS_Class") ;
         Tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "TABS_Historymanagement")) ;
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e11KY2 ();
      if (returnInSub) return;
   }

   public void e11KY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      nwdpprocesosview_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      GXv_char2[0] = AV9EmprCod ;
      GXv_char3[0] = AV16Emprnom ;
      GXv_char4[0] = AV17Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      nwdpprocesosview_impl.this.AV9EmprCod = GXv_char2[0] ;
      nwdpprocesosview_impl.this.AV16Emprnom = GXv_char3[0] ;
      nwdpprocesosview_impl.this.AV17Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9EmprCod, "@!"))));
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      lblWorkwithlink_Link = formatLink("app.nwdpprocesosww", new String[] {}, new String[] {})  ;
      httpContext.ajax_rsp_assign_prop("", false, lblWorkwithlink_Internalname, "Link", lblWorkwithlink_Link, true);
      AV18GXLvl13 = (byte)(0) ;
      /* Using cursor H00KY2 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Integer.valueOf(AV10DisCod), AV9EmprCod, Integer.valueOf(AV10DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = H00KY2_A361DisCod[0] ;
         A396EmprCod = H00KY2_A396EmprCod[0] ;
         AV18GXLvl13 = (byte)(1) ;
         Form.setCaption( httpContext.getMessage( "Nw DPProcesos", "") );
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
         AV8Exists = true ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl13 == 0 )
      {
         Form.setCaption( httpContext.getMessage( "WWP_RecordNotFound", "") );
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
         AV8Exists = false ;
      }
      if ( AV8Exists )
      {
         AV12SelectedTabCode = AV7TabCode ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12SelectedTabCode", AV12SelectedTabCode);
         Tabs_Activepagecontrolname = AV12SelectedTabCode ;
         ucTabs.sendProperty(context, "", false, Tabs_Internalname, "ActivePageControlName", Tabs_Activepagecontrolname);
         /* Execute user subroutine: 'LOADTABS' */
         S112 ();
         if (returnInSub) return;
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e12KY2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'LOADTABS' Routine */
      returnInSub = false ;
      if ( AV11LoadAllTabs || ( GXutil.strcmp(AV12SelectedTabCode, "") == 0 ) || ( GXutil.strcmp(AV12SelectedTabCode, "General") == 0 ) )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Generalwc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Generalwc_Component), GXutil.lower( "NwDPProcesosGeneral")) != 0 )
         {
            WebComp_Generalwc = WebUtils.getWebComponent(getClass(), "app.nwdpprocesosgeneral_impl", remoteHandle, context);
            WebComp_Generalwc_Component = "NwDPProcesosGeneral" ;
         }
         if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
         {
            WebComp_Generalwc.setjustcreated();
            WebComp_Generalwc.componentprepare(new Object[] {"W0025","",AV9EmprCod,Integer.valueOf(AV10DisCod)});
            WebComp_Generalwc.componentbind(new Object[] {"",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Generalwc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0025"+"");
            WebComp_Generalwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV11LoadAllTabs || ( GXutil.strcmp(AV12SelectedTabCode, "TDISALD") == 0 ) )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Tdisaldwc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Tdisaldwc_Component), GXutil.lower( "NwDPProcesosTDISALD")) != 0 )
         {
            WebComp_Tdisaldwc = WebUtils.getWebComponent(getClass(), "app.nwdpprocesostdisald_impl", remoteHandle, context);
            WebComp_Tdisaldwc_Component = "NwDPProcesosTDISALD" ;
         }
         if ( GXutil.len( WebComp_Tdisaldwc_Component) != 0 )
         {
            WebComp_Tdisaldwc.setjustcreated();
            WebComp_Tdisaldwc.componentprepare(new Object[] {"W0033","",AV9EmprCod,Integer.valueOf(AV10DisCod)});
            WebComp_Tdisaldwc.componentbind(new Object[] {"",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Tdisaldwc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0033"+"");
            WebComp_Tdisaldwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV11LoadAllTabs || ( GXutil.strcmp(AV12SelectedTabCode, "TDISALN") == 0 ) )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Tdisalnwc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Tdisalnwc_Component), GXutil.lower( "NwDPProcesosTDISALN")) != 0 )
         {
            WebComp_Tdisalnwc = WebUtils.getWebComponent(getClass(), "app.nwdpprocesostdisaln_impl", remoteHandle, context);
            WebComp_Tdisalnwc_Component = "NwDPProcesosTDISALN" ;
         }
         if ( GXutil.len( WebComp_Tdisalnwc_Component) != 0 )
         {
            WebComp_Tdisalnwc.setjustcreated();
            WebComp_Tdisalnwc.componentprepare(new Object[] {"W0041","",AV9EmprCod,Integer.valueOf(AV10DisCod)});
            WebComp_Tdisalnwc.componentbind(new Object[] {"",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Tdisalnwc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0041"+"");
            WebComp_Tdisalnwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV11LoadAllTabs || ( GXutil.strcmp(AV12SelectedTabCode, "TDISDEF") == 0 ) )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Tdisdefwc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Tdisdefwc_Component), GXutil.lower( "NwDPProcesosTDISDEF")) != 0 )
         {
            WebComp_Tdisdefwc = WebUtils.getWebComponent(getClass(), "app.nwdpprocesostdisdef_impl", remoteHandle, context);
            WebComp_Tdisdefwc_Component = "NwDPProcesosTDISDEF" ;
         }
         if ( GXutil.len( WebComp_Tdisdefwc_Component) != 0 )
         {
            WebComp_Tdisdefwc.setjustcreated();
            WebComp_Tdisdefwc.componentprepare(new Object[] {"W0049","",AV9EmprCod,Integer.valueOf(AV10DisCod)});
            WebComp_Tdisdefwc.componentbind(new Object[] {"",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Tdisdefwc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0049"+"");
            WebComp_Tdisdefwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV11LoadAllTabs || ( GXutil.strcmp(AV12SelectedTabCode, "TDISFAS") == 0 ) )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Tdisfaswc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Tdisfaswc_Component), GXutil.lower( "NwDPProcesosTDISFAS")) != 0 )
         {
            WebComp_Tdisfaswc = WebUtils.getWebComponent(getClass(), "app.nwdpprocesostdisfas_impl", remoteHandle, context);
            WebComp_Tdisfaswc_Component = "NwDPProcesosTDISFAS" ;
         }
         if ( GXutil.len( WebComp_Tdisfaswc_Component) != 0 )
         {
            WebComp_Tdisfaswc.setjustcreated();
            WebComp_Tdisfaswc.componentprepare(new Object[] {"W0057","",AV9EmprCod,Integer.valueOf(AV10DisCod)});
            WebComp_Tdisfaswc.componentbind(new Object[] {"",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Tdisfaswc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0057"+"");
            WebComp_Tdisfaswc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV11LoadAllTabs || ( GXutil.strcmp(AV12SelectedTabCode, "TDISOBS") == 0 ) )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Tdisobswc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Tdisobswc_Component), GXutil.lower( "NwDPProcesosTDISOBS")) != 0 )
         {
            WebComp_Tdisobswc = WebUtils.getWebComponent(getClass(), "app.nwdpprocesostdisobs_impl", remoteHandle, context);
            WebComp_Tdisobswc_Component = "NwDPProcesosTDISOBS" ;
         }
         if ( GXutil.len( WebComp_Tdisobswc_Component) != 0 )
         {
            WebComp_Tdisobswc.setjustcreated();
            WebComp_Tdisobswc.componentprepare(new Object[] {"W0065","",AV9EmprCod,Integer.valueOf(AV10DisCod)});
            WebComp_Tdisobswc.componentbind(new Object[] {"",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Tdisobswc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0065"+"");
            WebComp_Tdisobswc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV11LoadAllTabs || ( GXutil.strcmp(AV12SelectedTabCode, "TDISPOS") == 0 ) )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Tdisposwc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Tdisposwc_Component), GXutil.lower( "NwDPProcesosTDISPOS")) != 0 )
         {
            WebComp_Tdisposwc = WebUtils.getWebComponent(getClass(), "app.nwdpprocesostdispos_impl", remoteHandle, context);
            WebComp_Tdisposwc_Component = "NwDPProcesosTDISPOS" ;
         }
         if ( GXutil.len( WebComp_Tdisposwc_Component) != 0 )
         {
            WebComp_Tdisposwc.setjustcreated();
            WebComp_Tdisposwc.componentprepare(new Object[] {"W0073","",AV9EmprCod,Integer.valueOf(AV10DisCod)});
            WebComp_Tdisposwc.componentbind(new Object[] {"",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Tdisposwc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0073"+"");
            WebComp_Tdisposwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV11LoadAllTabs || ( GXutil.strcmp(AV12SelectedTabCode, "TDISPRO") == 0 ) )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Tdisprowc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Tdisprowc_Component), GXutil.lower( "NwDPProcesosTDISPRO")) != 0 )
         {
            WebComp_Tdisprowc = WebUtils.getWebComponent(getClass(), "app.nwdpprocesostdispro_impl", remoteHandle, context);
            WebComp_Tdisprowc_Component = "NwDPProcesosTDISPRO" ;
         }
         if ( GXutil.len( WebComp_Tdisprowc_Component) != 0 )
         {
            WebComp_Tdisprowc.setjustcreated();
            WebComp_Tdisprowc.componentprepare(new Object[] {"W0081","",AV9EmprCod,Integer.valueOf(AV10DisCod)});
            WebComp_Tdisprowc.componentbind(new Object[] {"",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Tdisprowc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0081"+"");
            WebComp_Tdisprowc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV11LoadAllTabs || ( GXutil.strcmp(AV12SelectedTabCode, "TDISPOH") == 0 ) )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Tdispohwc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Tdispohwc_Component), GXutil.lower( "NwDPProcesosTDISPOH")) != 0 )
         {
            WebComp_Tdispohwc = WebUtils.getWebComponent(getClass(), "app.nwdpprocesostdispoh_impl", remoteHandle, context);
            WebComp_Tdispohwc_Component = "NwDPProcesosTDISPOH" ;
         }
         if ( GXutil.len( WebComp_Tdispohwc_Component) != 0 )
         {
            WebComp_Tdispohwc.setjustcreated();
            WebComp_Tdispohwc.componentprepare(new Object[] {"W0089","",AV9EmprCod,Integer.valueOf(AV10DisCod)});
            WebComp_Tdispohwc.componentbind(new Object[] {"",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Tdispohwc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0089"+"");
            WebComp_Tdispohwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      if ( AV11LoadAllTabs || ( GXutil.strcmp(AV12SelectedTabCode, "TDISPRH") == 0 ) )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Tdisprhwc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Tdisprhwc_Component), GXutil.lower( "NwDPProcesosTDISPRH")) != 0 )
         {
            WebComp_Tdisprhwc = WebUtils.getWebComponent(getClass(), "app.nwdpprocesostdisprh_impl", remoteHandle, context);
            WebComp_Tdisprhwc_Component = "NwDPProcesosTDISPRH" ;
         }
         if ( GXutil.len( WebComp_Tdisprhwc_Component) != 0 )
         {
            WebComp_Tdisprhwc.setjustcreated();
            WebComp_Tdisprhwc.componentprepare(new Object[] {"W0097","",AV9EmprCod,Integer.valueOf(AV10DisCod)});
            WebComp_Tdisprhwc.componentbind(new Object[] {"",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Tdisprhwc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0097"+"");
            WebComp_Tdisprhwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV9EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9EmprCod, "@!"))));
      AV10DisCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DisCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10DisCod), "ZZZZZZZ9")));
      AV7TabCode = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7TabCode", AV7TabCode);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABCODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7TabCode, ""))));
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
      paKY2( ) ;
      wsKY2( ) ;
      weKY2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Generalwc == null ) )
      {
         if ( GXutil.len( WebComp_Generalwc_Component) != 0 )
         {
            WebComp_Generalwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Tdisaldwc == null ) )
      {
         if ( GXutil.len( WebComp_Tdisaldwc_Component) != 0 )
         {
            WebComp_Tdisaldwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Tdisalnwc == null ) )
      {
         if ( GXutil.len( WebComp_Tdisalnwc_Component) != 0 )
         {
            WebComp_Tdisalnwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Tdisdefwc == null ) )
      {
         if ( GXutil.len( WebComp_Tdisdefwc_Component) != 0 )
         {
            WebComp_Tdisdefwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Tdisfaswc == null ) )
      {
         if ( GXutil.len( WebComp_Tdisfaswc_Component) != 0 )
         {
            WebComp_Tdisfaswc.componentthemes();
         }
      }
      if ( ! ( WebComp_Tdisobswc == null ) )
      {
         if ( GXutil.len( WebComp_Tdisobswc_Component) != 0 )
         {
            WebComp_Tdisobswc.componentthemes();
         }
      }
      if ( ! ( WebComp_Tdisposwc == null ) )
      {
         if ( GXutil.len( WebComp_Tdisposwc_Component) != 0 )
         {
            WebComp_Tdisposwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Tdisprowc == null ) )
      {
         if ( GXutil.len( WebComp_Tdisprowc_Component) != 0 )
         {
            WebComp_Tdisprowc.componentthemes();
         }
      }
      if ( ! ( WebComp_Tdispohwc == null ) )
      {
         if ( GXutil.len( WebComp_Tdispohwc_Component) != 0 )
         {
            WebComp_Tdispohwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Tdisprhwc == null ) )
      {
         if ( GXutil.len( WebComp_Tdisprhwc_Component) != 0 )
         {
            WebComp_Tdisprhwc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116121850", true, true);
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
      httpContext.AddJavascriptSource("nwdpprocesosview.js", "?202682116121850", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblWorkwithlink_Internalname = "WORKWITHLINK" ;
      divTableviewrightitems_Internalname = "TABLEVIEWRIGHTITEMS" ;
      lblGeneral_title_Internalname = "GENERAL_TITLE" ;
      divUnnamedtablegeneral_Internalname = "UNNAMEDTABLEGENERAL" ;
      lblTdisald_title_Internalname = "TDISALD_TITLE" ;
      divUnnamedtabletdisald_Internalname = "UNNAMEDTABLETDISALD" ;
      lblTdisaln_title_Internalname = "TDISALN_TITLE" ;
      divUnnamedtabletdisaln_Internalname = "UNNAMEDTABLETDISALN" ;
      lblTdisdef_title_Internalname = "TDISDEF_TITLE" ;
      divUnnamedtabletdisdef_Internalname = "UNNAMEDTABLETDISDEF" ;
      lblTdisfas_title_Internalname = "TDISFAS_TITLE" ;
      divUnnamedtabletdisfas_Internalname = "UNNAMEDTABLETDISFAS" ;
      lblTdisobs_title_Internalname = "TDISOBS_TITLE" ;
      divUnnamedtabletdisobs_Internalname = "UNNAMEDTABLETDISOBS" ;
      lblTdispos_title_Internalname = "TDISPOS_TITLE" ;
      divUnnamedtabletdispos_Internalname = "UNNAMEDTABLETDISPOS" ;
      lblTdispro_title_Internalname = "TDISPRO_TITLE" ;
      divUnnamedtabletdispro_Internalname = "UNNAMEDTABLETDISPRO" ;
      lblTdispoh_title_Internalname = "TDISPOH_TITLE" ;
      divUnnamedtabletdispoh_Internalname = "UNNAMEDTABLETDISPOH" ;
      lblTdisprh_title_Internalname = "TDISPRH_TITLE" ;
      divUnnamedtabletdisprh_Internalname = "UNNAMEDTABLETDISPRH" ;
      Tabs_Internalname = "TABS" ;
      divUnnamedtableviewcontainer_Internalname = "UNNAMEDTABLEVIEWCONTAINER" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      lblWorkwithlink_Link = "" ;
      Tabs_Historymanagement = GXutil.toBoolean( -1) ;
      Tabs_Class = "ViewTab Tab" ;
      Tabs_Pagecount = 10 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Nw DPProcesos View", "") );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV10DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV7TabCode',fld:'vTABCODE',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
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
      wcpOAV9EmprCod = "" ;
      wcpOAV7TabCode = "" ;
      Tabs_Activepagecontrolname = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV9EmprCod = "" ;
      AV7TabCode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV12SelectedTabCode = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblWorkwithlink_Jsonclick = "" ;
      ucTabs = new com.genexus.webpanels.GXUserControl();
      lblGeneral_title_Jsonclick = "" ;
      WebComp_Generalwc_Component = "" ;
      OldGeneralwc = "" ;
      lblTdisald_title_Jsonclick = "" ;
      WebComp_Tdisaldwc_Component = "" ;
      OldTdisaldwc = "" ;
      lblTdisaln_title_Jsonclick = "" ;
      WebComp_Tdisalnwc_Component = "" ;
      OldTdisalnwc = "" ;
      lblTdisdef_title_Jsonclick = "" ;
      WebComp_Tdisdefwc_Component = "" ;
      OldTdisdefwc = "" ;
      lblTdisfas_title_Jsonclick = "" ;
      WebComp_Tdisfaswc_Component = "" ;
      OldTdisfaswc = "" ;
      lblTdisobs_title_Jsonclick = "" ;
      WebComp_Tdisobswc_Component = "" ;
      OldTdisobswc = "" ;
      lblTdispos_title_Jsonclick = "" ;
      WebComp_Tdisposwc_Component = "" ;
      OldTdisposwc = "" ;
      lblTdispro_title_Jsonclick = "" ;
      WebComp_Tdisprowc_Component = "" ;
      OldTdisprowc = "" ;
      lblTdispoh_title_Jsonclick = "" ;
      WebComp_Tdispohwc_Component = "" ;
      OldTdispohwc = "" ;
      lblTdisprh_title_Jsonclick = "" ;
      WebComp_Tdisprhwc_Component = "" ;
      OldTdisprhwc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV16Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV17Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      H00KY2_A361DisCod = new int[1] ;
      H00KY2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpprocesosview__default(),
         new Object[] {
             new Object[] {
            H00KY2_A361DisCod, H00KY2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Generalwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Tdisaldwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Tdisalnwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Tdisdefwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Tdisfaswc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Tdisobswc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Tdisposwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Tdisprowc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Tdispohwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Tdisprhwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV18GXLvl13 ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV10DisCod ;
   private int AV10DisCod ;
   private int Tabs_Pagecount ;
   private int A361DisCod ;
   private int idxLst ;
   private String wcpOAV9EmprCod ;
   private String wcpOAV7TabCode ;
   private String Tabs_Activepagecontrolname ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV9EmprCod ;
   private String AV7TabCode ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV12SelectedTabCode ;
   private String Tabs_Class ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTableviewrightitems_Internalname ;
   private String lblWorkwithlink_Internalname ;
   private String lblWorkwithlink_Link ;
   private String lblWorkwithlink_Jsonclick ;
   private String divUnnamedtableviewcontainer_Internalname ;
   private String Tabs_Internalname ;
   private String lblGeneral_title_Internalname ;
   private String lblGeneral_title_Jsonclick ;
   private String divUnnamedtablegeneral_Internalname ;
   private String WebComp_Generalwc_Component ;
   private String OldGeneralwc ;
   private String lblTdisald_title_Internalname ;
   private String lblTdisald_title_Jsonclick ;
   private String divUnnamedtabletdisald_Internalname ;
   private String WebComp_Tdisaldwc_Component ;
   private String OldTdisaldwc ;
   private String lblTdisaln_title_Internalname ;
   private String lblTdisaln_title_Jsonclick ;
   private String divUnnamedtabletdisaln_Internalname ;
   private String WebComp_Tdisalnwc_Component ;
   private String OldTdisalnwc ;
   private String lblTdisdef_title_Internalname ;
   private String lblTdisdef_title_Jsonclick ;
   private String divUnnamedtabletdisdef_Internalname ;
   private String WebComp_Tdisdefwc_Component ;
   private String OldTdisdefwc ;
   private String lblTdisfas_title_Internalname ;
   private String lblTdisfas_title_Jsonclick ;
   private String divUnnamedtabletdisfas_Internalname ;
   private String WebComp_Tdisfaswc_Component ;
   private String OldTdisfaswc ;
   private String lblTdisobs_title_Internalname ;
   private String lblTdisobs_title_Jsonclick ;
   private String divUnnamedtabletdisobs_Internalname ;
   private String WebComp_Tdisobswc_Component ;
   private String OldTdisobswc ;
   private String lblTdispos_title_Internalname ;
   private String lblTdispos_title_Jsonclick ;
   private String divUnnamedtabletdispos_Internalname ;
   private String WebComp_Tdisposwc_Component ;
   private String OldTdisposwc ;
   private String lblTdispro_title_Internalname ;
   private String lblTdispro_title_Jsonclick ;
   private String divUnnamedtabletdispro_Internalname ;
   private String WebComp_Tdisprowc_Component ;
   private String OldTdisprowc ;
   private String lblTdispoh_title_Internalname ;
   private String lblTdispoh_title_Jsonclick ;
   private String divUnnamedtabletdispoh_Internalname ;
   private String WebComp_Tdispohwc_Component ;
   private String OldTdispohwc ;
   private String lblTdisprh_title_Internalname ;
   private String lblTdisprh_title_Jsonclick ;
   private String divUnnamedtabletdisprh_Internalname ;
   private String WebComp_Tdisprhwc_Component ;
   private String OldTdisprhwc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV15Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16Emprnom ;
   private String GXv_char3[] ;
   private String AV17Usurcod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV11LoadAllTabs ;
   private boolean Tabs_Historymanagement ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV8Exists ;
   private boolean bDynCreated_Generalwc ;
   private boolean bDynCreated_Tdisaldwc ;
   private boolean bDynCreated_Tdisalnwc ;
   private boolean bDynCreated_Tdisdefwc ;
   private boolean bDynCreated_Tdisfaswc ;
   private boolean bDynCreated_Tdisobswc ;
   private boolean bDynCreated_Tdisposwc ;
   private boolean bDynCreated_Tdisprowc ;
   private boolean bDynCreated_Tdispohwc ;
   private boolean bDynCreated_Tdisprhwc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Generalwc ;
   private GXWebComponent WebComp_Tdisaldwc ;
   private GXWebComponent WebComp_Tdisalnwc ;
   private GXWebComponent WebComp_Tdisdefwc ;
   private GXWebComponent WebComp_Tdisfaswc ;
   private GXWebComponent WebComp_Tdisobswc ;
   private GXWebComponent WebComp_Tdisposwc ;
   private GXWebComponent WebComp_Tdisprowc ;
   private GXWebComponent WebComp_Tdispohwc ;
   private GXWebComponent WebComp_Tdisprhwc ;
   private com.genexus.webpanels.GXUserControl ucTabs ;
   private IDataStoreProvider pr_default ;
   private int[] H00KY2_A361DisCod ;
   private String[] H00KY2_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class nwdpprocesosview__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00KY2", "SELECT DisCod, EmprCod FROM TXPDISPOS WHERE (EmprCod = ? and DisCod = ?) AND (EmprCod = ? and DisCod = ?) ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

