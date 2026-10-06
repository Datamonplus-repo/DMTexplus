package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwpwdgrl_impl extends GXDataArea
{
   public webwpwdgrl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwpwdgrl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwpwdgrl_impl.class ));
   }

   public webwpwdgrl_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "PwdBo") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "PwdBo") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "PwdBo") ;
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
            AV32PwdBo = GXutil.strtobool( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32PwdBo", AV32PwdBo);
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
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
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
      paGX2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startGX2( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwpwdgrl", new String[] {GXutil.URLEncode(GXutil.booltostr(AV32PwdBo))}, new String[] {"PwdBo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURPWD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17UsurPwd1), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERIFICADOCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41VerificadoContexto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31msg0, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURPWD1", GXutil.ltrim( localUtil.ntoc( AV17UsurPwd1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURPWD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17UsurPwd1), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERIFICADOCONTEXTO", AV41VerificadoContexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERIFICADOCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41VerificadoContexto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTENTOS", GXutil.ltrim( localUtil.ntoc( AV7intentos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vPWDBO", AV32PwdBo);
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG0", GXutil.rtrim( AV31msg0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31msg0, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Width", GXutil.rtrim( Dvpanel_tablecontent_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Autowidth", GXutil.booltostr( Dvpanel_tablecontent_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Autoheight", GXutil.booltostr( Dvpanel_tablecontent_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Cls", GXutil.rtrim( Dvpanel_tablecontent_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Title", GXutil.rtrim( Dvpanel_tablecontent_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Collapsible", GXutil.booltostr( Dvpanel_tablecontent_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Collapsed", GXutil.booltostr( Dvpanel_tablecontent_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Showcollapseicon", GXutil.booltostr( Dvpanel_tablecontent_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Iconposition", GXutil.rtrim( Dvpanel_tablecontent_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Autoscroll", GXutil.booltostr( Dvpanel_tablecontent_Autoscroll));
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
         weGX2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtGX2( ) ;
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
      return formatLink("app.webwpwdgrl", new String[] {GXutil.URLEncode(GXutil.booltostr(AV32PwdBo))}, new String[] {"PwdBo"})  ;
   }

   public String getPgmname( )
   {
      return "WebWPwdGrl" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Password", "") ;
   }

   public void wbGX0( )
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablecontent.setProperty("Width", Dvpanel_tablecontent_Width);
         ucDvpanel_tablecontent.setProperty("AutoWidth", Dvpanel_tablecontent_Autowidth);
         ucDvpanel_tablecontent.setProperty("AutoHeight", Dvpanel_tablecontent_Autoheight);
         ucDvpanel_tablecontent.setProperty("Cls", Dvpanel_tablecontent_Cls);
         ucDvpanel_tablecontent.setProperty("Title", Dvpanel_tablecontent_Title);
         ucDvpanel_tablecontent.setProperty("Collapsible", Dvpanel_tablecontent_Collapsible);
         ucDvpanel_tablecontent.setProperty("Collapsed", Dvpanel_tablecontent_Collapsed);
         ucDvpanel_tablecontent.setProperty("ShowCollapseIcon", Dvpanel_tablecontent_Showcollapseicon);
         ucDvpanel_tablecontent.setProperty("IconPosition", Dvpanel_tablecontent_Iconposition);
         ucDvpanel_tablecontent.setProperty("AutoScroll", Dvpanel_tablecontent_Autoscroll);
         ucDvpanel_tablecontent.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablecontent_Internalname, "DVPANEL_TABLECONTENTContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLECONTENTContainer"+"TableContent"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUsurpwd_Internalname, httpContext.getMessage( "Valor del Contador", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUsurpwd_Internalname, GXutil.ltrim( localUtil.ntoc( AV16UsurPwd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavUsurpwd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV16UsurPwd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV16UsurPwd), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsurpwd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUsurpwd_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "right", false, "", "HLP_WebWPwdGrl.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", divUnnamedtable1_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWPwdGrl.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
      }
      wbLoad = true ;
   }

   public void startGX2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Password", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupGX0( ) ;
   }

   public void wsGX2( )
   {
      startGX2( ) ;
      evtGX2( ) ;
   }

   public void evtGX2( )
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
                           e11GX2 ();
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
                                 e12GX2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e13GX2 ();
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

   public void weGX2( )
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

   public void paGX2( )
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
            GX_FocusControl = edtavUsurpwd_Internalname ;
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
      rfGX2( ) ;
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

   public void rfGX2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13GX2 ();
         wbGX0( ) ;
      }
   }

   public void send_integrity_lvl_hashesGX2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURPWD1", GXutil.ltrim( localUtil.ntoc( AV17UsurPwd1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURPWD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17UsurPwd1), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERIFICADOCONTEXTO", AV41VerificadoContexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERIFICADOCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41VerificadoContexto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG0", GXutil.rtrim( AV31msg0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31msg0, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupGX0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11GX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_tablecontent_Width = httpContext.cgiGet( "DVPANEL_TABLECONTENT_Width") ;
         Dvpanel_tablecontent_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Autowidth")) ;
         Dvpanel_tablecontent_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Autoheight")) ;
         Dvpanel_tablecontent_Cls = httpContext.cgiGet( "DVPANEL_TABLECONTENT_Cls") ;
         Dvpanel_tablecontent_Title = httpContext.cgiGet( "DVPANEL_TABLECONTENT_Title") ;
         Dvpanel_tablecontent_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Collapsible")) ;
         Dvpanel_tablecontent_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Collapsed")) ;
         Dvpanel_tablecontent_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Showcollapseicon")) ;
         Dvpanel_tablecontent_Iconposition = httpContext.cgiGet( "DVPANEL_TABLECONTENT_Iconposition") ;
         Dvpanel_tablecontent_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Autoscroll")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUsurpwd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUsurpwd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUSURPWD");
            GX_FocusControl = edtavUsurpwd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16UsurPwd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16UsurPwd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16UsurPwd), 8, 0));
         }
         else
         {
            AV16UsurPwd = (int)(localUtil.ctol( httpContext.cgiGet( edtavUsurpwd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16UsurPwd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16UsurPwd), 8, 0));
         }
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
      e11GX2 ();
      if (returnInSub) return;
   }

   public void e11GX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV5Contexto = "ValidarWebWPwdGrl" ;
      AV41VerificadoContexto = AV5Contexto + "_Verificado" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41VerificadoContexto", AV41VerificadoContexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERIFICADOCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41VerificadoContexto, ""))));
      AV19WebSession.remove(AV41VerificadoContexto);
      AV42ValorContexto = AV19WebSession.getValue(AV5Contexto) ;
      AV17UsurPwd1 = (int)(GXutil.lval( AV42ValorContexto)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurPwd1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17UsurPwd1), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURPWD1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17UsurPwd1), "ZZZZZZZ9")));
      if ( (0==AV17UsurPwd1) )
      {
         httpContext.setWebReturnParms(new Object[] {Boolean.valueOf(AV32PwdBo)});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV32PwdBo"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV31msg0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG160_", ""), (byte)(99), GXv_char2) ;
      webwpwdgrl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31msg0", AV31msg0);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31msg0, ""))));
      AV7intentos = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7intentos", GXutil.str( AV7intentos, 1, 0));
      AV32PwdBo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32PwdBo", AV32PwdBo);
      GXt_char1 = AV29Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN835_", ""), (byte)(99), GXv_char2) ;
      webwpwdgrl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit0 = GXt_char1 ;
      GXt_char1 = AV30Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN836_", ""), (byte)(99), GXv_char2) ;
      webwpwdgrl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit2 = GXt_char1 ;
      Form.setCaption( AV29Lit0 );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      GXt_char1 = AV45Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwpwdgrl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV45Station = GXt_char1 ;
      GXv_char2[0] = AV46Emprcod ;
      GXv_char3[0] = AV47Emprnom ;
      GXv_char4[0] = AV48Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV45Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwpwdgrl_impl.this.AV46Emprcod = GXv_char2[0] ;
      webwpwdgrl_impl.this.AV47Emprnom = GXv_char3[0] ;
      webwpwdgrl_impl.this.AV48Usurcod = GXv_char4[0] ;
      divUnnamedtable1_Height = 50 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Height), 9, 0), true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e12GX2 ();
      if (returnInSub) return;
   }

   public void e12GX2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( ( AV16UsurPwd == AV17UsurPwd1 ) && ( AV17UsurPwd1 != 0 ) )
      {
         AV19WebSession.setValue(AV41VerificadoContexto, "SI");
         AV32PwdBo = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32PwdBo", AV32PwdBo);
         httpContext.setWebReturnParms(new Object[] {Boolean.valueOf(AV32PwdBo)});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV32PwdBo"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         AV16UsurPwd = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16UsurPwd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16UsurPwd), 8, 0));
         if ( AV7intentos == 2 )
         {
            httpContext.setWebReturnParms(new Object[] {Boolean.valueOf(AV32PwdBo)});
            httpContext.setWebReturnParmsMetadata(new Object[] {"AV32PwdBo"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
         AV7intentos = (byte)(AV7intentos+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7intentos", GXutil.str( AV7intentos, 1, 0));
         httpContext.GX_msglist.addItem(AV31msg0);
      }
      if ( false )
      {
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e13GX2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV32PwdBo = ((Boolean) getParm(obj,0)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32PwdBo", AV32PwdBo);
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
      paGX2( ) ;
      wsGX2( ) ;
      weGX2( ) ;
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
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016411931", true, true);
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
      httpContext.AddJavascriptSource("webwpwdgrl.js", "?202661016411931", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavUsurpwd_Internalname = "vUSURPWD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      Dvpanel_tablecontent_Internalname = "DVPANEL_TABLECONTENT" ;
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
      divUnnamedtable1_Height = 0 ;
      edtavUsurpwd_Jsonclick = "" ;
      edtavUsurpwd_Enabled = 1 ;
      Dvpanel_tablecontent_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Iconposition = "Right" ;
      Dvpanel_tablecontent_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Title = "" ;
      Dvpanel_tablecontent_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablecontent_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablecontent_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Entrada Password", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV17UsurPwd1',fld:'vUSURPWD1',pic:'ZZZZZZZ9',hsh:true},{av:'AV41VerificadoContexto',fld:'vVERIFICADOCONTEXTO',pic:'',hsh:true},{av:'AV31msg0',fld:'vMSG0',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e12GX2',iparms:[{av:'AV16UsurPwd',fld:'vUSURPWD',pic:'ZZZZZZZ9'},{av:'AV17UsurPwd1',fld:'vUSURPWD1',pic:'ZZZZZZZ9',hsh:true},{av:'AV41VerificadoContexto',fld:'vVERIFICADOCONTEXTO',pic:'',hsh:true},{av:'AV7intentos',fld:'vINTENTOS',pic:'9'},{av:'AV32PwdBo',fld:'vPWDBO',pic:''},{av:'AV31msg0',fld:'vMSG0',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV32PwdBo',fld:'vPWDBO',pic:''},{av:'AV16UsurPwd',fld:'vUSURPWD',pic:'ZZZZZZZ9'},{av:'AV7intentos',fld:'vINTENTOS',pic:'9'}]}");
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
      AV41VerificadoContexto = "" ;
      AV31msg0 = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablecontent = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV5Contexto = "" ;
      AV19WebSession = httpContext.getWebSession();
      AV42ValorContexto = "" ;
      AV29Lit0 = "" ;
      AV30Lit2 = "" ;
      AV45Station = "" ;
      GXt_char1 = "" ;
      AV46Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV47Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV48Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV7intentos ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV17UsurPwd1 ;
   private int AV16UsurPwd ;
   private int edtavUsurpwd_Enabled ;
   private int divUnnamedtable1_Height ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV31msg0 ;
   private String GXKey ;
   private String Dvpanel_tablecontent_Width ;
   private String Dvpanel_tablecontent_Cls ;
   private String Dvpanel_tablecontent_Title ;
   private String Dvpanel_tablecontent_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tablecontent_Internalname ;
   private String divTablecontent_Internalname ;
   private String edtavUsurpwd_Internalname ;
   private String TempTags ;
   private String edtavUsurpwd_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV29Lit0 ;
   private String AV30Lit2 ;
   private String AV45Station ;
   private String GXt_char1 ;
   private String AV46Emprcod ;
   private String GXv_char2[] ;
   private String AV47Emprnom ;
   private String GXv_char3[] ;
   private String AV48Usurcod ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV32PwdBo ;
   private boolean Dvpanel_tablecontent_Autowidth ;
   private boolean Dvpanel_tablecontent_Autoheight ;
   private boolean Dvpanel_tablecontent_Collapsible ;
   private boolean Dvpanel_tablecontent_Collapsed ;
   private boolean Dvpanel_tablecontent_Showcollapseicon ;
   private boolean Dvpanel_tablecontent_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV41VerificadoContexto ;
   private String AV5Contexto ;
   private String AV42ValorContexto ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablecontent ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV19WebSession ;
}

