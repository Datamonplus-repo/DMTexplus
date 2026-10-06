package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcdetalleproductos_impl extends GXWebComponent
{
   public wcdetalleproductos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcdetalleproductos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdetalleproductos_impl.class ));
   }

   public wcdetalleproductos_impl( int remoteHandle ,
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
      cmbavGrupodeacciones = new HTMLChoice();
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
               AV11HreLinPro = (byte)(GXutil.lval( httpContext.GetPar( "HreLinPro"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HreLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinPro), 2, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,Integer.valueOf(AV6HreBarCod),Byte.valueOf(AV7HreBarReo),AV8HreBarPar,Byte.valueOf(AV9HreNumCie),Short.valueOf(AV10HreLinMaq),Byte.valueOf(AV11HreLinPro)});
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
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
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
      AV11HreLinPro = (byte)(GXutil.lval( httpContext.GetPar( "HreLinPro"))) ;
      AV62TFHreRecLin = (short)(GXutil.lval( httpContext.GetPar( "TFHreRecLin"))) ;
      AV63TFHreRecLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFHreRecLin_To"))) ;
      AV36TFHrePrdNum = httpContext.GetPar( "TFHrePrdNum") ;
      AV37TFHrePrdNum_Sel = httpContext.GetPar( "TFHrePrdNum_Sel") ;
      AV38TFHrePrdDsc = httpContext.GetPar( "TFHrePrdDsc") ;
      AV39TFHrePrdDsc_Sel = httpContext.GetPar( "TFHrePrdDsc_Sel") ;
      AV42TFHreFacCon = CommonUtil.decimalVal( httpContext.GetPar( "TFHreFacCon"), ".") ;
      AV43TFHreFacCon_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreFacCon_To"), ".") ;
      AV44TFHrePrdUDs = httpContext.GetPar( "TFHrePrdUDs") ;
      AV45TFHrePrdUDs_Sel = httpContext.GetPar( "TFHrePrdUDs_Sel") ;
      AV46TFHrePrdCant = CommonUtil.decimalVal( httpContext.GetPar( "TFHrePrdCant"), ".") ;
      AV47TFHrePrdCant_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHrePrdCant_To"), ".") ;
      AV50TFHreCanAny = CommonUtil.decimalVal( httpContext.GetPar( "TFHreCanAny"), ".") ;
      AV51TFHreCanAny_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreCanAny_To"), ".") ;
      AV52TFHreForNro = (byte)(GXutil.lval( httpContext.GetPar( "TFHreForNro"))) ;
      AV53TFHreForNro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHreForNro_To"))) ;
      AV54TFHrePrdTnq = (byte)(GXutil.lval( httpContext.GetPar( "TFHrePrdTnq"))) ;
      AV55TFHrePrdTnq_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHrePrdTnq_To"))) ;
      AV56TFHreLinUsr = httpContext.GetPar( "TFHreLinUsr") ;
      AV57TFHreLinUsr_Sel = httpContext.GetPar( "TFHreLinUsr_Sel") ;
      AV97Pgmname = httpContext.GetPar( "Pgmname") ;
      AV19OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV20OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV66PwdGrl = (byte)(GXutil.lval( httpContext.GetPar( "PwdGrl"))) ;
      AV67ContVal = (int)(GXutil.lval( httpContext.GetPar( "ContVal"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV11HreLinPro, AV62TFHreRecLin, AV63TFHreRecLin_To, AV36TFHrePrdNum, AV37TFHrePrdNum_Sel, AV38TFHrePrdDsc, AV39TFHrePrdDsc_Sel, AV42TFHreFacCon, AV43TFHreFacCon_To, AV44TFHrePrdUDs, AV45TFHrePrdUDs_Sel, AV46TFHrePrdCant, AV47TFHrePrdCant_To, AV50TFHreCanAny, AV51TFHreCanAny_To, AV52TFHreForNro, AV53TFHreForNro_To, AV54TFHrePrdTnq, AV55TFHrePrdTnq_To, AV56TFHreLinUsr, AV57TFHreLinUsr_Sel, AV97Pgmname, AV19OrderedBy, AV20OrderedDsc, AV66PwdGrl, AV67ContVal, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa15Z2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Historico Recetas (Detalle)", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcdetalleproductos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10HreLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11HreLinPro,2,0))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq","HreLinPro"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV97Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV66PwdGrl), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV67ContVal), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_32, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6HreBarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV6HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7HreBarReo", GXutil.ltrim( localUtil.ntoc( wcpOAV7HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8HreBarPar", GXutil.rtrim( wcpOAV8HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9HreNumCie", GXutil.ltrim( localUtil.ntoc( wcpOAV9HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10HreLinMaq", GXutil.ltrim( localUtil.ntoc( wcpOAV10HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11HreLinPro", GXutil.ltrim( localUtil.ntoc( wcpOAV11HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV6HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV7HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARPAR", GXutil.rtrim( AV8HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV9HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRELINMAQ", GXutil.ltrim( localUtil.ntoc( AV10HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRELINPRO", GXutil.ltrim( localUtil.ntoc( AV11HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRERECLIN", GXutil.ltrim( localUtil.ntoc( AV62TFHreRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRERECLIN_TO", GXutil.ltrim( localUtil.ntoc( AV63TFHreRecLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDNUM", GXutil.rtrim( AV36TFHrePrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDNUM_SEL", GXutil.rtrim( AV37TFHrePrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDDSC", GXutil.rtrim( AV38TFHrePrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDDSC_SEL", GXutil.rtrim( AV39TFHrePrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREFACCON", GXutil.ltrim( localUtil.ntoc( AV42TFHreFacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREFACCON_TO", GXutil.ltrim( localUtil.ntoc( AV43TFHreFacCon_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDUDS", GXutil.rtrim( AV44TFHrePrdUDs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDUDS_SEL", GXutil.rtrim( AV45TFHrePrdUDs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDCANT", GXutil.ltrim( localUtil.ntoc( AV46TFHrePrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDCANT_TO", GXutil.ltrim( localUtil.ntoc( AV47TFHrePrdCant_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRECANANY", GXutil.ltrim( localUtil.ntoc( AV50TFHreCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRECANANY_TO", GXutil.ltrim( localUtil.ntoc( AV51TFHreCanAny_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREFORNRO", GXutil.ltrim( localUtil.ntoc( AV52TFHreForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREFORNRO_TO", GXutil.ltrim( localUtil.ntoc( AV53TFHreForNro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDTNQ", GXutil.ltrim( localUtil.ntoc( AV54TFHrePrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREPRDTNQ_TO", GXutil.ltrim( localUtil.ntoc( AV55TFHrePrdTnq_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELINUSR", GXutil.rtrim( AV56TFHreLinUsr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELINUSR_SEL", GXutil.rtrim( AV57TFHreLinUsr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV97Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV97Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV19OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV20OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECANFIN", GXutil.ltrim( localUtil.ntoc( A4564HreCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREPESFEC", localUtil.ttoc( A4583HrePesFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV66PwdGrl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV66PwdGrl), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV67ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV67ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vREFRESCAR", AV71Refrescar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vOBJETOREFRESCAR", AV70ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vOBJETOREFRESCAR", AV70ObjetoRefrescar);
      }
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

   public void renderHtmlCloseForm15Z2( )
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
      return "WCDetalleProductos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Historico Recetas (Detalle)", "") ;
   }

   public void wb15Z0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcdetalleproductos");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 32, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCDetalleProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 32, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCDetalleProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_15Z2( true) ;
      }
      else
      {
         wb_table1_21_15Z2( false) ;
      }
      return  ;
   }

   public void wb_table1_21_15Z2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-8 col-sm-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol32( ) ;
      }
      if ( wbEnd == 32 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_32 = (int)(nGXsfl_32_idx-1) ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 32 )
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

   public void start15Z2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Historico Recetas (Detalle)", ""), (short)(0)) ;
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
            strup15Z0( ) ;
         }
      }
   }

   public void ws15Z2( )
   {
      start15Z2( ) ;
      evt15Z2( ) ;
   }

   public void evt15Z2( )
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
                              strup15Z0( ) ;
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
                              strup15Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1115Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1215Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1315Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESCAROBJETO") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1415Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Z0( ) ;
                           }
                           AV77Wcdetalleproductosds_1_tfhrereclin = AV62TFHreRecLin ;
                           AV78Wcdetalleproductosds_2_tfhrereclin_to = AV63TFHreRecLin_To ;
                           AV79Wcdetalleproductosds_3_tfhreprdnum = AV36TFHrePrdNum ;
                           AV80Wcdetalleproductosds_4_tfhreprdnum_sel = AV37TFHrePrdNum_Sel ;
                           AV81Wcdetalleproductosds_5_tfhreprddsc = AV38TFHrePrdDsc ;
                           AV82Wcdetalleproductosds_6_tfhreprddsc_sel = AV39TFHrePrdDsc_Sel ;
                           AV83Wcdetalleproductosds_7_tfhrefaccon = AV42TFHreFacCon ;
                           AV84Wcdetalleproductosds_8_tfhrefaccon_to = AV43TFHreFacCon_To ;
                           AV85Wcdetalleproductosds_9_tfhreprduds = AV44TFHrePrdUDs ;
                           AV86Wcdetalleproductosds_10_tfhreprduds_sel = AV45TFHrePrdUDs_Sel ;
                           AV87Wcdetalleproductosds_11_tfhreprdcant = AV46TFHrePrdCant ;
                           AV88Wcdetalleproductosds_12_tfhreprdcant_to = AV47TFHrePrdCant_To ;
                           AV89Wcdetalleproductosds_13_tfhrecanany = AV50TFHreCanAny ;
                           AV90Wcdetalleproductosds_14_tfhrecanany_to = AV51TFHreCanAny_To ;
                           AV91Wcdetalleproductosds_15_tfhrefornro = AV52TFHreForNro ;
                           AV92Wcdetalleproductosds_16_tfhrefornro_to = AV53TFHreForNro_To ;
                           AV93Wcdetalleproductosds_17_tfhreprdtnq = AV54TFHrePrdTnq ;
                           AV94Wcdetalleproductosds_18_tfhreprdtnq_to = AV55TFHrePrdTnq_To ;
                           AV95Wcdetalleproductosds_19_tfhrelinusr = AV56TFHreLinUsr ;
                           AV96Wcdetalleproductosds_20_tfhrelinusr_sel = AV57TFHreLinUsr_Sel ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15Z0( ) ;
                           }
                           nGXsfl_32_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_322( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV64Grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Grupodeacciones), 4, 0));
                           A4557HreRecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtHreRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4558HrePrdNum = httpContext.cgiGet( edtHrePrdNum_Internalname) ;
                           n4558HrePrdNum = false ;
                           A4559HrePrdDsc = httpContext.cgiGet( edtHrePrdDsc_Internalname) ;
                           n4559HrePrdDsc = false ;
                           A4562HreFacCon = localUtil.ctond( httpContext.cgiGet( edtHreFacCon_Internalname)) ;
                           n4562HreFacCon = false ;
                           A4560HrePrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtHrePrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4560HrePrdUMe = false ;
                           A4561HrePrdUDs = httpContext.cgiGet( edtHrePrdUDs_Internalname) ;
                           n4561HrePrdUDs = false ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHrecanfin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHrecanfin_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRECANFIN");
                              GX_FocusControl = edtavHrecanfin_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV23HreCanFin = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecanfin_Internalname, GXutil.ltrimstr( AV23HreCanFin, 11, 3));
                           }
                           else
                           {
                              AV23HreCanFin = localUtil.ctond( httpContext.cgiGet( edtavHrecanfin_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecanfin_Internalname, GXutil.ltrimstr( AV23HreCanFin, 11, 3));
                           }
                           A4563HrePrdCant = localUtil.ctond( httpContext.cgiGet( edtHrePrdCant_Internalname)) ;
                           n4563HrePrdCant = false ;
                           A4565HreCanAny = localUtil.ctond( httpContext.cgiGet( edtHreCanAny_Internalname)) ;
                           n4565HreCanAny = false ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORC");
                              GX_FocusControl = edtavPorc_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV24Porc = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV24Porc, 6, 2));
                           }
                           else
                           {
                              AV24Porc = localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV24Porc, 6, 2));
                           }
                           A4566HreForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4566HreForNro = false ;
                           A4567HrePrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtHrePrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4567HrePrdTnq = false ;
                           A4582HreLinUsr = GXutil.upper( httpContext.cgiGet( edtHreLinUsr_Internalname)) ;
                           n4582HreLinUsr = false ;
                           AV25FechaPes = httpContext.cgiGet( edtavFechapes_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFechapes_Internalname, AV25FechaPes);
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1515Z2 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1615Z2 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1715Z2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1815Z2 ();
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
                                    strup15Z0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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

   public void we15Z2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm15Z2( ) ;
         }
      }
   }

   public void pa15Z2( )
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

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_322( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         sendrow_322( ) ;
         nGXsfl_32_idx = ((subGrid_Islastpage==1)&&(nGXsfl_32_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_322( ) ;
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
                                 byte AV11HreLinPro ,
                                 short AV62TFHreRecLin ,
                                 short AV63TFHreRecLin_To ,
                                 String AV36TFHrePrdNum ,
                                 String AV37TFHrePrdNum_Sel ,
                                 String AV38TFHrePrdDsc ,
                                 String AV39TFHrePrdDsc_Sel ,
                                 java.math.BigDecimal AV42TFHreFacCon ,
                                 java.math.BigDecimal AV43TFHreFacCon_To ,
                                 String AV44TFHrePrdUDs ,
                                 String AV45TFHrePrdUDs_Sel ,
                                 java.math.BigDecimal AV46TFHrePrdCant ,
                                 java.math.BigDecimal AV47TFHrePrdCant_To ,
                                 java.math.BigDecimal AV50TFHreCanAny ,
                                 java.math.BigDecimal AV51TFHreCanAny_To ,
                                 byte AV52TFHreForNro ,
                                 byte AV53TFHreForNro_To ,
                                 byte AV54TFHrePrdTnq ,
                                 byte AV55TFHrePrdTnq_To ,
                                 String AV56TFHreLinUsr ,
                                 String AV57TFHreLinUsr_Sel ,
                                 String AV97Pgmname ,
                                 short AV19OrderedBy ,
                                 boolean AV20OrderedDsc ,
                                 byte AV66PwdGrl ,
                                 int AV67ContVal ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1615Z2 ();
      GRID_nCurrentRecord = 0 ;
      rf15Z2( ) ;
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf15Z2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV97Pgmname = "WCDetalleProductos" ;
      Gx_err = (short)(0) ;
      edtavHrecanfin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecanfin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrecanfin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavFechapes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFechapes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechapes_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void rf15Z2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(32) ;
      /* Execute user event: Refresh */
      e1615Z2 ();
      nGXsfl_32_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_322( ) ;
      bGXsfl_32_Refreshing = true ;
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
         subsflControlProps_322( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV77Wcdetalleproductosds_1_tfhrereclin) ,
                                              Short.valueOf(AV78Wcdetalleproductosds_2_tfhrereclin_to) ,
                                              AV80Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                              AV79Wcdetalleproductosds_3_tfhreprdnum ,
                                              AV82Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                              AV81Wcdetalleproductosds_5_tfhreprddsc ,
                                              AV83Wcdetalleproductosds_7_tfhrefaccon ,
                                              AV84Wcdetalleproductosds_8_tfhrefaccon_to ,
                                              AV86Wcdetalleproductosds_10_tfhreprduds_sel ,
                                              AV85Wcdetalleproductosds_9_tfhreprduds ,
                                              AV87Wcdetalleproductosds_11_tfhreprdcant ,
                                              AV88Wcdetalleproductosds_12_tfhreprdcant_to ,
                                              AV89Wcdetalleproductosds_13_tfhrecanany ,
                                              AV90Wcdetalleproductosds_14_tfhrecanany_to ,
                                              Byte.valueOf(AV91Wcdetalleproductosds_15_tfhrefornro) ,
                                              Byte.valueOf(AV92Wcdetalleproductosds_16_tfhrefornro_to) ,
                                              Byte.valueOf(AV93Wcdetalleproductosds_17_tfhreprdtnq) ,
                                              Byte.valueOf(AV94Wcdetalleproductosds_18_tfhreprdtnq_to) ,
                                              AV96Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                              AV95Wcdetalleproductosds_19_tfhrelinusr ,
                                              Short.valueOf(A4557HreRecLin) ,
                                              A4558HrePrdNum ,
                                              A4559HrePrdDsc ,
                                              A4562HreFacCon ,
                                              A4561HrePrdUDs ,
                                              A4563HrePrdCant ,
                                              A4565HreCanAny ,
                                              Byte.valueOf(A4566HreForNro) ,
                                              Byte.valueOf(A4567HrePrdTnq) ,
                                              A4582HreLinUsr ,
                                              Short.valueOf(AV19OrderedBy) ,
                                              Boolean.valueOf(AV20OrderedDsc) ,
                                              AV5EmprCod ,
                                              Integer.valueOf(AV6HreBarCod) ,
                                              Byte.valueOf(AV7HreBarReo) ,
                                              AV8HreBarPar ,
                                              Byte.valueOf(AV9HreNumCie) ,
                                              Short.valueOf(AV10HreLinMaq) ,
                                              Byte.valueOf(AV11HreLinPro) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A4492HreBarCod) ,
                                              Byte.valueOf(A4493HreBarReo) ,
                                              A4494HreBarPar ,
                                              Byte.valueOf(A4495HreNumCie) ,
                                              Short.valueOf(A4545HreLinMaq) ,
                                              Byte.valueOf(A4550HreLinPro) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                              TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE
                                              }
         });
         lV79Wcdetalleproductosds_3_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV79Wcdetalleproductosds_3_tfhreprdnum), 6, "%") ;
         lV81Wcdetalleproductosds_5_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV81Wcdetalleproductosds_5_tfhreprddsc), 26, "%") ;
         lV85Wcdetalleproductosds_9_tfhreprduds = GXutil.padr( GXutil.rtrim( AV85Wcdetalleproductosds_9_tfhreprduds), 5, "%") ;
         lV95Wcdetalleproductosds_19_tfhrelinusr = GXutil.padr( GXutil.rtrim( AV95Wcdetalleproductosds_19_tfhrelinusr), 8, "%") ;
         /* Using cursor H015Z2 */
         pr_default.execute(0, new Object[] {AV5EmprCod, Integer.valueOf(AV6HreBarCod), Byte.valueOf(AV7HreBarReo), AV8HreBarPar, Byte.valueOf(AV9HreNumCie), Short.valueOf(AV10HreLinMaq), Byte.valueOf(AV11HreLinPro), Short.valueOf(AV77Wcdetalleproductosds_1_tfhrereclin), Short.valueOf(AV78Wcdetalleproductosds_2_tfhrereclin_to), lV79Wcdetalleproductosds_3_tfhreprdnum, AV80Wcdetalleproductosds_4_tfhreprdnum_sel, lV81Wcdetalleproductosds_5_tfhreprddsc, AV82Wcdetalleproductosds_6_tfhreprddsc_sel, AV83Wcdetalleproductosds_7_tfhrefaccon, AV84Wcdetalleproductosds_8_tfhrefaccon_to, lV85Wcdetalleproductosds_9_tfhreprduds, AV86Wcdetalleproductosds_10_tfhreprduds_sel, AV87Wcdetalleproductosds_11_tfhreprdcant, AV88Wcdetalleproductosds_12_tfhreprdcant_to, AV89Wcdetalleproductosds_13_tfhrecanany, AV90Wcdetalleproductosds_14_tfhrecanany_to, Byte.valueOf(AV91Wcdetalleproductosds_15_tfhrefornro), Byte.valueOf(AV92Wcdetalleproductosds_16_tfhrefornro_to), Byte.valueOf(AV93Wcdetalleproductosds_17_tfhreprdtnq), Byte.valueOf(AV94Wcdetalleproductosds_18_tfhreprdtnq_to), lV95Wcdetalleproductosds_19_tfhrelinusr, AV96Wcdetalleproductosds_20_tfhrelinusr_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_32_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_322( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H015Z2_A396EmprCod[0] ;
            A4492HreBarCod = H015Z2_A4492HreBarCod[0] ;
            A4493HreBarReo = H015Z2_A4493HreBarReo[0] ;
            A4494HreBarPar = H015Z2_A4494HreBarPar[0] ;
            A4495HreNumCie = H015Z2_A4495HreNumCie[0] ;
            A4545HreLinMaq = H015Z2_A4545HreLinMaq[0] ;
            A4550HreLinPro = H015Z2_A4550HreLinPro[0] ;
            A4564HreCanFin = H015Z2_A4564HreCanFin[0] ;
            n4564HreCanFin = H015Z2_n4564HreCanFin[0] ;
            A4583HrePesFec = H015Z2_A4583HrePesFec[0] ;
            n4583HrePesFec = H015Z2_n4583HrePesFec[0] ;
            A4582HreLinUsr = H015Z2_A4582HreLinUsr[0] ;
            n4582HreLinUsr = H015Z2_n4582HreLinUsr[0] ;
            A4567HrePrdTnq = H015Z2_A4567HrePrdTnq[0] ;
            n4567HrePrdTnq = H015Z2_n4567HrePrdTnq[0] ;
            A4566HreForNro = H015Z2_A4566HreForNro[0] ;
            n4566HreForNro = H015Z2_n4566HreForNro[0] ;
            A4565HreCanAny = H015Z2_A4565HreCanAny[0] ;
            n4565HreCanAny = H015Z2_n4565HreCanAny[0] ;
            A4563HrePrdCant = H015Z2_A4563HrePrdCant[0] ;
            n4563HrePrdCant = H015Z2_n4563HrePrdCant[0] ;
            A4561HrePrdUDs = H015Z2_A4561HrePrdUDs[0] ;
            n4561HrePrdUDs = H015Z2_n4561HrePrdUDs[0] ;
            A4560HrePrdUMe = H015Z2_A4560HrePrdUMe[0] ;
            n4560HrePrdUMe = H015Z2_n4560HrePrdUMe[0] ;
            A4562HreFacCon = H015Z2_A4562HreFacCon[0] ;
            n4562HreFacCon = H015Z2_n4562HreFacCon[0] ;
            A4559HrePrdDsc = H015Z2_A4559HrePrdDsc[0] ;
            n4559HrePrdDsc = H015Z2_n4559HrePrdDsc[0] ;
            A4558HrePrdNum = H015Z2_A4558HrePrdNum[0] ;
            n4558HrePrdNum = H015Z2_n4558HrePrdNum[0] ;
            A4557HreRecLin = H015Z2_A4557HreRecLin[0] ;
            e1715Z2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(32) ;
         wb15Z0( ) ;
      }
      bGXsfl_32_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes15Z2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV97Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV97Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV66PwdGrl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV66PwdGrl), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV67ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV67ContVal), "ZZZZZZZ9")));
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
      AV77Wcdetalleproductosds_1_tfhrereclin = AV62TFHreRecLin ;
      AV78Wcdetalleproductosds_2_tfhrereclin_to = AV63TFHreRecLin_To ;
      AV79Wcdetalleproductosds_3_tfhreprdnum = AV36TFHrePrdNum ;
      AV80Wcdetalleproductosds_4_tfhreprdnum_sel = AV37TFHrePrdNum_Sel ;
      AV81Wcdetalleproductosds_5_tfhreprddsc = AV38TFHrePrdDsc ;
      AV82Wcdetalleproductosds_6_tfhreprddsc_sel = AV39TFHrePrdDsc_Sel ;
      AV83Wcdetalleproductosds_7_tfhrefaccon = AV42TFHreFacCon ;
      AV84Wcdetalleproductosds_8_tfhrefaccon_to = AV43TFHreFacCon_To ;
      AV85Wcdetalleproductosds_9_tfhreprduds = AV44TFHrePrdUDs ;
      AV86Wcdetalleproductosds_10_tfhreprduds_sel = AV45TFHrePrdUDs_Sel ;
      AV87Wcdetalleproductosds_11_tfhreprdcant = AV46TFHrePrdCant ;
      AV88Wcdetalleproductosds_12_tfhreprdcant_to = AV47TFHrePrdCant_To ;
      AV89Wcdetalleproductosds_13_tfhrecanany = AV50TFHreCanAny ;
      AV90Wcdetalleproductosds_14_tfhrecanany_to = AV51TFHreCanAny_To ;
      AV91Wcdetalleproductosds_15_tfhrefornro = AV52TFHreForNro ;
      AV92Wcdetalleproductosds_16_tfhrefornro_to = AV53TFHreForNro_To ;
      AV93Wcdetalleproductosds_17_tfhreprdtnq = AV54TFHrePrdTnq ;
      AV94Wcdetalleproductosds_18_tfhreprdtnq_to = AV55TFHrePrdTnq_To ;
      AV95Wcdetalleproductosds_19_tfhrelinusr = AV56TFHreLinUsr ;
      AV96Wcdetalleproductosds_20_tfhrelinusr_sel = AV57TFHreLinUsr_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV77Wcdetalleproductosds_1_tfhrereclin) ,
                                           Short.valueOf(AV78Wcdetalleproductosds_2_tfhrereclin_to) ,
                                           AV80Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                           AV79Wcdetalleproductosds_3_tfhreprdnum ,
                                           AV82Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                           AV81Wcdetalleproductosds_5_tfhreprddsc ,
                                           AV83Wcdetalleproductosds_7_tfhrefaccon ,
                                           AV84Wcdetalleproductosds_8_tfhrefaccon_to ,
                                           AV86Wcdetalleproductosds_10_tfhreprduds_sel ,
                                           AV85Wcdetalleproductosds_9_tfhreprduds ,
                                           AV87Wcdetalleproductosds_11_tfhreprdcant ,
                                           AV88Wcdetalleproductosds_12_tfhreprdcant_to ,
                                           AV89Wcdetalleproductosds_13_tfhrecanany ,
                                           AV90Wcdetalleproductosds_14_tfhrecanany_to ,
                                           Byte.valueOf(AV91Wcdetalleproductosds_15_tfhrefornro) ,
                                           Byte.valueOf(AV92Wcdetalleproductosds_16_tfhrefornro_to) ,
                                           Byte.valueOf(AV93Wcdetalleproductosds_17_tfhreprdtnq) ,
                                           Byte.valueOf(AV94Wcdetalleproductosds_18_tfhreprdtnq_to) ,
                                           AV96Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                           AV95Wcdetalleproductosds_19_tfhrelinusr ,
                                           Short.valueOf(A4557HreRecLin) ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4562HreFacCon ,
                                           A4561HrePrdUDs ,
                                           A4563HrePrdCant ,
                                           A4565HreCanAny ,
                                           Byte.valueOf(A4566HreForNro) ,
                                           Byte.valueOf(A4567HrePrdTnq) ,
                                           A4582HreLinUsr ,
                                           Short.valueOf(AV19OrderedBy) ,
                                           Boolean.valueOf(AV20OrderedDsc) ,
                                           AV5EmprCod ,
                                           Integer.valueOf(AV6HreBarCod) ,
                                           Byte.valueOf(AV7HreBarReo) ,
                                           AV8HreBarPar ,
                                           Byte.valueOf(AV9HreNumCie) ,
                                           Short.valueOf(AV10HreLinMaq) ,
                                           Byte.valueOf(AV11HreLinPro) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Byte.valueOf(A4550HreLinPro) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BYTE
                                           }
      });
      lV79Wcdetalleproductosds_3_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV79Wcdetalleproductosds_3_tfhreprdnum), 6, "%") ;
      lV81Wcdetalleproductosds_5_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV81Wcdetalleproductosds_5_tfhreprddsc), 26, "%") ;
      lV85Wcdetalleproductosds_9_tfhreprduds = GXutil.padr( GXutil.rtrim( AV85Wcdetalleproductosds_9_tfhreprduds), 5, "%") ;
      lV95Wcdetalleproductosds_19_tfhrelinusr = GXutil.padr( GXutil.rtrim( AV95Wcdetalleproductosds_19_tfhrelinusr), 8, "%") ;
      /* Using cursor H015Z3 */
      pr_default.execute(1, new Object[] {AV5EmprCod, Integer.valueOf(AV6HreBarCod), Byte.valueOf(AV7HreBarReo), AV8HreBarPar, Byte.valueOf(AV9HreNumCie), Short.valueOf(AV10HreLinMaq), Byte.valueOf(AV11HreLinPro), Short.valueOf(AV77Wcdetalleproductosds_1_tfhrereclin), Short.valueOf(AV78Wcdetalleproductosds_2_tfhrereclin_to), lV79Wcdetalleproductosds_3_tfhreprdnum, AV80Wcdetalleproductosds_4_tfhreprdnum_sel, lV81Wcdetalleproductosds_5_tfhreprddsc, AV82Wcdetalleproductosds_6_tfhreprddsc_sel, AV83Wcdetalleproductosds_7_tfhrefaccon, AV84Wcdetalleproductosds_8_tfhrefaccon_to, lV85Wcdetalleproductosds_9_tfhreprduds, AV86Wcdetalleproductosds_10_tfhreprduds_sel, AV87Wcdetalleproductosds_11_tfhreprdcant, AV88Wcdetalleproductosds_12_tfhreprdcant_to, AV89Wcdetalleproductosds_13_tfhrecanany, AV90Wcdetalleproductosds_14_tfhrecanany_to, Byte.valueOf(AV91Wcdetalleproductosds_15_tfhrefornro), Byte.valueOf(AV92Wcdetalleproductosds_16_tfhrefornro_to), Byte.valueOf(AV93Wcdetalleproductosds_17_tfhreprdtnq), Byte.valueOf(AV94Wcdetalleproductosds_18_tfhreprdtnq_to), lV95Wcdetalleproductosds_19_tfhrelinusr, AV96Wcdetalleproductosds_20_tfhrelinusr_sel});
      GRID_nRecordCount = H015Z3_AGRID_nRecordCount[0] ;
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
      AV77Wcdetalleproductosds_1_tfhrereclin = AV62TFHreRecLin ;
      AV78Wcdetalleproductosds_2_tfhrereclin_to = AV63TFHreRecLin_To ;
      AV79Wcdetalleproductosds_3_tfhreprdnum = AV36TFHrePrdNum ;
      AV80Wcdetalleproductosds_4_tfhreprdnum_sel = AV37TFHrePrdNum_Sel ;
      AV81Wcdetalleproductosds_5_tfhreprddsc = AV38TFHrePrdDsc ;
      AV82Wcdetalleproductosds_6_tfhreprddsc_sel = AV39TFHrePrdDsc_Sel ;
      AV83Wcdetalleproductosds_7_tfhrefaccon = AV42TFHreFacCon ;
      AV84Wcdetalleproductosds_8_tfhrefaccon_to = AV43TFHreFacCon_To ;
      AV85Wcdetalleproductosds_9_tfhreprduds = AV44TFHrePrdUDs ;
      AV86Wcdetalleproductosds_10_tfhreprduds_sel = AV45TFHrePrdUDs_Sel ;
      AV87Wcdetalleproductosds_11_tfhreprdcant = AV46TFHrePrdCant ;
      AV88Wcdetalleproductosds_12_tfhreprdcant_to = AV47TFHrePrdCant_To ;
      AV89Wcdetalleproductosds_13_tfhrecanany = AV50TFHreCanAny ;
      AV90Wcdetalleproductosds_14_tfhrecanany_to = AV51TFHreCanAny_To ;
      AV91Wcdetalleproductosds_15_tfhrefornro = AV52TFHreForNro ;
      AV92Wcdetalleproductosds_16_tfhrefornro_to = AV53TFHreForNro_To ;
      AV93Wcdetalleproductosds_17_tfhreprdtnq = AV54TFHrePrdTnq ;
      AV94Wcdetalleproductosds_18_tfhreprdtnq_to = AV55TFHrePrdTnq_To ;
      AV95Wcdetalleproductosds_19_tfhrelinusr = AV56TFHreLinUsr ;
      AV96Wcdetalleproductosds_20_tfhrelinusr_sel = AV57TFHreLinUsr_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV11HreLinPro, AV62TFHreRecLin, AV63TFHreRecLin_To, AV36TFHrePrdNum, AV37TFHrePrdNum_Sel, AV38TFHrePrdDsc, AV39TFHrePrdDsc_Sel, AV42TFHreFacCon, AV43TFHreFacCon_To, AV44TFHrePrdUDs, AV45TFHrePrdUDs_Sel, AV46TFHrePrdCant, AV47TFHrePrdCant_To, AV50TFHreCanAny, AV51TFHreCanAny_To, AV52TFHreForNro, AV53TFHreForNro_To, AV54TFHrePrdTnq, AV55TFHrePrdTnq_To, AV56TFHreLinUsr, AV57TFHreLinUsr_Sel, AV97Pgmname, AV19OrderedBy, AV20OrderedDsc, AV66PwdGrl, AV67ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV77Wcdetalleproductosds_1_tfhrereclin = AV62TFHreRecLin ;
      AV78Wcdetalleproductosds_2_tfhrereclin_to = AV63TFHreRecLin_To ;
      AV79Wcdetalleproductosds_3_tfhreprdnum = AV36TFHrePrdNum ;
      AV80Wcdetalleproductosds_4_tfhreprdnum_sel = AV37TFHrePrdNum_Sel ;
      AV81Wcdetalleproductosds_5_tfhreprddsc = AV38TFHrePrdDsc ;
      AV82Wcdetalleproductosds_6_tfhreprddsc_sel = AV39TFHrePrdDsc_Sel ;
      AV83Wcdetalleproductosds_7_tfhrefaccon = AV42TFHreFacCon ;
      AV84Wcdetalleproductosds_8_tfhrefaccon_to = AV43TFHreFacCon_To ;
      AV85Wcdetalleproductosds_9_tfhreprduds = AV44TFHrePrdUDs ;
      AV86Wcdetalleproductosds_10_tfhreprduds_sel = AV45TFHrePrdUDs_Sel ;
      AV87Wcdetalleproductosds_11_tfhreprdcant = AV46TFHrePrdCant ;
      AV88Wcdetalleproductosds_12_tfhreprdcant_to = AV47TFHrePrdCant_To ;
      AV89Wcdetalleproductosds_13_tfhrecanany = AV50TFHreCanAny ;
      AV90Wcdetalleproductosds_14_tfhrecanany_to = AV51TFHreCanAny_To ;
      AV91Wcdetalleproductosds_15_tfhrefornro = AV52TFHreForNro ;
      AV92Wcdetalleproductosds_16_tfhrefornro_to = AV53TFHreForNro_To ;
      AV93Wcdetalleproductosds_17_tfhreprdtnq = AV54TFHrePrdTnq ;
      AV94Wcdetalleproductosds_18_tfhreprdtnq_to = AV55TFHrePrdTnq_To ;
      AV95Wcdetalleproductosds_19_tfhrelinusr = AV56TFHreLinUsr ;
      AV96Wcdetalleproductosds_20_tfhrelinusr_sel = AV57TFHreLinUsr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV11HreLinPro, AV62TFHreRecLin, AV63TFHreRecLin_To, AV36TFHrePrdNum, AV37TFHrePrdNum_Sel, AV38TFHrePrdDsc, AV39TFHrePrdDsc_Sel, AV42TFHreFacCon, AV43TFHreFacCon_To, AV44TFHrePrdUDs, AV45TFHrePrdUDs_Sel, AV46TFHrePrdCant, AV47TFHrePrdCant_To, AV50TFHreCanAny, AV51TFHreCanAny_To, AV52TFHreForNro, AV53TFHreForNro_To, AV54TFHrePrdTnq, AV55TFHrePrdTnq_To, AV56TFHreLinUsr, AV57TFHreLinUsr_Sel, AV97Pgmname, AV19OrderedBy, AV20OrderedDsc, AV66PwdGrl, AV67ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV77Wcdetalleproductosds_1_tfhrereclin = AV62TFHreRecLin ;
      AV78Wcdetalleproductosds_2_tfhrereclin_to = AV63TFHreRecLin_To ;
      AV79Wcdetalleproductosds_3_tfhreprdnum = AV36TFHrePrdNum ;
      AV80Wcdetalleproductosds_4_tfhreprdnum_sel = AV37TFHrePrdNum_Sel ;
      AV81Wcdetalleproductosds_5_tfhreprddsc = AV38TFHrePrdDsc ;
      AV82Wcdetalleproductosds_6_tfhreprddsc_sel = AV39TFHrePrdDsc_Sel ;
      AV83Wcdetalleproductosds_7_tfhrefaccon = AV42TFHreFacCon ;
      AV84Wcdetalleproductosds_8_tfhrefaccon_to = AV43TFHreFacCon_To ;
      AV85Wcdetalleproductosds_9_tfhreprduds = AV44TFHrePrdUDs ;
      AV86Wcdetalleproductosds_10_tfhreprduds_sel = AV45TFHrePrdUDs_Sel ;
      AV87Wcdetalleproductosds_11_tfhreprdcant = AV46TFHrePrdCant ;
      AV88Wcdetalleproductosds_12_tfhreprdcant_to = AV47TFHrePrdCant_To ;
      AV89Wcdetalleproductosds_13_tfhrecanany = AV50TFHreCanAny ;
      AV90Wcdetalleproductosds_14_tfhrecanany_to = AV51TFHreCanAny_To ;
      AV91Wcdetalleproductosds_15_tfhrefornro = AV52TFHreForNro ;
      AV92Wcdetalleproductosds_16_tfhrefornro_to = AV53TFHreForNro_To ;
      AV93Wcdetalleproductosds_17_tfhreprdtnq = AV54TFHrePrdTnq ;
      AV94Wcdetalleproductosds_18_tfhreprdtnq_to = AV55TFHrePrdTnq_To ;
      AV95Wcdetalleproductosds_19_tfhrelinusr = AV56TFHreLinUsr ;
      AV96Wcdetalleproductosds_20_tfhrelinusr_sel = AV57TFHreLinUsr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV11HreLinPro, AV62TFHreRecLin, AV63TFHreRecLin_To, AV36TFHrePrdNum, AV37TFHrePrdNum_Sel, AV38TFHrePrdDsc, AV39TFHrePrdDsc_Sel, AV42TFHreFacCon, AV43TFHreFacCon_To, AV44TFHrePrdUDs, AV45TFHrePrdUDs_Sel, AV46TFHrePrdCant, AV47TFHrePrdCant_To, AV50TFHreCanAny, AV51TFHreCanAny_To, AV52TFHreForNro, AV53TFHreForNro_To, AV54TFHrePrdTnq, AV55TFHrePrdTnq_To, AV56TFHreLinUsr, AV57TFHreLinUsr_Sel, AV97Pgmname, AV19OrderedBy, AV20OrderedDsc, AV66PwdGrl, AV67ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV77Wcdetalleproductosds_1_tfhrereclin = AV62TFHreRecLin ;
      AV78Wcdetalleproductosds_2_tfhrereclin_to = AV63TFHreRecLin_To ;
      AV79Wcdetalleproductosds_3_tfhreprdnum = AV36TFHrePrdNum ;
      AV80Wcdetalleproductosds_4_tfhreprdnum_sel = AV37TFHrePrdNum_Sel ;
      AV81Wcdetalleproductosds_5_tfhreprddsc = AV38TFHrePrdDsc ;
      AV82Wcdetalleproductosds_6_tfhreprddsc_sel = AV39TFHrePrdDsc_Sel ;
      AV83Wcdetalleproductosds_7_tfhrefaccon = AV42TFHreFacCon ;
      AV84Wcdetalleproductosds_8_tfhrefaccon_to = AV43TFHreFacCon_To ;
      AV85Wcdetalleproductosds_9_tfhreprduds = AV44TFHrePrdUDs ;
      AV86Wcdetalleproductosds_10_tfhreprduds_sel = AV45TFHrePrdUDs_Sel ;
      AV87Wcdetalleproductosds_11_tfhreprdcant = AV46TFHrePrdCant ;
      AV88Wcdetalleproductosds_12_tfhreprdcant_to = AV47TFHrePrdCant_To ;
      AV89Wcdetalleproductosds_13_tfhrecanany = AV50TFHreCanAny ;
      AV90Wcdetalleproductosds_14_tfhrecanany_to = AV51TFHreCanAny_To ;
      AV91Wcdetalleproductosds_15_tfhrefornro = AV52TFHreForNro ;
      AV92Wcdetalleproductosds_16_tfhrefornro_to = AV53TFHreForNro_To ;
      AV93Wcdetalleproductosds_17_tfhreprdtnq = AV54TFHrePrdTnq ;
      AV94Wcdetalleproductosds_18_tfhreprdtnq_to = AV55TFHrePrdTnq_To ;
      AV95Wcdetalleproductosds_19_tfhrelinusr = AV56TFHreLinUsr ;
      AV96Wcdetalleproductosds_20_tfhrelinusr_sel = AV57TFHreLinUsr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV11HreLinPro, AV62TFHreRecLin, AV63TFHreRecLin_To, AV36TFHrePrdNum, AV37TFHrePrdNum_Sel, AV38TFHrePrdDsc, AV39TFHrePrdDsc_Sel, AV42TFHreFacCon, AV43TFHreFacCon_To, AV44TFHrePrdUDs, AV45TFHrePrdUDs_Sel, AV46TFHrePrdCant, AV47TFHrePrdCant_To, AV50TFHreCanAny, AV51TFHreCanAny_To, AV52TFHreForNro, AV53TFHreForNro_To, AV54TFHrePrdTnq, AV55TFHrePrdTnq_To, AV56TFHreLinUsr, AV57TFHreLinUsr_Sel, AV97Pgmname, AV19OrderedBy, AV20OrderedDsc, AV66PwdGrl, AV67ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV77Wcdetalleproductosds_1_tfhrereclin = AV62TFHreRecLin ;
      AV78Wcdetalleproductosds_2_tfhrereclin_to = AV63TFHreRecLin_To ;
      AV79Wcdetalleproductosds_3_tfhreprdnum = AV36TFHrePrdNum ;
      AV80Wcdetalleproductosds_4_tfhreprdnum_sel = AV37TFHrePrdNum_Sel ;
      AV81Wcdetalleproductosds_5_tfhreprddsc = AV38TFHrePrdDsc ;
      AV82Wcdetalleproductosds_6_tfhreprddsc_sel = AV39TFHrePrdDsc_Sel ;
      AV83Wcdetalleproductosds_7_tfhrefaccon = AV42TFHreFacCon ;
      AV84Wcdetalleproductosds_8_tfhrefaccon_to = AV43TFHreFacCon_To ;
      AV85Wcdetalleproductosds_9_tfhreprduds = AV44TFHrePrdUDs ;
      AV86Wcdetalleproductosds_10_tfhreprduds_sel = AV45TFHrePrdUDs_Sel ;
      AV87Wcdetalleproductosds_11_tfhreprdcant = AV46TFHrePrdCant ;
      AV88Wcdetalleproductosds_12_tfhreprdcant_to = AV47TFHrePrdCant_To ;
      AV89Wcdetalleproductosds_13_tfhrecanany = AV50TFHreCanAny ;
      AV90Wcdetalleproductosds_14_tfhrecanany_to = AV51TFHreCanAny_To ;
      AV91Wcdetalleproductosds_15_tfhrefornro = AV52TFHreForNro ;
      AV92Wcdetalleproductosds_16_tfhrefornro_to = AV53TFHreForNro_To ;
      AV93Wcdetalleproductosds_17_tfhreprdtnq = AV54TFHrePrdTnq ;
      AV94Wcdetalleproductosds_18_tfhreprdtnq_to = AV55TFHrePrdTnq_To ;
      AV95Wcdetalleproductosds_19_tfhrelinusr = AV56TFHreLinUsr ;
      AV96Wcdetalleproductosds_20_tfhrelinusr_sel = AV57TFHreLinUsr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV11HreLinPro, AV62TFHreRecLin, AV63TFHreRecLin_To, AV36TFHrePrdNum, AV37TFHrePrdNum_Sel, AV38TFHrePrdDsc, AV39TFHrePrdDsc_Sel, AV42TFHreFacCon, AV43TFHreFacCon_To, AV44TFHrePrdUDs, AV45TFHrePrdUDs_Sel, AV46TFHrePrdCant, AV47TFHrePrdCant_To, AV50TFHreCanAny, AV51TFHreCanAny_To, AV52TFHreForNro, AV53TFHreForNro_To, AV54TFHrePrdTnq, AV55TFHrePrdTnq_To, AV56TFHreLinUsr, AV57TFHreLinUsr_Sel, AV97Pgmname, AV19OrderedBy, AV20OrderedDsc, AV66PwdGrl, AV67ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV97Pgmname = "WCDetalleProductos" ;
      Gx_err = (short)(0) ;
      edtavHrecanfin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecanfin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrecanfin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavFechapes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFechapes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechapes_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup15Z0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1515Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV58DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV6HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV8HreBarPar") ;
         wcpOAV9HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11HreLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11HreLinPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         /* Read variables values. */
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
      e1515Z2 ();
      if (returnInSub) return;
   }

   public void e1515Z2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV72Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcdetalleproductos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV72Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV73EmprNom ;
      GXv_char4[0] = AV74UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV72Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcdetalleproductos_impl.this.AV5EmprCod = GXv_char2[0] ;
      wcdetalleproductos_impl.this.AV73EmprNom = GXv_char3[0] ;
      wcdetalleproductos_impl.this.AV74UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      subGrid_Rows = 0 ;
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV58DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV58DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      GXt_int7 = AV67ContVal ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "HRHR03", ""), GXv_int8) ;
      wcdetalleproductos_impl.this.GXt_int7 = GXv_int8[0] ;
      AV67ContVal = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67ContVal), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV67ContVal), "ZZZZZZZ9")));
      GXt_int9 = AV66PwdGrl ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "HRHR03", ""), GXv_int10) ;
      wcdetalleproductos_impl.this.GXt_int9 = GXv_int10[0] ;
      AV66PwdGrl = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66PwdGrl", GXutil.str( AV66PwdGrl, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV66PwdGrl), "9")));
   }

   public void e1615Z2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV13WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV68WebSession.getValue("ValidarWebWPwdGrl_Verificado"))), httpContext.getMessage( "SI", "")) == 0 )
      {
         AV68WebSession.remove("ValidarWebWPwdGrl_Verificado");
         if ( ( GXutil.strcmp(A4558HrePrdNum, "100000") >= 0 ) && ( GXutil.strcmp(A4558HrePrdNum, "999999") <= 0 ) )
         {
            httpContext.popup(formatLink("app.detalleproductosmodificar", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10HreLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11HreLinPro,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A4557HreRecLin,4,0)),GXutil.URLEncode(DecimalUtil.decToString(A4565HreCanAny)),GXutil.URLEncode(DecimalUtil.decToString(A4562HreFacCon)),GXutil.URLEncode(DecimalUtil.decToString(A4563HrePrdCant)),GXutil.URLEncode(GXutil.ltrimstr(A4560HrePrdUMe,1,0)),GXutil.URLEncode(GXutil.rtrim(A4561HrePrdUDs)),GXutil.URLEncode(GXutil.rtrim(A4558HrePrdNum)),GXutil.URLEncode(GXutil.rtrim(A4559HrePrdDsc))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq","HreLinPro","HreRecLin","HreCanAny","HreFacCon","HrePrdCant","HrePrdUMe","Hreprduds","Prdnum","Prdnom"}) , new Object[] {"AV5EmprCod","AV6HreBarCod","AV7HreBarReo","AV8HreBarPar","AV9HreNumCie","AV10HreLinMaq","AV11HreLinPro","A4557HreRecLin","A4565HreCanAny","A4562HreFacCon","A4563HrePrdCant","A4560HrePrdUMe","A4561HrePrdUDs","A4558HrePrdNum","A4559HrePrdDsc"});
            GRID_nFirstRecordOnPage = 0 ;
            GRID_nCurrentRecord = 0 ;
            GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_32_idx ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
            gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV11HreLinPro, AV62TFHreRecLin, AV63TFHreRecLin_To, AV36TFHrePrdNum, AV37TFHrePrdNum_Sel, AV38TFHrePrdDsc, AV39TFHrePrdDsc_Sel, AV42TFHreFacCon, AV43TFHreFacCon_To, AV44TFHrePrdUDs, AV45TFHrePrdUDs_Sel, AV46TFHrePrdCant, AV47TFHrePrdCant_To, AV50TFHreCanAny, AV51TFHreCanAny_To, AV52TFHreForNro, AV53TFHreForNro_To, AV54TFHrePrdTnq, AV55TFHrePrdTnq_To, AV56TFHreLinUsr, AV57TFHreLinUsr_Sel, AV97Pgmname, AV19OrderedBy, AV20OrderedDsc, AV66PwdGrl, AV67ContVal, sPrefix) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo Productos", ""));
         }
      }
      AV77Wcdetalleproductosds_1_tfhrereclin = AV62TFHreRecLin ;
      AV78Wcdetalleproductosds_2_tfhrereclin_to = AV63TFHreRecLin_To ;
      AV79Wcdetalleproductosds_3_tfhreprdnum = AV36TFHrePrdNum ;
      AV80Wcdetalleproductosds_4_tfhreprdnum_sel = AV37TFHrePrdNum_Sel ;
      AV81Wcdetalleproductosds_5_tfhreprddsc = AV38TFHrePrdDsc ;
      AV82Wcdetalleproductosds_6_tfhreprddsc_sel = AV39TFHrePrdDsc_Sel ;
      AV83Wcdetalleproductosds_7_tfhrefaccon = AV42TFHreFacCon ;
      AV84Wcdetalleproductosds_8_tfhrefaccon_to = AV43TFHreFacCon_To ;
      AV85Wcdetalleproductosds_9_tfhreprduds = AV44TFHrePrdUDs ;
      AV86Wcdetalleproductosds_10_tfhreprduds_sel = AV45TFHrePrdUDs_Sel ;
      AV87Wcdetalleproductosds_11_tfhreprdcant = AV46TFHrePrdCant ;
      AV88Wcdetalleproductosds_12_tfhreprdcant_to = AV47TFHrePrdCant_To ;
      AV89Wcdetalleproductosds_13_tfhrecanany = AV50TFHreCanAny ;
      AV90Wcdetalleproductosds_14_tfhrecanany_to = AV51TFHreCanAny_To ;
      AV91Wcdetalleproductosds_15_tfhrefornro = AV52TFHreForNro ;
      AV92Wcdetalleproductosds_16_tfhrefornro_to = AV53TFHreForNro_To ;
      AV93Wcdetalleproductosds_17_tfhreprdtnq = AV54TFHrePrdTnq ;
      AV94Wcdetalleproductosds_18_tfhreprdtnq_to = AV55TFHrePrdTnq_To ;
      AV95Wcdetalleproductosds_19_tfhrelinusr = AV56TFHreLinUsr ;
      AV96Wcdetalleproductosds_20_tfhrelinusr_sel = AV57TFHreLinUsr_Sel ;
      /*  Sending Event outputs  */
   }

   public void e1115Z2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreRecLin") == 0 )
         {
            AV62TFHreRecLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFHreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFHreRecLin), 4, 0));
            AV63TFHreRecLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFHreRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFHreRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrdNum") == 0 )
         {
            AV36TFHrePrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFHrePrdNum", AV36TFHrePrdNum);
            AV37TFHrePrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHrePrdNum_Sel", AV37TFHrePrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrdDsc") == 0 )
         {
            AV38TFHrePrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHrePrdDsc", AV38TFHrePrdDsc);
            AV39TFHrePrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHrePrdDsc_Sel", AV39TFHrePrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreFacCon") == 0 )
         {
            AV42TFHreFacCon = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHreFacCon", GXutil.ltrimstr( AV42TFHreFacCon, 11, 5));
            AV43TFHreFacCon_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHreFacCon_To", GXutil.ltrimstr( AV43TFHreFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrdUDs") == 0 )
         {
            AV44TFHrePrdUDs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHrePrdUDs", AV44TFHrePrdUDs);
            AV45TFHrePrdUDs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHrePrdUDs_Sel", AV45TFHrePrdUDs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrdCant") == 0 )
         {
            AV46TFHrePrdCant = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHrePrdCant", GXutil.ltrimstr( AV46TFHrePrdCant, 11, 3));
            AV47TFHrePrdCant_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHrePrdCant_To", GXutil.ltrimstr( AV47TFHrePrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreCanAny") == 0 )
         {
            AV50TFHreCanAny = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFHreCanAny", GXutil.ltrimstr( AV50TFHreCanAny, 11, 3));
            AV51TFHreCanAny_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFHreCanAny_To", GXutil.ltrimstr( AV51TFHreCanAny_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreForNro") == 0 )
         {
            AV52TFHreForNro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFHreForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFHreForNro), 2, 0));
            AV53TFHreForNro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFHreForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFHreForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HrePrdTnq") == 0 )
         {
            AV54TFHrePrdTnq = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFHrePrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFHrePrdTnq), 2, 0));
            AV55TFHrePrdTnq_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFHrePrdTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFHrePrdTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreLinUsr") == 0 )
         {
            AV56TFHreLinUsr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFHreLinUsr", AV56TFHreLinUsr);
            AV57TFHreLinUsr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFHreLinUsr_Sel", AV57TFHreLinUsr_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1715Z2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      AV23HreCanFin = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A4564HreCanFin)==0) ? A4563HrePrdCant : A4564HreCanFin) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecanfin_Internalname, GXutil.ltrimstr( AV23HreCanFin, 11, 3));
      AV24Porc = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23HreCanFin)==0) ? DecimalUtil.doubleToDec(0) : (A4565HreCanAny.divide(AV23HreCanFin, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV24Porc, 6, 2));
      AV25FechaPes = (!(GXutil.strcmp("", A4582HreLinUsr)==0) ? localUtil.ttoc( A4583HrePesFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : "") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFechapes_Internalname, AV25FechaPes);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(32) ;
      }
      sendrow_322( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_32_Refreshing )
      {
         httpContext.doAjaxLoad(32, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV64Grupodeacciones, 4, 0)) );
   }

   public void e1815Z2( )
   {
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV64Grupodeacciones == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S152 ();
         if (returnInSub) return;
      }
      AV64Grupodeacciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Grupodeacciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV64Grupodeacciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
   }

   public void e1215Z2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV26ExcelFilename ;
      GXv_char3[0] = AV27ErrorMessage ;
      new app.wcdetalleproductosexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcdetalleproductos_impl.this.AV26ExcelFilename = GXv_char4[0] ;
      wcdetalleproductos_impl.this.AV27ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV26ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV26ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV27ErrorMessage);
      }
   }

   public void e1315Z2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcdetalleproductosexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV19OrderedBy, 4, 0))+":"+(AV20OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      if ( AV66PwdGrl == 1 )
      {
         AV65ClaveConfirmada = false ;
         AV68WebSession.setValue("ValidarWebWPwdGrl", GXutil.str( AV67ContVal, 8, 0));
         /* Window Datatype Object Property */
         AV69Window.setUrl( formatLink("app.webwpwdgrl", new String[] {GXutil.URLEncode(GXutil.booltostr(AV65ClaveConfirmada))}, new String[] {"PwdBo"})  );
         AV69Window.setReturnParms(new Object[] {"AV65ClaveConfirmada",});
         httpContext.newWindow(AV69Window);
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         if ( ( GXutil.strcmp(A4558HrePrdNum, "100000") >= 0 ) && ( GXutil.strcmp(A4558HrePrdNum, "999999") <= 0 ) )
         {
            httpContext.popup(formatLink("app.detalleproductosmodificar", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10HreLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11HreLinPro,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A4557HreRecLin,4,0)),GXutil.URLEncode(DecimalUtil.decToString(A4565HreCanAny)),GXutil.URLEncode(DecimalUtil.decToString(A4562HreFacCon)),GXutil.URLEncode(DecimalUtil.decToString(A4563HrePrdCant)),GXutil.URLEncode(GXutil.ltrimstr(A4560HrePrdUMe,1,0)),GXutil.URLEncode(GXutil.rtrim(A4561HrePrdUDs)),GXutil.URLEncode(GXutil.rtrim(A4558HrePrdNum)),GXutil.URLEncode(GXutil.rtrim(A4559HrePrdDsc))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq","HreLinPro","HreRecLin","HreCanAny","HreFacCon","HrePrdCant","HrePrdUMe","Hreprduds","Prdnum","Prdnom"}) , new Object[] {"AV5EmprCod","AV6HreBarCod","AV7HreBarReo","AV8HreBarPar","AV9HreNumCie","AV10HreLinMaq","AV11HreLinPro","A4557HreRecLin","A4565HreCanAny","A4562HreFacCon","A4563HrePrdCant","A4560HrePrdUMe","A4561HrePrdUDs","A4558HrePrdNum","A4559HrePrdDsc"});
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo Productos", ""));
         }
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue(AV97Pgmname+"GridState"), "") == 0 )
      {
         AV17GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV97Pgmname+"GridState"), null, null);
      }
      else
      {
         AV17GridState.fromxml(AV32Session.getValue(AV97Pgmname+"GridState"), null, null);
      }
      AV19OrderedBy = AV17GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19OrderedBy), 4, 0));
      AV20OrderedDsc = AV17GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20OrderedDsc", AV20OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV1));
         if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRERECLIN") == 0 )
         {
            AV62TFHreRecLin = (short)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFHreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFHreRecLin), 4, 0));
            AV63TFHreRecLin_To = (short)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFHreRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFHreRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV36TFHrePrdNum = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFHrePrdNum", AV36TFHrePrdNum);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV37TFHrePrdNum_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHrePrdNum_Sel", AV37TFHrePrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV38TFHrePrdDsc = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHrePrdDsc", AV38TFHrePrdDsc);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV39TFHrePrdDsc_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHrePrdDsc_Sel", AV39TFHrePrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFACCON") == 0 )
         {
            AV42TFHreFacCon = CommonUtil.decimalVal( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFHreFacCon", GXutil.ltrimstr( AV42TFHreFacCon, 11, 5));
            AV43TFHreFacCon_To = CommonUtil.decimalVal( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHreFacCon_To", GXutil.ltrimstr( AV43TFHreFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV44TFHrePrdUDs = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHrePrdUDs", AV44TFHrePrdUDs);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV45TFHrePrdUDs_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHrePrdUDs_Sel", AV45TFHrePrdUDs_Sel);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV46TFHrePrdCant = CommonUtil.decimalVal( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHrePrdCant", GXutil.ltrimstr( AV46TFHrePrdCant, 11, 3));
            AV47TFHrePrdCant_To = CommonUtil.decimalVal( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHrePrdCant_To", GXutil.ltrimstr( AV47TFHrePrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRECANANY") == 0 )
         {
            AV50TFHreCanAny = CommonUtil.decimalVal( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFHreCanAny", GXutil.ltrimstr( AV50TFHreCanAny, 11, 3));
            AV51TFHreCanAny_To = CommonUtil.decimalVal( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFHreCanAny_To", GXutil.ltrimstr( AV51TFHreCanAny_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREFORNRO") == 0 )
         {
            AV52TFHreForNro = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFHreForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFHreForNro), 2, 0));
            AV53TFHreForNro_To = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFHreForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFHreForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDTNQ") == 0 )
         {
            AV54TFHrePrdTnq = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFHrePrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFHrePrdTnq), 2, 0));
            AV55TFHrePrdTnq_To = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFHrePrdTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFHrePrdTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINUSR") == 0 )
         {
            AV56TFHreLinUsr = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFHreLinUsr", AV56TFHreLinUsr);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINUSR_SEL") == 0 )
         {
            AV57TFHreLinUsr_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFHreLinUsr_Sel", AV57TFHreLinUsr_Sel);
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFHrePrdNum_Sel)==0), AV37TFHrePrdNum_Sel, GXv_char4) ;
      wcdetalleproductos_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFHrePrdDsc_Sel)==0), AV39TFHrePrdDsc_Sel, GXv_char3) ;
      wcdetalleproductos_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFHrePrdUDs_Sel)==0), AV45TFHrePrdUDs_Sel, GXv_char2) ;
      wcdetalleproductos_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFHreLinUsr_Sel)==0), AV57TFHreLinUsr_Sel, GXv_char15) ;
      wcdetalleproductos_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"||"+GXt_char13+"|||||"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFHrePrdNum)==0), AV36TFHrePrdNum, GXv_char15) ;
      wcdetalleproductos_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFHrePrdDsc)==0), AV38TFHrePrdDsc, GXv_char4) ;
      wcdetalleproductos_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFHrePrdUDs)==0), AV44TFHrePrdUDs, GXv_char3) ;
      wcdetalleproductos_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFHreLinUsr)==0), AV56TFHreLinUsr, GXv_char2) ;
      wcdetalleproductos_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV62TFHreRecLin) ? "" : GXutil.str( AV62TFHreRecLin, 4, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHreFacCon)==0) ? "" : GXutil.str( AV42TFHreFacCon, 11, 5))+"|"+GXt_char12+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFHrePrdCant)==0) ? "" : GXutil.str( AV46TFHrePrdCant, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFHreCanAny)==0) ? "" : GXutil.str( AV50TFHreCanAny, 11, 3))+"|"+((0==AV52TFHreForNro) ? "" : GXutil.str( AV52TFHreForNro, 2, 0))+"|"+((0==AV54TFHrePrdTnq) ? "" : GXutil.str( AV54TFHrePrdTnq, 2, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV63TFHreRecLin_To) ? "" : GXutil.str( AV63TFHreRecLin_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFHreFacCon_To)==0) ? "" : GXutil.str( AV43TFHreFacCon_To, 11, 5))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFHrePrdCant_To)==0) ? "" : GXutil.str( AV47TFHrePrdCant_To, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFHreCanAny_To)==0) ? "" : GXutil.str( AV51TFHreCanAny_To, 11, 3))+"|"+((0==AV53TFHreForNro_To) ? "" : GXutil.str( AV53TFHreForNro_To, 2, 0))+"|"+((0==AV55TFHrePrdTnq_To) ? "" : GXutil.str( AV55TFHrePrdTnq_To, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV17GridState.fromxml(AV32Session.getValue(AV97Pgmname+"GridState"), null, null);
      AV17GridState.setgxTv_SdtWWPGridState_Orderedby( AV19OrderedBy );
      AV17GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV20OrderedDsc );
      AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHRERECLIN", "", !((0==AV62TFHreRecLin)&&(0==AV63TFHreRecLin_To)), (short)(0), GXutil.trim( GXutil.str( AV62TFHreRecLin, 4, 0)), GXutil.trim( GXutil.str( AV63TFHreRecLin_To, 4, 0))) ;
      AV17GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREPRDNUM", "", !(GXutil.strcmp("", AV36TFHrePrdNum)==0), (short)(0), AV36TFHrePrdNum, "", !(GXutil.strcmp("", AV37TFHrePrdNum_Sel)==0), AV37TFHrePrdNum_Sel, "") ;
      AV17GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREPRDDSC", "", !(GXutil.strcmp("", AV38TFHrePrdDsc)==0), (short)(0), AV38TFHrePrdDsc, "", !(GXutil.strcmp("", AV39TFHrePrdDsc_Sel)==0), AV39TFHrePrdDsc_Sel, "") ;
      AV17GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREFACCON", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFHreFacCon)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFHreFacCon_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFHreFacCon, 11, 5)), GXutil.trim( GXutil.str( AV43TFHreFacCon_To, 11, 5))) ;
      AV17GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREPRDUDS", "", !(GXutil.strcmp("", AV44TFHrePrdUDs)==0), (short)(0), AV44TFHrePrdUDs, "", !(GXutil.strcmp("", AV45TFHrePrdUDs_Sel)==0), AV45TFHrePrdUDs_Sel, "") ;
      AV17GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREPRDCANT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFHrePrdCant)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFHrePrdCant_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV46TFHrePrdCant, 11, 3)), GXutil.trim( GXutil.str( AV47TFHrePrdCant_To, 11, 3))) ;
      AV17GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHRECANANY", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFHreCanAny)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFHreCanAny_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFHreCanAny, 11, 3)), GXutil.trim( GXutil.str( AV51TFHreCanAny_To, 11, 3))) ;
      AV17GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREFORNRO", "", !((0==AV52TFHreForNro)&&(0==AV53TFHreForNro_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFHreForNro, 2, 0)), GXutil.trim( GXutil.str( AV53TFHreForNro_To, 2, 0))) ;
      AV17GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREPRDTNQ", "", !((0==AV54TFHrePrdTnq)&&(0==AV55TFHrePrdTnq_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFHrePrdTnq, 2, 0)), GXutil.trim( GXutil.str( AV55TFHrePrdTnq_To, 2, 0))) ;
      AV17GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV17GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHRELINUSR", "", !(GXutil.strcmp("", AV56TFHreLinUsr)==0), (short)(0), AV56TFHreLinUsr, "", !(GXutil.strcmp("", AV57TFHreLinUsr_Sel)==0), AV57TFHreLinUsr_Sel, "") ;
      AV17GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV5EmprCod)==0) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5EmprCod );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (0==AV6HreBarCod) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARCOD" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6HreBarCod, 8, 0) );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (0==AV7HreBarReo) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARREO" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV7HreBarReo, 1, 0) );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8HreBarPar)==0) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARPAR" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8HreBarPar );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (0==AV9HreNumCie) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRENUMCIE" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9HreNumCie, 2, 0) );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (0==AV10HreLinMaq) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRELINMAQ" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10HreLinMaq, 4, 0) );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      if ( ! (0==AV11HreLinPro) )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRELINPRO" );
         AV18GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV11HreLinPro, 2, 0) );
         AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV18GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV17GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV15TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV97Pgmname );
      AV15TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV15TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV14HTTPRequest.getScriptName()+"?"+AV14HTTPRequest.getQuerystring() );
      AV15TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "THISLRE" );
      AV32Session.setValue("TrnContext", AV15TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e1415Z2( )
   {
      /* GlobalEvents_Refrescarobjeto Routine */
      returnInSub = false ;
      if ( ( AV70ObjetoRefrescar.indexof(httpContext.getMessage( "DetalleProductosModificar", "")) > 0 ) && AV71Refrescar )
      {
         GRID_nFirstRecordOnPage = 0 ;
         GRID_nCurrentRecord = 0 ;
         GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_32_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar, AV9HreNumCie, AV10HreLinMaq, AV11HreLinPro, AV62TFHreRecLin, AV63TFHreRecLin_To, AV36TFHrePrdNum, AV37TFHrePrdNum_Sel, AV38TFHrePrdDsc, AV39TFHrePrdDsc_Sel, AV42TFHreFacCon, AV43TFHreFacCon_To, AV44TFHrePrdUDs, AV45TFHrePrdUDs_Sel, AV46TFHrePrdCant, AV47TFHrePrdCant_To, AV50TFHreCanAny, AV51TFHreCanAny_To, AV52TFHreForNro, AV53TFHreForNro_To, AV54TFHrePrdTnq, AV55TFHrePrdTnq_To, AV56TFHreLinUsr, AV57TFHreLinUsr_Sel, AV97Pgmname, AV19OrderedBy, AV20OrderedDsc, AV66PwdGrl, AV67ContVal, sPrefix) ;
      }
      /*  Sending Event outputs  */
   }

   public void wb_table1_21_15Z2( boolean wbgen )
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
         wb_table1_21_15Z2e( true) ;
      }
      else
      {
         wb_table1_21_15Z2e( false) ;
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
      AV11HreLinPro = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HreLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinPro), 2, 0));
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
      pa15Z2( ) ;
      ws15Z2( ) ;
      we15Z2( ) ;
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
      sCtrlAV11HreLinPro = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa15Z2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcdetalleproductos", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa15Z2( ) ;
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
         AV11HreLinPro = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HreLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinPro), 2, 0));
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV6HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV8HreBarPar") ;
      wcpOAV9HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11HreLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11HreLinPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( AV6HreBarCod != wcpOAV6HreBarCod ) || ( AV7HreBarReo != wcpOAV7HreBarReo ) || ( GXutil.strcmp(AV8HreBarPar, wcpOAV8HreBarPar) != 0 ) || ( AV9HreNumCie != wcpOAV9HreNumCie ) || ( AV10HreLinMaq != wcpOAV10HreLinMaq ) || ( AV11HreLinPro != wcpOAV11HreLinPro ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV6HreBarCod = AV6HreBarCod ;
      wcpOAV7HreBarReo = AV7HreBarReo ;
      wcpOAV8HreBarPar = AV8HreBarPar ;
      wcpOAV9HreNumCie = AV9HreNumCie ;
      wcpOAV10HreLinMaq = AV10HreLinMaq ;
      wcpOAV11HreLinPro = AV11HreLinPro ;
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
      sCtrlAV11HreLinPro = httpContext.cgiGet( sPrefix+"AV11HreLinPro_CTRL") ;
      if ( GXutil.len( sCtrlAV11HreLinPro) > 0 )
      {
         AV11HreLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11HreLinPro), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11HreLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinPro), 2, 0));
      }
      else
      {
         AV11HreLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11HreLinPro_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa15Z2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws15Z2( ) ;
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
      ws15Z2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11HreLinPro_PARM", GXutil.ltrim( localUtil.ntoc( AV11HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11HreLinPro)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11HreLinPro_CTRL", GXutil.rtrim( sCtrlAV11HreLinPro));
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
      we15Z2( ) ;
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
      httpContext.AddJavascriptSource("wcdetalleproductos.js", "?202682115562462", false, true);
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

   public void subsflControlProps_322( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_32_idx );
      edtHreRecLin_Internalname = sPrefix+"HRERECLIN_"+sGXsfl_32_idx ;
      edtHrePrdNum_Internalname = sPrefix+"HREPRDNUM_"+sGXsfl_32_idx ;
      edtHrePrdDsc_Internalname = sPrefix+"HREPRDDSC_"+sGXsfl_32_idx ;
      edtHreFacCon_Internalname = sPrefix+"HREFACCON_"+sGXsfl_32_idx ;
      edtHrePrdUMe_Internalname = sPrefix+"HREPRDUME_"+sGXsfl_32_idx ;
      edtHrePrdUDs_Internalname = sPrefix+"HREPRDUDS_"+sGXsfl_32_idx ;
      edtavHrecanfin_Internalname = sPrefix+"vHRECANFIN_"+sGXsfl_32_idx ;
      edtHrePrdCant_Internalname = sPrefix+"HREPRDCANT_"+sGXsfl_32_idx ;
      edtHreCanAny_Internalname = sPrefix+"HRECANANY_"+sGXsfl_32_idx ;
      edtavPorc_Internalname = sPrefix+"vPORC_"+sGXsfl_32_idx ;
      edtHreForNro_Internalname = sPrefix+"HREFORNRO_"+sGXsfl_32_idx ;
      edtHrePrdTnq_Internalname = sPrefix+"HREPRDTNQ_"+sGXsfl_32_idx ;
      edtHreLinUsr_Internalname = sPrefix+"HRELINUSR_"+sGXsfl_32_idx ;
      edtavFechapes_Internalname = sPrefix+"vFECHAPES_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_322( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_32_fel_idx );
      edtHreRecLin_Internalname = sPrefix+"HRERECLIN_"+sGXsfl_32_fel_idx ;
      edtHrePrdNum_Internalname = sPrefix+"HREPRDNUM_"+sGXsfl_32_fel_idx ;
      edtHrePrdDsc_Internalname = sPrefix+"HREPRDDSC_"+sGXsfl_32_fel_idx ;
      edtHreFacCon_Internalname = sPrefix+"HREFACCON_"+sGXsfl_32_fel_idx ;
      edtHrePrdUMe_Internalname = sPrefix+"HREPRDUME_"+sGXsfl_32_fel_idx ;
      edtHrePrdUDs_Internalname = sPrefix+"HREPRDUDS_"+sGXsfl_32_fel_idx ;
      edtavHrecanfin_Internalname = sPrefix+"vHRECANFIN_"+sGXsfl_32_fel_idx ;
      edtHrePrdCant_Internalname = sPrefix+"HREPRDCANT_"+sGXsfl_32_fel_idx ;
      edtHreCanAny_Internalname = sPrefix+"HRECANANY_"+sGXsfl_32_fel_idx ;
      edtavPorc_Internalname = sPrefix+"vPORC_"+sGXsfl_32_fel_idx ;
      edtHreForNro_Internalname = sPrefix+"HREFORNRO_"+sGXsfl_32_fel_idx ;
      edtHrePrdTnq_Internalname = sPrefix+"HREPRDTNQ_"+sGXsfl_32_fel_idx ;
      edtHreLinUsr_Internalname = sPrefix+"HRELINUSR_"+sGXsfl_32_fel_idx ;
      edtavFechapes_Internalname = sPrefix+"vFECHAPES_"+sGXsfl_32_fel_idx ;
   }

   public void sendrow_322( )
   {
      subsflControlProps_322( ) ;
      wb15Z0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_32_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_32_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 33,'"+sPrefix+"',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_32_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV64Grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV64Grupodeacciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Grupodeacciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV64Grupodeacciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRUPODEACCIONES.CLICK."+sGXsfl_32_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,33);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV64Grupodeacciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_32_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4557HreRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4557HreRecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdNum_Internalname,GXutil.rtrim( A4558HrePrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdDsc_Internalname,GXutil.rtrim( A4559HrePrdDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A4562HreFacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4562HreFacCon, "ZZZZ9.99999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A4560HrePrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4560HrePrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdUDs_Internalname,GXutil.rtrim( A4561HrePrdUDs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdUDs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrecanfin_Enabled!=0)&&(edtavHrecanfin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'"+sPrefix+"',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrecanfin_Internalname,GXutil.ltrim( localUtil.ntoc( AV23HreCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHrecanfin_Enabled!=0) ? localUtil.format( AV23HreCanFin, "ZZZZZZ9.999") : localUtil.format( AV23HreCanFin, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+((edtavHrecanfin_Enabled!=0)&&(edtavHrecanfin_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,40);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrecanfin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHrecanfin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A4563HrePrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4563HrePrdCant, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreCanAny_Internalname,GXutil.ltrim( localUtil.ntoc( A4565HreCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4565HreCanAny, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreCanAny_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPorc_Enabled!=0)&&(edtavPorc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'"+sPrefix+"',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPorc_Internalname,GXutil.ltrim( localUtil.ntoc( AV24Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPorc_Enabled!=0) ? localUtil.format( AV24Porc, "ZZ9.99") : localUtil.format( AV24Porc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPorc_Enabled!=0)&&(edtavPorc_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,43);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPorc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPorc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A4566HreForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4566HreForNro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrePrdTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A4567HrePrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4567HrePrdTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHrePrdTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinUsr_Internalname,GXutil.rtrim( A4582HreLinUsr),GXutil.rtrim( localUtil.format( A4582HreLinUsr, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLinUsr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFechapes_Enabled!=0)&&(edtavFechapes_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFechapes_Internalname,GXutil.rtrim( AV25FechaPes),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFechapes_Enabled!=0)&&(edtavFechapes_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFechapes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFechapes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(18),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes15Z2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_32_idx = ((subGrid_Islastpage==1)&&(nGXsfl_32_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_322( ) ;
      }
      /* End function sendrow_322 */
   }

   public void startgridcontrol32( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"32\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad Medida. Hist.receta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teorica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Final", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Añadida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV64Grupodeacciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4557HreRecLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4558HrePrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4559HrePrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4562HreFacCon, (byte)(11), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4560HrePrdUMe, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4561HrePrdUDs));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23HreCanFin, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrecanfin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4563HrePrdCant, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4565HreCanAny, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24Porc, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPorc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4566HreForNro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4567HrePrdTnq, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4582HreLinUsr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV25FechaPes));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFechapes_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES" );
      edtHreRecLin_Internalname = sPrefix+"HRERECLIN" ;
      edtHrePrdNum_Internalname = sPrefix+"HREPRDNUM" ;
      edtHrePrdDsc_Internalname = sPrefix+"HREPRDDSC" ;
      edtHreFacCon_Internalname = sPrefix+"HREFACCON" ;
      edtHrePrdUMe_Internalname = sPrefix+"HREPRDUME" ;
      edtHrePrdUDs_Internalname = sPrefix+"HREPRDUDS" ;
      edtavHrecanfin_Internalname = sPrefix+"vHRECANFIN" ;
      edtHrePrdCant_Internalname = sPrefix+"HREPRDCANT" ;
      edtHreCanAny_Internalname = sPrefix+"HRECANANY" ;
      edtavPorc_Internalname = sPrefix+"vPORC" ;
      edtHreForNro_Internalname = sPrefix+"HREFORNRO" ;
      edtHrePrdTnq_Internalname = sPrefix+"HREPRDTNQ" ;
      edtHreLinUsr_Internalname = sPrefix+"HRELINUSR" ;
      edtavFechapes_Internalname = sPrefix+"vFECHAPES" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
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
      edtavFechapes_Jsonclick = "" ;
      edtavFechapes_Visible = -1 ;
      edtavFechapes_Enabled = 1 ;
      edtHreLinUsr_Jsonclick = "" ;
      edtHrePrdTnq_Jsonclick = "" ;
      edtHreForNro_Jsonclick = "" ;
      edtavPorc_Jsonclick = "" ;
      edtavPorc_Visible = -1 ;
      edtavPorc_Enabled = 1 ;
      edtHreCanAny_Jsonclick = "" ;
      edtHrePrdCant_Jsonclick = "" ;
      edtavHrecanfin_Jsonclick = "" ;
      edtavHrecanfin_Visible = -1 ;
      edtavHrecanfin_Enabled = 1 ;
      edtHrePrdUDs_Jsonclick = "" ;
      edtHrePrdUMe_Jsonclick = "" ;
      edtHreFacCon_Jsonclick = "" ;
      edtHrePrdDsc_Jsonclick = "" ;
      edtHrePrdNum_Jsonclick = "" ;
      edtHreRecLin_Jsonclick = "" ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;Cantidad;Cantidad;Cantidad;;;;Pesaje;Pesaje" ;
      Ddo_grid_Datalistproc = "WCDetalleProductosGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||Dynamic|||||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T||T|||||T" ;
      Ddo_grid_Filterisrange = "T|||T||T|T|T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "1:HreRecLin|2:HrePrdNum|3:HrePrdDsc|4:HreFacCon|6:HrePrdUDs|8:HrePrdCant|9:HreCanAny|11:HreForNro|12:HrePrdTnq|13:HreLinUsr" ;
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
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_32_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV62TFHreRecLin',fld:'vTFHRERECLIN',pic:'ZZZ9'},{av:'AV63TFHreRecLin_To',fld:'vTFHRERECLIN_TO',pic:'ZZZ9'},{av:'AV36TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV37TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV38TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV39TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV42TFHreFacCon',fld:'vTFHREFACCON',pic:'ZZZZ9.99999'},{av:'AV43TFHreFacCon_To',fld:'vTFHREFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV45TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV46TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV47TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHreCanAny',fld:'vTFHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV51TFHreCanAny_To',fld:'vTFHRECANANY_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFHreForNro',fld:'vTFHREFORNRO',pic:'Z9'},{av:'AV53TFHreForNro_To',fld:'vTFHREFORNRO_TO',pic:'Z9'},{av:'AV54TFHrePrdTnq',fld:'vTFHREPRDTNQ',pic:'Z9'},{av:'AV55TFHrePrdTnq_To',fld:'vTFHREPRDTNQ_TO',pic:'Z9'},{av:'AV56TFHreLinUsr',fld:'vTFHRELINUSR',pic:'@!'},{av:'AV57TFHreLinUsr_Sel',fld:'vTFHRELINUSR_SEL',pic:'@!'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66PwdGrl',fld:'vPWDGRL',pic:'9',hsh:true},{av:'AV67ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1115Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV62TFHreRecLin',fld:'vTFHRERECLIN',pic:'ZZZ9'},{av:'AV63TFHreRecLin_To',fld:'vTFHRERECLIN_TO',pic:'ZZZ9'},{av:'AV36TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV37TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV38TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV39TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV42TFHreFacCon',fld:'vTFHREFACCON',pic:'ZZZZ9.99999'},{av:'AV43TFHreFacCon_To',fld:'vTFHREFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV45TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV46TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV47TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHreCanAny',fld:'vTFHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV51TFHreCanAny_To',fld:'vTFHRECANANY_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFHreForNro',fld:'vTFHREFORNRO',pic:'Z9'},{av:'AV53TFHreForNro_To',fld:'vTFHREFORNRO_TO',pic:'Z9'},{av:'AV54TFHrePrdTnq',fld:'vTFHREPRDTNQ',pic:'Z9'},{av:'AV55TFHrePrdTnq_To',fld:'vTFHREPRDTNQ_TO',pic:'Z9'},{av:'AV56TFHreLinUsr',fld:'vTFHRELINUSR',pic:'@!'},{av:'AV57TFHreLinUsr_Sel',fld:'vTFHRELINUSR_SEL',pic:'@!'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66PwdGrl',fld:'vPWDGRL',pic:'9',hsh:true},{av:'AV67ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFHreLinUsr',fld:'vTFHRELINUSR',pic:'@!'},{av:'AV57TFHreLinUsr_Sel',fld:'vTFHRELINUSR_SEL',pic:'@!'},{av:'AV54TFHrePrdTnq',fld:'vTFHREPRDTNQ',pic:'Z9'},{av:'AV55TFHrePrdTnq_To',fld:'vTFHREPRDTNQ_TO',pic:'Z9'},{av:'AV52TFHreForNro',fld:'vTFHREFORNRO',pic:'Z9'},{av:'AV53TFHreForNro_To',fld:'vTFHREFORNRO_TO',pic:'Z9'},{av:'AV50TFHreCanAny',fld:'vTFHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV51TFHreCanAny_To',fld:'vTFHRECANANY_TO',pic:'ZZZZZZ9.999'},{av:'AV46TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV47TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV44TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV45TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV42TFHreFacCon',fld:'vTFHREFACCON',pic:'ZZZZ9.99999'},{av:'AV43TFHreFacCon_To',fld:'vTFHREFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV38TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV39TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV36TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV37TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV62TFHreRecLin',fld:'vTFHRERECLIN',pic:'ZZZ9'},{av:'AV63TFHreRecLin_To',fld:'vTFHRERECLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1715Z2',iparms:[{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4564HreCanFin',fld:'HRECANFIN',pic:'ZZZZZZ9.999'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4582HreLinUsr',fld:'HRELINUSR',pic:'@!'},{av:'A4583HrePesFec',fld:'HREPESFEC',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV64Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV23HreCanFin',fld:'vHRECANFIN',pic:'ZZZZZZ9.999'},{av:'AV24Porc',fld:'vPORC',pic:'ZZ9.99'},{av:'AV25FechaPes',fld:'vFECHAPES',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e1815Z2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV64Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV62TFHreRecLin',fld:'vTFHRERECLIN',pic:'ZZZ9'},{av:'AV63TFHreRecLin_To',fld:'vTFHRERECLIN_TO',pic:'ZZZ9'},{av:'AV36TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV37TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV38TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV39TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV42TFHreFacCon',fld:'vTFHREFACCON',pic:'ZZZZ9.99999'},{av:'AV43TFHreFacCon_To',fld:'vTFHREFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV45TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV46TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV47TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHreCanAny',fld:'vTFHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV51TFHreCanAny_To',fld:'vTFHRECANANY_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFHreForNro',fld:'vTFHREFORNRO',pic:'Z9'},{av:'AV53TFHreForNro_To',fld:'vTFHREFORNRO_TO',pic:'Z9'},{av:'AV54TFHrePrdTnq',fld:'vTFHREPRDTNQ',pic:'Z9'},{av:'AV55TFHrePrdTnq_To',fld:'vTFHREPRDTNQ_TO',pic:'Z9'},{av:'AV56TFHreLinUsr',fld:'vTFHRELINUSR',pic:'@!'},{av:'AV57TFHreLinUsr_Sel',fld:'vTFHRELINUSR_SEL',pic:'@!'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66PwdGrl',fld:'vPWDGRL',pic:'9',hsh:true},{av:'AV67ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV64Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1215Z2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1315Z2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO","{handler:'e1415Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV62TFHreRecLin',fld:'vTFHRERECLIN',pic:'ZZZ9'},{av:'AV63TFHreRecLin_To',fld:'vTFHRERECLIN_TO',pic:'ZZZ9'},{av:'AV36TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV37TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV38TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV39TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV42TFHreFacCon',fld:'vTFHREFACCON',pic:'ZZZZ9.99999'},{av:'AV43TFHreFacCon_To',fld:'vTFHREFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV45TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV46TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV47TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHreCanAny',fld:'vTFHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV51TFHreCanAny_To',fld:'vTFHRECANANY_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFHreForNro',fld:'vTFHREFORNRO',pic:'Z9'},{av:'AV53TFHreForNro_To',fld:'vTFHREFORNRO_TO',pic:'Z9'},{av:'AV54TFHrePrdTnq',fld:'vTFHREPRDTNQ',pic:'Z9'},{av:'AV55TFHrePrdTnq_To',fld:'vTFHREPRDTNQ_TO',pic:'Z9'},{av:'AV56TFHreLinUsr',fld:'vTFHRELINUSR',pic:'@!'},{av:'AV57TFHreLinUsr_Sel',fld:'vTFHRELINUSR_SEL',pic:'@!'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66PwdGrl',fld:'vPWDGRL',pic:'9',hsh:true},{av:'AV67ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV71Refrescar',fld:'vREFRESCAR',pic:''},{av:'AV70ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''}]");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO",",oparms:[{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66PwdGrl',fld:'vPWDGRL',pic:'9',hsh:true},{av:'AV67ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV62TFHreRecLin',fld:'vTFHRERECLIN',pic:'ZZZ9'},{av:'AV63TFHreRecLin_To',fld:'vTFHRERECLIN_TO',pic:'ZZZ9'},{av:'AV36TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV37TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV38TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV39TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV42TFHreFacCon',fld:'vTFHREFACCON',pic:'ZZZZ9.99999'},{av:'AV43TFHreFacCon_To',fld:'vTFHREFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV45TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV46TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV47TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHreCanAny',fld:'vTFHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV51TFHreCanAny_To',fld:'vTFHRECANANY_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFHreForNro',fld:'vTFHREFORNRO',pic:'Z9'},{av:'AV53TFHreForNro_To',fld:'vTFHREFORNRO_TO',pic:'Z9'},{av:'AV54TFHrePrdTnq',fld:'vTFHREPRDTNQ',pic:'Z9'},{av:'AV55TFHrePrdTnq_To',fld:'vTFHREPRDTNQ_TO',pic:'Z9'},{av:'AV56TFHreLinUsr',fld:'vTFHRELINUSR',pic:'@!'},{av:'AV57TFHreLinUsr_Sel',fld:'vTFHRELINUSR_SEL',pic:'@!'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66PwdGrl',fld:'vPWDGRL',pic:'9',hsh:true},{av:'AV67ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV62TFHreRecLin',fld:'vTFHRERECLIN',pic:'ZZZ9'},{av:'AV63TFHreRecLin_To',fld:'vTFHRERECLIN_TO',pic:'ZZZ9'},{av:'AV36TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV37TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV38TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV39TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV42TFHreFacCon',fld:'vTFHREFACCON',pic:'ZZZZ9.99999'},{av:'AV43TFHreFacCon_To',fld:'vTFHREFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV45TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV46TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV47TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHreCanAny',fld:'vTFHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV51TFHreCanAny_To',fld:'vTFHRECANANY_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFHreForNro',fld:'vTFHREFORNRO',pic:'Z9'},{av:'AV53TFHreForNro_To',fld:'vTFHREFORNRO_TO',pic:'Z9'},{av:'AV54TFHrePrdTnq',fld:'vTFHREPRDTNQ',pic:'Z9'},{av:'AV55TFHrePrdTnq_To',fld:'vTFHREPRDTNQ_TO',pic:'Z9'},{av:'AV56TFHreLinUsr',fld:'vTFHRELINUSR',pic:'@!'},{av:'AV57TFHreLinUsr_Sel',fld:'vTFHRELINUSR_SEL',pic:'@!'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66PwdGrl',fld:'vPWDGRL',pic:'9',hsh:true},{av:'AV67ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV62TFHreRecLin',fld:'vTFHRERECLIN',pic:'ZZZ9'},{av:'AV63TFHreRecLin_To',fld:'vTFHRERECLIN_TO',pic:'ZZZ9'},{av:'AV36TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV37TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV38TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV39TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV42TFHreFacCon',fld:'vTFHREFACCON',pic:'ZZZZ9.99999'},{av:'AV43TFHreFacCon_To',fld:'vTFHREFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV45TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV46TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV47TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHreCanAny',fld:'vTFHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV51TFHreCanAny_To',fld:'vTFHRECANANY_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFHreForNro',fld:'vTFHREFORNRO',pic:'Z9'},{av:'AV53TFHreForNro_To',fld:'vTFHREFORNRO_TO',pic:'Z9'},{av:'AV54TFHrePrdTnq',fld:'vTFHREPRDTNQ',pic:'Z9'},{av:'AV55TFHrePrdTnq_To',fld:'vTFHREPRDTNQ_TO',pic:'Z9'},{av:'AV56TFHreLinUsr',fld:'vTFHRELINUSR',pic:'@!'},{av:'AV57TFHreLinUsr_Sel',fld:'vTFHRELINUSR_SEL',pic:'@!'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66PwdGrl',fld:'vPWDGRL',pic:'9',hsh:true},{av:'AV67ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV62TFHreRecLin',fld:'vTFHRERECLIN',pic:'ZZZ9'},{av:'AV63TFHreRecLin_To',fld:'vTFHRERECLIN_TO',pic:'ZZZ9'},{av:'AV36TFHrePrdNum',fld:'vTFHREPRDNUM',pic:''},{av:'AV37TFHrePrdNum_Sel',fld:'vTFHREPRDNUM_SEL',pic:''},{av:'AV38TFHrePrdDsc',fld:'vTFHREPRDDSC',pic:''},{av:'AV39TFHrePrdDsc_Sel',fld:'vTFHREPRDDSC_SEL',pic:''},{av:'AV42TFHreFacCon',fld:'vTFHREFACCON',pic:'ZZZZ9.99999'},{av:'AV43TFHreFacCon_To',fld:'vTFHREFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV44TFHrePrdUDs',fld:'vTFHREPRDUDS',pic:''},{av:'AV45TFHrePrdUDs_Sel',fld:'vTFHREPRDUDS_SEL',pic:''},{av:'AV46TFHrePrdCant',fld:'vTFHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV47TFHrePrdCant_To',fld:'vTFHREPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFHreCanAny',fld:'vTFHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV51TFHreCanAny_To',fld:'vTFHRECANANY_TO',pic:'ZZZZZZ9.999'},{av:'AV52TFHreForNro',fld:'vTFHREFORNRO',pic:'Z9'},{av:'AV53TFHreForNro_To',fld:'vTFHREFORNRO_TO',pic:'Z9'},{av:'AV54TFHrePrdTnq',fld:'vTFHREPRDTNQ',pic:'Z9'},{av:'AV55TFHrePrdTnq_To',fld:'vTFHREPRDTNQ_TO',pic:'Z9'},{av:'AV56TFHreLinUsr',fld:'vTFHRELINUSR',pic:'@!'},{av:'AV57TFHreLinUsr_Sel',fld:'vTFHRELINUSR_SEL',pic:'@!'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV19OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV20OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'validv_Fechapes',iparms:[]");
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
      AV36TFHrePrdNum = "" ;
      AV37TFHrePrdNum_Sel = "" ;
      AV38TFHrePrdDsc = "" ;
      AV39TFHrePrdDsc_Sel = "" ;
      AV42TFHreFacCon = DecimalUtil.ZERO ;
      AV43TFHreFacCon_To = DecimalUtil.ZERO ;
      AV44TFHrePrdUDs = "" ;
      AV45TFHrePrdUDs_Sel = "" ;
      AV46TFHrePrdCant = DecimalUtil.ZERO ;
      AV47TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV50TFHreCanAny = DecimalUtil.ZERO ;
      AV51TFHreCanAny_To = DecimalUtil.ZERO ;
      AV56TFHreLinUsr = "" ;
      AV57TFHreLinUsr_Sel = "" ;
      AV97Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV58DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A4564HreCanFin = DecimalUtil.ZERO ;
      A4583HrePesFec = GXutil.resetTime( GXutil.nullDate() );
      AV70ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
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
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV79Wcdetalleproductosds_3_tfhreprdnum = "" ;
      AV80Wcdetalleproductosds_4_tfhreprdnum_sel = "" ;
      AV81Wcdetalleproductosds_5_tfhreprddsc = "" ;
      AV82Wcdetalleproductosds_6_tfhreprddsc_sel = "" ;
      AV83Wcdetalleproductosds_7_tfhrefaccon = DecimalUtil.ZERO ;
      AV84Wcdetalleproductosds_8_tfhrefaccon_to = DecimalUtil.ZERO ;
      AV85Wcdetalleproductosds_9_tfhreprduds = "" ;
      AV86Wcdetalleproductosds_10_tfhreprduds_sel = "" ;
      AV87Wcdetalleproductosds_11_tfhreprdcant = DecimalUtil.ZERO ;
      AV88Wcdetalleproductosds_12_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV89Wcdetalleproductosds_13_tfhrecanany = DecimalUtil.ZERO ;
      AV90Wcdetalleproductosds_14_tfhrecanany_to = DecimalUtil.ZERO ;
      AV95Wcdetalleproductosds_19_tfhrelinusr = "" ;
      AV96Wcdetalleproductosds_20_tfhrelinusr_sel = "" ;
      A4558HrePrdNum = "" ;
      A4559HrePrdDsc = "" ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      AV23HreCanFin = DecimalUtil.ZERO ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      AV24Porc = DecimalUtil.ZERO ;
      A4582HreLinUsr = "" ;
      AV25FechaPes = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV79Wcdetalleproductosds_3_tfhreprdnum = "" ;
      lV81Wcdetalleproductosds_5_tfhreprddsc = "" ;
      lV85Wcdetalleproductosds_9_tfhreprduds = "" ;
      lV95Wcdetalleproductosds_19_tfhrelinusr = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      H015Z2_A396EmprCod = new String[] {""} ;
      H015Z2_A4492HreBarCod = new int[1] ;
      H015Z2_A4493HreBarReo = new byte[1] ;
      H015Z2_A4494HreBarPar = new String[] {""} ;
      H015Z2_A4495HreNumCie = new byte[1] ;
      H015Z2_A4545HreLinMaq = new short[1] ;
      H015Z2_A4550HreLinPro = new byte[1] ;
      H015Z2_A4564HreCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015Z2_n4564HreCanFin = new boolean[] {false} ;
      H015Z2_A4583HrePesFec = new java.util.Date[] {GXutil.nullDate()} ;
      H015Z2_n4583HrePesFec = new boolean[] {false} ;
      H015Z2_A4582HreLinUsr = new String[] {""} ;
      H015Z2_n4582HreLinUsr = new boolean[] {false} ;
      H015Z2_A4567HrePrdTnq = new byte[1] ;
      H015Z2_n4567HrePrdTnq = new boolean[] {false} ;
      H015Z2_A4566HreForNro = new byte[1] ;
      H015Z2_n4566HreForNro = new boolean[] {false} ;
      H015Z2_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015Z2_n4565HreCanAny = new boolean[] {false} ;
      H015Z2_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015Z2_n4563HrePrdCant = new boolean[] {false} ;
      H015Z2_A4561HrePrdUDs = new String[] {""} ;
      H015Z2_n4561HrePrdUDs = new boolean[] {false} ;
      H015Z2_A4560HrePrdUMe = new byte[1] ;
      H015Z2_n4560HrePrdUMe = new boolean[] {false} ;
      H015Z2_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015Z2_n4562HreFacCon = new boolean[] {false} ;
      H015Z2_A4559HrePrdDsc = new String[] {""} ;
      H015Z2_n4559HrePrdDsc = new boolean[] {false} ;
      H015Z2_A4558HrePrdNum = new String[] {""} ;
      H015Z2_n4558HrePrdNum = new boolean[] {false} ;
      H015Z2_A4557HreRecLin = new short[1] ;
      H015Z3_AGRID_nRecordCount = new long[1] ;
      AV72Station = "" ;
      AV73EmprNom = "" ;
      AV74UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new int[1] ;
      GXv_int10 = new byte[1] ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV68WebSession = httpContext.getWebSession();
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV26ExcelFilename = "" ;
      AV27ErrorMessage = "" ;
      AV69Window = new com.genexus.webpanels.GXWindow();
      AV32Session = httpContext.getWebSession();
      AV17GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV18GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV15TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV6HreBarCod = "" ;
      sCtrlAV7HreBarReo = "" ;
      sCtrlAV8HreBarPar = "" ;
      sCtrlAV9HreNumCie = "" ;
      sCtrlAV10HreLinMaq = "" ;
      sCtrlAV11HreLinPro = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdetalleproductos__default(),
         new Object[] {
             new Object[] {
            H015Z2_A396EmprCod, H015Z2_A4492HreBarCod, H015Z2_A4493HreBarReo, H015Z2_A4494HreBarPar, H015Z2_A4495HreNumCie, H015Z2_A4545HreLinMaq, H015Z2_A4550HreLinPro, H015Z2_A4564HreCanFin, H015Z2_n4564HreCanFin, H015Z2_A4583HrePesFec,
            H015Z2_n4583HrePesFec, H015Z2_A4582HreLinUsr, H015Z2_n4582HreLinUsr, H015Z2_A4567HrePrdTnq, H015Z2_n4567HrePrdTnq, H015Z2_A4566HreForNro, H015Z2_n4566HreForNro, H015Z2_A4565HreCanAny, H015Z2_n4565HreCanAny, H015Z2_A4563HrePrdCant,
            H015Z2_n4563HrePrdCant, H015Z2_A4561HrePrdUDs, H015Z2_n4561HrePrdUDs, H015Z2_A4560HrePrdUMe, H015Z2_n4560HrePrdUMe, H015Z2_A4562HreFacCon, H015Z2_n4562HreFacCon, H015Z2_A4559HrePrdDsc, H015Z2_n4559HrePrdDsc, H015Z2_A4558HrePrdNum,
            H015Z2_n4558HrePrdNum, H015Z2_A4557HreRecLin
            }
            , new Object[] {
            H015Z3_AGRID_nRecordCount
            }
         }
      );
      AV97Pgmname = "WCDetalleProductos" ;
      /* GeneXus formulas. */
      AV97Pgmname = "WCDetalleProductos" ;
      Gx_err = (short)(0) ;
      edtavHrecanfin_Enabled = 0 ;
      edtavPorc_Enabled = 0 ;
      edtavFechapes_Enabled = 0 ;
   }

   private byte wcpOAV7HreBarReo ;
   private byte wcpOAV9HreNumCie ;
   private byte wcpOAV11HreLinPro ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV7HreBarReo ;
   private byte AV9HreNumCie ;
   private byte AV11HreLinPro ;
   private byte AV52TFHreForNro ;
   private byte AV53TFHreForNro_To ;
   private byte AV54TFHrePrdTnq ;
   private byte AV55TFHrePrdTnq_To ;
   private byte AV66PwdGrl ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV91Wcdetalleproductosds_15_tfhrefornro ;
   private byte AV92Wcdetalleproductosds_16_tfhrefornro_to ;
   private byte AV93Wcdetalleproductosds_17_tfhreprdtnq ;
   private byte AV94Wcdetalleproductosds_18_tfhreprdtnq_to ;
   private byte A4560HrePrdUMe ;
   private byte A4566HreForNro ;
   private byte A4567HrePrdTnq ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV10HreLinMaq ;
   private short AV10HreLinMaq ;
   private short AV62TFHreRecLin ;
   private short AV63TFHreRecLin_To ;
   private short AV19OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV77Wcdetalleproductosds_1_tfhrereclin ;
   private short AV78Wcdetalleproductosds_2_tfhrereclin_to ;
   private short AV64Grupodeacciones ;
   private short A4557HreRecLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A4545HreLinMaq ;
   private int wcpOAV6HreBarCod ;
   private int nRC_GXsfl_32 ;
   private int AV6HreBarCod ;
   private int subGrid_Rows ;
   private int nGXsfl_32_idx=1 ;
   private int AV67ContVal ;
   private int subGrid_Islastpage ;
   private int edtavHrecanfin_Enabled ;
   private int edtavPorc_Enabled ;
   private int edtavFechapes_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A4492HreBarCod ;
   private int GXt_int7 ;
   private int GXv_int8[] ;
   private int AV98GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavHrecanfin_Visible ;
   private int edtavPorc_Visible ;
   private int edtavFechapes_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV42TFHreFacCon ;
   private java.math.BigDecimal AV43TFHreFacCon_To ;
   private java.math.BigDecimal AV46TFHrePrdCant ;
   private java.math.BigDecimal AV47TFHrePrdCant_To ;
   private java.math.BigDecimal AV50TFHreCanAny ;
   private java.math.BigDecimal AV51TFHreCanAny_To ;
   private java.math.BigDecimal A4564HreCanFin ;
   private java.math.BigDecimal AV83Wcdetalleproductosds_7_tfhrefaccon ;
   private java.math.BigDecimal AV84Wcdetalleproductosds_8_tfhrefaccon_to ;
   private java.math.BigDecimal AV87Wcdetalleproductosds_11_tfhreprdcant ;
   private java.math.BigDecimal AV88Wcdetalleproductosds_12_tfhreprdcant_to ;
   private java.math.BigDecimal AV89Wcdetalleproductosds_13_tfhrecanany ;
   private java.math.BigDecimal AV90Wcdetalleproductosds_14_tfhrecanany_to ;
   private java.math.BigDecimal A4562HreFacCon ;
   private java.math.BigDecimal AV23HreCanFin ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal AV24Porc ;
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
   private String sGXsfl_32_idx="0001" ;
   private String AV36TFHrePrdNum ;
   private String AV37TFHrePrdNum_Sel ;
   private String AV38TFHrePrdDsc ;
   private String AV39TFHrePrdDsc_Sel ;
   private String AV44TFHrePrdUDs ;
   private String AV45TFHrePrdUDs_Sel ;
   private String AV56TFHreLinUsr ;
   private String AV57TFHreLinUsr_Sel ;
   private String AV97Pgmname ;
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
   private String divUnnamedtable1_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV79Wcdetalleproductosds_3_tfhreprdnum ;
   private String AV80Wcdetalleproductosds_4_tfhreprdnum_sel ;
   private String AV81Wcdetalleproductosds_5_tfhreprddsc ;
   private String AV82Wcdetalleproductosds_6_tfhreprddsc_sel ;
   private String AV85Wcdetalleproductosds_9_tfhreprduds ;
   private String AV86Wcdetalleproductosds_10_tfhreprduds_sel ;
   private String AV95Wcdetalleproductosds_19_tfhrelinusr ;
   private String AV96Wcdetalleproductosds_20_tfhrelinusr_sel ;
   private String edtHreRecLin_Internalname ;
   private String A4558HrePrdNum ;
   private String edtHrePrdNum_Internalname ;
   private String A4559HrePrdDsc ;
   private String edtHrePrdDsc_Internalname ;
   private String edtHreFacCon_Internalname ;
   private String edtHrePrdUMe_Internalname ;
   private String A4561HrePrdUDs ;
   private String edtHrePrdUDs_Internalname ;
   private String edtavHrecanfin_Internalname ;
   private String edtHrePrdCant_Internalname ;
   private String edtHreCanAny_Internalname ;
   private String edtavPorc_Internalname ;
   private String edtHreForNro_Internalname ;
   private String edtHrePrdTnq_Internalname ;
   private String A4582HreLinUsr ;
   private String edtHreLinUsr_Internalname ;
   private String AV25FechaPes ;
   private String edtavFechapes_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV79Wcdetalleproductosds_3_tfhreprdnum ;
   private String lV81Wcdetalleproductosds_5_tfhreprddsc ;
   private String lV85Wcdetalleproductosds_9_tfhreprduds ;
   private String lV95Wcdetalleproductosds_19_tfhrelinusr ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String AV72Station ;
   private String AV73EmprNom ;
   private String AV74UsurCod ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV6HreBarCod ;
   private String sCtrlAV7HreBarReo ;
   private String sCtrlAV8HreBarPar ;
   private String sCtrlAV9HreNumCie ;
   private String sCtrlAV10HreLinMaq ;
   private String sCtrlAV11HreLinPro ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtHreRecLin_Jsonclick ;
   private String edtHrePrdNum_Jsonclick ;
   private String edtHrePrdDsc_Jsonclick ;
   private String edtHreFacCon_Jsonclick ;
   private String edtHrePrdUMe_Jsonclick ;
   private String edtHrePrdUDs_Jsonclick ;
   private String edtavHrecanfin_Jsonclick ;
   private String edtHrePrdCant_Jsonclick ;
   private String edtHreCanAny_Jsonclick ;
   private String edtavPorc_Jsonclick ;
   private String edtHreForNro_Jsonclick ;
   private String edtHrePrdTnq_Jsonclick ;
   private String edtHreLinUsr_Jsonclick ;
   private String edtavFechapes_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A4583HrePesFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV20OrderedDsc ;
   private boolean AV71Refrescar ;
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
   private boolean n4558HrePrdNum ;
   private boolean n4559HrePrdDsc ;
   private boolean n4562HreFacCon ;
   private boolean n4560HrePrdUMe ;
   private boolean n4561HrePrdUDs ;
   private boolean n4563HrePrdCant ;
   private boolean n4565HreCanAny ;
   private boolean n4566HreForNro ;
   private boolean n4567HrePrdTnq ;
   private boolean n4582HreLinUsr ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n4564HreCanFin ;
   private boolean n4583HrePesFec ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV65ClaveConfirmada ;
   private String AV26ExcelFilename ;
   private String AV27ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV69Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV14HTTPRequest ;
   private com.genexus.webpanels.WebSession AV68WebSession ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private HTMLChoice cmbavGrupodeacciones ;
   private IDataStoreProvider pr_default ;
   private String[] H015Z2_A396EmprCod ;
   private int[] H015Z2_A4492HreBarCod ;
   private byte[] H015Z2_A4493HreBarReo ;
   private String[] H015Z2_A4494HreBarPar ;
   private byte[] H015Z2_A4495HreNumCie ;
   private short[] H015Z2_A4545HreLinMaq ;
   private byte[] H015Z2_A4550HreLinPro ;
   private java.math.BigDecimal[] H015Z2_A4564HreCanFin ;
   private boolean[] H015Z2_n4564HreCanFin ;
   private java.util.Date[] H015Z2_A4583HrePesFec ;
   private boolean[] H015Z2_n4583HrePesFec ;
   private String[] H015Z2_A4582HreLinUsr ;
   private boolean[] H015Z2_n4582HreLinUsr ;
   private byte[] H015Z2_A4567HrePrdTnq ;
   private boolean[] H015Z2_n4567HrePrdTnq ;
   private byte[] H015Z2_A4566HreForNro ;
   private boolean[] H015Z2_n4566HreForNro ;
   private java.math.BigDecimal[] H015Z2_A4565HreCanAny ;
   private boolean[] H015Z2_n4565HreCanAny ;
   private java.math.BigDecimal[] H015Z2_A4563HrePrdCant ;
   private boolean[] H015Z2_n4563HrePrdCant ;
   private String[] H015Z2_A4561HrePrdUDs ;
   private boolean[] H015Z2_n4561HrePrdUDs ;
   private byte[] H015Z2_A4560HrePrdUMe ;
   private boolean[] H015Z2_n4560HrePrdUMe ;
   private java.math.BigDecimal[] H015Z2_A4562HreFacCon ;
   private boolean[] H015Z2_n4562HreFacCon ;
   private String[] H015Z2_A4559HrePrdDsc ;
   private boolean[] H015Z2_n4559HrePrdDsc ;
   private String[] H015Z2_A4558HrePrdNum ;
   private boolean[] H015Z2_n4558HrePrdNum ;
   private short[] H015Z2_A4557HreRecLin ;
   private long[] H015Z3_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV70ObjetoRefrescar ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV15TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV17GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV18GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV58DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcdetalleproductos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H015Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV77Wcdetalleproductosds_1_tfhrereclin ,
                                          short AV78Wcdetalleproductosds_2_tfhrereclin_to ,
                                          String AV80Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                          String AV79Wcdetalleproductosds_3_tfhreprdnum ,
                                          String AV82Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                          String AV81Wcdetalleproductosds_5_tfhreprddsc ,
                                          java.math.BigDecimal AV83Wcdetalleproductosds_7_tfhrefaccon ,
                                          java.math.BigDecimal AV84Wcdetalleproductosds_8_tfhrefaccon_to ,
                                          String AV86Wcdetalleproductosds_10_tfhreprduds_sel ,
                                          String AV85Wcdetalleproductosds_9_tfhreprduds ,
                                          java.math.BigDecimal AV87Wcdetalleproductosds_11_tfhreprdcant ,
                                          java.math.BigDecimal AV88Wcdetalleproductosds_12_tfhreprdcant_to ,
                                          java.math.BigDecimal AV89Wcdetalleproductosds_13_tfhrecanany ,
                                          java.math.BigDecimal AV90Wcdetalleproductosds_14_tfhrecanany_to ,
                                          byte AV91Wcdetalleproductosds_15_tfhrefornro ,
                                          byte AV92Wcdetalleproductosds_16_tfhrefornro_to ,
                                          byte AV93Wcdetalleproductosds_17_tfhreprdtnq ,
                                          byte AV94Wcdetalleproductosds_18_tfhreprdtnq_to ,
                                          String AV96Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                          String AV95Wcdetalleproductosds_19_tfhrelinusr ,
                                          short A4557HreRecLin ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4562HreFacCon ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          java.math.BigDecimal A4565HreCanAny ,
                                          byte A4566HreForNro ,
                                          byte A4567HrePrdTnq ,
                                          String A4582HreLinUsr ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String AV5EmprCod ,
                                          int AV6HreBarCod ,
                                          byte AV7HreBarReo ,
                                          String AV8HreBarPar ,
                                          byte AV9HreNumCie ,
                                          short AV10HreLinMaq ,
                                          byte AV11HreLinPro ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          byte A4550HreLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[32];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreCanFin, HrePesFec, HreLinUsr, HrePrdTnq, HreForNro, HreCanAny," ;
      sSelectString += " HrePrdCant, HrePrdUDs, HrePrdUMe, HreFacCon, HrePrdDsc, HrePrdNum, HreRecLin" ;
      sFromString = " FROM TXPHISLRE" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ?)");
      if ( ! (0==AV77Wcdetalleproductosds_1_tfhrereclin) )
      {
         addWhere(sWhereString, "(HreRecLin >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcdetalleproductosds_2_tfhrereclin_to) )
      {
         addWhere(sWhereString, "(HreRecLin <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Wcdetalleproductosds_4_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Wcdetalleproductosds_3_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Wcdetalleproductosds_4_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdNum = ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Wcdetalleproductosds_6_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Wcdetalleproductosds_5_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Wcdetalleproductosds_6_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdDsc = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Wcdetalleproductosds_7_tfhrefaccon)==0) )
      {
         addWhere(sWhereString, "(HreFacCon >= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcdetalleproductosds_8_tfhrefaccon_to)==0) )
      {
         addWhere(sWhereString, "(HreFacCon <= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Wcdetalleproductosds_10_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV85Wcdetalleproductosds_9_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Wcdetalleproductosds_10_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Wcdetalleproductosds_11_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Wcdetalleproductosds_12_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcdetalleproductosds_13_tfhrecanany)==0) )
      {
         addWhere(sWhereString, "(HreCanAny >= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcdetalleproductosds_14_tfhrecanany_to)==0) )
      {
         addWhere(sWhereString, "(HreCanAny <= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV91Wcdetalleproductosds_15_tfhrefornro) )
      {
         addWhere(sWhereString, "(HreForNro >= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV92Wcdetalleproductosds_16_tfhrefornro_to) )
      {
         addWhere(sWhereString, "(HreForNro <= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Wcdetalleproductosds_17_tfhreprdtnq) )
      {
         addWhere(sWhereString, "(HrePrdTnq >= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Wcdetalleproductosds_18_tfhreprdtnq_to) )
      {
         addWhere(sWhereString, "(HrePrdTnq <= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Wcdetalleproductosds_20_tfhrelinusr_sel)==0) && ( ! (GXutil.strcmp("", AV95Wcdetalleproductosds_19_tfhrelinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Wcdetalleproductosds_20_tfhrelinusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLinUsr = ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ( AV19OrderedBy == 1 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HreRecLin" ;
      }
      else if ( ( AV19OrderedBy == 1 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreRecLin DESC" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HrePrdNum" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HrePrdNum DESC" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HrePrdDsc" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HrePrdDsc DESC" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HreFacCon" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreFacCon DESC" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HrePrdUDs" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HrePrdUDs DESC" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HrePrdCant" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HrePrdCant DESC" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HreCanAny" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreCanAny DESC" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HreForNro" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreForNro DESC" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HrePrdTnq" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HrePrdTnq DESC" ;
      }
      else if ( ( AV19OrderedBy == 10 ) && ! AV20OrderedDsc )
      {
         sOrderString += " ORDER BY HreLinUsr" ;
      }
      else if ( ( AV19OrderedBy == 10 ) && ( AV20OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreLinUsr DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H015Z3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV77Wcdetalleproductosds_1_tfhrereclin ,
                                          short AV78Wcdetalleproductosds_2_tfhrereclin_to ,
                                          String AV80Wcdetalleproductosds_4_tfhreprdnum_sel ,
                                          String AV79Wcdetalleproductosds_3_tfhreprdnum ,
                                          String AV82Wcdetalleproductosds_6_tfhreprddsc_sel ,
                                          String AV81Wcdetalleproductosds_5_tfhreprddsc ,
                                          java.math.BigDecimal AV83Wcdetalleproductosds_7_tfhrefaccon ,
                                          java.math.BigDecimal AV84Wcdetalleproductosds_8_tfhrefaccon_to ,
                                          String AV86Wcdetalleproductosds_10_tfhreprduds_sel ,
                                          String AV85Wcdetalleproductosds_9_tfhreprduds ,
                                          java.math.BigDecimal AV87Wcdetalleproductosds_11_tfhreprdcant ,
                                          java.math.BigDecimal AV88Wcdetalleproductosds_12_tfhreprdcant_to ,
                                          java.math.BigDecimal AV89Wcdetalleproductosds_13_tfhrecanany ,
                                          java.math.BigDecimal AV90Wcdetalleproductosds_14_tfhrecanany_to ,
                                          byte AV91Wcdetalleproductosds_15_tfhrefornro ,
                                          byte AV92Wcdetalleproductosds_16_tfhrefornro_to ,
                                          byte AV93Wcdetalleproductosds_17_tfhreprdtnq ,
                                          byte AV94Wcdetalleproductosds_18_tfhreprdtnq_to ,
                                          String AV96Wcdetalleproductosds_20_tfhrelinusr_sel ,
                                          String AV95Wcdetalleproductosds_19_tfhrelinusr ,
                                          short A4557HreRecLin ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4562HreFacCon ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          java.math.BigDecimal A4565HreCanAny ,
                                          byte A4566HreForNro ,
                                          byte A4567HrePrdTnq ,
                                          String A4582HreLinUsr ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String AV5EmprCod ,
                                          int AV6HreBarCod ,
                                          byte AV7HreBarReo ,
                                          String AV8HreBarPar ,
                                          byte AV9HreNumCie ,
                                          short AV10HreLinMaq ,
                                          byte AV11HreLinPro ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          byte A4550HreLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[27];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPHISLRE" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ?)");
      if ( ! (0==AV77Wcdetalleproductosds_1_tfhrereclin) )
      {
         addWhere(sWhereString, "(HreRecLin >= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcdetalleproductosds_2_tfhrereclin_to) )
      {
         addWhere(sWhereString, "(HreRecLin <= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Wcdetalleproductosds_4_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Wcdetalleproductosds_3_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Wcdetalleproductosds_4_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdNum = ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Wcdetalleproductosds_6_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Wcdetalleproductosds_5_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Wcdetalleproductosds_6_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdDsc = ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Wcdetalleproductosds_7_tfhrefaccon)==0) )
      {
         addWhere(sWhereString, "(HreFacCon >= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcdetalleproductosds_8_tfhrefaccon_to)==0) )
      {
         addWhere(sWhereString, "(HreFacCon <= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Wcdetalleproductosds_10_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV85Wcdetalleproductosds_9_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Wcdetalleproductosds_10_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Wcdetalleproductosds_11_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Wcdetalleproductosds_12_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wcdetalleproductosds_13_tfhrecanany)==0) )
      {
         addWhere(sWhereString, "(HreCanAny >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wcdetalleproductosds_14_tfhrecanany_to)==0) )
      {
         addWhere(sWhereString, "(HreCanAny <= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV91Wcdetalleproductosds_15_tfhrefornro) )
      {
         addWhere(sWhereString, "(HreForNro >= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV92Wcdetalleproductosds_16_tfhrefornro_to) )
      {
         addWhere(sWhereString, "(HreForNro <= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (0==AV93Wcdetalleproductosds_17_tfhreprdtnq) )
      {
         addWhere(sWhereString, "(HrePrdTnq >= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV94Wcdetalleproductosds_18_tfhreprdtnq_to) )
      {
         addWhere(sWhereString, "(HrePrdTnq <= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Wcdetalleproductosds_20_tfhrelinusr_sel)==0) && ( ! (GXutil.strcmp("", AV95Wcdetalleproductosds_19_tfhrelinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Wcdetalleproductosds_20_tfhrelinusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLinUsr = ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV19OrderedBy == 1 ) && ! AV20OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 1 ) && ( AV20OrderedDsc ) )
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
      else if ( ( AV19OrderedBy == 10 ) && ! AV20OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV19OrderedBy == 10 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H015Z2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).byteValue() );
            case 1 :
                  return conditional_H015Z3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H015Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015Z3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               return;
      }
   }

}

