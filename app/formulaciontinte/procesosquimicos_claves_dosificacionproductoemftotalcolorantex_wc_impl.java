package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl extends GXWebComponent
{
   public procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl.class ));
   }

   public procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl( int remoteHandle ,
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
      cmbavFuncion = new HTMLChoice();
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
               AV11EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
               AV14ProForCla = httpContext.GetPar( "ProForCla") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ProForCla", AV14ProForCla);
               AV13PrdMaxFind = httpContext.GetPar( "PrdMaxFind") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13PrdMaxFind", AV13PrdMaxFind);
               AV16ProForUli = (short)(GXutil.lval( httpContext.GetPar( "ProForUli"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16ProForUli), 4, 0));
               AV17Proforclv = httpContext.GetPar( "Proforclv") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Proforclv", AV17Proforclv);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV11EmprCod,AV14ProForCla,AV13PrdMaxFind,Short.valueOf(AV16ProForUli),AV17Proforclv});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vGRUCOL") == 0 )
            {
               A13745GrpCDsc = httpContext.GetPar( "GrpCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgvvgrucol1NP0( A13745GrpCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vGRUCOL") == 0 )
            {
               A13745GrpCDsc = httpContext.GetPar( "GrpCDsc") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxsgvvgrucol1NP0( A13745GrpCDsc) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vGRUCOL") == 0 )
            {
               hV6GruCol = httpContext.GetPar( "hV6GruCol") ;
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxhcvvgrucol1NP2( hV6GruCol) ;
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
         pa1NP2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Clave Dosificacion Producto em % f(Total colorante X) #", "")) ;
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
      if ( GXutil.len( sPrefix) == 0 )
      {
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV14ProForCla)),GXutil.URLEncode(GXutil.rtrim(AV13PrdMaxFind)),GXutil.URLEncode(GXutil.ltrimstr(AV16ProForUli,4,0)),GXutil.URLEncode(GXutil.rtrim(AV17Proforclv))}, new String[] {"EmprCod","ProForCla","PrdMaxFind","ProForUli","Proforclv"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ProcesosQuimicos_Claves_DosificacionProductoemfTotalcoloranteX_WC");
      forbiddenHiddens.add("Porc_p", localUtil.format( AV8Porc_p, "ZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11EmprCod", GXutil.rtrim( wcpOAV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13PrdMaxFind", GXutil.rtrim( wcpOAV13PrdMaxFind));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16ProForUli", GXutil.ltrim( localUtil.ntoc( wcpOAV16ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAG", GXutil.ltrim( localUtil.ntoc( AV12Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDMAXFIND", GXutil.rtrim( AV13PrdMaxFind));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORCLA", GXutil.rtrim( AV14ProForCla));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORULI", GXutil.ltrim( localUtil.ntoc( AV16ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORCLV", GXutil.rtrim( AV17Proforclv));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXHCvGRUCOL", GXutil.ltrim( localUtil.ntoc( AV6GruCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
   }

   public void renderHtmlCloseForm1NP2( )
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
         httpContext.writeTextNL( "</form>") ;
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
      return "FormulacionTinte.ProcesosQuimicos_Claves_DosificacionProductoemfTotalcoloranteX_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Clave Dosificacion Producto em % f(Total colorante X) #", "") ;
   }

   public void wb1NP0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         }
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntini_Internalname, httpContext.getMessage( "Cantidad Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntini_Internalname, GXutil.ltrim( localUtil.ntoc( AV9IntIni, (byte)(8), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntini_Enabled!=0) ? localUtil.format( AV9IntIni, "Z9.99999") : localUtil.format( AV9IntIni, "Z9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,25);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntini_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductoemfTotalcoloranteX_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntfin_Internalname, httpContext.getMessage( "Cantidad Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV10IntFin, (byte)(8), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntfin_Enabled!=0) ? localUtil.format( AV10IntFin, "Z9.99999") : localUtil.format( AV10IntFin, "Z9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,29);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntfin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductoemfTotalcoloranteX_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPorc_p_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPorc_p_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPorc_p_Internalname, GXutil.ltrim( localUtil.ntoc( AV8Porc_p, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPorc_p_Enabled!=0) ? localUtil.format( AV8Porc_p, "ZZ9.99") : localUtil.format( AV8Porc_p, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,37);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPorc_p_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPorc_p_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductoemfTotalcoloranteX_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavFuncion.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavFuncion.getInternalname(), httpContext.getMessage( "Funcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavFuncion, cmbavFuncion.getInternalname(), GXutil.rtrim( AV7Funcion), 1, cmbavFuncion.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavFuncion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductoemfTotalcoloranteX_WC.htm");
         cmbavFuncion.setValue( GXutil.rtrim( AV7Funcion) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFuncion.getInternalname(), "Values", cmbavFuncion.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGrucol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGrucol_Internalname, httpContext.getMessage( "Familia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrucol_Internalname, hV6GruCol, GXutil.rtrim( localUtil.format( hV6GruCol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrucol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGrucol_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductoemfTotalcoloranteX_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClave_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClave_Internalname, httpContext.getMessage( "Clave", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClave_Internalname, GXutil.rtrim( AV5Clave), GXutil.rtrim( localUtil.format( AV5Clave, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClave_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClave_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductoemfTotalcoloranteX_WC.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Generar Clave", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Generar Clave", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductoemfTotalcoloranteX_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1NP2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Clave Dosificacion Producto em % f(Total colorante X) #", ""), (short)(0)) ;
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
            strup1NP0( ) ;
         }
      }
   }

   public void ws1NP2( )
   {
      start1NP2( ) ;
      evt1NP2( ) ;
   }

   public void evt1NP2( )
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
                              strup1NP0( ) ;
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
                              strup1NP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111NP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoConfirmar' */
                                 e121NP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e131NP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NP0( ) ;
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
                              strup1NP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavIntini_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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

   public void we1NP2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1NP2( ) ;
         }
      }
   }

   public void pa1NP2( )
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
            GX_FocusControl = edtavIntini_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvgrucol1NP0( String A13745GrpCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvgrucol_data1NP0( A13745GrpCDsc) ;
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

   protected void gxsgvvgrucol_data1NP0( String A13745GrpCDsc )
   {
      l13745GrpCDsc = GXutil.concat( GXutil.rtrim( A13745GrpCDsc), "%", "") ;
      /* Using cursor H01NP2 */
      pr_default.execute(0, new Object[] {l13745GrpCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01NP2_A13745GrpCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13745GrpCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01NP2_A13745GrpCDsc[0]);
            gxdynajaxctrldescr.add(H01NP2_A13745GrpCDsc[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvvgrucol1NP2( String A13745GrpCDsc )
   {
      /* Using cursor H01NP3 */
      pr_default.execute(1, new Object[] {A13745GrpCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.strcmp(H01NP3_A13745GrpCDsc[0], A13745GrpCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13745GrpCDsc = H01NP3_A13745GrpCDsc[0] ;
            A396EmprCod = H01NP3_A396EmprCod[0] ;
            A499GrpFamCod = H01NP3_A499GrpFamCod[0] ;
         }
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A499GrpFamCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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
      if ( cmbavFuncion.getItemCount() > 0 )
      {
         AV7Funcion = cmbavFuncion.getValidValue(AV7Funcion) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Funcion", AV7Funcion);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavFuncion.setValue( GXutil.rtrim( AV7Funcion) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFuncion.getInternalname(), "Values", cmbavFuncion.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1NP2( ) ;
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
      edtavPorc_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_p_Enabled), 5, 0), true);
      edtavClave_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClave_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClave_Enabled), 5, 0), true);
   }

   public void rf1NP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e131NP2 ();
         wb1NP0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1NP2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavPorc_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_p_Enabled), 5, 0), true);
      edtavClave_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClave_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClave_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1NP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111NP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOAV11EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV11EmprCod") ;
         wcpOAV13PrdMaxFind = httpContext.cgiGet( sPrefix+"wcpOAV13PrdMaxFind") ;
         wcpOAV16ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavIntini_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavIntini_Internalname)), DecimalUtil.stringToDec("99.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTINI");
            GX_FocusControl = edtavIntini_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9IntIni = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9IntIni", GXutil.ltrimstr( AV9IntIni, 8, 5));
         }
         else
         {
            AV9IntIni = localUtil.ctond( httpContext.cgiGet( edtavIntini_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9IntIni", GXutil.ltrimstr( AV9IntIni, 8, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavIntfin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavIntfin_Internalname)), DecimalUtil.stringToDec("99.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTFIN");
            GX_FocusControl = edtavIntfin_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10IntFin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10IntFin", GXutil.ltrimstr( AV10IntFin, 8, 5));
         }
         else
         {
            AV10IntFin = localUtil.ctond( httpContext.cgiGet( edtavIntfin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10IntFin", GXutil.ltrimstr( AV10IntFin, 8, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorc_p_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorc_p_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORC_P");
            GX_FocusControl = edtavPorc_p_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8Porc_p = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Porc_p", GXutil.ltrimstr( AV8Porc_p, 6, 2));
         }
         else
         {
            AV8Porc_p = localUtil.ctond( httpContext.cgiGet( edtavPorc_p_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Porc_p", GXutil.ltrimstr( AV8Porc_p, 6, 2));
         }
         cmbavFuncion.setValue( httpContext.cgiGet( cmbavFuncion.getInternalname()) );
         AV7Funcion = httpContext.cgiGet( cmbavFuncion.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Funcion", AV7Funcion);
         hV6GruCol = httpContext.cgiGet( edtavGrucol_Internalname) ;
         if ( (GXutil.strcmp("", hV6GruCol)==0) )
         {
            AV6GruCol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6GruCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6GruCol), 2, 0));
         }
         else
         {
            A13745GrpCDsc = hV6GruCol ;
            /* Using cursor H01NP4 */
            pr_default.execute(2, new Object[] {A13745GrpCDsc});
            AV6GruCol = H01NP4_A499GrpFamCod[0] ;
            if ( ! ( (pr_default.getStatus(2) == 101) ) )
            {
               pr_default.readNext(2);
               if ( ! ( (pr_default.getStatus(2) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vGRUCOL");
                  GX_FocusControl = edtavGrucol_Internalname ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(2);
         }
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "hV6GruCol", hV6GruCol);
         AV5Clave = httpContext.cgiGet( edtavClave_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clave", AV5Clave);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ProcesosQuimicos_Claves_DosificacionProductoemfTotalcoloranteX_WC");
         AV8Porc_p = localUtil.ctond( httpContext.cgiGet( edtavPorc_p_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Porc_p", GXutil.ltrimstr( AV8Porc_p, 6, 2));
         forbiddenHiddens.add("Porc_p", localUtil.format( AV8Porc_p, "ZZ9.99"));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e111NP2 ();
      if (returnInSub) return;
   }

   public void e111NP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      GXv_char2[0] = AV11EmprCod ;
      GXv_char3[0] = AV21Emprnom ;
      GXv_char4[0] = AV22Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl.this.AV11EmprCod = GXv_char2[0] ;
      procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl.this.AV21Emprnom = GXv_char3[0] ;
      procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl.this.AV22Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      AV8Porc_p = DecimalUtil.doubleToDec(100) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Porc_p", GXutil.ltrimstr( AV8Porc_p, 6, 2));
   }

   public void e121NP2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      if ( DecimalUtil.compareTo(AV10IntFin, AV9IntIni) < 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Inicial superior Valor Final", ""));
      }
      else
      {
         if ( AV8Porc_p.doubleValue() == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "% valor 0", ""));
            GX_FocusControl = edtavPorc_p_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_char4[0] = AV11EmprCod ;
            GXv_int5[0] = AV6GruCol ;
            GXv_int6[0] = AV12Flag ;
            new app.pbusgru(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
            procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl.this.AV11EmprCod = GXv_char4[0] ;
            procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl.this.AV6GruCol = GXv_int5[0] ;
            procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc_impl.this.AV12Flag = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6GruCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6GruCol), 2, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12Flag", GXutil.str( AV12Flag, 1, 0));
            if ( (0==AV12Flag) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Familia¡", ""));
            }
            else
            {
               if ( (GXutil.strcmp("", AV13PrdMaxFind)==0) && ( GXutil.strcmp(AV7Funcion, httpContext.getMessage( "A", "")) != 0 ) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo puede utilizar Añadir Producto", ""));
               }
               else
               {
                  AV5Clave = httpContext.getMessage( "CF", "") + GXutil.padl( GXutil.trim( GXutil.str( AV9IntIni, 8, 5)), (short)(8), "0") + " " + GXutil.padl( GXutil.trim( GXutil.str( AV10IntFin, 8, 5)), (short)(8), "0") + " " + GXutil.padl( GXutil.trim( GXutil.str( AV8Porc_p, 6, 2)), (short)(6), "0") + AV7Funcion + GXutil.padl( GXutil.trim( GXutil.str( AV6GruCol, 2, 0)), (short)(2), "0") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clave", AV5Clave);
                  AV14ProForCla = "" ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ProForCla", AV14ProForCla);
                  AV17Proforclv = AV5Clave ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Proforclv", AV17Proforclv);
                  AV15WebSession.setValue("ProForClv", AV17Proforclv);
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e131NP2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      AV14ProForCla = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ProForCla", AV14ProForCla);
      AV13PrdMaxFind = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13PrdMaxFind", AV13PrdMaxFind);
      AV16ProForUli = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16ProForUli), 4, 0));
      AV17Proforclv = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Proforclv", AV17Proforclv);
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
      pa1NP2( ) ;
      ws1NP2( ) ;
      we1NP2( ) ;
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
      sCtrlAV11EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV14ProForCla = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV13PrdMaxFind = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV16ProForUli = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV17Proforclv = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1NP2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1NP2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV11EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
         AV14ProForCla = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ProForCla", AV14ProForCla);
         AV13PrdMaxFind = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13PrdMaxFind", AV13PrdMaxFind);
         AV16ProForUli = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16ProForUli), 4, 0));
         AV17Proforclv = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Proforclv", AV17Proforclv);
      }
      wcpOAV11EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV11EmprCod") ;
      wcpOAV13PrdMaxFind = httpContext.cgiGet( sPrefix+"wcpOAV13PrdMaxFind") ;
      wcpOAV16ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV11EmprCod, wcpOAV11EmprCod) != 0 ) || ( GXutil.strcmp(AV13PrdMaxFind, wcpOAV13PrdMaxFind) != 0 ) || ( AV16ProForUli != wcpOAV16ProForUli ) ) )
      {
         setjustcreated();
      }
      wcpOAV11EmprCod = AV11EmprCod ;
      wcpOAV13PrdMaxFind = AV13PrdMaxFind ;
      wcpOAV16ProForUli = AV16ProForUli ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV11EmprCod = httpContext.cgiGet( sPrefix+"AV11EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV11EmprCod) > 0 )
      {
         AV11EmprCod = httpContext.cgiGet( sCtrlAV11EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      }
      else
      {
         AV11EmprCod = httpContext.cgiGet( sPrefix+"AV11EmprCod_PARM") ;
      }
      sCtrlAV14ProForCla = httpContext.cgiGet( sPrefix+"AV14ProForCla_CTRL") ;
      if ( GXutil.len( sCtrlAV14ProForCla) > 0 )
      {
         AV14ProForCla = httpContext.cgiGet( sCtrlAV14ProForCla) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ProForCla", AV14ProForCla);
      }
      else
      {
         AV14ProForCla = httpContext.cgiGet( sPrefix+"AV14ProForCla_PARM") ;
      }
      sCtrlAV13PrdMaxFind = httpContext.cgiGet( sPrefix+"AV13PrdMaxFind_CTRL") ;
      if ( GXutil.len( sCtrlAV13PrdMaxFind) > 0 )
      {
         AV13PrdMaxFind = httpContext.cgiGet( sCtrlAV13PrdMaxFind) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13PrdMaxFind", AV13PrdMaxFind);
      }
      else
      {
         AV13PrdMaxFind = httpContext.cgiGet( sPrefix+"AV13PrdMaxFind_PARM") ;
      }
      sCtrlAV16ProForUli = httpContext.cgiGet( sPrefix+"AV16ProForUli_CTRL") ;
      if ( GXutil.len( sCtrlAV16ProForUli) > 0 )
      {
         AV16ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV16ProForUli), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16ProForUli), 4, 0));
      }
      else
      {
         AV16ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV16ProForUli_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV17Proforclv = httpContext.cgiGet( sPrefix+"AV17Proforclv_CTRL") ;
      if ( GXutil.len( sCtrlAV17Proforclv) > 0 )
      {
         AV17Proforclv = httpContext.cgiGet( sCtrlAV17Proforclv) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Proforclv", AV17Proforclv);
      }
      else
      {
         AV17Proforclv = httpContext.cgiGet( sPrefix+"AV17Proforclv_PARM") ;
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
      pa1NP2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1NP2( ) ;
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
      ws1NP2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11EmprCod_PARM", GXutil.rtrim( AV11EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11EmprCod_CTRL", GXutil.rtrim( sCtrlAV11EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14ProForCla_PARM", GXutil.rtrim( AV14ProForCla));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14ProForCla)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14ProForCla_CTRL", GXutil.rtrim( sCtrlAV14ProForCla));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13PrdMaxFind_PARM", GXutil.rtrim( AV13PrdMaxFind));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13PrdMaxFind)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13PrdMaxFind_CTRL", GXutil.rtrim( sCtrlAV13PrdMaxFind));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16ProForUli_PARM", GXutil.ltrim( localUtil.ntoc( AV16ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16ProForUli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16ProForUli_CTRL", GXutil.rtrim( sCtrlAV16ProForUli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Proforclv_PARM", GXutil.rtrim( AV17Proforclv));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Proforclv)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Proforclv_CTRL", GXutil.rtrim( sCtrlAV17Proforclv));
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
      we1NP2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015561612", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc.js", "?202661015561612", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavIntini_Internalname = sPrefix+"vINTINI" ;
      edtavIntfin_Internalname = sPrefix+"vINTFIN" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      edtavPorc_p_Internalname = sPrefix+"vPORC_P" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      cmbavFuncion.setInternalname( sPrefix+"vFUNCION" );
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      edtavGrucol_Internalname = sPrefix+"vGRUCOL" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      edtavClave_Internalname = sPrefix+"vCLAVE" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
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
      edtavClave_Jsonclick = "" ;
      edtavClave_Enabled = 1 ;
      edtavGrucol_Jsonclick = "" ;
      edtavGrucol_Enabled = 1 ;
      cmbavFuncion.setJsonclick( "" );
      cmbavFuncion.setEnabled( 1 );
      edtavPorc_p_Jsonclick = "" ;
      edtavPorc_p_Enabled = 1 ;
      edtavIntfin_Jsonclick = "" ;
      edtavIntfin_Enabled = 1 ;
      edtavIntini_Jsonclick = "" ;
      edtavIntini_Enabled = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
      cmbavFuncion.setName( "vFUNCION" );
      cmbavFuncion.setWebtags( "" );
      cmbavFuncion.addItem("A", httpContext.getMessage( "Añadir Producto", ""), (short)(0));
      cmbavFuncion.addItem("M", httpContext.getMessage( "Modificar Producto", ""), (short)(0));
      cmbavFuncion.addItem("E", httpContext.getMessage( "Eliminar Producto", ""), (short)(0));
      if ( cmbavFuncion.getItemCount() > 0 )
      {
      }
      /* End function init_web_controls */
   }

   public void validv_Grucol( )
   {
      if ( (GXutil.strcmp("", hV6GruCol)==0) )
      {
         AV6GruCol = (byte)(0) ;
      }
      else
      {
         A13745GrpCDsc = hV6GruCol ;
         /* Using cursor H01NP5 */
         pr_default.execute(3, new Object[] {A13745GrpCDsc});
         AV6GruCol = H01NP5_A499GrpFamCod[0] ;
         if ( ! ( (pr_default.getStatus(3) == 101) ) )
         {
            pr_default.readNext(3);
            if ( ! ( (pr_default.getStatus(3) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vGRUCOL");
               GX_FocusControl = edtavGrucol_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(3);
      }
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "hV6GruCol", hV6GruCol);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6GruCol", GXutil.ltrim( localUtil.ntoc( AV6GruCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "hV6GruCol", hV6GruCol);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV8Porc_p',fld:'vPORC_P',pic:'ZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e121NP2',iparms:[{av:'AV10IntFin',fld:'vINTFIN',pic:'Z9.99999'},{av:'AV9IntIni',fld:'vINTINI',pic:'Z9.99999'},{av:'AV8Porc_p',fld:'vPORC_P',pic:'ZZ9.99'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6GruCol',fld:'vGRUCOL',pic:'Z9'},{av:'AV12Flag',fld:'vFLAG',pic:'9'},{av:'AV13PrdMaxFind',fld:'vPRDMAXFIND',pic:''},{av:'cmbavFuncion'},{av:'AV7Funcion',fld:'vFUNCION',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV12Flag',fld:'vFLAG',pic:'9'},{av:'AV6GruCol',fld:'vGRUCOL',pic:'Z9'},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Clave',fld:'vCLAVE',pic:''},{av:'AV14ProForCla',fld:'vPROFORCLA',pic:''},{av:'AV17Proforclv',fld:'vPROFORCLV',pic:''}]}");
      setEventMetadata("VALIDV_GRUCOL","{handler:'validv_Grucol',iparms:[{av:'hV6GruCol'},{av:'AV6GruCol',fld:'vGRUCOL',pic:'Z9'}]");
      setEventMetadata("VALIDV_GRUCOL",",oparms:[{av:'AV6GruCol',fld:'vGRUCOL',pic:'Z9'},{av:'hV6GruCol'}]}");
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
      wcpOAV11EmprCod = "" ;
      wcpOAV13PrdMaxFind = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV11EmprCod = "" ;
      AV14ProForCla = "" ;
      AV13PrdMaxFind = "" ;
      AV17Proforclv = "" ;
      A13745GrpCDsc = "" ;
      hV6GruCol = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV8Porc_p = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV9IntIni = DecimalUtil.ZERO ;
      AV10IntFin = DecimalUtil.ZERO ;
      AV7Funcion = "" ;
      AV5Clave = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13745GrpCDsc = "" ;
      H01NP2_A13745GrpCDsc = new String[] {""} ;
      H01NP3_A13745GrpCDsc = new String[] {""} ;
      H01NP3_A396EmprCod = new String[] {""} ;
      H01NP3_A499GrpFamCod = new byte[1] ;
      A396EmprCod = "" ;
      H01NP4_A13745GrpCDsc = new String[] {""} ;
      H01NP4_A396EmprCod = new String[] {""} ;
      H01NP4_A499GrpFamCod = new byte[1] ;
      hsh = "" ;
      AV20Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV21Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV22Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      AV15WebSession = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV11EmprCod = "" ;
      sCtrlAV14ProForCla = "" ;
      sCtrlAV13PrdMaxFind = "" ;
      sCtrlAV16ProForUli = "" ;
      sCtrlAV17Proforclv = "" ;
      H01NP5_A13745GrpCDsc = new String[] {""} ;
      H01NP5_A396EmprCod = new String[] {""} ;
      H01NP5_A499GrpFamCod = new byte[1] ;
      ZhV6GruCol = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc__default(),
         new Object[] {
             new Object[] {
            H01NP2_A13745GrpCDsc
            }
            , new Object[] {
            H01NP3_A13745GrpCDsc, H01NP3_A396EmprCod, H01NP3_A499GrpFamCod
            }
            , new Object[] {
            H01NP4_A13745GrpCDsc, H01NP4_A396EmprCod, H01NP4_A499GrpFamCod
            }
            , new Object[] {
            H01NP5_A13745GrpCDsc, H01NP5_A396EmprCod, H01NP5_A499GrpFamCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavPorc_p_Enabled = 0 ;
      edtavClave_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV12Flag ;
   private byte AV6GruCol ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte A499GrpFamCod ;
   private byte GXv_int5[] ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte ZV6GruCol ;
   private short wcpOAV16ProForUli ;
   private short AV16ProForUli ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int edtavIntini_Enabled ;
   private int edtavIntfin_Enabled ;
   private int edtavPorc_p_Enabled ;
   private int edtavGrucol_Enabled ;
   private int edtavClave_Enabled ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private java.math.BigDecimal AV8Porc_p ;
   private java.math.BigDecimal AV9IntIni ;
   private java.math.BigDecimal AV10IntFin ;
   private String wcpOAV11EmprCod ;
   private String wcpOAV13PrdMaxFind ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV11EmprCod ;
   private String AV14ProForCla ;
   private String AV13PrdMaxFind ;
   private String AV17Proforclv ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavIntini_Internalname ;
   private String TempTags ;
   private String edtavIntini_Jsonclick ;
   private String edtavIntfin_Internalname ;
   private String edtavIntfin_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavPorc_p_Internalname ;
   private String edtavPorc_p_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String AV7Funcion ;
   private String divUnnamedtable7_Internalname ;
   private String edtavGrucol_Internalname ;
   private String edtavGrucol_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavClave_Internalname ;
   private String AV5Clave ;
   private String edtavClave_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV20Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV21Emprnom ;
   private String GXv_char3[] ;
   private String AV22Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV11EmprCod ;
   private String sCtrlAV14ProForCla ;
   private String sCtrlAV13PrdMaxFind ;
   private String sCtrlAV16ProForUli ;
   private String sCtrlAV17Proforclv ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String A13745GrpCDsc ;
   private String hV6GruCol ;
   private String l13745GrpCDsc ;
   private String ZhV6GruCol ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavFuncion ;
   private IDataStoreProvider pr_default ;
   private String[] H01NP2_A13745GrpCDsc ;
   private String[] H01NP3_A13745GrpCDsc ;
   private String[] H01NP3_A396EmprCod ;
   private byte[] H01NP3_A499GrpFamCod ;
   private String[] H01NP4_A13745GrpCDsc ;
   private String[] H01NP4_A396EmprCod ;
   private byte[] H01NP4_A499GrpFamCod ;
   private String[] H01NP5_A13745GrpCDsc ;
   private String[] H01NP5_A396EmprCod ;
   private byte[] H01NP5_A499GrpFamCod ;
   private com.genexus.webpanels.WebSession AV15WebSession ;
}

final  class procesosquimicos_claves_dosificacionproductoemftotalcolorantex_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01NP2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc FROM TXPGRUFAM WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, '')))) like '%' || UPPER(?) ORDER BY GrpCDsc) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01NP3", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, EmprCod, GrpFamCod FROM TXPGRUFAM WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01NP4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, EmprCod, GrpFamCod FROM TXPGRUFAM WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01NP5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, EmprCod, GrpFamCod FROM TXPGRUFAM WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
      }
   }

}

