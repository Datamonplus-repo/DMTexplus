package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class texplusnetlogin_impl extends GXWebPanel
{
   public texplusnetlogin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public texplusnetlogin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( texplusnetlogin_impl.class ));
   }

   public texplusnetlogin_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vSECUSERNAME") == 0 )
         {
            A854UsurNom = httpContext.GetPar( "UsurNom") ;
            n854UsurNom = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvsecusername960( A854UsurNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vSECUSERNAME") == 0 )
         {
            A854UsurNom = httpContext.GetPar( "UsurNom") ;
            n854UsurNom = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvsecusername960( A854UsurNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vSECUSERNAME") == 0 )
         {
            hV18SecUserName = httpContext.GetPar( "hV18SecUserName") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvsecusername962( hV18SecUserName) ;
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
         pa962( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws962( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we962( ) ;
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
      httpContext.writeValue( httpContext.getMessage( "Texplus NETLogin", "")) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormLogin_BackgroundImage01\" data-gx-class=\"form-horizontal FormLogin_BackgroundImage01\" novalidate action=\""+formatLink("app.texplusnetlogin", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURPWD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurPwd, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTAUTENTICACION", AV16SdtAutenticacion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTAUTENTICACION", AV16SdtAutenticacion);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURPWD", GXutil.rtrim( AV8UsurPwd));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURPWD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurPwd, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvSECUSERNAME", AV18SecUserName);
   }

   public void renderHtmlCloseForm962( )
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
      return "TexplusNETLogin" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Texplus NETLogin", "") ;
   }

   public void wb960( )
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
         app.GxWebStd.gx_bitmap( httpContext, imgLogodmplus_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_TexplusNETLogin.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblInformationversion_Internalname, lblInformationversion_Caption, "", "", lblInformationversion_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataDescriptionLoginCenter", 0, "", 1, 1, 0, (short)(1), "HLP_TexplusNETLogin.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblSignin_Internalname, lblSignin_Caption, "", "", lblSignin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockTitleMaster", 0, "", 1, 1, 0, (short)(0), "HLP_TexplusNETLogin.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSecemprcod_Internalname, AV17SecEmprCod, GXutil.rtrim( localUtil.format( AV17SecEmprCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "Empresa", ""), edtavSecemprcod_Jsonclick, 0, "AttributeTitleBaseColor", "", "", "", "", edtavSecemprcod_Visible, edtavSecemprcod_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TexplusNETLogin.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSecusername_Internalname, GXutil.rtrim( hV18SecUserName), GXutil.rtrim( localUtil.format( hV18SecUserName, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "Usuario", ""), edtavSecusername_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSecusername_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TexplusNETLogin.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSecuserpassword_Internalname, AV19SecUserPassword, GXutil.rtrim( localUtil.format( AV19SecUserPassword, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\""+" "+"data-gx-password-reveal"+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "Contraseña", ""), edtavSecuserpassword_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSecuserpassword_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_TexplusNETLogin.htm");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "WWP_GAM_Login", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtnenter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TexplusNETLogin.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellLogin CellPaddingLogin", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblForgotpassword_Internalname, httpContext.getMessage( "WWP_GAM_ForgotPassword", ""), "", "", lblForgotpassword_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11961_client"+"'", "", "DataDescriptionLoginCenter", 7, "", 1, 1, 0, (short)(1), "HLP_TexplusNETLogin.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start962( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Texplus NETLogin", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup960( ) ;
   }

   public void ws962( )
   {
      start962( ) ;
      evt962( ) ;
   }

   public void evt962( )
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
                        e12962 ();
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
                              e13962 ();
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e14962 ();
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

   public void we962( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm962( ) ;
         }
      }
   }

   public void pa962( )
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

   public void gxsgvvsecusername960( String A854UsurNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvsecusername_data960( A854UsurNom) ;
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

   protected void gxsgvvsecusername_data960( String A854UsurNom )
   {
      l854UsurNom = GXutil.padr( GXutil.rtrim( A854UsurNom), 35, "%") ;
      n854UsurNom = false ;
      /* Using cursor H00962 */
      pr_default.execute(0, new Object[] {l854UsurNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00962_A854UsurNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00962_A854UsurNom[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvvsecusername962( String A854UsurNom )
   {
      /* Using cursor H00963 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n854UsurNom), A854UsurNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A854UsurNom = H00963_A854UsurNom[0] ;
         n854UsurNom = H00963_n854UsurNom[0] ;
         A850UsurCod = H00963_A850UsurCod[0] ;
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A850UsurCod))+"\"") ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf962( ) ;
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
      edtavSecemprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSecemprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSecemprcod_Enabled), 5, 0), true);
   }

   public void rf962( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e14962 ();
         wb960( ) ;
      }
   }

   public void send_integrity_lvl_hashes962( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURPWD", GXutil.rtrim( AV8UsurPwd));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURPWD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurPwd, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSecemprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSecemprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSecemprcod_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup960( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12962 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         /* Read variables values. */
         AV17SecEmprCod = httpContext.cgiGet( edtavSecemprcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17SecEmprCod", AV17SecEmprCod);
         hV18SecUserName = httpContext.cgiGet( edtavSecusername_Internalname) ;
         if ( (GXutil.strcmp("", hV18SecUserName)==0) )
         {
            AV18SecUserName = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18SecUserName", AV18SecUserName);
         }
         else
         {
            A854UsurNom = hV18SecUserName ;
            n854UsurNom = false ;
            /* Using cursor H00964 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n854UsurNom), A854UsurNom});
            AV18SecUserName = H00964_A850UsurCod[0] ;
            if ( ! ( (pr_default.getStatus(2) == 101) ) )
            {
               pr_default.readNext(2);
               if ( ! ( (pr_default.getStatus(2) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre largo", "")}), 1, "vSECUSERNAME");
                  GX_FocusControl = edtavSecusername_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(2);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV18SecUserName", hV18SecUserName);
         AV19SecUserPassword = httpContext.cgiGet( edtavSecuserpassword_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19SecUserPassword", AV19SecUserPassword);
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
      e12962 ();
      if (returnInSub) return;
   }

   public void e12962( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      texplusnetlogin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV25Emprnom ;
      GXv_char4[0] = AV26Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      texplusnetlogin_impl.this.AV10EmprCod = GXv_char2[0] ;
      texplusnetlogin_impl.this.AV25Emprnom = GXv_char3[0] ;
      texplusnetlogin_impl.this.AV26Usurcod = GXv_char4[0] ;
      AV7ParametroEmprCod = "001" ;
      AV5ContCod = httpContext.getMessage( "VERSEM", "") ;
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.datosinformacionversion(remoteHandle, context).execute( AV7ParametroEmprCod, GXv_char4) ;
      texplusnetlogin_impl.this.GXt_char1 = GXv_char4[0] ;
      lblInformationversion_Caption = GXt_char1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblInformationversion_Internalname, "Caption", lblInformationversion_Caption, true);
      if ( GXutil.strcmp(GXutil.trim( lblInformationversion_Caption), "") == 0 )
      {
         GXt_int5 = AV6ContVal2 ;
         GXv_int6[0] = GXt_int5 ;
         new app.obtenercontval2(remoteHandle, context).execute( AV7ParametroEmprCod, AV5ContCod, GXv_int6) ;
         texplusnetlogin_impl.this.GXt_int5 = GXv_int6[0] ;
         AV6ContVal2 = GXt_int5 ;
         lblInformationversion_Caption = GXutil.format( httpContext.getMessage( "Versión : %1, está desactualizada, Por favor contactar a soporte aplicaciones", ""), GXutil.str( AV6ContVal2, 10, 0), "", "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblInformationversion_Internalname, "Caption", lblInformationversion_Caption, true);
         divTabledatos_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTabledatos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledatos_Visible), 5, 0), true);
      }
      else
      {
         AV21WebSession.clear();
         divTableloginerror_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTableloginerror_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableloginerror_Visible), 5, 0), true);
         GXt_boolean7 = AV12EsMultiEmpresa ;
         GXv_boolean8[0] = GXt_boolean7 ;
         new app.determinarmultiempresa(remoteHandle, context).execute( GXv_boolean8) ;
         texplusnetlogin_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
         AV12EsMultiEmpresa = GXt_boolean7 ;
         GXt_char1 = AV17SecEmprCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.obtenerempresa(remoteHandle, context).execute( GXv_char4) ;
         texplusnetlogin_impl.this.GXt_char1 = GXv_char4[0] ;
         AV17SecEmprCod = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17SecEmprCod", AV17SecEmprCod);
         if ( (GXutil.strcmp("", AV17SecEmprCod)==0) )
         {
            divTableloginerror_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, divTableloginerror_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableloginerror_Visible), 5, 0), true);
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Sin datos de empresa, por favor contactar a soporte de aplicaciones", ""));
            bttBtnenter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Visible), 5, 0), true);
         }
         if ( ! AV12EsMultiEmpresa )
         {
            GXt_char1 = "" ;
            GXv_char4[0] = AV17SecEmprCod ;
            GXv_char3[0] = GXt_char1 ;
            new app.pemprnom(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
            texplusnetlogin_impl.this.AV17SecEmprCod = GXv_char4[0] ;
            texplusnetlogin_impl.this.GXt_char1 = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17SecEmprCod", AV17SecEmprCod);
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
      e13962 ();
      if (returnInSub) return;
   }

   public void e13962( )
   {
      /* Enter Routine */
      returnInSub = false ;
      divTableloginerror_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, divTableloginerror_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableloginerror_Visible), 5, 0), true);
      if ( (GXutil.strcmp("", AV17SecEmprCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere seleccionar empresa", ""));
         GX_FocusControl = edtavSecemprcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( (GXutil.strcmp("", AV18SecUserName)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere usuario", ""));
         GX_FocusControl = edtavSecusername_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( (GXutil.strcmp("", AV19SecUserPassword)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere contraseña", ""));
         GX_FocusControl = edtavSecuserpassword_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV16SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena02( com.genexus.util.Encryption.getNewKey( ) );
         AV16SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena03( httpContext.encrypt64( AV18SecUserName, AV16SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) );
         AV16SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena01( httpContext.encrypt64( AV19SecUserPassword, AV16SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) );
         AV16SdtAutenticacion.setgxTv_SdtSDTAutenticacion_Cadena04( httpContext.encrypt64( AV17SecEmprCod, AV16SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena02()) );
         GXt_boolean7 = AV14LogInSuccessful ;
         GXv_boolean8[0] = GXt_boolean7 ;
         new app.wwpbaseobjects.validarautenticacion(remoteHandle, context).execute( AV16SdtAutenticacion.toJSonString(false, true), GXv_boolean8) ;
         texplusnetlogin_impl.this.GXt_boolean7 = GXv_boolean8[0] ;
         AV14LogInSuccessful = GXt_boolean7 ;
         AV22Progress.setgxTv_SdtProgress_Type( (byte)(1) );
         AV22Progress.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
         AV22Progress.setgxTv_SdtProgress_Value( 55 );
         AV22Progress.showwithtitle(httpContext.getMessage( "Validando sesión", ""));
         AV22Progress.show();
         if ( AV14LogInSuccessful )
         {
            AV22Progress.setgxTv_SdtProgress_Value( 85 );
            AV21WebSession.setValue("TexplusNET_Autentication", AV16SdtAutenticacion.toJSonString(false, true));
            AV20Station = httpContext.getMessage( "NE", "") + AV18SecUserName ;
            GXv_char4[0] = AV20Station ;
            GXv_char3[0] = AV17SecEmprCod ;
            new app.pusuemp(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
            texplusnetlogin_impl.this.AV20Station = GXv_char4[0] ;
            texplusnetlogin_impl.this.AV17SecEmprCod = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17SecEmprCod", AV17SecEmprCod);
            AV22Progress.setgxTv_SdtProgress_Value( 100 );
            AV22Progress.hide();
            if ( GXutil.strcmp(AV8UsurPwd, httpContext.getMessage( "DOLLY", "")) == 0 )
            {
            }
            GXt_int9 = AV11Error ;
            GXv_char4[0] = "Home" ;
            GXv_int10[0] = GXt_int9 ;
            new app.webplicrnd(remoteHandle, context).execute( GXv_char4, GXv_int10) ;
            texplusnetlogin_impl.this.GXt_int9 = GXv_int10[0] ;
            AV11Error = GXt_int9 ;
            if ( AV11Error == 1 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Situación con Licencia por atender, contactar a Soporte Aplicaciones", ""));
               AV21WebSession.remove("TexplusNET_Autentication");
            }
            else
            {
               callWebObject(formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {}) );
               httpContext.wjLocDisableFrm = (byte)(1) ;
            }
         }
         else
         {
            AV22Progress.setgxTv_SdtProgress_Value( 100 );
            AV22Progress.hide();
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Revisar Usuario/Contraseña", ""));
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Si ha realizado cambio de contraseña. Verique su correo!", ""));
            GX_FocusControl = edtavSecuserpassword_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV16SdtAutenticacion", AV16SdtAutenticacion);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22Progress", AV22Progress);
   }

   protected void nextLoad( )
   {
   }

   protected void e14962( )
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
      pa962( ) ;
      ws962( ) ;
      we962( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026831357228", true, true);
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
      httpContext.AddJavascriptSource("texplusnetlogin.js", "?2026831357228", false, true);
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
      divTabledatos_Internalname = "TABLEDATOS" ;
      divTablelogin_Internalname = "TABLELOGIN" ;
      divTableloginerror_Internalname = "TABLELOGINERROR" ;
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
      divTableloginerror_Visible = 1 ;
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

   public void validv_Secusername( )
   {
      if ( (GXutil.strcmp("", hV18SecUserName)==0) )
      {
         AV18SecUserName = "" ;
      }
      else
      {
         A854UsurNom = hV18SecUserName ;
         n854UsurNom = false ;
         /* Using cursor H00965 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n854UsurNom), A854UsurNom});
         AV18SecUserName = H00965_A850UsurCod[0] ;
         if ( ! ( (pr_default.getStatus(3) == 101) ) )
         {
            pr_default.readNext(3);
            if ( ! ( (pr_default.getStatus(3) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre largo", "")}), 1, "vSECUSERNAME");
               GX_FocusControl = edtavSecusername_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(3);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV18SecUserName", hV18SecUserName);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV18SecUserName", AV18SecUserName);
      httpContext.ajax_rsp_assign_attri("", false, "hV18SecUserName", GXutil.rtrim( hV18SecUserName));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV8UsurPwd',fld:'vUSURPWD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e13962',iparms:[{av:'AV17SecEmprCod',fld:'vSECEMPRCOD',pic:''},{av:'AV18SecUserName',fld:'vSECUSERNAME',pic:''},{av:'AV19SecUserPassword',fld:'vSECUSERPASSWORD',pic:''},{av:'AV16SdtAutenticacion',fld:'vSDTAUTENTICACION',pic:''},{av:'AV8UsurPwd',fld:'vUSURPWD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'divTableloginerror_Visible',ctrl:'TABLELOGINERROR',prop:'Visible'},{av:'AV16SdtAutenticacion',fld:'vSDTAUTENTICACION',pic:''},{av:'AV17SecEmprCod',fld:'vSECEMPRCOD',pic:''}]}");
      setEventMetadata("FORGOTPASSWORD.CLICK","{handler:'e11961',iparms:[]");
      setEventMetadata("FORGOTPASSWORD.CLICK",",oparms:[]}");
      setEventMetadata("VALIDV_SECUSERNAME","{handler:'validv_Secusername',iparms:[{av:'hV18SecUserName'},{av:'AV18SecUserName',fld:'vSECUSERNAME',pic:''}]");
      setEventMetadata("VALIDV_SECUSERNAME",",oparms:[{av:'AV18SecUserName',fld:'vSECUSERNAME',pic:''},{av:'hV18SecUserName'}]}");
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
      A854UsurNom = "" ;
      hV18SecUserName = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV8UsurPwd = "" ;
      GXKey = "" ;
      AV16SdtAutenticacion = new app.wwpbaseobjects.SdtSDTAutenticacion(remoteHandle, context);
      AV18SecUserName = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      imgLogodmplus_gximage = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      lblInformationversion_Jsonclick = "" ;
      lblSignin_Jsonclick = "" ;
      TempTags = "" ;
      AV17SecEmprCod = "" ;
      AV19SecUserPassword = "" ;
      bttBtnenter_Jsonclick = "" ;
      lblForgotpassword_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l854UsurNom = "" ;
      H00962_A854UsurNom = new String[] {""} ;
      H00962_n854UsurNom = new boolean[] {false} ;
      H00963_A854UsurNom = new String[] {""} ;
      H00963_n854UsurNom = new boolean[] {false} ;
      H00963_A850UsurCod = new String[] {""} ;
      A850UsurCod = "" ;
      H00964_A854UsurNom = new String[] {""} ;
      H00964_n854UsurNom = new boolean[] {false} ;
      H00964_A850UsurCod = new String[] {""} ;
      AV20Station = "" ;
      AV10EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV25Emprnom = "" ;
      AV26Usurcod = "" ;
      AV7ParametroEmprCod = "" ;
      AV5ContCod = "" ;
      GXv_int6 = new long[1] ;
      AV21WebSession = httpContext.getWebSession();
      GXt_char1 = "" ;
      GXv_boolean8 = new boolean[1] ;
      AV22Progress = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new byte[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H00965_A854UsurNom = new String[] {""} ;
      H00965_n854UsurNom = new boolean[] {false} ;
      H00965_A850UsurCod = new String[] {""} ;
      ZV18SecUserName = "" ;
      ZhV18SecUserName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.texplusnetlogin__default(),
         new Object[] {
             new Object[] {
            H00962_A854UsurNom, H00962_n854UsurNom
            }
            , new Object[] {
            H00963_A854UsurNom, H00963_n854UsurNom, H00963_A850UsurCod
            }
            , new Object[] {
            H00964_A854UsurNom, H00964_n854UsurNom, H00964_A850UsurCod
            }
            , new Object[] {
            H00965_A854UsurNom, H00965_n854UsurNom, H00965_A850UsurCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSecemprcod_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV11Error ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int divTabledatos_Visible ;
   private int edtavSecemprcod_Visible ;
   private int edtavSecemprcod_Enabled ;
   private int edtavSecusername_Enabled ;
   private int edtavSecuserpassword_Enabled ;
   private int bttBtnenter_Visible ;
   private int divTableloginerror_Visible ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private long AV6ContVal2 ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A854UsurNom ;
   private String hV18SecUserName ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV8UsurPwd ;
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
   private String divTableloginerror_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l854UsurNom ;
   private String A850UsurCod ;
   private String AV20Station ;
   private String AV10EmprCod ;
   private String GXv_char2[] ;
   private String AV25Emprnom ;
   private String AV26Usurcod ;
   private String AV7ParametroEmprCod ;
   private String AV5ContCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String ZhV18SecUserName ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n854UsurNom ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV12EsMultiEmpresa ;
   private boolean AV14LogInSuccessful ;
   private boolean GXt_boolean7 ;
   private boolean GXv_boolean8[] ;
   private String AV18SecUserName ;
   private String AV17SecEmprCod ;
   private String AV19SecUserPassword ;
   private String ZV18SecUserName ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV22Progress ;
   private IDataStoreProvider pr_default ;
   private String[] H00962_A854UsurNom ;
   private boolean[] H00962_n854UsurNom ;
   private String[] H00963_A854UsurNom ;
   private boolean[] H00963_n854UsurNom ;
   private String[] H00963_A850UsurCod ;
   private String[] H00964_A854UsurNom ;
   private boolean[] H00964_n854UsurNom ;
   private String[] H00964_A850UsurCod ;
   private String[] H00965_A854UsurNom ;
   private boolean[] H00965_n854UsurNom ;
   private String[] H00965_A850UsurCod ;
   private com.genexus.webpanels.WebSession AV21WebSession ;
   private app.wwpbaseobjects.SdtSDTAutenticacion AV16SdtAutenticacion ;
}

final  class texplusnetlogin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00962", "SELECT * FROM (SELECT DISTINCT UsurNom FROM TXPUSUARI WHERE UPPER(UsurNom) like '%' || UPPER(?) ORDER BY UsurNom) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00963", "SELECT UsurNom, UsurCod FROM TXPUSUARI WHERE UsurNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00964", "SELECT UsurNom, UsurCod FROM TXPUSUARI WHERE UsurNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00965", "SELECT UsurNom, UsurCod FROM TXPUSUARI WHERE UsurNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
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
               stmt.setString(1, (String)parms[0], 35);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 35);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 35);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 35);
               }
               return;
      }
   }

}

