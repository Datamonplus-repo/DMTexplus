package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class produccionanalisistradicional_impl extends GXDataArea
{
   public produccionanalisistradicional_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public produccionanalisistradicional_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( produccionanalisistradicional_impl.class ));
   }

   public produccionanalisistradicional_impl( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHisestreo = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODINI") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodiniD40( A396EmprCod, A602MaqCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODFIN") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodfinD40( A396EmprCod, A602MaqCod) ;
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
      paD42( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startD42( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccionanalisistradicional", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
      if ( ! ( WebComp_Wcwcproduccionanalisismaquinatradicional == null ) )
      {
         WebComp_Wcwcproduccionanalisismaquinatradicional.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2 == null ) )
      {
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionanalisistradicionalqueryviewer == null ) )
      {
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer.componentjscripts();
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
         weD42( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtD42( ) ;
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
      return formatLink("app.produccionanalisistradicional", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ProduccionAnalisisTradicional" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Produccion Analisis Tradicional", "") ;
   }

   public void wbD40( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqcodini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcodini_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockmaqcodini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionAnalisisTradicional.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodini_Internalname, httpContext.getMessage( "Maq Cod Ini", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodini_Internalname, GXutil.rtrim( AV5MaqCodIni), GXutil.rtrim( localUtil.format( AV5MaqCodIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodini_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_ProduccionAnalisisTradicional.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqcodfin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcodfin_Internalname, "", "", "", lblTextblockmaqcodfin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionAnalisisTradicional.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodfin_Internalname, httpContext.getMessage( "Maq Cod Fin", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodfin_Internalname, GXutil.rtrim( AV6MaqCodFin), GXutil.rtrim( localUtil.format( AV6MaqCodFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodfin_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_ProduccionAnalisisTradicional.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablehisprodti_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockhisprodti_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblockhisprodti_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionAnalisisTradicional.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodti_Internalname, httpContext.getMessage( "His Pro DTI", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodti_Internalname, localUtil.ttoc( AV7HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV7HisProDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionAnalisisTradicional.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ProduccionAnalisisTradicional.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablehisprodtf_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockhisprodtf_Internalname, "", "", "", lblTextblockhisprodtf_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionAnalisisTradicional.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodtf_Internalname, httpContext.getMessage( "His Pro DTF", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodtf_Internalname, localUtil.ttoc( AV8HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV8HisProDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodtf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodtf_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionAnalisisTradicional.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodtf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ProduccionAnalisisTradicional.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablehisestreo_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockhisestreo_Internalname, httpContext.getMessage( "Tipo Produccion", ""), "", "", lblTextblockhisestreo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionAnalisisTradicional.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHisestreo.getInternalname(), httpContext.getMessage( "Estado Reoperado", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHisestreo, cmbavHisestreo.getInternalname(), GXutil.trim( GXutil.str( AV14HisEstReo, 1, 0)), 1, cmbavHisestreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavHisestreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "", true, (byte)(0), "HLP_ProduccionAnalisisTradicional.htm");
         cmbavHisestreo.setValue( GXutil.trim( GXutil.str( AV14HisEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisestreo.getInternalname(), "Values", cmbavHisestreo.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0060"+"", GXutil.rtrim( WebComp_Wcwcproduccionanalisismaquinatradicional_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0060"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionanalisismaquinatradicional_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionanalisismaquinatradicional), GXutil.lower( WebComp_Wcwcproduccionanalisismaquinatradicional_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0060"+"");
               }
               WebComp_Wcwcproduccionanalisismaquinatradicional.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionanalisismaquinatradicional), GXutil.lower( WebComp_Wcwcproduccionanalisismaquinatradicional_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0062"+"", GXutil.rtrim( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0062"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionanalisisdetallehdrstradicional2), GXutil.lower( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0062"+"");
               }
               WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionanalisisdetallehdrstradicional2), GXutil.lower( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0064"+"", GXutil.rtrim( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0064"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionanalisistradicionalqueryviewer), GXutil.lower( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0064"+"");
               }
               WebComp_Wcwcproduccionanalisistradicionalqueryviewer.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionanalisistradicionalqueryviewer), GXutil.lower( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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

   public void startD42( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Produccion Analisis Tradicional", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupD40( ) ;
   }

   public void wsD42( )
   {
      startD42( ) ;
      evtD42( ) ;
   }

   public void evtD42( )
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
                           e11D42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e12D42 ();
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
                     if ( nCmpId == 60 )
                     {
                        OldWcwcproduccionanalisismaquinatradicional = httpContext.cgiGet( "W0060") ;
                        if ( ( GXutil.len( OldWcwcproduccionanalisismaquinatradicional) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionanalisismaquinatradicional, WebComp_Wcwcproduccionanalisismaquinatradicional_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionanalisismaquinatradicional = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionanalisismaquinatradicional + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionanalisismaquinatradicional_Component = OldWcwcproduccionanalisismaquinatradicional ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionanalisismaquinatradicional_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionanalisismaquinatradicional.componentprocess("W0060", "", sEvt);
                        }
                        WebComp_Wcwcproduccionanalisismaquinatradicional_Component = OldWcwcproduccionanalisismaquinatradicional ;
                     }
                     else if ( nCmpId == 62 )
                     {
                        OldWcwcproduccionanalisisdetallehdrstradicional2 = httpContext.cgiGet( "W0062") ;
                        if ( ( GXutil.len( OldWcwcproduccionanalisisdetallehdrstradicional2) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionanalisisdetallehdrstradicional2, WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionanalisisdetallehdrstradicional2 = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionanalisisdetallehdrstradicional2 + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component = OldWcwcproduccionanalisisdetallehdrstradicional2 ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.componentprocess("W0062", "", sEvt);
                        }
                        WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component = OldWcwcproduccionanalisisdetallehdrstradicional2 ;
                     }
                     else if ( nCmpId == 64 )
                     {
                        OldWcwcproduccionanalisistradicionalqueryviewer = httpContext.cgiGet( "W0064") ;
                        if ( ( GXutil.len( OldWcwcproduccionanalisistradicionalqueryviewer) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionanalisistradicionalqueryviewer, WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionanalisistradicionalqueryviewer = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionanalisistradicionalqueryviewer + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component = OldWcwcproduccionanalisistradicionalqueryviewer ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionanalisistradicionalqueryviewer.componentprocess("W0064", "", sEvt);
                        }
                        WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component = OldWcwcproduccionanalisistradicionalqueryviewer ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weD42( )
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

   public void paD42( )
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
            GX_FocusControl = edtavMaqcodini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvmaqcodiniD40( String A396EmprCod ,
                                   String A602MaqCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcodini_dataD40( A396EmprCod, A602MaqCod) ;
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

   protected void gxsgvvmaqcodini_dataD40( String A396EmprCod ,
                                           String A602MaqCod )
   {
      l602MaqCod = GXutil.padr( GXutil.rtrim( A602MaqCod), 6, "%") ;
      /* Using cursor H00D42 */
      pr_default.execute(0, new Object[] {A396EmprCod, l602MaqCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00D42_A602MaqCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00D42_A602MaqCod[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvmaqcodfinD40( String A396EmprCod ,
                                   String A602MaqCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcodfin_dataD40( A396EmprCod, A602MaqCod) ;
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

   protected void gxsgvvmaqcodfin_dataD40( String A396EmprCod ,
                                           String A602MaqCod )
   {
      l602MaqCod = GXutil.padr( GXutil.rtrim( A602MaqCod), 6, "%") ;
      /* Using cursor H00D43 */
      pr_default.execute(1, new Object[] {A396EmprCod, l602MaqCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00D43_A602MaqCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00D43_A602MaqCod[0]));
         pr_default.readNext(1);
      }
      pr_default.close(1);
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
      if ( cmbavHisestreo.getItemCount() > 0 )
      {
         AV14HisEstReo = (byte)(GXutil.lval( cmbavHisestreo.getValidValue(GXutil.trim( GXutil.str( AV14HisEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14HisEstReo", GXutil.str( AV14HisEstReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHisestreo.setValue( GXutil.trim( GXutil.str( AV14HisEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisestreo.getInternalname(), "Values", cmbavHisestreo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfD42( ) ;
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

   public void rfD42( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionanalisismaquinatradicional_Component) != 0 )
            {
               WebComp_Wcwcproduccionanalisismaquinatradicional.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component) != 0 )
            {
               WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component) != 0 )
            {
               WebComp_Wcwcproduccionanalisistradicionalqueryviewer.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00D44 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            /* Execute user event: Load */
            e12D42 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         wbD40( ) ;
      }
   }

   public void send_integrity_lvl_hashesD42( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupD40( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11D42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         /* Read variables values. */
         AV5MaqCodIni = httpContext.cgiGet( edtavMaqcodini_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5MaqCodIni", AV5MaqCodIni);
         AV6MaqCodFin = httpContext.cgiGet( edtavMaqcodfin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6MaqCodFin", AV6MaqCodFin);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
            GX_FocusControl = edtavHisprodti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7HisProDTI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV7HisProDTI", localUtil.ttoc( AV7HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV7HisProDTI = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7HisProDTI", localUtil.ttoc( AV7HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
            GX_FocusControl = edtavHisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8HisProDTF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV8HisProDTF", localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV8HisProDTF = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8HisProDTF", localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         cmbavHisestreo.setValue( httpContext.cgiGet( cmbavHisestreo.getInternalname()) );
         AV14HisEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavHisestreo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14HisEstReo", GXutil.str( AV14HisEstReo, 1, 0));
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
      e11D42 ();
      if (returnInSub) return;
   }

   public void e11D42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      produccionanalisistradicional_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char4[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      produccionanalisistradicional_impl.this.A396EmprCod = GXv_char2[0] ;
      produccionanalisistradicional_impl.this.AV10EmprNom = GXv_char3[0] ;
      produccionanalisistradicional_impl.this.AV11UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV8HisProDTF = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8HisProDTF", localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV7HisProDTI = GXutil.addmth( AV8HisProDTF, (short)(-1)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7HisProDTI", localUtil.ttoc( AV7HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV14HisEstReo = (byte)(9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14HisEstReo", GXutil.str( AV14HisEstReo, 1, 0));
      GXt_char1 = AV9Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      produccionanalisistradicional_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9Station = GXt_char1 ;
      GXv_char4[0] = AV17Emprcod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char2[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char4, GXv_char3, GXv_char2) ;
      produccionanalisistradicional_impl.this.AV17Emprcod = GXv_char4[0] ;
      produccionanalisistradicional_impl.this.AV10EmprNom = GXv_char3[0] ;
      produccionanalisistradicional_impl.this.AV11UsurCod = GXv_char2[0] ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionanalisismaquinatradicional = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionanalisismaquinatradicional_Component), GXutil.lower( "WCProduccionAnalisisMaquinaTradicional")) != 0 )
      {
         WebComp_Wcwcproduccionanalisismaquinatradicional = WebUtils.getWebComponent(getClass(), "app.wcproduccionanalisismaquinatradicional_impl", remoteHandle, context);
         WebComp_Wcwcproduccionanalisismaquinatradicional_Component = "WCProduccionAnalisisMaquinaTradicional" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionanalisismaquinatradicional_Component) != 0 )
      {
         WebComp_Wcwcproduccionanalisismaquinatradicional.setjustcreated();
         WebComp_Wcwcproduccionanalisismaquinatradicional.componentprepare(new Object[] {"W0060","",A396EmprCod,AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF,Byte.valueOf(AV14HisEstReo)});
         WebComp_Wcwcproduccionanalisismaquinatradicional.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF","vHISESTREO"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionanalisisdetallehdrstradicional2 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component), GXutil.lower( "WCProduccionAnalisisDetalleHdrsTradicional2")) != 0 )
      {
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2 = WebUtils.getWebComponent(getClass(), "app.wcproduccionanalisisdetallehdrstradicional2_impl", remoteHandle, context);
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component = "WCProduccionAnalisisDetalleHdrsTradicional2" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component) != 0 )
      {
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.setjustcreated();
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.componentprepare(new Object[] {"W0062","",A396EmprCod,AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF,Byte.valueOf(AV14HisEstReo)});
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF","vHISESTREO"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionanalisistradicionalqueryviewer = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component), GXutil.lower( "WCProduccionAnalisisTradicionalQueryViewer")) != 0 )
      {
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer = WebUtils.getWebComponent(getClass(), "app.wcproduccionanalisistradicionalqueryviewer_impl", remoteHandle, context);
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component = "WCProduccionAnalisisTradicionalQueryViewer" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component) != 0 )
      {
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer.setjustcreated();
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer.componentprepare(new Object[] {"W0064","",A396EmprCod,AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF,Byte.valueOf(AV14HisEstReo)});
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF","vHISESTREO"});
      }
   }

   public void S112( )
   {
      /* 'REFRESH' Routine */
      returnInSub = false ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionanalisismaquinatradicional = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionanalisismaquinatradicional_Component), GXutil.lower( "WCProduccionAnalisisMaquinaTradicional")) != 0 )
      {
         WebComp_Wcwcproduccionanalisismaquinatradicional = WebUtils.getWebComponent(getClass(), "app.wcproduccionanalisismaquinatradicional_impl", remoteHandle, context);
         WebComp_Wcwcproduccionanalisismaquinatradicional_Component = "WCProduccionAnalisisMaquinaTradicional" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionanalisismaquinatradicional_Component) != 0 )
      {
         WebComp_Wcwcproduccionanalisismaquinatradicional.setjustcreated();
         WebComp_Wcwcproduccionanalisismaquinatradicional.componentprepare(new Object[] {"W0060","",A396EmprCod,AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF,Byte.valueOf(AV14HisEstReo)});
         WebComp_Wcwcproduccionanalisismaquinatradicional.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcproduccionanalisismaquinatradicional )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0060"+"");
         WebComp_Wcwcproduccionanalisismaquinatradicional.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionanalisisdetallehdrstradicional2 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component), GXutil.lower( "WCProduccionAnalisisDetalleHdrsTradicional2")) != 0 )
      {
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2 = WebUtils.getWebComponent(getClass(), "app.wcproduccionanalisisdetallehdrstradicional2_impl", remoteHandle, context);
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component = "WCProduccionAnalisisDetalleHdrsTradicional2" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component) != 0 )
      {
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.setjustcreated();
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.componentprepare(new Object[] {"W0062","",A396EmprCod,AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF,Byte.valueOf(AV14HisEstReo)});
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcproduccionanalisisdetallehdrstradicional2 )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0062"+"");
         WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionanalisistradicionalqueryviewer = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component), GXutil.lower( "WCProduccionAnalisisTradicionalQueryViewer")) != 0 )
      {
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer = WebUtils.getWebComponent(getClass(), "app.wcproduccionanalisistradicionalqueryviewer_impl", remoteHandle, context);
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component = "WCProduccionAnalisisTradicionalQueryViewer" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component) != 0 )
      {
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer.setjustcreated();
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer.componentprepare(new Object[] {"W0064","",A396EmprCod,AV5MaqCodIni,AV6MaqCodFin,AV7HisProDTI,AV8HisProDTF,Byte.valueOf(AV14HisEstReo)});
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vHISPRODTI","vHISPRODTF","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcproduccionanalisistradicionalqueryviewer )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0064"+"");
         WebComp_Wcwcproduccionanalisistradicionalqueryviewer.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e12D42( )
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
      paD42( ) ;
      wsD42( ) ;
      weD42( ) ;
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
      if ( ! ( WebComp_Wcwcproduccionanalisismaquinatradicional == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionanalisismaquinatradicional_Component) != 0 )
         {
            WebComp_Wcwcproduccionanalisismaquinatradicional.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2 == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component) != 0 )
         {
            WebComp_Wcwcproduccionanalisisdetallehdrstradicional2.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionanalisistradicionalqueryviewer == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component) != 0 )
         {
            WebComp_Wcwcproduccionanalisistradicionalqueryviewer.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415125374", true, true);
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
      httpContext.AddJavascriptSource("produccionanalisistradicional.js", "?202682415125374", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockmaqcodini_Internalname = "TEXTBLOCKMAQCODINI" ;
      edtavMaqcodini_Internalname = "vMAQCODINI" ;
      divUnnamedtablemaqcodini_Internalname = "UNNAMEDTABLEMAQCODINI" ;
      lblTextblockmaqcodfin_Internalname = "TEXTBLOCKMAQCODFIN" ;
      edtavMaqcodfin_Internalname = "vMAQCODFIN" ;
      divUnnamedtablemaqcodfin_Internalname = "UNNAMEDTABLEMAQCODFIN" ;
      lblTextblockhisprodti_Internalname = "TEXTBLOCKHISPRODTI" ;
      edtavHisprodti_Internalname = "vHISPRODTI" ;
      divUnnamedtablehisprodti_Internalname = "UNNAMEDTABLEHISPRODTI" ;
      lblTextblockhisprodtf_Internalname = "TEXTBLOCKHISPRODTF" ;
      edtavHisprodtf_Internalname = "vHISPRODTF" ;
      divUnnamedtablehisprodtf_Internalname = "UNNAMEDTABLEHISPRODTF" ;
      lblTextblockhisestreo_Internalname = "TEXTBLOCKHISESTREO" ;
      cmbavHisestreo.setInternalname( "vHISESTREO" );
      divUnnamedtablehisestreo_Internalname = "UNNAMEDTABLEHISESTREO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
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
      cmbavHisestreo.setJsonclick( "" );
      cmbavHisestreo.setEnabled( 1 );
      edtavHisprodtf_Jsonclick = "" ;
      edtavHisprodtf_Enabled = 1 ;
      edtavHisprodti_Jsonclick = "" ;
      edtavHisprodti_Enabled = 1 ;
      edtavMaqcodfin_Jsonclick = "" ;
      edtavMaqcodfin_Enabled = 1 ;
      edtavMaqcodini_Jsonclick = "" ;
      edtavMaqcodini_Enabled = 1 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Produccion Analisis Tradicional", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHisestreo.setName( "vHISESTREO" );
      cmbavHisestreo.setWebtags( "" );
      cmbavHisestreo.addItem("9", httpContext.getMessage( "Toda", ""), (short)(0));
      cmbavHisestreo.addItem("0", httpContext.getMessage( "Produccion Normal", ""), (short)(0));
      cmbavHisestreo.addItem("1", httpContext.getMessage( "Produccion Reoperado I", ""), (short)(0));
      cmbavHisestreo.addItem("2", httpContext.getMessage( "Produccion Reoperado E", ""), (short)(0));
      if ( cmbavHisestreo.getItemCount() > 0 )
      {
         AV14HisEstReo = (byte)(GXutil.lval( cmbavHisestreo.getValidValue(GXutil.trim( GXutil.str( AV14HisEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14HisEstReo", GXutil.str( AV14HisEstReo, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblockmaqcodini_Jsonclick = "" ;
      TempTags = "" ;
      AV5MaqCodIni = "" ;
      lblTextblockmaqcodfin_Jsonclick = "" ;
      AV6MaqCodFin = "" ;
      lblTextblockhisprodti_Jsonclick = "" ;
      AV7HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      lblTextblockhisprodtf_Jsonclick = "" ;
      AV8HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      lblTextblockhisestreo_Jsonclick = "" ;
      WebComp_Wcwcproduccionanalisismaquinatradicional_Component = "" ;
      OldWcwcproduccionanalisismaquinatradicional = "" ;
      WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component = "" ;
      OldWcwcproduccionanalisisdetallehdrstradicional2 = "" ;
      WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component = "" ;
      OldWcwcproduccionanalisistradicionalqueryviewer = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l602MaqCod = "" ;
      H00D42_A396EmprCod = new String[] {""} ;
      H00D42_A602MaqCod = new String[] {""} ;
      H00D43_A396EmprCod = new String[] {""} ;
      H00D43_A602MaqCod = new String[] {""} ;
      H00D44_A396EmprCod = new String[] {""} ;
      AV9Station = "" ;
      AV10EmprNom = "" ;
      AV11UsurCod = "" ;
      GXt_char1 = "" ;
      AV17Emprcod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccionanalisistradicional__default(),
         new Object[] {
             new Object[] {
            H00D42_A396EmprCod, H00D42_A602MaqCod
            }
            , new Object[] {
            H00D43_A396EmprCod, H00D43_A602MaqCod
            }
            , new Object[] {
            H00D44_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcwcproduccionanalisismaquinatradicional = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionanalisisdetallehdrstradicional2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionanalisistradicionalqueryviewer = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV14HisEstReo ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavMaqcodini_Enabled ;
   private int edtavMaqcodfin_Enabled ;
   private int edtavHisprodti_Enabled ;
   private int edtavHisprodtf_Enabled ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtablemaqcodini_Internalname ;
   private String lblTextblockmaqcodini_Internalname ;
   private String lblTextblockmaqcodini_Jsonclick ;
   private String edtavMaqcodini_Internalname ;
   private String TempTags ;
   private String AV5MaqCodIni ;
   private String edtavMaqcodini_Jsonclick ;
   private String divUnnamedtablemaqcodfin_Internalname ;
   private String lblTextblockmaqcodfin_Internalname ;
   private String lblTextblockmaqcodfin_Jsonclick ;
   private String edtavMaqcodfin_Internalname ;
   private String AV6MaqCodFin ;
   private String edtavMaqcodfin_Jsonclick ;
   private String divUnnamedtablehisprodti_Internalname ;
   private String lblTextblockhisprodti_Internalname ;
   private String lblTextblockhisprodti_Jsonclick ;
   private String edtavHisprodti_Internalname ;
   private String edtavHisprodti_Jsonclick ;
   private String divUnnamedtablehisprodtf_Internalname ;
   private String lblTextblockhisprodtf_Internalname ;
   private String lblTextblockhisprodtf_Jsonclick ;
   private String edtavHisprodtf_Internalname ;
   private String edtavHisprodtf_Jsonclick ;
   private String divUnnamedtablehisestreo_Internalname ;
   private String lblTextblockhisestreo_Internalname ;
   private String lblTextblockhisestreo_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wcwcproduccionanalisismaquinatradicional_Component ;
   private String OldWcwcproduccionanalisismaquinatradicional ;
   private String WebComp_Wcwcproduccionanalisisdetallehdrstradicional2_Component ;
   private String OldWcwcproduccionanalisisdetallehdrstradicional2 ;
   private String WebComp_Wcwcproduccionanalisistradicionalqueryviewer_Component ;
   private String OldWcwcproduccionanalisistradicionalqueryviewer ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l602MaqCod ;
   private String AV9Station ;
   private String AV10EmprNom ;
   private String AV11UsurCod ;
   private String GXt_char1 ;
   private String AV17Emprcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date AV7HisProDTI ;
   private java.util.Date AV8HisProDTF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcproduccionanalisismaquinatradicional ;
   private boolean bDynCreated_Wcwcproduccionanalisisdetallehdrstradicional2 ;
   private boolean bDynCreated_Wcwcproduccionanalisistradicionalqueryviewer ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcproduccionanalisismaquinatradicional ;
   private GXWebComponent WebComp_Wcwcproduccionanalisisdetallehdrstradicional2 ;
   private GXWebComponent WebComp_Wcwcproduccionanalisistradicionalqueryviewer ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private HTMLChoice cmbavHisestreo ;
   private IDataStoreProvider pr_default ;
   private String[] H00D42_A396EmprCod ;
   private String[] H00D42_A602MaqCod ;
   private String[] H00D43_A396EmprCod ;
   private String[] H00D43_A602MaqCod ;
   private String[] H00D44_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class produccionanalisistradicional__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00D42", "SELECT * FROM (SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (UPPER(MaqCod) like '%' || UPPER(?)) ORDER BY MaqCod) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00D43", "SELECT * FROM (SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (UPPER(MaqCod) like '%' || UPPER(?)) ORDER BY MaqCod) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00D44", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 2 :
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

