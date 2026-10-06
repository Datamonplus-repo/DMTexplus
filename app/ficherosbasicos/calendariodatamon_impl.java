package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class calendariodatamon_impl extends GXDataArea
{
   public calendariodatamon_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public calendariodatamon_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calendariodatamon_impl.class ));
   }

   public calendariodatamon_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "RecibirMaqCod") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod950( AV10EmprCod, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod950( AV10EmprCod, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCOD") == 0 )
         {
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            hV15MaqCod = httpContext.GetPar( "hV15MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcod952( AV10EmprCod, hV15MaqCod) ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "RecibirMaqCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "RecibirMaqCod") ;
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
            AV31RecibirMaqCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31RecibirMaqCod", AV31RecibirMaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIBIRMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31RecibirMaqCod, ""))));
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
      pa952( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start952( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.calendariodatamon", new String[] {GXutil.URLEncode(GXutil.rtrim(AV31RecibirMaqCod))}, new String[] {"RecibirMaqCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIBIRMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31RecibirMaqCod, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO", AV22Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQHNPTOTALES", GXutil.ltrim( localUtil.ntoc( AV17MaqHNPTotales, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQANY", GXutil.ltrim( localUtil.ntoc( A599MaqAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMES", GXutil.ltrim( localUtil.ntoc( A614MaqMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPMES", A610MaqHNPMes);
      app.GxWebStd.gx_hidden_field( httpContext, "vTITULO", AV24Titulo);
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQHNPMES", AV33MaqHNPMes);
      app.GxWebStd.gx_hidden_field( httpContext, "vDIA", GXutil.ltrim( localUtil.ntoc( AV8Dia, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC", GXutil.rtrim( A606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECIBIRMAQCOD", GXutil.rtrim( AV31RecibirMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIBIRMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31RecibirMaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCOD", GXutil.rtrim( AV15MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCALENDAR_Width", GXutil.rtrim( Dvpanel_panelcalendar_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCALENDAR_Autowidth", GXutil.booltostr( Dvpanel_panelcalendar_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCALENDAR_Autoheight", GXutil.booltostr( Dvpanel_panelcalendar_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCALENDAR_Cls", GXutil.rtrim( Dvpanel_panelcalendar_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCALENDAR_Title", GXutil.rtrim( Dvpanel_panelcalendar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCALENDAR_Collapsible", GXutil.booltostr( Dvpanel_panelcalendar_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCALENDAR_Collapsed", GXutil.booltostr( Dvpanel_panelcalendar_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCALENDAR_Showcollapseicon", GXutil.booltostr( Dvpanel_panelcalendar_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCALENDAR_Iconposition", GXutil.rtrim( Dvpanel_panelcalendar_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCALENDAR_Autoscroll", GXutil.booltostr( Dvpanel_panelcalendar_Autoscroll));
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
         we952( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt952( ) ;
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
      return formatLink("app.ficherosbasicos.calendariodatamon", new String[] {GXutil.URLEncode(GXutil.rtrim(AV31RecibirMaqCod))}, new String[] {"RecibirMaqCod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.CalendarioDatamon" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Calendario Datamon", "") ;
   }

   public void wb950( )
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
         wb_table1_6_952( true) ;
      }
      else
      {
         wb_table1_6_952( false) ;
      }
      return  ;
   }

   public void wb_table1_6_952e( boolean wbgen )
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

   public void start952( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Calendario Datamon", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup950( ) ;
   }

   public void ws952( )
   {
      start952( ) ;
      evt952( ) ;
   }

   public void evt952( )
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
                           e11952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOENTRARDATOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEntrarDatos' */
                           e12952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCOPIARHORASSECCION'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCopiarHorasSeccion' */
                           e13952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBORRARMES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoBorrarMes' */
                           e14952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCancelar' */
                           e15952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQANY.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQMES.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ANTERIOR.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SIGUIENTE.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e20952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e21952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e22952 ();
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

   public void we952( )
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

   public void pa952( )
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
            GX_FocusControl = edtavMaqcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvmaqcod950( String AV10EmprCod ,
                                String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcod_data950( AV10EmprCod, A13734MaqCDsc) ;
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

   protected void gxsgvvmaqcod_data950( String AV10EmprCod ,
                                        String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H00952 */
      pr_default.execute(0, new Object[] {l13734MaqCDsc, AV10EmprCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H00952_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H00952_A13734MaqCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvvmaqcod952( String AV10EmprCod ,
                                String A13734MaqCDsc )
   {
      /* Using cursor H00953 */
      pr_default.execute(1, new Object[] {A13734MaqCDsc, AV10EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13734MaqCDsc = H00953_A13734MaqCDsc[0] ;
         A396EmprCod = H00953_A396EmprCod[0] ;
         A602MaqCod = H00953_A602MaqCod[0] ;
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
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
      rf952( ) ;
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

   public void rf952( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e21952 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e22952 ();
         wb950( ) ;
      }
   }

   public void send_integrity_lvl_hashes952( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup950( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11952 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_panelcalendar_Width = httpContext.cgiGet( "DVPANEL_PANELCALENDAR_Width") ;
         Dvpanel_panelcalendar_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCALENDAR_Autowidth")) ;
         Dvpanel_panelcalendar_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCALENDAR_Autoheight")) ;
         Dvpanel_panelcalendar_Cls = httpContext.cgiGet( "DVPANEL_PANELCALENDAR_Cls") ;
         Dvpanel_panelcalendar_Title = httpContext.cgiGet( "DVPANEL_PANELCALENDAR_Title") ;
         Dvpanel_panelcalendar_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCALENDAR_Collapsible")) ;
         Dvpanel_panelcalendar_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCALENDAR_Collapsed")) ;
         Dvpanel_panelcalendar_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCALENDAR_Showcollapseicon")) ;
         Dvpanel_panelcalendar_Iconposition = httpContext.cgiGet( "DVPANEL_PANELCALENDAR_Iconposition") ;
         Dvpanel_panelcalendar_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCALENDAR_Autoscroll")) ;
         /* Read variables values. */
         hV15MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         if ( (GXutil.strcmp("", hV15MaqCod)==0) )
         {
            AV15MaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MaqCod", AV15MaqCod);
         }
         else
         {
            A13734MaqCDsc = hV15MaqCod ;
            /* Using cursor H00954 */
            pr_default.execute(2, new Object[] {A13734MaqCDsc, AV10EmprCod});
            AV15MaqCod = H00954_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(2) == 101) ) )
            {
               pr_default.readNext(2);
               if ( ! ( (pr_default.getStatus(2) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
                  GX_FocusControl = edtavMaqcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(2);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV15MaqCod", hV15MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqmes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqmes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQMES");
            GX_FocusControl = edtavMaqmes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18MaqMes = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqMes), 2, 0));
         }
         else
         {
            AV18MaqMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtavMaqmes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqMes), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqany_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqany_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQANY");
            GX_FocusControl = edtavMaqany_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14MaqAny = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14MaqAny), 4, 0));
         }
         else
         {
            AV14MaqAny = (short)(localUtil.ctol( httpContext.cgiGet( edtavMaqany_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14MaqAny), 4, 0));
         }
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
      e11952 ();
      if (returnInSub) return;
   }

   public void e11952( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV29Anterior = "<i class=\"fas fa-arrow-left\"></i>" ;
      AV30Siguiente = "<i class=\"fas fa-arrow-right\"></i>" ;
      GXt_char1 = AV10EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      calendariodatamon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10EmprCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      AV11FechaActual = GXutil.serverDate( context, remoteHandle, pr_default) ;
      AV24Titulo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Titulo", AV24Titulo);
      GXt_char1 = AV28msg2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG152_", ""), (byte)(99), GXv_char2) ;
      calendariodatamon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28msg2 = GXt_char1 ;
      AV15MaqCod = AV31RecibirMaqCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15MaqCod", AV15MaqCod);
      /* Using cursor H00955 */
      pr_default.execute(3, new Object[] {AV10EmprCod, AV15MaqCod});
      hV15MaqCod = "" ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         hV15MaqCod = H00955_A13734MaqCDsc[0] ;
         if (true) break;
      }
      pr_default.close(3);
      httpContext.ajax_rsp_assign_attri("", false, "hV15MaqCod", hV15MaqCod);
      edtavMaqcod_Enabled = (((GXutil.strcmp("", AV31RecibirMaqCod)==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), true);
      AV14MaqAny = (short)(((0==AV19pMaqAny) ? GXutil.year( AV11FechaActual) : AV19pMaqAny)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14MaqAny), 4, 0));
      AV18MaqMes = (byte)(((0==AV20pMaqMes) ? GXutil.month( AV11FechaActual) : AV18MaqMes)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqMes), 2, 0));
      lblBloquehtml_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblBloquehtml_Internalname, "Caption", lblBloquehtml_Caption, true);
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      calendariodatamon_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV38Emprnom ;
      GXv_char4[0] = AV39Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      calendariodatamon_impl.this.AV10EmprCod = GXv_char2[0] ;
      calendariodatamon_impl.this.AV38Emprnom = GXv_char3[0] ;
      calendariodatamon_impl.this.AV39Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      if ( ! (GXutil.strcmp("", AV31RecibirMaqCod)==0) )
      {
         /* Execute user subroutine: 'REGISTRAR HTML' */
         S112 ();
         if (returnInSub) return;
      }
   }

   public void e12952( )
   {
      /* 'DoEntrarDatos' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV15MaqCod)==0) )
      {
         new app.ficherosbasicos.registrarmaqhnp(remoteHandle, context).execute( AV10EmprCod, AV15MaqCod, AV14MaqAny, AV18MaqMes) ;
      }
      httpContext.popup(formatLink("app.webwcal002", new String[] {GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV15MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV18MaqMes,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14MaqAny,4,0))}, new String[] {"EmprCod","MAQUINA","MM","AA"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void e13952( )
   {
      /* 'DoCopiarHorasSeccion' Routine */
      returnInSub = false ;
      AV27SubMaq = GXutil.substring( AV15MaqCod, 3, 4) ;
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV15MaqCod ;
      GXv_int5[0] = AV18MaqMes ;
      GXv_int6[0] = AV14MaqAny ;
      new app.pcalen03(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_int6) ;
      calendariodatamon_impl.this.AV10EmprCod = GXv_char4[0] ;
      calendariodatamon_impl.this.AV15MaqCod = GXv_char3[0] ;
      calendariodatamon_impl.this.AV18MaqMes = GXv_int5[0] ;
      calendariodatamon_impl.this.AV14MaqAny = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV15MaqCod", AV15MaqCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV18MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqMes), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14MaqAny), 4, 0));
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e14952( )
   {
      /* 'DoBorrarMes' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV15MaqCod ;
      GXv_int5[0] = AV18MaqMes ;
      GXv_int6[0] = AV14MaqAny ;
      new app.pbormmes(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_int6) ;
      calendariodatamon_impl.this.AV10EmprCod = GXv_char4[0] ;
      calendariodatamon_impl.this.AV15MaqCod = GXv_char3[0] ;
      calendariodatamon_impl.this.AV18MaqMes = GXv_int5[0] ;
      calendariodatamon_impl.this.AV14MaqAny = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV15MaqCod", AV15MaqCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV18MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqMes), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14MaqAny), 4, 0));
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e15952( )
   {
      /* 'DoCancelar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e16952( )
   {
      /* Maqany_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'REGISTRAR HTML' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e17952( )
   {
      /* Maqmes_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'REGISTRAR HTML' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e18952( )
   {
      /* Anterior_Click Routine */
      returnInSub = false ;
      AV18MaqMes = (byte)(AV18MaqMes-1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqMes), 2, 0));
      if ( (0==AV18MaqMes) )
      {
         AV14MaqAny = (short)(AV14MaqAny-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14MaqAny), 4, 0));
         AV18MaqMes = (byte)(12) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqMes), 2, 0));
      }
      /* Execute user subroutine: 'REGISTRAR HTML' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e19952( )
   {
      /* Siguiente_Click Routine */
      returnInSub = false ;
      AV18MaqMes = (byte)(AV18MaqMes+1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqMes), 2, 0));
      if ( AV18MaqMes > 12 )
      {
         AV14MaqAny = (short)(AV14MaqAny+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14MaqAny), 4, 0));
         AV18MaqMes = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqMes), 2, 0));
      }
      /* Execute user subroutine: 'REGISTRAR HTML' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e20952( )
   {
      /* Maqcod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'REVISAR MAQCOD' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e21952( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'REGISTRAR HTML' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'REGISTRAR HTML' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'OBTENER MAQHNPMES' */
      S132 ();
      if (returnInSub) return;
      AV5Fecha = localUtil.ymdtod( AV14MaqAny, AV18MaqMes, 1) ;
      AV21PrimerDiaSemana = (short)(GXutil.dow( AV5Fecha)-1) ;
      AV21PrimerDiaSemana = (short)(((0==AV21PrimerDiaSemana) ? 7 : AV21PrimerDiaSemana)) ;
      AV9DiaFinMes = (short)(GXutil.day( GXutil.eomdate( AV5Fecha))) ;
      AV24Titulo = localUtil.cmonth( AV5Fecha, httpContext.getLanguage( )) + " " + GXutil.trim( GXutil.str( GXutil.year( AV5Fecha), 10, 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Titulo", AV24Titulo);
      AV8Dia = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Dia), 4, 0));
      /* Execute user subroutine: 'GENERAR <HEAD>, <BODY>, Y <TABLE ID="CALENDARIO"> HTML' */
      S142 ();
      if (returnInSub) return;
      AV12K = (short)(1) ;
      while ( AV12K <= 6 )
      {
         AV22Texto += "<tr bgcolor=" + httpContext.getMessage( "'silver'", "") + ">" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
         AV22Texto += "<td bgcolor=" + httpContext.getMessage( "'silver'", "") + ">" + ((AV12K==1) ? httpContext.getMessage( "Días", "") : "") + "</td>" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
         AV23TextoHoras = GXutil.newLine( ) + "<tr bgcolor=" + httpContext.getMessage( "'silver'", "") + httpContext.getMessage( "style=\"border-bottom-style: double;\">", "") ;
         AV23TextoHoras += "<td bgcolor=" + httpContext.getMessage( "'silver'", "") + ">" + ((AV12K==1) ? httpContext.getMessage( "Horas", "") : "") + "</td>" ;
         AV13M = (short)(1) ;
         while ( AV13M <= 7 )
         {
            if ( ( AV12K * AV13M == AV21PrimerDiaSemana ) && (0==AV8Dia) )
            {
               AV8Dia = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Dia), 4, 0));
            }
            else if ( ! (0==AV8Dia) )
            {
               AV8Dia = (short)(AV8Dia+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Dia), 4, 0));
            }
            AV32DiaActual = localUtil.ymdtod( AV14MaqAny, AV18MaqMes, AV8Dia) ;
            if ( GXutil.dateCompare(GXutil.resetTime(AV32DiaActual), GXutil.resetTime(GXutil.serverDate( context, remoteHandle, pr_default))) )
            {
               AV22Texto += "<td style=\"text-align:center; font-weight: bold; font-size: 20px;\">" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
            }
            else
            {
               AV22Texto += "<td style=\"text-align:center\">" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
            }
            AV22Texto += ((AV8Dia>=1)&&(AV8Dia<=AV9DiaFinMes) ? GXutil.trim( GXutil.str( AV8Dia, 4, 0)) : "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
            AV22Texto += "</td>" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
            if ( ( AV8Dia >= 1 ) && ( AV8Dia <= AV9DiaFinMes ) )
            {
               /* Execute user subroutine: 'DETERMINAR CALENDARIO MAQUINA DIAS HORAS NOPRODUCTIVAS' */
               S152 ();
               if (returnInSub) return;
               AV23TextoHoras += "<td style=\"text-align:center\">" ;
               AV23TextoHoras += ((0==AV17MaqHNPTotales) ? httpContext.getMessage( "&nbsp;", "") : GXutil.trim( GXutil.str( AV17MaqHNPTotales, 2, 0))) ;
               AV23TextoHoras += "</td>" ;
            }
            else
            {
               AV23TextoHoras += "<td />" ;
            }
            AV13M = (short)(AV13M+1) ;
         }
         AV22Texto += "</tr>" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
         AV22Texto += GXutil.trim( AV23TextoHoras) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
         if ( AV8Dia > AV9DiaFinMes )
         {
            AV23TextoHoras = "" ;
            if (true) break;
         }
         AV12K = (short)(AV12K+1) ;
      }
      AV23TextoHoras += "</tr>" ;
      if ( (GXutil.strcmp("", AV23TextoHoras)==0) )
      {
         AV22Texto += GXutil.trim( AV23TextoHoras) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      }
      /* Execute user subroutine: 'CERRAR </TABLE> Y </BODY> HTML' */
      S162 ();
      if (returnInSub) return;
      lblBloquehtml_Caption = AV22Texto ;
      httpContext.ajax_rsp_assign_prop("", false, lblBloquehtml_Internalname, "Caption", lblBloquehtml_Caption, true);
   }

   public void S152( )
   {
      /* 'DETERMINAR CALENDARIO MAQUINA DIAS HORAS NOPRODUCTIVAS' Routine */
      returnInSub = false ;
      AV17MaqHNPTotales = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17MaqHNPTotales", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MaqHNPTotales), 2, 0));
      AV34SubCadenaMaqHNPMes = GXutil.substring( AV33MaqHNPMes, AV8Dia*2, 2) ;
      AV17MaqHNPTotales = (byte)(GXutil.lval( AV34SubCadenaMaqHNPMes)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17MaqHNPTotales", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MaqHNPTotales), 2, 0));
   }

   public void S142( )
   {
      /* 'GENERAR <HEAD>, <BODY>, Y <TABLE ID="CALENDARIO"> HTML' Routine */
      returnInSub = false ;
      AV22Texto = "<html lang=\"es\">" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<!DOCTYPE html>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<head>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<!--Datamonplus-->" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<title>Calendario</title>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<meta charset=\"utf-8\">" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<style>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "#calendario {font-family:Arial;font-size:18px;}" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "#calendario caption {text-align:left;padding:5px 10px;background-color:#90282B;color:#fff;font-weight:bold;font-size:medium;}" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "#calendario caption div:nth-child(1) {float:left;}" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "#calendario caption div:nth-child(2) {float:right;}" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "#calendario caption div:nth-child(2) a {cursor:pointer;}" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "#calendario th {background-color:#B45354;color:#fff;width:40px;}" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "#calendario td {text-align:center;padding:2px 15px;background-color:#EEEEEE;}" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "#calendario .hoy {background-color:#90282B;color:#fff;font-weight:bold;font-size:medium;}" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "</style>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "</head>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<body>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<h1>" + GXutil.trim( AV24Titulo) + httpContext.getMessage( "</h1>", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<table id=\"calendario\">" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<thead>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<tr>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<th></th><th>Lun</th><th>Mar</th><th>Mie</th><th>Jue</th><th>Vie</th><th>Sab</th><th>Dom</th>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "</tr>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "</thead>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "<tbody>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
   }

   public void S162( )
   {
      /* 'CERRAR </TABLE> Y </BODY> HTML' Routine */
      returnInSub = false ;
      AV22Texto += "</tbody>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "</table>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "</body>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
      AV22Texto += "</html>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Texto", AV22Texto);
   }

   public void S122( )
   {
      /* 'REVISAR MAQCOD' Routine */
      returnInSub = false ;
      lblBloquehtml_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblBloquehtml_Internalname, "Caption", lblBloquehtml_Caption, true);
      if ( ! (GXutil.strcmp("", AV15MaqCod)==0) )
      {
         AV25ExisteMaquina = false ;
         AV11FechaActual = GXutil.serverDate( context, remoteHandle, pr_default) ;
         AV14MaqAny = (short)(((0==AV14MaqAny) ? GXutil.year( AV11FechaActual) : AV14MaqAny)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14MaqAny), 4, 0));
         AV18MaqMes = (byte)(((0==AV18MaqMes) ? GXutil.month( AV11FechaActual) : AV18MaqMes)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqMes), 2, 0));
         /* Using cursor H00956 */
         pr_default.execute(4, new Object[] {AV10EmprCod, AV15MaqCod});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A602MaqCod = H00956_A602MaqCod[0] ;
            A396EmprCod = H00956_A396EmprCod[0] ;
            A606MaqDsc = H00956_A606MaqDsc[0] ;
            n606MaqDsc = H00956_n606MaqDsc[0] ;
            AV16MaqDsc = A606MaqDsc ;
            AV25ExisteMaquina = true ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         if ( AV25ExisteMaquina )
         {
            /* Execute user subroutine: 'REGISTRAR HTML' */
            S112 ();
            if (returnInSub) return;
         }
      }
   }

   public void S132( )
   {
      /* 'OBTENER MAQHNPMES' Routine */
      returnInSub = false ;
      AV33MaqHNPMes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33MaqHNPMes", AV33MaqHNPMes);
      /* Using cursor H00957 */
      pr_default.execute(5, new Object[] {AV10EmprCod, AV15MaqCod, Short.valueOf(AV14MaqAny), Byte.valueOf(AV18MaqMes)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A614MaqMes = H00957_A614MaqMes[0] ;
         A599MaqAny = H00957_A599MaqAny[0] ;
         A602MaqCod = H00957_A602MaqCod[0] ;
         A396EmprCod = H00957_A396EmprCod[0] ;
         A610MaqHNPMes = H00957_A610MaqHNPMes[0] ;
         n610MaqHNPMes = H00957_n610MaqHNPMes[0] ;
         AV33MaqHNPMes = A610MaqHNPMes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33MaqHNPMes", AV33MaqHNPMes);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void nextLoad( )
   {
   }

   protected void e22952( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_6_952( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableMain", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         /* User Defined Control */
         ucDvpanel_panelcalendar.setProperty("Width", Dvpanel_panelcalendar_Width);
         ucDvpanel_panelcalendar.setProperty("AutoWidth", Dvpanel_panelcalendar_Autowidth);
         ucDvpanel_panelcalendar.setProperty("AutoHeight", Dvpanel_panelcalendar_Autoheight);
         ucDvpanel_panelcalendar.setProperty("Cls", Dvpanel_panelcalendar_Cls);
         ucDvpanel_panelcalendar.setProperty("Title", Dvpanel_panelcalendar_Title);
         ucDvpanel_panelcalendar.setProperty("Collapsible", Dvpanel_panelcalendar_Collapsible);
         ucDvpanel_panelcalendar.setProperty("Collapsed", Dvpanel_panelcalendar_Collapsed);
         ucDvpanel_panelcalendar.setProperty("ShowCollapseIcon", Dvpanel_panelcalendar_Showcollapseicon);
         ucDvpanel_panelcalendar.setProperty("IconPosition", Dvpanel_panelcalendar_Iconposition);
         ucDvpanel_panelcalendar.setProperty("AutoScroll", Dvpanel_panelcalendar_Autoscroll);
         ucDvpanel_panelcalendar.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelcalendar_Internalname, "DVPANEL_PANELCALENDARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELCALENDARContainer"+"PanelCalendar"+"\" style=\"display:none;\">") ;
         wb_table2_14_952( true) ;
      }
      else
      {
         wb_table2_14_952( false) ;
      }
      return  ;
   }

   public void wb_table2_14_952e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_6_952e( true) ;
      }
      else
      {
         wb_table1_6_952e( false) ;
      }
   }

   public void wb_table2_14_952( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPanelcalendar_Internalname, tblPanelcalendar_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Máquina", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, hV15MaqCod, GXutil.rtrim( localUtil.format( hV15MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 1, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecalendar1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebody_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 TextWebWCAL002", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblAnterior_Internalname, " ", "", "", lblAnterior_Jsonclick, "'"+""+"'"+",false,"+"'"+"EANTERIOR.CLICK."+"'", "", "fas fa-arrow-left", 5, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqmes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqmes_Internalname, httpContext.getMessage( "Mes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqmes_Internalname, GXutil.ltrim( localUtil.ntoc( AV18MaqMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqmes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18MaqMes), "99") : localUtil.format( DecimalUtil.doubleToDec(AV18MaqMes), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqmes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqmes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqany_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqany_Internalname, httpContext.getMessage( "Año", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqany_Internalname, GXutil.ltrim( localUtil.ntoc( AV14MaqAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqany_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14MaqAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14MaqAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqany_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqany_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 TextWebWCAL002", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSiguiente_Internalname, " ", "", "", lblSiguiente_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESIGUIENTE.CLICK."+"'", "", "fas fa-arrow-right", 5, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblEspacio2_Internalname, " ", "", "", lblEspacio2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnentrardatos_Internalname, "", httpContext.getMessage( "Entrar Datos", ""), bttBtnentrardatos_Jsonclick, 5, httpContext.getMessage( "Entrar Datos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOENTRARDATOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncopiarhorasseccion_Internalname, "", httpContext.getMessage( "Copiar Horas Seccion", ""), bttBtncopiarhorasseccion_Jsonclick, 5, httpContext.getMessage( "Copiar Horas Seccion", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCOPIARHORASSECCION\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnborrarmes_Internalname, "", httpContext.getMessage( "Borrar Mes", ""), bttBtnborrarmes_Jsonclick, 5, httpContext.getMessage( "Borrar Mes", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOBORRARMES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblEspacio1_Internalname, " ", "", "", lblEspacio1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\" class='CellMarginTop'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBloquehtml_Internalname, lblBloquehtml_Caption, "", "", lblBloquehtml_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_FicherosBasicos\\CalendarioDatamon.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_14_952e( true) ;
      }
      else
      {
         wb_table2_14_952e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV31RecibirMaqCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31RecibirMaqCod", AV31RecibirMaqCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIBIRMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31RecibirMaqCod, ""))));
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
      pa952( ) ;
      ws952( ) ;
      we952( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016404327", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/calendariodatamon.js", "?202661016404327", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavMaqcod_Internalname = "vMAQCOD" ;
      lblAnterior_Internalname = "ANTERIOR" ;
      edtavMaqmes_Internalname = "vMAQMES" ;
      edtavMaqany_Internalname = "vMAQANY" ;
      lblSiguiente_Internalname = "SIGUIENTE" ;
      divTablebody_Internalname = "TABLEBODY" ;
      divTablecalendar1_Internalname = "TABLECALENDAR1" ;
      lblEspacio2_Internalname = "ESPACIO2" ;
      bttBtnentrardatos_Internalname = "BTNENTRARDATOS" ;
      bttBtncopiarhorasseccion_Internalname = "BTNCOPIARHORASSECCION" ;
      bttBtnborrarmes_Internalname = "BTNBORRARMES" ;
      lblEspacio1_Internalname = "ESPACIO1" ;
      lblBloquehtml_Internalname = "BLOQUEHTML" ;
      tblPanelcalendar_Internalname = "PANELCALENDAR" ;
      Dvpanel_panelcalendar_Internalname = "DVPANEL_PANELCALENDAR" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
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
      edtavMaqany_Jsonclick = "" ;
      edtavMaqany_Enabled = 1 ;
      edtavMaqmes_Jsonclick = "" ;
      edtavMaqmes_Enabled = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      lblBloquehtml_Caption = httpContext.getMessage( "BloqueHTML", "") ;
      edtavMaqcod_Enabled = 1 ;
      Dvpanel_panelcalendar_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelcalendar_Iconposition = "Right" ;
      Dvpanel_panelcalendar_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelcalendar_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelcalendar_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_panelcalendar_Title = "" ;
      Dvpanel_panelcalendar_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelcalendar_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelcalendar_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelcalendar_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Calendario Datamon", "") );
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

   public void validv_Maqcod( )
   {
      if ( (GXutil.strcmp("", hV15MaqCod)==0) )
      {
         AV15MaqCod = "" ;
      }
      else
      {
         A13734MaqCDsc = hV15MaqCod ;
         /* Using cursor H00958 */
         pr_default.execute(6, new Object[] {A13734MaqCDsc, AV10EmprCod});
         AV15MaqCod = H00958_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(6) == 101) ) )
         {
            pr_default.readNext(6);
            if ( ! ( (pr_default.getStatus(6) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
               GX_FocusControl = edtavMaqcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(6);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV15MaqCod", hV15MaqCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV15MaqCod", GXutil.rtrim( AV15MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV15MaqCod", hV15MaqCod);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'},{av:'A610MaqHNPMes',fld:'MAQHNPMES',pic:''},{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'},{av:'AV31RecibirMaqCod',fld:'vRECIBIRMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'lblBloquehtml_Caption',ctrl:'BLOQUEHTML',prop:'Caption'},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'}]}");
      setEventMetadata("'DOENTRARDATOS'","{handler:'e12952',iparms:[{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'}]");
      setEventMetadata("'DOENTRARDATOS'",",oparms:[]}");
      setEventMetadata("'DOCOPIARHORASSECCION'","{handler:'e13952',iparms:[{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'}]");
      setEventMetadata("'DOCOPIARHORASSECCION'",",oparms:[{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOBORRARMES'","{handler:'e14952',iparms:[{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'}]");
      setEventMetadata("'DOBORRARMES'",",oparms:[{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e15952',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("VMAQANY.ISVALID","{handler:'e16952',iparms:[{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'},{av:'A610MaqHNPMes',fld:'MAQHNPMES',pic:''},{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'}]");
      setEventMetadata("VMAQANY.ISVALID",",oparms:[{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'lblBloquehtml_Caption',ctrl:'BLOQUEHTML',prop:'Caption'},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'}]}");
      setEventMetadata("VMAQMES.ISVALID","{handler:'e17952',iparms:[{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'},{av:'A610MaqHNPMes',fld:'MAQHNPMES',pic:''},{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'}]");
      setEventMetadata("VMAQMES.ISVALID",",oparms:[{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'lblBloquehtml_Caption',ctrl:'BLOQUEHTML',prop:'Caption'},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'}]}");
      setEventMetadata("ANTERIOR.CLICK","{handler:'e18952',iparms:[{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'},{av:'A610MaqHNPMes',fld:'MAQHNPMES',pic:''},{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'}]");
      setEventMetadata("ANTERIOR.CLICK",",oparms:[{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'lblBloquehtml_Caption',ctrl:'BLOQUEHTML',prop:'Caption'},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'}]}");
      setEventMetadata("SIGUIENTE.CLICK","{handler:'e19952',iparms:[{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'},{av:'A610MaqHNPMes',fld:'MAQHNPMES',pic:''},{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'}]");
      setEventMetadata("SIGUIENTE.CLICK",",oparms:[{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'lblBloquehtml_Caption',ctrl:'BLOQUEHTML',prop:'Caption'},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'}]}");
      setEventMetadata("VMAQCOD.ISVALID","{handler:'e20952',iparms:[{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'},{av:'A610MaqHNPMes',fld:'MAQHNPMES',pic:''},{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'}]");
      setEventMetadata("VMAQCOD.ISVALID",",oparms:[{av:'lblBloquehtml_Caption',ctrl:'BLOQUEHTML',prop:'Caption'},{av:'AV14MaqAny',fld:'vMAQANY',pic:'ZZZ9'},{av:'AV18MaqMes',fld:'vMAQMES',pic:'99'},{av:'AV24Titulo',fld:'vTITULO',pic:''},{av:'AV8Dia',fld:'vDIA',pic:'ZZZ9'},{av:'AV22Texto',fld:'vTEXTO',pic:''},{av:'AV33MaqHNPMes',fld:'vMAQHNPMES',pic:''},{av:'AV17MaqHNPTotales',fld:'vMAQHNPTOTALES',pic:'Z9'}]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[{av:'hV15MaqCod'},{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[{av:'AV15MaqCod',fld:'vMAQCOD',pic:''},{av:'hV15MaqCod'}]}");
      setEventMetadata("VALIDV_MAQMES","{handler:'validv_Maqmes',iparms:[]");
      setEventMetadata("VALIDV_MAQMES",",oparms:[]}");
      setEventMetadata("VALIDV_MAQANY","{handler:'validv_Maqany',iparms:[]");
      setEventMetadata("VALIDV_MAQANY",",oparms:[]}");
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
      wcpOAV31RecibirMaqCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV10EmprCod = "" ;
      A13734MaqCDsc = "" ;
      hV15MaqCod = "" ;
      AV31RecibirMaqCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22Texto = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A610MaqHNPMes = "" ;
      AV24Titulo = "" ;
      AV33MaqHNPMes = "" ;
      A606MaqDsc = "" ;
      AV15MaqCod = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13734MaqCDsc = "" ;
      H00952_A13734MaqCDsc = new String[] {""} ;
      H00953_A13734MaqCDsc = new String[] {""} ;
      H00953_A396EmprCod = new String[] {""} ;
      H00953_A602MaqCod = new String[] {""} ;
      H00954_A13734MaqCDsc = new String[] {""} ;
      H00954_A396EmprCod = new String[] {""} ;
      H00954_A602MaqCod = new String[] {""} ;
      AV29Anterior = "" ;
      AV30Siguiente = "" ;
      AV11FechaActual = GXutil.nullDate() ;
      AV28msg2 = "" ;
      H00955_A13734MaqCDsc = new String[] {""} ;
      H00955_A396EmprCod = new String[] {""} ;
      H00955_A602MaqCod = new String[] {""} ;
      AV37Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV38Emprnom = "" ;
      AV39Usurcod = "" ;
      AV27SubMaq = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new short[1] ;
      AV5Fecha = GXutil.nullDate() ;
      AV23TextoHoras = "" ;
      AV32DiaActual = GXutil.nullDate() ;
      AV34SubCadenaMaqHNPMes = "" ;
      H00956_A602MaqCod = new String[] {""} ;
      H00956_A396EmprCod = new String[] {""} ;
      H00956_A606MaqDsc = new String[] {""} ;
      H00956_n606MaqDsc = new boolean[] {false} ;
      AV16MaqDsc = "" ;
      H00957_A614MaqMes = new byte[1] ;
      H00957_A599MaqAny = new short[1] ;
      H00957_A602MaqCod = new String[] {""} ;
      H00957_A396EmprCod = new String[] {""} ;
      H00957_A610MaqHNPMes = new String[] {""} ;
      H00957_n610MaqHNPMes = new boolean[] {false} ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelcalendar = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtncancel_Jsonclick = "" ;
      lblAnterior_Jsonclick = "" ;
      lblSiguiente_Jsonclick = "" ;
      lblEspacio2_Jsonclick = "" ;
      bttBtnentrardatos_Jsonclick = "" ;
      bttBtncopiarhorasseccion_Jsonclick = "" ;
      bttBtnborrarmes_Jsonclick = "" ;
      lblEspacio1_Jsonclick = "" ;
      lblBloquehtml_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H00958_A13734MaqCDsc = new String[] {""} ;
      H00958_A396EmprCod = new String[] {""} ;
      H00958_A602MaqCod = new String[] {""} ;
      ZV15MaqCod = "" ;
      ZhV15MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.calendariodatamon__default(),
         new Object[] {
             new Object[] {
            H00952_A13734MaqCDsc
            }
            , new Object[] {
            H00953_A13734MaqCDsc, H00953_A396EmprCod, H00953_A602MaqCod
            }
            , new Object[] {
            H00954_A13734MaqCDsc, H00954_A396EmprCod, H00954_A602MaqCod
            }
            , new Object[] {
            H00955_A13734MaqCDsc, H00955_A396EmprCod, H00955_A602MaqCod
            }
            , new Object[] {
            H00956_A602MaqCod, H00956_A396EmprCod, H00956_A606MaqDsc, H00956_n606MaqDsc
            }
            , new Object[] {
            H00957_A614MaqMes, H00957_A599MaqAny, H00957_A602MaqCod, H00957_A396EmprCod, H00957_A610MaqHNPMes, H00957_n610MaqHNPMes
            }
            , new Object[] {
            H00958_A13734MaqCDsc, H00958_A396EmprCod, H00958_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV17MaqHNPTotales ;
   private byte A614MaqMes ;
   private byte nDonePA ;
   private byte AV18MaqMes ;
   private byte AV20pMaqMes ;
   private byte GXv_int5[] ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A599MaqAny ;
   private short AV8Dia ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short AV14MaqAny ;
   private short AV19pMaqAny ;
   private short GXv_int6[] ;
   private short AV21PrimerDiaSemana ;
   private short AV9DiaFinMes ;
   private short AV12K ;
   private short AV13M ;
   private int gxdynajaxindex ;
   private int edtavMaqcod_Enabled ;
   private int edtavMaqmes_Enabled ;
   private int edtavMaqany_Enabled ;
   private int idxLst ;
   private String wcpOAV31RecibirMaqCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV10EmprCod ;
   private String AV31RecibirMaqCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String AV15MaqCod ;
   private String Dvpanel_panelcalendar_Width ;
   private String Dvpanel_panelcalendar_Cls ;
   private String Dvpanel_panelcalendar_Title ;
   private String Dvpanel_panelcalendar_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavMaqcod_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String edtavMaqmes_Internalname ;
   private String edtavMaqany_Internalname ;
   private String lblBloquehtml_Caption ;
   private String lblBloquehtml_Internalname ;
   private String AV37Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV38Emprnom ;
   private String AV39Usurcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV16MaqDsc ;
   private String sStyleString ;
   private String tblTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_panelcalendar_Internalname ;
   private String TempTags ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String tblPanelcalendar_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String divTablecalendar1_Internalname ;
   private String divTablebody_Internalname ;
   private String lblAnterior_Internalname ;
   private String lblAnterior_Jsonclick ;
   private String edtavMaqmes_Jsonclick ;
   private String edtavMaqany_Jsonclick ;
   private String lblSiguiente_Internalname ;
   private String lblSiguiente_Jsonclick ;
   private String lblEspacio2_Internalname ;
   private String lblEspacio2_Jsonclick ;
   private String bttBtnentrardatos_Internalname ;
   private String bttBtnentrardatos_Jsonclick ;
   private String bttBtncopiarhorasseccion_Internalname ;
   private String bttBtncopiarhorasseccion_Jsonclick ;
   private String bttBtnborrarmes_Internalname ;
   private String bttBtnborrarmes_Jsonclick ;
   private String lblEspacio1_Internalname ;
   private String lblEspacio1_Jsonclick ;
   private String lblBloquehtml_Jsonclick ;
   private String ZV15MaqCod ;
   private java.util.Date AV11FechaActual ;
   private java.util.Date AV5Fecha ;
   private java.util.Date AV32DiaActual ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panelcalendar_Autowidth ;
   private boolean Dvpanel_panelcalendar_Autoheight ;
   private boolean Dvpanel_panelcalendar_Collapsible ;
   private boolean Dvpanel_panelcalendar_Collapsed ;
   private boolean Dvpanel_panelcalendar_Showcollapseicon ;
   private boolean Dvpanel_panelcalendar_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV25ExisteMaquina ;
   private boolean n606MaqDsc ;
   private boolean n610MaqHNPMes ;
   private String AV22Texto ;
   private String A13734MaqCDsc ;
   private String hV15MaqCod ;
   private String A610MaqHNPMes ;
   private String AV24Titulo ;
   private String AV33MaqHNPMes ;
   private String l13734MaqCDsc ;
   private String AV29Anterior ;
   private String AV30Siguiente ;
   private String AV28msg2 ;
   private String AV27SubMaq ;
   private String AV23TextoHoras ;
   private String AV34SubCadenaMaqHNPMes ;
   private String ZhV15MaqCod ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelcalendar ;
   private IDataStoreProvider pr_default ;
   private String[] H00952_A13734MaqCDsc ;
   private String[] H00953_A13734MaqCDsc ;
   private String[] H00953_A396EmprCod ;
   private String[] H00953_A602MaqCod ;
   private String[] H00954_A13734MaqCDsc ;
   private String[] H00954_A396EmprCod ;
   private String[] H00954_A602MaqCod ;
   private String[] H00955_A13734MaqCDsc ;
   private String[] H00955_A396EmprCod ;
   private String[] H00955_A602MaqCod ;
   private String[] H00956_A602MaqCod ;
   private String[] H00956_A396EmprCod ;
   private String[] H00956_A606MaqDsc ;
   private boolean[] H00956_n606MaqDsc ;
   private byte[] H00957_A614MaqMes ;
   private short[] H00957_A599MaqAny ;
   private String[] H00957_A602MaqCod ;
   private String[] H00957_A396EmprCod ;
   private String[] H00957_A610MaqHNPMes ;
   private boolean[] H00957_n610MaqHNPMes ;
   private String[] H00958_A13734MaqCDsc ;
   private String[] H00958_A396EmprCod ;
   private String[] H00958_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class calendariodatamon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00952", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE (UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) AND (EmprCod = ?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00953", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00954", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00955", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00956", "SELECT MaqCod, EmprCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00957", "SELECT MaqMes, MaqAny, MaqCod, EmprCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00958", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

