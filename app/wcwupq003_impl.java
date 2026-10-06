package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwupq003_impl extends GXWebComponent
{
   public wcwupq003_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcwupq003_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwupq003_impl.class ));
   }

   public wcwupq003_impl( int remoteHandle ,
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
      chkavSeleccionar = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix});
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
      nRC_GXsfl_97 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_97"))) ;
      nGXsfl_97_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_97_idx"))) ;
      sGXsfl_97_idx = httpContext.GetPar( "sGXsfl_97_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      AV34Exis = CommonUtil.decimalVal( httpContext.GetPar( "Exis"), ".") ;
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
      AV34Exis = CommonUtil.decimalVal( httpContext.GetPar( "Exis"), ".") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A719PrdNum = httpContext.GetPar( "PrdNum") ;
      A3348CCStkFec = localUtil.parseDateParm( httpContext.GetPar( "CCStkFec")) ;
      A3356CCStkHor = httpContext.GetPar( "CCStkHor") ;
      AV32Emprcod = httpContext.GetPar( "Emprcod") ;
      AV49Prdnum = httpContext.GetPar( "Prdnum") ;
      AV10CCstkfec = localUtil.parseDateParm( httpContext.GetPar( "CCstkfec")) ;
      AV11CCstkfec_to = localUtil.parseDateParm( httpContext.GetPar( "CCstkfec_to")) ;
      A3345TipMovCc = httpContext.GetPar( "TipMovCc") ;
      AV77TipMovCcIN = httpContext.GetPar( "TipMovCcIN") ;
      A3343CCStkCanE = CommonUtil.decimalVal( httpContext.GetPar( "CCStkCanE"), ".") ;
      A3344CCStkCanS = CommonUtil.decimalVal( httpContext.GetPar( "CCStkCanS"), ".") ;
      AV33EntSalInv = (short)(GXutil.lval( httpContext.GetPar( "EntSalInv"))) ;
      AV24Compras = CommonUtil.decimalVal( httpContext.GetPar( "Compras"), ".") ;
      AV26Consumos = CommonUtil.decimalVal( httpContext.GetPar( "Consumos"), ".") ;
      AV30Devoluciones = CommonUtil.decimalVal( httpContext.GetPar( "Devoluciones"), ".") ;
      A3357CCStkDsc = httpContext.GetPar( "CCStkDsc") ;
      A3342CCStkLin = GXutil.lval( httpContext.GetPar( "CCStkLin")) ;
      A3349CCStkPre = CommonUtil.decimalVal( httpContext.GetPar( "CCStkPre"), ".") ;
      A5722CCStkLot = httpContext.GetPar( "CCStkLot") ;
      A3350CCStkBar = (int)(GXutil.lval( httpContext.GetPar( "CCStkBar"))) ;
      A3351CCStkReo = (byte)(GXutil.lval( httpContext.GetPar( "CCStkReo"))) ;
      A3352CCStkPar = httpContext.GetPar( "CCStkPar") ;
      A3358CCStkLen = (short)(GXutil.lval( httpContext.GetPar( "CCStkLen"))) ;
      A3353CCStkPed = (int)(GXutil.lval( httpContext.GetPar( "CCStkPed"))) ;
      A3355CCStkUsu = httpContext.GetPar( "CCStkUsu") ;
      AV47PrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiAlm"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV34Exis, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV32Emprcod, AV49Prdnum, AV10CCstkfec, AV11CCstkfec_to, A3345TipMovCc, AV77TipMovCcIN, A3343CCStkCanE, A3344CCStkCanS, AV33EntSalInv, AV24Compras, AV26Consumos, AV30Devoluciones, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, AV47PrdExiAlm, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paZP2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Consulta Cuenta Corriente Producto (v 03)", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcwupq003", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV33EntSalInv), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCWUPQ003");
      forbiddenHiddens.add("PrdExiAlm", localUtil.format( AV47PrdExiAlm, "ZZZZZZ9.9999"));
      forbiddenHiddens.add("Compras", localUtil.format( AV24Compras, "ZZZZZZ9.9999"));
      forbiddenHiddens.add("Consumos", localUtil.format( AV26Consumos, "ZZZZZZ9.9999"));
      forbiddenHiddens.add("Devoluciones", localUtil.format( AV30Devoluciones, "ZZZZZZ9.9999"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcwupq003:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_97", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_97, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV43ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV43ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV21ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV21ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKFEC", localUtil.dtoc( A3348CCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKHOR", GXutil.rtrim( A3356CCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV32Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV49Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKFEC", localUtil.dtoc( AV10CCstkfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKFEC_TO", localUtil.dtoc( AV11CCstkfec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPMOVCC", GXutil.rtrim( A3345TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKCANE", GXutil.ltrim( localUtil.ntoc( A3343CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKCANS", GXutil.ltrim( localUtil.ntoc( A3344CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTSALINV", GXutil.ltrim( localUtil.ntoc( AV33EntSalInv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV33EntSalInv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKDSC", GXutil.rtrim( A3357CCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKLIN", GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKPRE", GXutil.ltrim( localUtil.ntoc( A3349CCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKLOT", GXutil.rtrim( A5722CCStkLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKBAR", GXutil.ltrim( localUtil.ntoc( A3350CCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKREO", GXutil.ltrim( localUtil.ntoc( A3351CCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKPAR", GXutil.rtrim( A3352CCStkPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKLEN", GXutil.ltrim( localUtil.ntoc( A3358CCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKPED", GXutil.ltrim( localUtil.ntoc( A3353CCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKUSU", GXutil.rtrim( A3355CCStkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV67Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV68Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALDOINICIAL", GXutil.ltrim( localUtil.ntoc( AV54SaldoInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Title", GXutil.rtrim( Dvelop_confirmpanel_btnmodificarnlote_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnmodificarnlote_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnmodificarnlote_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnmodificarnlote_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnmodificarnlote_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnmodificarnlote_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnmodificarnlote_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Result", GXutil.rtrim( Dvelop_confirmpanel_btnmodificarnlote_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Result", GXutil.rtrim( Dvelop_confirmpanel_btnmodificarnlote_Result));
   }

   public void renderHtmlCloseFormZP2( )
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
      return "WCWUPQ003" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Cuenta Corriente Producto (v 03)", "") ;
   }

   public void wbZP0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcwupq003");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainWithShadow", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 97, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 97, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSaldoinicialafecha_Internalname, httpContext.getMessage( "FECHA", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'" + sPrefix + "',false,'" + sGXsfl_97_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSaldoinicialafecha_Internalname, AV55SaldoInicialaFecha, GXutil.rtrim( localUtil.format( AV55SaldoInicialaFecha, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSaldoinicialafecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSaldoinicialafecha_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_30_ZP2( true) ;
      }
      else
      {
         wb_table1_30_ZP2( false) ;
      }
      return  ;
   }

   public void wb_table1_30_ZP2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavExistenciasgrid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavExistenciasgrid_Internalname, httpContext.getMessage( "Exis. Cta Corriente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'" + sPrefix + "',false,'" + sGXsfl_97_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExistenciasgrid_Internalname, GXutil.ltrim( localUtil.ntoc( AV37ExistenciasGrid, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExistenciasgrid_Enabled!=0) ? localUtil.format( AV37ExistenciasGrid, "ZZZZZZ9.9999") : localUtil.format( AV37ExistenciasGrid, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,53);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExistenciasgrid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExistenciasgrid_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdexialm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdexialm_Internalname, httpContext.getMessage( "Exis. Base Datos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'" + sPrefix + "',false,'" + sGXsfl_97_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdexialm_Internalname, GXutil.ltrim( localUtil.ntoc( AV47PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdexialm_Enabled!=0) ? localUtil.format( AV47PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( AV47PrdExiAlm, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,57);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdexialm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdexialm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavExistenciasdif_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavExistenciasdif_Internalname, httpContext.getMessage( "Diferencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'" + sPrefix + "',false,'" + sGXsfl_97_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExistenciasdif_Internalname, GXutil.ltrim( localUtil.ntoc( AV36ExistenciasDif, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExistenciasdif_Enabled!=0) ? localUtil.format( AV36ExistenciasDif, "ZZZZZZ9.9999") : localUtil.format( AV36ExistenciasDif, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,61);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExistenciasdif_Jsonclick, 0, "AttributeFL", "color:"+WebUtils.getHTMLColor( edtavExistenciasdif_Forecolor)+";"+((edtavExistenciasdif_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavExistenciasdif_Backcolor)+";"), "", "", "", 1, edtavExistenciasdif_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCompras_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCompras_Internalname, httpContext.getMessage( "Compras (EN)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'" + sPrefix + "',false,'" + sGXsfl_97_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCompras_Internalname, GXutil.ltrim( localUtil.ntoc( AV24Compras, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCompras_Enabled!=0) ? localUtil.format( AV24Compras, "ZZZZZZ9.9999") : localUtil.format( AV24Compras, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,70);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCompras_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCompras_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavConsumos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavConsumos_Internalname, httpContext.getMessage( "Consumos (SC,SM)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'" + sPrefix + "',false,'" + sGXsfl_97_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavConsumos_Internalname, GXutil.ltrim( localUtil.ntoc( AV26Consumos, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavConsumos_Enabled!=0) ? localUtil.format( AV26Consumos, "ZZZZZZ9.9999") : localUtil.format( AV26Consumos, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,74);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavConsumos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavConsumos_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevoluciones_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevoluciones_Internalname, httpContext.getMessage( "Devoluciones (SD)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'" + sGXsfl_97_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevoluciones_Internalname, GXutil.ltrim( localUtil.ntoc( AV30Devoluciones, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevoluciones_Enabled!=0) ? localUtil.format( AV30Devoluciones, "ZZZZZZ9.9999") : localUtil.format( AV30Devoluciones, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,78);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevoluciones_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevoluciones_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLotenuevo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLotenuevo_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'" + sPrefix + "',false,'" + sGXsfl_97_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLotenuevo_Internalname, GXutil.rtrim( AV70Lotenuevo), GXutil.rtrim( localUtil.format( AV70Lotenuevo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLotenuevo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLotenuevo_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmodificarnlote_Internalname, "gx.evt.setGridEvt("+GXutil.str( 97, 2, 0)+","+"null"+");", httpContext.getMessage( "Modificar (op)", ""), bttBtnmodificarnlote_Jsonclick, 7, httpContext.getMessage( "Modificar (op)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11zp1_client"+"'", TempTags, "", 2, "HLP_WCWUPQ003.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol97( ) ;
      }
      if ( wbEnd == 97 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_97 = (int)(nGXsfl_97_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV28DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV28DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV21ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_123_ZP2( true) ;
      }
      else
      {
         wb_table2_123_ZP2( false) ;
      }
      return  ;
   }

   public void wb_table2_123_ZP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_128_ZP2( true) ;
      }
      else
      {
         wb_table3_128_ZP2( false) ;
      }
      return  ;
   }

   public void wb_table3_128_ZP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 97 )
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

   public void startZP2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Cuenta Corriente Producto (v 03)", ""), (short)(0)) ;
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
            strupZP0( ) ;
         }
      }
   }

   public void wsZP2( )
   {
      startZP2( ) ;
      evtZP2( ) ;
   }

   public void evtZP2( )
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
                              strupZP0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupZP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12ZP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupZP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e13ZP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupZP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupZP0( ) ;
                           }
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VMODIFICARLOTE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VMODIFICARLOTE.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupZP0( ) ;
                           }
                           nGXsfl_97_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_972( ) ;
                           AV64Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminar_Internalname, "Bitmap", ((GXutil.strcmp("", AV64Eliminar)==0) ? AV83Eliminar_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV64Eliminar))), !bGXsfl_97_Refreshing);
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEliminar_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV64Eliminar), true);
                           AV69ModificarLote = httpContext.cgiGet( edtavModificarlote_Internalname) ;
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavModificarlote_Internalname, "Bitmap", ((GXutil.strcmp("", AV69ModificarLote)==0) ? AV84Modificarlote_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV69ModificarLote))), !bGXsfl_97_Refreshing);
                           httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavModificarlote_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV69ModificarLote), true);
                           AV56Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV56Seleccionar);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKLIN");
                              GX_FocusControl = edtavCcstklin_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV14CCStkLin = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCStkLin), 12, 0));
                           }
                           else
                           {
                              AV14CCStkLin = localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCStkLin), 12, 0));
                           }
                           AV31DiaHora = httpContext.cgiGet( edtavDiahora_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDiahora_Internalname, AV31DiaHora);
                           AV58TipMovCc = httpContext.cgiGet( edtavTipmovcc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipmovcc_Internalname, AV58TipMovCc);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, GXutil.rtrim( localUtil.format( AV58TipMovCc, ""))));
                           AV9CCStkDsc = httpContext.cgiGet( edtavCcstkdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkdsc_Internalname, AV9CCStkDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, GXutil.rtrim( localUtil.format( AV9CCStkDsc, ""))));
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANE");
                              GX_FocusControl = edtavCcstkcane_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV7CCStkCanE = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV7CCStkCanE, 12, 4));
                           }
                           else
                           {
                              AV7CCStkCanE = localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV7CCStkCanE, 12, 4));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANS");
                              GX_FocusControl = edtavCcstkcans_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV8CCStkCanS = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV8CCStkCanS, 12, 4));
                           }
                           else
                           {
                              AV8CCStkCanS = localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV8CCStkCanS, 12, 4));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKPRE");
                              GX_FocusControl = edtavCcstkpre_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV18CCStkPre = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpre_Internalname, GXutil.ltrimstr( AV18CCStkPre, 14, 5));
                           }
                           else
                           {
                              AV18CCStkPre = localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpre_Internalname, GXutil.ltrimstr( AV18CCStkPre, 14, 5));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXIS");
                              GX_FocusControl = edtavExis_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV34Exis = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV34Exis, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, localUtil.format( AV34Exis, "ZZZZZZ9.9999")));
                           }
                           else
                           {
                              AV34Exis = localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV34Exis, 12, 4));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, localUtil.format( AV34Exis, "ZZZZZZ9.9999")));
                           }
                           AV15CCStkLot = httpContext.cgiGet( edtavCcstklot_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklot_Internalname, AV15CCStkLot);
                           AV40Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV40Hdr);
                           AV20CCStkUsu = GXutil.upper( httpContext.cgiGet( edtavCcstkusu_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkusu_Internalname, AV20CCStkUsu);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKBAR");
                              GX_FocusControl = edtavCcstkbar_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV6CCStkBar = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkbar_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CCStkBar), 8, 0));
                           }
                           else
                           {
                              AV6CCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkbar_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CCStkBar), 8, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKREO");
                              GX_FocusControl = edtavCcstkreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV19CCStkReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkreo_Internalname, GXutil.str( AV19CCStkReo, 1, 0));
                           }
                           else
                           {
                              AV19CCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkreo_Internalname, GXutil.str( AV19CCStkReo, 1, 0));
                           }
                           AV16CCStkPar = httpContext.cgiGet( edtavCcstkpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpar_Internalname, AV16CCStkPar);
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavCcstkfecgrid_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCCSTKFECGRID");
                              GX_FocusControl = edtavCcstkfecgrid_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV66CCStkFecgrid = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkfecgrid_Internalname, localUtil.format(AV66CCStkFecgrid, "99/99/99"));
                           }
                           else
                           {
                              AV66CCStkFecgrid = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCcstkfecgrid_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkfecgrid_Internalname, localUtil.format(AV66CCStkFecgrid, "99/99/99"));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKLEN");
                              GX_FocusControl = edtavCcstklen_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV13CCStkLen = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklen_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCStkLen), 4, 0));
                           }
                           else
                           {
                              AV13CCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklen_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCStkLen), 4, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKPED");
                              GX_FocusControl = edtavCcstkped_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV17CCStkPed = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkped_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CCStkPed), 8, 0));
                           }
                           else
                           {
                              AV17CCStkPed = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkped_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CCStkPed), 8, 0));
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e14ZP2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e15ZP2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e16ZP2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VMODIFICARLOTE.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e17ZP2 ();
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
                                    strupZP0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
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

   public void weZP2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormZP2( ) ;
         }
      }
   }

   public void paZP2( )
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
            GX_FocusControl = edtavSaldoinicialafecha_Internalname ;
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
      subsflControlProps_972( ) ;
      while ( nGXsfl_97_idx <= nRC_GXsfl_97 )
      {
         sendrow_972( ) ;
         nGXsfl_97_idx = ((subGrid_Islastpage==1)&&(nGXsfl_97_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_97_idx+1) ;
         sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_972( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.math.BigDecimal AV34Exis ,
                                 String A396EmprCod ,
                                 String A719PrdNum ,
                                 java.util.Date A3348CCStkFec ,
                                 String A3356CCStkHor ,
                                 String AV32Emprcod ,
                                 String AV49Prdnum ,
                                 java.util.Date AV10CCstkfec ,
                                 java.util.Date AV11CCstkfec_to ,
                                 String A3345TipMovCc ,
                                 String AV77TipMovCcIN ,
                                 java.math.BigDecimal A3343CCStkCanE ,
                                 java.math.BigDecimal A3344CCStkCanS ,
                                 short AV33EntSalInv ,
                                 java.math.BigDecimal AV24Compras ,
                                 java.math.BigDecimal AV26Consumos ,
                                 java.math.BigDecimal AV30Devoluciones ,
                                 String A3357CCStkDsc ,
                                 long A3342CCStkLin ,
                                 java.math.BigDecimal A3349CCStkPre ,
                                 String A5722CCStkLot ,
                                 int A3350CCStkBar ,
                                 byte A3351CCStkReo ,
                                 String A3352CCStkPar ,
                                 short A3358CCStkLen ,
                                 int A3353CCStkPed ,
                                 String A3355CCStkUsu ,
                                 java.math.BigDecimal AV47PrdExiAlm ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e15ZP2 ();
      GRID_nCurrentRecord = 0 ;
      rfZP2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCWUPQ003");
      forbiddenHiddens.add("PrdExiAlm", localUtil.format( AV47PrdExiAlm, "ZZZZZZ9.9999"));
      forbiddenHiddens.add("Compras", localUtil.format( AV24Compras, "ZZZZZZ9.9999"));
      forbiddenHiddens.add("Consumos", localUtil.format( AV26Consumos, "ZZZZZZ9.9999"));
      forbiddenHiddens.add("Devoluciones", localUtil.format( AV30Devoluciones, "ZZZZZZ9.9999"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcwupq003:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS", getSecureSignedToken( sPrefix, localUtil.format( AV34Exis, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXIS", GXutil.ltrim( localUtil.ntoc( AV34Exis, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV58TipMovCc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPMOVCC", GXutil.rtrim( AV58TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV9CCStkDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKDSC", GXutil.rtrim( AV9CCStkDsc));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_97_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfZP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV82Pgmname = "WCWUPQ003" ;
      Gx_err = (short)(0) ;
      edtavSaldoinicialafecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaldoinicialafecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaldoinicialafecha_Enabled), 5, 0), true);
      edtavExistenciasgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasgrid_Enabled), 5, 0), true);
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), true);
      edtavExistenciasdif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasdif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasdif_Enabled), 5, 0), true);
      edtavCompras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCompras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCompras_Enabled), 5, 0), true);
      edtavConsumos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConsumos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConsumos_Enabled), 5, 0), true);
      edtavDevoluciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevoluciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevoluciones_Enabled), 5, 0), true);
      edtavCcstklin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklin_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavDiahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahora_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavTipmovcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmovcc_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkdsc_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkcane_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcane_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkcans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcans_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkpre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpre_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavExis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExis_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstklot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklot_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkusu_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkbar_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkreo_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpar_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkfecgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkfecgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkfecgrid_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstklen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklen_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkped_Enabled), 5, 0), !bGXsfl_97_Refreshing);
   }

   public void rfZP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(97) ;
      /* Execute user event: Refresh */
      e15ZP2 ();
      nGXsfl_97_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_972( ) ;
      bGXsfl_97_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_972( ) ;
         e16ZP2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_97_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e16ZP2 ();
         }
         wbEnd = (short)(97) ;
         wbZP0( ) ;
      }
      bGXsfl_97_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesZP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTSALINV", GXutil.ltrim( localUtil.ntoc( AV33EntSalInv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vENTSALINV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV33EntSalInv), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, localUtil.format( AV34Exis, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, GXutil.rtrim( localUtil.format( AV58TipMovCc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, GXutil.rtrim( localUtil.format( AV9CCStkDsc, ""))));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(((subGrid_Recordcount==0) ? GRID_nFirstRecordOnPage+1 : subGrid_Recordcount)) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      return 50*1 ;
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34Exis, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV32Emprcod, AV49Prdnum, AV10CCstkfec, AV11CCstkfec_to, A3345TipMovCc, AV77TipMovCcIN, A3343CCStkCanE, A3344CCStkCanS, AV33EntSalInv, AV24Compras, AV26Consumos, AV30Devoluciones, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, AV47PrdExiAlm, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34Exis, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV32Emprcod, AV49Prdnum, AV10CCstkfec, AV11CCstkfec_to, A3345TipMovCc, AV77TipMovCcIN, A3343CCStkCanE, A3344CCStkCanS, AV33EntSalInv, AV24Compras, AV26Consumos, AV30Devoluciones, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, AV47PrdExiAlm, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV34Exis, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV32Emprcod, AV49Prdnum, AV10CCstkfec, AV11CCstkfec_to, A3345TipMovCc, AV77TipMovCcIN, A3343CCStkCanE, A3344CCStkCanS, AV33EntSalInv, AV24Compras, AV26Consumos, AV30Devoluciones, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, AV47PrdExiAlm, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34Exis, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV32Emprcod, AV49Prdnum, AV10CCstkfec, AV11CCstkfec_to, A3345TipMovCc, AV77TipMovCcIN, A3343CCStkCanE, A3344CCStkCanS, AV33EntSalInv, AV24Compras, AV26Consumos, AV30Devoluciones, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, AV47PrdExiAlm, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV34Exis, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV32Emprcod, AV49Prdnum, AV10CCstkfec, AV11CCstkfec_to, A3345TipMovCc, AV77TipMovCcIN, A3343CCStkCanE, A3344CCStkCanS, AV33EntSalInv, AV24Compras, AV26Consumos, AV30Devoluciones, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, AV47PrdExiAlm, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV82Pgmname = "WCWUPQ003" ;
      Gx_err = (short)(0) ;
      edtavSaldoinicialafecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSaldoinicialafecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSaldoinicialafecha_Enabled), 5, 0), true);
      edtavExistenciasgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasgrid_Enabled), 5, 0), true);
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), true);
      edtavExistenciasdif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasdif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasdif_Enabled), 5, 0), true);
      edtavCompras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCompras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCompras_Enabled), 5, 0), true);
      edtavConsumos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConsumos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConsumos_Enabled), 5, 0), true);
      edtavDevoluciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDevoluciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevoluciones_Enabled), 5, 0), true);
      edtavCcstklin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklin_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavDiahora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDiahora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiahora_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavTipmovcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipmovcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmovcc_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkdsc_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkcane_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcane_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcane_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkcans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkcans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkcans_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkpre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpre_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavExis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExis_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstklot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklot_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkusu_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkbar_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkreo_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkpar_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkfecgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkfecgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkfecgrid_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstklen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstklen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstklen_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      edtavCcstkped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCcstkped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkped_Enabled), 5, 0), !bGXsfl_97_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupZP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e14ZP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV43ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV28DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV21ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_97 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_97"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
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
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_btnmodificarnlote_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Title") ;
         Dvelop_confirmpanel_btnmodificarnlote_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Confirmationtext") ;
         Dvelop_confirmpanel_btnmodificarnlote_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnmodificarnlote_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnmodificarnlote_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnmodificarnlote_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnmodificarnlote_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Confirmtype") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Dvelop_confirmpanel_btnmodificarnlote_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE_Result") ;
         /* Read variables values. */
         AV55SaldoInicialaFecha = httpContext.cgiGet( edtavSaldoinicialafecha_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55SaldoInicialaFecha", AV55SaldoInicialaFecha);
         AV77TipMovCcIN = httpContext.cgiGet( edtavTipmovccin_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TipMovCcIN", AV77TipMovCcIN);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExistenciasgrid_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExistenciasgrid_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXISTENCIASGRID");
            GX_FocusControl = edtavExistenciasgrid_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37ExistenciasGrid = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ExistenciasGrid", GXutil.ltrimstr( AV37ExistenciasGrid, 12, 4));
         }
         else
         {
            AV37ExistenciasGrid = localUtil.ctond( httpContext.cgiGet( edtavExistenciasgrid_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ExistenciasGrid", GXutil.ltrimstr( AV37ExistenciasGrid, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDEXIALM");
            GX_FocusControl = edtavPrdexialm_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47PrdExiAlm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47PrdExiAlm", GXutil.ltrimstr( AV47PrdExiAlm, 12, 4));
         }
         else
         {
            AV47PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47PrdExiAlm", GXutil.ltrimstr( AV47PrdExiAlm, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXISTENCIASDIF");
            GX_FocusControl = edtavExistenciasdif_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36ExistenciasDif = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ExistenciasDif", GXutil.ltrimstr( AV36ExistenciasDif, 12, 4));
         }
         else
         {
            AV36ExistenciasDif = localUtil.ctond( httpContext.cgiGet( edtavExistenciasdif_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ExistenciasDif", GXutil.ltrimstr( AV36ExistenciasDif, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCompras_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCompras_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOMPRAS");
            GX_FocusControl = edtavCompras_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24Compras = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Compras", GXutil.ltrimstr( AV24Compras, 12, 4));
         }
         else
         {
            AV24Compras = localUtil.ctond( httpContext.cgiGet( edtavCompras_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Compras", GXutil.ltrimstr( AV24Compras, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavConsumos_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavConsumos_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCONSUMOS");
            GX_FocusControl = edtavConsumos_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26Consumos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Consumos", GXutil.ltrimstr( AV26Consumos, 12, 4));
         }
         else
         {
            AV26Consumos = localUtil.ctond( httpContext.cgiGet( edtavConsumos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Consumos", GXutil.ltrimstr( AV26Consumos, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDevoluciones_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDevoluciones_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDEVOLUCIONES");
            GX_FocusControl = edtavDevoluciones_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30Devoluciones = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Devoluciones", GXutil.ltrimstr( AV30Devoluciones, 12, 4));
         }
         else
         {
            AV30Devoluciones = localUtil.ctond( httpContext.cgiGet( edtavDevoluciones_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Devoluciones", GXutil.ltrimstr( AV30Devoluciones, 12, 4));
         }
         AV70Lotenuevo = httpContext.cgiGet( edtavLotenuevo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Lotenuevo", AV70Lotenuevo);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCWUPQ003");
         AV47PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47PrdExiAlm", GXutil.ltrimstr( AV47PrdExiAlm, 12, 4));
         forbiddenHiddens.add("PrdExiAlm", localUtil.format( AV47PrdExiAlm, "ZZZZZZ9.9999"));
         AV24Compras = localUtil.ctond( httpContext.cgiGet( edtavCompras_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Compras", GXutil.ltrimstr( AV24Compras, 12, 4));
         forbiddenHiddens.add("Compras", localUtil.format( AV24Compras, "ZZZZZZ9.9999"));
         AV26Consumos = localUtil.ctond( httpContext.cgiGet( edtavConsumos_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Consumos", GXutil.ltrimstr( AV26Consumos, 12, 4));
         forbiddenHiddens.add("Consumos", localUtil.format( AV26Consumos, "ZZZZZZ9.9999"));
         AV30Devoluciones = localUtil.ctond( httpContext.cgiGet( edtavDevoluciones_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Devoluciones", GXutil.ltrimstr( AV30Devoluciones, 12, 4));
         forbiddenHiddens.add("Devoluciones", localUtil.format( AV30Devoluciones, "ZZZZZZ9.9999"));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wcwupq003:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e14ZP2 ();
      if (returnInSub) return;
   }

   public void e14ZP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV34Exis = AV35Existencias ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV34Exis, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, localUtil.format( AV34Exis, "ZZZZZZ9.9999")));
      AV55SaldoInicialaFecha = httpContext.getMessage( "Saldo Inicial < ", "") + GXutil.trim( localUtil.dtoc( AV10CCstkfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + " = " + GXutil.trim( GXutil.str( AV54SaldoInicial, 12, 4)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55SaldoInicialaFecha", AV55SaldoInicialaFecha);
      GXt_char1 = AV68Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcwupq003_impl.this.GXt_char1 = GXv_char2[0] ;
      AV68Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Station", AV68Station);
      GXv_char2[0] = AV32Emprcod ;
      GXv_char3[0] = AV71EmprNom ;
      GXv_char4[0] = AV67Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV68Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcwupq003_impl.this.AV32Emprcod = GXv_char2[0] ;
      wcwupq003_impl.this.AV71EmprNom = GXv_char3[0] ;
      wcwupq003_impl.this.AV67Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Usurcod", AV67Usurcod);
   }

   public void e15ZP2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e16ZP2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      lV77TipMovCcIN = GXutil.padr( GXutil.rtrim( AV77TipMovCcIN), 2, "%") ;
      /* Using cursor H00ZP2 */
      pr_default.execute(0, new Object[] {AV32Emprcod, AV49Prdnum, AV10CCstkfec, lV77TipMovCcIN, AV77TipMovCcIN, AV11CCstkfec_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H00ZP2_A396EmprCod[0] ;
         A719PrdNum = H00ZP2_A719PrdNum[0] ;
         A3345TipMovCc = H00ZP2_A3345TipMovCc[0] ;
         A3348CCStkFec = H00ZP2_A3348CCStkFec[0] ;
         A3343CCStkCanE = H00ZP2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = H00ZP2_A3344CCStkCanS[0] ;
         A3357CCStkDsc = H00ZP2_A3357CCStkDsc[0] ;
         A3342CCStkLin = H00ZP2_A3342CCStkLin[0] ;
         A3349CCStkPre = H00ZP2_A3349CCStkPre[0] ;
         A5722CCStkLot = H00ZP2_A5722CCStkLot[0] ;
         A3350CCStkBar = H00ZP2_A3350CCStkBar[0] ;
         A3351CCStkReo = H00ZP2_A3351CCStkReo[0] ;
         A3352CCStkPar = H00ZP2_A3352CCStkPar[0] ;
         A3358CCStkLen = H00ZP2_A3358CCStkLen[0] ;
         A3353CCStkPed = H00ZP2_A3353CCStkPed[0] ;
         A3355CCStkUsu = H00ZP2_A3355CCStkUsu[0] ;
         A3356CCStkHor = H00ZP2_A3356CCStkHor[0] ;
         AV56Seleccionar = "N" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV56Seleccionar);
         AV31DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDiahora_Internalname, AV31DiaHora);
         AV7CCStkCanE = A3343CCStkCanE ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV7CCStkCanE, 12, 4));
         AV8CCStkCanS = A3344CCStkCanS ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV8CCStkCanS, 12, 4));
         if ( GXutil.strcmp(A3345TipMovCc, "SR") == 0 )
         {
            AV5Recfec = A3348CCStkFec ;
            GXv_char4[0] = AV32Emprcod ;
            GXv_char3[0] = AV49Prdnum ;
            GXv_date5[0] = A3348CCStkFec ;
            GXv_decimal6[0] = AV25ComprasInv ;
            GXv_decimal7[0] = AV27ConsumosInv ;
            GXv_decimal8[0] = AV50RecExiRcc ;
            GXv_decimal9[0] = AV51RecExiRea ;
            GXv_decimal10[0] = AV52RecExiTcc ;
            GXv_decimal11[0] = AV53Recexiteo ;
            new app.recuento(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11) ;
            wcwupq003_impl.this.AV32Emprcod = GXv_char4[0] ;
            wcwupq003_impl.this.AV49Prdnum = GXv_char3[0] ;
            wcwupq003_impl.this.A3348CCStkFec = GXv_date5[0] ;
            wcwupq003_impl.this.AV25ComprasInv = GXv_decimal6[0] ;
            wcwupq003_impl.this.AV27ConsumosInv = GXv_decimal7[0] ;
            wcwupq003_impl.this.AV50RecExiRcc = GXv_decimal8[0] ;
            wcwupq003_impl.this.AV51RecExiRea = GXv_decimal9[0] ;
            wcwupq003_impl.this.AV52RecExiTcc = GXv_decimal10[0] ;
            wcwupq003_impl.this.AV53Recexiteo = GXv_decimal11[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Prdnum", AV49Prdnum);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3348CCStkFec", localUtil.format(A3348CCStkFec, "99/99/99"));
            AV34Exis = ((AV33EntSalInv==0) ? AV51RecExiRea : AV51RecExiRea.add(AV25ComprasInv).subtract(AV27ConsumosInv)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV34Exis, 12, 4));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, localUtil.format( AV34Exis, "ZZZZZZ9.9999")));
            AV7CCStkCanE = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV7CCStkCanE, 12, 4));
            AV8CCStkCanS = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV8CCStkCanS, 12, 4));
         }
         else
         {
            AV34Exis = AV34Exis.add(((AV7CCStkCanE.subtract(AV8CCStkCanS)))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExis_Internalname, GXutil.ltrimstr( AV34Exis, 12, 4));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vEXIS"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, localUtil.format( AV34Exis, "ZZZZZZ9.9999")));
            AV24Compras = AV24Compras.add((((GXutil.strcmp(A3345TipMovCc, "EN")==0) ? AV7CCStkCanE : DecimalUtil.doubleToDec(0)))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Compras", GXutil.ltrimstr( AV24Compras, 12, 4));
            AV26Consumos = AV26Consumos.add((((GXutil.strcmp(A3345TipMovCc, "SC")==0)||(GXutil.strcmp(A3345TipMovCc, "SM")==0) ? AV8CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Consumos", GXutil.ltrimstr( AV26Consumos, 12, 4));
            AV30Devoluciones = AV30Devoluciones.add((((GXutil.strcmp(A3345TipMovCc, "SD")==0) ? AV8CCStkCanS : DecimalUtil.doubleToDec(0)))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Devoluciones", GXutil.ltrimstr( AV30Devoluciones, 12, 4));
         }
         AV9CCStkDsc = A3357CCStkDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkdsc_Internalname, AV9CCStkDsc);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKDSC"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, GXutil.rtrim( localUtil.format( AV9CCStkDsc, ""))));
         AV58TipMovCc = A3345TipMovCc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipmovcc_Internalname, AV58TipMovCc);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTIPMOVCC"+"_"+sGXsfl_97_idx, getSecureSignedToken( sPrefix+sGXsfl_97_idx, GXutil.rtrim( localUtil.format( AV58TipMovCc, ""))));
         AV14CCStkLin = A3342CCStkLin ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCStkLin), 12, 0));
         AV31DiaHora = localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3356CCStkHor ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDiahora_Internalname, AV31DiaHora);
         AV12CCStkHor = A3356CCStkHor ;
         AV18CCStkPre = A3349CCStkPre ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpre_Internalname, GXutil.ltrimstr( AV18CCStkPre, 14, 5));
         AV7CCStkCanE = A3343CCStkCanE ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcane_Internalname, GXutil.ltrimstr( AV7CCStkCanE, 12, 4));
         AV8CCStkCanS = A3344CCStkCanS ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkcans_Internalname, GXutil.ltrimstr( AV8CCStkCanS, 12, 4));
         AV15CCStkLot = A5722CCStkLot ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklot_Internalname, AV15CCStkLot);
         AV6CCStkBar = A3350CCStkBar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkbar_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CCStkBar), 8, 0));
         AV19CCStkReo = A3351CCStkReo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkreo_Internalname, GXutil.str( AV19CCStkReo, 1, 0));
         AV16CCStkPar = A3352CCStkPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpar_Internalname, AV16CCStkPar);
         AV13CCStkLen = A3358CCStkLen ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklen_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCStkLen), 4, 0));
         AV17CCStkPed = A3353CCStkPed ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkped_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CCStkPed), 8, 0));
         AV20CCStkUsu = A3355CCStkUsu ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkusu_Internalname, AV20CCStkUsu);
         AV40Hdr = ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV40Hdr);
         AV66CCStkFecgrid = A3348CCStkFec ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkfecgrid_Internalname, localUtil.format(AV66CCStkFecgrid, "99/99/99"));
         if ( GXutil.strcmp(AV58TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            edtavCcstklin_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavCcstklin_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavDiahora_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavDiahora_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavTipmovcc_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavTipmovcc_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavCcstkdsc_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavCcstkdsc_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavCcstkcane_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavCcstkcane_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavCcstkcans_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavCcstkcans_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavCcstkpre_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavCcstkpre_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavExis_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavExis_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavHdr_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavHdr_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavCcstklot_Backcolor = GXutil.getColor( 0, 255, 0) ;
            edtavCcstklot_Forecolor = GXutil.getColor( 0, 0, 0) ;
         }
         else
         {
            edtavCcstklin_Backcolor = GXutil.getColor( 255, 255, 255) ;
            edtavCcstklin_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavDiahora_Backcolor = GXutil.getColor( 255, 255, 255) ;
            edtavDiahora_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavTipmovcc_Backcolor = GXutil.getColor( 255, 255, 255) ;
            edtavTipmovcc_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavCcstkdsc_Backcolor = GXutil.getColor( 255, 255, 255) ;
            edtavCcstkcane_Backcolor = GXutil.getColor( 255, 255, 255) ;
            edtavCcstkdsc_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavCcstkcane_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavCcstkcans_Backcolor = GXutil.getColor( 255, 255, 255) ;
            edtavCcstkcans_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavCcstkpre_Backcolor = GXutil.getColor( 255, 255, 255) ;
            edtavExis_Backcolor = GXutil.getColor( 255, 255, 255) ;
            edtavExis_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavHdr_Backcolor = GXutil.getColor( 255, 255, 255) ;
            edtavHdr_Forecolor = GXutil.getColor( 0, 0, 0) ;
            edtavCcstklot_Backcolor = GXutil.getColor( 255, 255, 255) ;
            edtavCcstklot_Forecolor = GXutil.getColor( 0, 0, 0) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(97) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( 50 == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_972( ) ;
            GRID_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
            }
         }
         if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
         {
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_97_Refreshing )
         {
            httpContext.doAjaxLoad(97, GridRow);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV37ExistenciasGrid = AV34Exis ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ExistenciasGrid", GXutil.ltrimstr( AV37ExistenciasGrid, 12, 4));
      AV36ExistenciasDif = AV34Exis.subtract(AV47PrdExiAlm) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ExistenciasDif", GXutil.ltrimstr( AV36ExistenciasDif, 12, 4));
      if ( AV36ExistenciasDif.doubleValue() != 0 )
      {
         edtavExistenciasdif_Backcolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasdif_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasdif_Backcolor), 9, 0), true);
         edtavExistenciasdif_Forecolor = GXutil.getColor( 255, 255, 255) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasdif_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasdif_Forecolor), 9, 0), true);
      }
      else
      {
         edtavExistenciasdif_Backcolor = GXutil.getColor( 0, 255, 0) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasdif_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasdif_Backcolor), 9, 0), true);
         edtavExistenciasdif_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExistenciasdif_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExistenciasdif_Forecolor), 9, 0), true);
      }
      /*  Sending Event outputs  */
   }

   public void e12ZP2( )
   {
      /* Dvelop_confirmpanel_btnmodificarnlote_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnmodificarnlote_Result, "Yes") == 0 )
      {
         if ( (GXutil.strcmp("", AV70Lotenuevo)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay lote", ""));
            GX_FocusControl = edtavLotenuevo_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            /* Start For Each Line */
            nRC_GXsfl_97 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_97"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nGXsfl_97_fel_idx = 0 ;
            while ( nGXsfl_97_fel_idx < nRC_GXsfl_97 )
            {
               nGXsfl_97_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_97_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_97_fel_idx+1) ;
               sGXsfl_97_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_fel_idx), 4, 0), (short)(4), "0") ;
               subsflControlProps_fel_972( ) ;
               AV64Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
               AV69ModificarLote = httpContext.cgiGet( edtavModificarlote_Internalname) ;
               AV56Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKLIN");
                  GX_FocusControl = edtavCcstklin_Internalname ;
                  wbErr = true ;
                  AV14CCStkLin = 0 ;
               }
               else
               {
                  AV14CCStkLin = localUtil.ctol( httpContext.cgiGet( edtavCcstklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               }
               AV31DiaHora = httpContext.cgiGet( edtavDiahora_Internalname) ;
               AV58TipMovCc = httpContext.cgiGet( edtavTipmovcc_Internalname) ;
               AV9CCStkDsc = httpContext.cgiGet( edtavCcstkdsc_Internalname) ;
               if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANE");
                  GX_FocusControl = edtavCcstkcane_Internalname ;
                  wbErr = true ;
                  AV7CCStkCanE = DecimalUtil.ZERO ;
               }
               else
               {
                  AV7CCStkCanE = localUtil.ctond( httpContext.cgiGet( edtavCcstkcane_Internalname)) ;
               }
               if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKCANS");
                  GX_FocusControl = edtavCcstkcans_Internalname ;
                  wbErr = true ;
                  AV8CCStkCanS = DecimalUtil.ZERO ;
               }
               else
               {
                  AV8CCStkCanS = localUtil.ctond( httpContext.cgiGet( edtavCcstkcans_Internalname)) ;
               }
               if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKPRE");
                  GX_FocusControl = edtavCcstkpre_Internalname ;
                  wbErr = true ;
                  AV18CCStkPre = DecimalUtil.ZERO ;
               }
               else
               {
                  AV18CCStkPre = localUtil.ctond( httpContext.cgiGet( edtavCcstkpre_Internalname)) ;
               }
               if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXIS");
                  GX_FocusControl = edtavExis_Internalname ;
                  wbErr = true ;
                  AV34Exis = DecimalUtil.ZERO ;
               }
               else
               {
                  AV34Exis = localUtil.ctond( httpContext.cgiGet( edtavExis_Internalname)) ;
               }
               AV15CCStkLot = httpContext.cgiGet( edtavCcstklot_Internalname) ;
               AV40Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
               AV20CCStkUsu = GXutil.upper( httpContext.cgiGet( edtavCcstkusu_Internalname)) ;
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKBAR");
                  GX_FocusControl = edtavCcstkbar_Internalname ;
                  wbErr = true ;
                  AV6CCStkBar = 0 ;
               }
               else
               {
                  AV6CCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcstkbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               }
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKREO");
                  GX_FocusControl = edtavCcstkreo_Internalname ;
                  wbErr = true ;
                  AV19CCStkReo = (byte)(0) ;
               }
               else
               {
                  AV19CCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCcstkreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               }
               AV16CCStkPar = httpContext.cgiGet( edtavCcstkpar_Internalname) ;
               if ( localUtil.vcdtime( httpContext.cgiGet( edtavCcstkfecgrid_Internalname), (byte)(0), (byte)(0)) == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCCSTKFECGRID");
                  GX_FocusControl = edtavCcstkfecgrid_Internalname ;
                  wbErr = true ;
                  AV66CCStkFecgrid = GXutil.nullDate() ;
               }
               else
               {
                  AV66CCStkFecgrid = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCcstkfecgrid_Internalname), 0)) ;
               }
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKLEN");
                  GX_FocusControl = edtavCcstklen_Internalname ;
                  wbErr = true ;
                  AV13CCStkLen = (short)(0) ;
               }
               else
               {
                  AV13CCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcstklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               }
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCSTKPED");
                  GX_FocusControl = edtavCcstkped_Internalname ;
                  wbErr = true ;
                  AV17CCStkPed = 0 ;
               }
               else
               {
                  AV17CCStkPed = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcstkped_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               }
               if ( ( GXutil.strcmp(AV56Seleccionar, "S") == 0 ) && ( GXutil.strcmp(AV58TipMovCc, "SC") == 0 ) )
               {
                  GXv_char4[0] = AV32Emprcod ;
                  GXv_char3[0] = AV49Prdnum ;
                  GXv_int12[0] = AV14CCStkLin ;
                  GXv_int13[0] = AV6CCStkBar ;
                  GXv_int14[0] = AV19CCStkReo ;
                  GXv_char2[0] = AV16CCStkPar ;
                  GXv_char15[0] = AV70Lotenuevo ;
                  GXv_char16[0] = AV67Usurcod ;
                  GXv_char17[0] = AV68Station ;
                  new app.plotescall(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int12, GXv_int13, GXv_int14, GXv_char2, GXv_char15, GXv_char16, GXv_char17) ;
                  wcwupq003_impl.this.AV32Emprcod = GXv_char4[0] ;
                  wcwupq003_impl.this.AV49Prdnum = GXv_char3[0] ;
                  wcwupq003_impl.this.AV14CCStkLin = GXv_int12[0] ;
                  wcwupq003_impl.this.AV6CCStkBar = GXv_int13[0] ;
                  wcwupq003_impl.this.AV19CCStkReo = GXv_int14[0] ;
                  wcwupq003_impl.this.AV16CCStkPar = GXv_char2[0] ;
                  wcwupq003_impl.this.AV70Lotenuevo = GXv_char15[0] ;
                  wcwupq003_impl.this.AV67Usurcod = GXv_char16[0] ;
                  wcwupq003_impl.this.AV68Station = GXv_char17[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Prdnum", AV49Prdnum);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCStkLin), 12, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkbar_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CCStkBar), 8, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkreo_Internalname, GXutil.str( AV19CCStkReo, 1, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstkpar_Internalname, AV16CCStkPar);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Lotenuevo", AV70Lotenuevo);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Usurcod", AV67Usurcod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Station", AV68Station);
               }
               /* End For Each Line */
            }
            if ( nGXsfl_97_fel_idx == 0 )
            {
               nGXsfl_97_idx = 1 ;
               sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx), 4, 0), (short)(4), "0") ;
               subsflControlProps_972( ) ;
            }
            nGXsfl_97_fel_idx = 1 ;
            GRID_nFirstRecordOnPage = 0 ;
            GRID_nCurrentRecord = 0 ;
            GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_97_idx ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
            gxgrgrid_refresh( subGrid_Rows, AV34Exis, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV32Emprcod, AV49Prdnum, AV10CCstkfec, AV11CCstkfec_to, A3345TipMovCc, AV77TipMovCcIN, A3343CCStkCanE, A3344CCStkCanS, AV33EntSalInv, AV24Compras, AV26Consumos, AV30Devoluciones, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, AV47PrdExiAlm, sPrefix) ;
         }
      }
      /*  Sending Event outputs  */
   }

   public void e13ZP2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      if ( 0 == 1 )
      {
      }
      callWebObject(formatLink("app.wcwupq003exportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV49Prdnum)),GXutil.URLEncode(GXutil.formatDateParm(AV10CCstkfec)),GXutil.URLEncode(GXutil.formatDateParm(AV11CCstkfec_to)),GXutil.URLEncode(DecimalUtil.decToString(AV54SaldoInicial))}, new String[] {"Emprcod","Prdnum","CCstkfec","CCstkfec_to","SaldoInicial"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV9CCStkDsc, httpContext.getMessage( "Consumo Manual Almacen,wIntMov", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta linea, NO se puede Eliminar", ""));
      }
      else
      {
         GXv_char17[0] = AV32Emprcod ;
         GXv_char16[0] = AV49Prdnum ;
         GXv_int12[0] = AV14CCStkLin ;
         new app.pkccstks(remoteHandle, context).execute( GXv_char17, GXv_char16, GXv_int12) ;
         wcwupq003_impl.this.AV32Emprcod = GXv_char17[0] ;
         wcwupq003_impl.this.AV49Prdnum = GXv_char16[0] ;
         wcwupq003_impl.this.AV14CCStkLin = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Emprcod", AV32Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Prdnum", AV49Prdnum);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCcstklin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCStkLin), 12, 0));
         AV65Inc_obs = httpContext.getMessage( "Producto ", "") + AV49Prdnum + " " + GXutil.trim( AV48PrdNom) + GXutil.newLine( ) ;
         AV65Inc_obs += httpContext.getMessage( "Del Rgto CCSTKS, Linea/Mov/Desc/Usua/Fecha-Hora/Cant E/Cant S =", "") + GXutil.newLine( ) ;
         AV65Inc_obs += GXutil.trim( GXutil.str( AV14CCStkLin, 12, 0)) + " " + AV58TipMovCc + " " + GXutil.newLine( ) ;
         AV65Inc_obs += GXutil.trim( AV9CCStkDsc) + " " + GXutil.trim( AV20CCStkUsu) + GXutil.newLine( ) ;
         AV65Inc_obs += AV31DiaHora + " " + GXutil.str( AV7CCStkCanE, 12, 4) + " " + GXutil.str( AV8CCStkCanS, 12, 4) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( AV32Emprcod, GXutil.substring( AV82Pgmname, 1, 10), AV67Usurcod, AV68Station, AV65Inc_obs, 99999999, (byte)(0), "@") ;
         GRID_nFirstRecordOnPage = 0 ;
         GRID_nCurrentRecord = 0 ;
         GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_97_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         gxgrgrid_refresh( subGrid_Rows, AV34Exis, A396EmprCod, A719PrdNum, A3348CCStkFec, A3356CCStkHor, AV32Emprcod, AV49Prdnum, AV10CCstkfec, AV11CCstkfec_to, A3345TipMovCc, AV77TipMovCcIN, A3343CCStkCanE, A3344CCStkCanS, AV33EntSalInv, AV24Compras, AV26Consumos, AV30Devoluciones, A3357CCStkDsc, A3342CCStkLin, A3349CCStkPre, A5722CCStkLot, A3350CCStkBar, A3351CCStkReo, A3352CCStkPar, A3358CCStkLen, A3353CCStkPed, A3355CCStkUsu, AV47PrdExiAlm, sPrefix) ;
      }
   }

   public void S152( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
   }

   public void S162( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
   }

   public void e17ZP2( )
   {
      /* Modificarlote_Click Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV9CCStkDsc, httpContext.getMessage( "Consumo Manual Almacen,wIntMov", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta linea, NO se puede Modificar", ""));
      }
      else
      {
         if ( GXutil.strcmp(AV58TipMovCc, httpContext.getMessage( "SC", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti010", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV49Prdnum)),GXutil.URLEncode(GXutil.ltrimstr(AV14CCStkLin,12,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6CCStkBar,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19CCStkReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV16CCStkPar))}, new String[] {"EmprCod","Prdnum","CCStkLin","CCStkBar","CCStkReo","CCStkpar"}) , new Object[] {"AV32Emprcod","AV49Prdnum","AV14CCStkLin","AV6CCStkBar","AV19CCStkReo","AV16CCStkPar"});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
         else if ( GXutil.strcmp(AV58TipMovCc, httpContext.getMessage( "SM", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti011", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV49Prdnum)),GXutil.URLEncode(GXutil.ltrimstr(AV14CCStkLin,12,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17CCStkPed,8,0))}, new String[] {"EmprCod","Prdnum","CCStkLin","Ccstkped"}) , new Object[] {"AV32Emprcod","AV49Prdnum","AV14CCStkLin","AV17CCStkPed"});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
         else if ( GXutil.strcmp(AV58TipMovCc, httpContext.getMessage( "EN", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti012", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV49Prdnum)),GXutil.URLEncode(GXutil.ltrimstr(AV14CCStkLin,12,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13CCStkLen,4,0))}, new String[] {"EmprCod","Prdnum","CCStkLin","CCStkLen"}) , new Object[] {"AV32Emprcod","AV49Prdnum","AV14CCStkLin","AV13CCStkLen"});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
         else if ( GXutil.strcmp(AV58TipMovCc, httpContext.getMessage( "SR", "")) == 0 )
         {
            httpContext.popup(formatLink("app.webwuti014", new String[] {GXutil.URLEncode(GXutil.rtrim(AV32Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV49Prdnum)),GXutil.URLEncode(GXutil.ltrimstr(AV14CCStkLin,12,0)),GXutil.URLEncode(GXutil.formatDateParm(AV66CCStkFecgrid))}, new String[] {"EmprCod","Prdnum","CCStkLin","Recfec"}) , new Object[] {"AV32Emprcod","AV49Prdnum","AV14CCStkLin","AV66CCStkFecgrid"});
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
   }

   public void wb_table3_128_ZP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnmodificarnlote_Internalname, tblTabledvelop_confirmpanel_btnmodificarnlote_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnmodificarnlote.setProperty("Title", Dvelop_confirmpanel_btnmodificarnlote_Title);
         ucDvelop_confirmpanel_btnmodificarnlote.setProperty("ConfirmationText", Dvelop_confirmpanel_btnmodificarnlote_Confirmationtext);
         ucDvelop_confirmpanel_btnmodificarnlote.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnmodificarnlote_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnmodificarnlote.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnmodificarnlote_Nobuttoncaption);
         ucDvelop_confirmpanel_btnmodificarnlote.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnmodificarnlote_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnmodificarnlote.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnmodificarnlote_Yesbuttonposition);
         ucDvelop_confirmpanel_btnmodificarnlote.setProperty("ConfirmType", Dvelop_confirmpanel_btnmodificarnlote_Confirmtype);
         ucDvelop_confirmpanel_btnmodificarnlote.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnmodificarnlote_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTEContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_128_ZP2e( true) ;
      }
      else
      {
         wb_table3_128_ZP2e( false) ;
      }
   }

   public void wb_table2_123_ZP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_123_ZP2e( true) ;
      }
      else
      {
         wb_table2_123_ZP2e( false) ;
      }
   }

   public void wb_table1_30_ZP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV43ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_35_ZP2( true) ;
      }
      else
      {
         wb_table4_35_ZP2( false) ;
      }
      return  ;
   }

   public void wb_table4_35_ZP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_30_ZP2e( true) ;
      }
      else
      {
         wb_table1_30_ZP2e( false) ;
      }
   }

   public void wb_table4_35_ZP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipmovccin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipmovccin_Internalname, httpContext.getMessage( "Tipo", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'" + sPrefix + "',false,'" + sGXsfl_97_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipmovccin_Internalname, GXutil.rtrim( AV77TipMovCcIN), GXutil.rtrim( localUtil.format( AV77TipMovCcIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavTipmovccin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavTipmovccin_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCWUPQ003.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_35_ZP2e( true) ;
      }
      else
      {
         wb_table4_35_ZP2e( false) ;
      }
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
      paZP2( ) ;
      wsZP2( ) ;
      weZP2( ) ;
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
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paZP2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcwupq003", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paZP2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
      }
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
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
      paZP2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsZP2( ) ;
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
      wsZP2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
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
      weZP2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115563780", true, true);
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
         httpContext.AddJavascriptSource("wcwupq003.js", "?202682115563781", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_972( )
   {
      edtavEliminar_Internalname = sPrefix+"vELIMINAR_"+sGXsfl_97_idx ;
      edtavModificarlote_Internalname = sPrefix+"vMODIFICARLOTE_"+sGXsfl_97_idx ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_97_idx );
      edtavCcstklin_Internalname = sPrefix+"vCCSTKLIN_"+sGXsfl_97_idx ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA_"+sGXsfl_97_idx ;
      edtavTipmovcc_Internalname = sPrefix+"vTIPMOVCC_"+sGXsfl_97_idx ;
      edtavCcstkdsc_Internalname = sPrefix+"vCCSTKDSC_"+sGXsfl_97_idx ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE_"+sGXsfl_97_idx ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS_"+sGXsfl_97_idx ;
      edtavCcstkpre_Internalname = sPrefix+"vCCSTKPRE_"+sGXsfl_97_idx ;
      edtavExis_Internalname = sPrefix+"vEXIS_"+sGXsfl_97_idx ;
      edtavCcstklot_Internalname = sPrefix+"vCCSTKLOT_"+sGXsfl_97_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_97_idx ;
      edtavCcstkusu_Internalname = sPrefix+"vCCSTKUSU_"+sGXsfl_97_idx ;
      edtavCcstkbar_Internalname = sPrefix+"vCCSTKBAR_"+sGXsfl_97_idx ;
      edtavCcstkreo_Internalname = sPrefix+"vCCSTKREO_"+sGXsfl_97_idx ;
      edtavCcstkpar_Internalname = sPrefix+"vCCSTKPAR_"+sGXsfl_97_idx ;
      edtavCcstkfecgrid_Internalname = sPrefix+"vCCSTKFECGRID_"+sGXsfl_97_idx ;
      edtavCcstklen_Internalname = sPrefix+"vCCSTKLEN_"+sGXsfl_97_idx ;
      edtavCcstkped_Internalname = sPrefix+"vCCSTKPED_"+sGXsfl_97_idx ;
   }

   public void subsflControlProps_fel_972( )
   {
      edtavEliminar_Internalname = sPrefix+"vELIMINAR_"+sGXsfl_97_fel_idx ;
      edtavModificarlote_Internalname = sPrefix+"vMODIFICARLOTE_"+sGXsfl_97_fel_idx ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_97_fel_idx );
      edtavCcstklin_Internalname = sPrefix+"vCCSTKLIN_"+sGXsfl_97_fel_idx ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA_"+sGXsfl_97_fel_idx ;
      edtavTipmovcc_Internalname = sPrefix+"vTIPMOVCC_"+sGXsfl_97_fel_idx ;
      edtavCcstkdsc_Internalname = sPrefix+"vCCSTKDSC_"+sGXsfl_97_fel_idx ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE_"+sGXsfl_97_fel_idx ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS_"+sGXsfl_97_fel_idx ;
      edtavCcstkpre_Internalname = sPrefix+"vCCSTKPRE_"+sGXsfl_97_fel_idx ;
      edtavExis_Internalname = sPrefix+"vEXIS_"+sGXsfl_97_fel_idx ;
      edtavCcstklot_Internalname = sPrefix+"vCCSTKLOT_"+sGXsfl_97_fel_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_97_fel_idx ;
      edtavCcstkusu_Internalname = sPrefix+"vCCSTKUSU_"+sGXsfl_97_fel_idx ;
      edtavCcstkbar_Internalname = sPrefix+"vCCSTKBAR_"+sGXsfl_97_fel_idx ;
      edtavCcstkreo_Internalname = sPrefix+"vCCSTKREO_"+sGXsfl_97_fel_idx ;
      edtavCcstkpar_Internalname = sPrefix+"vCCSTKPAR_"+sGXsfl_97_fel_idx ;
      edtavCcstkfecgrid_Internalname = sPrefix+"vCCSTKFECGRID_"+sGXsfl_97_fel_idx ;
      edtavCcstklen_Internalname = sPrefix+"vCCSTKLEN_"+sGXsfl_97_fel_idx ;
      edtavCcstkped_Internalname = sPrefix+"vCCSTKPED_"+sGXsfl_97_fel_idx ;
   }

   public void sendrow_972( )
   {
      subsflControlProps_972( ) ;
      wbZP0( ) ;
      if ( ( 50 * 1 == 0 ) || ( nGXsfl_97_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_97_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_97_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 98,'"+sPrefix+"',false,'',97)\"" : " ") ;
         ClassString = "ActionBaseColorAttribute" + " " + ((GXutil.strcmp(edtavEliminar_gximage, "")==0) ? "" : "GX_Image_"+edtavEliminar_gximage+"_Class") ;
         StyleString = "" ;
         AV64Eliminar_IsBlob = (boolean)(((GXutil.strcmp("", AV64Eliminar)==0)&&(GXutil.strcmp("", AV83Eliminar_GXI)==0))||!(GXutil.strcmp("", AV64Eliminar)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV64Eliminar)==0) ? AV83Eliminar_GXI : httpContext.getResourceRelative(AV64Eliminar)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEliminar_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(7),edtavEliminar_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+"e18zp2_client"+"'",StyleString,ClassString,"WWActionColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV64Eliminar_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavModificarlote_Enabled!=0)&&(edtavModificarlote_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 99,'"+sPrefix+"',false,'',97)\"" : " ") ;
         ClassString = "ActionBaseColorAttribute" + " " + ((GXutil.strcmp(edtavModificarlote_gximage, "")==0) ? "" : "GX_Image_"+edtavModificarlote_gximage+"_Class") ;
         StyleString = "" ;
         AV69ModificarLote_IsBlob = (boolean)(((GXutil.strcmp("", AV69ModificarLote)==0)&&(GXutil.strcmp("", AV84Modificarlote_GXI)==0))||!(GXutil.strcmp("", AV69ModificarLote)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV69ModificarLote)==0) ? AV84Modificarlote_GXI : httpContext.getResourceRelative(AV69ModificarLote)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavModificarlote_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavModificarlote_Jsonclick,"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVMODIFICARLOTE.CLICK."+sGXsfl_97_idx+"'",StyleString,ClassString,"WWActionColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV69ModificarLote_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_97_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_97_Refreshing);
         chkavSeleccionar.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),AV56Seleccionar,"","",Integer.valueOf(-1),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,100);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavCcstklin_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklin_Enabled!=0)&&(edtavCcstklin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 101,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklin_Internalname,GXutil.ltrim( localUtil.ntoc( AV14CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstklin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14CCStkLin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14CCStkLin), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstklin_Enabled!=0)&&(edtavCcstklin_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklin_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavCcstklin_Forecolor)+";"+((edtavCcstklin_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavCcstklin_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcstklin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavDiahora_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDiahora_Enabled!=0)&&(edtavDiahora_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 102,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDiahora_Internalname,GXutil.rtrim( AV31DiaHora),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDiahora_Enabled!=0)&&(edtavDiahora_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,102);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDiahora_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavDiahora_Forecolor)+";"+((edtavDiahora_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavDiahora_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDiahora_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavTipmovcc_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTipmovcc_Enabled!=0)&&(edtavTipmovcc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 103,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipmovcc_Internalname,GXutil.rtrim( AV58TipMovCc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTipmovcc_Enabled!=0)&&(edtavTipmovcc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,103);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipmovcc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavTipmovcc_Forecolor)+";"+((edtavTipmovcc_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavTipmovcc_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipmovcc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavCcstkdsc_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkdsc_Enabled!=0)&&(edtavCcstkdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 104,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkdsc_Internalname,GXutil.rtrim( AV9CCStkDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCcstkdsc_Enabled!=0)&&(edtavCcstkdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,104);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkdsc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavCcstkdsc_Forecolor)+";"+((edtavCcstkdsc_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavCcstkdsc_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcstkdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavCcstkcane_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkcane_Enabled!=0)&&(edtavCcstkcane_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkcane_Internalname,GXutil.ltrim( localUtil.ntoc( AV7CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkcane_Enabled!=0) ? localUtil.format( AV7CCStkCanE, "ZZZZZZ9.9999") : localUtil.format( AV7CCStkCanE, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkcane_Enabled!=0)&&(edtavCcstkcane_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,105);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkcane_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavCcstkcane_Forecolor)+";"+((edtavCcstkcane_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavCcstkcane_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcstkcane_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavCcstkcans_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkcans_Enabled!=0)&&(edtavCcstkcans_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 106,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkcans_Internalname,GXutil.ltrim( localUtil.ntoc( AV8CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkcans_Enabled!=0) ? localUtil.format( AV8CCStkCanS, "ZZZZZZ9.9999") : localUtil.format( AV8CCStkCanS, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkcans_Enabled!=0)&&(edtavCcstkcans_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,106);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkcans_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavCcstkcans_Forecolor)+";"+((edtavCcstkcans_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavCcstkcans_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcstkcans_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavCcstkpre_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkpre_Enabled!=0)&&(edtavCcstkpre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkpre_Internalname,GXutil.ltrim( localUtil.ntoc( AV18CCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkpre_Enabled!=0) ? localUtil.format( AV18CCStkPre, "ZZZZZZZ9.999") : localUtil.format( AV18CCStkPre, "ZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavCcstkpre_Enabled!=0)&&(edtavCcstkpre_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,107);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkpre_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavCcstkpre_Forecolor)+";"+((edtavCcstkpre_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavCcstkpre_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcstkpre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavExis_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExis_Enabled!=0)&&(edtavExis_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExis_Internalname,GXutil.ltrim( localUtil.ntoc( AV34Exis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavExis_Enabled!=0) ? localUtil.format( AV34Exis, "ZZZZZZ9.9999") : localUtil.format( AV34Exis, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavExis_Enabled!=0)&&(edtavExis_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,108);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavExis_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavExis_Forecolor)+";"+((edtavExis_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavExis_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavExis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavCcstklot_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklot_Enabled!=0)&&(edtavCcstklot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 109,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklot_Internalname,GXutil.rtrim( AV15CCStkLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCcstklot_Enabled!=0)&&(edtavCcstklot_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,109);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklot_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavCcstklot_Forecolor)+";"+((edtavCcstklot_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavCcstklot_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCcstklot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr_Internalname,GXutil.rtrim( AV40Hdr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,110);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdr_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr_Forecolor)+";"+((edtavHdr_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkusu_Enabled!=0)&&(edtavCcstkusu_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkusu_Internalname,GXutil.rtrim( AV20CCStkUsu),GXutil.rtrim( localUtil.format( AV20CCStkUsu, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavCcstkusu_Enabled!=0)&&(edtavCcstkusu_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,111);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkusu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkusu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkbar_Enabled!=0)&&(edtavCcstkbar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkbar_Internalname,GXutil.ltrim( localUtil.ntoc( AV6CCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkbar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6CCStkBar), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6CCStkBar), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkbar_Enabled!=0)&&(edtavCcstkbar_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,112);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkbar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkbar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkreo_Enabled!=0)&&(edtavCcstkreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV19CCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19CCStkReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV19CCStkReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkreo_Enabled!=0)&&(edtavCcstkreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkpar_Enabled!=0)&&(edtavCcstkpar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 114,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkpar_Internalname,GXutil.rtrim( AV16CCStkPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCcstkpar_Enabled!=0)&&(edtavCcstkpar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,114);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkfecgrid_Enabled!=0)&&(edtavCcstkfecgrid_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkfecgrid_Internalname,localUtil.format(AV66CCStkFecgrid, "99/99/99"),localUtil.format( AV66CCStkFecgrid, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkfecgrid_Enabled!=0)&&(edtavCcstkfecgrid_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,115);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkfecgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkfecgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstklen_Enabled!=0)&&(edtavCcstklen_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 116,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstklen_Internalname,GXutil.ltrim( localUtil.ntoc( AV13CCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstklen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13CCStkLen), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13CCStkLen), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstklen_Enabled!=0)&&(edtavCcstklen_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstklen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstklen_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCcstkped_Enabled!=0)&&(edtavCcstkped_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 117,'"+sPrefix+"',false,'"+sGXsfl_97_idx+"',97)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcstkped_Internalname,GXutil.ltrim( localUtil.ntoc( AV17CCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCcstkped_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17CCStkPed), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17CCStkPed), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCcstkped_Enabled!=0)&&(edtavCcstkped_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,117);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCcstkped_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavCcstkped_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(97),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesZP2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_97_idx = ((subGrid_Islastpage==1)&&(nGXsfl_97_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_97_idx+1) ;
         sGXsfl_97_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_97_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_972( ) ;
      }
      /* End function sendrow_972 */
   }

   public void startgridcontrol97( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"97\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ActionBaseColorAttribute"+" "+((GXutil.strcmp(edtavEliminar_gximage, "")==0) ? "" : "GX_Image_"+edtavEliminar_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ActionBaseColorAttribute"+" "+((GXutil.strcmp(edtavModificarlote_gximage, "")==0) ? "" : "GX_Image_"+edtavModificarlote_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV64Eliminar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV69ModificarLote));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV56Seleccionar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV14CCStkLin, (byte)(12), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavCcstklin_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavCcstklin_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV31DiaHora));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavDiahora_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavDiahora_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDiahora_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV58TipMovCc));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavTipmovcc_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTipmovcc_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipmovcc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV9CCStkDsc));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavCcstkdsc_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavCcstkdsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV7CCStkCanE, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavCcstkcane_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavCcstkcane_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkcane_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV8CCStkCanS, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavCcstkcans_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavCcstkcans_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkcans_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV18CCStkPre, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavCcstkpre_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavCcstkpre_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkpre_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34Exis, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavExis_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavExis_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExis_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV15CCStkLot));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavCcstklot_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavCcstklot_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV40Hdr));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV20CCStkUsu));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkusu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV6CCStkBar, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkbar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV19CCStkReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV16CCStkPar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV66CCStkFecgrid, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkfecgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV13CCStkLen, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstklen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17CCStkPed, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcstkped_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      edtavSaldoinicialafecha_Internalname = sPrefix+"vSALDOINICIALAFECHA" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavTipmovccin_Internalname = sPrefix+"vTIPMOVCCIN" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavExistenciasgrid_Internalname = sPrefix+"vEXISTENCIASGRID" ;
      edtavPrdexialm_Internalname = sPrefix+"vPRDEXIALM" ;
      edtavExistenciasdif_Internalname = sPrefix+"vEXISTENCIASDIF" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE4" ;
      edtavCompras_Internalname = sPrefix+"vCOMPRAS" ;
      edtavConsumos_Internalname = sPrefix+"vCONSUMOS" ;
      edtavDevoluciones_Internalname = sPrefix+"vDEVOLUCIONES" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE5" ;
      edtavLotenuevo_Internalname = sPrefix+"vLOTENUEVO" ;
      bttBtnmodificarnlote_Internalname = sPrefix+"BTNMODIFICARNLOTE" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE6" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtavEliminar_Internalname = sPrefix+"vELIMINAR" ;
      edtavModificarlote_Internalname = sPrefix+"vMODIFICARLOTE" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtavCcstklin_Internalname = sPrefix+"vCCSTKLIN" ;
      edtavDiahora_Internalname = sPrefix+"vDIAHORA" ;
      edtavTipmovcc_Internalname = sPrefix+"vTIPMOVCC" ;
      edtavCcstkdsc_Internalname = sPrefix+"vCCSTKDSC" ;
      edtavCcstkcane_Internalname = sPrefix+"vCCSTKCANE" ;
      edtavCcstkcans_Internalname = sPrefix+"vCCSTKCANS" ;
      edtavCcstkpre_Internalname = sPrefix+"vCCSTKPRE" ;
      edtavExis_Internalname = sPrefix+"vEXIS" ;
      edtavCcstklot_Internalname = sPrefix+"vCCSTKLOT" ;
      edtavHdr_Internalname = sPrefix+"vHDR" ;
      edtavCcstkusu_Internalname = sPrefix+"vCCSTKUSU" ;
      edtavCcstkbar_Internalname = sPrefix+"vCCSTKBAR" ;
      edtavCcstkreo_Internalname = sPrefix+"vCCSTKREO" ;
      edtavCcstkpar_Internalname = sPrefix+"vCCSTKPAR" ;
      edtavCcstkfecgrid_Internalname = sPrefix+"vCCSTKFECGRID" ;
      edtavCcstklen_Internalname = sPrefix+"vCCSTKLEN" ;
      edtavCcstkped_Internalname = sPrefix+"vCCSTKPED" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_btnmodificarnlote_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE" ;
      tblTabledvelop_confirmpanel_btnmodificarnlote_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE" ;
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
      edtavCcstkped_Jsonclick = "" ;
      edtavCcstkped_Visible = 0 ;
      edtavCcstkped_Enabled = 1 ;
      edtavCcstklen_Jsonclick = "" ;
      edtavCcstklen_Visible = 0 ;
      edtavCcstklen_Enabled = 1 ;
      edtavCcstkfecgrid_Jsonclick = "" ;
      edtavCcstkfecgrid_Visible = 0 ;
      edtavCcstkfecgrid_Enabled = 1 ;
      edtavCcstkpar_Jsonclick = "" ;
      edtavCcstkpar_Visible = 0 ;
      edtavCcstkpar_Enabled = 1 ;
      edtavCcstkreo_Jsonclick = "" ;
      edtavCcstkreo_Visible = 0 ;
      edtavCcstkreo_Enabled = 1 ;
      edtavCcstkbar_Jsonclick = "" ;
      edtavCcstkbar_Visible = 0 ;
      edtavCcstkbar_Enabled = 1 ;
      edtavCcstkusu_Jsonclick = "" ;
      edtavCcstkusu_Visible = 0 ;
      edtavCcstkusu_Enabled = 1 ;
      edtavHdr_Jsonclick = "" ;
      edtavHdr_Forecolor = (int)(0x000000) ;
      edtavHdr_Visible = -1 ;
      edtavHdr_Enabled = 1 ;
      edtavHdr_Backcolor = -1 ;
      edtavCcstklot_Jsonclick = "" ;
      edtavCcstklot_Forecolor = (int)(0x000000) ;
      edtavCcstklot_Visible = -1 ;
      edtavCcstklot_Enabled = 1 ;
      edtavCcstklot_Backcolor = -1 ;
      edtavExis_Jsonclick = "" ;
      edtavExis_Forecolor = (int)(0x000000) ;
      edtavExis_Visible = -1 ;
      edtavExis_Enabled = 1 ;
      edtavExis_Backcolor = -1 ;
      edtavCcstkpre_Jsonclick = "" ;
      edtavCcstkpre_Forecolor = (int)(0x000000) ;
      edtavCcstkpre_Visible = -1 ;
      edtavCcstkpre_Enabled = 1 ;
      edtavCcstkpre_Backcolor = -1 ;
      edtavCcstkcans_Jsonclick = "" ;
      edtavCcstkcans_Forecolor = (int)(0x000000) ;
      edtavCcstkcans_Visible = -1 ;
      edtavCcstkcans_Enabled = 1 ;
      edtavCcstkcans_Backcolor = -1 ;
      edtavCcstkcane_Jsonclick = "" ;
      edtavCcstkcane_Forecolor = (int)(0x000000) ;
      edtavCcstkcane_Visible = -1 ;
      edtavCcstkcane_Enabled = 1 ;
      edtavCcstkcane_Backcolor = -1 ;
      edtavCcstkdsc_Jsonclick = "" ;
      edtavCcstkdsc_Forecolor = (int)(0x000000) ;
      edtavCcstkdsc_Visible = -1 ;
      edtavCcstkdsc_Enabled = 1 ;
      edtavCcstkdsc_Backcolor = -1 ;
      edtavTipmovcc_Jsonclick = "" ;
      edtavTipmovcc_Forecolor = (int)(0x000000) ;
      edtavTipmovcc_Visible = -1 ;
      edtavTipmovcc_Enabled = 1 ;
      edtavTipmovcc_Backcolor = -1 ;
      edtavDiahora_Jsonclick = "" ;
      edtavDiahora_Forecolor = (int)(0x000000) ;
      edtavDiahora_Visible = -1 ;
      edtavDiahora_Enabled = 1 ;
      edtavDiahora_Backcolor = -1 ;
      edtavCcstklin_Jsonclick = "" ;
      edtavCcstklin_Forecolor = (int)(0x000000) ;
      edtavCcstklin_Visible = -1 ;
      edtavCcstklin_Enabled = 1 ;
      edtavCcstklin_Backcolor = -1 ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      edtavModificarlote_Jsonclick = "" ;
      edtavModificarlote_gximage = "" ;
      edtavModificarlote_Visible = -1 ;
      edtavModificarlote_Enabled = 1 ;
      edtavEliminar_Jsonclick = "" ;
      edtavEliminar_gximage = "" ;
      edtavEliminar_Visible = -1 ;
      edtavEliminar_Enabled = 1 ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTipmovccin_Jsonclick = "" ;
      edtavTipmovccin_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavLotenuevo_Jsonclick = "" ;
      edtavLotenuevo_Enabled = 1 ;
      edtavDevoluciones_Jsonclick = "" ;
      edtavDevoluciones_Enabled = 1 ;
      edtavConsumos_Jsonclick = "" ;
      edtavConsumos_Enabled = 1 ;
      edtavCompras_Jsonclick = "" ;
      edtavCompras_Enabled = 1 ;
      edtavExistenciasdif_Jsonclick = "" ;
      edtavExistenciasdif_Backstyle = (byte)(-1) ;
      edtavExistenciasdif_Backcolor = (int)(0xFFFFFF) ;
      edtavExistenciasdif_Forecolor = (int)(0x000000) ;
      edtavExistenciasdif_Enabled = 1 ;
      edtavPrdexialm_Jsonclick = "" ;
      edtavPrdexialm_Enabled = 1 ;
      edtavExistenciasgrid_Jsonclick = "" ;
      edtavExistenciasgrid_Enabled = 1 ;
      edtavSaldoinicialafecha_Jsonclick = "" ;
      edtavSaldoinicialafecha_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_btnmodificarnlote_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnmodificarnlote_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnmodificarnlote_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnmodificarnlote_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnmodificarnlote_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnmodificarnlote_Confirmationtext = "¿ Atención. Se va a proceder el cambio en todas las líneas seleccionadas. Se cambiará por el Lote Nuevo. Confirma la modificacion?" ;
      Dvelop_confirmpanel_btnmodificarnlote_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la Linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||" ;
      Ddo_grid_Columnids = "2:Seleccionar|3:CCStkLin|4:DiaHora|5:TipMovCc|6:CCStkDsc|7:CCStkCanE|8:CCStkCanS|9:CCStkPre|10:Exis|11:CCStkLot|12:Hdr" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Movimientos", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Modificar Lote", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Tipos Movimiento Resumen", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Control Existencias", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_97_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_97_Refreshing);
      chkavSeleccionar.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfec',fld:'vCCSTKFEC',pic:''},{av:'AV11CCstkfec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV77TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'sPrefix'},{av:'AV33EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV47PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV24Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV26Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV30Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e16ZP2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfec',fld:'vCCSTKFEC',pic:''},{av:'AV11CCstkfec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV77TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV33EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV34Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV24Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV26Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV30Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'AV47PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV56Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV31DiaHora',fld:'vDIAHORA',pic:''},{av:'AV7CCStkCanE',fld:'vCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV8CCStkCanS',fld:'vCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV26Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV30Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'AV34Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV9CCStkDsc',fld:'vCCSTKDSC',pic:'',hsh:true},{av:'AV58TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'AV14CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV18CCStkPre',fld:'vCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV15CCStkLot',fld:'vCCSTKLOT',pic:''},{av:'AV6CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV19CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV16CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV13CCStkLen',fld:'vCCSTKLEN',pic:'ZZZ9'},{av:'AV17CCStkPed',fld:'vCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV20CCStkUsu',fld:'vCCSTKUSU',pic:'@!'},{av:'AV40Hdr',fld:'vHDR',pic:''},{av:'AV66CCStkFecgrid',fld:'vCCSTKFECGRID',pic:''},{av:'edtavCcstkpre_Forecolor',ctrl:'vCCSTKPRE',prop:'Forecolor'},{av:'edtavCcstklin_Backcolor',ctrl:'vCCSTKLIN',prop:'Backcolor'},{av:'edtavCcstklin_Forecolor',ctrl:'vCCSTKLIN',prop:'Forecolor'},{av:'edtavDiahora_Backcolor',ctrl:'vDIAHORA',prop:'Backcolor'},{av:'edtavDiahora_Forecolor',ctrl:'vDIAHORA',prop:'Forecolor'},{av:'edtavTipmovcc_Backcolor',ctrl:'vTIPMOVCC',prop:'Backcolor'},{av:'edtavTipmovcc_Forecolor',ctrl:'vTIPMOVCC',prop:'Forecolor'},{av:'edtavCcstkdsc_Backcolor',ctrl:'vCCSTKDSC',prop:'Backcolor'},{av:'edtavCcstkdsc_Forecolor',ctrl:'vCCSTKDSC',prop:'Forecolor'},{av:'edtavCcstkcane_Backcolor',ctrl:'vCCSTKCANE',prop:'Backcolor'},{av:'edtavCcstkcane_Forecolor',ctrl:'vCCSTKCANE',prop:'Forecolor'},{av:'edtavCcstkcans_Backcolor',ctrl:'vCCSTKCANS',prop:'Backcolor'},{av:'edtavCcstkcans_Forecolor',ctrl:'vCCSTKCANS',prop:'Forecolor'},{av:'edtavCcstkpre_Backcolor',ctrl:'vCCSTKPRE',prop:'Backcolor'},{av:'edtavExis_Backcolor',ctrl:'vEXIS',prop:'Backcolor'},{av:'edtavExis_Forecolor',ctrl:'vEXIS',prop:'Forecolor'},{av:'edtavHdr_Backcolor',ctrl:'vHDR',prop:'Backcolor'},{av:'edtavHdr_Forecolor',ctrl:'vHDR',prop:'Forecolor'},{av:'edtavCcstklot_Backcolor',ctrl:'vCCSTKLOT',prop:'Backcolor'},{av:'edtavCcstklot_Forecolor',ctrl:'vCCSTKLOT',prop:'Forecolor'},{av:'AV37ExistenciasGrid',fld:'vEXISTENCIASGRID',pic:'ZZZZZZ9.9999'},{av:'AV36ExistenciasDif',fld:'vEXISTENCIASDIF',pic:'ZZZZZZ9.9999'},{av:'edtavExistenciasdif_Backcolor',ctrl:'vEXISTENCIASDIF',prop:'Backcolor'},{av:'edtavExistenciasdif_Forecolor',ctrl:'vEXISTENCIASDIF',prop:'Forecolor'}]}");
      setEventMetadata("'DOELIMINAR'","{handler:'e18ZP2',iparms:[{av:'AV14CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'}]");
      setEventMetadata("'DOELIMINAR'",",oparms:[{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'}]}");
      setEventMetadata("'DOMODIFICARNLOTE'","{handler:'e11ZP1',iparms:[]");
      setEventMetadata("'DOMODIFICARNLOTE'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE.CLOSE","{handler:'e12ZP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Exis',fld:'vEXIS',grid:97,pic:'ZZZZZZ9.9999',hsh:true},{av:'nRC_GXsfl_97',ctrl:'GRID',grid:97,prop:'GridRC',grid:97},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfec',fld:'vCCSTKFEC',pic:''},{av:'AV11CCstkfec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV77TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV33EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV24Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV26Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV30Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'AV47PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'sPrefix'},{av:'Dvelop_confirmpanel_btnmodificarnlote_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE',prop:'Result'},{av:'AV70Lotenuevo',fld:'vLOTENUEVO',pic:''},{av:'AV56Seleccionar',fld:'vSELECCIONAR',grid:97,pic:''},{av:'AV58TipMovCc',fld:'vTIPMOVCC',grid:97,pic:'',hsh:true},{av:'AV14CCStkLin',fld:'vCCSTKLIN',grid:97,pic:'ZZZZZZZZZZZ9'},{av:'AV6CCStkBar',fld:'vCCSTKBAR',grid:97,pic:'ZZZZZZZ9'},{av:'AV19CCStkReo',fld:'vCCSTKREO',grid:97,pic:'9'},{av:'AV16CCStkPar',fld:'vCCSTKPAR',grid:97,pic:''},{av:'AV67Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV68Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNMODIFICARNLOTE.CLOSE",",oparms:[{av:'AV68Station',fld:'vSTATION',pic:''},{av:'AV67Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV70Lotenuevo',fld:'vLOTENUEVO',pic:''},{av:'AV16CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV19CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV6CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV14CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e13ZP2',iparms:[{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfec',fld:'vCCSTKFEC',pic:''},{av:'AV11CCstkfec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV54SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV54SaldoInicial',fld:'vSALDOINICIAL',pic:'ZZZZZZ9.9999'},{av:'AV11CCstkfec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'AV10CCstkfec',fld:'vCCSTKFEC',pic:''},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VMODIFICARLOTE.CLICK","{handler:'e17ZP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfec',fld:'vCCSTKFEC',pic:''},{av:'AV11CCstkfec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV77TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV33EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV24Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV26Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV30Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'AV47PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'sPrefix'},{av:'AV9CCStkDsc',fld:'vCCSTKDSC',pic:'',hsh:true},{av:'AV58TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'AV14CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV6CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV19CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV16CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV17CCStkPed',fld:'vCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV13CCStkLen',fld:'vCCSTKLEN',pic:'ZZZ9'},{av:'AV66CCStkFecgrid',fld:'vCCSTKFECGRID',pic:''}]");
      setEventMetadata("VMODIFICARLOTE.CLICK",",oparms:[{av:'AV16CCStkPar',fld:'vCCSTKPAR',pic:''},{av:'AV19CCStkReo',fld:'vCCSTKREO',pic:'9'},{av:'AV6CCStkBar',fld:'vCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV14CCStkLin',fld:'vCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17CCStkPed',fld:'vCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV13CCStkLen',fld:'vCCSTKLEN',pic:'ZZZ9'},{av:'AV66CCStkFecgrid',fld:'vCCSTKFECGRID',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfec',fld:'vCCSTKFEC',pic:''},{av:'AV11CCstkfec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV77TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV33EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV24Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV26Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV30Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'AV47PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'sPrefix'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfec',fld:'vCCSTKFEC',pic:''},{av:'AV11CCstkfec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV77TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV33EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV24Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV26Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV30Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'AV47PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'sPrefix'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfec',fld:'vCCSTKFEC',pic:''},{av:'AV11CCstkfec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV77TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV33EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV24Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV26Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV30Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'AV47PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'sPrefix'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Exis',fld:'vEXIS',pic:'ZZZZZZ9.9999',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'A3356CCStkHor',fld:'CCSTKHOR',pic:''},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49Prdnum',fld:'vPRDNUM',pic:''},{av:'AV10CCstkfec',fld:'vCCSTKFEC',pic:''},{av:'AV11CCstkfec_to',fld:'vCCSTKFEC_TO',pic:''},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'AV77TipMovCcIN',fld:'vTIPMOVCCIN',pic:''},{av:'A3343CCStkCanE',fld:'CCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'A3344CCStkCanS',fld:'CCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV33EntSalInv',fld:'vENTSALINV',pic:'ZZZ9',hsh:true},{av:'AV24Compras',fld:'vCOMPRAS',pic:'ZZZZZZ9.9999'},{av:'AV26Consumos',fld:'vCONSUMOS',pic:'ZZZZZZ9.9999'},{av:'AV30Devoluciones',fld:'vDEVOLUCIONES',pic:'ZZZZZZ9.9999'},{av:'A3357CCStkDsc',fld:'CCSTKDSC',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3349CCStkPre',fld:'CCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'A5722CCStkLot',fld:'CCSTKLOT',pic:''},{av:'A3350CCStkBar',fld:'CCSTKBAR',pic:'ZZZZZZZ9'},{av:'A3351CCStkReo',fld:'CCSTKREO',pic:'9'},{av:'A3352CCStkPar',fld:'CCSTKPAR',pic:''},{av:'A3358CCStkLen',fld:'CCSTKLEN',pic:'ZZZ9'},{av:'A3353CCStkPed',fld:'CCSTKPED',pic:'ZZZZZZZ9'},{av:'A3355CCStkUsu',fld:'CCSTKUSU',pic:'@!'},{av:'AV47PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'sPrefix'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Ccstkped',iparms:[]");
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
      Dvelop_confirmpanel_btnmodificarnlote_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV34Exis = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3356CCStkHor = "" ;
      AV32Emprcod = "" ;
      AV49Prdnum = "" ;
      AV10CCstkfec = GXutil.nullDate() ;
      AV11CCstkfec_to = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      AV77TipMovCcIN = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      AV24Compras = DecimalUtil.ZERO ;
      AV26Consumos = DecimalUtil.ZERO ;
      AV30Devoluciones = DecimalUtil.ZERO ;
      A3357CCStkDsc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A3352CCStkPar = "" ;
      A3355CCStkUsu = "" ;
      AV47PrdExiAlm = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV43ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV28DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV21ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV67Usurcod = "" ;
      AV68Station = "" ;
      AV54SaldoInicial = DecimalUtil.ZERO ;
      Ddo_grid_Caption = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      AV55SaldoInicialaFecha = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      AV37ExistenciasGrid = DecimalUtil.ZERO ;
      AV36ExistenciasDif = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      AV70Lotenuevo = "" ;
      bttBtnmodificarnlote_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV64Eliminar = "" ;
      AV83Eliminar_GXI = "" ;
      AV69ModificarLote = "" ;
      AV84Modificarlote_GXI = "" ;
      AV56Seleccionar = "" ;
      AV31DiaHora = "" ;
      AV58TipMovCc = "" ;
      AV9CCStkDsc = "" ;
      AV7CCStkCanE = DecimalUtil.ZERO ;
      AV8CCStkCanS = DecimalUtil.ZERO ;
      AV18CCStkPre = DecimalUtil.ZERO ;
      AV15CCStkLot = "" ;
      AV40Hdr = "" ;
      AV20CCStkUsu = "" ;
      AV16CCStkPar = "" ;
      AV66CCStkFecgrid = GXutil.nullDate() ;
      GXCCtl = "" ;
      AV82Pgmname = "" ;
      hsh = "" ;
      AV35Existencias = DecimalUtil.ZERO ;
      GXt_char1 = "" ;
      AV71EmprNom = "" ;
      lV77TipMovCcIN = "" ;
      scmdbuf = "" ;
      H00ZP2_A396EmprCod = new String[] {""} ;
      H00ZP2_A719PrdNum = new String[] {""} ;
      H00ZP2_A3345TipMovCc = new String[] {""} ;
      H00ZP2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00ZP2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00ZP2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00ZP2_A3357CCStkDsc = new String[] {""} ;
      H00ZP2_A3342CCStkLin = new long[1] ;
      H00ZP2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00ZP2_A5722CCStkLot = new String[] {""} ;
      H00ZP2_A3350CCStkBar = new int[1] ;
      H00ZP2_A3351CCStkReo = new byte[1] ;
      H00ZP2_A3352CCStkPar = new String[] {""} ;
      H00ZP2_A3358CCStkLen = new short[1] ;
      H00ZP2_A3353CCStkPed = new int[1] ;
      H00ZP2_A3355CCStkUsu = new String[] {""} ;
      H00ZP2_A3356CCStkHor = new String[] {""} ;
      AV5Recfec = GXutil.nullDate() ;
      GXv_date5 = new java.util.Date[1] ;
      AV25ComprasInv = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV27ConsumosInv = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV50RecExiRcc = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV51RecExiRea = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV52RecExiTcc = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV53Recexiteo = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      AV12CCStkHor = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_int12 = new long[1] ;
      AV65Inc_obs = "" ;
      AV48PrdNom = "" ;
      ucDvelop_confirmpanel_btnmodificarnlote = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwupq003__default(),
         new Object[] {
             new Object[] {
            H00ZP2_A396EmprCod, H00ZP2_A719PrdNum, H00ZP2_A3345TipMovCc, H00ZP2_A3348CCStkFec, H00ZP2_A3343CCStkCanE, H00ZP2_A3344CCStkCanS, H00ZP2_A3357CCStkDsc, H00ZP2_A3342CCStkLin, H00ZP2_A3349CCStkPre, H00ZP2_A5722CCStkLot,
            H00ZP2_A3350CCStkBar, H00ZP2_A3351CCStkReo, H00ZP2_A3352CCStkPar, H00ZP2_A3358CCStkLen, H00ZP2_A3353CCStkPed, H00ZP2_A3355CCStkUsu, H00ZP2_A3356CCStkHor
            }
         }
      );
      AV82Pgmname = "WCWUPQ003" ;
      /* GeneXus formulas. */
      AV82Pgmname = "WCWUPQ003" ;
      Gx_err = (short)(0) ;
      edtavSaldoinicialafecha_Enabled = 0 ;
      edtavExistenciasgrid_Enabled = 0 ;
      edtavPrdexialm_Enabled = 0 ;
      edtavExistenciasdif_Enabled = 0 ;
      edtavCompras_Enabled = 0 ;
      edtavConsumos_Enabled = 0 ;
      edtavDevoluciones_Enabled = 0 ;
      edtavCcstklin_Enabled = 0 ;
      edtavDiahora_Enabled = 0 ;
      edtavTipmovcc_Enabled = 0 ;
      edtavCcstkdsc_Enabled = 0 ;
      edtavCcstkcane_Enabled = 0 ;
      edtavCcstkcans_Enabled = 0 ;
      edtavCcstkpre_Enabled = 0 ;
      edtavExis_Enabled = 0 ;
      edtavCcstklot_Enabled = 0 ;
      edtavHdr_Enabled = 0 ;
      edtavCcstkusu_Enabled = 0 ;
      edtavCcstkbar_Enabled = 0 ;
      edtavCcstkreo_Enabled = 0 ;
      edtavCcstkpar_Enabled = 0 ;
      edtavCcstkfecgrid_Enabled = 0 ;
      edtavCcstklen_Enabled = 0 ;
      edtavCcstkped_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A3351CCStkReo ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV19CCStkReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int14[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte edtavExistenciasdif_Backstyle ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV33EntSalInv ;
   private short A3358CCStkLen ;
   private short wbEnd ;
   private short wbStart ;
   private short AV13CCStkLen ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int nRC_GXsfl_97 ;
   private int subGrid_Rows ;
   private int nGXsfl_97_idx=1 ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int edtavSaldoinicialafecha_Enabled ;
   private int edtavExistenciasgrid_Enabled ;
   private int edtavPrdexialm_Enabled ;
   private int edtavExistenciasdif_Enabled ;
   private int edtavExistenciasdif_Forecolor ;
   private int edtavExistenciasdif_Backcolor ;
   private int edtavCompras_Enabled ;
   private int edtavConsumos_Enabled ;
   private int edtavDevoluciones_Enabled ;
   private int edtavLotenuevo_Enabled ;
   private int AV6CCStkBar ;
   private int AV17CCStkPed ;
   private int subGrid_Islastpage ;
   private int edtavCcstklin_Enabled ;
   private int edtavDiahora_Enabled ;
   private int edtavTipmovcc_Enabled ;
   private int edtavCcstkdsc_Enabled ;
   private int edtavCcstkcane_Enabled ;
   private int edtavCcstkcans_Enabled ;
   private int edtavCcstkpre_Enabled ;
   private int edtavExis_Enabled ;
   private int edtavCcstklot_Enabled ;
   private int edtavHdr_Enabled ;
   private int edtavCcstkusu_Enabled ;
   private int edtavCcstkbar_Enabled ;
   private int edtavCcstkreo_Enabled ;
   private int edtavCcstkpar_Enabled ;
   private int edtavCcstkfecgrid_Enabled ;
   private int edtavCcstklen_Enabled ;
   private int edtavCcstkped_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int edtavCcstklin_Backcolor ;
   private int edtavCcstklin_Forecolor ;
   private int edtavDiahora_Backcolor ;
   private int edtavDiahora_Forecolor ;
   private int edtavTipmovcc_Backcolor ;
   private int edtavTipmovcc_Forecolor ;
   private int edtavCcstkdsc_Backcolor ;
   private int edtavCcstkdsc_Forecolor ;
   private int edtavCcstkcane_Backcolor ;
   private int edtavCcstkcane_Forecolor ;
   private int edtavCcstkcans_Backcolor ;
   private int edtavCcstkcans_Forecolor ;
   private int edtavCcstkpre_Backcolor ;
   private int edtavCcstkpre_Forecolor ;
   private int edtavExis_Backcolor ;
   private int edtavExis_Forecolor ;
   private int edtavHdr_Backcolor ;
   private int edtavHdr_Forecolor ;
   private int edtavCcstklot_Backcolor ;
   private int edtavCcstklot_Forecolor ;
   private int nGXsfl_97_fel_idx=1 ;
   private int GXv_int13[] ;
   private int edtavTipmovccin_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavEliminar_Enabled ;
   private int edtavEliminar_Visible ;
   private int edtavModificarlote_Enabled ;
   private int edtavModificarlote_Visible ;
   private int edtavCcstklin_Visible ;
   private int edtavDiahora_Visible ;
   private int edtavTipmovcc_Visible ;
   private int edtavCcstkdsc_Visible ;
   private int edtavCcstkcane_Visible ;
   private int edtavCcstkcans_Visible ;
   private int edtavCcstkpre_Visible ;
   private int edtavExis_Visible ;
   private int edtavCcstklot_Visible ;
   private int edtavHdr_Visible ;
   private int edtavCcstkusu_Visible ;
   private int edtavCcstkbar_Visible ;
   private int edtavCcstkreo_Visible ;
   private int edtavCcstkpar_Visible ;
   private int edtavCcstkfecgrid_Visible ;
   private int edtavCcstklen_Visible ;
   private int edtavCcstkped_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A3342CCStkLin ;
   private long AV14CCStkLin ;
   private long GRID_nCurrentRecord ;
   private long GXv_int12[] ;
   private java.math.BigDecimal AV34Exis ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV24Compras ;
   private java.math.BigDecimal AV26Consumos ;
   private java.math.BigDecimal AV30Devoluciones ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal AV47PrdExiAlm ;
   private java.math.BigDecimal AV54SaldoInicial ;
   private java.math.BigDecimal AV37ExistenciasGrid ;
   private java.math.BigDecimal AV36ExistenciasDif ;
   private java.math.BigDecimal AV7CCStkCanE ;
   private java.math.BigDecimal AV8CCStkCanS ;
   private java.math.BigDecimal AV18CCStkPre ;
   private java.math.BigDecimal AV35Existencias ;
   private java.math.BigDecimal AV25ComprasInv ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV27ConsumosInv ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV50RecExiRcc ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV51RecExiRea ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV52RecExiTcc ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV53Recexiteo ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String Dvelop_confirmpanel_btnmodificarnlote_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_97_idx="0001" ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A3356CCStkHor ;
   private String AV32Emprcod ;
   private String AV49Prdnum ;
   private String A3345TipMovCc ;
   private String AV77TipMovCcIN ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3352CCStkPar ;
   private String A3355CCStkUsu ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV67Usurcod ;
   private String AV68Station ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_btnmodificarnlote_Title ;
   private String Dvelop_confirmpanel_btnmodificarnlote_Confirmationtext ;
   private String Dvelop_confirmpanel_btnmodificarnlote_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnmodificarnlote_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnmodificarnlote_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnmodificarnlote_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnmodificarnlote_Confirmtype ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String edtavSaldoinicialafecha_Internalname ;
   private String edtavSaldoinicialafecha_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavExistenciasgrid_Internalname ;
   private String edtavExistenciasgrid_Jsonclick ;
   private String edtavPrdexialm_Internalname ;
   private String edtavPrdexialm_Jsonclick ;
   private String edtavExistenciasdif_Internalname ;
   private String edtavExistenciasdif_Jsonclick ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavCompras_Internalname ;
   private String edtavCompras_Jsonclick ;
   private String edtavConsumos_Internalname ;
   private String edtavConsumos_Jsonclick ;
   private String edtavDevoluciones_Internalname ;
   private String edtavDevoluciones_Jsonclick ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavLotenuevo_Internalname ;
   private String AV70Lotenuevo ;
   private String edtavLotenuevo_Jsonclick ;
   private String bttBtnmodificarnlote_Internalname ;
   private String bttBtnmodificarnlote_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavEliminar_Internalname ;
   private String edtavModificarlote_Internalname ;
   private String AV56Seleccionar ;
   private String edtavCcstklin_Internalname ;
   private String AV31DiaHora ;
   private String edtavDiahora_Internalname ;
   private String AV58TipMovCc ;
   private String edtavTipmovcc_Internalname ;
   private String AV9CCStkDsc ;
   private String edtavCcstkdsc_Internalname ;
   private String edtavCcstkcane_Internalname ;
   private String edtavCcstkcans_Internalname ;
   private String edtavCcstkpre_Internalname ;
   private String edtavExis_Internalname ;
   private String AV15CCStkLot ;
   private String edtavCcstklot_Internalname ;
   private String AV40Hdr ;
   private String edtavHdr_Internalname ;
   private String AV20CCStkUsu ;
   private String edtavCcstkusu_Internalname ;
   private String edtavCcstkbar_Internalname ;
   private String edtavCcstkreo_Internalname ;
   private String AV16CCStkPar ;
   private String edtavCcstkpar_Internalname ;
   private String edtavCcstkfecgrid_Internalname ;
   private String edtavCcstklen_Internalname ;
   private String edtavCcstkped_Internalname ;
   private String GXCCtl ;
   private String AV82Pgmname ;
   private String edtavTipmovccin_Internalname ;
   private String hsh ;
   private String GXt_char1 ;
   private String AV71EmprNom ;
   private String lV77TipMovCcIN ;
   private String scmdbuf ;
   private String AV12CCStkHor ;
   private String sGXsfl_97_fel_idx="0001" ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char15[] ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String AV48PrdNom ;
   private String tblTabledvelop_confirmpanel_btnmodificarnlote_Internalname ;
   private String Dvelop_confirmpanel_btnmodificarnlote_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavTipmovccin_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtavEliminar_gximage ;
   private String sImgUrl ;
   private String edtavEliminar_Jsonclick ;
   private String edtavModificarlote_gximage ;
   private String edtavModificarlote_Jsonclick ;
   private String ROClassString ;
   private String edtavCcstklin_Jsonclick ;
   private String edtavDiahora_Jsonclick ;
   private String edtavTipmovcc_Jsonclick ;
   private String edtavCcstkdsc_Jsonclick ;
   private String edtavCcstkcane_Jsonclick ;
   private String edtavCcstkcans_Jsonclick ;
   private String edtavCcstkpre_Jsonclick ;
   private String edtavExis_Jsonclick ;
   private String edtavCcstklot_Jsonclick ;
   private String edtavHdr_Jsonclick ;
   private String edtavCcstkusu_Jsonclick ;
   private String edtavCcstkbar_Jsonclick ;
   private String edtavCcstkreo_Jsonclick ;
   private String edtavCcstkpar_Jsonclick ;
   private String edtavCcstkfecgrid_Jsonclick ;
   private String edtavCcstklen_Jsonclick ;
   private String edtavCcstkped_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV10CCstkfec ;
   private java.util.Date AV11CCstkfec_to ;
   private java.util.Date AV66CCStkFecgrid ;
   private java.util.Date AV5Recfec ;
   private java.util.Date GXv_date5[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
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
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_97_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV64Eliminar_IsBlob ;
   private boolean AV69ModificarLote_IsBlob ;
   private String AV55SaldoInicialaFecha ;
   private String AV83Eliminar_GXI ;
   private String AV84Modificarlote_GXI ;
   private String AV65Inc_obs ;
   private String AV64Eliminar ;
   private String AV69ModificarLote ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnmodificarnlote ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private String[] H00ZP2_A396EmprCod ;
   private String[] H00ZP2_A719PrdNum ;
   private String[] H00ZP2_A3345TipMovCc ;
   private java.util.Date[] H00ZP2_A3348CCStkFec ;
   private java.math.BigDecimal[] H00ZP2_A3343CCStkCanE ;
   private java.math.BigDecimal[] H00ZP2_A3344CCStkCanS ;
   private String[] H00ZP2_A3357CCStkDsc ;
   private long[] H00ZP2_A3342CCStkLin ;
   private java.math.BigDecimal[] H00ZP2_A3349CCStkPre ;
   private String[] H00ZP2_A5722CCStkLot ;
   private int[] H00ZP2_A3350CCStkBar ;
   private byte[] H00ZP2_A3351CCStkReo ;
   private String[] H00ZP2_A3352CCStkPar ;
   private short[] H00ZP2_A3358CCStkLen ;
   private int[] H00ZP2_A3353CCStkPed ;
   private String[] H00ZP2_A3355CCStkUsu ;
   private String[] H00ZP2_A3356CCStkHor ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV43ManageFiltersData ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV28DDO_TitleSettingsIcons ;
}

final  class wcwupq003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00ZP2", "SELECT EmprCod, PrdNum, TipMovCc, CCStkFec, CCStkCanE, CCStkCanS, CCStkDsc, CCStkLin, CCStkPre, CCStkLot, CCStkBar, CCStkReo, CCStkPar, CCStkLen, CCStkPed, CCStkUsu, CCStkHor FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec >= ?) AND (TipMovCc <> 'EC') AND (TipMovCc like ? or (rtrim(?) IS NULL)) AND (CCStkFec <= ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 2);
               stmt.setString(5, (String)parms[4], 2);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
      }
   }

}

