package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class multiformpasoshorizontalwc_impl extends GXWebComponent
{
   public multiformpasoshorizontalwc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public multiformpasoshorizontalwc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( multiformpasoshorizontalwc_impl.class ));
   }

   public multiformpasoshorizontalwc_impl( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "Pasos") ;
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV25Pasos);
               AV24PasoActual = httpContext.GetPar( "PasoActual") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24PasoActual", AV24PasoActual);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV25Pasos,AV24PasoActual});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
               gxfirstwebparm = httpContext.GetFirstPar( "Pasos") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Pasos") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridwizardsteps") == 0 )
            {
               gxnrgridwizardsteps_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridwizardsteps") == 0 )
            {
               gxgrgridwizardsteps_refresh_invoke( ) ;
               return  ;
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
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgridwizardsteps_newrow_invoke( )
   {
      nRC_GXsfl_5 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_5"))) ;
      nGXsfl_5_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_5_idx"))) ;
      sGXsfl_5_idx = httpContext.GetPar( "sGXsfl_5_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridwizardsteps_newrow( ) ;
      /* End function gxnrGridwizardsteps_newrow_invoke */
   }

   public void gxgrgridwizardsteps_refresh_invoke( )
   {
      AV17StepRealNumber = (short)(GXutil.lval( httpContext.GetPar( "StepRealNumber"))) ;
      AV14SelectedStepNumber = (short)(GXutil.lval( httpContext.GetPar( "SelectedStepNumber"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV27PasosAux);
      AV16StepNumber = (short)(GXutil.lval( httpContext.GetPar( "StepNumber"))) ;
      AV21WizardStepsCount = (short)(GXutil.lval( httpContext.GetPar( "WizardStepsCount"))) ;
      AV6FirstIsDummy = GXutil.strtobool( httpContext.GetPar( "FirstIsDummy")) ;
      AV8LastIsDummy = GXutil.strtobool( httpContext.GetPar( "LastIsDummy")) ;
      AV11PenultimateIsDummy = GXutil.strtobool( httpContext.GetPar( "PenultimateIsDummy")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridwizardsteps_refresh( AV17StepRealNumber, AV14SelectedStepNumber, AV27PasosAux, AV16StepNumber, AV21WizardStepsCount, AV6FirstIsDummy, AV8LastIsDummy, AV11PenultimateIsDummy, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridwizardsteps_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1V52( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
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
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), false);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( "Pasos horizontales", "")) ;
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
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"FormColorWhite\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"FormColorWhite\" data-gx-class=\"FormColorWhite\" novalidate action=\""+formatLink("app.multiformpasoshorizontalwc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24PasoActual))}, new String[] {"Pasos","PasoActual"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "FormColorWhite", true);
         }
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "FormColorWhite" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPREALNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV17StepRealNumber), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSELECTEDSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV14SelectedStepNumber), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPASOSAUX", getSecureSignedToken( sPrefix, AV27PasosAux));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV16StepNumber), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vWIZARDSTEPSCOUNT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21WizardStepsCount), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFIRSTISDUMMY", getSecureSignedToken( sPrefix, AV6FirstIsDummy));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLASTISDUMMY", getSecureSignedToken( sPrefix, AV8LastIsDummy));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPENULTIMATEISDUMMY", getSecureSignedToken( sPrefix, AV11PenultimateIsDummy));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Pasosaux", AV27PasosAux);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Pasosaux", AV27PasosAux);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Pasosaux", getSecureSignedToken( sPrefix, AV27PasosAux));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_5", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_5, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24PasoActual", wcpOAV24PasoActual);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTEPREALNUMBER", GXutil.ltrim( localUtil.ntoc( AV17StepRealNumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPREALNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV17StepRealNumber), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSELECTEDSTEPNUMBER", GXutil.ltrim( localUtil.ntoc( AV14SelectedStepNumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSELECTEDSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV14SelectedStepNumber), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPASOSAUX", AV27PasosAux);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPASOSAUX", AV27PasosAux);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPASOSAUX", getSecureSignedToken( sPrefix, AV27PasosAux));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTEPNUMBER", GXutil.ltrim( localUtil.ntoc( AV16StepNumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV16StepNumber), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWIZARDSTEPSCOUNT", GXutil.ltrim( localUtil.ntoc( AV21WizardStepsCount, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vWIZARDSTEPSCOUNT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21WizardStepsCount), "ZZZ9")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vFIRSTISDUMMY", AV6FirstIsDummy);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFIRSTISDUMMY", getSecureSignedToken( sPrefix, AV6FirstIsDummy));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vLASTISDUMMY", AV8LastIsDummy);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLASTISDUMMY", getSecureSignedToken( sPrefix, AV8LastIsDummy));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vPENULTIMATEISDUMMY", AV11PenultimateIsDummy);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPENULTIMATEISDUMMY", getSecureSignedToken( sPrefix, AV11PenultimateIsDummy));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPASOS", AV25Pasos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPASOS", AV25Pasos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPASOACTUAL", AV24PasoActual);
   }

   public void renderHtmlCloseForm1V52( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
         httpContext.SendComponentObjects();
         httpContext.SendServerCommands();
         httpContext.SendState();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "</form>") ;
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         include_jscripts( ) ;
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "MultiformPasosHorizontalWC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Pasos horizontales", "") ;
   }

   public void wb1V50( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.multiformpasoshorizontalwc");
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         wb_table1_2_1V52( true) ;
      }
      else
      {
         wb_table1_2_1V52( false) ;
      }
      return  ;
   }

   public void wb_table1_2_1V52e( boolean wbgen )
   {
      if ( wbgen )
      {
      }
      if ( wbEnd == 5 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridwizardstepsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV30GXV1 = nGXsfl_5_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridwizardstepsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridwizardsteps", GridwizardstepsContainer, subGridwizardsteps_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridwizardstepsContainerData", GridwizardstepsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridwizardstepsContainerData"+"V", GridwizardstepsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridwizardstepsContainerData"+"V"+"\" value='"+GridwizardstepsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1V52( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( "Pasos horizontales", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup1V50( ) ;
         }
      }
   }

   public void ws1V52( )
   {
      start1V52( ) ;
      evt1V52( ) ;
   }

   public void evt1V52( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
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
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1V50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1V50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "GRIDWIZARDSTEPS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1V50( ) ;
                           }
                           nGXsfl_5_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_5_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_5_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_52( ) ;
                           AV30GXV1 = nGXsfl_5_idx ;
                           if ( ( AV27PasosAux.size() >= AV30GXV1 ) && ( AV30GXV1 > 0 ) )
                           {
                              AV27PasosAux.currentItem( ((app.SdtPasos__SDT_Pasos__SDTItem)AV27PasosAux.elementAt(-1+AV30GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       /* Execute user event: Start */
                                       e111V52 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDWIZARDSTEPS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       e121V52 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1V50( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1V52( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1V52( ) ;
         }
      }
   }

   public void pa1V52( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
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

   public void gxnrgridwizardsteps_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_52( ) ;
      while ( nGXsfl_5_idx <= nRC_GXsfl_5 )
      {
         sendrow_52( ) ;
         nGXsfl_5_idx = ((subGridwizardsteps_Islastpage==1)&&(nGXsfl_5_idx+1>subgridwizardsteps_fnc_recordsperpage( )) ? 1 : nGXsfl_5_idx+1) ;
         sGXsfl_5_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_5_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_52( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridwizardstepsContainer)) ;
      /* End function gxnrGridwizardsteps_newrow */
   }

   public void gxgrgridwizardsteps_refresh( short AV17StepRealNumber ,
                                            short AV14SelectedStepNumber ,
                                            GXBaseCollection<app.SdtPasos__SDT_Pasos__SDTItem> AV27PasosAux ,
                                            short AV16StepNumber ,
                                            short AV21WizardStepsCount ,
                                            boolean AV6FirstIsDummy ,
                                            boolean AV8LastIsDummy ,
                                            boolean AV11PenultimateIsDummy ,
                                            String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRIDWIZARDSTEPS_nCurrentRecord = 0 ;
      rf1V52( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridwizardsteps_refresh */
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
      rf1V52( ) ;
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
      edtavPasosaux__titulo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPasosaux__titulo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPasosaux__titulo_Enabled), 5, 0), !bGXsfl_5_Refreshing);
   }

   public void rf1V52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridwizardstepsContainer.ClearRows();
      }
      wbStart = (short)(5) ;
      nGXsfl_5_idx = 1 ;
      sGXsfl_5_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_5_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_52( ) ;
      bGXsfl_5_Refreshing = true ;
      GridwizardstepsContainer.AddObjectProperty("GridName", "Gridwizardsteps");
      GridwizardstepsContainer.AddObjectProperty("CmpContext", sPrefix);
      GridwizardstepsContainer.AddObjectProperty("InMasterPage", "false");
      GridwizardstepsContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleSteps"));
      GridwizardstepsContainer.AddObjectProperty("Class", "FreeStyleSteps");
      GridwizardstepsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridwizardstepsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridwizardstepsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridwizardsteps_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridwizardstepsContainer.setPageSize( subgridwizardsteps_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_52( ) ;
         e121V52 ();
         wbEnd = (short)(5) ;
         wb1V50( ) ;
      }
      bGXsfl_5_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1V52( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTEPREALNUMBER", GXutil.ltrim( localUtil.ntoc( AV17StepRealNumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPREALNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV17StepRealNumber), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSELECTEDSTEPNUMBER", GXutil.ltrim( localUtil.ntoc( AV14SelectedStepNumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSELECTEDSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV14SelectedStepNumber), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPASOSAUX", AV27PasosAux);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPASOSAUX", AV27PasosAux);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPASOSAUX", getSecureSignedToken( sPrefix, AV27PasosAux));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTEPNUMBER", GXutil.ltrim( localUtil.ntoc( AV16StepNumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV16StepNumber), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWIZARDSTEPSCOUNT", GXutil.ltrim( localUtil.ntoc( AV21WizardStepsCount, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vWIZARDSTEPSCOUNT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21WizardStepsCount), "ZZZ9")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vFIRSTISDUMMY", AV6FirstIsDummy);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFIRSTISDUMMY", getSecureSignedToken( sPrefix, AV6FirstIsDummy));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vLASTISDUMMY", AV8LastIsDummy);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLASTISDUMMY", getSecureSignedToken( sPrefix, AV8LastIsDummy));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vPENULTIMATEISDUMMY", AV11PenultimateIsDummy);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPENULTIMATEISDUMMY", getSecureSignedToken( sPrefix, AV11PenultimateIsDummy));
   }

   public int subgridwizardsteps_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgridwizardsteps_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgridwizardsteps_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgridwizardsteps_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavPasosaux__titulo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPasosaux__titulo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPasosaux__titulo_Enabled), 5, 0), !bGXsfl_5_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1V50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111V52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Pasosaux"), AV27PasosAux);
         /* Read saved values. */
         nRC_GXsfl_5 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_5"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV24PasoActual = httpContext.cgiGet( sPrefix+"wcpOAV24PasoActual") ;
         nRC_GXsfl_5 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_5"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_5_fel_idx = 0 ;
         while ( nGXsfl_5_fel_idx < nRC_GXsfl_5 )
         {
            nGXsfl_5_fel_idx = ((subGridwizardsteps_Islastpage==1)&&(nGXsfl_5_fel_idx+1>subgridwizardsteps_fnc_recordsperpage( )) ? 1 : nGXsfl_5_fel_idx+1) ;
            sGXsfl_5_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_5_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_52( ) ;
            AV30GXV1 = nGXsfl_5_fel_idx ;
            if ( ( AV27PasosAux.size() >= AV30GXV1 ) && ( AV30GXV1 > 0 ) )
            {
               AV27PasosAux.currentItem( ((app.SdtPasos__SDT_Pasos__SDTItem)AV27PasosAux.elementAt(-1+AV30GXV1)) );
            }
         }
         if ( nGXsfl_5_fel_idx == 0 )
         {
            nGXsfl_5_idx = 1 ;
            sGXsfl_5_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_5_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_52( ) ;
         }
         nGXsfl_5_fel_idx = 1 ;
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
      e111V52 ();
      if (returnInSub) return;
   }

   public void e111V52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV32Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      multiformpasoshorizontalwc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Station = GXt_char1 ;
      GXv_char2[0] = AV33Emprcod ;
      GXv_char3[0] = AV34Emprnom ;
      GXv_char4[0] = AV35Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV32Station, GXv_char2, GXv_char3, GXv_char4) ;
      multiformpasoshorizontalwc_impl.this.AV33Emprcod = GXv_char2[0] ;
      multiformpasoshorizontalwc_impl.this.AV34Emprnom = GXv_char3[0] ;
      multiformpasoshorizontalwc_impl.this.AV35Usurcod = GXv_char4[0] ;
      AV9MaxStepsToShow = (short)(11) ;
      AV10MaxStepsToShowInXS = (short)(5) ;
      AV14SelectedStepNumber = (short)(1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14SelectedStepNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14SelectedStepNumber), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSELECTEDSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV14SelectedStepNumber), "ZZZ9")));
      AV36GXV3 = 1 ;
      while ( AV36GXV3 <= AV25Pasos.size() )
      {
         AV23Paso = (app.SdtPasos__SDT_Pasos__SDTItem)((app.SdtPasos__SDT_Pasos__SDTItem)AV25Pasos.elementAt(-1+AV36GXV3));
         if ( GXutil.strcmp(GXutil.trim( GXutil.lower( AV23Paso.getgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso())), GXutil.trim( GXutil.lower( AV24PasoActual))) == 0 )
         {
            if (true) break;
         }
         else
         {
            AV14SelectedStepNumber = (short)(AV14SelectedStepNumber+1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14SelectedStepNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14SelectedStepNumber), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSELECTEDSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV14SelectedStepNumber), "ZZZ9")));
         }
         AV36GXV3 = (int)(AV36GXV3+1) ;
      }
      AV17StepRealNumber = (short)(1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17StepRealNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17StepRealNumber), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPREALNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV17StepRealNumber), "ZZZ9")));
      AV27PasosAux = AV25Pasos.Clone() ;
      gx_BV5 = true ;
      AV6FirstIsDummy = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FirstIsDummy", AV6FirstIsDummy);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFIRSTISDUMMY", getSecureSignedToken( sPrefix, AV6FirstIsDummy));
      AV12SecondIsDummy = false ;
      AV11PenultimateIsDummy = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11PenultimateIsDummy", AV11PenultimateIsDummy);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPENULTIMATEISDUMMY", getSecureSignedToken( sPrefix, AV11PenultimateIsDummy));
      AV8LastIsDummy = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8LastIsDummy", AV8LastIsDummy);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLASTISDUMMY", getSecureSignedToken( sPrefix, AV8LastIsDummy));
      if ( AV27PasosAux.size() > AV9MaxStepsToShow )
      {
         if ( AV14SelectedStepNumber > AV27PasosAux.size() )
         {
            AV14SelectedStepNumber = (short)(1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14SelectedStepNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14SelectedStepNumber), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSELECTEDSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV14SelectedStepNumber), "ZZZ9")));
         }
         AV15StartIndex = (short)(1) ;
         if ( ( AV14SelectedStepNumber + 3 - AV9MaxStepsToShow / (double) ( 2 ) > 0 ) )
         {
            AV15StartIndex = (short)(AV14SelectedStepNumber+3-AV9MaxStepsToShow/ (double) (2)) ;
            if ( AV15StartIndex + ( AV9MaxStepsToShow - 2 ) > AV27PasosAux.size() + 1 )
            {
               AV15StartIndex = (short)(AV27PasosAux.size()-(AV9MaxStepsToShow-2)+1) ;
            }
         }
         if ( AV15StartIndex > 3 )
         {
            AV17StepRealNumber = AV15StartIndex ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17StepRealNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17StepRealNumber), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPREALNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV17StepRealNumber), "ZZZ9")));
            AV6FirstIsDummy = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6FirstIsDummy", AV6FirstIsDummy);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFIRSTISDUMMY", getSecureSignedToken( sPrefix, AV6FirstIsDummy));
            AV12SecondIsDummy = true ;
            ((app.SdtPasos__SDT_Pasos__SDTItem)AV27PasosAux.elementAt(-1+2)).setgxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo( "..." );
            while ( AV15StartIndex > 3 )
            {
               AV27PasosAux.removeItem(3);
               gx_BV5 = true ;
               AV15StartIndex = (short)(AV15StartIndex-1) ;
               AV14SelectedStepNumber = (short)(AV14SelectedStepNumber-1) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14SelectedStepNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14SelectedStepNumber), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSELECTEDSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV14SelectedStepNumber), "ZZZ9")));
            }
         }
         if ( AV27PasosAux.size() > AV9MaxStepsToShow )
         {
            AV8LastIsDummy = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8LastIsDummy", AV8LastIsDummy);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLASTISDUMMY", getSecureSignedToken( sPrefix, AV8LastIsDummy));
            AV11PenultimateIsDummy = true ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11PenultimateIsDummy", AV11PenultimateIsDummy);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPENULTIMATEISDUMMY", getSecureSignedToken( sPrefix, AV11PenultimateIsDummy));
            ((app.SdtPasos__SDT_Pasos__SDTItem)AV27PasosAux.elementAt(-1+AV27PasosAux.size()-1)).setgxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo( "" );
            while ( AV27PasosAux.size() > AV9MaxStepsToShow )
            {
               AV27PasosAux.removeItem(AV27PasosAux.size()-2);
               gx_BV5 = true ;
            }
         }
      }
      AV21WizardStepsCount = (short)(AV27PasosAux.size()) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21WizardStepsCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21WizardStepsCount), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vWIZARDSTEPSCOUNT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV21WizardStepsCount), "ZZZ9")));
      if ( AV27PasosAux.size() > AV10MaxStepsToShowInXS )
      {
         AV23Paso = (app.SdtPasos__SDT_Pasos__SDTItem)new app.SdtPasos__SDT_Pasos__SDTItem(remoteHandle, context);
         AV23Paso.setgxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo( "DummiesXS_Test" );
         AV23Paso.setgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso( "FirstDummyXS" );
         AV27PasosAux.add(AV23Paso, 2);
         gx_BV5 = true ;
         AV23Paso = (app.SdtPasos__SDT_Pasos__SDTItem)new app.SdtPasos__SDT_Pasos__SDTItem(remoteHandle, context);
         AV23Paso.setgxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo( "DummiesXS_Test" );
         AV23Paso.setgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso( "LastDummyXS" );
         AV27PasosAux.add(AV23Paso, AV27PasosAux.size()-1);
         gx_BV5 = true ;
      }
      AV16StepNumber = (short)(1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16StepNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16StepNumber), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV16StepNumber), "ZZZ9")));
   }

   private void e121V52( )
   {
      /* Gridwizardsteps_Load Routine */
      returnInSub = false ;
      AV30GXV1 = 1 ;
      while ( AV30GXV1 <= AV27PasosAux.size() )
      {
         AV27PasosAux.currentItem( ((app.SdtPasos__SDT_Pasos__SDTItem)AV27PasosAux.elementAt(-1+AV30GXV1)) );
         lblStepnumber_Visible = 0 ;
         lblStepnumber_Caption = localUtil.format( DecimalUtil.doubleToDec(AV17StepRealNumber), "ZZZ9") ;
         tblTablestepbulletlineleft_Class = "TableStepBulletLine" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTablestepbulletlineleft_Internalname, "Class", tblTablestepbulletlineleft_Class, !bGXsfl_5_Refreshing);
         tblTablestepbulletlineright_Class = "TableStepBulletLine" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTablestepbulletlineright_Internalname, "Class", tblTablestepbulletlineright_Class, !bGXsfl_5_Refreshing);
         tblTblcontainerstep_Class = "TableContainerStepBullet" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTblcontainerstep_Internalname, "Class", tblTblcontainerstep_Class, !bGXsfl_5_Refreshing);
         if ( ( AV14SelectedStepNumber != AV16StepNumber ) && ( GXutil.strcmp(((app.SdtPasos__SDT_Pasos__SDTItem)(AV27PasosAux.currentItem())).getgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso(), "FirstDummyXS") != 0 ) && ( GXutil.strcmp(((app.SdtPasos__SDT_Pasos__SDTItem)(AV27PasosAux.currentItem())).getgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso(), "LastDummyXS") != 0 ) && ( AV16StepNumber > 1 ) && ( AV16StepNumber < AV21WizardStepsCount ) )
         {
            if ( ( AV14SelectedStepNumber <= 3 ) && ( AV16StepNumber > 3 ) )
            {
               tblTblcontainerstep_Class = tblTblcontainerstep_Class+" hidden-xs" ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTblcontainerstep_Internalname, "Class", tblTblcontainerstep_Class, !bGXsfl_5_Refreshing);
            }
            if ( ( AV14SelectedStepNumber > 3 ) && ( AV16StepNumber > 1 ) && ( AV14SelectedStepNumber < AV21WizardStepsCount - 2 ) )
            {
               tblTblcontainerstep_Class = tblTblcontainerstep_Class+" hidden-xs" ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTblcontainerstep_Internalname, "Class", tblTblcontainerstep_Class, !bGXsfl_5_Refreshing);
            }
            if ( ( AV14SelectedStepNumber >= AV21WizardStepsCount - 2 ) && ( AV16StepNumber < AV21WizardStepsCount - 2 ) )
            {
               tblTblcontainerstep_Class = tblTblcontainerstep_Class+" hidden-xs" ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTblcontainerstep_Internalname, "Class", tblTblcontainerstep_Class, !bGXsfl_5_Refreshing);
            }
         }
         if ( AV16StepNumber < AV14SelectedStepNumber )
         {
            divTablestepitem_Class = "TableStepBulletChecked" ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, divTablestepitem_Internalname, "Class", divTablestepitem_Class, !bGXsfl_5_Refreshing);
            tblTablestepbulletlineleft_Class = "TableStepBulletLineChecked" ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTablestepbulletlineleft_Internalname, "Class", tblTablestepbulletlineleft_Class, !bGXsfl_5_Refreshing);
            tblTablestepbulletlineright_Class = "TableStepBulletLineChecked" ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTablestepbulletlineright_Internalname, "Class", tblTablestepbulletlineright_Class, !bGXsfl_5_Refreshing);
            edtavPasosaux__titulo_Class = "AttributeStepBullet" ;
         }
         else if ( AV16StepNumber == AV14SelectedStepNumber )
         {
            lblStepnumber_Visible = 1 ;
            lblStepnumber_Class = "StepNumberBulletSelected" ;
            divTablestepitem_Class = "TableStepBulletSelected" ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, divTablestepitem_Internalname, "Class", divTablestepitem_Class, !bGXsfl_5_Refreshing);
            tblTablestepbulletlineleft_Class = "TableStepBulletLineChecked" ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTablestepbulletlineleft_Internalname, "Class", tblTablestepbulletlineleft_Class, !bGXsfl_5_Refreshing);
            edtavPasosaux__titulo_Class = "AttributeStepBulletSelected" ;
         }
         else if ( AV16StepNumber > AV14SelectedStepNumber )
         {
            lblStepnumber_Class = "StepNumberBullet" ;
            lblStepnumber_Visible = 1 ;
            divTablestepitem_Class = "TableStepBullet" ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, divTablestepitem_Internalname, "Class", divTablestepitem_Class, !bGXsfl_5_Refreshing);
            edtavPasosaux__titulo_Class = "AttributeStepBulletUnSelected" ;
         }
         tblTblcontainerstep_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTblcontainerstep_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTblcontainerstep_Visible), 5, 0), !bGXsfl_5_Refreshing);
         if ( ! GXutil.contains( ((app.SdtPasos__SDT_Pasos__SDTItem)(AV27PasosAux.currentItem())).getgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso(), "DummyXS") )
         {
            if ( ( AV16StepNumber == 1 ) && AV6FirstIsDummy )
            {
               lblStepnumber_Caption = GXutil.trim( GXutil.str( AV16StepNumber, 4, 0)) ;
            }
            else if ( ( AV16StepNumber == AV21WizardStepsCount ) && AV8LastIsDummy )
            {
               lblStepnumber_Caption = GXutil.trim( GXutil.str( AV27PasosAux.size(), 9, 0)) ;
            }
            else if ( ( AV16StepNumber == AV21WizardStepsCount - 1 ) && AV11PenultimateIsDummy )
            {
               lblStepnumber_Caption = "..." ;
            }
            else if ( ( AV16StepNumber == 2 ) && AV6FirstIsDummy )
            {
            }
            else
            {
               AV17StepRealNumber = (short)(AV17StepRealNumber+1) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17StepRealNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17StepRealNumber), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPREALNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV17StepRealNumber), "ZZZ9")));
            }
            AV16StepNumber = (short)(AV16StepNumber+1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16StepNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16StepNumber), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTEPNUMBER", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV16StepNumber), "ZZZ9")));
         }
         else
         {
            lblStepnumber_Caption = "..." ;
            tblTblcontainerstep_Class = "TableContainerStepBullet hidden-sm hidden-lg hidden-md" ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTblcontainerstep_Internalname, "Class", tblTblcontainerstep_Class, !bGXsfl_5_Refreshing);
            if ( ( ( AV14SelectedStepNumber <= 3 ) && ( GXutil.strcmp(((app.SdtPasos__SDT_Pasos__SDTItem)(AV27PasosAux.currentItem())).getgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso(), "FirstDummyXS") == 0 ) ) || ( ( AV14SelectedStepNumber >= AV21WizardStepsCount - 2 ) && ( GXutil.strcmp(((app.SdtPasos__SDT_Pasos__SDTItem)(AV27PasosAux.currentItem())).getgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso(), "LastDummyXS") == 0 ) ) )
            {
               tblTblcontainerstep_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTblcontainerstep_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTblcontainerstep_Visible), 5, 0), !bGXsfl_5_Refreshing);
            }
            if ( ( AV14SelectedStepNumber > 3 ) && ( GXutil.strcmp(((app.SdtPasos__SDT_Pasos__SDTItem)(AV27PasosAux.currentItem())).getgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso(), "FirstDummyXS") == 0 ) )
            {
               divTablestepitem_Class = "TableStepExtraBulletChecked" ;
               httpContext.ajax_rsp_assign_prop(sPrefix, false, divTablestepitem_Internalname, "Class", divTablestepitem_Class, !bGXsfl_5_Refreshing);
               lblStepnumber_Visible = 1 ;
            }
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(5) ;
         }
         sendrow_52( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_5_Refreshing )
         {
            httpContext.doAjaxLoad(5, GridwizardstepsRow);
         }
         AV30GXV1 = (int)(AV30GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void wb_table1_2_1V52( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableWizardSteps TableAlignedCentered", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='WizardStepsContainerCell'>") ;
         /*  Grid Control  */
         GridwizardstepsContainer.SetIsFreestyle(true);
         GridwizardstepsContainer.SetWrapped(nGXWrapped);
         startgridcontrol5( ) ;
      }
      if ( wbEnd == 5 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_5 = (int)(nGXsfl_5_idx-1) ;
         if ( GridwizardstepsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV30GXV1 = nGXsfl_5_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridwizardstepsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridwizardsteps", GridwizardstepsContainer, subGridwizardsteps_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridwizardstepsContainerData", GridwizardstepsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridwizardstepsContainerData"+"V", GridwizardstepsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridwizardstepsContainerData"+"V"+"\" value='"+GridwizardstepsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1V52e( true) ;
      }
      else
      {
         wb_table1_2_1V52e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV25Pasos = (GXBaseCollection<app.SdtPasos__SDT_Pasos__SDTItem>)getParm(obj,0) ;
      AV24PasoActual = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24PasoActual", AV24PasoActual);
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
      pa1V52( ) ;
      ws1V52( ) ;
      we1V52( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV25Pasos = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV24PasoActual = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1V52( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "multiformpasoshorizontalwc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1V52( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV25Pasos = (GXBaseCollection<app.SdtPasos__SDT_Pasos__SDTItem>)getParm(obj,2) ;
         AV24PasoActual = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24PasoActual", AV24PasoActual);
      }
      wcpOAV24PasoActual = httpContext.cgiGet( sPrefix+"wcpOAV24PasoActual") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV24PasoActual, wcpOAV24PasoActual) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV24PasoActual = AV24PasoActual ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV25Pasos = httpContext.cgiGet( sPrefix+"AV25Pasos_CTRL") ;
      if ( GXutil.len( sCtrlAV25Pasos) > 0 )
      {
         AV25Pasos = new GXBaseCollection<app.SdtPasos__SDT_Pasos__SDTItem>() ;
      }
      else
      {
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"AV25Pasos_PARM"), AV25Pasos);
      }
      sCtrlAV24PasoActual = httpContext.cgiGet( sPrefix+"AV24PasoActual_CTRL") ;
      if ( GXutil.len( sCtrlAV24PasoActual) > 0 )
      {
         AV24PasoActual = httpContext.cgiGet( sCtrlAV24PasoActual) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24PasoActual", AV24PasoActual);
      }
      else
      {
         AV24PasoActual = httpContext.cgiGet( sPrefix+"AV24PasoActual_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa1V52( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1V52( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws1V52( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"AV25Pasos_PARM", AV25Pasos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"AV25Pasos_PARM", AV25Pasos);
      }
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25Pasos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Pasos_CTRL", GXutil.rtrim( sCtrlAV25Pasos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24PasoActual_PARM", AV24PasoActual);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24PasoActual)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24PasoActual_CTRL", GXutil.rtrim( sCtrlAV24PasoActual));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we1V52( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015555584", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("multiformpasoshorizontalwc.js", "?202661015555585", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_52( )
   {
      lblDummybulletlineleft_Internalname = sPrefix+"DUMMYBULLETLINELEFT_"+sGXsfl_5_idx ;
      lblStepnumber_Internalname = sPrefix+"STEPNUMBER_"+sGXsfl_5_idx ;
      lblDummybulletlineright_Internalname = sPrefix+"DUMMYBULLETLINERIGHT_"+sGXsfl_5_idx ;
      edtavPasosaux__titulo_Internalname = sPrefix+"PASOSAUX__TITULO_"+sGXsfl_5_idx ;
   }

   public void subsflControlProps_fel_52( )
   {
      lblDummybulletlineleft_Internalname = sPrefix+"DUMMYBULLETLINELEFT_"+sGXsfl_5_fel_idx ;
      lblStepnumber_Internalname = sPrefix+"STEPNUMBER_"+sGXsfl_5_fel_idx ;
      lblDummybulletlineright_Internalname = sPrefix+"DUMMYBULLETLINERIGHT_"+sGXsfl_5_fel_idx ;
      edtavPasosaux__titulo_Internalname = sPrefix+"PASOSAUX__TITULO_"+sGXsfl_5_fel_idx ;
   }

   public void sendrow_52( )
   {
      subsflControlProps_52( ) ;
      wb1V50( ) ;
      GridwizardstepsRow = GXWebRow.GetNew(context,GridwizardstepsContainer) ;
      if ( subGridwizardsteps_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridwizardsteps_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridwizardsteps_Class, "") != 0 )
         {
            subGridwizardsteps_Linesclass = subGridwizardsteps_Class+"Odd" ;
         }
      }
      else if ( subGridwizardsteps_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridwizardsteps_Backstyle = (byte)(0) ;
         subGridwizardsteps_Backcolor = subGridwizardsteps_Allbackcolor ;
         if ( GXutil.strcmp(subGridwizardsteps_Class, "") != 0 )
         {
            subGridwizardsteps_Linesclass = subGridwizardsteps_Class+"Uniform" ;
         }
      }
      else if ( subGridwizardsteps_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridwizardsteps_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridwizardsteps_Class, "") != 0 )
         {
            subGridwizardsteps_Linesclass = subGridwizardsteps_Class+"Odd" ;
         }
         subGridwizardsteps_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGridwizardsteps_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridwizardsteps_Backstyle = (byte)(1) ;
         subGridwizardsteps_Backcolor = (int)(0xFFFFFF) ;
         if ( GXutil.strcmp(subGridwizardsteps_Class, "") != 0 )
         {
            subGridwizardsteps_Linesclass = subGridwizardsteps_Class+"Odd" ;
         }
      }
      /* Start of Columns property logic. */
      GridwizardstepsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGridwizardsteps_Linesclass,""});
      GridwizardstepsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      GridwizardstepsRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTblcontainerstep_Internalname+"_"+sGXsfl_5_idx,Integer.valueOf(tblTblcontainerstep_Visible),tblTblcontainerstep_Class,"","","","","","",Integer.valueOf(0),Integer.valueOf(0),"","","","px","px",""});
      GridwizardstepsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridwizardstepsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      GridwizardstepsRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTablestepbulletline_Internalname+"_"+sGXsfl_5_idx,Integer.valueOf(1),"","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridwizardstepsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridwizardstepsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","","TableStepBulletLineCell"});
      /* Table start */
      GridwizardstepsRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTablestepbulletlineleft_Internalname+"_"+sGXsfl_5_idx,Integer.valueOf(1),tblTablestepbulletlineleft_Class,"","","","","","",Integer.valueOf(0),Integer.valueOf(0),"","","","px","px",""});
      GridwizardstepsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridwizardstepsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      GridwizardstepsRow.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblDummybulletlineleft_Internalname," ","","",lblDummybulletlineleft_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("cell");
      }
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("row");
      }
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("table");
      }
      /* End of table */
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("cell");
      }
      GridwizardstepsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridwizardstepsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divLayout_tablestepitem_Internalname+"_"+sGXsfl_5_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Section","left","top","","","div"});
      /* Div Control */
      GridwizardstepsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Section","left","top"," "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ","","div"});
      /* Div Control */
      GridwizardstepsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTablestepitem_Internalname+"_"+sGXsfl_5_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",divTablestepitem_Class,"left","top","","","div"});
      /* Div Control */
      GridwizardstepsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      GridwizardstepsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 StepNumberBulletCell","left","top","","","div"});
      /* Text block */
      GridwizardstepsRow.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblStepnumber_Internalname,lblStepnumber_Caption,"","",lblStepnumber_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+""+"'","",lblStepnumber_Class,Integer.valueOf(0),"",Integer.valueOf(lblStepnumber_Visible),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      GridwizardstepsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridwizardstepsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridwizardstepsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridwizardstepsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridwizardstepsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("cell");
      }
      GridwizardstepsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","","TableStepBulletLineCell"});
      /* Table start */
      GridwizardstepsRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTablestepbulletlineright_Internalname+"_"+sGXsfl_5_idx,Integer.valueOf(1),tblTablestepbulletlineright_Class,"","","","","","",Integer.valueOf(0),Integer.valueOf(0),"","","","px","px",""});
      GridwizardstepsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridwizardstepsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      GridwizardstepsRow.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblDummybulletlineright_Internalname," ","","",lblDummybulletlineright_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("cell");
      }
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("row");
      }
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("table");
      }
      /* End of table */
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("cell");
      }
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("row");
      }
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("table");
      }
      /* End of table */
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("cell");
      }
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("row");
      }
      sendrow_5230( ) ;
   }

   public void sendrow_5230( )
   {
      GridwizardstepsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridwizardstepsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","","AttributeStepBulletCell"});
      /* Single line edit */
      ROClassString = edtavPasosaux__titulo_Class ;
      GridwizardstepsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPasosaux__titulo_Internalname,((app.SdtPasos__SDT_Pasos__SDTItem)AV27PasosAux.elementAt(-1+AV30GXV1)).getgxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPasosaux__titulo_Jsonclick,Integer.valueOf(0),edtavPasosaux__titulo_Class,"",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavPasosaux__titulo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(80),"chr",Integer.valueOf(1),"row",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("cell");
      }
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("row");
      }
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("table");
      }
      /* End of table */
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("cell");
      }
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         GridwizardstepsContainer.CloseTag("row");
      }
      send_integrity_lvl_hashes1V52( ) ;
      /* End of Columns property logic. */
      GridwizardstepsContainer.AddRow(GridwizardstepsRow);
      nGXsfl_5_idx = ((subGridwizardsteps_Islastpage==1)&&(nGXsfl_5_idx+1>subgridwizardsteps_fnc_recordsperpage( )) ? 1 : nGXsfl_5_idx+1) ;
      sGXsfl_5_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_5_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_52( ) ;
      /* End function sendrow_52 */
   }

   public void startgridcontrol5( )
   {
      if ( GridwizardstepsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridwizardstepsContainer"+"DivS\" data-gxgridid=\"5\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridwizardsteps_Internalname, subGridwizardsteps_Internalname, "", "FreeStyleSteps", 0, "", "", 1, 2, sStyleString, "", "", 0);
         GridwizardstepsContainer.AddObjectProperty("GridName", "Gridwizardsteps");
      }
      else
      {
         GridwizardstepsContainer.AddObjectProperty("GridName", "Gridwizardsteps");
         GridwizardstepsContainer.AddObjectProperty("Header", subGridwizardsteps_Header);
         GridwizardstepsContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleSteps"));
         GridwizardstepsContainer.AddObjectProperty("Class", "FreeStyleSteps");
         GridwizardstepsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridwizardstepsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridwizardstepsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridwizardsteps_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridwizardstepsContainer.AddObjectProperty("CmpContext", sPrefix);
         GridwizardstepsContainer.AddObjectProperty("InMasterPage", "false");
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsColumn.AddObjectProperty("Value", lblDummybulletlineleft_Caption);
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsColumn.AddObjectProperty("Value", lblStepnumber_Caption);
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsColumn.AddObjectProperty("Value", lblDummybulletlineleft_Caption);
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridwizardstepsColumn.AddObjectProperty("Class", GXutil.rtrim( edtavPasosaux__titulo_Class));
         GridwizardstepsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPasosaux__titulo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridwizardstepsContainer.AddColumnProperties(GridwizardstepsColumn);
         GridwizardstepsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridwizardsteps_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridwizardstepsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridwizardsteps_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridwizardstepsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridwizardsteps_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridwizardstepsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridwizardsteps_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridwizardstepsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridwizardsteps_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridwizardstepsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridwizardsteps_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridwizardstepsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridwizardsteps_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblDummybulletlineleft_Internalname = sPrefix+"DUMMYBULLETLINELEFT" ;
      tblTablestepbulletlineleft_Internalname = sPrefix+"TABLESTEPBULLETLINELEFT" ;
      lblStepnumber_Internalname = sPrefix+"STEPNUMBER" ;
      divTablestepitem_Internalname = sPrefix+"TABLESTEPITEM" ;
      divLayout_tablestepitem_Internalname = sPrefix+"LAYOUT_TABLESTEPITEM" ;
      lblDummybulletlineright_Internalname = sPrefix+"DUMMYBULLETLINERIGHT" ;
      tblTablestepbulletlineright_Internalname = sPrefix+"TABLESTEPBULLETLINERIGHT" ;
      tblTablestepbulletline_Internalname = sPrefix+"TABLESTEPBULLETLINE" ;
      edtavPasosaux__titulo_Internalname = sPrefix+"PASOSAUX__TITULO" ;
      tblTblcontainerstep_Internalname = sPrefix+"TBLCONTAINERSTEP" ;
      tblTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridwizardsteps_Internalname = sPrefix+"GRIDWIZARDSTEPS" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGridwizardsteps_Allowcollapsing = (byte)(0) ;
      lblStepnumber_Caption = "1" ;
      lblDummybulletlineleft_Caption = " " ;
      edtavPasosaux__titulo_Jsonclick = "" ;
      edtavPasosaux__titulo_Class = "AttributeStepBulletUnSelected" ;
      edtavPasosaux__titulo_Enabled = 0 ;
      lblStepnumber_Class = "StepNumberBullet" ;
      lblStepnumber_Caption = "1" ;
      lblStepnumber_Visible = 1 ;
      subGridwizardsteps_Class = "FreeStyleSteps" ;
      tblTblcontainerstep_Visible = 1 ;
      divTablestepitem_Class = "TableStepBullet" ;
      tblTblcontainerstep_Class = "TableContainerStepBullet" ;
      tblTablestepbulletlineright_Class = "TableStepBulletLine" ;
      tblTablestepbulletlineleft_Class = "TableStepBulletLine" ;
      subGridwizardsteps_Backcolorstyle = (byte)(0) ;
      edtavPasosaux__titulo_Enabled = -1 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDWIZARDSTEPS_nFirstRecordOnPage'},{av:'GRIDWIZARDSTEPS_nEOF'},{av:'sPrefix'},{av:'AV27PasosAux',fld:'vPASOSAUX',grid:5,pic:'',hsh:true},{av:'nGXsfl_5_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:5},{av:'nRC_GXsfl_5',ctrl:'GRIDWIZARDSTEPS',prop:'GridRC',grid:5},{av:'AV17StepRealNumber',fld:'vSTEPREALNUMBER',pic:'ZZZ9',hsh:true},{av:'AV14SelectedStepNumber',fld:'vSELECTEDSTEPNUMBER',pic:'ZZZ9',hsh:true},{av:'AV16StepNumber',fld:'vSTEPNUMBER',pic:'ZZZ9',hsh:true},{av:'AV21WizardStepsCount',fld:'vWIZARDSTEPSCOUNT',pic:'ZZZ9',hsh:true},{av:'AV6FirstIsDummy',fld:'vFIRSTISDUMMY',pic:'',hsh:true},{av:'AV8LastIsDummy',fld:'vLASTISDUMMY',pic:'',hsh:true},{av:'AV11PenultimateIsDummy',fld:'vPENULTIMATEISDUMMY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRIDWIZARDSTEPS.LOAD","{handler:'e121V52',iparms:[{av:'AV17StepRealNumber',fld:'vSTEPREALNUMBER',pic:'ZZZ9',hsh:true},{av:'AV14SelectedStepNumber',fld:'vSELECTEDSTEPNUMBER',pic:'ZZZ9',hsh:true},{av:'AV27PasosAux',fld:'vPASOSAUX',grid:5,pic:'',hsh:true},{av:'nGXsfl_5_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:5},{av:'GRIDWIZARDSTEPS_nFirstRecordOnPage'},{av:'nRC_GXsfl_5',ctrl:'GRIDWIZARDSTEPS',prop:'GridRC',grid:5},{av:'AV16StepNumber',fld:'vSTEPNUMBER',pic:'ZZZ9',hsh:true},{av:'AV21WizardStepsCount',fld:'vWIZARDSTEPSCOUNT',pic:'ZZZ9',hsh:true},{av:'AV6FirstIsDummy',fld:'vFIRSTISDUMMY',pic:'',hsh:true},{av:'AV8LastIsDummy',fld:'vLASTISDUMMY',pic:'',hsh:true},{av:'AV11PenultimateIsDummy',fld:'vPENULTIMATEISDUMMY',pic:'',hsh:true}]");
      setEventMetadata("GRIDWIZARDSTEPS.LOAD",",oparms:[{av:'lblStepnumber_Visible',ctrl:'STEPNUMBER',prop:'Visible'},{av:'lblStepnumber_Caption',ctrl:'STEPNUMBER',prop:'Caption'},{av:'tblTablestepbulletlineleft_Class',ctrl:'TABLESTEPBULLETLINELEFT',prop:'Class'},{av:'tblTablestepbulletlineright_Class',ctrl:'TABLESTEPBULLETLINERIGHT',prop:'Class'},{av:'tblTblcontainerstep_Class',ctrl:'TBLCONTAINERSTEP',prop:'Class'},{av:'divTablestepitem_Class',ctrl:'TABLESTEPITEM',prop:'Class'},{ctrl:'PASOSAUX__TITULO',prop:'Class'},{av:'lblStepnumber_Class',ctrl:'STEPNUMBER',prop:'Class'},{av:'tblTblcontainerstep_Visible',ctrl:'TBLCONTAINERSTEP',prop:'Visible'},{av:'AV17StepRealNumber',fld:'vSTEPREALNUMBER',pic:'ZZZ9',hsh:true},{av:'AV16StepNumber',fld:'vSTEPNUMBER',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv2',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      wcpOAV24PasoActual = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV25Pasos = new GXBaseCollection<app.SdtPasos__SDT_Pasos__SDTItem>(app.SdtPasos__SDT_Pasos__SDTItem.class, "Pasos__SDTItem", "TexplusNET", remoteHandle);
      AV24PasoActual = "" ;
      AV27PasosAux = new GXBaseCollection<app.SdtPasos__SDT_Pasos__SDTItem>(app.SdtPasos__SDT_Pasos__SDTItem.class, "Pasos__SDTItem", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      GridwizardstepsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV32Station = "" ;
      GXt_char1 = "" ;
      AV33Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV34Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV35Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV23Paso = new app.SdtPasos__SDT_Pasos__SDTItem(remoteHandle, context);
      GridwizardstepsRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV25Pasos = "" ;
      sCtrlAV24PasoActual = "" ;
      subGridwizardsteps_Linesclass = "" ;
      lblDummybulletlineleft_Jsonclick = "" ;
      lblStepnumber_Jsonclick = "" ;
      lblDummybulletlineright_Jsonclick = "" ;
      ROClassString = "" ;
      subGridwizardsteps_Header = "" ;
      GridwizardstepsColumn = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavPasosaux__titulo_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGridwizardsteps_Backcolorstyle ;
   private byte subGridwizardsteps_Backstyle ;
   private byte subGridwizardsteps_Allowselection ;
   private byte subGridwizardsteps_Allowhovering ;
   private byte subGridwizardsteps_Allowcollapsing ;
   private byte subGridwizardsteps_Collapsed ;
   private byte GRIDWIZARDSTEPS_nEOF ;
   private short AV17StepRealNumber ;
   private short AV14SelectedStepNumber ;
   private short AV16StepNumber ;
   private short AV21WizardStepsCount ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV9MaxStepsToShow ;
   private short AV10MaxStepsToShowInXS ;
   private short AV15StartIndex ;
   private int nRC_GXsfl_5 ;
   private int nGXsfl_5_idx=1 ;
   private int AV30GXV1 ;
   private int subGridwizardsteps_Islastpage ;
   private int edtavPasosaux__titulo_Enabled ;
   private int nGXsfl_5_fel_idx=1 ;
   private int AV36GXV3 ;
   private int lblStepnumber_Visible ;
   private int tblTblcontainerstep_Visible ;
   private int idxLst ;
   private int subGridwizardsteps_Backcolor ;
   private int subGridwizardsteps_Allbackcolor ;
   private int subGridwizardsteps_Selectedindex ;
   private int subGridwizardsteps_Selectioncolor ;
   private int subGridwizardsteps_Hoveringcolor ;
   private long GRIDWIZARDSTEPS_nCurrentRecord ;
   private long GRIDWIZARDSTEPS_nFirstRecordOnPage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_5_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridwizardsteps_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavPasosaux__titulo_Internalname ;
   private String sGXsfl_5_fel_idx="0001" ;
   private String AV32Station ;
   private String GXt_char1 ;
   private String AV33Emprcod ;
   private String GXv_char2[] ;
   private String AV34Emprnom ;
   private String GXv_char3[] ;
   private String AV35Usurcod ;
   private String GXv_char4[] ;
   private String lblStepnumber_Caption ;
   private String tblTablestepbulletlineleft_Class ;
   private String tblTablestepbulletlineleft_Internalname ;
   private String tblTablestepbulletlineright_Class ;
   private String tblTablestepbulletlineright_Internalname ;
   private String tblTblcontainerstep_Class ;
   private String tblTblcontainerstep_Internalname ;
   private String divTablestepitem_Class ;
   private String divTablestepitem_Internalname ;
   private String edtavPasosaux__titulo_Class ;
   private String lblStepnumber_Class ;
   private String tblTablemain_Internalname ;
   private String sCtrlAV25Pasos ;
   private String sCtrlAV24PasoActual ;
   private String lblDummybulletlineleft_Internalname ;
   private String lblStepnumber_Internalname ;
   private String lblDummybulletlineright_Internalname ;
   private String subGridwizardsteps_Class ;
   private String subGridwizardsteps_Linesclass ;
   private String tblTablestepbulletline_Internalname ;
   private String lblDummybulletlineleft_Jsonclick ;
   private String divLayout_tablestepitem_Internalname ;
   private String lblStepnumber_Jsonclick ;
   private String lblDummybulletlineright_Jsonclick ;
   private String ROClassString ;
   private String edtavPasosaux__titulo_Jsonclick ;
   private String subGridwizardsteps_Header ;
   private String lblDummybulletlineleft_Caption ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV6FirstIsDummy ;
   private boolean AV8LastIsDummy ;
   private boolean AV11PenultimateIsDummy ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_5_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV5 ;
   private boolean AV12SecondIsDummy ;
   private String wcpOAV24PasoActual ;
   private String AV24PasoActual ;
   private com.genexus.webpanels.GXWebGrid GridwizardstepsContainer ;
   private com.genexus.webpanels.GXWebRow GridwizardstepsRow ;
   private com.genexus.webpanels.GXWebColumn GridwizardstepsColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXBaseCollection<app.SdtPasos__SDT_Pasos__SDTItem> AV25Pasos ;
   private GXBaseCollection<app.SdtPasos__SDT_Pasos__SDTItem> AV27PasosAux ;
   private app.SdtPasos__SDT_Pasos__SDTItem AV23Paso ;
}

