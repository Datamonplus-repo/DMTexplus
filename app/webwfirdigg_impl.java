package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwfirdigg_impl extends GXDataArea
{
   public webwfirdigg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwfirdigg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwfirdigg_impl.class ));
   }

   public webwfirdigg_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTablas = new HTMLChoice();
      cmbavOpcion = new HTMLChoice();
      chkavNocont = UIFactory.getCheckbox(this);
      chkavClaveconfirmada = UIFactory.getCheckbox(this);
      chkavConfirmadoprocesamiento = UIFactory.getCheckbox(this);
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
      paGZ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startGZ2( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwfirdigg", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vENESPERA", AV50EnEspera);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACHOR", localUtil.ttoc( AV15FacHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
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
         weGZ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtGZ2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.webwfirdigg", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWFIRDIGg" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FIRMA DIGITAL GUIAS", "") ;
   }

   public void wbGZ0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableTransactionTemplate", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
         ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
         ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
         ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
         ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
         ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
         ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
         ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
         ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
         ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
         ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacfch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacfch_Internalname, edtavFacfch_Caption, "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFacfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacfch_Internalname, localUtil.format(AV14FacFch, "99/99/99"), localUtil.format( AV14FacFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFIRDIGg.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFacfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFacfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWFIRDIGg.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablafechas_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec1_Internalname, edtavFec1_Caption, "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec1_Internalname, localUtil.format(AV16Fec1, "99/99/99"), localUtil.format( AV16Fec1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFIRDIGg.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWFIRDIGg.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec2_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec2_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec2_Internalname, localUtil.format(AV17Fec2, "99/99/99"), localUtil.format( AV17Fec2, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFIRDIGg.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec2_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec2_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWFIRDIGg.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divTablafacturas_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccodi_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccodi_Internalname, edtavFaccodi_Caption, "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccodi_Internalname, GXutil.ltrim( localUtil.ntoc( AV13FacCodi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaccodi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13FacCodi), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13FacCodi), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccodi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccodi_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFIRDIGg.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccodf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccodf_Internalname, httpContext.getMessage( "Numero Factura", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccodf_Internalname, GXutil.ltrim( localUtil.ntoc( AV12FacCodf, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaccodf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12FacCodf), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12FacCodf), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccodf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccodf_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFIRDIGg.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTablas.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTablas.getInternalname(), httpContext.getMessage( "Tablas", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTablas, cmbavTablas.getInternalname(), GXutil.trim( GXutil.str( AV45Tablas, 1, 0)), 1, cmbavTablas.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavTablas.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "", true, (byte)(0), "HLP_WebWFIRDIGg.htm");
         cmbavTablas.setValue( GXutil.trim( GXutil.str( AV45Tablas, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTablas.getInternalname(), "Values", cmbavTablas.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavOpcion.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavOpcion.getInternalname(), httpContext.getMessage( "Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOpcion, cmbavOpcion.getInternalname(), GXutil.trim( GXutil.str( AV42Opcion, 1, 0)), 1, cmbavOpcion.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavOpcion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "", true, (byte)(0), "HLP_WebWFIRDIGg.htm");
         cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV42Opcion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+chkavNocont.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavNocont.getInternalname(), GXutil.str( AV40NoCont, 1, 0), "", "", 1, chkavNocont.getEnabled(), "1", httpContext.getMessage( "Test-Activo contador FIRDIGG?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(60, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", chkavClaveconfirmada.getVisible(), 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+chkavClaveconfirmada.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavClaveconfirmada.getInternalname(), GXutil.booltostr( AV43ClaveConfirmada), "", "", chkavClaveconfirmada.getVisible(), chkavClaveconfirmada.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(64, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,64);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+chkavConfirmadoprocesamiento.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavConfirmadoprocesamiento.getInternalname(), GXutil.booltostr( AV7ConfirmadoProcesamiento), "", "", 1, chkavConfirmadoprocesamiento.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(68, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,68);\"");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablaacciones_Internalname, divTablaacciones_Visible, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWFIRDIGg.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWFIRDIGg.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startGZ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FIRMA DIGITAL GUIAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupGZ0( ) ;
   }

   public void wsGZ2( )
   {
      startGZ2( ) ;
      evtGZ2( ) ;
   }

   public void evtGZ2( )
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
                           e11GZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e12GZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e13GZ2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VCONFIRMADOPROCESAMIENTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14GZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e15GZ2 ();
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
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

   public void weGZ2( )
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

   public void paGZ2( )
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
            GX_FocusControl = edtavFacfch_Internalname ;
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
      if ( cmbavTablas.getItemCount() > 0 )
      {
         AV45Tablas = (byte)(GXutil.lval( cmbavTablas.getValidValue(GXutil.trim( GXutil.str( AV45Tablas, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Tablas", GXutil.str( AV45Tablas, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTablas.setValue( GXutil.trim( GXutil.str( AV45Tablas, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTablas.getInternalname(), "Values", cmbavTablas.ToJavascriptSource(), true);
      }
      if ( cmbavOpcion.getItemCount() > 0 )
      {
         AV42Opcion = (byte)(GXutil.lval( cmbavOpcion.getValidValue(GXutil.trim( GXutil.str( AV42Opcion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Opcion", GXutil.str( AV42Opcion, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV42Opcion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
      }
      AV40NoCont = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV40NoCont, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40NoCont", GXutil.str( AV40NoCont, 1, 0));
      AV43ClaveConfirmada = GXutil.strtobool( GXutil.booltostr( AV43ClaveConfirmada)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ClaveConfirmada", AV43ClaveConfirmada);
      AV7ConfirmadoProcesamiento = GXutil.strtobool( GXutil.booltostr( AV7ConfirmadoProcesamiento)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ConfirmadoProcesamiento", AV7ConfirmadoProcesamiento);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfGZ2( ) ;
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
      AV54Pgmname = "WebWFIRDIGg" ;
      Gx_err = (short)(0) ;
   }

   public void rfGZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12GZ2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00GZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            /* Execute user event: Load */
            e15GZ2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wbGZ0( ) ;
      }
   }

   public void send_integrity_lvl_hashesGZ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV54Pgmname = "WebWFIRDIGg" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupGZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11GZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
         Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
         Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFacfch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFACFCH");
            GX_FocusControl = edtavFacfch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14FacFch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14FacFch", localUtil.format(AV14FacFch, "99/99/99"));
         }
         else
         {
            AV14FacFch = localUtil.ctod( httpContext.cgiGet( edtavFacfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14FacFch", localUtil.format(AV14FacFch, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC1");
            GX_FocusControl = edtavFec1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Fec1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Fec1", localUtil.format(AV16Fec1, "99/99/99"));
         }
         else
         {
            AV16Fec1 = localUtil.ctod( httpContext.cgiGet( edtavFec1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Fec1", localUtil.format(AV16Fec1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec2_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC2");
            GX_FocusControl = edtavFec2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17Fec2 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Fec2", localUtil.format(AV17Fec2, "99/99/99"));
         }
         else
         {
            AV17Fec2 = localUtil.ctod( httpContext.cgiGet( edtavFec2_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Fec2", localUtil.format(AV17Fec2, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACCODI");
            GX_FocusControl = edtavFaccodi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13FacCodi = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13FacCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13FacCodi), 8, 0));
         }
         else
         {
            AV13FacCodi = (int)(localUtil.ctol( httpContext.cgiGet( edtavFaccodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13FacCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13FacCodi), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACCODF");
            GX_FocusControl = edtavFaccodf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12FacCodf = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12FacCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12FacCodf), 8, 0));
         }
         else
         {
            AV12FacCodf = (int)(localUtil.ctol( httpContext.cgiGet( edtavFaccodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12FacCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12FacCodf), 8, 0));
         }
         cmbavTablas.setValue( httpContext.cgiGet( cmbavTablas.getInternalname()) );
         AV45Tablas = (byte)(GXutil.lval( httpContext.cgiGet( cmbavTablas.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Tablas", GXutil.str( AV45Tablas, 1, 0));
         cmbavOpcion.setValue( httpContext.cgiGet( cmbavOpcion.getInternalname()) );
         AV42Opcion = (byte)(GXutil.lval( httpContext.cgiGet( cmbavOpcion.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Opcion", GXutil.str( AV42Opcion, 1, 0));
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavNocont.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavNocont.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNOCONT");
            GX_FocusControl = chkavNocont.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40NoCont = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40NoCont", GXutil.str( AV40NoCont, 1, 0));
         }
         else
         {
            AV40NoCont = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavNocont.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40NoCont", GXutil.str( AV40NoCont, 1, 0));
         }
         AV43ClaveConfirmada = GXutil.strtobool( httpContext.cgiGet( chkavClaveconfirmada.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43ClaveConfirmada", AV43ClaveConfirmada);
         AV7ConfirmadoProcesamiento = GXutil.strtobool( httpContext.cgiGet( chkavConfirmadoprocesamiento.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ConfirmadoProcesamiento", AV7ConfirmadoProcesamiento);
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
      e11GZ2 ();
      if (returnInSub) return;
   }

   public void e11GZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Dvpanel_tableattributes_Title = "" ;
      ucDvpanel_tableattributes.sendProperty(context, "", false, Dvpanel_tableattributes_Internalname, "Title", Dvpanel_tableattributes_Title);
      GXt_char1 = AV44Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwfirdigg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV44Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV46UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV44Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwfirdigg_impl.this.AV10EmprCod = GXv_char2[0] ;
      webwfirdigg_impl.this.AV11EmprNom = GXv_char3[0] ;
      webwfirdigg_impl.this.AV46UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      GXt_char1 = AV19Lit0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char4) ;
      webwfirdigg_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19Lit0 = GXt_char1 ;
      GXt_char1 = AV39LitFe ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char4) ;
      webwfirdigg_impl.this.GXt_char1 = GXv_char4[0] ;
      AV39LitFe = GXt_char1 ;
      GXt_char1 = AV30Lit2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV54Pgmname, (byte)(99), GXv_char4) ;
      webwfirdigg_impl.this.GXt_char1 = GXv_char4[0] ;
      AV30Lit2 = GXt_char1 ;
      AV32Lit3 = httpContext.getMessage( "Fecha Control Firma Digital", "") ;
      AV33Lit4 = httpContext.getMessage( "Periodo a Firmar", "") ;
      AV34Lit5 = httpContext.getMessage( "Guias", "") ;
      edtavFacfch_Caption = AV32Lit3 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacfch_Internalname, "Caption", edtavFacfch_Caption, true);
      edtavFec1_Caption = AV33Lit4 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFec1_Internalname, "Caption", edtavFec1_Caption, true);
      edtavFaccodi_Caption = AV34Lit5 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFaccodi_Internalname, "Caption", edtavFaccodi_Caption, true);
      AV46UsurCod = " " ;
      GXt_char1 = AV44Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwfirdigg_impl.this.GXt_char1 = GXv_char4[0] ;
      AV44Station = GXt_char1 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV46UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV44Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwfirdigg_impl.this.A396EmprCod = GXv_char4[0] ;
      webwfirdigg_impl.this.AV11EmprNom = GXv_char3[0] ;
      webwfirdigg_impl.this.AV46UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV10EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      GXt_int5 = AV8ContVal ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PFIRDG", ""), GXv_int6) ;
      webwfirdigg_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8ContVal = GXt_int5 ;
      if ( ! (0==AV8ContVal) )
      {
         divTablaacciones_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablaacciones_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablaacciones_Visible), 5, 0), true);
         AV43ClaveConfirmada = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43ClaveConfirmada", AV43ClaveConfirmada);
         AV5WebSession.setValue("ValidarWebWPwdGrl", GXutil.str( AV8ContVal, 8, 0));
         /* Window Datatype Object Property */
         AV6Window.setUrl( formatLink("app.webwpwdgrl", new String[] {GXutil.URLEncode(GXutil.booltostr(AV43ClaveConfirmada))}, new String[] {"PwdBo"})  );
         AV6Window.setReturnParms(new Object[] {"AV43ClaveConfirmada",});
         httpContext.newWindow(AV6Window);
      }
      GXt_char1 = AV9ddmmaa ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      webwfirdigg_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9ddmmaa = GXt_char1 ;
      GXt_int7 = AV18Firmdgg ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int8) ;
      webwfirdigg_impl.this.GXt_int7 = GXv_int8[0] ;
      AV18Firmdgg = GXt_int7 ;
      AV14FacFch = localUtil.ctod( AV9ddmmaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FacFch", localUtil.format(AV14FacFch, "99/99/99"));
      AV16Fec1 = localUtil.ymdtod( GXutil.year( GXutil.today( )), 1, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Fec1", localUtil.format(AV16Fec1, "99/99/99"));
      AV17Fec2 = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Fec2", localUtil.format(AV17Fec2, "99/99/99"));
      AV12FacCodf = 99999999 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12FacCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12FacCodf), 8, 0));
      AV15FacHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FacHor", localUtil.ttoc( AV15FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV45Tablas = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Tablas", GXutil.str( AV45Tablas, 1, 0));
      AV42Opcion = (byte)(9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Opcion", GXutil.str( AV42Opcion, 1, 0));
      AV40NoCont = AV18Firmdgg ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40NoCont", GXutil.str( AV40NoCont, 1, 0));
   }

   public void e12GZ2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      AV16Fec1 = localUtil.ymdtod( GXutil.year( GXutil.today( )), 1, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Fec1", localUtil.format(AV16Fec1, "99/99/99"));
      AV17Fec2 = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Fec2", localUtil.format(AV17Fec2, "99/99/99"));
      AV12FacCodf = 99999999 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12FacCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12FacCodf), 8, 0));
      AV15FacHor = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FacHor", localUtil.ttoc( AV15FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e13GZ2 ();
      if (returnInSub) return;
   }

   public void e13GZ2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FacFch)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No hay Fecha Control", ""));
         GX_FocusControl = edtavFacfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16Fec1)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No hay Fecha Inicial", ""));
         GX_FocusControl = edtavFec1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17Fec2)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No hay Fecha Final", ""));
         GX_FocusControl = edtavFec2_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( AV42Opcion == 9 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. La opcion solo puede ser 1 o 2", ""));
         GX_FocusControl = cmbavOpcion.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         Gx_msg = httpContext.getMessage( "Fecha Control Firma Digital >= ", "") + localUtil.dtoc( AV14FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " <br> " ;
         Gx_msg += httpContext.getMessage( "Periodo a Firmar Digitalmente ", "") + localUtil.dtoc( AV16Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.dtoc( AV17Fec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " <br> " ;
         Gx_msg += httpContext.getMessage( "Opcion = ", "") + GXutil.str( AV42Opcion, 1, 0) + " <br> " ;
         Gx_msg += httpContext.getMessage( "Confirma?", "") + " <br> " ;
         AV50EnEspera = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50EnEspera", AV50EnEspera);
         AV7ConfirmadoProcesamiento = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ConfirmadoProcesamiento", AV7ConfirmadoProcesamiento);
         /* Window Datatype Object Property */
         AV6Window.setUrl( formatLink("app.mensajeconfirmar", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_msg)),GXutil.URLEncode(GXutil.booltostr(AV7ConfirmadoProcesamiento))}, new String[] {"Mensaje","Confirmado"})  );
         AV6Window.setReturnParms(new Object[] {"AV7ConfirmadoProcesamiento",});
         httpContext.newWindow(AV6Window);
      }
      /*  Sending Event outputs  */
   }

   public void e14GZ2( )
   {
      /* Confirmadoprocesamiento_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV7ConfirmadoProcesamiento )
      {
         if ( AV50EnEspera )
         {
            GXv_char4[0] = AV10EmprCod ;
            GXv_date9[0] = AV16Fec1 ;
            GXv_date10[0] = AV17Fec2 ;
            GXv_date11[0] = AV14FacFch ;
            GXv_int12[0] = AV13FacCodi ;
            GXv_int13[0] = AV12FacCodf ;
            GXv_dtime14[0] = AV15FacHor ;
            GXv_int8[0] = AV45Tablas ;
            GXv_int15[0] = AV42Opcion ;
            GXv_int16[0] = AV40NoCont ;
            new app.pbarsua(remoteHandle, context).execute( GXv_char4, GXv_date9, GXv_date10, GXv_date11, GXv_int12, GXv_int13, GXv_dtime14, GXv_int8, GXv_int15, GXv_int16) ;
            webwfirdigg_impl.this.AV10EmprCod = GXv_char4[0] ;
            webwfirdigg_impl.this.AV16Fec1 = GXv_date9[0] ;
            webwfirdigg_impl.this.AV17Fec2 = GXv_date10[0] ;
            webwfirdigg_impl.this.AV14FacFch = GXv_date11[0] ;
            webwfirdigg_impl.this.AV13FacCodi = (int)((int)(GXv_int12[0])) ;
            webwfirdigg_impl.this.AV12FacCodf = (int)((int)(GXv_int13[0])) ;
            webwfirdigg_impl.this.AV15FacHor = GXv_dtime14[0] ;
            webwfirdigg_impl.this.AV45Tablas = GXv_int8[0] ;
            webwfirdigg_impl.this.AV42Opcion = GXv_int15[0] ;
            webwfirdigg_impl.this.AV40NoCont = GXv_int16[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV16Fec1", localUtil.format(AV16Fec1, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "AV17Fec2", localUtil.format(AV17Fec2, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "AV14FacFch", localUtil.format(AV14FacFch, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "AV13FacCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13FacCodi), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV12FacCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12FacCodf), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15FacHor", localUtil.ttoc( AV15FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV45Tablas", GXutil.str( AV45Tablas, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV42Opcion", GXutil.str( AV42Opcion, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV40NoCont", GXutil.str( AV40NoCont, 1, 0));
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
         }
         AV7ConfirmadoProcesamiento = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ConfirmadoProcesamiento", AV7ConfirmadoProcesamiento);
         AV50EnEspera = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50EnEspera", AV50EnEspera);
      }
      /*  Sending Event outputs  */
      cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV42Opcion, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
      cmbavTablas.setValue( GXutil.trim( GXutil.str( AV45Tablas, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTablas.getInternalname(), "Values", cmbavTablas.ToJavascriptSource(), true);
   }

   protected void nextLoad( )
   {
   }

   protected void e15GZ2( )
   {
      /* Load Routine */
      returnInSub = false ;
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
      paGZ2( ) ;
      wsGZ2( ) ;
      weGZ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415125943", true, true);
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
      httpContext.AddJavascriptSource("webwfirdigg.js", "?202682415125943", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavFacfch_Internalname = "vFACFCH" ;
      edtavFec1_Internalname = "vFEC1" ;
      edtavFec2_Internalname = "vFEC2" ;
      divTablafechas_Internalname = "TABLAFECHAS" ;
      edtavFaccodi_Internalname = "vFACCODI" ;
      edtavFaccodf_Internalname = "vFACCODF" ;
      cmbavTablas.setInternalname( "vTABLAS" );
      divTablafacturas_Internalname = "TABLAFACTURAS" ;
      cmbavOpcion.setInternalname( "vOPCION" );
      chkavNocont.setInternalname( "vNOCONT" );
      chkavClaveconfirmada.setInternalname( "vCLAVECONFIRMADA" );
      chkavConfirmadoprocesamiento.setInternalname( "vCONFIRMADOPROCESAMIENTO" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      divTablaacciones_Internalname = "TABLAACCIONES" ;
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
      divTablaacciones_Visible = 1 ;
      chkavConfirmadoprocesamiento.setEnabled( 1 );
      chkavClaveconfirmada.setEnabled( 1 );
      chkavClaveconfirmada.setVisible( 1 );
      chkavNocont.setEnabled( 1 );
      cmbavOpcion.setJsonclick( "" );
      cmbavOpcion.setEnabled( 1 );
      cmbavTablas.setJsonclick( "" );
      cmbavTablas.setEnabled( 1 );
      edtavFaccodf_Jsonclick = "" ;
      edtavFaccodf_Enabled = 1 ;
      edtavFaccodi_Jsonclick = "" ;
      edtavFaccodi_Enabled = 1 ;
      edtavFaccodi_Caption = httpContext.getMessage( "Numero Factura", "") ;
      edtavFec2_Jsonclick = "" ;
      edtavFec2_Enabled = 1 ;
      edtavFec1_Jsonclick = "" ;
      edtavFec1_Enabled = 1 ;
      edtavFec1_Caption = httpContext.getMessage( "Fecha Generacion Barcada", "") ;
      edtavFacfch_Jsonclick = "" ;
      edtavFacfch_Enabled = 1 ;
      edtavFacfch_Caption = httpContext.getMessage( "Fecha Factura", "") ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "FIRMA DIGITAL GUIAS", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavTablas.setName( "vTABLAS" );
      cmbavTablas.setWebtags( "" );
      cmbavTablas.addItem("1", httpContext.getMessage( "TABLAS PRODUCCION", ""), (short)(0));
      cmbavTablas.addItem("2", httpContext.getMessage( "TABLAS COMERCIALES", ""), (short)(0));
      if ( cmbavTablas.getItemCount() > 0 )
      {
         AV45Tablas = (byte)(GXutil.lval( cmbavTablas.getValidValue(GXutil.trim( GXutil.str( AV45Tablas, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Tablas", GXutil.str( AV45Tablas, 1, 0));
      }
      cmbavOpcion.setName( "vOPCION" );
      cmbavOpcion.setWebtags( "" );
      cmbavOpcion.addItem("9", "*", (short)(0));
      cmbavOpcion.addItem("1", httpContext.getMessage( "1- NO tengo valor en Fecha-Hora sistema. Calculo HASH en f(Fecha-Hora Salida)", ""), (short)(0));
      cmbavOpcion.addItem("2", httpContext.getMessage( "2- Tengo Fecha-Hora Sistema, Recalculo HASH", ""), (short)(0));
      if ( cmbavOpcion.getItemCount() > 0 )
      {
         AV42Opcion = (byte)(GXutil.lval( cmbavOpcion.getValidValue(GXutil.trim( GXutil.str( AV42Opcion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Opcion", GXutil.str( AV42Opcion, 1, 0));
      }
      chkavNocont.setName( "vNOCONT" );
      chkavNocont.setWebtags( "" );
      chkavNocont.setCaption( httpContext.getMessage( "Test-Activo contador FIRDIGG?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavNocont.getInternalname(), "TitleCaption", chkavNocont.getCaption(), true);
      chkavNocont.setCheckedValue( "0" );
      AV40NoCont = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV40NoCont, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40NoCont", GXutil.str( AV40NoCont, 1, 0));
      chkavClaveconfirmada.setName( "vCLAVECONFIRMADA" );
      chkavClaveconfirmada.setWebtags( "" );
      chkavClaveconfirmada.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavClaveconfirmada.getInternalname(), "TitleCaption", chkavClaveconfirmada.getCaption(), true);
      chkavClaveconfirmada.setCheckedValue( "false" );
      AV43ClaveConfirmada = GXutil.strtobool( GXutil.booltostr( AV43ClaveConfirmada)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ClaveConfirmada", AV43ClaveConfirmada);
      chkavConfirmadoprocesamiento.setName( "vCONFIRMADOPROCESAMIENTO" );
      chkavConfirmadoprocesamiento.setWebtags( "" );
      chkavConfirmadoprocesamiento.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavConfirmadoprocesamiento.getInternalname(), "TitleCaption", chkavConfirmadoprocesamiento.getCaption(), true);
      chkavConfirmadoprocesamiento.setCheckedValue( "false" );
      AV7ConfirmadoProcesamiento = GXutil.strtobool( GXutil.booltostr( AV7ConfirmadoProcesamiento)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ConfirmadoProcesamiento", AV7ConfirmadoProcesamiento);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV40NoCont',fld:'vNOCONT',pic:'9'},{av:'AV43ClaveConfirmada',fld:'vCLAVECONFIRMADA',pic:''},{av:'AV7ConfirmadoProcesamiento',fld:'vCONFIRMADOPROCESAMIENTO',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV16Fec1',fld:'vFEC1',pic:''},{av:'AV17Fec2',fld:'vFEC2',pic:''},{av:'AV12FacCodf',fld:'vFACCODF',pic:'ZZZZZZZ9'},{av:'AV15FacHor',fld:'vFACHOR',pic:'99/99/99 99:99'}]}");
      setEventMetadata("ENTER","{handler:'e13GZ2',iparms:[{av:'AV14FacFch',fld:'vFACFCH',pic:''},{av:'AV16Fec1',fld:'vFEC1',pic:''},{av:'AV17Fec2',fld:'vFEC2',pic:''},{av:'cmbavOpcion'},{av:'AV42Opcion',fld:'vOPCION',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV50EnEspera',fld:'vENESPERA',pic:''},{av:'AV7ConfirmadoProcesamiento',fld:'vCONFIRMADOPROCESAMIENTO',pic:''}]}");
      setEventMetadata("VCONFIRMADOPROCESAMIENTO.CONTROLVALUECHANGED","{handler:'e14GZ2',iparms:[{av:'AV7ConfirmadoProcesamiento',fld:'vCONFIRMADOPROCESAMIENTO',pic:''},{av:'AV50EnEspera',fld:'vENESPERA',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV16Fec1',fld:'vFEC1',pic:''},{av:'AV17Fec2',fld:'vFEC2',pic:''},{av:'AV14FacFch',fld:'vFACFCH',pic:''},{av:'AV13FacCodi',fld:'vFACCODI',pic:'ZZZZZZZ9'},{av:'AV12FacCodf',fld:'vFACCODF',pic:'ZZZZZZZ9'},{av:'AV15FacHor',fld:'vFACHOR',pic:'99/99/99 99:99'},{av:'cmbavTablas'},{av:'AV45Tablas',fld:'vTABLAS',pic:'9'},{av:'cmbavOpcion'},{av:'AV42Opcion',fld:'vOPCION',pic:'9'},{av:'AV40NoCont',fld:'vNOCONT',pic:'9'}]");
      setEventMetadata("VCONFIRMADOPROCESAMIENTO.CONTROLVALUECHANGED",",oparms:[{av:'AV40NoCont',fld:'vNOCONT',pic:'9'},{av:'cmbavOpcion'},{av:'AV42Opcion',fld:'vOPCION',pic:'9'},{av:'cmbavTablas'},{av:'AV45Tablas',fld:'vTABLAS',pic:'9'},{av:'AV15FacHor',fld:'vFACHOR',pic:'99/99/99 99:99'},{av:'AV12FacCodf',fld:'vFACCODF',pic:'ZZZZZZZ9'},{av:'AV13FacCodi',fld:'vFACCODI',pic:'ZZZZZZZ9'},{av:'AV14FacFch',fld:'vFACFCH',pic:''},{av:'AV17Fec2',fld:'vFEC2',pic:''},{av:'AV16Fec1',fld:'vFEC1',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7ConfirmadoProcesamiento',fld:'vCONFIRMADOPROCESAMIENTO',pic:''},{av:'AV50EnEspera',fld:'vENESPERA',pic:''}]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gx_date = GXutil.nullDate() ;
      GXKey = "" ;
      AV10EmprCod = "" ;
      AV15FacHor = GXutil.resetTime( GXutil.nullDate() );
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV14FacFch = GXutil.nullDate() ;
      AV16Fec1 = GXutil.nullDate() ;
      AV17Fec2 = GXutil.nullDate() ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV54Pgmname = "" ;
      scmdbuf = "" ;
      A396EmprCod = "" ;
      H00GZ2_A396EmprCod = new String[] {""} ;
      AV44Station = "" ;
      AV11EmprNom = "" ;
      AV46UsurCod = "" ;
      AV19Lit0 = "" ;
      AV39LitFe = "" ;
      AV30Lit2 = "" ;
      AV32Lit3 = "" ;
      AV33Lit4 = "" ;
      AV34Lit5 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      AV5WebSession = httpContext.getWebSession();
      AV6Window = new com.genexus.webpanels.GXWindow();
      AV9ddmmaa = "" ;
      GXt_char1 = "" ;
      Gx_msg = "" ;
      GXv_char4 = new String[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_int12 = new long[1] ;
      GXv_int13 = new long[1] ;
      GXv_dtime14 = new java.util.Date[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int16 = new byte[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwfirdigg__default(),
         new Object[] {
             new Object[] {
            H00GZ2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV54Pgmname = "WebWFIRDIGg" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV54Pgmname = "WebWFIRDIGg" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV45Tablas ;
   private byte AV42Opcion ;
   private byte AV40NoCont ;
   private byte nDonePA ;
   private byte AV18Firmdgg ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte GXv_int15[] ;
   private byte GXv_int16[] ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavFacfch_Enabled ;
   private int edtavFec1_Enabled ;
   private int edtavFec2_Enabled ;
   private int AV13FacCodi ;
   private int edtavFaccodi_Enabled ;
   private int AV12FacCodf ;
   private int edtavFaccodf_Enabled ;
   private int divTablaacciones_Visible ;
   private int AV8ContVal ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int idxLst ;
   private long GXv_int12[] ;
   private long GXv_int13[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV10EmprCod ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String edtavFacfch_Internalname ;
   private String edtavFacfch_Caption ;
   private String TempTags ;
   private String edtavFacfch_Jsonclick ;
   private String divTablafechas_Internalname ;
   private String edtavFec1_Internalname ;
   private String edtavFec1_Caption ;
   private String edtavFec1_Jsonclick ;
   private String edtavFec2_Internalname ;
   private String edtavFec2_Jsonclick ;
   private String divTablafacturas_Internalname ;
   private String edtavFaccodi_Internalname ;
   private String edtavFaccodi_Caption ;
   private String edtavFaccodi_Jsonclick ;
   private String edtavFaccodf_Internalname ;
   private String edtavFaccodf_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String divTablaacciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV54Pgmname ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV44Station ;
   private String AV11EmprNom ;
   private String AV46UsurCod ;
   private String AV19Lit0 ;
   private String AV39LitFe ;
   private String AV30Lit2 ;
   private String AV32Lit3 ;
   private String AV33Lit4 ;
   private String AV34Lit5 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV9ddmmaa ;
   private String GXt_char1 ;
   private String Gx_msg ;
   private String GXv_char4[] ;
   private java.util.Date AV15FacHor ;
   private java.util.Date GXv_dtime14[] ;
   private java.util.Date Gx_date ;
   private java.util.Date AV14FacFch ;
   private java.util.Date AV16Fec1 ;
   private java.util.Date AV17Fec2 ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date GXv_date11[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV50EnEspera ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV43ClaveConfirmada ;
   private boolean AV7ConfirmadoProcesamiento ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWindow AV6Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private HTMLChoice cmbavTablas ;
   private HTMLChoice cmbavOpcion ;
   private ICheckbox chkavNocont ;
   private ICheckbox chkavClaveconfirmada ;
   private ICheckbox chkavConfirmadoprocesamiento ;
   private IDataStoreProvider pr_default ;
   private String[] H00GZ2_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV5WebSession ;
}

final  class webwfirdigg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00GZ2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
      }
   }

}

