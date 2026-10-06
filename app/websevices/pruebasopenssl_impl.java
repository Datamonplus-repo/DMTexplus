package app.websevices ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pruebasopenssl_impl extends GXDataArea
{
   public pruebasopenssl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public pruebasopenssl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pruebasopenssl_impl.class ));
   }

   public pruebasopenssl_impl( int remoteHandle ,
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
      paAP2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startAP2( ) ;
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
      httpContext.AddJavascriptSource("Switch/switch.min.js", "", false, true);
      httpContext.AddJavascriptSource("Switch/switch.min.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.websevices.pruebasopenssl", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vUSARKEYPARAMETRIZADA", AV39UsarKeyParametrizada);
      app.GxWebStd.gx_hidden_field( httpContext, "USARKEYPARAMETRIZADA_Enabled", GXutil.booltostr( Usarkeyparametrizada_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "USARKEYPARAMETRIZADA_Captionclass", GXutil.rtrim( Usarkeyparametrizada_Captionclass));
      app.GxWebStd.gx_hidden_field( httpContext, "USARKEYPARAMETRIZADA_Captionstyle", GXutil.rtrim( Usarkeyparametrizada_Captionstyle));
      app.GxWebStd.gx_hidden_field( httpContext, "USARKEYPARAMETRIZADA_Captionposition", GXutil.rtrim( Usarkeyparametrizada_Captionposition));
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
         weAP2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtAP2( ) ;
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
      return formatLink("app.websevices.pruebasopenssl", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebSevices.PruebasOPENSSL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Pruebas OPENSSL", "") ;
   }

   public void wbAP0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTexto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTexto_Internalname, httpContext.getMessage( "texto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavTexto_Internalname, AV38Texto, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,17);\"", (short)(0), 1, edtavTexto_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebSevices\\PruebasOPENSSL.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", -1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+Usarkeyparametrizada_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, Usarkeyparametrizada_Internalname, httpContext.getMessage( "Usar Key Parametrizada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUsarkeyparametrizada.setProperty("Attribute", AV39UsarKeyParametrizada);
         ucUsarkeyparametrizada.setProperty("CaptionClass", Usarkeyparametrizada_Captionclass);
         ucUsarkeyparametrizada.setProperty("CaptionStyle", Usarkeyparametrizada_Captionstyle);
         ucUsarkeyparametrizada.setProperty("CaptionPosition", Usarkeyparametrizada_Captionposition);
         ucUsarkeyparametrizada.render(context, "sdswitch", Usarkeyparametrizada_Internalname, "USARKEYPARAMETRIZADAContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFirma_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFirma_Internalname, httpContext.getMessage( "Firma", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavFirma_Internalname, GXutil.rtrim( AV33Firma), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", (short)(0), 1, edtavFirma_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebSevices\\PruebasOPENSSL.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarahash_Internalname, "", httpContext.getMessage( "Generara HASH", ""), bttBtngenerarahash_Jsonclick, 5, httpContext.getMessage( "Generara HASH", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOGENERARAHASH\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebSevices\\PruebasOPENSSL.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRutaclaveprivadapem_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRutaclaveprivadapem_Internalname, httpContext.getMessage( "Ruta Clave Privada PEM", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavRutaclaveprivadapem_Internalname, AV36RutaClavePrivadaPEM, edtavRutaclaveprivadapem_Link, TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", (short)(0), 1, edtavRutaclaveprivadapem_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", 1, 0, "", "", (byte)(-1), true, "GeneXus\\ObjectName", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebSevices\\PruebasOPENSSL.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRutaclavepublicapem_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRutaclavepublicapem_Internalname, httpContext.getMessage( "Ruta Clave Publica PEM", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavRutaclavepublicapem_Internalname, AV37RutaClavePublicaPEM, edtavRutaclavepublicapem_Link, TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", (short)(0), 1, edtavRutaclavepublicapem_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", 1, 0, "", "", (byte)(-1), true, "GeneXus\\ObjectName", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebSevices\\PruebasOPENSSL.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarclaveprivadapem_Internalname, "", httpContext.getMessage( "Generar Clave Privada PEM", ""), bttBtngenerarclaveprivadapem_Jsonclick, 5, httpContext.getMessage( "Generar Clave Privada PEM", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOGENERARCLAVEPRIVADAPEM\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebSevices\\PruebasOPENSSL.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarclavepublicapem_Internalname, "", httpContext.getMessage( "Genera rClave Publica PEM", ""), bttBtngenerarclavepublicapem_Jsonclick, 5, httpContext.getMessage( "Genera rClave Publica PEM", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOGENERARCLAVEPUBLICAPEM\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebSevices\\PruebasOPENSSL.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startAP2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Pruebas OPENSSL", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupAP0( ) ;
   }

   public void wsAP2( )
   {
      startAP2( ) ;
      evtAP2( ) ;
   }

   public void evtAP2( )
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
                           e11AP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOGENERARCLAVEPRIVADAPEM'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoGenerarClavePrivadaPEM' */
                           e12AP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOGENERARCLAVEPUBLICAPEM'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoGenerarClavePublicaPEM' */
                           e13AP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOGENERARAHASH'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoGeneraraHASH' */
                           e14AP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e15AP2 ();
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

   public void weAP2( )
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

   public void paAP2( )
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
            GX_FocusControl = edtavTexto_Internalname ;
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
      rfAP2( ) ;
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
      edtavFirma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFirma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFirma_Enabled), 5, 0), true);
      edtavRutaclaveprivadapem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRutaclaveprivadapem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRutaclaveprivadapem_Enabled), 5, 0), true);
      edtavRutaclavepublicapem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRutaclavepublicapem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRutaclavepublicapem_Enabled), 5, 0), true);
   }

   public void rfAP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e15AP2 ();
         wbAP0( ) ;
      }
   }

   public void send_integrity_lvl_hashesAP2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavFirma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFirma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFirma_Enabled), 5, 0), true);
      edtavRutaclaveprivadapem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRutaclaveprivadapem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRutaclaveprivadapem_Enabled), 5, 0), true);
      edtavRutaclavepublicapem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRutaclavepublicapem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRutaclavepublicapem_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupAP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11AP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV39UsarKeyParametrizada = GXutil.strtobool( httpContext.cgiGet( "vUSARKEYPARAMETRIZADA")) ;
         Usarkeyparametrizada_Enabled = GXutil.strtobool( httpContext.cgiGet( "USARKEYPARAMETRIZADA_Enabled")) ;
         Usarkeyparametrizada_Captionclass = httpContext.cgiGet( "USARKEYPARAMETRIZADA_Captionclass") ;
         Usarkeyparametrizada_Captionstyle = httpContext.cgiGet( "USARKEYPARAMETRIZADA_Captionstyle") ;
         Usarkeyparametrizada_Captionposition = httpContext.cgiGet( "USARKEYPARAMETRIZADA_Captionposition") ;
         /* Read variables values. */
         AV38Texto = httpContext.cgiGet( edtavTexto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Texto", AV38Texto);
         AV33Firma = httpContext.cgiGet( edtavFirma_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Firma", AV33Firma);
         AV36RutaClavePrivadaPEM = httpContext.cgiGet( edtavRutaclaveprivadapem_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36RutaClavePrivadaPEM", AV36RutaClavePrivadaPEM);
         AV37RutaClavePublicaPEM = httpContext.cgiGet( edtavRutaclavepublicapem_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37RutaClavePublicaPEM", AV37RutaClavePublicaPEM);
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
      e11AP2 ();
      if (returnInSub) return;
   }

   public void e11AP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV39UsarKeyParametrizada = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39UsarKeyParametrizada", AV39UsarKeyParametrizada);
      AV38Texto = "2021-10-12;2021-10-12T23:22:19;FAC 001/14;3.12;" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Texto", AV38Texto);
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pruebasopenssl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV42Emprnom ;
      GXv_char4[0] = AV43Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      pruebasopenssl_impl.this.AV6EmprCod = GXv_char2[0] ;
      pruebasopenssl_impl.this.AV42Emprnom = GXv_char3[0] ;
      pruebasopenssl_impl.this.AV43Usurcod = GXv_char4[0] ;
   }

   public void e12AP2( )
   {
      /* 'DoGenerarClavePrivadaPEM' Routine */
      returnInSub = false ;
      GXt_char1 = AV36RutaClavePrivadaPEM ;
      GXv_char4[0] = GXt_char1 ;
      new app.websevices.creacionclaveprivadapemopenssl(remoteHandle, context).execute( GXv_char4) ;
      pruebasopenssl_impl.this.GXt_char1 = GXv_char4[0] ;
      AV36RutaClavePrivadaPEM = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36RutaClavePrivadaPEM", AV36RutaClavePrivadaPEM);
      AV31ClavePrivadaPEMFile.setSource( AV36RutaClavePrivadaPEM );
      if ( AV31ClavePrivadaPEMFile.exists() )
      {
         edtavRutaclaveprivadapem_Link = formatLink(AV31ClavePrivadaPEMFile.getURI(), new String[] {}, new String[] {})  ;
         httpContext.ajax_rsp_assign_prop("", false, edtavRutaclaveprivadapem_Internalname, "Link", edtavRutaclaveprivadapem_Link, true);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "CreacionClavePrivadaPEMOpenSSL ", "")+AV36RutaClavePrivadaPEM);
      }
      /*  Sending Event outputs  */
   }

   public void e13AP2( )
   {
      /* 'DoGenerarClavePublicaPEM' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV36RutaClavePrivadaPEM)==0) )
      {
         GXt_char1 = AV37RutaClavePublicaPEM ;
         GXv_char4[0] = GXt_char1 ;
         new app.websevices.creacionclavepublicapemopenssl(remoteHandle, context).execute( AV36RutaClavePrivadaPEM, GXv_char4) ;
         pruebasopenssl_impl.this.GXt_char1 = GXv_char4[0] ;
         AV37RutaClavePublicaPEM = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37RutaClavePublicaPEM", AV37RutaClavePublicaPEM);
         AV32ClavePublicaPEMFile.setSource( AV37RutaClavePublicaPEM );
         if ( AV32ClavePublicaPEMFile.exists() )
         {
            edtavRutaclavepublicapem_Link = formatLink(AV32ClavePublicaPEMFile.getURI(), new String[] {}, new String[] {})  ;
            httpContext.ajax_rsp_assign_prop("", false, edtavRutaclavepublicapem_Internalname, "Link", edtavRutaclavepublicapem_Link, true);
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "CreacionClavePublicaPEMOpenSSL ", "")+AV37RutaClavePublicaPEM);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e14AP2( )
   {
      /* 'DoGeneraraHASH' Routine */
      returnInSub = false ;
      AV33Firma = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Firma", AV33Firma);
      GXv_boolean5[0] = AV34GeneradoHASH ;
      GXv_char4[0] = AV33Firma ;
      new app.websevices.creacionhashopenssl(remoteHandle, context).execute( AV38Texto, AV39UsarKeyParametrizada, GXv_boolean5, GXv_char4) ;
      pruebasopenssl_impl.this.AV34GeneradoHASH = GXv_boolean5[0] ;
      pruebasopenssl_impl.this.AV33Firma = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Firma", AV33Firma);
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e15AP2( )
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
      paAP2( ) ;
      wsAP2( ) ;
      weAP2( ) ;
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
      httpContext.AddStyleSheetFile("Switch/switch.min.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016404844", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("websevices/pruebasopenssl.js", "?202661016404844", false, true);
      httpContext.AddJavascriptSource("Switch/switch.min.js", "", false, true);
      httpContext.AddJavascriptSource("Switch/switch.min.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavTexto_Internalname = "vTEXTO" ;
      Usarkeyparametrizada_Internalname = "USARKEYPARAMETRIZADA" ;
      edtavFirma_Internalname = "vFIRMA" ;
      bttBtngenerarahash_Internalname = "BTNGENERARAHASH" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavRutaclaveprivadapem_Internalname = "vRUTACLAVEPRIVADAPEM" ;
      edtavRutaclavepublicapem_Internalname = "vRUTACLAVEPUBLICAPEM" ;
      bttBtngenerarclaveprivadapem_Internalname = "BTNGENERARCLAVEPRIVADAPEM" ;
      bttBtngenerarclavepublicapem_Internalname = "BTNGENERARCLAVEPUBLICAPEM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
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
      edtavRutaclavepublicapem_Link = "" ;
      edtavRutaclavepublicapem_Enabled = 1 ;
      edtavRutaclaveprivadapem_Link = "" ;
      edtavRutaclaveprivadapem_Enabled = 1 ;
      edtavFirma_Enabled = 1 ;
      edtavTexto_Enabled = 1 ;
      Usarkeyparametrizada_Captionposition = "Left" ;
      Usarkeyparametrizada_Captionstyle = "" ;
      Usarkeyparametrizada_Captionclass = "col-sm-3 AttributeFLLabel" ;
      Usarkeyparametrizada_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Pruebas OPENSSL", "") );
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
      setEventMetadata("'DOGENERARCLAVEPRIVADAPEM'","{handler:'e12AP2',iparms:[]");
      setEventMetadata("'DOGENERARCLAVEPRIVADAPEM'",",oparms:[{av:'AV36RutaClavePrivadaPEM',fld:'vRUTACLAVEPRIVADAPEM',pic:''},{av:'edtavRutaclaveprivadapem_Link',ctrl:'vRUTACLAVEPRIVADAPEM',prop:'Link'}]}");
      setEventMetadata("'DOGENERARCLAVEPUBLICAPEM'","{handler:'e13AP2',iparms:[{av:'AV36RutaClavePrivadaPEM',fld:'vRUTACLAVEPRIVADAPEM',pic:''}]");
      setEventMetadata("'DOGENERARCLAVEPUBLICAPEM'",",oparms:[{av:'AV37RutaClavePublicaPEM',fld:'vRUTACLAVEPUBLICAPEM',pic:''},{av:'edtavRutaclavepublicapem_Link',ctrl:'vRUTACLAVEPUBLICAPEM',prop:'Link'}]}");
      setEventMetadata("'DOGENERARAHASH'","{handler:'e14AP2',iparms:[{av:'AV38Texto',fld:'vTEXTO',pic:''},{av:'AV39UsarKeyParametrizada',fld:'vUSARKEYPARAMETRIZADA',pic:''}]");
      setEventMetadata("'DOGENERARAHASH'",",oparms:[{av:'AV33Firma',fld:'vFIRMA',pic:''}]}");
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
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      AV38Texto = "" ;
      ucUsarkeyparametrizada = new com.genexus.webpanels.GXUserControl();
      AV33Firma = "" ;
      bttBtngenerarahash_Jsonclick = "" ;
      AV36RutaClavePrivadaPEM = "" ;
      AV37RutaClavePublicaPEM = "" ;
      bttBtngenerarclaveprivadapem_Jsonclick = "" ;
      bttBtngenerarclavepublicapem_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV23Station = "" ;
      AV6EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV42Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV43Usurcod = "" ;
      AV31ClavePrivadaPEMFile = new com.genexus.util.GXFile();
      GXt_char1 = "" ;
      AV32ClavePublicaPEMFile = new com.genexus.util.GXFile();
      GXv_boolean5 = new boolean[1] ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavFirma_Enabled = 0 ;
      edtavRutaclaveprivadapem_Enabled = 0 ;
      edtavRutaclavepublicapem_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavTexto_Enabled ;
   private int edtavFirma_Enabled ;
   private int edtavRutaclaveprivadapem_Enabled ;
   private int edtavRutaclavepublicapem_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Usarkeyparametrizada_Captionclass ;
   private String Usarkeyparametrizada_Captionstyle ;
   private String Usarkeyparametrizada_Captionposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String edtavTexto_Internalname ;
   private String TempTags ;
   private String Usarkeyparametrizada_Internalname ;
   private String edtavFirma_Internalname ;
   private String AV33Firma ;
   private String bttBtngenerarahash_Internalname ;
   private String bttBtngenerarahash_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavRutaclaveprivadapem_Internalname ;
   private String edtavRutaclaveprivadapem_Link ;
   private String edtavRutaclavepublicapem_Internalname ;
   private String edtavRutaclavepublicapem_Link ;
   private String bttBtngenerarclaveprivadapem_Internalname ;
   private String bttBtngenerarclaveprivadapem_Jsonclick ;
   private String bttBtngenerarclavepublicapem_Internalname ;
   private String bttBtngenerarclavepublicapem_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV23Station ;
   private String AV6EmprCod ;
   private String GXv_char2[] ;
   private String AV42Emprnom ;
   private String GXv_char3[] ;
   private String AV43Usurcod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV39UsarKeyParametrizada ;
   private boolean Usarkeyparametrizada_Enabled ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV34GeneradoHASH ;
   private boolean GXv_boolean5[] ;
   private String AV38Texto ;
   private String AV36RutaClavePrivadaPEM ;
   private String AV37RutaClavePublicaPEM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucUsarkeyparametrizada ;
   private com.genexus.util.GXFile AV31ClavePrivadaPEMFile ;
   private com.genexus.util.GXFile AV32ClavePublicaPEMFile ;
   private com.genexus.webpanels.GXWebForm Form ;
}

