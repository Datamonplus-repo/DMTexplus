package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwcctclibackup_impl extends GXDataArea
{
   public wwcctclibackup_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwcctclibackup_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwcctclibackup_impl.class ));
   }

   public wwcctclibackup_impl( int remoteHandle ,
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
      chkavOpcion = UIFactory.getCheckbox(this);
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
      pa1WI2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WI2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wwcctclibackup", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WWCCTCliBackup");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV32Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\wwcctclibackup:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV19EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINIF", GXutil.rtrim( A278CliNif));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
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
         we1WI2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WI2( ) ;
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
      return formatLink("app.controlcalidadhtd.wwcctclibackup", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.WWCCTCliBackup" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "C.C Tipo por Cli./Serie/Color", "") ;
   }

   public void wb1WI0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCliini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCliini_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCliini_Internalname, GXutil.ltrim( localUtil.ntoc( AV13CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCliini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13CliIni), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13CliIni), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCliini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCliini_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblPrompt1_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fa-1x\"></i>", ""), "", "", lblPrompt1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOPROMPT1\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Buscar el codigo del cliente", ""), 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCliininom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCliininom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCliininom_Internalname, GXutil.rtrim( AV14CliIniNom), GXutil.rtrim( localUtil.format( AV14CliIniNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCliininom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCliininom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClifin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClifin_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClifin_Internalname, GXutil.ltrim( localUtil.ntoc( AV11CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClifin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11CliFin), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11CliFin), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClifin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClifin_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableprompt2_Internalname, 1, 0, "px", 0, "px", "Prompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblPrompt2_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fa-1x\"></i>", ""), "", "", lblPrompt2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOPROMPT2\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Buscar el codigo del cliente", ""), 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClifinnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClifinnom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClifinnom_Internalname, GXutil.rtrim( AV12CliFinNom), GXutil.rtrim( localUtil.format( AV12CliFinNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClifinnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClifinnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablearticle_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtini_Internalname, httpContext.getMessage( "Articulo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtini_Internalname, GXutil.rtrim( AV6ArtIni), GXutil.rtrim( localUtil.format( AV6ArtIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtini_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtfin_Internalname, httpContext.getMessage( "Artículo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtfin_Internalname, GXutil.rtrim( AV5ArtFin), GXutil.rtrim( localUtil.format( AV5ArtFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtfin_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablenumerocor_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColnomini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColnomini_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColnomini_Internalname, GXutil.rtrim( AV16ColNomIni), GXutil.rtrim( localUtil.format( AV16ColNomIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColnomini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColnomini_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColnumini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColnumini_Internalname, httpContext.getMessage( "Número del Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColnumini_Internalname, GXutil.ltrim( localUtil.ntoc( AV18ColNumIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavColnumini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18ColNumIni), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18ColNumIni), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColnumini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColnumini_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColnomfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColnomfin_Internalname, httpContext.getMessage( "Nombre del Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColnomfin_Internalname, GXutil.rtrim( AV15ColNomFin), GXutil.rtrim( localUtil.format( AV15ColNomFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColnomfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColnomfin_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColnumfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColnumfin_Internalname, httpContext.getMessage( "Número del Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColnumfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV17ColNumFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavColnumfin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17ColNumFin), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17ColNumFin), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColnumfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColnumfin_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecc_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctini_Internalname, httpContext.getMessage( "C.C", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctini_Internalname, GXutil.ltrim( localUtil.ntoc( AV9CCTIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCctini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9CCTIni), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9CCTIni), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctini_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactionpromtp_Internalname, 1, 0, "px", 0, "px", "Prompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblUseraction2_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fa-1x\"></i>", ""), "", "", lblUseraction2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION2\\'."+"'", "", "TextBlock", 5, "", 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctinidsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctinidsc_Internalname, httpContext.getMessage( "Descripción", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctinidsc_Internalname, GXutil.rtrim( AV10CCTIniDsc), GXutil.rtrim( localUtil.format( AV10CCTIniDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctinidsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctinidsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavOpcion.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavOpcion.getInternalname(), httpContext.getMessage( "Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavOpcion.getInternalname(), AV26Opcion, "", httpContext.getMessage( "Opcion", ""), 1, chkavOpcion.getEnabled(), "R", httpContext.getMessage( "Resumen por Cliente", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(100, this, 'R', 'X',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,100);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCli_txt_Internalname, lblCli_txt_Caption, "", "", lblCli_txt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "", httpContext.getMessage( "Imprimir", ""), bttBtnuseraction1_Jsonclick, 5, httpContext.getMessage( "Clique aca para imprimit", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV32Pgmname), GXutil.rtrim( localUtil.format( AV32Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCTCliBackup.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1WI2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "C.C Tipo por Cli./Serie/Color", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WI0( ) ;
   }

   public void ws1WI2( )
   {
      start1WI2( ) ;
      evt1WI2( ) ;
   }

   public void evt1WI2( )
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
                           e111WI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction2' */
                           e121WI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPROMPT2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Doprompt2' */
                           e131WI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPROMPT1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Doprompt1' */
                           e141WI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLIINI.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151WI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLIFIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161WI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171WI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e181WI2 ();
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

   public void we1WI2( )
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

   public void pa1WI2( )
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
            GX_FocusControl = edtavCliini_Internalname ;
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
      AV26Opcion = ((GXutil.strcmp(GXutil.rtrim( AV26Opcion), "R")==0) ? "R" : "X") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Opcion", AV26Opcion);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1WI2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV32Pgmname = "ControlCalidadHTD.WWCCTCliBackup" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171WI2 ();
         wb1WI0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1WI2( )
   {
   }

   public void before_start_formulas( )
   {
      AV32Pgmname = "ControlCalidadHTD.WWCCTCliBackup" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111WI2 ();
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIINI");
            GX_FocusControl = edtavCliini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13CliIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CliIni), 6, 0));
         }
         else
         {
            AV13CliIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CliIni), 6, 0));
         }
         AV14CliIniNom = httpContext.cgiGet( edtavCliininom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14CliIniNom", AV14CliIniNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIFIN");
            GX_FocusControl = edtavClifin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11CliFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliFin), 6, 0));
         }
         else
         {
            AV11CliFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliFin), 6, 0));
         }
         AV12CliFinNom = httpContext.cgiGet( edtavClifinnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12CliFinNom", AV12CliFinNom);
         AV6ArtIni = httpContext.cgiGet( edtavArtini_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6ArtIni", AV6ArtIni);
         AV5ArtFin = httpContext.cgiGet( edtavArtfin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5ArtFin", AV5ArtFin);
         AV16ColNomIni = httpContext.cgiGet( edtavColnomini_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16ColNomIni", AV16ColNomIni);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColnumini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColnumini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLNUMINI");
            GX_FocusControl = edtavColnumini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18ColNumIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ColNumIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ColNumIni), 6, 0));
         }
         else
         {
            AV18ColNumIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavColnumini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ColNumIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ColNumIni), 6, 0));
         }
         AV15ColNomFin = httpContext.cgiGet( edtavColnomfin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15ColNomFin", AV15ColNomFin);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColnumfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColnumfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLNUMFIN");
            GX_FocusControl = edtavColnumfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17ColNumFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ColNumFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ColNumFin), 6, 0));
         }
         else
         {
            AV17ColNumFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavColnumfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ColNumFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ColNumFin), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTINI");
            GX_FocusControl = edtavCctini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9CCTIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CCTIni), 6, 0));
         }
         else
         {
            AV9CCTIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CCTIni), 6, 0));
         }
         AV10CCTIniDsc = httpContext.cgiGet( edtavCctinidsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10CCTIniDsc", AV10CCTIniDsc);
         AV26Opcion = ((GXutil.strcmp(httpContext.cgiGet( chkavOpcion.getInternalname()), "R")==0) ? "R" : "X") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Opcion", AV26Opcion);
         AV32Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WWCCTCliBackup");
         AV32Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV32Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlcalidadhtd\\wwcctclibackup:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
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
      e111WI2 ();
      if (returnInSub) return;
   }

   public void e111WI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      wwcctclibackup_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit2 = GXt_char1 ;
      GXt_char1 = Gx_msg ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char2) ;
      wwcctclibackup_impl.this.GXt_char1 = GXv_char2[0] ;
      Gx_msg = GXt_char1 ;
      lblCli_txt_Caption = Gx_msg ;
      httpContext.ajax_rsp_assign_prop("", false, lblCli_txt_Internalname, "Caption", lblCli_txt_Caption, true);
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wwcctclibackup_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      GXv_char2[0] = AV19EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV25UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      wwcctclibackup_impl.this.AV19EmprCod = GXv_char2[0] ;
      wwcctclibackup_impl.this.AV20EmprNom = GXv_char3[0] ;
      wwcctclibackup_impl.this.AV25UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      GXt_char1 = AV23LitFe ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
      wwcctclibackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23LitFe = GXt_char1 ;
      GXt_char1 = AV21Lit0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char4) ;
      wwcctclibackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21Lit0 = GXt_char1 ;
      GXt_char1 = AV24Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wwcctclibackup_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Station = GXt_char1 ;
      GXv_char4[0] = AV19EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char2[0] = AV25UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char3, GXv_char2) ;
      wwcctclibackup_impl.this.AV19EmprCod = GXv_char4[0] ;
      wwcctclibackup_impl.this.AV20EmprNom = GXv_char3[0] ;
      wwcctclibackup_impl.this.AV25UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
   }

   public void e181WI2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      if ( (0==AV9CCTIni) )
      {
         httpContext.popup(formatLink("app.controlcalidadhtd.arcctcli", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13CliIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11CliFin,6,0)),GXutil.URLEncode(GXutil.rtrim(AV6ArtIni)),GXutil.URLEncode(GXutil.rtrim(AV5ArtFin)),GXutil.URLEncode(GXutil.rtrim(AV16ColNomIni)),GXutil.URLEncode(GXutil.rtrim(AV15ColNomFin)),GXutil.URLEncode(GXutil.ltrimstr(AV18ColNumIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17ColNumFin,6,0))}, new String[] {"EmprCod","CliIni","CliFin","ArtIni","ArtFin","ColNomIni","ColNomFin","ColNumIni","ColNumFin"}) , new Object[] {"AV19EmprCod","AV13CliIni","AV11CliFin","AV6ArtIni","AV5ArtFin","AV16ColNomIni","AV15ColNomFin","AV18ColNumIni","AV17ColNumFin"});
      }
      else
      {
         httpContext.popup(formatLink("app.controlcalidadhtd.arcctcli2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13CliIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11CliFin,6,0)),GXutil.URLEncode(GXutil.rtrim(AV6ArtIni)),GXutil.URLEncode(GXutil.rtrim(AV5ArtFin)),GXutil.URLEncode(GXutil.rtrim(AV16ColNomIni)),GXutil.URLEncode(GXutil.rtrim(AV15ColNomFin)),GXutil.URLEncode(GXutil.ltrimstr(AV18ColNumIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17ColNumFin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9CCTIni,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10CCTIniDsc)),GXutil.URLEncode(GXutil.rtrim(AV26Opcion))}, new String[] {"EmprCod","CliIni","CliFin","ArtIni","ArtFin","ColNomIni","ColNomFin","ColNumIni","ColNumFin","CCtcodi","Cctdsc","Op"}) , new Object[] {"AV19EmprCod","AV13CliIni","AV11CliFin","AV6ArtIni","AV5ArtFin","AV16ColNomIni","AV15ColNomFin","AV18ColNumIni","AV17ColNumFin","AV9CCTIni","AV10CCTIniDsc","AV26Opcion"});
      }
      /*  Sending Event outputs  */
   }

   public void e121WI2( )
   {
      /* 'DoUserAction2' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.controlcalidadhtd.tccdefprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9CCTIni,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10CCTIniDsc))}, new String[] {"InOutEmprCod","InOutCCTCod","InOutCCTDsc"}) , new Object[] {"AV19EmprCod","AV9CCTIni","AV10CCTIniDsc"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e131WI2( )
   {
      /* 'Doprompt2' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tclientprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11CliFin,6,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"InOutEmprCod","InOutCliCod","OutCliNom"}) , new Object[] {"AV19EmprCod","AV11CliFin","AV12CliFinNom"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e141WI2( )
   {
      /* 'Doprompt1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tclientprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13CliIni,6,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"InOutEmprCod","InOutCliCod","OutCliNom"}) , new Object[] {"AV19EmprCod","AV13CliIni","AV14CliIniNom"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e151WI2( )
   {
      /* Cliini_Isvalid Routine */
      returnInSub = false ;
      if ( ! (0==AV13CliIni) )
      {
         AV34GXLvl79 = (byte)(0) ;
         /* Using cursor H01WI2 */
         pr_default.execute(0, new Object[] {AV19EmprCod, Integer.valueOf(AV13CliIni)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = H01WI2_A252CliCod[0] ;
            A396EmprCod = H01WI2_A396EmprCod[0] ;
            A278CliNif = H01WI2_A278CliNif[0] ;
            A279CliNom = H01WI2_A279CliNom[0] ;
            AV34GXLvl79 = (byte)(1) ;
            AV14CliIniNom = A279CliNom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CliIniNom", AV14CliIniNom);
            AV26Opcion = httpContext.getMessage( "R", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Opcion", AV26Opcion);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV34GXLvl79 == 0 )
         {
            AV14CliIniNom = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CliIniNom", AV14CliIniNom);
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso : No existe el cliente.", ""));
         }
      }
      /*  Sending Event outputs  */
   }

   public void e161WI2( )
   {
      /* Clifin_Isvalid Routine */
      returnInSub = false ;
      if ( ! (0==AV11CliFin) )
      {
         AV35GXLvl96 = (byte)(0) ;
         /* Using cursor H01WI3 */
         pr_default.execute(1, new Object[] {AV19EmprCod, Integer.valueOf(AV11CliFin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = H01WI3_A252CliCod[0] ;
            A396EmprCod = H01WI3_A396EmprCod[0] ;
            A278CliNif = H01WI3_A278CliNif[0] ;
            A279CliNom = H01WI3_A279CliNom[0] ;
            AV35GXLvl96 = (byte)(1) ;
            AV12CliFinNom = A279CliNom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CliFinNom", AV12CliFinNom);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV35GXLvl96 == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso : No existe el cliente.", ""));
         }
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e171WI2( )
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
      pa1WI2( ) ;
      ws1WI2( ) ;
      we1WI2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016441545", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/wwcctclibackup.js", "?202661016441546", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavCliini_Internalname = "vCLIINI" ;
      lblPrompt1_Internalname = "PROMPT1" ;
      divTableprompt1_Internalname = "TABLEPROMPT1" ;
      edtavCliininom_Internalname = "vCLIININOM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavClifin_Internalname = "vCLIFIN" ;
      lblPrompt2_Internalname = "PROMPT2" ;
      divTableprompt2_Internalname = "TABLEPROMPT2" ;
      edtavClifinnom_Internalname = "vCLIFINNOM" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavArtini_Internalname = "vARTINI" ;
      edtavArtfin_Internalname = "vARTFIN" ;
      divTablearticle_Internalname = "TABLEARTICLE" ;
      edtavColnomini_Internalname = "vCOLNOMINI" ;
      edtavColnumini_Internalname = "vCOLNUMINI" ;
      edtavColnomfin_Internalname = "vCOLNOMFIN" ;
      edtavColnumfin_Internalname = "vCOLNUMFIN" ;
      divTablenumerocor_Internalname = "TABLENUMEROCOR" ;
      edtavCctini_Internalname = "vCCTINI" ;
      lblUseraction2_Internalname = "USERACTION2" ;
      divTableactionpromtp_Internalname = "TABLEACTIONPROMTP" ;
      edtavCctinidsc_Internalname = "vCCTINIDSC" ;
      chkavOpcion.setInternalname( "vOPCION" );
      divTablecc_Internalname = "TABLECC" ;
      lblCli_txt_Internalname = "CLI_TXT" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      Dvpanel_tablecontent_Internalname = "DVPANEL_TABLECONTENT" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblCli_txt_Caption = "." ;
      chkavOpcion.setEnabled( 1 );
      edtavCctinidsc_Jsonclick = "" ;
      edtavCctinidsc_Enabled = 1 ;
      edtavCctini_Jsonclick = "" ;
      edtavCctini_Enabled = 1 ;
      edtavColnumfin_Jsonclick = "" ;
      edtavColnumfin_Enabled = 1 ;
      edtavColnomfin_Jsonclick = "" ;
      edtavColnomfin_Enabled = 1 ;
      edtavColnumini_Jsonclick = "" ;
      edtavColnumini_Enabled = 1 ;
      edtavColnomini_Jsonclick = "" ;
      edtavColnomini_Enabled = 1 ;
      edtavArtfin_Jsonclick = "" ;
      edtavArtfin_Enabled = 1 ;
      edtavArtini_Jsonclick = "" ;
      edtavArtini_Enabled = 1 ;
      edtavClifinnom_Jsonclick = "" ;
      edtavClifinnom_Enabled = 1 ;
      edtavClifin_Jsonclick = "" ;
      edtavClifin_Enabled = 1 ;
      edtavCliininom_Jsonclick = "" ;
      edtavCliininom_Enabled = 1 ;
      edtavCliini_Jsonclick = "" ;
      edtavCliini_Enabled = 1 ;
      Dvpanel_tablecontent_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Iconposition = "Right" ;
      Dvpanel_tablecontent_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablecontent_Title = httpContext.getMessage( "C.C Tipo por Cli./Serie/Color", "") ;
      Dvpanel_tablecontent_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablecontent_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablecontent_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "C.C Tipo por Cli./Serie/Color", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavOpcion.setName( "vOPCION" );
      chkavOpcion.setWebtags( "" );
      chkavOpcion.setCaption( httpContext.getMessage( "Resumen por Cliente", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavOpcion.getInternalname(), "TitleCaption", chkavOpcion.getCaption(), true);
      chkavOpcion.setCheckedValue( "X" );
      AV26Opcion = ((GXutil.strcmp(GXutil.rtrim( AV26Opcion), "R")==0) ? "R" : "X") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Opcion", AV26Opcion);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV26Opcion',fld:'vOPCION',pic:''},{av:'AV32Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e181WI2',iparms:[{av:'AV9CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV6ArtIni',fld:'vARTINI',pic:''},{av:'AV5ArtFin',fld:'vARTFIN',pic:''},{av:'AV16ColNomIni',fld:'vCOLNOMINI',pic:''},{av:'AV15ColNomFin',fld:'vCOLNOMFIN',pic:''},{av:'AV18ColNumIni',fld:'vCOLNUMINI',pic:'ZZZZZ9'},{av:'AV17ColNumFin',fld:'vCOLNUMFIN',pic:'ZZZZZ9'},{av:'AV10CCTIniDsc',fld:'vCCTINIDSC',pic:''},{av:'AV26Opcion',fld:'vOPCION',pic:''}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV26Opcion',fld:'vOPCION',pic:''},{av:'AV10CCTIniDsc',fld:'vCCTINIDSC',pic:''},{av:'AV9CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV17ColNumFin',fld:'vCOLNUMFIN',pic:'ZZZZZ9'},{av:'AV18ColNumIni',fld:'vCOLNUMINI',pic:'ZZZZZ9'},{av:'AV15ColNomFin',fld:'vCOLNOMFIN',pic:''},{av:'AV16ColNomIni',fld:'vCOLNOMINI',pic:''},{av:'AV5ArtFin',fld:'vARTFIN',pic:''},{av:'AV6ArtIni',fld:'vARTINI',pic:''},{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV13CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOUSERACTION2'","{handler:'e121WI2',iparms:[{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV10CCTIniDsc',fld:'vCCTINIDSC',pic:''}]");
      setEventMetadata("'DOUSERACTION2'",",oparms:[{av:'AV10CCTIniDsc',fld:'vCCTINIDSC',pic:''},{av:'AV9CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOPROMPT2'","{handler:'e131WI2',iparms:[{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOPROMPT2'",",oparms:[{av:'AV12CliFinNom',fld:'vCLIFINNOM',pic:''},{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOPROMPT1'","{handler:'e141WI2',iparms:[{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13CliIni',fld:'vCLIINI',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOPROMPT1'",",oparms:[{av:'AV14CliIniNom',fld:'vCLIININOM',pic:''},{av:'AV13CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VCLIINI.ISVALID","{handler:'e151WI2',iparms:[{av:'AV13CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A278CliNif',fld:'CLINIF',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VCLIINI.ISVALID",",oparms:[{av:'AV14CliIniNom',fld:'vCLIININOM',pic:''},{av:'AV26Opcion',fld:'vOPCION',pic:''}]}");
      setEventMetadata("VCLIFIN.ISVALID","{handler:'e161WI2',iparms:[{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A278CliNif',fld:'CLINIF',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VCLIFIN.ISVALID",",oparms:[{av:'AV12CliFinNom',fld:'vCLIFINNOM',pic:''}]}");
      setEventMetadata("VALIDV_CLIINI","{handler:'validv_Cliini',iparms:[]");
      setEventMetadata("VALIDV_CLIINI",",oparms:[]}");
      setEventMetadata("VALIDV_CLIFIN","{handler:'validv_Clifin',iparms:[]");
      setEventMetadata("VALIDV_CLIFIN",",oparms:[]}");
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
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV32Pgmname = "" ;
      AV19EmprCod = "" ;
      A396EmprCod = "" ;
      A278CliNif = "" ;
      A279CliNom = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablecontent = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblPrompt1_Jsonclick = "" ;
      AV14CliIniNom = "" ;
      lblPrompt2_Jsonclick = "" ;
      AV12CliFinNom = "" ;
      AV6ArtIni = "" ;
      AV5ArtFin = "" ;
      AV16ColNomIni = "" ;
      AV15ColNomFin = "" ;
      lblUseraction2_Jsonclick = "" ;
      AV10CCTIniDsc = "" ;
      AV26Opcion = "" ;
      lblCli_txt_Jsonclick = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV22Lit2 = "" ;
      Gx_msg = "" ;
      AV24Station = "" ;
      AV20EmprNom = "" ;
      AV25UsurCod = "" ;
      AV23LitFe = "" ;
      AV21Lit0 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      H01WI2_A252CliCod = new int[1] ;
      H01WI2_A396EmprCod = new String[] {""} ;
      H01WI2_A278CliNif = new String[] {""} ;
      H01WI2_A279CliNom = new String[] {""} ;
      H01WI3_A252CliCod = new int[1] ;
      H01WI3_A396EmprCod = new String[] {""} ;
      H01WI3_A278CliNif = new String[] {""} ;
      H01WI3_A279CliNom = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wwcctclibackup__default(),
         new Object[] {
             new Object[] {
            H01WI2_A252CliCod, H01WI2_A396EmprCod, H01WI2_A278CliNif, H01WI2_A279CliNom
            }
            , new Object[] {
            H01WI3_A252CliCod, H01WI3_A396EmprCod, H01WI3_A278CliNif, H01WI3_A279CliNom
            }
         }
      );
      AV32Pgmname = "ControlCalidadHTD.WWCCTCliBackup" ;
      /* GeneXus formulas. */
      AV32Pgmname = "ControlCalidadHTD.WWCCTCliBackup" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV34GXLvl79 ;
   private byte AV35GXLvl96 ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV13CliIni ;
   private int edtavCliini_Enabled ;
   private int edtavCliininom_Enabled ;
   private int AV11CliFin ;
   private int edtavClifin_Enabled ;
   private int edtavClifinnom_Enabled ;
   private int edtavArtini_Enabled ;
   private int edtavArtfin_Enabled ;
   private int edtavColnomini_Enabled ;
   private int AV18ColNumIni ;
   private int edtavColnumini_Enabled ;
   private int edtavColnomfin_Enabled ;
   private int AV17ColNumFin ;
   private int edtavColnumfin_Enabled ;
   private int AV9CCTIni ;
   private int edtavCctini_Enabled ;
   private int edtavCctinidsc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV32Pgmname ;
   private String AV19EmprCod ;
   private String A396EmprCod ;
   private String A278CliNif ;
   private String A279CliNom ;
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
   private String divUnnamedtable1_Internalname ;
   private String edtavCliini_Internalname ;
   private String TempTags ;
   private String edtavCliini_Jsonclick ;
   private String divTableprompt1_Internalname ;
   private String lblPrompt1_Internalname ;
   private String lblPrompt1_Jsonclick ;
   private String edtavCliininom_Internalname ;
   private String AV14CliIniNom ;
   private String edtavCliininom_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavClifin_Internalname ;
   private String edtavClifin_Jsonclick ;
   private String divTableprompt2_Internalname ;
   private String lblPrompt2_Internalname ;
   private String lblPrompt2_Jsonclick ;
   private String edtavClifinnom_Internalname ;
   private String AV12CliFinNom ;
   private String edtavClifinnom_Jsonclick ;
   private String divTablearticle_Internalname ;
   private String edtavArtini_Internalname ;
   private String AV6ArtIni ;
   private String edtavArtini_Jsonclick ;
   private String edtavArtfin_Internalname ;
   private String AV5ArtFin ;
   private String edtavArtfin_Jsonclick ;
   private String divTablenumerocor_Internalname ;
   private String edtavColnomini_Internalname ;
   private String AV16ColNomIni ;
   private String edtavColnomini_Jsonclick ;
   private String edtavColnumini_Internalname ;
   private String edtavColnumini_Jsonclick ;
   private String edtavColnomfin_Internalname ;
   private String AV15ColNomFin ;
   private String edtavColnomfin_Jsonclick ;
   private String edtavColnumfin_Internalname ;
   private String edtavColnumfin_Jsonclick ;
   private String divTablecc_Internalname ;
   private String edtavCctini_Internalname ;
   private String edtavCctini_Jsonclick ;
   private String divTableactionpromtp_Internalname ;
   private String lblUseraction2_Internalname ;
   private String lblUseraction2_Jsonclick ;
   private String edtavCctinidsc_Internalname ;
   private String AV10CCTIniDsc ;
   private String edtavCctinidsc_Jsonclick ;
   private String AV26Opcion ;
   private String lblCli_txt_Internalname ;
   private String lblCli_txt_Caption ;
   private String lblCli_txt_Jsonclick ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV22Lit2 ;
   private String Gx_msg ;
   private String AV24Station ;
   private String AV20EmprNom ;
   private String AV25UsurCod ;
   private String AV23LitFe ;
   private String AV21Lit0 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablecontent ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavOpcion ;
   private IDataStoreProvider pr_default ;
   private int[] H01WI2_A252CliCod ;
   private String[] H01WI2_A396EmprCod ;
   private String[] H01WI2_A278CliNif ;
   private String[] H01WI2_A279CliNom ;
   private int[] H01WI3_A252CliCod ;
   private String[] H01WI3_A396EmprCod ;
   private String[] H01WI3_A278CliNif ;
   private String[] H01WI3_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wwcctclibackup__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WI2", "SELECT CliCod, EmprCod, CliNif, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01WI3", "SELECT CliCod, EmprCod, CliNif, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

