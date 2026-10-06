package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwccpolnbackup_impl extends GXDataArea
{
   public wwccpolnbackup_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwccpolnbackup_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwccpolnbackup_impl.class ));
   }

   public wwccpolnbackup_impl( int remoteHandle ,
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
      pa1WJ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WJ2( ) ;
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
      httpContext.AddJavascriptSource("Treeview/assets/js/yahoo.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/event.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/treeview.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/dom.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/yahoo-dom-event.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/dragdrop.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/DDSend.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/TreeviewRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wwccpolnbackup", new String[] {}, new String[] {}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTREENODECOLLECTIONDATA", AV64treeNodeCollectionData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTREENODECOLLECTIONDATA", AV64treeNodeCollectionData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSELECTEDTREENODE", AV65selectedTreeNode);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSELECTEDTREENODE", AV65selectedTreeNode);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV19EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTARC", GXutil.rtrim( AV14CCtarc));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9BarCodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV71GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPANEL_Width", GXutil.rtrim( Dvpanel_tablepanel_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPANEL_Autowidth", GXutil.booltostr( Dvpanel_tablepanel_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPANEL_Autoheight", GXutil.booltostr( Dvpanel_tablepanel_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPANEL_Cls", GXutil.rtrim( Dvpanel_tablepanel_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPANEL_Title", GXutil.rtrim( Dvpanel_tablepanel_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPANEL_Collapsible", GXutil.booltostr( Dvpanel_tablepanel_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPANEL_Collapsed", GXutil.booltostr( Dvpanel_tablepanel_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPANEL_Showcollapseicon", GXutil.booltostr( Dvpanel_tablepanel_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPANEL_Iconposition", GXutil.rtrim( Dvpanel_tablepanel_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPANEL_Autoscroll", GXutil.booltostr( Dvpanel_tablepanel_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Title", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Result", GXutil.rtrim( Dvelop_confirmpanel_btnuseraction1_Result));
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
         we1WJ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WJ2( ) ;
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
      return formatLink("app.controlcalidadhtd.wwccpolnbackup", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.WWCCPOLNBackup" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Elaborar Relatórios CQ", "") ;
   }

   public void wb1WJ0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablepanel.setProperty("Width", Dvpanel_tablepanel_Width);
         ucDvpanel_tablepanel.setProperty("AutoWidth", Dvpanel_tablepanel_Autowidth);
         ucDvpanel_tablepanel.setProperty("AutoHeight", Dvpanel_tablepanel_Autoheight);
         ucDvpanel_tablepanel.setProperty("Cls", Dvpanel_tablepanel_Cls);
         ucDvpanel_tablepanel.setProperty("Title", Dvpanel_tablepanel_Title);
         ucDvpanel_tablepanel.setProperty("Collapsible", Dvpanel_tablepanel_Collapsible);
         ucDvpanel_tablepanel.setProperty("Collapsed", Dvpanel_tablepanel_Collapsed);
         ucDvpanel_tablepanel.setProperty("ShowCollapseIcon", Dvpanel_tablepanel_Showcollapseicon);
         ucDvpanel_tablepanel.setProperty("IconPosition", Dvpanel_tablepanel_Iconposition);
         ucDvpanel_tablepanel.setProperty("AutoScroll", Dvpanel_tablepanel_Autoscroll);
         ucDvpanel_tablepanel.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablepanel_Internalname, "DVPANEL_TABLEPANELContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEPANELContainer"+"TablePanel"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepanel_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesearchparm_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Ordem Servico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcadreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcadreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcadreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV70BarCadReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcadreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70BarCadReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV70BarCadReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcadreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcadreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV8BarCodPar), GXutil.rtrim( localUtil.format( AV8BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableprompt1_Internalname, 1, 0, "px", 0, "px", "Prompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblPrompt1_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fa-1x\"></i>", ""), "", "", lblPrompt1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOPROMPT1\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Buscar el codigo del cliente", ""), 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablemodeloseleccionado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmodeloseleccionado_Internalname, ".", "", "", lblTextblockmodeloseleccionado_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontainerform_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemenu_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDivtitle1_Internalname, 1, 0, "px", 0, "px", "BlocoInfo", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLit3_Internalname, httpContext.getMessage( "Lit3", ""), "gx-form-item BlocoInfoLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLit3_Internalname, GXutil.rtrim( AV45Lit3), GXutil.rtrim( localUtil.format( AV45Lit3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLit3_Jsonclick, 0, "BlocoInfo", "", "", "", "", 1, edtavLit3_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDivtitle2_Internalname, 1, 0, "px", 0, "px", "BlocoInfo", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLit8_Internalname, httpContext.getMessage( "Lit8", ""), "gx-form-item BlocoInfoLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLit8_Internalname, GXutil.rtrim( AV50Lit8), GXutil.rtrim( localUtil.format( AV50Lit8, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLit8_Jsonclick, 0, "BlocoInfo", "", "", "", "", 1, edtavLit8_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-9", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup1_Internalname, httpContext.getMessage( "Modelos", ""), 1, 0, "px", 0, "px", "GroupVerticalScroll", "", "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
         wb_table1_60_1WJ2( true) ;
      }
      else
      {
         wb_table1_60_1WJ2( false) ;
      }
      return  ;
   }

   public void wb_table1_60_1WJ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divTableerrorviewer_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-9", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebutton_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnuseraction1_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111wj1_client"+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV74Pgmname), GXutil.rtrim( localUtil.format( AV74Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavPathmodelos_Internalname, AV54pathModelos, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", (short)(0), edtavPathmodelos_Visible, 1, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\WWCCPOLNBackup.htm");
         wb_table2_84_1WJ2( true) ;
      }
      else
      {
         wb_table2_84_1WJ2( false) ;
      }
      return  ;
   }

   public void wb_table2_84_1WJ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1WJ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Elaborar Relatórios CQ", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WJ0( ) ;
   }

   public void ws1WJ2( )
   {
      start1WJ2( ) ;
      evt1WJ2( ) ;
   }

   public void evt1WJ2( )
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
                           e121WJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPROMPT1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Doprompt1' */
                           e131WJ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e141WJ2 ();
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1WJ2( )
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

   public void pa1WJ2( )
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
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      rf1WJ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV75Pgmdesc = httpContext.getMessage( "Elaborar Relatórios CQ", "") ;
      AV74Pgmname = "ControlCalidadHTD.WWCCPOLNBackup" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
      Gx_err = (short)(0) ;
      edtavLit3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit3_Enabled), 5, 0), true);
      edtavLit8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit8_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WJ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e141WJ2 ();
         wb1WJ0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1WJ2( )
   {
   }

   public void before_start_formulas( )
   {
      AV75Pgmdesc = httpContext.getMessage( "Elaborar Relatórios CQ", "") ;
      AV74Pgmname = "ControlCalidadHTD.WWCCPOLNBackup" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
      Gx_err = (short)(0) ;
      edtavLit3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit3_Enabled), 5, 0), true);
      edtavLit8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit8_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WJ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121WJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTREENODECOLLECTIONDATA"), AV64treeNodeCollectionData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSELECTEDTREENODE"), AV65selectedTreeNode);
         /* Read saved values. */
         AV14CCtarc = httpContext.cgiGet( "vCCTARC") ;
         AV19EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         Dvpanel_tablepanel_Width = httpContext.cgiGet( "DVPANEL_TABLEPANEL_Width") ;
         Dvpanel_tablepanel_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPANEL_Autowidth")) ;
         Dvpanel_tablepanel_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPANEL_Autoheight")) ;
         Dvpanel_tablepanel_Cls = httpContext.cgiGet( "DVPANEL_TABLEPANEL_Cls") ;
         Dvpanel_tablepanel_Title = httpContext.cgiGet( "DVPANEL_TABLEPANEL_Title") ;
         Dvpanel_tablepanel_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPANEL_Collapsible")) ;
         Dvpanel_tablepanel_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPANEL_Collapsed")) ;
         Dvpanel_tablepanel_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPANEL_Showcollapseicon")) ;
         Dvpanel_tablepanel_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEPANEL_Iconposition") ;
         Dvpanel_tablepanel_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPANEL_Autoscroll")) ;
         Dvelop_confirmpanel_btnuseraction1_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Title") ;
         Dvelop_confirmpanel_btnuseraction1_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmationtext") ;
         Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnuseraction1_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNUSERACTION1_Confirmtype") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
         }
         else
         {
            AV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCADREO");
            GX_FocusControl = edtavBarcadreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70BarCadReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70BarCadReo", GXutil.str( AV70BarCadReo, 1, 0));
         }
         else
         {
            AV70BarCadReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70BarCadReo", GXutil.str( AV70BarCadReo, 1, 0));
         }
         AV8BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
         AV45Lit3 = httpContext.cgiGet( edtavLit3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Lit3", AV45Lit3);
         AV50Lit8 = httpContext.cgiGet( edtavLit8_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Lit8", AV50Lit8);
         AV74Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
         AV54pathModelos = httpContext.cgiGet( edtavPathmodelos_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54pathModelos", AV54pathModelos);
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
      e121WJ2 ();
      if (returnInSub) return;
   }

   public void e121WJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV59Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char2[0] ;
      AV59Station = GXt_char1 ;
      GXv_char2[0] = AV19EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV62UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV59Station, GXv_char2, GXv_char3, GXv_char4) ;
      wwccpolnbackup_impl.this.AV19EmprCod = GXv_char2[0] ;
      wwccpolnbackup_impl.this.AV20EmprNom = GXv_char3[0] ;
      wwccpolnbackup_impl.this.AV62UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      tblTableformmain_Height = 400 ;
      httpContext.ajax_rsp_assign_prop("", false, tblTableformmain_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTableformmain_Height), 9, 0), true);
      edtavPathmodelos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathmodelos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathmodelos_Visible), 5, 0), true);
      GXt_char1 = AV32Lit0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV32Lit0 = GXt_char1 ;
      GXt_char1 = AV52LitFe ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV52LitFe = GXt_char1 ;
      GXt_char1 = AV43Lit2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV75Pgmdesc, (byte)(99), GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43Lit2 = GXt_char1 ;
      GXt_char1 = AV45Lit3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN275_", ""), (byte)(99), GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV45Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Lit3", AV45Lit3);
      GXt_char1 = AV46Lit4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV46Lit4 = GXt_char1 ;
      GXt_char1 = AV47Lit5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV47Lit5 = GXt_char1 ;
      GXt_char1 = AV48Lit6 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2065_", ""), (byte)(99), GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV48Lit6 = GXt_char1 ;
      GXt_char1 = AV49Lit7 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2430_", ""), (byte)(99), GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV49Lit7 = GXt_char1 ;
      GXt_char1 = AV50Lit8 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL158_", ""), (byte)(99), GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV50Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Lit8", AV50Lit8);
      if ( GXutil.strcmp(AV50Lit8, httpContext.getMessage( "WCFL158_", "")) == 0 )
      {
         AV50Lit8 = httpContext.getMessage( "Arquivo", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Lit8", AV50Lit8);
      }
      GXt_char1 = AV59Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV59Station = GXt_char1 ;
      GXv_char4[0] = AV19EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char2[0] = AV62UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV59Station, GXv_char4, GXv_char3, GXv_char2) ;
      wwccpolnbackup_impl.this.AV19EmprCod = GXv_char4[0] ;
      wwccpolnbackup_impl.this.AV20EmprNom = GXv_char3[0] ;
      wwccpolnbackup_impl.this.AV62UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      GXt_char1 = AV54pathModelos ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV19EmprCod, httpContext.getMessage( "CCTDIR", ""), GXv_char4) ;
      wwccpolnbackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV54pathModelos = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54pathModelos", AV54pathModelos);
      AV54pathModelos = ((GXutil.strcmp("", AV54pathModelos)==0) ? httpContext.getMessage( "D:\\\\MODELOS\\\\CC", "") : AV54pathModelos) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54pathModelos", AV54pathModelos);
      GXt_int5 = AV13CargaModelos ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV19EmprCod, httpContext.getMessage( "LOADMD", ""), GXv_int6) ;
      wwccpolnbackup_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13CargaModelos = GXt_int5 ;
      AV26Flag_load = (byte)(0) ;
      /* Execute user subroutine: 'CARGAMODELOS' */
      S112 ();
      if (returnInSub) return;
   }

   public void e131WJ2( )
   {
      /* 'Doprompt1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.albaranes.albaranguia_prompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV71GuiRemCli,6,0))}, new String[] {"InOutEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InOutGuiRemCli"}) , new Object[] {"AV19EmprCod","AV6BarCod","AV9BarCodreo","AV8BarCodPar","AV71GuiRemCli"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'CARGAMODELOS' Routine */
      returnInSub = false ;
      AV69directory.setSource( GXutil.trim( AV54pathModelos) );
      AV66treeNode.setgxTv_SdtTreeNodeCollection_TreeNode_Id( httpContext.getMessage( "Modelos", "") );
      AV66treeNode.setgxTv_SdtTreeNodeCollection_TreeNode_Name( httpContext.getMessage( "Modelos", "") );
      AV66treeNode.setgxTv_SdtTreeNodeCollection_TreeNode_Expanded( true );
      AV64treeNodeCollectionData.add(AV66treeNode, 0);
      if ( AV69directory.exists() )
      {
         AV27i = 0 ;
         AV77GXV2 = 1 ;
         AV76GXV1 = (com.genexus.util.GXFileCollection)AV69directory.getFiles("");
         while ( AV77GXV2 <= AV76GXV1.getItemCount() )
         {
            AV68auxFile = (com.genexus.util.GXFile)AV76GXV1.item(AV77GXV2);
            AV27i = (int)(AV27i+1) ;
            AV66treeNode = (app.SdtTreeNodeCollection_TreeNode)new app.SdtTreeNodeCollection_TreeNode(remoteHandle, context);
            AV66treeNode.setgxTv_SdtTreeNodeCollection_TreeNode_Id( GXutil.str( AV27i, 6, 0) );
            AV66treeNode.setgxTv_SdtTreeNodeCollection_TreeNode_Name( AV68auxFile.getAbsoluteName() );
            AV67parent = (app.SdtTreeNodeCollection_TreeNode)((app.SdtTreeNodeCollection_TreeNode)AV64treeNodeCollectionData.elementAt(-1+1));
            AV67parent.getgxTv_SdtTreeNodeCollection_TreeNode_Nodes().add(AV66treeNode, 0);
            AV77GXV2 = (int)(AV77GXV2+1) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Diretorio não existe!", ""));
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e141WJ2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_84_1WJ2( boolean wbgen )
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
         wb_table2_84_1WJ2e( true) ;
      }
      else
      {
         wb_table2_84_1WJ2e( false) ;
      }
   }

   public void wb_table1_60_1WJ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString += " height: " + GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTableformmain_Height), 10, 0) + "px" + ";" ;
         app.GxWebStd.gx_table_start( httpContext, tblTableformmain_Internalname, tblTableformmain_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucTreeview.setProperty("TreeNodeCollectionData", AV64treeNodeCollectionData);
         ucTreeview.setProperty("SelectedTreeNode", AV65selectedTreeNode);
         ucTreeview.render(context, "treeview", Treeview_Internalname, "TREEVIEWContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_60_1WJ2e( true) ;
      }
      else
      {
         wb_table1_60_1WJ2e( false) ;
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
      pa1WJ2( ) ;
      ws1WJ2( ) ;
      we1WJ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016441535", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/wwccpolnbackup.js", "?202661016441535", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/yahoo.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/event.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/treeview.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/dom.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/yahoo-dom-event.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/dragdrop.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/assets/js/DDSend.js", "", false, true);
      httpContext.AddJavascriptSource("Treeview/TreeviewRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcadreo_Internalname = "vBARCADREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      lblPrompt1_Internalname = "PROMPT1" ;
      divTableprompt1_Internalname = "TABLEPROMPT1" ;
      divTablesearchparm_Internalname = "TABLESEARCHPARM" ;
      lblTextblockmodeloseleccionado_Internalname = "TEXTBLOCKMODELOSELECCIONADO" ;
      divTablemodeloseleccionado_Internalname = "TABLEMODELOSELECCIONADO" ;
      edtavLit3_Internalname = "vLIT3" ;
      divDivtitle1_Internalname = "DIVTITLE1" ;
      edtavLit8_Internalname = "vLIT8" ;
      divDivtitle2_Internalname = "DIVTITLE2" ;
      divTablemenu_Internalname = "TABLEMENU" ;
      Treeview_Internalname = "TREEVIEW" ;
      tblTableformmain_Internalname = "TABLEFORMMAIN" ;
      grpUnnamedgroup1_Internalname = "UNNAMEDGROUP1" ;
      divTablecontainerform_Internalname = "TABLECONTAINERFORM" ;
      divTableerrorviewer_Internalname = "TABLEERRORVIEWER" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      divTablebutton_Internalname = "TABLEBUTTON" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablepanel_Internalname = "TABLEPANEL" ;
      Dvpanel_tablepanel_Internalname = "DVPANEL_TABLEPANEL" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavPathmodelos_Internalname = "vPATHMODELOS" ;
      Dvelop_confirmpanel_btnuseraction1_Internalname = "DVELOP_CONFIRMPANEL_BTNUSERACTION1" ;
      tblTabledvelop_confirmpanel_btnuseraction1_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNUSERACTION1" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
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
      tblTableformmain_Height = 0 ;
      edtavPathmodelos_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavLit8_Jsonclick = "" ;
      edtavLit8_Enabled = 1 ;
      edtavLit3_Jsonclick = "" ;
      edtavLit3_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcadreo_Jsonclick = "" ;
      edtavBarcadreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      Dvelop_confirmpanel_btnuseraction1_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnuseraction1_Confirmationtext = "Confirma Datos?" ;
      Dvelop_confirmpanel_btnuseraction1_Title = httpContext.getMessage( "Aviso", "") ;
      Dvpanel_tablepanel_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablepanel_Iconposition = "Right" ;
      Dvpanel_tablepanel_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablepanel_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablepanel_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablepanel_Title = "" ;
      Dvpanel_tablepanel_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablepanel_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablepanel_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablepanel_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Elaborar Relatórios CQ", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e111WJ1',iparms:[]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[]}");
      setEventMetadata("'DOPROMPT1'","{handler:'e131WJ2',iparms:[{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV71GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOPROMPT1'",",oparms:[{av:'AV71GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      Dvelop_confirmpanel_btnuseraction1_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV64treeNodeCollectionData = new GXBaseCollection<app.SdtTreeNodeCollection_TreeNode>(app.SdtTreeNodeCollection_TreeNode.class, "TreeNode", "TexplusNET", remoteHandle);
      AV65selectedTreeNode = new app.SdtTreeNodeCollection_TreeNode(remoteHandle, context);
      AV19EmprCod = "" ;
      AV14CCtarc = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tablepanel = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV8BarCodPar = "" ;
      lblPrompt1_Jsonclick = "" ;
      lblTextblockmodeloseleccionado_Jsonclick = "" ;
      AV45Lit3 = "" ;
      AV50Lit8 = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      AV74Pgmname = "" ;
      AV54pathModelos = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV75Pgmdesc = "" ;
      AV59Station = "" ;
      AV20EmprNom = "" ;
      AV62UsurCod = "" ;
      AV32Lit0 = "" ;
      AV52LitFe = "" ;
      AV43Lit2 = "" ;
      AV46Lit4 = "" ;
      AV47Lit5 = "" ;
      AV48Lit6 = "" ;
      AV49Lit7 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV69directory = new com.genexus.util.GXDirectory();
      AV66treeNode = new app.SdtTreeNodeCollection_TreeNode(remoteHandle, context);
      AV76GXV1 = new com.genexus.util.GXFileCollection();
      AV68auxFile = new com.genexus.util.GXFile();
      AV67parent = new app.SdtTreeNodeCollection_TreeNode(remoteHandle, context);
      sStyleString = "" ;
      ucDvelop_confirmpanel_btnuseraction1 = new com.genexus.webpanels.GXUserControl();
      ucTreeview = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV75Pgmdesc = httpContext.getMessage( "Elaborar Relatórios CQ", "") ;
      AV74Pgmname = "ControlCalidadHTD.WWCCPOLNBackup" ;
      /* GeneXus formulas. */
      AV75Pgmdesc = httpContext.getMessage( "Elaborar Relatórios CQ", "") ;
      AV74Pgmname = "ControlCalidadHTD.WWCCPOLNBackup" ;
      Gx_err = (short)(0) ;
      edtavLit3_Enabled = 0 ;
      edtavLit8_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV9BarCodreo ;
   private byte AV70BarCadReo ;
   private byte nDonePA ;
   private byte AV13CargaModelos ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV26Flag_load ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV71GuiRemCli ;
   private int AV6BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcadreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavLit3_Enabled ;
   private int edtavLit8_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavPathmodelos_Visible ;
   private int tblTableformmain_Height ;
   private int AV27i ;
   private int AV77GXV2 ;
   private int idxLst ;
   private String Dvelop_confirmpanel_btnuseraction1_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV19EmprCod ;
   private String AV14CCtarc ;
   private String Dvpanel_tablepanel_Width ;
   private String Dvpanel_tablepanel_Cls ;
   private String Dvpanel_tablepanel_Title ;
   private String Dvpanel_tablepanel_Iconposition ;
   private String Dvelop_confirmpanel_btnuseraction1_Title ;
   private String Dvelop_confirmpanel_btnuseraction1_Confirmationtext ;
   private String Dvelop_confirmpanel_btnuseraction1_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnuseraction1_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnuseraction1_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tablepanel_Internalname ;
   private String divTablepanel_Internalname ;
   private String divTablecontent_Internalname ;
   private String divTablesearchparm_Internalname ;
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcadreo_Internalname ;
   private String edtavBarcadreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV8BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String divTableprompt1_Internalname ;
   private String lblPrompt1_Internalname ;
   private String lblPrompt1_Jsonclick ;
   private String divTablemodeloseleccionado_Internalname ;
   private String lblTextblockmodeloseleccionado_Internalname ;
   private String lblTextblockmodeloseleccionado_Jsonclick ;
   private String divTablecontainerform_Internalname ;
   private String divTablemenu_Internalname ;
   private String divDivtitle1_Internalname ;
   private String edtavLit3_Internalname ;
   private String AV45Lit3 ;
   private String edtavLit3_Jsonclick ;
   private String divDivtitle2_Internalname ;
   private String edtavLit8_Internalname ;
   private String AV50Lit8 ;
   private String edtavLit8_Jsonclick ;
   private String grpUnnamedgroup1_Internalname ;
   private String divTableerrorviewer_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablebutton_Internalname ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV74Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPathmodelos_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV75Pgmdesc ;
   private String AV59Station ;
   private String AV20EmprNom ;
   private String AV62UsurCod ;
   private String tblTableformmain_Internalname ;
   private String AV32Lit0 ;
   private String AV52LitFe ;
   private String AV43Lit2 ;
   private String AV46Lit4 ;
   private String AV47Lit5 ;
   private String AV48Lit6 ;
   private String AV49Lit7 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnuseraction1_Internalname ;
   private String Dvelop_confirmpanel_btnuseraction1_Internalname ;
   private String Treeview_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tablepanel_Autowidth ;
   private boolean Dvpanel_tablepanel_Autoheight ;
   private boolean Dvpanel_tablepanel_Collapsible ;
   private boolean Dvpanel_tablepanel_Collapsed ;
   private boolean Dvpanel_tablepanel_Showcollapseicon ;
   private boolean Dvpanel_tablepanel_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV54pathModelos ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablepanel ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnuseraction1 ;
   private com.genexus.webpanels.GXUserControl ucTreeview ;
   private com.genexus.util.GXDirectory AV69directory ;
   private app.SdtTreeNodeCollection_TreeNode AV66treeNode ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.util.GXFile AV68auxFile ;
   private com.genexus.util.GXFileCollection AV76GXV1 ;
   private GXBaseCollection<app.SdtTreeNodeCollection_TreeNode> AV64treeNodeCollectionData ;
   private app.SdtTreeNodeCollection_TreeNode AV65selectedTreeNode ;
   private app.SdtTreeNodeCollection_TreeNode AV67parent ;
}

