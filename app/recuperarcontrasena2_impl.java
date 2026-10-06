package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recuperarcontrasena2_impl extends GXWebPanel
{
   public recuperarcontrasena2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recuperarcontrasena2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuperarcontrasena2_impl.class ));
   }

   public recuperarcontrasena2_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "UsurTkn") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "UsurTkn") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "UsurTkn") ;
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
            AV15UsurTkn = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15UsurTkn", AV15UsurTkn);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURTKN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15UsurTkn, ""))));
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
         pa14X2( ) ;
         validateSpaRequest();
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws14X2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we14X2( ) ;
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
      httpContext.writeValue( httpContext.getMessage( "Recuperar contraseña", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Mask/jquery.mask.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/WorkWithPlusUtilities/BootstrapSelect.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/WorkWithPlusUtilities/WorkWithPlusUtilitiesRender.js", "", false, true);
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal FormLogin_BackgroundImage01\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormLogin_BackgroundImage01\" data-gx-class=\"form-horizontal FormLogin_BackgroundImage01\" novalidate action=\""+formatLink("app.recuperarcontrasena2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15UsurTkn))}, new String[] {"UsurTkn"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13UsuMail, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURTKN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15UsurTkn, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vUSUMAIL", GXutil.rtrim( AV13UsuMail));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13UsuMail, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "USURCOD", GXutil.rtrim( A850UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV14UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "USUMAIL", GXutil.rtrim( A10513UsuMail));
      app.GxWebStd.gx_hidden_field( httpContext, "USURTKN", A13838UsurTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURTKN", AV15UsurTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURTKN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15UsurTkn, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMESSAGES", AV8Messages);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMESSAGES", AV8Messages);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITES_Enablefloatinglabels", GXutil.booltostr( Wwputilites_Enablefloatinglabels));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITES_Allowcolumnresizing", GXutil.booltostr( Wwputilites_Allowcolumnresizing));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITES_Allowcolumnreordering", GXutil.booltostr( Wwputilites_Allowcolumnreordering));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITES_Allowcolumnsrestore", GXutil.booltostr( Wwputilites_Allowcolumnsrestore));
   }

   public void renderHtmlCloseForm14X2( )
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
      return "RecuperarContrasena2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recuperar contraseña", "") ;
   }

   public void wb14X0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellPaddingLeft30", "Center", "top", "", "", "div");
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
         app.GxWebStd.gx_bitmap( httpContext, imgLogodmplus_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RecuperarContrasena2.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSignin_Internalname, httpContext.getMessage( "WWP_GAM_EnterNewPassword", ""), "", "", lblSignin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockTitleLogin", 0, "", 1, 1, 0, (short)(0), "HLP_RecuperarContrasena2.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellLogin CellPaddingLogin DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavUsername_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUsername_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUsername_Internalname, httpContext.getMessage( "Correo", ""), " AttributeLoginImageLeftLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUsername_Internalname, AV10UserName, GXutil.rtrim( localUtil.format( AV10UserName, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "mailto:"+AV10UserName, "", "", "", edtavUsername_Jsonclick, 0, "AttributeLoginImageLeft", "", "", "", "", edtavUsername_Visible, edtavUsername_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "", "HLP_RecuperarContrasena2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellLogin CellPaddingLogin DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavUserpasswordnew_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUserpasswordnew_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUserpasswordnew_Internalname, httpContext.getMessage( "WWP_GAM_NewPassword", ""), " AttributeLoginImageLeftLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserpasswordnew_Internalname, AV11UserPasswordNew, GXutil.rtrim( localUtil.format( AV11UserPasswordNew, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\""+" "+"data-gx-password-reveal"+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserpasswordnew_Jsonclick, 0, "AttributeLoginImageLeft", "", "", "", "", edtavUserpasswordnew_Visible, edtavUserpasswordnew_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_RecuperarContrasena2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCellLogin CellPaddingLogin DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavUserpasswordnewconf_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUserpasswordnewconf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUserpasswordnewconf_Internalname, httpContext.getMessage( "WWP_GAM_ConfirmPassword", ""), " AttributeLoginImageLeftLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserpasswordnewconf_Internalname, AV12UserPasswordNewConf, GXutil.rtrim( localUtil.format( AV12UserPasswordNewConf, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\""+" "+"data-gx-password-reveal"+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserpasswordnewconf_Jsonclick, 0, "AttributeLoginImageLeft", "", "", "", "", edtavUserpasswordnewconf_Visible, edtavUserpasswordnewconf_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_RecuperarContrasena2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellPaddingLogin", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divActions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "justify-content:flex-end;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtnenter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecuperarContrasena2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault btn btn-default" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlogin_Internalname, "", httpContext.getMessage( "Ir a iniciar sesión", ""), bttBtnlogin_Jsonclick, 7, httpContext.getMessage( "Ir a iniciar sesión", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1114x1_client"+"'", TempTags, "", 2, "HLP_RecuperarContrasena2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableerror_Internalname, divTableerror_Visible, 0, "px", 0, "px", "TableLoginError", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucWwputilites.setProperty("EnableFloatingLabels", Wwputilites_Enablefloatinglabels);
         ucWwputilites.setProperty("AllowColumnResizing", Wwputilites_Allowcolumnresizing);
         ucWwputilites.setProperty("AllowColumnReordering", Wwputilites_Allowcolumnreordering);
         ucWwputilites.setProperty("AllowColumnsRestore", Wwputilites_Allowcolumnsrestore);
         ucWwputilites.render(context, "dvelop.workwithplusutilities_f5", Wwputilites_Internalname, "WWPUTILITESContainer");
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

   public void start14X2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recuperar contraseña", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup14X0( ) ;
   }

   public void ws14X2( )
   {
      start14X2( ) ;
      evt14X2( ) ;
   }

   public void evt14X2( )
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
                        e1214X2 ();
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
                              e1314X2 ();
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e1414X2 ();
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

   public void we14X2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm14X2( ) ;
         }
      }
   }

   public void pa14X2( )
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
            GX_FocusControl = edtavUsername_Internalname ;
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
      rf14X2( ) ;
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

   public void rf14X2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1414X2 ();
         wb14X0( ) ;
      }
   }

   public void send_integrity_lvl_hashes14X2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vUSUMAIL", GXutil.rtrim( AV13UsuMail));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13UsuMail, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV14UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14UsurCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup14X0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1214X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Wwputilites_Enablefloatinglabels = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITES_Enablefloatinglabels")) ;
         Wwputilites_Allowcolumnresizing = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITES_Allowcolumnresizing")) ;
         Wwputilites_Allowcolumnreordering = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITES_Allowcolumnreordering")) ;
         Wwputilites_Allowcolumnsrestore = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITES_Allowcolumnsrestore")) ;
         /* Read variables values. */
         AV10UserName = httpContext.cgiGet( edtavUsername_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10UserName", AV10UserName);
         AV11UserPasswordNew = httpContext.cgiGet( edtavUserpasswordnew_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11UserPasswordNew", AV11UserPasswordNew);
         AV12UserPasswordNewConf = httpContext.cgiGet( edtavUserpasswordnewconf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12UserPasswordNewConf", AV12UserPasswordNewConf);
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
      e1214X2 ();
      if (returnInSub) return;
   }

   public void e1214X2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recuperarcontrasena2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = AV19Emprcod ;
      GXv_char3[0] = AV20Emprnom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      recuperarcontrasena2_impl.this.AV19Emprcod = GXv_char2[0] ;
      recuperarcontrasena2_impl.this.AV20Emprnom = GXv_char3[0] ;
      recuperarcontrasena2_impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14UsurCod", AV14UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14UsurCod, "@!"))));
      AV21GXLvl12 = (byte)(0) ;
      /* Using cursor H014X2 */
      pr_default.execute(0, new Object[] {AV15UsurTkn});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13838UsurTkn = H014X2_A13838UsurTkn[0] ;
         n13838UsurTkn = H014X2_n13838UsurTkn[0] ;
         A850UsurCod = H014X2_A850UsurCod[0] ;
         A10513UsuMail = H014X2_A10513UsuMail[0] ;
         A13840UsurTknVto = H014X2_A13840UsurTknVto[0] ;
         n13840UsurTknVto = H014X2_n13840UsurTknVto[0] ;
         AV21GXLvl12 = (byte)(1) ;
         AV14UsurCod = A850UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14UsurCod", AV14UsurCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14UsurCod, "@!"))));
         AV13UsuMail = A10513UsuMail ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13UsuMail", AV13UsuMail);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13UsuMail, ""))));
         if ( A13840UsurTknVto.before( GXutil.now( ) ) )
         {
            AV6Mensaje = httpContext.getMessage( "Proceso de recuperación de contraseña ha vencido, vuelva a realizarlo.", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Mensaje", AV6Mensaje);
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV21GXLvl12 == 0 )
      {
         AV6Mensaje = httpContext.getMessage( "Proceso de recuperación de contraseña invalido, por favor vuelva a realizar todo el proceso.", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Mensaje", AV6Mensaje);
      }
      if ( ! (GXutil.strcmp("", AV6Mensaje)==0) )
      {
         edtavUsername_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavUsername_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUsername_Visible), 5, 0), true);
         edtavUserpasswordnew_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavUserpasswordnew_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUserpasswordnew_Visible), 5, 0), true);
         edtavUserpasswordnewconf_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavUserpasswordnewconf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUserpasswordnewconf_Visible), 5, 0), true);
         divTableerror_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTableerror_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableerror_Visible), 5, 0), true);
         httpContext.GX_msglist.addItem(AV6Mensaje);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1314X2 ();
      if (returnInSub) return;
   }

   public void e1314X2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      divTableerror_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, divTableerror_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableerror_Visible), 5, 0), true);
      AV5IsOK = true ;
      if ( GXutil.strcmp(AV13UsuMail, AV10UserName) != 0 )
      {
         AV5IsOK = false ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "El correo indicado es distinto al que intenta recuperar. Verifique!", ""));
      }
      if ( AV5IsOK && ( GXutil.strcmp(AV11UserPasswordNew, AV12UserPasswordNewConf) != 0 ) )
      {
         AV5IsOK = false ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La contraseña y su confirmación no coinciden. Verifique!", ""));
      }
      if ( AV5IsOK )
      {
         /* Using cursor H014X3 */
         pr_default.execute(1, new Object[] {AV14UsurCod, AV10UserName, AV15UsurTkn});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13838UsurTkn = H014X3_A13838UsurTkn[0] ;
            n13838UsurTkn = H014X3_n13838UsurTkn[0] ;
            A10513UsuMail = H014X3_A10513UsuMail[0] ;
            A850UsurCod = H014X3_A850UsurCod[0] ;
            AV9TUSUARI.Load(AV14UsurCod);
            AV9TUSUARI.setgxTv_SdtTUSUARI_Usurpwd( AV11UserPasswordNew );
            AV9TUSUARI.setgxTv_SdtTUSUARI_Usurcmbpwd( false );
            AV9TUSUARI.setgxTv_SdtTUSUARI_Usurtkn( "" );
            GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
            AV9TUSUARI.setgxTv_SdtTUSUARI_Usurtkncrd( GXt_dtime5 );
            GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
            AV9TUSUARI.setgxTv_SdtTUSUARI_Usurtknvto( GXt_dtime5 );
            AV9TUSUARI.Update();
            if ( AV9TUSUARI.Success() )
            {
               Application.commitDataStores(context, remoteHandle, pr_default, "recuperarcontrasena2");
               httpContext.GX_msglist.addItem(httpContext.getMessage( "La contraseña ha sido cambiada con éxito.", ""));
               bttBtnenter_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Visible), 5, 0), true);
            }
            else
            {
               Application.rollbackDataStores(context, remoteHandle, pr_default, "recuperarcontrasena2");
               AV8Messages = AV9TUSUARI.GetMessages() ;
               /* Execute user subroutine: 'MOSTRAR MENSAJES' */
               S114 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  if (true) return;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8Messages", AV8Messages);
   }

   public void S114( )
   {
      /* 'MOSTRAR MENSAJES' Routine */
      returnInSub = false ;
      AV23GXV1 = 1 ;
      while ( AV23GXV1 <= AV8Messages.size() )
      {
         AV7Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV8Messages.elementAt(-1+AV23GXV1));
         httpContext.GX_msglist.addItem(AV7Message.getgxTv_SdtMessages_Message_Description());
         AV23GXV1 = (int)(AV23GXV1+1) ;
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e1414X2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV15UsurTkn = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurTkn", AV15UsurTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURTKN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15UsurTkn, ""))));
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
      pa14X2( ) ;
      ws14X2( ) ;
      we14X2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/fontawesome_v5/css/fontawesome.min.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/fontawesome_v5/css/all.min.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016424386", true, true);
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
      httpContext.AddJavascriptSource("recuperarcontrasena2.js", "?202661016424386", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Mask/jquery.mask.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/WorkWithPlusUtilities/BootstrapSelect.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/WorkWithPlusUtilities/WorkWithPlusUtilitiesRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgLogodmplus_Internalname = "LOGODMPLUS" ;
      lblSignin_Internalname = "SIGNIN" ;
      edtavUsername_Internalname = "vUSERNAME" ;
      edtavUserpasswordnew_Internalname = "vUSERPASSWORDNEW" ;
      edtavUserpasswordnewconf_Internalname = "vUSERPASSWORDNEWCONF" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnlogin_Internalname = "BTNLOGIN" ;
      divActions_Internalname = "ACTIONS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablelogin_Internalname = "TABLELOGIN" ;
      divTableerror_Internalname = "TABLEERROR" ;
      Wwputilites_Internalname = "WWPUTILITES" ;
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
      divTableerror_Visible = 1 ;
      bttBtnenter_Visible = 1 ;
      edtavUserpasswordnewconf_Jsonclick = "" ;
      edtavUserpasswordnewconf_Enabled = 1 ;
      edtavUserpasswordnewconf_Visible = 1 ;
      edtavUserpasswordnew_Jsonclick = "" ;
      edtavUserpasswordnew_Enabled = 1 ;
      edtavUserpasswordnew_Visible = 1 ;
      edtavUsername_Jsonclick = "" ;
      edtavUsername_Enabled = 1 ;
      edtavUsername_Visible = 1 ;
      Wwputilites_Allowcolumnsrestore = GXutil.toBoolean( -1) ;
      Wwputilites_Allowcolumnreordering = GXutil.toBoolean( -1) ;
      Wwputilites_Allowcolumnresizing = GXutil.toBoolean( -1) ;
      Wwputilites_Enablefloatinglabels = GXutil.toBoolean( -1) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV13UsuMail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV14UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV15UsurTkn',fld:'vUSURTKN',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e1314X2',iparms:[{av:'AV13UsuMail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV10UserName',fld:'vUSERNAME',pic:''},{av:'AV11UserPasswordNew',fld:'vUSERPASSWORDNEW',pic:''},{av:'AV12UserPasswordNewConf',fld:'vUSERPASSWORDNEWCONF',pic:''},{av:'A850UsurCod',fld:'USURCOD',pic:'@!'},{av:'AV14UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A10513UsuMail',fld:'USUMAIL',pic:''},{av:'A13838UsurTkn',fld:'USURTKN',pic:''},{av:'AV15UsurTkn',fld:'vUSURTKN',pic:'',hsh:true},{av:'AV8Messages',fld:'vMESSAGES',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'divTableerror_Visible',ctrl:'TABLEERROR',prop:'Visible'},{ctrl:'BTNENTER',prop:'Visible'},{av:'AV8Messages',fld:'vMESSAGES',pic:''}]}");
      setEventMetadata("'DOLOGIN'","{handler:'e1114X1',iparms:[]");
      setEventMetadata("'DOLOGIN'",",oparms:[]}");
      setEventMetadata("VALIDV_USERNAME","{handler:'validv_Username',iparms:[]");
      setEventMetadata("VALIDV_USERNAME",",oparms:[]}");
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
      wcpOAV15UsurTkn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV15UsurTkn = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV13UsuMail = "" ;
      AV14UsurCod = "" ;
      GXKey = "" ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      A13838UsurTkn = "" ;
      AV8Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      imgLogodmplus_gximage = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      lblSignin_Jsonclick = "" ;
      TempTags = "" ;
      AV10UserName = "" ;
      AV11UserPasswordNew = "" ;
      AV12UserPasswordNewConf = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnlogin_Jsonclick = "" ;
      ucWwputilites = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Station = "" ;
      GXt_char1 = "" ;
      AV19Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV20Emprnom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      H014X2_A13838UsurTkn = new String[] {""} ;
      H014X2_n13838UsurTkn = new boolean[] {false} ;
      H014X2_A850UsurCod = new String[] {""} ;
      H014X2_A10513UsuMail = new String[] {""} ;
      H014X2_A13840UsurTknVto = new java.util.Date[] {GXutil.nullDate()} ;
      H014X2_n13840UsurTknVto = new boolean[] {false} ;
      A13840UsurTknVto = GXutil.resetTime( GXutil.nullDate() );
      AV6Mensaje = "" ;
      H014X3_A13838UsurTkn = new String[] {""} ;
      H014X3_n13838UsurTkn = new boolean[] {false} ;
      H014X3_A10513UsuMail = new String[] {""} ;
      H014X3_A850UsurCod = new String[] {""} ;
      AV9TUSUARI = new app.SdtTUSUARI(remoteHandle);
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      AV7Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recuperarcontrasena2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recuperarcontrasena2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recuperarcontrasena2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuperarcontrasena2__default(),
         new Object[] {
             new Object[] {
            H014X2_A13838UsurTkn, H014X2_n13838UsurTkn, H014X2_A850UsurCod, H014X2_A10513UsuMail, H014X2_A13840UsurTknVto, H014X2_n13840UsurTknVto
            }
            , new Object[] {
            H014X3_A13838UsurTkn, H014X3_n13838UsurTkn, H014X3_A10513UsuMail, H014X3_A850UsurCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV21GXLvl12 ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavUsername_Visible ;
   private int edtavUsername_Enabled ;
   private int edtavUserpasswordnew_Visible ;
   private int edtavUserpasswordnew_Enabled ;
   private int edtavUserpasswordnewconf_Visible ;
   private int edtavUserpasswordnewconf_Enabled ;
   private int bttBtnenter_Visible ;
   private int divTableerror_Visible ;
   private int AV23GXV1 ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV13UsuMail ;
   private String AV14UsurCod ;
   private String GXKey ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
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
   private String lblSignin_Internalname ;
   private String lblSignin_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavUsername_Internalname ;
   private String TempTags ;
   private String edtavUsername_Jsonclick ;
   private String edtavUserpasswordnew_Internalname ;
   private String edtavUserpasswordnew_Jsonclick ;
   private String edtavUserpasswordnewconf_Internalname ;
   private String edtavUserpasswordnewconf_Jsonclick ;
   private String divActions_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnlogin_Internalname ;
   private String bttBtnlogin_Jsonclick ;
   private String divTableerror_Internalname ;
   private String Wwputilites_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV18Station ;
   private String GXt_char1 ;
   private String AV19Emprcod ;
   private String GXv_char2[] ;
   private String AV20Emprnom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private java.util.Date A13840UsurTknVto ;
   private java.util.Date GXt_dtime5 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Wwputilites_Enablefloatinglabels ;
   private boolean Wwputilites_Allowcolumnresizing ;
   private boolean Wwputilites_Allowcolumnreordering ;
   private boolean Wwputilites_Allowcolumnsrestore ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n13838UsurTkn ;
   private boolean n13840UsurTknVto ;
   private boolean AV5IsOK ;
   private String wcpOAV15UsurTkn ;
   private String AV15UsurTkn ;
   private String A13838UsurTkn ;
   private String AV10UserName ;
   private String AV11UserPasswordNew ;
   private String AV12UserPasswordNewConf ;
   private String AV6Mensaje ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucWwputilites ;
   private IDataStoreProvider pr_default ;
   private String[] H014X2_A13838UsurTkn ;
   private boolean[] H014X2_n13838UsurTkn ;
   private String[] H014X2_A850UsurCod ;
   private String[] H014X2_A10513UsuMail ;
   private java.util.Date[] H014X2_A13840UsurTknVto ;
   private boolean[] H014X2_n13840UsurTknVto ;
   private String[] H014X3_A13838UsurTkn ;
   private boolean[] H014X3_n13838UsurTkn ;
   private String[] H014X3_A10513UsuMail ;
   private String[] H014X3_A850UsurCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV8Messages ;
   private com.genexus.SdtMessages_Message AV7Message ;
   private app.SdtTUSUARI AV9TUSUARI ;
}

final  class recuperarcontrasena2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class recuperarcontrasena2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class recuperarcontrasena2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class recuperarcontrasena2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H014X2", "SELECT * FROM (SELECT UsurTkn, UsurCod, UsuMail, UsurTknVto FROM TXPUSUARI WHERE RTRIM(LTRIM(UsurTkn)) = RTRIM(LTRIM(?)) ORDER BY UsurCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H014X3", "SELECT UsurTkn, UsuMail, UsurCod FROM TXPUSUARI WHERE (UsurCod = ?) AND (RTRIM(LTRIM(UsuMail)) = RTRIM(LTRIM(?))) AND (RTRIM(LTRIM(UsurTkn)) = RTRIM(LTRIM(?))) ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 40);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
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
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 100);
               stmt.setVarchar(3, (String)parms[2], 100);
               return;
      }
   }

}

