package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class logindatamon_impl extends GXWebPanel
{
   public logindatamon_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public logindatamon_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( logindatamon_impl.class ));
   }

   public logindatamon_impl( int remoteHandle ,
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
         pa27Y2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws27Y2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we27Y2( ) ;
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
      httpContext.writeValue( httpContext.getMessage( "Login Datamon", "")) ;
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal FormLogin_BackgroundImage01\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormLogin_BackgroundImage01\" data-gx-class=\"form-horizontal FormLogin_BackgroundImage01\" novalidate action=\""+formatLink("app.logindatamon", new String[] {}, new String[] {}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal FormLogin_BackgroundImage01", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15ParametroEmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURPWD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5UsurPwd, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTAUTENTICACION", AV17SdtAutenticacion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTAUTENTICACION", AV17SdtAutenticacion);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROEMPRCOD", GXutil.rtrim( AV15ParametroEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15ParametroEmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vWWPCONTEXT", AV24WWPContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vWWPCONTEXT", AV24WWPContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURPWD", GXutil.rtrim( AV5UsurPwd));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURPWD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5UsurPwd, "@!"))));
   }

   public void renderHtmlCloseForm27Y2( )
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
      return "LoginDatamon" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Login Datamon", "") ;
   }

   public void wb27Y0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "Table100x100H", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginLoginImageLeft", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellPaddingLeft30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablelogin_Internalname, 1, 0, "px", 0, "px", "TableLoginWithLeftImage", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgLogodmplus_gximage, "")==0) ? "GX_Image_LogoDMPlus_Class" : "GX_Image_"+imgLogodmplus_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "926e7d79-b91e-4f45-9010-835ee82c5865", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgLogodmplus_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_LoginDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblInformationversion_Internalname, lblInformationversion_Caption, "", "", lblInformationversion_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataDescriptionLoginCenter", 0, "", 1, 1, 0, (short)(0), "HLP_LoginDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledatos_Internalname, divTabledatos_Visible, 0, "px", 0, "px", "TableMargin15LR", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSignin_Internalname, lblSignin_Caption, "", "", lblSignin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockTitleMaster", 0, "", 1, 1, 0, (short)(0), "HLP_LoginDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSecemprcod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeTitleBaseColorLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSecemprcod_Internalname, AV18SecEmprCod, GXutil.rtrim( localUtil.format( AV18SecEmprCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "Empresa", ""), edtavSecemprcod_Jsonclick, 0, "AttributeTitleBaseColor", "", "", "", "", edtavSecemprcod_Visible, edtavSecemprcod_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LoginDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSecusername_Internalname, httpContext.getMessage( "Sec User Name", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSecusername_Internalname, AV19SecUserName, GXutil.rtrim( localUtil.format( AV19SecUserName, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "Usuario", ""), edtavSecusername_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSecusername_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LoginDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSecuserpassword_Internalname, httpContext.getMessage( "Contraseña", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSecuserpassword_Internalname, AV20SecUserPassword, GXutil.rtrim( localUtil.format( AV20SecUserPassword, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\""+" "+"data-gx-password-reveal"+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "Contraseña", ""), edtavSecuserpassword_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSecuserpassword_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_LoginDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellLogin CellPaddingLogin CellMarginTop", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "WWP_GAM_Login", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtnenter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LoginDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellLogin CellPaddingLogin", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblForgotpassword_Internalname, httpContext.getMessage( "WWP_GAM_ForgotPassword", ""), "", "", lblForgotpassword_Jsonclick, "'"+""+"'"+",false,"+"'"+"e1127y1_client"+"'", "", "DataDescriptionLoginCenter", 7, "", 1, 1, 0, (short)(1), "HLP_LoginDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVersion_Internalname, httpContext.getMessage( "Version", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVersion_Internalname, AV22Version, GXutil.rtrim( localUtil.format( AV22Version, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVersion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVersion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LoginDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop CellPaddingLeft30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableloginerror_Internalname, divTableloginerror_Visible, 0, "px", 0, "px", "TableLoginWithLeftImageError", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV29Pgmname), GXutil.rtrim( localUtil.format( AV29Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 30, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LoginDatamon.htm");
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

   public void start27Y2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Login Datamon", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup27Y0( ) ;
   }

   public void ws27Y2( )
   {
      start27Y2( ) ;
      evt27Y2( ) ;
   }

   public void evt27Y2( )
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
                        e1227Y2 ();
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
                              e1327Y2 ();
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e1427Y2 ();
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

   public void we27Y2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm27Y2( ) ;
         }
      }
   }

   public void pa27Y2( )
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
            GX_FocusControl = edtavSecemprcod_Internalname ;
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
      rf27Y2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV29Pgmname = "LoginDatamon" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      Gx_err = (short)(0) ;
      edtavSecemprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSecemprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSecemprcod_Enabled), 5, 0), true);
      edtavVersion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVersion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVersion_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27Y2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1427Y2 ();
         wb27Y0( ) ;
      }
   }

   public void send_integrity_lvl_hashes27Y2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROEMPRCOD", GXutil.rtrim( AV15ParametroEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15ParametroEmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURPWD", GXutil.rtrim( AV5UsurPwd));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURPWD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5UsurPwd, "@!"))));
   }

   public void before_start_formulas( )
   {
      AV29Pgmname = "LoginDatamon" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      Gx_err = (short)(0) ;
      edtavSecemprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSecemprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSecemprcod_Enabled), 5, 0), true);
      edtavVersion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVersion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVersion_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup27Y0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1227Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         /* Read variables values. */
         AV18SecEmprCod = httpContext.cgiGet( edtavSecemprcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18SecEmprCod", AV18SecEmprCod);
         AV19SecUserName = httpContext.cgiGet( edtavSecusername_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19SecUserName", AV19SecUserName);
         AV20SecUserPassword = httpContext.cgiGet( edtavSecuserpassword_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20SecUserPassword", AV20SecUserPassword);
         AV22Version = httpContext.cgiGet( edtavVersion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Version", AV22Version);
         AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
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
      e1227Y2 ();
      if (returnInSub) return;
   }

   public void e1227Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV23WebSession.clear();
      if ( 1 == 2 )
      {
         GXt_char1 = AV21Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         logindatamon_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Station = GXt_char1 ;
         GXv_char2[0] = AV9EmprCod ;
         GXv_char3[0] = AV25EmprNom ;
         GXv_char4[0] = AV26UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char2, GXv_char3, GXv_char4) ;
         logindatamon_impl.this.AV9EmprCod = GXv_char2[0] ;
         logindatamon_impl.this.AV25EmprNom = GXv_char3[0] ;
         logindatamon_impl.this.AV26UsurCod = GXv_char4[0] ;
      }
      AV15ParametroEmprCod = "001" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ParametroEmprCod", AV15ParametroEmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15ParametroEmprCod, "@!"))));
      AV7ContCod = httpContext.getMessage( "VERSEM", "") ;
      AV22Version = "." ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Version", AV22Version);
      if ( (GXutil.strcmp("", AV22Version)==0) )
      {
         GXt_int5 = AV8ContVal2 ;
         GXv_int6[0] = GXt_int5 ;
         new app.obtenercontval2(remoteHandle, context).execute( AV15ParametroEmprCod, AV7ContCod, GXv_int6) ;
         logindatamon_impl.this.GXt_int5 = GXv_int6[0] ;
         AV8ContVal2 = GXt_int5 ;
         lblInformationversion_Caption = GXutil.format( httpContext.getMessage( "Versión : %1, está desactualizada, Por favor contactar a soporte aplicaciones", ""), GXutil.str( AV8ContVal2, 10, 0), "", "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblInformationversion_Internalname, "Caption", lblInformationversion_Caption, true);
         divTabledatos_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTabledatos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledatos_Visible), 5, 0), true);
      }
      else
      {
         divTableloginerror_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTableloginerror_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableloginerror_Visible), 5, 0), true);
         GXt_boolean7 = AV11EsMultiEmpresa ;
         GXv_boolean8[0] = GXt_boolean7 ;
         new app.determinarmultiempresa(remoteHandle, context).execute( GXv_boolean8) ;
         logindatamon_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
         AV11EsMultiEmpresa = GXt_boolean7 ;
         GXt_char1 = AV18SecEmprCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.obtenerempresa(remoteHandle, context).execute( GXv_char4) ;
         logindatamon_impl.this.GXt_char1 = GXv_char4[0] ;
         AV18SecEmprCod = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18SecEmprCod", AV18SecEmprCod);
         if ( (GXutil.strcmp("", AV18SecEmprCod)==0) )
         {
            divTableloginerror_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, divTableloginerror_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableloginerror_Visible), 5, 0), true);
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Sin datos de empresa, por favor contactar a soporte de aplicaciones", ""));
            bttBtnenter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Visible), 5, 0), true);
         }
         if ( ! AV11EsMultiEmpresa )
         {
            GXt_char1 = "" ;
            GXv_char4[0] = AV18SecEmprCod ;
            GXv_char3[0] = GXt_char1 ;
            new app.pemprnom(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
            logindatamon_impl.this.AV18SecEmprCod = GXv_char4[0] ;
            logindatamon_impl.this.GXt_char1 = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18SecEmprCod", AV18SecEmprCod);
            lblSignin_Caption = GXt_char1 ;
            httpContext.ajax_rsp_assign_prop("", false, lblSignin_Internalname, "Caption", lblSignin_Caption, true);
            edtavSecemprcod_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavSecemprcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSecemprcod_Visible), 5, 0), true);
         }
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1327Y2 ();
      if (returnInSub) return;
   }

   public void e1327Y2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      divTableloginerror_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, divTableloginerror_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableloginerror_Visible), 5, 0), true);
      if ( (GXutil.strcmp("", AV18SecEmprCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere seleccionar empresa", ""));
         GX_FocusControl = edtavSecemprcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( (GXutil.strcmp("", AV19SecUserName)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere usuario", ""));
         GX_FocusControl = edtavSecusername_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( (GXutil.strcmp("", AV20SecUserPassword)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere contraseña", ""));
         GX_FocusControl = edtavSecuserpassword_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV17SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena02( com.genexus.util.Encryption.getNewKey( ) );
         AV17SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena03( httpContext.encrypt64( AV19SecUserName, AV17SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) );
         AV17SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena01( httpContext.encrypt64( AV20SecUserPassword, AV17SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) );
         AV17SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena04( httpContext.encrypt64( AV18SecEmprCod, AV17SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) );
         GXt_boolean7 = AV13LogInSuccessful ;
         GXv_boolean8[0] = GXt_boolean7 ;
         new app.wwpbaseobjects.validarautenticacion(remoteHandle, context).execute( AV17SdtAutenticacion.toJSonString(false, true), GXv_boolean8) ;
         logindatamon_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
         AV13LogInSuccessful = GXt_boolean7 ;
         AV16Progress.setgxTv_SdtProgress_Type( (byte)(1) );
         AV16Progress.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
         AV16Progress.setgxTv_SdtProgress_Value( 55 );
         AV16Progress.showwithtitle(httpContext.getMessage( "Validando sesión", ""));
         AV16Progress.show();
         if ( AV13LogInSuccessful )
         {
            AV24WWPContext.setgxTv_SdtWWPContext_Emprcod( AV15ParametroEmprCod );
            AV24WWPContext.setgxTv_SdtWWPContext_Usurcod( AV19SecUserName );
            AV24WWPContext.setgxTv_SdtWWPContext_Username( AV19SecUserName );
            new app.wwpbaseobjects.setwwpcontext(remoteHandle, context).execute( AV24WWPContext) ;
            AV16Progress.setgxTv_SdtProgress_Value( 85 );
            AV23WebSession.setValue("TexplusNET_Autentication", AV17SdtAutenticacion.toJSonString(false, true));
            AV21Station = httpContext.getMessage( "NE", "") + AV19SecUserName ;
            GXv_char4[0] = AV21Station ;
            GXv_char3[0] = AV18SecEmprCod ;
            new app.pusuemp(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
            logindatamon_impl.this.AV21Station = GXv_char4[0] ;
            logindatamon_impl.this.AV18SecEmprCod = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18SecEmprCod", AV18SecEmprCod);
            AV16Progress.setgxTv_SdtProgress_Value( 100 );
            AV16Progress.hide();
            if ( GXutil.strcmp(AV5UsurPwd, httpContext.getMessage( "DOLLY", "")) == 0 )
            {
            }
            GXt_int9 = AV10Error ;
            GXv_char4[0] = "Home" ;
            GXv_int10[0] = GXt_int9 ;
            new app.webplicrnd(remoteHandle, context).execute( GXv_char4, GXv_int10) ;
            logindatamon_impl.this.GXt_int9 = GXv_int10[0] ;
            AV10Error = GXt_int9 ;
            if ( AV10Error == 1 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Situación con Licencia por atender, contactar a Soporte Aplicaciones", ""));
               AV23WebSession.remove("TexplusNET_Autentication");
            }
            else
            {
               callWebObject(formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {}) );
               httpContext.wjLocDisableFrm = (byte)(1) ;
            }
         }
         else
         {
            AV16Progress.setgxTv_SdtProgress_Value( 100 );
            AV16Progress.hide();
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Revisar Usuario/Contraseña", ""));
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Si ha realizado cambio de contraseña. Verique su correo!", ""));
            GX_FocusControl = edtavSecuserpassword_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17SdtAutenticacion", AV17SdtAutenticacion);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV16Progress", AV16Progress);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24WWPContext", AV24WWPContext);
   }

   protected void nextLoad( )
   {
   }

   protected void e1427Y2( )
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
      pa27Y2( ) ;
      ws27Y2( ) ;
      we27Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116145693", true, true);
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
      httpContext.AddJavascriptSource("logindatamon.js", "?202682116145693", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgLogodmplus_Internalname = "LOGODMPLUS" ;
      lblInformationversion_Internalname = "INFORMATIONVERSION" ;
      lblSignin_Internalname = "SIGNIN" ;
      edtavSecemprcod_Internalname = "vSECEMPRCOD" ;
      edtavSecusername_Internalname = "vSECUSERNAME" ;
      edtavSecuserpassword_Internalname = "vSECUSERPASSWORD" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      lblForgotpassword_Internalname = "FORGOTPASSWORD" ;
      edtavVersion_Internalname = "vVERSION" ;
      divTabledatos_Internalname = "TABLEDATOS" ;
      divTablelogin_Internalname = "TABLELOGIN" ;
      divTableloginerror_Internalname = "TABLELOGINERROR" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
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
      divTableloginerror_Visible = 1 ;
      edtavVersion_Jsonclick = "" ;
      edtavVersion_Enabled = 1 ;
      bttBtnenter_Visible = 1 ;
      edtavSecuserpassword_Jsonclick = "" ;
      edtavSecuserpassword_Enabled = 1 ;
      edtavSecusername_Jsonclick = "" ;
      edtavSecusername_Enabled = 1 ;
      edtavSecemprcod_Jsonclick = "" ;
      edtavSecemprcod_Enabled = 1 ;
      edtavSecemprcod_Visible = 1 ;
      lblSignin_Caption = httpContext.getMessage( "Registrarse", "") ;
      divTabledatos_Visible = 1 ;
      lblInformationversion_Caption = httpContext.getMessage( " Información Version", "") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV15ParametroEmprCod',fld:'vPARAMETROEMPRCOD',pic:'@!',hsh:true},{av:'AV5UsurPwd',fld:'vUSURPWD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e1327Y2',iparms:[{av:'AV18SecEmprCod',fld:'vSECEMPRCOD',pic:''},{av:'AV19SecUserName',fld:'vSECUSERNAME',pic:''},{av:'AV20SecUserPassword',fld:'vSECUSERPASSWORD',pic:''},{av:'AV17SdtAutenticacion',fld:'vSDTAUTENTICACION',pic:''},{av:'AV15ParametroEmprCod',fld:'vPARAMETROEMPRCOD',pic:'@!',hsh:true},{av:'AV24WWPContext',fld:'vWWPCONTEXT',pic:''},{av:'AV5UsurPwd',fld:'vUSURPWD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'divTableloginerror_Visible',ctrl:'TABLELOGINERROR',prop:'Visible'},{av:'AV17SdtAutenticacion',fld:'vSDTAUTENTICACION',pic:''},{av:'AV24WWPContext',fld:'vWWPCONTEXT',pic:''},{av:'AV18SecEmprCod',fld:'vSECEMPRCOD',pic:''}]}");
      setEventMetadata("FORGOTPASSWORD.CLICK","{handler:'e1127Y1',iparms:[]");
      setEventMetadata("FORGOTPASSWORD.CLICK",",oparms:[]}");
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
      AV15ParametroEmprCod = "" ;
      AV5UsurPwd = "" ;
      GXKey = "" ;
      AV17SdtAutenticacion = new app.wwpbaseobjects.SdtSDTAutenticacion(remoteHandle, context);
      AV24WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      imgLogodmplus_gximage = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      lblInformationversion_Jsonclick = "" ;
      lblSignin_Jsonclick = "" ;
      TempTags = "" ;
      AV18SecEmprCod = "" ;
      AV19SecUserName = "" ;
      AV20SecUserPassword = "" ;
      bttBtnenter_Jsonclick = "" ;
      lblForgotpassword_Jsonclick = "" ;
      AV22Version = "" ;
      AV29Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV23WebSession = httpContext.getWebSession();
      AV21Station = "" ;
      AV9EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV25EmprNom = "" ;
      AV26UsurCod = "" ;
      AV7ContCod = "" ;
      GXv_int6 = new long[1] ;
      GXt_char1 = "" ;
      GXv_boolean8 = new boolean[1] ;
      AV16Progress = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new byte[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV29Pgmname = "LoginDatamon" ;
      /* GeneXus formulas. */
      AV29Pgmname = "LoginDatamon" ;
      Gx_err = (short)(0) ;
      edtavSecemprcod_Enabled = 0 ;
      edtavVersion_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV10Error ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int divTabledatos_Visible ;
   private int edtavSecemprcod_Visible ;
   private int edtavSecemprcod_Enabled ;
   private int edtavSecusername_Enabled ;
   private int edtavSecuserpassword_Enabled ;
   private int bttBtnenter_Visible ;
   private int edtavVersion_Enabled ;
   private int divTableloginerror_Visible ;
   private int edtavPgmname_Enabled ;
   private int idxLst ;
   private long AV8ContVal2 ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV15ParametroEmprCod ;
   private String AV5UsurPwd ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String divTablelogin_Internalname ;
   private String ClassString ;
   private String imgLogodmplus_gximage ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgLogodmplus_Internalname ;
   private String lblInformationversion_Internalname ;
   private String lblInformationversion_Caption ;
   private String lblInformationversion_Jsonclick ;
   private String divTabledatos_Internalname ;
   private String lblSignin_Internalname ;
   private String lblSignin_Caption ;
   private String lblSignin_Jsonclick ;
   private String edtavSecemprcod_Internalname ;
   private String TempTags ;
   private String edtavSecemprcod_Jsonclick ;
   private String edtavSecusername_Internalname ;
   private String edtavSecusername_Jsonclick ;
   private String edtavSecuserpassword_Internalname ;
   private String edtavSecuserpassword_Jsonclick ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String lblForgotpassword_Internalname ;
   private String lblForgotpassword_Jsonclick ;
   private String edtavVersion_Internalname ;
   private String edtavVersion_Jsonclick ;
   private String divTableloginerror_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV29Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV21Station ;
   private String AV9EmprCod ;
   private String GXv_char2[] ;
   private String AV25EmprNom ;
   private String AV26UsurCod ;
   private String AV7ContCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV11EsMultiEmpresa ;
   private boolean AV13LogInSuccessful ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private String AV18SecEmprCod ;
   private String AV19SecUserName ;
   private String AV20SecUserPassword ;
   private String AV22Version ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV16Progress ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private app.wwpbaseobjects.SdtSDTAutenticacion AV17SdtAutenticacion ;
   private app.wwpbaseobjects.SdtWWPContext AV24WWPContext ;
}

