package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientofacturageneral_impl extends GXWebComponent
{
   public mantenimientofacturageneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantenimientofacturageneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientofacturageneral_impl.class ));
   }

   public mantenimientofacturageneral_impl( int remoteHandle ,
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
      cmbFacEst = new HTMLChoice();
      cmbFacAnulada = new HTMLChoice();
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
               A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A430FacCod)});
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
         pa1ZI2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Mantenimiento Factura General", "")) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.mantenimientofacturageneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0))}, new String[] {"EmprCod","FacCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MantenimientoFacturaGeneral");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV14Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\mantenimientofacturageneral:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA430FacCod", GXutil.ltrim( localUtil.ntoc( wcpOA430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACRECICA", GXutil.ltrim( localUtil.ntoc( A11513FacRecIca, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIMPICA1", GXutil.ltrim( localUtil.ntoc( A11514FacImpIca1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIMPICA", GXutil.ltrim( localUtil.ntoc( A11515FacImpIca, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACRECI", GXutil.ltrim( localUtil.ntoc( A8346FacRecI, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIMPREI1", GXutil.ltrim( localUtil.ntoc( A8348FacImpReI1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COLOMBIA", GXutil.ltrim( localUtil.ntoc( A7209Colombia, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIMPREI", GXutil.ltrim( localUtil.ntoc( A8347FacImpReI, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACRECT", GXutil.ltrim( localUtil.ntoc( A7212FacRect, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIMPRET1", GXutil.ltrim( localUtil.ntoc( A7214FacImpRet1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIMPRET", GXutil.ltrim( localUtil.ntoc( A7213FacImpRet, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACRECPOR", GXutil.ltrim( localUtil.ntoc( A453FacRECPor, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACRECIMP1", GXutil.ltrim( localUtil.ntoc( A3922FacRecImp1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACRECIMP", GXutil.ltrim( localUtil.ntoc( A452FacRecImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIVAIMP1", GXutil.ltrim( localUtil.ntoc( A3921FacIvaImp1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACCOSTMTS", GXutil.ltrim( localUtil.ntoc( A14222FacCostMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACCOSTKGS", GXutil.ltrim( localUtil.ntoc( A14223FacCostKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACCOSTFAC", GXutil.ltrim( localUtil.ntoc( A14224FacCostFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACCOSTENG", GXutil.ltrim( localUtil.ntoc( A14221FacCostEng, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACCOSTENE", GXutil.ltrim( localUtil.ntoc( A14220FacCostEne, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIMPTOT1", GXutil.ltrim( localUtil.ntoc( A3918FacImpTot1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACDTOPP", GXutil.ltrim( localUtil.ntoc( A434FacDtoPP, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIMPPP1", GXutil.ltrim( localUtil.ntoc( A3920FacImpPP1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIMPGEN1", GXutil.ltrim( localUtil.ntoc( A3919FacImpGen1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACENERGIA", GXutil.ltrim( localUtil.ntoc( A14219FacEnergia, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FACIMPENG1", GXutil.ltrim( localUtil.ntoc( A14218FacImpEng1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
   }

   public void renderHtmlCloseForm1ZI2( )
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
      return "Facturacion.MantenimientoFacturaGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Factura General", "") ;
   }

   public void wb1ZI0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.mantenimientofacturageneral");
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
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacCod_Internalname, httpContext.getMessage( "Nº Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacCod_Internalname, GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacFch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtFacFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacFch_Internalname, localUtil.format(A436FacFch, "99/99/99"), localUtil.format( A436FacFch, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtFacFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFacFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacHor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacHor_Internalname, httpContext.getMessage( "Dia-Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtFacHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacHor_Internalname, localUtil.ttoc( A9606FacHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9606FacHor, "99/99/99 99:99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacHor_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtFacHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFacHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFacEst.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFacEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFacEst, cmbFacEst.getInternalname(), GXutil.trim( GXutil.str( A435FacEst, 1, 0)), 1, cmbFacEst.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbFacEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         cmbFacEst.setValue( GXutil.trim( GXutil.str( A435FacEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFacEst.getInternalname(), "Values", cmbFacEst.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacSerNum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacSerNum_Internalname, httpContext.getMessage( "Serie", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacSerNum_Internalname, GXutil.rtrim( A2739FacSerNum), GXutil.rtrim( localUtil.format( A2739FacSerNum, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacSerNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacSerNum_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFacAnulada.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbFacAnulada.getInternalname(), httpContext.getMessage( "Anulada?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFacAnulada, cmbFacAnulada.getInternalname(), GXutil.rtrim( A14226FacAnulada), 1, cmbFacAnulada.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFacAnulada.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         cmbFacAnulada.setValue( GXutil.rtrim( A14226FacAnulada) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFacAnulada.getInternalname(), "Values", cmbFacAnulada.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMeivaId_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtMeivaId_Internalname, httpContext.getMessage( "Isenção de IVA", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMeivaId_Internalname, GXutil.rtrim( A11629MeivaId), GXutil.rtrim( localUtil.format( A11629MeivaId, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMeivaId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMeivaId_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacNumVto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacNumVto_Internalname, httpContext.getMessage( "Nº Vtos.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacNumVto_Internalname, GXutil.ltrim( localUtil.ntoc( A1150FacNumVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacNumVto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1150FacNumVto), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1150FacNumVto), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacNumVto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacNumVto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacPer_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacPer_Internalname, httpContext.getMessage( "Periodicidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacPer_Internalname, GXutil.rtrim( A1151FacPer), GXutil.rtrim( localUtil.format( A1151FacPer, "99999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacPer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacPer_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacDiaPag_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacDiaPag_Internalname, httpContext.getMessage( "Dias Pago", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacDiaPag_Internalname, GXutil.rtrim( A1152FacDiaPag), GXutil.rtrim( localUtil.format( A1152FacDiaPag, "999999")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDiaPag_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacDiaPag_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacFpg_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacFpg_Internalname, httpContext.getMessage( "Forma Pago", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacFpg_Internalname, GXutil.rtrim( A437FacFpg), GXutil.rtrim( localUtil.format( A437FacFpg, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacFpg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacFpg_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
         ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
         ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
         ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
         ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
         ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
         ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
         ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
         ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
         ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
         ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, divUnnamedtable8_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFacobs_cell_Internalname, 1, 0, "px", 0, "px", divFacobs_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtFacObs_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacObs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtFacObs_Internalname, A7210FacObs, "", "", (short)(0), edtFacObs_Visible, edtFacObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "32768", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFacobs2_cell_Internalname, 1, 0, "px", 0, "px", divFacobs2_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtFacObs2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacObs2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacObs2_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtFacObs2_Internalname, A11273FacObs2, "", "", (short)(0), edtFacObs2_Visible, edtFacObs2_Enabled, 0, 80, "chr", 8, "row", (byte)(0), StyleString, ClassString, "", "", "600", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
         ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
         ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
         ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
         ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
         ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
         ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
         ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
         ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
         ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
         ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE5Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacImpTot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacImpTot_Internalname, httpContext.getMessage( "Total Bruto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacImpTot_Internalname, GXutil.ltrim( localUtil.ntoc( A441FacImpTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacImpTot_Enabled!=0) ? localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99") : localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacImpTot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacImpTot_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacDtoGen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacDtoGen_Internalname, httpContext.getMessage( "Dto. Gral.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacDtoGen_Internalname, GXutil.ltrim( localUtil.ntoc( A433FacDtoGen, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacDtoGen_Enabled!=0) ? localUtil.format( A433FacDtoGen, "Z9.99") : localUtil.format( A433FacDtoGen, "Z9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDtoGen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacDtoGen_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacImpGen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacImpGen_Internalname, httpContext.getMessage( "Importe Dto. Gral.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacImpGen_Internalname, GXutil.ltrim( localUtil.ntoc( A439FacImpGen, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacImpGen_Enabled!=0) ? localUtil.format( A439FacImpGen, "ZZZZZZZ9.99") : localUtil.format( A439FacImpGen, "ZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacImpGen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacImpGen_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacDto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacDto_Internalname, httpContext.getMessage( "Dto. P.P.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacDto_Internalname, GXutil.ltrim( localUtil.ntoc( A6632FacDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacDto_Enabled!=0) ? localUtil.format( A6632FacDto, "ZZ9.99") : localUtil.format( A6632FacDto, "ZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacDto_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacImpPP_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacImpPP_Internalname, httpContext.getMessage( "Importe Dto. P.P.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacImpPP_Internalname, GXutil.ltrim( localUtil.ntoc( A440FacImpPP, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacImpPP_Enabled!=0) ? localUtil.format( A440FacImpPP, "ZZZZZZZ9.99") : localUtil.format( A440FacImpPP, "ZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacImpPP_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacImpPP_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacBasImp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacBasImp_Internalname, httpContext.getMessage( "Base Imponible", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacBasImp_Internalname, GXutil.ltrim( localUtil.ntoc( A429FacBasImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacBasImp_Enabled!=0) ? localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99") : localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacBasImp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacBasImp_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacIVAPor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacIVAPor_Internalname, httpContext.getMessage( "IVA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacIVAPor_Internalname, GXutil.ltrim( localUtil.ntoc( A443FacIVAPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacIVAPor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A443FacIVAPor), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A443FacIVAPor), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacIVAPor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacIVAPor_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacIVAImp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacIVAImp_Internalname, httpContext.getMessage( "Importe IVA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacIVAImp_Internalname, GXutil.ltrim( localUtil.ntoc( A442FacIVAImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacIVAImp_Enabled!=0) ? localUtil.format( A442FacIVAImp, "ZZZZZZZ9.99") : localUtil.format( A442FacIVAImp, "ZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacIVAImp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacIVAImp_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacTot_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacTot_Internalname, httpContext.getMessage( "Total", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacTot_Internalname, GXutil.ltrim( localUtil.ntoc( A455FacTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacTot_Enabled!=0) ? localUtil.format( A455FacTot, "ZZZZZZZZZ9.99") : localUtil.format( A455FacTot, "ZZZZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacTot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacTot_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
         ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
         ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
         ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
         ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
         ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
         ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
         ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
         ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
         ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
         ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE6Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacFirma_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtFacFirma_Internalname, httpContext.getMessage( "Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtFacFirma_Internalname, GXutil.rtrim( A9605FacFirma), "", "", (short)(0), 1, edtFacFirma_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnupdate_Internalname, "", httpContext.getMessage( "GXM_update", ""), bttBtnupdate_Jsonclick, 7, httpContext.getMessage( "GXM_update", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111zi1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndelete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtndelete_Jsonclick, 7, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121zi1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV14Pgmname), GXutil.rtrim( localUtil.format( AV14Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtFacPri_Internalname, GXutil.rtrim( A450FacPri), GXutil.rtrim( localUtil.format( A450FacPri, "9")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacPri_Jsonclick, 0, "Attribute", "", "", "", "", edtFacPri_Visible, 0, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1ZI2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Factura General", ""), (short)(0)) ;
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
            strup1ZI0( ) ;
         }
      }
   }

   public void ws1ZI2( )
   {
      start1ZI2( ) ;
      evt1ZI2( ) ;
   }

   public void evt1ZI2( )
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
                              strup1ZI0( ) ;
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
                              strup1ZI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e131ZI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e141ZI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZI0( ) ;
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
                              strup1ZI0( ) ;
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

   public void we1ZI2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1ZI2( ) ;
         }
      }
   }

   public void pa1ZI2( )
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
      if ( cmbFacEst.getItemCount() > 0 )
      {
         A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValidValue(GXutil.trim( GXutil.str( A435FacEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFacEst.setValue( GXutil.trim( GXutil.str( A435FacEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFacEst.getInternalname(), "Values", cmbFacEst.ToJavascriptSource(), true);
      }
      if ( cmbFacAnulada.getItemCount() > 0 )
      {
         A14226FacAnulada = cmbFacAnulada.getValidValue(A14226FacAnulada) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14226FacAnulada", A14226FacAnulada);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFacAnulada.setValue( GXutil.rtrim( A14226FacAnulada) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbFacAnulada.getInternalname(), "Values", cmbFacAnulada.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1ZI2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV14Pgmname = "Facturacion.MantenimientoFacturaGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1ZI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01ZI3 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A7210FacObs = H01ZI3_A7210FacObs[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7210FacObs", A7210FacObs);
            A450FacPri = H01ZI3_A450FacPri[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A450FacPri", A450FacPri);
            A9605FacFirma = H01ZI3_A9605FacFirma[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9605FacFirma", A9605FacFirma);
            A6632FacDto = H01ZI3_A6632FacDto[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
            A11273FacObs2 = H01ZI3_A11273FacObs2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11273FacObs2", A11273FacObs2);
            A437FacFpg = H01ZI3_A437FacFpg[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A437FacFpg", A437FacFpg);
            A1152FacDiaPag = H01ZI3_A1152FacDiaPag[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1152FacDiaPag", A1152FacDiaPag);
            A1151FacPer = H01ZI3_A1151FacPer[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1151FacPer", A1151FacPer);
            A1150FacNumVto = H01ZI3_A1150FacNumVto[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
            A11629MeivaId = H01ZI3_A11629MeivaId[0] ;
            n11629MeivaId = H01ZI3_n11629MeivaId[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11629MeivaId", A11629MeivaId);
            A279CliNom = H01ZI3_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A252CliCod = H01ZI3_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A14226FacAnulada = H01ZI3_A14226FacAnulada[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14226FacAnulada", A14226FacAnulada);
            A2739FacSerNum = H01ZI3_A2739FacSerNum[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2739FacSerNum", A2739FacSerNum);
            A435FacEst = H01ZI3_A435FacEst[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
            A9606FacHor = H01ZI3_A9606FacHor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A436FacFch = H01ZI3_A436FacFch[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
            A11513FacRecIca = H01ZI3_A11513FacRecIca[0] ;
            A8346FacRecI = H01ZI3_A8346FacRecI[0] ;
            n8346FacRecI = H01ZI3_n8346FacRecI[0] ;
            A7212FacRect = H01ZI3_A7212FacRect[0] ;
            A453FacRECPor = H01ZI3_A453FacRECPor[0] ;
            A443FacIVAPor = H01ZI3_A443FacIVAPor[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
            A14224FacCostFac = H01ZI3_A14224FacCostFac[0] ;
            A14223FacCostKgs = H01ZI3_A14223FacCostKgs[0] ;
            A14222FacCostMts = H01ZI3_A14222FacCostMts[0] ;
            A434FacDtoPP = H01ZI3_A434FacDtoPP[0] ;
            A433FacDtoGen = H01ZI3_A433FacDtoGen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
            A14219FacEnergia = H01ZI3_A14219FacEnergia[0] ;
            A3918FacImpTot1 = H01ZI3_A3918FacImpTot1[0] ;
            A279CliNom = H01ZI3_A279CliNom[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
            A3918FacImpTot1 = H01ZI3_A3918FacImpTot1[0] ;
            A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
            if ( A7209Colombia == 0 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
               }
               else
               {
                  A440FacImpPP = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
               }
            }
            A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
            if ( A7209Colombia == 0 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
               }
               else
               {
                  A439FacImpGen = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
               }
            }
            A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
            A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
            A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
            A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
            A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
            A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
            A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
            A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
            if ( A7209Colombia == 0 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
               }
               else
               {
                  A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
               }
            }
            A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
            if ( A7209Colombia == 0 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
               }
               else
               {
                  A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
               }
            }
            A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
            if ( A7209Colombia == 0 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
               }
               else
               {
                  A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
               }
            }
            A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
            if ( A7209Colombia == 0 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
               }
               else
               {
                  A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
               }
            }
            A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
            /* Execute user event: Load */
            e141ZI2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb1ZI0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1ZI2( )
   {
   }

   public void before_start_formulas( )
   {
      AV14Pgmname = "Facturacion.MantenimientoFacturaGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      /* Using cursor H01ZI4 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      A7209Colombia = H01ZI4_A7209Colombia[0] ;
      n7209Colombia = H01ZI4_n7209Colombia[0] ;
      pr_default.close(1);
      /* Using cursor H01ZI6 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A3918FacImpTot1 = H01ZI6_A3918FacImpTot1[0] ;
      }
      else
      {
         A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      }
      pr_default.close(2);
      pr_default.close(1);
      pr_default.close(2);
      fix_multi_value_controls( ) ;
   }

   public void strup1ZI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131ZI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA430FacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
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
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
         Dvpanel_unnamedtable4_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Width") ;
         Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
         Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
         Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Cls") ;
         Dvpanel_unnamedtable4_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Title") ;
         Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
         Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
         Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
         Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Iconposition") ;
         Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
         Dvpanel_unnamedtable5_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Width") ;
         Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
         Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
         Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Cls") ;
         Dvpanel_unnamedtable5_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Title") ;
         Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
         Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
         Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
         Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Iconposition") ;
         Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
         Dvpanel_unnamedtable6_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Width") ;
         Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
         Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
         Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Cls") ;
         Dvpanel_unnamedtable6_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Title") ;
         Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
         Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
         Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
         Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Iconposition") ;
         Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
         /* Read variables values. */
         A436FacFch = localUtil.ctod( httpContext.cgiGet( edtFacFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
         A9606FacHor = localUtil.ctot( httpContext.cgiGet( edtFacHor_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         cmbFacEst.setValue( httpContext.cgiGet( cmbFacEst.getInternalname()) );
         A435FacEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacEst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
         A2739FacSerNum = httpContext.cgiGet( edtFacSerNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A2739FacSerNum", A2739FacSerNum);
         cmbFacAnulada.setValue( httpContext.cgiGet( cmbFacAnulada.getInternalname()) );
         A14226FacAnulada = httpContext.cgiGet( cmbFacAnulada.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14226FacAnulada", A14226FacAnulada);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
         A11629MeivaId = httpContext.cgiGet( edtMeivaId_Internalname) ;
         n11629MeivaId = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11629MeivaId", A11629MeivaId);
         A1150FacNumVto = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacNumVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = httpContext.cgiGet( edtFacPer_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = httpContext.cgiGet( edtFacDiaPag_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1152FacDiaPag", A1152FacDiaPag);
         A437FacFpg = GXutil.upper( httpContext.cgiGet( edtFacFpg_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A437FacFpg", A437FacFpg);
         A7210FacObs = httpContext.cgiGet( edtFacObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7210FacObs", A7210FacObs);
         A11273FacObs2 = httpContext.cgiGet( edtFacObs2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A11273FacObs2", A11273FacObs2);
         A441FacImpTot = localUtil.ctond( httpContext.cgiGet( edtFacImpTot_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
         A433FacDtoGen = localUtil.ctond( httpContext.cgiGet( edtFacDtoGen_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A439FacImpGen = localUtil.ctond( httpContext.cgiGet( edtFacImpGen_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         A6632FacDto = localUtil.ctond( httpContext.cgiGet( edtFacDto_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
         A440FacImpPP = localUtil.ctond( httpContext.cgiGet( edtFacImpPP_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         A429FacBasImp = localUtil.ctond( httpContext.cgiGet( edtFacBasImp_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
         A443FacIVAPor = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacIVAPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A442FacIVAImp = localUtil.ctond( httpContext.cgiGet( edtFacIVAImp_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         A455FacTot = localUtil.ctond( httpContext.cgiGet( edtFacTot_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
         A9605FacFirma = httpContext.cgiGet( edtFacFirma_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9605FacFirma", A9605FacFirma);
         AV14Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
         A450FacPri = httpContext.cgiGet( edtFacPri_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A450FacPri", A450FacPri);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"MantenimientoFacturaGeneral");
         AV14Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Pgmname", AV14Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV14Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\mantenimientofacturageneral:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e131ZI2 ();
      if (returnInSub) return;
   }

   public void e131ZI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mantenimientofacturageneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      GXv_char2[0] = AV16Emprcod ;
      GXv_char3[0] = AV17Emprnom ;
      GXv_char4[0] = AV18Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      mantenimientofacturageneral_impl.this.AV16Emprcod = GXv_char2[0] ;
      mantenimientofacturageneral_impl.this.AV17Emprnom = GXv_char3[0] ;
      mantenimientofacturageneral_impl.this.AV18Usurcod = GXv_char4[0] ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e141ZI2( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtFacPri_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFacPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Visible), 5, 0), true);
      if ( ! ( ( AV19Firmad.doubleValue() == 0 ) ) )
      {
         edtFacObs_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFacObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs_Visible), 5, 0), true);
         divFacobs_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFacobs_cell_Internalname, "Class", divFacobs_cell_Class, true);
      }
      else
      {
         edtFacObs_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFacObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs_Visible), 5, 0), true);
         divFacobs_cell_Class = "col-xs-12 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFacobs_cell_Internalname, "Class", divFacobs_cell_Class, true);
      }
      if ( ! ( ( AV19Firmad.doubleValue() == 1 ) ) )
      {
         edtFacObs2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFacObs2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs2_Visible), 5, 0), true);
         divFacobs2_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFacobs2_cell_Internalname, "Class", divFacobs2_cell_Class, true);
      }
      else
      {
         edtFacObs2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFacObs2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs2_Visible), 5, 0), true);
         divFacobs2_cell_Class = "col-xs-12 DataContentCell" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divFacobs2_cell_Internalname, "Class", divFacobs2_cell_Class, true);
      }
      if ( ( edtFacObs_Visible == ( 0 )) && ( edtFacObs2_Visible == ( 0 )) )
      {
         divUnnamedtable8_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable8_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable8_Visible), 5, 0), true);
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
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Facturacion.MantenimientoFactura" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A430FacCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
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
      pa1ZI2( ) ;
      ws1ZI2( ) ;
      we1ZI2( ) ;
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
      sCtrlA430FacCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1ZI2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\mantenimientofacturageneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1ZI2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A430FacCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA430FacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A430FacCod != wcpOA430FacCod ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA430FacCod = A430FacCod ;
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
      sCtrlA430FacCod = httpContext.cgiGet( sPrefix+"A430FacCod_CTRL") ;
      if ( GXutil.len( sCtrlA430FacCod) > 0 )
      {
         A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA430FacCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      else
      {
         A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A430FacCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1ZI2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1ZI2( ) ;
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
      ws1ZI2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A430FacCod_PARM", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA430FacCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A430FacCod_CTRL", GXutil.rtrim( sCtrlA430FacCod));
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
      we1ZI2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415121624", true, true);
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
      httpContext.AddJavascriptSource("facturacion/mantenimientofacturageneral.js", "?202682415121624", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtFacCod_Internalname = sPrefix+"FACCOD" ;
      edtFacFch_Internalname = sPrefix+"FACFCH" ;
      edtFacHor_Internalname = sPrefix+"FACHOR" ;
      cmbFacEst.setInternalname( sPrefix+"FACEST" );
      edtFacSerNum_Internalname = sPrefix+"FACSERNUM" ;
      cmbFacAnulada.setInternalname( sPrefix+"FACANULADA" );
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtMeivaId_Internalname = sPrefix+"MEIVAID" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      edtFacNumVto_Internalname = sPrefix+"FACNUMVTO" ;
      edtFacPer_Internalname = sPrefix+"FACPER" ;
      edtFacDiaPag_Internalname = sPrefix+"FACDIAPAG" ;
      edtFacFpg_Internalname = sPrefix+"FACFPG" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE3" ;
      edtFacObs_Internalname = sPrefix+"FACOBS" ;
      divFacobs_cell_Internalname = sPrefix+"FACOBS_CELL" ;
      edtFacObs2_Internalname = sPrefix+"FACOBS2" ;
      divFacobs2_cell_Internalname = sPrefix+"FACOBS2_CELL" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE4" ;
      edtFacImpTot_Internalname = sPrefix+"FACIMPTOT" ;
      edtFacDtoGen_Internalname = sPrefix+"FACDTOGEN" ;
      edtFacImpGen_Internalname = sPrefix+"FACIMPGEN" ;
      edtFacDto_Internalname = sPrefix+"FACDTO" ;
      edtFacImpPP_Internalname = sPrefix+"FACIMPPP" ;
      edtFacBasImp_Internalname = sPrefix+"FACBASIMP" ;
      edtFacIVAPor_Internalname = sPrefix+"FACIVAPOR" ;
      edtFacIVAImp_Internalname = sPrefix+"FACIVAIMP" ;
      edtFacTot_Internalname = sPrefix+"FACTOT" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE5" ;
      edtFacFirma_Internalname = sPrefix+"FACFIRMA" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE6" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      bttBtnupdate_Internalname = sPrefix+"BTNUPDATE" ;
      bttBtndelete_Internalname = sPrefix+"BTNDELETE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtFacPri_Internalname = sPrefix+"FACPRI" ;
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
      edtFacPri_Jsonclick = "" ;
      edtFacPri_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtFacFirma_Enabled = 0 ;
      edtFacTot_Jsonclick = "" ;
      edtFacTot_Enabled = 0 ;
      edtFacIVAImp_Jsonclick = "" ;
      edtFacIVAImp_Enabled = 0 ;
      edtFacIVAPor_Jsonclick = "" ;
      edtFacIVAPor_Enabled = 0 ;
      edtFacBasImp_Jsonclick = "" ;
      edtFacBasImp_Enabled = 0 ;
      edtFacImpPP_Jsonclick = "" ;
      edtFacImpPP_Enabled = 0 ;
      edtFacDto_Jsonclick = "" ;
      edtFacDto_Enabled = 0 ;
      edtFacImpGen_Jsonclick = "" ;
      edtFacImpGen_Enabled = 0 ;
      edtFacDtoGen_Jsonclick = "" ;
      edtFacDtoGen_Enabled = 0 ;
      edtFacImpTot_Jsonclick = "" ;
      edtFacImpTot_Enabled = 0 ;
      edtFacObs2_Enabled = 0 ;
      edtFacObs2_Visible = 1 ;
      divFacobs2_cell_Class = "col-xs-12" ;
      edtFacObs_Enabled = 0 ;
      edtFacObs_Visible = 1 ;
      divFacobs_cell_Class = "col-xs-12" ;
      divUnnamedtable8_Visible = 1 ;
      edtFacFpg_Jsonclick = "" ;
      edtFacFpg_Enabled = 0 ;
      edtFacDiaPag_Jsonclick = "" ;
      edtFacDiaPag_Enabled = 0 ;
      edtFacPer_Jsonclick = "" ;
      edtFacPer_Enabled = 0 ;
      edtFacNumVto_Jsonclick = "" ;
      edtFacNumVto_Enabled = 0 ;
      edtMeivaId_Jsonclick = "" ;
      edtMeivaId_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      cmbFacAnulada.setJsonclick( "" );
      cmbFacAnulada.setEnabled( 0 );
      edtFacSerNum_Jsonclick = "" ;
      edtFacSerNum_Enabled = 0 ;
      cmbFacEst.setJsonclick( "" );
      cmbFacEst.setEnabled( 0 );
      edtFacHor_Jsonclick = "" ;
      edtFacHor_Enabled = 0 ;
      edtFacFch_Jsonclick = "" ;
      edtFacFch_Enabled = 0 ;
      edtFacCod_Jsonclick = "" ;
      edtFacCod_Enabled = 0 ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Hash", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Totales", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Observaciones", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Formas de Pago", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Cliente", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      cmbFacEst.setName( "FACEST" );
      cmbFacEst.setWebtags( "" );
      cmbFacEst.addItem("0", httpContext.getMessage( "Pdte. Imp.", ""), (short)(0));
      cmbFacEst.addItem("1", httpContext.getMessage( "Imp.", ""), (short)(0));
      cmbFacEst.addItem("2", httpContext.getMessage( "Act.", ""), (short)(0));
      if ( cmbFacEst.getItemCount() > 0 )
      {
      }
      cmbFacAnulada.setName( "FACANULADA" );
      cmbFacAnulada.setWebtags( "" );
      cmbFacAnulada.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFacAnulada.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFacAnulada.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV14Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUPDATE'","{handler:'e111ZI1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOUPDATE'",",oparms:[]}");
      setEventMetadata("'DODELETE'","{handler:'e121ZI1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DODELETE'",",oparms:[]}");
      setEventMetadata("VALID_FACCOD","{handler:'valid_Faccod',iparms:[]");
      setEventMetadata("VALID_FACCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FACIMPTOT","{handler:'valid_Facimptot',iparms:[]");
      setEventMetadata("VALID_FACIMPTOT",",oparms:[]}");
      setEventMetadata("VALID_FACDTOGEN","{handler:'valid_Facdtogen',iparms:[]");
      setEventMetadata("VALID_FACDTOGEN",",oparms:[]}");
      setEventMetadata("VALID_FACIMPGEN","{handler:'valid_Facimpgen',iparms:[]");
      setEventMetadata("VALID_FACIMPGEN",",oparms:[]}");
      setEventMetadata("VALID_FACIMPPP","{handler:'valid_Facimppp',iparms:[]");
      setEventMetadata("VALID_FACIMPPP",",oparms:[]}");
      setEventMetadata("VALID_FACBASIMP","{handler:'valid_Facbasimp',iparms:[]");
      setEventMetadata("VALID_FACBASIMP",",oparms:[]}");
      setEventMetadata("VALID_FACIVAPOR","{handler:'valid_Facivapor',iparms:[]");
      setEventMetadata("VALID_FACIVAPOR",",oparms:[]}");
      setEventMetadata("VALID_FACIVAIMP","{handler:'valid_Facivaimp',iparms:[]");
      setEventMetadata("VALID_FACIVAIMP",",oparms:[]}");
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
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV14Pgmname = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      A436FacFch = GXutil.nullDate() ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      A2739FacSerNum = "" ;
      A14226FacAnulada = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      A279CliNom = "" ;
      A11629MeivaId = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      A1151FacPer = "" ;
      A1152FacDiaPag = "" ;
      A437FacFpg = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      A7210FacObs = "" ;
      A11273FacObs2 = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      A441FacImpTot = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A6632FacDto = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      A9605FacFirma = "" ;
      TempTags = "" ;
      bttBtnupdate_Jsonclick = "" ;
      bttBtndelete_Jsonclick = "" ;
      A450FacPri = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H01ZI3_A7210FacObs = new String[] {""} ;
      H01ZI3_A396EmprCod = new String[] {""} ;
      H01ZI3_A430FacCod = new int[1] ;
      H01ZI3_A450FacPri = new String[] {""} ;
      H01ZI3_A9605FacFirma = new String[] {""} ;
      H01ZI3_A6632FacDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_A11273FacObs2 = new String[] {""} ;
      H01ZI3_A437FacFpg = new String[] {""} ;
      H01ZI3_A1152FacDiaPag = new String[] {""} ;
      H01ZI3_A1151FacPer = new String[] {""} ;
      H01ZI3_A1150FacNumVto = new byte[1] ;
      H01ZI3_A11629MeivaId = new String[] {""} ;
      H01ZI3_n11629MeivaId = new boolean[] {false} ;
      H01ZI3_A279CliNom = new String[] {""} ;
      H01ZI3_A252CliCod = new int[1] ;
      H01ZI3_A14226FacAnulada = new String[] {""} ;
      H01ZI3_A2739FacSerNum = new String[] {""} ;
      H01ZI3_A435FacEst = new byte[1] ;
      H01ZI3_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZI3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZI3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_n8346FacRecI = new boolean[] {false} ;
      H01ZI3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_A443FacIVAPor = new byte[1] ;
      H01ZI3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_A7209Colombia = new byte[1] ;
      H01ZI3_n7209Colombia = new boolean[] {false} ;
      H01ZI3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI3_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZI4_A7209Colombia = new byte[1] ;
      H01ZI4_n7209Colombia = new boolean[] {false} ;
      H01ZI6_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      hsh = "" ;
      AV15Station = "" ;
      GXt_char1 = "" ;
      AV16Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV17Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV18Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Firmad = DecimalUtil.ZERO ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA430FacCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofacturageneral__default(),
         new Object[] {
             new Object[] {
            H01ZI3_A7210FacObs, H01ZI3_A396EmprCod, H01ZI3_A430FacCod, H01ZI3_A450FacPri, H01ZI3_A9605FacFirma, H01ZI3_A6632FacDto, H01ZI3_A11273FacObs2, H01ZI3_A437FacFpg, H01ZI3_A1152FacDiaPag, H01ZI3_A1151FacPer,
            H01ZI3_A1150FacNumVto, H01ZI3_A11629MeivaId, H01ZI3_n11629MeivaId, H01ZI3_A279CliNom, H01ZI3_A252CliCod, H01ZI3_A14226FacAnulada, H01ZI3_A2739FacSerNum, H01ZI3_A435FacEst, H01ZI3_A9606FacHor, H01ZI3_A436FacFch,
            H01ZI3_A11513FacRecIca, H01ZI3_A8346FacRecI, H01ZI3_n8346FacRecI, H01ZI3_A7212FacRect, H01ZI3_A453FacRECPor, H01ZI3_A443FacIVAPor, H01ZI3_A14224FacCostFac, H01ZI3_A14223FacCostKgs, H01ZI3_A14222FacCostMts, H01ZI3_A434FacDtoPP,
            H01ZI3_A433FacDtoGen, H01ZI3_A7209Colombia, H01ZI3_n7209Colombia, H01ZI3_A14219FacEnergia, H01ZI3_A3918FacImpTot1
            }
            , new Object[] {
            H01ZI4_A7209Colombia, H01ZI4_n7209Colombia
            }
            , new Object[] {
            H01ZI6_A3918FacImpTot1
            }
         }
      );
      AV14Pgmname = "Facturacion.MantenimientoFacturaGeneral" ;
      /* GeneXus formulas. */
      AV14Pgmname = "Facturacion.MantenimientoFacturaGeneral" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A7209Colombia ;
   private byte A435FacEst ;
   private byte A1150FacNumVto ;
   private byte A443FacIVAPor ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA430FacCod ;
   private int A430FacCod ;
   private int edtFacCod_Enabled ;
   private int edtFacFch_Enabled ;
   private int edtFacHor_Enabled ;
   private int edtFacSerNum_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtMeivaId_Enabled ;
   private int edtFacNumVto_Enabled ;
   private int edtFacPer_Enabled ;
   private int edtFacDiaPag_Enabled ;
   private int edtFacFpg_Enabled ;
   private int divUnnamedtable8_Visible ;
   private int edtFacObs_Visible ;
   private int edtFacObs_Enabled ;
   private int edtFacObs2_Visible ;
   private int edtFacObs2_Enabled ;
   private int edtFacImpTot_Enabled ;
   private int edtFacDtoGen_Enabled ;
   private int edtFacImpGen_Enabled ;
   private int edtFacDto_Enabled ;
   private int edtFacImpPP_Enabled ;
   private int edtFacBasImp_Enabled ;
   private int edtFacIVAPor_Enabled ;
   private int edtFacIVAImp_Enabled ;
   private int edtFacTot_Enabled ;
   private int edtFacFirma_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtFacPri_Visible ;
   private int idxLst ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A6632FacDto ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV19Firmad ;
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
   private String AV14Pgmname ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtFacCod_Internalname ;
   private String edtFacCod_Jsonclick ;
   private String edtFacFch_Internalname ;
   private String edtFacFch_Jsonclick ;
   private String edtFacHor_Internalname ;
   private String edtFacHor_Jsonclick ;
   private String edtFacSerNum_Internalname ;
   private String A2739FacSerNum ;
   private String edtFacSerNum_Jsonclick ;
   private String A14226FacAnulada ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtMeivaId_Internalname ;
   private String A11629MeivaId ;
   private String edtMeivaId_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtFacNumVto_Internalname ;
   private String edtFacNumVto_Jsonclick ;
   private String edtFacPer_Internalname ;
   private String A1151FacPer ;
   private String edtFacPer_Jsonclick ;
   private String edtFacDiaPag_Internalname ;
   private String A1152FacDiaPag ;
   private String edtFacDiaPag_Jsonclick ;
   private String edtFacFpg_Internalname ;
   private String A437FacFpg ;
   private String edtFacFpg_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String divFacobs_cell_Internalname ;
   private String divFacobs_cell_Class ;
   private String edtFacObs_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divFacobs2_cell_Internalname ;
   private String divFacobs2_cell_Class ;
   private String edtFacObs2_Internalname ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtFacImpTot_Internalname ;
   private String edtFacImpTot_Jsonclick ;
   private String edtFacDtoGen_Internalname ;
   private String edtFacDtoGen_Jsonclick ;
   private String edtFacImpGen_Internalname ;
   private String edtFacImpGen_Jsonclick ;
   private String edtFacDto_Internalname ;
   private String edtFacDto_Jsonclick ;
   private String edtFacImpPP_Internalname ;
   private String edtFacImpPP_Jsonclick ;
   private String edtFacBasImp_Internalname ;
   private String edtFacBasImp_Jsonclick ;
   private String edtFacIVAPor_Internalname ;
   private String edtFacIVAPor_Jsonclick ;
   private String edtFacIVAImp_Internalname ;
   private String edtFacIVAImp_Jsonclick ;
   private String edtFacTot_Internalname ;
   private String edtFacTot_Jsonclick ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtFacFirma_Internalname ;
   private String A9605FacFirma ;
   private String TempTags ;
   private String bttBtnupdate_Internalname ;
   private String bttBtnupdate_Jsonclick ;
   private String bttBtndelete_Internalname ;
   private String bttBtndelete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtFacPri_Internalname ;
   private String A450FacPri ;
   private String edtFacPri_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String hsh ;
   private String AV15Station ;
   private String GXt_char1 ;
   private String AV16Emprcod ;
   private String GXv_char2[] ;
   private String AV17Emprnom ;
   private String GXv_char3[] ;
   private String AV18Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA430FacCod ;
   private java.util.Date A9606FacHor ;
   private java.util.Date A436FacFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n11629MeivaId ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean returnInSub ;
   private String A7210FacObs ;
   private String A11273FacObs2 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbFacEst ;
   private HTMLChoice cmbFacAnulada ;
   private IDataStoreProvider pr_default ;
   private String[] H01ZI3_A7210FacObs ;
   private String[] H01ZI3_A396EmprCod ;
   private int[] H01ZI3_A430FacCod ;
   private String[] H01ZI3_A450FacPri ;
   private String[] H01ZI3_A9605FacFirma ;
   private java.math.BigDecimal[] H01ZI3_A6632FacDto ;
   private String[] H01ZI3_A11273FacObs2 ;
   private String[] H01ZI3_A437FacFpg ;
   private String[] H01ZI3_A1152FacDiaPag ;
   private String[] H01ZI3_A1151FacPer ;
   private byte[] H01ZI3_A1150FacNumVto ;
   private String[] H01ZI3_A11629MeivaId ;
   private boolean[] H01ZI3_n11629MeivaId ;
   private String[] H01ZI3_A279CliNom ;
   private int[] H01ZI3_A252CliCod ;
   private String[] H01ZI3_A14226FacAnulada ;
   private String[] H01ZI3_A2739FacSerNum ;
   private byte[] H01ZI3_A435FacEst ;
   private java.util.Date[] H01ZI3_A9606FacHor ;
   private java.util.Date[] H01ZI3_A436FacFch ;
   private java.math.BigDecimal[] H01ZI3_A11513FacRecIca ;
   private java.math.BigDecimal[] H01ZI3_A8346FacRecI ;
   private boolean[] H01ZI3_n8346FacRecI ;
   private java.math.BigDecimal[] H01ZI3_A7212FacRect ;
   private java.math.BigDecimal[] H01ZI3_A453FacRECPor ;
   private byte[] H01ZI3_A443FacIVAPor ;
   private java.math.BigDecimal[] H01ZI3_A14224FacCostFac ;
   private java.math.BigDecimal[] H01ZI3_A14223FacCostKgs ;
   private java.math.BigDecimal[] H01ZI3_A14222FacCostMts ;
   private java.math.BigDecimal[] H01ZI3_A434FacDtoPP ;
   private java.math.BigDecimal[] H01ZI3_A433FacDtoGen ;
   private byte[] H01ZI3_A7209Colombia ;
   private boolean[] H01ZI3_n7209Colombia ;
   private java.math.BigDecimal[] H01ZI3_A14219FacEnergia ;
   private java.math.BigDecimal[] H01ZI3_A3918FacImpTot1 ;
   private byte[] H01ZI4_A7209Colombia ;
   private boolean[] H01ZI4_n7209Colombia ;
   private java.math.BigDecimal[] H01ZI6_A3918FacImpTot1 ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class mantenimientofacturageneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01ZI3", "SELECT T1.FacObs, T1.EmprCod, T1.FacCod, T1.FacPri, T1.FacFirma, T1.FacDto, T1.FacObs2, T1.FacFpg, T1.FacDiaPag, T1.FacPer, T1.FacNumVto, T1.MeivaId, T3.CliNom, T1.CliCod, T1.FacAnulada, T1.FacSerNum, T1.FacEst, T1.FacHor, T1.FacFch, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1 FROM (((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) WHERE T1.EmprCod = ? and T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01ZI4", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01ZI6", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 5);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(18);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(23,3);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,2);
               ((byte[]) buf[31])[0] = rslt.getByte(30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(32,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

