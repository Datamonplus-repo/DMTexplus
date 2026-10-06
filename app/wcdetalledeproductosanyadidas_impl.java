package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcdetalledeproductosanyadidas_impl extends GXWebComponent
{
   public wcdetalledeproductosanyadidas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcdetalledeproductosanyadidas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdetalledeproductosanyadidas_impl.class ));
   }

   public wcdetalledeproductosanyadidas_impl( int remoteHandle ,
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
               AV6EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
               AV7HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7HreBarCod), 8, 0));
               AV8HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarReo", GXutil.str( AV8HreBarReo, 1, 0));
               AV9HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreBarPar", AV9HreBarPar);
               AV10HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreNumCie), 2, 0));
               AV11HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinMaq), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV6EmprCod,Integer.valueOf(AV7HreBarCod),Byte.valueOf(AV8HreBarReo),AV9HreBarPar,Byte.valueOf(AV10HreNumCie),Short.valueOf(AV11HreLinMaq)});
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
      nRC_GXsfl_29 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_29"))) ;
      nGXsfl_29_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_29_idx"))) ;
      sGXsfl_29_idx = httpContext.GetPar( "sGXsfl_29_idx") ;
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
      AV6EmprCod = httpContext.GetPar( "EmprCod") ;
      AV7HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
      AV8HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
      AV9HreBarPar = httpContext.GetPar( "HreBarPar") ;
      AV10HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
      AV11HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
      AV33TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV34TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV35TFHrdPrdDsc = httpContext.GetPar( "TFHrdPrdDsc") ;
      AV36TFHrdPrdDsc_Sel = httpContext.GetPar( "TFHrdPrdDsc_Sel") ;
      AV37TFHreLanyCan = CommonUtil.decimalVal( httpContext.GetPar( "TFHreLanyCan"), ".") ;
      AV38TFHreLanyCan_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreLanyCan_To"), ".") ;
      AV39TFHrePrdCFin = CommonUtil.decimalVal( httpContext.GetPar( "TFHrePrdCFin"), ".") ;
      AV40TFHrePrdCFin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHrePrdCFin_To"), ".") ;
      AV41TFHreLanyNro = (byte)(GXutil.lval( httpContext.GetPar( "TFHreLanyNro"))) ;
      AV42TFHreLanyNro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHreLanyNro_To"))) ;
      AV43TFHreLanyTnq = (byte)(GXutil.lval( httpContext.GetPar( "TFHreLanyTnq"))) ;
      AV44TFHreLanyTnq_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHreLanyTnq_To"))) ;
      AV45TFHreLanyUsr = httpContext.GetPar( "TFHreLanyUsr") ;
      AV46TFHreLanyUsr_Sel = httpContext.GetPar( "TFHreLanyUsr_Sel") ;
      AV47TFHreLanyFec = localUtil.parseDTimeParm( httpContext.GetPar( "TFHreLanyFec")) ;
      AV75Pgmname = httpContext.GetPar( "Pgmname") ;
      AV19OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV20OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV7HreBarCod, AV8HreBarReo, AV9HreBarPar, AV10HreNumCie, AV11HreLinMaq, AV33TFPrdNum, AV34TFPrdNum_Sel, AV35TFHrdPrdDsc, AV36TFHrdPrdDsc_Sel, AV37TFHreLanyCan, AV38TFHreLanyCan_To, AV39TFHrePrdCFin, AV40TFHrePrdCFin_To, AV41TFHreLanyNro, AV42TFHreLanyNro_To, AV43TFHreLanyTnq, AV44TFHreLanyTnq_To, AV45TFHreLanyUsr, AV46TFHreLanyUsr_Sel, AV47TFHreLanyFec, AV75Pgmname, AV19OrderedBy, AV20OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1602( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Historico Recetas (añadidas)", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcdetalledeproductosanyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV10HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11HreLinMaq,4,0))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV75Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_29", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_29, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV51DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV51DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6EmprCod", GXutil.rtrim( wcpOAV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7HreBarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV7HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8HreBarReo", GXutil.ltrim( localUtil.ntoc( wcpOAV8HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9HreBarPar", GXutil.rtrim( wcpOAV9HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10HreNumCie", GXutil.ltrim( localUtil.ntoc( wcpOAV10HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11HreLinMaq", GXutil.ltrim( localUtil.ntoc( wcpOAV11HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV33TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV34TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRDPRDDSC", GXutil.rtrim( AV35TFHrdPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRDPRDDSC_SEL", GXutil.rtrim( AV36TFHrdPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYCAN", GXutil.ltrim( localUtil.ntoc( AV37TFHreLanyCan, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYCAN_TO", GXutil.ltrim( localUtil.ntoc( AV38TFHreLanyCan_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDCFIN", GXutil.ltrim( localUtil.ntoc( AV39TFHrePrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDCFIN_TO", GXutil.ltrim( localUtil.ntoc( AV40TFHrePrdCFin_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYNRO", GXutil.ltrim( localUtil.ntoc( AV41TFHreLanyNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYNRO_TO", GXutil.ltrim( localUtil.ntoc( AV42TFHreLanyNro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYTNQ", GXutil.ltrim( localUtil.ntoc( AV43TFHreLanyTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYTNQ_TO", GXutil.ltrim( localUtil.ntoc( AV44TFHreLanyTnq_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYUSR", GXutil.rtrim( AV45TFHreLanyUsr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYUSR_SEL", GXutil.rtrim( AV46TFHreLanyUsr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELANYFEC", localUtil.ttoc( AV47TFHreLanyFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV75Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV75Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV19OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV20OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV7HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV8HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARPAR", GXutil.rtrim( AV9HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV10HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRELINMAQ", GXutil.ltrim( localUtil.ntoc( AV11HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
   }

   public void renderHtmlCloseForm1602( )
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
      return "WCDetalledeProductosAnyadidas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Historico Recetas (añadidas)", "") ;
   }

   public void wb1600( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcdetalledeproductosanyadidas");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 29, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCDetalledeProductosAnyadidas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 29, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCDetalledeProductosAnyadidas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_1602( true) ;
      }
      else
      {
         wb_table1_21_1602( false) ;
      }
      return  ;
   }

   public void wb_table1_21_1602e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol29( ) ;
      }
      if ( wbEnd == 29 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_29 = (int)(nGXsfl_29_idx-1) ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV51DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hrelanyfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'" + sGXsfl_29_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hrelanyfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hrelanyfecauxdate_Internalname, localUtil.format(AV49DDO_HreLanyFecAuxDate, "99/99/99"), localUtil.format( AV49DDO_HreLanyFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,45);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hrelanyfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCDetalledeProductosAnyadidas.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hrelanyfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCDetalledeProductosAnyadidas.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 29 )
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

   public void start1602( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Historico Recetas (añadidas)", ""), (short)(0)) ;
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
            strup1600( ) ;
         }
      }
   }

   public void ws1602( )
   {
      start1602( ) ;
      evt1602( ) ;
   }

   public void evt1602( )
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
                              strup1600( ) ;
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
                              strup1600( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111602 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1600( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e121602 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1600( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e131602 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1600( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDdo_hrelanyfecauxdate_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1600( ) ;
                           }
                           AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = AV33TFPrdNum ;
                           AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV34TFPrdNum_Sel ;
                           AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV35TFHrdPrdDsc ;
                           AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV36TFHrdPrdDsc_Sel ;
                           AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV37TFHreLanyCan ;
                           AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV38TFHreLanyCan_To ;
                           AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV39TFHrePrdCFin ;
                           AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV40TFHrePrdCFin_To ;
                           AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV41TFHreLanyNro ;
                           AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV42TFHreLanyNro_To ;
                           AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV43TFHreLanyTnq ;
                           AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV44TFHreLanyTnq_To ;
                           AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV45TFHreLanyUsr ;
                           AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV46TFHreLanyUsr_Sel ;
                           AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV47TFHreLanyFec ;
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
                              strup1600( ) ;
                           }
                           nGXsfl_29_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_292( ) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A4510HrdPrdDsc = httpContext.cgiGet( edtHrdPrdDsc_Internalname) ;
                           n4510HrdPrdDsc = false ;
                           A4513HreLanyCan = localUtil.ctond( httpContext.cgiGet( edtHreLanyCan_Internalname)) ;
                           n4513HreLanyCan = false ;
                           A4511HrePrdCFin = localUtil.ctond( httpContext.cgiGet( edtHrePrdCFin_Internalname)) ;
                           n4511HrePrdCFin = false ;
                           A4514HreLanyNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreLanyNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4514HreLanyNro = false ;
                           A4515HreLanyTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreLanyTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4515HreLanyTnq = false ;
                           A4580HreLanyUsr = GXutil.upper( httpContext.cgiGet( edtHreLanyUsr_Internalname)) ;
                           n4580HreLanyUsr = false ;
                           A4581HreLanyFec = localUtil.ctot( httpContext.cgiGet( edtHreLanyFec_Internalname), 0) ;
                           n4581HreLanyFec = false ;
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
                                       GX_FocusControl = edtavDdo_hrelanyfecauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e141602 ();
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
                                       GX_FocusControl = edtavDdo_hrelanyfecauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e151602 ();
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
                                       GX_FocusControl = edtavDdo_hrelanyfecauxdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e161602 ();
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
                                    strup1600( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDdo_hrelanyfecauxdate_Internalname ;
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

   public void we1602( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1602( ) ;
         }
      }
   }

   public void pa1602( )
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
            GX_FocusControl = edtavDdo_hrelanyfecauxdate_Internalname ;
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
      subsflControlProps_292( ) ;
      while ( nGXsfl_29_idx <= nRC_GXsfl_29 )
      {
         sendrow_292( ) ;
         nGXsfl_29_idx = ((subGrid_Islastpage==1)&&(nGXsfl_29_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_29_idx+1) ;
         sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_292( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV6EmprCod ,
                                 int AV7HreBarCod ,
                                 byte AV8HreBarReo ,
                                 String AV9HreBarPar ,
                                 byte AV10HreNumCie ,
                                 short AV11HreLinMaq ,
                                 String AV33TFPrdNum ,
                                 String AV34TFPrdNum_Sel ,
                                 String AV35TFHrdPrdDsc ,
                                 String AV36TFHrdPrdDsc_Sel ,
                                 java.math.BigDecimal AV37TFHreLanyCan ,
                                 java.math.BigDecimal AV38TFHreLanyCan_To ,
                                 java.math.BigDecimal AV39TFHrePrdCFin ,
                                 java.math.BigDecimal AV40TFHrePrdCFin_To ,
                                 byte AV41TFHreLanyNro ,
                                 byte AV42TFHreLanyNro_To ,
                                 byte AV43TFHreLanyTnq ,
                                 byte AV44TFHreLanyTnq_To ,
                                 String AV45TFHreLanyUsr ,
                                 String AV46TFHreLanyUsr_Sel ,
                                 java.util.Date AV47TFHreLanyFec ,
                                 String AV75Pgmname ,
                                 short AV19OrderedBy ,
                                 boolean AV20OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e151602 ();
      GRID_nCurrentRecord = 0 ;
      rf1602( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      send_integrity_hashes( ) ;
      rf1602( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV75Pgmname = "WCDetalledeProductosAnyadidas" ;
      Gx_err = (short)(0) ;
   }

   public void rf1602( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(29) ;
      /* Execute user event: Refresh */
      e151602 ();
      nGXsfl_29_idx = 1 ;
      sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_292( ) ;
      bGXsfl_29_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_292( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                              AV60Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                              AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                              AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                              AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                              AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                              AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                              AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                              Byte.valueOf(AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro) ,
                                              Byte.valueOf(AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) ,
                                              Byte.valueOf(AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) ,
                                              Byte.valueOf(AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) ,
                                              AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                              AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                              AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                              A719PrdNum ,
                                              A4510HrdPrdDsc ,
                                              A4513HreLanyCan ,
                                              A4511HrePrdCFin ,
                                              Byte.valueOf(A4514HreLanyNro) ,
                                              Byte.valueOf(A4515HreLanyTnq) ,
                                              A4580HreLanyUsr ,
                                              A4581HreLanyFec ,
                                              Short.valueOf(AV19OrderedBy) ,
                                              Boolean.valueOf(AV20OrderedDsc) ,
                                              AV6EmprCod ,
                                              Integer.valueOf(AV7HreBarCod) ,
                                              Byte.valueOf(AV8HreBarReo) ,
                                              AV9HreBarPar ,
                                              Byte.valueOf(AV10HreNumCie) ,
                                              Short.valueOf(AV11HreLinMaq) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A4492HreBarCod) ,
                                              Byte.valueOf(A4493HreBarReo) ,
                                              A4494HreBarPar ,
                                              Byte.valueOf(A4495HreNumCie) ,
                                              Short.valueOf(A4508HreLinMAL) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                              }
         });
         lV60Wcdetalledeproductosanyadidasds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Wcdetalledeproductosanyadidasds_1_tfprdnum), 6, "%") ;
         lV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc), 26, "%") ;
         lV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = GXutil.padr( GXutil.rtrim( AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr), 8, "%") ;
         /* Using cursor H01602 */
         pr_default.execute(0, new Object[] {AV6EmprCod, Integer.valueOf(AV7HreBarCod), Byte.valueOf(AV8HreBarReo), AV9HreBarPar, Byte.valueOf(AV10HreNumCie), Short.valueOf(AV11HreLinMaq), lV60Wcdetalledeproductosanyadidasds_1_tfprdnum, AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel, lV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc, AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel, AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan, AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to, AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin, AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to, Byte.valueOf(AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro), Byte.valueOf(AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to), Byte.valueOf(AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq), Byte.valueOf(AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to), lV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr, AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel, AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_29_idx = 1 ;
         sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_292( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01602_A396EmprCod[0] ;
            A4492HreBarCod = H01602_A4492HreBarCod[0] ;
            A4493HreBarReo = H01602_A4493HreBarReo[0] ;
            A4494HreBarPar = H01602_A4494HreBarPar[0] ;
            A4495HreNumCie = H01602_A4495HreNumCie[0] ;
            A4508HreLinMAL = H01602_A4508HreLinMAL[0] ;
            A4509HreNumAny = H01602_A4509HreNumAny[0] ;
            A4581HreLanyFec = H01602_A4581HreLanyFec[0] ;
            n4581HreLanyFec = H01602_n4581HreLanyFec[0] ;
            A4580HreLanyUsr = H01602_A4580HreLanyUsr[0] ;
            n4580HreLanyUsr = H01602_n4580HreLanyUsr[0] ;
            A4515HreLanyTnq = H01602_A4515HreLanyTnq[0] ;
            n4515HreLanyTnq = H01602_n4515HreLanyTnq[0] ;
            A4514HreLanyNro = H01602_A4514HreLanyNro[0] ;
            n4514HreLanyNro = H01602_n4514HreLanyNro[0] ;
            A4511HrePrdCFin = H01602_A4511HrePrdCFin[0] ;
            n4511HrePrdCFin = H01602_n4511HrePrdCFin[0] ;
            A4513HreLanyCan = H01602_A4513HreLanyCan[0] ;
            n4513HreLanyCan = H01602_n4513HreLanyCan[0] ;
            A4510HrdPrdDsc = H01602_A4510HrdPrdDsc[0] ;
            n4510HrdPrdDsc = H01602_n4510HrdPrdDsc[0] ;
            A719PrdNum = H01602_A719PrdNum[0] ;
            e161602 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(29) ;
         wb1600( ) ;
      }
      bGXsfl_29_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1602( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV75Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV75Pgmname, ""))));
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
      AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = AV33TFPrdNum ;
      AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV34TFPrdNum_Sel ;
      AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV35TFHrdPrdDsc ;
      AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV36TFHrdPrdDsc_Sel ;
      AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV37TFHreLanyCan ;
      AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV38TFHreLanyCan_To ;
      AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV39TFHrePrdCFin ;
      AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV40TFHrePrdCFin_To ;
      AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV41TFHreLanyNro ;
      AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV42TFHreLanyNro_To ;
      AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV43TFHreLanyTnq ;
      AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV44TFHreLanyTnq_To ;
      AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV45TFHreLanyUsr ;
      AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV46TFHreLanyUsr_Sel ;
      AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV47TFHreLanyFec ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                           AV60Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                           AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                           AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                           AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                           AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                           AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                           AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                           Byte.valueOf(AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro) ,
                                           Byte.valueOf(AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) ,
                                           Byte.valueOf(AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) ,
                                           Byte.valueOf(AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) ,
                                           AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                           AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                           AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A4513HreLanyCan ,
                                           A4511HrePrdCFin ,
                                           Byte.valueOf(A4514HreLanyNro) ,
                                           Byte.valueOf(A4515HreLanyTnq) ,
                                           A4580HreLanyUsr ,
                                           A4581HreLanyFec ,
                                           Short.valueOf(AV19OrderedBy) ,
                                           Boolean.valueOf(AV20OrderedDsc) ,
                                           AV6EmprCod ,
                                           Integer.valueOf(AV7HreBarCod) ,
                                           Byte.valueOf(AV8HreBarReo) ,
                                           AV9HreBarPar ,
                                           Byte.valueOf(AV10HreNumCie) ,
                                           Short.valueOf(AV11HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4508HreLinMAL) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV60Wcdetalledeproductosanyadidasds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Wcdetalledeproductosanyadidasds_1_tfprdnum), 6, "%") ;
      lV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc), 26, "%") ;
      lV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = GXutil.padr( GXutil.rtrim( AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr), 8, "%") ;
      /* Using cursor H01603 */
      pr_default.execute(1, new Object[] {AV6EmprCod, Integer.valueOf(AV7HreBarCod), Byte.valueOf(AV8HreBarReo), AV9HreBarPar, Byte.valueOf(AV10HreNumCie), Short.valueOf(AV11HreLinMaq), lV60Wcdetalledeproductosanyadidasds_1_tfprdnum, AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel, lV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc, AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel, AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan, AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to, AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin, AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to, Byte.valueOf(AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro), Byte.valueOf(AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to), Byte.valueOf(AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq), Byte.valueOf(AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to), lV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr, AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel, AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec});
      GRID_nRecordCount = H01603_AGRID_nRecordCount[0] ;
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
      AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = AV33TFPrdNum ;
      AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV34TFPrdNum_Sel ;
      AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV35TFHrdPrdDsc ;
      AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV36TFHrdPrdDsc_Sel ;
      AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV37TFHreLanyCan ;
      AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV38TFHreLanyCan_To ;
      AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV39TFHrePrdCFin ;
      AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV40TFHrePrdCFin_To ;
      AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV41TFHreLanyNro ;
      AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV42TFHreLanyNro_To ;
      AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV43TFHreLanyTnq ;
      AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV44TFHreLanyTnq_To ;
      AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV45TFHreLanyUsr ;
      AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV46TFHreLanyUsr_Sel ;
      AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV47TFHreLanyFec ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV7HreBarCod, AV8HreBarReo, AV9HreBarPar, AV10HreNumCie, AV11HreLinMaq, AV33TFPrdNum, AV34TFPrdNum_Sel, AV35TFHrdPrdDsc, AV36TFHrdPrdDsc_Sel, AV37TFHreLanyCan, AV38TFHreLanyCan_To, AV39TFHrePrdCFin, AV40TFHrePrdCFin_To, AV41TFHreLanyNro, AV42TFHreLanyNro_To, AV43TFHreLanyTnq, AV44TFHreLanyTnq_To, AV45TFHreLanyUsr, AV46TFHreLanyUsr_Sel, AV47TFHreLanyFec, AV75Pgmname, AV19OrderedBy, AV20OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = AV33TFPrdNum ;
      AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV34TFPrdNum_Sel ;
      AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV35TFHrdPrdDsc ;
      AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV36TFHrdPrdDsc_Sel ;
      AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV37TFHreLanyCan ;
      AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV38TFHreLanyCan_To ;
      AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV39TFHrePrdCFin ;
      AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV40TFHrePrdCFin_To ;
      AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV41TFHreLanyNro ;
      AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV42TFHreLanyNro_To ;
      AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV43TFHreLanyTnq ;
      AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV44TFHreLanyTnq_To ;
      AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV45TFHreLanyUsr ;
      AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV46TFHreLanyUsr_Sel ;
      AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV47TFHreLanyFec ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV7HreBarCod, AV8HreBarReo, AV9HreBarPar, AV10HreNumCie, AV11HreLinMaq, AV33TFPrdNum, AV34TFPrdNum_Sel, AV35TFHrdPrdDsc, AV36TFHrdPrdDsc_Sel, AV37TFHreLanyCan, AV38TFHreLanyCan_To, AV39TFHrePrdCFin, AV40TFHrePrdCFin_To, AV41TFHreLanyNro, AV42TFHreLanyNro_To, AV43TFHreLanyTnq, AV44TFHreLanyTnq_To, AV45TFHreLanyUsr, AV46TFHreLanyUsr_Sel, AV47TFHreLanyFec, AV75Pgmname, AV19OrderedBy, AV20OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = AV33TFPrdNum ;
      AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV34TFPrdNum_Sel ;
      AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV35TFHrdPrdDsc ;
      AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV36TFHrdPrdDsc_Sel ;
      AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV37TFHreLanyCan ;
      AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV38TFHreLanyCan_To ;
      AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV39TFHrePrdCFin ;
      AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV40TFHrePrdCFin_To ;
      AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV41TFHreLanyNro ;
      AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV42TFHreLanyNro_To ;
      AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV43TFHreLanyTnq ;
      AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV44TFHreLanyTnq_To ;
      AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV45TFHreLanyUsr ;
      AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV46TFHreLanyUsr_Sel ;
      AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV47TFHreLanyFec ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV7HreBarCod, AV8HreBarReo, AV9HreBarPar, AV10HreNumCie, AV11HreLinMaq, AV33TFPrdNum, AV34TFPrdNum_Sel, AV35TFHrdPrdDsc, AV36TFHrdPrdDsc_Sel, AV37TFHreLanyCan, AV38TFHreLanyCan_To, AV39TFHrePrdCFin, AV40TFHrePrdCFin_To, AV41TFHreLanyNro, AV42TFHreLanyNro_To, AV43TFHreLanyTnq, AV44TFHreLanyTnq_To, AV45TFHreLanyUsr, AV46TFHreLanyUsr_Sel, AV47TFHreLanyFec, AV75Pgmname, AV19OrderedBy, AV20OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = AV33TFPrdNum ;
      AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV34TFPrdNum_Sel ;
      AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV35TFHrdPrdDsc ;
      AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV36TFHrdPrdDsc_Sel ;
      AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV37TFHreLanyCan ;
      AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV38TFHreLanyCan_To ;
      AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV39TFHrePrdCFin ;
      AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV40TFHrePrdCFin_To ;
      AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV41TFHreLanyNro ;
      AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV42TFHreLanyNro_To ;
      AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV43TFHreLanyTnq ;
      AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV44TFHreLanyTnq_To ;
      AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV45TFHreLanyUsr ;
      AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV46TFHreLanyUsr_Sel ;
      AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV47TFHreLanyFec ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV7HreBarCod, AV8HreBarReo, AV9HreBarPar, AV10HreNumCie, AV11HreLinMaq, AV33TFPrdNum, AV34TFPrdNum_Sel, AV35TFHrdPrdDsc, AV36TFHrdPrdDsc_Sel, AV37TFHreLanyCan, AV38TFHreLanyCan_To, AV39TFHrePrdCFin, AV40TFHrePrdCFin_To, AV41TFHreLanyNro, AV42TFHreLanyNro_To, AV43TFHreLanyTnq, AV44TFHreLanyTnq_To, AV45TFHreLanyUsr, AV46TFHreLanyUsr_Sel, AV47TFHreLanyFec, AV75Pgmname, AV19OrderedBy, AV20OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = AV33TFPrdNum ;
      AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV34TFPrdNum_Sel ;
      AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV35TFHrdPrdDsc ;
      AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV36TFHrdPrdDsc_Sel ;
      AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV37TFHreLanyCan ;
      AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV38TFHreLanyCan_To ;
      AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV39TFHrePrdCFin ;
      AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV40TFHrePrdCFin_To ;
      AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV41TFHreLanyNro ;
      AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV42TFHreLanyNro_To ;
      AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV43TFHreLanyTnq ;
      AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV44TFHreLanyTnq_To ;
      AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV45TFHreLanyUsr ;
      AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV46TFHreLanyUsr_Sel ;
      AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV47TFHreLanyFec ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6EmprCod, AV7HreBarCod, AV8HreBarReo, AV9HreBarPar, AV10HreNumCie, AV11HreLinMaq, AV33TFPrdNum, AV34TFPrdNum_Sel, AV35TFHrdPrdDsc, AV36TFHrdPrdDsc_Sel, AV37TFHreLanyCan, AV38TFHreLanyCan_To, AV39TFHrePrdCFin, AV40TFHrePrdCFin_To, AV41TFHreLanyNro, AV42TFHreLanyNro_To, AV43TFHreLanyTnq, AV44TFHreLanyTnq_To, AV45TFHreLanyUsr, AV46TFHreLanyUsr_Sel, AV47TFHreLanyFec, AV75Pgmname, AV19OrderedBy, AV20OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV75Pgmname = "WCDetalledeProductosAnyadidas" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1600( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141602 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV51DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_29 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_29"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV6EmprCod") ;
         wcpOAV7HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV9HreBarPar") ;
         wcpOAV10HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hrelanyfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HRELANYFECAUXDATE");
            GX_FocusControl = edtavDdo_hrelanyfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49DDO_HreLanyFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49DDO_HreLanyFecAuxDate", localUtil.format(AV49DDO_HreLanyFecAuxDate, "99/99/99"));
         }
         else
         {
            AV49DDO_HreLanyFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hrelanyfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49DDO_HreLanyFecAuxDate", localUtil.format(AV49DDO_HreLanyFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e141602 ();
      if (returnInSub) return;
   }

   public void e141602( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV57Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcdetalledeproductosanyadidas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV58Emprnom ;
      GXv_char4[0] = AV59Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV57Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcdetalledeproductosanyadidas_impl.this.AV6EmprCod = GXv_char2[0] ;
      wcdetalledeproductosanyadidas_impl.this.AV58Emprnom = GXv_char3[0] ;
      wcdetalledeproductosanyadidas_impl.this.AV59Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV19OrderedBy < 1 )
      {
         AV19OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV51DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV51DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
   }

   public void e151602( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV13WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = AV33TFPrdNum ;
      AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV34TFPrdNum_Sel ;
      AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV35TFHrdPrdDsc ;
      AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV36TFHrdPrdDsc_Sel ;
      AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV37TFHreLanyCan ;
      AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV38TFHreLanyCan_To ;
      AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV39TFHrePrdCFin ;
      AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV40TFHrePrdCFin_To ;
      AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV41TFHreLanyNro ;
      AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV42TFHreLanyNro_To ;
      AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV43TFHreLanyTnq ;
      AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV44TFHreLanyTnq_To ;
      AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV45TFHreLanyUsr ;
      AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV46TFHreLanyUsr_Sel ;
      AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV47TFHreLanyFec ;
   }

   public void e111602( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV19OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19OrderedBy), 4, 0));
         AV20OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20OrderedDsc", AV20OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV33TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNum", AV33TFPrdNum);
            AV34TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdNum_Sel", AV34TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrdPrdDsc") == 0 )
         {
            AV35TFHrdPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFHrdPrdDsc", AV35TFHrdPrdDsc);
            AV36TFHrdPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFHrdPrdDsc_Sel", AV36TFHrdPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreLanyCan") == 0 )
         {
            AV37TFHreLanyCan = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHreLanyCan", GXutil.ltrimstr( AV37TFHreLanyCan, 11, 3));
            AV38TFHreLanyCan_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHreLanyCan_To", GXutil.ltrimstr( AV38TFHreLanyCan_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrdCFin") == 0 )
         {
            AV39TFHrePrdCFin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHrePrdCFin", GXutil.ltrimstr( AV39TFHrePrdCFin, 11, 3));
            AV40TFHrePrdCFin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHrePrdCFin_To", GXutil.ltrimstr( AV40TFHrePrdCFin_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreLanyNro") == 0 )
         {
            AV41TFHreLanyNro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFHreLanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFHreLanyNro), 2, 0));
            AV42TFHreLanyNro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHreLanyNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFHreLanyNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreLanyTnq") == 0 )
         {
            AV43TFHreLanyTnq = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHreLanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFHreLanyTnq), 2, 0));
            AV44TFHreLanyTnq_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHreLanyTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFHreLanyTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreLanyUsr") == 0 )
         {
            AV45TFHreLanyUsr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHreLanyUsr", AV45TFHreLanyUsr);
            AV46TFHreLanyUsr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHreLanyUsr_Sel", AV46TFHreLanyUsr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreLanyFec") == 0 )
         {
            AV47TFHreLanyFec = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHreLanyFec", localUtil.ttoc( AV47TFHreLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e161602( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(29) ;
      }
      sendrow_292( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_29_Refreshing )
      {
         httpContext.doAjaxLoad(29, GridRow);
      }
   }

   public void e121602( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV23ExcelFilename ;
      GXv_char3[0] = AV24ErrorMessage ;
      new app.wcdetalledeproductosanyadidasexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcdetalledeproductosanyadidas_impl.this.AV23ExcelFilename = GXv_char4[0] ;
      wcdetalledeproductosanyadidas_impl.this.AV24ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV23ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV23ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV24ErrorMessage);
      }
   }

   public void e131602( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcdetalledeproductosanyadidasexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV19OrderedBy, 4, 0))+":"+(AV20OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue(AV75Pgmname+"GridState"), "") == 0 )
      {
         AV17GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV75Pgmname+"GridState"), null, null);
      }
      else
      {
         AV17GridState.fromxml(AV29Session.getValue(AV75Pgmname+"GridState"), null, null);
      }
      AV19OrderedBy = AV17GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19OrderedBy), 4, 0));
      AV20OrderedDsc = AV17GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20OrderedDsc", AV20OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV76GXV1 = 1 ;
      while ( AV76GXV1 <= AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV76GXV1));
         if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV33TFPrdNum = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNum", AV33TFPrdNum);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV34TFPrdNum_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdNum_Sel", AV34TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC") == 0 )
         {
            AV35TFHrdPrdDsc = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFHrdPrdDsc", AV35TFHrdPrdDsc);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC_SEL") == 0 )
         {
            AV36TFHrdPrdDsc_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFHrdPrdDsc_Sel", AV36TFHrdPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYCAN") == 0 )
         {
            AV37TFHreLanyCan = CommonUtil.decimalVal( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHreLanyCan", GXutil.ltrimstr( AV37TFHreLanyCan, 11, 3));
            AV38TFHreLanyCan_To = CommonUtil.decimalVal( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHreLanyCan_To", GXutil.ltrimstr( AV38TFHreLanyCan_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCFIN") == 0 )
         {
            AV39TFHrePrdCFin = CommonUtil.decimalVal( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHrePrdCFin", GXutil.ltrimstr( AV39TFHrePrdCFin, 11, 3));
            AV40TFHrePrdCFin_To = CommonUtil.decimalVal( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHrePrdCFin_To", GXutil.ltrimstr( AV40TFHrePrdCFin_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYNRO") == 0 )
         {
            AV41TFHreLanyNro = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFHreLanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFHreLanyNro), 2, 0));
            AV42TFHreLanyNro_To = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHreLanyNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFHreLanyNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYTNQ") == 0 )
         {
            AV43TFHreLanyTnq = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHreLanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFHreLanyTnq), 2, 0));
            AV44TFHreLanyTnq_To = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHreLanyTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFHreLanyTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYUSR") == 0 )
         {
            AV45TFHreLanyUsr = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHreLanyUsr", AV45TFHreLanyUsr);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYUSR_SEL") == 0 )
         {
            AV46TFHreLanyUsr_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHreLanyUsr_Sel", AV46TFHreLanyUsr_Sel);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYFEC") == 0 )
         {
            AV47TFHreLanyFec = localUtil.ctot( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHreLanyFec", localUtil.ttoc( AV47TFHreLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV49DDO_HreLanyFecAuxDate = GXutil.resetTime(AV47TFHreLanyFec) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49DDO_HreLanyFecAuxDate", localUtil.format(AV49DDO_HreLanyFecAuxDate, "99/99/99"));
         }
         AV76GXV1 = (int)(AV76GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFPrdNum_Sel)==0), AV34TFPrdNum_Sel, GXv_char4) ;
      wcdetalledeproductosanyadidas_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFHrdPrdDsc_Sel)==0), AV36TFHrdPrdDsc_Sel, GXv_char3) ;
      wcdetalledeproductosanyadidas_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char9 = "" ;
      GXv_char2[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFHreLanyUsr_Sel)==0), AV46TFHreLanyUsr_Sel, GXv_char2) ;
      wcdetalledeproductosanyadidas_impl.this.GXt_char9 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char8+"|||||"+GXt_char9+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char9 = "" ;
      GXv_char4[0] = GXt_char9 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFPrdNum)==0), AV33TFPrdNum, GXv_char4) ;
      wcdetalledeproductosanyadidas_impl.this.GXt_char9 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFHrdPrdDsc)==0), AV35TFHrdPrdDsc, GXv_char3) ;
      wcdetalledeproductosanyadidas_impl.this.GXt_char8 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFHreLanyUsr)==0), AV45TFHreLanyUsr, GXv_char2) ;
      wcdetalledeproductosanyadidas_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char9+"|"+GXt_char8+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFHreLanyCan)==0) ? "" : GXutil.str( AV37TFHreLanyCan, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHrePrdCFin)==0) ? "" : GXutil.str( AV39TFHrePrdCFin, 11, 3))+"|"+((0==AV41TFHreLanyNro) ? "" : GXutil.str( AV41TFHreLanyNro, 2, 0))+"|"+((0==AV43TFHreLanyTnq) ? "" : GXutil.str( AV43TFHreLanyTnq, 2, 0))+"|"+GXt_char1+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV47TFHreLanyFec) ? "" : localUtil.dtoc( AV49DDO_HreLanyFecAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFHreLanyCan_To)==0) ? "" : GXutil.str( AV38TFHreLanyCan_To, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHrePrdCFin_To)==0) ? "" : GXutil.str( AV40TFHrePrdCFin_To, 11, 3))+"|"+((0==AV42TFHreLanyNro_To) ? "" : GXutil.str( AV42TFHreLanyNro_To, 2, 0))+"|"+((0==AV44TFHreLanyTnq_To) ? "" : GXutil.str( AV44TFHreLanyTnq_To, 2, 0))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV17GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV17GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV17GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV17GridState.fromxml(AV29Session.getValue(AV75Pgmname+"GridState"), null, null);
      AV17GridState.setgxTv_SdtWWPGridState_Orderedby( AV19OrderedBy );
      AV17GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV20OrderedDsc );
      AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState10[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFPRDNUM", "", !(GXutil.strcmp("", AV33TFPrdNum)==0), (short)(0), AV33TFPrdNum, "", !(GXutil.strcmp("", AV34TFPrdNum_Sel)==0), AV34TFPrdNum_Sel, "") ;
      AV17GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHRDPRDDSC", "", !(GXutil.strcmp("", AV35TFHrdPrdDsc)==0), (short)(0), AV35TFHrdPrdDsc, "", !(GXutil.strcmp("", AV36TFHrdPrdDsc_Sel)==0), AV36TFHrdPrdDsc_Sel, "") ;
      AV17GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHRELANYCAN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFHreLanyCan)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFHreLanyCan_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV37TFHreLanyCan, 11, 3)), GXutil.trim( GXutil.str( AV38TFHreLanyCan_To, 11, 3))) ;
      AV17GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHREPRDCFIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFHrePrdCFin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHrePrdCFin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV39TFHrePrdCFin, 11, 3)), GXutil.trim( GXutil.str( AV40TFHrePrdCFin_To, 11, 3))) ;
      AV17GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHRELANYNRO", "", !((0==AV41TFHreLanyNro)&&(0==AV42TFHreLanyNro_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFHreLanyNro, 2, 0)), GXutil.trim( GXutil.str( AV42TFHreLanyNro_To, 2, 0))) ;
      AV17GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHRELANYTNQ", "", !((0==AV43TFHreLanyTnq)&&(0==AV44TFHreLanyTnq_To)), (short)(0), GXutil.trim( GXutil.str( AV43TFHreLanyTnq, 2, 0)), GXutil.trim( GXutil.str( AV44TFHreLanyTnq_To, 2, 0))) ;
      AV17GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHRELANYUSR", "", !(GXutil.strcmp("", AV45TFHreLanyUsr)==0), (short)(0), AV45TFHreLanyUsr, "", !(GXutil.strcmp("", AV46TFHreLanyUsr_Sel)==0), AV46TFHreLanyUsr_Sel, "") ;
      AV17GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFHRELANYFEC", "", !GXutil.dateCompare(GXutil.nullDate(), AV47TFHreLanyFec), (short)(0), GXutil.trim( localUtil.ttoc( AV47TFHreLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV17GridState = GXv_SdtWWPGridState10[0] ;
      if ( ! (GXutil.strcmp("", AV6EmprCod)==0) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV6EmprCod );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (0==AV7HreBarCod) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARCOD" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV7HreBarCod, 8, 0) );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (0==AV8HreBarReo) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARREO" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8HreBarReo, 1, 0) );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV9HreBarPar)==0) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARPAR" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV9HreBarPar );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (0==AV10HreNumCie) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRENUMCIE" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10HreNumCie, 2, 0) );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (0==AV11HreLinMaq) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRELINMAQ" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV11HreLinMaq, 4, 0) );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      AV17GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV17GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV17GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV15TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV75Pgmname );
      AV15TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV15TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV14HTTPRequest.getScriptName()+"?"+AV14HTTPRequest.getQuerystring() );
      AV15TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "THISREA" );
      AV29Session.setValue("TrnContext", AV15TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_21_1602( boolean wbgen )
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
         wb_table1_21_1602e( true) ;
      }
      else
      {
         wb_table1_21_1602e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      AV7HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7HreBarCod), 8, 0));
      AV8HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarReo", GXutil.str( AV8HreBarReo, 1, 0));
      AV9HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreBarPar", AV9HreBarPar);
      AV10HreNumCie = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreNumCie), 2, 0));
      AV11HreLinMaq = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinMaq), 4, 0));
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
      pa1602( ) ;
      ws1602( ) ;
      we1602( ) ;
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
      sCtrlAV6EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV7HreBarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV8HreBarReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV9HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV10HreNumCie = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV11HreLinMaq = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1602( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcdetalledeproductosanyadidas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1602( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV6EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
         AV7HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7HreBarCod), 8, 0));
         AV8HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarReo", GXutil.str( AV8HreBarReo, 1, 0));
         AV9HreBarPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreBarPar", AV9HreBarPar);
         AV10HreNumCie = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreNumCie), 2, 0));
         AV11HreLinMaq = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinMaq), 4, 0));
      }
      wcpOAV6EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV6EmprCod") ;
      wcpOAV7HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV9HreBarPar") ;
      wcpOAV10HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV6EmprCod, wcpOAV6EmprCod) != 0 ) || ( AV7HreBarCod != wcpOAV7HreBarCod ) || ( AV8HreBarReo != wcpOAV8HreBarReo ) || ( GXutil.strcmp(AV9HreBarPar, wcpOAV9HreBarPar) != 0 ) || ( AV10HreNumCie != wcpOAV10HreNumCie ) || ( AV11HreLinMaq != wcpOAV11HreLinMaq ) ) )
      {
         setjustcreated();
      }
      wcpOAV6EmprCod = AV6EmprCod ;
      wcpOAV7HreBarCod = AV7HreBarCod ;
      wcpOAV8HreBarReo = AV8HreBarReo ;
      wcpOAV9HreBarPar = AV9HreBarPar ;
      wcpOAV10HreNumCie = AV10HreNumCie ;
      wcpOAV11HreLinMaq = AV11HreLinMaq ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV6EmprCod = httpContext.cgiGet( sPrefix+"AV6EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV6EmprCod) > 0 )
      {
         AV6EmprCod = httpContext.cgiGet( sCtrlAV6EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EmprCod", AV6EmprCod);
      }
      else
      {
         AV6EmprCod = httpContext.cgiGet( sPrefix+"AV6EmprCod_PARM") ;
      }
      sCtrlAV7HreBarCod = httpContext.cgiGet( sPrefix+"AV7HreBarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV7HreBarCod) > 0 )
      {
         AV7HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7HreBarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7HreBarCod), 8, 0));
      }
      else
      {
         AV7HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7HreBarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8HreBarReo = httpContext.cgiGet( sPrefix+"AV8HreBarReo_CTRL") ;
      if ( GXutil.len( sCtrlAV8HreBarReo) > 0 )
      {
         AV8HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8HreBarReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarReo", GXutil.str( AV8HreBarReo, 1, 0));
      }
      else
      {
         AV8HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8HreBarReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9HreBarPar = httpContext.cgiGet( sPrefix+"AV9HreBarPar_CTRL") ;
      if ( GXutil.len( sCtrlAV9HreBarPar) > 0 )
      {
         AV9HreBarPar = httpContext.cgiGet( sCtrlAV9HreBarPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreBarPar", AV9HreBarPar);
      }
      else
      {
         AV9HreBarPar = httpContext.cgiGet( sPrefix+"AV9HreBarPar_PARM") ;
      }
      sCtrlAV10HreNumCie = httpContext.cgiGet( sPrefix+"AV10HreNumCie_CTRL") ;
      if ( GXutil.len( sCtrlAV10HreNumCie) > 0 )
      {
         AV10HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10HreNumCie), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreNumCie), 2, 0));
      }
      else
      {
         AV10HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10HreNumCie_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11HreLinMaq = httpContext.cgiGet( sPrefix+"AV11HreLinMaq_CTRL") ;
      if ( GXutil.len( sCtrlAV11HreLinMaq) > 0 )
      {
         AV11HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11HreLinMaq), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinMaq), 4, 0));
      }
      else
      {
         AV11HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11HreLinMaq_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1602( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1602( ) ;
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
      ws1602( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6EmprCod_PARM", GXutil.rtrim( AV6EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6EmprCod_CTRL", GXutil.rtrim( sCtrlAV6EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7HreBarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV7HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7HreBarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7HreBarCod_CTRL", GXutil.rtrim( sCtrlAV7HreBarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HreBarReo_PARM", GXutil.ltrim( localUtil.ntoc( AV8HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8HreBarReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HreBarReo_CTRL", GXutil.rtrim( sCtrlAV8HreBarReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HreBarPar_PARM", GXutil.rtrim( AV9HreBarPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9HreBarPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HreBarPar_CTRL", GXutil.rtrim( sCtrlAV9HreBarPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HreNumCie_PARM", GXutil.ltrim( localUtil.ntoc( AV10HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10HreNumCie)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HreNumCie_CTRL", GXutil.rtrim( sCtrlAV10HreNumCie));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11HreLinMaq_PARM", GXutil.ltrim( localUtil.ntoc( AV11HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11HreLinMaq)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11HreLinMaq_CTRL", GXutil.rtrim( sCtrlAV11HreLinMaq));
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
      we1602( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562462", true, true);
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
      httpContext.AddJavascriptSource("wcdetalledeproductosanyadidas.js", "?202682115562462", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_292( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_29_idx ;
      edtHrdPrdDsc_Internalname = sPrefix+"HRDPRDDSC_"+sGXsfl_29_idx ;
      edtHreLanyCan_Internalname = sPrefix+"HRELANYCAN_"+sGXsfl_29_idx ;
      edtHrePrdCFin_Internalname = sPrefix+"HREPRDCFIN_"+sGXsfl_29_idx ;
      edtHreLanyNro_Internalname = sPrefix+"HRELANYNRO_"+sGXsfl_29_idx ;
      edtHreLanyTnq_Internalname = sPrefix+"HRELANYTNQ_"+sGXsfl_29_idx ;
      edtHreLanyUsr_Internalname = sPrefix+"HRELANYUSR_"+sGXsfl_29_idx ;
      edtHreLanyFec_Internalname = sPrefix+"HRELANYFEC_"+sGXsfl_29_idx ;
   }

   public void subsflControlProps_fel_292( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_29_fel_idx ;
      edtHrdPrdDsc_Internalname = sPrefix+"HRDPRDDSC_"+sGXsfl_29_fel_idx ;
      edtHreLanyCan_Internalname = sPrefix+"HRELANYCAN_"+sGXsfl_29_fel_idx ;
      edtHrePrdCFin_Internalname = sPrefix+"HREPRDCFIN_"+sGXsfl_29_fel_idx ;
      edtHreLanyNro_Internalname = sPrefix+"HRELANYNRO_"+sGXsfl_29_fel_idx ;
      edtHreLanyTnq_Internalname = sPrefix+"HRELANYTNQ_"+sGXsfl_29_fel_idx ;
      edtHreLanyUsr_Internalname = sPrefix+"HRELANYUSR_"+sGXsfl_29_fel_idx ;
      edtHreLanyFec_Internalname = sPrefix+"HRELANYFEC_"+sGXsfl_29_fel_idx ;
   }

   public void sendrow_292( )
   {
      subsflControlProps_292( ) ;
      wb1600( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_29_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_29_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_29_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrdPrdDsc_Internalname,GXutil.rtrim( A4510HrdPrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrdPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLanyCan_Internalname,GXutil.ltrim( localUtil.ntoc( A4513HreLanyCan, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4513HreLanyCan, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLanyCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdCFin_Internalname,GXutil.ltrim( localUtil.ntoc( A4511HrePrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4511HrePrdCFin, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdCFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLanyNro_Internalname,GXutil.ltrim( localUtil.ntoc( A4514HreLanyNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4514HreLanyNro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLanyNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLanyTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A4515HreLanyTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4515HreLanyTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLanyTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLanyUsr_Internalname,GXutil.rtrim( A4580HreLanyUsr),GXutil.rtrim( localUtil.format( A4580HreLanyUsr, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLanyUsr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLanyFec_Internalname,localUtil.ttoc( A4581HreLanyFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4581HreLanyFec, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLanyFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(29),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1602( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_29_idx = ((subGrid_Islastpage==1)&&(nGXsfl_29_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_29_idx+1) ;
         sGXsfl_29_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_29_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_292( ) ;
      }
      /* End function sendrow_292 */
   }

   public void startgridcontrol29( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"29\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Adicion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4510HrdPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4513HreLanyCan, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4511HrePrdCFin, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4514HreLanyNro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4515HreLanyTnq, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4580HreLanyUsr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4581HreLanyFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtHrdPrdDsc_Internalname = sPrefix+"HRDPRDDSC" ;
      edtHreLanyCan_Internalname = sPrefix+"HRELANYCAN" ;
      edtHrePrdCFin_Internalname = sPrefix+"HREPRDCFIN" ;
      edtHreLanyNro_Internalname = sPrefix+"HRELANYNRO" ;
      edtHreLanyTnq_Internalname = sPrefix+"HRELANYTNQ" ;
      edtHreLanyUsr_Internalname = sPrefix+"HRELANYUSR" ;
      edtHreLanyFec_Internalname = sPrefix+"HRELANYFEC" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_hrelanyfecauxdate_Internalname = sPrefix+"vDDO_HRELANYFECAUXDATE" ;
      divDdo_hrelanyfecauxdates_Internalname = sPrefix+"DDO_HRELANYFECAUXDATES" ;
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
      edtHreLanyFec_Jsonclick = "" ;
      edtHreLanyUsr_Jsonclick = "" ;
      edtHreLanyTnq_Jsonclick = "" ;
      edtHreLanyNro_Jsonclick = "" ;
      edtHrePrdCFin_Jsonclick = "" ;
      edtHreLanyCan_Jsonclick = "" ;
      edtHrdPrdDsc_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hrelanyfecauxdate_Jsonclick = "" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;Pesaje;Pesaje" ;
      Ddo_grid_Datalistproc = "WCDetalledeProductosAnyadidasGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||||Dynamic|" ;
      Ddo_grid_Includedatalist = "T|T|||||T|" ;
      Ddo_grid_Filterisrange = "||T|T|T|T||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Numeric|Character|Date" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9" ;
      Ddo_grid_Columnids = "0:PrdNum|1:HrdPrdDsc|2:HreLanyCan|3:HrePrdCFin|4:HreLanyNro|5:HreLanyTnq|6:HreLanyUsr|7:HreLanyFec" ;
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
      subGrid_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV33TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV34TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV35TFHrdPrdDsc',fld:'vTFHRDPRDDSC',pic:''},{av:'AV36TFHrdPrdDsc_Sel',fld:'vTFHRDPRDDSC_SEL',pic:''},{av:'AV37TFHreLanyCan',fld:'vTFHRELANYCAN',pic:'ZZZZZZ9.999'},{av:'AV38TFHreLanyCan_To',fld:'vTFHRELANYCAN_TO',pic:'ZZZZZZ9.999'},{av:'AV39TFHrePrdCFin',fld:'vTFHREPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV40TFHrePrdCFin_To',fld:'vTFHREPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV41TFHreLanyNro',fld:'vTFHRELANYNRO',pic:'Z9'},{av:'AV42TFHreLanyNro_To',fld:'vTFHRELANYNRO_TO',pic:'Z9'},{av:'AV43TFHreLanyTnq',fld:'vTFHRELANYTNQ',pic:'Z9'},{av:'AV44TFHreLanyTnq_To',fld:'vTFHRELANYTNQ_TO',pic:'Z9'},{av:'AV45TFHreLanyUsr',fld:'vTFHRELANYUSR',pic:'@!'},{av:'AV46TFHreLanyUsr_Sel',fld:'vTFHRELANYUSR_SEL',pic:'@!'},{av:'AV47TFHreLanyFec',fld:'vTFHRELANYFEC',pic:'99/99/99 99:99:99'},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV8HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV9HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV11HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e111602',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV8HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV9HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV11HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV33TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV34TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV35TFHrdPrdDsc',fld:'vTFHRDPRDDSC',pic:''},{av:'AV36TFHrdPrdDsc_Sel',fld:'vTFHRDPRDDSC_SEL',pic:''},{av:'AV37TFHreLanyCan',fld:'vTFHRELANYCAN',pic:'ZZZZZZ9.999'},{av:'AV38TFHreLanyCan_To',fld:'vTFHRELANYCAN_TO',pic:'ZZZZZZ9.999'},{av:'AV39TFHrePrdCFin',fld:'vTFHREPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV40TFHrePrdCFin_To',fld:'vTFHREPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV41TFHreLanyNro',fld:'vTFHRELANYNRO',pic:'Z9'},{av:'AV42TFHreLanyNro_To',fld:'vTFHRELANYNRO_TO',pic:'Z9'},{av:'AV43TFHreLanyTnq',fld:'vTFHRELANYTNQ',pic:'Z9'},{av:'AV44TFHreLanyTnq_To',fld:'vTFHRELANYTNQ_TO',pic:'Z9'},{av:'AV45TFHreLanyUsr',fld:'vTFHRELANYUSR',pic:'@!'},{av:'AV46TFHreLanyUsr_Sel',fld:'vTFHRELANYUSR_SEL',pic:'@!'},{av:'AV47TFHreLanyFec',fld:'vTFHRELANYFEC',pic:'99/99/99 99:99:99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFHreLanyFec',fld:'vTFHRELANYFEC',pic:'99/99/99 99:99:99'},{av:'AV45TFHreLanyUsr',fld:'vTFHRELANYUSR',pic:'@!'},{av:'AV46TFHreLanyUsr_Sel',fld:'vTFHRELANYUSR_SEL',pic:'@!'},{av:'AV43TFHreLanyTnq',fld:'vTFHRELANYTNQ',pic:'Z9'},{av:'AV44TFHreLanyTnq_To',fld:'vTFHRELANYTNQ_TO',pic:'Z9'},{av:'AV41TFHreLanyNro',fld:'vTFHRELANYNRO',pic:'Z9'},{av:'AV42TFHreLanyNro_To',fld:'vTFHRELANYNRO_TO',pic:'Z9'},{av:'AV39TFHrePrdCFin',fld:'vTFHREPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV40TFHrePrdCFin_To',fld:'vTFHREPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV37TFHreLanyCan',fld:'vTFHRELANYCAN',pic:'ZZZZZZ9.999'},{av:'AV38TFHreLanyCan_To',fld:'vTFHRELANYCAN_TO',pic:'ZZZZZZ9.999'},{av:'AV35TFHrdPrdDsc',fld:'vTFHRDPRDDSC',pic:''},{av:'AV36TFHrdPrdDsc_Sel',fld:'vTFHRDPRDDSC_SEL',pic:''},{av:'AV33TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV34TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e161602',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e121602',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e131602',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV33TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV34TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV35TFHrdPrdDsc',fld:'vTFHRDPRDDSC',pic:''},{av:'AV36TFHrdPrdDsc_Sel',fld:'vTFHRDPRDDSC_SEL',pic:''},{av:'AV37TFHreLanyCan',fld:'vTFHRELANYCAN',pic:'ZZZZZZ9.999'},{av:'AV38TFHreLanyCan_To',fld:'vTFHRELANYCAN_TO',pic:'ZZZZZZ9.999'},{av:'AV39TFHrePrdCFin',fld:'vTFHREPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV40TFHrePrdCFin_To',fld:'vTFHREPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV41TFHreLanyNro',fld:'vTFHRELANYNRO',pic:'Z9'},{av:'AV42TFHreLanyNro_To',fld:'vTFHRELANYNRO_TO',pic:'Z9'},{av:'AV43TFHreLanyTnq',fld:'vTFHRELANYTNQ',pic:'Z9'},{av:'AV44TFHreLanyTnq_To',fld:'vTFHRELANYTNQ_TO',pic:'Z9'},{av:'AV45TFHreLanyUsr',fld:'vTFHRELANYUSR',pic:'@!'},{av:'AV46TFHreLanyUsr_Sel',fld:'vTFHRELANYUSR_SEL',pic:'@!'},{av:'AV47TFHreLanyFec',fld:'vTFHRELANYFEC',pic:'99/99/99 99:99:99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV8HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV9HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV11HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV33TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV34TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV35TFHrdPrdDsc',fld:'vTFHRDPRDDSC',pic:''},{av:'AV36TFHrdPrdDsc_Sel',fld:'vTFHRDPRDDSC_SEL',pic:''},{av:'AV37TFHreLanyCan',fld:'vTFHRELANYCAN',pic:'ZZZZZZ9.999'},{av:'AV38TFHreLanyCan_To',fld:'vTFHRELANYCAN_TO',pic:'ZZZZZZ9.999'},{av:'AV39TFHrePrdCFin',fld:'vTFHREPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV40TFHrePrdCFin_To',fld:'vTFHREPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV41TFHreLanyNro',fld:'vTFHRELANYNRO',pic:'Z9'},{av:'AV42TFHreLanyNro_To',fld:'vTFHRELANYNRO_TO',pic:'Z9'},{av:'AV43TFHreLanyTnq',fld:'vTFHRELANYTNQ',pic:'Z9'},{av:'AV44TFHreLanyTnq_To',fld:'vTFHRELANYTNQ_TO',pic:'Z9'},{av:'AV45TFHreLanyUsr',fld:'vTFHRELANYUSR',pic:'@!'},{av:'AV46TFHreLanyUsr_Sel',fld:'vTFHRELANYUSR_SEL',pic:'@!'},{av:'AV47TFHreLanyFec',fld:'vTFHRELANYFEC',pic:'99/99/99 99:99:99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV8HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV9HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV11HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV33TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV34TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV35TFHrdPrdDsc',fld:'vTFHRDPRDDSC',pic:''},{av:'AV36TFHrdPrdDsc_Sel',fld:'vTFHRDPRDDSC_SEL',pic:''},{av:'AV37TFHreLanyCan',fld:'vTFHRELANYCAN',pic:'ZZZZZZ9.999'},{av:'AV38TFHreLanyCan_To',fld:'vTFHRELANYCAN_TO',pic:'ZZZZZZ9.999'},{av:'AV39TFHrePrdCFin',fld:'vTFHREPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV40TFHrePrdCFin_To',fld:'vTFHREPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV41TFHreLanyNro',fld:'vTFHRELANYNRO',pic:'Z9'},{av:'AV42TFHreLanyNro_To',fld:'vTFHRELANYNRO_TO',pic:'Z9'},{av:'AV43TFHreLanyTnq',fld:'vTFHRELANYTNQ',pic:'Z9'},{av:'AV44TFHreLanyTnq_To',fld:'vTFHRELANYTNQ_TO',pic:'Z9'},{av:'AV45TFHreLanyUsr',fld:'vTFHRELANYUSR',pic:'@!'},{av:'AV46TFHreLanyUsr_Sel',fld:'vTFHRELANYUSR_SEL',pic:'@!'},{av:'AV47TFHreLanyFec',fld:'vTFHRELANYFEC',pic:'99/99/99 99:99:99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV8HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV9HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV11HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV33TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV34TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV35TFHrdPrdDsc',fld:'vTFHRDPRDDSC',pic:''},{av:'AV36TFHrdPrdDsc_Sel',fld:'vTFHRDPRDDSC_SEL',pic:''},{av:'AV37TFHreLanyCan',fld:'vTFHRELANYCAN',pic:'ZZZZZZ9.999'},{av:'AV38TFHreLanyCan_To',fld:'vTFHRELANYCAN_TO',pic:'ZZZZZZ9.999'},{av:'AV39TFHrePrdCFin',fld:'vTFHREPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV40TFHrePrdCFin_To',fld:'vTFHREPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV41TFHreLanyNro',fld:'vTFHRELANYNRO',pic:'Z9'},{av:'AV42TFHreLanyNro_To',fld:'vTFHRELANYNRO_TO',pic:'Z9'},{av:'AV43TFHreLanyTnq',fld:'vTFHRELANYTNQ',pic:'Z9'},{av:'AV44TFHreLanyTnq_To',fld:'vTFHRELANYTNQ_TO',pic:'Z9'},{av:'AV45TFHreLanyUsr',fld:'vTFHRELANYUSR',pic:'@!'},{av:'AV46TFHreLanyUsr_Sel',fld:'vTFHRELANYUSR_SEL',pic:'@!'},{av:'AV47TFHreLanyFec',fld:'vTFHRELANYFEC',pic:'99/99/99 99:99:99'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV8HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV9HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV10HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV11HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hrelanyfec',iparms:[]");
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
      wcpOAV6EmprCod = "" ;
      wcpOAV9HreBarPar = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV6EmprCod = "" ;
      AV9HreBarPar = "" ;
      AV33TFPrdNum = "" ;
      AV34TFPrdNum_Sel = "" ;
      AV35TFHrdPrdDsc = "" ;
      AV36TFHrdPrdDsc_Sel = "" ;
      AV37TFHreLanyCan = DecimalUtil.ZERO ;
      AV38TFHreLanyCan_To = DecimalUtil.ZERO ;
      AV39TFHrePrdCFin = DecimalUtil.ZERO ;
      AV40TFHrePrdCFin_To = DecimalUtil.ZERO ;
      AV45TFHreLanyUsr = "" ;
      AV46TFHreLanyUsr_Sel = "" ;
      AV47TFHreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      AV75Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV51DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV49DDO_HreLanyFecAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV60Wcdetalledeproductosanyadidasds_1_tfprdnum = "" ;
      AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = "" ;
      AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = "" ;
      AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = "" ;
      AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan = DecimalUtil.ZERO ;
      AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = DecimalUtil.ZERO ;
      AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = DecimalUtil.ZERO ;
      AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = DecimalUtil.ZERO ;
      AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = "" ;
      AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = "" ;
      AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = GXutil.resetTime( GXutil.nullDate() );
      A719PrdNum = "" ;
      A4510HrdPrdDsc = "" ;
      A4513HreLanyCan = DecimalUtil.ZERO ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A4580HreLanyUsr = "" ;
      A4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV60Wcdetalledeproductosanyadidasds_1_tfprdnum = "" ;
      lV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = "" ;
      lV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      H01602_A396EmprCod = new String[] {""} ;
      H01602_A4492HreBarCod = new int[1] ;
      H01602_A4493HreBarReo = new byte[1] ;
      H01602_A4494HreBarPar = new String[] {""} ;
      H01602_A4495HreNumCie = new byte[1] ;
      H01602_A4508HreLinMAL = new short[1] ;
      H01602_A4509HreNumAny = new byte[1] ;
      H01602_A4581HreLanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01602_n4581HreLanyFec = new boolean[] {false} ;
      H01602_A4580HreLanyUsr = new String[] {""} ;
      H01602_n4580HreLanyUsr = new boolean[] {false} ;
      H01602_A4515HreLanyTnq = new byte[1] ;
      H01602_n4515HreLanyTnq = new boolean[] {false} ;
      H01602_A4514HreLanyNro = new byte[1] ;
      H01602_n4514HreLanyNro = new boolean[] {false} ;
      H01602_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01602_n4511HrePrdCFin = new boolean[] {false} ;
      H01602_A4513HreLanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01602_n4513HreLanyCan = new boolean[] {false} ;
      H01602_A4510HrdPrdDsc = new String[] {""} ;
      H01602_n4510HrdPrdDsc = new boolean[] {false} ;
      H01602_A719PrdNum = new String[] {""} ;
      H01603_AGRID_nRecordCount = new long[1] ;
      AV57Station = "" ;
      AV58Emprnom = "" ;
      AV59Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV23ExcelFilename = "" ;
      AV24ErrorMessage = "" ;
      AV29Session = httpContext.getWebSession();
      AV17GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV18GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char9 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char8 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState10 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV15TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV6EmprCod = "" ;
      sCtrlAV7HreBarCod = "" ;
      sCtrlAV8HreBarReo = "" ;
      sCtrlAV9HreBarPar = "" ;
      sCtrlAV10HreNumCie = "" ;
      sCtrlAV11HreLinMaq = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdetalledeproductosanyadidas__default(),
         new Object[] {
             new Object[] {
            H01602_A396EmprCod, H01602_A4492HreBarCod, H01602_A4493HreBarReo, H01602_A4494HreBarPar, H01602_A4495HreNumCie, H01602_A4508HreLinMAL, H01602_A4509HreNumAny, H01602_A4581HreLanyFec, H01602_n4581HreLanyFec, H01602_A4580HreLanyUsr,
            H01602_n4580HreLanyUsr, H01602_A4515HreLanyTnq, H01602_n4515HreLanyTnq, H01602_A4514HreLanyNro, H01602_n4514HreLanyNro, H01602_A4511HrePrdCFin, H01602_n4511HrePrdCFin, H01602_A4513HreLanyCan, H01602_n4513HreLanyCan, H01602_A4510HrdPrdDsc,
            H01602_n4510HrdPrdDsc, H01602_A719PrdNum
            }
            , new Object[] {
            H01603_AGRID_nRecordCount
            }
         }
      );
      AV75Pgmname = "WCDetalledeProductosAnyadidas" ;
      /* GeneXus formulas. */
      AV75Pgmname = "WCDetalledeProductosAnyadidas" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV8HreBarReo ;
   private byte wcpOAV10HreNumCie ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV8HreBarReo ;
   private byte AV10HreNumCie ;
   private byte AV41TFHreLanyNro ;
   private byte AV42TFHreLanyNro_To ;
   private byte AV43TFHreLanyTnq ;
   private byte AV44TFHreLanyTnq_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro ;
   private byte AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ;
   private byte AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ;
   private byte AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ;
   private byte A4514HreLanyNro ;
   private byte A4515HreLanyTnq ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4509HreNumAny ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV11HreLinMaq ;
   private short AV11HreLinMaq ;
   private short AV19OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A4508HreLinMAL ;
   private int wcpOAV7HreBarCod ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_29 ;
   private int AV7HreBarCod ;
   private int nGXsfl_29_idx=1 ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A4492HreBarCod ;
   private int AV76GXV1 ;
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
   private java.math.BigDecimal AV37TFHreLanyCan ;
   private java.math.BigDecimal AV38TFHreLanyCan_To ;
   private java.math.BigDecimal AV39TFHrePrdCFin ;
   private java.math.BigDecimal AV40TFHrePrdCFin_To ;
   private java.math.BigDecimal AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan ;
   private java.math.BigDecimal AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ;
   private java.math.BigDecimal AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ;
   private java.math.BigDecimal AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ;
   private java.math.BigDecimal A4513HreLanyCan ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private String wcpOAV6EmprCod ;
   private String wcpOAV9HreBarPar ;
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
   private String AV6EmprCod ;
   private String AV9HreBarPar ;
   private String sGXsfl_29_idx="0001" ;
   private String AV33TFPrdNum ;
   private String AV34TFPrdNum_Sel ;
   private String AV35TFHrdPrdDsc ;
   private String AV36TFHrdPrdDsc_Sel ;
   private String AV45TFHreLanyUsr ;
   private String AV46TFHreLanyUsr_Sel ;
   private String AV75Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
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
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_hrelanyfecauxdates_Internalname ;
   private String edtavDdo_hrelanyfecauxdate_Internalname ;
   private String edtavDdo_hrelanyfecauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV60Wcdetalledeproductosanyadidasds_1_tfprdnum ;
   private String AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ;
   private String AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ;
   private String AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ;
   private String AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ;
   private String AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A4510HrdPrdDsc ;
   private String edtHrdPrdDsc_Internalname ;
   private String edtHreLanyCan_Internalname ;
   private String edtHrePrdCFin_Internalname ;
   private String edtHreLanyNro_Internalname ;
   private String edtHreLanyTnq_Internalname ;
   private String A4580HreLanyUsr ;
   private String edtHreLanyUsr_Internalname ;
   private String edtHreLanyFec_Internalname ;
   private String scmdbuf ;
   private String lV60Wcdetalledeproductosanyadidasds_1_tfprdnum ;
   private String lV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ;
   private String lV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String AV57Station ;
   private String AV58Emprnom ;
   private String AV59Usurcod ;
   private String GXt_char9 ;
   private String GXv_char4[] ;
   private String GXt_char8 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV6EmprCod ;
   private String sCtrlAV7HreBarCod ;
   private String sCtrlAV8HreBarReo ;
   private String sCtrlAV9HreBarPar ;
   private String sCtrlAV10HreNumCie ;
   private String sCtrlAV11HreLinMaq ;
   private String sGXsfl_29_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtHrdPrdDsc_Jsonclick ;
   private String edtHreLanyCan_Jsonclick ;
   private String edtHrePrdCFin_Jsonclick ;
   private String edtHreLanyNro_Jsonclick ;
   private String edtHreLanyTnq_Jsonclick ;
   private String edtHreLanyUsr_Jsonclick ;
   private String edtHreLanyFec_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV47TFHreLanyFec ;
   private java.util.Date AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ;
   private java.util.Date A4581HreLanyFec ;
   private java.util.Date AV49DDO_HreLanyFecAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV20OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4510HrdPrdDsc ;
   private boolean n4513HreLanyCan ;
   private boolean n4511HrePrdCFin ;
   private boolean n4514HreLanyNro ;
   private boolean n4515HreLanyTnq ;
   private boolean n4580HreLanyUsr ;
   private boolean n4581HreLanyFec ;
   private boolean bGXsfl_29_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV23ExcelFilename ;
   private String AV24ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV14HTTPRequest ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private IDataStoreProvider pr_default ;
   private String[] H01602_A396EmprCod ;
   private int[] H01602_A4492HreBarCod ;
   private byte[] H01602_A4493HreBarReo ;
   private String[] H01602_A4494HreBarPar ;
   private byte[] H01602_A4495HreNumCie ;
   private short[] H01602_A4508HreLinMAL ;
   private byte[] H01602_A4509HreNumAny ;
   private java.util.Date[] H01602_A4581HreLanyFec ;
   private boolean[] H01602_n4581HreLanyFec ;
   private String[] H01602_A4580HreLanyUsr ;
   private boolean[] H01602_n4580HreLanyUsr ;
   private byte[] H01602_A4515HreLanyTnq ;
   private boolean[] H01602_n4515HreLanyTnq ;
   private byte[] H01602_A4514HreLanyNro ;
   private boolean[] H01602_n4514HreLanyNro ;
   private java.math.BigDecimal[] H01602_A4511HrePrdCFin ;
   private boolean[] H01602_n4511HrePrdCFin ;
   private java.math.BigDecimal[] H01602_A4513HreLanyCan ;
   private boolean[] H01602_n4513HreLanyCan ;
   private String[] H01602_A4510HrdPrdDsc ;
   private boolean[] H01602_n4510HrdPrdDsc ;
   private String[] H01602_A719PrdNum ;
   private long[] H01603_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV51DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV17GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState10[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV18GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV15TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wcdetalledeproductosanyadidas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01602( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                          String AV60Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                          String AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                          String AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                          java.math.BigDecimal AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                          java.math.BigDecimal AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                          java.math.BigDecimal AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                          java.math.BigDecimal AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                          byte AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro ,
                                          byte AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ,
                                          byte AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ,
                                          byte AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ,
                                          String AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                          String AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                          java.util.Date AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          java.math.BigDecimal A4513HreLanyCan ,
                                          java.math.BigDecimal A4511HrePrdCFin ,
                                          byte A4514HreLanyNro ,
                                          byte A4515HreLanyTnq ,
                                          String A4580HreLanyUsr ,
                                          java.util.Date A4581HreLanyFec ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String AV6EmprCod ,
                                          int AV7HreBarCod ,
                                          byte AV8HreBarReo ,
                                          String AV9HreBarPar ,
                                          byte AV10HreNumCie ,
                                          short AV11HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4508HreLinMAL )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[26];
      Object[] GXv_Object12 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, HreLanyFec, HreLanyUsr, HreLanyTnq, HreLanyNro, HrePrdCFin, HreLanyCan, HrdPrdDsc, PrdNum" ;
      sFromString = " FROM TXPHISREA" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ?)");
      if ( (GXutil.strcmp("", AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcdetalledeproductosanyadidasds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro) )
      {
         addWhere(sWhereString, "(HreLanyNro >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) )
      {
         addWhere(sWhereString, "(HreLanyNro <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) )
      {
         addWhere(sWhereString, "(HreLanyTnq >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) )
      {
         addWhere(sWhereString, "(HreLanyTnq <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLanyUsr = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec) )
      {
         addWhere(sWhereString, "(HreLanyFec >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( AV19OrderedBy == 1 )
      {
         sOrderString += " ORDER BY HreNumAny" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY PrdNum" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HrdPrdDsc" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HrdPrdDsc DESC" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HreLanyCan" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreLanyCan DESC" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HrePrdCFin" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HrePrdCFin DESC" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HreLanyNro" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreLanyNro DESC" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HreLanyTnq" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreLanyTnq DESC" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HreLanyUsr" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreLanyUsr DESC" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HreLanyFec" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreLanyFec DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H01603( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                          String AV60Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                          String AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                          String AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                          java.math.BigDecimal AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                          java.math.BigDecimal AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                          java.math.BigDecimal AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                          java.math.BigDecimal AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                          byte AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro ,
                                          byte AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ,
                                          byte AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ,
                                          byte AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ,
                                          String AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                          String AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                          java.util.Date AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          java.math.BigDecimal A4513HreLanyCan ,
                                          java.math.BigDecimal A4511HrePrdCFin ,
                                          byte A4514HreLanyNro ,
                                          byte A4515HreLanyTnq ,
                                          String A4580HreLanyUsr ,
                                          java.util.Date A4581HreLanyFec ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String AV6EmprCod ,
                                          int AV7HreBarCod ,
                                          byte AV8HreBarReo ,
                                          String AV9HreBarPar ,
                                          byte AV10HreNumCie ,
                                          short AV11HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4508HreLinMAL )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[21];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPHISREA" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMAL = ?)");
      if ( (GXutil.strcmp("", AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Wcdetalledeproductosanyadidasds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcdetalledeproductosanyadidasds_3_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wcdetalledeproductosanyadidasds_5_tfhrelanycan)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan >= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan <= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wcdetalledeproductosanyadidasds_7_tfhreprdcfin)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin >= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin <= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcdetalledeproductosanyadidasds_9_tfhrelanynro) )
      {
         addWhere(sWhereString, "(HreLanyNro >= ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) )
      {
         addWhere(sWhereString, "(HreLanyNro <= ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) )
      {
         addWhere(sWhereString, "(HreLanyTnq >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) )
      {
         addWhere(sWhereString, "(HreLanyTnq <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcdetalledeproductosanyadidasds_13_tfhrelanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLanyUsr = ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Wcdetalledeproductosanyadidasds_15_tfhrelanyfec) )
      {
         addWhere(sWhereString, "(HreLanyFec >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV19OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ! AV20OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ! AV20OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ! AV20OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ! AV20OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ! AV20OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ! AV20OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ! AV20OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ! AV20OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ( AV20OrderedDsc ) )
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

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H01602(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).shortValue() );
            case 1 :
                  return conditional_H01603(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01602", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01603", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 6);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               return;
      }
   }

}

