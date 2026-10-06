package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajosexternoscerrarfase_impl extends GXWebComponent
{
   public trabajosexternoscerrarfase_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajosexternoscerrarfase_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajosexternoscerrarfase_impl.class ));
   }

   public trabajosexternoscerrarfase_impl( int remoteHandle ,
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
      cmbavFlag = new HTMLChoice();
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
               AV10RpExHdCnsIn = (short)(GXutil.lval( httpContext.GetPar( "RpExHdCnsIn"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10RpExHdCnsIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10RpExHdCnsIn), 4, 0));
               AV11RpExHdKgsIn = CommonUtil.decimalVal( httpContext.GetPar( "RpExHdKgsIn"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11RpExHdKgsIn", GXutil.ltrimstr( AV11RpExHdKgsIn, 9, 2));
               AV12RpExHdMtsIn = CommonUtil.decimalVal( httpContext.GetPar( "RpExHdMtsIn"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12RpExHdMtsIn", GXutil.ltrimstr( AV12RpExHdMtsIn, 9, 2));
               AV13oldRpExHdCns = (short)(GXutil.lval( httpContext.GetPar( "oldRpExHdCns"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13oldRpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13oldRpExHdCns), 4, 0));
               AV14oldRpExHdKgs = CommonUtil.decimalVal( httpContext.GetPar( "oldRpExHdKgs"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14oldRpExHdKgs", GXutil.ltrimstr( AV14oldRpExHdKgs, 9, 2));
               AV15oldRpExHdMts = CommonUtil.decimalVal( httpContext.GetPar( "oldRpExHdMts"), ".") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15oldRpExHdMts", GXutil.ltrimstr( AV15oldRpExHdMts, 9, 2));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,Short.valueOf(AV10RpExHdCnsIn),AV11RpExHdKgsIn,AV12RpExHdMtsIn,Short.valueOf(AV13oldRpExHdCns),AV14oldRpExHdKgs,AV15oldRpExHdMts});
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
         pa1892( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Trabajos Externos (Cerrar Fase)", "")) ;
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
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternoscerrarfase", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV10RpExHdCnsIn,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV11RpExHdKgsIn)),GXutil.URLEncode(DecimalUtil.decToString(AV12RpExHdMtsIn)),GXutil.URLEncode(GXutil.ltrimstr(AV13oldRpExHdCns,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV14oldRpExHdKgs)),GXutil.URLEncode(DecimalUtil.decToString(AV15oldRpExHdMts))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RpExHdCnsIn","RpExHdKgsIn","RpExHdMtsIn","oldRpExHdCns","oldRpExHdKgs","oldRpExHdMts"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA129BarCod", GXutil.ltrim( localUtil.ntoc( wcpOA129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA132BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOA132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA130BarCodPar", GXutil.rtrim( wcpOA130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10RpExHdCnsIn", GXutil.ltrim( localUtil.ntoc( wcpOAV10RpExHdCnsIn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11RpExHdKgsIn", GXutil.ltrim( localUtil.ntoc( wcpOAV11RpExHdKgsIn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12RpExHdMtsIn", GXutil.ltrim( localUtil.ntoc( wcpOAV12RpExHdMtsIn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13oldRpExHdCns", GXutil.ltrim( localUtil.ntoc( wcpOAV13oldRpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14oldRpExHdKgs", GXutil.ltrim( localUtil.ntoc( wcpOAV14oldRpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15oldRpExHdMts", GXutil.ltrim( localUtil.ntoc( wcpOAV15oldRpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOLDRPEXHDMTS", GXutil.ltrim( localUtil.ntoc( AV15oldRpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOLDRPEXHDKGS", GXutil.ltrim( localUtil.ntoc( AV14oldRpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOLDRPEXHDCNS", GXutil.ltrim( localUtil.ntoc( AV13oldRpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRPEXHDMTSIN", GXutil.ltrim( localUtil.ntoc( AV12RpExHdMtsIn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRPEXHDKGSIN", GXutil.ltrim( localUtil.ntoc( AV11RpExHdKgsIn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRPEXHDCNSIN", GXutil.ltrim( localUtil.ntoc( AV10RpExHdCnsIn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
   }

   public void renderHtmlCloseForm1892( )
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
      return "TrabajosExternosCerrarFase" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Trabajos Externos (Cerrar Fase)", "") ;
   }

   public void wb1890( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.trabajosexternoscerrarfase");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "HDR", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TrabajosExternosCerrarFase.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarPie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosCerrarFase.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarKgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarKgm_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgm_Enabled!=0) ? localUtil.format( A166BarKgm, "ZZZZZ9.99") : localUtil.format( A166BarKgm, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosCerrarFase.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarMtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarMtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMtr_Enabled!=0) ? localUtil.format( A184BarMtr, "ZZZZZ9.99") : localUtil.format( A184BarMtr, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosCerrarFase.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Recibido", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TrabajosExternosCerrarFase.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRpexhdcns_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRpexhdcns_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRpexhdcns_Internalname, GXutil.ltrim( localUtil.ntoc( AV5RpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRpexhdcns_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5RpExHdCns), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5RpExHdCns), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRpexhdcns_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRpexhdcns_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosCerrarFase.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRpexhdkgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRpexhdkgs_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRpexhdkgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV6RpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRpexhdkgs_Enabled!=0) ? localUtil.format( AV6RpExHdKgs, "ZZZZZ9.99") : localUtil.format( AV6RpExHdKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRpexhdkgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRpexhdkgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosCerrarFase.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRpexhdmts_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRpexhdmts_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRpexhdmts_Internalname, GXutil.ltrim( localUtil.ntoc( AV7RpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRpexhdmts_Enabled!=0) ? localUtil.format( AV7RpExHdMts, "ZZZZZ9.99") : localUtil.format( AV7RpExHdMts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRpexhdmts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRpexhdmts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternosCerrarFase.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup7_Internalname, httpContext.getMessage( "Cerrar Fase?", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_TrabajosExternosCerrarFase.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavFlag.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavFlag, cmbavFlag.getInternalname(), GXutil.rtrim( AV9Flag), 1, cmbavFlag.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavFlag.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "", true, (byte)(0), "HLP_TrabajosExternosCerrarFase.htm");
         cmbavFlag.setValue( GXutil.rtrim( AV9Flag) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFlag.getInternalname(), "Values", cmbavFlag.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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

   public void start1892( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Trabajos Externos (Cerrar Fase)", ""), (short)(0)) ;
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
            strup1890( ) ;
         }
      }
   }

   public void ws1892( )
   {
      start1892( ) ;
      evt1892( ) ;
   }

   public void evt1892( )
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
                              strup1890( ) ;
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
                              strup1890( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111892 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1890( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCerrar' */
                                 e121892 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1890( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e131892 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1890( ) ;
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
                              strup1890( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavRpexhdcns_Internalname ;
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

   public void we1892( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1892( ) ;
         }
      }
   }

   public void pa1892( )
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
            GX_FocusControl = edtavRpexhdcns_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      if ( cmbavFlag.getItemCount() > 0 )
      {
         AV9Flag = cmbavFlag.getValidValue(AV9Flag) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Flag", AV9Flag);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavFlag.setValue( GXutil.rtrim( AV9Flag) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFlag.getInternalname(), "Values", cmbavFlag.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1892( ) ;
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
      edtavRpexhdcns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRpexhdcns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdcns_Enabled), 5, 0), true);
      edtavRpexhdkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRpexhdkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdkgs_Enabled), 5, 0), true);
      edtavRpexhdmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRpexhdmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdmts_Enabled), 5, 0), true);
      cmbavFlag.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFlag.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavFlag.getEnabled(), 5, 0), true);
   }

   public void rf1892( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01893 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A228BarUniMed = H01893_A228BarUniMed[0] ;
            A184BarMtr = H01893_A184BarMtr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            A166BarKgm = H01893_A166BarKgm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            A199BarPie1 = H01893_A199BarPie1[0] ;
            A365DisDes = H01893_A365DisDes[0] ;
            A898BarPieNDes = H01893_A898BarPieNDes[0] ;
            A184BarMtr = H01893_A184BarMtr[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            A166BarKgm = H01893_A166BarKgm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            A199BarPie1 = H01893_A199BarPie1[0] ;
            A898BarPieNDes = H01893_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
            }
            else
            {
               A198BarPie = A199BarPie1 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
            }
            /* Execute user event: Load */
            e131892 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1890( ) ;
      }
   }

   public void send_integrity_lvl_hashes1892( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavRpexhdcns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRpexhdcns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdcns_Enabled), 5, 0), true);
      edtavRpexhdkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRpexhdkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdkgs_Enabled), 5, 0), true);
      edtavRpexhdmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRpexhdmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRpexhdmts_Enabled), 5, 0), true);
      cmbavFlag.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFlag.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavFlag.getEnabled(), 5, 0), true);
      /* Using cursor H01895 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         A184BarMtr = H01895_A184BarMtr[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = H01895_A166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A199BarPie1 = H01895_A199BarPie1[0] ;
         A898BarPieNDes = H01895_A898BarPieNDes[0] ;
      }
      else
      {
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      pr_default.close(1);
      pr_default.close(1);
      fix_multi_value_controls( ) ;
   }

   public void strup1890( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111892 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA130BarCodPar = httpContext.cgiGet( sPrefix+"wcpOA130BarCodPar") ;
         wcpOAV10RpExHdCnsIn = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10RpExHdCnsIn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11RpExHdKgsIn = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV11RpExHdKgsIn")) ;
         wcpOAV12RpExHdMtsIn = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV12RpExHdMtsIn")) ;
         wcpOAV13oldRpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13oldRpExHdCns"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV14oldRpExHdKgs = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV14oldRpExHdKgs")) ;
         wcpOAV15oldRpExHdMts = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV15oldRpExHdMts")) ;
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
         /* Read variables values. */
         A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPEXHDCNS");
            GX_FocusControl = edtavRpexhdcns_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5RpExHdCns = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5RpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5RpExHdCns), 4, 0));
         }
         else
         {
            AV5RpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( edtavRpexhdcns_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5RpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5RpExHdCns), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRpexhdkgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRpexhdkgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPEXHDKGS");
            GX_FocusControl = edtavRpexhdkgs_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6RpExHdKgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6RpExHdKgs", GXutil.ltrimstr( AV6RpExHdKgs, 9, 2));
         }
         else
         {
            AV6RpExHdKgs = localUtil.ctond( httpContext.cgiGet( edtavRpexhdkgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6RpExHdKgs", GXutil.ltrimstr( AV6RpExHdKgs, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRpexhdmts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRpexhdmts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPEXHDMTS");
            GX_FocusControl = edtavRpexhdmts_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7RpExHdMts = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7RpExHdMts", GXutil.ltrimstr( AV7RpExHdMts, 9, 2));
         }
         else
         {
            AV7RpExHdMts = localUtil.ctond( httpContext.cgiGet( edtavRpexhdmts_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7RpExHdMts", GXutil.ltrimstr( AV7RpExHdMts, 9, 2));
         }
         cmbavFlag.setValue( httpContext.cgiGet( cmbavFlag.getInternalname()) );
         AV9Flag = httpContext.cgiGet( cmbavFlag.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Flag", AV9Flag);
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
      e111892 ();
      if (returnInSub) return;
   }

   public void e111892( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV9Flag = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Flag", AV9Flag);
      AV5RpExHdCns = (short)(AV10RpExHdCnsIn-AV13oldRpExHdCns) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5RpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5RpExHdCns), 4, 0));
      AV6RpExHdKgs = AV11RpExHdKgsIn.subtract(AV14oldRpExHdKgs) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6RpExHdKgs", GXutil.ltrimstr( AV6RpExHdKgs, 9, 2));
      AV7RpExHdMts = AV12RpExHdMtsIn.subtract(AV15oldRpExHdMts) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7RpExHdMts", GXutil.ltrimstr( AV7RpExHdMts, 9, 2));
      /* Optimized group. */
      /* Using cursor H01896 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      c2716RpExHdCns = H01896_A2716RpExHdCns[0] ;
      n2716RpExHdCns = H01896_n2716RpExHdCns[0] ;
      c2715RpExHdKgs = H01896_A2715RpExHdKgs[0] ;
      n2715RpExHdKgs = H01896_n2715RpExHdKgs[0] ;
      c2847RpExHdMts = H01896_A2847RpExHdMts[0] ;
      n2847RpExHdMts = H01896_n2847RpExHdMts[0] ;
      pr_default.close(2);
      AV5RpExHdCns = (short)(AV5RpExHdCns+c2716RpExHdCns) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5RpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5RpExHdCns), 4, 0));
      AV6RpExHdKgs = AV6RpExHdKgs.add(c2715RpExHdKgs) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6RpExHdKgs", GXutil.ltrimstr( AV6RpExHdKgs, 9, 2));
      AV7RpExHdMts = AV7RpExHdMts.add(c2847RpExHdMts) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7RpExHdMts", GXutil.ltrimstr( AV7RpExHdMts, 9, 2));
      /* End optimized group. */
      if ( ( GXutil.strcmp(A228BarUniMed, "K") == 0 ) && ( (AV6RpExHdKgs.subtract(A166BarKgm)).doubleValue() <= 0 ) )
      {
         AV9Flag = "S" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Flag", AV9Flag);
      }
      if ( ( GXutil.strcmp(A228BarUniMed, "M") == 0 ) && ( (AV7RpExHdMts.subtract(A184BarMtr)).doubleValue() <= 0 ) )
      {
         AV9Flag = "S" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Flag", AV9Flag);
      }
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajosexternoscerrarfase_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      GXv_char2[0] = AV20Emprcod ;
      GXv_char3[0] = AV21Emprnom ;
      GXv_char4[0] = AV22Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajosexternoscerrarfase_impl.this.AV20Emprcod = GXv_char2[0] ;
      trabajosexternoscerrarfase_impl.this.AV21Emprnom = GXv_char3[0] ;
      trabajosexternoscerrarfase_impl.this.AV22Usurcod = GXv_char4[0] ;
   }

   public void e121892( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,Short.valueOf(AV10RpExHdCnsIn),AV11RpExHdKgsIn,AV12RpExHdMtsIn,Short.valueOf(AV13oldRpExHdCns),AV14oldRpExHdKgs,AV15oldRpExHdMts});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","AV10RpExHdCnsIn","AV11RpExHdKgsIn","AV12RpExHdMtsIn","AV13oldRpExHdCns","AV14oldRpExHdKgs","AV15oldRpExHdMts"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e131892( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      AV10RpExHdCnsIn = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10RpExHdCnsIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10RpExHdCnsIn), 4, 0));
      AV11RpExHdKgsIn = (java.math.BigDecimal)getParm(obj,5,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11RpExHdKgsIn", GXutil.ltrimstr( AV11RpExHdKgsIn, 9, 2));
      AV12RpExHdMtsIn = (java.math.BigDecimal)getParm(obj,6,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12RpExHdMtsIn", GXutil.ltrimstr( AV12RpExHdMtsIn, 9, 2));
      AV13oldRpExHdCns = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13oldRpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13oldRpExHdCns), 4, 0));
      AV14oldRpExHdKgs = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14oldRpExHdKgs", GXutil.ltrimstr( AV14oldRpExHdKgs, 9, 2));
      AV15oldRpExHdMts = (java.math.BigDecimal)getParm(obj,9,TypeConstants.DECIMAL) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15oldRpExHdMts", GXutil.ltrimstr( AV15oldRpExHdMts, 9, 2));
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
      pa1892( ) ;
      ws1892( ) ;
      we1892( ) ;
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
      sCtrlA129BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA132BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlA130BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV10RpExHdCnsIn = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV11RpExHdKgsIn = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV12RpExHdMtsIn = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV13oldRpExHdCns = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV14oldRpExHdKgs = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV15oldRpExHdMts = (String)getParm(obj,9,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1892( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "trabajosexternoscerrarfase", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1892( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         AV10RpExHdCnsIn = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10RpExHdCnsIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10RpExHdCnsIn), 4, 0));
         AV11RpExHdKgsIn = (java.math.BigDecimal)getParm(obj,7,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11RpExHdKgsIn", GXutil.ltrimstr( AV11RpExHdKgsIn, 9, 2));
         AV12RpExHdMtsIn = (java.math.BigDecimal)getParm(obj,8,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12RpExHdMtsIn", GXutil.ltrimstr( AV12RpExHdMtsIn, 9, 2));
         AV13oldRpExHdCns = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13oldRpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13oldRpExHdCns), 4, 0));
         AV14oldRpExHdKgs = (java.math.BigDecimal)getParm(obj,10,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14oldRpExHdKgs", GXutil.ltrimstr( AV14oldRpExHdKgs, 9, 2));
         AV15oldRpExHdMts = (java.math.BigDecimal)getParm(obj,11,TypeConstants.DECIMAL) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15oldRpExHdMts", GXutil.ltrimstr( AV15oldRpExHdMts, 9, 2));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA130BarCodPar = httpContext.cgiGet( sPrefix+"wcpOA130BarCodPar") ;
      wcpOAV10RpExHdCnsIn = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10RpExHdCnsIn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11RpExHdKgsIn = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV11RpExHdKgsIn")) ;
      wcpOAV12RpExHdMtsIn = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV12RpExHdMtsIn")) ;
      wcpOAV13oldRpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13oldRpExHdCns"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV14oldRpExHdKgs = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV14oldRpExHdKgs")) ;
      wcpOAV15oldRpExHdMts = localUtil.ctond( httpContext.cgiGet( sPrefix+"wcpOAV15oldRpExHdMts")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A129BarCod != wcpOA129BarCod ) || ( A132BarCodReo != wcpOA132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, wcpOA130BarCodPar) != 0 ) || ( AV10RpExHdCnsIn != wcpOAV10RpExHdCnsIn ) || ( DecimalUtil.compareTo(AV11RpExHdKgsIn, wcpOAV11RpExHdKgsIn) != 0 ) || ( DecimalUtil.compareTo(AV12RpExHdMtsIn, wcpOAV12RpExHdMtsIn) != 0 ) || ( AV13oldRpExHdCns != wcpOAV13oldRpExHdCns ) || ( DecimalUtil.compareTo(AV14oldRpExHdKgs, wcpOAV14oldRpExHdKgs) != 0 ) || ( DecimalUtil.compareTo(AV15oldRpExHdMts, wcpOAV15oldRpExHdMts) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA129BarCod = A129BarCod ;
      wcpOA132BarCodReo = A132BarCodReo ;
      wcpOA130BarCodPar = A130BarCodPar ;
      wcpOAV10RpExHdCnsIn = AV10RpExHdCnsIn ;
      wcpOAV11RpExHdKgsIn = AV11RpExHdKgsIn ;
      wcpOAV12RpExHdMtsIn = AV12RpExHdMtsIn ;
      wcpOAV13oldRpExHdCns = AV13oldRpExHdCns ;
      wcpOAV14oldRpExHdKgs = AV14oldRpExHdKgs ;
      wcpOAV15oldRpExHdMts = AV15oldRpExHdMts ;
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
      sCtrlA129BarCod = httpContext.cgiGet( sPrefix+"A129BarCod_CTRL") ;
      if ( GXutil.len( sCtrlA129BarCod) > 0 )
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA129BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A129BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA132BarCodReo = httpContext.cgiGet( sPrefix+"A132BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlA132BarCodReo) > 0 )
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlA132BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A132BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA130BarCodPar = httpContext.cgiGet( sPrefix+"A130BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlA130BarCodPar) > 0 )
      {
         A130BarCodPar = httpContext.cgiGet( sCtrlA130BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      }
      else
      {
         A130BarCodPar = httpContext.cgiGet( sPrefix+"A130BarCodPar_PARM") ;
      }
      sCtrlAV10RpExHdCnsIn = httpContext.cgiGet( sPrefix+"AV10RpExHdCnsIn_CTRL") ;
      if ( GXutil.len( sCtrlAV10RpExHdCnsIn) > 0 )
      {
         AV10RpExHdCnsIn = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10RpExHdCnsIn), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10RpExHdCnsIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10RpExHdCnsIn), 4, 0));
      }
      else
      {
         AV10RpExHdCnsIn = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10RpExHdCnsIn_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11RpExHdKgsIn = httpContext.cgiGet( sPrefix+"AV11RpExHdKgsIn_CTRL") ;
      if ( GXutil.len( sCtrlAV11RpExHdKgsIn) > 0 )
      {
         AV11RpExHdKgsIn = localUtil.ctond( httpContext.cgiGet( sCtrlAV11RpExHdKgsIn)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11RpExHdKgsIn", GXutil.ltrimstr( AV11RpExHdKgsIn, 9, 2));
      }
      else
      {
         AV11RpExHdKgsIn = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV11RpExHdKgsIn_PARM")) ;
      }
      sCtrlAV12RpExHdMtsIn = httpContext.cgiGet( sPrefix+"AV12RpExHdMtsIn_CTRL") ;
      if ( GXutil.len( sCtrlAV12RpExHdMtsIn) > 0 )
      {
         AV12RpExHdMtsIn = localUtil.ctond( httpContext.cgiGet( sCtrlAV12RpExHdMtsIn)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12RpExHdMtsIn", GXutil.ltrimstr( AV12RpExHdMtsIn, 9, 2));
      }
      else
      {
         AV12RpExHdMtsIn = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV12RpExHdMtsIn_PARM")) ;
      }
      sCtrlAV13oldRpExHdCns = httpContext.cgiGet( sPrefix+"AV13oldRpExHdCns_CTRL") ;
      if ( GXutil.len( sCtrlAV13oldRpExHdCns) > 0 )
      {
         AV13oldRpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13oldRpExHdCns), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13oldRpExHdCns", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13oldRpExHdCns), 4, 0));
      }
      else
      {
         AV13oldRpExHdCns = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13oldRpExHdCns_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV14oldRpExHdKgs = httpContext.cgiGet( sPrefix+"AV14oldRpExHdKgs_CTRL") ;
      if ( GXutil.len( sCtrlAV14oldRpExHdKgs) > 0 )
      {
         AV14oldRpExHdKgs = localUtil.ctond( httpContext.cgiGet( sCtrlAV14oldRpExHdKgs)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14oldRpExHdKgs", GXutil.ltrimstr( AV14oldRpExHdKgs, 9, 2));
      }
      else
      {
         AV14oldRpExHdKgs = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV14oldRpExHdKgs_PARM")) ;
      }
      sCtrlAV15oldRpExHdMts = httpContext.cgiGet( sPrefix+"AV15oldRpExHdMts_CTRL") ;
      if ( GXutil.len( sCtrlAV15oldRpExHdMts) > 0 )
      {
         AV15oldRpExHdMts = localUtil.ctond( httpContext.cgiGet( sCtrlAV15oldRpExHdMts)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15oldRpExHdMts", GXutil.ltrimstr( AV15oldRpExHdMts, 9, 2));
      }
      else
      {
         AV15oldRpExHdMts = localUtil.ctond( httpContext.cgiGet( sPrefix+"AV15oldRpExHdMts_PARM")) ;
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
      pa1892( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1892( ) ;
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
      ws1892( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A129BarCod_PARM", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA129BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A129BarCod_CTRL", GXutil.rtrim( sCtrlA129BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A132BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA132BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A132BarCodReo_CTRL", GXutil.rtrim( sCtrlA132BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A130BarCodPar_PARM", GXutil.rtrim( A130BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlA130BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A130BarCodPar_CTRL", GXutil.rtrim( sCtrlA130BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10RpExHdCnsIn_PARM", GXutil.ltrim( localUtil.ntoc( AV10RpExHdCnsIn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10RpExHdCnsIn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10RpExHdCnsIn_CTRL", GXutil.rtrim( sCtrlAV10RpExHdCnsIn));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11RpExHdKgsIn_PARM", GXutil.ltrim( localUtil.ntoc( AV11RpExHdKgsIn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11RpExHdKgsIn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11RpExHdKgsIn_CTRL", GXutil.rtrim( sCtrlAV11RpExHdKgsIn));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12RpExHdMtsIn_PARM", GXutil.ltrim( localUtil.ntoc( AV12RpExHdMtsIn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12RpExHdMtsIn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12RpExHdMtsIn_CTRL", GXutil.rtrim( sCtrlAV12RpExHdMtsIn));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13oldRpExHdCns_PARM", GXutil.ltrim( localUtil.ntoc( AV13oldRpExHdCns, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13oldRpExHdCns)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13oldRpExHdCns_CTRL", GXutil.rtrim( sCtrlAV13oldRpExHdCns));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14oldRpExHdKgs_PARM", GXutil.ltrim( localUtil.ntoc( AV14oldRpExHdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14oldRpExHdKgs)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14oldRpExHdKgs_CTRL", GXutil.rtrim( sCtrlAV14oldRpExHdKgs));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15oldRpExHdMts_PARM", GXutil.ltrim( localUtil.ntoc( AV15oldRpExHdMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15oldRpExHdMts)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15oldRpExHdMts_CTRL", GXutil.rtrim( sCtrlAV15oldRpExHdMts));
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
      we1892( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267613393414", true, true);
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
         httpContext.AddJavascriptSource("trabajosexternoscerrarfase.js", "?20267613393414", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtBarPie_Internalname = sPrefix+"BARPIE" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtBarMtr_Internalname = sPrefix+"BARMTR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      grpUnnamedgroup3_Internalname = sPrefix+"UNNAMEDGROUP3" ;
      edtavRpexhdcns_Internalname = sPrefix+"vRPEXHDCNS" ;
      edtavRpexhdkgs_Internalname = sPrefix+"vRPEXHDKGS" ;
      edtavRpexhdmts_Internalname = sPrefix+"vRPEXHDMTS" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = sPrefix+"UNNAMEDGROUP5" ;
      cmbavFlag.setInternalname( sPrefix+"vFLAG" );
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      grpUnnamedgroup7_Internalname = sPrefix+"UNNAMEDGROUP7" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
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
      cmbavFlag.setJsonclick( "" );
      cmbavFlag.setEnabled( 1 );
      edtavRpexhdmts_Jsonclick = "" ;
      edtavRpexhdmts_Enabled = 1 ;
      edtavRpexhdkgs_Jsonclick = "" ;
      edtavRpexhdkgs_Enabled = 1 ;
      edtavRpexhdcns_Jsonclick = "" ;
      edtavRpexhdcns_Enabled = 1 ;
      edtBarMtr_Jsonclick = "" ;
      edtBarMtr_Enabled = 0 ;
      edtBarKgm_Jsonclick = "" ;
      edtBarKgm_Enabled = 0 ;
      edtBarPie_Jsonclick = "" ;
      edtBarPie_Enabled = 0 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion de la HDR", "") ;
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
      cmbavFlag.setName( "vFLAG" );
      cmbavFlag.setWebtags( "" );
      cmbavFlag.addItem("S", httpContext.getMessage( "SI", ""), (short)(0));
      cmbavFlag.addItem("N", httpContext.getMessage( "NO", ""), (short)(0));
      if ( cmbavFlag.getItemCount() > 0 )
      {
      }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e121892',iparms:[{av:'AV15oldRpExHdMts',fld:'vOLDRPEXHDMTS',pic:'ZZZZZ9.99'},{av:'AV14oldRpExHdKgs',fld:'vOLDRPEXHDKGS',pic:'ZZZZZ9.99'},{av:'AV13oldRpExHdCns',fld:'vOLDRPEXHDCNS',pic:'ZZZ9'},{av:'AV12RpExHdMtsIn',fld:'vRPEXHDMTSIN',pic:'ZZZZZ9.99'},{av:'AV11RpExHdKgsIn',fld:'vRPEXHDKGSIN',pic:'ZZZZZ9.99'},{av:'AV10RpExHdCnsIn',fld:'vRPEXHDCNSIN',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
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
      wcpOA130BarCodPar = "" ;
      wcpOAV11RpExHdKgsIn = DecimalUtil.ZERO ;
      wcpOAV12RpExHdMtsIn = DecimalUtil.ZERO ;
      wcpOAV14oldRpExHdKgs = DecimalUtil.ZERO ;
      wcpOAV15oldRpExHdMts = DecimalUtil.ZERO ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV11RpExHdKgsIn = DecimalUtil.ZERO ;
      AV12RpExHdMtsIn = DecimalUtil.ZERO ;
      AV14oldRpExHdKgs = DecimalUtil.ZERO ;
      AV15oldRpExHdMts = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A365DisDes = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      TempTags = "" ;
      AV6RpExHdKgs = DecimalUtil.ZERO ;
      AV7RpExHdMts = DecimalUtil.ZERO ;
      AV9Flag = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H01893_A396EmprCod = new String[] {""} ;
      H01893_A129BarCod = new int[1] ;
      H01893_A132BarCodReo = new byte[1] ;
      H01893_A130BarCodPar = new String[] {""} ;
      H01893_A228BarUniMed = new String[] {""} ;
      H01893_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01893_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01893_A199BarPie1 = new short[1] ;
      H01893_A365DisDes = new String[] {""} ;
      H01893_A898BarPieNDes = new int[1] ;
      A228BarUniMed = "" ;
      H01895_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01895_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01895_A199BarPie1 = new short[1] ;
      H01895_A898BarPieNDes = new int[1] ;
      c2715RpExHdKgs = DecimalUtil.ZERO ;
      c2847RpExHdMts = DecimalUtil.ZERO ;
      H01896_A2716RpExHdCns = new short[1] ;
      H01896_n2716RpExHdCns = new boolean[] {false} ;
      H01896_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01896_n2715RpExHdKgs = new boolean[] {false} ;
      H01896_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01896_n2847RpExHdMts = new boolean[] {false} ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      AV20Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV21Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV22Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA129BarCod = "" ;
      sCtrlA132BarCodReo = "" ;
      sCtrlA130BarCodPar = "" ;
      sCtrlAV10RpExHdCnsIn = "" ;
      sCtrlAV11RpExHdKgsIn = "" ;
      sCtrlAV12RpExHdMtsIn = "" ;
      sCtrlAV13oldRpExHdCns = "" ;
      sCtrlAV14oldRpExHdKgs = "" ;
      sCtrlAV15oldRpExHdMts = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternoscerrarfase__default(),
         new Object[] {
             new Object[] {
            H01893_A396EmprCod, H01893_A129BarCod, H01893_A132BarCodReo, H01893_A130BarCodPar, H01893_A228BarUniMed, H01893_A184BarMtr, H01893_A166BarKgm, H01893_A199BarPie1, H01893_A365DisDes, H01893_A898BarPieNDes
            }
            , new Object[] {
            H01895_A184BarMtr, H01895_A166BarKgm, H01895_A199BarPie1, H01895_A898BarPieNDes
            }
            , new Object[] {
            H01896_A2716RpExHdCns, H01896_n2716RpExHdCns, H01896_A2715RpExHdKgs, H01896_n2715RpExHdKgs, H01896_A2847RpExHdMts, H01896_n2847RpExHdMts
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavRpexhdcns_Enabled = 0 ;
      edtavRpexhdkgs_Enabled = 0 ;
      edtavRpexhdmts_Enabled = 0 ;
      cmbavFlag.setEnabled( 0 );
   }

   private byte wcpOA132BarCodReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A132BarCodReo ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wcpOAV10RpExHdCnsIn ;
   private short wcpOAV13oldRpExHdCns ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV10RpExHdCnsIn ;
   private short AV13oldRpExHdCns ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV5RpExHdCns ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short c2716RpExHdCns ;
   private int wcpOA129BarCod ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int edtBarPie_Enabled ;
   private int edtBarKgm_Enabled ;
   private int edtBarMtr_Enabled ;
   private int edtavRpexhdcns_Enabled ;
   private int edtavRpexhdkgs_Enabled ;
   private int edtavRpexhdmts_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV11RpExHdKgsIn ;
   private java.math.BigDecimal wcpOAV12RpExHdMtsIn ;
   private java.math.BigDecimal wcpOAV14oldRpExHdKgs ;
   private java.math.BigDecimal wcpOAV15oldRpExHdMts ;
   private java.math.BigDecimal AV11RpExHdKgsIn ;
   private java.math.BigDecimal AV12RpExHdMtsIn ;
   private java.math.BigDecimal AV14oldRpExHdKgs ;
   private java.math.BigDecimal AV15oldRpExHdMts ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV6RpExHdKgs ;
   private java.math.BigDecimal AV7RpExHdMts ;
   private java.math.BigDecimal c2715RpExHdKgs ;
   private java.math.BigDecimal c2847RpExHdMts ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A365DisDes ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String grpUnnamedgroup3_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarPie_Jsonclick ;
   private String edtBarKgm_Internalname ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Internalname ;
   private String edtBarMtr_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavRpexhdcns_Internalname ;
   private String TempTags ;
   private String edtavRpexhdcns_Jsonclick ;
   private String edtavRpexhdkgs_Internalname ;
   private String edtavRpexhdkgs_Jsonclick ;
   private String edtavRpexhdmts_Internalname ;
   private String edtavRpexhdmts_Jsonclick ;
   private String grpUnnamedgroup7_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String AV9Flag ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String A228BarUniMed ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String AV20Emprcod ;
   private String GXv_char2[] ;
   private String AV21Emprnom ;
   private String GXv_char3[] ;
   private String AV22Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA129BarCod ;
   private String sCtrlA132BarCodReo ;
   private String sCtrlA130BarCodPar ;
   private String sCtrlAV10RpExHdCnsIn ;
   private String sCtrlAV11RpExHdKgsIn ;
   private String sCtrlAV12RpExHdMtsIn ;
   private String sCtrlAV13oldRpExHdCns ;
   private String sCtrlAV14oldRpExHdKgs ;
   private String sCtrlAV15oldRpExHdMts ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n2716RpExHdCns ;
   private boolean n2715RpExHdKgs ;
   private boolean n2847RpExHdMts ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private HTMLChoice cmbavFlag ;
   private IDataStoreProvider pr_default ;
   private String[] H01893_A396EmprCod ;
   private int[] H01893_A129BarCod ;
   private byte[] H01893_A132BarCodReo ;
   private String[] H01893_A130BarCodPar ;
   private String[] H01893_A228BarUniMed ;
   private java.math.BigDecimal[] H01893_A184BarMtr ;
   private java.math.BigDecimal[] H01893_A166BarKgm ;
   private short[] H01893_A199BarPie1 ;
   private String[] H01893_A365DisDes ;
   private int[] H01893_A898BarPieNDes ;
   private java.math.BigDecimal[] H01895_A184BarMtr ;
   private java.math.BigDecimal[] H01895_A166BarKgm ;
   private short[] H01895_A199BarPie1 ;
   private int[] H01895_A898BarPieNDes ;
   private short[] H01896_A2716RpExHdCns ;
   private boolean[] H01896_n2716RpExHdCns ;
   private java.math.BigDecimal[] H01896_A2715RpExHdKgs ;
   private boolean[] H01896_n2715RpExHdKgs ;
   private java.math.BigDecimal[] H01896_A2847RpExHdMts ;
   private boolean[] H01896_n2847RpExHdMts ;
}

final  class trabajosexternoscerrarfase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01893", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarUniMed, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01895", "SELECT COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01896", "SELECT SUM(RpExHdCns), SUM(RpExHdKgs), SUM(RpExHdMts) FROM TXPLREXHD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

