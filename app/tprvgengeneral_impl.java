package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprvgengeneral_impl extends GXWebComponent
{
   public tprvgengeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprvgengeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprvgengeneral_impl.class ));
   }

   public tprvgengeneral_impl( int remoteHandle ,
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
      chkPrvPri = UIFactory.getCheckbox(this);
      cmbPrvTipo = new HTMLChoice();
      cmbPrvTip = new HTMLChoice();
      dynGpoEcoCod = new HTMLChoice();
      dynFpgCod = new HTMLChoice();
      dynPrvDivCo = new HTMLChoice();
      cmbPrvDivCod = new HTMLChoice();
      cmbPrvMetTra = new HTMLChoice();
      dynCod_Clas = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A795PrvNum)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"GPOECOCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlagpoecocodGU2( A396EmprCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"FPGCOD") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlafpgcodGU2( A396EmprCod) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"COD_CLAS") == 0 )
            {
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxdlacod_clasGU2( A396EmprCod) ;
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
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paGU2( ) ;
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
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
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
         httpContext.writeValue( httpContext.getMessage( "TPRVGENGeneral", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tprvgengeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A795PrvNum,6,0))}, new String[] {"EmprCod","PrvNum"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
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
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA795PrvNum", GXutil.ltrim( localUtil.ntoc( wcpOA795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_tableattributes_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Width", GXutil.rtrim( Dvpanel_transactiondetail_p_datoslocalizacion_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_p_datoslocalizacion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_p_datoslocalizacion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Cls", GXutil.rtrim( Dvpanel_transactiondetail_p_datoslocalizacion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Title", GXutil.rtrim( Dvpanel_transactiondetail_p_datoslocalizacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_p_datoslocalizacion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_p_datoslocalizacion_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_p_datoslocalizacion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_p_datoslocalizacion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_p_datoslocalizacion_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Width", GXutil.rtrim( Dvpanel_transactiondetail_p_datospago_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_p_datospago_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_p_datospago_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Cls", GXutil.rtrim( Dvpanel_transactiondetail_p_datospago_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Title", GXutil.rtrim( Dvpanel_transactiondetail_p_datospago_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_p_datospago_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_p_datospago_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_p_datospago_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_p_datospago_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_p_datospago_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Width", GXutil.rtrim( Dvpanel_transactiondetail_p_datoscontabilidad_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Autowidth", GXutil.booltostr( Dvpanel_transactiondetail_p_datoscontabilidad_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Autoheight", GXutil.booltostr( Dvpanel_transactiondetail_p_datoscontabilidad_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Cls", GXutil.rtrim( Dvpanel_transactiondetail_p_datoscontabilidad_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Title", GXutil.rtrim( Dvpanel_transactiondetail_p_datoscontabilidad_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Collapsible", GXutil.booltostr( Dvpanel_transactiondetail_p_datoscontabilidad_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Collapsed", GXutil.booltostr( Dvpanel_transactiondetail_p_datoscontabilidad_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Showcollapseicon", GXutil.booltostr( Dvpanel_transactiondetail_p_datoscontabilidad_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Iconposition", GXutil.rtrim( Dvpanel_transactiondetail_p_datoscontabilidad_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Autoscroll", GXutil.booltostr( Dvpanel_transactiondetail_p_datoscontabilidad_Autoscroll));
   }

   public void renderHtmlCloseFormGU2( )
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
      return "TPRVGENGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TPRVGENGeneral", "") ;
   }

   public void wbGU0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.tprvgengeneral");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_transactiondetail_tableattributes.setProperty("Width", Dvpanel_transactiondetail_tableattributes_Width);
         ucDvpanel_transactiondetail_tableattributes.setProperty("AutoWidth", Dvpanel_transactiondetail_tableattributes_Autowidth);
         ucDvpanel_transactiondetail_tableattributes.setProperty("AutoHeight", Dvpanel_transactiondetail_tableattributes_Autoheight);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Cls", Dvpanel_transactiondetail_tableattributes_Cls);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Title", Dvpanel_transactiondetail_tableattributes_Title);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Collapsible", Dvpanel_transactiondetail_tableattributes_Collapsible);
         ucDvpanel_transactiondetail_tableattributes.setProperty("Collapsed", Dvpanel_transactiondetail_tableattributes_Collapsed);
         ucDvpanel_transactiondetail_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_tableattributes_Showcollapseicon);
         ucDvpanel_transactiondetail_tableattributes.setProperty("IconPosition", Dvpanel_transactiondetail_tableattributes_Iconposition);
         ucDvpanel_transactiondetail_tableattributes.setProperty("AutoScroll", Dvpanel_transactiondetail_tableattributes_Autoscroll);
         ucDvpanel_transactiondetail_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_tableattributes_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTESContainer"+"TransactionDetail_TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvNum_Internalname, httpContext.getMessage( "Proveedor ID", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrvPri.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkPrvPri.getInternalname(), httpContext.getMessage( "Prioridad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrvPri.getInternalname(), GXutil.str( A800PrvPri, 1, 0), "", httpContext.getMessage( "Prioridad", ""), 1, chkPrvPri.getEnabled(), "1", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvNom_Internalname, httpContext.getMessage( "Nombre Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNom2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvNom2_Internalname, " ", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom2_Internalname, GXutil.rtrim( A6570PrvNom2), GXutil.rtrim( localUtil.format( A6570PrvNom2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNom2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNif_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvNif_Internalname, httpContext.getMessage( "N.I.F.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNif_Internalname, GXutil.rtrim( A793PrvNif), GXutil.rtrim( localUtil.format( A793PrvNif, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrvTipo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrvTipo.getInternalname(), " ", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvTipo, cmbPrvTipo.getInternalname(), GXutil.rtrim( A13585PrvTipo), 1, cmbPrvTipo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvTipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TPRVGENGeneral.htm");
         cmbPrvTipo.setValue( GXutil.rtrim( A13585PrvTipo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrvTipo.getInternalname(), "Values", cmbPrvTipo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrvTip.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrvTip.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvTip, cmbPrvTip.getInternalname(), GXutil.rtrim( A802PrvTip), 1, cmbPrvTip.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvTip.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TPRVGENGeneral.htm");
         cmbPrvTip.setValue( GXutil.rtrim( A802PrvTip) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrvTip.getInternalname(), "Values", cmbPrvTip.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_transactiondetail_p_datoslocalizacion.setProperty("Width", Dvpanel_transactiondetail_p_datoslocalizacion_Width);
         ucDvpanel_transactiondetail_p_datoslocalizacion.setProperty("AutoWidth", Dvpanel_transactiondetail_p_datoslocalizacion_Autowidth);
         ucDvpanel_transactiondetail_p_datoslocalizacion.setProperty("AutoHeight", Dvpanel_transactiondetail_p_datoslocalizacion_Autoheight);
         ucDvpanel_transactiondetail_p_datoslocalizacion.setProperty("Cls", Dvpanel_transactiondetail_p_datoslocalizacion_Cls);
         ucDvpanel_transactiondetail_p_datoslocalizacion.setProperty("Title", Dvpanel_transactiondetail_p_datoslocalizacion_Title);
         ucDvpanel_transactiondetail_p_datoslocalizacion.setProperty("Collapsible", Dvpanel_transactiondetail_p_datoslocalizacion_Collapsible);
         ucDvpanel_transactiondetail_p_datoslocalizacion.setProperty("Collapsed", Dvpanel_transactiondetail_p_datoslocalizacion_Collapsed);
         ucDvpanel_transactiondetail_p_datoslocalizacion.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_p_datoslocalizacion_Showcollapseicon);
         ucDvpanel_transactiondetail_p_datoslocalizacion.setProperty("IconPosition", Dvpanel_transactiondetail_p_datoslocalizacion_Iconposition);
         ucDvpanel_transactiondetail_p_datoslocalizacion.setProperty("AutoScroll", Dvpanel_transactiondetail_p_datoslocalizacion_Autoscroll);
         ucDvpanel_transactiondetail_p_datoslocalizacion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_p_datoslocalizacion_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACIONContainer"+"TransactionDetail_P_DatosLocalizacion"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_p_datoslocalizacion_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvDir_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvDir_Internalname, httpContext.getMessage( "Direccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDir_Internalname, GXutil.rtrim( A786PrvDir), GXutil.rtrim( localUtil.format( A786PrvDir, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvDir_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvDir2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvDir2_Internalname, " ", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDir2_Internalname, GXutil.rtrim( A6571PrvDir2), GXutil.rtrim( localUtil.format( A6571PrvDir2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDir2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvDir2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvPob_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvPob_Internalname, httpContext.getMessage( "Poblacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvPob_Internalname, GXutil.rtrim( A799PrvPob), GXutil.rtrim( localUtil.format( A799PrvPob, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvPob_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvPob_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGpoecocod_cell_Internalname, 1, 0, "px", 0, "px", divGpoecocod_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", dynGpoEcoCod.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynGpoEcoCod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynGpoEcoCod.getInternalname(), httpContext.getMessage( "Grupo Economico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynGpoEcoCod, dynGpoEcoCod.getInternalname(), GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0)), 1, dynGpoEcoCod.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", dynGpoEcoCod.getVisible(), dynGpoEcoCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TPRVGENGeneral.htm");
         dynGpoEcoCod.setValue( GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynGpoEcoCod.getInternalname(), "Values", dynGpoEcoCod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvTlx_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvTlx_Internalname, httpContext.getMessage( "Telex", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvTlx_Internalname, GXutil.rtrim( A804PrvTlx), GXutil.rtrim( localUtil.format( A804PrvTlx, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvTlx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvTlx_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvTlf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvTlf_Internalname, httpContext.getMessage( "Telefonos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvTlf_Internalname, GXutil.rtrim( A803PrvTlf), GXutil.rtrim( localUtil.format( A803PrvTlf, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvTlf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvTlf_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvFax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvFax_Internalname, httpContext.getMessage( "Fax", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvFax_Internalname, GXutil.rtrim( A6076PrvFax), GXutil.rtrim( localUtil.format( A6076PrvFax, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvFax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvFax_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvMail_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvMail_Internalname, httpContext.getMessage( "E-mail", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvMail_Internalname, GXutil.rtrim( A6077PrvMail), GXutil.rtrim( localUtil.format( A6077PrvMail, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvMail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvMail_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvCpo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvCpo_Internalname, httpContext.getMessage( "Codigo Postal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCpo_Internalname, GXutil.rtrim( A782PrvCpo), GXutil.rtrim( localUtil.format( A782PrvCpo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCpo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvCpo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvCp2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvCp2_Internalname, " ", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCp2_Internalname, GXutil.rtrim( A6075PrvCp2), GXutil.rtrim( localUtil.format( A6075PrvCp2, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCp2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvCp2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_transactiondetail_p_datospago.setProperty("Width", Dvpanel_transactiondetail_p_datospago_Width);
         ucDvpanel_transactiondetail_p_datospago.setProperty("AutoWidth", Dvpanel_transactiondetail_p_datospago_Autowidth);
         ucDvpanel_transactiondetail_p_datospago.setProperty("AutoHeight", Dvpanel_transactiondetail_p_datospago_Autoheight);
         ucDvpanel_transactiondetail_p_datospago.setProperty("Cls", Dvpanel_transactiondetail_p_datospago_Cls);
         ucDvpanel_transactiondetail_p_datospago.setProperty("Title", Dvpanel_transactiondetail_p_datospago_Title);
         ucDvpanel_transactiondetail_p_datospago.setProperty("Collapsible", Dvpanel_transactiondetail_p_datospago_Collapsible);
         ucDvpanel_transactiondetail_p_datospago.setProperty("Collapsed", Dvpanel_transactiondetail_p_datospago_Collapsed);
         ucDvpanel_transactiondetail_p_datospago.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_p_datospago_Showcollapseicon);
         ucDvpanel_transactiondetail_p_datospago.setProperty("IconPosition", Dvpanel_transactiondetail_p_datospago_Iconposition);
         ucDvpanel_transactiondetail_p_datospago.setProperty("AutoScroll", Dvpanel_transactiondetail_p_datospago_Autoscroll);
         ucDvpanel_transactiondetail_p_datospago.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_p_datospago_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGOContainer"+"TransactionDetail_P_DatosPago"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_p_datospago_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynFpgCod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynFpgCod.getInternalname(), httpContext.getMessage( "Forma de Pago", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynFpgCod, dynFpgCod.getInternalname(), GXutil.rtrim( A497FpgCod), 1, dynFpgCod.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, dynFpgCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TPRVGENGeneral.htm");
         dynFpgCod.setValue( GXutil.rtrim( A497FpgCod) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynFpgCod.getInternalname(), "Values", dynFpgCod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvVto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvVto_Internalname, httpContext.getMessage( "No.Vtos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvVto_Internalname, GXutil.ltrim( localUtil.ntoc( A805PrvVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvVto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A805PrvVto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvVto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvVto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvPer_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvPer_Internalname, httpContext.getMessage( "Peiodo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvPer_Internalname, GXutil.ltrim( localUtil.ntoc( A797PrvPer, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvPer_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A797PrvPer), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvPer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvPer_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvDiaPag_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvDiaPag_Internalname, httpContext.getMessage( "Dias de Pago", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDiaPag_Internalname, GXutil.ltrim( localUtil.ntoc( A785PrvDiaPag, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvDiaPag_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A785PrvDiaPag), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDiaPag_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvDiaPag_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynPrvDivCo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynPrvDivCo.getInternalname(), httpContext.getMessage( "Divisa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynPrvDivCo, dynPrvDivCo.getInternalname(), GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0)), 1, dynPrvDivCo.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, dynPrvDivCo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TPRVGENGeneral.htm");
         dynPrvDivCo.setValue( GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynPrvDivCo.getInternalname(), "Values", dynPrvDivCo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrvDivCod.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrvDivCod.getInternalname(), httpContext.getMessage( "Divisa Traspaso Contable", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvDivCod, cmbPrvDivCod.getInternalname(), GXutil.rtrim( A3092PrvDivCod), 1, cmbPrvDivCod.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvDivCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TPRVGENGeneral.htm");
         cmbPrvDivCod.setValue( GXutil.rtrim( A3092PrvDivCod) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrvDivCod.getInternalname(), "Values", cmbPrvDivCod.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvBan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvBan_Internalname, httpContext.getMessage( " Banco", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvBan_Internalname, GXutil.ltrim( localUtil.ntoc( A780PrvBan, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvBan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A780PrvBan), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A780PrvBan), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvBan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvBan_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvCta_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvCta_Internalname, httpContext.getMessage( "Cuenta Contable", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCta_Internalname, GXutil.rtrim( A783PrvCta), GXutil.rtrim( localUtil.format( A783PrvCta, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvCta_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvDtoPP_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvDtoPP_Internalname, httpContext.getMessage( "Dto. P. Pago", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDtoPP_Internalname, GXutil.ltrim( localUtil.ntoc( A8160PrvDtoPP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvDtoPP_Enabled!=0) ? localUtil.format( A8160PrvDtoPP, "ZZ9.99") : localUtil.format( A8160PrvDtoPP, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDtoPP_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvDtoPP_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_transactiondetail_p_datoscontabilidad.setProperty("Width", Dvpanel_transactiondetail_p_datoscontabilidad_Width);
         ucDvpanel_transactiondetail_p_datoscontabilidad.setProperty("AutoWidth", Dvpanel_transactiondetail_p_datoscontabilidad_Autowidth);
         ucDvpanel_transactiondetail_p_datoscontabilidad.setProperty("AutoHeight", Dvpanel_transactiondetail_p_datoscontabilidad_Autoheight);
         ucDvpanel_transactiondetail_p_datoscontabilidad.setProperty("Cls", Dvpanel_transactiondetail_p_datoscontabilidad_Cls);
         ucDvpanel_transactiondetail_p_datoscontabilidad.setProperty("Title", Dvpanel_transactiondetail_p_datoscontabilidad_Title);
         ucDvpanel_transactiondetail_p_datoscontabilidad.setProperty("Collapsible", Dvpanel_transactiondetail_p_datoscontabilidad_Collapsible);
         ucDvpanel_transactiondetail_p_datoscontabilidad.setProperty("Collapsed", Dvpanel_transactiondetail_p_datoscontabilidad_Collapsed);
         ucDvpanel_transactiondetail_p_datoscontabilidad.setProperty("ShowCollapseIcon", Dvpanel_transactiondetail_p_datoscontabilidad_Showcollapseicon);
         ucDvpanel_transactiondetail_p_datoscontabilidad.setProperty("IconPosition", Dvpanel_transactiondetail_p_datoscontabilidad_Iconposition);
         ucDvpanel_transactiondetail_p_datoscontabilidad.setProperty("AutoScroll", Dvpanel_transactiondetail_p_datoscontabilidad_Autoscroll);
         ucDvpanel_transactiondetail_p_datoscontabilidad.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_transactiondetail_p_datoscontabilidad_Internalname, sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDADContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDADContainer"+"TransactionDetail_P_DatosContabilidad"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_p_datoscontabilidad_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvRep_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvRep_Internalname, httpContext.getMessage( "Representante", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvRep_Internalname, GXutil.rtrim( A801PrvRep), GXutil.rtrim( localUtil.format( A801PrvRep, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvRep_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvRep_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvPlaEnt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvPlaEnt_Internalname, httpContext.getMessage( "Dias Plazo Entrega", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvPlaEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A798PrvPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvPlaEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A798PrvPlaEnt), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvPlaEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvPlaEnt_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvContac_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvContac_Internalname, httpContext.getMessage( "Contacto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtPrvContac_Internalname, A6572PrvContac, "", "", (short)(0), 1, edtPrvContac_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrvMetTra.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbPrvMetTra.getInternalname(), httpContext.getMessage( "Metodo Transporte", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrvMetTra, cmbPrvMetTra.getInternalname(), GXutil.rtrim( A792PrvMetTra), 1, cmbPrvMetTra.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrvMetTra.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TPRVGENGeneral.htm");
         cmbPrvMetTra.setValue( GXutil.rtrim( A792PrvMetTra) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrvMetTra.getInternalname(), "Values", cmbPrvMetTra.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvCar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtPrvCar_Internalname, httpContext.getMessage( "Tipo Carta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCar_Internalname, GXutil.rtrim( A3314PrvCar), GXutil.rtrim( localUtil.format( A3314PrvCar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvCar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynCod_Clas.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, dynCod_Clas.getInternalname(), httpContext.getMessage( "Clasificación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, dynCod_Clas, dynCod_Clas.getInternalname(), GXutil.trim( GXutil.str( A9728Cod_Clas, 4, 0)), 1, dynCod_Clas.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, dynCod_Clas.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TPRVGENGeneral.htm");
         dynCod_Clas.setValue( GXutil.trim( GXutil.str( A9728Cod_Clas, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynCod_Clas.getInternalname(), "Values", dynCod_Clas.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDes_Clas_Internalname, GXutil.rtrim( A9729Des_Clas), GXutil.rtrim( localUtil.format( A9729Des_Clas, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDes_Clas_Jsonclick, 0, "Attribute", "", "", "", "", edtDes_Clas_Visible, 0, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFpgDsc_Internalname, GXutil.rtrim( A498FpgDsc), GXutil.rtrim( localUtil.format( A498FpgDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFpgDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtFpgDsc_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDivAbr_Internalname, GXutil.rtrim( A3144PrvDivAbr), GXutil.rtrim( localUtil.format( A3144PrvDivAbr, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDivAbr_Jsonclick, 0, "Attribute", "", "", "", "", edtPrvDivAbr_Visible, 0, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtGpoEcoNom_Internalname, A10123GpoEcoNom, GXutil.rtrim( localUtil.format( A10123GpoEcoNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGpoEcoNom_Jsonclick, 0, "Attribute", "", "", "", "", edtGpoEcoNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, 0, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRVGENGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startGU2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "TPRVGENGeneral", ""), (short)(0)) ;
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
            strupGU0( ) ;
         }
      }
   }

   public void wsGU2( )
   {
      startGU2( ) ;
      evtGU2( ) ;
   }

   public void evtGU2( )
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
                              strupGU0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupGU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11GU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupGU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e12GU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupGU0( ) ;
                           }
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
                              strupGU0( ) ;
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weGU2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormGU2( ) ;
         }
      }
   }

   public void paGU2( )
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

   public void gxdlaprvdivcoGU1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaprvdivco_dataGU1( ) ;
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

   public void gxaprvdivco_htmlGU1( )
   {
      byte gxdynajaxvalue;
      gxdlaprvdivco_dataGU1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynPrvDivCo.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (byte)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynPrvDivCo.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 2, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynPrvDivCo.getItemCount() > 0 )
      {
         A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValidValue(GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
      }
   }

   protected void gxdlaprvdivco_dataGU1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00GU2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00GU2_A3099DivCod[0], (byte)(2), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00GU2_A3101DivAbr[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxdlagpoecocodGU2( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlagpoecocod_dataGU2( A396EmprCod) ;
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

   public void gxagpoecocod_htmlGU2( String A396EmprCod )
   {
      int gxdynajaxvalue;
      gxdlagpoecocod_dataGU2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynGpoEcoCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (int)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynGpoEcoCod.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 6, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynGpoEcoCod.getItemCount() > 0 )
      {
         A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValidValue(GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0))))) ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
      }
   }

   protected void gxdlagpoecocod_dataGU2( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00GU3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00GU3_A10122GpoEcoCod[0], (byte)(6), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(H00GU3_A10123GpoEcoNom[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxdlafpgcodGU2( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlafpgcod_dataGU2( A396EmprCod) ;
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

   public void gxafpgcod_htmlGU2( String A396EmprCod )
   {
      String gxdynajaxvalue;
      gxdlafpgcod_dataGU2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynFpgCod.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynFpgCod.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynFpgCod.getItemCount() > 0 )
      {
         A497FpgCod = dynFpgCod.getValidValue(A497FpgCod) ;
         n497FpgCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A497FpgCod", A497FpgCod);
      }
   }

   protected void gxdlafpgcod_dataGU2( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00GU4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00GU4_A497FpgCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00GU4_A498FpgDsc[0]));
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxdlacod_clasGU2( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlacod_clas_dataGU2( A396EmprCod) ;
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

   public void gxacod_clas_htmlGU2( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlacod_clas_dataGU2( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynCod_Clas.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynCod_Clas.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynCod_Clas.getItemCount() > 0 )
      {
         A9728Cod_Clas = (short)(GXutil.lval( dynCod_Clas.getValidValue(GXutil.trim( GXutil.str( A9728Cod_Clas, 4, 0))))) ;
         n9728Cod_Clas = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
      }
   }

   protected void gxdlacod_clas_dataGU2( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H00GU5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H00GU5_A9728Cod_Clas[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00GU5_A9729Des_Clas[0]));
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         gxagpoecocod_htmlGU2( A396EmprCod) ;
         gxafpgcod_htmlGU2( A396EmprCod) ;
         gxacod_clas_htmlGU2( A396EmprCod) ;
         dynPrvDivCo.setName( "PRVDIVCO" );
         dynPrvDivCo.setWebtags( "" );
         dynPrvDivCo.removeAllItems();
         /* Using cursor H00GU6 */
         pr_default.execute(4);
         while ( (pr_default.getStatus(4) != 101) )
         {
            dynPrvDivCo.addItem(GXutil.trim( GXutil.str( H00GU6_A3099DivCod[0], 2, 0)), H00GU6_A3101DivAbr[0], (short)(0));
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( dynPrvDivCo.getItemCount() > 0 )
         {
            A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValidValue(GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0))))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
         }
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      A800PrvPri = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A800PrvPri, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      n800PrvPri = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
      if ( cmbPrvTipo.getItemCount() > 0 )
      {
         A13585PrvTipo = cmbPrvTipo.getValidValue(A13585PrvTipo) ;
         n13585PrvTipo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13585PrvTipo", A13585PrvTipo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvTipo.setValue( GXutil.rtrim( A13585PrvTipo) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrvTipo.getInternalname(), "Values", cmbPrvTipo.ToJavascriptSource(), true);
      }
      if ( cmbPrvTip.getItemCount() > 0 )
      {
         A802PrvTip = cmbPrvTip.getValidValue(A802PrvTip) ;
         n802PrvTip = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A802PrvTip", A802PrvTip);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvTip.setValue( GXutil.rtrim( A802PrvTip) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrvTip.getInternalname(), "Values", cmbPrvTip.ToJavascriptSource(), true);
      }
      if ( dynGpoEcoCod.getItemCount() > 0 )
      {
         A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValidValue(GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0))))) ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynGpoEcoCod.setValue( GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynGpoEcoCod.getInternalname(), "Values", dynGpoEcoCod.ToJavascriptSource(), true);
      }
      if ( dynFpgCod.getItemCount() > 0 )
      {
         A497FpgCod = dynFpgCod.getValidValue(A497FpgCod) ;
         n497FpgCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A497FpgCod", A497FpgCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynFpgCod.setValue( GXutil.rtrim( A497FpgCod) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynFpgCod.getInternalname(), "Values", dynFpgCod.ToJavascriptSource(), true);
      }
      if ( dynPrvDivCo.getItemCount() > 0 )
      {
         A3143PrvDivCo = (byte)(GXutil.lval( dynPrvDivCo.getValidValue(GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynPrvDivCo.setValue( GXutil.trim( GXutil.str( A3143PrvDivCo, 2, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynPrvDivCo.getInternalname(), "Values", dynPrvDivCo.ToJavascriptSource(), true);
      }
      if ( cmbPrvDivCod.getItemCount() > 0 )
      {
         A3092PrvDivCod = cmbPrvDivCod.getValidValue(A3092PrvDivCod) ;
         n3092PrvDivCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3092PrvDivCod", A3092PrvDivCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvDivCod.setValue( GXutil.rtrim( A3092PrvDivCod) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrvDivCod.getInternalname(), "Values", cmbPrvDivCod.ToJavascriptSource(), true);
      }
      if ( cmbPrvMetTra.getItemCount() > 0 )
      {
         A792PrvMetTra = cmbPrvMetTra.getValidValue(A792PrvMetTra) ;
         n792PrvMetTra = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A792PrvMetTra", A792PrvMetTra);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrvMetTra.setValue( GXutil.rtrim( A792PrvMetTra) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbPrvMetTra.getInternalname(), "Values", cmbPrvMetTra.ToJavascriptSource(), true);
      }
      if ( dynCod_Clas.getItemCount() > 0 )
      {
         A9728Cod_Clas = (short)(GXutil.lval( dynCod_Clas.getValidValue(GXutil.trim( GXutil.str( A9728Cod_Clas, 4, 0))))) ;
         n9728Cod_Clas = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynCod_Clas.setValue( GXutil.trim( GXutil.str( A9728Cod_Clas, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynCod_Clas.getInternalname(), "Values", dynCod_Clas.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfGU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "TPRVGENGeneral" ;
      Gx_err = (short)(0) ;
   }

   public void rfGU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00GU7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A6572PrvContac = H00GU7_A6572PrvContac[0] ;
            n6572PrvContac = H00GU7_n6572PrvContac[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6572PrvContac", A6572PrvContac);
            A10123GpoEcoNom = H00GU7_A10123GpoEcoNom[0] ;
            n10123GpoEcoNom = H00GU7_n10123GpoEcoNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10123GpoEcoNom", A10123GpoEcoNom);
            A3144PrvDivAbr = H00GU7_A3144PrvDivAbr[0] ;
            n3144PrvDivAbr = H00GU7_n3144PrvDivAbr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3144PrvDivAbr", A3144PrvDivAbr);
            A498FpgDsc = H00GU7_A498FpgDsc[0] ;
            n498FpgDsc = H00GU7_n498FpgDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A498FpgDsc", A498FpgDsc);
            A9729Des_Clas = H00GU7_A9729Des_Clas[0] ;
            n9729Des_Clas = H00GU7_n9729Des_Clas[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9729Des_Clas", A9729Des_Clas);
            A9728Cod_Clas = H00GU7_A9728Cod_Clas[0] ;
            n9728Cod_Clas = H00GU7_n9728Cod_Clas[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
            A3314PrvCar = H00GU7_A3314PrvCar[0] ;
            n3314PrvCar = H00GU7_n3314PrvCar[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3314PrvCar", A3314PrvCar);
            A792PrvMetTra = H00GU7_A792PrvMetTra[0] ;
            n792PrvMetTra = H00GU7_n792PrvMetTra[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A792PrvMetTra", A792PrvMetTra);
            A798PrvPlaEnt = H00GU7_A798PrvPlaEnt[0] ;
            n798PrvPlaEnt = H00GU7_n798PrvPlaEnt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
            A801PrvRep = H00GU7_A801PrvRep[0] ;
            n801PrvRep = H00GU7_n801PrvRep[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A801PrvRep", A801PrvRep);
            A8160PrvDtoPP = H00GU7_A8160PrvDtoPP[0] ;
            n8160PrvDtoPP = H00GU7_n8160PrvDtoPP[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
            A783PrvCta = H00GU7_A783PrvCta[0] ;
            n783PrvCta = H00GU7_n783PrvCta[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A783PrvCta", A783PrvCta);
            A780PrvBan = H00GU7_A780PrvBan[0] ;
            n780PrvBan = H00GU7_n780PrvBan[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
            A3092PrvDivCod = H00GU7_A3092PrvDivCod[0] ;
            n3092PrvDivCod = H00GU7_n3092PrvDivCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3092PrvDivCod", A3092PrvDivCod);
            A3143PrvDivCo = H00GU7_A3143PrvDivCo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
            A785PrvDiaPag = H00GU7_A785PrvDiaPag[0] ;
            n785PrvDiaPag = H00GU7_n785PrvDiaPag[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
            A797PrvPer = H00GU7_A797PrvPer[0] ;
            n797PrvPer = H00GU7_n797PrvPer[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
            A805PrvVto = H00GU7_A805PrvVto[0] ;
            n805PrvVto = H00GU7_n805PrvVto[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
            A497FpgCod = H00GU7_A497FpgCod[0] ;
            n497FpgCod = H00GU7_n497FpgCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A497FpgCod", A497FpgCod);
            A6075PrvCp2 = H00GU7_A6075PrvCp2[0] ;
            n6075PrvCp2 = H00GU7_n6075PrvCp2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6075PrvCp2", A6075PrvCp2);
            A782PrvCpo = H00GU7_A782PrvCpo[0] ;
            n782PrvCpo = H00GU7_n782PrvCpo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A782PrvCpo", A782PrvCpo);
            A6077PrvMail = H00GU7_A6077PrvMail[0] ;
            n6077PrvMail = H00GU7_n6077PrvMail[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6077PrvMail", A6077PrvMail);
            A6076PrvFax = H00GU7_A6076PrvFax[0] ;
            n6076PrvFax = H00GU7_n6076PrvFax[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6076PrvFax", A6076PrvFax);
            A803PrvTlf = H00GU7_A803PrvTlf[0] ;
            n803PrvTlf = H00GU7_n803PrvTlf[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A803PrvTlf", A803PrvTlf);
            A804PrvTlx = H00GU7_A804PrvTlx[0] ;
            n804PrvTlx = H00GU7_n804PrvTlx[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A804PrvTlx", A804PrvTlx);
            A10122GpoEcoCod = H00GU7_A10122GpoEcoCod[0] ;
            n10122GpoEcoCod = H00GU7_n10122GpoEcoCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
            A799PrvPob = H00GU7_A799PrvPob[0] ;
            n799PrvPob = H00GU7_n799PrvPob[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A799PrvPob", A799PrvPob);
            A6571PrvDir2 = H00GU7_A6571PrvDir2[0] ;
            n6571PrvDir2 = H00GU7_n6571PrvDir2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6571PrvDir2", A6571PrvDir2);
            A786PrvDir = H00GU7_A786PrvDir[0] ;
            n786PrvDir = H00GU7_n786PrvDir[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A786PrvDir", A786PrvDir);
            A802PrvTip = H00GU7_A802PrvTip[0] ;
            n802PrvTip = H00GU7_n802PrvTip[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A802PrvTip", A802PrvTip);
            A13585PrvTipo = H00GU7_A13585PrvTipo[0] ;
            n13585PrvTipo = H00GU7_n13585PrvTipo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13585PrvTipo", A13585PrvTipo);
            A793PrvNif = H00GU7_A793PrvNif[0] ;
            n793PrvNif = H00GU7_n793PrvNif[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A793PrvNif", A793PrvNif);
            A6570PrvNom2 = H00GU7_A6570PrvNom2[0] ;
            n6570PrvNom2 = H00GU7_n6570PrvNom2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6570PrvNom2", A6570PrvNom2);
            A794PrvNom = H00GU7_A794PrvNom[0] ;
            n794PrvNom = H00GU7_n794PrvNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A794PrvNom", A794PrvNom);
            A800PrvPri = H00GU7_A800PrvPri[0] ;
            n800PrvPri = H00GU7_n800PrvPri[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
            A3144PrvDivAbr = H00GU7_A3144PrvDivAbr[0] ;
            n3144PrvDivAbr = H00GU7_n3144PrvDivAbr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3144PrvDivAbr", A3144PrvDivAbr);
            A498FpgDsc = H00GU7_A498FpgDsc[0] ;
            n498FpgDsc = H00GU7_n498FpgDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A498FpgDsc", A498FpgDsc);
            A9729Des_Clas = H00GU7_A9729Des_Clas[0] ;
            n9729Des_Clas = H00GU7_n9729Des_Clas[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9729Des_Clas", A9729Des_Clas);
            A10123GpoEcoNom = H00GU7_A10123GpoEcoNom[0] ;
            n10123GpoEcoNom = H00GU7_n10123GpoEcoNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10123GpoEcoNom", A10123GpoEcoNom);
            gxagpoecocod_htmlGU2( A396EmprCod) ;
            gxafpgcod_htmlGU2( A396EmprCod) ;
            gxacod_clas_htmlGU2( A396EmprCod) ;
            /* Execute user event: Load */
            e12GU2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         wbGU0( ) ;
      }
   }

   public void send_integrity_lvl_hashesGU2( )
   {
   }

   public void before_start_formulas( )
   {
      AV14Pgmname = "TPRVGENGeneral" ;
      Gx_err = (short)(0) ;
      /* Using cursor H00GU8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      A407EmprNom = H00GU8_A407EmprNom[0] ;
      n407EmprNom = H00GU8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      gxagpoecocod_htmlGU2( A396EmprCod) ;
      /* Using cursor H00GU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      A10123GpoEcoNom = H00GU9_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = H00GU9_n10123GpoEcoNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10123GpoEcoNom", A10123GpoEcoNom);
      pr_default.close(7);
      gxafpgcod_htmlGU2( A396EmprCod) ;
      /* Using cursor H00GU10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n497FpgCod), A497FpgCod});
      A498FpgDsc = H00GU10_A498FpgDsc[0] ;
      n498FpgDsc = H00GU10_n498FpgDsc[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A498FpgDsc", A498FpgDsc);
      pr_default.close(8);
      gxacod_clas_htmlGU2( A396EmprCod) ;
      /* Using cursor H00GU11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n9728Cod_Clas), Short.valueOf(A9728Cod_Clas)});
      A9729Des_Clas = H00GU11_A9729Des_Clas[0] ;
      n9729Des_Clas = H00GU11_n9729Des_Clas[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9729Des_Clas", A9729Des_Clas);
      pr_default.close(9);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      fix_multi_value_controls( ) ;
   }

   public void strupGU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11GU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvpanel_transactiondetail_tableattributes_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Width") ;
         Dvpanel_transactiondetail_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_transactiondetail_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_transactiondetail_tableattributes_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_transactiondetail_tableattributes_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Title") ;
         Dvpanel_transactiondetail_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_transactiondetail_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_transactiondetail_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_transactiondetail_tableattributes_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_transactiondetail_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES_Autoscroll")) ;
         Dvpanel_transactiondetail_p_datoslocalizacion_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Width") ;
         Dvpanel_transactiondetail_p_datoslocalizacion_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Autowidth")) ;
         Dvpanel_transactiondetail_p_datoslocalizacion_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Autoheight")) ;
         Dvpanel_transactiondetail_p_datoslocalizacion_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Cls") ;
         Dvpanel_transactiondetail_p_datoslocalizacion_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Title") ;
         Dvpanel_transactiondetail_p_datoslocalizacion_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Collapsible")) ;
         Dvpanel_transactiondetail_p_datoslocalizacion_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Collapsed")) ;
         Dvpanel_transactiondetail_p_datoslocalizacion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Showcollapseicon")) ;
         Dvpanel_transactiondetail_p_datoslocalizacion_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Iconposition") ;
         Dvpanel_transactiondetail_p_datoslocalizacion_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION_Autoscroll")) ;
         Dvpanel_transactiondetail_p_datospago_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Width") ;
         Dvpanel_transactiondetail_p_datospago_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Autowidth")) ;
         Dvpanel_transactiondetail_p_datospago_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Autoheight")) ;
         Dvpanel_transactiondetail_p_datospago_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Cls") ;
         Dvpanel_transactiondetail_p_datospago_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Title") ;
         Dvpanel_transactiondetail_p_datospago_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Collapsible")) ;
         Dvpanel_transactiondetail_p_datospago_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Collapsed")) ;
         Dvpanel_transactiondetail_p_datospago_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Showcollapseicon")) ;
         Dvpanel_transactiondetail_p_datospago_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Iconposition") ;
         Dvpanel_transactiondetail_p_datospago_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO_Autoscroll")) ;
         Dvpanel_transactiondetail_p_datoscontabilidad_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Width") ;
         Dvpanel_transactiondetail_p_datoscontabilidad_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Autowidth")) ;
         Dvpanel_transactiondetail_p_datoscontabilidad_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Autoheight")) ;
         Dvpanel_transactiondetail_p_datoscontabilidad_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Cls") ;
         Dvpanel_transactiondetail_p_datoscontabilidad_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Title") ;
         Dvpanel_transactiondetail_p_datoscontabilidad_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Collapsible")) ;
         Dvpanel_transactiondetail_p_datoscontabilidad_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Collapsed")) ;
         Dvpanel_transactiondetail_p_datoscontabilidad_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Showcollapseicon")) ;
         Dvpanel_transactiondetail_p_datoscontabilidad_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Iconposition") ;
         Dvpanel_transactiondetail_p_datoscontabilidad_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD_Autoscroll")) ;
         /* Read variables values. */
         A800PrvPri = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPrvPri.getInternalname()), "1")==0) ? 1 : 0)) ;
         n800PrvPri = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A800PrvPri", GXutil.str( A800PrvPri, 1, 0));
         A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
         n794PrvNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A794PrvNom", A794PrvNom);
         A6570PrvNom2 = httpContext.cgiGet( edtPrvNom2_Internalname) ;
         n6570PrvNom2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6570PrvNom2", A6570PrvNom2);
         A793PrvNif = httpContext.cgiGet( edtPrvNif_Internalname) ;
         n793PrvNif = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A793PrvNif", A793PrvNif);
         cmbPrvTipo.setValue( httpContext.cgiGet( cmbPrvTipo.getInternalname()) );
         A13585PrvTipo = httpContext.cgiGet( cmbPrvTipo.getInternalname()) ;
         n13585PrvTipo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13585PrvTipo", A13585PrvTipo);
         cmbPrvTip.setValue( httpContext.cgiGet( cmbPrvTip.getInternalname()) );
         A802PrvTip = httpContext.cgiGet( cmbPrvTip.getInternalname()) ;
         n802PrvTip = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A802PrvTip", A802PrvTip);
         A786PrvDir = httpContext.cgiGet( edtPrvDir_Internalname) ;
         n786PrvDir = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A786PrvDir", A786PrvDir);
         A6571PrvDir2 = httpContext.cgiGet( edtPrvDir2_Internalname) ;
         n6571PrvDir2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6571PrvDir2", A6571PrvDir2);
         A799PrvPob = httpContext.cgiGet( edtPrvPob_Internalname) ;
         n799PrvPob = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A799PrvPob", A799PrvPob);
         dynGpoEcoCod.setValue( httpContext.cgiGet( dynGpoEcoCod.getInternalname()) );
         A10122GpoEcoCod = (int)(GXutil.lval( httpContext.cgiGet( dynGpoEcoCod.getInternalname()))) ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         A804PrvTlx = httpContext.cgiGet( edtPrvTlx_Internalname) ;
         n804PrvTlx = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A804PrvTlx", A804PrvTlx);
         A803PrvTlf = httpContext.cgiGet( edtPrvTlf_Internalname) ;
         n803PrvTlf = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A803PrvTlf", A803PrvTlf);
         A6076PrvFax = httpContext.cgiGet( edtPrvFax_Internalname) ;
         n6076PrvFax = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6076PrvFax", A6076PrvFax);
         A6077PrvMail = httpContext.cgiGet( edtPrvMail_Internalname) ;
         n6077PrvMail = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6077PrvMail", A6077PrvMail);
         A782PrvCpo = httpContext.cgiGet( edtPrvCpo_Internalname) ;
         n782PrvCpo = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A782PrvCpo", A782PrvCpo);
         A6075PrvCp2 = httpContext.cgiGet( edtPrvCp2_Internalname) ;
         n6075PrvCp2 = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6075PrvCp2", A6075PrvCp2);
         dynFpgCod.setValue( httpContext.cgiGet( dynFpgCod.getInternalname()) );
         A497FpgCod = httpContext.cgiGet( dynFpgCod.getInternalname()) ;
         n497FpgCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A497FpgCod", A497FpgCod);
         A805PrvVto = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrvVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n805PrvVto = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A805PrvVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A805PrvVto), 2, 0));
         A797PrvPer = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvPer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n797PrvPer = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A797PrvPer", GXutil.ltrimstr( DecimalUtil.doubleToDec(A797PrvPer), 6, 0));
         A785PrvDiaPag = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvDiaPag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n785PrvDiaPag = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A785PrvDiaPag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A785PrvDiaPag), 6, 0));
         dynPrvDivCo.setValue( httpContext.cgiGet( dynPrvDivCo.getInternalname()) );
         A3143PrvDivCo = (byte)(GXutil.lval( httpContext.cgiGet( dynPrvDivCo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
         cmbPrvDivCod.setValue( httpContext.cgiGet( cmbPrvDivCod.getInternalname()) );
         A3092PrvDivCod = httpContext.cgiGet( cmbPrvDivCod.getInternalname()) ;
         n3092PrvDivCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3092PrvDivCod", A3092PrvDivCod);
         A780PrvBan = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n780PrvBan = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A780PrvBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A780PrvBan), 6, 0));
         A783PrvCta = httpContext.cgiGet( edtPrvCta_Internalname) ;
         n783PrvCta = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A783PrvCta", A783PrvCta);
         A8160PrvDtoPP = localUtil.ctond( httpContext.cgiGet( edtPrvDtoPP_Internalname)) ;
         n8160PrvDtoPP = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8160PrvDtoPP", GXutil.ltrimstr( A8160PrvDtoPP, 6, 2));
         A801PrvRep = httpContext.cgiGet( edtPrvRep_Internalname) ;
         n801PrvRep = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A801PrvRep", A801PrvRep);
         A798PrvPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n798PrvPlaEnt = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A798PrvPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A798PrvPlaEnt), 3, 0));
         A6572PrvContac = httpContext.cgiGet( edtPrvContac_Internalname) ;
         n6572PrvContac = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6572PrvContac", A6572PrvContac);
         cmbPrvMetTra.setValue( httpContext.cgiGet( cmbPrvMetTra.getInternalname()) );
         A792PrvMetTra = httpContext.cgiGet( cmbPrvMetTra.getInternalname()) ;
         n792PrvMetTra = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A792PrvMetTra", A792PrvMetTra);
         A3314PrvCar = httpContext.cgiGet( edtPrvCar_Internalname) ;
         n3314PrvCar = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3314PrvCar", A3314PrvCar);
         dynCod_Clas.setValue( httpContext.cgiGet( dynCod_Clas.getInternalname()) );
         A9728Cod_Clas = (short)(GXutil.lval( httpContext.cgiGet( dynCod_Clas.getInternalname()))) ;
         n9728Cod_Clas = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9728Cod_Clas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9728Cod_Clas), 4, 0));
         A9729Des_Clas = httpContext.cgiGet( edtDes_Clas_Internalname) ;
         n9729Des_Clas = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9729Des_Clas", A9729Des_Clas);
         A498FpgDsc = httpContext.cgiGet( edtFpgDsc_Internalname) ;
         n498FpgDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A498FpgDsc", A498FpgDsc);
         A3144PrvDivAbr = httpContext.cgiGet( edtPrvDivAbr_Internalname) ;
         n3144PrvDivAbr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3144PrvDivAbr", A3144PrvDivAbr);
         A10123GpoEcoNom = httpContext.cgiGet( edtGpoEcoNom_Internalname) ;
         n10123GpoEcoNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10123GpoEcoNom", A10123GpoEcoNom);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A407EmprNom", A407EmprNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         gxagpoecocod_htmlGU2( A396EmprCod) ;
         gxafpgcod_htmlGU2( A396EmprCod) ;
         gxacod_clas_htmlGU2( A396EmprCod) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e11GU2 ();
      if (returnInSub) return;
   }

   public void e11GU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_SdtWWPContext1[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV6WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e12GU2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtDes_Clas_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDes_Clas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDes_Clas_Visible), 5, 0), true);
      edtFpgDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFpgDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgDsc_Visible), 5, 0), true);
      edtPrvDivAbr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvDivAbr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDivAbr_Visible), 5, 0), true);
      edtGpoEcoNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGpoEcoNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGpoEcoNom_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      if ( ! ( ( AV13Rontaltex.doubleValue() == 1 ) ) )
      {
         dynGpoEcoCod.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynGpoEcoCod.getInternalname(), "Visible", GXutil.ltrimstr( dynGpoEcoCod.getVisible(), 5, 0), true);
         divGpoecocod_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divGpoecocod_cell_Internalname, "Class", divGpoecocod_cell_Class, true);
      }
      else
      {
         dynGpoEcoCod.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, dynGpoEcoCod.getInternalname(), "Visible", GXutil.ltrimstr( dynGpoEcoCod.getVisible(), 5, 0), true);
         divGpoecocod_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divGpoecocod_cell_Internalname, "Class", divGpoecocod_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV14Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPRVGEN" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A795PrvNum = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
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
      paGU2( ) ;
      wsGU2( ) ;
      weGU2( ) ;
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
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA795PrvNum = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paGU2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "tprvgengeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paGU2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A795PrvNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A795PrvNum != wcpOA795PrvNum ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA795PrvNum = A795PrvNum ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlA795PrvNum = httpContext.cgiGet( sPrefix+"A795PrvNum_CTRL") ;
      if ( GXutil.len( sCtrlA795PrvNum) > 0 )
      {
         A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA795PrvNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      }
      else
      {
         A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A795PrvNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paGU2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsGU2( ) ;
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
      wsGU2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A795PrvNum_PARM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA795PrvNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A795PrvNum_CTRL", GXutil.rtrim( sCtrlA795PrvNum));
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
      weGU2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115565465", true, true);
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
         httpContext.AddJavascriptSource("tprvgengeneral.js", "?202682115565465", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtPrvNum_Internalname = sPrefix+"PRVNUM" ;
      chkPrvPri.setInternalname( sPrefix+"PRVPRI" );
      edtPrvNom_Internalname = sPrefix+"PRVNOM" ;
      edtPrvNom2_Internalname = sPrefix+"PRVNOM2" ;
      edtPrvNif_Internalname = sPrefix+"PRVNIF" ;
      cmbPrvTipo.setInternalname( sPrefix+"PRVTIPO" );
      cmbPrvTip.setInternalname( sPrefix+"PRVTIP" );
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      Dvpanel_transactiondetail_tableattributes_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      edtPrvDir_Internalname = sPrefix+"PRVDIR" ;
      edtPrvDir2_Internalname = sPrefix+"PRVDIR2" ;
      edtPrvPob_Internalname = sPrefix+"PRVPOB" ;
      dynGpoEcoCod.setInternalname( sPrefix+"GPOECOCOD" );
      divGpoecocod_cell_Internalname = sPrefix+"GPOECOCOD_CELL" ;
      edtPrvTlx_Internalname = sPrefix+"PRVTLX" ;
      edtPrvTlf_Internalname = sPrefix+"PRVTLF" ;
      edtPrvFax_Internalname = sPrefix+"PRVFAX" ;
      edtPrvMail_Internalname = sPrefix+"PRVMAIL" ;
      edtPrvCpo_Internalname = sPrefix+"PRVCPO" ;
      edtPrvCp2_Internalname = sPrefix+"PRVCP2" ;
      divTransactiondetail_p_datoslocalizacion_Internalname = sPrefix+"TRANSACTIONDETAIL_P_DATOSLOCALIZACION" ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSLOCALIZACION" ;
      dynFpgCod.setInternalname( sPrefix+"FPGCOD" );
      edtPrvVto_Internalname = sPrefix+"PRVVTO" ;
      edtPrvPer_Internalname = sPrefix+"PRVPER" ;
      edtPrvDiaPag_Internalname = sPrefix+"PRVDIAPAG" ;
      dynPrvDivCo.setInternalname( sPrefix+"PRVDIVCO" );
      cmbPrvDivCod.setInternalname( sPrefix+"PRVDIVCOD" );
      edtPrvBan_Internalname = sPrefix+"PRVBAN" ;
      edtPrvCta_Internalname = sPrefix+"PRVCTA" ;
      edtPrvDtoPP_Internalname = sPrefix+"PRVDTOPP" ;
      divTransactiondetail_p_datospago_Internalname = sPrefix+"TRANSACTIONDETAIL_P_DATOSPAGO" ;
      Dvpanel_transactiondetail_p_datospago_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSPAGO" ;
      edtPrvRep_Internalname = sPrefix+"PRVREP" ;
      edtPrvPlaEnt_Internalname = sPrefix+"PRVPLAENT" ;
      edtPrvContac_Internalname = sPrefix+"PRVCONTAC" ;
      cmbPrvMetTra.setInternalname( sPrefix+"PRVMETTRA" );
      edtPrvCar_Internalname = sPrefix+"PRVCAR" ;
      dynCod_Clas.setInternalname( sPrefix+"COD_CLAS" );
      divTransactiondetail_p_datoscontabilidad_Internalname = sPrefix+"TRANSACTIONDETAIL_P_DATOSCONTABILIDAD" ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Internalname = sPrefix+"DVPANEL_TRANSACTIONDETAIL_P_DATOSCONTABILIDAD" ;
      divTransactiondetail_tablecontent_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLECONTENT" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtDes_Clas_Internalname = sPrefix+"DES_CLAS" ;
      edtFpgDsc_Internalname = sPrefix+"FPGDSC" ;
      edtPrvDivAbr_Internalname = sPrefix+"PRVDIVABR" ;
      edtGpoEcoNom_Internalname = sPrefix+"GPOECONOM" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
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
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtGpoEcoNom_Jsonclick = "" ;
      edtGpoEcoNom_Visible = 1 ;
      edtPrvDivAbr_Jsonclick = "" ;
      edtPrvDivAbr_Visible = 1 ;
      edtFpgDsc_Jsonclick = "" ;
      edtFpgDsc_Visible = 1 ;
      edtDes_Clas_Jsonclick = "" ;
      edtDes_Clas_Visible = 1 ;
      dynCod_Clas.setJsonclick( "" );
      dynCod_Clas.setEnabled( 0 );
      edtPrvCar_Jsonclick = "" ;
      edtPrvCar_Enabled = 0 ;
      cmbPrvMetTra.setJsonclick( "" );
      cmbPrvMetTra.setEnabled( 0 );
      edtPrvContac_Enabled = 0 ;
      edtPrvPlaEnt_Jsonclick = "" ;
      edtPrvPlaEnt_Enabled = 0 ;
      edtPrvRep_Jsonclick = "" ;
      edtPrvRep_Enabled = 0 ;
      edtPrvDtoPP_Jsonclick = "" ;
      edtPrvDtoPP_Enabled = 0 ;
      edtPrvCta_Jsonclick = "" ;
      edtPrvCta_Enabled = 0 ;
      edtPrvBan_Jsonclick = "" ;
      edtPrvBan_Enabled = 0 ;
      cmbPrvDivCod.setJsonclick( "" );
      cmbPrvDivCod.setEnabled( 0 );
      dynPrvDivCo.setJsonclick( "" );
      dynPrvDivCo.setEnabled( 0 );
      edtPrvDiaPag_Jsonclick = "" ;
      edtPrvDiaPag_Enabled = 0 ;
      edtPrvPer_Jsonclick = "" ;
      edtPrvPer_Enabled = 0 ;
      edtPrvVto_Jsonclick = "" ;
      edtPrvVto_Enabled = 0 ;
      dynFpgCod.setJsonclick( "" );
      dynFpgCod.setEnabled( 0 );
      edtPrvCp2_Jsonclick = "" ;
      edtPrvCp2_Enabled = 0 ;
      edtPrvCpo_Jsonclick = "" ;
      edtPrvCpo_Enabled = 0 ;
      edtPrvMail_Jsonclick = "" ;
      edtPrvMail_Enabled = 0 ;
      edtPrvFax_Jsonclick = "" ;
      edtPrvFax_Enabled = 0 ;
      edtPrvTlf_Jsonclick = "" ;
      edtPrvTlf_Enabled = 0 ;
      edtPrvTlx_Jsonclick = "" ;
      edtPrvTlx_Enabled = 0 ;
      dynGpoEcoCod.setJsonclick( "" );
      dynGpoEcoCod.setEnabled( 0 );
      dynGpoEcoCod.setVisible( 1 );
      divGpoecocod_cell_Class = "col-xs-12 col-sm-6" ;
      edtPrvPob_Jsonclick = "" ;
      edtPrvPob_Enabled = 0 ;
      edtPrvDir2_Jsonclick = "" ;
      edtPrvDir2_Enabled = 0 ;
      edtPrvDir_Jsonclick = "" ;
      edtPrvDir_Enabled = 0 ;
      cmbPrvTip.setJsonclick( "" );
      cmbPrvTip.setEnabled( 0 );
      cmbPrvTipo.setJsonclick( "" );
      cmbPrvTipo.setEnabled( 0 );
      edtPrvNif_Jsonclick = "" ;
      edtPrvNif_Enabled = 0 ;
      edtPrvNom2_Jsonclick = "" ;
      edtPrvNom2_Enabled = 0 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Enabled = 0 ;
      chkPrvPri.setEnabled( 0 );
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 0 ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Iconposition = "Right" ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Title = httpContext.getMessage( "Contable", "") ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Cls = "CellMarginTop" ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_p_datoscontabilidad_Width = "100%" ;
      Dvpanel_transactiondetail_p_datospago_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_p_datospago_Iconposition = "Right" ;
      Dvpanel_transactiondetail_p_datospago_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_p_datospago_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_transactiondetail_p_datospago_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_p_datospago_Title = httpContext.getMessage( "Pago", "") ;
      Dvpanel_transactiondetail_p_datospago_Cls = "CellMarginTop" ;
      Dvpanel_transactiondetail_p_datospago_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_p_datospago_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_p_datospago_Width = "100%" ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Iconposition = "Right" ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Title = httpContext.getMessage( "Localizacion", "") ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Cls = "CellMarginTop" ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_p_datoslocalizacion_Width = "100%" ;
      Dvpanel_transactiondetail_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Iconposition = "Right" ;
      Dvpanel_transactiondetail_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_transactiondetail_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_transactiondetail_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_transactiondetail_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_transactiondetail_tableattributes_Width = "100%" ;
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
      chkPrvPri.setName( "PRVPRI" );
      chkPrvPri.setWebtags( "" );
      chkPrvPri.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkPrvPri.getInternalname(), "TitleCaption", chkPrvPri.getCaption(), true);
      chkPrvPri.setCheckedValue( "0" );
      cmbPrvTipo.setName( "PRVTIPO" );
      cmbPrvTipo.setWebtags( "" );
      cmbPrvTipo.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
      cmbPrvTipo.addItem("E", httpContext.getMessage( "Externo", ""), (short)(0));
      if ( cmbPrvTipo.getItemCount() > 0 )
      {
      }
      cmbPrvTip.setName( "PRVTIP" );
      cmbPrvTip.setWebtags( "" );
      cmbPrvTip.addItem("P", httpContext.getMessage( "P", ""), (short)(0));
      cmbPrvTip.addItem("A", httpContext.getMessage( "A", ""), (short)(0));
      if ( cmbPrvTip.getItemCount() > 0 )
      {
      }
      dynGpoEcoCod.setName( "GPOECOCOD" );
      dynGpoEcoCod.setWebtags( "" );
      dynFpgCod.setName( "FPGCOD" );
      dynFpgCod.setWebtags( "" );
      dynPrvDivCo.setName( "PRVDIVCO" );
      dynPrvDivCo.setWebtags( "" );
      dynPrvDivCo.removeAllItems();
      /* Using cursor H00GU12 */
      pr_default.execute(10);
      while ( (pr_default.getStatus(10) != 101) )
      {
         dynPrvDivCo.addItem(GXutil.trim( GXutil.str( H00GU12_A3099DivCod[0], 2, 0)), H00GU12_A3101DivAbr[0], (short)(0));
         pr_default.readNext(10);
      }
      pr_default.close(10);
      if ( dynPrvDivCo.getItemCount() > 0 )
      {
      }
      cmbPrvDivCod.setName( "PRVDIVCOD" );
      cmbPrvDivCod.setWebtags( "" );
      cmbPrvDivCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      cmbPrvDivCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      if ( cmbPrvDivCod.getItemCount() > 0 )
      {
      }
      cmbPrvMetTra.setName( "PRVMETTRA" );
      cmbPrvMetTra.setWebtags( "" );
      cmbPrvMetTra.addItem("S", httpContext.getMessage( "Su Transporte", ""), (short)(0));
      cmbPrvMetTra.addItem("N", httpContext.getMessage( "Nuestro", ""), (short)(0));
      cmbPrvMetTra.addItem("A", httpContext.getMessage( "Agencia", ""), (short)(0));
      if ( cmbPrvMetTra.getItemCount() > 0 )
      {
      }
      dynCod_Clas.setName( "COD_CLAS" );
      dynCod_Clas.setWebtags( "" );
      /* End function init_web_controls */
   }

   public void valid_Emprcod( )
   {
      n10122GpoEcoCod = false ;
      A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValue())) ;
      n10122GpoEcoCod = false ;
      n497FpgCod = false ;
      A497FpgCod = dynFpgCod.getValue() ;
      n497FpgCod = false ;
      n9728Cod_Clas = false ;
      A9728Cod_Clas = (short)(GXutil.lval( dynCod_Clas.getValue())) ;
      n9728Cod_Clas = false ;
      gxagpoecocod_htmlGU2( A396EmprCod) ;
      gxafpgcod_htmlGU2( A396EmprCod) ;
      gxacod_clas_htmlGU2( A396EmprCod) ;
      dynload_actions( ) ;
      if ( dynGpoEcoCod.getItemCount() > 0 )
      {
         A10122GpoEcoCod = (int)(GXutil.lval( dynGpoEcoCod.getValidValue(GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0))))) ;
         n10122GpoEcoCod = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynGpoEcoCod.setValue( GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0)) );
      }
      if ( dynFpgCod.getItemCount() > 0 )
      {
         A497FpgCod = dynFpgCod.getValidValue(A497FpgCod) ;
         n497FpgCod = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynFpgCod.setValue( GXutil.rtrim( A497FpgCod) );
      }
      if ( dynCod_Clas.getItemCount() > 0 )
      {
         A9728Cod_Clas = (short)(GXutil.lval( dynCod_Clas.getValidValue(GXutil.trim( GXutil.str( A9728Cod_Clas, 4, 0))))) ;
         n9728Cod_Clas = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynCod_Clas.setValue( GXutil.trim( GXutil.str( A9728Cod_Clas, 4, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), ".", "")));
      dynGpoEcoCod.setValue( GXutil.trim( GXutil.str( A10122GpoEcoCod, 6, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, dynGpoEcoCod.getInternalname(), "Values", dynGpoEcoCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A497FpgCod", GXutil.rtrim( A497FpgCod));
      dynFpgCod.setValue( GXutil.rtrim( A497FpgCod) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, dynFpgCod.getInternalname(), "Values", dynFpgCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9728Cod_Clas", GXutil.ltrim( localUtil.ntoc( A9728Cod_Clas, (byte)(4), (byte)(0), ".", "")));
      dynCod_Clas.setValue( GXutil.trim( GXutil.str( A9728Cod_Clas, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, dynCod_Clas.getInternalname(), "Values", dynCod_Clas.ToJavascriptSource(), true);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynFpgCod'},{av:'A497FpgCod',fld:'FPGCOD',pic:'@!'},{av:'dynCod_Clas'},{av:'A9728Cod_Clas',fld:'COD_CLAS',pic:'ZZZ9'},{av:'dynPrvDivCo'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A800PrvPri',fld:'PRVPRI',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_GPOECOCOD","{handler:'valid_Gpoecocod',iparms:[]");
      setEventMetadata("VALID_GPOECOCOD",",oparms:[]}");
      setEventMetadata("VALID_FPGCOD","{handler:'valid_Fpgcod',iparms:[]");
      setEventMetadata("VALID_FPGCOD",",oparms:[]}");
      setEventMetadata("VALID_PRVDIVCO","{handler:'valid_Prvdivco',iparms:[]");
      setEventMetadata("VALID_PRVDIVCO",",oparms:[]}");
      setEventMetadata("VALID_COD_CLAS","{handler:'valid_Cod_clas',iparms:[]");
      setEventMetadata("VALID_COD_CLAS",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynFpgCod'},{av:'A497FpgCod',fld:'FPGCOD',pic:'@!'},{av:'dynCod_Clas'},{av:'A9728Cod_Clas',fld:'COD_CLAS',pic:'ZZZ9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'dynGpoEcoCod'},{av:'A10122GpoEcoCod',fld:'GPOECOCOD',pic:'ZZZZZ9'},{av:'dynFpgCod'},{av:'A497FpgCod',fld:'FPGCOD',pic:'@!'},{av:'dynCod_Clas'},{av:'A9728Cod_Clas',fld:'COD_CLAS',pic:'ZZZ9'}]}");
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
      wcpOA396EmprCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_transactiondetail_tableattributes = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      A794PrvNom = "" ;
      A6570PrvNom2 = "" ;
      A793PrvNif = "" ;
      A13585PrvTipo = "" ;
      A802PrvTip = "" ;
      ucDvpanel_transactiondetail_p_datoslocalizacion = new com.genexus.webpanels.GXUserControl();
      A786PrvDir = "" ;
      A6571PrvDir2 = "" ;
      A799PrvPob = "" ;
      A804PrvTlx = "" ;
      A803PrvTlf = "" ;
      A6076PrvFax = "" ;
      A6077PrvMail = "" ;
      A782PrvCpo = "" ;
      A6075PrvCp2 = "" ;
      ucDvpanel_transactiondetail_p_datospago = new com.genexus.webpanels.GXUserControl();
      A497FpgCod = "" ;
      A3092PrvDivCod = "" ;
      A783PrvCta = "" ;
      A8160PrvDtoPP = DecimalUtil.ZERO ;
      ucDvpanel_transactiondetail_p_datoscontabilidad = new com.genexus.webpanels.GXUserControl();
      A801PrvRep = "" ;
      A6572PrvContac = "" ;
      A792PrvMetTra = "" ;
      A3314PrvCar = "" ;
      A9729Des_Clas = "" ;
      A498FpgDsc = "" ;
      A3144PrvDivAbr = "" ;
      A10123GpoEcoNom = "" ;
      A407EmprNom = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H00GU2_A3099DivCod = new byte[1] ;
      H00GU2_A3101DivAbr = new String[] {""} ;
      H00GU2_n3101DivAbr = new boolean[] {false} ;
      H00GU3_A396EmprCod = new String[] {""} ;
      H00GU3_A10122GpoEcoCod = new int[1] ;
      H00GU3_n10122GpoEcoCod = new boolean[] {false} ;
      H00GU3_A10123GpoEcoNom = new String[] {""} ;
      H00GU3_n10123GpoEcoNom = new boolean[] {false} ;
      H00GU4_A396EmprCod = new String[] {""} ;
      H00GU4_A497FpgCod = new String[] {""} ;
      H00GU4_n497FpgCod = new boolean[] {false} ;
      H00GU4_A498FpgDsc = new String[] {""} ;
      H00GU4_n498FpgDsc = new boolean[] {false} ;
      H00GU5_A396EmprCod = new String[] {""} ;
      H00GU5_A9728Cod_Clas = new short[1] ;
      H00GU5_n9728Cod_Clas = new boolean[] {false} ;
      H00GU5_A9729Des_Clas = new String[] {""} ;
      H00GU5_n9729Des_Clas = new boolean[] {false} ;
      H00GU6_A3099DivCod = new byte[1] ;
      H00GU6_A3101DivAbr = new String[] {""} ;
      H00GU6_n3101DivAbr = new boolean[] {false} ;
      AV14Pgmname = "" ;
      H00GU7_A6572PrvContac = new String[] {""} ;
      H00GU7_n6572PrvContac = new boolean[] {false} ;
      H00GU7_A396EmprCod = new String[] {""} ;
      H00GU7_A795PrvNum = new int[1] ;
      H00GU7_A407EmprNom = new String[] {""} ;
      H00GU7_n407EmprNom = new boolean[] {false} ;
      H00GU7_A10123GpoEcoNom = new String[] {""} ;
      H00GU7_n10123GpoEcoNom = new boolean[] {false} ;
      H00GU7_A3144PrvDivAbr = new String[] {""} ;
      H00GU7_n3144PrvDivAbr = new boolean[] {false} ;
      H00GU7_A498FpgDsc = new String[] {""} ;
      H00GU7_n498FpgDsc = new boolean[] {false} ;
      H00GU7_A9729Des_Clas = new String[] {""} ;
      H00GU7_n9729Des_Clas = new boolean[] {false} ;
      H00GU7_A9728Cod_Clas = new short[1] ;
      H00GU7_n9728Cod_Clas = new boolean[] {false} ;
      H00GU7_A3314PrvCar = new String[] {""} ;
      H00GU7_n3314PrvCar = new boolean[] {false} ;
      H00GU7_A792PrvMetTra = new String[] {""} ;
      H00GU7_n792PrvMetTra = new boolean[] {false} ;
      H00GU7_A798PrvPlaEnt = new short[1] ;
      H00GU7_n798PrvPlaEnt = new boolean[] {false} ;
      H00GU7_A801PrvRep = new String[] {""} ;
      H00GU7_n801PrvRep = new boolean[] {false} ;
      H00GU7_A8160PrvDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00GU7_n8160PrvDtoPP = new boolean[] {false} ;
      H00GU7_A783PrvCta = new String[] {""} ;
      H00GU7_n783PrvCta = new boolean[] {false} ;
      H00GU7_A780PrvBan = new int[1] ;
      H00GU7_n780PrvBan = new boolean[] {false} ;
      H00GU7_A3092PrvDivCod = new String[] {""} ;
      H00GU7_n3092PrvDivCod = new boolean[] {false} ;
      H00GU7_A3143PrvDivCo = new byte[1] ;
      H00GU7_A785PrvDiaPag = new int[1] ;
      H00GU7_n785PrvDiaPag = new boolean[] {false} ;
      H00GU7_A797PrvPer = new int[1] ;
      H00GU7_n797PrvPer = new boolean[] {false} ;
      H00GU7_A805PrvVto = new byte[1] ;
      H00GU7_n805PrvVto = new boolean[] {false} ;
      H00GU7_A497FpgCod = new String[] {""} ;
      H00GU7_n497FpgCod = new boolean[] {false} ;
      H00GU7_A6075PrvCp2 = new String[] {""} ;
      H00GU7_n6075PrvCp2 = new boolean[] {false} ;
      H00GU7_A782PrvCpo = new String[] {""} ;
      H00GU7_n782PrvCpo = new boolean[] {false} ;
      H00GU7_A6077PrvMail = new String[] {""} ;
      H00GU7_n6077PrvMail = new boolean[] {false} ;
      H00GU7_A6076PrvFax = new String[] {""} ;
      H00GU7_n6076PrvFax = new boolean[] {false} ;
      H00GU7_A803PrvTlf = new String[] {""} ;
      H00GU7_n803PrvTlf = new boolean[] {false} ;
      H00GU7_A804PrvTlx = new String[] {""} ;
      H00GU7_n804PrvTlx = new boolean[] {false} ;
      H00GU7_A10122GpoEcoCod = new int[1] ;
      H00GU7_n10122GpoEcoCod = new boolean[] {false} ;
      H00GU7_A799PrvPob = new String[] {""} ;
      H00GU7_n799PrvPob = new boolean[] {false} ;
      H00GU7_A6571PrvDir2 = new String[] {""} ;
      H00GU7_n6571PrvDir2 = new boolean[] {false} ;
      H00GU7_A786PrvDir = new String[] {""} ;
      H00GU7_n786PrvDir = new boolean[] {false} ;
      H00GU7_A802PrvTip = new String[] {""} ;
      H00GU7_n802PrvTip = new boolean[] {false} ;
      H00GU7_A13585PrvTipo = new String[] {""} ;
      H00GU7_n13585PrvTipo = new boolean[] {false} ;
      H00GU7_A793PrvNif = new String[] {""} ;
      H00GU7_n793PrvNif = new boolean[] {false} ;
      H00GU7_A6570PrvNom2 = new String[] {""} ;
      H00GU7_n6570PrvNom2 = new boolean[] {false} ;
      H00GU7_A794PrvNom = new String[] {""} ;
      H00GU7_n794PrvNom = new boolean[] {false} ;
      H00GU7_A800PrvPri = new byte[1] ;
      H00GU7_n800PrvPri = new boolean[] {false} ;
      H00GU8_A407EmprNom = new String[] {""} ;
      H00GU8_n407EmprNom = new boolean[] {false} ;
      H00GU9_A10123GpoEcoNom = new String[] {""} ;
      H00GU9_n10123GpoEcoNom = new boolean[] {false} ;
      H00GU10_A498FpgDsc = new String[] {""} ;
      H00GU10_n498FpgDsc = new boolean[] {false} ;
      H00GU11_A9729Des_Clas = new String[] {""} ;
      H00GU11_n9729Des_Clas = new boolean[] {false} ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV13Rontaltex = DecimalUtil.ZERO ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA795PrvNum = "" ;
      H00GU12_A3099DivCod = new byte[1] ;
      H00GU12_A3101DivAbr = new String[] {""} ;
      H00GU12_n3101DivAbr = new boolean[] {false} ;
      Z497FpgCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprvgengeneral__default(),
         new Object[] {
             new Object[] {
            H00GU2_A3099DivCod, H00GU2_A3101DivAbr, H00GU2_n3101DivAbr
            }
            , new Object[] {
            H00GU3_A396EmprCod, H00GU3_A10122GpoEcoCod, H00GU3_A10123GpoEcoNom, H00GU3_n10123GpoEcoNom
            }
            , new Object[] {
            H00GU4_A396EmprCod, H00GU4_A497FpgCod, H00GU4_A498FpgDsc, H00GU4_n498FpgDsc
            }
            , new Object[] {
            H00GU5_A396EmprCod, H00GU5_A9728Cod_Clas, H00GU5_A9729Des_Clas, H00GU5_n9729Des_Clas
            }
            , new Object[] {
            H00GU6_A3099DivCod, H00GU6_A3101DivAbr, H00GU6_n3101DivAbr
            }
            , new Object[] {
            H00GU7_A6572PrvContac, H00GU7_n6572PrvContac, H00GU7_A396EmprCod, H00GU7_A795PrvNum, H00GU7_A407EmprNom, H00GU7_n407EmprNom, H00GU7_A10123GpoEcoNom, H00GU7_n10123GpoEcoNom, H00GU7_A3144PrvDivAbr, H00GU7_n3144PrvDivAbr,
            H00GU7_A498FpgDsc, H00GU7_n498FpgDsc, H00GU7_A9729Des_Clas, H00GU7_n9729Des_Clas, H00GU7_A9728Cod_Clas, H00GU7_n9728Cod_Clas, H00GU7_A3314PrvCar, H00GU7_n3314PrvCar, H00GU7_A792PrvMetTra, H00GU7_n792PrvMetTra,
            H00GU7_A798PrvPlaEnt, H00GU7_n798PrvPlaEnt, H00GU7_A801PrvRep, H00GU7_n801PrvRep, H00GU7_A8160PrvDtoPP, H00GU7_n8160PrvDtoPP, H00GU7_A783PrvCta, H00GU7_n783PrvCta, H00GU7_A780PrvBan, H00GU7_n780PrvBan,
            H00GU7_A3092PrvDivCod, H00GU7_n3092PrvDivCod, H00GU7_A3143PrvDivCo, H00GU7_A785PrvDiaPag, H00GU7_n785PrvDiaPag, H00GU7_A797PrvPer, H00GU7_n797PrvPer, H00GU7_A805PrvVto, H00GU7_n805PrvVto, H00GU7_A497FpgCod,
            H00GU7_n497FpgCod, H00GU7_A6075PrvCp2, H00GU7_n6075PrvCp2, H00GU7_A782PrvCpo, H00GU7_n782PrvCpo, H00GU7_A6077PrvMail, H00GU7_n6077PrvMail, H00GU7_A6076PrvFax, H00GU7_n6076PrvFax, H00GU7_A803PrvTlf,
            H00GU7_n803PrvTlf, H00GU7_A804PrvTlx, H00GU7_n804PrvTlx, H00GU7_A10122GpoEcoCod, H00GU7_n10122GpoEcoCod, H00GU7_A799PrvPob, H00GU7_n799PrvPob, H00GU7_A6571PrvDir2, H00GU7_n6571PrvDir2, H00GU7_A786PrvDir,
            H00GU7_n786PrvDir, H00GU7_A802PrvTip, H00GU7_n802PrvTip, H00GU7_A13585PrvTipo, H00GU7_n13585PrvTipo, H00GU7_A793PrvNif, H00GU7_n793PrvNif, H00GU7_A6570PrvNom2, H00GU7_n6570PrvNom2, H00GU7_A794PrvNom,
            H00GU7_n794PrvNom, H00GU7_A800PrvPri, H00GU7_n800PrvPri
            }
            , new Object[] {
            H00GU8_A407EmprNom, H00GU8_n407EmprNom
            }
            , new Object[] {
            H00GU9_A10123GpoEcoNom, H00GU9_n10123GpoEcoNom
            }
            , new Object[] {
            H00GU10_A498FpgDsc, H00GU10_n498FpgDsc
            }
            , new Object[] {
            H00GU11_A9729Des_Clas, H00GU11_n9729Des_Clas
            }
            , new Object[] {
            H00GU12_A3099DivCod, H00GU12_A3101DivAbr, H00GU12_n3101DivAbr
            }
         }
      );
      AV14Pgmname = "TPRVGENGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "TPRVGENGeneral" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte A800PrvPri ;
   private byte A805PrvVto ;
   private byte A3143PrvDivCo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wbEnd ;
   private short wbStart ;
   private short A798PrvPlaEnt ;
   private short A9728Cod_Clas ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short Z9728Cod_Clas ;
   private int wcpOA795PrvNum ;
   private int A795PrvNum ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtPrvNom2_Enabled ;
   private int edtPrvNif_Enabled ;
   private int edtPrvDir_Enabled ;
   private int edtPrvDir2_Enabled ;
   private int edtPrvPob_Enabled ;
   private int A10122GpoEcoCod ;
   private int edtPrvTlx_Enabled ;
   private int edtPrvTlf_Enabled ;
   private int edtPrvFax_Enabled ;
   private int edtPrvMail_Enabled ;
   private int edtPrvCpo_Enabled ;
   private int edtPrvCp2_Enabled ;
   private int edtPrvVto_Enabled ;
   private int A797PrvPer ;
   private int edtPrvPer_Enabled ;
   private int A785PrvDiaPag ;
   private int edtPrvDiaPag_Enabled ;
   private int A780PrvBan ;
   private int edtPrvBan_Enabled ;
   private int edtPrvCta_Enabled ;
   private int edtPrvDtoPP_Enabled ;
   private int edtPrvRep_Enabled ;
   private int edtPrvPlaEnt_Enabled ;
   private int edtPrvContac_Enabled ;
   private int edtPrvCar_Enabled ;
   private int edtDes_Clas_Visible ;
   private int edtFpgDsc_Visible ;
   private int edtPrvDivAbr_Visible ;
   private int edtGpoEcoNom_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprNom_Visible ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private int Z10122GpoEcoCod ;
   private java.math.BigDecimal A8160PrvDtoPP ;
   private java.math.BigDecimal AV13Rontaltex ;
   private String wcpOA396EmprCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_transactiondetail_tableattributes_Width ;
   private String Dvpanel_transactiondetail_tableattributes_Cls ;
   private String Dvpanel_transactiondetail_tableattributes_Title ;
   private String Dvpanel_transactiondetail_tableattributes_Iconposition ;
   private String Dvpanel_transactiondetail_p_datoslocalizacion_Width ;
   private String Dvpanel_transactiondetail_p_datoslocalizacion_Cls ;
   private String Dvpanel_transactiondetail_p_datoslocalizacion_Title ;
   private String Dvpanel_transactiondetail_p_datoslocalizacion_Iconposition ;
   private String Dvpanel_transactiondetail_p_datospago_Width ;
   private String Dvpanel_transactiondetail_p_datospago_Cls ;
   private String Dvpanel_transactiondetail_p_datospago_Title ;
   private String Dvpanel_transactiondetail_p_datospago_Iconposition ;
   private String Dvpanel_transactiondetail_p_datoscontabilidad_Width ;
   private String Dvpanel_transactiondetail_p_datoscontabilidad_Cls ;
   private String Dvpanel_transactiondetail_p_datoscontabilidad_Title ;
   private String Dvpanel_transactiondetail_p_datoscontabilidad_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tablecontent_Internalname ;
   private String Dvpanel_transactiondetail_tableattributes_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrvNom2_Internalname ;
   private String A6570PrvNom2 ;
   private String edtPrvNom2_Jsonclick ;
   private String edtPrvNif_Internalname ;
   private String A793PrvNif ;
   private String edtPrvNif_Jsonclick ;
   private String A13585PrvTipo ;
   private String A802PrvTip ;
   private String Dvpanel_transactiondetail_p_datoslocalizacion_Internalname ;
   private String divTransactiondetail_p_datoslocalizacion_Internalname ;
   private String edtPrvDir_Internalname ;
   private String A786PrvDir ;
   private String edtPrvDir_Jsonclick ;
   private String edtPrvDir2_Internalname ;
   private String A6571PrvDir2 ;
   private String edtPrvDir2_Jsonclick ;
   private String edtPrvPob_Internalname ;
   private String A799PrvPob ;
   private String edtPrvPob_Jsonclick ;
   private String divGpoecocod_cell_Internalname ;
   private String divGpoecocod_cell_Class ;
   private String edtPrvTlx_Internalname ;
   private String A804PrvTlx ;
   private String edtPrvTlx_Jsonclick ;
   private String edtPrvTlf_Internalname ;
   private String A803PrvTlf ;
   private String edtPrvTlf_Jsonclick ;
   private String edtPrvFax_Internalname ;
   private String A6076PrvFax ;
   private String edtPrvFax_Jsonclick ;
   private String edtPrvMail_Internalname ;
   private String A6077PrvMail ;
   private String edtPrvMail_Jsonclick ;
   private String edtPrvCpo_Internalname ;
   private String A782PrvCpo ;
   private String edtPrvCpo_Jsonclick ;
   private String edtPrvCp2_Internalname ;
   private String A6075PrvCp2 ;
   private String edtPrvCp2_Jsonclick ;
   private String Dvpanel_transactiondetail_p_datospago_Internalname ;
   private String divTransactiondetail_p_datospago_Internalname ;
   private String A497FpgCod ;
   private String edtPrvVto_Internalname ;
   private String edtPrvVto_Jsonclick ;
   private String edtPrvPer_Internalname ;
   private String edtPrvPer_Jsonclick ;
   private String edtPrvDiaPag_Internalname ;
   private String edtPrvDiaPag_Jsonclick ;
   private String A3092PrvDivCod ;
   private String edtPrvBan_Internalname ;
   private String edtPrvBan_Jsonclick ;
   private String edtPrvCta_Internalname ;
   private String A783PrvCta ;
   private String edtPrvCta_Jsonclick ;
   private String edtPrvDtoPP_Internalname ;
   private String edtPrvDtoPP_Jsonclick ;
   private String Dvpanel_transactiondetail_p_datoscontabilidad_Internalname ;
   private String divTransactiondetail_p_datoscontabilidad_Internalname ;
   private String edtPrvRep_Internalname ;
   private String A801PrvRep ;
   private String edtPrvRep_Jsonclick ;
   private String edtPrvPlaEnt_Internalname ;
   private String edtPrvPlaEnt_Jsonclick ;
   private String edtPrvContac_Internalname ;
   private String A792PrvMetTra ;
   private String edtPrvCar_Internalname ;
   private String A3314PrvCar ;
   private String edtPrvCar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtDes_Clas_Internalname ;
   private String A9729Des_Clas ;
   private String edtDes_Clas_Jsonclick ;
   private String edtFpgDsc_Internalname ;
   private String A498FpgDsc ;
   private String edtFpgDsc_Jsonclick ;
   private String edtPrvDivAbr_Internalname ;
   private String A3144PrvDivAbr ;
   private String edtPrvDivAbr_Jsonclick ;
   private String edtGpoEcoNom_Internalname ;
   private String edtGpoEcoNom_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV14Pgmname ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA795PrvNum ;
   private String Z497FpgCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autowidth ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoheight ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsible ;
   private boolean Dvpanel_transactiondetail_tableattributes_Collapsed ;
   private boolean Dvpanel_transactiondetail_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_tableattributes_Autoscroll ;
   private boolean Dvpanel_transactiondetail_p_datoslocalizacion_Autowidth ;
   private boolean Dvpanel_transactiondetail_p_datoslocalizacion_Autoheight ;
   private boolean Dvpanel_transactiondetail_p_datoslocalizacion_Collapsible ;
   private boolean Dvpanel_transactiondetail_p_datoslocalizacion_Collapsed ;
   private boolean Dvpanel_transactiondetail_p_datoslocalizacion_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_p_datoslocalizacion_Autoscroll ;
   private boolean Dvpanel_transactiondetail_p_datospago_Autowidth ;
   private boolean Dvpanel_transactiondetail_p_datospago_Autoheight ;
   private boolean Dvpanel_transactiondetail_p_datospago_Collapsible ;
   private boolean Dvpanel_transactiondetail_p_datospago_Collapsed ;
   private boolean Dvpanel_transactiondetail_p_datospago_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_p_datospago_Autoscroll ;
   private boolean Dvpanel_transactiondetail_p_datoscontabilidad_Autowidth ;
   private boolean Dvpanel_transactiondetail_p_datoscontabilidad_Autoheight ;
   private boolean Dvpanel_transactiondetail_p_datoscontabilidad_Collapsible ;
   private boolean Dvpanel_transactiondetail_p_datoscontabilidad_Collapsed ;
   private boolean Dvpanel_transactiondetail_p_datoscontabilidad_Showcollapseicon ;
   private boolean Dvpanel_transactiondetail_p_datoscontabilidad_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n10122GpoEcoCod ;
   private boolean n497FpgCod ;
   private boolean n9728Cod_Clas ;
   private boolean n800PrvPri ;
   private boolean n13585PrvTipo ;
   private boolean n802PrvTip ;
   private boolean n3092PrvDivCod ;
   private boolean n792PrvMetTra ;
   private boolean n6572PrvContac ;
   private boolean n10123GpoEcoNom ;
   private boolean n3144PrvDivAbr ;
   private boolean n498FpgDsc ;
   private boolean n9729Des_Clas ;
   private boolean n3314PrvCar ;
   private boolean n798PrvPlaEnt ;
   private boolean n801PrvRep ;
   private boolean n8160PrvDtoPP ;
   private boolean n783PrvCta ;
   private boolean n780PrvBan ;
   private boolean n785PrvDiaPag ;
   private boolean n797PrvPer ;
   private boolean n805PrvVto ;
   private boolean n6075PrvCp2 ;
   private boolean n782PrvCpo ;
   private boolean n6077PrvMail ;
   private boolean n6076PrvFax ;
   private boolean n803PrvTlf ;
   private boolean n804PrvTlx ;
   private boolean n799PrvPob ;
   private boolean n6571PrvDir2 ;
   private boolean n786PrvDir ;
   private boolean n793PrvNif ;
   private boolean n6570PrvNom2 ;
   private boolean n794PrvNom ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String A6572PrvContac ;
   private String A10123GpoEcoNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_p_datoslocalizacion ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_p_datospago ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_transactiondetail_p_datoscontabilidad ;
   private ICheckbox chkPrvPri ;
   private HTMLChoice cmbPrvTipo ;
   private HTMLChoice cmbPrvTip ;
   private HTMLChoice dynGpoEcoCod ;
   private HTMLChoice dynFpgCod ;
   private HTMLChoice dynPrvDivCo ;
   private HTMLChoice cmbPrvDivCod ;
   private HTMLChoice cmbPrvMetTra ;
   private HTMLChoice dynCod_Clas ;
   private IDataStoreProvider pr_default ;
   private byte[] H00GU2_A3099DivCod ;
   private String[] H00GU2_A3101DivAbr ;
   private boolean[] H00GU2_n3101DivAbr ;
   private String[] H00GU3_A396EmprCod ;
   private int[] H00GU3_A10122GpoEcoCod ;
   private boolean[] H00GU3_n10122GpoEcoCod ;
   private String[] H00GU3_A10123GpoEcoNom ;
   private boolean[] H00GU3_n10123GpoEcoNom ;
   private String[] H00GU4_A396EmprCod ;
   private String[] H00GU4_A497FpgCod ;
   private boolean[] H00GU4_n497FpgCod ;
   private String[] H00GU4_A498FpgDsc ;
   private boolean[] H00GU4_n498FpgDsc ;
   private String[] H00GU5_A396EmprCod ;
   private short[] H00GU5_A9728Cod_Clas ;
   private boolean[] H00GU5_n9728Cod_Clas ;
   private String[] H00GU5_A9729Des_Clas ;
   private boolean[] H00GU5_n9729Des_Clas ;
   private byte[] H00GU6_A3099DivCod ;
   private String[] H00GU6_A3101DivAbr ;
   private boolean[] H00GU6_n3101DivAbr ;
   private String[] H00GU7_A6572PrvContac ;
   private boolean[] H00GU7_n6572PrvContac ;
   private String[] H00GU7_A396EmprCod ;
   private int[] H00GU7_A795PrvNum ;
   private String[] H00GU7_A407EmprNom ;
   private boolean[] H00GU7_n407EmprNom ;
   private String[] H00GU7_A10123GpoEcoNom ;
   private boolean[] H00GU7_n10123GpoEcoNom ;
   private String[] H00GU7_A3144PrvDivAbr ;
   private boolean[] H00GU7_n3144PrvDivAbr ;
   private String[] H00GU7_A498FpgDsc ;
   private boolean[] H00GU7_n498FpgDsc ;
   private String[] H00GU7_A9729Des_Clas ;
   private boolean[] H00GU7_n9729Des_Clas ;
   private short[] H00GU7_A9728Cod_Clas ;
   private boolean[] H00GU7_n9728Cod_Clas ;
   private String[] H00GU7_A3314PrvCar ;
   private boolean[] H00GU7_n3314PrvCar ;
   private String[] H00GU7_A792PrvMetTra ;
   private boolean[] H00GU7_n792PrvMetTra ;
   private short[] H00GU7_A798PrvPlaEnt ;
   private boolean[] H00GU7_n798PrvPlaEnt ;
   private String[] H00GU7_A801PrvRep ;
   private boolean[] H00GU7_n801PrvRep ;
   private java.math.BigDecimal[] H00GU7_A8160PrvDtoPP ;
   private boolean[] H00GU7_n8160PrvDtoPP ;
   private String[] H00GU7_A783PrvCta ;
   private boolean[] H00GU7_n783PrvCta ;
   private int[] H00GU7_A780PrvBan ;
   private boolean[] H00GU7_n780PrvBan ;
   private String[] H00GU7_A3092PrvDivCod ;
   private boolean[] H00GU7_n3092PrvDivCod ;
   private byte[] H00GU7_A3143PrvDivCo ;
   private int[] H00GU7_A785PrvDiaPag ;
   private boolean[] H00GU7_n785PrvDiaPag ;
   private int[] H00GU7_A797PrvPer ;
   private boolean[] H00GU7_n797PrvPer ;
   private byte[] H00GU7_A805PrvVto ;
   private boolean[] H00GU7_n805PrvVto ;
   private String[] H00GU7_A497FpgCod ;
   private boolean[] H00GU7_n497FpgCod ;
   private String[] H00GU7_A6075PrvCp2 ;
   private boolean[] H00GU7_n6075PrvCp2 ;
   private String[] H00GU7_A782PrvCpo ;
   private boolean[] H00GU7_n782PrvCpo ;
   private String[] H00GU7_A6077PrvMail ;
   private boolean[] H00GU7_n6077PrvMail ;
   private String[] H00GU7_A6076PrvFax ;
   private boolean[] H00GU7_n6076PrvFax ;
   private String[] H00GU7_A803PrvTlf ;
   private boolean[] H00GU7_n803PrvTlf ;
   private String[] H00GU7_A804PrvTlx ;
   private boolean[] H00GU7_n804PrvTlx ;
   private int[] H00GU7_A10122GpoEcoCod ;
   private boolean[] H00GU7_n10122GpoEcoCod ;
   private String[] H00GU7_A799PrvPob ;
   private boolean[] H00GU7_n799PrvPob ;
   private String[] H00GU7_A6571PrvDir2 ;
   private boolean[] H00GU7_n6571PrvDir2 ;
   private String[] H00GU7_A786PrvDir ;
   private boolean[] H00GU7_n786PrvDir ;
   private String[] H00GU7_A802PrvTip ;
   private boolean[] H00GU7_n802PrvTip ;
   private String[] H00GU7_A13585PrvTipo ;
   private boolean[] H00GU7_n13585PrvTipo ;
   private String[] H00GU7_A793PrvNif ;
   private boolean[] H00GU7_n793PrvNif ;
   private String[] H00GU7_A6570PrvNom2 ;
   private boolean[] H00GU7_n6570PrvNom2 ;
   private String[] H00GU7_A794PrvNom ;
   private boolean[] H00GU7_n794PrvNom ;
   private byte[] H00GU7_A800PrvPri ;
   private boolean[] H00GU7_n800PrvPri ;
   private String[] H00GU8_A407EmprNom ;
   private boolean[] H00GU8_n407EmprNom ;
   private String[] H00GU9_A10123GpoEcoNom ;
   private boolean[] H00GU9_n10123GpoEcoNom ;
   private String[] H00GU10_A498FpgDsc ;
   private boolean[] H00GU10_n498FpgDsc ;
   private String[] H00GU11_A9729Des_Clas ;
   private boolean[] H00GU11_n9729Des_Clas ;
   private byte[] H00GU12_A3099DivCod ;
   private String[] H00GU12_A3101DivAbr ;
   private boolean[] H00GU12_n3101DivAbr ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class tprvgengeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00GU2", "SELECT DivCod, DivAbr FROM TXPDIVISA ORDER BY DivAbr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00GU3", "SELECT EmprCod, GpoEcoCod, GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? ORDER BY GpoEcoNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00GU4", "SELECT EmprCod, FpgCod, FpgDsc FROM TXPFORPAG WHERE EmprCod = ? ORDER BY FpgDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00GU5", "SELECT EmprCod, Cod_Clas, Des_Clas FROM TXPISOTB1 WHERE EmprCod = ? ORDER BY Des_Clas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00GU6", "SELECT DivCod, DivAbr FROM TXPDIVISA ORDER BY DivAbr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00GU7", "SELECT T1.PrvContac, T1.EmprCod, T1.PrvNum, T3.EmprNom, T6.GpoEcoNom, T2.DivAbr AS PrvDivAbr, T4.FpgDsc, T5.Des_Clas, T1.Cod_Clas, T1.PrvCar, T1.PrvMetTra, T1.PrvPlaEnt, T1.PrvRep, T1.PrvDtoPP, T1.PrvCta, T1.PrvBan, T1.PrvDivCod, T1.PrvDivCo AS PrvDivCo, T1.PrvDiaPag, T1.PrvPer, T1.PrvVto, T1.FpgCod, T1.PrvCp2, T1.PrvCpo, T1.PrvMail, T1.PrvFax, T1.PrvTlf, T1.PrvTlx, T1.GpoEcoCod, T1.PrvPob, T1.PrvDir2, T1.PrvDir, T1.PrvTip, T1.PrvTipo, T1.PrvNif, T1.PrvNom2, T1.PrvNom, T1.PrvPri FROM (((((TXPPRVGEN T1 INNER JOIN TXPDIVISA T2 ON T2.DivCod = T1.PrvDivCo) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = T1.EmprCod) LEFT JOIN TXPFORPAG T4 ON T4.EmprCod = T1.EmprCod AND T4.FpgCod = T1.FpgCod) LEFT JOIN TXPISOTB1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Cod_Clas = T1.Cod_Clas) LEFT JOIN TXPGPOECO T6 ON T6.EmprCod = T1.EmprCod AND T6.GpoEcoCod = T1.GpoEcoCod) WHERE T1.EmprCod = ? and T1.PrvNum = ? ORDER BY T1.EmprCod, T1.PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00GU8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00GU9", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00GU10", "SELECT FpgDsc FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00GU11", "SELECT Des_Clas FROM TXPISOTB1 WHERE EmprCod = ? AND Cod_Clas = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00GU12", "SELECT DivCod, DivAbr FROM TXPDIVISA ORDER BY DivAbr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 60);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 12);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(18);
               ((int[]) buf[33])[0] = rslt.getInt(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 6);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(25, 40);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 15);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(27, 18);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 14);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 40);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(32, 30);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(35, 20);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 40);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(37, 30);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((byte[]) buf[71])[0] = rslt.getByte(38);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
      }
   }

}

