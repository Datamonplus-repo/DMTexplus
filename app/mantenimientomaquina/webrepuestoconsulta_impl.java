package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webrepuestoconsulta_impl extends GXDataArea
{
   public webrepuestoconsulta_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webrepuestoconsulta_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webrepuestoconsulta_impl.class ));
   }

   public webrepuestoconsulta_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTipo = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMRINI") == 0 )
         {
            A13718MRCNom = httpContext.GetPar( "MRCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmrini1560( A13718MRCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMRFIN") == 0 )
         {
            A13718MRCNom = httpContext.GetPar( "MRCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmrfin1560( A13718MRCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMMSPRVINI") == 0 )
         {
            A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmmsprvini1560( A13719PrvNNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMMSPRVFIN") == 0 )
         {
            A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmmsprvfin1560( A13719PrvNNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOMMAQINI") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvommaqini1560( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOMMAQFIN") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvommaqfin1560( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMRINI") == 0 )
         {
            A13718MRCNom = httpContext.GetPar( "MRCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmrini1560( A13718MRCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMRINI") == 0 )
         {
            hV15MRIni = httpContext.GetPar( "hV15MRIni") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmrini1562( hV15MRIni) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMRFIN") == 0 )
         {
            A13718MRCNom = httpContext.GetPar( "MRCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmrfin1560( A13718MRCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMRFIN") == 0 )
         {
            hV13MRFin = httpContext.GetPar( "hV13MRFin") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmrfin1562( hV13MRFin) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMMSPRVINI") == 0 )
         {
            A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmmsprvini1560( A13719PrvNNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMMSPRVINI") == 0 )
         {
            hV12MMSPrvIni = httpContext.GetPar( "hV12MMSPrvIni") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmmsprvini1562( hV12MMSPrvIni) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMMSPRVFIN") == 0 )
         {
            A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmmsprvfin1560( A13719PrvNNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMMSPRVFIN") == 0 )
         {
            hV10MMSPrvFin = httpContext.GetPar( "hV10MMSPrvFin") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmmsprvfin1562( hV10MMSPrvFin) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOMMAQINI") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvommaqini1560( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vOMMAQINI") == 0 )
         {
            hV19OMMaqIni = httpContext.GetPar( "hV19OMMaqIni") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvommaqini1562( hV19OMMaqIni) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOMMAQFIN") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvommaqfin1560( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vOMMAQFIN") == 0 )
         {
            hV16OMMaqFin = httpContext.GetPar( "hV16OMMaqFin") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvommaqfin1562( hV16OMMaqFin) ;
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
      pa1562( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1562( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.webrepuestoconsulta", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMSECFIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20OMSecFin, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vOMSECFIN", GXutil.rtrim( AV20OMSecFin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMSECFIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20OMSecFin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMRINI", GXutil.ltrim( localUtil.ntoc( AV15MRIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMRFIN", GXutil.ltrim( localUtil.ntoc( AV13MRFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMMSPRVINI", GXutil.ltrim( localUtil.ntoc( AV12MMSPrvIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMMSPRVFIN", GXutil.ltrim( localUtil.ntoc( AV10MMSPrvFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvOMMAQINI", GXutil.rtrim( AV19OMMaqIni));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvOMMAQFIN", GXutil.rtrim( AV16OMMaqFin));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
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
         we1562( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1562( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.mantenimientomaquina.webrepuestoconsulta", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.WebRepuestoConsulta" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta de Repuestos", "") ;
   }

   public void wb1560( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableTransactionTemplate", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
         ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
         ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
         ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
         ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
         ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
         ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
         ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
         ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
         ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
         ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTipo.getInternalname(), httpContext.getMessage( "Tipo Reporte", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipo, cmbavTipo.getInternalname(), GXutil.trim( GXutil.str( AV26Tipo, 1, 0)), 1, cmbavTipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavTipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "", true, (byte)(0), "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         cmbavTipo.setValue( GXutil.trim( GXutil.str( AV26Tipo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipo.getInternalname(), "Values", cmbavTipo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablerangos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMmsfchini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMmsfchini_Internalname, httpContext.getMessage( "Fecha de Mov de Stock", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavMmsfchini_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMmsfchini_Internalname, localUtil.format(AV9MMSFchIni, "99/99/99"), localUtil.format( AV9MMSFchIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMmsfchini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMmsfchini_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavMmsfchini_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavMmsfchini_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMmsfchfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMmsfchfin_Internalname, httpContext.getMessage( "Fecha de Mov de Stock", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavMmsfchfin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMmsfchfin_Internalname, localUtil.format(AV7MMSFchFin, "99/99/99"), localUtil.format( AV7MMSFchFin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMmsfchfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMmsfchfin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavMmsfchfin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavMmsfchfin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMrini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMrini_Internalname, httpContext.getMessage( "Repuesto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMrini_Internalname, hV15MRIni, GXutil.rtrim( localUtil.format( hV15MRIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMrini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMrini_Enabled, 0, "text", "", 80, "chr", 4, "row", 255, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMrfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMrfin_Internalname, httpContext.getMessage( "Repuesto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMrfin_Internalname, hV13MRFin, GXutil.rtrim( localUtil.format( hV13MRFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMrfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMrfin_Enabled, 0, "text", "", 80, "chr", 4, "row", 255, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMmsprvini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMmsprvini_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMmsprvini_Internalname, hV12MMSPrvIni, GXutil.rtrim( localUtil.format( hV12MMSPrvIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMmsprvini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMmsprvini_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMmsprvfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMmsprvfin_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMmsprvfin_Internalname, hV10MMSPrvFin, GXutil.rtrim( localUtil.format( hV10MMSPrvFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMmsprvfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMmsprvfin_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOmmaqini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOmmaqini_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOmmaqini_Internalname, hV19OMMaqIni, GXutil.rtrim( localUtil.format( hV19OMMaqIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOmmaqini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOmmaqini_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOmmaqfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOmmaqfin_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOmmaqfin_Internalname, hV16OMMaqFin, GXutil.rtrim( localUtil.format( hV16OMMaqFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOmmaqfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOmmaqfin_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\WebRepuestoConsulta.htm");
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

   public void start1562( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta de Repuestos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1560( ) ;
   }

   public void ws1562( )
   {
      start1562( ) ;
      evt1562( ) ;
   }

   public void evt1562( )
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
                           e111562 ();
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
                                 e121562 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e131562 ();
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

   public void we1562( )
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

   public void pa1562( )
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
            GX_FocusControl = cmbavTipo.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvmrini1560( String A13718MRCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmrini_data1560( A13718MRCNom) ;
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

   protected void gxsgvvmrini_data1560( String A13718MRCNom )
   {
      l13718MRCNom = GXutil.concat( GXutil.rtrim( A13718MRCNom), "%", "") ;
      /* Using cursor H01562 */
      pr_default.execute(0, new Object[] {l13718MRCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01562_A13718MRCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13718MRCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01562_A13718MRCNom[0]);
            gxdynajaxctrldescr.add(H01562_A13718MRCNom[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvmrfin1560( String A13718MRCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmrfin_data1560( A13718MRCNom) ;
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

   protected void gxsgvvmrfin_data1560( String A13718MRCNom )
   {
      l13718MRCNom = GXutil.concat( GXutil.rtrim( A13718MRCNom), "%", "") ;
      /* Using cursor H01563 */
      pr_default.execute(1, new Object[] {l13718MRCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01563_A13718MRCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13718MRCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01563_A13718MRCNom[0]);
            gxdynajaxctrldescr.add(H01563_A13718MRCNom[0]);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvmmsprvini1560( String A13719PrvNNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmmsprvini_data1560( A13719PrvNNom) ;
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

   protected void gxsgvvmmsprvini_data1560( String A13719PrvNNom )
   {
      l13719PrvNNom = GXutil.concat( GXutil.rtrim( A13719PrvNNom), "%", "") ;
      /* Using cursor H01564 */
      pr_default.execute(2, new Object[] {l13719PrvNNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01564_A13719PrvNNom[0]) , GXutil.padr( "%" + GXutil.upper( A13719PrvNNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01564_A13719PrvNNom[0]);
            gxdynajaxctrldescr.add(H01564_A13719PrvNNom[0]);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgvvmmsprvfin1560( String A13719PrvNNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmmsprvfin_data1560( A13719PrvNNom) ;
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

   protected void gxsgvvmmsprvfin_data1560( String A13719PrvNNom )
   {
      l13719PrvNNom = GXutil.concat( GXutil.rtrim( A13719PrvNNom), "%", "") ;
      /* Using cursor H01565 */
      pr_default.execute(3, new Object[] {l13719PrvNNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01565_A13719PrvNNom[0]) , GXutil.padr( "%" + GXutil.upper( A13719PrvNNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01565_A13719PrvNNom[0]);
            gxdynajaxctrldescr.add(H01565_A13719PrvNNom[0]);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxsgvvommaqini1560( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvommaqini_data1560( A13734MaqCDsc) ;
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

   protected void gxsgvvommaqini_data1560( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H01566 */
      pr_default.execute(4, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01566_A13734MaqCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13734MaqCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01566_A13734MaqCDsc[0]);
            gxdynajaxctrldescr.add(H01566_A13734MaqCDsc[0]);
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void gxsgvvommaqfin1560( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvommaqfin_data1560( A13734MaqCDsc) ;
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

   protected void gxsgvvommaqfin_data1560( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H01567 */
      pr_default.execute(5, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01567_A13734MaqCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13734MaqCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01567_A13734MaqCDsc[0]);
            gxdynajaxctrldescr.add(H01567_A13734MaqCDsc[0]);
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void gxhcvvmrini1562( String A13718MRCNom )
   {
      /* Using cursor H01568 */
      pr_default.execute(6, new Object[] {A13718MRCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         if ( GXutil.strcmp(H01568_A13718MRCNom[0], A13718MRCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13718MRCNom = H01568_A13718MRCNom[0] ;
            A396EmprCod = H01568_A396EmprCod[0] ;
            A9492MRCod = H01568_A9492MRCod[0] ;
         }
         pr_default.readNext(6);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(6);
   }

   public void gxhcvvmrfin1562( String A13718MRCNom )
   {
      /* Using cursor H01569 */
      pr_default.execute(7, new Object[] {A13718MRCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         if ( GXutil.strcmp(H01569_A13718MRCNom[0], A13718MRCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13718MRCNom = H01569_A13718MRCNom[0] ;
            A396EmprCod = H01569_A396EmprCod[0] ;
            A9492MRCod = H01569_A9492MRCod[0] ;
         }
         pr_default.readNext(7);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9492MRCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(7);
   }

   public void gxhcvvmmsprvini1562( String A13719PrvNNom )
   {
      /* Using cursor H015610 */
      pr_default.execute(8, new Object[] {A13719PrvNNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(8) != 101) )
      {
         if ( GXutil.strcmp(H015610_A13719PrvNNom[0], A13719PrvNNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13719PrvNNom = H015610_A13719PrvNNom[0] ;
            A396EmprCod = H015610_A396EmprCod[0] ;
            A795PrvNum = H015610_A795PrvNum[0] ;
         }
         pr_default.readNext(8);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(8);
   }

   public void gxhcvvmmsprvfin1562( String A13719PrvNNom )
   {
      /* Using cursor H015611 */
      pr_default.execute(9, new Object[] {A13719PrvNNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         if ( GXutil.strcmp(H015611_A13719PrvNNom[0], A13719PrvNNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13719PrvNNom = H015611_A13719PrvNNom[0] ;
            A396EmprCod = H015611_A396EmprCod[0] ;
            A795PrvNum = H015611_A795PrvNum[0] ;
         }
         pr_default.readNext(9);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(9);
   }

   public void gxhcvvommaqini1562( String A13734MaqCDsc )
   {
      /* Using cursor H015612 */
      pr_default.execute(10, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(10) != 101) )
      {
         if ( GXutil.strcmp(H015612_A13734MaqCDsc[0], A13734MaqCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13734MaqCDsc = H015612_A13734MaqCDsc[0] ;
            A396EmprCod = H015612_A396EmprCod[0] ;
            A602MaqCod = H015612_A602MaqCod[0] ;
         }
         pr_default.readNext(10);
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
      pr_default.close(10);
   }

   public void gxhcvvommaqfin1562( String A13734MaqCDsc )
   {
      /* Using cursor H015613 */
      pr_default.execute(11, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(11) != 101) )
      {
         if ( GXutil.strcmp(H015613_A13734MaqCDsc[0], A13734MaqCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13734MaqCDsc = H015613_A13734MaqCDsc[0] ;
            A396EmprCod = H015613_A396EmprCod[0] ;
            A602MaqCod = H015613_A602MaqCod[0] ;
         }
         pr_default.readNext(11);
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
      pr_default.close(11);
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
      if ( cmbavTipo.getItemCount() > 0 )
      {
         AV26Tipo = (byte)(GXutil.lval( cmbavTipo.getValidValue(GXutil.trim( GXutil.str( AV26Tipo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Tipo", GXutil.str( AV26Tipo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipo.setValue( GXutil.trim( GXutil.str( AV26Tipo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipo.getInternalname(), "Values", cmbavTipo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1562( ) ;
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

   public void rf1562( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e131562 ();
         wb1560( ) ;
      }
   }

   public void send_integrity_lvl_hashes1562( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vOMSECFIN", GXutil.rtrim( AV20OMSecFin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMSECFIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20OMSecFin, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1560( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111562 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
         Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
         Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
         /* Read variables values. */
         cmbavTipo.setValue( httpContext.cgiGet( cmbavTipo.getInternalname()) );
         AV26Tipo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavTipo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Tipo", GXutil.str( AV26Tipo, 1, 0));
         if ( localUtil.vcdate( httpContext.cgiGet( edtavMmsfchini_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vMMSFCHINI");
            GX_FocusControl = edtavMmsfchini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9MMSFchIni = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9MMSFchIni", localUtil.format(AV9MMSFchIni, "99/99/99"));
         }
         else
         {
            AV9MMSFchIni = localUtil.ctod( httpContext.cgiGet( edtavMmsfchini_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9MMSFchIni", localUtil.format(AV9MMSFchIni, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavMmsfchfin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vMMSFCHFIN");
            GX_FocusControl = edtavMmsfchfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7MMSFchFin = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7MMSFchFin", localUtil.format(AV7MMSFchFin, "99/99/99"));
         }
         else
         {
            AV7MMSFchFin = localUtil.ctod( httpContext.cgiGet( edtavMmsfchfin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7MMSFchFin", localUtil.format(AV7MMSFchFin, "99/99/99"));
         }
         hV15MRIni = httpContext.cgiGet( edtavMrini_Internalname) ;
         if ( (GXutil.strcmp("", hV15MRIni)==0) )
         {
            AV15MRIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MRIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15MRIni), 8, 0));
         }
         else
         {
            A13718MRCNom = hV15MRIni ;
            /* Using cursor H015614 */
            pr_default.execute(12, new Object[] {A13718MRCNom});
            AV15MRIni = H015614_A9492MRCod[0] ;
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               pr_default.readNext(12);
               if ( ! ( (pr_default.getStatus(12) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "vMRINI");
                  GX_FocusControl = edtavMrini_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(12);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV15MRIni", hV15MRIni);
         hV13MRFin = httpContext.cgiGet( edtavMrfin_Internalname) ;
         if ( (GXutil.strcmp("", hV13MRFin)==0) )
         {
            AV13MRFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13MRFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MRFin), 8, 0));
         }
         else
         {
            A13718MRCNom = hV13MRFin ;
            /* Using cursor H015615 */
            pr_default.execute(13, new Object[] {A13718MRCNom});
            AV13MRFin = H015615_A9492MRCod[0] ;
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               pr_default.readNext(13);
               if ( ! ( (pr_default.getStatus(13) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "vMRFIN");
                  GX_FocusControl = edtavMrfin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(13);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV13MRFin", hV13MRFin);
         hV12MMSPrvIni = httpContext.cgiGet( edtavMmsprvini_Internalname) ;
         if ( (GXutil.strcmp("", hV12MMSPrvIni)==0) )
         {
            AV12MMSPrvIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12MMSPrvIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12MMSPrvIni), 6, 0));
         }
         else
         {
            A13719PrvNNom = hV12MMSPrvIni ;
            /* Using cursor H015616 */
            pr_default.execute(14, new Object[] {A13719PrvNNom});
            AV12MMSPrvIni = H015616_A795PrvNum[0] ;
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               pr_default.readNext(14);
               if ( ! ( (pr_default.getStatus(14) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "vMMSPRVINI");
                  GX_FocusControl = edtavMmsprvini_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(14);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV12MMSPrvIni", hV12MMSPrvIni);
         hV10MMSPrvFin = httpContext.cgiGet( edtavMmsprvfin_Internalname) ;
         if ( (GXutil.strcmp("", hV10MMSPrvFin)==0) )
         {
            AV10MMSPrvFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10MMSPrvFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10MMSPrvFin), 6, 0));
         }
         else
         {
            A13719PrvNNom = hV10MMSPrvFin ;
            /* Using cursor H015617 */
            pr_default.execute(15, new Object[] {A13719PrvNNom});
            AV10MMSPrvFin = H015617_A795PrvNum[0] ;
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               pr_default.readNext(15);
               if ( ! ( (pr_default.getStatus(15) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "vMMSPRVFIN");
                  GX_FocusControl = edtavMmsprvfin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(15);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV10MMSPrvFin", hV10MMSPrvFin);
         hV19OMMaqIni = httpContext.cgiGet( edtavOmmaqini_Internalname) ;
         if ( (GXutil.strcmp("", hV19OMMaqIni)==0) )
         {
            AV19OMMaqIni = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19OMMaqIni", AV19OMMaqIni);
         }
         else
         {
            A13734MaqCDsc = hV19OMMaqIni ;
            /* Using cursor H015618 */
            pr_default.execute(16, new Object[] {A13734MaqCDsc});
            AV19OMMaqIni = H015618_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               pr_default.readNext(16);
               if ( ! ( (pr_default.getStatus(16) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vOMMAQINI");
                  GX_FocusControl = edtavOmmaqini_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(16);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV19OMMaqIni", hV19OMMaqIni);
         hV16OMMaqFin = httpContext.cgiGet( edtavOmmaqfin_Internalname) ;
         if ( (GXutil.strcmp("", hV16OMMaqFin)==0) )
         {
            AV16OMMaqFin = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16OMMaqFin", AV16OMMaqFin);
         }
         else
         {
            A13734MaqCDsc = hV16OMMaqFin ;
            /* Using cursor H015619 */
            pr_default.execute(17, new Object[] {A13734MaqCDsc});
            AV16OMMaqFin = H015619_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               pr_default.readNext(17);
               if ( ! ( (pr_default.getStatus(17) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vOMMAQFIN");
                  GX_FocusControl = edtavOmmaqfin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(17);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV16OMMaqFin", hV16OMMaqFin);
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
      e111562 ();
      if (returnInSub) return;
   }

   public void e111562( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV25Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webrepuestoconsulta_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      webrepuestoconsulta_impl.this.AV5EmprCod = GXv_char2[0] ;
      webrepuestoconsulta_impl.this.AV6EmprNom = GXv_char3[0] ;
      webrepuestoconsulta_impl.this.AV27UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      GXt_char1 = AV25Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webrepuestoconsulta_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25Station = GXt_char1 ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char2[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char4, GXv_char3, GXv_char2) ;
      webrepuestoconsulta_impl.this.AV5EmprCod = GXv_char4[0] ;
      webrepuestoconsulta_impl.this.AV6EmprNom = GXv_char3[0] ;
      webrepuestoconsulta_impl.this.AV27UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e121562 ();
      if (returnInSub) return;
   }

   public void e121562( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV8MMSFchFin1 = GXutil.dadd((GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7MMSFchFin)) ? localUtil.ctod( "31/12/48", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) : AV7MMSFchFin),+(1)) ;
      AV11MMSPrvFin1 = ((0==AV10MMSPrvFin) ? 999999 : AV10MMSPrvFin) ;
      AV14MRFin1 = ((0==AV13MRFin) ? 99999999 : AV13MRFin) ;
      AV17OMMaqFin1 = ((GXutil.strcmp("", AV16OMMaqFin)==0) ? httpContext.getMessage( "zzzzzz", "") : AV16OMMaqFin) ;
      AV21OMSecFin1 = ((GXutil.strcmp("", AV20OMSecFin)==0) ? httpContext.getMessage( "zz", "") : AV20OMSecFin) ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8MMSFchFin1)) && GXutil.resetTime(AV8MMSFchFin1).before( GXutil.resetTime( AV9MMSFchIni )) )
      {
         AV28TemporalMMSFch = AV9MMSFchIni ;
         AV9MMSFchIni = AV8MMSFchFin1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9MMSFchIni", localUtil.format(AV9MMSFchIni, "99/99/99"));
         AV8MMSFchFin1 = AV28TemporalMMSFch ;
         AV7MMSFchFin = AV28TemporalMMSFch ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7MMSFchFin", localUtil.format(AV7MMSFchFin, "99/99/99"));
      }
      if ( ! (0==AV11MMSPrvFin1) && ( AV11MMSPrvFin1 < AV12MMSPrvIni ) )
      {
         AV29TemporalMMSPrv = (short)(AV12MMSPrvIni) ;
         AV12MMSPrvIni = AV11MMSPrvFin1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12MMSPrvIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12MMSPrvIni), 6, 0));
         /* Using cursor H015620 */
         pr_default.execute(18, new Object[] {Integer.valueOf(AV12MMSPrvIni)});
         hV12MMSPrvIni = "" ;
         while ( (pr_default.getStatus(18) != 101) )
         {
            hV12MMSPrvIni = H015620_A13719PrvNNom[0] ;
            if (true) break;
         }
         pr_default.close(18);
         httpContext.ajax_rsp_assign_attri("", false, "hV12MMSPrvIni", hV12MMSPrvIni);
         AV11MMSPrvFin1 = AV29TemporalMMSPrv ;
         AV10MMSPrvFin = AV29TemporalMMSPrv ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10MMSPrvFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10MMSPrvFin), 6, 0));
         /* Using cursor H015621 */
         pr_default.execute(19, new Object[] {Integer.valueOf(AV10MMSPrvFin)});
         hV10MMSPrvFin = "" ;
         while ( (pr_default.getStatus(19) != 101) )
         {
            hV10MMSPrvFin = H015621_A13719PrvNNom[0] ;
            if (true) break;
         }
         pr_default.close(19);
         httpContext.ajax_rsp_assign_attri("", false, "hV10MMSPrvFin", hV10MMSPrvFin);
      }
      if ( ! (0==AV14MRFin1) && ( AV14MRFin1 < AV15MRIni ) )
      {
         AV31TemporalMRCod = AV15MRIni ;
         AV15MRIni = AV14MRFin1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MRIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15MRIni), 8, 0));
         /* Using cursor H015622 */
         pr_default.execute(20, new Object[] {Integer.valueOf(AV15MRIni)});
         hV15MRIni = "" ;
         while ( (pr_default.getStatus(20) != 101) )
         {
            hV15MRIni = H015622_A13718MRCNom[0] ;
            if (true) break;
         }
         pr_default.close(20);
         httpContext.ajax_rsp_assign_attri("", false, "hV15MRIni", hV15MRIni);
         AV14MRFin1 = AV31TemporalMRCod ;
         AV13MRFin = AV31TemporalMRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13MRFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MRFin), 8, 0));
         /* Using cursor H015623 */
         pr_default.execute(21, new Object[] {Integer.valueOf(AV13MRFin)});
         hV13MRFin = "" ;
         while ( (pr_default.getStatus(21) != 101) )
         {
            hV13MRFin = H015623_A13718MRCNom[0] ;
            if (true) break;
         }
         pr_default.close(21);
         httpContext.ajax_rsp_assign_attri("", false, "hV13MRFin", hV13MRFin);
      }
      if ( ! (GXutil.strcmp("", AV17OMMaqFin1)==0) && ( GXutil.strcmp(AV17OMMaqFin1, AV19OMMaqIni) < 0 ) )
      {
         AV32TemporalMaqCod = AV19OMMaqIni ;
         AV19OMMaqIni = AV17OMMaqFin1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19OMMaqIni", AV19OMMaqIni);
         /* Using cursor H015624 */
         pr_default.execute(22, new Object[] {AV19OMMaqIni});
         hV19OMMaqIni = "" ;
         while ( (pr_default.getStatus(22) != 101) )
         {
            hV19OMMaqIni = H015624_A13734MaqCDsc[0] ;
            if (true) break;
         }
         pr_default.close(22);
         httpContext.ajax_rsp_assign_attri("", false, "hV19OMMaqIni", hV19OMMaqIni);
         AV17OMMaqFin1 = AV32TemporalMaqCod ;
         AV16OMMaqFin = AV32TemporalMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OMMaqFin", AV16OMMaqFin);
         /* Using cursor H015625 */
         pr_default.execute(23, new Object[] {AV16OMMaqFin});
         hV16OMMaqFin = "" ;
         while ( (pr_default.getStatus(23) != 101) )
         {
            hV16OMMaqFin = H015625_A13734MaqCDsc[0] ;
            if (true) break;
         }
         pr_default.close(23);
         httpContext.ajax_rsp_assign_attri("", false, "hV16OMMaqFin", hV16OMMaqFin);
      }
      if ( AV26Tipo == 1 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.pcamcli", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15MRIni,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14MRFin1,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV9MMSFchIni)),GXutil.URLEncode(GXutil.formatDateParm(AV8MMSFchFin1)),GXutil.URLEncode(GXutil.rtrim(AV19OMMaqIni)),GXutil.URLEncode(GXutil.rtrim(AV17OMMaqFin1))}, new String[] {"EmprCod","MRCodIni","MRCodFin","OMFchIni","OMFchFin","OMMaqIni","OMMaqFin"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
      }
      else if ( AV26Tipo == 2 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.pfachss", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15MRIni,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14MRFin1,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV9MMSFchIni)),GXutil.URLEncode(GXutil.formatDateParm(AV8MMSFchFin1)),GXutil.URLEncode(GXutil.rtrim(AV19OMMaqIni)),GXutil.URLEncode(GXutil.rtrim(AV17OMMaqFin1))}, new String[] {"EmprCod","MRCodIni","MRCodFin","OMFchIni","OMFchFin","OMMaqIni","OMMaqFin"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
      }
      else if ( AV26Tipo == 3 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.pinftin", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
      }
      else if ( AV26Tipo == 4 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.pfacta0", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Selecciona un tipo de reporte", "", "", "", "", "", "", "", "", ""));
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e131562( )
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
      pa1562( ) ;
      ws1562( ) ;
      we1562( ) ;
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
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016424581", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/webrepuestoconsulta.js", "?202661016424582", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavTipo.setInternalname( "vTIPO" );
      edtavMmsfchini_Internalname = "vMMSFCHINI" ;
      edtavMmsfchfin_Internalname = "vMMSFCHFIN" ;
      edtavMrini_Internalname = "vMRINI" ;
      edtavMrfin_Internalname = "vMRFIN" ;
      edtavMmsprvini_Internalname = "vMMSPRVINI" ;
      edtavMmsprvfin_Internalname = "vMMSPRVFIN" ;
      edtavOmmaqini_Internalname = "vOMMAQINI" ;
      edtavOmmaqfin_Internalname = "vOMMAQFIN" ;
      divTablerangos_Internalname = "TABLERANGOS" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
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
      edtavOmmaqfin_Jsonclick = "" ;
      edtavOmmaqfin_Enabled = 1 ;
      edtavOmmaqini_Jsonclick = "" ;
      edtavOmmaqini_Enabled = 1 ;
      edtavMmsprvfin_Jsonclick = "" ;
      edtavMmsprvfin_Enabled = 1 ;
      edtavMmsprvini_Jsonclick = "" ;
      edtavMmsprvini_Enabled = 1 ;
      edtavMrfin_Jsonclick = "" ;
      edtavMrfin_Enabled = 1 ;
      edtavMrini_Jsonclick = "" ;
      edtavMrini_Enabled = 1 ;
      edtavMmsfchfin_Jsonclick = "" ;
      edtavMmsfchfin_Enabled = 1 ;
      edtavMmsfchini_Jsonclick = "" ;
      edtavMmsfchini_Enabled = 1 ;
      cmbavTipo.setJsonclick( "" );
      cmbavTipo.setEnabled( 1 );
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = "" ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consulta de Repuestos", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavTipo.setName( "vTIPO" );
      cmbavTipo.setWebtags( "" );
      cmbavTipo.addItem(GXutil.trim( GXutil.str( 0, 1, 0)), httpContext.getMessage( "GX_EmptyItemText", ""), (short)(0));
      cmbavTipo.addItem("1", httpContext.getMessage( "Consumos por Maquina", ""), (short)(0));
      cmbavTipo.addItem("2", httpContext.getMessage( "Consumos por Maquina y mes", ""), (short)(0));
      cmbavTipo.addItem("3", httpContext.getMessage( "Consumos por seeción y mes", ""), (short)(0));
      cmbavTipo.addItem("4", httpContext.getMessage( "Compras por proveedor y mes", ""), (short)(0));
      if ( cmbavTipo.getItemCount() > 0 )
      {
         AV26Tipo = (byte)(GXutil.lval( cmbavTipo.getValidValue(GXutil.trim( GXutil.str( AV26Tipo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Tipo", GXutil.str( AV26Tipo, 1, 0));
      }
      /* End function init_web_controls */
   }

   public void validv_Mrini( )
   {
      if ( (GXutil.strcmp("", hV15MRIni)==0) )
      {
         AV15MRIni = 0 ;
      }
      else
      {
         A13718MRCNom = hV15MRIni ;
         /* Using cursor H015626 */
         pr_default.execute(24, new Object[] {A13718MRCNom});
         AV15MRIni = H015626_A9492MRCod[0] ;
         if ( ! ( (pr_default.getStatus(24) == 101) ) )
         {
            pr_default.readNext(24);
            if ( ! ( (pr_default.getStatus(24) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "vMRINI");
               GX_FocusControl = edtavMrini_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(24);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV15MRIni", hV15MRIni);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV15MRIni", GXutil.ltrim( localUtil.ntoc( AV15MRIni, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV15MRIni", hV15MRIni);
   }

   public void validv_Mrfin( )
   {
      if ( (GXutil.strcmp("", hV13MRFin)==0) )
      {
         AV13MRFin = 0 ;
      }
      else
      {
         A13718MRCNom = hV13MRFin ;
         /* Using cursor H015627 */
         pr_default.execute(25, new Object[] {A13718MRCNom});
         AV13MRFin = H015627_A9492MRCod[0] ;
         if ( ! ( (pr_default.getStatus(25) == 101) ) )
         {
            pr_default.readNext(25);
            if ( ! ( (pr_default.getStatus(25) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo y Nombre", "")}), 1, "vMRFIN");
               GX_FocusControl = edtavMrfin_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(25);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV13MRFin", hV13MRFin);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV13MRFin", GXutil.ltrim( localUtil.ntoc( AV13MRFin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV13MRFin", hV13MRFin);
   }

   public void validv_Mmsprvini( )
   {
      if ( (GXutil.strcmp("", hV12MMSPrvIni)==0) )
      {
         AV12MMSPrvIni = 0 ;
      }
      else
      {
         A13719PrvNNom = hV12MMSPrvIni ;
         /* Using cursor H015628 */
         pr_default.execute(26, new Object[] {A13719PrvNNom});
         AV12MMSPrvIni = H015628_A795PrvNum[0] ;
         if ( ! ( (pr_default.getStatus(26) == 101) ) )
         {
            pr_default.readNext(26);
            if ( ! ( (pr_default.getStatus(26) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "vMMSPRVINI");
               GX_FocusControl = edtavMmsprvini_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(26);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV12MMSPrvIni", hV12MMSPrvIni);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV12MMSPrvIni", GXutil.ltrim( localUtil.ntoc( AV12MMSPrvIni, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV12MMSPrvIni", hV12MMSPrvIni);
   }

   public void validv_Mmsprvfin( )
   {
      if ( (GXutil.strcmp("", hV10MMSPrvFin)==0) )
      {
         AV10MMSPrvFin = 0 ;
      }
      else
      {
         A13719PrvNNom = hV10MMSPrvFin ;
         /* Using cursor H015629 */
         pr_default.execute(27, new Object[] {A13719PrvNNom});
         AV10MMSPrvFin = H015629_A795PrvNum[0] ;
         if ( ! ( (pr_default.getStatus(27) == 101) ) )
         {
            pr_default.readNext(27);
            if ( ! ( (pr_default.getStatus(27) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "vMMSPRVFIN");
               GX_FocusControl = edtavMmsprvfin_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(27);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV10MMSPrvFin", hV10MMSPrvFin);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV10MMSPrvFin", GXutil.ltrim( localUtil.ntoc( AV10MMSPrvFin, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV10MMSPrvFin", hV10MMSPrvFin);
   }

   public void validv_Ommaqini( )
   {
      if ( (GXutil.strcmp("", hV19OMMaqIni)==0) )
      {
         AV19OMMaqIni = "" ;
      }
      else
      {
         A13734MaqCDsc = hV19OMMaqIni ;
         /* Using cursor H015630 */
         pr_default.execute(28, new Object[] {A13734MaqCDsc});
         AV19OMMaqIni = H015630_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(28) == 101) ) )
         {
            pr_default.readNext(28);
            if ( ! ( (pr_default.getStatus(28) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vOMMAQINI");
               GX_FocusControl = edtavOmmaqini_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(28);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV19OMMaqIni", hV19OMMaqIni);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV19OMMaqIni", GXutil.rtrim( AV19OMMaqIni));
      httpContext.ajax_rsp_assign_attri("", false, "hV19OMMaqIni", hV19OMMaqIni);
   }

   public void validv_Ommaqfin( )
   {
      if ( (GXutil.strcmp("", hV16OMMaqFin)==0) )
      {
         AV16OMMaqFin = "" ;
      }
      else
      {
         A13734MaqCDsc = hV16OMMaqFin ;
         /* Using cursor H015631 */
         pr_default.execute(29, new Object[] {A13734MaqCDsc});
         AV16OMMaqFin = H015631_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(29) == 101) ) )
         {
            pr_default.readNext(29);
            if ( ! ( (pr_default.getStatus(29) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vOMMAQFIN");
               GX_FocusControl = edtavOmmaqfin_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(29);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV16OMMaqFin", hV16OMMaqFin);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV16OMMaqFin", GXutil.rtrim( AV16OMMaqFin));
      httpContext.ajax_rsp_assign_attri("", false, "hV16OMMaqFin", hV16OMMaqFin);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV20OMSecFin',fld:'vOMSECFIN',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e121562',iparms:[{av:'AV7MMSFchFin',fld:'vMMSFCHFIN',pic:''},{av:'AV10MMSPrvFin',fld:'vMMSPRVFIN',pic:'ZZZZZ9'},{av:'AV13MRFin',fld:'vMRFIN',pic:'ZZZZZZZ9'},{av:'AV16OMMaqFin',fld:'vOMMAQFIN',pic:''},{av:'AV20OMSecFin',fld:'vOMSECFIN',pic:'',hsh:true},{av:'AV9MMSFchIni',fld:'vMMSFCHINI',pic:''},{av:'AV12MMSPrvIni',fld:'vMMSPRVINI',pic:'ZZZZZ9'},{av:'AV15MRIni',fld:'vMRINI',pic:'ZZZZZZZ9'},{av:'AV19OMMaqIni',fld:'vOMMAQINI',pic:''},{av:'cmbavTipo'},{av:'AV26Tipo',fld:'vTIPO',pic:'9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV9MMSFchIni',fld:'vMMSFCHINI',pic:''},{av:'AV7MMSFchFin',fld:'vMMSFCHFIN',pic:''},{av:'AV12MMSPrvIni',fld:'vMMSPRVINI',pic:'ZZZZZ9'},{av:'AV10MMSPrvFin',fld:'vMMSPRVFIN',pic:'ZZZZZ9'},{av:'AV15MRIni',fld:'vMRINI',pic:'ZZZZZZZ9'},{av:'AV13MRFin',fld:'vMRFIN',pic:'ZZZZZZZ9'},{av:'AV19OMMaqIni',fld:'vOMMAQINI',pic:''},{av:'AV16OMMaqFin',fld:'vOMMAQFIN',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_MRINI","{handler:'validv_Mrini',iparms:[{av:'hV15MRIni'},{av:'AV15MRIni',fld:'vMRINI',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALIDV_MRINI",",oparms:[{av:'AV15MRIni',fld:'vMRINI',pic:'ZZZZZZZ9'},{av:'hV15MRIni'}]}");
      setEventMetadata("VALIDV_MRFIN","{handler:'validv_Mrfin',iparms:[{av:'hV13MRFin'},{av:'AV13MRFin',fld:'vMRFIN',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALIDV_MRFIN",",oparms:[{av:'AV13MRFin',fld:'vMRFIN',pic:'ZZZZZZZ9'},{av:'hV13MRFin'}]}");
      setEventMetadata("VALIDV_MMSPRVINI","{handler:'validv_Mmsprvini',iparms:[{av:'hV12MMSPrvIni'},{av:'AV12MMSPrvIni',fld:'vMMSPRVINI',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_MMSPRVINI",",oparms:[{av:'AV12MMSPrvIni',fld:'vMMSPRVINI',pic:'ZZZZZ9'},{av:'hV12MMSPrvIni'}]}");
      setEventMetadata("VALIDV_MMSPRVFIN","{handler:'validv_Mmsprvfin',iparms:[{av:'hV10MMSPrvFin'},{av:'AV10MMSPrvFin',fld:'vMMSPRVFIN',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_MMSPRVFIN",",oparms:[{av:'AV10MMSPrvFin',fld:'vMMSPRVFIN',pic:'ZZZZZ9'},{av:'hV10MMSPrvFin'}]}");
      setEventMetadata("VALIDV_OMMAQINI","{handler:'validv_Ommaqini',iparms:[{av:'hV19OMMaqIni'},{av:'AV19OMMaqIni',fld:'vOMMAQINI',pic:''}]");
      setEventMetadata("VALIDV_OMMAQINI",",oparms:[{av:'AV19OMMaqIni',fld:'vOMMAQINI',pic:''},{av:'hV19OMMaqIni'}]}");
      setEventMetadata("VALIDV_OMMAQFIN","{handler:'validv_Ommaqfin',iparms:[{av:'hV16OMMaqFin'},{av:'AV16OMMaqFin',fld:'vOMMAQFIN',pic:''}]");
      setEventMetadata("VALIDV_OMMAQFIN",",oparms:[{av:'AV16OMMaqFin',fld:'vOMMAQFIN',pic:''},{av:'hV16OMMaqFin'}]}");
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
      A13718MRCNom = "" ;
      A13719PrvNNom = "" ;
      A13734MaqCDsc = "" ;
      hV15MRIni = "" ;
      hV13MRFin = "" ;
      hV12MMSPrvIni = "" ;
      hV10MMSPrvFin = "" ;
      hV19OMMaqIni = "" ;
      hV16OMMaqFin = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV20OMSecFin = "" ;
      GXKey = "" ;
      AV5EmprCod = "" ;
      AV19OMMaqIni = "" ;
      AV16OMMaqFin = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV9MMSFchIni = GXutil.nullDate() ;
      AV7MMSFchFin = GXutil.nullDate() ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13718MRCNom = "" ;
      H01562_A13718MRCNom = new String[] {""} ;
      H01563_A13718MRCNom = new String[] {""} ;
      l13719PrvNNom = "" ;
      H01564_A13719PrvNNom = new String[] {""} ;
      H01565_A13719PrvNNom = new String[] {""} ;
      l13734MaqCDsc = "" ;
      H01566_A13734MaqCDsc = new String[] {""} ;
      H01567_A13734MaqCDsc = new String[] {""} ;
      H01568_A13718MRCNom = new String[] {""} ;
      H01568_A396EmprCod = new String[] {""} ;
      H01568_A9492MRCod = new int[1] ;
      A396EmprCod = "" ;
      H01569_A13718MRCNom = new String[] {""} ;
      H01569_A396EmprCod = new String[] {""} ;
      H01569_A9492MRCod = new int[1] ;
      H015610_A13719PrvNNom = new String[] {""} ;
      H015610_A396EmprCod = new String[] {""} ;
      H015610_A795PrvNum = new int[1] ;
      H015611_A13719PrvNNom = new String[] {""} ;
      H015611_A396EmprCod = new String[] {""} ;
      H015611_A795PrvNum = new int[1] ;
      H015612_A13734MaqCDsc = new String[] {""} ;
      H015612_A396EmprCod = new String[] {""} ;
      H015612_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      H015613_A13734MaqCDsc = new String[] {""} ;
      H015613_A396EmprCod = new String[] {""} ;
      H015613_A602MaqCod = new String[] {""} ;
      H015614_A13718MRCNom = new String[] {""} ;
      H015614_A396EmprCod = new String[] {""} ;
      H015614_A9492MRCod = new int[1] ;
      H015615_A13718MRCNom = new String[] {""} ;
      H015615_A396EmprCod = new String[] {""} ;
      H015615_A9492MRCod = new int[1] ;
      H015616_A13719PrvNNom = new String[] {""} ;
      H015616_A396EmprCod = new String[] {""} ;
      H015616_A795PrvNum = new int[1] ;
      H015617_A13719PrvNNom = new String[] {""} ;
      H015617_A396EmprCod = new String[] {""} ;
      H015617_A795PrvNum = new int[1] ;
      H015618_A13734MaqCDsc = new String[] {""} ;
      H015618_A396EmprCod = new String[] {""} ;
      H015618_A602MaqCod = new String[] {""} ;
      H015619_A13734MaqCDsc = new String[] {""} ;
      H015619_A396EmprCod = new String[] {""} ;
      H015619_A602MaqCod = new String[] {""} ;
      AV25Station = "" ;
      AV6EmprNom = "" ;
      AV27UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV8MMSFchFin1 = GXutil.nullDate() ;
      AV17OMMaqFin1 = "" ;
      AV21OMSecFin1 = "" ;
      AV28TemporalMMSFch = GXutil.nullDate() ;
      H015620_A13719PrvNNom = new String[] {""} ;
      H015620_A396EmprCod = new String[] {""} ;
      H015620_A795PrvNum = new int[1] ;
      H015621_A13719PrvNNom = new String[] {""} ;
      H015621_A396EmprCod = new String[] {""} ;
      H015621_A795PrvNum = new int[1] ;
      H015622_A13718MRCNom = new String[] {""} ;
      H015622_A396EmprCod = new String[] {""} ;
      H015622_A9492MRCod = new int[1] ;
      H015623_A13718MRCNom = new String[] {""} ;
      H015623_A396EmprCod = new String[] {""} ;
      H015623_A9492MRCod = new int[1] ;
      AV32TemporalMaqCod = "" ;
      H015624_A13734MaqCDsc = new String[] {""} ;
      H015624_A396EmprCod = new String[] {""} ;
      H015624_A602MaqCod = new String[] {""} ;
      H015625_A13734MaqCDsc = new String[] {""} ;
      H015625_A396EmprCod = new String[] {""} ;
      H015625_A602MaqCod = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H015626_A13718MRCNom = new String[] {""} ;
      H015626_A396EmprCod = new String[] {""} ;
      H015626_A9492MRCod = new int[1] ;
      ZhV15MRIni = "" ;
      H015627_A13718MRCNom = new String[] {""} ;
      H015627_A396EmprCod = new String[] {""} ;
      H015627_A9492MRCod = new int[1] ;
      ZhV13MRFin = "" ;
      H015628_A13719PrvNNom = new String[] {""} ;
      H015628_A396EmprCod = new String[] {""} ;
      H015628_A795PrvNum = new int[1] ;
      ZhV12MMSPrvIni = "" ;
      H015629_A13719PrvNNom = new String[] {""} ;
      H015629_A396EmprCod = new String[] {""} ;
      H015629_A795PrvNum = new int[1] ;
      ZhV10MMSPrvFin = "" ;
      H015630_A13734MaqCDsc = new String[] {""} ;
      H015630_A396EmprCod = new String[] {""} ;
      H015630_A602MaqCod = new String[] {""} ;
      ZV19OMMaqIni = "" ;
      ZhV19OMMaqIni = "" ;
      H015631_A13734MaqCDsc = new String[] {""} ;
      H015631_A396EmprCod = new String[] {""} ;
      H015631_A602MaqCod = new String[] {""} ;
      ZV16OMMaqFin = "" ;
      ZhV16OMMaqFin = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.webrepuestoconsulta__default(),
         new Object[] {
             new Object[] {
            H01562_A13718MRCNom
            }
            , new Object[] {
            H01563_A13718MRCNom
            }
            , new Object[] {
            H01564_A13719PrvNNom
            }
            , new Object[] {
            H01565_A13719PrvNNom
            }
            , new Object[] {
            H01566_A13734MaqCDsc
            }
            , new Object[] {
            H01567_A13734MaqCDsc
            }
            , new Object[] {
            H01568_A13718MRCNom, H01568_A396EmprCod, H01568_A9492MRCod
            }
            , new Object[] {
            H01569_A13718MRCNom, H01569_A396EmprCod, H01569_A9492MRCod
            }
            , new Object[] {
            H015610_A13719PrvNNom, H015610_A396EmprCod, H015610_A795PrvNum
            }
            , new Object[] {
            H015611_A13719PrvNNom, H015611_A396EmprCod, H015611_A795PrvNum
            }
            , new Object[] {
            H015612_A13734MaqCDsc, H015612_A396EmprCod, H015612_A602MaqCod
            }
            , new Object[] {
            H015613_A13734MaqCDsc, H015613_A396EmprCod, H015613_A602MaqCod
            }
            , new Object[] {
            H015614_A13718MRCNom, H015614_A396EmprCod, H015614_A9492MRCod
            }
            , new Object[] {
            H015615_A13718MRCNom, H015615_A396EmprCod, H015615_A9492MRCod
            }
            , new Object[] {
            H015616_A13719PrvNNom, H015616_A396EmprCod, H015616_A795PrvNum
            }
            , new Object[] {
            H015617_A13719PrvNNom, H015617_A396EmprCod, H015617_A795PrvNum
            }
            , new Object[] {
            H015618_A13734MaqCDsc, H015618_A396EmprCod, H015618_A602MaqCod
            }
            , new Object[] {
            H015619_A13734MaqCDsc, H015619_A396EmprCod, H015619_A602MaqCod
            }
            , new Object[] {
            H015620_A13719PrvNNom, H015620_A396EmprCod, H015620_A795PrvNum
            }
            , new Object[] {
            H015621_A13719PrvNNom, H015621_A396EmprCod, H015621_A795PrvNum
            }
            , new Object[] {
            H015622_A13718MRCNom, H015622_A396EmprCod, H015622_A9492MRCod
            }
            , new Object[] {
            H015623_A13718MRCNom, H015623_A396EmprCod, H015623_A9492MRCod
            }
            , new Object[] {
            H015624_A13734MaqCDsc, H015624_A396EmprCod, H015624_A602MaqCod
            }
            , new Object[] {
            H015625_A13734MaqCDsc, H015625_A396EmprCod, H015625_A602MaqCod
            }
            , new Object[] {
            H015626_A13718MRCNom, H015626_A396EmprCod, H015626_A9492MRCod
            }
            , new Object[] {
            H015627_A13718MRCNom, H015627_A396EmprCod, H015627_A9492MRCod
            }
            , new Object[] {
            H015628_A13719PrvNNom, H015628_A396EmprCod, H015628_A795PrvNum
            }
            , new Object[] {
            H015629_A13719PrvNNom, H015629_A396EmprCod, H015629_A795PrvNum
            }
            , new Object[] {
            H015630_A13734MaqCDsc, H015630_A396EmprCod, H015630_A602MaqCod
            }
            , new Object[] {
            H015631_A13734MaqCDsc, H015631_A396EmprCod, H015631_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV26Tipo ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short AV29TemporalMMSPrv ;
   private int AV15MRIni ;
   private int AV13MRFin ;
   private int AV12MMSPrvIni ;
   private int AV10MMSPrvFin ;
   private int edtavMmsfchini_Enabled ;
   private int edtavMmsfchfin_Enabled ;
   private int edtavMrini_Enabled ;
   private int edtavMrfin_Enabled ;
   private int edtavMmsprvini_Enabled ;
   private int edtavMmsprvfin_Enabled ;
   private int edtavOmmaqini_Enabled ;
   private int edtavOmmaqfin_Enabled ;
   private int gxdynajaxindex ;
   private int A9492MRCod ;
   private int A795PrvNum ;
   private int AV11MMSPrvFin1 ;
   private int AV14MRFin1 ;
   private int AV31TemporalMRCod ;
   private int idxLst ;
   private int ZV15MRIni ;
   private int ZV13MRFin ;
   private int ZV12MMSPrvIni ;
   private int ZV10MMSPrvFin ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV20OMSecFin ;
   private String GXKey ;
   private String AV5EmprCod ;
   private String AV19OMMaqIni ;
   private String AV16OMMaqFin ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String TempTags ;
   private String divTablerangos_Internalname ;
   private String edtavMmsfchini_Internalname ;
   private String edtavMmsfchini_Jsonclick ;
   private String edtavMmsfchfin_Internalname ;
   private String edtavMmsfchfin_Jsonclick ;
   private String edtavMrini_Internalname ;
   private String edtavMrini_Jsonclick ;
   private String edtavMrfin_Internalname ;
   private String edtavMrfin_Jsonclick ;
   private String edtavMmsprvini_Internalname ;
   private String edtavMmsprvini_Jsonclick ;
   private String edtavMmsprvfin_Internalname ;
   private String edtavMmsprvfin_Jsonclick ;
   private String edtavOmmaqini_Internalname ;
   private String edtavOmmaqini_Jsonclick ;
   private String edtavOmmaqfin_Internalname ;
   private String edtavOmmaqfin_Jsonclick ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV25Station ;
   private String AV6EmprNom ;
   private String AV27UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV17OMMaqFin1 ;
   private String AV21OMSecFin1 ;
   private String AV32TemporalMaqCod ;
   private String ZV19OMMaqIni ;
   private String ZV16OMMaqFin ;
   private java.util.Date AV9MMSFchIni ;
   private java.util.Date AV7MMSFchFin ;
   private java.util.Date AV8MMSFchFin1 ;
   private java.util.Date AV28TemporalMMSFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String A13718MRCNom ;
   private String A13719PrvNNom ;
   private String A13734MaqCDsc ;
   private String hV15MRIni ;
   private String hV13MRFin ;
   private String hV12MMSPrvIni ;
   private String hV10MMSPrvFin ;
   private String hV19OMMaqIni ;
   private String hV16OMMaqFin ;
   private String l13718MRCNom ;
   private String l13719PrvNNom ;
   private String l13734MaqCDsc ;
   private String ZhV15MRIni ;
   private String ZhV13MRFin ;
   private String ZhV12MMSPrvIni ;
   private String ZhV10MMSPrvFin ;
   private String ZhV19OMMaqIni ;
   private String ZhV16OMMaqFin ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private HTMLChoice cmbavTipo ;
   private IDataStoreProvider pr_default ;
   private String[] H01562_A13718MRCNom ;
   private String[] H01563_A13718MRCNom ;
   private String[] H01564_A13719PrvNNom ;
   private String[] H01565_A13719PrvNNom ;
   private String[] H01566_A13734MaqCDsc ;
   private String[] H01567_A13734MaqCDsc ;
   private String[] H01568_A13718MRCNom ;
   private String[] H01568_A396EmprCod ;
   private int[] H01568_A9492MRCod ;
   private String[] H01569_A13718MRCNom ;
   private String[] H01569_A396EmprCod ;
   private int[] H01569_A9492MRCod ;
   private String[] H015610_A13719PrvNNom ;
   private String[] H015610_A396EmprCod ;
   private int[] H015610_A795PrvNum ;
   private String[] H015611_A13719PrvNNom ;
   private String[] H015611_A396EmprCod ;
   private int[] H015611_A795PrvNum ;
   private String[] H015612_A13734MaqCDsc ;
   private String[] H015612_A396EmprCod ;
   private String[] H015612_A602MaqCod ;
   private String[] H015613_A13734MaqCDsc ;
   private String[] H015613_A396EmprCod ;
   private String[] H015613_A602MaqCod ;
   private String[] H015614_A13718MRCNom ;
   private String[] H015614_A396EmprCod ;
   private int[] H015614_A9492MRCod ;
   private String[] H015615_A13718MRCNom ;
   private String[] H015615_A396EmprCod ;
   private int[] H015615_A9492MRCod ;
   private String[] H015616_A13719PrvNNom ;
   private String[] H015616_A396EmprCod ;
   private int[] H015616_A795PrvNum ;
   private String[] H015617_A13719PrvNNom ;
   private String[] H015617_A396EmprCod ;
   private int[] H015617_A795PrvNum ;
   private String[] H015618_A13734MaqCDsc ;
   private String[] H015618_A396EmprCod ;
   private String[] H015618_A602MaqCod ;
   private String[] H015619_A13734MaqCDsc ;
   private String[] H015619_A396EmprCod ;
   private String[] H015619_A602MaqCod ;
   private String[] H015620_A13719PrvNNom ;
   private String[] H015620_A396EmprCod ;
   private int[] H015620_A795PrvNum ;
   private String[] H015621_A13719PrvNNom ;
   private String[] H015621_A396EmprCod ;
   private int[] H015621_A795PrvNum ;
   private String[] H015622_A13718MRCNom ;
   private String[] H015622_A396EmprCod ;
   private int[] H015622_A9492MRCod ;
   private String[] H015623_A13718MRCNom ;
   private String[] H015623_A396EmprCod ;
   private int[] H015623_A9492MRCod ;
   private String[] H015624_A13734MaqCDsc ;
   private String[] H015624_A396EmprCod ;
   private String[] H015624_A602MaqCod ;
   private String[] H015625_A13734MaqCDsc ;
   private String[] H015625_A396EmprCod ;
   private String[] H015625_A602MaqCod ;
   private String[] H015626_A13718MRCNom ;
   private String[] H015626_A396EmprCod ;
   private int[] H015626_A9492MRCod ;
   private String[] H015627_A13718MRCNom ;
   private String[] H015627_A396EmprCod ;
   private int[] H015627_A9492MRCod ;
   private String[] H015628_A13719PrvNNom ;
   private String[] H015628_A396EmprCod ;
   private int[] H015628_A795PrvNum ;
   private String[] H015629_A13719PrvNNom ;
   private String[] H015629_A396EmprCod ;
   private int[] H015629_A795PrvNum ;
   private String[] H015630_A13734MaqCDsc ;
   private String[] H015630_A396EmprCod ;
   private String[] H015630_A602MaqCod ;
   private String[] H015631_A13734MaqCDsc ;
   private String[] H015631_A396EmprCod ;
   private String[] H015631_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webrepuestoconsulta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01562", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom FROM TXPMREPUE WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01563", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom FROM TXPMREPUE WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01564", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom FROM TXPPRVGEN WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01565", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom FROM TXPPRVGEN WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01566", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01567", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01568", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01569", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015610", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015611", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015612", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015613", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015614", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015615", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015616", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015617", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015618", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015619", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015620", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE PrvNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015621", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE PrvNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015622", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE MRCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015623", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE MRCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015624", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE MaqCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015625", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE MaqCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015626", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015627", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) AS MRCNom, EmprCod, MRCod FROM TXPMREPUE WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(MRCod,'99999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( MRNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015628", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015629", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015630", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015631", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 29 :
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
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 255);
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 28 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 29 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
      }
   }

}

