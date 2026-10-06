package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aeat_altafactura_test_impl extends GXWebPanel
{
   public aeat_altafactura_test_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public aeat_altafactura_test_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aeat_altafactura_test_impl.class ));
   }

   public aeat_altafactura_test_impl( int remoteHandle ,
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
         pa29Y2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws29Y2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we29Y2( ) ;
            }
         }
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
      cleanup();
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
      httpContext.writeValue( httpContext.getMessage( "AEAT_Alta Factura_Test", "")) ;
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
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.aeat.aeat_altafactura_test", new String[] {}, new String[] {}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vREGISTROFACTURACIONALTA", AV12RegistroFacturacionAlta);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vREGISTROFACTURACIONALTA", AV12RegistroFacturacionAlta);
      }
   }

   public void renderHtmlCloseForm29Y2( )
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
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "AEAT.AEAT_AltaFactura_Test" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "AEAT_Alta Factura_Test", "") ;
   }

   public void wb29Y0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndoxmlfactura_Internalname, "", httpContext.getMessage( "XML Factura - AEAT", ""), bttBtndoxmlfactura_Jsonclick, 5, httpContext.getMessage( "XML Factura - AEAT", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DODOXMLFACTURA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AEAT\\AEAT_AltaFactura_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndoenviarfacturaaeat_Internalname, "", httpContext.getMessage( "Enviar Factura AEAT", ""), bttBtndoenviarfacturaaeat_Jsonclick, 5, httpContext.getMessage( "Enviar Factura AEAT", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DODOENVIARFACTURAAEAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AEAT\\AEAT_AltaFactura_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrealizaraltafactura_Internalname, "", httpContext.getMessage( "REALIZAR ALTA FACTURA", ""), bttBtnrealizaraltafactura_Jsonclick, 5, httpContext.getMessage( "REALIZAR ALTA FACTURA", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOREALIZARALTAFACTURA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AEAT\\AEAT_AltaFactura_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccod_Internalname, httpContext.getMessage( "N° Factura", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV8FACCOD, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8FACCOD), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8FACCOD), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AEAT\\AEAT_AltaFactura_Test.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPfxpath_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPfxpath_Internalname, httpContext.getMessage( "pfx Path", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPfxpath_Internalname, AV24pfxPath, GXutil.rtrim( localUtil.format( AV24pfxPath, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPfxpath_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPfxpath_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AEAT\\AEAT_AltaFactura_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPfxpassword_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPfxpassword_Internalname, httpContext.getMessage( "pfx Password", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPfxpassword_Internalname, AV23pfxPassword, GXutil.rtrim( localUtil.format( AV23pfxPassword, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPfxpassword_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPfxpassword_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AEAT\\AEAT_AltaFactura_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHashhex_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHashhex_Internalname, httpContext.getMessage( "Hash", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHashhex_Internalname, AV9HashHex, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", (short)(0), 1, edtavHashhex_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "256", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AEAT\\AEAT_AltaFactura_Test.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRegistrofacturacionaltaxml_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRegistrofacturacionaltaxml_Internalname, httpContext.getMessage( "Registro Facturacion Alta XML", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavRegistrofacturacionaltaxml_Internalname, AV15RegistroFacturacionAltaXML, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", (short)(0), 1, edtavRegistrofacturacionaltaxml_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1048576", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AEAT\\AEAT_AltaFactura_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavResultadoenviarfacturaaeat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavResultadoenviarfacturaaeat_Internalname, httpContext.getMessage( "Resultado Enviar Factura AEAT", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavResultadoenviarfacturaaeat_Internalname, AV18ResultadoEnviarFacturaAEAT, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", (short)(0), 1, edtavResultadoenviarfacturaaeat_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AEAT\\AEAT_AltaFactura_Test.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "Pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV30Pgmname), GXutil.rtrim( localUtil.format( AV30Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 30, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AEAT\\AEAT_AltaFactura_Test.htm");
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

   public void start29Y2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "AEAT_Alta Factura_Test", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29Y0( ) ;
   }

   public void ws29Y2( )
   {
      start29Y2( ) ;
      evt29Y2( ) ;
   }

   public void evt29Y2( )
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
                        e1129Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DODOXMLFACTURA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoDoXMLFactura' */
                        e1229Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DODOENVIARFACTURAAEAT'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoDoEnviarFacturaAEAT' */
                        e1329Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOREALIZARALTAFACTURA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoRealizarAltaFActura' */
                        e1429Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e1529Y2 ();
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

   public void we29Y2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm29Y2( ) ;
         }
      }
   }

   public void pa29Y2( )
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
            GX_FocusControl = edtavFaccod_Internalname ;
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
      rf29Y2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV30Pgmname = "AEAT.AEAT_AltaFactura_Test" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
      Gx_err = (short)(0) ;
      edtavHashhex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHashhex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHashhex_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29Y2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1529Y2 ();
         wb29Y0( ) ;
      }
   }

   public void send_integrity_lvl_hashes29Y2( )
   {
   }

   public void before_start_formulas( )
   {
      AV30Pgmname = "AEAT.AEAT_AltaFactura_Test" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
      Gx_err = (short)(0) ;
      edtavHashhex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHashhex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHashhex_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29Y0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1129Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACCOD");
            GX_FocusControl = edtavFaccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8FACCOD = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FACCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8FACCOD), 8, 0));
         }
         else
         {
            AV8FACCOD = (int)(localUtil.ctol( httpContext.cgiGet( edtavFaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FACCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8FACCOD), 8, 0));
         }
         AV24pfxPath = httpContext.cgiGet( edtavPfxpath_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24pfxPath", AV24pfxPath);
         AV23pfxPassword = httpContext.cgiGet( edtavPfxpassword_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23pfxPassword", AV23pfxPassword);
         AV9HashHex = httpContext.cgiGet( edtavHashhex_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9HashHex", AV9HashHex);
         AV15RegistroFacturacionAltaXML = httpContext.cgiGet( edtavRegistrofacturacionaltaxml_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15RegistroFacturacionAltaXML", AV15RegistroFacturacionAltaXML);
         AV18ResultadoEnviarFacturaAEAT = httpContext.cgiGet( edtavResultadoenviarfacturaaeat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18ResultadoEnviarFacturaAEAT", AV18ResultadoEnviarFacturaAEAT);
         AV30Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
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
      e1129Y2 ();
      if (returnInSub) return;
   }

   public void e1129Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV20Timezones = context.getTimeZone( ) ;
      AV9HashHex = httpContext.getMessage( com.genexuscore.genexus.gxdomaintimezones.getDescription(httpContext,(String)AV20Timezones), "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9HashHex", AV9HashHex);
      GXt_int1 = AV8FACCOD ;
      GXv_int2[0] = GXt_int1 ;
      new app.aeat.aeat_next_faccod(remoteHandle, context).execute( GXv_int2) ;
      aeat_altafactura_test_impl.this.GXt_int1 = GXv_int2[0] ;
      AV8FACCOD = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8FACCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8FACCOD), 8, 0));
      AV24pfxPath = httpContext.getMessage( "D:\\\\Datamon\\\\Certificado_verifactu.pfx", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24pfxPath", AV24pfxPath);
      AV23pfxPassword = "VERI*FACTU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23pfxPassword", AV23pfxPassword);
      if ( 0 == 1 )
      {
         GXv_int3[0] = AV19StatusCode ;
         GXv_char4[0] = AV21xmlRespuesta ;
         GXv_char5[0] = AV11MessagePending ;
         new app.aeat.enviarfacturaaeat(remoteHandle, context).execute( AV8FACCOD, GXv_int3, GXv_char4, GXv_char5) ;
         aeat_altafactura_test_impl.this.AV19StatusCode = GXv_int3[0] ;
         aeat_altafactura_test_impl.this.AV21xmlRespuesta = GXv_char4[0] ;
         aeat_altafactura_test_impl.this.AV11MessagePending = GXv_char5[0] ;
         new app.aeat.aeatreportarfacturacli(remoteHandle, context).execute( AV8FACCOD) ;
      }
      GXt_char6 = AV25Station ;
      GXv_char5[0] = GXt_char6 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      aeat_altafactura_test_impl.this.GXt_char6 = GXv_char5[0] ;
      AV25Station = GXt_char6 ;
      GXv_char5[0] = AV6EmprCod ;
      GXv_char4[0] = AV26EmprNom ;
      GXv_char7[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char5, GXv_char4, GXv_char7) ;
      aeat_altafactura_test_impl.this.AV6EmprCod = GXv_char5[0] ;
      aeat_altafactura_test_impl.this.AV26EmprNom = GXv_char4[0] ;
      aeat_altafactura_test_impl.this.AV27UsurCod = GXv_char7[0] ;
   }

   public void e1229Y2( )
   {
      /* 'DoDoXMLFactura' Routine */
      returnInSub = false ;
      if ( ! (0==AV8FACCOD) )
      {
         /* Execute user subroutine: 'DOXMLFACTURA' */
         S112 ();
         if (returnInSub) return;
         AV9HashHex = AV12RegistroFacturacionAlta.toJSonString(false, true) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9HashHex", AV9HashHex);
         AV31GXV1 = 1 ;
         while ( AV31GXV1 <= AV12RegistroFacturacionAlta.getgxTv_SdtRegistroFacturacionAlta_Registro().size() )
         {
            AV14RegistroFacturacionAltaRegistro = (app.aeat.SdtRegistroFacturacionAlta_RegistroItem)((app.aeat.SdtRegistroFacturacionAlta_RegistroItem)AV12RegistroFacturacionAlta.getgxTv_SdtRegistroFacturacionAlta_Registro().elementAt(-1+AV31GXV1));
            AV9HashHex = GXutil.trim( AV14RegistroFacturacionAltaRegistro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura()) + GXutil.newLine( ) + AV9HashHex ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9HashHex", AV9HashHex);
            AV31GXV1 = (int)(AV31GXV1+1) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV12RegistroFacturacionAlta", AV12RegistroFacturacionAlta);
   }

   public void e1329Y2( )
   {
      /* 'DoDoEnviarFacturaAEAT' Routine */
      returnInSub = false ;
      AV18ResultadoEnviarFacturaAEAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18ResultadoEnviarFacturaAEAT", AV18ResultadoEnviarFacturaAEAT);
      GXv_boolean8[0] = AV10IsPending ;
      GXv_char7[0] = AV11MessagePending ;
      new app.aeat.aeat_validar_faccod(remoteHandle, context).execute( AV8FACCOD, GXv_boolean8, GXv_char7) ;
      aeat_altafactura_test_impl.this.AV10IsPending = GXv_boolean8[0] ;
      aeat_altafactura_test_impl.this.AV11MessagePending = GXv_char7[0] ;
      if ( (0==AV8FACCOD) )
      {
         AV18ResultadoEnviarFacturaAEAT = httpContext.getMessage( "?? Se requiere Codigo Factura", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18ResultadoEnviarFacturaAEAT", AV18ResultadoEnviarFacturaAEAT);
      }
      else if ( ! AV10IsPending )
      {
         AV18ResultadoEnviarFacturaAEAT = "??" + AV11MessagePending ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18ResultadoEnviarFacturaAEAT", AV18ResultadoEnviarFacturaAEAT);
      }
      else
      {
         GXv_int3[0] = AV19StatusCode ;
         GXv_char7[0] = AV21xmlRespuesta ;
         GXv_char5[0] = AV11MessagePending ;
         new app.aeat.enviarfacturaaeat(remoteHandle, context).execute( AV8FACCOD, GXv_int3, GXv_char7, GXv_char5) ;
         aeat_altafactura_test_impl.this.AV19StatusCode = GXv_int3[0] ;
         aeat_altafactura_test_impl.this.AV21xmlRespuesta = GXv_char7[0] ;
         aeat_altafactura_test_impl.this.AV11MessagePending = GXv_char5[0] ;
         AV7exito = (boolean)(((AV19StatusCode==200))) ;
         AV5IsSuccess = false ;
         if ( AV7exito )
         {
            AV16RespuestaRegistroFacturacionAlta.fromxml(AV21xmlRespuesta, null, null);
            if ( GXutil.strcmp(AV16RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Estadoregistro(), httpContext.getMessage( "Correcto", "")) == 0 )
            {
               AV5IsSuccess = true ;
               AV18ResultadoEnviarFacturaAEAT = httpContext.getMessage( "Envío aceptado. CSV: ", "") + AV16RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Csv() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18ResultadoEnviarFacturaAEAT", AV18ResultadoEnviarFacturaAEAT);
            }
            else
            {
               AV32GXV2 = 1 ;
               while ( AV32GXV2 <= AV16RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Errores().size() )
               {
                  AV17RespuestaRegistroFacturacionAltaErrores = (app.aeat.SdtErrorType)((app.aeat.SdtErrorType)AV16RespuestaRegistroFacturacionAlta.getgxTv_SdtRespuestaRegistroFacturacionAlta_Errores().elementAt(-1+AV32GXV2));
                  AV18ResultadoEnviarFacturaAEAT = httpContext.getMessage( "? Error: ", "") + AV17RespuestaRegistroFacturacionAltaErrores.getgxTv_SdtErrorType_Codigoerror() + " - " + AV17RespuestaRegistroFacturacionAltaErrores.getgxTv_SdtErrorType_Descripcionerror() + GXutil.newLine( ) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18ResultadoEnviarFacturaAEAT", AV18ResultadoEnviarFacturaAEAT);
                  AV32GXV2 = (int)(AV32GXV2+1) ;
               }
            }
         }
         else
         {
            AV18ResultadoEnviarFacturaAEAT = (!(GXutil.strcmp("", AV21xmlRespuesta)==0) ? GXutil.trim( AV21xmlRespuesta) : httpContext.getMessage( "?? Fallo técnico en la conexión o estructura del XML.", "")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ResultadoEnviarFacturaAEAT", AV18ResultadoEnviarFacturaAEAT);
         }
         httpContext.GX_msglist.addItem(httpContext.getMessage( "RegistrarAEATHistoricoCFAVEN ", "")+AV11MessagePending);
      }
      /*  Sending Event outputs  */
   }

   public void e1429Y2( )
   {
      /* 'DoRealizarAltaFActura' Routine */
      returnInSub = false ;
      GXt_char6 = AV18ResultadoEnviarFacturaAEAT ;
      GXv_char7[0] = GXt_char6 ;
      new app.aeat.run_altafactura(remoteHandle, context).execute( AV24pfxPath, AV23pfxPassword, AV15RegistroFacturacionAltaXML, GXv_char7) ;
      aeat_altafactura_test_impl.this.GXt_char6 = GXv_char7[0] ;
      AV18ResultadoEnviarFacturaAEAT = GXt_char6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18ResultadoEnviarFacturaAEAT", AV18ResultadoEnviarFacturaAEAT);
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'DOXMLFACTURA' Routine */
      returnInSub = false ;
      GXt_char6 = AV6EmprCod ;
      GXv_char7[0] = GXt_char6 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char7) ;
      aeat_altafactura_test_impl.this.GXt_char6 = GXv_char7[0] ;
      AV6EmprCod = GXt_char6 ;
      GXt_SdtRegistroFacturacionAlta9 = AV12RegistroFacturacionAlta;
      GXv_SdtRegistroFacturacionAlta10[0] = GXt_SdtRegistroFacturacionAlta9;
      new app.aeat.cfaven_alta_aeat_json(remoteHandle, context).execute( AV6EmprCod, AV8FACCOD, GXv_SdtRegistroFacturacionAlta10) ;
      GXt_SdtRegistroFacturacionAlta9 = GXv_SdtRegistroFacturacionAlta10[0] ;
      AV12RegistroFacturacionAlta = GXt_SdtRegistroFacturacionAlta9;
      AV15RegistroFacturacionAltaXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15RegistroFacturacionAltaXML", AV15RegistroFacturacionAltaXML);
      AV15RegistroFacturacionAltaXML += AV12RegistroFacturacionAlta.toxml(false, true, "RegistroFacturacionAlta", "https://www.agenciatributaria.gob.es/sif/verifactu") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15RegistroFacturacionAltaXML", AV15RegistroFacturacionAltaXML);
   }

   protected void nextLoad( )
   {
   }

   protected void e1529Y2( )
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
      pa29Y2( ) ;
      ws29Y2( ) ;
      we29Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016453998", true, true);
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
      httpContext.AddJavascriptSource("aeat/aeat_altafactura_test.js", "?202661016453998", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtndoxmlfactura_Internalname = "BTNDOXMLFACTURA" ;
      bttBtndoenviarfacturaaeat_Internalname = "BTNDOENVIARFACTURAAEAT" ;
      bttBtnrealizaraltafactura_Internalname = "BTNREALIZARALTAFACTURA" ;
      edtavFaccod_Internalname = "vFACCOD" ;
      divTable2_Internalname = "TABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavPfxpath_Internalname = "vPFXPATH" ;
      edtavPfxpassword_Internalname = "vPFXPASSWORD" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavHashhex_Internalname = "vHASHHEX" ;
      divTable5_Internalname = "TABLE5" ;
      edtavRegistrofacturacionaltaxml_Internalname = "vREGISTROFACTURACIONALTAXML" ;
      edtavResultadoenviarfacturaaeat_Internalname = "vRESULTADOENVIARFACTURAAEAT" ;
      divTable4_Internalname = "TABLE4" ;
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
      edtavResultadoenviarfacturaaeat_Enabled = 1 ;
      edtavRegistrofacturacionaltaxml_Enabled = 1 ;
      edtavHashhex_Enabled = 1 ;
      edtavPfxpassword_Jsonclick = "" ;
      edtavPfxpassword_Enabled = 1 ;
      edtavPfxpath_Jsonclick = "" ;
      edtavPfxpath_Enabled = 1 ;
      edtavFaccod_Jsonclick = "" ;
      edtavFaccod_Enabled = 1 ;
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
      setEventMetadata("'DODOXMLFACTURA'","{handler:'e1229Y2',iparms:[{av:'AV8FACCOD',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV12RegistroFacturacionAlta',fld:'vREGISTROFACTURACIONALTA',pic:''}]");
      setEventMetadata("'DODOXMLFACTURA'",",oparms:[{av:'AV9HashHex',fld:'vHASHHEX',pic:''},{av:'AV12RegistroFacturacionAlta',fld:'vREGISTROFACTURACIONALTA',pic:''},{av:'AV15RegistroFacturacionAltaXML',fld:'vREGISTROFACTURACIONALTAXML',pic:''}]}");
      setEventMetadata("'DODOENVIARFACTURAAEAT'","{handler:'e1329Y2',iparms:[{av:'AV8FACCOD',fld:'vFACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DODOENVIARFACTURAAEAT'",",oparms:[{av:'AV18ResultadoEnviarFacturaAEAT',fld:'vRESULTADOENVIARFACTURAAEAT',pic:''}]}");
      setEventMetadata("'DOREALIZARALTAFACTURA'","{handler:'e1429Y2',iparms:[{av:'AV24pfxPath',fld:'vPFXPATH',pic:''},{av:'AV23pfxPassword',fld:'vPFXPASSWORD',pic:''},{av:'AV15RegistroFacturacionAltaXML',fld:'vREGISTROFACTURACIONALTAXML',pic:''}]");
      setEventMetadata("'DOREALIZARALTAFACTURA'",",oparms:[{av:'AV18ResultadoEnviarFacturaAEAT',fld:'vRESULTADOENVIARFACTURAAEAT',pic:''}]}");
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
      AV12RegistroFacturacionAlta = new app.aeat.SdtRegistroFacturacionAlta(remoteHandle, context);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtndoxmlfactura_Jsonclick = "" ;
      bttBtndoenviarfacturaaeat_Jsonclick = "" ;
      bttBtnrealizaraltafactura_Jsonclick = "" ;
      AV24pfxPath = "" ;
      AV23pfxPassword = "" ;
      AV9HashHex = "" ;
      AV15RegistroFacturacionAltaXML = "" ;
      AV18ResultadoEnviarFacturaAEAT = "" ;
      AV30Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV20Timezones = "" ;
      GXv_int2 = new int[1] ;
      AV21xmlRespuesta = "" ;
      AV11MessagePending = "" ;
      AV25Station = "" ;
      AV6EmprCod = "" ;
      AV26EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV27UsurCod = "" ;
      AV14RegistroFacturacionAltaRegistro = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem(remoteHandle, context);
      GXv_boolean8 = new boolean[1] ;
      GXv_int3 = new long[1] ;
      GXv_char5 = new String[1] ;
      AV16RespuestaRegistroFacturacionAlta = new app.aeat.SdtRespuestaRegistroFacturacionAlta(remoteHandle, context);
      AV17RespuestaRegistroFacturacionAltaErrores = new app.aeat.SdtErrorType(remoteHandle, context);
      GXt_char6 = "" ;
      GXv_char7 = new String[1] ;
      GXt_SdtRegistroFacturacionAlta9 = new app.aeat.SdtRegistroFacturacionAlta(remoteHandle, context);
      GXv_SdtRegistroFacturacionAlta10 = new app.aeat.SdtRegistroFacturacionAlta[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV30Pgmname = "AEAT.AEAT_AltaFactura_Test" ;
      /* GeneXus formulas. */
      AV30Pgmname = "AEAT.AEAT_AltaFactura_Test" ;
      Gx_err = (short)(0) ;
      edtavHashhex_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV8FACCOD ;
   private int edtavFaccod_Enabled ;
   private int edtavPfxpath_Enabled ;
   private int edtavPfxpassword_Enabled ;
   private int edtavHashhex_Enabled ;
   private int edtavRegistrofacturacionaltaxml_Enabled ;
   private int edtavResultadoenviarfacturaaeat_Enabled ;
   private int edtavPgmname_Enabled ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int AV31GXV1 ;
   private int AV32GXV2 ;
   private int idxLst ;
   private long AV19StatusCode ;
   private long GXv_int3[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
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
   private String divTable2_Internalname ;
   private String TempTags ;
   private String bttBtndoxmlfactura_Internalname ;
   private String bttBtndoxmlfactura_Jsonclick ;
   private String bttBtndoenviarfacturaaeat_Internalname ;
   private String bttBtndoenviarfacturaaeat_Jsonclick ;
   private String bttBtnrealizaraltafactura_Internalname ;
   private String bttBtnrealizaraltafactura_Jsonclick ;
   private String edtavFaccod_Internalname ;
   private String edtavFaccod_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavPfxpath_Internalname ;
   private String edtavPfxpath_Jsonclick ;
   private String edtavPfxpassword_Internalname ;
   private String edtavPfxpassword_Jsonclick ;
   private String divTable4_Internalname ;
   private String divTable5_Internalname ;
   private String edtavHashhex_Internalname ;
   private String edtavRegistrofacturacionaltaxml_Internalname ;
   private String edtavResultadoenviarfacturaaeat_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV30Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV20Timezones ;
   private String AV25Station ;
   private String AV6EmprCod ;
   private String AV26EmprNom ;
   private String GXv_char4[] ;
   private String AV27UsurCod ;
   private String GXv_char5[] ;
   private String GXt_char6 ;
   private String GXv_char7[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV10IsPending ;
   private boolean GXv_boolean8[] ;
   private boolean AV7exito ;
   private boolean AV5IsSuccess ;
   private String AV18ResultadoEnviarFacturaAEAT ;
   private String AV21xmlRespuesta ;
   private String AV24pfxPath ;
   private String AV23pfxPassword ;
   private String AV9HashHex ;
   private String AV15RegistroFacturacionAltaXML ;
   private String AV11MessagePending ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.aeat.SdtRegistroFacturacionAlta AV12RegistroFacturacionAlta ;
   private app.aeat.SdtRegistroFacturacionAlta GXt_SdtRegistroFacturacionAlta9 ;
   private app.aeat.SdtRegistroFacturacionAlta GXv_SdtRegistroFacturacionAlta10[] ;
   private app.aeat.SdtRegistroFacturacionAlta_RegistroItem AV14RegistroFacturacionAltaRegistro ;
   private app.aeat.SdtRespuestaRegistroFacturacionAlta AV16RespuestaRegistroFacturacionAlta ;
   private app.aeat.SdtErrorType AV17RespuestaRegistroFacturacionAltaErrores ;
}

