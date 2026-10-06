package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class web_consultarepuestostockminimo_impl extends GXDataArea
{
   public web_consultarepuestostockminimo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public web_consultarepuestostockminimo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( web_consultarepuestostockminimo_impl.class ));
   }

   public web_consultarepuestostockminimo_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vINICIALMRCOD") == 0 )
         {
            A13718MRCNom = httpContext.GetPar( "MRCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvinicialmrcod14R0( A13718MRCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFINALMRCOD") == 0 )
         {
            A13718MRCNom = httpContext.GetPar( "MRCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvfinalmrcod14R0( A13718MRCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vINICIALMRCOD") == 0 )
         {
            A13718MRCNom = httpContext.GetPar( "MRCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvinicialmrcod14R0( A13718MRCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vINICIALMRCOD") == 0 )
         {
            hV5InicialMRCod = httpContext.GetPar( "hV5InicialMRCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvinicialmrcod14R2( hV5InicialMRCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFINALMRCOD") == 0 )
         {
            A13718MRCNom = httpContext.GetPar( "MRCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvfinalmrcod14R0( A13718MRCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vFINALMRCOD") == 0 )
         {
            hV6FinalMRCod = httpContext.GetPar( "hV6FinalMRCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvfinalmrcod14R2( hV6FinalMRCod) ;
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
      pa14R2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start14R2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.web_consultarepuestostockminimo", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvINICIALMRCOD", GXutil.ltrim( localUtil.ntoc( AV5InicialMRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvFINALMRCOD", GXutil.ltrim( localUtil.ntoc( AV6FinalMRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we14R2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt14R2( ) ;
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
      return formatLink("app.web_consultarepuestostockminimo", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Web_ConsultaRepuestoStockMinimo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Repuesto Stock Minimo", "") ;
   }

   public void wb14R0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTablerango_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavInicialmrcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInicialmrcod_Internalname, httpContext.getMessage( "Repuesto Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInicialmrcod_Internalname, hV5InicialMRCod, GXutil.rtrim( localUtil.format( hV5InicialMRCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInicialmrcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavInicialmrcod_Enabled, 0, "text", "", 80, "chr", 4, "row", 255, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_Web_ConsultaRepuestoStockMinimo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFinalmrcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFinalmrcod_Internalname, httpContext.getMessage( "Repuesto Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFinalmrcod_Internalname, hV6FinalMRCod, GXutil.rtrim( localUtil.format( hV6FinalMRCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFinalmrcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFinalmrcod_Enabled, 0, "text", "", 80, "chr", 4, "row", 255, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_Web_ConsultaRepuestoStockMinimo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableacciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Web_ConsultaRepuestoStockMinimo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Web_ConsultaRepuestoStockMinimo.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start14R2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Repuesto Stock Minimo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup14R0( ) ;
   }

   public void ws14R2( )
   {
      start14R2( ) ;
      evt14R2( ) ;
   }

   public void evt14R2( )
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
                           e1114R2 ();
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
                                 e1214R2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1314R2 ();
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

   public void we14R2( )
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

   public void pa14R2( )
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
            GX_FocusControl = edtavInicialmrcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvinicialmrcod14R0( String A13718MRCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvinicialmrcod_data14R0( A13718MRCNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvinicialmrcod_data14R0( String A13718MRCNom )
   {
      l13718MRCNom = GXutil.concat( GXutil.rtrim( A13718MRCNom), "%", "") ;
      /* Using cursor H014R2 */
      pr_default.execute(0, new Object[] {l13718MRCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H014R2_A13718MRCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13718MRCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H014R2_A13718MRCNom[0]);
            gxdynajaxctrldescr.add(H014R2_A13718MRCNom[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvfinalmrcod14R0( String A13718MRCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvfinalmrcod_data14R0( A13718MRCNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvfinalmrcod_data14R0( String A13718MRCNom )
   {
      l13718MRCNom = GXutil.concat( GXutil.rtrim( A13718MRCNom), "%", "") ;
      /* Using cursor H014R3 */
      pr_default.execute(1, new Object[] {l13718MRCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H014R3_A13718MRCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13718MRCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H014R3_A13718MRCNom[0]);
            gxdynajaxctrldescr.add(H014R3_A13718MRCNom[0]);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcvvinicialmrcod14R2( String A13718MRCNom )
   {
      /* Using cursor H014R4 */
      pr_default.execute(2, new Object[] {A13718MRCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.strcmp(H014R4_A13718MRCNom[0], A13718MRCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13718MRCNom = H014R4_A13718MRCNom[0] ;
            A396EmprCod = H014R4_A396EmprCod[0] ;
            A9492MRCod = H014R4_A9492MRCod[0] ;
         }
         pr_default.readNext(2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(2);
   }

   public void gxhcvvfinalmrcod14R2( String A13718MRCNom )
   {
      /* Using cursor H014R5 */
      pr_default.execute(3, new Object[] {A13718MRCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( GXutil.strcmp(H014R5_A13718MRCNom[0], A13718MRCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13718MRCNom = H014R5_A13718MRCNom[0] ;
            A396EmprCod = H014R5_A396EmprCod[0] ;
            A9492MRCod = H014R5_A9492MRCod[0] ;
         }
         pr_default.readNext(3);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
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
      rf14R2( ) ;
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

   public void rf14R2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1314R2 ();
         wb14R0( ) ;
      }
   }

   public void send_integrity_lvl_hashes14R2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup14R0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1114R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         /* Read variables values. */
         hV5InicialMRCod = httpContext.cgiGet( edtavInicialmrcod_Internalname) ;
         if ( (GXutil.strcmp("", hV5InicialMRCod)==0) )
         {
            AV5InicialMRCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5InicialMRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5InicialMRCod), 8, 0));
         }
         else
         {
            A13718MRCNom = hV5InicialMRCod ;
            /* Using cursor H014R6 */
            pr_default.execute(4, new Object[] {A13718MRCNom});
            AV5InicialMRCod = H014R6_A9492MRCod[0] ;
            if ( ! ( (pr_default.getStatus(4) == 101) ) )
            {
               pr_default.readNext(4);
               if ( ! ( (pr_default.getStatus(4) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "vINICIALMRCOD");
                  GX_FocusControl = edtavInicialmrcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(4);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV5InicialMRCod", hV5InicialMRCod);
         hV6FinalMRCod = httpContext.cgiGet( edtavFinalmrcod_Internalname) ;
         if ( (GXutil.strcmp("", hV6FinalMRCod)==0) )
         {
            AV6FinalMRCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6FinalMRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6FinalMRCod), 8, 0));
         }
         else
         {
            A13718MRCNom = hV6FinalMRCod ;
            /* Using cursor H014R7 */
            pr_default.execute(5, new Object[] {A13718MRCNom});
            AV6FinalMRCod = H014R7_A9492MRCod[0] ;
            if ( ! ( (pr_default.getStatus(5) == 101) ) )
            {
               pr_default.readNext(5);
               if ( ! ( (pr_default.getStatus(5) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "vFINALMRCOD");
                  GX_FocusControl = edtavFinalmrcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(5);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV6FinalMRCod", hV6FinalMRCod);
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
      e1114R2 ();
      if (returnInSub) return;
   }

   public void e1114R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      web_consultarepuestostockminimo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = AV9EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      web_consultarepuestostockminimo_impl.this.AV9EmprCod = GXv_char2[0] ;
      web_consultarepuestostockminimo_impl.this.AV11EmprNom = GXv_char3[0] ;
      web_consultarepuestostockminimo_impl.this.AV12UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1214R2 ();
      if (returnInSub) return;
   }

   public void e1214R2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( ! (0==AV6FinalMRCod) && ( AV6FinalMRCod < AV5InicialMRCod ) )
      {
         AV7TemporalMRCod = AV5InicialMRCod ;
         AV5InicialMRCod = AV6FinalMRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5InicialMRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5InicialMRCod), 8, 0));
         /* Using cursor H014R8 */
         pr_default.execute(6, new Object[] {Integer.valueOf(AV5InicialMRCod)});
         hV5InicialMRCod = "" ;
         while ( (pr_default.getStatus(6) != 101) )
         {
            hV5InicialMRCod = H014R8_A13718MRCNom[0] ;
            if (true) break;
         }
         pr_default.close(6);
         httpContext.ajax_rsp_assign_attri("", false, "hV5InicialMRCod", hV5InicialMRCod);
         AV6FinalMRCod = AV7TemporalMRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6FinalMRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6FinalMRCod), 8, 0));
         /* Using cursor H014R9 */
         pr_default.execute(7, new Object[] {Integer.valueOf(AV6FinalMRCod)});
         hV6FinalMRCod = "" ;
         while ( (pr_default.getStatus(7) != 101) )
         {
            hV6FinalMRCod = H014R9_A13718MRCNom[0] ;
            if (true) break;
         }
         pr_default.close(7);
         httpContext.ajax_rsp_assign_attri("", false, "hV6FinalMRCod", hV6FinalMRCod);
      }
      callWebObject(formatLink("app.prpstkmin", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5InicialMRCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(((AV6FinalMRCod==0) ? 99999999 : AV6FinalMRCod),9,0))}, new String[] {"EmprCod","Mrcod1","Mrcod2"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e1314R2( )
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
      pa14R2( ) ;
      ws14R2( ) ;
      we14R2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20263623135454", true, true);
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
      httpContext.AddJavascriptSource("web_consultarepuestostockminimo.js", "?20263623135454", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavInicialmrcod_Internalname = "vINICIALMRCOD" ;
      edtavFinalmrcod_Internalname = "vFINALMRCOD" ;
      divTablerango_Internalname = "TABLERANGO" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      divTableacciones_Internalname = "TABLEACCIONES" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
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
      edtavFinalmrcod_Jsonclick = "" ;
      edtavFinalmrcod_Enabled = 1 ;
      edtavInicialmrcod_Jsonclick = "" ;
      edtavInicialmrcod_Enabled = 1 ;
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
      Form.setCaption( httpContext.getMessage( "Consulta Repuesto Stock Minimo", "") );
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

   public void validv_Inicialmrcod( )
   {
      if ( (GXutil.strcmp("", hV5InicialMRCod)==0) )
      {
         AV5InicialMRCod = 0 ;
      }
      else
      {
         A13718MRCNom = hV5InicialMRCod ;
         /* Using cursor H014R10 */
         pr_default.execute(8, new Object[] {A13718MRCNom});
         AV5InicialMRCod = H014R10_A9492MRCod[0] ;
         if ( ! ( (pr_default.getStatus(8) == 101) ) )
         {
            pr_default.readNext(8);
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "vINICIALMRCOD");
               GX_FocusControl = edtavInicialmrcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(8);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV5InicialMRCod", hV5InicialMRCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV5InicialMRCod", GXutil.ltrim( localUtil.ntoc( AV5InicialMRCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV5InicialMRCod", hV5InicialMRCod);
   }

   public void validv_Finalmrcod( )
   {
      if ( (GXutil.strcmp("", hV6FinalMRCod)==0) )
      {
         AV6FinalMRCod = 0 ;
      }
      else
      {
         A13718MRCNom = hV6FinalMRCod ;
         /* Using cursor H014R11 */
         pr_default.execute(9, new Object[] {A13718MRCNom});
         AV6FinalMRCod = H014R11_A9492MRCod[0] ;
         if ( ! ( (pr_default.getStatus(9) == 101) ) )
         {
            pr_default.readNext(9);
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "vFINALMRCOD");
               GX_FocusControl = edtavFinalmrcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(9);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV6FinalMRCod", hV6FinalMRCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV6FinalMRCod", GXutil.ltrim( localUtil.ntoc( AV6FinalMRCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV6FinalMRCod", hV6FinalMRCod);
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
      setEventMetadata("ENTER","{handler:'e1214R2',iparms:[{av:'AV6FinalMRCod',fld:'vFINALMRCOD',pic:'ZZZZZZZ9'},{av:'AV5InicialMRCod',fld:'vINICIALMRCOD',pic:'ZZZZZZZ9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV5InicialMRCod',fld:'vINICIALMRCOD',pic:'ZZZZZZZ9'},{av:'AV6FinalMRCod',fld:'vFINALMRCOD',pic:'ZZZZZZZ9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_INICIALMRCOD","{handler:'validv_Inicialmrcod',iparms:[{av:'hV5InicialMRCod'},{av:'AV5InicialMRCod',fld:'vINICIALMRCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALIDV_INICIALMRCOD",",oparms:[{av:'AV5InicialMRCod',fld:'vINICIALMRCOD',pic:'ZZZZZZZ9'},{av:'hV5InicialMRCod'}]}");
      setEventMetadata("VALIDV_FINALMRCOD","{handler:'validv_Finalmrcod',iparms:[{av:'hV6FinalMRCod'},{av:'AV6FinalMRCod',fld:'vFINALMRCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALIDV_FINALMRCOD",",oparms:[{av:'AV6FinalMRCod',fld:'vFINALMRCOD',pic:'ZZZZZZZ9'},{av:'hV6FinalMRCod'}]}");
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
      A13718MRCNom = "" ;
      hV5InicialMRCod = "" ;
      hV6FinalMRCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV9EmprCod = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13718MRCNom = "" ;
      H014R2_A13718MRCNom = new String[] {""} ;
      H014R3_A13718MRCNom = new String[] {""} ;
      H014R4_A13718MRCNom = new String[] {""} ;
      H014R4_A396EmprCod = new String[] {""} ;
      H014R4_A9492MRCod = new int[1] ;
      A396EmprCod = "" ;
      H014R5_A13718MRCNom = new String[] {""} ;
      H014R5_A396EmprCod = new String[] {""} ;
      H014R5_A9492MRCod = new int[1] ;
      H014R6_A13718MRCNom = new String[] {""} ;
      H014R6_A396EmprCod = new String[] {""} ;
      H014R6_A9492MRCod = new int[1] ;
      H014R7_A13718MRCNom = new String[] {""} ;
      H014R7_A396EmprCod = new String[] {""} ;
      H014R7_A9492MRCod = new int[1] ;
      AV10Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV12UsurCod = "" ;
      GXv_char4 = new String[1] ;
      H014R8_A13718MRCNom = new String[] {""} ;
      H014R8_A396EmprCod = new String[] {""} ;
      H014R8_A9492MRCod = new int[1] ;
      H014R9_A13718MRCNom = new String[] {""} ;
      H014R9_A396EmprCod = new String[] {""} ;
      H014R9_A9492MRCod = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H014R10_A13718MRCNom = new String[] {""} ;
      H014R10_A396EmprCod = new String[] {""} ;
      H014R10_A9492MRCod = new int[1] ;
      ZhV5InicialMRCod = "" ;
      H014R11_A13718MRCNom = new String[] {""} ;
      H014R11_A396EmprCod = new String[] {""} ;
      H014R11_A9492MRCod = new int[1] ;
      ZhV6FinalMRCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.web_consultarepuestostockminimo__default(),
         new Object[] {
             new Object[] {
            H014R2_A13718MRCNom
            }
            , new Object[] {
            H014R3_A13718MRCNom
            }
            , new Object[] {
            H014R4_A13718MRCNom, H014R4_A396EmprCod, H014R4_A9492MRCod
            }
            , new Object[] {
            H014R5_A13718MRCNom, H014R5_A396EmprCod, H014R5_A9492MRCod
            }
            , new Object[] {
            H014R6_A13718MRCNom, H014R6_A396EmprCod, H014R6_A9492MRCod
            }
            , new Object[] {
            H014R7_A13718MRCNom, H014R7_A396EmprCod, H014R7_A9492MRCod
            }
            , new Object[] {
            H014R8_A13718MRCNom, H014R8_A396EmprCod, H014R8_A9492MRCod
            }
            , new Object[] {
            H014R9_A13718MRCNom, H014R9_A396EmprCod, H014R9_A9492MRCod
            }
            , new Object[] {
            H014R10_A13718MRCNom, H014R10_A396EmprCod, H014R10_A9492MRCod
            }
            , new Object[] {
            H014R11_A13718MRCNom, H014R11_A396EmprCod, H014R11_A9492MRCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int AV5InicialMRCod ;
   private int AV6FinalMRCod ;
   private int edtavInicialmrcod_Enabled ;
   private int edtavFinalmrcod_Enabled ;
   private int gxdynajaxindex ;
   private int A9492MRCod ;
   private int AV7TemporalMRCod ;
   private int idxLst ;
   private int ZV5InicialMRCod ;
   private int ZV6FinalMRCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV9EmprCod ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTablerango_Internalname ;
   private String edtavInicialmrcod_Internalname ;
   private String TempTags ;
   private String edtavInicialmrcod_Jsonclick ;
   private String edtavFinalmrcod_Internalname ;
   private String edtavFinalmrcod_Jsonclick ;
   private String divTableacciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV10Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV12UsurCod ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String A13718MRCNom ;
   private String hV5InicialMRCod ;
   private String hV6FinalMRCod ;
   private String l13718MRCNom ;
   private String ZhV5InicialMRCod ;
   private String ZhV6FinalMRCod ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private IDataStoreProvider pr_default ;
   private String[] H014R2_A13718MRCNom ;
   private String[] H014R3_A13718MRCNom ;
   private String[] H014R4_A13718MRCNom ;
   private String[] H014R4_A396EmprCod ;
   private int[] H014R4_A9492MRCod ;
   private String[] H014R5_A13718MRCNom ;
   private String[] H014R5_A396EmprCod ;
   private int[] H014R5_A9492MRCod ;
   private String[] H014R6_A13718MRCNom ;
   private String[] H014R6_A396EmprCod ;
   private int[] H014R6_A9492MRCod ;
   private String[] H014R7_A13718MRCNom ;
   private String[] H014R7_A396EmprCod ;
   private int[] H014R7_A9492MRCod ;
   private String[] H014R8_A13718MRCNom ;
   private String[] H014R8_A396EmprCod ;
   private int[] H014R8_A9492MRCod ;
   private String[] H014R9_A13718MRCNom ;
   private String[] H014R9_A396EmprCod ;
   private int[] H014R9_A9492MRCod ;
   private String[] H014R10_A13718MRCNom ;
   private String[] H014R10_A396EmprCod ;
   private int[] H014R10_A9492MRCod ;
   private String[] H014R11_A13718MRCNom ;
   private String[] H014R11_A396EmprCod ;
   private int[] H014R11_A9492MRCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class web_consultarepuestostockminimo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H014R2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom FROM TXPMREPUE WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, '')))) like '%' || UPPER(?) ORDER BY MRCNom) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014R3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom FROM TXPMREPUE WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, '')))) like '%' || UPPER(?) ORDER BY MRCNom) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014R4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014R5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014R6", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014R7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014R8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE MRCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014R9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE MRCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014R10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014R11", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
      }
   }

}

