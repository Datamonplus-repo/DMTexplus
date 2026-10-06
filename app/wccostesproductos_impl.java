package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccostesproductos_impl extends GXWebComponent
{
   public wccostesproductos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wccostesproductos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccostesproductos_impl.class ));
   }

   public wccostesproductos_impl( int remoteHandle ,
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
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
               AV6HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarCod), 8, 0));
               AV7HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarReo", GXutil.str( AV7HreBarReo, 1, 0));
               AV8HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarPar", AV8HreBarPar);
               AV9HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9HreNumCie), 2, 0));
               AV10HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreLinMaq), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,Integer.valueOf(AV6HreBarCod),Byte.valueOf(AV7HreBarReo),AV8HreBarPar,Byte.valueOf(AV9HreNumCie),Short.valueOf(AV10HreLinMaq)});
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
            {
               gxnrgrid_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
            {
               gxgrgrid_refresh_invoke( ) ;
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

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_42 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_42"))) ;
      nGXsfl_42_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_42_idx"))) ;
      sGXsfl_42_idx = httpContext.GetPar( "sGXsfl_42_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV6HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
      AV7HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
      AV8HreBarPar = httpContext.GetPar( "HreBarPar") ;
      AV9HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
      AV10HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
      AV41TFHrePrdNum = httpContext.GetPar( "TFHrePrdNum") ;
      AV42TFHrePrdNum_Sel = httpContext.GetPar( "TFHrePrdNum_Sel") ;
      AV44TFHrePrdDsc = httpContext.GetPar( "TFHrePrdDsc") ;
      AV45TFHrePrdDsc_Sel = httpContext.GetPar( "TFHrePrdDsc_Sel") ;
      AV47TFHrePrdCant = CommonUtil.decimalVal( httpContext.GetPar( "TFHrePrdCant"), ".") ;
      AV48TFHrePrdCant_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHrePrdCant_To"), ".") ;
      AV50TFHrePrdUDs = httpContext.GetPar( "TFHrePrdUDs") ;
      AV51TFHrePrdUDs_Sel = httpContext.GetPar( "TFHrePrdUDs_Sel") ;
      AV53TFHrePrePrd = CommonUtil.decimalVal( httpContext.GetPar( "TFHrePrePrd"), ".") ;
      AV54TFHrePrePrd_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHrePrePrd_To"), ".") ;
      AV56TFPrdFacCon = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdFacCon"), ".") ;
      AV57TFPrdFacCon_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdFacCon_To"), ".") ;
      AV70Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV19OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV65CantAd = CommonUtil.decimalVal( httpContext.GetPar( "CantAd"), ".") ;
      AV63TotCostelinea = CommonUtil.decimalVal( httpContext.GetPar( "TotCostelinea"), ".") ;
      AV21CosteTotCal = CommonUtil.decimalVal( httpContext.GetPar( "CosteTotCal"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV41TFHrePrdNum, AV42TFHrePrdNum_Sel, AV44TFHrePrdDsc, AV45TFHrePrdDsc_Sel, AV47TFHrePrdCant, AV48TFHrePrdCant_To, AV50TFHrePrdUDs, AV51TFHrePrdUDs_Sel, AV53TFHrePrePrd, AV54TFHrePrePrd_To, AV56TFPrdFacCon, AV57TFPrdFacCon_To, AV70Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65CantAd, AV63TotCostelinea, AV21CosteTotCal, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paT82( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Historico Recetas (Costes, detalle de Productos)", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wccostesproductos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10HreLinMaq,4,0))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTAD", getSecureSignedToken( sPrefix, localUtil.format( AV65CantAd, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTELINEA", getSecureSignedToken( sPrefix, localUtil.format( AV63TotCostelinea, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTETOTCAL", getSecureSignedToken( sPrefix, localUtil.format( AV21CosteTotCal, "ZZZZ9.99999")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCCostesProductos");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV70Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wccostesproductos:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_42", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_42, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV59DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV59DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6HreBarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV6HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7HreBarReo", GXutil.ltrim( localUtil.ntoc( wcpOAV7HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8HreBarPar", GXutil.rtrim( wcpOAV8HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9HreNumCie", GXutil.ltrim( localUtil.ntoc( wcpOAV9HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10HreLinMaq", GXutil.ltrim( localUtil.ntoc( wcpOAV10HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDNUM", GXutil.rtrim( AV41TFHrePrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDNUM_SEL", GXutil.rtrim( AV42TFHrePrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDDSC", GXutil.rtrim( AV44TFHrePrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDDSC_SEL", GXutil.rtrim( AV45TFHrePrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDCANT", GXutil.ltrim( localUtil.ntoc( AV47TFHrePrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDCANT_TO", GXutil.ltrim( localUtil.ntoc( AV48TFHrePrdCant_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDUDS", GXutil.rtrim( AV50TFHrePrdUDs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDUDS_SEL", GXutil.rtrim( AV51TFHrePrdUDs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPREPRD", GXutil.ltrim( localUtil.ntoc( AV53TFHrePrePrd, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPREPRD_TO", GXutil.ltrim( localUtil.ntoc( AV54TFHrePrePrd_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDFACCON", GXutil.ltrim( localUtil.ntoc( AV56TFPrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDFACCON_TO", GXutil.ltrim( localUtil.ntoc( AV57TFPrdFacCon_To, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV18OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV19OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV6HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV7HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARPAR", GXutil.rtrim( AV8HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV9HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRELINMAQ", GXutil.ltrim( localUtil.ntoc( AV10HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARCOD", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARREO", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARPAR", GXutil.rtrim( A4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRENUMCIE", GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRELINMAQ", GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTAD", GXutil.ltrim( localUtil.ntoc( AV65CantAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTAD", getSecureSignedToken( sPrefix, localUtil.format( AV65CantAd, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCOSTELINEA", GXutil.ltrim( localUtil.ntoc( AV63TotCostelinea, (byte)(18), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTELINEA", getSecureSignedToken( sPrefix, localUtil.format( AV63TotCostelinea, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECANANY", GXutil.ltrim( localUtil.ntoc( A4565HreCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTETOTCAL", GXutil.ltrim( localUtil.ntoc( AV21CosteTotCal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTETOTCAL", getSecureSignedToken( sPrefix, localUtil.format( AV21CosteTotCal, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
   }

   public void renderHtmlCloseFormT82( )
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
      return "WCCostesProductos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Historico Recetas (Costes, detalle de Productos)", "") ;
   }

   public void wbT80( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wccostesproductos");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 42, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCCostesProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 42, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCCostesProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_T82( true) ;
      }
      else
      {
         wb_table1_21_T82( false) ;
      }
      return  ;
   }

   public void wb_table1_21_T82e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV70Pgmname), GXutil.rtrim( localUtil.format( AV70Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCCostesProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "grid-scroll-horizontal", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol42( ) ;
      }
      if ( wbEnd == 42 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_42 = (int)(nGXsfl_42_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_55_T82( true) ;
      }
      else
      {
         wb_table2_55_T82( false) ;
      }
      return  ;
   }

   public void wb_table2_55_T82e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV59DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 42 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startT82( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Historico Recetas (Costes, detalle de Productos)", ""), (short)(0)) ;
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
            strupT80( ) ;
         }
      }
   }

   public void wsT82( )
   {
      startT82( ) ;
      evtT82( ) ;
   }

   public void evtT82( )
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
                              strupT80( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11T82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e12T82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e13T82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvaluecostelinea_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT80( ) ;
                           }
                           AV74Wccostesproductosds_1_tfhreprdnum = AV41TFHrePrdNum ;
                           AV75Wccostesproductosds_2_tfhreprdnum_sel = AV42TFHrePrdNum_Sel ;
                           AV76Wccostesproductosds_3_tfhreprddsc = AV44TFHrePrdDsc ;
                           AV77Wccostesproductosds_4_tfhreprddsc_sel = AV45TFHrePrdDsc_Sel ;
                           AV78Wccostesproductosds_5_tfhreprdcant = AV47TFHrePrdCant ;
                           AV79Wccostesproductosds_6_tfhreprdcant_to = AV48TFHrePrdCant_To ;
                           AV80Wccostesproductosds_7_tfhreprduds = AV50TFHrePrdUDs ;
                           AV81Wccostesproductosds_8_tfhreprduds_sel = AV51TFHrePrdUDs_Sel ;
                           AV82Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
                           AV83Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
                           AV84Wccostesproductosds_11_tfprdfaccon = AV56TFPrdFacCon ;
                           AV85Wccostesproductosds_12_tfprdfaccon_to = AV57TFPrdFacCon_To ;
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupT80( ) ;
                           }
                           nGXsfl_42_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_422( ) ;
                           A4558HrePrdNum = httpContext.cgiGet( edtHrePrdNum_Internalname) ;
                           n4558HrePrdNum = false ;
                           A4559HrePrdDsc = httpContext.cgiGet( edtHrePrdDsc_Internalname) ;
                           n4559HrePrdDsc = false ;
                           A4563HrePrdCant = localUtil.ctond( httpContext.cgiGet( edtHrePrdCant_Internalname)) ;
                           n4563HrePrdCant = false ;
                           AV22HrePrdCant = localUtil.ctond( httpContext.cgiGet( edtavHreprdcant_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHreprdcant_Internalname, GXutil.ltrimstr( AV22HrePrdCant, 11, 3));
                           A4561HrePrdUDs = httpContext.cgiGet( edtHrePrdUDs_Internalname) ;
                           n4561HrePrdUDs = false ;
                           AV23Costelinea = localUtil.ctond( httpContext.cgiGet( edtavCostelinea_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostelinea_Internalname, GXutil.ltrimstr( AV23Costelinea, 11, 5));
                           A4967HrePrePrd = localUtil.ctond( httpContext.cgiGet( edtHrePrePrd_Internalname)) ;
                           n4967HrePrePrd = false ;
                           A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
                           A4550HreLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4557HreRecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtHreRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = edtavTotvaluecostelinea_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e14T82 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluecostelinea_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e15T82 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluecostelinea_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e16T82 ();
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
                                    strupT80( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluecostelinea_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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

   public void weT82( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormT82( ) ;
         }
      }
   }

   public void paT82( )
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
            GX_FocusControl = edtavTotvaluecostelinea_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_422( ) ;
      while ( nGXsfl_42_idx <= nRC_GXsfl_42 )
      {
         sendrow_422( ) ;
         nGXsfl_42_idx = ((subGrid_Islastpage==1)&&(nGXsfl_42_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5EmprCod ,
                                 int AV6HreBarCod ,
                                 byte AV7HreBarReo ,
                                 String AV8HreBarPar ,
                                 byte AV9HreNumCie ,
                                 short AV10HreLinMaq ,
                                 String AV41TFHrePrdNum ,
                                 String AV42TFHrePrdNum_Sel ,
                                 String AV44TFHrePrdDsc ,
                                 String AV45TFHrePrdDsc_Sel ,
                                 java.math.BigDecimal AV47TFHrePrdCant ,
                                 java.math.BigDecimal AV48TFHrePrdCant_To ,
                                 String AV50TFHrePrdUDs ,
                                 String AV51TFHrePrdUDs_Sel ,
                                 java.math.BigDecimal AV53TFHrePrePrd ,
                                 java.math.BigDecimal AV54TFHrePrePrd_To ,
                                 java.math.BigDecimal AV56TFPrdFacCon ,
                                 java.math.BigDecimal AV57TFPrdFacCon_To ,
                                 String AV70Pgmname ,
                                 short AV18OrderedBy ,
                                 boolean AV19OrderedDsc ,
                                 java.math.BigDecimal AV65CantAd ,
                                 java.math.BigDecimal AV63TotCostelinea ,
                                 java.math.BigDecimal AV21CosteTotCal ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e15T82 ();
      GRID_nCurrentRecord = 0 ;
      rfT82( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCCostesProductos");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV70Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wccostesproductos:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfT82( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV70Pgmname = "WCCostesProductos" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavHreprdcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreprdcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprdcant_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavCostelinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostelinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostelinea_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavTotvaluecostelinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecostelinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecostelinea_Enabled), 5, 0), true);
   }

   public void rfT82( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(42) ;
      /* Execute user event: Refresh */
      e15T82 ();
      nGXsfl_42_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_422( ) ;
      bGXsfl_42_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_422( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV75Wccostesproductosds_2_tfhreprdnum_sel ,
                                              AV74Wccostesproductosds_1_tfhreprdnum ,
                                              AV77Wccostesproductosds_4_tfhreprddsc_sel ,
                                              AV76Wccostesproductosds_3_tfhreprddsc ,
                                              AV78Wccostesproductosds_5_tfhreprdcant ,
                                              AV79Wccostesproductosds_6_tfhreprdcant_to ,
                                              AV81Wccostesproductosds_8_tfhreprduds_sel ,
                                              AV80Wccostesproductosds_7_tfhreprduds ,
                                              AV82Wccostesproductosds_9_tfhrepreprd ,
                                              AV83Wccostesproductosds_10_tfhrepreprd_to ,
                                              AV84Wccostesproductosds_11_tfprdfaccon ,
                                              AV85Wccostesproductosds_12_tfprdfaccon_to ,
                                              A4558HrePrdNum ,
                                              A4559HrePrdDsc ,
                                              A4563HrePrdCant ,
                                              A4561HrePrdUDs ,
                                              A4967HrePrePrd ,
                                              A707PrdFacCon ,
                                              Short.valueOf(AV18OrderedBy) ,
                                              Boolean.valueOf(AV19OrderedDsc) ,
                                              A719PrdNum ,
                                              AV5EmprCod ,
                                              Integer.valueOf(AV6HreBarCod) ,
                                              Byte.valueOf(AV7HreBarReo) ,
                                              AV8HreBarPar ,
                                              Byte.valueOf(AV9HreNumCie) ,
                                              Short.valueOf(AV10HreLinMaq) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A4492HreBarCod) ,
                                              Byte.valueOf(A4493HreBarReo) ,
                                              A4494HreBarPar ,
                                              Byte.valueOf(A4495HreNumCie) ,
                                              Short.valueOf(A4545HreLinMaq) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                              }
         });
         lV74Wccostesproductosds_1_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV74Wccostesproductosds_1_tfhreprdnum), 6, "%") ;
         lV76Wccostesproductosds_3_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV76Wccostesproductosds_3_tfhreprddsc), 26, "%") ;
         lV80Wccostesproductosds_7_tfhreprduds = GXutil.padr( GXutil.rtrim( AV80Wccostesproductosds_7_tfhreprduds), 5, "%") ;
         /* Using cursor H00T82 */
         pr_default.execute(0, new Object[] {AV5EmprCod, Integer.valueOf(AV6HreBarCod), Byte.valueOf(AV7HreBarReo), AV8HreBarPar, Byte.valueOf(AV9HreNumCie), Short.valueOf(AV10HreLinMaq), lV74Wccostesproductosds_1_tfhreprdnum, AV75Wccostesproductosds_2_tfhreprdnum_sel, lV76Wccostesproductosds_3_tfhreprddsc, AV77Wccostesproductosds_4_tfhreprddsc_sel, AV78Wccostesproductosds_5_tfhreprdcant, AV79Wccostesproductosds_6_tfhreprdcant_to, lV80Wccostesproductosds_7_tfhreprduds, AV81Wccostesproductosds_8_tfhreprduds_sel, AV82Wccostesproductosds_9_tfhrepreprd, AV83Wccostesproductosds_10_tfhrepreprd_to, AV84Wccostesproductosds_11_tfprdfaccon, AV85Wccostesproductosds_12_tfprdfaccon_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_42_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00T82_A396EmprCod[0] ;
            A4492HreBarCod = H00T82_A4492HreBarCod[0] ;
            A4493HreBarReo = H00T82_A4493HreBarReo[0] ;
            A4494HreBarPar = H00T82_A4494HreBarPar[0] ;
            A4495HreNumCie = H00T82_A4495HreNumCie[0] ;
            A4545HreLinMaq = H00T82_A4545HreLinMaq[0] ;
            A719PrdNum = H00T82_A719PrdNum[0] ;
            n719PrdNum = H00T82_n719PrdNum[0] ;
            A4565HreCanAny = H00T82_A4565HreCanAny[0] ;
            n4565HreCanAny = H00T82_n4565HreCanAny[0] ;
            A4557HreRecLin = H00T82_A4557HreRecLin[0] ;
            A4550HreLinPro = H00T82_A4550HreLinPro[0] ;
            A707PrdFacCon = H00T82_A707PrdFacCon[0] ;
            A4967HrePrePrd = H00T82_A4967HrePrePrd[0] ;
            n4967HrePrePrd = H00T82_n4967HrePrePrd[0] ;
            A4561HrePrdUDs = H00T82_A4561HrePrdUDs[0] ;
            n4561HrePrdUDs = H00T82_n4561HrePrdUDs[0] ;
            A4563HrePrdCant = H00T82_A4563HrePrdCant[0] ;
            n4563HrePrdCant = H00T82_n4563HrePrdCant[0] ;
            A4559HrePrdDsc = H00T82_A4559HrePrdDsc[0] ;
            n4559HrePrdDsc = H00T82_n4559HrePrdDsc[0] ;
            A4558HrePrdNum = H00T82_A4558HrePrdNum[0] ;
            n4558HrePrdNum = H00T82_n4558HrePrdNum[0] ;
            A707PrdFacCon = H00T82_A707PrdFacCon[0] ;
            e16T82 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(42) ;
         wbT80( ) ;
      }
      bGXsfl_42_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesT82( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCANTAD", GXutil.ltrim( localUtil.ntoc( AV65CantAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCANTAD", getSecureSignedToken( sPrefix, localUtil.format( AV65CantAd, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCOSTELINEA", GXutil.ltrim( localUtil.ntoc( AV63TotCostelinea, (byte)(18), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTELINEA", getSecureSignedToken( sPrefix, localUtil.format( AV63TotCostelinea, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTETOTCAL", GXutil.ltrim( localUtil.ntoc( AV21CosteTotCal, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTETOTCAL", getSecureSignedToken( sPrefix, localUtil.format( AV21CosteTotCal, "ZZZZ9.99999")));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      AV74Wccostesproductosds_1_tfhreprdnum = AV41TFHrePrdNum ;
      AV75Wccostesproductosds_2_tfhreprdnum_sel = AV42TFHrePrdNum_Sel ;
      AV76Wccostesproductosds_3_tfhreprddsc = AV44TFHrePrdDsc ;
      AV77Wccostesproductosds_4_tfhreprddsc_sel = AV45TFHrePrdDsc_Sel ;
      AV78Wccostesproductosds_5_tfhreprdcant = AV47TFHrePrdCant ;
      AV79Wccostesproductosds_6_tfhreprdcant_to = AV48TFHrePrdCant_To ;
      AV80Wccostesproductosds_7_tfhreprduds = AV50TFHrePrdUDs ;
      AV81Wccostesproductosds_8_tfhreprduds_sel = AV51TFHrePrdUDs_Sel ;
      AV82Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
      AV83Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
      AV84Wccostesproductosds_11_tfprdfaccon = AV56TFPrdFacCon ;
      AV85Wccostesproductosds_12_tfprdfaccon_to = AV57TFPrdFacCon_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV75Wccostesproductosds_2_tfhreprdnum_sel ,
                                           AV74Wccostesproductosds_1_tfhreprdnum ,
                                           AV77Wccostesproductosds_4_tfhreprddsc_sel ,
                                           AV76Wccostesproductosds_3_tfhreprddsc ,
                                           AV78Wccostesproductosds_5_tfhreprdcant ,
                                           AV79Wccostesproductosds_6_tfhreprdcant_to ,
                                           AV81Wccostesproductosds_8_tfhreprduds_sel ,
                                           AV80Wccostesproductosds_7_tfhreprduds ,
                                           AV82Wccostesproductosds_9_tfhrepreprd ,
                                           AV83Wccostesproductosds_10_tfhrepreprd_to ,
                                           AV84Wccostesproductosds_11_tfprdfaccon ,
                                           AV85Wccostesproductosds_12_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           A719PrdNum ,
                                           AV5EmprCod ,
                                           Integer.valueOf(AV6HreBarCod) ,
                                           Byte.valueOf(AV7HreBarReo) ,
                                           AV8HreBarPar ,
                                           Byte.valueOf(AV9HreNumCie) ,
                                           Short.valueOf(AV10HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV74Wccostesproductosds_1_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV74Wccostesproductosds_1_tfhreprdnum), 6, "%") ;
      lV76Wccostesproductosds_3_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV76Wccostesproductosds_3_tfhreprddsc), 26, "%") ;
      lV80Wccostesproductosds_7_tfhreprduds = GXutil.padr( GXutil.rtrim( AV80Wccostesproductosds_7_tfhreprduds), 5, "%") ;
      /* Using cursor H00T83 */
      pr_default.execute(1, new Object[] {AV5EmprCod, Integer.valueOf(AV6HreBarCod), Byte.valueOf(AV7HreBarReo), AV8HreBarPar, Byte.valueOf(AV9HreNumCie), Short.valueOf(AV10HreLinMaq), lV74Wccostesproductosds_1_tfhreprdnum, AV75Wccostesproductosds_2_tfhreprdnum_sel, lV76Wccostesproductosds_3_tfhreprddsc, AV77Wccostesproductosds_4_tfhreprddsc_sel, AV78Wccostesproductosds_5_tfhreprdcant, AV79Wccostesproductosds_6_tfhreprdcant_to, lV80Wccostesproductosds_7_tfhreprduds, AV81Wccostesproductosds_8_tfhreprduds_sel, AV82Wccostesproductosds_9_tfhrepreprd, AV83Wccostesproductosds_10_tfhrepreprd_to, AV84Wccostesproductosds_11_tfprdfaccon, AV85Wccostesproductosds_12_tfprdfaccon_to});
      GRID_nRecordCount = H00T83_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      AV74Wccostesproductosds_1_tfhreprdnum = AV41TFHrePrdNum ;
      AV75Wccostesproductosds_2_tfhreprdnum_sel = AV42TFHrePrdNum_Sel ;
      AV76Wccostesproductosds_3_tfhreprddsc = AV44TFHrePrdDsc ;
      AV77Wccostesproductosds_4_tfhreprddsc_sel = AV45TFHrePrdDsc_Sel ;
      AV78Wccostesproductosds_5_tfhreprdcant = AV47TFHrePrdCant ;
      AV79Wccostesproductosds_6_tfhreprdcant_to = AV48TFHrePrdCant_To ;
      AV80Wccostesproductosds_7_tfhreprduds = AV50TFHrePrdUDs ;
      AV81Wccostesproductosds_8_tfhreprduds_sel = AV51TFHrePrdUDs_Sel ;
      AV82Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
      AV83Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
      AV84Wccostesproductosds_11_tfprdfaccon = AV56TFPrdFacCon ;
      AV85Wccostesproductosds_12_tfprdfaccon_to = AV57TFPrdFacCon_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV41TFHrePrdNum, AV42TFHrePrdNum_Sel, AV44TFHrePrdDsc, AV45TFHrePrdDsc_Sel, AV47TFHrePrdCant, AV48TFHrePrdCant_To, AV50TFHrePrdUDs, AV51TFHrePrdUDs_Sel, AV53TFHrePrePrd, AV54TFHrePrePrd_To, AV56TFPrdFacCon, AV57TFPrdFacCon_To, AV70Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65CantAd, AV63TotCostelinea, AV21CosteTotCal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV74Wccostesproductosds_1_tfhreprdnum = AV41TFHrePrdNum ;
      AV75Wccostesproductosds_2_tfhreprdnum_sel = AV42TFHrePrdNum_Sel ;
      AV76Wccostesproductosds_3_tfhreprddsc = AV44TFHrePrdDsc ;
      AV77Wccostesproductosds_4_tfhreprddsc_sel = AV45TFHrePrdDsc_Sel ;
      AV78Wccostesproductosds_5_tfhreprdcant = AV47TFHrePrdCant ;
      AV79Wccostesproductosds_6_tfhreprdcant_to = AV48TFHrePrdCant_To ;
      AV80Wccostesproductosds_7_tfhreprduds = AV50TFHrePrdUDs ;
      AV81Wccostesproductosds_8_tfhreprduds_sel = AV51TFHrePrdUDs_Sel ;
      AV82Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
      AV83Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
      AV84Wccostesproductosds_11_tfprdfaccon = AV56TFPrdFacCon ;
      AV85Wccostesproductosds_12_tfprdfaccon_to = AV57TFPrdFacCon_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV41TFHrePrdNum, AV42TFHrePrdNum_Sel, AV44TFHrePrdDsc, AV45TFHrePrdDsc_Sel, AV47TFHrePrdCant, AV48TFHrePrdCant_To, AV50TFHrePrdUDs, AV51TFHrePrdUDs_Sel, AV53TFHrePrePrd, AV54TFHrePrePrd_To, AV56TFPrdFacCon, AV57TFPrdFacCon_To, AV70Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65CantAd, AV63TotCostelinea, AV21CosteTotCal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV74Wccostesproductosds_1_tfhreprdnum = AV41TFHrePrdNum ;
      AV75Wccostesproductosds_2_tfhreprdnum_sel = AV42TFHrePrdNum_Sel ;
      AV76Wccostesproductosds_3_tfhreprddsc = AV44TFHrePrdDsc ;
      AV77Wccostesproductosds_4_tfhreprddsc_sel = AV45TFHrePrdDsc_Sel ;
      AV78Wccostesproductosds_5_tfhreprdcant = AV47TFHrePrdCant ;
      AV79Wccostesproductosds_6_tfhreprdcant_to = AV48TFHrePrdCant_To ;
      AV80Wccostesproductosds_7_tfhreprduds = AV50TFHrePrdUDs ;
      AV81Wccostesproductosds_8_tfhreprduds_sel = AV51TFHrePrdUDs_Sel ;
      AV82Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
      AV83Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
      AV84Wccostesproductosds_11_tfprdfaccon = AV56TFPrdFacCon ;
      AV85Wccostesproductosds_12_tfprdfaccon_to = AV57TFPrdFacCon_To ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV41TFHrePrdNum, AV42TFHrePrdNum_Sel, AV44TFHrePrdDsc, AV45TFHrePrdDsc_Sel, AV47TFHrePrdCant, AV48TFHrePrdCant_To, AV50TFHrePrdUDs, AV51TFHrePrdUDs_Sel, AV53TFHrePrePrd, AV54TFHrePrePrd_To, AV56TFPrdFacCon, AV57TFPrdFacCon_To, AV70Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65CantAd, AV63TotCostelinea, AV21CosteTotCal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV74Wccostesproductosds_1_tfhreprdnum = AV41TFHrePrdNum ;
      AV75Wccostesproductosds_2_tfhreprdnum_sel = AV42TFHrePrdNum_Sel ;
      AV76Wccostesproductosds_3_tfhreprddsc = AV44TFHrePrdDsc ;
      AV77Wccostesproductosds_4_tfhreprddsc_sel = AV45TFHrePrdDsc_Sel ;
      AV78Wccostesproductosds_5_tfhreprdcant = AV47TFHrePrdCant ;
      AV79Wccostesproductosds_6_tfhreprdcant_to = AV48TFHrePrdCant_To ;
      AV80Wccostesproductosds_7_tfhreprduds = AV50TFHrePrdUDs ;
      AV81Wccostesproductosds_8_tfhreprduds_sel = AV51TFHrePrdUDs_Sel ;
      AV82Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
      AV83Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
      AV84Wccostesproductosds_11_tfprdfaccon = AV56TFPrdFacCon ;
      AV85Wccostesproductosds_12_tfprdfaccon_to = AV57TFPrdFacCon_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV41TFHrePrdNum, AV42TFHrePrdNum_Sel, AV44TFHrePrdDsc, AV45TFHrePrdDsc_Sel, AV47TFHrePrdCant, AV48TFHrePrdCant_To, AV50TFHrePrdUDs, AV51TFHrePrdUDs_Sel, AV53TFHrePrePrd, AV54TFHrePrePrd_To, AV56TFPrdFacCon, AV57TFPrdFacCon_To, AV70Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65CantAd, AV63TotCostelinea, AV21CosteTotCal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV74Wccostesproductosds_1_tfhreprdnum = AV41TFHrePrdNum ;
      AV75Wccostesproductosds_2_tfhreprdnum_sel = AV42TFHrePrdNum_Sel ;
      AV76Wccostesproductosds_3_tfhreprddsc = AV44TFHrePrdDsc ;
      AV77Wccostesproductosds_4_tfhreprddsc_sel = AV45TFHrePrdDsc_Sel ;
      AV78Wccostesproductosds_5_tfhreprdcant = AV47TFHrePrdCant ;
      AV79Wccostesproductosds_6_tfhreprdcant_to = AV48TFHrePrdCant_To ;
      AV80Wccostesproductosds_7_tfhreprduds = AV50TFHrePrdUDs ;
      AV81Wccostesproductosds_8_tfhreprduds_sel = AV51TFHrePrdUDs_Sel ;
      AV82Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
      AV83Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
      AV84Wccostesproductosds_11_tfprdfaccon = AV56TFPrdFacCon ;
      AV85Wccostesproductosds_12_tfprdfaccon_to = AV57TFPrdFacCon_To ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV41TFHrePrdNum, AV42TFHrePrdNum_Sel, AV44TFHrePrdDsc, AV45TFHrePrdDsc_Sel, AV47TFHrePrdCant, AV48TFHrePrdCant_To, AV50TFHrePrdUDs, AV51TFHrePrdUDs_Sel, AV53TFHrePrePrd, AV54TFHrePrePrd_To, AV56TFPrdFacCon, AV57TFPrdFacCon_To, AV70Pgmname, AV18OrderedBy, AV19OrderedDsc, AV65CantAd, AV63TotCostelinea, AV21CosteTotCal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV70Pgmname = "WCCostesProductos" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavHreprdcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreprdcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprdcant_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavCostelinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostelinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostelinea_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavTotvaluecostelinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecostelinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecostelinea_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupT80( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e14T82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV59DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_42 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_42"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV6HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV8HreBarPar") ;
         wcpOAV9HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         AV70Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
         AV64TotValueCostelinea = httpContext.cgiGet( edtavTotvaluecostelinea_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TotValueCostelinea", AV64TotValueCostelinea);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCCostesProductos");
         AV70Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV70Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wccostesproductos:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e14T82 ();
      if (returnInSub) return;
   }

   public void e14T82( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV71Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wccostesproductos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV71Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV72Emprnom ;
      GXv_char4[0] = AV73Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char2, GXv_char3, GXv_char4) ;
      wccostesproductos_impl.this.AV5EmprCod = GXv_char2[0] ;
      wccostesproductos_impl.this.AV72Emprnom = GXv_char3[0] ;
      wccostesproductos_impl.this.AV73Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV18OrderedBy < 1 )
      {
         AV18OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV59DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV59DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
   }

   public void e15T82( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV12WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV74Wccostesproductosds_1_tfhreprdnum = AV41TFHrePrdNum ;
      AV75Wccostesproductosds_2_tfhreprdnum_sel = AV42TFHrePrdNum_Sel ;
      AV76Wccostesproductosds_3_tfhreprddsc = AV44TFHrePrdDsc ;
      AV77Wccostesproductosds_4_tfhreprddsc_sel = AV45TFHrePrdDsc_Sel ;
      AV78Wccostesproductosds_5_tfhreprdcant = AV47TFHrePrdCant ;
      AV79Wccostesproductosds_6_tfhreprdcant_to = AV48TFHrePrdCant_To ;
      AV80Wccostesproductosds_7_tfhreprduds = AV50TFHrePrdUDs ;
      AV81Wccostesproductosds_8_tfhreprduds_sel = AV51TFHrePrdUDs_Sel ;
      AV82Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
      AV83Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
      AV84Wccostesproductosds_11_tfprdfaccon = AV56TFPrdFacCon ;
      AV85Wccostesproductosds_12_tfprdfaccon_to = AV57TFPrdFacCon_To ;
      /*  Sending Event outputs  */
   }

   public void e11T82( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV18OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         AV19OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrdNum") == 0 )
         {
            AV41TFHrePrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFHrePrdNum", AV41TFHrePrdNum);
            AV42TFHrePrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHrePrdNum_Sel", AV42TFHrePrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrdDsc") == 0 )
         {
            AV44TFHrePrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHrePrdDsc", AV44TFHrePrdDsc);
            AV45TFHrePrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHrePrdDsc_Sel", AV45TFHrePrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrdCant") == 0 )
         {
            AV47TFHrePrdCant = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHrePrdCant", GXutil.ltrimstr( AV47TFHrePrdCant, 11, 3));
            AV48TFHrePrdCant_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHrePrdCant_To", GXutil.ltrimstr( AV48TFHrePrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrdUDs") == 0 )
         {
            AV50TFHrePrdUDs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFHrePrdUDs", AV50TFHrePrdUDs);
            AV51TFHrePrdUDs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFHrePrdUDs_Sel", AV51TFHrePrdUDs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrePrd") == 0 )
         {
            AV53TFHrePrePrd = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFHrePrePrd", GXutil.ltrimstr( AV53TFHrePrePrd, 14, 5));
            AV54TFHrePrePrd_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFHrePrePrd_To", GXutil.ltrimstr( AV54TFHrePrePrd_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdFacCon") == 0 )
         {
            AV56TFPrdFacCon = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdFacCon", GXutil.ltrimstr( AV56TFPrdFacCon, 7, 4));
            AV57TFPrdFacCon_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPrdFacCon_To", GXutil.ltrimstr( AV57TFPrdFacCon_To, 7, 4));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e16T82( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV22HrePrdCant = ((A4565HreCanAny.doubleValue()>0) ? A4565HreCanAny : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHreprdcant_Internalname, GXutil.ltrimstr( AV22HrePrdCant, 11, 3));
      AV23Costelinea = GXutil.roundDecimal( (A4563HrePrdCant.add(AV65CantAd)).multiply(A707PrdFacCon).multiply(A4967HrePrePrd).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostelinea_Internalname, GXutil.ltrimstr( AV23Costelinea, 11, 5));
      AV21CosteTotCal = AV21CosteTotCal.add(AV23Costelinea) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21CosteTotCal", GXutil.ltrimstr( AV21CosteTotCal, 11, 5));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOSTETOTCAL", getSecureSignedToken( sPrefix, localUtil.format( AV21CosteTotCal, "ZZZZ9.99999")));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(42) ;
      }
      sendrow_422( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_42_Refreshing )
      {
         httpContext.doAjaxLoad(42, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e12T82( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV24ExcelFilename ;
      GXv_char3[0] = AV25ErrorMessage ;
      new app.wccostesproductosexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wccostesproductos_impl.this.AV24ExcelFilename = GXv_char4[0] ;
      wccostesproductos_impl.this.AV25ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV24ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV24ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV25ErrorMessage);
      }
   }

   public void e13T82( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wccostesproductosexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV18OrderedBy, 4, 0))+":"+(AV19OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV30Session.getValue(AV70Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV70Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV30Session.getValue(AV70Pgmname+"GridState"), null, null);
      }
      AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
      AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV86GXV1 = 1 ;
      while ( AV86GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV86GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV41TFHrePrdNum = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFHrePrdNum", AV41TFHrePrdNum);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV42TFHrePrdNum_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHrePrdNum_Sel", AV42TFHrePrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV44TFHrePrdDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHrePrdDsc", AV44TFHrePrdDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV45TFHrePrdDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHrePrdDsc_Sel", AV45TFHrePrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV47TFHrePrdCant = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHrePrdCant", GXutil.ltrimstr( AV47TFHrePrdCant, 11, 3));
            AV48TFHrePrdCant_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHrePrdCant_To", GXutil.ltrimstr( AV48TFHrePrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV50TFHrePrdUDs = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFHrePrdUDs", AV50TFHrePrdUDs);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV51TFHrePrdUDs_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFHrePrdUDs_Sel", AV51TFHrePrdUDs_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPREPRD") == 0 )
         {
            AV53TFHrePrePrd = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFHrePrePrd", GXutil.ltrimstr( AV53TFHrePrePrd, 14, 5));
            AV54TFHrePrePrd_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFHrePrePrd_To", GXutil.ltrimstr( AV54TFHrePrePrd_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV56TFPrdFacCon = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdFacCon", GXutil.ltrimstr( AV56TFPrdFacCon, 7, 4));
            AV57TFPrdFacCon_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPrdFacCon_To", GXutil.ltrimstr( AV57TFPrdFacCon_To, 7, 4));
         }
         AV86GXV1 = (int)(AV86GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFHrePrdNum_Sel)==0), AV42TFHrePrdNum_Sel, GXv_char4) ;
      wccostesproductos_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFHrePrdDsc_Sel)==0), AV45TFHrePrdDsc_Sel, GXv_char3) ;
      wccostesproductos_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char9 = "" ;
      GXv_char2[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFHrePrdUDs_Sel)==0), AV51TFHrePrdUDs_Sel, GXv_char2) ;
      wccostesproductos_impl.this.GXt_char9 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char8+"||"+GXt_char9+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char9 = "" ;
      GXv_char4[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFHrePrdNum)==0), AV41TFHrePrdNum, GXv_char4) ;
      wccostesproductos_impl.this.GXt_char9 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFHrePrdDsc)==0), AV44TFHrePrdDsc, GXv_char3) ;
      wccostesproductos_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFHrePrdUDs)==0), AV50TFHrePrdUDs, GXv_char2) ;
      wccostesproductos_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char9+"|"+GXt_char8+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFHrePrdCant)==0) ? "" : GXutil.str( AV47TFHrePrdCant, 11, 3))+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFHrePrePrd)==0) ? "" : GXutil.str( AV53TFHrePrePrd, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdFacCon)==0) ? "" : GXutil.str( AV56TFPrdFacCon, 7, 4)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFHrePrdCant_To)==0) ? "" : GXutil.str( AV48TFHrePrdCant_To, 11, 3))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFHrePrePrd_To)==0) ? "" : GXutil.str( AV54TFHrePrePrd_To, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPrdFacCon_To)==0) ? "" : GXutil.str( AV57TFPrdFacCon_To, 7, 4)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV30Session.getValue(AV70Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV18OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV19OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHREPRDNUM", "", !(GXutil.strcmp("", AV41TFHrePrdNum)==0), (short)(0), AV41TFHrePrdNum, "", !(GXutil.strcmp("", AV42TFHrePrdNum_Sel)==0), AV42TFHrePrdNum_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHREPRDDSC", "", !(GXutil.strcmp("", AV44TFHrePrdDsc)==0), (short)(0), AV44TFHrePrdDsc, "", !(GXutil.strcmp("", AV45TFHrePrdDsc_Sel)==0), AV45TFHrePrdDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHREPRDCANT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFHrePrdCant)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFHrePrdCant_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV47TFHrePrdCant, 11, 3)), GXutil.trim( GXutil.str( AV48TFHrePrdCant_To, 11, 3))) ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHREPRDUDS", "", !(GXutil.strcmp("", AV50TFHrePrdUDs)==0), (short)(0), AV50TFHrePrdUDs, "", !(GXutil.strcmp("", AV51TFHrePrdUDs_Sel)==0), AV51TFHrePrdUDs_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHREPREPRD", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFHrePrePrd)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFHrePrePrd_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV53TFHrePrePrd, 14, 5)), GXutil.trim( GXutil.str( AV54TFHrePrePrd_To, 14, 5))) ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFPRDFACCON", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdFacCon)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPrdFacCon_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV56TFPrdFacCon, 7, 4)), GXutil.trim( GXutil.str( AV57TFPrdFacCon_To, 7, 4))) ;
      AV16GridState = GXv_SdtWWPGridState10[0] ;
      if ( ! (GXutil.strcmp("", AV5EmprCod)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5EmprCod );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV6HreBarCod) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6HreBarCod, 8, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV7HreBarReo) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARREO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV7HreBarReo, 1, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8HreBarPar)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARPAR" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8HreBarPar );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV9HreNumCie) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRENUMCIE" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9HreNumCie, 2, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV10HreLinMaq) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRELINMAQ" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10HreLinMaq, 4, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV70Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV14TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV70Pgmname );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "THISLRE" );
      AV30Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV63TotCostelinea = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TotCostelinea", GXutil.ltrimstr( AV63TotCostelinea, 18, 5));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTELINEA", getSecureSignedToken( sPrefix, localUtil.format( AV63TotCostelinea, "ZZZZ9.99999")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV74Wccostesproductosds_1_tfhreprdnum = AV41TFHrePrdNum ;
      AV75Wccostesproductosds_2_tfhreprdnum_sel = AV42TFHrePrdNum_Sel ;
      AV76Wccostesproductosds_3_tfhreprddsc = AV44TFHrePrdDsc ;
      AV77Wccostesproductosds_4_tfhreprddsc_sel = AV45TFHrePrdDsc_Sel ;
      AV78Wccostesproductosds_5_tfhreprdcant = AV47TFHrePrdCant ;
      AV79Wccostesproductosds_6_tfhreprdcant_to = AV48TFHrePrdCant_To ;
      AV80Wccostesproductosds_7_tfhreprduds = AV50TFHrePrdUDs ;
      AV81Wccostesproductosds_8_tfhreprduds_sel = AV51TFHrePrdUDs_Sel ;
      AV82Wccostesproductosds_9_tfhrepreprd = AV53TFHrePrePrd ;
      AV83Wccostesproductosds_10_tfhrepreprd_to = AV54TFHrePrePrd_To ;
      AV84Wccostesproductosds_11_tfprdfaccon = AV56TFPrdFacCon ;
      AV85Wccostesproductosds_12_tfprdfaccon_to = AV57TFPrdFacCon_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV75Wccostesproductosds_2_tfhreprdnum_sel ,
                                           AV74Wccostesproductosds_1_tfhreprdnum ,
                                           AV77Wccostesproductosds_4_tfhreprddsc_sel ,
                                           AV76Wccostesproductosds_3_tfhreprddsc ,
                                           AV78Wccostesproductosds_5_tfhreprdcant ,
                                           AV79Wccostesproductosds_6_tfhreprdcant_to ,
                                           AV81Wccostesproductosds_8_tfhreprduds_sel ,
                                           AV80Wccostesproductosds_7_tfhreprduds ,
                                           AV82Wccostesproductosds_9_tfhrepreprd ,
                                           AV83Wccostesproductosds_10_tfhrepreprd_to ,
                                           AV84Wccostesproductosds_11_tfprdfaccon ,
                                           AV85Wccostesproductosds_12_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           A719PrdNum ,
                                           AV5EmprCod ,
                                           Integer.valueOf(AV6HreBarCod) ,
                                           Byte.valueOf(AV7HreBarReo) ,
                                           AV8HreBarPar ,
                                           Byte.valueOf(AV9HreNumCie) ,
                                           Short.valueOf(AV10HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV74Wccostesproductosds_1_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV74Wccostesproductosds_1_tfhreprdnum), 6, "%") ;
      lV76Wccostesproductosds_3_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV76Wccostesproductosds_3_tfhreprddsc), 26, "%") ;
      lV80Wccostesproductosds_7_tfhreprduds = GXutil.padr( GXutil.rtrim( AV80Wccostesproductosds_7_tfhreprduds), 5, "%") ;
      /* Using cursor H00T84 */
      pr_default.execute(2, new Object[] {AV5EmprCod, Integer.valueOf(AV6HreBarCod), Byte.valueOf(AV7HreBarReo), AV8HreBarPar, Byte.valueOf(AV9HreNumCie), Short.valueOf(AV10HreLinMaq), lV74Wccostesproductosds_1_tfhreprdnum, AV75Wccostesproductosds_2_tfhreprdnum_sel, lV76Wccostesproductosds_3_tfhreprddsc, AV77Wccostesproductosds_4_tfhreprddsc_sel, AV78Wccostesproductosds_5_tfhreprdcant, AV79Wccostesproductosds_6_tfhreprdcant_to, lV80Wccostesproductosds_7_tfhreprduds, AV81Wccostesproductosds_8_tfhreprduds_sel, AV82Wccostesproductosds_9_tfhrepreprd, AV83Wccostesproductosds_10_tfhrepreprd_to, AV84Wccostesproductosds_11_tfprdfaccon, AV85Wccostesproductosds_12_tfprdfaccon_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = H00T84_A719PrdNum[0] ;
         n719PrdNum = H00T84_n719PrdNum[0] ;
         A4545HreLinMaq = H00T84_A4545HreLinMaq[0] ;
         A4495HreNumCie = H00T84_A4495HreNumCie[0] ;
         A4494HreBarPar = H00T84_A4494HreBarPar[0] ;
         A4493HreBarReo = H00T84_A4493HreBarReo[0] ;
         A4492HreBarCod = H00T84_A4492HreBarCod[0] ;
         A396EmprCod = H00T84_A396EmprCod[0] ;
         A707PrdFacCon = H00T84_A707PrdFacCon[0] ;
         A4967HrePrePrd = H00T84_A4967HrePrePrd[0] ;
         n4967HrePrePrd = H00T84_n4967HrePrePrd[0] ;
         A4561HrePrdUDs = H00T84_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = H00T84_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = H00T84_A4563HrePrdCant[0] ;
         n4563HrePrdCant = H00T84_n4563HrePrdCant[0] ;
         A4559HrePrdDsc = H00T84_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = H00T84_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = H00T84_A4558HrePrdNum[0] ;
         n4558HrePrdNum = H00T84_n4558HrePrdNum[0] ;
         A707PrdFacCon = H00T84_A707PrdFacCon[0] ;
         AV23Costelinea = GXutil.roundDecimal( (A4563HrePrdCant.add(AV65CantAd)).multiply(A707PrdFacCon).multiply(A4967HrePrePrd).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostelinea_Internalname, GXutil.ltrimstr( AV23Costelinea, 11, 5));
         AV63TotCostelinea = AV23Costelinea.add(AV63TotCostelinea) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TotCostelinea", GXutil.ltrimstr( AV63TotCostelinea, 18, 5));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTELINEA", getSecureSignedToken( sPrefix, localUtil.format( AV63TotCostelinea, "ZZZZ9.99999")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV64TotValueCostelinea = localUtil.format( AV63TotCostelinea, "ZZZZ9.99999") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TotValueCostelinea", AV64TotValueCostelinea);
   }

   public void wb_table2_55_T82( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecostelinea_Internalname, httpContext.getMessage( "Tot Value Costelinea", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'" + sGXsfl_42_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecostelinea_Internalname, AV64TotValueCostelinea, GXutil.rtrim( localUtil.format( AV64TotValueCostelinea, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecostelinea_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecostelinea_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCCostesProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_55_T82e( true) ;
      }
      else
      {
         wb_table2_55_T82e( false) ;
      }
   }

   public void wb_table1_21_T82( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_T82e( true) ;
      }
      else
      {
         wb_table1_21_T82e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      AV6HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarCod), 8, 0));
      AV7HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarReo", GXutil.str( AV7HreBarReo, 1, 0));
      AV8HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarPar", AV8HreBarPar);
      AV9HreNumCie = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9HreNumCie), 2, 0));
      AV10HreLinMaq = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreLinMaq), 4, 0));
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
      paT82( ) ;
      wsT82( ) ;
      weT82( ) ;
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
      sCtrlAV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6HreBarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7HreBarReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9HreNumCie = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV10HreLinMaq = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paT82( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wccostesproductos", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paT82( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         AV6HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarCod), 8, 0));
         AV7HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarReo", GXutil.str( AV7HreBarReo, 1, 0));
         AV8HreBarPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarPar", AV8HreBarPar);
         AV9HreNumCie = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9HreNumCie), 2, 0));
         AV10HreLinMaq = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreLinMaq), 4, 0));
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV6HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV8HreBarPar") ;
      wcpOAV9HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( AV6HreBarCod != wcpOAV6HreBarCod ) || ( AV7HreBarReo != wcpOAV7HreBarReo ) || ( GXutil.strcmp(AV8HreBarPar, wcpOAV8HreBarPar) != 0 ) || ( AV9HreNumCie != wcpOAV9HreNumCie ) || ( AV10HreLinMaq != wcpOAV10HreLinMaq ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV6HreBarCod = AV6HreBarCod ;
      wcpOAV7HreBarReo = AV7HreBarReo ;
      wcpOAV8HreBarPar = AV8HreBarPar ;
      wcpOAV9HreNumCie = AV9HreNumCie ;
      wcpOAV10HreLinMaq = AV10HreLinMaq ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5EmprCod) > 0 )
      {
         AV5EmprCod = httpContext.cgiGet( sCtrlAV5EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      }
      else
      {
         AV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_PARM") ;
      }
      sCtrlAV6HreBarCod = httpContext.cgiGet( sPrefix+"AV6HreBarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV6HreBarCod) > 0 )
      {
         AV6HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6HreBarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarCod), 8, 0));
      }
      else
      {
         AV6HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6HreBarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7HreBarReo = httpContext.cgiGet( sPrefix+"AV7HreBarReo_CTRL") ;
      if ( GXutil.len( sCtrlAV7HreBarReo) > 0 )
      {
         AV7HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7HreBarReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarReo", GXutil.str( AV7HreBarReo, 1, 0));
      }
      else
      {
         AV7HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7HreBarReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8HreBarPar = httpContext.cgiGet( sPrefix+"AV8HreBarPar_CTRL") ;
      if ( GXutil.len( sCtrlAV8HreBarPar) > 0 )
      {
         AV8HreBarPar = httpContext.cgiGet( sCtrlAV8HreBarPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarPar", AV8HreBarPar);
      }
      else
      {
         AV8HreBarPar = httpContext.cgiGet( sPrefix+"AV8HreBarPar_PARM") ;
      }
      sCtrlAV9HreNumCie = httpContext.cgiGet( sPrefix+"AV9HreNumCie_CTRL") ;
      if ( GXutil.len( sCtrlAV9HreNumCie) > 0 )
      {
         AV9HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9HreNumCie), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9HreNumCie), 2, 0));
      }
      else
      {
         AV9HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9HreNumCie_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10HreLinMaq = httpContext.cgiGet( sPrefix+"AV10HreLinMaq_CTRL") ;
      if ( GXutil.len( sCtrlAV10HreLinMaq) > 0 )
      {
         AV10HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10HreLinMaq), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreLinMaq), 4, 0));
      }
      else
      {
         AV10HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10HreLinMaq_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      paT82( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsT82( ) ;
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
      wsT82( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_PARM", GXutil.rtrim( AV5EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_CTRL", GXutil.rtrim( sCtrlAV5EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HreBarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV6HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6HreBarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6HreBarCod_CTRL", GXutil.rtrim( sCtrlAV6HreBarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7HreBarReo_PARM", GXutil.ltrim( localUtil.ntoc( AV7HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7HreBarReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7HreBarReo_CTRL", GXutil.rtrim( sCtrlAV7HreBarReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HreBarPar_PARM", GXutil.rtrim( AV8HreBarPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8HreBarPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HreBarPar_CTRL", GXutil.rtrim( sCtrlAV8HreBarPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HreNumCie_PARM", GXutil.ltrim( localUtil.ntoc( AV9HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9HreNumCie)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HreNumCie_CTRL", GXutil.rtrim( sCtrlAV9HreNumCie));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HreLinMaq_PARM", GXutil.ltrim( localUtil.ntoc( AV10HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10HreLinMaq)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HreLinMaq_CTRL", GXutil.rtrim( sCtrlAV10HreLinMaq));
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
      weT82( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115564639", true, true);
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
      httpContext.AddJavascriptSource("wccostesproductos.js", "?202682115564639", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_422( )
   {
      edtHrePrdNum_Internalname = sPrefix+"HREPRDNUM_"+sGXsfl_42_idx ;
      edtHrePrdDsc_Internalname = sPrefix+"HREPRDDSC_"+sGXsfl_42_idx ;
      edtHrePrdCant_Internalname = sPrefix+"HREPRDCANT_"+sGXsfl_42_idx ;
      edtavHreprdcant_Internalname = sPrefix+"vHREPRDCANT_"+sGXsfl_42_idx ;
      edtHrePrdUDs_Internalname = sPrefix+"HREPRDUDS_"+sGXsfl_42_idx ;
      edtavCostelinea_Internalname = sPrefix+"vCOSTELINEA_"+sGXsfl_42_idx ;
      edtHrePrePrd_Internalname = sPrefix+"HREPREPRD_"+sGXsfl_42_idx ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON_"+sGXsfl_42_idx ;
      edtHreLinPro_Internalname = sPrefix+"HRELINPRO_"+sGXsfl_42_idx ;
      edtHreRecLin_Internalname = sPrefix+"HRERECLIN_"+sGXsfl_42_idx ;
   }

   public void subsflControlProps_fel_422( )
   {
      edtHrePrdNum_Internalname = sPrefix+"HREPRDNUM_"+sGXsfl_42_fel_idx ;
      edtHrePrdDsc_Internalname = sPrefix+"HREPRDDSC_"+sGXsfl_42_fel_idx ;
      edtHrePrdCant_Internalname = sPrefix+"HREPRDCANT_"+sGXsfl_42_fel_idx ;
      edtavHreprdcant_Internalname = sPrefix+"vHREPRDCANT_"+sGXsfl_42_fel_idx ;
      edtHrePrdUDs_Internalname = sPrefix+"HREPRDUDS_"+sGXsfl_42_fel_idx ;
      edtavCostelinea_Internalname = sPrefix+"vCOSTELINEA_"+sGXsfl_42_fel_idx ;
      edtHrePrePrd_Internalname = sPrefix+"HREPREPRD_"+sGXsfl_42_fel_idx ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON_"+sGXsfl_42_fel_idx ;
      edtHreLinPro_Internalname = sPrefix+"HRELINPRO_"+sGXsfl_42_fel_idx ;
      edtHreRecLin_Internalname = sPrefix+"HRERECLIN_"+sGXsfl_42_fel_idx ;
   }

   public void sendrow_422( )
   {
      subsflControlProps_422( ) ;
      wbT80( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_42_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_42_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithTotalizer GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_42_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdNum_Internalname,GXutil.rtrim( A4558HrePrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdDsc_Internalname,GXutil.rtrim( A4559HrePrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A4563HrePrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4563HrePrdCant, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHreprdcant_Internalname,GXutil.ltrim( localUtil.ntoc( AV22HrePrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHreprdcant_Enabled!=0) ? localUtil.format( AV22HrePrdCant, "ZZZZZZ9.999") : localUtil.format( AV22HrePrdCant, "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHreprdcant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHreprdcant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdUDs_Internalname,GXutil.rtrim( A4561HrePrdUDs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdUDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostelinea_Internalname,GXutil.ltrim( localUtil.ntoc( AV23Costelinea, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostelinea_Enabled!=0) ? localUtil.format( AV23Costelinea, "ZZZZ9.99999") : localUtil.format( AV23Costelinea, "ZZZZ9.99999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostelinea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCostelinea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrePrd_Internalname,GXutil.ltrim( localUtil.ntoc( A4967HrePrePrd, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4967HrePrePrd, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrePrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A707PrdFacCon, "Z9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4550HreLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4557HreRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4557HreRecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesT82( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_42_idx = ((subGrid_Islastpage==1)&&(nGXsfl_42_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
      }
      /* End function sendrow_422 */
   }

   public void startgridcontrol42( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"42\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Ad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "##") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4558HrePrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4559HrePrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4563HrePrdCant, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22HrePrdCant, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHreprdcant_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4561HrePrdUDs));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23Costelinea, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostelinea_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4967HrePrePrd, (byte)(14), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4550HreLinPro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4557HreRecLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      edtHrePrdNum_Internalname = sPrefix+"HREPRDNUM" ;
      edtHrePrdDsc_Internalname = sPrefix+"HREPRDDSC" ;
      edtHrePrdCant_Internalname = sPrefix+"HREPRDCANT" ;
      edtavHreprdcant_Internalname = sPrefix+"vHREPRDCANT" ;
      edtHrePrdUDs_Internalname = sPrefix+"HREPRDUDS" ;
      edtavCostelinea_Internalname = sPrefix+"vCOSTELINEA" ;
      edtHrePrePrd_Internalname = sPrefix+"HREPREPRD" ;
      edtPrdFacCon_Internalname = sPrefix+"PRDFACCON" ;
      edtHreLinPro_Internalname = sPrefix+"HRELINPRO" ;
      edtHreRecLin_Internalname = sPrefix+"HRERECLIN" ;
      edtavTotvaluecostelinea_Internalname = sPrefix+"vTOTVALUECOSTELINEA" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      divGridtablewithtotalizers_Internalname = sPrefix+"GRIDTABLEWITHTOTALIZERS" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtHreRecLin_Jsonclick = "" ;
      edtHreLinPro_Jsonclick = "" ;
      edtPrdFacCon_Jsonclick = "" ;
      edtHrePrePrd_Jsonclick = "" ;
      edtavCostelinea_Jsonclick = "" ;
      edtavCostelinea_Enabled = 0 ;
      edtHrePrdUDs_Jsonclick = "" ;
      edtavHreprdcant_Jsonclick = "" ;
      edtavHreprdcant_Enabled = 0 ;
      edtHrePrdCant_Jsonclick = "" ;
      edtHrePrdDsc_Jsonclick = "" ;
      edtHrePrdNum_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluecostelinea_Jsonclick = "" ;
      edtavTotvaluecostelinea_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_grid_Datalistproc = "WCCostesProductosGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||Dynamic||" ;
      Ddo_grid_Includedatalist = "T|T||T||" ;
      Ddo_grid_Filterisrange = "||T||T|T" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "0:HrePrdNum|1:HrePrdDsc|2:HrePrdCant|4:HrePrdUDs|6:HrePrePrd|7:PrdFacCon" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      subGrid_Rows = 50 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV41TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV42TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV44TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV45TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV47TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV48TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV51TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV53TFHrePrePrd',fld:'vTFHREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV54TFHrePrePrd_To',fld:'vTFHREPREPRD_TO',pic:'ZZZZZZZ9.999'},{av:'AV56TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV57TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A4967HrePrePrd',fld:'HREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV65CantAd',fld:'vCANTAD',pic:'ZZZZZZ9.99',hsh:true},{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true},{av:'AV21CosteTotCal',fld:'vCOSTETOTCAL',pic:'ZZZZ9.99999',hsh:true},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true},{av:'AV23Costelinea',fld:'vCOSTELINEA',pic:'ZZZZ9.99999'},{av:'AV64TotValueCostelinea',fld:'vTOTVALUECOSTELINEA',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e11T82',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV41TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV42TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV44TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV45TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV47TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV48TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV51TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV53TFHrePrePrd',fld:'vTFHREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV54TFHrePrePrd_To',fld:'vTFHREPREPRD_TO',pic:'ZZZZZZZ9.999'},{av:'AV56TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV57TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65CantAd',fld:'vCANTAD',pic:'ZZZZZZ9.99',hsh:true},{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true},{av:'AV21CosteTotCal',fld:'vCOSTETOTCAL',pic:'ZZZZ9.99999',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV57TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV53TFHrePrePrd',fld:'vTFHREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV54TFHrePrePrd_To',fld:'vTFHREPREPRD_TO',pic:'ZZZZZZZ9.999'},{av:'AV50TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV51TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV47TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV48TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV45TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV41TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV42TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e16T82',iparms:[{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV65CantAd',fld:'vCANTAD',pic:'ZZZZZZ9.99',hsh:true},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A4967HrePrePrd',fld:'HREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV21CosteTotCal',fld:'vCOSTETOTCAL',pic:'ZZZZ9.99999',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV22HrePrdCant',fld:'vHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV23Costelinea',fld:'vCOSTELINEA',pic:'ZZZZ9.99999'},{av:'AV21CosteTotCal',fld:'vCOSTETOTCAL',pic:'ZZZZ9.99999',hsh:true}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e12T82',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e13T82',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21CosteTotCal',fld:'vCOSTETOTCAL',pic:'ZZZZ9.99999',hsh:true},{av:'sPrefix'},{av:'AV41TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV42TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV44TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV45TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV47TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV48TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV51TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV53TFHrePrePrd',fld:'vTFHREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV54TFHrePrePrd_To',fld:'vTFHREPREPRD_TO',pic:'ZZZZZZZ9.999'},{av:'AV56TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV57TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV65CantAd',fld:'vCANTAD',pic:'ZZZZZZ9.99',hsh:true},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A4967HrePrePrd',fld:'HREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true},{av:'AV23Costelinea',fld:'vCOSTELINEA',pic:'ZZZZ9.99999'},{av:'AV64TotValueCostelinea',fld:'vTOTVALUECOSTELINEA',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21CosteTotCal',fld:'vCOSTETOTCAL',pic:'ZZZZ9.99999',hsh:true},{av:'sPrefix'},{av:'AV41TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV42TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV44TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV45TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV47TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV48TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV51TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV53TFHrePrePrd',fld:'vTFHREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV54TFHrePrePrd_To',fld:'vTFHREPREPRD_TO',pic:'ZZZZZZZ9.999'},{av:'AV56TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV57TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV65CantAd',fld:'vCANTAD',pic:'ZZZZZZ9.99',hsh:true},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A4967HrePrePrd',fld:'HREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true},{av:'AV23Costelinea',fld:'vCOSTELINEA',pic:'ZZZZ9.99999'},{av:'AV64TotValueCostelinea',fld:'vTOTVALUECOSTELINEA',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21CosteTotCal',fld:'vCOSTETOTCAL',pic:'ZZZZ9.99999',hsh:true},{av:'sPrefix'},{av:'AV41TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV42TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV44TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV45TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV47TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV48TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV51TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV53TFHrePrePrd',fld:'vTFHREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV54TFHrePrePrd_To',fld:'vTFHREPREPRD_TO',pic:'ZZZZZZZ9.999'},{av:'AV56TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV57TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV65CantAd',fld:'vCANTAD',pic:'ZZZZZZ9.99',hsh:true},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A4967HrePrePrd',fld:'HREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true},{av:'AV23Costelinea',fld:'vCOSTELINEA',pic:'ZZZZ9.99999'},{av:'AV64TotValueCostelinea',fld:'vTOTVALUECOSTELINEA',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21CosteTotCal',fld:'vCOSTETOTCAL',pic:'ZZZZ9.99999',hsh:true},{av:'sPrefix'},{av:'AV41TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV42TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV44TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV45TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV47TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV48TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV51TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV53TFHrePrePrd',fld:'vTFHREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV54TFHrePrePrd_To',fld:'vTFHREPREPRD_TO',pic:'ZZZZZZZ9.999'},{av:'AV56TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV57TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV65CantAd',fld:'vCANTAD',pic:'ZZZZZZ9.99',hsh:true},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A4967HrePrePrd',fld:'HREPREPRD',pic:'ZZZZZZZ9.999'},{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV63TotCostelinea',fld:'vTOTCOSTELINEA',pic:'ZZZZ9.99999',hsh:true},{av:'AV23Costelinea',fld:'vCOSTELINEA',pic:'ZZZZ9.99999'},{av:'AV64TotValueCostelinea',fld:'vTOTVALUECOSTELINEA',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Hrereclin',iparms:[]");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV8HreBarPar = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5EmprCod = "" ;
      AV8HreBarPar = "" ;
      AV41TFHrePrdNum = "" ;
      AV42TFHrePrdNum_Sel = "" ;
      AV44TFHrePrdDsc = "" ;
      AV45TFHrePrdDsc_Sel = "" ;
      AV47TFHrePrdCant = DecimalUtil.ZERO ;
      AV48TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV50TFHrePrdUDs = "" ;
      AV51TFHrePrdUDs_Sel = "" ;
      AV53TFHrePrePrd = DecimalUtil.ZERO ;
      AV54TFHrePrePrd_To = DecimalUtil.ZERO ;
      AV56TFPrdFacCon = DecimalUtil.ZERO ;
      AV57TFPrdFacCon_To = DecimalUtil.ZERO ;
      AV70Pgmname = "" ;
      AV65CantAd = DecimalUtil.ZERO ;
      AV63TotCostelinea = DecimalUtil.ZERO ;
      AV21CosteTotCal = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV59DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      A719PrdNum = "" ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV74Wccostesproductosds_1_tfhreprdnum = "" ;
      AV75Wccostesproductosds_2_tfhreprdnum_sel = "" ;
      AV76Wccostesproductosds_3_tfhreprddsc = "" ;
      AV77Wccostesproductosds_4_tfhreprddsc_sel = "" ;
      AV78Wccostesproductosds_5_tfhreprdcant = DecimalUtil.ZERO ;
      AV79Wccostesproductosds_6_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV80Wccostesproductosds_7_tfhreprduds = "" ;
      AV81Wccostesproductosds_8_tfhreprduds_sel = "" ;
      AV82Wccostesproductosds_9_tfhrepreprd = DecimalUtil.ZERO ;
      AV83Wccostesproductosds_10_tfhrepreprd_to = DecimalUtil.ZERO ;
      AV84Wccostesproductosds_11_tfprdfaccon = DecimalUtil.ZERO ;
      AV85Wccostesproductosds_12_tfprdfaccon_to = DecimalUtil.ZERO ;
      A4558HrePrdNum = "" ;
      A4559HrePrdDsc = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      AV22HrePrdCant = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      AV23Costelinea = DecimalUtil.ZERO ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV74Wccostesproductosds_1_tfhreprdnum = "" ;
      lV76Wccostesproductosds_3_tfhreprddsc = "" ;
      lV80Wccostesproductosds_7_tfhreprduds = "" ;
      H00T82_A396EmprCod = new String[] {""} ;
      H00T82_A4492HreBarCod = new int[1] ;
      H00T82_A4493HreBarReo = new byte[1] ;
      H00T82_A4494HreBarPar = new String[] {""} ;
      H00T82_A4495HreNumCie = new byte[1] ;
      H00T82_A4545HreLinMaq = new short[1] ;
      H00T82_A719PrdNum = new String[] {""} ;
      H00T82_n719PrdNum = new boolean[] {false} ;
      H00T82_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T82_n4565HreCanAny = new boolean[] {false} ;
      H00T82_A4557HreRecLin = new short[1] ;
      H00T82_A4550HreLinPro = new byte[1] ;
      H00T82_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T82_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T82_n4967HrePrePrd = new boolean[] {false} ;
      H00T82_A4561HrePrdUDs = new String[] {""} ;
      H00T82_n4561HrePrdUDs = new boolean[] {false} ;
      H00T82_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T82_n4563HrePrdCant = new boolean[] {false} ;
      H00T82_A4559HrePrdDsc = new String[] {""} ;
      H00T82_n4559HrePrdDsc = new boolean[] {false} ;
      H00T82_A4558HrePrdNum = new String[] {""} ;
      H00T82_n4558HrePrdNum = new boolean[] {false} ;
      H00T83_AGRID_nRecordCount = new long[1] ;
      AV64TotValueCostelinea = "" ;
      hsh = "" ;
      AV71Station = "" ;
      AV72Emprnom = "" ;
      AV73Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ExcelFilename = "" ;
      AV25ErrorMessage = "" ;
      AV30Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char9 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char8 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState10 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      H00T84_A4550HreLinPro = new byte[1] ;
      H00T84_A4557HreRecLin = new short[1] ;
      H00T84_A719PrdNum = new String[] {""} ;
      H00T84_n719PrdNum = new boolean[] {false} ;
      H00T84_A4545HreLinMaq = new short[1] ;
      H00T84_A4495HreNumCie = new byte[1] ;
      H00T84_A4494HreBarPar = new String[] {""} ;
      H00T84_A4493HreBarReo = new byte[1] ;
      H00T84_A4492HreBarCod = new int[1] ;
      H00T84_A396EmprCod = new String[] {""} ;
      H00T84_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T84_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T84_n4967HrePrePrd = new boolean[] {false} ;
      H00T84_A4561HrePrdUDs = new String[] {""} ;
      H00T84_n4561HrePrdUDs = new boolean[] {false} ;
      H00T84_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00T84_n4563HrePrdCant = new boolean[] {false} ;
      H00T84_A4559HrePrdDsc = new String[] {""} ;
      H00T84_n4559HrePrdDsc = new boolean[] {false} ;
      H00T84_A4558HrePrdNum = new String[] {""} ;
      H00T84_n4558HrePrdNum = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV6HreBarCod = "" ;
      sCtrlAV7HreBarReo = "" ;
      sCtrlAV8HreBarPar = "" ;
      sCtrlAV9HreNumCie = "" ;
      sCtrlAV10HreLinMaq = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wccostesproductos__default(),
         new Object[] {
             new Object[] {
            H00T82_A396EmprCod, H00T82_A4492HreBarCod, H00T82_A4493HreBarReo, H00T82_A4494HreBarPar, H00T82_A4495HreNumCie, H00T82_A4545HreLinMaq, H00T82_A719PrdNum, H00T82_n719PrdNum, H00T82_A4565HreCanAny, H00T82_n4565HreCanAny,
            H00T82_A4557HreRecLin, H00T82_A4550HreLinPro, H00T82_A707PrdFacCon, H00T82_A4967HrePrePrd, H00T82_n4967HrePrePrd, H00T82_A4561HrePrdUDs, H00T82_n4561HrePrdUDs, H00T82_A4563HrePrdCant, H00T82_n4563HrePrdCant, H00T82_A4559HrePrdDsc,
            H00T82_n4559HrePrdDsc, H00T82_A4558HrePrdNum, H00T82_n4558HrePrdNum
            }
            , new Object[] {
            H00T83_AGRID_nRecordCount
            }
            , new Object[] {
            H00T84_A4550HreLinPro, H00T84_A4557HreRecLin, H00T84_A719PrdNum, H00T84_n719PrdNum, H00T84_A4545HreLinMaq, H00T84_A4495HreNumCie, H00T84_A4494HreBarPar, H00T84_A4493HreBarReo, H00T84_A4492HreBarCod, H00T84_A396EmprCod,
            H00T84_A707PrdFacCon, H00T84_A4967HrePrePrd, H00T84_n4967HrePrePrd, H00T84_A4561HrePrdUDs, H00T84_n4561HrePrdUDs, H00T84_A4563HrePrdCant, H00T84_n4563HrePrdCant, H00T84_A4559HrePrdDsc, H00T84_n4559HrePrdDsc, H00T84_A4558HrePrdNum,
            H00T84_n4558HrePrdNum
            }
         }
      );
      AV70Pgmname = "WCCostesProductos" ;
      /* GeneXus formulas. */
      AV70Pgmname = "WCCostesProductos" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      edtavHreprdcant_Enabled = 0 ;
      edtavCostelinea_Enabled = 0 ;
      edtavTotvaluecostelinea_Enabled = 0 ;
   }

   private byte wcpOAV7HreBarReo ;
   private byte wcpOAV9HreNumCie ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV7HreBarReo ;
   private byte AV9HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A4550HreLinPro ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV10HreLinMaq ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV10HreLinMaq ;
   private short AV18OrderedBy ;
   private short A4545HreLinMaq ;
   private short wbEnd ;
   private short wbStart ;
   private short A4557HreRecLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV6HreBarCod ;
   private int nRC_GXsfl_42 ;
   private int AV6HreBarCod ;
   private int subGrid_Rows ;
   private int nGXsfl_42_idx=1 ;
   private int A4492HreBarCod ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavHreprdcant_Enabled ;
   private int edtavCostelinea_Enabled ;
   private int edtavTotvaluecostelinea_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV86GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV47TFHrePrdCant ;
   private java.math.BigDecimal AV48TFHrePrdCant_To ;
   private java.math.BigDecimal AV53TFHrePrePrd ;
   private java.math.BigDecimal AV54TFHrePrePrd_To ;
   private java.math.BigDecimal AV56TFPrdFacCon ;
   private java.math.BigDecimal AV57TFPrdFacCon_To ;
   private java.math.BigDecimal AV65CantAd ;
   private java.math.BigDecimal AV63TotCostelinea ;
   private java.math.BigDecimal AV21CosteTotCal ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal AV78Wccostesproductosds_5_tfhreprdcant ;
   private java.math.BigDecimal AV79Wccostesproductosds_6_tfhreprdcant_to ;
   private java.math.BigDecimal AV82Wccostesproductosds_9_tfhrepreprd ;
   private java.math.BigDecimal AV83Wccostesproductosds_10_tfhrepreprd_to ;
   private java.math.BigDecimal AV84Wccostesproductosds_11_tfprdfaccon ;
   private java.math.BigDecimal AV85Wccostesproductosds_12_tfprdfaccon_to ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal AV22HrePrdCant ;
   private java.math.BigDecimal AV23Costelinea ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal A707PrdFacCon ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV8HreBarPar ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5EmprCod ;
   private String AV8HreBarPar ;
   private String sGXsfl_42_idx="0001" ;
   private String AV41TFHrePrdNum ;
   private String AV42TFHrePrdNum_Sel ;
   private String AV44TFHrePrdDsc ;
   private String AV45TFHrePrdDsc_Sel ;
   private String AV50TFHrePrdUDs ;
   private String AV51TFHrePrdUDs_Sel ;
   private String AV70Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String A719PrdNum ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divGridtablewithtotalizers_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvaluecostelinea_Internalname ;
   private String AV74Wccostesproductosds_1_tfhreprdnum ;
   private String AV75Wccostesproductosds_2_tfhreprdnum_sel ;
   private String AV76Wccostesproductosds_3_tfhreprddsc ;
   private String AV77Wccostesproductosds_4_tfhreprddsc_sel ;
   private String AV80Wccostesproductosds_7_tfhreprduds ;
   private String AV81Wccostesproductosds_8_tfhreprduds_sel ;
   private String A4558HrePrdNum ;
   private String edtHrePrdNum_Internalname ;
   private String A4559HrePrdDsc ;
   private String edtHrePrdDsc_Internalname ;
   private String edtHrePrdCant_Internalname ;
   private String edtavHreprdcant_Internalname ;
   private String A4561HrePrdUDs ;
   private String edtHrePrdUDs_Internalname ;
   private String edtavCostelinea_Internalname ;
   private String edtHrePrePrd_Internalname ;
   private String edtPrdFacCon_Internalname ;
   private String edtHreLinPro_Internalname ;
   private String edtHreRecLin_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV74Wccostesproductosds_1_tfhreprdnum ;
   private String lV76Wccostesproductosds_3_tfhreprddsc ;
   private String lV80Wccostesproductosds_7_tfhreprduds ;
   private String hsh ;
   private String AV71Station ;
   private String AV72Emprnom ;
   private String AV73Usurcod ;
   private String GXt_char9 ;
   private String GXv_char4[] ;
   private String GXt_char8 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluecostelinea_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV6HreBarCod ;
   private String sCtrlAV7HreBarReo ;
   private String sCtrlAV8HreBarPar ;
   private String sCtrlAV9HreNumCie ;
   private String sCtrlAV10HreLinMaq ;
   private String sGXsfl_42_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtHrePrdNum_Jsonclick ;
   private String edtHrePrdDsc_Jsonclick ;
   private String edtHrePrdCant_Jsonclick ;
   private String edtavHreprdcant_Jsonclick ;
   private String edtHrePrdUDs_Jsonclick ;
   private String edtavCostelinea_Jsonclick ;
   private String edtHrePrePrd_Jsonclick ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtHreLinPro_Jsonclick ;
   private String edtHreRecLin_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV19OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4558HrePrdNum ;
   private boolean n4559HrePrdDsc ;
   private boolean n4563HrePrdCant ;
   private boolean n4561HrePrdUDs ;
   private boolean n4967HrePrePrd ;
   private boolean bGXsfl_42_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n719PrdNum ;
   private boolean n4565HreCanAny ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV64TotValueCostelinea ;
   private String AV24ExcelFilename ;
   private String AV25ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H00T82_A396EmprCod ;
   private int[] H00T82_A4492HreBarCod ;
   private byte[] H00T82_A4493HreBarReo ;
   private String[] H00T82_A4494HreBarPar ;
   private byte[] H00T82_A4495HreNumCie ;
   private short[] H00T82_A4545HreLinMaq ;
   private String[] H00T82_A719PrdNum ;
   private boolean[] H00T82_n719PrdNum ;
   private java.math.BigDecimal[] H00T82_A4565HreCanAny ;
   private boolean[] H00T82_n4565HreCanAny ;
   private short[] H00T82_A4557HreRecLin ;
   private byte[] H00T82_A4550HreLinPro ;
   private java.math.BigDecimal[] H00T82_A707PrdFacCon ;
   private java.math.BigDecimal[] H00T82_A4967HrePrePrd ;
   private boolean[] H00T82_n4967HrePrePrd ;
   private String[] H00T82_A4561HrePrdUDs ;
   private boolean[] H00T82_n4561HrePrdUDs ;
   private java.math.BigDecimal[] H00T82_A4563HrePrdCant ;
   private boolean[] H00T82_n4563HrePrdCant ;
   private String[] H00T82_A4559HrePrdDsc ;
   private boolean[] H00T82_n4559HrePrdDsc ;
   private String[] H00T82_A4558HrePrdNum ;
   private boolean[] H00T82_n4558HrePrdNum ;
   private long[] H00T83_AGRID_nRecordCount ;
   private byte[] H00T84_A4550HreLinPro ;
   private short[] H00T84_A4557HreRecLin ;
   private String[] H00T84_A719PrdNum ;
   private boolean[] H00T84_n719PrdNum ;
   private short[] H00T84_A4545HreLinMaq ;
   private byte[] H00T84_A4495HreNumCie ;
   private String[] H00T84_A4494HreBarPar ;
   private byte[] H00T84_A4493HreBarReo ;
   private int[] H00T84_A4492HreBarCod ;
   private String[] H00T84_A396EmprCod ;
   private java.math.BigDecimal[] H00T84_A707PrdFacCon ;
   private java.math.BigDecimal[] H00T84_A4967HrePrePrd ;
   private boolean[] H00T84_n4967HrePrePrd ;
   private String[] H00T84_A4561HrePrdUDs ;
   private boolean[] H00T84_n4561HrePrdUDs ;
   private java.math.BigDecimal[] H00T84_A4563HrePrdCant ;
   private boolean[] H00T84_n4563HrePrdCant ;
   private String[] H00T84_A4559HrePrdDsc ;
   private boolean[] H00T84_n4559HrePrdDsc ;
   private String[] H00T84_A4558HrePrdNum ;
   private boolean[] H00T84_n4558HrePrdNum ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV59DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState10[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wccostesproductos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00T82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wccostesproductosds_2_tfhreprdnum_sel ,
                                          String AV74Wccostesproductosds_1_tfhreprdnum ,
                                          String AV77Wccostesproductosds_4_tfhreprddsc_sel ,
                                          String AV76Wccostesproductosds_3_tfhreprddsc ,
                                          java.math.BigDecimal AV78Wccostesproductosds_5_tfhreprdcant ,
                                          java.math.BigDecimal AV79Wccostesproductosds_6_tfhreprdcant_to ,
                                          String AV81Wccostesproductosds_8_tfhreprduds_sel ,
                                          String AV80Wccostesproductosds_7_tfhreprduds ,
                                          java.math.BigDecimal AV82Wccostesproductosds_9_tfhrepreprd ,
                                          java.math.BigDecimal AV83Wccostesproductosds_10_tfhrepreprd_to ,
                                          java.math.BigDecimal AV84Wccostesproductosds_11_tfprdfaccon ,
                                          java.math.BigDecimal AV85Wccostesproductosds_12_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String A719PrdNum ,
                                          String AV5EmprCod ,
                                          int AV6HreBarCod ,
                                          byte AV7HreBarReo ,
                                          String AV8HreBarPar ,
                                          byte AV9HreNumCie ,
                                          short AV10HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[23];
      Object[] GXv_Object12 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.PrdNum, T1.HreCanAny, T1.HreRecLin, T1.HreLinPro, T2.PrdFacCon," ;
      sSelectString += " T1.HrePrePrd, T1.HrePrdUDs, T1.HrePrdCant, T1.HrePrdDsc, T1.HrePrdNum" ;
      sFromString = " FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMaq = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL)))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> 'C')");
      if ( (GXutil.strcmp("", AV75Wccostesproductosds_2_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Wccostesproductosds_1_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wccostesproductosds_2_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wccostesproductosds_4_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wccostesproductosds_3_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wccostesproductosds_4_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Wccostesproductosds_5_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Wccostesproductosds_6_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wccostesproductosds_8_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV80Wccostesproductosds_7_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wccostesproductosds_8_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Wccostesproductosds_9_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Wccostesproductosds_10_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wccostesproductosds_11_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wccostesproductosds_12_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( AV18OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.HreLinPro" ;
      }
      else if ( AV18OrderedBy == 2 )
      {
         sOrderString += " ORDER BY T1.HreRecLin" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HrePrdNum" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HrePrdNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HrePrdDsc" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HrePrdDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HrePrdCant" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HrePrdCant DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HrePrdUDs" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HrePrdUDs DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HrePrePrd" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HrePrePrd DESC" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdFacCon" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdFacCon DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HreLinPro, T1.HreRecLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H00T83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wccostesproductosds_2_tfhreprdnum_sel ,
                                          String AV74Wccostesproductosds_1_tfhreprdnum ,
                                          String AV77Wccostesproductosds_4_tfhreprddsc_sel ,
                                          String AV76Wccostesproductosds_3_tfhreprddsc ,
                                          java.math.BigDecimal AV78Wccostesproductosds_5_tfhreprdcant ,
                                          java.math.BigDecimal AV79Wccostesproductosds_6_tfhreprdcant_to ,
                                          String AV81Wccostesproductosds_8_tfhreprduds_sel ,
                                          String AV80Wccostesproductosds_7_tfhreprduds ,
                                          java.math.BigDecimal AV82Wccostesproductosds_9_tfhrepreprd ,
                                          java.math.BigDecimal AV83Wccostesproductosds_10_tfhrepreprd_to ,
                                          java.math.BigDecimal AV84Wccostesproductosds_11_tfprdfaccon ,
                                          java.math.BigDecimal AV85Wccostesproductosds_12_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String A719PrdNum ,
                                          String AV5EmprCod ,
                                          int AV6HreBarCod ,
                                          byte AV7HreBarReo ,
                                          String AV8HreBarPar ,
                                          byte AV9HreNumCie ,
                                          short AV10HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[18];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMaq = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL)))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> 'C')");
      if ( (GXutil.strcmp("", AV75Wccostesproductosds_2_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Wccostesproductosds_1_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wccostesproductosds_2_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wccostesproductosds_4_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wccostesproductosds_3_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wccostesproductosds_4_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Wccostesproductosds_5_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Wccostesproductosds_6_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wccostesproductosds_8_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV80Wccostesproductosds_7_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wccostesproductosds_8_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Wccostesproductosds_9_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Wccostesproductosds_10_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wccostesproductosds_11_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wccostesproductosds_12_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV18OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( AV18OrderedBy == 2 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H00T84( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wccostesproductosds_2_tfhreprdnum_sel ,
                                          String AV74Wccostesproductosds_1_tfhreprdnum ,
                                          String AV77Wccostesproductosds_4_tfhreprddsc_sel ,
                                          String AV76Wccostesproductosds_3_tfhreprddsc ,
                                          java.math.BigDecimal AV78Wccostesproductosds_5_tfhreprdcant ,
                                          java.math.BigDecimal AV79Wccostesproductosds_6_tfhreprdcant_to ,
                                          String AV81Wccostesproductosds_8_tfhreprduds_sel ,
                                          String AV80Wccostesproductosds_7_tfhreprduds ,
                                          java.math.BigDecimal AV82Wccostesproductosds_9_tfhrepreprd ,
                                          java.math.BigDecimal AV83Wccostesproductosds_10_tfhrepreprd_to ,
                                          java.math.BigDecimal AV84Wccostesproductosds_11_tfprdfaccon ,
                                          java.math.BigDecimal AV85Wccostesproductosds_12_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A719PrdNum ,
                                          String AV5EmprCod ,
                                          int AV6HreBarCod ,
                                          byte AV7HreBarReo ,
                                          String AV8HreBarPar ,
                                          byte AV9HreNumCie ,
                                          short AV10HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[18];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.HreLinPro, T1.HreRecLin, T1.PrdNum, T1.HreLinMaq, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.PrdFacCon," ;
      scmdbuf += " T1.HrePrePrd, T1.HrePrdUDs, T1.HrePrdCant, T1.HrePrdDsc, T1.HrePrdNum FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMaq = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.PrdNum) IS NULL AND NOT(T1.PrdNum IS NULL)))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> 'C')");
      if ( (GXutil.strcmp("", AV75Wccostesproductosds_2_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV74Wccostesproductosds_1_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wccostesproductosds_2_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wccostesproductosds_4_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wccostesproductosds_3_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wccostesproductosds_4_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Wccostesproductosds_5_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Wccostesproductosds_6_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wccostesproductosds_8_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV80Wccostesproductosds_7_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wccostesproductosds_8_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Wccostesproductosds_9_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Wccostesproductosds_10_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wccostesproductosds_11_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wccostesproductosds_12_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H00T82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).shortValue() );
            case 1 :
                  return conditional_H00T83(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).shortValue() );
            case 2 :
                  return conditional_H00T84(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00T82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00T84", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               return;
      }
   }

}

