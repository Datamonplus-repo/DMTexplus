package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class color_test_impl extends GXWebPanel
{
   public color_test_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public color_test_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( color_test_impl.class ));
   }

   public color_test_impl( int remoteHandle ,
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
         pa1WQ2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1WQ2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we1WQ2( ) ;
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
      httpContext.writeValue( httpContext.getMessage( "Color_Test", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/ColoresRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/ColoresRender.js", "", false, true);
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.color_test", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vOK", AV23OK);
   }

   public void renderHtmlCloseForm1WQ2( )
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
      return "Color_Test" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Color_Test", "") ;
   }

   public void wb1WQ0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 30, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavInputcolor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInputcolor_Internalname, httpContext.getMessage( "Seleccionar color", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInputcolor_Internalname, AV15InputColor, GXutil.rtrim( localUtil.format( AV15InputColor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,8);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInputcolor_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavInputcolor_Enabled, 0, "text", "", 25, "%", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_Color_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHex_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHex_Internalname, httpContext.getMessage( "Hex", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHex_Internalname, AV13Hex, GXutil.rtrim( localUtil.format( AV13Hex, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,13);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHex_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavHex_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_Color_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRgb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRgb_Internalname, httpContext.getMessage( "RGB", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRgb_Internalname, AV14RGB, GXutil.rtrim( localUtil.format( AV14RGB, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRgb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavRgb_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_Color_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDecimal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDecimal_Internalname, httpContext.getMessage( "Decimal", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDecimal_Internalname, GXutil.ltrim( localUtil.ntoc( AV25Decimal, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDecimal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25Decimal), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25Decimal), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDecimal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavDecimal_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_Color_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDecimaltohex_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDecimaltohex_Internalname, httpContext.getMessage( "Decimal To Hex", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDecimaltohex_Internalname, AV26DecimalToHex, GXutil.rtrim( localUtil.format( AV26DecimalToHex, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDecimaltohex_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavDecimaltohex_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_Color_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRgbtodecimal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRgbtodecimal_Internalname, httpContext.getMessage( "RGB To Decimal en GX9", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRgbtodecimal_Internalname, GXutil.ltrim( localUtil.ntoc( AV34RGBToDecimal, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRgbtodecimal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34RGBToDecimal), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV34RGBToDecimal), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRgbtodecimal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavRgbtodecimal_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_Color_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavInputcolor2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInputcolor2_Internalname, httpContext.getMessage( "Seleccionar color", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInputcolor2_Internalname, AV27InputColor2, GXutil.rtrim( localUtil.format( AV27InputColor2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInputcolor2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavInputcolor2_Enabled, 0, "text", "", 25, "%", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_Color_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucColores1.render(context, "colores", Colores1_Internalname, "COLORES1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpGroup1_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_Color_Test.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGroup1table_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDecimalgrabar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDecimalgrabar_Internalname, httpContext.getMessage( "Decimal Grabar", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDecimalgrabar_Internalname, GXutil.ltrim( localUtil.ntoc( AV29DecimalGrabar, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDecimalgrabar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29DecimalGrabar), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV29DecimalGrabar), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDecimalgrabar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavDecimalgrabar_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_Color_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDecimalleer_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDecimalleer_Internalname, httpContext.getMessage( "Decimal Leer", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDecimalleer_Internalname, GXutil.ltrim( localUtil.ntoc( AV30DecimalLeer, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDecimalleer_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30DecimalLeer), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30DecimalLeer), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDecimalleer_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavDecimalleer_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_Color_Test.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucColores2.render(context, "colores", Colores2_Internalname, "COLORES2Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1WQ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Color_Test", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WQ0( ) ;
   }

   public void ws1WQ2( )
   {
      start1WQ2( ) ;
      evt1WQ2( ) ;
   }

   public void evt1WQ2( )
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
                        e111WQ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VINPUTCOLOR.CONTROLVALUECHANGED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e121WQ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VINPUTCOLOR2.CONTROLVALUECHANGED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e131WQ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e141WQ2 ();
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

   public void we1WQ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1WQ2( ) ;
         }
      }
   }

   public void pa1WQ2( )
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
            GX_FocusControl = edtavInputcolor_Internalname ;
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
      rf1WQ2( ) ;
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
      edtavHex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHex_Enabled), 5, 0), true);
      edtavRgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRgb_Enabled), 5, 0), true);
      edtavDecimal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDecimal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDecimal_Enabled), 5, 0), true);
      edtavDecimaltohex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDecimaltohex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDecimaltohex_Enabled), 5, 0), true);
      edtavRgbtodecimal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRgbtodecimal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRgbtodecimal_Enabled), 5, 0), true);
      edtavDecimalgrabar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDecimalgrabar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDecimalgrabar_Enabled), 5, 0), true);
      edtavDecimalleer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDecimalleer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDecimalleer_Enabled), 5, 0), true);
   }

   public void rf1WQ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e141WQ2 ();
         wb1WQ0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1WQ2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavHex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHex_Enabled), 5, 0), true);
      edtavRgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRgb_Enabled), 5, 0), true);
      edtavDecimal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDecimal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDecimal_Enabled), 5, 0), true);
      edtavDecimaltohex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDecimaltohex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDecimaltohex_Enabled), 5, 0), true);
      edtavRgbtodecimal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRgbtodecimal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRgbtodecimal_Enabled), 5, 0), true);
      edtavDecimalgrabar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDecimalgrabar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDecimalgrabar_Enabled), 5, 0), true);
      edtavDecimalleer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDecimalleer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDecimalleer_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WQ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111WQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
      e111WQ2 ();
      if (returnInSub) return;
   }

   public void e111WQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV15InputColor = "#ff0000" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15InputColor", AV15InputColor);
      AV27InputColor2 = "#ff0000" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27InputColor2", AV27InputColor2);
      AV13Hex = AV15InputColor ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Hex", AV13Hex);
      /* Execute user subroutine: 'CALCULAR' */
      S112 ();
      if (returnInSub) return;
      this.executeUsercontrolMethod("", false, "COLORES1Container", "ChanceInput", "", new Object[] {edtavInputcolor_Internalname,httpContext.getMessage( "color", "")});
      this.executeUsercontrolMethod("", false, "COLORES2Container", "ChanceInput", "", new Object[] {edtavInputcolor2_Internalname,httpContext.getMessage( "color", "")});
   }

   public void e121WQ2( )
   {
      /* Inputcolor_Controlvaluechanged Routine */
      returnInSub = false ;
      AV13Hex = AV15InputColor ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Hex", AV13Hex);
      /* Execute user subroutine: 'CALCULAR' */
      S112 ();
      if (returnInSub) return;
      AV27InputColor2 = "#" + AV26DecimalToHex ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27InputColor2", AV27InputColor2);
      /*  Sending Event outputs  */
   }

   public void e131WQ2( )
   {
      /* Inputcolor2_Controlvaluechanged Routine */
      returnInSub = false ;
      AV13Hex = AV27InputColor2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Hex", AV13Hex);
      /* Execute user subroutine: 'CALCULAR' */
      S112 ();
      if (returnInSub) return;
      AV15InputColor = "#" + AV26DecimalToHex ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15InputColor", AV15InputColor);
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'CALCULAR' Routine */
      returnInSub = false ;
      GXv_char1[0] = AV14RGB ;
      GXv_objcol_SdtMessages_Message2[0] = AV22Messages ;
      GXv_boolean3[0] = AV23OK ;
      new app.core.hextorgb(remoteHandle, context).execute( AV13Hex, GXv_char1, GXv_objcol_SdtMessages_Message2, GXv_boolean3) ;
      color_test_impl.this.AV14RGB = GXv_char1[0] ;
      AV22Messages = GXv_objcol_SdtMessages_Message2[0] ;
      color_test_impl.this.AV23OK = GXv_boolean3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14RGB", AV14RGB);
      httpContext.ajax_rsp_assign_attri("", false, "AV23OK", AV23OK);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "HexToRGB ", "")+AV22Messages.toJSonString(false));
      GXv_int4[0] = AV25Decimal ;
      GXv_objcol_SdtMessages_Message2[0] = AV22Messages ;
      GXv_boolean3[0] = AV23OK ;
      new app.core.hextodecimal(remoteHandle, context).execute( AV13Hex, GXv_int4, GXv_objcol_SdtMessages_Message2, GXv_boolean3) ;
      color_test_impl.this.AV25Decimal = GXv_int4[0] ;
      AV22Messages = GXv_objcol_SdtMessages_Message2[0] ;
      color_test_impl.this.AV23OK = GXv_boolean3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Decimal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Decimal), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV23OK", AV23OK);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "HexToDecimal  ", "")+AV22Messages.toJSonString(false));
      GXv_char1[0] = AV26DecimalToHex ;
      GXv_objcol_SdtMessages_Message2[0] = AV22Messages ;
      GXv_boolean3[0] = AV23OK ;
      new app.core.decimaltohex(remoteHandle, context).execute( AV25Decimal, GXv_char1, GXv_objcol_SdtMessages_Message2, GXv_boolean3) ;
      color_test_impl.this.AV26DecimalToHex = GXv_char1[0] ;
      AV22Messages = GXv_objcol_SdtMessages_Message2[0] ;
      color_test_impl.this.AV23OK = GXv_boolean3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26DecimalToHex", AV26DecimalToHex);
      httpContext.ajax_rsp_assign_attri("", false, "AV23OK", AV23OK);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "DecimalToHex  ", "")+AV22Messages.toJSonString(false));
      GXv_int4[0] = AV34RGBToDecimal ;
      GXv_objcol_SdtMessages_Message2[0] = AV22Messages ;
      GXv_boolean3[0] = AV23OK ;
      new app.core.rgbtodecimal(remoteHandle, context).execute( AV14RGB, GXv_int4, GXv_objcol_SdtMessages_Message2, GXv_boolean3) ;
      color_test_impl.this.AV34RGBToDecimal = GXv_int4[0] ;
      AV22Messages = GXv_objcol_SdtMessages_Message2[0] ;
      color_test_impl.this.AV23OK = GXv_boolean3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34RGBToDecimal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34RGBToDecimal), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV23OK", AV23OK);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "RGBToDecimal ", "")+AV22Messages.toJSonString(false));
      AV29DecimalGrabar = AV34RGBToDecimal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29DecimalGrabar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DecimalGrabar), 10, 0));
      GXv_char1[0] = AV32HexLeer ;
      GXv_objcol_SdtMessages_Message2[0] = AV22Messages ;
      GXv_boolean3[0] = AV23OK ;
      new app.core.decimaltohex(remoteHandle, context).execute( AV29DecimalGrabar, GXv_char1, GXv_objcol_SdtMessages_Message2, GXv_boolean3) ;
      color_test_impl.this.AV32HexLeer = GXv_char1[0] ;
      AV22Messages = GXv_objcol_SdtMessages_Message2[0] ;
      color_test_impl.this.AV23OK = GXv_boolean3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OK", AV23OK);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Leer DecimalToHex ", "")+AV22Messages.toJSonString(false));
      GXv_char1[0] = AV33RGBLeer ;
      GXv_objcol_SdtMessages_Message2[0] = AV22Messages ;
      GXv_boolean3[0] = AV23OK ;
      new app.core.hextorgb(remoteHandle, context).execute( AV32HexLeer, GXv_char1, GXv_objcol_SdtMessages_Message2, GXv_boolean3) ;
      color_test_impl.this.AV33RGBLeer = GXv_char1[0] ;
      AV22Messages = GXv_objcol_SdtMessages_Message2[0] ;
      color_test_impl.this.AV23OK = GXv_boolean3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OK", AV23OK);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Leer HexToRGB ", "")+AV22Messages.toJSonString(false));
      GXv_char1[0] = AV28BGR ;
      GXv_objcol_SdtMessages_Message2[0] = AV22Messages ;
      GXv_boolean3[0] = AV23OK ;
      new app.core.rgbtobgr(remoteHandle, context).execute( AV33RGBLeer, GXv_char1, GXv_objcol_SdtMessages_Message2, GXv_boolean3) ;
      color_test_impl.this.AV28BGR = GXv_char1[0] ;
      AV22Messages = GXv_objcol_SdtMessages_Message2[0] ;
      color_test_impl.this.AV23OK = GXv_boolean3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OK", AV23OK);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Leer RGBToBGR ", "")+AV22Messages.toJSonString(false));
      GXv_int4[0] = AV30DecimalLeer ;
      GXv_objcol_SdtMessages_Message2[0] = AV22Messages ;
      GXv_boolean3[0] = AV23OK ;
      new app.core.rgbtodecimal(remoteHandle, context).execute( AV28BGR, GXv_int4, GXv_objcol_SdtMessages_Message2, GXv_boolean3) ;
      color_test_impl.this.AV30DecimalLeer = GXv_int4[0] ;
      AV22Messages = GXv_objcol_SdtMessages_Message2[0] ;
      color_test_impl.this.AV23OK = GXv_boolean3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30DecimalLeer", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30DecimalLeer), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV23OK", AV23OK);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Leer RGBToDecimal ", "")+AV22Messages.toJSonString(false));
   }

   protected void nextLoad( )
   {
   }

   protected void e141WQ2( )
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
      pa1WQ2( ) ;
      ws1WQ2( ) ;
      we1WQ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612519171445", true, true);
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
      httpContext.AddJavascriptSource("color_test.js", "?202612519171445", false, true);
      httpContext.AddJavascriptSource("UserControls/ColoresRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/ColoresRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavInputcolor_Internalname = "vINPUTCOLOR" ;
      edtavHex_Internalname = "vHEX" ;
      edtavRgb_Internalname = "vRGB" ;
      edtavDecimal_Internalname = "vDECIMAL" ;
      edtavDecimaltohex_Internalname = "vDECIMALTOHEX" ;
      edtavRgbtodecimal_Internalname = "vRGBTODECIMAL" ;
      edtavInputcolor2_Internalname = "vINPUTCOLOR2" ;
      Colores1_Internalname = "COLORES1" ;
      edtavDecimalgrabar_Internalname = "vDECIMALGRABAR" ;
      edtavDecimalleer_Internalname = "vDECIMALLEER" ;
      divGroup1table_Internalname = "GROUP1TABLE" ;
      grpGroup1_Internalname = "GROUP1" ;
      Colores2_Internalname = "COLORES2" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("Carmine");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavDecimalleer_Jsonclick = "" ;
      edtavDecimalleer_Enabled = 1 ;
      edtavDecimalgrabar_Jsonclick = "" ;
      edtavDecimalgrabar_Enabled = 1 ;
      edtavInputcolor2_Jsonclick = "" ;
      edtavInputcolor2_Enabled = 1 ;
      edtavRgbtodecimal_Jsonclick = "" ;
      edtavRgbtodecimal_Enabled = 1 ;
      edtavDecimaltohex_Jsonclick = "" ;
      edtavDecimaltohex_Enabled = 1 ;
      edtavDecimal_Jsonclick = "" ;
      edtavDecimal_Enabled = 1 ;
      edtavRgb_Jsonclick = "" ;
      edtavRgb_Enabled = 1 ;
      edtavHex_Jsonclick = "" ;
      edtavHex_Enabled = 1 ;
      edtavInputcolor_Jsonclick = "" ;
      edtavInputcolor_Enabled = 1 ;
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
      setEventMetadata("VINPUTCOLOR.CONTROLVALUECHANGED","{handler:'e121WQ2',iparms:[{av:'AV15InputColor',fld:'vINPUTCOLOR',pic:''},{av:'AV26DecimalToHex',fld:'vDECIMALTOHEX',pic:''},{av:'AV13Hex',fld:'vHEX',pic:''},{av:'AV23OK',fld:'vOK',pic:''}]");
      setEventMetadata("VINPUTCOLOR.CONTROLVALUECHANGED",",oparms:[{av:'AV13Hex',fld:'vHEX',pic:''},{av:'AV27InputColor2',fld:'vINPUTCOLOR2',pic:''},{av:'AV23OK',fld:'vOK',pic:''},{av:'AV14RGB',fld:'vRGB',pic:''},{av:'AV25Decimal',fld:'vDECIMAL',pic:'ZZZZZZZZZ9'},{av:'AV26DecimalToHex',fld:'vDECIMALTOHEX',pic:''},{av:'AV34RGBToDecimal',fld:'vRGBTODECIMAL',pic:'ZZZZZZZZZ9'},{av:'AV29DecimalGrabar',fld:'vDECIMALGRABAR',pic:'ZZZZZZZZZ9'},{av:'AV30DecimalLeer',fld:'vDECIMALLEER',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VINPUTCOLOR2.CONTROLVALUECHANGED","{handler:'e131WQ2',iparms:[{av:'AV27InputColor2',fld:'vINPUTCOLOR2',pic:''},{av:'AV26DecimalToHex',fld:'vDECIMALTOHEX',pic:''},{av:'AV13Hex',fld:'vHEX',pic:''},{av:'AV23OK',fld:'vOK',pic:''}]");
      setEventMetadata("VINPUTCOLOR2.CONTROLVALUECHANGED",",oparms:[{av:'AV13Hex',fld:'vHEX',pic:''},{av:'AV15InputColor',fld:'vINPUTCOLOR',pic:''},{av:'AV23OK',fld:'vOK',pic:''},{av:'AV14RGB',fld:'vRGB',pic:''},{av:'AV25Decimal',fld:'vDECIMAL',pic:'ZZZZZZZZZ9'},{av:'AV26DecimalToHex',fld:'vDECIMALTOHEX',pic:''},{av:'AV34RGBToDecimal',fld:'vRGBTODECIMAL',pic:'ZZZZZZZZZ9'},{av:'AV29DecimalGrabar',fld:'vDECIMALGRABAR',pic:'ZZZZZZZZZ9'},{av:'AV30DecimalLeer',fld:'vDECIMALLEER',pic:'ZZZZZZZZZ9'}]}");
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
      TempTags = "" ;
      AV15InputColor = "" ;
      AV13Hex = "" ;
      AV14RGB = "" ;
      AV26DecimalToHex = "" ;
      AV27InputColor2 = "" ;
      ucColores1 = new com.genexus.webpanels.GXUserControl();
      ucColores2 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV22Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV32HexLeer = "" ;
      AV33RGBLeer = "" ;
      AV28BGR = "" ;
      GXv_char1 = new String[1] ;
      GXv_int4 = new long[1] ;
      GXv_objcol_SdtMessages_Message2 = new GXBaseCollection[1] ;
      GXv_boolean3 = new boolean[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavHex_Enabled = 0 ;
      edtavRgb_Enabled = 0 ;
      edtavDecimal_Enabled = 0 ;
      edtavDecimaltohex_Enabled = 0 ;
      edtavRgbtodecimal_Enabled = 0 ;
      edtavDecimalgrabar_Enabled = 0 ;
      edtavDecimalleer_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavInputcolor_Enabled ;
   private int edtavHex_Enabled ;
   private int edtavRgb_Enabled ;
   private int edtavDecimal_Enabled ;
   private int edtavDecimaltohex_Enabled ;
   private int edtavRgbtodecimal_Enabled ;
   private int edtavInputcolor2_Enabled ;
   private int edtavDecimalgrabar_Enabled ;
   private int edtavDecimalleer_Enabled ;
   private int idxLst ;
   private long AV25Decimal ;
   private long AV34RGBToDecimal ;
   private long AV29DecimalGrabar ;
   private long AV30DecimalLeer ;
   private long GXv_int4[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String edtavInputcolor_Internalname ;
   private String TempTags ;
   private String edtavInputcolor_Jsonclick ;
   private String edtavHex_Internalname ;
   private String edtavHex_Jsonclick ;
   private String edtavRgb_Internalname ;
   private String edtavRgb_Jsonclick ;
   private String edtavDecimal_Internalname ;
   private String edtavDecimal_Jsonclick ;
   private String edtavDecimaltohex_Internalname ;
   private String edtavDecimaltohex_Jsonclick ;
   private String edtavRgbtodecimal_Internalname ;
   private String edtavRgbtodecimal_Jsonclick ;
   private String edtavInputcolor2_Internalname ;
   private String edtavInputcolor2_Jsonclick ;
   private String Colores1_Internalname ;
   private String grpGroup1_Internalname ;
   private String divGroup1table_Internalname ;
   private String edtavDecimalgrabar_Internalname ;
   private String edtavDecimalgrabar_Jsonclick ;
   private String edtavDecimalleer_Internalname ;
   private String edtavDecimalleer_Jsonclick ;
   private String Colores2_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXv_char1[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV23OK ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean GXv_boolean3[] ;
   private String AV15InputColor ;
   private String AV13Hex ;
   private String AV14RGB ;
   private String AV26DecimalToHex ;
   private String AV27InputColor2 ;
   private String AV32HexLeer ;
   private String AV33RGBLeer ;
   private String AV28BGR ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucColores1 ;
   private com.genexus.webpanels.GXUserControl ucColores2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV22Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message2[] ;
}

