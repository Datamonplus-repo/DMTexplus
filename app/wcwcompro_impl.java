package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwcompro_impl extends GXWebComponent
{
   public wcwcompro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcwcompro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcompro_impl.class ));
   }

   public wcwcompro_impl( int remoteHandle ,
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
               AV71EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71EmprCod", AV71EmprCod);
               AV5EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EntFecEnt", localUtil.format(AV5EntFecEnt, "99/99/99"));
               AV6EntFecEnt_to = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EntFecEnt_to", localUtil.format(AV6EntFecEnt_to, "99/99/99"));
               AV9PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9PrvNum), 6, 0));
               AV10PrvNum_to = (int)(GXutil.lval( httpContext.GetPar( "PrvNum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10PrvNum_to), 6, 0));
               AV7PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNum", AV7PrdNum);
               AV8PrdNum_to = httpContext.GetPar( "PrdNum_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNum_to", AV8PrdNum_to);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV71EmprCod,AV5EntFecEnt,AV6EntFecEnt_to,Integer.valueOf(AV9PrvNum),Integer.valueOf(AV10PrvNum_to),AV7PrdNum,AV8PrdNum_to});
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV74FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV71EmprCod = httpContext.GetPar( "EmprCod") ;
      AV5EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
      AV6EntFecEnt_to = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt_to")) ;
      AV9PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
      AV10PrvNum_to = (int)(GXutil.lval( httpContext.GetPar( "PrvNum_to"))) ;
      AV7PrdNum = httpContext.GetPar( "PrdNum") ;
      AV8PrdNum_to = httpContext.GetPar( "PrdNum_to") ;
      AV33ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV28ColumnsSelector);
      AV35TFEntPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFEntPrvNum"))) ;
      AV36TFEntPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFEntPrvNum_To"))) ;
      AV38TFEntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "TFEntFecEnt")) ;
      AV43TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV44TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV46TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV47TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV49TFPedCod = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod"))) ;
      AV50TFPedCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod_To"))) ;
      AV52TFEntUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFEntUniEnt"), ".") ;
      AV53TFEntUniEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEntUniEnt_To"), ".") ;
      AV55TFEntPre = CommonUtil.decimalVal( httpContext.GetPar( "TFEntPre"), ".") ;
      AV56TFEntPre_To = CommonUtil.decimalVal( httpContext.GetPar( "TFEntPre_To"), ".") ;
      AV58TFPedValFormula = CommonUtil.decimalVal( httpContext.GetPar( "TFPedValFormula"), ".") ;
      AV59TFPedValFormula_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPedValFormula_To"), ".") ;
      AV61TFEntLotN = httpContext.GetPar( "TFEntLotN") ;
      AV62TFEntLotN_Sel = httpContext.GetPar( "TFEntLotN_Sel") ;
      AV64TFEntRemNro = httpContext.GetPar( "TFEntRemNro") ;
      AV65TFEntRemNro_Sel = httpContext.GetPar( "TFEntRemNro_Sel") ;
      AV146Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV19OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A2501PedObsLin = (byte)(GXutil.lval( httpContext.GetPar( "PedObsLin"))) ;
      A2502PedObsTxt = httpContext.GetPar( "PedObsTxt") ;
      AV118Nprov = (short)(GXutil.lval( httpContext.GetPar( "Nprov"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV71EmprCod, AV5EntFecEnt, AV6EntFecEnt_to, AV9PrvNum, AV10PrvNum_to, AV7PrdNum, AV8PrdNum_to, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntFecEnt, AV43TFPrdNum, AV44TFPrdNum_Sel, AV46TFPrdNom, AV47TFPrdNom_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFEntUniEnt, AV53TFEntUniEnt_To, AV55TFEntPre, AV56TFEntPre_To, AV58TFPedValFormula, AV59TFPedValFormula_To, AV61TFEntLotN, AV62TFEntLotN_Sel, AV64TFEntRemNro, AV65TFEntRemNro_Sel, AV146Pgmname, AV18OrderedBy, AV19OrderedDsc, A2501PedObsLin, A2502PedObsTxt, AV118Nprov, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paY22( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe de Compras Realizadas", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcwcompro", new String[] {GXutil.URLEncode(GXutil.rtrim(AV71EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(AV5EntFecEnt)),GXutil.URLEncode(GXutil.formatDateParm(AV6EntFecEnt_to)),GXutil.URLEncode(GXutil.ltrimstr(AV9PrvNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10PrvNum_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV7PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum_to))}, new String[] {"EmprCod","EntFecEnt","EntFecEnt_to","PrvNum","PrvNum_to","PrdNum","PrdNum_to"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV146Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNPROV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV118Nprov), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV74FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV31ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV31ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV69GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV70GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV67DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV67DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV28ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV28ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71EmprCod", GXutil.rtrim( wcpOAV71EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EntFecEnt", localUtil.dtoc( wcpOAV5EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6EntFecEnt_to", localUtil.dtoc( wcpOAV6EntFecEnt_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9PrvNum", GXutil.ltrim( localUtil.ntoc( wcpOAV9PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10PrvNum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV10PrvNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7PrdNum", GXutil.rtrim( wcpOAV7PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8PrdNum_to", GXutil.rtrim( wcpOAV8PrdNum_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV33ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRVNUM", GXutil.ltrim( localUtil.ntoc( AV35TFEntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV36TFEntPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTFECENT", localUtil.dtoc( AV38TFEntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV43TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV44TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV46TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV47TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCOD", GXutil.ltrim( localUtil.ntoc( AV49TFPedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCOD_TO", GXutil.ltrim( localUtil.ntoc( AV50TFPedCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTUNIENT", GXutil.ltrim( localUtil.ntoc( AV52TFEntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTUNIENT_TO", GXutil.ltrim( localUtil.ntoc( AV53TFEntUniEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRE", GXutil.ltrim( localUtil.ntoc( AV55TFEntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTPRE_TO", GXutil.ltrim( localUtil.ntoc( AV56TFEntPre_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDVALFORMULA", GXutil.ltrim( localUtil.ntoc( AV58TFPedValFormula, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDVALFORMULA_TO", GXutil.ltrim( localUtil.ntoc( AV59TFPedValFormula_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTLOTN", GXutil.rtrim( AV61TFEntLotN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTLOTN_SEL", GXutil.rtrim( AV62TFEntLotN_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTREMNRO", GXutil.rtrim( AV64TFEntRemNro));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFENTREMNRO_SEL", GXutil.rtrim( AV65TFEntRemNro_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV146Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV146Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV18OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV19OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV71EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTFECENT", localUtil.dtoc( AV5EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTFECENT_TO", localUtil.dtoc( AV6EntFecEnt_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUM", GXutil.ltrim( localUtil.ntoc( AV9PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV10PrvNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV7PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM_TO", GXutil.rtrim( AV8PrdNum_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBARAN", GXutil.rtrim( A11Albaran));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ENTNALBAR", GXutil.rtrim( A12857EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDOBSLIN", GXutil.ltrim( localUtil.ntoc( A2501PedObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDOBSTXT", GXutil.rtrim( A2502PedObsTxt));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV16GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV16GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNPROV", GXutil.ltrim( localUtil.ntoc( AV118Nprov, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNPROV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV118Nprov), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV119ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDUNI", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDPRE", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDDTO", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormY22( )
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
      return "WCWcompro" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe de Compras Realizadas", "") ;
   }

   public void wbY20( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcwcompro");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWcompro.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWcompro.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWcompro.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWcompro.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_Y22( true) ;
      }
      else
      {
         wb_table1_25_Y22( false) ;
      }
      return  ;
   }

   public void wb_table1_25_Y22e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV69GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV70GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV67DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV67DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV28ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_entfecentauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_entfecentauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_entfecentauxdate_Internalname, localUtil.format(AV40DDO_EntFecEntAuxDate, "99/99/99"), localUtil.format( AV40DDO_EntFecEntAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,68);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_entfecentauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWcompro.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_entfecentauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCWcompro.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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

   public void startY22( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe de Compras Realizadas", ""), (short)(0)) ;
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
            strupY20( ) ;
         }
      }
   }

   public void wsY22( )
   {
      startY22( ) ;
      evtY22( ) ;
   }

   public void evtY22( )
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
                              strupY20( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupY20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11Y22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupY20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12Y22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupY20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13Y22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupY20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14Y22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupY20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15Y22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupY20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e16Y22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupY20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e17Y22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupY20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e18Y22 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupY20( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
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
                              strupY20( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           A6156EntPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtEntPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n6156EntPrvNum = false ;
                           AV21PrvNom = httpContext.cgiGet( edtavPrvnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrvnom_Internalname, AV21PrvNom);
                           A415EntFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtEntFecEnt_Internalname), 0)) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n658PedCod = false ;
                           AV22EntNAlbar = httpContext.cgiGet( edtavEntnalbar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntnalbar_Internalname, AV22EntNAlbar);
                           A418EntUniEnt = localUtil.ctond( httpContext.cgiGet( edtEntUniEnt_Internalname)) ;
                           A417EntPre = localUtil.ctond( httpContext.cgiGet( edtEntPre_Internalname)) ;
                           A13787PedValForm = localUtil.ctond( httpContext.cgiGet( edtPedValForm_Internalname)) ;
                           A5686EntLotN = httpContext.cgiGet( edtEntLotN_Internalname) ;
                           A10187EntRemNro = httpContext.cgiGet( edtEntRemNro_Internalname) ;
                           AV23Observaciones = httpContext.cgiGet( edtavObservaciones_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavObservaciones_Internalname, AV23Observaciones);
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e19Y22 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e20Y22 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e21Y22 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV74FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strupY20( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
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

   public void weY22( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormY22( ) ;
         }
      }
   }

   public void paY22( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV74FilterFullText ,
                                 String AV71EmprCod ,
                                 java.util.Date AV5EntFecEnt ,
                                 java.util.Date AV6EntFecEnt_to ,
                                 int AV9PrvNum ,
                                 int AV10PrvNum_to ,
                                 String AV7PrdNum ,
                                 String AV8PrdNum_to ,
                                 byte AV33ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelector ,
                                 int AV35TFEntPrvNum ,
                                 int AV36TFEntPrvNum_To ,
                                 java.util.Date AV38TFEntFecEnt ,
                                 String AV43TFPrdNum ,
                                 String AV44TFPrdNum_Sel ,
                                 String AV46TFPrdNom ,
                                 String AV47TFPrdNom_Sel ,
                                 int AV49TFPedCod ,
                                 int AV50TFPedCod_To ,
                                 java.math.BigDecimal AV52TFEntUniEnt ,
                                 java.math.BigDecimal AV53TFEntUniEnt_To ,
                                 java.math.BigDecimal AV55TFEntPre ,
                                 java.math.BigDecimal AV56TFEntPre_To ,
                                 java.math.BigDecimal AV58TFPedValFormula ,
                                 java.math.BigDecimal AV59TFPedValFormula_To ,
                                 String AV61TFEntLotN ,
                                 String AV62TFEntLotN_Sel ,
                                 String AV64TFEntRemNro ,
                                 String AV65TFEntRemNro_Sel ,
                                 String AV146Pgmname ,
                                 short AV18OrderedBy ,
                                 boolean AV19OrderedDsc ,
                                 byte A2501PedObsLin ,
                                 String A2502PedObsTxt ,
                                 short AV118Nprov ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20Y22 ();
      GRID_nCurrentRecord = 0 ;
      rfY22( ) ;
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
      rfY22( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV146Pgmname = "WCWcompro" ;
      Gx_err = (short)(0) ;
      edtavPrvnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavEntnalbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntnalbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntnalbar_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObservaciones_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void rfY22( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e20Y22 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV125Wcwcomprods_1_filterfulltext ,
                                              Integer.valueOf(AV126Wcwcomprods_2_tfentprvnum) ,
                                              Integer.valueOf(AV127Wcwcomprods_3_tfentprvnum_to) ,
                                              AV128Wcwcomprods_4_tfentfecent ,
                                              AV130Wcwcomprods_6_tfprdnum_sel ,
                                              AV129Wcwcomprods_5_tfprdnum ,
                                              AV132Wcwcomprods_8_tfprdnom_sel ,
                                              AV131Wcwcomprods_7_tfprdnom ,
                                              Integer.valueOf(AV133Wcwcomprods_9_tfpedcod) ,
                                              Integer.valueOf(AV134Wcwcomprods_10_tfpedcod_to) ,
                                              AV135Wcwcomprods_11_tfentunient ,
                                              AV136Wcwcomprods_12_tfentunient_to ,
                                              AV137Wcwcomprods_13_tfentpre ,
                                              AV138Wcwcomprods_14_tfentpre_to ,
                                              AV139Wcwcomprods_15_tfpedvalformula ,
                                              AV140Wcwcomprods_16_tfpedvalformula_to ,
                                              AV142Wcwcomprods_18_tfentlotn_sel ,
                                              AV141Wcwcomprods_17_tfentlotn ,
                                              AV144Wcwcomprods_20_tfentremnro_sel ,
                                              AV143Wcwcomprods_19_tfentremnro ,
                                              Integer.valueOf(A6156EntPrvNum) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              Integer.valueOf(A658PedCod) ,
                                              A418EntUniEnt ,
                                              A417EntPre ,
                                              A669PedUni ,
                                              A665PedPre ,
                                              A660PedDto ,
                                              A5686EntLotN ,
                                              A10187EntRemNro ,
                                              A415EntFecEnt ,
                                              Short.valueOf(AV18OrderedBy) ,
                                              Boolean.valueOf(AV19OrderedDsc) ,
                                              AV5EntFecEnt ,
                                              AV6EntFecEnt_to ,
                                              Integer.valueOf(AV9PrvNum) ,
                                              Integer.valueOf(AV10PrvNum_to) ,
                                              A11Albaran ,
                                              AV71EmprCod ,
                                              AV7PrdNum ,
                                              A396EmprCod ,
                                              AV8PrdNum_to } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
         lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
         lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
         lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
         lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
         lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
         lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
         lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
         lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
         lV129Wcwcomprods_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV129Wcwcomprods_5_tfprdnum), 6, "%") ;
         lV131Wcwcomprods_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV131Wcwcomprods_7_tfprdnom), 26, "%") ;
         lV141Wcwcomprods_17_tfentlotn = GXutil.padr( GXutil.rtrim( AV141Wcwcomprods_17_tfentlotn), 26, "%") ;
         lV143Wcwcomprods_19_tfentremnro = GXutil.padr( GXutil.rtrim( AV143Wcwcomprods_19_tfentremnro), 12, "%") ;
         /* Using cursor H00Y22 */
         pr_default.execute(0, new Object[] {AV71EmprCod, AV7PrdNum, AV5EntFecEnt, AV6EntFecEnt_to, Integer.valueOf(AV9PrvNum), Integer.valueOf(AV10PrvNum_to), AV8PrdNum_to, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, Integer.valueOf(AV126Wcwcomprods_2_tfentprvnum), Integer.valueOf(AV127Wcwcomprods_3_tfentprvnum_to), AV128Wcwcomprods_4_tfentfecent, lV129Wcwcomprods_5_tfprdnum, AV130Wcwcomprods_6_tfprdnum_sel, lV131Wcwcomprods_7_tfprdnom, AV132Wcwcomprods_8_tfprdnom_sel, Integer.valueOf(AV133Wcwcomprods_9_tfpedcod), Integer.valueOf(AV134Wcwcomprods_10_tfpedcod_to), AV135Wcwcomprods_11_tfentunient, AV136Wcwcomprods_12_tfentunient_to, AV137Wcwcomprods_13_tfentpre, AV138Wcwcomprods_14_tfentpre_to, AV139Wcwcomprods_15_tfpedvalformula, AV140Wcwcomprods_16_tfpedvalformula_to, lV141Wcwcomprods_17_tfentlotn, AV142Wcwcomprods_18_tfentlotn_sel, lV143Wcwcomprods_19_tfentremnro, AV144Wcwcomprods_20_tfentremnro_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A658PedCod = H00Y22_A658PedCod[0] ;
            n658PedCod = H00Y22_n658PedCod[0] ;
            A396EmprCod = H00Y22_A396EmprCod[0] ;
            A11Albaran = H00Y22_A11Albaran[0] ;
            A12857EntNAlbar = H00Y22_A12857EntNAlbar[0] ;
            A10187EntRemNro = H00Y22_A10187EntRemNro[0] ;
            A5686EntLotN = H00Y22_A5686EntLotN[0] ;
            A417EntPre = H00Y22_A417EntPre[0] ;
            A418EntUniEnt = H00Y22_A418EntUniEnt[0] ;
            A718PrdNom = H00Y22_A718PrdNom[0] ;
            A719PrdNum = H00Y22_A719PrdNum[0] ;
            A415EntFecEnt = H00Y22_A415EntFecEnt[0] ;
            A6156EntPrvNum = H00Y22_A6156EntPrvNum[0] ;
            n6156EntPrvNum = H00Y22_n6156EntPrvNum[0] ;
            A660PedDto = H00Y22_A660PedDto[0] ;
            A665PedPre = H00Y22_A665PedPre[0] ;
            A669PedUni = H00Y22_A669PedUni[0] ;
            A718PrdNom = H00Y22_A718PrdNom[0] ;
            A660PedDto = H00Y22_A660PedDto[0] ;
            A665PedPre = H00Y22_A665PedPre[0] ;
            A669PedUni = H00Y22_A669PedUni[0] ;
            A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
            e21Y22 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wbY20( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesY22( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV146Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV146Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNPROV", GXutil.ltrim( localUtil.ntoc( AV118Nprov, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNPROV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV118Nprov), "ZZZ9")));
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
      AV125Wcwcomprods_1_filterfulltext = AV74FilterFullText ;
      AV126Wcwcomprods_2_tfentprvnum = AV35TFEntPrvNum ;
      AV127Wcwcomprods_3_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV128Wcwcomprods_4_tfentfecent = AV38TFEntFecEnt ;
      AV129Wcwcomprods_5_tfprdnum = AV43TFPrdNum ;
      AV130Wcwcomprods_6_tfprdnum_sel = AV44TFPrdNum_Sel ;
      AV131Wcwcomprods_7_tfprdnom = AV46TFPrdNom ;
      AV132Wcwcomprods_8_tfprdnom_sel = AV47TFPrdNom_Sel ;
      AV133Wcwcomprods_9_tfpedcod = AV49TFPedCod ;
      AV134Wcwcomprods_10_tfpedcod_to = AV50TFPedCod_To ;
      AV135Wcwcomprods_11_tfentunient = AV52TFEntUniEnt ;
      AV136Wcwcomprods_12_tfentunient_to = AV53TFEntUniEnt_To ;
      AV137Wcwcomprods_13_tfentpre = AV55TFEntPre ;
      AV138Wcwcomprods_14_tfentpre_to = AV56TFEntPre_To ;
      AV139Wcwcomprods_15_tfpedvalformula = AV58TFPedValFormula ;
      AV140Wcwcomprods_16_tfpedvalformula_to = AV59TFPedValFormula_To ;
      AV141Wcwcomprods_17_tfentlotn = AV61TFEntLotN ;
      AV142Wcwcomprods_18_tfentlotn_sel = AV62TFEntLotN_Sel ;
      AV143Wcwcomprods_19_tfentremnro = AV64TFEntRemNro ;
      AV144Wcwcomprods_20_tfentremnro_sel = AV65TFEntRemNro_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV125Wcwcomprods_1_filterfulltext ,
                                           Integer.valueOf(AV126Wcwcomprods_2_tfentprvnum) ,
                                           Integer.valueOf(AV127Wcwcomprods_3_tfentprvnum_to) ,
                                           AV128Wcwcomprods_4_tfentfecent ,
                                           AV130Wcwcomprods_6_tfprdnum_sel ,
                                           AV129Wcwcomprods_5_tfprdnum ,
                                           AV132Wcwcomprods_8_tfprdnom_sel ,
                                           AV131Wcwcomprods_7_tfprdnom ,
                                           Integer.valueOf(AV133Wcwcomprods_9_tfpedcod) ,
                                           Integer.valueOf(AV134Wcwcomprods_10_tfpedcod_to) ,
                                           AV135Wcwcomprods_11_tfentunient ,
                                           AV136Wcwcomprods_12_tfentunient_to ,
                                           AV137Wcwcomprods_13_tfentpre ,
                                           AV138Wcwcomprods_14_tfentpre_to ,
                                           AV139Wcwcomprods_15_tfpedvalformula ,
                                           AV140Wcwcomprods_16_tfpedvalformula_to ,
                                           AV142Wcwcomprods_18_tfentlotn_sel ,
                                           AV141Wcwcomprods_17_tfentlotn ,
                                           AV144Wcwcomprods_20_tfentremnro_sel ,
                                           AV143Wcwcomprods_19_tfentremnro ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A669PedUni ,
                                           A665PedPre ,
                                           A660PedDto ,
                                           A5686EntLotN ,
                                           A10187EntRemNro ,
                                           A415EntFecEnt ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV5EntFecEnt ,
                                           AV6EntFecEnt_to ,
                                           Integer.valueOf(AV9PrvNum) ,
                                           Integer.valueOf(AV10PrvNum_to) ,
                                           A11Albaran ,
                                           AV71EmprCod ,
                                           AV7PrdNum ,
                                           A396EmprCod ,
                                           AV8PrdNum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
      lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
      lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
      lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
      lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
      lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
      lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
      lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
      lV125Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV125Wcwcomprods_1_filterfulltext), "%", "") ;
      lV129Wcwcomprods_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV129Wcwcomprods_5_tfprdnum), 6, "%") ;
      lV131Wcwcomprods_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV131Wcwcomprods_7_tfprdnom), 26, "%") ;
      lV141Wcwcomprods_17_tfentlotn = GXutil.padr( GXutil.rtrim( AV141Wcwcomprods_17_tfentlotn), 26, "%") ;
      lV143Wcwcomprods_19_tfentremnro = GXutil.padr( GXutil.rtrim( AV143Wcwcomprods_19_tfentremnro), 12, "%") ;
      /* Using cursor H00Y23 */
      pr_default.execute(1, new Object[] {AV71EmprCod, AV7PrdNum, AV5EntFecEnt, AV6EntFecEnt_to, Integer.valueOf(AV9PrvNum), Integer.valueOf(AV10PrvNum_to), AV8PrdNum_to, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, lV125Wcwcomprods_1_filterfulltext, Integer.valueOf(AV126Wcwcomprods_2_tfentprvnum), Integer.valueOf(AV127Wcwcomprods_3_tfentprvnum_to), AV128Wcwcomprods_4_tfentfecent, lV129Wcwcomprods_5_tfprdnum, AV130Wcwcomprods_6_tfprdnum_sel, lV131Wcwcomprods_7_tfprdnom, AV132Wcwcomprods_8_tfprdnom_sel, Integer.valueOf(AV133Wcwcomprods_9_tfpedcod), Integer.valueOf(AV134Wcwcomprods_10_tfpedcod_to), AV135Wcwcomprods_11_tfentunient, AV136Wcwcomprods_12_tfentunient_to, AV137Wcwcomprods_13_tfentpre, AV138Wcwcomprods_14_tfentpre_to, AV139Wcwcomprods_15_tfpedvalformula, AV140Wcwcomprods_16_tfpedvalformula_to, lV141Wcwcomprods_17_tfentlotn, AV142Wcwcomprods_18_tfentlotn_sel, lV143Wcwcomprods_19_tfentremnro, AV144Wcwcomprods_20_tfentremnro_sel});
      GRID_nRecordCount = H00Y23_AGRID_nRecordCount[0] ;
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
      AV125Wcwcomprods_1_filterfulltext = AV74FilterFullText ;
      AV126Wcwcomprods_2_tfentprvnum = AV35TFEntPrvNum ;
      AV127Wcwcomprods_3_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV128Wcwcomprods_4_tfentfecent = AV38TFEntFecEnt ;
      AV129Wcwcomprods_5_tfprdnum = AV43TFPrdNum ;
      AV130Wcwcomprods_6_tfprdnum_sel = AV44TFPrdNum_Sel ;
      AV131Wcwcomprods_7_tfprdnom = AV46TFPrdNom ;
      AV132Wcwcomprods_8_tfprdnom_sel = AV47TFPrdNom_Sel ;
      AV133Wcwcomprods_9_tfpedcod = AV49TFPedCod ;
      AV134Wcwcomprods_10_tfpedcod_to = AV50TFPedCod_To ;
      AV135Wcwcomprods_11_tfentunient = AV52TFEntUniEnt ;
      AV136Wcwcomprods_12_tfentunient_to = AV53TFEntUniEnt_To ;
      AV137Wcwcomprods_13_tfentpre = AV55TFEntPre ;
      AV138Wcwcomprods_14_tfentpre_to = AV56TFEntPre_To ;
      AV139Wcwcomprods_15_tfpedvalformula = AV58TFPedValFormula ;
      AV140Wcwcomprods_16_tfpedvalformula_to = AV59TFPedValFormula_To ;
      AV141Wcwcomprods_17_tfentlotn = AV61TFEntLotN ;
      AV142Wcwcomprods_18_tfentlotn_sel = AV62TFEntLotN_Sel ;
      AV143Wcwcomprods_19_tfentremnro = AV64TFEntRemNro ;
      AV144Wcwcomprods_20_tfentremnro_sel = AV65TFEntRemNro_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV71EmprCod, AV5EntFecEnt, AV6EntFecEnt_to, AV9PrvNum, AV10PrvNum_to, AV7PrdNum, AV8PrdNum_to, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntFecEnt, AV43TFPrdNum, AV44TFPrdNum_Sel, AV46TFPrdNom, AV47TFPrdNom_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFEntUniEnt, AV53TFEntUniEnt_To, AV55TFEntPre, AV56TFEntPre_To, AV58TFPedValFormula, AV59TFPedValFormula_To, AV61TFEntLotN, AV62TFEntLotN_Sel, AV64TFEntRemNro, AV65TFEntRemNro_Sel, AV146Pgmname, AV18OrderedBy, AV19OrderedDsc, A2501PedObsLin, A2502PedObsTxt, AV118Nprov, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV125Wcwcomprods_1_filterfulltext = AV74FilterFullText ;
      AV126Wcwcomprods_2_tfentprvnum = AV35TFEntPrvNum ;
      AV127Wcwcomprods_3_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV128Wcwcomprods_4_tfentfecent = AV38TFEntFecEnt ;
      AV129Wcwcomprods_5_tfprdnum = AV43TFPrdNum ;
      AV130Wcwcomprods_6_tfprdnum_sel = AV44TFPrdNum_Sel ;
      AV131Wcwcomprods_7_tfprdnom = AV46TFPrdNom ;
      AV132Wcwcomprods_8_tfprdnom_sel = AV47TFPrdNom_Sel ;
      AV133Wcwcomprods_9_tfpedcod = AV49TFPedCod ;
      AV134Wcwcomprods_10_tfpedcod_to = AV50TFPedCod_To ;
      AV135Wcwcomprods_11_tfentunient = AV52TFEntUniEnt ;
      AV136Wcwcomprods_12_tfentunient_to = AV53TFEntUniEnt_To ;
      AV137Wcwcomprods_13_tfentpre = AV55TFEntPre ;
      AV138Wcwcomprods_14_tfentpre_to = AV56TFEntPre_To ;
      AV139Wcwcomprods_15_tfpedvalformula = AV58TFPedValFormula ;
      AV140Wcwcomprods_16_tfpedvalformula_to = AV59TFPedValFormula_To ;
      AV141Wcwcomprods_17_tfentlotn = AV61TFEntLotN ;
      AV142Wcwcomprods_18_tfentlotn_sel = AV62TFEntLotN_Sel ;
      AV143Wcwcomprods_19_tfentremnro = AV64TFEntRemNro ;
      AV144Wcwcomprods_20_tfentremnro_sel = AV65TFEntRemNro_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV71EmprCod, AV5EntFecEnt, AV6EntFecEnt_to, AV9PrvNum, AV10PrvNum_to, AV7PrdNum, AV8PrdNum_to, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntFecEnt, AV43TFPrdNum, AV44TFPrdNum_Sel, AV46TFPrdNom, AV47TFPrdNom_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFEntUniEnt, AV53TFEntUniEnt_To, AV55TFEntPre, AV56TFEntPre_To, AV58TFPedValFormula, AV59TFPedValFormula_To, AV61TFEntLotN, AV62TFEntLotN_Sel, AV64TFEntRemNro, AV65TFEntRemNro_Sel, AV146Pgmname, AV18OrderedBy, AV19OrderedDsc, A2501PedObsLin, A2502PedObsTxt, AV118Nprov, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV125Wcwcomprods_1_filterfulltext = AV74FilterFullText ;
      AV126Wcwcomprods_2_tfentprvnum = AV35TFEntPrvNum ;
      AV127Wcwcomprods_3_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV128Wcwcomprods_4_tfentfecent = AV38TFEntFecEnt ;
      AV129Wcwcomprods_5_tfprdnum = AV43TFPrdNum ;
      AV130Wcwcomprods_6_tfprdnum_sel = AV44TFPrdNum_Sel ;
      AV131Wcwcomprods_7_tfprdnom = AV46TFPrdNom ;
      AV132Wcwcomprods_8_tfprdnom_sel = AV47TFPrdNom_Sel ;
      AV133Wcwcomprods_9_tfpedcod = AV49TFPedCod ;
      AV134Wcwcomprods_10_tfpedcod_to = AV50TFPedCod_To ;
      AV135Wcwcomprods_11_tfentunient = AV52TFEntUniEnt ;
      AV136Wcwcomprods_12_tfentunient_to = AV53TFEntUniEnt_To ;
      AV137Wcwcomprods_13_tfentpre = AV55TFEntPre ;
      AV138Wcwcomprods_14_tfentpre_to = AV56TFEntPre_To ;
      AV139Wcwcomprods_15_tfpedvalformula = AV58TFPedValFormula ;
      AV140Wcwcomprods_16_tfpedvalformula_to = AV59TFPedValFormula_To ;
      AV141Wcwcomprods_17_tfentlotn = AV61TFEntLotN ;
      AV142Wcwcomprods_18_tfentlotn_sel = AV62TFEntLotN_Sel ;
      AV143Wcwcomprods_19_tfentremnro = AV64TFEntRemNro ;
      AV144Wcwcomprods_20_tfentremnro_sel = AV65TFEntRemNro_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV71EmprCod, AV5EntFecEnt, AV6EntFecEnt_to, AV9PrvNum, AV10PrvNum_to, AV7PrdNum, AV8PrdNum_to, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntFecEnt, AV43TFPrdNum, AV44TFPrdNum_Sel, AV46TFPrdNom, AV47TFPrdNom_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFEntUniEnt, AV53TFEntUniEnt_To, AV55TFEntPre, AV56TFEntPre_To, AV58TFPedValFormula, AV59TFPedValFormula_To, AV61TFEntLotN, AV62TFEntLotN_Sel, AV64TFEntRemNro, AV65TFEntRemNro_Sel, AV146Pgmname, AV18OrderedBy, AV19OrderedDsc, A2501PedObsLin, A2502PedObsTxt, AV118Nprov, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV125Wcwcomprods_1_filterfulltext = AV74FilterFullText ;
      AV126Wcwcomprods_2_tfentprvnum = AV35TFEntPrvNum ;
      AV127Wcwcomprods_3_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV128Wcwcomprods_4_tfentfecent = AV38TFEntFecEnt ;
      AV129Wcwcomprods_5_tfprdnum = AV43TFPrdNum ;
      AV130Wcwcomprods_6_tfprdnum_sel = AV44TFPrdNum_Sel ;
      AV131Wcwcomprods_7_tfprdnom = AV46TFPrdNom ;
      AV132Wcwcomprods_8_tfprdnom_sel = AV47TFPrdNom_Sel ;
      AV133Wcwcomprods_9_tfpedcod = AV49TFPedCod ;
      AV134Wcwcomprods_10_tfpedcod_to = AV50TFPedCod_To ;
      AV135Wcwcomprods_11_tfentunient = AV52TFEntUniEnt ;
      AV136Wcwcomprods_12_tfentunient_to = AV53TFEntUniEnt_To ;
      AV137Wcwcomprods_13_tfentpre = AV55TFEntPre ;
      AV138Wcwcomprods_14_tfentpre_to = AV56TFEntPre_To ;
      AV139Wcwcomprods_15_tfpedvalformula = AV58TFPedValFormula ;
      AV140Wcwcomprods_16_tfpedvalformula_to = AV59TFPedValFormula_To ;
      AV141Wcwcomprods_17_tfentlotn = AV61TFEntLotN ;
      AV142Wcwcomprods_18_tfentlotn_sel = AV62TFEntLotN_Sel ;
      AV143Wcwcomprods_19_tfentremnro = AV64TFEntRemNro ;
      AV144Wcwcomprods_20_tfentremnro_sel = AV65TFEntRemNro_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV71EmprCod, AV5EntFecEnt, AV6EntFecEnt_to, AV9PrvNum, AV10PrvNum_to, AV7PrdNum, AV8PrdNum_to, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntFecEnt, AV43TFPrdNum, AV44TFPrdNum_Sel, AV46TFPrdNom, AV47TFPrdNom_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFEntUniEnt, AV53TFEntUniEnt_To, AV55TFEntPre, AV56TFEntPre_To, AV58TFPedValFormula, AV59TFPedValFormula_To, AV61TFEntLotN, AV62TFEntLotN_Sel, AV64TFEntRemNro, AV65TFEntRemNro_Sel, AV146Pgmname, AV18OrderedBy, AV19OrderedDsc, A2501PedObsLin, A2502PedObsTxt, AV118Nprov, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV125Wcwcomprods_1_filterfulltext = AV74FilterFullText ;
      AV126Wcwcomprods_2_tfentprvnum = AV35TFEntPrvNum ;
      AV127Wcwcomprods_3_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV128Wcwcomprods_4_tfentfecent = AV38TFEntFecEnt ;
      AV129Wcwcomprods_5_tfprdnum = AV43TFPrdNum ;
      AV130Wcwcomprods_6_tfprdnum_sel = AV44TFPrdNum_Sel ;
      AV131Wcwcomprods_7_tfprdnom = AV46TFPrdNom ;
      AV132Wcwcomprods_8_tfprdnom_sel = AV47TFPrdNom_Sel ;
      AV133Wcwcomprods_9_tfpedcod = AV49TFPedCod ;
      AV134Wcwcomprods_10_tfpedcod_to = AV50TFPedCod_To ;
      AV135Wcwcomprods_11_tfentunient = AV52TFEntUniEnt ;
      AV136Wcwcomprods_12_tfentunient_to = AV53TFEntUniEnt_To ;
      AV137Wcwcomprods_13_tfentpre = AV55TFEntPre ;
      AV138Wcwcomprods_14_tfentpre_to = AV56TFEntPre_To ;
      AV139Wcwcomprods_15_tfpedvalformula = AV58TFPedValFormula ;
      AV140Wcwcomprods_16_tfpedvalformula_to = AV59TFPedValFormula_To ;
      AV141Wcwcomprods_17_tfentlotn = AV61TFEntLotN ;
      AV142Wcwcomprods_18_tfentlotn_sel = AV62TFEntLotN_Sel ;
      AV143Wcwcomprods_19_tfentremnro = AV64TFEntRemNro ;
      AV144Wcwcomprods_20_tfentremnro_sel = AV65TFEntRemNro_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV74FilterFullText, AV71EmprCod, AV5EntFecEnt, AV6EntFecEnt_to, AV9PrvNum, AV10PrvNum_to, AV7PrdNum, AV8PrdNum_to, AV33ManageFiltersExecutionStep, AV28ColumnsSelector, AV35TFEntPrvNum, AV36TFEntPrvNum_To, AV38TFEntFecEnt, AV43TFPrdNum, AV44TFPrdNum_Sel, AV46TFPrdNom, AV47TFPrdNom_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFEntUniEnt, AV53TFEntUniEnt_To, AV55TFEntPre, AV56TFEntPre_To, AV58TFPedValFormula, AV59TFPedValFormula_To, AV61TFEntLotN, AV62TFEntLotN_Sel, AV64TFEntRemNro, AV65TFEntRemNro_Sel, AV146Pgmname, AV18OrderedBy, AV19OrderedDsc, A2501PedObsLin, A2502PedObsTxt, AV118Nprov, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV146Pgmname = "WCWcompro" ;
      Gx_err = (short)(0) ;
      edtavPrvnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavEntnalbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntnalbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntnalbar_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObservaciones_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupY20( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19Y22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV31ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV67DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV28ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV69GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV70GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV71EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV71EmprCod") ;
         wcpOAV5EntFecEnt = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV5EntFecEnt"), 0) ;
         wcpOAV6EntFecEnt_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6EntFecEnt_to"), 0) ;
         wcpOAV9PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10PrvNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10PrvNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7PrdNum = httpContext.cgiGet( sPrefix+"wcpOAV7PrdNum") ;
         wcpOAV8PrdNum_to = httpContext.cgiGet( sPrefix+"wcpOAV8PrdNum_to") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV74FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74FilterFullText", AV74FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_entfecentauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ENTFECENTAUXDATE");
            GX_FocusControl = edtavDdo_entfecentauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40DDO_EntFecEntAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_EntFecEntAuxDate", localUtil.format(AV40DDO_EntFecEntAuxDate, "99/99/99"));
         }
         else
         {
            AV40DDO_EntFecEntAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_entfecentauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40DDO_EntFecEntAuxDate", localUtil.format(AV40DDO_EntFecEntAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV74FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e19Y22 ();
      if (returnInSub) return;
   }

   public void e19Y22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV118Nprov) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV71EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int2) ;
      wcwcompro_impl.this.GXt_int1 = GXv_int2[0] ;
      AV118Nprov = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118Nprov", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118Nprov), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNPROV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV118Nprov), "ZZZ9")));
      GXt_char3 = AV122Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wcwcompro_impl.this.GXt_char3 = GXv_char4[0] ;
      AV122Station = GXt_char3 ;
      GXv_char4[0] = AV71EmprCod ;
      GXv_char5[0] = AV123Emprnom ;
      GXv_char6[0] = AV124Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV122Station, GXv_char4, GXv_char5, GXv_char6) ;
      wcwcompro_impl.this.AV71EmprCod = GXv_char4[0] ;
      wcwcompro_impl.this.AV123Emprnom = GXv_char5[0] ;
      wcwcompro_impl.this.AV124Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71EmprCod", AV71EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV18OrderedBy < 1 )
      {
         AV18OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV67DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV67DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20Y22( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV12WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV33ManageFiltersExecutionStep == 1 )
      {
         AV33ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ManageFiltersExecutionStep", GXutil.str( AV33ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV33ManageFiltersExecutionStep == 2 )
      {
         AV33ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ManageFiltersExecutionStep", GXutil.str( AV33ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV30Session.getValue("WCWcomproColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV30Session.getValue("WCWcomproColumnsSelector") ;
         AV28ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtEntPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPrvNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavPrvnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtEntFecEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntFecEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntFecEnt_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPedCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavEntnalbar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntnalbar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntnalbar_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtEntUniEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntUniEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntUniEnt_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtEntPre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntPre_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtPedValForm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPedValForm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedValForm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtEntLotN_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntLotN_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntLotN_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtEntRemNro_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEntRemNro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEntRemNro_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavObservaciones_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV28ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavObservaciones_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObservaciones_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV69GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69GridCurrentPage), 10, 0));
      AV70GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70GridPageCount), 10, 0));
      AV125Wcwcomprods_1_filterfulltext = AV74FilterFullText ;
      AV126Wcwcomprods_2_tfentprvnum = AV35TFEntPrvNum ;
      AV127Wcwcomprods_3_tfentprvnum_to = AV36TFEntPrvNum_To ;
      AV128Wcwcomprods_4_tfentfecent = AV38TFEntFecEnt ;
      AV129Wcwcomprods_5_tfprdnum = AV43TFPrdNum ;
      AV130Wcwcomprods_6_tfprdnum_sel = AV44TFPrdNum_Sel ;
      AV131Wcwcomprods_7_tfprdnom = AV46TFPrdNom ;
      AV132Wcwcomprods_8_tfprdnom_sel = AV47TFPrdNom_Sel ;
      AV133Wcwcomprods_9_tfpedcod = AV49TFPedCod ;
      AV134Wcwcomprods_10_tfpedcod_to = AV50TFPedCod_To ;
      AV135Wcwcomprods_11_tfentunient = AV52TFEntUniEnt ;
      AV136Wcwcomprods_12_tfentunient_to = AV53TFEntUniEnt_To ;
      AV137Wcwcomprods_13_tfentpre = AV55TFEntPre ;
      AV138Wcwcomprods_14_tfentpre_to = AV56TFEntPre_To ;
      AV139Wcwcomprods_15_tfpedvalformula = AV58TFPedValFormula ;
      AV140Wcwcomprods_16_tfpedvalformula_to = AV59TFPedValFormula_To ;
      AV141Wcwcomprods_17_tfentlotn = AV61TFEntLotN ;
      AV142Wcwcomprods_18_tfentlotn_sel = AV62TFEntLotN_Sel ;
      AV143Wcwcomprods_19_tfentremnro = AV64TFEntRemNro ;
      AV144Wcwcomprods_20_tfentremnro_sel = AV65TFEntRemNro_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ColumnsSelector", AV28ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV31ManageFiltersData", AV31ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e12Y22( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV68PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV68PageToGo) ;
      }
   }

   public void e13Y22( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14Y22( )
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
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntPrvNum") == 0 )
         {
            AV35TFEntPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFEntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFEntPrvNum), 6, 0));
            AV36TFEntPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFEntPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFEntPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntFecEnt") == 0 )
         {
            AV38TFEntFecEnt = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFEntFecEnt", localUtil.format(AV38TFEntFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV43TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdNum", AV43TFPrdNum);
            AV44TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdNum_Sel", AV44TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV46TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdNom", AV46TFPrdNom);
            AV47TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdNom_Sel", AV47TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedCod") == 0 )
         {
            AV49TFPedCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFPedCod), 8, 0));
            AV50TFPedCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFPedCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntUniEnt") == 0 )
         {
            AV52TFEntUniEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFEntUniEnt", GXutil.ltrimstr( AV52TFEntUniEnt, 9, 2));
            AV53TFEntUniEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFEntUniEnt_To", GXutil.ltrimstr( AV53TFEntUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntPre") == 0 )
         {
            AV55TFEntPre = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFEntPre", GXutil.ltrimstr( AV55TFEntPre, 14, 5));
            AV56TFEntPre_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFEntPre_To", GXutil.ltrimstr( AV56TFEntPre_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedValFormula") == 0 )
         {
            AV58TFPedValFormula = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFPedValFormula", GXutil.ltrimstr( AV58TFPedValFormula, 12, 2));
            AV59TFPedValFormula_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPedValFormula_To", GXutil.ltrimstr( AV59TFPedValFormula_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntLotN") == 0 )
         {
            AV61TFEntLotN = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFEntLotN", AV61TFEntLotN);
            AV62TFEntLotN_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFEntLotN_Sel", AV62TFEntLotN_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EntRemNro") == 0 )
         {
            AV64TFEntRemNro = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFEntRemNro", AV64TFEntRemNro);
            AV65TFEntRemNro_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFEntRemNro_Sel", AV65TFEntRemNro_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21Y22( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_char3 = AV21PrvNom ;
      GXv_char6[0] = A396EmprCod ;
      GXv_int10[0] = A6156EntPrvNum ;
      GXv_char5[0] = GXt_char3 ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_char5) ;
      wcwcompro_impl.this.A396EmprCod = GXv_char6[0] ;
      wcwcompro_impl.this.A6156EntPrvNum = GXv_int10[0] ;
      wcwcompro_impl.this.GXt_char3 = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      AV21PrvNom = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrvnom_Internalname, AV21PrvNom);
      AV22EntNAlbar = ((GXutil.strcmp("", A12857EntNAlbar)==0) ? A11Albaran : A12857EntNAlbar) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntnalbar_Internalname, AV22EntNAlbar);
      AV23Observaciones = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavObservaciones_Internalname, AV23Observaciones);
      /* Using cursor H00Y24 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2502PedObsTxt = H00Y24_A2502PedObsTxt[0] ;
         A2501PedObsLin = H00Y24_A2501PedObsLin[0] ;
         if ( GXutil.strcmp(AV23Observaciones, "") == 0 )
         {
            AV23Observaciones = A2502PedObsTxt + GXutil.newLine( ) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavObservaciones_Internalname, AV23Observaciones);
         }
         else
         {
            AV23Observaciones += A2502PedObsTxt + GXutil.newLine( ) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavObservaciones_Internalname, AV23Observaciones);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(43) ;
      }
      sendrow_432( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e15Y22( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV26ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV28ColumnsSelector.fromJSonString(AV26ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCWcomproColumnsSelector", ((GXutil.strcmp("", AV26ColumnsSelectorXML)==0) ? "" : AV28ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ColumnsSelector", AV28ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV31ManageFiltersData", AV31ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e11Y22( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCWcomproFilters")),GXutil.URLEncode(GXutil.rtrim(AV146Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV33ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ManageFiltersExecutionStep", GXutil.str( AV33ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCWcomproFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV33ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33ManageFiltersExecutionStep", GXutil.str( AV33ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char3 = AV32ManageFiltersXml ;
         GXv_char6[0] = GXt_char3 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCWcomproFilters", Ddo_managefilters_Activeeventkey, GXv_char6) ;
         wcwcompro_impl.this.GXt_char3 = GXv_char6[0] ;
         AV32ManageFiltersXml = GXt_char3 ;
         if ( (GXutil.strcmp("", AV32ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV146Pgmname+"GridState", AV32ManageFiltersXml) ;
            AV16GridState.fromxml(AV32ManageFiltersXml, null, null);
            AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
            AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ColumnsSelector", AV28ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV31ManageFiltersData", AV31ManageFiltersData);
   }

   public void e16Y22( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV24ExcelFilename ;
      GXv_char5[0] = AV25ErrorMessage ;
      new app.wcwcomproexport(remoteHandle, context).execute( GXv_char6, GXv_char5) ;
      wcwcompro_impl.this.AV24ExcelFilename = GXv_char6[0] ;
      wcwcompro_impl.this.AV25ErrorMessage = GXv_char5[0] ;
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

   public void e18Y22( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      if ( AV118Nprov == 0 )
      {
         httpContext.popup(formatLink("app.rforcom", new String[] {GXutil.URLEncode(GXutil.rtrim(AV71EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV119ImpCod)),GXutil.URLEncode(GXutil.rtrim(AV7PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum_to)),GXutil.URLEncode(GXutil.ltrimstr(AV9PrvNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10PrvNum_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV5EntFecEnt)),GXutil.URLEncode(GXutil.formatDateParm(AV6EntFecEnt_to)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "zzzzzzzz", "")))}, new String[] {"EmprCod","ImpCod","Pprod","Uprod","Pprov","Uprov","Pfecha","Ufecha","PGuia","UGuia"}) , new Object[] {"AV71EmprCod","AV119ImpCod","AV7PrdNum","AV8PrdNum_to","AV9PrvNum","AV10PrvNum_to","AV5EntFecEnt","AV6EntFecEnt_to","",""});
      }
      else
      {
         httpContext.popup(formatLink("app.rforcomn", new String[] {GXutil.URLEncode(GXutil.rtrim(AV71EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV119ImpCod)),GXutil.URLEncode(GXutil.rtrim(AV7PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV8PrdNum_to)),GXutil.URLEncode(GXutil.ltrimstr(AV9PrvNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10PrvNum_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV5EntFecEnt)),GXutil.URLEncode(GXutil.formatDateParm(AV6EntFecEnt_to)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "zzzzzzzz", "")))}, new String[] {"EmprCod","ImpCod","Pprod","Uprod","Pprov","Uprov","Pfecha","Ufecha","PGuia","UGuia"}) , new Object[] {"AV71EmprCod","AV119ImpCod","AV7PrdNum","AV8PrdNum_to","AV9PrvNum","AV10PrvNum_to","AV5EntFecEnt","AV6EntFecEnt_to","",""});
      }
      if ( 1 == 0 )
      {
         Innewwindow1_Target = formatLink("app.wcwcomproexportreport", new String[] {}, new String[] {})  ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
         Innewwindow1_Height = "600" ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
         Innewwindow1_Width = "800" ;
         ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
         this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e17Y22( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcwcomproexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV18OrderedBy, 4, 0))+":"+(AV19OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV28ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntPrvNum", "", "Proveedor", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&PrvNom", "", "Nombre", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntFecEnt", "", "Fecha", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "PrdNum", "", "Producto", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "PrdNom", "", "Descripcion", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "PedCod", "", "N Pedido", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&EntNAlbar", "", "N Doc", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntUniEnt", "", "Cantidad", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntPre", "", "Precio", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "PedValFormula", "", "Valor", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntLotN", "", "Lote", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EntRemNro", "", "N Doc Int", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV28ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&Observaciones", "", "Observaciones", true, "") ;
      AV28ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXt_char3 = AV27UserCustomValue ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWcomproColumnsSelector", GXv_char6) ;
      wcwcompro_impl.this.GXt_char3 = GXv_char6[0] ;
      AV27UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV29ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector11[0] = AV29ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector12[0] = AV28ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, GXv_SdtWWPColumnsSelector12) ;
         AV29ColumnsSelectorAux = GXv_SdtWWPColumnsSelector11[0] ;
         AV28ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = AV31ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCWcomproFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[0] ;
      AV31ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV74FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74FilterFullText", AV74FilterFullText);
      AV35TFEntPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFEntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFEntPrvNum), 6, 0));
      AV36TFEntPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFEntPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFEntPrvNum_To), 6, 0));
      AV38TFEntFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFEntFecEnt", localUtil.format(AV38TFEntFecEnt, "99/99/99"));
      AV43TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdNum", AV43TFPrdNum);
      AV44TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdNum_Sel", AV44TFPrdNum_Sel);
      AV46TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdNom", AV46TFPrdNom);
      AV47TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdNom_Sel", AV47TFPrdNom_Sel);
      AV49TFPedCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFPedCod), 8, 0));
      AV50TFPedCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFPedCod_To), 8, 0));
      AV52TFEntUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFEntUniEnt", GXutil.ltrimstr( AV52TFEntUniEnt, 9, 2));
      AV53TFEntUniEnt_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFEntUniEnt_To", GXutil.ltrimstr( AV53TFEntUniEnt_To, 9, 2));
      AV55TFEntPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFEntPre", GXutil.ltrimstr( AV55TFEntPre, 14, 5));
      AV56TFEntPre_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFEntPre_To", GXutil.ltrimstr( AV56TFEntPre_To, 14, 5));
      AV58TFPedValFormula = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFPedValFormula", GXutil.ltrimstr( AV58TFPedValFormula, 12, 2));
      AV59TFPedValFormula_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPedValFormula_To", GXutil.ltrimstr( AV59TFPedValFormula_To, 12, 2));
      AV61TFEntLotN = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFEntLotN", AV61TFEntLotN);
      AV62TFEntLotN_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFEntLotN_Sel", AV62TFEntLotN_Sel);
      AV64TFEntRemNro = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFEntRemNro", AV64TFEntRemNro);
      AV65TFEntRemNro_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFEntRemNro_Sel", AV65TFEntRemNro_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV30Session.getValue(AV146Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV146Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV30Session.getValue(AV146Pgmname+"GridState"), null, null);
      }
      AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
      AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV16GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV16GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV16GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV147GXV1 = 1 ;
      while ( AV147GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV147GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV74FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74FilterFullText", AV74FilterFullText);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRVNUM") == 0 )
         {
            AV35TFEntPrvNum = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFEntPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFEntPrvNum), 6, 0));
            AV36TFEntPrvNum_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFEntPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFEntPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV38TFEntFecEnt = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFEntFecEnt", localUtil.format(AV38TFEntFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV43TFPrdNum = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFPrdNum", AV43TFPrdNum);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV44TFPrdNum_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFPrdNum_Sel", AV44TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV46TFPrdNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdNom", AV46TFPrdNom);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV47TFPrdNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdNom_Sel", AV47TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV49TFPedCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFPedCod), 8, 0));
            AV50TFPedCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFPedCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV52TFEntUniEnt = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFEntUniEnt", GXutil.ltrimstr( AV52TFEntUniEnt, 9, 2));
            AV53TFEntUniEnt_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFEntUniEnt_To", GXutil.ltrimstr( AV53TFEntUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRE") == 0 )
         {
            AV55TFEntPre = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFEntPre", GXutil.ltrimstr( AV55TFEntPre, 14, 5));
            AV56TFEntPre_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFEntPre_To", GXutil.ltrimstr( AV56TFEntPre_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDVALFORMULA") == 0 )
         {
            AV58TFPedValFormula = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFPedValFormula", GXutil.ltrimstr( AV58TFPedValFormula, 12, 2));
            AV59TFPedValFormula_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPedValFormula_To", GXutil.ltrimstr( AV59TFPedValFormula_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN") == 0 )
         {
            AV61TFEntLotN = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFEntLotN", AV61TFEntLotN);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN_SEL") == 0 )
         {
            AV62TFEntLotN_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFEntLotN_Sel", AV62TFEntLotN_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTREMNRO") == 0 )
         {
            AV64TFEntRemNro = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFEntRemNro", AV64TFEntRemNro);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTREMNRO_SEL") == 0 )
         {
            AV65TFEntRemNro_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFEntRemNro_Sel", AV65TFEntRemNro_Sel);
         }
         AV147GXV1 = (int)(AV147GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFPrdNum_Sel)==0), AV44TFPrdNum_Sel, GXv_char6) ;
      wcwcompro_impl.this.GXt_char3 = GXv_char6[0] ;
      GXt_char15 = "" ;
      GXv_char5[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFPrdNom_Sel)==0), AV47TFPrdNom_Sel, GXv_char5) ;
      wcwcompro_impl.this.GXt_char15 = GXv_char5[0] ;
      GXt_char16 = "" ;
      GXv_char4[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFEntLotN_Sel)==0), AV62TFEntLotN_Sel, GXv_char4) ;
      wcwcompro_impl.this.GXt_char16 = GXv_char4[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFEntRemNro_Sel)==0), AV65TFEntRemNro_Sel, GXv_char18) ;
      wcwcompro_impl.this.GXt_char17 = GXv_char18[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char3+"|"+GXt_char15+"||||||"+GXt_char16+"|"+GXt_char17+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFPrdNum)==0), AV43TFPrdNum, GXv_char18) ;
      wcwcompro_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char16 = "" ;
      GXv_char6[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFPrdNom)==0), AV46TFPrdNom, GXv_char6) ;
      wcwcompro_impl.this.GXt_char16 = GXv_char6[0] ;
      GXt_char15 = "" ;
      GXv_char5[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFEntLotN)==0), AV61TFEntLotN, GXv_char5) ;
      wcwcompro_impl.this.GXt_char15 = GXv_char5[0] ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFEntRemNro)==0), AV64TFEntRemNro, GXv_char4) ;
      wcwcompro_impl.this.GXt_char3 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV35TFEntPrvNum) ? "" : GXutil.str( AV35TFEntPrvNum, 6, 0))+"||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFEntFecEnt)) ? "" : localUtil.dtoc( AV38TFEntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char17+"|"+GXt_char16+"|"+((0==AV49TFPedCod) ? "" : GXutil.str( AV49TFPedCod, 8, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFEntUniEnt)==0) ? "" : GXutil.str( AV52TFEntUniEnt, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFEntPre)==0) ? "" : GXutil.str( AV55TFEntPre, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFPedValFormula)==0) ? "" : GXutil.str( AV58TFPedValFormula, 12, 2))+"|"+GXt_char15+"|"+GXt_char3+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV36TFEntPrvNum_To) ? "" : GXutil.str( AV36TFEntPrvNum_To, 6, 0))+"|||||"+((0==AV50TFPedCod_To) ? "" : GXutil.str( AV50TFPedCod_To, 8, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFEntUniEnt_To)==0) ? "" : GXutil.str( AV53TFEntUniEnt_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFEntPre_To)==0) ? "" : GXutil.str( AV56TFEntPre_To, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPedValFormula_To)==0) ? "" : GXutil.str( AV59TFPedValFormula_To, 12, 2))+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV30Session.getValue(AV146Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV18OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV19OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV74FilterFullText)==0), (short)(0), AV74FilterFullText, "") ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFENTPRVNUM", "", !((0==AV35TFEntPrvNum)&&(0==AV36TFEntPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFEntPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV36TFEntPrvNum_To, 6, 0))) ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFENTFECENT", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFEntFecEnt)), (short)(0), GXutil.trim( localUtil.dtoc( AV38TFEntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFPRDNUM", "", !(GXutil.strcmp("", AV43TFPrdNum)==0), (short)(0), AV43TFPrdNum, "", !(GXutil.strcmp("", AV44TFPrdNum_Sel)==0), AV44TFPrdNum_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFPRDNOM", "", !(GXutil.strcmp("", AV46TFPrdNom)==0), (short)(0), AV46TFPrdNom, "", !(GXutil.strcmp("", AV47TFPrdNom_Sel)==0), AV47TFPrdNom_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFPEDCOD", "", !((0==AV49TFPedCod)&&(0==AV50TFPedCod_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFPedCod, 8, 0)), GXutil.trim( GXutil.str( AV50TFPedCod_To, 8, 0))) ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFENTUNIENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFEntUniEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFEntUniEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFEntUniEnt, 9, 2)), GXutil.trim( GXutil.str( AV53TFEntUniEnt_To, 9, 2))) ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFENTPRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFEntPre)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFEntPre_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV55TFEntPre, 14, 5)), GXutil.trim( GXutil.str( AV56TFEntPre_To, 14, 5))) ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFPEDVALFORMULA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFPedValFormula)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPedValFormula_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV58TFPedValFormula, 12, 2)), GXutil.trim( GXutil.str( AV59TFPedValFormula_To, 12, 2))) ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFENTLOTN", "", !(GXutil.strcmp("", AV61TFEntLotN)==0), (short)(0), AV61TFEntLotN, "", !(GXutil.strcmp("", AV62TFEntLotN_Sel)==0), AV62TFEntLotN_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFENTREMNRO", "", !(GXutil.strcmp("", AV64TFEntRemNro)==0), (short)(0), AV64TFEntRemNro, "", !(GXutil.strcmp("", AV65TFEntRemNro_Sel)==0), AV65TFEntRemNro_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState19[0] ;
      if ( ! (GXutil.strcmp("", AV71EmprCod)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV71EmprCod );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV5EntFecEnt)) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ENTFECENT" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV5EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6EntFecEnt_to)) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ENTFECENT_TO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV6EntFecEnt_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV9PrvNum) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUM" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9PrvNum, 6, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV10PrvNum_to) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUM_TO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10PrvNum_to, 6, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7PrdNum)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7PrdNum );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8PrdNum_to)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM_TO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8PrdNum_to );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      AV16GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV16GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV146Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV14TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV146Pgmname );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ENTALM" );
      AV30Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_Y22( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV31ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_Y22( true) ;
      }
      else
      {
         wb_table2_30_Y22( false) ;
      }
      return  ;
   }

   public void wb_table2_30_Y22e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_Y22e( true) ;
      }
      else
      {
         wb_table1_25_Y22e( false) ;
      }
   }

   public void wb_table2_30_Y22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV74FilterFullText, GXutil.rtrim( localUtil.format( AV74FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCWcompro.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_Y22e( true) ;
      }
      else
      {
         wb_table2_30_Y22e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV71EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71EmprCod", AV71EmprCod);
      AV5EntFecEnt = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EntFecEnt", localUtil.format(AV5EntFecEnt, "99/99/99"));
      AV6EntFecEnt_to = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EntFecEnt_to", localUtil.format(AV6EntFecEnt_to, "99/99/99"));
      AV9PrvNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9PrvNum), 6, 0));
      AV10PrvNum_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10PrvNum_to), 6, 0));
      AV7PrdNum = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNum", AV7PrdNum);
      AV8PrdNum_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNum_to", AV8PrdNum_to);
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
      paY22( ) ;
      wsY22( ) ;
      weY22( ) ;
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
      sCtrlAV71EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV5EntFecEnt = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV6EntFecEnt_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV9PrvNum = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV10PrvNum_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV7PrdNum = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV8PrdNum_to = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paY22( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcwcompro", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paY22( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV71EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71EmprCod", AV71EmprCod);
         AV5EntFecEnt = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EntFecEnt", localUtil.format(AV5EntFecEnt, "99/99/99"));
         AV6EntFecEnt_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EntFecEnt_to", localUtil.format(AV6EntFecEnt_to, "99/99/99"));
         AV9PrvNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9PrvNum), 6, 0));
         AV10PrvNum_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10PrvNum_to), 6, 0));
         AV7PrdNum = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNum", AV7PrdNum);
         AV8PrdNum_to = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNum_to", AV8PrdNum_to);
      }
      wcpOAV71EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV71EmprCod") ;
      wcpOAV5EntFecEnt = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV5EntFecEnt"), 0) ;
      wcpOAV6EntFecEnt_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6EntFecEnt_to"), 0) ;
      wcpOAV9PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10PrvNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10PrvNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7PrdNum = httpContext.cgiGet( sPrefix+"wcpOAV7PrdNum") ;
      wcpOAV8PrdNum_to = httpContext.cgiGet( sPrefix+"wcpOAV8PrdNum_to") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV71EmprCod, wcpOAV71EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV5EntFecEnt), GXutil.resetTime(wcpOAV5EntFecEnt)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV6EntFecEnt_to), GXutil.resetTime(wcpOAV6EntFecEnt_to)) ) || ( AV9PrvNum != wcpOAV9PrvNum ) || ( AV10PrvNum_to != wcpOAV10PrvNum_to ) || ( GXutil.strcmp(AV7PrdNum, wcpOAV7PrdNum) != 0 ) || ( GXutil.strcmp(AV8PrdNum_to, wcpOAV8PrdNum_to) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV71EmprCod = AV71EmprCod ;
      wcpOAV5EntFecEnt = AV5EntFecEnt ;
      wcpOAV6EntFecEnt_to = AV6EntFecEnt_to ;
      wcpOAV9PrvNum = AV9PrvNum ;
      wcpOAV10PrvNum_to = AV10PrvNum_to ;
      wcpOAV7PrdNum = AV7PrdNum ;
      wcpOAV8PrdNum_to = AV8PrdNum_to ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV71EmprCod = httpContext.cgiGet( sPrefix+"AV71EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV71EmprCod) > 0 )
      {
         AV71EmprCod = httpContext.cgiGet( sCtrlAV71EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71EmprCod", AV71EmprCod);
      }
      else
      {
         AV71EmprCod = httpContext.cgiGet( sPrefix+"AV71EmprCod_PARM") ;
      }
      sCtrlAV5EntFecEnt = httpContext.cgiGet( sPrefix+"AV5EntFecEnt_CTRL") ;
      if ( GXutil.len( sCtrlAV5EntFecEnt) > 0 )
      {
         AV5EntFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV5EntFecEnt), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EntFecEnt", localUtil.format(AV5EntFecEnt, "99/99/99"));
      }
      else
      {
         AV5EntFecEnt = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV5EntFecEnt_PARM"), 0) ;
      }
      sCtrlAV6EntFecEnt_to = httpContext.cgiGet( sPrefix+"AV6EntFecEnt_to_CTRL") ;
      if ( GXutil.len( sCtrlAV6EntFecEnt_to) > 0 )
      {
         AV6EntFecEnt_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV6EntFecEnt_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6EntFecEnt_to", localUtil.format(AV6EntFecEnt_to, "99/99/99"));
      }
      else
      {
         AV6EntFecEnt_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV6EntFecEnt_to_PARM"), 0) ;
      }
      sCtrlAV9PrvNum = httpContext.cgiGet( sPrefix+"AV9PrvNum_CTRL") ;
      if ( GXutil.len( sCtrlAV9PrvNum) > 0 )
      {
         AV9PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9PrvNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9PrvNum), 6, 0));
      }
      else
      {
         AV9PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9PrvNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10PrvNum_to = httpContext.cgiGet( sPrefix+"AV10PrvNum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV10PrvNum_to) > 0 )
      {
         AV10PrvNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10PrvNum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10PrvNum_to), 6, 0));
      }
      else
      {
         AV10PrvNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10PrvNum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7PrdNum = httpContext.cgiGet( sPrefix+"AV7PrdNum_CTRL") ;
      if ( GXutil.len( sCtrlAV7PrdNum) > 0 )
      {
         AV7PrdNum = httpContext.cgiGet( sCtrlAV7PrdNum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNum", AV7PrdNum);
      }
      else
      {
         AV7PrdNum = httpContext.cgiGet( sPrefix+"AV7PrdNum_PARM") ;
      }
      sCtrlAV8PrdNum_to = httpContext.cgiGet( sPrefix+"AV8PrdNum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV8PrdNum_to) > 0 )
      {
         AV8PrdNum_to = httpContext.cgiGet( sCtrlAV8PrdNum_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrdNum_to", AV8PrdNum_to);
      }
      else
      {
         AV8PrdNum_to = httpContext.cgiGet( sPrefix+"AV8PrdNum_to_PARM") ;
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
      paY22( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsY22( ) ;
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
      wsY22( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71EmprCod_PARM", GXutil.rtrim( AV71EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71EmprCod_CTRL", GXutil.rtrim( sCtrlAV71EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EntFecEnt_PARM", localUtil.dtoc( AV5EntFecEnt, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5EntFecEnt)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EntFecEnt_CTRL", GXutil.rtrim( sCtrlAV5EntFecEnt));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6EntFecEnt_to_PARM", localUtil.dtoc( AV6EntFecEnt_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6EntFecEnt_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6EntFecEnt_to_CTRL", GXutil.rtrim( sCtrlAV6EntFecEnt_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9PrvNum_PARM", GXutil.ltrim( localUtil.ntoc( AV9PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9PrvNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9PrvNum_CTRL", GXutil.rtrim( sCtrlAV9PrvNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10PrvNum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV10PrvNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10PrvNum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10PrvNum_to_CTRL", GXutil.rtrim( sCtrlAV10PrvNum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7PrdNum_PARM", GXutil.rtrim( AV7PrdNum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7PrdNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7PrdNum_CTRL", GXutil.rtrim( sCtrlAV7PrdNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrdNum_to_PARM", GXutil.rtrim( AV8PrdNum_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8PrdNum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrdNum_to_CTRL", GXutil.rtrim( sCtrlAV8PrdNum_to));
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
      weY22( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115564849", true, true);
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
      httpContext.AddJavascriptSource("wcwcompro.js", "?202682115564849", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtEntPrvNum_Internalname = sPrefix+"ENTPRVNUM_"+sGXsfl_43_idx ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM_"+sGXsfl_43_idx ;
      edtEntFecEnt_Internalname = sPrefix+"ENTFECENT_"+sGXsfl_43_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_43_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_43_idx ;
      edtPedCod_Internalname = sPrefix+"PEDCOD_"+sGXsfl_43_idx ;
      edtavEntnalbar_Internalname = sPrefix+"vENTNALBAR_"+sGXsfl_43_idx ;
      edtEntUniEnt_Internalname = sPrefix+"ENTUNIENT_"+sGXsfl_43_idx ;
      edtEntPre_Internalname = sPrefix+"ENTPRE_"+sGXsfl_43_idx ;
      edtPedValForm_Internalname = sPrefix+"PEDVALFORM_"+sGXsfl_43_idx ;
      edtEntLotN_Internalname = sPrefix+"ENTLOTN_"+sGXsfl_43_idx ;
      edtEntRemNro_Internalname = sPrefix+"ENTREMNRO_"+sGXsfl_43_idx ;
      edtavObservaciones_Internalname = sPrefix+"vOBSERVACIONES_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtEntPrvNum_Internalname = sPrefix+"ENTPRVNUM_"+sGXsfl_43_fel_idx ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM_"+sGXsfl_43_fel_idx ;
      edtEntFecEnt_Internalname = sPrefix+"ENTFECENT_"+sGXsfl_43_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_43_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_43_fel_idx ;
      edtPedCod_Internalname = sPrefix+"PEDCOD_"+sGXsfl_43_fel_idx ;
      edtavEntnalbar_Internalname = sPrefix+"vENTNALBAR_"+sGXsfl_43_fel_idx ;
      edtEntUniEnt_Internalname = sPrefix+"ENTUNIENT_"+sGXsfl_43_fel_idx ;
      edtEntPre_Internalname = sPrefix+"ENTPRE_"+sGXsfl_43_fel_idx ;
      edtPedValForm_Internalname = sPrefix+"PEDVALFORM_"+sGXsfl_43_fel_idx ;
      edtEntLotN_Internalname = sPrefix+"ENTLOTN_"+sGXsfl_43_fel_idx ;
      edtEntRemNro_Internalname = sPrefix+"ENTREMNRO_"+sGXsfl_43_fel_idx ;
      edtavObservaciones_Internalname = sPrefix+"vOBSERVACIONES_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wbY20( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEntPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6156EntPrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavPrvnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrvnom_Internalname,GXutil.rtrim( AV21PrvNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrvnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPrvnom_Visible),Integer.valueOf(edtavPrvnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEntFecEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntFecEnt_Internalname,localUtil.format(A415EntFecEnt, "99/99/99"),localUtil.format( A415EntFecEnt, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntFecEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCod_Internalname,GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPedCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEntnalbar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntnalbar_Internalname,GXutil.rtrim( AV22EntNAlbar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntnalbar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavEntnalbar_Visible),Integer.valueOf(edtavEntnalbar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEntUniEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A418EntUniEnt, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntUniEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEntPre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntPre_Internalname,GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A417EntPre, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntPre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedValForm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedValForm_Internalname,GXutil.ltrim( localUtil.ntoc( A13787PedValForm, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13787PedValForm, "ZZZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedValForm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPedValForm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEntLotN_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntLotN_Internalname,GXutil.rtrim( A5686EntLotN),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntLotN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntLotN_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEntRemNro_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEntRemNro_Internalname,GXutil.rtrim( A10187EntRemNro),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEntRemNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEntRemNro_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavObservaciones_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObservaciones_Internalname,GXutil.rtrim( AV23Observaciones),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavObservaciones_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavObservaciones_Visible),Integer.valueOf(edtavObservaciones_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesY22( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPrvnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntFecEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEntnalbar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Doc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntUniEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntPre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedValForm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntLotN_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEntRemNro_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Doc Int", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavObservaciones_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6156EntPrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV21PrvNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrvnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPrvnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A415EntFecEnt, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntFecEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV22EntNAlbar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntnalbar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEntnalbar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A418EntUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntUniEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A417EntPre, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntPre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13787PedValForm, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedValForm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5686EntLotN));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntLotN_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10187EntRemNro));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEntRemNro_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV23Observaciones));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObservaciones_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavObservaciones_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtEntPrvNum_Internalname = sPrefix+"ENTPRVNUM" ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM" ;
      edtEntFecEnt_Internalname = sPrefix+"ENTFECENT" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtPedCod_Internalname = sPrefix+"PEDCOD" ;
      edtavEntnalbar_Internalname = sPrefix+"vENTNALBAR" ;
      edtEntUniEnt_Internalname = sPrefix+"ENTUNIENT" ;
      edtEntPre_Internalname = sPrefix+"ENTPRE" ;
      edtPedValForm_Internalname = sPrefix+"PEDVALFORM" ;
      edtEntLotN_Internalname = sPrefix+"ENTLOTN" ;
      edtEntRemNro_Internalname = sPrefix+"ENTREMNRO" ;
      edtavObservaciones_Internalname = sPrefix+"vOBSERVACIONES" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_entfecentauxdate_Internalname = sPrefix+"vDDO_ENTFECENTAUXDATE" ;
      divDdo_entfecentauxdates_Internalname = sPrefix+"DDO_ENTFECENTAUXDATES" ;
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
      edtavObservaciones_Jsonclick = "" ;
      edtavObservaciones_Enabled = 0 ;
      edtEntRemNro_Jsonclick = "" ;
      edtEntLotN_Jsonclick = "" ;
      edtPedValForm_Jsonclick = "" ;
      edtEntPre_Jsonclick = "" ;
      edtEntUniEnt_Jsonclick = "" ;
      edtavEntnalbar_Jsonclick = "" ;
      edtavEntnalbar_Enabled = 0 ;
      edtPedCod_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtEntFecEnt_Jsonclick = "" ;
      edtavPrvnom_Jsonclick = "" ;
      edtavPrvnom_Enabled = 0 ;
      edtEntPrvNum_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavObservaciones_Visible = -1 ;
      edtEntRemNro_Visible = -1 ;
      edtEntLotN_Visible = -1 ;
      edtPedValForm_Visible = -1 ;
      edtEntPre_Visible = -1 ;
      edtEntUniEnt_Visible = -1 ;
      edtavEntnalbar_Visible = -1 ;
      edtPedCod_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      edtEntFecEnt_Visible = -1 ;
      edtavPrvnom_Visible = -1 ;
      edtEntPrvNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_entfecentauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "WCWcomproGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic||||||Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "|||T|T||||||T|T|" ;
      Ddo_grid_Filterisrange = "T|||||T||T|T|T|||" ;
      Ddo_grid_Filtertype = "Numeric||Date|Character|Character|Numeric||Numeric|Numeric|Numeric|Character|Character|" ;
      Ddo_grid_Includefilter = "T||T|T|T|T||T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T||T|T|T|T||T|T||T|T|" ;
      Ddo_grid_Columnssortvalues = "1||2|3|4|5||6|7||8|9|" ;
      Ddo_grid_Columnids = "0:EntPrvNum|1:PrvNom|2:EntFecEnt|3:PrdNum|4:PrdNom|5:PedCod|6:EntNAlbar|7:EntUniEnt|8:EntPre|9:PedValFormula|10:EntLotN|11:EntRemNro|12:Observaciones" ;
      Ddo_grid_Gridinternalname = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A2501PedObsLin',fld:'PEDOBSLIN',pic:'Z9'},{av:'A2502PedObsTxt',fld:'PEDOBSTXT',pic:''},{av:'sPrefix'},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV6EntFecEnt_to',fld:'vENTFECENT_TO',pic:''},{av:'AV9PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV7PrdNum',fld:'vPRDNUM',pic:''},{av:'AV8PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV43TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV44TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV47TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV53TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV55TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV56TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV58TFPedValFormula',fld:'vTFPEDVALFORMULA',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedValFormula_To',fld:'vTFPEDVALFORMULA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV61TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV62TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV64TFEntRemNro',fld:'vTFENTREMNRO',pic:''},{av:'AV65TFEntRemNro_Sel',fld:'vTFENTREMNRO_SEL',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV118Nprov',fld:'vNPROV',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEntPrvNum_Visible',ctrl:'ENTPRVNUM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtEntFecEnt_Visible',ctrl:'ENTFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtavEntnalbar_Visible',ctrl:'vENTNALBAR',prop:'Visible'},{av:'edtEntUniEnt_Visible',ctrl:'ENTUNIENT',prop:'Visible'},{av:'edtEntPre_Visible',ctrl:'ENTPRE',prop:'Visible'},{av:'edtPedValForm_Visible',ctrl:'PEDVALFORM',prop:'Visible'},{av:'edtEntLotN_Visible',ctrl:'ENTLOTN',prop:'Visible'},{av:'edtEntRemNro_Visible',ctrl:'ENTREMNRO',prop:'Visible'},{av:'edtavObservaciones_Visible',ctrl:'vOBSERVACIONES',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12Y22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV6EntFecEnt_to',fld:'vENTFECENT_TO',pic:''},{av:'AV9PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV7PrdNum',fld:'vPRDNUM',pic:''},{av:'AV8PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV43TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV44TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV47TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV53TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV55TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV56TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV58TFPedValFormula',fld:'vTFPEDVALFORMULA',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedValFormula_To',fld:'vTFPEDVALFORMULA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV61TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV62TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV64TFEntRemNro',fld:'vTFENTREMNRO',pic:''},{av:'AV65TFEntRemNro_Sel',fld:'vTFENTREMNRO_SEL',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A2501PedObsLin',fld:'PEDOBSLIN',pic:'Z9'},{av:'A2502PedObsTxt',fld:'PEDOBSTXT',pic:''},{av:'AV118Nprov',fld:'vNPROV',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13Y22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV6EntFecEnt_to',fld:'vENTFECENT_TO',pic:''},{av:'AV9PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV7PrdNum',fld:'vPRDNUM',pic:''},{av:'AV8PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV43TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV44TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV47TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV53TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV55TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV56TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV58TFPedValFormula',fld:'vTFPEDVALFORMULA',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedValFormula_To',fld:'vTFPEDVALFORMULA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV61TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV62TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV64TFEntRemNro',fld:'vTFENTREMNRO',pic:''},{av:'AV65TFEntRemNro_Sel',fld:'vTFENTREMNRO_SEL',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A2501PedObsLin',fld:'PEDOBSLIN',pic:'Z9'},{av:'A2502PedObsTxt',fld:'PEDOBSTXT',pic:''},{av:'AV118Nprov',fld:'vNPROV',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14Y22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV6EntFecEnt_to',fld:'vENTFECENT_TO',pic:''},{av:'AV9PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV7PrdNum',fld:'vPRDNUM',pic:''},{av:'AV8PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV43TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV44TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV47TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV53TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV55TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV56TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV58TFPedValFormula',fld:'vTFPEDVALFORMULA',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedValFormula_To',fld:'vTFPEDVALFORMULA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV61TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV62TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV64TFEntRemNro',fld:'vTFENTREMNRO',pic:''},{av:'AV65TFEntRemNro_Sel',fld:'vTFENTREMNRO_SEL',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A2501PedObsLin',fld:'PEDOBSLIN',pic:'Z9'},{av:'A2502PedObsTxt',fld:'PEDOBSTXT',pic:''},{av:'AV118Nprov',fld:'vNPROV',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64TFEntRemNro',fld:'vTFENTREMNRO',pic:''},{av:'AV65TFEntRemNro_Sel',fld:'vTFENTREMNRO_SEL',pic:''},{av:'AV61TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV62TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV58TFPedValFormula',fld:'vTFPEDVALFORMULA',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedValFormula_To',fld:'vTFPEDVALFORMULA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV55TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV56TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV52TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV53TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV46TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV47TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV43TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV44TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV38TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21Y22',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6156EntPrvNum',fld:'ENTPRVNUM',pic:'ZZZZZ9'},{av:'A11Albaran',fld:'ALBARAN',pic:''},{av:'A12857EntNAlbar',fld:'ENTNALBAR',pic:''},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A2501PedObsLin',fld:'PEDOBSLIN',pic:'Z9'},{av:'A2502PedObsTxt',fld:'PEDOBSTXT',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV21PrvNom',fld:'vPRVNOM',pic:''},{av:'AV22EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV23Observaciones',fld:'vOBSERVACIONES',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15Y22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV6EntFecEnt_to',fld:'vENTFECENT_TO',pic:''},{av:'AV9PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV7PrdNum',fld:'vPRDNUM',pic:''},{av:'AV8PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV43TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV44TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV47TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV53TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV55TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV56TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV58TFPedValFormula',fld:'vTFPEDVALFORMULA',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedValFormula_To',fld:'vTFPEDVALFORMULA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV61TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV62TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV64TFEntRemNro',fld:'vTFENTREMNRO',pic:''},{av:'AV65TFEntRemNro_Sel',fld:'vTFENTREMNRO_SEL',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A2501PedObsLin',fld:'PEDOBSLIN',pic:'Z9'},{av:'A2502PedObsTxt',fld:'PEDOBSTXT',pic:''},{av:'AV118Nprov',fld:'vNPROV',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEntPrvNum_Visible',ctrl:'ENTPRVNUM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtEntFecEnt_Visible',ctrl:'ENTFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtavEntnalbar_Visible',ctrl:'vENTNALBAR',prop:'Visible'},{av:'edtEntUniEnt_Visible',ctrl:'ENTUNIENT',prop:'Visible'},{av:'edtEntPre_Visible',ctrl:'ENTPRE',prop:'Visible'},{av:'edtPedValForm_Visible',ctrl:'PEDVALFORM',prop:'Visible'},{av:'edtEntLotN_Visible',ctrl:'ENTLOTN',prop:'Visible'},{av:'edtEntRemNro_Visible',ctrl:'ENTREMNRO',prop:'Visible'},{av:'edtavObservaciones_Visible',ctrl:'vOBSERVACIONES',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11Y22',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV6EntFecEnt_to',fld:'vENTFECENT_TO',pic:''},{av:'AV9PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV7PrdNum',fld:'vPRDNUM',pic:''},{av:'AV8PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV43TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV44TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV47TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV53TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV55TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV56TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV58TFPedValFormula',fld:'vTFPEDVALFORMULA',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedValFormula_To',fld:'vTFPEDVALFORMULA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV61TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV62TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV64TFEntRemNro',fld:'vTFENTREMNRO',pic:''},{av:'AV65TFEntRemNro_Sel',fld:'vTFENTREMNRO_SEL',pic:''},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A2501PedObsLin',fld:'PEDOBSLIN',pic:'Z9'},{av:'A2502PedObsTxt',fld:'PEDOBSTXT',pic:''},{av:'AV118Nprov',fld:'vNPROV',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV33ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV35TFEntPrvNum',fld:'vTFENTPRVNUM',pic:'ZZZZZ9'},{av:'AV36TFEntPrvNum_To',fld:'vTFENTPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFEntFecEnt',fld:'vTFENTFECENT',pic:''},{av:'AV43TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV44TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV47TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFEntUniEnt',fld:'vTFENTUNIENT',pic:'ZZZZZ9.99'},{av:'AV53TFEntUniEnt_To',fld:'vTFENTUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV55TFEntPre',fld:'vTFENTPRE',pic:'ZZZZZZZ9.999'},{av:'AV56TFEntPre_To',fld:'vTFENTPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV58TFPedValFormula',fld:'vTFPEDVALFORMULA',pic:'ZZZZZZZZ9.99'},{av:'AV59TFPedValFormula_To',fld:'vTFPEDVALFORMULA_TO',pic:'ZZZZZZZZ9.99'},{av:'AV61TFEntLotN',fld:'vTFENTLOTN',pic:''},{av:'AV62TFEntLotN_Sel',fld:'vTFENTLOTN_SEL',pic:''},{av:'AV64TFEntRemNro',fld:'vTFENTREMNRO',pic:''},{av:'AV65TFEntRemNro_Sel',fld:'vTFENTREMNRO_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV28ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEntPrvNum_Visible',ctrl:'ENTPRVNUM',prop:'Visible'},{av:'edtavPrvnom_Visible',ctrl:'vPRVNOM',prop:'Visible'},{av:'edtEntFecEnt_Visible',ctrl:'ENTFECENT',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtavEntnalbar_Visible',ctrl:'vENTNALBAR',prop:'Visible'},{av:'edtEntUniEnt_Visible',ctrl:'ENTUNIENT',prop:'Visible'},{av:'edtEntPre_Visible',ctrl:'ENTPRE',prop:'Visible'},{av:'edtPedValForm_Visible',ctrl:'PEDVALFORM',prop:'Visible'},{av:'edtEntLotN_Visible',ctrl:'ENTLOTN',prop:'Visible'},{av:'edtEntRemNro_Visible',ctrl:'ENTREMNRO',prop:'Visible'},{av:'edtavObservaciones_Visible',ctrl:'vOBSERVACIONES',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16Y22',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18Y22',iparms:[{av:'AV118Nprov',fld:'vNPROV',pic:'ZZZ9',hsh:true},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV119ImpCod',fld:'vIMPCOD',pic:''},{av:'AV7PrdNum',fld:'vPRDNUM',pic:''},{av:'AV8PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV9PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV10PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV5EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV6EntFecEnt_to',fld:'vENTFECENT_TO',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'AV6EntFecEnt_to',fld:'vENTFECENT_TO',pic:''},{av:'AV5EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV10PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV9PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV8PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV7PrdNum',fld:'vPRDNUM',pic:''},{av:'AV119ImpCod',fld:'vIMPCOD',pic:''},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e17Y22',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[]");
      setEventMetadata("VALID_PEDCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Observaciones',iparms:[]");
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
      wcpOAV71EmprCod = "" ;
      wcpOAV5EntFecEnt = GXutil.nullDate() ;
      wcpOAV6EntFecEnt_to = GXutil.nullDate() ;
      wcpOAV7PrdNum = "" ;
      wcpOAV8PrdNum_to = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV71EmprCod = "" ;
      AV5EntFecEnt = GXutil.nullDate() ;
      AV6EntFecEnt_to = GXutil.nullDate() ;
      AV7PrdNum = "" ;
      AV8PrdNum_to = "" ;
      AV74FilterFullText = "" ;
      AV28ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV38TFEntFecEnt = GXutil.nullDate() ;
      AV43TFPrdNum = "" ;
      AV44TFPrdNum_Sel = "" ;
      AV46TFPrdNom = "" ;
      AV47TFPrdNom_Sel = "" ;
      AV52TFEntUniEnt = DecimalUtil.ZERO ;
      AV53TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV55TFEntPre = DecimalUtil.ZERO ;
      AV56TFEntPre_To = DecimalUtil.ZERO ;
      AV58TFPedValFormula = DecimalUtil.ZERO ;
      AV59TFPedValFormula_To = DecimalUtil.ZERO ;
      AV61TFEntLotN = "" ;
      AV62TFEntLotN_Sel = "" ;
      AV64TFEntRemNro = "" ;
      AV65TFEntRemNro_Sel = "" ;
      AV146Pgmname = "" ;
      A2502PedObsTxt = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV31ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV67DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A11Albaran = "" ;
      A12857EntNAlbar = "" ;
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV119ImpCod = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV40DDO_EntFecEntAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV21PrvNom = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV22EntNAlbar = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A13787PedValForm = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A10187EntRemNro = "" ;
      AV23Observaciones = "" ;
      scmdbuf = "" ;
      lV125Wcwcomprods_1_filterfulltext = "" ;
      lV129Wcwcomprods_5_tfprdnum = "" ;
      lV131Wcwcomprods_7_tfprdnom = "" ;
      lV141Wcwcomprods_17_tfentlotn = "" ;
      lV143Wcwcomprods_19_tfentremnro = "" ;
      AV125Wcwcomprods_1_filterfulltext = "" ;
      AV128Wcwcomprods_4_tfentfecent = GXutil.nullDate() ;
      AV130Wcwcomprods_6_tfprdnum_sel = "" ;
      AV129Wcwcomprods_5_tfprdnum = "" ;
      AV132Wcwcomprods_8_tfprdnom_sel = "" ;
      AV131Wcwcomprods_7_tfprdnom = "" ;
      AV135Wcwcomprods_11_tfentunient = DecimalUtil.ZERO ;
      AV136Wcwcomprods_12_tfentunient_to = DecimalUtil.ZERO ;
      AV137Wcwcomprods_13_tfentpre = DecimalUtil.ZERO ;
      AV138Wcwcomprods_14_tfentpre_to = DecimalUtil.ZERO ;
      AV139Wcwcomprods_15_tfpedvalformula = DecimalUtil.ZERO ;
      AV140Wcwcomprods_16_tfpedvalformula_to = DecimalUtil.ZERO ;
      AV142Wcwcomprods_18_tfentlotn_sel = "" ;
      AV141Wcwcomprods_17_tfentlotn = "" ;
      AV144Wcwcomprods_20_tfentremnro_sel = "" ;
      AV143Wcwcomprods_19_tfentremnro = "" ;
      H00Y22_A597LinEnt = new short[1] ;
      H00Y22_A658PedCod = new int[1] ;
      H00Y22_n658PedCod = new boolean[] {false} ;
      H00Y22_A396EmprCod = new String[] {""} ;
      H00Y22_A11Albaran = new String[] {""} ;
      H00Y22_A12857EntNAlbar = new String[] {""} ;
      H00Y22_A10187EntRemNro = new String[] {""} ;
      H00Y22_A5686EntLotN = new String[] {""} ;
      H00Y22_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00Y22_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00Y22_A718PrdNom = new String[] {""} ;
      H00Y22_A719PrdNum = new String[] {""} ;
      H00Y22_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00Y22_A6156EntPrvNum = new int[1] ;
      H00Y22_n6156EntPrvNum = new boolean[] {false} ;
      H00Y22_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00Y22_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00Y22_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00Y23_AGRID_nRecordCount = new long[1] ;
      GXv_int2 = new byte[1] ;
      AV122Station = "" ;
      AV123Emprnom = "" ;
      AV124Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV30Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      GXv_int10 = new int[1] ;
      H00Y24_A396EmprCod = new String[] {""} ;
      H00Y24_A658PedCod = new int[1] ;
      H00Y24_n658PedCod = new boolean[] {false} ;
      H00Y24_A2502PedObsTxt = new String[] {""} ;
      H00Y24_A2501PedObsLin = new byte[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV32ManageFiltersXml = "" ;
      AV24ExcelFilename = "" ;
      AV25ErrorMessage = "" ;
      AV27UserCustomValue = "" ;
      AV29ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection[1] ;
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState19 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV71EmprCod = "" ;
      sCtrlAV5EntFecEnt = "" ;
      sCtrlAV6EntFecEnt_to = "" ;
      sCtrlAV9PrvNum = "" ;
      sCtrlAV10PrvNum_to = "" ;
      sCtrlAV7PrdNum = "" ;
      sCtrlAV8PrdNum_to = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcompro__default(),
         new Object[] {
             new Object[] {
            H00Y22_A597LinEnt, H00Y22_A658PedCod, H00Y22_n658PedCod, H00Y22_A396EmprCod, H00Y22_A11Albaran, H00Y22_A12857EntNAlbar, H00Y22_A10187EntRemNro, H00Y22_A5686EntLotN, H00Y22_A417EntPre, H00Y22_A418EntUniEnt,
            H00Y22_A718PrdNom, H00Y22_A719PrdNum, H00Y22_A415EntFecEnt, H00Y22_A6156EntPrvNum, H00Y22_n6156EntPrvNum, H00Y22_A660PedDto, H00Y22_A665PedPre, H00Y22_A669PedUni
            }
            , new Object[] {
            H00Y23_AGRID_nRecordCount
            }
            , new Object[] {
            H00Y24_A396EmprCod, H00Y24_A658PedCod, H00Y24_A2502PedObsTxt, H00Y24_A2501PedObsLin
            }
         }
      );
      AV146Pgmname = "WCWcompro" ;
      /* GeneXus formulas. */
      AV146Pgmname = "WCWcompro" ;
      Gx_err = (short)(0) ;
      edtavPrvnom_Enabled = 0 ;
      edtavEntnalbar_Enabled = 0 ;
      edtavObservaciones_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV33ManageFiltersExecutionStep ;
   private byte A2501PedObsLin ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV18OrderedBy ;
   private short AV118Nprov ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV9PrvNum ;
   private int wcpOAV10PrvNum_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV9PrvNum ;
   private int AV10PrvNum_to ;
   private int nGXsfl_43_idx=1 ;
   private int AV35TFEntPrvNum ;
   private int AV36TFEntPrvNum_To ;
   private int AV49TFPedCod ;
   private int AV50TFPedCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private int subGrid_Islastpage ;
   private int edtavPrvnom_Enabled ;
   private int edtavEntnalbar_Enabled ;
   private int edtavObservaciones_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV126Wcwcomprods_2_tfentprvnum ;
   private int AV127Wcwcomprods_3_tfentprvnum_to ;
   private int AV133Wcwcomprods_9_tfpedcod ;
   private int AV134Wcwcomprods_10_tfpedcod_to ;
   private int edtEntPrvNum_Visible ;
   private int edtavPrvnom_Visible ;
   private int edtEntFecEnt_Visible ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtPedCod_Visible ;
   private int edtavEntnalbar_Visible ;
   private int edtEntUniEnt_Visible ;
   private int edtEntPre_Visible ;
   private int edtPedValForm_Visible ;
   private int edtEntLotN_Visible ;
   private int edtEntRemNro_Visible ;
   private int edtavObservaciones_Visible ;
   private int AV68PageToGo ;
   private int GXv_int10[] ;
   private int AV147GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV69GridCurrentPage ;
   private long AV70GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV52TFEntUniEnt ;
   private java.math.BigDecimal AV53TFEntUniEnt_To ;
   private java.math.BigDecimal AV55TFEntPre ;
   private java.math.BigDecimal AV56TFEntPre_To ;
   private java.math.BigDecimal AV58TFPedValFormula ;
   private java.math.BigDecimal AV59TFPedValFormula_To ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A13787PedValForm ;
   private java.math.BigDecimal AV135Wcwcomprods_11_tfentunient ;
   private java.math.BigDecimal AV136Wcwcomprods_12_tfentunient_to ;
   private java.math.BigDecimal AV137Wcwcomprods_13_tfentpre ;
   private java.math.BigDecimal AV138Wcwcomprods_14_tfentpre_to ;
   private java.math.BigDecimal AV139Wcwcomprods_15_tfpedvalformula ;
   private java.math.BigDecimal AV140Wcwcomprods_16_tfpedvalformula_to ;
   private String wcpOAV71EmprCod ;
   private String wcpOAV7PrdNum ;
   private String wcpOAV8PrdNum_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV71EmprCod ;
   private String AV7PrdNum ;
   private String AV8PrdNum_to ;
   private String sGXsfl_43_idx="0001" ;
   private String AV43TFPrdNum ;
   private String AV44TFPrdNum_Sel ;
   private String AV46TFPrdNom ;
   private String AV47TFPrdNom_Sel ;
   private String AV61TFEntLotN ;
   private String AV62TFEntLotN_Sel ;
   private String AV64TFEntRemNro ;
   private String AV65TFEntRemNro_Sel ;
   private String AV146Pgmname ;
   private String A2502PedObsTxt ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A11Albaran ;
   private String A12857EntNAlbar ;
   private String AV119ImpCod ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
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
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_entfecentauxdates_Internalname ;
   private String edtavDdo_entfecentauxdate_Internalname ;
   private String edtavDdo_entfecentauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtEntPrvNum_Internalname ;
   private String AV21PrvNom ;
   private String edtavPrvnom_Internalname ;
   private String edtEntFecEnt_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtPedCod_Internalname ;
   private String AV22EntNAlbar ;
   private String edtavEntnalbar_Internalname ;
   private String edtEntUniEnt_Internalname ;
   private String edtEntPre_Internalname ;
   private String edtPedValForm_Internalname ;
   private String A5686EntLotN ;
   private String edtEntLotN_Internalname ;
   private String A10187EntRemNro ;
   private String edtEntRemNro_Internalname ;
   private String AV23Observaciones ;
   private String edtavObservaciones_Internalname ;
   private String scmdbuf ;
   private String lV129Wcwcomprods_5_tfprdnum ;
   private String lV131Wcwcomprods_7_tfprdnom ;
   private String lV141Wcwcomprods_17_tfentlotn ;
   private String lV143Wcwcomprods_19_tfentremnro ;
   private String AV130Wcwcomprods_6_tfprdnum_sel ;
   private String AV129Wcwcomprods_5_tfprdnum ;
   private String AV132Wcwcomprods_8_tfprdnom_sel ;
   private String AV131Wcwcomprods_7_tfprdnom ;
   private String AV142Wcwcomprods_18_tfentlotn_sel ;
   private String AV141Wcwcomprods_17_tfentlotn ;
   private String AV144Wcwcomprods_20_tfentremnro_sel ;
   private String AV143Wcwcomprods_19_tfentremnro ;
   private String AV122Station ;
   private String AV123Emprnom ;
   private String AV124Usurcod ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char16 ;
   private String GXv_char6[] ;
   private String GXt_char15 ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV71EmprCod ;
   private String sCtrlAV5EntFecEnt ;
   private String sCtrlAV6EntFecEnt_to ;
   private String sCtrlAV9PrvNum ;
   private String sCtrlAV10PrvNum_to ;
   private String sCtrlAV7PrdNum ;
   private String sCtrlAV8PrdNum_to ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEntPrvNum_Jsonclick ;
   private String edtavPrvnom_Jsonclick ;
   private String edtEntFecEnt_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPedCod_Jsonclick ;
   private String edtavEntnalbar_Jsonclick ;
   private String edtEntUniEnt_Jsonclick ;
   private String edtEntPre_Jsonclick ;
   private String edtPedValForm_Jsonclick ;
   private String edtEntLotN_Jsonclick ;
   private String edtEntRemNro_Jsonclick ;
   private String edtavObservaciones_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV5EntFecEnt ;
   private java.util.Date wcpOAV6EntFecEnt_to ;
   private java.util.Date AV5EntFecEnt ;
   private java.util.Date AV6EntFecEnt_to ;
   private java.util.Date AV38TFEntFecEnt ;
   private java.util.Date AV40DDO_EntFecEntAuxDate ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date AV128Wcwcomprods_4_tfentfecent ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV19OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV26ColumnsSelectorXML ;
   private String AV32ManageFiltersXml ;
   private String AV27UserCustomValue ;
   private String AV74FilterFullText ;
   private String lV125Wcwcomprods_1_filterfulltext ;
   private String AV125Wcwcomprods_1_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private short[] H00Y22_A597LinEnt ;
   private int[] H00Y22_A658PedCod ;
   private boolean[] H00Y22_n658PedCod ;
   private String[] H00Y22_A396EmprCod ;
   private String[] H00Y22_A11Albaran ;
   private String[] H00Y22_A12857EntNAlbar ;
   private String[] H00Y22_A10187EntRemNro ;
   private String[] H00Y22_A5686EntLotN ;
   private java.math.BigDecimal[] H00Y22_A417EntPre ;
   private java.math.BigDecimal[] H00Y22_A418EntUniEnt ;
   private String[] H00Y22_A718PrdNom ;
   private String[] H00Y22_A719PrdNum ;
   private java.util.Date[] H00Y22_A415EntFecEnt ;
   private int[] H00Y22_A6156EntPrvNum ;
   private boolean[] H00Y22_n6156EntPrvNum ;
   private java.math.BigDecimal[] H00Y22_A660PedDto ;
   private java.math.BigDecimal[] H00Y22_A665PedPre ;
   private java.math.BigDecimal[] H00Y22_A669PedUni ;
   private long[] H00Y23_AGRID_nRecordCount ;
   private String[] H00Y24_A396EmprCod ;
   private int[] H00Y24_A658PedCod ;
   private boolean[] H00Y24_n658PedCod ;
   private String[] H00Y24_A2502PedObsTxt ;
   private byte[] H00Y24_A2501PedObsLin ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV31ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item13 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item14[] ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState19[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV67DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class wcwcompro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00Y22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV125Wcwcomprods_1_filterfulltext ,
                                          int AV126Wcwcomprods_2_tfentprvnum ,
                                          int AV127Wcwcomprods_3_tfentprvnum_to ,
                                          java.util.Date AV128Wcwcomprods_4_tfentfecent ,
                                          String AV130Wcwcomprods_6_tfprdnum_sel ,
                                          String AV129Wcwcomprods_5_tfprdnum ,
                                          String AV132Wcwcomprods_8_tfprdnom_sel ,
                                          String AV131Wcwcomprods_7_tfprdnom ,
                                          int AV133Wcwcomprods_9_tfpedcod ,
                                          int AV134Wcwcomprods_10_tfpedcod_to ,
                                          java.math.BigDecimal AV135Wcwcomprods_11_tfentunient ,
                                          java.math.BigDecimal AV136Wcwcomprods_12_tfentunient_to ,
                                          java.math.BigDecimal AV137Wcwcomprods_13_tfentpre ,
                                          java.math.BigDecimal AV138Wcwcomprods_14_tfentpre_to ,
                                          java.math.BigDecimal AV139Wcwcomprods_15_tfpedvalformula ,
                                          java.math.BigDecimal AV140Wcwcomprods_16_tfpedvalformula_to ,
                                          String AV142Wcwcomprods_18_tfentlotn_sel ,
                                          String AV141Wcwcomprods_17_tfentlotn ,
                                          String AV144Wcwcomprods_20_tfentremnro_sel ,
                                          String AV143Wcwcomprods_19_tfentremnro ,
                                          int A6156EntPrvNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.math.BigDecimal A660PedDto ,
                                          String A5686EntLotN ,
                                          String A10187EntRemNro ,
                                          java.util.Date A415EntFecEnt ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          java.util.Date AV5EntFecEnt ,
                                          java.util.Date AV6EntFecEnt_to ,
                                          int AV9PrvNum ,
                                          int AV10PrvNum_to ,
                                          String A11Albaran ,
                                          String AV71EmprCod ,
                                          String AV7PrdNum ,
                                          String A396EmprCod ,
                                          String AV8PrdNum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[40];
      Object[] GXv_Object21 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.LinEnt, T1.PedCod, T1.EmprCod, T1.Albaran, T1.EntNAlbar, T1.EntRemNro, T1.EntLotN, T1.EntPre, T1.EntUniEnt, T2.PrdNom, T1.PrdNum, T1.EntFecEnt, T1.EntPrvNum," ;
      sSelectString += " T3.PedDto, T3.PedPre, T3.PedUni" ;
      sFromString = " FROM ((TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPLPEDID T3 ON T3.EmprCod = T1.EmprCod AND T3.PedCod" ;
      sFromString += " = T1.PedCod AND T3.PrdNum = T1.PrdNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'INV')");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'REC')");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV125Wcwcomprods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2),'999999990.99'), 2) like '%' || ?) or ( UPPER(T1.EntLotN) like '%' || UPPER(?)) or ( UPPER(T1.EntRemNro) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
         GXv_int20[8] = (byte)(1) ;
         GXv_int20[9] = (byte)(1) ;
         GXv_int20[10] = (byte)(1) ;
         GXv_int20[11] = (byte)(1) ;
         GXv_int20[12] = (byte)(1) ;
         GXv_int20[13] = (byte)(1) ;
         GXv_int20[14] = (byte)(1) ;
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (0==AV126Wcwcomprods_2_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (0==AV127Wcwcomprods_3_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128Wcwcomprods_4_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wcwcomprods_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcwcomprods_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcwcomprods_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Wcwcomprods_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcwcomprods_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Wcwcomprods_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Wcwcomprods_9_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (0==AV134Wcwcomprods_10_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Wcwcomprods_11_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Wcwcomprods_12_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Wcwcomprods_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Wcwcomprods_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Wcwcomprods_15_tfpedvalformula)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) >= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Wcwcomprods_16_tfpedvalformula_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) <= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Wcwcomprods_18_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV141Wcwcomprods_17_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Wcwcomprods_18_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntLotN = ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Wcwcomprods_20_tfentremnro_sel)==0) && ( ! (GXutil.strcmp("", AV143Wcwcomprods_19_tfentremnro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntRemNro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Wcwcomprods_20_tfentremnro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntRemNro = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntPrvNum" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntPrvNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntFecEnt" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntFecEnt DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntUniEnt" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntUniEnt DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntPre" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntPre DESC" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntLotN" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntLotN DESC" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EntRemNro" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EntRemNro DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrdNum, T1.LinEnt" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_H00Y23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV125Wcwcomprods_1_filterfulltext ,
                                          int AV126Wcwcomprods_2_tfentprvnum ,
                                          int AV127Wcwcomprods_3_tfentprvnum_to ,
                                          java.util.Date AV128Wcwcomprods_4_tfentfecent ,
                                          String AV130Wcwcomprods_6_tfprdnum_sel ,
                                          String AV129Wcwcomprods_5_tfprdnum ,
                                          String AV132Wcwcomprods_8_tfprdnom_sel ,
                                          String AV131Wcwcomprods_7_tfprdnom ,
                                          int AV133Wcwcomprods_9_tfpedcod ,
                                          int AV134Wcwcomprods_10_tfpedcod_to ,
                                          java.math.BigDecimal AV135Wcwcomprods_11_tfentunient ,
                                          java.math.BigDecimal AV136Wcwcomprods_12_tfentunient_to ,
                                          java.math.BigDecimal AV137Wcwcomprods_13_tfentpre ,
                                          java.math.BigDecimal AV138Wcwcomprods_14_tfentpre_to ,
                                          java.math.BigDecimal AV139Wcwcomprods_15_tfpedvalformula ,
                                          java.math.BigDecimal AV140Wcwcomprods_16_tfpedvalformula_to ,
                                          String AV142Wcwcomprods_18_tfentlotn_sel ,
                                          String AV141Wcwcomprods_17_tfentlotn ,
                                          String AV144Wcwcomprods_20_tfentremnro_sel ,
                                          String AV143Wcwcomprods_19_tfentremnro ,
                                          int A6156EntPrvNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.math.BigDecimal A660PedDto ,
                                          String A5686EntLotN ,
                                          String A10187EntRemNro ,
                                          java.util.Date A415EntFecEnt ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          java.util.Date AV5EntFecEnt ,
                                          java.util.Date AV6EntFecEnt_to ,
                                          int AV9PrvNum ,
                                          int AV10PrvNum_to ,
                                          String A11Albaran ,
                                          String AV71EmprCod ,
                                          String AV7PrdNum ,
                                          String A396EmprCod ,
                                          String AV8PrdNum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[35];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPLPEDID T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PedCod = T1.PedCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'INV')");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'REC')");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV125Wcwcomprods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2),'999999990.99'), 2) like '%' || ?) or ( UPPER(T1.EntLotN) like '%' || UPPER(?)) or ( UPPER(T1.EntRemNro) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
         GXv_int22[8] = (byte)(1) ;
         GXv_int22[9] = (byte)(1) ;
         GXv_int22[10] = (byte)(1) ;
         GXv_int22[11] = (byte)(1) ;
         GXv_int22[12] = (byte)(1) ;
         GXv_int22[13] = (byte)(1) ;
         GXv_int22[14] = (byte)(1) ;
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (0==AV126Wcwcomprods_2_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (0==AV127Wcwcomprods_3_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128Wcwcomprods_4_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wcwcomprods_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcwcomprods_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcwcomprods_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Wcwcomprods_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcwcomprods_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Wcwcomprods_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (0==AV133Wcwcomprods_9_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( ! (0==AV134Wcwcomprods_10_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Wcwcomprods_11_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Wcwcomprods_12_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Wcwcomprods_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Wcwcomprods_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Wcwcomprods_15_tfpedvalformula)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) >= ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Wcwcomprods_16_tfpedvalformula_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) <= ?)");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Wcwcomprods_18_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV141Wcwcomprods_17_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Wcwcomprods_18_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntLotN = ?)");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Wcwcomprods_20_tfentremnro_sel)==0) && ( ! (GXutil.strcmp("", AV143Wcwcomprods_19_tfentremnro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntRemNro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Wcwcomprods_20_tfentremnro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntRemNro = ?)");
      }
      else
      {
         GXv_int22[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
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
      else if ( ( AV18OrderedBy == 9 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_H00Y22(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Boolean) dynConstraints[33]).booleanValue() , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 1 :
                  return conditional_H00Y23(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Boolean) dynConstraints[33]).booleanValue() , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00Y22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00Y23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00Y24", "SELECT EmprCod, PedCod, PedObsTxt, PedObsLin FROM TXPOBSPED WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod, PedObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getString(6, 12);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 12);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 12);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 12);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 12);
               }
               return;
            case 2 :
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
      }
   }

}

