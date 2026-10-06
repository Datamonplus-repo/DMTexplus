package app.test ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class abaranes_impl extends GXDataArea
{
   public abaranes_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public abaranes_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( abaranes_impl.class ));
   }

   public abaranes_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "PreviousStep") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "PreviousStep") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "PreviousStep") ;
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
            AV8PreviousStep = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8PreviousStep", AV8PreviousStep);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPREVIOUSSTEP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PreviousStep, ""))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV9CurrentStep = httpContext.GetPar( "CurrentStep") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9CurrentStep", AV9CurrentStep);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURRENTSTEP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9CurrentStep, ""))));
               AV7GoingBack = GXutil.strtobool( httpContext.GetPar( "GoingBack")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7GoingBack", AV7GoingBack);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGOINGBACK", getSecureSignedToken( "", AV7GoingBack));
            }
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
      pa1A42( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1A42( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.test.abaranes", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8PreviousStep)),GXutil.URLEncode(GXutil.rtrim(AV9CurrentStep)),GXutil.URLEncode(GXutil.booltostr(AV7GoingBack))}, new String[] {"PreviousStep","CurrentStep","GoingBack"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWIZARDSTEPS", getSecureSignedToken( "", AV11WizardSteps));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURRENTSTEPAUX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10CurrentStepAux, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPREVIOUSSTEP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PreviousStep, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURRENTSTEP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9CurrentStep, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGOINGBACK", getSecureSignedToken( "", AV7GoingBack));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vWIZARDSTEPS", AV11WizardSteps);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vWIZARDSTEPS", AV11WizardSteps);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWIZARDSTEPS", getSecureSignedToken( "", AV11WizardSteps));
      app.GxWebStd.gx_hidden_field( httpContext, "vCURRENTSTEPAUX", AV10CurrentStepAux);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURRENTSTEPAUX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10CurrentStepAux, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPREVIOUSSTEP", AV8PreviousStep);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPREVIOUSSTEP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PreviousStep, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCURRENTSTEP", AV9CurrentStep);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURRENTSTEP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9CurrentStep, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vGOINGBACK", AV7GoingBack);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGOINGBACK", getSecureSignedToken( "", AV7GoingBack));
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
      if ( ! ( WebComp_Steptitles == null ) )
      {
         WebComp_Steptitles.componentjscripts();
      }
      if ( ! ( WebComp_Wizardstepwc == null ) )
      {
         WebComp_Wizardstepwc.componentjscripts();
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
         we1A42( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1A42( ) ;
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
      return formatLink("app.test.abaranes", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8PreviousStep)),GXutil.URLEncode(GXutil.rtrim(AV9CurrentStep)),GXutil.URLEncode(GXutil.booltostr(AV7GoingBack))}, new String[] {"PreviousStep","CurrentStep","GoingBack"})  ;
   }

   public String getPgmname( )
   {
      return "TEST.Abaranes" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Abaranes", "") ;
   }

   public void wb1A40( )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_6_1A42( true) ;
      }
      else
      {
         wb_table1_6_1A42( false) ;
      }
      return  ;
   }

   public void wb_table1_6_1A42e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1A42( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Abaranes", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1A40( ) ;
   }

   public void ws1A42( )
   {
      start1A42( ) ;
      evt1A42( ) ;
   }

   public void evt1A42( )
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
                           e111A42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e121A42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e131A42 ();
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
                     if ( nCmpId == 9 )
                     {
                        OldSteptitles = httpContext.cgiGet( "W0009") ;
                        if ( ( GXutil.len( OldSteptitles) == 0 ) || ( GXutil.strcmp(OldSteptitles, WebComp_Steptitles_Component) != 0 ) )
                        {
                           WebComp_Steptitles = WebUtils.getWebComponent(getClass(), "app." + OldSteptitles + "_impl", remoteHandle, context);
                           WebComp_Steptitles_Component = OldSteptitles ;
                        }
                        if ( GXutil.len( WebComp_Steptitles_Component) != 0 )
                        {
                           WebComp_Steptitles.componentprocess("W0009", "", sEvt);
                        }
                        WebComp_Steptitles_Component = OldSteptitles ;
                     }
                     else if ( nCmpId == 15 )
                     {
                        OldWizardstepwc = httpContext.cgiGet( "W0015") ;
                        if ( ( GXutil.len( OldWizardstepwc) == 0 ) || ( GXutil.strcmp(OldWizardstepwc, WebComp_Wizardstepwc_Component) != 0 ) )
                        {
                           WebComp_Wizardstepwc = WebUtils.getWebComponent(getClass(), "app." + OldWizardstepwc + "_impl", remoteHandle, context);
                           WebComp_Wizardstepwc_Component = OldWizardstepwc ;
                        }
                        if ( GXutil.len( WebComp_Wizardstepwc_Component) != 0 )
                        {
                           WebComp_Wizardstepwc.componentprocess("W0015", "", sEvt);
                        }
                        WebComp_Wizardstepwc_Component = OldWizardstepwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1A42( )
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

   public void pa1A42( )
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
      rf1A42( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV20Pgmname = "TEST.Abaranes" ;
      Gx_err = (short)(0) ;
   }

   public void rf1A42( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e121A42 ();
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Steptitles_Component) != 0 )
            {
               WebComp_Steptitles.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wizardstepwc_Component) != 0 )
            {
               WebComp_Wizardstepwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e131A42 ();
         wb1A40( ) ;
      }
   }

   public void send_integrity_lvl_hashes1A42( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vWIZARDSTEPS", AV11WizardSteps);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vWIZARDSTEPS", AV11WizardSteps);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWIZARDSTEPS", getSecureSignedToken( "", AV11WizardSteps));
      app.GxWebStd.gx_hidden_field( httpContext, "vCURRENTSTEPAUX", AV10CurrentStepAux);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURRENTSTEPAUX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10CurrentStepAux, ""))));
   }

   public void before_start_formulas( )
   {
      AV20Pgmname = "TEST.Abaranes" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1A40( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111A42 ();
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
      e111A42 ();
      if (returnInSub) return;
   }

   public void e111A42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      abaranes_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      GXv_char2[0] = AV17Emprcod ;
      GXv_char3[0] = AV18Emprnom ;
      GXv_char4[0] = AV19Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      abaranes_impl.this.AV17Emprcod = GXv_char2[0] ;
      abaranes_impl.this.AV18Emprnom = GXv_char3[0] ;
      abaranes_impl.this.AV19Usurcod = GXv_char4[0] ;
      AV11WizardSteps = new GXBaseCollection<app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem>(app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem.class, "WizardStepsItem", "TexplusNET", remoteHandle) ;
      AV12WizardStep = (app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem)new app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem(remoteHandle, context);
      AV12WizardStep.setgxTv_SdtWizardSteps_WizardStepsItem_Code( "Tab01" );
      AV12WizardStep.setgxTv_SdtWizardSteps_WizardStepsItem_Title( httpContext.getMessage( "Datos del cliente", "") );
      AV12WizardStep.setgxTv_SdtWizardSteps_WizardStepsItem_Description( httpContext.getMessage( "Datos del cliente", "") );
      AV11WizardSteps.add(AV12WizardStep, 0);
      AV12WizardStep = (app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem)new app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem(remoteHandle, context);
      AV12WizardStep.setgxTv_SdtWizardSteps_WizardStepsItem_Code( "Tab02" );
      AV12WizardStep.setgxTv_SdtWizardSteps_WizardStepsItem_Title( httpContext.getMessage( "Hojas de rutas", "") );
      AV12WizardStep.setgxTv_SdtWizardSteps_WizardStepsItem_Description( httpContext.getMessage( "Hojas de rutas", "") );
      AV11WizardSteps.add(AV12WizardStep, 0);
      AV12WizardStep = (app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem)new app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem(remoteHandle, context);
      AV12WizardStep.setgxTv_SdtWizardSteps_WizardStepsItem_Code( "Tab03" );
      AV12WizardStep.setgxTv_SdtWizardSteps_WizardStepsItem_Title( httpContext.getMessage( "Finalizar", "") );
      AV12WizardStep.setgxTv_SdtWizardSteps_WizardStepsItem_Description( httpContext.getMessage( "Finalizar", "") );
      AV11WizardSteps.add(AV12WizardStep, 0);
      if ( (GXutil.strcmp("", AV9CurrentStep)==0) )
      {
         AV10CurrentStepAux = "Tab01" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10CurrentStepAux", AV10CurrentStepAux);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURRENTSTEPAUX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10CurrentStepAux, ""))));
         AV5WebSession.remove(AV20Pgmname+"_Data");
      }
      else
      {
         AV10CurrentStepAux = AV9CurrentStep ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10CurrentStepAux", AV10CurrentStepAux);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURRENTSTEPAUX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10CurrentStepAux, ""))));
      }
      /* Execute user subroutine: 'LOADWIZARDSTEPWC' */
      S112 ();
      if (returnInSub) return;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Steptitles = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Steptitles_Component), GXutil.lower( "WWPBaseObjects.WizardStepsArrowWC")) != 0 )
      {
         WebComp_Steptitles = WebUtils.getWebComponent(getClass(), "app.wwpbaseobjects.wizardstepsarrowwc_impl", remoteHandle, context);
         WebComp_Steptitles_Component = "WWPBaseObjects.WizardStepsArrowWC" ;
      }
      if ( GXutil.len( WebComp_Steptitles_Component) != 0 )
      {
         WebComp_Steptitles.setjustcreated();
         WebComp_Steptitles.componentprepare(new Object[] {"W0009","",AV11WizardSteps,AV10CurrentStepAux});
         WebComp_Steptitles.componentbind(new Object[] {"",""});
      }
   }

   public void S112( )
   {
      /* 'LOADWIZARDSTEPWC' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV10CurrentStepAux, "Tab01") == 0 )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wizardstepwc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wizardstepwc_Component), GXutil.lower( "TEST.AbaranesTab01")) != 0 )
         {
            WebComp_Wizardstepwc = WebUtils.getWebComponent(getClass(), "app.test.abaranestab01_impl", remoteHandle, context);
            WebComp_Wizardstepwc_Component = "TEST.AbaranesTab01" ;
         }
         if ( GXutil.len( WebComp_Wizardstepwc_Component) != 0 )
         {
            WebComp_Wizardstepwc.setjustcreated();
            WebComp_Wizardstepwc.componentprepare(new Object[] {"W0015","",AV20Pgmname+"_Data",AV8PreviousStep,Boolean.valueOf(AV7GoingBack)});
            WebComp_Wizardstepwc.componentbind(new Object[] {""+""+"","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wizardstepwc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0015"+"");
            WebComp_Wizardstepwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      else if ( GXutil.strcmp(AV10CurrentStepAux, "Tab02") == 0 )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wizardstepwc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wizardstepwc_Component), GXutil.lower( "TEST.AbaranesTab02")) != 0 )
         {
            WebComp_Wizardstepwc = WebUtils.getWebComponent(getClass(), "app.test.abaranestab02_impl", remoteHandle, context);
            WebComp_Wizardstepwc_Component = "TEST.AbaranesTab02" ;
         }
         if ( GXutil.len( WebComp_Wizardstepwc_Component) != 0 )
         {
            WebComp_Wizardstepwc.setjustcreated();
            WebComp_Wizardstepwc.componentprepare(new Object[] {"W0015","",AV20Pgmname+"_Data",AV8PreviousStep,Boolean.valueOf(AV7GoingBack)});
            WebComp_Wizardstepwc.componentbind(new Object[] {""+""+"","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wizardstepwc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0015"+"");
            WebComp_Wizardstepwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      else if ( GXutil.strcmp(AV10CurrentStepAux, "Tab03") == 0 )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wizardstepwc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wizardstepwc_Component), GXutil.lower( "TEST.AbaranesTab03")) != 0 )
         {
            WebComp_Wizardstepwc = WebUtils.getWebComponent(getClass(), "app.test.abaranestab03_impl", remoteHandle, context);
            WebComp_Wizardstepwc_Component = "TEST.AbaranesTab03" ;
         }
         if ( GXutil.len( WebComp_Wizardstepwc_Component) != 0 )
         {
            WebComp_Wizardstepwc.setjustcreated();
            WebComp_Wizardstepwc.componentprepare(new Object[] {"W0015","",AV20Pgmname+"_Data",AV8PreviousStep,Boolean.valueOf(AV7GoingBack)});
            WebComp_Wizardstepwc.componentbind(new Object[] {""+""+"","",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wizardstepwc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0015"+"");
            WebComp_Wizardstepwc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
   }

   public void e121A42( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      lblWizardstepdescription_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblWizardstepdescription_Internalname, "Caption", lblWizardstepdescription_Caption, true);
      AV13StepNumber = (byte)(1) ;
      AV21GXV1 = 1 ;
      while ( AV21GXV1 <= AV11WizardSteps.size() )
      {
         AV12WizardStep = (app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem)((app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem)AV11WizardSteps.elementAt(-1+AV21GXV1));
         if ( GXutil.strcmp(AV12WizardStep.getgxTv_SdtWizardSteps_WizardStepsItem_Code(), AV10CurrentStepAux) == 0 )
         {
            if ( ! (GXutil.strcmp("", AV12WizardStep.getgxTv_SdtWizardSteps_WizardStepsItem_Description())==0) )
            {
               lblWizardstepdescription_Caption = GXutil.format( httpContext.getMessage( "Step %1/%2 :: %3", ""), GXutil.trim( GXutil.str( AV13StepNumber, 2, 0)), GXutil.trim( GXutil.str( AV11WizardSteps.size(), 9, 0)), AV12WizardStep.getgxTv_SdtWizardSteps_WizardStepsItem_Description(), "", "", "", "", "", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblWizardstepdescription_Internalname, "Caption", lblWizardstepdescription_Caption, true);
            }
         }
         else
         {
            AV13StepNumber = (byte)(AV13StepNumber+1) ;
         }
         AV21GXV1 = (int)(AV21GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e131A42( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_6_1A42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableWizardMainWithShadow", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='WizardStepsCell'>") ;
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0009"+"", GXutil.rtrim( WebComp_Steptitles_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0009"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Steptitles_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldSteptitles), GXutil.lower( WebComp_Steptitles_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0009"+"");
               }
               WebComp_Steptitles.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldSteptitles), GXutil.lower( WebComp_Steptitles_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblWizardstepdescription_Internalname, lblWizardstepdescription_Caption, "", "", lblWizardstepdescription_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(0), "HLP_TEST\\Abaranes.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='WizardStepsPositionCell'>") ;
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0015"+"", GXutil.rtrim( WebComp_Wizardstepwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0015"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wizardstepwc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWizardstepwc), GXutil.lower( WebComp_Wizardstepwc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0015"+"");
               }
               WebComp_Wizardstepwc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWizardstepwc), GXutil.lower( WebComp_Wizardstepwc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_6_1A42e( true) ;
      }
      else
      {
         wb_table1_6_1A42e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV8PreviousStep = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8PreviousStep", AV8PreviousStep);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPREVIOUSSTEP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8PreviousStep, ""))));
      AV9CurrentStep = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9CurrentStep", AV9CurrentStep);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCURRENTSTEP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9CurrentStep, ""))));
      AV7GoingBack = ((Boolean) getParm(obj,2)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7GoingBack", AV7GoingBack);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGOINGBACK", getSecureSignedToken( "", AV7GoingBack));
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
      pa1A42( ) ;
      ws1A42( ) ;
      we1A42( ) ;
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
      if ( ! ( WebComp_Steptitles == null ) )
      {
         if ( GXutil.len( WebComp_Steptitles_Component) != 0 )
         {
            WebComp_Steptitles.componentthemes();
         }
      }
      if ( ! ( WebComp_Wizardstepwc == null ) )
      {
         if ( GXutil.len( WebComp_Wizardstepwc_Component) != 0 )
         {
            WebComp_Wizardstepwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016425878", true, true);
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
      httpContext.AddJavascriptSource("test/abaranes.js", "?202661016425878", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblWizardstepdescription_Internalname = "WIZARDSTEPDESCRIPTION" ;
      tblTablemain_Internalname = "TABLEMAIN" ;
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
      lblWizardstepdescription_Caption = httpContext.getMessage( "Descripción del paso", "") ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Abaranes", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV11WizardSteps',fld:'vWIZARDSTEPS',pic:'',hsh:true},{av:'AV10CurrentStepAux',fld:'vCURRENTSTEPAUX',pic:'',hsh:true},{av:'AV8PreviousStep',fld:'vPREVIOUSSTEP',pic:'',hsh:true},{av:'AV9CurrentStep',fld:'vCURRENTSTEP',pic:'',hsh:true},{av:'AV7GoingBack',fld:'vGOINGBACK',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'lblWizardstepdescription_Caption',ctrl:'WIZARDSTEPDESCRIPTION',prop:'Caption'}]}");
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
      wcpOAV8PreviousStep = "" ;
      wcpOAV9CurrentStep = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV8PreviousStep = "" ;
      AV9CurrentStep = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV11WizardSteps = new GXBaseCollection<app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem>(app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem.class, "WizardStepsItem", "TexplusNET", remoteHandle);
      AV10CurrentStepAux = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      OldSteptitles = "" ;
      WebComp_Steptitles_Component = "" ;
      OldWizardstepwc = "" ;
      WebComp_Wizardstepwc_Component = "" ;
      AV20Pgmname = "" ;
      AV16Station = "" ;
      GXt_char1 = "" ;
      AV17Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV18Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV19Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV12WizardStep = new app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem(remoteHandle, context);
      AV5WebSession = httpContext.getWebSession();
      sStyleString = "" ;
      lblWizardstepdescription_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV20Pgmname = "TEST.Abaranes" ;
      /* GeneXus formulas. */
      AV20Pgmname = "TEST.Abaranes" ;
      Gx_err = (short)(0) ;
      WebComp_Steptitles = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wizardstepwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV13StepNumber ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV21GXV1 ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String OldSteptitles ;
   private String WebComp_Steptitles_Component ;
   private String OldWizardstepwc ;
   private String WebComp_Wizardstepwc_Component ;
   private String AV20Pgmname ;
   private String AV16Station ;
   private String GXt_char1 ;
   private String AV17Emprcod ;
   private String GXv_char2[] ;
   private String AV18Emprnom ;
   private String GXv_char3[] ;
   private String AV19Usurcod ;
   private String GXv_char4[] ;
   private String lblWizardstepdescription_Caption ;
   private String lblWizardstepdescription_Internalname ;
   private String sStyleString ;
   private String tblTablemain_Internalname ;
   private String lblWizardstepdescription_Jsonclick ;
   private boolean wcpOAV7GoingBack ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV7GoingBack ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Steptitles ;
   private boolean bDynCreated_Wizardstepwc ;
   private String wcpOAV8PreviousStep ;
   private String wcpOAV9CurrentStep ;
   private String AV8PreviousStep ;
   private String AV9CurrentStep ;
   private String AV10CurrentStepAux ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Steptitles ;
   private GXWebComponent WebComp_Wizardstepwc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV5WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem> AV11WizardSteps ;
   private app.wwpbaseobjects.SdtWizardSteps_WizardStepsItem AV12WizardStep ;
}

